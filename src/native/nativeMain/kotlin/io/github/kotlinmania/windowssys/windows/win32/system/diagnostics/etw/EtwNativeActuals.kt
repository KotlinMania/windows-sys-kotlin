@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssysWindowsWin32SystemDiagnosticsEtwCreateTraceInstanceId
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssysWindowsWin32SystemDiagnosticsEtwCveEventWrite
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssysWindowsWin32SystemDiagnosticsEtwEnumerateTraceGuids
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssysWindowsWin32SystemDiagnosticsEtwEnumerateTraceGuidsEx
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssysWindowsWin32SystemDiagnosticsEtwEventAccessControl
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssysWindowsWin32SystemDiagnosticsEtwEventAccessQuery
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssysWindowsWin32SystemDiagnosticsEtwEventAccessRemove
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssysWindowsWin32SystemDiagnosticsEtwEventActivityIdControl
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssysWindowsWin32SystemDiagnosticsEtwEventEnabled
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssysWindowsWin32SystemDiagnosticsEtwEventProviderEnabled
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssysWindowsWin32SystemDiagnosticsEtwEventRegister
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssysWindowsWin32SystemDiagnosticsEtwEventSetInformation
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssysWindowsWin32SystemDiagnosticsEtwEventUnregister
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssysWindowsWin32SystemDiagnosticsEtwEventWrite
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssysWindowsWin32SystemDiagnosticsEtwEventWriteEx
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssysWindowsWin32SystemDiagnosticsEtwEventWriteString
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssysWindowsWin32SystemDiagnosticsEtwEventWriteTransfer
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssysWindowsWin32SystemDiagnosticsEtwGetTraceEnableFlags
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssysWindowsWin32SystemDiagnosticsEtwGetTraceEnableLevel
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssysWindowsWin32SystemDiagnosticsEtwGetTraceLoggerHandle
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssysWindowsWin32SystemDiagnosticsEtwOpenTraceFromBufferStream
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssysWindowsWin32SystemDiagnosticsEtwOpenTraceFromFile
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssysWindowsWin32SystemDiagnosticsEtwOpenTraceFromRealTimeLogger
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssysWindowsWin32SystemDiagnosticsEtwOpenTraceFromRealTimeLoggerWithAllocationOptions
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssysWindowsWin32SystemDiagnosticsEtwProcessTrace
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssysWindowsWin32SystemDiagnosticsEtwProcessTraceAddBufferToBufferStream
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssysWindowsWin32SystemDiagnosticsEtwProcessTraceBufferDecrementReference
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssysWindowsWin32SystemDiagnosticsEtwProcessTraceBufferIncrementReference
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssysWindowsWin32SystemDiagnosticsEtwQueryAllTracesA
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssysWindowsWin32SystemDiagnosticsEtwQueryAllTracesW
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssysWindowsWin32SystemDiagnosticsEtwRegisterTraceGuidsA
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssysWindowsWin32SystemDiagnosticsEtwRegisterTraceGuidsW
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssysWindowsWin32SystemDiagnosticsEtwRemoveTraceCallback
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssysWindowsWin32SystemDiagnosticsEtwSetTraceCallback
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssysWindowsWin32SystemDiagnosticsEtwStartTraceA
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssysWindowsWin32SystemDiagnosticsEtwStartTraceW
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssysWindowsWin32SystemDiagnosticsEtwTdhAggregatePayloadFilters
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssysWindowsWin32SystemDiagnosticsEtwTdhCleanupPayloadEventFilterDescriptor
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssysWindowsWin32SystemDiagnosticsEtwTdhCloseDecodingHandle
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssysWindowsWin32SystemDiagnosticsEtwTdhCreatePayloadFilter
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssysWindowsWin32SystemDiagnosticsEtwTdhDeletePayloadFilter
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssysWindowsWin32SystemDiagnosticsEtwTdhEnumerateManifestProviderEvents
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssysWindowsWin32SystemDiagnosticsEtwTdhEnumerateProviderFieldInformation
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssysWindowsWin32SystemDiagnosticsEtwTdhEnumerateProviderFilters
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssysWindowsWin32SystemDiagnosticsEtwTdhEnumerateProviders
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssysWindowsWin32SystemDiagnosticsEtwTdhEnumerateProvidersForDecodingSource
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssysWindowsWin32SystemDiagnosticsEtwTdhFormatProperty
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssysWindowsWin32SystemDiagnosticsEtwTdhGetDecodingParameter
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssysWindowsWin32SystemDiagnosticsEtwTdhGetEventInformation
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssysWindowsWin32SystemDiagnosticsEtwTdhGetEventMapInformation
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssysWindowsWin32SystemDiagnosticsEtwTdhGetManifestEventInformation
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssysWindowsWin32SystemDiagnosticsEtwTdhGetProperty
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssysWindowsWin32SystemDiagnosticsEtwTdhGetPropertySize
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssysWindowsWin32SystemDiagnosticsEtwTdhGetWppMessage
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssysWindowsWin32SystemDiagnosticsEtwTdhGetWppProperty
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssysWindowsWin32SystemDiagnosticsEtwTdhLoadManifest
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssysWindowsWin32SystemDiagnosticsEtwTdhLoadManifestFromBinary
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssysWindowsWin32SystemDiagnosticsEtwTdhLoadManifestFromMemory
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssysWindowsWin32SystemDiagnosticsEtwTdhOpenDecodingHandle
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssysWindowsWin32SystemDiagnosticsEtwTdhQueryProviderFieldInformation
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssysWindowsWin32SystemDiagnosticsEtwTdhSetDecodingParameter
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssysWindowsWin32SystemDiagnosticsEtwTdhUnloadManifest
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssysWindowsWin32SystemDiagnosticsEtwTdhUnloadManifestFromMemory
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssysWindowsWin32SystemDiagnosticsEtwTraceEvent
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssysWindowsWin32SystemDiagnosticsEtwTraceEventInstance
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssysWindowsWin32SystemDiagnosticsEtwTraceMessage
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssysWindowsWin32SystemDiagnosticsEtwTraceMessageVa
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.cinterop.windowssysWindowsWin32SystemDiagnosticsEtwUnregisterTraceGuids
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun closeTrace(tracehandle: ProcesstraceHandle): Win32Error =
    0u

