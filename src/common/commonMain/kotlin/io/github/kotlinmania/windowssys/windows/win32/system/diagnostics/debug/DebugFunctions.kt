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

public expect fun AddVectoredContinueHandler(first: UInt, handler: PVECTORED_EXCEPTION_HANDLER): Long

public expect fun AddVectoredExceptionHandler(first: UInt, handler: PVECTORED_EXCEPTION_HANDLER): Long

public expect fun Beep(dwfreq: UInt, dwduration: UInt): BOOL

public expect fun BindImage(imagename: PCSTR, dllpath: PCSTR, symbolpath: PCSTR): BOOL

public expect fun BindImageEx(flags: UInt, imagename: PCSTR, dllpath: PCSTR, symbolpath: PCSTR, statusroutine: PIMAGEHLP_STATUS_ROUTINE): BOOL

public expect fun CheckRemoteDebuggerPresent(hprocess: HANDLE, pbdebuggerpresent: Long): BOOL

public expect fun CheckSumMappedFile(baseaddress: Long, filelength: UInt, headersum: Long, checksum: Long): Long

public expect fun CloseThreadWaitChainSession(wcthandle: Long)

public expect fun ContinueDebugEvent(dwprocessid: UInt, dwthreadid: UInt, dwcontinuestatus: NTSTATUS): BOOL

public expect fun CopyContext(destination: Long, contextflags: CONTEXT_FLAGS, source: Long): BOOL

public expect fun DbgHelpCreateUserDump(filename: PCSTR, callback: PDBGHELP_CREATE_USER_DUMP_CALLBACK, userdata: Long): BOOL

public expect fun DbgHelpCreateUserDumpW(filename: PCWSTR, callback: PDBGHELP_CREATE_USER_DUMP_CALLBACK, userdata: Long): BOOL

public expect fun DebugActiveProcess(dwprocessid: UInt): BOOL

public expect fun DebugActiveProcessStop(dwprocessid: UInt): BOOL

public expect fun DebugBreak()

public expect fun DebugBreakProcess(process: HANDLE): BOOL

public expect fun DebugSetProcessKillOnExit(killonexit: BOOL): BOOL

public expect fun DecodePointer(ptr: Long): Long

public expect fun DecodeRemotePointer(processhandle: HANDLE, ptr: Long, decodedptr: Long): HRESULT

public expect fun DecodeSystemPointer(ptr: Long): Long

public expect fun EncodePointer(ptr: Long): Long

public expect fun EncodeRemotePointer(processhandle: HANDLE, ptr: Long, encodedptr: Long): HRESULT

public expect fun EncodeSystemPointer(ptr: Long): Long

public expect fun EnumDirTree(hprocess: HANDLE, rootpath: PCSTR, inputpathname: PCSTR, outputpathbuffer: PSTR, cb: PENUMDIRTREE_CALLBACK, data: Long): BOOL

public expect fun EnumDirTreeW(hprocess: HANDLE, rootpath: PCWSTR, inputpathname: PCWSTR, outputpathbuffer: PWSTR, cb: PENUMDIRTREE_CALLBACKW, data: Long): BOOL

public expect fun EnumerateLoadedModules64(hprocess: HANDLE, enumloadedmodulescallback: PENUMLOADED_MODULES_CALLBACK64, usercontext: Long): BOOL

public expect fun EnumerateLoadedModulesEx(hprocess: HANDLE, enumloadedmodulescallback: PENUMLOADED_MODULES_CALLBACK64, usercontext: Long): BOOL

public expect fun EnumerateLoadedModulesExW(hprocess: HANDLE, enumloadedmodulescallback: PENUMLOADED_MODULES_CALLBACKW64, usercontext: Long): BOOL

public expect fun EnumerateLoadedModulesW64(hprocess: HANDLE, enumloadedmodulescallback: PENUMLOADED_MODULES_CALLBACKW64, usercontext: Long): BOOL

public expect fun FatalAppExitA(uaction: UInt, lpmessagetext: PCSTR)

public expect fun FatalAppExitW(uaction: UInt, lpmessagetext: PCWSTR)

public expect fun FatalExit(exitcode: Int): Nothing

public expect fun FindDebugInfoFile(filename: PCSTR, symbolpath: PCSTR, debugfilepath: PSTR): HANDLE

public expect fun FindDebugInfoFileEx(filename: PCSTR, symbolpath: PCSTR, debugfilepath: PSTR, callback: PFIND_DEBUG_FILE_CALLBACK, callerdata: Long): HANDLE

public expect fun FindDebugInfoFileExW(filename: PCWSTR, symbolpath: PCWSTR, debugfilepath: PWSTR, callback: PFIND_DEBUG_FILE_CALLBACKW, callerdata: Long): HANDLE

public expect fun FindExecutableImage(filename: PCSTR, symbolpath: PCSTR, imagefilepath: PSTR): HANDLE

public expect fun FindExecutableImageEx(filename: PCSTR, symbolpath: PCSTR, imagefilepath: PSTR, callback: PFIND_EXE_FILE_CALLBACK, callerdata: Long): HANDLE

public expect fun FindExecutableImageExW(filename: PCWSTR, symbolpath: PCWSTR, imagefilepath: PWSTR, callback: PFIND_EXE_FILE_CALLBACKW, callerdata: Long): HANDLE

public expect fun FindFileInPath(hprocess: HANDLE, searchpatha: PCSTR, filename: PCSTR, id: Long, two: UInt, three: UInt, flags: UInt, filepath: PSTR): BOOL

public expect fun FindFileInSearchPath(hprocess: HANDLE, searchpatha: PCSTR, filename: PCSTR, one: UInt, two: UInt, three: UInt, filepath: PSTR): BOOL

