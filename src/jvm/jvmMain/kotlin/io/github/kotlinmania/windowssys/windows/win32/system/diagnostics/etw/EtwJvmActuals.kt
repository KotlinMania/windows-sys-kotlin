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

private object WindowsWin32SystemDiagnosticsEtwJniBridge {
    init {
        loadNativeLibrary()
    }

    private fun loadNativeLibrary() {
        val osRaw = System.getProperty("os.name", "").lowercase()
        val archRaw = System.getProperty("os.arch", "").lowercase()
        val hostPlatform =
            when {
                osRaw.contains("win") -> "windows"
                osRaw.contains("mac") || osRaw.contains("darwin") -> "macos"
                else -> "linux"
            }
        val hostArch =
            when {
                archRaw == "aarch64" || archRaw == "arm64" -> "aarch64"
                archRaw == "amd64" || archRaw == "x86_64" -> "x86_64"
                else -> archRaw
            }
        val libFileName =
            when (hostPlatform) {
                "windows" -> "windowssys_jni.dll"
                "macos" -> "libwindowssys_jni.dylib"
                else -> "libwindowssys_jni.so"
            }
        val pathSep = System.getProperty("path.separator", ":")
        val libPathProp = System.getProperty("java.library.path", "")
        for (dirEntry in libPathProp.split(pathSep)) {
            if (dirEntry.isEmpty()) continue
            val candidate = java.io.File(dirEntry, libFileName)
            if (candidate.isFile) {
                System.load(candidate.absolutePath)
                return
            }
        }
        val resourcePath = "io/github/kotlinmania/windowssys/native/$hostPlatform-$hostArch/$libFileName"
        val stream = WindowsWin32SystemDiagnosticsEtwJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
        if (stream != null) {
            val suffix = "." + libFileName.substringAfterLast('.')
            val extracted =
                java.nio.file.Files
                    .createTempFile("windowssys_jni-", suffix)
                    .toFile()
            extracted.deleteOnExit()
            stream.use { input ->
                extracted.outputStream().use { output ->
                    input.copyTo(output)
                }
            }
            System.load(extracted.absolutePath)
            return
        }
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

public actual fun controlTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: MutPtr, controlcode: EventTraceControl): Win32Error =
    0u

public actual fun controlTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: MutPtr, controlcode: EventTraceControl): Win32Error =
    0u

public actual fun createTraceInstanceId(reghandle: Handle, instinfo: MutPtr): Win32Error =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwCreateTraceInstanceId(reghandle.rawAddress, instinfo.rawAddress).toUInt()

public actual fun cveEventWrite(cveid: Pcwstr, additionaldetails: Pcwstr): Int =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwCveEventWrite(cveid.rawAddress, additionaldetails.rawAddress)

public actual fun enableTrace(enable: UInt, enableflag: UInt, enablelevel: UInt, controlguid: ConstPtr, tracehandle: ControltraceHandle): Win32Error =
    0u

public actual fun enableTraceEx(providerid: ConstPtr, sourceid: ConstPtr, tracehandle: ControltraceHandle, isenabled: UInt, level: UByte, matchanykeyword: ULong, matchallkeyword: ULong, enableproperty: UInt, enablefilterdesc: ConstPtr): Win32Error =
    0u

public actual fun enableTraceEx2(tracehandle: ControltraceHandle, providerid: ConstPtr, controlcode: UInt, level: UByte, matchanykeyword: ULong, matchallkeyword: ULong, timeout: UInt, enableparameters: ConstPtr): Win32Error =
    0u

public actual fun enumerateTraceGuids(guidpropertiesarray: MutPtr, propertyarraycount: UInt, guidcount: MutPtr): Win32Error =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwEnumerateTraceGuids(guidpropertiesarray.rawAddress, propertyarraycount.toInt(), guidcount.rawAddress).toUInt()

