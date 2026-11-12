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

private val windowsWin32SystemDiagnosticsEtwNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun closeTrace(tracehandle: ProcesstraceHandle): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun controlTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: MutPtr<EventTraceProperties>, controlcode: EventTraceControl): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun controlTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: MutPtr<EventTraceProperties>, controlcode: EventTraceControl): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createTraceInstanceId(reghandle: Handle, instinfo: MutPtr<EventInstanceInfo>): Win32Error =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwCreateTraceInstanceId(reghandle.rawAddress.toString(), instinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cveEventWrite(cveid: Pcwstr, additionaldetails: Pcwstr): Int =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwCveEventWrite(cveid.rawAddress.toString(), additionaldetails.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enableTrace(enable: UInt, enableflag: UInt, enablelevel: UInt, controlguid: ConstPtr<Guid>, tracehandle: ControltraceHandle): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enableTraceEx(providerid: ConstPtr<Guid>, sourceid: ConstPtr<Guid>, tracehandle: ControltraceHandle, isenabled: UInt, level: UByte, matchanykeyword: ULong, matchallkeyword: ULong, enableproperty: UInt, enablefilterdesc: ConstPtr<EventFilterDescriptor>): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enableTraceEx2(tracehandle: ControltraceHandle, providerid: ConstPtr<Guid>, controlcode: UInt, level: UByte, matchanykeyword: ULong, matchallkeyword: ULong, timeout: UInt, enableparameters: ConstPtr<EnableTraceParameters>): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumerateTraceGuids(guidpropertiesarray: MutPtr<MutPtr<TraceGuidProperties>>, propertyarraycount: UInt, guidcount: MutPtr<UInt>): Win32Error =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwEnumerateTraceGuids(guidpropertiesarray.rawAddress.toString(), propertyarraycount.toInt(), guidcount.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumerateTraceGuidsEx(tracequeryinfoclass: TraceQueryInfoClass, inbuffer: ConstPtr<CVoid>, inbuffersize: UInt, outbuffer: MutPtr<CVoid>, outbuffersize: UInt, returnlength: MutPtr<UInt>): Win32Error =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwEnumerateTraceGuidsEx(tracequeryinfoclass, inbuffer.rawAddress.toString(), inbuffersize.toInt(), outbuffer.rawAddress.toString(), outbuffersize.toInt(), returnlength.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventAccessControl(guid: ConstPtr<Guid>, operation: UInt, sid: Psid, rights: UInt, allowordeny: Boolean): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwEventAccessControl(guid.rawAddress.toString(), operation.toInt(), sid.rawAddress.toString(), rights.toInt(), allowordeny) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventAccessQuery(guid: ConstPtr<Guid>, buffer: PsecurityDescriptor, buffersize: MutPtr<UInt>): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwEventAccessQuery(guid.rawAddress.toString(), buffer.rawAddress.toString(), buffersize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventAccessRemove(guid: ConstPtr<Guid>): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwEventAccessRemove(guid.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventActivityIdControl(controlcode: UInt, activityid: MutPtr<Guid>): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwEventActivityIdControl(controlcode.toInt(), activityid.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventEnabled(reghandle: Reghandle, eventdescriptor: ConstPtr<EventDescriptor>): Boolean =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwEventEnabled(reghandle.toString(), eventdescriptor.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventProviderEnabled(reghandle: Reghandle, level: UByte, keyword: ULong): Boolean =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwEventProviderEnabled(reghandle.toString(), level.toInt(), keyword.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventRegister(providerid: ConstPtr<Guid>, enablecallback: Penablecallback, callbackcontext: ConstPtr<CVoid>, reghandle: MutPtr<Reghandle>): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwEventRegister(providerid.rawAddress.toString(), 0L.toString(), callbackcontext.rawAddress.toString(), reghandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventSetInformation(reghandle: Reghandle, informationclass: EventInfoClass, eventinformation: ConstPtr<CVoid>, informationlength: UInt): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwEventSetInformation(reghandle.toString(), informationclass, eventinformation.rawAddress.toString(), informationlength.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventUnregister(reghandle: Reghandle): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwEventUnregister(reghandle.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventWrite(reghandle: Reghandle, eventdescriptor: ConstPtr<EventDescriptor>, userdatacount: UInt, userdata: ConstPtr<EventDataDescriptor>): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwEventWrite(reghandle.toString(), eventdescriptor.rawAddress.toString(), userdatacount.toInt(), userdata.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventWriteEx(reghandle: Reghandle, eventdescriptor: ConstPtr<EventDescriptor>, filter: ULong, flags: UInt, activityid: ConstPtr<Guid>, relatedactivityid: ConstPtr<Guid>, userdatacount: UInt, userdata: ConstPtr<EventDataDescriptor>): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwEventWriteEx(reghandle.toString(), eventdescriptor.rawAddress.toString(), filter.toString(), flags.toInt(), activityid.rawAddress.toString(), relatedactivityid.rawAddress.toString(), userdatacount.toInt(), userdata.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventWriteString(reghandle: Reghandle, level: UByte, keyword: ULong, string: Pcwstr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwEventWriteString(reghandle.toString(), level.toInt(), keyword.toString(), string.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventWriteTransfer(reghandle: Reghandle, eventdescriptor: ConstPtr<EventDescriptor>, activityid: ConstPtr<Guid>, relatedactivityid: ConstPtr<Guid>, userdatacount: UInt, userdata: ConstPtr<EventDataDescriptor>): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwEventWriteTransfer(reghandle.toString(), eventdescriptor.rawAddress.toString(), activityid.rawAddress.toString(), relatedactivityid.rawAddress.toString(), userdatacount.toInt(), userdata.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flushTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: MutPtr<EventTraceProperties>): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flushTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: MutPtr<EventTraceProperties>): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTraceEnableFlags(tracehandle: ULong): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwGetTraceEnableFlags(tracehandle.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTraceEnableLevel(tracehandle: ULong): UByte =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwGetTraceEnableLevel(tracehandle.toString()) as Int).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTraceLoggerHandle(buffer: ConstPtr<CVoid>): ULong =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwGetTraceLoggerHandle(buffer.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openTraceA(logfile: MutPtr<EventTraceLogfilea>): ProcesstraceHandle =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openTraceFromBufferStream(options: ConstPtr<EtwOpenTraceOptions>, buffercompletioncallback: PetwBufferCompletionCallback, buffercompletioncontext: ConstPtr<CVoid>): ULong =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwOpenTraceFromBufferStream(options.rawAddress.toString(), 0L.toString(), buffercompletioncontext.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openTraceFromFile(logfilename: Pcwstr, options: ConstPtr<EtwOpenTraceOptions>, logfileheader: MutPtr<TraceLogfileHeader>): ULong =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwOpenTraceFromFile(logfilename.rawAddress.toString(), options.rawAddress.toString(), logfileheader.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openTraceFromRealTimeLogger(loggername: Pcwstr, options: ConstPtr<EtwOpenTraceOptions>, logfileheader: MutPtr<TraceLogfileHeader>): ULong =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwOpenTraceFromRealTimeLogger(loggername.rawAddress.toString(), options.rawAddress.toString(), logfileheader.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openTraceFromRealTimeLoggerWithAllocationOptions(loggername: Pcwstr, options: ConstPtr<EtwOpenTraceOptions>, allocationsize: ULong, memorypartitionhandle: Handle, logfileheader: MutPtr<TraceLogfileHeader>): ULong =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwOpenTraceFromRealTimeLoggerWithAllocationOptions(loggername.rawAddress.toString(), options.rawAddress.toString(), allocationsize.toString(), memorypartitionhandle.rawAddress.toString(), logfileheader.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openTraceW(logfile: MutPtr<EventTraceLogfilew>): ProcesstraceHandle =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun processTrace(handlearray: ConstPtr<ProcesstraceHandle>, handlecount: UInt, starttime: ConstPtr<Filetime>, endtime: ConstPtr<Filetime>): Win32Error =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwProcessTrace(handlearray.rawAddress.toString(), handlecount.toInt(), starttime.rawAddress.toString(), endtime.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun processTraceAddBufferToBufferStream(tracehandle: ULong, buffer: ConstPtr<EtwBufferHeader>, buffersize: UInt): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwProcessTraceAddBufferToBufferStream(tracehandle.toString(), buffer.rawAddress.toString(), buffersize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun processTraceBufferDecrementReference(buffer: ConstPtr<EtwBufferHeader>): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwProcessTraceBufferDecrementReference(buffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun processTraceBufferIncrementReference(tracehandle: ULong, buffer: ConstPtr<EtwBufferHeader>): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwProcessTraceBufferIncrementReference(tracehandle.toString(), buffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryAllTracesA(propertyarray: MutPtr<MutPtr<EventTraceProperties>>, propertyarraycount: UInt, loggercount: MutPtr<UInt>): Win32Error =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwQueryAllTracesA(propertyarray.rawAddress.toString(), propertyarraycount.toInt(), loggercount.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryAllTracesW(propertyarray: MutPtr<MutPtr<EventTraceProperties>>, propertyarraycount: UInt, loggercount: MutPtr<UInt>): Win32Error =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwQueryAllTracesW(propertyarray.rawAddress.toString(), propertyarraycount.toInt(), loggercount.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: MutPtr<EventTraceProperties>): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryTraceProcessingHandle(processinghandle: ProcesstraceHandle, informationclass: EtwProcessHandleInfoType, inbuffer: ConstPtr<CVoid>, inbuffersize: UInt, outbuffer: MutPtr<CVoid>, outbuffersize: UInt, returnlength: MutPtr<UInt>): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: MutPtr<EventTraceProperties>): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerTraceGuidsA(requestaddress: Wmidprequest, requestcontext: ConstPtr<CVoid>, controlguid: ConstPtr<Guid>, guidcount: UInt, traceguidreg: ConstPtr<TraceGuidRegistration>, mofimagepath: Pcstr, mofresourcename: Pcstr, registrationhandle: MutPtr<ULong>): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwRegisterTraceGuidsA(0L.toString(), requestcontext.rawAddress.toString(), controlguid.rawAddress.toString(), guidcount.toInt(), traceguidreg.rawAddress.toString(), mofimagepath.rawAddress.toString(), mofresourcename.rawAddress.toString(), registrationhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerTraceGuidsW(requestaddress: Wmidprequest, requestcontext: ConstPtr<CVoid>, controlguid: ConstPtr<Guid>, guidcount: UInt, traceguidreg: ConstPtr<TraceGuidRegistration>, mofimagepath: Pcwstr, mofresourcename: Pcwstr, registrationhandle: MutPtr<ULong>): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwRegisterTraceGuidsW(0L.toString(), requestcontext.rawAddress.toString(), controlguid.rawAddress.toString(), guidcount.toInt(), traceguidreg.rawAddress.toString(), mofimagepath.rawAddress.toString(), mofresourcename.rawAddress.toString(), registrationhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeTraceCallback(pguid: ConstPtr<Guid>): Win32Error =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwRemoveTraceCallback(pguid.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setTraceCallback(pguid: ConstPtr<Guid>, eventcallback: PeventCallback): Win32Error =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwSetTraceCallback(pguid.rawAddress.toString(), 0L.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun startTraceA(tracehandle: MutPtr<ControltraceHandle>, instancename: Pcstr, properties: MutPtr<EventTraceProperties>): Win32Error =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwStartTraceA(tracehandle.rawAddress.toString(), instancename.rawAddress.toString(), properties.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun startTraceW(tracehandle: MutPtr<ControltraceHandle>, instancename: Pcwstr, properties: MutPtr<EventTraceProperties>): Win32Error =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwStartTraceW(tracehandle.rawAddress.toString(), instancename.rawAddress.toString(), properties.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stopTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: MutPtr<EventTraceProperties>): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stopTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: MutPtr<EventTraceProperties>): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhAggregatePayloadFilters(payloadfiltercount: UInt, payloadfilterptrs: ConstPtr<ConstPtr<CVoid>>, eventmatchallflags: ConstPtr<Boolean>, eventfilterdescriptor: MutPtr<EventFilterDescriptor>): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwTdhAggregatePayloadFilters(payloadfiltercount.toInt(), payloadfilterptrs.rawAddress.toString(), eventmatchallflags.rawAddress.toString(), eventfilterdescriptor.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhCleanupPayloadEventFilterDescriptor(eventfilterdescriptor: MutPtr<EventFilterDescriptor>): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwTdhCleanupPayloadEventFilterDescriptor(eventfilterdescriptor.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhCloseDecodingHandle(handle: TdhHandle): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwTdhCloseDecodingHandle(handle.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhCreatePayloadFilter(providerguid: ConstPtr<Guid>, eventdescriptor: ConstPtr<EventDescriptor>, eventmatchany: Boolean, payloadpredicatecount: UInt, payloadpredicates: ConstPtr<PayloadFilterPredicate>, payloadfilter: MutPtr<MutPtr<CVoid>>): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwTdhCreatePayloadFilter(providerguid.rawAddress.toString(), eventdescriptor.rawAddress.toString(), eventmatchany, payloadpredicatecount.toInt(), payloadpredicates.rawAddress.toString(), payloadfilter.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhDeletePayloadFilter(payloadfilter: MutPtr<MutPtr<CVoid>>): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwTdhDeletePayloadFilter(payloadfilter.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhEnumerateManifestProviderEvents(providerguid: ConstPtr<Guid>, buffer: MutPtr<ProviderEventInfo>, buffersize: MutPtr<UInt>): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwTdhEnumerateManifestProviderEvents(providerguid.rawAddress.toString(), buffer.rawAddress.toString(), buffersize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhEnumerateProviderFieldInformation(pguid: ConstPtr<Guid>, eventfieldtype: EventFieldType, pbuffer: MutPtr<ProviderFieldInfoarray>, pbuffersize: MutPtr<UInt>): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwTdhEnumerateProviderFieldInformation(pguid.rawAddress.toString(), eventfieldtype, pbuffer.rawAddress.toString(), pbuffersize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhEnumerateProviderFilters(guid: ConstPtr<Guid>, tdhcontextcount: UInt, tdhcontext: ConstPtr<TdhContext>, filtercount: MutPtr<UInt>, buffer: MutPtr<MutPtr<ProviderFilterInfo>>, buffersize: MutPtr<UInt>): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwTdhEnumerateProviderFilters(guid.rawAddress.toString(), tdhcontextcount.toInt(), tdhcontext.rawAddress.toString(), filtercount.rawAddress.toString(), buffer.rawAddress.toString(), buffersize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhEnumerateProviders(pbuffer: MutPtr<ProviderEnumerationInfo>, pbuffersize: MutPtr<UInt>): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwTdhEnumerateProviders(pbuffer.rawAddress.toString(), pbuffersize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhEnumerateProvidersForDecodingSource(filter: DecodingSource, buffer: MutPtr<ProviderEnumerationInfo>, buffersize: UInt, bufferrequired: MutPtr<UInt>): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwTdhEnumerateProvidersForDecodingSource(filter, buffer.rawAddress.toString(), buffersize.toInt(), bufferrequired.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhFormatProperty(eventinfo: ConstPtr<TraceEventInfo>, mapinfo: ConstPtr<EventMapInfo>, pointersize: UInt, propertyintype: UShort, propertyouttype: UShort, propertylength: UShort, userdatalength: UShort, userdata: ConstPtr<UByte>, buffersize: MutPtr<UInt>, buffer: Pwstr, userdataconsumed: MutPtr<UShort>): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwTdhFormatProperty(eventinfo.rawAddress.toString(), mapinfo.rawAddress.toString(), pointersize.toInt(), propertyintype.toInt(), propertyouttype.toInt(), propertylength.toInt(), userdatalength.toInt(), userdata.rawAddress.toString(), buffersize.rawAddress.toString(), buffer.rawAddress.toString(), userdataconsumed.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhGetDecodingParameter(handle: TdhHandle, tdhcontext: MutPtr<TdhContext>): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwTdhGetDecodingParameter(handle.toString(), tdhcontext.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhGetEventInformation(event: ConstPtr<EventRecord>, tdhcontextcount: UInt, tdhcontext: ConstPtr<TdhContext>, buffer: MutPtr<TraceEventInfo>, buffersize: MutPtr<UInt>): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwTdhGetEventInformation(event.rawAddress.toString(), tdhcontextcount.toInt(), tdhcontext.rawAddress.toString(), buffer.rawAddress.toString(), buffersize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhGetEventMapInformation(pevent: ConstPtr<EventRecord>, pmapname: Pcwstr, pbuffer: MutPtr<EventMapInfo>, pbuffersize: MutPtr<UInt>): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwTdhGetEventMapInformation(pevent.rawAddress.toString(), pmapname.rawAddress.toString(), pbuffer.rawAddress.toString(), pbuffersize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhGetManifestEventInformation(providerguid: ConstPtr<Guid>, eventdescriptor: ConstPtr<EventDescriptor>, buffer: MutPtr<TraceEventInfo>, buffersize: MutPtr<UInt>): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwTdhGetManifestEventInformation(providerguid.rawAddress.toString(), eventdescriptor.rawAddress.toString(), buffer.rawAddress.toString(), buffersize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhGetProperty(pevent: ConstPtr<EventRecord>, tdhcontextcount: UInt, ptdhcontext: ConstPtr<TdhContext>, propertydatacount: UInt, ppropertydata: ConstPtr<PropertyDataDescriptor>, buffersize: UInt, pbuffer: MutPtr<UByte>): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwTdhGetProperty(pevent.rawAddress.toString(), tdhcontextcount.toInt(), ptdhcontext.rawAddress.toString(), propertydatacount.toInt(), ppropertydata.rawAddress.toString(), buffersize.toInt(), pbuffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhGetPropertySize(pevent: ConstPtr<EventRecord>, tdhcontextcount: UInt, ptdhcontext: ConstPtr<TdhContext>, propertydatacount: UInt, ppropertydata: ConstPtr<PropertyDataDescriptor>, ppropertysize: MutPtr<UInt>): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwTdhGetPropertySize(pevent.rawAddress.toString(), tdhcontextcount.toInt(), ptdhcontext.rawAddress.toString(), propertydatacount.toInt(), ppropertydata.rawAddress.toString(), ppropertysize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhGetWppMessage(handle: TdhHandle, eventrecord: ConstPtr<EventRecord>, buffersize: MutPtr<UInt>, buffer: MutPtr<UByte>): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwTdhGetWppMessage(handle.toString(), eventrecord.rawAddress.toString(), buffersize.rawAddress.toString(), buffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhGetWppProperty(handle: TdhHandle, eventrecord: ConstPtr<EventRecord>, propertyname: Pcwstr, buffersize: MutPtr<UInt>, buffer: MutPtr<UByte>): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwTdhGetWppProperty(handle.toString(), eventrecord.rawAddress.toString(), propertyname.rawAddress.toString(), buffersize.rawAddress.toString(), buffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhLoadManifest(manifest: Pcwstr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwTdhLoadManifest(manifest.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhLoadManifestFromBinary(binarypath: Pcwstr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwTdhLoadManifestFromBinary(binarypath.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhLoadManifestFromMemory(pdata: ConstPtr<CVoid>, cbdata: UInt): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwTdhLoadManifestFromMemory(pdata.rawAddress.toString(), cbdata.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhOpenDecodingHandle(handle: MutPtr<TdhHandle>): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwTdhOpenDecodingHandle(handle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhQueryProviderFieldInformation(pguid: ConstPtr<Guid>, eventfieldvalue: ULong, eventfieldtype: EventFieldType, pbuffer: MutPtr<ProviderFieldInfoarray>, pbuffersize: MutPtr<UInt>): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwTdhQueryProviderFieldInformation(pguid.rawAddress.toString(), eventfieldvalue.toString(), eventfieldtype, pbuffer.rawAddress.toString(), pbuffersize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhSetDecodingParameter(handle: TdhHandle, tdhcontext: ConstPtr<TdhContext>): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwTdhSetDecodingParameter(handle.toString(), tdhcontext.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhUnloadManifest(manifest: Pcwstr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwTdhUnloadManifest(manifest.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhUnloadManifestFromMemory(pdata: ConstPtr<CVoid>, cbdata: UInt): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwTdhUnloadManifestFromMemory(pdata.rawAddress.toString(), cbdata.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun traceEvent(tracehandle: ULong, eventtrace: ConstPtr<EventTraceHeader>): Win32Error =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwTraceEvent(tracehandle.toString(), eventtrace.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun traceEventInstance(tracehandle: ULong, eventtrace: ConstPtr<EventInstanceHeader>, instinfo: ConstPtr<EventInstanceInfo>, parentinstinfo: ConstPtr<EventInstanceInfo>): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwTraceEventInstance(tracehandle.toString(), eventtrace.rawAddress.toString(), instinfo.rawAddress.toString(), parentinstinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun traceMessage(loggerhandle: ULong, messageflags: TraceMessageFlags, messageguid: ConstPtr<Guid>, messagenumber: UShort, vararg variadicArgs: Long): Win32Error =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwTraceMessage(loggerhandle.toString(), messageflags.toInt(), messageguid.rawAddress.toString(), messagenumber.toInt(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun traceMessageVa(loggerhandle: ULong, messageflags: TraceMessageFlags, messageguid: ConstPtr<Guid>, messagenumber: UShort, messagearglist: ConstPtr<Byte>): Win32Error =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwTraceMessageVa(loggerhandle.toString(), messageflags.toInt(), messageguid.rawAddress.toString(), messagenumber.toInt(), messagearglist.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun traceQueryInformation(sessionhandle: ControltraceHandle, informationclass: TraceQueryInfoClass, traceinformation: MutPtr<CVoid>, informationlength: UInt, returnlength: MutPtr<UInt>): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun traceSetInformation(sessionhandle: ControltraceHandle, informationclass: TraceQueryInfoClass, traceinformation: ConstPtr<CVoid>, informationlength: UInt): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unregisterTraceGuids(registrationhandle: ULong): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwUnregisterTraceGuids(registrationhandle.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updateTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: MutPtr<EventTraceProperties>): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updateTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: MutPtr<EventTraceProperties>): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")
