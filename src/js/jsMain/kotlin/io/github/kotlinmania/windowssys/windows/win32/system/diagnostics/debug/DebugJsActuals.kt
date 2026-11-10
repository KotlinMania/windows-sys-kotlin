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

private val _windowsWin32SystemDiagnosticsDebugNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun addVectoredContinueHandler(first: UInt, handler: PvectoredExceptionHandler): COpaquePointer? =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_addVectoredContinueHandler(first.toInt(), 0L.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addVectoredExceptionHandler(first: UInt, handler: PvectoredExceptionHandler): COpaquePointer? =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_addVectoredExceptionHandler(first.toInt(), 0L.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun beep(dwfreq: UInt, dwduration: UInt): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_beep(dwfreq.toInt(), dwduration.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bindImage(imagename: Pcstr, dllpath: Pcstr, symbolpath: Pcstr): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_bindImage((imagename?.value ?: 0L).toString(), (dllpath?.value ?: 0L).toString(), (symbolpath?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bindImageEx(flags: UInt, imagename: Pcstr, dllpath: Pcstr, symbolpath: Pcstr, statusroutine: PimagehlpStatusRoutine): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_bindImageEx(flags.toInt(), (imagename?.value ?: 0L).toString(), (dllpath?.value ?: 0L).toString(), (symbolpath?.value ?: 0L).toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun checkRemoteDebuggerPresent(hprocess: Handle, pbdebuggerpresent: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_checkRemoteDebuggerPresent((hprocess?.value ?: 0L).toString(), (pbdebuggerpresent?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun checkSumMappedFile(baseaddress: COpaquePointer?, filelength: UInt, headersum: COpaquePointer?, checksum: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_checkSumMappedFile((baseaddress?.value ?: 0L).toString(), filelength.toInt(), (headersum?.value ?: 0L).toString(), (checksum?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeThreadWaitChainSession(wcthandle: COpaquePointer?) {
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) {
        _windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_closeThreadWaitChainSession((wcthandle?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun continueDebugEvent(dwprocessid: UInt, dwthreadid: UInt, dwcontinuestatus: Ntstatus): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_continueDebugEvent(dwprocessid.toInt(), dwthreadid.toInt(), dwcontinuestatus) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyContext(destination: COpaquePointer?, contextflags: ContextFlags, source: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_copyContext((destination?.value ?: 0L).toString(), contextflags.toInt(), (source?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dbgHelpCreateUserDump(filename: Pcstr, callback: PdbghelpCreateUserDumpCallback, userdata: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_dbgHelpCreateUserDump((filename?.value ?: 0L).toString(), 0L.toString(), (userdata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dbgHelpCreateUserDumpW(filename: Pcwstr, callback: PdbghelpCreateUserDumpCallback, userdata: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_dbgHelpCreateUserDumpW((filename?.value ?: 0L).toString(), 0L.toString(), (userdata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun debugActiveProcess(dwprocessid: UInt): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_debugActiveProcess(dwprocessid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun debugActiveProcessStop(dwprocessid: UInt): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_debugActiveProcessStop(dwprocessid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun debugBreak() {
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) {
        _windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_debugBreak()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun debugBreakProcess(process: Handle): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_debugBreakProcess((process?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun debugSetProcessKillOnExit(killonexit: Bool): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_debugSetProcessKillOnExit(killonexit) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun decodePointer(ptr: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_decodePointer((ptr?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun decodeRemotePointer(processhandle: Handle, ptr: COpaquePointer?, decodedptr: COpaquePointer?): Hresult =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_decodeRemotePointer((processhandle?.value ?: 0L).toString(), (ptr?.value ?: 0L).toString(), (decodedptr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun decodeSystemPointer(ptr: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_decodeSystemPointer((ptr?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun encodePointer(ptr: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_encodePointer((ptr?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun encodeRemotePointer(processhandle: Handle, ptr: COpaquePointer?, encodedptr: COpaquePointer?): Hresult =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_encodeRemotePointer((processhandle?.value ?: 0L).toString(), (ptr?.value ?: 0L).toString(), (encodedptr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun encodeSystemPointer(ptr: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_encodeSystemPointer((ptr?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumDirTree(hprocess: Handle, rootpath: Pcstr, inputpathname: Pcstr, outputpathbuffer: Pstr, cb: PenumdirtreeCallback, data: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_enumDirTree((hprocess?.value ?: 0L).toString(), (rootpath?.value ?: 0L).toString(), (inputpathname?.value ?: 0L).toString(), (outputpathbuffer?.value ?: 0L).toString(), 0L.toString(), (data?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumDirTreeW(hprocess: Handle, rootpath: Pcwstr, inputpathname: Pcwstr, outputpathbuffer: Pwstr, cb: PenumdirtreeCallbackw, data: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_enumDirTreeW((hprocess?.value ?: 0L).toString(), (rootpath?.value ?: 0L).toString(), (inputpathname?.value ?: 0L).toString(), (outputpathbuffer?.value ?: 0L).toString(), 0L.toString(), (data?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumerateLoadedModules64(hprocess: Handle, enumloadedmodulescallback: PenumloadedModulesCallback64, usercontext: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_enumerateLoadedModules64((hprocess?.value ?: 0L).toString(), 0L.toString(), (usercontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumerateLoadedModulesEx(hprocess: Handle, enumloadedmodulescallback: PenumloadedModulesCallback64, usercontext: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_enumerateLoadedModulesEx((hprocess?.value ?: 0L).toString(), 0L.toString(), (usercontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumerateLoadedModulesExW(hprocess: Handle, enumloadedmodulescallback: PenumloadedModulesCallbackw64, usercontext: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_enumerateLoadedModulesExW((hprocess?.value ?: 0L).toString(), 0L.toString(), (usercontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumerateLoadedModulesW64(hprocess: Handle, enumloadedmodulescallback: PenumloadedModulesCallbackw64, usercontext: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_enumerateLoadedModulesW64((hprocess?.value ?: 0L).toString(), 0L.toString(), (usercontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fatalAppExitA(uaction: UInt, lpmessagetext: Pcstr) {
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) {
        _windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_fatalAppExitA(uaction.toInt(), (lpmessagetext?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fatalAppExitW(uaction: UInt, lpmessagetext: Pcwstr) {
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) {
        _windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_fatalAppExitW(uaction.toInt(), (lpmessagetext?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fatalExit(exitcode: Int): Nothing {
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) {
        _windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_fatalExit(exitcode)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function fatalExit")
}

public actual fun findDebugInfoFile(filename: Pcstr, symbolpath: Pcstr, debugfilepath: Pstr): Handle =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_findDebugInfoFile((filename?.value ?: 0L).toString(), (symbolpath?.value ?: 0L).toString(), (debugfilepath?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findDebugInfoFileEx(filename: Pcstr, symbolpath: Pcstr, debugfilepath: Pstr, callback: PfindDebugFileCallback, callerdata: COpaquePointer?): Handle =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_findDebugInfoFileEx((filename?.value ?: 0L).toString(), (symbolpath?.value ?: 0L).toString(), (debugfilepath?.value ?: 0L).toString(), 0L.toString(), (callerdata?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findDebugInfoFileExW(filename: Pcwstr, symbolpath: Pcwstr, debugfilepath: Pwstr, callback: PfindDebugFileCallbackw, callerdata: COpaquePointer?): Handle =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_findDebugInfoFileExW((filename?.value ?: 0L).toString(), (symbolpath?.value ?: 0L).toString(), (debugfilepath?.value ?: 0L).toString(), 0L.toString(), (callerdata?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findExecutableImage(filename: Pcstr, symbolpath: Pcstr, imagefilepath: Pstr): Handle =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_findExecutableImage((filename?.value ?: 0L).toString(), (symbolpath?.value ?: 0L).toString(), (imagefilepath?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findExecutableImageEx(filename: Pcstr, symbolpath: Pcstr, imagefilepath: Pstr, callback: PfindExeFileCallback, callerdata: COpaquePointer?): Handle =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_findExecutableImageEx((filename?.value ?: 0L).toString(), (symbolpath?.value ?: 0L).toString(), (imagefilepath?.value ?: 0L).toString(), 0L.toString(), (callerdata?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findExecutableImageExW(filename: Pcwstr, symbolpath: Pcwstr, imagefilepath: Pwstr, callback: PfindExeFileCallbackw, callerdata: COpaquePointer?): Handle =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_findExecutableImageExW((filename?.value ?: 0L).toString(), (symbolpath?.value ?: 0L).toString(), (imagefilepath?.value ?: 0L).toString(), 0L.toString(), (callerdata?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFileInPath(hprocess: Handle, searchpatha: Pcstr, filename: Pcstr, id: COpaquePointer?, two: UInt, three: UInt, flags: UInt, filepath: Pstr): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_findFileInPath((hprocess?.value ?: 0L).toString(), (searchpatha?.value ?: 0L).toString(), (filename?.value ?: 0L).toString(), (id?.value ?: 0L).toString(), two.toInt(), three.toInt(), flags.toInt(), (filepath?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFileInSearchPath(hprocess: Handle, searchpatha: Pcstr, filename: Pcstr, one: UInt, two: UInt, three: UInt, filepath: Pstr): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_findFileInSearchPath((hprocess?.value ?: 0L).toString(), (searchpatha?.value ?: 0L).toString(), (filename?.value ?: 0L).toString(), one.toInt(), two.toInt(), three.toInt(), (filepath?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flushInstructionCache(hprocess: Handle, lpbaseaddress: COpaquePointer?, dwsize: ULong): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_flushInstructionCache((hprocess?.value ?: 0L).toString(), (lpbaseaddress?.value ?: 0L).toString(), dwsize.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun formatMessageA(dwflags: FormatMessageOptions, lpsource: COpaquePointer?, dwmessageid: UInt, dwlanguageid: UInt, lpbuffer: Pstr, nsize: UInt, arguments: COpaquePointer?): UInt =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_formatMessageA(dwflags.toInt(), (lpsource?.value ?: 0L).toString(), dwmessageid.toInt(), dwlanguageid.toInt(), (lpbuffer?.value ?: 0L).toString(), nsize.toInt(), (arguments?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun formatMessageW(dwflags: FormatMessageOptions, lpsource: COpaquePointer?, dwmessageid: UInt, dwlanguageid: UInt, lpbuffer: Pwstr, nsize: UInt, arguments: COpaquePointer?): UInt =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_formatMessageW(dwflags.toInt(), (lpsource?.value ?: 0L).toString(), dwmessageid.toInt(), dwlanguageid.toInt(), (lpbuffer?.value ?: 0L).toString(), nsize.toInt(), (arguments?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getEnabledXStateFeatures(): ULong =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_getEnabledXStateFeatures() as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getErrorMode(): UInt =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_getErrorMode() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getImageConfigInformation(loadedimage: COpaquePointer?, imageconfiginformation: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_getImageConfigInformation((loadedimage?.value ?: 0L).toString(), (imageconfiginformation?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getImageUnusedHeaderBytes(loadedimage: COpaquePointer?, sizeunusedheaderbytes: COpaquePointer?): UInt =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_getImageUnusedHeaderBytes((loadedimage?.value ?: 0L).toString(), (sizeunusedheaderbytes?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSymLoadError(): UInt =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_getSymLoadError() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThreadContext(hthread: Handle, lpcontext: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_getThreadContext((hthread?.value ?: 0L).toString(), (lpcontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThreadErrorMode(): UInt =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_getThreadErrorMode() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThreadSelectorEntry(hthread: Handle, dwselector: UInt, lpselectorentry: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_getThreadSelectorEntry((hthread?.value ?: 0L).toString(), dwselector.toInt(), (lpselectorentry?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThreadWaitChain(wcthandle: COpaquePointer?, context: ULong, flags: WaitChainThreadOptions, threadid: UInt, nodecount: COpaquePointer?, nodeinfoarray: COpaquePointer?, iscycle: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_getThreadWaitChain((wcthandle?.value ?: 0L).toString(), context.toString(), flags.toInt(), threadid.toInt(), (nodecount?.value ?: 0L).toString(), (nodeinfoarray?.value ?: 0L).toString(), (iscycle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTimestampForLoadedLibrary(module: Hmodule): UInt =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_getTimestampForLoadedLibrary((module?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getXStateFeaturesMask(context: COpaquePointer?, featuremask: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_getXStateFeaturesMask((context?.value ?: 0L).toString(), (featuremask?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageAddCertificate(filehandle: Handle, certificate: COpaquePointer?, index: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_imageAddCertificate((filehandle?.value ?: 0L).toString(), (certificate?.value ?: 0L).toString(), (index?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageDirectoryEntryToData(base: COpaquePointer?, mappedasimage: Boolean, directoryentry: ImageDirectoryEntry, size: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_imageDirectoryEntryToData((base?.value ?: 0L).toString(), mappedasimage, directoryentry.toInt(), (size?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageDirectoryEntryToDataEx(base: COpaquePointer?, mappedasimage: Boolean, directoryentry: ImageDirectoryEntry, size: COpaquePointer?, foundheader: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_imageDirectoryEntryToDataEx((base?.value ?: 0L).toString(), mappedasimage, directoryentry.toInt(), (size?.value ?: 0L).toString(), (foundheader?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageEnumerateCertificates(filehandle: Handle, typefilter: UShort, certificatecount: COpaquePointer?, indices: COpaquePointer?, indexcount: UInt): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_imageEnumerateCertificates((filehandle?.value ?: 0L).toString(), typefilter.toInt(), (certificatecount?.value ?: 0L).toString(), (indices?.value ?: 0L).toString(), indexcount.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageGetCertificateData(filehandle: Handle, certificateindex: UInt, certificate: COpaquePointer?, requiredlength: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_imageGetCertificateData((filehandle?.value ?: 0L).toString(), certificateindex.toInt(), (certificate?.value ?: 0L).toString(), (requiredlength?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageGetCertificateHeader(filehandle: Handle, certificateindex: UInt, certificateheader: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_imageGetCertificateHeader((filehandle?.value ?: 0L).toString(), certificateindex.toInt(), (certificateheader?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageGetDigestStream(filehandle: Handle, digestlevel: UInt, digestfunction: DigestFunction, digesthandle: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_imageGetDigestStream((filehandle?.value ?: 0L).toString(), digestlevel.toInt(), 0L.toString(), (digesthandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageLoad(dllname: Pcstr, dllpath: Pcstr): COpaquePointer? =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_imageLoad((dllname?.value ?: 0L).toString(), (dllpath?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageNtHeader(base: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_imageNtHeader((base?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageRemoveCertificate(filehandle: Handle, index: UInt): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_imageRemoveCertificate((filehandle?.value ?: 0L).toString(), index.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageRvaToSection(ntheaders: COpaquePointer?, base: COpaquePointer?, rva: UInt): COpaquePointer? =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_imageRvaToSection((ntheaders?.value ?: 0L).toString(), (base?.value ?: 0L).toString(), rva.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageRvaToVa(ntheaders: COpaquePointer?, base: COpaquePointer?, rva: UInt, lastrvasection: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_imageRvaToVa((ntheaders?.value ?: 0L).toString(), (base?.value ?: 0L).toString(), rva.toInt(), (lastrvasection?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageUnload(loadedimage: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_imageUnload((loadedimage?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imagehlpApiVersion(): COpaquePointer? =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_imagehlpApiVersion() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imagehlpApiVersionEx(appversion: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_imagehlpApiVersionEx((appversion?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initializeContext(buffer: COpaquePointer?, contextflags: ContextFlags, context: COpaquePointer?, contextlength: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_initializeContext((buffer?.value ?: 0L).toString(), contextflags.toInt(), (context?.value ?: 0L).toString(), (contextlength?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initializeContext2(buffer: COpaquePointer?, contextflags: ContextFlags, context: COpaquePointer?, contextlength: COpaquePointer?, xstatecompactionmask: ULong): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_initializeContext2((buffer?.value ?: 0L).toString(), contextflags.toInt(), (context?.value ?: 0L).toString(), (contextlength?.value ?: 0L).toString(), xstatecompactionmask.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isDebuggerPresent(): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_isDebuggerPresent() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun locateXStateFeature(context: COpaquePointer?, featureid: UInt, length: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_locateXStateFeature((context?.value ?: 0L).toString(), featureid.toInt(), (length?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun makeSureDirectoryPathExists(dirpath: Pcstr): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_makeSureDirectoryPathExists((dirpath?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mapAndLoad(imagename: Pcstr, dllpath: Pcstr, loadedimage: COpaquePointer?, dotdll: Bool, readonly: Bool): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_mapAndLoad((imagename?.value ?: 0L).toString(), (dllpath?.value ?: 0L).toString(), (loadedimage?.value ?: 0L).toString(), dotdll, readonly) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mapFileAndCheckSumA(filename: Pcstr, headersum: COpaquePointer?, checksum: COpaquePointer?): UInt =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_mapFileAndCheckSumA((filename?.value ?: 0L).toString(), (headersum?.value ?: 0L).toString(), (checksum?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mapFileAndCheckSumW(filename: Pcwstr, headersum: COpaquePointer?, checksum: COpaquePointer?): UInt =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_mapFileAndCheckSumW((filename?.value ?: 0L).toString(), (headersum?.value ?: 0L).toString(), (checksum?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun messageBeep(utype: MessageboxStyle): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_messageBeep(utype.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun miniDumpReadDumpStream(baseofdump: COpaquePointer?, streamnumber: UInt, dir: COpaquePointer?, streampointer: COpaquePointer?, streamsize: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_miniDumpReadDumpStream((baseofdump?.value ?: 0L).toString(), streamnumber.toInt(), (dir?.value ?: 0L).toString(), (streampointer?.value ?: 0L).toString(), (streamsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun miniDumpWriteDump(hprocess: Handle, processid: UInt, hfile: Handle, dumptype: MinidumpType, exceptionparam: COpaquePointer?, userstreamparam: COpaquePointer?, callbackparam: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_miniDumpWriteDump((hprocess?.value ?: 0L).toString(), processid.toInt(), (hfile?.value ?: 0L).toString(), dumptype, (exceptionparam?.value ?: 0L).toString(), (userstreamparam?.value ?: 0L).toString(), (callbackparam?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openThreadWaitChainSession(flags: OpenThreadWaitChainSessionFlags, callback: Pwaitchaincallback): COpaquePointer? =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_openThreadWaitChainSession(flags.toInt(), 0L.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun outputDebugStringA(lpoutputstring: Pcstr) {
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) {
        _windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_outputDebugStringA((lpoutputstring?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun outputDebugStringW(lpoutputstring: Pcwstr) {
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) {
        _windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_outputDebugStringW((lpoutputstring?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun raiseException(dwexceptioncode: UInt, dwexceptionflags: UInt, nnumberofarguments: UInt, lparguments: COpaquePointer?) {
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) {
        _windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_raiseException(dwexceptioncode.toInt(), dwexceptionflags.toInt(), nnumberofarguments.toInt(), (lparguments?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun raiseFailFastException(pexceptionrecord: COpaquePointer?, pcontextrecord: COpaquePointer?, dwflags: UInt) {
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) {
        _windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_raiseFailFastException((pexceptionrecord?.value ?: 0L).toString(), (pcontextrecord?.value ?: 0L).toString(), dwflags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rangeMapAddPeImageSections(rmaphandle: COpaquePointer?, imagename: Pcwstr, mappedimage: COpaquePointer?, mappingbytes: UInt, imagebase: ULong, usertag: ULong, mappingflags: UInt): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_rangeMapAddPeImageSections((rmaphandle?.value ?: 0L).toString(), (imagename?.value ?: 0L).toString(), (mappedimage?.value ?: 0L).toString(), mappingbytes.toInt(), imagebase.toString(), usertag.toString(), mappingflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rangeMapCreate(): COpaquePointer? =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_rangeMapCreate() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rangeMapFree(rmaphandle: COpaquePointer?) {
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) {
        _windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_rangeMapFree((rmaphandle?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rangeMapRead(rmaphandle: COpaquePointer?, offset: ULong, buffer: COpaquePointer?, requestbytes: UInt, flags: UInt, donebytes: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_rangeMapRead((rmaphandle?.value ?: 0L).toString(), offset.toString(), (buffer?.value ?: 0L).toString(), requestbytes.toInt(), flags.toInt(), (donebytes?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rangeMapRemove(rmaphandle: COpaquePointer?, usertag: ULong): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_rangeMapRemove((rmaphandle?.value ?: 0L).toString(), usertag.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rangeMapWrite(rmaphandle: COpaquePointer?, offset: ULong, buffer: COpaquePointer?, requestbytes: UInt, flags: UInt, donebytes: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_rangeMapWrite((rmaphandle?.value ?: 0L).toString(), offset.toString(), (buffer?.value ?: 0L).toString(), requestbytes.toInt(), flags.toInt(), (donebytes?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reBaseImage(currentimagename: Pcstr, symbolpath: Pcstr, frebase: Bool, frebasesysfileok: Bool, fgoingdown: Bool, checkimagesize: UInt, oldimagesize: COpaquePointer?, oldimagebase: COpaquePointer?, newimagesize: COpaquePointer?, newimagebase: COpaquePointer?, timestamp: UInt): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_reBaseImage((currentimagename?.value ?: 0L).toString(), (symbolpath?.value ?: 0L).toString(), frebase, frebasesysfileok, fgoingdown, checkimagesize.toInt(), (oldimagesize?.value ?: 0L).toString(), (oldimagebase?.value ?: 0L).toString(), (newimagesize?.value ?: 0L).toString(), (newimagebase?.value ?: 0L).toString(), timestamp.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reBaseImage64(currentimagename: Pcstr, symbolpath: Pcstr, frebase: Bool, frebasesysfileok: Bool, fgoingdown: Bool, checkimagesize: UInt, oldimagesize: COpaquePointer?, oldimagebase: COpaquePointer?, newimagesize: COpaquePointer?, newimagebase: COpaquePointer?, timestamp: UInt): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_reBaseImage64((currentimagename?.value ?: 0L).toString(), (symbolpath?.value ?: 0L).toString(), frebase, frebasesysfileok, fgoingdown, checkimagesize.toInt(), (oldimagesize?.value ?: 0L).toString(), (oldimagebase?.value ?: 0L).toString(), (newimagesize?.value ?: 0L).toString(), (newimagebase?.value ?: 0L).toString(), timestamp.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readProcessMemory(hprocess: Handle, lpbaseaddress: COpaquePointer?, lpbuffer: COpaquePointer?, nsize: ULong, lpnumberofbytesread: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_readProcessMemory((hprocess?.value ?: 0L).toString(), (lpbaseaddress?.value ?: 0L).toString(), (lpbuffer?.value ?: 0L).toString(), nsize.toString(), (lpnumberofbytesread?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerWaitChainCOMCallback(callstatecallback: Pcogetcallstate, activationstatecallback: Pcogetactivationstate) {
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) {
        _windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_registerWaitChainCOMCallback(0L.toString(), 0L.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun removeInvalidModuleList(hprocess: Handle) {
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) {
        _windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_removeInvalidModuleList((hprocess?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun removeVectoredContinueHandler(handle: COpaquePointer?): UInt =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_removeVectoredContinueHandler((handle?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeVectoredExceptionHandler(handle: COpaquePointer?): UInt =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_removeVectoredExceptionHandler((handle?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reportSymbolLoadSummary(hprocess: Handle, ploadmodule: Pcwstr, psymboldata: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_reportSymbolLoadSummary((hprocess?.value ?: 0L).toString(), (ploadmodule?.value ?: 0L).toString(), (psymboldata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlAddFunctionTable(functiontable: COpaquePointer?, entrycount: UInt, baseaddress: ULong): Boolean =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_rtlAddFunctionTable((functiontable?.value ?: 0L).toString(), entrycount.toInt(), baseaddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlAddGrowableFunctionTable(dynamictable: COpaquePointer?, functiontable: COpaquePointer?, entrycount: UInt, maximumentrycount: UInt, rangebase: ULong, rangeend: ULong): UInt =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_rtlAddGrowableFunctionTable((dynamictable?.value ?: 0L).toString(), (functiontable?.value ?: 0L).toString(), entrycount.toInt(), maximumentrycount.toInt(), rangebase.toString(), rangeend.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlCaptureContext(contextrecord: COpaquePointer?) {
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) {
        _windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_rtlCaptureContext((contextrecord?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlCaptureContext2(contextrecord: COpaquePointer?) {
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) {
        _windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_rtlCaptureContext2((contextrecord?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlCaptureStackBackTrace(framestoskip: UInt, framestocapture: UInt, backtrace: COpaquePointer?, backtracehash: COpaquePointer?): UShort =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_rtlCaptureStackBackTrace(framestoskip.toInt(), framestocapture.toInt(), (backtrace?.value ?: 0L).toString(), (backtracehash?.value ?: 0L).toString()) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlDeleteFunctionTable(functiontable: COpaquePointer?): Boolean =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_rtlDeleteFunctionTable((functiontable?.value ?: 0L).toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlDeleteGrowableFunctionTable(dynamictable: COpaquePointer?) {
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) {
        _windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_rtlDeleteGrowableFunctionTable((dynamictable?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlGrowFunctionTable(dynamictable: COpaquePointer?, newentrycount: UInt) {
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) {
        _windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_rtlGrowFunctionTable((dynamictable?.value ?: 0L).toString(), newentrycount.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlInstallFunctionTableCallback(tableidentifier: ULong, baseaddress: ULong, length: UInt, callback: PgetRuntimeFunctionCallback, context: COpaquePointer?, outofprocesscallbackdll: Pcwstr): Boolean =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_rtlInstallFunctionTableCallback(tableidentifier.toString(), baseaddress.toString(), length.toInt(), 0L.toString(), (context?.value ?: 0L).toString(), (outofprocesscallbackdll?.value ?: 0L).toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlLookupFunctionEntry(controlpc: ULong, imagebase: COpaquePointer?, historytable: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_rtlLookupFunctionEntry(controlpc.toString(), (imagebase?.value ?: 0L).toString(), (historytable?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlPcToFileHeader(pcvalue: COpaquePointer?, baseofimage: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_rtlPcToFileHeader((pcvalue?.value ?: 0L).toString(), (baseofimage?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlRaiseException(exceptionrecord: COpaquePointer?) {
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) {
        _windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_rtlRaiseException((exceptionrecord?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlRestoreContext(contextrecord: COpaquePointer?, exceptionrecord: COpaquePointer?) {
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) {
        _windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_rtlRestoreContext((contextrecord?.value ?: 0L).toString(), (exceptionrecord?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlUnwind(targetframe: COpaquePointer?, targetip: COpaquePointer?, exceptionrecord: COpaquePointer?, returnvalue: COpaquePointer?) {
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) {
        _windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_rtlUnwind((targetframe?.value ?: 0L).toString(), (targetip?.value ?: 0L).toString(), (exceptionrecord?.value ?: 0L).toString(), (returnvalue?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlUnwindEx(targetframe: COpaquePointer?, targetip: COpaquePointer?, exceptionrecord: COpaquePointer?, returnvalue: COpaquePointer?, contextrecord: COpaquePointer?, historytable: COpaquePointer?) {
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) {
        _windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_rtlUnwindEx((targetframe?.value ?: 0L).toString(), (targetip?.value ?: 0L).toString(), (exceptionrecord?.value ?: 0L).toString(), (returnvalue?.value ?: 0L).toString(), (contextrecord?.value ?: 0L).toString(), (historytable?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlVirtualUnwind(handlertype: RtlVirtualUnwindHandlerType, imagebase: ULong, controlpc: ULong, functionentry: COpaquePointer?, contextrecord: COpaquePointer?, handlerdata: COpaquePointer?, establisherframe: COpaquePointer?, contextpointers: COpaquePointer?): ExceptionRoutine =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) null else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun searchTreeForFile(rootpath: Pcstr, inputpathname: Pcstr, outputpathbuffer: Pstr): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_searchTreeForFile((rootpath?.value ?: 0L).toString(), (inputpathname?.value ?: 0L).toString(), (outputpathbuffer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun searchTreeForFileW(rootpath: Pcwstr, inputpathname: Pcwstr, outputpathbuffer: Pwstr): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_searchTreeForFileW((rootpath?.value ?: 0L).toString(), (inputpathname?.value ?: 0L).toString(), (outputpathbuffer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCheckUserInterruptShared(lpstartaddress: LpcallBackUserInterruptRoutine) {
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) {
        _windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_setCheckUserInterruptShared(0L.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setErrorMode(umode: ThreadErrorMode): ThreadErrorMode =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_setErrorMode(umode.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setImageConfigInformation(loadedimage: COpaquePointer?, imageconfiginformation: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_setImageConfigInformation((loadedimage?.value ?: 0L).toString(), (imageconfiginformation?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSymLoadError(error: UInt) {
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) {
        _windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_setSymLoadError(error.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setThreadContext(hthread: Handle, lpcontext: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_setThreadContext((hthread?.value ?: 0L).toString(), (lpcontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThreadErrorMode(dwnewmode: ThreadErrorMode, lpoldmode: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_setThreadErrorMode(dwnewmode.toInt(), (lpoldmode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setUnhandledExceptionFilter(lptoplevelexceptionfilter: LptopLevelExceptionFilter): LptopLevelExceptionFilter =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) null else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setXStateFeaturesMask(context: COpaquePointer?, featuremask: ULong): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_setXStateFeaturesMask((context?.value ?: 0L).toString(), featuremask.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stackWalk2(machinetype: UInt, hprocess: Handle, hthread: Handle, stackframe: COpaquePointer?, contextrecord: COpaquePointer?, readmemoryroutine: PreadProcessMemoryRoutine64, functiontableaccessroutine: PfunctionTableAccessRoutine64, getmodulebaseroutine: PgetModuleBaseRoutine64, translateaddress: PtranslateAddressRoutine64, gettargetattributevalue: PgetTargetAttributeValue64, flags: UInt): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_stackWalk2(machinetype.toInt(), (hprocess?.value ?: 0L).toString(), (hthread?.value ?: 0L).toString(), (stackframe?.value ?: 0L).toString(), (contextrecord?.value ?: 0L).toString(), 0L.toString(), 0L.toString(), 0L.toString(), 0L.toString(), 0L.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stackWalk64(machinetype: UInt, hprocess: Handle, hthread: Handle, stackframe: COpaquePointer?, contextrecord: COpaquePointer?, readmemoryroutine: PreadProcessMemoryRoutine64, functiontableaccessroutine: PfunctionTableAccessRoutine64, getmodulebaseroutine: PgetModuleBaseRoutine64, translateaddress: PtranslateAddressRoutine64): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_stackWalk64(machinetype.toInt(), (hprocess?.value ?: 0L).toString(), (hthread?.value ?: 0L).toString(), (stackframe?.value ?: 0L).toString(), (contextrecord?.value ?: 0L).toString(), 0L.toString(), 0L.toString(), 0L.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stackWalkEx(machinetype: UInt, hprocess: Handle, hthread: Handle, stackframe: COpaquePointer?, contextrecord: COpaquePointer?, readmemoryroutine: PreadProcessMemoryRoutine64, functiontableaccessroutine: PfunctionTableAccessRoutine64, getmodulebaseroutine: PgetModuleBaseRoutine64, translateaddress: PtranslateAddressRoutine64, flags: UInt): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_stackWalkEx(machinetype.toInt(), (hprocess?.value ?: 0L).toString(), (hthread?.value ?: 0L).toString(), (stackframe?.value ?: 0L).toString(), (contextrecord?.value ?: 0L).toString(), 0L.toString(), 0L.toString(), 0L.toString(), 0L.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symAddSourceStream(hprocess: Handle, base: ULong, streamfile: Pcstr, buffer: COpaquePointer?, size: ULong): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symAddSourceStream((hprocess?.value ?: 0L).toString(), base.toString(), (streamfile?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), size.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symAddSourceStreamA(hprocess: Handle, base: ULong, streamfile: Pcstr, buffer: COpaquePointer?, size: ULong): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symAddSourceStreamA((hprocess?.value ?: 0L).toString(), base.toString(), (streamfile?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), size.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symAddSourceStreamW(hprocess: Handle, base: ULong, filespec: Pcwstr, buffer: COpaquePointer?, size: ULong): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symAddSourceStreamW((hprocess?.value ?: 0L).toString(), base.toString(), (filespec?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), size.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symAddSymbol(hprocess: Handle, baseofdll: ULong, name: Pcstr, address: ULong, size: UInt, flags: UInt): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symAddSymbol((hprocess?.value ?: 0L).toString(), baseofdll.toString(), (name?.value ?: 0L).toString(), address.toString(), size.toInt(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symAddSymbolW(hprocess: Handle, baseofdll: ULong, name: Pcwstr, address: ULong, size: UInt, flags: UInt): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symAddSymbolW((hprocess?.value ?: 0L).toString(), baseofdll.toString(), (name?.value ?: 0L).toString(), address.toString(), size.toInt(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symAddrIncludeInlineTrace(hprocess: Handle, address: ULong): UInt =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symAddrIncludeInlineTrace((hprocess?.value ?: 0L).toString(), address.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symCleanup(hprocess: Handle): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symCleanup((hprocess?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symCompareInlineTrace(hprocess: Handle, address1: ULong, inlinecontext1: UInt, retaddress1: ULong, address2: ULong, retaddress2: ULong): UInt =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symCompareInlineTrace((hprocess?.value ?: 0L).toString(), address1.toString(), inlinecontext1.toInt(), retaddress1.toString(), address2.toString(), retaddress2.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symDeleteSymbol(hprocess: Handle, baseofdll: ULong, name: Pcstr, address: ULong, flags: UInt): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symDeleteSymbol((hprocess?.value ?: 0L).toString(), baseofdll.toString(), (name?.value ?: 0L).toString(), address.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symDeleteSymbolW(hprocess: Handle, baseofdll: ULong, name: Pcwstr, address: ULong, flags: UInt): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symDeleteSymbolW((hprocess?.value ?: 0L).toString(), baseofdll.toString(), (name?.value ?: 0L).toString(), address.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symEnumLines(hprocess: Handle, base: ULong, obj: Pcstr, file: Pcstr, enumlinescallback: PsymEnumlinesCallback, usercontext: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symEnumLines((hprocess?.value ?: 0L).toString(), base.toString(), (obj?.value ?: 0L).toString(), (file?.value ?: 0L).toString(), 0L.toString(), (usercontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symEnumLinesW(hprocess: Handle, base: ULong, obj: Pcwstr, file: Pcwstr, enumlinescallback: PsymEnumlinesCallbackw, usercontext: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symEnumLinesW((hprocess?.value ?: 0L).toString(), base.toString(), (obj?.value ?: 0L).toString(), (file?.value ?: 0L).toString(), 0L.toString(), (usercontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symEnumProcesses(enumprocessescallback: PsymEnumprocessesCallback, usercontext: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symEnumProcesses(0L.toString(), (usercontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symEnumSourceFileTokens(hprocess: Handle, base: ULong, callback: Penumsourcefiletokenscallback): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symEnumSourceFileTokens((hprocess?.value ?: 0L).toString(), base.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symEnumSourceFiles(hprocess: Handle, modbase: ULong, mask: Pcstr, cbsrcfiles: PsymEnumsourcefilesCallback, usercontext: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symEnumSourceFiles((hprocess?.value ?: 0L).toString(), modbase.toString(), (mask?.value ?: 0L).toString(), 0L.toString(), (usercontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symEnumSourceFilesW(hprocess: Handle, modbase: ULong, mask: Pcwstr, cbsrcfiles: PsymEnumsourcefilesCallbackw, usercontext: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symEnumSourceFilesW((hprocess?.value ?: 0L).toString(), modbase.toString(), (mask?.value ?: 0L).toString(), 0L.toString(), (usercontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symEnumSourceLines(hprocess: Handle, base: ULong, obj: Pcstr, file: Pcstr, line: UInt, flags: UInt, enumlinescallback: PsymEnumlinesCallback, usercontext: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symEnumSourceLines((hprocess?.value ?: 0L).toString(), base.toString(), (obj?.value ?: 0L).toString(), (file?.value ?: 0L).toString(), line.toInt(), flags.toInt(), 0L.toString(), (usercontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symEnumSourceLinesW(hprocess: Handle, base: ULong, obj: Pcwstr, file: Pcwstr, line: UInt, flags: UInt, enumlinescallback: PsymEnumlinesCallbackw, usercontext: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symEnumSourceLinesW((hprocess?.value ?: 0L).toString(), base.toString(), (obj?.value ?: 0L).toString(), (file?.value ?: 0L).toString(), line.toInt(), flags.toInt(), 0L.toString(), (usercontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symEnumSym(hprocess: Handle, baseofdll: ULong, enumsymbolscallback: PsymEnumeratesymbolsCallback, usercontext: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symEnumSym((hprocess?.value ?: 0L).toString(), baseofdll.toString(), 0L.toString(), (usercontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symEnumSymbols(hprocess: Handle, baseofdll: ULong, mask: Pcstr, enumsymbolscallback: PsymEnumeratesymbolsCallback, usercontext: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symEnumSymbols((hprocess?.value ?: 0L).toString(), baseofdll.toString(), (mask?.value ?: 0L).toString(), 0L.toString(), (usercontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symEnumSymbolsEx(hprocess: Handle, baseofdll: ULong, mask: Pcstr, enumsymbolscallback: PsymEnumeratesymbolsCallback, usercontext: COpaquePointer?, options: UInt): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symEnumSymbolsEx((hprocess?.value ?: 0L).toString(), baseofdll.toString(), (mask?.value ?: 0L).toString(), 0L.toString(), (usercontext?.value ?: 0L).toString(), options.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symEnumSymbolsExW(hprocess: Handle, baseofdll: ULong, mask: Pcwstr, enumsymbolscallback: PsymEnumeratesymbolsCallbackw, usercontext: COpaquePointer?, options: UInt): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symEnumSymbolsExW((hprocess?.value ?: 0L).toString(), baseofdll.toString(), (mask?.value ?: 0L).toString(), 0L.toString(), (usercontext?.value ?: 0L).toString(), options.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symEnumSymbolsForAddr(hprocess: Handle, address: ULong, enumsymbolscallback: PsymEnumeratesymbolsCallback, usercontext: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symEnumSymbolsForAddr((hprocess?.value ?: 0L).toString(), address.toString(), 0L.toString(), (usercontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symEnumSymbolsForAddrW(hprocess: Handle, address: ULong, enumsymbolscallback: PsymEnumeratesymbolsCallbackw, usercontext: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symEnumSymbolsForAddrW((hprocess?.value ?: 0L).toString(), address.toString(), 0L.toString(), (usercontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symEnumSymbolsW(hprocess: Handle, baseofdll: ULong, mask: Pcwstr, enumsymbolscallback: PsymEnumeratesymbolsCallbackw, usercontext: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symEnumSymbolsW((hprocess?.value ?: 0L).toString(), baseofdll.toString(), (mask?.value ?: 0L).toString(), 0L.toString(), (usercontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symEnumTypes(hprocess: Handle, baseofdll: ULong, enumsymbolscallback: PsymEnumeratesymbolsCallback, usercontext: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symEnumTypes((hprocess?.value ?: 0L).toString(), baseofdll.toString(), 0L.toString(), (usercontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symEnumTypesByName(hprocess: Handle, baseofdll: ULong, mask: Pcstr, enumsymbolscallback: PsymEnumeratesymbolsCallback, usercontext: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symEnumTypesByName((hprocess?.value ?: 0L).toString(), baseofdll.toString(), (mask?.value ?: 0L).toString(), 0L.toString(), (usercontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symEnumTypesByNameW(hprocess: Handle, baseofdll: ULong, mask: Pcwstr, enumsymbolscallback: PsymEnumeratesymbolsCallbackw, usercontext: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symEnumTypesByNameW((hprocess?.value ?: 0L).toString(), baseofdll.toString(), (mask?.value ?: 0L).toString(), 0L.toString(), (usercontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symEnumTypesW(hprocess: Handle, baseofdll: ULong, enumsymbolscallback: PsymEnumeratesymbolsCallbackw, usercontext: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symEnumTypesW((hprocess?.value ?: 0L).toString(), baseofdll.toString(), 0L.toString(), (usercontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symEnumerateModules64(hprocess: Handle, enummodulescallback: PsymEnummodulesCallback64, usercontext: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symEnumerateModules64((hprocess?.value ?: 0L).toString(), 0L.toString(), (usercontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symEnumerateModulesW64(hprocess: Handle, enummodulescallback: PsymEnummodulesCallbackw64, usercontext: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symEnumerateModulesW64((hprocess?.value ?: 0L).toString(), 0L.toString(), (usercontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symEnumerateSymbols64(hprocess: Handle, baseofdll: ULong, enumsymbolscallback: PsymEnumsymbolsCallback64, usercontext: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symEnumerateSymbols64((hprocess?.value ?: 0L).toString(), baseofdll.toString(), 0L.toString(), (usercontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symEnumerateSymbolsW64(hprocess: Handle, baseofdll: ULong, enumsymbolscallback: PsymEnumsymbolsCallback64w, usercontext: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symEnumerateSymbolsW64((hprocess?.value ?: 0L).toString(), baseofdll.toString(), 0L.toString(), (usercontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symFindDebugInfoFile(hprocess: Handle, filename: Pcstr, debugfilepath: Pstr, callback: PfindDebugFileCallback, callerdata: COpaquePointer?): Handle =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symFindDebugInfoFile((hprocess?.value ?: 0L).toString(), (filename?.value ?: 0L).toString(), (debugfilepath?.value ?: 0L).toString(), 0L.toString(), (callerdata?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symFindDebugInfoFileW(hprocess: Handle, filename: Pcwstr, debugfilepath: Pwstr, callback: PfindDebugFileCallbackw, callerdata: COpaquePointer?): Handle =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symFindDebugInfoFileW((hprocess?.value ?: 0L).toString(), (filename?.value ?: 0L).toString(), (debugfilepath?.value ?: 0L).toString(), 0L.toString(), (callerdata?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symFindExecutableImage(hprocess: Handle, filename: Pcstr, imagefilepath: Pstr, callback: PfindExeFileCallback, callerdata: COpaquePointer?): Handle =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symFindExecutableImage((hprocess?.value ?: 0L).toString(), (filename?.value ?: 0L).toString(), (imagefilepath?.value ?: 0L).toString(), 0L.toString(), (callerdata?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symFindExecutableImageW(hprocess: Handle, filename: Pcwstr, imagefilepath: Pwstr, callback: PfindExeFileCallbackw, callerdata: COpaquePointer?): Handle =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symFindExecutableImageW((hprocess?.value ?: 0L).toString(), (filename?.value ?: 0L).toString(), (imagefilepath?.value ?: 0L).toString(), 0L.toString(), (callerdata?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symFindFileInPath(hprocess: Handle, searchpatha: Pcstr, filename: Pcstr, id: COpaquePointer?, two: UInt, three: UInt, flags: SymFindIdOption, foundfile: Pstr, callback: Pfindfileinpathcallback, context: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symFindFileInPath((hprocess?.value ?: 0L).toString(), (searchpatha?.value ?: 0L).toString(), (filename?.value ?: 0L).toString(), (id?.value ?: 0L).toString(), two.toInt(), three.toInt(), flags.toInt(), (foundfile?.value ?: 0L).toString(), 0L.toString(), (context?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symFindFileInPathW(hprocess: Handle, searchpatha: Pcwstr, filename: Pcwstr, id: COpaquePointer?, two: UInt, three: UInt, flags: SymFindIdOption, foundfile: Pwstr, callback: Pfindfileinpathcallbackw, context: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symFindFileInPathW((hprocess?.value ?: 0L).toString(), (searchpatha?.value ?: 0L).toString(), (filename?.value ?: 0L).toString(), (id?.value ?: 0L).toString(), two.toInt(), three.toInt(), flags.toInt(), (foundfile?.value ?: 0L).toString(), 0L.toString(), (context?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symFromAddr(hprocess: Handle, address: ULong, displacement: COpaquePointer?, symbol: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symFromAddr((hprocess?.value ?: 0L).toString(), address.toString(), (displacement?.value ?: 0L).toString(), (symbol?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symFromAddrW(hprocess: Handle, address: ULong, displacement: COpaquePointer?, symbol: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symFromAddrW((hprocess?.value ?: 0L).toString(), address.toString(), (displacement?.value ?: 0L).toString(), (symbol?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symFromIndex(hprocess: Handle, baseofdll: ULong, index: UInt, symbol: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symFromIndex((hprocess?.value ?: 0L).toString(), baseofdll.toString(), index.toInt(), (symbol?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symFromIndexW(hprocess: Handle, baseofdll: ULong, index: UInt, symbol: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symFromIndexW((hprocess?.value ?: 0L).toString(), baseofdll.toString(), index.toInt(), (symbol?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symFromInlineContext(hprocess: Handle, address: ULong, inlinecontext: UInt, displacement: COpaquePointer?, symbol: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symFromInlineContext((hprocess?.value ?: 0L).toString(), address.toString(), inlinecontext.toInt(), (displacement?.value ?: 0L).toString(), (symbol?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symFromInlineContextW(hprocess: Handle, address: ULong, inlinecontext: UInt, displacement: COpaquePointer?, symbol: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symFromInlineContextW((hprocess?.value ?: 0L).toString(), address.toString(), inlinecontext.toInt(), (displacement?.value ?: 0L).toString(), (symbol?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symFromName(hprocess: Handle, name: Pcstr, symbol: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symFromName((hprocess?.value ?: 0L).toString(), (name?.value ?: 0L).toString(), (symbol?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symFromNameW(hprocess: Handle, name: Pcwstr, symbol: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symFromNameW((hprocess?.value ?: 0L).toString(), (name?.value ?: 0L).toString(), (symbol?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symFromToken(hprocess: Handle, base: ULong, token: UInt, symbol: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symFromToken((hprocess?.value ?: 0L).toString(), base.toString(), token.toInt(), (symbol?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symFromTokenW(hprocess: Handle, base: ULong, token: UInt, symbol: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symFromTokenW((hprocess?.value ?: 0L).toString(), base.toString(), token.toInt(), (symbol?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symFunctionTableAccess64(hprocess: Handle, addrbase: ULong): COpaquePointer? =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symFunctionTableAccess64((hprocess?.value ?: 0L).toString(), addrbase.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symFunctionTableAccess64AccessRoutines(hprocess: Handle, addrbase: ULong, readmemoryroutine: PreadProcessMemoryRoutine64, getmodulebaseroutine: PgetModuleBaseRoutine64): COpaquePointer? =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symFunctionTableAccess64AccessRoutines((hprocess?.value ?: 0L).toString(), addrbase.toString(), 0L.toString(), 0L.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetExtendedOption(option: ImagehlpExtendedOptions): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symGetExtendedOption(option) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetFileLineOffsets64(hprocess: Handle, modulename: Pcstr, filename: Pcstr, buffer: COpaquePointer?, bufferlines: UInt): UInt =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symGetFileLineOffsets64((hprocess?.value ?: 0L).toString(), (modulename?.value ?: 0L).toString(), (filename?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), bufferlines.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetHomeDirectory(type: UInt, dir: Pstr, size: ULong): Pstr =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symGetHomeDirectory(type.toInt(), (dir?.value ?: 0L).toString(), size.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetHomeDirectoryW(type: UInt, dir: Pwstr, size: ULong): Pwstr =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symGetHomeDirectoryW(type.toInt(), (dir?.value ?: 0L).toString(), size.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetLineFromAddr64(hprocess: Handle, qwaddr: ULong, pdwdisplacement: COpaquePointer?, line64: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symGetLineFromAddr64((hprocess?.value ?: 0L).toString(), qwaddr.toString(), (pdwdisplacement?.value ?: 0L).toString(), (line64?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetLineFromAddrW64(hprocess: Handle, dwaddr: ULong, pdwdisplacement: COpaquePointer?, line: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symGetLineFromAddrW64((hprocess?.value ?: 0L).toString(), dwaddr.toString(), (pdwdisplacement?.value ?: 0L).toString(), (line?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetLineFromInlineContext(hprocess: Handle, qwaddr: ULong, inlinecontext: UInt, qwmodulebaseaddress: ULong, pdwdisplacement: COpaquePointer?, line64: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symGetLineFromInlineContext((hprocess?.value ?: 0L).toString(), qwaddr.toString(), inlinecontext.toInt(), qwmodulebaseaddress.toString(), (pdwdisplacement?.value ?: 0L).toString(), (line64?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetLineFromInlineContextW(hprocess: Handle, dwaddr: ULong, inlinecontext: UInt, qwmodulebaseaddress: ULong, pdwdisplacement: COpaquePointer?, line: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symGetLineFromInlineContextW((hprocess?.value ?: 0L).toString(), dwaddr.toString(), inlinecontext.toInt(), qwmodulebaseaddress.toString(), (pdwdisplacement?.value ?: 0L).toString(), (line?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetLineFromName64(hprocess: Handle, modulename: Pcstr, filename: Pcstr, dwlinenumber: UInt, pldisplacement: COpaquePointer?, line: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symGetLineFromName64((hprocess?.value ?: 0L).toString(), (modulename?.value ?: 0L).toString(), (filename?.value ?: 0L).toString(), dwlinenumber.toInt(), (pldisplacement?.value ?: 0L).toString(), (line?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetLineFromNameW64(hprocess: Handle, modulename: Pcwstr, filename: Pcwstr, dwlinenumber: UInt, pldisplacement: COpaquePointer?, line: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symGetLineFromNameW64((hprocess?.value ?: 0L).toString(), (modulename?.value ?: 0L).toString(), (filename?.value ?: 0L).toString(), dwlinenumber.toInt(), (pldisplacement?.value ?: 0L).toString(), (line?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetLineNext64(hprocess: Handle, line: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symGetLineNext64((hprocess?.value ?: 0L).toString(), (line?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetLineNextW64(hprocess: Handle, line: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symGetLineNextW64((hprocess?.value ?: 0L).toString(), (line?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetLinePrev64(hprocess: Handle, line: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symGetLinePrev64((hprocess?.value ?: 0L).toString(), (line?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetLinePrevW64(hprocess: Handle, line: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symGetLinePrevW64((hprocess?.value ?: 0L).toString(), (line?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetModuleBase64(hprocess: Handle, qwaddr: ULong): ULong =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symGetModuleBase64((hprocess?.value ?: 0L).toString(), qwaddr.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetModuleInfo64(hprocess: Handle, qwaddr: ULong, moduleinfo: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symGetModuleInfo64((hprocess?.value ?: 0L).toString(), qwaddr.toString(), (moduleinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetModuleInfoW64(hprocess: Handle, qwaddr: ULong, moduleinfo: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symGetModuleInfoW64((hprocess?.value ?: 0L).toString(), qwaddr.toString(), (moduleinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetOmaps(hprocess: Handle, baseofdll: ULong, omapto: COpaquePointer?, comapto: COpaquePointer?, omapfrom: COpaquePointer?, comapfrom: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symGetOmaps((hprocess?.value ?: 0L).toString(), baseofdll.toString(), (omapto?.value ?: 0L).toString(), (comapto?.value ?: 0L).toString(), (omapfrom?.value ?: 0L).toString(), (comapfrom?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetOptions(): UInt =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symGetOptions() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetScope(hprocess: Handle, baseofdll: ULong, index: UInt, symbol: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symGetScope((hprocess?.value ?: 0L).toString(), baseofdll.toString(), index.toInt(), (symbol?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetScopeW(hprocess: Handle, baseofdll: ULong, index: UInt, symbol: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symGetScopeW((hprocess?.value ?: 0L).toString(), baseofdll.toString(), index.toInt(), (symbol?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetSearchPath(hprocess: Handle, searchpatha: Pstr, searchpathlength: UInt): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symGetSearchPath((hprocess?.value ?: 0L).toString(), (searchpatha?.value ?: 0L).toString(), searchpathlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetSearchPathW(hprocess: Handle, searchpatha: Pwstr, searchpathlength: UInt): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symGetSearchPathW((hprocess?.value ?: 0L).toString(), (searchpatha?.value ?: 0L).toString(), searchpathlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetSourceFile(hprocess: Handle, base: ULong, params: Pcstr, filespec: Pcstr, filepath: Pstr, size: UInt): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symGetSourceFile((hprocess?.value ?: 0L).toString(), base.toString(), (params?.value ?: 0L).toString(), (filespec?.value ?: 0L).toString(), (filepath?.value ?: 0L).toString(), size.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetSourceFileChecksum(hprocess: Handle, base: ULong, filespec: Pcstr, pchecksumtype: COpaquePointer?, pchecksum: COpaquePointer?, checksumsize: UInt, pactualbyteswritten: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symGetSourceFileChecksum((hprocess?.value ?: 0L).toString(), base.toString(), (filespec?.value ?: 0L).toString(), (pchecksumtype?.value ?: 0L).toString(), (pchecksum?.value ?: 0L).toString(), checksumsize.toInt(), (pactualbyteswritten?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetSourceFileChecksumW(hprocess: Handle, base: ULong, filespec: Pcwstr, pchecksumtype: COpaquePointer?, pchecksum: COpaquePointer?, checksumsize: UInt, pactualbyteswritten: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symGetSourceFileChecksumW((hprocess?.value ?: 0L).toString(), base.toString(), (filespec?.value ?: 0L).toString(), (pchecksumtype?.value ?: 0L).toString(), (pchecksum?.value ?: 0L).toString(), checksumsize.toInt(), (pactualbyteswritten?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetSourceFileFromToken(hprocess: Handle, token: COpaquePointer?, params: Pcstr, filepath: Pstr, size: UInt): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symGetSourceFileFromToken((hprocess?.value ?: 0L).toString(), (token?.value ?: 0L).toString(), (params?.value ?: 0L).toString(), (filepath?.value ?: 0L).toString(), size.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetSourceFileFromTokenByTokenName(hprocess: Handle, token: COpaquePointer?, tokenname: Pcstr, params: Pcstr, filepath: Pstr, size: UInt): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symGetSourceFileFromTokenByTokenName((hprocess?.value ?: 0L).toString(), (token?.value ?: 0L).toString(), (tokenname?.value ?: 0L).toString(), (params?.value ?: 0L).toString(), (filepath?.value ?: 0L).toString(), size.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetSourceFileFromTokenByTokenNameW(hprocess: Handle, token: COpaquePointer?, tokenname: Pcwstr, params: Pcwstr, filepath: Pwstr, size: UInt): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symGetSourceFileFromTokenByTokenNameW((hprocess?.value ?: 0L).toString(), (token?.value ?: 0L).toString(), (tokenname?.value ?: 0L).toString(), (params?.value ?: 0L).toString(), (filepath?.value ?: 0L).toString(), size.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetSourceFileFromTokenW(hprocess: Handle, token: COpaquePointer?, params: Pcwstr, filepath: Pwstr, size: UInt): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symGetSourceFileFromTokenW((hprocess?.value ?: 0L).toString(), (token?.value ?: 0L).toString(), (params?.value ?: 0L).toString(), (filepath?.value ?: 0L).toString(), size.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetSourceFileToken(hprocess: Handle, base: ULong, filespec: Pcstr, token: COpaquePointer?, size: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symGetSourceFileToken((hprocess?.value ?: 0L).toString(), base.toString(), (filespec?.value ?: 0L).toString(), (token?.value ?: 0L).toString(), (size?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetSourceFileTokenByTokenName(hprocess: Handle, base: ULong, filespec: Pcstr, tokenname: Pcstr, tokenparameters: Pcstr, token: COpaquePointer?, size: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symGetSourceFileTokenByTokenName((hprocess?.value ?: 0L).toString(), base.toString(), (filespec?.value ?: 0L).toString(), (tokenname?.value ?: 0L).toString(), (tokenparameters?.value ?: 0L).toString(), (token?.value ?: 0L).toString(), (size?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetSourceFileTokenByTokenNameW(hprocess: Handle, base: ULong, filespec: Pcwstr, tokenname: Pcwstr, tokenparameters: Pcwstr, token: COpaquePointer?, size: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symGetSourceFileTokenByTokenNameW((hprocess?.value ?: 0L).toString(), base.toString(), (filespec?.value ?: 0L).toString(), (tokenname?.value ?: 0L).toString(), (tokenparameters?.value ?: 0L).toString(), (token?.value ?: 0L).toString(), (size?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetSourceFileTokenW(hprocess: Handle, base: ULong, filespec: Pcwstr, token: COpaquePointer?, size: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symGetSourceFileTokenW((hprocess?.value ?: 0L).toString(), base.toString(), (filespec?.value ?: 0L).toString(), (token?.value ?: 0L).toString(), (size?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetSourceFileW(hprocess: Handle, base: ULong, params: Pcwstr, filespec: Pcwstr, filepath: Pwstr, size: UInt): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symGetSourceFileW((hprocess?.value ?: 0L).toString(), base.toString(), (params?.value ?: 0L).toString(), (filespec?.value ?: 0L).toString(), (filepath?.value ?: 0L).toString(), size.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetSourceVarFromToken(hprocess: Handle, token: COpaquePointer?, params: Pcstr, varname: Pcstr, value: Pstr, size: UInt): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symGetSourceVarFromToken((hprocess?.value ?: 0L).toString(), (token?.value ?: 0L).toString(), (params?.value ?: 0L).toString(), (varname?.value ?: 0L).toString(), (value?.value ?: 0L).toString(), size.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetSourceVarFromTokenW(hprocess: Handle, token: COpaquePointer?, params: Pcwstr, varname: Pcwstr, value: Pwstr, size: UInt): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symGetSourceVarFromTokenW((hprocess?.value ?: 0L).toString(), (token?.value ?: 0L).toString(), (params?.value ?: 0L).toString(), (varname?.value ?: 0L).toString(), (value?.value ?: 0L).toString(), size.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetSymFromAddr64(hprocess: Handle, qwaddr: ULong, pdwdisplacement: COpaquePointer?, symbol: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symGetSymFromAddr64((hprocess?.value ?: 0L).toString(), qwaddr.toString(), (pdwdisplacement?.value ?: 0L).toString(), (symbol?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetSymFromName64(hprocess: Handle, name: Pcstr, symbol: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symGetSymFromName64((hprocess?.value ?: 0L).toString(), (name?.value ?: 0L).toString(), (symbol?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetSymNext64(hprocess: Handle, symbol: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symGetSymNext64((hprocess?.value ?: 0L).toString(), (symbol?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetSymPrev64(hprocess: Handle, symbol: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symGetSymPrev64((hprocess?.value ?: 0L).toString(), (symbol?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetSymbolFile(hprocess: Handle, sympath: Pcstr, imagefile: Pcstr, type: UInt, symbolfile: Pstr, csymbolfile: ULong, dbgfile: Pstr, cdbgfile: ULong): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symGetSymbolFile((hprocess?.value ?: 0L).toString(), (sympath?.value ?: 0L).toString(), (imagefile?.value ?: 0L).toString(), type.toInt(), (symbolfile?.value ?: 0L).toString(), csymbolfile.toString(), (dbgfile?.value ?: 0L).toString(), cdbgfile.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetSymbolFileW(hprocess: Handle, sympath: Pcwstr, imagefile: Pcwstr, type: UInt, symbolfile: Pwstr, csymbolfile: ULong, dbgfile: Pwstr, cdbgfile: ULong): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symGetSymbolFileW((hprocess?.value ?: 0L).toString(), (sympath?.value ?: 0L).toString(), (imagefile?.value ?: 0L).toString(), type.toInt(), (symbolfile?.value ?: 0L).toString(), csymbolfile.toString(), (dbgfile?.value ?: 0L).toString(), cdbgfile.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetTypeFromName(hprocess: Handle, baseofdll: ULong, name: Pcstr, symbol: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symGetTypeFromName((hprocess?.value ?: 0L).toString(), baseofdll.toString(), (name?.value ?: 0L).toString(), (symbol?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetTypeFromNameW(hprocess: Handle, baseofdll: ULong, name: Pcwstr, symbol: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symGetTypeFromNameW((hprocess?.value ?: 0L).toString(), baseofdll.toString(), (name?.value ?: 0L).toString(), (symbol?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetTypeInfo(hprocess: Handle, modbase: ULong, typeid: UInt, gettype: ImagehlpSymbolTypeInfo, pinfo: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symGetTypeInfo((hprocess?.value ?: 0L).toString(), modbase.toString(), typeid.toInt(), gettype, (pinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetTypeInfoEx(hprocess: Handle, modbase: ULong, params: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symGetTypeInfoEx((hprocess?.value ?: 0L).toString(), modbase.toString(), (params?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetUnwindInfo(hprocess: Handle, address: ULong, buffer: COpaquePointer?, size: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symGetUnwindInfo((hprocess?.value ?: 0L).toString(), address.toString(), (buffer?.value ?: 0L).toString(), (size?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symInitialize(hprocess: Handle, usersearchpath: Pcstr, finvadeprocess: Bool): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symInitialize((hprocess?.value ?: 0L).toString(), (usersearchpath?.value ?: 0L).toString(), finvadeprocess) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symInitializeW(hprocess: Handle, usersearchpath: Pcwstr, finvadeprocess: Bool): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symInitializeW((hprocess?.value ?: 0L).toString(), (usersearchpath?.value ?: 0L).toString(), finvadeprocess) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symLoadModule64(hprocess: Handle, hfile: Handle, imagename: Pcstr, modulename: Pcstr, baseofdll: ULong, sizeofdll: UInt): ULong =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symLoadModule64((hprocess?.value ?: 0L).toString(), (hfile?.value ?: 0L).toString(), (imagename?.value ?: 0L).toString(), (modulename?.value ?: 0L).toString(), baseofdll.toString(), sizeofdll.toInt()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symLoadModuleEx(hprocess: Handle, hfile: Handle, imagename: Pcstr, modulename: Pcstr, baseofdll: ULong, dllsize: UInt, data: COpaquePointer?, flags: SymLoadFlags): ULong =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symLoadModuleEx((hprocess?.value ?: 0L).toString(), (hfile?.value ?: 0L).toString(), (imagename?.value ?: 0L).toString(), (modulename?.value ?: 0L).toString(), baseofdll.toString(), dllsize.toInt(), (data?.value ?: 0L).toString(), flags.toInt()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symLoadModuleExW(hprocess: Handle, hfile: Handle, imagename: Pcwstr, modulename: Pcwstr, baseofdll: ULong, dllsize: UInt, data: COpaquePointer?, flags: SymLoadFlags): ULong =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symLoadModuleExW((hprocess?.value ?: 0L).toString(), (hfile?.value ?: 0L).toString(), (imagename?.value ?: 0L).toString(), (modulename?.value ?: 0L).toString(), baseofdll.toString(), dllsize.toInt(), (data?.value ?: 0L).toString(), flags.toInt()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symMatchFileName(filename: Pcstr, match: Pcstr, filenamestop: COpaquePointer?, matchstop: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symMatchFileName((filename?.value ?: 0L).toString(), (match?.value ?: 0L).toString(), (filenamestop?.value ?: 0L).toString(), (matchstop?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symMatchFileNameW(filename: Pcwstr, match: Pcwstr, filenamestop: COpaquePointer?, matchstop: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symMatchFileNameW((filename?.value ?: 0L).toString(), (match?.value ?: 0L).toString(), (filenamestop?.value ?: 0L).toString(), (matchstop?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symMatchString(string: Pcstr, expression: Pcstr, fcase: Bool): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symMatchString((string?.value ?: 0L).toString(), (expression?.value ?: 0L).toString(), fcase) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symMatchStringA(string: Pcstr, expression: Pcstr, fcase: Bool): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symMatchStringA((string?.value ?: 0L).toString(), (expression?.value ?: 0L).toString(), fcase) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symMatchStringW(string: Pcwstr, expression: Pcwstr, fcase: Bool): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symMatchStringW((string?.value ?: 0L).toString(), (expression?.value ?: 0L).toString(), fcase) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symNext(hprocess: Handle, si: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symNext((hprocess?.value ?: 0L).toString(), (si?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symNextW(hprocess: Handle, siw: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symNextW((hprocess?.value ?: 0L).toString(), (siw?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symPrev(hprocess: Handle, si: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symPrev((hprocess?.value ?: 0L).toString(), (si?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symPrevW(hprocess: Handle, siw: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symPrevW((hprocess?.value ?: 0L).toString(), (siw?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symQueryInlineTrace(hprocess: Handle, startaddress: ULong, startcontext: UInt, startretaddress: ULong, curaddress: ULong, curcontext: COpaquePointer?, curframeindex: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symQueryInlineTrace((hprocess?.value ?: 0L).toString(), startaddress.toString(), startcontext.toInt(), startretaddress.toString(), curaddress.toString(), (curcontext?.value ?: 0L).toString(), (curframeindex?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symRefreshModuleList(hprocess: Handle): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symRefreshModuleList((hprocess?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symRegisterCallback64(hprocess: Handle, callbackfunction: PsymbolRegisteredCallback64, usercontext: ULong): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symRegisterCallback64((hprocess?.value ?: 0L).toString(), 0L.toString(), usercontext.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symRegisterCallbackW64(hprocess: Handle, callbackfunction: PsymbolRegisteredCallback64, usercontext: ULong): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symRegisterCallbackW64((hprocess?.value ?: 0L).toString(), 0L.toString(), usercontext.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symRegisterFunctionEntryCallback64(hprocess: Handle, callbackfunction: PsymbolFuncentryCallback64, usercontext: ULong): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symRegisterFunctionEntryCallback64((hprocess?.value ?: 0L).toString(), 0L.toString(), usercontext.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSearch(hprocess: Handle, baseofdll: ULong, index: UInt, symtag: UInt, mask: Pcstr, address: ULong, enumsymbolscallback: PsymEnumeratesymbolsCallback, usercontext: COpaquePointer?, options: UInt): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symSearch((hprocess?.value ?: 0L).toString(), baseofdll.toString(), index.toInt(), symtag.toInt(), (mask?.value ?: 0L).toString(), address.toString(), 0L.toString(), (usercontext?.value ?: 0L).toString(), options.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSearchW(hprocess: Handle, baseofdll: ULong, index: UInt, symtag: UInt, mask: Pcwstr, address: ULong, enumsymbolscallback: PsymEnumeratesymbolsCallbackw, usercontext: COpaquePointer?, options: UInt): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symSearchW((hprocess?.value ?: 0L).toString(), baseofdll.toString(), index.toInt(), symtag.toInt(), (mask?.value ?: 0L).toString(), address.toString(), 0L.toString(), (usercontext?.value ?: 0L).toString(), options.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSetContext(hprocess: Handle, stackframe: COpaquePointer?, context: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symSetContext((hprocess?.value ?: 0L).toString(), (stackframe?.value ?: 0L).toString(), (context?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSetExtendedOption(option: ImagehlpExtendedOptions, value: Bool): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symSetExtendedOption(option, value) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSetHomeDirectory(hprocess: Handle, dir: Pcstr): Pstr =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symSetHomeDirectory((hprocess?.value ?: 0L).toString(), (dir?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSetHomeDirectoryW(hprocess: Handle, dir: Pcwstr): Pwstr =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symSetHomeDirectoryW((hprocess?.value ?: 0L).toString(), (dir?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSetOptions(symoptions: UInt): UInt =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symSetOptions(symoptions.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSetParentWindow(hwnd: Hwnd): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symSetParentWindow((hwnd?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSetScopeFromAddr(hprocess: Handle, address: ULong): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symSetScopeFromAddr((hprocess?.value ?: 0L).toString(), address.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSetScopeFromIndex(hprocess: Handle, baseofdll: ULong, index: UInt): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symSetScopeFromIndex((hprocess?.value ?: 0L).toString(), baseofdll.toString(), index.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSetScopeFromInlineContext(hprocess: Handle, address: ULong, inlinecontext: UInt): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symSetScopeFromInlineContext((hprocess?.value ?: 0L).toString(), address.toString(), inlinecontext.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSetSearchPath(hprocess: Handle, searchpatha: Pcstr): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symSetSearchPath((hprocess?.value ?: 0L).toString(), (searchpatha?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSetSearchPathW(hprocess: Handle, searchpatha: Pcwstr): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symSetSearchPathW((hprocess?.value ?: 0L).toString(), (searchpatha?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSrvDeltaName(hprocess: Handle, sympath: Pcstr, type: Pcstr, file1: Pcstr, file2: Pcstr): Pcstr =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symSrvDeltaName((hprocess?.value ?: 0L).toString(), (sympath?.value ?: 0L).toString(), (type?.value ?: 0L).toString(), (file1?.value ?: 0L).toString(), (file2?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSrvDeltaNameW(hprocess: Handle, sympath: Pcwstr, type: Pcwstr, file1: Pcwstr, file2: Pcwstr): Pcwstr =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symSrvDeltaNameW((hprocess?.value ?: 0L).toString(), (sympath?.value ?: 0L).toString(), (type?.value ?: 0L).toString(), (file1?.value ?: 0L).toString(), (file2?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSrvGetFileIndexInfo(file: Pcstr, info: COpaquePointer?, flags: UInt): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symSrvGetFileIndexInfo((file?.value ?: 0L).toString(), (info?.value ?: 0L).toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSrvGetFileIndexInfoW(file: Pcwstr, info: COpaquePointer?, flags: UInt): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symSrvGetFileIndexInfoW((file?.value ?: 0L).toString(), (info?.value ?: 0L).toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSrvGetFileIndexString(hprocess: Handle, srvpath: Pcstr, file: Pcstr, index: Pstr, size: ULong, flags: UInt): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symSrvGetFileIndexString((hprocess?.value ?: 0L).toString(), (srvpath?.value ?: 0L).toString(), (file?.value ?: 0L).toString(), (index?.value ?: 0L).toString(), size.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSrvGetFileIndexStringW(hprocess: Handle, srvpath: Pcwstr, file: Pcwstr, index: Pwstr, size: ULong, flags: UInt): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symSrvGetFileIndexStringW((hprocess?.value ?: 0L).toString(), (srvpath?.value ?: 0L).toString(), (file?.value ?: 0L).toString(), (index?.value ?: 0L).toString(), size.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSrvGetFileIndexes(file: Pcstr, id: COpaquePointer?, val1: COpaquePointer?, val2: COpaquePointer?, flags: UInt): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symSrvGetFileIndexes((file?.value ?: 0L).toString(), (id?.value ?: 0L).toString(), (val1?.value ?: 0L).toString(), (val2?.value ?: 0L).toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSrvGetFileIndexesW(file: Pcwstr, id: COpaquePointer?, val1: COpaquePointer?, val2: COpaquePointer?, flags: UInt): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symSrvGetFileIndexesW((file?.value ?: 0L).toString(), (id?.value ?: 0L).toString(), (val1?.value ?: 0L).toString(), (val2?.value ?: 0L).toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSrvGetSupplement(hprocess: Handle, sympath: Pcstr, node: Pcstr, file: Pcstr): Pcstr =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symSrvGetSupplement((hprocess?.value ?: 0L).toString(), (sympath?.value ?: 0L).toString(), (node?.value ?: 0L).toString(), (file?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSrvGetSupplementW(hprocess: Handle, sympath: Pcwstr, node: Pcwstr, file: Pcwstr): Pcwstr =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symSrvGetSupplementW((hprocess?.value ?: 0L).toString(), (sympath?.value ?: 0L).toString(), (node?.value ?: 0L).toString(), (file?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSrvIsStore(hprocess: Handle, path: Pcstr): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symSrvIsStore((hprocess?.value ?: 0L).toString(), (path?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSrvIsStoreW(hprocess: Handle, path: Pcwstr): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symSrvIsStoreW((hprocess?.value ?: 0L).toString(), (path?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSrvStoreFile(hprocess: Handle, srvpath: Pcstr, file: Pcstr, flags: SymSrvStoreFileFlags): Pcstr =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symSrvStoreFile((hprocess?.value ?: 0L).toString(), (srvpath?.value ?: 0L).toString(), (file?.value ?: 0L).toString(), flags.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSrvStoreFileW(hprocess: Handle, srvpath: Pcwstr, file: Pcwstr, flags: SymSrvStoreFileFlags): Pcwstr =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symSrvStoreFileW((hprocess?.value ?: 0L).toString(), (srvpath?.value ?: 0L).toString(), (file?.value ?: 0L).toString(), flags.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSrvStoreSupplement(hprocess: Handle, srvpath: Pcstr, node: Pcstr, file: Pcstr, flags: UInt): Pcstr =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symSrvStoreSupplement((hprocess?.value ?: 0L).toString(), (srvpath?.value ?: 0L).toString(), (node?.value ?: 0L).toString(), (file?.value ?: 0L).toString(), flags.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSrvStoreSupplementW(hprocess: Handle, sympath: Pcwstr, node: Pcwstr, file: Pcwstr, flags: UInt): Pcwstr =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symSrvStoreSupplementW((hprocess?.value ?: 0L).toString(), (sympath?.value ?: 0L).toString(), (node?.value ?: 0L).toString(), (file?.value ?: 0L).toString(), flags.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symUnDName64(sym: COpaquePointer?, undecname: Pstr, undecnamelength: UInt): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symUnDName64((sym?.value ?: 0L).toString(), (undecname?.value ?: 0L).toString(), undecnamelength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symUnloadModule64(hprocess: Handle, baseofdll: ULong): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_symUnloadModule64((hprocess?.value ?: 0L).toString(), baseofdll.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun terminateProcessOnMemoryExhaustion(failedallocationsize: ULong) {
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) {
        _windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_terminateProcessOnMemoryExhaustion(failedallocationsize.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun touchFileTimes(filehandle: Handle, psystemtime: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_touchFileTimes((filehandle?.value ?: 0L).toString(), (psystemtime?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unDecorateSymbolName(name: Pcstr, outputstring: Pstr, maxstringlength: UInt, flags: UInt): UInt =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_unDecorateSymbolName((name?.value ?: 0L).toString(), (outputstring?.value ?: 0L).toString(), maxstringlength.toInt(), flags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unDecorateSymbolNameW(name: Pcwstr, outputstring: Pwstr, maxstringlength: UInt, flags: UInt): UInt =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_unDecorateSymbolNameW((name?.value ?: 0L).toString(), (outputstring?.value ?: 0L).toString(), maxstringlength.toInt(), flags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unMapAndLoad(loadedimage: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_unMapAndLoad((loadedimage?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unhandledExceptionFilter(exceptioninfo: COpaquePointer?): Int =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_unhandledExceptionFilter((exceptioninfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updateDebugInfoFile(imagefilename: Pcstr, symbolpath: Pcstr, debugfilepath: Pstr, ntheaders: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_updateDebugInfoFile((imagefilename?.value ?: 0L).toString(), (symbolpath?.value ?: 0L).toString(), (debugfilepath?.value ?: 0L).toString(), (ntheaders?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updateDebugInfoFileEx(imagefilename: Pcstr, symbolpath: Pcstr, debugfilepath: Pstr, ntheaders: COpaquePointer?, oldchecksum: UInt): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_updateDebugInfoFileEx((imagefilename?.value ?: 0L).toString(), (symbolpath?.value ?: 0L).toString(), (debugfilepath?.value ?: 0L).toString(), (ntheaders?.value ?: 0L).toString(), oldchecksum.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitForDebugEvent(lpdebugevent: COpaquePointer?, dwmilliseconds: UInt): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_waitForDebugEvent((lpdebugevent?.value ?: 0L).toString(), dwmilliseconds.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitForDebugEventEx(lpdebugevent: COpaquePointer?, dwmilliseconds: UInt): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_waitForDebugEventEx((lpdebugevent?.value ?: 0L).toString(), dwmilliseconds.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wow64GetThreadContext(hthread: Handle, lpcontext: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_wow64GetThreadContext((hthread?.value ?: 0L).toString(), (lpcontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wow64GetThreadSelectorEntry(hthread: Handle, dwselector: UInt, lpselectorentry: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_wow64GetThreadSelectorEntry((hthread?.value ?: 0L).toString(), dwselector.toInt(), (lpselectorentry?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wow64SetThreadContext(hthread: Handle, lpcontext: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_wow64SetThreadContext((hthread?.value ?: 0L).toString(), (lpcontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeProcessMemory(hprocess: Handle, lpbaseaddress: COpaquePointer?, lpbuffer: COpaquePointer?, nsize: ULong, lpnumberofbyteswritten: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsDebugNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugNapiAddon.windowssys_windows_win32_system_diagnostics_debug_writeProcessMemory((hprocess?.value ?: 0L).toString(), (lpbaseaddress?.value ?: 0L).toString(), (lpbuffer?.value ?: 0L).toString(), nsize.toString(), (lpnumberofbyteswritten?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
