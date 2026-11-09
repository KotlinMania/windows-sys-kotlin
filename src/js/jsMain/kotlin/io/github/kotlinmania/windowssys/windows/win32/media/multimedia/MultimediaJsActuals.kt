@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.media.multimedia

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.FARPROC
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HINSTANCE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HMODULE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.LPARAM
import io.github.kotlinmania.windowssys.windows.win32.foundation.LRESULT
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HDC
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HPALETTE
import io.github.kotlinmania.windowssys.windows.win32.media.HTASK

private val _windowsWin32MediaMultimediaNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun AVIBuildFilterA(lpszfilter: PSTR, cbfilter: Int, fsaving: BOOL): HRESULT =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_AVIBuildFilterA(lpszfilter.toString(), cbfilter, fsaving) as Int) else 0

public actual fun AVIBuildFilterW(lpszfilter: PWSTR, cbfilter: Int, fsaving: BOOL): HRESULT =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_AVIBuildFilterW(lpszfilter.toString(), cbfilter, fsaving) as Int) else 0

public actual fun AVIClearClipboard(): HRESULT =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_AVIClearClipboard() as Int) else 0

public actual fun AVIFileAddRef(pfile: Long): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_AVIFileAddRef(pfile.toString()) as Int).toUInt() else 0u

public actual fun AVIFileCreateStreamA(pfile: Long, ppavi: Long, psi: Long): HRESULT =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_AVIFileCreateStreamA(pfile.toString(), ppavi.toString(), psi.toString()) as Int) else 0

public actual fun AVIFileCreateStreamW(pfile: Long, ppavi: Long, psi: Long): HRESULT =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_AVIFileCreateStreamW(pfile.toString(), ppavi.toString(), psi.toString()) as Int) else 0

public actual fun AVIFileEndRecord(pfile: Long): HRESULT =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_AVIFileEndRecord(pfile.toString()) as Int) else 0

public actual fun AVIFileExit() {
    if (_windowsWin32MediaMultimediaNapiAddon != null) {
        _windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_AVIFileExit()
    }
}

public actual fun AVIFileGetStream(pfile: Long, ppavi: Long, fcctype: UInt, lparam: Int): HRESULT =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_AVIFileGetStream(pfile.toString(), ppavi.toString(), fcctype.toInt(), lparam) as Int) else 0

public actual fun AVIFileInfoA(pfile: Long, pfi: Long, lsize: Int): HRESULT =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_AVIFileInfoA(pfile.toString(), pfi.toString(), lsize) as Int) else 0

public actual fun AVIFileInfoW(pfile: Long, pfi: Long, lsize: Int): HRESULT =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_AVIFileInfoW(pfile.toString(), pfi.toString(), lsize) as Int) else 0

public actual fun AVIFileInit() {
    if (_windowsWin32MediaMultimediaNapiAddon != null) {
        _windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_AVIFileInit()
    }
}

public actual fun AVIFileOpenA(ppfile: Long, szfile: PCSTR, umode: UInt, lphandler: Long): HRESULT =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_AVIFileOpenA(ppfile.toString(), szfile.toString(), umode.toInt(), lphandler.toString()) as Int) else 0

public actual fun AVIFileOpenW(ppfile: Long, szfile: PCWSTR, umode: UInt, lphandler: Long): HRESULT =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_AVIFileOpenW(ppfile.toString(), szfile.toString(), umode.toInt(), lphandler.toString()) as Int) else 0

public actual fun AVIFileReadData(pfile: Long, ckid: UInt, lpdata: Long, lpcbdata: Long): HRESULT =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_AVIFileReadData(pfile.toString(), ckid.toInt(), lpdata.toString(), lpcbdata.toString()) as Int) else 0

public actual fun AVIFileRelease(pfile: Long): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_AVIFileRelease(pfile.toString()) as Int).toUInt() else 0u

public actual fun AVIFileWriteData(pfile: Long, ckid: UInt, lpdata: Long, cbdata: Int): HRESULT =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_AVIFileWriteData(pfile.toString(), ckid.toInt(), lpdata.toString(), cbdata) as Int) else 0

public actual fun AVIGetFromClipboard(lppf: Long): HRESULT =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_AVIGetFromClipboard(lppf.toString()) as Int) else 0

public actual fun AVIMakeCompressedStream(ppscompressed: Long, ppssource: Long, lpoptions: Long, pclsidhandler: Long): HRESULT =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_AVIMakeCompressedStream(ppscompressed.toString(), ppssource.toString(), lpoptions.toString(), pclsidhandler.toString()) as Int) else 0

public actual fun AVIMakeFileFromStreams(ppfile: Long, nstreams: Int, papstreams: Long): HRESULT =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_AVIMakeFileFromStreams(ppfile.toString(), nstreams, papstreams.toString()) as Int) else 0

public actual fun AVIMakeStreamFromClipboard(cfformat: UInt, hglobal: HANDLE, ppstream: Long): HRESULT =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_AVIMakeStreamFromClipboard(cfformat.toInt(), hglobal.toString(), ppstream.toString()) as Int) else 0

public actual fun AVIPutFileOnClipboard(pf: Long): HRESULT =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_AVIPutFileOnClipboard(pf.toString()) as Int) else 0

