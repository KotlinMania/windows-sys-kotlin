// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CloseTrace(tracehandle : PROCESSTRACE_HANDLE) -> super::super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn ControlTraceA(tracehandle : CONTROLTRACE_HANDLE, instancename : windows_sys::core::PCSTR, properties : *mut EVENT_TRACE_PROPERTIES, controlcode : EVENT_TRACE_CONTROL) -> super::super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn ControlTraceW(tracehandle : CONTROLTRACE_HANDLE, instancename : windows_sys::core::PCWSTR, properties : *mut EVENT_TRACE_PROPERTIES, controlcode : EVENT_TRACE_CONTROL) -> super::super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CreateTraceInstanceId(reghandle : super::super::super::Foundation:: HANDLE, instinfo : *mut EVENT_INSTANCE_INFO) -> super::super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CveEventWrite(cveid : windows_sys::core::PCWSTR, additionaldetails : windows_sys::core::PCWSTR) -> i32);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn EnableTrace(enable : u32, enableflag : u32, enablelevel : u32, controlguid : *const windows_sys::core::GUID, tracehandle : CONTROLTRACE_HANDLE) -> super::super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn EnableTraceEx(providerid : *const windows_sys::core::GUID, sourceid : *const windows_sys::core::GUID, tracehandle : CONTROLTRACE_HANDLE, isenabled : u32, level : u8, matchanykeyword : u64, matchallkeyword : u64, enableproperty : u32, enablefilterdesc : *const EVENT_FILTER_DESCRIPTOR) -> super::super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn EnableTraceEx2(tracehandle : CONTROLTRACE_HANDLE, providerid : *const windows_sys::core::GUID, controlcode : u32, level : u8, matchanykeyword : u64, matchallkeyword : u64, timeout : u32, enableparameters : *const ENABLE_TRACE_PARAMETERS) -> super::super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn EnumerateTraceGuids(guidpropertiesarray : *mut *mut TRACE_GUID_PROPERTIES, propertyarraycount : u32, guidcount : *mut u32) -> super::super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn EnumerateTraceGuidsEx(tracequeryinfoclass : TRACE_QUERY_INFO_CLASS, inbuffer : *const core::ffi::c_void, inbuffersize : u32, outbuffer : *mut core::ffi::c_void, outbuffersize : u32, returnlength : *mut u32) -> super::super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("advapi32.dll" "system" fn EventAccessControl(guid : *const windows_sys::core::GUID, operation : u32, sid : super::super::super::Security:: PSID, rights : u32, allowordeny : bool) -> u32);

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("advapi32.dll" "system" fn EventAccessQuery(guid : *const windows_sys::core::GUID, buffer : super::super::super::Security:: PSECURITY_DESCRIPTOR, buffersize : *mut u32) -> u32);

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn EventAccessRemove(guid : *const windows_sys::core::GUID) -> u32);

// UNSUPPORTED Rust 16:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn EventActivityIdControl(controlcode : u32, activityid : *mut windows_sys::core::GUID) -> u32);

// UNSUPPORTED Rust 17:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn EventEnabled(reghandle : REGHANDLE, eventdescriptor : *const EVENT_DESCRIPTOR) -> bool);

// UNSUPPORTED Rust 18:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn EventProviderEnabled(reghandle : REGHANDLE, level : u8, keyword : u64) -> bool);

// UNSUPPORTED Rust 19:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn EventRegister(providerid : *const windows_sys::core::GUID, enablecallback : PENABLECALLBACK, callbackcontext : *const core::ffi::c_void, reghandle : *mut REGHANDLE) -> u32);

// UNSUPPORTED Rust 20:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn EventSetInformation(reghandle : REGHANDLE, informationclass : EVENT_INFO_CLASS, eventinformation : *const core::ffi::c_void, informationlength : u32) -> u32);

// UNSUPPORTED Rust 21:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn EventUnregister(reghandle : REGHANDLE) -> u32);

// UNSUPPORTED Rust 22:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn EventWrite(reghandle : REGHANDLE, eventdescriptor : *const EVENT_DESCRIPTOR, userdatacount : u32, userdata : *const EVENT_DATA_DESCRIPTOR) -> u32);

// UNSUPPORTED Rust 23:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn EventWriteEx(reghandle : REGHANDLE, eventdescriptor : *const EVENT_DESCRIPTOR, filter : u64, flags : u32, activityid : *const windows_sys::core::GUID, relatedactivityid : *const windows_sys::core::GUID, userdatacount : u32, userdata : *const EVENT_DATA_DESCRIPTOR) -> u32);

// UNSUPPORTED Rust 24:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn EventWriteString(reghandle : REGHANDLE, level : u8, keyword : u64, string : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 25:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn EventWriteTransfer(reghandle : REGHANDLE, eventdescriptor : *const EVENT_DESCRIPTOR, activityid : *const windows_sys::core::GUID, relatedactivityid : *const windows_sys::core::GUID, userdatacount : u32, userdata : *const EVENT_DATA_DESCRIPTOR) -> u32);

// UNSUPPORTED Rust 26:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn FlushTraceA(tracehandle : CONTROLTRACE_HANDLE, instancename : windows_sys::core::PCSTR, properties : *mut EVENT_TRACE_PROPERTIES) -> super::super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 27:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn FlushTraceW(tracehandle : CONTROLTRACE_HANDLE, instancename : windows_sys::core::PCWSTR, properties : *mut EVENT_TRACE_PROPERTIES) -> super::super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 28:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn GetTraceEnableFlags(tracehandle : u64) -> u32);

// UNSUPPORTED Rust 29:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn GetTraceEnableLevel(tracehandle : u64) -> u8);

// UNSUPPORTED Rust 30:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn GetTraceLoggerHandle(buffer : *const core::ffi::c_void) -> u64);

// UNSUPPORTED Rust 31:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Time")]
// windows_link::link!("advapi32.dll" "system" fn OpenTraceA(logfile : *mut EVENT_TRACE_LOGFILEA) -> PROCESSTRACE_HANDLE);

// UNSUPPORTED Rust 33:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Time")]
// windows_link::link!("advapi32.dll" "system" fn OpenTraceFromBufferStream(options : *const ETW_OPEN_TRACE_OPTIONS, buffercompletioncallback : PETW_BUFFER_COMPLETION_CALLBACK, buffercompletioncontext : *const core::ffi::c_void) -> u64);

// UNSUPPORTED Rust 35:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Time")]
// windows_link::link!("advapi32.dll" "system" fn OpenTraceFromFile(logfilename : windows_sys::core::PCWSTR, options : *const ETW_OPEN_TRACE_OPTIONS, logfileheader : *mut TRACE_LOGFILE_HEADER) -> u64);

// UNSUPPORTED Rust 37:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Time")]
// windows_link::link!("advapi32.dll" "system" fn OpenTraceFromRealTimeLogger(loggername : windows_sys::core::PCWSTR, options : *const ETW_OPEN_TRACE_OPTIONS, logfileheader : *mut TRACE_LOGFILE_HEADER) -> u64);

// UNSUPPORTED Rust 39:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Time")]
// windows_link::link!("advapi32.dll" "system" fn OpenTraceFromRealTimeLoggerWithAllocationOptions(loggername : windows_sys::core::PCWSTR, options : *const ETW_OPEN_TRACE_OPTIONS, allocationsize : usize, memorypartitionhandle : super::super::super::Foundation:: HANDLE, logfileheader : *mut TRACE_LOGFILE_HEADER) -> u64);

// UNSUPPORTED Rust 41:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Time")]
// windows_link::link!("advapi32.dll" "system" fn OpenTraceW(logfile : *mut EVENT_TRACE_LOGFILEW) -> PROCESSTRACE_HANDLE);

// UNSUPPORTED Rust 43:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn ProcessTrace(handlearray : *const PROCESSTRACE_HANDLE, handlecount : u32, starttime : *const super::super::super::Foundation:: FILETIME, endtime : *const super::super::super::Foundation:: FILETIME) -> super::super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 44:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn ProcessTraceAddBufferToBufferStream(tracehandle : u64, buffer : *const ETW_BUFFER_HEADER, buffersize : u32) -> u32);

// UNSUPPORTED Rust 45:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn ProcessTraceBufferDecrementReference(buffer : *const ETW_BUFFER_HEADER) -> u32);

// UNSUPPORTED Rust 46:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn ProcessTraceBufferIncrementReference(tracehandle : u64, buffer : *const ETW_BUFFER_HEADER) -> u32);

// UNSUPPORTED Rust 47:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn QueryAllTracesA(propertyarray : *mut *mut EVENT_TRACE_PROPERTIES, propertyarraycount : u32, loggercount : *mut u32) -> super::super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 48:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn QueryAllTracesW(propertyarray : *mut *mut EVENT_TRACE_PROPERTIES, propertyarraycount : u32, loggercount : *mut u32) -> super::super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 49:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn QueryTraceA(tracehandle : CONTROLTRACE_HANDLE, instancename : windows_sys::core::PCSTR, properties : *mut EVENT_TRACE_PROPERTIES) -> super::super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 50:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn QueryTraceProcessingHandle(processinghandle : PROCESSTRACE_HANDLE, informationclass : ETW_PROCESS_HANDLE_INFO_TYPE, inbuffer : *const core::ffi::c_void, inbuffersize : u32, outbuffer : *mut core::ffi::c_void, outbuffersize : u32, returnlength : *mut u32) -> super::super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 51:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn QueryTraceW(tracehandle : CONTROLTRACE_HANDLE, instancename : windows_sys::core::PCWSTR, properties : *mut EVENT_TRACE_PROPERTIES) -> super::super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 52:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn RegisterTraceGuidsA(requestaddress : WMIDPREQUEST, requestcontext : *const core::ffi::c_void, controlguid : *const windows_sys::core::GUID, guidcount : u32, traceguidreg : *const TRACE_GUID_REGISTRATION, mofimagepath : windows_sys::core::PCSTR, mofresourcename : windows_sys::core::PCSTR, registrationhandle : *mut u64) -> u32);

// UNSUPPORTED Rust 53:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn RegisterTraceGuidsW(requestaddress : WMIDPREQUEST, requestcontext : *const core::ffi::c_void, controlguid : *const windows_sys::core::GUID, guidcount : u32, traceguidreg : *const TRACE_GUID_REGISTRATION, mofimagepath : windows_sys::core::PCWSTR, mofresourcename : windows_sys::core::PCWSTR, registrationhandle : *mut u64) -> u32);

