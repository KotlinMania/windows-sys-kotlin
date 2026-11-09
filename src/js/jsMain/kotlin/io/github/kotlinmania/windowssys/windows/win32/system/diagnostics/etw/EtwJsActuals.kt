@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw

import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.WIN32_ERROR
import io.github.kotlinmania.windowssys.windows.win32.security.PSECURITY_DESCRIPTOR
import io.github.kotlinmania.windowssys.windows.win32.security.PSID

private val _windowsWin32SystemDiagnosticsEtwNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun CloseTrace(tracehandle: PROCESSTRACE_HANDLE): WIN32_ERROR =
    0u

public actual fun ControlTraceA(tracehandle: CONTROLTRACE_HANDLE, instancename: PCSTR, properties: Long, controlcode: EVENT_TRACE_CONTROL): WIN32_ERROR =
    0u

public actual fun ControlTraceW(tracehandle: CONTROLTRACE_HANDLE, instancename: PCWSTR, properties: Long, controlcode: EVENT_TRACE_CONTROL): WIN32_ERROR =
    0u

public actual fun CreateTraceInstanceId(reghandle: HANDLE, instinfo: Long): WIN32_ERROR =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_CreateTraceInstanceId(reghandle.toString(), instinfo.toString()) as Int).toUInt() else 0u

public actual fun CveEventWrite(cveid: PCWSTR, additionaldetails: PCWSTR): Int =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_CveEventWrite(cveid.toString(), additionaldetails.toString()) as Int) else 0

public actual fun EnableTrace(enable: UInt, enableflag: UInt, enablelevel: UInt, controlguid: Long, tracehandle: CONTROLTRACE_HANDLE): WIN32_ERROR =
    0u

public actual fun EnableTraceEx(providerid: Long, sourceid: Long, tracehandle: CONTROLTRACE_HANDLE, isenabled: UInt, level: UByte, matchanykeyword: ULong, matchallkeyword: ULong, enableproperty: UInt, enablefilterdesc: Long): WIN32_ERROR =
    0u

public actual fun EnableTraceEx2(tracehandle: CONTROLTRACE_HANDLE, providerid: Long, controlcode: UInt, level: UByte, matchanykeyword: ULong, matchallkeyword: ULong, timeout: UInt, enableparameters: Long): WIN32_ERROR =
    0u

public actual fun EnumerateTraceGuids(guidpropertiesarray: Long, propertyarraycount: UInt, guidcount: Long): WIN32_ERROR =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_EnumerateTraceGuids(guidpropertiesarray.toString(), propertyarraycount.toInt(), guidcount.toString()) as Int).toUInt() else 0u

public actual fun EnumerateTraceGuidsEx(tracequeryinfoclass: TRACE_QUERY_INFO_CLASS, inbuffer: Long, inbuffersize: UInt, outbuffer: Long, outbuffersize: UInt, returnlength: Long): WIN32_ERROR =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_EnumerateTraceGuidsEx(tracequeryinfoclass, inbuffer.toString(), inbuffersize.toInt(), outbuffer.toString(), outbuffersize.toInt(), returnlength.toString()) as Int).toUInt() else 0u

public actual fun EventAccessControl(guid: Long, operation: UInt, sid: PSID, rights: UInt, allowordeny: Boolean): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_EventAccessControl(guid.toString(), operation.toInt(), sid.toString(), rights.toInt(), allowordeny) as Int).toUInt() else 0u

public actual fun EventAccessQuery(guid: Long, buffer: PSECURITY_DESCRIPTOR, buffersize: Long): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_EventAccessQuery(guid.toString(), buffer.toString(), buffersize.toString()) as Int).toUInt() else 0u

public actual fun EventAccessRemove(guid: Long): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_EventAccessRemove(guid.toString()) as Int).toUInt() else 0u

public actual fun EventActivityIdControl(controlcode: UInt, activityid: Long): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_EventActivityIdControl(controlcode.toInt(), activityid.toString()) as Int).toUInt() else 0u

