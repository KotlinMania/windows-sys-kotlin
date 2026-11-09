@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw

import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.WIN32_ERROR
import io.github.kotlinmania.windowssys.windows.win32.security.PSECURITY_DESCRIPTOR
import io.github.kotlinmania.windowssys.windows.win32.security.PSID

public actual fun CloseTrace(tracehandle: PROCESSTRACE_HANDLE): WIN32_ERROR =
    0u

public actual fun ControlTraceA(tracehandle: CONTROLTRACE_HANDLE, instancename: PCSTR, properties: Long, controlcode: EVENT_TRACE_CONTROL): WIN32_ERROR =
    0u

public actual fun ControlTraceW(tracehandle: CONTROLTRACE_HANDLE, instancename: PCWSTR, properties: Long, controlcode: EVENT_TRACE_CONTROL): WIN32_ERROR =
    0u

public actual fun CreateTraceInstanceId(reghandle: HANDLE, instinfo: Long): WIN32_ERROR =
    0u

public actual fun CveEventWrite(cveid: PCWSTR, additionaldetails: PCWSTR): Int =
    0

public actual fun EnableTrace(enable: UInt, enableflag: UInt, enablelevel: UInt, controlguid: Long, tracehandle: CONTROLTRACE_HANDLE): WIN32_ERROR =
    0u

public actual fun EnableTraceEx(providerid: Long, sourceid: Long, tracehandle: CONTROLTRACE_HANDLE, isenabled: UInt, level: UByte, matchanykeyword: ULong, matchallkeyword: ULong, enableproperty: UInt, enablefilterdesc: Long): WIN32_ERROR =
    0u

public actual fun EnableTraceEx2(tracehandle: CONTROLTRACE_HANDLE, providerid: Long, controlcode: UInt, level: UByte, matchanykeyword: ULong, matchallkeyword: ULong, timeout: UInt, enableparameters: Long): WIN32_ERROR =
    0u

public actual fun EnumerateTraceGuids(guidpropertiesarray: Long, propertyarraycount: UInt, guidcount: Long): WIN32_ERROR =
    0u

public actual fun EnumerateTraceGuidsEx(tracequeryinfoclass: TRACE_QUERY_INFO_CLASS, inbuffer: Long, inbuffersize: UInt, outbuffer: Long, outbuffersize: UInt, returnlength: Long): WIN32_ERROR =
    0u

public actual fun EventAccessControl(guid: Long, operation: UInt, sid: PSID, rights: UInt, allowordeny: Boolean): UInt =
    0u

public actual fun EventAccessQuery(guid: Long, buffer: PSECURITY_DESCRIPTOR, buffersize: Long): UInt =
    0u

public actual fun EventAccessRemove(guid: Long): UInt =
    0u

public actual fun EventActivityIdControl(controlcode: UInt, activityid: Long): UInt =
    0u

public actual fun EventEnabled(reghandle: REGHANDLE, eventdescriptor: Long): Boolean =
    false

public actual fun EventProviderEnabled(reghandle: REGHANDLE, level: UByte, keyword: ULong): Boolean =
    false

public actual fun EventRegister(providerid: Long, enablecallback: PENABLECALLBACK, callbackcontext: Long, reghandle: Long): UInt =
    0u

public actual fun EventSetInformation(reghandle: REGHANDLE, informationclass: EVENT_INFO_CLASS, eventinformation: Long, informationlength: UInt): UInt =
    0u

public actual fun EventUnregister(reghandle: REGHANDLE): UInt =
    0u

public actual fun EventWrite(reghandle: REGHANDLE, eventdescriptor: Long, userdatacount: UInt, userdata: Long): UInt =
    0u

public actual fun EventWriteEx(reghandle: REGHANDLE, eventdescriptor: Long, filter: ULong, flags: UInt, activityid: Long, relatedactivityid: Long, userdatacount: UInt, userdata: Long): UInt =
    0u

public actual fun EventWriteString(reghandle: REGHANDLE, level: UByte, keyword: ULong, string: PCWSTR): UInt =
    0u

public actual fun EventWriteTransfer(reghandle: REGHANDLE, eventdescriptor: Long, activityid: Long, relatedactivityid: Long, userdatacount: UInt, userdata: Long): UInt =
    0u

public actual fun FlushTraceA(tracehandle: CONTROLTRACE_HANDLE, instancename: PCSTR, properties: Long): WIN32_ERROR =
    0u

public actual fun FlushTraceW(tracehandle: CONTROLTRACE_HANDLE, instancename: PCWSTR, properties: Long): WIN32_ERROR =
    0u

public actual fun GetTraceEnableFlags(tracehandle: ULong): UInt =
    0u

public actual fun GetTraceEnableLevel(tracehandle: ULong): UByte =
    0u

public actual fun GetTraceLoggerHandle(buffer: Long): ULong =
    0uL