public actual fun AVISaveA(szfile: PCSTR, pclsidhandler: Long, lpfncallback: AVISAVECALLBACK, nstreams: Int, pfile: Long, lpoptions: Long): HRESULT =
    0

public actual fun AVISaveOptions(hwnd: HWND, uiflags: UInt, nstreams: Int, ppavi: Long, plpoptions: Long): Long =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_AVISaveOptions(hwnd.toString(), uiflags.toInt(), nstreams, ppavi.toString(), plpoptions.toString()) as String).toLong() else 0L

public actual fun AVISaveOptionsFree(nstreams: Int, plpoptions: Long): HRESULT =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_AVISaveOptionsFree(nstreams, plpoptions.toString()) as Int) else 0

public actual fun AVISaveVA(szfile: PCSTR, pclsidhandler: Long, lpfncallback: AVISAVECALLBACK, nstreams: Int, ppavi: Long, plpoptions: Long): HRESULT =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_AVISaveVA(szfile.toString(), pclsidhandler.toString(), lpfncallback.toLong().toString(), nstreams, ppavi.toString(), plpoptions.toString()) as Int) else 0

public actual fun AVISaveVW(szfile: PCWSTR, pclsidhandler: Long, lpfncallback: AVISAVECALLBACK, nstreams: Int, ppavi: Long, plpoptions: Long): HRESULT =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_AVISaveVW(szfile.toString(), pclsidhandler.toString(), lpfncallback.toLong().toString(), nstreams, ppavi.toString(), plpoptions.toString()) as Int) else 0

public actual fun AVISaveW(szfile: PCWSTR, pclsidhandler: Long, lpfncallback: AVISAVECALLBACK, nstreams: Int, pfile: Long, lpoptions: Long): HRESULT =
    0

public actual fun AVIStreamAddRef(pavi: Long): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_AVIStreamAddRef(pavi.toString()) as Int).toUInt() else 0u

public actual fun AVIStreamBeginStreaming(pavi: Long, lstart: Int, lend: Int, lrate: Int): HRESULT =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_AVIStreamBeginStreaming(pavi.toString(), lstart, lend, lrate) as Int) else 0

public actual fun AVIStreamCreate(ppavi: Long, lparam1: Int, lparam2: Int, pclsidhandler: Long): HRESULT =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_AVIStreamCreate(ppavi.toString(), lparam1, lparam2, pclsidhandler.toString()) as Int) else 0

public actual fun AVIStreamEndStreaming(pavi: Long): HRESULT =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_AVIStreamEndStreaming(pavi.toString()) as Int) else 0

public actual fun AVIStreamFindSample(pavi: Long, lpos: Int, lflags: Int): Int =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_AVIStreamFindSample(pavi.toString(), lpos, lflags) as Int) else 0

public actual fun AVIStreamGetFrame(pg: Long, lpos: Int): Long =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_AVIStreamGetFrame(pg.toString(), lpos) as String).toLong() else 0L

public actual fun AVIStreamGetFrameClose(pg: Long): HRESULT =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_AVIStreamGetFrameClose(pg.toString()) as Int) else 0

public actual fun AVIStreamGetFrameOpen(pavi: Long, lpbiwanted: Long): Long =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_AVIStreamGetFrameOpen(pavi.toString(), lpbiwanted.toString()) as String).toLong() else 0L

public actual fun AVIStreamInfoA(pavi: Long, psi: Long, lsize: Int): HRESULT =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_AVIStreamInfoA(pavi.toString(), psi.toString(), lsize) as Int) else 0

public actual fun AVIStreamInfoW(pavi: Long, psi: Long, lsize: Int): HRESULT =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_AVIStreamInfoW(pavi.toString(), psi.toString(), lsize) as Int) else 0

public actual fun AVIStreamLength(pavi: Long): Int =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_AVIStreamLength(pavi.toString()) as Int) else 0

public actual fun AVIStreamOpenFromFileA(ppavi: Long, szfile: PCSTR, fcctype: UInt, lparam: Int, mode: UInt, pclsidhandler: Long): HRESULT =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_AVIStreamOpenFromFileA(ppavi.toString(), szfile.toString(), fcctype.toInt(), lparam, mode.toInt(), pclsidhandler.toString()) as Int) else 0

public actual fun AVIStreamOpenFromFileW(ppavi: Long, szfile: PCWSTR, fcctype: UInt, lparam: Int, mode: UInt, pclsidhandler: Long): HRESULT =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_AVIStreamOpenFromFileW(ppavi.toString(), szfile.toString(), fcctype.toInt(), lparam, mode.toInt(), pclsidhandler.toString()) as Int) else 0

public actual fun AVIStreamRead(pavi: Long, lstart: Int, lsamples: Int, lpbuffer: Long, cbbuffer: Int, plbytes: Long, plsamples: Long): HRESULT =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_AVIStreamRead(pavi.toString(), lstart, lsamples, lpbuffer.toString(), cbbuffer, plbytes.toString(), plsamples.toString()) as Int) else 0

public actual fun AVIStreamReadData(pavi: Long, fcc: UInt, lp: Long, lpcb: Long): HRESULT =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_AVIStreamReadData(pavi.toString(), fcc.toInt(), lp.toString(), lpcb.toString()) as Int) else 0

