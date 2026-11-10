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

public expect fun aVIBuildFilterA(lpszfilter: Pstr, cbfilter: Int, fsaving: Bool): Hresult

public expect fun aVIBuildFilterW(lpszfilter: Pwstr, cbfilter: Int, fsaving: Bool): Hresult

public expect fun aVIClearClipboard(): Hresult

public expect fun aVIFileAddRef(pfile: COpaquePointer?): UInt

public expect fun aVIFileCreateStreamA(pfile: COpaquePointer?, ppavi: COpaquePointer?, psi: COpaquePointer?): Hresult

public expect fun aVIFileCreateStreamW(pfile: COpaquePointer?, ppavi: COpaquePointer?, psi: COpaquePointer?): Hresult

public expect fun aVIFileEndRecord(pfile: COpaquePointer?): Hresult

public expect fun aVIFileExit()

public expect fun aVIFileGetStream(pfile: COpaquePointer?, ppavi: COpaquePointer?, fcctype: UInt, lparam: Int): Hresult

public expect fun aVIFileInfoA(pfile: COpaquePointer?, pfi: COpaquePointer?, lsize: Int): Hresult

public expect fun aVIFileInfoW(pfile: COpaquePointer?, pfi: COpaquePointer?, lsize: Int): Hresult

public expect fun aVIFileInit()

public expect fun aVIFileOpenA(ppfile: COpaquePointer?, szfile: Pcstr, umode: UInt, lphandler: COpaquePointer?): Hresult

public expect fun aVIFileOpenW(ppfile: COpaquePointer?, szfile: Pcwstr, umode: UInt, lphandler: COpaquePointer?): Hresult

public expect fun aVIFileReadData(pfile: COpaquePointer?, ckid: UInt, lpdata: COpaquePointer?, lpcbdata: COpaquePointer?): Hresult

public expect fun aVIFileRelease(pfile: COpaquePointer?): UInt

public expect fun aVIFileWriteData(pfile: COpaquePointer?, ckid: UInt, lpdata: COpaquePointer?, cbdata: Int): Hresult

public expect fun aVIGetFromClipboard(lppf: COpaquePointer?): Hresult

public expect fun aVIMakeCompressedStream(ppscompressed: COpaquePointer?, ppssource: COpaquePointer?, lpoptions: COpaquePointer?, pclsidhandler: COpaquePointer?): Hresult

public expect fun aVIMakeFileFromStreams(ppfile: COpaquePointer?, nstreams: Int, papstreams: COpaquePointer?): Hresult

public expect fun aVIMakeStreamFromClipboard(cfformat: UInt, hglobal: Handle, ppstream: COpaquePointer?): Hresult

public expect fun aVIPutFileOnClipboard(pf: COpaquePointer?): Hresult

public expect fun aVISaveA(szfile: Pcstr, pclsidhandler: COpaquePointer?, lpfncallback: Avisavecallback, nstreams: Int, pfile: COpaquePointer?, lpoptions: COpaquePointer?, vararg variadicArgs: Long): Hresult

public expect fun aVISaveOptions(hwnd: Hwnd, uiflags: UInt, nstreams: Int, ppavi: COpaquePointer?, plpoptions: COpaquePointer?): Long

public expect fun aVISaveOptionsFree(nstreams: Int, plpoptions: COpaquePointer?): Hresult

public expect fun aVISaveVA(szfile: Pcstr, pclsidhandler: COpaquePointer?, lpfncallback: Avisavecallback, nstreams: Int, ppavi: COpaquePointer?, plpoptions: COpaquePointer?): Hresult

public expect fun aVISaveVW(szfile: Pcwstr, pclsidhandler: COpaquePointer?, lpfncallback: Avisavecallback, nstreams: Int, ppavi: COpaquePointer?, plpoptions: COpaquePointer?): Hresult

public expect fun aVISaveW(szfile: Pcwstr, pclsidhandler: COpaquePointer?, lpfncallback: Avisavecallback, nstreams: Int, pfile: COpaquePointer?, lpoptions: COpaquePointer?, vararg variadicArgs: Long): Hresult

public expect fun aVIStreamAddRef(pavi: COpaquePointer?): UInt

public expect fun aVIStreamBeginStreaming(pavi: COpaquePointer?, lstart: Int, lend: Int, lrate: Int): Hresult

public expect fun aVIStreamCreate(ppavi: COpaquePointer?, lparam1: Int, lparam2: Int, pclsidhandler: COpaquePointer?): Hresult

public expect fun aVIStreamEndStreaming(pavi: COpaquePointer?): Hresult

