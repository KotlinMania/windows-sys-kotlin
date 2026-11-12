package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
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

public expect fun addVectoredContinueHandler(first: UInt, handler: PvectoredExceptionHandler): MutPtr

public expect fun addVectoredExceptionHandler(first: UInt, handler: PvectoredExceptionHandler): MutPtr

public expect fun beep(dwfreq: UInt, dwduration: UInt): Bool

public expect fun bindImage(imagename: Pcstr, dllpath: Pcstr, symbolpath: Pcstr): Bool

public expect fun bindImageEx(flags: UInt, imagename: Pcstr, dllpath: Pcstr, symbolpath: Pcstr, statusroutine: PimagehlpStatusRoutine): Bool

public expect fun checkRemoteDebuggerPresent(hprocess: Handle, pbdebuggerpresent: MutPtr): Bool

public expect fun checkSumMappedFile(baseaddress: ConstPtr, filelength: UInt, headersum: MutPtr, checksum: MutPtr): MutPtr

public expect fun closeThreadWaitChainSession(wcthandle: ConstPtr)

public expect fun continueDebugEvent(dwprocessid: UInt, dwthreadid: UInt, dwcontinuestatus: Ntstatus): Bool

public expect fun copyContext(destination: MutPtr, contextflags: ContextFlags, source: ConstPtr): Bool

public expect fun dbgHelpCreateUserDump(filename: Pcstr, callback: PdbghelpCreateUserDumpCallback, userdata: ConstPtr): Bool

public expect fun dbgHelpCreateUserDumpW(filename: Pcwstr, callback: PdbghelpCreateUserDumpCallback, userdata: ConstPtr): Bool

public expect fun debugActiveProcess(dwprocessid: UInt): Bool

public expect fun debugActiveProcessStop(dwprocessid: UInt): Bool

public expect fun debugBreak()

public expect fun debugBreakProcess(process: Handle): Bool

public expect fun debugSetProcessKillOnExit(killonexit: Bool): Bool

public expect fun decodePointer(ptr: ConstPtr): MutPtr

public expect fun decodeRemotePointer(processhandle: Handle, ptr: ConstPtr, decodedptr: MutPtr): Hresult

public expect fun decodeSystemPointer(ptr: ConstPtr): MutPtr

public expect fun encodePointer(ptr: ConstPtr): MutPtr

public expect fun encodeRemotePointer(processhandle: Handle, ptr: ConstPtr, encodedptr: MutPtr): Hresult

public expect fun encodeSystemPointer(ptr: ConstPtr): MutPtr

public expect fun enumDirTree(hprocess: Handle, rootpath: Pcstr, inputpathname: Pcstr, outputpathbuffer: Pstr, cb: PenumdirtreeCallback, data: ConstPtr): Bool

public expect fun enumDirTreeW(hprocess: Handle, rootpath: Pcwstr, inputpathname: Pcwstr, outputpathbuffer: Pwstr, cb: PenumdirtreeCallbackw, data: ConstPtr): Bool

public expect fun enumerateLoadedModules64(hprocess: Handle, enumloadedmodulescallback: PenumloadedModulesCallback64, usercontext: ConstPtr): Bool

public expect fun enumerateLoadedModulesEx(hprocess: Handle, enumloadedmodulescallback: PenumloadedModulesCallback64, usercontext: ConstPtr): Bool

public expect fun enumerateLoadedModulesExW(hprocess: Handle, enumloadedmodulescallback: PenumloadedModulesCallbackw64, usercontext: ConstPtr): Bool

public expect fun enumerateLoadedModulesW64(hprocess: Handle, enumloadedmodulescallback: PenumloadedModulesCallbackw64, usercontext: ConstPtr): Bool

public expect fun fatalAppExitA(uaction: UInt, lpmessagetext: Pcstr)

public expect fun fatalAppExitW(uaction: UInt, lpmessagetext: Pcwstr)

public expect fun fatalExit(exitcode: Int): Nothing

public expect fun findDebugInfoFile(filename: Pcstr, symbolpath: Pcstr, debugfilepath: Pstr): Handle

public expect fun findDebugInfoFileEx(filename: Pcstr, symbolpath: Pcstr, debugfilepath: Pstr, callback: PfindDebugFileCallback, callerdata: ConstPtr): Handle

public expect fun findDebugInfoFileExW(filename: Pcwstr, symbolpath: Pcwstr, debugfilepath: Pwstr, callback: PfindDebugFileCallbackw, callerdata: ConstPtr): Handle

public expect fun findExecutableImage(filename: Pcstr, symbolpath: Pcstr, imagefilepath: Pstr): Handle

public expect fun findExecutableImageEx(filename: Pcstr, symbolpath: Pcstr, imagefilepath: Pstr, callback: PfindExeFileCallback, callerdata: ConstPtr): Handle

public expect fun findExecutableImageExW(filename: Pcwstr, symbolpath: Pcwstr, imagefilepath: Pwstr, callback: PfindExeFileCallbackw, callerdata: ConstPtr): Handle

public expect fun findFileInPath(hprocess: Handle, searchpatha: Pcstr, filename: Pcstr, id: ConstPtr, two: UInt, three: UInt, flags: UInt, filepath: Pstr): Bool

public expect fun findFileInSearchPath(hprocess: Handle, searchpatha: Pcstr, filename: Pcstr, one: UInt, two: UInt, three: UInt, filepath: Pstr): Bool