public expect fun FlushInstructionCache(hprocess: HANDLE, lpbaseaddress: Long, dwsize: ULong): BOOL

public expect fun FormatMessageA(dwflags: FORMAT_MESSAGE_OPTIONS, lpsource: Long, dwmessageid: UInt, dwlanguageid: UInt, lpbuffer: PSTR, nsize: UInt, arguments: Long): UInt

public expect fun FormatMessageW(dwflags: FORMAT_MESSAGE_OPTIONS, lpsource: Long, dwmessageid: UInt, dwlanguageid: UInt, lpbuffer: PWSTR, nsize: UInt, arguments: Long): UInt

public expect fun GetEnabledXStateFeatures(): ULong

public expect fun GetErrorMode(): UInt

public expect fun GetImageConfigInformation(loadedimage: Long, imageconfiginformation: Long): BOOL

public expect fun GetImageUnusedHeaderBytes(loadedimage: Long, sizeunusedheaderbytes: Long): UInt

public expect fun GetSymLoadError(): UInt

public expect fun GetThreadContext(hthread: HANDLE, lpcontext: Long): BOOL

public expect fun GetThreadErrorMode(): UInt

public expect fun GetThreadSelectorEntry(hthread: HANDLE, dwselector: UInt, lpselectorentry: Long): BOOL

public expect fun GetThreadWaitChain(wcthandle: Long, context: ULong, flags: WAIT_CHAIN_THREAD_OPTIONS, threadid: UInt, nodecount: Long, nodeinfoarray: Long, iscycle: Long): BOOL

public expect fun GetTimestampForLoadedLibrary(module: HMODULE): UInt

public expect fun GetXStateFeaturesMask(context: Long, featuremask: Long): BOOL

public expect fun ImageAddCertificate(filehandle: HANDLE, certificate: Long, index: Long): BOOL

public expect fun ImageDirectoryEntryToData(base: Long, mappedasimage: Boolean, directoryentry: IMAGE_DIRECTORY_ENTRY, size: Long): Long

public expect fun ImageDirectoryEntryToDataEx(base: Long, mappedasimage: Boolean, directoryentry: IMAGE_DIRECTORY_ENTRY, size: Long, foundheader: Long): Long

public expect fun ImageEnumerateCertificates(filehandle: HANDLE, typefilter: UShort, certificatecount: Long, indices: Long, indexcount: UInt): BOOL

public expect fun ImageGetCertificateData(filehandle: HANDLE, certificateindex: UInt, certificate: Long, requiredlength: Long): BOOL

public expect fun ImageGetCertificateHeader(filehandle: HANDLE, certificateindex: UInt, certificateheader: Long): BOOL

public expect fun ImageGetDigestStream(filehandle: HANDLE, digestlevel: UInt, digestfunction: DIGEST_FUNCTION, digesthandle: Long): BOOL

public expect fun ImageLoad(dllname: PCSTR, dllpath: PCSTR): Long

public expect fun ImageNtHeader(base: Long): Long

public expect fun ImageRemoveCertificate(filehandle: HANDLE, index: UInt): BOOL

public expect fun ImageRvaToSection(ntheaders: Long, base: Long, rva: UInt): Long

public expect fun ImageRvaToVa(ntheaders: Long, base: Long, rva: UInt, lastrvasection: Long): Long

public expect fun ImageUnload(loadedimage: Long): BOOL

public expect fun ImagehlpApiVersion(): Long

public expect fun ImagehlpApiVersionEx(appversion: Long): Long

public expect fun InitializeContext(buffer: Long, contextflags: CONTEXT_FLAGS, context: Long, contextlength: Long): BOOL

public expect fun InitializeContext2(buffer: Long, contextflags: CONTEXT_FLAGS, context: Long, contextlength: Long, xstatecompactionmask: ULong): BOOL

public expect fun IsDebuggerPresent(): BOOL

public expect fun LocateXStateFeature(context: Long, featureid: UInt, length: Long): Long

public expect fun MakeSureDirectoryPathExists(dirpath: PCSTR): BOOL

public expect fun MapAndLoad(imagename: PCSTR, dllpath: PCSTR, loadedimage: Long, dotdll: BOOL, readonly: BOOL): BOOL

public expect fun MapFileAndCheckSumA(filename: PCSTR, headersum: Long, checksum: Long): UInt

public expect fun MapFileAndCheckSumW(filename: PCWSTR, headersum: Long, checksum: Long): UInt

public expect fun MessageBeep(utype: MESSAGEBOX_STYLE): BOOL

public expect fun MiniDumpReadDumpStream(baseofdump: Long, streamnumber: UInt, dir: Long, streampointer: Long, streamsize: Long): BOOL

public expect fun MiniDumpWriteDump(hprocess: HANDLE, processid: UInt, hfile: HANDLE, dumptype: MINIDUMP_TYPE, exceptionparam: Long, userstreamparam: Long, callbackparam: Long): BOOL

public expect fun OpenThreadWaitChainSession(flags: OPEN_THREAD_WAIT_CHAIN_SESSION_FLAGS, callback: PWAITCHAINCALLBACK): Long

public expect fun OutputDebugStringA(lpoutputstring: PCSTR)

public expect fun OutputDebugStringW(lpoutputstring: PCWSTR)

public expect fun RaiseException(dwexceptioncode: UInt, dwexceptionflags: UInt, nnumberofarguments: UInt, lparguments: Long)

public expect fun RaiseFailFastException(pexceptionrecord: Long, pcontextrecord: Long, dwflags: UInt)

