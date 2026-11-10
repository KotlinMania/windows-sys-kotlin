package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.security.Psid

public expect fun closeTrace(tracehandle: ProcesstraceHandle): Win32Error

public expect fun controlTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: COpaquePointer?, controlcode: EventTraceControl): Win32Error

public expect fun controlTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: COpaquePointer?, controlcode: EventTraceControl): Win32Error

public expect fun createTraceInstanceId(reghandle: Handle, instinfo: COpaquePointer?): Win32Error

public expect fun cveEventWrite(cveid: Pcwstr, additionaldetails: Pcwstr): Int

public expect fun enableTrace(enable: UInt, enableflag: UInt, enablelevel: UInt, controlguid: COpaquePointer?, tracehandle: ControltraceHandle): Win32Error

public expect fun enableTraceEx(providerid: COpaquePointer?, sourceid: COpaquePointer?, tracehandle: ControltraceHandle, isenabled: UInt, level: UByte, matchanykeyword: ULong, matchallkeyword: ULong, enableproperty: UInt, enablefilterdesc: COpaquePointer?): Win32Error

public expect fun enableTraceEx2(tracehandle: ControltraceHandle, providerid: COpaquePointer?, controlcode: UInt, level: UByte, matchanykeyword: ULong, matchallkeyword: ULong, timeout: UInt, enableparameters: COpaquePointer?): Win32Error

public expect fun enumerateTraceGuids(guidpropertiesarray: COpaquePointer?, propertyarraycount: UInt, guidcount: COpaquePointer?): Win32Error

public expect fun enumerateTraceGuidsEx(tracequeryinfoclass: TraceQueryInfoClass, inbuffer: COpaquePointer?, inbuffersize: UInt, outbuffer: COpaquePointer?, outbuffersize: UInt, returnlength: COpaquePointer?): Win32Error

public expect fun eventAccessControl(guid: COpaquePointer?, operation: UInt, sid: Psid, rights: UInt, allowordeny: Boolean): UInt

public expect fun eventAccessQuery(guid: COpaquePointer?, buffer: PsecurityDescriptor, buffersize: COpaquePointer?): UInt

public expect fun eventAccessRemove(guid: COpaquePointer?): UInt

public expect fun eventActivityIdControl(controlcode: UInt, activityid: COpaquePointer?): UInt

public expect fun eventEnabled(reghandle: Reghandle, eventdescriptor: COpaquePointer?): Boolean

public expect fun eventProviderEnabled(reghandle: Reghandle, level: UByte, keyword: ULong): Boolean

public expect fun eventRegister(providerid: COpaquePointer?, enablecallback: Penablecallback, callbackcontext: COpaquePointer?, reghandle: COpaquePointer?): UInt

public expect fun eventSetInformation(reghandle: Reghandle, informationclass: EventInfoClass, eventinformation: COpaquePointer?, informationlength: UInt): UInt

public expect fun eventUnregister(reghandle: Reghandle): UInt

public expect fun eventWrite(reghandle: Reghandle, eventdescriptor: COpaquePointer?, userdatacount: UInt, userdata: COpaquePointer?): UInt

public expect fun eventWriteEx(reghandle: Reghandle, eventdescriptor: COpaquePointer?, filter: ULong, flags: UInt, activityid: COpaquePointer?, relatedactivityid: COpaquePointer?, userdatacount: UInt, userdata: COpaquePointer?): UInt

public expect fun eventWriteString(reghandle: Reghandle, level: UByte, keyword: ULong, string: Pcwstr): UInt

public expect fun eventWriteTransfer(reghandle: Reghandle, eventdescriptor: COpaquePointer?, activityid: COpaquePointer?, relatedactivityid: COpaquePointer?, userdatacount: UInt, userdata: COpaquePointer?): UInt

public expect fun flushTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: COpaquePointer?): Win32Error

public expect fun flushTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: COpaquePointer?): Win32Error

public expect fun getTraceEnableFlags(tracehandle: ULong): UInt

public expect fun getTraceEnableLevel(tracehandle: ULong): UByte

public expect fun getTraceLoggerHandle(buffer: COpaquePointer?): ULong

public expect fun openTraceA(logfile: COpaquePointer?): ProcesstraceHandle

public expect fun openTraceFromBufferStream(options: COpaquePointer?, buffercompletioncallback: PetwBufferCompletionCallback, buffercompletioncontext: COpaquePointer?): ULong

public expect fun openTraceFromFile(logfilename: Pcwstr, options: COpaquePointer?, logfileheader: COpaquePointer?): ULong