public actual fun AVIStreamReadFormat(pavi: Long, lpos: Int, lpformat: Long, lpcbformat: Long): HRESULT =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_AVIStreamReadFormat(pavi.toString(), lpos, lpformat.toString(), lpcbformat.toString()) as Int) else 0

public actual fun AVIStreamRelease(pavi: Long): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_AVIStreamRelease(pavi.toString()) as Int).toUInt() else 0u

public actual fun AVIStreamSampleToTime(pavi: Long, lsample: Int): Int =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_AVIStreamSampleToTime(pavi.toString(), lsample) as Int) else 0

public actual fun AVIStreamSetFormat(pavi: Long, lpos: Int, lpformat: Long, cbformat: Int): HRESULT =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_AVIStreamSetFormat(pavi.toString(), lpos, lpformat.toString(), cbformat) as Int) else 0

public actual fun AVIStreamStart(pavi: Long): Int =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_AVIStreamStart(pavi.toString()) as Int) else 0

public actual fun AVIStreamTimeToSample(pavi: Long, ltime: Int): Int =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_AVIStreamTimeToSample(pavi.toString(), ltime) as Int) else 0

public actual fun AVIStreamWrite(pavi: Long, lstart: Int, lsamples: Int, lpbuffer: Long, cbbuffer: Int, dwflags: UInt, plsampwritten: Long, plbyteswritten: Long): HRESULT =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_AVIStreamWrite(pavi.toString(), lstart, lsamples, lpbuffer.toString(), cbbuffer, dwflags.toInt(), plsampwritten.toString(), plbyteswritten.toString()) as Int) else 0

public actual fun AVIStreamWriteData(pavi: Long, fcc: UInt, lp: Long, cb: Int): HRESULT =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_AVIStreamWriteData(pavi.toString(), fcc.toInt(), lp.toString(), cb) as Int) else 0

public actual fun CloseDriver(hdriver: HDRVR, lparam1: LPARAM, lparam2: LPARAM): LRESULT =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_CloseDriver(hdriver.toString(), lparam1.toString(), lparam2.toString()) as String).toLong() else 0L

public actual fun CreateEditableStream(ppseditable: Long, pssource: Long): HRESULT =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_CreateEditableStream(ppseditable.toString(), pssource.toString()) as Int) else 0

public actual fun DefDriverProc(dwdriveridentifier: ULong, hdrvr: HDRVR, umsg: UInt, lparam1: LPARAM, lparam2: LPARAM): LRESULT =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_DefDriverProc(dwdriveridentifier.toString(), hdrvr.toString(), umsg.toInt(), lparam1.toString(), lparam2.toString()) as String).toLong() else 0L

public actual fun DrawDibBegin(hdd: Long, hdc: HDC, dxdst: Int, dydst: Int, lpbi: Long, dxsrc: Int, dysrc: Int, wflags: UInt): BOOL =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_DrawDibBegin(hdd.toString(), hdc.toString(), dxdst, dydst, lpbi.toString(), dxsrc, dysrc, wflags.toInt()) as Int) else 0

public actual fun DrawDibChangePalette(hdd: Long, istart: Int, ilen: Int, lppe: Long): BOOL =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_DrawDibChangePalette(hdd.toString(), istart, ilen, lppe.toString()) as Int) else 0

public actual fun DrawDibClose(hdd: Long): BOOL =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_DrawDibClose(hdd.toString()) as Int) else 0

public actual fun DrawDibDraw(hdd: Long, hdc: HDC, xdst: Int, ydst: Int, dxdst: Int, dydst: Int, lpbi: Long, lpbits: Long, xsrc: Int, ysrc: Int, dxsrc: Int, dysrc: Int, wflags: UInt): BOOL =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_DrawDibDraw(hdd.toString(), hdc.toString(), xdst, ydst, dxdst, dydst, lpbi.toString(), lpbits.toString(), xsrc, ysrc, dxsrc, dysrc, wflags.toInt()) as Int) else 0

public actual fun DrawDibEnd(hdd: Long): BOOL =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_DrawDibEnd(hdd.toString()) as Int) else 0

public actual fun DrawDibGetBuffer(hdd: Long, lpbi: Long, dwsize: UInt, dwflags: UInt): Long =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_DrawDibGetBuffer(hdd.toString(), lpbi.toString(), dwsize.toInt(), dwflags.toInt()) as String).toLong() else 0L

public actual fun DrawDibGetPalette(hdd: Long): HPALETTE =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_DrawDibGetPalette(hdd.toString()) as String).toLong() else 0L

public actual fun DrawDibOpen(): Long =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_DrawDibOpen() as String).toLong() else 0L

public actual fun DrawDibProfileDisplay(lpbi: Long): LRESULT =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_DrawDibProfileDisplay(lpbi.toString()) as String).toLong() else 0L

public actual fun DrawDibRealize(hdd: Long, hdc: HDC, fbackground: BOOL): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_DrawDibRealize(hdd.toString(), hdc.toString(), fbackground) as Int).toUInt() else 0u

public actual fun DrawDibSetPalette(hdd: Long, hpal: HPALETTE): BOOL =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_DrawDibSetPalette(hdd.toString(), hpal.toString()) as Int) else 0

