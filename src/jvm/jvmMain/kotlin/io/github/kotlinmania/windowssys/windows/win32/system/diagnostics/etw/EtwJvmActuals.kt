@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw

import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.WIN32_ERROR
import io.github.kotlinmania.windowssys.windows.win32.security.PSECURITY_DESCRIPTOR
import io.github.kotlinmania.windowssys.windows.win32.security.PSID

private object WindowsWin32SystemDiagnosticsEtwJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_CreateTraceInstanceId(reghandle: Long, instinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_CveEventWrite(cveid: Long, additionaldetails: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_EnumerateTraceGuids(guidpropertiesarray: Long, propertyarraycount: Int, guidcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_EnumerateTraceGuidsEx(tracequeryinfoclass: Int, inbuffer: Long, inbuffersize: Int, outbuffer: Long, outbuffersize: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_EventAccessControl(guid: Long, operation: Int, sid: Long, rights: Int, allowordeny: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_EventAccessQuery(guid: Long, buffer: Long, buffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_EventAccessRemove(guid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_EventActivityIdControl(controlcode: Int, activityid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_EventEnabled(reghandle: Long, eventdescriptor: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_EventProviderEnabled(reghandle: Long, level: Byte, keyword: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_EventRegister(providerid: Long, enablecallback: Long, callbackcontext: Long, reghandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_EventSetInformation(reghandle: Long, informationclass: Int, eventinformation: Long, informationlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_EventUnregister(reghandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_EventWrite(reghandle: Long, eventdescriptor: Long, userdatacount: Int, userdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_EventWriteEx(reghandle: Long, eventdescriptor: Long, filter: Long, flags: Int, activityid: Long, relatedactivityid: Long, userdatacount: Int, userdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_EventWriteString(reghandle: Long, level: Byte, keyword: Long, string: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_EventWriteTransfer(reghandle: Long, eventdescriptor: Long, activityid: Long, relatedactivityid: Long, userdatacount: Int, userdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_GetTraceEnableFlags(tracehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_GetTraceEnableLevel(tracehandle: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_GetTraceLoggerHandle(buffer: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_OpenTraceFromBufferStream(options: Long, buffercompletioncallback: Long, buffercompletioncontext: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_OpenTraceFromFile(logfilename: Long, options: Long, logfileheader: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_OpenTraceFromRealTimeLogger(loggername: Long, options: Long, logfileheader: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_OpenTraceFromRealTimeLoggerWithAllocationOptions(loggername: Long, options: Long, allocationsize: Long, memorypartitionhandle: Long, logfileheader: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_ProcessTrace(handlearray: Long, handlecount: Int, starttime: Long, endtime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_ProcessTraceAddBufferToBufferStream(tracehandle: Long, buffer: Long, buffersize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_ProcessTraceBufferDecrementReference(buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_ProcessTraceBufferIncrementReference(tracehandle: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_QueryAllTracesA(propertyarray: Long, propertyarraycount: Int, loggercount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_QueryAllTracesW(propertyarray: Long, propertyarraycount: Int, loggercount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_RegisterTraceGuidsA(requestaddress: Long, requestcontext: Long, controlguid: Long, guidcount: Int, traceguidreg: Long, mofimagepath: Long, mofresourcename: Long, registrationhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_RegisterTraceGuidsW(requestaddress: Long, requestcontext: Long, controlguid: Long, guidcount: Int, traceguidreg: Long, mofimagepath: Long, mofresourcename: Long, registrationhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_RemoveTraceCallback(pguid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_SetTraceCallback(pguid: Long, eventcallback: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_StartTraceA(tracehandle: Long, instancename: Long, properties: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_StartTraceW(tracehandle: Long, instancename: Long, properties: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_TdhAggregatePayloadFilters(payloadfiltercount: Int, payloadfilterptrs: Long, eventmatchallflags: Long, eventfilterdescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_TdhCleanupPayloadEventFilterDescriptor(eventfilterdescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_TdhCloseDecodingHandle(handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_TdhCreatePayloadFilter(providerguid: Long, eventdescriptor: Long, eventmatchany: Boolean, payloadpredicatecount: Int, payloadpredicates: Long, payloadfilter: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_TdhDeletePayloadFilter(payloadfilter: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_TdhEnumerateManifestProviderEvents(providerguid: Long, buffer: Long, buffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_TdhEnumerateProviderFieldInformation(pguid: Long, eventfieldtype: Int, pbuffer: Long, pbuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_TdhEnumerateProviderFilters(guid: Long, tdhcontextcount: Int, tdhcontext: Long, filtercount: Long, buffer: Long, buffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_TdhEnumerateProviders(pbuffer: Long, pbuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_TdhEnumerateProvidersForDecodingSource(filter: Int, buffer: Long, buffersize: Int, bufferrequired: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_TdhFormatProperty(eventinfo: Long, mapinfo: Long, pointersize: Int, propertyintype: Short, propertyouttype: Short, propertylength: Short, userdatalength: Short, userdata: Long, buffersize: Long, buffer: Long, userdataconsumed: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_TdhGetDecodingParameter(handle: Long, tdhcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_TdhGetEventInformation(event: Long, tdhcontextcount: Int, tdhcontext: Long, buffer: Long, buffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_TdhGetEventMapInformation(pevent: Long, pmapname: Long, pbuffer: Long, pbuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_TdhGetManifestEventInformation(providerguid: Long, eventdescriptor: Long, buffer: Long, buffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_TdhGetProperty(pevent: Long, tdhcontextcount: Int, ptdhcontext: Long, propertydatacount: Int, ppropertydata: Long, buffersize: Int, pbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_TdhGetPropertySize(pevent: Long, tdhcontextcount: Int, ptdhcontext: Long, propertydatacount: Int, ppropertydata: Long, ppropertysize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_TdhGetWppMessage(handle: Long, eventrecord: Long, buffersize: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_TdhGetWppProperty(handle: Long, eventrecord: Long, propertyname: Long, buffersize: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_TdhLoadManifest(manifest: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_TdhLoadManifestFromBinary(binarypath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_TdhLoadManifestFromMemory(pdata: Long, cbdata: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_TdhOpenDecodingHandle(handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_TdhQueryProviderFieldInformation(pguid: Long, eventfieldvalue: Long, eventfieldtype: Int, pbuffer: Long, pbuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_TdhSetDecodingParameter(handle: Long, tdhcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_TdhUnloadManifest(manifest: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_TdhUnloadManifestFromMemory(pdata: Long, cbdata: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_TraceEvent(tracehandle: Long, eventtrace: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_TraceEventInstance(tracehandle: Long, eventtrace: Long, instinfo: Long, parentinstinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_TraceMessageVa(loggerhandle: Long, messageflags: Int, messageguid: Long, messagenumber: Short, messagearglist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_UnregisterTraceGuids(registrationhandle: Long): Int
}

public actual fun CloseTrace(tracehandle: PROCESSTRACE_HANDLE): WIN32_ERROR =
    0u

public actual fun ControlTraceA(tracehandle: CONTROLTRACE_HANDLE, instancename: PCSTR, properties: Long, controlcode: EVENT_TRACE_CONTROL): WIN32_ERROR =
    0u

public actual fun ControlTraceW(tracehandle: CONTROLTRACE_HANDLE, instancename: PCWSTR, properties: Long, controlcode: EVENT_TRACE_CONTROL): WIN32_ERROR =
    0u

public actual fun CreateTraceInstanceId(reghandle: HANDLE, instinfo: Long): WIN32_ERROR =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_CreateTraceInstanceId(reghandle, instinfo).toUInt()

public actual fun CveEventWrite(cveid: PCWSTR, additionaldetails: PCWSTR): Int =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_CveEventWrite(cveid, additionaldetails)

public actual fun EnableTrace(enable: UInt, enableflag: UInt, enablelevel: UInt, controlguid: Long, tracehandle: CONTROLTRACE_HANDLE): WIN32_ERROR =
    0u

public actual fun EnableTraceEx(providerid: Long, sourceid: Long, tracehandle: CONTROLTRACE_HANDLE, isenabled: UInt, level: UByte, matchanykeyword: ULong, matchallkeyword: ULong, enableproperty: UInt, enablefilterdesc: Long): WIN32_ERROR =
    0u

public actual fun EnableTraceEx2(tracehandle: CONTROLTRACE_HANDLE, providerid: Long, controlcode: UInt, level: UByte, matchanykeyword: ULong, matchallkeyword: ULong, timeout: UInt, enableparameters: Long): WIN32_ERROR =
    0u

public actual fun EnumerateTraceGuids(guidpropertiesarray: Long, propertyarraycount: UInt, guidcount: Long): WIN32_ERROR =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_EnumerateTraceGuids(guidpropertiesarray, propertyarraycount.toInt(), guidcount).toUInt()

public actual fun EnumerateTraceGuidsEx(tracequeryinfoclass: TRACE_QUERY_INFO_CLASS, inbuffer: Long, inbuffersize: UInt, outbuffer: Long, outbuffersize: UInt, returnlength: Long): WIN32_ERROR =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_EnumerateTraceGuidsEx(tracequeryinfoclass, inbuffer, inbuffersize.toInt(), outbuffer, outbuffersize.toInt(), returnlength).toUInt()

public actual fun EventAccessControl(guid: Long, operation: UInt, sid: PSID, rights: UInt, allowordeny: Boolean): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_EventAccessControl(guid, operation.toInt(), sid, rights.toInt(), allowordeny).toUInt()

public actual fun EventAccessQuery(guid: Long, buffer: PSECURITY_DESCRIPTOR, buffersize: Long): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_EventAccessQuery(guid, buffer, buffersize).toUInt()

public actual fun EventAccessRemove(guid: Long): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_EventAccessRemove(guid).toUInt()

public actual fun EventActivityIdControl(controlcode: UInt, activityid: Long): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_EventActivityIdControl(controlcode.toInt(), activityid).toUInt()

public actual fun EventEnabled(reghandle: REGHANDLE, eventdescriptor: Long): Boolean =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_EventEnabled(reghandle, eventdescriptor)

public actual fun EventProviderEnabled(reghandle: REGHANDLE, level: UByte, keyword: ULong): Boolean =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_EventProviderEnabled(reghandle, level.toByte(), keyword.toLong())

public actual fun EventRegister(providerid: Long, enablecallback: PENABLECALLBACK, callbackcontext: Long, reghandle: Long): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_EventRegister(providerid, enablecallback.toLong(), callbackcontext, reghandle).toUInt()

public actual fun EventSetInformation(reghandle: REGHANDLE, informationclass: EVENT_INFO_CLASS, eventinformation: Long, informationlength: UInt): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_EventSetInformation(reghandle, informationclass, eventinformation, informationlength.toInt()).toUInt()

public actual fun EventUnregister(reghandle: REGHANDLE): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_EventUnregister(reghandle).toUInt()

public actual fun EventWrite(reghandle: REGHANDLE, eventdescriptor: Long, userdatacount: UInt, userdata: Long): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_EventWrite(reghandle, eventdescriptor, userdatacount.toInt(), userdata).toUInt()

public actual fun EventWriteEx(reghandle: REGHANDLE, eventdescriptor: Long, filter: ULong, flags: UInt, activityid: Long, relatedactivityid: Long, userdatacount: UInt, userdata: Long): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_EventWriteEx(reghandle, eventdescriptor, filter.toLong(), flags.toInt(), activityid, relatedactivityid, userdatacount.toInt(), userdata).toUInt()

public actual fun EventWriteString(reghandle: REGHANDLE, level: UByte, keyword: ULong, string: PCWSTR): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_EventWriteString(reghandle, level.toByte(), keyword.toLong(), string).toUInt()

public actual fun EventWriteTransfer(reghandle: REGHANDLE, eventdescriptor: Long, activityid: Long, relatedactivityid: Long, userdatacount: UInt, userdata: Long): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_EventWriteTransfer(reghandle, eventdescriptor, activityid, relatedactivityid, userdatacount.toInt(), userdata).toUInt()

public actual fun FlushTraceA(tracehandle: CONTROLTRACE_HANDLE, instancename: PCSTR, properties: Long): WIN32_ERROR =
    0u

public actual fun FlushTraceW(tracehandle: CONTROLTRACE_HANDLE, instancename: PCWSTR, properties: Long): WIN32_ERROR =
    0u

public actual fun GetTraceEnableFlags(tracehandle: ULong): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_GetTraceEnableFlags(tracehandle.toLong()).toUInt()

public actual fun GetTraceEnableLevel(tracehandle: ULong): UByte =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_GetTraceEnableLevel(tracehandle.toLong()).toUByte()

public actual fun GetTraceLoggerHandle(buffer: Long): ULong =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_GetTraceLoggerHandle(buffer).toULong()

public actual fun OpenTraceA(logfile: Long): PROCESSTRACE_HANDLE =
    PROCESSTRACE_HANDLE()

public actual fun OpenTraceFromBufferStream(options: Long, buffercompletioncallback: PETW_BUFFER_COMPLETION_CALLBACK, buffercompletioncontext: Long): ULong =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_OpenTraceFromBufferStream(options, buffercompletioncallback.toLong(), buffercompletioncontext).toULong()

public actual fun OpenTraceFromFile(logfilename: PCWSTR, options: Long, logfileheader: Long): ULong =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_OpenTraceFromFile(logfilename, options, logfileheader).toULong()

public actual fun OpenTraceFromRealTimeLogger(loggername: PCWSTR, options: Long, logfileheader: Long): ULong =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_OpenTraceFromRealTimeLogger(loggername, options, logfileheader).toULong()

public actual fun OpenTraceFromRealTimeLoggerWithAllocationOptions(loggername: PCWSTR, options: Long, allocationsize: ULong, memorypartitionhandle: HANDLE, logfileheader: Long): ULong =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_OpenTraceFromRealTimeLoggerWithAllocationOptions(loggername, options, allocationsize.toLong(), memorypartitionhandle, logfileheader).toULong()

public actual fun OpenTraceW(logfile: Long): PROCESSTRACE_HANDLE =
    PROCESSTRACE_HANDLE()

public actual fun ProcessTrace(handlearray: Long, handlecount: UInt, starttime: Long, endtime: Long): WIN32_ERROR =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_ProcessTrace(handlearray, handlecount.toInt(), starttime, endtime).toUInt()

public actual fun ProcessTraceAddBufferToBufferStream(tracehandle: ULong, buffer: Long, buffersize: UInt): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_ProcessTraceAddBufferToBufferStream(tracehandle.toLong(), buffer, buffersize.toInt()).toUInt()

public actual fun ProcessTraceBufferDecrementReference(buffer: Long): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_ProcessTraceBufferDecrementReference(buffer).toUInt()

public actual fun ProcessTraceBufferIncrementReference(tracehandle: ULong, buffer: Long): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_ProcessTraceBufferIncrementReference(tracehandle.toLong(), buffer).toUInt()

public actual fun QueryAllTracesA(propertyarray: Long, propertyarraycount: UInt, loggercount: Long): WIN32_ERROR =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_QueryAllTracesA(propertyarray, propertyarraycount.toInt(), loggercount).toUInt()

public actual fun QueryAllTracesW(propertyarray: Long, propertyarraycount: UInt, loggercount: Long): WIN32_ERROR =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_QueryAllTracesW(propertyarray, propertyarraycount.toInt(), loggercount).toUInt()

public actual fun QueryTraceA(tracehandle: CONTROLTRACE_HANDLE, instancename: PCSTR, properties: Long): WIN32_ERROR =
    0u

public actual fun QueryTraceProcessingHandle(processinghandle: PROCESSTRACE_HANDLE, informationclass: ETW_PROCESS_HANDLE_INFO_TYPE, inbuffer: Long, inbuffersize: UInt, outbuffer: Long, outbuffersize: UInt, returnlength: Long): WIN32_ERROR =
    0u

public actual fun QueryTraceW(tracehandle: CONTROLTRACE_HANDLE, instancename: PCWSTR, properties: Long): WIN32_ERROR =
    0u

public actual fun RegisterTraceGuidsA(requestaddress: WMIDPREQUEST, requestcontext: Long, controlguid: Long, guidcount: UInt, traceguidreg: Long, mofimagepath: PCSTR, mofresourcename: PCSTR, registrationhandle: Long): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_RegisterTraceGuidsA(requestaddress.toLong(), requestcontext, controlguid, guidcount.toInt(), traceguidreg, mofimagepath, mofresourcename, registrationhandle).toUInt()

public actual fun RegisterTraceGuidsW(requestaddress: WMIDPREQUEST, requestcontext: Long, controlguid: Long, guidcount: UInt, traceguidreg: Long, mofimagepath: PCWSTR, mofresourcename: PCWSTR, registrationhandle: Long): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_RegisterTraceGuidsW(requestaddress.toLong(), requestcontext, controlguid, guidcount.toInt(), traceguidreg, mofimagepath, mofresourcename, registrationhandle).toUInt()

public actual fun RemoveTraceCallback(pguid: Long): WIN32_ERROR =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_RemoveTraceCallback(pguid).toUInt()

public actual fun SetTraceCallback(pguid: Long, eventcallback: PEVENT_CALLBACK): WIN32_ERROR =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_SetTraceCallback(pguid, eventcallback.toLong()).toUInt()

public actual fun StartTraceA(tracehandle: Long, instancename: PCSTR, properties: Long): WIN32_ERROR =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_StartTraceA(tracehandle, instancename, properties).toUInt()

public actual fun StartTraceW(tracehandle: Long, instancename: PCWSTR, properties: Long): WIN32_ERROR =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_StartTraceW(tracehandle, instancename, properties).toUInt()

public actual fun StopTraceA(tracehandle: CONTROLTRACE_HANDLE, instancename: PCSTR, properties: Long): WIN32_ERROR =
    0u

public actual fun StopTraceW(tracehandle: CONTROLTRACE_HANDLE, instancename: PCWSTR, properties: Long): WIN32_ERROR =
    0u

public actual fun TdhAggregatePayloadFilters(payloadfiltercount: UInt, payloadfilterptrs: Long, eventmatchallflags: Long, eventfilterdescriptor: Long): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_TdhAggregatePayloadFilters(payloadfiltercount.toInt(), payloadfilterptrs, eventmatchallflags, eventfilterdescriptor).toUInt()

public actual fun TdhCleanupPayloadEventFilterDescriptor(eventfilterdescriptor: Long): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_TdhCleanupPayloadEventFilterDescriptor(eventfilterdescriptor).toUInt()

public actual fun TdhCloseDecodingHandle(handle: TDH_HANDLE): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_TdhCloseDecodingHandle(handle).toUInt()

public actual fun TdhCreatePayloadFilter(providerguid: Long, eventdescriptor: Long, eventmatchany: Boolean, payloadpredicatecount: UInt, payloadpredicates: Long, payloadfilter: Long): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_TdhCreatePayloadFilter(providerguid, eventdescriptor, eventmatchany, payloadpredicatecount.toInt(), payloadpredicates, payloadfilter).toUInt()

public actual fun TdhDeletePayloadFilter(payloadfilter: Long): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_TdhDeletePayloadFilter(payloadfilter).toUInt()

public actual fun TdhEnumerateManifestProviderEvents(providerguid: Long, buffer: Long, buffersize: Long): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_TdhEnumerateManifestProviderEvents(providerguid, buffer, buffersize).toUInt()

public actual fun TdhEnumerateProviderFieldInformation(pguid: Long, eventfieldtype: EVENT_FIELD_TYPE, pbuffer: Long, pbuffersize: Long): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_TdhEnumerateProviderFieldInformation(pguid, eventfieldtype, pbuffer, pbuffersize).toUInt()

public actual fun TdhEnumerateProviderFilters(guid: Long, tdhcontextcount: UInt, tdhcontext: Long, filtercount: Long, buffer: Long, buffersize: Long): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_TdhEnumerateProviderFilters(guid, tdhcontextcount.toInt(), tdhcontext, filtercount, buffer, buffersize).toUInt()

public actual fun TdhEnumerateProviders(pbuffer: Long, pbuffersize: Long): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_TdhEnumerateProviders(pbuffer, pbuffersize).toUInt()

public actual fun TdhEnumerateProvidersForDecodingSource(filter: DECODING_SOURCE, buffer: Long, buffersize: UInt, bufferrequired: Long): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_TdhEnumerateProvidersForDecodingSource(filter, buffer, buffersize.toInt(), bufferrequired).toUInt()

public actual fun TdhFormatProperty(eventinfo: Long, mapinfo: Long, pointersize: UInt, propertyintype: UShort, propertyouttype: UShort, propertylength: UShort, userdatalength: UShort, userdata: Long, buffersize: Long, buffer: PWSTR, userdataconsumed: Long): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_TdhFormatProperty(eventinfo, mapinfo, pointersize.toInt(), propertyintype.toShort(), propertyouttype.toShort(), propertylength.toShort(), userdatalength.toShort(), userdata, buffersize, buffer, userdataconsumed).toUInt()

public actual fun TdhGetDecodingParameter(handle: TDH_HANDLE, tdhcontext: Long): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_TdhGetDecodingParameter(handle, tdhcontext).toUInt()

public actual fun TdhGetEventInformation(event: Long, tdhcontextcount: UInt, tdhcontext: Long, buffer: Long, buffersize: Long): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_TdhGetEventInformation(event, tdhcontextcount.toInt(), tdhcontext, buffer, buffersize).toUInt()

public actual fun TdhGetEventMapInformation(pevent: Long, pmapname: PCWSTR, pbuffer: Long, pbuffersize: Long): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_TdhGetEventMapInformation(pevent, pmapname, pbuffer, pbuffersize).toUInt()

public actual fun TdhGetManifestEventInformation(providerguid: Long, eventdescriptor: Long, buffer: Long, buffersize: Long): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_TdhGetManifestEventInformation(providerguid, eventdescriptor, buffer, buffersize).toUInt()

public actual fun TdhGetProperty(pevent: Long, tdhcontextcount: UInt, ptdhcontext: Long, propertydatacount: UInt, ppropertydata: Long, buffersize: UInt, pbuffer: Long): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_TdhGetProperty(pevent, tdhcontextcount.toInt(), ptdhcontext, propertydatacount.toInt(), ppropertydata, buffersize.toInt(), pbuffer).toUInt()

public actual fun TdhGetPropertySize(pevent: Long, tdhcontextcount: UInt, ptdhcontext: Long, propertydatacount: UInt, ppropertydata: Long, ppropertysize: Long): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_TdhGetPropertySize(pevent, tdhcontextcount.toInt(), ptdhcontext, propertydatacount.toInt(), ppropertydata, ppropertysize).toUInt()

public actual fun TdhGetWppMessage(handle: TDH_HANDLE, eventrecord: Long, buffersize: Long, buffer: Long): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_TdhGetWppMessage(handle, eventrecord, buffersize, buffer).toUInt()

public actual fun TdhGetWppProperty(handle: TDH_HANDLE, eventrecord: Long, propertyname: PCWSTR, buffersize: Long, buffer: Long): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_TdhGetWppProperty(handle, eventrecord, propertyname, buffersize, buffer).toUInt()

public actual fun TdhLoadManifest(manifest: PCWSTR): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_TdhLoadManifest(manifest).toUInt()

public actual fun TdhLoadManifestFromBinary(binarypath: PCWSTR): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_TdhLoadManifestFromBinary(binarypath).toUInt()

public actual fun TdhLoadManifestFromMemory(pdata: Long, cbdata: UInt): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_TdhLoadManifestFromMemory(pdata, cbdata.toInt()).toUInt()

public actual fun TdhOpenDecodingHandle(handle: Long): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_TdhOpenDecodingHandle(handle).toUInt()

public actual fun TdhQueryProviderFieldInformation(pguid: Long, eventfieldvalue: ULong, eventfieldtype: EVENT_FIELD_TYPE, pbuffer: Long, pbuffersize: Long): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_TdhQueryProviderFieldInformation(pguid, eventfieldvalue.toLong(), eventfieldtype, pbuffer, pbuffersize).toUInt()

public actual fun TdhSetDecodingParameter(handle: TDH_HANDLE, tdhcontext: Long): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_TdhSetDecodingParameter(handle, tdhcontext).toUInt()

public actual fun TdhUnloadManifest(manifest: PCWSTR): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_TdhUnloadManifest(manifest).toUInt()

public actual fun TdhUnloadManifestFromMemory(pdata: Long, cbdata: UInt): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_TdhUnloadManifestFromMemory(pdata, cbdata.toInt()).toUInt()

public actual fun TraceEvent(tracehandle: ULong, eventtrace: Long): WIN32_ERROR =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_TraceEvent(tracehandle.toLong(), eventtrace).toUInt()

public actual fun TraceEventInstance(tracehandle: ULong, eventtrace: Long, instinfo: Long, parentinstinfo: Long): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_TraceEventInstance(tracehandle.toLong(), eventtrace, instinfo, parentinstinfo).toUInt()

public actual fun TraceMessage(loggerhandle: ULong, messageflags: TRACE_MESSAGE_FLAGS, messageguid: Long, messagenumber: UShort): WIN32_ERROR =
    0u

public actual fun TraceMessageVa(loggerhandle: ULong, messageflags: TRACE_MESSAGE_FLAGS, messageguid: Long, messagenumber: UShort, messagearglist: Long): WIN32_ERROR =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_TraceMessageVa(loggerhandle.toLong(), messageflags.toInt(), messageguid, messagenumber.toShort(), messagearglist).toUInt()

public actual fun TraceQueryInformation(sessionhandle: CONTROLTRACE_HANDLE, informationclass: TRACE_QUERY_INFO_CLASS, traceinformation: Long, informationlength: UInt, returnlength: Long): WIN32_ERROR =
    0u

public actual fun TraceSetInformation(sessionhandle: CONTROLTRACE_HANDLE, informationclass: TRACE_QUERY_INFO_CLASS, traceinformation: Long, informationlength: UInt): WIN32_ERROR =
    0u

public actual fun UnregisterTraceGuids(registrationhandle: ULong): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_UnregisterTraceGuids(registrationhandle.toLong()).toUInt()

public actual fun UpdateTraceA(tracehandle: CONTROLTRACE_HANDLE, instancename: PCSTR, properties: Long): WIN32_ERROR =
    0u

public actual fun UpdateTraceW(tracehandle: CONTROLTRACE_HANDLE, instancename: PCWSTR, properties: Long): WIN32_ERROR =
    0u
