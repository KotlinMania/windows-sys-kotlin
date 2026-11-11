@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.security.Psid
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_createTraceInstanceId
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_cveEventWrite
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_enumerateTraceGuids
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_enumerateTraceGuidsEx
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_eventAccessControl
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_eventAccessQuery
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_eventAccessRemove
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_eventActivityIdControl
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_eventEnabled
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_eventProviderEnabled
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_eventRegister
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_eventSetInformation
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_eventUnregister
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_eventWrite
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_eventWriteEx
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_eventWriteString
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_eventWriteTransfer
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_getTraceEnableFlags
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_getTraceEnableLevel
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_getTraceLoggerHandle
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_openTraceFromBufferStream
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_openTraceFromFile
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_openTraceFromRealTimeLogger
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_openTraceFromRealTimeLoggerWithAllocationOptions
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_processTrace
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_processTraceAddBufferToBufferStream
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_processTraceBufferDecrementReference
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_processTraceBufferIncrementReference
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_queryAllTracesA
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_queryAllTracesW
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_registerTraceGuidsA
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_registerTraceGuidsW
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_removeTraceCallback
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_setTraceCallback
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_startTraceA
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_startTraceW
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_tdhAggregatePayloadFilters
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_tdhCleanupPayloadEventFilterDescriptor
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_tdhCloseDecodingHandle
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_tdhCreatePayloadFilter
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_tdhDeletePayloadFilter
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_tdhEnumerateManifestProviderEvents
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_tdhEnumerateProviderFieldInformation
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_tdhEnumerateProviderFilters
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_tdhEnumerateProviders
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_tdhEnumerateProvidersForDecodingSource
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_tdhFormatProperty
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_tdhGetDecodingParameter
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_tdhGetEventInformation
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_tdhGetEventMapInformation
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_tdhGetManifestEventInformation
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_tdhGetProperty
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_tdhGetPropertySize
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_tdhGetWppMessage
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_tdhGetWppProperty
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_tdhLoadManifest
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_tdhLoadManifestFromBinary
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_tdhLoadManifestFromMemory
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_tdhOpenDecodingHandle
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_tdhQueryProviderFieldInformation
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_tdhSetDecodingParameter
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_tdhUnloadManifest
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_tdhUnloadManifestFromMemory
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_traceEvent
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_traceEventInstance
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_traceMessage
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_traceMessageVa
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssys_windows_win32_system_diagnostics_etw_unregisterTraceGuids
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun closeTrace(tracehandle: ProcesstraceHandle): Win32Error =
    0u

public actual fun controlTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: COpaquePointer?, controlcode: EventTraceControl): Win32Error =
    0u

public actual fun controlTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: COpaquePointer?, controlcode: EventTraceControl): Win32Error =
    0u

public actual fun createTraceInstanceId(reghandle: Handle, instinfo: COpaquePointer?): Win32Error =
    windowssys_windows_win32_system_diagnostics_etw_createTraceInstanceId(reghandle?.value?.toCPointer<ByteVar>(), instinfo?.value?.toCPointer<ByteVar>())

public actual fun cveEventWrite(cveid: Pcwstr, additionaldetails: Pcwstr): Int =
    windowssys_windows_win32_system_diagnostics_etw_cveEventWrite(cveid?.value?.toCPointer<ByteVar>(), additionaldetails?.value?.toCPointer<ByteVar>())

public actual fun enableTrace(enable: UInt, enableflag: UInt, enablelevel: UInt, controlguid: COpaquePointer?, tracehandle: ControltraceHandle): Win32Error =
    0u

public actual fun enableTraceEx(providerid: COpaquePointer?, sourceid: COpaquePointer?, tracehandle: ControltraceHandle, isenabled: UInt, level: UByte, matchanykeyword: ULong, matchallkeyword: ULong, enableproperty: UInt, enablefilterdesc: COpaquePointer?): Win32Error =
    0u

