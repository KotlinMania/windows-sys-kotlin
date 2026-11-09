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

public actual fun AddVectoredContinueHandler(first: UInt, handler: PVECTORED_EXCEPTION_HANDLER): Long =
    0L

public actual fun AddVectoredExceptionHandler(first: UInt, handler: PVECTORED_EXCEPTION_HANDLER): Long =
    0L

public actual fun Beep(dwfreq: UInt, dwduration: UInt): BOOL =
    0

public actual fun BindImage(imagename: PCSTR, dllpath: PCSTR, symbolpath: PCSTR): BOOL =
    0

public actual fun BindImageEx(flags: UInt, imagename: PCSTR, dllpath: PCSTR, symbolpath: PCSTR, statusroutine: PIMAGEHLP_STATUS_ROUTINE): BOOL =
    0

public actual fun CheckRemoteDebuggerPresent(hprocess: HANDLE, pbdebuggerpresent: Long): BOOL =
    0

public actual fun CheckSumMappedFile(baseaddress: Long, filelength: UInt, headersum: Long, checksum: Long): Long =
    0L

public actual fun CloseThreadWaitChainSession(wcthandle: Long) {
}

public actual fun ContinueDebugEvent(dwprocessid: UInt, dwthreadid: UInt, dwcontinuestatus: NTSTATUS): BOOL =
    0

public actual fun CopyContext(destination: Long, contextflags: CONTEXT_FLAGS, source: Long): BOOL =
    0

public actual fun DbgHelpCreateUserDump(filename: PCSTR, callback: PDBGHELP_CREATE_USER_DUMP_CALLBACK, userdata: Long): BOOL =
    0

public actual fun DbgHelpCreateUserDumpW(filename: PCWSTR, callback: PDBGHELP_CREATE_USER_DUMP_CALLBACK, userdata: Long): BOOL =
    0

public actual fun DebugActiveProcess(dwprocessid: UInt): BOOL =
    0

public actual fun DebugActiveProcessStop(dwprocessid: UInt): BOOL =
    0

public actual fun DebugBreak() {
}

public actual fun DebugBreakProcess(process: HANDLE): BOOL =
    0

public actual fun DebugSetProcessKillOnExit(killonexit: BOOL): BOOL =
    0

public actual fun DecodePointer(ptr: Long): Long =
    0L

public actual fun DecodeRemotePointer(processhandle: HANDLE, ptr: Long, decodedptr: Long): HRESULT =
    0

public actual fun DecodeSystemPointer(ptr: Long): Long =
    0L

public actual fun EncodePointer(ptr: Long): Long =
    0L

public actual fun EncodeRemotePointer(processhandle: HANDLE, ptr: Long, encodedptr: Long): HRESULT =
    0

public actual fun EncodeSystemPointer(ptr: Long): Long =
    0L

public actual fun EnumDirTree(hprocess: HANDLE, rootpath: PCSTR, inputpathname: PCSTR, outputpathbuffer: PSTR, cb: PENUMDIRTREE_CALLBACK, data: Long): BOOL =
    0

public actual fun EnumDirTreeW(hprocess: HANDLE, rootpath: PCWSTR, inputpathname: PCWSTR, outputpathbuffer: PWSTR, cb: PENUMDIRTREE_CALLBACKW, data: Long): BOOL =
    0

public actual fun EnumerateLoadedModules64(hprocess: HANDLE, enumloadedmodulescallback: PENUMLOADED_MODULES_CALLBACK64, usercontext: Long): BOOL =
    0

public actual fun EnumerateLoadedModulesEx(hprocess: HANDLE, enumloadedmodulescallback: PENUMLOADED_MODULES_CALLBACK64, usercontext: Long): BOOL =
    0

public actual fun EnumerateLoadedModulesExW(hprocess: HANDLE, enumloadedmodulescallback: PENUMLOADED_MODULES_CALLBACKW64, usercontext: Long): BOOL =
    0

public actual fun EnumerateLoadedModulesW64(hprocess: HANDLE, enumloadedmodulescallback: PENUMLOADED_MODULES_CALLBACKW64, usercontext: Long): BOOL =
    0

public actual fun FatalAppExitA(uaction: UInt, lpmessagetext: PCSTR) {
}

public actual fun FatalAppExitW(uaction: UInt, lpmessagetext: PCWSTR) {
}

public actual fun FatalExit(exitcode: Int): Nothing =
    error("Unreachable noreturn C function FatalExit")

public actual fun FindDebugInfoFile(filename: PCSTR, symbolpath: PCSTR, debugfilepath: PSTR): HANDLE =
    0L

public actual fun FindDebugInfoFileEx(filename: PCSTR, symbolpath: PCSTR, debugfilepath: PSTR, callback: PFIND_DEBUG_FILE_CALLBACK, callerdata: Long): HANDLE =
    0L

public actual fun FindDebugInfoFileExW(filename: PCWSTR, symbolpath: PCWSTR, debugfilepath: PWSTR, callback: PFIND_DEBUG_FILE_CALLBACKW, callerdata: Long): HANDLE =
    0L

public actual fun FindExecutableImage(filename: PCSTR, symbolpath: PCSTR, imagefilepath: PSTR): HANDLE =
    0L

public actual fun FindExecutableImageEx(filename: PCSTR, symbolpath: PCSTR, imagefilepath: PSTR, callback: PFIND_EXE_FILE_CALLBACK, callerdata: Long): HANDLE =
    0L

public actual fun FindExecutableImageExW(filename: PCWSTR, symbolpath: PCWSTR, imagefilepath: PWSTR, callback: PFIND_EXE_FILE_CALLBACKW, callerdata: Long): HANDLE =
    0L

public actual fun FindFileInPath(hprocess: HANDLE, searchpatha: PCSTR, filename: PCSTR, id: Long, two: UInt, three: UInt, flags: UInt, filepath: PSTR): BOOL =
    0

