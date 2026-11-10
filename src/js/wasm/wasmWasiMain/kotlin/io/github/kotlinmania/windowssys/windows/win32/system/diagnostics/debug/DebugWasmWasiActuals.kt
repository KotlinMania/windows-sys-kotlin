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

public actual fun addVectoredContinueHandler(first: UInt, handler: PvectoredExceptionHandler): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun addVectoredExceptionHandler(first: UInt, handler: PvectoredExceptionHandler): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun beep(dwfreq: UInt, dwduration: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bindImage(imagename: Pcstr, dllpath: Pcstr, symbolpath: Pcstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bindImageEx(flags: UInt, imagename: Pcstr, dllpath: Pcstr, symbolpath: Pcstr, statusroutine: PimagehlpStatusRoutine): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun checkRemoteDebuggerPresent(hprocess: Handle, pbdebuggerpresent: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun checkSumMappedFile(baseaddress: COpaquePointer?, filelength: UInt, headersum: COpaquePointer?, checksum: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun closeThreadWaitChainSession(wcthandle: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun continueDebugEvent(dwprocessid: UInt, dwthreadid: UInt, dwcontinuestatus: Ntstatus): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun copyContext(destination: COpaquePointer?, contextflags: ContextFlags, source: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dbgHelpCreateUserDump(filename: Pcstr, callback: PdbghelpCreateUserDumpCallback, userdata: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dbgHelpCreateUserDumpW(filename: Pcwstr, callback: PdbghelpCreateUserDumpCallback, userdata: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun debugActiveProcess(dwprocessid: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun debugActiveProcessStop(dwprocessid: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun debugBreak(): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun debugBreakProcess(process: Handle): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun debugSetProcessKillOnExit(killonexit: Bool): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun decodePointer(ptr: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun decodeRemotePointer(processhandle: Handle, ptr: COpaquePointer?, decodedptr: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun decodeSystemPointer(ptr: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun encodePointer(ptr: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun encodeRemotePointer(processhandle: Handle, ptr: COpaquePointer?, encodedptr: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun encodeSystemPointer(ptr: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun enumDirTree(hprocess: Handle, rootpath: Pcstr, inputpathname: Pcstr, outputpathbuffer: Pstr, cb: PenumdirtreeCallback, data: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun enumDirTreeW(hprocess: Handle, rootpath: Pcwstr, inputpathname: Pcwstr, outputpathbuffer: Pwstr, cb: PenumdirtreeCallbackw, data: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun enumerateLoadedModules64(hprocess: Handle, enumloadedmodulescallback: PenumloadedModulesCallback64, usercontext: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun enumerateLoadedModulesEx(hprocess: Handle, enumloadedmodulescallback: PenumloadedModulesCallback64, usercontext: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun enumerateLoadedModulesExW(hprocess: Handle, enumloadedmodulescallback: PenumloadedModulesCallbackw64, usercontext: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun enumerateLoadedModulesW64(hprocess: Handle, enumloadedmodulescallback: PenumloadedModulesCallbackw64, usercontext: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fatalAppExitA(uaction: UInt, lpmessagetext: Pcstr): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fatalAppExitW(uaction: UInt, lpmessagetext: Pcwstr): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fatalExit(exitcode: Int): Nothing =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun findDebugInfoFile(filename: Pcstr, symbolpath: Pcstr, debugfilepath: Pstr): Handle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun findDebugInfoFileEx(filename: Pcstr, symbolpath: Pcstr, debugfilepath: Pstr, callback: PfindDebugFileCallback, callerdata: COpaquePointer?): Handle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun findDebugInfoFileExW(filename: Pcwstr, symbolpath: Pcwstr, debugfilepath: Pwstr, callback: PfindDebugFileCallbackw, callerdata: COpaquePointer?): Handle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun findExecutableImage(filename: Pcstr, symbolpath: Pcstr, imagefilepath: Pstr): Handle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun findExecutableImageEx(filename: Pcstr, symbolpath: Pcstr, imagefilepath: Pstr, callback: PfindExeFileCallback, callerdata: COpaquePointer?): Handle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun findExecutableImageExW(filename: Pcwstr, symbolpath: Pcwstr, imagefilepath: Pwstr, callback: PfindExeFileCallbackw, callerdata: COpaquePointer?): Handle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun findFileInPath(hprocess: Handle, searchpatha: Pcstr, filename: Pcstr, id: COpaquePointer?, two: UInt, three: UInt, flags: UInt, filepath: Pstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun findFileInSearchPath(hprocess: Handle, searchpatha: Pcstr, filename: Pcstr, one: UInt, two: UInt, three: UInt, filepath: Pstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun flushInstructionCache(hprocess: Handle, lpbaseaddress: COpaquePointer?, dwsize: ULong): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun formatMessageA(dwflags: FormatMessageOptions, lpsource: COpaquePointer?, dwmessageid: UInt, dwlanguageid: UInt, lpbuffer: Pstr, nsize: UInt, arguments: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun formatMessageW(dwflags: FormatMessageOptions, lpsource: COpaquePointer?, dwmessageid: UInt, dwlanguageid: UInt, lpbuffer: Pwstr, nsize: UInt, arguments: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getEnabledXStateFeatures(): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getErrorMode(): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getImageConfigInformation(loadedimage: COpaquePointer?, imageconfiginformation: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getImageUnusedHeaderBytes(loadedimage: COpaquePointer?, sizeunusedheaderbytes: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getSymLoadError(): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getThreadContext(hthread: Handle, lpcontext: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getThreadErrorMode(): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getThreadSelectorEntry(hthread: Handle, dwselector: UInt, lpselectorentry: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getThreadWaitChain(wcthandle: COpaquePointer?, context: ULong, flags: WaitChainThreadOptions, threadid: UInt, nodecount: COpaquePointer?, nodeinfoarray: COpaquePointer?, iscycle: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getTimestampForLoadedLibrary(module: Hmodule): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getXStateFeaturesMask(context: COpaquePointer?, featuremask: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun imageAddCertificate(filehandle: Handle, certificate: COpaquePointer?, index: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun imageDirectoryEntryToData(base: COpaquePointer?, mappedasimage: Boolean, directoryentry: ImageDirectoryEntry, size: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun imageDirectoryEntryToDataEx(base: COpaquePointer?, mappedasimage: Boolean, directoryentry: ImageDirectoryEntry, size: COpaquePointer?, foundheader: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun imageEnumerateCertificates(filehandle: Handle, typefilter: UShort, certificatecount: COpaquePointer?, indices: COpaquePointer?, indexcount: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun imageGetCertificateData(filehandle: Handle, certificateindex: UInt, certificate: COpaquePointer?, requiredlength: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun imageGetCertificateHeader(filehandle: Handle, certificateindex: UInt, certificateheader: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun imageGetDigestStream(filehandle: Handle, digestlevel: UInt, digestfunction: DigestFunction, digesthandle: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun imageLoad(dllname: Pcstr, dllpath: Pcstr): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun imageNtHeader(base: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun imageRemoveCertificate(filehandle: Handle, index: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun imageRvaToSection(ntheaders: COpaquePointer?, base: COpaquePointer?, rva: UInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun imageRvaToVa(ntheaders: COpaquePointer?, base: COpaquePointer?, rva: UInt, lastrvasection: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun imageUnload(loadedimage: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun imagehlpApiVersion(): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun imagehlpApiVersionEx(appversion: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun initializeContext(buffer: COpaquePointer?, contextflags: ContextFlags, context: COpaquePointer?, contextlength: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun initializeContext2(buffer: COpaquePointer?, contextflags: ContextFlags, context: COpaquePointer?, contextlength: COpaquePointer?, xstatecompactionmask: ULong): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isDebuggerPresent(): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun locateXStateFeature(context: COpaquePointer?, featureid: UInt, length: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun makeSureDirectoryPathExists(dirpath: Pcstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mapAndLoad(imagename: Pcstr, dllpath: Pcstr, loadedimage: COpaquePointer?, dotdll: Bool, readonly: Bool): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mapFileAndCheckSumA(filename: Pcstr, headersum: COpaquePointer?, checksum: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mapFileAndCheckSumW(filename: Pcwstr, headersum: COpaquePointer?, checksum: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun messageBeep(utype: MessageboxStyle): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun miniDumpReadDumpStream(baseofdump: COpaquePointer?, streamnumber: UInt, dir: COpaquePointer?, streampointer: COpaquePointer?, streamsize: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun miniDumpWriteDump(hprocess: Handle, processid: UInt, hfile: Handle, dumptype: MinidumpType, exceptionparam: COpaquePointer?, userstreamparam: COpaquePointer?, callbackparam: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun openThreadWaitChainSession(flags: OpenThreadWaitChainSessionFlags, callback: Pwaitchaincallback): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun outputDebugStringA(lpoutputstring: Pcstr): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun outputDebugStringW(lpoutputstring: Pcwstr): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun raiseException(dwexceptioncode: UInt, dwexceptionflags: UInt, nnumberofarguments: UInt, lparguments: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun raiseFailFastException(pexceptionrecord: COpaquePointer?, pcontextrecord: COpaquePointer?, dwflags: UInt): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rangeMapAddPeImageSections(rmaphandle: COpaquePointer?, imagename: Pcwstr, mappedimage: COpaquePointer?, mappingbytes: UInt, imagebase: ULong, usertag: ULong, mappingflags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rangeMapCreate(): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rangeMapFree(rmaphandle: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rangeMapRead(rmaphandle: COpaquePointer?, offset: ULong, buffer: COpaquePointer?, requestbytes: UInt, flags: UInt, donebytes: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rangeMapRemove(rmaphandle: COpaquePointer?, usertag: ULong): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rangeMapWrite(rmaphandle: COpaquePointer?, offset: ULong, buffer: COpaquePointer?, requestbytes: UInt, flags: UInt, donebytes: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun reBaseImage(currentimagename: Pcstr, symbolpath: Pcstr, frebase: Bool, frebasesysfileok: Bool, fgoingdown: Bool, checkimagesize: UInt, oldimagesize: COpaquePointer?, oldimagebase: COpaquePointer?, newimagesize: COpaquePointer?, newimagebase: COpaquePointer?, timestamp: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun reBaseImage64(currentimagename: Pcstr, symbolpath: Pcstr, frebase: Bool, frebasesysfileok: Bool, fgoingdown: Bool, checkimagesize: UInt, oldimagesize: COpaquePointer?, oldimagebase: COpaquePointer?, newimagesize: COpaquePointer?, newimagebase: COpaquePointer?, timestamp: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun readProcessMemory(hprocess: Handle, lpbaseaddress: COpaquePointer?, lpbuffer: COpaquePointer?, nsize: ULong, lpnumberofbytesread: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun registerWaitChainCOMCallback(callstatecallback: Pcogetcallstate, activationstatecallback: Pcogetactivationstate): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun removeInvalidModuleList(hprocess: Handle): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun removeVectoredContinueHandler(handle: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun removeVectoredExceptionHandler(handle: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun reportSymbolLoadSummary(hprocess: Handle, ploadmodule: Pcwstr, psymboldata: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlAddFunctionTable(functiontable: COpaquePointer?, entrycount: UInt, baseaddress: ULong): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlAddGrowableFunctionTable(dynamictable: COpaquePointer?, functiontable: COpaquePointer?, entrycount: UInt, maximumentrycount: UInt, rangebase: ULong, rangeend: ULong): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlCaptureContext(contextrecord: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlCaptureContext2(contextrecord: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlCaptureStackBackTrace(framestoskip: UInt, framestocapture: UInt, backtrace: COpaquePointer?, backtracehash: COpaquePointer?): UShort =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlDeleteFunctionTable(functiontable: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlDeleteGrowableFunctionTable(dynamictable: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlGrowFunctionTable(dynamictable: COpaquePointer?, newentrycount: UInt): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlInstallFunctionTableCallback(tableidentifier: ULong, baseaddress: ULong, length: UInt, callback: PgetRuntimeFunctionCallback, context: COpaquePointer?, outofprocesscallbackdll: Pcwstr): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlLookupFunctionEntry(controlpc: ULong, imagebase: COpaquePointer?, historytable: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlPcToFileHeader(pcvalue: COpaquePointer?, baseofimage: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlRaiseException(exceptionrecord: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlRestoreContext(contextrecord: COpaquePointer?, exceptionrecord: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlUnwind(targetframe: COpaquePointer?, targetip: COpaquePointer?, exceptionrecord: COpaquePointer?, returnvalue: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlUnwindEx(targetframe: COpaquePointer?, targetip: COpaquePointer?, exceptionrecord: COpaquePointer?, returnvalue: COpaquePointer?, contextrecord: COpaquePointer?, historytable: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rtlVirtualUnwind(handlertype: RtlVirtualUnwindHandlerType, imagebase: ULong, controlpc: ULong, functionentry: COpaquePointer?, contextrecord: COpaquePointer?, handlerdata: COpaquePointer?, establisherframe: COpaquePointer?, contextpointers: COpaquePointer?): ExceptionRoutine =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun searchTreeForFile(rootpath: Pcstr, inputpathname: Pcstr, outputpathbuffer: Pstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun searchTreeForFileW(rootpath: Pcwstr, inputpathname: Pcwstr, outputpathbuffer: Pwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setCheckUserInterruptShared(lpstartaddress: LpcallBackUserInterruptRoutine): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setErrorMode(umode: ThreadErrorMode): ThreadErrorMode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setImageConfigInformation(loadedimage: COpaquePointer?, imageconfiginformation: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setSymLoadError(error: UInt): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setThreadContext(hthread: Handle, lpcontext: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setThreadErrorMode(dwnewmode: ThreadErrorMode, lpoldmode: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setUnhandledExceptionFilter(lptoplevelexceptionfilter: LptopLevelExceptionFilter): LptopLevelExceptionFilter =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setXStateFeaturesMask(context: COpaquePointer?, featuremask: ULong): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun stackWalk2(machinetype: UInt, hprocess: Handle, hthread: Handle, stackframe: COpaquePointer?, contextrecord: COpaquePointer?, readmemoryroutine: PreadProcessMemoryRoutine64, functiontableaccessroutine: PfunctionTableAccessRoutine64, getmodulebaseroutine: PgetModuleBaseRoutine64, translateaddress: PtranslateAddressRoutine64, gettargetattributevalue: PgetTargetAttributeValue64, flags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun stackWalk64(machinetype: UInt, hprocess: Handle, hthread: Handle, stackframe: COpaquePointer?, contextrecord: COpaquePointer?, readmemoryroutine: PreadProcessMemoryRoutine64, functiontableaccessroutine: PfunctionTableAccessRoutine64, getmodulebaseroutine: PgetModuleBaseRoutine64, translateaddress: PtranslateAddressRoutine64): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun stackWalkEx(machinetype: UInt, hprocess: Handle, hthread: Handle, stackframe: COpaquePointer?, contextrecord: COpaquePointer?, readmemoryroutine: PreadProcessMemoryRoutine64, functiontableaccessroutine: PfunctionTableAccessRoutine64, getmodulebaseroutine: PgetModuleBaseRoutine64, translateaddress: PtranslateAddressRoutine64, flags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symAddSourceStream(hprocess: Handle, base: ULong, streamfile: Pcstr, buffer: COpaquePointer?, size: ULong): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symAddSourceStreamA(hprocess: Handle, base: ULong, streamfile: Pcstr, buffer: COpaquePointer?, size: ULong): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symAddSourceStreamW(hprocess: Handle, base: ULong, filespec: Pcwstr, buffer: COpaquePointer?, size: ULong): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symAddSymbol(hprocess: Handle, baseofdll: ULong, name: Pcstr, address: ULong, size: UInt, flags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symAddSymbolW(hprocess: Handle, baseofdll: ULong, name: Pcwstr, address: ULong, size: UInt, flags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symAddrIncludeInlineTrace(hprocess: Handle, address: ULong): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symCleanup(hprocess: Handle): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symCompareInlineTrace(hprocess: Handle, address1: ULong, inlinecontext1: UInt, retaddress1: ULong, address2: ULong, retaddress2: ULong): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symDeleteSymbol(hprocess: Handle, baseofdll: ULong, name: Pcstr, address: ULong, flags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symDeleteSymbolW(hprocess: Handle, baseofdll: ULong, name: Pcwstr, address: ULong, flags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symEnumLines(hprocess: Handle, base: ULong, obj: Pcstr, file: Pcstr, enumlinescallback: PsymEnumlinesCallback, usercontext: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symEnumLinesW(hprocess: Handle, base: ULong, obj: Pcwstr, file: Pcwstr, enumlinescallback: PsymEnumlinesCallbackw, usercontext: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symEnumProcesses(enumprocessescallback: PsymEnumprocessesCallback, usercontext: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symEnumSourceFileTokens(hprocess: Handle, base: ULong, callback: Penumsourcefiletokenscallback): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symEnumSourceFiles(hprocess: Handle, modbase: ULong, mask: Pcstr, cbsrcfiles: PsymEnumsourcefilesCallback, usercontext: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symEnumSourceFilesW(hprocess: Handle, modbase: ULong, mask: Pcwstr, cbsrcfiles: PsymEnumsourcefilesCallbackw, usercontext: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symEnumSourceLines(hprocess: Handle, base: ULong, obj: Pcstr, file: Pcstr, line: UInt, flags: UInt, enumlinescallback: PsymEnumlinesCallback, usercontext: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symEnumSourceLinesW(hprocess: Handle, base: ULong, obj: Pcwstr, file: Pcwstr, line: UInt, flags: UInt, enumlinescallback: PsymEnumlinesCallbackw, usercontext: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symEnumSym(hprocess: Handle, baseofdll: ULong, enumsymbolscallback: PsymEnumeratesymbolsCallback, usercontext: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symEnumSymbols(hprocess: Handle, baseofdll: ULong, mask: Pcstr, enumsymbolscallback: PsymEnumeratesymbolsCallback, usercontext: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symEnumSymbolsEx(hprocess: Handle, baseofdll: ULong, mask: Pcstr, enumsymbolscallback: PsymEnumeratesymbolsCallback, usercontext: COpaquePointer?, options: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symEnumSymbolsExW(hprocess: Handle, baseofdll: ULong, mask: Pcwstr, enumsymbolscallback: PsymEnumeratesymbolsCallbackw, usercontext: COpaquePointer?, options: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symEnumSymbolsForAddr(hprocess: Handle, address: ULong, enumsymbolscallback: PsymEnumeratesymbolsCallback, usercontext: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symEnumSymbolsForAddrW(hprocess: Handle, address: ULong, enumsymbolscallback: PsymEnumeratesymbolsCallbackw, usercontext: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symEnumSymbolsW(hprocess: Handle, baseofdll: ULong, mask: Pcwstr, enumsymbolscallback: PsymEnumeratesymbolsCallbackw, usercontext: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symEnumTypes(hprocess: Handle, baseofdll: ULong, enumsymbolscallback: PsymEnumeratesymbolsCallback, usercontext: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symEnumTypesByName(hprocess: Handle, baseofdll: ULong, mask: Pcstr, enumsymbolscallback: PsymEnumeratesymbolsCallback, usercontext: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symEnumTypesByNameW(hprocess: Handle, baseofdll: ULong, mask: Pcwstr, enumsymbolscallback: PsymEnumeratesymbolsCallbackw, usercontext: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symEnumTypesW(hprocess: Handle, baseofdll: ULong, enumsymbolscallback: PsymEnumeratesymbolsCallbackw, usercontext: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symEnumerateModules64(hprocess: Handle, enummodulescallback: PsymEnummodulesCallback64, usercontext: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symEnumerateModulesW64(hprocess: Handle, enummodulescallback: PsymEnummodulesCallbackw64, usercontext: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symEnumerateSymbols64(hprocess: Handle, baseofdll: ULong, enumsymbolscallback: PsymEnumsymbolsCallback64, usercontext: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symEnumerateSymbolsW64(hprocess: Handle, baseofdll: ULong, enumsymbolscallback: PsymEnumsymbolsCallback64w, usercontext: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symFindDebugInfoFile(hprocess: Handle, filename: Pcstr, debugfilepath: Pstr, callback: PfindDebugFileCallback, callerdata: COpaquePointer?): Handle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symFindDebugInfoFileW(hprocess: Handle, filename: Pcwstr, debugfilepath: Pwstr, callback: PfindDebugFileCallbackw, callerdata: COpaquePointer?): Handle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symFindExecutableImage(hprocess: Handle, filename: Pcstr, imagefilepath: Pstr, callback: PfindExeFileCallback, callerdata: COpaquePointer?): Handle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symFindExecutableImageW(hprocess: Handle, filename: Pcwstr, imagefilepath: Pwstr, callback: PfindExeFileCallbackw, callerdata: COpaquePointer?): Handle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symFindFileInPath(hprocess: Handle, searchpatha: Pcstr, filename: Pcstr, id: COpaquePointer?, two: UInt, three: UInt, flags: SymFindIdOption, foundfile: Pstr, callback: Pfindfileinpathcallback, context: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symFindFileInPathW(hprocess: Handle, searchpatha: Pcwstr, filename: Pcwstr, id: COpaquePointer?, two: UInt, three: UInt, flags: SymFindIdOption, foundfile: Pwstr, callback: Pfindfileinpathcallbackw, context: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symFromAddr(hprocess: Handle, address: ULong, displacement: COpaquePointer?, symbol: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symFromAddrW(hprocess: Handle, address: ULong, displacement: COpaquePointer?, symbol: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symFromIndex(hprocess: Handle, baseofdll: ULong, index: UInt, symbol: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symFromIndexW(hprocess: Handle, baseofdll: ULong, index: UInt, symbol: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symFromInlineContext(hprocess: Handle, address: ULong, inlinecontext: UInt, displacement: COpaquePointer?, symbol: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symFromInlineContextW(hprocess: Handle, address: ULong, inlinecontext: UInt, displacement: COpaquePointer?, symbol: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symFromName(hprocess: Handle, name: Pcstr, symbol: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symFromNameW(hprocess: Handle, name: Pcwstr, symbol: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symFromToken(hprocess: Handle, base: ULong, token: UInt, symbol: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symFromTokenW(hprocess: Handle, base: ULong, token: UInt, symbol: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symFunctionTableAccess64(hprocess: Handle, addrbase: ULong): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symFunctionTableAccess64AccessRoutines(hprocess: Handle, addrbase: ULong, readmemoryroutine: PreadProcessMemoryRoutine64, getmodulebaseroutine: PgetModuleBaseRoutine64): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symGetExtendedOption(option: ImagehlpExtendedOptions): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symGetFileLineOffsets64(hprocess: Handle, modulename: Pcstr, filename: Pcstr, buffer: COpaquePointer?, bufferlines: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symGetHomeDirectory(type: UInt, dir: Pstr, size: ULong): Pstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symGetHomeDirectoryW(type: UInt, dir: Pwstr, size: ULong): Pwstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symGetLineFromAddr64(hprocess: Handle, qwaddr: ULong, pdwdisplacement: COpaquePointer?, line64: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symGetLineFromAddrW64(hprocess: Handle, dwaddr: ULong, pdwdisplacement: COpaquePointer?, line: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symGetLineFromInlineContext(hprocess: Handle, qwaddr: ULong, inlinecontext: UInt, qwmodulebaseaddress: ULong, pdwdisplacement: COpaquePointer?, line64: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symGetLineFromInlineContextW(hprocess: Handle, dwaddr: ULong, inlinecontext: UInt, qwmodulebaseaddress: ULong, pdwdisplacement: COpaquePointer?, line: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symGetLineFromName64(hprocess: Handle, modulename: Pcstr, filename: Pcstr, dwlinenumber: UInt, pldisplacement: COpaquePointer?, line: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symGetLineFromNameW64(hprocess: Handle, modulename: Pcwstr, filename: Pcwstr, dwlinenumber: UInt, pldisplacement: COpaquePointer?, line: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symGetLineNext64(hprocess: Handle, line: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symGetLineNextW64(hprocess: Handle, line: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symGetLinePrev64(hprocess: Handle, line: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symGetLinePrevW64(hprocess: Handle, line: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symGetModuleBase64(hprocess: Handle, qwaddr: ULong): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symGetModuleInfo64(hprocess: Handle, qwaddr: ULong, moduleinfo: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symGetModuleInfoW64(hprocess: Handle, qwaddr: ULong, moduleinfo: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symGetOmaps(hprocess: Handle, baseofdll: ULong, omapto: COpaquePointer?, comapto: COpaquePointer?, omapfrom: COpaquePointer?, comapfrom: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symGetOptions(): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symGetScope(hprocess: Handle, baseofdll: ULong, index: UInt, symbol: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symGetScopeW(hprocess: Handle, baseofdll: ULong, index: UInt, symbol: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symGetSearchPath(hprocess: Handle, searchpatha: Pstr, searchpathlength: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symGetSearchPathW(hprocess: Handle, searchpatha: Pwstr, searchpathlength: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symGetSourceFile(hprocess: Handle, base: ULong, params: Pcstr, filespec: Pcstr, filepath: Pstr, size: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symGetSourceFileChecksum(hprocess: Handle, base: ULong, filespec: Pcstr, pchecksumtype: COpaquePointer?, pchecksum: COpaquePointer?, checksumsize: UInt, pactualbyteswritten: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symGetSourceFileChecksumW(hprocess: Handle, base: ULong, filespec: Pcwstr, pchecksumtype: COpaquePointer?, pchecksum: COpaquePointer?, checksumsize: UInt, pactualbyteswritten: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symGetSourceFileFromToken(hprocess: Handle, token: COpaquePointer?, params: Pcstr, filepath: Pstr, size: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symGetSourceFileFromTokenByTokenName(hprocess: Handle, token: COpaquePointer?, tokenname: Pcstr, params: Pcstr, filepath: Pstr, size: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symGetSourceFileFromTokenByTokenNameW(hprocess: Handle, token: COpaquePointer?, tokenname: Pcwstr, params: Pcwstr, filepath: Pwstr, size: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symGetSourceFileFromTokenW(hprocess: Handle, token: COpaquePointer?, params: Pcwstr, filepath: Pwstr, size: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symGetSourceFileToken(hprocess: Handle, base: ULong, filespec: Pcstr, token: COpaquePointer?, size: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symGetSourceFileTokenByTokenName(hprocess: Handle, base: ULong, filespec: Pcstr, tokenname: Pcstr, tokenparameters: Pcstr, token: COpaquePointer?, size: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symGetSourceFileTokenByTokenNameW(hprocess: Handle, base: ULong, filespec: Pcwstr, tokenname: Pcwstr, tokenparameters: Pcwstr, token: COpaquePointer?, size: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symGetSourceFileTokenW(hprocess: Handle, base: ULong, filespec: Pcwstr, token: COpaquePointer?, size: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symGetSourceFileW(hprocess: Handle, base: ULong, params: Pcwstr, filespec: Pcwstr, filepath: Pwstr, size: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symGetSourceVarFromToken(hprocess: Handle, token: COpaquePointer?, params: Pcstr, varname: Pcstr, value: Pstr, size: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symGetSourceVarFromTokenW(hprocess: Handle, token: COpaquePointer?, params: Pcwstr, varname: Pcwstr, value: Pwstr, size: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symGetSymFromAddr64(hprocess: Handle, qwaddr: ULong, pdwdisplacement: COpaquePointer?, symbol: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symGetSymFromName64(hprocess: Handle, name: Pcstr, symbol: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symGetSymNext64(hprocess: Handle, symbol: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symGetSymPrev64(hprocess: Handle, symbol: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symGetSymbolFile(hprocess: Handle, sympath: Pcstr, imagefile: Pcstr, type: UInt, symbolfile: Pstr, csymbolfile: ULong, dbgfile: Pstr, cdbgfile: ULong): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symGetSymbolFileW(hprocess: Handle, sympath: Pcwstr, imagefile: Pcwstr, type: UInt, symbolfile: Pwstr, csymbolfile: ULong, dbgfile: Pwstr, cdbgfile: ULong): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symGetTypeFromName(hprocess: Handle, baseofdll: ULong, name: Pcstr, symbol: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symGetTypeFromNameW(hprocess: Handle, baseofdll: ULong, name: Pcwstr, symbol: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symGetTypeInfo(hprocess: Handle, modbase: ULong, typeid: UInt, gettype: ImagehlpSymbolTypeInfo, pinfo: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symGetTypeInfoEx(hprocess: Handle, modbase: ULong, params: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symGetUnwindInfo(hprocess: Handle, address: ULong, buffer: COpaquePointer?, size: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symInitialize(hprocess: Handle, usersearchpath: Pcstr, finvadeprocess: Bool): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symInitializeW(hprocess: Handle, usersearchpath: Pcwstr, finvadeprocess: Bool): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symLoadModule64(hprocess: Handle, hfile: Handle, imagename: Pcstr, modulename: Pcstr, baseofdll: ULong, sizeofdll: UInt): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symLoadModuleEx(hprocess: Handle, hfile: Handle, imagename: Pcstr, modulename: Pcstr, baseofdll: ULong, dllsize: UInt, data: COpaquePointer?, flags: SymLoadFlags): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symLoadModuleExW(hprocess: Handle, hfile: Handle, imagename: Pcwstr, modulename: Pcwstr, baseofdll: ULong, dllsize: UInt, data: COpaquePointer?, flags: SymLoadFlags): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symMatchFileName(filename: Pcstr, match: Pcstr, filenamestop: COpaquePointer?, matchstop: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symMatchFileNameW(filename: Pcwstr, match: Pcwstr, filenamestop: COpaquePointer?, matchstop: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symMatchString(string: Pcstr, expression: Pcstr, fcase: Bool): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symMatchStringA(string: Pcstr, expression: Pcstr, fcase: Bool): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symMatchStringW(string: Pcwstr, expression: Pcwstr, fcase: Bool): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symNext(hprocess: Handle, si: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symNextW(hprocess: Handle, siw: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symPrev(hprocess: Handle, si: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symPrevW(hprocess: Handle, siw: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symQueryInlineTrace(hprocess: Handle, startaddress: ULong, startcontext: UInt, startretaddress: ULong, curaddress: ULong, curcontext: COpaquePointer?, curframeindex: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symRefreshModuleList(hprocess: Handle): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symRegisterCallback64(hprocess: Handle, callbackfunction: PsymbolRegisteredCallback64, usercontext: ULong): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symRegisterCallbackW64(hprocess: Handle, callbackfunction: PsymbolRegisteredCallback64, usercontext: ULong): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symRegisterFunctionEntryCallback64(hprocess: Handle, callbackfunction: PsymbolFuncentryCallback64, usercontext: ULong): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symSearch(hprocess: Handle, baseofdll: ULong, index: UInt, symtag: UInt, mask: Pcstr, address: ULong, enumsymbolscallback: PsymEnumeratesymbolsCallback, usercontext: COpaquePointer?, options: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symSearchW(hprocess: Handle, baseofdll: ULong, index: UInt, symtag: UInt, mask: Pcwstr, address: ULong, enumsymbolscallback: PsymEnumeratesymbolsCallbackw, usercontext: COpaquePointer?, options: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symSetContext(hprocess: Handle, stackframe: COpaquePointer?, context: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symSetExtendedOption(option: ImagehlpExtendedOptions, value: Bool): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symSetHomeDirectory(hprocess: Handle, dir: Pcstr): Pstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symSetHomeDirectoryW(hprocess: Handle, dir: Pcwstr): Pwstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symSetOptions(symoptions: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symSetParentWindow(hwnd: Hwnd): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symSetScopeFromAddr(hprocess: Handle, address: ULong): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symSetScopeFromIndex(hprocess: Handle, baseofdll: ULong, index: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symSetScopeFromInlineContext(hprocess: Handle, address: ULong, inlinecontext: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symSetSearchPath(hprocess: Handle, searchpatha: Pcstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symSetSearchPathW(hprocess: Handle, searchpatha: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symSrvDeltaName(hprocess: Handle, sympath: Pcstr, type: Pcstr, file1: Pcstr, file2: Pcstr): Pcstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symSrvDeltaNameW(hprocess: Handle, sympath: Pcwstr, type: Pcwstr, file1: Pcwstr, file2: Pcwstr): Pcwstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symSrvGetFileIndexInfo(file: Pcstr, info: COpaquePointer?, flags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symSrvGetFileIndexInfoW(file: Pcwstr, info: COpaquePointer?, flags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symSrvGetFileIndexString(hprocess: Handle, srvpath: Pcstr, file: Pcstr, index: Pstr, size: ULong, flags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symSrvGetFileIndexStringW(hprocess: Handle, srvpath: Pcwstr, file: Pcwstr, index: Pwstr, size: ULong, flags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symSrvGetFileIndexes(file: Pcstr, id: COpaquePointer?, val1: COpaquePointer?, val2: COpaquePointer?, flags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symSrvGetFileIndexesW(file: Pcwstr, id: COpaquePointer?, val1: COpaquePointer?, val2: COpaquePointer?, flags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symSrvGetSupplement(hprocess: Handle, sympath: Pcstr, node: Pcstr, file: Pcstr): Pcstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symSrvGetSupplementW(hprocess: Handle, sympath: Pcwstr, node: Pcwstr, file: Pcwstr): Pcwstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symSrvIsStore(hprocess: Handle, path: Pcstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symSrvIsStoreW(hprocess: Handle, path: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symSrvStoreFile(hprocess: Handle, srvpath: Pcstr, file: Pcstr, flags: SymSrvStoreFileFlags): Pcstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symSrvStoreFileW(hprocess: Handle, srvpath: Pcwstr, file: Pcwstr, flags: SymSrvStoreFileFlags): Pcwstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symSrvStoreSupplement(hprocess: Handle, srvpath: Pcstr, node: Pcstr, file: Pcstr, flags: UInt): Pcstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symSrvStoreSupplementW(hprocess: Handle, sympath: Pcwstr, node: Pcwstr, file: Pcwstr, flags: UInt): Pcwstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symUnDName64(sym: COpaquePointer?, undecname: Pstr, undecnamelength: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symUnloadModule64(hprocess: Handle, baseofdll: ULong): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun terminateProcessOnMemoryExhaustion(failedallocationsize: ULong): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun touchFileTimes(filehandle: Handle, psystemtime: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun unDecorateSymbolName(name: Pcstr, outputstring: Pstr, maxstringlength: UInt, flags: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun unDecorateSymbolNameW(name: Pcwstr, outputstring: Pwstr, maxstringlength: UInt, flags: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun unMapAndLoad(loadedimage: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun unhandledExceptionFilter(exceptioninfo: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun updateDebugInfoFile(imagefilename: Pcstr, symbolpath: Pcstr, debugfilepath: Pstr, ntheaders: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun updateDebugInfoFileEx(imagefilename: Pcstr, symbolpath: Pcstr, debugfilepath: Pstr, ntheaders: COpaquePointer?, oldchecksum: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun waitForDebugEvent(lpdebugevent: COpaquePointer?, dwmilliseconds: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun waitForDebugEventEx(lpdebugevent: COpaquePointer?, dwmilliseconds: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wow64GetThreadContext(hthread: Handle, lpcontext: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wow64GetThreadSelectorEntry(hthread: Handle, dwselector: UInt, lpselectorentry: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wow64SetThreadContext(hthread: Handle, lpcontext: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun writeProcessMemory(hprocess: Handle, lpbaseaddress: COpaquePointer?, lpbuffer: COpaquePointer?, nsize: ULong, lpnumberofbyteswritten: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