public actual fun EventEnabled(reghandle: REGHANDLE, eventdescriptor: Long): Boolean =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_EventEnabled(reghandle.toString(), eventdescriptor.toString()) as Boolean) else false

public actual fun EventProviderEnabled(reghandle: REGHANDLE, level: UByte, keyword: ULong): Boolean =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_EventProviderEnabled(reghandle.toString(), level.toInt(), keyword.toString()) as Boolean) else false

public actual fun EventRegister(providerid: Long, enablecallback: PENABLECALLBACK, callbackcontext: Long, reghandle: Long): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_EventRegister(providerid.toString(), enablecallback.toLong().toString(), callbackcontext.toString(), reghandle.toString()) as Int).toUInt() else 0u

public actual fun EventSetInformation(reghandle: REGHANDLE, informationclass: EVENT_INFO_CLASS, eventinformation: Long, informationlength: UInt): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_EventSetInformation(reghandle.toString(), informationclass, eventinformation.toString(), informationlength.toInt()) as Int).toUInt() else 0u

public actual fun EventUnregister(reghandle: REGHANDLE): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_EventUnregister(reghandle.toString()) as Int).toUInt() else 0u

public actual fun EventWrite(reghandle: REGHANDLE, eventdescriptor: Long, userdatacount: UInt, userdata: Long): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_EventWrite(reghandle.toString(), eventdescriptor.toString(), userdatacount.toInt(), userdata.toString()) as Int).toUInt() else 0u

public actual fun EventWriteEx(reghandle: REGHANDLE, eventdescriptor: Long, filter: ULong, flags: UInt, activityid: Long, relatedactivityid: Long, userdatacount: UInt, userdata: Long): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_EventWriteEx(reghandle.toString(), eventdescriptor.toString(), filter.toString(), flags.toInt(), activityid.toString(), relatedactivityid.toString(), userdatacount.toInt(), userdata.toString()) as Int).toUInt() else 0u

public actual fun EventWriteString(reghandle: REGHANDLE, level: UByte, keyword: ULong, string: PCWSTR): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_EventWriteString(reghandle.toString(), level.toInt(), keyword.toString(), string.toString()) as Int).toUInt() else 0u

public actual fun EventWriteTransfer(reghandle: REGHANDLE, eventdescriptor: Long, activityid: Long, relatedactivityid: Long, userdatacount: UInt, userdata: Long): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_EventWriteTransfer(reghandle.toString(), eventdescriptor.toString(), activityid.toString(), relatedactivityid.toString(), userdatacount.toInt(), userdata.toString()) as Int).toUInt() else 0u

public actual fun FlushTraceA(tracehandle: CONTROLTRACE_HANDLE, instancename: PCSTR, properties: Long): WIN32_ERROR =
    0u

public actual fun FlushTraceW(tracehandle: CONTROLTRACE_HANDLE, instancename: PCWSTR, properties: Long): WIN32_ERROR =
    0u

public actual fun GetTraceEnableFlags(tracehandle: ULong): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_GetTraceEnableFlags(tracehandle.toString()) as Int).toUInt() else 0u

public actual fun GetTraceEnableLevel(tracehandle: ULong): UByte =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_GetTraceEnableLevel(tracehandle.toString()) as Int).toUByte() else 0u

public actual fun GetTraceLoggerHandle(buffer: Long): ULong =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_GetTraceLoggerHandle(buffer.toString()) as String).toULong() else 0uL

public actual fun OpenTraceA(logfile: Long): PROCESSTRACE_HANDLE =
    PROCESSTRACE_HANDLE()

public actual fun OpenTraceFromBufferStream(options: Long, buffercompletioncallback: PETW_BUFFER_COMPLETION_CALLBACK, buffercompletioncontext: Long): ULong =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_OpenTraceFromBufferStream(options.toString(), buffercompletioncallback.toLong().toString(), buffercompletioncontext.toString()) as String).toULong() else 0uL