public actual fun enableTraceEx2(tracehandle: ControltraceHandle, providerid: COpaquePointer?, controlcode: UInt, level: UByte, matchanykeyword: ULong, matchallkeyword: ULong, timeout: UInt, enableparameters: COpaquePointer?): Win32Error =
    0u

public actual fun enumerateTraceGuids(guidpropertiesarray: COpaquePointer?, propertyarraycount: UInt, guidcount: COpaquePointer?): Win32Error =
    windowssys_windows_win32_system_diagnostics_etw_enumerateTraceGuids(guidpropertiesarray?.value?.toCPointer<ByteVar>(), propertyarraycount, guidcount?.value?.toCPointer<ByteVar>())

public actual fun enumerateTraceGuidsEx(tracequeryinfoclass: TraceQueryInfoClass, inbuffer: COpaquePointer?, inbuffersize: UInt, outbuffer: COpaquePointer?, outbuffersize: UInt, returnlength: COpaquePointer?): Win32Error =
    windowssys_windows_win32_system_diagnostics_etw_enumerateTraceGuidsEx(tracequeryinfoclass, inbuffer?.value?.toCPointer<ByteVar>(), inbuffersize, outbuffer?.value?.toCPointer<ByteVar>(), outbuffersize, returnlength?.value?.toCPointer<ByteVar>())

public actual fun eventAccessControl(guid: COpaquePointer?, operation: UInt, sid: Psid, rights: UInt, allowordeny: Boolean): UInt =
    windowssys_windows_win32_system_diagnostics_etw_eventAccessControl(guid?.value?.toCPointer<ByteVar>(), operation, sid?.value?.toCPointer<ByteVar>(), rights, allowordeny)

public actual fun eventAccessQuery(guid: COpaquePointer?, buffer: PsecurityDescriptor, buffersize: COpaquePointer?): UInt =
    windowssys_windows_win32_system_diagnostics_etw_eventAccessQuery(guid?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), buffersize?.value?.toCPointer<ByteVar>())

public actual fun eventAccessRemove(guid: COpaquePointer?): UInt =
    windowssys_windows_win32_system_diagnostics_etw_eventAccessRemove(guid?.value?.toCPointer<ByteVar>())

public actual fun eventActivityIdControl(controlcode: UInt, activityid: COpaquePointer?): UInt =
    windowssys_windows_win32_system_diagnostics_etw_eventActivityIdControl(controlcode, activityid?.value?.toCPointer<ByteVar>())

public actual fun eventEnabled(reghandle: Reghandle, eventdescriptor: COpaquePointer?): Boolean =
    windowssys_windows_win32_system_diagnostics_etw_eventEnabled(reghandle, eventdescriptor?.value?.toCPointer<ByteVar>())

public actual fun eventProviderEnabled(reghandle: Reghandle, level: UByte, keyword: ULong): Boolean =
    windowssys_windows_win32_system_diagnostics_etw_eventProviderEnabled(reghandle, level, keyword)

public actual fun eventRegister(providerid: COpaquePointer?, enablecallback: Penablecallback, callbackcontext: COpaquePointer?, reghandle: COpaquePointer?): UInt =
    windowssys_windows_win32_system_diagnostics_etw_eventRegister(providerid?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), callbackcontext?.value?.toCPointer<ByteVar>(), reghandle?.value?.toCPointer<ByteVar>())

public actual fun eventSetInformation(reghandle: Reghandle, informationclass: EventInfoClass, eventinformation: COpaquePointer?, informationlength: UInt): UInt =
    windowssys_windows_win32_system_diagnostics_etw_eventSetInformation(reghandle, informationclass, eventinformation?.value?.toCPointer<ByteVar>(), informationlength)

public actual fun eventUnregister(reghandle: Reghandle): UInt =
    windowssys_windows_win32_system_diagnostics_etw_eventUnregister(reghandle)