public actual fun controlTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: MutPtr<EventTraceProperties>, controlcode: EventTraceControl): Win32Error =
    0u

public actual fun controlTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: MutPtr<EventTraceProperties>, controlcode: EventTraceControl): Win32Error =
    0u

public actual fun createTraceInstanceId(reghandle: Handle, instinfo: MutPtr<EventInstanceInfo>): Win32Error =
    windowssysWindowsWin32SystemDiagnosticsEtwCreateTraceInstanceId(reghandle.rawAddress.toCPointer<ByteVar>(), instinfo.rawAddress.toCPointer<ByteVar>())

public actual fun cveEventWrite(cveid: Pcwstr, additionaldetails: Pcwstr): Int =
    windowssysWindowsWin32SystemDiagnosticsEtwCveEventWrite(cveid.rawAddress.toCPointer<ByteVar>(), additionaldetails.rawAddress.toCPointer<ByteVar>())

public actual fun enableTrace(enable: UInt, enableflag: UInt, enablelevel: UInt, controlguid: ConstPtr<Guid>, tracehandle: ControltraceHandle): Win32Error =
    0u

public actual fun enableTraceEx(providerid: ConstPtr<Guid>, sourceid: ConstPtr<Guid>, tracehandle: ControltraceHandle, isenabled: UInt, level: UByte, matchanykeyword: ULong, matchallkeyword: ULong, enableproperty: UInt, enablefilterdesc: ConstPtr<EventFilterDescriptor>): Win32Error =
    0u

public actual fun enableTraceEx2(tracehandle: ControltraceHandle, providerid: ConstPtr<Guid>, controlcode: UInt, level: UByte, matchanykeyword: ULong, matchallkeyword: ULong, timeout: UInt, enableparameters: ConstPtr<EnableTraceParameters>): Win32Error =
    0u

public actual fun enumerateTraceGuids(guidpropertiesarray: MutPtr<MutPtr<TraceGuidProperties>>, propertyarraycount: UInt, guidcount: MutPtr<UInt>): Win32Error =
    windowssysWindowsWin32SystemDiagnosticsEtwEnumerateTraceGuids(guidpropertiesarray.rawAddress.toCPointer<ByteVar>(), propertyarraycount, guidcount.rawAddress.toCPointer<ByteVar>())

public actual fun enumerateTraceGuidsEx(tracequeryinfoclass: TraceQueryInfoClass, inbuffer: ConstPtr<CVoid>, inbuffersize: UInt, outbuffer: MutPtr<CVoid>, outbuffersize: UInt, returnlength: MutPtr<UInt>): Win32Error =
    windowssysWindowsWin32SystemDiagnosticsEtwEnumerateTraceGuidsEx(tracequeryinfoclass, inbuffer.rawAddress.toCPointer<ByteVar>(), inbuffersize, outbuffer.rawAddress.toCPointer<ByteVar>(), outbuffersize, returnlength.rawAddress.toCPointer<ByteVar>())

public actual fun eventAccessControl(guid: ConstPtr<Guid>, operation: UInt, sid: Psid, rights: UInt, allowordeny: Boolean): UInt =
    windowssysWindowsWin32SystemDiagnosticsEtwEventAccessControl(guid.rawAddress.toCPointer<ByteVar>(), operation, sid.rawAddress.toCPointer<ByteVar>(), rights, allowordeny)

