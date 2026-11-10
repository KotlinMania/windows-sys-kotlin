@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.security.Psid

public actual fun closeTrace(tracehandle: ProcesstraceHandle): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun controlTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: COpaquePointer?, controlcode: EventTraceControl): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun controlTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: COpaquePointer?, controlcode: EventTraceControl): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createTraceInstanceId(reghandle: Handle, instinfo: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cveEventWrite(cveid: Pcwstr, additionaldetails: Pcwstr): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun enableTrace(enable: UInt, enableflag: UInt, enablelevel: UInt, controlguid: COpaquePointer?, tracehandle: ControltraceHandle): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun enableTraceEx(providerid: COpaquePointer?, sourceid: COpaquePointer?, tracehandle: ControltraceHandle, isenabled: UInt, level: UByte, matchanykeyword: ULong, matchallkeyword: ULong, enableproperty: UInt, enablefilterdesc: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun enableTraceEx2(tracehandle: ControltraceHandle, providerid: COpaquePointer?, controlcode: UInt, level: UByte, matchanykeyword: ULong, matchallkeyword: ULong, timeout: UInt, enableparameters: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun enumerateTraceGuids(guidpropertiesarray: COpaquePointer?, propertyarraycount: UInt, guidcount: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun enumerateTraceGuidsEx(tracequeryinfoclass: TraceQueryInfoClass, inbuffer: COpaquePointer?, inbuffersize: UInt, outbuffer: COpaquePointer?, outbuffersize: UInt, returnlength: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun eventAccessControl(guid: COpaquePointer?, operation: UInt, sid: Psid, rights: UInt, allowordeny: Boolean): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun eventAccessQuery(guid: COpaquePointer?, buffer: PsecurityDescriptor, buffersize: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun eventAccessRemove(guid: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun eventActivityIdControl(controlcode: UInt, activityid: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun eventEnabled(reghandle: Reghandle, eventdescriptor: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun eventProviderEnabled(reghandle: Reghandle, level: UByte, keyword: ULong): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun eventRegister(providerid: COpaquePointer?, enablecallback: Penablecallback, callbackcontext: COpaquePointer?, reghandle: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun eventSetInformation(reghandle: Reghandle, informationclass: EventInfoClass, eventinformation: COpaquePointer?, informationlength: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun eventUnregister(reghandle: Reghandle): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun eventWrite(reghandle: Reghandle, eventdescriptor: COpaquePointer?, userdatacount: UInt, userdata: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun eventWriteEx(reghandle: Reghandle, eventdescriptor: COpaquePointer?, filter: ULong, flags: UInt, activityid: COpaquePointer?, relatedactivityid: COpaquePointer?, userdatacount: UInt, userdata: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun eventWriteString(reghandle: Reghandle, level: UByte, keyword: ULong, string: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun eventWriteTransfer(reghandle: Reghandle, eventdescriptor: COpaquePointer?, activityid: COpaquePointer?, relatedactivityid: COpaquePointer?, userdatacount: UInt, userdata: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun flushTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun flushTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getTraceEnableFlags(tracehandle: ULong): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getTraceEnableLevel(tracehandle: ULong): UByte =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getTraceLoggerHandle(buffer: COpaquePointer?): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun openTraceA(logfile: COpaquePointer?): ProcesstraceHandle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun openTraceFromBufferStream(options: COpaquePointer?, buffercompletioncallback: PetwBufferCompletionCallback, buffercompletioncontext: COpaquePointer?): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun openTraceFromFile(logfilename: Pcwstr, options: COpaquePointer?, logfileheader: COpaquePointer?): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun openTraceFromRealTimeLogger(loggername: Pcwstr, options: COpaquePointer?, logfileheader: COpaquePointer?): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun openTraceFromRealTimeLoggerWithAllocationOptions(loggername: Pcwstr, options: COpaquePointer?, allocationsize: ULong, memorypartitionhandle: Handle, logfileheader: COpaquePointer?): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun openTraceW(logfile: COpaquePointer?): ProcesstraceHandle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun processTrace(handlearray: COpaquePointer?, handlecount: UInt, starttime: COpaquePointer?, endtime: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun processTraceAddBufferToBufferStream(tracehandle: ULong, buffer: COpaquePointer?, buffersize: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun processTraceBufferDecrementReference(buffer: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun processTraceBufferIncrementReference(tracehandle: ULong, buffer: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun queryAllTracesA(propertyarray: COpaquePointer?, propertyarraycount: UInt, loggercount: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun queryAllTracesW(propertyarray: COpaquePointer?, propertyarraycount: UInt, loggercount: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun queryTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun queryTraceProcessingHandle(processinghandle: ProcesstraceHandle, informationclass: EtwProcessHandleInfoType, inbuffer: COpaquePointer?, inbuffersize: UInt, outbuffer: COpaquePointer?, outbuffersize: UInt, returnlength: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun queryTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun registerTraceGuidsA(requestaddress: Wmidprequest, requestcontext: COpaquePointer?, controlguid: COpaquePointer?, guidcount: UInt, traceguidreg: COpaquePointer?, mofimagepath: Pcstr, mofresourcename: Pcstr, registrationhandle: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun registerTraceGuidsW(requestaddress: Wmidprequest, requestcontext: COpaquePointer?, controlguid: COpaquePointer?, guidcount: UInt, traceguidreg: COpaquePointer?, mofimagepath: Pcwstr, mofresourcename: Pcwstr, registrationhandle: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun removeTraceCallback(pguid: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setTraceCallback(pguid: COpaquePointer?, eventcallback: PeventCallback): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun startTraceA(tracehandle: COpaquePointer?, instancename: Pcstr, properties: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun startTraceW(tracehandle: COpaquePointer?, instancename: Pcwstr, properties: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun stopTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun stopTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tdhAggregatePayloadFilters(payloadfiltercount: UInt, payloadfilterptrs: COpaquePointer?, eventmatchallflags: COpaquePointer?, eventfilterdescriptor: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tdhCleanupPayloadEventFilterDescriptor(eventfilterdescriptor: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tdhCloseDecodingHandle(handle: TdhHandle): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tdhCreatePayloadFilter(providerguid: COpaquePointer?, eventdescriptor: COpaquePointer?, eventmatchany: Boolean, payloadpredicatecount: UInt, payloadpredicates: COpaquePointer?, payloadfilter: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tdhDeletePayloadFilter(payloadfilter: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tdhEnumerateManifestProviderEvents(providerguid: COpaquePointer?, buffer: COpaquePointer?, buffersize: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tdhEnumerateProviderFieldInformation(pguid: COpaquePointer?, eventfieldtype: EventFieldType, pbuffer: COpaquePointer?, pbuffersize: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tdhEnumerateProviderFilters(guid: COpaquePointer?, tdhcontextcount: UInt, tdhcontext: COpaquePointer?, filtercount: COpaquePointer?, buffer: COpaquePointer?, buffersize: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tdhEnumerateProviders(pbuffer: COpaquePointer?, pbuffersize: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tdhEnumerateProvidersForDecodingSource(filter: DecodingSource, buffer: COpaquePointer?, buffersize: UInt, bufferrequired: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tdhFormatProperty(eventinfo: COpaquePointer?, mapinfo: COpaquePointer?, pointersize: UInt, propertyintype: UShort, propertyouttype: UShort, propertylength: UShort, userdatalength: UShort, userdata: COpaquePointer?, buffersize: COpaquePointer?, buffer: Pwstr, userdataconsumed: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tdhGetDecodingParameter(handle: TdhHandle, tdhcontext: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tdhGetEventInformation(event: COpaquePointer?, tdhcontextcount: UInt, tdhcontext: COpaquePointer?, buffer: COpaquePointer?, buffersize: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tdhGetEventMapInformation(pevent: COpaquePointer?, pmapname: Pcwstr, pbuffer: COpaquePointer?, pbuffersize: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tdhGetManifestEventInformation(providerguid: COpaquePointer?, eventdescriptor: COpaquePointer?, buffer: COpaquePointer?, buffersize: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tdhGetProperty(pevent: COpaquePointer?, tdhcontextcount: UInt, ptdhcontext: COpaquePointer?, propertydatacount: UInt, ppropertydata: COpaquePointer?, buffersize: UInt, pbuffer: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tdhGetPropertySize(pevent: COpaquePointer?, tdhcontextcount: UInt, ptdhcontext: COpaquePointer?, propertydatacount: UInt, ppropertydata: COpaquePointer?, ppropertysize: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tdhGetWppMessage(handle: TdhHandle, eventrecord: COpaquePointer?, buffersize: COpaquePointer?, buffer: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tdhGetWppProperty(handle: TdhHandle, eventrecord: COpaquePointer?, propertyname: Pcwstr, buffersize: COpaquePointer?, buffer: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tdhLoadManifest(manifest: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tdhLoadManifestFromBinary(binarypath: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tdhLoadManifestFromMemory(pdata: COpaquePointer?, cbdata: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tdhOpenDecodingHandle(handle: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tdhQueryProviderFieldInformation(pguid: COpaquePointer?, eventfieldvalue: ULong, eventfieldtype: EventFieldType, pbuffer: COpaquePointer?, pbuffersize: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tdhSetDecodingParameter(handle: TdhHandle, tdhcontext: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tdhUnloadManifest(manifest: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tdhUnloadManifestFromMemory(pdata: COpaquePointer?, cbdata: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun traceEvent(tracehandle: ULong, eventtrace: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun traceEventInstance(tracehandle: ULong, eventtrace: COpaquePointer?, instinfo: COpaquePointer?, parentinstinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun traceMessage(loggerhandle: ULong, messageflags: TraceMessageFlags, messageguid: COpaquePointer?, messagenumber: UShort, vararg variadicArgs: Long): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun traceMessageVa(loggerhandle: ULong, messageflags: TraceMessageFlags, messageguid: COpaquePointer?, messagenumber: UShort, messagearglist: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun traceQueryInformation(sessionhandle: ControltraceHandle, informationclass: TraceQueryInfoClass, traceinformation: COpaquePointer?, informationlength: UInt, returnlength: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun traceSetInformation(sessionhandle: ControltraceHandle, informationclass: TraceQueryInfoClass, traceinformation: COpaquePointer?, informationlength: UInt): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun unregisterTraceGuids(registrationhandle: ULong): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun updateTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun updateTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
