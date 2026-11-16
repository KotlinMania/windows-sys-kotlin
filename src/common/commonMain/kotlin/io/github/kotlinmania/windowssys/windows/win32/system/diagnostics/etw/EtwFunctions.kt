package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.security.Psid

public expect fun closeTrace(tracehandle: ProcesstraceHandle): Win32Error

public expect fun controlTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: MutPtr, controlcode: EventTraceControl): Win32Error

public expect fun controlTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: MutPtr, controlcode: EventTraceControl): Win32Error

public expect fun createTraceInstanceId(reghandle: Handle, instinfo: MutPtr): Win32Error

public expect fun cveEventWrite(cveid: Pcwstr, additionaldetails: Pcwstr): Int

public expect fun enableTrace(enable: UInt, enableflag: UInt, enablelevel: UInt, controlguid: ConstPtr, tracehandle: ControltraceHandle): Win32Error

public expect fun enableTraceEx(providerid: ConstPtr, sourceid: ConstPtr, tracehandle: ControltraceHandle, isenabled: UInt, level: UByte, matchanykeyword: ULong, matchallkeyword: ULong, enableproperty: UInt, enablefilterdesc: ConstPtr): Win32Error

public expect fun enableTraceEx2(tracehandle: ControltraceHandle, providerid: ConstPtr, controlcode: UInt, level: UByte, matchanykeyword: ULong, matchallkeyword: ULong, timeout: UInt, enableparameters: ConstPtr): Win32Error

public expect fun enumerateTraceGuids(guidpropertiesarray: MutPtr, propertyarraycount: UInt, guidcount: MutPtr): Win32Error

public expect fun enumerateTraceGuidsEx(tracequeryinfoclass: TraceQueryInfoClass, inbuffer: ConstPtr, inbuffersize: UInt, outbuffer: MutPtr, outbuffersize: UInt, returnlength: MutPtr): Win32Error

public expect fun eventAccessControl(guid: ConstPtr, operation: UInt, sid: Psid, rights: UInt, allowordeny: Boolean): UInt

public expect fun eventAccessQuery(guid: ConstPtr, buffer: PsecurityDescriptor, buffersize: MutPtr): UInt

public expect fun eventAccessRemove(guid: ConstPtr): UInt

public expect fun eventActivityIdControl(controlcode: UInt, activityid: MutPtr): UInt

public expect fun eventEnabled(reghandle: Reghandle, eventdescriptor: ConstPtr): Boolean

public expect fun eventProviderEnabled(reghandle: Reghandle, level: UByte, keyword: ULong): Boolean

public expect fun eventRegister(providerid: ConstPtr, enablecallback: Penablecallback, callbackcontext: ConstPtr, reghandle: MutPtr): UInt

public expect fun eventSetInformation(reghandle: Reghandle, informationclass: EventInfoClass, eventinformation: ConstPtr, informationlength: UInt): UInt

public expect fun eventUnregister(reghandle: Reghandle): UInt

public expect fun eventWrite(reghandle: Reghandle, eventdescriptor: ConstPtr, userdatacount: UInt, userdata: ConstPtr): UInt

public expect fun eventWriteEx(reghandle: Reghandle, eventdescriptor: ConstPtr, filter: ULong, flags: UInt, activityid: ConstPtr, relatedactivityid: ConstPtr, userdatacount: UInt, userdata: ConstPtr): UInt

public expect fun eventWriteString(reghandle: Reghandle, level: UByte, keyword: ULong, string: Pcwstr): UInt

public expect fun eventWriteTransfer(reghandle: Reghandle, eventdescriptor: ConstPtr, activityid: ConstPtr, relatedactivityid: ConstPtr, userdatacount: UInt, userdata: ConstPtr): UInt

public expect fun flushTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: MutPtr): Win32Error

public expect fun flushTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: MutPtr): Win32Error

public expect fun getTraceEnableFlags(tracehandle: ULong): UInt

public expect fun getTraceEnableLevel(tracehandle: ULong): UByte

public expect fun getTraceLoggerHandle(buffer: ConstPtr): ULong

public expect fun openTraceA(logfile: MutPtr): ProcesstraceHandle

public expect fun openTraceFromBufferStream(options: ConstPtr, buffercompletioncallback: PetwBufferCompletionCallback, buffercompletioncontext: ConstPtr): ULong

