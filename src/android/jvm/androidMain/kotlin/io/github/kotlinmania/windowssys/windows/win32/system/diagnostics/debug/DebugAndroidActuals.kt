@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hmodule
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.foundation.Systemtime
import io.github.kotlinmania.windowssys.windows.win32.security.wintrust.WinCertificate
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.ExceptionRoutine
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.MessageboxStyle

private object WindowsWin32SystemDiagnosticsDebugJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugAddVectoredContinueHandler(first: Int, handler: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugAddVectoredExceptionHandler(first: Int, handler: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugBeep(dwfreq: Int, dwduration: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugBindImage(imagename: Long, dllpath: Long, symbolpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugBindImageEx(flags: Int, imagename: Long, dllpath: Long, symbolpath: Long, statusroutine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugCheckRemoteDebuggerPresent(hprocess: Long, pbdebuggerpresent: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugCheckSumMappedFile(baseaddress: Long, filelength: Int, headersum: Long, checksum: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugCloseThreadWaitChainSession(wcthandle: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugContinueDebugEvent(dwprocessid: Int, dwthreadid: Int, dwcontinuestatus: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugCopyContext(destination: Long, contextflags: Int, source: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugDbgHelpCreateUserDump(filename: Long, callback: Long, userdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugDbgHelpCreateUserDumpW(filename: Long, callback: Long, userdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugDebugActiveProcess(dwprocessid: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugDebugActiveProcessStop(dwprocessid: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugDebugBreak()

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugDebugBreakProcess(process: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugDebugSetProcessKillOnExit(killonexit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugDecodePointer(ptr: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugDecodeRemotePointer(processhandle: Long, ptr: Long, decodedptr: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugDecodeSystemPointer(ptr: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugEncodePointer(ptr: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugEncodeRemotePointer(processhandle: Long, ptr: Long, encodedptr: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugEncodeSystemPointer(ptr: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugEnumDirTree(hprocess: Long, rootpath: Long, inputpathname: Long, outputpathbuffer: Long, cb: Long, data: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugEnumDirTreeW(hprocess: Long, rootpath: Long, inputpathname: Long, outputpathbuffer: Long, cb: Long, data: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugEnumerateLoadedModules64(hprocess: Long, enumloadedmodulescallback: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugEnumerateLoadedModulesEx(hprocess: Long, enumloadedmodulescallback: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugEnumerateLoadedModulesExW(hprocess: Long, enumloadedmodulescallback: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugEnumerateLoadedModulesW64(hprocess: Long, enumloadedmodulescallback: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugFatalAppExitA(uaction: Int, lpmessagetext: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugFatalAppExitW(uaction: Int, lpmessagetext: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugFatalExit(exitcode: Int)

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugFindDebugInfoFile(filename: Long, symbolpath: Long, debugfilepath: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugFindDebugInfoFileEx(filename: Long, symbolpath: Long, debugfilepath: Long, callback: Long, callerdata: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugFindDebugInfoFileExW(filename: Long, symbolpath: Long, debugfilepath: Long, callback: Long, callerdata: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugFindExecutableImage(filename: Long, symbolpath: Long, imagefilepath: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugFindExecutableImageEx(filename: Long, symbolpath: Long, imagefilepath: Long, callback: Long, callerdata: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugFindExecutableImageExW(filename: Long, symbolpath: Long, imagefilepath: Long, callback: Long, callerdata: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugFindFileInPath(hprocess: Long, searchpatha: Long, filename: Long, id: Long, two: Int, three: Int, flags: Int, filepath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugFindFileInSearchPath(hprocess: Long, searchpatha: Long, filename: Long, one: Int, two: Int, three: Int, filepath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugFlushInstructionCache(hprocess: Long, lpbaseaddress: Long, dwsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugFormatMessageA(dwflags: Int, lpsource: Long, dwmessageid: Int, dwlanguageid: Int, lpbuffer: Long, nsize: Int, arguments: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugFormatMessageW(dwflags: Int, lpsource: Long, dwmessageid: Int, dwlanguageid: Int, lpbuffer: Long, nsize: Int, arguments: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugGetEnabledXStateFeatures(): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugGetErrorMode(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugGetImageConfigInformation(loadedimage: Long, imageconfiginformation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugGetImageUnusedHeaderBytes(loadedimage: Long, sizeunusedheaderbytes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugGetSymLoadError(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugGetThreadContext(hthread: Long, lpcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugGetThreadErrorMode(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugGetThreadSelectorEntry(hthread: Long, dwselector: Int, lpselectorentry: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugGetThreadWaitChain(wcthandle: Long, context: Long, flags: Int, threadid: Int, nodecount: Long, nodeinfoarray: Long, iscycle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugGetTimestampForLoadedLibrary(module: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugGetXStateFeaturesMask(context: Long, featuremask: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugImageAddCertificate(filehandle: Long, certificate: Long, index: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugImageDirectoryEntryToData(base: Long, mappedasimage: Boolean, directoryentry: Short, size: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugImageDirectoryEntryToDataEx(base: Long, mappedasimage: Boolean, directoryentry: Short, size: Long, foundheader: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugImageEnumerateCertificates(filehandle: Long, typefilter: Short, certificatecount: Long, indices: Long, indexcount: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugImageGetCertificateData(filehandle: Long, certificateindex: Int, certificate: Long, requiredlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugImageGetCertificateHeader(filehandle: Long, certificateindex: Int, certificateheader: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugImageGetDigestStream(filehandle: Long, digestlevel: Int, digestfunction: Long, digesthandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugImageLoad(dllname: Long, dllpath: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugImageNtHeader(base: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugImageRemoveCertificate(filehandle: Long, index: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugImageRvaToSection(ntheaders: Long, base: Long, rva: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugImageRvaToVa(ntheaders: Long, base: Long, rva: Int, lastrvasection: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugImageUnload(loadedimage: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugImagehlpApiVersion(): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugImagehlpApiVersionEx(appversion: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugInitializeContext(buffer: Long, contextflags: Int, context: Long, contextlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugInitializeContext2(buffer: Long, contextflags: Int, context: Long, contextlength: Long, xstatecompactionmask: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugIsDebuggerPresent(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugLocateXStateFeature(context: Long, featureid: Int, length: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugMakeSureDirectoryPathExists(dirpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugMapAndLoad(imagename: Long, dllpath: Long, loadedimage: Long, dotdll: Int, readonly: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugMapFileAndCheckSumA(filename: Long, headersum: Long, checksum: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugMapFileAndCheckSumW(filename: Long, headersum: Long, checksum: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugMessageBeep(utype: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugMiniDumpReadDumpStream(baseofdump: Long, streamnumber: Int, dir: Long, streampointer: Long, streamsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugMiniDumpWriteDump(hprocess: Long, processid: Int, hfile: Long, dumptype: Int, exceptionparam: Long, userstreamparam: Long, callbackparam: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugOpenThreadWaitChainSession(flags: Int, callback: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugOutputDebugStringA(lpoutputstring: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugOutputDebugStringW(lpoutputstring: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugRaiseException(dwexceptioncode: Int, dwexceptionflags: Int, nnumberofarguments: Int, lparguments: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugRaiseFailFastException(pexceptionrecord: Long, pcontextrecord: Long, dwflags: Int)

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugRangeMapAddPeImageSections(rmaphandle: Long, imagename: Long, mappedimage: Long, mappingbytes: Int, imagebase: Long, usertag: Long, mappingflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugRangeMapCreate(): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugRangeMapFree(rmaphandle: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugRangeMapRead(rmaphandle: Long, offset: Long, buffer: Long, requestbytes: Int, flags: Int, donebytes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugRangeMapRemove(rmaphandle: Long, usertag: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugRangeMapWrite(rmaphandle: Long, offset: Long, buffer: Long, requestbytes: Int, flags: Int, donebytes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugReBaseImage(currentimagename: Long, symbolpath: Long, frebase: Int, frebasesysfileok: Int, fgoingdown: Int, checkimagesize: Int, oldimagesize: Long, oldimagebase: Long, newimagesize: Long, newimagebase: Long, timestamp: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugReBaseImage64(currentimagename: Long, symbolpath: Long, frebase: Int, frebasesysfileok: Int, fgoingdown: Int, checkimagesize: Int, oldimagesize: Long, oldimagebase: Long, newimagesize: Long, newimagebase: Long, timestamp: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugReadProcessMemory(hprocess: Long, lpbaseaddress: Long, lpbuffer: Long, nsize: Long, lpnumberofbytesread: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugRegisterWaitChainCOMCallback(callstatecallback: Long, activationstatecallback: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugRemoveInvalidModuleList(hprocess: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugRemoveVectoredContinueHandler(handle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugRemoveVectoredExceptionHandler(handle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugReportSymbolLoadSummary(hprocess: Long, ploadmodule: Long, psymboldata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugRtlAddFunctionTable(functiontable: Long, entrycount: Int, baseaddress: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugRtlAddGrowableFunctionTable(dynamictable: Long, functiontable: Long, entrycount: Int, maximumentrycount: Int, rangebase: Long, rangeend: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugRtlCaptureContext(contextrecord: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugRtlCaptureContext2(contextrecord: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugRtlCaptureStackBackTrace(framestoskip: Int, framestocapture: Int, backtrace: Long, backtracehash: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugRtlDeleteFunctionTable(functiontable: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugRtlDeleteGrowableFunctionTable(dynamictable: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugRtlGrowFunctionTable(dynamictable: Long, newentrycount: Int)

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugRtlInstallFunctionTableCallback(tableidentifier: Long, baseaddress: Long, length: Int, callback: Long, context: Long, outofprocesscallbackdll: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugRtlLookupFunctionEntry(controlpc: Long, imagebase: Long, historytable: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugRtlPcToFileHeader(pcvalue: Long, baseofimage: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugRtlRaiseException(exceptionrecord: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugRtlRestoreContext(contextrecord: Long, exceptionrecord: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugRtlUnwind(targetframe: Long, targetip: Long, exceptionrecord: Long, returnvalue: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugRtlUnwindEx(targetframe: Long, targetip: Long, exceptionrecord: Long, returnvalue: Long, contextrecord: Long, historytable: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugRtlVirtualUnwind(handlertype: Int, imagebase: Long, controlpc: Long, functionentry: Long, contextrecord: Long, handlerdata: Long, establisherframe: Long, contextpointers: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSearchTreeForFile(rootpath: Long, inputpathname: Long, outputpathbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSearchTreeForFileW(rootpath: Long, inputpathname: Long, outputpathbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSetCheckUserInterruptShared(lpstartaddress: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSetErrorMode(umode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSetImageConfigInformation(loadedimage: Long, imageconfiginformation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSetSymLoadError(error: Int)

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSetThreadContext(hthread: Long, lpcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSetThreadErrorMode(dwnewmode: Int, lpoldmode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSetUnhandledExceptionFilter(lptoplevelexceptionfilter: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSetXStateFeaturesMask(context: Long, featuremask: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugStackWalk2(machinetype: Int, hprocess: Long, hthread: Long, stackframe: Long, contextrecord: Long, readmemoryroutine: Long, functiontableaccessroutine: Long, getmodulebaseroutine: Long, translateaddress: Long, gettargetattributevalue: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugStackWalk64(machinetype: Int, hprocess: Long, hthread: Long, stackframe: Long, contextrecord: Long, readmemoryroutine: Long, functiontableaccessroutine: Long, getmodulebaseroutine: Long, translateaddress: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugStackWalkEx(machinetype: Int, hprocess: Long, hthread: Long, stackframe: Long, contextrecord: Long, readmemoryroutine: Long, functiontableaccessroutine: Long, getmodulebaseroutine: Long, translateaddress: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymAddSourceStream(hprocess: Long, base: Long, streamfile: Long, buffer: Long, size: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymAddSourceStreamA(hprocess: Long, base: Long, streamfile: Long, buffer: Long, size: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymAddSourceStreamW(hprocess: Long, base: Long, filespec: Long, buffer: Long, size: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymAddSymbol(hprocess: Long, baseofdll: Long, name: Long, address: Long, size: Int, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymAddSymbolW(hprocess: Long, baseofdll: Long, name: Long, address: Long, size: Int, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymAddrIncludeInlineTrace(hprocess: Long, address: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymCleanup(hprocess: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymCompareInlineTrace(hprocess: Long, address1: Long, inlinecontext1: Int, retaddress1: Long, address2: Long, retaddress2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymDeleteSymbol(hprocess: Long, baseofdll: Long, name: Long, address: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymDeleteSymbolW(hprocess: Long, baseofdll: Long, name: Long, address: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymEnumLines(hprocess: Long, base: Long, obj: Long, file: Long, enumlinescallback: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymEnumLinesW(hprocess: Long, base: Long, obj: Long, file: Long, enumlinescallback: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymEnumProcesses(enumprocessescallback: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSourceFileTokens(hprocess: Long, base: Long, callback: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSourceFiles(hprocess: Long, modbase: Long, mask: Long, cbsrcfiles: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSourceFilesW(hprocess: Long, modbase: Long, mask: Long, cbsrcfiles: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSourceLines(hprocess: Long, base: Long, obj: Long, file: Long, line: Int, flags: Int, enumlinescallback: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSourceLinesW(hprocess: Long, base: Long, obj: Long, file: Long, line: Int, flags: Int, enumlinescallback: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSym(hprocess: Long, baseofdll: Long, enumsymbolscallback: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSymbols(hprocess: Long, baseofdll: Long, mask: Long, enumsymbolscallback: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSymbolsEx(hprocess: Long, baseofdll: Long, mask: Long, enumsymbolscallback: Long, usercontext: Long, options: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSymbolsExW(hprocess: Long, baseofdll: Long, mask: Long, enumsymbolscallback: Long, usercontext: Long, options: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSymbolsForAddr(hprocess: Long, address: Long, enumsymbolscallback: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSymbolsForAddrW(hprocess: Long, address: Long, enumsymbolscallback: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSymbolsW(hprocess: Long, baseofdll: Long, mask: Long, enumsymbolscallback: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymEnumTypes(hprocess: Long, baseofdll: Long, enumsymbolscallback: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymEnumTypesByName(hprocess: Long, baseofdll: Long, mask: Long, enumsymbolscallback: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymEnumTypesByNameW(hprocess: Long, baseofdll: Long, mask: Long, enumsymbolscallback: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymEnumTypesW(hprocess: Long, baseofdll: Long, enumsymbolscallback: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymEnumerateModules64(hprocess: Long, enummodulescallback: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymEnumerateModulesW64(hprocess: Long, enummodulescallback: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymEnumerateSymbols64(hprocess: Long, baseofdll: Long, enumsymbolscallback: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymEnumerateSymbolsW64(hprocess: Long, baseofdll: Long, enumsymbolscallback: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymFindDebugInfoFile(hprocess: Long, filename: Long, debugfilepath: Long, callback: Long, callerdata: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymFindDebugInfoFileW(hprocess: Long, filename: Long, debugfilepath: Long, callback: Long, callerdata: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymFindExecutableImage(hprocess: Long, filename: Long, imagefilepath: Long, callback: Long, callerdata: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymFindExecutableImageW(hprocess: Long, filename: Long, imagefilepath: Long, callback: Long, callerdata: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymFindFileInPath(hprocess: Long, searchpatha: Long, filename: Long, id: Long, two: Int, three: Int, flags: Int, foundfile: Long, callback: Long, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymFindFileInPathW(hprocess: Long, searchpatha: Long, filename: Long, id: Long, two: Int, three: Int, flags: Int, foundfile: Long, callback: Long, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymFromAddr(hprocess: Long, address: Long, displacement: Long, symbol: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymFromAddrW(hprocess: Long, address: Long, displacement: Long, symbol: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymFromIndex(hprocess: Long, baseofdll: Long, index: Int, symbol: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymFromIndexW(hprocess: Long, baseofdll: Long, index: Int, symbol: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymFromInlineContext(hprocess: Long, address: Long, inlinecontext: Int, displacement: Long, symbol: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymFromInlineContextW(hprocess: Long, address: Long, inlinecontext: Int, displacement: Long, symbol: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymFromName(hprocess: Long, name: Long, symbol: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymFromNameW(hprocess: Long, name: Long, symbol: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymFromToken(hprocess: Long, base: Long, token: Int, symbol: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymFromTokenW(hprocess: Long, base: Long, token: Int, symbol: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymFunctionTableAccess64(hprocess: Long, addrbase: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymFunctionTableAccess64AccessRoutines(hprocess: Long, addrbase: Long, readmemoryroutine: Long, getmodulebaseroutine: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymGetExtendedOption(option: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymGetFileLineOffsets64(hprocess: Long, modulename: Long, filename: Long, buffer: Long, bufferlines: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymGetHomeDirectory(type: Int, dir: Long, size: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymGetHomeDirectoryW(type: Int, dir: Long, size: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymGetLineFromAddr64(hprocess: Long, qwaddr: Long, pdwdisplacement: Long, line64: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymGetLineFromAddrW64(hprocess: Long, dwaddr: Long, pdwdisplacement: Long, line: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymGetLineFromInlineContext(hprocess: Long, qwaddr: Long, inlinecontext: Int, qwmodulebaseaddress: Long, pdwdisplacement: Long, line64: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymGetLineFromInlineContextW(hprocess: Long, dwaddr: Long, inlinecontext: Int, qwmodulebaseaddress: Long, pdwdisplacement: Long, line: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymGetLineFromName64(hprocess: Long, modulename: Long, filename: Long, dwlinenumber: Int, pldisplacement: Long, line: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymGetLineFromNameW64(hprocess: Long, modulename: Long, filename: Long, dwlinenumber: Int, pldisplacement: Long, line: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymGetLineNext64(hprocess: Long, line: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymGetLineNextW64(hprocess: Long, line: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymGetLinePrev64(hprocess: Long, line: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymGetLinePrevW64(hprocess: Long, line: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymGetModuleBase64(hprocess: Long, qwaddr: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymGetModuleInfo64(hprocess: Long, qwaddr: Long, moduleinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymGetModuleInfoW64(hprocess: Long, qwaddr: Long, moduleinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymGetOmaps(hprocess: Long, baseofdll: Long, omapto: Long, comapto: Long, omapfrom: Long, comapfrom: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymGetOptions(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymGetScope(hprocess: Long, baseofdll: Long, index: Int, symbol: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymGetScopeW(hprocess: Long, baseofdll: Long, index: Int, symbol: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymGetSearchPath(hprocess: Long, searchpatha: Long, searchpathlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymGetSearchPathW(hprocess: Long, searchpatha: Long, searchpathlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFile(hprocess: Long, base: Long, params: Long, filespec: Long, filepath: Long, size: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileChecksum(hprocess: Long, base: Long, filespec: Long, pchecksumtype: Long, pchecksum: Long, checksumsize: Int, pactualbyteswritten: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileChecksumW(hprocess: Long, base: Long, filespec: Long, pchecksumtype: Long, pchecksum: Long, checksumsize: Int, pactualbyteswritten: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileFromToken(hprocess: Long, token: Long, params: Long, filepath: Long, size: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileFromTokenByTokenName(hprocess: Long, token: Long, tokenname: Long, params: Long, filepath: Long, size: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileFromTokenByTokenNameW(hprocess: Long, token: Long, tokenname: Long, params: Long, filepath: Long, size: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileFromTokenW(hprocess: Long, token: Long, params: Long, filepath: Long, size: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileToken(hprocess: Long, base: Long, filespec: Long, token: Long, size: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileTokenByTokenName(hprocess: Long, base: Long, filespec: Long, tokenname: Long, tokenparameters: Long, token: Long, size: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileTokenByTokenNameW(hprocess: Long, base: Long, filespec: Long, tokenname: Long, tokenparameters: Long, token: Long, size: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileTokenW(hprocess: Long, base: Long, filespec: Long, token: Long, size: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileW(hprocess: Long, base: Long, params: Long, filespec: Long, filepath: Long, size: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceVarFromToken(hprocess: Long, token: Long, params: Long, varname: Long, value: Long, size: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceVarFromTokenW(hprocess: Long, token: Long, params: Long, varname: Long, value: Long, size: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymGetSymFromAddr64(hprocess: Long, qwaddr: Long, pdwdisplacement: Long, symbol: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymGetSymFromName64(hprocess: Long, name: Long, symbol: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymGetSymNext64(hprocess: Long, symbol: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymGetSymPrev64(hprocess: Long, symbol: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymGetSymbolFile(hprocess: Long, sympath: Long, imagefile: Long, type: Int, symbolfile: Long, csymbolfile: Long, dbgfile: Long, cdbgfile: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymGetSymbolFileW(hprocess: Long, sympath: Long, imagefile: Long, type: Int, symbolfile: Long, csymbolfile: Long, dbgfile: Long, cdbgfile: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymGetTypeFromName(hprocess: Long, baseofdll: Long, name: Long, symbol: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymGetTypeFromNameW(hprocess: Long, baseofdll: Long, name: Long, symbol: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymGetTypeInfo(hprocess: Long, modbase: Long, typeid: Int, gettype: Int, pinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymGetTypeInfoEx(hprocess: Long, modbase: Long, params: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymGetUnwindInfo(hprocess: Long, address: Long, buffer: Long, size: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymInitialize(hprocess: Long, usersearchpath: Long, finvadeprocess: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymInitializeW(hprocess: Long, usersearchpath: Long, finvadeprocess: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymLoadModule64(hprocess: Long, hfile: Long, imagename: Long, modulename: Long, baseofdll: Long, sizeofdll: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymLoadModuleEx(hprocess: Long, hfile: Long, imagename: Long, modulename: Long, baseofdll: Long, dllsize: Int, data: Long, flags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymLoadModuleExW(hprocess: Long, hfile: Long, imagename: Long, modulename: Long, baseofdll: Long, dllsize: Int, data: Long, flags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymMatchFileName(filename: Long, match: Long, filenamestop: Long, matchstop: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymMatchFileNameW(filename: Long, match: Long, filenamestop: Long, matchstop: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymMatchString(string: Long, expression: Long, fcase: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymMatchStringA(string: Long, expression: Long, fcase: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymMatchStringW(string: Long, expression: Long, fcase: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymNext(hprocess: Long, si: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymNextW(hprocess: Long, siw: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymPrev(hprocess: Long, si: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymPrevW(hprocess: Long, siw: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymQueryInlineTrace(hprocess: Long, startaddress: Long, startcontext: Int, startretaddress: Long, curaddress: Long, curcontext: Long, curframeindex: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymRefreshModuleList(hprocess: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymRegisterCallback64(hprocess: Long, callbackfunction: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymRegisterCallbackW64(hprocess: Long, callbackfunction: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymRegisterFunctionEntryCallback64(hprocess: Long, callbackfunction: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymSearch(hprocess: Long, baseofdll: Long, index: Int, symtag: Int, mask: Long, address: Long, enumsymbolscallback: Long, usercontext: Long, options: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymSearchW(hprocess: Long, baseofdll: Long, index: Int, symtag: Int, mask: Long, address: Long, enumsymbolscallback: Long, usercontext: Long, options: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymSetContext(hprocess: Long, stackframe: Long, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymSetExtendedOption(option: Int, value: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymSetHomeDirectory(hprocess: Long, dir: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymSetHomeDirectoryW(hprocess: Long, dir: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymSetOptions(symoptions: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymSetParentWindow(hwnd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymSetScopeFromAddr(hprocess: Long, address: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymSetScopeFromIndex(hprocess: Long, baseofdll: Long, index: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymSetScopeFromInlineContext(hprocess: Long, address: Long, inlinecontext: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymSetSearchPath(hprocess: Long, searchpatha: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymSetSearchPathW(hprocess: Long, searchpatha: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymSrvDeltaName(hprocess: Long, sympath: Long, type: Long, file1: Long, file2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymSrvDeltaNameW(hprocess: Long, sympath: Long, type: Long, file1: Long, file2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymSrvGetFileIndexInfo(file: Long, info: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymSrvGetFileIndexInfoW(file: Long, info: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymSrvGetFileIndexString(hprocess: Long, srvpath: Long, file: Long, index: Long, size: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymSrvGetFileIndexStringW(hprocess: Long, srvpath: Long, file: Long, index: Long, size: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymSrvGetFileIndexes(file: Long, id: Long, val1: Long, val2: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymSrvGetFileIndexesW(file: Long, id: Long, val1: Long, val2: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymSrvGetSupplement(hprocess: Long, sympath: Long, node: Long, file: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymSrvGetSupplementW(hprocess: Long, sympath: Long, node: Long, file: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymSrvIsStore(hprocess: Long, path: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymSrvIsStoreW(hprocess: Long, path: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymSrvStoreFile(hprocess: Long, srvpath: Long, file: Long, flags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymSrvStoreFileW(hprocess: Long, srvpath: Long, file: Long, flags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymSrvStoreSupplement(hprocess: Long, srvpath: Long, node: Long, file: Long, flags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymSrvStoreSupplementW(hprocess: Long, sympath: Long, node: Long, file: Long, flags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymUnDName64(sym: Long, undecname: Long, undecnamelength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugSymUnloadModule64(hprocess: Long, baseofdll: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugTerminateProcessOnMemoryExhaustion(failedallocationsize: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugTouchFileTimes(filehandle: Long, psystemtime: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugUnDecorateSymbolName(name: Long, outputstring: Long, maxstringlength: Int, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugUnDecorateSymbolNameW(name: Long, outputstring: Long, maxstringlength: Int, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugUnMapAndLoad(loadedimage: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugUnhandledExceptionFilter(exceptioninfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugUpdateDebugInfoFile(imagefilename: Long, symbolpath: Long, debugfilepath: Long, ntheaders: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugUpdateDebugInfoFileEx(imagefilename: Long, symbolpath: Long, debugfilepath: Long, ntheaders: Long, oldchecksum: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugWaitForDebugEvent(lpdebugevent: Long, dwmilliseconds: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugWaitForDebugEventEx(lpdebugevent: Long, dwmilliseconds: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugWow64GetThreadContext(hthread: Long, lpcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugWow64GetThreadSelectorEntry(hthread: Long, dwselector: Int, lpselectorentry: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugWow64SetThreadContext(hthread: Long, lpcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugWriteProcessMemory(hprocess: Long, lpbaseaddress: Long, lpbuffer: Long, nsize: Long, lpnumberofbyteswritten: Long): Int
}

public actual fun addVectoredContinueHandler(first: UInt, handler: PvectoredExceptionHandler): MutPtr<CVoid> =
    MutPtr(WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugAddVectoredContinueHandler(first.toInt(), 0L))

public actual fun addVectoredExceptionHandler(first: UInt, handler: PvectoredExceptionHandler): MutPtr<CVoid> =
    MutPtr(WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugAddVectoredExceptionHandler(first.toInt(), 0L))

public actual fun beep(dwfreq: UInt, dwduration: UInt): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugBeep(dwfreq.toInt(), dwduration.toInt())

public actual fun bindImage(imagename: Pcstr, dllpath: Pcstr, symbolpath: Pcstr): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugBindImage(imagename.rawAddress, dllpath.rawAddress, symbolpath.rawAddress)

public actual fun bindImageEx(flags: UInt, imagename: Pcstr, dllpath: Pcstr, symbolpath: Pcstr, statusroutine: PimagehlpStatusRoutine): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugBindImageEx(flags.toInt(), imagename.rawAddress, dllpath.rawAddress, symbolpath.rawAddress, 0L)

public actual fun checkRemoteDebuggerPresent(hprocess: Handle, pbdebuggerpresent: MutPtr<Bool>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugCheckRemoteDebuggerPresent(hprocess.rawAddress, pbdebuggerpresent.rawAddress)

public actual fun checkSumMappedFile(baseaddress: ConstPtr<CVoid>, filelength: UInt, headersum: MutPtr<UInt>, checksum: MutPtr<UInt>): MutPtr<ImageNtHeaders64> =
    MutPtr(WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugCheckSumMappedFile(baseaddress.rawAddress, filelength.toInt(), headersum.rawAddress, checksum.rawAddress))

public actual fun closeThreadWaitChainSession(wcthandle: ConstPtr<CVoid>) {
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugCloseThreadWaitChainSession(wcthandle.rawAddress)
}

public actual fun continueDebugEvent(dwprocessid: UInt, dwthreadid: UInt, dwcontinuestatus: Ntstatus): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugContinueDebugEvent(dwprocessid.toInt(), dwthreadid.toInt(), dwcontinuestatus)

public actual fun copyContext(destination: MutPtr<Context>, contextflags: ContextFlags, source: ConstPtr<Context>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugCopyContext(destination.rawAddress, contextflags.toInt(), source.rawAddress)

public actual fun dbgHelpCreateUserDump(filename: Pcstr, callback: PdbghelpCreateUserDumpCallback, userdata: ConstPtr<CVoid>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugDbgHelpCreateUserDump(filename.rawAddress, 0L, userdata.rawAddress)

public actual fun dbgHelpCreateUserDumpW(filename: Pcwstr, callback: PdbghelpCreateUserDumpCallback, userdata: ConstPtr<CVoid>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugDbgHelpCreateUserDumpW(filename.rawAddress, 0L, userdata.rawAddress)

public actual fun debugActiveProcess(dwprocessid: UInt): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugDebugActiveProcess(dwprocessid.toInt())

public actual fun debugActiveProcessStop(dwprocessid: UInt): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugDebugActiveProcessStop(dwprocessid.toInt())

public actual fun debugBreak() {
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugDebugBreak()
}

public actual fun debugBreakProcess(process: Handle): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugDebugBreakProcess(process.rawAddress)

public actual fun debugSetProcessKillOnExit(killonexit: Bool): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugDebugSetProcessKillOnExit(killonexit)

public actual fun decodePointer(ptr: ConstPtr<CVoid>): MutPtr<CVoid> =
    MutPtr(WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugDecodePointer(ptr.rawAddress))

public actual fun decodeRemotePointer(processhandle: Handle, ptr: ConstPtr<CVoid>, decodedptr: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugDecodeRemotePointer(processhandle.rawAddress, ptr.rawAddress, decodedptr.rawAddress)

public actual fun decodeSystemPointer(ptr: ConstPtr<CVoid>): MutPtr<CVoid> =
    MutPtr(WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugDecodeSystemPointer(ptr.rawAddress))

public actual fun encodePointer(ptr: ConstPtr<CVoid>): MutPtr<CVoid> =
    MutPtr(WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugEncodePointer(ptr.rawAddress))

public actual fun encodeRemotePointer(processhandle: Handle, ptr: ConstPtr<CVoid>, encodedptr: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugEncodeRemotePointer(processhandle.rawAddress, ptr.rawAddress, encodedptr.rawAddress)

public actual fun encodeSystemPointer(ptr: ConstPtr<CVoid>): MutPtr<CVoid> =
    MutPtr(WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugEncodeSystemPointer(ptr.rawAddress))

public actual fun enumDirTree(hprocess: Handle, rootpath: Pcstr, inputpathname: Pcstr, outputpathbuffer: Pstr, cb: PenumdirtreeCallback, data: ConstPtr<CVoid>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugEnumDirTree(hprocess.rawAddress, rootpath.rawAddress, inputpathname.rawAddress, outputpathbuffer.rawAddress, 0L, data.rawAddress)

public actual fun enumDirTreeW(hprocess: Handle, rootpath: Pcwstr, inputpathname: Pcwstr, outputpathbuffer: Pwstr, cb: PenumdirtreeCallbackw, data: ConstPtr<CVoid>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugEnumDirTreeW(hprocess.rawAddress, rootpath.rawAddress, inputpathname.rawAddress, outputpathbuffer.rawAddress, 0L, data.rawAddress)

public actual fun enumerateLoadedModules64(hprocess: Handle, enumloadedmodulescallback: PenumloadedModulesCallback64, usercontext: ConstPtr<CVoid>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugEnumerateLoadedModules64(hprocess.rawAddress, 0L, usercontext.rawAddress)

public actual fun enumerateLoadedModulesEx(hprocess: Handle, enumloadedmodulescallback: PenumloadedModulesCallback64, usercontext: ConstPtr<CVoid>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugEnumerateLoadedModulesEx(hprocess.rawAddress, 0L, usercontext.rawAddress)

public actual fun enumerateLoadedModulesExW(hprocess: Handle, enumloadedmodulescallback: PenumloadedModulesCallbackw64, usercontext: ConstPtr<CVoid>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugEnumerateLoadedModulesExW(hprocess.rawAddress, 0L, usercontext.rawAddress)

public actual fun enumerateLoadedModulesW64(hprocess: Handle, enumloadedmodulescallback: PenumloadedModulesCallbackw64, usercontext: ConstPtr<CVoid>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugEnumerateLoadedModulesW64(hprocess.rawAddress, 0L, usercontext.rawAddress)

public actual fun fatalAppExitA(uaction: UInt, lpmessagetext: Pcstr) {
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugFatalAppExitA(uaction.toInt(), lpmessagetext.rawAddress)
}

public actual fun fatalAppExitW(uaction: UInt, lpmessagetext: Pcwstr) {
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugFatalAppExitW(uaction.toInt(), lpmessagetext.rawAddress)
}

public actual fun fatalExit(exitcode: Int): Nothing {
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugFatalExit(exitcode)
    error("Unreachable noreturn C function fatalExit")
}

public actual fun findDebugInfoFile(filename: Pcstr, symbolpath: Pcstr, debugfilepath: Pstr): Handle =
    MutPtr(WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugFindDebugInfoFile(filename.rawAddress, symbolpath.rawAddress, debugfilepath.rawAddress))

public actual fun findDebugInfoFileEx(filename: Pcstr, symbolpath: Pcstr, debugfilepath: Pstr, callback: PfindDebugFileCallback, callerdata: ConstPtr<CVoid>): Handle =
    MutPtr(WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugFindDebugInfoFileEx(filename.rawAddress, symbolpath.rawAddress, debugfilepath.rawAddress, 0L, callerdata.rawAddress))

public actual fun findDebugInfoFileExW(filename: Pcwstr, symbolpath: Pcwstr, debugfilepath: Pwstr, callback: PfindDebugFileCallbackw, callerdata: ConstPtr<CVoid>): Handle =
    MutPtr(WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugFindDebugInfoFileExW(filename.rawAddress, symbolpath.rawAddress, debugfilepath.rawAddress, 0L, callerdata.rawAddress))

public actual fun findExecutableImage(filename: Pcstr, symbolpath: Pcstr, imagefilepath: Pstr): Handle =
    MutPtr(WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugFindExecutableImage(filename.rawAddress, symbolpath.rawAddress, imagefilepath.rawAddress))

public actual fun findExecutableImageEx(filename: Pcstr, symbolpath: Pcstr, imagefilepath: Pstr, callback: PfindExeFileCallback, callerdata: ConstPtr<CVoid>): Handle =
    MutPtr(WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugFindExecutableImageEx(filename.rawAddress, symbolpath.rawAddress, imagefilepath.rawAddress, 0L, callerdata.rawAddress))

public actual fun findExecutableImageExW(filename: Pcwstr, symbolpath: Pcwstr, imagefilepath: Pwstr, callback: PfindExeFileCallbackw, callerdata: ConstPtr<CVoid>): Handle =
    MutPtr(WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugFindExecutableImageExW(filename.rawAddress, symbolpath.rawAddress, imagefilepath.rawAddress, 0L, callerdata.rawAddress))

public actual fun findFileInPath(hprocess: Handle, searchpatha: Pcstr, filename: Pcstr, id: ConstPtr<CVoid>, two: UInt, three: UInt, flags: UInt, filepath: Pstr): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugFindFileInPath(hprocess.rawAddress, searchpatha.rawAddress, filename.rawAddress, id.rawAddress, two.toInt(), three.toInt(), flags.toInt(), filepath.rawAddress)

public actual fun findFileInSearchPath(hprocess: Handle, searchpatha: Pcstr, filename: Pcstr, one: UInt, two: UInt, three: UInt, filepath: Pstr): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugFindFileInSearchPath(hprocess.rawAddress, searchpatha.rawAddress, filename.rawAddress, one.toInt(), two.toInt(), three.toInt(), filepath.rawAddress)

public actual fun flushInstructionCache(hprocess: Handle, lpbaseaddress: ConstPtr<CVoid>, dwsize: ULong): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugFlushInstructionCache(hprocess.rawAddress, lpbaseaddress.rawAddress, dwsize.toLong())

public actual fun formatMessageA(dwflags: FormatMessageOptions, lpsource: ConstPtr<CVoid>, dwmessageid: UInt, dwlanguageid: UInt, lpbuffer: Pstr, nsize: UInt, arguments: ConstPtr<ConstPtr<Byte>>): UInt =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugFormatMessageA(dwflags.toInt(), lpsource.rawAddress, dwmessageid.toInt(), dwlanguageid.toInt(), lpbuffer.rawAddress, nsize.toInt(), arguments.rawAddress).toUInt()

public actual fun formatMessageW(dwflags: FormatMessageOptions, lpsource: ConstPtr<CVoid>, dwmessageid: UInt, dwlanguageid: UInt, lpbuffer: Pwstr, nsize: UInt, arguments: ConstPtr<ConstPtr<Byte>>): UInt =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugFormatMessageW(dwflags.toInt(), lpsource.rawAddress, dwmessageid.toInt(), dwlanguageid.toInt(), lpbuffer.rawAddress, nsize.toInt(), arguments.rawAddress).toUInt()

public actual fun getEnabledXStateFeatures(): ULong =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugGetEnabledXStateFeatures().toULong()

public actual fun getErrorMode(): UInt =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugGetErrorMode().toUInt()

public actual fun getImageConfigInformation(loadedimage: ConstPtr<LoadedImage>, imageconfiginformation: MutPtr<ImageLoadConfigDirectory64>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugGetImageConfigInformation(loadedimage.rawAddress, imageconfiginformation.rawAddress)

public actual fun getImageUnusedHeaderBytes(loadedimage: ConstPtr<LoadedImage>, sizeunusedheaderbytes: MutPtr<UInt>): UInt =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugGetImageUnusedHeaderBytes(loadedimage.rawAddress, sizeunusedheaderbytes.rawAddress).toUInt()

public actual fun getSymLoadError(): UInt =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugGetSymLoadError().toUInt()

public actual fun getThreadContext(hthread: Handle, lpcontext: MutPtr<Context>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugGetThreadContext(hthread.rawAddress, lpcontext.rawAddress)

public actual fun getThreadErrorMode(): UInt =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugGetThreadErrorMode().toUInt()

public actual fun getThreadSelectorEntry(hthread: Handle, dwselector: UInt, lpselectorentry: MutPtr<LdtEntry>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugGetThreadSelectorEntry(hthread.rawAddress, dwselector.toInt(), lpselectorentry.rawAddress)

public actual fun getThreadWaitChain(wcthandle: ConstPtr<CVoid>, context: ULong, flags: WaitChainThreadOptions, threadid: UInt, nodecount: MutPtr<UInt>, nodeinfoarray: MutPtr<WaitchainNodeInfo>, iscycle: MutPtr<Bool>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugGetThreadWaitChain(wcthandle.rawAddress, context.toLong(), flags.toInt(), threadid.toInt(), nodecount.rawAddress, nodeinfoarray.rawAddress, iscycle.rawAddress)

public actual fun getTimestampForLoadedLibrary(module: Hmodule): UInt =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugGetTimestampForLoadedLibrary(module.rawAddress).toUInt()

public actual fun getXStateFeaturesMask(context: ConstPtr<Context>, featuremask: MutPtr<ULong>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugGetXStateFeaturesMask(context.rawAddress, featuremask.rawAddress)

public actual fun imageAddCertificate(filehandle: Handle, certificate: ConstPtr<WinCertificate>, index: MutPtr<UInt>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugImageAddCertificate(filehandle.rawAddress, certificate.rawAddress, index.rawAddress)

public actual fun imageDirectoryEntryToData(base: ConstPtr<CVoid>, mappedasimage: Boolean, directoryentry: ImageDirectoryEntry, size: MutPtr<UInt>): MutPtr<CVoid> =
    MutPtr(WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugImageDirectoryEntryToData(base.rawAddress, mappedasimage, directoryentry.toShort(), size.rawAddress))

public actual fun imageDirectoryEntryToDataEx(base: ConstPtr<CVoid>, mappedasimage: Boolean, directoryentry: ImageDirectoryEntry, size: MutPtr<UInt>, foundheader: MutPtr<MutPtr<ImageSectionHeader>>): MutPtr<CVoid> =
    MutPtr(WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugImageDirectoryEntryToDataEx(base.rawAddress, mappedasimage, directoryentry.toShort(), size.rawAddress, foundheader.rawAddress))

public actual fun imageEnumerateCertificates(filehandle: Handle, typefilter: UShort, certificatecount: MutPtr<UInt>, indices: MutPtr<UInt>, indexcount: UInt): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugImageEnumerateCertificates(filehandle.rawAddress, typefilter.toShort(), certificatecount.rawAddress, indices.rawAddress, indexcount.toInt())

public actual fun imageGetCertificateData(filehandle: Handle, certificateindex: UInt, certificate: MutPtr<WinCertificate>, requiredlength: MutPtr<UInt>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugImageGetCertificateData(filehandle.rawAddress, certificateindex.toInt(), certificate.rawAddress, requiredlength.rawAddress)

public actual fun imageGetCertificateHeader(filehandle: Handle, certificateindex: UInt, certificateheader: MutPtr<WinCertificate>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugImageGetCertificateHeader(filehandle.rawAddress, certificateindex.toInt(), certificateheader.rawAddress)

public actual fun imageGetDigestStream(filehandle: Handle, digestlevel: UInt, digestfunction: DigestFunction, digesthandle: ConstPtr<CVoid>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugImageGetDigestStream(filehandle.rawAddress, digestlevel.toInt(), 0L, digesthandle.rawAddress)

public actual fun imageLoad(dllname: Pcstr, dllpath: Pcstr): MutPtr<LoadedImage> =
    MutPtr(WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugImageLoad(dllname.rawAddress, dllpath.rawAddress))

public actual fun imageNtHeader(base: ConstPtr<CVoid>): MutPtr<ImageNtHeaders64> =
    MutPtr(WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugImageNtHeader(base.rawAddress))

public actual fun imageRemoveCertificate(filehandle: Handle, index: UInt): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugImageRemoveCertificate(filehandle.rawAddress, index.toInt())

public actual fun imageRvaToSection(ntheaders: ConstPtr<ImageNtHeaders64>, base: ConstPtr<CVoid>, rva: UInt): MutPtr<ImageSectionHeader> =
    MutPtr(WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugImageRvaToSection(ntheaders.rawAddress, base.rawAddress, rva.toInt()))

public actual fun imageRvaToVa(ntheaders: ConstPtr<ImageNtHeaders64>, base: ConstPtr<CVoid>, rva: UInt, lastrvasection: ConstPtr<ConstPtr<ImageSectionHeader>>): MutPtr<CVoid> =
    MutPtr(WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugImageRvaToVa(ntheaders.rawAddress, base.rawAddress, rva.toInt(), lastrvasection.rawAddress))

public actual fun imageUnload(loadedimage: MutPtr<LoadedImage>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugImageUnload(loadedimage.rawAddress)

public actual fun imagehlpApiVersion(): MutPtr<ApiVersion> =
    MutPtr(WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugImagehlpApiVersion())

public actual fun imagehlpApiVersionEx(appversion: ConstPtr<ApiVersion>): MutPtr<ApiVersion> =
    MutPtr(WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugImagehlpApiVersionEx(appversion.rawAddress))

public actual fun initializeContext(buffer: MutPtr<CVoid>, contextflags: ContextFlags, context: MutPtr<MutPtr<Context>>, contextlength: MutPtr<UInt>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugInitializeContext(buffer.rawAddress, contextflags.toInt(), context.rawAddress, contextlength.rawAddress)

public actual fun initializeContext2(buffer: MutPtr<CVoid>, contextflags: ContextFlags, context: MutPtr<MutPtr<Context>>, contextlength: MutPtr<UInt>, xstatecompactionmask: ULong): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugInitializeContext2(buffer.rawAddress, contextflags.toInt(), context.rawAddress, contextlength.rawAddress, xstatecompactionmask.toLong())

public actual fun isDebuggerPresent(): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugIsDebuggerPresent()

public actual fun locateXStateFeature(context: ConstPtr<Context>, featureid: UInt, length: MutPtr<UInt>): MutPtr<CVoid> =
    MutPtr(WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugLocateXStateFeature(context.rawAddress, featureid.toInt(), length.rawAddress))

public actual fun makeSureDirectoryPathExists(dirpath: Pcstr): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugMakeSureDirectoryPathExists(dirpath.rawAddress)

public actual fun mapAndLoad(imagename: Pcstr, dllpath: Pcstr, loadedimage: MutPtr<LoadedImage>, dotdll: Bool, readonly: Bool): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugMapAndLoad(imagename.rawAddress, dllpath.rawAddress, loadedimage.rawAddress, dotdll, readonly)

public actual fun mapFileAndCheckSumA(filename: Pcstr, headersum: MutPtr<UInt>, checksum: MutPtr<UInt>): UInt =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugMapFileAndCheckSumA(filename.rawAddress, headersum.rawAddress, checksum.rawAddress).toUInt()

public actual fun mapFileAndCheckSumW(filename: Pcwstr, headersum: MutPtr<UInt>, checksum: MutPtr<UInt>): UInt =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugMapFileAndCheckSumW(filename.rawAddress, headersum.rawAddress, checksum.rawAddress).toUInt()

public actual fun messageBeep(utype: MessageboxStyle): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugMessageBeep(utype.toInt())

public actual fun miniDumpReadDumpStream(baseofdump: ConstPtr<CVoid>, streamnumber: UInt, dir: MutPtr<MutPtr<MinidumpDirectory>>, streampointer: MutPtr<MutPtr<CVoid>>, streamsize: MutPtr<UInt>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugMiniDumpReadDumpStream(baseofdump.rawAddress, streamnumber.toInt(), dir.rawAddress, streampointer.rawAddress, streamsize.rawAddress)

public actual fun miniDumpWriteDump(hprocess: Handle, processid: UInt, hfile: Handle, dumptype: MinidumpType, exceptionparam: ConstPtr<MinidumpExceptionInformation>, userstreamparam: ConstPtr<MinidumpUserStreamInformation>, callbackparam: ConstPtr<MinidumpCallbackInformation>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugMiniDumpWriteDump(hprocess.rawAddress, processid.toInt(), hfile.rawAddress, dumptype, exceptionparam.rawAddress, userstreamparam.rawAddress, callbackparam.rawAddress)

public actual fun openThreadWaitChainSession(flags: OpenThreadWaitChainSessionFlags, callback: Pwaitchaincallback): MutPtr<CVoid> =
    MutPtr(WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugOpenThreadWaitChainSession(flags.toInt(), 0L))

public actual fun outputDebugStringA(lpoutputstring: Pcstr) {
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugOutputDebugStringA(lpoutputstring.rawAddress)
}

public actual fun outputDebugStringW(lpoutputstring: Pcwstr) {
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugOutputDebugStringW(lpoutputstring.rawAddress)
}

public actual fun raiseException(dwexceptioncode: UInt, dwexceptionflags: UInt, nnumberofarguments: UInt, lparguments: ConstPtr<ULong>) {
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugRaiseException(dwexceptioncode.toInt(), dwexceptionflags.toInt(), nnumberofarguments.toInt(), lparguments.rawAddress)
}

public actual fun raiseFailFastException(pexceptionrecord: ConstPtr<ExceptionRecord>, pcontextrecord: ConstPtr<Context>, dwflags: UInt) {
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugRaiseFailFastException(pexceptionrecord.rawAddress, pcontextrecord.rawAddress, dwflags.toInt())
}

public actual fun rangeMapAddPeImageSections(rmaphandle: ConstPtr<CVoid>, imagename: Pcwstr, mappedimage: ConstPtr<CVoid>, mappingbytes: UInt, imagebase: ULong, usertag: ULong, mappingflags: UInt): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugRangeMapAddPeImageSections(rmaphandle.rawAddress, imagename.rawAddress, mappedimage.rawAddress, mappingbytes.toInt(), imagebase.toLong(), usertag.toLong(), mappingflags.toInt())

public actual fun rangeMapCreate(): MutPtr<CVoid> =
    MutPtr(WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugRangeMapCreate())

public actual fun rangeMapFree(rmaphandle: ConstPtr<CVoid>) {
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugRangeMapFree(rmaphandle.rawAddress)
}

public actual fun rangeMapRead(rmaphandle: ConstPtr<CVoid>, offset: ULong, buffer: MutPtr<CVoid>, requestbytes: UInt, flags: UInt, donebytes: MutPtr<UInt>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugRangeMapRead(rmaphandle.rawAddress, offset.toLong(), buffer.rawAddress, requestbytes.toInt(), flags.toInt(), donebytes.rawAddress)

public actual fun rangeMapRemove(rmaphandle: ConstPtr<CVoid>, usertag: ULong): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugRangeMapRemove(rmaphandle.rawAddress, usertag.toLong())

public actual fun rangeMapWrite(rmaphandle: ConstPtr<CVoid>, offset: ULong, buffer: ConstPtr<CVoid>, requestbytes: UInt, flags: UInt, donebytes: MutPtr<UInt>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugRangeMapWrite(rmaphandle.rawAddress, offset.toLong(), buffer.rawAddress, requestbytes.toInt(), flags.toInt(), donebytes.rawAddress)

public actual fun reBaseImage(currentimagename: Pcstr, symbolpath: Pcstr, frebase: Bool, frebasesysfileok: Bool, fgoingdown: Bool, checkimagesize: UInt, oldimagesize: MutPtr<UInt>, oldimagebase: MutPtr<ULong>, newimagesize: MutPtr<UInt>, newimagebase: MutPtr<ULong>, timestamp: UInt): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugReBaseImage(currentimagename.rawAddress, symbolpath.rawAddress, frebase, frebasesysfileok, fgoingdown, checkimagesize.toInt(), oldimagesize.rawAddress, oldimagebase.rawAddress, newimagesize.rawAddress, newimagebase.rawAddress, timestamp.toInt())

public actual fun reBaseImage64(currentimagename: Pcstr, symbolpath: Pcstr, frebase: Bool, frebasesysfileok: Bool, fgoingdown: Bool, checkimagesize: UInt, oldimagesize: MutPtr<UInt>, oldimagebase: MutPtr<ULong>, newimagesize: MutPtr<UInt>, newimagebase: MutPtr<ULong>, timestamp: UInt): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugReBaseImage64(currentimagename.rawAddress, symbolpath.rawAddress, frebase, frebasesysfileok, fgoingdown, checkimagesize.toInt(), oldimagesize.rawAddress, oldimagebase.rawAddress, newimagesize.rawAddress, newimagebase.rawAddress, timestamp.toInt())

public actual fun readProcessMemory(hprocess: Handle, lpbaseaddress: ConstPtr<CVoid>, lpbuffer: MutPtr<CVoid>, nsize: ULong, lpnumberofbytesread: MutPtr<ULong>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugReadProcessMemory(hprocess.rawAddress, lpbaseaddress.rawAddress, lpbuffer.rawAddress, nsize.toLong(), lpnumberofbytesread.rawAddress)

public actual fun registerWaitChainCOMCallback(callstatecallback: Pcogetcallstate, activationstatecallback: Pcogetactivationstate) {
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugRegisterWaitChainCOMCallback(0L, 0L)
}

public actual fun removeInvalidModuleList(hprocess: Handle) {
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugRemoveInvalidModuleList(hprocess.rawAddress)
}

public actual fun removeVectoredContinueHandler(handle: ConstPtr<CVoid>): UInt =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugRemoveVectoredContinueHandler(handle.rawAddress).toUInt()

public actual fun removeVectoredExceptionHandler(handle: ConstPtr<CVoid>): UInt =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugRemoveVectoredExceptionHandler(handle.rawAddress).toUInt()

public actual fun reportSymbolLoadSummary(hprocess: Handle, ploadmodule: Pcwstr, psymboldata: ConstPtr<DbghelpDataReportStruct>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugReportSymbolLoadSummary(hprocess.rawAddress, ploadmodule.rawAddress, psymboldata.rawAddress)

public actual fun rtlAddFunctionTable(functiontable: ConstPtr<ImageRuntimeFunctionEntry>, entrycount: UInt, baseaddress: ULong): Boolean =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugRtlAddFunctionTable(functiontable.rawAddress, entrycount.toInt(), baseaddress.toLong())

public actual fun rtlAddGrowableFunctionTable(dynamictable: MutPtr<MutPtr<CVoid>>, functiontable: ConstPtr<ImageRuntimeFunctionEntry>, entrycount: UInt, maximumentrycount: UInt, rangebase: ULong, rangeend: ULong): UInt =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugRtlAddGrowableFunctionTable(dynamictable.rawAddress, functiontable.rawAddress, entrycount.toInt(), maximumentrycount.toInt(), rangebase.toLong(), rangeend.toLong()).toUInt()

public actual fun rtlCaptureContext(contextrecord: MutPtr<Context>) {
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugRtlCaptureContext(contextrecord.rawAddress)
}

public actual fun rtlCaptureContext2(contextrecord: MutPtr<Context>) {
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugRtlCaptureContext2(contextrecord.rawAddress)
}

public actual fun rtlCaptureStackBackTrace(framestoskip: UInt, framestocapture: UInt, backtrace: MutPtr<MutPtr<CVoid>>, backtracehash: MutPtr<UInt>): UShort =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugRtlCaptureStackBackTrace(framestoskip.toInt(), framestocapture.toInt(), backtrace.rawAddress, backtracehash.rawAddress).toUShort()

public actual fun rtlDeleteFunctionTable(functiontable: ConstPtr<ImageRuntimeFunctionEntry>): Boolean =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugRtlDeleteFunctionTable(functiontable.rawAddress)

public actual fun rtlDeleteGrowableFunctionTable(dynamictable: ConstPtr<CVoid>) {
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugRtlDeleteGrowableFunctionTable(dynamictable.rawAddress)
}

public actual fun rtlGrowFunctionTable(dynamictable: MutPtr<CVoid>, newentrycount: UInt) {
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugRtlGrowFunctionTable(dynamictable.rawAddress, newentrycount.toInt())
}

public actual fun rtlInstallFunctionTableCallback(tableidentifier: ULong, baseaddress: ULong, length: UInt, callback: PgetRuntimeFunctionCallback, context: ConstPtr<CVoid>, outofprocesscallbackdll: Pcwstr): Boolean =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugRtlInstallFunctionTableCallback(tableidentifier.toLong(), baseaddress.toLong(), length.toInt(), 0L, context.rawAddress, outofprocesscallbackdll.rawAddress)

public actual fun rtlLookupFunctionEntry(controlpc: ULong, imagebase: MutPtr<ULong>, historytable: MutPtr<UnwindHistoryTable>): MutPtr<ImageRuntimeFunctionEntry> =
    MutPtr(WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugRtlLookupFunctionEntry(controlpc.toLong(), imagebase.rawAddress, historytable.rawAddress))

public actual fun rtlPcToFileHeader(pcvalue: ConstPtr<CVoid>, baseofimage: MutPtr<MutPtr<CVoid>>): MutPtr<CVoid> =
    MutPtr(WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugRtlPcToFileHeader(pcvalue.rawAddress, baseofimage.rawAddress))

public actual fun rtlRaiseException(exceptionrecord: ConstPtr<ExceptionRecord>) {
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugRtlRaiseException(exceptionrecord.rawAddress)
}

public actual fun rtlRestoreContext(contextrecord: ConstPtr<Context>, exceptionrecord: ConstPtr<ExceptionRecord>) {
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugRtlRestoreContext(contextrecord.rawAddress, exceptionrecord.rawAddress)
}

public actual fun rtlUnwind(targetframe: ConstPtr<CVoid>, targetip: ConstPtr<CVoid>, exceptionrecord: ConstPtr<ExceptionRecord>, returnvalue: ConstPtr<CVoid>) {
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugRtlUnwind(targetframe.rawAddress, targetip.rawAddress, exceptionrecord.rawAddress, returnvalue.rawAddress)
}

public actual fun rtlUnwindEx(targetframe: ConstPtr<CVoid>, targetip: ConstPtr<CVoid>, exceptionrecord: ConstPtr<ExceptionRecord>, returnvalue: ConstPtr<CVoid>, contextrecord: ConstPtr<Context>, historytable: ConstPtr<UnwindHistoryTable>) {
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugRtlUnwindEx(targetframe.rawAddress, targetip.rawAddress, exceptionrecord.rawAddress, returnvalue.rawAddress, contextrecord.rawAddress, historytable.rawAddress)
}

public actual fun rtlVirtualUnwind(handlertype: RtlVirtualUnwindHandlerType, imagebase: ULong, controlpc: ULong, functionentry: ConstPtr<ImageRuntimeFunctionEntry>, contextrecord: MutPtr<Context>, handlerdata: MutPtr<MutPtr<CVoid>>, establisherframe: MutPtr<ULong>, contextpointers: MutPtr<KnonvolatileContextPointers>): ExceptionRoutine =
    null

public actual fun searchTreeForFile(rootpath: Pcstr, inputpathname: Pcstr, outputpathbuffer: Pstr): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSearchTreeForFile(rootpath.rawAddress, inputpathname.rawAddress, outputpathbuffer.rawAddress)

public actual fun searchTreeForFileW(rootpath: Pcwstr, inputpathname: Pcwstr, outputpathbuffer: Pwstr): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSearchTreeForFileW(rootpath.rawAddress, inputpathname.rawAddress, outputpathbuffer.rawAddress)

public actual fun setCheckUserInterruptShared(lpstartaddress: LpcallBackUserInterruptRoutine) {
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSetCheckUserInterruptShared(0L)
}

public actual fun setErrorMode(umode: ThreadErrorMode): ThreadErrorMode =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSetErrorMode(umode.toInt()).toUInt()

public actual fun setImageConfigInformation(loadedimage: MutPtr<LoadedImage>, imageconfiginformation: ConstPtr<ImageLoadConfigDirectory64>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSetImageConfigInformation(loadedimage.rawAddress, imageconfiginformation.rawAddress)

public actual fun setSymLoadError(error: UInt) {
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSetSymLoadError(error.toInt())
}

public actual fun setThreadContext(hthread: Handle, lpcontext: ConstPtr<Context>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSetThreadContext(hthread.rawAddress, lpcontext.rawAddress)

public actual fun setThreadErrorMode(dwnewmode: ThreadErrorMode, lpoldmode: MutPtr<ThreadErrorMode>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSetThreadErrorMode(dwnewmode.toInt(), lpoldmode.rawAddress)

public actual fun setUnhandledExceptionFilter(lptoplevelexceptionfilter: LptopLevelExceptionFilter): LptopLevelExceptionFilter =
    null

public actual fun setXStateFeaturesMask(context: MutPtr<Context>, featuremask: ULong): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSetXStateFeaturesMask(context.rawAddress, featuremask.toLong())

public actual fun stackWalk2(machinetype: UInt, hprocess: Handle, hthread: Handle, stackframe: MutPtr<StackframeEx>, contextrecord: MutPtr<CVoid>, readmemoryroutine: PreadProcessMemoryRoutine64, functiontableaccessroutine: PfunctionTableAccessRoutine64, getmodulebaseroutine: PgetModuleBaseRoutine64, translateaddress: PtranslateAddressRoutine64, gettargetattributevalue: PgetTargetAttributeValue64, flags: UInt): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugStackWalk2(machinetype.toInt(), hprocess.rawAddress, hthread.rawAddress, stackframe.rawAddress, contextrecord.rawAddress, 0L, 0L, 0L, 0L, 0L, flags.toInt())

public actual fun stackWalk64(machinetype: UInt, hprocess: Handle, hthread: Handle, stackframe: MutPtr<Stackframe64>, contextrecord: MutPtr<CVoid>, readmemoryroutine: PreadProcessMemoryRoutine64, functiontableaccessroutine: PfunctionTableAccessRoutine64, getmodulebaseroutine: PgetModuleBaseRoutine64, translateaddress: PtranslateAddressRoutine64): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugStackWalk64(machinetype.toInt(), hprocess.rawAddress, hthread.rawAddress, stackframe.rawAddress, contextrecord.rawAddress, 0L, 0L, 0L, 0L)

public actual fun stackWalkEx(machinetype: UInt, hprocess: Handle, hthread: Handle, stackframe: MutPtr<StackframeEx>, contextrecord: MutPtr<CVoid>, readmemoryroutine: PreadProcessMemoryRoutine64, functiontableaccessroutine: PfunctionTableAccessRoutine64, getmodulebaseroutine: PgetModuleBaseRoutine64, translateaddress: PtranslateAddressRoutine64, flags: UInt): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugStackWalkEx(machinetype.toInt(), hprocess.rawAddress, hthread.rawAddress, stackframe.rawAddress, contextrecord.rawAddress, 0L, 0L, 0L, 0L, flags.toInt())

public actual fun symAddSourceStream(hprocess: Handle, base: ULong, streamfile: Pcstr, buffer: ConstPtr<UByte>, size: ULong): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymAddSourceStream(hprocess.rawAddress, base.toLong(), streamfile.rawAddress, buffer.rawAddress, size.toLong())

public actual fun symAddSourceStreamA(hprocess: Handle, base: ULong, streamfile: Pcstr, buffer: ConstPtr<UByte>, size: ULong): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymAddSourceStreamA(hprocess.rawAddress, base.toLong(), streamfile.rawAddress, buffer.rawAddress, size.toLong())

public actual fun symAddSourceStreamW(hprocess: Handle, base: ULong, filespec: Pcwstr, buffer: ConstPtr<UByte>, size: ULong): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymAddSourceStreamW(hprocess.rawAddress, base.toLong(), filespec.rawAddress, buffer.rawAddress, size.toLong())

public actual fun symAddSymbol(hprocess: Handle, baseofdll: ULong, name: Pcstr, address: ULong, size: UInt, flags: UInt): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymAddSymbol(hprocess.rawAddress, baseofdll.toLong(), name.rawAddress, address.toLong(), size.toInt(), flags.toInt())

public actual fun symAddSymbolW(hprocess: Handle, baseofdll: ULong, name: Pcwstr, address: ULong, size: UInt, flags: UInt): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymAddSymbolW(hprocess.rawAddress, baseofdll.toLong(), name.rawAddress, address.toLong(), size.toInt(), flags.toInt())

public actual fun symAddrIncludeInlineTrace(hprocess: Handle, address: ULong): UInt =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymAddrIncludeInlineTrace(hprocess.rawAddress, address.toLong()).toUInt()

public actual fun symCleanup(hprocess: Handle): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymCleanup(hprocess.rawAddress)

public actual fun symCompareInlineTrace(hprocess: Handle, address1: ULong, inlinecontext1: UInt, retaddress1: ULong, address2: ULong, retaddress2: ULong): UInt =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymCompareInlineTrace(hprocess.rawAddress, address1.toLong(), inlinecontext1.toInt(), retaddress1.toLong(), address2.toLong(), retaddress2.toLong()).toUInt()

public actual fun symDeleteSymbol(hprocess: Handle, baseofdll: ULong, name: Pcstr, address: ULong, flags: UInt): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymDeleteSymbol(hprocess.rawAddress, baseofdll.toLong(), name.rawAddress, address.toLong(), flags.toInt())

public actual fun symDeleteSymbolW(hprocess: Handle, baseofdll: ULong, name: Pcwstr, address: ULong, flags: UInt): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymDeleteSymbolW(hprocess.rawAddress, baseofdll.toLong(), name.rawAddress, address.toLong(), flags.toInt())

public actual fun symEnumLines(hprocess: Handle, base: ULong, obj: Pcstr, file: Pcstr, enumlinescallback: PsymEnumlinesCallback, usercontext: ConstPtr<CVoid>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymEnumLines(hprocess.rawAddress, base.toLong(), obj.rawAddress, file.rawAddress, 0L, usercontext.rawAddress)

public actual fun symEnumLinesW(hprocess: Handle, base: ULong, obj: Pcwstr, file: Pcwstr, enumlinescallback: PsymEnumlinesCallbackw, usercontext: ConstPtr<CVoid>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymEnumLinesW(hprocess.rawAddress, base.toLong(), obj.rawAddress, file.rawAddress, 0L, usercontext.rawAddress)

public actual fun symEnumProcesses(enumprocessescallback: PsymEnumprocessesCallback, usercontext: ConstPtr<CVoid>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymEnumProcesses(0L, usercontext.rawAddress)

public actual fun symEnumSourceFileTokens(hprocess: Handle, base: ULong, callback: Penumsourcefiletokenscallback): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSourceFileTokens(hprocess.rawAddress, base.toLong(), 0L)

public actual fun symEnumSourceFiles(hprocess: Handle, modbase: ULong, mask: Pcstr, cbsrcfiles: PsymEnumsourcefilesCallback, usercontext: ConstPtr<CVoid>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSourceFiles(hprocess.rawAddress, modbase.toLong(), mask.rawAddress, 0L, usercontext.rawAddress)

public actual fun symEnumSourceFilesW(hprocess: Handle, modbase: ULong, mask: Pcwstr, cbsrcfiles: PsymEnumsourcefilesCallbackw, usercontext: ConstPtr<CVoid>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSourceFilesW(hprocess.rawAddress, modbase.toLong(), mask.rawAddress, 0L, usercontext.rawAddress)

public actual fun symEnumSourceLines(hprocess: Handle, base: ULong, obj: Pcstr, file: Pcstr, line: UInt, flags: UInt, enumlinescallback: PsymEnumlinesCallback, usercontext: ConstPtr<CVoid>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSourceLines(hprocess.rawAddress, base.toLong(), obj.rawAddress, file.rawAddress, line.toInt(), flags.toInt(), 0L, usercontext.rawAddress)

public actual fun symEnumSourceLinesW(hprocess: Handle, base: ULong, obj: Pcwstr, file: Pcwstr, line: UInt, flags: UInt, enumlinescallback: PsymEnumlinesCallbackw, usercontext: ConstPtr<CVoid>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSourceLinesW(hprocess.rawAddress, base.toLong(), obj.rawAddress, file.rawAddress, line.toInt(), flags.toInt(), 0L, usercontext.rawAddress)

public actual fun symEnumSym(hprocess: Handle, baseofdll: ULong, enumsymbolscallback: PsymEnumeratesymbolsCallback, usercontext: ConstPtr<CVoid>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSym(hprocess.rawAddress, baseofdll.toLong(), 0L, usercontext.rawAddress)

public actual fun symEnumSymbols(hprocess: Handle, baseofdll: ULong, mask: Pcstr, enumsymbolscallback: PsymEnumeratesymbolsCallback, usercontext: ConstPtr<CVoid>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSymbols(hprocess.rawAddress, baseofdll.toLong(), mask.rawAddress, 0L, usercontext.rawAddress)

public actual fun symEnumSymbolsEx(hprocess: Handle, baseofdll: ULong, mask: Pcstr, enumsymbolscallback: PsymEnumeratesymbolsCallback, usercontext: ConstPtr<CVoid>, options: UInt): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSymbolsEx(hprocess.rawAddress, baseofdll.toLong(), mask.rawAddress, 0L, usercontext.rawAddress, options.toInt())

public actual fun symEnumSymbolsExW(hprocess: Handle, baseofdll: ULong, mask: Pcwstr, enumsymbolscallback: PsymEnumeratesymbolsCallbackw, usercontext: ConstPtr<CVoid>, options: UInt): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSymbolsExW(hprocess.rawAddress, baseofdll.toLong(), mask.rawAddress, 0L, usercontext.rawAddress, options.toInt())

public actual fun symEnumSymbolsForAddr(hprocess: Handle, address: ULong, enumsymbolscallback: PsymEnumeratesymbolsCallback, usercontext: ConstPtr<CVoid>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSymbolsForAddr(hprocess.rawAddress, address.toLong(), 0L, usercontext.rawAddress)

public actual fun symEnumSymbolsForAddrW(hprocess: Handle, address: ULong, enumsymbolscallback: PsymEnumeratesymbolsCallbackw, usercontext: ConstPtr<CVoid>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSymbolsForAddrW(hprocess.rawAddress, address.toLong(), 0L, usercontext.rawAddress)

public actual fun symEnumSymbolsW(hprocess: Handle, baseofdll: ULong, mask: Pcwstr, enumsymbolscallback: PsymEnumeratesymbolsCallbackw, usercontext: ConstPtr<CVoid>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSymbolsW(hprocess.rawAddress, baseofdll.toLong(), mask.rawAddress, 0L, usercontext.rawAddress)

public actual fun symEnumTypes(hprocess: Handle, baseofdll: ULong, enumsymbolscallback: PsymEnumeratesymbolsCallback, usercontext: ConstPtr<CVoid>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymEnumTypes(hprocess.rawAddress, baseofdll.toLong(), 0L, usercontext.rawAddress)

public actual fun symEnumTypesByName(hprocess: Handle, baseofdll: ULong, mask: Pcstr, enumsymbolscallback: PsymEnumeratesymbolsCallback, usercontext: ConstPtr<CVoid>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymEnumTypesByName(hprocess.rawAddress, baseofdll.toLong(), mask.rawAddress, 0L, usercontext.rawAddress)

public actual fun symEnumTypesByNameW(hprocess: Handle, baseofdll: ULong, mask: Pcwstr, enumsymbolscallback: PsymEnumeratesymbolsCallbackw, usercontext: ConstPtr<CVoid>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymEnumTypesByNameW(hprocess.rawAddress, baseofdll.toLong(), mask.rawAddress, 0L, usercontext.rawAddress)

public actual fun symEnumTypesW(hprocess: Handle, baseofdll: ULong, enumsymbolscallback: PsymEnumeratesymbolsCallbackw, usercontext: ConstPtr<CVoid>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymEnumTypesW(hprocess.rawAddress, baseofdll.toLong(), 0L, usercontext.rawAddress)

public actual fun symEnumerateModules64(hprocess: Handle, enummodulescallback: PsymEnummodulesCallback64, usercontext: ConstPtr<CVoid>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymEnumerateModules64(hprocess.rawAddress, 0L, usercontext.rawAddress)

public actual fun symEnumerateModulesW64(hprocess: Handle, enummodulescallback: PsymEnummodulesCallbackw64, usercontext: ConstPtr<CVoid>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymEnumerateModulesW64(hprocess.rawAddress, 0L, usercontext.rawAddress)

public actual fun symEnumerateSymbols64(hprocess: Handle, baseofdll: ULong, enumsymbolscallback: PsymEnumsymbolsCallback64, usercontext: ConstPtr<CVoid>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymEnumerateSymbols64(hprocess.rawAddress, baseofdll.toLong(), 0L, usercontext.rawAddress)

public actual fun symEnumerateSymbolsW64(hprocess: Handle, baseofdll: ULong, enumsymbolscallback: PsymEnumsymbolsCallback64w, usercontext: ConstPtr<CVoid>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymEnumerateSymbolsW64(hprocess.rawAddress, baseofdll.toLong(), 0L, usercontext.rawAddress)

public actual fun symFindDebugInfoFile(hprocess: Handle, filename: Pcstr, debugfilepath: Pstr, callback: PfindDebugFileCallback, callerdata: ConstPtr<CVoid>): Handle =
    MutPtr(WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymFindDebugInfoFile(hprocess.rawAddress, filename.rawAddress, debugfilepath.rawAddress, 0L, callerdata.rawAddress))

public actual fun symFindDebugInfoFileW(hprocess: Handle, filename: Pcwstr, debugfilepath: Pwstr, callback: PfindDebugFileCallbackw, callerdata: ConstPtr<CVoid>): Handle =
    MutPtr(WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymFindDebugInfoFileW(hprocess.rawAddress, filename.rawAddress, debugfilepath.rawAddress, 0L, callerdata.rawAddress))

public actual fun symFindExecutableImage(hprocess: Handle, filename: Pcstr, imagefilepath: Pstr, callback: PfindExeFileCallback, callerdata: ConstPtr<CVoid>): Handle =
    MutPtr(WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymFindExecutableImage(hprocess.rawAddress, filename.rawAddress, imagefilepath.rawAddress, 0L, callerdata.rawAddress))

public actual fun symFindExecutableImageW(hprocess: Handle, filename: Pcwstr, imagefilepath: Pwstr, callback: PfindExeFileCallbackw, callerdata: ConstPtr<CVoid>): Handle =
    MutPtr(WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymFindExecutableImageW(hprocess.rawAddress, filename.rawAddress, imagefilepath.rawAddress, 0L, callerdata.rawAddress))

public actual fun symFindFileInPath(hprocess: Handle, searchpatha: Pcstr, filename: Pcstr, id: ConstPtr<CVoid>, two: UInt, three: UInt, flags: SymFindIdOption, foundfile: Pstr, callback: Pfindfileinpathcallback, context: ConstPtr<CVoid>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymFindFileInPath(hprocess.rawAddress, searchpatha.rawAddress, filename.rawAddress, id.rawAddress, two.toInt(), three.toInt(), flags.toInt(), foundfile.rawAddress, 0L, context.rawAddress)

public actual fun symFindFileInPathW(hprocess: Handle, searchpatha: Pcwstr, filename: Pcwstr, id: ConstPtr<CVoid>, two: UInt, three: UInt, flags: SymFindIdOption, foundfile: Pwstr, callback: Pfindfileinpathcallbackw, context: ConstPtr<CVoid>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymFindFileInPathW(hprocess.rawAddress, searchpatha.rawAddress, filename.rawAddress, id.rawAddress, two.toInt(), three.toInt(), flags.toInt(), foundfile.rawAddress, 0L, context.rawAddress)

public actual fun symFromAddr(hprocess: Handle, address: ULong, displacement: MutPtr<ULong>, symbol: MutPtr<SymbolInfo>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymFromAddr(hprocess.rawAddress, address.toLong(), displacement.rawAddress, symbol.rawAddress)

public actual fun symFromAddrW(hprocess: Handle, address: ULong, displacement: MutPtr<ULong>, symbol: MutPtr<SymbolInfow>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymFromAddrW(hprocess.rawAddress, address.toLong(), displacement.rawAddress, symbol.rawAddress)

public actual fun symFromIndex(hprocess: Handle, baseofdll: ULong, index: UInt, symbol: MutPtr<SymbolInfo>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymFromIndex(hprocess.rawAddress, baseofdll.toLong(), index.toInt(), symbol.rawAddress)

public actual fun symFromIndexW(hprocess: Handle, baseofdll: ULong, index: UInt, symbol: MutPtr<SymbolInfow>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymFromIndexW(hprocess.rawAddress, baseofdll.toLong(), index.toInt(), symbol.rawAddress)

public actual fun symFromInlineContext(hprocess: Handle, address: ULong, inlinecontext: UInt, displacement: MutPtr<ULong>, symbol: MutPtr<SymbolInfo>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymFromInlineContext(hprocess.rawAddress, address.toLong(), inlinecontext.toInt(), displacement.rawAddress, symbol.rawAddress)

public actual fun symFromInlineContextW(hprocess: Handle, address: ULong, inlinecontext: UInt, displacement: MutPtr<ULong>, symbol: MutPtr<SymbolInfow>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymFromInlineContextW(hprocess.rawAddress, address.toLong(), inlinecontext.toInt(), displacement.rawAddress, symbol.rawAddress)

public actual fun symFromName(hprocess: Handle, name: Pcstr, symbol: MutPtr<SymbolInfo>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymFromName(hprocess.rawAddress, name.rawAddress, symbol.rawAddress)

public actual fun symFromNameW(hprocess: Handle, name: Pcwstr, symbol: MutPtr<SymbolInfow>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymFromNameW(hprocess.rawAddress, name.rawAddress, symbol.rawAddress)

public actual fun symFromToken(hprocess: Handle, base: ULong, token: UInt, symbol: MutPtr<SymbolInfo>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymFromToken(hprocess.rawAddress, base.toLong(), token.toInt(), symbol.rawAddress)

public actual fun symFromTokenW(hprocess: Handle, base: ULong, token: UInt, symbol: MutPtr<SymbolInfow>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymFromTokenW(hprocess.rawAddress, base.toLong(), token.toInt(), symbol.rawAddress)

public actual fun symFunctionTableAccess64(hprocess: Handle, addrbase: ULong): MutPtr<CVoid> =
    MutPtr(WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymFunctionTableAccess64(hprocess.rawAddress, addrbase.toLong()))

public actual fun symFunctionTableAccess64AccessRoutines(hprocess: Handle, addrbase: ULong, readmemoryroutine: PreadProcessMemoryRoutine64, getmodulebaseroutine: PgetModuleBaseRoutine64): MutPtr<CVoid> =
    MutPtr(WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymFunctionTableAccess64AccessRoutines(hprocess.rawAddress, addrbase.toLong(), 0L, 0L))

public actual fun symGetExtendedOption(option: ImagehlpExtendedOptions): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymGetExtendedOption(option)

public actual fun symGetFileLineOffsets64(hprocess: Handle, modulename: Pcstr, filename: Pcstr, buffer: MutPtr<ULong>, bufferlines: UInt): UInt =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymGetFileLineOffsets64(hprocess.rawAddress, modulename.rawAddress, filename.rawAddress, buffer.rawAddress, bufferlines.toInt()).toUInt()

public actual fun symGetHomeDirectory(type: UInt, dir: Pstr, size: ULong): Pstr =
    MutPtr(WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymGetHomeDirectory(type.toInt(), dir.rawAddress, size.toLong()))

public actual fun symGetHomeDirectoryW(type: UInt, dir: Pwstr, size: ULong): Pwstr =
    MutPtr(WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymGetHomeDirectoryW(type.toInt(), dir.rawAddress, size.toLong()))

public actual fun symGetLineFromAddr64(hprocess: Handle, qwaddr: ULong, pdwdisplacement: MutPtr<UInt>, line64: MutPtr<ImagehlpLine64>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymGetLineFromAddr64(hprocess.rawAddress, qwaddr.toLong(), pdwdisplacement.rawAddress, line64.rawAddress)

public actual fun symGetLineFromAddrW64(hprocess: Handle, dwaddr: ULong, pdwdisplacement: MutPtr<UInt>, line: MutPtr<ImagehlpLinew64>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymGetLineFromAddrW64(hprocess.rawAddress, dwaddr.toLong(), pdwdisplacement.rawAddress, line.rawAddress)

public actual fun symGetLineFromInlineContext(hprocess: Handle, qwaddr: ULong, inlinecontext: UInt, qwmodulebaseaddress: ULong, pdwdisplacement: MutPtr<UInt>, line64: MutPtr<ImagehlpLine64>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymGetLineFromInlineContext(hprocess.rawAddress, qwaddr.toLong(), inlinecontext.toInt(), qwmodulebaseaddress.toLong(), pdwdisplacement.rawAddress, line64.rawAddress)

public actual fun symGetLineFromInlineContextW(hprocess: Handle, dwaddr: ULong, inlinecontext: UInt, qwmodulebaseaddress: ULong, pdwdisplacement: MutPtr<UInt>, line: MutPtr<ImagehlpLinew64>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymGetLineFromInlineContextW(hprocess.rawAddress, dwaddr.toLong(), inlinecontext.toInt(), qwmodulebaseaddress.toLong(), pdwdisplacement.rawAddress, line.rawAddress)

public actual fun symGetLineFromName64(hprocess: Handle, modulename: Pcstr, filename: Pcstr, dwlinenumber: UInt, pldisplacement: MutPtr<Int>, line: MutPtr<ImagehlpLine64>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymGetLineFromName64(hprocess.rawAddress, modulename.rawAddress, filename.rawAddress, dwlinenumber.toInt(), pldisplacement.rawAddress, line.rawAddress)

public actual fun symGetLineFromNameW64(hprocess: Handle, modulename: Pcwstr, filename: Pcwstr, dwlinenumber: UInt, pldisplacement: MutPtr<Int>, line: MutPtr<ImagehlpLinew64>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymGetLineFromNameW64(hprocess.rawAddress, modulename.rawAddress, filename.rawAddress, dwlinenumber.toInt(), pldisplacement.rawAddress, line.rawAddress)

public actual fun symGetLineNext64(hprocess: Handle, line: MutPtr<ImagehlpLine64>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymGetLineNext64(hprocess.rawAddress, line.rawAddress)

public actual fun symGetLineNextW64(hprocess: Handle, line: MutPtr<ImagehlpLinew64>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymGetLineNextW64(hprocess.rawAddress, line.rawAddress)

public actual fun symGetLinePrev64(hprocess: Handle, line: MutPtr<ImagehlpLine64>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymGetLinePrev64(hprocess.rawAddress, line.rawAddress)

public actual fun symGetLinePrevW64(hprocess: Handle, line: MutPtr<ImagehlpLinew64>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymGetLinePrevW64(hprocess.rawAddress, line.rawAddress)

public actual fun symGetModuleBase64(hprocess: Handle, qwaddr: ULong): ULong =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymGetModuleBase64(hprocess.rawAddress, qwaddr.toLong()).toULong()

public actual fun symGetModuleInfo64(hprocess: Handle, qwaddr: ULong, moduleinfo: MutPtr<ImagehlpModule64>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymGetModuleInfo64(hprocess.rawAddress, qwaddr.toLong(), moduleinfo.rawAddress)

public actual fun symGetModuleInfoW64(hprocess: Handle, qwaddr: ULong, moduleinfo: MutPtr<ImagehlpModulew64>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymGetModuleInfoW64(hprocess.rawAddress, qwaddr.toLong(), moduleinfo.rawAddress)

public actual fun symGetOmaps(hprocess: Handle, baseofdll: ULong, omapto: MutPtr<MutPtr<Omap>>, comapto: MutPtr<ULong>, omapfrom: MutPtr<MutPtr<Omap>>, comapfrom: MutPtr<ULong>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymGetOmaps(hprocess.rawAddress, baseofdll.toLong(), omapto.rawAddress, comapto.rawAddress, omapfrom.rawAddress, comapfrom.rawAddress)

public actual fun symGetOptions(): UInt =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymGetOptions().toUInt()

public actual fun symGetScope(hprocess: Handle, baseofdll: ULong, index: UInt, symbol: MutPtr<SymbolInfo>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymGetScope(hprocess.rawAddress, baseofdll.toLong(), index.toInt(), symbol.rawAddress)

public actual fun symGetScopeW(hprocess: Handle, baseofdll: ULong, index: UInt, symbol: MutPtr<SymbolInfow>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymGetScopeW(hprocess.rawAddress, baseofdll.toLong(), index.toInt(), symbol.rawAddress)

public actual fun symGetSearchPath(hprocess: Handle, searchpatha: Pstr, searchpathlength: UInt): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymGetSearchPath(hprocess.rawAddress, searchpatha.rawAddress, searchpathlength.toInt())

public actual fun symGetSearchPathW(hprocess: Handle, searchpatha: Pwstr, searchpathlength: UInt): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymGetSearchPathW(hprocess.rawAddress, searchpatha.rawAddress, searchpathlength.toInt())

public actual fun symGetSourceFile(hprocess: Handle, base: ULong, params: Pcstr, filespec: Pcstr, filepath: Pstr, size: UInt): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFile(hprocess.rawAddress, base.toLong(), params.rawAddress, filespec.rawAddress, filepath.rawAddress, size.toInt())

public actual fun symGetSourceFileChecksum(hprocess: Handle, base: ULong, filespec: Pcstr, pchecksumtype: MutPtr<UInt>, pchecksum: MutPtr<UByte>, checksumsize: UInt, pactualbyteswritten: MutPtr<UInt>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileChecksum(hprocess.rawAddress, base.toLong(), filespec.rawAddress, pchecksumtype.rawAddress, pchecksum.rawAddress, checksumsize.toInt(), pactualbyteswritten.rawAddress)

public actual fun symGetSourceFileChecksumW(hprocess: Handle, base: ULong, filespec: Pcwstr, pchecksumtype: MutPtr<UInt>, pchecksum: MutPtr<UByte>, checksumsize: UInt, pactualbyteswritten: MutPtr<UInt>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileChecksumW(hprocess.rawAddress, base.toLong(), filespec.rawAddress, pchecksumtype.rawAddress, pchecksum.rawAddress, checksumsize.toInt(), pactualbyteswritten.rawAddress)

public actual fun symGetSourceFileFromToken(hprocess: Handle, token: ConstPtr<CVoid>, params: Pcstr, filepath: Pstr, size: UInt): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileFromToken(hprocess.rawAddress, token.rawAddress, params.rawAddress, filepath.rawAddress, size.toInt())

public actual fun symGetSourceFileFromTokenByTokenName(hprocess: Handle, token: ConstPtr<CVoid>, tokenname: Pcstr, params: Pcstr, filepath: Pstr, size: UInt): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileFromTokenByTokenName(hprocess.rawAddress, token.rawAddress, tokenname.rawAddress, params.rawAddress, filepath.rawAddress, size.toInt())

public actual fun symGetSourceFileFromTokenByTokenNameW(hprocess: Handle, token: ConstPtr<CVoid>, tokenname: Pcwstr, params: Pcwstr, filepath: Pwstr, size: UInt): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileFromTokenByTokenNameW(hprocess.rawAddress, token.rawAddress, tokenname.rawAddress, params.rawAddress, filepath.rawAddress, size.toInt())

public actual fun symGetSourceFileFromTokenW(hprocess: Handle, token: ConstPtr<CVoid>, params: Pcwstr, filepath: Pwstr, size: UInt): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileFromTokenW(hprocess.rawAddress, token.rawAddress, params.rawAddress, filepath.rawAddress, size.toInt())

public actual fun symGetSourceFileToken(hprocess: Handle, base: ULong, filespec: Pcstr, token: MutPtr<MutPtr<CVoid>>, size: MutPtr<UInt>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileToken(hprocess.rawAddress, base.toLong(), filespec.rawAddress, token.rawAddress, size.rawAddress)

public actual fun symGetSourceFileTokenByTokenName(hprocess: Handle, base: ULong, filespec: Pcstr, tokenname: Pcstr, tokenparameters: Pcstr, token: MutPtr<MutPtr<CVoid>>, size: MutPtr<UInt>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileTokenByTokenName(hprocess.rawAddress, base.toLong(), filespec.rawAddress, tokenname.rawAddress, tokenparameters.rawAddress, token.rawAddress, size.rawAddress)

public actual fun symGetSourceFileTokenByTokenNameW(hprocess: Handle, base: ULong, filespec: Pcwstr, tokenname: Pcwstr, tokenparameters: Pcwstr, token: MutPtr<MutPtr<CVoid>>, size: MutPtr<UInt>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileTokenByTokenNameW(hprocess.rawAddress, base.toLong(), filespec.rawAddress, tokenname.rawAddress, tokenparameters.rawAddress, token.rawAddress, size.rawAddress)

public actual fun symGetSourceFileTokenW(hprocess: Handle, base: ULong, filespec: Pcwstr, token: MutPtr<MutPtr<CVoid>>, size: MutPtr<UInt>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileTokenW(hprocess.rawAddress, base.toLong(), filespec.rawAddress, token.rawAddress, size.rawAddress)

public actual fun symGetSourceFileW(hprocess: Handle, base: ULong, params: Pcwstr, filespec: Pcwstr, filepath: Pwstr, size: UInt): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileW(hprocess.rawAddress, base.toLong(), params.rawAddress, filespec.rawAddress, filepath.rawAddress, size.toInt())

public actual fun symGetSourceVarFromToken(hprocess: Handle, token: ConstPtr<CVoid>, params: Pcstr, varname: Pcstr, value: Pstr, size: UInt): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceVarFromToken(hprocess.rawAddress, token.rawAddress, params.rawAddress, varname.rawAddress, value.rawAddress, size.toInt())

public actual fun symGetSourceVarFromTokenW(hprocess: Handle, token: ConstPtr<CVoid>, params: Pcwstr, varname: Pcwstr, value: Pwstr, size: UInt): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceVarFromTokenW(hprocess.rawAddress, token.rawAddress, params.rawAddress, varname.rawAddress, value.rawAddress, size.toInt())

public actual fun symGetSymFromAddr64(hprocess: Handle, qwaddr: ULong, pdwdisplacement: MutPtr<ULong>, symbol: MutPtr<ImagehlpSymbol64>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymGetSymFromAddr64(hprocess.rawAddress, qwaddr.toLong(), pdwdisplacement.rawAddress, symbol.rawAddress)

public actual fun symGetSymFromName64(hprocess: Handle, name: Pcstr, symbol: MutPtr<ImagehlpSymbol64>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymGetSymFromName64(hprocess.rawAddress, name.rawAddress, symbol.rawAddress)

public actual fun symGetSymNext64(hprocess: Handle, symbol: MutPtr<ImagehlpSymbol64>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymGetSymNext64(hprocess.rawAddress, symbol.rawAddress)

public actual fun symGetSymPrev64(hprocess: Handle, symbol: MutPtr<ImagehlpSymbol64>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymGetSymPrev64(hprocess.rawAddress, symbol.rawAddress)

public actual fun symGetSymbolFile(hprocess: Handle, sympath: Pcstr, imagefile: Pcstr, type: UInt, symbolfile: Pstr, csymbolfile: ULong, dbgfile: Pstr, cdbgfile: ULong): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymGetSymbolFile(hprocess.rawAddress, sympath.rawAddress, imagefile.rawAddress, type.toInt(), symbolfile.rawAddress, csymbolfile.toLong(), dbgfile.rawAddress, cdbgfile.toLong())

public actual fun symGetSymbolFileW(hprocess: Handle, sympath: Pcwstr, imagefile: Pcwstr, type: UInt, symbolfile: Pwstr, csymbolfile: ULong, dbgfile: Pwstr, cdbgfile: ULong): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymGetSymbolFileW(hprocess.rawAddress, sympath.rawAddress, imagefile.rawAddress, type.toInt(), symbolfile.rawAddress, csymbolfile.toLong(), dbgfile.rawAddress, cdbgfile.toLong())

public actual fun symGetTypeFromName(hprocess: Handle, baseofdll: ULong, name: Pcstr, symbol: MutPtr<SymbolInfo>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymGetTypeFromName(hprocess.rawAddress, baseofdll.toLong(), name.rawAddress, symbol.rawAddress)

public actual fun symGetTypeFromNameW(hprocess: Handle, baseofdll: ULong, name: Pcwstr, symbol: MutPtr<SymbolInfow>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymGetTypeFromNameW(hprocess.rawAddress, baseofdll.toLong(), name.rawAddress, symbol.rawAddress)

public actual fun symGetTypeInfo(hprocess: Handle, modbase: ULong, typeid: UInt, gettype: ImagehlpSymbolTypeInfo, pinfo: MutPtr<CVoid>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymGetTypeInfo(hprocess.rawAddress, modbase.toLong(), typeid.toInt(), gettype, pinfo.rawAddress)

public actual fun symGetTypeInfoEx(hprocess: Handle, modbase: ULong, params: MutPtr<ImagehlpGetTypeInfoParams>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymGetTypeInfoEx(hprocess.rawAddress, modbase.toLong(), params.rawAddress)

public actual fun symGetUnwindInfo(hprocess: Handle, address: ULong, buffer: MutPtr<CVoid>, size: MutPtr<UInt>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymGetUnwindInfo(hprocess.rawAddress, address.toLong(), buffer.rawAddress, size.rawAddress)

public actual fun symInitialize(hprocess: Handle, usersearchpath: Pcstr, finvadeprocess: Bool): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymInitialize(hprocess.rawAddress, usersearchpath.rawAddress, finvadeprocess)

public actual fun symInitializeW(hprocess: Handle, usersearchpath: Pcwstr, finvadeprocess: Bool): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymInitializeW(hprocess.rawAddress, usersearchpath.rawAddress, finvadeprocess)

public actual fun symLoadModule64(hprocess: Handle, hfile: Handle, imagename: Pcstr, modulename: Pcstr, baseofdll: ULong, sizeofdll: UInt): ULong =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymLoadModule64(hprocess.rawAddress, hfile.rawAddress, imagename.rawAddress, modulename.rawAddress, baseofdll.toLong(), sizeofdll.toInt()).toULong()

public actual fun symLoadModuleEx(hprocess: Handle, hfile: Handle, imagename: Pcstr, modulename: Pcstr, baseofdll: ULong, dllsize: UInt, data: ConstPtr<ModloadData>, flags: SymLoadFlags): ULong =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymLoadModuleEx(hprocess.rawAddress, hfile.rawAddress, imagename.rawAddress, modulename.rawAddress, baseofdll.toLong(), dllsize.toInt(), data.rawAddress, flags.toInt()).toULong()

public actual fun symLoadModuleExW(hprocess: Handle, hfile: Handle, imagename: Pcwstr, modulename: Pcwstr, baseofdll: ULong, dllsize: UInt, data: ConstPtr<ModloadData>, flags: SymLoadFlags): ULong =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymLoadModuleExW(hprocess.rawAddress, hfile.rawAddress, imagename.rawAddress, modulename.rawAddress, baseofdll.toLong(), dllsize.toInt(), data.rawAddress, flags.toInt()).toULong()

public actual fun symMatchFileName(filename: Pcstr, match: Pcstr, filenamestop: MutPtr<Pstr>, matchstop: MutPtr<Pstr>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymMatchFileName(filename.rawAddress, match.rawAddress, filenamestop.rawAddress, matchstop.rawAddress)

public actual fun symMatchFileNameW(filename: Pcwstr, match: Pcwstr, filenamestop: MutPtr<Pwstr>, matchstop: MutPtr<Pwstr>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymMatchFileNameW(filename.rawAddress, match.rawAddress, filenamestop.rawAddress, matchstop.rawAddress)

public actual fun symMatchString(string: Pcstr, expression: Pcstr, fcase: Bool): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymMatchString(string.rawAddress, expression.rawAddress, fcase)

public actual fun symMatchStringA(string: Pcstr, expression: Pcstr, fcase: Bool): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymMatchStringA(string.rawAddress, expression.rawAddress, fcase)

public actual fun symMatchStringW(string: Pcwstr, expression: Pcwstr, fcase: Bool): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymMatchStringW(string.rawAddress, expression.rawAddress, fcase)

public actual fun symNext(hprocess: Handle, si: MutPtr<SymbolInfo>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymNext(hprocess.rawAddress, si.rawAddress)

public actual fun symNextW(hprocess: Handle, siw: MutPtr<SymbolInfow>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymNextW(hprocess.rawAddress, siw.rawAddress)

public actual fun symPrev(hprocess: Handle, si: MutPtr<SymbolInfo>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymPrev(hprocess.rawAddress, si.rawAddress)

public actual fun symPrevW(hprocess: Handle, siw: MutPtr<SymbolInfow>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymPrevW(hprocess.rawAddress, siw.rawAddress)

public actual fun symQueryInlineTrace(hprocess: Handle, startaddress: ULong, startcontext: UInt, startretaddress: ULong, curaddress: ULong, curcontext: MutPtr<UInt>, curframeindex: MutPtr<UInt>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymQueryInlineTrace(hprocess.rawAddress, startaddress.toLong(), startcontext.toInt(), startretaddress.toLong(), curaddress.toLong(), curcontext.rawAddress, curframeindex.rawAddress)

public actual fun symRefreshModuleList(hprocess: Handle): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymRefreshModuleList(hprocess.rawAddress)

public actual fun symRegisterCallback64(hprocess: Handle, callbackfunction: PsymbolRegisteredCallback64, usercontext: ULong): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymRegisterCallback64(hprocess.rawAddress, 0L, usercontext.toLong())

public actual fun symRegisterCallbackW64(hprocess: Handle, callbackfunction: PsymbolRegisteredCallback64, usercontext: ULong): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymRegisterCallbackW64(hprocess.rawAddress, 0L, usercontext.toLong())

public actual fun symRegisterFunctionEntryCallback64(hprocess: Handle, callbackfunction: PsymbolFuncentryCallback64, usercontext: ULong): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymRegisterFunctionEntryCallback64(hprocess.rawAddress, 0L, usercontext.toLong())

public actual fun symSearch(hprocess: Handle, baseofdll: ULong, index: UInt, symtag: UInt, mask: Pcstr, address: ULong, enumsymbolscallback: PsymEnumeratesymbolsCallback, usercontext: ConstPtr<CVoid>, options: UInt): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymSearch(hprocess.rawAddress, baseofdll.toLong(), index.toInt(), symtag.toInt(), mask.rawAddress, address.toLong(), 0L, usercontext.rawAddress, options.toInt())

public actual fun symSearchW(hprocess: Handle, baseofdll: ULong, index: UInt, symtag: UInt, mask: Pcwstr, address: ULong, enumsymbolscallback: PsymEnumeratesymbolsCallbackw, usercontext: ConstPtr<CVoid>, options: UInt): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymSearchW(hprocess.rawAddress, baseofdll.toLong(), index.toInt(), symtag.toInt(), mask.rawAddress, address.toLong(), 0L, usercontext.rawAddress, options.toInt())

public actual fun symSetContext(hprocess: Handle, stackframe: ConstPtr<ImagehlpStackFrame>, context: ConstPtr<CVoid>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymSetContext(hprocess.rawAddress, stackframe.rawAddress, context.rawAddress)

public actual fun symSetExtendedOption(option: ImagehlpExtendedOptions, value: Bool): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymSetExtendedOption(option, value)

public actual fun symSetHomeDirectory(hprocess: Handle, dir: Pcstr): Pstr =
    MutPtr(WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymSetHomeDirectory(hprocess.rawAddress, dir.rawAddress))

public actual fun symSetHomeDirectoryW(hprocess: Handle, dir: Pcwstr): Pwstr =
    MutPtr(WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymSetHomeDirectoryW(hprocess.rawAddress, dir.rawAddress))

public actual fun symSetOptions(symoptions: UInt): UInt =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymSetOptions(symoptions.toInt()).toUInt()

public actual fun symSetParentWindow(hwnd: Hwnd): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymSetParentWindow(hwnd.rawAddress)

public actual fun symSetScopeFromAddr(hprocess: Handle, address: ULong): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymSetScopeFromAddr(hprocess.rawAddress, address.toLong())

public actual fun symSetScopeFromIndex(hprocess: Handle, baseofdll: ULong, index: UInt): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymSetScopeFromIndex(hprocess.rawAddress, baseofdll.toLong(), index.toInt())

public actual fun symSetScopeFromInlineContext(hprocess: Handle, address: ULong, inlinecontext: UInt): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymSetScopeFromInlineContext(hprocess.rawAddress, address.toLong(), inlinecontext.toInt())

public actual fun symSetSearchPath(hprocess: Handle, searchpatha: Pcstr): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymSetSearchPath(hprocess.rawAddress, searchpatha.rawAddress)

public actual fun symSetSearchPathW(hprocess: Handle, searchpatha: Pcwstr): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymSetSearchPathW(hprocess.rawAddress, searchpatha.rawAddress)

public actual fun symSrvDeltaName(hprocess: Handle, sympath: Pcstr, type: Pcstr, file1: Pcstr, file2: Pcstr): Pcstr =
    ConstPtr(WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymSrvDeltaName(hprocess.rawAddress, sympath.rawAddress, type.rawAddress, file1.rawAddress, file2.rawAddress))

public actual fun symSrvDeltaNameW(hprocess: Handle, sympath: Pcwstr, type: Pcwstr, file1: Pcwstr, file2: Pcwstr): Pcwstr =
    ConstPtr(WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymSrvDeltaNameW(hprocess.rawAddress, sympath.rawAddress, type.rawAddress, file1.rawAddress, file2.rawAddress))

public actual fun symSrvGetFileIndexInfo(file: Pcstr, info: MutPtr<SymsrvIndexInfo>, flags: UInt): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymSrvGetFileIndexInfo(file.rawAddress, info.rawAddress, flags.toInt())

public actual fun symSrvGetFileIndexInfoW(file: Pcwstr, info: MutPtr<SymsrvIndexInfow>, flags: UInt): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymSrvGetFileIndexInfoW(file.rawAddress, info.rawAddress, flags.toInt())

public actual fun symSrvGetFileIndexString(hprocess: Handle, srvpath: Pcstr, file: Pcstr, index: Pstr, size: ULong, flags: UInt): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymSrvGetFileIndexString(hprocess.rawAddress, srvpath.rawAddress, file.rawAddress, index.rawAddress, size.toLong(), flags.toInt())

public actual fun symSrvGetFileIndexStringW(hprocess: Handle, srvpath: Pcwstr, file: Pcwstr, index: Pwstr, size: ULong, flags: UInt): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymSrvGetFileIndexStringW(hprocess.rawAddress, srvpath.rawAddress, file.rawAddress, index.rawAddress, size.toLong(), flags.toInt())

public actual fun symSrvGetFileIndexes(file: Pcstr, id: MutPtr<Guid>, val1: MutPtr<UInt>, val2: MutPtr<UInt>, flags: UInt): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymSrvGetFileIndexes(file.rawAddress, id.rawAddress, val1.rawAddress, val2.rawAddress, flags.toInt())

public actual fun symSrvGetFileIndexesW(file: Pcwstr, id: MutPtr<Guid>, val1: MutPtr<UInt>, val2: MutPtr<UInt>, flags: UInt): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymSrvGetFileIndexesW(file.rawAddress, id.rawAddress, val1.rawAddress, val2.rawAddress, flags.toInt())

public actual fun symSrvGetSupplement(hprocess: Handle, sympath: Pcstr, node: Pcstr, file: Pcstr): Pcstr =
    ConstPtr(WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymSrvGetSupplement(hprocess.rawAddress, sympath.rawAddress, node.rawAddress, file.rawAddress))

public actual fun symSrvGetSupplementW(hprocess: Handle, sympath: Pcwstr, node: Pcwstr, file: Pcwstr): Pcwstr =
    ConstPtr(WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymSrvGetSupplementW(hprocess.rawAddress, sympath.rawAddress, node.rawAddress, file.rawAddress))

public actual fun symSrvIsStore(hprocess: Handle, path: Pcstr): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymSrvIsStore(hprocess.rawAddress, path.rawAddress)

public actual fun symSrvIsStoreW(hprocess: Handle, path: Pcwstr): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymSrvIsStoreW(hprocess.rawAddress, path.rawAddress)

public actual fun symSrvStoreFile(hprocess: Handle, srvpath: Pcstr, file: Pcstr, flags: SymSrvStoreFileFlags): Pcstr =
    ConstPtr(WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymSrvStoreFile(hprocess.rawAddress, srvpath.rawAddress, file.rawAddress, flags.toInt()))

public actual fun symSrvStoreFileW(hprocess: Handle, srvpath: Pcwstr, file: Pcwstr, flags: SymSrvStoreFileFlags): Pcwstr =
    ConstPtr(WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymSrvStoreFileW(hprocess.rawAddress, srvpath.rawAddress, file.rawAddress, flags.toInt()))

public actual fun symSrvStoreSupplement(hprocess: Handle, srvpath: Pcstr, node: Pcstr, file: Pcstr, flags: UInt): Pcstr =
    ConstPtr(WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymSrvStoreSupplement(hprocess.rawAddress, srvpath.rawAddress, node.rawAddress, file.rawAddress, flags.toInt()))

public actual fun symSrvStoreSupplementW(hprocess: Handle, sympath: Pcwstr, node: Pcwstr, file: Pcwstr, flags: UInt): Pcwstr =
    ConstPtr(WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymSrvStoreSupplementW(hprocess.rawAddress, sympath.rawAddress, node.rawAddress, file.rawAddress, flags.toInt()))

public actual fun symUnDName64(sym: ConstPtr<ImagehlpSymbol64>, undecname: Pstr, undecnamelength: UInt): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymUnDName64(sym.rawAddress, undecname.rawAddress, undecnamelength.toInt())

public actual fun symUnloadModule64(hprocess: Handle, baseofdll: ULong): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugSymUnloadModule64(hprocess.rawAddress, baseofdll.toLong())

public actual fun terminateProcessOnMemoryExhaustion(failedallocationsize: ULong) {
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugTerminateProcessOnMemoryExhaustion(failedallocationsize.toLong())
}

public actual fun touchFileTimes(filehandle: Handle, psystemtime: ConstPtr<Systemtime>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugTouchFileTimes(filehandle.rawAddress, psystemtime.rawAddress)

public actual fun unDecorateSymbolName(name: Pcstr, outputstring: Pstr, maxstringlength: UInt, flags: UInt): UInt =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugUnDecorateSymbolName(name.rawAddress, outputstring.rawAddress, maxstringlength.toInt(), flags.toInt()).toUInt()

public actual fun unDecorateSymbolNameW(name: Pcwstr, outputstring: Pwstr, maxstringlength: UInt, flags: UInt): UInt =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugUnDecorateSymbolNameW(name.rawAddress, outputstring.rawAddress, maxstringlength.toInt(), flags.toInt()).toUInt()

public actual fun unMapAndLoad(loadedimage: MutPtr<LoadedImage>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugUnMapAndLoad(loadedimage.rawAddress)

public actual fun unhandledExceptionFilter(exceptioninfo: ConstPtr<ExceptionPointers>): Int =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugUnhandledExceptionFilter(exceptioninfo.rawAddress)

public actual fun updateDebugInfoFile(imagefilename: Pcstr, symbolpath: Pcstr, debugfilepath: Pstr, ntheaders: ConstPtr<ImageNtHeaders32>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugUpdateDebugInfoFile(imagefilename.rawAddress, symbolpath.rawAddress, debugfilepath.rawAddress, ntheaders.rawAddress)

public actual fun updateDebugInfoFileEx(imagefilename: Pcstr, symbolpath: Pcstr, debugfilepath: Pstr, ntheaders: ConstPtr<ImageNtHeaders32>, oldchecksum: UInt): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugUpdateDebugInfoFileEx(imagefilename.rawAddress, symbolpath.rawAddress, debugfilepath.rawAddress, ntheaders.rawAddress, oldchecksum.toInt())

public actual fun waitForDebugEvent(lpdebugevent: MutPtr<DebugEvent>, dwmilliseconds: UInt): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugWaitForDebugEvent(lpdebugevent.rawAddress, dwmilliseconds.toInt())

public actual fun waitForDebugEventEx(lpdebugevent: MutPtr<DebugEvent>, dwmilliseconds: UInt): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugWaitForDebugEventEx(lpdebugevent.rawAddress, dwmilliseconds.toInt())

public actual fun wow64GetThreadContext(hthread: Handle, lpcontext: MutPtr<Wow64Context>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugWow64GetThreadContext(hthread.rawAddress, lpcontext.rawAddress)

public actual fun wow64GetThreadSelectorEntry(hthread: Handle, dwselector: UInt, lpselectorentry: MutPtr<Wow64LdtEntry>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugWow64GetThreadSelectorEntry(hthread.rawAddress, dwselector.toInt(), lpselectorentry.rawAddress)

public actual fun wow64SetThreadContext(hthread: Handle, lpcontext: ConstPtr<Wow64Context>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugWow64SetThreadContext(hthread.rawAddress, lpcontext.rawAddress)

public actual fun writeProcessMemory(hprocess: Handle, lpbaseaddress: ConstPtr<CVoid>, lpbuffer: ConstPtr<CVoid>, nsize: ULong, lpnumberofbyteswritten: MutPtr<ULong>): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugWriteProcessMemory(hprocess.rawAddress, lpbaseaddress.rawAddress, lpbuffer.rawAddress, nsize.toLong(), lpnumberofbyteswritten.rawAddress)