public actual fun eventWrite(reghandle: Reghandle, eventdescriptor: COpaquePointer?, userdatacount: UInt, userdata: COpaquePointer?): UInt =
    windowssys_windows_win32_system_diagnostics_etw_eventWrite(reghandle, eventdescriptor?.value?.toCPointer<ByteVar>(), userdatacount, userdata?.value?.toCPointer<ByteVar>())

public actual fun eventWriteEx(reghandle: Reghandle, eventdescriptor: COpaquePointer?, filter: ULong, flags: UInt, activityid: COpaquePointer?, relatedactivityid: COpaquePointer?, userdatacount: UInt, userdata: COpaquePointer?): UInt =
    windowssys_windows_win32_system_diagnostics_etw_eventWriteEx(reghandle, eventdescriptor?.value?.toCPointer<ByteVar>(), filter, flags, activityid?.value?.toCPointer<ByteVar>(), relatedactivityid?.value?.toCPointer<ByteVar>(), userdatacount, userdata?.value?.toCPointer<ByteVar>())

public actual fun eventWriteString(reghandle: Reghandle, level: UByte, keyword: ULong, string: Pcwstr): UInt =
    windowssys_windows_win32_system_diagnostics_etw_eventWriteString(reghandle, level, keyword, string?.value?.toCPointer<ByteVar>())

public actual fun eventWriteTransfer(reghandle: Reghandle, eventdescriptor: COpaquePointer?, activityid: COpaquePointer?, relatedactivityid: COpaquePointer?, userdatacount: UInt, userdata: COpaquePointer?): UInt =
    windowssys_windows_win32_system_diagnostics_etw_eventWriteTransfer(reghandle, eventdescriptor?.value?.toCPointer<ByteVar>(), activityid?.value?.toCPointer<ByteVar>(), relatedactivityid?.value?.toCPointer<ByteVar>(), userdatacount, userdata?.value?.toCPointer<ByteVar>())

public actual fun flushTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: COpaquePointer?): Win32Error =
    0u

public actual fun flushTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: COpaquePointer?): Win32Error =
    0u

public actual fun getTraceEnableFlags(tracehandle: ULong): UInt =
    windowssys_windows_win32_system_diagnostics_etw_getTraceEnableFlags(tracehandle)

public actual fun getTraceEnableLevel(tracehandle: ULong): UByte =
    windowssys_windows_win32_system_diagnostics_etw_getTraceEnableLevel(tracehandle)

public actual fun getTraceLoggerHandle(buffer: COpaquePointer?): ULong =
    windowssys_windows_win32_system_diagnostics_etw_getTraceLoggerHandle(buffer?.value?.toCPointer<ByteVar>())

public actual fun openTraceA(logfile: COpaquePointer?): ProcesstraceHandle =
    ProcesstraceHandle()

public actual fun openTraceFromBufferStream(options: COpaquePointer?, buffercompletioncallback: PetwBufferCompletionCallback, buffercompletioncontext: COpaquePointer?): ULong =
    windowssys_windows_win32_system_diagnostics_etw_openTraceFromBufferStream(options?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), buffercompletioncontext?.value?.toCPointer<ByteVar>())

public actual fun openTraceFromFile(logfilename: Pcwstr, options: COpaquePointer?, logfileheader: COpaquePointer?): ULong =
    windowssys_windows_win32_system_diagnostics_etw_openTraceFromFile(logfilename?.value?.toCPointer<ByteVar>(), options?.value?.toCPointer<ByteVar>(), logfileheader?.value?.toCPointer<ByteVar>())

public actual fun openTraceFromRealTimeLogger(loggername: Pcwstr, options: COpaquePointer?, logfileheader: COpaquePointer?): ULong =
    windowssys_windows_win32_system_diagnostics_etw_openTraceFromRealTimeLogger(loggername?.value?.toCPointer<ByteVar>(), options?.value?.toCPointer<ByteVar>(), logfileheader?.value?.toCPointer<ByteVar>())

