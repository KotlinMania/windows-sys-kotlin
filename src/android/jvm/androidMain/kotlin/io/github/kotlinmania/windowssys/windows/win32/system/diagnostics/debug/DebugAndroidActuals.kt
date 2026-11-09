@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HMODULE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.EXCEPTION_ROUTINE
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.MESSAGEBOX_STYLE

private object WindowsWin32SystemDiagnosticsDebugJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_AddVectoredContinueHandler(first: Int, handler: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_AddVectoredExceptionHandler(first: Int, handler: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_Beep(dwfreq: Int, dwduration: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_BindImage(imagename: Long, dllpath: Long, symbolpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_BindImageEx(flags: Int, imagename: Long, dllpath: Long, symbolpath: Long, statusroutine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_CheckRemoteDebuggerPresent(hprocess: Long, pbdebuggerpresent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_CheckSumMappedFile(baseaddress: Long, filelength: Int, headersum: Long, checksum: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_CloseThreadWaitChainSession(wcthandle: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_ContinueDebugEvent(dwprocessid: Int, dwthreadid: Int, dwcontinuestatus: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_CopyContext(destination: Long, contextflags: Int, source: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_DbgHelpCreateUserDump(filename: Long, callback: Long, userdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_DbgHelpCreateUserDumpW(filename: Long, callback: Long, userdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_DebugActiveProcess(dwprocessid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_DebugActiveProcessStop(dwprocessid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_DebugBreak()

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_DebugBreakProcess(process: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_DebugSetProcessKillOnExit(killonexit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_DecodePointer(ptr: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_DecodeRemotePointer(processhandle: Long, ptr: Long, decodedptr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_DecodeSystemPointer(ptr: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_EncodePointer(ptr: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_EncodeRemotePointer(processhandle: Long, ptr: Long, encodedptr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_EncodeSystemPointer(ptr: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_EnumDirTree(hprocess: Long, rootpath: Long, inputpathname: Long, outputpathbuffer: Long, cb: Long, data: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_EnumDirTreeW(hprocess: Long, rootpath: Long, inputpathname: Long, outputpathbuffer: Long, cb: Long, data: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_EnumerateLoadedModules64(hprocess: Long, enumloadedmodulescallback: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_EnumerateLoadedModulesEx(hprocess: Long, enumloadedmodulescallback: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_EnumerateLoadedModulesExW(hprocess: Long, enumloadedmodulescallback: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_EnumerateLoadedModulesW64(hprocess: Long, enumloadedmodulescallback: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_FatalAppExitA(uaction: Int, lpmessagetext: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_FatalAppExitW(uaction: Int, lpmessagetext: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_FatalExit(exitcode: Int)

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_FindDebugInfoFile(filename: Long, symbolpath: Long, debugfilepath: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_FindDebugInfoFileEx(filename: Long, symbolpath: Long, debugfilepath: Long, callback: Long, callerdata: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_FindDebugInfoFileExW(filename: Long, symbolpath: Long, debugfilepath: Long, callback: Long, callerdata: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_FindExecutableImage(filename: Long, symbolpath: Long, imagefilepath: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_FindExecutableImageEx(filename: Long, symbolpath: Long, imagefilepath: Long, callback: Long, callerdata: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_FindExecutableImageExW(filename: Long, symbolpath: Long, imagefilepath: Long, callback: Long, callerdata: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_FindFileInPath(hprocess: Long, searchpatha: Long, filename: Long, id: Long, two: Int, three: Int, flags: Int, filepath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_FindFileInSearchPath(hprocess: Long, searchpatha: Long, filename: Long, one: Int, two: Int, three: Int, filepath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_FlushInstructionCache(hprocess: Long, lpbaseaddress: Long, dwsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_FormatMessageA(dwflags: Int, lpsource: Long, dwmessageid: Int, dwlanguageid: Int, lpbuffer: Long, nsize: Int, arguments: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_FormatMessageW(dwflags: Int, lpsource: Long, dwmessageid: Int, dwlanguageid: Int, lpbuffer: Long, nsize: Int, arguments: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_GetEnabledXStateFeatures(): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_GetErrorMode(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_GetImageConfigInformation(loadedimage: Long, imageconfiginformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_GetImageUnusedHeaderBytes(loadedimage: Long, sizeunusedheaderbytes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_GetSymLoadError(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_GetThreadContext(hthread: Long, lpcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_GetThreadErrorMode(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_GetThreadSelectorEntry(hthread: Long, dwselector: Int, lpselectorentry: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_GetThreadWaitChain(wcthandle: Long, context: Long, flags: Int, threadid: Int, nodecount: Long, nodeinfoarray: Long, iscycle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_GetTimestampForLoadedLibrary(module: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_GetXStateFeaturesMask(context: Long, featuremask: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_ImageAddCertificate(filehandle: Long, certificate: Long, index: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_ImageDirectoryEntryToData(base: Long, mappedasimage: Boolean, directoryentry: Short, size: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_ImageDirectoryEntryToDataEx(base: Long, mappedasimage: Boolean, directoryentry: Short, size: Long, foundheader: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_ImageEnumerateCertificates(filehandle: Long, typefilter: Short, certificatecount: Long, indices: Long, indexcount: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_ImageGetCertificateData(filehandle: Long, certificateindex: Int, certificate: Long, requiredlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_ImageGetCertificateHeader(filehandle: Long, certificateindex: Int, certificateheader: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_ImageGetDigestStream(filehandle: Long, digestlevel: Int, digestfunction: Long, digesthandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_ImageLoad(dllname: Long, dllpath: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_ImageNtHeader(base: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_ImageRemoveCertificate(filehandle: Long, index: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_ImageRvaToSection(ntheaders: Long, base: Long, rva: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_ImageRvaToVa(ntheaders: Long, base: Long, rva: Int, lastrvasection: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_ImageUnload(loadedimage: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_ImagehlpApiVersion(): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_ImagehlpApiVersionEx(appversion: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_InitializeContext(buffer: Long, contextflags: Int, context: Long, contextlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_InitializeContext2(buffer: Long, contextflags: Int, context: Long, contextlength: Long, xstatecompactionmask: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_IsDebuggerPresent(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_LocateXStateFeature(context: Long, featureid: Int, length: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_MakeSureDirectoryPathExists(dirpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_MapAndLoad(imagename: Long, dllpath: Long, loadedimage: Long, dotdll: Int, readonly: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_MapFileAndCheckSumA(filename: Long, headersum: Long, checksum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_MapFileAndCheckSumW(filename: Long, headersum: Long, checksum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_MessageBeep(utype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_MiniDumpReadDumpStream(baseofdump: Long, streamnumber: Int, dir: Long, streampointer: Long, streamsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_MiniDumpWriteDump(hprocess: Long, processid: Int, hfile: Long, dumptype: Int, exceptionparam: Long, userstreamparam: Long, callbackparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_OpenThreadWaitChainSession(flags: Int, callback: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_OutputDebugStringA(lpoutputstring: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_OutputDebugStringW(lpoutputstring: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_RaiseException(dwexceptioncode: Int, dwexceptionflags: Int, nnumberofarguments: Int, lparguments: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_RaiseFailFastException(pexceptionrecord: Long, pcontextrecord: Long, dwflags: Int)

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_RangeMapAddPeImageSections(rmaphandle: Long, imagename: Long, mappedimage: Long, mappingbytes: Int, imagebase: Long, usertag: Long, mappingflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_RangeMapCreate(): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_RangeMapFree(rmaphandle: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_RangeMapRead(rmaphandle: Long, offset: Long, buffer: Long, requestbytes: Int, flags: Int, donebytes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_RangeMapRemove(rmaphandle: Long, usertag: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_RangeMapWrite(rmaphandle: Long, offset: Long, buffer: Long, requestbytes: Int, flags: Int, donebytes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_ReBaseImage(currentimagename: Long, symbolpath: Long, frebase: Int, frebasesysfileok: Int, fgoingdown: Int, checkimagesize: Int, oldimagesize: Long, oldimagebase: Long, newimagesize: Long, newimagebase: Long, timestamp: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_ReBaseImage64(currentimagename: Long, symbolpath: Long, frebase: Int, frebasesysfileok: Int, fgoingdown: Int, checkimagesize: Int, oldimagesize: Long, oldimagebase: Long, newimagesize: Long, newimagebase: Long, timestamp: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_ReadProcessMemory(hprocess: Long, lpbaseaddress: Long, lpbuffer: Long, nsize: Long, lpnumberofbytesread: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_RegisterWaitChainCOMCallback(callstatecallback: Long, activationstatecallback: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_RemoveInvalidModuleList(hprocess: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_RemoveVectoredContinueHandler(handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_RemoveVectoredExceptionHandler(handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_ReportSymbolLoadSummary(hprocess: Long, ploadmodule: Long, psymboldata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_RtlAddFunctionTable(functiontable: Long, entrycount: Int, baseaddress: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_RtlAddGrowableFunctionTable(dynamictable: Long, functiontable: Long, entrycount: Int, maximumentrycount: Int, rangebase: Long, rangeend: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_RtlCaptureContext(contextrecord: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_RtlCaptureContext2(contextrecord: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_RtlCaptureStackBackTrace(framestoskip: Int, framestocapture: Int, backtrace: Long, backtracehash: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_RtlDeleteFunctionTable(functiontable: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_RtlDeleteGrowableFunctionTable(dynamictable: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_RtlGrowFunctionTable(dynamictable: Long, newentrycount: Int)

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_RtlInstallFunctionTableCallback(tableidentifier: Long, baseaddress: Long, length: Int, callback: Long, context: Long, outofprocesscallbackdll: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_RtlLookupFunctionEntry(controlpc: Long, imagebase: Long, historytable: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_RtlPcToFileHeader(pcvalue: Long, baseofimage: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_RtlRaiseException(exceptionrecord: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_RtlRestoreContext(contextrecord: Long, exceptionrecord: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_RtlUnwind(targetframe: Long, targetip: Long, exceptionrecord: Long, returnvalue: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_RtlUnwindEx(targetframe: Long, targetip: Long, exceptionrecord: Long, returnvalue: Long, contextrecord: Long, historytable: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SearchTreeForFile(rootpath: Long, inputpathname: Long, outputpathbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SearchTreeForFileW(rootpath: Long, inputpathname: Long, outputpathbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SetCheckUserInterruptShared(lpstartaddress: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SetErrorMode(umode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SetImageConfigInformation(loadedimage: Long, imageconfiginformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SetSymLoadError(error: Int)

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SetThreadContext(hthread: Long, lpcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SetThreadErrorMode(dwnewmode: Int, lpoldmode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SetUnhandledExceptionFilter(lptoplevelexceptionfilter: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SetXStateFeaturesMask(context: Long, featuremask: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_StackWalk2(machinetype: Int, hprocess: Long, hthread: Long, stackframe: Long, contextrecord: Long, readmemoryroutine: Long, functiontableaccessroutine: Long, getmodulebaseroutine: Long, translateaddress: Long, gettargetattributevalue: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_StackWalk64(machinetype: Int, hprocess: Long, hthread: Long, stackframe: Long, contextrecord: Long, readmemoryroutine: Long, functiontableaccessroutine: Long, getmodulebaseroutine: Long, translateaddress: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_StackWalkEx(machinetype: Int, hprocess: Long, hthread: Long, stackframe: Long, contextrecord: Long, readmemoryroutine: Long, functiontableaccessroutine: Long, getmodulebaseroutine: Long, translateaddress: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymAddSourceStream(hprocess: Long, base: Long, streamfile: Long, buffer: Long, size: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymAddSourceStreamA(hprocess: Long, base: Long, streamfile: Long, buffer: Long, size: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymAddSourceStreamW(hprocess: Long, base: Long, filespec: Long, buffer: Long, size: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymAddSymbol(hprocess: Long, baseofdll: Long, name: Long, address: Long, size: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymAddSymbolW(hprocess: Long, baseofdll: Long, name: Long, address: Long, size: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymAddrIncludeInlineTrace(hprocess: Long, address: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymCleanup(hprocess: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymCompareInlineTrace(hprocess: Long, address1: Long, inlinecontext1: Int, retaddress1: Long, address2: Long, retaddress2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymDeleteSymbol(hprocess: Long, baseofdll: Long, name: Long, address: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymDeleteSymbolW(hprocess: Long, baseofdll: Long, name: Long, address: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymEnumLines(hprocess: Long, base: Long, obj: Long, file: Long, enumlinescallback: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymEnumLinesW(hprocess: Long, base: Long, obj: Long, file: Long, enumlinescallback: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymEnumProcesses(enumprocessescallback: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymEnumSourceFileTokens(hprocess: Long, base: Long, callback: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymEnumSourceFiles(hprocess: Long, modbase: Long, mask: Long, cbsrcfiles: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymEnumSourceFilesW(hprocess: Long, modbase: Long, mask: Long, cbsrcfiles: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymEnumSourceLines(hprocess: Long, base: Long, obj: Long, file: Long, line: Int, flags: Int, enumlinescallback: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymEnumSourceLinesW(hprocess: Long, base: Long, obj: Long, file: Long, line: Int, flags: Int, enumlinescallback: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymEnumSym(hprocess: Long, baseofdll: Long, enumsymbolscallback: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymEnumSymbols(hprocess: Long, baseofdll: Long, mask: Long, enumsymbolscallback: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymEnumSymbolsEx(hprocess: Long, baseofdll: Long, mask: Long, enumsymbolscallback: Long, usercontext: Long, options: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymEnumSymbolsExW(hprocess: Long, baseofdll: Long, mask: Long, enumsymbolscallback: Long, usercontext: Long, options: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymEnumSymbolsForAddr(hprocess: Long, address: Long, enumsymbolscallback: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymEnumSymbolsForAddrW(hprocess: Long, address: Long, enumsymbolscallback: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymEnumSymbolsW(hprocess: Long, baseofdll: Long, mask: Long, enumsymbolscallback: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymEnumTypes(hprocess: Long, baseofdll: Long, enumsymbolscallback: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymEnumTypesByName(hprocess: Long, baseofdll: Long, mask: Long, enumsymbolscallback: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymEnumTypesByNameW(hprocess: Long, baseofdll: Long, mask: Long, enumsymbolscallback: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymEnumTypesW(hprocess: Long, baseofdll: Long, enumsymbolscallback: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymEnumerateModules64(hprocess: Long, enummodulescallback: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymEnumerateModulesW64(hprocess: Long, enummodulescallback: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymEnumerateSymbols64(hprocess: Long, baseofdll: Long, enumsymbolscallback: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymEnumerateSymbolsW64(hprocess: Long, baseofdll: Long, enumsymbolscallback: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymFindDebugInfoFile(hprocess: Long, filename: Long, debugfilepath: Long, callback: Long, callerdata: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymFindDebugInfoFileW(hprocess: Long, filename: Long, debugfilepath: Long, callback: Long, callerdata: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymFindExecutableImage(hprocess: Long, filename: Long, imagefilepath: Long, callback: Long, callerdata: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymFindExecutableImageW(hprocess: Long, filename: Long, imagefilepath: Long, callback: Long, callerdata: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymFindFileInPath(hprocess: Long, searchpatha: Long, filename: Long, id: Long, two: Int, three: Int, flags: Int, foundfile: Long, callback: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymFindFileInPathW(hprocess: Long, searchpatha: Long, filename: Long, id: Long, two: Int, three: Int, flags: Int, foundfile: Long, callback: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymFromAddr(hprocess: Long, address: Long, displacement: Long, symbol: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymFromAddrW(hprocess: Long, address: Long, displacement: Long, symbol: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymFromIndex(hprocess: Long, baseofdll: Long, index: Int, symbol: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymFromIndexW(hprocess: Long, baseofdll: Long, index: Int, symbol: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymFromInlineContext(hprocess: Long, address: Long, inlinecontext: Int, displacement: Long, symbol: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymFromInlineContextW(hprocess: Long, address: Long, inlinecontext: Int, displacement: Long, symbol: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymFromName(hprocess: Long, name: Long, symbol: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymFromNameW(hprocess: Long, name: Long, symbol: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymFromToken(hprocess: Long, base: Long, token: Int, symbol: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymFromTokenW(hprocess: Long, base: Long, token: Int, symbol: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymFunctionTableAccess64(hprocess: Long, addrbase: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymFunctionTableAccess64AccessRoutines(hprocess: Long, addrbase: Long, readmemoryroutine: Long, getmodulebaseroutine: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymGetExtendedOption(option: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymGetFileLineOffsets64(hprocess: Long, modulename: Long, filename: Long, buffer: Long, bufferlines: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymGetHomeDirectory(type: Int, dir: Long, size: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymGetHomeDirectoryW(type: Int, dir: Long, size: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymGetLineFromAddr64(hprocess: Long, qwaddr: Long, pdwdisplacement: Long, line64: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymGetLineFromAddrW64(hprocess: Long, dwaddr: Long, pdwdisplacement: Long, line: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymGetLineFromInlineContext(hprocess: Long, qwaddr: Long, inlinecontext: Int, qwmodulebaseaddress: Long, pdwdisplacement: Long, line64: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymGetLineFromInlineContextW(hprocess: Long, dwaddr: Long, inlinecontext: Int, qwmodulebaseaddress: Long, pdwdisplacement: Long, line: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymGetLineFromName64(hprocess: Long, modulename: Long, filename: Long, dwlinenumber: Int, pldisplacement: Long, line: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymGetLineFromNameW64(hprocess: Long, modulename: Long, filename: Long, dwlinenumber: Int, pldisplacement: Long, line: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymGetLineNext64(hprocess: Long, line: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymGetLineNextW64(hprocess: Long, line: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymGetLinePrev64(hprocess: Long, line: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymGetLinePrevW64(hprocess: Long, line: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymGetModuleBase64(hprocess: Long, qwaddr: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymGetModuleInfo64(hprocess: Long, qwaddr: Long, moduleinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymGetModuleInfoW64(hprocess: Long, qwaddr: Long, moduleinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymGetOmaps(hprocess: Long, baseofdll: Long, omapto: Long, comapto: Long, omapfrom: Long, comapfrom: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymGetOptions(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymGetScope(hprocess: Long, baseofdll: Long, index: Int, symbol: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymGetScopeW(hprocess: Long, baseofdll: Long, index: Int, symbol: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymGetSearchPath(hprocess: Long, searchpatha: Long, searchpathlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymGetSearchPathW(hprocess: Long, searchpatha: Long, searchpathlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFile(hprocess: Long, base: Long, params: Long, filespec: Long, filepath: Long, size: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFileChecksum(hprocess: Long, base: Long, filespec: Long, pchecksumtype: Long, pchecksum: Long, checksumsize: Int, pactualbyteswritten: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFileChecksumW(hprocess: Long, base: Long, filespec: Long, pchecksumtype: Long, pchecksum: Long, checksumsize: Int, pactualbyteswritten: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFileFromToken(hprocess: Long, token: Long, params: Long, filepath: Long, size: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFileFromTokenByTokenName(hprocess: Long, token: Long, tokenname: Long, params: Long, filepath: Long, size: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFileFromTokenByTokenNameW(hprocess: Long, token: Long, tokenname: Long, params: Long, filepath: Long, size: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFileFromTokenW(hprocess: Long, token: Long, params: Long, filepath: Long, size: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFileToken(hprocess: Long, base: Long, filespec: Long, token: Long, size: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFileTokenByTokenName(hprocess: Long, base: Long, filespec: Long, tokenname: Long, tokenparameters: Long, token: Long, size: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFileTokenByTokenNameW(hprocess: Long, base: Long, filespec: Long, tokenname: Long, tokenparameters: Long, token: Long, size: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFileTokenW(hprocess: Long, base: Long, filespec: Long, token: Long, size: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFileW(hprocess: Long, base: Long, params: Long, filespec: Long, filepath: Long, size: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymGetSourceVarFromToken(hprocess: Long, token: Long, params: Long, varname: Long, value: Long, size: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymGetSourceVarFromTokenW(hprocess: Long, token: Long, params: Long, varname: Long, value: Long, size: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymGetSymFromAddr64(hprocess: Long, qwaddr: Long, pdwdisplacement: Long, symbol: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymGetSymFromName64(hprocess: Long, name: Long, symbol: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymGetSymNext64(hprocess: Long, symbol: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymGetSymPrev64(hprocess: Long, symbol: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymGetSymbolFile(hprocess: Long, sympath: Long, imagefile: Long, type: Int, symbolfile: Long, csymbolfile: Long, dbgfile: Long, cdbgfile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymGetSymbolFileW(hprocess: Long, sympath: Long, imagefile: Long, type: Int, symbolfile: Long, csymbolfile: Long, dbgfile: Long, cdbgfile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymGetTypeFromName(hprocess: Long, baseofdll: Long, name: Long, symbol: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymGetTypeFromNameW(hprocess: Long, baseofdll: Long, name: Long, symbol: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymGetTypeInfo(hprocess: Long, modbase: Long, typeid: Int, gettype: Int, pinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymGetTypeInfoEx(hprocess: Long, modbase: Long, params: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymGetUnwindInfo(hprocess: Long, address: Long, buffer: Long, size: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymInitialize(hprocess: Long, usersearchpath: Long, finvadeprocess: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymInitializeW(hprocess: Long, usersearchpath: Long, finvadeprocess: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymLoadModule64(hprocess: Long, hfile: Long, imagename: Long, modulename: Long, baseofdll: Long, sizeofdll: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymLoadModuleEx(hprocess: Long, hfile: Long, imagename: Long, modulename: Long, baseofdll: Long, dllsize: Int, data: Long, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymLoadModuleExW(hprocess: Long, hfile: Long, imagename: Long, modulename: Long, baseofdll: Long, dllsize: Int, data: Long, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymMatchFileName(filename: Long, match: Long, filenamestop: Long, matchstop: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymMatchFileNameW(filename: Long, match: Long, filenamestop: Long, matchstop: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymMatchString(string: Long, expression: Long, fcase: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymMatchStringA(string: Long, expression: Long, fcase: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymMatchStringW(string: Long, expression: Long, fcase: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymNext(hprocess: Long, si: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymNextW(hprocess: Long, siw: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymPrev(hprocess: Long, si: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymPrevW(hprocess: Long, siw: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymQueryInlineTrace(hprocess: Long, startaddress: Long, startcontext: Int, startretaddress: Long, curaddress: Long, curcontext: Long, curframeindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymRefreshModuleList(hprocess: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymRegisterCallback64(hprocess: Long, callbackfunction: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymRegisterCallbackW64(hprocess: Long, callbackfunction: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymRegisterFunctionEntryCallback64(hprocess: Long, callbackfunction: Long, usercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymSearch(hprocess: Long, baseofdll: Long, index: Int, symtag: Int, mask: Long, address: Long, enumsymbolscallback: Long, usercontext: Long, options: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymSearchW(hprocess: Long, baseofdll: Long, index: Int, symtag: Int, mask: Long, address: Long, enumsymbolscallback: Long, usercontext: Long, options: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymSetContext(hprocess: Long, stackframe: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymSetExtendedOption(option: Int, value: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymSetHomeDirectory(hprocess: Long, dir: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymSetHomeDirectoryW(hprocess: Long, dir: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymSetOptions(symoptions: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymSetParentWindow(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymSetScopeFromAddr(hprocess: Long, address: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymSetScopeFromIndex(hprocess: Long, baseofdll: Long, index: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymSetScopeFromInlineContext(hprocess: Long, address: Long, inlinecontext: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymSetSearchPath(hprocess: Long, searchpatha: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymSetSearchPathW(hprocess: Long, searchpatha: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymSrvDeltaName(hprocess: Long, sympath: Long, type: Long, file1: Long, file2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymSrvDeltaNameW(hprocess: Long, sympath: Long, type: Long, file1: Long, file2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymSrvGetFileIndexInfo(file: Long, info: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymSrvGetFileIndexInfoW(file: Long, info: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymSrvGetFileIndexString(hprocess: Long, srvpath: Long, file: Long, index: Long, size: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymSrvGetFileIndexStringW(hprocess: Long, srvpath: Long, file: Long, index: Long, size: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymSrvGetFileIndexes(file: Long, id: Long, val1: Long, val2: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymSrvGetFileIndexesW(file: Long, id: Long, val1: Long, val2: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymSrvGetSupplement(hprocess: Long, sympath: Long, node: Long, file: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymSrvGetSupplementW(hprocess: Long, sympath: Long, node: Long, file: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymSrvIsStore(hprocess: Long, path: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymSrvIsStoreW(hprocess: Long, path: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymSrvStoreFile(hprocess: Long, srvpath: Long, file: Long, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymSrvStoreFileW(hprocess: Long, srvpath: Long, file: Long, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymSrvStoreSupplement(hprocess: Long, srvpath: Long, node: Long, file: Long, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymSrvStoreSupplementW(hprocess: Long, sympath: Long, node: Long, file: Long, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymUnDName64(sym: Long, undecname: Long, undecnamelength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_SymUnloadModule64(hprocess: Long, baseofdll: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_TerminateProcessOnMemoryExhaustion(failedallocationsize: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_TouchFileTimes(filehandle: Long, psystemtime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_UnDecorateSymbolName(name: Long, outputstring: Long, maxstringlength: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_UnDecorateSymbolNameW(name: Long, outputstring: Long, maxstringlength: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_UnMapAndLoad(loadedimage: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_UnhandledExceptionFilter(exceptioninfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_UpdateDebugInfoFile(imagefilename: Long, symbolpath: Long, debugfilepath: Long, ntheaders: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_UpdateDebugInfoFileEx(imagefilename: Long, symbolpath: Long, debugfilepath: Long, ntheaders: Long, oldchecksum: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_WaitForDebugEvent(lpdebugevent: Long, dwmilliseconds: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_WaitForDebugEventEx(lpdebugevent: Long, dwmilliseconds: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_Wow64GetThreadContext(hthread: Long, lpcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_Wow64GetThreadSelectorEntry(hthread: Long, dwselector: Int, lpselectorentry: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_Wow64SetThreadContext(hthread: Long, lpcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_WriteProcessMemory(hprocess: Long, lpbaseaddress: Long, lpbuffer: Long, nsize: Long, lpnumberofbyteswritten: Long): Int
}

public actual fun AddVectoredContinueHandler(first: UInt, handler: PVECTORED_EXCEPTION_HANDLER): Long =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_AddVectoredContinueHandler(first.toInt(), handler.toLong())

public actual fun AddVectoredExceptionHandler(first: UInt, handler: PVECTORED_EXCEPTION_HANDLER): Long =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_AddVectoredExceptionHandler(first.toInt(), handler.toLong())

public actual fun Beep(dwfreq: UInt, dwduration: UInt): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_Beep(dwfreq.toInt(), dwduration.toInt())

public actual fun BindImage(imagename: PCSTR, dllpath: PCSTR, symbolpath: PCSTR): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_BindImage(imagename, dllpath, symbolpath)

public actual fun BindImageEx(flags: UInt, imagename: PCSTR, dllpath: PCSTR, symbolpath: PCSTR, statusroutine: PIMAGEHLP_STATUS_ROUTINE): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_BindImageEx(flags.toInt(), imagename, dllpath, symbolpath, statusroutine.toLong())

public actual fun CheckRemoteDebuggerPresent(hprocess: HANDLE, pbdebuggerpresent: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_CheckRemoteDebuggerPresent(hprocess, pbdebuggerpresent)

public actual fun CheckSumMappedFile(baseaddress: Long, filelength: UInt, headersum: Long, checksum: Long): Long =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_CheckSumMappedFile(baseaddress, filelength.toInt(), headersum, checksum)

public actual fun CloseThreadWaitChainSession(wcthandle: Long) {
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_CloseThreadWaitChainSession(wcthandle)
}

public actual fun ContinueDebugEvent(dwprocessid: UInt, dwthreadid: UInt, dwcontinuestatus: NTSTATUS): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_ContinueDebugEvent(dwprocessid.toInt(), dwthreadid.toInt(), dwcontinuestatus)

public actual fun CopyContext(destination: Long, contextflags: CONTEXT_FLAGS, source: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_CopyContext(destination, contextflags.toInt(), source)

public actual fun DbgHelpCreateUserDump(filename: PCSTR, callback: PDBGHELP_CREATE_USER_DUMP_CALLBACK, userdata: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_DbgHelpCreateUserDump(filename, callback.toLong(), userdata)

public actual fun DbgHelpCreateUserDumpW(filename: PCWSTR, callback: PDBGHELP_CREATE_USER_DUMP_CALLBACK, userdata: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_DbgHelpCreateUserDumpW(filename, callback.toLong(), userdata)

public actual fun DebugActiveProcess(dwprocessid: UInt): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_DebugActiveProcess(dwprocessid.toInt())

public actual fun DebugActiveProcessStop(dwprocessid: UInt): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_DebugActiveProcessStop(dwprocessid.toInt())

public actual fun DebugBreak() {
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_DebugBreak()
}

public actual fun DebugBreakProcess(process: HANDLE): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_DebugBreakProcess(process)

public actual fun DebugSetProcessKillOnExit(killonexit: BOOL): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_DebugSetProcessKillOnExit(killonexit)

public actual fun DecodePointer(ptr: Long): Long =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_DecodePointer(ptr)

public actual fun DecodeRemotePointer(processhandle: HANDLE, ptr: Long, decodedptr: Long): HRESULT =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_DecodeRemotePointer(processhandle, ptr, decodedptr)

public actual fun DecodeSystemPointer(ptr: Long): Long =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_DecodeSystemPointer(ptr)

public actual fun EncodePointer(ptr: Long): Long =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_EncodePointer(ptr)

public actual fun EncodeRemotePointer(processhandle: HANDLE, ptr: Long, encodedptr: Long): HRESULT =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_EncodeRemotePointer(processhandle, ptr, encodedptr)

public actual fun EncodeSystemPointer(ptr: Long): Long =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_EncodeSystemPointer(ptr)

public actual fun EnumDirTree(hprocess: HANDLE, rootpath: PCSTR, inputpathname: PCSTR, outputpathbuffer: PSTR, cb: PENUMDIRTREE_CALLBACK, data: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_EnumDirTree(hprocess, rootpath, inputpathname, outputpathbuffer, cb.toLong(), data)

public actual fun EnumDirTreeW(hprocess: HANDLE, rootpath: PCWSTR, inputpathname: PCWSTR, outputpathbuffer: PWSTR, cb: PENUMDIRTREE_CALLBACKW, data: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_EnumDirTreeW(hprocess, rootpath, inputpathname, outputpathbuffer, cb.toLong(), data)

public actual fun EnumerateLoadedModules64(hprocess: HANDLE, enumloadedmodulescallback: PENUMLOADED_MODULES_CALLBACK64, usercontext: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_EnumerateLoadedModules64(hprocess, enumloadedmodulescallback.toLong(), usercontext)

public actual fun EnumerateLoadedModulesEx(hprocess: HANDLE, enumloadedmodulescallback: PENUMLOADED_MODULES_CALLBACK64, usercontext: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_EnumerateLoadedModulesEx(hprocess, enumloadedmodulescallback.toLong(), usercontext)

public actual fun EnumerateLoadedModulesExW(hprocess: HANDLE, enumloadedmodulescallback: PENUMLOADED_MODULES_CALLBACKW64, usercontext: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_EnumerateLoadedModulesExW(hprocess, enumloadedmodulescallback.toLong(), usercontext)

public actual fun EnumerateLoadedModulesW64(hprocess: HANDLE, enumloadedmodulescallback: PENUMLOADED_MODULES_CALLBACKW64, usercontext: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_EnumerateLoadedModulesW64(hprocess, enumloadedmodulescallback.toLong(), usercontext)

public actual fun FatalAppExitA(uaction: UInt, lpmessagetext: PCSTR) {
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_FatalAppExitA(uaction.toInt(), lpmessagetext)
}

public actual fun FatalAppExitW(uaction: UInt, lpmessagetext: PCWSTR) {
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_FatalAppExitW(uaction.toInt(), lpmessagetext)
}

public actual fun FatalExit(exitcode: Int): Nothing {
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_FatalExit(exitcode)
    error("Unreachable noreturn C function FatalExit")
}

public actual fun FindDebugInfoFile(filename: PCSTR, symbolpath: PCSTR, debugfilepath: PSTR): HANDLE =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_FindDebugInfoFile(filename, symbolpath, debugfilepath)

public actual fun FindDebugInfoFileEx(filename: PCSTR, symbolpath: PCSTR, debugfilepath: PSTR, callback: PFIND_DEBUG_FILE_CALLBACK, callerdata: Long): HANDLE =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_FindDebugInfoFileEx(filename, symbolpath, debugfilepath, callback.toLong(), callerdata)

public actual fun FindDebugInfoFileExW(filename: PCWSTR, symbolpath: PCWSTR, debugfilepath: PWSTR, callback: PFIND_DEBUG_FILE_CALLBACKW, callerdata: Long): HANDLE =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_FindDebugInfoFileExW(filename, symbolpath, debugfilepath, callback.toLong(), callerdata)

public actual fun FindExecutableImage(filename: PCSTR, symbolpath: PCSTR, imagefilepath: PSTR): HANDLE =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_FindExecutableImage(filename, symbolpath, imagefilepath)

public actual fun FindExecutableImageEx(filename: PCSTR, symbolpath: PCSTR, imagefilepath: PSTR, callback: PFIND_EXE_FILE_CALLBACK, callerdata: Long): HANDLE =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_FindExecutableImageEx(filename, symbolpath, imagefilepath, callback.toLong(), callerdata)

public actual fun FindExecutableImageExW(filename: PCWSTR, symbolpath: PCWSTR, imagefilepath: PWSTR, callback: PFIND_EXE_FILE_CALLBACKW, callerdata: Long): HANDLE =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_FindExecutableImageExW(filename, symbolpath, imagefilepath, callback.toLong(), callerdata)

public actual fun FindFileInPath(hprocess: HANDLE, searchpatha: PCSTR, filename: PCSTR, id: Long, two: UInt, three: UInt, flags: UInt, filepath: PSTR): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_FindFileInPath(hprocess, searchpatha, filename, id, two.toInt(), three.toInt(), flags.toInt(), filepath)

public actual fun FindFileInSearchPath(hprocess: HANDLE, searchpatha: PCSTR, filename: PCSTR, one: UInt, two: UInt, three: UInt, filepath: PSTR): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_FindFileInSearchPath(hprocess, searchpatha, filename, one.toInt(), two.toInt(), three.toInt(), filepath)

public actual fun FlushInstructionCache(hprocess: HANDLE, lpbaseaddress: Long, dwsize: ULong): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_FlushInstructionCache(hprocess, lpbaseaddress, dwsize.toLong())

public actual fun FormatMessageA(dwflags: FORMAT_MESSAGE_OPTIONS, lpsource: Long, dwmessageid: UInt, dwlanguageid: UInt, lpbuffer: PSTR, nsize: UInt, arguments: Long): UInt =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_FormatMessageA(dwflags.toInt(), lpsource, dwmessageid.toInt(), dwlanguageid.toInt(), lpbuffer, nsize.toInt(), arguments).toUInt()

public actual fun FormatMessageW(dwflags: FORMAT_MESSAGE_OPTIONS, lpsource: Long, dwmessageid: UInt, dwlanguageid: UInt, lpbuffer: PWSTR, nsize: UInt, arguments: Long): UInt =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_FormatMessageW(dwflags.toInt(), lpsource, dwmessageid.toInt(), dwlanguageid.toInt(), lpbuffer, nsize.toInt(), arguments).toUInt()

public actual fun GetEnabledXStateFeatures(): ULong =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_GetEnabledXStateFeatures().toULong()

public actual fun GetErrorMode(): UInt =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_GetErrorMode().toUInt()

public actual fun GetImageConfigInformation(loadedimage: Long, imageconfiginformation: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_GetImageConfigInformation(loadedimage, imageconfiginformation)

public actual fun GetImageUnusedHeaderBytes(loadedimage: Long, sizeunusedheaderbytes: Long): UInt =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_GetImageUnusedHeaderBytes(loadedimage, sizeunusedheaderbytes).toUInt()

public actual fun GetSymLoadError(): UInt =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_GetSymLoadError().toUInt()

public actual fun GetThreadContext(hthread: HANDLE, lpcontext: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_GetThreadContext(hthread, lpcontext)

public actual fun GetThreadErrorMode(): UInt =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_GetThreadErrorMode().toUInt()

public actual fun GetThreadSelectorEntry(hthread: HANDLE, dwselector: UInt, lpselectorentry: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_GetThreadSelectorEntry(hthread, dwselector.toInt(), lpselectorentry)

public actual fun GetThreadWaitChain(wcthandle: Long, context: ULong, flags: WAIT_CHAIN_THREAD_OPTIONS, threadid: UInt, nodecount: Long, nodeinfoarray: Long, iscycle: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_GetThreadWaitChain(wcthandle, context.toLong(), flags.toInt(), threadid.toInt(), nodecount, nodeinfoarray, iscycle)

public actual fun GetTimestampForLoadedLibrary(module: HMODULE): UInt =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_GetTimestampForLoadedLibrary(module).toUInt()

public actual fun GetXStateFeaturesMask(context: Long, featuremask: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_GetXStateFeaturesMask(context, featuremask)

public actual fun ImageAddCertificate(filehandle: HANDLE, certificate: Long, index: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_ImageAddCertificate(filehandle, certificate, index)

public actual fun ImageDirectoryEntryToData(base: Long, mappedasimage: Boolean, directoryentry: IMAGE_DIRECTORY_ENTRY, size: Long): Long =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_ImageDirectoryEntryToData(base, mappedasimage, directoryentry.toShort(), size)

public actual fun ImageDirectoryEntryToDataEx(base: Long, mappedasimage: Boolean, directoryentry: IMAGE_DIRECTORY_ENTRY, size: Long, foundheader: Long): Long =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_ImageDirectoryEntryToDataEx(base, mappedasimage, directoryentry.toShort(), size, foundheader)

public actual fun ImageEnumerateCertificates(filehandle: HANDLE, typefilter: UShort, certificatecount: Long, indices: Long, indexcount: UInt): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_ImageEnumerateCertificates(filehandle, typefilter.toShort(), certificatecount, indices, indexcount.toInt())

public actual fun ImageGetCertificateData(filehandle: HANDLE, certificateindex: UInt, certificate: Long, requiredlength: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_ImageGetCertificateData(filehandle, certificateindex.toInt(), certificate, requiredlength)

public actual fun ImageGetCertificateHeader(filehandle: HANDLE, certificateindex: UInt, certificateheader: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_ImageGetCertificateHeader(filehandle, certificateindex.toInt(), certificateheader)

public actual fun ImageGetDigestStream(filehandle: HANDLE, digestlevel: UInt, digestfunction: DIGEST_FUNCTION, digesthandle: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_ImageGetDigestStream(filehandle, digestlevel.toInt(), digestfunction.toLong(), digesthandle)

public actual fun ImageLoad(dllname: PCSTR, dllpath: PCSTR): Long =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_ImageLoad(dllname, dllpath)

public actual fun ImageNtHeader(base: Long): Long =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_ImageNtHeader(base)

public actual fun ImageRemoveCertificate(filehandle: HANDLE, index: UInt): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_ImageRemoveCertificate(filehandle, index.toInt())

public actual fun ImageRvaToSection(ntheaders: Long, base: Long, rva: UInt): Long =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_ImageRvaToSection(ntheaders, base, rva.toInt())

public actual fun ImageRvaToVa(ntheaders: Long, base: Long, rva: UInt, lastrvasection: Long): Long =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_ImageRvaToVa(ntheaders, base, rva.toInt(), lastrvasection)

public actual fun ImageUnload(loadedimage: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_ImageUnload(loadedimage)

public actual fun ImagehlpApiVersion(): Long =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_ImagehlpApiVersion()

public actual fun ImagehlpApiVersionEx(appversion: Long): Long =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_ImagehlpApiVersionEx(appversion)

public actual fun InitializeContext(buffer: Long, contextflags: CONTEXT_FLAGS, context: Long, contextlength: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_InitializeContext(buffer, contextflags.toInt(), context, contextlength)

public actual fun InitializeContext2(buffer: Long, contextflags: CONTEXT_FLAGS, context: Long, contextlength: Long, xstatecompactionmask: ULong): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_InitializeContext2(buffer, contextflags.toInt(), context, contextlength, xstatecompactionmask.toLong())

public actual fun IsDebuggerPresent(): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_IsDebuggerPresent()

public actual fun LocateXStateFeature(context: Long, featureid: UInt, length: Long): Long =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_LocateXStateFeature(context, featureid.toInt(), length)

public actual fun MakeSureDirectoryPathExists(dirpath: PCSTR): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_MakeSureDirectoryPathExists(dirpath)

public actual fun MapAndLoad(imagename: PCSTR, dllpath: PCSTR, loadedimage: Long, dotdll: BOOL, readonly: BOOL): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_MapAndLoad(imagename, dllpath, loadedimage, dotdll, readonly)

public actual fun MapFileAndCheckSumA(filename: PCSTR, headersum: Long, checksum: Long): UInt =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_MapFileAndCheckSumA(filename, headersum, checksum).toUInt()

public actual fun MapFileAndCheckSumW(filename: PCWSTR, headersum: Long, checksum: Long): UInt =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_MapFileAndCheckSumW(filename, headersum, checksum).toUInt()

public actual fun MessageBeep(utype: MESSAGEBOX_STYLE): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_MessageBeep(utype.toInt())

public actual fun MiniDumpReadDumpStream(baseofdump: Long, streamnumber: UInt, dir: Long, streampointer: Long, streamsize: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_MiniDumpReadDumpStream(baseofdump, streamnumber.toInt(), dir, streampointer, streamsize)

public actual fun MiniDumpWriteDump(hprocess: HANDLE, processid: UInt, hfile: HANDLE, dumptype: MINIDUMP_TYPE, exceptionparam: Long, userstreamparam: Long, callbackparam: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_MiniDumpWriteDump(hprocess, processid.toInt(), hfile, dumptype, exceptionparam, userstreamparam, callbackparam)

public actual fun OpenThreadWaitChainSession(flags: OPEN_THREAD_WAIT_CHAIN_SESSION_FLAGS, callback: PWAITCHAINCALLBACK): Long =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_OpenThreadWaitChainSession(flags.toInt(), callback.toLong())

public actual fun OutputDebugStringA(lpoutputstring: PCSTR) {
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_OutputDebugStringA(lpoutputstring)
}

public actual fun OutputDebugStringW(lpoutputstring: PCWSTR) {
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_OutputDebugStringW(lpoutputstring)
}

public actual fun RaiseException(dwexceptioncode: UInt, dwexceptionflags: UInt, nnumberofarguments: UInt, lparguments: Long) {
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_RaiseException(dwexceptioncode.toInt(), dwexceptionflags.toInt(), nnumberofarguments.toInt(), lparguments)
}

public actual fun RaiseFailFastException(pexceptionrecord: Long, pcontextrecord: Long, dwflags: UInt) {
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_RaiseFailFastException(pexceptionrecord, pcontextrecord, dwflags.toInt())
}

public actual fun RangeMapAddPeImageSections(rmaphandle: Long, imagename: PCWSTR, mappedimage: Long, mappingbytes: UInt, imagebase: ULong, usertag: ULong, mappingflags: UInt): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_RangeMapAddPeImageSections(rmaphandle, imagename, mappedimage, mappingbytes.toInt(), imagebase.toLong(), usertag.toLong(), mappingflags.toInt())

public actual fun RangeMapCreate(): Long =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_RangeMapCreate()

public actual fun RangeMapFree(rmaphandle: Long) {
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_RangeMapFree(rmaphandle)
}

public actual fun RangeMapRead(rmaphandle: Long, offset: ULong, buffer: Long, requestbytes: UInt, flags: UInt, donebytes: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_RangeMapRead(rmaphandle, offset.toLong(), buffer, requestbytes.toInt(), flags.toInt(), donebytes)

public actual fun RangeMapRemove(rmaphandle: Long, usertag: ULong): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_RangeMapRemove(rmaphandle, usertag.toLong())

public actual fun RangeMapWrite(rmaphandle: Long, offset: ULong, buffer: Long, requestbytes: UInt, flags: UInt, donebytes: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_RangeMapWrite(rmaphandle, offset.toLong(), buffer, requestbytes.toInt(), flags.toInt(), donebytes)

public actual fun ReBaseImage(currentimagename: PCSTR, symbolpath: PCSTR, frebase: BOOL, frebasesysfileok: BOOL, fgoingdown: BOOL, checkimagesize: UInt, oldimagesize: Long, oldimagebase: Long, newimagesize: Long, newimagebase: Long, timestamp: UInt): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_ReBaseImage(currentimagename, symbolpath, frebase, frebasesysfileok, fgoingdown, checkimagesize.toInt(), oldimagesize, oldimagebase, newimagesize, newimagebase, timestamp.toInt())

public actual fun ReBaseImage64(currentimagename: PCSTR, symbolpath: PCSTR, frebase: BOOL, frebasesysfileok: BOOL, fgoingdown: BOOL, checkimagesize: UInt, oldimagesize: Long, oldimagebase: Long, newimagesize: Long, newimagebase: Long, timestamp: UInt): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_ReBaseImage64(currentimagename, symbolpath, frebase, frebasesysfileok, fgoingdown, checkimagesize.toInt(), oldimagesize, oldimagebase, newimagesize, newimagebase, timestamp.toInt())

public actual fun ReadProcessMemory(hprocess: HANDLE, lpbaseaddress: Long, lpbuffer: Long, nsize: ULong, lpnumberofbytesread: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_ReadProcessMemory(hprocess, lpbaseaddress, lpbuffer, nsize.toLong(), lpnumberofbytesread)

public actual fun RegisterWaitChainCOMCallback(callstatecallback: PCOGETCALLSTATE, activationstatecallback: PCOGETACTIVATIONSTATE) {
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_RegisterWaitChainCOMCallback(callstatecallback.toLong(), activationstatecallback.toLong())
}

public actual fun RemoveInvalidModuleList(hprocess: HANDLE) {
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_RemoveInvalidModuleList(hprocess)
}

public actual fun RemoveVectoredContinueHandler(handle: Long): UInt =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_RemoveVectoredContinueHandler(handle).toUInt()

public actual fun RemoveVectoredExceptionHandler(handle: Long): UInt =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_RemoveVectoredExceptionHandler(handle).toUInt()

public actual fun ReportSymbolLoadSummary(hprocess: HANDLE, ploadmodule: PCWSTR, psymboldata: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_ReportSymbolLoadSummary(hprocess, ploadmodule, psymboldata)

public actual fun RtlAddFunctionTable(functiontable: Long, entrycount: UInt, baseaddress: ULong): Boolean =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_RtlAddFunctionTable(functiontable, entrycount.toInt(), baseaddress.toLong())

public actual fun RtlAddGrowableFunctionTable(dynamictable: Long, functiontable: Long, entrycount: UInt, maximumentrycount: UInt, rangebase: ULong, rangeend: ULong): UInt =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_RtlAddGrowableFunctionTable(dynamictable, functiontable, entrycount.toInt(), maximumentrycount.toInt(), rangebase.toLong(), rangeend.toLong()).toUInt()

public actual fun RtlCaptureContext(contextrecord: Long) {
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_RtlCaptureContext(contextrecord)
}

public actual fun RtlCaptureContext2(contextrecord: Long) {
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_RtlCaptureContext2(contextrecord)
}

public actual fun RtlCaptureStackBackTrace(framestoskip: UInt, framestocapture: UInt, backtrace: Long, backtracehash: Long): UShort =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_RtlCaptureStackBackTrace(framestoskip.toInt(), framestocapture.toInt(), backtrace, backtracehash).toUShort()

public actual fun RtlDeleteFunctionTable(functiontable: Long): Boolean =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_RtlDeleteFunctionTable(functiontable)

public actual fun RtlDeleteGrowableFunctionTable(dynamictable: Long) {
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_RtlDeleteGrowableFunctionTable(dynamictable)
}

public actual fun RtlGrowFunctionTable(dynamictable: Long, newentrycount: UInt) {
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_RtlGrowFunctionTable(dynamictable, newentrycount.toInt())
}

public actual fun RtlInstallFunctionTableCallback(tableidentifier: ULong, baseaddress: ULong, length: UInt, callback: PGET_RUNTIME_FUNCTION_CALLBACK, context: Long, outofprocesscallbackdll: PCWSTR): Boolean =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_RtlInstallFunctionTableCallback(tableidentifier.toLong(), baseaddress.toLong(), length.toInt(), callback.toLong(), context, outofprocesscallbackdll)

public actual fun RtlLookupFunctionEntry(controlpc: ULong, imagebase: Long, historytable: Long): Long =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_RtlLookupFunctionEntry(controlpc.toLong(), imagebase, historytable)

public actual fun RtlPcToFileHeader(pcvalue: Long, baseofimage: Long): Long =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_RtlPcToFileHeader(pcvalue, baseofimage)

public actual fun RtlRaiseException(exceptionrecord: Long) {
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_RtlRaiseException(exceptionrecord)
}

public actual fun RtlRestoreContext(contextrecord: Long, exceptionrecord: Long) {
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_RtlRestoreContext(contextrecord, exceptionrecord)
}

public actual fun RtlUnwind(targetframe: Long, targetip: Long, exceptionrecord: Long, returnvalue: Long) {
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_RtlUnwind(targetframe, targetip, exceptionrecord, returnvalue)
}

public actual fun RtlUnwindEx(targetframe: Long, targetip: Long, exceptionrecord: Long, returnvalue: Long, contextrecord: Long, historytable: Long) {
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_RtlUnwindEx(targetframe, targetip, exceptionrecord, returnvalue, contextrecord, historytable)
}

public actual fun RtlVirtualUnwind(handlertype: RTL_VIRTUAL_UNWIND_HANDLER_TYPE, imagebase: ULong, controlpc: ULong, functionentry: Long, contextrecord: Long, handlerdata: Long, establisherframe: Long, contextpointers: Long): EXCEPTION_ROUTINE =
    null

public actual fun SearchTreeForFile(rootpath: PCSTR, inputpathname: PCSTR, outputpathbuffer: PSTR): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SearchTreeForFile(rootpath, inputpathname, outputpathbuffer)

public actual fun SearchTreeForFileW(rootpath: PCWSTR, inputpathname: PCWSTR, outputpathbuffer: PWSTR): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SearchTreeForFileW(rootpath, inputpathname, outputpathbuffer)

public actual fun SetCheckUserInterruptShared(lpstartaddress: LPCALL_BACK_USER_INTERRUPT_ROUTINE) {
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SetCheckUserInterruptShared(lpstartaddress.toLong())
}

public actual fun SetErrorMode(umode: THREAD_ERROR_MODE): THREAD_ERROR_MODE =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SetErrorMode(umode.toInt()).toUInt()

public actual fun SetImageConfigInformation(loadedimage: Long, imageconfiginformation: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SetImageConfigInformation(loadedimage, imageconfiginformation)

public actual fun SetSymLoadError(error: UInt) {
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SetSymLoadError(error.toInt())
}

public actual fun SetThreadContext(hthread: HANDLE, lpcontext: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SetThreadContext(hthread, lpcontext)

public actual fun SetThreadErrorMode(dwnewmode: THREAD_ERROR_MODE, lpoldmode: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SetThreadErrorMode(dwnewmode.toInt(), lpoldmode)

public actual fun SetUnhandledExceptionFilter(lptoplevelexceptionfilter: LPTOP_LEVEL_EXCEPTION_FILTER): LPTOP_LEVEL_EXCEPTION_FILTER =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SetUnhandledExceptionFilter(lptoplevelexceptionfilter.toLong())

public actual fun SetXStateFeaturesMask(context: Long, featuremask: ULong): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SetXStateFeaturesMask(context, featuremask.toLong())

public actual fun StackWalk2(machinetype: UInt, hprocess: HANDLE, hthread: HANDLE, stackframe: Long, contextrecord: Long, readmemoryroutine: PREAD_PROCESS_MEMORY_ROUTINE64, functiontableaccessroutine: PFUNCTION_TABLE_ACCESS_ROUTINE64, getmodulebaseroutine: PGET_MODULE_BASE_ROUTINE64, translateaddress: PTRANSLATE_ADDRESS_ROUTINE64, gettargetattributevalue: PGET_TARGET_ATTRIBUTE_VALUE64, flags: UInt): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_StackWalk2(machinetype.toInt(), hprocess, hthread, stackframe, contextrecord, readmemoryroutine.toLong(), functiontableaccessroutine.toLong(), getmodulebaseroutine.toLong(), translateaddress.toLong(), gettargetattributevalue.toLong(), flags.toInt())

public actual fun StackWalk64(machinetype: UInt, hprocess: HANDLE, hthread: HANDLE, stackframe: Long, contextrecord: Long, readmemoryroutine: PREAD_PROCESS_MEMORY_ROUTINE64, functiontableaccessroutine: PFUNCTION_TABLE_ACCESS_ROUTINE64, getmodulebaseroutine: PGET_MODULE_BASE_ROUTINE64, translateaddress: PTRANSLATE_ADDRESS_ROUTINE64): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_StackWalk64(machinetype.toInt(), hprocess, hthread, stackframe, contextrecord, readmemoryroutine.toLong(), functiontableaccessroutine.toLong(), getmodulebaseroutine.toLong(), translateaddress.toLong())

public actual fun StackWalkEx(machinetype: UInt, hprocess: HANDLE, hthread: HANDLE, stackframe: Long, contextrecord: Long, readmemoryroutine: PREAD_PROCESS_MEMORY_ROUTINE64, functiontableaccessroutine: PFUNCTION_TABLE_ACCESS_ROUTINE64, getmodulebaseroutine: PGET_MODULE_BASE_ROUTINE64, translateaddress: PTRANSLATE_ADDRESS_ROUTINE64, flags: UInt): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_StackWalkEx(machinetype.toInt(), hprocess, hthread, stackframe, contextrecord, readmemoryroutine.toLong(), functiontableaccessroutine.toLong(), getmodulebaseroutine.toLong(), translateaddress.toLong(), flags.toInt())

public actual fun SymAddSourceStream(hprocess: HANDLE, base: ULong, streamfile: PCSTR, buffer: Long, size: ULong): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymAddSourceStream(hprocess, base.toLong(), streamfile, buffer, size.toLong())

public actual fun SymAddSourceStreamA(hprocess: HANDLE, base: ULong, streamfile: PCSTR, buffer: Long, size: ULong): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymAddSourceStreamA(hprocess, base.toLong(), streamfile, buffer, size.toLong())

public actual fun SymAddSourceStreamW(hprocess: HANDLE, base: ULong, filespec: PCWSTR, buffer: Long, size: ULong): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymAddSourceStreamW(hprocess, base.toLong(), filespec, buffer, size.toLong())

public actual fun SymAddSymbol(hprocess: HANDLE, baseofdll: ULong, name: PCSTR, address: ULong, size: UInt, flags: UInt): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymAddSymbol(hprocess, baseofdll.toLong(), name, address.toLong(), size.toInt(), flags.toInt())

public actual fun SymAddSymbolW(hprocess: HANDLE, baseofdll: ULong, name: PCWSTR, address: ULong, size: UInt, flags: UInt): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymAddSymbolW(hprocess, baseofdll.toLong(), name, address.toLong(), size.toInt(), flags.toInt())

public actual fun SymAddrIncludeInlineTrace(hprocess: HANDLE, address: ULong): UInt =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymAddrIncludeInlineTrace(hprocess, address.toLong()).toUInt()

public actual fun SymCleanup(hprocess: HANDLE): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymCleanup(hprocess)

public actual fun SymCompareInlineTrace(hprocess: HANDLE, address1: ULong, inlinecontext1: UInt, retaddress1: ULong, address2: ULong, retaddress2: ULong): UInt =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymCompareInlineTrace(hprocess, address1.toLong(), inlinecontext1.toInt(), retaddress1.toLong(), address2.toLong(), retaddress2.toLong()).toUInt()

public actual fun SymDeleteSymbol(hprocess: HANDLE, baseofdll: ULong, name: PCSTR, address: ULong, flags: UInt): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymDeleteSymbol(hprocess, baseofdll.toLong(), name, address.toLong(), flags.toInt())

public actual fun SymDeleteSymbolW(hprocess: HANDLE, baseofdll: ULong, name: PCWSTR, address: ULong, flags: UInt): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymDeleteSymbolW(hprocess, baseofdll.toLong(), name, address.toLong(), flags.toInt())

public actual fun SymEnumLines(hprocess: HANDLE, base: ULong, obj: PCSTR, file: PCSTR, enumlinescallback: PSYM_ENUMLINES_CALLBACK, usercontext: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymEnumLines(hprocess, base.toLong(), obj, file, enumlinescallback.toLong(), usercontext)

public actual fun SymEnumLinesW(hprocess: HANDLE, base: ULong, obj: PCWSTR, file: PCWSTR, enumlinescallback: PSYM_ENUMLINES_CALLBACKW, usercontext: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymEnumLinesW(hprocess, base.toLong(), obj, file, enumlinescallback.toLong(), usercontext)

public actual fun SymEnumProcesses(enumprocessescallback: PSYM_ENUMPROCESSES_CALLBACK, usercontext: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymEnumProcesses(enumprocessescallback.toLong(), usercontext)

public actual fun SymEnumSourceFileTokens(hprocess: HANDLE, base: ULong, callback: PENUMSOURCEFILETOKENSCALLBACK): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymEnumSourceFileTokens(hprocess, base.toLong(), callback.toLong())

public actual fun SymEnumSourceFiles(hprocess: HANDLE, modbase: ULong, mask: PCSTR, cbsrcfiles: PSYM_ENUMSOURCEFILES_CALLBACK, usercontext: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymEnumSourceFiles(hprocess, modbase.toLong(), mask, cbsrcfiles.toLong(), usercontext)

public actual fun SymEnumSourceFilesW(hprocess: HANDLE, modbase: ULong, mask: PCWSTR, cbsrcfiles: PSYM_ENUMSOURCEFILES_CALLBACKW, usercontext: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymEnumSourceFilesW(hprocess, modbase.toLong(), mask, cbsrcfiles.toLong(), usercontext)

public actual fun SymEnumSourceLines(hprocess: HANDLE, base: ULong, obj: PCSTR, file: PCSTR, line: UInt, flags: UInt, enumlinescallback: PSYM_ENUMLINES_CALLBACK, usercontext: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymEnumSourceLines(hprocess, base.toLong(), obj, file, line.toInt(), flags.toInt(), enumlinescallback.toLong(), usercontext)

public actual fun SymEnumSourceLinesW(hprocess: HANDLE, base: ULong, obj: PCWSTR, file: PCWSTR, line: UInt, flags: UInt, enumlinescallback: PSYM_ENUMLINES_CALLBACKW, usercontext: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymEnumSourceLinesW(hprocess, base.toLong(), obj, file, line.toInt(), flags.toInt(), enumlinescallback.toLong(), usercontext)

public actual fun SymEnumSym(hprocess: HANDLE, baseofdll: ULong, enumsymbolscallback: PSYM_ENUMERATESYMBOLS_CALLBACK, usercontext: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymEnumSym(hprocess, baseofdll.toLong(), enumsymbolscallback.toLong(), usercontext)

public actual fun SymEnumSymbols(hprocess: HANDLE, baseofdll: ULong, mask: PCSTR, enumsymbolscallback: PSYM_ENUMERATESYMBOLS_CALLBACK, usercontext: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymEnumSymbols(hprocess, baseofdll.toLong(), mask, enumsymbolscallback.toLong(), usercontext)

public actual fun SymEnumSymbolsEx(hprocess: HANDLE, baseofdll: ULong, mask: PCSTR, enumsymbolscallback: PSYM_ENUMERATESYMBOLS_CALLBACK, usercontext: Long, options: UInt): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymEnumSymbolsEx(hprocess, baseofdll.toLong(), mask, enumsymbolscallback.toLong(), usercontext, options.toInt())

public actual fun SymEnumSymbolsExW(hprocess: HANDLE, baseofdll: ULong, mask: PCWSTR, enumsymbolscallback: PSYM_ENUMERATESYMBOLS_CALLBACKW, usercontext: Long, options: UInt): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymEnumSymbolsExW(hprocess, baseofdll.toLong(), mask, enumsymbolscallback.toLong(), usercontext, options.toInt())

public actual fun SymEnumSymbolsForAddr(hprocess: HANDLE, address: ULong, enumsymbolscallback: PSYM_ENUMERATESYMBOLS_CALLBACK, usercontext: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymEnumSymbolsForAddr(hprocess, address.toLong(), enumsymbolscallback.toLong(), usercontext)

public actual fun SymEnumSymbolsForAddrW(hprocess: HANDLE, address: ULong, enumsymbolscallback: PSYM_ENUMERATESYMBOLS_CALLBACKW, usercontext: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymEnumSymbolsForAddrW(hprocess, address.toLong(), enumsymbolscallback.toLong(), usercontext)

public actual fun SymEnumSymbolsW(hprocess: HANDLE, baseofdll: ULong, mask: PCWSTR, enumsymbolscallback: PSYM_ENUMERATESYMBOLS_CALLBACKW, usercontext: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymEnumSymbolsW(hprocess, baseofdll.toLong(), mask, enumsymbolscallback.toLong(), usercontext)

public actual fun SymEnumTypes(hprocess: HANDLE, baseofdll: ULong, enumsymbolscallback: PSYM_ENUMERATESYMBOLS_CALLBACK, usercontext: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymEnumTypes(hprocess, baseofdll.toLong(), enumsymbolscallback.toLong(), usercontext)

public actual fun SymEnumTypesByName(hprocess: HANDLE, baseofdll: ULong, mask: PCSTR, enumsymbolscallback: PSYM_ENUMERATESYMBOLS_CALLBACK, usercontext: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymEnumTypesByName(hprocess, baseofdll.toLong(), mask, enumsymbolscallback.toLong(), usercontext)

public actual fun SymEnumTypesByNameW(hprocess: HANDLE, baseofdll: ULong, mask: PCWSTR, enumsymbolscallback: PSYM_ENUMERATESYMBOLS_CALLBACKW, usercontext: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymEnumTypesByNameW(hprocess, baseofdll.toLong(), mask, enumsymbolscallback.toLong(), usercontext)

public actual fun SymEnumTypesW(hprocess: HANDLE, baseofdll: ULong, enumsymbolscallback: PSYM_ENUMERATESYMBOLS_CALLBACKW, usercontext: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymEnumTypesW(hprocess, baseofdll.toLong(), enumsymbolscallback.toLong(), usercontext)

public actual fun SymEnumerateModules64(hprocess: HANDLE, enummodulescallback: PSYM_ENUMMODULES_CALLBACK64, usercontext: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymEnumerateModules64(hprocess, enummodulescallback.toLong(), usercontext)

public actual fun SymEnumerateModulesW64(hprocess: HANDLE, enummodulescallback: PSYM_ENUMMODULES_CALLBACKW64, usercontext: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymEnumerateModulesW64(hprocess, enummodulescallback.toLong(), usercontext)

public actual fun SymEnumerateSymbols64(hprocess: HANDLE, baseofdll: ULong, enumsymbolscallback: PSYM_ENUMSYMBOLS_CALLBACK64, usercontext: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymEnumerateSymbols64(hprocess, baseofdll.toLong(), enumsymbolscallback.toLong(), usercontext)

public actual fun SymEnumerateSymbolsW64(hprocess: HANDLE, baseofdll: ULong, enumsymbolscallback: PSYM_ENUMSYMBOLS_CALLBACK64W, usercontext: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymEnumerateSymbolsW64(hprocess, baseofdll.toLong(), enumsymbolscallback.toLong(), usercontext)

public actual fun SymFindDebugInfoFile(hprocess: HANDLE, filename: PCSTR, debugfilepath: PSTR, callback: PFIND_DEBUG_FILE_CALLBACK, callerdata: Long): HANDLE =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymFindDebugInfoFile(hprocess, filename, debugfilepath, callback.toLong(), callerdata)

public actual fun SymFindDebugInfoFileW(hprocess: HANDLE, filename: PCWSTR, debugfilepath: PWSTR, callback: PFIND_DEBUG_FILE_CALLBACKW, callerdata: Long): HANDLE =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymFindDebugInfoFileW(hprocess, filename, debugfilepath, callback.toLong(), callerdata)

public actual fun SymFindExecutableImage(hprocess: HANDLE, filename: PCSTR, imagefilepath: PSTR, callback: PFIND_EXE_FILE_CALLBACK, callerdata: Long): HANDLE =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymFindExecutableImage(hprocess, filename, imagefilepath, callback.toLong(), callerdata)

public actual fun SymFindExecutableImageW(hprocess: HANDLE, filename: PCWSTR, imagefilepath: PWSTR, callback: PFIND_EXE_FILE_CALLBACKW, callerdata: Long): HANDLE =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymFindExecutableImageW(hprocess, filename, imagefilepath, callback.toLong(), callerdata)

public actual fun SymFindFileInPath(hprocess: HANDLE, searchpatha: PCSTR, filename: PCSTR, id: Long, two: UInt, three: UInt, flags: SYM_FIND_ID_OPTION, foundfile: PSTR, callback: PFINDFILEINPATHCALLBACK, context: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymFindFileInPath(hprocess, searchpatha, filename, id, two.toInt(), three.toInt(), flags.toInt(), foundfile, callback.toLong(), context)

public actual fun SymFindFileInPathW(hprocess: HANDLE, searchpatha: PCWSTR, filename: PCWSTR, id: Long, two: UInt, three: UInt, flags: SYM_FIND_ID_OPTION, foundfile: PWSTR, callback: PFINDFILEINPATHCALLBACKW, context: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymFindFileInPathW(hprocess, searchpatha, filename, id, two.toInt(), three.toInt(), flags.toInt(), foundfile, callback.toLong(), context)

public actual fun SymFromAddr(hprocess: HANDLE, address: ULong, displacement: Long, symbol: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymFromAddr(hprocess, address.toLong(), displacement, symbol)

public actual fun SymFromAddrW(hprocess: HANDLE, address: ULong, displacement: Long, symbol: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymFromAddrW(hprocess, address.toLong(), displacement, symbol)

public actual fun SymFromIndex(hprocess: HANDLE, baseofdll: ULong, index: UInt, symbol: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymFromIndex(hprocess, baseofdll.toLong(), index.toInt(), symbol)

public actual fun SymFromIndexW(hprocess: HANDLE, baseofdll: ULong, index: UInt, symbol: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymFromIndexW(hprocess, baseofdll.toLong(), index.toInt(), symbol)

public actual fun SymFromInlineContext(hprocess: HANDLE, address: ULong, inlinecontext: UInt, displacement: Long, symbol: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymFromInlineContext(hprocess, address.toLong(), inlinecontext.toInt(), displacement, symbol)

public actual fun SymFromInlineContextW(hprocess: HANDLE, address: ULong, inlinecontext: UInt, displacement: Long, symbol: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymFromInlineContextW(hprocess, address.toLong(), inlinecontext.toInt(), displacement, symbol)

public actual fun SymFromName(hprocess: HANDLE, name: PCSTR, symbol: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymFromName(hprocess, name, symbol)

public actual fun SymFromNameW(hprocess: HANDLE, name: PCWSTR, symbol: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymFromNameW(hprocess, name, symbol)

public actual fun SymFromToken(hprocess: HANDLE, base: ULong, token: UInt, symbol: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymFromToken(hprocess, base.toLong(), token.toInt(), symbol)

public actual fun SymFromTokenW(hprocess: HANDLE, base: ULong, token: UInt, symbol: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymFromTokenW(hprocess, base.toLong(), token.toInt(), symbol)

public actual fun SymFunctionTableAccess64(hprocess: HANDLE, addrbase: ULong): Long =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymFunctionTableAccess64(hprocess, addrbase.toLong())

public actual fun SymFunctionTableAccess64AccessRoutines(hprocess: HANDLE, addrbase: ULong, readmemoryroutine: PREAD_PROCESS_MEMORY_ROUTINE64, getmodulebaseroutine: PGET_MODULE_BASE_ROUTINE64): Long =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymFunctionTableAccess64AccessRoutines(hprocess, addrbase.toLong(), readmemoryroutine.toLong(), getmodulebaseroutine.toLong())

public actual fun SymGetExtendedOption(option: IMAGEHLP_EXTENDED_OPTIONS): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymGetExtendedOption(option)

public actual fun SymGetFileLineOffsets64(hprocess: HANDLE, modulename: PCSTR, filename: PCSTR, buffer: Long, bufferlines: UInt): UInt =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymGetFileLineOffsets64(hprocess, modulename, filename, buffer, bufferlines.toInt()).toUInt()

public actual fun SymGetHomeDirectory(type: UInt, dir: PSTR, size: ULong): PSTR =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymGetHomeDirectory(type.toInt(), dir, size.toLong())

public actual fun SymGetHomeDirectoryW(type: UInt, dir: PWSTR, size: ULong): PWSTR =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymGetHomeDirectoryW(type.toInt(), dir, size.toLong())

public actual fun SymGetLineFromAddr64(hprocess: HANDLE, qwaddr: ULong, pdwdisplacement: Long, line64: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymGetLineFromAddr64(hprocess, qwaddr.toLong(), pdwdisplacement, line64)

public actual fun SymGetLineFromAddrW64(hprocess: HANDLE, dwaddr: ULong, pdwdisplacement: Long, line: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymGetLineFromAddrW64(hprocess, dwaddr.toLong(), pdwdisplacement, line)

public actual fun SymGetLineFromInlineContext(hprocess: HANDLE, qwaddr: ULong, inlinecontext: UInt, qwmodulebaseaddress: ULong, pdwdisplacement: Long, line64: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymGetLineFromInlineContext(hprocess, qwaddr.toLong(), inlinecontext.toInt(), qwmodulebaseaddress.toLong(), pdwdisplacement, line64)

public actual fun SymGetLineFromInlineContextW(hprocess: HANDLE, dwaddr: ULong, inlinecontext: UInt, qwmodulebaseaddress: ULong, pdwdisplacement: Long, line: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymGetLineFromInlineContextW(hprocess, dwaddr.toLong(), inlinecontext.toInt(), qwmodulebaseaddress.toLong(), pdwdisplacement, line)

public actual fun SymGetLineFromName64(hprocess: HANDLE, modulename: PCSTR, filename: PCSTR, dwlinenumber: UInt, pldisplacement: Long, line: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymGetLineFromName64(hprocess, modulename, filename, dwlinenumber.toInt(), pldisplacement, line)

public actual fun SymGetLineFromNameW64(hprocess: HANDLE, modulename: PCWSTR, filename: PCWSTR, dwlinenumber: UInt, pldisplacement: Long, line: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymGetLineFromNameW64(hprocess, modulename, filename, dwlinenumber.toInt(), pldisplacement, line)

public actual fun SymGetLineNext64(hprocess: HANDLE, line: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymGetLineNext64(hprocess, line)

public actual fun SymGetLineNextW64(hprocess: HANDLE, line: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymGetLineNextW64(hprocess, line)

public actual fun SymGetLinePrev64(hprocess: HANDLE, line: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymGetLinePrev64(hprocess, line)

public actual fun SymGetLinePrevW64(hprocess: HANDLE, line: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymGetLinePrevW64(hprocess, line)

public actual fun SymGetModuleBase64(hprocess: HANDLE, qwaddr: ULong): ULong =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymGetModuleBase64(hprocess, qwaddr.toLong()).toULong()

public actual fun SymGetModuleInfo64(hprocess: HANDLE, qwaddr: ULong, moduleinfo: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymGetModuleInfo64(hprocess, qwaddr.toLong(), moduleinfo)

public actual fun SymGetModuleInfoW64(hprocess: HANDLE, qwaddr: ULong, moduleinfo: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymGetModuleInfoW64(hprocess, qwaddr.toLong(), moduleinfo)

public actual fun SymGetOmaps(hprocess: HANDLE, baseofdll: ULong, omapto: Long, comapto: Long, omapfrom: Long, comapfrom: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymGetOmaps(hprocess, baseofdll.toLong(), omapto, comapto, omapfrom, comapfrom)

public actual fun SymGetOptions(): UInt =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymGetOptions().toUInt()

public actual fun SymGetScope(hprocess: HANDLE, baseofdll: ULong, index: UInt, symbol: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymGetScope(hprocess, baseofdll.toLong(), index.toInt(), symbol)

public actual fun SymGetScopeW(hprocess: HANDLE, baseofdll: ULong, index: UInt, symbol: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymGetScopeW(hprocess, baseofdll.toLong(), index.toInt(), symbol)

public actual fun SymGetSearchPath(hprocess: HANDLE, searchpatha: PSTR, searchpathlength: UInt): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymGetSearchPath(hprocess, searchpatha, searchpathlength.toInt())

public actual fun SymGetSearchPathW(hprocess: HANDLE, searchpatha: PWSTR, searchpathlength: UInt): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymGetSearchPathW(hprocess, searchpatha, searchpathlength.toInt())

public actual fun SymGetSourceFile(hprocess: HANDLE, base: ULong, params: PCSTR, filespec: PCSTR, filepath: PSTR, size: UInt): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFile(hprocess, base.toLong(), params, filespec, filepath, size.toInt())

public actual fun SymGetSourceFileChecksum(hprocess: HANDLE, base: ULong, filespec: PCSTR, pchecksumtype: Long, pchecksum: Long, checksumsize: UInt, pactualbyteswritten: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFileChecksum(hprocess, base.toLong(), filespec, pchecksumtype, pchecksum, checksumsize.toInt(), pactualbyteswritten)

public actual fun SymGetSourceFileChecksumW(hprocess: HANDLE, base: ULong, filespec: PCWSTR, pchecksumtype: Long, pchecksum: Long, checksumsize: UInt, pactualbyteswritten: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFileChecksumW(hprocess, base.toLong(), filespec, pchecksumtype, pchecksum, checksumsize.toInt(), pactualbyteswritten)

public actual fun SymGetSourceFileFromToken(hprocess: HANDLE, token: Long, params: PCSTR, filepath: PSTR, size: UInt): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFileFromToken(hprocess, token, params, filepath, size.toInt())

public actual fun SymGetSourceFileFromTokenByTokenName(hprocess: HANDLE, token: Long, tokenname: PCSTR, params: PCSTR, filepath: PSTR, size: UInt): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFileFromTokenByTokenName(hprocess, token, tokenname, params, filepath, size.toInt())

public actual fun SymGetSourceFileFromTokenByTokenNameW(hprocess: HANDLE, token: Long, tokenname: PCWSTR, params: PCWSTR, filepath: PWSTR, size: UInt): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFileFromTokenByTokenNameW(hprocess, token, tokenname, params, filepath, size.toInt())

public actual fun SymGetSourceFileFromTokenW(hprocess: HANDLE, token: Long, params: PCWSTR, filepath: PWSTR, size: UInt): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFileFromTokenW(hprocess, token, params, filepath, size.toInt())

public actual fun SymGetSourceFileToken(hprocess: HANDLE, base: ULong, filespec: PCSTR, token: Long, size: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFileToken(hprocess, base.toLong(), filespec, token, size)

public actual fun SymGetSourceFileTokenByTokenName(hprocess: HANDLE, base: ULong, filespec: PCSTR, tokenname: PCSTR, tokenparameters: PCSTR, token: Long, size: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFileTokenByTokenName(hprocess, base.toLong(), filespec, tokenname, tokenparameters, token, size)

public actual fun SymGetSourceFileTokenByTokenNameW(hprocess: HANDLE, base: ULong, filespec: PCWSTR, tokenname: PCWSTR, tokenparameters: PCWSTR, token: Long, size: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFileTokenByTokenNameW(hprocess, base.toLong(), filespec, tokenname, tokenparameters, token, size)

public actual fun SymGetSourceFileTokenW(hprocess: HANDLE, base: ULong, filespec: PCWSTR, token: Long, size: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFileTokenW(hprocess, base.toLong(), filespec, token, size)

public actual fun SymGetSourceFileW(hprocess: HANDLE, base: ULong, params: PCWSTR, filespec: PCWSTR, filepath: PWSTR, size: UInt): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFileW(hprocess, base.toLong(), params, filespec, filepath, size.toInt())

public actual fun SymGetSourceVarFromToken(hprocess: HANDLE, token: Long, params: PCSTR, varname: PCSTR, value: PSTR, size: UInt): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymGetSourceVarFromToken(hprocess, token, params, varname, value, size.toInt())

public actual fun SymGetSourceVarFromTokenW(hprocess: HANDLE, token: Long, params: PCWSTR, varname: PCWSTR, value: PWSTR, size: UInt): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymGetSourceVarFromTokenW(hprocess, token, params, varname, value, size.toInt())

public actual fun SymGetSymFromAddr64(hprocess: HANDLE, qwaddr: ULong, pdwdisplacement: Long, symbol: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymGetSymFromAddr64(hprocess, qwaddr.toLong(), pdwdisplacement, symbol)

public actual fun SymGetSymFromName64(hprocess: HANDLE, name: PCSTR, symbol: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymGetSymFromName64(hprocess, name, symbol)

public actual fun SymGetSymNext64(hprocess: HANDLE, symbol: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymGetSymNext64(hprocess, symbol)

public actual fun SymGetSymPrev64(hprocess: HANDLE, symbol: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymGetSymPrev64(hprocess, symbol)

public actual fun SymGetSymbolFile(hprocess: HANDLE, sympath: PCSTR, imagefile: PCSTR, type: UInt, symbolfile: PSTR, csymbolfile: ULong, dbgfile: PSTR, cdbgfile: ULong): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymGetSymbolFile(hprocess, sympath, imagefile, type.toInt(), symbolfile, csymbolfile.toLong(), dbgfile, cdbgfile.toLong())

public actual fun SymGetSymbolFileW(hprocess: HANDLE, sympath: PCWSTR, imagefile: PCWSTR, type: UInt, symbolfile: PWSTR, csymbolfile: ULong, dbgfile: PWSTR, cdbgfile: ULong): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymGetSymbolFileW(hprocess, sympath, imagefile, type.toInt(), symbolfile, csymbolfile.toLong(), dbgfile, cdbgfile.toLong())

public actual fun SymGetTypeFromName(hprocess: HANDLE, baseofdll: ULong, name: PCSTR, symbol: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymGetTypeFromName(hprocess, baseofdll.toLong(), name, symbol)

public actual fun SymGetTypeFromNameW(hprocess: HANDLE, baseofdll: ULong, name: PCWSTR, symbol: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymGetTypeFromNameW(hprocess, baseofdll.toLong(), name, symbol)

public actual fun SymGetTypeInfo(hprocess: HANDLE, modbase: ULong, typeid: UInt, gettype: IMAGEHLP_SYMBOL_TYPE_INFO, pinfo: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymGetTypeInfo(hprocess, modbase.toLong(), typeid.toInt(), gettype, pinfo)

public actual fun SymGetTypeInfoEx(hprocess: HANDLE, modbase: ULong, params: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymGetTypeInfoEx(hprocess, modbase.toLong(), params)

public actual fun SymGetUnwindInfo(hprocess: HANDLE, address: ULong, buffer: Long, size: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymGetUnwindInfo(hprocess, address.toLong(), buffer, size)

public actual fun SymInitialize(hprocess: HANDLE, usersearchpath: PCSTR, finvadeprocess: BOOL): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymInitialize(hprocess, usersearchpath, finvadeprocess)

public actual fun SymInitializeW(hprocess: HANDLE, usersearchpath: PCWSTR, finvadeprocess: BOOL): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymInitializeW(hprocess, usersearchpath, finvadeprocess)

public actual fun SymLoadModule64(hprocess: HANDLE, hfile: HANDLE, imagename: PCSTR, modulename: PCSTR, baseofdll: ULong, sizeofdll: UInt): ULong =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymLoadModule64(hprocess, hfile, imagename, modulename, baseofdll.toLong(), sizeofdll.toInt()).toULong()

public actual fun SymLoadModuleEx(hprocess: HANDLE, hfile: HANDLE, imagename: PCSTR, modulename: PCSTR, baseofdll: ULong, dllsize: UInt, data: Long, flags: SYM_LOAD_FLAGS): ULong =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymLoadModuleEx(hprocess, hfile, imagename, modulename, baseofdll.toLong(), dllsize.toInt(), data, flags.toInt()).toULong()

public actual fun SymLoadModuleExW(hprocess: HANDLE, hfile: HANDLE, imagename: PCWSTR, modulename: PCWSTR, baseofdll: ULong, dllsize: UInt, data: Long, flags: SYM_LOAD_FLAGS): ULong =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymLoadModuleExW(hprocess, hfile, imagename, modulename, baseofdll.toLong(), dllsize.toInt(), data, flags.toInt()).toULong()

public actual fun SymMatchFileName(filename: PCSTR, match: PCSTR, filenamestop: Long, matchstop: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymMatchFileName(filename, match, filenamestop, matchstop)

public actual fun SymMatchFileNameW(filename: PCWSTR, match: PCWSTR, filenamestop: Long, matchstop: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymMatchFileNameW(filename, match, filenamestop, matchstop)

public actual fun SymMatchString(string: PCSTR, expression: PCSTR, fcase: BOOL): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymMatchString(string, expression, fcase)

public actual fun SymMatchStringA(string: PCSTR, expression: PCSTR, fcase: BOOL): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymMatchStringA(string, expression, fcase)

public actual fun SymMatchStringW(string: PCWSTR, expression: PCWSTR, fcase: BOOL): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymMatchStringW(string, expression, fcase)

public actual fun SymNext(hprocess: HANDLE, si: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymNext(hprocess, si)

public actual fun SymNextW(hprocess: HANDLE, siw: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymNextW(hprocess, siw)

public actual fun SymPrev(hprocess: HANDLE, si: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymPrev(hprocess, si)

public actual fun SymPrevW(hprocess: HANDLE, siw: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymPrevW(hprocess, siw)

public actual fun SymQueryInlineTrace(hprocess: HANDLE, startaddress: ULong, startcontext: UInt, startretaddress: ULong, curaddress: ULong, curcontext: Long, curframeindex: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymQueryInlineTrace(hprocess, startaddress.toLong(), startcontext.toInt(), startretaddress.toLong(), curaddress.toLong(), curcontext, curframeindex)

public actual fun SymRefreshModuleList(hprocess: HANDLE): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymRefreshModuleList(hprocess)

public actual fun SymRegisterCallback64(hprocess: HANDLE, callbackfunction: PSYMBOL_REGISTERED_CALLBACK64, usercontext: ULong): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymRegisterCallback64(hprocess, callbackfunction.toLong(), usercontext.toLong())

public actual fun SymRegisterCallbackW64(hprocess: HANDLE, callbackfunction: PSYMBOL_REGISTERED_CALLBACK64, usercontext: ULong): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymRegisterCallbackW64(hprocess, callbackfunction.toLong(), usercontext.toLong())

public actual fun SymRegisterFunctionEntryCallback64(hprocess: HANDLE, callbackfunction: PSYMBOL_FUNCENTRY_CALLBACK64, usercontext: ULong): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymRegisterFunctionEntryCallback64(hprocess, callbackfunction.toLong(), usercontext.toLong())

public actual fun SymSearch(hprocess: HANDLE, baseofdll: ULong, index: UInt, symtag: UInt, mask: PCSTR, address: ULong, enumsymbolscallback: PSYM_ENUMERATESYMBOLS_CALLBACK, usercontext: Long, options: UInt): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymSearch(hprocess, baseofdll.toLong(), index.toInt(), symtag.toInt(), mask, address.toLong(), enumsymbolscallback.toLong(), usercontext, options.toInt())

public actual fun SymSearchW(hprocess: HANDLE, baseofdll: ULong, index: UInt, symtag: UInt, mask: PCWSTR, address: ULong, enumsymbolscallback: PSYM_ENUMERATESYMBOLS_CALLBACKW, usercontext: Long, options: UInt): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymSearchW(hprocess, baseofdll.toLong(), index.toInt(), symtag.toInt(), mask, address.toLong(), enumsymbolscallback.toLong(), usercontext, options.toInt())

public actual fun SymSetContext(hprocess: HANDLE, stackframe: Long, context: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymSetContext(hprocess, stackframe, context)

public actual fun SymSetExtendedOption(option: IMAGEHLP_EXTENDED_OPTIONS, value: BOOL): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymSetExtendedOption(option, value)

public actual fun SymSetHomeDirectory(hprocess: HANDLE, dir: PCSTR): PSTR =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymSetHomeDirectory(hprocess, dir)

public actual fun SymSetHomeDirectoryW(hprocess: HANDLE, dir: PCWSTR): PWSTR =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymSetHomeDirectoryW(hprocess, dir)

public actual fun SymSetOptions(symoptions: UInt): UInt =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymSetOptions(symoptions.toInt()).toUInt()

public actual fun SymSetParentWindow(hwnd: HWND): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymSetParentWindow(hwnd)

public actual fun SymSetScopeFromAddr(hprocess: HANDLE, address: ULong): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymSetScopeFromAddr(hprocess, address.toLong())

public actual fun SymSetScopeFromIndex(hprocess: HANDLE, baseofdll: ULong, index: UInt): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymSetScopeFromIndex(hprocess, baseofdll.toLong(), index.toInt())

public actual fun SymSetScopeFromInlineContext(hprocess: HANDLE, address: ULong, inlinecontext: UInt): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymSetScopeFromInlineContext(hprocess, address.toLong(), inlinecontext.toInt())

public actual fun SymSetSearchPath(hprocess: HANDLE, searchpatha: PCSTR): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymSetSearchPath(hprocess, searchpatha)

public actual fun SymSetSearchPathW(hprocess: HANDLE, searchpatha: PCWSTR): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymSetSearchPathW(hprocess, searchpatha)

public actual fun SymSrvDeltaName(hprocess: HANDLE, sympath: PCSTR, type: PCSTR, file1: PCSTR, file2: PCSTR): PCSTR =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymSrvDeltaName(hprocess, sympath, type, file1, file2)

public actual fun SymSrvDeltaNameW(hprocess: HANDLE, sympath: PCWSTR, type: PCWSTR, file1: PCWSTR, file2: PCWSTR): PCWSTR =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymSrvDeltaNameW(hprocess, sympath, type, file1, file2)

public actual fun SymSrvGetFileIndexInfo(file: PCSTR, info: Long, flags: UInt): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymSrvGetFileIndexInfo(file, info, flags.toInt())

public actual fun SymSrvGetFileIndexInfoW(file: PCWSTR, info: Long, flags: UInt): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymSrvGetFileIndexInfoW(file, info, flags.toInt())

public actual fun SymSrvGetFileIndexString(hprocess: HANDLE, srvpath: PCSTR, file: PCSTR, index: PSTR, size: ULong, flags: UInt): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymSrvGetFileIndexString(hprocess, srvpath, file, index, size.toLong(), flags.toInt())

public actual fun SymSrvGetFileIndexStringW(hprocess: HANDLE, srvpath: PCWSTR, file: PCWSTR, index: PWSTR, size: ULong, flags: UInt): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymSrvGetFileIndexStringW(hprocess, srvpath, file, index, size.toLong(), flags.toInt())

public actual fun SymSrvGetFileIndexes(file: PCSTR, id: Long, val1: Long, val2: Long, flags: UInt): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymSrvGetFileIndexes(file, id, val1, val2, flags.toInt())

public actual fun SymSrvGetFileIndexesW(file: PCWSTR, id: Long, val1: Long, val2: Long, flags: UInt): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymSrvGetFileIndexesW(file, id, val1, val2, flags.toInt())

public actual fun SymSrvGetSupplement(hprocess: HANDLE, sympath: PCSTR, node: PCSTR, file: PCSTR): PCSTR =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymSrvGetSupplement(hprocess, sympath, node, file)

public actual fun SymSrvGetSupplementW(hprocess: HANDLE, sympath: PCWSTR, node: PCWSTR, file: PCWSTR): PCWSTR =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymSrvGetSupplementW(hprocess, sympath, node, file)

public actual fun SymSrvIsStore(hprocess: HANDLE, path: PCSTR): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymSrvIsStore(hprocess, path)

public actual fun SymSrvIsStoreW(hprocess: HANDLE, path: PCWSTR): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymSrvIsStoreW(hprocess, path)

public actual fun SymSrvStoreFile(hprocess: HANDLE, srvpath: PCSTR, file: PCSTR, flags: SYM_SRV_STORE_FILE_FLAGS): PCSTR =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymSrvStoreFile(hprocess, srvpath, file, flags.toInt())

public actual fun SymSrvStoreFileW(hprocess: HANDLE, srvpath: PCWSTR, file: PCWSTR, flags: SYM_SRV_STORE_FILE_FLAGS): PCWSTR =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymSrvStoreFileW(hprocess, srvpath, file, flags.toInt())

public actual fun SymSrvStoreSupplement(hprocess: HANDLE, srvpath: PCSTR, node: PCSTR, file: PCSTR, flags: UInt): PCSTR =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymSrvStoreSupplement(hprocess, srvpath, node, file, flags.toInt())

public actual fun SymSrvStoreSupplementW(hprocess: HANDLE, sympath: PCWSTR, node: PCWSTR, file: PCWSTR, flags: UInt): PCWSTR =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymSrvStoreSupplementW(hprocess, sympath, node, file, flags.toInt())

public actual fun SymUnDName64(sym: Long, undecname: PSTR, undecnamelength: UInt): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymUnDName64(sym, undecname, undecnamelength.toInt())

public actual fun SymUnloadModule64(hprocess: HANDLE, baseofdll: ULong): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_SymUnloadModule64(hprocess, baseofdll.toLong())

public actual fun TerminateProcessOnMemoryExhaustion(failedallocationsize: ULong) {
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_TerminateProcessOnMemoryExhaustion(failedallocationsize.toLong())
}

public actual fun TouchFileTimes(filehandle: HANDLE, psystemtime: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_TouchFileTimes(filehandle, psystemtime)

public actual fun UnDecorateSymbolName(name: PCSTR, outputstring: PSTR, maxstringlength: UInt, flags: UInt): UInt =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_UnDecorateSymbolName(name, outputstring, maxstringlength.toInt(), flags.toInt()).toUInt()

public actual fun UnDecorateSymbolNameW(name: PCWSTR, outputstring: PWSTR, maxstringlength: UInt, flags: UInt): UInt =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_UnDecorateSymbolNameW(name, outputstring, maxstringlength.toInt(), flags.toInt()).toUInt()

public actual fun UnMapAndLoad(loadedimage: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_UnMapAndLoad(loadedimage)

public actual fun UnhandledExceptionFilter(exceptioninfo: Long): Int =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_UnhandledExceptionFilter(exceptioninfo)

public actual fun UpdateDebugInfoFile(imagefilename: PCSTR, symbolpath: PCSTR, debugfilepath: PSTR, ntheaders: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_UpdateDebugInfoFile(imagefilename, symbolpath, debugfilepath, ntheaders)

public actual fun UpdateDebugInfoFileEx(imagefilename: PCSTR, symbolpath: PCSTR, debugfilepath: PSTR, ntheaders: Long, oldchecksum: UInt): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_UpdateDebugInfoFileEx(imagefilename, symbolpath, debugfilepath, ntheaders, oldchecksum.toInt())

public actual fun WaitForDebugEvent(lpdebugevent: Long, dwmilliseconds: UInt): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_WaitForDebugEvent(lpdebugevent, dwmilliseconds.toInt())

public actual fun WaitForDebugEventEx(lpdebugevent: Long, dwmilliseconds: UInt): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_WaitForDebugEventEx(lpdebugevent, dwmilliseconds.toInt())

public actual fun Wow64GetThreadContext(hthread: HANDLE, lpcontext: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_Wow64GetThreadContext(hthread, lpcontext)

public actual fun Wow64GetThreadSelectorEntry(hthread: HANDLE, dwselector: UInt, lpselectorentry: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_Wow64GetThreadSelectorEntry(hthread, dwselector.toInt(), lpselectorentry)

public actual fun Wow64SetThreadContext(hthread: HANDLE, lpcontext: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_Wow64SetThreadContext(hthread, lpcontext)

public actual fun WriteProcessMemory(hprocess: HANDLE, lpbaseaddress: Long, lpbuffer: Long, nsize: ULong, lpnumberofbyteswritten: Long): BOOL =
    WindowsWin32SystemDiagnosticsDebugJniBridge.windowssys_windows_win32_system_diagnostics_debug_WriteProcessMemory(hprocess, lpbaseaddress, lpbuffer, nsize.toLong(), lpnumberofbyteswritten)
