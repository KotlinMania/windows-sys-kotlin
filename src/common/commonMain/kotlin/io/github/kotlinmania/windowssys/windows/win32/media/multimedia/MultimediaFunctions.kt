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

public expect fun AVIBuildFilterA(lpszfilter: PSTR, cbfilter: Int, fsaving: BOOL): HRESULT

public expect fun AVIBuildFilterW(lpszfilter: PWSTR, cbfilter: Int, fsaving: BOOL): HRESULT

public expect fun AVIClearClipboard(): HRESULT

public expect fun AVIFileAddRef(pfile: Long): UInt

public expect fun AVIFileCreateStreamA(pfile: Long, ppavi: Long, psi: Long): HRESULT

public expect fun AVIFileCreateStreamW(pfile: Long, ppavi: Long, psi: Long): HRESULT

public expect fun AVIFileEndRecord(pfile: Long): HRESULT

public expect fun AVIFileExit()

public expect fun AVIFileGetStream(pfile: Long, ppavi: Long, fcctype: UInt, lparam: Int): HRESULT

public expect fun AVIFileInfoA(pfile: Long, pfi: Long, lsize: Int): HRESULT

public expect fun AVIFileInfoW(pfile: Long, pfi: Long, lsize: Int): HRESULT

public expect fun AVIFileInit()

public expect fun AVIFileOpenA(ppfile: Long, szfile: PCSTR, umode: UInt, lphandler: Long): HRESULT

public expect fun AVIFileOpenW(ppfile: Long, szfile: PCWSTR, umode: UInt, lphandler: Long): HRESULT

public expect fun AVIFileReadData(pfile: Long, ckid: UInt, lpdata: Long, lpcbdata: Long): HRESULT

public expect fun AVIFileRelease(pfile: Long): UInt

public expect fun AVIFileWriteData(pfile: Long, ckid: UInt, lpdata: Long, cbdata: Int): HRESULT

public expect fun AVIGetFromClipboard(lppf: Long): HRESULT

public expect fun AVIMakeCompressedStream(ppscompressed: Long, ppssource: Long, lpoptions: Long, pclsidhandler: Long): HRESULT

public expect fun AVIMakeFileFromStreams(ppfile: Long, nstreams: Int, papstreams: Long): HRESULT

public expect fun AVIMakeStreamFromClipboard(cfformat: UInt, hglobal: HANDLE, ppstream: Long): HRESULT

public expect fun AVIPutFileOnClipboard(pf: Long): HRESULT

public expect fun AVISaveA(szfile: PCSTR, pclsidhandler: Long, lpfncallback: AVISAVECALLBACK, nstreams: Int, pfile: Long, lpoptions: Long, vararg variadicArgs: Long): HRESULT

public expect fun AVISaveOptions(hwnd: HWND, uiflags: UInt, nstreams: Int, ppavi: Long, plpoptions: Long): Long

public expect fun AVISaveOptionsFree(nstreams: Int, plpoptions: Long): HRESULT

public expect fun AVISaveVA(szfile: PCSTR, pclsidhandler: Long, lpfncallback: AVISAVECALLBACK, nstreams: Int, ppavi: Long, plpoptions: Long): HRESULT

public expect fun AVISaveVW(szfile: PCWSTR, pclsidhandler: Long, lpfncallback: AVISAVECALLBACK, nstreams: Int, ppavi: Long, plpoptions: Long): HRESULT

public expect fun AVISaveW(szfile: PCWSTR, pclsidhandler: Long, lpfncallback: AVISAVECALLBACK, nstreams: Int, pfile: Long, lpoptions: Long, vararg variadicArgs: Long): HRESULT

public expect fun AVIStreamAddRef(pavi: Long): UInt

public expect fun AVIStreamBeginStreaming(pavi: Long, lstart: Int, lend: Int, lrate: Int): HRESULT

public expect fun AVIStreamCreate(ppavi: Long, lparam1: Int, lparam2: Int, pclsidhandler: Long): HRESULT

public expect fun AVIStreamEndStreaming(pavi: Long): HRESULT

public expect fun AVIStreamFindSample(pavi: Long, lpos: Int, lflags: Int): Int