public actual fun openTraceFromRealTimeLoggerWithAllocationOptions(loggername: Pcwstr, options: COpaquePointer?, allocationsize: ULong, memorypartitionhandle: Handle, logfileheader: COpaquePointer?): ULong =
    windowssys_windows_win32_system_diagnostics_etw_openTraceFromRealTimeLoggerWithAllocationOptions(loggername?.value?.toCPointer<ByteVar>(), options?.value?.toCPointer<ByteVar>(), allocationsize, memorypartitionhandle?.value?.toCPointer<ByteVar>(), logfileheader?.value?.toCPointer<ByteVar>())

public actual fun openTraceW(logfile: COpaquePointer?): ProcesstraceHandle =
    ProcesstraceHandle()

public actual fun processTrace(handlearray: COpaquePointer?, handlecount: UInt, starttime: COpaquePointer?, endtime: COpaquePointer?): Win32Error =
    windowssys_windows_win32_system_diagnostics_etw_processTrace(handlearray?.value?.toCPointer<ByteVar>(), handlecount, starttime?.value?.toCPointer<ByteVar>(), endtime?.value?.toCPointer<ByteVar>())

public actual fun processTraceAddBufferToBufferStream(tracehandle: ULong, buffer: COpaquePointer?, buffersize: UInt): UInt =
    windowssys_windows_win32_system_diagnostics_etw_processTraceAddBufferToBufferStream(tracehandle, buffer?.value?.toCPointer<ByteVar>(), buffersize)

public actual fun processTraceBufferDecrementReference(buffer: COpaquePointer?): UInt =
    windowssys_windows_win32_system_diagnostics_etw_processTraceBufferDecrementReference(buffer?.value?.toCPointer<ByteVar>())

public actual fun processTraceBufferIncrementReference(tracehandle: ULong, buffer: COpaquePointer?): UInt =
    windowssys_windows_win32_system_diagnostics_etw_processTraceBufferIncrementReference(tracehandle, buffer?.value?.toCPointer<ByteVar>())

public actual fun queryAllTracesA(propertyarray: COpaquePointer?, propertyarraycount: UInt, loggercount: COpaquePointer?): Win32Error =
    windowssys_windows_win32_system_diagnostics_etw_queryAllTracesA(propertyarray?.value?.toCPointer<ByteVar>(), propertyarraycount, loggercount?.value?.toCPointer<ByteVar>())

public actual fun queryAllTracesW(propertyarray: COpaquePointer?, propertyarraycount: UInt, loggercount: COpaquePointer?): Win32Error =
    windowssys_windows_win32_system_diagnostics_etw_queryAllTracesW(propertyarray?.value?.toCPointer<ByteVar>(), propertyarraycount, loggercount?.value?.toCPointer<ByteVar>())

public actual fun queryTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: COpaquePointer?): Win32Error =
    0u

public actual fun queryTraceProcessingHandle(processinghandle: ProcesstraceHandle, informationclass: EtwProcessHandleInfoType, inbuffer: COpaquePointer?, inbuffersize: UInt, outbuffer: COpaquePointer?, outbuffersize: UInt, returnlength: COpaquePointer?): Win32Error =
    0u

public actual fun queryTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: COpaquePointer?): Win32Error =
    0u

public actual fun registerTraceGuidsA(requestaddress: Wmidprequest, requestcontext: COpaquePointer?, controlguid: COpaquePointer?, guidcount: UInt, traceguidreg: COpaquePointer?, mofimagepath: Pcstr, mofresourcename: Pcstr, registrationhandle: COpaquePointer?): UInt =
    windowssys_windows_win32_system_diagnostics_etw_registerTraceGuidsA(0L.toCPointer<ByteVar>(), requestcontext?.value?.toCPointer<ByteVar>(), controlguid?.value?.toCPointer<ByteVar>(), guidcount, traceguidreg?.value?.toCPointer<ByteVar>(), mofimagepath?.value?.toCPointer<ByteVar>(), mofresourcename?.value?.toCPointer<ByteVar>(), registrationhandle?.value?.toCPointer<ByteVar>())

