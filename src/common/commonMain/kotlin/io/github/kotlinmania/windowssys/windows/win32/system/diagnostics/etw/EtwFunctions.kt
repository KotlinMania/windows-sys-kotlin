package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public fun interface FnCallback {
    public operator fun invoke(sourceid: Long, isenabled: ENABLECALLBACK_ENABLED_STATE, level: UByte, matchanykeyword: ULong, matchallkeyword: ULong, filterdata: Long, callbackcontext: Long)
}

public fun interface FnCallback1 {
    public operator fun invoke(buffer: Long, callbackcontext: Long)
}

public fun interface FnCallback2 {
    public operator fun invoke(requestcode: WMIDPREQUESTCODE, requestcontext: Long, buffersize: Long, buffer: Long): UInt
}

public fun interface FnCallback3 {
    public operator fun invoke(pevent: Long)
}

public fun CloseTrace(tracehandle: PROCESSTRACE_HANDLE): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "CloseTrace", longArrayOf(tracehandle.Value.toLong()))
    return Foundation.WIN32_ERROR()
}

public fun ControlTraceA(tracehandle: CONTROLTRACE_HANDLE, instancename: PCSTR, properties: Long, controlcode: EVENT_TRACE_CONTROL): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "ControlTraceA", longArrayOf(tracehandle.Value.toLong(), instancename, properties, controlcode.toLong()))
    return Foundation.WIN32_ERROR()
}

public fun ControlTraceW(tracehandle: CONTROLTRACE_HANDLE, instancename: PCWSTR, properties: Long, controlcode: EVENT_TRACE_CONTROL): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "ControlTraceW", longArrayOf(tracehandle.Value.toLong(), instancename, properties, controlcode.toLong()))
    return Foundation.WIN32_ERROR()
}

public fun CreateTraceInstanceId(reghandle: Foundation.HANDLE, instinfo: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "CreateTraceInstanceId", longArrayOf(Win32DynamicFfi.objectSlot(reghandle), instinfo))
    return Foundation.WIN32_ERROR()
}

public fun CveEventWrite(cveid: PCWSTR, additionaldetails: PCWSTR): Int {
    return Win32DynamicFfi.invoke("advapi32.dll", "CveEventWrite", longArrayOf(cveid, additionaldetails)).toInt()
}

public fun EnableTrace(enable: UInt, enableflag: UInt, enablelevel: UInt, controlguid: Long, tracehandle: CONTROLTRACE_HANDLE): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "EnableTrace", longArrayOf(enable.toLong(), enableflag.toLong(), enablelevel.toLong(), controlguid, tracehandle.Value.toLong()))
    return Foundation.WIN32_ERROR()
}

public fun EnableTraceEx(providerid: Long, sourceid: Long, tracehandle: CONTROLTRACE_HANDLE, isenabled: UInt, level: UByte, matchanykeyword: ULong, matchallkeyword: ULong, enableproperty: UInt, enablefilterdesc: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "EnableTraceEx", longArrayOf(providerid, sourceid, tracehandle.Value.toLong(), isenabled.toLong(), level.toLong(), matchanykeyword.toLong(), matchallkeyword.toLong(), enableproperty.toLong(), enablefilterdesc))
    return Foundation.WIN32_ERROR()
}

public fun EnableTraceEx2(tracehandle: CONTROLTRACE_HANDLE, providerid: Long, controlcode: UInt, level: UByte, matchanykeyword: ULong, matchallkeyword: ULong, timeout: UInt, enableparameters: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "EnableTraceEx2", longArrayOf(tracehandle.Value.toLong(), providerid, controlcode.toLong(), level.toLong(), matchanykeyword.toLong(), matchallkeyword.toLong(), timeout.toLong(), enableparameters))
    return Foundation.WIN32_ERROR()
}

public fun EnumerateTraceGuids(guidpropertiesarray: Long, propertyarraycount: UInt, guidcount: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "EnumerateTraceGuids", longArrayOf(guidpropertiesarray, propertyarraycount.toLong(), guidcount))
    return Foundation.WIN32_ERROR()
}

