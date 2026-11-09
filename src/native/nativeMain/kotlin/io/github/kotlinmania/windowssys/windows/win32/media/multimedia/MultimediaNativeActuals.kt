@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun AVIBuildFilterA(lpszfilter: PSTR, cbfilter: Int, fsaving: BOOL): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_AVIBuildFilterA(lpszfilter.toCPointer<ByteVar>(), cbfilter, fsaving)

public actual fun AVIBuildFilterW(lpszfilter: PWSTR, cbfilter: Int, fsaving: BOOL): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_AVIBuildFilterW(lpszfilter.toCPointer<ByteVar>(), cbfilter, fsaving)

public actual fun AVIClearClipboard(): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_AVIClearClipboard()

public actual fun AVIFileAddRef(pfile: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_AVIFileAddRef(pfile.toCPointer<ByteVar>())

public actual fun AVIFileCreateStreamA(pfile: Long, ppavi: Long, psi: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_AVIFileCreateStreamA(pfile.toCPointer<ByteVar>(), ppavi.toCPointer<ByteVar>(), psi.toCPointer<ByteVar>())

public actual fun AVIFileCreateStreamW(pfile: Long, ppavi: Long, psi: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_AVIFileCreateStreamW(pfile.toCPointer<ByteVar>(), ppavi.toCPointer<ByteVar>(), psi.toCPointer<ByteVar>())

public actual fun AVIFileEndRecord(pfile: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_AVIFileEndRecord(pfile.toCPointer<ByteVar>())

public actual fun AVIFileExit() {
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_AVIFileExit()
}

public actual fun AVIFileGetStream(pfile: Long, ppavi: Long, fcctype: UInt, lparam: Int): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_AVIFileGetStream(pfile.toCPointer<ByteVar>(), ppavi.toCPointer<ByteVar>(), fcctype, lparam)

public actual fun AVIFileInfoA(pfile: Long, pfi: Long, lsize: Int): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_AVIFileInfoA(pfile.toCPointer<ByteVar>(), pfi.toCPointer<ByteVar>(), lsize)

public actual fun AVIFileInfoW(pfile: Long, pfi: Long, lsize: Int): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_AVIFileInfoW(pfile.toCPointer<ByteVar>(), pfi.toCPointer<ByteVar>(), lsize)

public actual fun AVIFileInit() {
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_AVIFileInit()
}

public actual fun AVIFileOpenA(ppfile: Long, szfile: PCSTR, umode: UInt, lphandler: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_AVIFileOpenA(ppfile.toCPointer<ByteVar>(), szfile.toCPointer<ByteVar>(), umode, lphandler.toCPointer<ByteVar>())

public actual fun AVIFileOpenW(ppfile: Long, szfile: PCWSTR, umode: UInt, lphandler: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_AVIFileOpenW(ppfile.toCPointer<ByteVar>(), szfile.toCPointer<ByteVar>(), umode, lphandler.toCPointer<ByteVar>())

public actual fun AVIFileReadData(pfile: Long, ckid: UInt, lpdata: Long, lpcbdata: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_AVIFileReadData(pfile.toCPointer<ByteVar>(), ckid, lpdata.toCPointer<ByteVar>(), lpcbdata.toCPointer<ByteVar>())

public actual fun AVIFileRelease(pfile: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_AVIFileRelease(pfile.toCPointer<ByteVar>())

public actual fun AVIFileWriteData(pfile: Long, ckid: UInt, lpdata: Long, cbdata: Int): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_AVIFileWriteData(pfile.toCPointer<ByteVar>(), ckid, lpdata.toCPointer<ByteVar>(), cbdata)

public actual fun AVIGetFromClipboard(lppf: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_AVIGetFromClipboard(lppf.toCPointer<ByteVar>())

public actual fun AVIMakeCompressedStream(ppscompressed: Long, ppssource: Long, lpoptions: Long, pclsidhandler: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_AVIMakeCompressedStream(ppscompressed.toCPointer<ByteVar>(), ppssource.toCPointer<ByteVar>(), lpoptions.toCPointer<ByteVar>(), pclsidhandler.toCPointer<ByteVar>())

public actual fun AVIMakeFileFromStreams(ppfile: Long, nstreams: Int, papstreams: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_AVIMakeFileFromStreams(ppfile.toCPointer<ByteVar>(), nstreams, papstreams.toCPointer<ByteVar>())

public actual fun AVIMakeStreamFromClipboard(cfformat: UInt, hglobal: HANDLE, ppstream: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_AVIMakeStreamFromClipboard(cfformat, hglobal.toCPointer<ByteVar>(), ppstream.toCPointer<ByteVar>())

public actual fun AVIPutFileOnClipboard(pf: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_AVIPutFileOnClipboard(pf.toCPointer<ByteVar>())

public actual fun AVISaveA(szfile: PCSTR, pclsidhandler: Long, lpfncallback: AVISAVECALLBACK, nstreams: Int, pfile: Long, lpoptions: Long): HRESULT =
    0

public actual fun AVISaveOptions(hwnd: HWND, uiflags: UInt, nstreams: Int, ppavi: Long, plpoptions: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_AVISaveOptions(hwnd.toCPointer<ByteVar>(), uiflags, nstreams, ppavi.toCPointer<ByteVar>(), plpoptions.toCPointer<ByteVar>())

public actual fun AVISaveOptionsFree(nstreams: Int, plpoptions: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_AVISaveOptionsFree(nstreams, plpoptions.toCPointer<ByteVar>())

public actual fun AVISaveVA(szfile: PCSTR, pclsidhandler: Long, lpfncallback: AVISAVECALLBACK, nstreams: Int, ppavi: Long, plpoptions: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_AVISaveVA(szfile.toCPointer<ByteVar>(), pclsidhandler.toCPointer<ByteVar>(), lpfncallback.toLong().toCPointer<ByteVar>(), nstreams, ppavi.toCPointer<ByteVar>(), plpoptions.toCPointer<ByteVar>())

public actual fun AVISaveVW(szfile: PCWSTR, pclsidhandler: Long, lpfncallback: AVISAVECALLBACK, nstreams: Int, ppavi: Long, plpoptions: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_AVISaveVW(szfile.toCPointer<ByteVar>(), pclsidhandler.toCPointer<ByteVar>(), lpfncallback.toLong().toCPointer<ByteVar>(), nstreams, ppavi.toCPointer<ByteVar>(), plpoptions.toCPointer<ByteVar>())

public actual fun AVISaveW(szfile: PCWSTR, pclsidhandler: Long, lpfncallback: AVISAVECALLBACK, nstreams: Int, pfile: Long, lpoptions: Long): HRESULT =
    0

public actual fun AVIStreamAddRef(pavi: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_AVIStreamAddRef(pavi.toCPointer<ByteVar>())

public actual fun AVIStreamBeginStreaming(pavi: Long, lstart: Int, lend: Int, lrate: Int): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_AVIStreamBeginStreaming(pavi.toCPointer<ByteVar>(), lstart, lend, lrate)

public actual fun AVIStreamCreate(ppavi: Long, lparam1: Int, lparam2: Int, pclsidhandler: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_AVIStreamCreate(ppavi.toCPointer<ByteVar>(), lparam1, lparam2, pclsidhandler.toCPointer<ByteVar>())

public actual fun AVIStreamEndStreaming(pavi: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_AVIStreamEndStreaming(pavi.toCPointer<ByteVar>())

public actual fun AVIStreamFindSample(pavi: Long, lpos: Int, lflags: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_AVIStreamFindSample(pavi.toCPointer<ByteVar>(), lpos, lflags)

public actual fun AVIStreamGetFrame(pg: Long, lpos: Int): Long =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_AVIStreamGetFrame(pg.toCPointer<ByteVar>(), lpos)?.toLong() ?: 0L

public actual fun AVIStreamGetFrameClose(pg: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_AVIStreamGetFrameClose(pg.toCPointer<ByteVar>())

public actual fun AVIStreamGetFrameOpen(pavi: Long, lpbiwanted: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_AVIStreamGetFrameOpen(pavi.toCPointer<ByteVar>(), lpbiwanted.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun AVIStreamInfoA(pavi: Long, psi: Long, lsize: Int): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_AVIStreamInfoA(pavi.toCPointer<ByteVar>(), psi.toCPointer<ByteVar>(), lsize)

public actual fun AVIStreamInfoW(pavi: Long, psi: Long, lsize: Int): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_AVIStreamInfoW(pavi.toCPointer<ByteVar>(), psi.toCPointer<ByteVar>(), lsize)

public actual fun AVIStreamLength(pavi: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_AVIStreamLength(pavi.toCPointer<ByteVar>())

public actual fun AVIStreamOpenFromFileA(ppavi: Long, szfile: PCSTR, fcctype: UInt, lparam: Int, mode: UInt, pclsidhandler: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_AVIStreamOpenFromFileA(ppavi.toCPointer<ByteVar>(), szfile.toCPointer<ByteVar>(), fcctype, lparam, mode, pclsidhandler.toCPointer<ByteVar>())

public actual fun AVIStreamOpenFromFileW(ppavi: Long, szfile: PCWSTR, fcctype: UInt, lparam: Int, mode: UInt, pclsidhandler: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_AVIStreamOpenFromFileW(ppavi.toCPointer<ByteVar>(), szfile.toCPointer<ByteVar>(), fcctype, lparam, mode, pclsidhandler.toCPointer<ByteVar>())

public actual fun AVIStreamRead(pavi: Long, lstart: Int, lsamples: Int, lpbuffer: Long, cbbuffer: Int, plbytes: Long, plsamples: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_AVIStreamRead(pavi.toCPointer<ByteVar>(), lstart, lsamples, lpbuffer.toCPointer<ByteVar>(), cbbuffer, plbytes.toCPointer<ByteVar>(), plsamples.toCPointer<ByteVar>())

public actual fun AVIStreamReadData(pavi: Long, fcc: UInt, lp: Long, lpcb: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_AVIStreamReadData(pavi.toCPointer<ByteVar>(), fcc, lp.toCPointer<ByteVar>(), lpcb.toCPointer<ByteVar>())

public actual fun AVIStreamReadFormat(pavi: Long, lpos: Int, lpformat: Long, lpcbformat: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_AVIStreamReadFormat(pavi.toCPointer<ByteVar>(), lpos, lpformat.toCPointer<ByteVar>(), lpcbformat.toCPointer<ByteVar>())

public actual fun AVIStreamRelease(pavi: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_AVIStreamRelease(pavi.toCPointer<ByteVar>())

public actual fun AVIStreamSampleToTime(pavi: Long, lsample: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_AVIStreamSampleToTime(pavi.toCPointer<ByteVar>(), lsample)

public actual fun AVIStreamSetFormat(pavi: Long, lpos: Int, lpformat: Long, cbformat: Int): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_AVIStreamSetFormat(pavi.toCPointer<ByteVar>(), lpos, lpformat.toCPointer<ByteVar>(), cbformat)

public actual fun AVIStreamStart(pavi: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_AVIStreamStart(pavi.toCPointer<ByteVar>())

public actual fun AVIStreamTimeToSample(pavi: Long, ltime: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_AVIStreamTimeToSample(pavi.toCPointer<ByteVar>(), ltime)

public actual fun AVIStreamWrite(pavi: Long, lstart: Int, lsamples: Int, lpbuffer: Long, cbbuffer: Int, dwflags: UInt, plsampwritten: Long, plbyteswritten: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_AVIStreamWrite(pavi.toCPointer<ByteVar>(), lstart, lsamples, lpbuffer.toCPointer<ByteVar>(), cbbuffer, dwflags, plsampwritten.toCPointer<ByteVar>(), plbyteswritten.toCPointer<ByteVar>())

public actual fun AVIStreamWriteData(pavi: Long, fcc: UInt, lp: Long, cb: Int): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_AVIStreamWriteData(pavi.toCPointer<ByteVar>(), fcc, lp.toCPointer<ByteVar>(), cb)

public actual fun CloseDriver(hdriver: HDRVR, lparam1: LPARAM, lparam2: LPARAM): LRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_CloseDriver(hdriver.toCPointer<ByteVar>(), lparam1, lparam2)

public actual fun CreateEditableStream(ppseditable: Long, pssource: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_CreateEditableStream(ppseditable.toCPointer<ByteVar>(), pssource.toCPointer<ByteVar>())

public actual fun DefDriverProc(dwdriveridentifier: ULong, hdrvr: HDRVR, umsg: UInt, lparam1: LPARAM, lparam2: LPARAM): LRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_DefDriverProc(dwdriveridentifier, hdrvr.toCPointer<ByteVar>(), umsg, lparam1, lparam2)

public actual fun DrawDibBegin(hdd: Long, hdc: HDC, dxdst: Int, dydst: Int, lpbi: Long, dxsrc: Int, dysrc: Int, wflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_DrawDibBegin(hdd, hdc.toCPointer<ByteVar>(), dxdst, dydst, lpbi.toCPointer<ByteVar>(), dxsrc, dysrc, wflags)

public actual fun DrawDibChangePalette(hdd: Long, istart: Int, ilen: Int, lppe: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_DrawDibChangePalette(hdd, istart, ilen, lppe.toCPointer<ByteVar>())

public actual fun DrawDibClose(hdd: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_DrawDibClose(hdd)

public actual fun DrawDibDraw(hdd: Long, hdc: HDC, xdst: Int, ydst: Int, dxdst: Int, dydst: Int, lpbi: Long, lpbits: Long, xsrc: Int, ysrc: Int, dxsrc: Int, dysrc: Int, wflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_DrawDibDraw(hdd, hdc.toCPointer<ByteVar>(), xdst, ydst, dxdst, dydst, lpbi.toCPointer<ByteVar>(), lpbits.toCPointer<ByteVar>(), xsrc, ysrc, dxsrc, dysrc, wflags)

public actual fun DrawDibEnd(hdd: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_DrawDibEnd(hdd)

public actual fun DrawDibGetBuffer(hdd: Long, lpbi: Long, dwsize: UInt, dwflags: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_DrawDibGetBuffer(hdd, lpbi.toCPointer<ByteVar>(), dwsize, dwflags)?.toLong() ?: 0L

public actual fun DrawDibGetPalette(hdd: Long): HPALETTE =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_DrawDibGetPalette(hdd)?.toLong() ?: 0L

public actual fun DrawDibOpen(): Long =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_DrawDibOpen()

public actual fun DrawDibProfileDisplay(lpbi: Long): LRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_DrawDibProfileDisplay(lpbi.toCPointer<ByteVar>())

public actual fun DrawDibRealize(hdd: Long, hdc: HDC, fbackground: BOOL): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_DrawDibRealize(hdd, hdc.toCPointer<ByteVar>(), fbackground)

public actual fun DrawDibSetPalette(hdd: Long, hpal: HPALETTE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_DrawDibSetPalette(hdd, hpal.toCPointer<ByteVar>())

public actual fun DrawDibStart(hdd: Long, rate: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_DrawDibStart(hdd, rate)

public actual fun DrawDibStop(hdd: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_DrawDibStop(hdd)

public actual fun DrawDibTime(hdd: Long, lpddtime: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_DrawDibTime(hdd, lpddtime.toCPointer<ByteVar>())

public actual fun DriverCallback(dwcallback: ULong, dwflags: UInt, hdevice: HDRVR, dwmsg: UInt, dwuser: ULong, dwparam1: ULong, dwparam2: ULong): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_DriverCallback(dwcallback, dwflags, hdevice.toCPointer<ByteVar>(), dwmsg, dwuser, dwparam1, dwparam2)

public actual fun DrvGetModuleHandle(hdriver: HDRVR): HMODULE =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_DrvGetModuleHandle(hdriver.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun EditStreamClone(pavi: Long, ppresult: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_EditStreamClone(pavi.toCPointer<ByteVar>(), ppresult.toCPointer<ByteVar>())

public actual fun EditStreamCopy(pavi: Long, plstart: Long, pllength: Long, ppresult: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_EditStreamCopy(pavi.toCPointer<ByteVar>(), plstart.toCPointer<ByteVar>(), pllength.toCPointer<ByteVar>(), ppresult.toCPointer<ByteVar>())

public actual fun EditStreamCut(pavi: Long, plstart: Long, pllength: Long, ppresult: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_EditStreamCut(pavi.toCPointer<ByteVar>(), plstart.toCPointer<ByteVar>(), pllength.toCPointer<ByteVar>(), ppresult.toCPointer<ByteVar>())

public actual fun EditStreamPaste(pavi: Long, plpos: Long, pllength: Long, pstream: Long, lstart: Int, lend: Int): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_EditStreamPaste(pavi.toCPointer<ByteVar>(), plpos.toCPointer<ByteVar>(), pllength.toCPointer<ByteVar>(), pstream.toCPointer<ByteVar>(), lstart, lend)

public actual fun EditStreamSetInfoA(pavi: Long, lpinfo: Long, cbinfo: Int): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_EditStreamSetInfoA(pavi.toCPointer<ByteVar>(), lpinfo.toCPointer<ByteVar>(), cbinfo)

public actual fun EditStreamSetInfoW(pavi: Long, lpinfo: Long, cbinfo: Int): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_EditStreamSetInfoW(pavi.toCPointer<ByteVar>(), lpinfo.toCPointer<ByteVar>(), cbinfo)

public actual fun EditStreamSetNameA(pavi: Long, lpszname: PCSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_EditStreamSetNameA(pavi.toCPointer<ByteVar>(), lpszname.toCPointer<ByteVar>())

public actual fun EditStreamSetNameW(pavi: Long, lpszname: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_EditStreamSetNameW(pavi.toCPointer<ByteVar>(), lpszname.toCPointer<ByteVar>())

public actual fun GetDriverModuleHandle(hdriver: HDRVR): HMODULE =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_GetDriverModuleHandle(hdriver.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun GetOpenFileNamePreviewA(lpofn: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_GetOpenFileNamePreviewA(lpofn.toCPointer<ByteVar>())

public actual fun GetOpenFileNamePreviewW(lpofn: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_GetOpenFileNamePreviewW(lpofn.toCPointer<ByteVar>())

public actual fun GetSaveFileNamePreviewA(lpofn: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_GetSaveFileNamePreviewA(lpofn.toCPointer<ByteVar>())

public actual fun GetSaveFileNamePreviewW(lpofn: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_GetSaveFileNamePreviewW(lpofn.toCPointer<ByteVar>())

public actual fun ICClose(hic: HIC): LRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_ICClose(hic.toCPointer<ByteVar>())

public actual fun ICCompress(hic: HIC, dwflags: UInt, lpbioutput: Long, lpdata: Long, lpbiinput: Long, lpbits: Long, lpckid: Long, lpdwflags: Long, lframenum: Int, dwframesize: UInt, dwquality: UInt, lpbiprev: Long, lpprev: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_ICCompress(hic.toCPointer<ByteVar>(), dwflags, lpbioutput.toCPointer<ByteVar>(), lpdata.toCPointer<ByteVar>(), lpbiinput.toCPointer<ByteVar>(), lpbits.toCPointer<ByteVar>(), lpckid.toCPointer<ByteVar>(), lpdwflags.toCPointer<ByteVar>(), lframenum, dwframesize, dwquality, lpbiprev.toCPointer<ByteVar>(), lpprev.toCPointer<ByteVar>())

public actual fun ICCompressorChoose(hwnd: HWND, uiflags: UInt, pvin: Long, lpdata: Long, pc: Long, lpsztitle: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_ICCompressorChoose(hwnd.toCPointer<ByteVar>(), uiflags, pvin.toCPointer<ByteVar>(), lpdata.toCPointer<ByteVar>(), pc.toCPointer<ByteVar>(), lpsztitle.toCPointer<ByteVar>())

public actual fun ICCompressorFree(pc: Long) {
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_ICCompressorFree(pc.toCPointer<ByteVar>())
}

public actual fun ICDecompress(hic: HIC, dwflags: UInt, lpbiformat: Long, lpdata: Long, lpbi: Long, lpbits: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_ICDecompress(hic.toCPointer<ByteVar>(), dwflags, lpbiformat.toCPointer<ByteVar>(), lpdata.toCPointer<ByteVar>(), lpbi.toCPointer<ByteVar>(), lpbits.toCPointer<ByteVar>())

public actual fun ICDraw(hic: HIC, dwflags: UInt, lpformat: Long, lpdata: Long, cbdata: UInt, ltime: Int): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_ICDraw(hic.toCPointer<ByteVar>(), dwflags, lpformat.toCPointer<ByteVar>(), lpdata.toCPointer<ByteVar>(), cbdata, ltime)

public actual fun ICDrawBegin(hic: HIC, dwflags: UInt, hpal: HPALETTE, hwnd: HWND, hdc: HDC, xdst: Int, ydst: Int, dxdst: Int, dydst: Int, lpbi: Long, xsrc: Int, ysrc: Int, dxsrc: Int, dysrc: Int, dwrate: UInt, dwscale: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_ICDrawBegin(hic.toCPointer<ByteVar>(), dwflags, hpal.toCPointer<ByteVar>(), hwnd.toCPointer<ByteVar>(), hdc.toCPointer<ByteVar>(), xdst, ydst, dxdst, dydst, lpbi.toCPointer<ByteVar>(), xsrc, ysrc, dxsrc, dysrc, dwrate, dwscale)

public actual fun ICGetDisplayFormat(hic: HIC, lpbiin: Long, lpbiout: Long, bitdepth: Int, dx: Int, dy: Int): HIC =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_ICGetDisplayFormat(hic.toCPointer<ByteVar>(), lpbiin.toCPointer<ByteVar>(), lpbiout.toCPointer<ByteVar>(), bitdepth, dx, dy)?.toLong() ?: 0L

public actual fun ICGetInfo(hic: HIC, picinfo: Long, cb: UInt): LRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_ICGetInfo(hic.toCPointer<ByteVar>(), picinfo.toCPointer<ByteVar>(), cb)

public actual fun ICImageCompress(hic: HIC, uiflags: UInt, lpbiin: Long, lpbits: Long, lpbiout: Long, lquality: Int, plsize: Long): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_ICImageCompress(hic.toCPointer<ByteVar>(), uiflags, lpbiin.toCPointer<ByteVar>(), lpbits.toCPointer<ByteVar>(), lpbiout.toCPointer<ByteVar>(), lquality, plsize.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ICImageDecompress(hic: HIC, uiflags: UInt, lpbiin: Long, lpbits: Long, lpbiout: Long): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_ICImageDecompress(hic.toCPointer<ByteVar>(), uiflags, lpbiin.toCPointer<ByteVar>(), lpbits.toCPointer<ByteVar>(), lpbiout.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ICInfo(fcctype: UInt, fcchandler: UInt, lpicinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_ICInfo(fcctype, fcchandler, lpicinfo.toCPointer<ByteVar>())

public actual fun ICInstall(fcctype: UInt, fcchandler: UInt, lparam: LPARAM, szdesc: PCSTR, wflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_ICInstall(fcctype, fcchandler, lparam, szdesc.toCPointer<ByteVar>(), wflags)

public actual fun ICLocate(fcctype: UInt, fcchandler: UInt, lpbiin: Long, lpbiout: Long, wflags: UShort): HIC =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_ICLocate(fcctype, fcchandler, lpbiin.toCPointer<ByteVar>(), lpbiout.toCPointer<ByteVar>(), wflags)?.toLong() ?: 0L

public actual fun ICOpen(fcctype: UInt, fcchandler: UInt, wmode: UInt): HIC =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_ICOpen(fcctype, fcchandler, wmode)?.toLong() ?: 0L

public actual fun ICOpenFunction(fcctype: UInt, fcchandler: UInt, wmode: UInt, lpfnhandler: FARPROC): HIC =
    0L

public actual fun ICRemove(fcctype: UInt, fcchandler: UInt, wflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_ICRemove(fcctype, fcchandler, wflags)

public actual fun ICSendMessage(hic: HIC, msg: UInt, dw1: ULong, dw2: ULong): LRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_ICSendMessage(hic.toCPointer<ByteVar>(), msg, dw1, dw2)

public actual fun ICSeqCompressFrame(pc: Long, uiflags: UInt, lpbits: Long, pfkey: Long, plsize: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_ICSeqCompressFrame(pc.toCPointer<ByteVar>(), uiflags, lpbits.toCPointer<ByteVar>(), pfkey.toCPointer<ByteVar>(), plsize.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ICSeqCompressFrameEnd(pc: Long) {
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_ICSeqCompressFrameEnd(pc.toCPointer<ByteVar>())
}

public actual fun ICSeqCompressFrameStart(pc: Long, lpbiin: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_ICSeqCompressFrameStart(pc.toCPointer<ByteVar>(), lpbiin.toCPointer<ByteVar>())

public actual fun MCIWndCreateA(hwndparent: HWND, hinstance: HINSTANCE, dwstyle: UInt, szfile: PCSTR): HWND =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_MCIWndCreateA(hwndparent.toCPointer<ByteVar>(), hinstance.toCPointer<ByteVar>(), dwstyle, szfile.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun MCIWndCreateW(hwndparent: HWND, hinstance: HINSTANCE, dwstyle: UInt, szfile: PCWSTR): HWND =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_MCIWndCreateW(hwndparent.toCPointer<ByteVar>(), hinstance.toCPointer<ByteVar>(), dwstyle, szfile.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun MCIWndRegisterClass(): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_MCIWndRegisterClass()

public actual fun OpenDriver(szdrivername: PCWSTR, szsectionname: PCWSTR, lparam2: LPARAM): HDRVR =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_OpenDriver(szdrivername.toCPointer<ByteVar>(), szsectionname.toCPointer<ByteVar>(), lparam2)?.toLong() ?: 0L

public actual fun SendDriverMessage(hdriver: HDRVR, message: UInt, lparam1: LPARAM, lparam2: LPARAM): LRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_SendDriverMessage(hdriver.toCPointer<ByteVar>(), message, lparam1, lparam2)

public actual fun VideoForWindowsVersion(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_VideoForWindowsVersion()

public actual fun capCreateCaptureWindowA(lpszwindowname: PCSTR, dwstyle: UInt, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: HWND, nid: Int): HWND =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_capCreateCaptureWindowA(lpszwindowname.toCPointer<ByteVar>(), dwstyle, x, y, nwidth, nheight, hwndparent.toCPointer<ByteVar>(), nid)?.toLong() ?: 0L

public actual fun capCreateCaptureWindowW(lpszwindowname: PCWSTR, dwstyle: UInt, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: HWND, nid: Int): HWND =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_capCreateCaptureWindowW(lpszwindowname.toCPointer<ByteVar>(), dwstyle, x, y, nwidth, nheight, hwndparent.toCPointer<ByteVar>(), nid)?.toLong() ?: 0L

public actual fun capGetDriverDescriptionA(wdriverindex: UInt, lpszname: PSTR, cbname: Int, lpszver: PSTR, cbver: Int): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_capGetDriverDescriptionA(wdriverindex, lpszname.toCPointer<ByteVar>(), cbname, lpszver.toCPointer<ByteVar>(), cbver)

public actual fun capGetDriverDescriptionW(wdriverindex: UInt, lpszname: PWSTR, cbname: Int, lpszver: PWSTR, cbver: Int): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_capGetDriverDescriptionW(wdriverindex, lpszname.toCPointer<ByteVar>(), cbname, lpszver.toCPointer<ByteVar>(), cbver)

public actual fun joyGetDevCapsA(ujoyid: ULong, pjc: Long, cbjc: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_joyGetDevCapsA(ujoyid, pjc.toCPointer<ByteVar>(), cbjc)

public actual fun joyGetDevCapsW(ujoyid: ULong, pjc: Long, cbjc: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_joyGetDevCapsW(ujoyid, pjc.toCPointer<ByteVar>(), cbjc)

public actual fun joyGetNumDevs(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_joyGetNumDevs()

public actual fun joyGetPos(ujoyid: UInt, pji: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_joyGetPos(ujoyid, pji.toCPointer<ByteVar>())

public actual fun joyGetPosEx(ujoyid: UInt, pji: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_joyGetPosEx(ujoyid, pji.toCPointer<ByteVar>())

public actual fun joyGetThreshold(ujoyid: UInt, puthreshold: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_joyGetThreshold(ujoyid, puthreshold.toCPointer<ByteVar>())

public actual fun joyReleaseCapture(ujoyid: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_joyReleaseCapture(ujoyid)

public actual fun joySetCapture(hwnd: HWND, ujoyid: UInt, uperiod: UInt, fchanged: BOOL): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_joySetCapture(hwnd.toCPointer<ByteVar>(), ujoyid, uperiod, fchanged)

public actual fun joySetThreshold(ujoyid: UInt, uthreshold: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_joySetThreshold(ujoyid, uthreshold)

public actual fun mciDriverNotify(hwndcallback: HANDLE, wdeviceid: UInt, ustatus: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mciDriverNotify(hwndcallback.toCPointer<ByteVar>(), wdeviceid, ustatus)

public actual fun mciDriverYield(wdeviceid: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mciDriverYield(wdeviceid)

public actual fun mciFreeCommandResource(wtable: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mciFreeCommandResource(wtable)

public actual fun mciGetCreatorTask(mciid: UInt): HTASK =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mciGetCreatorTask(mciid)?.toLong() ?: 0L

public actual fun mciGetDeviceIDA(pszdevice: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mciGetDeviceIDA(pszdevice.toCPointer<ByteVar>())

public actual fun mciGetDeviceIDFromElementIDA(dwelementid: UInt, lpstrtype: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mciGetDeviceIDFromElementIDA(dwelementid, lpstrtype.toCPointer<ByteVar>())

public actual fun mciGetDeviceIDFromElementIDW(dwelementid: UInt, lpstrtype: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mciGetDeviceIDFromElementIDW(dwelementid, lpstrtype.toCPointer<ByteVar>())

public actual fun mciGetDeviceIDW(pszdevice: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mciGetDeviceIDW(pszdevice.toCPointer<ByteVar>())

public actual fun mciGetDriverData(wdeviceid: UInt): ULong =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mciGetDriverData(wdeviceid)

public actual fun mciGetErrorStringA(mcierr: UInt, psztext: PSTR, cchtext: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mciGetErrorStringA(mcierr, psztext.toCPointer<ByteVar>(), cchtext)

public actual fun mciGetErrorStringW(mcierr: UInt, psztext: PWSTR, cchtext: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mciGetErrorStringW(mcierr, psztext.toCPointer<ByteVar>(), cchtext)

public actual fun mciGetYieldProc(mciid: UInt, pdwyielddata: Long): YIELDPROC =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mciGetYieldProc(mciid, pdwyielddata.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun mciLoadCommandResource(hinstance: HANDLE, lpresname: PCWSTR, wtype: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mciLoadCommandResource(hinstance.toCPointer<ByteVar>(), lpresname.toCPointer<ByteVar>(), wtype)

public actual fun mciSendCommandA(mciid: UInt, umsg: UInt, dwparam1: ULong, dwparam2: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mciSendCommandA(mciid, umsg, dwparam1, dwparam2)

public actual fun mciSendCommandW(mciid: UInt, umsg: UInt, dwparam1: ULong, dwparam2: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mciSendCommandW(mciid, umsg, dwparam1, dwparam2)

public actual fun mciSendStringA(lpstrcommand: PCSTR, lpstrreturnstring: PSTR, ureturnlength: UInt, hwndcallback: HWND): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mciSendStringA(lpstrcommand.toCPointer<ByteVar>(), lpstrreturnstring.toCPointer<ByteVar>(), ureturnlength, hwndcallback.toCPointer<ByteVar>())

public actual fun mciSendStringW(lpstrcommand: PCWSTR, lpstrreturnstring: PWSTR, ureturnlength: UInt, hwndcallback: HWND): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mciSendStringW(lpstrcommand.toCPointer<ByteVar>(), lpstrreturnstring.toCPointer<ByteVar>(), ureturnlength, hwndcallback.toCPointer<ByteVar>())

public actual fun mciSetDriverData(wdeviceid: UInt, dwdata: ULong): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mciSetDriverData(wdeviceid, dwdata)

public actual fun mciSetYieldProc(mciid: UInt, fpyieldproc: YIELDPROC, dwyielddata: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mciSetYieldProc(mciid, fpyieldproc.toLong().toCPointer<ByteVar>(), dwyielddata)

public actual fun mmDrvInstall(hdriver: HDRVR, wszdrventry: PCWSTR, drvmessage: DRIVERMSGPROC, wflags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mmDrvInstall(hdriver.toCPointer<ByteVar>(), wszdrventry.toCPointer<ByteVar>(), drvmessage.toLong().toCPointer<ByteVar>(), wflags)

public actual fun mmGetCurrentTask(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mmGetCurrentTask()

public actual fun mmTaskBlock(h: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mmTaskBlock(h)
}

public actual fun mmTaskCreate(lpfn: LPTASKCALLBACK, lph: Long, dwinst: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mmTaskCreate(lpfn.toLong().toCPointer<ByteVar>(), lph.toCPointer<ByteVar>(), dwinst)

public actual fun mmTaskSignal(h: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mmTaskSignal(h)

public actual fun mmTaskYield() {
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mmTaskYield()
}

public actual fun mmioAdvance(hmmio: HMMIO, pmmioinfo: Long, fuadvance: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mmioAdvance(hmmio.toCPointer<ByteVar>(), pmmioinfo.toCPointer<ByteVar>(), fuadvance)

public actual fun mmioAscend(hmmio: HMMIO, pmmcki: Long, fuascend: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mmioAscend(hmmio.toCPointer<ByteVar>(), pmmcki.toCPointer<ByteVar>(), fuascend)

public actual fun mmioClose(hmmio: HMMIO, fuclose: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mmioClose(hmmio.toCPointer<ByteVar>(), fuclose)

public actual fun mmioCreateChunk(hmmio: HMMIO, pmmcki: Long, fucreate: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mmioCreateChunk(hmmio.toCPointer<ByteVar>(), pmmcki.toCPointer<ByteVar>(), fucreate)

public actual fun mmioDescend(hmmio: HMMIO, pmmcki: Long, pmmckiparent: Long, fudescend: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mmioDescend(hmmio.toCPointer<ByteVar>(), pmmcki.toCPointer<ByteVar>(), pmmckiparent.toCPointer<ByteVar>(), fudescend)

public actual fun mmioFlush(hmmio: HMMIO, fuflush: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mmioFlush(hmmio.toCPointer<ByteVar>(), fuflush)

public actual fun mmioGetInfo(hmmio: HMMIO, pmmioinfo: Long, fuinfo: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mmioGetInfo(hmmio.toCPointer<ByteVar>(), pmmioinfo.toCPointer<ByteVar>(), fuinfo)

public actual fun mmioInstallIOProcA(fccioproc: UInt, pioproc: LPMMIOPROC, dwflags: UInt): LPMMIOPROC =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mmioInstallIOProcA(fccioproc, pioproc.toLong().toCPointer<ByteVar>(), dwflags)?.toLong() ?: 0L

public actual fun mmioInstallIOProcW(fccioproc: UInt, pioproc: LPMMIOPROC, dwflags: UInt): LPMMIOPROC =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mmioInstallIOProcW(fccioproc, pioproc.toLong().toCPointer<ByteVar>(), dwflags)?.toLong() ?: 0L

public actual fun mmioOpenA(pszfilename: PSTR, pmmioinfo: Long, fdwopen: UInt): HMMIO =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mmioOpenA(pszfilename.toCPointer<ByteVar>(), pmmioinfo.toCPointer<ByteVar>(), fdwopen)?.toLong() ?: 0L

public actual fun mmioOpenW(pszfilename: PWSTR, pmmioinfo: Long, fdwopen: UInt): HMMIO =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mmioOpenW(pszfilename.toCPointer<ByteVar>(), pmmioinfo.toCPointer<ByteVar>(), fdwopen)?.toLong() ?: 0L

public actual fun mmioRead(hmmio: HMMIO, pch: Long, cch: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mmioRead(hmmio.toCPointer<ByteVar>(), pch.toCPointer<ByteVar>(), cch)

public actual fun mmioRenameA(pszfilename: PCSTR, psznewfilename: PCSTR, pmmioinfo: Long, fdwrename: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mmioRenameA(pszfilename.toCPointer<ByteVar>(), psznewfilename.toCPointer<ByteVar>(), pmmioinfo.toCPointer<ByteVar>(), fdwrename)

public actual fun mmioRenameW(pszfilename: PCWSTR, psznewfilename: PCWSTR, pmmioinfo: Long, fdwrename: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mmioRenameW(pszfilename.toCPointer<ByteVar>(), psznewfilename.toCPointer<ByteVar>(), pmmioinfo.toCPointer<ByteVar>(), fdwrename)

public actual fun mmioSeek(hmmio: HMMIO, loffset: Int, iorigin: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mmioSeek(hmmio.toCPointer<ByteVar>(), loffset, iorigin)

public actual fun mmioSendMessage(hmmio: HMMIO, umsg: UInt, lparam1: LPARAM, lparam2: LPARAM): LRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mmioSendMessage(hmmio.toCPointer<ByteVar>(), umsg, lparam1, lparam2)

public actual fun mmioSetBuffer(hmmio: HMMIO, pchbuffer: PSTR, cchbuffer: Int, fubuffer: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mmioSetBuffer(hmmio.toCPointer<ByteVar>(), pchbuffer.toCPointer<ByteVar>(), cchbuffer, fubuffer)

public actual fun mmioSetInfo(hmmio: HMMIO, pmmioinfo: Long, fuinfo: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mmioSetInfo(hmmio.toCPointer<ByteVar>(), pmmioinfo.toCPointer<ByteVar>(), fuinfo)

public actual fun mmioStringToFOURCCA(sz: PCSTR, uflags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mmioStringToFOURCCA(sz.toCPointer<ByteVar>(), uflags)

public actual fun mmioStringToFOURCCW(sz: PCWSTR, uflags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mmioStringToFOURCCW(sz.toCPointer<ByteVar>(), uflags)

public actual fun mmioWrite(hmmio: HMMIO, pch: PCSTR, cch: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mmioWrite(hmmio.toCPointer<ByteVar>(), pch.toCPointer<ByteVar>(), cch)

public actual fun sndOpenSound(eventname: PCWSTR, appname: PCWSTR, flags: Int, filehandle: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_sndOpenSound(eventname.toCPointer<ByteVar>(), appname.toCPointer<ByteVar>(), flags, filehandle.toCPointer<ByteVar>())