public actual fun registerTraceGuidsW(requestaddress: Wmidprequest, requestcontext: COpaquePointer?, controlguid: COpaquePointer?, guidcount: UInt, traceguidreg: COpaquePointer?, mofimagepath: Pcwstr, mofresourcename: Pcwstr, registrationhandle: COpaquePointer?): UInt =
    windowssys_windows_win32_system_diagnostics_etw_registerTraceGuidsW(0L.toCPointer<ByteVar>(), requestcontext?.value?.toCPointer<ByteVar>(), controlguid?.value?.toCPointer<ByteVar>(), guidcount, traceguidreg?.value?.toCPointer<ByteVar>(), mofimagepath?.value?.toCPointer<ByteVar>(), mofresourcename?.value?.toCPointer<ByteVar>(), registrationhandle?.value?.toCPointer<ByteVar>())

public actual fun removeTraceCallback(pguid: COpaquePointer?): Win32Error =
    windowssys_windows_win32_system_diagnostics_etw_removeTraceCallback(pguid?.value?.toCPointer<ByteVar>())

public actual fun setTraceCallback(pguid: COpaquePointer?, eventcallback: PeventCallback): Win32Error =
    windowssys_windows_win32_system_diagnostics_etw_setTraceCallback(pguid?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun startTraceA(tracehandle: COpaquePointer?, instancename: Pcstr, properties: COpaquePointer?): Win32Error =
    windowssys_windows_win32_system_diagnostics_etw_startTraceA(tracehandle?.value?.toCPointer<ByteVar>(), instancename?.value?.toCPointer<ByteVar>(), properties?.value?.toCPointer<ByteVar>())

public actual fun startTraceW(tracehandle: COpaquePointer?, instancename: Pcwstr, properties: COpaquePointer?): Win32Error =
    windowssys_windows_win32_system_diagnostics_etw_startTraceW(tracehandle?.value?.toCPointer<ByteVar>(), instancename?.value?.toCPointer<ByteVar>(), properties?.value?.toCPointer<ByteVar>())

public actual fun stopTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: COpaquePointer?): Win32Error =
    0u

public actual fun stopTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: COpaquePointer?): Win32Error =
    0u

public actual fun tdhAggregatePayloadFilters(payloadfiltercount: UInt, payloadfilterptrs: COpaquePointer?, eventmatchallflags: COpaquePointer?, eventfilterdescriptor: COpaquePointer?): UInt =
    windowssys_windows_win32_system_diagnostics_etw_tdhAggregatePayloadFilters(payloadfiltercount, payloadfilterptrs?.value?.toCPointer<ByteVar>(), eventmatchallflags?.value?.toCPointer<ByteVar>(), eventfilterdescriptor?.value?.toCPointer<ByteVar>())

public actual fun tdhCleanupPayloadEventFilterDescriptor(eventfilterdescriptor: COpaquePointer?): UInt =
    windowssys_windows_win32_system_diagnostics_etw_tdhCleanupPayloadEventFilterDescriptor(eventfilterdescriptor?.value?.toCPointer<ByteVar>())

public actual fun tdhCloseDecodingHandle(handle: TdhHandle): UInt =
    windowssys_windows_win32_system_diagnostics_etw_tdhCloseDecodingHandle(handle)

public actual fun tdhCreatePayloadFilter(providerguid: COpaquePointer?, eventdescriptor: COpaquePointer?, eventmatchany: Boolean, payloadpredicatecount: UInt, payloadpredicates: COpaquePointer?, payloadfilter: COpaquePointer?): UInt =
    windowssys_windows_win32_system_diagnostics_etw_tdhCreatePayloadFilter(providerguid?.value?.toCPointer<ByteVar>(), eventdescriptor?.value?.toCPointer<ByteVar>(), eventmatchany, payloadpredicatecount, payloadpredicates?.value?.toCPointer<ByteVar>(), payloadfilter?.value?.toCPointer<ByteVar>())