public fun EnumerateTraceGuidsEx(tracequeryinfoclass: TRACE_QUERY_INFO_CLASS, inbuffer: Long, inbuffersize: UInt, outbuffer: Long, outbuffersize: UInt, returnlength: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "EnumerateTraceGuidsEx", longArrayOf(tracequeryinfoclass.toLong(), inbuffer, inbuffersize.toLong(), outbuffer, outbuffersize.toLong(), returnlength))
    return Foundation.WIN32_ERROR()
}

public fun EventAccessControl(guid: Long, operation: UInt, sid: Security.PSID, rights: UInt, allowordeny: Boolean): UInt {
    return Win32DynamicFfi.invoke("advapi32.dll", "EventAccessControl", longArrayOf(guid, operation.toLong(), Win32DynamicFfi.objectSlot(sid), rights.toLong(), if (allowordeny) 1L else 0L)).toUInt()
}

public fun EventAccessQuery(guid: Long, buffer: Security.PSECURITY_DESCRIPTOR, buffersize: Long): UInt {
    return Win32DynamicFfi.invoke("advapi32.dll", "EventAccessQuery", longArrayOf(guid, Win32DynamicFfi.objectSlot(buffer), buffersize)).toUInt()
}

public fun EventAccessRemove(guid: Long): UInt {
    return Win32DynamicFfi.invoke("advapi32.dll", "EventAccessRemove", longArrayOf(guid)).toUInt()
}

public fun EventActivityIdControl(controlcode: UInt, activityid: Long): UInt {
    return Win32DynamicFfi.invoke("advapi32.dll", "EventActivityIdControl", longArrayOf(controlcode.toLong(), activityid)).toUInt()
}

public fun EventEnabled(reghandle: REGHANDLE, eventdescriptor: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("advapi32.dll", "EventEnabled", longArrayOf(reghandle, eventdescriptor))
    return (rawRet and 0xFFL) != 0L
}

public fun EventProviderEnabled(reghandle: REGHANDLE, level: UByte, keyword: ULong): Boolean {
    val rawRet = Win32DynamicFfi.invoke("advapi32.dll", "EventProviderEnabled", longArrayOf(reghandle, level.toLong(), keyword.toLong()))
    return (rawRet and 0xFFL) != 0L
}

public fun EventRegister(providerid: Long, enablecallback: PENABLECALLBACK, callbackcontext: Long, reghandle: Long): UInt {
    return Win32DynamicFfi.invoke("advapi32.dll", "EventRegister", longArrayOf(providerid, Win32DynamicFfi.objectSlot(enablecallback), callbackcontext, reghandle)).toUInt()
}

public fun EventSetInformation(reghandle: REGHANDLE, informationclass: EVENT_INFO_CLASS, eventinformation: Long, informationlength: UInt): UInt {
    return Win32DynamicFfi.invoke("advapi32.dll", "EventSetInformation", longArrayOf(reghandle, informationclass.toLong(), eventinformation, informationlength.toLong())).toUInt()
}

public fun EventUnregister(reghandle: REGHANDLE): UInt {
    return Win32DynamicFfi.invoke("advapi32.dll", "EventUnregister", longArrayOf(reghandle)).toUInt()
}

public fun EventWrite(reghandle: REGHANDLE, eventdescriptor: Long, userdatacount: UInt, userdata: Long): UInt {
    return Win32DynamicFfi.invoke("advapi32.dll", "EventWrite", longArrayOf(reghandle, eventdescriptor, userdatacount.toLong(), userdata)).toUInt()
}

public fun EventWriteEx(reghandle: REGHANDLE, eventdescriptor: Long, filter: ULong, flags: UInt, activityid: Long, relatedactivityid: Long, userdatacount: UInt, userdata: Long): UInt {
    return Win32DynamicFfi.invoke("advapi32.dll", "EventWriteEx", longArrayOf(reghandle, eventdescriptor, filter.toLong(), flags.toLong(), activityid, relatedactivityid, userdatacount.toLong(), userdata)).toUInt()
}

public fun EventWriteString(reghandle: REGHANDLE, level: UByte, keyword: ULong, string: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("advapi32.dll", "EventWriteString", longArrayOf(reghandle, level.toLong(), keyword.toLong(), string)).toUInt()
}