public actual fun DrawDibStart(hdd: Long, rate: UInt): BOOL =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_DrawDibStart(hdd.toString(), rate.toInt()) as Int) else 0

public actual fun DrawDibStop(hdd: Long): BOOL =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_DrawDibStop(hdd.toString()) as Int) else 0

public actual fun DrawDibTime(hdd: Long, lpddtime: Long): BOOL =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_DrawDibTime(hdd.toString(), lpddtime.toString()) as Int) else 0

public actual fun DriverCallback(dwcallback: ULong, dwflags: UInt, hdevice: HDRVR, dwmsg: UInt, dwuser: ULong, dwparam1: ULong, dwparam2: ULong): BOOL =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_DriverCallback(dwcallback.toString(), dwflags.toInt(), hdevice.toString(), dwmsg.toInt(), dwuser.toString(), dwparam1.toString(), dwparam2.toString()) as Int) else 0

public actual fun DrvGetModuleHandle(hdriver: HDRVR): HMODULE =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_DrvGetModuleHandle(hdriver.toString()) as String).toLong() else 0L

public actual fun EditStreamClone(pavi: Long, ppresult: Long): HRESULT =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_EditStreamClone(pavi.toString(), ppresult.toString()) as Int) else 0

public actual fun EditStreamCopy(pavi: Long, plstart: Long, pllength: Long, ppresult: Long): HRESULT =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_EditStreamCopy(pavi.toString(), plstart.toString(), pllength.toString(), ppresult.toString()) as Int) else 0

public actual fun EditStreamCut(pavi: Long, plstart: Long, pllength: Long, ppresult: Long): HRESULT =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_EditStreamCut(pavi.toString(), plstart.toString(), pllength.toString(), ppresult.toString()) as Int) else 0

public actual fun EditStreamPaste(pavi: Long, plpos: Long, pllength: Long, pstream: Long, lstart: Int, lend: Int): HRESULT =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_EditStreamPaste(pavi.toString(), plpos.toString(), pllength.toString(), pstream.toString(), lstart, lend) as Int) else 0

public actual fun EditStreamSetInfoA(pavi: Long, lpinfo: Long, cbinfo: Int): HRESULT =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_EditStreamSetInfoA(pavi.toString(), lpinfo.toString(), cbinfo) as Int) else 0

public actual fun EditStreamSetInfoW(pavi: Long, lpinfo: Long, cbinfo: Int): HRESULT =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_EditStreamSetInfoW(pavi.toString(), lpinfo.toString(), cbinfo) as Int) else 0

public actual fun EditStreamSetNameA(pavi: Long, lpszname: PCSTR): HRESULT =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_EditStreamSetNameA(pavi.toString(), lpszname.toString()) as Int) else 0

public actual fun EditStreamSetNameW(pavi: Long, lpszname: PCWSTR): HRESULT =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_EditStreamSetNameW(pavi.toString(), lpszname.toString()) as Int) else 0

public actual fun GetDriverModuleHandle(hdriver: HDRVR): HMODULE =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_GetDriverModuleHandle(hdriver.toString()) as String).toLong() else 0L

public actual fun GetOpenFileNamePreviewA(lpofn: Long): BOOL =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_GetOpenFileNamePreviewA(lpofn.toString()) as Int) else 0

public actual fun GetOpenFileNamePreviewW(lpofn: Long): BOOL =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_GetOpenFileNamePreviewW(lpofn.toString()) as Int) else 0

public actual fun GetSaveFileNamePreviewA(lpofn: Long): BOOL =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_GetSaveFileNamePreviewA(lpofn.toString()) as Int) else 0

public actual fun GetSaveFileNamePreviewW(lpofn: Long): BOOL =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_GetSaveFileNamePreviewW(lpofn.toString()) as Int) else 0

public actual fun ICClose(hic: HIC): LRESULT =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_ICClose(hic.toString()) as String).toLong() else 0L

public actual fun ICCompress(hic: HIC, dwflags: UInt, lpbioutput: Long, lpdata: Long, lpbiinput: Long, lpbits: Long, lpckid: Long, lpdwflags: Long, lframenum: Int, dwframesize: UInt, dwquality: UInt, lpbiprev: Long, lpprev: Long): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_ICCompress(hic.toString(), dwflags.toInt(), lpbioutput.toString(), lpdata.toString(), lpbiinput.toString(), lpbits.toString(), lpckid.toString(), lpdwflags.toString(), lframenum, dwframesize.toInt(), dwquality.toInt(), lpbiprev.toString(), lpprev.toString()) as Int).toUInt() else 0u

public actual fun ICCompressorChoose(hwnd: HWND, uiflags: UInt, pvin: Long, lpdata: Long, pc: Long, lpsztitle: PCSTR): BOOL =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_ICCompressorChoose(hwnd.toString(), uiflags.toInt(), pvin.toString(), lpdata.toString(), pc.toString(), lpsztitle.toString()) as Int) else 0

public actual fun ICCompressorFree(pc: Long) {
    if (_windowsWin32MediaMultimediaNapiAddon != null) {
        _windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_ICCompressorFree(pc.toString())
    }
}

