@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

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

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun addVectoredContinueHandler(first: UInt, handler: PvectoredExceptionHandler): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugAddVectoredContinueHandler")

public actual fun addVectoredExceptionHandler(first: UInt, handler: PvectoredExceptionHandler): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugAddVectoredExceptionHandler")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemDiagnosticsDebugBeep")
private external fun wasiWindowssysWindowsWin32SystemDiagnosticsDebugBeep(dwfreq: Int, dwduration: Int): Int

public actual fun beep(dwfreq: UInt, dwduration: UInt): Bool =
    wasiWindowssysWindowsWin32SystemDiagnosticsDebugBeep(dwfreq.toInt(), dwduration.toInt()).toInt()

public actual fun bindImage(imagename: Pcstr, dllpath: Pcstr, symbolpath: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugBindImage")

public actual fun bindImageEx(flags: UInt, imagename: Pcstr, dllpath: Pcstr, symbolpath: Pcstr, statusroutine: PimagehlpStatusRoutine): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugBindImageEx")

public actual fun checkRemoteDebuggerPresent(hprocess: Handle, pbdebuggerpresent: MutPtr<Bool>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugCheckRemoteDebuggerPresent")

public actual fun checkSumMappedFile(baseaddress: ConstPtr<CVoid>, filelength: UInt, headersum: MutPtr<UInt>, checksum: MutPtr<UInt>): MutPtr<ImageNtHeaders64> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugCheckSumMappedFile")

public actual fun closeThreadWaitChainSession(wcthandle: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugCloseThreadWaitChainSession")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemDiagnosticsDebugContinueDebugEvent")
private external fun wasiWindowssysWindowsWin32SystemDiagnosticsDebugContinueDebugEvent(dwprocessid: Int, dwthreadid: Int, dwcontinuestatus: Int): Int

public actual fun continueDebugEvent(dwprocessid: UInt, dwthreadid: UInt, dwcontinuestatus: Ntstatus): Bool =
    wasiWindowssysWindowsWin32SystemDiagnosticsDebugContinueDebugEvent(dwprocessid.toInt(), dwthreadid.toInt(), dwcontinuestatus).toInt()

public actual fun copyContext(destination: MutPtr<Context>, contextflags: ContextFlags, source: ConstPtr<Context>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugCopyContext")

public actual fun dbgHelpCreateUserDump(filename: Pcstr, callback: PdbghelpCreateUserDumpCallback, userdata: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugDbgHelpCreateUserDump")

public actual fun dbgHelpCreateUserDumpW(filename: Pcwstr, callback: PdbghelpCreateUserDumpCallback, userdata: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugDbgHelpCreateUserDumpW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemDiagnosticsDebugDebugActiveProcess")
private external fun wasiWindowssysWindowsWin32SystemDiagnosticsDebugDebugActiveProcess(dwprocessid: Int): Int

public actual fun debugActiveProcess(dwprocessid: UInt): Bool =
    wasiWindowssysWindowsWin32SystemDiagnosticsDebugDebugActiveProcess(dwprocessid.toInt()).toInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemDiagnosticsDebugDebugActiveProcessStop")
private external fun wasiWindowssysWindowsWin32SystemDiagnosticsDebugDebugActiveProcessStop(dwprocessid: Int): Int

public actual fun debugActiveProcessStop(dwprocessid: UInt): Bool =
    wasiWindowssysWindowsWin32SystemDiagnosticsDebugDebugActiveProcessStop(dwprocessid.toInt()).toInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemDiagnosticsDebugDebugBreak")
private external fun wasiWindowssysWindowsWin32SystemDiagnosticsDebugDebugBreak(): Unit

public actual fun debugBreak(): Unit =
    wasiWindowssysWindowsWin32SystemDiagnosticsDebugDebugBreak()

public actual fun debugBreakProcess(process: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugDebugBreakProcess")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemDiagnosticsDebugDebugSetProcessKillOnExit")
private external fun wasiWindowssysWindowsWin32SystemDiagnosticsDebugDebugSetProcessKillOnExit(killonexit: Int): Int

public actual fun debugSetProcessKillOnExit(killonexit: Bool): Bool =
    wasiWindowssysWindowsWin32SystemDiagnosticsDebugDebugSetProcessKillOnExit(killonexit).toInt()

public actual fun decodePointer(ptr: ConstPtr<CVoid>): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugDecodePointer")

public actual fun decodeRemotePointer(processhandle: Handle, ptr: ConstPtr<CVoid>, decodedptr: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugDecodeRemotePointer")

public actual fun decodeSystemPointer(ptr: ConstPtr<CVoid>): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugDecodeSystemPointer")

public actual fun encodePointer(ptr: ConstPtr<CVoid>): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugEncodePointer")

public actual fun encodeRemotePointer(processhandle: Handle, ptr: ConstPtr<CVoid>, encodedptr: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugEncodeRemotePointer")

public actual fun encodeSystemPointer(ptr: ConstPtr<CVoid>): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugEncodeSystemPointer")

public actual fun enumDirTree(hprocess: Handle, rootpath: Pcstr, inputpathname: Pcstr, outputpathbuffer: Pstr, cb: PenumdirtreeCallback, data: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugEnumDirTree")

public actual fun enumDirTreeW(hprocess: Handle, rootpath: Pcwstr, inputpathname: Pcwstr, outputpathbuffer: Pwstr, cb: PenumdirtreeCallbackw, data: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugEnumDirTreeW")

public actual fun enumerateLoadedModules64(hprocess: Handle, enumloadedmodulescallback: PenumloadedModulesCallback64, usercontext: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugEnumerateLoadedModules64")

public actual fun enumerateLoadedModulesEx(hprocess: Handle, enumloadedmodulescallback: PenumloadedModulesCallback64, usercontext: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugEnumerateLoadedModulesEx")

public actual fun enumerateLoadedModulesExW(hprocess: Handle, enumloadedmodulescallback: PenumloadedModulesCallbackw64, usercontext: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugEnumerateLoadedModulesExW")

public actual fun enumerateLoadedModulesW64(hprocess: Handle, enumloadedmodulescallback: PenumloadedModulesCallbackw64, usercontext: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugEnumerateLoadedModulesW64")

public actual fun fatalAppExitA(uaction: UInt, lpmessagetext: Pcstr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugFatalAppExitA")

public actual fun fatalAppExitW(uaction: UInt, lpmessagetext: Pcwstr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugFatalAppExitW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemDiagnosticsDebugFatalExit")
private external fun wasiWindowssysWindowsWin32SystemDiagnosticsDebugFatalExit(exitcode: Int): Unit

public actual fun fatalExit(exitcode: Int): Nothing {
    wasiWindowssysWindowsWin32SystemDiagnosticsDebugFatalExit(exitcode)
    error("C noreturn function windowssysWindowsWin32SystemDiagnosticsDebugFatalExit returned")
}

public actual fun findDebugInfoFile(filename: Pcstr, symbolpath: Pcstr, debugfilepath: Pstr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugFindDebugInfoFile")

public actual fun findDebugInfoFileEx(filename: Pcstr, symbolpath: Pcstr, debugfilepath: Pstr, callback: PfindDebugFileCallback, callerdata: ConstPtr<CVoid>): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugFindDebugInfoFileEx")

public actual fun findDebugInfoFileExW(filename: Pcwstr, symbolpath: Pcwstr, debugfilepath: Pwstr, callback: PfindDebugFileCallbackw, callerdata: ConstPtr<CVoid>): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugFindDebugInfoFileExW")

public actual fun findExecutableImage(filename: Pcstr, symbolpath: Pcstr, imagefilepath: Pstr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugFindExecutableImage")

public actual fun findExecutableImageEx(filename: Pcstr, symbolpath: Pcstr, imagefilepath: Pstr, callback: PfindExeFileCallback, callerdata: ConstPtr<CVoid>): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugFindExecutableImageEx")

public actual fun findExecutableImageExW(filename: Pcwstr, symbolpath: Pcwstr, imagefilepath: Pwstr, callback: PfindExeFileCallbackw, callerdata: ConstPtr<CVoid>): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugFindExecutableImageExW")

public actual fun findFileInPath(hprocess: Handle, searchpatha: Pcstr, filename: Pcstr, id: ConstPtr<CVoid>, two: UInt, three: UInt, flags: UInt, filepath: Pstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugFindFileInPath")

public actual fun findFileInSearchPath(hprocess: Handle, searchpatha: Pcstr, filename: Pcstr, one: UInt, two: UInt, three: UInt, filepath: Pstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugFindFileInSearchPath")

public actual fun flushInstructionCache(hprocess: Handle, lpbaseaddress: ConstPtr<CVoid>, dwsize: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugFlushInstructionCache")

public actual fun formatMessageA(dwflags: FormatMessageOptions, lpsource: ConstPtr<CVoid>, dwmessageid: UInt, dwlanguageid: UInt, lpbuffer: Pstr, nsize: UInt, arguments: ConstPtr<ConstPtr<Byte>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugFormatMessageA")

public actual fun formatMessageW(dwflags: FormatMessageOptions, lpsource: ConstPtr<CVoid>, dwmessageid: UInt, dwlanguageid: UInt, lpbuffer: Pwstr, nsize: UInt, arguments: ConstPtr<ConstPtr<Byte>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugFormatMessageW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemDiagnosticsDebugGetEnabledXStateFeatures")
private external fun wasiWindowssysWindowsWin32SystemDiagnosticsDebugGetEnabledXStateFeatures(): Long

public actual fun getEnabledXStateFeatures(): ULong =
    wasiWindowssysWindowsWin32SystemDiagnosticsDebugGetEnabledXStateFeatures().toULong()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemDiagnosticsDebugGetErrorMode")
private external fun wasiWindowssysWindowsWin32SystemDiagnosticsDebugGetErrorMode(): Int

public actual fun getErrorMode(): UInt =
    wasiWindowssysWindowsWin32SystemDiagnosticsDebugGetErrorMode().toUInt()

public actual fun getImageConfigInformation(loadedimage: ConstPtr<LoadedImage>, imageconfiginformation: MutPtr<ImageLoadConfigDirectory64>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugGetImageConfigInformation")

public actual fun getImageUnusedHeaderBytes(loadedimage: ConstPtr<LoadedImage>, sizeunusedheaderbytes: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugGetImageUnusedHeaderBytes")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemDiagnosticsDebugGetSymLoadError")
private external fun wasiWindowssysWindowsWin32SystemDiagnosticsDebugGetSymLoadError(): Int

public actual fun getSymLoadError(): UInt =
    wasiWindowssysWindowsWin32SystemDiagnosticsDebugGetSymLoadError().toUInt()

public actual fun getThreadContext(hthread: Handle, lpcontext: MutPtr<Context>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugGetThreadContext")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemDiagnosticsDebugGetThreadErrorMode")
private external fun wasiWindowssysWindowsWin32SystemDiagnosticsDebugGetThreadErrorMode(): Int

public actual fun getThreadErrorMode(): UInt =
    wasiWindowssysWindowsWin32SystemDiagnosticsDebugGetThreadErrorMode().toUInt()

public actual fun getThreadSelectorEntry(hthread: Handle, dwselector: UInt, lpselectorentry: MutPtr<LdtEntry>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugGetThreadSelectorEntry")

public actual fun getThreadWaitChain(wcthandle: ConstPtr<CVoid>, context: ULong, flags: WaitChainThreadOptions, threadid: UInt, nodecount: MutPtr<UInt>, nodeinfoarray: MutPtr<WaitchainNodeInfo>, iscycle: MutPtr<Bool>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugGetThreadWaitChain")

public actual fun getTimestampForLoadedLibrary(module: Hmodule): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugGetTimestampForLoadedLibrary")

public actual fun getXStateFeaturesMask(context: ConstPtr<Context>, featuremask: MutPtr<ULong>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugGetXStateFeaturesMask")

public actual fun imageAddCertificate(filehandle: Handle, certificate: ConstPtr<WinCertificate>, index: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugImageAddCertificate")

public actual fun imageDirectoryEntryToData(base: ConstPtr<CVoid>, mappedasimage: Boolean, directoryentry: ImageDirectoryEntry, size: MutPtr<UInt>): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugImageDirectoryEntryToData")

public actual fun imageDirectoryEntryToDataEx(base: ConstPtr<CVoid>, mappedasimage: Boolean, directoryentry: ImageDirectoryEntry, size: MutPtr<UInt>, foundheader: MutPtr<MutPtr<ImageSectionHeader>>): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugImageDirectoryEntryToDataEx")

public actual fun imageEnumerateCertificates(filehandle: Handle, typefilter: UShort, certificatecount: MutPtr<UInt>, indices: MutPtr<UInt>, indexcount: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugImageEnumerateCertificates")

public actual fun imageGetCertificateData(filehandle: Handle, certificateindex: UInt, certificate: MutPtr<WinCertificate>, requiredlength: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugImageGetCertificateData")

public actual fun imageGetCertificateHeader(filehandle: Handle, certificateindex: UInt, certificateheader: MutPtr<WinCertificate>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugImageGetCertificateHeader")

public actual fun imageGetDigestStream(filehandle: Handle, digestlevel: UInt, digestfunction: DigestFunction, digesthandle: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugImageGetDigestStream")

public actual fun imageLoad(dllname: Pcstr, dllpath: Pcstr): MutPtr<LoadedImage> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugImageLoad")

public actual fun imageNtHeader(base: ConstPtr<CVoid>): MutPtr<ImageNtHeaders64> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugImageNtHeader")

public actual fun imageRemoveCertificate(filehandle: Handle, index: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugImageRemoveCertificate")

public actual fun imageRvaToSection(ntheaders: ConstPtr<ImageNtHeaders64>, base: ConstPtr<CVoid>, rva: UInt): MutPtr<ImageSectionHeader> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugImageRvaToSection")

public actual fun imageRvaToVa(ntheaders: ConstPtr<ImageNtHeaders64>, base: ConstPtr<CVoid>, rva: UInt, lastrvasection: ConstPtr<ConstPtr<ImageSectionHeader>>): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugImageRvaToVa")

public actual fun imageUnload(loadedimage: MutPtr<LoadedImage>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugImageUnload")

public actual fun imagehlpApiVersion(): MutPtr<ApiVersion> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugImagehlpApiVersion")

public actual fun imagehlpApiVersionEx(appversion: ConstPtr<ApiVersion>): MutPtr<ApiVersion> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugImagehlpApiVersionEx")

public actual fun initializeContext(buffer: MutPtr<CVoid>, contextflags: ContextFlags, context: MutPtr<MutPtr<Context>>, contextlength: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugInitializeContext")

public actual fun initializeContext2(buffer: MutPtr<CVoid>, contextflags: ContextFlags, context: MutPtr<MutPtr<Context>>, contextlength: MutPtr<UInt>, xstatecompactionmask: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugInitializeContext2")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemDiagnosticsDebugIsDebuggerPresent")
private external fun wasiWindowssysWindowsWin32SystemDiagnosticsDebugIsDebuggerPresent(): Int

public actual fun isDebuggerPresent(): Bool =
    wasiWindowssysWindowsWin32SystemDiagnosticsDebugIsDebuggerPresent().toInt()

public actual fun locateXStateFeature(context: ConstPtr<Context>, featureid: UInt, length: MutPtr<UInt>): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugLocateXStateFeature")

public actual fun makeSureDirectoryPathExists(dirpath: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugMakeSureDirectoryPathExists")

public actual fun mapAndLoad(imagename: Pcstr, dllpath: Pcstr, loadedimage: MutPtr<LoadedImage>, dotdll: Bool, readonly: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugMapAndLoad")

public actual fun mapFileAndCheckSumA(filename: Pcstr, headersum: MutPtr<UInt>, checksum: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugMapFileAndCheckSumA")

public actual fun mapFileAndCheckSumW(filename: Pcwstr, headersum: MutPtr<UInt>, checksum: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugMapFileAndCheckSumW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemDiagnosticsDebugMessageBeep")
private external fun wasiWindowssysWindowsWin32SystemDiagnosticsDebugMessageBeep(utype: Int): Int

public actual fun messageBeep(utype: MessageboxStyle): Bool =
    wasiWindowssysWindowsWin32SystemDiagnosticsDebugMessageBeep(utype.toInt()).toInt()

public actual fun miniDumpReadDumpStream(baseofdump: ConstPtr<CVoid>, streamnumber: UInt, dir: MutPtr<MutPtr<MinidumpDirectory>>, streampointer: MutPtr<MutPtr<CVoid>>, streamsize: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugMiniDumpReadDumpStream")

public actual fun miniDumpWriteDump(hprocess: Handle, processid: UInt, hfile: Handle, dumptype: MinidumpType, exceptionparam: ConstPtr<MinidumpExceptionInformation>, userstreamparam: ConstPtr<MinidumpUserStreamInformation>, callbackparam: ConstPtr<MinidumpCallbackInformation>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugMiniDumpWriteDump")

public actual fun openThreadWaitChainSession(flags: OpenThreadWaitChainSessionFlags, callback: Pwaitchaincallback): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugOpenThreadWaitChainSession")

public actual fun outputDebugStringA(lpoutputstring: Pcstr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugOutputDebugStringA")

public actual fun outputDebugStringW(lpoutputstring: Pcwstr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugOutputDebugStringW")

public actual fun raiseException(dwexceptioncode: UInt, dwexceptionflags: UInt, nnumberofarguments: UInt, lparguments: ConstPtr<ULong>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugRaiseException")

public actual fun raiseFailFastException(pexceptionrecord: ConstPtr<ExceptionRecord>, pcontextrecord: ConstPtr<Context>, dwflags: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugRaiseFailFastException")

public actual fun rangeMapAddPeImageSections(rmaphandle: ConstPtr<CVoid>, imagename: Pcwstr, mappedimage: ConstPtr<CVoid>, mappingbytes: UInt, imagebase: ULong, usertag: ULong, mappingflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugRangeMapAddPeImageSections")

public actual fun rangeMapCreate(): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugRangeMapCreate")

public actual fun rangeMapFree(rmaphandle: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugRangeMapFree")

public actual fun rangeMapRead(rmaphandle: ConstPtr<CVoid>, offset: ULong, buffer: MutPtr<CVoid>, requestbytes: UInt, flags: UInt, donebytes: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugRangeMapRead")

public actual fun rangeMapRemove(rmaphandle: ConstPtr<CVoid>, usertag: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugRangeMapRemove")

public actual fun rangeMapWrite(rmaphandle: ConstPtr<CVoid>, offset: ULong, buffer: ConstPtr<CVoid>, requestbytes: UInt, flags: UInt, donebytes: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugRangeMapWrite")

public actual fun reBaseImage(currentimagename: Pcstr, symbolpath: Pcstr, frebase: Bool, frebasesysfileok: Bool, fgoingdown: Bool, checkimagesize: UInt, oldimagesize: MutPtr<UInt>, oldimagebase: MutPtr<ULong>, newimagesize: MutPtr<UInt>, newimagebase: MutPtr<ULong>, timestamp: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugReBaseImage")

public actual fun reBaseImage64(currentimagename: Pcstr, symbolpath: Pcstr, frebase: Bool, frebasesysfileok: Bool, fgoingdown: Bool, checkimagesize: UInt, oldimagesize: MutPtr<UInt>, oldimagebase: MutPtr<ULong>, newimagesize: MutPtr<UInt>, newimagebase: MutPtr<ULong>, timestamp: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugReBaseImage64")

public actual fun readProcessMemory(hprocess: Handle, lpbaseaddress: ConstPtr<CVoid>, lpbuffer: MutPtr<CVoid>, nsize: ULong, lpnumberofbytesread: MutPtr<ULong>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugReadProcessMemory")

public actual fun registerWaitChainCOMCallback(callstatecallback: Pcogetcallstate, activationstatecallback: Pcogetactivationstate): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugRegisterWaitChainCOMCallback")

public actual fun removeInvalidModuleList(hprocess: Handle): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugRemoveInvalidModuleList")

public actual fun removeVectoredContinueHandler(handle: ConstPtr<CVoid>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugRemoveVectoredContinueHandler")

public actual fun removeVectoredExceptionHandler(handle: ConstPtr<CVoid>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugRemoveVectoredExceptionHandler")

public actual fun reportSymbolLoadSummary(hprocess: Handle, ploadmodule: Pcwstr, psymboldata: ConstPtr<DbghelpDataReportStruct>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugReportSymbolLoadSummary")

public actual fun rtlAddFunctionTable(functiontable: ConstPtr<ImageRuntimeFunctionEntry>, entrycount: UInt, baseaddress: ULong): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugRtlAddFunctionTable")

public actual fun rtlAddGrowableFunctionTable(dynamictable: MutPtr<MutPtr<CVoid>>, functiontable: ConstPtr<ImageRuntimeFunctionEntry>, entrycount: UInt, maximumentrycount: UInt, rangebase: ULong, rangeend: ULong): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugRtlAddGrowableFunctionTable")

public actual fun rtlCaptureContext(contextrecord: MutPtr<Context>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugRtlCaptureContext")

public actual fun rtlCaptureContext2(contextrecord: MutPtr<Context>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugRtlCaptureContext2")

public actual fun rtlCaptureStackBackTrace(framestoskip: UInt, framestocapture: UInt, backtrace: MutPtr<MutPtr<CVoid>>, backtracehash: MutPtr<UInt>): UShort =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugRtlCaptureStackBackTrace")

public actual fun rtlDeleteFunctionTable(functiontable: ConstPtr<ImageRuntimeFunctionEntry>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugRtlDeleteFunctionTable")

public actual fun rtlDeleteGrowableFunctionTable(dynamictable: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugRtlDeleteGrowableFunctionTable")

public actual fun rtlGrowFunctionTable(dynamictable: MutPtr<CVoid>, newentrycount: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugRtlGrowFunctionTable")

public actual fun rtlInstallFunctionTableCallback(tableidentifier: ULong, baseaddress: ULong, length: UInt, callback: PgetRuntimeFunctionCallback, context: ConstPtr<CVoid>, outofprocesscallbackdll: Pcwstr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugRtlInstallFunctionTableCallback")

public actual fun rtlLookupFunctionEntry(controlpc: ULong, imagebase: MutPtr<ULong>, historytable: MutPtr<UnwindHistoryTable>): MutPtr<ImageRuntimeFunctionEntry> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugRtlLookupFunctionEntry")

public actual fun rtlPcToFileHeader(pcvalue: ConstPtr<CVoid>, baseofimage: MutPtr<MutPtr<CVoid>>): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugRtlPcToFileHeader")

public actual fun rtlRaiseException(exceptionrecord: ConstPtr<ExceptionRecord>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugRtlRaiseException")

public actual fun rtlRestoreContext(contextrecord: ConstPtr<Context>, exceptionrecord: ConstPtr<ExceptionRecord>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugRtlRestoreContext")

public actual fun rtlUnwind(targetframe: ConstPtr<CVoid>, targetip: ConstPtr<CVoid>, exceptionrecord: ConstPtr<ExceptionRecord>, returnvalue: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugRtlUnwind")

public actual fun rtlUnwindEx(targetframe: ConstPtr<CVoid>, targetip: ConstPtr<CVoid>, exceptionrecord: ConstPtr<ExceptionRecord>, returnvalue: ConstPtr<CVoid>, contextrecord: ConstPtr<Context>, historytable: ConstPtr<UnwindHistoryTable>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugRtlUnwindEx")

public actual fun rtlVirtualUnwind(handlertype: RtlVirtualUnwindHandlerType, imagebase: ULong, controlpc: ULong, functionentry: ConstPtr<ImageRuntimeFunctionEntry>, contextrecord: MutPtr<Context>, handlerdata: MutPtr<MutPtr<CVoid>>, establisherframe: MutPtr<ULong>, contextpointers: MutPtr<KnonvolatileContextPointers>): ExceptionRoutine =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugRtlVirtualUnwind")

public actual fun searchTreeForFile(rootpath: Pcstr, inputpathname: Pcstr, outputpathbuffer: Pstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSearchTreeForFile")

public actual fun searchTreeForFileW(rootpath: Pcwstr, inputpathname: Pcwstr, outputpathbuffer: Pwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSearchTreeForFileW")

public actual fun setCheckUserInterruptShared(lpstartaddress: LpcallBackUserInterruptRoutine): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSetCheckUserInterruptShared")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemDiagnosticsDebugSetErrorMode")
private external fun wasiWindowssysWindowsWin32SystemDiagnosticsDebugSetErrorMode(umode: Int): Int

public actual fun setErrorMode(umode: ThreadErrorMode): ThreadErrorMode =
    wasiWindowssysWindowsWin32SystemDiagnosticsDebugSetErrorMode(umode.toInt()).toUInt()

public actual fun setImageConfigInformation(loadedimage: MutPtr<LoadedImage>, imageconfiginformation: ConstPtr<ImageLoadConfigDirectory64>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSetImageConfigInformation")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemDiagnosticsDebugSetSymLoadError")
private external fun wasiWindowssysWindowsWin32SystemDiagnosticsDebugSetSymLoadError(error: Int): Unit

public actual fun setSymLoadError(error: UInt): Unit =
    wasiWindowssysWindowsWin32SystemDiagnosticsDebugSetSymLoadError(error.toInt())

public actual fun setThreadContext(hthread: Handle, lpcontext: ConstPtr<Context>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSetThreadContext")

public actual fun setThreadErrorMode(dwnewmode: ThreadErrorMode, lpoldmode: MutPtr<ThreadErrorMode>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSetThreadErrorMode")

public actual fun setUnhandledExceptionFilter(lptoplevelexceptionfilter: LptopLevelExceptionFilter): LptopLevelExceptionFilter =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSetUnhandledExceptionFilter")

public actual fun setXStateFeaturesMask(context: MutPtr<Context>, featuremask: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSetXStateFeaturesMask")

public actual fun stackWalk2(machinetype: UInt, hprocess: Handle, hthread: Handle, stackframe: MutPtr<StackframeEx>, contextrecord: MutPtr<CVoid>, readmemoryroutine: PreadProcessMemoryRoutine64, functiontableaccessroutine: PfunctionTableAccessRoutine64, getmodulebaseroutine: PgetModuleBaseRoutine64, translateaddress: PtranslateAddressRoutine64, gettargetattributevalue: PgetTargetAttributeValue64, flags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugStackWalk2")

public actual fun stackWalk64(machinetype: UInt, hprocess: Handle, hthread: Handle, stackframe: MutPtr<Stackframe64>, contextrecord: MutPtr<CVoid>, readmemoryroutine: PreadProcessMemoryRoutine64, functiontableaccessroutine: PfunctionTableAccessRoutine64, getmodulebaseroutine: PgetModuleBaseRoutine64, translateaddress: PtranslateAddressRoutine64): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugStackWalk64")

public actual fun stackWalkEx(machinetype: UInt, hprocess: Handle, hthread: Handle, stackframe: MutPtr<StackframeEx>, contextrecord: MutPtr<CVoid>, readmemoryroutine: PreadProcessMemoryRoutine64, functiontableaccessroutine: PfunctionTableAccessRoutine64, getmodulebaseroutine: PgetModuleBaseRoutine64, translateaddress: PtranslateAddressRoutine64, flags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugStackWalkEx")

public actual fun symAddSourceStream(hprocess: Handle, base: ULong, streamfile: Pcstr, buffer: ConstPtr<UByte>, size: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymAddSourceStream")

public actual fun symAddSourceStreamA(hprocess: Handle, base: ULong, streamfile: Pcstr, buffer: ConstPtr<UByte>, size: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymAddSourceStreamA")

public actual fun symAddSourceStreamW(hprocess: Handle, base: ULong, filespec: Pcwstr, buffer: ConstPtr<UByte>, size: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymAddSourceStreamW")

public actual fun symAddSymbol(hprocess: Handle, baseofdll: ULong, name: Pcstr, address: ULong, size: UInt, flags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymAddSymbol")

public actual fun symAddSymbolW(hprocess: Handle, baseofdll: ULong, name: Pcwstr, address: ULong, size: UInt, flags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymAddSymbolW")

public actual fun symAddrIncludeInlineTrace(hprocess: Handle, address: ULong): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymAddrIncludeInlineTrace")

public actual fun symCleanup(hprocess: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymCleanup")

public actual fun symCompareInlineTrace(hprocess: Handle, address1: ULong, inlinecontext1: UInt, retaddress1: ULong, address2: ULong, retaddress2: ULong): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymCompareInlineTrace")

public actual fun symDeleteSymbol(hprocess: Handle, baseofdll: ULong, name: Pcstr, address: ULong, flags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymDeleteSymbol")

public actual fun symDeleteSymbolW(hprocess: Handle, baseofdll: ULong, name: Pcwstr, address: ULong, flags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymDeleteSymbolW")

public actual fun symEnumLines(hprocess: Handle, base: ULong, obj: Pcstr, file: Pcstr, enumlinescallback: PsymEnumlinesCallback, usercontext: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymEnumLines")

public actual fun symEnumLinesW(hprocess: Handle, base: ULong, obj: Pcwstr, file: Pcwstr, enumlinescallback: PsymEnumlinesCallbackw, usercontext: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymEnumLinesW")

public actual fun symEnumProcesses(enumprocessescallback: PsymEnumprocessesCallback, usercontext: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymEnumProcesses")

public actual fun symEnumSourceFileTokens(hprocess: Handle, base: ULong, callback: Penumsourcefiletokenscallback): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSourceFileTokens")

public actual fun symEnumSourceFiles(hprocess: Handle, modbase: ULong, mask: Pcstr, cbsrcfiles: PsymEnumsourcefilesCallback, usercontext: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSourceFiles")

public actual fun symEnumSourceFilesW(hprocess: Handle, modbase: ULong, mask: Pcwstr, cbsrcfiles: PsymEnumsourcefilesCallbackw, usercontext: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSourceFilesW")

public actual fun symEnumSourceLines(hprocess: Handle, base: ULong, obj: Pcstr, file: Pcstr, line: UInt, flags: UInt, enumlinescallback: PsymEnumlinesCallback, usercontext: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSourceLines")

public actual fun symEnumSourceLinesW(hprocess: Handle, base: ULong, obj: Pcwstr, file: Pcwstr, line: UInt, flags: UInt, enumlinescallback: PsymEnumlinesCallbackw, usercontext: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSourceLinesW")

public actual fun symEnumSym(hprocess: Handle, baseofdll: ULong, enumsymbolscallback: PsymEnumeratesymbolsCallback, usercontext: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSym")

public actual fun symEnumSymbols(hprocess: Handle, baseofdll: ULong, mask: Pcstr, enumsymbolscallback: PsymEnumeratesymbolsCallback, usercontext: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSymbols")

public actual fun symEnumSymbolsEx(hprocess: Handle, baseofdll: ULong, mask: Pcstr, enumsymbolscallback: PsymEnumeratesymbolsCallback, usercontext: ConstPtr<CVoid>, options: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSymbolsEx")

public actual fun symEnumSymbolsExW(hprocess: Handle, baseofdll: ULong, mask: Pcwstr, enumsymbolscallback: PsymEnumeratesymbolsCallbackw, usercontext: ConstPtr<CVoid>, options: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSymbolsExW")

public actual fun symEnumSymbolsForAddr(hprocess: Handle, address: ULong, enumsymbolscallback: PsymEnumeratesymbolsCallback, usercontext: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSymbolsForAddr")

public actual fun symEnumSymbolsForAddrW(hprocess: Handle, address: ULong, enumsymbolscallback: PsymEnumeratesymbolsCallbackw, usercontext: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSymbolsForAddrW")

public actual fun symEnumSymbolsW(hprocess: Handle, baseofdll: ULong, mask: Pcwstr, enumsymbolscallback: PsymEnumeratesymbolsCallbackw, usercontext: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSymbolsW")

public actual fun symEnumTypes(hprocess: Handle, baseofdll: ULong, enumsymbolscallback: PsymEnumeratesymbolsCallback, usercontext: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymEnumTypes")

public actual fun symEnumTypesByName(hprocess: Handle, baseofdll: ULong, mask: Pcstr, enumsymbolscallback: PsymEnumeratesymbolsCallback, usercontext: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymEnumTypesByName")

public actual fun symEnumTypesByNameW(hprocess: Handle, baseofdll: ULong, mask: Pcwstr, enumsymbolscallback: PsymEnumeratesymbolsCallbackw, usercontext: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymEnumTypesByNameW")

public actual fun symEnumTypesW(hprocess: Handle, baseofdll: ULong, enumsymbolscallback: PsymEnumeratesymbolsCallbackw, usercontext: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymEnumTypesW")

public actual fun symEnumerateModules64(hprocess: Handle, enummodulescallback: PsymEnummodulesCallback64, usercontext: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymEnumerateModules64")

public actual fun symEnumerateModulesW64(hprocess: Handle, enummodulescallback: PsymEnummodulesCallbackw64, usercontext: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymEnumerateModulesW64")

public actual fun symEnumerateSymbols64(hprocess: Handle, baseofdll: ULong, enumsymbolscallback: PsymEnumsymbolsCallback64, usercontext: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymEnumerateSymbols64")

public actual fun symEnumerateSymbolsW64(hprocess: Handle, baseofdll: ULong, enumsymbolscallback: PsymEnumsymbolsCallback64w, usercontext: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymEnumerateSymbolsW64")

public actual fun symFindDebugInfoFile(hprocess: Handle, filename: Pcstr, debugfilepath: Pstr, callback: PfindDebugFileCallback, callerdata: ConstPtr<CVoid>): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymFindDebugInfoFile")

public actual fun symFindDebugInfoFileW(hprocess: Handle, filename: Pcwstr, debugfilepath: Pwstr, callback: PfindDebugFileCallbackw, callerdata: ConstPtr<CVoid>): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymFindDebugInfoFileW")

public actual fun symFindExecutableImage(hprocess: Handle, filename: Pcstr, imagefilepath: Pstr, callback: PfindExeFileCallback, callerdata: ConstPtr<CVoid>): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymFindExecutableImage")

public actual fun symFindExecutableImageW(hprocess: Handle, filename: Pcwstr, imagefilepath: Pwstr, callback: PfindExeFileCallbackw, callerdata: ConstPtr<CVoid>): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymFindExecutableImageW")

public actual fun symFindFileInPath(hprocess: Handle, searchpatha: Pcstr, filename: Pcstr, id: ConstPtr<CVoid>, two: UInt, three: UInt, flags: SymFindIdOption, foundfile: Pstr, callback: Pfindfileinpathcallback, context: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymFindFileInPath")

public actual fun symFindFileInPathW(hprocess: Handle, searchpatha: Pcwstr, filename: Pcwstr, id: ConstPtr<CVoid>, two: UInt, three: UInt, flags: SymFindIdOption, foundfile: Pwstr, callback: Pfindfileinpathcallbackw, context: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymFindFileInPathW")

public actual fun symFromAddr(hprocess: Handle, address: ULong, displacement: MutPtr<ULong>, symbol: MutPtr<SymbolInfo>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymFromAddr")

public actual fun symFromAddrW(hprocess: Handle, address: ULong, displacement: MutPtr<ULong>, symbol: MutPtr<SymbolInfow>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymFromAddrW")

public actual fun symFromIndex(hprocess: Handle, baseofdll: ULong, index: UInt, symbol: MutPtr<SymbolInfo>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymFromIndex")

public actual fun symFromIndexW(hprocess: Handle, baseofdll: ULong, index: UInt, symbol: MutPtr<SymbolInfow>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymFromIndexW")

public actual fun symFromInlineContext(hprocess: Handle, address: ULong, inlinecontext: UInt, displacement: MutPtr<ULong>, symbol: MutPtr<SymbolInfo>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymFromInlineContext")

public actual fun symFromInlineContextW(hprocess: Handle, address: ULong, inlinecontext: UInt, displacement: MutPtr<ULong>, symbol: MutPtr<SymbolInfow>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymFromInlineContextW")

public actual fun symFromName(hprocess: Handle, name: Pcstr, symbol: MutPtr<SymbolInfo>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymFromName")

public actual fun symFromNameW(hprocess: Handle, name: Pcwstr, symbol: MutPtr<SymbolInfow>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymFromNameW")

public actual fun symFromToken(hprocess: Handle, base: ULong, token: UInt, symbol: MutPtr<SymbolInfo>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymFromToken")

public actual fun symFromTokenW(hprocess: Handle, base: ULong, token: UInt, symbol: MutPtr<SymbolInfow>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymFromTokenW")

public actual fun symFunctionTableAccess64(hprocess: Handle, addrbase: ULong): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymFunctionTableAccess64")

public actual fun symFunctionTableAccess64AccessRoutines(hprocess: Handle, addrbase: ULong, readmemoryroutine: PreadProcessMemoryRoutine64, getmodulebaseroutine: PgetModuleBaseRoutine64): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymFunctionTableAccess64AccessRoutines")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemDiagnosticsDebugSymGetExtendedOption")
private external fun wasiWindowssysWindowsWin32SystemDiagnosticsDebugSymGetExtendedOption(option: Int): Int

public actual fun symGetExtendedOption(option: ImagehlpExtendedOptions): Bool =
    wasiWindowssysWindowsWin32SystemDiagnosticsDebugSymGetExtendedOption(option).toInt()

public actual fun symGetFileLineOffsets64(hprocess: Handle, modulename: Pcstr, filename: Pcstr, buffer: MutPtr<ULong>, bufferlines: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymGetFileLineOffsets64")

public actual fun symGetHomeDirectory(type: UInt, dir: Pstr, size: ULong): Pstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymGetHomeDirectory")

public actual fun symGetHomeDirectoryW(type: UInt, dir: Pwstr, size: ULong): Pwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymGetHomeDirectoryW")

public actual fun symGetLineFromAddr64(hprocess: Handle, qwaddr: ULong, pdwdisplacement: MutPtr<UInt>, line64: MutPtr<ImagehlpLine64>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymGetLineFromAddr64")

public actual fun symGetLineFromAddrW64(hprocess: Handle, dwaddr: ULong, pdwdisplacement: MutPtr<UInt>, line: MutPtr<ImagehlpLinew64>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymGetLineFromAddrW64")

public actual fun symGetLineFromInlineContext(hprocess: Handle, qwaddr: ULong, inlinecontext: UInt, qwmodulebaseaddress: ULong, pdwdisplacement: MutPtr<UInt>, line64: MutPtr<ImagehlpLine64>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymGetLineFromInlineContext")

public actual fun symGetLineFromInlineContextW(hprocess: Handle, dwaddr: ULong, inlinecontext: UInt, qwmodulebaseaddress: ULong, pdwdisplacement: MutPtr<UInt>, line: MutPtr<ImagehlpLinew64>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymGetLineFromInlineContextW")

public actual fun symGetLineFromName64(hprocess: Handle, modulename: Pcstr, filename: Pcstr, dwlinenumber: UInt, pldisplacement: MutPtr<Int>, line: MutPtr<ImagehlpLine64>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymGetLineFromName64")

public actual fun symGetLineFromNameW64(hprocess: Handle, modulename: Pcwstr, filename: Pcwstr, dwlinenumber: UInt, pldisplacement: MutPtr<Int>, line: MutPtr<ImagehlpLinew64>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymGetLineFromNameW64")

public actual fun symGetLineNext64(hprocess: Handle, line: MutPtr<ImagehlpLine64>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymGetLineNext64")

public actual fun symGetLineNextW64(hprocess: Handle, line: MutPtr<ImagehlpLinew64>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymGetLineNextW64")

public actual fun symGetLinePrev64(hprocess: Handle, line: MutPtr<ImagehlpLine64>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymGetLinePrev64")

public actual fun symGetLinePrevW64(hprocess: Handle, line: MutPtr<ImagehlpLinew64>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymGetLinePrevW64")

public actual fun symGetModuleBase64(hprocess: Handle, qwaddr: ULong): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymGetModuleBase64")

public actual fun symGetModuleInfo64(hprocess: Handle, qwaddr: ULong, moduleinfo: MutPtr<ImagehlpModule64>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymGetModuleInfo64")

public actual fun symGetModuleInfoW64(hprocess: Handle, qwaddr: ULong, moduleinfo: MutPtr<ImagehlpModulew64>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymGetModuleInfoW64")

public actual fun symGetOmaps(hprocess: Handle, baseofdll: ULong, omapto: MutPtr<MutPtr<Omap>>, comapto: MutPtr<ULong>, omapfrom: MutPtr<MutPtr<Omap>>, comapfrom: MutPtr<ULong>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymGetOmaps")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemDiagnosticsDebugSymGetOptions")
private external fun wasiWindowssysWindowsWin32SystemDiagnosticsDebugSymGetOptions(): Int

public actual fun symGetOptions(): UInt =
    wasiWindowssysWindowsWin32SystemDiagnosticsDebugSymGetOptions().toUInt()

public actual fun symGetScope(hprocess: Handle, baseofdll: ULong, index: UInt, symbol: MutPtr<SymbolInfo>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymGetScope")

public actual fun symGetScopeW(hprocess: Handle, baseofdll: ULong, index: UInt, symbol: MutPtr<SymbolInfow>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymGetScopeW")

public actual fun symGetSearchPath(hprocess: Handle, searchpatha: Pstr, searchpathlength: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymGetSearchPath")

public actual fun symGetSearchPathW(hprocess: Handle, searchpatha: Pwstr, searchpathlength: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymGetSearchPathW")

public actual fun symGetSourceFile(hprocess: Handle, base: ULong, params: Pcstr, filespec: Pcstr, filepath: Pstr, size: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFile")

public actual fun symGetSourceFileChecksum(hprocess: Handle, base: ULong, filespec: Pcstr, pchecksumtype: MutPtr<UInt>, pchecksum: MutPtr<UByte>, checksumsize: UInt, pactualbyteswritten: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileChecksum")

public actual fun symGetSourceFileChecksumW(hprocess: Handle, base: ULong, filespec: Pcwstr, pchecksumtype: MutPtr<UInt>, pchecksum: MutPtr<UByte>, checksumsize: UInt, pactualbyteswritten: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileChecksumW")

public actual fun symGetSourceFileFromToken(hprocess: Handle, token: ConstPtr<CVoid>, params: Pcstr, filepath: Pstr, size: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileFromToken")

public actual fun symGetSourceFileFromTokenByTokenName(hprocess: Handle, token: ConstPtr<CVoid>, tokenname: Pcstr, params: Pcstr, filepath: Pstr, size: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileFromTokenByTokenName")

public actual fun symGetSourceFileFromTokenByTokenNameW(hprocess: Handle, token: ConstPtr<CVoid>, tokenname: Pcwstr, params: Pcwstr, filepath: Pwstr, size: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileFromTokenByTokenNameW")

public actual fun symGetSourceFileFromTokenW(hprocess: Handle, token: ConstPtr<CVoid>, params: Pcwstr, filepath: Pwstr, size: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileFromTokenW")

public actual fun symGetSourceFileToken(hprocess: Handle, base: ULong, filespec: Pcstr, token: MutPtr<MutPtr<CVoid>>, size: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileToken")

public actual fun symGetSourceFileTokenByTokenName(hprocess: Handle, base: ULong, filespec: Pcstr, tokenname: Pcstr, tokenparameters: Pcstr, token: MutPtr<MutPtr<CVoid>>, size: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileTokenByTokenName")

public actual fun symGetSourceFileTokenByTokenNameW(hprocess: Handle, base: ULong, filespec: Pcwstr, tokenname: Pcwstr, tokenparameters: Pcwstr, token: MutPtr<MutPtr<CVoid>>, size: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileTokenByTokenNameW")

public actual fun symGetSourceFileTokenW(hprocess: Handle, base: ULong, filespec: Pcwstr, token: MutPtr<MutPtr<CVoid>>, size: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileTokenW")

public actual fun symGetSourceFileW(hprocess: Handle, base: ULong, params: Pcwstr, filespec: Pcwstr, filepath: Pwstr, size: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileW")

public actual fun symGetSourceVarFromToken(hprocess: Handle, token: ConstPtr<CVoid>, params: Pcstr, varname: Pcstr, value: Pstr, size: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceVarFromToken")

public actual fun symGetSourceVarFromTokenW(hprocess: Handle, token: ConstPtr<CVoid>, params: Pcwstr, varname: Pcwstr, value: Pwstr, size: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceVarFromTokenW")

public actual fun symGetSymFromAddr64(hprocess: Handle, qwaddr: ULong, pdwdisplacement: MutPtr<ULong>, symbol: MutPtr<ImagehlpSymbol64>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymGetSymFromAddr64")

public actual fun symGetSymFromName64(hprocess: Handle, name: Pcstr, symbol: MutPtr<ImagehlpSymbol64>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymGetSymFromName64")

public actual fun symGetSymNext64(hprocess: Handle, symbol: MutPtr<ImagehlpSymbol64>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymGetSymNext64")

public actual fun symGetSymPrev64(hprocess: Handle, symbol: MutPtr<ImagehlpSymbol64>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymGetSymPrev64")

public actual fun symGetSymbolFile(hprocess: Handle, sympath: Pcstr, imagefile: Pcstr, type: UInt, symbolfile: Pstr, csymbolfile: ULong, dbgfile: Pstr, cdbgfile: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymGetSymbolFile")

public actual fun symGetSymbolFileW(hprocess: Handle, sympath: Pcwstr, imagefile: Pcwstr, type: UInt, symbolfile: Pwstr, csymbolfile: ULong, dbgfile: Pwstr, cdbgfile: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymGetSymbolFileW")

public actual fun symGetTypeFromName(hprocess: Handle, baseofdll: ULong, name: Pcstr, symbol: MutPtr<SymbolInfo>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymGetTypeFromName")

public actual fun symGetTypeFromNameW(hprocess: Handle, baseofdll: ULong, name: Pcwstr, symbol: MutPtr<SymbolInfow>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymGetTypeFromNameW")

public actual fun symGetTypeInfo(hprocess: Handle, modbase: ULong, typeid: UInt, gettype: ImagehlpSymbolTypeInfo, pinfo: MutPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymGetTypeInfo")

public actual fun symGetTypeInfoEx(hprocess: Handle, modbase: ULong, params: MutPtr<ImagehlpGetTypeInfoParams>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymGetTypeInfoEx")

public actual fun symGetUnwindInfo(hprocess: Handle, address: ULong, buffer: MutPtr<CVoid>, size: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymGetUnwindInfo")

public actual fun symInitialize(hprocess: Handle, usersearchpath: Pcstr, finvadeprocess: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymInitialize")

public actual fun symInitializeW(hprocess: Handle, usersearchpath: Pcwstr, finvadeprocess: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymInitializeW")

public actual fun symLoadModule64(hprocess: Handle, hfile: Handle, imagename: Pcstr, modulename: Pcstr, baseofdll: ULong, sizeofdll: UInt): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymLoadModule64")

public actual fun symLoadModuleEx(hprocess: Handle, hfile: Handle, imagename: Pcstr, modulename: Pcstr, baseofdll: ULong, dllsize: UInt, data: ConstPtr<ModloadData>, flags: SymLoadFlags): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymLoadModuleEx")

public actual fun symLoadModuleExW(hprocess: Handle, hfile: Handle, imagename: Pcwstr, modulename: Pcwstr, baseofdll: ULong, dllsize: UInt, data: ConstPtr<ModloadData>, flags: SymLoadFlags): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymLoadModuleExW")

public actual fun symMatchFileName(filename: Pcstr, match: Pcstr, filenamestop: MutPtr<Pstr>, matchstop: MutPtr<Pstr>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymMatchFileName")

public actual fun symMatchFileNameW(filename: Pcwstr, match: Pcwstr, filenamestop: MutPtr<Pwstr>, matchstop: MutPtr<Pwstr>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymMatchFileNameW")

public actual fun symMatchString(string: Pcstr, expression: Pcstr, fcase: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymMatchString")

public actual fun symMatchStringA(string: Pcstr, expression: Pcstr, fcase: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymMatchStringA")

public actual fun symMatchStringW(string: Pcwstr, expression: Pcwstr, fcase: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymMatchStringW")

public actual fun symNext(hprocess: Handle, si: MutPtr<SymbolInfo>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymNext")

public actual fun symNextW(hprocess: Handle, siw: MutPtr<SymbolInfow>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymNextW")

public actual fun symPrev(hprocess: Handle, si: MutPtr<SymbolInfo>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymPrev")

public actual fun symPrevW(hprocess: Handle, siw: MutPtr<SymbolInfow>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymPrevW")

public actual fun symQueryInlineTrace(hprocess: Handle, startaddress: ULong, startcontext: UInt, startretaddress: ULong, curaddress: ULong, curcontext: MutPtr<UInt>, curframeindex: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymQueryInlineTrace")

public actual fun symRefreshModuleList(hprocess: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymRefreshModuleList")

public actual fun symRegisterCallback64(hprocess: Handle, callbackfunction: PsymbolRegisteredCallback64, usercontext: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymRegisterCallback64")

public actual fun symRegisterCallbackW64(hprocess: Handle, callbackfunction: PsymbolRegisteredCallback64, usercontext: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymRegisterCallbackW64")

public actual fun symRegisterFunctionEntryCallback64(hprocess: Handle, callbackfunction: PsymbolFuncentryCallback64, usercontext: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymRegisterFunctionEntryCallback64")

public actual fun symSearch(hprocess: Handle, baseofdll: ULong, index: UInt, symtag: UInt, mask: Pcstr, address: ULong, enumsymbolscallback: PsymEnumeratesymbolsCallback, usercontext: ConstPtr<CVoid>, options: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymSearch")

public actual fun symSearchW(hprocess: Handle, baseofdll: ULong, index: UInt, symtag: UInt, mask: Pcwstr, address: ULong, enumsymbolscallback: PsymEnumeratesymbolsCallbackw, usercontext: ConstPtr<CVoid>, options: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymSearchW")

public actual fun symSetContext(hprocess: Handle, stackframe: ConstPtr<ImagehlpStackFrame>, context: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymSetContext")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemDiagnosticsDebugSymSetExtendedOption")
private external fun wasiWindowssysWindowsWin32SystemDiagnosticsDebugSymSetExtendedOption(option: Int, value: Int): Int

public actual fun symSetExtendedOption(option: ImagehlpExtendedOptions, value: Bool): Bool =
    wasiWindowssysWindowsWin32SystemDiagnosticsDebugSymSetExtendedOption(option, value).toInt()

public actual fun symSetHomeDirectory(hprocess: Handle, dir: Pcstr): Pstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymSetHomeDirectory")

public actual fun symSetHomeDirectoryW(hprocess: Handle, dir: Pcwstr): Pwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymSetHomeDirectoryW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemDiagnosticsDebugSymSetOptions")
private external fun wasiWindowssysWindowsWin32SystemDiagnosticsDebugSymSetOptions(symoptions: Int): Int

public actual fun symSetOptions(symoptions: UInt): UInt =
    wasiWindowssysWindowsWin32SystemDiagnosticsDebugSymSetOptions(symoptions.toInt()).toUInt()

public actual fun symSetParentWindow(hwnd: Hwnd): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymSetParentWindow")

public actual fun symSetScopeFromAddr(hprocess: Handle, address: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymSetScopeFromAddr")

public actual fun symSetScopeFromIndex(hprocess: Handle, baseofdll: ULong, index: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymSetScopeFromIndex")

public actual fun symSetScopeFromInlineContext(hprocess: Handle, address: ULong, inlinecontext: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymSetScopeFromInlineContext")

public actual fun symSetSearchPath(hprocess: Handle, searchpatha: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymSetSearchPath")

public actual fun symSetSearchPathW(hprocess: Handle, searchpatha: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymSetSearchPathW")

public actual fun symSrvDeltaName(hprocess: Handle, sympath: Pcstr, type: Pcstr, file1: Pcstr, file2: Pcstr): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymSrvDeltaName")

public actual fun symSrvDeltaNameW(hprocess: Handle, sympath: Pcwstr, type: Pcwstr, file1: Pcwstr, file2: Pcwstr): Pcwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymSrvDeltaNameW")

public actual fun symSrvGetFileIndexInfo(file: Pcstr, info: MutPtr<SymsrvIndexInfo>, flags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymSrvGetFileIndexInfo")

public actual fun symSrvGetFileIndexInfoW(file: Pcwstr, info: MutPtr<SymsrvIndexInfow>, flags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymSrvGetFileIndexInfoW")

public actual fun symSrvGetFileIndexString(hprocess: Handle, srvpath: Pcstr, file: Pcstr, index: Pstr, size: ULong, flags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymSrvGetFileIndexString")

public actual fun symSrvGetFileIndexStringW(hprocess: Handle, srvpath: Pcwstr, file: Pcwstr, index: Pwstr, size: ULong, flags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymSrvGetFileIndexStringW")

public actual fun symSrvGetFileIndexes(file: Pcstr, id: MutPtr<Guid>, val1: MutPtr<UInt>, val2: MutPtr<UInt>, flags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymSrvGetFileIndexes")

public actual fun symSrvGetFileIndexesW(file: Pcwstr, id: MutPtr<Guid>, val1: MutPtr<UInt>, val2: MutPtr<UInt>, flags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymSrvGetFileIndexesW")

public actual fun symSrvGetSupplement(hprocess: Handle, sympath: Pcstr, node: Pcstr, file: Pcstr): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymSrvGetSupplement")

public actual fun symSrvGetSupplementW(hprocess: Handle, sympath: Pcwstr, node: Pcwstr, file: Pcwstr): Pcwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymSrvGetSupplementW")

public actual fun symSrvIsStore(hprocess: Handle, path: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymSrvIsStore")

public actual fun symSrvIsStoreW(hprocess: Handle, path: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymSrvIsStoreW")

public actual fun symSrvStoreFile(hprocess: Handle, srvpath: Pcstr, file: Pcstr, flags: SymSrvStoreFileFlags): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymSrvStoreFile")

public actual fun symSrvStoreFileW(hprocess: Handle, srvpath: Pcwstr, file: Pcwstr, flags: SymSrvStoreFileFlags): Pcwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymSrvStoreFileW")

public actual fun symSrvStoreSupplement(hprocess: Handle, srvpath: Pcstr, node: Pcstr, file: Pcstr, flags: UInt): Pcstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymSrvStoreSupplement")

public actual fun symSrvStoreSupplementW(hprocess: Handle, sympath: Pcwstr, node: Pcwstr, file: Pcwstr, flags: UInt): Pcwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymSrvStoreSupplementW")

public actual fun symUnDName64(sym: ConstPtr<ImagehlpSymbol64>, undecname: Pstr, undecnamelength: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymUnDName64")

public actual fun symUnloadModule64(hprocess: Handle, baseofdll: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugSymUnloadModule64")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemDiagnosticsDebugTerminateProcessOnMemoryExhaustion")
private external fun wasiWindowssysWindowsWin32SystemDiagnosticsDebugTerminateProcessOnMemoryExhaustion(failedallocationsize: Long): Unit

public actual fun terminateProcessOnMemoryExhaustion(failedallocationsize: ULong): Unit =
    wasiWindowssysWindowsWin32SystemDiagnosticsDebugTerminateProcessOnMemoryExhaustion(failedallocationsize.toLong())

public actual fun touchFileTimes(filehandle: Handle, psystemtime: ConstPtr<Systemtime>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugTouchFileTimes")

public actual fun unDecorateSymbolName(name: Pcstr, outputstring: Pstr, maxstringlength: UInt, flags: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugUnDecorateSymbolName")

public actual fun unDecorateSymbolNameW(name: Pcwstr, outputstring: Pwstr, maxstringlength: UInt, flags: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugUnDecorateSymbolNameW")

public actual fun unMapAndLoad(loadedimage: MutPtr<LoadedImage>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugUnMapAndLoad")

public actual fun unhandledExceptionFilter(exceptioninfo: ConstPtr<ExceptionPointers>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugUnhandledExceptionFilter")

public actual fun updateDebugInfoFile(imagefilename: Pcstr, symbolpath: Pcstr, debugfilepath: Pstr, ntheaders: ConstPtr<ImageNtHeaders32>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugUpdateDebugInfoFile")

public actual fun updateDebugInfoFileEx(imagefilename: Pcstr, symbolpath: Pcstr, debugfilepath: Pstr, ntheaders: ConstPtr<ImageNtHeaders32>, oldchecksum: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugUpdateDebugInfoFileEx")

public actual fun waitForDebugEvent(lpdebugevent: MutPtr<DebugEvent>, dwmilliseconds: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugWaitForDebugEvent")

public actual fun waitForDebugEventEx(lpdebugevent: MutPtr<DebugEvent>, dwmilliseconds: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugWaitForDebugEventEx")

public actual fun wow64GetThreadContext(hthread: Handle, lpcontext: MutPtr<Wow64Context>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugWow64GetThreadContext")

public actual fun wow64GetThreadSelectorEntry(hthread: Handle, dwselector: UInt, lpselectorentry: MutPtr<Wow64LdtEntry>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugWow64GetThreadSelectorEntry")

public actual fun wow64SetThreadContext(hthread: Handle, lpcontext: ConstPtr<Wow64Context>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugWow64SetThreadContext")

public actual fun writeProcessMemory(hprocess: Handle, lpbaseaddress: ConstPtr<CVoid>, lpbuffer: ConstPtr<CVoid>, nsize: ULong, lpnumberofbyteswritten: MutPtr<ULong>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugWriteProcessMemory")