public fun EventWriteTransfer(reghandle: REGHANDLE, eventdescriptor: Long, activityid: Long, relatedactivityid: Long, userdatacount: UInt, userdata: Long): UInt {
    return Win32DynamicFfi.invoke("advapi32.dll", "EventWriteTransfer", longArrayOf(reghandle, eventdescriptor, activityid, relatedactivityid, userdatacount.toLong(), userdata)).toUInt()
}

public fun FlushTraceA(tracehandle: CONTROLTRACE_HANDLE, instancename: PCSTR, properties: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "FlushTraceA", longArrayOf(tracehandle.Value.toLong(), instancename, properties))
    return Foundation.WIN32_ERROR()
}

public fun FlushTraceW(tracehandle: CONTROLTRACE_HANDLE, instancename: PCWSTR, properties: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "FlushTraceW", longArrayOf(tracehandle.Value.toLong(), instancename, properties))
    return Foundation.WIN32_ERROR()
}

public fun GetTraceEnableFlags(tracehandle: ULong): UInt {
    return Win32DynamicFfi.invoke("advapi32.dll", "GetTraceEnableFlags", longArrayOf(tracehandle.toLong())).toUInt()
}

public fun GetTraceEnableLevel(tracehandle: ULong): UByte {
    return Win32DynamicFfi.invoke("advapi32.dll", "GetTraceEnableLevel", longArrayOf(tracehandle.toLong())).toUByte()
}

public fun GetTraceLoggerHandle(buffer: Long): ULong {
    return Win32DynamicFfi.invoke("advapi32.dll", "GetTraceLoggerHandle", longArrayOf(buffer)).toULong()
}

public fun OpenTraceA(logfile: Long): PROCESSTRACE_HANDLE {
    val rawRet = Win32DynamicFfi.invoke("advapi32.dll", "OpenTraceA", longArrayOf(logfile))
    return PROCESSTRACE_HANDLE(Value = rawRet.toULong())
}

public fun OpenTraceFromBufferStream(options: Long, buffercompletioncallback: PETW_BUFFER_COMPLETION_CALLBACK, buffercompletioncontext: Long): ULong {
    return Win32DynamicFfi.invoke("advapi32.dll", "OpenTraceFromBufferStream", longArrayOf(options, Win32DynamicFfi.objectSlot(buffercompletioncallback), buffercompletioncontext)).toULong()
}

public fun OpenTraceFromFile(logfilename: PCWSTR, options: Long, logfileheader: Long): ULong {
    return Win32DynamicFfi.invoke("advapi32.dll", "OpenTraceFromFile", longArrayOf(logfilename, options, logfileheader)).toULong()
}

public fun OpenTraceFromRealTimeLogger(loggername: PCWSTR, options: Long, logfileheader: Long): ULong {
    return Win32DynamicFfi.invoke("advapi32.dll", "OpenTraceFromRealTimeLogger", longArrayOf(loggername, options, logfileheader)).toULong()
}

public fun OpenTraceFromRealTimeLoggerWithAllocationOptions(loggername: PCWSTR, options: Long, allocationsize: ULong, memorypartitionhandle: Foundation.HANDLE, logfileheader: Long): ULong {
    return Win32DynamicFfi.invoke("advapi32.dll", "OpenTraceFromRealTimeLoggerWithAllocationOptions", longArrayOf(loggername, options, allocationsize.toLong(), Win32DynamicFfi.objectSlot(memorypartitionhandle), logfileheader)).toULong()
}

public fun OpenTraceW(logfile: Long): PROCESSTRACE_HANDLE {
    val rawRet = Win32DynamicFfi.invoke("advapi32.dll", "OpenTraceW", longArrayOf(logfile))
    return PROCESSTRACE_HANDLE(Value = rawRet.toULong())
}

public fun ProcessTrace(handlearray: Long, handlecount: UInt, starttime: Long, endtime: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "ProcessTrace", longArrayOf(handlearray, handlecount.toLong(), starttime, endtime))
    return Foundation.WIN32_ERROR()
}

public fun ProcessTraceAddBufferToBufferStream(tracehandle: ULong, buffer: Long, buffersize: UInt): UInt {
    return Win32DynamicFfi.invoke("advapi32.dll", "ProcessTraceAddBufferToBufferStream", longArrayOf(tracehandle.toLong(), buffer, buffersize.toLong())).toUInt()
}