public actual fun enumerateTraceGuidsEx(tracequeryinfoclass: TraceQueryInfoClass, inbuffer: ConstPtr, inbuffersize: UInt, outbuffer: MutPtr, outbuffersize: UInt, returnlength: MutPtr): Win32Error =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwEnumerateTraceGuidsEx(tracequeryinfoclass, inbuffer.rawAddress, inbuffersize.toInt(), outbuffer.rawAddress, outbuffersize.toInt(), returnlength.rawAddress).toUInt()

public actual fun eventAccessControl(guid: ConstPtr, operation: UInt, sid: Psid, rights: UInt, allowordeny: Boolean): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwEventAccessControl(guid.rawAddress, operation.toInt(), sid.rawAddress, rights.toInt(), allowordeny).toUInt()

public actual fun eventAccessQuery(guid: ConstPtr, buffer: PsecurityDescriptor, buffersize: MutPtr): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwEventAccessQuery(guid.rawAddress, buffer.rawAddress, buffersize.rawAddress).toUInt()

public actual fun eventAccessRemove(guid: ConstPtr): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwEventAccessRemove(guid.rawAddress).toUInt()

public actual fun eventActivityIdControl(controlcode: UInt, activityid: MutPtr): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwEventActivityIdControl(controlcode.toInt(), activityid.rawAddress).toUInt()

public actual fun eventEnabled(reghandle: Reghandle, eventdescriptor: ConstPtr): Boolean =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwEventEnabled(reghandle, eventdescriptor.rawAddress)

public actual fun eventProviderEnabled(reghandle: Reghandle, level: UByte, keyword: ULong): Boolean =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwEventProviderEnabled(reghandle, level.toByte(), keyword.toLong())

public actual fun eventRegister(providerid: ConstPtr, enablecallback: Penablecallback, callbackcontext: ConstPtr, reghandle: MutPtr): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwEventRegister(providerid.rawAddress, 0L, callbackcontext.rawAddress, reghandle.rawAddress).toUInt()

public actual fun eventSetInformation(reghandle: Reghandle, informationclass: EventInfoClass, eventinformation: ConstPtr, informationlength: UInt): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwEventSetInformation(reghandle, informationclass, eventinformation.rawAddress, informationlength.toInt()).toUInt()

public actual fun eventUnregister(reghandle: Reghandle): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwEventUnregister(reghandle).toUInt()

public actual fun eventWrite(reghandle: Reghandle, eventdescriptor: ConstPtr, userdatacount: UInt, userdata: ConstPtr): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwEventWrite(reghandle, eventdescriptor.rawAddress, userdatacount.toInt(), userdata.rawAddress).toUInt()

public actual fun eventWriteEx(reghandle: Reghandle, eventdescriptor: ConstPtr, filter: ULong, flags: UInt, activityid: ConstPtr, relatedactivityid: ConstPtr, userdatacount: UInt, userdata: ConstPtr): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwEventWriteEx(reghandle, eventdescriptor.rawAddress, filter.toLong(), flags.toInt(), activityid.rawAddress, relatedactivityid.rawAddress, userdatacount.toInt(), userdata.rawAddress).toUInt()

public actual fun eventWriteString(reghandle: Reghandle, level: UByte, keyword: ULong, string: Pcwstr): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwEventWriteString(reghandle, level.toByte(), keyword.toLong(), string.rawAddress).toUInt()

public actual fun eventWriteTransfer(reghandle: Reghandle, eventdescriptor: ConstPtr, activityid: ConstPtr, relatedactivityid: ConstPtr, userdatacount: UInt, userdata: ConstPtr): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwEventWriteTransfer(reghandle, eventdescriptor.rawAddress, activityid.rawAddress, relatedactivityid.rawAddress, userdatacount.toInt(), userdata.rawAddress).toUInt()

public actual fun flushTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: MutPtr): Win32Error =
    0u

public actual fun flushTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: MutPtr): Win32Error =
    0u

public actual fun getTraceEnableFlags(tracehandle: ULong): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwGetTraceEnableFlags(tracehandle.toLong()).toUInt()

public actual fun getTraceEnableLevel(tracehandle: ULong): UByte =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwGetTraceEnableLevel(tracehandle.toLong()).toUByte()