public expect fun openTraceFromRealTimeLogger(loggername: Pcwstr, options: COpaquePointer?, logfileheader: COpaquePointer?): ULong

public expect fun openTraceFromRealTimeLoggerWithAllocationOptions(loggername: Pcwstr, options: COpaquePointer?, allocationsize: ULong, memorypartitionhandle: Handle, logfileheader: COpaquePointer?): ULong

public expect fun openTraceW(logfile: COpaquePointer?): ProcesstraceHandle

public expect fun processTrace(handlearray: COpaquePointer?, handlecount: UInt, starttime: COpaquePointer?, endtime: COpaquePointer?): Win32Error

public expect fun processTraceAddBufferToBufferStream(tracehandle: ULong, buffer: COpaquePointer?, buffersize: UInt): UInt

public expect fun processTraceBufferDecrementReference(buffer: COpaquePointer?): UInt

public expect fun processTraceBufferIncrementReference(tracehandle: ULong, buffer: COpaquePointer?): UInt

public expect fun queryAllTracesA(propertyarray: COpaquePointer?, propertyarraycount: UInt, loggercount: COpaquePointer?): Win32Error

public expect fun queryAllTracesW(propertyarray: COpaquePointer?, propertyarraycount: UInt, loggercount: COpaquePointer?): Win32Error

public expect fun queryTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: COpaquePointer?): Win32Error

public expect fun queryTraceProcessingHandle(processinghandle: ProcesstraceHandle, informationclass: EtwProcessHandleInfoType, inbuffer: COpaquePointer?, inbuffersize: UInt, outbuffer: COpaquePointer?, outbuffersize: UInt, returnlength: COpaquePointer?): Win32Error

public expect fun queryTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: COpaquePointer?): Win32Error

public expect fun registerTraceGuidsA(requestaddress: Wmidprequest, requestcontext: COpaquePointer?, controlguid: COpaquePointer?, guidcount: UInt, traceguidreg: COpaquePointer?, mofimagepath: Pcstr, mofresourcename: Pcstr, registrationhandle: COpaquePointer?): UInt

public expect fun registerTraceGuidsW(requestaddress: Wmidprequest, requestcontext: COpaquePointer?, controlguid: COpaquePointer?, guidcount: UInt, traceguidreg: COpaquePointer?, mofimagepath: Pcwstr, mofresourcename: Pcwstr, registrationhandle: COpaquePointer?): UInt

public expect fun removeTraceCallback(pguid: COpaquePointer?): Win32Error

public expect fun setTraceCallback(pguid: COpaquePointer?, eventcallback: PeventCallback): Win32Error

public expect fun startTraceA(tracehandle: COpaquePointer?, instancename: Pcstr, properties: COpaquePointer?): Win32Error

public expect fun startTraceW(tracehandle: COpaquePointer?, instancename: Pcwstr, properties: COpaquePointer?): Win32Error

public expect fun stopTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: COpaquePointer?): Win32Error

public expect fun stopTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: COpaquePointer?): Win32Error

public expect fun tdhAggregatePayloadFilters(payloadfiltercount: UInt, payloadfilterptrs: COpaquePointer?, eventmatchallflags: COpaquePointer?, eventfilterdescriptor: COpaquePointer?): UInt

public expect fun tdhCleanupPayloadEventFilterDescriptor(eventfilterdescriptor: COpaquePointer?): UInt

public expect fun tdhCloseDecodingHandle(handle: TdhHandle): UInt

public expect fun tdhCreatePayloadFilter(providerguid: COpaquePointer?, eventdescriptor: COpaquePointer?, eventmatchany: Boolean, payloadpredicatecount: UInt, payloadpredicates: COpaquePointer?, payloadfilter: COpaquePointer?): UInt

public expect fun tdhDeletePayloadFilter(payloadfilter: COpaquePointer?): UInt

public expect fun tdhEnumerateManifestProviderEvents(providerguid: COpaquePointer?, buffer: COpaquePointer?, buffersize: COpaquePointer?): UInt

public expect fun tdhEnumerateProviderFieldInformation(pguid: COpaquePointer?, eventfieldtype: EventFieldType, pbuffer: COpaquePointer?, pbuffersize: COpaquePointer?): UInt

public expect fun tdhEnumerateProviderFilters(guid: COpaquePointer?, tdhcontextcount: UInt, tdhcontext: COpaquePointer?, filtercount: COpaquePointer?, buffer: COpaquePointer?, buffersize: COpaquePointer?): UInt

public expect fun tdhEnumerateProviders(pbuffer: COpaquePointer?, pbuffersize: COpaquePointer?): UInt

