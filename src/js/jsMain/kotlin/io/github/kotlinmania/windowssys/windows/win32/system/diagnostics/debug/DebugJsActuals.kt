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

private val _windowsWin32SystemDiagnosticsDebugNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun AddVectoredContinueHandler(first: UInt, handler: PVECTORED_EXCEPTION_HANDLER): Long =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_AddVectoredContinueHandler(first.toInt(), handler.toLong().toString()) as String).toLong() else 0L

public actual fun AddVectoredExceptionHandler(first: UInt, handler: PVECTORED_EXCEPTION_HANDLER): Long =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_AddVectoredExceptionHandler(first.toInt(), handler.toLong().toString()) as String).toLong() else 0L

public actual fun Beep(dwfreq: UInt, dwduration: UInt): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_Beep(dwfreq.toInt(), dwduration.toInt()) as Int) else 0

public actual fun BindImage(imagename: PCSTR, dllpath: PCSTR, symbolpath: PCSTR): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_BindImage(imagename.toString(), dllpath.toString(), symbolpath.toString()) as Int) else 0

public actual fun BindImageEx(flags: UInt, imagename: PCSTR, dllpath: PCSTR, symbolpath: PCSTR, statusroutine: PIMAGEHLP_STATUS_ROUTINE): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_BindImageEx(flags.toInt(), imagename.toString(), dllpath.toString(), symbolpath.toString(), statusroutine.toLong().toString()) as Int) else 0

public actual fun CheckRemoteDebuggerPresent(hprocess: HANDLE, pbdebuggerpresent: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_CheckRemoteDebuggerPresent(hprocess.toString(), pbdebuggerpresent.toString()) as Int) else 0

public actual fun CheckSumMappedFile(baseaddress: Long, filelength: UInt, headersum: Long, checksum: Long): Long =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_CheckSumMappedFile(baseaddress.toString(), filelength.toInt(), headersum.toString(), checksum.toString()) as String).toLong() else 0L

public actual fun CloseThreadWaitChainSession(wcthandle: Long) {
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) {
        _windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_CloseThreadWaitChainSession(wcthandle.toString())
    }
}

public actual fun ContinueDebugEvent(dwprocessid: UInt, dwthreadid: UInt, dwcontinuestatus: NTSTATUS): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_ContinueDebugEvent(dwprocessid.toInt(), dwthreadid.toInt(), dwcontinuestatus) as Int) else 0

public actual fun CopyContext(destination: Long, contextflags: CONTEXT_FLAGS, source: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_CopyContext(destination.toString(), contextflags.toInt(), source.toString()) as Int) else 0

public actual fun DbgHelpCreateUserDump(filename: PCSTR, callback: PDBGHELP_CREATE_USER_DUMP_CALLBACK, userdata: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_DbgHelpCreateUserDump(filename.toString(), callback.toLong().toString(), userdata.toString()) as Int) else 0

public actual fun DbgHelpCreateUserDumpW(filename: PCWSTR, callback: PDBGHELP_CREATE_USER_DUMP_CALLBACK, userdata: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_DbgHelpCreateUserDumpW(filename.toString(), callback.toLong().toString(), userdata.toString()) as Int) else 0

public actual fun DebugActiveProcess(dwprocessid: UInt): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_DebugActiveProcess(dwprocessid.toInt()) as Int) else 0

public actual fun DebugActiveProcessStop(dwprocessid: UInt): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_DebugActiveProcessStop(dwprocessid.toInt()) as Int) else 0

public actual fun DebugBreak() {
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) {
        _windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_DebugBreak()
    }
}

public actual fun DebugBreakProcess(process: HANDLE): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_DebugBreakProcess(process.toString()) as Int) else 0

public actual fun DebugSetProcessKillOnExit(killonexit: BOOL): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_DebugSetProcessKillOnExit(killonexit) as Int) else 0

public actual fun DecodePointer(ptr: Long): Long =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_DecodePointer(ptr.toString()) as String).toLong() else 0L

public actual fun DecodeRemotePointer(processhandle: HANDLE, ptr: Long, decodedptr: Long): HRESULT =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_DecodeRemotePointer(processhandle.toString(), ptr.toString(), decodedptr.toString()) as Int) else 0

public actual fun DecodeSystemPointer(ptr: Long): Long =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_DecodeSystemPointer(ptr.toString()) as String).toLong() else 0L

public actual fun EncodePointer(ptr: Long): Long =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_EncodePointer(ptr.toString()) as String).toLong() else 0L

public actual fun EncodeRemotePointer(processhandle: HANDLE, ptr: Long, encodedptr: Long): HRESULT =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_EncodeRemotePointer(processhandle.toString(), ptr.toString(), encodedptr.toString()) as Int) else 0

public actual fun EncodeSystemPointer(ptr: Long): Long =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_EncodeSystemPointer(ptr.toString()) as String).toLong() else 0L

public actual fun EnumDirTree(hprocess: HANDLE, rootpath: PCSTR, inputpathname: PCSTR, outputpathbuffer: PSTR, cb: PENUMDIRTREE_CALLBACK, data: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_EnumDirTree(hprocess.toString(), rootpath.toString(), inputpathname.toString(), outputpathbuffer.toString(), cb.toLong().toString(), data.toString()) as Int) else 0

public actual fun EnumDirTreeW(hprocess: HANDLE, rootpath: PCWSTR, inputpathname: PCWSTR, outputpathbuffer: PWSTR, cb: PENUMDIRTREE_CALLBACKW, data: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_EnumDirTreeW(hprocess.toString(), rootpath.toString(), inputpathname.toString(), outputpathbuffer.toString(), cb.toLong().toString(), data.toString()) as Int) else 0

public actual fun EnumerateLoadedModules64(hprocess: HANDLE, enumloadedmodulescallback: PENUMLOADED_MODULES_CALLBACK64, usercontext: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_EnumerateLoadedModules64(hprocess.toString(), enumloadedmodulescallback.toLong().toString(), usercontext.toString()) as Int) else 0

public actual fun EnumerateLoadedModulesEx(hprocess: HANDLE, enumloadedmodulescallback: PENUMLOADED_MODULES_CALLBACK64, usercontext: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_EnumerateLoadedModulesEx(hprocess.toString(), enumloadedmodulescallback.toLong().toString(), usercontext.toString()) as Int) else 0

public actual fun EnumerateLoadedModulesExW(hprocess: HANDLE, enumloadedmodulescallback: PENUMLOADED_MODULES_CALLBACKW64, usercontext: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_EnumerateLoadedModulesExW(hprocess.toString(), enumloadedmodulescallback.toLong().toString(), usercontext.toString()) as Int) else 0

public actual fun EnumerateLoadedModulesW64(hprocess: HANDLE, enumloadedmodulescallback: PENUMLOADED_MODULES_CALLBACKW64, usercontext: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_EnumerateLoadedModulesW64(hprocess.toString(), enumloadedmodulescallback.toLong().toString(), usercontext.toString()) as Int) else 0

public actual fun FatalAppExitA(uaction: UInt, lpmessagetext: PCSTR) {
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) {
        _windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_FatalAppExitA(uaction.toInt(), lpmessagetext.toString())
    }
}

public actual fun FatalAppExitW(uaction: UInt, lpmessagetext: PCWSTR) {
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) {
        _windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_FatalAppExitW(uaction.toInt(), lpmessagetext.toString())
    }
}

public actual fun FatalExit(exitcode: Int): Nothing {
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) {
        _windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_FatalExit(exitcode)
    }
    error("Unreachable noreturn C function FatalExit")
}

public actual fun FindDebugInfoFile(filename: PCSTR, symbolpath: PCSTR, debugfilepath: PSTR): HANDLE =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_FindDebugInfoFile(filename.toString(), symbolpath.toString(), debugfilepath.toString()) as String).toLong() else 0L

public actual fun FindDebugInfoFileEx(filename: PCSTR, symbolpath: PCSTR, debugfilepath: PSTR, callback: PFIND_DEBUG_FILE_CALLBACK, callerdata: Long): HANDLE =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_FindDebugInfoFileEx(filename.toString(), symbolpath.toString(), debugfilepath.toString(), callback.toLong().toString(), callerdata.toString()) as String).toLong() else 0L

public actual fun FindDebugInfoFileExW(filename: PCWSTR, symbolpath: PCWSTR, debugfilepath: PWSTR, callback: PFIND_DEBUG_FILE_CALLBACKW, callerdata: Long): HANDLE =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_FindDebugInfoFileExW(filename.toString(), symbolpath.toString(), debugfilepath.toString(), callback.toLong().toString(), callerdata.toString()) as String).toLong() else 0L

public actual fun FindExecutableImage(filename: PCSTR, symbolpath: PCSTR, imagefilepath: PSTR): HANDLE =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_FindExecutableImage(filename.toString(), symbolpath.toString(), imagefilepath.toString()) as String).toLong() else 0L

public actual fun FindExecutableImageEx(filename: PCSTR, symbolpath: PCSTR, imagefilepath: PSTR, callback: PFIND_EXE_FILE_CALLBACK, callerdata: Long): HANDLE =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_FindExecutableImageEx(filename.toString(), symbolpath.toString(), imagefilepath.toString(), callback.toLong().toString(), callerdata.toString()) as String).toLong() else 0L

public actual fun FindExecutableImageExW(filename: PCWSTR, symbolpath: PCWSTR, imagefilepath: PWSTR, callback: PFIND_EXE_FILE_CALLBACKW, callerdata: Long): HANDLE =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_FindExecutableImageExW(filename.toString(), symbolpath.toString(), imagefilepath.toString(), callback.toLong().toString(), callerdata.toString()) as String).toLong() else 0L

public actual fun FindFileInPath(hprocess: HANDLE, searchpatha: PCSTR, filename: PCSTR, id: Long, two: UInt, three: UInt, flags: UInt, filepath: PSTR): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_FindFileInPath(hprocess.toString(), searchpatha.toString(), filename.toString(), id.toString(), two.toInt(), three.toInt(), flags.toInt(), filepath.toString()) as Int) else 0