public expect fun AVIStreamGetFrame(pg: Long, lpos: Int): Long

public expect fun AVIStreamGetFrameClose(pg: Long): HRESULT

public expect fun AVIStreamGetFrameOpen(pavi: Long, lpbiwanted: Long): Long

public expect fun AVIStreamInfoA(pavi: Long, psi: Long, lsize: Int): HRESULT

public expect fun AVIStreamInfoW(pavi: Long, psi: Long, lsize: Int): HRESULT

public expect fun AVIStreamLength(pavi: Long): Int

public expect fun AVIStreamOpenFromFileA(ppavi: Long, szfile: PCSTR, fcctype: UInt, lparam: Int, mode: UInt, pclsidhandler: Long): HRESULT

public expect fun AVIStreamOpenFromFileW(ppavi: Long, szfile: PCWSTR, fcctype: UInt, lparam: Int, mode: UInt, pclsidhandler: Long): HRESULT

public expect fun AVIStreamRead(pavi: Long, lstart: Int, lsamples: Int, lpbuffer: Long, cbbuffer: Int, plbytes: Long, plsamples: Long): HRESULT

public expect fun AVIStreamReadData(pavi: Long, fcc: UInt, lp: Long, lpcb: Long): HRESULT

public expect fun AVIStreamReadFormat(pavi: Long, lpos: Int, lpformat: Long, lpcbformat: Long): HRESULT

public expect fun AVIStreamRelease(pavi: Long): UInt

public expect fun AVIStreamSampleToTime(pavi: Long, lsample: Int): Int

public expect fun AVIStreamSetFormat(pavi: Long, lpos: Int, lpformat: Long, cbformat: Int): HRESULT

public expect fun AVIStreamStart(pavi: Long): Int

public expect fun AVIStreamTimeToSample(pavi: Long, ltime: Int): Int

public expect fun AVIStreamWrite(pavi: Long, lstart: Int, lsamples: Int, lpbuffer: Long, cbbuffer: Int, dwflags: UInt, plsampwritten: Long, plbyteswritten: Long): HRESULT

public expect fun AVIStreamWriteData(pavi: Long, fcc: UInt, lp: Long, cb: Int): HRESULT

public expect fun CloseDriver(hdriver: HDRVR, lparam1: LPARAM, lparam2: LPARAM): LRESULT

public expect fun CreateEditableStream(ppseditable: Long, pssource: Long): HRESULT

public expect fun DefDriverProc(dwdriveridentifier: ULong, hdrvr: HDRVR, umsg: UInt, lparam1: LPARAM, lparam2: LPARAM): LRESULT

public expect fun DrawDibBegin(hdd: Long, hdc: HDC, dxdst: Int, dydst: Int, lpbi: Long, dxsrc: Int, dysrc: Int, wflags: UInt): BOOL

public expect fun DrawDibChangePalette(hdd: Long, istart: Int, ilen: Int, lppe: Long): BOOL

public expect fun DrawDibClose(hdd: Long): BOOL

public expect fun DrawDibDraw(hdd: Long, hdc: HDC, xdst: Int, ydst: Int, dxdst: Int, dydst: Int, lpbi: Long, lpbits: Long, xsrc: Int, ysrc: Int, dxsrc: Int, dysrc: Int, wflags: UInt): BOOL

public expect fun DrawDibEnd(hdd: Long): BOOL

public expect fun DrawDibGetBuffer(hdd: Long, lpbi: Long, dwsize: UInt, dwflags: UInt): Long

public expect fun DrawDibGetPalette(hdd: Long): HPALETTE

public expect fun DrawDibOpen(): Long

public expect fun DrawDibProfileDisplay(lpbi: Long): LRESULT

public expect fun DrawDibRealize(hdd: Long, hdc: HDC, fbackground: BOOL): UInt

public expect fun DrawDibSetPalette(hdd: Long, hpal: HPALETTE): BOOL

public expect fun DrawDibStart(hdd: Long, rate: UInt): BOOL

public expect fun DrawDibStop(hdd: Long): BOOL

public expect fun DrawDibTime(hdd: Long, lpddtime: Long): BOOL