public expect fun aVIStreamFindSample(pavi: COpaquePointer?, lpos: Int, lflags: Int): Int

public expect fun aVIStreamGetFrame(pg: COpaquePointer?, lpos: Int): COpaquePointer?

public expect fun aVIStreamGetFrameClose(pg: COpaquePointer?): Hresult

public expect fun aVIStreamGetFrameOpen(pavi: COpaquePointer?, lpbiwanted: COpaquePointer?): COpaquePointer?

public expect fun aVIStreamInfoA(pavi: COpaquePointer?, psi: COpaquePointer?, lsize: Int): Hresult

public expect fun aVIStreamInfoW(pavi: COpaquePointer?, psi: COpaquePointer?, lsize: Int): Hresult

public expect fun aVIStreamLength(pavi: COpaquePointer?): Int

public expect fun aVIStreamOpenFromFileA(ppavi: COpaquePointer?, szfile: Pcstr, fcctype: UInt, lparam: Int, mode: UInt, pclsidhandler: COpaquePointer?): Hresult

public expect fun aVIStreamOpenFromFileW(ppavi: COpaquePointer?, szfile: Pcwstr, fcctype: UInt, lparam: Int, mode: UInt, pclsidhandler: COpaquePointer?): Hresult

public expect fun aVIStreamRead(pavi: COpaquePointer?, lstart: Int, lsamples: Int, lpbuffer: COpaquePointer?, cbbuffer: Int, plbytes: COpaquePointer?, plsamples: COpaquePointer?): Hresult

public expect fun aVIStreamReadData(pavi: COpaquePointer?, fcc: UInt, lp: COpaquePointer?, lpcb: COpaquePointer?): Hresult

public expect fun aVIStreamReadFormat(pavi: COpaquePointer?, lpos: Int, lpformat: COpaquePointer?, lpcbformat: COpaquePointer?): Hresult

public expect fun aVIStreamRelease(pavi: COpaquePointer?): UInt

public expect fun aVIStreamSampleToTime(pavi: COpaquePointer?, lsample: Int): Int

public expect fun aVIStreamSetFormat(pavi: COpaquePointer?, lpos: Int, lpformat: COpaquePointer?, cbformat: Int): Hresult

public expect fun aVIStreamStart(pavi: COpaquePointer?): Int

public expect fun aVIStreamTimeToSample(pavi: COpaquePointer?, ltime: Int): Int

public expect fun aVIStreamWrite(pavi: COpaquePointer?, lstart: Int, lsamples: Int, lpbuffer: COpaquePointer?, cbbuffer: Int, dwflags: UInt, plsampwritten: COpaquePointer?, plbyteswritten: COpaquePointer?): Hresult

public expect fun aVIStreamWriteData(pavi: COpaquePointer?, fcc: UInt, lp: COpaquePointer?, cb: Int): Hresult

public expect fun closeDriver(hdriver: Hdrvr, lparam1: Lparam, lparam2: Lparam): Lresult

public expect fun createEditableStream(ppseditable: COpaquePointer?, pssource: COpaquePointer?): Hresult

public expect fun defDriverProc(dwdriveridentifier: ULong, hdrvr: Hdrvr, umsg: UInt, lparam1: Lparam, lparam2: Lparam): Lresult

public expect fun drawDibBegin(hdd: Long, hdc: Hdc, dxdst: Int, dydst: Int, lpbi: COpaquePointer?, dxsrc: Int, dysrc: Int, wflags: UInt): Bool

public expect fun drawDibChangePalette(hdd: Long, istart: Int, ilen: Int, lppe: COpaquePointer?): Bool

public expect fun drawDibClose(hdd: Long): Bool

public expect fun drawDibDraw(hdd: Long, hdc: Hdc, xdst: Int, ydst: Int, dxdst: Int, dydst: Int, lpbi: COpaquePointer?, lpbits: COpaquePointer?, xsrc: Int, ysrc: Int, dxsrc: Int, dysrc: Int, wflags: UInt): Bool

public expect fun drawDibEnd(hdd: Long): Bool

public expect fun drawDibGetBuffer(hdd: Long, lpbi: COpaquePointer?, dwsize: UInt, dwflags: UInt): COpaquePointer?

public expect fun drawDibGetPalette(hdd: Long): Hpalette

public expect fun drawDibOpen(): Long

public expect fun drawDibProfileDisplay(lpbi: COpaquePointer?): Lresult

public expect fun drawDibRealize(hdd: Long, hdc: Hdc, fbackground: Bool): UInt

public expect fun drawDibSetPalette(hdd: Long, hpal: Hpalette): Bool

