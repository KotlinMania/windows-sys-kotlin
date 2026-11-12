@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private val windowsWin32SystemDiagnosticsEtwNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun closeTrace(tracehandle: ProcesstraceHandle): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun controlTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: MutPtr, controlcode: EventTraceControl): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun controlTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: MutPtr, controlcode: EventTraceControl): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createTraceInstanceId(reghandle: Handle, instinfo: MutPtr): Win32Error =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwCreateTraceInstanceId(reghandle.rawAddress.toString(), instinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cveEventWrite(cveid: Pcwstr, additionaldetails: Pcwstr): Int =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwCveEventWrite(cveid.rawAddress.toString(), additionaldetails.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enableTrace(enable: UInt, enableflag: UInt, enablelevel: UInt, controlguid: ConstPtr, tracehandle: ControltraceHandle): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enableTraceEx(providerid: ConstPtr, sourceid: ConstPtr, tracehandle: ControltraceHandle, isenabled: UInt, level: UByte, matchanykeyword: ULong, matchallkeyword: ULong, enableproperty: UInt, enablefilterdesc: ConstPtr): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enableTraceEx2(tracehandle: ControltraceHandle, providerid: ConstPtr, controlcode: UInt, level: UByte, matchanykeyword: ULong, matchallkeyword: ULong, timeout: UInt, enableparameters: ConstPtr): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumerateTraceGuids(guidpropertiesarray: MutPtr, propertyarraycount: UInt, guidcount: MutPtr): Win32Error =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwEnumerateTraceGuids(guidpropertiesarray.rawAddress.toString(), propertyarraycount.toInt(), guidcount.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumerateTraceGuidsEx(tracequeryinfoclass: TraceQueryInfoClass, inbuffer: ConstPtr, inbuffersize: UInt, outbuffer: MutPtr, outbuffersize: UInt, returnlength: MutPtr): Win32Error =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwEnumerateTraceGuidsEx(tracequeryinfoclass, inbuffer.rawAddress.toString(), inbuffersize.toInt(), outbuffer.rawAddress.toString(), outbuffersize.toInt(), returnlength.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventAccessControl(guid: ConstPtr, operation: UInt, sid: Psid, rights: UInt, allowordeny: Boolean): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwEventAccessControl(guid.rawAddress.toString(), operation.toInt(), sid.rawAddress.toString(), rights.toInt(), allowordeny) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventAccessQuery(guid: ConstPtr, buffer: PsecurityDescriptor, buffersize: MutPtr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwEventAccessQuery(guid.rawAddress.toString(), buffer.rawAddress.toString(), buffersize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventAccessRemove(guid: ConstPtr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwEventAccessRemove(guid.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventActivityIdControl(controlcode: UInt, activityid: MutPtr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwEventActivityIdControl(controlcode.toInt(), activityid.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventEnabled(reghandle: Reghandle, eventdescriptor: ConstPtr): Boolean =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwEventEnabled(reghandle.toString(), eventdescriptor.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventProviderEnabled(reghandle: Reghandle, level: UByte, keyword: ULong): Boolean =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwEventProviderEnabled(reghandle.toString(), level.toInt(), keyword.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventRegister(providerid: ConstPtr, enablecallback: Penablecallback, callbackcontext: ConstPtr, reghandle: MutPtr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwEventRegister(providerid.rawAddress.toString(), 0L.toString(), callbackcontext.rawAddress.toString(), reghandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventSetInformation(reghandle: Reghandle, informationclass: EventInfoClass, eventinformation: ConstPtr, informationlength: UInt): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwEventSetInformation(reghandle.toString(), informationclass, eventinformation.rawAddress.toString(), informationlength.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventUnregister(reghandle: Reghandle): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwEventUnregister(reghandle.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventWrite(reghandle: Reghandle, eventdescriptor: ConstPtr, userdatacount: UInt, userdata: ConstPtr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwEventWrite(reghandle.toString(), eventdescriptor.rawAddress.toString(), userdatacount.toInt(), userdata.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventWriteEx(reghandle: Reghandle, eventdescriptor: ConstPtr, filter: ULong, flags: UInt, activityid: ConstPtr, relatedactivityid: ConstPtr, userdatacount: UInt, userdata: ConstPtr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwEventWriteEx(reghandle.toString(), eventdescriptor.rawAddress.toString(), filter.toString(), flags.toInt(), activityid.rawAddress.toString(), relatedactivityid.rawAddress.toString(), userdatacount.toInt(), userdata.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventWriteString(reghandle: Reghandle, level: UByte, keyword: ULong, string: Pcwstr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwEventWriteString(reghandle.toString(), level.toInt(), keyword.toString(), string.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventWriteTransfer(reghandle: Reghandle, eventdescriptor: ConstPtr, activityid: ConstPtr, relatedactivityid: ConstPtr, userdatacount: UInt, userdata: ConstPtr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwEventWriteTransfer(reghandle.toString(), eventdescriptor.rawAddress.toString(), activityid.rawAddress.toString(), relatedactivityid.rawAddress.toString(), userdatacount.toInt(), userdata.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flushTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: MutPtr): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flushTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: MutPtr): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTraceEnableFlags(tracehandle: ULong): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwGetTraceEnableFlags(tracehandle.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTraceEnableLevel(tracehandle: ULong): UByte =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwGetTraceEnableLevel(tracehandle.toString()) as Int).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTraceLoggerHandle(buffer: ConstPtr): ULong =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwGetTraceLoggerHandle(buffer.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openTraceA(logfile: MutPtr): ProcesstraceHandle =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openTraceFromBufferStream(options: ConstPtr, buffercompletioncallback: PetwBufferCompletionCallback, buffercompletioncontext: ConstPtr): ULong =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwOpenTraceFromBufferStream(options.rawAddress.toString(), 0L.toString(), buffercompletioncontext.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openTraceFromFile(logfilename: Pcwstr, options: ConstPtr, logfileheader: MutPtr): ULong =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwOpenTraceFromFile(logfilename.rawAddress.toString(), options.rawAddress.toString(), logfileheader.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openTraceFromRealTimeLogger(loggername: Pcwstr, options: ConstPtr, logfileheader: MutPtr): ULong =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwOpenTraceFromRealTimeLogger(loggername.rawAddress.toString(), options.rawAddress.toString(), logfileheader.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openTraceFromRealTimeLoggerWithAllocationOptions(loggername: Pcwstr, options: ConstPtr, allocationsize: ULong, memorypartitionhandle: Handle, logfileheader: MutPtr): ULong =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwOpenTraceFromRealTimeLoggerWithAllocationOptions(loggername.rawAddress.toString(), options.rawAddress.toString(), allocationsize.toString(), memorypartitionhandle.rawAddress.toString(), logfileheader.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openTraceW(logfile: MutPtr): ProcesstraceHandle =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun processTrace(handlearray: ConstPtr, handlecount: UInt, starttime: ConstPtr, endtime: ConstPtr): Win32Error =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwProcessTrace(handlearray.rawAddress.toString(), handlecount.toInt(), starttime.rawAddress.toString(), endtime.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun processTraceAddBufferToBufferStream(tracehandle: ULong, buffer: ConstPtr, buffersize: UInt): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwProcessTraceAddBufferToBufferStream(tracehandle.toString(), buffer.rawAddress.toString(), buffersize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun processTraceBufferDecrementReference(buffer: ConstPtr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwProcessTraceBufferDecrementReference(buffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun processTraceBufferIncrementReference(tracehandle: ULong, buffer: ConstPtr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwProcessTraceBufferIncrementReference(tracehandle.toString(), buffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryAllTracesA(propertyarray: MutPtr, propertyarraycount: UInt, loggercount: MutPtr): Win32Error =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwQueryAllTracesA(propertyarray.rawAddress.toString(), propertyarraycount.toInt(), loggercount.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryAllTracesW(propertyarray: MutPtr, propertyarraycount: UInt, loggercount: MutPtr): Win32Error =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwQueryAllTracesW(propertyarray.rawAddress.toString(), propertyarraycount.toInt(), loggercount.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: MutPtr): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryTraceProcessingHandle(processinghandle: ProcesstraceHandle, informationclass: EtwProcessHandleInfoType, inbuffer: ConstPtr, inbuffersize: UInt, outbuffer: MutPtr, outbuffersize: UInt, returnlength: MutPtr): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: MutPtr): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerTraceGuidsA(requestaddress: Wmidprequest, requestcontext: ConstPtr, controlguid: ConstPtr, guidcount: UInt, traceguidreg: ConstPtr, mofimagepath: Pcstr, mofresourcename: Pcstr, registrationhandle: MutPtr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwRegisterTraceGuidsA(0L.toString(), requestcontext.rawAddress.toString(), controlguid.rawAddress.toString(), guidcount.toInt(), traceguidreg.rawAddress.toString(), mofimagepath.rawAddress.toString(), mofresourcename.rawAddress.toString(), registrationhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerTraceGuidsW(requestaddress: Wmidprequest, requestcontext: ConstPtr, controlguid: ConstPtr, guidcount: UInt, traceguidreg: ConstPtr, mofimagepath: Pcwstr, mofresourcename: Pcwstr, registrationhandle: MutPtr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwRegisterTraceGuidsW(0L.toString(), requestcontext.rawAddress.toString(), controlguid.rawAddress.toString(), guidcount.toInt(), traceguidreg.rawAddress.toString(), mofimagepath.rawAddress.toString(), mofresourcename.rawAddress.toString(), registrationhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeTraceCallback(pguid: ConstPtr): Win32Error =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwRemoveTraceCallback(pguid.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setTraceCallback(pguid: ConstPtr, eventcallback: PeventCallback): Win32Error =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwSetTraceCallback(pguid.rawAddress.toString(), 0L.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun startTraceA(tracehandle: MutPtr, instancename: Pcstr, properties: MutPtr): Win32Error =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwStartTraceA(tracehandle.rawAddress.toString(), instancename.rawAddress.toString(), properties.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun startTraceW(tracehandle: MutPtr, instancename: Pcwstr, properties: MutPtr): Win32Error =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwStartTraceW(tracehandle.rawAddress.toString(), instancename.rawAddress.toString(), properties.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stopTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: MutPtr): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stopTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: MutPtr): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhAggregatePayloadFilters(payloadfiltercount: UInt, payloadfilterptrs: ConstPtr, eventmatchallflags: ConstPtr, eventfilterdescriptor: MutPtr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwTdhAggregatePayloadFilters(payloadfiltercount.toInt(), payloadfilterptrs.rawAddress.toString(), eventmatchallflags.rawAddress.toString(), eventfilterdescriptor.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhCleanupPayloadEventFilterDescriptor(eventfilterdescriptor: MutPtr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwTdhCleanupPayloadEventFilterDescriptor(eventfilterdescriptor.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhCloseDecodingHandle(handle: TdhHandle): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwTdhCloseDecodingHandle(handle.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhCreatePayloadFilter(providerguid: ConstPtr, eventdescriptor: ConstPtr, eventmatchany: Boolean, payloadpredicatecount: UInt, payloadpredicates: ConstPtr, payloadfilter: MutPtr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwTdhCreatePayloadFilter(providerguid.rawAddress.toString(), eventdescriptor.rawAddress.toString(), eventmatchany, payloadpredicatecount.toInt(), payloadpredicates.rawAddress.toString(), payloadfilter.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhDeletePayloadFilter(payloadfilter: MutPtr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwTdhDeletePayloadFilter(payloadfilter.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhEnumerateManifestProviderEvents(providerguid: ConstPtr, buffer: MutPtr, buffersize: MutPtr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwTdhEnumerateManifestProviderEvents(providerguid.rawAddress.toString(), buffer.rawAddress.toString(), buffersize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhEnumerateProviderFieldInformation(pguid: ConstPtr, eventfieldtype: EventFieldType, pbuffer: MutPtr, pbuffersize: MutPtr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwTdhEnumerateProviderFieldInformation(pguid.rawAddress.toString(), eventfieldtype, pbuffer.rawAddress.toString(), pbuffersize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhEnumerateProviderFilters(guid: ConstPtr, tdhcontextcount: UInt, tdhcontext: ConstPtr, filtercount: MutPtr, buffer: MutPtr, buffersize: MutPtr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwTdhEnumerateProviderFilters(guid.rawAddress.toString(), tdhcontextcount.toInt(), tdhcontext.rawAddress.toString(), filtercount.rawAddress.toString(), buffer.rawAddress.toString(), buffersize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhEnumerateProviders(pbuffer: MutPtr, pbuffersize: MutPtr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwTdhEnumerateProviders(pbuffer.rawAddress.toString(), pbuffersize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhEnumerateProvidersForDecodingSource(filter: DecodingSource, buffer: MutPtr, buffersize: UInt, bufferrequired: MutPtr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwTdhEnumerateProvidersForDecodingSource(filter, buffer.rawAddress.toString(), buffersize.toInt(), bufferrequired.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhFormatProperty(eventinfo: ConstPtr, mapinfo: ConstPtr, pointersize: UInt, propertyintype: UShort, propertyouttype: UShort, propertylength: UShort, userdatalength: UShort, userdata: ConstPtr, buffersize: MutPtr, buffer: Pwstr, userdataconsumed: MutPtr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwTdhFormatProperty(eventinfo.rawAddress.toString(), mapinfo.rawAddress.toString(), pointersize.toInt(), propertyintype.toInt(), propertyouttype.toInt(), propertylength.toInt(), userdatalength.toInt(), userdata.rawAddress.toString(), buffersize.rawAddress.toString(), buffer.rawAddress.toString(), userdataconsumed.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhGetDecodingParameter(handle: TdhHandle, tdhcontext: MutPtr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwTdhGetDecodingParameter(handle.toString(), tdhcontext.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhGetEventInformation(event: ConstPtr, tdhcontextcount: UInt, tdhcontext: ConstPtr, buffer: MutPtr, buffersize: MutPtr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwTdhGetEventInformation(event.rawAddress.toString(), tdhcontextcount.toInt(), tdhcontext.rawAddress.toString(), buffer.rawAddress.toString(), buffersize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhGetEventMapInformation(pevent: ConstPtr, pmapname: Pcwstr, pbuffer: MutPtr, pbuffersize: MutPtr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwTdhGetEventMapInformation(pevent.rawAddress.toString(), pmapname.rawAddress.toString(), pbuffer.rawAddress.toString(), pbuffersize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhGetManifestEventInformation(providerguid: ConstPtr, eventdescriptor: ConstPtr, buffer: MutPtr, buffersize: MutPtr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwTdhGetManifestEventInformation(providerguid.rawAddress.toString(), eventdescriptor.rawAddress.toString(), buffer.rawAddress.toString(), buffersize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhGetProperty(pevent: ConstPtr, tdhcontextcount: UInt, ptdhcontext: ConstPtr, propertydatacount: UInt, ppropertydata: ConstPtr, buffersize: UInt, pbuffer: MutPtr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwTdhGetProperty(pevent.rawAddress.toString(), tdhcontextcount.toInt(), ptdhcontext.rawAddress.toString(), propertydatacount.toInt(), ppropertydata.rawAddress.toString(), buffersize.toInt(), pbuffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhGetPropertySize(pevent: ConstPtr, tdhcontextcount: UInt, ptdhcontext: ConstPtr, propertydatacount: UInt, ppropertydata: ConstPtr, ppropertysize: MutPtr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwTdhGetPropertySize(pevent.rawAddress.toString(), tdhcontextcount.toInt(), ptdhcontext.rawAddress.toString(), propertydatacount.toInt(), ppropertydata.rawAddress.toString(), ppropertysize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhGetWppMessage(handle: TdhHandle, eventrecord: ConstPtr, buffersize: MutPtr, buffer: MutPtr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwTdhGetWppMessage(handle.toString(), eventrecord.rawAddress.toString(), buffersize.rawAddress.toString(), buffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhGetWppProperty(handle: TdhHandle, eventrecord: ConstPtr, propertyname: Pcwstr, buffersize: MutPtr, buffer: MutPtr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwTdhGetWppProperty(handle.toString(), eventrecord.rawAddress.toString(), propertyname.rawAddress.toString(), buffersize.rawAddress.toString(), buffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhLoadManifest(manifest: Pcwstr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwTdhLoadManifest(manifest.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhLoadManifestFromBinary(binarypath: Pcwstr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwTdhLoadManifestFromBinary(binarypath.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhLoadManifestFromMemory(pdata: ConstPtr, cbdata: UInt): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwTdhLoadManifestFromMemory(pdata.rawAddress.toString(), cbdata.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhOpenDecodingHandle(handle: MutPtr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwTdhOpenDecodingHandle(handle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhQueryProviderFieldInformation(pguid: ConstPtr, eventfieldvalue: ULong, eventfieldtype: EventFieldType, pbuffer: MutPtr, pbuffersize: MutPtr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwTdhQueryProviderFieldInformation(pguid.rawAddress.toString(), eventfieldvalue.toString(), eventfieldtype, pbuffer.rawAddress.toString(), pbuffersize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhSetDecodingParameter(handle: TdhHandle, tdhcontext: ConstPtr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwTdhSetDecodingParameter(handle.toString(), tdhcontext.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhUnloadManifest(manifest: Pcwstr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwTdhUnloadManifest(manifest.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhUnloadManifestFromMemory(pdata: ConstPtr, cbdata: UInt): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwTdhUnloadManifestFromMemory(pdata.rawAddress.toString(), cbdata.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun traceEvent(tracehandle: ULong, eventtrace: ConstPtr): Win32Error =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwTraceEvent(tracehandle.toString(), eventtrace.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun traceEventInstance(tracehandle: ULong, eventtrace: ConstPtr, instinfo: ConstPtr, parentinstinfo: ConstPtr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwTraceEventInstance(tracehandle.toString(), eventtrace.rawAddress.toString(), instinfo.rawAddress.toString(), parentinstinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun traceMessage(loggerhandle: ULong, messageflags: TraceMessageFlags, messageguid: ConstPtr, messagenumber: UShort, vararg variadicArgs: Long): Win32Error =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwTraceMessage(loggerhandle.toString(), messageflags.toInt(), messageguid.rawAddress.toString(), messagenumber.toInt(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun traceMessageVa(loggerhandle: ULong, messageflags: TraceMessageFlags, messageguid: ConstPtr, messagenumber: UShort, messagearglist: ConstPtr): Win32Error =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwTraceMessageVa(loggerhandle.toString(), messageflags.toInt(), messageguid.rawAddress.toString(), messagenumber.toInt(), messagearglist.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun traceQueryInformation(sessionhandle: ControltraceHandle, informationclass: TraceQueryInfoClass, traceinformation: MutPtr, informationlength: UInt, returnlength: MutPtr): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun traceSetInformation(sessionhandle: ControltraceHandle, informationclass: TraceQueryInfoClass, traceinformation: ConstPtr, informationlength: UInt): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unregisterTraceGuids(registrationhandle: ULong): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAddon != null) (windowsWin32SystemDiagnosticsEtwNapiAddon.windowssysWindowsWin32SystemDiagnosticsEtwUnregisterTraceGuids(registrationhandle.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updateTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: MutPtr): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updateTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: MutPtr): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")
