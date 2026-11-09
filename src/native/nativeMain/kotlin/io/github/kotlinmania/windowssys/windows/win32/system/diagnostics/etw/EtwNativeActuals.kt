@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw

import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.WIN32_ERROR
import io.github.kotlinmania.windowssys.windows.win32.security.PSECURITY_DESCRIPTOR
import io.github.kotlinmania.windowssys.windows.win32.security.PSID
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun CloseTrace(tracehandle: PROCESSTRACE_HANDLE): WIN32_ERROR =
    0u

public actual fun ControlTraceA(tracehandle: CONTROLTRACE_HANDLE, instancename: PCSTR, properties: Long, controlcode: EVENT_TRACE_CONTROL): WIN32_ERROR =
    0u

public actual fun ControlTraceW(tracehandle: CONTROLTRACE_HANDLE, instancename: PCWSTR, properties: Long, controlcode: EVENT_TRACE_CONTROL): WIN32_ERROR =
    0u

public actual fun CreateTraceInstanceId(reghandle: HANDLE, instinfo: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_CreateTraceInstanceId(reghandle.toCPointer<ByteVar>(), instinfo.toCPointer<ByteVar>())

public actual fun CveEventWrite(cveid: PCWSTR, additionaldetails: PCWSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_CveEventWrite(cveid.toCPointer<ByteVar>(), additionaldetails.toCPointer<ByteVar>())

public actual fun EnableTrace(enable: UInt, enableflag: UInt, enablelevel: UInt, controlguid: Long, tracehandle: CONTROLTRACE_HANDLE): WIN32_ERROR =
    0u

public actual fun EnableTraceEx(providerid: Long, sourceid: Long, tracehandle: CONTROLTRACE_HANDLE, isenabled: UInt, level: UByte, matchanykeyword: ULong, matchallkeyword: ULong, enableproperty: UInt, enablefilterdesc: Long): WIN32_ERROR =
    0u

public actual fun EnableTraceEx2(tracehandle: CONTROLTRACE_HANDLE, providerid: Long, controlcode: UInt, level: UByte, matchanykeyword: ULong, matchallkeyword: ULong, timeout: UInt, enableparameters: Long): WIN32_ERROR =
    0u

public actual fun EnumerateTraceGuids(guidpropertiesarray: Long, propertyarraycount: UInt, guidcount: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_EnumerateTraceGuids(guidpropertiesarray.toCPointer<ByteVar>(), propertyarraycount, guidcount.toCPointer<ByteVar>())

public actual fun EnumerateTraceGuidsEx(tracequeryinfoclass: TRACE_QUERY_INFO_CLASS, inbuffer: Long, inbuffersize: UInt, outbuffer: Long, outbuffersize: UInt, returnlength: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_EnumerateTraceGuidsEx(tracequeryinfoclass, inbuffer.toCPointer<ByteVar>(), inbuffersize, outbuffer.toCPointer<ByteVar>(), outbuffersize, returnlength.toCPointer<ByteVar>())

public actual fun EventAccessControl(guid: Long, operation: UInt, sid: PSID, rights: UInt, allowordeny: Boolean): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_EventAccessControl(guid.toCPointer<ByteVar>(), operation, sid.toCPointer<ByteVar>(), rights, allowordeny)

public actual fun EventAccessQuery(guid: Long, buffer: PSECURITY_DESCRIPTOR, buffersize: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_EventAccessQuery(guid.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), buffersize.toCPointer<ByteVar>())

public actual fun EventAccessRemove(guid: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_EventAccessRemove(guid.toCPointer<ByteVar>())

public actual fun EventActivityIdControl(controlcode: UInt, activityid: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_EventActivityIdControl(controlcode, activityid.toCPointer<ByteVar>())

public actual fun EventEnabled(reghandle: REGHANDLE, eventdescriptor: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_EventEnabled(reghandle, eventdescriptor.toCPointer<ByteVar>())

public actual fun EventProviderEnabled(reghandle: REGHANDLE, level: UByte, keyword: ULong): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_EventProviderEnabled(reghandle, level, keyword)

public actual fun EventRegister(providerid: Long, enablecallback: PENABLECALLBACK, callbackcontext: Long, reghandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_EventRegister(providerid.toCPointer<ByteVar>(), enablecallback.toLong().toCPointer<ByteVar>(), callbackcontext.toCPointer<ByteVar>(), reghandle.toCPointer<ByteVar>())

public actual fun EventSetInformation(reghandle: REGHANDLE, informationclass: EVENT_INFO_CLASS, eventinformation: Long, informationlength: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_EventSetInformation(reghandle, informationclass, eventinformation.toCPointer<ByteVar>(), informationlength)

public actual fun EventUnregister(reghandle: REGHANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_EventUnregister(reghandle)

public actual fun EventWrite(reghandle: REGHANDLE, eventdescriptor: Long, userdatacount: UInt, userdata: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_EventWrite(reghandle, eventdescriptor.toCPointer<ByteVar>(), userdatacount, userdata.toCPointer<ByteVar>())

public actual fun EventWriteEx(reghandle: REGHANDLE, eventdescriptor: Long, filter: ULong, flags: UInt, activityid: Long, relatedactivityid: Long, userdatacount: UInt, userdata: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_EventWriteEx(reghandle, eventdescriptor.toCPointer<ByteVar>(), filter, flags, activityid.toCPointer<ByteVar>(), relatedactivityid.toCPointer<ByteVar>(), userdatacount, userdata.toCPointer<ByteVar>())

public actual fun EventWriteString(reghandle: REGHANDLE, level: UByte, keyword: ULong, string: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_EventWriteString(reghandle, level, keyword, string.toCPointer<ByteVar>())

public actual fun EventWriteTransfer(reghandle: REGHANDLE, eventdescriptor: Long, activityid: Long, relatedactivityid: Long, userdatacount: UInt, userdata: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_EventWriteTransfer(reghandle, eventdescriptor.toCPointer<ByteVar>(), activityid.toCPointer<ByteVar>(), relatedactivityid.toCPointer<ByteVar>(), userdatacount, userdata.toCPointer<ByteVar>())

public actual fun FlushTraceA(tracehandle: CONTROLTRACE_HANDLE, instancename: PCSTR, properties: Long): WIN32_ERROR =
    0u

public actual fun FlushTraceW(tracehandle: CONTROLTRACE_HANDLE, instancename: PCWSTR, properties: Long): WIN32_ERROR =
    0u

public actual fun GetTraceEnableFlags(tracehandle: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_GetTraceEnableFlags(tracehandle)

public actual fun GetTraceEnableLevel(tracehandle: ULong): UByte =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_GetTraceEnableLevel(tracehandle)

public actual fun GetTraceLoggerHandle(buffer: Long): ULong =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_GetTraceLoggerHandle(buffer.toCPointer<ByteVar>())

public actual fun OpenTraceA(logfile: Long): PROCESSTRACE_HANDLE =
    PROCESSTRACE_HANDLE()

public actual fun OpenTraceFromBufferStream(options: Long, buffercompletioncallback: PETW_BUFFER_COMPLETION_CALLBACK, buffercompletioncontext: Long): ULong =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_OpenTraceFromBufferStream(options.toCPointer<ByteVar>(), buffercompletioncallback.toLong().toCPointer<ByteVar>(), buffercompletioncontext.toCPointer<ByteVar>())

public actual fun OpenTraceFromFile(logfilename: PCWSTR, options: Long, logfileheader: Long): ULong =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_OpenTraceFromFile(logfilename.toCPointer<ByteVar>(), options.toCPointer<ByteVar>(), logfileheader.toCPointer<ByteVar>())

public actual fun OpenTraceFromRealTimeLogger(loggername: PCWSTR, options: Long, logfileheader: Long): ULong =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_OpenTraceFromRealTimeLogger(loggername.toCPointer<ByteVar>(), options.toCPointer<ByteVar>(), logfileheader.toCPointer<ByteVar>())

public actual fun OpenTraceFromRealTimeLoggerWithAllocationOptions(loggername: PCWSTR, options: Long, allocationsize: ULong, memorypartitionhandle: HANDLE, logfileheader: Long): ULong =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_OpenTraceFromRealTimeLoggerWithAllocationOptions(loggername.toCPointer<ByteVar>(), options.toCPointer<ByteVar>(), allocationsize, memorypartitionhandle.toCPointer<ByteVar>(), logfileheader.toCPointer<ByteVar>())

public actual fun OpenTraceW(logfile: Long): PROCESSTRACE_HANDLE =
    PROCESSTRACE_HANDLE()

public actual fun ProcessTrace(handlearray: Long, handlecount: UInt, starttime: Long, endtime: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_ProcessTrace(handlearray.toCPointer<ByteVar>(), handlecount, starttime.toCPointer<ByteVar>(), endtime.toCPointer<ByteVar>())

public actual fun ProcessTraceAddBufferToBufferStream(tracehandle: ULong, buffer: Long, buffersize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_ProcessTraceAddBufferToBufferStream(tracehandle, buffer.toCPointer<ByteVar>(), buffersize)

public actual fun ProcessTraceBufferDecrementReference(buffer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_ProcessTraceBufferDecrementReference(buffer.toCPointer<ByteVar>())

public actual fun ProcessTraceBufferIncrementReference(tracehandle: ULong, buffer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_ProcessTraceBufferIncrementReference(tracehandle, buffer.toCPointer<ByteVar>())

public actual fun QueryAllTracesA(propertyarray: Long, propertyarraycount: UInt, loggercount: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_QueryAllTracesA(propertyarray.toCPointer<ByteVar>(), propertyarraycount, loggercount.toCPointer<ByteVar>())

public actual fun QueryAllTracesW(propertyarray: Long, propertyarraycount: UInt, loggercount: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_QueryAllTracesW(propertyarray.toCPointer<ByteVar>(), propertyarraycount, loggercount.toCPointer<ByteVar>())

public actual fun QueryTraceA(tracehandle: CONTROLTRACE_HANDLE, instancename: PCSTR, properties: Long): WIN32_ERROR =
    0u

public actual fun QueryTraceProcessingHandle(processinghandle: PROCESSTRACE_HANDLE, informationclass: ETW_PROCESS_HANDLE_INFO_TYPE, inbuffer: Long, inbuffersize: UInt, outbuffer: Long, outbuffersize: UInt, returnlength: Long): WIN32_ERROR =
    0u

public actual fun QueryTraceW(tracehandle: CONTROLTRACE_HANDLE, instancename: PCWSTR, properties: Long): WIN32_ERROR =
    0u

public actual fun RegisterTraceGuidsA(requestaddress: WMIDPREQUEST, requestcontext: Long, controlguid: Long, guidcount: UInt, traceguidreg: Long, mofimagepath: PCSTR, mofresourcename: PCSTR, registrationhandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_RegisterTraceGuidsA(requestaddress.toLong().toCPointer<ByteVar>(), requestcontext.toCPointer<ByteVar>(), controlguid.toCPointer<ByteVar>(), guidcount, traceguidreg.toCPointer<ByteVar>(), mofimagepath.toCPointer<ByteVar>(), mofresourcename.toCPointer<ByteVar>(), registrationhandle.toCPointer<ByteVar>())

public actual fun RegisterTraceGuidsW(requestaddress: WMIDPREQUEST, requestcontext: Long, controlguid: Long, guidcount: UInt, traceguidreg: Long, mofimagepath: PCWSTR, mofresourcename: PCWSTR, registrationhandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_RegisterTraceGuidsW(requestaddress.toLong().toCPointer<ByteVar>(), requestcontext.toCPointer<ByteVar>(), controlguid.toCPointer<ByteVar>(), guidcount, traceguidreg.toCPointer<ByteVar>(), mofimagepath.toCPointer<ByteVar>(), mofresourcename.toCPointer<ByteVar>(), registrationhandle.toCPointer<ByteVar>())

public actual fun RemoveTraceCallback(pguid: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_RemoveTraceCallback(pguid.toCPointer<ByteVar>())

public actual fun SetTraceCallback(pguid: Long, eventcallback: PEVENT_CALLBACK): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_SetTraceCallback(pguid.toCPointer<ByteVar>(), eventcallback.toLong().toCPointer<ByteVar>())

public actual fun StartTraceA(tracehandle: Long, instancename: PCSTR, properties: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_StartTraceA(tracehandle.toCPointer<ByteVar>(), instancename.toCPointer<ByteVar>(), properties.toCPointer<ByteVar>())

public actual fun StartTraceW(tracehandle: Long, instancename: PCWSTR, properties: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_StartTraceW(tracehandle.toCPointer<ByteVar>(), instancename.toCPointer<ByteVar>(), properties.toCPointer<ByteVar>())

public actual fun StopTraceA(tracehandle: CONTROLTRACE_HANDLE, instancename: PCSTR, properties: Long): WIN32_ERROR =
    0u

public actual fun StopTraceW(tracehandle: CONTROLTRACE_HANDLE, instancename: PCWSTR, properties: Long): WIN32_ERROR =
    0u

public actual fun TdhAggregatePayloadFilters(payloadfiltercount: UInt, payloadfilterptrs: Long, eventmatchallflags: Long, eventfilterdescriptor: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_TdhAggregatePayloadFilters(payloadfiltercount, payloadfilterptrs.toCPointer<ByteVar>(), eventmatchallflags.toCPointer<ByteVar>(), eventfilterdescriptor.toCPointer<ByteVar>())

public actual fun TdhCleanupPayloadEventFilterDescriptor(eventfilterdescriptor: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_TdhCleanupPayloadEventFilterDescriptor(eventfilterdescriptor.toCPointer<ByteVar>())

public actual fun TdhCloseDecodingHandle(handle: TDH_HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_TdhCloseDecodingHandle(handle)

public actual fun TdhCreatePayloadFilter(providerguid: Long, eventdescriptor: Long, eventmatchany: Boolean, payloadpredicatecount: UInt, payloadpredicates: Long, payloadfilter: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_TdhCreatePayloadFilter(providerguid.toCPointer<ByteVar>(), eventdescriptor.toCPointer<ByteVar>(), eventmatchany, payloadpredicatecount, payloadpredicates.toCPointer<ByteVar>(), payloadfilter.toCPointer<ByteVar>())

public actual fun TdhDeletePayloadFilter(payloadfilter: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_TdhDeletePayloadFilter(payloadfilter.toCPointer<ByteVar>())

public actual fun TdhEnumerateManifestProviderEvents(providerguid: Long, buffer: Long, buffersize: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_TdhEnumerateManifestProviderEvents(providerguid.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), buffersize.toCPointer<ByteVar>())

public actual fun TdhEnumerateProviderFieldInformation(pguid: Long, eventfieldtype: EVENT_FIELD_TYPE, pbuffer: Long, pbuffersize: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_TdhEnumerateProviderFieldInformation(pguid.toCPointer<ByteVar>(), eventfieldtype, pbuffer.toCPointer<ByteVar>(), pbuffersize.toCPointer<ByteVar>())

public actual fun TdhEnumerateProviderFilters(guid: Long, tdhcontextcount: UInt, tdhcontext: Long, filtercount: Long, buffer: Long, buffersize: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_TdhEnumerateProviderFilters(guid.toCPointer<ByteVar>(), tdhcontextcount, tdhcontext.toCPointer<ByteVar>(), filtercount.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), buffersize.toCPointer<ByteVar>())

public actual fun TdhEnumerateProviders(pbuffer: Long, pbuffersize: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_TdhEnumerateProviders(pbuffer.toCPointer<ByteVar>(), pbuffersize.toCPointer<ByteVar>())

public actual fun TdhEnumerateProvidersForDecodingSource(filter: DECODING_SOURCE, buffer: Long, buffersize: UInt, bufferrequired: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_TdhEnumerateProvidersForDecodingSource(filter, buffer.toCPointer<ByteVar>(), buffersize, bufferrequired.toCPointer<ByteVar>())

public actual fun TdhFormatProperty(eventinfo: Long, mapinfo: Long, pointersize: UInt, propertyintype: UShort, propertyouttype: UShort, propertylength: UShort, userdatalength: UShort, userdata: Long, buffersize: Long, buffer: PWSTR, userdataconsumed: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_TdhFormatProperty(eventinfo.toCPointer<ByteVar>(), mapinfo.toCPointer<ByteVar>(), pointersize, propertyintype, propertyouttype, propertylength, userdatalength, userdata.toCPointer<ByteVar>(), buffersize.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), userdataconsumed.toCPointer<ByteVar>())

public actual fun TdhGetDecodingParameter(handle: TDH_HANDLE, tdhcontext: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_TdhGetDecodingParameter(handle, tdhcontext.toCPointer<ByteVar>())

public actual fun TdhGetEventInformation(event: Long, tdhcontextcount: UInt, tdhcontext: Long, buffer: Long, buffersize: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_TdhGetEventInformation(event.toCPointer<ByteVar>(), tdhcontextcount, tdhcontext.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), buffersize.toCPointer<ByteVar>())

public actual fun TdhGetEventMapInformation(pevent: Long, pmapname: PCWSTR, pbuffer: Long, pbuffersize: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_TdhGetEventMapInformation(pevent.toCPointer<ByteVar>(), pmapname.toCPointer<ByteVar>(), pbuffer.toCPointer<ByteVar>(), pbuffersize.toCPointer<ByteVar>())

public actual fun TdhGetManifestEventInformation(providerguid: Long, eventdescriptor: Long, buffer: Long, buffersize: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_TdhGetManifestEventInformation(providerguid.toCPointer<ByteVar>(), eventdescriptor.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), buffersize.toCPointer<ByteVar>())

public actual fun TdhGetProperty(pevent: Long, tdhcontextcount: UInt, ptdhcontext: Long, propertydatacount: UInt, ppropertydata: Long, buffersize: UInt, pbuffer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_TdhGetProperty(pevent.toCPointer<ByteVar>(), tdhcontextcount, ptdhcontext.toCPointer<ByteVar>(), propertydatacount, ppropertydata.toCPointer<ByteVar>(), buffersize, pbuffer.toCPointer<ByteVar>())

public actual fun TdhGetPropertySize(pevent: Long, tdhcontextcount: UInt, ptdhcontext: Long, propertydatacount: UInt, ppropertydata: Long, ppropertysize: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_TdhGetPropertySize(pevent.toCPointer<ByteVar>(), tdhcontextcount, ptdhcontext.toCPointer<ByteVar>(), propertydatacount, ppropertydata.toCPointer<ByteVar>(), ppropertysize.toCPointer<ByteVar>())

public actual fun TdhGetWppMessage(handle: TDH_HANDLE, eventrecord: Long, buffersize: Long, buffer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_TdhGetWppMessage(handle, eventrecord.toCPointer<ByteVar>(), buffersize.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>())

public actual fun TdhGetWppProperty(handle: TDH_HANDLE, eventrecord: Long, propertyname: PCWSTR, buffersize: Long, buffer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_TdhGetWppProperty(handle, eventrecord.toCPointer<ByteVar>(), propertyname.toCPointer<ByteVar>(), buffersize.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>())

public actual fun TdhLoadManifest(manifest: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_TdhLoadManifest(manifest.toCPointer<ByteVar>())

public actual fun TdhLoadManifestFromBinary(binarypath: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_TdhLoadManifestFromBinary(binarypath.toCPointer<ByteVar>())

public actual fun TdhLoadManifestFromMemory(pdata: Long, cbdata: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_TdhLoadManifestFromMemory(pdata.toCPointer<ByteVar>(), cbdata)

public actual fun TdhOpenDecodingHandle(handle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_TdhOpenDecodingHandle(handle.toCPointer<ByteVar>())

public actual fun TdhQueryProviderFieldInformation(pguid: Long, eventfieldvalue: ULong, eventfieldtype: EVENT_FIELD_TYPE, pbuffer: Long, pbuffersize: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_TdhQueryProviderFieldInformation(pguid.toCPointer<ByteVar>(), eventfieldvalue, eventfieldtype, pbuffer.toCPointer<ByteVar>(), pbuffersize.toCPointer<ByteVar>())

public actual fun TdhSetDecodingParameter(handle: TDH_HANDLE, tdhcontext: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_TdhSetDecodingParameter(handle, tdhcontext.toCPointer<ByteVar>())

public actual fun TdhUnloadManifest(manifest: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_TdhUnloadManifest(manifest.toCPointer<ByteVar>())

public actual fun TdhUnloadManifestFromMemory(pdata: Long, cbdata: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_TdhUnloadManifestFromMemory(pdata.toCPointer<ByteVar>(), cbdata)

public actual fun TraceEvent(tracehandle: ULong, eventtrace: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_TraceEvent(tracehandle, eventtrace.toCPointer<ByteVar>())

public actual fun TraceEventInstance(tracehandle: ULong, eventtrace: Long, instinfo: Long, parentinstinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_TraceEventInstance(tracehandle, eventtrace.toCPointer<ByteVar>(), instinfo.toCPointer<ByteVar>(), parentinstinfo.toCPointer<ByteVar>())

public actual fun TraceMessage(loggerhandle: ULong, messageflags: TRACE_MESSAGE_FLAGS, messageguid: Long, messagenumber: UShort): WIN32_ERROR =
    0u

public actual fun TraceMessageVa(loggerhandle: ULong, messageflags: TRACE_MESSAGE_FLAGS, messageguid: Long, messagenumber: UShort, messagearglist: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_TraceMessageVa(loggerhandle, messageflags, messageguid.toCPointer<ByteVar>(), messagenumber, messagearglist.toCPointer<ByteVar>())

public actual fun TraceQueryInformation(sessionhandle: CONTROLTRACE_HANDLE, informationclass: TRACE_QUERY_INFO_CLASS, traceinformation: Long, informationlength: UInt, returnlength: Long): WIN32_ERROR =
    0u

public actual fun TraceSetInformation(sessionhandle: CONTROLTRACE_HANDLE, informationclass: TRACE_QUERY_INFO_CLASS, traceinformation: Long, informationlength: UInt): WIN32_ERROR =
    0u

public actual fun UnregisterTraceGuids(registrationhandle: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_UnregisterTraceGuids(registrationhandle)

public actual fun UpdateTraceA(tracehandle: CONTROLTRACE_HANDLE, instancename: PCSTR, properties: Long): WIN32_ERROR =
    0u

public actual fun UpdateTraceW(tracehandle: CONTROLTRACE_HANDLE, instancename: PCWSTR, properties: Long): WIN32_ERROR =
    0u
