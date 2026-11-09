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

public actual fun AVIBuildFilterA(lpszfilter: PSTR, cbfilter: Int, fsaving: BOOL): HRESULT =
    0

public actual fun AVIBuildFilterW(lpszfilter: PWSTR, cbfilter: Int, fsaving: BOOL): HRESULT =
    0

public actual fun AVIClearClipboard(): HRESULT =
    0

public actual fun AVIFileAddRef(pfile: Long): UInt =
    0u

public actual fun AVIFileCreateStreamA(pfile: Long, ppavi: Long, psi: Long): HRESULT =
    0

public actual fun AVIFileCreateStreamW(pfile: Long, ppavi: Long, psi: Long): HRESULT =
    0

public actual fun AVIFileEndRecord(pfile: Long): HRESULT =
    0

public actual fun AVIFileExit() {
}

public actual fun AVIFileGetStream(pfile: Long, ppavi: Long, fcctype: UInt, lparam: Int): HRESULT =
    0

public actual fun AVIFileInfoA(pfile: Long, pfi: Long, lsize: Int): HRESULT =
    0

public actual fun AVIFileInfoW(pfile: Long, pfi: Long, lsize: Int): HRESULT =
    0

public actual fun AVIFileInit() {
}

public actual fun AVIFileOpenA(ppfile: Long, szfile: PCSTR, umode: UInt, lphandler: Long): HRESULT =
    0

public actual fun AVIFileOpenW(ppfile: Long, szfile: PCWSTR, umode: UInt, lphandler: Long): HRESULT =
    0

public actual fun AVIFileReadData(pfile: Long, ckid: UInt, lpdata: Long, lpcbdata: Long): HRESULT =
    0

public actual fun AVIFileRelease(pfile: Long): UInt =
    0u

public actual fun AVIFileWriteData(pfile: Long, ckid: UInt, lpdata: Long, cbdata: Int): HRESULT =
    0

public actual fun AVIGetFromClipboard(lppf: Long): HRESULT =
    0

public actual fun AVIMakeCompressedStream(ppscompressed: Long, ppssource: Long, lpoptions: Long, pclsidhandler: Long): HRESULT =
    0

public actual fun AVIMakeFileFromStreams(ppfile: Long, nstreams: Int, papstreams: Long): HRESULT =
    0

public actual fun AVIMakeStreamFromClipboard(cfformat: UInt, hglobal: HANDLE, ppstream: Long): HRESULT =
    0

public actual fun AVIPutFileOnClipboard(pf: Long): HRESULT =
    0

public actual fun AVISaveA(szfile: PCSTR, pclsidhandler: Long, lpfncallback: AVISAVECALLBACK, nstreams: Int, pfile: Long, lpoptions: Long): HRESULT =
    0

public actual fun AVISaveOptions(hwnd: HWND, uiflags: UInt, nstreams: Int, ppavi: Long, plpoptions: Long): Long =
    0L

public actual fun AVISaveOptionsFree(nstreams: Int, plpoptions: Long): HRESULT =
    0

public actual fun AVISaveVA(szfile: PCSTR, pclsidhandler: Long, lpfncallback: AVISAVECALLBACK, nstreams: Int, ppavi: Long, plpoptions: Long): HRESULT =
    0

public actual fun AVISaveVW(szfile: PCWSTR, pclsidhandler: Long, lpfncallback: AVISAVECALLBACK, nstreams: Int, ppavi: Long, plpoptions: Long): HRESULT =
    0

public actual fun AVISaveW(szfile: PCWSTR, pclsidhandler: Long, lpfncallback: AVISAVECALLBACK, nstreams: Int, pfile: Long, lpoptions: Long): HRESULT =
    0

public actual fun AVIStreamAddRef(pavi: Long): UInt =
    0u

public actual fun AVIStreamBeginStreaming(pavi: Long, lstart: Int, lend: Int, lrate: Int): HRESULT =
    0

public actual fun AVIStreamCreate(ppavi: Long, lparam1: Int, lparam2: Int, pclsidhandler: Long): HRESULT =
    0

public actual fun AVIStreamEndStreaming(pavi: Long): HRESULT =
    0

public actual fun AVIStreamFindSample(pavi: Long, lpos: Int, lflags: Int): Int =
    0

public actual fun AVIStreamGetFrame(pg: Long, lpos: Int): Long =
    0L

public actual fun AVIStreamGetFrameClose(pg: Long): HRESULT =
    0