public actual fun FindFileInSearchPath(hprocess: HANDLE, searchpatha: PCSTR, filename: PCSTR, one: UInt, two: UInt, three: UInt, filepath: PSTR): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_FindFileInSearchPath(hprocess.toString(), searchpatha.toString(), filename.toString(), one.toInt(), two.toInt(), three.toInt(), filepath.toString()) as Int) else 0

public actual fun FlushInstructionCache(hprocess: HANDLE, lpbaseaddress: Long, dwsize: ULong): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_FlushInstructionCache(hprocess.toString(), lpbaseaddress.toString(), dwsize.toString()) as Int) else 0

public actual fun FormatMessageA(dwflags: FORMAT_MESSAGE_OPTIONS, lpsource: Long, dwmessageid: UInt, dwlanguageid: UInt, lpbuffer: PSTR, nsize: UInt, arguments: Long): UInt =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_FormatMessageA(dwflags.toInt(), lpsource.toString(), dwmessageid.toInt(), dwlanguageid.toInt(), lpbuffer.toString(), nsize.toInt(), arguments.toString()) as Int).toUInt() else 0u

public actual fun FormatMessageW(dwflags: FORMAT_MESSAGE_OPTIONS, lpsource: Long, dwmessageid: UInt, dwlanguageid: UInt, lpbuffer: PWSTR, nsize: UInt, arguments: Long): UInt =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_FormatMessageW(dwflags.toInt(), lpsource.toString(), dwmessageid.toInt(), dwlanguageid.toInt(), lpbuffer.toString(), nsize.toInt(), arguments.toString()) as Int).toUInt() else 0u

public actual fun GetEnabledXStateFeatures(): ULong =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_GetEnabledXStateFeatures() as String).toULong() else 0uL

public actual fun GetErrorMode(): UInt =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_GetErrorMode() as Int).toUInt() else 0u

public actual fun GetImageConfigInformation(loadedimage: Long, imageconfiginformation: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_GetImageConfigInformation(loadedimage.toString(), imageconfiginformation.toString()) as Int) else 0

public actual fun GetImageUnusedHeaderBytes(loadedimage: Long, sizeunusedheaderbytes: Long): UInt =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_GetImageUnusedHeaderBytes(loadedimage.toString(), sizeunusedheaderbytes.toString()) as Int).toUInt() else 0u

public actual fun GetSymLoadError(): UInt =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_GetSymLoadError() as Int).toUInt() else 0u

public actual fun GetThreadContext(hthread: HANDLE, lpcontext: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_GetThreadContext(hthread.toString(), lpcontext.toString()) as Int) else 0

public actual fun GetThreadErrorMode(): UInt =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_GetThreadErrorMode() as Int).toUInt() else 0u

public actual fun GetThreadSelectorEntry(hthread: HANDLE, dwselector: UInt, lpselectorentry: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_GetThreadSelectorEntry(hthread.toString(), dwselector.toInt(), lpselectorentry.toString()) as Int) else 0

public actual fun GetThreadWaitChain(wcthandle: Long, context: ULong, flags: WAIT_CHAIN_THREAD_OPTIONS, threadid: UInt, nodecount: Long, nodeinfoarray: Long, iscycle: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_GetThreadWaitChain(wcthandle.toString(), context.toString(), flags.toInt(), threadid.toInt(), nodecount.toString(), nodeinfoarray.toString(), iscycle.toString()) as Int) else 0

public actual fun GetTimestampForLoadedLibrary(module: HMODULE): UInt =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_GetTimestampForLoadedLibrary(module.toString()) as Int).toUInt() else 0u

public actual fun GetXStateFeaturesMask(context: Long, featuremask: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_GetXStateFeaturesMask(context.toString(), featuremask.toString()) as Int) else 0

public actual fun ImageAddCertificate(filehandle: HANDLE, certificate: Long, index: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_ImageAddCertificate(filehandle.toString(), certificate.toString(), index.toString()) as Int) else 0

public actual fun ImageDirectoryEntryToData(base: Long, mappedasimage: Boolean, directoryentry: IMAGE_DIRECTORY_ENTRY, size: Long): Long =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_ImageDirectoryEntryToData(base.toString(), mappedasimage, directoryentry.toInt(), size.toString()) as String).toLong() else 0L

public actual fun ImageDirectoryEntryToDataEx(base: Long, mappedasimage: Boolean, directoryentry: IMAGE_DIRECTORY_ENTRY, size: Long, foundheader: Long): Long =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_ImageDirectoryEntryToDataEx(base.toString(), mappedasimage, directoryentry.toInt(), size.toString(), foundheader.toString()) as String).toLong() else 0L

public actual fun ImageEnumerateCertificates(filehandle: HANDLE, typefilter: UShort, certificatecount: Long, indices: Long, indexcount: UInt): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_ImageEnumerateCertificates(filehandle.toString(), typefilter.toInt(), certificatecount.toString(), indices.toString(), indexcount.toInt()) as Int) else 0

public actual fun ImageGetCertificateData(filehandle: HANDLE, certificateindex: UInt, certificate: Long, requiredlength: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_ImageGetCertificateData(filehandle.toString(), certificateindex.toInt(), certificate.toString(), requiredlength.toString()) as Int) else 0

public actual fun ImageGetCertificateHeader(filehandle: HANDLE, certificateindex: UInt, certificateheader: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_ImageGetCertificateHeader(filehandle.toString(), certificateindex.toInt(), certificateheader.toString()) as Int) else 0

public actual fun ImageGetDigestStream(filehandle: HANDLE, digestlevel: UInt, digestfunction: DIGEST_FUNCTION, digesthandle: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_ImageGetDigestStream(filehandle.toString(), digestlevel.toInt(), digestfunction.toLong().toString(), digesthandle.toString()) as Int) else 0

public actual fun ImageLoad(dllname: PCSTR, dllpath: PCSTR): Long =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_ImageLoad(dllname.toString(), dllpath.toString()) as String).toLong() else 0L

public actual fun ImageNtHeader(base: Long): Long =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_ImageNtHeader(base.toString()) as String).toLong() else 0L

public actual fun ImageRemoveCertificate(filehandle: HANDLE, index: UInt): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_ImageRemoveCertificate(filehandle.toString(), index.toInt()) as Int) else 0

public actual fun ImageRvaToSection(ntheaders: Long, base: Long, rva: UInt): Long =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_ImageRvaToSection(ntheaders.toString(), base.toString(), rva.toInt()) as String).toLong() else 0L

public actual fun ImageRvaToVa(ntheaders: Long, base: Long, rva: UInt, lastrvasection: Long): Long =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_ImageRvaToVa(ntheaders.toString(), base.toString(), rva.toInt(), lastrvasection.toString()) as String).toLong() else 0L

public actual fun ImageUnload(loadedimage: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_ImageUnload(loadedimage.toString()) as Int) else 0

public actual fun ImagehlpApiVersion(): Long =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_ImagehlpApiVersion() as String).toLong() else 0L

public actual fun ImagehlpApiVersionEx(appversion: Long): Long =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_ImagehlpApiVersionEx(appversion.toString()) as String).toLong() else 0L

public actual fun InitializeContext(buffer: Long, contextflags: CONTEXT_FLAGS, context: Long, contextlength: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_InitializeContext(buffer.toString(), contextflags.toInt(), context.toString(), contextlength.toString()) as Int) else 0

public actual fun InitializeContext2(buffer: Long, contextflags: CONTEXT_FLAGS, context: Long, contextlength: Long, xstatecompactionmask: ULong): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_InitializeContext2(buffer.toString(), contextflags.toInt(), context.toString(), contextlength.toString(), xstatecompactionmask.toString()) as Int) else 0

public actual fun IsDebuggerPresent(): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_IsDebuggerPresent() as Int) else 0

public actual fun LocateXStateFeature(context: Long, featureid: UInt, length: Long): Long =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_LocateXStateFeature(context.toString(), featureid.toInt(), length.toString()) as String).toLong() else 0L

public actual fun MakeSureDirectoryPathExists(dirpath: PCSTR): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_MakeSureDirectoryPathExists(dirpath.toString()) as Int) else 0

public actual fun MapAndLoad(imagename: PCSTR, dllpath: PCSTR, loadedimage: Long, dotdll: BOOL, readonly: BOOL): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_MapAndLoad(imagename.toString(), dllpath.toString(), loadedimage.toString(), dotdll, readonly) as Int) else 0

public actual fun MapFileAndCheckSumA(filename: PCSTR, headersum: Long, checksum: Long): UInt =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_MapFileAndCheckSumA(filename.toString(), headersum.toString(), checksum.toString()) as Int).toUInt() else 0u

public actual fun MapFileAndCheckSumW(filename: PCWSTR, headersum: Long, checksum: Long): UInt =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_MapFileAndCheckSumW(filename.toString(), headersum.toString(), checksum.toString()) as Int).toUInt() else 0u

public actual fun MessageBeep(utype: MESSAGEBOX_STYLE): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_MessageBeep(utype.toInt()) as Int) else 0

public actual fun MiniDumpReadDumpStream(baseofdump: Long, streamnumber: UInt, dir: Long, streampointer: Long, streamsize: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_MiniDumpReadDumpStream(baseofdump.toString(), streamnumber.toInt(), dir.toString(), streampointer.toString(), streamsize.toString()) as Int) else 0

public actual fun MiniDumpWriteDump(hprocess: HANDLE, processid: UInt, hfile: HANDLE, dumptype: MINIDUMP_TYPE, exceptionparam: Long, userstreamparam: Long, callbackparam: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_MiniDumpWriteDump(hprocess.toString(), processid.toInt(), hfile.toString(), dumptype, exceptionparam.toString(), userstreamparam.toString(), callbackparam.toString()) as Int) else 0

public actual fun OpenThreadWaitChainSession(flags: OPEN_THREAD_WAIT_CHAIN_SESSION_FLAGS, callback: PWAITCHAINCALLBACK): Long =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_OpenThreadWaitChainSession(flags.toInt(), callback.toLong().toString()) as String).toLong() else 0L

public actual fun OutputDebugStringA(lpoutputstring: PCSTR) {
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) {
        _windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_OutputDebugStringA(lpoutputstring.toString())
    }
}