// UNSUPPORTED Rust 54:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn RemoveTraceCallback(pguid : *const windows_sys::core::GUID) -> super::super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 55:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn SetTraceCallback(pguid : *const windows_sys::core::GUID, eventcallback : PEVENT_CALLBACK) -> super::super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 56:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn StartTraceA(tracehandle : *mut CONTROLTRACE_HANDLE, instancename : windows_sys::core::PCSTR, properties : *mut EVENT_TRACE_PROPERTIES) -> super::super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 57:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn StartTraceW(tracehandle : *mut CONTROLTRACE_HANDLE, instancename : windows_sys::core::PCWSTR, properties : *mut EVENT_TRACE_PROPERTIES) -> super::super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 58:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn StopTraceA(tracehandle : CONTROLTRACE_HANDLE, instancename : windows_sys::core::PCSTR, properties : *mut EVENT_TRACE_PROPERTIES) -> super::super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 59:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn StopTraceW(tracehandle : CONTROLTRACE_HANDLE, instancename : windows_sys::core::PCWSTR, properties : *mut EVENT_TRACE_PROPERTIES) -> super::super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 60:1: declaration Macro has no candidate rule
// windows_link::link!("tdh.dll" "system" fn TdhAggregatePayloadFilters(payloadfiltercount : u32, payloadfilterptrs : *const *const core::ffi::c_void, eventmatchallflags : *const bool, eventfilterdescriptor : *mut EVENT_FILTER_DESCRIPTOR) -> u32);

// UNSUPPORTED Rust 61:1: declaration Macro has no candidate rule
// windows_link::link!("tdh.dll" "system" fn TdhCleanupPayloadEventFilterDescriptor(eventfilterdescriptor : *mut EVENT_FILTER_DESCRIPTOR) -> u32);

// UNSUPPORTED Rust 62:1: declaration Macro has no candidate rule
// windows_link::link!("tdh.dll" "system" fn TdhCloseDecodingHandle(handle : TDH_HANDLE) -> u32);

// UNSUPPORTED Rust 63:1: declaration Macro has no candidate rule
// windows_link::link!("tdh.dll" "system" fn TdhCreatePayloadFilter(providerguid : *const windows_sys::core::GUID, eventdescriptor : *const EVENT_DESCRIPTOR, eventmatchany : bool, payloadpredicatecount : u32, payloadpredicates : *const PAYLOAD_FILTER_PREDICATE, payloadfilter : *mut *mut core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 64:1: declaration Macro has no candidate rule
// windows_link::link!("tdh.dll" "system" fn TdhDeletePayloadFilter(payloadfilter : *mut *mut core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 65:1: declaration Macro has no candidate rule
// windows_link::link!("tdh.dll" "system" fn TdhEnumerateManifestProviderEvents(providerguid : *const windows_sys::core::GUID, buffer : *mut PROVIDER_EVENT_INFO, buffersize : *mut u32) -> u32);

// UNSUPPORTED Rust 66:1: declaration Macro has no candidate rule
// windows_link::link!("tdh.dll" "system" fn TdhEnumerateProviderFieldInformation(pguid : *const windows_sys::core::GUID, eventfieldtype : EVENT_FIELD_TYPE, pbuffer : *mut PROVIDER_FIELD_INFOARRAY, pbuffersize : *mut u32) -> u32);

// UNSUPPORTED Rust 67:1: declaration Macro has no candidate rule
// windows_link::link!("tdh.dll" "system" fn TdhEnumerateProviderFilters(guid : *const windows_sys::core::GUID, tdhcontextcount : u32, tdhcontext : *const TDH_CONTEXT, filtercount : *mut u32, buffer : *mut *mut PROVIDER_FILTER_INFO, buffersize : *mut u32) -> u32);

// UNSUPPORTED Rust 68:1: declaration Macro has no candidate rule
// windows_link::link!("tdh.dll" "system" fn TdhEnumerateProviders(pbuffer : *mut PROVIDER_ENUMERATION_INFO, pbuffersize : *mut u32) -> u32);

// UNSUPPORTED Rust 69:1: declaration Macro has no candidate rule
// windows_link::link!("tdh.dll" "system" fn TdhEnumerateProvidersForDecodingSource(filter : DECODING_SOURCE, buffer : *mut PROVIDER_ENUMERATION_INFO, buffersize : u32, bufferrequired : *mut u32) -> u32);

// UNSUPPORTED Rust 70:1: declaration Macro has no candidate rule
// windows_link::link!("tdh.dll" "system" fn TdhFormatProperty(eventinfo : *const TRACE_EVENT_INFO, mapinfo : *const EVENT_MAP_INFO, pointersize : u32, propertyintype : u16, propertyouttype : u16, propertylength : u16, userdatalength : u16, userdata : *const u8, buffersize : *mut u32, buffer : windows_sys::core::PWSTR, userdataconsumed : *mut u16) -> u32);

// UNSUPPORTED Rust 71:1: declaration Macro has no candidate rule
// windows_link::link!("tdh.dll" "system" fn TdhGetDecodingParameter(handle : TDH_HANDLE, tdhcontext : *mut TDH_CONTEXT) -> u32);

// UNSUPPORTED Rust 72:1: declaration Macro has no candidate rule
// windows_link::link!("tdh.dll" "system" fn TdhGetEventInformation(event : *const EVENT_RECORD, tdhcontextcount : u32, tdhcontext : *const TDH_CONTEXT, buffer : *mut TRACE_EVENT_INFO, buffersize : *mut u32) -> u32);

// UNSUPPORTED Rust 73:1: declaration Macro has no candidate rule
// windows_link::link!("tdh.dll" "system" fn TdhGetEventMapInformation(pevent : *const EVENT_RECORD, pmapname : windows_sys::core::PCWSTR, pbuffer : *mut EVENT_MAP_INFO, pbuffersize : *mut u32) -> u32);

// UNSUPPORTED Rust 74:1: declaration Macro has no candidate rule
// windows_link::link!("tdh.dll" "system" fn TdhGetManifestEventInformation(providerguid : *const windows_sys::core::GUID, eventdescriptor : *const EVENT_DESCRIPTOR, buffer : *mut TRACE_EVENT_INFO, buffersize : *mut u32) -> u32);

// UNSUPPORTED Rust 75:1: declaration Macro has no candidate rule
// windows_link::link!("tdh.dll" "system" fn TdhGetProperty(pevent : *const EVENT_RECORD, tdhcontextcount : u32, ptdhcontext : *const TDH_CONTEXT, propertydatacount : u32, ppropertydata : *const PROPERTY_DATA_DESCRIPTOR, buffersize : u32, pbuffer : *mut u8) -> u32);

// UNSUPPORTED Rust 76:1: declaration Macro has no candidate rule
// windows_link::link!("tdh.dll" "system" fn TdhGetPropertySize(pevent : *const EVENT_RECORD, tdhcontextcount : u32, ptdhcontext : *const TDH_CONTEXT, propertydatacount : u32, ppropertydata : *const PROPERTY_DATA_DESCRIPTOR, ppropertysize : *mut u32) -> u32);

// UNSUPPORTED Rust 77:1: declaration Macro has no candidate rule
// windows_link::link!("tdh.dll" "system" fn TdhGetWppMessage(handle : TDH_HANDLE, eventrecord : *const EVENT_RECORD, buffersize : *mut u32, buffer : *mut u8) -> u32);

// UNSUPPORTED Rust 78:1: declaration Macro has no candidate rule
// windows_link::link!("tdh.dll" "system" fn TdhGetWppProperty(handle : TDH_HANDLE, eventrecord : *const EVENT_RECORD, propertyname : windows_sys::core::PCWSTR, buffersize : *mut u32, buffer : *mut u8) -> u32);

// UNSUPPORTED Rust 79:1: declaration Macro has no candidate rule
// windows_link::link!("tdh.dll" "system" fn TdhLoadManifest(manifest : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 80:1: declaration Macro has no candidate rule
// windows_link::link!("tdh.dll" "system" fn TdhLoadManifestFromBinary(binarypath : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 81:1: declaration Macro has no candidate rule
// windows_link::link!("tdh.dll" "system" fn TdhLoadManifestFromMemory(pdata : *const core::ffi::c_void, cbdata : u32) -> u32);

// UNSUPPORTED Rust 82:1: declaration Macro has no candidate rule
// windows_link::link!("tdh.dll" "system" fn TdhOpenDecodingHandle(handle : *mut TDH_HANDLE) -> u32);

// UNSUPPORTED Rust 83:1: declaration Macro has no candidate rule
// windows_link::link!("tdh.dll" "system" fn TdhQueryProviderFieldInformation(pguid : *const windows_sys::core::GUID, eventfieldvalue : u64, eventfieldtype : EVENT_FIELD_TYPE, pbuffer : *mut PROVIDER_FIELD_INFOARRAY, pbuffersize : *mut u32) -> u32);

// UNSUPPORTED Rust 84:1: declaration Macro has no candidate rule
// windows_link::link!("tdh.dll" "system" fn TdhSetDecodingParameter(handle : TDH_HANDLE, tdhcontext : *const TDH_CONTEXT) -> u32);

// UNSUPPORTED Rust 85:1: declaration Macro has no candidate rule
// windows_link::link!("tdh.dll" "system" fn TdhUnloadManifest(manifest : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 86:1: declaration Macro has no candidate rule
// windows_link::link!("tdh.dll" "system" fn TdhUnloadManifestFromMemory(pdata : *const core::ffi::c_void, cbdata : u32) -> u32);

// UNSUPPORTED Rust 87:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn TraceEvent(tracehandle : u64, eventtrace : *const EVENT_TRACE_HEADER) -> super::super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 88:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn TraceEventInstance(tracehandle : u64, eventtrace : *const EVENT_INSTANCE_HEADER, instinfo : *const EVENT_INSTANCE_INFO, parentinstinfo : *const EVENT_INSTANCE_INFO) -> u32);

// UNSUPPORTED Rust 89:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "C" fn TraceMessage(loggerhandle : u64, messageflags : TRACE_MESSAGE_FLAGS, messageguid : *const windows_sys::core::GUID, messagenumber : u16, ...) -> super::super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 90:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn TraceMessageVa(loggerhandle : u64, messageflags : TRACE_MESSAGE_FLAGS, messageguid : *const windows_sys::core::GUID, messagenumber : u16, messagearglist : *const i8) -> super::super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 91:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn TraceQueryInformation(sessionhandle : CONTROLTRACE_HANDLE, informationclass : TRACE_QUERY_INFO_CLASS, traceinformation : *mut core::ffi::c_void, informationlength : u32, returnlength : *mut u32) -> super::super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 92:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn TraceSetInformation(sessionhandle : CONTROLTRACE_HANDLE, informationclass : TRACE_QUERY_INFO_CLASS, traceinformation : *const core::ffi::c_void, informationlength : u32) -> super::super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 93:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn UnregisterTraceGuids(registrationhandle : u64) -> u32);