public actual fun eventAccessQuery(guid: ConstPtr<Guid>, buffer: PsecurityDescriptor, buffersize: MutPtr<UInt>): UInt =
    windowssysWindowsWin32SystemDiagnosticsEtwEventAccessQuery(guid.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>(), buffersize.rawAddress.toCPointer<ByteVar>())

public actual fun eventAccessRemove(guid: ConstPtr<Guid>): UInt =
    windowssysWindowsWin32SystemDiagnosticsEtwEventAccessRemove(guid.rawAddress.toCPointer<ByteVar>())

public actual fun eventActivityIdControl(controlcode: UInt, activityid: MutPtr<Guid>): UInt =
    windowssysWindowsWin32SystemDiagnosticsEtwEventActivityIdControl(controlcode, activityid.rawAddress.toCPointer<ByteVar>())

public actual fun eventEnabled(reghandle: Reghandle, eventdescriptor: ConstPtr<EventDescriptor>): Boolean =
    windowssysWindowsWin32SystemDiagnosticsEtwEventEnabled(reghandle, eventdescriptor.rawAddress.toCPointer<ByteVar>())

public actual fun eventProviderEnabled(reghandle: Reghandle, level: UByte, keyword: ULong): Boolean =
    windowssysWindowsWin32SystemDiagnosticsEtwEventProviderEnabled(reghandle, level, keyword)

public actual fun eventRegister(providerid: ConstPtr<Guid>, enablecallback: Penablecallback, callbackcontext: ConstPtr<CVoid>, reghandle: MutPtr<Reghandle>): UInt =
    windowssysWindowsWin32SystemDiagnosticsEtwEventRegister(providerid.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), callbackcontext.rawAddress.toCPointer<ByteVar>(), reghandle.rawAddress.toCPointer<ByteVar>())

public actual fun eventSetInformation(reghandle: Reghandle, informationclass: EventInfoClass, eventinformation: ConstPtr<CVoid>, informationlength: UInt): UInt =
    windowssysWindowsWin32SystemDiagnosticsEtwEventSetInformation(reghandle, informationclass, eventinformation.rawAddress.toCPointer<ByteVar>(), informationlength)

public actual fun eventUnregister(reghandle: Reghandle): UInt =
    windowssysWindowsWin32SystemDiagnosticsEtwEventUnregister(reghandle)

public actual fun eventWrite(reghandle: Reghandle, eventdescriptor: ConstPtr<EventDescriptor>, userdatacount: UInt, userdata: ConstPtr<EventDataDescriptor>): UInt =
    windowssysWindowsWin32SystemDiagnosticsEtwEventWrite(reghandle, eventdescriptor.rawAddress.toCPointer<ByteVar>(), userdatacount, userdata.rawAddress.toCPointer<ByteVar>())

public actual fun eventWriteEx(reghandle: Reghandle, eventdescriptor: ConstPtr<EventDescriptor>, filter: ULong, flags: UInt, activityid: ConstPtr<Guid>, relatedactivityid: ConstPtr<Guid>, userdatacount: UInt, userdata: ConstPtr<EventDataDescriptor>): UInt =
    windowssysWindowsWin32SystemDiagnosticsEtwEventWriteEx(reghandle, eventdescriptor.rawAddress.toCPointer<ByteVar>(), filter, flags, activityid.rawAddress.toCPointer<ByteVar>(), relatedactivityid.rawAddress.toCPointer<ByteVar>(), userdatacount, userdata.rawAddress.toCPointer<ByteVar>())

public actual fun eventWriteString(reghandle: Reghandle, level: UByte, keyword: ULong, string: Pcwstr): UInt =
    windowssysWindowsWin32SystemDiagnosticsEtwEventWriteString(reghandle, level, keyword, string.rawAddress.toCPointer<ByteVar>())

public actual fun eventWriteTransfer(reghandle: Reghandle, eventdescriptor: ConstPtr<EventDescriptor>, activityid: ConstPtr<Guid>, relatedactivityid: ConstPtr<Guid>, userdatacount: UInt, userdata: ConstPtr<EventDataDescriptor>): UInt =
    windowssysWindowsWin32SystemDiagnosticsEtwEventWriteTransfer(reghandle, eventdescriptor.rawAddress.toCPointer<ByteVar>(), activityid.rawAddress.toCPointer<ByteVar>(), relatedactivityid.rawAddress.toCPointer<ByteVar>(), userdatacount, userdata.rawAddress.toCPointer<ByteVar>())

public actual fun flushTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: MutPtr<EventTraceProperties>): Win32Error =
    0u

public actual fun flushTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: MutPtr<EventTraceProperties>): Win32Error =
    0u

