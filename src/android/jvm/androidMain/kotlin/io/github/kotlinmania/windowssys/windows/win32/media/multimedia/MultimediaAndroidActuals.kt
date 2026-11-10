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

private object WindowsWin32MediaMultimediaJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_aVIBuildFilterA(lpszfilter: Long, cbfilter: Int, fsaving: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_aVIBuildFilterW(lpszfilter: Long, cbfilter: Int, fsaving: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_aVIClearClipboard(): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_aVIFileAddRef(pfile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_aVIFileCreateStreamA(pfile: Long, ppavi: Long, psi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_aVIFileCreateStreamW(pfile: Long, ppavi: Long, psi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_aVIFileEndRecord(pfile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_aVIFileExit()

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_aVIFileGetStream(pfile: Long, ppavi: Long, fcctype: Int, lparam: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_aVIFileInfoA(pfile: Long, pfi: Long, lsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_aVIFileInfoW(pfile: Long, pfi: Long, lsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_aVIFileInit()

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_aVIFileOpenA(ppfile: Long, szfile: Long, umode: Int, lphandler: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_aVIFileOpenW(ppfile: Long, szfile: Long, umode: Int, lphandler: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_aVIFileReadData(pfile: Long, ckid: Int, lpdata: Long, lpcbdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_aVIFileRelease(pfile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_aVIFileWriteData(pfile: Long, ckid: Int, lpdata: Long, cbdata: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_aVIGetFromClipboard(lppf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_aVIMakeCompressedStream(ppscompressed: Long, ppssource: Long, lpoptions: Long, pclsidhandler: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_aVIMakeFileFromStreams(ppfile: Long, nstreams: Int, papstreams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_aVIMakeStreamFromClipboard(cfformat: Int, hglobal: Long, ppstream: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_aVIPutFileOnClipboard(pf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_aVISaveA(szfile: Long, pclsidhandler: Long, lpfncallback: Long, nstreams: Int, pfile: Long, lpoptions: Long, km_vac: Int, km_va0: Long, km_va1: Long, km_va2: Long, km_va3: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_aVISaveOptions(hwnd: Long, uiflags: Int, nstreams: Int, ppavi: Long, plpoptions: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_aVISaveOptionsFree(nstreams: Int, plpoptions: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_aVISaveVA(szfile: Long, pclsidhandler: Long, lpfncallback: Long, nstreams: Int, ppavi: Long, plpoptions: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_aVISaveVW(szfile: Long, pclsidhandler: Long, lpfncallback: Long, nstreams: Int, ppavi: Long, plpoptions: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_aVISaveW(szfile: Long, pclsidhandler: Long, lpfncallback: Long, nstreams: Int, pfile: Long, lpoptions: Long, km_vac: Int, km_va0: Long, km_va1: Long, km_va2: Long, km_va3: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_aVIStreamAddRef(pavi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_aVIStreamBeginStreaming(pavi: Long, lstart: Int, lend: Int, lrate: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_aVIStreamCreate(ppavi: Long, lparam1: Int, lparam2: Int, pclsidhandler: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_aVIStreamEndStreaming(pavi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_aVIStreamFindSample(pavi: Long, lpos: Int, lflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_aVIStreamGetFrame(pg: Long, lpos: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_aVIStreamGetFrameClose(pg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_aVIStreamGetFrameOpen(pavi: Long, lpbiwanted: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_aVIStreamInfoA(pavi: Long, psi: Long, lsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_aVIStreamInfoW(pavi: Long, psi: Long, lsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_aVIStreamLength(pavi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_aVIStreamOpenFromFileA(ppavi: Long, szfile: Long, fcctype: Int, lparam: Int, mode: Int, pclsidhandler: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_aVIStreamOpenFromFileW(ppavi: Long, szfile: Long, fcctype: Int, lparam: Int, mode: Int, pclsidhandler: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_aVIStreamRead(pavi: Long, lstart: Int, lsamples: Int, lpbuffer: Long, cbbuffer: Int, plbytes: Long, plsamples: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_aVIStreamReadData(pavi: Long, fcc: Int, lp: Long, lpcb: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_aVIStreamReadFormat(pavi: Long, lpos: Int, lpformat: Long, lpcbformat: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_aVIStreamRelease(pavi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_aVIStreamSampleToTime(pavi: Long, lsample: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_aVIStreamSetFormat(pavi: Long, lpos: Int, lpformat: Long, cbformat: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_aVIStreamStart(pavi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_aVIStreamTimeToSample(pavi: Long, ltime: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_aVIStreamWrite(pavi: Long, lstart: Int, lsamples: Int, lpbuffer: Long, cbbuffer: Int, dwflags: Int, plsampwritten: Long, plbyteswritten: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_aVIStreamWriteData(pavi: Long, fcc: Int, lp: Long, cb: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_closeDriver(hdriver: Long, lparam1: Long, lparam2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_createEditableStream(ppseditable: Long, pssource: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_defDriverProc(dwdriveridentifier: Long, hdrvr: Long, umsg: Int, lparam1: Long, lparam2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_drawDibBegin(hdd: Long, hdc: Long, dxdst: Int, dydst: Int, lpbi: Long, dxsrc: Int, dysrc: Int, wflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_drawDibChangePalette(hdd: Long, istart: Int, ilen: Int, lppe: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_drawDibClose(hdd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_drawDibDraw(hdd: Long, hdc: Long, xdst: Int, ydst: Int, dxdst: Int, dydst: Int, lpbi: Long, lpbits: Long, xsrc: Int, ysrc: Int, dxsrc: Int, dysrc: Int, wflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_drawDibEnd(hdd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_drawDibGetBuffer(hdd: Long, lpbi: Long, dwsize: Int, dwflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_drawDibGetPalette(hdd: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_drawDibOpen(): Long

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_drawDibProfileDisplay(lpbi: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_drawDibRealize(hdd: Long, hdc: Long, fbackground: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_drawDibSetPalette(hdd: Long, hpal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_drawDibStart(hdd: Long, rate: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_drawDibStop(hdd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_drawDibTime(hdd: Long, lpddtime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_driverCallback(dwcallback: Long, dwflags: Int, hdevice: Long, dwmsg: Int, dwuser: Long, dwparam1: Long, dwparam2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_drvGetModuleHandle(hdriver: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_editStreamClone(pavi: Long, ppresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_editStreamCopy(pavi: Long, plstart: Long, pllength: Long, ppresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_editStreamCut(pavi: Long, plstart: Long, pllength: Long, ppresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_editStreamPaste(pavi: Long, plpos: Long, pllength: Long, pstream: Long, lstart: Int, lend: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_editStreamSetInfoA(pavi: Long, lpinfo: Long, cbinfo: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_editStreamSetInfoW(pavi: Long, lpinfo: Long, cbinfo: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_editStreamSetNameA(pavi: Long, lpszname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_editStreamSetNameW(pavi: Long, lpszname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_getDriverModuleHandle(hdriver: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_getOpenFileNamePreviewA(lpofn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_getOpenFileNamePreviewW(lpofn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_getSaveFileNamePreviewA(lpofn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_getSaveFileNamePreviewW(lpofn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_iCClose(hic: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_iCCompress(hic: Long, dwflags: Int, lpbioutput: Long, lpdata: Long, lpbiinput: Long, lpbits: Long, lpckid: Long, lpdwflags: Long, lframenum: Int, dwframesize: Int, dwquality: Int, lpbiprev: Long, lpprev: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_iCCompressorChoose(hwnd: Long, uiflags: Int, pvin: Long, lpdata: Long, pc: Long, lpsztitle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_iCCompressorFree(pc: Long)

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_iCDecompress(hic: Long, dwflags: Int, lpbiformat: Long, lpdata: Long, lpbi: Long, lpbits: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_iCDraw(hic: Long, dwflags: Int, lpformat: Long, lpdata: Long, cbdata: Int, ltime: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_iCDrawBegin(hic: Long, dwflags: Int, hpal: Long, hwnd: Long, hdc: Long, xdst: Int, ydst: Int, dxdst: Int, dydst: Int, lpbi: Long, xsrc: Int, ysrc: Int, dxsrc: Int, dysrc: Int, dwrate: Int, dwscale: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_iCGetDisplayFormat(hic: Long, lpbiin: Long, lpbiout: Long, bitdepth: Int, dx: Int, dy: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_iCGetInfo(hic: Long, picinfo: Long, cb: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_iCImageCompress(hic: Long, uiflags: Int, lpbiin: Long, lpbits: Long, lpbiout: Long, lquality: Int, plsize: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_iCImageDecompress(hic: Long, uiflags: Int, lpbiin: Long, lpbits: Long, lpbiout: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_iCInfo(fcctype: Int, fcchandler: Int, lpicinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_iCInstall(fcctype: Int, fcchandler: Int, lparam: Long, szdesc: Long, wflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_iCLocate(fcctype: Int, fcchandler: Int, lpbiin: Long, lpbiout: Long, wflags: Short): Long

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_iCOpen(fcctype: Int, fcchandler: Int, wmode: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_iCRemove(fcctype: Int, fcchandler: Int, wflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_iCSendMessage(hic: Long, msg: Int, dw1: Long, dw2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_iCSeqCompressFrame(pc: Long, uiflags: Int, lpbits: Long, pfkey: Long, plsize: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_iCSeqCompressFrameEnd(pc: Long)

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_iCSeqCompressFrameStart(pc: Long, lpbiin: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_mCIWndCreateA(hwndparent: Long, hinstance: Long, dwstyle: Int, szfile: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_mCIWndCreateW(hwndparent: Long, hinstance: Long, dwstyle: Int, szfile: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_mCIWndRegisterClass(): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_openDriver(szdrivername: Long, szsectionname: Long, lparam2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_sendDriverMessage(hdriver: Long, message: Int, lparam1: Long, lparam2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_media_multimedia_videoForWindowsVersion(): Int

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

public actual fun aVIBuildFilterA(lpszfilter: Pstr, cbfilter: Int, fsaving: Bool): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_aVIBuildFilterA((lpszfilter?.value ?: 0L), cbfilter, fsaving)

public actual fun aVIBuildFilterW(lpszfilter: Pwstr, cbfilter: Int, fsaving: Bool): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_aVIBuildFilterW((lpszfilter?.value ?: 0L), cbfilter, fsaving)

public actual fun aVIClearClipboard(): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_aVIClearClipboard()

public actual fun aVIFileAddRef(pfile: COpaquePointer?): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_aVIFileAddRef((pfile?.value ?: 0L)).toUInt()

public actual fun aVIFileCreateStreamA(pfile: COpaquePointer?, ppavi: COpaquePointer?, psi: COpaquePointer?): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_aVIFileCreateStreamA((pfile?.value ?: 0L), (ppavi?.value ?: 0L), (psi?.value ?: 0L))

public actual fun aVIFileCreateStreamW(pfile: COpaquePointer?, ppavi: COpaquePointer?, psi: COpaquePointer?): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_aVIFileCreateStreamW((pfile?.value ?: 0L), (ppavi?.value ?: 0L), (psi?.value ?: 0L))

public actual fun aVIFileEndRecord(pfile: COpaquePointer?): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_aVIFileEndRecord((pfile?.value ?: 0L))

public actual fun aVIFileExit() {
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_aVIFileExit()
}

public actual fun aVIFileGetStream(pfile: COpaquePointer?, ppavi: COpaquePointer?, fcctype: UInt, lparam: Int): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_aVIFileGetStream((pfile?.value ?: 0L), (ppavi?.value ?: 0L), fcctype.toInt(), lparam)

public actual fun aVIFileInfoA(pfile: COpaquePointer?, pfi: COpaquePointer?, lsize: Int): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_aVIFileInfoA((pfile?.value ?: 0L), (pfi?.value ?: 0L), lsize)

public actual fun aVIFileInfoW(pfile: COpaquePointer?, pfi: COpaquePointer?, lsize: Int): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_aVIFileInfoW((pfile?.value ?: 0L), (pfi?.value ?: 0L), lsize)

public actual fun aVIFileInit() {
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_aVIFileInit()
}

public actual fun aVIFileOpenA(ppfile: COpaquePointer?, szfile: Pcstr, umode: UInt, lphandler: COpaquePointer?): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_aVIFileOpenA((ppfile?.value ?: 0L), (szfile?.value ?: 0L), umode.toInt(), (lphandler?.value ?: 0L))

public actual fun aVIFileOpenW(ppfile: COpaquePointer?, szfile: Pcwstr, umode: UInt, lphandler: COpaquePointer?): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_aVIFileOpenW((ppfile?.value ?: 0L), (szfile?.value ?: 0L), umode.toInt(), (lphandler?.value ?: 0L))

public actual fun aVIFileReadData(pfile: COpaquePointer?, ckid: UInt, lpdata: COpaquePointer?, lpcbdata: COpaquePointer?): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_aVIFileReadData((pfile?.value ?: 0L), ckid.toInt(), (lpdata?.value ?: 0L), (lpcbdata?.value ?: 0L))

public actual fun aVIFileRelease(pfile: COpaquePointer?): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_aVIFileRelease((pfile?.value ?: 0L)).toUInt()

public actual fun aVIFileWriteData(pfile: COpaquePointer?, ckid: UInt, lpdata: COpaquePointer?, cbdata: Int): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_aVIFileWriteData((pfile?.value ?: 0L), ckid.toInt(), (lpdata?.value ?: 0L), cbdata)

public actual fun aVIGetFromClipboard(lppf: COpaquePointer?): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_aVIGetFromClipboard((lppf?.value ?: 0L))

public actual fun aVIMakeCompressedStream(ppscompressed: COpaquePointer?, ppssource: COpaquePointer?, lpoptions: COpaquePointer?, pclsidhandler: COpaquePointer?): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_aVIMakeCompressedStream((ppscompressed?.value ?: 0L), (ppssource?.value ?: 0L), (lpoptions?.value ?: 0L), (pclsidhandler?.value ?: 0L))

public actual fun aVIMakeFileFromStreams(ppfile: COpaquePointer?, nstreams: Int, papstreams: COpaquePointer?): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_aVIMakeFileFromStreams((ppfile?.value ?: 0L), nstreams, (papstreams?.value ?: 0L))

public actual fun aVIMakeStreamFromClipboard(cfformat: UInt, hglobal: Handle, ppstream: COpaquePointer?): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_aVIMakeStreamFromClipboard(cfformat.toInt(), (hglobal?.value ?: 0L), (ppstream?.value ?: 0L))

public actual fun aVIPutFileOnClipboard(pf: COpaquePointer?): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_aVIPutFileOnClipboard((pf?.value ?: 0L))

public actual fun aVISaveA(szfile: Pcstr, pclsidhandler: COpaquePointer?, lpfncallback: Avisavecallback, nstreams: Int, pfile: COpaquePointer?, lpoptions: COpaquePointer?, vararg variadicArgs: Long): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_aVISaveA((szfile?.value ?: 0L), (pclsidhandler?.value ?: 0L), 0L, nstreams, (pfile?.value ?: 0L), (lpoptions?.value ?: 0L), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun aVISaveOptions(hwnd: Hwnd, uiflags: UInt, nstreams: Int, ppavi: COpaquePointer?, plpoptions: COpaquePointer?): Long =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_aVISaveOptions((hwnd?.value ?: 0L), uiflags.toInt(), nstreams, (ppavi?.value ?: 0L), (plpoptions?.value ?: 0L))

public actual fun aVISaveOptionsFree(nstreams: Int, plpoptions: COpaquePointer?): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_aVISaveOptionsFree(nstreams, (plpoptions?.value ?: 0L))

public actual fun aVISaveVA(szfile: Pcstr, pclsidhandler: COpaquePointer?, lpfncallback: Avisavecallback, nstreams: Int, ppavi: COpaquePointer?, plpoptions: COpaquePointer?): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_aVISaveVA((szfile?.value ?: 0L), (pclsidhandler?.value ?: 0L), 0L, nstreams, (ppavi?.value ?: 0L), (plpoptions?.value ?: 0L))

public actual fun aVISaveVW(szfile: Pcwstr, pclsidhandler: COpaquePointer?, lpfncallback: Avisavecallback, nstreams: Int, ppavi: COpaquePointer?, plpoptions: COpaquePointer?): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_aVISaveVW((szfile?.value ?: 0L), (pclsidhandler?.value ?: 0L), 0L, nstreams, (ppavi?.value ?: 0L), (plpoptions?.value ?: 0L))

public actual fun aVISaveW(szfile: Pcwstr, pclsidhandler: COpaquePointer?, lpfncallback: Avisavecallback, nstreams: Int, pfile: COpaquePointer?, lpoptions: COpaquePointer?, vararg variadicArgs: Long): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_aVISaveW((szfile?.value ?: 0L), (pclsidhandler?.value ?: 0L), 0L, nstreams, (pfile?.value ?: 0L), (lpoptions?.value ?: 0L), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun aVIStreamAddRef(pavi: COpaquePointer?): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_aVIStreamAddRef((pavi?.value ?: 0L)).toUInt()

public actual fun aVIStreamBeginStreaming(pavi: COpaquePointer?, lstart: Int, lend: Int, lrate: Int): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_aVIStreamBeginStreaming((pavi?.value ?: 0L), lstart, lend, lrate)

public actual fun aVIStreamCreate(ppavi: COpaquePointer?, lparam1: Int, lparam2: Int, pclsidhandler: COpaquePointer?): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_aVIStreamCreate((ppavi?.value ?: 0L), lparam1, lparam2, (pclsidhandler?.value ?: 0L))

public actual fun aVIStreamEndStreaming(pavi: COpaquePointer?): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_aVIStreamEndStreaming((pavi?.value ?: 0L))

public actual fun aVIStreamFindSample(pavi: COpaquePointer?, lpos: Int, lflags: Int): Int =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_aVIStreamFindSample((pavi?.value ?: 0L), lpos, lflags)

public actual fun aVIStreamGetFrame(pg: COpaquePointer?, lpos: Int): COpaquePointer? =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_aVIStreamGetFrame((pg?.value ?: 0L), lpos).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun aVIStreamGetFrameClose(pg: COpaquePointer?): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_aVIStreamGetFrameClose((pg?.value ?: 0L))

public actual fun aVIStreamGetFrameOpen(pavi: COpaquePointer?, lpbiwanted: COpaquePointer?): COpaquePointer? =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_aVIStreamGetFrameOpen((pavi?.value ?: 0L), (lpbiwanted?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun aVIStreamInfoA(pavi: COpaquePointer?, psi: COpaquePointer?, lsize: Int): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_aVIStreamInfoA((pavi?.value ?: 0L), (psi?.value ?: 0L), lsize)

public actual fun aVIStreamInfoW(pavi: COpaquePointer?, psi: COpaquePointer?, lsize: Int): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_aVIStreamInfoW((pavi?.value ?: 0L), (psi?.value ?: 0L), lsize)

public actual fun aVIStreamLength(pavi: COpaquePointer?): Int =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_aVIStreamLength((pavi?.value ?: 0L))

public actual fun aVIStreamOpenFromFileA(ppavi: COpaquePointer?, szfile: Pcstr, fcctype: UInt, lparam: Int, mode: UInt, pclsidhandler: COpaquePointer?): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_aVIStreamOpenFromFileA((ppavi?.value ?: 0L), (szfile?.value ?: 0L), fcctype.toInt(), lparam, mode.toInt(), (pclsidhandler?.value ?: 0L))

public actual fun aVIStreamOpenFromFileW(ppavi: COpaquePointer?, szfile: Pcwstr, fcctype: UInt, lparam: Int, mode: UInt, pclsidhandler: COpaquePointer?): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_aVIStreamOpenFromFileW((ppavi?.value ?: 0L), (szfile?.value ?: 0L), fcctype.toInt(), lparam, mode.toInt(), (pclsidhandler?.value ?: 0L))

public actual fun aVIStreamRead(pavi: COpaquePointer?, lstart: Int, lsamples: Int, lpbuffer: COpaquePointer?, cbbuffer: Int, plbytes: COpaquePointer?, plsamples: COpaquePointer?): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_aVIStreamRead((pavi?.value ?: 0L), lstart, lsamples, (lpbuffer?.value ?: 0L), cbbuffer, (plbytes?.value ?: 0L), (plsamples?.value ?: 0L))

public actual fun aVIStreamReadData(pavi: COpaquePointer?, fcc: UInt, lp: COpaquePointer?, lpcb: COpaquePointer?): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_aVIStreamReadData((pavi?.value ?: 0L), fcc.toInt(), (lp?.value ?: 0L), (lpcb?.value ?: 0L))

public actual fun aVIStreamReadFormat(pavi: COpaquePointer?, lpos: Int, lpformat: COpaquePointer?, lpcbformat: COpaquePointer?): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_aVIStreamReadFormat((pavi?.value ?: 0L), lpos, (lpformat?.value ?: 0L), (lpcbformat?.value ?: 0L))

public actual fun aVIStreamRelease(pavi: COpaquePointer?): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_aVIStreamRelease((pavi?.value ?: 0L)).toUInt()

public actual fun aVIStreamSampleToTime(pavi: COpaquePointer?, lsample: Int): Int =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_aVIStreamSampleToTime((pavi?.value ?: 0L), lsample)

public actual fun aVIStreamSetFormat(pavi: COpaquePointer?, lpos: Int, lpformat: COpaquePointer?, cbformat: Int): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_aVIStreamSetFormat((pavi?.value ?: 0L), lpos, (lpformat?.value ?: 0L), cbformat)

public actual fun aVIStreamStart(pavi: COpaquePointer?): Int =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_aVIStreamStart((pavi?.value ?: 0L))

public actual fun aVIStreamTimeToSample(pavi: COpaquePointer?, ltime: Int): Int =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_aVIStreamTimeToSample((pavi?.value ?: 0L), ltime)

public actual fun aVIStreamWrite(pavi: COpaquePointer?, lstart: Int, lsamples: Int, lpbuffer: COpaquePointer?, cbbuffer: Int, dwflags: UInt, plsampwritten: COpaquePointer?, plbyteswritten: COpaquePointer?): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_aVIStreamWrite((pavi?.value ?: 0L), lstart, lsamples, (lpbuffer?.value ?: 0L), cbbuffer, dwflags.toInt(), (plsampwritten?.value ?: 0L), (plbyteswritten?.value ?: 0L))

public actual fun aVIStreamWriteData(pavi: COpaquePointer?, fcc: UInt, lp: COpaquePointer?, cb: Int): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_aVIStreamWriteData((pavi?.value ?: 0L), fcc.toInt(), (lp?.value ?: 0L), cb)

public actual fun closeDriver(hdriver: Hdrvr, lparam1: Lparam, lparam2: Lparam): Lresult =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_closeDriver((hdriver?.value ?: 0L), lparam1, lparam2)

public actual fun createEditableStream(ppseditable: COpaquePointer?, pssource: COpaquePointer?): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_createEditableStream((ppseditable?.value ?: 0L), (pssource?.value ?: 0L))

public actual fun defDriverProc(dwdriveridentifier: ULong, hdrvr: Hdrvr, umsg: UInt, lparam1: Lparam, lparam2: Lparam): Lresult =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_defDriverProc(dwdriveridentifier.toLong(), (hdrvr?.value ?: 0L), umsg.toInt(), lparam1, lparam2)

public actual fun drawDibBegin(hdd: Long, hdc: Hdc, dxdst: Int, dydst: Int, lpbi: COpaquePointer?, dxsrc: Int, dysrc: Int, wflags: UInt): Bool =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_drawDibBegin(hdd, (hdc?.value ?: 0L), dxdst, dydst, (lpbi?.value ?: 0L), dxsrc, dysrc, wflags.toInt())

public actual fun drawDibChangePalette(hdd: Long, istart: Int, ilen: Int, lppe: COpaquePointer?): Bool =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_drawDibChangePalette(hdd, istart, ilen, (lppe?.value ?: 0L))

public actual fun drawDibClose(hdd: Long): Bool =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_drawDibClose(hdd)

public actual fun drawDibDraw(hdd: Long, hdc: Hdc, xdst: Int, ydst: Int, dxdst: Int, dydst: Int, lpbi: COpaquePointer?, lpbits: COpaquePointer?, xsrc: Int, ysrc: Int, dxsrc: Int, dysrc: Int, wflags: UInt): Bool =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_drawDibDraw(hdd, (hdc?.value ?: 0L), xdst, ydst, dxdst, dydst, (lpbi?.value ?: 0L), (lpbits?.value ?: 0L), xsrc, ysrc, dxsrc, dysrc, wflags.toInt())

public actual fun drawDibEnd(hdd: Long): Bool =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_drawDibEnd(hdd)

public actual fun drawDibGetBuffer(hdd: Long, lpbi: COpaquePointer?, dwsize: UInt, dwflags: UInt): COpaquePointer? =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_drawDibGetBuffer(hdd, (lpbi?.value ?: 0L), dwsize.toInt(), dwflags.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun drawDibGetPalette(hdd: Long): Hpalette =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_drawDibGetPalette(hdd).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun drawDibOpen(): Long =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_drawDibOpen()

public actual fun drawDibProfileDisplay(lpbi: COpaquePointer?): Lresult =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_drawDibProfileDisplay((lpbi?.value ?: 0L))

public actual fun drawDibRealize(hdd: Long, hdc: Hdc, fbackground: Bool): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_drawDibRealize(hdd, (hdc?.value ?: 0L), fbackground).toUInt()

public actual fun drawDibSetPalette(hdd: Long, hpal: Hpalette): Bool =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_drawDibSetPalette(hdd, (hpal?.value ?: 0L))

public actual fun drawDibStart(hdd: Long, rate: UInt): Bool =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_drawDibStart(hdd, rate.toInt())

public actual fun drawDibStop(hdd: Long): Bool =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_drawDibStop(hdd)

public actual fun drawDibTime(hdd: Long, lpddtime: COpaquePointer?): Bool =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_drawDibTime(hdd, (lpddtime?.value ?: 0L))

public actual fun driverCallback(dwcallback: ULong, dwflags: UInt, hdevice: Hdrvr, dwmsg: UInt, dwuser: ULong, dwparam1: ULong, dwparam2: ULong): Bool =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_driverCallback(dwcallback.toLong(), dwflags.toInt(), (hdevice?.value ?: 0L), dwmsg.toInt(), dwuser.toLong(), dwparam1.toLong(), dwparam2.toLong())

public actual fun drvGetModuleHandle(hdriver: Hdrvr): Hmodule =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_drvGetModuleHandle((hdriver?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun editStreamClone(pavi: COpaquePointer?, ppresult: COpaquePointer?): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_editStreamClone((pavi?.value ?: 0L), (ppresult?.value ?: 0L))

public actual fun editStreamCopy(pavi: COpaquePointer?, plstart: COpaquePointer?, pllength: COpaquePointer?, ppresult: COpaquePointer?): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_editStreamCopy((pavi?.value ?: 0L), (plstart?.value ?: 0L), (pllength?.value ?: 0L), (ppresult?.value ?: 0L))

public actual fun editStreamCut(pavi: COpaquePointer?, plstart: COpaquePointer?, pllength: COpaquePointer?, ppresult: COpaquePointer?): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_editStreamCut((pavi?.value ?: 0L), (plstart?.value ?: 0L), (pllength?.value ?: 0L), (ppresult?.value ?: 0L))

public actual fun editStreamPaste(pavi: COpaquePointer?, plpos: COpaquePointer?, pllength: COpaquePointer?, pstream: COpaquePointer?, lstart: Int, lend: Int): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_editStreamPaste((pavi?.value ?: 0L), (plpos?.value ?: 0L), (pllength?.value ?: 0L), (pstream?.value ?: 0L), lstart, lend)

public actual fun editStreamSetInfoA(pavi: COpaquePointer?, lpinfo: COpaquePointer?, cbinfo: Int): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_editStreamSetInfoA((pavi?.value ?: 0L), (lpinfo?.value ?: 0L), cbinfo)

public actual fun editStreamSetInfoW(pavi: COpaquePointer?, lpinfo: COpaquePointer?, cbinfo: Int): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_editStreamSetInfoW((pavi?.value ?: 0L), (lpinfo?.value ?: 0L), cbinfo)

public actual fun editStreamSetNameA(pavi: COpaquePointer?, lpszname: Pcstr): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_editStreamSetNameA((pavi?.value ?: 0L), (lpszname?.value ?: 0L))

public actual fun editStreamSetNameW(pavi: COpaquePointer?, lpszname: Pcwstr): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_editStreamSetNameW((pavi?.value ?: 0L), (lpszname?.value ?: 0L))

public actual fun getDriverModuleHandle(hdriver: Hdrvr): Hmodule =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_getDriverModuleHandle((hdriver?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getOpenFileNamePreviewA(lpofn: COpaquePointer?): Bool =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_getOpenFileNamePreviewA((lpofn?.value ?: 0L))

public actual fun getOpenFileNamePreviewW(lpofn: COpaquePointer?): Bool =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_getOpenFileNamePreviewW((lpofn?.value ?: 0L))

public actual fun getSaveFileNamePreviewA(lpofn: COpaquePointer?): Bool =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_getSaveFileNamePreviewA((lpofn?.value ?: 0L))

public actual fun getSaveFileNamePreviewW(lpofn: COpaquePointer?): Bool =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_getSaveFileNamePreviewW((lpofn?.value ?: 0L))

public actual fun iCClose(hic: Hic): Lresult =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_iCClose((hic?.value ?: 0L))

public actual fun iCCompress(hic: Hic, dwflags: UInt, lpbioutput: COpaquePointer?, lpdata: COpaquePointer?, lpbiinput: COpaquePointer?, lpbits: COpaquePointer?, lpckid: COpaquePointer?, lpdwflags: COpaquePointer?, lframenum: Int, dwframesize: UInt, dwquality: UInt, lpbiprev: COpaquePointer?, lpprev: COpaquePointer?): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_iCCompress((hic?.value ?: 0L), dwflags.toInt(), (lpbioutput?.value ?: 0L), (lpdata?.value ?: 0L), (lpbiinput?.value ?: 0L), (lpbits?.value ?: 0L), (lpckid?.value ?: 0L), (lpdwflags?.value ?: 0L), lframenum, dwframesize.toInt(), dwquality.toInt(), (lpbiprev?.value ?: 0L), (lpprev?.value ?: 0L)).toUInt()

public actual fun iCCompressorChoose(hwnd: Hwnd, uiflags: UInt, pvin: COpaquePointer?, lpdata: COpaquePointer?, pc: COpaquePointer?, lpsztitle: Pcstr): Bool =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_iCCompressorChoose((hwnd?.value ?: 0L), uiflags.toInt(), (pvin?.value ?: 0L), (lpdata?.value ?: 0L), (pc?.value ?: 0L), (lpsztitle?.value ?: 0L))

public actual fun iCCompressorFree(pc: COpaquePointer?) {
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_iCCompressorFree((pc?.value ?: 0L))
}

public actual fun iCDecompress(hic: Hic, dwflags: UInt, lpbiformat: COpaquePointer?, lpdata: COpaquePointer?, lpbi: COpaquePointer?, lpbits: COpaquePointer?): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_iCDecompress((hic?.value ?: 0L), dwflags.toInt(), (lpbiformat?.value ?: 0L), (lpdata?.value ?: 0L), (lpbi?.value ?: 0L), (lpbits?.value ?: 0L)).toUInt()

public actual fun iCDraw(hic: Hic, dwflags: UInt, lpformat: COpaquePointer?, lpdata: COpaquePointer?, cbdata: UInt, ltime: Int): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_iCDraw((hic?.value ?: 0L), dwflags.toInt(), (lpformat?.value ?: 0L), (lpdata?.value ?: 0L), cbdata.toInt(), ltime).toUInt()

public actual fun iCDrawBegin(hic: Hic, dwflags: UInt, hpal: Hpalette, hwnd: Hwnd, hdc: Hdc, xdst: Int, ydst: Int, dxdst: Int, dydst: Int, lpbi: COpaquePointer?, xsrc: Int, ysrc: Int, dxsrc: Int, dysrc: Int, dwrate: UInt, dwscale: UInt): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_iCDrawBegin((hic?.value ?: 0L), dwflags.toInt(), (hpal?.value ?: 0L), (hwnd?.value ?: 0L), (hdc?.value ?: 0L), xdst, ydst, dxdst, dydst, (lpbi?.value ?: 0L), xsrc, ysrc, dxsrc, dysrc, dwrate.toInt(), dwscale.toInt()).toUInt()

public actual fun iCGetDisplayFormat(hic: Hic, lpbiin: COpaquePointer?, lpbiout: COpaquePointer?, bitdepth: Int, dx: Int, dy: Int): Hic =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_iCGetDisplayFormat((hic?.value ?: 0L), (lpbiin?.value ?: 0L), (lpbiout?.value ?: 0L), bitdepth, dx, dy).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun iCGetInfo(hic: Hic, picinfo: COpaquePointer?, cb: UInt): Lresult =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_iCGetInfo((hic?.value ?: 0L), (picinfo?.value ?: 0L), cb.toInt())

public actual fun iCImageCompress(hic: Hic, uiflags: UInt, lpbiin: COpaquePointer?, lpbits: COpaquePointer?, lpbiout: COpaquePointer?, lquality: Int, plsize: COpaquePointer?): Handle =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_iCImageCompress((hic?.value ?: 0L), uiflags.toInt(), (lpbiin?.value ?: 0L), (lpbits?.value ?: 0L), (lpbiout?.value ?: 0L), lquality, (plsize?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun iCImageDecompress(hic: Hic, uiflags: UInt, lpbiin: COpaquePointer?, lpbits: COpaquePointer?, lpbiout: COpaquePointer?): Handle =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_iCImageDecompress((hic?.value ?: 0L), uiflags.toInt(), (lpbiin?.value ?: 0L), (lpbits?.value ?: 0L), (lpbiout?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun iCInfo(fcctype: UInt, fcchandler: UInt, lpicinfo: COpaquePointer?): Bool =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_iCInfo(fcctype.toInt(), fcchandler.toInt(), (lpicinfo?.value ?: 0L))

public actual fun iCInstall(fcctype: UInt, fcchandler: UInt, lparam: Lparam, szdesc: Pcstr, wflags: UInt): Bool =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_iCInstall(fcctype.toInt(), fcchandler.toInt(), lparam, (szdesc?.value ?: 0L), wflags.toInt())

public actual fun iCLocate(fcctype: UInt, fcchandler: UInt, lpbiin: COpaquePointer?, lpbiout: COpaquePointer?, wflags: UShort): Hic =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_iCLocate(fcctype.toInt(), fcchandler.toInt(), (lpbiin?.value ?: 0L), (lpbiout?.value ?: 0L), wflags.toShort()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun iCOpen(fcctype: UInt, fcchandler: UInt, wmode: UInt): Hic =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_iCOpen(fcctype.toInt(), fcchandler.toInt(), wmode.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun iCOpenFunction(fcctype: UInt, fcchandler: UInt, wmode: UInt, lpfnhandler: Farproc): Hic =
    null

public actual fun iCRemove(fcctype: UInt, fcchandler: UInt, wflags: UInt): Bool =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_iCRemove(fcctype.toInt(), fcchandler.toInt(), wflags.toInt())

public actual fun iCSendMessage(hic: Hic, msg: UInt, dw1: ULong, dw2: ULong): Lresult =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_iCSendMessage((hic?.value ?: 0L), msg.toInt(), dw1.toLong(), dw2.toLong())

public actual fun iCSeqCompressFrame(pc: COpaquePointer?, uiflags: UInt, lpbits: COpaquePointer?, pfkey: COpaquePointer?, plsize: COpaquePointer?): COpaquePointer? =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_iCSeqCompressFrame((pc?.value ?: 0L), uiflags.toInt(), (lpbits?.value ?: 0L), (pfkey?.value ?: 0L), (plsize?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun iCSeqCompressFrameEnd(pc: COpaquePointer?) {
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_iCSeqCompressFrameEnd((pc?.value ?: 0L))
}

public actual fun iCSeqCompressFrameStart(pc: COpaquePointer?, lpbiin: COpaquePointer?): Bool =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_iCSeqCompressFrameStart((pc?.value ?: 0L), (lpbiin?.value ?: 0L))

public actual fun mCIWndCreateA(hwndparent: Hwnd, hinstance: Hinstance, dwstyle: UInt, szfile: Pcstr): Hwnd =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mCIWndCreateA((hwndparent?.value ?: 0L), (hinstance?.value ?: 0L), dwstyle.toInt(), (szfile?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mCIWndCreateW(hwndparent: Hwnd, hinstance: Hinstance, dwstyle: UInt, szfile: Pcwstr): Hwnd =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mCIWndCreateW((hwndparent?.value ?: 0L), (hinstance?.value ?: 0L), dwstyle.toInt(), (szfile?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mCIWndRegisterClass(): Bool =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mCIWndRegisterClass()

public actual fun openDriver(szdrivername: Pcwstr, szsectionname: Pcwstr, lparam2: Lparam): Hdrvr =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_openDriver((szdrivername?.value ?: 0L), (szsectionname?.value ?: 0L), lparam2).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun sendDriverMessage(hdriver: Hdrvr, message: UInt, lparam1: Lparam, lparam2: Lparam): Lresult =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_sendDriverMessage((hdriver?.value ?: 0L), message.toInt(), lparam1, lparam2)

public actual fun videoForWindowsVersion(): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_videoForWindowsVersion().toUInt()

public actual fun capCreateCaptureWindowA(lpszwindowname: Pcstr, dwstyle: UInt, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: Hwnd, nid: Int): Hwnd =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_capCreateCaptureWindowA((lpszwindowname?.value ?: 0L), dwstyle.toInt(), x, y, nwidth, nheight, (hwndparent?.value ?: 0L), nid).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun capCreateCaptureWindowW(lpszwindowname: Pcwstr, dwstyle: UInt, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: Hwnd, nid: Int): Hwnd =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_capCreateCaptureWindowW((lpszwindowname?.value ?: 0L), dwstyle.toInt(), x, y, nwidth, nheight, (hwndparent?.value ?: 0L), nid).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun capGetDriverDescriptionA(wdriverindex: UInt, lpszname: Pstr, cbname: Int, lpszver: Pstr, cbver: Int): Bool =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_capGetDriverDescriptionA(wdriverindex.toInt(), (lpszname?.value ?: 0L), cbname, (lpszver?.value ?: 0L), cbver)

public actual fun capGetDriverDescriptionW(wdriverindex: UInt, lpszname: Pwstr, cbname: Int, lpszver: Pwstr, cbver: Int): Bool =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_capGetDriverDescriptionW(wdriverindex.toInt(), (lpszname?.value ?: 0L), cbname, (lpszver?.value ?: 0L), cbver)

public actual fun joyGetDevCapsA(ujoyid: ULong, pjc: COpaquePointer?, cbjc: UInt): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_joyGetDevCapsA(ujoyid.toLong(), (pjc?.value ?: 0L), cbjc.toInt()).toUInt()

public actual fun joyGetDevCapsW(ujoyid: ULong, pjc: COpaquePointer?, cbjc: UInt): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_joyGetDevCapsW(ujoyid.toLong(), (pjc?.value ?: 0L), cbjc.toInt()).toUInt()

public actual fun joyGetNumDevs(): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_joyGetNumDevs().toUInt()

public actual fun joyGetPos(ujoyid: UInt, pji: COpaquePointer?): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_joyGetPos(ujoyid.toInt(), (pji?.value ?: 0L)).toUInt()

public actual fun joyGetPosEx(ujoyid: UInt, pji: COpaquePointer?): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_joyGetPosEx(ujoyid.toInt(), (pji?.value ?: 0L)).toUInt()

public actual fun joyGetThreshold(ujoyid: UInt, puthreshold: COpaquePointer?): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_joyGetThreshold(ujoyid.toInt(), (puthreshold?.value ?: 0L)).toUInt()

public actual fun joyReleaseCapture(ujoyid: UInt): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_joyReleaseCapture(ujoyid.toInt()).toUInt()

public actual fun joySetCapture(hwnd: Hwnd, ujoyid: UInt, uperiod: UInt, fchanged: Bool): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_joySetCapture((hwnd?.value ?: 0L), ujoyid.toInt(), uperiod.toInt(), fchanged).toUInt()

public actual fun joySetThreshold(ujoyid: UInt, uthreshold: UInt): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_joySetThreshold(ujoyid.toInt(), uthreshold.toInt()).toUInt()

public actual fun mciDriverNotify(hwndcallback: Handle, wdeviceid: UInt, ustatus: UInt): Bool =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mciDriverNotify((hwndcallback?.value ?: 0L), wdeviceid.toInt(), ustatus.toInt())

public actual fun mciDriverYield(wdeviceid: UInt): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mciDriverYield(wdeviceid.toInt()).toUInt()

public actual fun mciFreeCommandResource(wtable: UInt): Bool =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mciFreeCommandResource(wtable.toInt())

public actual fun mciGetCreatorTask(mciid: UInt): Htask =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mciGetCreatorTask(mciid.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mciGetDeviceIDA(pszdevice: Pcstr): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mciGetDeviceIDA((pszdevice?.value ?: 0L)).toUInt()

public actual fun mciGetDeviceIDFromElementIDA(dwelementid: UInt, lpstrtype: Pcstr): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mciGetDeviceIDFromElementIDA(dwelementid.toInt(), (lpstrtype?.value ?: 0L)).toUInt()

public actual fun mciGetDeviceIDFromElementIDW(dwelementid: UInt, lpstrtype: Pcwstr): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mciGetDeviceIDFromElementIDW(dwelementid.toInt(), (lpstrtype?.value ?: 0L)).toUInt()

public actual fun mciGetDeviceIDW(pszdevice: Pcwstr): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mciGetDeviceIDW((pszdevice?.value ?: 0L)).toUInt()

public actual fun mciGetDriverData(wdeviceid: UInt): ULong =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mciGetDriverData(wdeviceid.toInt()).toULong()

public actual fun mciGetErrorStringA(mcierr: UInt, psztext: Pstr, cchtext: UInt): Bool =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mciGetErrorStringA(mcierr.toInt(), (psztext?.value ?: 0L), cchtext.toInt())

public actual fun mciGetErrorStringW(mcierr: UInt, psztext: Pwstr, cchtext: UInt): Bool =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mciGetErrorStringW(mcierr.toInt(), (psztext?.value ?: 0L), cchtext.toInt())

public actual fun mciGetYieldProc(mciid: UInt, pdwyielddata: COpaquePointer?): Yieldproc =
    null

public actual fun mciLoadCommandResource(hinstance: Handle, lpresname: Pcwstr, wtype: UInt): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mciLoadCommandResource((hinstance?.value ?: 0L), (lpresname?.value ?: 0L), wtype.toInt()).toUInt()

public actual fun mciSendCommandA(mciid: UInt, umsg: UInt, dwparam1: ULong, dwparam2: ULong): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mciSendCommandA(mciid.toInt(), umsg.toInt(), dwparam1.toLong(), dwparam2.toLong()).toUInt()

public actual fun mciSendCommandW(mciid: UInt, umsg: UInt, dwparam1: ULong, dwparam2: ULong): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mciSendCommandW(mciid.toInt(), umsg.toInt(), dwparam1.toLong(), dwparam2.toLong()).toUInt()

public actual fun mciSendStringA(lpstrcommand: Pcstr, lpstrreturnstring: Pstr, ureturnlength: UInt, hwndcallback: Hwnd): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mciSendStringA((lpstrcommand?.value ?: 0L), (lpstrreturnstring?.value ?: 0L), ureturnlength.toInt(), (hwndcallback?.value ?: 0L)).toUInt()

public actual fun mciSendStringW(lpstrcommand: Pcwstr, lpstrreturnstring: Pwstr, ureturnlength: UInt, hwndcallback: Hwnd): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mciSendStringW((lpstrcommand?.value ?: 0L), (lpstrreturnstring?.value ?: 0L), ureturnlength.toInt(), (hwndcallback?.value ?: 0L)).toUInt()

public actual fun mciSetDriverData(wdeviceid: UInt, dwdata: ULong): Bool =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mciSetDriverData(wdeviceid.toInt(), dwdata.toLong())

public actual fun mciSetYieldProc(mciid: UInt, fpyieldproc: Yieldproc, dwyielddata: UInt): Bool =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mciSetYieldProc(mciid.toInt(), 0L, dwyielddata.toInt())

public actual fun mmDrvInstall(hdriver: Hdrvr, wszdrventry: Pcwstr, drvmessage: Drivermsgproc, wflags: UInt): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mmDrvInstall((hdriver?.value ?: 0L), (wszdrventry?.value ?: 0L), 0L, wflags.toInt()).toUInt()

public actual fun mmGetCurrentTask(): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mmGetCurrentTask().toUInt()

public actual fun mmTaskBlock(h: UInt) {
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mmTaskBlock(h.toInt())
}

public actual fun mmTaskCreate(lpfn: Lptaskcallback, lph: COpaquePointer?, dwinst: ULong): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mmTaskCreate(0L, (lph?.value ?: 0L), dwinst.toLong()).toUInt()

public actual fun mmTaskSignal(h: UInt): Bool =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mmTaskSignal(h.toInt())

public actual fun mmTaskYield() {
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mmTaskYield()
}

public actual fun mmioAdvance(hmmio: Hmmio, pmmioinfo: COpaquePointer?, fuadvance: UInt): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mmioAdvance((hmmio?.value ?: 0L), (pmmioinfo?.value ?: 0L), fuadvance.toInt()).toUInt()

public actual fun mmioAscend(hmmio: Hmmio, pmmcki: COpaquePointer?, fuascend: UInt): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mmioAscend((hmmio?.value ?: 0L), (pmmcki?.value ?: 0L), fuascend.toInt()).toUInt()

public actual fun mmioClose(hmmio: Hmmio, fuclose: UInt): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mmioClose((hmmio?.value ?: 0L), fuclose.toInt()).toUInt()

public actual fun mmioCreateChunk(hmmio: Hmmio, pmmcki: COpaquePointer?, fucreate: UInt): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mmioCreateChunk((hmmio?.value ?: 0L), (pmmcki?.value ?: 0L), fucreate.toInt()).toUInt()

public actual fun mmioDescend(hmmio: Hmmio, pmmcki: COpaquePointer?, pmmckiparent: COpaquePointer?, fudescend: UInt): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mmioDescend((hmmio?.value ?: 0L), (pmmcki?.value ?: 0L), (pmmckiparent?.value ?: 0L), fudescend.toInt()).toUInt()

public actual fun mmioFlush(hmmio: Hmmio, fuflush: UInt): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mmioFlush((hmmio?.value ?: 0L), fuflush.toInt()).toUInt()

public actual fun mmioGetInfo(hmmio: Hmmio, pmmioinfo: COpaquePointer?, fuinfo: UInt): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mmioGetInfo((hmmio?.value ?: 0L), (pmmioinfo?.value ?: 0L), fuinfo.toInt()).toUInt()

public actual fun mmioInstallIOProcA(fccioproc: UInt, pioproc: Lpmmioproc, dwflags: UInt): Lpmmioproc =
    null

public actual fun mmioInstallIOProcW(fccioproc: UInt, pioproc: Lpmmioproc, dwflags: UInt): Lpmmioproc =
    null

public actual fun mmioOpenA(pszfilename: Pstr, pmmioinfo: COpaquePointer?, fdwopen: UInt): Hmmio =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mmioOpenA((pszfilename?.value ?: 0L), (pmmioinfo?.value ?: 0L), fdwopen.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mmioOpenW(pszfilename: Pwstr, pmmioinfo: COpaquePointer?, fdwopen: UInt): Hmmio =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mmioOpenW((pszfilename?.value ?: 0L), (pmmioinfo?.value ?: 0L), fdwopen.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mmioRead(hmmio: Hmmio, pch: COpaquePointer?, cch: Int): Int =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mmioRead((hmmio?.value ?: 0L), (pch?.value ?: 0L), cch)

public actual fun mmioRenameA(pszfilename: Pcstr, psznewfilename: Pcstr, pmmioinfo: COpaquePointer?, fdwrename: UInt): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mmioRenameA((pszfilename?.value ?: 0L), (psznewfilename?.value ?: 0L), (pmmioinfo?.value ?: 0L), fdwrename.toInt()).toUInt()

public actual fun mmioRenameW(pszfilename: Pcwstr, psznewfilename: Pcwstr, pmmioinfo: COpaquePointer?, fdwrename: UInt): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mmioRenameW((pszfilename?.value ?: 0L), (psznewfilename?.value ?: 0L), (pmmioinfo?.value ?: 0L), fdwrename.toInt()).toUInt()

public actual fun mmioSeek(hmmio: Hmmio, loffset: Int, iorigin: Int): Int =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mmioSeek((hmmio?.value ?: 0L), loffset, iorigin)

public actual fun mmioSendMessage(hmmio: Hmmio, umsg: UInt, lparam1: Lparam, lparam2: Lparam): Lresult =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mmioSendMessage((hmmio?.value ?: 0L), umsg.toInt(), lparam1, lparam2)

public actual fun mmioSetBuffer(hmmio: Hmmio, pchbuffer: Pstr, cchbuffer: Int, fubuffer: UInt): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mmioSetBuffer((hmmio?.value ?: 0L), (pchbuffer?.value ?: 0L), cchbuffer, fubuffer.toInt()).toUInt()

public actual fun mmioSetInfo(hmmio: Hmmio, pmmioinfo: COpaquePointer?, fuinfo: UInt): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mmioSetInfo((hmmio?.value ?: 0L), (pmmioinfo?.value ?: 0L), fuinfo.toInt()).toUInt()

public actual fun mmioStringToFOURCCA(sz: Pcstr, uflags: UInt): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mmioStringToFOURCCA((sz?.value ?: 0L), uflags.toInt()).toUInt()

public actual fun mmioStringToFOURCCW(sz: Pcwstr, uflags: UInt): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mmioStringToFOURCCW((sz?.value ?: 0L), uflags.toInt()).toUInt()

public actual fun mmioWrite(hmmio: Hmmio, pch: Pcstr, cch: Int): Int =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_mmioWrite((hmmio?.value ?: 0L), (pch?.value ?: 0L), cch)

public actual fun sndOpenSound(eventname: Pcwstr, appname: Pcwstr, flags: Int, filehandle: COpaquePointer?): Int =
    WindowsWin32MediaMultimediaJniBridge.windowssys_windows_win32_media_multimedia_sndOpenSound((eventname?.value ?: 0L), (appname?.value ?: 0L), flags, (filehandle?.value ?: 0L))