public actual fun OpenTraceFromFile(logfilename: PCWSTR, options: Long, logfileheader: Long): ULong =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_OpenTraceFromFile(logfilename.toString(), options.toString(), logfileheader.toString()) as String).toULong() else 0uL

public actual fun OpenTraceFromRealTimeLogger(loggername: PCWSTR, options: Long, logfileheader: Long): ULong =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_OpenTraceFromRealTimeLogger(loggername.toString(), options.toString(), logfileheader.toString()) as String).toULong() else 0uL

public actual fun OpenTraceFromRealTimeLoggerWithAllocationOptions(loggername: PCWSTR, options: Long, allocationsize: ULong, memorypartitionhandle: HANDLE, logfileheader: Long): ULong =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_OpenTraceFromRealTimeLoggerWithAllocationOptions(loggername.toString(), options.toString(), allocationsize.toString(), memorypartitionhandle.toString(), logfileheader.toString()) as String).toULong() else 0uL

public actual fun OpenTraceW(logfile: Long): PROCESSTRACE_HANDLE =
    PROCESSTRACE_HANDLE()

public actual fun ProcessTrace(handlearray: Long, handlecount: UInt, starttime: Long, endtime: Long): WIN32_ERROR =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_ProcessTrace(handlearray.toString(), handlecount.toInt(), starttime.toString(), endtime.toString()) as Int).toUInt() else 0u

public actual fun ProcessTraceAddBufferToBufferStream(tracehandle: ULong, buffer: Long, buffersize: UInt): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_ProcessTraceAddBufferToBufferStream(tracehandle.toString(), buffer.toString(), buffersize.toInt()) as Int).toUInt() else 0u

public actual fun ProcessTraceBufferDecrementReference(buffer: Long): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_ProcessTraceBufferDecrementReference(buffer.toString()) as Int).toUInt() else 0u

public actual fun ProcessTraceBufferIncrementReference(tracehandle: ULong, buffer: Long): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_ProcessTraceBufferIncrementReference(tracehandle.toString(), buffer.toString()) as Int).toUInt() else 0u

public actual fun QueryAllTracesA(propertyarray: Long, propertyarraycount: UInt, loggercount: Long): WIN32_ERROR =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_QueryAllTracesA(propertyarray.toString(), propertyarraycount.toInt(), loggercount.toString()) as Int).toUInt() else 0u

public actual fun QueryAllTracesW(propertyarray: Long, propertyarraycount: UInt, loggercount: Long): WIN32_ERROR =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_QueryAllTracesW(propertyarray.toString(), propertyarraycount.toInt(), loggercount.toString()) as Int).toUInt() else 0u

public actual fun QueryTraceA(tracehandle: CONTROLTRACE_HANDLE, instancename: PCSTR, properties: Long): WIN32_ERROR =
    0u

public actual fun QueryTraceProcessingHandle(processinghandle: PROCESSTRACE_HANDLE, informationclass: ETW_PROCESS_HANDLE_INFO_TYPE, inbuffer: Long, inbuffersize: UInt, outbuffer: Long, outbuffersize: UInt, returnlength: Long): WIN32_ERROR =
    0u

public actual fun QueryTraceW(tracehandle: CONTROLTRACE_HANDLE, instancename: PCWSTR, properties: Long): WIN32_ERROR =
    0u

public actual fun RegisterTraceGuidsA(requestaddress: WMIDPREQUEST, requestcontext: Long, controlguid: Long, guidcount: UInt, traceguidreg: Long, mofimagepath: PCSTR, mofresourcename: PCSTR, registrationhandle: Long): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_RegisterTraceGuidsA(requestaddress.toLong().toString(), requestcontext.toString(), controlguid.toString(), guidcount.toInt(), traceguidreg.toString(), mofimagepath.toString(), mofresourcename.toString(), registrationhandle.toString()) as Int).toUInt() else 0u

