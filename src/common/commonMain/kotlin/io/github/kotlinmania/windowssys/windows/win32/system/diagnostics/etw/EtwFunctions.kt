package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.security.Psid

public expect fun closeTrace(tracehandle: ProcesstraceHandle): Win32Error

public expect fun controlTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: MutPtr<EventTraceProperties>, controlcode: EventTraceControl): Win32Error

public expect fun controlTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: MutPtr<EventTraceProperties>, controlcode: EventTraceControl): Win32Error

public expect fun createTraceInstanceId(reghandle: Handle, instinfo: MutPtr<EventInstanceInfo>): Win32Error

public expect fun cveEventWrite(cveid: Pcwstr, additionaldetails: Pcwstr): Int

public expect fun enableTrace(enable: UInt, enableflag: UInt, enablelevel: UInt, controlguid: ConstPtr<Guid>, tracehandle: ControltraceHandle): Win32Error

public expect fun enableTraceEx(providerid: ConstPtr<Guid>, sourceid: ConstPtr<Guid>, tracehandle: ControltraceHandle, isenabled: UInt, level: UByte, matchanykeyword: ULong, matchallkeyword: ULong, enableproperty: UInt, enablefilterdesc: ConstPtr<EventFilterDescriptor>): Win32Error

public expect fun enableTraceEx2(tracehandle: ControltraceHandle, providerid: ConstPtr<Guid>, controlcode: UInt, level: UByte, matchanykeyword: ULong, matchallkeyword: ULong, timeout: UInt, enableparameters: ConstPtr<EnableTraceParameters>): Win32Error

public expect fun enumerateTraceGuids(guidpropertiesarray: MutPtr<MutPtr<TraceGuidProperties>>, propertyarraycount: UInt, guidcount: MutPtr<UInt>): Win32Error

public expect fun enumerateTraceGuidsEx(tracequeryinfoclass: TraceQueryInfoClass, inbuffer: ConstPtr<CVoid>, inbuffersize: UInt, outbuffer: MutPtr<CVoid>, outbuffersize: UInt, returnlength: MutPtr<UInt>): Win32Error

public expect fun eventAccessControl(guid: ConstPtr<Guid>, operation: UInt, sid: Psid, rights: UInt, allowordeny: Boolean): UInt

public expect fun eventAccessQuery(guid: ConstPtr<Guid>, buffer: PsecurityDescriptor, buffersize: MutPtr<UInt>): UInt

public expect fun eventAccessRemove(guid: ConstPtr<Guid>): UInt

public expect fun eventActivityIdControl(controlcode: UInt, activityid: MutPtr<Guid>): UInt

public expect fun eventEnabled(reghandle: Reghandle, eventdescriptor: ConstPtr<EventDescriptor>): Boolean

public expect fun eventProviderEnabled(reghandle: Reghandle, level: UByte, keyword: ULong): Boolean

public expect fun eventRegister(providerid: ConstPtr<Guid>, enablecallback: Penablecallback, callbackcontext: ConstPtr<CVoid>, reghandle: MutPtr<Reghandle>): UInt

public expect fun eventSetInformation(reghandle: Reghandle, informationclass: EventInfoClass, eventinformation: ConstPtr<CVoid>, informationlength: UInt): UInt

public expect fun eventUnregister(reghandle: Reghandle): UInt

public expect fun eventWrite(reghandle: Reghandle, eventdescriptor: ConstPtr<EventDescriptor>, userdatacount: UInt, userdata: ConstPtr<EventDataDescriptor>): UInt

public expect fun eventWriteEx(reghandle: Reghandle, eventdescriptor: ConstPtr<EventDescriptor>, filter: ULong, flags: UInt, activityid: ConstPtr<Guid>, relatedactivityid: ConstPtr<Guid>, userdatacount: UInt, userdata: ConstPtr<EventDataDescriptor>): UInt

public expect fun eventWriteString(reghandle: Reghandle, level: UByte, keyword: ULong, string: Pcwstr): UInt