public expect fun DriverCallback(dwcallback: ULong, dwflags: UInt, hdevice: HDRVR, dwmsg: UInt, dwuser: ULong, dwparam1: ULong, dwparam2: ULong): BOOL

public expect fun DrvGetModuleHandle(hdriver: HDRVR): HMODULE

public expect fun EditStreamClone(pavi: Long, ppresult: Long): HRESULT

public expect fun EditStreamCopy(pavi: Long, plstart: Long, pllength: Long, ppresult: Long): HRESULT

public expect fun EditStreamCut(pavi: Long, plstart: Long, pllength: Long, ppresult: Long): HRESULT

public expect fun EditStreamPaste(pavi: Long, plpos: Long, pllength: Long, pstream: Long, lstart: Int, lend: Int): HRESULT

public expect fun EditStreamSetInfoA(pavi: Long, lpinfo: Long, cbinfo: Int): HRESULT

public expect fun EditStreamSetInfoW(pavi: Long, lpinfo: Long, cbinfo: Int): HRESULT

public expect fun EditStreamSetNameA(pavi: Long, lpszname: PCSTR): HRESULT

public expect fun EditStreamSetNameW(pavi: Long, lpszname: PCWSTR): HRESULT

public expect fun GetDriverModuleHandle(hdriver: HDRVR): HMODULE

public expect fun GetOpenFileNamePreviewA(lpofn: Long): BOOL

public expect fun GetOpenFileNamePreviewW(lpofn: Long): BOOL

public expect fun GetSaveFileNamePreviewA(lpofn: Long): BOOL

public expect fun GetSaveFileNamePreviewW(lpofn: Long): BOOL

public expect fun ICClose(hic: HIC): LRESULT

public expect fun ICCompress(hic: HIC, dwflags: UInt, lpbioutput: Long, lpdata: Long, lpbiinput: Long, lpbits: Long, lpckid: Long, lpdwflags: Long, lframenum: Int, dwframesize: UInt, dwquality: UInt, lpbiprev: Long, lpprev: Long): UInt

public expect fun ICCompressorChoose(hwnd: HWND, uiflags: UInt, pvin: Long, lpdata: Long, pc: Long, lpsztitle: PCSTR): BOOL

public expect fun ICCompressorFree(pc: Long)

public expect fun ICDecompress(hic: HIC, dwflags: UInt, lpbiformat: Long, lpdata: Long, lpbi: Long, lpbits: Long): UInt

public expect fun ICDraw(hic: HIC, dwflags: UInt, lpformat: Long, lpdata: Long, cbdata: UInt, ltime: Int): UInt

public expect fun ICDrawBegin(hic: HIC, dwflags: UInt, hpal: HPALETTE, hwnd: HWND, hdc: HDC, xdst: Int, ydst: Int, dxdst: Int, dydst: Int, lpbi: Long, xsrc: Int, ysrc: Int, dxsrc: Int, dysrc: Int, dwrate: UInt, dwscale: UInt): UInt

public expect fun ICGetDisplayFormat(hic: HIC, lpbiin: Long, lpbiout: Long, bitdepth: Int, dx: Int, dy: Int): HIC

public expect fun ICGetInfo(hic: HIC, picinfo: Long, cb: UInt): LRESULT

public expect fun ICImageCompress(hic: HIC, uiflags: UInt, lpbiin: Long, lpbits: Long, lpbiout: Long, lquality: Int, plsize: Long): HANDLE

public expect fun ICImageDecompress(hic: HIC, uiflags: UInt, lpbiin: Long, lpbits: Long, lpbiout: Long): HANDLE

public expect fun ICInfo(fcctype: UInt, fcchandler: UInt, lpicinfo: Long): BOOL

public expect fun ICInstall(fcctype: UInt, fcchandler: UInt, lparam: LPARAM, szdesc: PCSTR, wflags: UInt): BOOL

public expect fun ICLocate(fcctype: UInt, fcchandler: UInt, lpbiin: Long, lpbiout: Long, wflags: UShort): HIC

public expect fun ICOpen(fcctype: UInt, fcchandler: UInt, wmode: UInt): HIC

