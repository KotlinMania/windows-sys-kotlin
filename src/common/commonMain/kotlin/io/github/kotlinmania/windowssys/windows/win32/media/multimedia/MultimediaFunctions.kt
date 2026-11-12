package io.github.kotlinmania.windowssys.windows.win32.media.multimedia

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
import io.github.kotlinmania.windowssys.windows.win32.foundation.Farproc
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hmodule
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lresult
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Bitmapinfo
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Bitmapinfoheader
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hdc
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hpalette
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Paletteentry
import io.github.kotlinmania.windowssys.windows.win32.media.Htask
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs.Openfilenamea
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs.Openfilenamew

public expect fun aVIBuildFilterA(lpszfilter: Pstr, cbfilter: Int, fsaving: Bool): Hresult

public expect fun aVIBuildFilterW(lpszfilter: Pwstr, cbfilter: Int, fsaving: Bool): Hresult

public expect fun aVIClearClipboard(): Hresult

public expect fun aVIFileAddRef(pfile: MutPtr<CVoid>): UInt

public expect fun aVIFileCreateStreamA(pfile: MutPtr<CVoid>, ppavi: MutPtr<MutPtr<CVoid>>, psi: ConstPtr<Avistreaminfoa>): Hresult

public expect fun aVIFileCreateStreamW(pfile: MutPtr<CVoid>, ppavi: MutPtr<MutPtr<CVoid>>, psi: ConstPtr<Avistreaminfow>): Hresult

public expect fun aVIFileEndRecord(pfile: MutPtr<CVoid>): Hresult

public expect fun aVIFileExit()

public expect fun aVIFileGetStream(pfile: MutPtr<CVoid>, ppavi: MutPtr<MutPtr<CVoid>>, fcctype: UInt, lparam: Int): Hresult

public expect fun aVIFileInfoA(pfile: MutPtr<CVoid>, pfi: MutPtr<Avifileinfoa>, lsize: Int): Hresult

public expect fun aVIFileInfoW(pfile: MutPtr<CVoid>, pfi: MutPtr<Avifileinfow>, lsize: Int): Hresult

public expect fun aVIFileInit()

public expect fun aVIFileOpenA(ppfile: MutPtr<MutPtr<CVoid>>, szfile: Pcstr, umode: UInt, lphandler: ConstPtr<Guid>): Hresult

public expect fun aVIFileOpenW(ppfile: MutPtr<MutPtr<CVoid>>, szfile: Pcwstr, umode: UInt, lphandler: ConstPtr<Guid>): Hresult

public expect fun aVIFileReadData(pfile: MutPtr<CVoid>, ckid: UInt, lpdata: MutPtr<CVoid>, lpcbdata: MutPtr<Int>): Hresult

public expect fun aVIFileRelease(pfile: MutPtr<CVoid>): UInt

public expect fun aVIFileWriteData(pfile: MutPtr<CVoid>, ckid: UInt, lpdata: ConstPtr<CVoid>, cbdata: Int): Hresult