public expect fun eventWriteTransfer(reghandle: Reghandle, eventdescriptor: ConstPtr<EventDescriptor>, activityid: ConstPtr<Guid>, relatedactivityid: ConstPtr<Guid>, userdatacount: UInt, userdata: ConstPtr<EventDataDescriptor>): UInt

public expect fun flushTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: MutPtr<EventTraceProperties>): Win32Error

public expect fun flushTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: MutPtr<EventTraceProperties>): Win32Error

public expect fun getTraceEnableFlags(tracehandle: ULong): UInt

public expect fun getTraceEnableLevel(tracehandle: ULong): UByte

public expect fun getTraceLoggerHandle(buffer: ConstPtr<CVoid>): ULong

public expect fun openTraceA(logfile: MutPtr<EventTraceLogfilea>): ProcesstraceHandle

public expect fun openTraceFromBufferStream(options: ConstPtr<EtwOpenTraceOptions>, buffercompletioncallback: PetwBufferCompletionCallback, buffercompletioncontext: ConstPtr<CVoid>): ULong

public expect fun openTraceFromFile(logfilename: Pcwstr, options: ConstPtr<EtwOpenTraceOptions>, logfileheader: MutPtr<TraceLogfileHeader>): ULong

public expect fun openTraceFromRealTimeLogger(loggername: Pcwstr, options: ConstPtr<EtwOpenTraceOptions>, logfileheader: MutPtr<TraceLogfileHeader>): ULong

public expect fun openTraceFromRealTimeLoggerWithAllocationOptions(loggername: Pcwstr, options: ConstPtr<EtwOpenTraceOptions>, allocationsize: ULong, memorypartitionhandle: Handle, logfileheader: MutPtr<TraceLogfileHeader>): ULong

public expect fun openTraceW(logfile: MutPtr<EventTraceLogfilew>): ProcesstraceHandle

public expect fun processTrace(handlearray: ConstPtr<ProcesstraceHandle>, handlecount: UInt, starttime: ConstPtr<Filetime>, endtime: ConstPtr<Filetime>): Win32Error

public expect fun processTraceAddBufferToBufferStream(tracehandle: ULong, buffer: ConstPtr<EtwBufferHeader>, buffersize: UInt): UInt

public expect fun processTraceBufferDecrementReference(buffer: ConstPtr<EtwBufferHeader>): UInt

public expect fun processTraceBufferIncrementReference(tracehandle: ULong, buffer: ConstPtr<EtwBufferHeader>): UInt

public expect fun queryAllTracesA(propertyarray: MutPtr<MutPtr<EventTraceProperties>>, propertyarraycount: UInt, loggercount: MutPtr<UInt>): Win32Error

public expect fun queryAllTracesW(propertyarray: MutPtr<MutPtr<EventTraceProperties>>, propertyarraycount: UInt, loggercount: MutPtr<UInt>): Win32Error

public expect fun queryTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: MutPtr<EventTraceProperties>): Win32Error

public expect fun queryTraceProcessingHandle(processinghandle: ProcesstraceHandle, informationclass: EtwProcessHandleInfoType, inbuffer: ConstPtr<CVoid>, inbuffersize: UInt, outbuffer: MutPtr<CVoid>, outbuffersize: UInt, returnlength: MutPtr<UInt>): Win32Error

public expect fun queryTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: MutPtr<EventTraceProperties>): Win32Error

public expect fun registerTraceGuidsA(requestaddress: Wmidprequest, requestcontext: ConstPtr<CVoid>, controlguid: ConstPtr<Guid>, guidcount: UInt, traceguidreg: ConstPtr<TraceGuidRegistration>, mofimagepath: Pcstr, mofresourcename: Pcstr, registrationhandle: MutPtr<ULong>): UInt

public expect fun registerTraceGuidsW(requestaddress: Wmidprequest, requestcontext: ConstPtr<CVoid>, controlguid: ConstPtr<Guid>, guidcount: UInt, traceguidreg: ConstPtr<TraceGuidRegistration>, mofimagepath: Pcwstr, mofresourcename: Pcwstr, registrationhandle: MutPtr<ULong>): UInt