public expect fun flushInstructionCache(hprocess: Handle, lpbaseaddress: ConstPtr, dwsize: ULong): Bool

public expect fun formatMessageA(dwflags: FormatMessageOptions, lpsource: ConstPtr, dwmessageid: UInt, dwlanguageid: UInt, lpbuffer: Pstr, nsize: UInt, arguments: ConstPtr): UInt

public expect fun formatMessageW(dwflags: FormatMessageOptions, lpsource: ConstPtr, dwmessageid: UInt, dwlanguageid: UInt, lpbuffer: Pwstr, nsize: UInt, arguments: ConstPtr): UInt

public expect fun getEnabledXStateFeatures(): ULong

public expect fun getErrorMode(): UInt

public expect fun getImageConfigInformation(loadedimage: ConstPtr, imageconfiginformation: MutPtr): Bool

public expect fun getImageUnusedHeaderBytes(loadedimage: ConstPtr, sizeunusedheaderbytes: MutPtr): UInt

public expect fun getSymLoadError(): UInt

public expect fun getThreadContext(hthread: Handle, lpcontext: MutPtr): Bool

public expect fun getThreadErrorMode(): UInt

public expect fun getThreadSelectorEntry(hthread: Handle, dwselector: UInt, lpselectorentry: MutPtr): Bool

public expect fun getThreadWaitChain(wcthandle: ConstPtr, context: ULong, flags: WaitChainThreadOptions, threadid: UInt, nodecount: MutPtr, nodeinfoarray: MutPtr, iscycle: MutPtr): Bool

public expect fun getTimestampForLoadedLibrary(module: Hmodule): UInt

public expect fun getXStateFeaturesMask(context: ConstPtr, featuremask: MutPtr): Bool

public expect fun imageAddCertificate(filehandle: Handle, certificate: ConstPtr, index: MutPtr): Bool

public expect fun imageDirectoryEntryToData(base: ConstPtr, mappedasimage: Boolean, directoryentry: ImageDirectoryEntry, size: MutPtr): MutPtr

public expect fun imageDirectoryEntryToDataEx(base: ConstPtr, mappedasimage: Boolean, directoryentry: ImageDirectoryEntry, size: MutPtr, foundheader: MutPtr): MutPtr

public expect fun imageEnumerateCertificates(filehandle: Handle, typefilter: UShort, certificatecount: MutPtr, indices: MutPtr, indexcount: UInt): Bool

public expect fun imageGetCertificateData(filehandle: Handle, certificateindex: UInt, certificate: MutPtr, requiredlength: MutPtr): Bool

public expect fun imageGetCertificateHeader(filehandle: Handle, certificateindex: UInt, certificateheader: MutPtr): Bool

public expect fun imageGetDigestStream(filehandle: Handle, digestlevel: UInt, digestfunction: DigestFunction, digesthandle: ConstPtr): Bool

public expect fun imageLoad(dllname: Pcstr, dllpath: Pcstr): MutPtr

public expect fun imageNtHeader(base: ConstPtr): MutPtr

public expect fun imageRemoveCertificate(filehandle: Handle, index: UInt): Bool

public expect fun imageRvaToSection(ntheaders: ConstPtr, base: ConstPtr, rva: UInt): MutPtr

public expect fun imageRvaToVa(ntheaders: ConstPtr, base: ConstPtr, rva: UInt, lastrvasection: ConstPtr): MutPtr

public expect fun imageUnload(loadedimage: MutPtr): Bool

public expect fun imagehlpApiVersion(): MutPtr

public expect fun imagehlpApiVersionEx(appversion: ConstPtr): MutPtr

public expect fun initializeContext(buffer: MutPtr, contextflags: ContextFlags, context: MutPtr, contextlength: MutPtr): Bool

public expect fun initializeContext2(buffer: MutPtr, contextflags: ContextFlags, context: MutPtr, contextlength: MutPtr, xstatecompactionmask: ULong): Bool

public expect fun isDebuggerPresent(): Bool

public expect fun locateXStateFeature(context: ConstPtr, featureid: UInt, length: MutPtr): MutPtr

public expect fun makeSureDirectoryPathExists(dirpath: Pcstr): Bool

public expect fun mapAndLoad(imagename: Pcstr, dllpath: Pcstr, loadedimage: MutPtr, dotdll: Bool, readonly: Bool): Bool

public expect fun mapFileAndCheckSumA(filename: Pcstr, headersum: MutPtr, checksum: MutPtr): UInt

public expect fun mapFileAndCheckSumW(filename: Pcwstr, headersum: MutPtr, checksum: MutPtr): UInt

public expect fun messageBeep(utype: MessageboxStyle): Bool

public expect fun miniDumpReadDumpStream(baseofdump: ConstPtr, streamnumber: UInt, dir: MutPtr, streampointer: MutPtr, streamsize: MutPtr): Bool

public expect fun miniDumpWriteDump(hprocess: Handle, processid: UInt, hfile: Handle, dumptype: MinidumpType, exceptionparam: ConstPtr, userstreamparam: ConstPtr, callbackparam: ConstPtr): Bool

public expect fun openThreadWaitChainSession(flags: OpenThreadWaitChainSessionFlags, callback: Pwaitchaincallback): MutPtr

public expect fun outputDebugStringA(lpoutputstring: Pcstr)

public expect fun outputDebugStringW(lpoutputstring: Pcwstr)

public expect fun raiseException(dwexceptioncode: UInt, dwexceptionflags: UInt, nnumberofarguments: UInt, lparguments: ConstPtr)