public actual fun FindFileInSearchPath(hprocess: HANDLE, searchpatha: PCSTR, filename: PCSTR, one: UInt, two: UInt, three: UInt, filepath: PSTR): BOOL =
    0

public actual fun FlushInstructionCache(hprocess: HANDLE, lpbaseaddress: Long, dwsize: ULong): BOOL =
    0

public actual fun FormatMessageA(dwflags: FORMAT_MESSAGE_OPTIONS, lpsource: Long, dwmessageid: UInt, dwlanguageid: UInt, lpbuffer: PSTR, nsize: UInt, arguments: Long): UInt =
    0u

public actual fun FormatMessageW(dwflags: FORMAT_MESSAGE_OPTIONS, lpsource: Long, dwmessageid: UInt, dwlanguageid: UInt, lpbuffer: PWSTR, nsize: UInt, arguments: Long): UInt =
    0u

public actual fun GetEnabledXStateFeatures(): ULong =
    0uL

public actual fun GetErrorMode(): UInt =
    0u

public actual fun GetImageConfigInformation(loadedimage: Long, imageconfiginformation: Long): BOOL =
    0

public actual fun GetImageUnusedHeaderBytes(loadedimage: Long, sizeunusedheaderbytes: Long): UInt =
    0u

public actual fun GetSymLoadError(): UInt =
    0u

public actual fun GetThreadContext(hthread: HANDLE, lpcontext: Long): BOOL =
    0

public actual fun GetThreadErrorMode(): UInt =
    0u

public actual fun GetThreadSelectorEntry(hthread: HANDLE, dwselector: UInt, lpselectorentry: Long): BOOL =
    0

public actual fun GetThreadWaitChain(wcthandle: Long, context: ULong, flags: WAIT_CHAIN_THREAD_OPTIONS, threadid: UInt, nodecount: Long, nodeinfoarray: Long, iscycle: Long): BOOL =
    0

public actual fun GetTimestampForLoadedLibrary(module: HMODULE): UInt =
    0u

public actual fun GetXStateFeaturesMask(context: Long, featuremask: Long): BOOL =
    0

public actual fun ImageAddCertificate(filehandle: HANDLE, certificate: Long, index: Long): BOOL =
    0

public actual fun ImageDirectoryEntryToData(base: Long, mappedasimage: Boolean, directoryentry: IMAGE_DIRECTORY_ENTRY, size: Long): Long =
    0L

public actual fun ImageDirectoryEntryToDataEx(base: Long, mappedasimage: Boolean, directoryentry: IMAGE_DIRECTORY_ENTRY, size: Long, foundheader: Long): Long =
    0L

public actual fun ImageEnumerateCertificates(filehandle: HANDLE, typefilter: UShort, certificatecount: Long, indices: Long, indexcount: UInt): BOOL =
    0

public actual fun ImageGetCertificateData(filehandle: HANDLE, certificateindex: UInt, certificate: Long, requiredlength: Long): BOOL =
    0

public actual fun ImageGetCertificateHeader(filehandle: HANDLE, certificateindex: UInt, certificateheader: Long): BOOL =
    0

public actual fun ImageGetDigestStream(filehandle: HANDLE, digestlevel: UInt, digestfunction: DIGEST_FUNCTION, digesthandle: Long): BOOL =
    0

public actual fun ImageLoad(dllname: PCSTR, dllpath: PCSTR): Long =
    0L

public actual fun ImageNtHeader(base: Long): Long =
    0L

public actual fun ImageRemoveCertificate(filehandle: HANDLE, index: UInt): BOOL =
    0

public actual fun ImageRvaToSection(ntheaders: Long, base: Long, rva: UInt): Long =
    0L

public actual fun ImageRvaToVa(ntheaders: Long, base: Long, rva: UInt, lastrvasection: Long): Long =
    0L

public actual fun ImageUnload(loadedimage: Long): BOOL =
    0

public actual fun ImagehlpApiVersion(): Long =
    0L

public actual fun ImagehlpApiVersionEx(appversion: Long): Long =
    0L

public actual fun InitializeContext(buffer: Long, contextflags: CONTEXT_FLAGS, context: Long, contextlength: Long): BOOL =
    0

public actual fun InitializeContext2(buffer: Long, contextflags: CONTEXT_FLAGS, context: Long, contextlength: Long, xstatecompactionmask: ULong): BOOL =
    0

public actual fun IsDebuggerPresent(): BOOL =
    0

public actual fun LocateXStateFeature(context: Long, featureid: UInt, length: Long): Long =
    0L

public actual fun MakeSureDirectoryPathExists(dirpath: PCSTR): BOOL =
    0

public actual fun MapAndLoad(imagename: PCSTR, dllpath: PCSTR, loadedimage: Long, dotdll: BOOL, readonly: BOOL): BOOL =
    0

public actual fun MapFileAndCheckSumA(filename: PCSTR, headersum: Long, checksum: Long): UInt =
    0u

public actual fun MapFileAndCheckSumW(filename: PCWSTR, headersum: Long, checksum: Long): UInt =
    0u

public actual fun MessageBeep(utype: MESSAGEBOX_STYLE): BOOL =
    0

public actual fun MiniDumpReadDumpStream(baseofdump: Long, streamnumber: UInt, dir: Long, streampointer: Long, streamsize: Long): BOOL =
    0

public actual fun MiniDumpWriteDump(hprocess: HANDLE, processid: UInt, hfile: HANDLE, dumptype: MINIDUMP_TYPE, exceptionparam: Long, userstreamparam: Long, callbackparam: Long): BOOL =
    0

public actual fun OpenThreadWaitChainSession(flags: OPEN_THREAD_WAIT_CHAIN_SESSION_FLAGS, callback: PWAITCHAINCALLBACK): Long =
    0L

public actual fun OutputDebugStringA(lpoutputstring: PCSTR) {
}

public actual fun OutputDebugStringW(lpoutputstring: PCWSTR) {
}

public actual fun RaiseException(dwexceptioncode: UInt, dwexceptionflags: UInt, nnumberofarguments: UInt, lparguments: Long) {
}