public expect fun RangeMapAddPeImageSections(rmaphandle: Long, imagename: PCWSTR, mappedimage: Long, mappingbytes: UInt, imagebase: ULong, usertag: ULong, mappingflags: UInt): BOOL

public expect fun RangeMapCreate(): Long

public expect fun RangeMapFree(rmaphandle: Long)

public expect fun RangeMapRead(rmaphandle: Long, offset: ULong, buffer: Long, requestbytes: UInt, flags: UInt, donebytes: Long): BOOL

public expect fun RangeMapRemove(rmaphandle: Long, usertag: ULong): BOOL

public expect fun RangeMapWrite(rmaphandle: Long, offset: ULong, buffer: Long, requestbytes: UInt, flags: UInt, donebytes: Long): BOOL

public expect fun ReBaseImage(currentimagename: PCSTR, symbolpath: PCSTR, frebase: BOOL, frebasesysfileok: BOOL, fgoingdown: BOOL, checkimagesize: UInt, oldimagesize: Long, oldimagebase: Long, newimagesize: Long, newimagebase: Long, timestamp: UInt): BOOL

public expect fun ReBaseImage64(currentimagename: PCSTR, symbolpath: PCSTR, frebase: BOOL, frebasesysfileok: BOOL, fgoingdown: BOOL, checkimagesize: UInt, oldimagesize: Long, oldimagebase: Long, newimagesize: Long, newimagebase: Long, timestamp: UInt): BOOL

public expect fun ReadProcessMemory(hprocess: HANDLE, lpbaseaddress: Long, lpbuffer: Long, nsize: ULong, lpnumberofbytesread: Long): BOOL

public expect fun RegisterWaitChainCOMCallback(callstatecallback: PCOGETCALLSTATE, activationstatecallback: PCOGETACTIVATIONSTATE)

public expect fun RemoveInvalidModuleList(hprocess: HANDLE)

public expect fun RemoveVectoredContinueHandler(handle: Long): UInt

public expect fun RemoveVectoredExceptionHandler(handle: Long): UInt

public expect fun ReportSymbolLoadSummary(hprocess: HANDLE, ploadmodule: PCWSTR, psymboldata: Long): BOOL

public expect fun RtlAddFunctionTable(functiontable: Long, entrycount: UInt, baseaddress: ULong): Boolean

public expect fun RtlAddGrowableFunctionTable(dynamictable: Long, functiontable: Long, entrycount: UInt, maximumentrycount: UInt, rangebase: ULong, rangeend: ULong): UInt

public expect fun RtlCaptureContext(contextrecord: Long)

public expect fun RtlCaptureContext2(contextrecord: Long)

public expect fun RtlCaptureStackBackTrace(framestoskip: UInt, framestocapture: UInt, backtrace: Long, backtracehash: Long): UShort

public expect fun RtlDeleteFunctionTable(functiontable: Long): Boolean

public expect fun RtlDeleteGrowableFunctionTable(dynamictable: Long)

public expect fun RtlGrowFunctionTable(dynamictable: Long, newentrycount: UInt)

public expect fun RtlInstallFunctionTableCallback(tableidentifier: ULong, baseaddress: ULong, length: UInt, callback: PGET_RUNTIME_FUNCTION_CALLBACK, context: Long, outofprocesscallbackdll: PCWSTR): Boolean

public expect fun RtlLookupFunctionEntry(controlpc: ULong, imagebase: Long, historytable: Long): Long

public expect fun RtlPcToFileHeader(pcvalue: Long, baseofimage: Long): Long

public expect fun RtlRaiseException(exceptionrecord: Long)

public expect fun RtlRestoreContext(contextrecord: Long, exceptionrecord: Long)

public expect fun RtlUnwind(targetframe: Long, targetip: Long, exceptionrecord: Long, returnvalue: Long)

public expect fun RtlUnwindEx(targetframe: Long, targetip: Long, exceptionrecord: Long, returnvalue: Long, contextrecord: Long, historytable: Long)

public expect fun RtlVirtualUnwind(handlertype: RTL_VIRTUAL_UNWIND_HANDLER_TYPE, imagebase: ULong, controlpc: ULong, functionentry: Long, contextrecord: Long, handlerdata: Long, establisherframe: Long, contextpointers: Long): EXCEPTION_ROUTINE

public expect fun SearchTreeForFile(rootpath: PCSTR, inputpathname: PCSTR, outputpathbuffer: PSTR): BOOL

public expect fun SearchTreeForFileW(rootpath: PCWSTR, inputpathname: PCWSTR, outputpathbuffer: PWSTR): BOOL

public expect fun SetCheckUserInterruptShared(lpstartaddress: LPCALL_BACK_USER_INTERRUPT_ROUTINE)

public expect fun SetErrorMode(umode: THREAD_ERROR_MODE): THREAD_ERROR_MODE

public expect fun SetImageConfigInformation(loadedimage: Long, imageconfiginformation: Long): BOOL

public expect fun SetSymLoadError(error: UInt)

public expect fun SetThreadContext(hthread: HANDLE, lpcontext: Long): BOOL

public expect fun SetThreadErrorMode(dwnewmode: THREAD_ERROR_MODE, lpoldmode: Long): BOOL

public expect fun SetUnhandledExceptionFilter(lptoplevelexceptionfilter: LPTOP_LEVEL_EXCEPTION_FILTER): LPTOP_LEVEL_EXCEPTION_FILTER

public expect fun SetXStateFeaturesMask(context: Long, featuremask: ULong): BOOL