public actual fun getTraceLoggerHandle(buffer: ConstPtr): ULong =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwGetTraceLoggerHandle(buffer.rawAddress).toULong()

public actual fun openTraceA(logfile: MutPtr): ProcesstraceHandle =
    ProcesstraceHandle()

public actual fun openTraceFromBufferStream(options: ConstPtr, buffercompletioncallback: PetwBufferCompletionCallback, buffercompletioncontext: ConstPtr): ULong =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwOpenTraceFromBufferStream(options.rawAddress, 0L, buffercompletioncontext.rawAddress).toULong()

public actual fun openTraceFromFile(logfilename: Pcwstr, options: ConstPtr, logfileheader: MutPtr): ULong =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwOpenTraceFromFile(logfilename.rawAddress, options.rawAddress, logfileheader.rawAddress).toULong()

public actual fun openTraceFromRealTimeLogger(loggername: Pcwstr, options: ConstPtr, logfileheader: MutPtr): ULong =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwOpenTraceFromRealTimeLogger(loggername.rawAddress, options.rawAddress, logfileheader.rawAddress).toULong()

public actual fun openTraceFromRealTimeLoggerWithAllocationOptions(loggername: Pcwstr, options: ConstPtr, allocationsize: ULong, memorypartitionhandle: Handle, logfileheader: MutPtr): ULong =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwOpenTraceFromRealTimeLoggerWithAllocationOptions(loggername.rawAddress, options.rawAddress, allocationsize.toLong(), memorypartitionhandle.rawAddress, logfileheader.rawAddress).toULong()

public actual fun openTraceW(logfile: MutPtr): ProcesstraceHandle =
    ProcesstraceHandle()

public actual fun processTrace(handlearray: ConstPtr, handlecount: UInt, starttime: ConstPtr, endtime: ConstPtr): Win32Error =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwProcessTrace(handlearray.rawAddress, handlecount.toInt(), starttime.rawAddress, endtime.rawAddress).toUInt()

public actual fun processTraceAddBufferToBufferStream(tracehandle: ULong, buffer: ConstPtr, buffersize: UInt): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwProcessTraceAddBufferToBufferStream(tracehandle.toLong(), buffer.rawAddress, buffersize.toInt()).toUInt()

public actual fun processTraceBufferDecrementReference(buffer: ConstPtr): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwProcessTraceBufferDecrementReference(buffer.rawAddress).toUInt()

public actual fun processTraceBufferIncrementReference(tracehandle: ULong, buffer: ConstPtr): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwProcessTraceBufferIncrementReference(tracehandle.toLong(), buffer.rawAddress).toUInt()

public actual fun queryAllTracesA(propertyarray: MutPtr, propertyarraycount: UInt, loggercount: MutPtr): Win32Error =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwQueryAllTracesA(propertyarray.rawAddress, propertyarraycount.toInt(), loggercount.rawAddress).toUInt()

public actual fun queryAllTracesW(propertyarray: MutPtr, propertyarraycount: UInt, loggercount: MutPtr): Win32Error =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwQueryAllTracesW(propertyarray.rawAddress, propertyarraycount.toInt(), loggercount.rawAddress).toUInt()

public actual fun queryTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: MutPtr): Win32Error =
    0u

public actual fun queryTraceProcessingHandle(processinghandle: ProcesstraceHandle, informationclass: EtwProcessHandleInfoType, inbuffer: ConstPtr, inbuffersize: UInt, outbuffer: MutPtr, outbuffersize: UInt, returnlength: MutPtr): Win32Error =
    0u

public actual fun queryTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: MutPtr): Win32Error =
    0u

public actual fun registerTraceGuidsA(requestaddress: Wmidprequest, requestcontext: ConstPtr, controlguid: ConstPtr, guidcount: UInt, traceguidreg: ConstPtr, mofimagepath: Pcstr, mofresourcename: Pcstr, registrationhandle: MutPtr): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwRegisterTraceGuidsA(0L, requestcontext.rawAddress, controlguid.rawAddress, guidcount.toInt(), traceguidreg.rawAddress, mofimagepath.rawAddress, mofresourcename.rawAddress, registrationhandle.rawAddress).toUInt()