// UNSUPPORTED Rust 94:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn UpdateTraceA(tracehandle : CONTROLTRACE_HANDLE, instancename : windows_sys::core::PCSTR, properties : *mut EVENT_TRACE_PROPERTIES) -> super::super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 95:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn UpdateTraceW(tracehandle : CONTROLTRACE_HANDLE, instancename : windows_sys::core::PCWSTR, properties : *mut EVENT_TRACE_PROPERTIES) -> super::super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 96:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const ALPCGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x45d8cccd_539f_4b72_a8b7_5c683142609a);

// UNSUPPORTED Rust 97:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CLASSIC_EVENT_ID {
//     pub EventGuid: windows_sys::core::GUID,
//     pub Type: u8,
//     pub Reserved: [u8; 7],
// }

// UNSUPPORTED Rust 104:1: declaration Impl has no candidate rule
// impl Default for CLASSIC_EVENT_ID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 109:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CLSID_TraceRelogger: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7b40792d_05ff_44c4_9058_f440c71f17d4);

// UNSUPPORTED Rust 110:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CONTROLTRACE_HANDLE {
//     pub Value: u64,
// }

// UNSUPPORTED Rust 115:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CTraceRelogger: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7b40792d_05ff_44c4_9058_f440c71f17d4);

public typealias `DECODING_SOURCE` = Int;
// UNSUPPORTED Rust 117:1: non-scalar type Ptr unsupported
// pub const DIAG_LOGGER_NAMEA: windows_sys::core::PCSTR = windows_sys::core::s!("DiagLog");

// UNSUPPORTED Rust 118:1: non-scalar type Ptr unsupported
// pub const DIAG_LOGGER_NAMEW: windows_sys::core::PCWSTR = windows_sys::core::w!("DiagLog");

public const val `DecodingSourceMax`: `DECODING_SOURCE` = 4;
public const val `DecodingSourceTlg`: `DECODING_SOURCE` = 3;
public const val `DecodingSourceWPP`: `DECODING_SOURCE` = 2;
public const val `DecodingSourceWbem`: `DECODING_SOURCE` = 1;
public const val `DecodingSourceXMLFile`: `DECODING_SOURCE` = 0;
// UNSUPPORTED Rust 124:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const DefaultTraceSecurityGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0811c1af_7a07_4a06_82ed_869455cdf713);

// UNSUPPORTED Rust 125:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const DiskIoGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3d6fa8d4_fe05_11d0_9dda_00c04fd7ba7c);

public typealias `ENABLECALLBACK_ENABLED_STATE` = UInt;
// UNSUPPORTED Rust 127:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ENABLE_TRACE_PARAMETERS {
//     pub Version: u32,
//     pub EnableProperty: u32,
//     pub ControlFlags: u32,
//     pub SourceId: windows_sys::core::GUID,
//     pub EnableFilterDesc: *mut EVENT_FILTER_DESCRIPTOR,
//     pub FilterDescCount: u32,
// }

// UNSUPPORTED Rust 137:1: declaration Impl has no candidate rule
// impl Default for ENABLE_TRACE_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 142:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ENABLE_TRACE_PARAMETERS_V1 {
//     pub Version: u32,
//     pub EnableProperty: u32,
//     pub ControlFlags: u32,
//     pub SourceId: windows_sys::core::GUID,
//     pub EnableFilterDesc: *mut EVENT_FILTER_DESCRIPTOR,
// }

// UNSUPPORTED Rust 151:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 162:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Time")]
// #[derive(Clone, Copy)]
// pub struct ETW_BUFFER_CALLBACK_INFORMATION {
//     pub TraceHandle: u64,
//     pub LogfileHeader: *const TRACE_LOGFILE_HEADER,
//     pub BuffersRead: u32,
// }

// UNSUPPORTED Rust 170:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Time")]
// impl Default for ETW_BUFFER_CALLBACK_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 176:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ETW_BUFFER_CONTEXT {
//     pub Anonymous: ETW_BUFFER_CONTEXT_0,
//     pub LoggerId: u16,
// }

// UNSUPPORTED Rust 182:1: declaration Impl has no candidate rule
// impl Default for ETW_BUFFER_CONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 187:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union ETW_BUFFER_CONTEXT_0 {
//     pub Anonymous: ETW_BUFFER_CONTEXT_0_0,
//     pub ProcessorIndex: u16,
// }

// UNSUPPORTED Rust 193:1: declaration Impl has no candidate rule
// impl Default for ETW_BUFFER_CONTEXT_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 198:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct ETW_BUFFER_CONTEXT_0_0 {
//     pub ProcessorNumber: u8,
//     pub Alignment: u8,
// }

// UNSUPPORTED Rust 204:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ETW_BUFFER_HEADER {
//     pub Reserved1: [u32; 4],
//     pub TimeStamp: i64,
//     pub Reserved2: [u32; 4],
//     pub ClientContext: ETW_BUFFER_CONTEXT,
//     pub Reserved3: u32,
//     pub FilledBytes: u32,
//     pub Reserved4: [u32; 5],
// }

// UNSUPPORTED Rust 215:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 236:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Time")]
// #[derive(Clone, Copy)]
// pub struct ETW_OPEN_TRACE_OPTIONS {
//     pub ProcessTraceModes: ETW_PROCESS_TRACE_MODES,
//     pub EventCallback: PEVENT_RECORD_CALLBACK,
//     pub EventCallbackContext: *mut core::ffi::c_void,
//     pub BufferCallback: PETW_BUFFER_CALLBACK,
//     pub BufferCallbackContext: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 246:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Time")]
// impl Default for ETW_OPEN_TRACE_OPTIONS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 252:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct ETW_PMC_COUNTER_OWNER {
//     pub OwnerType: ETW_PMC_COUNTER_OWNER_TYPE,
//     pub ProfileSource: u32,
//     pub OwnerTag: u32,
// }

// UNSUPPORTED Rust 259:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ETW_PMC_COUNTER_OWNERSHIP_STATUS {
//     pub ProcessorNumber: u32,
//     pub NumberOfCounters: u32,
//     pub CounterOwners: [ETW_PMC_COUNTER_OWNER; 1],
// }

// UNSUPPORTED Rust 266:1: declaration Impl has no candidate rule
// impl Default for ETW_PMC_COUNTER_OWNERSHIP_STATUS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `ETW_PMC_COUNTER_OWNER_TYPE` = Int;
// UNSUPPORTED Rust 272:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct ETW_PMC_SESSION_INFO {
//     pub NextEntryOffset: u32,
//     pub LoggerId: u16,
//     pub Reserved: u16,
//     pub ProfileSourceCount: u32,
//     pub HookIdCount: u32,
// }

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
// UNSUPPORTED Rust 298:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct ETW_TRACE_PARTITION_INFORMATION {
//     pub PartitionId: windows_sys::core::GUID,
//     pub ParentId: windows_sys::core::GUID,
//     pub QpcOffsetFromRoot: i64,
//     pub PartitionType: u32,
// }

// UNSUPPORTED Rust 306:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ETW_TRACE_PARTITION_INFORMATION_V2 {
//     pub QpcOffsetFromRoot: i64,
//     pub PartitionType: u32,
//     pub PartitionId: windows_sys::core::PWSTR,
//     pub ParentId: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 314:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 342:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EVENT_DATA_DESCRIPTOR {
//     pub Ptr: u64,
//     pub Size: u32,
//     pub Anonymous: EVENT_DATA_DESCRIPTOR_0,
// }

// UNSUPPORTED Rust 349:1: declaration Impl has no candidate rule
// impl Default for EVENT_DATA_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 354:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union EVENT_DATA_DESCRIPTOR_0 {
//     pub Reserved: u32,
//     pub Anonymous: EVENT_DATA_DESCRIPTOR_0_0,
// }

// UNSUPPORTED Rust 360:1: declaration Impl has no candidate rule
// impl Default for EVENT_DATA_DESCRIPTOR_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 365:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EVENT_DATA_DESCRIPTOR_0_0 {
//     pub Type: u8,
//     pub Reserved1: u8,
//     pub Reserved2: u16,
// }

public const val `EVENT_DATA_DESCRIPTOR_TYPE_EVENT_METADATA`: UInt = 1u;
public const val `EVENT_DATA_DESCRIPTOR_TYPE_NONE`: UInt = 0u;
public const val `EVENT_DATA_DESCRIPTOR_TYPE_PROVIDER_METADATA`: UInt = 2u;
public const val `EVENT_DATA_DESCRIPTOR_TYPE_TIMESTAMP_OVERRIDE`: UInt = 3u;
// UNSUPPORTED Rust 376:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EVENT_DESCRIPTOR {
//     pub Id: u16,
//     pub Version: u8,
//     pub Channel: u8,
//     pub Level: u8,
//     pub Opcode: u8,
//     pub Task: u16,
//     pub Keyword: u64,
// }

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
// UNSUPPORTED Rust 399:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EVENT_EXTENDED_ITEM_EVENT_KEY {
//     pub Key: u64,
// }

// UNSUPPORTED Rust 404:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EVENT_EXTENDED_ITEM_INSTANCE {
//     pub InstanceId: u32,
//     pub ParentInstanceId: u32,
//     pub ParentGuid: windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 411:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EVENT_EXTENDED_ITEM_PEBS_INDEX {
//     pub PebsIndex: u64,
// }

// UNSUPPORTED Rust 416:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EVENT_EXTENDED_ITEM_PMC_COUNTERS {
//     pub Counter: [u64; 1],
// }

// UNSUPPORTED Rust 421:1: declaration Impl has no candidate rule
// impl Default for EVENT_EXTENDED_ITEM_PMC_COUNTERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 426:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EVENT_EXTENDED_ITEM_PROCESS_START_KEY {
//     pub ProcessStartKey: u64,
// }

// UNSUPPORTED Rust 431:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EVENT_EXTENDED_ITEM_RELATED_ACTIVITYID {
//     pub RelatedActivityId: windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 436:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EVENT_EXTENDED_ITEM_STACK_KEY32 {
//     pub MatchId: u64,
//     pub StackKey: u32,
//     pub Padding: u32,
// }

// UNSUPPORTED Rust 443:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EVENT_EXTENDED_ITEM_STACK_KEY64 {
//     pub MatchId: u64,
//     pub StackKey: u64,
// }