public actual fun AVIStreamGetFrameOpen(pavi: Long, lpbiwanted: Long): Long =
    0L

public actual fun AVIStreamInfoA(pavi: Long, psi: Long, lsize: Int): HRESULT =
    0

public actual fun AVIStreamInfoW(pavi: Long, psi: Long, lsize: Int): HRESULT =
    0

public actual fun AVIStreamLength(pavi: Long): Int =
    0

public actual fun AVIStreamOpenFromFileA(ppavi: Long, szfile: PCSTR, fcctype: UInt, lparam: Int, mode: UInt, pclsidhandler: Long): HRESULT =
    0

public actual fun AVIStreamOpenFromFileW(ppavi: Long, szfile: PCWSTR, fcctype: UInt, lparam: Int, mode: UInt, pclsidhandler: Long): HRESULT =
    0

public actual fun AVIStreamRead(pavi: Long, lstart: Int, lsamples: Int, lpbuffer: Long, cbbuffer: Int, plbytes: Long, plsamples: Long): HRESULT =
    0

public actual fun AVIStreamReadData(pavi: Long, fcc: UInt, lp: Long, lpcb: Long): HRESULT =
    0

public actual fun AVIStreamReadFormat(pavi: Long, lpos: Int, lpformat: Long, lpcbformat: Long): HRESULT =
    0

public actual fun AVIStreamRelease(pavi: Long): UInt =
    0u

public actual fun AVIStreamSampleToTime(pavi: Long, lsample: Int): Int =
    0

public actual fun AVIStreamSetFormat(pavi: Long, lpos: Int, lpformat: Long, cbformat: Int): HRESULT =
    0

public actual fun AVIStreamStart(pavi: Long): Int =
    0

public actual fun AVIStreamTimeToSample(pavi: Long, ltime: Int): Int =
    0

public actual fun AVIStreamWrite(pavi: Long, lstart: Int, lsamples: Int, lpbuffer: Long, cbbuffer: Int, dwflags: UInt, plsampwritten: Long, plbyteswritten: Long): HRESULT =
    0

public actual fun AVIStreamWriteData(pavi: Long, fcc: UInt, lp: Long, cb: Int): HRESULT =
    0

public actual fun CloseDriver(hdriver: HDRVR, lparam1: LPARAM, lparam2: LPARAM): LRESULT =
    0L

public actual fun CreateEditableStream(ppseditable: Long, pssource: Long): HRESULT =
    0

public actual fun DefDriverProc(dwdriveridentifier: ULong, hdrvr: HDRVR, umsg: UInt, lparam1: LPARAM, lparam2: LPARAM): LRESULT =
    0L

public actual fun DrawDibBegin(hdd: Long, hdc: HDC, dxdst: Int, dydst: Int, lpbi: Long, dxsrc: Int, dysrc: Int, wflags: UInt): BOOL =
    0

public actual fun DrawDibChangePalette(hdd: Long, istart: Int, ilen: Int, lppe: Long): BOOL =
    0

public actual fun DrawDibClose(hdd: Long): BOOL =
    0

public actual fun DrawDibDraw(hdd: Long, hdc: HDC, xdst: Int, ydst: Int, dxdst: Int, dydst: Int, lpbi: Long, lpbits: Long, xsrc: Int, ysrc: Int, dxsrc: Int, dysrc: Int, wflags: UInt): BOOL =
    0

public actual fun DrawDibEnd(hdd: Long): BOOL =
    0

public actual fun DrawDibGetBuffer(hdd: Long, lpbi: Long, dwsize: UInt, dwflags: UInt): Long =
    0L

public actual fun DrawDibGetPalette(hdd: Long): HPALETTE =
    0L

public actual fun DrawDibOpen(): Long =
    0L

public actual fun DrawDibProfileDisplay(lpbi: Long): LRESULT =
    0L

public actual fun DrawDibRealize(hdd: Long, hdc: HDC, fbackground: BOOL): UInt =
    0u

public actual fun DrawDibSetPalette(hdd: Long, hpal: HPALETTE): BOOL =
    0

public actual fun DrawDibStart(hdd: Long, rate: UInt): BOOL =
    0

public actual fun DrawDibStop(hdd: Long): BOOL =
    0

public actual fun DrawDibTime(hdd: Long, lpddtime: Long): BOOL =
    0

public actual fun DriverCallback(dwcallback: ULong, dwflags: UInt, hdevice: HDRVR, dwmsg: UInt, dwuser: ULong, dwparam1: ULong, dwparam2: ULong): BOOL =
    0