public actual fun registerTraceGuidsW(requestaddress: Wmidprequest, requestcontext: ConstPtr, controlguid: ConstPtr, guidcount: UInt, traceguidreg: ConstPtr, mofimagepath: Pcwstr, mofresourcename: Pcwstr, registrationhandle: MutPtr): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwRegisterTraceGuidsW(0L, requestcontext.rawAddress, controlguid.rawAddress, guidcount.toInt(), traceguidreg.rawAddress, mofimagepath.rawAddress, mofresourcename.rawAddress, registrationhandle.rawAddress).toUInt()

public actual fun removeTraceCallback(pguid: ConstPtr): Win32Error =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwRemoveTraceCallback(pguid.rawAddress).toUInt()

public actual fun setTraceCallback(pguid: ConstPtr, eventcallback: PeventCallback): Win32Error =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwSetTraceCallback(pguid.rawAddress, 0L).toUInt()

public actual fun startTraceA(tracehandle: MutPtr, instancename: Pcstr, properties: MutPtr): Win32Error =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwStartTraceA(tracehandle.rawAddress, instancename.rawAddress, properties.rawAddress).toUInt()

public actual fun startTraceW(tracehandle: MutPtr, instancename: Pcwstr, properties: MutPtr): Win32Error =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwStartTraceW(tracehandle.rawAddress, instancename.rawAddress, properties.rawAddress).toUInt()

public actual fun stopTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: MutPtr): Win32Error =
    0u

public actual fun stopTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: MutPtr): Win32Error =
    0u

public actual fun tdhAggregatePayloadFilters(payloadfiltercount: UInt, payloadfilterptrs: ConstPtr, eventmatchallflags: ConstPtr, eventfilterdescriptor: MutPtr): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwTdhAggregatePayloadFilters(payloadfiltercount.toInt(), payloadfilterptrs.rawAddress, eventmatchallflags.rawAddress, eventfilterdescriptor.rawAddress).toUInt()

public actual fun tdhCleanupPayloadEventFilterDescriptor(eventfilterdescriptor: MutPtr): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwTdhCleanupPayloadEventFilterDescriptor(eventfilterdescriptor.rawAddress).toUInt()

public actual fun tdhCloseDecodingHandle(handle: TdhHandle): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwTdhCloseDecodingHandle(handle).toUInt()

public actual fun tdhCreatePayloadFilter(providerguid: ConstPtr, eventdescriptor: ConstPtr, eventmatchany: Boolean, payloadpredicatecount: UInt, payloadpredicates: ConstPtr, payloadfilter: MutPtr): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwTdhCreatePayloadFilter(providerguid.rawAddress, eventdescriptor.rawAddress, eventmatchany, payloadpredicatecount.toInt(), payloadpredicates.rawAddress, payloadfilter.rawAddress).toUInt()

public actual fun tdhDeletePayloadFilter(payloadfilter: MutPtr): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwTdhDeletePayloadFilter(payloadfilter.rawAddress).toUInt()

public actual fun tdhEnumerateManifestProviderEvents(providerguid: ConstPtr, buffer: MutPtr, buffersize: MutPtr): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwTdhEnumerateManifestProviderEvents(providerguid.rawAddress, buffer.rawAddress, buffersize.rawAddress).toUInt()

public actual fun tdhEnumerateProviderFieldInformation(pguid: ConstPtr, eventfieldtype: EventFieldType, pbuffer: MutPtr, pbuffersize: MutPtr): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwTdhEnumerateProviderFieldInformation(pguid.rawAddress, eventfieldtype, pbuffer.rawAddress, pbuffersize.rawAddress).toUInt()

public actual fun tdhEnumerateProviderFilters(guid: ConstPtr, tdhcontextcount: UInt, tdhcontext: ConstPtr, filtercount: MutPtr, buffer: MutPtr, buffersize: MutPtr): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwTdhEnumerateProviderFilters(guid.rawAddress, tdhcontextcount.toInt(), tdhcontext.rawAddress, filtercount.rawAddress, buffer.rawAddress, buffersize.rawAddress).toUInt()