public actual fun ICDecompress(hic: HIC, dwflags: UInt, lpbiformat: Long, lpdata: Long, lpbi: Long, lpbits: Long): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_ICDecompress(hic.toString(), dwflags.toInt(), lpbiformat.toString(), lpdata.toString(), lpbi.toString(), lpbits.toString()) as Int).toUInt() else 0u

public actual fun ICDraw(hic: HIC, dwflags: UInt, lpformat: Long, lpdata: Long, cbdata: UInt, ltime: Int): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_ICDraw(hic.toString(), dwflags.toInt(), lpformat.toString(), lpdata.toString(), cbdata.toInt(), ltime) as Int).toUInt() else 0u

public actual fun ICDrawBegin(hic: HIC, dwflags: UInt, hpal: HPALETTE, hwnd: HWND, hdc: HDC, xdst: Int, ydst: Int, dxdst: Int, dydst: Int, lpbi: Long, xsrc: Int, ysrc: Int, dxsrc: Int, dysrc: Int, dwrate: UInt, dwscale: UInt): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_ICDrawBegin(hic.toString(), dwflags.toInt(), hpal.toString(), hwnd.toString(), hdc.toString(), xdst, ydst, dxdst, dydst, lpbi.toString(), xsrc, ysrc, dxsrc, dysrc, dwrate.toInt(), dwscale.toInt()) as Int).toUInt() else 0u

public actual fun ICGetDisplayFormat(hic: HIC, lpbiin: Long, lpbiout: Long, bitdepth: Int, dx: Int, dy: Int): HIC =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_ICGetDisplayFormat(hic.toString(), lpbiin.toString(), lpbiout.toString(), bitdepth, dx, dy) as String).toLong() else 0L

public actual fun ICGetInfo(hic: HIC, picinfo: Long, cb: UInt): LRESULT =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_ICGetInfo(hic.toString(), picinfo.toString(), cb.toInt()) as String).toLong() else 0L

public actual fun ICImageCompress(hic: HIC, uiflags: UInt, lpbiin: Long, lpbits: Long, lpbiout: Long, lquality: Int, plsize: Long): HANDLE =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_ICImageCompress(hic.toString(), uiflags.toInt(), lpbiin.toString(), lpbits.toString(), lpbiout.toString(), lquality, plsize.toString()) as String).toLong() else 0L

public actual fun ICImageDecompress(hic: HIC, uiflags: UInt, lpbiin: Long, lpbits: Long, lpbiout: Long): HANDLE =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_ICImageDecompress(hic.toString(), uiflags.toInt(), lpbiin.toString(), lpbits.toString(), lpbiout.toString()) as String).toLong() else 0L

public actual fun ICInfo(fcctype: UInt, fcchandler: UInt, lpicinfo: Long): BOOL =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_ICInfo(fcctype.toInt(), fcchandler.toInt(), lpicinfo.toString()) as Int) else 0

public actual fun ICInstall(fcctype: UInt, fcchandler: UInt, lparam: LPARAM, szdesc: PCSTR, wflags: UInt): BOOL =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_ICInstall(fcctype.toInt(), fcchandler.toInt(), lparam.toString(), szdesc.toString(), wflags.toInt()) as Int) else 0

public actual fun ICLocate(fcctype: UInt, fcchandler: UInt, lpbiin: Long, lpbiout: Long, wflags: UShort): HIC =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_ICLocate(fcctype.toInt(), fcchandler.toInt(), lpbiin.toString(), lpbiout.toString(), wflags.toInt()) as String).toLong() else 0L

public actual fun ICOpen(fcctype: UInt, fcchandler: UInt, wmode: UInt): HIC =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_ICOpen(fcctype.toInt(), fcchandler.toInt(), wmode.toInt()) as String).toLong() else 0L

public actual fun ICOpenFunction(fcctype: UInt, fcchandler: UInt, wmode: UInt, lpfnhandler: FARPROC): HIC =
    0L

public actual fun ICRemove(fcctype: UInt, fcchandler: UInt, wflags: UInt): BOOL =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_ICRemove(fcctype.toInt(), fcchandler.toInt(), wflags.toInt()) as Int) else 0

public actual fun ICSendMessage(hic: HIC, msg: UInt, dw1: ULong, dw2: ULong): LRESULT =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_ICSendMessage(hic.toString(), msg.toInt(), dw1.toString(), dw2.toString()) as String).toLong() else 0L

public actual fun ICSeqCompressFrame(pc: Long, uiflags: UInt, lpbits: Long, pfkey: Long, plsize: Long): Long =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_ICSeqCompressFrame(pc.toString(), uiflags.toInt(), lpbits.toString(), pfkey.toString(), plsize.toString()) as String).toLong() else 0L

public actual fun ICSeqCompressFrameEnd(pc: Long) {
    if (_windowsWin32MediaMultimediaNapiAddon != null) {
        _windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_ICSeqCompressFrameEnd(pc.toString())
    }
}

public actual fun ICSeqCompressFrameStart(pc: Long, lpbiin: Long): BOOL =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_ICSeqCompressFrameStart(pc.toString(), lpbiin.toString()) as Int) else 0