public actual fun RegisterTraceGuidsW(requestaddress: WMIDPREQUEST, requestcontext: Long, controlguid: Long, guidcount: UInt, traceguidreg: Long, mofimagepath: PCWSTR, mofresourcename: PCWSTR, registrationhandle: Long): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_RegisterTraceGuidsW(requestaddress.toLong().toString(), requestcontext.toString(), controlguid.toString(), guidcount.toInt(), traceguidreg.toString(), mofimagepath.toString(), mofresourcename.toString(), registrationhandle.toString()) as Int).toUInt() else 0u

public actual fun RemoveTraceCallback(pguid: Long): WIN32_ERROR =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_RemoveTraceCallback(pguid.toString()) as Int).toUInt() else 0u

public actual fun SetTraceCallback(pguid: Long, eventcallback: PEVENT_CALLBACK): WIN32_ERROR =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_SetTraceCallback(pguid.toString(), eventcallback.toLong().toString()) as Int).toUInt() else 0u

public actual fun StartTraceA(tracehandle: Long, instancename: PCSTR, properties: Long): WIN32_ERROR =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_StartTraceA(tracehandle.toString(), instancename.toString(), properties.toString()) as Int).toUInt() else 0u

public actual fun StartTraceW(tracehandle: Long, instancename: PCWSTR, properties: Long): WIN32_ERROR =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_StartTraceW(tracehandle.toString(), instancename.toString(), properties.toString()) as Int).toUInt() else 0u

public actual fun StopTraceA(tracehandle: CONTROLTRACE_HANDLE, instancename: PCSTR, properties: Long): WIN32_ERROR =
    0u

public actual fun StopTraceW(tracehandle: CONTROLTRACE_HANDLE, instancename: PCWSTR, properties: Long): WIN32_ERROR =
    0u

public actual fun TdhAggregatePayloadFilters(payloadfiltercount: UInt, payloadfilterptrs: Long, eventmatchallflags: Long, eventfilterdescriptor: Long): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_TdhAggregatePayloadFilters(payloadfiltercount.toInt(), payloadfilterptrs.toString(), eventmatchallflags.toString(), eventfilterdescriptor.toString()) as Int).toUInt() else 0u

public actual fun TdhCleanupPayloadEventFilterDescriptor(eventfilterdescriptor: Long): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_TdhCleanupPayloadEventFilterDescriptor(eventfilterdescriptor.toString()) as Int).toUInt() else 0u

public actual fun TdhCloseDecodingHandle(handle: TDH_HANDLE): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_TdhCloseDecodingHandle(handle.toString()) as Int).toUInt() else 0u

public actual fun TdhCreatePayloadFilter(providerguid: Long, eventdescriptor: Long, eventmatchany: Boolean, payloadpredicatecount: UInt, payloadpredicates: Long, payloadfilter: Long): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_TdhCreatePayloadFilter(providerguid.toString(), eventdescriptor.toString(), eventmatchany, payloadpredicatecount.toInt(), payloadpredicates.toString(), payloadfilter.toString()) as Int).toUInt() else 0u

public actual fun TdhDeletePayloadFilter(payloadfilter: Long): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_TdhDeletePayloadFilter(payloadfilter.toString()) as Int).toUInt() else 0u

public actual fun TdhEnumerateManifestProviderEvents(providerguid: Long, buffer: Long, buffersize: Long): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_TdhEnumerateManifestProviderEvents(providerguid.toString(), buffer.toString(), buffersize.toString()) as Int).toUInt() else 0u

public actual fun TdhEnumerateProviderFieldInformation(pguid: Long, eventfieldtype: EVENT_FIELD_TYPE, pbuffer: Long, pbuffersize: Long): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_TdhEnumerateProviderFieldInformation(pguid.toString(), eventfieldtype, pbuffer.toString(), pbuffersize.toString()) as Int).toUInt() else 0u

public actual fun TdhEnumerateProviderFilters(guid: Long, tdhcontextcount: UInt, tdhcontext: Long, filtercount: Long, buffer: Long, buffersize: Long): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_TdhEnumerateProviderFilters(guid.toString(), tdhcontextcount.toInt(), tdhcontext.toString(), filtercount.toString(), buffer.toString(), buffersize.toString()) as Int).toUInt() else 0u