public actual fun getTraceEnableFlags(tracehandle: ULong): UInt =
    windowssysWindowsWin32SystemDiagnosticsEtwGetTraceEnableFlags(tracehandle)

public actual fun getTraceEnableLevel(tracehandle: ULong): UByte =
    windowssysWindowsWin32SystemDiagnosticsEtwGetTraceEnableLevel(tracehandle)

public actual fun getTraceLoggerHandle(buffer: ConstPtr<CVoid>): ULong =
    windowssysWindowsWin32SystemDiagnosticsEtwGetTraceLoggerHandle(buffer.rawAddress.toCPointer<ByteVar>())

public actual fun openTraceA(logfile: MutPtr<EventTraceLogfilea>): ProcesstraceHandle =
    ProcesstraceHandle()

public actual fun openTraceFromBufferStream(options: ConstPtr<EtwOpenTraceOptions>, buffercompletioncallback: PetwBufferCompletionCallback, buffercompletioncontext: ConstPtr<CVoid>): ULong =
    windowssysWindowsWin32SystemDiagnosticsEtwOpenTraceFromBufferStream(options.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), buffercompletioncontext.rawAddress.toCPointer<ByteVar>())

public actual fun openTraceFromFile(logfilename: Pcwstr, options: ConstPtr<EtwOpenTraceOptions>, logfileheader: MutPtr<TraceLogfileHeader>): ULong =
    windowssysWindowsWin32SystemDiagnosticsEtwOpenTraceFromFile(logfilename.rawAddress.toCPointer<ByteVar>(), options.rawAddress.toCPointer<ByteVar>(), logfileheader.rawAddress.toCPointer<ByteVar>())

public actual fun openTraceFromRealTimeLogger(loggername: Pcwstr, options: ConstPtr<EtwOpenTraceOptions>, logfileheader: MutPtr<TraceLogfileHeader>): ULong =
    windowssysWindowsWin32SystemDiagnosticsEtwOpenTraceFromRealTimeLogger(loggername.rawAddress.toCPointer<ByteVar>(), options.rawAddress.toCPointer<ByteVar>(), logfileheader.rawAddress.toCPointer<ByteVar>())

public actual fun openTraceFromRealTimeLoggerWithAllocationOptions(loggername: Pcwstr, options: ConstPtr<EtwOpenTraceOptions>, allocationsize: ULong, memorypartitionhandle: Handle, logfileheader: MutPtr<TraceLogfileHeader>): ULong =
    windowssysWindowsWin32SystemDiagnosticsEtwOpenTraceFromRealTimeLoggerWithAllocationOptions(loggername.rawAddress.toCPointer<ByteVar>(), options.rawAddress.toCPointer<ByteVar>(), allocationsize, memorypartitionhandle.rawAddress.toCPointer<ByteVar>(), logfileheader.rawAddress.toCPointer<ByteVar>())

public actual fun openTraceW(logfile: MutPtr<EventTraceLogfilew>): ProcesstraceHandle =
    ProcesstraceHandle()

public actual fun processTrace(handlearray: ConstPtr<ProcesstraceHandle>, handlecount: UInt, starttime: ConstPtr<Filetime>, endtime: ConstPtr<Filetime>): Win32Error =
    windowssysWindowsWin32SystemDiagnosticsEtwProcessTrace(handlearray.rawAddress.toCPointer<ByteVar>(), handlecount, starttime.rawAddress.toCPointer<ByteVar>(), endtime.rawAddress.toCPointer<ByteVar>())

public actual fun processTraceAddBufferToBufferStream(tracehandle: ULong, buffer: ConstPtr<EtwBufferHeader>, buffersize: UInt): UInt =
    windowssysWindowsWin32SystemDiagnosticsEtwProcessTraceAddBufferToBufferStream(tracehandle, buffer.rawAddress.toCPointer<ByteVar>(), buffersize)

public actual fun processTraceBufferDecrementReference(buffer: ConstPtr<EtwBufferHeader>): UInt =
    windowssysWindowsWin32SystemDiagnosticsEtwProcessTraceBufferDecrementReference(buffer.rawAddress.toCPointer<ByteVar>())

public actual fun processTraceBufferIncrementReference(tracehandle: ULong, buffer: ConstPtr<EtwBufferHeader>): UInt =
    windowssysWindowsWin32SystemDiagnosticsEtwProcessTraceBufferIncrementReference(tracehandle, buffer.rawAddress.toCPointer<ByteVar>())

public actual fun queryAllTracesA(propertyarray: MutPtr<MutPtr<EventTraceProperties>>, propertyarraycount: UInt, loggercount: MutPtr<UInt>): Win32Error =
    windowssysWindowsWin32SystemDiagnosticsEtwQueryAllTracesA(propertyarray.rawAddress.toCPointer<ByteVar>(), propertyarraycount, loggercount.rawAddress.toCPointer<ByteVar>())

