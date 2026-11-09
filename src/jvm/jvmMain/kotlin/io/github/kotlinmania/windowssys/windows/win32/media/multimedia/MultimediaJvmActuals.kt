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

private object WindowsWin32MediaMultimediaJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_AVIBuildFilterA(lpszfilter: Long, cbfilter: Int, fsaving: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_AVIBuildFilterW(lpszfilter: Long, cbfilter: Int, fsaving: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_AVIClearClipboard(): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_AVIFileAddRef(pfile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_AVIFileCreateStreamA(pfile: Long, ppavi: Long, psi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_AVIFileCreateStreamW(pfile: Long, ppavi: Long, psi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_AVIFileEndRecord(pfile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_AVIFileExit()

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_AVIFileGetStream(pfile: Long, ppavi: Long, fcctype: Int, lparam: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_AVIFileInfoA(pfile: Long, pfi: Long, lsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_AVIFileInfoW(pfile: Long, pfi: Long, lsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_AVIFileInit()

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_AVIFileOpenA(ppfile: Long, szfile: Long, umode: Int, lphandler: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_AVIFileOpenW(ppfile: Long, szfile: Long, umode: Int, lphandler: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_AVIFileReadData(pfile: Long, ckid: Int, lpdata: Long, lpcbdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_AVIFileRelease(pfile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_AVIFileWriteData(pfile: Long, ckid: Int, lpdata: Long, cbdata: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_AVIGetFromClipboard(lppf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_AVIMakeCompressedStream(ppscompressed: Long, ppssource: Long, lpoptions: Long, pclsidhandler: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_AVIMakeFileFromStreams(ppfile: Long, nstreams: Int, papstreams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_AVIMakeStreamFromClipboard(cfformat: Int, hglobal: Long, ppstream: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_AVIPutFileOnClipboard(pf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_AVISaveOptions(hwnd: Long, uiflags: Int, nstreams: Int, ppavi: Long, plpoptions: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_AVISaveOptionsFree(nstreams: Int, plpoptions: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_AVISaveVA(szfile: Long, pclsidhandler: Long, lpfncallback: Long, nstreams: Int, ppavi: Long, plpoptions: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_AVISaveVW(szfile: Long, pclsidhandler: Long, lpfncallback: Long, nstreams: Int, ppavi: Long, plpoptions: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_AVIStreamAddRef(pavi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_AVIStreamBeginStreaming(pavi: Long, lstart: Int, lend: Int, lrate: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_AVIStreamCreate(ppavi: Long, lparam1: Int, lparam2: Int, pclsidhandler: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_AVIStreamEndStreaming(pavi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_AVIStreamFindSample(pavi: Long, lpos: Int, lflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_AVIStreamGetFrame(pg: Long, lpos: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_AVIStreamGetFrameClose(pg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_AVIStreamGetFrameOpen(pavi: Long, lpbiwanted: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_AVIStreamInfoA(pavi: Long, psi: Long, lsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_AVIStreamInfoW(pavi: Long, psi: Long, lsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_AVIStreamLength(pavi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_AVIStreamOpenFromFileA(ppavi: Long, szfile: Long, fcctype: Int, lparam: Int, mode: Int, pclsidhandler: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_AVIStreamOpenFromFileW(ppavi: Long, szfile: Long, fcctype: Int, lparam: Int, mode: Int, pclsidhandler: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_AVIStreamRead(pavi: Long, lstart: Int, lsamples: Int, lpbuffer: Long, cbbuffer: Int, plbytes: Long, plsamples: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_AVIStreamReadData(pavi: Long, fcc: Int, lp: Long, lpcb: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_AVIStreamReadFormat(pavi: Long, lpos: Int, lpformat: Long, lpcbformat: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_AVIStreamRelease(pavi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_AVIStreamSampleToTime(pavi: Long, lsample: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_AVIStreamSetFormat(pavi: Long, lpos: Int, lpformat: Long, cbformat: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_AVIStreamStart(pavi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_AVIStreamTimeToSample(pavi: Long, ltime: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_AVIStreamWrite(pavi: Long, lstart: Int, lsamples: Int, lpbuffer: Long, cbbuffer: Int, dwflags: Int, plsampwritten: Long, plbyteswritten: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_AVIStreamWriteData(pavi: Long, fcc: Int, lp: Long, cb: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_CloseDriver(hdriver: Long, lparam1: Long, lparam2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_CreateEditableStream(ppseditable: Long, pssource: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_DefDriverProc(dwdriveridentifier: Long, hdrvr: Long, umsg: Int, lparam1: Long, lparam2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_DrawDibBegin(hdd: Long, hdc: Long, dxdst: Int, dydst: Int, lpbi: Long, dxsrc: Int, dysrc: Int, wflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_DrawDibChangePalette(hdd: Long, istart: Int, ilen: Int, lppe: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_DrawDibClose(hdd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_DrawDibDraw(hdd: Long, hdc: Long, xdst: Int, ydst: Int, dxdst: Int, dydst: Int, lpbi: Long, lpbits: Long, xsrc: Int, ysrc: Int, dxsrc: Int, dysrc: Int, wflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_DrawDibEnd(hdd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_DrawDibGetBuffer(hdd: Long, lpbi: Long, dwsize: Int, dwflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_DrawDibGetPalette(hdd: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_DrawDibOpen(): Long

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_DrawDibProfileDisplay(lpbi: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_DrawDibRealize(hdd: Long, hdc: Long, fbackground: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_DrawDibSetPalette(hdd: Long, hpal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_DrawDibStart(hdd: Long, rate: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_DrawDibStop(hdd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_DrawDibTime(hdd: Long, lpddtime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_DriverCallback(dwcallback: Long, dwflags: Int, hdevice: Long, dwmsg: Int, dwuser: Long, dwparam1: Long, dwparam2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_DrvGetModuleHandle(hdriver: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_EditStreamClone(pavi: Long, ppresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_EditStreamCopy(pavi: Long, plstart: Long, pllength: Long, ppresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_EditStreamCut(pavi: Long, plstart: Long, pllength: Long, ppresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_EditStreamPaste(pavi: Long, plpos: Long, pllength: Long, pstream: Long, lstart: Int, lend: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_EditStreamSetInfoA(pavi: Long, lpinfo: Long, cbinfo: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_EditStreamSetInfoW(pavi: Long, lpinfo: Long, cbinfo: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_EditStreamSetNameA(pavi: Long, lpszname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_EditStreamSetNameW(pavi: Long, lpszname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_GetDriverModuleHandle(hdriver: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_GetOpenFileNamePreviewA(lpofn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_GetOpenFileNamePreviewW(lpofn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_GetSaveFileNamePreviewA(lpofn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_GetSaveFileNamePreviewW(lpofn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_ICClose(hic: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_ICCompress(hic: Long, dwflags: Int, lpbioutput: Long, lpdata: Long, lpbiinput: Long, lpbits: Long, lpckid: Long, lpdwflags: Long, lframenum: Int, dwframesize: Int, dwquality: Int, lpbiprev: Long, lpprev: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_ICCompressorChoose(hwnd: Long, uiflags: Int, pvin: Long, lpdata: Long, pc: Long, lpsztitle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_ICCompressorFree(pc: Long)

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_ICDecompress(hic: Long, dwflags: Int, lpbiformat: Long, lpdata: Long, lpbi: Long, lpbits: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_ICDraw(hic: Long, dwflags: Int, lpformat: Long, lpdata: Long, cbdata: Int, ltime: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_ICDrawBegin(hic: Long, dwflags: Int, hpal: Long, hwnd: Long, hdc: Long, xdst: Int, ydst: Int, dxdst: Int, dydst: Int, lpbi: Long, xsrc: Int, ysrc: Int, dxsrc: Int, dysrc: Int, dwrate: Int, dwscale: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_ICGetDisplayFormat(hic: Long, lpbiin: Long, lpbiout: Long, bitdepth: Int, dx: Int, dy: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_ICGetInfo(hic: Long, picinfo: Long, cb: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_ICImageCompress(hic: Long, uiflags: Int, lpbiin: Long, lpbits: Long, lpbiout: Long, lquality: Int, plsize: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_ICImageDecompress(hic: Long, uiflags: Int, lpbiin: Long, lpbits: Long, lpbiout: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_ICInfo(fcctype: Int, fcchandler: Int, lpicinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_ICInstall(fcctype: Int, fcchandler: Int, lparam: Long, szdesc: Long, wflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_ICLocate(fcctype: Int, fcchandler: Int, lpbiin: Long, lpbiout: Long, wflags: Short): Long

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_ICOpen(fcctype: Int, fcchandler: Int, wmode: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_ICRemove(fcctype: Int, fcchandler: Int, wflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_ICSendMessage(hic: Long, msg: Int, dw1: Long, dw2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_ICSeqCompressFrame(pc: Long, uiflags: Int, lpbits: Long, pfkey: Long, plsize: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_ICSeqCompressFrameEnd(pc: Long)

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_ICSeqCompressFrameStart(pc: Long, lpbiin: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_MCIWndCreateA(hwndparent: Long, hinstance: Long, dwstyle: Int, szfile: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_MCIWndCreateW(hwndparent: Long, hinstance: Long, dwstyle: Int, szfile: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_MCIWndRegisterClass(): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_OpenDriver(szdrivername: Long, szsectionname: Long, lparam2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_SendDriverMessage(hdriver: Long, message: Int, lparam1: Long, lparam2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_VideoForWindowsVersion(): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_capCreateCaptureWindowA(lpszwindowname: Long, dwstyle: Int, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: Long, nid: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_capCreateCaptureWindowW(lpszwindowname: Long, dwstyle: Int, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: Long, nid: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_capGetDriverDescriptionA(wdriverindex: Int, lpszname: Long, cbname: Int, lpszver: Long, cbver: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_capGetDriverDescriptionW(wdriverindex: Int, lpszname: Long, cbname: Int, lpszver: Long, cbver: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_joyGetDevCapsA(ujoyid: Long, pjc: Long, cbjc: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_joyGetDevCapsW(ujoyid: Long, pjc: Long, cbjc: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_joyGetNumDevs(): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_joyGetPos(ujoyid: Int, pji: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_joyGetPosEx(ujoyid: Int, pji: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_joyGetThreshold(ujoyid: Int, puthreshold: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_joyReleaseCapture(ujoyid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_joySetCapture(hwnd: Long, ujoyid: Int, uperiod: Int, fchanged: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_joySetThreshold(ujoyid: Int, uthreshold: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_mciDriverNotify(hwndcallback: Long, wdeviceid: Int, ustatus: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_mciDriverYield(wdeviceid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_mciFreeCommandResource(wtable: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_mciGetCreatorTask(mciid: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_mciGetDeviceIDA(pszdevice: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_mciGetDeviceIDFromElementIDA(dwelementid: Int, lpstrtype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_mciGetDeviceIDFromElementIDW(dwelementid: Int, lpstrtype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_mciGetDeviceIDW(pszdevice: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_mciGetDriverData(wdeviceid: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_mciGetErrorStringA(mcierr: Int, psztext: Long, cchtext: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_mciGetErrorStringW(mcierr: Int, psztext: Long, cchtext: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_mciGetYieldProc(mciid: Int, pdwyielddata: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_mciLoadCommandResource(hinstance: Long, lpresname: Long, wtype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_mciSendCommandA(mciid: Int, umsg: Int, dwparam1: Long, dwparam2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_mciSendCommandW(mciid: Int, umsg: Int, dwparam1: Long, dwparam2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_mciSendStringA(lpstrcommand: Long, lpstrreturnstring: Long, ureturnlength: Int, hwndcallback: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_mciSendStringW(lpstrcommand: Long, lpstrreturnstring: Long, ureturnlength: Int, hwndcallback: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_mciSetDriverData(wdeviceid: Int, dwdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_mciSetYieldProc(mciid: Int, fpyieldproc: Long, dwyielddata: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_mmDrvInstall(hdriver: Long, wszdrventry: Long, drvmessage: Long, wflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_mmGetCurrentTask(): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_mmTaskBlock(h: Int)

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_mmTaskCreate(lpfn: Long, lph: Long, dwinst: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_mmTaskSignal(h: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_mmTaskYield()

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_mmioAdvance(hmmio: Long, pmmioinfo: Long, fuadvance: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_mmioAscend(hmmio: Long, pmmcki: Long, fuascend: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_mmioClose(hmmio: Long, fuclose: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_mmioCreateChunk(hmmio: Long, pmmcki: Long, fucreate: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_mmioDescend(hmmio: Long, pmmcki: Long, pmmckiparent: Long, fudescend: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_mmioFlush(hmmio: Long, fuflush: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_mmioGetInfo(hmmio: Long, pmmioinfo: Long, fuinfo: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_mmioInstallIOProcA(fccioproc: Int, pioproc: Long, dwflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_mmioInstallIOProcW(fccioproc: Int, pioproc: Long, dwflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_mmioOpenA(pszfilename: Long, pmmioinfo: Long, fdwopen: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_mmioOpenW(pszfilename: Long, pmmioinfo: Long, fdwopen: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_mmioRead(hmmio: Long, pch: Long, cch: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_mmioRenameA(pszfilename: Long, psznewfilename: Long, pmmioinfo: Long, fdwrename: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_mmioRenameW(pszfilename: Long, psznewfilename: Long, pmmioinfo: Long, fdwrename: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_mmioSeek(hmmio: Long, loffset: Int, iorigin: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_mmioSendMessage(hmmio: Long, umsg: Int, lparam1: Long, lparam2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_mmioSetBuffer(hmmio: Long, pchbuffer: Long, cchbuffer: Int, fubuffer: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_mmioSetInfo(hmmio: Long, pmmioinfo: Long, fuinfo: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_mmioStringToFOURCCA(sz: Long, uflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_mmioStringToFOURCCW(sz: Long, uflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_mmioWrite(hmmio: Long, pch: Long, cch: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_sndOpenSound(eventname: Long, appname: Long, flags: Int, filehandle: Long): Int
}

public actual fun AVIBuildFilterA(lpszfilter: PSTR, cbfilter: Int, fsaving: BOOL): HRESULT =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_AVIBuildFilterA(lpszfilter, cbfilter, fsaving)

public actual fun AVIBuildFilterW(lpszfilter: PWSTR, cbfilter: Int, fsaving: BOOL): HRESULT =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_AVIBuildFilterW(lpszfilter, cbfilter, fsaving)

public actual fun AVIClearClipboard(): HRESULT =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_AVIClearClipboard()

public actual fun AVIFileAddRef(pfile: Long): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_AVIFileAddRef(pfile).toUInt()

public actual fun AVIFileCreateStreamA(pfile: Long, ppavi: Long, psi: Long): HRESULT =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_AVIFileCreateStreamA(pfile, ppavi, psi)

public actual fun AVIFileCreateStreamW(pfile: Long, ppavi: Long, psi: Long): HRESULT =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_AVIFileCreateStreamW(pfile, ppavi, psi)

public actual fun AVIFileEndRecord(pfile: Long): HRESULT =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_AVIFileEndRecord(pfile)

public actual fun AVIFileExit() {
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_AVIFileExit()
}

public actual fun AVIFileGetStream(pfile: Long, ppavi: Long, fcctype: UInt, lparam: Int): HRESULT =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_AVIFileGetStream(pfile, ppavi, fcctype.toInt(), lparam)

public actual fun AVIFileInfoA(pfile: Long, pfi: Long, lsize: Int): HRESULT =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_AVIFileInfoA(pfile, pfi, lsize)

public actual fun AVIFileInfoW(pfile: Long, pfi: Long, lsize: Int): HRESULT =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_AVIFileInfoW(pfile, pfi, lsize)

public actual fun AVIFileInit() {
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_AVIFileInit()
}

public actual fun AVIFileOpenA(ppfile: Long, szfile: PCSTR, umode: UInt, lphandler: Long): HRESULT =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_AVIFileOpenA(ppfile, szfile, umode.toInt(), lphandler)

public actual fun AVIFileOpenW(ppfile: Long, szfile: PCWSTR, umode: UInt, lphandler: Long): HRESULT =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_AVIFileOpenW(ppfile, szfile, umode.toInt(), lphandler)

public actual fun AVIFileReadData(pfile: Long, ckid: UInt, lpdata: Long, lpcbdata: Long): HRESULT =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_AVIFileReadData(pfile, ckid.toInt(), lpdata, lpcbdata)

public actual fun AVIFileRelease(pfile: Long): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_AVIFileRelease(pfile).toUInt()

public actual fun AVIFileWriteData(pfile: Long, ckid: UInt, lpdata: Long, cbdata: Int): HRESULT =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_AVIFileWriteData(pfile, ckid.toInt(), lpdata, cbdata)

public actual fun AVIGetFromClipboard(lppf: Long): HRESULT =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_AVIGetFromClipboard(lppf)

public actual fun AVIMakeCompressedStream(ppscompressed: Long, ppssource: Long, lpoptions: Long, pclsidhandler: Long): HRESULT =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_AVIMakeCompressedStream(ppscompressed, ppssource, lpoptions, pclsidhandler)

public actual fun AVIMakeFileFromStreams(ppfile: Long, nstreams: Int, papstreams: Long): HRESULT =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_AVIMakeFileFromStreams(ppfile, nstreams, papstreams)

public actual fun AVIMakeStreamFromClipboard(cfformat: UInt, hglobal: HANDLE, ppstream: Long): HRESULT =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_AVIMakeStreamFromClipboard(cfformat.toInt(), hglobal, ppstream)

public actual fun AVIPutFileOnClipboard(pf: Long): HRESULT =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_AVIPutFileOnClipboard(pf)

public actual fun AVISaveA(szfile: PCSTR, pclsidhandler: Long, lpfncallback: AVISAVECALLBACK, nstreams: Int, pfile: Long, lpoptions: Long): HRESULT =
    0

public actual fun AVISaveOptions(hwnd: HWND, uiflags: UInt, nstreams: Int, ppavi: Long, plpoptions: Long): Long =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_AVISaveOptions(hwnd, uiflags.toInt(), nstreams, ppavi, plpoptions)

public actual fun AVISaveOptionsFree(nstreams: Int, plpoptions: Long): HRESULT =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_AVISaveOptionsFree(nstreams, plpoptions)

public actual fun AVISaveVA(szfile: PCSTR, pclsidhandler: Long, lpfncallback: AVISAVECALLBACK, nstreams: Int, ppavi: Long, plpoptions: Long): HRESULT =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_AVISaveVA(szfile, pclsidhandler, lpfncallback.toLong(), nstreams, ppavi, plpoptions)

public actual fun AVISaveVW(szfile: PCWSTR, pclsidhandler: Long, lpfncallback: AVISAVECALLBACK, nstreams: Int, ppavi: Long, plpoptions: Long): HRESULT =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_AVISaveVW(szfile, pclsidhandler, lpfncallback.toLong(), nstreams, ppavi, plpoptions)

public actual fun AVISaveW(szfile: PCWSTR, pclsidhandler: Long, lpfncallback: AVISAVECALLBACK, nstreams: Int, pfile: Long, lpoptions: Long): HRESULT =
    0

public actual fun AVIStreamAddRef(pavi: Long): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_AVIStreamAddRef(pavi).toUInt()

public actual fun AVIStreamBeginStreaming(pavi: Long, lstart: Int, lend: Int, lrate: Int): HRESULT =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_AVIStreamBeginStreaming(pavi, lstart, lend, lrate)

public actual fun AVIStreamCreate(ppavi: Long, lparam1: Int, lparam2: Int, pclsidhandler: Long): HRESULT =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_AVIStreamCreate(ppavi, lparam1, lparam2, pclsidhandler)

public actual fun AVIStreamEndStreaming(pavi: Long): HRESULT =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_AVIStreamEndStreaming(pavi)

public actual fun AVIStreamFindSample(pavi: Long, lpos: Int, lflags: Int): Int =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_AVIStreamFindSample(pavi, lpos, lflags)

public actual fun AVIStreamGetFrame(pg: Long, lpos: Int): Long =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_AVIStreamGetFrame(pg, lpos)

public actual fun AVIStreamGetFrameClose(pg: Long): HRESULT =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_AVIStreamGetFrameClose(pg)

public actual fun AVIStreamGetFrameOpen(pavi: Long, lpbiwanted: Long): Long =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_AVIStreamGetFrameOpen(pavi, lpbiwanted)

public actual fun AVIStreamInfoA(pavi: Long, psi: Long, lsize: Int): HRESULT =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_AVIStreamInfoA(pavi, psi, lsize)

public actual fun AVIStreamInfoW(pavi: Long, psi: Long, lsize: Int): HRESULT =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_AVIStreamInfoW(pavi, psi, lsize)

public actual fun AVIStreamLength(pavi: Long): Int =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_AVIStreamLength(pavi)

public actual fun AVIStreamOpenFromFileA(ppavi: Long, szfile: PCSTR, fcctype: UInt, lparam: Int, mode: UInt, pclsidhandler: Long): HRESULT =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_AVIStreamOpenFromFileA(ppavi, szfile, fcctype.toInt(), lparam, mode.toInt(), pclsidhandler)

public actual fun AVIStreamOpenFromFileW(ppavi: Long, szfile: PCWSTR, fcctype: UInt, lparam: Int, mode: UInt, pclsidhandler: Long): HRESULT =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_AVIStreamOpenFromFileW(ppavi, szfile, fcctype.toInt(), lparam, mode.toInt(), pclsidhandler)

public actual fun AVIStreamRead(pavi: Long, lstart: Int, lsamples: Int, lpbuffer: Long, cbbuffer: Int, plbytes: Long, plsamples: Long): HRESULT =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_AVIStreamRead(pavi, lstart, lsamples, lpbuffer, cbbuffer, plbytes, plsamples)

public actual fun AVIStreamReadData(pavi: Long, fcc: UInt, lp: Long, lpcb: Long): HRESULT =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_AVIStreamReadData(pavi, fcc.toInt(), lp, lpcb)

public actual fun AVIStreamReadFormat(pavi: Long, lpos: Int, lpformat: Long, lpcbformat: Long): HRESULT =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_AVIStreamReadFormat(pavi, lpos, lpformat, lpcbformat)

public actual fun AVIStreamRelease(pavi: Long): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_AVIStreamRelease(pavi).toUInt()

public actual fun AVIStreamSampleToTime(pavi: Long, lsample: Int): Int =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_AVIStreamSampleToTime(pavi, lsample)

public actual fun AVIStreamSetFormat(pavi: Long, lpos: Int, lpformat: Long, cbformat: Int): HRESULT =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_AVIStreamSetFormat(pavi, lpos, lpformat, cbformat)

public actual fun AVIStreamStart(pavi: Long): Int =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_AVIStreamStart(pavi)

public actual fun AVIStreamTimeToSample(pavi: Long, ltime: Int): Int =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_AVIStreamTimeToSample(pavi, ltime)

public actual fun AVIStreamWrite(pavi: Long, lstart: Int, lsamples: Int, lpbuffer: Long, cbbuffer: Int, dwflags: UInt, plsampwritten: Long, plbyteswritten: Long): HRESULT =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_AVIStreamWrite(pavi, lstart, lsamples, lpbuffer, cbbuffer, dwflags.toInt(), plsampwritten, plbyteswritten)

public actual fun AVIStreamWriteData(pavi: Long, fcc: UInt, lp: Long, cb: Int): HRESULT =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_AVIStreamWriteData(pavi, fcc.toInt(), lp, cb)

public actual fun CloseDriver(hdriver: HDRVR, lparam1: LPARAM, lparam2: LPARAM): LRESULT =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_CloseDriver(hdriver, lparam1, lparam2)

public actual fun CreateEditableStream(ppseditable: Long, pssource: Long): HRESULT =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_CreateEditableStream(ppseditable, pssource)

public actual fun DefDriverProc(dwdriveridentifier: ULong, hdrvr: HDRVR, umsg: UInt, lparam1: LPARAM, lparam2: LPARAM): LRESULT =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_DefDriverProc(dwdriveridentifier.toLong(), hdrvr, umsg.toInt(), lparam1, lparam2)

public actual fun DrawDibBegin(hdd: Long, hdc: HDC, dxdst: Int, dydst: Int, lpbi: Long, dxsrc: Int, dysrc: Int, wflags: UInt): BOOL =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_DrawDibBegin(hdd, hdc, dxdst, dydst, lpbi, dxsrc, dysrc, wflags.toInt())

public actual fun DrawDibChangePalette(hdd: Long, istart: Int, ilen: Int, lppe: Long): BOOL =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_DrawDibChangePalette(hdd, istart, ilen, lppe)

public actual fun DrawDibClose(hdd: Long): BOOL =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_DrawDibClose(hdd)

public actual fun DrawDibDraw(hdd: Long, hdc: HDC, xdst: Int, ydst: Int, dxdst: Int, dydst: Int, lpbi: Long, lpbits: Long, xsrc: Int, ysrc: Int, dxsrc: Int, dysrc: Int, wflags: UInt): BOOL =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_DrawDibDraw(hdd, hdc, xdst, ydst, dxdst, dydst, lpbi, lpbits, xsrc, ysrc, dxsrc, dysrc, wflags.toInt())

public actual fun DrawDibEnd(hdd: Long): BOOL =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_DrawDibEnd(hdd)

public actual fun DrawDibGetBuffer(hdd: Long, lpbi: Long, dwsize: UInt, dwflags: UInt): Long =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_DrawDibGetBuffer(hdd, lpbi, dwsize.toInt(), dwflags.toInt())

public actual fun DrawDibGetPalette(hdd: Long): HPALETTE =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_DrawDibGetPalette(hdd)

public actual fun DrawDibOpen(): Long =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_DrawDibOpen()

public actual fun DrawDibProfileDisplay(lpbi: Long): LRESULT =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_DrawDibProfileDisplay(lpbi)

public actual fun DrawDibRealize(hdd: Long, hdc: HDC, fbackground: BOOL): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_DrawDibRealize(hdd, hdc, fbackground).toUInt()

public actual fun DrawDibSetPalette(hdd: Long, hpal: HPALETTE): BOOL =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_DrawDibSetPalette(hdd, hpal)

public actual fun DrawDibStart(hdd: Long, rate: UInt): BOOL =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_DrawDibStart(hdd, rate.toInt())

public actual fun DrawDibStop(hdd: Long): BOOL =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_DrawDibStop(hdd)

public actual fun DrawDibTime(hdd: Long, lpddtime: Long): BOOL =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_DrawDibTime(hdd, lpddtime)

public actual fun DriverCallback(dwcallback: ULong, dwflags: UInt, hdevice: HDRVR, dwmsg: UInt, dwuser: ULong, dwparam1: ULong, dwparam2: ULong): BOOL =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_DriverCallback(dwcallback.toLong(), dwflags.toInt(), hdevice, dwmsg.toInt(), dwuser.toLong(), dwparam1.toLong(), dwparam2.toLong())

public actual fun DrvGetModuleHandle(hdriver: HDRVR): HMODULE =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_DrvGetModuleHandle(hdriver)

public actual fun EditStreamClone(pavi: Long, ppresult: Long): HRESULT =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_EditStreamClone(pavi, ppresult)

public actual fun EditStreamCopy(pavi: Long, plstart: Long, pllength: Long, ppresult: Long): HRESULT =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_EditStreamCopy(pavi, plstart, pllength, ppresult)

public actual fun EditStreamCut(pavi: Long, plstart: Long, pllength: Long, ppresult: Long): HRESULT =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_EditStreamCut(pavi, plstart, pllength, ppresult)

public actual fun EditStreamPaste(pavi: Long, plpos: Long, pllength: Long, pstream: Long, lstart: Int, lend: Int): HRESULT =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_EditStreamPaste(pavi, plpos, pllength, pstream, lstart, lend)

public actual fun EditStreamSetInfoA(pavi: Long, lpinfo: Long, cbinfo: Int): HRESULT =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_EditStreamSetInfoA(pavi, lpinfo, cbinfo)

public actual fun EditStreamSetInfoW(pavi: Long, lpinfo: Long, cbinfo: Int): HRESULT =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_EditStreamSetInfoW(pavi, lpinfo, cbinfo)

public actual fun EditStreamSetNameA(pavi: Long, lpszname: PCSTR): HRESULT =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_EditStreamSetNameA(pavi, lpszname)

public actual fun EditStreamSetNameW(pavi: Long, lpszname: PCWSTR): HRESULT =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_EditStreamSetNameW(pavi, lpszname)

public actual fun GetDriverModuleHandle(hdriver: HDRVR): HMODULE =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_GetDriverModuleHandle(hdriver)

public actual fun GetOpenFileNamePreviewA(lpofn: Long): BOOL =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_GetOpenFileNamePreviewA(lpofn)

public actual fun GetOpenFileNamePreviewW(lpofn: Long): BOOL =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_GetOpenFileNamePreviewW(lpofn)

public actual fun GetSaveFileNamePreviewA(lpofn: Long): BOOL =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_GetSaveFileNamePreviewA(lpofn)

public actual fun GetSaveFileNamePreviewW(lpofn: Long): BOOL =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_GetSaveFileNamePreviewW(lpofn)

public actual fun ICClose(hic: HIC): LRESULT =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_ICClose(hic)

public actual fun ICCompress(hic: HIC, dwflags: UInt, lpbioutput: Long, lpdata: Long, lpbiinput: Long, lpbits: Long, lpckid: Long, lpdwflags: Long, lframenum: Int, dwframesize: UInt, dwquality: UInt, lpbiprev: Long, lpprev: Long): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_ICCompress(hic, dwflags.toInt(), lpbioutput, lpdata, lpbiinput, lpbits, lpckid, lpdwflags, lframenum, dwframesize.toInt(), dwquality.toInt(), lpbiprev, lpprev).toUInt()

public actual fun ICCompressorChoose(hwnd: HWND, uiflags: UInt, pvin: Long, lpdata: Long, pc: Long, lpsztitle: PCSTR): BOOL =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_ICCompressorChoose(hwnd, uiflags.toInt(), pvin, lpdata, pc, lpsztitle)

public actual fun ICCompressorFree(pc: Long) {
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_ICCompressorFree(pc)
}

public actual fun ICDecompress(hic: HIC, dwflags: UInt, lpbiformat: Long, lpdata: Long, lpbi: Long, lpbits: Long): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_ICDecompress(hic, dwflags.toInt(), lpbiformat, lpdata, lpbi, lpbits).toUInt()

public actual fun ICDraw(hic: HIC, dwflags: UInt, lpformat: Long, lpdata: Long, cbdata: UInt, ltime: Int): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_ICDraw(hic, dwflags.toInt(), lpformat, lpdata, cbdata.toInt(), ltime).toUInt()

public actual fun ICDrawBegin(hic: HIC, dwflags: UInt, hpal: HPALETTE, hwnd: HWND, hdc: HDC, xdst: Int, ydst: Int, dxdst: Int, dydst: Int, lpbi: Long, xsrc: Int, ysrc: Int, dxsrc: Int, dysrc: Int, dwrate: UInt, dwscale: UInt): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_ICDrawBegin(hic, dwflags.toInt(), hpal, hwnd, hdc, xdst, ydst, dxdst, dydst, lpbi, xsrc, ysrc, dxsrc, dysrc, dwrate.toInt(), dwscale.toInt()).toUInt()

public actual fun ICGetDisplayFormat(hic: HIC, lpbiin: Long, lpbiout: Long, bitdepth: Int, dx: Int, dy: Int): HIC =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_ICGetDisplayFormat(hic, lpbiin, lpbiout, bitdepth, dx, dy)

public actual fun ICGetInfo(hic: HIC, picinfo: Long, cb: UInt): LRESULT =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_ICGetInfo(hic, picinfo, cb.toInt())

public actual fun ICImageCompress(hic: HIC, uiflags: UInt, lpbiin: Long, lpbits: Long, lpbiout: Long, lquality: Int, plsize: Long): HANDLE =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_ICImageCompress(hic, uiflags.toInt(), lpbiin, lpbits, lpbiout, lquality, plsize)

public actual fun ICImageDecompress(hic: HIC, uiflags: UInt, lpbiin: Long, lpbits: Long, lpbiout: Long): HANDLE =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_ICImageDecompress(hic, uiflags.toInt(), lpbiin, lpbits, lpbiout)

public actual fun ICInfo(fcctype: UInt, fcchandler: UInt, lpicinfo: Long): BOOL =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_ICInfo(fcctype.toInt(), fcchandler.toInt(), lpicinfo)

public actual fun ICInstall(fcctype: UInt, fcchandler: UInt, lparam: LPARAM, szdesc: PCSTR, wflags: UInt): BOOL =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_ICInstall(fcctype.toInt(), fcchandler.toInt(), lparam, szdesc, wflags.toInt())

public actual fun ICLocate(fcctype: UInt, fcchandler: UInt, lpbiin: Long, lpbiout: Long, wflags: UShort): HIC =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_ICLocate(fcctype.toInt(), fcchandler.toInt(), lpbiin, lpbiout, wflags.toShort())

public actual fun ICOpen(fcctype: UInt, fcchandler: UInt, wmode: UInt): HIC =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_ICOpen(fcctype.toInt(), fcchandler.toInt(), wmode.toInt())

public actual fun ICOpenFunction(fcctype: UInt, fcchandler: UInt, wmode: UInt, lpfnhandler: FARPROC): HIC =
    0L

public actual fun ICRemove(fcctype: UInt, fcchandler: UInt, wflags: UInt): BOOL =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_ICRemove(fcctype.toInt(), fcchandler.toInt(), wflags.toInt())

public actual fun ICSendMessage(hic: HIC, msg: UInt, dw1: ULong, dw2: ULong): LRESULT =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_ICSendMessage(hic, msg.toInt(), dw1.toLong(), dw2.toLong())

public actual fun ICSeqCompressFrame(pc: Long, uiflags: UInt, lpbits: Long, pfkey: Long, plsize: Long): Long =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_ICSeqCompressFrame(pc, uiflags.toInt(), lpbits, pfkey, plsize)

public actual fun ICSeqCompressFrameEnd(pc: Long) {
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_ICSeqCompressFrameEnd(pc)
}

public actual fun ICSeqCompressFrameStart(pc: Long, lpbiin: Long): BOOL =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_ICSeqCompressFrameStart(pc, lpbiin)

public actual fun MCIWndCreateA(hwndparent: HWND, hinstance: HINSTANCE, dwstyle: UInt, szfile: PCSTR): HWND =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_MCIWndCreateA(hwndparent, hinstance, dwstyle.toInt(), szfile)

public actual fun MCIWndCreateW(hwndparent: HWND, hinstance: HINSTANCE, dwstyle: UInt, szfile: PCWSTR): HWND =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_MCIWndCreateW(hwndparent, hinstance, dwstyle.toInt(), szfile)

public actual fun MCIWndRegisterClass(): BOOL =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_MCIWndRegisterClass()

public actual fun OpenDriver(szdrivername: PCWSTR, szsectionname: PCWSTR, lparam2: LPARAM): HDRVR =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_OpenDriver(szdrivername, szsectionname, lparam2)

public actual fun SendDriverMessage(hdriver: HDRVR, message: UInt, lparam1: LPARAM, lparam2: LPARAM): LRESULT =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_SendDriverMessage(hdriver, message.toInt(), lparam1, lparam2)

public actual fun VideoForWindowsVersion(): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_VideoForWindowsVersion().toUInt()

public actual fun capCreateCaptureWindowA(lpszwindowname: PCSTR, dwstyle: UInt, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: HWND, nid: Int): HWND =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_capCreateCaptureWindowA(lpszwindowname, dwstyle.toInt(), x, y, nwidth, nheight, hwndparent, nid)

public actual fun capCreateCaptureWindowW(lpszwindowname: PCWSTR, dwstyle: UInt, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: HWND, nid: Int): HWND =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_capCreateCaptureWindowW(lpszwindowname, dwstyle.toInt(), x, y, nwidth, nheight, hwndparent, nid)

public actual fun capGetDriverDescriptionA(wdriverindex: UInt, lpszname: PSTR, cbname: Int, lpszver: PSTR, cbver: Int): BOOL =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_capGetDriverDescriptionA(wdriverindex.toInt(), lpszname, cbname, lpszver, cbver)

public actual fun capGetDriverDescriptionW(wdriverindex: UInt, lpszname: PWSTR, cbname: Int, lpszver: PWSTR, cbver: Int): BOOL =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_capGetDriverDescriptionW(wdriverindex.toInt(), lpszname, cbname, lpszver, cbver)

public actual fun joyGetDevCapsA(ujoyid: ULong, pjc: Long, cbjc: UInt): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_joyGetDevCapsA(ujoyid.toLong(), pjc, cbjc.toInt()).toUInt()

public actual fun joyGetDevCapsW(ujoyid: ULong, pjc: Long, cbjc: UInt): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_joyGetDevCapsW(ujoyid.toLong(), pjc, cbjc.toInt()).toUInt()

public actual fun joyGetNumDevs(): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_joyGetNumDevs().toUInt()

public actual fun joyGetPos(ujoyid: UInt, pji: Long): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_joyGetPos(ujoyid.toInt(), pji).toUInt()

public actual fun joyGetPosEx(ujoyid: UInt, pji: Long): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_joyGetPosEx(ujoyid.toInt(), pji).toUInt()

public actual fun joyGetThreshold(ujoyid: UInt, puthreshold: Long): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_joyGetThreshold(ujoyid.toInt(), puthreshold).toUInt()

public actual fun joyReleaseCapture(ujoyid: UInt): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_joyReleaseCapture(ujoyid.toInt()).toUInt()

public actual fun joySetCapture(hwnd: HWND, ujoyid: UInt, uperiod: UInt, fchanged: BOOL): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_joySetCapture(hwnd, ujoyid.toInt(), uperiod.toInt(), fchanged).toUInt()

public actual fun joySetThreshold(ujoyid: UInt, uthreshold: UInt): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_joySetThreshold(ujoyid.toInt(), uthreshold.toInt()).toUInt()

public actual fun mciDriverNotify(hwndcallback: HANDLE, wdeviceid: UInt, ustatus: UInt): BOOL =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mciDriverNotify(hwndcallback, wdeviceid.toInt(), ustatus.toInt())

public actual fun mciDriverYield(wdeviceid: UInt): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mciDriverYield(wdeviceid.toInt()).toUInt()

public actual fun mciFreeCommandResource(wtable: UInt): BOOL =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mciFreeCommandResource(wtable.toInt())

public actual fun mciGetCreatorTask(mciid: UInt): HTASK =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mciGetCreatorTask(mciid.toInt())

public actual fun mciGetDeviceIDA(pszdevice: PCSTR): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mciGetDeviceIDA(pszdevice).toUInt()

public actual fun mciGetDeviceIDFromElementIDA(dwelementid: UInt, lpstrtype: PCSTR): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mciGetDeviceIDFromElementIDA(dwelementid.toInt(), lpstrtype).toUInt()

public actual fun mciGetDeviceIDFromElementIDW(dwelementid: UInt, lpstrtype: PCWSTR): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mciGetDeviceIDFromElementIDW(dwelementid.toInt(), lpstrtype).toUInt()

public actual fun mciGetDeviceIDW(pszdevice: PCWSTR): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mciGetDeviceIDW(pszdevice).toUInt()

public actual fun mciGetDriverData(wdeviceid: UInt): ULong =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mciGetDriverData(wdeviceid.toInt()).toULong()

public actual fun mciGetErrorStringA(mcierr: UInt, psztext: PSTR, cchtext: UInt): BOOL =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mciGetErrorStringA(mcierr.toInt(), psztext, cchtext.toInt())

public actual fun mciGetErrorStringW(mcierr: UInt, psztext: PWSTR, cchtext: UInt): BOOL =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mciGetErrorStringW(mcierr.toInt(), psztext, cchtext.toInt())

public actual fun mciGetYieldProc(mciid: UInt, pdwyielddata: Long): YIELDPROC =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mciGetYieldProc(mciid.toInt(), pdwyielddata)

public actual fun mciLoadCommandResource(hinstance: HANDLE, lpresname: PCWSTR, wtype: UInt): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mciLoadCommandResource(hinstance, lpresname, wtype.toInt()).toUInt()

public actual fun mciSendCommandA(mciid: UInt, umsg: UInt, dwparam1: ULong, dwparam2: ULong): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mciSendCommandA(mciid.toInt(), umsg.toInt(), dwparam1.toLong(), dwparam2.toLong()).toUInt()

public actual fun mciSendCommandW(mciid: UInt, umsg: UInt, dwparam1: ULong, dwparam2: ULong): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mciSendCommandW(mciid.toInt(), umsg.toInt(), dwparam1.toLong(), dwparam2.toLong()).toUInt()

public actual fun mciSendStringA(lpstrcommand: PCSTR, lpstrreturnstring: PSTR, ureturnlength: UInt, hwndcallback: HWND): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mciSendStringA(lpstrcommand, lpstrreturnstring, ureturnlength.toInt(), hwndcallback).toUInt()

public actual fun mciSendStringW(lpstrcommand: PCWSTR, lpstrreturnstring: PWSTR, ureturnlength: UInt, hwndcallback: HWND): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mciSendStringW(lpstrcommand, lpstrreturnstring, ureturnlength.toInt(), hwndcallback).toUInt()

public actual fun mciSetDriverData(wdeviceid: UInt, dwdata: ULong): BOOL =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mciSetDriverData(wdeviceid.toInt(), dwdata.toLong())

public actual fun mciSetYieldProc(mciid: UInt, fpyieldproc: YIELDPROC, dwyielddata: UInt): BOOL =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mciSetYieldProc(mciid.toInt(), fpyieldproc.toLong(), dwyielddata.toInt())

public actual fun mmDrvInstall(hdriver: HDRVR, wszdrventry: PCWSTR, drvmessage: DRIVERMSGPROC, wflags: UInt): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mmDrvInstall(hdriver, wszdrventry, drvmessage.toLong(), wflags.toInt()).toUInt()

public actual fun mmGetCurrentTask(): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mmGetCurrentTask().toUInt()

public actual fun mmTaskBlock(h: UInt) {
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mmTaskBlock(h.toInt())
}

public actual fun mmTaskCreate(lpfn: LPTASKCALLBACK, lph: Long, dwinst: ULong): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mmTaskCreate(lpfn.toLong(), lph, dwinst.toLong()).toUInt()

public actual fun mmTaskSignal(h: UInt): BOOL =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mmTaskSignal(h.toInt())

public actual fun mmTaskYield() {
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mmTaskYield()
}

public actual fun mmioAdvance(hmmio: HMMIO, pmmioinfo: Long, fuadvance: UInt): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mmioAdvance(hmmio, pmmioinfo, fuadvance.toInt()).toUInt()

public actual fun mmioAscend(hmmio: HMMIO, pmmcki: Long, fuascend: UInt): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mmioAscend(hmmio, pmmcki, fuascend.toInt()).toUInt()

public actual fun mmioClose(hmmio: HMMIO, fuclose: UInt): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mmioClose(hmmio, fuclose.toInt()).toUInt()

public actual fun mmioCreateChunk(hmmio: HMMIO, pmmcki: Long, fucreate: UInt): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mmioCreateChunk(hmmio, pmmcki, fucreate.toInt()).toUInt()

public actual fun mmioDescend(hmmio: HMMIO, pmmcki: Long, pmmckiparent: Long, fudescend: UInt): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mmioDescend(hmmio, pmmcki, pmmckiparent, fudescend.toInt()).toUInt()

public actual fun mmioFlush(hmmio: HMMIO, fuflush: UInt): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mmioFlush(hmmio, fuflush.toInt()).toUInt()

public actual fun mmioGetInfo(hmmio: HMMIO, pmmioinfo: Long, fuinfo: UInt): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mmioGetInfo(hmmio, pmmioinfo, fuinfo.toInt()).toUInt()

public actual fun mmioInstallIOProcA(fccioproc: UInt, pioproc: LPMMIOPROC, dwflags: UInt): LPMMIOPROC =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mmioInstallIOProcA(fccioproc.toInt(), pioproc.toLong(), dwflags.toInt())

public actual fun mmioInstallIOProcW(fccioproc: UInt, pioproc: LPMMIOPROC, dwflags: UInt): LPMMIOPROC =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mmioInstallIOProcW(fccioproc.toInt(), pioproc.toLong(), dwflags.toInt())

public actual fun mmioOpenA(pszfilename: PSTR, pmmioinfo: Long, fdwopen: UInt): HMMIO =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mmioOpenA(pszfilename, pmmioinfo, fdwopen.toInt())

public actual fun mmioOpenW(pszfilename: PWSTR, pmmioinfo: Long, fdwopen: UInt): HMMIO =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mmioOpenW(pszfilename, pmmioinfo, fdwopen.toInt())

public actual fun mmioRead(hmmio: HMMIO, pch: Long, cch: Int): Int =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mmioRead(hmmio, pch, cch)

public actual fun mmioRenameA(pszfilename: PCSTR, psznewfilename: PCSTR, pmmioinfo: Long, fdwrename: UInt): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mmioRenameA(pszfilename, psznewfilename, pmmioinfo, fdwrename.toInt()).toUInt()

public actual fun mmioRenameW(pszfilename: PCWSTR, psznewfilename: PCWSTR, pmmioinfo: Long, fdwrename: UInt): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mmioRenameW(pszfilename, psznewfilename, pmmioinfo, fdwrename.toInt()).toUInt()

public actual fun mmioSeek(hmmio: HMMIO, loffset: Int, iorigin: Int): Int =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mmioSeek(hmmio, loffset, iorigin)

public actual fun mmioSendMessage(hmmio: HMMIO, umsg: UInt, lparam1: LPARAM, lparam2: LPARAM): LRESULT =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mmioSendMessage(hmmio, umsg.toInt(), lparam1, lparam2)

public actual fun mmioSetBuffer(hmmio: HMMIO, pchbuffer: PSTR, cchbuffer: Int, fubuffer: UInt): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mmioSetBuffer(hmmio, pchbuffer, cchbuffer, fubuffer.toInt()).toUInt()

public actual fun mmioSetInfo(hmmio: HMMIO, pmmioinfo: Long, fuinfo: UInt): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mmioSetInfo(hmmio, pmmioinfo, fuinfo.toInt()).toUInt()

public actual fun mmioStringToFOURCCA(sz: PCSTR, uflags: UInt): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mmioStringToFOURCCA(sz, uflags.toInt()).toUInt()

public actual fun mmioStringToFOURCCW(sz: PCWSTR, uflags: UInt): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mmioStringToFOURCCW(sz, uflags.toInt()).toUInt()

public actual fun mmioWrite(hmmio: HMMIO, pch: PCSTR, cch: Int): Int =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mmioWrite(hmmio, pch, cch)

public actual fun sndOpenSound(eventname: PCWSTR, appname: PCWSTR, flags: Int, filehandle: Long): Int =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_sndOpenSound(eventname, appname, flags, filehandle)