public actual fun TdhEnumerateProviders(pbuffer: Long, pbuffersize: Long): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_TdhEnumerateProviders(pbuffer.toString(), pbuffersize.toString()) as Int).toUInt() else 0u

public actual fun TdhEnumerateProvidersForDecodingSource(filter: DECODING_SOURCE, buffer: Long, buffersize: UInt, bufferrequired: Long): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_TdhEnumerateProvidersForDecodingSource(filter, buffer.toString(), buffersize.toInt(), bufferrequired.toString()) as Int).toUInt() else 0u

public actual fun TdhFormatProperty(eventinfo: Long, mapinfo: Long, pointersize: UInt, propertyintype: UShort, propertyouttype: UShort, propertylength: UShort, userdatalength: UShort, userdata: Long, buffersize: Long, buffer: PWSTR, userdataconsumed: Long): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_TdhFormatProperty(eventinfo.toString(), mapinfo.toString(), pointersize.toInt(), propertyintype.toInt(), propertyouttype.toInt(), propertylength.toInt(), userdatalength.toInt(), userdata.toString(), buffersize.toString(), buffer.toString(), userdataconsumed.toString()) as Int).toUInt() else 0u

public actual fun TdhGetDecodingParameter(handle: TDH_HANDLE, tdhcontext: Long): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_TdhGetDecodingParameter(handle.toString(), tdhcontext.toString()) as Int).toUInt() else 0u

public actual fun TdhGetEventInformation(event: Long, tdhcontextcount: UInt, tdhcontext: Long, buffer: Long, buffersize: Long): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_TdhGetEventInformation(event.toString(), tdhcontextcount.toInt(), tdhcontext.toString(), buffer.toString(), buffersize.toString()) as Int).toUInt() else 0u

public actual fun TdhGetEventMapInformation(pevent: Long, pmapname: PCWSTR, pbuffer: Long, pbuffersize: Long): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_TdhGetEventMapInformation(pevent.toString(), pmapname.toString(), pbuffer.toString(), pbuffersize.toString()) as Int).toUInt() else 0u

public actual fun TdhGetManifestEventInformation(providerguid: Long, eventdescriptor: Long, buffer: Long, buffersize: Long): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_TdhGetManifestEventInformation(providerguid.toString(), eventdescriptor.toString(), buffer.toString(), buffersize.toString()) as Int).toUInt() else 0u

public actual fun TdhGetProperty(pevent: Long, tdhcontextcount: UInt, ptdhcontext: Long, propertydatacount: UInt, ppropertydata: Long, buffersize: UInt, pbuffer: Long): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_TdhGetProperty(pevent.toString(), tdhcontextcount.toInt(), ptdhcontext.toString(), propertydatacount.toInt(), ppropertydata.toString(), buffersize.toInt(), pbuffer.toString()) as Int).toUInt() else 0u

public actual fun TdhGetPropertySize(pevent: Long, tdhcontextcount: UInt, ptdhcontext: Long, propertydatacount: UInt, ppropertydata: Long, ppropertysize: Long): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_TdhGetPropertySize(pevent.toString(), tdhcontextcount.toInt(), ptdhcontext.toString(), propertydatacount.toInt(), ppropertydata.toString(), ppropertysize.toString()) as Int).toUInt() else 0u

public actual fun TdhGetWppMessage(handle: TDH_HANDLE, eventrecord: Long, buffersize: Long, buffer: Long): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_TdhGetWppMessage(handle.toString(), eventrecord.toString(), buffersize.toString(), buffer.toString()) as Int).toUInt() else 0u

public actual fun TdhGetWppProperty(handle: TDH_HANDLE, eventrecord: Long, propertyname: PCWSTR, buffersize: Long, buffer: Long): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_TdhGetWppProperty(handle.toString(), eventrecord.toString(), propertyname.toString(), buffersize.toString(), buffer.toString()) as Int).toUInt() else 0u