public expect fun drawDibStart(hdd: Long, rate: UInt): Bool

public expect fun drawDibStop(hdd: Long): Bool

public expect fun drawDibTime(hdd: Long, lpddtime: COpaquePointer?): Bool

public expect fun driverCallback(dwcallback: ULong, dwflags: UInt, hdevice: Hdrvr, dwmsg: UInt, dwuser: ULong, dwparam1: ULong, dwparam2: ULong): Bool

public expect fun drvGetModuleHandle(hdriver: Hdrvr): Hmodule

public expect fun editStreamClone(pavi: COpaquePointer?, ppresult: COpaquePointer?): Hresult

public expect fun editStreamCopy(pavi: COpaquePointer?, plstart: COpaquePointer?, pllength: COpaquePointer?, ppresult: COpaquePointer?): Hresult

public expect fun editStreamCut(pavi: COpaquePointer?, plstart: COpaquePointer?, pllength: COpaquePointer?, ppresult: COpaquePointer?): Hresult

public expect fun editStreamPaste(pavi: COpaquePointer?, plpos: COpaquePointer?, pllength: COpaquePointer?, pstream: COpaquePointer?, lstart: Int, lend: Int): Hresult

public expect fun editStreamSetInfoA(pavi: COpaquePointer?, lpinfo: COpaquePointer?, cbinfo: Int): Hresult

public expect fun editStreamSetInfoW(pavi: COpaquePointer?, lpinfo: COpaquePointer?, cbinfo: Int): Hresult

public expect fun editStreamSetNameA(pavi: COpaquePointer?, lpszname: Pcstr): Hresult

public expect fun editStreamSetNameW(pavi: COpaquePointer?, lpszname: Pcwstr): Hresult

public expect fun getDriverModuleHandle(hdriver: Hdrvr): Hmodule

public expect fun getOpenFileNamePreviewA(lpofn: COpaquePointer?): Bool

public expect fun getOpenFileNamePreviewW(lpofn: COpaquePointer?): Bool

public expect fun getSaveFileNamePreviewA(lpofn: COpaquePointer?): Bool

public expect fun getSaveFileNamePreviewW(lpofn: COpaquePointer?): Bool

public expect fun iCClose(hic: Hic): Lresult

public expect fun iCCompress(hic: Hic, dwflags: UInt, lpbioutput: COpaquePointer?, lpdata: COpaquePointer?, lpbiinput: COpaquePointer?, lpbits: COpaquePointer?, lpckid: COpaquePointer?, lpdwflags: COpaquePointer?, lframenum: Int, dwframesize: UInt, dwquality: UInt, lpbiprev: COpaquePointer?, lpprev: COpaquePointer?): UInt

public expect fun iCCompressorChoose(hwnd: Hwnd, uiflags: UInt, pvin: COpaquePointer?, lpdata: COpaquePointer?, pc: COpaquePointer?, lpsztitle: Pcstr): Bool

public expect fun iCCompressorFree(pc: COpaquePointer?)

public expect fun iCDecompress(hic: Hic, dwflags: UInt, lpbiformat: COpaquePointer?, lpdata: COpaquePointer?, lpbi: COpaquePointer?, lpbits: COpaquePointer?): UInt

public expect fun iCDraw(hic: Hic, dwflags: UInt, lpformat: COpaquePointer?, lpdata: COpaquePointer?, cbdata: UInt, ltime: Int): UInt

public expect fun iCDrawBegin(hic: Hic, dwflags: UInt, hpal: Hpalette, hwnd: Hwnd, hdc: Hdc, xdst: Int, ydst: Int, dxdst: Int, dydst: Int, lpbi: COpaquePointer?, xsrc: Int, ysrc: Int, dxsrc: Int, dysrc: Int, dwrate: UInt, dwscale: UInt): UInt

public expect fun iCGetDisplayFormat(hic: Hic, lpbiin: COpaquePointer?, lpbiout: COpaquePointer?, bitdepth: Int, dx: Int, dy: Int): Hic

public expect fun iCGetInfo(hic: Hic, picinfo: COpaquePointer?, cb: UInt): Lresult

public expect fun iCImageCompress(hic: Hic, uiflags: UInt, lpbiin: COpaquePointer?, lpbits: COpaquePointer?, lpbiout: COpaquePointer?, lquality: Int, plsize: COpaquePointer?): Handle

public expect fun iCImageDecompress(hic: Hic, uiflags: UInt, lpbiin: COpaquePointer?, lpbits: COpaquePointer?, lpbiout: COpaquePointer?): Handle

public expect fun iCInfo(fcctype: UInt, fcchandler: UInt, lpicinfo: COpaquePointer?): Bool

