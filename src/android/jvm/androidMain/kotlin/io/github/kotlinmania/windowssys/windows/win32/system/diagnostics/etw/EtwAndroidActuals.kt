@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private object WindowsWin32SystemDiagnosticsEtwJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsEtwCreateTraceInstanceId(reghandle: Long, instinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsEtwCveEventWrite(cveid: Long, additionaldetails: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsEtwEnumerateTraceGuids(guidpropertiesarray: Long, propertyarraycount: Int, guidcount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsEtwEnumerateTraceGuidsEx(tracequeryinfoclass: Int, inbuffer: Long, inbuffersize: Int, outbuffer: Long, outbuffersize: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsEtwEventAccessControl(guid: Long, operation: Int, sid: Long, rights: Int, allowordeny: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsEtwEventAccessQuery(guid: Long, buffer: Long, buffersize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsEtwEventAccessRemove(guid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsEtwEventActivityIdControl(controlcode: Int, activityid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsEtwEventEnabled(reghandle: Long, eventdescriptor: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsEtwEventProviderEnabled(reghandle: Long, level: Byte, keyword: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsEtwEventRegister(providerid: Long, enablecallback: Long, callbackcontext: Long, reghandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsEtwEventSetInformation(reghandle: Long, informationclass: Int, eventinformation: Long, informationlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsEtwEventUnregister(reghandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsEtwEventWrite(reghandle: Long, eventdescriptor: Long, userdatacount: Int, userdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsEtwEventWriteEx(reghandle: Long, eventdescriptor: Long, filter: Long, flags: Int, activityid: Long, relatedactivityid: Long, userdatacount: Int, userdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsEtwEventWriteString(reghandle: Long, level: Byte, keyword: Long, string: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsEtwEventWriteTransfer(reghandle: Long, eventdescriptor: Long, activityid: Long, relatedactivityid: Long, userdatacount: Int, userdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsEtwGetTraceEnableFlags(tracehandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsEtwGetTraceEnableLevel(tracehandle: Long): Byte

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsEtwGetTraceLoggerHandle(buffer: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsEtwOpenTraceFromBufferStream(options: Long, buffercompletioncallback: Long, buffercompletioncontext: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsEtwOpenTraceFromFile(logfilename: Long, options: Long, logfileheader: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsEtwOpenTraceFromRealTimeLogger(loggername: Long, options: Long, logfileheader: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsEtwOpenTraceFromRealTimeLoggerWithAllocationOptions(loggername: Long, options: Long, allocationsize: Long, memorypartitionhandle: Long, logfileheader: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsEtwProcessTrace(handlearray: Long, handlecount: Int, starttime: Long, endtime: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsEtwProcessTraceAddBufferToBufferStream(tracehandle: Long, buffer: Long, buffersize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsEtwProcessTraceBufferDecrementReference(buffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsEtwProcessTraceBufferIncrementReference(tracehandle: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsEtwQueryAllTracesA(propertyarray: Long, propertyarraycount: Int, loggercount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsEtwQueryAllTracesW(propertyarray: Long, propertyarraycount: Int, loggercount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsEtwRegisterTraceGuidsA(requestaddress: Long, requestcontext: Long, controlguid: Long, guidcount: Int, traceguidreg: Long, mofimagepath: Long, mofresourcename: Long, registrationhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsEtwRegisterTraceGuidsW(requestaddress: Long, requestcontext: Long, controlguid: Long, guidcount: Int, traceguidreg: Long, mofimagepath: Long, mofresourcename: Long, registrationhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsEtwRemoveTraceCallback(pguid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsEtwSetTraceCallback(pguid: Long, eventcallback: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsEtwStartTraceA(tracehandle: Long, instancename: Long, properties: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsEtwStartTraceW(tracehandle: Long, instancename: Long, properties: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsEtwTdhAggregatePayloadFilters(payloadfiltercount: Int, payloadfilterptrs: Long, eventmatchallflags: Long, eventfilterdescriptor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsEtwTdhCleanupPayloadEventFilterDescriptor(eventfilterdescriptor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsEtwTdhCloseDecodingHandle(handle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsEtwTdhCreatePayloadFilter(providerguid: Long, eventdescriptor: Long, eventmatchany: Boolean, payloadpredicatecount: Int, payloadpredicates: Long, payloadfilter: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsEtwTdhDeletePayloadFilter(payloadfilter: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsEtwTdhEnumerateManifestProviderEvents(providerguid: Long, buffer: Long, buffersize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsEtwTdhEnumerateProviderFieldInformation(pguid: Long, eventfieldtype: Int, pbuffer: Long, pbuffersize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsEtwTdhEnumerateProviderFilters(guid: Long, tdhcontextcount: Int, tdhcontext: Long, filtercount: Long, buffer: Long, buffersize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsEtwTdhEnumerateProviders(pbuffer: Long, pbuffersize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsEtwTdhEnumerateProvidersForDecodingSource(filter: Int, buffer: Long, buffersize: Int, bufferrequired: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsEtwTdhFormatProperty(eventinfo: Long, mapinfo: Long, pointersize: Int, propertyintype: Short, propertyouttype: Short, propertylength: Short, userdatalength: Short, userdata: Long, buffersize: Long, buffer: Long, userdataconsumed: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsEtwTdhGetDecodingParameter(handle: Long, tdhcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsEtwTdhGetEventInformation(event: Long, tdhcontextcount: Int, tdhcontext: Long, buffer: Long, buffersize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsEtwTdhGetEventMapInformation(pevent: Long, pmapname: Long, pbuffer: Long, pbuffersize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsEtwTdhGetManifestEventInformation(providerguid: Long, eventdescriptor: Long, buffer: Long, buffersize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsEtwTdhGetProperty(pevent: Long, tdhcontextcount: Int, ptdhcontext: Long, propertydatacount: Int, ppropertydata: Long, buffersize: Int, pbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsEtwTdhGetPropertySize(pevent: Long, tdhcontextcount: Int, ptdhcontext: Long, propertydatacount: Int, ppropertydata: Long, ppropertysize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsEtwTdhGetWppMessage(handle: Long, eventrecord: Long, buffersize: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsEtwTdhGetWppProperty(handle: Long, eventrecord: Long, propertyname: Long, buffersize: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsEtwTdhLoadManifest(manifest: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsEtwTdhLoadManifestFromBinary(binarypath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsEtwTdhLoadManifestFromMemory(pdata: Long, cbdata: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsEtwTdhOpenDecodingHandle(handle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsEtwTdhQueryProviderFieldInformation(pguid: Long, eventfieldvalue: Long, eventfieldtype: Int, pbuffer: Long, pbuffersize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsEtwTdhSetDecodingParameter(handle: Long, tdhcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsEtwTdhUnloadManifest(manifest: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsEtwTdhUnloadManifestFromMemory(pdata: Long, cbdata: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsEtwTraceEvent(tracehandle: Long, eventtrace: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsEtwTraceEventInstance(tracehandle: Long, eventtrace: Long, instinfo: Long, parentinstinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsEtwTraceMessage(loggerhandle: Long, messageflags: Int, messageguid: Long, messagenumber: Short, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsEtwTraceMessageVa(loggerhandle: Long, messageflags: Int, messageguid: Long, messagenumber: Short, messagearglist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsEtwUnregisterTraceGuids(registrationhandle: Long): Int
}

public actual fun closeTrace(tracehandle: ProcesstraceHandle): Win32Error =
    0u

public actual fun controlTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: MutPtr<EventTraceProperties>, controlcode: EventTraceControl): Win32Error =
    0u

public actual fun controlTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: MutPtr<EventTraceProperties>, controlcode: EventTraceControl): Win32Error =
    0u

public actual fun createTraceInstanceId(reghandle: Handle, instinfo: MutPtr<EventInstanceInfo>): Win32Error =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwCreateTraceInstanceId(reghandle.rawAddress, instinfo.rawAddress).toUInt()

public actual fun cveEventWrite(cveid: Pcwstr, additionaldetails: Pcwstr): Int =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwCveEventWrite(cveid.rawAddress, additionaldetails.rawAddress)

public actual fun enableTrace(enable: UInt, enableflag: UInt, enablelevel: UInt, controlguid: ConstPtr<Guid>, tracehandle: ControltraceHandle): Win32Error =
    0u

public actual fun enableTraceEx(providerid: ConstPtr<Guid>, sourceid: ConstPtr<Guid>, tracehandle: ControltraceHandle, isenabled: UInt, level: UByte, matchanykeyword: ULong, matchallkeyword: ULong, enableproperty: UInt, enablefilterdesc: ConstPtr<EventFilterDescriptor>): Win32Error =
    0u

public actual fun enableTraceEx2(tracehandle: ControltraceHandle, providerid: ConstPtr<Guid>, controlcode: UInt, level: UByte, matchanykeyword: ULong, matchallkeyword: ULong, timeout: UInt, enableparameters: ConstPtr<EnableTraceParameters>): Win32Error =
    0u

public actual fun enumerateTraceGuids(guidpropertiesarray: MutPtr<MutPtr<TraceGuidProperties>>, propertyarraycount: UInt, guidcount: MutPtr<UInt>): Win32Error =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwEnumerateTraceGuids(guidpropertiesarray.rawAddress, propertyarraycount.toInt(), guidcount.rawAddress).toUInt()

public actual fun enumerateTraceGuidsEx(tracequeryinfoclass: TraceQueryInfoClass, inbuffer: ConstPtr<CVoid>, inbuffersize: UInt, outbuffer: MutPtr<CVoid>, outbuffersize: UInt, returnlength: MutPtr<UInt>): Win32Error =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwEnumerateTraceGuidsEx(tracequeryinfoclass, inbuffer.rawAddress, inbuffersize.toInt(), outbuffer.rawAddress, outbuffersize.toInt(), returnlength.rawAddress).toUInt()

public actual fun eventAccessControl(guid: ConstPtr<Guid>, operation: UInt, sid: Psid, rights: UInt, allowordeny: Boolean): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwEventAccessControl(guid.rawAddress, operation.toInt(), sid.rawAddress, rights.toInt(), allowordeny).toUInt()

public actual fun eventAccessQuery(guid: ConstPtr<Guid>, buffer: PsecurityDescriptor, buffersize: MutPtr<UInt>): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwEventAccessQuery(guid.rawAddress, buffer.rawAddress, buffersize.rawAddress).toUInt()

public actual fun eventAccessRemove(guid: ConstPtr<Guid>): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwEventAccessRemove(guid.rawAddress).toUInt()

public actual fun eventActivityIdControl(controlcode: UInt, activityid: MutPtr<Guid>): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwEventActivityIdControl(controlcode.toInt(), activityid.rawAddress).toUInt()

public actual fun eventEnabled(reghandle: Reghandle, eventdescriptor: ConstPtr<EventDescriptor>): Boolean =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwEventEnabled(reghandle, eventdescriptor.rawAddress)

public actual fun eventProviderEnabled(reghandle: Reghandle, level: UByte, keyword: ULong): Boolean =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwEventProviderEnabled(reghandle, level.toByte(), keyword.toLong())

public actual fun eventRegister(providerid: ConstPtr<Guid>, enablecallback: Penablecallback, callbackcontext: ConstPtr<CVoid>, reghandle: MutPtr<Reghandle>): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwEventRegister(providerid.rawAddress, 0L, callbackcontext.rawAddress, reghandle.rawAddress).toUInt()

public actual fun eventSetInformation(reghandle: Reghandle, informationclass: EventInfoClass, eventinformation: ConstPtr<CVoid>, informationlength: UInt): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwEventSetInformation(reghandle, informationclass, eventinformation.rawAddress, informationlength.toInt()).toUInt()

public actual fun eventUnregister(reghandle: Reghandle): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwEventUnregister(reghandle).toUInt()

public actual fun eventWrite(reghandle: Reghandle, eventdescriptor: ConstPtr<EventDescriptor>, userdatacount: UInt, userdata: ConstPtr<EventDataDescriptor>): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwEventWrite(reghandle, eventdescriptor.rawAddress, userdatacount.toInt(), userdata.rawAddress).toUInt()

public actual fun eventWriteEx(reghandle: Reghandle, eventdescriptor: ConstPtr<EventDescriptor>, filter: ULong, flags: UInt, activityid: ConstPtr<Guid>, relatedactivityid: ConstPtr<Guid>, userdatacount: UInt, userdata: ConstPtr<EventDataDescriptor>): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwEventWriteEx(reghandle, eventdescriptor.rawAddress, filter.toLong(), flags.toInt(), activityid.rawAddress, relatedactivityid.rawAddress, userdatacount.toInt(), userdata.rawAddress).toUInt()

public actual fun eventWriteString(reghandle: Reghandle, level: UByte, keyword: ULong, string: Pcwstr): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwEventWriteString(reghandle, level.toByte(), keyword.toLong(), string.rawAddress).toUInt()

public actual fun eventWriteTransfer(reghandle: Reghandle, eventdescriptor: ConstPtr<EventDescriptor>, activityid: ConstPtr<Guid>, relatedactivityid: ConstPtr<Guid>, userdatacount: UInt, userdata: ConstPtr<EventDataDescriptor>): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwEventWriteTransfer(reghandle, eventdescriptor.rawAddress, activityid.rawAddress, relatedactivityid.rawAddress, userdatacount.toInt(), userdata.rawAddress).toUInt()

public actual fun flushTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: MutPtr<EventTraceProperties>): Win32Error =
    0u

public actual fun flushTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: MutPtr<EventTraceProperties>): Win32Error =
    0u

public actual fun getTraceEnableFlags(tracehandle: ULong): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwGetTraceEnableFlags(tracehandle.toLong()).toUInt()

public actual fun getTraceEnableLevel(tracehandle: ULong): UByte =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwGetTraceEnableLevel(tracehandle.toLong()).toUByte()

public actual fun getTraceLoggerHandle(buffer: ConstPtr<CVoid>): ULong =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwGetTraceLoggerHandle(buffer.rawAddress).toULong()

public actual fun openTraceA(logfile: MutPtr<EventTraceLogfilea>): ProcesstraceHandle =
    ProcesstraceHandle()

public actual fun openTraceFromBufferStream(options: ConstPtr<EtwOpenTraceOptions>, buffercompletioncallback: PetwBufferCompletionCallback, buffercompletioncontext: ConstPtr<CVoid>): ULong =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwOpenTraceFromBufferStream(options.rawAddress, 0L, buffercompletioncontext.rawAddress).toULong()

public actual fun openTraceFromFile(logfilename: Pcwstr, options: ConstPtr<EtwOpenTraceOptions>, logfileheader: MutPtr<TraceLogfileHeader>): ULong =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwOpenTraceFromFile(logfilename.rawAddress, options.rawAddress, logfileheader.rawAddress).toULong()

public actual fun openTraceFromRealTimeLogger(loggername: Pcwstr, options: ConstPtr<EtwOpenTraceOptions>, logfileheader: MutPtr<TraceLogfileHeader>): ULong =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwOpenTraceFromRealTimeLogger(loggername.rawAddress, options.rawAddress, logfileheader.rawAddress).toULong()

public actual fun openTraceFromRealTimeLoggerWithAllocationOptions(loggername: Pcwstr, options: ConstPtr<EtwOpenTraceOptions>, allocationsize: ULong, memorypartitionhandle: Handle, logfileheader: MutPtr<TraceLogfileHeader>): ULong =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwOpenTraceFromRealTimeLoggerWithAllocationOptions(loggername.rawAddress, options.rawAddress, allocationsize.toLong(), memorypartitionhandle.rawAddress, logfileheader.rawAddress).toULong()

public actual fun openTraceW(logfile: MutPtr<EventTraceLogfilew>): ProcesstraceHandle =
    ProcesstraceHandle()

public actual fun processTrace(handlearray: ConstPtr<ProcesstraceHandle>, handlecount: UInt, starttime: ConstPtr<Filetime>, endtime: ConstPtr<Filetime>): Win32Error =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwProcessTrace(handlearray.rawAddress, handlecount.toInt(), starttime.rawAddress, endtime.rawAddress).toUInt()

public actual fun processTraceAddBufferToBufferStream(tracehandle: ULong, buffer: ConstPtr<EtwBufferHeader>, buffersize: UInt): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwProcessTraceAddBufferToBufferStream(tracehandle.toLong(), buffer.rawAddress, buffersize.toInt()).toUInt()

public actual fun processTraceBufferDecrementReference(buffer: ConstPtr<EtwBufferHeader>): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwProcessTraceBufferDecrementReference(buffer.rawAddress).toUInt()

public actual fun processTraceBufferIncrementReference(tracehandle: ULong, buffer: ConstPtr<EtwBufferHeader>): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwProcessTraceBufferIncrementReference(tracehandle.toLong(), buffer.rawAddress).toUInt()

public actual fun queryAllTracesA(propertyarray: MutPtr<MutPtr<EventTraceProperties>>, propertyarraycount: UInt, loggercount: MutPtr<UInt>): Win32Error =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwQueryAllTracesA(propertyarray.rawAddress, propertyarraycount.toInt(), loggercount.rawAddress).toUInt()

public actual fun queryAllTracesW(propertyarray: MutPtr<MutPtr<EventTraceProperties>>, propertyarraycount: UInt, loggercount: MutPtr<UInt>): Win32Error =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwQueryAllTracesW(propertyarray.rawAddress, propertyarraycount.toInt(), loggercount.rawAddress).toUInt()

public actual fun queryTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: MutPtr<EventTraceProperties>): Win32Error =
    0u

public actual fun queryTraceProcessingHandle(processinghandle: ProcesstraceHandle, informationclass: EtwProcessHandleInfoType, inbuffer: ConstPtr<CVoid>, inbuffersize: UInt, outbuffer: MutPtr<CVoid>, outbuffersize: UInt, returnlength: MutPtr<UInt>): Win32Error =
    0u

public actual fun queryTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: MutPtr<EventTraceProperties>): Win32Error =
    0u

public actual fun registerTraceGuidsA(requestaddress: Wmidprequest, requestcontext: ConstPtr<CVoid>, controlguid: ConstPtr<Guid>, guidcount: UInt, traceguidreg: ConstPtr<TraceGuidRegistration>, mofimagepath: Pcstr, mofresourcename: Pcstr, registrationhandle: MutPtr<ULong>): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwRegisterTraceGuidsA(0L, requestcontext.rawAddress, controlguid.rawAddress, guidcount.toInt(), traceguidreg.rawAddress, mofimagepath.rawAddress, mofresourcename.rawAddress, registrationhandle.rawAddress).toUInt()

public actual fun registerTraceGuidsW(requestaddress: Wmidprequest, requestcontext: ConstPtr<CVoid>, controlguid: ConstPtr<Guid>, guidcount: UInt, traceguidreg: ConstPtr<TraceGuidRegistration>, mofimagepath: Pcwstr, mofresourcename: Pcwstr, registrationhandle: MutPtr<ULong>): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwRegisterTraceGuidsW(0L, requestcontext.rawAddress, controlguid.rawAddress, guidcount.toInt(), traceguidreg.rawAddress, mofimagepath.rawAddress, mofresourcename.rawAddress, registrationhandle.rawAddress).toUInt()

public actual fun removeTraceCallback(pguid: ConstPtr<Guid>): Win32Error =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwRemoveTraceCallback(pguid.rawAddress).toUInt()

public actual fun setTraceCallback(pguid: ConstPtr<Guid>, eventcallback: PeventCallback): Win32Error =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwSetTraceCallback(pguid.rawAddress, 0L).toUInt()

public actual fun startTraceA(tracehandle: MutPtr<ControltraceHandle>, instancename: Pcstr, properties: MutPtr<EventTraceProperties>): Win32Error =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwStartTraceA(tracehandle.rawAddress, instancename.rawAddress, properties.rawAddress).toUInt()

public actual fun startTraceW(tracehandle: MutPtr<ControltraceHandle>, instancename: Pcwstr, properties: MutPtr<EventTraceProperties>): Win32Error =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwStartTraceW(tracehandle.rawAddress, instancename.rawAddress, properties.rawAddress).toUInt()

public actual fun stopTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: MutPtr<EventTraceProperties>): Win32Error =
    0u

public actual fun stopTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: MutPtr<EventTraceProperties>): Win32Error =
    0u

public actual fun tdhAggregatePayloadFilters(payloadfiltercount: UInt, payloadfilterptrs: ConstPtr<ConstPtr<CVoid>>, eventmatchallflags: ConstPtr<Boolean>, eventfilterdescriptor: MutPtr<EventFilterDescriptor>): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwTdhAggregatePayloadFilters(payloadfiltercount.toInt(), payloadfilterptrs.rawAddress, eventmatchallflags.rawAddress, eventfilterdescriptor.rawAddress).toUInt()

public actual fun tdhCleanupPayloadEventFilterDescriptor(eventfilterdescriptor: MutPtr<EventFilterDescriptor>): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwTdhCleanupPayloadEventFilterDescriptor(eventfilterdescriptor.rawAddress).toUInt()

public actual fun tdhCloseDecodingHandle(handle: TdhHandle): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwTdhCloseDecodingHandle(handle).toUInt()

public actual fun tdhCreatePayloadFilter(providerguid: ConstPtr<Guid>, eventdescriptor: ConstPtr<EventDescriptor>, eventmatchany: Boolean, payloadpredicatecount: UInt, payloadpredicates: ConstPtr<PayloadFilterPredicate>, payloadfilter: MutPtr<MutPtr<CVoid>>): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwTdhCreatePayloadFilter(providerguid.rawAddress, eventdescriptor.rawAddress, eventmatchany, payloadpredicatecount.toInt(), payloadpredicates.rawAddress, payloadfilter.rawAddress).toUInt()

public actual fun tdhDeletePayloadFilter(payloadfilter: MutPtr<MutPtr<CVoid>>): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwTdhDeletePayloadFilter(payloadfilter.rawAddress).toUInt()

public actual fun tdhEnumerateManifestProviderEvents(providerguid: ConstPtr<Guid>, buffer: MutPtr<ProviderEventInfo>, buffersize: MutPtr<UInt>): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwTdhEnumerateManifestProviderEvents(providerguid.rawAddress, buffer.rawAddress, buffersize.rawAddress).toUInt()

public actual fun tdhEnumerateProviderFieldInformation(pguid: ConstPtr<Guid>, eventfieldtype: EventFieldType, pbuffer: MutPtr<ProviderFieldInfoarray>, pbuffersize: MutPtr<UInt>): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwTdhEnumerateProviderFieldInformation(pguid.rawAddress, eventfieldtype, pbuffer.rawAddress, pbuffersize.rawAddress).toUInt()

public actual fun tdhEnumerateProviderFilters(guid: ConstPtr<Guid>, tdhcontextcount: UInt, tdhcontext: ConstPtr<TdhContext>, filtercount: MutPtr<UInt>, buffer: MutPtr<MutPtr<ProviderFilterInfo>>, buffersize: MutPtr<UInt>): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwTdhEnumerateProviderFilters(guid.rawAddress, tdhcontextcount.toInt(), tdhcontext.rawAddress, filtercount.rawAddress, buffer.rawAddress, buffersize.rawAddress).toUInt()

public actual fun tdhEnumerateProviders(pbuffer: MutPtr<ProviderEnumerationInfo>, pbuffersize: MutPtr<UInt>): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwTdhEnumerateProviders(pbuffer.rawAddress, pbuffersize.rawAddress).toUInt()

public actual fun tdhEnumerateProvidersForDecodingSource(filter: DecodingSource, buffer: MutPtr<ProviderEnumerationInfo>, buffersize: UInt, bufferrequired: MutPtr<UInt>): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwTdhEnumerateProvidersForDecodingSource(filter, buffer.rawAddress, buffersize.toInt(), bufferrequired.rawAddress).toUInt()

public actual fun tdhFormatProperty(eventinfo: ConstPtr<TraceEventInfo>, mapinfo: ConstPtr<EventMapInfo>, pointersize: UInt, propertyintype: UShort, propertyouttype: UShort, propertylength: UShort, userdatalength: UShort, userdata: ConstPtr<UByte>, buffersize: MutPtr<UInt>, buffer: Pwstr, userdataconsumed: MutPtr<UShort>): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwTdhFormatProperty(eventinfo.rawAddress, mapinfo.rawAddress, pointersize.toInt(), propertyintype.toShort(), propertyouttype.toShort(), propertylength.toShort(), userdatalength.toShort(), userdata.rawAddress, buffersize.rawAddress, buffer.rawAddress, userdataconsumed.rawAddress).toUInt()

public actual fun tdhGetDecodingParameter(handle: TdhHandle, tdhcontext: MutPtr<TdhContext>): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwTdhGetDecodingParameter(handle, tdhcontext.rawAddress).toUInt()

public actual fun tdhGetEventInformation(event: ConstPtr<EventRecord>, tdhcontextcount: UInt, tdhcontext: ConstPtr<TdhContext>, buffer: MutPtr<TraceEventInfo>, buffersize: MutPtr<UInt>): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwTdhGetEventInformation(event.rawAddress, tdhcontextcount.toInt(), tdhcontext.rawAddress, buffer.rawAddress, buffersize.rawAddress).toUInt()

public actual fun tdhGetEventMapInformation(pevent: ConstPtr<EventRecord>, pmapname: Pcwstr, pbuffer: MutPtr<EventMapInfo>, pbuffersize: MutPtr<UInt>): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwTdhGetEventMapInformation(pevent.rawAddress, pmapname.rawAddress, pbuffer.rawAddress, pbuffersize.rawAddress).toUInt()

public actual fun tdhGetManifestEventInformation(providerguid: ConstPtr<Guid>, eventdescriptor: ConstPtr<EventDescriptor>, buffer: MutPtr<TraceEventInfo>, buffersize: MutPtr<UInt>): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwTdhGetManifestEventInformation(providerguid.rawAddress, eventdescriptor.rawAddress, buffer.rawAddress, buffersize.rawAddress).toUInt()

public actual fun tdhGetProperty(pevent: ConstPtr<EventRecord>, tdhcontextcount: UInt, ptdhcontext: ConstPtr<TdhContext>, propertydatacount: UInt, ppropertydata: ConstPtr<PropertyDataDescriptor>, buffersize: UInt, pbuffer: MutPtr<UByte>): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwTdhGetProperty(pevent.rawAddress, tdhcontextcount.toInt(), ptdhcontext.rawAddress, propertydatacount.toInt(), ppropertydata.rawAddress, buffersize.toInt(), pbuffer.rawAddress).toUInt()

public actual fun tdhGetPropertySize(pevent: ConstPtr<EventRecord>, tdhcontextcount: UInt, ptdhcontext: ConstPtr<TdhContext>, propertydatacount: UInt, ppropertydata: ConstPtr<PropertyDataDescriptor>, ppropertysize: MutPtr<UInt>): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwTdhGetPropertySize(pevent.rawAddress, tdhcontextcount.toInt(), ptdhcontext.rawAddress, propertydatacount.toInt(), ppropertydata.rawAddress, ppropertysize.rawAddress).toUInt()

public actual fun tdhGetWppMessage(handle: TdhHandle, eventrecord: ConstPtr<EventRecord>, buffersize: MutPtr<UInt>, buffer: MutPtr<UByte>): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwTdhGetWppMessage(handle, eventrecord.rawAddress, buffersize.rawAddress, buffer.rawAddress).toUInt()

public actual fun tdhGetWppProperty(handle: TdhHandle, eventrecord: ConstPtr<EventRecord>, propertyname: Pcwstr, buffersize: MutPtr<UInt>, buffer: MutPtr<UByte>): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwTdhGetWppProperty(handle, eventrecord.rawAddress, propertyname.rawAddress, buffersize.rawAddress, buffer.rawAddress).toUInt()

public actual fun tdhLoadManifest(manifest: Pcwstr): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwTdhLoadManifest(manifest.rawAddress).toUInt()

public actual fun tdhLoadManifestFromBinary(binarypath: Pcwstr): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwTdhLoadManifestFromBinary(binarypath.rawAddress).toUInt()

public actual fun tdhLoadManifestFromMemory(pdata: ConstPtr<CVoid>, cbdata: UInt): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwTdhLoadManifestFromMemory(pdata.rawAddress, cbdata.toInt()).toUInt()

public actual fun tdhOpenDecodingHandle(handle: MutPtr<TdhHandle>): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwTdhOpenDecodingHandle(handle.rawAddress).toUInt()

public actual fun tdhQueryProviderFieldInformation(pguid: ConstPtr<Guid>, eventfieldvalue: ULong, eventfieldtype: EventFieldType, pbuffer: MutPtr<ProviderFieldInfoarray>, pbuffersize: MutPtr<UInt>): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwTdhQueryProviderFieldInformation(pguid.rawAddress, eventfieldvalue.toLong(), eventfieldtype, pbuffer.rawAddress, pbuffersize.rawAddress).toUInt()

public actual fun tdhSetDecodingParameter(handle: TdhHandle, tdhcontext: ConstPtr<TdhContext>): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwTdhSetDecodingParameter(handle, tdhcontext.rawAddress).toUInt()

public actual fun tdhUnloadManifest(manifest: Pcwstr): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwTdhUnloadManifest(manifest.rawAddress).toUInt()

public actual fun tdhUnloadManifestFromMemory(pdata: ConstPtr<CVoid>, cbdata: UInt): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwTdhUnloadManifestFromMemory(pdata.rawAddress, cbdata.toInt()).toUInt()

public actual fun traceEvent(tracehandle: ULong, eventtrace: ConstPtr<EventTraceHeader>): Win32Error =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwTraceEvent(tracehandle.toLong(), eventtrace.rawAddress).toUInt()

public actual fun traceEventInstance(tracehandle: ULong, eventtrace: ConstPtr<EventInstanceHeader>, instinfo: ConstPtr<EventInstanceInfo>, parentinstinfo: ConstPtr<EventInstanceInfo>): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwTraceEventInstance(tracehandle.toLong(), eventtrace.rawAddress, instinfo.rawAddress, parentinstinfo.rawAddress).toUInt()

public actual fun traceMessage(loggerhandle: ULong, messageflags: TraceMessageFlags, messageguid: ConstPtr<Guid>, messagenumber: UShort, vararg variadicArgs: Long): Win32Error =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwTraceMessage(loggerhandle.toLong(), messageflags.toInt(), messageguid.rawAddress, messagenumber.toShort(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L).toUInt()

public actual fun traceMessageVa(loggerhandle: ULong, messageflags: TraceMessageFlags, messageguid: ConstPtr<Guid>, messagenumber: UShort, messagearglist: ConstPtr<Byte>): Win32Error =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwTraceMessageVa(loggerhandle.toLong(), messageflags.toInt(), messageguid.rawAddress, messagenumber.toShort(), messagearglist.rawAddress).toUInt()

public actual fun traceQueryInformation(sessionhandle: ControltraceHandle, informationclass: TraceQueryInfoClass, traceinformation: MutPtr<CVoid>, informationlength: UInt, returnlength: MutPtr<UInt>): Win32Error =
    0u

public actual fun traceSetInformation(sessionhandle: ControltraceHandle, informationclass: TraceQueryInfoClass, traceinformation: ConstPtr<CVoid>, informationlength: UInt): Win32Error =
    0u

public actual fun unregisterTraceGuids(registrationhandle: ULong): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwUnregisterTraceGuids(registrationhandle.toLong()).toUInt()

public actual fun updateTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: MutPtr<EventTraceProperties>): Win32Error =
    0u

public actual fun updateTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: MutPtr<EventTraceProperties>): Win32Error =
    0u