public actual fun OutputDebugStringW(lpoutputstring: PCWSTR) {
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) {
        _windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_OutputDebugStringW(lpoutputstring.toString())
    }
}

public actual fun RaiseException(dwexceptioncode: UInt, dwexceptionflags: UInt, nnumberofarguments: UInt, lparguments: Long) {
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) {
        _windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_RaiseException(dwexceptioncode.toInt(), dwexceptionflags.toInt(), nnumberofarguments.toInt(), lparguments.toString())
    }
}

public actual fun RaiseFailFastException(pexceptionrecord: Long, pcontextrecord: Long, dwflags: UInt) {
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) {
        _windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_RaiseFailFastException(pexceptionrecord.toString(), pcontextrecord.toString(), dwflags.toInt())
    }
}

public actual fun RangeMapAddPeImageSections(rmaphandle: Long, imagename: PCWSTR, mappedimage: Long, mappingbytes: UInt, imagebase: ULong, usertag: ULong, mappingflags: UInt): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_RangeMapAddPeImageSections(rmaphandle.toString(), imagename.toString(), mappedimage.toString(), mappingbytes.toInt(), imagebase.toString(), usertag.toString(), mappingflags.toInt()) as Int) else 0

public actual fun RangeMapCreate(): Long =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_RangeMapCreate() as String).toLong() else 0L

public actual fun RangeMapFree(rmaphandle: Long) {
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) {
        _windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_RangeMapFree(rmaphandle.toString())
    }
}

public actual fun RangeMapRead(rmaphandle: Long, offset: ULong, buffer: Long, requestbytes: UInt, flags: UInt, donebytes: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_RangeMapRead(rmaphandle.toString(), offset.toString(), buffer.toString(), requestbytes.toInt(), flags.toInt(), donebytes.toString()) as Int) else 0

public actual fun RangeMapRemove(rmaphandle: Long, usertag: ULong): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_RangeMapRemove(rmaphandle.toString(), usertag.toString()) as Int) else 0

public actual fun RangeMapWrite(rmaphandle: Long, offset: ULong, buffer: Long, requestbytes: UInt, flags: UInt, donebytes: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_RangeMapWrite(rmaphandle.toString(), offset.toString(), buffer.toString(), requestbytes.toInt(), flags.toInt(), donebytes.toString()) as Int) else 0

public actual fun ReBaseImage(currentimagename: PCSTR, symbolpath: PCSTR, frebase: BOOL, frebasesysfileok: BOOL, fgoingdown: BOOL, checkimagesize: UInt, oldimagesize: Long, oldimagebase: Long, newimagesize: Long, newimagebase: Long, timestamp: UInt): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_ReBaseImage(currentimagename.toString(), symbolpath.toString(), frebase, frebasesysfileok, fgoingdown, checkimagesize.toInt(), oldimagesize.toString(), oldimagebase.toString(), newimagesize.toString(), newimagebase.toString(), timestamp.toInt()) as Int) else 0

public actual fun ReBaseImage64(currentimagename: PCSTR, symbolpath: PCSTR, frebase: BOOL, frebasesysfileok: BOOL, fgoingdown: BOOL, checkimagesize: UInt, oldimagesize: Long, oldimagebase: Long, newimagesize: Long, newimagebase: Long, timestamp: UInt): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_ReBaseImage64(currentimagename.toString(), symbolpath.toString(), frebase, frebasesysfileok, fgoingdown, checkimagesize.toInt(), oldimagesize.toString(), oldimagebase.toString(), newimagesize.toString(), newimagebase.toString(), timestamp.toInt()) as Int) else 0

public actual fun ReadProcessMemory(hprocess: HANDLE, lpbaseaddress: Long, lpbuffer: Long, nsize: ULong, lpnumberofbytesread: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_ReadProcessMemory(hprocess.toString(), lpbaseaddress.toString(), lpbuffer.toString(), nsize.toString(), lpnumberofbytesread.toString()) as Int) else 0

public actual fun RegisterWaitChainCOMCallback(callstatecallback: PCOGETCALLSTATE, activationstatecallback: PCOGETACTIVATIONSTATE) {
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) {
        _windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_RegisterWaitChainCOMCallback(callstatecallback.toLong().toString(), activationstatecallback.toLong().toString())
    }
}

public actual fun RemoveInvalidModuleList(hprocess: HANDLE) {
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) {
        _windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_RemoveInvalidModuleList(hprocess.toString())
    }
}

public actual fun RemoveVectoredContinueHandler(handle: Long): UInt =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_RemoveVectoredContinueHandler(handle.toString()) as Int).toUInt() else 0u

public actual fun RemoveVectoredExceptionHandler(handle: Long): UInt =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_RemoveVectoredExceptionHandler(handle.toString()) as Int).toUInt() else 0u

public actual fun ReportSymbolLoadSummary(hprocess: HANDLE, ploadmodule: PCWSTR, psymboldata: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_ReportSymbolLoadSummary(hprocess.toString(), ploadmodule.toString(), psymboldata.toString()) as Int) else 0

public actual fun RtlAddFunctionTable(functiontable: Long, entrycount: UInt, baseaddress: ULong): Boolean =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_RtlAddFunctionTable(functiontable.toString(), entrycount.toInt(), baseaddress.toString()) as Boolean) else false

public actual fun RtlAddGrowableFunctionTable(dynamictable: Long, functiontable: Long, entrycount: UInt, maximumentrycount: UInt, rangebase: ULong, rangeend: ULong): UInt =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_RtlAddGrowableFunctionTable(dynamictable.toString(), functiontable.toString(), entrycount.toInt(), maximumentrycount.toInt(), rangebase.toString(), rangeend.toString()) as Int).toUInt() else 0u

public actual fun RtlCaptureContext(contextrecord: Long) {
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) {
        _windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_RtlCaptureContext(contextrecord.toString())
    }
}

public actual fun RtlCaptureContext2(contextrecord: Long) {
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) {
        _windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_RtlCaptureContext2(contextrecord.toString())
    }
}

public actual fun RtlCaptureStackBackTrace(framestoskip: UInt, framestocapture: UInt, backtrace: Long, backtracehash: Long): UShort =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_RtlCaptureStackBackTrace(framestoskip.toInt(), framestocapture.toInt(), backtrace.toString(), backtracehash.toString()) as Int).toUShort() else 0u

public actual fun RtlDeleteFunctionTable(functiontable: Long): Boolean =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_RtlDeleteFunctionTable(functiontable.toString()) as Boolean) else false

public actual fun RtlDeleteGrowableFunctionTable(dynamictable: Long) {
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) {
        _windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_RtlDeleteGrowableFunctionTable(dynamictable.toString())
    }
}

public actual fun RtlGrowFunctionTable(dynamictable: Long, newentrycount: UInt) {
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) {
        _windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_RtlGrowFunctionTable(dynamictable.toString(), newentrycount.toInt())
    }
}

public actual fun RtlInstallFunctionTableCallback(tableidentifier: ULong, baseaddress: ULong, length: UInt, callback: PGET_RUNTIME_FUNCTION_CALLBACK, context: Long, outofprocesscallbackdll: PCWSTR): Boolean =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_RtlInstallFunctionTableCallback(tableidentifier.toString(), baseaddress.toString(), length.toInt(), callback.toLong().toString(), context.toString(), outofprocesscallbackdll.toString()) as Boolean) else false

public actual fun RtlLookupFunctionEntry(controlpc: ULong, imagebase: Long, historytable: Long): Long =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_RtlLookupFunctionEntry(controlpc.toString(), imagebase.toString(), historytable.toString()) as String).toLong() else 0L

public actual fun RtlPcToFileHeader(pcvalue: Long, baseofimage: Long): Long =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_RtlPcToFileHeader(pcvalue.toString(), baseofimage.toString()) as String).toLong() else 0L

public actual fun RtlRaiseException(exceptionrecord: Long) {
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) {
        _windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_RtlRaiseException(exceptionrecord.toString())
    }
}

public actual fun RtlRestoreContext(contextrecord: Long, exceptionrecord: Long) {
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) {
        _windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_RtlRestoreContext(contextrecord.toString(), exceptionrecord.toString())
    }
}

public actual fun RtlUnwind(targetframe: Long, targetip: Long, exceptionrecord: Long, returnvalue: Long) {
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) {
        _windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_RtlUnwind(targetframe.toString(), targetip.toString(), exceptionrecord.toString(), returnvalue.toString())
    }
}

public actual fun RtlUnwindEx(targetframe: Long, targetip: Long, exceptionrecord: Long, returnvalue: Long, contextrecord: Long, historytable: Long) {
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) {
        _windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_RtlUnwindEx(targetframe.toString(), targetip.toString(), exceptionrecord.toString(), returnvalue.toString(), contextrecord.toString(), historytable.toString())
    }
}

public actual fun RtlVirtualUnwind(handlertype: RTL_VIRTUAL_UNWIND_HANDLER_TYPE, imagebase: ULong, controlpc: ULong, functionentry: Long, contextrecord: Long, handlerdata: Long, establisherframe: Long, contextpointers: Long): EXCEPTION_ROUTINE =
    null

public actual fun SearchTreeForFile(rootpath: PCSTR, inputpathname: PCSTR, outputpathbuffer: PSTR): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SearchTreeForFile(rootpath.toString(), inputpathname.toString(), outputpathbuffer.toString()) as Int) else 0

public actual fun SearchTreeForFileW(rootpath: PCWSTR, inputpathname: PCWSTR, outputpathbuffer: PWSTR): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SearchTreeForFileW(rootpath.toString(), inputpathname.toString(), outputpathbuffer.toString()) as Int) else 0

public actual fun SetCheckUserInterruptShared(lpstartaddress: LPCALL_BACK_USER_INTERRUPT_ROUTINE) {
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) {
        _windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SetCheckUserInterruptShared(lpstartaddress.toLong().toString())
    }
}

public actual fun SetErrorMode(umode: THREAD_ERROR_MODE): THREAD_ERROR_MODE =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SetErrorMode(umode.toInt()) as Int).toUInt() else 0u

public actual fun SetImageConfigInformation(loadedimage: Long, imageconfiginformation: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SetImageConfigInformation(loadedimage.toString(), imageconfiginformation.toString()) as Int) else 0