// UNSUPPORTED Rust 449:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EVENT_EXTENDED_ITEM_STACK_TRACE32 {
//     pub MatchId: u64,
//     pub Address: [u32; 1],
// }

// UNSUPPORTED Rust 455:1: declaration Impl has no candidate rule
// impl Default for EVENT_EXTENDED_ITEM_STACK_TRACE32 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 460:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EVENT_EXTENDED_ITEM_STACK_TRACE64 {
//     pub MatchId: u64,
//     pub Address: [u64; 1],
// }

// UNSUPPORTED Rust 466:1: declaration Impl has no candidate rule
// impl Default for EVENT_EXTENDED_ITEM_STACK_TRACE64 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 471:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EVENT_EXTENDED_ITEM_TS_ID {
//     pub SessionId: u32,
// }

public typealias `EVENT_FIELD_TYPE` = Int;
// UNSUPPORTED Rust 477:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EVENT_FILTER_DESCRIPTOR {
//     pub Ptr: u64,
//     pub Size: u32,
//     pub Type: u32,
// }

// UNSUPPORTED Rust 484:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EVENT_FILTER_EVENT_ID {
//     pub FilterIn: bool,
//     pub Reserved: u8,
//     pub Count: u16,
//     pub Events: [u16; 1],
// }

// UNSUPPORTED Rust 492:1: declaration Impl has no candidate rule
// impl Default for EVENT_FILTER_EVENT_ID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 497:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EVENT_FILTER_EVENT_NAME {
//     pub MatchAnyKeyword: u64,
//     pub MatchAllKeyword: u64,
//     pub Level: u8,
//     pub FilterIn: bool,
//     pub NameCount: u16,
//     pub Names: [u8; 1],
// }

// UNSUPPORTED Rust 507:1: declaration Impl has no candidate rule
// impl Default for EVENT_FILTER_EVENT_NAME {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 512:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EVENT_FILTER_HEADER {
//     pub Id: u16,
//     pub Version: u8,
//     pub Reserved: [u8; 5],
//     pub InstanceId: u64,
//     pub Size: u32,
//     pub NextOffset: u32,
// }

// UNSUPPORTED Rust 522:1: declaration Impl has no candidate rule
// impl Default for EVENT_FILTER_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 527:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EVENT_FILTER_LEVEL_KW {
//     pub MatchAnyKeyword: u64,
//     pub MatchAllKeyword: u64,
//     pub Level: u8,
//     pub FilterIn: bool,
// }

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
// UNSUPPORTED Rust 550:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EVENT_HEADER {
//     pub Size: u16,
//     pub HeaderType: u16,
//     pub Flags: u16,
//     pub EventProperty: u16,
//     pub ThreadId: u32,
//     pub ProcessId: u32,
//     pub TimeStamp: i64,
//     pub ProviderId: windows_sys::core::GUID,
//     pub EventDescriptor: EVENT_DESCRIPTOR,
//     pub Anonymous: EVENT_HEADER_0,
//     pub ActivityId: windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 565:1: declaration Impl has no candidate rule
// impl Default for EVENT_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 570:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union EVENT_HEADER_0 {
//     pub Anonymous: EVENT_HEADER_0_0,
//     pub ProcessorTime: u64,
// }

// UNSUPPORTED Rust 576:1: declaration Impl has no candidate rule
// impl Default for EVENT_HEADER_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 581:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EVENT_HEADER_0_0 {
//     pub KernelTime: u32,
//     pub UserTime: u32,
// }

// UNSUPPORTED Rust 587:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EVENT_HEADER_EXTENDED_DATA_ITEM {
//     pub Reserved1: u16,
//     pub ExtType: u16,
//     pub Anonymous: EVENT_HEADER_EXTENDED_DATA_ITEM_0,
//     pub DataSize: u16,
//     pub DataPtr: u64,
// }

// UNSUPPORTED Rust 596:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EVENT_HEADER_EXTENDED_DATA_ITEM_0 {
//     pub _bitfield: u16,
// }

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
// UNSUPPORTED Rust 635:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EVENT_INSTANCE_HEADER {
//     pub Size: u16,
//     pub Anonymous1: EVENT_INSTANCE_HEADER_0,
//     pub Anonymous2: EVENT_INSTANCE_HEADER_1,
//     pub ThreadId: u32,
//     pub ProcessId: u32,
//     pub TimeStamp: i64,
//     pub RegHandle: u64,
//     pub InstanceId: u32,
//     pub ParentInstanceId: u32,
//     pub Anonymous3: EVENT_INSTANCE_HEADER_2,
//     pub ParentRegHandle: u64,
// }

// UNSUPPORTED Rust 650:1: declaration Impl has no candidate rule
// impl Default for EVENT_INSTANCE_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 655:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union EVENT_INSTANCE_HEADER_0 {
//     pub FieldTypeFlags: u16,
//     pub Anonymous: EVENT_INSTANCE_HEADER_0_0,
// }

// UNSUPPORTED Rust 661:1: declaration Impl has no candidate rule
// impl Default for EVENT_INSTANCE_HEADER_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 666:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EVENT_INSTANCE_HEADER_0_0 {
//     pub HeaderType: u8,
//     pub MarkerFlags: u8,
// }

// UNSUPPORTED Rust 672:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union EVENT_INSTANCE_HEADER_1 {
//     pub Version: u32,
//     pub Class: EVENT_INSTANCE_HEADER_1_0,
// }

// UNSUPPORTED Rust 678:1: declaration Impl has no candidate rule
// impl Default for EVENT_INSTANCE_HEADER_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 683:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EVENT_INSTANCE_HEADER_1_0 {
//     pub Type: u8,
//     pub Level: u8,
//     pub Version: u16,
// }

// UNSUPPORTED Rust 690:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union EVENT_INSTANCE_HEADER_2 {
//     pub Anonymous1: EVENT_INSTANCE_HEADER_2_0,
//     pub ProcessorTime: u64,
//     pub Anonymous2: EVENT_INSTANCE_HEADER_2_1,
// }

// UNSUPPORTED Rust 697:1: declaration Impl has no candidate rule
// impl Default for EVENT_INSTANCE_HEADER_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 702:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EVENT_INSTANCE_HEADER_2_0 {
//     pub KernelTime: u32,
//     pub UserTime: u32,
// }

// UNSUPPORTED Rust 708:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EVENT_INSTANCE_HEADER_2_1 {
//     pub EventId: u32,
//     pub Flags: u32,
// }

// UNSUPPORTED Rust 714:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EVENT_INSTANCE_INFO {
//     pub RegHandle: super::super::super::Foundation::HANDLE,
//     pub InstanceId: u32,
// }

// UNSUPPORTED Rust 720:1: declaration Impl has no candidate rule
// impl Default for EVENT_INSTANCE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 725:1: non-scalar type Ptr unsupported
// pub const EVENT_LOGGER_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("EventLog");

// UNSUPPORTED Rust 726:1: non-scalar type Ptr unsupported
// pub const EVENT_LOGGER_NAMEA: windows_sys::core::PCSTR = windows_sys::core::s!("EventLog");

// UNSUPPORTED Rust 727:1: non-scalar type Ptr unsupported
// pub const EVENT_LOGGER_NAMEW: windows_sys::core::PCWSTR = windows_sys::core::w!("EventLog");

// UNSUPPORTED Rust 728:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EVENT_MAP_ENTRY {
//     pub OutputOffset: u32,
//     pub Anonymous: EVENT_MAP_ENTRY_0,
// }

// UNSUPPORTED Rust 734:1: declaration Impl has no candidate rule
// impl Default for EVENT_MAP_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 739:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union EVENT_MAP_ENTRY_0 {
//     pub Value: u32,
//     pub InputOffset: u32,
// }

// UNSUPPORTED Rust 745:1: declaration Impl has no candidate rule
// impl Default for EVENT_MAP_ENTRY_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 750:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EVENT_MAP_INFO {
//     pub NameOffset: u32,
//     pub Flag: MAP_FLAGS,
//     pub EntryCount: u32,
//     pub Anonymous: EVENT_MAP_INFO_0,
//     pub MapEntryArray: [EVENT_MAP_ENTRY; 1],
// }

// UNSUPPORTED Rust 759:1: declaration Impl has no candidate rule
// impl Default for EVENT_MAP_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 764:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union EVENT_MAP_INFO_0 {
//     pub MapEntryValueType: MAP_VALUETYPE,
//     pub FormatStringOffset: u32,
// }

// UNSUPPORTED Rust 770:1: declaration Impl has no candidate rule
// impl Default for EVENT_MAP_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `EVENT_MAX_LEVEL`: UInt = 255u;
public const val `EVENT_MIN_LEVEL`: UInt = 0u;
// UNSUPPORTED Rust 777:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EVENT_PROPERTY_INFO {
//     pub Flags: PROPERTY_FLAGS,
//     pub NameOffset: u32,
//     pub Anonymous1: EVENT_PROPERTY_INFO_0,
//     pub Anonymous2: EVENT_PROPERTY_INFO_1,
//     pub Anonymous3: EVENT_PROPERTY_INFO_2,
//     pub Anonymous4: EVENT_PROPERTY_INFO_3,
// }

// UNSUPPORTED Rust 787:1: declaration Impl has no candidate rule
// impl Default for EVENT_PROPERTY_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 792:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union EVENT_PROPERTY_INFO_0 {
//     pub nonStructType: EVENT_PROPERTY_INFO_0_0,
//     pub structType: EVENT_PROPERTY_INFO_0_1,
//     pub customSchemaType: EVENT_PROPERTY_INFO_0_2,
// }

// UNSUPPORTED Rust 799:1: declaration Impl has no candidate rule
// impl Default for EVENT_PROPERTY_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 804:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EVENT_PROPERTY_INFO_0_2 {
//     pub InType: u16,
//     pub OutType: u16,
//     pub CustomSchemaOffset: u32,
// }

// UNSUPPORTED Rust 811:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EVENT_PROPERTY_INFO_0_0 {
//     pub InType: u16,
//     pub OutType: u16,
//     pub MapNameOffset: u32,
// }

// UNSUPPORTED Rust 818:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EVENT_PROPERTY_INFO_0_1 {
//     pub StructStartIndex: u16,
//     pub NumOfStructMembers: u16,
//     pub padding: u32,
// }

// UNSUPPORTED Rust 825:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union EVENT_PROPERTY_INFO_1 {
//     pub count: u16,
//     pub countPropertyIndex: u16,
// }

// UNSUPPORTED Rust 831:1: declaration Impl has no candidate rule
// impl Default for EVENT_PROPERTY_INFO_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 836:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union EVENT_PROPERTY_INFO_2 {
//     pub length: u16,
//     pub lengthPropertyIndex: u16,
// }