public actual fun queryAllTracesW(propertyarray: MutPtr<MutPtr<EventTraceProperties>>, propertyarraycount: UInt, loggercount: MutPtr<UInt>): Win32Error =
    windowssysWindowsWin32SystemDiagnosticsEtwQueryAllTracesW(propertyarray.rawAddress.toCPointer<ByteVar>(), propertyarraycount, loggercount.rawAddress.toCPointer<ByteVar>())

public actual fun queryTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: MutPtr<EventTraceProperties>): Win32Error =
    0u

public actual fun queryTraceProcessingHandle(processinghandle: ProcesstraceHandle, informationclass: EtwProcessHandleInfoType, inbuffer: ConstPtr<CVoid>, inbuffersize: UInt, outbuffer: MutPtr<CVoid>, outbuffersize: UInt, returnlength: MutPtr<UInt>): Win32Error =
    0u

public actual fun queryTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: MutPtr<EventTraceProperties>): Win32Error =
    0u

public actual fun registerTraceGuidsA(requestaddress: Wmidprequest, requestcontext: ConstPtr<CVoid>, controlguid: ConstPtr<Guid>, guidcount: UInt, traceguidreg: ConstPtr<TraceGuidRegistration>, mofimagepath: Pcstr, mofresourcename: Pcstr, registrationhandle: MutPtr<ULong>): UInt =
    windowssysWindowsWin32SystemDiagnosticsEtwRegisterTraceGuidsA(0L.toCPointer<ByteVar>(), requestcontext.rawAddress.toCPointer<ByteVar>(), controlguid.rawAddress.toCPointer<ByteVar>(), guidcount, traceguidreg.rawAddress.toCPointer<ByteVar>(), mofimagepath.rawAddress.toCPointer<ByteVar>(), mofresourcename.rawAddress.toCPointer<ByteVar>(), registrationhandle.rawAddress.toCPointer<ByteVar>())

public actual fun registerTraceGuidsW(requestaddress: Wmidprequest, requestcontext: ConstPtr<CVoid>, controlguid: ConstPtr<Guid>, guidcount: UInt, traceguidreg: ConstPtr<TraceGuidRegistration>, mofimagepath: Pcwstr, mofresourcename: Pcwstr, registrationhandle: MutPtr<ULong>): UInt =
    windowssysWindowsWin32SystemDiagnosticsEtwRegisterTraceGuidsW(0L.toCPointer<ByteVar>(), requestcontext.rawAddress.toCPointer<ByteVar>(), controlguid.rawAddress.toCPointer<ByteVar>(), guidcount, traceguidreg.rawAddress.toCPointer<ByteVar>(), mofimagepath.rawAddress.toCPointer<ByteVar>(), mofresourcename.rawAddress.toCPointer<ByteVar>(), registrationhandle.rawAddress.toCPointer<ByteVar>())

public actual fun removeTraceCallback(pguid: ConstPtr<Guid>): Win32Error =
    windowssysWindowsWin32SystemDiagnosticsEtwRemoveTraceCallback(pguid.rawAddress.toCPointer<ByteVar>())

public actual fun setTraceCallback(pguid: ConstPtr<Guid>, eventcallback: PeventCallback): Win32Error =
    windowssysWindowsWin32SystemDiagnosticsEtwSetTraceCallback(pguid.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun startTraceA(tracehandle: MutPtr<ControltraceHandle>, instancename: Pcstr, properties: MutPtr<EventTraceProperties>): Win32Error =
    windowssysWindowsWin32SystemDiagnosticsEtwStartTraceA(tracehandle.rawAddress.toCPointer<ByteVar>(), instancename.rawAddress.toCPointer<ByteVar>(), properties.rawAddress.toCPointer<ByteVar>())

public actual fun startTraceW(tracehandle: MutPtr<ControltraceHandle>, instancename: Pcwstr, properties: MutPtr<EventTraceProperties>): Win32Error =
    windowssysWindowsWin32SystemDiagnosticsEtwStartTraceW(tracehandle.rawAddress.toCPointer<ByteVar>(), instancename.rawAddress.toCPointer<ByteVar>(), properties.rawAddress.toCPointer<ByteVar>())

public actual fun stopTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: MutPtr<EventTraceProperties>): Win32Error =
    0u

public actual fun stopTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: MutPtr<EventTraceProperties>): Win32Error =
    0u

public actual fun tdhAggregatePayloadFilters(payloadfiltercount: UInt, payloadfilterptrs: ConstPtr<ConstPtr<CVoid>>, eventmatchallflags: ConstPtr<Boolean>, eventfilterdescriptor: MutPtr<EventFilterDescriptor>): UInt =
    windowssysWindowsWin32SystemDiagnosticsEtwTdhAggregatePayloadFilters(payloadfiltercount, payloadfilterptrs.rawAddress.toCPointer<ByteVar>(), eventmatchallflags.rawAddress.toCPointer<ByteVar>(), eventfilterdescriptor.rawAddress.toCPointer<ByteVar>())