public actual fun SetSymLoadError(error: UInt) {
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) {
        _windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SetSymLoadError(error.toInt())
    }
}

public actual fun SetThreadContext(hthread: HANDLE, lpcontext: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SetThreadContext(hthread.toString(), lpcontext.toString()) as Int) else 0

public actual fun SetThreadErrorMode(dwnewmode: THREAD_ERROR_MODE, lpoldmode: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SetThreadErrorMode(dwnewmode.toInt(), lpoldmode.toString()) as Int) else 0

public actual fun SetUnhandledExceptionFilter(lptoplevelexceptionfilter: LPTOP_LEVEL_EXCEPTION_FILTER): LPTOP_LEVEL_EXCEPTION_FILTER =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SetUnhandledExceptionFilter(lptoplevelexceptionfilter.toLong().toString()) as String).toLong() else null

public actual fun SetXStateFeaturesMask(context: Long, featuremask: ULong): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SetXStateFeaturesMask(context.toString(), featuremask.toString()) as Int) else 0

public actual fun StackWalk2(machinetype: UInt, hprocess: HANDLE, hthread: HANDLE, stackframe: Long, contextrecord: Long, readmemoryroutine: PREAD_PROCESS_MEMORY_ROUTINE64, functiontableaccessroutine: PFUNCTION_TABLE_ACCESS_ROUTINE64, getmodulebaseroutine: PGET_MODULE_BASE_ROUTINE64, translateaddress: PTRANSLATE_ADDRESS_ROUTINE64, gettargetattributevalue: PGET_TARGET_ATTRIBUTE_VALUE64, flags: UInt): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_StackWalk2(machinetype.toInt(), hprocess.toString(), hthread.toString(), stackframe.toString(), contextrecord.toString(), readmemoryroutine.toLong().toString(), functiontableaccessroutine.toLong().toString(), getmodulebaseroutine.toLong().toString(), translateaddress.toLong().toString(), gettargetattributevalue.toLong().toString(), flags.toInt()) as Int) else 0

public actual fun StackWalk64(machinetype: UInt, hprocess: HANDLE, hthread: HANDLE, stackframe: Long, contextrecord: Long, readmemoryroutine: PREAD_PROCESS_MEMORY_ROUTINE64, functiontableaccessroutine: PFUNCTION_TABLE_ACCESS_ROUTINE64, getmodulebaseroutine: PGET_MODULE_BASE_ROUTINE64, translateaddress: PTRANSLATE_ADDRESS_ROUTINE64): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_StackWalk64(machinetype.toInt(), hprocess.toString(), hthread.toString(), stackframe.toString(), contextrecord.toString(), readmemoryroutine.toLong().toString(), functiontableaccessroutine.toLong().toString(), getmodulebaseroutine.toLong().toString(), translateaddress.toLong().toString()) as Int) else 0

public actual fun StackWalkEx(machinetype: UInt, hprocess: HANDLE, hthread: HANDLE, stackframe: Long, contextrecord: Long, readmemoryroutine: PREAD_PROCESS_MEMORY_ROUTINE64, functiontableaccessroutine: PFUNCTION_TABLE_ACCESS_ROUTINE64, getmodulebaseroutine: PGET_MODULE_BASE_ROUTINE64, translateaddress: PTRANSLATE_ADDRESS_ROUTINE64, flags: UInt): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_StackWalkEx(machinetype.toInt(), hprocess.toString(), hthread.toString(), stackframe.toString(), contextrecord.toString(), readmemoryroutine.toLong().toString(), functiontableaccessroutine.toLong().toString(), getmodulebaseroutine.toLong().toString(), translateaddress.toLong().toString(), flags.toInt()) as Int) else 0

public actual fun SymAddSourceStream(hprocess: HANDLE, base: ULong, streamfile: PCSTR, buffer: Long, size: ULong): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymAddSourceStream(hprocess.toString(), base.toString(), streamfile.toString(), buffer.toString(), size.toString()) as Int) else 0

public actual fun SymAddSourceStreamA(hprocess: HANDLE, base: ULong, streamfile: PCSTR, buffer: Long, size: ULong): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymAddSourceStreamA(hprocess.toString(), base.toString(), streamfile.toString(), buffer.toString(), size.toString()) as Int) else 0

public actual fun SymAddSourceStreamW(hprocess: HANDLE, base: ULong, filespec: PCWSTR, buffer: Long, size: ULong): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymAddSourceStreamW(hprocess.toString(), base.toString(), filespec.toString(), buffer.toString(), size.toString()) as Int) else 0

public actual fun SymAddSymbol(hprocess: HANDLE, baseofdll: ULong, name: PCSTR, address: ULong, size: UInt, flags: UInt): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymAddSymbol(hprocess.toString(), baseofdll.toString(), name.toString(), address.toString(), size.toInt(), flags.toInt()) as Int) else 0

public actual fun SymAddSymbolW(hprocess: HANDLE, baseofdll: ULong, name: PCWSTR, address: ULong, size: UInt, flags: UInt): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymAddSymbolW(hprocess.toString(), baseofdll.toString(), name.toString(), address.toString(), size.toInt(), flags.toInt()) as Int) else 0

public actual fun SymAddrIncludeInlineTrace(hprocess: HANDLE, address: ULong): UInt =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymAddrIncludeInlineTrace(hprocess.toString(), address.toString()) as Int).toUInt() else 0u

public actual fun SymCleanup(hprocess: HANDLE): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymCleanup(hprocess.toString()) as Int) else 0

public actual fun SymCompareInlineTrace(hprocess: HANDLE, address1: ULong, inlinecontext1: UInt, retaddress1: ULong, address2: ULong, retaddress2: ULong): UInt =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymCompareInlineTrace(hprocess.toString(), address1.toString(), inlinecontext1.toInt(), retaddress1.toString(), address2.toString(), retaddress2.toString()) as Int).toUInt() else 0u

public actual fun SymDeleteSymbol(hprocess: HANDLE, baseofdll: ULong, name: PCSTR, address: ULong, flags: UInt): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymDeleteSymbol(hprocess.toString(), baseofdll.toString(), name.toString(), address.toString(), flags.toInt()) as Int) else 0

public actual fun SymDeleteSymbolW(hprocess: HANDLE, baseofdll: ULong, name: PCWSTR, address: ULong, flags: UInt): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymDeleteSymbolW(hprocess.toString(), baseofdll.toString(), name.toString(), address.toString(), flags.toInt()) as Int) else 0

public actual fun SymEnumLines(hprocess: HANDLE, base: ULong, obj: PCSTR, file: PCSTR, enumlinescallback: PSYM_ENUMLINES_CALLBACK, usercontext: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymEnumLines(hprocess.toString(), base.toString(), obj.toString(), file.toString(), enumlinescallback.toLong().toString(), usercontext.toString()) as Int) else 0

public actual fun SymEnumLinesW(hprocess: HANDLE, base: ULong, obj: PCWSTR, file: PCWSTR, enumlinescallback: PSYM_ENUMLINES_CALLBACKW, usercontext: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymEnumLinesW(hprocess.toString(), base.toString(), obj.toString(), file.toString(), enumlinescallback.toLong().toString(), usercontext.toString()) as Int) else 0

public actual fun SymEnumProcesses(enumprocessescallback: PSYM_ENUMPROCESSES_CALLBACK, usercontext: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymEnumProcesses(enumprocessescallback.toLong().toString(), usercontext.toString()) as Int) else 0

public actual fun SymEnumSourceFileTokens(hprocess: HANDLE, base: ULong, callback: PENUMSOURCEFILETOKENSCALLBACK): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymEnumSourceFileTokens(hprocess.toString(), base.toString(), callback.toLong().toString()) as Int) else 0

public actual fun SymEnumSourceFiles(hprocess: HANDLE, modbase: ULong, mask: PCSTR, cbsrcfiles: PSYM_ENUMSOURCEFILES_CALLBACK, usercontext: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymEnumSourceFiles(hprocess.toString(), modbase.toString(), mask.toString(), cbsrcfiles.toLong().toString(), usercontext.toString()) as Int) else 0

public actual fun SymEnumSourceFilesW(hprocess: HANDLE, modbase: ULong, mask: PCWSTR, cbsrcfiles: PSYM_ENUMSOURCEFILES_CALLBACKW, usercontext: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymEnumSourceFilesW(hprocess.toString(), modbase.toString(), mask.toString(), cbsrcfiles.toLong().toString(), usercontext.toString()) as Int) else 0

public actual fun SymEnumSourceLines(hprocess: HANDLE, base: ULong, obj: PCSTR, file: PCSTR, line: UInt, flags: UInt, enumlinescallback: PSYM_ENUMLINES_CALLBACK, usercontext: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymEnumSourceLines(hprocess.toString(), base.toString(), obj.toString(), file.toString(), line.toInt(), flags.toInt(), enumlinescallback.toLong().toString(), usercontext.toString()) as Int) else 0

public actual fun SymEnumSourceLinesW(hprocess: HANDLE, base: ULong, obj: PCWSTR, file: PCWSTR, line: UInt, flags: UInt, enumlinescallback: PSYM_ENUMLINES_CALLBACKW, usercontext: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymEnumSourceLinesW(hprocess.toString(), base.toString(), obj.toString(), file.toString(), line.toInt(), flags.toInt(), enumlinescallback.toLong().toString(), usercontext.toString()) as Int) else 0

public actual fun SymEnumSym(hprocess: HANDLE, baseofdll: ULong, enumsymbolscallback: PSYM_ENUMERATESYMBOLS_CALLBACK, usercontext: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymEnumSym(hprocess.toString(), baseofdll.toString(), enumsymbolscallback.toLong().toString(), usercontext.toString()) as Int) else 0

public actual fun SymEnumSymbols(hprocess: HANDLE, baseofdll: ULong, mask: PCSTR, enumsymbolscallback: PSYM_ENUMERATESYMBOLS_CALLBACK, usercontext: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymEnumSymbols(hprocess.toString(), baseofdll.toString(), mask.toString(), enumsymbolscallback.toLong().toString(), usercontext.toString()) as Int) else 0