public actual fun DrvGetModuleHandle(hdriver: HDRVR): HMODULE =
    0L

public actual fun EditStreamClone(pavi: Long, ppresult: Long): HRESULT =
    0

public actual fun EditStreamCopy(pavi: Long, plstart: Long, pllength: Long, ppresult: Long): HRESULT =
    0

public actual fun EditStreamCut(pavi: Long, plstart: Long, pllength: Long, ppresult: Long): HRESULT =
    0

public actual fun EditStreamPaste(pavi: Long, plpos: Long, pllength: Long, pstream: Long, lstart: Int, lend: Int): HRESULT =
    0

public actual fun EditStreamSetInfoA(pavi: Long, lpinfo: Long, cbinfo: Int): HRESULT =
    0

public actual fun EditStreamSetInfoW(pavi: Long, lpinfo: Long, cbinfo: Int): HRESULT =
    0

public actual fun EditStreamSetNameA(pavi: Long, lpszname: PCSTR): HRESULT =
    0

public actual fun EditStreamSetNameW(pavi: Long, lpszname: PCWSTR): HRESULT =
    0

public actual fun GetDriverModuleHandle(hdriver: HDRVR): HMODULE =
    0L

public actual fun GetOpenFileNamePreviewA(lpofn: Long): BOOL =
    0

public actual fun GetOpenFileNamePreviewW(lpofn: Long): BOOL =
    0

public actual fun GetSaveFileNamePreviewA(lpofn: Long): BOOL =
    0

public actual fun GetSaveFileNamePreviewW(lpofn: Long): BOOL =
    0

public actual fun ICClose(hic: HIC): LRESULT =
    0L

public actual fun ICCompress(hic: HIC, dwflags: UInt, lpbioutput: Long, lpdata: Long, lpbiinput: Long, lpbits: Long, lpckid: Long, lpdwflags: Long, lframenum: Int, dwframesize: UInt, dwquality: UInt, lpbiprev: Long, lpprev: Long): UInt =
    0u

public actual fun ICCompressorChoose(hwnd: HWND, uiflags: UInt, pvin: Long, lpdata: Long, pc: Long, lpsztitle: PCSTR): BOOL =
    0

public actual fun ICCompressorFree(pc: Long) {
}

public actual fun ICDecompress(hic: HIC, dwflags: UInt, lpbiformat: Long, lpdata: Long, lpbi: Long, lpbits: Long): UInt =
    0u

public actual fun ICDraw(hic: HIC, dwflags: UInt, lpformat: Long, lpdata: Long, cbdata: UInt, ltime: Int): UInt =
    0u

public actual fun ICDrawBegin(hic: HIC, dwflags: UInt, hpal: HPALETTE, hwnd: HWND, hdc: HDC, xdst: Int, ydst: Int, dxdst: Int, dydst: Int, lpbi: Long, xsrc: Int, ysrc: Int, dxsrc: Int, dysrc: Int, dwrate: UInt, dwscale: UInt): UInt =
    0u

public actual fun ICGetDisplayFormat(hic: HIC, lpbiin: Long, lpbiout: Long, bitdepth: Int, dx: Int, dy: Int): HIC =
    0L

public actual fun ICGetInfo(hic: HIC, picinfo: Long, cb: UInt): LRESULT =
    0L

public actual fun ICImageCompress(hic: HIC, uiflags: UInt, lpbiin: Long, lpbits: Long, lpbiout: Long, lquality: Int, plsize: Long): HANDLE =
    0L

public actual fun ICImageDecompress(hic: HIC, uiflags: UInt, lpbiin: Long, lpbits: Long, lpbiout: Long): HANDLE =
    0L

public actual fun ICInfo(fcctype: UInt, fcchandler: UInt, lpicinfo: Long): BOOL =
    0

public actual fun ICInstall(fcctype: UInt, fcchandler: UInt, lparam: LPARAM, szdesc: PCSTR, wflags: UInt): BOOL =
    0

public actual fun ICLocate(fcctype: UInt, fcchandler: UInt, lpbiin: Long, lpbiout: Long, wflags: UShort): HIC =
    0L

public actual fun ICOpen(fcctype: UInt, fcchandler: UInt, wmode: UInt): HIC =
    0L

public actual fun ICOpenFunction(fcctype: UInt, fcchandler: UInt, wmode: UInt, lpfnhandler: FARPROC): HIC =
    0L

public actual fun ICRemove(fcctype: UInt, fcchandler: UInt, wflags: UInt): BOOL =
    0