public actual fun RaiseFailFastException(pexceptionrecord: Long, pcontextrecord: Long, dwflags: UInt) {
}

public actual fun RangeMapAddPeImageSections(rmaphandle: Long, imagename: PCWSTR, mappedimage: Long, mappingbytes: UInt, imagebase: ULong, usertag: ULong, mappingflags: UInt): BOOL =
    0

public actual fun RangeMapCreate(): Long =
    0L

public actual fun RangeMapFree(rmaphandle: Long) {
}

public actual fun RangeMapRead(rmaphandle: Long, offset: ULong, buffer: Long, requestbytes: UInt, flags: UInt, donebytes: Long): BOOL =
    0

public actual fun RangeMapRemove(rmaphandle: Long, usertag: ULong): BOOL =
    0

public actual fun RangeMapWrite(rmaphandle: Long, offset: ULong, buffer: Long, requestbytes: UInt, flags: UInt, donebytes: Long): BOOL =
    0

public actual fun ReBaseImage(currentimagename: PCSTR, symbolpath: PCSTR, frebase: BOOL, frebasesysfileok: BOOL, fgoingdown: BOOL, checkimagesize: UInt, oldimagesize: Long, oldimagebase: Long, newimagesize: Long, newimagebase: Long, timestamp: UInt): BOOL =
    0

public actual fun ReBaseImage64(currentimagename: PCSTR, symbolpath: PCSTR, frebase: BOOL, frebasesysfileok: BOOL, fgoingdown: BOOL, checkimagesize: UInt, oldimagesize: Long, oldimagebase: Long, newimagesize: Long, newimagebase: Long, timestamp: UInt): BOOL =
    0

public actual fun ReadProcessMemory(hprocess: HANDLE, lpbaseaddress: Long, lpbuffer: Long, nsize: ULong, lpnumberofbytesread: Long): BOOL =
    0

public actual fun RegisterWaitChainCOMCallback(callstatecallback: PCOGETCALLSTATE, activationstatecallback: PCOGETACTIVATIONSTATE) {
}

public actual fun RemoveInvalidModuleList(hprocess: HANDLE) {
}

public actual fun RemoveVectoredContinueHandler(handle: Long): UInt =
    0u

public actual fun RemoveVectoredExceptionHandler(handle: Long): UInt =
    0u

public actual fun ReportSymbolLoadSummary(hprocess: HANDLE, ploadmodule: PCWSTR, psymboldata: Long): BOOL =
    0

public actual fun RtlAddFunctionTable(functiontable: Long, entrycount: UInt, baseaddress: ULong): Boolean =
    false

public actual fun RtlAddGrowableFunctionTable(dynamictable: Long, functiontable: Long, entrycount: UInt, maximumentrycount: UInt, rangebase: ULong, rangeend: ULong): UInt =
    0u

public actual fun RtlCaptureContext(contextrecord: Long) {
}

public actual fun RtlCaptureContext2(contextrecord: Long) {
}

public actual fun RtlCaptureStackBackTrace(framestoskip: UInt, framestocapture: UInt, backtrace: Long, backtracehash: Long): UShort =
    0u

public actual fun RtlDeleteFunctionTable(functiontable: Long): Boolean =
    false

public actual fun RtlDeleteGrowableFunctionTable(dynamictable: Long) {
}

public actual fun RtlGrowFunctionTable(dynamictable: Long, newentrycount: UInt) {
}

public actual fun RtlInstallFunctionTableCallback(tableidentifier: ULong, baseaddress: ULong, length: UInt, callback: PGET_RUNTIME_FUNCTION_CALLBACK, context: Long, outofprocesscallbackdll: PCWSTR): Boolean =
    false

public actual fun RtlLookupFunctionEntry(controlpc: ULong, imagebase: Long, historytable: Long): Long =
    0L

public actual fun RtlPcToFileHeader(pcvalue: Long, baseofimage: Long): Long =
    0L

public actual fun RtlRaiseException(exceptionrecord: Long) {
}

public actual fun RtlRestoreContext(contextrecord: Long, exceptionrecord: Long) {
}

public actual fun RtlUnwind(targetframe: Long, targetip: Long, exceptionrecord: Long, returnvalue: Long) {
}

public actual fun RtlUnwindEx(targetframe: Long, targetip: Long, exceptionrecord: Long, returnvalue: Long, contextrecord: Long, historytable: Long) {
}

public actual fun RtlVirtualUnwind(handlertype: RTL_VIRTUAL_UNWIND_HANDLER_TYPE, imagebase: ULong, controlpc: ULong, functionentry: Long, contextrecord: Long, handlerdata: Long, establisherframe: Long, contextpointers: Long): EXCEPTION_ROUTINE =
    null

public actual fun SearchTreeForFile(rootpath: PCSTR, inputpathname: PCSTR, outputpathbuffer: PSTR): BOOL =
    0

public actual fun SearchTreeForFileW(rootpath: PCWSTR, inputpathname: PCWSTR, outputpathbuffer: PWSTR): BOOL =
    0

public actual fun SetCheckUserInterruptShared(lpstartaddress: LPCALL_BACK_USER_INTERRUPT_ROUTINE) {
}

public actual fun SetErrorMode(umode: THREAD_ERROR_MODE): THREAD_ERROR_MODE =
    0u

public actual fun SetImageConfigInformation(loadedimage: Long, imageconfiginformation: Long): BOOL =
    0

public actual fun SetSymLoadError(error: UInt) {
}

public actual fun SetThreadContext(hthread: HANDLE, lpcontext: Long): BOOL =
    0

public actual fun SetThreadErrorMode(dwnewmode: THREAD_ERROR_MODE, lpoldmode: Long): BOOL =
    0

public actual fun SetUnhandledExceptionFilter(lptoplevelexceptionfilter: LPTOP_LEVEL_EXCEPTION_FILTER): LPTOP_LEVEL_EXCEPTION_FILTER =
    null

public actual fun SetXStateFeaturesMask(context: Long, featuremask: ULong): BOOL =
    0