public actual fun OpenTraceA(logfile: Long): PROCESSTRACE_HANDLE =
    PROCESSTRACE_HANDLE()

public actual fun OpenTraceFromBufferStream(options: Long, buffercompletioncallback: PETW_BUFFER_COMPLETION_CALLBACK, buffercompletioncontext: Long): ULong =
    0uL

public actual fun OpenTraceFromFile(logfilename: PCWSTR, options: Long, logfileheader: Long): ULong =
    0uL

public actual fun OpenTraceFromRealTimeLogger(loggername: PCWSTR, options: Long, logfileheader: Long): ULong =
    0uL

public actual fun OpenTraceFromRealTimeLoggerWithAllocationOptions(loggername: PCWSTR, options: Long, allocationsize: ULong, memorypartitionhandle: HANDLE, logfileheader: Long): ULong =
    0uL

public actual fun OpenTraceW(logfile: Long): PROCESSTRACE_HANDLE =
    PROCESSTRACE_HANDLE()

public actual fun ProcessTrace(handlearray: Long, handlecount: UInt, starttime: Long, endtime: Long): WIN32_ERROR =
    0u

public actual fun ProcessTraceAddBufferToBufferStream(tracehandle: ULong, buffer: Long, buffersize: UInt): UInt =
    0u

public actual fun ProcessTraceBufferDecrementReference(buffer: Long): UInt =
    0u

public actual fun ProcessTraceBufferIncrementReference(tracehandle: ULong, buffer: Long): UInt =
    0u

public actual fun QueryAllTracesA(propertyarray: Long, propertyarraycount: UInt, loggercount: Long): WIN32_ERROR =
    0u

public actual fun QueryAllTracesW(propertyarray: Long, propertyarraycount: UInt, loggercount: Long): WIN32_ERROR =
    0u

public actual fun QueryTraceA(tracehandle: CONTROLTRACE_HANDLE, instancename: PCSTR, properties: Long): WIN32_ERROR =
    0u

public actual fun QueryTraceProcessingHandle(processinghandle: PROCESSTRACE_HANDLE, informationclass: ETW_PROCESS_HANDLE_INFO_TYPE, inbuffer: Long, inbuffersize: UInt, outbuffer: Long, outbuffersize: UInt, returnlength: Long): WIN32_ERROR =
    0u

public actual fun QueryTraceW(tracehandle: CONTROLTRACE_HANDLE, instancename: PCWSTR, properties: Long): WIN32_ERROR =
    0u

public actual fun RegisterTraceGuidsA(requestaddress: WMIDPREQUEST, requestcontext: Long, controlguid: Long, guidcount: UInt, traceguidreg: Long, mofimagepath: PCSTR, mofresourcename: PCSTR, registrationhandle: Long): UInt =
    0u

public actual fun RegisterTraceGuidsW(requestaddress: WMIDPREQUEST, requestcontext: Long, controlguid: Long, guidcount: UInt, traceguidreg: Long, mofimagepath: PCWSTR, mofresourcename: PCWSTR, registrationhandle: Long): UInt =
    0u

public actual fun RemoveTraceCallback(pguid: Long): WIN32_ERROR =
    0u

public actual fun SetTraceCallback(pguid: Long, eventcallback: PEVENT_CALLBACK): WIN32_ERROR =
    0u

public actual fun StartTraceA(tracehandle: Long, instancename: PCSTR, properties: Long): WIN32_ERROR =
    0u

public actual fun StartTraceW(tracehandle: Long, instancename: PCWSTR, properties: Long): WIN32_ERROR =
    0u

public actual fun StopTraceA(tracehandle: CONTROLTRACE_HANDLE, instancename: PCSTR, properties: Long): WIN32_ERROR =
    0u

public actual fun StopTraceW(tracehandle: CONTROLTRACE_HANDLE, instancename: PCWSTR, properties: Long): WIN32_ERROR =
    0u

public actual fun TdhAggregatePayloadFilters(payloadfiltercount: UInt, payloadfilterptrs: Long, eventmatchallflags: Long, eventfilterdescriptor: Long): UInt =
    0u

public actual fun TdhCleanupPayloadEventFilterDescriptor(eventfilterdescriptor: Long): UInt =
    0u

public actual fun TdhCloseDecodingHandle(handle: TDH_HANDLE): UInt =
    0u

public actual fun TdhCreatePayloadFilter(providerguid: Long, eventdescriptor: Long, eventmatchany: Boolean, payloadpredicatecount: UInt, payloadpredicates: Long, payloadfilter: Long): UInt =
    0u

public actual fun TdhDeletePayloadFilter(payloadfilter: Long): UInt =
    0u

public actual fun TdhEnumerateManifestProviderEvents(providerguid: Long, buffer: Long, buffersize: Long): UInt =
    0u

public actual fun TdhEnumerateProviderFieldInformation(pguid: Long, eventfieldtype: EVENT_FIELD_TYPE, pbuffer: Long, pbuffersize: Long): UInt =
    0u