public actual fun tdhDeletePayloadFilter(payloadfilter: COpaquePointer?): UInt =
    windowssys_windows_win32_system_diagnostics_etw_tdhDeletePayloadFilter(payloadfilter?.value?.toCPointer<ByteVar>())

public actual fun tdhEnumerateManifestProviderEvents(providerguid: COpaquePointer?, buffer: COpaquePointer?, buffersize: COpaquePointer?): UInt =
    windowssys_windows_win32_system_diagnostics_etw_tdhEnumerateManifestProviderEvents(providerguid?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), buffersize?.value?.toCPointer<ByteVar>())

public actual fun tdhEnumerateProviderFieldInformation(pguid: COpaquePointer?, eventfieldtype: EventFieldType, pbuffer: COpaquePointer?, pbuffersize: COpaquePointer?): UInt =
    windowssys_windows_win32_system_diagnostics_etw_tdhEnumerateProviderFieldInformation(pguid?.value?.toCPointer<ByteVar>(), eventfieldtype, pbuffer?.value?.toCPointer<ByteVar>(), pbuffersize?.value?.toCPointer<ByteVar>())

public actual fun tdhEnumerateProviderFilters(guid: COpaquePointer?, tdhcontextcount: UInt, tdhcontext: COpaquePointer?, filtercount: COpaquePointer?, buffer: COpaquePointer?, buffersize: COpaquePointer?): UInt =
    windowssys_windows_win32_system_diagnostics_etw_tdhEnumerateProviderFilters(guid?.value?.toCPointer<ByteVar>(), tdhcontextcount, tdhcontext?.value?.toCPointer<ByteVar>(), filtercount?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), buffersize?.value?.toCPointer<ByteVar>())

public actual fun tdhEnumerateProviders(pbuffer: COpaquePointer?, pbuffersize: COpaquePointer?): UInt =
    windowssys_windows_win32_system_diagnostics_etw_tdhEnumerateProviders(pbuffer?.value?.toCPointer<ByteVar>(), pbuffersize?.value?.toCPointer<ByteVar>())

public actual fun tdhEnumerateProvidersForDecodingSource(filter: DecodingSource, buffer: COpaquePointer?, buffersize: UInt, bufferrequired: COpaquePointer?): UInt =
    windowssys_windows_win32_system_diagnostics_etw_tdhEnumerateProvidersForDecodingSource(filter, buffer?.value?.toCPointer<ByteVar>(), buffersize, bufferrequired?.value?.toCPointer<ByteVar>())

public actual fun tdhFormatProperty(eventinfo: COpaquePointer?, mapinfo: COpaquePointer?, pointersize: UInt, propertyintype: UShort, propertyouttype: UShort, propertylength: UShort, userdatalength: UShort, userdata: COpaquePointer?, buffersize: COpaquePointer?, buffer: Pwstr, userdataconsumed: COpaquePointer?): UInt =
    windowssys_windows_win32_system_diagnostics_etw_tdhFormatProperty(eventinfo?.value?.toCPointer<ByteVar>(), mapinfo?.value?.toCPointer<ByteVar>(), pointersize, propertyintype, propertyouttype, propertylength, userdatalength, userdata?.value?.toCPointer<ByteVar>(), buffersize?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), userdataconsumed?.value?.toCPointer<ByteVar>())

public actual fun tdhGetDecodingParameter(handle: TdhHandle, tdhcontext: COpaquePointer?): UInt =
    windowssys_windows_win32_system_diagnostics_etw_tdhGetDecodingParameter(handle, tdhcontext?.value?.toCPointer<ByteVar>())

public actual fun tdhGetEventInformation(event: COpaquePointer?, tdhcontextcount: UInt, tdhcontext: COpaquePointer?, buffer: COpaquePointer?, buffersize: COpaquePointer?): UInt =
    windowssys_windows_win32_system_diagnostics_etw_tdhGetEventInformation(event?.value?.toCPointer<ByteVar>(), tdhcontextcount, tdhcontext?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), buffersize?.value?.toCPointer<ByteVar>())

