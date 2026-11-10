@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hmodule
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.ExceptionRoutine
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.MessageboxStyle

private object WindowsWin32SystemDiagnosticsDebugJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_addVectoredContinueHandler(first: Int, handler: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_addVectoredExceptionHandler(first: Int, handler: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_beep(dwfreq: Int, dwduration: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_bindImage(imagename: Long, dllpath: Long, symbolpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_bindImageEx(flags: Int, imagename: Long, dllpath: Long, symbolpath: Long, statusroutine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_checkRemoteDebuggerPresent(hprocess: Long, pbdebuggerpresent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_checkSumMappedFile(baseaddress: Long, filelength: Int, headersum: Long, checksum: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_closeThreadWaitChainSession(wcthandle: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_continueDebugEvent(dwprocessid: Int, dwthreadid: Int, dwcontinuestatus: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_copyContext(destination: Long, contextflags: Int, source: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_dbgHelpCreateUserDump(filename: Long, callback: Long, userdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_dbgHelpCreateUserDumpW(filename: Long, callback: Long, userdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_debugActiveProcess(dwprocessid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_debugActiveProcessStop(dwprocessid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_debugBreak()

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_debugBreakProcess(process: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_debugSetProcessKillOnExit(killonexit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_decodePointer(ptr: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_decodeRemotePointer(processhandle: Long, ptr: Long, decodedptr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_decodeSystemPointer(ptr: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_encodePointer(ptr: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_encodeRemotePointer(processhandle: Long, ptr: Long, encodedptr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_encodeSystemPointer(ptr: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_enumDirTree(hprocess: Long, rootpath: Long, inputpathname: Long, outputpathbuffer: Long, cb: Long, data: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_enumDirTreeW(hprocess: Long, rootpath: Long, inputpathname: Long, outputpathbuffer: Long, cb: Long, data: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_enumerateLoadedModules64(hprocess: Long, enumloadedmodulescallback: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_enumerateLoadedModulesEx(hprocess: Long, enumloadedmodulescallback: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_enumerateLoadedModulesExW(hprocess: Long, enumloadedmodulescallback: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_enumerateLoadedModulesW64(hprocess: Long, enumloadedmodulescallback: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_fatalAppExitA(uaction: Int, lpmessagetext: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_fatalAppExitW(uaction: Int, lpmessagetext: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_fatalExit(exitcode: Int)

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_findDebugInfoFile(filename: Long, symbolpath: Long, debugfilepath: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_findDebugInfoFileEx(filename: Long, symbolpath: Long, debugfilepath: Long, callback: Long, callerdata: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_findDebugInfoFileExW(filename: Long, symbolpath: Long, debugfilepath: Long, callback: Long, callerdata: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_findExecutableImage(filename: Long, symbolpath: Long, imagefilepath: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_findExecutableImageEx(filename: Long, symbolpath: Long, imagefilepath: Long, callback: Long, callerdata: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_findExecutableImageExW(filename: Long, symbolpath: Long, imagefilepath: Long, callback: Long, callerdata: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_findFileInPath(hprocess: Long, searchpatha: Long, filename: Long, id: Long, two: Int, three: Int, flags: Int, filepath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_findFileInSearchPath(hprocess: Long, searchpatha: Long, filename: Long, one: Int, two: Int, three: Int, filepath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_flushInstructionCache(hprocess: Long, lpbaseaddress: Long, dwsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_formatMessageA(dwflags: Int, lpsource: Long, dwmessageid: Int, dwlanguageid: Int, lpbuffer: Long, nsize: Int, arguments: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_formatMessageW(dwflags: Int, lpsource: Long, dwmessageid: Int, dwlanguageid: Int, lpbuffer: Long, nsize: Int, arguments: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_getEnabledXStateFeatures(): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_getErrorMode(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_getImageConfigInformation(loadedimage: Long, imageconfiginformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_getImageUnusedHeaderBytes(loadedimage: Long, sizeunusedheaderbytes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_getSymLoadError(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_getThreadContext(hthread: Long, lpcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_getThreadErrorMode(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_getThreadSelectorEntry(hthread: Long, dwselector: Int, lpselectorentry: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_getThreadWaitChain(wcthandle: Long, context: Long, flags: Int, threadid: Int, nodecount: Long, nodeinfoarray: Long, iscycle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_getTimestampForLoadedLibrary(module: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_getXStateFeaturesMask(context: Long, featuremask: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_imageAddCertificate(filehandle: Long, certificate: Long, index: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_imageDirectoryEntryToData(base: Long, mappedasimage: Boolean, directoryentry: Short, size: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_imageDirectoryEntryToDataEx(base: Long, mappedasimage: Boolean, directoryentry: Short, size: Long, foundheader: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_imageEnumerateCertificates(filehandle: Long, typefilter: Short, certificatecount: Long, indices: Long, indexcount: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_imageGetCertificateData(filehandle: Long, certificateindex: Int, certificate: Long, requiredlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_imageGetCertificateHeader(filehandle: Long, certificateindex: Int, certificateheader: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_imageGetDigestStream(filehandle: Long, digestlevel: Int, digestfunction: Long, digesthandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_imageLoad(dllname: Long, dllpath: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_imageNtHeader(base: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_imageRemoveCertificate(filehandle: Long, index: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_imageRvaToSection(ntheaders: Long, base: Long, rva: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_imageRvaToVa(ntheaders: Long, base: Long, rva: Int, lastrvasection: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_imageUnload(loadedimage: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_imagehlpApiVersion(): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_imagehlpApiVersionEx(appversion: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_initializeContext(buffer: Long, contextflags: Int, context: Long, contextlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_initializeContext2(buffer: Long, contextflags: Int, context: Long, contextlength: Long, xstatecompactionmask: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_isDebuggerPresent(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_locateXStateFeature(context: Long, featureid: Int, length: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_makeSureDirectoryPathExists(dirpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_mapAndLoad(imagename: Long, dllpath: Long, loadedimage: Long, dotdll: Int, readonly: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_mapFileAndCheckSumA(filename: Long, headersum: Long, checksum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_mapFileAndCheckSumW(filename: Long, headersum: Long, checksum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_messageBeep(utype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_miniDumpReadDumpStream(baseofdump: Long, streamnumber: Int, dir: Long, streampointer: Long, streamsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_miniDumpWriteDump(hprocess: Long, processid: Int, hfile: Long, dumptype: Int, exceptionparam: Long, userstreamparam: Long, callbackparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_openThreadWaitChainSession(flags: Int, callback: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_outputDebugStringA(lpoutputstring: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_outputDebugStringW(lpoutputstring: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_raiseException(dwexceptioncode: Int, dwexceptionflags: Int, nnumberofarguments: Int, lparguments: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_raiseFailFastException(pexceptionrecord: Long, pcontextrecord: Long, dwflags: Int)

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_rangeMapAddPeImageSections(rmaphandle: Long, imagename: Long, mappedimage: Long, mappingbytes: Int, imagebase: Long, usertag: Long, mappingflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_rangeMapCreate(): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_rangeMapFree(rmaphandle: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_rangeMapRead(rmaphandle: Long, offset: Long, buffer: Long, requestbytes: Int, flags: Int, donebytes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_rangeMapRemove(rmaphandle: Long, usertag: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_rangeMapWrite(rmaphandle: Long, offset: Long, buffer: Long, requestbytes: Int, flags: Int, donebytes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_reBaseImage(currentimagename: Long, symbolpath: Long, frebase: Int, frebasesysfileok: Int, fgoingdown: Int, checkimagesize: Int, oldimagesize: Long, oldimagebase: Long, newimagesize: Long, newimagebase: Long, timestamp: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_reBaseImage64(currentimagename: Long, symbolpath: Long, frebase: Int, frebasesysfileok: Int, fgoingdown: Int, checkimagesize: Int, oldimagesize: Long, oldimagebase: Long, newimagesize: Long, newimagebase: Long, timestamp: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_readProcessMemory(hprocess: Long, lpbaseaddress: Long, lpbuffer: Long, nsize: Long, lpnumberofbytesread: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_registerWaitChainCOMCallback(callstatecallback: Long, activationstatecallback: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_removeInvalidModuleList(hprocess: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_removeVectoredContinueHandler(handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_removeVectoredExceptionHandler(handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_reportSymbolLoadSummary(hprocess: Long, ploadmodule: Long, psymboldata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_rtlAddFunctionTable(functiontable: Long, entrycount: Int, baseaddress: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_rtlAddGrowableFunctionTable(dynamictable: Long, functiontable: Long, entrycount: Int, maximumentrycount: Int, rangebase: Long, rangeend: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_rtlCaptureContext(contextrecord: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_rtlCaptureContext2(contextrecord: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_rtlCaptureStackBackTrace(framestoskip: Int, framestocapture: Int, backtrace: Long, backtracehash: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_rtlDeleteFunctionTable(functiontable: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_rtlDeleteGrowableFunctionTable(dynamictable: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_rtlGrowFunctionTable(dynamictable: Long, newentrycount: Int)

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_rtlInstallFunctionTableCallback(tableidentifier: Long, baseaddress: Long, length: Int, callback: Long, context: Long, outofprocesscallbackdll: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_rtlLookupFunctionEntry(controlpc: Long, imagebase: Long, historytable: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_rtlPcToFileHeader(pcvalue: Long, baseofimage: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_rtlRaiseException(exceptionrecord: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_rtlRestoreContext(contextrecord: Long, exceptionrecord: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_rtlUnwind(targetframe: Long, targetip: Long, exceptionrecord: Long, returnvalue: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_rtlUnwindEx(targetframe: Long, targetip: Long, exceptionrecord: Long, returnvalue: Long, contextrecord: Long, historytable: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_rtlVirtualUnwind(handlertype: Int, imagebase: Long, controlpc: Long, functionentry: Long, contextrecord: Long, handlerdata: Long, establisherframe: Long, contextpointers: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_searchTreeForFile(rootpath: Long, inputpathname: Long, outputpathbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_searchTreeForFileW(rootpath: Long, inputpathname: Long, outputpathbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_setCheckUserInterruptShared(lpstartaddress: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_setErrorMode(umode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_setImageConfigInformation(loadedimage: Long, imageconfiginformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_setSymLoadError(error: Int)

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_setThreadContext(hthread: Long, lpcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_setThreadErrorMode(dwnewmode: Int, lpoldmode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_setUnhandledExceptionFilter(lptoplevelexceptionfilter: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_setXStateFeaturesMask(context: Long, featuremask: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_stackWalk2(machinetype: Int, hprocess: Long, hthread: Long, stackframe: Long, contextrecord: Long, readmemoryroutine: Long, functiontableaccessroutine: Long, getmodulebaseroutine: Long, translateaddress: Long, gettargetattributevalue: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_stackWalk64(machinetype: Int, hprocess: Long, hthread: Long, stackframe: Long, contextrecord: Long, readmemoryroutine: Long, functiontableaccessroutine: Long, getmodulebaseroutine: Long, translateaddress: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_stackWalkEx(machinetype: Int, hprocess: Long, hthread: Long, stackframe: Long, contextrecord: Long, readmemoryroutine: Long, functiontableaccessroutine: Long, getmodulebaseroutine: Long, translateaddress: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symAddSourceStream(hprocess: Long, base: Long, streamfile: Long, buffer: Long, size: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symAddSourceStreamA(hprocess: Long, base: Long, streamfile: Long, buffer: Long, size: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symAddSourceStreamW(hprocess: Long, base: Long, filespec: Long, buffer: Long, size: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symAddSymbol(hprocess: Long, baseofdll: Long, name: Long, address: Long, size: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symAddSymbolW(hprocess: Long, baseofdll: Long, name: Long, address: Long, size: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symAddrIncludeInlineTrace(hprocess: Long, address: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symCleanup(hprocess: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symCompareInlineTrace(hprocess: Long, address1: Long, inlinecontext1: Int, retaddress1: Long, address2: Long, retaddress2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symDeleteSymbol(hprocess: Long, baseofdll: Long, name: Long, address: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symDeleteSymbolW(hprocess: Long, baseofdll: Long, name: Long, address: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symEnumLines(hprocess: Long, base: Long, obj: Long, file: Long, enumlinescallback: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symEnumLinesW(hprocess: Long, base: Long, obj: Long, file: Long, enumlinescallback: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symEnumProcesses(enumprocessescallback: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symEnumSourceFileTokens(hprocess: Long, base: Long, callback: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symEnumSourceFiles(hprocess: Long, modbase: Long, mask: Long, cbsrcfiles: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symEnumSourceFilesW(hprocess: Long, modbase: Long, mask: Long, cbsrcfiles: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symEnumSourceLines(hprocess: Long, base: Long, obj: Long, file: Long, line: Int, flags: Int, enumlinescallback: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symEnumSourceLinesW(hprocess: Long, base: Long, obj: Long, file: Long, line: Int, flags: Int, enumlinescallback: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symEnumSym(hprocess: Long, baseofdll: Long, enumsymbolscallback: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symEnumSymbols(hprocess: Long, baseofdll: Long, mask: Long, enumsymbolscallback: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symEnumSymbolsEx(hprocess: Long, baseofdll: Long, mask: Long, enumsymbolscallback: Long, usercontext: Long, options: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symEnumSymbolsExW(hprocess: Long, baseofdll: Long, mask: Long, enumsymbolscallback: Long, usercontext: Long, options: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symEnumSymbolsForAddr(hprocess: Long, address: Long, enumsymbolscallback: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symEnumSymbolsForAddrW(hprocess: Long, address: Long, enumsymbolscallback: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symEnumSymbolsW(hprocess: Long, baseofdll: Long, mask: Long, enumsymbolscallback: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symEnumTypes(hprocess: Long, baseofdll: Long, enumsymbolscallback: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symEnumTypesByName(hprocess: Long, baseofdll: Long, mask: Long, enumsymbolscallback: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symEnumTypesByNameW(hprocess: Long, baseofdll: Long, mask: Long, enumsymbolscallback: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symEnumTypesW(hprocess: Long, baseofdll: Long, enumsymbolscallback: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symEnumerateModules64(hprocess: Long, enummodulescallback: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symEnumerateModulesW64(hprocess: Long, enummodulescallback: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symEnumerateSymbols64(hprocess: Long, baseofdll: Long, enumsymbolscallback: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symEnumerateSymbolsW64(hprocess: Long, baseofdll: Long, enumsymbolscallback: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symFindDebugInfoFile(hprocess: Long, filename: Long, debugfilepath: Long, callback: Long, callerdata: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symFindDebugInfoFileW(hprocess: Long, filename: Long, debugfilepath: Long, callback: Long, callerdata: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symFindExecutableImage(hprocess: Long, filename: Long, imagefilepath: Long, callback: Long, callerdata: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symFindExecutableImageW(hprocess: Long, filename: Long, imagefilepath: Long, callback: Long, callerdata: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symFindFileInPath(hprocess: Long, searchpatha: Long, filename: Long, id: Long, two: Int, three: Int, flags: Int, foundfile: Long, callback: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symFindFileInPathW(hprocess: Long, searchpatha: Long, filename: Long, id: Long, two: Int, three: Int, flags: Int, foundfile: Long, callback: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symFromAddr(hprocess: Long, address: Long, displacement: Long, symbol: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symFromAddrW(hprocess: Long, address: Long, displacement: Long, symbol: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symFromIndex(hprocess: Long, baseofdll: Long, index: Int, symbol: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symFromIndexW(hprocess: Long, baseofdll: Long, index: Int, symbol: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symFromInlineContext(hprocess: Long, address: Long, inlinecontext: Int, displacement: Long, symbol: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symFromInlineContextW(hprocess: Long, address: Long, inlinecontext: Int, displacement: Long, symbol: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symFromName(hprocess: Long, name: Long, symbol: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symFromNameW(hprocess: Long, name: Long, symbol: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symFromToken(hprocess: Long, base: Long, token: Int, symbol: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symFromTokenW(hprocess: Long, base: Long, token: Int, symbol: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symFunctionTableAccess64(hprocess: Long, addrbase: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symFunctionTableAccess64AccessRoutines(hprocess: Long, addrbase: Long, readmemoryroutine: Long, getmodulebaseroutine: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symGetExtendedOption(option: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symGetFileLineOffsets64(hprocess: Long, modulename: Long, filename: Long, buffer: Long, bufferlines: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symGetHomeDirectory(type: Int, dir: Long, size: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symGetHomeDirectoryW(type: Int, dir: Long, size: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symGetLineFromAddr64(hprocess: Long, qwaddr: Long, pdwdisplacement: Long, line64: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symGetLineFromAddrW64(hprocess: Long, dwaddr: Long, pdwdisplacement: Long, line: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symGetLineFromInlineContext(hprocess: Long, qwaddr: Long, inlinecontext: Int, qwmodulebaseaddress: Long, pdwdisplacement: Long, line64: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symGetLineFromInlineContextW(hprocess: Long, dwaddr: Long, inlinecontext: Int, qwmodulebaseaddress: Long, pdwdisplacement: Long, line: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symGetLineFromName64(hprocess: Long, modulename: Long, filename: Long, dwlinenumber: Int, pldisplacement: Long, line: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symGetLineFromNameW64(hprocess: Long, modulename: Long, filename: Long, dwlinenumber: Int, pldisplacement: Long, line: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symGetLineNext64(hprocess: Long, line: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symGetLineNextW64(hprocess: Long, line: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symGetLinePrev64(hprocess: Long, line: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symGetLinePrevW64(hprocess: Long, line: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symGetModuleBase64(hprocess: Long, qwaddr: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symGetModuleInfo64(hprocess: Long, qwaddr: Long, moduleinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symGetModuleInfoW64(hprocess: Long, qwaddr: Long, moduleinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symGetOmaps(hprocess: Long, baseofdll: Long, omapto: Long, comapto: Long, omapfrom: Long, comapfrom: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symGetOptions(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symGetScope(hprocess: Long, baseofdll: Long, index: Int, symbol: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symGetScopeW(hprocess: Long, baseofdll: Long, index: Int, symbol: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symGetSearchPath(hprocess: Long, searchpatha: Long, searchpathlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symGetSearchPathW(hprocess: Long, searchpatha: Long, searchpathlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symGetSourceFile(hprocess: Long, base: Long, params: Long, filespec: Long, filepath: Long, size: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symGetSourceFileChecksum(hprocess: Long, base: Long, filespec: Long, pchecksumtype: Long, pchecksum: Long, checksumsize: Int, pactualbyteswritten: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symGetSourceFileChecksumW(hprocess: Long, base: Long, filespec: Long, pchecksumtype: Long, pchecksum: Long, checksumsize: Int, pactualbyteswritten: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symGetSourceFileFromToken(hprocess: Long, token: Long, params: Long, filepath: Long, size: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symGetSourceFileFromTokenByTokenName(hprocess: Long, token: Long, tokenname: Long, params: Long, filepath: Long, size: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symGetSourceFileFromTokenByTokenNameW(hprocess: Long, token: Long, tokenname: Long, params: Long, filepath: Long, size: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symGetSourceFileFromTokenW(hprocess: Long, token: Long, params: Long, filepath: Long, size: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symGetSourceFileToken(hprocess: Long, base: Long, filespec: Long, token: Long, size: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symGetSourceFileTokenByTokenName(hprocess: Long, base: Long, filespec: Long, tokenname: Long, tokenparameters: Long, token: Long, size: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symGetSourceFileTokenByTokenNameW(hprocess: Long, base: Long, filespec: Long, tokenname: Long, tokenparameters: Long, token: Long, size: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symGetSourceFileTokenW(hprocess: Long, base: Long, filespec: Long, token: Long, size: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symGetSourceFileW(hprocess: Long, base: Long, params: Long, filespec: Long, filepath: Long, size: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symGetSourceVarFromToken(hprocess: Long, token: Long, params: Long, varname: Long, value: Long, size: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symGetSourceVarFromTokenW(hprocess: Long, token: Long, params: Long, varname: Long, value: Long, size: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symGetSymFromAddr64(hprocess: Long, qwaddr: Long, pdwdisplacement: Long, symbol: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symGetSymFromName64(hprocess: Long, name: Long, symbol: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symGetSymNext64(hprocess: Long, symbol: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symGetSymPrev64(hprocess: Long, symbol: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symGetSymbolFile(hprocess: Long, sympath: Long, imagefile: Long, type: Int, symbolfile: Long, csymbolfile: Long, dbgfile: Long, cdbgfile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symGetSymbolFileW(hprocess: Long, sympath: Long, imagefile: Long, type: Int, symbolfile: Long, csymbolfile: Long, dbgfile: Long, cdbgfile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symGetTypeFromName(hprocess: Long, baseofdll: Long, name: Long, symbol: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symGetTypeFromNameW(hprocess: Long, baseofdll: Long, name: Long, symbol: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symGetTypeInfo(hprocess: Long, modbase: Long, typeid: Int, gettype: Int, pinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symGetTypeInfoEx(hprocess: Long, modbase: Long, params: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symGetUnwindInfo(hprocess: Long, address: Long, buffer: Long, size: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symInitialize(hprocess: Long, usersearchpath: Long, finvadeprocess: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symInitializeW(hprocess: Long, usersearchpath: Long, finvadeprocess: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symLoadModule64(hprocess: Long, hfile: Long, imagename: Long, modulename: Long, baseofdll: Long, sizeofdll: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symLoadModuleEx(hprocess: Long, hfile: Long, imagename: Long, modulename: Long, baseofdll: Long, dllsize: Int, data: Long, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symLoadModuleExW(hprocess: Long, hfile: Long, imagename: Long, modulename: Long, baseofdll: Long, dllsize: Int, data: Long, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symMatchFileName(filename: Long, match: Long, filenamestop: Long, matchstop: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symMatchFileNameW(filename: Long, match: Long, filenamestop: Long, matchstop: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symMatchString(string: Long, expression: Long, fcase: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symMatchStringA(string: Long, expression: Long, fcase: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symMatchStringW(string: Long, expression: Long, fcase: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symNext(hprocess: Long, si: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symNextW(hprocess: Long, siw: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symPrev(hprocess: Long, si: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symPrevW(hprocess: Long, siw: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symQueryInlineTrace(hprocess: Long, startaddress: Long, startcontext: Int, startretaddress: Long, curaddress: Long, curcontext: Long, curframeindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symRefreshModuleList(hprocess: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symRegisterCallback64(hprocess: Long, callbackfunction: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symRegisterCallbackW64(hprocess: Long, callbackfunction: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symRegisterFunctionEntryCallback64(hprocess: Long, callbackfunction: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symSearch(hprocess: Long, baseofdll: Long, index: Int, symtag: Int, mask: Long, address: Long, enumsymbolscallback: Long, usercontext: Long, options: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symSearchW(hprocess: Long, baseofdll: Long, index: Int, symtag: Int, mask: Long, address: Long, enumsymbolscallback: Long, usercontext: Long, options: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symSetContext(hprocess: Long, stackframe: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symSetExtendedOption(option: Int, value: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symSetHomeDirectory(hprocess: Long, dir: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symSetHomeDirectoryW(hprocess: Long, dir: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symSetOptions(symoptions: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symSetParentWindow(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symSetScopeFromAddr(hprocess: Long, address: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symSetScopeFromIndex(hprocess: Long, baseofdll: Long, index: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symSetScopeFromInlineContext(hprocess: Long, address: Long, inlinecontext: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symSetSearchPath(hprocess: Long, searchpatha: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symSetSearchPathW(hprocess: Long, searchpatha: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symSrvDeltaName(hprocess: Long, sympath: Long, type: Long, file1: Long, file2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symSrvDeltaNameW(hprocess: Long, sympath: Long, type: Long, file1: Long, file2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symSrvGetFileIndexInfo(file: Long, info: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symSrvGetFileIndexInfoW(file: Long, info: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symSrvGetFileIndexString(hprocess: Long, srvpath: Long, file: Long, index: Long, size: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symSrvGetFileIndexStringW(hprocess: Long, srvpath: Long, file: Long, index: Long, size: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symSrvGetFileIndexes(file: Long, id: Long, val1: Long, val2: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symSrvGetFileIndexesW(file: Long, id: Long, val1: Long, val2: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symSrvGetSupplement(hprocess: Long, sympath: Long, node: Long, file: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symSrvGetSupplementW(hprocess: Long, sympath: Long, node: Long, file: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symSrvIsStore(hprocess: Long, path: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symSrvIsStoreW(hprocess: Long, path: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symSrvStoreFile(hprocess: Long, srvpath: Long, file: Long, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symSrvStoreFileW(hprocess: Long, srvpath: Long, file: Long, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symSrvStoreSupplement(hprocess: Long, srvpath: Long, node: Long, file: Long, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symSrvStoreSupplementW(hprocess: Long, sympath: Long, node: Long, file: Long, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symUnDName64(sym: Long, undecname: Long, undecnamelength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_symUnloadModule64(hprocess: Long, baseofdll: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_terminateProcessOnMemoryExhaustion(failedallocationsize: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_touchFileTimes(filehandle: Long, psystemtime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_unDecorateSymbolName(name: Long, outputstring: Long, maxstringlength: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_unDecorateSymbolNameW(name: Long, outputstring: Long, maxstringlength: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_unMapAndLoad(loadedimage: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_unhandledExceptionFilter(exceptioninfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_updateDebugInfoFile(imagefilename: Long, symbolpath: Long, debugfilepath: Long, ntheaders: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_updateDebugInfoFileEx(imagefilename: Long, symbolpath: Long, debugfilepath: Long, ntheaders: Long, oldchecksum: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_waitForDebugEvent(lpdebugevent: Long, dwmilliseconds: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_waitForDebugEventEx(lpdebugevent: Long, dwmilliseconds: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_wow64GetThreadContext(hthread: Long, lpcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_wow64GetThreadSelectorEntry(hthread: Long, dwselector: Int, lpselectorentry: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_wow64SetThreadContext(hthread: Long, lpcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_writeProcessMemory(hprocess: Long, lpbaseaddress: Long, lpbuffer: Long, nsize: Long, lpnumberofbyteswritten: Long): Int
}

public actual fun addVectoredContinueHandler(first: UInt, handler: PvectoredExceptionHandler): COpaquePointer? =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_addVectoredContinueHandler(first.toInt(), 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun addVectoredExceptionHandler(first: UInt, handler: PvectoredExceptionHandler): COpaquePointer? =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_addVectoredExceptionHandler(first.toInt(), 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun beep(dwfreq: UInt, dwduration: UInt): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_beep(dwfreq.toInt(), dwduration.toInt())

public actual fun bindImage(imagename: Pcstr, dllpath: Pcstr, symbolpath: Pcstr): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_bindImage((imagename?.value ?: 0L), (dllpath?.value ?: 0L), (symbolpath?.value ?: 0L))

public actual fun bindImageEx(flags: UInt, imagename: Pcstr, dllpath: Pcstr, symbolpath: Pcstr, statusroutine: PimagehlpStatusRoutine): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_bindImageEx(flags.toInt(), (imagename?.value ?: 0L), (dllpath?.value ?: 0L), (symbolpath?.value ?: 0L), 0L)

public actual fun checkRemoteDebuggerPresent(hprocess: Handle, pbdebuggerpresent: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_checkRemoteDebuggerPresent((hprocess?.value ?: 0L), (pbdebuggerpresent?.value ?: 0L))

public actual fun checkSumMappedFile(baseaddress: COpaquePointer?, filelength: UInt, headersum: COpaquePointer?, checksum: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_checkSumMappedFile((baseaddress?.value ?: 0L), filelength.toInt(), (headersum?.value ?: 0L), (checksum?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun closeThreadWaitChainSession(wcthandle: COpaquePointer?) {
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_closeThreadWaitChainSession((wcthandle?.value ?: 0L))
}

public actual fun continueDebugEvent(dwprocessid: UInt, dwthreadid: UInt, dwcontinuestatus: Ntstatus): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_continueDebugEvent(dwprocessid.toInt(), dwthreadid.toInt(), dwcontinuestatus)

public actual fun copyContext(destination: COpaquePointer?, contextflags: ContextFlags, source: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_copyContext((destination?.value ?: 0L), contextflags.toInt(), (source?.value ?: 0L))

public actual fun dbgHelpCreateUserDump(filename: Pcstr, callback: PdbghelpCreateUserDumpCallback, userdata: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_dbgHelpCreateUserDump((filename?.value ?: 0L), 0L, (userdata?.value ?: 0L))

public actual fun dbgHelpCreateUserDumpW(filename: Pcwstr, callback: PdbghelpCreateUserDumpCallback, userdata: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_dbgHelpCreateUserDumpW((filename?.value ?: 0L), 0L, (userdata?.value ?: 0L))

public actual fun debugActiveProcess(dwprocessid: UInt): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_debugActiveProcess(dwprocessid.toInt())

public actual fun debugActiveProcessStop(dwprocessid: UInt): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_debugActiveProcessStop(dwprocessid.toInt())

public actual fun debugBreak() {
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_debugBreak()
}

public actual fun debugBreakProcess(process: Handle): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_debugBreakProcess((process?.value ?: 0L))

public actual fun debugSetProcessKillOnExit(killonexit: Bool): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_debugSetProcessKillOnExit(killonexit)

public actual fun decodePointer(ptr: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_decodePointer((ptr?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun decodeRemotePointer(processhandle: Handle, ptr: COpaquePointer?, decodedptr: COpaquePointer?): Hresult =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_decodeRemotePointer((processhandle?.value ?: 0L), (ptr?.value ?: 0L), (decodedptr?.value ?: 0L))

public actual fun decodeSystemPointer(ptr: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_decodeSystemPointer((ptr?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun encodePointer(ptr: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_encodePointer((ptr?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun encodeRemotePointer(processhandle: Handle, ptr: COpaquePointer?, encodedptr: COpaquePointer?): Hresult =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_encodeRemotePointer((processhandle?.value ?: 0L), (ptr?.value ?: 0L), (encodedptr?.value ?: 0L))

public actual fun encodeSystemPointer(ptr: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_encodeSystemPointer((ptr?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun enumDirTree(hprocess: Handle, rootpath: Pcstr, inputpathname: Pcstr, outputpathbuffer: Pstr, cb: PenumdirtreeCallback, data: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_enumDirTree((hprocess?.value ?: 0L), (rootpath?.value ?: 0L), (inputpathname?.value ?: 0L), (outputpathbuffer?.value ?: 0L), 0L, (data?.value ?: 0L))

public actual fun enumDirTreeW(hprocess: Handle, rootpath: Pcwstr, inputpathname: Pcwstr, outputpathbuffer: Pwstr, cb: PenumdirtreeCallbackw, data: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_enumDirTreeW((hprocess?.value ?: 0L), (rootpath?.value ?: 0L), (inputpathname?.value ?: 0L), (outputpathbuffer?.value ?: 0L), 0L, (data?.value ?: 0L))

public actual fun enumerateLoadedModules64(hprocess: Handle, enumloadedmodulescallback: PenumloadedModulesCallback64, usercontext: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_enumerateLoadedModules64((hprocess?.value ?: 0L), 0L, (usercontext?.value ?: 0L))

public actual fun enumerateLoadedModulesEx(hprocess: Handle, enumloadedmodulescallback: PenumloadedModulesCallback64, usercontext: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_enumerateLoadedModulesEx((hprocess?.value ?: 0L), 0L, (usercontext?.value ?: 0L))

public actual fun enumerateLoadedModulesExW(hprocess: Handle, enumloadedmodulescallback: PenumloadedModulesCallbackw64, usercontext: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_enumerateLoadedModulesExW((hprocess?.value ?: 0L), 0L, (usercontext?.value ?: 0L))

public actual fun enumerateLoadedModulesW64(hprocess: Handle, enumloadedmodulescallback: PenumloadedModulesCallbackw64, usercontext: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_enumerateLoadedModulesW64((hprocess?.value ?: 0L), 0L, (usercontext?.value ?: 0L))

public actual fun fatalAppExitA(uaction: UInt, lpmessagetext: Pcstr) {
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_fatalAppExitA(uaction.toInt(), (lpmessagetext?.value ?: 0L))
}

public actual fun fatalAppExitW(uaction: UInt, lpmessagetext: Pcwstr) {
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_fatalAppExitW(uaction.toInt(), (lpmessagetext?.value ?: 0L))
}

public actual fun fatalExit(exitcode: Int): Nothing {
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_fatalExit(exitcode)
    error("Unreachable noreturn C function fatalExit")
}

public actual fun findDebugInfoFile(filename: Pcstr, symbolpath: Pcstr, debugfilepath: Pstr): Handle =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_findDebugInfoFile((filename?.value ?: 0L), (symbolpath?.value ?: 0L), (debugfilepath?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun findDebugInfoFileEx(filename: Pcstr, symbolpath: Pcstr, debugfilepath: Pstr, callback: PfindDebugFileCallback, callerdata: COpaquePointer?): Handle =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_findDebugInfoFileEx((filename?.value ?: 0L), (symbolpath?.value ?: 0L), (debugfilepath?.value ?: 0L), 0L, (callerdata?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun findDebugInfoFileExW(filename: Pcwstr, symbolpath: Pcwstr, debugfilepath: Pwstr, callback: PfindDebugFileCallbackw, callerdata: COpaquePointer?): Handle =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_findDebugInfoFileExW((filename?.value ?: 0L), (symbolpath?.value ?: 0L), (debugfilepath?.value ?: 0L), 0L, (callerdata?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun findExecutableImage(filename: Pcstr, symbolpath: Pcstr, imagefilepath: Pstr): Handle =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_findExecutableImage((filename?.value ?: 0L), (symbolpath?.value ?: 0L), (imagefilepath?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun findExecutableImageEx(filename: Pcstr, symbolpath: Pcstr, imagefilepath: Pstr, callback: PfindExeFileCallback, callerdata: COpaquePointer?): Handle =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_findExecutableImageEx((filename?.value ?: 0L), (symbolpath?.value ?: 0L), (imagefilepath?.value ?: 0L), 0L, (callerdata?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun findExecutableImageExW(filename: Pcwstr, symbolpath: Pcwstr, imagefilepath: Pwstr, callback: PfindExeFileCallbackw, callerdata: COpaquePointer?): Handle =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_findExecutableImageExW((filename?.value ?: 0L), (symbolpath?.value ?: 0L), (imagefilepath?.value ?: 0L), 0L, (callerdata?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun findFileInPath(hprocess: Handle, searchpatha: Pcstr, filename: Pcstr, id: COpaquePointer?, two: UInt, three: UInt, flags: UInt, filepath: Pstr): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_findFileInPath((hprocess?.value ?: 0L), (searchpatha?.value ?: 0L), (filename?.value ?: 0L), (id?.value ?: 0L), two.toInt(), three.toInt(), flags.toInt(), (filepath?.value ?: 0L))

public actual fun findFileInSearchPath(hprocess: Handle, searchpatha: Pcstr, filename: Pcstr, one: UInt, two: UInt, three: UInt, filepath: Pstr): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_findFileInSearchPath((hprocess?.value ?: 0L), (searchpatha?.value ?: 0L), (filename?.value ?: 0L), one.toInt(), two.toInt(), three.toInt(), (filepath?.value ?: 0L))

public actual fun flushInstructionCache(hprocess: Handle, lpbaseaddress: COpaquePointer?, dwsize: ULong): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_flushInstructionCache((hprocess?.value ?: 0L), (lpbaseaddress?.value ?: 0L), dwsize.toLong())

public actual fun formatMessageA(dwflags: FormatMessageOptions, lpsource: COpaquePointer?, dwmessageid: UInt, dwlanguageid: UInt, lpbuffer: Pstr, nsize: UInt, arguments: COpaquePointer?): UInt =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_formatMessageA(dwflags.toInt(), (lpsource?.value ?: 0L), dwmessageid.toInt(), dwlanguageid.toInt(), (lpbuffer?.value ?: 0L), nsize.toInt(), (arguments?.value ?: 0L)).toUInt()

public actual fun formatMessageW(dwflags: FormatMessageOptions, lpsource: COpaquePointer?, dwmessageid: UInt, dwlanguageid: UInt, lpbuffer: Pwstr, nsize: UInt, arguments: COpaquePointer?): UInt =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_formatMessageW(dwflags.toInt(), (lpsource?.value ?: 0L), dwmessageid.toInt(), dwlanguageid.toInt(), (lpbuffer?.value ?: 0L), nsize.toInt(), (arguments?.value ?: 0L)).toUInt()

public actual fun getEnabledXStateFeatures(): ULong =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_getEnabledXStateFeatures().toULong()

public actual fun getErrorMode(): UInt =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_getErrorMode().toUInt()

public actual fun getImageConfigInformation(loadedimage: COpaquePointer?, imageconfiginformation: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_getImageConfigInformation((loadedimage?.value ?: 0L), (imageconfiginformation?.value ?: 0L))

public actual fun getImageUnusedHeaderBytes(loadedimage: COpaquePointer?, sizeunusedheaderbytes: COpaquePointer?): UInt =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_getImageUnusedHeaderBytes((loadedimage?.value ?: 0L), (sizeunusedheaderbytes?.value ?: 0L)).toUInt()

public actual fun getSymLoadError(): UInt =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_getSymLoadError().toUInt()

public actual fun getThreadContext(hthread: Handle, lpcontext: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_getThreadContext((hthread?.value ?: 0L), (lpcontext?.value ?: 0L))

public actual fun getThreadErrorMode(): UInt =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_getThreadErrorMode().toUInt()

public actual fun getThreadSelectorEntry(hthread: Handle, dwselector: UInt, lpselectorentry: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_getThreadSelectorEntry((hthread?.value ?: 0L), dwselector.toInt(), (lpselectorentry?.value ?: 0L))

public actual fun getThreadWaitChain(wcthandle: COpaquePointer?, context: ULong, flags: WaitChainThreadOptions, threadid: UInt, nodecount: COpaquePointer?, nodeinfoarray: COpaquePointer?, iscycle: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_getThreadWaitChain((wcthandle?.value ?: 0L), context.toLong(), flags.toInt(), threadid.toInt(), (nodecount?.value ?: 0L), (nodeinfoarray?.value ?: 0L), (iscycle?.value ?: 0L))

public actual fun getTimestampForLoadedLibrary(module: Hmodule): UInt =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_getTimestampForLoadedLibrary((module?.value ?: 0L)).toUInt()

public actual fun getXStateFeaturesMask(context: COpaquePointer?, featuremask: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_getXStateFeaturesMask((context?.value ?: 0L), (featuremask?.value ?: 0L))

public actual fun imageAddCertificate(filehandle: Handle, certificate: COpaquePointer?, index: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_imageAddCertificate((filehandle?.value ?: 0L), (certificate?.value ?: 0L), (index?.value ?: 0L))

public actual fun imageDirectoryEntryToData(base: COpaquePointer?, mappedasimage: Boolean, directoryentry: ImageDirectoryEntry, size: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_imageDirectoryEntryToData((base?.value ?: 0L), mappedasimage, directoryentry.toShort(), (size?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun imageDirectoryEntryToDataEx(base: COpaquePointer?, mappedasimage: Boolean, directoryentry: ImageDirectoryEntry, size: COpaquePointer?, foundheader: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_imageDirectoryEntryToDataEx((base?.value ?: 0L), mappedasimage, directoryentry.toShort(), (size?.value ?: 0L), (foundheader?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun imageEnumerateCertificates(filehandle: Handle, typefilter: UShort, certificatecount: COpaquePointer?, indices: COpaquePointer?, indexcount: UInt): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_imageEnumerateCertificates((filehandle?.value ?: 0L), typefilter.toShort(), (certificatecount?.value ?: 0L), (indices?.value ?: 0L), indexcount.toInt())

public actual fun imageGetCertificateData(filehandle: Handle, certificateindex: UInt, certificate: COpaquePointer?, requiredlength: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_imageGetCertificateData((filehandle?.value ?: 0L), certificateindex.toInt(), (certificate?.value ?: 0L), (requiredlength?.value ?: 0L))

public actual fun imageGetCertificateHeader(filehandle: Handle, certificateindex: UInt, certificateheader: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_imageGetCertificateHeader((filehandle?.value ?: 0L), certificateindex.toInt(), (certificateheader?.value ?: 0L))

public actual fun imageGetDigestStream(filehandle: Handle, digestlevel: UInt, digestfunction: DigestFunction, digesthandle: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_imageGetDigestStream((filehandle?.value ?: 0L), digestlevel.toInt(), 0L, (digesthandle?.value ?: 0L))

public actual fun imageLoad(dllname: Pcstr, dllpath: Pcstr): COpaquePointer? =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_imageLoad((dllname?.value ?: 0L), (dllpath?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun imageNtHeader(base: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_imageNtHeader((base?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun imageRemoveCertificate(filehandle: Handle, index: UInt): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_imageRemoveCertificate((filehandle?.value ?: 0L), index.toInt())

public actual fun imageRvaToSection(ntheaders: COpaquePointer?, base: COpaquePointer?, rva: UInt): COpaquePointer? =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_imageRvaToSection((ntheaders?.value ?: 0L), (base?.value ?: 0L), rva.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun imageRvaToVa(ntheaders: COpaquePointer?, base: COpaquePointer?, rva: UInt, lastrvasection: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_imageRvaToVa((ntheaders?.value ?: 0L), (base?.value ?: 0L), rva.toInt(), (lastrvasection?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun imageUnload(loadedimage: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_imageUnload((loadedimage?.value ?: 0L))

public actual fun imagehlpApiVersion(): COpaquePointer? =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_imagehlpApiVersion().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun imagehlpApiVersionEx(appversion: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_imagehlpApiVersionEx((appversion?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun initializeContext(buffer: COpaquePointer?, contextflags: ContextFlags, context: COpaquePointer?, contextlength: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_initializeContext((buffer?.value ?: 0L), contextflags.toInt(), (context?.value ?: 0L), (contextlength?.value ?: 0L))

public actual fun initializeContext2(buffer: COpaquePointer?, contextflags: ContextFlags, context: COpaquePointer?, contextlength: COpaquePointer?, xstatecompactionmask: ULong): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_initializeContext2((buffer?.value ?: 0L), contextflags.toInt(), (context?.value ?: 0L), (contextlength?.value ?: 0L), xstatecompactionmask.toLong())

public actual fun isDebuggerPresent(): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_isDebuggerPresent()

public actual fun locateXStateFeature(context: COpaquePointer?, featureid: UInt, length: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_locateXStateFeature((context?.value ?: 0L), featureid.toInt(), (length?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun makeSureDirectoryPathExists(dirpath: Pcstr): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_makeSureDirectoryPathExists((dirpath?.value ?: 0L))

public actual fun mapAndLoad(imagename: Pcstr, dllpath: Pcstr, loadedimage: COpaquePointer?, dotdll: Bool, readonly: Bool): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_mapAndLoad((imagename?.value ?: 0L), (dllpath?.value ?: 0L), (loadedimage?.value ?: 0L), dotdll, readonly)

public actual fun mapFileAndCheckSumA(filename: Pcstr, headersum: COpaquePointer?, checksum: COpaquePointer?): UInt =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_mapFileAndCheckSumA((filename?.value ?: 0L), (headersum?.value ?: 0L), (checksum?.value ?: 0L)).toUInt()

public actual fun mapFileAndCheckSumW(filename: Pcwstr, headersum: COpaquePointer?, checksum: COpaquePointer?): UInt =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_mapFileAndCheckSumW((filename?.value ?: 0L), (headersum?.value ?: 0L), (checksum?.value ?: 0L)).toUInt()

public actual fun messageBeep(utype: MessageboxStyle): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_messageBeep(utype.toInt())

public actual fun miniDumpReadDumpStream(baseofdump: COpaquePointer?, streamnumber: UInt, dir: COpaquePointer?, streampointer: COpaquePointer?, streamsize: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_miniDumpReadDumpStream((baseofdump?.value ?: 0L), streamnumber.toInt(), (dir?.value ?: 0L), (streampointer?.value ?: 0L), (streamsize?.value ?: 0L))

public actual fun miniDumpWriteDump(hprocess: Handle, processid: UInt, hfile: Handle, dumptype: MinidumpType, exceptionparam: COpaquePointer?, userstreamparam: COpaquePointer?, callbackparam: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_miniDumpWriteDump((hprocess?.value ?: 0L), processid.toInt(), (hfile?.value ?: 0L), dumptype, (exceptionparam?.value ?: 0L), (userstreamparam?.value ?: 0L), (callbackparam?.value ?: 0L))

public actual fun openThreadWaitChainSession(flags: OpenThreadWaitChainSessionFlags, callback: Pwaitchaincallback): COpaquePointer? =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_openThreadWaitChainSession(flags.toInt(), 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun outputDebugStringA(lpoutputstring: Pcstr) {
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_outputDebugStringA((lpoutputstring?.value ?: 0L))
}

public actual fun outputDebugStringW(lpoutputstring: Pcwstr) {
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_outputDebugStringW((lpoutputstring?.value ?: 0L))
}

public actual fun raiseException(dwexceptioncode: UInt, dwexceptionflags: UInt, nnumberofarguments: UInt, lparguments: COpaquePointer?) {
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_raiseException(dwexceptioncode.toInt(), dwexceptionflags.toInt(), nnumberofarguments.toInt(), (lparguments?.value ?: 0L))
}

public actual fun raiseFailFastException(pexceptionrecord: COpaquePointer?, pcontextrecord: COpaquePointer?, dwflags: UInt) {
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_raiseFailFastException((pexceptionrecord?.value ?: 0L), (pcontextrecord?.value ?: 0L), dwflags.toInt())
}

public actual fun rangeMapAddPeImageSections(rmaphandle: COpaquePointer?, imagename: Pcwstr, mappedimage: COpaquePointer?, mappingbytes: UInt, imagebase: ULong, usertag: ULong, mappingflags: UInt): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_rangeMapAddPeImageSections((rmaphandle?.value ?: 0L), (imagename?.value ?: 0L), (mappedimage?.value ?: 0L), mappingbytes.toInt(), imagebase.toLong(), usertag.toLong(), mappingflags.toInt())

public actual fun rangeMapCreate(): COpaquePointer? =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_rangeMapCreate().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun rangeMapFree(rmaphandle: COpaquePointer?) {
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_rangeMapFree((rmaphandle?.value ?: 0L))
}

public actual fun rangeMapRead(rmaphandle: COpaquePointer?, offset: ULong, buffer: COpaquePointer?, requestbytes: UInt, flags: UInt, donebytes: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_rangeMapRead((rmaphandle?.value ?: 0L), offset.toLong(), (buffer?.value ?: 0L), requestbytes.toInt(), flags.toInt(), (donebytes?.value ?: 0L))

public actual fun rangeMapRemove(rmaphandle: COpaquePointer?, usertag: ULong): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_rangeMapRemove((rmaphandle?.value ?: 0L), usertag.toLong())

public actual fun rangeMapWrite(rmaphandle: COpaquePointer?, offset: ULong, buffer: COpaquePointer?, requestbytes: UInt, flags: UInt, donebytes: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_rangeMapWrite((rmaphandle?.value ?: 0L), offset.toLong(), (buffer?.value ?: 0L), requestbytes.toInt(), flags.toInt(), (donebytes?.value ?: 0L))

public actual fun reBaseImage(currentimagename: Pcstr, symbolpath: Pcstr, frebase: Bool, frebasesysfileok: Bool, fgoingdown: Bool, checkimagesize: UInt, oldimagesize: COpaquePointer?, oldimagebase: COpaquePointer?, newimagesize: COpaquePointer?, newimagebase: COpaquePointer?, timestamp: UInt): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_reBaseImage((currentimagename?.value ?: 0L), (symbolpath?.value ?: 0L), frebase, frebasesysfileok, fgoingdown, checkimagesize.toInt(), (oldimagesize?.value ?: 0L), (oldimagebase?.value ?: 0L), (newimagesize?.value ?: 0L), (newimagebase?.value ?: 0L), timestamp.toInt())

public actual fun reBaseImage64(currentimagename: Pcstr, symbolpath: Pcstr, frebase: Bool, frebasesysfileok: Bool, fgoingdown: Bool, checkimagesize: UInt, oldimagesize: COpaquePointer?, oldimagebase: COpaquePointer?, newimagesize: COpaquePointer?, newimagebase: COpaquePointer?, timestamp: UInt): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_reBaseImage64((currentimagename?.value ?: 0L), (symbolpath?.value ?: 0L), frebase, frebasesysfileok, fgoingdown, checkimagesize.toInt(), (oldimagesize?.value ?: 0L), (oldimagebase?.value ?: 0L), (newimagesize?.value ?: 0L), (newimagebase?.value ?: 0L), timestamp.toInt())

public actual fun readProcessMemory(hprocess: Handle, lpbaseaddress: COpaquePointer?, lpbuffer: COpaquePointer?, nsize: ULong, lpnumberofbytesread: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_readProcessMemory((hprocess?.value ?: 0L), (lpbaseaddress?.value ?: 0L), (lpbuffer?.value ?: 0L), nsize.toLong(), (lpnumberofbytesread?.value ?: 0L))

public actual fun registerWaitChainCOMCallback(callstatecallback: Pcogetcallstate, activationstatecallback: Pcogetactivationstate) {
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_registerWaitChainCOMCallback(0L, 0L)
}

public actual fun removeInvalidModuleList(hprocess: Handle) {
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_removeInvalidModuleList((hprocess?.value ?: 0L))
}

public actual fun removeVectoredContinueHandler(handle: COpaquePointer?): UInt =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_removeVectoredContinueHandler((handle?.value ?: 0L)).toUInt()

public actual fun removeVectoredExceptionHandler(handle: COpaquePointer?): UInt =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_removeVectoredExceptionHandler((handle?.value ?: 0L)).toUInt()

public actual fun reportSymbolLoadSummary(hprocess: Handle, ploadmodule: Pcwstr, psymboldata: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_reportSymbolLoadSummary((hprocess?.value ?: 0L), (ploadmodule?.value ?: 0L), (psymboldata?.value ?: 0L))

public actual fun rtlAddFunctionTable(functiontable: COpaquePointer?, entrycount: UInt, baseaddress: ULong): Boolean =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_rtlAddFunctionTable((functiontable?.value ?: 0L), entrycount.toInt(), baseaddress.toLong())

public actual fun rtlAddGrowableFunctionTable(dynamictable: COpaquePointer?, functiontable: COpaquePointer?, entrycount: UInt, maximumentrycount: UInt, rangebase: ULong, rangeend: ULong): UInt =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_rtlAddGrowableFunctionTable((dynamictable?.value ?: 0L), (functiontable?.value ?: 0L), entrycount.toInt(), maximumentrycount.toInt(), rangebase.toLong(), rangeend.toLong()).toUInt()

public actual fun rtlCaptureContext(contextrecord: COpaquePointer?) {
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_rtlCaptureContext((contextrecord?.value ?: 0L))
}

public actual fun rtlCaptureContext2(contextrecord: COpaquePointer?) {
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_rtlCaptureContext2((contextrecord?.value ?: 0L))
}

public actual fun rtlCaptureStackBackTrace(framestoskip: UInt, framestocapture: UInt, backtrace: COpaquePointer?, backtracehash: COpaquePointer?): UShort =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_rtlCaptureStackBackTrace(framestoskip.toInt(), framestocapture.toInt(), (backtrace?.value ?: 0L), (backtracehash?.value ?: 0L)).toUShort()

public actual fun rtlDeleteFunctionTable(functiontable: COpaquePointer?): Boolean =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_rtlDeleteFunctionTable((functiontable?.value ?: 0L))

public actual fun rtlDeleteGrowableFunctionTable(dynamictable: COpaquePointer?) {
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_rtlDeleteGrowableFunctionTable((dynamictable?.value ?: 0L))
}

public actual fun rtlGrowFunctionTable(dynamictable: COpaquePointer?, newentrycount: UInt) {
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_rtlGrowFunctionTable((dynamictable?.value ?: 0L), newentrycount.toInt())
}

public actual fun rtlInstallFunctionTableCallback(tableidentifier: ULong, baseaddress: ULong, length: UInt, callback: PgetRuntimeFunctionCallback, context: COpaquePointer?, outofprocesscallbackdll: Pcwstr): Boolean =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_rtlInstallFunctionTableCallback(tableidentifier.toLong(), baseaddress.toLong(), length.toInt(), 0L, (context?.value ?: 0L), (outofprocesscallbackdll?.value ?: 0L))

public actual fun rtlLookupFunctionEntry(controlpc: ULong, imagebase: COpaquePointer?, historytable: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_rtlLookupFunctionEntry(controlpc.toLong(), (imagebase?.value ?: 0L), (historytable?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun rtlPcToFileHeader(pcvalue: COpaquePointer?, baseofimage: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_rtlPcToFileHeader((pcvalue?.value ?: 0L), (baseofimage?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun rtlRaiseException(exceptionrecord: COpaquePointer?) {
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_rtlRaiseException((exceptionrecord?.value ?: 0L))
}

public actual fun rtlRestoreContext(contextrecord: COpaquePointer?, exceptionrecord: COpaquePointer?) {
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_rtlRestoreContext((contextrecord?.value ?: 0L), (exceptionrecord?.value ?: 0L))
}

public actual fun rtlUnwind(targetframe: COpaquePointer?, targetip: COpaquePointer?, exceptionrecord: COpaquePointer?, returnvalue: COpaquePointer?) {
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_rtlUnwind((targetframe?.value ?: 0L), (targetip?.value ?: 0L), (exceptionrecord?.value ?: 0L), (returnvalue?.value ?: 0L))
}

public actual fun rtlUnwindEx(targetframe: COpaquePointer?, targetip: COpaquePointer?, exceptionrecord: COpaquePointer?, returnvalue: COpaquePointer?, contextrecord: COpaquePointer?, historytable: COpaquePointer?) {
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_rtlUnwindEx((targetframe?.value ?: 0L), (targetip?.value ?: 0L), (exceptionrecord?.value ?: 0L), (returnvalue?.value ?: 0L), (contextrecord?.value ?: 0L), (historytable?.value ?: 0L))
}

public actual fun rtlVirtualUnwind(handlertype: RtlVirtualUnwindHandlerType, imagebase: ULong, controlpc: ULong, functionentry: COpaquePointer?, contextrecord: COpaquePointer?, handlerdata: COpaquePointer?, establisherframe: COpaquePointer?, contextpointers: COpaquePointer?): ExceptionRoutine =
    null

public actual fun searchTreeForFile(rootpath: Pcstr, inputpathname: Pcstr, outputpathbuffer: Pstr): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_searchTreeForFile((rootpath?.value ?: 0L), (inputpathname?.value ?: 0L), (outputpathbuffer?.value ?: 0L))

public actual fun searchTreeForFileW(rootpath: Pcwstr, inputpathname: Pcwstr, outputpathbuffer: Pwstr): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_searchTreeForFileW((rootpath?.value ?: 0L), (inputpathname?.value ?: 0L), (outputpathbuffer?.value ?: 0L))

public actual fun setCheckUserInterruptShared(lpstartaddress: LpcallBackUserInterruptRoutine) {
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_setCheckUserInterruptShared(0L)
}

public actual fun setErrorMode(umode: ThreadErrorMode): ThreadErrorMode =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_setErrorMode(umode.toInt()).toUInt()

public actual fun setImageConfigInformation(loadedimage: COpaquePointer?, imageconfiginformation: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_setImageConfigInformation((loadedimage?.value ?: 0L), (imageconfiginformation?.value ?: 0L))

public actual fun setSymLoadError(error: UInt) {
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_setSymLoadError(error.toInt())
}

public actual fun setThreadContext(hthread: Handle, lpcontext: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_setThreadContext((hthread?.value ?: 0L), (lpcontext?.value ?: 0L))

public actual fun setThreadErrorMode(dwnewmode: ThreadErrorMode, lpoldmode: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_setThreadErrorMode(dwnewmode.toInt(), (lpoldmode?.value ?: 0L))

public actual fun setUnhandledExceptionFilter(lptoplevelexceptionfilter: LptopLevelExceptionFilter): LptopLevelExceptionFilter =
    null

public actual fun setXStateFeaturesMask(context: COpaquePointer?, featuremask: ULong): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_setXStateFeaturesMask((context?.value ?: 0L), featuremask.toLong())

public actual fun stackWalk2(machinetype: UInt, hprocess: Handle, hthread: Handle, stackframe: COpaquePointer?, contextrecord: COpaquePointer?, readmemoryroutine: PreadProcessMemoryRoutine64, functiontableaccessroutine: PfunctionTableAccessRoutine64, getmodulebaseroutine: PgetModuleBaseRoutine64, translateaddress: PtranslateAddressRoutine64, gettargetattributevalue: PgetTargetAttributeValue64, flags: UInt): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_stackWalk2(machinetype.toInt(), (hprocess?.value ?: 0L), (hthread?.value ?: 0L), (stackframe?.value ?: 0L), (contextrecord?.value ?: 0L), 0L, 0L, 0L, 0L, 0L, flags.toInt())

public actual fun stackWalk64(machinetype: UInt, hprocess: Handle, hthread: Handle, stackframe: COpaquePointer?, contextrecord: COpaquePointer?, readmemoryroutine: PreadProcessMemoryRoutine64, functiontableaccessroutine: PfunctionTableAccessRoutine64, getmodulebaseroutine: PgetModuleBaseRoutine64, translateaddress: PtranslateAddressRoutine64): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_stackWalk64(machinetype.toInt(), (hprocess?.value ?: 0L), (hthread?.value ?: 0L), (stackframe?.value ?: 0L), (contextrecord?.value ?: 0L), 0L, 0L, 0L, 0L)

public actual fun stackWalkEx(machinetype: UInt, hprocess: Handle, hthread: Handle, stackframe: COpaquePointer?, contextrecord: COpaquePointer?, readmemoryroutine: PreadProcessMemoryRoutine64, functiontableaccessroutine: PfunctionTableAccessRoutine64, getmodulebaseroutine: PgetModuleBaseRoutine64, translateaddress: PtranslateAddressRoutine64, flags: UInt): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_stackWalkEx(machinetype.toInt(), (hprocess?.value ?: 0L), (hthread?.value ?: 0L), (stackframe?.value ?: 0L), (contextrecord?.value ?: 0L), 0L, 0L, 0L, 0L, flags.toInt())

public actual fun symAddSourceStream(hprocess: Handle, base: ULong, streamfile: Pcstr, buffer: COpaquePointer?, size: ULong): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symAddSourceStream((hprocess?.value ?: 0L), base.toLong(), (streamfile?.value ?: 0L), (buffer?.value ?: 0L), size.toLong())

public actual fun symAddSourceStreamA(hprocess: Handle, base: ULong, streamfile: Pcstr, buffer: COpaquePointer?, size: ULong): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symAddSourceStreamA((hprocess?.value ?: 0L), base.toLong(), (streamfile?.value ?: 0L), (buffer?.value ?: 0L), size.toLong())

public actual fun symAddSourceStreamW(hprocess: Handle, base: ULong, filespec: Pcwstr, buffer: COpaquePointer?, size: ULong): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symAddSourceStreamW((hprocess?.value ?: 0L), base.toLong(), (filespec?.value ?: 0L), (buffer?.value ?: 0L), size.toLong())

public actual fun symAddSymbol(hprocess: Handle, baseofdll: ULong, name: Pcstr, address: ULong, size: UInt, flags: UInt): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symAddSymbol((hprocess?.value ?: 0L), baseofdll.toLong(), (name?.value ?: 0L), address.toLong(), size.toInt(), flags.toInt())

public actual fun symAddSymbolW(hprocess: Handle, baseofdll: ULong, name: Pcwstr, address: ULong, size: UInt, flags: UInt): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symAddSymbolW((hprocess?.value ?: 0L), baseofdll.toLong(), (name?.value ?: 0L), address.toLong(), size.toInt(), flags.toInt())

public actual fun symAddrIncludeInlineTrace(hprocess: Handle, address: ULong): UInt =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symAddrIncludeInlineTrace((hprocess?.value ?: 0L), address.toLong()).toUInt()

public actual fun symCleanup(hprocess: Handle): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symCleanup((hprocess?.value ?: 0L))

public actual fun symCompareInlineTrace(hprocess: Handle, address1: ULong, inlinecontext1: UInt, retaddress1: ULong, address2: ULong, retaddress2: ULong): UInt =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symCompareInlineTrace((hprocess?.value ?: 0L), address1.toLong(), inlinecontext1.toInt(), retaddress1.toLong(), address2.toLong(), retaddress2.toLong()).toUInt()

public actual fun symDeleteSymbol(hprocess: Handle, baseofdll: ULong, name: Pcstr, address: ULong, flags: UInt): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symDeleteSymbol((hprocess?.value ?: 0L), baseofdll.toLong(), (name?.value ?: 0L), address.toLong(), flags.toInt())

public actual fun symDeleteSymbolW(hprocess: Handle, baseofdll: ULong, name: Pcwstr, address: ULong, flags: UInt): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symDeleteSymbolW((hprocess?.value ?: 0L), baseofdll.toLong(), (name?.value ?: 0L), address.toLong(), flags.toInt())

public actual fun symEnumLines(hprocess: Handle, base: ULong, obj: Pcstr, file: Pcstr, enumlinescallback: PsymEnumlinesCallback, usercontext: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symEnumLines((hprocess?.value ?: 0L), base.toLong(), (obj?.value ?: 0L), (file?.value ?: 0L), 0L, (usercontext?.value ?: 0L))

public actual fun symEnumLinesW(hprocess: Handle, base: ULong, obj: Pcwstr, file: Pcwstr, enumlinescallback: PsymEnumlinesCallbackw, usercontext: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symEnumLinesW((hprocess?.value ?: 0L), base.toLong(), (obj?.value ?: 0L), (file?.value ?: 0L), 0L, (usercontext?.value ?: 0L))

public actual fun symEnumProcesses(enumprocessescallback: PsymEnumprocessesCallback, usercontext: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symEnumProcesses(0L, (usercontext?.value ?: 0L))

public actual fun symEnumSourceFileTokens(hprocess: Handle, base: ULong, callback: Penumsourcefiletokenscallback): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symEnumSourceFileTokens((hprocess?.value ?: 0L), base.toLong(), 0L)

public actual fun symEnumSourceFiles(hprocess: Handle, modbase: ULong, mask: Pcstr, cbsrcfiles: PsymEnumsourcefilesCallback, usercontext: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symEnumSourceFiles((hprocess?.value ?: 0L), modbase.toLong(), (mask?.value ?: 0L), 0L, (usercontext?.value ?: 0L))

public actual fun symEnumSourceFilesW(hprocess: Handle, modbase: ULong, mask: Pcwstr, cbsrcfiles: PsymEnumsourcefilesCallbackw, usercontext: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symEnumSourceFilesW((hprocess?.value ?: 0L), modbase.toLong(), (mask?.value ?: 0L), 0L, (usercontext?.value ?: 0L))

public actual fun symEnumSourceLines(hprocess: Handle, base: ULong, obj: Pcstr, file: Pcstr, line: UInt, flags: UInt, enumlinescallback: PsymEnumlinesCallback, usercontext: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symEnumSourceLines((hprocess?.value ?: 0L), base.toLong(), (obj?.value ?: 0L), (file?.value ?: 0L), line.toInt(), flags.toInt(), 0L, (usercontext?.value ?: 0L))

public actual fun symEnumSourceLinesW(hprocess: Handle, base: ULong, obj: Pcwstr, file: Pcwstr, line: UInt, flags: UInt, enumlinescallback: PsymEnumlinesCallbackw, usercontext: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symEnumSourceLinesW((hprocess?.value ?: 0L), base.toLong(), (obj?.value ?: 0L), (file?.value ?: 0L), line.toInt(), flags.toInt(), 0L, (usercontext?.value ?: 0L))

public actual fun symEnumSym(hprocess: Handle, baseofdll: ULong, enumsymbolscallback: PsymEnumeratesymbolsCallback, usercontext: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symEnumSym((hprocess?.value ?: 0L), baseofdll.toLong(), 0L, (usercontext?.value ?: 0L))

public actual fun symEnumSymbols(hprocess: Handle, baseofdll: ULong, mask: Pcstr, enumsymbolscallback: PsymEnumeratesymbolsCallback, usercontext: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symEnumSymbols((hprocess?.value ?: 0L), baseofdll.toLong(), (mask?.value ?: 0L), 0L, (usercontext?.value ?: 0L))

public actual fun symEnumSymbolsEx(hprocess: Handle, baseofdll: ULong, mask: Pcstr, enumsymbolscallback: PsymEnumeratesymbolsCallback, usercontext: COpaquePointer?, options: UInt): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symEnumSymbolsEx((hprocess?.value ?: 0L), baseofdll.toLong(), (mask?.value ?: 0L), 0L, (usercontext?.value ?: 0L), options.toInt())

public actual fun symEnumSymbolsExW(hprocess: Handle, baseofdll: ULong, mask: Pcwstr, enumsymbolscallback: PsymEnumeratesymbolsCallbackw, usercontext: COpaquePointer?, options: UInt): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symEnumSymbolsExW((hprocess?.value ?: 0L), baseofdll.toLong(), (mask?.value ?: 0L), 0L, (usercontext?.value ?: 0L), options.toInt())

public actual fun symEnumSymbolsForAddr(hprocess: Handle, address: ULong, enumsymbolscallback: PsymEnumeratesymbolsCallback, usercontext: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symEnumSymbolsForAddr((hprocess?.value ?: 0L), address.toLong(), 0L, (usercontext?.value ?: 0L))

public actual fun symEnumSymbolsForAddrW(hprocess: Handle, address: ULong, enumsymbolscallback: PsymEnumeratesymbolsCallbackw, usercontext: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symEnumSymbolsForAddrW((hprocess?.value ?: 0L), address.toLong(), 0L, (usercontext?.value ?: 0L))

public actual fun symEnumSymbolsW(hprocess: Handle, baseofdll: ULong, mask: Pcwstr, enumsymbolscallback: PsymEnumeratesymbolsCallbackw, usercontext: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symEnumSymbolsW((hprocess?.value ?: 0L), baseofdll.toLong(), (mask?.value ?: 0L), 0L, (usercontext?.value ?: 0L))

public actual fun symEnumTypes(hprocess: Handle, baseofdll: ULong, enumsymbolscallback: PsymEnumeratesymbolsCallback, usercontext: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symEnumTypes((hprocess?.value ?: 0L), baseofdll.toLong(), 0L, (usercontext?.value ?: 0L))

public actual fun symEnumTypesByName(hprocess: Handle, baseofdll: ULong, mask: Pcstr, enumsymbolscallback: PsymEnumeratesymbolsCallback, usercontext: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symEnumTypesByName((hprocess?.value ?: 0L), baseofdll.toLong(), (mask?.value ?: 0L), 0L, (usercontext?.value ?: 0L))

public actual fun symEnumTypesByNameW(hprocess: Handle, baseofdll: ULong, mask: Pcwstr, enumsymbolscallback: PsymEnumeratesymbolsCallbackw, usercontext: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symEnumTypesByNameW((hprocess?.value ?: 0L), baseofdll.toLong(), (mask?.value ?: 0L), 0L, (usercontext?.value ?: 0L))

public actual fun symEnumTypesW(hprocess: Handle, baseofdll: ULong, enumsymbolscallback: PsymEnumeratesymbolsCallbackw, usercontext: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symEnumTypesW((hprocess?.value ?: 0L), baseofdll.toLong(), 0L, (usercontext?.value ?: 0L))

public actual fun symEnumerateModules64(hprocess: Handle, enummodulescallback: PsymEnummodulesCallback64, usercontext: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symEnumerateModules64((hprocess?.value ?: 0L), 0L, (usercontext?.value ?: 0L))

public actual fun symEnumerateModulesW64(hprocess: Handle, enummodulescallback: PsymEnummodulesCallbackw64, usercontext: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symEnumerateModulesW64((hprocess?.value ?: 0L), 0L, (usercontext?.value ?: 0L))

public actual fun symEnumerateSymbols64(hprocess: Handle, baseofdll: ULong, enumsymbolscallback: PsymEnumsymbolsCallback64, usercontext: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symEnumerateSymbols64((hprocess?.value ?: 0L), baseofdll.toLong(), 0L, (usercontext?.value ?: 0L))

public actual fun symEnumerateSymbolsW64(hprocess: Handle, baseofdll: ULong, enumsymbolscallback: PsymEnumsymbolsCallback64w, usercontext: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symEnumerateSymbolsW64((hprocess?.value ?: 0L), baseofdll.toLong(), 0L, (usercontext?.value ?: 0L))

public actual fun symFindDebugInfoFile(hprocess: Handle, filename: Pcstr, debugfilepath: Pstr, callback: PfindDebugFileCallback, callerdata: COpaquePointer?): Handle =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symFindDebugInfoFile((hprocess?.value ?: 0L), (filename?.value ?: 0L), (debugfilepath?.value ?: 0L), 0L, (callerdata?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun symFindDebugInfoFileW(hprocess: Handle, filename: Pcwstr, debugfilepath: Pwstr, callback: PfindDebugFileCallbackw, callerdata: COpaquePointer?): Handle =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symFindDebugInfoFileW((hprocess?.value ?: 0L), (filename?.value ?: 0L), (debugfilepath?.value ?: 0L), 0L, (callerdata?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun symFindExecutableImage(hprocess: Handle, filename: Pcstr, imagefilepath: Pstr, callback: PfindExeFileCallback, callerdata: COpaquePointer?): Handle =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symFindExecutableImage((hprocess?.value ?: 0L), (filename?.value ?: 0L), (imagefilepath?.value ?: 0L), 0L, (callerdata?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun symFindExecutableImageW(hprocess: Handle, filename: Pcwstr, imagefilepath: Pwstr, callback: PfindExeFileCallbackw, callerdata: COpaquePointer?): Handle =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symFindExecutableImageW((hprocess?.value ?: 0L), (filename?.value ?: 0L), (imagefilepath?.value ?: 0L), 0L, (callerdata?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun symFindFileInPath(hprocess: Handle, searchpatha: Pcstr, filename: Pcstr, id: COpaquePointer?, two: UInt, three: UInt, flags: SymFindIdOption, foundfile: Pstr, callback: Pfindfileinpathcallback, context: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symFindFileInPath((hprocess?.value ?: 0L), (searchpatha?.value ?: 0L), (filename?.value ?: 0L), (id?.value ?: 0L), two.toInt(), three.toInt(), flags.toInt(), (foundfile?.value ?: 0L), 0L, (context?.value ?: 0L))

public actual fun symFindFileInPathW(hprocess: Handle, searchpatha: Pcwstr, filename: Pcwstr, id: COpaquePointer?, two: UInt, three: UInt, flags: SymFindIdOption, foundfile: Pwstr, callback: Pfindfileinpathcallbackw, context: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symFindFileInPathW((hprocess?.value ?: 0L), (searchpatha?.value ?: 0L), (filename?.value ?: 0L), (id?.value ?: 0L), two.toInt(), three.toInt(), flags.toInt(), (foundfile?.value ?: 0L), 0L, (context?.value ?: 0L))

public actual fun symFromAddr(hprocess: Handle, address: ULong, displacement: COpaquePointer?, symbol: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symFromAddr((hprocess?.value ?: 0L), address.toLong(), (displacement?.value ?: 0L), (symbol?.value ?: 0L))

public actual fun symFromAddrW(hprocess: Handle, address: ULong, displacement: COpaquePointer?, symbol: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symFromAddrW((hprocess?.value ?: 0L), address.toLong(), (displacement?.value ?: 0L), (symbol?.value ?: 0L))

public actual fun symFromIndex(hprocess: Handle, baseofdll: ULong, index: UInt, symbol: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symFromIndex((hprocess?.value ?: 0L), baseofdll.toLong(), index.toInt(), (symbol?.value ?: 0L))

public actual fun symFromIndexW(hprocess: Handle, baseofdll: ULong, index: UInt, symbol: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symFromIndexW((hprocess?.value ?: 0L), baseofdll.toLong(), index.toInt(), (symbol?.value ?: 0L))

public actual fun symFromInlineContext(hprocess: Handle, address: ULong, inlinecontext: UInt, displacement: COpaquePointer?, symbol: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symFromInlineContext((hprocess?.value ?: 0L), address.toLong(), inlinecontext.toInt(), (displacement?.value ?: 0L), (symbol?.value ?: 0L))

public actual fun symFromInlineContextW(hprocess: Handle, address: ULong, inlinecontext: UInt, displacement: COpaquePointer?, symbol: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symFromInlineContextW((hprocess?.value ?: 0L), address.toLong(), inlinecontext.toInt(), (displacement?.value ?: 0L), (symbol?.value ?: 0L))

public actual fun symFromName(hprocess: Handle, name: Pcstr, symbol: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symFromName((hprocess?.value ?: 0L), (name?.value ?: 0L), (symbol?.value ?: 0L))

public actual fun symFromNameW(hprocess: Handle, name: Pcwstr, symbol: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symFromNameW((hprocess?.value ?: 0L), (name?.value ?: 0L), (symbol?.value ?: 0L))

public actual fun symFromToken(hprocess: Handle, base: ULong, token: UInt, symbol: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symFromToken((hprocess?.value ?: 0L), base.toLong(), token.toInt(), (symbol?.value ?: 0L))

public actual fun symFromTokenW(hprocess: Handle, base: ULong, token: UInt, symbol: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symFromTokenW((hprocess?.value ?: 0L), base.toLong(), token.toInt(), (symbol?.value ?: 0L))

public actual fun symFunctionTableAccess64(hprocess: Handle, addrbase: ULong): COpaquePointer? =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symFunctionTableAccess64((hprocess?.value ?: 0L), addrbase.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun symFunctionTableAccess64AccessRoutines(hprocess: Handle, addrbase: ULong, readmemoryroutine: PreadProcessMemoryRoutine64, getmodulebaseroutine: PgetModuleBaseRoutine64): COpaquePointer? =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symFunctionTableAccess64AccessRoutines((hprocess?.value ?: 0L), addrbase.toLong(), 0L, 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun symGetExtendedOption(option: ImagehlpExtendedOptions): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symGetExtendedOption(option)

public actual fun symGetFileLineOffsets64(hprocess: Handle, modulename: Pcstr, filename: Pcstr, buffer: COpaquePointer?, bufferlines: UInt): UInt =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symGetFileLineOffsets64((hprocess?.value ?: 0L), (modulename?.value ?: 0L), (filename?.value ?: 0L), (buffer?.value ?: 0L), bufferlines.toInt()).toUInt()

public actual fun symGetHomeDirectory(type: UInt, dir: Pstr, size: ULong): Pstr =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symGetHomeDirectory(type.toInt(), (dir?.value ?: 0L), size.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun symGetHomeDirectoryW(type: UInt, dir: Pwstr, size: ULong): Pwstr =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symGetHomeDirectoryW(type.toInt(), (dir?.value ?: 0L), size.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun symGetLineFromAddr64(hprocess: Handle, qwaddr: ULong, pdwdisplacement: COpaquePointer?, line64: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symGetLineFromAddr64((hprocess?.value ?: 0L), qwaddr.toLong(), (pdwdisplacement?.value ?: 0L), (line64?.value ?: 0L))

public actual fun symGetLineFromAddrW64(hprocess: Handle, dwaddr: ULong, pdwdisplacement: COpaquePointer?, line: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symGetLineFromAddrW64((hprocess?.value ?: 0L), dwaddr.toLong(), (pdwdisplacement?.value ?: 0L), (line?.value ?: 0L))

public actual fun symGetLineFromInlineContext(hprocess: Handle, qwaddr: ULong, inlinecontext: UInt, qwmodulebaseaddress: ULong, pdwdisplacement: COpaquePointer?, line64: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symGetLineFromInlineContext((hprocess?.value ?: 0L), qwaddr.toLong(), inlinecontext.toInt(), qwmodulebaseaddress.toLong(), (pdwdisplacement?.value ?: 0L), (line64?.value ?: 0L))

public actual fun symGetLineFromInlineContextW(hprocess: Handle, dwaddr: ULong, inlinecontext: UInt, qwmodulebaseaddress: ULong, pdwdisplacement: COpaquePointer?, line: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symGetLineFromInlineContextW((hprocess?.value ?: 0L), dwaddr.toLong(), inlinecontext.toInt(), qwmodulebaseaddress.toLong(), (pdwdisplacement?.value ?: 0L), (line?.value ?: 0L))

public actual fun symGetLineFromName64(hprocess: Handle, modulename: Pcstr, filename: Pcstr, dwlinenumber: UInt, pldisplacement: COpaquePointer?, line: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symGetLineFromName64((hprocess?.value ?: 0L), (modulename?.value ?: 0L), (filename?.value ?: 0L), dwlinenumber.toInt(), (pldisplacement?.value ?: 0L), (line?.value ?: 0L))

public actual fun symGetLineFromNameW64(hprocess: Handle, modulename: Pcwstr, filename: Pcwstr, dwlinenumber: UInt, pldisplacement: COpaquePointer?, line: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symGetLineFromNameW64((hprocess?.value ?: 0L), (modulename?.value ?: 0L), (filename?.value ?: 0L), dwlinenumber.toInt(), (pldisplacement?.value ?: 0L), (line?.value ?: 0L))

public actual fun symGetLineNext64(hprocess: Handle, line: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symGetLineNext64((hprocess?.value ?: 0L), (line?.value ?: 0L))

public actual fun symGetLineNextW64(hprocess: Handle, line: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symGetLineNextW64((hprocess?.value ?: 0L), (line?.value ?: 0L))

public actual fun symGetLinePrev64(hprocess: Handle, line: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symGetLinePrev64((hprocess?.value ?: 0L), (line?.value ?: 0L))

public actual fun symGetLinePrevW64(hprocess: Handle, line: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symGetLinePrevW64((hprocess?.value ?: 0L), (line?.value ?: 0L))

public actual fun symGetModuleBase64(hprocess: Handle, qwaddr: ULong): ULong =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symGetModuleBase64((hprocess?.value ?: 0L), qwaddr.toLong()).toULong()

public actual fun symGetModuleInfo64(hprocess: Handle, qwaddr: ULong, moduleinfo: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symGetModuleInfo64((hprocess?.value ?: 0L), qwaddr.toLong(), (moduleinfo?.value ?: 0L))

public actual fun symGetModuleInfoW64(hprocess: Handle, qwaddr: ULong, moduleinfo: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symGetModuleInfoW64((hprocess?.value ?: 0L), qwaddr.toLong(), (moduleinfo?.value ?: 0L))

public actual fun symGetOmaps(hprocess: Handle, baseofdll: ULong, omapto: COpaquePointer?, comapto: COpaquePointer?, omapfrom: COpaquePointer?, comapfrom: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symGetOmaps((hprocess?.value ?: 0L), baseofdll.toLong(), (omapto?.value ?: 0L), (comapto?.value ?: 0L), (omapfrom?.value ?: 0L), (comapfrom?.value ?: 0L))

public actual fun symGetOptions(): UInt =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symGetOptions().toUInt()

public actual fun symGetScope(hprocess: Handle, baseofdll: ULong, index: UInt, symbol: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symGetScope((hprocess?.value ?: 0L), baseofdll.toLong(), index.toInt(), (symbol?.value ?: 0L))

public actual fun symGetScopeW(hprocess: Handle, baseofdll: ULong, index: UInt, symbol: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symGetScopeW((hprocess?.value ?: 0L), baseofdll.toLong(), index.toInt(), (symbol?.value ?: 0L))

public actual fun symGetSearchPath(hprocess: Handle, searchpatha: Pstr, searchpathlength: UInt): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symGetSearchPath((hprocess?.value ?: 0L), (searchpatha?.value ?: 0L), searchpathlength.toInt())

public actual fun symGetSearchPathW(hprocess: Handle, searchpatha: Pwstr, searchpathlength: UInt): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symGetSearchPathW((hprocess?.value ?: 0L), (searchpatha?.value ?: 0L), searchpathlength.toInt())

public actual fun symGetSourceFile(hprocess: Handle, base: ULong, params: Pcstr, filespec: Pcstr, filepath: Pstr, size: UInt): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symGetSourceFile((hprocess?.value ?: 0L), base.toLong(), (params?.value ?: 0L), (filespec?.value ?: 0L), (filepath?.value ?: 0L), size.toInt())

public actual fun symGetSourceFileChecksum(hprocess: Handle, base: ULong, filespec: Pcstr, pchecksumtype: COpaquePointer?, pchecksum: COpaquePointer?, checksumsize: UInt, pactualbyteswritten: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symGetSourceFileChecksum((hprocess?.value ?: 0L), base.toLong(), (filespec?.value ?: 0L), (pchecksumtype?.value ?: 0L), (pchecksum?.value ?: 0L), checksumsize.toInt(), (pactualbyteswritten?.value ?: 0L))

public actual fun symGetSourceFileChecksumW(hprocess: Handle, base: ULong, filespec: Pcwstr, pchecksumtype: COpaquePointer?, pchecksum: COpaquePointer?, checksumsize: UInt, pactualbyteswritten: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symGetSourceFileChecksumW((hprocess?.value ?: 0L), base.toLong(), (filespec?.value ?: 0L), (pchecksumtype?.value ?: 0L), (pchecksum?.value ?: 0L), checksumsize.toInt(), (pactualbyteswritten?.value ?: 0L))

public actual fun symGetSourceFileFromToken(hprocess: Handle, token: COpaquePointer?, params: Pcstr, filepath: Pstr, size: UInt): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symGetSourceFileFromToken((hprocess?.value ?: 0L), (token?.value ?: 0L), (params?.value ?: 0L), (filepath?.value ?: 0L), size.toInt())

public actual fun symGetSourceFileFromTokenByTokenName(hprocess: Handle, token: COpaquePointer?, tokenname: Pcstr, params: Pcstr, filepath: Pstr, size: UInt): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symGetSourceFileFromTokenByTokenName((hprocess?.value ?: 0L), (token?.value ?: 0L), (tokenname?.value ?: 0L), (params?.value ?: 0L), (filepath?.value ?: 0L), size.toInt())

public actual fun symGetSourceFileFromTokenByTokenNameW(hprocess: Handle, token: COpaquePointer?, tokenname: Pcwstr, params: Pcwstr, filepath: Pwstr, size: UInt): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symGetSourceFileFromTokenByTokenNameW((hprocess?.value ?: 0L), (token?.value ?: 0L), (tokenname?.value ?: 0L), (params?.value ?: 0L), (filepath?.value ?: 0L), size.toInt())

public actual fun symGetSourceFileFromTokenW(hprocess: Handle, token: COpaquePointer?, params: Pcwstr, filepath: Pwstr, size: UInt): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symGetSourceFileFromTokenW((hprocess?.value ?: 0L), (token?.value ?: 0L), (params?.value ?: 0L), (filepath?.value ?: 0L), size.toInt())

public actual fun symGetSourceFileToken(hprocess: Handle, base: ULong, filespec: Pcstr, token: COpaquePointer?, size: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symGetSourceFileToken((hprocess?.value ?: 0L), base.toLong(), (filespec?.value ?: 0L), (token?.value ?: 0L), (size?.value ?: 0L))

public actual fun symGetSourceFileTokenByTokenName(hprocess: Handle, base: ULong, filespec: Pcstr, tokenname: Pcstr, tokenparameters: Pcstr, token: COpaquePointer?, size: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symGetSourceFileTokenByTokenName((hprocess?.value ?: 0L), base.toLong(), (filespec?.value ?: 0L), (tokenname?.value ?: 0L), (tokenparameters?.value ?: 0L), (token?.value ?: 0L), (size?.value ?: 0L))

public actual fun symGetSourceFileTokenByTokenNameW(hprocess: Handle, base: ULong, filespec: Pcwstr, tokenname: Pcwstr, tokenparameters: Pcwstr, token: COpaquePointer?, size: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symGetSourceFileTokenByTokenNameW((hprocess?.value ?: 0L), base.toLong(), (filespec?.value ?: 0L), (tokenname?.value ?: 0L), (tokenparameters?.value ?: 0L), (token?.value ?: 0L), (size?.value ?: 0L))

public actual fun symGetSourceFileTokenW(hprocess: Handle, base: ULong, filespec: Pcwstr, token: COpaquePointer?, size: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symGetSourceFileTokenW((hprocess?.value ?: 0L), base.toLong(), (filespec?.value ?: 0L), (token?.value ?: 0L), (size?.value ?: 0L))

public actual fun symGetSourceFileW(hprocess: Handle, base: ULong, params: Pcwstr, filespec: Pcwstr, filepath: Pwstr, size: UInt): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symGetSourceFileW((hprocess?.value ?: 0L), base.toLong(), (params?.value ?: 0L), (filespec?.value ?: 0L), (filepath?.value ?: 0L), size.toInt())

public actual fun symGetSourceVarFromToken(hprocess: Handle, token: COpaquePointer?, params: Pcstr, varname: Pcstr, value: Pstr, size: UInt): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symGetSourceVarFromToken((hprocess?.value ?: 0L), (token?.value ?: 0L), (params?.value ?: 0L), (varname?.value ?: 0L), (value?.value ?: 0L), size.toInt())

public actual fun symGetSourceVarFromTokenW(hprocess: Handle, token: COpaquePointer?, params: Pcwstr, varname: Pcwstr, value: Pwstr, size: UInt): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symGetSourceVarFromTokenW((hprocess?.value ?: 0L), (token?.value ?: 0L), (params?.value ?: 0L), (varname?.value ?: 0L), (value?.value ?: 0L), size.toInt())

public actual fun symGetSymFromAddr64(hprocess: Handle, qwaddr: ULong, pdwdisplacement: COpaquePointer?, symbol: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symGetSymFromAddr64((hprocess?.value ?: 0L), qwaddr.toLong(), (pdwdisplacement?.value ?: 0L), (symbol?.value ?: 0L))

public actual fun symGetSymFromName64(hprocess: Handle, name: Pcstr, symbol: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symGetSymFromName64((hprocess?.value ?: 0L), (name?.value ?: 0L), (symbol?.value ?: 0L))

public actual fun symGetSymNext64(hprocess: Handle, symbol: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symGetSymNext64((hprocess?.value ?: 0L), (symbol?.value ?: 0L))

public actual fun symGetSymPrev64(hprocess: Handle, symbol: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symGetSymPrev64((hprocess?.value ?: 0L), (symbol?.value ?: 0L))

public actual fun symGetSymbolFile(hprocess: Handle, sympath: Pcstr, imagefile: Pcstr, type: UInt, symbolfile: Pstr, csymbolfile: ULong, dbgfile: Pstr, cdbgfile: ULong): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symGetSymbolFile((hprocess?.value ?: 0L), (sympath?.value ?: 0L), (imagefile?.value ?: 0L), type.toInt(), (symbolfile?.value ?: 0L), csymbolfile.toLong(), (dbgfile?.value ?: 0L), cdbgfile.toLong())

public actual fun symGetSymbolFileW(hprocess: Handle, sympath: Pcwstr, imagefile: Pcwstr, type: UInt, symbolfile: Pwstr, csymbolfile: ULong, dbgfile: Pwstr, cdbgfile: ULong): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symGetSymbolFileW((hprocess?.value ?: 0L), (sympath?.value ?: 0L), (imagefile?.value ?: 0L), type.toInt(), (symbolfile?.value ?: 0L), csymbolfile.toLong(), (dbgfile?.value ?: 0L), cdbgfile.toLong())

public actual fun symGetTypeFromName(hprocess: Handle, baseofdll: ULong, name: Pcstr, symbol: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symGetTypeFromName((hprocess?.value ?: 0L), baseofdll.toLong(), (name?.value ?: 0L), (symbol?.value ?: 0L))

public actual fun symGetTypeFromNameW(hprocess: Handle, baseofdll: ULong, name: Pcwstr, symbol: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symGetTypeFromNameW((hprocess?.value ?: 0L), baseofdll.toLong(), (name?.value ?: 0L), (symbol?.value ?: 0L))

public actual fun symGetTypeInfo(hprocess: Handle, modbase: ULong, typeid: UInt, gettype: ImagehlpSymbolTypeInfo, pinfo: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symGetTypeInfo((hprocess?.value ?: 0L), modbase.toLong(), typeid.toInt(), gettype, (pinfo?.value ?: 0L))

public actual fun symGetTypeInfoEx(hprocess: Handle, modbase: ULong, params: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symGetTypeInfoEx((hprocess?.value ?: 0L), modbase.toLong(), (params?.value ?: 0L))

public actual fun symGetUnwindInfo(hprocess: Handle, address: ULong, buffer: COpaquePointer?, size: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symGetUnwindInfo((hprocess?.value ?: 0L), address.toLong(), (buffer?.value ?: 0L), (size?.value ?: 0L))

public actual fun symInitialize(hprocess: Handle, usersearchpath: Pcstr, finvadeprocess: Bool): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symInitialize((hprocess?.value ?: 0L), (usersearchpath?.value ?: 0L), finvadeprocess)

public actual fun symInitializeW(hprocess: Handle, usersearchpath: Pcwstr, finvadeprocess: Bool): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symInitializeW((hprocess?.value ?: 0L), (usersearchpath?.value ?: 0L), finvadeprocess)

public actual fun symLoadModule64(hprocess: Handle, hfile: Handle, imagename: Pcstr, modulename: Pcstr, baseofdll: ULong, sizeofdll: UInt): ULong =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symLoadModule64((hprocess?.value ?: 0L), (hfile?.value ?: 0L), (imagename?.value ?: 0L), (modulename?.value ?: 0L), baseofdll.toLong(), sizeofdll.toInt()).toULong()

public actual fun symLoadModuleEx(hprocess: Handle, hfile: Handle, imagename: Pcstr, modulename: Pcstr, baseofdll: ULong, dllsize: UInt, data: COpaquePointer?, flags: SymLoadFlags): ULong =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symLoadModuleEx((hprocess?.value ?: 0L), (hfile?.value ?: 0L), (imagename?.value ?: 0L), (modulename?.value ?: 0L), baseofdll.toLong(), dllsize.toInt(), (data?.value ?: 0L), flags.toInt()).toULong()

public actual fun symLoadModuleExW(hprocess: Handle, hfile: Handle, imagename: Pcwstr, modulename: Pcwstr, baseofdll: ULong, dllsize: UInt, data: COpaquePointer?, flags: SymLoadFlags): ULong =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symLoadModuleExW((hprocess?.value ?: 0L), (hfile?.value ?: 0L), (imagename?.value ?: 0L), (modulename?.value ?: 0L), baseofdll.toLong(), dllsize.toInt(), (data?.value ?: 0L), flags.toInt()).toULong()

public actual fun symMatchFileName(filename: Pcstr, match: Pcstr, filenamestop: COpaquePointer?, matchstop: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symMatchFileName((filename?.value ?: 0L), (match?.value ?: 0L), (filenamestop?.value ?: 0L), (matchstop?.value ?: 0L))

public actual fun symMatchFileNameW(filename: Pcwstr, match: Pcwstr, filenamestop: COpaquePointer?, matchstop: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symMatchFileNameW((filename?.value ?: 0L), (match?.value ?: 0L), (filenamestop?.value ?: 0L), (matchstop?.value ?: 0L))

public actual fun symMatchString(string: Pcstr, expression: Pcstr, fcase: Bool): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symMatchString((string?.value ?: 0L), (expression?.value ?: 0L), fcase)

public actual fun symMatchStringA(string: Pcstr, expression: Pcstr, fcase: Bool): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symMatchStringA((string?.value ?: 0L), (expression?.value ?: 0L), fcase)

public actual fun symMatchStringW(string: Pcwstr, expression: Pcwstr, fcase: Bool): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symMatchStringW((string?.value ?: 0L), (expression?.value ?: 0L), fcase)

public actual fun symNext(hprocess: Handle, si: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symNext((hprocess?.value ?: 0L), (si?.value ?: 0L))

public actual fun symNextW(hprocess: Handle, siw: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symNextW((hprocess?.value ?: 0L), (siw?.value ?: 0L))

public actual fun symPrev(hprocess: Handle, si: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symPrev((hprocess?.value ?: 0L), (si?.value ?: 0L))

public actual fun symPrevW(hprocess: Handle, siw: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symPrevW((hprocess?.value ?: 0L), (siw?.value ?: 0L))

public actual fun symQueryInlineTrace(hprocess: Handle, startaddress: ULong, startcontext: UInt, startretaddress: ULong, curaddress: ULong, curcontext: COpaquePointer?, curframeindex: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symQueryInlineTrace((hprocess?.value ?: 0L), startaddress.toLong(), startcontext.toInt(), startretaddress.toLong(), curaddress.toLong(), (curcontext?.value ?: 0L), (curframeindex?.value ?: 0L))

public actual fun symRefreshModuleList(hprocess: Handle): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symRefreshModuleList((hprocess?.value ?: 0L))

public actual fun symRegisterCallback64(hprocess: Handle, callbackfunction: PsymbolRegisteredCallback64, usercontext: ULong): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symRegisterCallback64((hprocess?.value ?: 0L), 0L, usercontext.toLong())

public actual fun symRegisterCallbackW64(hprocess: Handle, callbackfunction: PsymbolRegisteredCallback64, usercontext: ULong): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symRegisterCallbackW64((hprocess?.value ?: 0L), 0L, usercontext.toLong())

public actual fun symRegisterFunctionEntryCallback64(hprocess: Handle, callbackfunction: PsymbolFuncentryCallback64, usercontext: ULong): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symRegisterFunctionEntryCallback64((hprocess?.value ?: 0L), 0L, usercontext.toLong())

public actual fun symSearch(hprocess: Handle, baseofdll: ULong, index: UInt, symtag: UInt, mask: Pcstr, address: ULong, enumsymbolscallback: PsymEnumeratesymbolsCallback, usercontext: COpaquePointer?, options: UInt): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symSearch((hprocess?.value ?: 0L), baseofdll.toLong(), index.toInt(), symtag.toInt(), (mask?.value ?: 0L), address.toLong(), 0L, (usercontext?.value ?: 0L), options.toInt())

public actual fun symSearchW(hprocess: Handle, baseofdll: ULong, index: UInt, symtag: UInt, mask: Pcwstr, address: ULong, enumsymbolscallback: PsymEnumeratesymbolsCallbackw, usercontext: COpaquePointer?, options: UInt): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symSearchW((hprocess?.value ?: 0L), baseofdll.toLong(), index.toInt(), symtag.toInt(), (mask?.value ?: 0L), address.toLong(), 0L, (usercontext?.value ?: 0L), options.toInt())

public actual fun symSetContext(hprocess: Handle, stackframe: COpaquePointer?, context: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symSetContext((hprocess?.value ?: 0L), (stackframe?.value ?: 0L), (context?.value ?: 0L))

public actual fun symSetExtendedOption(option: ImagehlpExtendedOptions, value: Bool): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symSetExtendedOption(option, value)

public actual fun symSetHomeDirectory(hprocess: Handle, dir: Pcstr): Pstr =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symSetHomeDirectory((hprocess?.value ?: 0L), (dir?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun symSetHomeDirectoryW(hprocess: Handle, dir: Pcwstr): Pwstr =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symSetHomeDirectoryW((hprocess?.value ?: 0L), (dir?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun symSetOptions(symoptions: UInt): UInt =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symSetOptions(symoptions.toInt()).toUInt()

public actual fun symSetParentWindow(hwnd: Hwnd): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symSetParentWindow((hwnd?.value ?: 0L))

public actual fun symSetScopeFromAddr(hprocess: Handle, address: ULong): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symSetScopeFromAddr((hprocess?.value ?: 0L), address.toLong())

public actual fun symSetScopeFromIndex(hprocess: Handle, baseofdll: ULong, index: UInt): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symSetScopeFromIndex((hprocess?.value ?: 0L), baseofdll.toLong(), index.toInt())

public actual fun symSetScopeFromInlineContext(hprocess: Handle, address: ULong, inlinecontext: UInt): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symSetScopeFromInlineContext((hprocess?.value ?: 0L), address.toLong(), inlinecontext.toInt())

public actual fun symSetSearchPath(hprocess: Handle, searchpatha: Pcstr): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symSetSearchPath((hprocess?.value ?: 0L), (searchpatha?.value ?: 0L))

public actual fun symSetSearchPathW(hprocess: Handle, searchpatha: Pcwstr): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symSetSearchPathW((hprocess?.value ?: 0L), (searchpatha?.value ?: 0L))

public actual fun symSrvDeltaName(hprocess: Handle, sympath: Pcstr, type: Pcstr, file1: Pcstr, file2: Pcstr): Pcstr =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symSrvDeltaName((hprocess?.value ?: 0L), (sympath?.value ?: 0L), (type?.value ?: 0L), (file1?.value ?: 0L), (file2?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun symSrvDeltaNameW(hprocess: Handle, sympath: Pcwstr, type: Pcwstr, file1: Pcwstr, file2: Pcwstr): Pcwstr =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symSrvDeltaNameW((hprocess?.value ?: 0L), (sympath?.value ?: 0L), (type?.value ?: 0L), (file1?.value ?: 0L), (file2?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun symSrvGetFileIndexInfo(file: Pcstr, info: COpaquePointer?, flags: UInt): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symSrvGetFileIndexInfo((file?.value ?: 0L), (info?.value ?: 0L), flags.toInt())

public actual fun symSrvGetFileIndexInfoW(file: Pcwstr, info: COpaquePointer?, flags: UInt): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symSrvGetFileIndexInfoW((file?.value ?: 0L), (info?.value ?: 0L), flags.toInt())

public actual fun symSrvGetFileIndexString(hprocess: Handle, srvpath: Pcstr, file: Pcstr, index: Pstr, size: ULong, flags: UInt): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symSrvGetFileIndexString((hprocess?.value ?: 0L), (srvpath?.value ?: 0L), (file?.value ?: 0L), (index?.value ?: 0L), size.toLong(), flags.toInt())

public actual fun symSrvGetFileIndexStringW(hprocess: Handle, srvpath: Pcwstr, file: Pcwstr, index: Pwstr, size: ULong, flags: UInt): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symSrvGetFileIndexStringW((hprocess?.value ?: 0L), (srvpath?.value ?: 0L), (file?.value ?: 0L), (index?.value ?: 0L), size.toLong(), flags.toInt())

public actual fun symSrvGetFileIndexes(file: Pcstr, id: COpaquePointer?, val1: COpaquePointer?, val2: COpaquePointer?, flags: UInt): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symSrvGetFileIndexes((file?.value ?: 0L), (id?.value ?: 0L), (val1?.value ?: 0L), (val2?.value ?: 0L), flags.toInt())

public actual fun symSrvGetFileIndexesW(file: Pcwstr, id: COpaquePointer?, val1: COpaquePointer?, val2: COpaquePointer?, flags: UInt): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symSrvGetFileIndexesW((file?.value ?: 0L), (id?.value ?: 0L), (val1?.value ?: 0L), (val2?.value ?: 0L), flags.toInt())

public actual fun symSrvGetSupplement(hprocess: Handle, sympath: Pcstr, node: Pcstr, file: Pcstr): Pcstr =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symSrvGetSupplement((hprocess?.value ?: 0L), (sympath?.value ?: 0L), (node?.value ?: 0L), (file?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun symSrvGetSupplementW(hprocess: Handle, sympath: Pcwstr, node: Pcwstr, file: Pcwstr): Pcwstr =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symSrvGetSupplementW((hprocess?.value ?: 0L), (sympath?.value ?: 0L), (node?.value ?: 0L), (file?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun symSrvIsStore(hprocess: Handle, path: Pcstr): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symSrvIsStore((hprocess?.value ?: 0L), (path?.value ?: 0L))

public actual fun symSrvIsStoreW(hprocess: Handle, path: Pcwstr): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symSrvIsStoreW((hprocess?.value ?: 0L), (path?.value ?: 0L))

public actual fun symSrvStoreFile(hprocess: Handle, srvpath: Pcstr, file: Pcstr, flags: SymSrvStoreFileFlags): Pcstr =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symSrvStoreFile((hprocess?.value ?: 0L), (srvpath?.value ?: 0L), (file?.value ?: 0L), flags.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun symSrvStoreFileW(hprocess: Handle, srvpath: Pcwstr, file: Pcwstr, flags: SymSrvStoreFileFlags): Pcwstr =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symSrvStoreFileW((hprocess?.value ?: 0L), (srvpath?.value ?: 0L), (file?.value ?: 0L), flags.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun symSrvStoreSupplement(hprocess: Handle, srvpath: Pcstr, node: Pcstr, file: Pcstr, flags: UInt): Pcstr =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symSrvStoreSupplement((hprocess?.value ?: 0L), (srvpath?.value ?: 0L), (node?.value ?: 0L), (file?.value ?: 0L), flags.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun symSrvStoreSupplementW(hprocess: Handle, sympath: Pcwstr, node: Pcwstr, file: Pcwstr, flags: UInt): Pcwstr =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symSrvStoreSupplementW((hprocess?.value ?: 0L), (sympath?.value ?: 0L), (node?.value ?: 0L), (file?.value ?: 0L), flags.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun symUnDName64(sym: COpaquePointer?, undecname: Pstr, undecnamelength: UInt): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symUnDName64((sym?.value ?: 0L), (undecname?.value ?: 0L), undecnamelength.toInt())

public actual fun symUnloadModule64(hprocess: Handle, baseofdll: ULong): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_symUnloadModule64((hprocess?.value ?: 0L), baseofdll.toLong())

public actual fun terminateProcessOnMemoryExhaustion(failedallocationsize: ULong) {
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_terminateProcessOnMemoryExhaustion(failedallocationsize.toLong())
}

public actual fun touchFileTimes(filehandle: Handle, psystemtime: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_touchFileTimes((filehandle?.value ?: 0L), (psystemtime?.value ?: 0L))

public actual fun unDecorateSymbolName(name: Pcstr, outputstring: Pstr, maxstringlength: UInt, flags: UInt): UInt =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_unDecorateSymbolName((name?.value ?: 0L), (outputstring?.value ?: 0L), maxstringlength.toInt(), flags.toInt()).toUInt()

public actual fun unDecorateSymbolNameW(name: Pcwstr, outputstring: Pwstr, maxstringlength: UInt, flags: UInt): UInt =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_unDecorateSymbolNameW((name?.value ?: 0L), (outputstring?.value ?: 0L), maxstringlength.toInt(), flags.toInt()).toUInt()

public actual fun unMapAndLoad(loadedimage: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_unMapAndLoad((loadedimage?.value ?: 0L))

public actual fun unhandledExceptionFilter(exceptioninfo: COpaquePointer?): Int =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_unhandledExceptionFilter((exceptioninfo?.value ?: 0L))

public actual fun updateDebugInfoFile(imagefilename: Pcstr, symbolpath: Pcstr, debugfilepath: Pstr, ntheaders: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_updateDebugInfoFile((imagefilename?.value ?: 0L), (symbolpath?.value ?: 0L), (debugfilepath?.value ?: 0L), (ntheaders?.value ?: 0L))

public actual fun updateDebugInfoFileEx(imagefilename: Pcstr, symbolpath: Pcstr, debugfilepath: Pstr, ntheaders: COpaquePointer?, oldchecksum: UInt): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_updateDebugInfoFileEx((imagefilename?.value ?: 0L), (symbolpath?.value ?: 0L), (debugfilepath?.value ?: 0L), (ntheaders?.value ?: 0L), oldchecksum.toInt())

public actual fun waitForDebugEvent(lpdebugevent: COpaquePointer?, dwmilliseconds: UInt): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_waitForDebugEvent((lpdebugevent?.value ?: 0L), dwmilliseconds.toInt())

public actual fun waitForDebugEventEx(lpdebugevent: COpaquePointer?, dwmilliseconds: UInt): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_waitForDebugEventEx((lpdebugevent?.value ?: 0L), dwmilliseconds.toInt())

public actual fun wow64GetThreadContext(hthread: Handle, lpcontext: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_wow64GetThreadContext((hthread?.value ?: 0L), (lpcontext?.value ?: 0L))

public actual fun wow64GetThreadSelectorEntry(hthread: Handle, dwselector: UInt, lpselectorentry: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_wow64GetThreadSelectorEntry((hthread?.value ?: 0L), dwselector.toInt(), (lpselectorentry?.value ?: 0L))

public actual fun wow64SetThreadContext(hthread: Handle, lpcontext: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_wow64SetThreadContext((hthread?.value ?: 0L), (lpcontext?.value ?: 0L))

public actual fun writeProcessMemory(hprocess: Handle, lpbaseaddress: COpaquePointer?, lpbuffer: COpaquePointer?, nsize: ULong, lpnumberofbyteswritten: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_writeProcessMemory((hprocess?.value ?: 0L), (lpbaseaddress?.value ?: 0L), (lpbuffer?.value ?: 0L), nsize.toLong(), (lpnumberofbyteswritten?.value ?: 0L))