public expect fun raiseFailFastException(pexceptionrecord: ConstPtr, pcontextrecord: ConstPtr, dwflags: UInt)

public expect fun rangeMapAddPeImageSections(rmaphandle: ConstPtr, imagename: Pcwstr, mappedimage: ConstPtr, mappingbytes: UInt, imagebase: ULong, usertag: ULong, mappingflags: UInt): Bool

public expect fun rangeMapCreate(): MutPtr

public expect fun rangeMapFree(rmaphandle: ConstPtr)

public expect fun rangeMapRead(rmaphandle: ConstPtr, offset: ULong, buffer: MutPtr, requestbytes: UInt, flags: UInt, donebytes: MutPtr): Bool

public expect fun rangeMapRemove(rmaphandle: ConstPtr, usertag: ULong): Bool

public expect fun rangeMapWrite(rmaphandle: ConstPtr, offset: ULong, buffer: ConstPtr, requestbytes: UInt, flags: UInt, donebytes: MutPtr): Bool

public expect fun reBaseImage(currentimagename: Pcstr, symbolpath: Pcstr, frebase: Bool, frebasesysfileok: Bool, fgoingdown: Bool, checkimagesize: UInt, oldimagesize: MutPtr, oldimagebase: MutPtr, newimagesize: MutPtr, newimagebase: MutPtr, timestamp: UInt): Bool

public expect fun reBaseImage64(currentimagename: Pcstr, symbolpath: Pcstr, frebase: Bool, frebasesysfileok: Bool, fgoingdown: Bool, checkimagesize: UInt, oldimagesize: MutPtr, oldimagebase: MutPtr, newimagesize: MutPtr, newimagebase: MutPtr, timestamp: UInt): Bool

public expect fun readProcessMemory(hprocess: Handle, lpbaseaddress: ConstPtr, lpbuffer: MutPtr, nsize: ULong, lpnumberofbytesread: MutPtr): Bool

public expect fun registerWaitChainCOMCallback(callstatecallback: Pcogetcallstate, activationstatecallback: Pcogetactivationstate)

public expect fun removeInvalidModuleList(hprocess: Handle)

public expect fun removeVectoredContinueHandler(handle: ConstPtr): UInt

public expect fun removeVectoredExceptionHandler(handle: ConstPtr): UInt

public expect fun reportSymbolLoadSummary(hprocess: Handle, ploadmodule: Pcwstr, psymboldata: ConstPtr): Bool

public expect fun rtlAddFunctionTable(functiontable: ConstPtr, entrycount: UInt, baseaddress: ULong): Boolean

public expect fun rtlAddGrowableFunctionTable(dynamictable: MutPtr, functiontable: ConstPtr, entrycount: UInt, maximumentrycount: UInt, rangebase: ULong, rangeend: ULong): UInt

public expect fun rtlCaptureContext(contextrecord: MutPtr)

public expect fun rtlCaptureContext2(contextrecord: MutPtr)

public expect fun rtlCaptureStackBackTrace(framestoskip: UInt, framestocapture: UInt, backtrace: MutPtr, backtracehash: MutPtr): UShort

public expect fun rtlDeleteFunctionTable(functiontable: ConstPtr): Boolean

public expect fun rtlDeleteGrowableFunctionTable(dynamictable: ConstPtr)

public expect fun rtlGrowFunctionTable(dynamictable: MutPtr, newentrycount: UInt)

public expect fun rtlInstallFunctionTableCallback(tableidentifier: ULong, baseaddress: ULong, length: UInt, callback: PgetRuntimeFunctionCallback, context: ConstPtr, outofprocesscallbackdll: Pcwstr): Boolean

public expect fun rtlLookupFunctionEntry(controlpc: ULong, imagebase: MutPtr, historytable: MutPtr): MutPtr

public expect fun rtlPcToFileHeader(pcvalue: ConstPtr, baseofimage: MutPtr): MutPtr

public expect fun rtlRaiseException(exceptionrecord: ConstPtr)

public expect fun rtlRestoreContext(contextrecord: ConstPtr, exceptionrecord: ConstPtr)

public expect fun rtlUnwind(targetframe: ConstPtr, targetip: ConstPtr, exceptionrecord: ConstPtr, returnvalue: ConstPtr)

public expect fun rtlUnwindEx(targetframe: ConstPtr, targetip: ConstPtr, exceptionrecord: ConstPtr, returnvalue: ConstPtr, contextrecord: ConstPtr, historytable: ConstPtr)

public expect fun rtlVirtualUnwind(handlertype: RtlVirtualUnwindHandlerType, imagebase: ULong, controlpc: ULong, functionentry: ConstPtr, contextrecord: MutPtr, handlerdata: MutPtr, establisherframe: MutPtr, contextpointers: MutPtr): ExceptionRoutine

public expect fun searchTreeForFile(rootpath: Pcstr, inputpathname: Pcstr, outputpathbuffer: Pstr): Bool

public expect fun searchTreeForFileW(rootpath: Pcwstr, inputpathname: Pcwstr, outputpathbuffer: Pwstr): Bool

public expect fun setCheckUserInterruptShared(lpstartaddress: LpcallBackUserInterruptRoutine)

public expect fun setErrorMode(umode: ThreadErrorMode): ThreadErrorMode

public expect fun setImageConfigInformation(loadedimage: MutPtr, imageconfiginformation: ConstPtr): Bool

