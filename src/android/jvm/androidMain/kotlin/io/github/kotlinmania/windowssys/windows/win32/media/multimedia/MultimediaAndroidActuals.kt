@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private object WindowsWin32MediaMultimediaJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaAVIBuildFilterA(lpszfilter: Long, cbfilter: Int, fsaving: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaAVIBuildFilterW(lpszfilter: Long, cbfilter: Int, fsaving: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaAVIClearClipboard(): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaAVIFileAddRef(pfile: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaAVIFileCreateStreamA(pfile: Long, ppavi: Long, psi: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaAVIFileCreateStreamW(pfile: Long, ppavi: Long, psi: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaAVIFileEndRecord(pfile: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaAVIFileExit()

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaAVIFileGetStream(pfile: Long, ppavi: Long, fcctype: Int, lparam: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaAVIFileInfoA(pfile: Long, pfi: Long, lsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaAVIFileInfoW(pfile: Long, pfi: Long, lsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaAVIFileInit()

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaAVIFileOpenA(ppfile: Long, szfile: Long, umode: Int, lphandler: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaAVIFileOpenW(ppfile: Long, szfile: Long, umode: Int, lphandler: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaAVIFileReadData(pfile: Long, ckid: Int, lpdata: Long, lpcbdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaAVIFileRelease(pfile: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaAVIFileWriteData(pfile: Long, ckid: Int, lpdata: Long, cbdata: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaAVIGetFromClipboard(lppf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaAVIMakeCompressedStream(ppscompressed: Long, ppssource: Long, lpoptions: Long, pclsidhandler: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaAVIMakeFileFromStreams(ppfile: Long, nstreams: Int, papstreams: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaAVIMakeStreamFromClipboard(cfformat: Int, hglobal: Long, ppstream: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaAVIPutFileOnClipboard(pf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaAVISaveA(szfile: Long, pclsidhandler: Long, lpfncallback: Long, nstreams: Int, pfile: Long, lpoptions: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaAVISaveOptions(hwnd: Long, uiflags: Int, nstreams: Int, ppavi: Long, plpoptions: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaAVISaveOptionsFree(nstreams: Int, plpoptions: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaAVISaveVA(szfile: Long, pclsidhandler: Long, lpfncallback: Long, nstreams: Int, ppavi: Long, plpoptions: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaAVISaveVW(szfile: Long, pclsidhandler: Long, lpfncallback: Long, nstreams: Int, ppavi: Long, plpoptions: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaAVISaveW(szfile: Long, pclsidhandler: Long, lpfncallback: Long, nstreams: Int, pfile: Long, lpoptions: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaAVIStreamAddRef(pavi: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaAVIStreamBeginStreaming(pavi: Long, lstart: Int, lend: Int, lrate: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaAVIStreamCreate(ppavi: Long, lparam1: Int, lparam2: Int, pclsidhandler: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaAVIStreamEndStreaming(pavi: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaAVIStreamFindSample(pavi: Long, lpos: Int, lflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaAVIStreamGetFrame(pg: Long, lpos: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaAVIStreamGetFrameClose(pg: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaAVIStreamGetFrameOpen(pavi: Long, lpbiwanted: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaAVIStreamInfoA(pavi: Long, psi: Long, lsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaAVIStreamInfoW(pavi: Long, psi: Long, lsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaAVIStreamLength(pavi: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaAVIStreamOpenFromFileA(ppavi: Long, szfile: Long, fcctype: Int, lparam: Int, mode: Int, pclsidhandler: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaAVIStreamOpenFromFileW(ppavi: Long, szfile: Long, fcctype: Int, lparam: Int, mode: Int, pclsidhandler: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaAVIStreamRead(pavi: Long, lstart: Int, lsamples: Int, lpbuffer: Long, cbbuffer: Int, plbytes: Long, plsamples: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaAVIStreamReadData(pavi: Long, fcc: Int, lp: Long, lpcb: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaAVIStreamReadFormat(pavi: Long, lpos: Int, lpformat: Long, lpcbformat: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaAVIStreamRelease(pavi: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaAVIStreamSampleToTime(pavi: Long, lsample: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaAVIStreamSetFormat(pavi: Long, lpos: Int, lpformat: Long, cbformat: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaAVIStreamStart(pavi: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaAVIStreamTimeToSample(pavi: Long, ltime: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaAVIStreamWrite(pavi: Long, lstart: Int, lsamples: Int, lpbuffer: Long, cbbuffer: Int, dwflags: Int, plsampwritten: Long, plbyteswritten: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaAVIStreamWriteData(pavi: Long, fcc: Int, lp: Long, cb: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaCloseDriver(hdriver: Long, lparam1: Long, lparam2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaCreateEditableStream(ppseditable: Long, pssource: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaDefDriverProc(dwdriveridentifier: Long, hdrvr: Long, umsg: Int, lparam1: Long, lparam2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaDrawDibBegin(hdd: Long, hdc: Long, dxdst: Int, dydst: Int, lpbi: Long, dxsrc: Int, dysrc: Int, wflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaDrawDibChangePalette(hdd: Long, istart: Int, ilen: Int, lppe: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaDrawDibClose(hdd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaDrawDibDraw(hdd: Long, hdc: Long, xdst: Int, ydst: Int, dxdst: Int, dydst: Int, lpbi: Long, lpbits: Long, xsrc: Int, ysrc: Int, dxsrc: Int, dysrc: Int, wflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaDrawDibEnd(hdd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaDrawDibGetBuffer(hdd: Long, lpbi: Long, dwsize: Int, dwflags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaDrawDibGetPalette(hdd: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaDrawDibOpen(): Long

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaDrawDibProfileDisplay(lpbi: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaDrawDibRealize(hdd: Long, hdc: Long, fbackground: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaDrawDibSetPalette(hdd: Long, hpal: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaDrawDibStart(hdd: Long, rate: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaDrawDibStop(hdd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaDrawDibTime(hdd: Long, lpddtime: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaDriverCallback(dwcallback: Long, dwflags: Int, hdevice: Long, dwmsg: Int, dwuser: Long, dwparam1: Long, dwparam2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaDrvGetModuleHandle(hdriver: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaEditStreamClone(pavi: Long, ppresult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaEditStreamCopy(pavi: Long, plstart: Long, pllength: Long, ppresult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaEditStreamCut(pavi: Long, plstart: Long, pllength: Long, ppresult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaEditStreamPaste(pavi: Long, plpos: Long, pllength: Long, pstream: Long, lstart: Int, lend: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaEditStreamSetInfoA(pavi: Long, lpinfo: Long, cbinfo: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaEditStreamSetInfoW(pavi: Long, lpinfo: Long, cbinfo: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaEditStreamSetNameA(pavi: Long, lpszname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaEditStreamSetNameW(pavi: Long, lpszname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaGetDriverModuleHandle(hdriver: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaGetOpenFileNamePreviewA(lpofn: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaGetOpenFileNamePreviewW(lpofn: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaGetSaveFileNamePreviewA(lpofn: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaGetSaveFileNamePreviewW(lpofn: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaICClose(hic: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaICCompress(hic: Long, dwflags: Int, lpbioutput: Long, lpdata: Long, lpbiinput: Long, lpbits: Long, lpckid: Long, lpdwflags: Long, lframenum: Int, dwframesize: Int, dwquality: Int, lpbiprev: Long, lpprev: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaICCompressorChoose(hwnd: Long, uiflags: Int, pvin: Long, lpdata: Long, pc: Long, lpsztitle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaICCompressorFree(pc: Long)

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaICDecompress(hic: Long, dwflags: Int, lpbiformat: Long, lpdata: Long, lpbi: Long, lpbits: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaICDraw(hic: Long, dwflags: Int, lpformat: Long, lpdata: Long, cbdata: Int, ltime: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaICDrawBegin(hic: Long, dwflags: Int, hpal: Long, hwnd: Long, hdc: Long, xdst: Int, ydst: Int, dxdst: Int, dydst: Int, lpbi: Long, xsrc: Int, ysrc: Int, dxsrc: Int, dysrc: Int, dwrate: Int, dwscale: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaICGetDisplayFormat(hic: Long, lpbiin: Long, lpbiout: Long, bitdepth: Int, dx: Int, dy: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaICGetInfo(hic: Long, picinfo: Long, cb: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaICImageCompress(hic: Long, uiflags: Int, lpbiin: Long, lpbits: Long, lpbiout: Long, lquality: Int, plsize: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaICImageDecompress(hic: Long, uiflags: Int, lpbiin: Long, lpbits: Long, lpbiout: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaICInfo(fcctype: Int, fcchandler: Int, lpicinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaICInstall(fcctype: Int, fcchandler: Int, lparam: Long, szdesc: Long, wflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaICLocate(fcctype: Int, fcchandler: Int, lpbiin: Long, lpbiout: Long, wflags: Short): Long

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaICOpen(fcctype: Int, fcchandler: Int, wmode: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaICRemove(fcctype: Int, fcchandler: Int, wflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaICSendMessage(hic: Long, msg: Int, dw1: Long, dw2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaICSeqCompressFrame(pc: Long, uiflags: Int, lpbits: Long, pfkey: Long, plsize: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaICSeqCompressFrameEnd(pc: Long)

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaICSeqCompressFrameStart(pc: Long, lpbiin: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaMCIWndCreateA(hwndparent: Long, hinstance: Long, dwstyle: Int, szfile: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaMCIWndCreateW(hwndparent: Long, hinstance: Long, dwstyle: Int, szfile: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaMCIWndRegisterClass(): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaOpenDriver(szdrivername: Long, szsectionname: Long, lparam2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaSendDriverMessage(hdriver: Long, message: Int, lparam1: Long, lparam2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaVideoForWindowsVersion(): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaCapCreateCaptureWindowA(lpszwindowname: Long, dwstyle: Int, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: Long, nid: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaCapCreateCaptureWindowW(lpszwindowname: Long, dwstyle: Int, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: Long, nid: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaCapGetDriverDescriptionA(wdriverindex: Int, lpszname: Long, cbname: Int, lpszver: Long, cbver: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaCapGetDriverDescriptionW(wdriverindex: Int, lpszname: Long, cbname: Int, lpszver: Long, cbver: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaJoyGetDevCapsA(ujoyid: Long, pjc: Long, cbjc: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaJoyGetDevCapsW(ujoyid: Long, pjc: Long, cbjc: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaJoyGetNumDevs(): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaJoyGetPos(ujoyid: Int, pji: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaJoyGetPosEx(ujoyid: Int, pji: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaJoyGetThreshold(ujoyid: Int, puthreshold: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaJoyReleaseCapture(ujoyid: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaJoySetCapture(hwnd: Long, ujoyid: Int, uperiod: Int, fchanged: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaJoySetThreshold(ujoyid: Int, uthreshold: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaMciDriverNotify(hwndcallback: Long, wdeviceid: Int, ustatus: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaMciDriverYield(wdeviceid: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaMciFreeCommandResource(wtable: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaMciGetCreatorTask(mciid: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaMciGetDeviceIDA(pszdevice: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaMciGetDeviceIDFromElementIDA(dwelementid: Int, lpstrtype: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaMciGetDeviceIDFromElementIDW(dwelementid: Int, lpstrtype: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaMciGetDeviceIDW(pszdevice: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaMciGetDriverData(wdeviceid: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaMciGetErrorStringA(mcierr: Int, psztext: Long, cchtext: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaMciGetErrorStringW(mcierr: Int, psztext: Long, cchtext: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaMciGetYieldProc(mciid: Int, pdwyielddata: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaMciLoadCommandResource(hinstance: Long, lpresname: Long, wtype: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaMciSendCommandA(mciid: Int, umsg: Int, dwparam1: Long, dwparam2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaMciSendCommandW(mciid: Int, umsg: Int, dwparam1: Long, dwparam2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaMciSendStringA(lpstrcommand: Long, lpstrreturnstring: Long, ureturnlength: Int, hwndcallback: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaMciSendStringW(lpstrcommand: Long, lpstrreturnstring: Long, ureturnlength: Int, hwndcallback: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaMciSetDriverData(wdeviceid: Int, dwdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaMciSetYieldProc(mciid: Int, fpyieldproc: Long, dwyielddata: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaMmDrvInstall(hdriver: Long, wszdrventry: Long, drvmessage: Long, wflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaMmGetCurrentTask(): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaMmTaskBlock(h: Int)

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaMmTaskCreate(lpfn: Long, lph: Long, dwinst: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaMmTaskSignal(h: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaMmTaskYield()

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaMmioAdvance(hmmio: Long, pmmioinfo: Long, fuadvance: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaMmioAscend(hmmio: Long, pmmcki: Long, fuascend: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaMmioClose(hmmio: Long, fuclose: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaMmioCreateChunk(hmmio: Long, pmmcki: Long, fucreate: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaMmioDescend(hmmio: Long, pmmcki: Long, pmmckiparent: Long, fudescend: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaMmioFlush(hmmio: Long, fuflush: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaMmioGetInfo(hmmio: Long, pmmioinfo: Long, fuinfo: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaMmioInstallIOProcA(fccioproc: Int, pioproc: Long, dwflags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaMmioInstallIOProcW(fccioproc: Int, pioproc: Long, dwflags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaMmioOpenA(pszfilename: Long, pmmioinfo: Long, fdwopen: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaMmioOpenW(pszfilename: Long, pmmioinfo: Long, fdwopen: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaMmioRead(hmmio: Long, pch: Long, cch: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaMmioRenameA(pszfilename: Long, psznewfilename: Long, pmmioinfo: Long, fdwrename: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaMmioRenameW(pszfilename: Long, psznewfilename: Long, pmmioinfo: Long, fdwrename: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaMmioSeek(hmmio: Long, loffset: Int, iorigin: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaMmioSendMessage(hmmio: Long, umsg: Int, lparam1: Long, lparam2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaMmioSetBuffer(hmmio: Long, pchbuffer: Long, cchbuffer: Int, fubuffer: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaMmioSetInfo(hmmio: Long, pmmioinfo: Long, fuinfo: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaMmioStringToFOURCCA(sz: Long, uflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaMmioStringToFOURCCW(sz: Long, uflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaMmioWrite(hmmio: Long, pch: Long, cch: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaMultimediaSndOpenSound(eventname: Long, appname: Long, flags: Int, filehandle: Long): Int
}

public actual fun aVIBuildFilterA(lpszfilter: Pstr, cbfilter: Int, fsaving: Bool): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaAVIBuildFilterA(lpszfilter.rawAddress, cbfilter, fsaving)

public actual fun aVIBuildFilterW(lpszfilter: Pwstr, cbfilter: Int, fsaving: Bool): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaAVIBuildFilterW(lpszfilter.rawAddress, cbfilter, fsaving)

public actual fun aVIClearClipboard(): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaAVIClearClipboard()

public actual fun aVIFileAddRef(pfile: MutPtr<CVoid>): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaAVIFileAddRef(pfile.rawAddress).toUInt()

public actual fun aVIFileCreateStreamA(pfile: MutPtr<CVoid>, ppavi: MutPtr<MutPtr<CVoid>>, psi: ConstPtr<Avistreaminfoa>): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaAVIFileCreateStreamA(pfile.rawAddress, ppavi.rawAddress, psi.rawAddress)

public actual fun aVIFileCreateStreamW(pfile: MutPtr<CVoid>, ppavi: MutPtr<MutPtr<CVoid>>, psi: ConstPtr<Avistreaminfow>): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaAVIFileCreateStreamW(pfile.rawAddress, ppavi.rawAddress, psi.rawAddress)

public actual fun aVIFileEndRecord(pfile: MutPtr<CVoid>): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaAVIFileEndRecord(pfile.rawAddress)

public actual fun aVIFileExit() {
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaAVIFileExit()
}

public actual fun aVIFileGetStream(pfile: MutPtr<CVoid>, ppavi: MutPtr<MutPtr<CVoid>>, fcctype: UInt, lparam: Int): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaAVIFileGetStream(pfile.rawAddress, ppavi.rawAddress, fcctype.toInt(), lparam)

public actual fun aVIFileInfoA(pfile: MutPtr<CVoid>, pfi: MutPtr<Avifileinfoa>, lsize: Int): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaAVIFileInfoA(pfile.rawAddress, pfi.rawAddress, lsize)

public actual fun aVIFileInfoW(pfile: MutPtr<CVoid>, pfi: MutPtr<Avifileinfow>, lsize: Int): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaAVIFileInfoW(pfile.rawAddress, pfi.rawAddress, lsize)

public actual fun aVIFileInit() {
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaAVIFileInit()
}

public actual fun aVIFileOpenA(ppfile: MutPtr<MutPtr<CVoid>>, szfile: Pcstr, umode: UInt, lphandler: ConstPtr<Guid>): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaAVIFileOpenA(ppfile.rawAddress, szfile.rawAddress, umode.toInt(), lphandler.rawAddress)

public actual fun aVIFileOpenW(ppfile: MutPtr<MutPtr<CVoid>>, szfile: Pcwstr, umode: UInt, lphandler: ConstPtr<Guid>): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaAVIFileOpenW(ppfile.rawAddress, szfile.rawAddress, umode.toInt(), lphandler.rawAddress)

public actual fun aVIFileReadData(pfile: MutPtr<CVoid>, ckid: UInt, lpdata: MutPtr<CVoid>, lpcbdata: MutPtr<Int>): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaAVIFileReadData(pfile.rawAddress, ckid.toInt(), lpdata.rawAddress, lpcbdata.rawAddress)

public actual fun aVIFileRelease(pfile: MutPtr<CVoid>): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaAVIFileRelease(pfile.rawAddress).toUInt()

public actual fun aVIFileWriteData(pfile: MutPtr<CVoid>, ckid: UInt, lpdata: ConstPtr<CVoid>, cbdata: Int): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaAVIFileWriteData(pfile.rawAddress, ckid.toInt(), lpdata.rawAddress, cbdata)

public actual fun aVIGetFromClipboard(lppf: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaAVIGetFromClipboard(lppf.rawAddress)

public actual fun aVIMakeCompressedStream(ppscompressed: MutPtr<MutPtr<CVoid>>, ppssource: MutPtr<CVoid>, lpoptions: ConstPtr<Avicompressoptions>, pclsidhandler: ConstPtr<Guid>): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaAVIMakeCompressedStream(ppscompressed.rawAddress, ppssource.rawAddress, lpoptions.rawAddress, pclsidhandler.rawAddress)

public actual fun aVIMakeFileFromStreams(ppfile: MutPtr<MutPtr<CVoid>>, nstreams: Int, papstreams: ConstPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaAVIMakeFileFromStreams(ppfile.rawAddress, nstreams, papstreams.rawAddress)

public actual fun aVIMakeStreamFromClipboard(cfformat: UInt, hglobal: Handle, ppstream: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaAVIMakeStreamFromClipboard(cfformat.toInt(), hglobal.rawAddress, ppstream.rawAddress)

public actual fun aVIPutFileOnClipboard(pf: MutPtr<CVoid>): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaAVIPutFileOnClipboard(pf.rawAddress)

public actual fun aVISaveA(szfile: Pcstr, pclsidhandler: ConstPtr<Guid>, lpfncallback: Avisavecallback, nstreams: Int, pfile: MutPtr<CVoid>, lpoptions: ConstPtr<Avicompressoptions>, vararg variadicArgs: Long): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaAVISaveA(szfile.rawAddress, pclsidhandler.rawAddress, 0L, nstreams, pfile.rawAddress, lpoptions.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun aVISaveOptions(hwnd: Hwnd, uiflags: UInt, nstreams: Int, ppavi: ConstPtr<MutPtr<CVoid>>, plpoptions: MutPtr<MutPtr<Avicompressoptions>>): Long =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaAVISaveOptions(hwnd.rawAddress, uiflags.toInt(), nstreams, ppavi.rawAddress, plpoptions.rawAddress)

public actual fun aVISaveOptionsFree(nstreams: Int, plpoptions: ConstPtr<ConstPtr<Avicompressoptions>>): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaAVISaveOptionsFree(nstreams, plpoptions.rawAddress)

public actual fun aVISaveVA(szfile: Pcstr, pclsidhandler: ConstPtr<Guid>, lpfncallback: Avisavecallback, nstreams: Int, ppavi: ConstPtr<MutPtr<CVoid>>, plpoptions: ConstPtr<ConstPtr<Avicompressoptions>>): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaAVISaveVA(szfile.rawAddress, pclsidhandler.rawAddress, 0L, nstreams, ppavi.rawAddress, plpoptions.rawAddress)

public actual fun aVISaveVW(szfile: Pcwstr, pclsidhandler: ConstPtr<Guid>, lpfncallback: Avisavecallback, nstreams: Int, ppavi: ConstPtr<MutPtr<CVoid>>, plpoptions: ConstPtr<ConstPtr<Avicompressoptions>>): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaAVISaveVW(szfile.rawAddress, pclsidhandler.rawAddress, 0L, nstreams, ppavi.rawAddress, plpoptions.rawAddress)

public actual fun aVISaveW(szfile: Pcwstr, pclsidhandler: ConstPtr<Guid>, lpfncallback: Avisavecallback, nstreams: Int, pfile: MutPtr<CVoid>, lpoptions: ConstPtr<Avicompressoptions>, vararg variadicArgs: Long): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaAVISaveW(szfile.rawAddress, pclsidhandler.rawAddress, 0L, nstreams, pfile.rawAddress, lpoptions.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun aVIStreamAddRef(pavi: MutPtr<CVoid>): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaAVIStreamAddRef(pavi.rawAddress).toUInt()

public actual fun aVIStreamBeginStreaming(pavi: MutPtr<CVoid>, lstart: Int, lend: Int, lrate: Int): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaAVIStreamBeginStreaming(pavi.rawAddress, lstart, lend, lrate)

public actual fun aVIStreamCreate(ppavi: MutPtr<MutPtr<CVoid>>, lparam1: Int, lparam2: Int, pclsidhandler: ConstPtr<Guid>): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaAVIStreamCreate(ppavi.rawAddress, lparam1, lparam2, pclsidhandler.rawAddress)

public actual fun aVIStreamEndStreaming(pavi: MutPtr<CVoid>): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaAVIStreamEndStreaming(pavi.rawAddress)

public actual fun aVIStreamFindSample(pavi: MutPtr<CVoid>, lpos: Int, lflags: Int): Int =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaAVIStreamFindSample(pavi.rawAddress, lpos, lflags)

public actual fun aVIStreamGetFrame(pg: MutPtr<CVoid>, lpos: Int): MutPtr<CVoid> =
    MutPtr(WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaAVIStreamGetFrame(pg.rawAddress, lpos))

public actual fun aVIStreamGetFrameClose(pg: MutPtr<CVoid>): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaAVIStreamGetFrameClose(pg.rawAddress)

public actual fun aVIStreamGetFrameOpen(pavi: MutPtr<CVoid>, lpbiwanted: ConstPtr<Bitmapinfoheader>): MutPtr<CVoid> =
    MutPtr(WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaAVIStreamGetFrameOpen(pavi.rawAddress, lpbiwanted.rawAddress))

public actual fun aVIStreamInfoA(pavi: MutPtr<CVoid>, psi: MutPtr<Avistreaminfoa>, lsize: Int): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaAVIStreamInfoA(pavi.rawAddress, psi.rawAddress, lsize)

public actual fun aVIStreamInfoW(pavi: MutPtr<CVoid>, psi: MutPtr<Avistreaminfow>, lsize: Int): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaAVIStreamInfoW(pavi.rawAddress, psi.rawAddress, lsize)

public actual fun aVIStreamLength(pavi: MutPtr<CVoid>): Int =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaAVIStreamLength(pavi.rawAddress)

public actual fun aVIStreamOpenFromFileA(ppavi: MutPtr<MutPtr<CVoid>>, szfile: Pcstr, fcctype: UInt, lparam: Int, mode: UInt, pclsidhandler: ConstPtr<Guid>): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaAVIStreamOpenFromFileA(ppavi.rawAddress, szfile.rawAddress, fcctype.toInt(), lparam, mode.toInt(), pclsidhandler.rawAddress)

public actual fun aVIStreamOpenFromFileW(ppavi: MutPtr<MutPtr<CVoid>>, szfile: Pcwstr, fcctype: UInt, lparam: Int, mode: UInt, pclsidhandler: ConstPtr<Guid>): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaAVIStreamOpenFromFileW(ppavi.rawAddress, szfile.rawAddress, fcctype.toInt(), lparam, mode.toInt(), pclsidhandler.rawAddress)

public actual fun aVIStreamRead(pavi: MutPtr<CVoid>, lstart: Int, lsamples: Int, lpbuffer: MutPtr<CVoid>, cbbuffer: Int, plbytes: MutPtr<Int>, plsamples: MutPtr<Int>): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaAVIStreamRead(pavi.rawAddress, lstart, lsamples, lpbuffer.rawAddress, cbbuffer, plbytes.rawAddress, plsamples.rawAddress)

public actual fun aVIStreamReadData(pavi: MutPtr<CVoid>, fcc: UInt, lp: MutPtr<CVoid>, lpcb: MutPtr<Int>): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaAVIStreamReadData(pavi.rawAddress, fcc.toInt(), lp.rawAddress, lpcb.rawAddress)

public actual fun aVIStreamReadFormat(pavi: MutPtr<CVoid>, lpos: Int, lpformat: MutPtr<CVoid>, lpcbformat: MutPtr<Int>): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaAVIStreamReadFormat(pavi.rawAddress, lpos, lpformat.rawAddress, lpcbformat.rawAddress)

public actual fun aVIStreamRelease(pavi: MutPtr<CVoid>): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaAVIStreamRelease(pavi.rawAddress).toUInt()

public actual fun aVIStreamSampleToTime(pavi: MutPtr<CVoid>, lsample: Int): Int =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaAVIStreamSampleToTime(pavi.rawAddress, lsample)

public actual fun aVIStreamSetFormat(pavi: MutPtr<CVoid>, lpos: Int, lpformat: ConstPtr<CVoid>, cbformat: Int): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaAVIStreamSetFormat(pavi.rawAddress, lpos, lpformat.rawAddress, cbformat)

public actual fun aVIStreamStart(pavi: MutPtr<CVoid>): Int =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaAVIStreamStart(pavi.rawAddress)

public actual fun aVIStreamTimeToSample(pavi: MutPtr<CVoid>, ltime: Int): Int =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaAVIStreamTimeToSample(pavi.rawAddress, ltime)

public actual fun aVIStreamWrite(pavi: MutPtr<CVoid>, lstart: Int, lsamples: Int, lpbuffer: ConstPtr<CVoid>, cbbuffer: Int, dwflags: UInt, plsampwritten: MutPtr<Int>, plbyteswritten: MutPtr<Int>): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaAVIStreamWrite(pavi.rawAddress, lstart, lsamples, lpbuffer.rawAddress, cbbuffer, dwflags.toInt(), plsampwritten.rawAddress, plbyteswritten.rawAddress)

public actual fun aVIStreamWriteData(pavi: MutPtr<CVoid>, fcc: UInt, lp: ConstPtr<CVoid>, cb: Int): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaAVIStreamWriteData(pavi.rawAddress, fcc.toInt(), lp.rawAddress, cb)

public actual fun closeDriver(hdriver: Hdrvr, lparam1: Lparam, lparam2: Lparam): Lresult =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaCloseDriver(hdriver.rawAddress, lparam1, lparam2)

public actual fun createEditableStream(ppseditable: MutPtr<MutPtr<CVoid>>, pssource: MutPtr<CVoid>): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaCreateEditableStream(ppseditable.rawAddress, pssource.rawAddress)

public actual fun defDriverProc(dwdriveridentifier: ULong, hdrvr: Hdrvr, umsg: UInt, lparam1: Lparam, lparam2: Lparam): Lresult =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaDefDriverProc(dwdriveridentifier.toLong(), hdrvr.rawAddress, umsg.toInt(), lparam1, lparam2)

public actual fun drawDibBegin(hdd: Long, hdc: Hdc, dxdst: Int, dydst: Int, lpbi: ConstPtr<Bitmapinfoheader>, dxsrc: Int, dysrc: Int, wflags: UInt): Bool =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaDrawDibBegin(hdd, hdc.rawAddress, dxdst, dydst, lpbi.rawAddress, dxsrc, dysrc, wflags.toInt())

public actual fun drawDibChangePalette(hdd: Long, istart: Int, ilen: Int, lppe: ConstPtr<Paletteentry>): Bool =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaDrawDibChangePalette(hdd, istart, ilen, lppe.rawAddress)

public actual fun drawDibClose(hdd: Long): Bool =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaDrawDibClose(hdd)

public actual fun drawDibDraw(hdd: Long, hdc: Hdc, xdst: Int, ydst: Int, dxdst: Int, dydst: Int, lpbi: ConstPtr<Bitmapinfoheader>, lpbits: ConstPtr<CVoid>, xsrc: Int, ysrc: Int, dxsrc: Int, dysrc: Int, wflags: UInt): Bool =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaDrawDibDraw(hdd, hdc.rawAddress, xdst, ydst, dxdst, dydst, lpbi.rawAddress, lpbits.rawAddress, xsrc, ysrc, dxsrc, dysrc, wflags.toInt())

public actual fun drawDibEnd(hdd: Long): Bool =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaDrawDibEnd(hdd)

public actual fun drawDibGetBuffer(hdd: Long, lpbi: MutPtr<Bitmapinfoheader>, dwsize: UInt, dwflags: UInt): MutPtr<CVoid> =
    MutPtr(WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaDrawDibGetBuffer(hdd, lpbi.rawAddress, dwsize.toInt(), dwflags.toInt()))

public actual fun drawDibGetPalette(hdd: Long): Hpalette =
    MutPtr(WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaDrawDibGetPalette(hdd))

public actual fun drawDibOpen(): Long =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaDrawDibOpen()

public actual fun drawDibProfileDisplay(lpbi: ConstPtr<Bitmapinfoheader>): Lresult =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaDrawDibProfileDisplay(lpbi.rawAddress)

public actual fun drawDibRealize(hdd: Long, hdc: Hdc, fbackground: Bool): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaDrawDibRealize(hdd, hdc.rawAddress, fbackground).toUInt()

public actual fun drawDibSetPalette(hdd: Long, hpal: Hpalette): Bool =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaDrawDibSetPalette(hdd, hpal.rawAddress)

public actual fun drawDibStart(hdd: Long, rate: UInt): Bool =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaDrawDibStart(hdd, rate.toInt())

public actual fun drawDibStop(hdd: Long): Bool =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaDrawDibStop(hdd)

public actual fun drawDibTime(hdd: Long, lpddtime: MutPtr<Drawdibtime>): Bool =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaDrawDibTime(hdd, lpddtime.rawAddress)

public actual fun driverCallback(dwcallback: ULong, dwflags: UInt, hdevice: Hdrvr, dwmsg: UInt, dwuser: ULong, dwparam1: ULong, dwparam2: ULong): Bool =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaDriverCallback(dwcallback.toLong(), dwflags.toInt(), hdevice.rawAddress, dwmsg.toInt(), dwuser.toLong(), dwparam1.toLong(), dwparam2.toLong())

public actual fun drvGetModuleHandle(hdriver: Hdrvr): Hmodule =
    MutPtr(WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaDrvGetModuleHandle(hdriver.rawAddress))

public actual fun editStreamClone(pavi: MutPtr<CVoid>, ppresult: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaEditStreamClone(pavi.rawAddress, ppresult.rawAddress)

public actual fun editStreamCopy(pavi: MutPtr<CVoid>, plstart: MutPtr<Int>, pllength: MutPtr<Int>, ppresult: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaEditStreamCopy(pavi.rawAddress, plstart.rawAddress, pllength.rawAddress, ppresult.rawAddress)

public actual fun editStreamCut(pavi: MutPtr<CVoid>, plstart: MutPtr<Int>, pllength: MutPtr<Int>, ppresult: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaEditStreamCut(pavi.rawAddress, plstart.rawAddress, pllength.rawAddress, ppresult.rawAddress)

public actual fun editStreamPaste(pavi: MutPtr<CVoid>, plpos: MutPtr<Int>, pllength: MutPtr<Int>, pstream: MutPtr<CVoid>, lstart: Int, lend: Int): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaEditStreamPaste(pavi.rawAddress, plpos.rawAddress, pllength.rawAddress, pstream.rawAddress, lstart, lend)

public actual fun editStreamSetInfoA(pavi: MutPtr<CVoid>, lpinfo: ConstPtr<Avistreaminfoa>, cbinfo: Int): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaEditStreamSetInfoA(pavi.rawAddress, lpinfo.rawAddress, cbinfo)

public actual fun editStreamSetInfoW(pavi: MutPtr<CVoid>, lpinfo: ConstPtr<Avistreaminfow>, cbinfo: Int): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaEditStreamSetInfoW(pavi.rawAddress, lpinfo.rawAddress, cbinfo)

public actual fun editStreamSetNameA(pavi: MutPtr<CVoid>, lpszname: Pcstr): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaEditStreamSetNameA(pavi.rawAddress, lpszname.rawAddress)

public actual fun editStreamSetNameW(pavi: MutPtr<CVoid>, lpszname: Pcwstr): Hresult =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaEditStreamSetNameW(pavi.rawAddress, lpszname.rawAddress)

public actual fun getDriverModuleHandle(hdriver: Hdrvr): Hmodule =
    MutPtr(WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaGetDriverModuleHandle(hdriver.rawAddress))

public actual fun getOpenFileNamePreviewA(lpofn: MutPtr<Openfilenamea>): Bool =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaGetOpenFileNamePreviewA(lpofn.rawAddress)

public actual fun getOpenFileNamePreviewW(lpofn: MutPtr<Openfilenamew>): Bool =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaGetOpenFileNamePreviewW(lpofn.rawAddress)

public actual fun getSaveFileNamePreviewA(lpofn: MutPtr<Openfilenamea>): Bool =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaGetSaveFileNamePreviewA(lpofn.rawAddress)

public actual fun getSaveFileNamePreviewW(lpofn: MutPtr<Openfilenamew>): Bool =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaGetSaveFileNamePreviewW(lpofn.rawAddress)

public actual fun iCClose(hic: Hic): Lresult =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaICClose(hic.rawAddress)

public actual fun iCCompress(hic: Hic, dwflags: UInt, lpbioutput: ConstPtr<Bitmapinfoheader>, lpdata: MutPtr<CVoid>, lpbiinput: ConstPtr<Bitmapinfoheader>, lpbits: ConstPtr<CVoid>, lpckid: MutPtr<UInt>, lpdwflags: MutPtr<UInt>, lframenum: Int, dwframesize: UInt, dwquality: UInt, lpbiprev: ConstPtr<Bitmapinfoheader>, lpprev: ConstPtr<CVoid>): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaICCompress(hic.rawAddress, dwflags.toInt(), lpbioutput.rawAddress, lpdata.rawAddress, lpbiinput.rawAddress, lpbits.rawAddress, lpckid.rawAddress, lpdwflags.rawAddress, lframenum, dwframesize.toInt(), dwquality.toInt(), lpbiprev.rawAddress, lpprev.rawAddress).toUInt()

public actual fun iCCompressorChoose(hwnd: Hwnd, uiflags: UInt, pvin: ConstPtr<CVoid>, lpdata: ConstPtr<CVoid>, pc: MutPtr<Compvars>, lpsztitle: Pcstr): Bool =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaICCompressorChoose(hwnd.rawAddress, uiflags.toInt(), pvin.rawAddress, lpdata.rawAddress, pc.rawAddress, lpsztitle.rawAddress)

public actual fun iCCompressorFree(pc: ConstPtr<Compvars>) {
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaICCompressorFree(pc.rawAddress)
}

public actual fun iCDecompress(hic: Hic, dwflags: UInt, lpbiformat: ConstPtr<Bitmapinfoheader>, lpdata: ConstPtr<CVoid>, lpbi: ConstPtr<Bitmapinfoheader>, lpbits: MutPtr<CVoid>): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaICDecompress(hic.rawAddress, dwflags.toInt(), lpbiformat.rawAddress, lpdata.rawAddress, lpbi.rawAddress, lpbits.rawAddress).toUInt()

public actual fun iCDraw(hic: Hic, dwflags: UInt, lpformat: ConstPtr<CVoid>, lpdata: ConstPtr<CVoid>, cbdata: UInt, ltime: Int): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaICDraw(hic.rawAddress, dwflags.toInt(), lpformat.rawAddress, lpdata.rawAddress, cbdata.toInt(), ltime).toUInt()

public actual fun iCDrawBegin(hic: Hic, dwflags: UInt, hpal: Hpalette, hwnd: Hwnd, hdc: Hdc, xdst: Int, ydst: Int, dxdst: Int, dydst: Int, lpbi: ConstPtr<Bitmapinfoheader>, xsrc: Int, ysrc: Int, dxsrc: Int, dysrc: Int, dwrate: UInt, dwscale: UInt): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaICDrawBegin(hic.rawAddress, dwflags.toInt(), hpal.rawAddress, hwnd.rawAddress, hdc.rawAddress, xdst, ydst, dxdst, dydst, lpbi.rawAddress, xsrc, ysrc, dxsrc, dysrc, dwrate.toInt(), dwscale.toInt()).toUInt()

public actual fun iCGetDisplayFormat(hic: Hic, lpbiin: ConstPtr<Bitmapinfoheader>, lpbiout: MutPtr<Bitmapinfoheader>, bitdepth: Int, dx: Int, dy: Int): Hic =
    MutPtr(WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaICGetDisplayFormat(hic.rawAddress, lpbiin.rawAddress, lpbiout.rawAddress, bitdepth, dx, dy))

public actual fun iCGetInfo(hic: Hic, picinfo: MutPtr<Icinfo>, cb: UInt): Lresult =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaICGetInfo(hic.rawAddress, picinfo.rawAddress, cb.toInt())

public actual fun iCImageCompress(hic: Hic, uiflags: UInt, lpbiin: ConstPtr<Bitmapinfo>, lpbits: ConstPtr<CVoid>, lpbiout: ConstPtr<Bitmapinfo>, lquality: Int, plsize: MutPtr<Int>): Handle =
    MutPtr(WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaICImageCompress(hic.rawAddress, uiflags.toInt(), lpbiin.rawAddress, lpbits.rawAddress, lpbiout.rawAddress, lquality, plsize.rawAddress))

public actual fun iCImageDecompress(hic: Hic, uiflags: UInt, lpbiin: ConstPtr<Bitmapinfo>, lpbits: ConstPtr<CVoid>, lpbiout: ConstPtr<Bitmapinfo>): Handle =
    MutPtr(WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaICImageDecompress(hic.rawAddress, uiflags.toInt(), lpbiin.rawAddress, lpbits.rawAddress, lpbiout.rawAddress))

public actual fun iCInfo(fcctype: UInt, fcchandler: UInt, lpicinfo: MutPtr<Icinfo>): Bool =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaICInfo(fcctype.toInt(), fcchandler.toInt(), lpicinfo.rawAddress)

public actual fun iCInstall(fcctype: UInt, fcchandler: UInt, lparam: Lparam, szdesc: Pcstr, wflags: UInt): Bool =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaICInstall(fcctype.toInt(), fcchandler.toInt(), lparam, szdesc.rawAddress, wflags.toInt())

public actual fun iCLocate(fcctype: UInt, fcchandler: UInt, lpbiin: ConstPtr<Bitmapinfoheader>, lpbiout: ConstPtr<Bitmapinfoheader>, wflags: UShort): Hic =
    MutPtr(WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaICLocate(fcctype.toInt(), fcchandler.toInt(), lpbiin.rawAddress, lpbiout.rawAddress, wflags.toShort()))

public actual fun iCOpen(fcctype: UInt, fcchandler: UInt, wmode: UInt): Hic =
    MutPtr(WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaICOpen(fcctype.toInt(), fcchandler.toInt(), wmode.toInt()))

public actual fun iCOpenFunction(fcctype: UInt, fcchandler: UInt, wmode: UInt, lpfnhandler: Farproc): Hic =
    MutPtr(0L)

public actual fun iCRemove(fcctype: UInt, fcchandler: UInt, wflags: UInt): Bool =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaICRemove(fcctype.toInt(), fcchandler.toInt(), wflags.toInt())

public actual fun iCSendMessage(hic: Hic, msg: UInt, dw1: ULong, dw2: ULong): Lresult =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaICSendMessage(hic.rawAddress, msg.toInt(), dw1.toLong(), dw2.toLong())

public actual fun iCSeqCompressFrame(pc: ConstPtr<Compvars>, uiflags: UInt, lpbits: ConstPtr<CVoid>, pfkey: MutPtr<Bool>, plsize: MutPtr<Int>): MutPtr<CVoid> =
    MutPtr(WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaICSeqCompressFrame(pc.rawAddress, uiflags.toInt(), lpbits.rawAddress, pfkey.rawAddress, plsize.rawAddress))

public actual fun iCSeqCompressFrameEnd(pc: ConstPtr<Compvars>) {
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaICSeqCompressFrameEnd(pc.rawAddress)
}

public actual fun iCSeqCompressFrameStart(pc: ConstPtr<Compvars>, lpbiin: ConstPtr<Bitmapinfo>): Bool =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaICSeqCompressFrameStart(pc.rawAddress, lpbiin.rawAddress)

public actual fun mCIWndCreateA(hwndparent: Hwnd, hinstance: Hinstance, dwstyle: UInt, szfile: Pcstr): Hwnd =
    MutPtr(WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaMCIWndCreateA(hwndparent.rawAddress, hinstance.rawAddress, dwstyle.toInt(), szfile.rawAddress))

public actual fun mCIWndCreateW(hwndparent: Hwnd, hinstance: Hinstance, dwstyle: UInt, szfile: Pcwstr): Hwnd =
    MutPtr(WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaMCIWndCreateW(hwndparent.rawAddress, hinstance.rawAddress, dwstyle.toInt(), szfile.rawAddress))

public actual fun mCIWndRegisterClass(): Bool =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaMCIWndRegisterClass()

public actual fun openDriver(szdrivername: Pcwstr, szsectionname: Pcwstr, lparam2: Lparam): Hdrvr =
    MutPtr(WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaOpenDriver(szdrivername.rawAddress, szsectionname.rawAddress, lparam2))

public actual fun sendDriverMessage(hdriver: Hdrvr, message: UInt, lparam1: Lparam, lparam2: Lparam): Lresult =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaSendDriverMessage(hdriver.rawAddress, message.toInt(), lparam1, lparam2)

public actual fun videoForWindowsVersion(): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaVideoForWindowsVersion().toUInt()

public actual fun capCreateCaptureWindowA(lpszwindowname: Pcstr, dwstyle: UInt, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: Hwnd, nid: Int): Hwnd =
    MutPtr(WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaCapCreateCaptureWindowA(lpszwindowname.rawAddress, dwstyle.toInt(), x, y, nwidth, nheight, hwndparent.rawAddress, nid))

public actual fun capCreateCaptureWindowW(lpszwindowname: Pcwstr, dwstyle: UInt, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: Hwnd, nid: Int): Hwnd =
    MutPtr(WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaCapCreateCaptureWindowW(lpszwindowname.rawAddress, dwstyle.toInt(), x, y, nwidth, nheight, hwndparent.rawAddress, nid))

public actual fun capGetDriverDescriptionA(wdriverindex: UInt, lpszname: Pstr, cbname: Int, lpszver: Pstr, cbver: Int): Bool =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaCapGetDriverDescriptionA(wdriverindex.toInt(), lpszname.rawAddress, cbname, lpszver.rawAddress, cbver)

public actual fun capGetDriverDescriptionW(wdriverindex: UInt, lpszname: Pwstr, cbname: Int, lpszver: Pwstr, cbver: Int): Bool =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaCapGetDriverDescriptionW(wdriverindex.toInt(), lpszname.rawAddress, cbname, lpszver.rawAddress, cbver)

public actual fun joyGetDevCapsA(ujoyid: ULong, pjc: MutPtr<Joycapsa>, cbjc: UInt): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaJoyGetDevCapsA(ujoyid.toLong(), pjc.rawAddress, cbjc.toInt()).toUInt()

public actual fun joyGetDevCapsW(ujoyid: ULong, pjc: MutPtr<Joycapsw>, cbjc: UInt): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaJoyGetDevCapsW(ujoyid.toLong(), pjc.rawAddress, cbjc.toInt()).toUInt()

public actual fun joyGetNumDevs(): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaJoyGetNumDevs().toUInt()

public actual fun joyGetPos(ujoyid: UInt, pji: MutPtr<Joyinfo>): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaJoyGetPos(ujoyid.toInt(), pji.rawAddress).toUInt()

public actual fun joyGetPosEx(ujoyid: UInt, pji: MutPtr<Joyinfoex>): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaJoyGetPosEx(ujoyid.toInt(), pji.rawAddress).toUInt()

public actual fun joyGetThreshold(ujoyid: UInt, puthreshold: MutPtr<UInt>): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaJoyGetThreshold(ujoyid.toInt(), puthreshold.rawAddress).toUInt()

public actual fun joyReleaseCapture(ujoyid: UInt): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaJoyReleaseCapture(ujoyid.toInt()).toUInt()

public actual fun joySetCapture(hwnd: Hwnd, ujoyid: UInt, uperiod: UInt, fchanged: Bool): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaJoySetCapture(hwnd.rawAddress, ujoyid.toInt(), uperiod.toInt(), fchanged).toUInt()

public actual fun joySetThreshold(ujoyid: UInt, uthreshold: UInt): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaJoySetThreshold(ujoyid.toInt(), uthreshold.toInt()).toUInt()

public actual fun mciDriverNotify(hwndcallback: Handle, wdeviceid: UInt, ustatus: UInt): Bool =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaMciDriverNotify(hwndcallback.rawAddress, wdeviceid.toInt(), ustatus.toInt())

public actual fun mciDriverYield(wdeviceid: UInt): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaMciDriverYield(wdeviceid.toInt()).toUInt()

public actual fun mciFreeCommandResource(wtable: UInt): Bool =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaMciFreeCommandResource(wtable.toInt())

public actual fun mciGetCreatorTask(mciid: UInt): Htask =
    MutPtr(WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaMciGetCreatorTask(mciid.toInt()))

public actual fun mciGetDeviceIDA(pszdevice: Pcstr): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaMciGetDeviceIDA(pszdevice.rawAddress).toUInt()

public actual fun mciGetDeviceIDFromElementIDA(dwelementid: UInt, lpstrtype: Pcstr): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaMciGetDeviceIDFromElementIDA(dwelementid.toInt(), lpstrtype.rawAddress).toUInt()

public actual fun mciGetDeviceIDFromElementIDW(dwelementid: UInt, lpstrtype: Pcwstr): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaMciGetDeviceIDFromElementIDW(dwelementid.toInt(), lpstrtype.rawAddress).toUInt()

public actual fun mciGetDeviceIDW(pszdevice: Pcwstr): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaMciGetDeviceIDW(pszdevice.rawAddress).toUInt()

public actual fun mciGetDriverData(wdeviceid: UInt): ULong =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaMciGetDriverData(wdeviceid.toInt()).toULong()

public actual fun mciGetErrorStringA(mcierr: UInt, psztext: Pstr, cchtext: UInt): Bool =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaMciGetErrorStringA(mcierr.toInt(), psztext.rawAddress, cchtext.toInt())

public actual fun mciGetErrorStringW(mcierr: UInt, psztext: Pwstr, cchtext: UInt): Bool =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaMciGetErrorStringW(mcierr.toInt(), psztext.rawAddress, cchtext.toInt())

public actual fun mciGetYieldProc(mciid: UInt, pdwyielddata: ConstPtr<UInt>): Yieldproc =
    null

public actual fun mciLoadCommandResource(hinstance: Handle, lpresname: Pcwstr, wtype: UInt): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaMciLoadCommandResource(hinstance.rawAddress, lpresname.rawAddress, wtype.toInt()).toUInt()

public actual fun mciSendCommandA(mciid: UInt, umsg: UInt, dwparam1: ULong, dwparam2: ULong): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaMciSendCommandA(mciid.toInt(), umsg.toInt(), dwparam1.toLong(), dwparam2.toLong()).toUInt()

public actual fun mciSendCommandW(mciid: UInt, umsg: UInt, dwparam1: ULong, dwparam2: ULong): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaMciSendCommandW(mciid.toInt(), umsg.toInt(), dwparam1.toLong(), dwparam2.toLong()).toUInt()

public actual fun mciSendStringA(lpstrcommand: Pcstr, lpstrreturnstring: Pstr, ureturnlength: UInt, hwndcallback: Hwnd): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaMciSendStringA(lpstrcommand.rawAddress, lpstrreturnstring.rawAddress, ureturnlength.toInt(), hwndcallback.rawAddress).toUInt()

public actual fun mciSendStringW(lpstrcommand: Pcwstr, lpstrreturnstring: Pwstr, ureturnlength: UInt, hwndcallback: Hwnd): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaMciSendStringW(lpstrcommand.rawAddress, lpstrreturnstring.rawAddress, ureturnlength.toInt(), hwndcallback.rawAddress).toUInt()

public actual fun mciSetDriverData(wdeviceid: UInt, dwdata: ULong): Bool =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaMciSetDriverData(wdeviceid.toInt(), dwdata.toLong())

public actual fun mciSetYieldProc(mciid: UInt, fpyieldproc: Yieldproc, dwyielddata: UInt): Bool =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaMciSetYieldProc(mciid.toInt(), 0L, dwyielddata.toInt())

public actual fun mmDrvInstall(hdriver: Hdrvr, wszdrventry: Pcwstr, drvmessage: Drivermsgproc, wflags: UInt): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaMmDrvInstall(hdriver.rawAddress, wszdrventry.rawAddress, 0L, wflags.toInt()).toUInt()

public actual fun mmGetCurrentTask(): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaMmGetCurrentTask().toUInt()

public actual fun mmTaskBlock(h: UInt) {
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaMmTaskBlock(h.toInt())
}

public actual fun mmTaskCreate(lpfn: Lptaskcallback, lph: MutPtr<Handle>, dwinst: ULong): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaMmTaskCreate(0L, lph.rawAddress, dwinst.toLong()).toUInt()

public actual fun mmTaskSignal(h: UInt): Bool =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaMmTaskSignal(h.toInt())

public actual fun mmTaskYield() {
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaMmTaskYield()
}

public actual fun mmioAdvance(hmmio: Hmmio, pmmioinfo: ConstPtr<Mmioinfo>, fuadvance: UInt): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaMmioAdvance(hmmio.rawAddress, pmmioinfo.rawAddress, fuadvance.toInt()).toUInt()

public actual fun mmioAscend(hmmio: Hmmio, pmmcki: ConstPtr<Mmckinfo>, fuascend: UInt): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaMmioAscend(hmmio.rawAddress, pmmcki.rawAddress, fuascend.toInt()).toUInt()

public actual fun mmioClose(hmmio: Hmmio, fuclose: UInt): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaMmioClose(hmmio.rawAddress, fuclose.toInt()).toUInt()

public actual fun mmioCreateChunk(hmmio: Hmmio, pmmcki: ConstPtr<Mmckinfo>, fucreate: UInt): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaMmioCreateChunk(hmmio.rawAddress, pmmcki.rawAddress, fucreate.toInt()).toUInt()

public actual fun mmioDescend(hmmio: Hmmio, pmmcki: MutPtr<Mmckinfo>, pmmckiparent: ConstPtr<Mmckinfo>, fudescend: UInt): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaMmioDescend(hmmio.rawAddress, pmmcki.rawAddress, pmmckiparent.rawAddress, fudescend.toInt()).toUInt()

public actual fun mmioFlush(hmmio: Hmmio, fuflush: UInt): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaMmioFlush(hmmio.rawAddress, fuflush.toInt()).toUInt()

public actual fun mmioGetInfo(hmmio: Hmmio, pmmioinfo: MutPtr<Mmioinfo>, fuinfo: UInt): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaMmioGetInfo(hmmio.rawAddress, pmmioinfo.rawAddress, fuinfo.toInt()).toUInt()

public actual fun mmioInstallIOProcA(fccioproc: UInt, pioproc: Lpmmioproc, dwflags: UInt): Lpmmioproc =
    null

public actual fun mmioInstallIOProcW(fccioproc: UInt, pioproc: Lpmmioproc, dwflags: UInt): Lpmmioproc =
    null

public actual fun mmioOpenA(pszfilename: Pstr, pmmioinfo: MutPtr<Mmioinfo>, fdwopen: UInt): Hmmio =
    MutPtr(WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaMmioOpenA(pszfilename.rawAddress, pmmioinfo.rawAddress, fdwopen.toInt()))

public actual fun mmioOpenW(pszfilename: Pwstr, pmmioinfo: MutPtr<Mmioinfo>, fdwopen: UInt): Hmmio =
    MutPtr(WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaMmioOpenW(pszfilename.rawAddress, pmmioinfo.rawAddress, fdwopen.toInt()))

public actual fun mmioRead(hmmio: Hmmio, pch: MutPtr<Byte>, cch: Int): Int =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaMmioRead(hmmio.rawAddress, pch.rawAddress, cch)

public actual fun mmioRenameA(pszfilename: Pcstr, psznewfilename: Pcstr, pmmioinfo: ConstPtr<Mmioinfo>, fdwrename: UInt): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaMmioRenameA(pszfilename.rawAddress, psznewfilename.rawAddress, pmmioinfo.rawAddress, fdwrename.toInt()).toUInt()

public actual fun mmioRenameW(pszfilename: Pcwstr, psznewfilename: Pcwstr, pmmioinfo: ConstPtr<Mmioinfo>, fdwrename: UInt): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaMmioRenameW(pszfilename.rawAddress, psznewfilename.rawAddress, pmmioinfo.rawAddress, fdwrename.toInt()).toUInt()

public actual fun mmioSeek(hmmio: Hmmio, loffset: Int, iorigin: Int): Int =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaMmioSeek(hmmio.rawAddress, loffset, iorigin)

public actual fun mmioSendMessage(hmmio: Hmmio, umsg: UInt, lparam1: Lparam, lparam2: Lparam): Lresult =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaMmioSendMessage(hmmio.rawAddress, umsg.toInt(), lparam1, lparam2)

public actual fun mmioSetBuffer(hmmio: Hmmio, pchbuffer: Pstr, cchbuffer: Int, fubuffer: UInt): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaMmioSetBuffer(hmmio.rawAddress, pchbuffer.rawAddress, cchbuffer, fubuffer.toInt()).toUInt()

public actual fun mmioSetInfo(hmmio: Hmmio, pmmioinfo: ConstPtr<Mmioinfo>, fuinfo: UInt): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaMmioSetInfo(hmmio.rawAddress, pmmioinfo.rawAddress, fuinfo.toInt()).toUInt()

public actual fun mmioStringToFOURCCA(sz: Pcstr, uflags: UInt): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaMmioStringToFOURCCA(sz.rawAddress, uflags.toInt()).toUInt()

public actual fun mmioStringToFOURCCW(sz: Pcwstr, uflags: UInt): UInt =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaMmioStringToFOURCCW(sz.rawAddress, uflags.toInt()).toUInt()

public actual fun mmioWrite(hmmio: Hmmio, pch: Pcstr, cch: Int): Int =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaMmioWrite(hmmio.rawAddress, pch.rawAddress, cch)

public actual fun sndOpenSound(eventname: Pcwstr, appname: Pcwstr, flags: Int, filehandle: MutPtr<Handle>): Int =
    WindowsWin32MediaMultimediaJniBridge.windowssysWindowsWin32MediaMultimediaSndOpenSound(eventname.rawAddress, appname.rawAddress, flags, filehandle.rawAddress)