public expect fun ICOpenFunction(fcctype: UInt, fcchandler: UInt, wmode: UInt, lpfnhandler: FARPROC): HIC

public expect fun ICRemove(fcctype: UInt, fcchandler: UInt, wflags: UInt): BOOL

public expect fun ICSendMessage(hic: HIC, msg: UInt, dw1: ULong, dw2: ULong): LRESULT

public expect fun ICSeqCompressFrame(pc: Long, uiflags: UInt, lpbits: Long, pfkey: Long, plsize: Long): Long

public expect fun ICSeqCompressFrameEnd(pc: Long)

public expect fun ICSeqCompressFrameStart(pc: Long, lpbiin: Long): BOOL

public expect fun MCIWndCreateA(hwndparent: HWND, hinstance: HINSTANCE, dwstyle: UInt, szfile: PCSTR): HWND

public expect fun MCIWndCreateW(hwndparent: HWND, hinstance: HINSTANCE, dwstyle: UInt, szfile: PCWSTR): HWND

public expect fun MCIWndRegisterClass(): BOOL

public expect fun OpenDriver(szdrivername: PCWSTR, szsectionname: PCWSTR, lparam2: LPARAM): HDRVR

public expect fun SendDriverMessage(hdriver: HDRVR, message: UInt, lparam1: LPARAM, lparam2: LPARAM): LRESULT

public expect fun VideoForWindowsVersion(): UInt

public expect fun capCreateCaptureWindowA(lpszwindowname: PCSTR, dwstyle: UInt, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: HWND, nid: Int): HWND

public expect fun capCreateCaptureWindowW(lpszwindowname: PCWSTR, dwstyle: UInt, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: HWND, nid: Int): HWND

public expect fun capGetDriverDescriptionA(wdriverindex: UInt, lpszname: PSTR, cbname: Int, lpszver: PSTR, cbver: Int): BOOL

public expect fun capGetDriverDescriptionW(wdriverindex: UInt, lpszname: PWSTR, cbname: Int, lpszver: PWSTR, cbver: Int): BOOL

public expect fun joyGetDevCapsA(ujoyid: ULong, pjc: Long, cbjc: UInt): UInt

public expect fun joyGetDevCapsW(ujoyid: ULong, pjc: Long, cbjc: UInt): UInt

public expect fun joyGetNumDevs(): UInt

public expect fun joyGetPos(ujoyid: UInt, pji: Long): UInt

public expect fun joyGetPosEx(ujoyid: UInt, pji: Long): UInt

public expect fun joyGetThreshold(ujoyid: UInt, puthreshold: Long): UInt

public expect fun joyReleaseCapture(ujoyid: UInt): UInt

public expect fun joySetCapture(hwnd: HWND, ujoyid: UInt, uperiod: UInt, fchanged: BOOL): UInt

public expect fun joySetThreshold(ujoyid: UInt, uthreshold: UInt): UInt

public expect fun mciDriverNotify(hwndcallback: HANDLE, wdeviceid: UInt, ustatus: UInt): BOOL

public expect fun mciDriverYield(wdeviceid: UInt): UInt

public expect fun mciFreeCommandResource(wtable: UInt): BOOL

public expect fun mciGetCreatorTask(mciid: UInt): HTASK

public expect fun mciGetDeviceIDA(pszdevice: PCSTR): UInt

public expect fun mciGetDeviceIDFromElementIDA(dwelementid: UInt, lpstrtype: PCSTR): UInt

public expect fun mciGetDeviceIDFromElementIDW(dwelementid: UInt, lpstrtype: PCWSTR): UInt

public expect fun mciGetDeviceIDW(pszdevice: PCWSTR): UInt

public expect fun mciGetDriverData(wdeviceid: UInt): ULong

public expect fun mciGetErrorStringA(mcierr: UInt, psztext: PSTR, cchtext: UInt): BOOL

public expect fun mciGetErrorStringW(mcierr: UInt, psztext: PWSTR, cchtext: UInt): BOOL

public expect fun mciGetYieldProc(mciid: UInt, pdwyielddata: Long): YIELDPROC

public expect fun mciLoadCommandResource(hinstance: HANDLE, lpresname: PCWSTR, wtype: UInt): UInt