public actual fun ICSendMessage(hic: HIC, msg: UInt, dw1: ULong, dw2: ULong): LRESULT =
    0L

public actual fun ICSeqCompressFrame(pc: Long, uiflags: UInt, lpbits: Long, pfkey: Long, plsize: Long): Long =
    0L

public actual fun ICSeqCompressFrameEnd(pc: Long) {
}

public actual fun ICSeqCompressFrameStart(pc: Long, lpbiin: Long): BOOL =
    0

public actual fun MCIWndCreateA(hwndparent: HWND, hinstance: HINSTANCE, dwstyle: UInt, szfile: PCSTR): HWND =
    0L

public actual fun MCIWndCreateW(hwndparent: HWND, hinstance: HINSTANCE, dwstyle: UInt, szfile: PCWSTR): HWND =
    0L

public actual fun MCIWndRegisterClass(): BOOL =
    0

public actual fun OpenDriver(szdrivername: PCWSTR, szsectionname: PCWSTR, lparam2: LPARAM): HDRVR =
    0L

public actual fun SendDriverMessage(hdriver: HDRVR, message: UInt, lparam1: LPARAM, lparam2: LPARAM): LRESULT =
    0L

public actual fun VideoForWindowsVersion(): UInt =
    0u

public actual fun capCreateCaptureWindowA(lpszwindowname: PCSTR, dwstyle: UInt, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: HWND, nid: Int): HWND =
    0L

public actual fun capCreateCaptureWindowW(lpszwindowname: PCWSTR, dwstyle: UInt, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: HWND, nid: Int): HWND =
    0L

public actual fun capGetDriverDescriptionA(wdriverindex: UInt, lpszname: PSTR, cbname: Int, lpszver: PSTR, cbver: Int): BOOL =
    0

public actual fun capGetDriverDescriptionW(wdriverindex: UInt, lpszname: PWSTR, cbname: Int, lpszver: PWSTR, cbver: Int): BOOL =
    0

public actual fun joyGetDevCapsA(ujoyid: ULong, pjc: Long, cbjc: UInt): UInt =
    0u

public actual fun joyGetDevCapsW(ujoyid: ULong, pjc: Long, cbjc: UInt): UInt =
    0u

public actual fun joyGetNumDevs(): UInt =
    0u

public actual fun joyGetPos(ujoyid: UInt, pji: Long): UInt =
    0u

public actual fun joyGetPosEx(ujoyid: UInt, pji: Long): UInt =
    0u

public actual fun joyGetThreshold(ujoyid: UInt, puthreshold: Long): UInt =
    0u

public actual fun joyReleaseCapture(ujoyid: UInt): UInt =
    0u

public actual fun joySetCapture(hwnd: HWND, ujoyid: UInt, uperiod: UInt, fchanged: BOOL): UInt =
    0u

public actual fun joySetThreshold(ujoyid: UInt, uthreshold: UInt): UInt =
    0u

public actual fun mciDriverNotify(hwndcallback: HANDLE, wdeviceid: UInt, ustatus: UInt): BOOL =
    0

public actual fun mciDriverYield(wdeviceid: UInt): UInt =
    0u

public actual fun mciFreeCommandResource(wtable: UInt): BOOL =
    0

public actual fun mciGetCreatorTask(mciid: UInt): HTASK =
    0L

public actual fun mciGetDeviceIDA(pszdevice: PCSTR): UInt =
    0u

public actual fun mciGetDeviceIDFromElementIDA(dwelementid: UInt, lpstrtype: PCSTR): UInt =
    0u

public actual fun mciGetDeviceIDFromElementIDW(dwelementid: UInt, lpstrtype: PCWSTR): UInt =
    0u

public actual fun mciGetDeviceIDW(pszdevice: PCWSTR): UInt =
    0u

public actual fun mciGetDriverData(wdeviceid: UInt): ULong =
    0uL

public actual fun mciGetErrorStringA(mcierr: UInt, psztext: PSTR, cchtext: UInt): BOOL =
    0

public actual fun mciGetErrorStringW(mcierr: UInt, psztext: PWSTR, cchtext: UInt): BOOL =
    0

public actual fun mciGetYieldProc(mciid: UInt, pdwyielddata: Long): YIELDPROC =
    null

public actual fun mciLoadCommandResource(hinstance: HANDLE, lpresname: PCWSTR, wtype: UInt): UInt =
    0u

