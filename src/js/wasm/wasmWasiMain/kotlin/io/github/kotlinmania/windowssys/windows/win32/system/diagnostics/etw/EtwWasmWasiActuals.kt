@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

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

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun closeTrace(tracehandle: ProcesstraceHandle): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwCloseTrace")

public actual fun controlTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: MutPtr, controlcode: EventTraceControl): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwControlTraceA")

public actual fun controlTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: MutPtr, controlcode: EventTraceControl): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwControlTraceW")

public actual fun createTraceInstanceId(reghandle: Handle, instinfo: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwCreateTraceInstanceId")

public actual fun cveEventWrite(cveid: Pcwstr, additionaldetails: Pcwstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwCveEventWrite")

public actual fun enableTrace(enable: UInt, enableflag: UInt, enablelevel: UInt, controlguid: ConstPtr, tracehandle: ControltraceHandle): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwEnableTrace")

public actual fun enableTraceEx(providerid: ConstPtr, sourceid: ConstPtr, tracehandle: ControltraceHandle, isenabled: UInt, level: UByte, matchanykeyword: ULong, matchallkeyword: ULong, enableproperty: UInt, enablefilterdesc: ConstPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwEnableTraceEx")

public actual fun enableTraceEx2(tracehandle: ControltraceHandle, providerid: ConstPtr, controlcode: UInt, level: UByte, matchanykeyword: ULong, matchallkeyword: ULong, timeout: UInt, enableparameters: ConstPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwEnableTraceEx2")

public actual fun enumerateTraceGuids(guidpropertiesarray: MutPtr, propertyarraycount: UInt, guidcount: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwEnumerateTraceGuids")

public actual fun enumerateTraceGuidsEx(tracequeryinfoclass: TraceQueryInfoClass, inbuffer: ConstPtr, inbuffersize: UInt, outbuffer: MutPtr, outbuffersize: UInt, returnlength: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwEnumerateTraceGuidsEx")

public actual fun eventAccessControl(guid: ConstPtr, operation: UInt, sid: Psid, rights: UInt, allowordeny: Boolean): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwEventAccessControl")

public actual fun eventAccessQuery(guid: ConstPtr, buffer: PsecurityDescriptor, buffersize: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwEventAccessQuery")

public actual fun eventAccessRemove(guid: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwEventAccessRemove")

public actual fun eventActivityIdControl(controlcode: UInt, activityid: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwEventActivityIdControl")

public actual fun eventEnabled(reghandle: Reghandle, eventdescriptor: ConstPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwEventEnabled")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemDiagnosticsEtwEventProviderEnabled")
private external fun wasiWindowssysWindowsWin32SystemDiagnosticsEtwEventProviderEnabled(reghandle: Long, level: Int, keyword: Long): Int

public actual fun eventProviderEnabled(reghandle: Reghandle, level: UByte, keyword: ULong): Boolean =
    (wasiWindowssysWindowsWin32SystemDiagnosticsEtwEventProviderEnabled(reghandle, level.toInt(), keyword.toLong()) != 0)

public actual fun eventRegister(providerid: ConstPtr, enablecallback: Penablecallback, callbackcontext: ConstPtr, reghandle: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwEventRegister")

public actual fun eventSetInformation(reghandle: Reghandle, informationclass: EventInfoClass, eventinformation: ConstPtr, informationlength: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwEventSetInformation")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemDiagnosticsEtwEventUnregister")
private external fun wasiWindowssysWindowsWin32SystemDiagnosticsEtwEventUnregister(reghandle: Long): Int

public actual fun eventUnregister(reghandle: Reghandle): UInt =
    wasiWindowssysWindowsWin32SystemDiagnosticsEtwEventUnregister(reghandle).toUInt()

public actual fun eventWrite(reghandle: Reghandle, eventdescriptor: ConstPtr, userdatacount: UInt, userdata: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwEventWrite")

public actual fun eventWriteEx(reghandle: Reghandle, eventdescriptor: ConstPtr, filter: ULong, flags: UInt, activityid: ConstPtr, relatedactivityid: ConstPtr, userdatacount: UInt, userdata: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwEventWriteEx")

public actual fun eventWriteString(reghandle: Reghandle, level: UByte, keyword: ULong, string: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwEventWriteString")

public actual fun eventWriteTransfer(reghandle: Reghandle, eventdescriptor: ConstPtr, activityid: ConstPtr, relatedactivityid: ConstPtr, userdatacount: UInt, userdata: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwEventWriteTransfer")

public actual fun flushTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwFlushTraceA")

public actual fun flushTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwFlushTraceW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemDiagnosticsEtwGetTraceEnableFlags")
private external fun wasiWindowssysWindowsWin32SystemDiagnosticsEtwGetTraceEnableFlags(tracehandle: Long): Int

public actual fun getTraceEnableFlags(tracehandle: ULong): UInt =
    wasiWindowssysWindowsWin32SystemDiagnosticsEtwGetTraceEnableFlags(tracehandle.toLong()).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemDiagnosticsEtwGetTraceEnableLevel")
private external fun wasiWindowssysWindowsWin32SystemDiagnosticsEtwGetTraceEnableLevel(tracehandle: Long): Int

public actual fun getTraceEnableLevel(tracehandle: ULong): UByte =
    wasiWindowssysWindowsWin32SystemDiagnosticsEtwGetTraceEnableLevel(tracehandle.toLong()).toUByte()

public actual fun getTraceLoggerHandle(buffer: ConstPtr): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwGetTraceLoggerHandle")

public actual fun openTraceA(logfile: MutPtr): ProcesstraceHandle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwOpenTraceA")

public actual fun openTraceFromBufferStream(options: ConstPtr, buffercompletioncallback: PetwBufferCompletionCallback, buffercompletioncontext: ConstPtr): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwOpenTraceFromBufferStream")

public actual fun openTraceFromFile(logfilename: Pcwstr, options: ConstPtr, logfileheader: MutPtr): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwOpenTraceFromFile")

public actual fun openTraceFromRealTimeLogger(loggername: Pcwstr, options: ConstPtr, logfileheader: MutPtr): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwOpenTraceFromRealTimeLogger")

public actual fun openTraceFromRealTimeLoggerWithAllocationOptions(loggername: Pcwstr, options: ConstPtr, allocationsize: ULong, memorypartitionhandle: Handle, logfileheader: MutPtr): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwOpenTraceFromRealTimeLoggerWithAllocationOptions")

public actual fun openTraceW(logfile: MutPtr): ProcesstraceHandle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwOpenTraceW")

public actual fun processTrace(handlearray: ConstPtr, handlecount: UInt, starttime: ConstPtr, endtime: ConstPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwProcessTrace")

public actual fun processTraceAddBufferToBufferStream(tracehandle: ULong, buffer: ConstPtr, buffersize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwProcessTraceAddBufferToBufferStream")

public actual fun processTraceBufferDecrementReference(buffer: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwProcessTraceBufferDecrementReference")

public actual fun processTraceBufferIncrementReference(tracehandle: ULong, buffer: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwProcessTraceBufferIncrementReference")

public actual fun queryAllTracesA(propertyarray: MutPtr, propertyarraycount: UInt, loggercount: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwQueryAllTracesA")

public actual fun queryAllTracesW(propertyarray: MutPtr, propertyarraycount: UInt, loggercount: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwQueryAllTracesW")

public actual fun queryTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwQueryTraceA")

public actual fun queryTraceProcessingHandle(processinghandle: ProcesstraceHandle, informationclass: EtwProcessHandleInfoType, inbuffer: ConstPtr, inbuffersize: UInt, outbuffer: MutPtr, outbuffersize: UInt, returnlength: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwQueryTraceProcessingHandle")

public actual fun queryTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwQueryTraceW")

public actual fun registerTraceGuidsA(requestaddress: Wmidprequest, requestcontext: ConstPtr, controlguid: ConstPtr, guidcount: UInt, traceguidreg: ConstPtr, mofimagepath: Pcstr, mofresourcename: Pcstr, registrationhandle: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwRegisterTraceGuidsA")

public actual fun registerTraceGuidsW(requestaddress: Wmidprequest, requestcontext: ConstPtr, controlguid: ConstPtr, guidcount: UInt, traceguidreg: ConstPtr, mofimagepath: Pcwstr, mofresourcename: Pcwstr, registrationhandle: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwRegisterTraceGuidsW")

public actual fun removeTraceCallback(pguid: ConstPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwRemoveTraceCallback")

public actual fun setTraceCallback(pguid: ConstPtr, eventcallback: PeventCallback): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwSetTraceCallback")

public actual fun startTraceA(tracehandle: MutPtr, instancename: Pcstr, properties: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwStartTraceA")

public actual fun startTraceW(tracehandle: MutPtr, instancename: Pcwstr, properties: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwStartTraceW")

public actual fun stopTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwStopTraceA")

public actual fun stopTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwStopTraceW")

public actual fun tdhAggregatePayloadFilters(payloadfiltercount: UInt, payloadfilterptrs: ConstPtr, eventmatchallflags: ConstPtr, eventfilterdescriptor: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwTdhAggregatePayloadFilters")

public actual fun tdhCleanupPayloadEventFilterDescriptor(eventfilterdescriptor: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwTdhCleanupPayloadEventFilterDescriptor")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemDiagnosticsEtwTdhCloseDecodingHandle")
private external fun wasiWindowssysWindowsWin32SystemDiagnosticsEtwTdhCloseDecodingHandle(handle: Long): Int

public actual fun tdhCloseDecodingHandle(handle: TdhHandle): UInt =
    wasiWindowssysWindowsWin32SystemDiagnosticsEtwTdhCloseDecodingHandle(handle).toUInt()

public actual fun tdhCreatePayloadFilter(providerguid: ConstPtr, eventdescriptor: ConstPtr, eventmatchany: Boolean, payloadpredicatecount: UInt, payloadpredicates: ConstPtr, payloadfilter: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwTdhCreatePayloadFilter")

public actual fun tdhDeletePayloadFilter(payloadfilter: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwTdhDeletePayloadFilter")

public actual fun tdhEnumerateManifestProviderEvents(providerguid: ConstPtr, buffer: MutPtr, buffersize: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwTdhEnumerateManifestProviderEvents")

public actual fun tdhEnumerateProviderFieldInformation(pguid: ConstPtr, eventfieldtype: EventFieldType, pbuffer: MutPtr, pbuffersize: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwTdhEnumerateProviderFieldInformation")

public actual fun tdhEnumerateProviderFilters(guid: ConstPtr, tdhcontextcount: UInt, tdhcontext: ConstPtr, filtercount: MutPtr, buffer: MutPtr, buffersize: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwTdhEnumerateProviderFilters")

public actual fun tdhEnumerateProviders(pbuffer: MutPtr, pbuffersize: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwTdhEnumerateProviders")

public actual fun tdhEnumerateProvidersForDecodingSource(filter: DecodingSource, buffer: MutPtr, buffersize: UInt, bufferrequired: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwTdhEnumerateProvidersForDecodingSource")

public actual fun tdhFormatProperty(eventinfo: ConstPtr, mapinfo: ConstPtr, pointersize: UInt, propertyintype: UShort, propertyouttype: UShort, propertylength: UShort, userdatalength: UShort, userdata: ConstPtr, buffersize: MutPtr, buffer: Pwstr, userdataconsumed: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwTdhFormatProperty")

public actual fun tdhGetDecodingParameter(handle: TdhHandle, tdhcontext: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwTdhGetDecodingParameter")

public actual fun tdhGetEventInformation(event: ConstPtr, tdhcontextcount: UInt, tdhcontext: ConstPtr, buffer: MutPtr, buffersize: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwTdhGetEventInformation")

public actual fun tdhGetEventMapInformation(pevent: ConstPtr, pmapname: Pcwstr, pbuffer: MutPtr, pbuffersize: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwTdhGetEventMapInformation")

public actual fun tdhGetManifestEventInformation(providerguid: ConstPtr, eventdescriptor: ConstPtr, buffer: MutPtr, buffersize: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwTdhGetManifestEventInformation")

public actual fun tdhGetProperty(pevent: ConstPtr, tdhcontextcount: UInt, ptdhcontext: ConstPtr, propertydatacount: UInt, ppropertydata: ConstPtr, buffersize: UInt, pbuffer: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwTdhGetProperty")

public actual fun tdhGetPropertySize(pevent: ConstPtr, tdhcontextcount: UInt, ptdhcontext: ConstPtr, propertydatacount: UInt, ppropertydata: ConstPtr, ppropertysize: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwTdhGetPropertySize")

public actual fun tdhGetWppMessage(handle: TdhHandle, eventrecord: ConstPtr, buffersize: MutPtr, buffer: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwTdhGetWppMessage")

public actual fun tdhGetWppProperty(handle: TdhHandle, eventrecord: ConstPtr, propertyname: Pcwstr, buffersize: MutPtr, buffer: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwTdhGetWppProperty")

public actual fun tdhLoadManifest(manifest: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwTdhLoadManifest")

public actual fun tdhLoadManifestFromBinary(binarypath: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwTdhLoadManifestFromBinary")

public actual fun tdhLoadManifestFromMemory(pdata: ConstPtr, cbdata: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwTdhLoadManifestFromMemory")

public actual fun tdhOpenDecodingHandle(handle: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwTdhOpenDecodingHandle")

public actual fun tdhQueryProviderFieldInformation(pguid: ConstPtr, eventfieldvalue: ULong, eventfieldtype: EventFieldType, pbuffer: MutPtr, pbuffersize: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwTdhQueryProviderFieldInformation")

public actual fun tdhSetDecodingParameter(handle: TdhHandle, tdhcontext: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwTdhSetDecodingParameter")

public actual fun tdhUnloadManifest(manifest: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwTdhUnloadManifest")

public actual fun tdhUnloadManifestFromMemory(pdata: ConstPtr, cbdata: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwTdhUnloadManifestFromMemory")

public actual fun traceEvent(tracehandle: ULong, eventtrace: ConstPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwTraceEvent")

public actual fun traceEventInstance(tracehandle: ULong, eventtrace: ConstPtr, instinfo: ConstPtr, parentinstinfo: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwTraceEventInstance")

public actual fun traceMessage(loggerhandle: ULong, messageflags: TraceMessageFlags, messageguid: ConstPtr, messagenumber: UShort, vararg variadicArgs: Long): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwTraceMessage")

public actual fun traceMessageVa(loggerhandle: ULong, messageflags: TraceMessageFlags, messageguid: ConstPtr, messagenumber: UShort, messagearglist: ConstPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwTraceMessageVa")

public actual fun traceQueryInformation(sessionhandle: ControltraceHandle, informationclass: TraceQueryInfoClass, traceinformation: MutPtr, informationlength: UInt, returnlength: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwTraceQueryInformation")

public actual fun traceSetInformation(sessionhandle: ControltraceHandle, informationclass: TraceQueryInfoClass, traceinformation: ConstPtr, informationlength: UInt): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwTraceSetInformation")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemDiagnosticsEtwUnregisterTraceGuids")
private external fun wasiWindowssysWindowsWin32SystemDiagnosticsEtwUnregisterTraceGuids(registrationhandle: Long): Int

public actual fun unregisterTraceGuids(registrationhandle: ULong): UInt =
    wasiWindowssysWindowsWin32SystemDiagnosticsEtwUnregisterTraceGuids(registrationhandle.toLong()).toUInt()

public actual fun updateTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwUpdateTraceA")

public actual fun updateTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsEtwUpdateTraceW")