public fun ProcessTraceBufferDecrementReference(buffer: Long): UInt {
    return Win32DynamicFfi.invoke("advapi32.dll", "ProcessTraceBufferDecrementReference", longArrayOf(buffer)).toUInt()
}

public fun ProcessTraceBufferIncrementReference(tracehandle: ULong, buffer: Long): UInt {
    return Win32DynamicFfi.invoke("advapi32.dll", "ProcessTraceBufferIncrementReference", longArrayOf(tracehandle.toLong(), buffer)).toUInt()
}

public fun QueryAllTracesA(propertyarray: Long, propertyarraycount: UInt, loggercount: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "QueryAllTracesA", longArrayOf(propertyarray, propertyarraycount.toLong(), loggercount))
    return Foundation.WIN32_ERROR()
}

public fun QueryAllTracesW(propertyarray: Long, propertyarraycount: UInt, loggercount: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "QueryAllTracesW", longArrayOf(propertyarray, propertyarraycount.toLong(), loggercount))
    return Foundation.WIN32_ERROR()
}

public fun QueryTraceA(tracehandle: CONTROLTRACE_HANDLE, instancename: PCSTR, properties: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "QueryTraceA", longArrayOf(tracehandle.Value.toLong(), instancename, properties))
    return Foundation.WIN32_ERROR()
}

public fun QueryTraceProcessingHandle(processinghandle: PROCESSTRACE_HANDLE, informationclass: ETW_PROCESS_HANDLE_INFO_TYPE, inbuffer: Long, inbuffersize: UInt, outbuffer: Long, outbuffersize: UInt, returnlength: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "QueryTraceProcessingHandle", longArrayOf(processinghandle.Value.toLong(), informationclass.toLong(), inbuffer, inbuffersize.toLong(), outbuffer, outbuffersize.toLong(), returnlength))
    return Foundation.WIN32_ERROR()
}

public fun QueryTraceW(tracehandle: CONTROLTRACE_HANDLE, instancename: PCWSTR, properties: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "QueryTraceW", longArrayOf(tracehandle.Value.toLong(), instancename, properties))
    return Foundation.WIN32_ERROR()
}

public fun RegisterTraceGuidsA(requestaddress: WMIDPREQUEST, requestcontext: Long, controlguid: Long, guidcount: UInt, traceguidreg: Long, mofimagepath: PCSTR, mofresourcename: PCSTR, registrationhandle: Long): UInt {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegisterTraceGuidsA", longArrayOf(Win32DynamicFfi.objectSlot(requestaddress), requestcontext, controlguid, guidcount.toLong(), traceguidreg, mofimagepath, mofresourcename, registrationhandle)).toUInt()
}

public fun RegisterTraceGuidsW(requestaddress: WMIDPREQUEST, requestcontext: Long, controlguid: Long, guidcount: UInt, traceguidreg: Long, mofimagepath: PCWSTR, mofresourcename: PCWSTR, registrationhandle: Long): UInt {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegisterTraceGuidsW", longArrayOf(Win32DynamicFfi.objectSlot(requestaddress), requestcontext, controlguid, guidcount.toLong(), traceguidreg, mofimagepath, mofresourcename, registrationhandle)).toUInt()
}

public fun RemoveTraceCallback(pguid: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RemoveTraceCallback", longArrayOf(pguid))
    return Foundation.WIN32_ERROR()
}

public fun SetTraceCallback(pguid: Long, eventcallback: PEVENT_CALLBACK): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "SetTraceCallback", longArrayOf(pguid, Win32DynamicFfi.objectSlot(eventcallback)))
    return Foundation.WIN32_ERROR()
}

public fun StartTraceA(tracehandle: Long, instancename: PCSTR, properties: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "StartTraceA", longArrayOf(tracehandle, instancename, properties))
    return Foundation.WIN32_ERROR()
}

public fun StartTraceW(tracehandle: Long, instancename: PCWSTR, properties: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "StartTraceW", longArrayOf(tracehandle, instancename, properties))
    return Foundation.WIN32_ERROR()
}

