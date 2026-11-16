@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.media.multimedia

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
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

private val windowsWin32MediaMultimediaNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun aVIBuildFilterA(lpszfilter: Pstr, cbfilter: Int, fsaving: Bool): Hresult =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaAVIBuildFilterA(lpszfilter.rawAddress.toString(), cbfilter, fsaving) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIBuildFilterW(lpszfilter: Pwstr, cbfilter: Int, fsaving: Bool): Hresult =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaAVIBuildFilterW(lpszfilter.rawAddress.toString(), cbfilter, fsaving) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIClearClipboard(): Hresult =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaAVIClearClipboard() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIFileAddRef(pfile: MutPtr): UInt =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaAVIFileAddRef(pfile.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIFileCreateStreamA(pfile: MutPtr, ppavi: MutPtr, psi: ConstPtr): Hresult =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaAVIFileCreateStreamA(pfile.rawAddress.toString(), ppavi.rawAddress.toString(), psi.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIFileCreateStreamW(pfile: MutPtr, ppavi: MutPtr, psi: ConstPtr): Hresult =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaAVIFileCreateStreamW(pfile.rawAddress.toString(), ppavi.rawAddress.toString(), psi.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIFileEndRecord(pfile: MutPtr): Hresult =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaAVIFileEndRecord(pfile.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIFileExit() {
    if (windowsWin32MediaMultimediaNapiAddon != null) {
        windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaAVIFileExit()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun aVIFileGetStream(pfile: MutPtr, ppavi: MutPtr, fcctype: UInt, lparam: Int): Hresult =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaAVIFileGetStream(pfile.rawAddress.toString(), ppavi.rawAddress.toString(), fcctype.toInt(), lparam) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIFileInfoA(pfile: MutPtr, pfi: MutPtr, lsize: Int): Hresult =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaAVIFileInfoA(pfile.rawAddress.toString(), pfi.rawAddress.toString(), lsize) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIFileInfoW(pfile: MutPtr, pfi: MutPtr, lsize: Int): Hresult =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaAVIFileInfoW(pfile.rawAddress.toString(), pfi.rawAddress.toString(), lsize) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIFileInit() {
    if (windowsWin32MediaMultimediaNapiAddon != null) {
        windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaAVIFileInit()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun aVIFileOpenA(ppfile: MutPtr, szfile: Pcstr, umode: UInt, lphandler: ConstPtr): Hresult =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaAVIFileOpenA(ppfile.rawAddress.toString(), szfile.rawAddress.toString(), umode.toInt(), lphandler.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIFileOpenW(ppfile: MutPtr, szfile: Pcwstr, umode: UInt, lphandler: ConstPtr): Hresult =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaAVIFileOpenW(ppfile.rawAddress.toString(), szfile.rawAddress.toString(), umode.toInt(), lphandler.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIFileReadData(pfile: MutPtr, ckid: UInt, lpdata: MutPtr, lpcbdata: MutPtr): Hresult =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaAVIFileReadData(pfile.rawAddress.toString(), ckid.toInt(), lpdata.rawAddress.toString(), lpcbdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIFileRelease(pfile: MutPtr): UInt =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaAVIFileRelease(pfile.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIFileWriteData(pfile: MutPtr, ckid: UInt, lpdata: ConstPtr, cbdata: Int): Hresult =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaAVIFileWriteData(pfile.rawAddress.toString(), ckid.toInt(), lpdata.rawAddress.toString(), cbdata) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIGetFromClipboard(lppf: MutPtr): Hresult =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaAVIGetFromClipboard(lppf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIMakeCompressedStream(ppscompressed: MutPtr, ppssource: MutPtr, lpoptions: ConstPtr, pclsidhandler: ConstPtr): Hresult =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaAVIMakeCompressedStream(ppscompressed.rawAddress.toString(), ppssource.rawAddress.toString(), lpoptions.rawAddress.toString(), pclsidhandler.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIMakeFileFromStreams(ppfile: MutPtr, nstreams: Int, papstreams: ConstPtr): Hresult =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaAVIMakeFileFromStreams(ppfile.rawAddress.toString(), nstreams, papstreams.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIMakeStreamFromClipboard(cfformat: UInt, hglobal: Handle, ppstream: MutPtr): Hresult =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaAVIMakeStreamFromClipboard(cfformat.toInt(), hglobal.rawAddress.toString(), ppstream.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIPutFileOnClipboard(pf: MutPtr): Hresult =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaAVIPutFileOnClipboard(pf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVISaveA(szfile: Pcstr, pclsidhandler: ConstPtr, lpfncallback: Avisavecallback, nstreams: Int, pfile: MutPtr, lpoptions: ConstPtr, vararg variadicArgs: Long): Hresult =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaAVISaveA(szfile.rawAddress.toString(), pclsidhandler.rawAddress.toString(), 0L.toString(), nstreams, pfile.rawAddress.toString(), lpoptions.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVISaveOptions(hwnd: Hwnd, uiflags: UInt, nstreams: Int, ppavi: ConstPtr, plpoptions: MutPtr): Long =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaAVISaveOptions(hwnd.rawAddress.toString(), uiflags.toInt(), nstreams, ppavi.rawAddress.toString(), plpoptions.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVISaveOptionsFree(nstreams: Int, plpoptions: ConstPtr): Hresult =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaAVISaveOptionsFree(nstreams, plpoptions.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVISaveVA(szfile: Pcstr, pclsidhandler: ConstPtr, lpfncallback: Avisavecallback, nstreams: Int, ppavi: ConstPtr, plpoptions: ConstPtr): Hresult =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaAVISaveVA(szfile.rawAddress.toString(), pclsidhandler.rawAddress.toString(), 0L.toString(), nstreams, ppavi.rawAddress.toString(), plpoptions.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVISaveVW(szfile: Pcwstr, pclsidhandler: ConstPtr, lpfncallback: Avisavecallback, nstreams: Int, ppavi: ConstPtr, plpoptions: ConstPtr): Hresult =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaAVISaveVW(szfile.rawAddress.toString(), pclsidhandler.rawAddress.toString(), 0L.toString(), nstreams, ppavi.rawAddress.toString(), plpoptions.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVISaveW(szfile: Pcwstr, pclsidhandler: ConstPtr, lpfncallback: Avisavecallback, nstreams: Int, pfile: MutPtr, lpoptions: ConstPtr, vararg variadicArgs: Long): Hresult =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaAVISaveW(szfile.rawAddress.toString(), pclsidhandler.rawAddress.toString(), 0L.toString(), nstreams, pfile.rawAddress.toString(), lpoptions.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamAddRef(pavi: MutPtr): UInt =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaAVIStreamAddRef(pavi.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamBeginStreaming(pavi: MutPtr, lstart: Int, lend: Int, lrate: Int): Hresult =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaAVIStreamBeginStreaming(pavi.rawAddress.toString(), lstart, lend, lrate) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamCreate(ppavi: MutPtr, lparam1: Int, lparam2: Int, pclsidhandler: ConstPtr): Hresult =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaAVIStreamCreate(ppavi.rawAddress.toString(), lparam1, lparam2, pclsidhandler.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamEndStreaming(pavi: MutPtr): Hresult =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaAVIStreamEndStreaming(pavi.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamFindSample(pavi: MutPtr, lpos: Int, lflags: Int): Int =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaAVIStreamFindSample(pavi.rawAddress.toString(), lpos, lflags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamGetFrame(pg: MutPtr, lpos: Int): MutPtr =
    if (windowsWin32MediaMultimediaNapiAddon != null) MutPtr((windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaAVIStreamGetFrame(pg.rawAddress.toString(), lpos) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamGetFrameClose(pg: MutPtr): Hresult =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaAVIStreamGetFrameClose(pg.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamGetFrameOpen(pavi: MutPtr, lpbiwanted: ConstPtr): MutPtr =
    if (windowsWin32MediaMultimediaNapiAddon != null) MutPtr((windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaAVIStreamGetFrameOpen(pavi.rawAddress.toString(), lpbiwanted.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamInfoA(pavi: MutPtr, psi: MutPtr, lsize: Int): Hresult =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaAVIStreamInfoA(pavi.rawAddress.toString(), psi.rawAddress.toString(), lsize) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamInfoW(pavi: MutPtr, psi: MutPtr, lsize: Int): Hresult =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaAVIStreamInfoW(pavi.rawAddress.toString(), psi.rawAddress.toString(), lsize) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamLength(pavi: MutPtr): Int =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaAVIStreamLength(pavi.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamOpenFromFileA(ppavi: MutPtr, szfile: Pcstr, fcctype: UInt, lparam: Int, mode: UInt, pclsidhandler: ConstPtr): Hresult =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaAVIStreamOpenFromFileA(ppavi.rawAddress.toString(), szfile.rawAddress.toString(), fcctype.toInt(), lparam, mode.toInt(), pclsidhandler.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamOpenFromFileW(ppavi: MutPtr, szfile: Pcwstr, fcctype: UInt, lparam: Int, mode: UInt, pclsidhandler: ConstPtr): Hresult =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaAVIStreamOpenFromFileW(ppavi.rawAddress.toString(), szfile.rawAddress.toString(), fcctype.toInt(), lparam, mode.toInt(), pclsidhandler.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamRead(pavi: MutPtr, lstart: Int, lsamples: Int, lpbuffer: MutPtr, cbbuffer: Int, plbytes: MutPtr, plsamples: MutPtr): Hresult =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaAVIStreamRead(pavi.rawAddress.toString(), lstart, lsamples, lpbuffer.rawAddress.toString(), cbbuffer, plbytes.rawAddress.toString(), plsamples.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamReadData(pavi: MutPtr, fcc: UInt, lp: MutPtr, lpcb: MutPtr): Hresult =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaAVIStreamReadData(pavi.rawAddress.toString(), fcc.toInt(), lp.rawAddress.toString(), lpcb.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamReadFormat(pavi: MutPtr, lpos: Int, lpformat: MutPtr, lpcbformat: MutPtr): Hresult =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaAVIStreamReadFormat(pavi.rawAddress.toString(), lpos, lpformat.rawAddress.toString(), lpcbformat.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamRelease(pavi: MutPtr): UInt =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaAVIStreamRelease(pavi.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamSampleToTime(pavi: MutPtr, lsample: Int): Int =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaAVIStreamSampleToTime(pavi.rawAddress.toString(), lsample) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamSetFormat(pavi: MutPtr, lpos: Int, lpformat: ConstPtr, cbformat: Int): Hresult =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaAVIStreamSetFormat(pavi.rawAddress.toString(), lpos, lpformat.rawAddress.toString(), cbformat) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamStart(pavi: MutPtr): Int =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaAVIStreamStart(pavi.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamTimeToSample(pavi: MutPtr, ltime: Int): Int =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaAVIStreamTimeToSample(pavi.rawAddress.toString(), ltime) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamWrite(pavi: MutPtr, lstart: Int, lsamples: Int, lpbuffer: ConstPtr, cbbuffer: Int, dwflags: UInt, plsampwritten: MutPtr, plbyteswritten: MutPtr): Hresult =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaAVIStreamWrite(pavi.rawAddress.toString(), lstart, lsamples, lpbuffer.rawAddress.toString(), cbbuffer, dwflags.toInt(), plsampwritten.rawAddress.toString(), plbyteswritten.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamWriteData(pavi: MutPtr, fcc: UInt, lp: ConstPtr, cb: Int): Hresult =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaAVIStreamWriteData(pavi.rawAddress.toString(), fcc.toInt(), lp.rawAddress.toString(), cb) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeDriver(hdriver: Hdrvr, lparam1: Lparam, lparam2: Lparam): Lresult =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaCloseDriver(hdriver.rawAddress.toString(), lparam1.toString(), lparam2.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createEditableStream(ppseditable: MutPtr, pssource: MutPtr): Hresult =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaCreateEditableStream(ppseditable.rawAddress.toString(), pssource.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun defDriverProc(dwdriveridentifier: ULong, hdrvr: Hdrvr, umsg: UInt, lparam1: Lparam, lparam2: Lparam): Lresult =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaDefDriverProc(dwdriveridentifier.toString(), hdrvr.rawAddress.toString(), umsg.toInt(), lparam1.toString(), lparam2.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawDibBegin(hdd: Long, hdc: Hdc, dxdst: Int, dydst: Int, lpbi: ConstPtr, dxsrc: Int, dysrc: Int, wflags: UInt): Bool =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaDrawDibBegin(hdd.toString(), hdc.rawAddress.toString(), dxdst, dydst, lpbi.rawAddress.toString(), dxsrc, dysrc, wflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawDibChangePalette(hdd: Long, istart: Int, ilen: Int, lppe: ConstPtr): Bool =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaDrawDibChangePalette(hdd.toString(), istart, ilen, lppe.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawDibClose(hdd: Long): Bool =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaDrawDibClose(hdd.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawDibDraw(hdd: Long, hdc: Hdc, xdst: Int, ydst: Int, dxdst: Int, dydst: Int, lpbi: ConstPtr, lpbits: ConstPtr, xsrc: Int, ysrc: Int, dxsrc: Int, dysrc: Int, wflags: UInt): Bool =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaDrawDibDraw(hdd.toString(), hdc.rawAddress.toString(), xdst, ydst, dxdst, dydst, lpbi.rawAddress.toString(), lpbits.rawAddress.toString(), xsrc, ysrc, dxsrc, dysrc, wflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawDibEnd(hdd: Long): Bool =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaDrawDibEnd(hdd.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawDibGetBuffer(hdd: Long, lpbi: MutPtr, dwsize: UInt, dwflags: UInt): MutPtr =
    if (windowsWin32MediaMultimediaNapiAddon != null) MutPtr((windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaDrawDibGetBuffer(hdd.toString(), lpbi.rawAddress.toString(), dwsize.toInt(), dwflags.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawDibGetPalette(hdd: Long): Hpalette =
    if (windowsWin32MediaMultimediaNapiAddon != null) MutPtr((windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaDrawDibGetPalette(hdd.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawDibOpen(): Long =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaDrawDibOpen() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawDibProfileDisplay(lpbi: ConstPtr): Lresult =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaDrawDibProfileDisplay(lpbi.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawDibRealize(hdd: Long, hdc: Hdc, fbackground: Bool): UInt =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaDrawDibRealize(hdd.toString(), hdc.rawAddress.toString(), fbackground) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawDibSetPalette(hdd: Long, hpal: Hpalette): Bool =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaDrawDibSetPalette(hdd.toString(), hpal.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawDibStart(hdd: Long, rate: UInt): Bool =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaDrawDibStart(hdd.toString(), rate.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawDibStop(hdd: Long): Bool =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaDrawDibStop(hdd.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawDibTime(hdd: Long, lpddtime: MutPtr): Bool =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaDrawDibTime(hdd.toString(), lpddtime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun driverCallback(dwcallback: ULong, dwflags: UInt, hdevice: Hdrvr, dwmsg: UInt, dwuser: ULong, dwparam1: ULong, dwparam2: ULong): Bool =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaDriverCallback(dwcallback.toString(), dwflags.toInt(), hdevice.rawAddress.toString(), dwmsg.toInt(), dwuser.toString(), dwparam1.toString(), dwparam2.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drvGetModuleHandle(hdriver: Hdrvr): Hmodule =
    if (windowsWin32MediaMultimediaNapiAddon != null) MutPtr((windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaDrvGetModuleHandle(hdriver.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun editStreamClone(pavi: MutPtr, ppresult: MutPtr): Hresult =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaEditStreamClone(pavi.rawAddress.toString(), ppresult.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun editStreamCopy(pavi: MutPtr, plstart: MutPtr, pllength: MutPtr, ppresult: MutPtr): Hresult =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaEditStreamCopy(pavi.rawAddress.toString(), plstart.rawAddress.toString(), pllength.rawAddress.toString(), ppresult.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun editStreamCut(pavi: MutPtr, plstart: MutPtr, pllength: MutPtr, ppresult: MutPtr): Hresult =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaEditStreamCut(pavi.rawAddress.toString(), plstart.rawAddress.toString(), pllength.rawAddress.toString(), ppresult.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun editStreamPaste(pavi: MutPtr, plpos: MutPtr, pllength: MutPtr, pstream: MutPtr, lstart: Int, lend: Int): Hresult =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaEditStreamPaste(pavi.rawAddress.toString(), plpos.rawAddress.toString(), pllength.rawAddress.toString(), pstream.rawAddress.toString(), lstart, lend) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun editStreamSetInfoA(pavi: MutPtr, lpinfo: ConstPtr, cbinfo: Int): Hresult =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaEditStreamSetInfoA(pavi.rawAddress.toString(), lpinfo.rawAddress.toString(), cbinfo) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun editStreamSetInfoW(pavi: MutPtr, lpinfo: ConstPtr, cbinfo: Int): Hresult =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaEditStreamSetInfoW(pavi.rawAddress.toString(), lpinfo.rawAddress.toString(), cbinfo) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun editStreamSetNameA(pavi: MutPtr, lpszname: Pcstr): Hresult =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaEditStreamSetNameA(pavi.rawAddress.toString(), lpszname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun editStreamSetNameW(pavi: MutPtr, lpszname: Pcwstr): Hresult =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaEditStreamSetNameW(pavi.rawAddress.toString(), lpszname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDriverModuleHandle(hdriver: Hdrvr): Hmodule =
    if (windowsWin32MediaMultimediaNapiAddon != null) MutPtr((windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaGetDriverModuleHandle(hdriver.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getOpenFileNamePreviewA(lpofn: MutPtr): Bool =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaGetOpenFileNamePreviewA(lpofn.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getOpenFileNamePreviewW(lpofn: MutPtr): Bool =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaGetOpenFileNamePreviewW(lpofn.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSaveFileNamePreviewA(lpofn: MutPtr): Bool =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaGetSaveFileNamePreviewA(lpofn.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSaveFileNamePreviewW(lpofn: MutPtr): Bool =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaGetSaveFileNamePreviewW(lpofn.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iCClose(hic: Hic): Lresult =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaICClose(hic.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iCCompress(hic: Hic, dwflags: UInt, lpbioutput: ConstPtr, lpdata: MutPtr, lpbiinput: ConstPtr, lpbits: ConstPtr, lpckid: MutPtr, lpdwflags: MutPtr, lframenum: Int, dwframesize: UInt, dwquality: UInt, lpbiprev: ConstPtr, lpprev: ConstPtr): UInt =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaICCompress(hic.rawAddress.toString(), dwflags.toInt(), lpbioutput.rawAddress.toString(), lpdata.rawAddress.toString(), lpbiinput.rawAddress.toString(), lpbits.rawAddress.toString(), lpckid.rawAddress.toString(), lpdwflags.rawAddress.toString(), lframenum, dwframesize.toInt(), dwquality.toInt(), lpbiprev.rawAddress.toString(), lpprev.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iCCompressorChoose(hwnd: Hwnd, uiflags: UInt, pvin: ConstPtr, lpdata: ConstPtr, pc: MutPtr, lpsztitle: Pcstr): Bool =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaICCompressorChoose(hwnd.rawAddress.toString(), uiflags.toInt(), pvin.rawAddress.toString(), lpdata.rawAddress.toString(), pc.rawAddress.toString(), lpsztitle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iCCompressorFree(pc: ConstPtr) {
    if (windowsWin32MediaMultimediaNapiAddon != null) {
        windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaICCompressorFree(pc.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun iCDecompress(hic: Hic, dwflags: UInt, lpbiformat: ConstPtr, lpdata: ConstPtr, lpbi: ConstPtr, lpbits: MutPtr): UInt =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaICDecompress(hic.rawAddress.toString(), dwflags.toInt(), lpbiformat.rawAddress.toString(), lpdata.rawAddress.toString(), lpbi.rawAddress.toString(), lpbits.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iCDraw(hic: Hic, dwflags: UInt, lpformat: ConstPtr, lpdata: ConstPtr, cbdata: UInt, ltime: Int): UInt =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaICDraw(hic.rawAddress.toString(), dwflags.toInt(), lpformat.rawAddress.toString(), lpdata.rawAddress.toString(), cbdata.toInt(), ltime) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iCDrawBegin(hic: Hic, dwflags: UInt, hpal: Hpalette, hwnd: Hwnd, hdc: Hdc, xdst: Int, ydst: Int, dxdst: Int, dydst: Int, lpbi: ConstPtr, xsrc: Int, ysrc: Int, dxsrc: Int, dysrc: Int, dwrate: UInt, dwscale: UInt): UInt =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaICDrawBegin(hic.rawAddress.toString(), dwflags.toInt(), hpal.rawAddress.toString(), hwnd.rawAddress.toString(), hdc.rawAddress.toString(), xdst, ydst, dxdst, dydst, lpbi.rawAddress.toString(), xsrc, ysrc, dxsrc, dysrc, dwrate.toInt(), dwscale.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iCGetDisplayFormat(hic: Hic, lpbiin: ConstPtr, lpbiout: MutPtr, bitdepth: Int, dx: Int, dy: Int): Hic =
    if (windowsWin32MediaMultimediaNapiAddon != null) MutPtr((windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaICGetDisplayFormat(hic.rawAddress.toString(), lpbiin.rawAddress.toString(), lpbiout.rawAddress.toString(), bitdepth, dx, dy) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iCGetInfo(hic: Hic, picinfo: MutPtr, cb: UInt): Lresult =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaICGetInfo(hic.rawAddress.toString(), picinfo.rawAddress.toString(), cb.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iCImageCompress(hic: Hic, uiflags: UInt, lpbiin: ConstPtr, lpbits: ConstPtr, lpbiout: ConstPtr, lquality: Int, plsize: MutPtr): Handle =
    if (windowsWin32MediaMultimediaNapiAddon != null) MutPtr((windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaICImageCompress(hic.rawAddress.toString(), uiflags.toInt(), lpbiin.rawAddress.toString(), lpbits.rawAddress.toString(), lpbiout.rawAddress.toString(), lquality, plsize.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iCImageDecompress(hic: Hic, uiflags: UInt, lpbiin: ConstPtr, lpbits: ConstPtr, lpbiout: ConstPtr): Handle =
    if (windowsWin32MediaMultimediaNapiAddon != null) MutPtr((windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaICImageDecompress(hic.rawAddress.toString(), uiflags.toInt(), lpbiin.rawAddress.toString(), lpbits.rawAddress.toString(), lpbiout.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iCInfo(fcctype: UInt, fcchandler: UInt, lpicinfo: MutPtr): Bool =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaICInfo(fcctype.toInt(), fcchandler.toInt(), lpicinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iCInstall(fcctype: UInt, fcchandler: UInt, lparam: Lparam, szdesc: Pcstr, wflags: UInt): Bool =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaICInstall(fcctype.toInt(), fcchandler.toInt(), lparam.toString(), szdesc.rawAddress.toString(), wflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iCLocate(fcctype: UInt, fcchandler: UInt, lpbiin: ConstPtr, lpbiout: ConstPtr, wflags: UShort): Hic =
    if (windowsWin32MediaMultimediaNapiAddon != null) MutPtr((windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaICLocate(fcctype.toInt(), fcchandler.toInt(), lpbiin.rawAddress.toString(), lpbiout.rawAddress.toString(), wflags.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iCOpen(fcctype: UInt, fcchandler: UInt, wmode: UInt): Hic =
    if (windowsWin32MediaMultimediaNapiAddon != null) MutPtr((windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaICOpen(fcctype.toInt(), fcchandler.toInt(), wmode.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iCOpenFunction(fcctype: UInt, fcchandler: UInt, wmode: UInt, lpfnhandler: Farproc): Hic =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iCRemove(fcctype: UInt, fcchandler: UInt, wflags: UInt): Bool =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaICRemove(fcctype.toInt(), fcchandler.toInt(), wflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iCSendMessage(hic: Hic, msg: UInt, dw1: ULong, dw2: ULong): Lresult =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaICSendMessage(hic.rawAddress.toString(), msg.toInt(), dw1.toString(), dw2.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iCSeqCompressFrame(pc: ConstPtr, uiflags: UInt, lpbits: ConstPtr, pfkey: MutPtr, plsize: MutPtr): MutPtr =
    if (windowsWin32MediaMultimediaNapiAddon != null) MutPtr((windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaICSeqCompressFrame(pc.rawAddress.toString(), uiflags.toInt(), lpbits.rawAddress.toString(), pfkey.rawAddress.toString(), plsize.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iCSeqCompressFrameEnd(pc: ConstPtr) {
    if (windowsWin32MediaMultimediaNapiAddon != null) {
        windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaICSeqCompressFrameEnd(pc.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun iCSeqCompressFrameStart(pc: ConstPtr, lpbiin: ConstPtr): Bool =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaICSeqCompressFrameStart(pc.rawAddress.toString(), lpbiin.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mCIWndCreateA(hwndparent: Hwnd, hinstance: Hinstance, dwstyle: UInt, szfile: Pcstr): Hwnd =
    if (windowsWin32MediaMultimediaNapiAddon != null) MutPtr((windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaMCIWndCreateA(hwndparent.rawAddress.toString(), hinstance.rawAddress.toString(), dwstyle.toInt(), szfile.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mCIWndCreateW(hwndparent: Hwnd, hinstance: Hinstance, dwstyle: UInt, szfile: Pcwstr): Hwnd =
    if (windowsWin32MediaMultimediaNapiAddon != null) MutPtr((windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaMCIWndCreateW(hwndparent.rawAddress.toString(), hinstance.rawAddress.toString(), dwstyle.toInt(), szfile.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mCIWndRegisterClass(): Bool =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaMCIWndRegisterClass() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openDriver(szdrivername: Pcwstr, szsectionname: Pcwstr, lparam2: Lparam): Hdrvr =
    if (windowsWin32MediaMultimediaNapiAddon != null) MutPtr((windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaOpenDriver(szdrivername.rawAddress.toString(), szsectionname.rawAddress.toString(), lparam2.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendDriverMessage(hdriver: Hdrvr, message: UInt, lparam1: Lparam, lparam2: Lparam): Lresult =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaSendDriverMessage(hdriver.rawAddress.toString(), message.toInt(), lparam1.toString(), lparam2.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun videoForWindowsVersion(): UInt =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaVideoForWindowsVersion() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capCreateCaptureWindowA(lpszwindowname: Pcstr, dwstyle: UInt, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: Hwnd, nid: Int): Hwnd =
    if (windowsWin32MediaMultimediaNapiAddon != null) MutPtr((windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaCapCreateCaptureWindowA(lpszwindowname.rawAddress.toString(), dwstyle.toInt(), x, y, nwidth, nheight, hwndparent.rawAddress.toString(), nid) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capCreateCaptureWindowW(lpszwindowname: Pcwstr, dwstyle: UInt, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: Hwnd, nid: Int): Hwnd =
    if (windowsWin32MediaMultimediaNapiAddon != null) MutPtr((windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaCapCreateCaptureWindowW(lpszwindowname.rawAddress.toString(), dwstyle.toInt(), x, y, nwidth, nheight, hwndparent.rawAddress.toString(), nid) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capGetDriverDescriptionA(wdriverindex: UInt, lpszname: Pstr, cbname: Int, lpszver: Pstr, cbver: Int): Bool =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaCapGetDriverDescriptionA(wdriverindex.toInt(), lpszname.rawAddress.toString(), cbname, lpszver.rawAddress.toString(), cbver) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capGetDriverDescriptionW(wdriverindex: UInt, lpszname: Pwstr, cbname: Int, lpszver: Pwstr, cbver: Int): Bool =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaCapGetDriverDescriptionW(wdriverindex.toInt(), lpszname.rawAddress.toString(), cbname, lpszver.rawAddress.toString(), cbver) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun joyGetDevCapsA(ujoyid: ULong, pjc: MutPtr, cbjc: UInt): UInt =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaJoyGetDevCapsA(ujoyid.toString(), pjc.rawAddress.toString(), cbjc.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun joyGetDevCapsW(ujoyid: ULong, pjc: MutPtr, cbjc: UInt): UInt =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaJoyGetDevCapsW(ujoyid.toString(), pjc.rawAddress.toString(), cbjc.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun joyGetNumDevs(): UInt =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaJoyGetNumDevs() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun joyGetPos(ujoyid: UInt, pji: MutPtr): UInt =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaJoyGetPos(ujoyid.toInt(), pji.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun joyGetPosEx(ujoyid: UInt, pji: MutPtr): UInt =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaJoyGetPosEx(ujoyid.toInt(), pji.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun joyGetThreshold(ujoyid: UInt, puthreshold: MutPtr): UInt =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaJoyGetThreshold(ujoyid.toInt(), puthreshold.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun joyReleaseCapture(ujoyid: UInt): UInt =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaJoyReleaseCapture(ujoyid.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun joySetCapture(hwnd: Hwnd, ujoyid: UInt, uperiod: UInt, fchanged: Bool): UInt =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaJoySetCapture(hwnd.rawAddress.toString(), ujoyid.toInt(), uperiod.toInt(), fchanged) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun joySetThreshold(ujoyid: UInt, uthreshold: UInt): UInt =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaJoySetThreshold(ujoyid.toInt(), uthreshold.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mciDriverNotify(hwndcallback: Handle, wdeviceid: UInt, ustatus: UInt): Bool =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaMciDriverNotify(hwndcallback.rawAddress.toString(), wdeviceid.toInt(), ustatus.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mciDriverYield(wdeviceid: UInt): UInt =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaMciDriverYield(wdeviceid.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mciFreeCommandResource(wtable: UInt): Bool =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaMciFreeCommandResource(wtable.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mciGetCreatorTask(mciid: UInt): Htask =
    if (windowsWin32MediaMultimediaNapiAddon != null) MutPtr((windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaMciGetCreatorTask(mciid.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mciGetDeviceIDA(pszdevice: Pcstr): UInt =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaMciGetDeviceIDA(pszdevice.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mciGetDeviceIDFromElementIDA(dwelementid: UInt, lpstrtype: Pcstr): UInt =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaMciGetDeviceIDFromElementIDA(dwelementid.toInt(), lpstrtype.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mciGetDeviceIDFromElementIDW(dwelementid: UInt, lpstrtype: Pcwstr): UInt =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaMciGetDeviceIDFromElementIDW(dwelementid.toInt(), lpstrtype.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mciGetDeviceIDW(pszdevice: Pcwstr): UInt =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaMciGetDeviceIDW(pszdevice.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mciGetDriverData(wdeviceid: UInt): ULong =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaMciGetDriverData(wdeviceid.toInt()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mciGetErrorStringA(mcierr: UInt, psztext: Pstr, cchtext: UInt): Bool =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaMciGetErrorStringA(mcierr.toInt(), psztext.rawAddress.toString(), cchtext.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mciGetErrorStringW(mcierr: UInt, psztext: Pwstr, cchtext: UInt): Bool =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaMciGetErrorStringW(mcierr.toInt(), psztext.rawAddress.toString(), cchtext.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mciGetYieldProc(mciid: UInt, pdwyielddata: ConstPtr): Yieldproc =
    if (windowsWin32MediaMultimediaNapiAddon != null) null else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mciLoadCommandResource(hinstance: Handle, lpresname: Pcwstr, wtype: UInt): UInt =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaMciLoadCommandResource(hinstance.rawAddress.toString(), lpresname.rawAddress.toString(), wtype.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mciSendCommandA(mciid: UInt, umsg: UInt, dwparam1: ULong, dwparam2: ULong): UInt =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaMciSendCommandA(mciid.toInt(), umsg.toInt(), dwparam1.toString(), dwparam2.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mciSendCommandW(mciid: UInt, umsg: UInt, dwparam1: ULong, dwparam2: ULong): UInt =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaMciSendCommandW(mciid.toInt(), umsg.toInt(), dwparam1.toString(), dwparam2.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mciSendStringA(lpstrcommand: Pcstr, lpstrreturnstring: Pstr, ureturnlength: UInt, hwndcallback: Hwnd): UInt =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaMciSendStringA(lpstrcommand.rawAddress.toString(), lpstrreturnstring.rawAddress.toString(), ureturnlength.toInt(), hwndcallback.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mciSendStringW(lpstrcommand: Pcwstr, lpstrreturnstring: Pwstr, ureturnlength: UInt, hwndcallback: Hwnd): UInt =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaMciSendStringW(lpstrcommand.rawAddress.toString(), lpstrreturnstring.rawAddress.toString(), ureturnlength.toInt(), hwndcallback.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mciSetDriverData(wdeviceid: UInt, dwdata: ULong): Bool =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaMciSetDriverData(wdeviceid.toInt(), dwdata.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mciSetYieldProc(mciid: UInt, fpyieldproc: Yieldproc, dwyielddata: UInt): Bool =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaMciSetYieldProc(mciid.toInt(), 0L.toString(), dwyielddata.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmDrvInstall(hdriver: Hdrvr, wszdrventry: Pcwstr, drvmessage: Drivermsgproc, wflags: UInt): UInt =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaMmDrvInstall(hdriver.rawAddress.toString(), wszdrventry.rawAddress.toString(), 0L.toString(), wflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmGetCurrentTask(): UInt =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaMmGetCurrentTask() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmTaskBlock(h: UInt) {
    if (windowsWin32MediaMultimediaNapiAddon != null) {
        windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaMmTaskBlock(h.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mmTaskCreate(lpfn: Lptaskcallback, lph: MutPtr, dwinst: ULong): UInt =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaMmTaskCreate(0L.toString(), lph.rawAddress.toString(), dwinst.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmTaskSignal(h: UInt): Bool =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaMmTaskSignal(h.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmTaskYield() {
    if (windowsWin32MediaMultimediaNapiAddon != null) {
        windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaMmTaskYield()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mmioAdvance(hmmio: Hmmio, pmmioinfo: ConstPtr, fuadvance: UInt): UInt =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaMmioAdvance(hmmio.rawAddress.toString(), pmmioinfo.rawAddress.toString(), fuadvance.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmioAscend(hmmio: Hmmio, pmmcki: ConstPtr, fuascend: UInt): UInt =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaMmioAscend(hmmio.rawAddress.toString(), pmmcki.rawAddress.toString(), fuascend.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmioClose(hmmio: Hmmio, fuclose: UInt): UInt =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaMmioClose(hmmio.rawAddress.toString(), fuclose.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmioCreateChunk(hmmio: Hmmio, pmmcki: ConstPtr, fucreate: UInt): UInt =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaMmioCreateChunk(hmmio.rawAddress.toString(), pmmcki.rawAddress.toString(), fucreate.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmioDescend(hmmio: Hmmio, pmmcki: MutPtr, pmmckiparent: ConstPtr, fudescend: UInt): UInt =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaMmioDescend(hmmio.rawAddress.toString(), pmmcki.rawAddress.toString(), pmmckiparent.rawAddress.toString(), fudescend.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmioFlush(hmmio: Hmmio, fuflush: UInt): UInt =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaMmioFlush(hmmio.rawAddress.toString(), fuflush.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmioGetInfo(hmmio: Hmmio, pmmioinfo: MutPtr, fuinfo: UInt): UInt =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaMmioGetInfo(hmmio.rawAddress.toString(), pmmioinfo.rawAddress.toString(), fuinfo.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmioInstallIOProcA(fccioproc: UInt, pioproc: Lpmmioproc, dwflags: UInt): Lpmmioproc =
    if (windowsWin32MediaMultimediaNapiAddon != null) null else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmioInstallIOProcW(fccioproc: UInt, pioproc: Lpmmioproc, dwflags: UInt): Lpmmioproc =
    if (windowsWin32MediaMultimediaNapiAddon != null) null else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmioOpenA(pszfilename: Pstr, pmmioinfo: MutPtr, fdwopen: UInt): Hmmio =
    if (windowsWin32MediaMultimediaNapiAddon != null) MutPtr((windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaMmioOpenA(pszfilename.rawAddress.toString(), pmmioinfo.rawAddress.toString(), fdwopen.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmioOpenW(pszfilename: Pwstr, pmmioinfo: MutPtr, fdwopen: UInt): Hmmio =
    if (windowsWin32MediaMultimediaNapiAddon != null) MutPtr((windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaMmioOpenW(pszfilename.rawAddress.toString(), pmmioinfo.rawAddress.toString(), fdwopen.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmioRead(hmmio: Hmmio, pch: MutPtr, cch: Int): Int =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaMmioRead(hmmio.rawAddress.toString(), pch.rawAddress.toString(), cch) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmioRenameA(pszfilename: Pcstr, psznewfilename: Pcstr, pmmioinfo: ConstPtr, fdwrename: UInt): UInt =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaMmioRenameA(pszfilename.rawAddress.toString(), psznewfilename.rawAddress.toString(), pmmioinfo.rawAddress.toString(), fdwrename.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmioRenameW(pszfilename: Pcwstr, psznewfilename: Pcwstr, pmmioinfo: ConstPtr, fdwrename: UInt): UInt =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaMmioRenameW(pszfilename.rawAddress.toString(), psznewfilename.rawAddress.toString(), pmmioinfo.rawAddress.toString(), fdwrename.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmioSeek(hmmio: Hmmio, loffset: Int, iorigin: Int): Int =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaMmioSeek(hmmio.rawAddress.toString(), loffset, iorigin) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmioSendMessage(hmmio: Hmmio, umsg: UInt, lparam1: Lparam, lparam2: Lparam): Lresult =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaMmioSendMessage(hmmio.rawAddress.toString(), umsg.toInt(), lparam1.toString(), lparam2.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmioSetBuffer(hmmio: Hmmio, pchbuffer: Pstr, cchbuffer: Int, fubuffer: UInt): UInt =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaMmioSetBuffer(hmmio.rawAddress.toString(), pchbuffer.rawAddress.toString(), cchbuffer, fubuffer.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmioSetInfo(hmmio: Hmmio, pmmioinfo: ConstPtr, fuinfo: UInt): UInt =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaMmioSetInfo(hmmio.rawAddress.toString(), pmmioinfo.rawAddress.toString(), fuinfo.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmioStringToFOURCCA(sz: Pcstr, uflags: UInt): UInt =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaMmioStringToFOURCCA(sz.rawAddress.toString(), uflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmioStringToFOURCCW(sz: Pcwstr, uflags: UInt): UInt =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaMmioStringToFOURCCW(sz.rawAddress.toString(), uflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmioWrite(hmmio: Hmmio, pch: Pcstr, cch: Int): Int =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaMmioWrite(hmmio.rawAddress.toString(), pch.rawAddress.toString(), cch) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sndOpenSound(eventname: Pcwstr, appname: Pcwstr, flags: Int, filehandle: MutPtr): Int =
    if (windowsWin32MediaMultimediaNapiAddon != null) (windowsWin32MediaMultimediaNapiAddon.windowssysWindowsWin32MediaMultimediaSndOpenSound(eventname.rawAddress.toString(), appname.rawAddress.toString(), flags, filehandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