public expect fun openTraceFromFile(logfilename: Pcwstr, options: ConstPtr, logfileheader: MutPtr): ULong

public expect fun openTraceFromRealTimeLogger(loggername: Pcwstr, options: ConstPtr, logfileheader: MutPtr): ULong

public expect fun openTraceFromRealTimeLoggerWithAllocationOptions(loggername: Pcwstr, options: ConstPtr, allocationsize: ULong, memorypartitionhandle: Handle, logfileheader: MutPtr): ULong

public expect fun openTraceW(logfile: MutPtr): ProcesstraceHandle

public expect fun processTrace(handlearray: ConstPtr, handlecount: UInt, starttime: ConstPtr, endtime: ConstPtr): Win32Error

public expect fun processTraceAddBufferToBufferStream(tracehandle: ULong, buffer: ConstPtr, buffersize: UInt): UInt

public expect fun processTraceBufferDecrementReference(buffer: ConstPtr): UInt

public expect fun processTraceBufferIncrementReference(tracehandle: ULong, buffer: ConstPtr): UInt

public expect fun queryAllTracesA(propertyarray: MutPtr, propertyarraycount: UInt, loggercount: MutPtr): Win32Error

public expect fun queryAllTracesW(propertyarray: MutPtr, propertyarraycount: UInt, loggercount: MutPtr): Win32Error

public expect fun queryTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: MutPtr): Win32Error

public expect fun queryTraceProcessingHandle(processinghandle: ProcesstraceHandle, informationclass: EtwProcessHandleInfoType, inbuffer: ConstPtr, inbuffersize: UInt, outbuffer: MutPtr, outbuffersize: UInt, returnlength: MutPtr): Win32Error

public expect fun queryTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: MutPtr): Win32Error

public expect fun registerTraceGuidsA(requestaddress: Wmidprequest, requestcontext: ConstPtr, controlguid: ConstPtr, guidcount: UInt, traceguidreg: ConstPtr, mofimagepath: Pcstr, mofresourcename: Pcstr, registrationhandle: MutPtr): UInt

public expect fun registerTraceGuidsW(requestaddress: Wmidprequest, requestcontext: ConstPtr, controlguid: ConstPtr, guidcount: UInt, traceguidreg: ConstPtr, mofimagepath: Pcwstr, mofresourcename: Pcwstr, registrationhandle: MutPtr): UInt

public expect fun removeTraceCallback(pguid: ConstPtr): Win32Error

public expect fun setTraceCallback(pguid: ConstPtr, eventcallback: PeventCallback): Win32Error

public expect fun startTraceA(tracehandle: MutPtr, instancename: Pcstr, properties: MutPtr): Win32Error

public expect fun startTraceW(tracehandle: MutPtr, instancename: Pcwstr, properties: MutPtr): Win32Error

public expect fun stopTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: MutPtr): Win32Error

public expect fun stopTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: MutPtr): Win32Error

public expect fun tdhAggregatePayloadFilters(payloadfiltercount: UInt, payloadfilterptrs: ConstPtr, eventmatchallflags: ConstPtr, eventfilterdescriptor: MutPtr): UInt

public expect fun tdhCleanupPayloadEventFilterDescriptor(eventfilterdescriptor: MutPtr): UInt

public expect fun tdhCloseDecodingHandle(handle: TdhHandle): UInt

public expect fun tdhCreatePayloadFilter(providerguid: ConstPtr, eventdescriptor: ConstPtr, eventmatchany: Boolean, payloadpredicatecount: UInt, payloadpredicates: ConstPtr, payloadfilter: MutPtr): UInt

public expect fun tdhDeletePayloadFilter(payloadfilter: MutPtr): UInt

public expect fun tdhEnumerateManifestProviderEvents(providerguid: ConstPtr, buffer: MutPtr, buffersize: MutPtr): UInt

public expect fun tdhEnumerateProviderFieldInformation(pguid: ConstPtr, eventfieldtype: EventFieldType, pbuffer: MutPtr, pbuffersize: MutPtr): UInt

public expect fun tdhEnumerateProviderFilters(guid: ConstPtr, tdhcontextcount: UInt, tdhcontext: ConstPtr, filtercount: MutPtr, buffer: MutPtr, buffersize: MutPtr): UInt

