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

private val _windowsWin32SystemDiagnosticsEtwNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun closeTrace(tracehandle: ProcesstraceHandle): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun controlTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: COpaquePointer?, controlcode: EventTraceControl): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun controlTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: COpaquePointer?, controlcode: EventTraceControl): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createTraceInstanceId(reghandle: Handle, instinfo: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_createTraceInstanceId((reghandle?.value ?: 0L).toString(), (instinfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cveEventWrite(cveid: Pcwstr, additionaldetails: Pcwstr): Int =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_cveEventWrite((cveid?.value ?: 0L).toString(), (additionaldetails?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enableTrace(enable: UInt, enableflag: UInt, enablelevel: UInt, controlguid: COpaquePointer?, tracehandle: ControltraceHandle): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enableTraceEx(providerid: COpaquePointer?, sourceid: COpaquePointer?, tracehandle: ControltraceHandle, isenabled: UInt, level: UByte, matchanykeyword: ULong, matchallkeyword: ULong, enableproperty: UInt, enablefilterdesc: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enableTraceEx2(tracehandle: ControltraceHandle, providerid: COpaquePointer?, controlcode: UInt, level: UByte, matchanykeyword: ULong, matchallkeyword: ULong, timeout: UInt, enableparameters: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumerateTraceGuids(guidpropertiesarray: COpaquePointer?, propertyarraycount: UInt, guidcount: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_enumerateTraceGuids((guidpropertiesarray?.value ?: 0L).toString(), propertyarraycount.toInt(), (guidcount?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumerateTraceGuidsEx(tracequeryinfoclass: TraceQueryInfoClass, inbuffer: COpaquePointer?, inbuffersize: UInt, outbuffer: COpaquePointer?, outbuffersize: UInt, returnlength: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_enumerateTraceGuidsEx(tracequeryinfoclass, (inbuffer?.value ?: 0L).toString(), inbuffersize.toInt(), (outbuffer?.value ?: 0L).toString(), outbuffersize.toInt(), (returnlength?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventAccessControl(guid: COpaquePointer?, operation: UInt, sid: Psid, rights: UInt, allowordeny: Boolean): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_eventAccessControl((guid?.value ?: 0L).toString(), operation.toInt(), (sid?.value ?: 0L).toString(), rights.toInt(), allowordeny) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventAccessQuery(guid: COpaquePointer?, buffer: PsecurityDescriptor, buffersize: COpaquePointer?): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_eventAccessQuery((guid?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), (buffersize?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventAccessRemove(guid: COpaquePointer?): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_eventAccessRemove((guid?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventActivityIdControl(controlcode: UInt, activityid: COpaquePointer?): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_eventActivityIdControl(controlcode.toInt(), (activityid?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventEnabled(reghandle: Reghandle, eventdescriptor: COpaquePointer?): Boolean =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_eventEnabled(reghandle.toString(), (eventdescriptor?.value ?: 0L).toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventProviderEnabled(reghandle: Reghandle, level: UByte, keyword: ULong): Boolean =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_eventProviderEnabled(reghandle.toString(), level.toInt(), keyword.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventRegister(providerid: COpaquePointer?, enablecallback: Penablecallback, callbackcontext: COpaquePointer?, reghandle: COpaquePointer?): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_eventRegister((providerid?.value ?: 0L).toString(), 0L.toString(), (callbackcontext?.value ?: 0L).toString(), (reghandle?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventSetInformation(reghandle: Reghandle, informationclass: EventInfoClass, eventinformation: COpaquePointer?, informationlength: UInt): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_eventSetInformation(reghandle.toString(), informationclass, (eventinformation?.value ?: 0L).toString(), informationlength.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventUnregister(reghandle: Reghandle): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_eventUnregister(reghandle.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventWrite(reghandle: Reghandle, eventdescriptor: COpaquePointer?, userdatacount: UInt, userdata: COpaquePointer?): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_eventWrite(reghandle.toString(), (eventdescriptor?.value ?: 0L).toString(), userdatacount.toInt(), (userdata?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventWriteEx(reghandle: Reghandle, eventdescriptor: COpaquePointer?, filter: ULong, flags: UInt, activityid: COpaquePointer?, relatedactivityid: COpaquePointer?, userdatacount: UInt, userdata: COpaquePointer?): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_eventWriteEx(reghandle.toString(), (eventdescriptor?.value ?: 0L).toString(), filter.toString(), flags.toInt(), (activityid?.value ?: 0L).toString(), (relatedactivityid?.value ?: 0L).toString(), userdatacount.toInt(), (userdata?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventWriteString(reghandle: Reghandle, level: UByte, keyword: ULong, string: Pcwstr): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_eventWriteString(reghandle.toString(), level.toInt(), keyword.toString(), (string?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventWriteTransfer(reghandle: Reghandle, eventdescriptor: COpaquePointer?, activityid: COpaquePointer?, relatedactivityid: COpaquePointer?, userdatacount: UInt, userdata: COpaquePointer?): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_eventWriteTransfer(reghandle.toString(), (eventdescriptor?.value ?: 0L).toString(), (activityid?.value ?: 0L).toString(), (relatedactivityid?.value ?: 0L).toString(), userdatacount.toInt(), (userdata?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flushTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flushTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTraceEnableFlags(tracehandle: ULong): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_getTraceEnableFlags(tracehandle.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTraceEnableLevel(tracehandle: ULong): UByte =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_getTraceEnableLevel(tracehandle.toString()) as Int).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTraceLoggerHandle(buffer: COpaquePointer?): ULong =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_getTraceLoggerHandle((buffer?.value ?: 0L).toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openTraceA(logfile: COpaquePointer?): ProcesstraceHandle =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openTraceFromBufferStream(options: COpaquePointer?, buffercompletioncallback: PetwBufferCompletionCallback, buffercompletioncontext: COpaquePointer?): ULong =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_openTraceFromBufferStream((options?.value ?: 0L).toString(), 0L.toString(), (buffercompletioncontext?.value ?: 0L).toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openTraceFromFile(logfilename: Pcwstr, options: COpaquePointer?, logfileheader: COpaquePointer?): ULong =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_openTraceFromFile((logfilename?.value ?: 0L).toString(), (options?.value ?: 0L).toString(), (logfileheader?.value ?: 0L).toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openTraceFromRealTimeLogger(loggername: Pcwstr, options: COpaquePointer?, logfileheader: COpaquePointer?): ULong =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_openTraceFromRealTimeLogger((loggername?.value ?: 0L).toString(), (options?.value ?: 0L).toString(), (logfileheader?.value ?: 0L).toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openTraceFromRealTimeLoggerWithAllocationOptions(loggername: Pcwstr, options: COpaquePointer?, allocationsize: ULong, memorypartitionhandle: Handle, logfileheader: COpaquePointer?): ULong =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_openTraceFromRealTimeLoggerWithAllocationOptions((loggername?.value ?: 0L).toString(), (options?.value ?: 0L).toString(), allocationsize.toString(), (memorypartitionhandle?.value ?: 0L).toString(), (logfileheader?.value ?: 0L).toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openTraceW(logfile: COpaquePointer?): ProcesstraceHandle =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun processTrace(handlearray: COpaquePointer?, handlecount: UInt, starttime: COpaquePointer?, endtime: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_processTrace((handlearray?.value ?: 0L).toString(), handlecount.toInt(), (starttime?.value ?: 0L).toString(), (endtime?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun processTraceAddBufferToBufferStream(tracehandle: ULong, buffer: COpaquePointer?, buffersize: UInt): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_processTraceAddBufferToBufferStream(tracehandle.toString(), (buffer?.value ?: 0L).toString(), buffersize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun processTraceBufferDecrementReference(buffer: COpaquePointer?): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_processTraceBufferDecrementReference((buffer?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun processTraceBufferIncrementReference(tracehandle: ULong, buffer: COpaquePointer?): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_processTraceBufferIncrementReference(tracehandle.toString(), (buffer?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryAllTracesA(propertyarray: COpaquePointer?, propertyarraycount: UInt, loggercount: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_queryAllTracesA((propertyarray?.value ?: 0L).toString(), propertyarraycount.toInt(), (loggercount?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryAllTracesW(propertyarray: COpaquePointer?, propertyarraycount: UInt, loggercount: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_queryAllTracesW((propertyarray?.value ?: 0L).toString(), propertyarraycount.toInt(), (loggercount?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryTraceProcessingHandle(processinghandle: ProcesstraceHandle, informationclass: EtwProcessHandleInfoType, inbuffer: COpaquePointer?, inbuffersize: UInt, outbuffer: COpaquePointer?, outbuffersize: UInt, returnlength: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerTraceGuidsA(requestaddress: Wmidprequest, requestcontext: COpaquePointer?, controlguid: COpaquePointer?, guidcount: UInt, traceguidreg: COpaquePointer?, mofimagepath: Pcstr, mofresourcename: Pcstr, registrationhandle: COpaquePointer?): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_registerTraceGuidsA(0L.toString(), (requestcontext?.value ?: 0L).toString(), (controlguid?.value ?: 0L).toString(), guidcount.toInt(), (traceguidreg?.value ?: 0L).toString(), (mofimagepath?.value ?: 0L).toString(), (mofresourcename?.value ?: 0L).toString(), (registrationhandle?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerTraceGuidsW(requestaddress: Wmidprequest, requestcontext: COpaquePointer?, controlguid: COpaquePointer?, guidcount: UInt, traceguidreg: COpaquePointer?, mofimagepath: Pcwstr, mofresourcename: Pcwstr, registrationhandle: COpaquePointer?): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_registerTraceGuidsW(0L.toString(), (requestcontext?.value ?: 0L).toString(), (controlguid?.value ?: 0L).toString(), guidcount.toInt(), (traceguidreg?.value ?: 0L).toString(), (mofimagepath?.value ?: 0L).toString(), (mofresourcename?.value ?: 0L).toString(), (registrationhandle?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeTraceCallback(pguid: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_removeTraceCallback((pguid?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setTraceCallback(pguid: COpaquePointer?, eventcallback: PeventCallback): Win32Error =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_setTraceCallback((pguid?.value ?: 0L).toString(), 0L.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun startTraceA(tracehandle: COpaquePointer?, instancename: Pcstr, properties: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_startTraceA((tracehandle?.value ?: 0L).toString(), (instancename?.value ?: 0L).toString(), (properties?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun startTraceW(tracehandle: COpaquePointer?, instancename: Pcwstr, properties: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_startTraceW((tracehandle?.value ?: 0L).toString(), (instancename?.value ?: 0L).toString(), (properties?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stopTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stopTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhAggregatePayloadFilters(payloadfiltercount: UInt, payloadfilterptrs: COpaquePointer?, eventmatchallflags: COpaquePointer?, eventfilterdescriptor: COpaquePointer?): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_tdhAggregatePayloadFilters(payloadfiltercount.toInt(), (payloadfilterptrs?.value ?: 0L).toString(), (eventmatchallflags?.value ?: 0L).toString(), (eventfilterdescriptor?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhCleanupPayloadEventFilterDescriptor(eventfilterdescriptor: COpaquePointer?): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_tdhCleanupPayloadEventFilterDescriptor((eventfilterdescriptor?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhCloseDecodingHandle(handle: TdhHandle): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_tdhCloseDecodingHandle(handle.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhCreatePayloadFilter(providerguid: COpaquePointer?, eventdescriptor: COpaquePointer?, eventmatchany: Boolean, payloadpredicatecount: UInt, payloadpredicates: COpaquePointer?, payloadfilter: COpaquePointer?): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_tdhCreatePayloadFilter((providerguid?.value ?: 0L).toString(), (eventdescriptor?.value ?: 0L).toString(), eventmatchany, payloadpredicatecount.toInt(), (payloadpredicates?.value ?: 0L).toString(), (payloadfilter?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhDeletePayloadFilter(payloadfilter: COpaquePointer?): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_tdhDeletePayloadFilter((payloadfilter?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhEnumerateManifestProviderEvents(providerguid: COpaquePointer?, buffer: COpaquePointer?, buffersize: COpaquePointer?): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_tdhEnumerateManifestProviderEvents((providerguid?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), (buffersize?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhEnumerateProviderFieldInformation(pguid: COpaquePointer?, eventfieldtype: EventFieldType, pbuffer: COpaquePointer?, pbuffersize: COpaquePointer?): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_tdhEnumerateProviderFieldInformation((pguid?.value ?: 0L).toString(), eventfieldtype, (pbuffer?.value ?: 0L).toString(), (pbuffersize?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhEnumerateProviderFilters(guid: COpaquePointer?, tdhcontextcount: UInt, tdhcontext: COpaquePointer?, filtercount: COpaquePointer?, buffer: COpaquePointer?, buffersize: COpaquePointer?): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_tdhEnumerateProviderFilters((guid?.value ?: 0L).toString(), tdhcontextcount.toInt(), (tdhcontext?.value ?: 0L).toString(), (filtercount?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), (buffersize?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhEnumerateProviders(pbuffer: COpaquePointer?, pbuffersize: COpaquePointer?): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_tdhEnumerateProviders((pbuffer?.value ?: 0L).toString(), (pbuffersize?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhEnumerateProvidersForDecodingSource(filter: DecodingSource, buffer: COpaquePointer?, buffersize: UInt, bufferrequired: COpaquePointer?): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_tdhEnumerateProvidersForDecodingSource(filter, (buffer?.value ?: 0L).toString(), buffersize.toInt(), (bufferrequired?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhFormatProperty(eventinfo: COpaquePointer?, mapinfo: COpaquePointer?, pointersize: UInt, propertyintype: UShort, propertyouttype: UShort, propertylength: UShort, userdatalength: UShort, userdata: COpaquePointer?, buffersize: COpaquePointer?, buffer: Pwstr, userdataconsumed: COpaquePointer?): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_tdhFormatProperty((eventinfo?.value ?: 0L).toString(), (mapinfo?.value ?: 0L).toString(), pointersize.toInt(), propertyintype.toInt(), propertyouttype.toInt(), propertylength.toInt(), userdatalength.toInt(), (userdata?.value ?: 0L).toString(), (buffersize?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), (userdataconsumed?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhGetDecodingParameter(handle: TdhHandle, tdhcontext: COpaquePointer?): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_tdhGetDecodingParameter(handle.toString(), (tdhcontext?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhGetEventInformation(event: COpaquePointer?, tdhcontextcount: UInt, tdhcontext: COpaquePointer?, buffer: COpaquePointer?, buffersize: COpaquePointer?): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_tdhGetEventInformation((event?.value ?: 0L).toString(), tdhcontextcount.toInt(), (tdhcontext?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), (buffersize?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhGetEventMapInformation(pevent: COpaquePointer?, pmapname: Pcwstr, pbuffer: COpaquePointer?, pbuffersize: COpaquePointer?): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_tdhGetEventMapInformation((pevent?.value ?: 0L).toString(), (pmapname?.value ?: 0L).toString(), (pbuffer?.value ?: 0L).toString(), (pbuffersize?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhGetManifestEventInformation(providerguid: COpaquePointer?, eventdescriptor: COpaquePointer?, buffer: COpaquePointer?, buffersize: COpaquePointer?): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_tdhGetManifestEventInformation((providerguid?.value ?: 0L).toString(), (eventdescriptor?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), (buffersize?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhGetProperty(pevent: COpaquePointer?, tdhcontextcount: UInt, ptdhcontext: COpaquePointer?, propertydatacount: UInt, ppropertydata: COpaquePointer?, buffersize: UInt, pbuffer: COpaquePointer?): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_tdhGetProperty((pevent?.value ?: 0L).toString(), tdhcontextcount.toInt(), (ptdhcontext?.value ?: 0L).toString(), propertydatacount.toInt(), (ppropertydata?.value ?: 0L).toString(), buffersize.toInt(), (pbuffer?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhGetPropertySize(pevent: COpaquePointer?, tdhcontextcount: UInt, ptdhcontext: COpaquePointer?, propertydatacount: UInt, ppropertydata: COpaquePointer?, ppropertysize: COpaquePointer?): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_tdhGetPropertySize((pevent?.value ?: 0L).toString(), tdhcontextcount.toInt(), (ptdhcontext?.value ?: 0L).toString(), propertydatacount.toInt(), (ppropertydata?.value ?: 0L).toString(), (ppropertysize?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhGetWppMessage(handle: TdhHandle, eventrecord: COpaquePointer?, buffersize: COpaquePointer?, buffer: COpaquePointer?): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_tdhGetWppMessage(handle.toString(), (eventrecord?.value ?: 0L).toString(), (buffersize?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhGetWppProperty(handle: TdhHandle, eventrecord: COpaquePointer?, propertyname: Pcwstr, buffersize: COpaquePointer?, buffer: COpaquePointer?): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_tdhGetWppProperty(handle.toString(), (eventrecord?.value ?: 0L).toString(), (propertyname?.value ?: 0L).toString(), (buffersize?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhLoadManifest(manifest: Pcwstr): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_tdhLoadManifest((manifest?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhLoadManifestFromBinary(binarypath: Pcwstr): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_tdhLoadManifestFromBinary((binarypath?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhLoadManifestFromMemory(pdata: COpaquePointer?, cbdata: UInt): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_tdhLoadManifestFromMemory((pdata?.value ?: 0L).toString(), cbdata.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhOpenDecodingHandle(handle: COpaquePointer?): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_tdhOpenDecodingHandle((handle?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhQueryProviderFieldInformation(pguid: COpaquePointer?, eventfieldvalue: ULong, eventfieldtype: EventFieldType, pbuffer: COpaquePointer?, pbuffersize: COpaquePointer?): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_tdhQueryProviderFieldInformation((pguid?.value ?: 0L).toString(), eventfieldvalue.toString(), eventfieldtype, (pbuffer?.value ?: 0L).toString(), (pbuffersize?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhSetDecodingParameter(handle: TdhHandle, tdhcontext: COpaquePointer?): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_tdhSetDecodingParameter(handle.toString(), (tdhcontext?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhUnloadManifest(manifest: Pcwstr): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_tdhUnloadManifest((manifest?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhUnloadManifestFromMemory(pdata: COpaquePointer?, cbdata: UInt): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_tdhUnloadManifestFromMemory((pdata?.value ?: 0L).toString(), cbdata.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun traceEvent(tracehandle: ULong, eventtrace: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_traceEvent(tracehandle.toString(), (eventtrace?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun traceEventInstance(tracehandle: ULong, eventtrace: COpaquePointer?, instinfo: COpaquePointer?, parentinstinfo: COpaquePointer?): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_traceEventInstance(tracehandle.toString(), (eventtrace?.value ?: 0L).toString(), (instinfo?.value ?: 0L).toString(), (parentinstinfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun traceMessage(loggerhandle: ULong, messageflags: TraceMessageFlags, messageguid: COpaquePointer?, messagenumber: UShort, vararg variadicArgs: Long): Win32Error =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_traceMessage(loggerhandle.toString(), messageflags.toInt(), (messageguid?.value ?: 0L).toString(), messagenumber.toInt(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun traceMessageVa(loggerhandle: ULong, messageflags: TraceMessageFlags, messageguid: COpaquePointer?, messagenumber: UShort, messagearglist: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_traceMessageVa(loggerhandle.toString(), messageflags.toInt(), (messageguid?.value ?: 0L).toString(), messagenumber.toInt(), (messagearglist?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun traceQueryInformation(sessionhandle: ControltraceHandle, informationclass: TraceQueryInfoClass, traceinformation: COpaquePointer?, informationlength: UInt, returnlength: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun traceSetInformation(sessionhandle: ControltraceHandle, informationclass: TraceQueryInfoClass, traceinformation: COpaquePointer?, informationlength: UInt): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unregisterTraceGuids(registrationhandle: ULong): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAddon != null) (_windowsWin32SystemDiagnosticsEtwNapiAddon.windowssys_windows_win32_system_diagnostics_etw_unregisterTraceGuids(registrationhandle.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updateTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updateTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")