public expect fun setSymLoadError(error: UInt)

public expect fun setThreadContext(hthread: Handle, lpcontext: ConstPtr): Bool

public expect fun setThreadErrorMode(dwnewmode: ThreadErrorMode, lpoldmode: MutPtr): Bool

public expect fun setUnhandledExceptionFilter(lptoplevelexceptionfilter: LptopLevelExceptionFilter): LptopLevelExceptionFilter

public expect fun setXStateFeaturesMask(context: MutPtr, featuremask: ULong): Bool

public expect fun stackWalk2(machinetype: UInt, hprocess: Handle, hthread: Handle, stackframe: MutPtr, contextrecord: MutPtr, readmemoryroutine: PreadProcessMemoryRoutine64, functiontableaccessroutine: PfunctionTableAccessRoutine64, getmodulebaseroutine: PgetModuleBaseRoutine64, translateaddress: PtranslateAddressRoutine64, gettargetattributevalue: PgetTargetAttributeValue64, flags: UInt): Bool

public expect fun stackWalk64(machinetype: UInt, hprocess: Handle, hthread: Handle, stackframe: MutPtr, contextrecord: MutPtr, readmemoryroutine: PreadProcessMemoryRoutine64, functiontableaccessroutine: PfunctionTableAccessRoutine64, getmodulebaseroutine: PgetModuleBaseRoutine64, translateaddress: PtranslateAddressRoutine64): Bool

public expect fun stackWalkEx(machinetype: UInt, hprocess: Handle, hthread: Handle, stackframe: MutPtr, contextrecord: MutPtr, readmemoryroutine: PreadProcessMemoryRoutine64, functiontableaccessroutine: PfunctionTableAccessRoutine64, getmodulebaseroutine: PgetModuleBaseRoutine64, translateaddress: PtranslateAddressRoutine64, flags: UInt): Bool

public expect fun symAddSourceStream(hprocess: Handle, base: ULong, streamfile: Pcstr, buffer: ConstPtr, size: ULong): Bool

public expect fun symAddSourceStreamA(hprocess: Handle, base: ULong, streamfile: Pcstr, buffer: ConstPtr, size: ULong): Bool

public expect fun symAddSourceStreamW(hprocess: Handle, base: ULong, filespec: Pcwstr, buffer: ConstPtr, size: ULong): Bool

public expect fun symAddSymbol(hprocess: Handle, baseofdll: ULong, name: Pcstr, address: ULong, size: UInt, flags: UInt): Bool

public expect fun symAddSymbolW(hprocess: Handle, baseofdll: ULong, name: Pcwstr, address: ULong, size: UInt, flags: UInt): Bool

public expect fun symAddrIncludeInlineTrace(hprocess: Handle, address: ULong): UInt

public expect fun symCleanup(hprocess: Handle): Bool

public expect fun symCompareInlineTrace(hprocess: Handle, address1: ULong, inlinecontext1: UInt, retaddress1: ULong, address2: ULong, retaddress2: ULong): UInt

public expect fun symDeleteSymbol(hprocess: Handle, baseofdll: ULong, name: Pcstr, address: ULong, flags: UInt): Bool

public expect fun symDeleteSymbolW(hprocess: Handle, baseofdll: ULong, name: Pcwstr, address: ULong, flags: UInt): Bool

public expect fun symEnumLines(hprocess: Handle, base: ULong, obj: Pcstr, file: Pcstr, enumlinescallback: PsymEnumlinesCallback, usercontext: ConstPtr): Bool

public expect fun symEnumLinesW(hprocess: Handle, base: ULong, obj: Pcwstr, file: Pcwstr, enumlinescallback: PsymEnumlinesCallbackw, usercontext: ConstPtr): Bool

public expect fun symEnumProcesses(enumprocessescallback: PsymEnumprocessesCallback, usercontext: ConstPtr): Bool

public expect fun symEnumSourceFileTokens(hprocess: Handle, base: ULong, callback: Penumsourcefiletokenscallback): Bool

public expect fun symEnumSourceFiles(hprocess: Handle, modbase: ULong, mask: Pcstr, cbsrcfiles: PsymEnumsourcefilesCallback, usercontext: ConstPtr): Bool

public expect fun symEnumSourceFilesW(hprocess: Handle, modbase: ULong, mask: Pcwstr, cbsrcfiles: PsymEnumsourcefilesCallbackw, usercontext: ConstPtr): Bool

public expect fun symEnumSourceLines(hprocess: Handle, base: ULong, obj: Pcstr, file: Pcstr, line: UInt, flags: UInt, enumlinescallback: PsymEnumlinesCallback, usercontext: ConstPtr): Bool

public expect fun symEnumSourceLinesW(hprocess: Handle, base: ULong, obj: Pcwstr, file: Pcwstr, line: UInt, flags: UInt, enumlinescallback: PsymEnumlinesCallbackw, usercontext: ConstPtr): Bool

public expect fun symEnumSym(hprocess: Handle, baseofdll: ULong, enumsymbolscallback: PsymEnumeratesymbolsCallback, usercontext: ConstPtr): Bool

public expect fun symEnumSymbols(hprocess: Handle, baseofdll: ULong, mask: Pcstr, enumsymbolscallback: PsymEnumeratesymbolsCallback, usercontext: ConstPtr): Bool

public expect fun symEnumSymbolsEx(hprocess: Handle, baseofdll: ULong, mask: Pcstr, enumsymbolscallback: PsymEnumeratesymbolsCallback, usercontext: ConstPtr, options: UInt): Bool