public actual fun tdhGetEventMapInformation(pevent: COpaquePointer?, pmapname: Pcwstr, pbuffer: COpaquePointer?, pbuffersize: COpaquePointer?): UInt =
    windowssys_windows_win32_system_diagnostics_etw_tdhGetEventMapInformation(pevent?.value?.toCPointer<ByteVar>(), pmapname?.value?.toCPointer<ByteVar>(), pbuffer?.value?.toCPointer<ByteVar>(), pbuffersize?.value?.toCPointer<ByteVar>())

public actual fun tdhGetManifestEventInformation(providerguid: COpaquePointer?, eventdescriptor: COpaquePointer?, buffer: COpaquePointer?, buffersize: COpaquePointer?): UInt =
    windowssys_windows_win32_system_diagnostics_etw_tdhGetManifestEventInformation(providerguid?.value?.toCPointer<ByteVar>(), eventdescriptor?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), buffersize?.value?.toCPointer<ByteVar>())

public actual fun tdhGetProperty(pevent: COpaquePointer?, tdhcontextcount: UInt, ptdhcontext: COpaquePointer?, propertydatacount: UInt, ppropertydata: COpaquePointer?, buffersize: UInt, pbuffer: COpaquePointer?): UInt =
    windowssys_windows_win32_system_diagnostics_etw_tdhGetProperty(pevent?.value?.toCPointer<ByteVar>(), tdhcontextcount, ptdhcontext?.value?.toCPointer<ByteVar>(), propertydatacount, ppropertydata?.value?.toCPointer<ByteVar>(), buffersize, pbuffer?.value?.toCPointer<ByteVar>())

public actual fun tdhGetPropertySize(pevent: COpaquePointer?, tdhcontextcount: UInt, ptdhcontext: COpaquePointer?, propertydatacount: UInt, ppropertydata: COpaquePointer?, ppropertysize: COpaquePointer?): UInt =
    windowssys_windows_win32_system_diagnostics_etw_tdhGetPropertySize(pevent?.value?.toCPointer<ByteVar>(), tdhcontextcount, ptdhcontext?.value?.toCPointer<ByteVar>(), propertydatacount, ppropertydata?.value?.toCPointer<ByteVar>(), ppropertysize?.value?.toCPointer<ByteVar>())

public actual fun tdhGetWppMessage(handle: TdhHandle, eventrecord: COpaquePointer?, buffersize: COpaquePointer?, buffer: COpaquePointer?): UInt =
    windowssys_windows_win32_system_diagnostics_etw_tdhGetWppMessage(handle, eventrecord?.value?.toCPointer<ByteVar>(), buffersize?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>())

public actual fun tdhGetWppProperty(handle: TdhHandle, eventrecord: COpaquePointer?, propertyname: Pcwstr, buffersize: COpaquePointer?, buffer: COpaquePointer?): UInt =
    windowssys_windows_win32_system_diagnostics_etw_tdhGetWppProperty(handle, eventrecord?.value?.toCPointer<ByteVar>(), propertyname?.value?.toCPointer<ByteVar>(), buffersize?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>())

public actual fun tdhLoadManifest(manifest: Pcwstr): UInt =
    windowssys_windows_win32_system_diagnostics_etw_tdhLoadManifest(manifest?.value?.toCPointer<ByteVar>())

public actual fun tdhLoadManifestFromBinary(binarypath: Pcwstr): UInt =
    windowssys_windows_win32_system_diagnostics_etw_tdhLoadManifestFromBinary(binarypath?.value?.toCPointer<ByteVar>())

public actual fun tdhLoadManifestFromMemory(pdata: COpaquePointer?, cbdata: UInt): UInt =
    windowssys_windows_win32_system_diagnostics_etw_tdhLoadManifestFromMemory(pdata?.value?.toCPointer<ByteVar>(), cbdata)