public actual fun StackWalk2(machinetype: UInt, hprocess: HANDLE, hthread: HANDLE, stackframe: Long, contextrecord: Long, readmemoryroutine: PREAD_PROCESS_MEMORY_ROUTINE64, functiontableaccessroutine: PFUNCTION_TABLE_ACCESS_ROUTINE64, getmodulebaseroutine: PGET_MODULE_BASE_ROUTINE64, translateaddress: PTRANSLATE_ADDRESS_ROUTINE64, gettargetattributevalue: PGET_TARGET_ATTRIBUTE_VALUE64, flags: UInt): BOOL =
    0

public actual fun StackWalk64(machinetype: UInt, hprocess: HANDLE, hthread: HANDLE, stackframe: Long, contextrecord: Long, readmemoryroutine: PREAD_PROCESS_MEMORY_ROUTINE64, functiontableaccessroutine: PFUNCTION_TABLE_ACCESS_ROUTINE64, getmodulebaseroutine: PGET_MODULE_BASE_ROUTINE64, translateaddress: PTRANSLATE_ADDRESS_ROUTINE64): BOOL =
    0

public actual fun StackWalkEx(machinetype: UInt, hprocess: HANDLE, hthread: HANDLE, stackframe: Long, contextrecord: Long, readmemoryroutine: PREAD_PROCESS_MEMORY_ROUTINE64, functiontableaccessroutine: PFUNCTION_TABLE_ACCESS_ROUTINE64, getmodulebaseroutine: PGET_MODULE_BASE_ROUTINE64, translateaddress: PTRANSLATE_ADDRESS_ROUTINE64, flags: UInt): BOOL =
    0

public actual fun SymAddSourceStream(hprocess: HANDLE, base: ULong, streamfile: PCSTR, buffer: Long, size: ULong): BOOL =
    0

public actual fun SymAddSourceStreamA(hprocess: HANDLE, base: ULong, streamfile: PCSTR, buffer: Long, size: ULong): BOOL =
    0

public actual fun SymAddSourceStreamW(hprocess: HANDLE, base: ULong, filespec: PCWSTR, buffer: Long, size: ULong): BOOL =
    0

public actual fun SymAddSymbol(hprocess: HANDLE, baseofdll: ULong, name: PCSTR, address: ULong, size: UInt, flags: UInt): BOOL =
    0

public actual fun SymAddSymbolW(hprocess: HANDLE, baseofdll: ULong, name: PCWSTR, address: ULong, size: UInt, flags: UInt): BOOL =
    0

public actual fun SymAddrIncludeInlineTrace(hprocess: HANDLE, address: ULong): UInt =
    0u

public actual fun SymCleanup(hprocess: HANDLE): BOOL =
    0

public actual fun SymCompareInlineTrace(hprocess: HANDLE, address1: ULong, inlinecontext1: UInt, retaddress1: ULong, address2: ULong, retaddress2: ULong): UInt =
    0u

public actual fun SymDeleteSymbol(hprocess: HANDLE, baseofdll: ULong, name: PCSTR, address: ULong, flags: UInt): BOOL =
    0

public actual fun SymDeleteSymbolW(hprocess: HANDLE, baseofdll: ULong, name: PCWSTR, address: ULong, flags: UInt): BOOL =
    0

public actual fun SymEnumLines(hprocess: HANDLE, base: ULong, obj: PCSTR, file: PCSTR, enumlinescallback: PSYM_ENUMLINES_CALLBACK, usercontext: Long): BOOL =
    0

public actual fun SymEnumLinesW(hprocess: HANDLE, base: ULong, obj: PCWSTR, file: PCWSTR, enumlinescallback: PSYM_ENUMLINES_CALLBACKW, usercontext: Long): BOOL =
    0

public actual fun SymEnumProcesses(enumprocessescallback: PSYM_ENUMPROCESSES_CALLBACK, usercontext: Long): BOOL =
    0

public actual fun SymEnumSourceFileTokens(hprocess: HANDLE, base: ULong, callback: PENUMSOURCEFILETOKENSCALLBACK): BOOL =
    0

public actual fun SymEnumSourceFiles(hprocess: HANDLE, modbase: ULong, mask: PCSTR, cbsrcfiles: PSYM_ENUMSOURCEFILES_CALLBACK, usercontext: Long): BOOL =
    0

public actual fun SymEnumSourceFilesW(hprocess: HANDLE, modbase: ULong, mask: PCWSTR, cbsrcfiles: PSYM_ENUMSOURCEFILES_CALLBACKW, usercontext: Long): BOOL =
    0

public actual fun SymEnumSourceLines(hprocess: HANDLE, base: ULong, obj: PCSTR, file: PCSTR, line: UInt, flags: UInt, enumlinescallback: PSYM_ENUMLINES_CALLBACK, usercontext: Long): BOOL =
    0

public actual fun SymEnumSourceLinesW(hprocess: HANDLE, base: ULong, obj: PCWSTR, file: PCWSTR, line: UInt, flags: UInt, enumlinescallback: PSYM_ENUMLINES_CALLBACKW, usercontext: Long): BOOL =
    0

public actual fun SymEnumSym(hprocess: HANDLE, baseofdll: ULong, enumsymbolscallback: PSYM_ENUMERATESYMBOLS_CALLBACK, usercontext: Long): BOOL =
    0

public actual fun SymEnumSymbols(hprocess: HANDLE, baseofdll: ULong, mask: PCSTR, enumsymbolscallback: PSYM_ENUMERATESYMBOLS_CALLBACK, usercontext: Long): BOOL =
    0

public actual fun SymEnumSymbolsEx(hprocess: HANDLE, baseofdll: ULong, mask: PCSTR, enumsymbolscallback: PSYM_ENUMERATESYMBOLS_CALLBACK, usercontext: Long, options: UInt): BOOL =
    0