public actual fun SymEnumSymbolsEx(hprocess: HANDLE, baseofdll: ULong, mask: PCSTR, enumsymbolscallback: PSYM_ENUMERATESYMBOLS_CALLBACK, usercontext: Long, options: UInt): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymEnumSymbolsEx(hprocess.toString(), baseofdll.toString(), mask.toString(), enumsymbolscallback.toLong().toString(), usercontext.toString(), options.toInt()) as Int) else 0

public actual fun SymEnumSymbolsExW(hprocess: HANDLE, baseofdll: ULong, mask: PCWSTR, enumsymbolscallback: PSYM_ENUMERATESYMBOLS_CALLBACKW, usercontext: Long, options: UInt): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymEnumSymbolsExW(hprocess.toString(), baseofdll.toString(), mask.toString(), enumsymbolscallback.toLong().toString(), usercontext.toString(), options.toInt()) as Int) else 0

public actual fun SymEnumSymbolsForAddr(hprocess: HANDLE, address: ULong, enumsymbolscallback: PSYM_ENUMERATESYMBOLS_CALLBACK, usercontext: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymEnumSymbolsForAddr(hprocess.toString(), address.toString(), enumsymbolscallback.toLong().toString(), usercontext.toString()) as Int) else 0

public actual fun SymEnumSymbolsForAddrW(hprocess: HANDLE, address: ULong, enumsymbolscallback: PSYM_ENUMERATESYMBOLS_CALLBACKW, usercontext: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymEnumSymbolsForAddrW(hprocess.toString(), address.toString(), enumsymbolscallback.toLong().toString(), usercontext.toString()) as Int) else 0

public actual fun SymEnumSymbolsW(hprocess: HANDLE, baseofdll: ULong, mask: PCWSTR, enumsymbolscallback: PSYM_ENUMERATESYMBOLS_CALLBACKW, usercontext: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymEnumSymbolsW(hprocess.toString(), baseofdll.toString(), mask.toString(), enumsymbolscallback.toLong().toString(), usercontext.toString()) as Int) else 0

public actual fun SymEnumTypes(hprocess: HANDLE, baseofdll: ULong, enumsymbolscallback: PSYM_ENUMERATESYMBOLS_CALLBACK, usercontext: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymEnumTypes(hprocess.toString(), baseofdll.toString(), enumsymbolscallback.toLong().toString(), usercontext.toString()) as Int) else 0

public actual fun SymEnumTypesByName(hprocess: HANDLE, baseofdll: ULong, mask: PCSTR, enumsymbolscallback: PSYM_ENUMERATESYMBOLS_CALLBACK, usercontext: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymEnumTypesByName(hprocess.toString(), baseofdll.toString(), mask.toString(), enumsymbolscallback.toLong().toString(), usercontext.toString()) as Int) else 0

public actual fun SymEnumTypesByNameW(hprocess: HANDLE, baseofdll: ULong, mask: PCWSTR, enumsymbolscallback: PSYM_ENUMERATESYMBOLS_CALLBACKW, usercontext: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymEnumTypesByNameW(hprocess.toString(), baseofdll.toString(), mask.toString(), enumsymbolscallback.toLong().toString(), usercontext.toString()) as Int) else 0

public actual fun SymEnumTypesW(hprocess: HANDLE, baseofdll: ULong, enumsymbolscallback: PSYM_ENUMERATESYMBOLS_CALLBACKW, usercontext: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymEnumTypesW(hprocess.toString(), baseofdll.toString(), enumsymbolscallback.toLong().toString(), usercontext.toString()) as Int) else 0

public actual fun SymEnumerateModules64(hprocess: HANDLE, enummodulescallback: PSYM_ENUMMODULES_CALLBACK64, usercontext: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymEnumerateModules64(hprocess.toString(), enummodulescallback.toLong().toString(), usercontext.toString()) as Int) else 0

public actual fun SymEnumerateModulesW64(hprocess: HANDLE, enummodulescallback: PSYM_ENUMMODULES_CALLBACKW64, usercontext: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymEnumerateModulesW64(hprocess.toString(), enummodulescallback.toLong().toString(), usercontext.toString()) as Int) else 0

public actual fun SymEnumerateSymbols64(hprocess: HANDLE, baseofdll: ULong, enumsymbolscallback: PSYM_ENUMSYMBOLS_CALLBACK64, usercontext: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymEnumerateSymbols64(hprocess.toString(), baseofdll.toString(), enumsymbolscallback.toLong().toString(), usercontext.toString()) as Int) else 0

public actual fun SymEnumerateSymbolsW64(hprocess: HANDLE, baseofdll: ULong, enumsymbolscallback: PSYM_ENUMSYMBOLS_CALLBACK64W, usercontext: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymEnumerateSymbolsW64(hprocess.toString(), baseofdll.toString(), enumsymbolscallback.toLong().toString(), usercontext.toString()) as Int) else 0

public actual fun SymFindDebugInfoFile(hprocess: HANDLE, filename: PCSTR, debugfilepath: PSTR, callback: PFIND_DEBUG_FILE_CALLBACK, callerdata: Long): HANDLE =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymFindDebugInfoFile(hprocess.toString(), filename.toString(), debugfilepath.toString(), callback.toLong().toString(), callerdata.toString()) as String).toLong() else 0L

public actual fun SymFindDebugInfoFileW(hprocess: HANDLE, filename: PCWSTR, debugfilepath: PWSTR, callback: PFIND_DEBUG_FILE_CALLBACKW, callerdata: Long): HANDLE =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymFindDebugInfoFileW(hprocess.toString(), filename.toString(), debugfilepath.toString(), callback.toLong().toString(), callerdata.toString()) as String).toLong() else 0L

public actual fun SymFindExecutableImage(hprocess: HANDLE, filename: PCSTR, imagefilepath: PSTR, callback: PFIND_EXE_FILE_CALLBACK, callerdata: Long): HANDLE =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymFindExecutableImage(hprocess.toString(), filename.toString(), imagefilepath.toString(), callback.toLong().toString(), callerdata.toString()) as String).toLong() else 0L

public actual fun SymFindExecutableImageW(hprocess: HANDLE, filename: PCWSTR, imagefilepath: PWSTR, callback: PFIND_EXE_FILE_CALLBACKW, callerdata: Long): HANDLE =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymFindExecutableImageW(hprocess.toString(), filename.toString(), imagefilepath.toString(), callback.toLong().toString(), callerdata.toString()) as String).toLong() else 0L

public actual fun SymFindFileInPath(hprocess: HANDLE, searchpatha: PCSTR, filename: PCSTR, id: Long, two: UInt, three: UInt, flags: SYM_FIND_ID_OPTION, foundfile: PSTR, callback: PFINDFILEINPATHCALLBACK, context: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymFindFileInPath(hprocess.toString(), searchpatha.toString(), filename.toString(), id.toString(), two.toInt(), three.toInt(), flags.toInt(), foundfile.toString(), callback.toLong().toString(), context.toString()) as Int) else 0

public actual fun SymFindFileInPathW(hprocess: HANDLE, searchpatha: PCWSTR, filename: PCWSTR, id: Long, two: UInt, three: UInt, flags: SYM_FIND_ID_OPTION, foundfile: PWSTR, callback: PFINDFILEINPATHCALLBACKW, context: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymFindFileInPathW(hprocess.toString(), searchpatha.toString(), filename.toString(), id.toString(), two.toInt(), three.toInt(), flags.toInt(), foundfile.toString(), callback.toLong().toString(), context.toString()) as Int) else 0

public actual fun SymFromAddr(hprocess: HANDLE, address: ULong, displacement: Long, symbol: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymFromAddr(hprocess.toString(), address.toString(), displacement.toString(), symbol.toString()) as Int) else 0

public actual fun SymFromAddrW(hprocess: HANDLE, address: ULong, displacement: Long, symbol: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymFromAddrW(hprocess.toString(), address.toString(), displacement.toString(), symbol.toString()) as Int) else 0

public actual fun SymFromIndex(hprocess: HANDLE, baseofdll: ULong, index: UInt, symbol: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymFromIndex(hprocess.toString(), baseofdll.toString(), index.toInt(), symbol.toString()) as Int) else 0

public actual fun SymFromIndexW(hprocess: HANDLE, baseofdll: ULong, index: UInt, symbol: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymFromIndexW(hprocess.toString(), baseofdll.toString(), index.toInt(), symbol.toString()) as Int) else 0

public actual fun SymFromInlineContext(hprocess: HANDLE, address: ULong, inlinecontext: UInt, displacement: Long, symbol: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymFromInlineContext(hprocess.toString(), address.toString(), inlinecontext.toInt(), displacement.toString(), symbol.toString()) as Int) else 0

public actual fun SymFromInlineContextW(hprocess: HANDLE, address: ULong, inlinecontext: UInt, displacement: Long, symbol: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymFromInlineContextW(hprocess.toString(), address.toString(), inlinecontext.toInt(), displacement.toString(), symbol.toString()) as Int) else 0

public actual fun SymFromName(hprocess: HANDLE, name: PCSTR, symbol: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymFromName(hprocess.toString(), name.toString(), symbol.toString()) as Int) else 0

public actual fun SymFromNameW(hprocess: HANDLE, name: PCWSTR, symbol: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymFromNameW(hprocess.toString(), name.toString(), symbol.toString()) as Int) else 0

public actual fun SymFromToken(hprocess: HANDLE, base: ULong, token: UInt, symbol: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymFromToken(hprocess.toString(), base.toString(), token.toInt(), symbol.toString()) as Int) else 0

public actual fun SymFromTokenW(hprocess: HANDLE, base: ULong, token: UInt, symbol: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymFromTokenW(hprocess.toString(), base.toString(), token.toInt(), symbol.toString()) as Int) else 0

public actual fun SymFunctionTableAccess64(hprocess: HANDLE, addrbase: ULong): Long =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymFunctionTableAccess64(hprocess.toString(), addrbase.toString()) as String).toLong() else 0L