public expect fun iCInstall(fcctype: UInt, fcchandler: UInt, lparam: Lparam, szdesc: Pcstr, wflags: UInt): Bool

public expect fun iCLocate(fcctype: UInt, fcchandler: UInt, lpbiin: COpaquePointer?, lpbiout: COpaquePointer?, wflags: UShort): Hic

public expect fun iCOpen(fcctype: UInt, fcchandler: UInt, wmode: UInt): Hic

public expect fun iCOpenFunction(fcctype: UInt, fcchandler: UInt, wmode: UInt, lpfnhandler: Farproc): Hic

public expect fun iCRemove(fcctype: UInt, fcchandler: UInt, wflags: UInt): Bool

public expect fun iCSendMessage(hic: Hic, msg: UInt, dw1: ULong, dw2: ULong): Lresult

public expect fun iCSeqCompressFrame(pc: COpaquePointer?, uiflags: UInt, lpbits: COpaquePointer?, pfkey: COpaquePointer?, plsize: COpaquePointer?): COpaquePointer?

public expect fun iCSeqCompressFrameEnd(pc: COpaquePointer?)

public expect fun iCSeqCompressFrameStart(pc: COpaquePointer?, lpbiin: COpaquePointer?): Bool

public expect fun mCIWndCreateA(hwndparent: Hwnd, hinstance: Hinstance, dwstyle: UInt, szfile: Pcstr): Hwnd

public expect fun mCIWndCreateW(hwndparent: Hwnd, hinstance: Hinstance, dwstyle: UInt, szfile: Pcwstr): Hwnd

public expect fun mCIWndRegisterClass(): Bool

public expect fun openDriver(szdrivername: Pcwstr, szsectionname: Pcwstr, lparam2: Lparam): Hdrvr

public expect fun sendDriverMessage(hdriver: Hdrvr, message: UInt, lparam1: Lparam, lparam2: Lparam): Lresult

public expect fun videoForWindowsVersion(): UInt

public expect fun capCreateCaptureWindowA(lpszwindowname: Pcstr, dwstyle: UInt, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: Hwnd, nid: Int): Hwnd

public expect fun capCreateCaptureWindowW(lpszwindowname: Pcwstr, dwstyle: UInt, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: Hwnd, nid: Int): Hwnd

public expect fun capGetDriverDescriptionA(wdriverindex: UInt, lpszname: Pstr, cbname: Int, lpszver: Pstr, cbver: Int): Bool

public expect fun capGetDriverDescriptionW(wdriverindex: UInt, lpszname: Pwstr, cbname: Int, lpszver: Pwstr, cbver: Int): Bool

public expect fun joyGetDevCapsA(ujoyid: ULong, pjc: COpaquePointer?, cbjc: UInt): UInt

public expect fun joyGetDevCapsW(ujoyid: ULong, pjc: COpaquePointer?, cbjc: UInt): UInt

public expect fun joyGetNumDevs(): UInt

public expect fun joyGetPos(ujoyid: UInt, pji: COpaquePointer?): UInt

public expect fun joyGetPosEx(ujoyid: UInt, pji: COpaquePointer?): UInt

public expect fun joyGetThreshold(ujoyid: UInt, puthreshold: COpaquePointer?): UInt

public expect fun joyReleaseCapture(ujoyid: UInt): UInt

public expect fun joySetCapture(hwnd: Hwnd, ujoyid: UInt, uperiod: UInt, fchanged: Bool): UInt

public expect fun joySetThreshold(ujoyid: UInt, uthreshold: UInt): UInt

public expect fun mciDriverNotify(hwndcallback: Handle, wdeviceid: UInt, ustatus: UInt): Bool

public expect fun mciDriverYield(wdeviceid: UInt): UInt

public expect fun mciFreeCommandResource(wtable: UInt): Bool

public expect fun mciGetCreatorTask(mciid: UInt): Htask

public expect fun mciGetDeviceIDA(pszdevice: Pcstr): UInt

public expect fun mciGetDeviceIDFromElementIDA(dwelementid: UInt, lpstrtype: Pcstr): UInt

public expect fun mciGetDeviceIDFromElementIDW(dwelementid: UInt, lpstrtype: Pcwstr): UInt

public expect fun mciGetDeviceIDW(pszdevice: Pcwstr): UInt

public expect fun mciGetDriverData(wdeviceid: UInt): ULong

public expect fun mciGetErrorStringA(mcierr: UInt, psztext: Pstr, cchtext: UInt): Bool