// UNSUPPORTED Rust 842:1: declaration Impl has no candidate rule
// impl Default for EVENT_PROPERTY_INFO_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 847:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union EVENT_PROPERTY_INFO_3 {
//     pub Reserved: u32,
//     pub Anonymous: EVENT_PROPERTY_INFO_3_0,
// }

// UNSUPPORTED Rust 853:1: declaration Impl has no candidate rule
// impl Default for EVENT_PROPERTY_INFO_3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 858:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EVENT_PROPERTY_INFO_3_0 {
//     pub _bitfield: u32,
// }

// UNSUPPORTED Rust 863:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EVENT_RECORD {
//     pub EventHeader: EVENT_HEADER,
//     pub BufferContext: ETW_BUFFER_CONTEXT,
//     pub ExtendedDataCount: u16,
//     pub UserDataLength: u16,
//     pub ExtendedData: *mut EVENT_HEADER_EXTENDED_DATA_ITEM,
//     pub UserData: *mut core::ffi::c_void,
//     pub UserContext: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 874:1: declaration Impl has no candidate rule
// impl Default for EVENT_RECORD {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 879:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EVENT_TRACE {
//     pub Header: EVENT_TRACE_HEADER,
//     pub InstanceId: u32,
//     pub ParentInstanceId: u32,
//     pub ParentGuid: windows_sys::core::GUID,
//     pub MofData: *mut core::ffi::c_void,
//     pub MofLength: u32,
//     pub Anonymous: EVENT_TRACE_0,
// }

// UNSUPPORTED Rust 890:1: declaration Impl has no candidate rule
// impl Default for EVENT_TRACE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 895:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union EVENT_TRACE_0 {
//     pub ClientContext: u32,
//     pub BufferContext: ETW_BUFFER_CONTEXT,
// }

// UNSUPPORTED Rust 901:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 956:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EVENT_TRACE_HEADER {
//     pub Size: u16,
//     pub Anonymous1: EVENT_TRACE_HEADER_0,
//     pub Anonymous2: EVENT_TRACE_HEADER_1,
//     pub ThreadId: u32,
//     pub ProcessId: u32,
//     pub TimeStamp: i64,
//     pub Anonymous3: EVENT_TRACE_HEADER_2,
//     pub Anonymous4: EVENT_TRACE_HEADER_3,
// }

// UNSUPPORTED Rust 968:1: declaration Impl has no candidate rule
// impl Default for EVENT_TRACE_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 973:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union EVENT_TRACE_HEADER_0 {
//     pub FieldTypeFlags: u16,
//     pub Anonymous: EVENT_TRACE_HEADER_0_0,
// }

// UNSUPPORTED Rust 979:1: declaration Impl has no candidate rule
// impl Default for EVENT_TRACE_HEADER_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 984:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EVENT_TRACE_HEADER_0_0 {
//     pub HeaderType: u8,
//     pub MarkerFlags: u8,
// }

// UNSUPPORTED Rust 990:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union EVENT_TRACE_HEADER_1 {
//     pub Version: u32,
//     pub Class: EVENT_TRACE_HEADER_1_0,
// }

// UNSUPPORTED Rust 996:1: declaration Impl has no candidate rule
// impl Default for EVENT_TRACE_HEADER_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1001:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EVENT_TRACE_HEADER_1_0 {
//     pub Type: u8,
//     pub Level: u8,
//     pub Version: u16,
// }

// UNSUPPORTED Rust 1008:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union EVENT_TRACE_HEADER_2 {
//     pub Guid: windows_sys::core::GUID,
//     pub GuidPtr: u64,
// }

// UNSUPPORTED Rust 1014:1: declaration Impl has no candidate rule
// impl Default for EVENT_TRACE_HEADER_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1019:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union EVENT_TRACE_HEADER_3 {
//     pub Anonymous1: EVENT_TRACE_HEADER_3_0,
//     pub ProcessorTime: u64,
//     pub Anonymous2: EVENT_TRACE_HEADER_3_1,
// }

// UNSUPPORTED Rust 1026:1: declaration Impl has no candidate rule
// impl Default for EVENT_TRACE_HEADER_3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1031:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EVENT_TRACE_HEADER_3_0 {
//     pub KernelTime: u32,
//     pub UserTime: u32,
// }

// UNSUPPORTED Rust 1037:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EVENT_TRACE_HEADER_3_1 {
//     pub ClientContext: u32,
//     pub Flags: u32,
// }

public const val `EVENT_TRACE_INDEPENDENT_SESSION_MODE`: UInt = 134217728u;
// UNSUPPORTED Rust 1044:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Time")]
// #[derive(Clone, Copy)]
// pub struct EVENT_TRACE_LOGFILEA {
//     pub LogFileName: windows_sys::core::PSTR,
//     pub LoggerName: windows_sys::core::PSTR,
//     pub CurrentTime: i64,
//     pub BuffersRead: u32,
//     pub Anonymous1: EVENT_TRACE_LOGFILEA_0,
//     pub CurrentEvent: EVENT_TRACE,
//     pub LogfileHeader: TRACE_LOGFILE_HEADER,
//     pub BufferCallback: PEVENT_TRACE_BUFFER_CALLBACKA,
//     pub BufferSize: u32,
//     pub Filled: u32,
//     pub EventsLost: u32,
//     pub Anonymous2: EVENT_TRACE_LOGFILEA_1,
//     pub IsKernelTrace: u32,
//     pub Context: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 1063:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Time")]
// impl Default for EVENT_TRACE_LOGFILEA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1069:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Time")]
// #[derive(Clone, Copy)]
// pub union EVENT_TRACE_LOGFILEA_0 {
//     pub LogFileMode: u32,
//     pub ProcessTraceMode: u32,
// }

// UNSUPPORTED Rust 1076:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Time")]
// impl Default for EVENT_TRACE_LOGFILEA_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1082:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Time")]
// #[derive(Clone, Copy)]
// pub union EVENT_TRACE_LOGFILEA_1 {
//     pub EventCallback: PEVENT_CALLBACK,
//     pub EventRecordCallback: PEVENT_RECORD_CALLBACK,
// }

// UNSUPPORTED Rust 1089:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Time")]
// impl Default for EVENT_TRACE_LOGFILEA_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1095:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Time")]
// #[derive(Clone, Copy)]
// pub struct EVENT_TRACE_LOGFILEW {
//     pub LogFileName: windows_sys::core::PWSTR,
//     pub LoggerName: windows_sys::core::PWSTR,
//     pub CurrentTime: i64,
//     pub BuffersRead: u32,
//     pub Anonymous1: EVENT_TRACE_LOGFILEW_0,
//     pub CurrentEvent: EVENT_TRACE,
//     pub LogfileHeader: TRACE_LOGFILE_HEADER,
//     pub BufferCallback: PEVENT_TRACE_BUFFER_CALLBACKW,
//     pub BufferSize: u32,
//     pub Filled: u32,
//     pub EventsLost: u32,
//     pub Anonymous2: EVENT_TRACE_LOGFILEW_1,
//     pub IsKernelTrace: u32,
//     pub Context: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 1114:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Time")]
// impl Default for EVENT_TRACE_LOGFILEW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1120:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Time")]
// #[derive(Clone, Copy)]
// pub union EVENT_TRACE_LOGFILEW_0 {
//     pub LogFileMode: u32,
//     pub ProcessTraceMode: u32,
// }

// UNSUPPORTED Rust 1127:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Time")]
// impl Default for EVENT_TRACE_LOGFILEW_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1133:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Time")]
// #[derive(Clone, Copy)]
// pub union EVENT_TRACE_LOGFILEW_1 {
//     pub EventCallback: PEVENT_CALLBACK,
//     pub EventRecordCallback: PEVENT_RECORD_CALLBACK,
// }

// UNSUPPORTED Rust 1140:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 1152:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EVENT_TRACE_PROPERTIES {
//     pub Wnode: WNODE_HEADER,
//     pub BufferSize: u32,
//     pub MinimumBuffers: u32,
//     pub MaximumBuffers: u32,
//     pub MaximumFileSize: u32,
//     pub LogFileMode: u32,
//     pub FlushTimer: u32,
//     pub EnableFlags: EVENT_TRACE_FLAG,
//     pub Anonymous: EVENT_TRACE_PROPERTIES_0,
//     pub NumberOfBuffers: u32,
//     pub FreeBuffers: u32,
//     pub EventsLost: u32,
//     pub BuffersWritten: u32,
//     pub LogBuffersLost: u32,
//     pub RealTimeBuffersLost: u32,
//     pub LoggerThreadId: super::super::super::Foundation::HANDLE,
//     pub LogFileNameOffset: u32,
//     pub LoggerNameOffset: u32,
// }

// UNSUPPORTED Rust 1174:1: declaration Impl has no candidate rule
// impl Default for EVENT_TRACE_PROPERTIES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1179:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union EVENT_TRACE_PROPERTIES_0 {
//     pub AgeLimit: i32,
//     pub FlushThreshold: i32,
// }

// UNSUPPORTED Rust 1185:1: declaration Impl has no candidate rule
// impl Default for EVENT_TRACE_PROPERTIES_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1190:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EVENT_TRACE_PROPERTIES_V2 {
//     pub Wnode: WNODE_HEADER,
//     pub BufferSize: u32,
//     pub MinimumBuffers: u32,
//     pub MaximumBuffers: u32,
//     pub MaximumFileSize: u32,
//     pub LogFileMode: u32,
//     pub FlushTimer: u32,
//     pub EnableFlags: EVENT_TRACE_FLAG,
//     pub Anonymous1: EVENT_TRACE_PROPERTIES_V2_0,
//     pub NumberOfBuffers: u32,
//     pub FreeBuffers: u32,
//     pub EventsLost: u32,
//     pub BuffersWritten: u32,
//     pub LogBuffersLost: u32,
//     pub RealTimeBuffersLost: u32,
//     pub LoggerThreadId: super::super::super::Foundation::HANDLE,
//     pub LogFileNameOffset: u32,
//     pub LoggerNameOffset: u32,
//     pub Anonymous2: EVENT_TRACE_PROPERTIES_V2_1,
//     pub FilterDescCount: u32,
//     pub FilterDesc: *mut EVENT_FILTER_DESCRIPTOR,
//     pub Anonymous3: EVENT_TRACE_PROPERTIES_V2_2,
// }

// UNSUPPORTED Rust 1216:1: declaration Impl has no candidate rule
// impl Default for EVENT_TRACE_PROPERTIES_V2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1221:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union EVENT_TRACE_PROPERTIES_V2_0 {
//     pub AgeLimit: i32,
//     pub FlushThreshold: i32,
// }