public actual fun tdhEnumerateProviders(pbuffer: MutPtr, pbuffersize: MutPtr): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwTdhEnumerateProviders(pbuffer.rawAddress, pbuffersize.rawAddress).toUInt()

public actual fun tdhEnumerateProvidersForDecodingSource(filter: DecodingSource, buffer: MutPtr, buffersize: UInt, bufferrequired: MutPtr): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwTdhEnumerateProvidersForDecodingSource(filter, buffer.rawAddress, buffersize.toInt(), bufferrequired.rawAddress).toUInt()

public actual fun tdhFormatProperty(eventinfo: ConstPtr, mapinfo: ConstPtr, pointersize: UInt, propertyintype: UShort, propertyouttype: UShort, propertylength: UShort, userdatalength: UShort, userdata: ConstPtr, buffersize: MutPtr, buffer: Pwstr, userdataconsumed: MutPtr): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwTdhFormatProperty(eventinfo.rawAddress, mapinfo.rawAddress, pointersize.toInt(), propertyintype.toShort(), propertyouttype.toShort(), propertylength.toShort(), userdatalength.toShort(), userdata.rawAddress, buffersize.rawAddress, buffer.rawAddress, userdataconsumed.rawAddress).toUInt()

public actual fun tdhGetDecodingParameter(handle: TdhHandle, tdhcontext: MutPtr): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwTdhGetDecodingParameter(handle, tdhcontext.rawAddress).toUInt()

public actual fun tdhGetEventInformation(event: ConstPtr, tdhcontextcount: UInt, tdhcontext: ConstPtr, buffer: MutPtr, buffersize: MutPtr): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwTdhGetEventInformation(event.rawAddress, tdhcontextcount.toInt(), tdhcontext.rawAddress, buffer.rawAddress, buffersize.rawAddress).toUInt()

public actual fun tdhGetEventMapInformation(pevent: ConstPtr, pmapname: Pcwstr, pbuffer: MutPtr, pbuffersize: MutPtr): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwTdhGetEventMapInformation(pevent.rawAddress, pmapname.rawAddress, pbuffer.rawAddress, pbuffersize.rawAddress).toUInt()

public actual fun tdhGetManifestEventInformation(providerguid: ConstPtr, eventdescriptor: ConstPtr, buffer: MutPtr, buffersize: MutPtr): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwTdhGetManifestEventInformation(providerguid.rawAddress, eventdescriptor.rawAddress, buffer.rawAddress, buffersize.rawAddress).toUInt()

public actual fun tdhGetProperty(pevent: ConstPtr, tdhcontextcount: UInt, ptdhcontext: ConstPtr, propertydatacount: UInt, ppropertydata: ConstPtr, buffersize: UInt, pbuffer: MutPtr): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwTdhGetProperty(pevent.rawAddress, tdhcontextcount.toInt(), ptdhcontext.rawAddress, propertydatacount.toInt(), ppropertydata.rawAddress, buffersize.toInt(), pbuffer.rawAddress).toUInt()

public actual fun tdhGetPropertySize(pevent: ConstPtr, tdhcontextcount: UInt, ptdhcontext: ConstPtr, propertydatacount: UInt, ppropertydata: ConstPtr, ppropertysize: MutPtr): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwTdhGetPropertySize(pevent.rawAddress, tdhcontextcount.toInt(), ptdhcontext.rawAddress, propertydatacount.toInt(), ppropertydata.rawAddress, ppropertysize.rawAddress).toUInt()

public actual fun tdhGetWppMessage(handle: TdhHandle, eventrecord: ConstPtr, buffersize: MutPtr, buffer: MutPtr): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwTdhGetWppMessage(handle, eventrecord.rawAddress, buffersize.rawAddress, buffer.rawAddress).toUInt()