public expect fun StackWalk2(machinetype: UInt, hprocess: HANDLE, hthread: HANDLE, stackframe: Long, contextrecord: Long, readmemoryroutine: PREAD_PROCESS_MEMORY_ROUTINE64, functiontableaccessroutine: PFUNCTION_TABLE_ACCESS_ROUTINE64, getmodulebaseroutine: PGET_MODULE_BASE_ROUTINE64, translateaddress: PTRANSLATE_ADDRESS_ROUTINE64, gettargetattributevalue: PGET_TARGET_ATTRIBUTE_VALUE64, flags: UInt): BOOL

public expect fun StackWalk64(machinetype: UInt, hprocess: HANDLE, hthread: HANDLE, stackframe: Long, contextrecord: Long, readmemoryroutine: PREAD_PROCESS_MEMORY_ROUTINE64, functiontableaccessroutine: PFUNCTION_TABLE_ACCESS_ROUTINE64, getmodulebaseroutine: PGET_MODULE_BASE_ROUTINE64, translateaddress: PTRANSLATE_ADDRESS_ROUTINE64): BOOL

public expect fun StackWalkEx(machinetype: UInt, hprocess: HANDLE, hthread: HANDLE, stackframe: Long, contextrecord: Long, readmemoryroutine: PREAD_PROCESS_MEMORY_ROUTINE64, functiontableaccessroutine: PFUNCTION_TABLE_ACCESS_ROUTINE64, getmodulebaseroutine: PGET_MODULE_BASE_ROUTINE64, translateaddress: PTRANSLATE_ADDRESS_ROUTINE64, flags: UInt): BOOL

public expect fun SymAddSourceStream(hprocess: HANDLE, base: ULong, streamfile: PCSTR, buffer: Long, size: ULong): BOOL

public expect fun SymAddSourceStreamA(hprocess: HANDLE, base: ULong, streamfile: PCSTR, buffer: Long, size: ULong): BOOL

public expect fun SymAddSourceStreamW(hprocess: HANDLE, base: ULong, filespec: PCWSTR, buffer: Long, size: ULong): BOOL

public expect fun SymAddSymbol(hprocess: HANDLE, baseofdll: ULong, name: PCSTR, address: ULong, size: UInt, flags: UInt): BOOL

public expect fun SymAddSymbolW(hprocess: HANDLE, baseofdll: ULong, name: PCWSTR, address: ULong, size: UInt, flags: UInt): BOOL

public expect fun SymAddrIncludeInlineTrace(hprocess: HANDLE, address: ULong): UInt

public expect fun SymCleanup(hprocess: HANDLE): BOOL

public expect fun SymCompareInlineTrace(hprocess: HANDLE, address1: ULong, inlinecontext1: UInt, retaddress1: ULong, address2: ULong, retaddress2: ULong): UInt

public expect fun SymDeleteSymbol(hprocess: HANDLE, baseofdll: ULong, name: PCSTR, address: ULong, flags: UInt): BOOL

public expect fun SymDeleteSymbolW(hprocess: HANDLE, baseofdll: ULong, name: PCWSTR, address: ULong, flags: UInt): BOOL

public expect fun SymEnumLines(hprocess: HANDLE, base: ULong, obj: PCSTR, file: PCSTR, enumlinescallback: PSYM_ENUMLINES_CALLBACK, usercontext: Long): BOOL

public expect fun SymEnumLinesW(hprocess: HANDLE, base: ULong, obj: PCWSTR, file: PCWSTR, enumlinescallback: PSYM_ENUMLINES_CALLBACKW, usercontext: Long): BOOL

public expect fun SymEnumProcesses(enumprocessescallback: PSYM_ENUMPROCESSES_CALLBACK, usercontext: Long): BOOL

public expect fun SymEnumSourceFileTokens(hprocess: HANDLE, base: ULong, callback: PENUMSOURCEFILETOKENSCALLBACK): BOOL

public expect fun SymEnumSourceFiles(hprocess: HANDLE, modbase: ULong, mask: PCSTR, cbsrcfiles: PSYM_ENUMSOURCEFILES_CALLBACK, usercontext: Long): BOOL

public expect fun SymEnumSourceFilesW(hprocess: HANDLE, modbase: ULong, mask: PCWSTR, cbsrcfiles: PSYM_ENUMSOURCEFILES_CALLBACKW, usercontext: Long): BOOL

public expect fun SymEnumSourceLines(hprocess: HANDLE, base: ULong, obj: PCSTR, file: PCSTR, line: UInt, flags: UInt, enumlinescallback: PSYM_ENUMLINES_CALLBACK, usercontext: Long): BOOL

public expect fun SymEnumSourceLinesW(hprocess: HANDLE, base: ULong, obj: PCWSTR, file: PCWSTR, line: UInt, flags: UInt, enumlinescallback: PSYM_ENUMLINES_CALLBACKW, usercontext: Long): BOOL

public expect fun SymEnumSym(hprocess: HANDLE, baseofdll: ULong, enumsymbolscallback: PSYM_ENUMERATESYMBOLS_CALLBACK, usercontext: Long): BOOL

public expect fun SymEnumSymbols(hprocess: HANDLE, baseofdll: ULong, mask: PCSTR, enumsymbolscallback: PSYM_ENUMERATESYMBOLS_CALLBACK, usercontext: Long): BOOL

public expect fun SymEnumSymbolsEx(hprocess: HANDLE, baseofdll: ULong, mask: PCSTR, enumsymbolscallback: PSYM_ENUMERATESYMBOLS_CALLBACK, usercontext: Long, options: UInt): BOOL