public actual fun TdhEnumerateProviderFilters(guid: Long, tdhcontextcount: UInt, tdhcontext: Long, filtercount: Long, buffer: Long, buffersize: Long): UInt =
    0u

public actual fun TdhEnumerateProviders(pbuffer: Long, pbuffersize: Long): UInt =
    0u

public actual fun TdhEnumerateProvidersForDecodingSource(filter: DECODING_SOURCE, buffer: Long, buffersize: UInt, bufferrequired: Long): UInt =
    0u

public actual fun TdhFormatProperty(eventinfo: Long, mapinfo: Long, pointersize: UInt, propertyintype: UShort, propertyouttype: UShort, propertylength: UShort, userdatalength: UShort, userdata: Long, buffersize: Long, buffer: PWSTR, userdataconsumed: Long): UInt =
    0u

public actual fun TdhGetDecodingParameter(handle: TDH_HANDLE, tdhcontext: Long): UInt =
    0u

public actual fun TdhGetEventInformation(event: Long, tdhcontextcount: UInt, tdhcontext: Long, buffer: Long, buffersize: Long): UInt =
    0u

public actual fun TdhGetEventMapInformation(pevent: Long, pmapname: PCWSTR, pbuffer: Long, pbuffersize: Long): UInt =
    0u

public actual fun TdhGetManifestEventInformation(providerguid: Long, eventdescriptor: Long, buffer: Long, buffersize: Long): UInt =
    0u

public actual fun TdhGetProperty(pevent: Long, tdhcontextcount: UInt, ptdhcontext: Long, propertydatacount: UInt, ppropertydata: Long, buffersize: UInt, pbuffer: Long): UInt =
    0u

public actual fun TdhGetPropertySize(pevent: Long, tdhcontextcount: UInt, ptdhcontext: Long, propertydatacount: UInt, ppropertydata: Long, ppropertysize: Long): UInt =
    0u

public actual fun TdhGetWppMessage(handle: TDH_HANDLE, eventrecord: Long, buffersize: Long, buffer: Long): UInt =
    0u

public actual fun TdhGetWppProperty(handle: TDH_HANDLE, eventrecord: Long, propertyname: PCWSTR, buffersize: Long, buffer: Long): UInt =
    0u

public actual fun TdhLoadManifest(manifest: PCWSTR): UInt =
    0u

public actual fun TdhLoadManifestFromBinary(binarypath: PCWSTR): UInt =
    0u

public actual fun TdhLoadManifestFromMemory(pdata: Long, cbdata: UInt): UInt =
    0u

public actual fun TdhOpenDecodingHandle(handle: Long): UInt =
    0u

public actual fun TdhQueryProviderFieldInformation(pguid: Long, eventfieldvalue: ULong, eventfieldtype: EVENT_FIELD_TYPE, pbuffer: Long, pbuffersize: Long): UInt =
    0u

public actual fun TdhSetDecodingParameter(handle: TDH_HANDLE, tdhcontext: Long): UInt =
    0u

public actual fun TdhUnloadManifest(manifest: PCWSTR): UInt =
    0u

public actual fun TdhUnloadManifestFromMemory(pdata: Long, cbdata: UInt): UInt =
    0u

public actual fun TraceEvent(tracehandle: ULong, eventtrace: Long): WIN32_ERROR =
    0u

public actual fun TraceEventInstance(tracehandle: ULong, eventtrace: Long, instinfo: Long, parentinstinfo: Long): UInt =
    0u

public actual fun TraceMessage(loggerhandle: ULong, messageflags: TRACE_MESSAGE_FLAGS, messageguid: Long, messagenumber: UShort): WIN32_ERROR =
    0u

public actual fun TraceMessageVa(loggerhandle: ULong, messageflags: TRACE_MESSAGE_FLAGS, messageguid: Long, messagenumber: UShort, messagearglist: Long): WIN32_ERROR =
    0u

public actual fun TraceQueryInformation(sessionhandle: CONTROLTRACE_HANDLE, informationclass: TRACE_QUERY_INFO_CLASS, traceinformation: Long, informationlength: UInt, returnlength: Long): WIN32_ERROR =
    0u

public actual fun TraceSetInformation(sessionhandle: CONTROLTRACE_HANDLE, informationclass: TRACE_QUERY_INFO_CLASS, traceinformation: Long, informationlength: UInt): WIN32_ERROR =
    0u

public actual fun UnregisterTraceGuids(registrationhandle: ULong): UInt =
    0u

public actual fun UpdateTraceA(tracehandle: CONTROLTRACE_HANDLE, instancename: PCSTR, properties: Long): WIN32_ERROR =
    0u

public actual fun UpdateTraceW(tracehandle: CONTROLTRACE_HANDLE, instancename: PCWSTR, properties: Long): WIN32_ERROR =
    0u