public expect fun aVIGetFromClipboard(lppf: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun aVIMakeCompressedStream(ppscompressed: MutPtr<MutPtr<CVoid>>, ppssource: MutPtr<CVoid>, lpoptions: ConstPtr<Avicompressoptions>, pclsidhandler: ConstPtr<Guid>): Hresult

public expect fun aVIMakeFileFromStreams(ppfile: MutPtr<MutPtr<CVoid>>, nstreams: Int, papstreams: ConstPtr<MutPtr<CVoid>>): Hresult

public expect fun aVIMakeStreamFromClipboard(cfformat: UInt, hglobal: Handle, ppstream: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun aVIPutFileOnClipboard(pf: MutPtr<CVoid>): Hresult

public expect fun aVISaveA(szfile: Pcstr, pclsidhandler: ConstPtr<Guid>, lpfncallback: Avisavecallback, nstreams: Int, pfile: MutPtr<CVoid>, lpoptions: ConstPtr<Avicompressoptions>, vararg variadicArgs: Long): Hresult

public expect fun aVISaveOptions(hwnd: Hwnd, uiflags: UInt, nstreams: Int, ppavi: ConstPtr<MutPtr<CVoid>>, plpoptions: MutPtr<MutPtr<Avicompressoptions>>): Long

public expect fun aVISaveOptionsFree(nstreams: Int, plpoptions: ConstPtr<ConstPtr<Avicompressoptions>>): Hresult

public expect fun aVISaveVA(szfile: Pcstr, pclsidhandler: ConstPtr<Guid>, lpfncallback: Avisavecallback, nstreams: Int, ppavi: ConstPtr<MutPtr<CVoid>>, plpoptions: ConstPtr<ConstPtr<Avicompressoptions>>): Hresult

public expect fun aVISaveVW(szfile: Pcwstr, pclsidhandler: ConstPtr<Guid>, lpfncallback: Avisavecallback, nstreams: Int, ppavi: ConstPtr<MutPtr<CVoid>>, plpoptions: ConstPtr<ConstPtr<Avicompressoptions>>): Hresult

public expect fun aVISaveW(szfile: Pcwstr, pclsidhandler: ConstPtr<Guid>, lpfncallback: Avisavecallback, nstreams: Int, pfile: MutPtr<CVoid>, lpoptions: ConstPtr<Avicompressoptions>, vararg variadicArgs: Long): Hresult

public expect fun aVIStreamAddRef(pavi: MutPtr<CVoid>): UInt

public expect fun aVIStreamBeginStreaming(pavi: MutPtr<CVoid>, lstart: Int, lend: Int, lrate: Int): Hresult

public expect fun aVIStreamCreate(ppavi: MutPtr<MutPtr<CVoid>>, lparam1: Int, lparam2: Int, pclsidhandler: ConstPtr<Guid>): Hresult

public expect fun aVIStreamEndStreaming(pavi: MutPtr<CVoid>): Hresult

public expect fun aVIStreamFindSample(pavi: MutPtr<CVoid>, lpos: Int, lflags: Int): Int

public expect fun aVIStreamGetFrame(pg: MutPtr<CVoid>, lpos: Int): MutPtr<CVoid>

public expect fun aVIStreamGetFrameClose(pg: MutPtr<CVoid>): Hresult

public expect fun aVIStreamGetFrameOpen(pavi: MutPtr<CVoid>, lpbiwanted: ConstPtr<Bitmapinfoheader>): MutPtr<CVoid>

public expect fun aVIStreamInfoA(pavi: MutPtr<CVoid>, psi: MutPtr<Avistreaminfoa>, lsize: Int): Hresult

public expect fun aVIStreamInfoW(pavi: MutPtr<CVoid>, psi: MutPtr<Avistreaminfow>, lsize: Int): Hresult

public expect fun aVIStreamLength(pavi: MutPtr<CVoid>): Int

public expect fun aVIStreamOpenFromFileA(ppavi: MutPtr<MutPtr<CVoid>>, szfile: Pcstr, fcctype: UInt, lparam: Int, mode: UInt, pclsidhandler: ConstPtr<Guid>): Hresult

public expect fun aVIStreamOpenFromFileW(ppavi: MutPtr<MutPtr<CVoid>>, szfile: Pcwstr, fcctype: UInt, lparam: Int, mode: UInt, pclsidhandler: ConstPtr<Guid>): Hresult

public expect fun aVIStreamRead(pavi: MutPtr<CVoid>, lstart: Int, lsamples: Int, lpbuffer: MutPtr<CVoid>, cbbuffer: Int, plbytes: MutPtr<Int>, plsamples: MutPtr<Int>): Hresult

public expect fun aVIStreamReadData(pavi: MutPtr<CVoid>, fcc: UInt, lp: MutPtr<CVoid>, lpcb: MutPtr<Int>): Hresult

public expect fun aVIStreamReadFormat(pavi: MutPtr<CVoid>, lpos: Int, lpformat: MutPtr<CVoid>, lpcbformat: MutPtr<Int>): Hresult

public expect fun aVIStreamRelease(pavi: MutPtr<CVoid>): UInt

public expect fun aVIStreamSampleToTime(pavi: MutPtr<CVoid>, lsample: Int): Int

public expect fun aVIStreamSetFormat(pavi: MutPtr<CVoid>, lpos: Int, lpformat: ConstPtr<CVoid>, cbformat: Int): Hresult

public expect fun aVIStreamStart(pavi: MutPtr<CVoid>): Int

public expect fun aVIStreamTimeToSample(pavi: MutPtr<CVoid>, ltime: Int): Int

public expect fun aVIStreamWrite(pavi: MutPtr<CVoid>, lstart: Int, lsamples: Int, lpbuffer: ConstPtr<CVoid>, cbbuffer: Int, dwflags: UInt, plsampwritten: MutPtr<Int>, plbyteswritten: MutPtr<Int>): Hresult

public expect fun aVIStreamWriteData(pavi: MutPtr<CVoid>, fcc: UInt, lp: ConstPtr<CVoid>, cb: Int): Hresult

public expect fun closeDriver(hdriver: Hdrvr, lparam1: Lparam, lparam2: Lparam): Lresult

public expect fun createEditableStream(ppseditable: MutPtr<MutPtr<CVoid>>, pssource: MutPtr<CVoid>): Hresult

public expect fun defDriverProc(dwdriveridentifier: ULong, hdrvr: Hdrvr, umsg: UInt, lparam1: Lparam, lparam2: Lparam): Lresult

public expect fun drawDibBegin(hdd: Long, hdc: Hdc, dxdst: Int, dydst: Int, lpbi: ConstPtr<Bitmapinfoheader>, dxsrc: Int, dysrc: Int, wflags: UInt): Bool

public expect fun drawDibChangePalette(hdd: Long, istart: Int, ilen: Int, lppe: ConstPtr<Paletteentry>): Bool

public expect fun drawDibClose(hdd: Long): Bool

public expect fun drawDibDraw(hdd: Long, hdc: Hdc, xdst: Int, ydst: Int, dxdst: Int, dydst: Int, lpbi: ConstPtr<Bitmapinfoheader>, lpbits: ConstPtr<CVoid>, xsrc: Int, ysrc: Int, dxsrc: Int, dysrc: Int, wflags: UInt): Bool

public expect fun drawDibEnd(hdd: Long): Bool

public expect fun drawDibGetBuffer(hdd: Long, lpbi: MutPtr<Bitmapinfoheader>, dwsize: UInt, dwflags: UInt): MutPtr<CVoid>

public expect fun drawDibGetPalette(hdd: Long): Hpalette

public expect fun drawDibOpen(): Long

public expect fun drawDibProfileDisplay(lpbi: ConstPtr<Bitmapinfoheader>): Lresult

public expect fun drawDibRealize(hdd: Long, hdc: Hdc, fbackground: Bool): UInt

public expect fun drawDibSetPalette(hdd: Long, hpal: Hpalette): Bool

public expect fun drawDibStart(hdd: Long, rate: UInt): Bool

public expect fun drawDibStop(hdd: Long): Bool

public expect fun drawDibTime(hdd: Long, lpddtime: MutPtr<Drawdibtime>): Bool

public expect fun driverCallback(dwcallback: ULong, dwflags: UInt, hdevice: Hdrvr, dwmsg: UInt, dwuser: ULong, dwparam1: ULong, dwparam2: ULong): Bool

public expect fun drvGetModuleHandle(hdriver: Hdrvr): Hmodule

public expect fun editStreamClone(pavi: MutPtr<CVoid>, ppresult: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun editStreamCopy(pavi: MutPtr<CVoid>, plstart: MutPtr<Int>, pllength: MutPtr<Int>, ppresult: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun editStreamCut(pavi: MutPtr<CVoid>, plstart: MutPtr<Int>, pllength: MutPtr<Int>, ppresult: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun editStreamPaste(pavi: MutPtr<CVoid>, plpos: MutPtr<Int>, pllength: MutPtr<Int>, pstream: MutPtr<CVoid>, lstart: Int, lend: Int): Hresult

public expect fun editStreamSetInfoA(pavi: MutPtr<CVoid>, lpinfo: ConstPtr<Avistreaminfoa>, cbinfo: Int): Hresult

public expect fun editStreamSetInfoW(pavi: MutPtr<CVoid>, lpinfo: ConstPtr<Avistreaminfow>, cbinfo: Int): Hresult

public expect fun editStreamSetNameA(pavi: MutPtr<CVoid>, lpszname: Pcstr): Hresult

public expect fun editStreamSetNameW(pavi: MutPtr<CVoid>, lpszname: Pcwstr): Hresult

public expect fun getDriverModuleHandle(hdriver: Hdrvr): Hmodule

public expect fun getOpenFileNamePreviewA(lpofn: MutPtr<Openfilenamea>): Bool

public expect fun getOpenFileNamePreviewW(lpofn: MutPtr<Openfilenamew>): Bool

public expect fun getSaveFileNamePreviewA(lpofn: MutPtr<Openfilenamea>): Bool

public expect fun getSaveFileNamePreviewW(lpofn: MutPtr<Openfilenamew>): Bool

public expect fun iCClose(hic: Hic): Lresult

public expect fun iCCompress(hic: Hic, dwflags: UInt, lpbioutput: ConstPtr<Bitmapinfoheader>, lpdata: MutPtr<CVoid>, lpbiinput: ConstPtr<Bitmapinfoheader>, lpbits: ConstPtr<CVoid>, lpckid: MutPtr<UInt>, lpdwflags: MutPtr<UInt>, lframenum: Int, dwframesize: UInt, dwquality: UInt, lpbiprev: ConstPtr<Bitmapinfoheader>, lpprev: ConstPtr<CVoid>): UInt

public expect fun iCCompressorChoose(hwnd: Hwnd, uiflags: UInt, pvin: ConstPtr<CVoid>, lpdata: ConstPtr<CVoid>, pc: MutPtr<Compvars>, lpsztitle: Pcstr): Bool

public expect fun iCCompressorFree(pc: ConstPtr<Compvars>)

public expect fun iCDecompress(hic: Hic, dwflags: UInt, lpbiformat: ConstPtr<Bitmapinfoheader>, lpdata: ConstPtr<CVoid>, lpbi: ConstPtr<Bitmapinfoheader>, lpbits: MutPtr<CVoid>): UInt

public expect fun iCDraw(hic: Hic, dwflags: UInt, lpformat: ConstPtr<CVoid>, lpdata: ConstPtr<CVoid>, cbdata: UInt, ltime: Int): UInt

public expect fun iCDrawBegin(hic: Hic, dwflags: UInt, hpal: Hpalette, hwnd: Hwnd, hdc: Hdc, xdst: Int, ydst: Int, dxdst: Int, dydst: Int, lpbi: ConstPtr<Bitmapinfoheader>, xsrc: Int, ysrc: Int, dxsrc: Int, dysrc: Int, dwrate: UInt, dwscale: UInt): UInt

public expect fun iCGetDisplayFormat(hic: Hic, lpbiin: ConstPtr<Bitmapinfoheader>, lpbiout: MutPtr<Bitmapinfoheader>, bitdepth: Int, dx: Int, dy: Int): Hic

public expect fun iCGetInfo(hic: Hic, picinfo: MutPtr<Icinfo>, cb: UInt): Lresult

public expect fun iCImageCompress(hic: Hic, uiflags: UInt, lpbiin: ConstPtr<Bitmapinfo>, lpbits: ConstPtr<CVoid>, lpbiout: ConstPtr<Bitmapinfo>, lquality: Int, plsize: MutPtr<Int>): Handle

public expect fun iCImageDecompress(hic: Hic, uiflags: UInt, lpbiin: ConstPtr<Bitmapinfo>, lpbits: ConstPtr<CVoid>, lpbiout: ConstPtr<Bitmapinfo>): Handle

public expect fun iCInfo(fcctype: UInt, fcchandler: UInt, lpicinfo: MutPtr<Icinfo>): Bool

public expect fun iCInstall(fcctype: UInt, fcchandler: UInt, lparam: Lparam, szdesc: Pcstr, wflags: UInt): Bool

public expect fun iCLocate(fcctype: UInt, fcchandler: UInt, lpbiin: ConstPtr<Bitmapinfoheader>, lpbiout: ConstPtr<Bitmapinfoheader>, wflags: UShort): Hic

public expect fun iCOpen(fcctype: UInt, fcchandler: UInt, wmode: UInt): Hic

public expect fun iCOpenFunction(fcctype: UInt, fcchandler: UInt, wmode: UInt, lpfnhandler: Farproc): Hic

public expect fun iCRemove(fcctype: UInt, fcchandler: UInt, wflags: UInt): Bool

public expect fun iCSendMessage(hic: Hic, msg: UInt, dw1: ULong, dw2: ULong): Lresult

public expect fun iCSeqCompressFrame(pc: ConstPtr<Compvars>, uiflags: UInt, lpbits: ConstPtr<CVoid>, pfkey: MutPtr<Bool>, plsize: MutPtr<Int>): MutPtr<CVoid>

public expect fun iCSeqCompressFrameEnd(pc: ConstPtr<Compvars>)

public expect fun iCSeqCompressFrameStart(pc: ConstPtr<Compvars>, lpbiin: ConstPtr<Bitmapinfo>): Bool

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

public expect fun joyGetDevCapsA(ujoyid: ULong, pjc: MutPtr<Joycapsa>, cbjc: UInt): UInt

public expect fun joyGetDevCapsW(ujoyid: ULong, pjc: MutPtr<Joycapsw>, cbjc: UInt): UInt

public expect fun joyGetNumDevs(): UInt

public expect fun joyGetPos(ujoyid: UInt, pji: MutPtr<Joyinfo>): UInt

public expect fun joyGetPosEx(ujoyid: UInt, pji: MutPtr<Joyinfoex>): UInt

public expect fun joyGetThreshold(ujoyid: UInt, puthreshold: MutPtr<UInt>): UInt

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

public expect fun mciGetYieldProc(mciid: UInt, pdwyielddata: ConstPtr<UInt>): Yieldproc

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

public expect fun mmTaskCreate(lpfn: Lptaskcallback, lph: MutPtr<Handle>, dwinst: ULong): UInt

public expect fun mmTaskSignal(h: UInt): Bool

public expect fun mmTaskYield()

public expect fun mmioAdvance(hmmio: Hmmio, pmmioinfo: ConstPtr<Mmioinfo>, fuadvance: UInt): UInt

public expect fun mmioAscend(hmmio: Hmmio, pmmcki: ConstPtr<Mmckinfo>, fuascend: UInt): UInt

public expect fun mmioClose(hmmio: Hmmio, fuclose: UInt): UInt

public expect fun mmioCreateChunk(hmmio: Hmmio, pmmcki: ConstPtr<Mmckinfo>, fucreate: UInt): UInt

public expect fun mmioDescend(hmmio: Hmmio, pmmcki: MutPtr<Mmckinfo>, pmmckiparent: ConstPtr<Mmckinfo>, fudescend: UInt): UInt

public expect fun mmioFlush(hmmio: Hmmio, fuflush: UInt): UInt

public expect fun mmioGetInfo(hmmio: Hmmio, pmmioinfo: MutPtr<Mmioinfo>, fuinfo: UInt): UInt

public expect fun mmioInstallIOProcA(fccioproc: UInt, pioproc: Lpmmioproc, dwflags: UInt): Lpmmioproc

public expect fun mmioInstallIOProcW(fccioproc: UInt, pioproc: Lpmmioproc, dwflags: UInt): Lpmmioproc

public expect fun mmioOpenA(pszfilename: Pstr, pmmioinfo: MutPtr<Mmioinfo>, fdwopen: UInt): Hmmio

public expect fun mmioOpenW(pszfilename: Pwstr, pmmioinfo: MutPtr<Mmioinfo>, fdwopen: UInt): Hmmio

public expect fun mmioRead(hmmio: Hmmio, pch: MutPtr<Byte>, cch: Int): Int

public expect fun mmioRenameA(pszfilename: Pcstr, psznewfilename: Pcstr, pmmioinfo: ConstPtr<Mmioinfo>, fdwrename: UInt): UInt

public expect fun mmioRenameW(pszfilename: Pcwstr, psznewfilename: Pcwstr, pmmioinfo: ConstPtr<Mmioinfo>, fdwrename: UInt): UInt

public expect fun mmioSeek(hmmio: Hmmio, loffset: Int, iorigin: Int): Int

public expect fun mmioSendMessage(hmmio: Hmmio, umsg: UInt, lparam1: Lparam, lparam2: Lparam): Lresult

public expect fun mmioSetBuffer(hmmio: Hmmio, pchbuffer: Pstr, cchbuffer: Int, fubuffer: UInt): UInt

public expect fun mmioSetInfo(hmmio: Hmmio, pmmioinfo: ConstPtr<Mmioinfo>, fuinfo: UInt): UInt

public expect fun mmioStringToFOURCCA(sz: Pcstr, uflags: UInt): UInt

public expect fun mmioStringToFOURCCW(sz: Pcwstr, uflags: UInt): UInt

public expect fun mmioWrite(hmmio: Hmmio, pch: Pcstr, cch: Int): Int

public expect fun sndOpenSound(eventname: Pcwstr, appname: Pcwstr, flags: Int, filehandle: MutPtr<Handle>): Int