public expect fun SymEnumSymbolsExW(hprocess: HANDLE, baseofdll: ULong, mask: PCWSTR, enumsymbolscallback: PSYM_ENUMERATESYMBOLS_CALLBACKW, usercontext: Long, options: UInt): BOOL

public expect fun SymEnumSymbolsForAddr(hprocess: HANDLE, address: ULong, enumsymbolscallback: PSYM_ENUMERATESYMBOLS_CALLBACK, usercontext: Long): BOOL

public expect fun SymEnumSymbolsForAddrW(hprocess: HANDLE, address: ULong, enumsymbolscallback: PSYM_ENUMERATESYMBOLS_CALLBACKW, usercontext: Long): BOOL

public expect fun SymEnumSymbolsW(hprocess: HANDLE, baseofdll: ULong, mask: PCWSTR, enumsymbolscallback: PSYM_ENUMERATESYMBOLS_CALLBACKW, usercontext: Long): BOOL

public expect fun SymEnumTypes(hprocess: HANDLE, baseofdll: ULong, enumsymbolscallback: PSYM_ENUMERATESYMBOLS_CALLBACK, usercontext: Long): BOOL

public expect fun SymEnumTypesByName(hprocess: HANDLE, baseofdll: ULong, mask: PCSTR, enumsymbolscallback: PSYM_ENUMERATESYMBOLS_CALLBACK, usercontext: Long): BOOL

public expect fun SymEnumTypesByNameW(hprocess: HANDLE, baseofdll: ULong, mask: PCWSTR, enumsymbolscallback: PSYM_ENUMERATESYMBOLS_CALLBACKW, usercontext: Long): BOOL

public expect fun SymEnumTypesW(hprocess: HANDLE, baseofdll: ULong, enumsymbolscallback: PSYM_ENUMERATESYMBOLS_CALLBACKW, usercontext: Long): BOOL

public expect fun SymEnumerateModules64(hprocess: HANDLE, enummodulescallback: PSYM_ENUMMODULES_CALLBACK64, usercontext: Long): BOOL

public expect fun SymEnumerateModulesW64(hprocess: HANDLE, enummodulescallback: PSYM_ENUMMODULES_CALLBACKW64, usercontext: Long): BOOL

public expect fun SymEnumerateSymbols64(hprocess: HANDLE, baseofdll: ULong, enumsymbolscallback: PSYM_ENUMSYMBOLS_CALLBACK64, usercontext: Long): BOOL

public expect fun SymEnumerateSymbolsW64(hprocess: HANDLE, baseofdll: ULong, enumsymbolscallback: PSYM_ENUMSYMBOLS_CALLBACK64W, usercontext: Long): BOOL

public expect fun SymFindDebugInfoFile(hprocess: HANDLE, filename: PCSTR, debugfilepath: PSTR, callback: PFIND_DEBUG_FILE_CALLBACK, callerdata: Long): HANDLE

public expect fun SymFindDebugInfoFileW(hprocess: HANDLE, filename: PCWSTR, debugfilepath: PWSTR, callback: PFIND_DEBUG_FILE_CALLBACKW, callerdata: Long): HANDLE

public expect fun SymFindExecutableImage(hprocess: HANDLE, filename: PCSTR, imagefilepath: PSTR, callback: PFIND_EXE_FILE_CALLBACK, callerdata: Long): HANDLE

public expect fun SymFindExecutableImageW(hprocess: HANDLE, filename: PCWSTR, imagefilepath: PWSTR, callback: PFIND_EXE_FILE_CALLBACKW, callerdata: Long): HANDLE

public expect fun SymFindFileInPath(hprocess: HANDLE, searchpatha: PCSTR, filename: PCSTR, id: Long, two: UInt, three: UInt, flags: SYM_FIND_ID_OPTION, foundfile: PSTR, callback: PFINDFILEINPATHCALLBACK, context: Long): BOOL

public expect fun SymFindFileInPathW(hprocess: HANDLE, searchpatha: PCWSTR, filename: PCWSTR, id: Long, two: UInt, three: UInt, flags: SYM_FIND_ID_OPTION, foundfile: PWSTR, callback: PFINDFILEINPATHCALLBACKW, context: Long): BOOL

public expect fun SymFromAddr(hprocess: HANDLE, address: ULong, displacement: Long, symbol: Long): BOOL

public expect fun SymFromAddrW(hprocess: HANDLE, address: ULong, displacement: Long, symbol: Long): BOOL

public expect fun SymFromIndex(hprocess: HANDLE, baseofdll: ULong, index: UInt, symbol: Long): BOOL

public expect fun SymFromIndexW(hprocess: HANDLE, baseofdll: ULong, index: UInt, symbol: Long): BOOL

public expect fun SymFromInlineContext(hprocess: HANDLE, address: ULong, inlinecontext: UInt, displacement: Long, symbol: Long): BOOL

public expect fun SymFromInlineContextW(hprocess: HANDLE, address: ULong, inlinecontext: UInt, displacement: Long, symbol: Long): BOOL

public expect fun SymFromName(hprocess: HANDLE, name: PCSTR, symbol: Long): BOOL

public expect fun SymFromNameW(hprocess: HANDLE, name: PCWSTR, symbol: Long): BOOL

public expect fun SymFromToken(hprocess: HANDLE, base: ULong, token: UInt, symbol: Long): BOOL

public expect fun SymFromTokenW(hprocess: HANDLE, base: ULong, token: UInt, symbol: Long): BOOL

public expect fun SymFunctionTableAccess64(hprocess: HANDLE, addrbase: ULong): Long

public expect fun SymFunctionTableAccess64AccessRoutines(hprocess: HANDLE, addrbase: ULong, readmemoryroutine: PREAD_PROCESS_MEMORY_ROUTINE64, getmodulebaseroutine: PGET_MODULE_BASE_ROUTINE64): Long