public actual fun SymFunctionTableAccess64AccessRoutines(hprocess: HANDLE, addrbase: ULong, readmemoryroutine: PREAD_PROCESS_MEMORY_ROUTINE64, getmodulebaseroutine: PGET_MODULE_BASE_ROUTINE64): Long =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymFunctionTableAccess64AccessRoutines(hprocess.toString(), addrbase.toString(), readmemoryroutine.toLong().toString(), getmodulebaseroutine.toLong().toString()) as String).toLong() else 0L

public actual fun SymGetExtendedOption(option: IMAGEHLP_EXTENDED_OPTIONS): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymGetExtendedOption(option) as Int) else 0

public actual fun SymGetFileLineOffsets64(hprocess: HANDLE, modulename: PCSTR, filename: PCSTR, buffer: Long, bufferlines: UInt): UInt =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymGetFileLineOffsets64(hprocess.toString(), modulename.toString(), filename.toString(), buffer.toString(), bufferlines.toInt()) as Int).toUInt() else 0u

public actual fun SymGetHomeDirectory(type: UInt, dir: PSTR, size: ULong): PSTR =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymGetHomeDirectory(type.toInt(), dir.toString(), size.toString()) as String).toLong() else 0L

public actual fun SymGetHomeDirectoryW(type: UInt, dir: PWSTR, size: ULong): PWSTR =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymGetHomeDirectoryW(type.toInt(), dir.toString(), size.toString()) as String).toLong() else 0L

public actual fun SymGetLineFromAddr64(hprocess: HANDLE, qwaddr: ULong, pdwdisplacement: Long, line64: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymGetLineFromAddr64(hprocess.toString(), qwaddr.toString(), pdwdisplacement.toString(), line64.toString()) as Int) else 0

public actual fun SymGetLineFromAddrW64(hprocess: HANDLE, dwaddr: ULong, pdwdisplacement: Long, line: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymGetLineFromAddrW64(hprocess.toString(), dwaddr.toString(), pdwdisplacement.toString(), line.toString()) as Int) else 0

public actual fun SymGetLineFromInlineContext(hprocess: HANDLE, qwaddr: ULong, inlinecontext: UInt, qwmodulebaseaddress: ULong, pdwdisplacement: Long, line64: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymGetLineFromInlineContext(hprocess.toString(), qwaddr.toString(), inlinecontext.toInt(), qwmodulebaseaddress.toString(), pdwdisplacement.toString(), line64.toString()) as Int) else 0

public actual fun SymGetLineFromInlineContextW(hprocess: HANDLE, dwaddr: ULong, inlinecontext: UInt, qwmodulebaseaddress: ULong, pdwdisplacement: Long, line: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymGetLineFromInlineContextW(hprocess.toString(), dwaddr.toString(), inlinecontext.toInt(), qwmodulebaseaddress.toString(), pdwdisplacement.toString(), line.toString()) as Int) else 0

public actual fun SymGetLineFromName64(hprocess: HANDLE, modulename: PCSTR, filename: PCSTR, dwlinenumber: UInt, pldisplacement: Long, line: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymGetLineFromName64(hprocess.toString(), modulename.toString(), filename.toString(), dwlinenumber.toInt(), pldisplacement.toString(), line.toString()) as Int) else 0

public actual fun SymGetLineFromNameW64(hprocess: HANDLE, modulename: PCWSTR, filename: PCWSTR, dwlinenumber: UInt, pldisplacement: Long, line: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymGetLineFromNameW64(hprocess.toString(), modulename.toString(), filename.toString(), dwlinenumber.toInt(), pldisplacement.toString(), line.toString()) as Int) else 0

public actual fun SymGetLineNext64(hprocess: HANDLE, line: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymGetLineNext64(hprocess.toString(), line.toString()) as Int) else 0

public actual fun SymGetLineNextW64(hprocess: HANDLE, line: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymGetLineNextW64(hprocess.toString(), line.toString()) as Int) else 0

public actual fun SymGetLinePrev64(hprocess: HANDLE, line: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymGetLinePrev64(hprocess.toString(), line.toString()) as Int) else 0

public actual fun SymGetLinePrevW64(hprocess: HANDLE, line: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymGetLinePrevW64(hprocess.toString(), line.toString()) as Int) else 0

public actual fun SymGetModuleBase64(hprocess: HANDLE, qwaddr: ULong): ULong =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymGetModuleBase64(hprocess.toString(), qwaddr.toString()) as String).toULong() else 0uL

public actual fun SymGetModuleInfo64(hprocess: HANDLE, qwaddr: ULong, moduleinfo: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymGetModuleInfo64(hprocess.toString(), qwaddr.toString(), moduleinfo.toString()) as Int) else 0

public actual fun SymGetModuleInfoW64(hprocess: HANDLE, qwaddr: ULong, moduleinfo: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymGetModuleInfoW64(hprocess.toString(), qwaddr.toString(), moduleinfo.toString()) as Int) else 0

public actual fun SymGetOmaps(hprocess: HANDLE, baseofdll: ULong, omapto: Long, comapto: Long, omapfrom: Long, comapfrom: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymGetOmaps(hprocess.toString(), baseofdll.toString(), omapto.toString(), comapto.toString(), omapfrom.toString(), comapfrom.toString()) as Int) else 0

public actual fun SymGetOptions(): UInt =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymGetOptions() as Int).toUInt() else 0u

public actual fun SymGetScope(hprocess: HANDLE, baseofdll: ULong, index: UInt, symbol: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymGetScope(hprocess.toString(), baseofdll.toString(), index.toInt(), symbol.toString()) as Int) else 0

public actual fun SymGetScopeW(hprocess: HANDLE, baseofdll: ULong, index: UInt, symbol: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymGetScopeW(hprocess.toString(), baseofdll.toString(), index.toInt(), symbol.toString()) as Int) else 0

public actual fun SymGetSearchPath(hprocess: HANDLE, searchpatha: PSTR, searchpathlength: UInt): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymGetSearchPath(hprocess.toString(), searchpatha.toString(), searchpathlength.toInt()) as Int) else 0

public actual fun SymGetSearchPathW(hprocess: HANDLE, searchpatha: PWSTR, searchpathlength: UInt): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymGetSearchPathW(hprocess.toString(), searchpatha.toString(), searchpathlength.toInt()) as Int) else 0

public actual fun SymGetSourceFile(hprocess: HANDLE, base: ULong, params: PCSTR, filespec: PCSTR, filepath: PSTR, size: UInt): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFile(hprocess.toString(), base.toString(), params.toString(), filespec.toString(), filepath.toString(), size.toInt()) as Int) else 0

public actual fun SymGetSourceFileChecksum(hprocess: HANDLE, base: ULong, filespec: PCSTR, pchecksumtype: Long, pchecksum: Long, checksumsize: UInt, pactualbyteswritten: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFileChecksum(hprocess.toString(), base.toString(), filespec.toString(), pchecksumtype.toString(), pchecksum.toString(), checksumsize.toInt(), pactualbyteswritten.toString()) as Int) else 0

public actual fun SymGetSourceFileChecksumW(hprocess: HANDLE, base: ULong, filespec: PCWSTR, pchecksumtype: Long, pchecksum: Long, checksumsize: UInt, pactualbyteswritten: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFileChecksumW(hprocess.toString(), base.toString(), filespec.toString(), pchecksumtype.toString(), pchecksum.toString(), checksumsize.toInt(), pactualbyteswritten.toString()) as Int) else 0

public actual fun SymGetSourceFileFromToken(hprocess: HANDLE, token: Long, params: PCSTR, filepath: PSTR, size: UInt): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFileFromToken(hprocess.toString(), token.toString(), params.toString(), filepath.toString(), size.toInt()) as Int) else 0

public actual fun SymGetSourceFileFromTokenByTokenName(hprocess: HANDLE, token: Long, tokenname: PCSTR, params: PCSTR, filepath: PSTR, size: UInt): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFileFromTokenByTokenName(hprocess.toString(), token.toString(), tokenname.toString(), params.toString(), filepath.toString(), size.toInt()) as Int) else 0

public actual fun SymGetSourceFileFromTokenByTokenNameW(hprocess: HANDLE, token: Long, tokenname: PCWSTR, params: PCWSTR, filepath: PWSTR, size: UInt): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFileFromTokenByTokenNameW(hprocess.toString(), token.toString(), tokenname.toString(), params.toString(), filepath.toString(), size.toInt()) as Int) else 0

public actual fun SymGetSourceFileFromTokenW(hprocess: HANDLE, token: Long, params: PCWSTR, filepath: PWSTR, size: UInt): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFileFromTokenW(hprocess.toString(), token.toString(), params.toString(), filepath.toString(), size.toInt()) as Int) else 0

public actual fun SymGetSourceFileToken(hprocess: HANDLE, base: ULong, filespec: PCSTR, token: Long, size: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFileToken(hprocess.toString(), base.toString(), filespec.toString(), token.toString(), size.toString()) as Int) else 0

public actual fun SymGetSourceFileTokenByTokenName(hprocess: HANDLE, base: ULong, filespec: PCSTR, tokenname: PCSTR, tokenparameters: PCSTR, token: Long, size: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFileTokenByTokenName(hprocess.toString(), base.toString(), filespec.toString(), tokenname.toString(), tokenparameters.toString(), token.toString(), size.toString()) as Int) else 0

public actual fun SymGetSourceFileTokenByTokenNameW(hprocess: HANDLE, base: ULong, filespec: PCWSTR, tokenname: PCWSTR, tokenparameters: PCWSTR, token: Long, size: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFileTokenByTokenNameW(hprocess.toString(), base.toString(), filespec.toString(), tokenname.toString(), tokenparameters.toString(), token.toString(), size.toString()) as Int) else 0

public actual fun SymGetSourceFileTokenW(hprocess: HANDLE, base: ULong, filespec: PCWSTR, token: Long, size: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFileTokenW(hprocess.toString(), base.toString(), filespec.toString(), token.toString(), size.toString()) as Int) else 0

public actual fun SymGetSourceFileW(hprocess: HANDLE, base: ULong, params: PCWSTR, filespec: PCWSTR, filepath: PWSTR, size: UInt): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymGetSourceFileW(hprocess.toString(), base.toString(), params.toString(), filespec.toString(), filepath.toString(), size.toInt()) as Int) else 0

