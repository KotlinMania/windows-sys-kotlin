@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

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

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun closeTrace(tracehandle: ProcesstraceHandle): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwCloseTrace")

public actual fun controlTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: MutPtr<EventTraceProperties>, controlcode: EventTraceControl): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwControlTraceA")

public actual fun controlTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: MutPtr<EventTraceProperties>, controlcode: EventTraceControl): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwControlTraceW")

public actual fun createTraceInstanceId(reghandle: Handle, instinfo: MutPtr<EventInstanceInfo>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwCreateTraceInstanceId")

public actual fun cveEventWrite(cveid: Pcwstr, additionaldetails: Pcwstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwCveEventWrite")

public actual fun enableTrace(enable: UInt, enableflag: UInt, enablelevel: UInt, controlguid: ConstPtr<Guid>, tracehandle: ControltraceHandle): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwEnableTrace")

public actual fun enableTraceEx(providerid: ConstPtr<Guid>, sourceid: ConstPtr<Guid>, tracehandle: ControltraceHandle, isenabled: UInt, level: UByte, matchanykeyword: ULong, matchallkeyword: ULong, enableproperty: UInt, enablefilterdesc: ConstPtr<EventFilterDescriptor>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwEnableTraceEx")

public actual fun enableTraceEx2(tracehandle: ControltraceHandle, providerid: ConstPtr<Guid>, controlcode: UInt, level: UByte, matchanykeyword: ULong, matchallkeyword: ULong, timeout: UInt, enableparameters: ConstPtr<EnableTraceParameters>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwEnableTraceEx2")

public actual fun enumerateTraceGuids(guidpropertiesarray: MutPtr<MutPtr<TraceGuidProperties>>, propertyarraycount: UInt, guidcount: MutPtr<UInt>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwEnumerateTraceGuids")

public actual fun enumerateTraceGuidsEx(tracequeryinfoclass: TraceQueryInfoClass, inbuffer: ConstPtr<CVoid>, inbuffersize: UInt, outbuffer: MutPtr<CVoid>, outbuffersize: UInt, returnlength: MutPtr<UInt>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwEnumerateTraceGuidsEx")

public actual fun eventAccessControl(guid: ConstPtr<Guid>, operation: UInt, sid: Psid, rights: UInt, allowordeny: Boolean): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwEventAccessControl")

public actual fun eventAccessQuery(guid: ConstPtr<Guid>, buffer: PsecurityDescriptor, buffersize: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwEventAccessQuery")

public actual fun eventAccessRemove(guid: ConstPtr<Guid>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwEventAccessRemove")

public actual fun eventActivityIdControl(controlcode: UInt, activityid: MutPtr<Guid>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwEventActivityIdControl")

public actual fun eventEnabled(reghandle: Reghandle, eventdescriptor: ConstPtr<EventDescriptor>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwEventEnabled")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemDiagnosticsEtwEventProviderEnabled")
private external fun wasiWindowssysWindowsWin32SystemDiagnosticsEtwEventProviderEnabled(reghandle: Long, level: Int, keyword: Long): Int

public actual fun eventProviderEnabled(reghandle: Reghandle, level: UByte, keyword: ULong): Boolean =
    (wasiWindowssysWindowsWin32SystemDiagnosticsEtwEventProviderEnabled(reghandle, level.toInt(), keyword.toLong()) != 0)

public actual fun eventRegister(providerid: ConstPtr<Guid>, enablecallback: Penablecallback, callbackcontext: ConstPtr<CVoid>, reghandle: MutPtr<Reghandle>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwEventRegister")

public actual fun eventSetInformation(reghandle: Reghandle, informationclass: EventInfoClass, eventinformation: ConstPtr<CVoid>, informationlength: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwEventSetInformation")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemDiagnosticsEtwEventUnregister")
private external fun wasiWindowssysWindowsWin32SystemDiagnosticsEtwEventUnregister(reghandle: Long): Int

public actual fun eventUnregister(reghandle: Reghandle): UInt =
    wasiWindowssysWindowsWin32SystemDiagnosticsEtwEventUnregister(reghandle).toUInt()

public actual fun eventWrite(reghandle: Reghandle, eventdescriptor: ConstPtr<EventDescriptor>, userdatacount: UInt, userdata: ConstPtr<EventDataDescriptor>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwEventWrite")

public actual fun eventWriteEx(reghandle: Reghandle, eventdescriptor: ConstPtr<EventDescriptor>, filter: ULong, flags: UInt, activityid: ConstPtr<Guid>, relatedactivityid: ConstPtr<Guid>, userdatacount: UInt, userdata: ConstPtr<EventDataDescriptor>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwEventWriteEx")

public actual fun eventWriteString(reghandle: Reghandle, level: UByte, keyword: ULong, string: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwEventWriteString")

public actual fun eventWriteTransfer(reghandle: Reghandle, eventdescriptor: ConstPtr<EventDescriptor>, activityid: ConstPtr<Guid>, relatedactivityid: ConstPtr<Guid>, userdatacount: UInt, userdata: ConstPtr<EventDataDescriptor>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwEventWriteTransfer")

public actual fun flushTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: MutPtr<EventTraceProperties>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwFlushTraceA")

public actual fun flushTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: MutPtr<EventTraceProperties>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwFlushTraceW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemDiagnosticsEtwGetTraceEnableFlags")
private external fun wasiWindowssysWindowsWin32SystemDiagnosticsEtwGetTraceEnableFlags(tracehandle: Long): Int

public actual fun getTraceEnableFlags(tracehandle: ULong): UInt =
    wasiWindowssysWindowsWin32SystemDiagnosticsEtwGetTraceEnableFlags(tracehandle.toLong()).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemDiagnosticsEtwGetTraceEnableLevel")
private external fun wasiWindowssysWindowsWin32SystemDiagnosticsEtwGetTraceEnableLevel(tracehandle: Long): Int

public actual fun getTraceEnableLevel(tracehandle: ULong): UByte =
    wasiWindowssysWindowsWin32SystemDiagnosticsEtwGetTraceEnableLevel(tracehandle.toLong()).toUByte()

public actual fun getTraceLoggerHandle(buffer: ConstPtr<CVoid>): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwGetTraceLoggerHandle")

public actual fun openTraceA(logfile: MutPtr<EventTraceLogfilea>): ProcesstraceHandle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwOpenTraceA")

public actual fun openTraceFromBufferStream(options: ConstPtr<EtwOpenTraceOptions>, buffercompletioncallback: PetwBufferCompletionCallback, buffercompletioncontext: ConstPtr<CVoid>): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwOpenTraceFromBufferStream")

public actual fun openTraceFromFile(logfilename: Pcwstr, options: ConstPtr<EtwOpenTraceOptions>, logfileheader: MutPtr<TraceLogfileHeader>): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwOpenTraceFromFile")

public actual fun openTraceFromRealTimeLogger(loggername: Pcwstr, options: ConstPtr<EtwOpenTraceOptions>, logfileheader: MutPtr<TraceLogfileHeader>): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwOpenTraceFromRealTimeLogger")

public actual fun openTraceFromRealTimeLoggerWithAllocationOptions(loggername: Pcwstr, options: ConstPtr<EtwOpenTraceOptions>, allocationsize: ULong, memorypartitionhandle: Handle, logfileheader: MutPtr<TraceLogfileHeader>): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwOpenTraceFromRealTimeLoggerWithAllocationOptions")

public actual fun openTraceW(logfile: MutPtr<EventTraceLogfilew>): ProcesstraceHandle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwOpenTraceW")

public actual fun processTrace(handlearray: ConstPtr<ProcesstraceHandle>, handlecount: UInt, starttime: ConstPtr<Filetime>, endtime: ConstPtr<Filetime>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwProcessTrace")

public actual fun processTraceAddBufferToBufferStream(tracehandle: ULong, buffer: ConstPtr<EtwBufferHeader>, buffersize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwProcessTraceAddBufferToBufferStream")

public actual fun processTraceBufferDecrementReference(buffer: ConstPtr<EtwBufferHeader>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwProcessTraceBufferDecrementReference")

public actual fun processTraceBufferIncrementReference(tracehandle: ULong, buffer: ConstPtr<EtwBufferHeader>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwProcessTraceBufferIncrementReference")

public actual fun queryAllTracesA(propertyarray: MutPtr<MutPtr<EventTraceProperties>>, propertyarraycount: UInt, loggercount: MutPtr<UInt>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwQueryAllTracesA")

public actual fun queryAllTracesW(propertyarray: MutPtr<MutPtr<EventTraceProperties>>, propertyarraycount: UInt, loggercount: MutPtr<UInt>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwQueryAllTracesW")

public actual fun queryTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: MutPtr<EventTraceProperties>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwQueryTraceA")

public actual fun queryTraceProcessingHandle(processinghandle: ProcesstraceHandle, informationclass: EtwProcessHandleInfoType, inbuffer: ConstPtr<CVoid>, inbuffersize: UInt, outbuffer: MutPtr<CVoid>, outbuffersize: UInt, returnlength: MutPtr<UInt>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwQueryTraceProcessingHandle")

public actual fun queryTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: MutPtr<EventTraceProperties>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwQueryTraceW")

public actual fun registerTraceGuidsA(requestaddress: Wmidprequest, requestcontext: ConstPtr<CVoid>, controlguid: ConstPtr<Guid>, guidcount: UInt, traceguidreg: ConstPtr<TraceGuidRegistration>, mofimagepath: Pcstr, mofresourcename: Pcstr, registrationhandle: MutPtr<ULong>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwRegisterTraceGuidsA")

public actual fun registerTraceGuidsW(requestaddress: Wmidprequest, requestcontext: ConstPtr<CVoid>, controlguid: ConstPtr<Guid>, guidcount: UInt, traceguidreg: ConstPtr<TraceGuidRegistration>, mofimagepath: Pcwstr, mofresourcename: Pcwstr, registrationhandle: MutPtr<ULong>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwRegisterTraceGuidsW")

public actual fun removeTraceCallback(pguid: ConstPtr<Guid>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwRemoveTraceCallback")

public actual fun setTraceCallback(pguid: ConstPtr<Guid>, eventcallback: PeventCallback): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwSetTraceCallback")

public actual fun startTraceA(tracehandle: MutPtr<ControltraceHandle>, instancename: Pcstr, properties: MutPtr<EventTraceProperties>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwStartTraceA")

public actual fun startTraceW(tracehandle: MutPtr<ControltraceHandle>, instancename: Pcwstr, properties: MutPtr<EventTraceProperties>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwStartTraceW")

public actual fun stopTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: MutPtr<EventTraceProperties>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwStopTraceA")

public actual fun stopTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: MutPtr<EventTraceProperties>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwStopTraceW")

public actual fun tdhAggregatePayloadFilters(payloadfiltercount: UInt, payloadfilterptrs: ConstPtr<ConstPtr<CVoid>>, eventmatchallflags: ConstPtr<Boolean>, eventfilterdescriptor: MutPtr<EventFilterDescriptor>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwTdhAggregatePayloadFilters")

public actual fun tdhCleanupPayloadEventFilterDescriptor(eventfilterdescriptor: MutPtr<EventFilterDescriptor>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwTdhCleanupPayloadEventFilterDescriptor")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemDiagnosticsEtwTdhCloseDecodingHandle")
private external fun wasiWindowssysWindowsWin32SystemDiagnosticsEtwTdhCloseDecodingHandle(handle: Long): Int

public actual fun tdhCloseDecodingHandle(handle: TdhHandle): UInt =
    wasiWindowssysWindowsWin32SystemDiagnosticsEtwTdhCloseDecodingHandle(handle).toUInt()

public actual fun tdhCreatePayloadFilter(providerguid: ConstPtr<Guid>, eventdescriptor: ConstPtr<EventDescriptor>, eventmatchany: Boolean, payloadpredicatecount: UInt, payloadpredicates: ConstPtr<PayloadFilterPredicate>, payloadfilter: MutPtr<MutPtr<CVoid>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwTdhCreatePayloadFilter")

public actual fun tdhDeletePayloadFilter(payloadfilter: MutPtr<MutPtr<CVoid>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwTdhDeletePayloadFilter")

public actual fun tdhEnumerateManifestProviderEvents(providerguid: ConstPtr<Guid>, buffer: MutPtr<ProviderEventInfo>, buffersize: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwTdhEnumerateManifestProviderEvents")

public actual fun tdhEnumerateProviderFieldInformation(pguid: ConstPtr<Guid>, eventfieldtype: EventFieldType, pbuffer: MutPtr<ProviderFieldInfoarray>, pbuffersize: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwTdhEnumerateProviderFieldInformation")

public actual fun tdhEnumerateProviderFilters(guid: ConstPtr<Guid>, tdhcontextcount: UInt, tdhcontext: ConstPtr<TdhContext>, filtercount: MutPtr<UInt>, buffer: MutPtr<MutPtr<ProviderFilterInfo>>, buffersize: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwTdhEnumerateProviderFilters")

public actual fun tdhEnumerateProviders(pbuffer: MutPtr<ProviderEnumerationInfo>, pbuffersize: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwTdhEnumerateProviders")

public actual fun tdhEnumerateProvidersForDecodingSource(filter: DecodingSource, buffer: MutPtr<ProviderEnumerationInfo>, buffersize: UInt, bufferrequired: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwTdhEnumerateProvidersForDecodingSource")

public actual fun tdhFormatProperty(eventinfo: ConstPtr<TraceEventInfo>, mapinfo: ConstPtr<EventMapInfo>, pointersize: UInt, propertyintype: UShort, propertyouttype: UShort, propertylength: UShort, userdatalength: UShort, userdata: ConstPtr<UByte>, buffersize: MutPtr<UInt>, buffer: Pwstr, userdataconsumed: MutPtr<UShort>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwTdhFormatProperty")

public actual fun tdhGetDecodingParameter(handle: TdhHandle, tdhcontext: MutPtr<TdhContext>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwTdhGetDecodingParameter")

public actual fun tdhGetEventInformation(event: ConstPtr<EventRecord>, tdhcontextcount: UInt, tdhcontext: ConstPtr<TdhContext>, buffer: MutPtr<TraceEventInfo>, buffersize: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwTdhGetEventInformation")

public actual fun tdhGetEventMapInformation(pevent: ConstPtr<EventRecord>, pmapname: Pcwstr, pbuffer: MutPtr<EventMapInfo>, pbuffersize: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwTdhGetEventMapInformation")

public actual fun tdhGetManifestEventInformation(providerguid: ConstPtr<Guid>, eventdescriptor: ConstPtr<EventDescriptor>, buffer: MutPtr<TraceEventInfo>, buffersize: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwTdhGetManifestEventInformation")

public actual fun tdhGetProperty(pevent: ConstPtr<EventRecord>, tdhcontextcount: UInt, ptdhcontext: ConstPtr<TdhContext>, propertydatacount: UInt, ppropertydata: ConstPtr<PropertyDataDescriptor>, buffersize: UInt, pbuffer: MutPtr<UByte>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwTdhGetProperty")

public actual fun tdhGetPropertySize(pevent: ConstPtr<EventRecord>, tdhcontextcount: UInt, ptdhcontext: ConstPtr<TdhContext>, propertydatacount: UInt, ppropertydata: ConstPtr<PropertyDataDescriptor>, ppropertysize: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwTdhGetPropertySize")

public actual fun tdhGetWppMessage(handle: TdhHandle, eventrecord: ConstPtr<EventRecord>, buffersize: MutPtr<UInt>, buffer: MutPtr<UByte>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwTdhGetWppMessage")

public actual fun tdhGetWppProperty(handle: TdhHandle, eventrecord: ConstPtr<EventRecord>, propertyname: Pcwstr, buffersize: MutPtr<UInt>, buffer: MutPtr<UByte>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwTdhGetWppProperty")

public actual fun tdhLoadManifest(manifest: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwTdhLoadManifest")

public actual fun tdhLoadManifestFromBinary(binarypath: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwTdhLoadManifestFromBinary")

public actual fun tdhLoadManifestFromMemory(pdata: ConstPtr<CVoid>, cbdata: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwTdhLoadManifestFromMemory")

public actual fun tdhOpenDecodingHandle(handle: MutPtr<TdhHandle>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwTdhOpenDecodingHandle")

public actual fun tdhQueryProviderFieldInformation(pguid: ConstPtr<Guid>, eventfieldvalue: ULong, eventfieldtype: EventFieldType, pbuffer: MutPtr<ProviderFieldInfoarray>, pbuffersize: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwTdhQueryProviderFieldInformation")

public actual fun tdhSetDecodingParameter(handle: TdhHandle, tdhcontext: ConstPtr<TdhContext>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwTdhSetDecodingParameter")

public actual fun tdhUnloadManifest(manifest: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwTdhUnloadManifest")

public actual fun tdhUnloadManifestFromMemory(pdata: ConstPtr<CVoid>, cbdata: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwTdhUnloadManifestFromMemory")

public actual fun traceEvent(tracehandle: ULong, eventtrace: ConstPtr<EventTraceHeader>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwTraceEvent")

public actual fun traceEventInstance(tracehandle: ULong, eventtrace: ConstPtr<EventInstanceHeader>, instinfo: ConstPtr<EventInstanceInfo>, parentinstinfo: ConstPtr<EventInstanceInfo>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwTraceEventInstance")

public actual fun traceMessage(loggerhandle: ULong, messageflags: TraceMessageFlags, messageguid: ConstPtr<Guid>, messagenumber: UShort, vararg variadicArgs: Long): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwTraceMessage")

public actual fun traceMessageVa(loggerhandle: ULong, messageflags: TraceMessageFlags, messageguid: ConstPtr<Guid>, messagenumber: UShort, messagearglist: ConstPtr<Byte>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwTraceMessageVa")

public actual fun traceQueryInformation(sessionhandle: ControltraceHandle, informationclass: TraceQueryInfoClass, traceinformation: MutPtr<CVoid>, informationlength: UInt, returnlength: MutPtr<UInt>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwTraceQueryInformation")

public actual fun traceSetInformation(sessionhandle: ControltraceHandle, informationclass: TraceQueryInfoClass, traceinformation: ConstPtr<CVoid>, informationlength: UInt): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwTraceSetInformation")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemDiagnosticsEtwUnregisterTraceGuids")
private external fun wasiWindowssysWindowsWin32SystemDiagnosticsEtwUnregisterTraceGuids(registrationhandle: Long): Int

public actual fun unregisterTraceGuids(registrationhandle: ULong): UInt =
    wasiWindowssysWindowsWin32SystemDiagnosticsEtwUnregisterTraceGuids(registrationhandle.toLong()).toUInt()

public actual fun updateTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: MutPtr<EventTraceProperties>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwUpdateTraceA")

public actual fun updateTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: MutPtr<EventTraceProperties>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwUpdateTraceW")