public actual fun MCIWndCreateA(hwndparent: HWND, hinstance: HINSTANCE, dwstyle: UInt, szfile: PCSTR): HWND =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_MCIWndCreateA(hwndparent.toString(), hinstance.toString(), dwstyle.toInt(), szfile.toString()) as String).toLong() else 0L

public actual fun MCIWndCreateW(hwndparent: HWND, hinstance: HINSTANCE, dwstyle: UInt, szfile: PCWSTR): HWND =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_MCIWndCreateW(hwndparent.toString(), hinstance.toString(), dwstyle.toInt(), szfile.toString()) as String).toLong() else 0L

public actual fun MCIWndRegisterClass(): BOOL =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_MCIWndRegisterClass() as Int) else 0

public actual fun OpenDriver(szdrivername: PCWSTR, szsectionname: PCWSTR, lparam2: LPARAM): HDRVR =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_OpenDriver(szdrivername.toString(), szsectionname.toString(), lparam2.toString()) as String).toLong() else 0L

public actual fun SendDriverMessage(hdriver: HDRVR, message: UInt, lparam1: LPARAM, lparam2: LPARAM): LRESULT =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_SendDriverMessage(hdriver.toString(), message.toInt(), lparam1.toString(), lparam2.toString()) as String).toLong() else 0L

public actual fun VideoForWindowsVersion(): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_VideoForWindowsVersion() as Int).toUInt() else 0u

public actual fun capCreateCaptureWindowA(lpszwindowname: PCSTR, dwstyle: UInt, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: HWND, nid: Int): HWND =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_capCreateCaptureWindowA(lpszwindowname.toString(), dwstyle.toInt(), x, y, nwidth, nheight, hwndparent.toString(), nid) as String).toLong() else 0L

public actual fun capCreateCaptureWindowW(lpszwindowname: PCWSTR, dwstyle: UInt, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: HWND, nid: Int): HWND =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_capCreateCaptureWindowW(lpszwindowname.toString(), dwstyle.toInt(), x, y, nwidth, nheight, hwndparent.toString(), nid) as String).toLong() else 0L

public actual fun capGetDriverDescriptionA(wdriverindex: UInt, lpszname: PSTR, cbname: Int, lpszver: PSTR, cbver: Int): BOOL =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_capGetDriverDescriptionA(wdriverindex.toInt(), lpszname.toString(), cbname, lpszver.toString(), cbver) as Int) else 0

public actual fun capGetDriverDescriptionW(wdriverindex: UInt, lpszname: PWSTR, cbname: Int, lpszver: PWSTR, cbver: Int): BOOL =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_capGetDriverDescriptionW(wdriverindex.toInt(), lpszname.toString(), cbname, lpszver.toString(), cbver) as Int) else 0

public actual fun joyGetDevCapsA(ujoyid: ULong, pjc: Long, cbjc: UInt): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_joyGetDevCapsA(ujoyid.toString(), pjc.toString(), cbjc.toInt()) as Int).toUInt() else 0u

public actual fun joyGetDevCapsW(ujoyid: ULong, pjc: Long, cbjc: UInt): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_joyGetDevCapsW(ujoyid.toString(), pjc.toString(), cbjc.toInt()) as Int).toUInt() else 0u

public actual fun joyGetNumDevs(): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_joyGetNumDevs() as Int).toUInt() else 0u

public actual fun joyGetPos(ujoyid: UInt, pji: Long): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_joyGetPos(ujoyid.toInt(), pji.toString()) as Int).toUInt() else 0u

public actual fun joyGetPosEx(ujoyid: UInt, pji: Long): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_joyGetPosEx(ujoyid.toInt(), pji.toString()) as Int).toUInt() else 0u

public actual fun joyGetThreshold(ujoyid: UInt, puthreshold: Long): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_joyGetThreshold(ujoyid.toInt(), puthreshold.toString()) as Int).toUInt() else 0u

public actual fun joyReleaseCapture(ujoyid: UInt): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_joyReleaseCapture(ujoyid.toInt()) as Int).toUInt() else 0u

public actual fun joySetCapture(hwnd: HWND, ujoyid: UInt, uperiod: UInt, fchanged: BOOL): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_joySetCapture(hwnd.toString(), ujoyid.toInt(), uperiod.toInt(), fchanged) as Int).toUInt() else 0u

public actual fun joySetThreshold(ujoyid: UInt, uthreshold: UInt): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_joySetThreshold(ujoyid.toInt(), uthreshold.toInt()) as Int).toUInt() else 0u

public actual fun mciDriverNotify(hwndcallback: HANDLE, wdeviceid: UInt, ustatus: UInt): BOOL =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mciDriverNotify(hwndcallback.toString(), wdeviceid.toInt(), ustatus.toInt()) as Int) else 0

public actual fun mciDriverYield(wdeviceid: UInt): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mciDriverYield(wdeviceid.toInt()) as Int).toUInt() else 0u

public actual fun mciFreeCommandResource(wtable: UInt): BOOL =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mciFreeCommandResource(wtable.toInt()) as Int) else 0

public actual fun mciGetCreatorTask(mciid: UInt): HTASK =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mciGetCreatorTask(mciid.toInt()) as String).toLong() else 0L