public actual fun SymGetSourceVarFromToken(hprocess: HANDLE, token: Long, params: PCSTR, varname: PCSTR, value: PSTR, size: UInt): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymGetSourceVarFromToken(hprocess.toString(), token.toString(), params.toString(), varname.toString(), value.toString(), size.toInt()) as Int) else 0

public actual fun SymGetSourceVarFromTokenW(hprocess: HANDLE, token: Long, params: PCWSTR, varname: PCWSTR, value: PWSTR, size: UInt): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymGetSourceVarFromTokenW(hprocess.toString(), token.toString(), params.toString(), varname.toString(), value.toString(), size.toInt()) as Int) else 0

public actual fun SymGetSymFromAddr64(hprocess: HANDLE, qwaddr: ULong, pdwdisplacement: Long, symbol: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymGetSymFromAddr64(hprocess.toString(), qwaddr.toString(), pdwdisplacement.toString(), symbol.toString()) as Int) else 0

public actual fun SymGetSymFromName64(hprocess: HANDLE, name: PCSTR, symbol: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymGetSymFromName64(hprocess.toString(), name.toString(), symbol.toString()) as Int) else 0

public actual fun SymGetSymNext64(hprocess: HANDLE, symbol: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymGetSymNext64(hprocess.toString(), symbol.toString()) as Int) else 0

public actual fun SymGetSymPrev64(hprocess: HANDLE, symbol: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymGetSymPrev64(hprocess.toString(), symbol.toString()) as Int) else 0

public actual fun SymGetSymbolFile(hprocess: HANDLE, sympath: PCSTR, imagefile: PCSTR, type: UInt, symbolfile: PSTR, csymbolfile: ULong, dbgfile: PSTR, cdbgfile: ULong): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymGetSymbolFile(hprocess.toString(), sympath.toString(), imagefile.toString(), type.toInt(), symbolfile.toString(), csymbolfile.toString(), dbgfile.toString(), cdbgfile.toString()) as Int) else 0

public actual fun SymGetSymbolFileW(hprocess: HANDLE, sympath: PCWSTR, imagefile: PCWSTR, type: UInt, symbolfile: PWSTR, csymbolfile: ULong, dbgfile: PWSTR, cdbgfile: ULong): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymGetSymbolFileW(hprocess.toString(), sympath.toString(), imagefile.toString(), type.toInt(), symbolfile.toString(), csymbolfile.toString(), dbgfile.toString(), cdbgfile.toString()) as Int) else 0

public actual fun SymGetTypeFromName(hprocess: HANDLE, baseofdll: ULong, name: PCSTR, symbol: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymGetTypeFromName(hprocess.toString(), baseofdll.toString(), name.toString(), symbol.toString()) as Int) else 0

public actual fun SymGetTypeFromNameW(hprocess: HANDLE, baseofdll: ULong, name: PCWSTR, symbol: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymGetTypeFromNameW(hprocess.toString(), baseofdll.toString(), name.toString(), symbol.toString()) as Int) else 0

public actual fun SymGetTypeInfo(hprocess: HANDLE, modbase: ULong, typeid: UInt, gettype: IMAGEHLP_SYMBOL_TYPE_INFO, pinfo: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymGetTypeInfo(hprocess.toString(), modbase.toString(), typeid.toInt(), gettype, pinfo.toString()) as Int) else 0

public actual fun SymGetTypeInfoEx(hprocess: HANDLE, modbase: ULong, params: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymGetTypeInfoEx(hprocess.toString(), modbase.toString(), params.toString()) as Int) else 0

public actual fun SymGetUnwindInfo(hprocess: HANDLE, address: ULong, buffer: Long, size: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymGetUnwindInfo(hprocess.toString(), address.toString(), buffer.toString(), size.toString()) as Int) else 0

public actual fun SymInitialize(hprocess: HANDLE, usersearchpath: PCSTR, finvadeprocess: BOOL): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymInitialize(hprocess.toString(), usersearchpath.toString(), finvadeprocess) as Int) else 0

public actual fun SymInitializeW(hprocess: HANDLE, usersearchpath: PCWSTR, finvadeprocess: BOOL): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymInitializeW(hprocess.toString(), usersearchpath.toString(), finvadeprocess) as Int) else 0

public actual fun SymLoadModule64(hprocess: HANDLE, hfile: HANDLE, imagename: PCSTR, modulename: PCSTR, baseofdll: ULong, sizeofdll: UInt): ULong =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymLoadModule64(hprocess.toString(), hfile.toString(), imagename.toString(), modulename.toString(), baseofdll.toString(), sizeofdll.toInt()) as String).toULong() else 0uL

public actual fun SymLoadModuleEx(hprocess: HANDLE, hfile: HANDLE, imagename: PCSTR, modulename: PCSTR, baseofdll: ULong, dllsize: UInt, data: Long, flags: SYM_LOAD_FLAGS): ULong =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymLoadModuleEx(hprocess.toString(), hfile.toString(), imagename.toString(), modulename.toString(), baseofdll.toString(), dllsize.toInt(), data.toString(), flags.toInt()) as String).toULong() else 0uL

public actual fun SymLoadModuleExW(hprocess: HANDLE, hfile: HANDLE, imagename: PCWSTR, modulename: PCWSTR, baseofdll: ULong, dllsize: UInt, data: Long, flags: SYM_LOAD_FLAGS): ULong =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymLoadModuleExW(hprocess.toString(), hfile.toString(), imagename.toString(), modulename.toString(), baseofdll.toString(), dllsize.toInt(), data.toString(), flags.toInt()) as String).toULong() else 0uL

public actual fun SymMatchFileName(filename: PCSTR, match: PCSTR, filenamestop: Long, matchstop: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymMatchFileName(filename.toString(), match.toString(), filenamestop.toString(), matchstop.toString()) as Int) else 0

public actual fun SymMatchFileNameW(filename: PCWSTR, match: PCWSTR, filenamestop: Long, matchstop: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymMatchFileNameW(filename.toString(), match.toString(), filenamestop.toString(), matchstop.toString()) as Int) else 0

public actual fun SymMatchString(string: PCSTR, expression: PCSTR, fcase: BOOL): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymMatchString(string.toString(), expression.toString(), fcase) as Int) else 0

public actual fun SymMatchStringA(string: PCSTR, expression: PCSTR, fcase: BOOL): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymMatchStringA(string.toString(), expression.toString(), fcase) as Int) else 0

public actual fun SymMatchStringW(string: PCWSTR, expression: PCWSTR, fcase: BOOL): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymMatchStringW(string.toString(), expression.toString(), fcase) as Int) else 0

public actual fun SymNext(hprocess: HANDLE, si: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymNext(hprocess.toString(), si.toString()) as Int) else 0

public actual fun SymNextW(hprocess: HANDLE, siw: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymNextW(hprocess.toString(), siw.toString()) as Int) else 0

public actual fun SymPrev(hprocess: HANDLE, si: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymPrev(hprocess.toString(), si.toString()) as Int) else 0

public actual fun SymPrevW(hprocess: HANDLE, siw: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymPrevW(hprocess.toString(), siw.toString()) as Int) else 0

public actual fun SymQueryInlineTrace(hprocess: HANDLE, startaddress: ULong, startcontext: UInt, startretaddress: ULong, curaddress: ULong, curcontext: Long, curframeindex: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymQueryInlineTrace(hprocess.toString(), startaddress.toString(), startcontext.toInt(), startretaddress.toString(), curaddress.toString(), curcontext.toString(), curframeindex.toString()) as Int) else 0

public actual fun SymRefreshModuleList(hprocess: HANDLE): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymRefreshModuleList(hprocess.toString()) as Int) else 0

public actual fun SymRegisterCallback64(hprocess: HANDLE, callbackfunction: PSYMBOL_REGISTERED_CALLBACK64, usercontext: ULong): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymRegisterCallback64(hprocess.toString(), callbackfunction.toLong().toString(), usercontext.toString()) as Int) else 0

public actual fun SymRegisterCallbackW64(hprocess: HANDLE, callbackfunction: PSYMBOL_REGISTERED_CALLBACK64, usercontext: ULong): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymRegisterCallbackW64(hprocess.toString(), callbackfunction.toLong().toString(), usercontext.toString()) as Int) else 0

public actual fun SymRegisterFunctionEntryCallback64(hprocess: HANDLE, callbackfunction: PSYMBOL_FUNCENTRY_CALLBACK64, usercontext: ULong): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymRegisterFunctionEntryCallback64(hprocess.toString(), callbackfunction.toLong().toString(), usercontext.toString()) as Int) else 0

public actual fun SymSearch(hprocess: HANDLE, baseofdll: ULong, index: UInt, symtag: UInt, mask: PCSTR, address: ULong, enumsymbolscallback: PSYM_ENUMERATESYMBOLS_CALLBACK, usercontext: Long, options: UInt): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymSearch(hprocess.toString(), baseofdll.toString(), index.toInt(), symtag.toInt(), mask.toString(), address.toString(), enumsymbolscallback.toLong().toString(), usercontext.toString(), options.toInt()) as Int) else 0

public actual fun SymSearchW(hprocess: HANDLE, baseofdll: ULong, index: UInt, symtag: UInt, mask: PCWSTR, address: ULong, enumsymbolscallback: PSYM_ENUMERATESYMBOLS_CALLBACKW, usercontext: Long, options: UInt): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymSearchW(hprocess.toString(), baseofdll.toString(), index.toInt(), symtag.toInt(), mask.toString(), address.toString(), enumsymbolscallback.toLong().toString(), usercontext.toString(), options.toInt()) as Int) else 0

public actual fun SymSetContext(hprocess: HANDLE, stackframe: Long, context: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymSetContext(hprocess.toString(), stackframe.toString(), context.toString()) as Int) else 0

public actual fun SymSetExtendedOption(option: IMAGEHLP_EXTENDED_OPTIONS, value: BOOL): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymSetExtendedOption(option, value) as Int) else 0