public fun StopTraceA(tracehandle: CONTROLTRACE_HANDLE, instancename: PCSTR, properties: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "StopTraceA", longArrayOf(tracehandle.Value.toLong(), instancename, properties))
    return Foundation.WIN32_ERROR()
}

public fun StopTraceW(tracehandle: CONTROLTRACE_HANDLE, instancename: PCWSTR, properties: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "StopTraceW", longArrayOf(tracehandle.Value.toLong(), instancename, properties))
    return Foundation.WIN32_ERROR()
}

public fun TdhAggregatePayloadFilters(payloadfiltercount: UInt, payloadfilterptrs: Long, eventmatchallflags: Long, eventfilterdescriptor: Long): UInt {
    return Win32DynamicFfi.invoke("tdh.dll", "TdhAggregatePayloadFilters", longArrayOf(payloadfiltercount.toLong(), payloadfilterptrs, eventmatchallflags, eventfilterdescriptor)).toUInt()
}

public fun TdhCleanupPayloadEventFilterDescriptor(eventfilterdescriptor: Long): UInt {
    return Win32DynamicFfi.invoke("tdh.dll", "TdhCleanupPayloadEventFilterDescriptor", longArrayOf(eventfilterdescriptor)).toUInt()
}

public fun TdhCloseDecodingHandle(handle: TDH_HANDLE): UInt {
    return Win32DynamicFfi.invoke("tdh.dll", "TdhCloseDecodingHandle", longArrayOf(handle)).toUInt()
}

public fun TdhCreatePayloadFilter(providerguid: Long, eventdescriptor: Long, eventmatchany: Boolean, payloadpredicatecount: UInt, payloadpredicates: Long, payloadfilter: Long): UInt {
    return Win32DynamicFfi.invoke("tdh.dll", "TdhCreatePayloadFilter", longArrayOf(providerguid, eventdescriptor, if (eventmatchany) 1L else 0L, payloadpredicatecount.toLong(), payloadpredicates, payloadfilter)).toUInt()
}

public fun TdhDeletePayloadFilter(payloadfilter: Long): UInt {
    return Win32DynamicFfi.invoke("tdh.dll", "TdhDeletePayloadFilter", longArrayOf(payloadfilter)).toUInt()
}

public fun TdhEnumerateManifestProviderEvents(providerguid: Long, buffer: Long, buffersize: Long): UInt {
    return Win32DynamicFfi.invoke("tdh.dll", "TdhEnumerateManifestProviderEvents", longArrayOf(providerguid, buffer, buffersize)).toUInt()
}

public fun TdhEnumerateProviderFieldInformation(pguid: Long, eventfieldtype: EVENT_FIELD_TYPE, pbuffer: Long, pbuffersize: Long): UInt {
    return Win32DynamicFfi.invoke("tdh.dll", "TdhEnumerateProviderFieldInformation", longArrayOf(pguid, eventfieldtype.toLong(), pbuffer, pbuffersize)).toUInt()
}

public fun TdhEnumerateProviderFilters(guid: Long, tdhcontextcount: UInt, tdhcontext: Long, filtercount: Long, buffer: Long, buffersize: Long): UInt {
    return Win32DynamicFfi.invoke("tdh.dll", "TdhEnumerateProviderFilters", longArrayOf(guid, tdhcontextcount.toLong(), tdhcontext, filtercount, buffer, buffersize)).toUInt()
}

public fun TdhEnumerateProviders(pbuffer: Long, pbuffersize: Long): UInt {
    return Win32DynamicFfi.invoke("tdh.dll", "TdhEnumerateProviders", longArrayOf(pbuffer, pbuffersize)).toUInt()
}

public fun TdhEnumerateProvidersForDecodingSource(filter: DECODING_SOURCE, buffer: Long, buffersize: UInt, bufferrequired: Long): UInt {
    return Win32DynamicFfi.invoke("tdh.dll", "TdhEnumerateProvidersForDecodingSource", longArrayOf(filter.toLong(), buffer, buffersize.toLong(), bufferrequired)).toUInt()
}

