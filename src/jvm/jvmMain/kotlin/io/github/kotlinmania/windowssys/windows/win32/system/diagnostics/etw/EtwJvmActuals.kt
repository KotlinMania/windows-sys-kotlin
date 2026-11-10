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

private object WindowsWin32SystemDiagnosticsEtwJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_createTraceInstanceId(reghandle: Long, instinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_cveEventWrite(cveid: Long, additionaldetails: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_enumerateTraceGuids(guidpropertiesarray: Long, propertyarraycount: Int, guidcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_enumerateTraceGuidsEx(tracequeryinfoclass: Int, inbuffer: Long, inbuffersize: Int, outbuffer: Long, outbuffersize: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_eventAccessControl(guid: Long, operation: Int, sid: Long, rights: Int, allowordeny: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_eventAccessQuery(guid: Long, buffer: Long, buffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_eventAccessRemove(guid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_eventActivityIdControl(controlcode: Int, activityid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_eventEnabled(reghandle: Long, eventdescriptor: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_eventProviderEnabled(reghandle: Long, level: Byte, keyword: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_eventRegister(providerid: Long, enablecallback: Long, callbackcontext: Long, reghandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_eventSetInformation(reghandle: Long, informationclass: Int, eventinformation: Long, informationlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_eventUnregister(reghandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_eventWrite(reghandle: Long, eventdescriptor: Long, userdatacount: Int, userdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_eventWriteEx(reghandle: Long, eventdescriptor: Long, filter: Long, flags: Int, activityid: Long, relatedactivityid: Long, userdatacount: Int, userdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_eventWriteString(reghandle: Long, level: Byte, keyword: Long, string: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_eventWriteTransfer(reghandle: Long, eventdescriptor: Long, activityid: Long, relatedactivityid: Long, userdatacount: Int, userdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_getTraceEnableFlags(tracehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_getTraceEnableLevel(tracehandle: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_getTraceLoggerHandle(buffer: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_openTraceFromBufferStream(options: Long, buffercompletioncallback: Long, buffercompletioncontext: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_openTraceFromFile(logfilename: Long, options: Long, logfileheader: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_openTraceFromRealTimeLogger(loggername: Long, options: Long, logfileheader: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_openTraceFromRealTimeLoggerWithAllocationOptions(loggername: Long, options: Long, allocationsize: Long, memorypartitionhandle: Long, logfileheader: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_processTrace(handlearray: Long, handlecount: Int, starttime: Long, endtime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_processTraceAddBufferToBufferStream(tracehandle: Long, buffer: Long, buffersize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_processTraceBufferDecrementReference(buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_processTraceBufferIncrementReference(tracehandle: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_queryAllTracesA(propertyarray: Long, propertyarraycount: Int, loggercount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_queryAllTracesW(propertyarray: Long, propertyarraycount: Int, loggercount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_registerTraceGuidsA(requestaddress: Long, requestcontext: Long, controlguid: Long, guidcount: Int, traceguidreg: Long, mofimagepath: Long, mofresourcename: Long, registrationhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_registerTraceGuidsW(requestaddress: Long, requestcontext: Long, controlguid: Long, guidcount: Int, traceguidreg: Long, mofimagepath: Long, mofresourcename: Long, registrationhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_removeTraceCallback(pguid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_setTraceCallback(pguid: Long, eventcallback: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_startTraceA(tracehandle: Long, instancename: Long, properties: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_startTraceW(tracehandle: Long, instancename: Long, properties: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_tdhAggregatePayloadFilters(payloadfiltercount: Int, payloadfilterptrs: Long, eventmatchallflags: Long, eventfilterdescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_tdhCleanupPayloadEventFilterDescriptor(eventfilterdescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_tdhCloseDecodingHandle(handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_tdhCreatePayloadFilter(providerguid: Long, eventdescriptor: Long, eventmatchany: Boolean, payloadpredicatecount: Int, payloadpredicates: Long, payloadfilter: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_tdhDeletePayloadFilter(payloadfilter: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_tdhEnumerateManifestProviderEvents(providerguid: Long, buffer: Long, buffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_tdhEnumerateProviderFieldInformation(pguid: Long, eventfieldtype: Int, pbuffer: Long, pbuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_tdhEnumerateProviderFilters(guid: Long, tdhcontextcount: Int, tdhcontext: Long, filtercount: Long, buffer: Long, buffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_tdhEnumerateProviders(pbuffer: Long, pbuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_tdhEnumerateProvidersForDecodingSource(filter: Int, buffer: Long, buffersize: Int, bufferrequired: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_tdhFormatProperty(eventinfo: Long, mapinfo: Long, pointersize: Int, propertyintype: Short, propertyouttype: Short, propertylength: Short, userdatalength: Short, userdata: Long, buffersize: Long, buffer: Long, userdataconsumed: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_tdhGetDecodingParameter(handle: Long, tdhcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_tdhGetEventInformation(event: Long, tdhcontextcount: Int, tdhcontext: Long, buffer: Long, buffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_tdhGetEventMapInformation(pevent: Long, pmapname: Long, pbuffer: Long, pbuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_tdhGetManifestEventInformation(providerguid: Long, eventdescriptor: Long, buffer: Long, buffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_tdhGetProperty(pevent: Long, tdhcontextcount: Int, ptdhcontext: Long, propertydatacount: Int, ppropertydata: Long, buffersize: Int, pbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_tdhGetPropertySize(pevent: Long, tdhcontextcount: Int, ptdhcontext: Long, propertydatacount: Int, ppropertydata: Long, ppropertysize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_tdhGetWppMessage(handle: Long, eventrecord: Long, buffersize: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_tdhGetWppProperty(handle: Long, eventrecord: Long, propertyname: Long, buffersize: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_tdhLoadManifest(manifest: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_tdhLoadManifestFromBinary(binarypath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_tdhLoadManifestFromMemory(pdata: Long, cbdata: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_tdhOpenDecodingHandle(handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_tdhQueryProviderFieldInformation(pguid: Long, eventfieldvalue: Long, eventfieldtype: Int, pbuffer: Long, pbuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_tdhSetDecodingParameter(handle: Long, tdhcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_tdhUnloadManifest(manifest: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_tdhUnloadManifestFromMemory(pdata: Long, cbdata: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_traceEvent(tracehandle: Long, eventtrace: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_traceEventInstance(tracehandle: Long, eventtrace: Long, instinfo: Long, parentinstinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_traceMessage(loggerhandle: Long, messageflags: Int, messageguid: Long, messagenumber: Short, km_vac: Int, km_va0: Long, km_va1: Long, km_va2: Long, km_va3: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_traceMessageVa(loggerhandle: Long, messageflags: Int, messageguid: Long, messagenumber: Short, messagearglist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_etw_unregisterTraceGuids(registrationhandle: Long): Int
}

public actual fun closeTrace(tracehandle: ProcesstraceHandle): Win32Error =
    0u

public actual fun controlTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: COpaquePointer?, controlcode: EventTraceControl): Win32Error =
    0u

public actual fun controlTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: COpaquePointer?, controlcode: EventTraceControl): Win32Error =
    0u

public actual fun createTraceInstanceId(reghandle: Handle, instinfo: COpaquePointer?): Win32Error =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_createTraceInstanceId((reghandle?.value ?: 0L), (instinfo?.value ?: 0L)).toUInt()

public actual fun cveEventWrite(cveid: Pcwstr, additionaldetails: Pcwstr): Int =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_cveEventWrite((cveid?.value ?: 0L), (additionaldetails?.value ?: 0L))

public actual fun enableTrace(enable: UInt, enableflag: UInt, enablelevel: UInt, controlguid: COpaquePointer?, tracehandle: ControltraceHandle): Win32Error =
    0u

public actual fun enableTraceEx(providerid: COpaquePointer?, sourceid: COpaquePointer?, tracehandle: ControltraceHandle, isenabled: UInt, level: UByte, matchanykeyword: ULong, matchallkeyword: ULong, enableproperty: UInt, enablefilterdesc: COpaquePointer?): Win32Error =
    0u

public actual fun enableTraceEx2(tracehandle: ControltraceHandle, providerid: COpaquePointer?, controlcode: UInt, level: UByte, matchanykeyword: ULong, matchallkeyword: ULong, timeout: UInt, enableparameters: COpaquePointer?): Win32Error =
    0u

public actual fun enumerateTraceGuids(guidpropertiesarray: COpaquePointer?, propertyarraycount: UInt, guidcount: COpaquePointer?): Win32Error =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_enumerateTraceGuids((guidpropertiesarray?.value ?: 0L), propertyarraycount.toInt(), (guidcount?.value ?: 0L)).toUInt()

public actual fun enumerateTraceGuidsEx(tracequeryinfoclass: TraceQueryInfoClass, inbuffer: COpaquePointer?, inbuffersize: UInt, outbuffer: COpaquePointer?, outbuffersize: UInt, returnlength: COpaquePointer?): Win32Error =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_enumerateTraceGuidsEx(tracequeryinfoclass, (inbuffer?.value ?: 0L), inbuffersize.toInt(), (outbuffer?.value ?: 0L), outbuffersize.toInt(), (returnlength?.value ?: 0L)).toUInt()

public actual fun eventAccessControl(guid: COpaquePointer?, operation: UInt, sid: Psid, rights: UInt, allowordeny: Boolean): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_eventAccessControl((guid?.value ?: 0L), operation.toInt(), (sid?.value ?: 0L), rights.toInt(), allowordeny).toUInt()

public actual fun eventAccessQuery(guid: COpaquePointer?, buffer: PsecurityDescriptor, buffersize: COpaquePointer?): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_eventAccessQuery((guid?.value ?: 0L), (buffer?.value ?: 0L), (buffersize?.value ?: 0L)).toUInt()

public actual fun eventAccessRemove(guid: COpaquePointer?): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_eventAccessRemove((guid?.value ?: 0L)).toUInt()

public actual fun eventActivityIdControl(controlcode: UInt, activityid: COpaquePointer?): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_eventActivityIdControl(controlcode.toInt(), (activityid?.value ?: 0L)).toUInt()

public actual fun eventEnabled(reghandle: Reghandle, eventdescriptor: COpaquePointer?): Boolean =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_eventEnabled(reghandle, (eventdescriptor?.value ?: 0L))

public actual fun eventProviderEnabled(reghandle: Reghandle, level: UByte, keyword: ULong): Boolean =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_eventProviderEnabled(reghandle, level.toByte(), keyword.toLong())

public actual fun eventRegister(providerid: COpaquePointer?, enablecallback: Penablecallback, callbackcontext: COpaquePointer?, reghandle: COpaquePointer?): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_eventRegister((providerid?.value ?: 0L), 0L, (callbackcontext?.value ?: 0L), (reghandle?.value ?: 0L)).toUInt()

public actual fun eventSetInformation(reghandle: Reghandle, informationclass: EventInfoClass, eventinformation: COpaquePointer?, informationlength: UInt): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_eventSetInformation(reghandle, informationclass, (eventinformation?.value ?: 0L), informationlength.toInt()).toUInt()

public actual fun eventUnregister(reghandle: Reghandle): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_eventUnregister(reghandle).toUInt()

public actual fun eventWrite(reghandle: Reghandle, eventdescriptor: COpaquePointer?, userdatacount: UInt, userdata: COpaquePointer?): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_eventWrite(reghandle, (eventdescriptor?.value ?: 0L), userdatacount.toInt(), (userdata?.value ?: 0L)).toUInt()

public actual fun eventWriteEx(reghandle: Reghandle, eventdescriptor: COpaquePointer?, filter: ULong, flags: UInt, activityid: COpaquePointer?, relatedactivityid: COpaquePointer?, userdatacount: UInt, userdata: COpaquePointer?): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_eventWriteEx(reghandle, (eventdescriptor?.value ?: 0L), filter.toLong(), flags.toInt(), (activityid?.value ?: 0L), (relatedactivityid?.value ?: 0L), userdatacount.toInt(), (userdata?.value ?: 0L)).toUInt()

public actual fun eventWriteString(reghandle: Reghandle, level: UByte, keyword: ULong, string: Pcwstr): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_eventWriteString(reghandle, level.toByte(), keyword.toLong(), (string?.value ?: 0L)).toUInt()

public actual fun eventWriteTransfer(reghandle: Reghandle, eventdescriptor: COpaquePointer?, activityid: COpaquePointer?, relatedactivityid: COpaquePointer?, userdatacount: UInt, userdata: COpaquePointer?): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_eventWriteTransfer(reghandle, (eventdescriptor?.value ?: 0L), (activityid?.value ?: 0L), (relatedactivityid?.value ?: 0L), userdatacount.toInt(), (userdata?.value ?: 0L)).toUInt()

public actual fun flushTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: COpaquePointer?): Win32Error =
    0u

public actual fun flushTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: COpaquePointer?): Win32Error =
    0u

public actual fun getTraceEnableFlags(tracehandle: ULong): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_getTraceEnableFlags(tracehandle.toLong()).toUInt()

public actual fun getTraceEnableLevel(tracehandle: ULong): UByte =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_getTraceEnableLevel(tracehandle.toLong()).toUByte()

public actual fun getTraceLoggerHandle(buffer: COpaquePointer?): ULong =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_getTraceLoggerHandle((buffer?.value ?: 0L)).toULong()

public actual fun openTraceA(logfile: COpaquePointer?): ProcesstraceHandle =
    ProcesstraceHandle()

public actual fun openTraceFromBufferStream(options: COpaquePointer?, buffercompletioncallback: PetwBufferCompletionCallback, buffercompletioncontext: COpaquePointer?): ULong =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_openTraceFromBufferStream((options?.value ?: 0L), 0L, (buffercompletioncontext?.value ?: 0L)).toULong()

public actual fun openTraceFromFile(logfilename: Pcwstr, options: COpaquePointer?, logfileheader: COpaquePointer?): ULong =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_openTraceFromFile((logfilename?.value ?: 0L), (options?.value ?: 0L), (logfileheader?.value ?: 0L)).toULong()

public actual fun openTraceFromRealTimeLogger(loggername: Pcwstr, options: COpaquePointer?, logfileheader: COpaquePointer?): ULong =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_openTraceFromRealTimeLogger((loggername?.value ?: 0L), (options?.value ?: 0L), (logfileheader?.value ?: 0L)).toULong()

public actual fun openTraceFromRealTimeLoggerWithAllocationOptions(loggername: Pcwstr, options: COpaquePointer?, allocationsize: ULong, memorypartitionhandle: Handle, logfileheader: COpaquePointer?): ULong =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_openTraceFromRealTimeLoggerWithAllocationOptions((loggername?.value ?: 0L), (options?.value ?: 0L), allocationsize.toLong(), (memorypartitionhandle?.value ?: 0L), (logfileheader?.value ?: 0L)).toULong()

public actual fun openTraceW(logfile: COpaquePointer?): ProcesstraceHandle =
    ProcesstraceHandle()

public actual fun processTrace(handlearray: COpaquePointer?, handlecount: UInt, starttime: COpaquePointer?, endtime: COpaquePointer?): Win32Error =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_processTrace((handlearray?.value ?: 0L), handlecount.toInt(), (starttime?.value ?: 0L), (endtime?.value ?: 0L)).toUInt()

public actual fun processTraceAddBufferToBufferStream(tracehandle: ULong, buffer: COpaquePointer?, buffersize: UInt): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_processTraceAddBufferToBufferStream(tracehandle.toLong(), (buffer?.value ?: 0L), buffersize.toInt()).toUInt()

public actual fun processTraceBufferDecrementReference(buffer: COpaquePointer?): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_processTraceBufferDecrementReference((buffer?.value ?: 0L)).toUInt()

public actual fun processTraceBufferIncrementReference(tracehandle: ULong, buffer: COpaquePointer?): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_processTraceBufferIncrementReference(tracehandle.toLong(), (buffer?.value ?: 0L)).toUInt()

public actual fun queryAllTracesA(propertyarray: COpaquePointer?, propertyarraycount: UInt, loggercount: COpaquePointer?): Win32Error =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_queryAllTracesA((propertyarray?.value ?: 0L), propertyarraycount.toInt(), (loggercount?.value ?: 0L)).toUInt()

public actual fun queryAllTracesW(propertyarray: COpaquePointer?, propertyarraycount: UInt, loggercount: COpaquePointer?): Win32Error =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_queryAllTracesW((propertyarray?.value ?: 0L), propertyarraycount.toInt(), (loggercount?.value ?: 0L)).toUInt()

public actual fun queryTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: COpaquePointer?): Win32Error =
    0u

public actual fun queryTraceProcessingHandle(processinghandle: ProcesstraceHandle, informationclass: EtwProcessHandleInfoType, inbuffer: COpaquePointer?, inbuffersize: UInt, outbuffer: COpaquePointer?, outbuffersize: UInt, returnlength: COpaquePointer?): Win32Error =
    0u

public actual fun queryTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: COpaquePointer?): Win32Error =
    0u

public actual fun registerTraceGuidsA(requestaddress: Wmidprequest, requestcontext: COpaquePointer?, controlguid: COpaquePointer?, guidcount: UInt, traceguidreg: COpaquePointer?, mofimagepath: Pcstr, mofresourcename: Pcstr, registrationhandle: COpaquePointer?): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_registerTraceGuidsA(0L, (requestcontext?.value ?: 0L), (controlguid?.value ?: 0L), guidcount.toInt(), (traceguidreg?.value ?: 0L), (mofimagepath?.value ?: 0L), (mofresourcename?.value ?: 0L), (registrationhandle?.value ?: 0L)).toUInt()

public actual fun registerTraceGuidsW(requestaddress: Wmidprequest, requestcontext: COpaquePointer?, controlguid: COpaquePointer?, guidcount: UInt, traceguidreg: COpaquePointer?, mofimagepath: Pcwstr, mofresourcename: Pcwstr, registrationhandle: COpaquePointer?): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_registerTraceGuidsW(0L, (requestcontext?.value ?: 0L), (controlguid?.value ?: 0L), guidcount.toInt(), (traceguidreg?.value ?: 0L), (mofimagepath?.value ?: 0L), (mofresourcename?.value ?: 0L), (registrationhandle?.value ?: 0L)).toUInt()

public actual fun removeTraceCallback(pguid: COpaquePointer?): Win32Error =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_removeTraceCallback((pguid?.value ?: 0L)).toUInt()

public actual fun setTraceCallback(pguid: COpaquePointer?, eventcallback: PeventCallback): Win32Error =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_setTraceCallback((pguid?.value ?: 0L), 0L).toUInt()

public actual fun startTraceA(tracehandle: COpaquePointer?, instancename: Pcstr, properties: COpaquePointer?): Win32Error =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_startTraceA((tracehandle?.value ?: 0L), (instancename?.value ?: 0L), (properties?.value ?: 0L)).toUInt()

public actual fun startTraceW(tracehandle: COpaquePointer?, instancename: Pcwstr, properties: COpaquePointer?): Win32Error =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_startTraceW((tracehandle?.value ?: 0L), (instancename?.value ?: 0L), (properties?.value ?: 0L)).toUInt()

public actual fun stopTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: COpaquePointer?): Win32Error =
    0u

public actual fun stopTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: COpaquePointer?): Win32Error =
    0u

public actual fun tdhAggregatePayloadFilters(payloadfiltercount: UInt, payloadfilterptrs: COpaquePointer?, eventmatchallflags: COpaquePointer?, eventfilterdescriptor: COpaquePointer?): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_tdhAggregatePayloadFilters(payloadfiltercount.toInt(), (payloadfilterptrs?.value ?: 0L), (eventmatchallflags?.value ?: 0L), (eventfilterdescriptor?.value ?: 0L)).toUInt()

public actual fun tdhCleanupPayloadEventFilterDescriptor(eventfilterdescriptor: COpaquePointer?): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_tdhCleanupPayloadEventFilterDescriptor((eventfilterdescriptor?.value ?: 0L)).toUInt()

public actual fun tdhCloseDecodingHandle(handle: TdhHandle): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_tdhCloseDecodingHandle(handle.toLong()).toUInt()

public actual fun tdhCreatePayloadFilter(providerguid: COpaquePointer?, eventdescriptor: COpaquePointer?, eventmatchany: Boolean, payloadpredicatecount: UInt, payloadpredicates: COpaquePointer?, payloadfilter: COpaquePointer?): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_tdhCreatePayloadFilter((providerguid?.value ?: 0L), (eventdescriptor?.value ?: 0L), eventmatchany, payloadpredicatecount.toInt(), (payloadpredicates?.value ?: 0L), (payloadfilter?.value ?: 0L)).toUInt()

public actual fun tdhDeletePayloadFilter(payloadfilter: COpaquePointer?): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_tdhDeletePayloadFilter((payloadfilter?.value ?: 0L)).toUInt()

public actual fun tdhEnumerateManifestProviderEvents(providerguid: COpaquePointer?, buffer: COpaquePointer?, buffersize: COpaquePointer?): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_tdhEnumerateManifestProviderEvents((providerguid?.value ?: 0L), (buffer?.value ?: 0L), (buffersize?.value ?: 0L)).toUInt()

public actual fun tdhEnumerateProviderFieldInformation(pguid: COpaquePointer?, eventfieldtype: EventFieldType, pbuffer: COpaquePointer?, pbuffersize: COpaquePointer?): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_tdhEnumerateProviderFieldInformation((pguid?.value ?: 0L), eventfieldtype, (pbuffer?.value ?: 0L), (pbuffersize?.value ?: 0L)).toUInt()

public actual fun tdhEnumerateProviderFilters(guid: COpaquePointer?, tdhcontextcount: UInt, tdhcontext: COpaquePointer?, filtercount: COpaquePointer?, buffer: COpaquePointer?, buffersize: COpaquePointer?): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_tdhEnumerateProviderFilters((guid?.value ?: 0L), tdhcontextcount.toInt(), (tdhcontext?.value ?: 0L), (filtercount?.value ?: 0L), (buffer?.value ?: 0L), (buffersize?.value ?: 0L)).toUInt()

public actual fun tdhEnumerateProviders(pbuffer: COpaquePointer?, pbuffersize: COpaquePointer?): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_tdhEnumerateProviders((pbuffer?.value ?: 0L), (pbuffersize?.value ?: 0L)).toUInt()

public actual fun tdhEnumerateProvidersForDecodingSource(filter: DecodingSource, buffer: COpaquePointer?, buffersize: UInt, bufferrequired: COpaquePointer?): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_tdhEnumerateProvidersForDecodingSource(filter, (buffer?.value ?: 0L), buffersize.toInt(), (bufferrequired?.value ?: 0L)).toUInt()

public actual fun tdhFormatProperty(eventinfo: COpaquePointer?, mapinfo: COpaquePointer?, pointersize: UInt, propertyintype: UShort, propertyouttype: UShort, propertylength: UShort, userdatalength: UShort, userdata: COpaquePointer?, buffersize: COpaquePointer?, buffer: Pwstr, userdataconsumed: COpaquePointer?): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_tdhFormatProperty((eventinfo?.value ?: 0L), (mapinfo?.value ?: 0L), pointersize.toInt(), propertyintype.toShort(), propertyouttype.toShort(), propertylength.toShort(), userdatalength.toShort(), (userdata?.value ?: 0L), (buffersize?.value ?: 0L), (buffer?.value ?: 0L), (userdataconsumed?.value ?: 0L)).toUInt()

public actual fun tdhGetDecodingParameter(handle: TdhHandle, tdhcontext: COpaquePointer?): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_tdhGetDecodingParameter(handle.toLong(), (tdhcontext?.value ?: 0L)).toUInt()

public actual fun tdhGetEventInformation(event: COpaquePointer?, tdhcontextcount: UInt, tdhcontext: COpaquePointer?, buffer: COpaquePointer?, buffersize: COpaquePointer?): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_tdhGetEventInformation((event?.value ?: 0L), tdhcontextcount.toInt(), (tdhcontext?.value ?: 0L), (buffer?.value ?: 0L), (buffersize?.value ?: 0L)).toUInt()

public actual fun tdhGetEventMapInformation(pevent: COpaquePointer?, pmapname: Pcwstr, pbuffer: COpaquePointer?, pbuffersize: COpaquePointer?): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_tdhGetEventMapInformation((pevent?.value ?: 0L), (pmapname?.value ?: 0L), (pbuffer?.value ?: 0L), (pbuffersize?.value ?: 0L)).toUInt()

public actual fun tdhGetManifestEventInformation(providerguid: COpaquePointer?, eventdescriptor: COpaquePointer?, buffer: COpaquePointer?, buffersize: COpaquePointer?): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_tdhGetManifestEventInformation((providerguid?.value ?: 0L), (eventdescriptor?.value ?: 0L), (buffer?.value ?: 0L), (buffersize?.value ?: 0L)).toUInt()

public actual fun tdhGetProperty(pevent: COpaquePointer?, tdhcontextcount: UInt, ptdhcontext: COpaquePointer?, propertydatacount: UInt, ppropertydata: COpaquePointer?, buffersize: UInt, pbuffer: COpaquePointer?): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_tdhGetProperty((pevent?.value ?: 0L), tdhcontextcount.toInt(), (ptdhcontext?.value ?: 0L), propertydatacount.toInt(), (ppropertydata?.value ?: 0L), buffersize.toInt(), (pbuffer?.value ?: 0L)).toUInt()

public actual fun tdhGetPropertySize(pevent: COpaquePointer?, tdhcontextcount: UInt, ptdhcontext: COpaquePointer?, propertydatacount: UInt, ppropertydata: COpaquePointer?, ppropertysize: COpaquePointer?): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_tdhGetPropertySize((pevent?.value ?: 0L), tdhcontextcount.toInt(), (ptdhcontext?.value ?: 0L), propertydatacount.toInt(), (ppropertydata?.value ?: 0L), (ppropertysize?.value ?: 0L)).toUInt()

public actual fun tdhGetWppMessage(handle: TdhHandle, eventrecord: COpaquePointer?, buffersize: COpaquePointer?, buffer: COpaquePointer?): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_tdhGetWppMessage(handle.toLong(), (eventrecord?.value ?: 0L), (buffersize?.value ?: 0L), (buffer?.value ?: 0L)).toUInt()

public actual fun tdhGetWppProperty(handle: TdhHandle, eventrecord: COpaquePointer?, propertyname: Pcwstr, buffersize: COpaquePointer?, buffer: COpaquePointer?): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_tdhGetWppProperty(handle.toLong(), (eventrecord?.value ?: 0L), (propertyname?.value ?: 0L), (buffersize?.value ?: 0L), (buffer?.value ?: 0L)).toUInt()

public actual fun tdhLoadManifest(manifest: Pcwstr): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_tdhLoadManifest((manifest?.value ?: 0L)).toUInt()

public actual fun tdhLoadManifestFromBinary(binarypath: Pcwstr): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_tdhLoadManifestFromBinary((binarypath?.value ?: 0L)).toUInt()

public actual fun tdhLoadManifestFromMemory(pdata: COpaquePointer?, cbdata: UInt): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_tdhLoadManifestFromMemory((pdata?.value ?: 0L), cbdata.toInt()).toUInt()

public actual fun tdhOpenDecodingHandle(handle: COpaquePointer?): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_tdhOpenDecodingHandle((handle?.value ?: 0L)).toUInt()

public actual fun tdhQueryProviderFieldInformation(pguid: COpaquePointer?, eventfieldvalue: ULong, eventfieldtype: EventFieldType, pbuffer: COpaquePointer?, pbuffersize: COpaquePointer?): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_tdhQueryProviderFieldInformation((pguid?.value ?: 0L), eventfieldvalue.toLong(), eventfieldtype, (pbuffer?.value ?: 0L), (pbuffersize?.value ?: 0L)).toUInt()

public actual fun tdhSetDecodingParameter(handle: TdhHandle, tdhcontext: COpaquePointer?): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_tdhSetDecodingParameter(handle.toLong(), (tdhcontext?.value ?: 0L)).toUInt()

public actual fun tdhUnloadManifest(manifest: Pcwstr): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_tdhUnloadManifest((manifest?.value ?: 0L)).toUInt()

public actual fun tdhUnloadManifestFromMemory(pdata: COpaquePointer?, cbdata: UInt): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_tdhUnloadManifestFromMemory((pdata?.value ?: 0L), cbdata.toInt()).toUInt()

public actual fun traceEvent(tracehandle: ULong, eventtrace: COpaquePointer?): Win32Error =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_traceEvent(tracehandle.toLong(), (eventtrace?.value ?: 0L)).toUInt()

public actual fun traceEventInstance(tracehandle: ULong, eventtrace: COpaquePointer?, instinfo: COpaquePointer?, parentinstinfo: COpaquePointer?): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_traceEventInstance(tracehandle.toLong(), (eventtrace?.value ?: 0L), (instinfo?.value ?: 0L), (parentinstinfo?.value ?: 0L)).toUInt()

public actual fun traceMessage(loggerhandle: ULong, messageflags: TraceMessageFlags, messageguid: COpaquePointer?, messagenumber: UShort, vararg variadicArgs: Long): Win32Error =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_traceMessage(loggerhandle.toLong(), messageflags.toInt(), (messageguid?.value ?: 0L), messagenumber.toShort(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L).toUInt()

public actual fun traceMessageVa(loggerhandle: ULong, messageflags: TraceMessageFlags, messageguid: COpaquePointer?, messagenumber: UShort, messagearglist: COpaquePointer?): Win32Error =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_traceMessageVa(loggerhandle.toLong(), messageflags.toInt(), (messageguid?.value ?: 0L), messagenumber.toShort(), (messagearglist?.value ?: 0L)).toUInt()

public actual fun traceQueryInformation(sessionhandle: ControltraceHandle, informationclass: TraceQueryInfoClass, traceinformation: COpaquePointer?, informationlength: UInt, returnlength: COpaquePointer?): Win32Error =
    0u

public actual fun traceSetInformation(sessionhandle: ControltraceHandle, informationclass: TraceQueryInfoClass, traceinformation: COpaquePointer?, informationlength: UInt): Win32Error =
    0u

public actual fun unregisterTraceGuids(registrationhandle: ULong): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssys_windows_win32_system_diagnostics_etw_unregisterTraceGuids(registrationhandle.toLong()).toUInt()

public actual fun updateTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: COpaquePointer?): Win32Error =
    0u

public actual fun updateTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: COpaquePointer?): Win32Error =
    0u