public actual fun SymSetHomeDirectory(hprocess: HANDLE, dir: PCSTR): PSTR =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymSetHomeDirectory(hprocess.toString(), dir.toString()) as String).toLong() else 0L

public actual fun SymSetHomeDirectoryW(hprocess: HANDLE, dir: PCWSTR): PWSTR =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymSetHomeDirectoryW(hprocess.toString(), dir.toString()) as String).toLong() else 0L

public actual fun SymSetOptions(symoptions: UInt): UInt =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymSetOptions(symoptions.toInt()) as Int).toUInt() else 0u

public actual fun SymSetParentWindow(hwnd: HWND): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymSetParentWindow(hwnd.toString()) as Int) else 0

public actual fun SymSetScopeFromAddr(hprocess: HANDLE, address: ULong): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymSetScopeFromAddr(hprocess.toString(), address.toString()) as Int) else 0

public actual fun SymSetScopeFromIndex(hprocess: HANDLE, baseofdll: ULong, index: UInt): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymSetScopeFromIndex(hprocess.toString(), baseofdll.toString(), index.toInt()) as Int) else 0

public actual fun SymSetScopeFromInlineContext(hprocess: HANDLE, address: ULong, inlinecontext: UInt): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymSetScopeFromInlineContext(hprocess.toString(), address.toString(), inlinecontext.toInt()) as Int) else 0

public actual fun SymSetSearchPath(hprocess: HANDLE, searchpatha: PCSTR): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymSetSearchPath(hprocess.toString(), searchpatha.toString()) as Int) else 0

public actual fun SymSetSearchPathW(hprocess: HANDLE, searchpatha: PCWSTR): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymSetSearchPathW(hprocess.toString(), searchpatha.toString()) as Int) else 0

public actual fun SymSrvDeltaName(hprocess: HANDLE, sympath: PCSTR, type: PCSTR, file1: PCSTR, file2: PCSTR): PCSTR =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymSrvDeltaName(hprocess.toString(), sympath.toString(), type.toString(), file1.toString(), file2.toString()) as String).toLong() else 0L

public actual fun SymSrvDeltaNameW(hprocess: HANDLE, sympath: PCWSTR, type: PCWSTR, file1: PCWSTR, file2: PCWSTR): PCWSTR =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymSrvDeltaNameW(hprocess.toString(), sympath.toString(), type.toString(), file1.toString(), file2.toString()) as String).toLong() else 0L

public actual fun SymSrvGetFileIndexInfo(file: PCSTR, info: Long, flags: UInt): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymSrvGetFileIndexInfo(file.toString(), info.toString(), flags.toInt()) as Int) else 0

public actual fun SymSrvGetFileIndexInfoW(file: PCWSTR, info: Long, flags: UInt): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymSrvGetFileIndexInfoW(file.toString(), info.toString(), flags.toInt()) as Int) else 0

public actual fun SymSrvGetFileIndexString(hprocess: HANDLE, srvpath: PCSTR, file: PCSTR, index: PSTR, size: ULong, flags: UInt): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymSrvGetFileIndexString(hprocess.toString(), srvpath.toString(), file.toString(), index.toString(), size.toString(), flags.toInt()) as Int) else 0

public actual fun SymSrvGetFileIndexStringW(hprocess: HANDLE, srvpath: PCWSTR, file: PCWSTR, index: PWSTR, size: ULong, flags: UInt): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymSrvGetFileIndexStringW(hprocess.toString(), srvpath.toString(), file.toString(), index.toString(), size.toString(), flags.toInt()) as Int) else 0

public actual fun SymSrvGetFileIndexes(file: PCSTR, id: Long, val1: Long, val2: Long, flags: UInt): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymSrvGetFileIndexes(file.toString(), id.toString(), val1.toString(), val2.toString(), flags.toInt()) as Int) else 0

public actual fun SymSrvGetFileIndexesW(file: PCWSTR, id: Long, val1: Long, val2: Long, flags: UInt): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymSrvGetFileIndexesW(file.toString(), id.toString(), val1.toString(), val2.toString(), flags.toInt()) as Int) else 0

public actual fun SymSrvGetSupplement(hprocess: HANDLE, sympath: PCSTR, node: PCSTR, file: PCSTR): PCSTR =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymSrvGetSupplement(hprocess.toString(), sympath.toString(), node.toString(), file.toString()) as String).toLong() else 0L

public actual fun SymSrvGetSupplementW(hprocess: HANDLE, sympath: PCWSTR, node: PCWSTR, file: PCWSTR): PCWSTR =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymSrvGetSupplementW(hprocess.toString(), sympath.toString(), node.toString(), file.toString()) as String).toLong() else 0L

public actual fun SymSrvIsStore(hprocess: HANDLE, path: PCSTR): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymSrvIsStore(hprocess.toString(), path.toString()) as Int) else 0

public actual fun SymSrvIsStoreW(hprocess: HANDLE, path: PCWSTR): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymSrvIsStoreW(hprocess.toString(), path.toString()) as Int) else 0

public actual fun SymSrvStoreFile(hprocess: HANDLE, srvpath: PCSTR, file: PCSTR, flags: SYM_SRV_STORE_FILE_FLAGS): PCSTR =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymSrvStoreFile(hprocess.toString(), srvpath.toString(), file.toString(), flags.toInt()) as String).toLong() else 0L

public actual fun SymSrvStoreFileW(hprocess: HANDLE, srvpath: PCWSTR, file: PCWSTR, flags: SYM_SRV_STORE_FILE_FLAGS): PCWSTR =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymSrvStoreFileW(hprocess.toString(), srvpath.toString(), file.toString(), flags.toInt()) as String).toLong() else 0L

public actual fun SymSrvStoreSupplement(hprocess: HANDLE, srvpath: PCSTR, node: PCSTR, file: PCSTR, flags: UInt): PCSTR =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymSrvStoreSupplement(hprocess.toString(), srvpath.toString(), node.toString(), file.toString(), flags.toInt()) as String).toLong() else 0L

public actual fun SymSrvStoreSupplementW(hprocess: HANDLE, sympath: PCWSTR, node: PCWSTR, file: PCWSTR, flags: UInt): PCWSTR =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymSrvStoreSupplementW(hprocess.toString(), sympath.toString(), node.toString(), file.toString(), flags.toInt()) as String).toLong() else 0L

public actual fun SymUnDName64(sym: Long, undecname: PSTR, undecnamelength: UInt): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymUnDName64(sym.toString(), undecname.toString(), undecnamelength.toInt()) as Int) else 0

public actual fun SymUnloadModule64(hprocess: HANDLE, baseofdll: ULong): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_SymUnloadModule64(hprocess.toString(), baseofdll.toString()) as Int) else 0

public actual fun TerminateProcessOnMemoryExhaustion(failedallocationsize: ULong) {
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) {
        _windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_TerminateProcessOnMemoryExhaustion(failedallocationsize.toString())
    }
}

public actual fun TouchFileTimes(filehandle: HANDLE, psystemtime: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_TouchFileTimes(filehandle.toString(), psystemtime.toString()) as Int) else 0

public actual fun UnDecorateSymbolName(name: PCSTR, outputstring: PSTR, maxstringlength: UInt, flags: UInt): UInt =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_UnDecorateSymbolName(name.toString(), outputstring.toString(), maxstringlength.toInt(), flags.toInt()) as Int).toUInt() else 0u

public actual fun UnDecorateSymbolNameW(name: PCWSTR, outputstring: PWSTR, maxstringlength: UInt, flags: UInt): UInt =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_UnDecorateSymbolNameW(name.toString(), outputstring.toString(), maxstringlength.toInt(), flags.toInt()) as Int).toUInt() else 0u

public actual fun UnMapAndLoad(loadedimage: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_UnMapAndLoad(loadedimage.toString()) as Int) else 0

public actual fun UnhandledExceptionFilter(exceptioninfo: Long): Int =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_UnhandledExceptionFilter(exceptioninfo.toString()) as Int) else 0

public actual fun UpdateDebugInfoFile(imagefilename: PCSTR, symbolpath: PCSTR, debugfilepath: PSTR, ntheaders: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_UpdateDebugInfoFile(imagefilename.toString(), symbolpath.toString(), debugfilepath.toString(), ntheaders.toString()) as Int) else 0

public actual fun UpdateDebugInfoFileEx(imagefilename: PCSTR, symbolpath: PCSTR, debugfilepath: PSTR, ntheaders: Long, oldchecksum: UInt): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_UpdateDebugInfoFileEx(imagefilename.toString(), symbolpath.toString(), debugfilepath.toString(), ntheaders.toString(), oldchecksum.toInt()) as Int) else 0

public actual fun WaitForDebugEvent(lpdebugevent: Long, dwmilliseconds: UInt): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_WaitForDebugEvent(lpdebugevent.toString(), dwmilliseconds.toInt()) as Int) else 0

public actual fun WaitForDebugEventEx(lpdebugevent: Long, dwmilliseconds: UInt): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_WaitForDebugEventEx(lpdebugevent.toString(), dwmilliseconds.toInt()) as Int) else 0

public actual fun Wow64GetThreadContext(hthread: HANDLE, lpcontext: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_Wow64GetThreadContext(hthread.toString(), lpcontext.toString()) as Int) else 0

public actual fun Wow64GetThreadSelectorEntry(hthread: HANDLE, dwselector: UInt, lpselectorentry: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_Wow64GetThreadSelectorEntry(hthread.toString(), dwselector.toInt(), lpselectorentry.toString()) as Int) else 0

public actual fun Wow64SetThreadContext(hthread: HANDLE, lpcontext: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_Wow64SetThreadContext(hthread.toString(), lpcontext.toString()) as Int) else 0

public actual fun WriteProcessMemory(hprocess: HANDLE, lpbaseaddress: Long, lpbuffer: Long, nsize: ULong, lpnumberofbyteswritten: Long): BOOL =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_WriteProcessMemory(hprocess.toString(), lpbaseaddress.toString(), lpbuffer.toString(), nsize.toString(), lpnumberofbyteswritten.toString()) as Int) else 0