public actual fun mciGetDeviceIDA(pszdevice: PCSTR): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mciGetDeviceIDA(pszdevice.toString()) as Int).toUInt() else 0u

public actual fun mciGetDeviceIDFromElementIDA(dwelementid: UInt, lpstrtype: PCSTR): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mciGetDeviceIDFromElementIDA(dwelementid.toInt(), lpstrtype.toString()) as Int).toUInt() else 0u

public actual fun mciGetDeviceIDFromElementIDW(dwelementid: UInt, lpstrtype: PCWSTR): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mciGetDeviceIDFromElementIDW(dwelementid.toInt(), lpstrtype.toString()) as Int).toUInt() else 0u

public actual fun mciGetDeviceIDW(pszdevice: PCWSTR): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mciGetDeviceIDW(pszdevice.toString()) as Int).toUInt() else 0u

public actual fun mciGetDriverData(wdeviceid: UInt): ULong =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mciGetDriverData(wdeviceid.toInt()) as String).toULong() else 0uL

public actual fun mciGetErrorStringA(mcierr: UInt, psztext: PSTR, cchtext: UInt): BOOL =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mciGetErrorStringA(mcierr.toInt(), psztext.toString(), cchtext.toInt()) as Int) else 0

public actual fun mciGetErrorStringW(mcierr: UInt, psztext: PWSTR, cchtext: UInt): BOOL =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mciGetErrorStringW(mcierr.toInt(), psztext.toString(), cchtext.toInt()) as Int) else 0

public actual fun mciGetYieldProc(mciid: UInt, pdwyielddata: Long): YIELDPROC =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mciGetYieldProc(mciid.toInt(), pdwyielddata.toString()) as String).toLong() else null

public actual fun mciLoadCommandResource(hinstance: HANDLE, lpresname: PCWSTR, wtype: UInt): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mciLoadCommandResource(hinstance.toString(), lpresname.toString(), wtype.toInt()) as Int).toUInt() else 0u

public actual fun mciSendCommandA(mciid: UInt, umsg: UInt, dwparam1: ULong, dwparam2: ULong): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mciSendCommandA(mciid.toInt(), umsg.toInt(), dwparam1.toString(), dwparam2.toString()) as Int).toUInt() else 0u

public actual fun mciSendCommandW(mciid: UInt, umsg: UInt, dwparam1: ULong, dwparam2: ULong): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mciSendCommandW(mciid.toInt(), umsg.toInt(), dwparam1.toString(), dwparam2.toString()) as Int).toUInt() else 0u

public actual fun mciSendStringA(lpstrcommand: PCSTR, lpstrreturnstring: PSTR, ureturnlength: UInt, hwndcallback: HWND): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mciSendStringA(lpstrcommand.toString(), lpstrreturnstring.toString(), ureturnlength.toInt(), hwndcallback.toString()) as Int).toUInt() else 0u

public actual fun mciSendStringW(lpstrcommand: PCWSTR, lpstrreturnstring: PWSTR, ureturnlength: UInt, hwndcallback: HWND): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mciSendStringW(lpstrcommand.toString(), lpstrreturnstring.toString(), ureturnlength.toInt(), hwndcallback.toString()) as Int).toUInt() else 0u

public actual fun mciSetDriverData(wdeviceid: UInt, dwdata: ULong): BOOL =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mciSetDriverData(wdeviceid.toInt(), dwdata.toString()) as Int) else 0

public actual fun mciSetYieldProc(mciid: UInt, fpyieldproc: YIELDPROC, dwyielddata: UInt): BOOL =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mciSetYieldProc(mciid.toInt(), fpyieldproc.toLong().toString(), dwyielddata.toInt()) as Int) else 0

public actual fun mmDrvInstall(hdriver: HDRVR, wszdrventry: PCWSTR, drvmessage: DRIVERMSGPROC, wflags: UInt): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mmDrvInstall(hdriver.toString(), wszdrventry.toString(), drvmessage.toLong().toString(), wflags.toInt()) as Int).toUInt() else 0u

public actual fun mmGetCurrentTask(): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mmGetCurrentTask() as Int).toUInt() else 0u

public actual fun mmTaskBlock(h: UInt) {
    if (_windowsWin32MediaMultimediaNapiAddon != null) {
        _windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mmTaskBlock(h.toInt())
    }
}

public actual fun mmTaskCreate(lpfn: LPTASKCALLBACK, lph: Long, dwinst: ULong): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mmTaskCreate(lpfn.toLong().toString(), lph.toString(), dwinst.toString()) as Int).toUInt() else 0u

public actual fun mmTaskSignal(h: UInt): BOOL =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mmTaskSignal(h.toInt()) as Int) else 0

public actual fun mmTaskYield() {
    if (_windowsWin32MediaMultimediaNapiAddon != null) {
        _windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mmTaskYield()
    }
}

public actual fun mmioAdvance(hmmio: HMMIO, pmmioinfo: Long, fuadvance: UInt): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mmioAdvance(hmmio.toString(), pmmioinfo.toString(), fuadvance.toInt()) as Int).toUInt() else 0u

public actual fun mmioAscend(hmmio: HMMIO, pmmcki: Long, fuascend: UInt): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mmioAscend(hmmio.toString(), pmmcki.toString(), fuascend.toInt()) as Int).toUInt() else 0u