public actual fun SymEnumSymbolsExW(hprocess: HANDLE, baseofdll: ULong, mask: PCWSTR, enumsymbolscallback: PSYM_ENUMERATESYMBOLS_CALLBACKW, usercontext: Long, options: UInt): BOOL =
    0

public actual fun SymEnumSymbolsForAddr(hprocess: HANDLE, address: ULong, enumsymbolscallback: PSYM_ENUMERATESYMBOLS_CALLBACK, usercontext: Long): BOOL =
    0

public actual fun SymEnumSymbolsForAddrW(hprocess: HANDLE, address: ULong, enumsymbolscallback: PSYM_ENUMERATESYMBOLS_CALLBACKW, usercontext: Long): BOOL =
    0

public actual fun SymEnumSymbolsW(hprocess: HANDLE, baseofdll: ULong, mask: PCWSTR, enumsymbolscallback: PSYM_ENUMERATESYMBOLS_CALLBACKW, usercontext: Long): BOOL =
    0

public actual fun SymEnumTypes(hprocess: HANDLE, baseofdll: ULong, enumsymbolscallback: PSYM_ENUMERATESYMBOLS_CALLBACK, usercontext: Long): BOOL =
    0

public actual fun SymEnumTypesByName(hprocess: HANDLE, baseofdll: ULong, mask: PCSTR, enumsymbolscallback: PSYM_ENUMERATESYMBOLS_CALLBACK, usercontext: Long): BOOL =
    0

public actual fun SymEnumTypesByNameW(hprocess: HANDLE, baseofdll: ULong, mask: PCWSTR, enumsymbolscallback: PSYM_ENUMERATESYMBOLS_CALLBACKW, usercontext: Long): BOOL =
    0

public actual fun SymEnumTypesW(hprocess: HANDLE, baseofdll: ULong, enumsymbolscallback: PSYM_ENUMERATESYMBOLS_CALLBACKW, usercontext: Long): BOOL =
    0

public actual fun SymEnumerateModules64(hprocess: HANDLE, enummodulescallback: PSYM_ENUMMODULES_CALLBACK64, usercontext: Long): BOOL =
    0

public actual fun SymEnumerateModulesW64(hprocess: HANDLE, enummodulescallback: PSYM_ENUMMODULES_CALLBACKW64, usercontext: Long): BOOL =
    0

public actual fun SymEnumerateSymbols64(hprocess: HANDLE, baseofdll: ULong, enumsymbolscallback: PSYM_ENUMSYMBOLS_CALLBACK64, usercontext: Long): BOOL =
    0

public actual fun SymEnumerateSymbolsW64(hprocess: HANDLE, baseofdll: ULong, enumsymbolscallback: PSYM_ENUMSYMBOLS_CALLBACK64W, usercontext: Long): BOOL =
    0

public actual fun SymFindDebugInfoFile(hprocess: HANDLE, filename: PCSTR, debugfilepath: PSTR, callback: PFIND_DEBUG_FILE_CALLBACK, callerdata: Long): HANDLE =
    0L

public actual fun SymFindDebugInfoFileW(hprocess: HANDLE, filename: PCWSTR, debugfilepath: PWSTR, callback: PFIND_DEBUG_FILE_CALLBACKW, callerdata: Long): HANDLE =
    0L

public actual fun SymFindExecutableImage(hprocess: HANDLE, filename: PCSTR, imagefilepath: PSTR, callback: PFIND_EXE_FILE_CALLBACK, callerdata: Long): HANDLE =
    0L

public actual fun SymFindExecutableImageW(hprocess: HANDLE, filename: PCWSTR, imagefilepath: PWSTR, callback: PFIND_EXE_FILE_CALLBACKW, callerdata: Long): HANDLE =
    0L

public actual fun SymFindFileInPath(hprocess: HANDLE, searchpatha: PCSTR, filename: PCSTR, id: Long, two: UInt, three: UInt, flags: SYM_FIND_ID_OPTION, foundfile: PSTR, callback: PFINDFILEINPATHCALLBACK, context: Long): BOOL =
    0

public actual fun SymFindFileInPathW(hprocess: HANDLE, searchpatha: PCWSTR, filename: PCWSTR, id: Long, two: UInt, three: UInt, flags: SYM_FIND_ID_OPTION, foundfile: PWSTR, callback: PFINDFILEINPATHCALLBACKW, context: Long): BOOL =
    0

public actual fun SymFromAddr(hprocess: HANDLE, address: ULong, displacement: Long, symbol: Long): BOOL =
    0

public actual fun SymFromAddrW(hprocess: HANDLE, address: ULong, displacement: Long, symbol: Long): BOOL =
    0

public actual fun SymFromIndex(hprocess: HANDLE, baseofdll: ULong, index: UInt, symbol: Long): BOOL =
    0

public actual fun SymFromIndexW(hprocess: HANDLE, baseofdll: ULong, index: UInt, symbol: Long): BOOL =
    0

public actual fun SymFromInlineContext(hprocess: HANDLE, address: ULong, inlinecontext: UInt, displacement: Long, symbol: Long): BOOL =
    0

public actual fun SymFromInlineContextW(hprocess: HANDLE, address: ULong, inlinecontext: UInt, displacement: Long, symbol: Long): BOOL =
    0

public actual fun SymFromName(hprocess: HANDLE, name: PCSTR, symbol: Long): BOOL =
    0

public actual fun SymFromNameW(hprocess: HANDLE, name: PCWSTR, symbol: Long): BOOL =
    0

public actual fun SymFromToken(hprocess: HANDLE, base: ULong, token: UInt, symbol: Long): BOOL =
    0

public actual fun SymFromTokenW(hprocess: HANDLE, base: ULong, token: UInt, symbol: Long): BOOL =
    0

public actual fun SymFunctionTableAccess64(hprocess: HANDLE, addrbase: ULong): Long =
    0L

public actual fun SymFunctionTableAccess64AccessRoutines(hprocess: HANDLE, addrbase: ULong, readmemoryroutine: PREAD_PROCESS_MEMORY_ROUTINE64, getmodulebaseroutine: PGET_MODULE_BASE_ROUTINE64): Long =
    0L