public fun TdhFormatProperty(eventinfo: Long, mapinfo: Long, pointersize: UInt, propertyintype: UShort, propertyouttype: UShort, propertylength: UShort, userdatalength: UShort, userdata: Long, buffersize: Long, buffer: PWSTR, userdataconsumed: Long): UInt {
    return Win32DynamicFfi.invoke("tdh.dll", "TdhFormatProperty", longArrayOf(eventinfo, mapinfo, pointersize.toLong(), propertyintype.toLong(), propertyouttype.toLong(), propertylength.toLong(), userdatalength.toLong(), userdata, buffersize, buffer, userdataconsumed)).toUInt()
}

public fun TdhGetDecodingParameter(handle: TDH_HANDLE, tdhcontext: Long): UInt {
    return Win32DynamicFfi.invoke("tdh.dll", "TdhGetDecodingParameter", longArrayOf(handle, tdhcontext)).toUInt()
}

public fun TdhGetEventInformation(event: Long, tdhcontextcount: UInt, tdhcontext: Long, buffer: Long, buffersize: Long): UInt {
    return Win32DynamicFfi.invoke("tdh.dll", "TdhGetEventInformation", longArrayOf(event, tdhcontextcount.toLong(), tdhcontext, buffer, buffersize)).toUInt()
}

public fun TdhGetEventMapInformation(pevent: Long, pmapname: PCWSTR, pbuffer: Long, pbuffersize: Long): UInt {
    return Win32DynamicFfi.invoke("tdh.dll", "TdhGetEventMapInformation", longArrayOf(pevent, pmapname, pbuffer, pbuffersize)).toUInt()
}

public fun TdhGetManifestEventInformation(providerguid: Long, eventdescriptor: Long, buffer: Long, buffersize: Long): UInt {
    return Win32DynamicFfi.invoke("tdh.dll", "TdhGetManifestEventInformation", longArrayOf(providerguid, eventdescriptor, buffer, buffersize)).toUInt()
}

public fun TdhGetProperty(pevent: Long, tdhcontextcount: UInt, ptdhcontext: Long, propertydatacount: UInt, ppropertydata: Long, buffersize: UInt, pbuffer: Long): UInt {
    return Win32DynamicFfi.invoke("tdh.dll", "TdhGetProperty", longArrayOf(pevent, tdhcontextcount.toLong(), ptdhcontext, propertydatacount.toLong(), ppropertydata, buffersize.toLong(), pbuffer)).toUInt()
}

public fun TdhGetPropertySize(pevent: Long, tdhcontextcount: UInt, ptdhcontext: Long, propertydatacount: UInt, ppropertydata: Long, ppropertysize: Long): UInt {
    return Win32DynamicFfi.invoke("tdh.dll", "TdhGetPropertySize", longArrayOf(pevent, tdhcontextcount.toLong(), ptdhcontext, propertydatacount.toLong(), ppropertydata, ppropertysize)).toUInt()
}

public fun TdhGetWppMessage(handle: TDH_HANDLE, eventrecord: Long, buffersize: Long, buffer: Long): UInt {
    return Win32DynamicFfi.invoke("tdh.dll", "TdhGetWppMessage", longArrayOf(handle, eventrecord, buffersize, buffer)).toUInt()
}

public fun TdhGetWppProperty(handle: TDH_HANDLE, eventrecord: Long, propertyname: PCWSTR, buffersize: Long, buffer: Long): UInt {
    return Win32DynamicFfi.invoke("tdh.dll", "TdhGetWppProperty", longArrayOf(handle, eventrecord, propertyname, buffersize, buffer)).toUInt()
}

public fun TdhLoadManifest(manifest: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("tdh.dll", "TdhLoadManifest", longArrayOf(manifest)).toUInt()
}

public fun TdhLoadManifestFromBinary(binarypath: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("tdh.dll", "TdhLoadManifestFromBinary", longArrayOf(binarypath)).toUInt()
}

public fun TdhLoadManifestFromMemory(pdata: Long, cbdata: UInt): UInt {
    return Win32DynamicFfi.invoke("tdh.dll", "TdhLoadManifestFromMemory", longArrayOf(pdata, cbdata.toLong())).toUInt()
}

public fun TdhOpenDecodingHandle(handle: Long): UInt {
    return Win32DynamicFfi.invoke("tdh.dll", "TdhOpenDecodingHandle", longArrayOf(handle)).toUInt()
}