public expect fun symEnumSymbolsExW(hprocess: Handle, baseofdll: ULong, mask: Pcwstr, enumsymbolscallback: PsymEnumeratesymbolsCallbackw, usercontext: ConstPtr, options: UInt): Bool

public expect fun symEnumSymbolsForAddr(hprocess: Handle, address: ULong, enumsymbolscallback: PsymEnumeratesymbolsCallback, usercontext: ConstPtr): Bool

public expect fun symEnumSymbolsForAddrW(hprocess: Handle, address: ULong, enumsymbolscallback: PsymEnumeratesymbolsCallbackw, usercontext: ConstPtr): Bool

public expect fun symEnumSymbolsW(hprocess: Handle, baseofdll: ULong, mask: Pcwstr, enumsymbolscallback: PsymEnumeratesymbolsCallbackw, usercontext: ConstPtr): Bool

public expect fun symEnumTypes(hprocess: Handle, baseofdll: ULong, enumsymbolscallback: PsymEnumeratesymbolsCallback, usercontext: ConstPtr): Bool

public expect fun symEnumTypesByName(hprocess: Handle, baseofdll: ULong, mask: Pcstr, enumsymbolscallback: PsymEnumeratesymbolsCallback, usercontext: ConstPtr): Bool

public expect fun symEnumTypesByNameW(hprocess: Handle, baseofdll: ULong, mask: Pcwstr, enumsymbolscallback: PsymEnumeratesymbolsCallbackw, usercontext: ConstPtr): Bool

public expect fun symEnumTypesW(hprocess: Handle, baseofdll: ULong, enumsymbolscallback: PsymEnumeratesymbolsCallbackw, usercontext: ConstPtr): Bool

public expect fun symEnumerateModules64(hprocess: Handle, enummodulescallback: PsymEnummodulesCallback64, usercontext: ConstPtr): Bool

public expect fun symEnumerateModulesW64(hprocess: Handle, enummodulescallback: PsymEnummodulesCallbackw64, usercontext: ConstPtr): Bool

public expect fun symEnumerateSymbols64(hprocess: Handle, baseofdll: ULong, enumsymbolscallback: PsymEnumsymbolsCallback64, usercontext: ConstPtr): Bool

public expect fun symEnumerateSymbolsW64(hprocess: Handle, baseofdll: ULong, enumsymbolscallback: PsymEnumsymbolsCallback64w, usercontext: ConstPtr): Bool

public expect fun symFindDebugInfoFile(hprocess: Handle, filename: Pcstr, debugfilepath: Pstr, callback: PfindDebugFileCallback, callerdata: ConstPtr): Handle

public expect fun symFindDebugInfoFileW(hprocess: Handle, filename: Pcwstr, debugfilepath: Pwstr, callback: PfindDebugFileCallbackw, callerdata: ConstPtr): Handle

public expect fun symFindExecutableImage(hprocess: Handle, filename: Pcstr, imagefilepath: Pstr, callback: PfindExeFileCallback, callerdata: ConstPtr): Handle

public expect fun symFindExecutableImageW(hprocess: Handle, filename: Pcwstr, imagefilepath: Pwstr, callback: PfindExeFileCallbackw, callerdata: ConstPtr): Handle

public expect fun symFindFileInPath(hprocess: Handle, searchpatha: Pcstr, filename: Pcstr, id: ConstPtr, two: UInt, three: UInt, flags: SymFindIdOption, foundfile: Pstr, callback: Pfindfileinpathcallback, context: ConstPtr): Bool

public expect fun symFindFileInPathW(hprocess: Handle, searchpatha: Pcwstr, filename: Pcwstr, id: ConstPtr, two: UInt, three: UInt, flags: SymFindIdOption, foundfile: Pwstr, callback: Pfindfileinpathcallbackw, context: ConstPtr): Bool

public expect fun symFromAddr(hprocess: Handle, address: ULong, displacement: MutPtr, symbol: MutPtr): Bool

public expect fun symFromAddrW(hprocess: Handle, address: ULong, displacement: MutPtr, symbol: MutPtr): Bool

public expect fun symFromIndex(hprocess: Handle, baseofdll: ULong, index: UInt, symbol: MutPtr): Bool

public expect fun symFromIndexW(hprocess: Handle, baseofdll: ULong, index: UInt, symbol: MutPtr): Bool

public expect fun symFromInlineContext(hprocess: Handle, address: ULong, inlinecontext: UInt, displacement: MutPtr, symbol: MutPtr): Bool

public expect fun symFromInlineContextW(hprocess: Handle, address: ULong, inlinecontext: UInt, displacement: MutPtr, symbol: MutPtr): Bool

public expect fun symFromName(hprocess: Handle, name: Pcstr, symbol: MutPtr): Bool

public expect fun symFromNameW(hprocess: Handle, name: Pcwstr, symbol: MutPtr): Bool

public expect fun symFromToken(hprocess: Handle, base: ULong, token: UInt, symbol: MutPtr): Bool

public expect fun symFromTokenW(hprocess: Handle, base: ULong, token: UInt, symbol: MutPtr): Bool

public expect fun symFunctionTableAccess64(hprocess: Handle, addrbase: ULong): MutPtr

public expect fun symFunctionTableAccess64AccessRoutines(hprocess: Handle, addrbase: ULong, readmemoryroutine: PreadProcessMemoryRoutine64, getmodulebaseroutine: PgetModuleBaseRoutine64): MutPtr