public actual fun SymGetExtendedOption(option: IMAGEHLP_EXTENDED_OPTIONS): BOOL =
    0

public actual fun SymGetFileLineOffsets64(hprocess: HANDLE, modulename: PCSTR, filename: PCSTR, buffer: Long, bufferlines: UInt): UInt =
    0u

public actual fun SymGetHomeDirectory(type: UInt, dir: PSTR, size: ULong): PSTR =
    0L

public actual fun SymGetHomeDirectoryW(type: UInt, dir: PWSTR, size: ULong): PWSTR =
    0L

public actual fun SymGetLineFromAddr64(hprocess: HANDLE, qwaddr: ULong, pdwdisplacement: Long, line64: Long): BOOL =
    0

public actual fun SymGetLineFromAddrW64(hprocess: HANDLE, dwaddr: ULong, pdwdisplacement: Long, line: Long): BOOL =
    0

public actual fun SymGetLineFromInlineContext(hprocess: HANDLE, qwaddr: ULong, inlinecontext: UInt, qwmodulebaseaddress: ULong, pdwdisplacement: Long, line64: Long): BOOL =
    0

public actual fun SymGetLineFromInlineContextW(hprocess: HANDLE, dwaddr: ULong, inlinecontext: UInt, qwmodulebaseaddress: ULong, pdwdisplacement: Long, line: Long): BOOL =
    0

public actual fun SymGetLineFromName64(hprocess: HANDLE, modulename: PCSTR, filename: PCSTR, dwlinenumber: UInt, pldisplacement: Long, line: Long): BOOL =
    0

public actual fun SymGetLineFromNameW64(hprocess: HANDLE, modulename: PCWSTR, filename: PCWSTR, dwlinenumber: UInt, pldisplacement: Long, line: Long): BOOL =
    0

public actual fun SymGetLineNext64(hprocess: HANDLE, line: Long): BOOL =
    0

public actual fun SymGetLineNextW64(hprocess: HANDLE, line: Long): BOOL =
    0

public actual fun SymGetLinePrev64(hprocess: HANDLE, line: Long): BOOL =
    0

public actual fun SymGetLinePrevW64(hprocess: HANDLE, line: Long): BOOL =
    0

public actual fun SymGetModuleBase64(hprocess: HANDLE, qwaddr: ULong): ULong =
    0uL

public actual fun SymGetModuleInfo64(hprocess: HANDLE, qwaddr: ULong, moduleinfo: Long): BOOL =
    0

public actual fun SymGetModuleInfoW64(hprocess: HANDLE, qwaddr: ULong, moduleinfo: Long): BOOL =
    0

public actual fun SymGetOmaps(hprocess: HANDLE, baseofdll: ULong, omapto: Long, comapto: Long, omapfrom: Long, comapfrom: Long): BOOL =
    0

public actual fun SymGetOptions(): UInt =
    0u

public actual fun SymGetScope(hprocess: HANDLE, baseofdll: ULong, index: UInt, symbol: Long): BOOL =
    0

public actual fun SymGetScopeW(hprocess: HANDLE, baseofdll: ULong, index: UInt, symbol: Long): BOOL =
    0

public actual fun SymGetSearchPath(hprocess: HANDLE, searchpatha: PSTR, searchpathlength: UInt): BOOL =
    0

public actual fun SymGetSearchPathW(hprocess: HANDLE, searchpatha: PWSTR, searchpathlength: UInt): BOOL =
    0

public actual fun SymGetSourceFile(hprocess: HANDLE, base: ULong, params: PCSTR, filespec: PCSTR, filepath: PSTR, size: UInt): BOOL =
    0

public actual fun SymGetSourceFileChecksum(hprocess: HANDLE, base: ULong, filespec: PCSTR, pchecksumtype: Long, pchecksum: Long, checksumsize: UInt, pactualbyteswritten: Long): BOOL =
    0

public actual fun SymGetSourceFileChecksumW(hprocess: HANDLE, base: ULong, filespec: PCWSTR, pchecksumtype: Long, pchecksum: Long, checksumsize: UInt, pactualbyteswritten: Long): BOOL =
    0

public actual fun SymGetSourceFileFromToken(hprocess: HANDLE, token: Long, params: PCSTR, filepath: PSTR, size: UInt): BOOL =
    0

public actual fun SymGetSourceFileFromTokenByTokenName(hprocess: HANDLE, token: Long, tokenname: PCSTR, params: PCSTR, filepath: PSTR, size: UInt): BOOL =
    0

public actual fun SymGetSourceFileFromTokenByTokenNameW(hprocess: HANDLE, token: Long, tokenname: PCWSTR, params: PCWSTR, filepath: PWSTR, size: UInt): BOOL =
    0

public actual fun SymGetSourceFileFromTokenW(hprocess: HANDLE, token: Long, params: PCWSTR, filepath: PWSTR, size: UInt): BOOL =
    0

public actual fun SymGetSourceFileToken(hprocess: HANDLE, base: ULong, filespec: PCSTR, token: Long, size: Long): BOOL =
    0

public actual fun SymGetSourceFileTokenByTokenName(hprocess: HANDLE, base: ULong, filespec: PCSTR, tokenname: PCSTR, tokenparameters: PCSTR, token: Long, size: Long): BOOL =
    0

public actual fun SymGetSourceFileTokenByTokenNameW(hprocess: HANDLE, base: ULong, filespec: PCWSTR, tokenname: PCWSTR, tokenparameters: PCWSTR, token: Long, size: Long): BOOL =
    0

public actual fun SymGetSourceFileTokenW(hprocess: HANDLE, base: ULong, filespec: PCWSTR, token: Long, size: Long): BOOL =
    0

public actual fun SymGetSourceFileW(hprocess: HANDLE, base: ULong, params: PCWSTR, filespec: PCWSTR, filepath: PWSTR, size: UInt): BOOL =
    0