public actual fun tdhCleanupPayloadEventFilterDescriptor(eventfilterdescriptor: MutPtr<EventFilterDescriptor>): UInt =
    windowssysWindowsWin32SystemDiagnosticsEtwTdhCleanupPayloadEventFilterDescriptor(eventfilterdescriptor.rawAddress.toCPointer<ByteVar>())

public actual fun tdhCloseDecodingHandle(handle: TdhHandle): UInt =
    windowssysWindowsWin32SystemDiagnosticsEtwTdhCloseDecodingHandle(handle)

public actual fun tdhCreatePayloadFilter(providerguid: ConstPtr<Guid>, eventdescriptor: ConstPtr<EventDescriptor>, eventmatchany: Boolean, payloadpredicatecount: UInt, payloadpredicates: ConstPtr<PayloadFilterPredicate>, payloadfilter: MutPtr<MutPtr<CVoid>>): UInt =
    windowssysWindowsWin32SystemDiagnosticsEtwTdhCreatePayloadFilter(providerguid.rawAddress.toCPointer<ByteVar>(), eventdescriptor.rawAddress.toCPointer<ByteVar>(), eventmatchany, payloadpredicatecount, payloadpredicates.rawAddress.toCPointer<ByteVar>(), payloadfilter.rawAddress.toCPointer<ByteVar>())

public actual fun tdhDeletePayloadFilter(payloadfilter: MutPtr<MutPtr<CVoid>>): UInt =
    windowssysWindowsWin32SystemDiagnosticsEtwTdhDeletePayloadFilter(payloadfilter.rawAddress.toCPointer<ByteVar>())

public actual fun tdhEnumerateManifestProviderEvents(providerguid: ConstPtr<Guid>, buffer: MutPtr<ProviderEventInfo>, buffersize: MutPtr<UInt>): UInt =
    windowssysWindowsWin32SystemDiagnosticsEtwTdhEnumerateManifestProviderEvents(providerguid.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>(), buffersize.rawAddress.toCPointer<ByteVar>())

public actual fun tdhEnumerateProviderFieldInformation(pguid: ConstPtr<Guid>, eventfieldtype: EventFieldType, pbuffer: MutPtr<ProviderFieldInfoarray>, pbuffersize: MutPtr<UInt>): UInt =
    windowssysWindowsWin32SystemDiagnosticsEtwTdhEnumerateProviderFieldInformation(pguid.rawAddress.toCPointer<ByteVar>(), eventfieldtype, pbuffer.rawAddress.toCPointer<ByteVar>(), pbuffersize.rawAddress.toCPointer<ByteVar>())

public actual fun tdhEnumerateProviderFilters(guid: ConstPtr<Guid>, tdhcontextcount: UInt, tdhcontext: ConstPtr<TdhContext>, filtercount: MutPtr<UInt>, buffer: MutPtr<MutPtr<ProviderFilterInfo>>, buffersize: MutPtr<UInt>): UInt =
    windowssysWindowsWin32SystemDiagnosticsEtwTdhEnumerateProviderFilters(guid.rawAddress.toCPointer<ByteVar>(), tdhcontextcount, tdhcontext.rawAddress.toCPointer<ByteVar>(), filtercount.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>(), buffersize.rawAddress.toCPointer<ByteVar>())

public actual fun tdhEnumerateProviders(pbuffer: MutPtr<ProviderEnumerationInfo>, pbuffersize: MutPtr<UInt>): UInt =
    windowssysWindowsWin32SystemDiagnosticsEtwTdhEnumerateProviders(pbuffer.rawAddress.toCPointer<ByteVar>(), pbuffersize.rawAddress.toCPointer<ByteVar>())

public actual fun tdhEnumerateProvidersForDecodingSource(filter: DecodingSource, buffer: MutPtr<ProviderEnumerationInfo>, buffersize: UInt, bufferrequired: MutPtr<UInt>): UInt =
    windowssysWindowsWin32SystemDiagnosticsEtwTdhEnumerateProvidersForDecodingSource(filter, buffer.rawAddress.toCPointer<ByteVar>(), buffersize, bufferrequired.rawAddress.toCPointer<ByteVar>())

public actual fun tdhFormatProperty(eventinfo: ConstPtr<TraceEventInfo>, mapinfo: ConstPtr<EventMapInfo>, pointersize: UInt, propertyintype: UShort, propertyouttype: UShort, propertylength: UShort, userdatalength: UShort, userdata: ConstPtr<UByte>, buffersize: MutPtr<UInt>, buffer: Pwstr, userdataconsumed: MutPtr<UShort>): UInt =
    windowssysWindowsWin32SystemDiagnosticsEtwTdhFormatProperty(eventinfo.rawAddress.toCPointer<ByteVar>(), mapinfo.rawAddress.toCPointer<ByteVar>(), pointersize, propertyintype, propertyouttype, propertylength, userdatalength, userdata.rawAddress.toCPointer<ByteVar>(), buffersize.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>(), userdataconsumed.rawAddress.toCPointer<ByteVar>())