public expect fun symGetExtendedOption(option: ImagehlpExtendedOptions): Bool

public expect fun symGetFileLineOffsets64(hprocess: Handle, modulename: Pcstr, filename: Pcstr, buffer: MutPtr, bufferlines: UInt): UInt

public expect fun symGetHomeDirectory(type: UInt, dir: Pstr, size: ULong): Pstr

public expect fun symGetHomeDirectoryW(type: UInt, dir: Pwstr, size: ULong): Pwstr

public expect fun symGetLineFromAddr64(hprocess: Handle, qwaddr: ULong, pdwdisplacement: MutPtr, line64: MutPtr): Bool

public expect fun symGetLineFromAddrW64(hprocess: Handle, dwaddr: ULong, pdwdisplacement: MutPtr, line: MutPtr): Bool

public expect fun symGetLineFromInlineContext(hprocess: Handle, qwaddr: ULong, inlinecontext: UInt, qwmodulebaseaddress: ULong, pdwdisplacement: MutPtr, line64: MutPtr): Bool

public expect fun symGetLineFromInlineContextW(hprocess: Handle, dwaddr: ULong, inlinecontext: UInt, qwmodulebaseaddress: ULong, pdwdisplacement: MutPtr, line: MutPtr): Bool

public expect fun symGetLineFromName64(hprocess: Handle, modulename: Pcstr, filename: Pcstr, dwlinenumber: UInt, pldisplacement: MutPtr, line: MutPtr): Bool

public expect fun symGetLineFromNameW64(hprocess: Handle, modulename: Pcwstr, filename: Pcwstr, dwlinenumber: UInt, pldisplacement: MutPtr, line: MutPtr): Bool

public expect fun symGetLineNext64(hprocess: Handle, line: MutPtr): Bool

public expect fun symGetLineNextW64(hprocess: Handle, line: MutPtr): Bool

public expect fun symGetLinePrev64(hprocess: Handle, line: MutPtr): Bool

public expect fun symGetLinePrevW64(hprocess: Handle, line: MutPtr): Bool

public expect fun symGetModuleBase64(hprocess: Handle, qwaddr: ULong): ULong

public expect fun symGetModuleInfo64(hprocess: Handle, qwaddr: ULong, moduleinfo: MutPtr): Bool

public expect fun symGetModuleInfoW64(hprocess: Handle, qwaddr: ULong, moduleinfo: MutPtr): Bool

public expect fun symGetOmaps(hprocess: Handle, baseofdll: ULong, omapto: MutPtr, comapto: MutPtr, omapfrom: MutPtr, comapfrom: MutPtr): Bool

public expect fun symGetOptions(): UInt

public expect fun symGetScope(hprocess: Handle, baseofdll: ULong, index: UInt, symbol: MutPtr): Bool

public expect fun symGetScopeW(hprocess: Handle, baseofdll: ULong, index: UInt, symbol: MutPtr): Bool

public expect fun symGetSearchPath(hprocess: Handle, searchpatha: Pstr, searchpathlength: UInt): Bool

public expect fun symGetSearchPathW(hprocess: Handle, searchpatha: Pwstr, searchpathlength: UInt): Bool

public expect fun symGetSourceFile(hprocess: Handle, base: ULong, params: Pcstr, filespec: Pcstr, filepath: Pstr, size: UInt): Bool

public expect fun symGetSourceFileChecksum(hprocess: Handle, base: ULong, filespec: Pcstr, pchecksumtype: MutPtr, pchecksum: MutPtr, checksumsize: UInt, pactualbyteswritten: MutPtr): Bool

public expect fun symGetSourceFileChecksumW(hprocess: Handle, base: ULong, filespec: Pcwstr, pchecksumtype: MutPtr, pchecksum: MutPtr, checksumsize: UInt, pactualbyteswritten: MutPtr): Bool

public expect fun symGetSourceFileFromToken(hprocess: Handle, token: ConstPtr, params: Pcstr, filepath: Pstr, size: UInt): Bool

public expect fun symGetSourceFileFromTokenByTokenName(hprocess: Handle, token: ConstPtr, tokenname: Pcstr, params: Pcstr, filepath: Pstr, size: UInt): Bool

public expect fun symGetSourceFileFromTokenByTokenNameW(hprocess: Handle, token: ConstPtr, tokenname: Pcwstr, params: Pcwstr, filepath: Pwstr, size: UInt): Bool

public expect fun symGetSourceFileFromTokenW(hprocess: Handle, token: ConstPtr, params: Pcwstr, filepath: Pwstr, size: UInt): Bool

public expect fun symGetSourceFileToken(hprocess: Handle, base: ULong, filespec: Pcstr, token: MutPtr, size: MutPtr): Bool

public expect fun symGetSourceFileTokenByTokenName(hprocess: Handle, base: ULong, filespec: Pcstr, tokenname: Pcstr, tokenparameters: Pcstr, token: MutPtr, size: MutPtr): Bool

public expect fun symGetSourceFileTokenByTokenNameW(hprocess: Handle, base: ULong, filespec: Pcwstr, tokenname: Pcwstr, tokenparameters: Pcwstr, token: MutPtr, size: MutPtr): Bool

public expect fun symGetSourceFileTokenW(hprocess: Handle, base: ULong, filespec: Pcwstr, token: MutPtr, size: MutPtr): Bool