public actual fun SymGetSourceVarFromToken(hprocess: HANDLE, token: Long, params: PCSTR, varname: PCSTR, value: PSTR, size: UInt): BOOL =
    0

public actual fun SymGetSourceVarFromTokenW(hprocess: HANDLE, token: Long, params: PCWSTR, varname: PCWSTR, value: PWSTR, size: UInt): BOOL =
    0

public actual fun SymGetSymFromAddr64(hprocess: HANDLE, qwaddr: ULong, pdwdisplacement: Long, symbol: Long): BOOL =
    0

public actual fun SymGetSymFromName64(hprocess: HANDLE, name: PCSTR, symbol: Long): BOOL =
    0

public actual fun SymGetSymNext64(hprocess: HANDLE, symbol: Long): BOOL =
    0

public actual fun SymGetSymPrev64(hprocess: HANDLE, symbol: Long): BOOL =
    0

public actual fun SymGetSymbolFile(hprocess: HANDLE, sympath: PCSTR, imagefile: PCSTR, type: UInt, symbolfile: PSTR, csymbolfile: ULong, dbgfile: PSTR, cdbgfile: ULong): BOOL =
    0

public actual fun SymGetSymbolFileW(hprocess: HANDLE, sympath: PCWSTR, imagefile: PCWSTR, type: UInt, symbolfile: PWSTR, csymbolfile: ULong, dbgfile: PWSTR, cdbgfile: ULong): BOOL =
    0

public actual fun SymGetTypeFromName(hprocess: HANDLE, baseofdll: ULong, name: PCSTR, symbol: Long): BOOL =
    0

public actual fun SymGetTypeFromNameW(hprocess: HANDLE, baseofdll: ULong, name: PCWSTR, symbol: Long): BOOL =
    0

public actual fun SymGetTypeInfo(hprocess: HANDLE, modbase: ULong, typeid: UInt, gettype: IMAGEHLP_SYMBOL_TYPE_INFO, pinfo: Long): BOOL =
    0

public actual fun SymGetTypeInfoEx(hprocess: HANDLE, modbase: ULong, params: Long): BOOL =
    0

public actual fun SymGetUnwindInfo(hprocess: HANDLE, address: ULong, buffer: Long, size: Long): BOOL =
    0

public actual fun SymInitialize(hprocess: HANDLE, usersearchpath: PCSTR, finvadeprocess: BOOL): BOOL =
    0

public actual fun SymInitializeW(hprocess: HANDLE, usersearchpath: PCWSTR, finvadeprocess: BOOL): BOOL =
    0

public actual fun SymLoadModule64(hprocess: HANDLE, hfile: HANDLE, imagename: PCSTR, modulename: PCSTR, baseofdll: ULong, sizeofdll: UInt): ULong =
    0uL

public actual fun SymLoadModuleEx(hprocess: HANDLE, hfile: HANDLE, imagename: PCSTR, modulename: PCSTR, baseofdll: ULong, dllsize: UInt, data: Long, flags: SYM_LOAD_FLAGS): ULong =
    0uL

public actual fun SymLoadModuleExW(hprocess: HANDLE, hfile: HANDLE, imagename: PCWSTR, modulename: PCWSTR, baseofdll: ULong, dllsize: UInt, data: Long, flags: SYM_LOAD_FLAGS): ULong =
    0uL

public actual fun SymMatchFileName(filename: PCSTR, match: PCSTR, filenamestop: Long, matchstop: Long): BOOL =
    0

public actual fun SymMatchFileNameW(filename: PCWSTR, match: PCWSTR, filenamestop: Long, matchstop: Long): BOOL =
    0

public actual fun SymMatchString(string: PCSTR, expression: PCSTR, fcase: BOOL): BOOL =
    0

public actual fun SymMatchStringA(string: PCSTR, expression: PCSTR, fcase: BOOL): BOOL =
    0

public actual fun SymMatchStringW(string: PCWSTR, expression: PCWSTR, fcase: BOOL): BOOL =
    0

public actual fun SymNext(hprocess: HANDLE, si: Long): BOOL =
    0

public actual fun SymNextW(hprocess: HANDLE, siw: Long): BOOL =
    0

public actual fun SymPrev(hprocess: HANDLE, si: Long): BOOL =
    0

public actual fun SymPrevW(hprocess: HANDLE, siw: Long): BOOL =
    0

public actual fun SymQueryInlineTrace(hprocess: HANDLE, startaddress: ULong, startcontext: UInt, startretaddress: ULong, curaddress: ULong, curcontext: Long, curframeindex: Long): BOOL =
    0

public actual fun SymRefreshModuleList(hprocess: HANDLE): BOOL =
    0

public actual fun SymRegisterCallback64(hprocess: HANDLE, callbackfunction: PSYMBOL_REGISTERED_CALLBACK64, usercontext: ULong): BOOL =
    0

public actual fun SymRegisterCallbackW64(hprocess: HANDLE, callbackfunction: PSYMBOL_REGISTERED_CALLBACK64, usercontext: ULong): BOOL =
    0

public actual fun SymRegisterFunctionEntryCallback64(hprocess: HANDLE, callbackfunction: PSYMBOL_FUNCENTRY_CALLBACK64, usercontext: ULong): BOOL =
    0

public actual fun SymSearch(hprocess: HANDLE, baseofdll: ULong, index: UInt, symtag: UInt, mask: PCSTR, address: ULong, enumsymbolscallback: PSYM_ENUMERATESYMBOLS_CALLBACK, usercontext: Long, options: UInt): BOOL =
    0

public actual fun SymSearchW(hprocess: HANDLE, baseofdll: ULong, index: UInt, symtag: UInt, mask: PCWSTR, address: ULong, enumsymbolscallback: PSYM_ENUMERATESYMBOLS_CALLBACKW, usercontext: Long, options: UInt): BOOL =
    0

public actual fun SymSetContext(hprocess: HANDLE, stackframe: Long, context: Long): BOOL =
    0