public expect fun SymGetExtendedOption(option: IMAGEHLP_EXTENDED_OPTIONS): BOOL

public expect fun SymGetFileLineOffsets64(hprocess: HANDLE, modulename: PCSTR, filename: PCSTR, buffer: Long, bufferlines: UInt): UInt

public expect fun SymGetHomeDirectory(type: UInt, dir: PSTR, size: ULong): PSTR

public expect fun SymGetHomeDirectoryW(type: UInt, dir: PWSTR, size: ULong): PWSTR

public expect fun SymGetLineFromAddr64(hprocess: HANDLE, qwaddr: ULong, pdwdisplacement: Long, line64: Long): BOOL

public expect fun SymGetLineFromAddrW64(hprocess: HANDLE, dwaddr: ULong, pdwdisplacement: Long, line: Long): BOOL

public expect fun SymGetLineFromInlineContext(hprocess: HANDLE, qwaddr: ULong, inlinecontext: UInt, qwmodulebaseaddress: ULong, pdwdisplacement: Long, line64: Long): BOOL

public expect fun SymGetLineFromInlineContextW(hprocess: HANDLE, dwaddr: ULong, inlinecontext: UInt, qwmodulebaseaddress: ULong, pdwdisplacement: Long, line: Long): BOOL

public expect fun SymGetLineFromName64(hprocess: HANDLE, modulename: PCSTR, filename: PCSTR, dwlinenumber: UInt, pldisplacement: Long, line: Long): BOOL

public expect fun SymGetLineFromNameW64(hprocess: HANDLE, modulename: PCWSTR, filename: PCWSTR, dwlinenumber: UInt, pldisplacement: Long, line: Long): BOOL

public expect fun SymGetLineNext64(hprocess: HANDLE, line: Long): BOOL

public expect fun SymGetLineNextW64(hprocess: HANDLE, line: Long): BOOL

public expect fun SymGetLinePrev64(hprocess: HANDLE, line: Long): BOOL

public expect fun SymGetLinePrevW64(hprocess: HANDLE, line: Long): BOOL

public expect fun SymGetModuleBase64(hprocess: HANDLE, qwaddr: ULong): ULong

public expect fun SymGetModuleInfo64(hprocess: HANDLE, qwaddr: ULong, moduleinfo: Long): BOOL

public expect fun SymGetModuleInfoW64(hprocess: HANDLE, qwaddr: ULong, moduleinfo: Long): BOOL

public expect fun SymGetOmaps(hprocess: HANDLE, baseofdll: ULong, omapto: Long, comapto: Long, omapfrom: Long, comapfrom: Long): BOOL

public expect fun SymGetOptions(): UInt

public expect fun SymGetScope(hprocess: HANDLE, baseofdll: ULong, index: UInt, symbol: Long): BOOL

public expect fun SymGetScopeW(hprocess: HANDLE, baseofdll: ULong, index: UInt, symbol: Long): BOOL

public expect fun SymGetSearchPath(hprocess: HANDLE, searchpatha: PSTR, searchpathlength: UInt): BOOL

public expect fun SymGetSearchPathW(hprocess: HANDLE, searchpatha: PWSTR, searchpathlength: UInt): BOOL

public expect fun SymGetSourceFile(hprocess: HANDLE, base: ULong, params: PCSTR, filespec: PCSTR, filepath: PSTR, size: UInt): BOOL

public expect fun SymGetSourceFileChecksum(hprocess: HANDLE, base: ULong, filespec: PCSTR, pchecksumtype: Long, pchecksum: Long, checksumsize: UInt, pactualbyteswritten: Long): BOOL

public expect fun SymGetSourceFileChecksumW(hprocess: HANDLE, base: ULong, filespec: PCWSTR, pchecksumtype: Long, pchecksum: Long, checksumsize: UInt, pactualbyteswritten: Long): BOOL

public expect fun SymGetSourceFileFromToken(hprocess: HANDLE, token: Long, params: PCSTR, filepath: PSTR, size: UInt): BOOL

public expect fun SymGetSourceFileFromTokenByTokenName(hprocess: HANDLE, token: Long, tokenname: PCSTR, params: PCSTR, filepath: PSTR, size: UInt): BOOL

public expect fun SymGetSourceFileFromTokenByTokenNameW(hprocess: HANDLE, token: Long, tokenname: PCWSTR, params: PCWSTR, filepath: PWSTR, size: UInt): BOOL

public expect fun SymGetSourceFileFromTokenW(hprocess: HANDLE, token: Long, params: PCWSTR, filepath: PWSTR, size: UInt): BOOL

public expect fun SymGetSourceFileToken(hprocess: HANDLE, base: ULong, filespec: PCSTR, token: Long, size: Long): BOOL

public expect fun SymGetSourceFileTokenByTokenName(hprocess: HANDLE, base: ULong, filespec: PCSTR, tokenname: PCSTR, tokenparameters: PCSTR, token: Long, size: Long): BOOL

public expect fun SymGetSourceFileTokenByTokenNameW(hprocess: HANDLE, base: ULong, filespec: PCWSTR, tokenname: PCWSTR, tokenparameters: PCWSTR, token: Long, size: Long): BOOL

public expect fun SymGetSourceFileTokenW(hprocess: HANDLE, base: ULong, filespec: PCWSTR, token: Long, size: Long): BOOL

public expect fun SymGetSourceFileW(hprocess: HANDLE, base: ULong, params: PCWSTR, filespec: PCWSTR, filepath: PWSTR, size: UInt): BOOL

