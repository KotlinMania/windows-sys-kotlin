@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun addVectoredContinueHandler(first: UInt, handler: PvectoredExceptionHandler): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_addVectoredContinueHandler(first, 0L.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun addVectoredExceptionHandler(first: UInt, handler: PvectoredExceptionHandler): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_addVectoredExceptionHandler(first, 0L.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun beep(dwfreq: UInt, dwduration: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_beep(dwfreq, dwduration)

public actual fun bindImage(imagename: Pcstr, dllpath: Pcstr, symbolpath: Pcstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_bindImage(imagename?.value?.toCPointer<ByteVar>(), dllpath?.value?.toCPointer<ByteVar>(), symbolpath?.value?.toCPointer<ByteVar>())

public actual fun bindImageEx(flags: UInt, imagename: Pcstr, dllpath: Pcstr, symbolpath: Pcstr, statusroutine: PimagehlpStatusRoutine): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_bindImageEx(flags, imagename?.value?.toCPointer<ByteVar>(), dllpath?.value?.toCPointer<ByteVar>(), symbolpath?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun checkRemoteDebuggerPresent(hprocess: Handle, pbdebuggerpresent: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_checkRemoteDebuggerPresent(hprocess?.value?.toCPointer<ByteVar>(), pbdebuggerpresent?.value?.toCPointer<ByteVar>())

public actual fun checkSumMappedFile(baseaddress: COpaquePointer?, filelength: UInt, headersum: COpaquePointer?, checksum: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_checkSumMappedFile(baseaddress?.value?.toCPointer<ByteVar>(), filelength, headersum?.value?.toCPointer<ByteVar>(), checksum?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun closeThreadWaitChainSession(wcthandle: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_closeThreadWaitChainSession(wcthandle?.value?.toCPointer<ByteVar>())
}

public actual fun continueDebugEvent(dwprocessid: UInt, dwthreadid: UInt, dwcontinuestatus: Ntstatus): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_continueDebugEvent(dwprocessid, dwthreadid, dwcontinuestatus)

public actual fun copyContext(destination: COpaquePointer?, contextflags: ContextFlags, source: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_copyContext(destination?.value?.toCPointer<ByteVar>(), contextflags, source?.value?.toCPointer<ByteVar>())

public actual fun dbgHelpCreateUserDump(filename: Pcstr, callback: PdbghelpCreateUserDumpCallback, userdata: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_dbgHelpCreateUserDump(filename?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), userdata?.value?.toCPointer<ByteVar>())

public actual fun dbgHelpCreateUserDumpW(filename: Pcwstr, callback: PdbghelpCreateUserDumpCallback, userdata: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_dbgHelpCreateUserDumpW(filename?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), userdata?.value?.toCPointer<ByteVar>())

public actual fun debugActiveProcess(dwprocessid: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_debugActiveProcess(dwprocessid)

public actual fun debugActiveProcessStop(dwprocessid: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_debugActiveProcessStop(dwprocessid)

public actual fun debugBreak() {
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_debugBreak()
}

public actual fun debugBreakProcess(process: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_debugBreakProcess(process?.value?.toCPointer<ByteVar>())

public actual fun debugSetProcessKillOnExit(killonexit: Bool): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_debugSetProcessKillOnExit(killonexit)

public actual fun decodePointer(ptr: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_decodePointer(ptr?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun decodeRemotePointer(processhandle: Handle, ptr: COpaquePointer?, decodedptr: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_decodeRemotePointer(processhandle?.value?.toCPointer<ByteVar>(), ptr?.value?.toCPointer<ByteVar>(), decodedptr?.value?.toCPointer<ByteVar>())

public actual fun decodeSystemPointer(ptr: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_decodeSystemPointer(ptr?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun encodePointer(ptr: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_encodePointer(ptr?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun encodeRemotePointer(processhandle: Handle, ptr: COpaquePointer?, encodedptr: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_encodeRemotePointer(processhandle?.value?.toCPointer<ByteVar>(), ptr?.value?.toCPointer<ByteVar>(), encodedptr?.value?.toCPointer<ByteVar>())

public actual fun encodeSystemPointer(ptr: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_encodeSystemPointer(ptr?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun enumDirTree(hprocess: Handle, rootpath: Pcstr, inputpathname: Pcstr, outputpathbuffer: Pstr, cb: PenumdirtreeCallback, data: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_enumDirTree(hprocess?.value?.toCPointer<ByteVar>(), rootpath?.value?.toCPointer<ByteVar>(), inputpathname?.value?.toCPointer<ByteVar>(), outputpathbuffer?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), data?.value?.toCPointer<ByteVar>())

public actual fun enumDirTreeW(hprocess: Handle, rootpath: Pcwstr, inputpathname: Pcwstr, outputpathbuffer: Pwstr, cb: PenumdirtreeCallbackw, data: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_enumDirTreeW(hprocess?.value?.toCPointer<ByteVar>(), rootpath?.value?.toCPointer<ByteVar>(), inputpathname?.value?.toCPointer<ByteVar>(), outputpathbuffer?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), data?.value?.toCPointer<ByteVar>())

public actual fun enumerateLoadedModules64(hprocess: Handle, enumloadedmodulescallback: PenumloadedModulesCallback64, usercontext: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_enumerateLoadedModules64(hprocess?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), usercontext?.value?.toCPointer<ByteVar>())

public actual fun enumerateLoadedModulesEx(hprocess: Handle, enumloadedmodulescallback: PenumloadedModulesCallback64, usercontext: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_enumerateLoadedModulesEx(hprocess?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), usercontext?.value?.toCPointer<ByteVar>())

public actual fun enumerateLoadedModulesExW(hprocess: Handle, enumloadedmodulescallback: PenumloadedModulesCallbackw64, usercontext: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_enumerateLoadedModulesExW(hprocess?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), usercontext?.value?.toCPointer<ByteVar>())

public actual fun enumerateLoadedModulesW64(hprocess: Handle, enumloadedmodulescallback: PenumloadedModulesCallbackw64, usercontext: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_enumerateLoadedModulesW64(hprocess?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), usercontext?.value?.toCPointer<ByteVar>())

public actual fun fatalAppExitA(uaction: UInt, lpmessagetext: Pcstr) {
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_fatalAppExitA(uaction, lpmessagetext?.value?.toCPointer<ByteVar>())
}

public actual fun fatalAppExitW(uaction: UInt, lpmessagetext: Pcwstr) {
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_fatalAppExitW(uaction, lpmessagetext?.value?.toCPointer<ByteVar>())
}

public actual fun fatalExit(exitcode: Int): Nothing {
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_fatalExit(exitcode)
    error("Unreachable noreturn C function fatalExit")
}

public actual fun findDebugInfoFile(filename: Pcstr, symbolpath: Pcstr, debugfilepath: Pstr): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_findDebugInfoFile(filename?.value?.toCPointer<ByteVar>(), symbolpath?.value?.toCPointer<ByteVar>(), debugfilepath?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun findDebugInfoFileEx(filename: Pcstr, symbolpath: Pcstr, debugfilepath: Pstr, callback: PfindDebugFileCallback, callerdata: COpaquePointer?): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_findDebugInfoFileEx(filename?.value?.toCPointer<ByteVar>(), symbolpath?.value?.toCPointer<ByteVar>(), debugfilepath?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), callerdata?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun findDebugInfoFileExW(filename: Pcwstr, symbolpath: Pcwstr, debugfilepath: Pwstr, callback: PfindDebugFileCallbackw, callerdata: COpaquePointer?): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_findDebugInfoFileExW(filename?.value?.toCPointer<ByteVar>(), symbolpath?.value?.toCPointer<ByteVar>(), debugfilepath?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), callerdata?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun findExecutableImage(filename: Pcstr, symbolpath: Pcstr, imagefilepath: Pstr): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_findExecutableImage(filename?.value?.toCPointer<ByteVar>(), symbolpath?.value?.toCPointer<ByteVar>(), imagefilepath?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun findExecutableImageEx(filename: Pcstr, symbolpath: Pcstr, imagefilepath: Pstr, callback: PfindExeFileCallback, callerdata: COpaquePointer?): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_findExecutableImageEx(filename?.value?.toCPointer<ByteVar>(), symbolpath?.value?.toCPointer<ByteVar>(), imagefilepath?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), callerdata?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun findExecutableImageExW(filename: Pcwstr, symbolpath: Pcwstr, imagefilepath: Pwstr, callback: PfindExeFileCallbackw, callerdata: COpaquePointer?): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_findExecutableImageExW(filename?.value?.toCPointer<ByteVar>(), symbolpath?.value?.toCPointer<ByteVar>(), imagefilepath?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), callerdata?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun findFileInPath(hprocess: Handle, searchpatha: Pcstr, filename: Pcstr, id: COpaquePointer?, two: UInt, three: UInt, flags: UInt, filepath: Pstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_findFileInPath(hprocess?.value?.toCPointer<ByteVar>(), searchpatha?.value?.toCPointer<ByteVar>(), filename?.value?.toCPointer<ByteVar>(), id?.value?.toCPointer<ByteVar>(), two, three, flags, filepath?.value?.toCPointer<ByteVar>())

public actual fun findFileInSearchPath(hprocess: Handle, searchpatha: Pcstr, filename: Pcstr, one: UInt, two: UInt, three: UInt, filepath: Pstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_findFileInSearchPath(hprocess?.value?.toCPointer<ByteVar>(), searchpatha?.value?.toCPointer<ByteVar>(), filename?.value?.toCPointer<ByteVar>(), one, two, three, filepath?.value?.toCPointer<ByteVar>())

public actual fun flushInstructionCache(hprocess: Handle, lpbaseaddress: COpaquePointer?, dwsize: ULong): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_flushInstructionCache(hprocess?.value?.toCPointer<ByteVar>(), lpbaseaddress?.value?.toCPointer<ByteVar>(), dwsize)

public actual fun formatMessageA(dwflags: FormatMessageOptions, lpsource: COpaquePointer?, dwmessageid: UInt, dwlanguageid: UInt, lpbuffer: Pstr, nsize: UInt, arguments: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_formatMessageA(dwflags, lpsource?.value?.toCPointer<ByteVar>(), dwmessageid, dwlanguageid, lpbuffer?.value?.toCPointer<ByteVar>(), nsize, arguments?.value?.toCPointer<ByteVar>())

public actual fun formatMessageW(dwflags: FormatMessageOptions, lpsource: COpaquePointer?, dwmessageid: UInt, dwlanguageid: UInt, lpbuffer: Pwstr, nsize: UInt, arguments: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_formatMessageW(dwflags, lpsource?.value?.toCPointer<ByteVar>(), dwmessageid, dwlanguageid, lpbuffer?.value?.toCPointer<ByteVar>(), nsize, arguments?.value?.toCPointer<ByteVar>())

public actual fun getEnabledXStateFeatures(): ULong =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_getEnabledXStateFeatures()

public actual fun getErrorMode(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_getErrorMode()

public actual fun getImageConfigInformation(loadedimage: COpaquePointer?, imageconfiginformation: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_getImageConfigInformation(loadedimage?.value?.toCPointer<ByteVar>(), imageconfiginformation?.value?.toCPointer<ByteVar>())

public actual fun getImageUnusedHeaderBytes(loadedimage: COpaquePointer?, sizeunusedheaderbytes: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_getImageUnusedHeaderBytes(loadedimage?.value?.toCPointer<ByteVar>(), sizeunusedheaderbytes?.value?.toCPointer<ByteVar>())

public actual fun getSymLoadError(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_getSymLoadError()

public actual fun getThreadContext(hthread: Handle, lpcontext: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_getThreadContext(hthread?.value?.toCPointer<ByteVar>(), lpcontext?.value?.toCPointer<ByteVar>())

public actual fun getThreadErrorMode(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_getThreadErrorMode()

public actual fun getThreadSelectorEntry(hthread: Handle, dwselector: UInt, lpselectorentry: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_getThreadSelectorEntry(hthread?.value?.toCPointer<ByteVar>(), dwselector, lpselectorentry?.value?.toCPointer<ByteVar>())

public actual fun getThreadWaitChain(wcthandle: COpaquePointer?, context: ULong, flags: WaitChainThreadOptions, threadid: UInt, nodecount: COpaquePointer?, nodeinfoarray: COpaquePointer?, iscycle: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_getThreadWaitChain(wcthandle?.value?.toCPointer<ByteVar>(), context, flags, threadid, nodecount?.value?.toCPointer<ByteVar>(), nodeinfoarray?.value?.toCPointer<ByteVar>(), iscycle?.value?.toCPointer<ByteVar>())

public actual fun getTimestampForLoadedLibrary(module: Hmodule): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_getTimestampForLoadedLibrary(module?.value?.toCPointer<ByteVar>())

public actual fun getXStateFeaturesMask(context: COpaquePointer?, featuremask: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_getXStateFeaturesMask(context?.value?.toCPointer<ByteVar>(), featuremask?.value?.toCPointer<ByteVar>())

public actual fun imageAddCertificate(filehandle: Handle, certificate: COpaquePointer?, index: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_imageAddCertificate(filehandle?.value?.toCPointer<ByteVar>(), certificate?.value?.toCPointer<ByteVar>(), index?.value?.toCPointer<ByteVar>())

public actual fun imageDirectoryEntryToData(base: COpaquePointer?, mappedasimage: Boolean, directoryentry: ImageDirectoryEntry, size: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_imageDirectoryEntryToData(base?.value?.toCPointer<ByteVar>(), mappedasimage, directoryentry, size?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun imageDirectoryEntryToDataEx(base: COpaquePointer?, mappedasimage: Boolean, directoryentry: ImageDirectoryEntry, size: COpaquePointer?, foundheader: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_imageDirectoryEntryToDataEx(base?.value?.toCPointer<ByteVar>(), mappedasimage, directoryentry, size?.value?.toCPointer<ByteVar>(), foundheader?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun imageEnumerateCertificates(filehandle: Handle, typefilter: UShort, certificatecount: COpaquePointer?, indices: COpaquePointer?, indexcount: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_imageEnumerateCertificates(filehandle?.value?.toCPointer<ByteVar>(), typefilter, certificatecount?.value?.toCPointer<ByteVar>(), indices?.value?.toCPointer<ByteVar>(), indexcount)

public actual fun imageGetCertificateData(filehandle: Handle, certificateindex: UInt, certificate: COpaquePointer?, requiredlength: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_imageGetCertificateData(filehandle?.value?.toCPointer<ByteVar>(), certificateindex, certificate?.value?.toCPointer<ByteVar>(), requiredlength?.value?.toCPointer<ByteVar>())

public actual fun imageGetCertificateHeader(filehandle: Handle, certificateindex: UInt, certificateheader: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_imageGetCertificateHeader(filehandle?.value?.toCPointer<ByteVar>(), certificateindex, certificateheader?.value?.toCPointer<ByteVar>())

public actual fun imageGetDigestStream(filehandle: Handle, digestlevel: UInt, digestfunction: DigestFunction, digesthandle: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_imageGetDigestStream(filehandle?.value?.toCPointer<ByteVar>(), digestlevel, 0L.toCPointer<ByteVar>(), digesthandle?.value?.toCPointer<ByteVar>())

public actual fun imageLoad(dllname: Pcstr, dllpath: Pcstr): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_imageLoad(dllname?.value?.toCPointer<ByteVar>(), dllpath?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun imageNtHeader(base: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_imageNtHeader(base?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun imageRemoveCertificate(filehandle: Handle, index: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_imageRemoveCertificate(filehandle?.value?.toCPointer<ByteVar>(), index)

public actual fun imageRvaToSection(ntheaders: COpaquePointer?, base: COpaquePointer?, rva: UInt): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_imageRvaToSection(ntheaders?.value?.toCPointer<ByteVar>(), base?.value?.toCPointer<ByteVar>(), rva)?.let { COpaquePointer(it.toLong()) }

public actual fun imageRvaToVa(ntheaders: COpaquePointer?, base: COpaquePointer?, rva: UInt, lastrvasection: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_imageRvaToVa(ntheaders?.value?.toCPointer<ByteVar>(), base?.value?.toCPointer<ByteVar>(), rva, lastrvasection?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun imageUnload(loadedimage: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_imageUnload(loadedimage?.value?.toCPointer<ByteVar>())

public actual fun imagehlpApiVersion(): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_imagehlpApiVersion()?.let { COpaquePointer(it.toLong()) }

public actual fun imagehlpApiVersionEx(appversion: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_imagehlpApiVersionEx(appversion?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun initializeContext(buffer: COpaquePointer?, contextflags: ContextFlags, context: COpaquePointer?, contextlength: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_initializeContext(buffer?.value?.toCPointer<ByteVar>(), contextflags, context?.value?.toCPointer<ByteVar>(), contextlength?.value?.toCPointer<ByteVar>())

public actual fun initializeContext2(buffer: COpaquePointer?, contextflags: ContextFlags, context: COpaquePointer?, contextlength: COpaquePointer?, xstatecompactionmask: ULong): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_initializeContext2(buffer?.value?.toCPointer<ByteVar>(), contextflags, context?.value?.toCPointer<ByteVar>(), contextlength?.value?.toCPointer<ByteVar>(), xstatecompactionmask)

public actual fun isDebuggerPresent(): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_isDebuggerPresent()

public actual fun locateXStateFeature(context: COpaquePointer?, featureid: UInt, length: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_locateXStateFeature(context?.value?.toCPointer<ByteVar>(), featureid, length?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun makeSureDirectoryPathExists(dirpath: Pcstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_makeSureDirectoryPathExists(dirpath?.value?.toCPointer<ByteVar>())

public actual fun mapAndLoad(imagename: Pcstr, dllpath: Pcstr, loadedimage: COpaquePointer?, dotdll: Bool, readonly: Bool): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_mapAndLoad(imagename?.value?.toCPointer<ByteVar>(), dllpath?.value?.toCPointer<ByteVar>(), loadedimage?.value?.toCPointer<ByteVar>(), dotdll, readonly)

public actual fun mapFileAndCheckSumA(filename: Pcstr, headersum: COpaquePointer?, checksum: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_mapFileAndCheckSumA(filename?.value?.toCPointer<ByteVar>(), headersum?.value?.toCPointer<ByteVar>(), checksum?.value?.toCPointer<ByteVar>())

public actual fun mapFileAndCheckSumW(filename: Pcwstr, headersum: COpaquePointer?, checksum: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_mapFileAndCheckSumW(filename?.value?.toCPointer<ByteVar>(), headersum?.value?.toCPointer<ByteVar>(), checksum?.value?.toCPointer<ByteVar>())

public actual fun messageBeep(utype: MessageboxStyle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_messageBeep(utype)

public actual fun miniDumpReadDumpStream(baseofdump: COpaquePointer?, streamnumber: UInt, dir: COpaquePointer?, streampointer: COpaquePointer?, streamsize: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_miniDumpReadDumpStream(baseofdump?.value?.toCPointer<ByteVar>(), streamnumber, dir?.value?.toCPointer<ByteVar>(), streampointer?.value?.toCPointer<ByteVar>(), streamsize?.value?.toCPointer<ByteVar>())

public actual fun miniDumpWriteDump(hprocess: Handle, processid: UInt, hfile: Handle, dumptype: MinidumpType, exceptionparam: COpaquePointer?, userstreamparam: COpaquePointer?, callbackparam: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_miniDumpWriteDump(hprocess?.value?.toCPointer<ByteVar>(), processid, hfile?.value?.toCPointer<ByteVar>(), dumptype, exceptionparam?.value?.toCPointer<ByteVar>(), userstreamparam?.value?.toCPointer<ByteVar>(), callbackparam?.value?.toCPointer<ByteVar>())

public actual fun openThreadWaitChainSession(flags: OpenThreadWaitChainSessionFlags, callback: Pwaitchaincallback): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_openThreadWaitChainSession(flags, 0L.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun outputDebugStringA(lpoutputstring: Pcstr) {
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_outputDebugStringA(lpoutputstring?.value?.toCPointer<ByteVar>())
}

public actual fun outputDebugStringW(lpoutputstring: Pcwstr) {
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_outputDebugStringW(lpoutputstring?.value?.toCPointer<ByteVar>())
}

public actual fun raiseException(dwexceptioncode: UInt, dwexceptionflags: UInt, nnumberofarguments: UInt, lparguments: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_raiseException(dwexceptioncode, dwexceptionflags, nnumberofarguments, lparguments?.value?.toCPointer<ByteVar>())
}

public actual fun raiseFailFastException(pexceptionrecord: COpaquePointer?, pcontextrecord: COpaquePointer?, dwflags: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_raiseFailFastException(pexceptionrecord?.value?.toCPointer<ByteVar>(), pcontextrecord?.value?.toCPointer<ByteVar>(), dwflags)
}

public actual fun rangeMapAddPeImageSections(rmaphandle: COpaquePointer?, imagename: Pcwstr, mappedimage: COpaquePointer?, mappingbytes: UInt, imagebase: ULong, usertag: ULong, mappingflags: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_rangeMapAddPeImageSections(rmaphandle?.value?.toCPointer<ByteVar>(), imagename?.value?.toCPointer<ByteVar>(), mappedimage?.value?.toCPointer<ByteVar>(), mappingbytes, imagebase, usertag, mappingflags)

public actual fun rangeMapCreate(): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_rangeMapCreate()?.let { COpaquePointer(it.toLong()) }

public actual fun rangeMapFree(rmaphandle: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_rangeMapFree(rmaphandle?.value?.toCPointer<ByteVar>())
}

public actual fun rangeMapRead(rmaphandle: COpaquePointer?, offset: ULong, buffer: COpaquePointer?, requestbytes: UInt, flags: UInt, donebytes: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_rangeMapRead(rmaphandle?.value?.toCPointer<ByteVar>(), offset, buffer?.value?.toCPointer<ByteVar>(), requestbytes, flags, donebytes?.value?.toCPointer<ByteVar>())

public actual fun rangeMapRemove(rmaphandle: COpaquePointer?, usertag: ULong): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_rangeMapRemove(rmaphandle?.value?.toCPointer<ByteVar>(), usertag)

public actual fun rangeMapWrite(rmaphandle: COpaquePointer?, offset: ULong, buffer: COpaquePointer?, requestbytes: UInt, flags: UInt, donebytes: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_rangeMapWrite(rmaphandle?.value?.toCPointer<ByteVar>(), offset, buffer?.value?.toCPointer<ByteVar>(), requestbytes, flags, donebytes?.value?.toCPointer<ByteVar>())

public actual fun reBaseImage(currentimagename: Pcstr, symbolpath: Pcstr, frebase: Bool, frebasesysfileok: Bool, fgoingdown: Bool, checkimagesize: UInt, oldimagesize: COpaquePointer?, oldimagebase: COpaquePointer?, newimagesize: COpaquePointer?, newimagebase: COpaquePointer?, timestamp: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_reBaseImage(currentimagename?.value?.toCPointer<ByteVar>(), symbolpath?.value?.toCPointer<ByteVar>(), frebase, frebasesysfileok, fgoingdown, checkimagesize, oldimagesize?.value?.toCPointer<ByteVar>(), oldimagebase?.value?.toCPointer<ByteVar>(), newimagesize?.value?.toCPointer<ByteVar>(), newimagebase?.value?.toCPointer<ByteVar>(), timestamp)

public actual fun reBaseImage64(currentimagename: Pcstr, symbolpath: Pcstr, frebase: Bool, frebasesysfileok: Bool, fgoingdown: Bool, checkimagesize: UInt, oldimagesize: COpaquePointer?, oldimagebase: COpaquePointer?, newimagesize: COpaquePointer?, newimagebase: COpaquePointer?, timestamp: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_reBaseImage64(currentimagename?.value?.toCPointer<ByteVar>(), symbolpath?.value?.toCPointer<ByteVar>(), frebase, frebasesysfileok, fgoingdown, checkimagesize, oldimagesize?.value?.toCPointer<ByteVar>(), oldimagebase?.value?.toCPointer<ByteVar>(), newimagesize?.value?.toCPointer<ByteVar>(), newimagebase?.value?.toCPointer<ByteVar>(), timestamp)

public actual fun readProcessMemory(hprocess: Handle, lpbaseaddress: COpaquePointer?, lpbuffer: COpaquePointer?, nsize: ULong, lpnumberofbytesread: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_readProcessMemory(hprocess?.value?.toCPointer<ByteVar>(), lpbaseaddress?.value?.toCPointer<ByteVar>(), lpbuffer?.value?.toCPointer<ByteVar>(), nsize, lpnumberofbytesread?.value?.toCPointer<ByteVar>())

public actual fun registerWaitChainCOMCallback(callstatecallback: Pcogetcallstate, activationstatecallback: Pcogetactivationstate) {
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_registerWaitChainCOMCallback(0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())
}

public actual fun removeInvalidModuleList(hprocess: Handle) {
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_removeInvalidModuleList(hprocess?.value?.toCPointer<ByteVar>())
}

public actual fun removeVectoredContinueHandler(handle: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_removeVectoredContinueHandler(handle?.value?.toCPointer<ByteVar>())

public actual fun removeVectoredExceptionHandler(handle: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_removeVectoredExceptionHandler(handle?.value?.toCPointer<ByteVar>())

public actual fun reportSymbolLoadSummary(hprocess: Handle, ploadmodule: Pcwstr, psymboldata: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_reportSymbolLoadSummary(hprocess?.value?.toCPointer<ByteVar>(), ploadmodule?.value?.toCPointer<ByteVar>(), psymboldata?.value?.toCPointer<ByteVar>())

public actual fun rtlAddFunctionTable(functiontable: COpaquePointer?, entrycount: UInt, baseaddress: ULong): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_rtlAddFunctionTable(functiontable?.value?.toCPointer<ByteVar>(), entrycount, baseaddress)

public actual fun rtlAddGrowableFunctionTable(dynamictable: COpaquePointer?, functiontable: COpaquePointer?, entrycount: UInt, maximumentrycount: UInt, rangebase: ULong, rangeend: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_rtlAddGrowableFunctionTable(dynamictable?.value?.toCPointer<ByteVar>(), functiontable?.value?.toCPointer<ByteVar>(), entrycount, maximumentrycount, rangebase, rangeend)

public actual fun rtlCaptureContext(contextrecord: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_rtlCaptureContext(contextrecord?.value?.toCPointer<ByteVar>())
}

public actual fun rtlCaptureContext2(contextrecord: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_rtlCaptureContext2(contextrecord?.value?.toCPointer<ByteVar>())
}

public actual fun rtlCaptureStackBackTrace(framestoskip: UInt, framestocapture: UInt, backtrace: COpaquePointer?, backtracehash: COpaquePointer?): UShort =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_rtlCaptureStackBackTrace(framestoskip, framestocapture, backtrace?.value?.toCPointer<ByteVar>(), backtracehash?.value?.toCPointer<ByteVar>())

public actual fun rtlDeleteFunctionTable(functiontable: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_rtlDeleteFunctionTable(functiontable?.value?.toCPointer<ByteVar>())

public actual fun rtlDeleteGrowableFunctionTable(dynamictable: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_rtlDeleteGrowableFunctionTable(dynamictable?.value?.toCPointer<ByteVar>())
}

public actual fun rtlGrowFunctionTable(dynamictable: COpaquePointer?, newentrycount: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_rtlGrowFunctionTable(dynamictable?.value?.toCPointer<ByteVar>(), newentrycount)
}

public actual fun rtlInstallFunctionTableCallback(tableidentifier: ULong, baseaddress: ULong, length: UInt, callback: PgetRuntimeFunctionCallback, context: COpaquePointer?, outofprocesscallbackdll: Pcwstr): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_rtlInstallFunctionTableCallback(tableidentifier, baseaddress, length, 0L.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>(), outofprocesscallbackdll?.value?.toCPointer<ByteVar>())

public actual fun rtlLookupFunctionEntry(controlpc: ULong, imagebase: COpaquePointer?, historytable: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_rtlLookupFunctionEntry(controlpc, imagebase?.value?.toCPointer<ByteVar>(), historytable?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun rtlPcToFileHeader(pcvalue: COpaquePointer?, baseofimage: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_rtlPcToFileHeader(pcvalue?.value?.toCPointer<ByteVar>(), baseofimage?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun rtlRaiseException(exceptionrecord: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_rtlRaiseException(exceptionrecord?.value?.toCPointer<ByteVar>())
}

public actual fun rtlRestoreContext(contextrecord: COpaquePointer?, exceptionrecord: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_rtlRestoreContext(contextrecord?.value?.toCPointer<ByteVar>(), exceptionrecord?.value?.toCPointer<ByteVar>())
}

public actual fun rtlUnwind(targetframe: COpaquePointer?, targetip: COpaquePointer?, exceptionrecord: COpaquePointer?, returnvalue: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_rtlUnwind(targetframe?.value?.toCPointer<ByteVar>(), targetip?.value?.toCPointer<ByteVar>(), exceptionrecord?.value?.toCPointer<ByteVar>(), returnvalue?.value?.toCPointer<ByteVar>())
}

public actual fun rtlUnwindEx(targetframe: COpaquePointer?, targetip: COpaquePointer?, exceptionrecord: COpaquePointer?, returnvalue: COpaquePointer?, contextrecord: COpaquePointer?, historytable: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_rtlUnwindEx(targetframe?.value?.toCPointer<ByteVar>(), targetip?.value?.toCPointer<ByteVar>(), exceptionrecord?.value?.toCPointer<ByteVar>(), returnvalue?.value?.toCPointer<ByteVar>(), contextrecord?.value?.toCPointer<ByteVar>(), historytable?.value?.toCPointer<ByteVar>())
}

public actual fun rtlVirtualUnwind(handlertype: RtlVirtualUnwindHandlerType, imagebase: ULong, controlpc: ULong, functionentry: COpaquePointer?, contextrecord: COpaquePointer?, handlerdata: COpaquePointer?, establisherframe: COpaquePointer?, contextpointers: COpaquePointer?): ExceptionRoutine =
    null

public actual fun searchTreeForFile(rootpath: Pcstr, inputpathname: Pcstr, outputpathbuffer: Pstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_searchTreeForFile(rootpath?.value?.toCPointer<ByteVar>(), inputpathname?.value?.toCPointer<ByteVar>(), outputpathbuffer?.value?.toCPointer<ByteVar>())

public actual fun searchTreeForFileW(rootpath: Pcwstr, inputpathname: Pcwstr, outputpathbuffer: Pwstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_searchTreeForFileW(rootpath?.value?.toCPointer<ByteVar>(), inputpathname?.value?.toCPointer<ByteVar>(), outputpathbuffer?.value?.toCPointer<ByteVar>())

public actual fun setCheckUserInterruptShared(lpstartaddress: LpcallBackUserInterruptRoutine) {
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_setCheckUserInterruptShared(0L.toCPointer<ByteVar>())
}

public actual fun setErrorMode(umode: ThreadErrorMode): ThreadErrorMode =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_setErrorMode(umode)

public actual fun setImageConfigInformation(loadedimage: COpaquePointer?, imageconfiginformation: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_setImageConfigInformation(loadedimage?.value?.toCPointer<ByteVar>(), imageconfiginformation?.value?.toCPointer<ByteVar>())

public actual fun setSymLoadError(error: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_setSymLoadError(error)
}

public actual fun setThreadContext(hthread: Handle, lpcontext: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_setThreadContext(hthread?.value?.toCPointer<ByteVar>(), lpcontext?.value?.toCPointer<ByteVar>())

public actual fun setThreadErrorMode(dwnewmode: ThreadErrorMode, lpoldmode: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_setThreadErrorMode(dwnewmode, lpoldmode?.value?.toCPointer<ByteVar>())

public actual fun setUnhandledExceptionFilter(lptoplevelexceptionfilter: LptopLevelExceptionFilter): LptopLevelExceptionFilter =
    null

public actual fun setXStateFeaturesMask(context: COpaquePointer?, featuremask: ULong): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_setXStateFeaturesMask(context?.value?.toCPointer<ByteVar>(), featuremask)

public actual fun stackWalk2(machinetype: UInt, hprocess: Handle, hthread: Handle, stackframe: COpaquePointer?, contextrecord: COpaquePointer?, readmemoryroutine: PreadProcessMemoryRoutine64, functiontableaccessroutine: PfunctionTableAccessRoutine64, getmodulebaseroutine: PgetModuleBaseRoutine64, translateaddress: PtranslateAddressRoutine64, gettargetattributevalue: PgetTargetAttributeValue64, flags: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_stackWalk2(machinetype, hprocess?.value?.toCPointer<ByteVar>(), hthread?.value?.toCPointer<ByteVar>(), stackframe?.value?.toCPointer<ByteVar>(), contextrecord?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), flags)

public actual fun stackWalk64(machinetype: UInt, hprocess: Handle, hthread: Handle, stackframe: COpaquePointer?, contextrecord: COpaquePointer?, readmemoryroutine: PreadProcessMemoryRoutine64, functiontableaccessroutine: PfunctionTableAccessRoutine64, getmodulebaseroutine: PgetModuleBaseRoutine64, translateaddress: PtranslateAddressRoutine64): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_stackWalk64(machinetype, hprocess?.value?.toCPointer<ByteVar>(), hthread?.value?.toCPointer<ByteVar>(), stackframe?.value?.toCPointer<ByteVar>(), contextrecord?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun stackWalkEx(machinetype: UInt, hprocess: Handle, hthread: Handle, stackframe: COpaquePointer?, contextrecord: COpaquePointer?, readmemoryroutine: PreadProcessMemoryRoutine64, functiontableaccessroutine: PfunctionTableAccessRoutine64, getmodulebaseroutine: PgetModuleBaseRoutine64, translateaddress: PtranslateAddressRoutine64, flags: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_stackWalkEx(machinetype, hprocess?.value?.toCPointer<ByteVar>(), hthread?.value?.toCPointer<ByteVar>(), stackframe?.value?.toCPointer<ByteVar>(), contextrecord?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), flags)

public actual fun symAddSourceStream(hprocess: Handle, base: ULong, streamfile: Pcstr, buffer: COpaquePointer?, size: ULong): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symAddSourceStream(hprocess?.value?.toCPointer<ByteVar>(), base, streamfile?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), size)

public actual fun symAddSourceStreamA(hprocess: Handle, base: ULong, streamfile: Pcstr, buffer: COpaquePointer?, size: ULong): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symAddSourceStreamA(hprocess?.value?.toCPointer<ByteVar>(), base, streamfile?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), size)

public actual fun symAddSourceStreamW(hprocess: Handle, base: ULong, filespec: Pcwstr, buffer: COpaquePointer?, size: ULong): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symAddSourceStreamW(hprocess?.value?.toCPointer<ByteVar>(), base, filespec?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), size)

public actual fun symAddSymbol(hprocess: Handle, baseofdll: ULong, name: Pcstr, address: ULong, size: UInt, flags: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symAddSymbol(hprocess?.value?.toCPointer<ByteVar>(), baseofdll, name?.value?.toCPointer<ByteVar>(), address, size, flags)

public actual fun symAddSymbolW(hprocess: Handle, baseofdll: ULong, name: Pcwstr, address: ULong, size: UInt, flags: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symAddSymbolW(hprocess?.value?.toCPointer<ByteVar>(), baseofdll, name?.value?.toCPointer<ByteVar>(), address, size, flags)

public actual fun symAddrIncludeInlineTrace(hprocess: Handle, address: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symAddrIncludeInlineTrace(hprocess?.value?.toCPointer<ByteVar>(), address)

public actual fun symCleanup(hprocess: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symCleanup(hprocess?.value?.toCPointer<ByteVar>())

public actual fun symCompareInlineTrace(hprocess: Handle, address1: ULong, inlinecontext1: UInt, retaddress1: ULong, address2: ULong, retaddress2: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symCompareInlineTrace(hprocess?.value?.toCPointer<ByteVar>(), address1, inlinecontext1, retaddress1, address2, retaddress2)

public actual fun symDeleteSymbol(hprocess: Handle, baseofdll: ULong, name: Pcstr, address: ULong, flags: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symDeleteSymbol(hprocess?.value?.toCPointer<ByteVar>(), baseofdll, name?.value?.toCPointer<ByteVar>(), address, flags)

public actual fun symDeleteSymbolW(hprocess: Handle, baseofdll: ULong, name: Pcwstr, address: ULong, flags: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symDeleteSymbolW(hprocess?.value?.toCPointer<ByteVar>(), baseofdll, name?.value?.toCPointer<ByteVar>(), address, flags)

public actual fun symEnumLines(hprocess: Handle, base: ULong, obj: Pcstr, file: Pcstr, enumlinescallback: PsymEnumlinesCallback, usercontext: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symEnumLines(hprocess?.value?.toCPointer<ByteVar>(), base, obj?.value?.toCPointer<ByteVar>(), file?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), usercontext?.value?.toCPointer<ByteVar>())

public actual fun symEnumLinesW(hprocess: Handle, base: ULong, obj: Pcwstr, file: Pcwstr, enumlinescallback: PsymEnumlinesCallbackw, usercontext: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symEnumLinesW(hprocess?.value?.toCPointer<ByteVar>(), base, obj?.value?.toCPointer<ByteVar>(), file?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), usercontext?.value?.toCPointer<ByteVar>())

public actual fun symEnumProcesses(enumprocessescallback: PsymEnumprocessesCallback, usercontext: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symEnumProcesses(0L.toCPointer<ByteVar>(), usercontext?.value?.toCPointer<ByteVar>())

public actual fun symEnumSourceFileTokens(hprocess: Handle, base: ULong, callback: Penumsourcefiletokenscallback): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symEnumSourceFileTokens(hprocess?.value?.toCPointer<ByteVar>(), base, 0L.toCPointer<ByteVar>())

public actual fun symEnumSourceFiles(hprocess: Handle, modbase: ULong, mask: Pcstr, cbsrcfiles: PsymEnumsourcefilesCallback, usercontext: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symEnumSourceFiles(hprocess?.value?.toCPointer<ByteVar>(), modbase, mask?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), usercontext?.value?.toCPointer<ByteVar>())

public actual fun symEnumSourceFilesW(hprocess: Handle, modbase: ULong, mask: Pcwstr, cbsrcfiles: PsymEnumsourcefilesCallbackw, usercontext: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symEnumSourceFilesW(hprocess?.value?.toCPointer<ByteVar>(), modbase, mask?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), usercontext?.value?.toCPointer<ByteVar>())

public actual fun symEnumSourceLines(hprocess: Handle, base: ULong, obj: Pcstr, file: Pcstr, line: UInt, flags: UInt, enumlinescallback: PsymEnumlinesCallback, usercontext: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symEnumSourceLines(hprocess?.value?.toCPointer<ByteVar>(), base, obj?.value?.toCPointer<ByteVar>(), file?.value?.toCPointer<ByteVar>(), line, flags, 0L.toCPointer<ByteVar>(), usercontext?.value?.toCPointer<ByteVar>())

public actual fun symEnumSourceLinesW(hprocess: Handle, base: ULong, obj: Pcwstr, file: Pcwstr, line: UInt, flags: UInt, enumlinescallback: PsymEnumlinesCallbackw, usercontext: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symEnumSourceLinesW(hprocess?.value?.toCPointer<ByteVar>(), base, obj?.value?.toCPointer<ByteVar>(), file?.value?.toCPointer<ByteVar>(), line, flags, 0L.toCPointer<ByteVar>(), usercontext?.value?.toCPointer<ByteVar>())

public actual fun symEnumSym(hprocess: Handle, baseofdll: ULong, enumsymbolscallback: PsymEnumeratesymbolsCallback, usercontext: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symEnumSym(hprocess?.value?.toCPointer<ByteVar>(), baseofdll, 0L.toCPointer<ByteVar>(), usercontext?.value?.toCPointer<ByteVar>())

public actual fun symEnumSymbols(hprocess: Handle, baseofdll: ULong, mask: Pcstr, enumsymbolscallback: PsymEnumeratesymbolsCallback, usercontext: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symEnumSymbols(hprocess?.value?.toCPointer<ByteVar>(), baseofdll, mask?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), usercontext?.value?.toCPointer<ByteVar>())

public actual fun symEnumSymbolsEx(hprocess: Handle, baseofdll: ULong, mask: Pcstr, enumsymbolscallback: PsymEnumeratesymbolsCallback, usercontext: COpaquePointer?, options: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symEnumSymbolsEx(hprocess?.value?.toCPointer<ByteVar>(), baseofdll, mask?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), usercontext?.value?.toCPointer<ByteVar>(), options)

public actual fun symEnumSymbolsExW(hprocess: Handle, baseofdll: ULong, mask: Pcwstr, enumsymbolscallback: PsymEnumeratesymbolsCallbackw, usercontext: COpaquePointer?, options: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symEnumSymbolsExW(hprocess?.value?.toCPointer<ByteVar>(), baseofdll, mask?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), usercontext?.value?.toCPointer<ByteVar>(), options)

public actual fun symEnumSymbolsForAddr(hprocess: Handle, address: ULong, enumsymbolscallback: PsymEnumeratesymbolsCallback, usercontext: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symEnumSymbolsForAddr(hprocess?.value?.toCPointer<ByteVar>(), address, 0L.toCPointer<ByteVar>(), usercontext?.value?.toCPointer<ByteVar>())

public actual fun symEnumSymbolsForAddrW(hprocess: Handle, address: ULong, enumsymbolscallback: PsymEnumeratesymbolsCallbackw, usercontext: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symEnumSymbolsForAddrW(hprocess?.value?.toCPointer<ByteVar>(), address, 0L.toCPointer<ByteVar>(), usercontext?.value?.toCPointer<ByteVar>())

public actual fun symEnumSymbolsW(hprocess: Handle, baseofdll: ULong, mask: Pcwstr, enumsymbolscallback: PsymEnumeratesymbolsCallbackw, usercontext: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symEnumSymbolsW(hprocess?.value?.toCPointer<ByteVar>(), baseofdll, mask?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), usercontext?.value?.toCPointer<ByteVar>())

public actual fun symEnumTypes(hprocess: Handle, baseofdll: ULong, enumsymbolscallback: PsymEnumeratesymbolsCallback, usercontext: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symEnumTypes(hprocess?.value?.toCPointer<ByteVar>(), baseofdll, 0L.toCPointer<ByteVar>(), usercontext?.value?.toCPointer<ByteVar>())

public actual fun symEnumTypesByName(hprocess: Handle, baseofdll: ULong, mask: Pcstr, enumsymbolscallback: PsymEnumeratesymbolsCallback, usercontext: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symEnumTypesByName(hprocess?.value?.toCPointer<ByteVar>(), baseofdll, mask?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), usercontext?.value?.toCPointer<ByteVar>())

public actual fun symEnumTypesByNameW(hprocess: Handle, baseofdll: ULong, mask: Pcwstr, enumsymbolscallback: PsymEnumeratesymbolsCallbackw, usercontext: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symEnumTypesByNameW(hprocess?.value?.toCPointer<ByteVar>(), baseofdll, mask?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), usercontext?.value?.toCPointer<ByteVar>())

public actual fun symEnumTypesW(hprocess: Handle, baseofdll: ULong, enumsymbolscallback: PsymEnumeratesymbolsCallbackw, usercontext: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symEnumTypesW(hprocess?.value?.toCPointer<ByteVar>(), baseofdll, 0L.toCPointer<ByteVar>(), usercontext?.value?.toCPointer<ByteVar>())

public actual fun symEnumerateModules64(hprocess: Handle, enummodulescallback: PsymEnummodulesCallback64, usercontext: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symEnumerateModules64(hprocess?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), usercontext?.value?.toCPointer<ByteVar>())

public actual fun symEnumerateModulesW64(hprocess: Handle, enummodulescallback: PsymEnummodulesCallbackw64, usercontext: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symEnumerateModulesW64(hprocess?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), usercontext?.value?.toCPointer<ByteVar>())

public actual fun symEnumerateSymbols64(hprocess: Handle, baseofdll: ULong, enumsymbolscallback: PsymEnumsymbolsCallback64, usercontext: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symEnumerateSymbols64(hprocess?.value?.toCPointer<ByteVar>(), baseofdll, 0L.toCPointer<ByteVar>(), usercontext?.value?.toCPointer<ByteVar>())

public actual fun symEnumerateSymbolsW64(hprocess: Handle, baseofdll: ULong, enumsymbolscallback: PsymEnumsymbolsCallback64w, usercontext: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symEnumerateSymbolsW64(hprocess?.value?.toCPointer<ByteVar>(), baseofdll, 0L.toCPointer<ByteVar>(), usercontext?.value?.toCPointer<ByteVar>())

public actual fun symFindDebugInfoFile(hprocess: Handle, filename: Pcstr, debugfilepath: Pstr, callback: PfindDebugFileCallback, callerdata: COpaquePointer?): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symFindDebugInfoFile(hprocess?.value?.toCPointer<ByteVar>(), filename?.value?.toCPointer<ByteVar>(), debugfilepath?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), callerdata?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun symFindDebugInfoFileW(hprocess: Handle, filename: Pcwstr, debugfilepath: Pwstr, callback: PfindDebugFileCallbackw, callerdata: COpaquePointer?): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symFindDebugInfoFileW(hprocess?.value?.toCPointer<ByteVar>(), filename?.value?.toCPointer<ByteVar>(), debugfilepath?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), callerdata?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun symFindExecutableImage(hprocess: Handle, filename: Pcstr, imagefilepath: Pstr, callback: PfindExeFileCallback, callerdata: COpaquePointer?): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symFindExecutableImage(hprocess?.value?.toCPointer<ByteVar>(), filename?.value?.toCPointer<ByteVar>(), imagefilepath?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), callerdata?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun symFindExecutableImageW(hprocess: Handle, filename: Pcwstr, imagefilepath: Pwstr, callback: PfindExeFileCallbackw, callerdata: COpaquePointer?): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symFindExecutableImageW(hprocess?.value?.toCPointer<ByteVar>(), filename?.value?.toCPointer<ByteVar>(), imagefilepath?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), callerdata?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun symFindFileInPath(hprocess: Handle, searchpatha: Pcstr, filename: Pcstr, id: COpaquePointer?, two: UInt, three: UInt, flags: SymFindIdOption, foundfile: Pstr, callback: Pfindfileinpathcallback, context: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symFindFileInPath(hprocess?.value?.toCPointer<ByteVar>(), searchpatha?.value?.toCPointer<ByteVar>(), filename?.value?.toCPointer<ByteVar>(), id?.value?.toCPointer<ByteVar>(), two, three, flags, foundfile?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>())

public actual fun symFindFileInPathW(hprocess: Handle, searchpatha: Pcwstr, filename: Pcwstr, id: COpaquePointer?, two: UInt, three: UInt, flags: SymFindIdOption, foundfile: Pwstr, callback: Pfindfileinpathcallbackw, context: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symFindFileInPathW(hprocess?.value?.toCPointer<ByteVar>(), searchpatha?.value?.toCPointer<ByteVar>(), filename?.value?.toCPointer<ByteVar>(), id?.value?.toCPointer<ByteVar>(), two, three, flags, foundfile?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>())

public actual fun symFromAddr(hprocess: Handle, address: ULong, displacement: COpaquePointer?, symbol: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symFromAddr(hprocess?.value?.toCPointer<ByteVar>(), address, displacement?.value?.toCPointer<ByteVar>(), symbol?.value?.toCPointer<ByteVar>())

public actual fun symFromAddrW(hprocess: Handle, address: ULong, displacement: COpaquePointer?, symbol: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symFromAddrW(hprocess?.value?.toCPointer<ByteVar>(), address, displacement?.value?.toCPointer<ByteVar>(), symbol?.value?.toCPointer<ByteVar>())

public actual fun symFromIndex(hprocess: Handle, baseofdll: ULong, index: UInt, symbol: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symFromIndex(hprocess?.value?.toCPointer<ByteVar>(), baseofdll, index, symbol?.value?.toCPointer<ByteVar>())

public actual fun symFromIndexW(hprocess: Handle, baseofdll: ULong, index: UInt, symbol: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symFromIndexW(hprocess?.value?.toCPointer<ByteVar>(), baseofdll, index, symbol?.value?.toCPointer<ByteVar>())

public actual fun symFromInlineContext(hprocess: Handle, address: ULong, inlinecontext: UInt, displacement: COpaquePointer?, symbol: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symFromInlineContext(hprocess?.value?.toCPointer<ByteVar>(), address, inlinecontext, displacement?.value?.toCPointer<ByteVar>(), symbol?.value?.toCPointer<ByteVar>())

public actual fun symFromInlineContextW(hprocess: Handle, address: ULong, inlinecontext: UInt, displacement: COpaquePointer?, symbol: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symFromInlineContextW(hprocess?.value?.toCPointer<ByteVar>(), address, inlinecontext, displacement?.value?.toCPointer<ByteVar>(), symbol?.value?.toCPointer<ByteVar>())

public actual fun symFromName(hprocess: Handle, name: Pcstr, symbol: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symFromName(hprocess?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), symbol?.value?.toCPointer<ByteVar>())

public actual fun symFromNameW(hprocess: Handle, name: Pcwstr, symbol: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symFromNameW(hprocess?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), symbol?.value?.toCPointer<ByteVar>())

public actual fun symFromToken(hprocess: Handle, base: ULong, token: UInt, symbol: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symFromToken(hprocess?.value?.toCPointer<ByteVar>(), base, token, symbol?.value?.toCPointer<ByteVar>())

public actual fun symFromTokenW(hprocess: Handle, base: ULong, token: UInt, symbol: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symFromTokenW(hprocess?.value?.toCPointer<ByteVar>(), base, token, symbol?.value?.toCPointer<ByteVar>())

public actual fun symFunctionTableAccess64(hprocess: Handle, addrbase: ULong): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symFunctionTableAccess64(hprocess?.value?.toCPointer<ByteVar>(), addrbase)?.let { COpaquePointer(it.toLong()) }

public actual fun symFunctionTableAccess64AccessRoutines(hprocess: Handle, addrbase: ULong, readmemoryroutine: PreadProcessMemoryRoutine64, getmodulebaseroutine: PgetModuleBaseRoutine64): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symFunctionTableAccess64AccessRoutines(hprocess?.value?.toCPointer<ByteVar>(), addrbase, 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun symGetExtendedOption(option: ImagehlpExtendedOptions): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symGetExtendedOption(option)

public actual fun symGetFileLineOffsets64(hprocess: Handle, modulename: Pcstr, filename: Pcstr, buffer: COpaquePointer?, bufferlines: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symGetFileLineOffsets64(hprocess?.value?.toCPointer<ByteVar>(), modulename?.value?.toCPointer<ByteVar>(), filename?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), bufferlines)

public actual fun symGetHomeDirectory(type: UInt, dir: Pstr, size: ULong): Pstr =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symGetHomeDirectory(type, dir?.value?.toCPointer<ByteVar>(), size)?.let { COpaquePointer(it.toLong()) }

public actual fun symGetHomeDirectoryW(type: UInt, dir: Pwstr, size: ULong): Pwstr =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symGetHomeDirectoryW(type, dir?.value?.toCPointer<ByteVar>(), size)?.let { COpaquePointer(it.toLong()) }

public actual fun symGetLineFromAddr64(hprocess: Handle, qwaddr: ULong, pdwdisplacement: COpaquePointer?, line64: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symGetLineFromAddr64(hprocess?.value?.toCPointer<ByteVar>(), qwaddr, pdwdisplacement?.value?.toCPointer<ByteVar>(), line64?.value?.toCPointer<ByteVar>())

public actual fun symGetLineFromAddrW64(hprocess: Handle, dwaddr: ULong, pdwdisplacement: COpaquePointer?, line: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symGetLineFromAddrW64(hprocess?.value?.toCPointer<ByteVar>(), dwaddr, pdwdisplacement?.value?.toCPointer<ByteVar>(), line?.value?.toCPointer<ByteVar>())

public actual fun symGetLineFromInlineContext(hprocess: Handle, qwaddr: ULong, inlinecontext: UInt, qwmodulebaseaddress: ULong, pdwdisplacement: COpaquePointer?, line64: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symGetLineFromInlineContext(hprocess?.value?.toCPointer<ByteVar>(), qwaddr, inlinecontext, qwmodulebaseaddress, pdwdisplacement?.value?.toCPointer<ByteVar>(), line64?.value?.toCPointer<ByteVar>())

public actual fun symGetLineFromInlineContextW(hprocess: Handle, dwaddr: ULong, inlinecontext: UInt, qwmodulebaseaddress: ULong, pdwdisplacement: COpaquePointer?, line: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symGetLineFromInlineContextW(hprocess?.value?.toCPointer<ByteVar>(), dwaddr, inlinecontext, qwmodulebaseaddress, pdwdisplacement?.value?.toCPointer<ByteVar>(), line?.value?.toCPointer<ByteVar>())

public actual fun symGetLineFromName64(hprocess: Handle, modulename: Pcstr, filename: Pcstr, dwlinenumber: UInt, pldisplacement: COpaquePointer?, line: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symGetLineFromName64(hprocess?.value?.toCPointer<ByteVar>(), modulename?.value?.toCPointer<ByteVar>(), filename?.value?.toCPointer<ByteVar>(), dwlinenumber, pldisplacement?.value?.toCPointer<ByteVar>(), line?.value?.toCPointer<ByteVar>())

public actual fun symGetLineFromNameW64(hprocess: Handle, modulename: Pcwstr, filename: Pcwstr, dwlinenumber: UInt, pldisplacement: COpaquePointer?, line: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symGetLineFromNameW64(hprocess?.value?.toCPointer<ByteVar>(), modulename?.value?.toCPointer<ByteVar>(), filename?.value?.toCPointer<ByteVar>(), dwlinenumber, pldisplacement?.value?.toCPointer<ByteVar>(), line?.value?.toCPointer<ByteVar>())

public actual fun symGetLineNext64(hprocess: Handle, line: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symGetLineNext64(hprocess?.value?.toCPointer<ByteVar>(), line?.value?.toCPointer<ByteVar>())

public actual fun symGetLineNextW64(hprocess: Handle, line: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symGetLineNextW64(hprocess?.value?.toCPointer<ByteVar>(), line?.value?.toCPointer<ByteVar>())

public actual fun symGetLinePrev64(hprocess: Handle, line: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symGetLinePrev64(hprocess?.value?.toCPointer<ByteVar>(), line?.value?.toCPointer<ByteVar>())

public actual fun symGetLinePrevW64(hprocess: Handle, line: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symGetLinePrevW64(hprocess?.value?.toCPointer<ByteVar>(), line?.value?.toCPointer<ByteVar>())

public actual fun symGetModuleBase64(hprocess: Handle, qwaddr: ULong): ULong =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symGetModuleBase64(hprocess?.value?.toCPointer<ByteVar>(), qwaddr)

public actual fun symGetModuleInfo64(hprocess: Handle, qwaddr: ULong, moduleinfo: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symGetModuleInfo64(hprocess?.value?.toCPointer<ByteVar>(), qwaddr, moduleinfo?.value?.toCPointer<ByteVar>())

public actual fun symGetModuleInfoW64(hprocess: Handle, qwaddr: ULong, moduleinfo: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symGetModuleInfoW64(hprocess?.value?.toCPointer<ByteVar>(), qwaddr, moduleinfo?.value?.toCPointer<ByteVar>())

public actual fun symGetOmaps(hprocess: Handle, baseofdll: ULong, omapto: COpaquePointer?, comapto: COpaquePointer?, omapfrom: COpaquePointer?, comapfrom: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symGetOmaps(hprocess?.value?.toCPointer<ByteVar>(), baseofdll, omapto?.value?.toCPointer<ByteVar>(), comapto?.value?.toCPointer<ByteVar>(), omapfrom?.value?.toCPointer<ByteVar>(), comapfrom?.value?.toCPointer<ByteVar>())

public actual fun symGetOptions(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symGetOptions()

public actual fun symGetScope(hprocess: Handle, baseofdll: ULong, index: UInt, symbol: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symGetScope(hprocess?.value?.toCPointer<ByteVar>(), baseofdll, index, symbol?.value?.toCPointer<ByteVar>())

public actual fun symGetScopeW(hprocess: Handle, baseofdll: ULong, index: UInt, symbol: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symGetScopeW(hprocess?.value?.toCPointer<ByteVar>(), baseofdll, index, symbol?.value?.toCPointer<ByteVar>())

public actual fun symGetSearchPath(hprocess: Handle, searchpatha: Pstr, searchpathlength: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symGetSearchPath(hprocess?.value?.toCPointer<ByteVar>(), searchpatha?.value?.toCPointer<ByteVar>(), searchpathlength)

public actual fun symGetSearchPathW(hprocess: Handle, searchpatha: Pwstr, searchpathlength: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symGetSearchPathW(hprocess?.value?.toCPointer<ByteVar>(), searchpatha?.value?.toCPointer<ByteVar>(), searchpathlength)

public actual fun symGetSourceFile(hprocess: Handle, base: ULong, params: Pcstr, filespec: Pcstr, filepath: Pstr, size: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symGetSourceFile(hprocess?.value?.toCPointer<ByteVar>(), base, params?.value?.toCPointer<ByteVar>(), filespec?.value?.toCPointer<ByteVar>(), filepath?.value?.toCPointer<ByteVar>(), size)

public actual fun symGetSourceFileChecksum(hprocess: Handle, base: ULong, filespec: Pcstr, pchecksumtype: COpaquePointer?, pchecksum: COpaquePointer?, checksumsize: UInt, pactualbyteswritten: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symGetSourceFileChecksum(hprocess?.value?.toCPointer<ByteVar>(), base, filespec?.value?.toCPointer<ByteVar>(), pchecksumtype?.value?.toCPointer<ByteVar>(), pchecksum?.value?.toCPointer<ByteVar>(), checksumsize, pactualbyteswritten?.value?.toCPointer<ByteVar>())

public actual fun symGetSourceFileChecksumW(hprocess: Handle, base: ULong, filespec: Pcwstr, pchecksumtype: COpaquePointer?, pchecksum: COpaquePointer?, checksumsize: UInt, pactualbyteswritten: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symGetSourceFileChecksumW(hprocess?.value?.toCPointer<ByteVar>(), base, filespec?.value?.toCPointer<ByteVar>(), pchecksumtype?.value?.toCPointer<ByteVar>(), pchecksum?.value?.toCPointer<ByteVar>(), checksumsize, pactualbyteswritten?.value?.toCPointer<ByteVar>())

public actual fun symGetSourceFileFromToken(hprocess: Handle, token: COpaquePointer?, params: Pcstr, filepath: Pstr, size: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symGetSourceFileFromToken(hprocess?.value?.toCPointer<ByteVar>(), token?.value?.toCPointer<ByteVar>(), params?.value?.toCPointer<ByteVar>(), filepath?.value?.toCPointer<ByteVar>(), size)

public actual fun symGetSourceFileFromTokenByTokenName(hprocess: Handle, token: COpaquePointer?, tokenname: Pcstr, params: Pcstr, filepath: Pstr, size: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symGetSourceFileFromTokenByTokenName(hprocess?.value?.toCPointer<ByteVar>(), token?.value?.toCPointer<ByteVar>(), tokenname?.value?.toCPointer<ByteVar>(), params?.value?.toCPointer<ByteVar>(), filepath?.value?.toCPointer<ByteVar>(), size)

public actual fun symGetSourceFileFromTokenByTokenNameW(hprocess: Handle, token: COpaquePointer?, tokenname: Pcwstr, params: Pcwstr, filepath: Pwstr, size: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symGetSourceFileFromTokenByTokenNameW(hprocess?.value?.toCPointer<ByteVar>(), token?.value?.toCPointer<ByteVar>(), tokenname?.value?.toCPointer<ByteVar>(), params?.value?.toCPointer<ByteVar>(), filepath?.value?.toCPointer<ByteVar>(), size)

public actual fun symGetSourceFileFromTokenW(hprocess: Handle, token: COpaquePointer?, params: Pcwstr, filepath: Pwstr, size: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symGetSourceFileFromTokenW(hprocess?.value?.toCPointer<ByteVar>(), token?.value?.toCPointer<ByteVar>(), params?.value?.toCPointer<ByteVar>(), filepath?.value?.toCPointer<ByteVar>(), size)

public actual fun symGetSourceFileToken(hprocess: Handle, base: ULong, filespec: Pcstr, token: COpaquePointer?, size: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symGetSourceFileToken(hprocess?.value?.toCPointer<ByteVar>(), base, filespec?.value?.toCPointer<ByteVar>(), token?.value?.toCPointer<ByteVar>(), size?.value?.toCPointer<ByteVar>())

public actual fun symGetSourceFileTokenByTokenName(hprocess: Handle, base: ULong, filespec: Pcstr, tokenname: Pcstr, tokenparameters: Pcstr, token: COpaquePointer?, size: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symGetSourceFileTokenByTokenName(hprocess?.value?.toCPointer<ByteVar>(), base, filespec?.value?.toCPointer<ByteVar>(), tokenname?.value?.toCPointer<ByteVar>(), tokenparameters?.value?.toCPointer<ByteVar>(), token?.value?.toCPointer<ByteVar>(), size?.value?.toCPointer<ByteVar>())

public actual fun symGetSourceFileTokenByTokenNameW(hprocess: Handle, base: ULong, filespec: Pcwstr, tokenname: Pcwstr, tokenparameters: Pcwstr, token: COpaquePointer?, size: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symGetSourceFileTokenByTokenNameW(hprocess?.value?.toCPointer<ByteVar>(), base, filespec?.value?.toCPointer<ByteVar>(), tokenname?.value?.toCPointer<ByteVar>(), tokenparameters?.value?.toCPointer<ByteVar>(), token?.value?.toCPointer<ByteVar>(), size?.value?.toCPointer<ByteVar>())

public actual fun symGetSourceFileTokenW(hprocess: Handle, base: ULong, filespec: Pcwstr, token: COpaquePointer?, size: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symGetSourceFileTokenW(hprocess?.value?.toCPointer<ByteVar>(), base, filespec?.value?.toCPointer<ByteVar>(), token?.value?.toCPointer<ByteVar>(), size?.value?.toCPointer<ByteVar>())

public actual fun symGetSourceFileW(hprocess: Handle, base: ULong, params: Pcwstr, filespec: Pcwstr, filepath: Pwstr, size: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symGetSourceFileW(hprocess?.value?.toCPointer<ByteVar>(), base, params?.value?.toCPointer<ByteVar>(), filespec?.value?.toCPointer<ByteVar>(), filepath?.value?.toCPointer<ByteVar>(), size)

public actual fun symGetSourceVarFromToken(hprocess: Handle, token: COpaquePointer?, params: Pcstr, varname: Pcstr, value: Pstr, size: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symGetSourceVarFromToken(hprocess?.value?.toCPointer<ByteVar>(), token?.value?.toCPointer<ByteVar>(), params?.value?.toCPointer<ByteVar>(), varname?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>(), size)

public actual fun symGetSourceVarFromTokenW(hprocess: Handle, token: COpaquePointer?, params: Pcwstr, varname: Pcwstr, value: Pwstr, size: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symGetSourceVarFromTokenW(hprocess?.value?.toCPointer<ByteVar>(), token?.value?.toCPointer<ByteVar>(), params?.value?.toCPointer<ByteVar>(), varname?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>(), size)

public actual fun symGetSymFromAddr64(hprocess: Handle, qwaddr: ULong, pdwdisplacement: COpaquePointer?, symbol: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symGetSymFromAddr64(hprocess?.value?.toCPointer<ByteVar>(), qwaddr, pdwdisplacement?.value?.toCPointer<ByteVar>(), symbol?.value?.toCPointer<ByteVar>())

public actual fun symGetSymFromName64(hprocess: Handle, name: Pcstr, symbol: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symGetSymFromName64(hprocess?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), symbol?.value?.toCPointer<ByteVar>())

public actual fun symGetSymNext64(hprocess: Handle, symbol: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symGetSymNext64(hprocess?.value?.toCPointer<ByteVar>(), symbol?.value?.toCPointer<ByteVar>())

public actual fun symGetSymPrev64(hprocess: Handle, symbol: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symGetSymPrev64(hprocess?.value?.toCPointer<ByteVar>(), symbol?.value?.toCPointer<ByteVar>())

public actual fun symGetSymbolFile(hprocess: Handle, sympath: Pcstr, imagefile: Pcstr, type: UInt, symbolfile: Pstr, csymbolfile: ULong, dbgfile: Pstr, cdbgfile: ULong): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symGetSymbolFile(hprocess?.value?.toCPointer<ByteVar>(), sympath?.value?.toCPointer<ByteVar>(), imagefile?.value?.toCPointer<ByteVar>(), type, symbolfile?.value?.toCPointer<ByteVar>(), csymbolfile, dbgfile?.value?.toCPointer<ByteVar>(), cdbgfile)

public actual fun symGetSymbolFileW(hprocess: Handle, sympath: Pcwstr, imagefile: Pcwstr, type: UInt, symbolfile: Pwstr, csymbolfile: ULong, dbgfile: Pwstr, cdbgfile: ULong): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symGetSymbolFileW(hprocess?.value?.toCPointer<ByteVar>(), sympath?.value?.toCPointer<ByteVar>(), imagefile?.value?.toCPointer<ByteVar>(), type, symbolfile?.value?.toCPointer<ByteVar>(), csymbolfile, dbgfile?.value?.toCPointer<ByteVar>(), cdbgfile)

public actual fun symGetTypeFromName(hprocess: Handle, baseofdll: ULong, name: Pcstr, symbol: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symGetTypeFromName(hprocess?.value?.toCPointer<ByteVar>(), baseofdll, name?.value?.toCPointer<ByteVar>(), symbol?.value?.toCPointer<ByteVar>())

public actual fun symGetTypeFromNameW(hprocess: Handle, baseofdll: ULong, name: Pcwstr, symbol: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symGetTypeFromNameW(hprocess?.value?.toCPointer<ByteVar>(), baseofdll, name?.value?.toCPointer<ByteVar>(), symbol?.value?.toCPointer<ByteVar>())

public actual fun symGetTypeInfo(hprocess: Handle, modbase: ULong, typeid: UInt, gettype: ImagehlpSymbolTypeInfo, pinfo: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symGetTypeInfo(hprocess?.value?.toCPointer<ByteVar>(), modbase, typeid, gettype, pinfo?.value?.toCPointer<ByteVar>())

public actual fun symGetTypeInfoEx(hprocess: Handle, modbase: ULong, params: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symGetTypeInfoEx(hprocess?.value?.toCPointer<ByteVar>(), modbase, params?.value?.toCPointer<ByteVar>())

public actual fun symGetUnwindInfo(hprocess: Handle, address: ULong, buffer: COpaquePointer?, size: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symGetUnwindInfo(hprocess?.value?.toCPointer<ByteVar>(), address, buffer?.value?.toCPointer<ByteVar>(), size?.value?.toCPointer<ByteVar>())

public actual fun symInitialize(hprocess: Handle, usersearchpath: Pcstr, finvadeprocess: Bool): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symInitialize(hprocess?.value?.toCPointer<ByteVar>(), usersearchpath?.value?.toCPointer<ByteVar>(), finvadeprocess)

public actual fun symInitializeW(hprocess: Handle, usersearchpath: Pcwstr, finvadeprocess: Bool): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symInitializeW(hprocess?.value?.toCPointer<ByteVar>(), usersearchpath?.value?.toCPointer<ByteVar>(), finvadeprocess)

public actual fun symLoadModule64(hprocess: Handle, hfile: Handle, imagename: Pcstr, modulename: Pcstr, baseofdll: ULong, sizeofdll: UInt): ULong =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symLoadModule64(hprocess?.value?.toCPointer<ByteVar>(), hfile?.value?.toCPointer<ByteVar>(), imagename?.value?.toCPointer<ByteVar>(), modulename?.value?.toCPointer<ByteVar>(), baseofdll, sizeofdll)

public actual fun symLoadModuleEx(hprocess: Handle, hfile: Handle, imagename: Pcstr, modulename: Pcstr, baseofdll: ULong, dllsize: UInt, data: COpaquePointer?, flags: SymLoadFlags): ULong =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symLoadModuleEx(hprocess?.value?.toCPointer<ByteVar>(), hfile?.value?.toCPointer<ByteVar>(), imagename?.value?.toCPointer<ByteVar>(), modulename?.value?.toCPointer<ByteVar>(), baseofdll, dllsize, data?.value?.toCPointer<ByteVar>(), flags)

public actual fun symLoadModuleExW(hprocess: Handle, hfile: Handle, imagename: Pcwstr, modulename: Pcwstr, baseofdll: ULong, dllsize: UInt, data: COpaquePointer?, flags: SymLoadFlags): ULong =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symLoadModuleExW(hprocess?.value?.toCPointer<ByteVar>(), hfile?.value?.toCPointer<ByteVar>(), imagename?.value?.toCPointer<ByteVar>(), modulename?.value?.toCPointer<ByteVar>(), baseofdll, dllsize, data?.value?.toCPointer<ByteVar>(), flags)

public actual fun symMatchFileName(filename: Pcstr, match: Pcstr, filenamestop: COpaquePointer?, matchstop: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symMatchFileName(filename?.value?.toCPointer<ByteVar>(), match?.value?.toCPointer<ByteVar>(), filenamestop?.value?.toCPointer<ByteVar>(), matchstop?.value?.toCPointer<ByteVar>())

public actual fun symMatchFileNameW(filename: Pcwstr, match: Pcwstr, filenamestop: COpaquePointer?, matchstop: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symMatchFileNameW(filename?.value?.toCPointer<ByteVar>(), match?.value?.toCPointer<ByteVar>(), filenamestop?.value?.toCPointer<ByteVar>(), matchstop?.value?.toCPointer<ByteVar>())

public actual fun symMatchString(string: Pcstr, expression: Pcstr, fcase: Bool): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symMatchString(string?.value?.toCPointer<ByteVar>(), expression?.value?.toCPointer<ByteVar>(), fcase)

public actual fun symMatchStringA(string: Pcstr, expression: Pcstr, fcase: Bool): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symMatchStringA(string?.value?.toCPointer<ByteVar>(), expression?.value?.toCPointer<ByteVar>(), fcase)

public actual fun symMatchStringW(string: Pcwstr, expression: Pcwstr, fcase: Bool): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symMatchStringW(string?.value?.toCPointer<ByteVar>(), expression?.value?.toCPointer<ByteVar>(), fcase)

public actual fun symNext(hprocess: Handle, si: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symNext(hprocess?.value?.toCPointer<ByteVar>(), si?.value?.toCPointer<ByteVar>())

public actual fun symNextW(hprocess: Handle, siw: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symNextW(hprocess?.value?.toCPointer<ByteVar>(), siw?.value?.toCPointer<ByteVar>())

public actual fun symPrev(hprocess: Handle, si: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symPrev(hprocess?.value?.toCPointer<ByteVar>(), si?.value?.toCPointer<ByteVar>())

public actual fun symPrevW(hprocess: Handle, siw: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symPrevW(hprocess?.value?.toCPointer<ByteVar>(), siw?.value?.toCPointer<ByteVar>())

public actual fun symQueryInlineTrace(hprocess: Handle, startaddress: ULong, startcontext: UInt, startretaddress: ULong, curaddress: ULong, curcontext: COpaquePointer?, curframeindex: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symQueryInlineTrace(hprocess?.value?.toCPointer<ByteVar>(), startaddress, startcontext, startretaddress, curaddress, curcontext?.value?.toCPointer<ByteVar>(), curframeindex?.value?.toCPointer<ByteVar>())

public actual fun symRefreshModuleList(hprocess: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symRefreshModuleList(hprocess?.value?.toCPointer<ByteVar>())

public actual fun symRegisterCallback64(hprocess: Handle, callbackfunction: PsymbolRegisteredCallback64, usercontext: ULong): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symRegisterCallback64(hprocess?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), usercontext)

public actual fun symRegisterCallbackW64(hprocess: Handle, callbackfunction: PsymbolRegisteredCallback64, usercontext: ULong): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symRegisterCallbackW64(hprocess?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), usercontext)

public actual fun symRegisterFunctionEntryCallback64(hprocess: Handle, callbackfunction: PsymbolFuncentryCallback64, usercontext: ULong): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symRegisterFunctionEntryCallback64(hprocess?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), usercontext)

public actual fun symSearch(hprocess: Handle, baseofdll: ULong, index: UInt, symtag: UInt, mask: Pcstr, address: ULong, enumsymbolscallback: PsymEnumeratesymbolsCallback, usercontext: COpaquePointer?, options: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symSearch(hprocess?.value?.toCPointer<ByteVar>(), baseofdll, index, symtag, mask?.value?.toCPointer<ByteVar>(), address, 0L.toCPointer<ByteVar>(), usercontext?.value?.toCPointer<ByteVar>(), options)

public actual fun symSearchW(hprocess: Handle, baseofdll: ULong, index: UInt, symtag: UInt, mask: Pcwstr, address: ULong, enumsymbolscallback: PsymEnumeratesymbolsCallbackw, usercontext: COpaquePointer?, options: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symSearchW(hprocess?.value?.toCPointer<ByteVar>(), baseofdll, index, symtag, mask?.value?.toCPointer<ByteVar>(), address, 0L.toCPointer<ByteVar>(), usercontext?.value?.toCPointer<ByteVar>(), options)

public actual fun symSetContext(hprocess: Handle, stackframe: COpaquePointer?, context: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symSetContext(hprocess?.value?.toCPointer<ByteVar>(), stackframe?.value?.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>())

public actual fun symSetExtendedOption(option: ImagehlpExtendedOptions, value: Bool): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symSetExtendedOption(option, value)

public actual fun symSetHomeDirectory(hprocess: Handle, dir: Pcstr): Pstr =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symSetHomeDirectory(hprocess?.value?.toCPointer<ByteVar>(), dir?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun symSetHomeDirectoryW(hprocess: Handle, dir: Pcwstr): Pwstr =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symSetHomeDirectoryW(hprocess?.value?.toCPointer<ByteVar>(), dir?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun symSetOptions(symoptions: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symSetOptions(symoptions)

public actual fun symSetParentWindow(hwnd: Hwnd): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symSetParentWindow(hwnd?.value?.toCPointer<ByteVar>())

public actual fun symSetScopeFromAddr(hprocess: Handle, address: ULong): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symSetScopeFromAddr(hprocess?.value?.toCPointer<ByteVar>(), address)

public actual fun symSetScopeFromIndex(hprocess: Handle, baseofdll: ULong, index: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symSetScopeFromIndex(hprocess?.value?.toCPointer<ByteVar>(), baseofdll, index)

public actual fun symSetScopeFromInlineContext(hprocess: Handle, address: ULong, inlinecontext: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symSetScopeFromInlineContext(hprocess?.value?.toCPointer<ByteVar>(), address, inlinecontext)

public actual fun symSetSearchPath(hprocess: Handle, searchpatha: Pcstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symSetSearchPath(hprocess?.value?.toCPointer<ByteVar>(), searchpatha?.value?.toCPointer<ByteVar>())

public actual fun symSetSearchPathW(hprocess: Handle, searchpatha: Pcwstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symSetSearchPathW(hprocess?.value?.toCPointer<ByteVar>(), searchpatha?.value?.toCPointer<ByteVar>())

public actual fun symSrvDeltaName(hprocess: Handle, sympath: Pcstr, type: Pcstr, file1: Pcstr, file2: Pcstr): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symSrvDeltaName(hprocess?.value?.toCPointer<ByteVar>(), sympath?.value?.toCPointer<ByteVar>(), type?.value?.toCPointer<ByteVar>(), file1?.value?.toCPointer<ByteVar>(), file2?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun symSrvDeltaNameW(hprocess: Handle, sympath: Pcwstr, type: Pcwstr, file1: Pcwstr, file2: Pcwstr): Pcwstr =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symSrvDeltaNameW(hprocess?.value?.toCPointer<ByteVar>(), sympath?.value?.toCPointer<ByteVar>(), type?.value?.toCPointer<ByteVar>(), file1?.value?.toCPointer<ByteVar>(), file2?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun symSrvGetFileIndexInfo(file: Pcstr, info: COpaquePointer?, flags: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symSrvGetFileIndexInfo(file?.value?.toCPointer<ByteVar>(), info?.value?.toCPointer<ByteVar>(), flags)

public actual fun symSrvGetFileIndexInfoW(file: Pcwstr, info: COpaquePointer?, flags: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symSrvGetFileIndexInfoW(file?.value?.toCPointer<ByteVar>(), info?.value?.toCPointer<ByteVar>(), flags)

public actual fun symSrvGetFileIndexString(hprocess: Handle, srvpath: Pcstr, file: Pcstr, index: Pstr, size: ULong, flags: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symSrvGetFileIndexString(hprocess?.value?.toCPointer<ByteVar>(), srvpath?.value?.toCPointer<ByteVar>(), file?.value?.toCPointer<ByteVar>(), index?.value?.toCPointer<ByteVar>(), size, flags)

public actual fun symSrvGetFileIndexStringW(hprocess: Handle, srvpath: Pcwstr, file: Pcwstr, index: Pwstr, size: ULong, flags: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symSrvGetFileIndexStringW(hprocess?.value?.toCPointer<ByteVar>(), srvpath?.value?.toCPointer<ByteVar>(), file?.value?.toCPointer<ByteVar>(), index?.value?.toCPointer<ByteVar>(), size, flags)

public actual fun symSrvGetFileIndexes(file: Pcstr, id: COpaquePointer?, val1: COpaquePointer?, val2: COpaquePointer?, flags: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symSrvGetFileIndexes(file?.value?.toCPointer<ByteVar>(), id?.value?.toCPointer<ByteVar>(), val1?.value?.toCPointer<ByteVar>(), val2?.value?.toCPointer<ByteVar>(), flags)

public actual fun symSrvGetFileIndexesW(file: Pcwstr, id: COpaquePointer?, val1: COpaquePointer?, val2: COpaquePointer?, flags: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symSrvGetFileIndexesW(file?.value?.toCPointer<ByteVar>(), id?.value?.toCPointer<ByteVar>(), val1?.value?.toCPointer<ByteVar>(), val2?.value?.toCPointer<ByteVar>(), flags)

public actual fun symSrvGetSupplement(hprocess: Handle, sympath: Pcstr, node: Pcstr, file: Pcstr): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symSrvGetSupplement(hprocess?.value?.toCPointer<ByteVar>(), sympath?.value?.toCPointer<ByteVar>(), node?.value?.toCPointer<ByteVar>(), file?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun symSrvGetSupplementW(hprocess: Handle, sympath: Pcwstr, node: Pcwstr, file: Pcwstr): Pcwstr =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symSrvGetSupplementW(hprocess?.value?.toCPointer<ByteVar>(), sympath?.value?.toCPointer<ByteVar>(), node?.value?.toCPointer<ByteVar>(), file?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun symSrvIsStore(hprocess: Handle, path: Pcstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symSrvIsStore(hprocess?.value?.toCPointer<ByteVar>(), path?.value?.toCPointer<ByteVar>())

public actual fun symSrvIsStoreW(hprocess: Handle, path: Pcwstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symSrvIsStoreW(hprocess?.value?.toCPointer<ByteVar>(), path?.value?.toCPointer<ByteVar>())

public actual fun symSrvStoreFile(hprocess: Handle, srvpath: Pcstr, file: Pcstr, flags: SymSrvStoreFileFlags): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symSrvStoreFile(hprocess?.value?.toCPointer<ByteVar>(), srvpath?.value?.toCPointer<ByteVar>(), file?.value?.toCPointer<ByteVar>(), flags)?.let { COpaquePointer(it.toLong()) }

public actual fun symSrvStoreFileW(hprocess: Handle, srvpath: Pcwstr, file: Pcwstr, flags: SymSrvStoreFileFlags): Pcwstr =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symSrvStoreFileW(hprocess?.value?.toCPointer<ByteVar>(), srvpath?.value?.toCPointer<ByteVar>(), file?.value?.toCPointer<ByteVar>(), flags)?.let { COpaquePointer(it.toLong()) }

public actual fun symSrvStoreSupplement(hprocess: Handle, srvpath: Pcstr, node: Pcstr, file: Pcstr, flags: UInt): Pcstr =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symSrvStoreSupplement(hprocess?.value?.toCPointer<ByteVar>(), srvpath?.value?.toCPointer<ByteVar>(), node?.value?.toCPointer<ByteVar>(), file?.value?.toCPointer<ByteVar>(), flags)?.let { COpaquePointer(it.toLong()) }

public actual fun symSrvStoreSupplementW(hprocess: Handle, sympath: Pcwstr, node: Pcwstr, file: Pcwstr, flags: UInt): Pcwstr =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symSrvStoreSupplementW(hprocess?.value?.toCPointer<ByteVar>(), sympath?.value?.toCPointer<ByteVar>(), node?.value?.toCPointer<ByteVar>(), file?.value?.toCPointer<ByteVar>(), flags)?.let { COpaquePointer(it.toLong()) }

public actual fun symUnDName64(sym: COpaquePointer?, undecname: Pstr, undecnamelength: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symUnDName64(sym?.value?.toCPointer<ByteVar>(), undecname?.value?.toCPointer<ByteVar>(), undecnamelength)

public actual fun symUnloadModule64(hprocess: Handle, baseofdll: ULong): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_symUnloadModule64(hprocess?.value?.toCPointer<ByteVar>(), baseofdll)

public actual fun terminateProcessOnMemoryExhaustion(failedallocationsize: ULong) {
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_terminateProcessOnMemoryExhaustion(failedallocationsize)
}

public actual fun touchFileTimes(filehandle: Handle, psystemtime: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_touchFileTimes(filehandle?.value?.toCPointer<ByteVar>(), psystemtime?.value?.toCPointer<ByteVar>())

public actual fun unDecorateSymbolName(name: Pcstr, outputstring: Pstr, maxstringlength: UInt, flags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_unDecorateSymbolName(name?.value?.toCPointer<ByteVar>(), outputstring?.value?.toCPointer<ByteVar>(), maxstringlength, flags)

public actual fun unDecorateSymbolNameW(name: Pcwstr, outputstring: Pwstr, maxstringlength: UInt, flags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_unDecorateSymbolNameW(name?.value?.toCPointer<ByteVar>(), outputstring?.value?.toCPointer<ByteVar>(), maxstringlength, flags)

public actual fun unMapAndLoad(loadedimage: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_unMapAndLoad(loadedimage?.value?.toCPointer<ByteVar>())

public actual fun unhandledExceptionFilter(exceptioninfo: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_unhandledExceptionFilter(exceptioninfo?.value?.toCPointer<ByteVar>())

public actual fun updateDebugInfoFile(imagefilename: Pcstr, symbolpath: Pcstr, debugfilepath: Pstr, ntheaders: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_updateDebugInfoFile(imagefilename?.value?.toCPointer<ByteVar>(), symbolpath?.value?.toCPointer<ByteVar>(), debugfilepath?.value?.toCPointer<ByteVar>(), ntheaders?.value?.toCPointer<ByteVar>())

public actual fun updateDebugInfoFileEx(imagefilename: Pcstr, symbolpath: Pcstr, debugfilepath: Pstr, ntheaders: COpaquePointer?, oldchecksum: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_updateDebugInfoFileEx(imagefilename?.value?.toCPointer<ByteVar>(), symbolpath?.value?.toCPointer<ByteVar>(), debugfilepath?.value?.toCPointer<ByteVar>(), ntheaders?.value?.toCPointer<ByteVar>(), oldchecksum)

public actual fun waitForDebugEvent(lpdebugevent: COpaquePointer?, dwmilliseconds: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_waitForDebugEvent(lpdebugevent?.value?.toCPointer<ByteVar>(), dwmilliseconds)

public actual fun waitForDebugEventEx(lpdebugevent: COpaquePointer?, dwmilliseconds: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_waitForDebugEventEx(lpdebugevent?.value?.toCPointer<ByteVar>(), dwmilliseconds)

public actual fun wow64GetThreadContext(hthread: Handle, lpcontext: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_wow64GetThreadContext(hthread?.value?.toCPointer<ByteVar>(), lpcontext?.value?.toCPointer<ByteVar>())

public actual fun wow64GetThreadSelectorEntry(hthread: Handle, dwselector: UInt, lpselectorentry: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_wow64GetThreadSelectorEntry(hthread?.value?.toCPointer<ByteVar>(), dwselector, lpselectorentry?.value?.toCPointer<ByteVar>())

public actual fun wow64SetThreadContext(hthread: Handle, lpcontext: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_wow64SetThreadContext(hthread?.value?.toCPointer<ByteVar>(), lpcontext?.value?.toCPointer<ByteVar>())

public actual fun writeProcessMemory(hprocess: Handle, lpbaseaddress: COpaquePointer?, lpbuffer: COpaquePointer?, nsize: ULong, lpnumberofbyteswritten: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_writeProcessMemory(hprocess?.value?.toCPointer<ByteVar>(), lpbaseaddress?.value?.toCPointer<ByteVar>(), lpbuffer?.value?.toCPointer<ByteVar>(), nsize, lpnumberofbyteswritten?.value?.toCPointer<ByteVar>())