public expect fun symGetSourceFileW(hprocess: Handle, base: ULong, params: Pcwstr, filespec: Pcwstr, filepath: Pwstr, size: UInt): Bool

public expect fun symGetSourceVarFromToken(hprocess: Handle, token: ConstPtr, params: Pcstr, varname: Pcstr, value: Pstr, size: UInt): Bool

public expect fun symGetSourceVarFromTokenW(hprocess: Handle, token: ConstPtr, params: Pcwstr, varname: Pcwstr, value: Pwstr, size: UInt): Bool

public expect fun symGetSymFromAddr64(hprocess: Handle, qwaddr: ULong, pdwdisplacement: MutPtr, symbol: MutPtr): Bool

public expect fun symGetSymFromName64(hprocess: Handle, name: Pcstr, symbol: MutPtr): Bool

public expect fun symGetSymNext64(hprocess: Handle, symbol: MutPtr): Bool

public expect fun symGetSymPrev64(hprocess: Handle, symbol: MutPtr): Bool

public expect fun symGetSymbolFile(hprocess: Handle, sympath: Pcstr, imagefile: Pcstr, type: UInt, symbolfile: Pstr, csymbolfile: ULong, dbgfile: Pstr, cdbgfile: ULong): Bool

public expect fun symGetSymbolFileW(hprocess: Handle, sympath: Pcwstr, imagefile: Pcwstr, type: UInt, symbolfile: Pwstr, csymbolfile: ULong, dbgfile: Pwstr, cdbgfile: ULong): Bool

public expect fun symGetTypeFromName(hprocess: Handle, baseofdll: ULong, name: Pcstr, symbol: MutPtr): Bool

public expect fun symGetTypeFromNameW(hprocess: Handle, baseofdll: ULong, name: Pcwstr, symbol: MutPtr): Bool

public expect fun symGetTypeInfo(hprocess: Handle, modbase: ULong, typeid: UInt, gettype: ImagehlpSymbolTypeInfo, pinfo: MutPtr): Bool

public expect fun symGetTypeInfoEx(hprocess: Handle, modbase: ULong, params: MutPtr): Bool

public expect fun symGetUnwindInfo(hprocess: Handle, address: ULong, buffer: MutPtr, size: MutPtr): Bool

public expect fun symInitialize(hprocess: Handle, usersearchpath: Pcstr, finvadeprocess: Bool): Bool

public expect fun symInitializeW(hprocess: Handle, usersearchpath: Pcwstr, finvadeprocess: Bool): Bool

public expect fun symLoadModule64(hprocess: Handle, hfile: Handle, imagename: Pcstr, modulename: Pcstr, baseofdll: ULong, sizeofdll: UInt): ULong

public expect fun symLoadModuleEx(hprocess: Handle, hfile: Handle, imagename: Pcstr, modulename: Pcstr, baseofdll: ULong, dllsize: UInt, data: ConstPtr, flags: SymLoadFlags): ULong

public expect fun symLoadModuleExW(hprocess: Handle, hfile: Handle, imagename: Pcwstr, modulename: Pcwstr, baseofdll: ULong, dllsize: UInt, data: ConstPtr, flags: SymLoadFlags): ULong

public expect fun symMatchFileName(filename: Pcstr, match: Pcstr, filenamestop: MutPtr, matchstop: MutPtr): Bool

public expect fun symMatchFileNameW(filename: Pcwstr, match: Pcwstr, filenamestop: MutPtr, matchstop: MutPtr): Bool

public expect fun symMatchString(string: Pcstr, expression: Pcstr, fcase: Bool): Bool

public expect fun symMatchStringA(string: Pcstr, expression: Pcstr, fcase: Bool): Bool

public expect fun symMatchStringW(string: Pcwstr, expression: Pcwstr, fcase: Bool): Bool

public expect fun symNext(hprocess: Handle, si: MutPtr): Bool

public expect fun symNextW(hprocess: Handle, siw: MutPtr): Bool

public expect fun symPrev(hprocess: Handle, si: MutPtr): Bool

public expect fun symPrevW(hprocess: Handle, siw: MutPtr): Bool

public expect fun symQueryInlineTrace(hprocess: Handle, startaddress: ULong, startcontext: UInt, startretaddress: ULong, curaddress: ULong, curcontext: MutPtr, curframeindex: MutPtr): Bool

public expect fun symRefreshModuleList(hprocess: Handle): Bool

public expect fun symRegisterCallback64(hprocess: Handle, callbackfunction: PsymbolRegisteredCallback64, usercontext: ULong): Bool

public expect fun symRegisterCallbackW64(hprocess: Handle, callbackfunction: PsymbolRegisteredCallback64, usercontext: ULong): Bool

public expect fun symRegisterFunctionEntryCallback64(hprocess: Handle, callbackfunction: PsymbolFuncentryCallback64, usercontext: ULong): Bool

public expect fun symSearch(hprocess: Handle, baseofdll: ULong, index: UInt, symtag: UInt, mask: Pcstr, address: ULong, enumsymbolscallback: PsymEnumeratesymbolsCallback, usercontext: ConstPtr, options: UInt): Bool

public expect fun symSearchW(hprocess: Handle, baseofdll: ULong, index: UInt, symtag: UInt, mask: Pcwstr, address: ULong, enumsymbolscallback: PsymEnumeratesymbolsCallbackw, usercontext: ConstPtr, options: UInt): Bool

public expect fun symSetContext(hprocess: Handle, stackframe: ConstPtr, context: ConstPtr): Bool