public expect fun SymGetSourceVarFromToken(hprocess: HANDLE, token: Long, params: PCSTR, varname: PCSTR, value: PSTR, size: UInt): BOOL

public expect fun SymGetSourceVarFromTokenW(hprocess: HANDLE, token: Long, params: PCWSTR, varname: PCWSTR, value: PWSTR, size: UInt): BOOL

public expect fun SymGetSymFromAddr64(hprocess: HANDLE, qwaddr: ULong, pdwdisplacement: Long, symbol: Long): BOOL

public expect fun SymGetSymFromName64(hprocess: HANDLE, name: PCSTR, symbol: Long): BOOL

public expect fun SymGetSymNext64(hprocess: HANDLE, symbol: Long): BOOL

public expect fun SymGetSymPrev64(hprocess: HANDLE, symbol: Long): BOOL

public expect fun SymGetSymbolFile(hprocess: HANDLE, sympath: PCSTR, imagefile: PCSTR, type: UInt, symbolfile: PSTR, csymbolfile: ULong, dbgfile: PSTR, cdbgfile: ULong): BOOL

public expect fun SymGetSymbolFileW(hprocess: HANDLE, sympath: PCWSTR, imagefile: PCWSTR, type: UInt, symbolfile: PWSTR, csymbolfile: ULong, dbgfile: PWSTR, cdbgfile: ULong): BOOL

public expect fun SymGetTypeFromName(hprocess: HANDLE, baseofdll: ULong, name: PCSTR, symbol: Long): BOOL

public expect fun SymGetTypeFromNameW(hprocess: HANDLE, baseofdll: ULong, name: PCWSTR, symbol: Long): BOOL

public expect fun SymGetTypeInfo(hprocess: HANDLE, modbase: ULong, typeid: UInt, gettype: IMAGEHLP_SYMBOL_TYPE_INFO, pinfo: Long): BOOL

public expect fun SymGetTypeInfoEx(hprocess: HANDLE, modbase: ULong, params: Long): BOOL

public expect fun SymGetUnwindInfo(hprocess: HANDLE, address: ULong, buffer: Long, size: Long): BOOL

public expect fun SymInitialize(hprocess: HANDLE, usersearchpath: PCSTR, finvadeprocess: BOOL): BOOL

public expect fun SymInitializeW(hprocess: HANDLE, usersearchpath: PCWSTR, finvadeprocess: BOOL): BOOL

public expect fun SymLoadModule64(hprocess: HANDLE, hfile: HANDLE, imagename: PCSTR, modulename: PCSTR, baseofdll: ULong, sizeofdll: UInt): ULong

public expect fun SymLoadModuleEx(hprocess: HANDLE, hfile: HANDLE, imagename: PCSTR, modulename: PCSTR, baseofdll: ULong, dllsize: UInt, data: Long, flags: SYM_LOAD_FLAGS): ULong

public expect fun SymLoadModuleExW(hprocess: HANDLE, hfile: HANDLE, imagename: PCWSTR, modulename: PCWSTR, baseofdll: ULong, dllsize: UInt, data: Long, flags: SYM_LOAD_FLAGS): ULong

public expect fun SymMatchFileName(filename: PCSTR, match: PCSTR, filenamestop: Long, matchstop: Long): BOOL

public expect fun SymMatchFileNameW(filename: PCWSTR, match: PCWSTR, filenamestop: Long, matchstop: Long): BOOL

public expect fun SymMatchString(string: PCSTR, expression: PCSTR, fcase: BOOL): BOOL

public expect fun SymMatchStringA(string: PCSTR, expression: PCSTR, fcase: BOOL): BOOL

public expect fun SymMatchStringW(string: PCWSTR, expression: PCWSTR, fcase: BOOL): BOOL

public expect fun SymNext(hprocess: HANDLE, si: Long): BOOL

public expect fun SymNextW(hprocess: HANDLE, siw: Long): BOOL

public expect fun SymPrev(hprocess: HANDLE, si: Long): BOOL

public expect fun SymPrevW(hprocess: HANDLE, siw: Long): BOOL

public expect fun SymQueryInlineTrace(hprocess: HANDLE, startaddress: ULong, startcontext: UInt, startretaddress: ULong, curaddress: ULong, curcontext: Long, curframeindex: Long): BOOL

public expect fun SymRefreshModuleList(hprocess: HANDLE): BOOL

public expect fun SymRegisterCallback64(hprocess: HANDLE, callbackfunction: PSYMBOL_REGISTERED_CALLBACK64, usercontext: ULong): BOOL

public expect fun SymRegisterCallbackW64(hprocess: HANDLE, callbackfunction: PSYMBOL_REGISTERED_CALLBACK64, usercontext: ULong): BOOL

public expect fun SymRegisterFunctionEntryCallback64(hprocess: HANDLE, callbackfunction: PSYMBOL_FUNCENTRY_CALLBACK64, usercontext: ULong): BOOL

public expect fun SymSearch(hprocess: HANDLE, baseofdll: ULong, index: UInt, symtag: UInt, mask: PCSTR, address: ULong, enumsymbolscallback: PSYM_ENUMERATESYMBOLS_CALLBACK, usercontext: Long, options: UInt): BOOL

public expect fun SymSearchW(hprocess: HANDLE, baseofdll: ULong, index: UInt, symtag: UInt, mask: PCWSTR, address: ULong, enumsymbolscallback: PSYM_ENUMERATESYMBOLS_CALLBACKW, usercontext: Long, options: UInt): BOOL

public expect fun SymSetContext(hprocess: HANDLE, stackframe: Long, context: Long): BOOL