public actual fun mmioClose(hmmio: HMMIO, fuclose: UInt): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mmioClose(hmmio.toString(), fuclose.toInt()) as Int).toUInt() else 0u

public actual fun mmioCreateChunk(hmmio: HMMIO, pmmcki: Long, fucreate: UInt): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mmioCreateChunk(hmmio.toString(), pmmcki.toString(), fucreate.toInt()) as Int).toUInt() else 0u

public actual fun mmioDescend(hmmio: HMMIO, pmmcki: Long, pmmckiparent: Long, fudescend: UInt): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mmioDescend(hmmio.toString(), pmmcki.toString(), pmmckiparent.toString(), fudescend.toInt()) as Int).toUInt() else 0u

public actual fun mmioFlush(hmmio: HMMIO, fuflush: UInt): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mmioFlush(hmmio.toString(), fuflush.toInt()) as Int).toUInt() else 0u

public actual fun mmioGetInfo(hmmio: HMMIO, pmmioinfo: Long, fuinfo: UInt): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mmioGetInfo(hmmio.toString(), pmmioinfo.toString(), fuinfo.toInt()) as Int).toUInt() else 0u

public actual fun mmioInstallIOProcA(fccioproc: UInt, pioproc: LPMMIOPROC, dwflags: UInt): LPMMIOPROC =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mmioInstallIOProcA(fccioproc.toInt(), pioproc.toLong().toString(), dwflags.toInt()) as String).toLong() else null

public actual fun mmioInstallIOProcW(fccioproc: UInt, pioproc: LPMMIOPROC, dwflags: UInt): LPMMIOPROC =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mmioInstallIOProcW(fccioproc.toInt(), pioproc.toLong().toString(), dwflags.toInt()) as String).toLong() else null

public actual fun mmioOpenA(pszfilename: PSTR, pmmioinfo: Long, fdwopen: UInt): HMMIO =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mmioOpenA(pszfilename.toString(), pmmioinfo.toString(), fdwopen.toInt()) as String).toLong() else 0L

public actual fun mmioOpenW(pszfilename: PWSTR, pmmioinfo: Long, fdwopen: UInt): HMMIO =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mmioOpenW(pszfilename.toString(), pmmioinfo.toString(), fdwopen.toInt()) as String).toLong() else 0L

public actual fun mmioRead(hmmio: HMMIO, pch: Long, cch: Int): Int =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mmioRead(hmmio.toString(), pch.toString(), cch) as Int) else 0

public actual fun mmioRenameA(pszfilename: PCSTR, psznewfilename: PCSTR, pmmioinfo: Long, fdwrename: UInt): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mmioRenameA(pszfilename.toString(), psznewfilename.toString(), pmmioinfo.toString(), fdwrename.toInt()) as Int).toUInt() else 0u

public actual fun mmioRenameW(pszfilename: PCWSTR, psznewfilename: PCWSTR, pmmioinfo: Long, fdwrename: UInt): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mmioRenameW(pszfilename.toString(), psznewfilename.toString(), pmmioinfo.toString(), fdwrename.toInt()) as Int).toUInt() else 0u

public actual fun mmioSeek(hmmio: HMMIO, loffset: Int, iorigin: Int): Int =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mmioSeek(hmmio.toString(), loffset, iorigin) as Int) else 0

public actual fun mmioSendMessage(hmmio: HMMIO, umsg: UInt, lparam1: LPARAM, lparam2: LPARAM): LRESULT =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mmioSendMessage(hmmio.toString(), umsg.toInt(), lparam1.toString(), lparam2.toString()) as String).toLong() else 0L

public actual fun mmioSetBuffer(hmmio: HMMIO, pchbuffer: PSTR, cchbuffer: Int, fubuffer: UInt): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mmioSetBuffer(hmmio.toString(), pchbuffer.toString(), cchbuffer, fubuffer.toInt()) as Int).toUInt() else 0u

public actual fun mmioSetInfo(hmmio: HMMIO, pmmioinfo: Long, fuinfo: UInt): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mmioSetInfo(hmmio.toString(), pmmioinfo.toString(), fuinfo.toInt()) as Int).toUInt() else 0u

public actual fun mmioStringToFOURCCA(sz: PCSTR, uflags: UInt): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mmioStringToFOURCCA(sz.toString(), uflags.toInt()) as Int).toUInt() else 0u

public actual fun mmioStringToFOURCCW(sz: PCWSTR, uflags: UInt): UInt =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mmioStringToFOURCCW(sz.toString(), uflags.toInt()) as Int).toUInt() else 0u

public actual fun mmioWrite(hmmio: HMMIO, pch: PCSTR, cch: Int): Int =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_mmioWrite(hmmio.toString(), pch.toString(), cch) as Int) else 0

public actual fun sndOpenSound(eventname: PCWSTR, appname: PCWSTR, flags: Int, filehandle: Long): Int =
    if (_windowsWin32MediaMultimediaNapiAddon != null) (_windowsWin32MediaMultimediaNapiAddon.windowssys_windows_win32_media_multimedia_sndOpenSound(eventname.toString(), appname.toString(), flags, filehandle.toString()) as Int) else 0