public expect fun removeTraceCallback(pguid: ConstPtr<Guid>): Win32Error

public expect fun setTraceCallback(pguid: ConstPtr<Guid>, eventcallback: PeventCallback): Win32Error

public expect fun startTraceA(tracehandle: MutPtr<ControltraceHandle>, instancename: Pcstr, properties: MutPtr<EventTraceProperties>): Win32Error

public expect fun startTraceW(tracehandle: MutPtr<ControltraceHandle>, instancename: Pcwstr, properties: MutPtr<EventTraceProperties>): Win32Error

public expect fun stopTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: MutPtr<EventTraceProperties>): Win32Error

public expect fun stopTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: MutPtr<EventTraceProperties>): Win32Error

public expect fun tdhAggregatePayloadFilters(payloadfiltercount: UInt, payloadfilterptrs: ConstPtr<ConstPtr<CVoid>>, eventmatchallflags: ConstPtr<Boolean>, eventfilterdescriptor: MutPtr<EventFilterDescriptor>): UInt

public expect fun tdhCleanupPayloadEventFilterDescriptor(eventfilterdescriptor: MutPtr<EventFilterDescriptor>): UInt

public expect fun tdhCloseDecodingHandle(handle: TdhHandle): UInt

public expect fun tdhCreatePayloadFilter(providerguid: ConstPtr<Guid>, eventdescriptor: ConstPtr<EventDescriptor>, eventmatchany: Boolean, payloadpredicatecount: UInt, payloadpredicates: ConstPtr<PayloadFilterPredicate>, payloadfilter: MutPtr<MutPtr<CVoid>>): UInt

public expect fun tdhDeletePayloadFilter(payloadfilter: MutPtr<MutPtr<CVoid>>): UInt

public expect fun tdhEnumerateManifestProviderEvents(providerguid: ConstPtr<Guid>, buffer: MutPtr<ProviderEventInfo>, buffersize: MutPtr<UInt>): UInt

public expect fun tdhEnumerateProviderFieldInformation(pguid: ConstPtr<Guid>, eventfieldtype: EventFieldType, pbuffer: MutPtr<ProviderFieldInfoarray>, pbuffersize: MutPtr<UInt>): UInt

public expect fun tdhEnumerateProviderFilters(guid: ConstPtr<Guid>, tdhcontextcount: UInt, tdhcontext: ConstPtr<TdhContext>, filtercount: MutPtr<UInt>, buffer: MutPtr<MutPtr<ProviderFilterInfo>>, buffersize: MutPtr<UInt>): UInt

public expect fun tdhEnumerateProviders(pbuffer: MutPtr<ProviderEnumerationInfo>, pbuffersize: MutPtr<UInt>): UInt

public expect fun tdhEnumerateProvidersForDecodingSource(filter: DecodingSource, buffer: MutPtr<ProviderEnumerationInfo>, buffersize: UInt, bufferrequired: MutPtr<UInt>): UInt

public expect fun tdhFormatProperty(eventinfo: ConstPtr<TraceEventInfo>, mapinfo: ConstPtr<EventMapInfo>, pointersize: UInt, propertyintype: UShort, propertyouttype: UShort, propertylength: UShort, userdatalength: UShort, userdata: ConstPtr<UByte>, buffersize: MutPtr<UInt>, buffer: Pwstr, userdataconsumed: MutPtr<UShort>): UInt

public expect fun tdhGetDecodingParameter(handle: TdhHandle, tdhcontext: MutPtr<TdhContext>): UInt

public expect fun tdhGetEventInformation(event: ConstPtr<EventRecord>, tdhcontextcount: UInt, tdhcontext: ConstPtr<TdhContext>, buffer: MutPtr<TraceEventInfo>, buffersize: MutPtr<UInt>): UInt