// UNSUPPORTED Rust 1227:1: declaration Impl has no candidate rule
// impl Default for EVENT_TRACE_PROPERTIES_V2_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1232:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union EVENT_TRACE_PROPERTIES_V2_1 {
//     pub Anonymous: EVENT_TRACE_PROPERTIES_V2_1_0,
//     pub V2Control: u32,
// }

// UNSUPPORTED Rust 1238:1: declaration Impl has no candidate rule
// impl Default for EVENT_TRACE_PROPERTIES_V2_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1243:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EVENT_TRACE_PROPERTIES_V2_1_0 {
//     pub _bitfield: u32,
// }

// UNSUPPORTED Rust 1248:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union EVENT_TRACE_PROPERTIES_V2_2 {
//     pub Anonymous: EVENT_TRACE_PROPERTIES_V2_2_0,
//     pub V2Options: u64,
// }

// UNSUPPORTED Rust 1254:1: declaration Impl has no candidate rule
// impl Default for EVENT_TRACE_PROPERTIES_V2_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1259:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EVENT_TRACE_PROPERTIES_V2_2_0 {
//     pub _bitfield: u32,
// }

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
// UNSUPPORTED Rust 1417:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const EventTraceConfigGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x01853a65_418f_4f36_aefc_dc0f1d2fd235);

// UNSUPPORTED Rust 1418:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const EventTraceGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x68fdd900_4a3e_11d1_84f4_0000f80464e3);

// UNSUPPORTED Rust 1419:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FileIoGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x90cbdc39_4a3e_11d1_84f4_0000f80464e3);

// UNSUPPORTED Rust 1420:1: non-scalar type Ptr unsupported
// pub const GLOBAL_LOGGER_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("GlobalLogger");

// UNSUPPORTED Rust 1421:1: non-scalar type Ptr unsupported
// pub const GLOBAL_LOGGER_NAMEA: windows_sys::core::PCSTR = windows_sys::core::s!("GlobalLogger");

// UNSUPPORTED Rust 1422:1: non-scalar type Ptr unsupported
// pub const GLOBAL_LOGGER_NAMEW: windows_sys::core::PCWSTR = windows_sys::core::w!("GlobalLogger");

// UNSUPPORTED Rust 1423:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const ImageLoadGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2cb15d1d_5fc1_11d2_abe1_00a0c911f518);

// UNSUPPORTED Rust 1424:1: non-scalar type Ptr unsupported
// pub const KERNEL_LOGGER_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("NT Kernel Logger");

// UNSUPPORTED Rust 1425:1: non-scalar type Ptr unsupported
// pub const KERNEL_LOGGER_NAMEA: windows_sys::core::PCSTR = windows_sys::core::s!("NT Kernel Logger");

// UNSUPPORTED Rust 1426:1: non-scalar type Ptr unsupported
// pub const KERNEL_LOGGER_NAMEW: windows_sys::core::PCWSTR = windows_sys::core::w!("NT Kernel Logger");

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
// UNSUPPORTED Rust 1438:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct MOF_FIELD {
//     pub DataPtr: u64,
//     pub Length: u32,
//     pub DataType: u32,
// }

public const val `MaxEventInfo`: `EVENT_INFO_CLASS` = 4;
public const val `MaxTraceSetInfoClass`: `TRACE_QUERY_INFO_CLASS` = 28;
// UNSUPPORTED Rust 1447:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct OFFSETINSTANCEDATAANDLENGTH {
//     pub OffsetInstanceData: u32,
//     pub LengthInstanceData: u32,
// }

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
// UNSUPPORTED Rust 1467:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PAYLOAD_FILTER_PREDICATE {
//     pub FieldName: windows_sys::core::PWSTR,
//     pub CompareOp: u16,
//     pub Value: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 1474:1: declaration Impl has no candidate rule
// impl Default for PAYLOAD_FILTER_PREDICATE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `PAYLOAD_OPERATOR` = Int;
// UNSUPPORTED Rust 1480:1: generic scalar type unsupported
// pub type PENABLECALLBACK = Option<unsafe extern "system" fn(sourceid: *const windows_sys::core::GUID, isenabled: ENABLECALLBACK_ENABLED_STATE, level: u8, matchanykeyword: u64, matchallkeyword: u64, filterdata: *const EVENT_FILTER_DESCRIPTOR, callbackcontext: *mut core::ffi::c_void)>;

// UNSUPPORTED Rust 1481:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Time")]
// pub type PETW_BUFFER_CALLBACK = Option<unsafe extern "system" fn(buffer: *const ETW_BUFFER_HEADER, buffersize: u32, consumerinfo: *const ETW_BUFFER_CALLBACK_INFORMATION, callbackcontext: *const core::ffi::c_void) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 1483:1: generic scalar type unsupported
// pub type PETW_BUFFER_COMPLETION_CALLBACK = Option<unsafe extern "system" fn(buffer: *const ETW_BUFFER_HEADER, callbackcontext: *const core::ffi::c_void)>;

// UNSUPPORTED Rust 1484:1: generic scalar type unsupported
// pub type PEVENT_CALLBACK = Option<unsafe extern "system" fn(pevent: *mut EVENT_TRACE)>;

// UNSUPPORTED Rust 1485:1: generic scalar type unsupported
// pub type PEVENT_RECORD_CALLBACK = Option<unsafe extern "system" fn(eventrecord: *mut EVENT_RECORD)>;

// UNSUPPORTED Rust 1486:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Time")]
// pub type PEVENT_TRACE_BUFFER_CALLBACKA = Option<unsafe extern "system" fn(logfile: *mut EVENT_TRACE_LOGFILEA) -> u32>;

// UNSUPPORTED Rust 1488:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Time")]
// pub type PEVENT_TRACE_BUFFER_CALLBACKW = Option<unsafe extern "system" fn(logfile: *mut EVENT_TRACE_LOGFILEW) -> u32>;

// UNSUPPORTED Rust 1490:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PROCESSTRACE_HANDLE {
//     pub Value: u64,
// }

public const val `PROCESS_TRACE_MODE_EVENT_RECORD`: UInt = 268435456u;
public const val `PROCESS_TRACE_MODE_RAW_TIMESTAMP`: UInt = 4096u;
public const val `PROCESS_TRACE_MODE_REAL_TIME`: UInt = 256u;
// UNSUPPORTED Rust 1498:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PROFILE_SOURCE_INFO {
//     pub NextEntryOffset: u32,
//     pub Source: u32,
//     pub MinInterval: u32,
//     pub MaxInterval: u32,
//     pub Reserved: u64,
//     pub Description: [u16; 1],
// }

// UNSUPPORTED Rust 1508:1: declaration Impl has no candidate rule
// impl Default for PROFILE_SOURCE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1513:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PROPERTY_DATA_DESCRIPTOR {
//     pub PropertyName: u64,
//     pub ArrayIndex: u32,
//     pub Reserved: u32,
// }

public typealias `PROPERTY_FLAGS` = Int;
// UNSUPPORTED Rust 1521:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PROVIDER_ENUMERATION_INFO {
//     pub NumberOfProviders: u32,
//     pub Reserved: u32,
//     pub TraceProviderInfoArray: [TRACE_PROVIDER_INFO; 1],
// }

// UNSUPPORTED Rust 1528:1: declaration Impl has no candidate rule
// impl Default for PROVIDER_ENUMERATION_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1533:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PROVIDER_EVENT_INFO {
//     pub NumberOfEvents: u32,
//     pub Reserved: u32,
//     pub EventDescriptorsArray: [EVENT_DESCRIPTOR; 1],
// }

// UNSUPPORTED Rust 1540:1: declaration Impl has no candidate rule
// impl Default for PROVIDER_EVENT_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1545:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PROVIDER_FIELD_INFO {
//     pub NameOffset: u32,
//     pub DescriptionOffset: u32,
//     pub Value: u64,
// }

// UNSUPPORTED Rust 1552:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PROVIDER_FIELD_INFOARRAY {
//     pub NumberOfElements: u32,
//     pub FieldType: EVENT_FIELD_TYPE,
//     pub FieldInfoArray: [PROVIDER_FIELD_INFO; 1],
// }

// UNSUPPORTED Rust 1559:1: declaration Impl has no candidate rule
// impl Default for PROVIDER_FIELD_INFOARRAY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1564:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PROVIDER_FILTER_INFO {
//     pub Id: u8,
//     pub Version: u8,
//     pub MessageOffset: u32,
//     pub Reserved: u32,
//     pub PropertyCount: u32,
//     pub EventPropertyInfoArray: [EVENT_PROPERTY_INFO; 1],
// }

// UNSUPPORTED Rust 1574:1: declaration Impl has no candidate rule
// impl Default for PROVIDER_FILTER_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1579:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const PageFaultGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3d6fa8d3_fe05_11d0_9dda_00c04fd7ba7c);

// UNSUPPORTED Rust 1580:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const PerfInfoGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xce1dbfb4_137e_4da6_87b0_3f59aa102cbc);

// UNSUPPORTED Rust 1581:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const PrivateLoggerNotificationGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3595ab5c_042a_4c8e_b942_2d059bfeb1b1);

// UNSUPPORTED Rust 1582:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
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
// UNSUPPORTED Rust 1592:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct RELOGSTREAM_HANDLE {
//     pub Value: u64,
// }

// UNSUPPORTED Rust 1597:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
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
// UNSUPPORTED Rust 1693:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const SplitIoGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd837ca92_12b9_44a5_ad6a_3a65b3578aa8);

// UNSUPPORTED Rust 1694:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const SystemAlpcProviderGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfcb9baaf_e529_4980_92e9_ced1a6aadfdf);

// UNSUPPORTED Rust 1695:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const SystemConfigProviderGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfef3a8b6_318d_4b67_a96a_3b0f6b8f18fe);

// UNSUPPORTED Rust 1696:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const SystemCpuProviderGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc6c5265f_eae8_4650_aae4_9d48603d8510);

// UNSUPPORTED Rust 1697:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const SystemHypervisorProviderGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbafa072a_918a_4bed_b622_bc152097098f);

// UNSUPPORTED Rust 1698:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const SystemInterruptProviderGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd4bbee17_b545_4888_858b_744169015b25);

// UNSUPPORTED Rust 1699:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const SystemIoFilterProviderGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfbd09363_9e22_4661_b8bf_e7a34b535b8c);

// UNSUPPORTED Rust 1700:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const SystemIoProviderGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3d5c43e3_0f1c_4202_b817_174c0070dc79);