public actual fun tdhGetWppProperty(handle: TdhHandle, eventrecord: ConstPtr, propertyname: Pcwstr, buffersize: MutPtr, buffer: MutPtr): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwTdhGetWppProperty(handle, eventrecord.rawAddress, propertyname.rawAddress, buffersize.rawAddress, buffer.rawAddress).toUInt()

public actual fun tdhLoadManifest(manifest: Pcwstr): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwTdhLoadManifest(manifest.rawAddress).toUInt()

public actual fun tdhLoadManifestFromBinary(binarypath: Pcwstr): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwTdhLoadManifestFromBinary(binarypath.rawAddress).toUInt()

public actual fun tdhLoadManifestFromMemory(pdata: ConstPtr, cbdata: UInt): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwTdhLoadManifestFromMemory(pdata.rawAddress, cbdata.toInt()).toUInt()

public actual fun tdhOpenDecodingHandle(handle: MutPtr): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwTdhOpenDecodingHandle(handle.rawAddress).toUInt()

public actual fun tdhQueryProviderFieldInformation(pguid: ConstPtr, eventfieldvalue: ULong, eventfieldtype: EventFieldType, pbuffer: MutPtr, pbuffersize: MutPtr): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwTdhQueryProviderFieldInformation(pguid.rawAddress, eventfieldvalue.toLong(), eventfieldtype, pbuffer.rawAddress, pbuffersize.rawAddress).toUInt()

public actual fun tdhSetDecodingParameter(handle: TdhHandle, tdhcontext: ConstPtr): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwTdhSetDecodingParameter(handle, tdhcontext.rawAddress).toUInt()

public actual fun tdhUnloadManifest(manifest: Pcwstr): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwTdhUnloadManifest(manifest.rawAddress).toUInt()

public actual fun tdhUnloadManifestFromMemory(pdata: ConstPtr, cbdata: UInt): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwTdhUnloadManifestFromMemory(pdata.rawAddress, cbdata.toInt()).toUInt()

public actual fun traceEvent(tracehandle: ULong, eventtrace: ConstPtr): Win32Error =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwTraceEvent(tracehandle.toLong(), eventtrace.rawAddress).toUInt()

public actual fun traceEventInstance(tracehandle: ULong, eventtrace: ConstPtr, instinfo: ConstPtr, parentinstinfo: ConstPtr): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwTraceEventInstance(tracehandle.toLong(), eventtrace.rawAddress, instinfo.rawAddress, parentinstinfo.rawAddress).toUInt()

public actual fun traceMessage(loggerhandle: ULong, messageflags: TraceMessageFlags, messageguid: ConstPtr, messagenumber: UShort, vararg variadicArgs: Long): Win32Error =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwTraceMessage(loggerhandle.toLong(), messageflags.toInt(), messageguid.rawAddress, messagenumber.toShort(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L).toUInt()

public actual fun traceMessageVa(loggerhandle: ULong, messageflags: TraceMessageFlags, messageguid: ConstPtr, messagenumber: UShort, messagearglist: ConstPtr): Win32Error =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwTraceMessageVa(loggerhandle.toLong(), messageflags.toInt(), messageguid.rawAddress, messagenumber.toShort(), messagearglist.rawAddress).toUInt()

public actual fun traceQueryInformation(sessionhandle: ControltraceHandle, informationclass: TraceQueryInfoClass, traceinformation: MutPtr, informationlength: UInt, returnlength: MutPtr): Win32Error =
    0u

public actual fun traceSetInformation(sessionhandle: ControltraceHandle, informationclass: TraceQueryInfoClass, traceinformation: ConstPtr, informationlength: UInt): Win32Error =
    0u

public actual fun unregisterTraceGuids(registrationhandle: ULong): UInt =
    WindowsWin32SystemDiagnosticsEtwJniBridge.windowssysWindowsWin32SystemDiagnosticsEtwUnregisterTraceGuids(registrationhandle.toLong()).toUInt()

public actual fun updateTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: MutPtr): Win32Error =
    0u

public actual fun updateTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: MutPtr): Win32Error =
    0u