public actual fun mciSendCommandA(mciid: UInt, umsg: UInt, dwparam1: ULong, dwparam2: ULong): UInt =
    0u

public actual fun mciSendCommandW(mciid: UInt, umsg: UInt, dwparam1: ULong, dwparam2: ULong): UInt =
    0u

public actual fun mciSendStringA(lpstrcommand: PCSTR, lpstrreturnstring: PSTR, ureturnlength: UInt, hwndcallback: HWND): UInt =
    0u

public actual fun mciSendStringW(lpstrcommand: PCWSTR, lpstrreturnstring: PWSTR, ureturnlength: UInt, hwndcallback: HWND): UInt =
    0u

public actual fun mciSetDriverData(wdeviceid: UInt, dwdata: ULong): BOOL =
    0

public actual fun mciSetYieldProc(mciid: UInt, fpyieldproc: YIELDPROC, dwyielddata: UInt): BOOL =
    0

public actual fun mmDrvInstall(hdriver: HDRVR, wszdrventry: PCWSTR, drvmessage: DRIVERMSGPROC, wflags: UInt): UInt =
    0u

public actual fun mmGetCurrentTask(): UInt =
    0u

public actual fun mmTaskBlock(h: UInt) {
}

public actual fun mmTaskCreate(lpfn: LPTASKCALLBACK, lph: Long, dwinst: ULong): UInt =
    0u

public actual fun mmTaskSignal(h: UInt): BOOL =
    0

public actual fun mmTaskYield() {
}

public actual fun mmioAdvance(hmmio: HMMIO, pmmioinfo: Long, fuadvance: UInt): UInt =
    0u

public actual fun mmioAscend(hmmio: HMMIO, pmmcki: Long, fuascend: UInt): UInt =
    0u

public actual fun mmioClose(hmmio: HMMIO, fuclose: UInt): UInt =
    0u

public actual fun mmioCreateChunk(hmmio: HMMIO, pmmcki: Long, fucreate: UInt): UInt =
    0u

public actual fun mmioDescend(hmmio: HMMIO, pmmcki: Long, pmmckiparent: Long, fudescend: UInt): UInt =
    0u

public actual fun mmioFlush(hmmio: HMMIO, fuflush: UInt): UInt =
    0u

public actual fun mmioGetInfo(hmmio: HMMIO, pmmioinfo: Long, fuinfo: UInt): UInt =
    0u

public actual fun mmioInstallIOProcA(fccioproc: UInt, pioproc: LPMMIOPROC, dwflags: UInt): LPMMIOPROC =
    null

public actual fun mmioInstallIOProcW(fccioproc: UInt, pioproc: LPMMIOPROC, dwflags: UInt): LPMMIOPROC =
    null

public actual fun mmioOpenA(pszfilename: PSTR, pmmioinfo: Long, fdwopen: UInt): HMMIO =
    0L

public actual fun mmioOpenW(pszfilename: PWSTR, pmmioinfo: Long, fdwopen: UInt): HMMIO =
    0L

public actual fun mmioRead(hmmio: HMMIO, pch: Long, cch: Int): Int =
    0

public actual fun mmioRenameA(pszfilename: PCSTR, psznewfilename: PCSTR, pmmioinfo: Long, fdwrename: UInt): UInt =
    0u

public actual fun mmioRenameW(pszfilename: PCWSTR, psznewfilename: PCWSTR, pmmioinfo: Long, fdwrename: UInt): UInt =
    0u

public actual fun mmioSeek(hmmio: HMMIO, loffset: Int, iorigin: Int): Int =
    0

public actual fun mmioSendMessage(hmmio: HMMIO, umsg: UInt, lparam1: LPARAM, lparam2: LPARAM): LRESULT =
    0L

public actual fun mmioSetBuffer(hmmio: HMMIO, pchbuffer: PSTR, cchbuffer: Int, fubuffer: UInt): UInt =
    0u

public actual fun mmioSetInfo(hmmio: HMMIO, pmmioinfo: Long, fuinfo: UInt): UInt =
    0u

public actual fun mmioStringToFOURCCA(sz: PCSTR, uflags: UInt): UInt =
    0u

public actual fun mmioStringToFOURCCW(sz: PCWSTR, uflags: UInt): UInt =
    0u

public actual fun mmioWrite(hmmio: HMMIO, pch: PCSTR, cch: Int): Int =
    0

public actual fun sndOpenSound(eventname: PCWSTR, appname: PCWSTR, flags: Int, filehandle: Long): Int =
    0