public actual fun TdhLoadManifest(manifest: PCWSTR): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_TdhLoadManifest(manifest.toString()) as Int).toUInt() else 0u

public actual fun TdhLoadManifestFromBinary(binarypath: PCWSTR): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_TdhLoadManifestFromBinary(binarypath.toString()) as Int).toUInt() else 0u

public actual fun TdhLoadManifestFromMemory(pdata: Long, cbdata: UInt): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_TdhLoadManifestFromMemory(pdata.toString(), cbdata.toInt()) as Int).toUInt() else 0u

public actual fun TdhOpenDecodingHandle(handle: Long): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_TdhOpenDecodingHandle(handle.toString()) as Int).toUInt() else 0u

public actual fun TdhQueryProviderFieldInformation(pguid: Long, eventfieldvalue: ULong, eventfieldtype: EVENT_FIELD_TYPE, pbuffer: Long, pbuffersize: Long): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_TdhQueryProviderFieldInformation(pguid.toString(), eventfieldvalue.toString(), eventfieldtype, pbuffer.toString(), pbuffersize.toString()) as Int).toUInt() else 0u

public actual fun TdhSetDecodingParameter(handle: TDH_HANDLE, tdhcontext: Long): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_TdhSetDecodingParameter(handle.toString(), tdhcontext.toString()) as Int).toUInt() else 0u

public actual fun TdhUnloadManifest(manifest: PCWSTR): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_TdhUnloadManifest(manifest.toString()) as Int).toUInt() else 0u

public actual fun TdhUnloadManifestFromMemory(pdata: Long, cbdata: UInt): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_TdhUnloadManifestFromMemory(pdata.toString(), cbdata.toInt()) as Int).toUInt() else 0u

public actual fun TraceEvent(tracehandle: ULong, eventtrace: Long): WIN32_ERROR =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_TraceEvent(tracehandle.toString(), eventtrace.toString()) as Int).toUInt() else 0u

public actual fun TraceEventInstance(tracehandle: ULong, eventtrace: Long, instinfo: Long, parentinstinfo: Long): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_TraceEventInstance(tracehandle.toString(), eventtrace.toString(), instinfo.toString(), parentinstinfo.toString()) as Int).toUInt() else 0u

public actual fun TraceMessage(loggerhandle: ULong, messageflags: TRACE_MESSAGE_FLAGS, messageguid: Long, messagenumber: UShort): WIN32_ERROR =
    0u

public actual fun TraceMessageVa(loggerhandle: ULong, messageflags: TRACE_MESSAGE_FLAGS, messageguid: Long, messagenumber: UShort, messagearglist: Long): WIN32_ERROR =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_TraceMessageVa(loggerhandle.toString(), messageflags.toInt(), messageguid.toString(), messagenumber.toInt(), messagearglist.toString()) as Int).toUInt() else 0u

public actual fun TraceQueryInformation(sessionhandle: CONTROLTRACE_HANDLE, informationclass: TRACE_QUERY_INFO_CLASS, traceinformation: Long, informationlength: UInt, returnlength: Long): WIN32_ERROR =
    0u

public actual fun TraceSetInformation(sessionhandle: CONTROLTRACE_HANDLE, informationclass: TRACE_QUERY_INFO_CLASS, traceinformation: Long, informationlength: UInt): WIN32_ERROR =
    0u

public actual fun UnregisterTraceGuids(registrationhandle: ULong): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_UnregisterTraceGuids(registrationhandle.toString()) as Int).toUInt() else 0u

public actual fun UpdateTraceA(tracehandle: CONTROLTRACE_HANDLE, instancename: PCSTR, properties: Long): WIN32_ERROR =
    0u

public actual fun UpdateTraceW(tracehandle: CONTROLTRACE_HANDLE, instancename: PCWSTR, properties: Long): WIN32_ERROR =
    0u