public expect fun mciGetErrorStringW(mcierr: UInt, psztext: Pwstr, cchtext: UInt): Bool

public expect fun mciGetYieldProc(mciid: UInt, pdwyielddata: COpaquePointer?): Yieldproc

public expect fun mciLoadCommandResource(hinstance: Handle, lpresname: Pcwstr, wtype: UInt): UInt

public expect fun mciSendCommandA(mciid: UInt, umsg: UInt, dwparam1: ULong, dwparam2: ULong): UInt

public expect fun mciSendCommandW(mciid: UInt, umsg: UInt, dwparam1: ULong, dwparam2: ULong): UInt

public expect fun mciSendStringA(lpstrcommand: Pcstr, lpstrreturnstring: Pstr, ureturnlength: UInt, hwndcallback: Hwnd): UInt

public expect fun mciSendStringW(lpstrcommand: Pcwstr, lpstrreturnstring: Pwstr, ureturnlength: UInt, hwndcallback: Hwnd): UInt

public expect fun mciSetDriverData(wdeviceid: UInt, dwdata: ULong): Bool

public expect fun mciSetYieldProc(mciid: UInt, fpyieldproc: Yieldproc, dwyielddata: UInt): Bool

public expect fun mmDrvInstall(hdriver: Hdrvr, wszdrventry: Pcwstr, drvmessage: Drivermsgproc, wflags: UInt): UInt

public expect fun mmGetCurrentTask(): UInt

public expect fun mmTaskBlock(h: UInt)

public expect fun mmTaskCreate(lpfn: Lptaskcallback, lph: COpaquePointer?, dwinst: ULong): UInt

public expect fun mmTaskSignal(h: UInt): Bool

public expect fun mmTaskYield()

public expect fun mmioAdvance(hmmio: Hmmio, pmmioinfo: COpaquePointer?, fuadvance: UInt): UInt

public expect fun mmioAscend(hmmio: Hmmio, pmmcki: COpaquePointer?, fuascend: UInt): UInt

public expect fun mmioClose(hmmio: Hmmio, fuclose: UInt): UInt

public expect fun mmioCreateChunk(hmmio: Hmmio, pmmcki: COpaquePointer?, fucreate: UInt): UInt

public expect fun mmioDescend(hmmio: Hmmio, pmmcki: COpaquePointer?, pmmckiparent: COpaquePointer?, fudescend: UInt): UInt

public expect fun mmioFlush(hmmio: Hmmio, fuflush: UInt): UInt

public expect fun mmioGetInfo(hmmio: Hmmio, pmmioinfo: COpaquePointer?, fuinfo: UInt): UInt

public expect fun mmioInstallIOProcA(fccioproc: UInt, pioproc: Lpmmioproc, dwflags: UInt): Lpmmioproc

public expect fun mmioInstallIOProcW(fccioproc: UInt, pioproc: Lpmmioproc, dwflags: UInt): Lpmmioproc

public expect fun mmioOpenA(pszfilename: Pstr, pmmioinfo: COpaquePointer?, fdwopen: UInt): Hmmio

public expect fun mmioOpenW(pszfilename: Pwstr, pmmioinfo: COpaquePointer?, fdwopen: UInt): Hmmio

public expect fun mmioRead(hmmio: Hmmio, pch: COpaquePointer?, cch: Int): Int

public expect fun mmioRenameA(pszfilename: Pcstr, psznewfilename: Pcstr, pmmioinfo: COpaquePointer?, fdwrename: UInt): UInt

public expect fun mmioRenameW(pszfilename: Pcwstr, psznewfilename: Pcwstr, pmmioinfo: COpaquePointer?, fdwrename: UInt): UInt

public expect fun mmioSeek(hmmio: Hmmio, loffset: Int, iorigin: Int): Int

public expect fun mmioSendMessage(hmmio: Hmmio, umsg: UInt, lparam1: Lparam, lparam2: Lparam): Lresult

public expect fun mmioSetBuffer(hmmio: Hmmio, pchbuffer: Pstr, cchbuffer: Int, fubuffer: UInt): UInt

public expect fun mmioSetInfo(hmmio: Hmmio, pmmioinfo: COpaquePointer?, fuinfo: UInt): UInt

public expect fun mmioStringToFOURCCA(sz: Pcstr, uflags: UInt): UInt

public expect fun mmioStringToFOURCCW(sz: Pcwstr, uflags: UInt): UInt

public expect fun mmioWrite(hmmio: Hmmio, pch: Pcstr, cch: Int): Int

public expect fun sndOpenSound(eventname: Pcwstr, appname: Pcwstr, flags: Int, filehandle: COpaquePointer?): Int