public expect fun mciSendCommandA(mciid: UInt, umsg: UInt, dwparam1: ULong, dwparam2: ULong): UInt

public expect fun mciSendCommandW(mciid: UInt, umsg: UInt, dwparam1: ULong, dwparam2: ULong): UInt

public expect fun mciSendStringA(lpstrcommand: PCSTR, lpstrreturnstring: PSTR, ureturnlength: UInt, hwndcallback: HWND): UInt

public expect fun mciSendStringW(lpstrcommand: PCWSTR, lpstrreturnstring: PWSTR, ureturnlength: UInt, hwndcallback: HWND): UInt

public expect fun mciSetDriverData(wdeviceid: UInt, dwdata: ULong): BOOL

public expect fun mciSetYieldProc(mciid: UInt, fpyieldproc: YIELDPROC, dwyielddata: UInt): BOOL

public expect fun mmDrvInstall(hdriver: HDRVR, wszdrventry: PCWSTR, drvmessage: DRIVERMSGPROC, wflags: UInt): UInt

public expect fun mmGetCurrentTask(): UInt

public expect fun mmTaskBlock(h: UInt)

public expect fun mmTaskCreate(lpfn: LPTASKCALLBACK, lph: Long, dwinst: ULong): UInt

public expect fun mmTaskSignal(h: UInt): BOOL

public expect fun mmTaskYield()

public expect fun mmioAdvance(hmmio: HMMIO, pmmioinfo: Long, fuadvance: UInt): UInt

public expect fun mmioAscend(hmmio: HMMIO, pmmcki: Long, fuascend: UInt): UInt

public expect fun mmioClose(hmmio: HMMIO, fuclose: UInt): UInt

public expect fun mmioCreateChunk(hmmio: HMMIO, pmmcki: Long, fucreate: UInt): UInt

public expect fun mmioDescend(hmmio: HMMIO, pmmcki: Long, pmmckiparent: Long, fudescend: UInt): UInt

public expect fun mmioFlush(hmmio: HMMIO, fuflush: UInt): UInt

public expect fun mmioGetInfo(hmmio: HMMIO, pmmioinfo: Long, fuinfo: UInt): UInt

public expect fun mmioInstallIOProcA(fccioproc: UInt, pioproc: LPMMIOPROC, dwflags: UInt): LPMMIOPROC

public expect fun mmioInstallIOProcW(fccioproc: UInt, pioproc: LPMMIOPROC, dwflags: UInt): LPMMIOPROC

public expect fun mmioOpenA(pszfilename: PSTR, pmmioinfo: Long, fdwopen: UInt): HMMIO

public expect fun mmioOpenW(pszfilename: PWSTR, pmmioinfo: Long, fdwopen: UInt): HMMIO

public expect fun mmioRead(hmmio: HMMIO, pch: Long, cch: Int): Int

public expect fun mmioRenameA(pszfilename: PCSTR, psznewfilename: PCSTR, pmmioinfo: Long, fdwrename: UInt): UInt

public expect fun mmioRenameW(pszfilename: PCWSTR, psznewfilename: PCWSTR, pmmioinfo: Long, fdwrename: UInt): UInt

public expect fun mmioSeek(hmmio: HMMIO, loffset: Int, iorigin: Int): Int

public expect fun mmioSendMessage(hmmio: HMMIO, umsg: UInt, lparam1: LPARAM, lparam2: LPARAM): LRESULT

public expect fun mmioSetBuffer(hmmio: HMMIO, pchbuffer: PSTR, cchbuffer: Int, fubuffer: UInt): UInt

public expect fun mmioSetInfo(hmmio: HMMIO, pmmioinfo: Long, fuinfo: UInt): UInt

public expect fun mmioStringToFOURCCA(sz: PCSTR, uflags: UInt): UInt

public expect fun mmioStringToFOURCCW(sz: PCWSTR, uflags: UInt): UInt

public expect fun mmioWrite(hmmio: HMMIO, pch: PCSTR, cch: Int): Int

public expect fun sndOpenSound(eventname: PCWSTR, appname: PCWSTR, flags: Int, filehandle: Long): Int