public actual fun tdhGetDecodingParameter(handle: TdhHandle, tdhcontext: MutPtr<TdhContext>): UInt =
    windowssysWindowsWin32SystemDiagnosticsEtwTdhGetDecodingParameter(handle, tdhcontext.rawAddress.toCPointer<ByteVar>())

public actual fun tdhGetEventInformation(event: ConstPtr<EventRecord>, tdhcontextcount: UInt, tdhcontext: ConstPtr<TdhContext>, buffer: MutPtr<TraceEventInfo>, buffersize: MutPtr<UInt>): UInt =
    windowssysWindowsWin32SystemDiagnosticsEtwTdhGetEventInformation(event.rawAddress.toCPointer<ByteVar>(), tdhcontextcount, tdhcontext.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>(), buffersize.rawAddress.toCPointer<ByteVar>())

public actual fun tdhGetEventMapInformation(pevent: ConstPtr<EventRecord>, pmapname: Pcwstr, pbuffer: MutPtr<EventMapInfo>, pbuffersize: MutPtr<UInt>): UInt =
    windowssysWindowsWin32SystemDiagnosticsEtwTdhGetEventMapInformation(pevent.rawAddress.toCPointer<ByteVar>(), pmapname.rawAddress.toCPointer<ByteVar>(), pbuffer.rawAddress.toCPointer<ByteVar>(), pbuffersize.rawAddress.toCPointer<ByteVar>())

public actual fun tdhGetManifestEventInformation(providerguid: ConstPtr<Guid>, eventdescriptor: ConstPtr<EventDescriptor>, buffer: MutPtr<TraceEventInfo>, buffersize: MutPtr<UInt>): UInt =
    windowssysWindowsWin32SystemDiagnosticsEtwTdhGetManifestEventInformation(providerguid.rawAddress.toCPointer<ByteVar>(), eventdescriptor.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>(), buffersize.rawAddress.toCPointer<ByteVar>())

public actual fun tdhGetProperty(pevent: ConstPtr<EventRecord>, tdhcontextcount: UInt, ptdhcontext: ConstPtr<TdhContext>, propertydatacount: UInt, ppropertydata: ConstPtr<PropertyDataDescriptor>, buffersize: UInt, pbuffer: MutPtr<UByte>): UInt =
    windowssysWindowsWin32SystemDiagnosticsEtwTdhGetProperty(pevent.rawAddress.toCPointer<ByteVar>(), tdhcontextcount, ptdhcontext.rawAddress.toCPointer<ByteVar>(), propertydatacount, ppropertydata.rawAddress.toCPointer<ByteVar>(), buffersize, pbuffer.rawAddress.toCPointer<ByteVar>())

public actual fun tdhGetPropertySize(pevent: ConstPtr<EventRecord>, tdhcontextcount: UInt, ptdhcontext: ConstPtr<TdhContext>, propertydatacount: UInt, ppropertydata: ConstPtr<PropertyDataDescriptor>, ppropertysize: MutPtr<UInt>): UInt =
    windowssysWindowsWin32SystemDiagnosticsEtwTdhGetPropertySize(pevent.rawAddress.toCPointer<ByteVar>(), tdhcontextcount, ptdhcontext.rawAddress.toCPointer<ByteVar>(), propertydatacount, ppropertydata.rawAddress.toCPointer<ByteVar>(), ppropertysize.rawAddress.toCPointer<ByteVar>())

public actual fun tdhGetWppMessage(handle: TdhHandle, eventrecord: ConstPtr<EventRecord>, buffersize: MutPtr<UInt>, buffer: MutPtr<UByte>): UInt =
    windowssysWindowsWin32SystemDiagnosticsEtwTdhGetWppMessage(handle, eventrecord.rawAddress.toCPointer<ByteVar>(), buffersize.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>())

public actual fun tdhGetWppProperty(handle: TdhHandle, eventrecord: ConstPtr<EventRecord>, propertyname: Pcwstr, buffersize: MutPtr<UInt>, buffer: MutPtr<UByte>): UInt =
    windowssysWindowsWin32SystemDiagnosticsEtwTdhGetWppProperty(handle, eventrecord.rawAddress.toCPointer<ByteVar>(), propertyname.rawAddress.toCPointer<ByteVar>(), buffersize.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>())

public actual fun tdhLoadManifest(manifest: Pcwstr): UInt =
    windowssysWindowsWin32SystemDiagnosticsEtwTdhLoadManifest(manifest.rawAddress.toCPointer<ByteVar>())