public expect fun SymSetExtendedOption(option: IMAGEHLP_EXTENDED_OPTIONS, value: BOOL): BOOL

public expect fun SymSetHomeDirectory(hprocess: HANDLE, dir: PCSTR): PSTR

public expect fun SymSetHomeDirectoryW(hprocess: HANDLE, dir: PCWSTR): PWSTR

public expect fun SymSetOptions(symoptions: UInt): UInt

public expect fun SymSetParentWindow(hwnd: HWND): BOOL

public expect fun SymSetScopeFromAddr(hprocess: HANDLE, address: ULong): BOOL

public expect fun SymSetScopeFromIndex(hprocess: HANDLE, baseofdll: ULong, index: UInt): BOOL

public expect fun SymSetScopeFromInlineContext(hprocess: HANDLE, address: ULong, inlinecontext: UInt): BOOL

public expect fun SymSetSearchPath(hprocess: HANDLE, searchpatha: PCSTR): BOOL

public expect fun SymSetSearchPathW(hprocess: HANDLE, searchpatha: PCWSTR): BOOL

public expect fun SymSrvDeltaName(hprocess: HANDLE, sympath: PCSTR, type: PCSTR, file1: PCSTR, file2: PCSTR): PCSTR

public expect fun SymSrvDeltaNameW(hprocess: HANDLE, sympath: PCWSTR, type: PCWSTR, file1: PCWSTR, file2: PCWSTR): PCWSTR

public expect fun SymSrvGetFileIndexInfo(file: PCSTR, info: Long, flags: UInt): BOOL

public expect fun SymSrvGetFileIndexInfoW(file: PCWSTR, info: Long, flags: UInt): BOOL

public expect fun SymSrvGetFileIndexString(hprocess: HANDLE, srvpath: PCSTR, file: PCSTR, index: PSTR, size: ULong, flags: UInt): BOOL

public expect fun SymSrvGetFileIndexStringW(hprocess: HANDLE, srvpath: PCWSTR, file: PCWSTR, index: PWSTR, size: ULong, flags: UInt): BOOL

public expect fun SymSrvGetFileIndexes(file: PCSTR, id: Long, val1: Long, val2: Long, flags: UInt): BOOL

public expect fun SymSrvGetFileIndexesW(file: PCWSTR, id: Long, val1: Long, val2: Long, flags: UInt): BOOL

public expect fun SymSrvGetSupplement(hprocess: HANDLE, sympath: PCSTR, node: PCSTR, file: PCSTR): PCSTR

public expect fun SymSrvGetSupplementW(hprocess: HANDLE, sympath: PCWSTR, node: PCWSTR, file: PCWSTR): PCWSTR

public expect fun SymSrvIsStore(hprocess: HANDLE, path: PCSTR): BOOL

public expect fun SymSrvIsStoreW(hprocess: HANDLE, path: PCWSTR): BOOL

public expect fun SymSrvStoreFile(hprocess: HANDLE, srvpath: PCSTR, file: PCSTR, flags: SYM_SRV_STORE_FILE_FLAGS): PCSTR

public expect fun SymSrvStoreFileW(hprocess: HANDLE, srvpath: PCWSTR, file: PCWSTR, flags: SYM_SRV_STORE_FILE_FLAGS): PCWSTR

public expect fun SymSrvStoreSupplement(hprocess: HANDLE, srvpath: PCSTR, node: PCSTR, file: PCSTR, flags: UInt): PCSTR

public expect fun SymSrvStoreSupplementW(hprocess: HANDLE, sympath: PCWSTR, node: PCWSTR, file: PCWSTR, flags: UInt): PCWSTR

public expect fun SymUnDName64(sym: Long, undecname: PSTR, undecnamelength: UInt): BOOL

public expect fun SymUnloadModule64(hprocess: HANDLE, baseofdll: ULong): BOOL

public expect fun TerminateProcessOnMemoryExhaustion(failedallocationsize: ULong)

public expect fun TouchFileTimes(filehandle: HANDLE, psystemtime: Long): BOOL

public expect fun UnDecorateSymbolName(name: PCSTR, outputstring: PSTR, maxstringlength: UInt, flags: UInt): UInt

public expect fun UnDecorateSymbolNameW(name: PCWSTR, outputstring: PWSTR, maxstringlength: UInt, flags: UInt): UInt

public expect fun UnMapAndLoad(loadedimage: Long): BOOL

public expect fun UnhandledExceptionFilter(exceptioninfo: Long): Int

public expect fun UpdateDebugInfoFile(imagefilename: PCSTR, symbolpath: PCSTR, debugfilepath: PSTR, ntheaders: Long): BOOL

public expect fun UpdateDebugInfoFileEx(imagefilename: PCSTR, symbolpath: PCSTR, debugfilepath: PSTR, ntheaders: Long, oldchecksum: UInt): BOOL

public expect fun WaitForDebugEvent(lpdebugevent: Long, dwmilliseconds: UInt): BOOL

public expect fun WaitForDebugEventEx(lpdebugevent: Long, dwmilliseconds: UInt): BOOL

public expect fun Wow64GetThreadContext(hthread: HANDLE, lpcontext: Long): BOOL

public expect fun Wow64GetThreadSelectorEntry(hthread: HANDLE, dwselector: UInt, lpselectorentry: Long): BOOL

public expect fun Wow64SetThreadContext(hthread: HANDLE, lpcontext: Long): BOOL

public expect fun WriteProcessMemory(hprocess: HANDLE, lpbaseaddress: Long, lpbuffer: Long, nsize: ULong, lpnumberofbyteswritten: Long): BOOL
