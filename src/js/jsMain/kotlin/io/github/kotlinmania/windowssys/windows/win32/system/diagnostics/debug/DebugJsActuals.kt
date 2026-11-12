@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private val windowsWin32SystemDiagnosticsDebugNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun addVectoredContinueHandler(first: UInt, handler: PvectoredExceptionHandler): MutPtr<CVoid> =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) MutPtr((windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugAddVectoredContinueHandler(first.toInt(), 0L.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addVectoredExceptionHandler(first: UInt, handler: PvectoredExceptionHandler): MutPtr<CVoid> =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) MutPtr((windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugAddVectoredExceptionHandler(first.toInt(), 0L.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun beep(dwfreq: UInt, dwduration: UInt): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugBeep(dwfreq.toInt(), dwduration.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bindImage(imagename: Pcstr, dllpath: Pcstr, symbolpath: Pcstr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugBindImage(imagename.rawAddress.toString(), dllpath.rawAddress.toString(), symbolpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bindImageEx(flags: UInt, imagename: Pcstr, dllpath: Pcstr, symbolpath: Pcstr, statusroutine: PimagehlpStatusRoutine): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugBindImageEx(flags.toInt(), imagename.rawAddress.toString(), dllpath.rawAddress.toString(), symbolpath.rawAddress.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun checkRemoteDebuggerPresent(hprocess: Handle, pbdebuggerpresent: MutPtr<Bool>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugCheckRemoteDebuggerPresent(hprocess.rawAddress.toString(), pbdebuggerpresent.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun checkSumMappedFile(baseaddress: ConstPtr<CVoid>, filelength: UInt, headersum: MutPtr<UInt>, checksum: MutPtr<UInt>): MutPtr<ImageNtHeaders64> =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) MutPtr((windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugCheckSumMappedFile(baseaddress.rawAddress.toString(), filelength.toInt(), headersum.rawAddress.toString(), checksum.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeThreadWaitChainSession(wcthandle: ConstPtr<CVoid>) {
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) {
        windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugCloseThreadWaitChainSession(wcthandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun continueDebugEvent(dwprocessid: UInt, dwthreadid: UInt, dwcontinuestatus: Ntstatus): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugContinueDebugEvent(dwprocessid.toInt(), dwthreadid.toInt(), dwcontinuestatus) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyContext(destination: MutPtr<Context>, contextflags: ContextFlags, source: ConstPtr<Context>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugCopyContext(destination.rawAddress.toString(), contextflags.toInt(), source.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dbgHelpCreateUserDump(filename: Pcstr, callback: PdbghelpCreateUserDumpCallback, userdata: ConstPtr<CVoid>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugDbgHelpCreateUserDump(filename.rawAddress.toString(), 0L.toString(), userdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dbgHelpCreateUserDumpW(filename: Pcwstr, callback: PdbghelpCreateUserDumpCallback, userdata: ConstPtr<CVoid>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugDbgHelpCreateUserDumpW(filename.rawAddress.toString(), 0L.toString(), userdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun debugActiveProcess(dwprocessid: UInt): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugDebugActiveProcess(dwprocessid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun debugActiveProcessStop(dwprocessid: UInt): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugDebugActiveProcessStop(dwprocessid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun debugBreak() {
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) {
        windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugDebugBreak()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun debugBreakProcess(process: Handle): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugDebugBreakProcess(process.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun debugSetProcessKillOnExit(killonexit: Bool): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugDebugSetProcessKillOnExit(killonexit) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun decodePointer(ptr: ConstPtr<CVoid>): MutPtr<CVoid> =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) MutPtr((windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugDecodePointer(ptr.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun decodeRemotePointer(processhandle: Handle, ptr: ConstPtr<CVoid>, decodedptr: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugDecodeRemotePointer(processhandle.rawAddress.toString(), ptr.rawAddress.toString(), decodedptr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun decodeSystemPointer(ptr: ConstPtr<CVoid>): MutPtr<CVoid> =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) MutPtr((windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugDecodeSystemPointer(ptr.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun encodePointer(ptr: ConstPtr<CVoid>): MutPtr<CVoid> =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) MutPtr((windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugEncodePointer(ptr.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun encodeRemotePointer(processhandle: Handle, ptr: ConstPtr<CVoid>, encodedptr: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugEncodeRemotePointer(processhandle.rawAddress.toString(), ptr.rawAddress.toString(), encodedptr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun encodeSystemPointer(ptr: ConstPtr<CVoid>): MutPtr<CVoid> =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) MutPtr((windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugEncodeSystemPointer(ptr.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumDirTree(hprocess: Handle, rootpath: Pcstr, inputpathname: Pcstr, outputpathbuffer: Pstr, cb: PenumdirtreeCallback, data: ConstPtr<CVoid>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugEnumDirTree(hprocess.rawAddress.toString(), rootpath.rawAddress.toString(), inputpathname.rawAddress.toString(), outputpathbuffer.rawAddress.toString(), 0L.toString(), data.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumDirTreeW(hprocess: Handle, rootpath: Pcwstr, inputpathname: Pcwstr, outputpathbuffer: Pwstr, cb: PenumdirtreeCallbackw, data: ConstPtr<CVoid>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugEnumDirTreeW(hprocess.rawAddress.toString(), rootpath.rawAddress.toString(), inputpathname.rawAddress.toString(), outputpathbuffer.rawAddress.toString(), 0L.toString(), data.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumerateLoadedModules64(hprocess: Handle, enumloadedmodulescallback: PenumloadedModulesCallback64, usercontext: ConstPtr<CVoid>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugEnumerateLoadedModules64(hprocess.rawAddress.toString(), 0L.toString(), usercontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumerateLoadedModulesEx(hprocess: Handle, enumloadedmodulescallback: PenumloadedModulesCallback64, usercontext: ConstPtr<CVoid>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugEnumerateLoadedModulesEx(hprocess.rawAddress.toString(), 0L.toString(), usercontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumerateLoadedModulesExW(hprocess: Handle, enumloadedmodulescallback: PenumloadedModulesCallbackw64, usercontext: ConstPtr<CVoid>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugEnumerateLoadedModulesExW(hprocess.rawAddress.toString(), 0L.toString(), usercontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumerateLoadedModulesW64(hprocess: Handle, enumloadedmodulescallback: PenumloadedModulesCallbackw64, usercontext: ConstPtr<CVoid>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugEnumerateLoadedModulesW64(hprocess.rawAddress.toString(), 0L.toString(), usercontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fatalAppExitA(uaction: UInt, lpmessagetext: Pcstr) {
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) {
        windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugFatalAppExitA(uaction.toInt(), lpmessagetext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fatalAppExitW(uaction: UInt, lpmessagetext: Pcwstr) {
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) {
        windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugFatalAppExitW(uaction.toInt(), lpmessagetext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fatalExit(exitcode: Int): Nothing {
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) {
        windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugFatalExit(exitcode)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function fatalExit")
}

public actual fun findDebugInfoFile(filename: Pcstr, symbolpath: Pcstr, debugfilepath: Pstr): Handle =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) MutPtr((windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugFindDebugInfoFile(filename.rawAddress.toString(), symbolpath.rawAddress.toString(), debugfilepath.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findDebugInfoFileEx(filename: Pcstr, symbolpath: Pcstr, debugfilepath: Pstr, callback: PfindDebugFileCallback, callerdata: ConstPtr<CVoid>): Handle =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) MutPtr((windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugFindDebugInfoFileEx(filename.rawAddress.toString(), symbolpath.rawAddress.toString(), debugfilepath.rawAddress.toString(), 0L.toString(), callerdata.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findDebugInfoFileExW(filename: Pcwstr, symbolpath: Pcwstr, debugfilepath: Pwstr, callback: PfindDebugFileCallbackw, callerdata: ConstPtr<CVoid>): Handle =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) MutPtr((windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugFindDebugInfoFileExW(filename.rawAddress.toString(), symbolpath.rawAddress.toString(), debugfilepath.rawAddress.toString(), 0L.toString(), callerdata.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findExecutableImage(filename: Pcstr, symbolpath: Pcstr, imagefilepath: Pstr): Handle =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) MutPtr((windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugFindExecutableImage(filename.rawAddress.toString(), symbolpath.rawAddress.toString(), imagefilepath.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findExecutableImageEx(filename: Pcstr, symbolpath: Pcstr, imagefilepath: Pstr, callback: PfindExeFileCallback, callerdata: ConstPtr<CVoid>): Handle =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) MutPtr((windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugFindExecutableImageEx(filename.rawAddress.toString(), symbolpath.rawAddress.toString(), imagefilepath.rawAddress.toString(), 0L.toString(), callerdata.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findExecutableImageExW(filename: Pcwstr, symbolpath: Pcwstr, imagefilepath: Pwstr, callback: PfindExeFileCallbackw, callerdata: ConstPtr<CVoid>): Handle =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) MutPtr((windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugFindExecutableImageExW(filename.rawAddress.toString(), symbolpath.rawAddress.toString(), imagefilepath.rawAddress.toString(), 0L.toString(), callerdata.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFileInPath(hprocess: Handle, searchpatha: Pcstr, filename: Pcstr, id: ConstPtr<CVoid>, two: UInt, three: UInt, flags: UInt, filepath: Pstr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugFindFileInPath(hprocess.rawAddress.toString(), searchpatha.rawAddress.toString(), filename.rawAddress.toString(), id.rawAddress.toString(), two.toInt(), three.toInt(), flags.toInt(), filepath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFileInSearchPath(hprocess: Handle, searchpatha: Pcstr, filename: Pcstr, one: UInt, two: UInt, three: UInt, filepath: Pstr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugFindFileInSearchPath(hprocess.rawAddress.toString(), searchpatha.rawAddress.toString(), filename.rawAddress.toString(), one.toInt(), two.toInt(), three.toInt(), filepath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flushInstructionCache(hprocess: Handle, lpbaseaddress: ConstPtr<CVoid>, dwsize: ULong): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugFlushInstructionCache(hprocess.rawAddress.toString(), lpbaseaddress.rawAddress.toString(), dwsize.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun formatMessageA(dwflags: FormatMessageOptions, lpsource: ConstPtr<CVoid>, dwmessageid: UInt, dwlanguageid: UInt, lpbuffer: Pstr, nsize: UInt, arguments: ConstPtr<ConstPtr<Byte>>): UInt =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugFormatMessageA(dwflags.toInt(), lpsource.rawAddress.toString(), dwmessageid.toInt(), dwlanguageid.toInt(), lpbuffer.rawAddress.toString(), nsize.toInt(), arguments.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun formatMessageW(dwflags: FormatMessageOptions, lpsource: ConstPtr<CVoid>, dwmessageid: UInt, dwlanguageid: UInt, lpbuffer: Pwstr, nsize: UInt, arguments: ConstPtr<ConstPtr<Byte>>): UInt =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugFormatMessageW(dwflags.toInt(), lpsource.rawAddress.toString(), dwmessageid.toInt(), dwlanguageid.toInt(), lpbuffer.rawAddress.toString(), nsize.toInt(), arguments.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getEnabledXStateFeatures(): ULong =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugGetEnabledXStateFeatures() as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getErrorMode(): UInt =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugGetErrorMode() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getImageConfigInformation(loadedimage: ConstPtr<LoadedImage>, imageconfiginformation: MutPtr<ImageLoadConfigDirectory64>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugGetImageConfigInformation(loadedimage.rawAddress.toString(), imageconfiginformation.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getImageUnusedHeaderBytes(loadedimage: ConstPtr<LoadedImage>, sizeunusedheaderbytes: MutPtr<UInt>): UInt =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugGetImageUnusedHeaderBytes(loadedimage.rawAddress.toString(), sizeunusedheaderbytes.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSymLoadError(): UInt =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugGetSymLoadError() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThreadContext(hthread: Handle, lpcontext: MutPtr<Context>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugGetThreadContext(hthread.rawAddress.toString(), lpcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThreadErrorMode(): UInt =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugGetThreadErrorMode() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThreadSelectorEntry(hthread: Handle, dwselector: UInt, lpselectorentry: MutPtr<LdtEntry>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugGetThreadSelectorEntry(hthread.rawAddress.toString(), dwselector.toInt(), lpselectorentry.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThreadWaitChain(wcthandle: ConstPtr<CVoid>, context: ULong, flags: WaitChainThreadOptions, threadid: UInt, nodecount: MutPtr<UInt>, nodeinfoarray: MutPtr<WaitchainNodeInfo>, iscycle: MutPtr<Bool>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugGetThreadWaitChain(wcthandle.rawAddress.toString(), context.toString(), flags.toInt(), threadid.toInt(), nodecount.rawAddress.toString(), nodeinfoarray.rawAddress.toString(), iscycle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTimestampForLoadedLibrary(module: Hmodule): UInt =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugGetTimestampForLoadedLibrary(module.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getXStateFeaturesMask(context: ConstPtr<Context>, featuremask: MutPtr<ULong>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugGetXStateFeaturesMask(context.rawAddress.toString(), featuremask.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageAddCertificate(filehandle: Handle, certificate: ConstPtr<WinCertificate>, index: MutPtr<UInt>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugImageAddCertificate(filehandle.rawAddress.toString(), certificate.rawAddress.toString(), index.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageDirectoryEntryToData(base: ConstPtr<CVoid>, mappedasimage: Boolean, directoryentry: ImageDirectoryEntry, size: MutPtr<UInt>): MutPtr<CVoid> =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) MutPtr((windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugImageDirectoryEntryToData(base.rawAddress.toString(), mappedasimage, directoryentry.toInt(), size.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageDirectoryEntryToDataEx(base: ConstPtr<CVoid>, mappedasimage: Boolean, directoryentry: ImageDirectoryEntry, size: MutPtr<UInt>, foundheader: MutPtr<MutPtr<ImageSectionHeader>>): MutPtr<CVoid> =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) MutPtr((windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugImageDirectoryEntryToDataEx(base.rawAddress.toString(), mappedasimage, directoryentry.toInt(), size.rawAddress.toString(), foundheader.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageEnumerateCertificates(filehandle: Handle, typefilter: UShort, certificatecount: MutPtr<UInt>, indices: MutPtr<UInt>, indexcount: UInt): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugImageEnumerateCertificates(filehandle.rawAddress.toString(), typefilter.toInt(), certificatecount.rawAddress.toString(), indices.rawAddress.toString(), indexcount.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageGetCertificateData(filehandle: Handle, certificateindex: UInt, certificate: MutPtr<WinCertificate>, requiredlength: MutPtr<UInt>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugImageGetCertificateData(filehandle.rawAddress.toString(), certificateindex.toInt(), certificate.rawAddress.toString(), requiredlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageGetCertificateHeader(filehandle: Handle, certificateindex: UInt, certificateheader: MutPtr<WinCertificate>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugImageGetCertificateHeader(filehandle.rawAddress.toString(), certificateindex.toInt(), certificateheader.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageGetDigestStream(filehandle: Handle, digestlevel: UInt, digestfunction: DigestFunction, digesthandle: ConstPtr<CVoid>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugImageGetDigestStream(filehandle.rawAddress.toString(), digestlevel.toInt(), 0L.toString(), digesthandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageLoad(dllname: Pcstr, dllpath: Pcstr): MutPtr<LoadedImage> =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) MutPtr((windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugImageLoad(dllname.rawAddress.toString(), dllpath.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageNtHeader(base: ConstPtr<CVoid>): MutPtr<ImageNtHeaders64> =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) MutPtr((windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugImageNtHeader(base.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageRemoveCertificate(filehandle: Handle, index: UInt): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugImageRemoveCertificate(filehandle.rawAddress.toString(), index.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageRvaToSection(ntheaders: ConstPtr<ImageNtHeaders64>, base: ConstPtr<CVoid>, rva: UInt): MutPtr<ImageSectionHeader> =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) MutPtr((windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugImageRvaToSection(ntheaders.rawAddress.toString(), base.rawAddress.toString(), rva.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageRvaToVa(ntheaders: ConstPtr<ImageNtHeaders64>, base: ConstPtr<CVoid>, rva: UInt, lastrvasection: ConstPtr<ConstPtr<ImageSectionHeader>>): MutPtr<CVoid> =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) MutPtr((windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugImageRvaToVa(ntheaders.rawAddress.toString(), base.rawAddress.toString(), rva.toInt(), lastrvasection.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageUnload(loadedimage: MutPtr<LoadedImage>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugImageUnload(loadedimage.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imagehlpApiVersion(): MutPtr<ApiVersion> =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) MutPtr((windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugImagehlpApiVersion() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imagehlpApiVersionEx(appversion: ConstPtr<ApiVersion>): MutPtr<ApiVersion> =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) MutPtr((windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugImagehlpApiVersionEx(appversion.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initializeContext(buffer: MutPtr<CVoid>, contextflags: ContextFlags, context: MutPtr<MutPtr<Context>>, contextlength: MutPtr<UInt>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugInitializeContext(buffer.rawAddress.toString(), contextflags.toInt(), context.rawAddress.toString(), contextlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initializeContext2(buffer: MutPtr<CVoid>, contextflags: ContextFlags, context: MutPtr<MutPtr<Context>>, contextlength: MutPtr<UInt>, xstatecompactionmask: ULong): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugInitializeContext2(buffer.rawAddress.toString(), contextflags.toInt(), context.rawAddress.toString(), contextlength.rawAddress.toString(), xstatecompactionmask.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isDebuggerPresent(): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugIsDebuggerPresent() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun locateXStateFeature(context: ConstPtr<Context>, featureid: UInt, length: MutPtr<UInt>): MutPtr<CVoid> =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) MutPtr((windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugLocateXStateFeature(context.rawAddress.toString(), featureid.toInt(), length.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun makeSureDirectoryPathExists(dirpath: Pcstr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugMakeSureDirectoryPathExists(dirpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mapAndLoad(imagename: Pcstr, dllpath: Pcstr, loadedimage: MutPtr<LoadedImage>, dotdll: Bool, readonly: Bool): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugMapAndLoad(imagename.rawAddress.toString(), dllpath.rawAddress.toString(), loadedimage.rawAddress.toString(), dotdll, readonly) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mapFileAndCheckSumA(filename: Pcstr, headersum: MutPtr<UInt>, checksum: MutPtr<UInt>): UInt =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugMapFileAndCheckSumA(filename.rawAddress.toString(), headersum.rawAddress.toString(), checksum.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mapFileAndCheckSumW(filename: Pcwstr, headersum: MutPtr<UInt>, checksum: MutPtr<UInt>): UInt =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugMapFileAndCheckSumW(filename.rawAddress.toString(), headersum.rawAddress.toString(), checksum.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun messageBeep(utype: MessageboxStyle): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugMessageBeep(utype.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun miniDumpReadDumpStream(baseofdump: ConstPtr<CVoid>, streamnumber: UInt, dir: MutPtr<MutPtr<MinidumpDirectory>>, streampointer: MutPtr<MutPtr<CVoid>>, streamsize: MutPtr<UInt>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugMiniDumpReadDumpStream(baseofdump.rawAddress.toString(), streamnumber.toInt(), dir.rawAddress.toString(), streampointer.rawAddress.toString(), streamsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun miniDumpWriteDump(hprocess: Handle, processid: UInt, hfile: Handle, dumptype: MinidumpType, exceptionparam: ConstPtr<MinidumpExceptionInformation>, userstreamparam: ConstPtr<MinidumpUserStreamInformation>, callbackparam: ConstPtr<MinidumpCallbackInformation>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugMiniDumpWriteDump(hprocess.rawAddress.toString(), processid.toInt(), hfile.rawAddress.toString(), dumptype, exceptionparam.rawAddress.toString(), userstreamparam.rawAddress.toString(), callbackparam.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openThreadWaitChainSession(flags: OpenThreadWaitChainSessionFlags, callback: Pwaitchaincallback): MutPtr<CVoid> =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) MutPtr((windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugOpenThreadWaitChainSession(flags.toInt(), 0L.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun outputDebugStringA(lpoutputstring: Pcstr) {
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) {
        windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugOutputDebugStringA(lpoutputstring.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun outputDebugStringW(lpoutputstring: Pcwstr) {
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) {
        windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugOutputDebugStringW(lpoutputstring.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun raiseException(dwexceptioncode: UInt, dwexceptionflags: UInt, nnumberofarguments: UInt, lparguments: ConstPtr<ULong>) {
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) {
        windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugRaiseException(dwexceptioncode.toInt(), dwexceptionflags.toInt(), nnumberofarguments.toInt(), lparguments.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun raiseFailFastException(pexceptionrecord: ConstPtr<ExceptionRecord>, pcontextrecord: ConstPtr<Context>, dwflags: UInt) {
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) {
        windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugRaiseFailFastException(pexceptionrecord.rawAddress.toString(), pcontextrecord.rawAddress.toString(), dwflags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rangeMapAddPeImageSections(rmaphandle: ConstPtr<CVoid>, imagename: Pcwstr, mappedimage: ConstPtr<CVoid>, mappingbytes: UInt, imagebase: ULong, usertag: ULong, mappingflags: UInt): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugRangeMapAddPeImageSections(rmaphandle.rawAddress.toString(), imagename.rawAddress.toString(), mappedimage.rawAddress.toString(), mappingbytes.toInt(), imagebase.toString(), usertag.toString(), mappingflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rangeMapCreate(): MutPtr<CVoid> =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) MutPtr((windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugRangeMapCreate() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rangeMapFree(rmaphandle: ConstPtr<CVoid>) {
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) {
        windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugRangeMapFree(rmaphandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rangeMapRead(rmaphandle: ConstPtr<CVoid>, offset: ULong, buffer: MutPtr<CVoid>, requestbytes: UInt, flags: UInt, donebytes: MutPtr<UInt>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugRangeMapRead(rmaphandle.rawAddress.toString(), offset.toString(), buffer.rawAddress.toString(), requestbytes.toInt(), flags.toInt(), donebytes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rangeMapRemove(rmaphandle: ConstPtr<CVoid>, usertag: ULong): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugRangeMapRemove(rmaphandle.rawAddress.toString(), usertag.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rangeMapWrite(rmaphandle: ConstPtr<CVoid>, offset: ULong, buffer: ConstPtr<CVoid>, requestbytes: UInt, flags: UInt, donebytes: MutPtr<UInt>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugRangeMapWrite(rmaphandle.rawAddress.toString(), offset.toString(), buffer.rawAddress.toString(), requestbytes.toInt(), flags.toInt(), donebytes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reBaseImage(currentimagename: Pcstr, symbolpath: Pcstr, frebase: Bool, frebasesysfileok: Bool, fgoingdown: Bool, checkimagesize: UInt, oldimagesize: MutPtr<UInt>, oldimagebase: MutPtr<ULong>, newimagesize: MutPtr<UInt>, newimagebase: MutPtr<ULong>, timestamp: UInt): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugReBaseImage(currentimagename.rawAddress.toString(), symbolpath.rawAddress.toString(), frebase, frebasesysfileok, fgoingdown, checkimagesize.toInt(), oldimagesize.rawAddress.toString(), oldimagebase.rawAddress.toString(), newimagesize.rawAddress.toString(), newimagebase.rawAddress.toString(), timestamp.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reBaseImage64(currentimagename: Pcstr, symbolpath: Pcstr, frebase: Bool, frebasesysfileok: Bool, fgoingdown: Bool, checkimagesize: UInt, oldimagesize: MutPtr<UInt>, oldimagebase: MutPtr<ULong>, newimagesize: MutPtr<UInt>, newimagebase: MutPtr<ULong>, timestamp: UInt): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugReBaseImage64(currentimagename.rawAddress.toString(), symbolpath.rawAddress.toString(), frebase, frebasesysfileok, fgoingdown, checkimagesize.toInt(), oldimagesize.rawAddress.toString(), oldimagebase.rawAddress.toString(), newimagesize.rawAddress.toString(), newimagebase.rawAddress.toString(), timestamp.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readProcessMemory(hprocess: Handle, lpbaseaddress: ConstPtr<CVoid>, lpbuffer: MutPtr<CVoid>, nsize: ULong, lpnumberofbytesread: MutPtr<ULong>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugReadProcessMemory(hprocess.rawAddress.toString(), lpbaseaddress.rawAddress.toString(), lpbuffer.rawAddress.toString(), nsize.toString(), lpnumberofbytesread.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerWaitChainCOMCallback(callstatecallback: Pcogetcallstate, activationstatecallback: Pcogetactivationstate) {
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) {
        windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugRegisterWaitChainCOMCallback(0L.toString(), 0L.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun removeInvalidModuleList(hprocess: Handle) {
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) {
        windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugRemoveInvalidModuleList(hprocess.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun removeVectoredContinueHandler(handle: ConstPtr<CVoid>): UInt =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugRemoveVectoredContinueHandler(handle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeVectoredExceptionHandler(handle: ConstPtr<CVoid>): UInt =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugRemoveVectoredExceptionHandler(handle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reportSymbolLoadSummary(hprocess: Handle, ploadmodule: Pcwstr, psymboldata: ConstPtr<DbghelpDataReportStruct>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugReportSymbolLoadSummary(hprocess.rawAddress.toString(), ploadmodule.rawAddress.toString(), psymboldata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlAddFunctionTable(functiontable: ConstPtr<ImageRuntimeFunctionEntry>, entrycount: UInt, baseaddress: ULong): Boolean =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugRtlAddFunctionTable(functiontable.rawAddress.toString(), entrycount.toInt(), baseaddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlAddGrowableFunctionTable(dynamictable: MutPtr<MutPtr<CVoid>>, functiontable: ConstPtr<ImageRuntimeFunctionEntry>, entrycount: UInt, maximumentrycount: UInt, rangebase: ULong, rangeend: ULong): UInt =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugRtlAddGrowableFunctionTable(dynamictable.rawAddress.toString(), functiontable.rawAddress.toString(), entrycount.toInt(), maximumentrycount.toInt(), rangebase.toString(), rangeend.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlCaptureContext(contextrecord: MutPtr<Context>) {
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) {
        windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugRtlCaptureContext(contextrecord.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlCaptureContext2(contextrecord: MutPtr<Context>) {
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) {
        windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugRtlCaptureContext2(contextrecord.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlCaptureStackBackTrace(framestoskip: UInt, framestocapture: UInt, backtrace: MutPtr<MutPtr<CVoid>>, backtracehash: MutPtr<UInt>): UShort =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugRtlCaptureStackBackTrace(framestoskip.toInt(), framestocapture.toInt(), backtrace.rawAddress.toString(), backtracehash.rawAddress.toString()) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlDeleteFunctionTable(functiontable: ConstPtr<ImageRuntimeFunctionEntry>): Boolean =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugRtlDeleteFunctionTable(functiontable.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlDeleteGrowableFunctionTable(dynamictable: ConstPtr<CVoid>) {
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) {
        windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugRtlDeleteGrowableFunctionTable(dynamictable.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlGrowFunctionTable(dynamictable: MutPtr<CVoid>, newentrycount: UInt) {
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) {
        windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugRtlGrowFunctionTable(dynamictable.rawAddress.toString(), newentrycount.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlInstallFunctionTableCallback(tableidentifier: ULong, baseaddress: ULong, length: UInt, callback: PgetRuntimeFunctionCallback, context: ConstPtr<CVoid>, outofprocesscallbackdll: Pcwstr): Boolean =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugRtlInstallFunctionTableCallback(tableidentifier.toString(), baseaddress.toString(), length.toInt(), 0L.toString(), context.rawAddress.toString(), outofprocesscallbackdll.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlLookupFunctionEntry(controlpc: ULong, imagebase: MutPtr<ULong>, historytable: MutPtr<UnwindHistoryTable>): MutPtr<ImageRuntimeFunctionEntry> =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) MutPtr((windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugRtlLookupFunctionEntry(controlpc.toString(), imagebase.rawAddress.toString(), historytable.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlPcToFileHeader(pcvalue: ConstPtr<CVoid>, baseofimage: MutPtr<MutPtr<CVoid>>): MutPtr<CVoid> =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) MutPtr((windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugRtlPcToFileHeader(pcvalue.rawAddress.toString(), baseofimage.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlRaiseException(exceptionrecord: ConstPtr<ExceptionRecord>) {
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) {
        windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugRtlRaiseException(exceptionrecord.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlRestoreContext(contextrecord: ConstPtr<Context>, exceptionrecord: ConstPtr<ExceptionRecord>) {
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) {
        windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugRtlRestoreContext(contextrecord.rawAddress.toString(), exceptionrecord.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlUnwind(targetframe: ConstPtr<CVoid>, targetip: ConstPtr<CVoid>, exceptionrecord: ConstPtr<ExceptionRecord>, returnvalue: ConstPtr<CVoid>) {
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) {
        windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugRtlUnwind(targetframe.rawAddress.toString(), targetip.rawAddress.toString(), exceptionrecord.rawAddress.toString(), returnvalue.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlUnwindEx(targetframe: ConstPtr<CVoid>, targetip: ConstPtr<CVoid>, exceptionrecord: ConstPtr<ExceptionRecord>, returnvalue: ConstPtr<CVoid>, contextrecord: ConstPtr<Context>, historytable: ConstPtr<UnwindHistoryTable>) {
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) {
        windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugRtlUnwindEx(targetframe.rawAddress.toString(), targetip.rawAddress.toString(), exceptionrecord.rawAddress.toString(), returnvalue.rawAddress.toString(), contextrecord.rawAddress.toString(), historytable.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlVirtualUnwind(handlertype: RtlVirtualUnwindHandlerType, imagebase: ULong, controlpc: ULong, functionentry: ConstPtr<ImageRuntimeFunctionEntry>, contextrecord: MutPtr<Context>, handlerdata: MutPtr<MutPtr<CVoid>>, establisherframe: MutPtr<ULong>, contextpointers: MutPtr<KnonvolatileContextPointers>): ExceptionRoutine =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) null else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun searchTreeForFile(rootpath: Pcstr, inputpathname: Pcstr, outputpathbuffer: Pstr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSearchTreeForFile(rootpath.rawAddress.toString(), inputpathname.rawAddress.toString(), outputpathbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun searchTreeForFileW(rootpath: Pcwstr, inputpathname: Pcwstr, outputpathbuffer: Pwstr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSearchTreeForFileW(rootpath.rawAddress.toString(), inputpathname.rawAddress.toString(), outputpathbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCheckUserInterruptShared(lpstartaddress: LpcallBackUserInterruptRoutine) {
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) {
        windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSetCheckUserInterruptShared(0L.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setErrorMode(umode: ThreadErrorMode): ThreadErrorMode =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSetErrorMode(umode.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setImageConfigInformation(loadedimage: MutPtr<LoadedImage>, imageconfiginformation: ConstPtr<ImageLoadConfigDirectory64>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSetImageConfigInformation(loadedimage.rawAddress.toString(), imageconfiginformation.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSymLoadError(error: UInt) {
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) {
        windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSetSymLoadError(error.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setThreadContext(hthread: Handle, lpcontext: ConstPtr<Context>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSetThreadContext(hthread.rawAddress.toString(), lpcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThreadErrorMode(dwnewmode: ThreadErrorMode, lpoldmode: MutPtr<ThreadErrorMode>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSetThreadErrorMode(dwnewmode.toInt(), lpoldmode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setUnhandledExceptionFilter(lptoplevelexceptionfilter: LptopLevelExceptionFilter): LptopLevelExceptionFilter =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) null else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setXStateFeaturesMask(context: MutPtr<Context>, featuremask: ULong): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSetXStateFeaturesMask(context.rawAddress.toString(), featuremask.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stackWalk2(machinetype: UInt, hprocess: Handle, hthread: Handle, stackframe: MutPtr<StackframeEx>, contextrecord: MutPtr<CVoid>, readmemoryroutine: PreadProcessMemoryRoutine64, functiontableaccessroutine: PfunctionTableAccessRoutine64, getmodulebaseroutine: PgetModuleBaseRoutine64, translateaddress: PtranslateAddressRoutine64, gettargetattributevalue: PgetTargetAttributeValue64, flags: UInt): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugStackWalk2(machinetype.toInt(), hprocess.rawAddress.toString(), hthread.rawAddress.toString(), stackframe.rawAddress.toString(), contextrecord.rawAddress.toString(), 0L.toString(), 0L.toString(), 0L.toString(), 0L.toString(), 0L.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stackWalk64(machinetype: UInt, hprocess: Handle, hthread: Handle, stackframe: MutPtr<Stackframe64>, contextrecord: MutPtr<CVoid>, readmemoryroutine: PreadProcessMemoryRoutine64, functiontableaccessroutine: PfunctionTableAccessRoutine64, getmodulebaseroutine: PgetModuleBaseRoutine64, translateaddress: PtranslateAddressRoutine64): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugStackWalk64(machinetype.toInt(), hprocess.rawAddress.toString(), hthread.rawAddress.toString(), stackframe.rawAddress.toString(), contextrecord.rawAddress.toString(), 0L.toString(), 0L.toString(), 0L.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stackWalkEx(machinetype: UInt, hprocess: Handle, hthread: Handle, stackframe: MutPtr<StackframeEx>, contextrecord: MutPtr<CVoid>, readmemoryroutine: PreadProcessMemoryRoutine64, functiontableaccessroutine: PfunctionTableAccessRoutine64, getmodulebaseroutine: PgetModuleBaseRoutine64, translateaddress: PtranslateAddressRoutine64, flags: UInt): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugStackWalkEx(machinetype.toInt(), hprocess.rawAddress.toString(), hthread.rawAddress.toString(), stackframe.rawAddress.toString(), contextrecord.rawAddress.toString(), 0L.toString(), 0L.toString(), 0L.toString(), 0L.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symAddSourceStream(hprocess: Handle, base: ULong, streamfile: Pcstr, buffer: ConstPtr<UByte>, size: ULong): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymAddSourceStream(hprocess.rawAddress.toString(), base.toString(), streamfile.rawAddress.toString(), buffer.rawAddress.toString(), size.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symAddSourceStreamA(hprocess: Handle, base: ULong, streamfile: Pcstr, buffer: ConstPtr<UByte>, size: ULong): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymAddSourceStreamA(hprocess.rawAddress.toString(), base.toString(), streamfile.rawAddress.toString(), buffer.rawAddress.toString(), size.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symAddSourceStreamW(hprocess: Handle, base: ULong, filespec: Pcwstr, buffer: ConstPtr<UByte>, size: ULong): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymAddSourceStreamW(hprocess.rawAddress.toString(), base.toString(), filespec.rawAddress.toString(), buffer.rawAddress.toString(), size.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symAddSymbol(hprocess: Handle, baseofdll: ULong, name: Pcstr, address: ULong, size: UInt, flags: UInt): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymAddSymbol(hprocess.rawAddress.toString(), baseofdll.toString(), name.rawAddress.toString(), address.toString(), size.toInt(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symAddSymbolW(hprocess: Handle, baseofdll: ULong, name: Pcwstr, address: ULong, size: UInt, flags: UInt): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymAddSymbolW(hprocess.rawAddress.toString(), baseofdll.toString(), name.rawAddress.toString(), address.toString(), size.toInt(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symAddrIncludeInlineTrace(hprocess: Handle, address: ULong): UInt =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymAddrIncludeInlineTrace(hprocess.rawAddress.toString(), address.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symCleanup(hprocess: Handle): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymCleanup(hprocess.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symCompareInlineTrace(hprocess: Handle, address1: ULong, inlinecontext1: UInt, retaddress1: ULong, address2: ULong, retaddress2: ULong): UInt =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymCompareInlineTrace(hprocess.rawAddress.toString(), address1.toString(), inlinecontext1.toInt(), retaddress1.toString(), address2.toString(), retaddress2.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symDeleteSymbol(hprocess: Handle, baseofdll: ULong, name: Pcstr, address: ULong, flags: UInt): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymDeleteSymbol(hprocess.rawAddress.toString(), baseofdll.toString(), name.rawAddress.toString(), address.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symDeleteSymbolW(hprocess: Handle, baseofdll: ULong, name: Pcwstr, address: ULong, flags: UInt): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymDeleteSymbolW(hprocess.rawAddress.toString(), baseofdll.toString(), name.rawAddress.toString(), address.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symEnumLines(hprocess: Handle, base: ULong, obj: Pcstr, file: Pcstr, enumlinescallback: PsymEnumlinesCallback, usercontext: ConstPtr<CVoid>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymEnumLines(hprocess.rawAddress.toString(), base.toString(), obj.rawAddress.toString(), file.rawAddress.toString(), 0L.toString(), usercontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symEnumLinesW(hprocess: Handle, base: ULong, obj: Pcwstr, file: Pcwstr, enumlinescallback: PsymEnumlinesCallbackw, usercontext: ConstPtr<CVoid>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymEnumLinesW(hprocess.rawAddress.toString(), base.toString(), obj.rawAddress.toString(), file.rawAddress.toString(), 0L.toString(), usercontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symEnumProcesses(enumprocessescallback: PsymEnumprocessesCallback, usercontext: ConstPtr<CVoid>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymEnumProcesses(0L.toString(), usercontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symEnumSourceFileTokens(hprocess: Handle, base: ULong, callback: Penumsourcefiletokenscallback): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSourceFileTokens(hprocess.rawAddress.toString(), base.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symEnumSourceFiles(hprocess: Handle, modbase: ULong, mask: Pcstr, cbsrcfiles: PsymEnumsourcefilesCallback, usercontext: ConstPtr<CVoid>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSourceFiles(hprocess.rawAddress.toString(), modbase.toString(), mask.rawAddress.toString(), 0L.toString(), usercontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symEnumSourceFilesW(hprocess: Handle, modbase: ULong, mask: Pcwstr, cbsrcfiles: PsymEnumsourcefilesCallbackw, usercontext: ConstPtr<CVoid>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSourceFilesW(hprocess.rawAddress.toString(), modbase.toString(), mask.rawAddress.toString(), 0L.toString(), usercontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symEnumSourceLines(hprocess: Handle, base: ULong, obj: Pcstr, file: Pcstr, line: UInt, flags: UInt, enumlinescallback: PsymEnumlinesCallback, usercontext: ConstPtr<CVoid>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSourceLines(hprocess.rawAddress.toString(), base.toString(), obj.rawAddress.toString(), file.rawAddress.toString(), line.toInt(), flags.toInt(), 0L.toString(), usercontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symEnumSourceLinesW(hprocess: Handle, base: ULong, obj: Pcwstr, file: Pcwstr, line: UInt, flags: UInt, enumlinescallback: PsymEnumlinesCallbackw, usercontext: ConstPtr<CVoid>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSourceLinesW(hprocess.rawAddress.toString(), base.toString(), obj.rawAddress.toString(), file.rawAddress.toString(), line.toInt(), flags.toInt(), 0L.toString(), usercontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symEnumSym(hprocess: Handle, baseofdll: ULong, enumsymbolscallback: PsymEnumeratesymbolsCallback, usercontext: ConstPtr<CVoid>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSym(hprocess.rawAddress.toString(), baseofdll.toString(), 0L.toString(), usercontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symEnumSymbols(hprocess: Handle, baseofdll: ULong, mask: Pcstr, enumsymbolscallback: PsymEnumeratesymbolsCallback, usercontext: ConstPtr<CVoid>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSymbols(hprocess.rawAddress.toString(), baseofdll.toString(), mask.rawAddress.toString(), 0L.toString(), usercontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symEnumSymbolsEx(hprocess: Handle, baseofdll: ULong, mask: Pcstr, enumsymbolscallback: PsymEnumeratesymbolsCallback, usercontext: ConstPtr<CVoid>, options: UInt): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSymbolsEx(hprocess.rawAddress.toString(), baseofdll.toString(), mask.rawAddress.toString(), 0L.toString(), usercontext.rawAddress.toString(), options.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symEnumSymbolsExW(hprocess: Handle, baseofdll: ULong, mask: Pcwstr, enumsymbolscallback: PsymEnumeratesymbolsCallbackw, usercontext: ConstPtr<CVoid>, options: UInt): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSymbolsExW(hprocess.rawAddress.toString(), baseofdll.toString(), mask.rawAddress.toString(), 0L.toString(), usercontext.rawAddress.toString(), options.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symEnumSymbolsForAddr(hprocess: Handle, address: ULong, enumsymbolscallback: PsymEnumeratesymbolsCallback, usercontext: ConstPtr<CVoid>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSymbolsForAddr(hprocess.rawAddress.toString(), address.toString(), 0L.toString(), usercontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symEnumSymbolsForAddrW(hprocess: Handle, address: ULong, enumsymbolscallback: PsymEnumeratesymbolsCallbackw, usercontext: ConstPtr<CVoid>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSymbolsForAddrW(hprocess.rawAddress.toString(), address.toString(), 0L.toString(), usercontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symEnumSymbolsW(hprocess: Handle, baseofdll: ULong, mask: Pcwstr, enumsymbolscallback: PsymEnumeratesymbolsCallbackw, usercontext: ConstPtr<CVoid>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSymbolsW(hprocess.rawAddress.toString(), baseofdll.toString(), mask.rawAddress.toString(), 0L.toString(), usercontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symEnumTypes(hprocess: Handle, baseofdll: ULong, enumsymbolscallback: PsymEnumeratesymbolsCallback, usercontext: ConstPtr<CVoid>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymEnumTypes(hprocess.rawAddress.toString(), baseofdll.toString(), 0L.toString(), usercontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symEnumTypesByName(hprocess: Handle, baseofdll: ULong, mask: Pcstr, enumsymbolscallback: PsymEnumeratesymbolsCallback, usercontext: ConstPtr<CVoid>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymEnumTypesByName(hprocess.rawAddress.toString(), baseofdll.toString(), mask.rawAddress.toString(), 0L.toString(), usercontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symEnumTypesByNameW(hprocess: Handle, baseofdll: ULong, mask: Pcwstr, enumsymbolscallback: PsymEnumeratesymbolsCallbackw, usercontext: ConstPtr<CVoid>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymEnumTypesByNameW(hprocess.rawAddress.toString(), baseofdll.toString(), mask.rawAddress.toString(), 0L.toString(), usercontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symEnumTypesW(hprocess: Handle, baseofdll: ULong, enumsymbolscallback: PsymEnumeratesymbolsCallbackw, usercontext: ConstPtr<CVoid>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymEnumTypesW(hprocess.rawAddress.toString(), baseofdll.toString(), 0L.toString(), usercontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symEnumerateModules64(hprocess: Handle, enummodulescallback: PsymEnummodulesCallback64, usercontext: ConstPtr<CVoid>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymEnumerateModules64(hprocess.rawAddress.toString(), 0L.toString(), usercontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symEnumerateModulesW64(hprocess: Handle, enummodulescallback: PsymEnummodulesCallbackw64, usercontext: ConstPtr<CVoid>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymEnumerateModulesW64(hprocess.rawAddress.toString(), 0L.toString(), usercontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symEnumerateSymbols64(hprocess: Handle, baseofdll: ULong, enumsymbolscallback: PsymEnumsymbolsCallback64, usercontext: ConstPtr<CVoid>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymEnumerateSymbols64(hprocess.rawAddress.toString(), baseofdll.toString(), 0L.toString(), usercontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symEnumerateSymbolsW64(hprocess: Handle, baseofdll: ULong, enumsymbolscallback: PsymEnumsymbolsCallback64w, usercontext: ConstPtr<CVoid>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymEnumerateSymbolsW64(hprocess.rawAddress.toString(), baseofdll.toString(), 0L.toString(), usercontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symFindDebugInfoFile(hprocess: Handle, filename: Pcstr, debugfilepath: Pstr, callback: PfindDebugFileCallback, callerdata: ConstPtr<CVoid>): Handle =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) MutPtr((windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymFindDebugInfoFile(hprocess.rawAddress.toString(), filename.rawAddress.toString(), debugfilepath.rawAddress.toString(), 0L.toString(), callerdata.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symFindDebugInfoFileW(hprocess: Handle, filename: Pcwstr, debugfilepath: Pwstr, callback: PfindDebugFileCallbackw, callerdata: ConstPtr<CVoid>): Handle =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) MutPtr((windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymFindDebugInfoFileW(hprocess.rawAddress.toString(), filename.rawAddress.toString(), debugfilepath.rawAddress.toString(), 0L.toString(), callerdata.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symFindExecutableImage(hprocess: Handle, filename: Pcstr, imagefilepath: Pstr, callback: PfindExeFileCallback, callerdata: ConstPtr<CVoid>): Handle =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) MutPtr((windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymFindExecutableImage(hprocess.rawAddress.toString(), filename.rawAddress.toString(), imagefilepath.rawAddress.toString(), 0L.toString(), callerdata.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symFindExecutableImageW(hprocess: Handle, filename: Pcwstr, imagefilepath: Pwstr, callback: PfindExeFileCallbackw, callerdata: ConstPtr<CVoid>): Handle =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) MutPtr((windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymFindExecutableImageW(hprocess.rawAddress.toString(), filename.rawAddress.toString(), imagefilepath.rawAddress.toString(), 0L.toString(), callerdata.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symFindFileInPath(hprocess: Handle, searchpatha: Pcstr, filename: Pcstr, id: ConstPtr<CVoid>, two: UInt, three: UInt, flags: SymFindIdOption, foundfile: Pstr, callback: Pfindfileinpathcallback, context: ConstPtr<CVoid>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymFindFileInPath(hprocess.rawAddress.toString(), searchpatha.rawAddress.toString(), filename.rawAddress.toString(), id.rawAddress.toString(), two.toInt(), three.toInt(), flags.toInt(), foundfile.rawAddress.toString(), 0L.toString(), context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symFindFileInPathW(hprocess: Handle, searchpatha: Pcwstr, filename: Pcwstr, id: ConstPtr<CVoid>, two: UInt, three: UInt, flags: SymFindIdOption, foundfile: Pwstr, callback: Pfindfileinpathcallbackw, context: ConstPtr<CVoid>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymFindFileInPathW(hprocess.rawAddress.toString(), searchpatha.rawAddress.toString(), filename.rawAddress.toString(), id.rawAddress.toString(), two.toInt(), three.toInt(), flags.toInt(), foundfile.rawAddress.toString(), 0L.toString(), context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symFromAddr(hprocess: Handle, address: ULong, displacement: MutPtr<ULong>, symbol: MutPtr<SymbolInfo>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymFromAddr(hprocess.rawAddress.toString(), address.toString(), displacement.rawAddress.toString(), symbol.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symFromAddrW(hprocess: Handle, address: ULong, displacement: MutPtr<ULong>, symbol: MutPtr<SymbolInfow>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymFromAddrW(hprocess.rawAddress.toString(), address.toString(), displacement.rawAddress.toString(), symbol.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symFromIndex(hprocess: Handle, baseofdll: ULong, index: UInt, symbol: MutPtr<SymbolInfo>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymFromIndex(hprocess.rawAddress.toString(), baseofdll.toString(), index.toInt(), symbol.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symFromIndexW(hprocess: Handle, baseofdll: ULong, index: UInt, symbol: MutPtr<SymbolInfow>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymFromIndexW(hprocess.rawAddress.toString(), baseofdll.toString(), index.toInt(), symbol.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symFromInlineContext(hprocess: Handle, address: ULong, inlinecontext: UInt, displacement: MutPtr<ULong>, symbol: MutPtr<SymbolInfo>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymFromInlineContext(hprocess.rawAddress.toString(), address.toString(), inlinecontext.toInt(), displacement.rawAddress.toString(), symbol.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symFromInlineContextW(hprocess: Handle, address: ULong, inlinecontext: UInt, displacement: MutPtr<ULong>, symbol: MutPtr<SymbolInfow>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymFromInlineContextW(hprocess.rawAddress.toString(), address.toString(), inlinecontext.toInt(), displacement.rawAddress.toString(), symbol.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symFromName(hprocess: Handle, name: Pcstr, symbol: MutPtr<SymbolInfo>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymFromName(hprocess.rawAddress.toString(), name.rawAddress.toString(), symbol.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symFromNameW(hprocess: Handle, name: Pcwstr, symbol: MutPtr<SymbolInfow>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymFromNameW(hprocess.rawAddress.toString(), name.rawAddress.toString(), symbol.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symFromToken(hprocess: Handle, base: ULong, token: UInt, symbol: MutPtr<SymbolInfo>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymFromToken(hprocess.rawAddress.toString(), base.toString(), token.toInt(), symbol.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symFromTokenW(hprocess: Handle, base: ULong, token: UInt, symbol: MutPtr<SymbolInfow>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymFromTokenW(hprocess.rawAddress.toString(), base.toString(), token.toInt(), symbol.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symFunctionTableAccess64(hprocess: Handle, addrbase: ULong): MutPtr<CVoid> =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) MutPtr((windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymFunctionTableAccess64(hprocess.rawAddress.toString(), addrbase.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symFunctionTableAccess64AccessRoutines(hprocess: Handle, addrbase: ULong, readmemoryroutine: PreadProcessMemoryRoutine64, getmodulebaseroutine: PgetModuleBaseRoutine64): MutPtr<CVoid> =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) MutPtr((windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymFunctionTableAccess64AccessRoutines(hprocess.rawAddress.toString(), addrbase.toString(), 0L.toString(), 0L.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetExtendedOption(option: ImagehlpExtendedOptions): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymGetExtendedOption(option) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetFileLineOffsets64(hprocess: Handle, modulename: Pcstr, filename: Pcstr, buffer: MutPtr<ULong>, bufferlines: UInt): UInt =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymGetFileLineOffsets64(hprocess.rawAddress.toString(), modulename.rawAddress.toString(), filename.rawAddress.toString(), buffer.rawAddress.toString(), bufferlines.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetHomeDirectory(type: UInt, dir: Pstr, size: ULong): Pstr =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) MutPtr((windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymGetHomeDirectory(type.toInt(), dir.rawAddress.toString(), size.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetHomeDirectoryW(type: UInt, dir: Pwstr, size: ULong): Pwstr =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) MutPtr((windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymGetHomeDirectoryW(type.toInt(), dir.rawAddress.toString(), size.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetLineFromAddr64(hprocess: Handle, qwaddr: ULong, pdwdisplacement: MutPtr<UInt>, line64: MutPtr<ImagehlpLine64>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymGetLineFromAddr64(hprocess.rawAddress.toString(), qwaddr.toString(), pdwdisplacement.rawAddress.toString(), line64.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetLineFromAddrW64(hprocess: Handle, dwaddr: ULong, pdwdisplacement: MutPtr<UInt>, line: MutPtr<ImagehlpLinew64>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymGetLineFromAddrW64(hprocess.rawAddress.toString(), dwaddr.toString(), pdwdisplacement.rawAddress.toString(), line.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetLineFromInlineContext(hprocess: Handle, qwaddr: ULong, inlinecontext: UInt, qwmodulebaseaddress: ULong, pdwdisplacement: MutPtr<UInt>, line64: MutPtr<ImagehlpLine64>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymGetLineFromInlineContext(hprocess.rawAddress.toString(), qwaddr.toString(), inlinecontext.toInt(), qwmodulebaseaddress.toString(), pdwdisplacement.rawAddress.toString(), line64.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetLineFromInlineContextW(hprocess: Handle, dwaddr: ULong, inlinecontext: UInt, qwmodulebaseaddress: ULong, pdwdisplacement: MutPtr<UInt>, line: MutPtr<ImagehlpLinew64>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymGetLineFromInlineContextW(hprocess.rawAddress.toString(), dwaddr.toString(), inlinecontext.toInt(), qwmodulebaseaddress.toString(), pdwdisplacement.rawAddress.toString(), line.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetLineFromName64(hprocess: Handle, modulename: Pcstr, filename: Pcstr, dwlinenumber: UInt, pldisplacement: MutPtr<Int>, line: MutPtr<ImagehlpLine64>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymGetLineFromName64(hprocess.rawAddress.toString(), modulename.rawAddress.toString(), filename.rawAddress.toString(), dwlinenumber.toInt(), pldisplacement.rawAddress.toString(), line.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetLineFromNameW64(hprocess: Handle, modulename: Pcwstr, filename: Pcwstr, dwlinenumber: UInt, pldisplacement: MutPtr<Int>, line: MutPtr<ImagehlpLinew64>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymGetLineFromNameW64(hprocess.rawAddress.toString(), modulename.rawAddress.toString(), filename.rawAddress.toString(), dwlinenumber.toInt(), pldisplacement.rawAddress.toString(), line.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetLineNext64(hprocess: Handle, line: MutPtr<ImagehlpLine64>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymGetLineNext64(hprocess.rawAddress.toString(), line.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetLineNextW64(hprocess: Handle, line: MutPtr<ImagehlpLinew64>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymGetLineNextW64(hprocess.rawAddress.toString(), line.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetLinePrev64(hprocess: Handle, line: MutPtr<ImagehlpLine64>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymGetLinePrev64(hprocess.rawAddress.toString(), line.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetLinePrevW64(hprocess: Handle, line: MutPtr<ImagehlpLinew64>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymGetLinePrevW64(hprocess.rawAddress.toString(), line.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetModuleBase64(hprocess: Handle, qwaddr: ULong): ULong =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymGetModuleBase64(hprocess.rawAddress.toString(), qwaddr.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetModuleInfo64(hprocess: Handle, qwaddr: ULong, moduleinfo: MutPtr<ImagehlpModule64>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymGetModuleInfo64(hprocess.rawAddress.toString(), qwaddr.toString(), moduleinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetModuleInfoW64(hprocess: Handle, qwaddr: ULong, moduleinfo: MutPtr<ImagehlpModulew64>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymGetModuleInfoW64(hprocess.rawAddress.toString(), qwaddr.toString(), moduleinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetOmaps(hprocess: Handle, baseofdll: ULong, omapto: MutPtr<MutPtr<Omap>>, comapto: MutPtr<ULong>, omapfrom: MutPtr<MutPtr<Omap>>, comapfrom: MutPtr<ULong>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymGetOmaps(hprocess.rawAddress.toString(), baseofdll.toString(), omapto.rawAddress.toString(), comapto.rawAddress.toString(), omapfrom.rawAddress.toString(), comapfrom.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetOptions(): UInt =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymGetOptions() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetScope(hprocess: Handle, baseofdll: ULong, index: UInt, symbol: MutPtr<SymbolInfo>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymGetScope(hprocess.rawAddress.toString(), baseofdll.toString(), index.toInt(), symbol.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetScopeW(hprocess: Handle, baseofdll: ULong, index: UInt, symbol: MutPtr<SymbolInfow>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymGetScopeW(hprocess.rawAddress.toString(), baseofdll.toString(), index.toInt(), symbol.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetSearchPath(hprocess: Handle, searchpatha: Pstr, searchpathlength: UInt): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymGetSearchPath(hprocess.rawAddress.toString(), searchpatha.rawAddress.toString(), searchpathlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetSearchPathW(hprocess: Handle, searchpatha: Pwstr, searchpathlength: UInt): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymGetSearchPathW(hprocess.rawAddress.toString(), searchpatha.rawAddress.toString(), searchpathlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetSourceFile(hprocess: Handle, base: ULong, params: Pcstr, filespec: Pcstr, filepath: Pstr, size: UInt): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFile(hprocess.rawAddress.toString(), base.toString(), params.rawAddress.toString(), filespec.rawAddress.toString(), filepath.rawAddress.toString(), size.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetSourceFileChecksum(hprocess: Handle, base: ULong, filespec: Pcstr, pchecksumtype: MutPtr<UInt>, pchecksum: MutPtr<UByte>, checksumsize: UInt, pactualbyteswritten: MutPtr<UInt>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileChecksum(hprocess.rawAddress.toString(), base.toString(), filespec.rawAddress.toString(), pchecksumtype.rawAddress.toString(), pchecksum.rawAddress.toString(), checksumsize.toInt(), pactualbyteswritten.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetSourceFileChecksumW(hprocess: Handle, base: ULong, filespec: Pcwstr, pchecksumtype: MutPtr<UInt>, pchecksum: MutPtr<UByte>, checksumsize: UInt, pactualbyteswritten: MutPtr<UInt>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileChecksumW(hprocess.rawAddress.toString(), base.toString(), filespec.rawAddress.toString(), pchecksumtype.rawAddress.toString(), pchecksum.rawAddress.toString(), checksumsize.toInt(), pactualbyteswritten.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetSourceFileFromToken(hprocess: Handle, token: ConstPtr<CVoid>, params: Pcstr, filepath: Pstr, size: UInt): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileFromToken(hprocess.rawAddress.toString(), token.rawAddress.toString(), params.rawAddress.toString(), filepath.rawAddress.toString(), size.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetSourceFileFromTokenByTokenName(hprocess: Handle, token: ConstPtr<CVoid>, tokenname: Pcstr, params: Pcstr, filepath: Pstr, size: UInt): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileFromTokenByTokenName(hprocess.rawAddress.toString(), token.rawAddress.toString(), tokenname.rawAddress.toString(), params.rawAddress.toString(), filepath.rawAddress.toString(), size.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetSourceFileFromTokenByTokenNameW(hprocess: Handle, token: ConstPtr<CVoid>, tokenname: Pcwstr, params: Pcwstr, filepath: Pwstr, size: UInt): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileFromTokenByTokenNameW(hprocess.rawAddress.toString(), token.rawAddress.toString(), tokenname.rawAddress.toString(), params.rawAddress.toString(), filepath.rawAddress.toString(), size.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetSourceFileFromTokenW(hprocess: Handle, token: ConstPtr<CVoid>, params: Pcwstr, filepath: Pwstr, size: UInt): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileFromTokenW(hprocess.rawAddress.toString(), token.rawAddress.toString(), params.rawAddress.toString(), filepath.rawAddress.toString(), size.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetSourceFileToken(hprocess: Handle, base: ULong, filespec: Pcstr, token: MutPtr<MutPtr<CVoid>>, size: MutPtr<UInt>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileToken(hprocess.rawAddress.toString(), base.toString(), filespec.rawAddress.toString(), token.rawAddress.toString(), size.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetSourceFileTokenByTokenName(hprocess: Handle, base: ULong, filespec: Pcstr, tokenname: Pcstr, tokenparameters: Pcstr, token: MutPtr<MutPtr<CVoid>>, size: MutPtr<UInt>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileTokenByTokenName(hprocess.rawAddress.toString(), base.toString(), filespec.rawAddress.toString(), tokenname.rawAddress.toString(), tokenparameters.rawAddress.toString(), token.rawAddress.toString(), size.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetSourceFileTokenByTokenNameW(hprocess: Handle, base: ULong, filespec: Pcwstr, tokenname: Pcwstr, tokenparameters: Pcwstr, token: MutPtr<MutPtr<CVoid>>, size: MutPtr<UInt>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileTokenByTokenNameW(hprocess.rawAddress.toString(), base.toString(), filespec.rawAddress.toString(), tokenname.rawAddress.toString(), tokenparameters.rawAddress.toString(), token.rawAddress.toString(), size.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetSourceFileTokenW(hprocess: Handle, base: ULong, filespec: Pcwstr, token: MutPtr<MutPtr<CVoid>>, size: MutPtr<UInt>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileTokenW(hprocess.rawAddress.toString(), base.toString(), filespec.rawAddress.toString(), token.rawAddress.toString(), size.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetSourceFileW(hprocess: Handle, base: ULong, params: Pcwstr, filespec: Pcwstr, filepath: Pwstr, size: UInt): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileW(hprocess.rawAddress.toString(), base.toString(), params.rawAddress.toString(), filespec.rawAddress.toString(), filepath.rawAddress.toString(), size.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetSourceVarFromToken(hprocess: Handle, token: ConstPtr<CVoid>, params: Pcstr, varname: Pcstr, value: Pstr, size: UInt): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceVarFromToken(hprocess.rawAddress.toString(), token.rawAddress.toString(), params.rawAddress.toString(), varname.rawAddress.toString(), value.rawAddress.toString(), size.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetSourceVarFromTokenW(hprocess: Handle, token: ConstPtr<CVoid>, params: Pcwstr, varname: Pcwstr, value: Pwstr, size: UInt): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceVarFromTokenW(hprocess.rawAddress.toString(), token.rawAddress.toString(), params.rawAddress.toString(), varname.rawAddress.toString(), value.rawAddress.toString(), size.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetSymFromAddr64(hprocess: Handle, qwaddr: ULong, pdwdisplacement: MutPtr<ULong>, symbol: MutPtr<ImagehlpSymbol64>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymGetSymFromAddr64(hprocess.rawAddress.toString(), qwaddr.toString(), pdwdisplacement.rawAddress.toString(), symbol.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetSymFromName64(hprocess: Handle, name: Pcstr, symbol: MutPtr<ImagehlpSymbol64>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymGetSymFromName64(hprocess.rawAddress.toString(), name.rawAddress.toString(), symbol.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetSymNext64(hprocess: Handle, symbol: MutPtr<ImagehlpSymbol64>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymGetSymNext64(hprocess.rawAddress.toString(), symbol.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetSymPrev64(hprocess: Handle, symbol: MutPtr<ImagehlpSymbol64>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymGetSymPrev64(hprocess.rawAddress.toString(), symbol.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetSymbolFile(hprocess: Handle, sympath: Pcstr, imagefile: Pcstr, type: UInt, symbolfile: Pstr, csymbolfile: ULong, dbgfile: Pstr, cdbgfile: ULong): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymGetSymbolFile(hprocess.rawAddress.toString(), sympath.rawAddress.toString(), imagefile.rawAddress.toString(), type.toInt(), symbolfile.rawAddress.toString(), csymbolfile.toString(), dbgfile.rawAddress.toString(), cdbgfile.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetSymbolFileW(hprocess: Handle, sympath: Pcwstr, imagefile: Pcwstr, type: UInt, symbolfile: Pwstr, csymbolfile: ULong, dbgfile: Pwstr, cdbgfile: ULong): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymGetSymbolFileW(hprocess.rawAddress.toString(), sympath.rawAddress.toString(), imagefile.rawAddress.toString(), type.toInt(), symbolfile.rawAddress.toString(), csymbolfile.toString(), dbgfile.rawAddress.toString(), cdbgfile.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetTypeFromName(hprocess: Handle, baseofdll: ULong, name: Pcstr, symbol: MutPtr<SymbolInfo>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymGetTypeFromName(hprocess.rawAddress.toString(), baseofdll.toString(), name.rawAddress.toString(), symbol.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetTypeFromNameW(hprocess: Handle, baseofdll: ULong, name: Pcwstr, symbol: MutPtr<SymbolInfow>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymGetTypeFromNameW(hprocess.rawAddress.toString(), baseofdll.toString(), name.rawAddress.toString(), symbol.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetTypeInfo(hprocess: Handle, modbase: ULong, typeid: UInt, gettype: ImagehlpSymbolTypeInfo, pinfo: MutPtr<CVoid>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymGetTypeInfo(hprocess.rawAddress.toString(), modbase.toString(), typeid.toInt(), gettype, pinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetTypeInfoEx(hprocess: Handle, modbase: ULong, params: MutPtr<ImagehlpGetTypeInfoParams>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymGetTypeInfoEx(hprocess.rawAddress.toString(), modbase.toString(), params.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symGetUnwindInfo(hprocess: Handle, address: ULong, buffer: MutPtr<CVoid>, size: MutPtr<UInt>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymGetUnwindInfo(hprocess.rawAddress.toString(), address.toString(), buffer.rawAddress.toString(), size.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symInitialize(hprocess: Handle, usersearchpath: Pcstr, finvadeprocess: Bool): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymInitialize(hprocess.rawAddress.toString(), usersearchpath.rawAddress.toString(), finvadeprocess) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symInitializeW(hprocess: Handle, usersearchpath: Pcwstr, finvadeprocess: Bool): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymInitializeW(hprocess.rawAddress.toString(), usersearchpath.rawAddress.toString(), finvadeprocess) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symLoadModule64(hprocess: Handle, hfile: Handle, imagename: Pcstr, modulename: Pcstr, baseofdll: ULong, sizeofdll: UInt): ULong =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymLoadModule64(hprocess.rawAddress.toString(), hfile.rawAddress.toString(), imagename.rawAddress.toString(), modulename.rawAddress.toString(), baseofdll.toString(), sizeofdll.toInt()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symLoadModuleEx(hprocess: Handle, hfile: Handle, imagename: Pcstr, modulename: Pcstr, baseofdll: ULong, dllsize: UInt, data: ConstPtr<ModloadData>, flags: SymLoadFlags): ULong =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymLoadModuleEx(hprocess.rawAddress.toString(), hfile.rawAddress.toString(), imagename.rawAddress.toString(), modulename.rawAddress.toString(), baseofdll.toString(), dllsize.toInt(), data.rawAddress.toString(), flags.toInt()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symLoadModuleExW(hprocess: Handle, hfile: Handle, imagename: Pcwstr, modulename: Pcwstr, baseofdll: ULong, dllsize: UInt, data: ConstPtr<ModloadData>, flags: SymLoadFlags): ULong =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymLoadModuleExW(hprocess.rawAddress.toString(), hfile.rawAddress.toString(), imagename.rawAddress.toString(), modulename.rawAddress.toString(), baseofdll.toString(), dllsize.toInt(), data.rawAddress.toString(), flags.toInt()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symMatchFileName(filename: Pcstr, match: Pcstr, filenamestop: MutPtr<Pstr>, matchstop: MutPtr<Pstr>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymMatchFileName(filename.rawAddress.toString(), match.rawAddress.toString(), filenamestop.rawAddress.toString(), matchstop.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symMatchFileNameW(filename: Pcwstr, match: Pcwstr, filenamestop: MutPtr<Pwstr>, matchstop: MutPtr<Pwstr>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymMatchFileNameW(filename.rawAddress.toString(), match.rawAddress.toString(), filenamestop.rawAddress.toString(), matchstop.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symMatchString(string: Pcstr, expression: Pcstr, fcase: Bool): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymMatchString(string.rawAddress.toString(), expression.rawAddress.toString(), fcase) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symMatchStringA(string: Pcstr, expression: Pcstr, fcase: Bool): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymMatchStringA(string.rawAddress.toString(), expression.rawAddress.toString(), fcase) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symMatchStringW(string: Pcwstr, expression: Pcwstr, fcase: Bool): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymMatchStringW(string.rawAddress.toString(), expression.rawAddress.toString(), fcase) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symNext(hprocess: Handle, si: MutPtr<SymbolInfo>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymNext(hprocess.rawAddress.toString(), si.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symNextW(hprocess: Handle, siw: MutPtr<SymbolInfow>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymNextW(hprocess.rawAddress.toString(), siw.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symPrev(hprocess: Handle, si: MutPtr<SymbolInfo>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymPrev(hprocess.rawAddress.toString(), si.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symPrevW(hprocess: Handle, siw: MutPtr<SymbolInfow>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymPrevW(hprocess.rawAddress.toString(), siw.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symQueryInlineTrace(hprocess: Handle, startaddress: ULong, startcontext: UInt, startretaddress: ULong, curaddress: ULong, curcontext: MutPtr<UInt>, curframeindex: MutPtr<UInt>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymQueryInlineTrace(hprocess.rawAddress.toString(), startaddress.toString(), startcontext.toInt(), startretaddress.toString(), curaddress.toString(), curcontext.rawAddress.toString(), curframeindex.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symRefreshModuleList(hprocess: Handle): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymRefreshModuleList(hprocess.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symRegisterCallback64(hprocess: Handle, callbackfunction: PsymbolRegisteredCallback64, usercontext: ULong): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymRegisterCallback64(hprocess.rawAddress.toString(), 0L.toString(), usercontext.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symRegisterCallbackW64(hprocess: Handle, callbackfunction: PsymbolRegisteredCallback64, usercontext: ULong): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymRegisterCallbackW64(hprocess.rawAddress.toString(), 0L.toString(), usercontext.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symRegisterFunctionEntryCallback64(hprocess: Handle, callbackfunction: PsymbolFuncentryCallback64, usercontext: ULong): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymRegisterFunctionEntryCallback64(hprocess.rawAddress.toString(), 0L.toString(), usercontext.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSearch(hprocess: Handle, baseofdll: ULong, index: UInt, symtag: UInt, mask: Pcstr, address: ULong, enumsymbolscallback: PsymEnumeratesymbolsCallback, usercontext: ConstPtr<CVoid>, options: UInt): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymSearch(hprocess.rawAddress.toString(), baseofdll.toString(), index.toInt(), symtag.toInt(), mask.rawAddress.toString(), address.toString(), 0L.toString(), usercontext.rawAddress.toString(), options.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSearchW(hprocess: Handle, baseofdll: ULong, index: UInt, symtag: UInt, mask: Pcwstr, address: ULong, enumsymbolscallback: PsymEnumeratesymbolsCallbackw, usercontext: ConstPtr<CVoid>, options: UInt): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymSearchW(hprocess.rawAddress.toString(), baseofdll.toString(), index.toInt(), symtag.toInt(), mask.rawAddress.toString(), address.toString(), 0L.toString(), usercontext.rawAddress.toString(), options.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSetContext(hprocess: Handle, stackframe: ConstPtr<ImagehlpStackFrame>, context: ConstPtr<CVoid>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymSetContext(hprocess.rawAddress.toString(), stackframe.rawAddress.toString(), context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSetExtendedOption(option: ImagehlpExtendedOptions, value: Bool): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymSetExtendedOption(option, value) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSetHomeDirectory(hprocess: Handle, dir: Pcstr): Pstr =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) MutPtr((windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymSetHomeDirectory(hprocess.rawAddress.toString(), dir.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSetHomeDirectoryW(hprocess: Handle, dir: Pcwstr): Pwstr =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) MutPtr((windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymSetHomeDirectoryW(hprocess.rawAddress.toString(), dir.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSetOptions(symoptions: UInt): UInt =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymSetOptions(symoptions.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSetParentWindow(hwnd: Hwnd): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymSetParentWindow(hwnd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSetScopeFromAddr(hprocess: Handle, address: ULong): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymSetScopeFromAddr(hprocess.rawAddress.toString(), address.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSetScopeFromIndex(hprocess: Handle, baseofdll: ULong, index: UInt): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymSetScopeFromIndex(hprocess.rawAddress.toString(), baseofdll.toString(), index.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSetScopeFromInlineContext(hprocess: Handle, address: ULong, inlinecontext: UInt): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymSetScopeFromInlineContext(hprocess.rawAddress.toString(), address.toString(), inlinecontext.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSetSearchPath(hprocess: Handle, searchpatha: Pcstr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymSetSearchPath(hprocess.rawAddress.toString(), searchpatha.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSetSearchPathW(hprocess: Handle, searchpatha: Pcwstr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymSetSearchPathW(hprocess.rawAddress.toString(), searchpatha.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSrvDeltaName(hprocess: Handle, sympath: Pcstr, type: Pcstr, file1: Pcstr, file2: Pcstr): Pcstr =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) ConstPtr((windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymSrvDeltaName(hprocess.rawAddress.toString(), sympath.rawAddress.toString(), type.rawAddress.toString(), file1.rawAddress.toString(), file2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSrvDeltaNameW(hprocess: Handle, sympath: Pcwstr, type: Pcwstr, file1: Pcwstr, file2: Pcwstr): Pcwstr =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) ConstPtr((windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymSrvDeltaNameW(hprocess.rawAddress.toString(), sympath.rawAddress.toString(), type.rawAddress.toString(), file1.rawAddress.toString(), file2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSrvGetFileIndexInfo(file: Pcstr, info: MutPtr<SymsrvIndexInfo>, flags: UInt): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymSrvGetFileIndexInfo(file.rawAddress.toString(), info.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSrvGetFileIndexInfoW(file: Pcwstr, info: MutPtr<SymsrvIndexInfow>, flags: UInt): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymSrvGetFileIndexInfoW(file.rawAddress.toString(), info.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSrvGetFileIndexString(hprocess: Handle, srvpath: Pcstr, file: Pcstr, index: Pstr, size: ULong, flags: UInt): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymSrvGetFileIndexString(hprocess.rawAddress.toString(), srvpath.rawAddress.toString(), file.rawAddress.toString(), index.rawAddress.toString(), size.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSrvGetFileIndexStringW(hprocess: Handle, srvpath: Pcwstr, file: Pcwstr, index: Pwstr, size: ULong, flags: UInt): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymSrvGetFileIndexStringW(hprocess.rawAddress.toString(), srvpath.rawAddress.toString(), file.rawAddress.toString(), index.rawAddress.toString(), size.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSrvGetFileIndexes(file: Pcstr, id: MutPtr<Guid>, val1: MutPtr<UInt>, val2: MutPtr<UInt>, flags: UInt): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymSrvGetFileIndexes(file.rawAddress.toString(), id.rawAddress.toString(), val1.rawAddress.toString(), val2.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSrvGetFileIndexesW(file: Pcwstr, id: MutPtr<Guid>, val1: MutPtr<UInt>, val2: MutPtr<UInt>, flags: UInt): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymSrvGetFileIndexesW(file.rawAddress.toString(), id.rawAddress.toString(), val1.rawAddress.toString(), val2.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSrvGetSupplement(hprocess: Handle, sympath: Pcstr, node: Pcstr, file: Pcstr): Pcstr =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) ConstPtr((windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymSrvGetSupplement(hprocess.rawAddress.toString(), sympath.rawAddress.toString(), node.rawAddress.toString(), file.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSrvGetSupplementW(hprocess: Handle, sympath: Pcwstr, node: Pcwstr, file: Pcwstr): Pcwstr =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) ConstPtr((windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymSrvGetSupplementW(hprocess.rawAddress.toString(), sympath.rawAddress.toString(), node.rawAddress.toString(), file.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSrvIsStore(hprocess: Handle, path: Pcstr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymSrvIsStore(hprocess.rawAddress.toString(), path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSrvIsStoreW(hprocess: Handle, path: Pcwstr): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymSrvIsStoreW(hprocess.rawAddress.toString(), path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSrvStoreFile(hprocess: Handle, srvpath: Pcstr, file: Pcstr, flags: SymSrvStoreFileFlags): Pcstr =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) ConstPtr((windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymSrvStoreFile(hprocess.rawAddress.toString(), srvpath.rawAddress.toString(), file.rawAddress.toString(), flags.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSrvStoreFileW(hprocess: Handle, srvpath: Pcwstr, file: Pcwstr, flags: SymSrvStoreFileFlags): Pcwstr =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) ConstPtr((windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymSrvStoreFileW(hprocess.rawAddress.toString(), srvpath.rawAddress.toString(), file.rawAddress.toString(), flags.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSrvStoreSupplement(hprocess: Handle, srvpath: Pcstr, node: Pcstr, file: Pcstr, flags: UInt): Pcstr =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) ConstPtr((windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymSrvStoreSupplement(hprocess.rawAddress.toString(), srvpath.rawAddress.toString(), node.rawAddress.toString(), file.rawAddress.toString(), flags.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symSrvStoreSupplementW(hprocess: Handle, sympath: Pcwstr, node: Pcwstr, file: Pcwstr, flags: UInt): Pcwstr =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) ConstPtr((windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymSrvStoreSupplementW(hprocess.rawAddress.toString(), sympath.rawAddress.toString(), node.rawAddress.toString(), file.rawAddress.toString(), flags.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symUnDName64(sym: ConstPtr<ImagehlpSymbol64>, undecname: Pstr, undecnamelength: UInt): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymUnDName64(sym.rawAddress.toString(), undecname.rawAddress.toString(), undecnamelength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symUnloadModule64(hprocess: Handle, baseofdll: ULong): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugSymUnloadModule64(hprocess.rawAddress.toString(), baseofdll.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun terminateProcessOnMemoryExhaustion(failedallocationsize: ULong) {
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) {
        windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugTerminateProcessOnMemoryExhaustion(failedallocationsize.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun touchFileTimes(filehandle: Handle, psystemtime: ConstPtr<Systemtime>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugTouchFileTimes(filehandle.rawAddress.toString(), psystemtime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unDecorateSymbolName(name: Pcstr, outputstring: Pstr, maxstringlength: UInt, flags: UInt): UInt =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugUnDecorateSymbolName(name.rawAddress.toString(), outputstring.rawAddress.toString(), maxstringlength.toInt(), flags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unDecorateSymbolNameW(name: Pcwstr, outputstring: Pwstr, maxstringlength: UInt, flags: UInt): UInt =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugUnDecorateSymbolNameW(name.rawAddress.toString(), outputstring.rawAddress.toString(), maxstringlength.toInt(), flags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unMapAndLoad(loadedimage: MutPtr<LoadedImage>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugUnMapAndLoad(loadedimage.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unhandledExceptionFilter(exceptioninfo: ConstPtr<ExceptionPointers>): Int =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugUnhandledExceptionFilter(exceptioninfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updateDebugInfoFile(imagefilename: Pcstr, symbolpath: Pcstr, debugfilepath: Pstr, ntheaders: ConstPtr<ImageNtHeaders32>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugUpdateDebugInfoFile(imagefilename.rawAddress.toString(), symbolpath.rawAddress.toString(), debugfilepath.rawAddress.toString(), ntheaders.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updateDebugInfoFileEx(imagefilename: Pcstr, symbolpath: Pcstr, debugfilepath: Pstr, ntheaders: ConstPtr<ImageNtHeaders32>, oldchecksum: UInt): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugUpdateDebugInfoFileEx(imagefilename.rawAddress.toString(), symbolpath.rawAddress.toString(), debugfilepath.rawAddress.toString(), ntheaders.rawAddress.toString(), oldchecksum.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitForDebugEvent(lpdebugevent: MutPtr<DebugEvent>, dwmilliseconds: UInt): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugWaitForDebugEvent(lpdebugevent.rawAddress.toString(), dwmilliseconds.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitForDebugEventEx(lpdebugevent: MutPtr<DebugEvent>, dwmilliseconds: UInt): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugWaitForDebugEventEx(lpdebugevent.rawAddress.toString(), dwmilliseconds.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wow64GetThreadContext(hthread: Handle, lpcontext: MutPtr<Wow64Context>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugWow64GetThreadContext(hthread.rawAddress.toString(), lpcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wow64GetThreadSelectorEntry(hthread: Handle, dwselector: UInt, lpselectorentry: MutPtr<Wow64LdtEntry>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugWow64GetThreadSelectorEntry(hthread.rawAddress.toString(), dwselector.toInt(), lpselectorentry.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wow64SetThreadContext(hthread: Handle, lpcontext: ConstPtr<Wow64Context>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugWow64SetThreadContext(hthread.rawAddress.toString(), lpcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeProcessMemory(hprocess: Handle, lpbaseaddress: ConstPtr<CVoid>, lpbuffer: ConstPtr<CVoid>, nsize: ULong, lpnumberofbyteswritten: MutPtr<ULong>): Bool =
    if (windowsWin32SystemDiagnosticsDebugNapiAddon != null) (windowsWin32SystemDiagnosticsDebugNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugWriteProcessMemory(hprocess.rawAddress.toString(), lpbaseaddress.rawAddress.toString(), lpbuffer.rawAddress.toString(), nsize.toString(), lpnumberofbyteswritten.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