// UNSUPPORTED Rust 1701:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const SystemLockProviderGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x721ddfd3_dacc_4e1e_b26a_a2cb31d4705a);

// UNSUPPORTED Rust 1702:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const SystemMemoryProviderGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x82958ca9_b6cd_47f8_a3a8_03ae85a4bc24);

// UNSUPPORTED Rust 1703:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const SystemObjectProviderGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfebd7460_3d1d_47eb_af49_c9eeb1e146f2);

// UNSUPPORTED Rust 1704:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const SystemPowerProviderGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc134884a_32d5_4488_80e5_14ed7abb8269);

// UNSUPPORTED Rust 1705:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const SystemProcessProviderGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x151f55dc_467d_471f_83b5_5f889d46ff66);

// UNSUPPORTED Rust 1706:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const SystemProfileProviderGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbfeb0324_1cee_496f_a409_2ac2b48a6322);

// UNSUPPORTED Rust 1707:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const SystemRegistryProviderGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x16156bd9_fab4_4cfa_a232_89d1099058e3);

// UNSUPPORTED Rust 1708:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const SystemSchedulerProviderGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x599a2a76_4d91_4910_9ac7_7d33f2e97a6c);

// UNSUPPORTED Rust 1709:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const SystemSyscallProviderGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x434286f7_6f1b_45bb_b37e_95f623046c7c);

// UNSUPPORTED Rust 1710:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const SystemTimerProviderGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4f061568_e215_499f_ab2e_eda0ae890a5b);

// UNSUPPORTED Rust 1711:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const SystemTraceControlGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9e814aad_3204_11d2_9a82_006008a86939);

// UNSUPPORTED Rust 1712:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct TDH_CONTEXT {
//     pub ParameterValue: u64,
//     pub ParameterType: TDH_CONTEXT_TYPE,
//     pub ParameterSize: u32,
// }

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
// UNSUPPORTED Rust 1818:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct TRACE_ENABLE_INFO {
//     pub IsEnabled: u32,
//     pub Level: u8,
//     pub Reserved1: u8,
//     pub LoggerId: u16,
//     pub EnableProperty: u32,
//     pub Reserved2: u32,
//     pub MatchAnyKeyword: u64,
//     pub MatchAllKeyword: u64,
// }

// UNSUPPORTED Rust 1830:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct TRACE_EVENT_INFO {
//     pub ProviderGuid: windows_sys::core::GUID,
//     pub EventGuid: windows_sys::core::GUID,
//     pub EventDescriptor: EVENT_DESCRIPTOR,
//     pub DecodingSource: DECODING_SOURCE,
//     pub ProviderNameOffset: u32,
//     pub LevelNameOffset: u32,
//     pub ChannelNameOffset: u32,
//     pub KeywordsNameOffset: u32,
//     pub TaskNameOffset: u32,
//     pub OpcodeNameOffset: u32,
//     pub EventMessageOffset: u32,
//     pub ProviderMessageOffset: u32,
//     pub BinaryXMLOffset: u32,
//     pub BinaryXMLSize: u32,
//     pub Anonymous1: TRACE_EVENT_INFO_0,
//     pub Anonymous2: TRACE_EVENT_INFO_1,
//     pub PropertyCount: u32,
//     pub TopLevelPropertyCount: u32,
//     pub Anonymous3: TRACE_EVENT_INFO_2,
//     pub EventPropertyInfoArray: [EVENT_PROPERTY_INFO; 1],
// }

// UNSUPPORTED Rust 1854:1: declaration Impl has no candidate rule
// impl Default for TRACE_EVENT_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1859:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union TRACE_EVENT_INFO_0 {
//     pub EventNameOffset: u32,
//     pub ActivityIDNameOffset: u32,
// }

// UNSUPPORTED Rust 1865:1: declaration Impl has no candidate rule
// impl Default for TRACE_EVENT_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1870:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union TRACE_EVENT_INFO_1 {
//     pub EventAttributesOffset: u32,
//     pub RelatedActivityIDNameOffset: u32,
// }

// UNSUPPORTED Rust 1876:1: declaration Impl has no candidate rule
// impl Default for TRACE_EVENT_INFO_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1881:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union TRACE_EVENT_INFO_2 {
//     pub Flags: TEMPLATE_FLAGS,
//     pub Anonymous: TRACE_EVENT_INFO_2_0,
// }

// UNSUPPORTED Rust 1887:1: declaration Impl has no candidate rule
// impl Default for TRACE_EVENT_INFO_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1892:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct TRACE_EVENT_INFO_2_0 {
//     pub _bitfield: u32,
// }

// UNSUPPORTED Rust 1897:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct TRACE_GUID_INFO {
//     pub InstanceCount: u32,
//     pub Reserved: u32,
// }

// UNSUPPORTED Rust 1903:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct TRACE_GUID_PROPERTIES {
//     pub Guid: windows_sys::core::GUID,
//     pub GuidType: u32,
//     pub LoggerId: u32,
//     pub EnableLevel: u32,
//     pub EnableFlags: u32,
//     pub IsEnable: bool,
// }

// UNSUPPORTED Rust 1913:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct TRACE_GUID_REGISTRATION {
//     pub Guid: *const windows_sys::core::GUID,
//     pub RegHandle: super::super::super::Foundation::HANDLE,
// }

// UNSUPPORTED Rust 1919:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 1940:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Time")]
// #[derive(Clone, Copy)]
// pub struct TRACE_LOGFILE_HEADER {
//     pub BufferSize: u32,
//     pub Anonymous1: TRACE_LOGFILE_HEADER_0,
//     pub ProviderVersion: u32,
//     pub NumberOfProcessors: u32,
//     pub EndTime: i64,
//     pub TimerResolution: u32,
//     pub MaximumFileSize: u32,
//     pub LogFileMode: u32,
//     pub BuffersWritten: u32,
//     pub Anonymous2: TRACE_LOGFILE_HEADER_1,
//     pub LoggerName: windows_sys::core::PWSTR,
//     pub LogFileName: windows_sys::core::PWSTR,
//     pub TimeZone: super::super::Time::TIME_ZONE_INFORMATION,
//     pub BootTime: i64,
//     pub PerfFreq: i64,
//     pub StartTime: i64,
//     pub ReservedFlags: u32,
//     pub BuffersLost: u32,
// }

// UNSUPPORTED Rust 1963:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Time")]
// impl Default for TRACE_LOGFILE_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1969:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Time")]
// #[derive(Clone, Copy)]
// pub union TRACE_LOGFILE_HEADER_0 {
//     pub Version: u32,
//     pub VersionDetail: TRACE_LOGFILE_HEADER_0_0,
// }

// UNSUPPORTED Rust 1976:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Time")]
// impl Default for TRACE_LOGFILE_HEADER_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1982:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Time")]
// #[derive(Clone, Copy, Default)]
// pub struct TRACE_LOGFILE_HEADER_0_0 {
//     pub MajorVersion: u8,
//     pub MinorVersion: u8,
//     pub SubVersion: u8,
//     pub SubMinorVersion: u8,
// }

// UNSUPPORTED Rust 1991:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Time")]
// #[derive(Clone, Copy)]
// pub union TRACE_LOGFILE_HEADER_1 {
//     pub LogInstanceGuid: windows_sys::core::GUID,
//     pub Anonymous: TRACE_LOGFILE_HEADER_1_0,
// }

// UNSUPPORTED Rust 1998:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Time")]
// impl Default for TRACE_LOGFILE_HEADER_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2004:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Time")]
// #[derive(Clone, Copy, Default)]
// pub struct TRACE_LOGFILE_HEADER_1_0 {
//     pub StartBuffers: u32,
//     pub PointerSize: u32,
//     pub EventsLost: u32,
//     pub CpuSpeedInMHz: u32,
// }

// UNSUPPORTED Rust 2013:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Time")]
// #[derive(Clone, Copy)]
// pub struct TRACE_LOGFILE_HEADER32 {
//     pub BufferSize: u32,
//     pub Anonymous1: TRACE_LOGFILE_HEADER32_0,
//     pub ProviderVersion: u32,
//     pub NumberOfProcessors: u32,
//     pub EndTime: i64,
//     pub TimerResolution: u32,
//     pub MaximumFileSize: u32,
//     pub LogFileMode: u32,
//     pub BuffersWritten: u32,
//     pub Anonymous2: TRACE_LOGFILE_HEADER32_1,
//     pub LoggerName: u32,
//     pub LogFileName: u32,
//     pub TimeZone: super::super::Time::TIME_ZONE_INFORMATION,
//     pub BootTime: i64,
//     pub PerfFreq: i64,
//     pub StartTime: i64,
//     pub ReservedFlags: u32,
//     pub BuffersLost: u32,
// }

// UNSUPPORTED Rust 2036:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Time")]
// impl Default for TRACE_LOGFILE_HEADER32 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2042:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Time")]
// #[derive(Clone, Copy)]
// pub union TRACE_LOGFILE_HEADER32_0 {
//     pub Version: u32,
//     pub VersionDetail: TRACE_LOGFILE_HEADER32_0_0,
// }

// UNSUPPORTED Rust 2049:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Time")]
// impl Default for TRACE_LOGFILE_HEADER32_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2055:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Time")]
// #[derive(Clone, Copy, Default)]
// pub struct TRACE_LOGFILE_HEADER32_0_0 {
//     pub MajorVersion: u8,
//     pub MinorVersion: u8,
//     pub SubVersion: u8,
//     pub SubMinorVersion: u8,
// }

// UNSUPPORTED Rust 2064:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Time")]
// #[derive(Clone, Copy)]
// pub union TRACE_LOGFILE_HEADER32_1 {
//     pub LogInstanceGuid: windows_sys::core::GUID,
//     pub Anonymous: TRACE_LOGFILE_HEADER32_1_0,
// }

// UNSUPPORTED Rust 2071:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Time")]
// impl Default for TRACE_LOGFILE_HEADER32_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2077:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Time")]
// #[derive(Clone, Copy, Default)]
// pub struct TRACE_LOGFILE_HEADER32_1_0 {
//     pub StartBuffers: u32,
//     pub PointerSize: u32,
//     pub EventsLost: u32,
//     pub CpuSpeedInMHz: u32,
// }