public expect fun symSetExtendedOption(option: ImagehlpExtendedOptions, value: Bool): Bool

public expect fun symSetHomeDirectory(hprocess: Handle, dir: Pcstr): Pstr

public expect fun symSetHomeDirectoryW(hprocess: Handle, dir: Pcwstr): Pwstr

public expect fun symSetOptions(symoptions: UInt): UInt

public expect fun symSetParentWindow(hwnd: Hwnd): Bool

public expect fun symSetScopeFromAddr(hprocess: Handle, address: ULong): Bool

public expect fun symSetScopeFromIndex(hprocess: Handle, baseofdll: ULong, index: UInt): Bool

public expect fun symSetScopeFromInlineContext(hprocess: Handle, address: ULong, inlinecontext: UInt): Bool

public expect fun symSetSearchPath(hprocess: Handle, searchpatha: Pcstr): Bool

public expect fun symSetSearchPathW(hprocess: Handle, searchpatha: Pcwstr): Bool

public expect fun symSrvDeltaName(hprocess: Handle, sympath: Pcstr, type: Pcstr, file1: Pcstr, file2: Pcstr): Pcstr

public expect fun symSrvDeltaNameW(hprocess: Handle, sympath: Pcwstr, type: Pcwstr, file1: Pcwstr, file2: Pcwstr): Pcwstr

public expect fun symSrvGetFileIndexInfo(file: Pcstr, info: MutPtr, flags: UInt): Bool

public expect fun symSrvGetFileIndexInfoW(file: Pcwstr, info: MutPtr, flags: UInt): Bool

public expect fun symSrvGetFileIndexString(hprocess: Handle, srvpath: Pcstr, file: Pcstr, index: Pstr, size: ULong, flags: UInt): Bool

public expect fun symSrvGetFileIndexStringW(hprocess: Handle, srvpath: Pcwstr, file: Pcwstr, index: Pwstr, size: ULong, flags: UInt): Bool

public expect fun symSrvGetFileIndexes(file: Pcstr, id: MutPtr, val1: MutPtr, val2: MutPtr, flags: UInt): Bool

public expect fun symSrvGetFileIndexesW(file: Pcwstr, id: MutPtr, val1: MutPtr, val2: MutPtr, flags: UInt): Bool

public expect fun symSrvGetSupplement(hprocess: Handle, sympath: Pcstr, node: Pcstr, file: Pcstr): Pcstr

public expect fun symSrvGetSupplementW(hprocess: Handle, sympath: Pcwstr, node: Pcwstr, file: Pcwstr): Pcwstr

public expect fun symSrvIsStore(hprocess: Handle, path: Pcstr): Bool

public expect fun symSrvIsStoreW(hprocess: Handle, path: Pcwstr): Bool

public expect fun symSrvStoreFile(hprocess: Handle, srvpath: Pcstr, file: Pcstr, flags: SymSrvStoreFileFlags): Pcstr

public expect fun symSrvStoreFileW(hprocess: Handle, srvpath: Pcwstr, file: Pcwstr, flags: SymSrvStoreFileFlags): Pcwstr

public expect fun symSrvStoreSupplement(hprocess: Handle, srvpath: Pcstr, node: Pcstr, file: Pcstr, flags: UInt): Pcstr

public expect fun symSrvStoreSupplementW(hprocess: Handle, sympath: Pcwstr, node: Pcwstr, file: Pcwstr, flags: UInt): Pcwstr

public expect fun symUnDName64(sym: ConstPtr, undecname: Pstr, undecnamelength: UInt): Bool

public expect fun symUnloadModule64(hprocess: Handle, baseofdll: ULong): Bool

public expect fun terminateProcessOnMemoryExhaustion(failedallocationsize: ULong)

public expect fun touchFileTimes(filehandle: Handle, psystemtime: ConstPtr): Bool

public expect fun unDecorateSymbolName(name: Pcstr, outputstring: Pstr, maxstringlength: UInt, flags: UInt): UInt

public expect fun unDecorateSymbolNameW(name: Pcwstr, outputstring: Pwstr, maxstringlength: UInt, flags: UInt): UInt

public expect fun unMapAndLoad(loadedimage: MutPtr): Bool

public expect fun unhandledExceptionFilter(exceptioninfo: ConstPtr): Int

public expect fun updateDebugInfoFile(imagefilename: Pcstr, symbolpath: Pcstr, debugfilepath: Pstr, ntheaders: ConstPtr): Bool

public expect fun updateDebugInfoFileEx(imagefilename: Pcstr, symbolpath: Pcstr, debugfilepath: Pstr, ntheaders: ConstPtr, oldchecksum: UInt): Bool

public expect fun waitForDebugEvent(lpdebugevent: MutPtr, dwmilliseconds: UInt): Bool

public expect fun waitForDebugEventEx(lpdebugevent: MutPtr, dwmilliseconds: UInt): Bool

public expect fun wow64GetThreadContext(hthread: Handle, lpcontext: MutPtr): Bool

public expect fun wow64GetThreadSelectorEntry(hthread: Handle, dwselector: UInt, lpselectorentry: MutPtr): Bool

public expect fun wow64SetThreadContext(hthread: Handle, lpcontext: ConstPtr): Bool

public expect fun writeProcessMemory(hprocess: Handle, lpbaseaddress: ConstPtr, lpbuffer: ConstPtr, nsize: ULong, lpnumberofbyteswritten: MutPtr): Bool