public actual fun SymSetExtendedOption(option: IMAGEHLP_EXTENDED_OPTIONS, value: BOOL): BOOL =
    0

public actual fun SymSetHomeDirectory(hprocess: HANDLE, dir: PCSTR): PSTR =
    0L

public actual fun SymSetHomeDirectoryW(hprocess: HANDLE, dir: PCWSTR): PWSTR =
    0L

public actual fun SymSetOptions(symoptions: UInt): UInt =
    0u

public actual fun SymSetParentWindow(hwnd: HWND): BOOL =
    0

public actual fun SymSetScopeFromAddr(hprocess: HANDLE, address: ULong): BOOL =
    0

public actual fun SymSetScopeFromIndex(hprocess: HANDLE, baseofdll: ULong, index: UInt): BOOL =
    0

public actual fun SymSetScopeFromInlineContext(hprocess: HANDLE, address: ULong, inlinecontext: UInt): BOOL =
    0

public actual fun SymSetSearchPath(hprocess: HANDLE, searchpatha: PCSTR): BOOL =
    0

public actual fun SymSetSearchPathW(hprocess: HANDLE, searchpatha: PCWSTR): BOOL =
    0

public actual fun SymSrvDeltaName(hprocess: HANDLE, sympath: PCSTR, type: PCSTR, file1: PCSTR, file2: PCSTR): PCSTR =
    0L

public actual fun SymSrvDeltaNameW(hprocess: HANDLE, sympath: PCWSTR, type: PCWSTR, file1: PCWSTR, file2: PCWSTR): PCWSTR =
    0L

public actual fun SymSrvGetFileIndexInfo(file: PCSTR, info: Long, flags: UInt): BOOL =
    0

public actual fun SymSrvGetFileIndexInfoW(file: PCWSTR, info: Long, flags: UInt): BOOL =
    0

public actual fun SymSrvGetFileIndexString(hprocess: HANDLE, srvpath: PCSTR, file: PCSTR, index: PSTR, size: ULong, flags: UInt): BOOL =
    0

public actual fun SymSrvGetFileIndexStringW(hprocess: HANDLE, srvpath: PCWSTR, file: PCWSTR, index: PWSTR, size: ULong, flags: UInt): BOOL =
    0

public actual fun SymSrvGetFileIndexes(file: PCSTR, id: Long, val1: Long, val2: Long, flags: UInt): BOOL =
    0

public actual fun SymSrvGetFileIndexesW(file: PCWSTR, id: Long, val1: Long, val2: Long, flags: UInt): BOOL =
    0

public actual fun SymSrvGetSupplement(hprocess: HANDLE, sympath: PCSTR, node: PCSTR, file: PCSTR): PCSTR =
    0L

public actual fun SymSrvGetSupplementW(hprocess: HANDLE, sympath: PCWSTR, node: PCWSTR, file: PCWSTR): PCWSTR =
    0L

public actual fun SymSrvIsStore(hprocess: HANDLE, path: PCSTR): BOOL =
    0

public actual fun SymSrvIsStoreW(hprocess: HANDLE, path: PCWSTR): BOOL =
    0

public actual fun SymSrvStoreFile(hprocess: HANDLE, srvpath: PCSTR, file: PCSTR, flags: SYM_SRV_STORE_FILE_FLAGS): PCSTR =
    0L

public actual fun SymSrvStoreFileW(hprocess: HANDLE, srvpath: PCWSTR, file: PCWSTR, flags: SYM_SRV_STORE_FILE_FLAGS): PCWSTR =
    0L

public actual fun SymSrvStoreSupplement(hprocess: HANDLE, srvpath: PCSTR, node: PCSTR, file: PCSTR, flags: UInt): PCSTR =
    0L

public actual fun SymSrvStoreSupplementW(hprocess: HANDLE, sympath: PCWSTR, node: PCWSTR, file: PCWSTR, flags: UInt): PCWSTR =
    0L

public actual fun SymUnDName64(sym: Long, undecname: PSTR, undecnamelength: UInt): BOOL =
    0

public actual fun SymUnloadModule64(hprocess: HANDLE, baseofdll: ULong): BOOL =
    0

public actual fun TerminateProcessOnMemoryExhaustion(failedallocationsize: ULong) {
}

public actual fun TouchFileTimes(filehandle: HANDLE, psystemtime: Long): BOOL =
    0

public actual fun UnDecorateSymbolName(name: PCSTR, outputstring: PSTR, maxstringlength: UInt, flags: UInt): UInt =
    0u

public actual fun UnDecorateSymbolNameW(name: PCWSTR, outputstring: PWSTR, maxstringlength: UInt, flags: UInt): UInt =
    0u

public actual fun UnMapAndLoad(loadedimage: Long): BOOL =
    0

public actual fun UnhandledExceptionFilter(exceptioninfo: Long): Int =
    0

public actual fun UpdateDebugInfoFile(imagefilename: PCSTR, symbolpath: PCSTR, debugfilepath: PSTR, ntheaders: Long): BOOL =
    0

public actual fun UpdateDebugInfoFileEx(imagefilename: PCSTR, symbolpath: PCSTR, debugfilepath: PSTR, ntheaders: Long, oldchecksum: UInt): BOOL =
    0

public actual fun WaitForDebugEvent(lpdebugevent: Long, dwmilliseconds: UInt): BOOL =
    0

public actual fun WaitForDebugEventEx(lpdebugevent: Long, dwmilliseconds: UInt): BOOL =
    0

public actual fun Wow64GetThreadContext(hthread: HANDLE, lpcontext: Long): BOOL =
    0

public actual fun Wow64GetThreadSelectorEntry(hthread: HANDLE, dwselector: UInt, lpselectorentry: Long): BOOL =
    0

public actual fun Wow64SetThreadContext(hthread: HANDLE, lpcontext: Long): BOOL =
    0

public actual fun WriteProcessMemory(hprocess: HANDLE, lpbaseaddress: Long, lpbuffer: Long, nsize: ULong, lpnumberofbyteswritten: Long): BOOL =
    0