// UNSUPPORTED Rust 2086:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Time")]
// #[derive(Clone, Copy)]
// pub struct TRACE_LOGFILE_HEADER64 {
//     pub BufferSize: u32,
//     pub Anonymous1: TRACE_LOGFILE_HEADER64_0,
//     pub ProviderVersion: u32,
//     pub NumberOfProcessors: u32,
//     pub EndTime: i64,
//     pub TimerResolution: u32,
//     pub MaximumFileSize: u32,
//     pub LogFileMode: u32,
//     pub BuffersWritten: u32,
//     pub Anonymous2: TRACE_LOGFILE_HEADER64_1,
//     pub LoggerName: u64,
//     pub LogFileName: u64,
//     pub TimeZone: super::super::Time::TIME_ZONE_INFORMATION,
//     pub BootTime: i64,
//     pub PerfFreq: i64,
//     pub StartTime: i64,
//     pub ReservedFlags: u32,
//     pub BuffersLost: u32,
// }

// UNSUPPORTED Rust 2109:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Time")]
// impl Default for TRACE_LOGFILE_HEADER64 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2115:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Time")]
// #[derive(Clone, Copy)]
// pub union TRACE_LOGFILE_HEADER64_0 {
//     pub Version: u32,
//     pub VersionDetail: TRACE_LOGFILE_HEADER64_0_0,
// }

// UNSUPPORTED Rust 2122:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Time")]
// impl Default for TRACE_LOGFILE_HEADER64_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2128:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Time")]
// #[derive(Clone, Copy, Default)]
// pub struct TRACE_LOGFILE_HEADER64_0_0 {
//     pub MajorVersion: u8,
//     pub MinorVersion: u8,
//     pub SubVersion: u8,
//     pub SubMinorVersion: u8,
// }

// UNSUPPORTED Rust 2137:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Time")]
// #[derive(Clone, Copy)]
// pub union TRACE_LOGFILE_HEADER64_1 {
//     pub LogInstanceGuid: windows_sys::core::GUID,
//     pub Anonymous: TRACE_LOGFILE_HEADER64_1_0,
// }

// UNSUPPORTED Rust 2144:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Time")]
// impl Default for TRACE_LOGFILE_HEADER64_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2150:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Time")]
// #[derive(Clone, Copy, Default)]
// pub struct TRACE_LOGFILE_HEADER64_1_0 {
//     pub StartBuffers: u32,
//     pub PointerSize: u32,
//     pub EventsLost: u32,
//     pub CpuSpeedInMHz: u32,
// }

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
// UNSUPPORTED Rust 2169:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct TRACE_PERIODIC_CAPTURE_STATE_INFO {
//     pub CaptureStateFrequencyInSeconds: u32,
//     pub ProviderCount: u16,
//     pub Reserved: u16,
// }

// UNSUPPORTED Rust 2176:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct TRACE_PROFILE_INTERVAL {
//     pub Source: u32,
//     pub Interval: u32,
// }

public const val `TRACE_PROVIDER_FLAG_LEGACY`: UInt = 1u;
public const val `TRACE_PROVIDER_FLAG_PRE_ENABLE`: UInt = 2u;
// UNSUPPORTED Rust 2184:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct TRACE_PROVIDER_INFO {
//     pub ProviderGuid: windows_sys::core::GUID,
//     pub SchemaSource: u32,
//     pub ProviderNameOffset: u32,
// }

// UNSUPPORTED Rust 2191:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct TRACE_PROVIDER_INSTANCE_INFO {
//     pub NextOffset: u32,
//     pub EnableCount: u32,
//     pub Pid: u32,
//     pub Flags: u32,
// }

public typealias `TRACE_QUERY_INFO_CLASS` = Int;
// UNSUPPORTED Rust 2200:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct TRACE_STACK_CACHING_INFO {
//     pub Enabled: bool,
//     pub CacheSize: u32,
//     pub BucketCount: u32,
// }

// UNSUPPORTED Rust 2207:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct TRACE_VERSION_INFO {
//     pub EtwTraceProcessingVersion: u32,
//     pub Reserved: u32,
// }

// UNSUPPORTED Rust 2213:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const TcpIpGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9a280ac0_c8e0_11d1_84e2_00c04fb998a2);

// UNSUPPORTED Rust 2214:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
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
// UNSUPPORTED Rust 2243:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const UdpIpGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbf3a50c5_a9c9_4988_a005_2df0b7c80f80);

// UNSUPPORTED Rust 2244:1: generic scalar type unsupported
// pub type WMIDPREQUEST = Option<unsafe extern "system" fn(requestcode: WMIDPREQUESTCODE, requestcontext: *const core::ffi::c_void, buffersize: *mut u32, buffer: *mut core::ffi::c_void) -> u32>;

public typealias `WMIDPREQUESTCODE` = Int;
public const val `WMIGUID_EXECUTE`: UInt = 16u;
public const val `WMIGUID_NOTIFICATION`: UInt = 4u;
public const val `WMIGUID_QUERY`: UInt = 1u;
public const val `WMIGUID_READ_DESCRIPTION`: UInt = 8u;
public const val `WMIGUID_SET`: UInt = 2u;
// UNSUPPORTED Rust 2251:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WMIREGGUIDW {
//     pub Guid: windows_sys::core::GUID,
//     pub Flags: u32,
//     pub InstanceCount: u32,
//     pub Anonymous: WMIREGGUIDW_0,
// }

// UNSUPPORTED Rust 2259:1: declaration Impl has no candidate rule
// impl Default for WMIREGGUIDW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2264:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WMIREGGUIDW_0 {
//     pub InstanceNameList: u32,
//     pub BaseNameOffset: u32,
//     pub Pdo: usize,
//     pub InstanceInfo: usize,
// }

// UNSUPPORTED Rust 2272:1: declaration Impl has no candidate rule
// impl Default for WMIREGGUIDW_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2277:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WMIREGINFOW {
//     pub BufferSize: u32,
//     pub NextWmiRegInfo: u32,
//     pub RegistryPath: u32,
//     pub MofResourceName: u32,
//     pub GuidCount: u32,
//     pub WmiRegGuid: [WMIREGGUIDW; 1],
// }

// UNSUPPORTED Rust 2287:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 2318:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WNODE_ALL_DATA {
//     pub WnodeHeader: WNODE_HEADER,
//     pub DataBlockOffset: u32,
//     pub InstanceCount: u32,
//     pub OffsetInstanceNameOffsets: u32,
//     pub Anonymous: WNODE_ALL_DATA_0,
// }

// UNSUPPORTED Rust 2327:1: declaration Impl has no candidate rule
// impl Default for WNODE_ALL_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2332:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WNODE_ALL_DATA_0 {
//     pub FixedInstanceSize: u32,
//     pub OffsetInstanceDataAndLength: [OFFSETINSTANCEDATAANDLENGTH; 1],
// }

// UNSUPPORTED Rust 2338:1: declaration Impl has no candidate rule
// impl Default for WNODE_ALL_DATA_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2343:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WNODE_EVENT_ITEM {
//     pub WnodeHeader: WNODE_HEADER,
// }

// UNSUPPORTED Rust 2348:1: declaration Impl has no candidate rule
// impl Default for WNODE_EVENT_ITEM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2353:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WNODE_EVENT_REFERENCE {
//     pub WnodeHeader: WNODE_HEADER,
//     pub TargetGuid: windows_sys::core::GUID,
//     pub TargetDataBlockSize: u32,
//     pub Anonymous: WNODE_EVENT_REFERENCE_0,
// }

// UNSUPPORTED Rust 2361:1: declaration Impl has no candidate rule
// impl Default for WNODE_EVENT_REFERENCE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2366:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WNODE_EVENT_REFERENCE_0 {
//     pub TargetInstanceIndex: u32,
//     pub TargetInstanceName: [u16; 1],
// }

// UNSUPPORTED Rust 2372:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 2400:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WNODE_HEADER {
//     pub BufferSize: u32,
//     pub ProviderId: u32,
//     pub Anonymous1: WNODE_HEADER_0,
//     pub Anonymous2: WNODE_HEADER_1,
//     pub Guid: windows_sys::core::GUID,
//     pub ClientContext: u32,
//     pub Flags: u32,
// }

// UNSUPPORTED Rust 2411:1: declaration Impl has no candidate rule
// impl Default for WNODE_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2416:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WNODE_HEADER_0 {
//     pub HistoricalContext: u64,
//     pub Anonymous: WNODE_HEADER_0_0,
// }

// UNSUPPORTED Rust 2422:1: declaration Impl has no candidate rule
// impl Default for WNODE_HEADER_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2427:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WNODE_HEADER_0_0 {
//     pub Version: u32,
//     pub Linkage: u32,
// }

// UNSUPPORTED Rust 2433:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WNODE_HEADER_1 {
//     pub CountLost: u32,
//     pub KernelHandle: super::super::super::Foundation::HANDLE,
//     pub TimeStamp: i64,
// }

// UNSUPPORTED Rust 2440:1: declaration Impl has no candidate rule
// impl Default for WNODE_HEADER_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2445:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WNODE_METHOD_ITEM {
//     pub WnodeHeader: WNODE_HEADER,
//     pub OffsetInstanceName: u32,
//     pub InstanceIndex: u32,
//     pub MethodId: u32,
//     pub DataBlockOffset: u32,
//     pub SizeDataBlock: u32,
//     pub VariableData: [u8; 1],
// }

// UNSUPPORTED Rust 2456:1: declaration Impl has no candidate rule
// impl Default for WNODE_METHOD_ITEM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2461:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WNODE_SINGLE_INSTANCE {
//     pub WnodeHeader: WNODE_HEADER,
//     pub OffsetInstanceName: u32,
//     pub InstanceIndex: u32,
//     pub DataBlockOffset: u32,
//     pub SizeDataBlock: u32,
//     pub VariableData: [u8; 1],
// }

// UNSUPPORTED Rust 2471:1: declaration Impl has no candidate rule
// impl Default for WNODE_SINGLE_INSTANCE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2476:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WNODE_SINGLE_ITEM {
//     pub WnodeHeader: WNODE_HEADER,
//     pub OffsetInstanceName: u32,
//     pub InstanceIndex: u32,
//     pub ItemId: u32,
//     pub DataBlockOffset: u32,
//     pub SizeDataItem: u32,
//     pub VariableData: [u8; 1],
// }

// UNSUPPORTED Rust 2487:1: declaration Impl has no candidate rule
// impl Default for WNODE_SINGLE_ITEM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2492:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WNODE_TOO_SMALL {
//     pub WnodeHeader: WNODE_HEADER,
//     pub SizeNeeded: u32,
// }

// UNSUPPORTED Rust 2498:1: declaration Impl has no candidate rule
// impl Default for WNODE_TOO_SMALL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `_TDH_IN_TYPE` = Int;
public typealias `_TDH_OUT_TYPE` = Int;