public actual fun tdhOpenDecodingHandle(handle: COpaquePointer?): UInt =
    windowssys_windows_win32_system_diagnostics_etw_tdhOpenDecodingHandle(handle?.value?.toCPointer<ByteVar>())

public actual fun tdhQueryProviderFieldInformation(pguid: COpaquePointer?, eventfieldvalue: ULong, eventfieldtype: EventFieldType, pbuffer: COpaquePointer?, pbuffersize: COpaquePointer?): UInt =
    windowssys_windows_win32_system_diagnostics_etw_tdhQueryProviderFieldInformation(pguid?.value?.toCPointer<ByteVar>(), eventfieldvalue, eventfieldtype, pbuffer?.value?.toCPointer<ByteVar>(), pbuffersize?.value?.toCPointer<ByteVar>())

public actual fun tdhSetDecodingParameter(handle: TdhHandle, tdhcontext: COpaquePointer?): UInt =
    windowssys_windows_win32_system_diagnostics_etw_tdhSetDecodingParameter(handle, tdhcontext?.value?.toCPointer<ByteVar>())

public actual fun tdhUnloadManifest(manifest: Pcwstr): UInt =
    windowssys_windows_win32_system_diagnostics_etw_tdhUnloadManifest(manifest?.value?.toCPointer<ByteVar>())

public actual fun tdhUnloadManifestFromMemory(pdata: COpaquePointer?, cbdata: UInt): UInt =
    windowssys_windows_win32_system_diagnostics_etw_tdhUnloadManifestFromMemory(pdata?.value?.toCPointer<ByteVar>(), cbdata)

public actual fun traceEvent(tracehandle: ULong, eventtrace: COpaquePointer?): Win32Error =
    windowssys_windows_win32_system_diagnostics_etw_traceEvent(tracehandle, eventtrace?.value?.toCPointer<ByteVar>())

public actual fun traceEventInstance(tracehandle: ULong, eventtrace: COpaquePointer?, instinfo: COpaquePointer?, parentinstinfo: COpaquePointer?): UInt =
    windowssys_windows_win32_system_diagnostics_etw_traceEventInstance(tracehandle, eventtrace?.value?.toCPointer<ByteVar>(), instinfo?.value?.toCPointer<ByteVar>(), parentinstinfo?.value?.toCPointer<ByteVar>())

public actual fun traceMessage(loggerhandle: ULong, messageflags: TraceMessageFlags, messageguid: COpaquePointer?, messagenumber: UShort, vararg variadicArgs: Long): Win32Error =
    windowssys_windows_win32_system_diagnostics_etw_traceMessage(loggerhandle, messageflags, messageguid?.value?.toCPointer<ByteVar>(), messagenumber, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun traceMessageVa(loggerhandle: ULong, messageflags: TraceMessageFlags, messageguid: COpaquePointer?, messagenumber: UShort, messagearglist: COpaquePointer?): Win32Error =
    windowssys_windows_win32_system_diagnostics_etw_traceMessageVa(loggerhandle, messageflags, messageguid?.value?.toCPointer<ByteVar>(), messagenumber, messagearglist?.value?.toCPointer<ByteVar>())

public actual fun traceQueryInformation(sessionhandle: ControltraceHandle, informationclass: TraceQueryInfoClass, traceinformation: COpaquePointer?, informationlength: UInt, returnlength: COpaquePointer?): Win32Error =
    0u

public actual fun traceSetInformation(sessionhandle: ControltraceHandle, informationclass: TraceQueryInfoClass, traceinformation: COpaquePointer?, informationlength: UInt): Win32Error =
    0u

public actual fun unregisterTraceGuids(registrationhandle: ULong): UInt =
    windowssys_windows_win32_system_diagnostics_etw_unregisterTraceGuids(registrationhandle)

public actual fun updateTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: COpaquePointer?): Win32Error =
    0u

public actual fun updateTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: COpaquePointer?): Win32Error =
    0u