public fun TdhQueryProviderFieldInformation(pguid: Long, eventfieldvalue: ULong, eventfieldtype: EVENT_FIELD_TYPE, pbuffer: Long, pbuffersize: Long): UInt {
    return Win32DynamicFfi.invoke("tdh.dll", "TdhQueryProviderFieldInformation", longArrayOf(pguid, eventfieldvalue.toLong(), eventfieldtype.toLong(), pbuffer, pbuffersize)).toUInt()
}

public fun TdhSetDecodingParameter(handle: TDH_HANDLE, tdhcontext: Long): UInt {
    return Win32DynamicFfi.invoke("tdh.dll", "TdhSetDecodingParameter", longArrayOf(handle, tdhcontext)).toUInt()
}

public fun TdhUnloadManifest(manifest: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("tdh.dll", "TdhUnloadManifest", longArrayOf(manifest)).toUInt()
}

public fun TdhUnloadManifestFromMemory(pdata: Long, cbdata: UInt): UInt {
    return Win32DynamicFfi.invoke("tdh.dll", "TdhUnloadManifestFromMemory", longArrayOf(pdata, cbdata.toLong())).toUInt()
}

public fun TraceEvent(tracehandle: ULong, eventtrace: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "TraceEvent", longArrayOf(tracehandle.toLong(), eventtrace))
    return Foundation.WIN32_ERROR()
}

public fun TraceEventInstance(tracehandle: ULong, eventtrace: Long, instinfo: Long, parentinstinfo: Long): UInt {
    return Win32DynamicFfi.invoke("advapi32.dll", "TraceEventInstance", longArrayOf(tracehandle.toLong(), eventtrace, instinfo, parentinstinfo)).toUInt()
}

public fun TraceMessage(loggerhandle: ULong, messageflags: TRACE_MESSAGE_FLAGS, messageguid: Long, messagenumber: UShort, vararg variadicArgs: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "TraceMessage", longArrayOf(loggerhandle.toLong(), messageflags.toLong(), messageguid, messagenumber.toLong()) + variadicArgs)
    return Foundation.WIN32_ERROR()
}

public fun TraceMessageVa(loggerhandle: ULong, messageflags: TRACE_MESSAGE_FLAGS, messageguid: Long, messagenumber: UShort, messagearglist: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "TraceMessageVa", longArrayOf(loggerhandle.toLong(), messageflags.toLong(), messageguid, messagenumber.toLong(), messagearglist))
    return Foundation.WIN32_ERROR()
}

public fun TraceQueryInformation(sessionhandle: CONTROLTRACE_HANDLE, informationclass: TRACE_QUERY_INFO_CLASS, traceinformation: Long, informationlength: UInt, returnlength: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "TraceQueryInformation", longArrayOf(sessionhandle.Value.toLong(), informationclass.toLong(), traceinformation, informationlength.toLong(), returnlength))
    return Foundation.WIN32_ERROR()
}

public fun TraceSetInformation(sessionhandle: CONTROLTRACE_HANDLE, informationclass: TRACE_QUERY_INFO_CLASS, traceinformation: Long, informationlength: UInt): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "TraceSetInformation", longArrayOf(sessionhandle.Value.toLong(), informationclass.toLong(), traceinformation, informationlength.toLong()))
    return Foundation.WIN32_ERROR()
}

public fun UnregisterTraceGuids(registrationhandle: ULong): UInt {
    return Win32DynamicFfi.invoke("advapi32.dll", "UnregisterTraceGuids", longArrayOf(registrationhandle.toLong())).toUInt()
}

public fun UpdateTraceA(tracehandle: CONTROLTRACE_HANDLE, instancename: PCSTR, properties: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "UpdateTraceA", longArrayOf(tracehandle.Value.toLong(), instancename, properties))
    return Foundation.WIN32_ERROR()
}

public fun UpdateTraceW(tracehandle: CONTROLTRACE_HANDLE, instancename: PCWSTR, properties: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "UpdateTraceW", longArrayOf(tracehandle.Value.toLong(), instancename, properties))
    return Foundation.WIN32_ERROR()
}