public expect fun tdhGetEventMapInformation(pevent: ConstPtr<EventRecord>, pmapname: Pcwstr, pbuffer: MutPtr<EventMapInfo>, pbuffersize: MutPtr<UInt>): UInt

public expect fun tdhGetManifestEventInformation(providerguid: ConstPtr<Guid>, eventdescriptor: ConstPtr<EventDescriptor>, buffer: MutPtr<TraceEventInfo>, buffersize: MutPtr<UInt>): UInt

public expect fun tdhGetProperty(pevent: ConstPtr<EventRecord>, tdhcontextcount: UInt, ptdhcontext: ConstPtr<TdhContext>, propertydatacount: UInt, ppropertydata: ConstPtr<PropertyDataDescriptor>, buffersize: UInt, pbuffer: MutPtr<UByte>): UInt

public expect fun tdhGetPropertySize(pevent: ConstPtr<EventRecord>, tdhcontextcount: UInt, ptdhcontext: ConstPtr<TdhContext>, propertydatacount: UInt, ppropertydata: ConstPtr<PropertyDataDescriptor>, ppropertysize: MutPtr<UInt>): UInt

public expect fun tdhGetWppMessage(handle: TdhHandle, eventrecord: ConstPtr<EventRecord>, buffersize: MutPtr<UInt>, buffer: MutPtr<UByte>): UInt

public expect fun tdhGetWppProperty(handle: TdhHandle, eventrecord: ConstPtr<EventRecord>, propertyname: Pcwstr, buffersize: MutPtr<UInt>, buffer: MutPtr<UByte>): UInt

public expect fun tdhLoadManifest(manifest: Pcwstr): UInt

public expect fun tdhLoadManifestFromBinary(binarypath: Pcwstr): UInt

public expect fun tdhLoadManifestFromMemory(pdata: ConstPtr<CVoid>, cbdata: UInt): UInt

public expect fun tdhOpenDecodingHandle(handle: MutPtr<TdhHandle>): UInt

public expect fun tdhQueryProviderFieldInformation(pguid: ConstPtr<Guid>, eventfieldvalue: ULong, eventfieldtype: EventFieldType, pbuffer: MutPtr<ProviderFieldInfoarray>, pbuffersize: MutPtr<UInt>): UInt

public expect fun tdhSetDecodingParameter(handle: TdhHandle, tdhcontext: ConstPtr<TdhContext>): UInt

public expect fun tdhUnloadManifest(manifest: Pcwstr): UInt

public expect fun tdhUnloadManifestFromMemory(pdata: ConstPtr<CVoid>, cbdata: UInt): UInt

public expect fun traceEvent(tracehandle: ULong, eventtrace: ConstPtr<EventTraceHeader>): Win32Error

public expect fun traceEventInstance(tracehandle: ULong, eventtrace: ConstPtr<EventInstanceHeader>, instinfo: ConstPtr<EventInstanceInfo>, parentinstinfo: ConstPtr<EventInstanceInfo>): UInt

public expect fun traceMessage(loggerhandle: ULong, messageflags: TraceMessageFlags, messageguid: ConstPtr<Guid>, messagenumber: UShort, vararg variadicArgs: Long): Win32Error

public expect fun traceMessageVa(loggerhandle: ULong, messageflags: TraceMessageFlags, messageguid: ConstPtr<Guid>, messagenumber: UShort, messagearglist: ConstPtr<Byte>): Win32Error

public expect fun traceQueryInformation(sessionhandle: ControltraceHandle, informationclass: TraceQueryInfoClass, traceinformation: MutPtr<CVoid>, informationlength: UInt, returnlength: MutPtr<UInt>): Win32Error

public expect fun traceSetInformation(sessionhandle: ControltraceHandle, informationclass: TraceQueryInfoClass, traceinformation: ConstPtr<CVoid>, informationlength: UInt): Win32Error

public expect fun unregisterTraceGuids(registrationhandle: ULong): UInt

public expect fun updateTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: MutPtr<EventTraceProperties>): Win32Error

public expect fun updateTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: MutPtr<EventTraceProperties>): Win32Error
