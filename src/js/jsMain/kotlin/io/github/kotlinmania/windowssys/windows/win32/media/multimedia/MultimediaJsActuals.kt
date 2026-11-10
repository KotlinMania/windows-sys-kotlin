@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.media.multimedia

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Farproc
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hmodule
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lresult
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hdc
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hpalette
import io.github.kotlinmania.windowssys.windows.win32.media.Htask

private val _windowsWin32MediaMultimediaNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun aVIBuildFilterA(lpszfilter: Pstr, cbfilter: Int, fsaving: Bool): Hresult =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_aVIBuildFilterA((lpszfilter?.value ?: 0L).toString(), cbfilter, fsaving) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIBuildFilterW(lpszfilter: Pwstr, cbfilter: Int, fsaving: Bool): Hresult =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_aVIBuildFilterW((lpszfilter?.value ?: 0L).toString(), cbfilter, fsaving) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIClearClipboard(): Hresult =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_aVIClearClipboard() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIFileAddRef(pfile: COpaquePointer?): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_aVIFileAddRef((pfile?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIFileCreateStreamA(pfile: COpaquePointer?, ppavi: COpaquePointer?, psi: COpaquePointer?): Hresult =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_aVIFileCreateStreamA((pfile?.value ?: 0L).toString(), (ppavi?.value ?: 0L).toString(), (psi?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIFileCreateStreamW(pfile: COpaquePointer?, ppavi: COpaquePointer?, psi: COpaquePointer?): Hresult =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_aVIFileCreateStreamW((pfile?.value ?: 0L).toString(), (ppavi?.value ?: 0L).toString(), (psi?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIFileEndRecord(pfile: COpaquePointer?): Hresult =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_aVIFileEndRecord((pfile?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIFileExit() {
    if (_windowsWin32MediaMultimediaNapiAddon != null) {
        _windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_aVIFileExit()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun aVIFileGetStream(pfile: COpaquePointer?, ppavi: COpaquePointer?, fcctype: UInt, lparam: Int): Hresult =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_aVIFileGetStream((pfile?.value ?: 0L).toString(), (ppavi?.value ?: 0L).toString(), fcctype.toInt(), lparam) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIFileInfoA(pfile: COpaquePointer?, pfi: COpaquePointer?, lsize: Int): Hresult =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_aVIFileInfoA((pfile?.value ?: 0L).toString(), (pfi?.value ?: 0L).toString(), lsize) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIFileInfoW(pfile: COpaquePointer?, pfi: COpaquePointer?, lsize: Int): Hresult =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_aVIFileInfoW((pfile?.value ?: 0L).toString(), (pfi?.value ?: 0L).toString(), lsize) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIFileInit() {
    if (_windowsWin32MediaMultimediaNapiAddon != null) {
        _windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_aVIFileInit()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun aVIFileOpenA(ppfile: COpaquePointer?, szfile: Pcstr, umode: UInt, lphandler: COpaquePointer?): Hresult =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_aVIFileOpenA((ppfile?.value ?: 0L).toString(), (szfile?.value ?: 0L).toString(), umode.toInt(), (lphandler?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIFileOpenW(ppfile: COpaquePointer?, szfile: Pcwstr, umode: UInt, lphandler: COpaquePointer?): Hresult =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_aVIFileOpenW((ppfile?.value ?: 0L).toString(), (szfile?.value ?: 0L).toString(), umode.toInt(), (lphandler?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIFileReadData(pfile: COpaquePointer?, ckid: UInt, lpdata: COpaquePointer?, lpcbdata: COpaquePointer?): Hresult =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_aVIFileReadData((pfile?.value ?: 0L).toString(), ckid.toInt(), (lpdata?.value ?: 0L).toString(), (lpcbdata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIFileRelease(pfile: COpaquePointer?): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_aVIFileRelease((pfile?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIFileWriteData(pfile: COpaquePointer?, ckid: UInt, lpdata: COpaquePointer?, cbdata: Int): Hresult =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_aVIFileWriteData((pfile?.value ?: 0L).toString(), ckid.toInt(), (lpdata?.value ?: 0L).toString(), cbdata) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIGetFromClipboard(lppf: COpaquePointer?): Hresult =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_aVIGetFromClipboard((lppf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIMakeCompressedStream(ppscompressed: COpaquePointer?, ppssource: COpaquePointer?, lpoptions: COpaquePointer?, pclsidhandler: COpaquePointer?): Hresult =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_aVIMakeCompressedStream((ppscompressed?.value ?: 0L).toString(), (ppssource?.value ?: 0L).toString(), (lpoptions?.value ?: 0L).toString(), (pclsidhandler?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIMakeFileFromStreams(ppfile: COpaquePointer?, nstreams: Int, papstreams: COpaquePointer?): Hresult =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_aVIMakeFileFromStreams((ppfile?.value ?: 0L).toString(), nstreams, (papstreams?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIMakeStreamFromClipboard(cfformat: UInt, hglobal: Handle, ppstream: COpaquePointer?): Hresult =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_aVIMakeStreamFromClipboard(cfformat.toInt(), (hglobal?.value ?: 0L).toString(), (ppstream?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIPutFileOnClipboard(pf: COpaquePointer?): Hresult =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_aVIPutFileOnClipboard((pf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVISaveA(szfile: Pcstr, pclsidhandler: COpaquePointer?, lpfncallback: Avisavecallback, nstreams: Int, pfile: COpaquePointer?, lpoptions: COpaquePointer?, vararg variadicArgs: Long): Hresult =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_aVISaveA((szfile?.value ?: 0L).toString(), (pclsidhandler?.value ?: 0L).toString(), 0L.toString(), nstreams, (pfile?.value ?: 0L).toString(), (lpoptions?.value ?: 0L).toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVISaveOptions(hwnd: Hwnd, uiflags: UInt, nstreams: Int, ppavi: COpaquePointer?, plpoptions: COpaquePointer?): Long =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_aVISaveOptions((hwnd?.value ?: 0L).toString(), uiflags.toInt(), nstreams, (ppavi?.value ?: 0L).toString(), (plpoptions?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVISaveOptionsFree(nstreams: Int, plpoptions: COpaquePointer?): Hresult =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_aVISaveOptionsFree(nstreams, (plpoptions?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVISaveVA(szfile: Pcstr, pclsidhandler: COpaquePointer?, lpfncallback: Avisavecallback, nstreams: Int, ppavi: COpaquePointer?, plpoptions: COpaquePointer?): Hresult =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_aVISaveVA((szfile?.value ?: 0L).toString(), (pclsidhandler?.value ?: 0L).toString(), 0L.toString(), nstreams, (ppavi?.value ?: 0L).toString(), (plpoptions?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVISaveVW(szfile: Pcwstr, pclsidhandler: COpaquePointer?, lpfncallback: Avisavecallback, nstreams: Int, ppavi: COpaquePointer?, plpoptions: COpaquePointer?): Hresult =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_aVISaveVW((szfile?.value ?: 0L).toString(), (pclsidhandler?.value ?: 0L).toString(), 0L.toString(), nstreams, (ppavi?.value ?: 0L).toString(), (plpoptions?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVISaveW(szfile: Pcwstr, pclsidhandler: COpaquePointer?, lpfncallback: Avisavecallback, nstreams: Int, pfile: COpaquePointer?, lpoptions: COpaquePointer?, vararg variadicArgs: Long): Hresult =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_aVISaveW((szfile?.value ?: 0L).toString(), (pclsidhandler?.value ?: 0L).toString(), 0L.toString(), nstreams, (pfile?.value ?: 0L).toString(), (lpoptions?.value ?: 0L).toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamAddRef(pavi: COpaquePointer?): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_aVIStreamAddRef((pavi?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamBeginStreaming(pavi: COpaquePointer?, lstart: Int, lend: Int, lrate: Int): Hresult =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_aVIStreamBeginStreaming((pavi?.value ?: 0L).toString(), lstart, lend, lrate) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamCreate(ppavi: COpaquePointer?, lparam1: Int, lparam2: Int, pclsidhandler: COpaquePointer?): Hresult =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_aVIStreamCreate((ppavi?.value ?: 0L).toString(), lparam1, lparam2, (pclsidhandler?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamEndStreaming(pavi: COpaquePointer?): Hresult =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_aVIStreamEndStreaming((pavi?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamFindSample(pavi: COpaquePointer?, lpos: Int, lflags: Int): Int =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_aVIStreamFindSample((pavi?.value ?: 0L).toString(), lpos, lflags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamGetFrame(pg: COpaquePointer?, lpos: Int): COpaquePointer? =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_aVIStreamGetFrame((pg?.value ?: 0L).toString(), lpos) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamGetFrameClose(pg: COpaquePointer?): Hresult =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_aVIStreamGetFrameClose((pg?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamGetFrameOpen(pavi: COpaquePointer?, lpbiwanted: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_aVIStreamGetFrameOpen((pavi?.value ?: 0L).toString(), (lpbiwanted?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamInfoA(pavi: COpaquePointer?, psi: COpaquePointer?, lsize: Int): Hresult =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_aVIStreamInfoA((pavi?.value ?: 0L).toString(), (psi?.value ?: 0L).toString(), lsize) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamInfoW(pavi: COpaquePointer?, psi: COpaquePointer?, lsize: Int): Hresult =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_aVIStreamInfoW((pavi?.value ?: 0L).toString(), (psi?.value ?: 0L).toString(), lsize) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamLength(pavi: COpaquePointer?): Int =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_aVIStreamLength((pavi?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamOpenFromFileA(ppavi: COpaquePointer?, szfile: Pcstr, fcctype: UInt, lparam: Int, mode: UInt, pclsidhandler: COpaquePointer?): Hresult =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_aVIStreamOpenFromFileA((ppavi?.value ?: 0L).toString(), (szfile?.value ?: 0L).toString(), fcctype.toInt(), lparam, mode.toInt(), (pclsidhandler?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamOpenFromFileW(ppavi: COpaquePointer?, szfile: Pcwstr, fcctype: UInt, lparam: Int, mode: UInt, pclsidhandler: COpaquePointer?): Hresult =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_aVIStreamOpenFromFileW((ppavi?.value ?: 0L).toString(), (szfile?.value ?: 0L).toString(), fcctype.toInt(), lparam, mode.toInt(), (pclsidhandler?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamRead(pavi: COpaquePointer?, lstart: Int, lsamples: Int, lpbuffer: COpaquePointer?, cbbuffer: Int, plbytes: COpaquePointer?, plsamples: COpaquePointer?): Hresult =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_aVIStreamRead((pavi?.value ?: 0L).toString(), lstart, lsamples, (lpbuffer?.value ?: 0L).toString(), cbbuffer, (plbytes?.value ?: 0L).toString(), (plsamples?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamReadData(pavi: COpaquePointer?, fcc: UInt, lp: COpaquePointer?, lpcb: COpaquePointer?): Hresult =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_aVIStreamReadData((pavi?.value ?: 0L).toString(), fcc.toInt(), (lp?.value ?: 0L).toString(), (lpcb?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamReadFormat(pavi: COpaquePointer?, lpos: Int, lpformat: COpaquePointer?, lpcbformat: COpaquePointer?): Hresult =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_aVIStreamReadFormat((pavi?.value ?: 0L).toString(), lpos, (lpformat?.value ?: 0L).toString(), (lpcbformat?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamRelease(pavi: COpaquePointer?): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_aVIStreamRelease((pavi?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamSampleToTime(pavi: COpaquePointer?, lsample: Int): Int =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_aVIStreamSampleToTime((pavi?.value ?: 0L).toString(), lsample) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamSetFormat(pavi: COpaquePointer?, lpos: Int, lpformat: COpaquePointer?, cbformat: Int): Hresult =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_aVIStreamSetFormat((pavi?.value ?: 0L).toString(), lpos, (lpformat?.value ?: 0L).toString(), cbformat) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamStart(pavi: COpaquePointer?): Int =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_aVIStreamStart((pavi?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamTimeToSample(pavi: COpaquePointer?, ltime: Int): Int =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_aVIStreamTimeToSample((pavi?.value ?: 0L).toString(), ltime) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamWrite(pavi: COpaquePointer?, lstart: Int, lsamples: Int, lpbuffer: COpaquePointer?, cbbuffer: Int, dwflags: UInt, plsampwritten: COpaquePointer?, plbyteswritten: COpaquePointer?): Hresult =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_aVIStreamWrite((pavi?.value ?: 0L).toString(), lstart, lsamples, (lpbuffer?.value ?: 0L).toString(), cbbuffer, dwflags.toInt(), (plsampwritten?.value ?: 0L).toString(), (plbyteswritten?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamWriteData(pavi: COpaquePointer?, fcc: UInt, lp: COpaquePointer?, cb: Int): Hresult =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_aVIStreamWriteData((pavi?.value ?: 0L).toString(), fcc.toInt(), (lp?.value ?: 0L).toString(), cb) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeDriver(hdriver: Hdrvr, lparam1: Lparam, lparam2: Lparam): Lresult =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_closeDriver((hdriver?.value ?: 0L).toString(), lparam1.toString(), lparam2.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createEditableStream(ppseditable: COpaquePointer?, pssource: COpaquePointer?): Hresult =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_createEditableStream((ppseditable?.value ?: 0L).toString(), (pssource?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun defDriverProc(dwdriveridentifier: ULong, hdrvr: Hdrvr, umsg: UInt, lparam1: Lparam, lparam2: Lparam): Lresult =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_defDriverProc(dwdriveridentifier.toString(), (hdrvr?.value ?: 0L).toString(), umsg.toInt(), lparam1.toString(), lparam2.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawDibBegin(hdd: Long, hdc: Hdc, dxdst: Int, dydst: Int, lpbi: COpaquePointer?, dxsrc: Int, dysrc: Int, wflags: UInt): Bool =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_drawDibBegin(hdd.toString(), (hdc?.value ?: 0L).toString(), dxdst, dydst, (lpbi?.value ?: 0L).toString(), dxsrc, dysrc, wflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawDibChangePalette(hdd: Long, istart: Int, ilen: Int, lppe: COpaquePointer?): Bool =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_drawDibChangePalette(hdd.toString(), istart, ilen, (lppe?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawDibClose(hdd: Long): Bool =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_drawDibClose(hdd.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawDibDraw(hdd: Long, hdc: Hdc, xdst: Int, ydst: Int, dxdst: Int, dydst: Int, lpbi: COpaquePointer?, lpbits: COpaquePointer?, xsrc: Int, ysrc: Int, dxsrc: Int, dysrc: Int, wflags: UInt): Bool =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_drawDibDraw(hdd.toString(), (hdc?.value ?: 0L).toString(), xdst, ydst, dxdst, dydst, (lpbi?.value ?: 0L).toString(), (lpbits?.value ?: 0L).toString(), xsrc, ysrc, dxsrc, dysrc, wflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawDibEnd(hdd: Long): Bool =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_drawDibEnd(hdd.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawDibGetBuffer(hdd: Long, lpbi: COpaquePointer?, dwsize: UInt, dwflags: UInt): COpaquePointer? =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_drawDibGetBuffer(hdd.toString(), (lpbi?.value ?: 0L).toString(), dwsize.toInt(), dwflags.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawDibGetPalette(hdd: Long): Hpalette =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_drawDibGetPalette(hdd.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawDibOpen(): Long =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_drawDibOpen() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawDibProfileDisplay(lpbi: COpaquePointer?): Lresult =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_drawDibProfileDisplay((lpbi?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawDibRealize(hdd: Long, hdc: Hdc, fbackground: Bool): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_drawDibRealize(hdd.toString(), (hdc?.value ?: 0L).toString(), fbackground) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawDibSetPalette(hdd: Long, hpal: Hpalette): Bool =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_drawDibSetPalette(hdd.toString(), (hpal?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawDibStart(hdd: Long, rate: UInt): Bool =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_drawDibStart(hdd.toString(), rate.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawDibStop(hdd: Long): Bool =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_drawDibStop(hdd.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawDibTime(hdd: Long, lpddtime: COpaquePointer?): Bool =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_drawDibTime(hdd.toString(), (lpddtime?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun driverCallback(dwcallback: ULong, dwflags: UInt, hdevice: Hdrvr, dwmsg: UInt, dwuser: ULong, dwparam1: ULong, dwparam2: ULong): Bool =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_driverCallback(dwcallback.toString(), dwflags.toInt(), (hdevice?.value ?: 0L).toString(), dwmsg.toInt(), dwuser.toString(), dwparam1.toString(), dwparam2.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drvGetModuleHandle(hdriver: Hdrvr): Hmodule =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_drvGetModuleHandle((hdriver?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun editStreamClone(pavi: COpaquePointer?, ppresult: COpaquePointer?): Hresult =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_editStreamClone((pavi?.value ?: 0L).toString(), (ppresult?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun editStreamCopy(pavi: COpaquePointer?, plstart: COpaquePointer?, pllength: COpaquePointer?, ppresult: COpaquePointer?): Hresult =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_editStreamCopy((pavi?.value ?: 0L).toString(), (plstart?.value ?: 0L).toString(), (pllength?.value ?: 0L).toString(), (ppresult?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun editStreamCut(pavi: COpaquePointer?, plstart: COpaquePointer?, pllength: COpaquePointer?, ppresult: COpaquePointer?): Hresult =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_editStreamCut((pavi?.value ?: 0L).toString(), (plstart?.value ?: 0L).toString(), (pllength?.value ?: 0L).toString(), (ppresult?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun editStreamPaste(pavi: COpaquePointer?, plpos: COpaquePointer?, pllength: COpaquePointer?, pstream: COpaquePointer?, lstart: Int, lend: Int): Hresult =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_editStreamPaste((pavi?.value ?: 0L).toString(), (plpos?.value ?: 0L).toString(), (pllength?.value ?: 0L).toString(), (pstream?.value ?: 0L).toString(), lstart, lend) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun editStreamSetInfoA(pavi: COpaquePointer?, lpinfo: COpaquePointer?, cbinfo: Int): Hresult =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_editStreamSetInfoA((pavi?.value ?: 0L).toString(), (lpinfo?.value ?: 0L).toString(), cbinfo) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun editStreamSetInfoW(pavi: COpaquePointer?, lpinfo: COpaquePointer?, cbinfo: Int): Hresult =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_editStreamSetInfoW((pavi?.value ?: 0L).toString(), (lpinfo?.value ?: 0L).toString(), cbinfo) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun editStreamSetNameA(pavi: COpaquePointer?, lpszname: Pcstr): Hresult =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_editStreamSetNameA((pavi?.value ?: 0L).toString(), (lpszname?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun editStreamSetNameW(pavi: COpaquePointer?, lpszname: Pcwstr): Hresult =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_editStreamSetNameW((pavi?.value ?: 0L).toString(), (lpszname?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDriverModuleHandle(hdriver: Hdrvr): Hmodule =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_getDriverModuleHandle((hdriver?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getOpenFileNamePreviewA(lpofn: COpaquePointer?): Bool =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_getOpenFileNamePreviewA((lpofn?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getOpenFileNamePreviewW(lpofn: COpaquePointer?): Bool =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_getOpenFileNamePreviewW((lpofn?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSaveFileNamePreviewA(lpofn: COpaquePointer?): Bool =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_getSaveFileNamePreviewA((lpofn?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSaveFileNamePreviewW(lpofn: COpaquePointer?): Bool =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_getSaveFileNamePreviewW((lpofn?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iCClose(hic: Hic): Lresult =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_iCClose((hic?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iCCompress(hic: Hic, dwflags: UInt, lpbioutput: COpaquePointer?, lpdata: COpaquePointer?, lpbiinput: COpaquePointer?, lpbits: COpaquePointer?, lpckid: COpaquePointer?, lpdwflags: COpaquePointer?, lframenum: Int, dwframesize: UInt, dwquality: UInt, lpbiprev: COpaquePointer?, lpprev: COpaquePointer?): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_iCCompress((hic?.value ?: 0L).toString(), dwflags.toInt(), (lpbioutput?.value ?: 0L).toString(), (lpdata?.value ?: 0L).toString(), (lpbiinput?.value ?: 0L).toString(), (lpbits?.value ?: 0L).toString(), (lpckid?.value ?: 0L).toString(), (lpdwflags?.value ?: 0L).toString(), lframenum, dwframesize.toInt(), dwquality.toInt(), (lpbiprev?.value ?: 0L).toString(), (lpprev?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iCCompressorChoose(hwnd: Hwnd, uiflags: UInt, pvin: COpaquePointer?, lpdata: COpaquePointer?, pc: COpaquePointer?, lpsztitle: Pcstr): Bool =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_iCCompressorChoose((hwnd?.value ?: 0L).toString(), uiflags.toInt(), (pvin?.value ?: 0L).toString(), (lpdata?.value ?: 0L).toString(), (pc?.value ?: 0L).toString(), (lpsztitle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iCCompressorFree(pc: COpaquePointer?) {
    if (_windowsWin32MediaMultimediaNapiAddon != null) {
        _windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_iCCompressorFree((pc?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun iCDecompress(hic: Hic, dwflags: UInt, lpbiformat: COpaquePointer?, lpdata: COpaquePointer?, lpbi: COpaquePointer?, lpbits: COpaquePointer?): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_iCDecompress((hic?.value ?: 0L).toString(), dwflags.toInt(), (lpbiformat?.value ?: 0L).toString(), (lpdata?.value ?: 0L).toString(), (lpbi?.value ?: 0L).toString(), (lpbits?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iCDraw(hic: Hic, dwflags: UInt, lpformat: COpaquePointer?, lpdata: COpaquePointer?, cbdata: UInt, ltime: Int): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_iCDraw((hic?.value ?: 0L).toString(), dwflags.toInt(), (lpformat?.value ?: 0L).toString(), (lpdata?.value ?: 0L).toString(), cbdata.toInt(), ltime) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iCDrawBegin(hic: Hic, dwflags: UInt, hpal: Hpalette, hwnd: Hwnd, hdc: Hdc, xdst: Int, ydst: Int, dxdst: Int, dydst: Int, lpbi: COpaquePointer?, xsrc: Int, ysrc: Int, dxsrc: Int, dysrc: Int, dwrate: UInt, dwscale: UInt): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_iCDrawBegin((hic?.value ?: 0L).toString(), dwflags.toInt(), (hpal?.value ?: 0L).toString(), (hwnd?.value ?: 0L).toString(), (hdc?.value ?: 0L).toString(), xdst, ydst, dxdst, dydst, (lpbi?.value ?: 0L).toString(), xsrc, ysrc, dxsrc, dysrc, dwrate.toInt(), dwscale.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iCGetDisplayFormat(hic: Hic, lpbiin: COpaquePointer?, lpbiout: COpaquePointer?, bitdepth: Int, dx: Int, dy: Int): Hic =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_iCGetDisplayFormat((hic?.value ?: 0L).toString(), (lpbiin?.value ?: 0L).toString(), (lpbiout?.value ?: 0L).toString(), bitdepth, dx, dy) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iCGetInfo(hic: Hic, picinfo: COpaquePointer?, cb: UInt): Lresult =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_iCGetInfo((hic?.value ?: 0L).toString(), (picinfo?.value ?: 0L).toString(), cb.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iCImageCompress(hic: Hic, uiflags: UInt, lpbiin: COpaquePointer?, lpbits: COpaquePointer?, lpbiout: COpaquePointer?, lquality: Int, plsize: COpaquePointer?): Handle =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_iCImageCompress((hic?.value ?: 0L).toString(), uiflags.toInt(), (lpbiin?.value ?: 0L).toString(), (lpbits?.value ?: 0L).toString(), (lpbiout?.value ?: 0L).toString(), lquality, (plsize?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iCImageDecompress(hic: Hic, uiflags: UInt, lpbiin: COpaquePointer?, lpbits: COpaquePointer?, lpbiout: COpaquePointer?): Handle =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_iCImageDecompress((hic?.value ?: 0L).toString(), uiflags.toInt(), (lpbiin?.value ?: 0L).toString(), (lpbits?.value ?: 0L).toString(), (lpbiout?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iCInfo(fcctype: UInt, fcchandler: UInt, lpicinfo: COpaquePointer?): Bool =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_iCInfo(fcctype.toInt(), fcchandler.toInt(), (lpicinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iCInstall(fcctype: UInt, fcchandler: UInt, lparam: Lparam, szdesc: Pcstr, wflags: UInt): Bool =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_iCInstall(fcctype.toInt(), fcchandler.toInt(), lparam.toString(), (szdesc?.value ?: 0L).toString(), wflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iCLocate(fcctype: UInt, fcchandler: UInt, lpbiin: COpaquePointer?, lpbiout: COpaquePointer?, wflags: UShort): Hic =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_iCLocate(fcctype.toInt(), fcchandler.toInt(), (lpbiin?.value ?: 0L).toString(), (lpbiout?.value ?: 0L).toString(), wflags.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iCOpen(fcctype: UInt, fcchandler: UInt, wmode: UInt): Hic =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_iCOpen(fcctype.toInt(), fcchandler.toInt(), wmode.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iCOpenFunction(fcctype: UInt, fcchandler: UInt, wmode: UInt, lpfnhandler: Farproc): Hic =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iCRemove(fcctype: UInt, fcchandler: UInt, wflags: UInt): Bool =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_iCRemove(fcctype.toInt(), fcchandler.toInt(), wflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iCSendMessage(hic: Hic, msg: UInt, dw1: ULong, dw2: ULong): Lresult =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_iCSendMessage((hic?.value ?: 0L).toString(), msg.toInt(), dw1.toString(), dw2.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iCSeqCompressFrame(pc: COpaquePointer?, uiflags: UInt, lpbits: COpaquePointer?, pfkey: COpaquePointer?, plsize: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_iCSeqCompressFrame((pc?.value ?: 0L).toString(), uiflags.toInt(), (lpbits?.value ?: 0L).toString(), (pfkey?.value ?: 0L).toString(), (plsize?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iCSeqCompressFrameEnd(pc: COpaquePointer?) {
    if (_windowsWin32MediaMultimediaNapiAddon != null) {
        _windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_iCSeqCompressFrameEnd((pc?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun iCSeqCompressFrameStart(pc: COpaquePointer?, lpbiin: COpaquePointer?): Bool =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_iCSeqCompressFrameStart((pc?.value ?: 0L).toString(), (lpbiin?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mCIWndCreateA(hwndparent: Hwnd, hinstance: Hinstance, dwstyle: UInt, szfile: Pcstr): Hwnd =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mCIWndCreateA((hwndparent?.value ?: 0L).toString(), (hinstance?.value ?: 0L).toString(), dwstyle.toInt(), (szfile?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mCIWndCreateW(hwndparent: Hwnd, hinstance: Hinstance, dwstyle: UInt, szfile: Pcwstr): Hwnd =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mCIWndCreateW((hwndparent?.value ?: 0L).toString(), (hinstance?.value ?: 0L).toString(), dwstyle.toInt(), (szfile?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mCIWndRegisterClass(): Bool =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mCIWndRegisterClass() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openDriver(szdrivername: Pcwstr, szsectionname: Pcwstr, lparam2: Lparam): Hdrvr =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_openDriver((szdrivername?.value ?: 0L).toString(), (szsectionname?.value ?: 0L).toString(), lparam2.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendDriverMessage(hdriver: Hdrvr, message: UInt, lparam1: Lparam, lparam2: Lparam): Lresult =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_sendDriverMessage((hdriver?.value ?: 0L).toString(), message.toInt(), lparam1.toString(), lparam2.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun videoForWindowsVersion(): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_videoForWindowsVersion() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capCreateCaptureWindowA(lpszwindowname: Pcstr, dwstyle: UInt, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: Hwnd, nid: Int): Hwnd =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_capCreateCaptureWindowA((lpszwindowname?.value ?: 0L).toString(), dwstyle.toInt(), x, y, nwidth, nheight, (hwndparent?.value ?: 0L).toString(), nid) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capCreateCaptureWindowW(lpszwindowname: Pcwstr, dwstyle: UInt, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: Hwnd, nid: Int): Hwnd =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_capCreateCaptureWindowW((lpszwindowname?.value ?: 0L).toString(), dwstyle.toInt(), x, y, nwidth, nheight, (hwndparent?.value ?: 0L).toString(), nid) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capGetDriverDescriptionA(wdriverindex: UInt, lpszname: Pstr, cbname: Int, lpszver: Pstr, cbver: Int): Bool =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_capGetDriverDescriptionA(wdriverindex.toInt(), (lpszname?.value ?: 0L).toString(), cbname, (lpszver?.value ?: 0L).toString(), cbver) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capGetDriverDescriptionW(wdriverindex: UInt, lpszname: Pwstr, cbname: Int, lpszver: Pwstr, cbver: Int): Bool =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_capGetDriverDescriptionW(wdriverindex.toInt(), (lpszname?.value ?: 0L).toString(), cbname, (lpszver?.value ?: 0L).toString(), cbver) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun joyGetDevCapsA(ujoyid: ULong, pjc: COpaquePointer?, cbjc: UInt): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_joyGetDevCapsA(ujoyid.toString(), (pjc?.value ?: 0L).toString(), cbjc.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun joyGetDevCapsW(ujoyid: ULong, pjc: COpaquePointer?, cbjc: UInt): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_joyGetDevCapsW(ujoyid.toString(), (pjc?.value ?: 0L).toString(), cbjc.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun joyGetNumDevs(): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_joyGetNumDevs() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun joyGetPos(ujoyid: UInt, pji: COpaquePointer?): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_joyGetPos(ujoyid.toInt(), (pji?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun joyGetPosEx(ujoyid: UInt, pji: COpaquePointer?): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_joyGetPosEx(ujoyid.toInt(), (pji?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun joyGetThreshold(ujoyid: UInt, puthreshold: COpaquePointer?): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_joyGetThreshold(ujoyid.toInt(), (puthreshold?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun joyReleaseCapture(ujoyid: UInt): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_joyReleaseCapture(ujoyid.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun joySetCapture(hwnd: Hwnd, ujoyid: UInt, uperiod: UInt, fchanged: Bool): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_joySetCapture((hwnd?.value ?: 0L).toString(), ujoyid.toInt(), uperiod.toInt(), fchanged) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun joySetThreshold(ujoyid: UInt, uthreshold: UInt): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_joySetThreshold(ujoyid.toInt(), uthreshold.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mciDriverNotify(hwndcallback: Handle, wdeviceid: UInt, ustatus: UInt): Bool =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mciDriverNotify((hwndcallback?.value ?: 0L).toString(), wdeviceid.toInt(), ustatus.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mciDriverYield(wdeviceid: UInt): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mciDriverYield(wdeviceid.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mciFreeCommandResource(wtable: UInt): Bool =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mciFreeCommandResource(wtable.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mciGetCreatorTask(mciid: UInt): Htask =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mciGetCreatorTask(mciid.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mciGetDeviceIDA(pszdevice: Pcstr): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mciGetDeviceIDA((pszdevice?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mciGetDeviceIDFromElementIDA(dwelementid: UInt, lpstrtype: Pcstr): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mciGetDeviceIDFromElementIDA(dwelementid.toInt(), (lpstrtype?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mciGetDeviceIDFromElementIDW(dwelementid: UInt, lpstrtype: Pcwstr): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mciGetDeviceIDFromElementIDW(dwelementid.toInt(), (lpstrtype?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mciGetDeviceIDW(pszdevice: Pcwstr): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mciGetDeviceIDW((pszdevice?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mciGetDriverData(wdeviceid: UInt): ULong =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mciGetDriverData(wdeviceid.toInt()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mciGetErrorStringA(mcierr: UInt, psztext: Pstr, cchtext: UInt): Bool =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mciGetErrorStringA(mcierr.toInt(), (psztext?.value ?: 0L).toString(), cchtext.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mciGetErrorStringW(mcierr: UInt, psztext: Pwstr, cchtext: UInt): Bool =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mciGetErrorStringW(mcierr.toInt(), (psztext?.value ?: 0L).toString(), cchtext.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mciGetYieldProc(mciid: UInt, pdwyielddata: COpaquePointer?): Yieldproc =
    if (_windowsWin32MediaMultimediaNapiAddon != null) null else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mciLoadCommandResource(hinstance: Handle, lpresname: Pcwstr, wtype: UInt): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mciLoadCommandResource((hinstance?.value ?: 0L).toString(), (lpresname?.value ?: 0L).toString(), wtype.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mciSendCommandA(mciid: UInt, umsg: UInt, dwparam1: ULong, dwparam2: ULong): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mciSendCommandA(mciid.toInt(), umsg.toInt(), dwparam1.toString(), dwparam2.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mciSendCommandW(mciid: UInt, umsg: UInt, dwparam1: ULong, dwparam2: ULong): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mciSendCommandW(mciid.toInt(), umsg.toInt(), dwparam1.toString(), dwparam2.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mciSendStringA(lpstrcommand: Pcstr, lpstrreturnstring: Pstr, ureturnlength: UInt, hwndcallback: Hwnd): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mciSendStringA((lpstrcommand?.value ?: 0L).toString(), (lpstrreturnstring?.value ?: 0L).toString(), ureturnlength.toInt(), (hwndcallback?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mciSendStringW(lpstrcommand: Pcwstr, lpstrreturnstring: Pwstr, ureturnlength: UInt, hwndcallback: Hwnd): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mciSendStringW((lpstrcommand?.value ?: 0L).toString(), (lpstrreturnstring?.value ?: 0L).toString(), ureturnlength.toInt(), (hwndcallback?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mciSetDriverData(wdeviceid: UInt, dwdata: ULong): Bool =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mciSetDriverData(wdeviceid.toInt(), dwdata.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mciSetYieldProc(mciid: UInt, fpyieldproc: Yieldproc, dwyielddata: UInt): Bool =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mciSetYieldProc(mciid.toInt(), 0L.toString(), dwyielddata.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmDrvInstall(hdriver: Hdrvr, wszdrventry: Pcwstr, drvmessage: Drivermsgproc, wflags: UInt): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mmDrvInstall((hdriver?.value ?: 0L).toString(), (wszdrventry?.value ?: 0L).toString(), 0L.toString(), wflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmGetCurrentTask(): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mmGetCurrentTask() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmTaskBlock(h: UInt) {
    if (_windowsWin32MediaMultimediaNapiAddon != null) {
        _windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mmTaskBlock(h.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mmTaskCreate(lpfn: Lptaskcallback, lph: COpaquePointer?, dwinst: ULong): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mmTaskCreate(0L.toString(), (lph?.value ?: 0L).toString(), dwinst.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmTaskSignal(h: UInt): Bool =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mmTaskSignal(h.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmTaskYield() {
    if (_windowsWin32MediaMultimediaNapiAddon != null) {
        _windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mmTaskYield()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mmioAdvance(hmmio: Hmmio, pmmioinfo: COpaquePointer?, fuadvance: UInt): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mmioAdvance((hmmio?.value ?: 0L).toString(), (pmmioinfo?.value ?: 0L).toString(), fuadvance.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmioAscend(hmmio: Hmmio, pmmcki: COpaquePointer?, fuascend: UInt): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mmioAscend((hmmio?.value ?: 0L).toString(), (pmmcki?.value ?: 0L).toString(), fuascend.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmioClose(hmmio: Hmmio, fuclose: UInt): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mmioClose((hmmio?.value ?: 0L).toString(), fuclose.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmioCreateChunk(hmmio: Hmmio, pmmcki: COpaquePointer?, fucreate: UInt): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mmioCreateChunk((hmmio?.value ?: 0L).toString(), (pmmcki?.value ?: 0L).toString(), fucreate.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmioDescend(hmmio: Hmmio, pmmcki: COpaquePointer?, pmmckiparent: COpaquePointer?, fudescend: UInt): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mmioDescend((hmmio?.value ?: 0L).toString(), (pmmcki?.value ?: 0L).toString(), (pmmckiparent?.value ?: 0L).toString(), fudescend.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmioFlush(hmmio: Hmmio, fuflush: UInt): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mmioFlush((hmmio?.value ?: 0L).toString(), fuflush.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmioGetInfo(hmmio: Hmmio, pmmioinfo: COpaquePointer?, fuinfo: UInt): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mmioGetInfo((hmmio?.value ?: 0L).toString(), (pmmioinfo?.value ?: 0L).toString(), fuinfo.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmioInstallIOProcA(fccioproc: UInt, pioproc: Lpmmioproc, dwflags: UInt): Lpmmioproc =
    if (_windowsWin32MediaMultimediaNapiAddon != null) null else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmioInstallIOProcW(fccioproc: UInt, pioproc: Lpmmioproc, dwflags: UInt): Lpmmioproc =
    if (_windowsWin32MediaMultimediaNapiAddon != null) null else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmioOpenA(pszfilename: Pstr, pmmioinfo: COpaquePointer?, fdwopen: UInt): Hmmio =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mmioOpenA((pszfilename?.value ?: 0L).toString(), (pmmioinfo?.value ?: 0L).toString(), fdwopen.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmioOpenW(pszfilename: Pwstr, pmmioinfo: COpaquePointer?, fdwopen: UInt): Hmmio =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mmioOpenW((pszfilename?.value ?: 0L).toString(), (pmmioinfo?.value ?: 0L).toString(), fdwopen.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmioRead(hmmio: Hmmio, pch: COpaquePointer?, cch: Int): Int =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mmioRead((hmmio?.value ?: 0L).toString(), (pch?.value ?: 0L).toString(), cch) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmioRenameA(pszfilename: Pcstr, psznewfilename: Pcstr, pmmioinfo: COpaquePointer?, fdwrename: UInt): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mmioRenameA((pszfilename?.value ?: 0L).toString(), (psznewfilename?.value ?: 0L).toString(), (pmmioinfo?.value ?: 0L).toString(), fdwrename.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmioRenameW(pszfilename: Pcwstr, psznewfilename: Pcwstr, pmmioinfo: COpaquePointer?, fdwrename: UInt): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mmioRenameW((pszfilename?.value ?: 0L).toString(), (psznewfilename?.value ?: 0L).toString(), (pmmioinfo?.value ?: 0L).toString(), fdwrename.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmioSeek(hmmio: Hmmio, loffset: Int, iorigin: Int): Int =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mmioSeek((hmmio?.value ?: 0L).toString(), loffset, iorigin) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmioSendMessage(hmmio: Hmmio, umsg: UInt, lparam1: Lparam, lparam2: Lparam): Lresult =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mmioSendMessage((hmmio?.value ?: 0L).toString(), umsg.toInt(), lparam1.toString(), lparam2.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmioSetBuffer(hmmio: Hmmio, pchbuffer: Pstr, cchbuffer: Int, fubuffer: UInt): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mmioSetBuffer((hmmio?.value ?: 0L).toString(), (pchbuffer?.value ?: 0L).toString(), cchbuffer, fubuffer.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmioSetInfo(hmmio: Hmmio, pmmioinfo: COpaquePointer?, fuinfo: UInt): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mmioSetInfo((hmmio?.value ?: 0L).toString(), (pmmioinfo?.value ?: 0L).toString(), fuinfo.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmioStringToFOURCCA(sz: Pcstr, uflags: UInt): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mmioStringToFOURCCA((sz?.value ?: 0L).toString(), uflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmioStringToFOURCCW(sz: Pcwstr, uflags: UInt): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mmioStringToFOURCCW((sz?.value ?: 0L).toString(), uflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmioWrite(hmmio: Hmmio, pch: Pcstr, cch: Int): Int =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mmioWrite((hmmio?.value ?: 0L).toString(), (pch?.value ?: 0L).toString(), cch) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sndOpenSound(eventname: Pcwstr, appname: Pcwstr, flags: Int, filehandle: COpaquePointer?): Int =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_sndOpenSound((eventname?.value ?: 0L).toString(), (appname?.value ?: 0L).toString(), flags, (filehandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
