@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun aVIBuildFilterA(lpszfilter: Pstr, cbfilter: Int, fsaving: Bool): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_aVIBuildFilterA(lpszfilter?.value?.toCPointer<ByteVar>(), cbfilter, fsaving)

public actual fun aVIBuildFilterW(lpszfilter: Pwstr, cbfilter: Int, fsaving: Bool): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_aVIBuildFilterW(lpszfilter?.value?.toCPointer<ByteVar>(), cbfilter, fsaving)

public actual fun aVIClearClipboard(): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_aVIClearClipboard()

public actual fun aVIFileAddRef(pfile: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_aVIFileAddRef(pfile?.value?.toCPointer<ByteVar>())

public actual fun aVIFileCreateStreamA(pfile: COpaquePointer?, ppavi: COpaquePointer?, psi: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_aVIFileCreateStreamA(pfile?.value?.toCPointer<ByteVar>(), ppavi?.value?.toCPointer<ByteVar>(), psi?.value?.toCPointer<ByteVar>())

public actual fun aVIFileCreateStreamW(pfile: COpaquePointer?, ppavi: COpaquePointer?, psi: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_aVIFileCreateStreamW(pfile?.value?.toCPointer<ByteVar>(), ppavi?.value?.toCPointer<ByteVar>(), psi?.value?.toCPointer<ByteVar>())

public actual fun aVIFileEndRecord(pfile: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_aVIFileEndRecord(pfile?.value?.toCPointer<ByteVar>())

public actual fun aVIFileExit() {
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_aVIFileExit()
}

public actual fun aVIFileGetStream(pfile: COpaquePointer?, ppavi: COpaquePointer?, fcctype: UInt, lparam: Int): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_aVIFileGetStream(pfile?.value?.toCPointer<ByteVar>(), ppavi?.value?.toCPointer<ByteVar>(), fcctype, lparam)

public actual fun aVIFileInfoA(pfile: COpaquePointer?, pfi: COpaquePointer?, lsize: Int): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_aVIFileInfoA(pfile?.value?.toCPointer<ByteVar>(), pfi?.value?.toCPointer<ByteVar>(), lsize)

public actual fun aVIFileInfoW(pfile: COpaquePointer?, pfi: COpaquePointer?, lsize: Int): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_aVIFileInfoW(pfile?.value?.toCPointer<ByteVar>(), pfi?.value?.toCPointer<ByteVar>(), lsize)

public actual fun aVIFileInit() {
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_aVIFileInit()
}

public actual fun aVIFileOpenA(ppfile: COpaquePointer?, szfile: Pcstr, umode: UInt, lphandler: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_aVIFileOpenA(ppfile?.value?.toCPointer<ByteVar>(), szfile?.value?.toCPointer<ByteVar>(), umode, lphandler?.value?.toCPointer<ByteVar>())

public actual fun aVIFileOpenW(ppfile: COpaquePointer?, szfile: Pcwstr, umode: UInt, lphandler: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_aVIFileOpenW(ppfile?.value?.toCPointer<ByteVar>(), szfile?.value?.toCPointer<ByteVar>(), umode, lphandler?.value?.toCPointer<ByteVar>())

public actual fun aVIFileReadData(pfile: COpaquePointer?, ckid: UInt, lpdata: COpaquePointer?, lpcbdata: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_aVIFileReadData(pfile?.value?.toCPointer<ByteVar>(), ckid, lpdata?.value?.toCPointer<ByteVar>(), lpcbdata?.value?.toCPointer<ByteVar>())

public actual fun aVIFileRelease(pfile: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_aVIFileRelease(pfile?.value?.toCPointer<ByteVar>())

public actual fun aVIFileWriteData(pfile: COpaquePointer?, ckid: UInt, lpdata: COpaquePointer?, cbdata: Int): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_aVIFileWriteData(pfile?.value?.toCPointer<ByteVar>(), ckid, lpdata?.value?.toCPointer<ByteVar>(), cbdata)

public actual fun aVIGetFromClipboard(lppf: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_aVIGetFromClipboard(lppf?.value?.toCPointer<ByteVar>())

public actual fun aVIMakeCompressedStream(ppscompressed: COpaquePointer?, ppssource: COpaquePointer?, lpoptions: COpaquePointer?, pclsidhandler: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_aVIMakeCompressedStream(ppscompressed?.value?.toCPointer<ByteVar>(), ppssource?.value?.toCPointer<ByteVar>(), lpoptions?.value?.toCPointer<ByteVar>(), pclsidhandler?.value?.toCPointer<ByteVar>())

public actual fun aVIMakeFileFromStreams(ppfile: COpaquePointer?, nstreams: Int, papstreams: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_aVIMakeFileFromStreams(ppfile?.value?.toCPointer<ByteVar>(), nstreams, papstreams?.value?.toCPointer<ByteVar>())

public actual fun aVIMakeStreamFromClipboard(cfformat: UInt, hglobal: Handle, ppstream: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_aVIMakeStreamFromClipboard(cfformat, hglobal?.value?.toCPointer<ByteVar>(), ppstream?.value?.toCPointer<ByteVar>())

public actual fun aVIPutFileOnClipboard(pf: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_aVIPutFileOnClipboard(pf?.value?.toCPointer<ByteVar>())

public actual fun aVISaveA(szfile: Pcstr, pclsidhandler: COpaquePointer?, lpfncallback: Avisavecallback, nstreams: Int, pfile: COpaquePointer?, lpoptions: COpaquePointer?, vararg variadicArgs: Long): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_aVISaveA(szfile?.value?.toCPointer<ByteVar>(), pclsidhandler?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), nstreams, pfile?.value?.toCPointer<ByteVar>(), lpoptions?.value?.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun aVISaveOptions(hwnd: Hwnd, uiflags: UInt, nstreams: Int, ppavi: COpaquePointer?, plpoptions: COpaquePointer?): Long =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_aVISaveOptions(hwnd?.value?.toCPointer<ByteVar>(), uiflags, nstreams, ppavi?.value?.toCPointer<ByteVar>(), plpoptions?.value?.toCPointer<ByteVar>())

public actual fun aVISaveOptionsFree(nstreams: Int, plpoptions: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_aVISaveOptionsFree(nstreams, plpoptions?.value?.toCPointer<ByteVar>())

public actual fun aVISaveVA(szfile: Pcstr, pclsidhandler: COpaquePointer?, lpfncallback: Avisavecallback, nstreams: Int, ppavi: COpaquePointer?, plpoptions: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_aVISaveVA(szfile?.value?.toCPointer<ByteVar>(), pclsidhandler?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), nstreams, ppavi?.value?.toCPointer<ByteVar>(), plpoptions?.value?.toCPointer<ByteVar>())

public actual fun aVISaveVW(szfile: Pcwstr, pclsidhandler: COpaquePointer?, lpfncallback: Avisavecallback, nstreams: Int, ppavi: COpaquePointer?, plpoptions: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_aVISaveVW(szfile?.value?.toCPointer<ByteVar>(), pclsidhandler?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), nstreams, ppavi?.value?.toCPointer<ByteVar>(), plpoptions?.value?.toCPointer<ByteVar>())

public actual fun aVISaveW(szfile: Pcwstr, pclsidhandler: COpaquePointer?, lpfncallback: Avisavecallback, nstreams: Int, pfile: COpaquePointer?, lpoptions: COpaquePointer?, vararg variadicArgs: Long): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_aVISaveW(szfile?.value?.toCPointer<ByteVar>(), pclsidhandler?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), nstreams, pfile?.value?.toCPointer<ByteVar>(), lpoptions?.value?.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun aVIStreamAddRef(pavi: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_aVIStreamAddRef(pavi?.value?.toCPointer<ByteVar>())

public actual fun aVIStreamBeginStreaming(pavi: COpaquePointer?, lstart: Int, lend: Int, lrate: Int): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_aVIStreamBeginStreaming(pavi?.value?.toCPointer<ByteVar>(), lstart, lend, lrate)

public actual fun aVIStreamCreate(ppavi: COpaquePointer?, lparam1: Int, lparam2: Int, pclsidhandler: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_aVIStreamCreate(ppavi?.value?.toCPointer<ByteVar>(), lparam1, lparam2, pclsidhandler?.value?.toCPointer<ByteVar>())

public actual fun aVIStreamEndStreaming(pavi: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_aVIStreamEndStreaming(pavi?.value?.toCPointer<ByteVar>())

public actual fun aVIStreamFindSample(pavi: COpaquePointer?, lpos: Int, lflags: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_aVIStreamFindSample(pavi?.value?.toCPointer<ByteVar>(), lpos, lflags)

public actual fun aVIStreamGetFrame(pg: COpaquePointer?, lpos: Int): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_aVIStreamGetFrame(pg?.value?.toCPointer<ByteVar>(), lpos)?.let { COpaquePointer(it.toLong()) }

public actual fun aVIStreamGetFrameClose(pg: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_aVIStreamGetFrameClose(pg?.value?.toCPointer<ByteVar>())

public actual fun aVIStreamGetFrameOpen(pavi: COpaquePointer?, lpbiwanted: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_aVIStreamGetFrameOpen(pavi?.value?.toCPointer<ByteVar>(), lpbiwanted?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun aVIStreamInfoA(pavi: COpaquePointer?, psi: COpaquePointer?, lsize: Int): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_aVIStreamInfoA(pavi?.value?.toCPointer<ByteVar>(), psi?.value?.toCPointer<ByteVar>(), lsize)

public actual fun aVIStreamInfoW(pavi: COpaquePointer?, psi: COpaquePointer?, lsize: Int): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_aVIStreamInfoW(pavi?.value?.toCPointer<ByteVar>(), psi?.value?.toCPointer<ByteVar>(), lsize)

public actual fun aVIStreamLength(pavi: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_aVIStreamLength(pavi?.value?.toCPointer<ByteVar>())

public actual fun aVIStreamOpenFromFileA(ppavi: COpaquePointer?, szfile: Pcstr, fcctype: UInt, lparam: Int, mode: UInt, pclsidhandler: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_aVIStreamOpenFromFileA(ppavi?.value?.toCPointer<ByteVar>(), szfile?.value?.toCPointer<ByteVar>(), fcctype, lparam, mode, pclsidhandler?.value?.toCPointer<ByteVar>())

public actual fun aVIStreamOpenFromFileW(ppavi: COpaquePointer?, szfile: Pcwstr, fcctype: UInt, lparam: Int, mode: UInt, pclsidhandler: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_aVIStreamOpenFromFileW(ppavi?.value?.toCPointer<ByteVar>(), szfile?.value?.toCPointer<ByteVar>(), fcctype, lparam, mode, pclsidhandler?.value?.toCPointer<ByteVar>())

public actual fun aVIStreamRead(pavi: COpaquePointer?, lstart: Int, lsamples: Int, lpbuffer: COpaquePointer?, cbbuffer: Int, plbytes: COpaquePointer?, plsamples: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_aVIStreamRead(pavi?.value?.toCPointer<ByteVar>(), lstart, lsamples, lpbuffer?.value?.toCPointer<ByteVar>(), cbbuffer, plbytes?.value?.toCPointer<ByteVar>(), plsamples?.value?.toCPointer<ByteVar>())

public actual fun aVIStreamReadData(pavi: COpaquePointer?, fcc: UInt, lp: COpaquePointer?, lpcb: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_aVIStreamReadData(pavi?.value?.toCPointer<ByteVar>(), fcc, lp?.value?.toCPointer<ByteVar>(), lpcb?.value?.toCPointer<ByteVar>())

public actual fun aVIStreamReadFormat(pavi: COpaquePointer?, lpos: Int, lpformat: COpaquePointer?, lpcbformat: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_aVIStreamReadFormat(pavi?.value?.toCPointer<ByteVar>(), lpos, lpformat?.value?.toCPointer<ByteVar>(), lpcbformat?.value?.toCPointer<ByteVar>())

public actual fun aVIStreamRelease(pavi: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_aVIStreamRelease(pavi?.value?.toCPointer<ByteVar>())

public actual fun aVIStreamSampleToTime(pavi: COpaquePointer?, lsample: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_aVIStreamSampleToTime(pavi?.value?.toCPointer<ByteVar>(), lsample)

public actual fun aVIStreamSetFormat(pavi: COpaquePointer?, lpos: Int, lpformat: COpaquePointer?, cbformat: Int): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_aVIStreamSetFormat(pavi?.value?.toCPointer<ByteVar>(), lpos, lpformat?.value?.toCPointer<ByteVar>(), cbformat)

public actual fun aVIStreamStart(pavi: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_aVIStreamStart(pavi?.value?.toCPointer<ByteVar>())

public actual fun aVIStreamTimeToSample(pavi: COpaquePointer?, ltime: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_aVIStreamTimeToSample(pavi?.value?.toCPointer<ByteVar>(), ltime)

public actual fun aVIStreamWrite(pavi: COpaquePointer?, lstart: Int, lsamples: Int, lpbuffer: COpaquePointer?, cbbuffer: Int, dwflags: UInt, plsampwritten: COpaquePointer?, plbyteswritten: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_aVIStreamWrite(pavi?.value?.toCPointer<ByteVar>(), lstart, lsamples, lpbuffer?.value?.toCPointer<ByteVar>(), cbbuffer, dwflags, plsampwritten?.value?.toCPointer<ByteVar>(), plbyteswritten?.value?.toCPointer<ByteVar>())

public actual fun aVIStreamWriteData(pavi: COpaquePointer?, fcc: UInt, lp: COpaquePointer?, cb: Int): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_aVIStreamWriteData(pavi?.value?.toCPointer<ByteVar>(), fcc, lp?.value?.toCPointer<ByteVar>(), cb)

public actual fun closeDriver(hdriver: Hdrvr, lparam1: Lparam, lparam2: Lparam): Lresult =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_closeDriver(hdriver?.value?.toCPointer<ByteVar>(), lparam1, lparam2)

public actual fun createEditableStream(ppseditable: COpaquePointer?, pssource: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_createEditableStream(ppseditable?.value?.toCPointer<ByteVar>(), pssource?.value?.toCPointer<ByteVar>())

public actual fun defDriverProc(dwdriveridentifier: ULong, hdrvr: Hdrvr, umsg: UInt, lparam1: Lparam, lparam2: Lparam): Lresult =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_defDriverProc(dwdriveridentifier, hdrvr?.value?.toCPointer<ByteVar>(), umsg, lparam1, lparam2)

public actual fun drawDibBegin(hdd: Long, hdc: Hdc, dxdst: Int, dydst: Int, lpbi: COpaquePointer?, dxsrc: Int, dysrc: Int, wflags: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_drawDibBegin(hdd, hdc?.value?.toCPointer<ByteVar>(), dxdst, dydst, lpbi?.value?.toCPointer<ByteVar>(), dxsrc, dysrc, wflags)

public actual fun drawDibChangePalette(hdd: Long, istart: Int, ilen: Int, lppe: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_drawDibChangePalette(hdd, istart, ilen, lppe?.value?.toCPointer<ByteVar>())

public actual fun drawDibClose(hdd: Long): Bool =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_drawDibClose(hdd)

public actual fun drawDibDraw(hdd: Long, hdc: Hdc, xdst: Int, ydst: Int, dxdst: Int, dydst: Int, lpbi: COpaquePointer?, lpbits: COpaquePointer?, xsrc: Int, ysrc: Int, dxsrc: Int, dysrc: Int, wflags: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_drawDibDraw(hdd, hdc?.value?.toCPointer<ByteVar>(), xdst, ydst, dxdst, dydst, lpbi?.value?.toCPointer<ByteVar>(), lpbits?.value?.toCPointer<ByteVar>(), xsrc, ysrc, dxsrc, dysrc, wflags)

public actual fun drawDibEnd(hdd: Long): Bool =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_drawDibEnd(hdd)

public actual fun drawDibGetBuffer(hdd: Long, lpbi: COpaquePointer?, dwsize: UInt, dwflags: UInt): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_drawDibGetBuffer(hdd, lpbi?.value?.toCPointer<ByteVar>(), dwsize, dwflags)?.let { COpaquePointer(it.toLong()) }

public actual fun drawDibGetPalette(hdd: Long): Hpalette =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_drawDibGetPalette(hdd)?.let { COpaquePointer(it.toLong()) }

public actual fun drawDibOpen(): Long =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_drawDibOpen()

public actual fun drawDibProfileDisplay(lpbi: COpaquePointer?): Lresult =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_drawDibProfileDisplay(lpbi?.value?.toCPointer<ByteVar>())

public actual fun drawDibRealize(hdd: Long, hdc: Hdc, fbackground: Bool): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_drawDibRealize(hdd, hdc?.value?.toCPointer<ByteVar>(), fbackground)

public actual fun drawDibSetPalette(hdd: Long, hpal: Hpalette): Bool =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_drawDibSetPalette(hdd, hpal?.value?.toCPointer<ByteVar>())

public actual fun drawDibStart(hdd: Long, rate: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_drawDibStart(hdd, rate)

public actual fun drawDibStop(hdd: Long): Bool =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_drawDibStop(hdd)

public actual fun drawDibTime(hdd: Long, lpddtime: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_drawDibTime(hdd, lpddtime?.value?.toCPointer<ByteVar>())

public actual fun driverCallback(dwcallback: ULong, dwflags: UInt, hdevice: Hdrvr, dwmsg: UInt, dwuser: ULong, dwparam1: ULong, dwparam2: ULong): Bool =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_driverCallback(dwcallback, dwflags, hdevice?.value?.toCPointer<ByteVar>(), dwmsg, dwuser, dwparam1, dwparam2)

public actual fun drvGetModuleHandle(hdriver: Hdrvr): Hmodule =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_drvGetModuleHandle(hdriver?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun editStreamClone(pavi: COpaquePointer?, ppresult: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_editStreamClone(pavi?.value?.toCPointer<ByteVar>(), ppresult?.value?.toCPointer<ByteVar>())

public actual fun editStreamCopy(pavi: COpaquePointer?, plstart: COpaquePointer?, pllength: COpaquePointer?, ppresult: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_editStreamCopy(pavi?.value?.toCPointer<ByteVar>(), plstart?.value?.toCPointer<ByteVar>(), pllength?.value?.toCPointer<ByteVar>(), ppresult?.value?.toCPointer<ByteVar>())

public actual fun editStreamCut(pavi: COpaquePointer?, plstart: COpaquePointer?, pllength: COpaquePointer?, ppresult: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_editStreamCut(pavi?.value?.toCPointer<ByteVar>(), plstart?.value?.toCPointer<ByteVar>(), pllength?.value?.toCPointer<ByteVar>(), ppresult?.value?.toCPointer<ByteVar>())

public actual fun editStreamPaste(pavi: COpaquePointer?, plpos: COpaquePointer?, pllength: COpaquePointer?, pstream: COpaquePointer?, lstart: Int, lend: Int): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_editStreamPaste(pavi?.value?.toCPointer<ByteVar>(), plpos?.value?.toCPointer<ByteVar>(), pllength?.value?.toCPointer<ByteVar>(), pstream?.value?.toCPointer<ByteVar>(), lstart, lend)

public actual fun editStreamSetInfoA(pavi: COpaquePointer?, lpinfo: COpaquePointer?, cbinfo: Int): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_editStreamSetInfoA(pavi?.value?.toCPointer<ByteVar>(), lpinfo?.value?.toCPointer<ByteVar>(), cbinfo)

public actual fun editStreamSetInfoW(pavi: COpaquePointer?, lpinfo: COpaquePointer?, cbinfo: Int): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_editStreamSetInfoW(pavi?.value?.toCPointer<ByteVar>(), lpinfo?.value?.toCPointer<ByteVar>(), cbinfo)

public actual fun editStreamSetNameA(pavi: COpaquePointer?, lpszname: Pcstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_editStreamSetNameA(pavi?.value?.toCPointer<ByteVar>(), lpszname?.value?.toCPointer<ByteVar>())

public actual fun editStreamSetNameW(pavi: COpaquePointer?, lpszname: Pcwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_editStreamSetNameW(pavi?.value?.toCPointer<ByteVar>(), lpszname?.value?.toCPointer<ByteVar>())

public actual fun getDriverModuleHandle(hdriver: Hdrvr): Hmodule =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_getDriverModuleHandle(hdriver?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getOpenFileNamePreviewA(lpofn: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_getOpenFileNamePreviewA(lpofn?.value?.toCPointer<ByteVar>())

public actual fun getOpenFileNamePreviewW(lpofn: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_getOpenFileNamePreviewW(lpofn?.value?.toCPointer<ByteVar>())

public actual fun getSaveFileNamePreviewA(lpofn: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_getSaveFileNamePreviewA(lpofn?.value?.toCPointer<ByteVar>())

public actual fun getSaveFileNamePreviewW(lpofn: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_getSaveFileNamePreviewW(lpofn?.value?.toCPointer<ByteVar>())

public actual fun iCClose(hic: Hic): Lresult =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_iCClose(hic?.value?.toCPointer<ByteVar>())

public actual fun iCCompress(hic: Hic, dwflags: UInt, lpbioutput: COpaquePointer?, lpdata: COpaquePointer?, lpbiinput: COpaquePointer?, lpbits: COpaquePointer?, lpckid: COpaquePointer?, lpdwflags: COpaquePointer?, lframenum: Int, dwframesize: UInt, dwquality: UInt, lpbiprev: COpaquePointer?, lpprev: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_iCCompress(hic?.value?.toCPointer<ByteVar>(), dwflags, lpbioutput?.value?.toCPointer<ByteVar>(), lpdata?.value?.toCPointer<ByteVar>(), lpbiinput?.value?.toCPointer<ByteVar>(), lpbits?.value?.toCPointer<ByteVar>(), lpckid?.value?.toCPointer<ByteVar>(), lpdwflags?.value?.toCPointer<ByteVar>(), lframenum, dwframesize, dwquality, lpbiprev?.value?.toCPointer<ByteVar>(), lpprev?.value?.toCPointer<ByteVar>())

public actual fun iCCompressorChoose(hwnd: Hwnd, uiflags: UInt, pvin: COpaquePointer?, lpdata: COpaquePointer?, pc: COpaquePointer?, lpsztitle: Pcstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_iCCompressorChoose(hwnd?.value?.toCPointer<ByteVar>(), uiflags, pvin?.value?.toCPointer<ByteVar>(), lpdata?.value?.toCPointer<ByteVar>(), pc?.value?.toCPointer<ByteVar>(), lpsztitle?.value?.toCPointer<ByteVar>())

public actual fun iCCompressorFree(pc: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_iCCompressorFree(pc?.value?.toCPointer<ByteVar>())
}

public actual fun iCDecompress(hic: Hic, dwflags: UInt, lpbiformat: COpaquePointer?, lpdata: COpaquePointer?, lpbi: COpaquePointer?, lpbits: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_iCDecompress(hic?.value?.toCPointer<ByteVar>(), dwflags, lpbiformat?.value?.toCPointer<ByteVar>(), lpdata?.value?.toCPointer<ByteVar>(), lpbi?.value?.toCPointer<ByteVar>(), lpbits?.value?.toCPointer<ByteVar>())

public actual fun iCDraw(hic: Hic, dwflags: UInt, lpformat: COpaquePointer?, lpdata: COpaquePointer?, cbdata: UInt, ltime: Int): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_iCDraw(hic?.value?.toCPointer<ByteVar>(), dwflags, lpformat?.value?.toCPointer<ByteVar>(), lpdata?.value?.toCPointer<ByteVar>(), cbdata, ltime)

public actual fun iCDrawBegin(hic: Hic, dwflags: UInt, hpal: Hpalette, hwnd: Hwnd, hdc: Hdc, xdst: Int, ydst: Int, dxdst: Int, dydst: Int, lpbi: COpaquePointer?, xsrc: Int, ysrc: Int, dxsrc: Int, dysrc: Int, dwrate: UInt, dwscale: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_iCDrawBegin(hic?.value?.toCPointer<ByteVar>(), dwflags, hpal?.value?.toCPointer<ByteVar>(), hwnd?.value?.toCPointer<ByteVar>(), hdc?.value?.toCPointer<ByteVar>(), xdst, ydst, dxdst, dydst, lpbi?.value?.toCPointer<ByteVar>(), xsrc, ysrc, dxsrc, dysrc, dwrate, dwscale)

public actual fun iCGetDisplayFormat(hic: Hic, lpbiin: COpaquePointer?, lpbiout: COpaquePointer?, bitdepth: Int, dx: Int, dy: Int): Hic =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_iCGetDisplayFormat(hic?.value?.toCPointer<ByteVar>(), lpbiin?.value?.toCPointer<ByteVar>(), lpbiout?.value?.toCPointer<ByteVar>(), bitdepth, dx, dy)?.let { COpaquePointer(it.toLong()) }

public actual fun iCGetInfo(hic: Hic, picinfo: COpaquePointer?, cb: UInt): Lresult =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_iCGetInfo(hic?.value?.toCPointer<ByteVar>(), picinfo?.value?.toCPointer<ByteVar>(), cb)

public actual fun iCImageCompress(hic: Hic, uiflags: UInt, lpbiin: COpaquePointer?, lpbits: COpaquePointer?, lpbiout: COpaquePointer?, lquality: Int, plsize: COpaquePointer?): Handle =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_iCImageCompress(hic?.value?.toCPointer<ByteVar>(), uiflags, lpbiin?.value?.toCPointer<ByteVar>(), lpbits?.value?.toCPointer<ByteVar>(), lpbiout?.value?.toCPointer<ByteVar>(), lquality, plsize?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun iCImageDecompress(hic: Hic, uiflags: UInt, lpbiin: COpaquePointer?, lpbits: COpaquePointer?, lpbiout: COpaquePointer?): Handle =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_iCImageDecompress(hic?.value?.toCPointer<ByteVar>(), uiflags, lpbiin?.value?.toCPointer<ByteVar>(), lpbits?.value?.toCPointer<ByteVar>(), lpbiout?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun iCInfo(fcctype: UInt, fcchandler: UInt, lpicinfo: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_iCInfo(fcctype, fcchandler, lpicinfo?.value?.toCPointer<ByteVar>())

public actual fun iCInstall(fcctype: UInt, fcchandler: UInt, lparam: Lparam, szdesc: Pcstr, wflags: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_iCInstall(fcctype, fcchandler, lparam, szdesc?.value?.toCPointer<ByteVar>(), wflags)

public actual fun iCLocate(fcctype: UInt, fcchandler: UInt, lpbiin: COpaquePointer?, lpbiout: COpaquePointer?, wflags: UShort): Hic =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_iCLocate(fcctype, fcchandler, lpbiin?.value?.toCPointer<ByteVar>(), lpbiout?.value?.toCPointer<ByteVar>(), wflags)?.let { COpaquePointer(it.toLong()) }

public actual fun iCOpen(fcctype: UInt, fcchandler: UInt, wmode: UInt): Hic =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_iCOpen(fcctype, fcchandler, wmode)?.let { COpaquePointer(it.toLong()) }

public actual fun iCOpenFunction(fcctype: UInt, fcchandler: UInt, wmode: UInt, lpfnhandler: Farproc): Hic =
    null

public actual fun iCRemove(fcctype: UInt, fcchandler: UInt, wflags: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_iCRemove(fcctype, fcchandler, wflags)

public actual fun iCSendMessage(hic: Hic, msg: UInt, dw1: ULong, dw2: ULong): Lresult =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_iCSendMessage(hic?.value?.toCPointer<ByteVar>(), msg, dw1, dw2)

public actual fun iCSeqCompressFrame(pc: COpaquePointer?, uiflags: UInt, lpbits: COpaquePointer?, pfkey: COpaquePointer?, plsize: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_iCSeqCompressFrame(pc?.value?.toCPointer<ByteVar>(), uiflags, lpbits?.value?.toCPointer<ByteVar>(), pfkey?.value?.toCPointer<ByteVar>(), plsize?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun iCSeqCompressFrameEnd(pc: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_iCSeqCompressFrameEnd(pc?.value?.toCPointer<ByteVar>())
}

public actual fun iCSeqCompressFrameStart(pc: COpaquePointer?, lpbiin: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_iCSeqCompressFrameStart(pc?.value?.toCPointer<ByteVar>(), lpbiin?.value?.toCPointer<ByteVar>())

public actual fun mCIWndCreateA(hwndparent: Hwnd, hinstance: Hinstance, dwstyle: UInt, szfile: Pcstr): Hwnd =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mCIWndCreateA(hwndparent?.value?.toCPointer<ByteVar>(), hinstance?.value?.toCPointer<ByteVar>(), dwstyle, szfile?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun mCIWndCreateW(hwndparent: Hwnd, hinstance: Hinstance, dwstyle: UInt, szfile: Pcwstr): Hwnd =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mCIWndCreateW(hwndparent?.value?.toCPointer<ByteVar>(), hinstance?.value?.toCPointer<ByteVar>(), dwstyle, szfile?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun mCIWndRegisterClass(): Bool =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mCIWndRegisterClass()

public actual fun openDriver(szdrivername: Pcwstr, szsectionname: Pcwstr, lparam2: Lparam): Hdrvr =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_openDriver(szdrivername?.value?.toCPointer<ByteVar>(), szsectionname?.value?.toCPointer<ByteVar>(), lparam2)?.let { COpaquePointer(it.toLong()) }

public actual fun sendDriverMessage(hdriver: Hdrvr, message: UInt, lparam1: Lparam, lparam2: Lparam): Lresult =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_sendDriverMessage(hdriver?.value?.toCPointer<ByteVar>(), message, lparam1, lparam2)

public actual fun videoForWindowsVersion(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_videoForWindowsVersion()

public actual fun capCreateCaptureWindowA(lpszwindowname: Pcstr, dwstyle: UInt, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: Hwnd, nid: Int): Hwnd =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_capCreateCaptureWindowA(lpszwindowname?.value?.toCPointer<ByteVar>(), dwstyle, x, y, nwidth, nheight, hwndparent?.value?.toCPointer<ByteVar>(), nid)?.let { COpaquePointer(it.toLong()) }

public actual fun capCreateCaptureWindowW(lpszwindowname: Pcwstr, dwstyle: UInt, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: Hwnd, nid: Int): Hwnd =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_capCreateCaptureWindowW(lpszwindowname?.value?.toCPointer<ByteVar>(), dwstyle, x, y, nwidth, nheight, hwndparent?.value?.toCPointer<ByteVar>(), nid)?.let { COpaquePointer(it.toLong()) }

public actual fun capGetDriverDescriptionA(wdriverindex: UInt, lpszname: Pstr, cbname: Int, lpszver: Pstr, cbver: Int): Bool =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_capGetDriverDescriptionA(wdriverindex, lpszname?.value?.toCPointer<ByteVar>(), cbname, lpszver?.value?.toCPointer<ByteVar>(), cbver)

public actual fun capGetDriverDescriptionW(wdriverindex: UInt, lpszname: Pwstr, cbname: Int, lpszver: Pwstr, cbver: Int): Bool =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_capGetDriverDescriptionW(wdriverindex, lpszname?.value?.toCPointer<ByteVar>(), cbname, lpszver?.value?.toCPointer<ByteVar>(), cbver)

public actual fun joyGetDevCapsA(ujoyid: ULong, pjc: COpaquePointer?, cbjc: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_joyGetDevCapsA(ujoyid, pjc?.value?.toCPointer<ByteVar>(), cbjc)

public actual fun joyGetDevCapsW(ujoyid: ULong, pjc: COpaquePointer?, cbjc: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_joyGetDevCapsW(ujoyid, pjc?.value?.toCPointer<ByteVar>(), cbjc)

public actual fun joyGetNumDevs(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_joyGetNumDevs()

public actual fun joyGetPos(ujoyid: UInt, pji: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_joyGetPos(ujoyid, pji?.value?.toCPointer<ByteVar>())

public actual fun joyGetPosEx(ujoyid: UInt, pji: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_joyGetPosEx(ujoyid, pji?.value?.toCPointer<ByteVar>())

public actual fun joyGetThreshold(ujoyid: UInt, puthreshold: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_joyGetThreshold(ujoyid, puthreshold?.value?.toCPointer<ByteVar>())

public actual fun joyReleaseCapture(ujoyid: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_joyReleaseCapture(ujoyid)

public actual fun joySetCapture(hwnd: Hwnd, ujoyid: UInt, uperiod: UInt, fchanged: Bool): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_joySetCapture(hwnd?.value?.toCPointer<ByteVar>(), ujoyid, uperiod, fchanged)

public actual fun joySetThreshold(ujoyid: UInt, uthreshold: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_joySetThreshold(ujoyid, uthreshold)

public actual fun mciDriverNotify(hwndcallback: Handle, wdeviceid: UInt, ustatus: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mciDriverNotify(hwndcallback?.value?.toCPointer<ByteVar>(), wdeviceid, ustatus)

public actual fun mciDriverYield(wdeviceid: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mciDriverYield(wdeviceid)

public actual fun mciFreeCommandResource(wtable: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mciFreeCommandResource(wtable)

public actual fun mciGetCreatorTask(mciid: UInt): Htask =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mciGetCreatorTask(mciid)?.let { COpaquePointer(it.toLong()) }

public actual fun mciGetDeviceIDA(pszdevice: Pcstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mciGetDeviceIDA(pszdevice?.value?.toCPointer<ByteVar>())

public actual fun mciGetDeviceIDFromElementIDA(dwelementid: UInt, lpstrtype: Pcstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mciGetDeviceIDFromElementIDA(dwelementid, lpstrtype?.value?.toCPointer<ByteVar>())

public actual fun mciGetDeviceIDFromElementIDW(dwelementid: UInt, lpstrtype: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mciGetDeviceIDFromElementIDW(dwelementid, lpstrtype?.value?.toCPointer<ByteVar>())

public actual fun mciGetDeviceIDW(pszdevice: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mciGetDeviceIDW(pszdevice?.value?.toCPointer<ByteVar>())

public actual fun mciGetDriverData(wdeviceid: UInt): ULong =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mciGetDriverData(wdeviceid)

public actual fun mciGetErrorStringA(mcierr: UInt, psztext: Pstr, cchtext: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mciGetErrorStringA(mcierr, psztext?.value?.toCPointer<ByteVar>(), cchtext)

public actual fun mciGetErrorStringW(mcierr: UInt, psztext: Pwstr, cchtext: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mciGetErrorStringW(mcierr, psztext?.value?.toCPointer<ByteVar>(), cchtext)

public actual fun mciGetYieldProc(mciid: UInt, pdwyielddata: COpaquePointer?): Yieldproc =
    null

public actual fun mciLoadCommandResource(hinstance: Handle, lpresname: Pcwstr, wtype: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mciLoadCommandResource(hinstance?.value?.toCPointer<ByteVar>(), lpresname?.value?.toCPointer<ByteVar>(), wtype)

public actual fun mciSendCommandA(mciid: UInt, umsg: UInt, dwparam1: ULong, dwparam2: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mciSendCommandA(mciid, umsg, dwparam1, dwparam2)

public actual fun mciSendCommandW(mciid: UInt, umsg: UInt, dwparam1: ULong, dwparam2: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mciSendCommandW(mciid, umsg, dwparam1, dwparam2)

public actual fun mciSendStringA(lpstrcommand: Pcstr, lpstrreturnstring: Pstr, ureturnlength: UInt, hwndcallback: Hwnd): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mciSendStringA(lpstrcommand?.value?.toCPointer<ByteVar>(), lpstrreturnstring?.value?.toCPointer<ByteVar>(), ureturnlength, hwndcallback?.value?.toCPointer<ByteVar>())

public actual fun mciSendStringW(lpstrcommand: Pcwstr, lpstrreturnstring: Pwstr, ureturnlength: UInt, hwndcallback: Hwnd): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mciSendStringW(lpstrcommand?.value?.toCPointer<ByteVar>(), lpstrreturnstring?.value?.toCPointer<ByteVar>(), ureturnlength, hwndcallback?.value?.toCPointer<ByteVar>())

public actual fun mciSetDriverData(wdeviceid: UInt, dwdata: ULong): Bool =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mciSetDriverData(wdeviceid, dwdata)

public actual fun mciSetYieldProc(mciid: UInt, fpyieldproc: Yieldproc, dwyielddata: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mciSetYieldProc(mciid, 0L.toCPointer<ByteVar>(), dwyielddata)

public actual fun mmDrvInstall(hdriver: Hdrvr, wszdrventry: Pcwstr, drvmessage: Drivermsgproc, wflags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mmDrvInstall(hdriver?.value?.toCPointer<ByteVar>(), wszdrventry?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), wflags)

public actual fun mmGetCurrentTask(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mmGetCurrentTask()

public actual fun mmTaskBlock(h: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mmTaskBlock(h)
}

public actual fun mmTaskCreate(lpfn: Lptaskcallback, lph: COpaquePointer?, dwinst: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mmTaskCreate(0L.toCPointer<ByteVar>(), lph?.value?.toCPointer<ByteVar>(), dwinst)

public actual fun mmTaskSignal(h: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mmTaskSignal(h)

public actual fun mmTaskYield() {
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mmTaskYield()
}

public actual fun mmioAdvance(hmmio: Hmmio, pmmioinfo: COpaquePointer?, fuadvance: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mmioAdvance(hmmio?.value?.toCPointer<ByteVar>(), pmmioinfo?.value?.toCPointer<ByteVar>(), fuadvance)

public actual fun mmioAscend(hmmio: Hmmio, pmmcki: COpaquePointer?, fuascend: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mmioAscend(hmmio?.value?.toCPointer<ByteVar>(), pmmcki?.value?.toCPointer<ByteVar>(), fuascend)

public actual fun mmioClose(hmmio: Hmmio, fuclose: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mmioClose(hmmio?.value?.toCPointer<ByteVar>(), fuclose)

public actual fun mmioCreateChunk(hmmio: Hmmio, pmmcki: COpaquePointer?, fucreate: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mmioCreateChunk(hmmio?.value?.toCPointer<ByteVar>(), pmmcki?.value?.toCPointer<ByteVar>(), fucreate)

public actual fun mmioDescend(hmmio: Hmmio, pmmcki: COpaquePointer?, pmmckiparent: COpaquePointer?, fudescend: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mmioDescend(hmmio?.value?.toCPointer<ByteVar>(), pmmcki?.value?.toCPointer<ByteVar>(), pmmckiparent?.value?.toCPointer<ByteVar>(), fudescend)

public actual fun mmioFlush(hmmio: Hmmio, fuflush: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mmioFlush(hmmio?.value?.toCPointer<ByteVar>(), fuflush)

public actual fun mmioGetInfo(hmmio: Hmmio, pmmioinfo: COpaquePointer?, fuinfo: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mmioGetInfo(hmmio?.value?.toCPointer<ByteVar>(), pmmioinfo?.value?.toCPointer<ByteVar>(), fuinfo)

public actual fun mmioInstallIOProcA(fccioproc: UInt, pioproc: Lpmmioproc, dwflags: UInt): Lpmmioproc =
    null

public actual fun mmioInstallIOProcW(fccioproc: UInt, pioproc: Lpmmioproc, dwflags: UInt): Lpmmioproc =
    null

public actual fun mmioOpenA(pszfilename: Pstr, pmmioinfo: COpaquePointer?, fdwopen: UInt): Hmmio =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mmioOpenA(pszfilename?.value?.toCPointer<ByteVar>(), pmmioinfo?.value?.toCPointer<ByteVar>(), fdwopen)?.let { COpaquePointer(it.toLong()) }

public actual fun mmioOpenW(pszfilename: Pwstr, pmmioinfo: COpaquePointer?, fdwopen: UInt): Hmmio =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mmioOpenW(pszfilename?.value?.toCPointer<ByteVar>(), pmmioinfo?.value?.toCPointer<ByteVar>(), fdwopen)?.let { COpaquePointer(it.toLong()) }

public actual fun mmioRead(hmmio: Hmmio, pch: COpaquePointer?, cch: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mmioRead(hmmio?.value?.toCPointer<ByteVar>(), pch?.value?.toCPointer<ByteVar>(), cch)

public actual fun mmioRenameA(pszfilename: Pcstr, psznewfilename: Pcstr, pmmioinfo: COpaquePointer?, fdwrename: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mmioRenameA(pszfilename?.value?.toCPointer<ByteVar>(), psznewfilename?.value?.toCPointer<ByteVar>(), pmmioinfo?.value?.toCPointer<ByteVar>(), fdwrename)

public actual fun mmioRenameW(pszfilename: Pcwstr, psznewfilename: Pcwstr, pmmioinfo: COpaquePointer?, fdwrename: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mmioRenameW(pszfilename?.value?.toCPointer<ByteVar>(), psznewfilename?.value?.toCPointer<ByteVar>(), pmmioinfo?.value?.toCPointer<ByteVar>(), fdwrename)

public actual fun mmioSeek(hmmio: Hmmio, loffset: Int, iorigin: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mmioSeek(hmmio?.value?.toCPointer<ByteVar>(), loffset, iorigin)

public actual fun mmioSendMessage(hmmio: Hmmio, umsg: UInt, lparam1: Lparam, lparam2: Lparam): Lresult =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mmioSendMessage(hmmio?.value?.toCPointer<ByteVar>(), umsg, lparam1, lparam2)

public actual fun mmioSetBuffer(hmmio: Hmmio, pchbuffer: Pstr, cchbuffer: Int, fubuffer: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mmioSetBuffer(hmmio?.value?.toCPointer<ByteVar>(), pchbuffer?.value?.toCPointer<ByteVar>(), cchbuffer, fubuffer)

public actual fun mmioSetInfo(hmmio: Hmmio, pmmioinfo: COpaquePointer?, fuinfo: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mmioSetInfo(hmmio?.value?.toCPointer<ByteVar>(), pmmioinfo?.value?.toCPointer<ByteVar>(), fuinfo)

public actual fun mmioStringToFOURCCA(sz: Pcstr, uflags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mmioStringToFOURCCA(sz?.value?.toCPointer<ByteVar>(), uflags)

public actual fun mmioStringToFOURCCW(sz: Pcwstr, uflags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mmioStringToFOURCCW(sz?.value?.toCPointer<ByteVar>(), uflags)

public actual fun mmioWrite(hmmio: Hmmio, pch: Pcstr, cch: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_mmioWrite(hmmio?.value?.toCPointer<ByteVar>(), pch?.value?.toCPointer<ByteVar>(), cch)

public actual fun sndOpenSound(eventname: Pcwstr, appname: Pcwstr, flags: Int, filehandle: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.media.multimedia.cinterop.windowssys_windows_win32_media_multimedia_sndOpenSound(eventname?.value?.toCPointer<ByteVar>(), appname?.value?.toCPointer<ByteVar>(), flags, filehandle?.value?.toCPointer<ByteVar>())