public expect fun tdhEnumerateProvidersForDecodingSource(filter: DecodingSource, buffer: COpaquePointer?, buffersize: UInt, bufferrequired: COpaquePointer?): UInt

public expect fun tdhFormatProperty(eventinfo: COpaquePointer?, mapinfo: COpaquePointer?, pointersize: UInt, propertyintype: UShort, propertyouttype: UShort, propertylength: UShort, userdatalength: UShort, userdata: COpaquePointer?, buffersize: COpaquePointer?, buffer: Pwstr, userdataconsumed: COpaquePointer?): UInt

public expect fun tdhGetDecodingParameter(handle: TdhHandle, tdhcontext: COpaquePointer?): UInt

public expect fun tdhGetEventInformation(event: COpaquePointer?, tdhcontextcount: UInt, tdhcontext: COpaquePointer?, buffer: COpaquePointer?, buffersize: COpaquePointer?): UInt

public expect fun tdhGetEventMapInformation(pevent: COpaquePointer?, pmapname: Pcwstr, pbuffer: COpaquePointer?, pbuffersize: COpaquePointer?): UInt

public expect fun tdhGetManifestEventInformation(providerguid: COpaquePointer?, eventdescriptor: COpaquePointer?, buffer: COpaquePointer?, buffersize: COpaquePointer?): UInt

public expect fun tdhGetProperty(pevent: COpaquePointer?, tdhcontextcount: UInt, ptdhcontext: COpaquePointer?, propertydatacount: UInt, ppropertydata: COpaquePointer?, buffersize: UInt, pbuffer: COpaquePointer?): UInt

public expect fun tdhGetPropertySize(pevent: COpaquePointer?, tdhcontextcount: UInt, ptdhcontext: COpaquePointer?, propertydatacount: UInt, ppropertydata: COpaquePointer?, ppropertysize: COpaquePointer?): UInt

public expect fun tdhGetWppMessage(handle: TdhHandle, eventrecord: COpaquePointer?, buffersize: COpaquePointer?, buffer: COpaquePointer?): UInt

public expect fun tdhGetWppProperty(handle: TdhHandle, eventrecord: COpaquePointer?, propertyname: Pcwstr, buffersize: COpaquePointer?, buffer: COpaquePointer?): UInt

public expect fun tdhLoadManifest(manifest: Pcwstr): UInt

public expect fun tdhLoadManifestFromBinary(binarypath: Pcwstr): UInt

public expect fun tdhLoadManifestFromMemory(pdata: COpaquePointer?, cbdata: UInt): UInt

public expect fun tdhOpenDecodingHandle(handle: COpaquePointer?): UInt

public expect fun tdhQueryProviderFieldInformation(pguid: COpaquePointer?, eventfieldvalue: ULong, eventfieldtype: EventFieldType, pbuffer: COpaquePointer?, pbuffersize: COpaquePointer?): UInt

public expect fun tdhSetDecodingParameter(handle: TdhHandle, tdhcontext: COpaquePointer?): UInt

public expect fun tdhUnloadManifest(manifest: Pcwstr): UInt

public expect fun tdhUnloadManifestFromMemory(pdata: COpaquePointer?, cbdata: UInt): UInt

public expect fun traceEvent(tracehandle: ULong, eventtrace: COpaquePointer?): Win32Error

public expect fun traceEventInstance(tracehandle: ULong, eventtrace: COpaquePointer?, instinfo: COpaquePointer?, parentinstinfo: COpaquePointer?): UInt

public expect fun traceMessage(loggerhandle: ULong, messageflags: TraceMessageFlags, messageguid: COpaquePointer?, messagenumber: UShort, vararg variadicArgs: Long): Win32Error

public expect fun traceMessageVa(loggerhandle: ULong, messageflags: TraceMessageFlags, messageguid: COpaquePointer?, messagenumber: UShort, messagearglist: COpaquePointer?): Win32Error

public expect fun traceQueryInformation(sessionhandle: ControltraceHandle, informationclass: TraceQueryInfoClass, traceinformation: COpaquePointer?, informationlength: UInt, returnlength: COpaquePointer?): Win32Error

public expect fun traceSetInformation(sessionhandle: ControltraceHandle, informationclass: TraceQueryInfoClass, traceinformation: COpaquePointer?, informationlength: UInt): Win32Error

public expect fun unregisterTraceGuids(registrationhandle: ULong): UInt

public expect fun updateTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: COpaquePointer?): Win32Error

public expect fun updateTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: COpaquePointer?): Win32Error
