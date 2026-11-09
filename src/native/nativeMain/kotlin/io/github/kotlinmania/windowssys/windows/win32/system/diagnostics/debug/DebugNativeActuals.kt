@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun AddVectoredContinueHandler(first: UInt, handler: PVECTORED_EXCEPTION_HANDLER): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_AddVectoredContinueHandler(first, handler.toLong().toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun AddVectoredExceptionHandler(first: UInt, handler: PVECTORED_EXCEPTION_HANDLER): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_AddVectoredExceptionHandler(first, handler.toLong().toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun Beep(dwfreq: UInt, dwduration: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_Beep(dwfreq, dwduration)

public actual fun BindImage(imagename: PCSTR, dllpath: PCSTR, symbolpath: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_BindImage(imagename.toCPointer<ByteVar>(), dllpath.toCPointer<ByteVar>(), symbolpath.toCPointer<ByteVar>())

public actual fun BindImageEx(flags: UInt, imagename: PCSTR, dllpath: PCSTR, symbolpath: PCSTR, statusroutine: PIMAGEHLP_STATUS_ROUTINE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_BindImageEx(flags, imagename.toCPointer<ByteVar>(), dllpath.toCPointer<ByteVar>(), symbolpath.toCPointer<ByteVar>(), statusroutine.toLong().toCPointer<ByteVar>())

public actual fun CheckRemoteDebuggerPresent(hprocess: HANDLE, pbdebuggerpresent: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_CheckRemoteDebuggerPresent(hprocess.toCPointer<ByteVar>(), pbdebuggerpresent.toCPointer<ByteVar>())

public actual fun CheckSumMappedFile(baseaddress: Long, filelength: UInt, headersum: Long, checksum: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_CheckSumMappedFile(baseaddress.toCPointer<ByteVar>(), filelength, headersum.toCPointer<ByteVar>(), checksum.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CloseThreadWaitChainSession(wcthandle: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_CloseThreadWaitChainSession(wcthandle.toCPointer<ByteVar>())
}

public actual fun ContinueDebugEvent(dwprocessid: UInt, dwthreadid: UInt, dwcontinuestatus: NTSTATUS): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_ContinueDebugEvent(dwprocessid, dwthreadid, dwcontinuestatus)

public actual fun CopyContext(destination: Long, contextflags: CONTEXT_FLAGS, source: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_CopyContext(destination.toCPointer<ByteVar>(), contextflags, source.toCPointer<ByteVar>())

public actual fun DbgHelpCreateUserDump(filename: PCSTR, callback: PDBGHELP_CREATE_USER_DUMP_CALLBACK, userdata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_DbgHelpCreateUserDump(filename.toCPointer<ByteVar>(), callback.toLong().toCPointer<ByteVar>(), userdata.toCPointer<ByteVar>())

public actual fun DbgHelpCreateUserDumpW(filename: PCWSTR, callback: PDBGHELP_CREATE_USER_DUMP_CALLBACK, userdata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_DbgHelpCreateUserDumpW(filename.toCPointer<ByteVar>(), callback.toLong().toCPointer<ByteVar>(), userdata.toCPointer<ByteVar>())

public actual fun DebugActiveProcess(dwprocessid: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_DebugActiveProcess(dwprocessid)

public actual fun DebugActiveProcessStop(dwprocessid: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_DebugActiveProcessStop(dwprocessid)

public actual fun DebugBreak() {
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_DebugBreak()
}

public actual fun DebugBreakProcess(process: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_DebugBreakProcess(process.toCPointer<ByteVar>())

public actual fun DebugSetProcessKillOnExit(killonexit: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_DebugSetProcessKillOnExit(killonexit)

public actual fun DecodePointer(ptr: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_DecodePointer(ptr.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun DecodeRemotePointer(processhandle: HANDLE, ptr: Long, decodedptr: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_DecodeRemotePointer(processhandle.toCPointer<ByteVar>(), ptr.toCPointer<ByteVar>(), decodedptr.toCPointer<ByteVar>())

public actual fun DecodeSystemPointer(ptr: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_DecodeSystemPointer(ptr.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun EncodePointer(ptr: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_EncodePointer(ptr.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun EncodeRemotePointer(processhandle: HANDLE, ptr: Long, encodedptr: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_EncodeRemotePointer(processhandle.toCPointer<ByteVar>(), ptr.toCPointer<ByteVar>(), encodedptr.toCPointer<ByteVar>())

public actual fun EncodeSystemPointer(ptr: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_EncodeSystemPointer(ptr.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun EnumDirTree(hprocess: HANDLE, rootpath: PCSTR, inputpathname: PCSTR, outputpathbuffer: PSTR, cb: PENUMDIRTREE_CALLBACK, data: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_EnumDirTree(hprocess.toCPointer<ByteVar>(), rootpath.toCPointer<ByteVar>(), inputpathname.toCPointer<ByteVar>(), outputpathbuffer.toCPointer<ByteVar>(), cb.toLong().toCPointer<ByteVar>(), data.toCPointer<ByteVar>())

public actual fun EnumDirTreeW(hprocess: HANDLE, rootpath: PCWSTR, inputpathname: PCWSTR, outputpathbuffer: PWSTR, cb: PENUMDIRTREE_CALLBACKW, data: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_EnumDirTreeW(hprocess.toCPointer<ByteVar>(), rootpath.toCPointer<ByteVar>(), inputpathname.toCPointer<ByteVar>(), outputpathbuffer.toCPointer<ByteVar>(), cb.toLong().toCPointer<ByteVar>(), data.toCPointer<ByteVar>())

public actual fun EnumerateLoadedModules64(hprocess: HANDLE, enumloadedmodulescallback: PENUMLOADED_MODULES_CALLBACK64, usercontext: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_EnumerateLoadedModules64(hprocess.toCPointer<ByteVar>(), enumloadedmodulescallback.toLong().toCPointer<ByteVar>(), usercontext.toCPointer<ByteVar>())

public actual fun EnumerateLoadedModulesEx(hprocess: HANDLE, enumloadedmodulescallback: PENUMLOADED_MODULES_CALLBACK64, usercontext: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_EnumerateLoadedModulesEx(hprocess.toCPointer<ByteVar>(), enumloadedmodulescallback.toLong().toCPointer<ByteVar>(), usercontext.toCPointer<ByteVar>())

public actual fun EnumerateLoadedModulesExW(hprocess: HANDLE, enumloadedmodulescallback: PENUMLOADED_MODULES_CALLBACKW64, usercontext: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_EnumerateLoadedModulesExW(hprocess.toCPointer<ByteVar>(), enumloadedmodulescallback.toLong().toCPointer<ByteVar>(), usercontext.toCPointer<ByteVar>())

public actual fun EnumerateLoadedModulesW64(hprocess: HANDLE, enumloadedmodulescallback: PENUMLOADED_MODULES_CALLBACKW64, usercontext: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_EnumerateLoadedModulesW64(hprocess.toCPointer<ByteVar>(), enumloadedmodulescallback.toLong().toCPointer<ByteVar>(), usercontext.toCPointer<ByteVar>())

public actual fun FatalAppExitA(uaction: UInt, lpmessagetext: PCSTR) {
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_FatalAppExitA(uaction, lpmessagetext.toCPointer<ByteVar>())
}

public actual fun FatalAppExitW(uaction: UInt, lpmessagetext: PCWSTR) {
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_FatalAppExitW(uaction, lpmessagetext.toCPointer<ByteVar>())
}

public actual fun FatalExit(exitcode: Int): Nothing {
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_FatalExit(exitcode)
    error("Unreachable noreturn C function FatalExit")
}

public actual fun FindDebugInfoFile(filename: PCSTR, symbolpath: PCSTR, debugfilepath: PSTR): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_FindDebugInfoFile(filename.toCPointer<ByteVar>(), symbolpath.toCPointer<ByteVar>(), debugfilepath.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun FindDebugInfoFileEx(filename: PCSTR, symbolpath: PCSTR, debugfilepath: PSTR, callback: PFIND_DEBUG_FILE_CALLBACK, callerdata: Long): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_FindDebugInfoFileEx(filename.toCPointer<ByteVar>(), symbolpath.toCPointer<ByteVar>(), debugfilepath.toCPointer<ByteVar>(), callback.toLong().toCPointer<ByteVar>(), callerdata.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun FindDebugInfoFileExW(filename: PCWSTR, symbolpath: PCWSTR, debugfilepath: PWSTR, callback: PFIND_DEBUG_FILE_CALLBACKW, callerdata: Long): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_FindDebugInfoFileExW(filename.toCPointer<ByteVar>(), symbolpath.toCPointer<ByteVar>(), debugfilepath.toCPointer<ByteVar>(), callback.toLong().toCPointer<ByteVar>(), callerdata.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun FindExecutableImage(filename: PCSTR, symbolpath: PCSTR, imagefilepath: PSTR): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_FindExecutableImage(filename.toCPointer<ByteVar>(), symbolpath.toCPointer<ByteVar>(), imagefilepath.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun FindExecutableImageEx(filename: PCSTR, symbolpath: PCSTR, imagefilepath: PSTR, callback: PFIND_EXE_FILE_CALLBACK, callerdata: Long): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_FindExecutableImageEx(filename.toCPointer<ByteVar>(), symbolpath.toCPointer<ByteVar>(), imagefilepath.toCPointer<ByteVar>(), callback.toLong().toCPointer<ByteVar>(), callerdata.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun FindExecutableImageExW(filename: PCWSTR, symbolpath: PCWSTR, imagefilepath: PWSTR, callback: PFIND_EXE_FILE_CALLBACKW, callerdata: Long): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_FindExecutableImageExW(filename.toCPointer<ByteVar>(), symbolpath.toCPointer<ByteVar>(), imagefilepath.toCPointer<ByteVar>(), callback.toLong().toCPointer<ByteVar>(), callerdata.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun FindFileInPath(hprocess: HANDLE, searchpatha: PCSTR, filename: PCSTR, id: Long, two: UInt, three: UInt, flags: UInt, filepath: PSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_FindFileInPath(hprocess.toCPointer<ByteVar>(), searchpatha.toCPointer<ByteVar>(), filename.toCPointer<ByteVar>(), id.toCPointer<ByteVar>(), two, three, flags, filepath.toCPointer<ByteVar>())

public actual fun FindFileInSearchPath(hprocess: HANDLE, searchpatha: PCSTR, filename: PCSTR, one: UInt, two: UInt, three: UInt, filepath: PSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_FindFileInSearchPath(hprocess.toCPointer<ByteVar>(), searchpatha.toCPointer<ByteVar>(), filename.toCPointer<ByteVar>(), one, two, three, filepath.toCPointer<ByteVar>())

public actual fun FlushInstructionCache(hprocess: HANDLE, lpbaseaddress: Long, dwsize: ULong): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_FlushInstructionCache(hprocess.toCPointer<ByteVar>(), lpbaseaddress.toCPointer<ByteVar>(), dwsize)

public actual fun FormatMessageA(dwflags: FORMAT_MESSAGE_OPTIONS, lpsource: Long, dwmessageid: UInt, dwlanguageid: UInt, lpbuffer: PSTR, nsize: UInt, arguments: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_FormatMessageA(dwflags, lpsource.toCPointer<ByteVar>(), dwmessageid, dwlanguageid, lpbuffer.toCPointer<ByteVar>(), nsize, arguments.toCPointer<ByteVar>())

public actual fun FormatMessageW(dwflags: FORMAT_MESSAGE_OPTIONS, lpsource: Long, dwmessageid: UInt, dwlanguageid: UInt, lpbuffer: PWSTR, nsize: UInt, arguments: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_FormatMessageW(dwflags, lpsource.toCPointer<ByteVar>(), dwmessageid, dwlanguageid, lpbuffer.toCPointer<ByteVar>(), nsize, arguments.toCPointer<ByteVar>())

public actual fun GetEnabledXStateFeatures(): ULong =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_GetEnabledXStateFeatures()

public actual fun GetErrorMode(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_GetErrorMode()

public actual fun GetImageConfigInformation(loadedimage: Long, imageconfiginformation: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_GetImageConfigInformation(loadedimage.toCPointer<ByteVar>(), imageconfiginformation.toCPointer<ByteVar>())

public actual fun GetImageUnusedHeaderBytes(loadedimage: Long, sizeunusedheaderbytes: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_GetImageUnusedHeaderBytes(loadedimage.toCPointer<ByteVar>(), sizeunusedheaderbytes.toCPointer<ByteVar>())

public actual fun GetSymLoadError(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_GetSymLoadError()

public actual fun GetThreadContext(hthread: HANDLE, lpcontext: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_GetThreadContext(hthread.toCPointer<ByteVar>(), lpcontext.toCPointer<ByteVar>())

public actual fun GetThreadErrorMode(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_GetThreadErrorMode()

public actual fun GetThreadSelectorEntry(hthread: HANDLE, dwselector: UInt, lpselectorentry: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_GetThreadSelectorEntry(hthread.toCPointer<ByteVar>(), dwselector, lpselectorentry.toCPointer<ByteVar>())

public actual fun GetThreadWaitChain(wcthandle: Long, context: ULong, flags: WAIT_CHAIN_THREAD_OPTIONS, threadid: UInt, nodecount: Long, nodeinfoarray: Long, iscycle: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_GetThreadWaitChain(wcthandle.toCPointer<ByteVar>(), context, flags, threadid, nodecount.toCPointer<ByteVar>(), nodeinfoarray.toCPointer<ByteVar>(), iscycle.toCPointer<ByteVar>())

public actual fun GetTimestampForLoadedLibrary(module: HMODULE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_GetTimestampForLoadedLibrary(module.toCPointer<ByteVar>())

public actual fun GetXStateFeaturesMask(context: Long, featuremask: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_GetXStateFeaturesMask(context.toCPointer<ByteVar>(), featuremask.toCPointer<ByteVar>())

public actual fun ImageAddCertificate(filehandle: HANDLE, certificate: Long, index: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_ImageAddCertificate(filehandle.toCPointer<ByteVar>(), certificate.toCPointer<ByteVar>(), index.toCPointer<ByteVar>())

public actual fun ImageDirectoryEntryToData(base: Long, mappedasimage: Boolean, directoryentry: IMAGE_DIRECTORY_ENTRY, size: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_ImageDirectoryEntryToData(base.toCPointer<ByteVar>(), mappedasimage, directoryentry, size.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ImageDirectoryEntryToDataEx(base: Long, mappedasimage: Boolean, directoryentry: IMAGE_DIRECTORY_ENTRY, size: Long, foundheader: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_ImageDirectoryEntryToDataEx(base.toCPointer<ByteVar>(), mappedasimage, directoryentry, size.toCPointer<ByteVar>(), foundheader.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ImageEnumerateCertificates(filehandle: HANDLE, typefilter: UShort, certificatecount: Long, indices: Long, indexcount: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_ImageEnumerateCertificates(filehandle.toCPointer<ByteVar>(), typefilter, certificatecount.toCPointer<ByteVar>(), indices.toCPointer<ByteVar>(), indexcount)

public actual fun ImageGetCertificateData(filehandle: HANDLE, certificateindex: UInt, certificate: Long, requiredlength: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_ImageGetCertificateData(filehandle.toCPointer<ByteVar>(), certificateindex, certificate.toCPointer<ByteVar>(), requiredlength.toCPointer<ByteVar>())

public actual fun ImageGetCertificateHeader(filehandle: HANDLE, certificateindex: UInt, certificateheader: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_ImageGetCertificateHeader(filehandle.toCPointer<ByteVar>(), certificateindex, certificateheader.toCPointer<ByteVar>())

public actual fun ImageGetDigestStream(filehandle: HANDLE, digestlevel: UInt, digestfunction: DIGEST_FUNCTION, digesthandle: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_ImageGetDigestStream(filehandle.toCPointer<ByteVar>(), digestlevel, digestfunction.toLong().toCPointer<ByteVar>(), digesthandle.toCPointer<ByteVar>())

public actual fun ImageLoad(dllname: PCSTR, dllpath: PCSTR): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_ImageLoad(dllname.toCPointer<ByteVar>(), dllpath.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ImageNtHeader(base: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_ImageNtHeader(base.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ImageRemoveCertificate(filehandle: HANDLE, index: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_ImageRemoveCertificate(filehandle.toCPointer<ByteVar>(), index)

public actual fun ImageRvaToSection(ntheaders: Long, base: Long, rva: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_ImageRvaToSection(ntheaders.toCPointer<ByteVar>(), base.toCPointer<ByteVar>(), rva)?.toLong() ?: 0L

public actual fun ImageRvaToVa(ntheaders: Long, base: Long, rva: UInt, lastrvasection: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_ImageRvaToVa(ntheaders.toCPointer<ByteVar>(), base.toCPointer<ByteVar>(), rva, lastrvasection.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ImageUnload(loadedimage: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_ImageUnload(loadedimage.toCPointer<ByteVar>())

public actual fun ImagehlpApiVersion(): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_ImagehlpApiVersion()?.toLong() ?: 0L

public actual fun ImagehlpApiVersionEx(appversion: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_ImagehlpApiVersionEx(appversion.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun InitializeContext(buffer: Long, contextflags: CONTEXT_FLAGS, context: Long, contextlength: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_InitializeContext(buffer.toCPointer<ByteVar>(), contextflags, context.toCPointer<ByteVar>(), contextlength.toCPointer<ByteVar>())

public actual fun InitializeContext2(buffer: Long, contextflags: CONTEXT_FLAGS, context: Long, contextlength: Long, xstatecompactionmask: ULong): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_InitializeContext2(buffer.toCPointer<ByteVar>(), contextflags, context.toCPointer<ByteVar>(), contextlength.toCPointer<ByteVar>(), xstatecompactionmask)

public actual fun IsDebuggerPresent(): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_IsDebuggerPresent()

public actual fun LocateXStateFeature(context: Long, featureid: UInt, length: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_LocateXStateFeature(context.toCPointer<ByteVar>(), featureid, length.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun MakeSureDirectoryPathExists(dirpath: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_MakeSureDirectoryPathExists(dirpath.toCPointer<ByteVar>())

public actual fun MapAndLoad(imagename: PCSTR, dllpath: PCSTR, loadedimage: Long, dotdll: BOOL, readonly: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_MapAndLoad(imagename.toCPointer<ByteVar>(), dllpath.toCPointer<ByteVar>(), loadedimage.toCPointer<ByteVar>(), dotdll, readonly)

public actual fun MapFileAndCheckSumA(filename: PCSTR, headersum: Long, checksum: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_MapFileAndCheckSumA(filename.toCPointer<ByteVar>(), headersum.toCPointer<ByteVar>(), checksum.toCPointer<ByteVar>())

public actual fun MapFileAndCheckSumW(filename: PCWSTR, headersum: Long, checksum: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_MapFileAndCheckSumW(filename.toCPointer<ByteVar>(), headersum.toCPointer<ByteVar>(), checksum.toCPointer<ByteVar>())

public actual fun MessageBeep(utype: MESSAGEBOX_STYLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_MessageBeep(utype)

public actual fun MiniDumpReadDumpStream(baseofdump: Long, streamnumber: UInt, dir: Long, streampointer: Long, streamsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_MiniDumpReadDumpStream(baseofdump.toCPointer<ByteVar>(), streamnumber, dir.toCPointer<ByteVar>(), streampointer.toCPointer<ByteVar>(), streamsize.toCPointer<ByteVar>())

public actual fun MiniDumpWriteDump(hprocess: HANDLE, processid: UInt, hfile: HANDLE, dumptype: MINIDUMP_TYPE, exceptionparam: Long, userstreamparam: Long, callbackparam: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_MiniDumpWriteDump(hprocess.toCPointer<ByteVar>(), processid, hfile.toCPointer<ByteVar>(), dumptype, exceptionparam.toCPointer<ByteVar>(), userstreamparam.toCPointer<ByteVar>(), callbackparam.toCPointer<ByteVar>())

public actual fun OpenThreadWaitChainSession(flags: OPEN_THREAD_WAIT_CHAIN_SESSION_FLAGS, callback: PWAITCHAINCALLBACK): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_OpenThreadWaitChainSession(flags, callback.toLong().toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun OutputDebugStringA(lpoutputstring: PCSTR) {
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_OutputDebugStringA(lpoutputstring.toCPointer<ByteVar>())
}

public actual fun OutputDebugStringW(lpoutputstring: PCWSTR) {
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_OutputDebugStringW(lpoutputstring.toCPointer<ByteVar>())
}

public actual fun RaiseException(dwexceptioncode: UInt, dwexceptionflags: UInt, nnumberofarguments: UInt, lparguments: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_RaiseException(dwexceptioncode, dwexceptionflags, nnumberofarguments, lparguments.toCPointer<ByteVar>())
}

public actual fun RaiseFailFastException(pexceptionrecord: Long, pcontextrecord: Long, dwflags: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_RaiseFailFastException(pexceptionrecord.toCPointer<ByteVar>(), pcontextrecord.toCPointer<ByteVar>(), dwflags)
}

public actual fun RangeMapAddPeImageSections(rmaphandle: Long, imagename: PCWSTR, mappedimage: Long, mappingbytes: UInt, imagebase: ULong, usertag: ULong, mappingflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_RangeMapAddPeImageSections(rmaphandle.toCPointer<ByteVar>(), imagename.toCPointer<ByteVar>(), mappedimage.toCPointer<ByteVar>(), mappingbytes, imagebase, usertag, mappingflags)

public actual fun RangeMapCreate(): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_RangeMapCreate()?.toLong() ?: 0L

public actual fun RangeMapFree(rmaphandle: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_RangeMapFree(rmaphandle.toCPointer<ByteVar>())
}

public actual fun RangeMapRead(rmaphandle: Long, offset: ULong, buffer: Long, requestbytes: UInt, flags: UInt, donebytes: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_RangeMapRead(rmaphandle.toCPointer<ByteVar>(), offset, buffer.toCPointer<ByteVar>(), requestbytes, flags, donebytes.toCPointer<ByteVar>())

public actual fun RangeMapRemove(rmaphandle: Long, usertag: ULong): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_RangeMapRemove(rmaphandle.toCPointer<ByteVar>(), usertag)

public actual fun RangeMapWrite(rmaphandle: Long, offset: ULong, buffer: Long, requestbytes: UInt, flags: UInt, donebytes: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_RangeMapWrite(rmaphandle.toCPointer<ByteVar>(), offset, buffer.toCPointer<ByteVar>(), requestbytes, flags, donebytes.toCPointer<ByteVar>())

public actual fun ReBaseImage(currentimagename: PCSTR, symbolpath: PCSTR, frebase: BOOL, frebasesysfileok: BOOL, fgoingdown: BOOL, checkimagesize: UInt, oldimagesize: Long, oldimagebase: Long, newimagesize: Long, newimagebase: Long, timestamp: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_ReBaseImage(currentimagename.toCPointer<ByteVar>(), symbolpath.toCPointer<ByteVar>(), frebase, frebasesysfileok, fgoingdown, checkimagesize, oldimagesize.toCPointer<ByteVar>(), oldimagebase.toCPointer<ByteVar>(), newimagesize.toCPointer<ByteVar>(), newimagebase.toCPointer<ByteVar>(), timestamp)

public actual fun ReBaseImage64(currentimagename: PCSTR, symbolpath: PCSTR, frebase: BOOL, frebasesysfileok: BOOL, fgoingdown: BOOL, checkimagesize: UInt, oldimagesize: Long, oldimagebase: Long, newimagesize: Long, newimagebase: Long, timestamp: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_ReBaseImage64(currentimagename.toCPointer<ByteVar>(), symbolpath.toCPointer<ByteVar>(), frebase, frebasesysfileok, fgoingdown, checkimagesize, oldimagesize.toCPointer<ByteVar>(), oldimagebase.toCPointer<ByteVar>(), newimagesize.toCPointer<ByteVar>(), newimagebase.toCPointer<ByteVar>(), timestamp)

public actual fun ReadProcessMemory(hprocess: HANDLE, lpbaseaddress: Long, lpbuffer: Long, nsize: ULong, lpnumberofbytesread: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_ReadProcessMemory(hprocess.toCPointer<ByteVar>(), lpbaseaddress.toCPointer<ByteVar>(), lpbuffer.toCPointer<ByteVar>(), nsize, lpnumberofbytesread.toCPointer<ByteVar>())

public actual fun RegisterWaitChainCOMCallback(callstatecallback: PCOGETCALLSTATE, activationstatecallback: PCOGETACTIVATIONSTATE) {
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_RegisterWaitChainCOMCallback(callstatecallback.toLong().toCPointer<ByteVar>(), activationstatecallback.toLong().toCPointer<ByteVar>())
}

public actual fun RemoveInvalidModuleList(hprocess: HANDLE) {
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_RemoveInvalidModuleList(hprocess.toCPointer<ByteVar>())
}

public actual fun RemoveVectoredContinueHandler(handle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_RemoveVectoredContinueHandler(handle.toCPointer<ByteVar>())

public actual fun RemoveVectoredExceptionHandler(handle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_RemoveVectoredExceptionHandler(handle.toCPointer<ByteVar>())

public actual fun ReportSymbolLoadSummary(hprocess: HANDLE, ploadmodule: PCWSTR, psymboldata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_ReportSymbolLoadSummary(hprocess.toCPointer<ByteVar>(), ploadmodule.toCPointer<ByteVar>(), psymboldata.toCPointer<ByteVar>())

public actual fun RtlAddFunctionTable(functiontable: Long, entrycount: UInt, baseaddress: ULong): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_RtlAddFunctionTable(functiontable.toCPointer<ByteVar>(), entrycount, baseaddress)

public actual fun RtlAddGrowableFunctionTable(dynamictable: Long, functiontable: Long, entrycount: UInt, maximumentrycount: UInt, rangebase: ULong, rangeend: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_RtlAddGrowableFunctionTable(dynamictable.toCPointer<ByteVar>(), functiontable.toCPointer<ByteVar>(), entrycount, maximumentrycount, rangebase, rangeend)

public actual fun RtlCaptureContext(contextrecord: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_RtlCaptureContext(contextrecord.toCPointer<ByteVar>())
}

public actual fun RtlCaptureContext2(contextrecord: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_RtlCaptureContext2(contextrecord.toCPointer<ByteVar>())
}

public actual fun RtlCaptureStackBackTrace(framestoskip: UInt, framestocapture: UInt, backtrace: Long, backtracehash: Long): UShort =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_RtlCaptureStackBackTrace(framestoskip, framestocapture, backtrace.toCPointer<ByteVar>(), backtracehash.toCPointer<ByteVar>())

public actual fun RtlDeleteFunctionTable(functiontable: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_RtlDeleteFunctionTable(functiontable.toCPointer<ByteVar>())

public actual fun RtlDeleteGrowableFunctionTable(dynamictable: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_RtlDeleteGrowableFunctionTable(dynamictable.toCPointer<ByteVar>())
}

public actual fun RtlGrowFunctionTable(dynamictable: Long, newentrycount: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_RtlGrowFunctionTable(dynamictable.toCPointer<ByteVar>(), newentrycount)
}

public actual fun RtlInstallFunctionTableCallback(tableidentifier: ULong, baseaddress: ULong, length: UInt, callback: PGET_RUNTIME_FUNCTION_CALLBACK, context: Long, outofprocesscallbackdll: PCWSTR): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_RtlInstallFunctionTableCallback(tableidentifier, baseaddress, length, callback.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>(), outofprocesscallbackdll.toCPointer<ByteVar>())

public actual fun RtlLookupFunctionEntry(controlpc: ULong, imagebase: Long, historytable: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_RtlLookupFunctionEntry(controlpc, imagebase.toCPointer<ByteVar>(), historytable.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun RtlPcToFileHeader(pcvalue: Long, baseofimage: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_RtlPcToFileHeader(pcvalue.toCPointer<ByteVar>(), baseofimage.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun RtlRaiseException(exceptionrecord: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_RtlRaiseException(exceptionrecord.toCPointer<ByteVar>())
}

public actual fun RtlRestoreContext(contextrecord: Long, exceptionrecord: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_RtlRestoreContext(contextrecord.toCPointer<ByteVar>(), exceptionrecord.toCPointer<ByteVar>())
}

public actual fun RtlUnwind(targetframe: Long, targetip: Long, exceptionrecord: Long, returnvalue: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_RtlUnwind(targetframe.toCPointer<ByteVar>(), targetip.toCPointer<ByteVar>(), exceptionrecord.toCPointer<ByteVar>(), returnvalue.toCPointer<ByteVar>())
}

public actual fun RtlUnwindEx(targetframe: Long, targetip: Long, exceptionrecord: Long, returnvalue: Long, contextrecord: Long, historytable: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_RtlUnwindEx(targetframe.toCPointer<ByteVar>(), targetip.toCPointer<ByteVar>(), exceptionrecord.toCPointer<ByteVar>(), returnvalue.toCPointer<ByteVar>(), contextrecord.toCPointer<ByteVar>(), historytable.toCPointer<ByteVar>())
}

public actual fun RtlVirtualUnwind(handlertype: RTL_VIRTUAL_UNWIND_HANDLER_TYPE, imagebase: ULong, controlpc: ULong, functionentry: Long, contextrecord: Long, handlerdata: Long, establisherframe: Long, contextpointers: Long): EXCEPTION_ROUTINE =
    null

public actual fun SearchTreeForFile(rootpath: PCSTR, inputpathname: PCSTR, outputpathbuffer: PSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SearchTreeForFile(rootpath.toCPointer<ByteVar>(), inputpathname.toCPointer<ByteVar>(), outputpathbuffer.toCPointer<ByteVar>())

public actual fun SearchTreeForFileW(rootpath: PCWSTR, inputpathname: PCWSTR, outputpathbuffer: PWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SearchTreeForFileW(rootpath.toCPointer<ByteVar>(), inputpathname.toCPointer<ByteVar>(), outputpathbuffer.toCPointer<ByteVar>())

public actual fun SetCheckUserInterruptShared(lpstartaddress: LPCALL_BACK_USER_INTERRUPT_ROUTINE) {
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SetCheckUserInterruptShared(lpstartaddress.toLong().toCPointer<ByteVar>())
}

public actual fun SetErrorMode(umode: THREAD_ERROR_MODE): THREAD_ERROR_MODE =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SetErrorMode(umode)

public actual fun SetImageConfigInformation(loadedimage: Long, imageconfiginformation: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SetImageConfigInformation(loadedimage.toCPointer<ByteVar>(), imageconfiginformation.toCPointer<ByteVar>())

public actual fun SetSymLoadError(error: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SetSymLoadError(error)
}

public actual fun SetThreadContext(hthread: HANDLE, lpcontext: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SetThreadContext(hthread.toCPointer<ByteVar>(), lpcontext.toCPointer<ByteVar>())

public actual fun SetThreadErrorMode(dwnewmode: THREAD_ERROR_MODE, lpoldmode: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SetThreadErrorMode(dwnewmode, lpoldmode.toCPointer<ByteVar>())

public actual fun SetUnhandledExceptionFilter(lptoplevelexceptionfilter: LPTOP_LEVEL_EXCEPTION_FILTER): LPTOP_LEVEL_EXCEPTION_FILTER =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SetUnhandledExceptionFilter(lptoplevelexceptionfilter.toLong().toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun SetXStateFeaturesMask(context: Long, featuremask: ULong): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SetXStateFeaturesMask(context.toCPointer<ByteVar>(), featuremask)

public actual fun StackWalk2(machinetype: UInt, hprocess: HANDLE, hthread: HANDLE, stackframe: Long, contextrecord: Long, readmemoryroutine: PREAD_PROCESS_MEMORY_ROUTINE64, functiontableaccessroutine: PFUNCTION_TABLE_ACCESS_ROUTINE64, getmodulebaseroutine: PGET_MODULE_BASE_ROUTINE64, translateaddress: PTRANSLATE_ADDRESS_ROUTINE64, gettargetattributevalue: PGET_TARGET_ATTRIBUTE_VALUE64, flags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_StackWalk2(machinetype, hprocess.toCPointer<ByteVar>(), hthread.toCPointer<ByteVar>(), stackframe.toCPointer<ByteVar>(), contextrecord.toCPointer<ByteVar>(), readmemoryroutine.toLong().toCPointer<ByteVar>(), functiontableaccessroutine.toLong().toCPointer<ByteVar>(), getmodulebaseroutine.toLong().toCPointer<ByteVar>(), translateaddress.toLong().toCPointer<ByteVar>(), gettargetattributevalue.toLong().toCPointer<ByteVar>(), flags)

public actual fun StackWalk64(machinetype: UInt, hprocess: HANDLE, hthread: HANDLE, stackframe: Long, contextrecord: Long, readmemoryroutine: PREAD_PROCESS_MEMORY_ROUTINE64, functiontableaccessroutine: PFUNCTION_TABLE_ACCESS_ROUTINE64, getmodulebaseroutine: PGET_MODULE_BASE_ROUTINE64, translateaddress: PTRANSLATE_ADDRESS_ROUTINE64): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_StackWalk64(machinetype, hprocess.toCPointer<ByteVar>(), hthread.toCPointer<ByteVar>(), stackframe.toCPointer<ByteVar>(), contextrecord.toCPointer<ByteVar>(), readmemoryroutine.toLong().toCPointer<ByteVar>(), functiontableaccessroutine.toLong().toCPointer<ByteVar>(), getmodulebaseroutine.toLong().toCPointer<ByteVar>(), translateaddress.toLong().toCPointer<ByteVar>())

public actual fun StackWalkEx(machinetype: UInt, hprocess: HANDLE, hthread: HANDLE, stackframe: Long, contextrecord: Long, readmemoryroutine: PREAD_PROCESS_MEMORY_ROUTINE64, functiontableaccessroutine: PFUNCTION_TABLE_ACCESS_ROUTINE64, getmodulebaseroutine: PGET_MODULE_BASE_ROUTINE64, translateaddress: PTRANSLATE_ADDRESS_ROUTINE64, flags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_StackWalkEx(machinetype, hprocess.toCPointer<ByteVar>(), hthread.toCPointer<ByteVar>(), stackframe.toCPointer<ByteVar>(), contextrecord.toCPointer<ByteVar>(), readmemoryroutine.toLong().toCPointer<ByteVar>(), functiontableaccessroutine.toLong().toCPointer<ByteVar>(), getmodulebaseroutine.toLong().toCPointer<ByteVar>(), translateaddress.toLong().toCPointer<ByteVar>(), flags)

public actual fun SymAddSourceStream(hprocess: HANDLE, base: ULong, streamfile: PCSTR, buffer: Long, size: ULong): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymAddSourceStream(hprocess.toCPointer<ByteVar>(), base, streamfile.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), size)

public actual fun SymAddSourceStreamA(hprocess: HANDLE, base: ULong, streamfile: PCSTR, buffer: Long, size: ULong): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymAddSourceStreamA(hprocess.toCPointer<ByteVar>(), base, streamfile.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), size)

public actual fun SymAddSourceStreamW(hprocess: HANDLE, base: ULong, filespec: PCWSTR, buffer: Long, size: ULong): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymAddSourceStreamW(hprocess.toCPointer<ByteVar>(), base, filespec.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), size)

public actual fun SymAddSymbol(hprocess: HANDLE, baseofdll: ULong, name: PCSTR, address: ULong, size: UInt, flags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymAddSymbol(hprocess.toCPointer<ByteVar>(), baseofdll, name.toCPointer<ByteVar>(), address, size, flags)

public actual fun SymAddSymbolW(hprocess: HANDLE, baseofdll: ULong, name: PCWSTR, address: ULong, size: UInt, flags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymAddSymbolW(hprocess.toCPointer<ByteVar>(), baseofdll, name.toCPointer<ByteVar>(), address, size, flags)

public actual fun SymAddrIncludeInlineTrace(hprocess: HANDLE, address: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymAddrIncludeInlineTrace(hprocess.toCPointer<ByteVar>(), address)

public actual fun SymCleanup(hprocess: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymCleanup(hprocess.toCPointer<ByteVar>())

public actual fun SymCompareInlineTrace(hprocess: HANDLE, address1: ULong, inlinecontext1: UInt, retaddress1: ULong, address2: ULong, retaddress2: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymCompareInlineTrace(hprocess.toCPointer<ByteVar>(), address1, inlinecontext1, retaddress1, address2, retaddress2)

public actual fun SymDeleteSymbol(hprocess: HANDLE, baseofdll: ULong, name: PCSTR, address: ULong, flags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymDeleteSymbol(hprocess.toCPointer<ByteVar>(), baseofdll, name.toCPointer<ByteVar>(), address, flags)

public actual fun SymDeleteSymbolW(hprocess: HANDLE, baseofdll: ULong, name: PCWSTR, address: ULong, flags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymDeleteSymbolW(hprocess.toCPointer<ByteVar>(), baseofdll, name.toCPointer<ByteVar>(), address, flags)

public actual fun SymEnumLines(hprocess: HANDLE, base: ULong, obj: PCSTR, file: PCSTR, enumlinescallback: PSYM_ENUMLINES_CALLBACK, usercontext: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymEnumLines(hprocess.toCPointer<ByteVar>(), base, obj.toCPointer<ByteVar>(), file.toCPointer<ByteVar>(), enumlinescallback.toLong().toCPointer<ByteVar>(), usercontext.toCPointer<ByteVar>())

public actual fun SymEnumLinesW(hprocess: HANDLE, base: ULong, obj: PCWSTR, file: PCWSTR, enumlinescallback: PSYM_ENUMLINES_CALLBACKW, usercontext: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymEnumLinesW(hprocess.toCPointer<ByteVar>(), base, obj.toCPointer<ByteVar>(), file.toCPointer<ByteVar>(), enumlinescallback.toLong().toCPointer<ByteVar>(), usercontext.toCPointer<ByteVar>())

public actual fun SymEnumProcesses(enumprocessescallback: PSYM_ENUMPROCESSES_CALLBACK, usercontext: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymEnumProcesses(enumprocessescallback.toLong().toCPointer<ByteVar>(), usercontext.toCPointer<ByteVar>())

public actual fun SymEnumSourceFileTokens(hprocess: HANDLE, base: ULong, callback: PENUMSOURCEFILETOKENSCALLBACK): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymEnumSourceFileTokens(hprocess.toCPointer<ByteVar>(), base, callback.toLong().toCPointer<ByteVar>())

public actual fun SymEnumSourceFiles(hprocess: HANDLE, modbase: ULong, mask: PCSTR, cbsrcfiles: PSYM_ENUMSOURCEFILES_CALLBACK, usercontext: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymEnumSourceFiles(hprocess.toCPointer<ByteVar>(), modbase, mask.toCPointer<ByteVar>(), cbsrcfiles.toLong().toCPointer<ByteVar>(), usercontext.toCPointer<ByteVar>())

public actual fun SymEnumSourceFilesW(hprocess: HANDLE, modbase: ULong, mask: PCWSTR, cbsrcfiles: PSYM_ENUMSOURCEFILES_CALLBACKW, usercontext: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymEnumSourceFilesW(hprocess.toCPointer<ByteVar>(), modbase, mask.toCPointer<ByteVar>(), cbsrcfiles.toLong().toCPointer<ByteVar>(), usercontext.toCPointer<ByteVar>())

public actual fun SymEnumSourceLines(hprocess: HANDLE, base: ULong, obj: PCSTR, file: PCSTR, line: UInt, flags: UInt, enumlinescallback: PSYM_ENUMLINES_CALLBACK, usercontext: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymEnumSourceLines(hprocess.toCPointer<ByteVar>(), base, obj.toCPointer<ByteVar>(), file.toCPointer<ByteVar>(), line, flags, enumlinescallback.toLong().toCPointer<ByteVar>(), usercontext.toCPointer<ByteVar>())

public actual fun SymEnumSourceLinesW(hprocess: HANDLE, base: ULong, obj: PCWSTR, file: PCWSTR, line: UInt, flags: UInt, enumlinescallback: PSYM_ENUMLINES_CALLBACKW, usercontext: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymEnumSourceLinesW(hprocess.toCPointer<ByteVar>(), base, obj.toCPointer<ByteVar>(), file.toCPointer<ByteVar>(), line, flags, enumlinescallback.toLong().toCPointer<ByteVar>(), usercontext.toCPointer<ByteVar>())

public actual fun SymEnumSym(hprocess: HANDLE, baseofdll: ULong, enumsymbolscallback: PSYM_ENUMERATESYMBOLS_CALLBACK, usercontext: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymEnumSym(hprocess.toCPointer<ByteVar>(), baseofdll, enumsymbolscallback.toLong().toCPointer<ByteVar>(), usercontext.toCPointer<ByteVar>())

public actual fun SymEnumSymbols(hprocess: HANDLE, baseofdll: ULong, mask: PCSTR, enumsymbolscallback: PSYM_ENUMERATESYMBOLS_CALLBACK, usercontext: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymEnumSymbols(hprocess.toCPointer<ByteVar>(), baseofdll, mask.toCPointer<ByteVar>(), enumsymbolscallback.toLong().toCPointer<ByteVar>(), usercontext.toCPointer<ByteVar>())

public actual fun SymEnumSymbolsEx(hprocess: HANDLE, baseofdll: ULong, mask: PCSTR, enumsymbolscallback: PSYM_ENUMERATESYMBOLS_CALLBACK, usercontext: Long, options: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymEnumSymbolsEx(hprocess.toCPointer<ByteVar>(), baseofdll, mask.toCPointer<ByteVar>(), enumsymbolscallback.toLong().toCPointer<ByteVar>(), usercontext.toCPointer<ByteVar>(), options)

public actual fun SymEnumSymbolsExW(hprocess: HANDLE, baseofdll: ULong, mask: PCWSTR, enumsymbolscallback: PSYM_ENUMERATESYMBOLS_CALLBACKW, usercontext: Long, options: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymEnumSymbolsExW(hprocess.toCPointer<ByteVar>(), baseofdll, mask.toCPointer<ByteVar>(), enumsymbolscallback.toLong().toCPointer<ByteVar>(), usercontext.toCPointer<ByteVar>(), options)

public actual fun SymEnumSymbolsForAddr(hprocess: HANDLE, address: ULong, enumsymbolscallback: PSYM_ENUMERATESYMBOLS_CALLBACK, usercontext: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymEnumSymbolsForAddr(hprocess.toCPointer<ByteVar>(), address, enumsymbolscallback.toLong().toCPointer<ByteVar>(), usercontext.toCPointer<ByteVar>())

public actual fun SymEnumSymbolsForAddrW(hprocess: HANDLE, address: ULong, enumsymbolscallback: PSYM_ENUMERATESYMBOLS_CALLBACKW, usercontext: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymEnumSymbolsForAddrW(hprocess.toCPointer<ByteVar>(), address, enumsymbolscallback.toLong().toCPointer<ByteVar>(), usercontext.toCPointer<ByteVar>())

public actual fun SymEnumSymbolsW(hprocess: HANDLE, baseofdll: ULong, mask: PCWSTR, enumsymbolscallback: PSYM_ENUMERATESYMBOLS_CALLBACKW, usercontext: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymEnumSymbolsW(hprocess.toCPointer<ByteVar>(), baseofdll, mask.toCPointer<ByteVar>(), enumsymbolscallback.toLong().toCPointer<ByteVar>(), usercontext.toCPointer<ByteVar>())

public actual fun SymEnumTypes(hprocess: HANDLE, baseofdll: ULong, enumsymbolscallback: PSYM_ENUMERATESYMBOLS_CALLBACK, usercontext: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymEnumTypes(hprocess.toCPointer<ByteVar>(), baseofdll, enumsymbolscallback.toLong().toCPointer<ByteVar>(), usercontext.toCPointer<ByteVar>())

public actual fun SymEnumTypesByName(hprocess: HANDLE, baseofdll: ULong, mask: PCSTR, enumsymbolscallback: PSYM_ENUMERATESYMBOLS_CALLBACK, usercontext: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymEnumTypesByName(hprocess.toCPointer<ByteVar>(), baseofdll, mask.toCPointer<ByteVar>(), enumsymbolscallback.toLong().toCPointer<ByteVar>(), usercontext.toCPointer<ByteVar>())

public actual fun SymEnumTypesByNameW(hprocess: HANDLE, baseofdll: ULong, mask: PCWSTR, enumsymbolscallback: PSYM_ENUMERATESYMBOLS_CALLBACKW, usercontext: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymEnumTypesByNameW(hprocess.toCPointer<ByteVar>(), baseofdll, mask.toCPointer<ByteVar>(), enumsymbolscallback.toLong().toCPointer<ByteVar>(), usercontext.toCPointer<ByteVar>())

public actual fun SymEnumTypesW(hprocess: HANDLE, baseofdll: ULong, enumsymbolscallback: PSYM_ENUMERATESYMBOLS_CALLBACKW, usercontext: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymEnumTypesW(hprocess.toCPointer<ByteVar>(), baseofdll, enumsymbolscallback.toLong().toCPointer<ByteVar>(), usercontext.toCPointer<ByteVar>())

public actual fun SymEnumerateModules64(hprocess: HANDLE, enummodulescallback: PSYM_ENUMMODULES_CALLBACK64, usercontext: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymEnumerateModules64(hprocess.toCPointer<ByteVar>(), enummodulescallback.toLong().toCPointer<ByteVar>(), usercontext.toCPointer<ByteVar>())

public actual fun SymEnumerateModulesW64(hprocess: HANDLE, enummodulescallback: PSYM_ENUMMODULES_CALLBACKW64, usercontext: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymEnumerateModulesW64(hprocess.toCPointer<ByteVar>(), enummodulescallback.toLong().toCPointer<ByteVar>(), usercontext.toCPointer<ByteVar>())

public actual fun SymEnumerateSymbols64(hprocess: HANDLE, baseofdll: ULong, enumsymbolscallback: PSYM_ENUMSYMBOLS_CALLBACK64, usercontext: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymEnumerateSymbols64(hprocess.toCPointer<ByteVar>(), baseofdll, enumsymbolscallback.toLong().toCPointer<ByteVar>(), usercontext.toCPointer<ByteVar>())

public actual fun SymEnumerateSymbolsW64(hprocess: HANDLE, baseofdll: ULong, enumsymbolscallback: PSYM_ENUMSYMBOLS_CALLBACK64W, usercontext: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymEnumerateSymbolsW64(hprocess.toCPointer<ByteVar>(), baseofdll, enumsymbolscallback.toLong().toCPointer<ByteVar>(), usercontext.toCPointer<ByteVar>())

public actual fun SymFindDebugInfoFile(hprocess: HANDLE, filename: PCSTR, debugfilepath: PSTR, callback: PFIND_DEBUG_FILE_CALLBACK, callerdata: Long): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymFindDebugInfoFile(hprocess.toCPointer<ByteVar>(), filename.toCPointer<ByteVar>(), debugfilepath.toCPointer<ByteVar>(), callback.toLong().toCPointer<ByteVar>(), callerdata.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun SymFindDebugInfoFileW(hprocess: HANDLE, filename: PCWSTR, debugfilepath: PWSTR, callback: PFIND_DEBUG_FILE_CALLBACKW, callerdata: Long): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymFindDebugInfoFileW(hprocess.toCPointer<ByteVar>(), filename.toCPointer<ByteVar>(), debugfilepath.toCPointer<ByteVar>(), callback.toLong().toCPointer<ByteVar>(), callerdata.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun SymFindExecutableImage(hprocess: HANDLE, filename: PCSTR, imagefilepath: PSTR, callback: PFIND_EXE_FILE_CALLBACK, callerdata: Long): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymFindExecutableImage(hprocess.toCPointer<ByteVar>(), filename.toCPointer<ByteVar>(), imagefilepath.toCPointer<ByteVar>(), callback.toLong().toCPointer<ByteVar>(), callerdata.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun SymFindExecutableImageW(hprocess: HANDLE, filename: PCWSTR, imagefilepath: PWSTR, callback: PFIND_EXE_FILE_CALLBACKW, callerdata: Long): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymFindExecutableImageW(hprocess.toCPointer<ByteVar>(), filename.toCPointer<ByteVar>(), imagefilepath.toCPointer<ByteVar>(), callback.toLong().toCPointer<ByteVar>(), callerdata.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun SymFindFileInPath(hprocess: HANDLE, searchpatha: PCSTR, filename: PCSTR, id: Long, two: UInt, three: UInt, flags: SYM_FIND_ID_OPTION, foundfile: PSTR, callback: PFINDFILEINPATHCALLBACK, context: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymFindFileInPath(hprocess.toCPointer<ByteVar>(), searchpatha.toCPointer<ByteVar>(), filename.toCPointer<ByteVar>(), id.toCPointer<ByteVar>(), two, three, flags, foundfile.toCPointer<ByteVar>(), callback.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>())

public actual fun SymFindFileInPathW(hprocess: HANDLE, searchpatha: PCWSTR, filename: PCWSTR, id: Long, two: UInt, three: UInt, flags: SYM_FIND_ID_OPTION, foundfile: PWSTR, callback: PFINDFILEINPATHCALLBACKW, context: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymFindFileInPathW(hprocess.toCPointer<ByteVar>(), searchpatha.toCPointer<ByteVar>(), filename.toCPointer<ByteVar>(), id.toCPointer<ByteVar>(), two, three, flags, foundfile.toCPointer<ByteVar>(), callback.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>())

public actual fun SymFromAddr(hprocess: HANDLE, address: ULong, displacement: Long, symbol: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymFromAddr(hprocess.toCPointer<ByteVar>(), address, displacement.toCPointer<ByteVar>(), symbol.toCPointer<ByteVar>())

public actual fun SymFromAddrW(hprocess: HANDLE, address: ULong, displacement: Long, symbol: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymFromAddrW(hprocess.toCPointer<ByteVar>(), address, displacement.toCPointer<ByteVar>(), symbol.toCPointer<ByteVar>())

public actual fun SymFromIndex(hprocess: HANDLE, baseofdll: ULong, index: UInt, symbol: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymFromIndex(hprocess.toCPointer<ByteVar>(), baseofdll, index, symbol.toCPointer<ByteVar>())

public actual fun SymFromIndexW(hprocess: HANDLE, baseofdll: ULong, index: UInt, symbol: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymFromIndexW(hprocess.toCPointer<ByteVar>(), baseofdll, index, symbol.toCPointer<ByteVar>())

public actual fun SymFromInlineContext(hprocess: HANDLE, address: ULong, inlinecontext: UInt, displacement: Long, symbol: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymFromInlineContext(hprocess.toCPointer<ByteVar>(), address, inlinecontext, displacement.toCPointer<ByteVar>(), symbol.toCPointer<ByteVar>())

public actual fun SymFromInlineContextW(hprocess: HANDLE, address: ULong, inlinecontext: UInt, displacement: Long, symbol: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymFromInlineContextW(hprocess.toCPointer<ByteVar>(), address, inlinecontext, displacement.toCPointer<ByteVar>(), symbol.toCPointer<ByteVar>())

public actual fun SymFromName(hprocess: HANDLE, name: PCSTR, symbol: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymFromName(hprocess.toCPointer<ByteVar>(), name.toCPointer<ByteVar>(), symbol.toCPointer<ByteVar>())

public actual fun SymFromNameW(hprocess: HANDLE, name: PCWSTR, symbol: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymFromNameW(hprocess.toCPointer<ByteVar>(), name.toCPointer<ByteVar>(), symbol.toCPointer<ByteVar>())

public actual fun SymFromToken(hprocess: HANDLE, base: ULong, token: UInt, symbol: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymFromToken(hprocess.toCPointer<ByteVar>(), base, token, symbol.toCPointer<ByteVar>())

public actual fun SymFromTokenW(hprocess: HANDLE, base: ULong, token: UInt, symbol: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymFromTokenW(hprocess.toCPointer<ByteVar>(), base, token, symbol.toCPointer<ByteVar>())

public actual fun SymFunctionTableAccess64(hprocess: HANDLE, addrbase: ULong): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymFunctionTableAccess64(hprocess.toCPointer<ByteVar>(), addrbase)?.toLong() ?: 0L

public actual fun SymFunctionTableAccess64AccessRoutines(hprocess: HANDLE, addrbase: ULong, readmemoryroutine: PREAD_PROCESS_MEMORY_ROUTINE64, getmodulebaseroutine: PGET_MODULE_BASE_ROUTINE64): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymFunctionTableAccess64AccessRoutines(hprocess.toCPointer<ByteVar>(), addrbase, readmemoryroutine.toLong().toCPointer<ByteVar>(), getmodulebaseroutine.toLong().toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun SymGetExtendedOption(option: IMAGEHLP_EXTENDED_OPTIONS): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymGetExtendedOption(option)

public actual fun SymGetFileLineOffsets64(hprocess: HANDLE, modulename: PCSTR, filename: PCSTR, buffer: Long, bufferlines: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymGetFileLineOffsets64(hprocess.toCPointer<ByteVar>(), modulename.toCPointer<ByteVar>(), filename.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), bufferlines)

public actual fun SymGetHomeDirectory(type: UInt, dir: PSTR, size: ULong): PSTR =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymGetHomeDirectory(type, dir.toCPointer<ByteVar>(), size)?.toLong() ?: 0L

public actual fun SymGetHomeDirectoryW(type: UInt, dir: PWSTR, size: ULong): PWSTR =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymGetHomeDirectoryW(type, dir.toCPointer<ByteVar>(), size)?.toLong() ?: 0L

public actual fun SymGetLineFromAddr64(hprocess: HANDLE, qwaddr: ULong, pdwdisplacement: Long, line64: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymGetLineFromAddr64(hprocess.toCPointer<ByteVar>(), qwaddr, pdwdisplacement.toCPointer<ByteVar>(), line64.toCPointer<ByteVar>())

public actual fun SymGetLineFromAddrW64(hprocess: HANDLE, dwaddr: ULong, pdwdisplacement: Long, line: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymGetLineFromAddrW64(hprocess.toCPointer<ByteVar>(), dwaddr, pdwdisplacement.toCPointer<ByteVar>(), line.toCPointer<ByteVar>())

public actual fun SymGetLineFromInlineContext(hprocess: HANDLE, qwaddr: ULong, inlinecontext: UInt, qwmodulebaseaddress: ULong, pdwdisplacement: Long, line64: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymGetLineFromInlineContext(hprocess.toCPointer<ByteVar>(), qwaddr, inlinecontext, qwmodulebaseaddress, pdwdisplacement.toCPointer<ByteVar>(), line64.toCPointer<ByteVar>())

public actual fun SymGetLineFromInlineContextW(hprocess: HANDLE, dwaddr: ULong, inlinecontext: UInt, qwmodulebaseaddress: ULong, pdwdisplacement: Long, line: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymGetLineFromInlineContextW(hprocess.toCPointer<ByteVar>(), dwaddr, inlinecontext, qwmodulebaseaddress, pdwdisplacement.toCPointer<ByteVar>(), line.toCPointer<ByteVar>())

public actual fun SymGetLineFromName64(hprocess: HANDLE, modulename: PCSTR, filename: PCSTR, dwlinenumber: UInt, pldisplacement: Long, line: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymGetLineFromName64(hprocess.toCPointer<ByteVar>(), modulename.toCPointer<ByteVar>(), filename.toCPointer<ByteVar>(), dwlinenumber, pldisplacement.toCPointer<ByteVar>(), line.toCPointer<ByteVar>())

public actual fun SymGetLineFromNameW64(hprocess: HANDLE, modulename: PCWSTR, filename: PCWSTR, dwlinenumber: UInt, pldisplacement: Long, line: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymGetLineFromNameW64(hprocess.toCPointer<ByteVar>(), modulename.toCPointer<ByteVar>(), filename.toCPointer<ByteVar>(), dwlinenumber, pldisplacement.toCPointer<ByteVar>(), line.toCPointer<ByteVar>())

public actual fun SymGetLineNext64(hprocess: HANDLE, line: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymGetLineNext64(hprocess.toCPointer<ByteVar>(), line.toCPointer<ByteVar>())

public actual fun SymGetLineNextW64(hprocess: HANDLE, line: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymGetLineNextW64(hprocess.toCPointer<ByteVar>(), line.toCPointer<ByteVar>())

public actual fun SymGetLinePrev64(hprocess: HANDLE, line: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymGetLinePrev64(hprocess.toCPointer<ByteVar>(), line.toCPointer<ByteVar>())

public actual fun SymGetLinePrevW64(hprocess: HANDLE, line: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymGetLinePrevW64(hprocess.toCPointer<ByteVar>(), line.toCPointer<ByteVar>())

public actual fun SymGetModuleBase64(hprocess: HANDLE, qwaddr: ULong): ULong =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymGetModuleBase64(hprocess.toCPointer<ByteVar>(), qwaddr)

public actual fun SymGetModuleInfo64(hprocess: HANDLE, qwaddr: ULong, moduleinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymGetModuleInfo64(hprocess.toCPointer<ByteVar>(), qwaddr, moduleinfo.toCPointer<ByteVar>())

public actual fun SymGetModuleInfoW64(hprocess: HANDLE, qwaddr: ULong, moduleinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymGetModuleInfoW64(hprocess.toCPointer<ByteVar>(), qwaddr, moduleinfo.toCPointer<ByteVar>())

public actual fun SymGetOmaps(hprocess: HANDLE, baseofdll: ULong, omapto: Long, comapto: Long, omapfrom: Long, comapfrom: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymGetOmaps(hprocess.toCPointer<ByteVar>(), baseofdll, omapto.toCPointer<ByteVar>(), comapto.toCPointer<ByteVar>(), omapfrom.toCPointer<ByteVar>(), comapfrom.toCPointer<ByteVar>())

public actual fun SymGetOptions(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymGetOptions()

public actual fun SymGetScope(hprocess: HANDLE, baseofdll: ULong, index: UInt, symbol: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymGetScope(hprocess.toCPointer<ByteVar>(), baseofdll, index, symbol.toCPointer<ByteVar>())

public actual fun SymGetScopeW(hprocess: HANDLE, baseofdll: ULong, index: UInt, symbol: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymGetScopeW(hprocess.toCPointer<ByteVar>(), baseofdll, index, symbol.toCPointer<ByteVar>())

public actual fun SymGetSearchPath(hprocess: HANDLE, searchpatha: PSTR, searchpathlength: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymGetSearchPath(hprocess.toCPointer<ByteVar>(), searchpatha.toCPointer<ByteVar>(), searchpathlength)

public actual fun SymGetSearchPathW(hprocess: HANDLE, searchpatha: PWSTR, searchpathlength: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymGetSearchPathW(hprocess.toCPointer<ByteVar>(), searchpatha.toCPointer<ByteVar>(), searchpathlength)

public actual fun SymGetSourceFile(hprocess: HANDLE, base: ULong, params: PCSTR, filespec: PCSTR, filepath: PSTR, size: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFile(hprocess.toCPointer<ByteVar>(), base, params.toCPointer<ByteVar>(), filespec.toCPointer<ByteVar>(), filepath.toCPointer<ByteVar>(), size)

public actual fun SymGetSourceFileChecksum(hprocess: HANDLE, base: ULong, filespec: PCSTR, pchecksumtype: Long, pchecksum: Long, checksumsize: UInt, pactualbyteswritten: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFileChecksum(hprocess.toCPointer<ByteVar>(), base, filespec.toCPointer<ByteVar>(), pchecksumtype.toCPointer<ByteVar>(), pchecksum.toCPointer<ByteVar>(), checksumsize, pactualbyteswritten.toCPointer<ByteVar>())

public actual fun SymGetSourceFileChecksumW(hprocess: HANDLE, base: ULong, filespec: PCWSTR, pchecksumtype: Long, pchecksum: Long, checksumsize: UInt, pactualbyteswritten: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFileChecksumW(hprocess.toCPointer<ByteVar>(), base, filespec.toCPointer<ByteVar>(), pchecksumtype.toCPointer<ByteVar>(), pchecksum.toCPointer<ByteVar>(), checksumsize, pactualbyteswritten.toCPointer<ByteVar>())

public actual fun SymGetSourceFileFromToken(hprocess: HANDLE, token: Long, params: PCSTR, filepath: PSTR, size: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFileFromToken(hprocess.toCPointer<ByteVar>(), token.toCPointer<ByteVar>(), params.toCPointer<ByteVar>(), filepath.toCPointer<ByteVar>(), size)

public actual fun SymGetSourceFileFromTokenByTokenName(hprocess: HANDLE, token: Long, tokenname: PCSTR, params: PCSTR, filepath: PSTR, size: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFileFromTokenByTokenName(hprocess.toCPointer<ByteVar>(), token.toCPointer<ByteVar>(), tokenname.toCPointer<ByteVar>(), params.toCPointer<ByteVar>(), filepath.toCPointer<ByteVar>(), size)

public actual fun SymGetSourceFileFromTokenByTokenNameW(hprocess: HANDLE, token: Long, tokenname: PCWSTR, params: PCWSTR, filepath: PWSTR, size: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFileFromTokenByTokenNameW(hprocess.toCPointer<ByteVar>(), token.toCPointer<ByteVar>(), tokenname.toCPointer<ByteVar>(), params.toCPointer<ByteVar>(), filepath.toCPointer<ByteVar>(), size)

public actual fun SymGetSourceFileFromTokenW(hprocess: HANDLE, token: Long, params: PCWSTR, filepath: PWSTR, size: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFileFromTokenW(hprocess.toCPointer<ByteVar>(), token.toCPointer<ByteVar>(), params.toCPointer<ByteVar>(), filepath.toCPointer<ByteVar>(), size)

public actual fun SymGetSourceFileToken(hprocess: HANDLE, base: ULong, filespec: PCSTR, token: Long, size: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFileToken(hprocess.toCPointer<ByteVar>(), base, filespec.toCPointer<ByteVar>(), token.toCPointer<ByteVar>(), size.toCPointer<ByteVar>())

public actual fun SymGetSourceFileTokenByTokenName(hprocess: HANDLE, base: ULong, filespec: PCSTR, tokenname: PCSTR, tokenparameters: PCSTR, token: Long, size: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFileTokenByTokenName(hprocess.toCPointer<ByteVar>(), base, filespec.toCPointer<ByteVar>(), tokenname.toCPointer<ByteVar>(), tokenparameters.toCPointer<ByteVar>(), token.toCPointer<ByteVar>(), size.toCPointer<ByteVar>())

public actual fun SymGetSourceFileTokenByTokenNameW(hprocess: HANDLE, base: ULong, filespec: PCWSTR, tokenname: PCWSTR, tokenparameters: PCWSTR, token: Long, size: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFileTokenByTokenNameW(hprocess.toCPointer<ByteVar>(), base, filespec.toCPointer<ByteVar>(), tokenname.toCPointer<ByteVar>(), tokenparameters.toCPointer<ByteVar>(), token.toCPointer<ByteVar>(), size.toCPointer<ByteVar>())

public actual fun SymGetSourceFileTokenW(hprocess: HANDLE, base: ULong, filespec: PCWSTR, token: Long, size: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFileTokenW(hprocess.toCPointer<ByteVar>(), base, filespec.toCPointer<ByteVar>(), token.toCPointer<ByteVar>(), size.toCPointer<ByteVar>())

public actual fun SymGetSourceFileW(hprocess: HANDLE, base: ULong, params: PCWSTR, filespec: PCWSTR, filepath: PWSTR, size: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFileW(hprocess.toCPointer<ByteVar>(), base, params.toCPointer<ByteVar>(), filespec.toCPointer<ByteVar>(), filepath.toCPointer<ByteVar>(), size)

public actual fun SymGetSourceVarFromToken(hprocess: HANDLE, token: Long, params: PCSTR, varname: PCSTR, value: PSTR, size: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymGetSourceVarFromToken(hprocess.toCPointer<ByteVar>(), token.toCPointer<ByteVar>(), params.toCPointer<ByteVar>(), varname.toCPointer<ByteVar>(), value.toCPointer<ByteVar>(), size)

public actual fun SymGetSourceVarFromTokenW(hprocess: HANDLE, token: Long, params: PCWSTR, varname: PCWSTR, value: PWSTR, size: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymGetSourceVarFromTokenW(hprocess.toCPointer<ByteVar>(), token.toCPointer<ByteVar>(), params.toCPointer<ByteVar>(), varname.toCPointer<ByteVar>(), value.toCPointer<ByteVar>(), size)

public actual fun SymGetSymFromAddr64(hprocess: HANDLE, qwaddr: ULong, pdwdisplacement: Long, symbol: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymGetSymFromAddr64(hprocess.toCPointer<ByteVar>(), qwaddr, pdwdisplacement.toCPointer<ByteVar>(), symbol.toCPointer<ByteVar>())

public actual fun SymGetSymFromName64(hprocess: HANDLE, name: PCSTR, symbol: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymGetSymFromName64(hprocess.toCPointer<ByteVar>(), name.toCPointer<ByteVar>(), symbol.toCPointer<ByteVar>())

public actual fun SymGetSymNext64(hprocess: HANDLE, symbol: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymGetSymNext64(hprocess.toCPointer<ByteVar>(), symbol.toCPointer<ByteVar>())

public actual fun SymGetSymPrev64(hprocess: HANDLE, symbol: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymGetSymPrev64(hprocess.toCPointer<ByteVar>(), symbol.toCPointer<ByteVar>())

public actual fun SymGetSymbolFile(hprocess: HANDLE, sympath: PCSTR, imagefile: PCSTR, type: UInt, symbolfile: PSTR, csymbolfile: ULong, dbgfile: PSTR, cdbgfile: ULong): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymGetSymbolFile(hprocess.toCPointer<ByteVar>(), sympath.toCPointer<ByteVar>(), imagefile.toCPointer<ByteVar>(), type, symbolfile.toCPointer<ByteVar>(), csymbolfile, dbgfile.toCPointer<ByteVar>(), cdbgfile)

public actual fun SymGetSymbolFileW(hprocess: HANDLE, sympath: PCWSTR, imagefile: PCWSTR, type: UInt, symbolfile: PWSTR, csymbolfile: ULong, dbgfile: PWSTR, cdbgfile: ULong): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymGetSymbolFileW(hprocess.toCPointer<ByteVar>(), sympath.toCPointer<ByteVar>(), imagefile.toCPointer<ByteVar>(), type, symbolfile.toCPointer<ByteVar>(), csymbolfile, dbgfile.toCPointer<ByteVar>(), cdbgfile)

public actual fun SymGetTypeFromName(hprocess: HANDLE, baseofdll: ULong, name: PCSTR, symbol: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymGetTypeFromName(hprocess.toCPointer<ByteVar>(), baseofdll, name.toCPointer<ByteVar>(), symbol.toCPointer<ByteVar>())

public actual fun SymGetTypeFromNameW(hprocess: HANDLE, baseofdll: ULong, name: PCWSTR, symbol: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymGetTypeFromNameW(hprocess.toCPointer<ByteVar>(), baseofdll, name.toCPointer<ByteVar>(), symbol.toCPointer<ByteVar>())

public actual fun SymGetTypeInfo(hprocess: HANDLE, modbase: ULong, typeid: UInt, gettype: IMAGEHLP_SYMBOL_TYPE_INFO, pinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymGetTypeInfo(hprocess.toCPointer<ByteVar>(), modbase, typeid, gettype, pinfo.toCPointer<ByteVar>())

public actual fun SymGetTypeInfoEx(hprocess: HANDLE, modbase: ULong, params: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymGetTypeInfoEx(hprocess.toCPointer<ByteVar>(), modbase, params.toCPointer<ByteVar>())

public actual fun SymGetUnwindInfo(hprocess: HANDLE, address: ULong, buffer: Long, size: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymGetUnwindInfo(hprocess.toCPointer<ByteVar>(), address, buffer.toCPointer<ByteVar>(), size.toCPointer<ByteVar>())

public actual fun SymInitialize(hprocess: HANDLE, usersearchpath: PCSTR, finvadeprocess: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymInitialize(hprocess.toCPointer<ByteVar>(), usersearchpath.toCPointer<ByteVar>(), finvadeprocess)

public actual fun SymInitializeW(hprocess: HANDLE, usersearchpath: PCWSTR, finvadeprocess: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymInitializeW(hprocess.toCPointer<ByteVar>(), usersearchpath.toCPointer<ByteVar>(), finvadeprocess)

public actual fun SymLoadModule64(hprocess: HANDLE, hfile: HANDLE, imagename: PCSTR, modulename: PCSTR, baseofdll: ULong, sizeofdll: UInt): ULong =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymLoadModule64(hprocess.toCPointer<ByteVar>(), hfile.toCPointer<ByteVar>(), imagename.toCPointer<ByteVar>(), modulename.toCPointer<ByteVar>(), baseofdll, sizeofdll)

public actual fun SymLoadModuleEx(hprocess: HANDLE, hfile: HANDLE, imagename: PCSTR, modulename: PCSTR, baseofdll: ULong, dllsize: UInt, data: Long, flags: SYM_LOAD_FLAGS): ULong =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymLoadModuleEx(hprocess.toCPointer<ByteVar>(), hfile.toCPointer<ByteVar>(), imagename.toCPointer<ByteVar>(), modulename.toCPointer<ByteVar>(), baseofdll, dllsize, data.toCPointer<ByteVar>(), flags)

public actual fun SymLoadModuleExW(hprocess: HANDLE, hfile: HANDLE, imagename: PCWSTR, modulename: PCWSTR, baseofdll: ULong, dllsize: UInt, data: Long, flags: SYM_LOAD_FLAGS): ULong =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymLoadModuleExW(hprocess.toCPointer<ByteVar>(), hfile.toCPointer<ByteVar>(), imagename.toCPointer<ByteVar>(), modulename.toCPointer<ByteVar>(), baseofdll, dllsize, data.toCPointer<ByteVar>(), flags)

public actual fun SymMatchFileName(filename: PCSTR, match: PCSTR, filenamestop: Long, matchstop: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymMatchFileName(filename.toCPointer<ByteVar>(), match.toCPointer<ByteVar>(), filenamestop.toCPointer<ByteVar>(), matchstop.toCPointer<ByteVar>())

public actual fun SymMatchFileNameW(filename: PCWSTR, match: PCWSTR, filenamestop: Long, matchstop: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymMatchFileNameW(filename.toCPointer<ByteVar>(), match.toCPointer<ByteVar>(), filenamestop.toCPointer<ByteVar>(), matchstop.toCPointer<ByteVar>())

public actual fun SymMatchString(string: PCSTR, expression: PCSTR, fcase: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymMatchString(string.toCPointer<ByteVar>(), expression.toCPointer<ByteVar>(), fcase)

public actual fun SymMatchStringA(string: PCSTR, expression: PCSTR, fcase: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymMatchStringA(string.toCPointer<ByteVar>(), expression.toCPointer<ByteVar>(), fcase)

public actual fun SymMatchStringW(string: PCWSTR, expression: PCWSTR, fcase: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymMatchStringW(string.toCPointer<ByteVar>(), expression.toCPointer<ByteVar>(), fcase)

public actual fun SymNext(hprocess: HANDLE, si: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymNext(hprocess.toCPointer<ByteVar>(), si.toCPointer<ByteVar>())

public actual fun SymNextW(hprocess: HANDLE, siw: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymNextW(hprocess.toCPointer<ByteVar>(), siw.toCPointer<ByteVar>())

public actual fun SymPrev(hprocess: HANDLE, si: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymPrev(hprocess.toCPointer<ByteVar>(), si.toCPointer<ByteVar>())

public actual fun SymPrevW(hprocess: HANDLE, siw: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymPrevW(hprocess.toCPointer<ByteVar>(), siw.toCPointer<ByteVar>())

public actual fun SymQueryInlineTrace(hprocess: HANDLE, startaddress: ULong, startcontext: UInt, startretaddress: ULong, curaddress: ULong, curcontext: Long, curframeindex: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymQueryInlineTrace(hprocess.toCPointer<ByteVar>(), startaddress, startcontext, startretaddress, curaddress, curcontext.toCPointer<ByteVar>(), curframeindex.toCPointer<ByteVar>())

public actual fun SymRefreshModuleList(hprocess: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymRefreshModuleList(hprocess.toCPointer<ByteVar>())

public actual fun SymRegisterCallback64(hprocess: HANDLE, callbackfunction: PSYMBOL_REGISTERED_CALLBACK64, usercontext: ULong): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymRegisterCallback64(hprocess.toCPointer<ByteVar>(), callbackfunction.toLong().toCPointer<ByteVar>(), usercontext)

public actual fun SymRegisterCallbackW64(hprocess: HANDLE, callbackfunction: PSYMBOL_REGISTERED_CALLBACK64, usercontext: ULong): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymRegisterCallbackW64(hprocess.toCPointer<ByteVar>(), callbackfunction.toLong().toCPointer<ByteVar>(), usercontext)

public actual fun SymRegisterFunctionEntryCallback64(hprocess: HANDLE, callbackfunction: PSYMBOL_FUNCENTRY_CALLBACK64, usercontext: ULong): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymRegisterFunctionEntryCallback64(hprocess.toCPointer<ByteVar>(), callbackfunction.toLong().toCPointer<ByteVar>(), usercontext)

public actual fun SymSearch(hprocess: HANDLE, baseofdll: ULong, index: UInt, symtag: UInt, mask: PCSTR, address: ULong, enumsymbolscallback: PSYM_ENUMERATESYMBOLS_CALLBACK, usercontext: Long, options: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymSearch(hprocess.toCPointer<ByteVar>(), baseofdll, index, symtag, mask.toCPointer<ByteVar>(), address, enumsymbolscallback.toLong().toCPointer<ByteVar>(), usercontext.toCPointer<ByteVar>(), options)

public actual fun SymSearchW(hprocess: HANDLE, baseofdll: ULong, index: UInt, symtag: UInt, mask: PCWSTR, address: ULong, enumsymbolscallback: PSYM_ENUMERATESYMBOLS_CALLBACKW, usercontext: Long, options: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymSearchW(hprocess.toCPointer<ByteVar>(), baseofdll, index, symtag, mask.toCPointer<ByteVar>(), address, enumsymbolscallback.toLong().toCPointer<ByteVar>(), usercontext.toCPointer<ByteVar>(), options)

public actual fun SymSetContext(hprocess: HANDLE, stackframe: Long, context: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymSetContext(hprocess.toCPointer<ByteVar>(), stackframe.toCPointer<ByteVar>(), context.toCPointer<ByteVar>())

public actual fun SymSetExtendedOption(option: IMAGEHLP_EXTENDED_OPTIONS, value: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymSetExtendedOption(option, value)

public actual fun SymSetHomeDirectory(hprocess: HANDLE, dir: PCSTR): PSTR =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymSetHomeDirectory(hprocess.toCPointer<ByteVar>(), dir.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun SymSetHomeDirectoryW(hprocess: HANDLE, dir: PCWSTR): PWSTR =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymSetHomeDirectoryW(hprocess.toCPointer<ByteVar>(), dir.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun SymSetOptions(symoptions: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymSetOptions(symoptions)

public actual fun SymSetParentWindow(hwnd: HWND): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymSetParentWindow(hwnd.toCPointer<ByteVar>())

public actual fun SymSetScopeFromAddr(hprocess: HANDLE, address: ULong): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymSetScopeFromAddr(hprocess.toCPointer<ByteVar>(), address)

public actual fun SymSetScopeFromIndex(hprocess: HANDLE, baseofdll: ULong, index: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymSetScopeFromIndex(hprocess.toCPointer<ByteVar>(), baseofdll, index)

public actual fun SymSetScopeFromInlineContext(hprocess: HANDLE, address: ULong, inlinecontext: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymSetScopeFromInlineContext(hprocess.toCPointer<ByteVar>(), address, inlinecontext)

public actual fun SymSetSearchPath(hprocess: HANDLE, searchpatha: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymSetSearchPath(hprocess.toCPointer<ByteVar>(), searchpatha.toCPointer<ByteVar>())

public actual fun SymSetSearchPathW(hprocess: HANDLE, searchpatha: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymSetSearchPathW(hprocess.toCPointer<ByteVar>(), searchpatha.toCPointer<ByteVar>())

public actual fun SymSrvDeltaName(hprocess: HANDLE, sympath: PCSTR, type: PCSTR, file1: PCSTR, file2: PCSTR): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymSrvDeltaName(hprocess.toCPointer<ByteVar>(), sympath.toCPointer<ByteVar>(), type.toCPointer<ByteVar>(), file1.toCPointer<ByteVar>(), file2.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun SymSrvDeltaNameW(hprocess: HANDLE, sympath: PCWSTR, type: PCWSTR, file1: PCWSTR, file2: PCWSTR): PCWSTR =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymSrvDeltaNameW(hprocess.toCPointer<ByteVar>(), sympath.toCPointer<ByteVar>(), type.toCPointer<ByteVar>(), file1.toCPointer<ByteVar>(), file2.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun SymSrvGetFileIndexInfo(file: PCSTR, info: Long, flags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymSrvGetFileIndexInfo(file.toCPointer<ByteVar>(), info.toCPointer<ByteVar>(), flags)

public actual fun SymSrvGetFileIndexInfoW(file: PCWSTR, info: Long, flags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymSrvGetFileIndexInfoW(file.toCPointer<ByteVar>(), info.toCPointer<ByteVar>(), flags)

public actual fun SymSrvGetFileIndexString(hprocess: HANDLE, srvpath: PCSTR, file: PCSTR, index: PSTR, size: ULong, flags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymSrvGetFileIndexString(hprocess.toCPointer<ByteVar>(), srvpath.toCPointer<ByteVar>(), file.toCPointer<ByteVar>(), index.toCPointer<ByteVar>(), size, flags)

public actual fun SymSrvGetFileIndexStringW(hprocess: HANDLE, srvpath: PCWSTR, file: PCWSTR, index: PWSTR, size: ULong, flags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymSrvGetFileIndexStringW(hprocess.toCPointer<ByteVar>(), srvpath.toCPointer<ByteVar>(), file.toCPointer<ByteVar>(), index.toCPointer<ByteVar>(), size, flags)

public actual fun SymSrvGetFileIndexes(file: PCSTR, id: Long, val1: Long, val2: Long, flags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymSrvGetFileIndexes(file.toCPointer<ByteVar>(), id.toCPointer<ByteVar>(), val1.toCPointer<ByteVar>(), val2.toCPointer<ByteVar>(), flags)

public actual fun SymSrvGetFileIndexesW(file: PCWSTR, id: Long, val1: Long, val2: Long, flags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymSrvGetFileIndexesW(file.toCPointer<ByteVar>(), id.toCPointer<ByteVar>(), val1.toCPointer<ByteVar>(), val2.toCPointer<ByteVar>(), flags)

public actual fun SymSrvGetSupplement(hprocess: HANDLE, sympath: PCSTR, node: PCSTR, file: PCSTR): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymSrvGetSupplement(hprocess.toCPointer<ByteVar>(), sympath.toCPointer<ByteVar>(), node.toCPointer<ByteVar>(), file.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun SymSrvGetSupplementW(hprocess: HANDLE, sympath: PCWSTR, node: PCWSTR, file: PCWSTR): PCWSTR =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymSrvGetSupplementW(hprocess.toCPointer<ByteVar>(), sympath.toCPointer<ByteVar>(), node.toCPointer<ByteVar>(), file.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun SymSrvIsStore(hprocess: HANDLE, path: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymSrvIsStore(hprocess.toCPointer<ByteVar>(), path.toCPointer<ByteVar>())

public actual fun SymSrvIsStoreW(hprocess: HANDLE, path: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymSrvIsStoreW(hprocess.toCPointer<ByteVar>(), path.toCPointer<ByteVar>())

public actual fun SymSrvStoreFile(hprocess: HANDLE, srvpath: PCSTR, file: PCSTR, flags: SYM_SRV_STORE_FILE_FLAGS): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymSrvStoreFile(hprocess.toCPointer<ByteVar>(), srvpath.toCPointer<ByteVar>(), file.toCPointer<ByteVar>(), flags)?.toLong() ?: 0L

public actual fun SymSrvStoreFileW(hprocess: HANDLE, srvpath: PCWSTR, file: PCWSTR, flags: SYM_SRV_STORE_FILE_FLAGS): PCWSTR =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymSrvStoreFileW(hprocess.toCPointer<ByteVar>(), srvpath.toCPointer<ByteVar>(), file.toCPointer<ByteVar>(), flags)?.toLong() ?: 0L

public actual fun SymSrvStoreSupplement(hprocess: HANDLE, srvpath: PCSTR, node: PCSTR, file: PCSTR, flags: UInt): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymSrvStoreSupplement(hprocess.toCPointer<ByteVar>(), srvpath.toCPointer<ByteVar>(), node.toCPointer<ByteVar>(), file.toCPointer<ByteVar>(), flags)?.toLong() ?: 0L

public actual fun SymSrvStoreSupplementW(hprocess: HANDLE, sympath: PCWSTR, node: PCWSTR, file: PCWSTR, flags: UInt): PCWSTR =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymSrvStoreSupplementW(hprocess.toCPointer<ByteVar>(), sympath.toCPointer<ByteVar>(), node.toCPointer<ByteVar>(), file.toCPointer<ByteVar>(), flags)?.toLong() ?: 0L

public actual fun SymUnDName64(sym: Long, undecname: PSTR, undecnamelength: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymUnDName64(sym.toCPointer<ByteVar>(), undecname.toCPointer<ByteVar>(), undecnamelength)

public actual fun SymUnloadModule64(hprocess: HANDLE, baseofdll: ULong): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_SymUnloadModule64(hprocess.toCPointer<ByteVar>(), baseofdll)

public actual fun TerminateProcessOnMemoryExhaustion(failedallocationsize: ULong) {
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_TerminateProcessOnMemoryExhaustion(failedallocationsize)
}

public actual fun TouchFileTimes(filehandle: HANDLE, psystemtime: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_TouchFileTimes(filehandle.toCPointer<ByteVar>(), psystemtime.toCPointer<ByteVar>())

public actual fun UnDecorateSymbolName(name: PCSTR, outputstring: PSTR, maxstringlength: UInt, flags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_UnDecorateSymbolName(name.toCPointer<ByteVar>(), outputstring.toCPointer<ByteVar>(), maxstringlength, flags)

public actual fun UnDecorateSymbolNameW(name: PCWSTR, outputstring: PWSTR, maxstringlength: UInt, flags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_UnDecorateSymbolNameW(name.toCPointer<ByteVar>(), outputstring.toCPointer<ByteVar>(), maxstringlength, flags)

public actual fun UnMapAndLoad(loadedimage: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_UnMapAndLoad(loadedimage.toCPointer<ByteVar>())

public actual fun UnhandledExceptionFilter(exceptioninfo: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_UnhandledExceptionFilter(exceptioninfo.toCPointer<ByteVar>())

public actual fun UpdateDebugInfoFile(imagefilename: PCSTR, symbolpath: PCSTR, debugfilepath: PSTR, ntheaders: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_UpdateDebugInfoFile(imagefilename.toCPointer<ByteVar>(), symbolpath.toCPointer<ByteVar>(), debugfilepath.toCPointer<ByteVar>(), ntheaders.toCPointer<ByteVar>())

public actual fun UpdateDebugInfoFileEx(imagefilename: PCSTR, symbolpath: PCSTR, debugfilepath: PSTR, ntheaders: Long, oldchecksum: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_UpdateDebugInfoFileEx(imagefilename.toCPointer<ByteVar>(), symbolpath.toCPointer<ByteVar>(), debugfilepath.toCPointer<ByteVar>(), ntheaders.toCPointer<ByteVar>(), oldchecksum)

public actual fun WaitForDebugEvent(lpdebugevent: Long, dwmilliseconds: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_WaitForDebugEvent(lpdebugevent.toCPointer<ByteVar>(), dwmilliseconds)

public actual fun WaitForDebugEventEx(lpdebugevent: Long, dwmilliseconds: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_WaitForDebugEventEx(lpdebugevent.toCPointer<ByteVar>(), dwmilliseconds)

public actual fun Wow64GetThreadContext(hthread: HANDLE, lpcontext: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_Wow64GetThreadContext(hthread.toCPointer<ByteVar>(), lpcontext.toCPointer<ByteVar>())

public actual fun Wow64GetThreadSelectorEntry(hthread: HANDLE, dwselector: UInt, lpselectorentry: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_Wow64GetThreadSelectorEntry(hthread.toCPointer<ByteVar>(), dwselector, lpselectorentry.toCPointer<ByteVar>())

public actual fun Wow64SetThreadContext(hthread: HANDLE, lpcontext: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_Wow64SetThreadContext(hthread.toCPointer<ByteVar>(), lpcontext.toCPointer<ByteVar>())

public actual fun WriteProcessMemory(hprocess: HANDLE, lpbaseaddress: Long, lpbuffer: Long, nsize: ULong, lpnumberofbyteswritten: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.cinterop.windowssys_windows_win32_system_diagnostics_debug_WriteProcessMemory(hprocess.toCPointer<ByteVar>(), lpbaseaddress.toCPointer<ByteVar>(), lpbuffer.toCPointer<ByteVar>(), nsize, lpnumberofbyteswritten.toCPointer<ByteVar>())