public expect fun tdhEnumerateProviders(pbuffer: MutPtr, pbuffersize: MutPtr): UInt

public expect fun tdhEnumerateProvidersForDecodingSource(filter: DecodingSource, buffer: MutPtr, buffersize: UInt, bufferrequired: MutPtr): UInt

public expect fun tdhFormatProperty(eventinfo: ConstPtr, mapinfo: ConstPtr, pointersize: UInt, propertyintype: UShort, propertyouttype: UShort, propertylength: UShort, userdatalength: UShort, userdata: ConstPtr, buffersize: MutPtr, buffer: Pwstr, userdataconsumed: MutPtr): UInt

public expect fun tdhGetDecodingParameter(handle: TdhHandle, tdhcontext: MutPtr): UInt

public expect fun tdhGetEventInformation(event: ConstPtr, tdhcontextcount: UInt, tdhcontext: ConstPtr, buffer: MutPtr, buffersize: MutPtr): UInt

public expect fun tdhGetEventMapInformation(pevent: ConstPtr, pmapname: Pcwstr, pbuffer: MutPtr, pbuffersize: MutPtr): UInt

public expect fun tdhGetManifestEventInformation(providerguid: ConstPtr, eventdescriptor: ConstPtr, buffer: MutPtr, buffersize: MutPtr): UInt

public expect fun tdhGetProperty(pevent: ConstPtr, tdhcontextcount: UInt, ptdhcontext: ConstPtr, propertydatacount: UInt, ppropertydata: ConstPtr, buffersize: UInt, pbuffer: MutPtr): UInt

public expect fun tdhGetPropertySize(pevent: ConstPtr, tdhcontextcount: UInt, ptdhcontext: ConstPtr, propertydatacount: UInt, ppropertydata: ConstPtr, ppropertysize: MutPtr): UInt

public expect fun tdhGetWppMessage(handle: TdhHandle, eventrecord: ConstPtr, buffersize: MutPtr, buffer: MutPtr): UInt

public expect fun tdhGetWppProperty(handle: TdhHandle, eventrecord: ConstPtr, propertyname: Pcwstr, buffersize: MutPtr, buffer: MutPtr): UInt

public expect fun tdhLoadManifest(manifest: Pcwstr): UInt

public expect fun tdhLoadManifestFromBinary(binarypath: Pcwstr): UInt

public expect fun tdhLoadManifestFromMemory(pdata: ConstPtr, cbdata: UInt): UInt

public expect fun tdhOpenDecodingHandle(handle: MutPtr): UInt

public expect fun tdhQueryProviderFieldInformation(pguid: ConstPtr, eventfieldvalue: ULong, eventfieldtype: EventFieldType, pbuffer: MutPtr, pbuffersize: MutPtr): UInt

public expect fun tdhSetDecodingParameter(handle: TdhHandle, tdhcontext: ConstPtr): UInt

public expect fun tdhUnloadManifest(manifest: Pcwstr): UInt

public expect fun tdhUnloadManifestFromMemory(pdata: ConstPtr, cbdata: UInt): UInt

public expect fun traceEvent(tracehandle: ULong, eventtrace: ConstPtr): Win32Error

public expect fun traceEventInstance(tracehandle: ULong, eventtrace: ConstPtr, instinfo: ConstPtr, parentinstinfo: ConstPtr): UInt

public expect fun traceMessage(loggerhandle: ULong, messageflags: TraceMessageFlags, messageguid: ConstPtr, messagenumber: UShort, vararg variadicArgs: Long): Win32Error

public expect fun traceMessageVa(loggerhandle: ULong, messageflags: TraceMessageFlags, messageguid: ConstPtr, messagenumber: UShort, messagearglist: ConstPtr): Win32Error

public expect fun traceQueryInformation(sessionhandle: ControltraceHandle, informationclass: TraceQueryInfoClass, traceinformation: MutPtr, informationlength: UInt, returnlength: MutPtr): Win32Error

public expect fun traceSetInformation(sessionhandle: ControltraceHandle, informationclass: TraceQueryInfoClass, traceinformation: ConstPtr, informationlength: UInt): Win32Error

public expect fun unregisterTraceGuids(registrationhandle: ULong): UInt

public expect fun updateTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: MutPtr): Win32Error

public expect fun updateTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: MutPtr): Win32Error