public actual fun tdhLoadManifestFromBinary(binarypath: Pcwstr): UInt =
    windowssysWindowsWin32SystemDiagnosticsEtwTdhLoadManifestFromBinary(binarypath.rawAddress.toCPointer<ByteVar>())

public actual fun tdhLoadManifestFromMemory(pdata: ConstPtr<CVoid>, cbdata: UInt): UInt =
    windowssysWindowsWin32SystemDiagnosticsEtwTdhLoadManifestFromMemory(pdata.rawAddress.toCPointer<ByteVar>(), cbdata)

public actual fun tdhOpenDecodingHandle(handle: MutPtr<TdhHandle>): UInt =
    windowssysWindowsWin32SystemDiagnosticsEtwTdhOpenDecodingHandle(handle.rawAddress.toCPointer<ByteVar>())

public actual fun tdhQueryProviderFieldInformation(pguid: ConstPtr<Guid>, eventfieldvalue: ULong, eventfieldtype: EventFieldType, pbuffer: MutPtr<ProviderFieldInfoarray>, pbuffersize: MutPtr<UInt>): UInt =
    windowssysWindowsWin32SystemDiagnosticsEtwTdhQueryProviderFieldInformation(pguid.rawAddress.toCPointer<ByteVar>(), eventfieldvalue, eventfieldtype, pbuffer.rawAddress.toCPointer<ByteVar>(), pbuffersize.rawAddress.toCPointer<ByteVar>())

public actual fun tdhSetDecodingParameter(handle: TdhHandle, tdhcontext: ConstPtr<TdhContext>): UInt =
    windowssysWindowsWin32SystemDiagnosticsEtwTdhSetDecodingParameter(handle, tdhcontext.rawAddress.toCPointer<ByteVar>())

public actual fun tdhUnloadManifest(manifest: Pcwstr): UInt =
    windowssysWindowsWin32SystemDiagnosticsEtwTdhUnloadManifest(manifest.rawAddress.toCPointer<ByteVar>())

public actual fun tdhUnloadManifestFromMemory(pdata: ConstPtr<CVoid>, cbdata: UInt): UInt =
    windowssysWindowsWin32SystemDiagnosticsEtwTdhUnloadManifestFromMemory(pdata.rawAddress.toCPointer<ByteVar>(), cbdata)

public actual fun traceEvent(tracehandle: ULong, eventtrace: ConstPtr<EventTraceHeader>): Win32Error =
    windowssysWindowsWin32SystemDiagnosticsEtwTraceEvent(tracehandle, eventtrace.rawAddress.toCPointer<ByteVar>())

public actual fun traceEventInstance(tracehandle: ULong, eventtrace: ConstPtr<EventInstanceHeader>, instinfo: ConstPtr<EventInstanceInfo>, parentinstinfo: ConstPtr<EventInstanceInfo>): UInt =
    windowssysWindowsWin32SystemDiagnosticsEtwTraceEventInstance(tracehandle, eventtrace.rawAddress.toCPointer<ByteVar>(), instinfo.rawAddress.toCPointer<ByteVar>(), parentinstinfo.rawAddress.toCPointer<ByteVar>())

public actual fun traceMessage(loggerhandle: ULong, messageflags: TraceMessageFlags, messageguid: ConstPtr<Guid>, messagenumber: UShort, vararg variadicArgs: Long): Win32Error =
    windowssysWindowsWin32SystemDiagnosticsEtwTraceMessage(loggerhandle, messageflags, messageguid.rawAddress.toCPointer<ByteVar>(), messagenumber, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun traceMessageVa(loggerhandle: ULong, messageflags: TraceMessageFlags, messageguid: ConstPtr<Guid>, messagenumber: UShort, messagearglist: ConstPtr<Byte>): Win32Error =
    windowssysWindowsWin32SystemDiagnosticsEtwTraceMessageVa(loggerhandle, messageflags, messageguid.rawAddress.toCPointer<ByteVar>(), messagenumber, messagearglist.rawAddress.toCPointer<ByteVar>())

public actual fun traceQueryInformation(sessionhandle: ControltraceHandle, informationclass: TraceQueryInfoClass, traceinformation: MutPtr<CVoid>, informationlength: UInt, returnlength: MutPtr<UInt>): Win32Error =
    0u

public actual fun traceSetInformation(sessionhandle: ControltraceHandle, informationclass: TraceQueryInfoClass, traceinformation: ConstPtr<CVoid>, informationlength: UInt): Win32Error =
    0u

public actual fun unregisterTraceGuids(registrationhandle: ULong): UInt =
    windowssysWindowsWin32SystemDiagnosticsEtwUnregisterTraceGuids(registrationhandle)

public actual fun updateTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: MutPtr<EventTraceProperties>): Win32Error =
    0u

public actual fun updateTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: MutPtr<EventTraceProperties>): Win32Error =
    0u
