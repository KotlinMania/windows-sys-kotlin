package io.github.kotlinmania.windowssys.windows.win32.media.multimedia

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.media.HTASK

public fun interface FnCallback {
    public operator fun invoke(param0: Int): BOOL
}

public fun interface FnCallback1 {
    public operator fun invoke(mciid: UInt, dwyielddata: UInt): UInt
}

public fun interface FnCallback2 {
    public operator fun invoke(param0: UInt, param1: UInt, param2: ULong, param3: ULong, param4: ULong): UInt
}

public fun interface FnCallback3 {
    public operator fun invoke(dwinst: ULong)
}

public fun interface FnCallback4 {
    public operator fun invoke(lpmmioinfo: PCSTR, umsg: UInt, lparam1: Foundation.LPARAM, lparam2: Foundation.LPARAM): Foundation.LRESULT
}

public fun AVIBuildFilterA(lpszfilter: PSTR, cbfilter: Int, fsaving: BOOL): HRESULT {
    return Win32DynamicFfi.invoke("avifil32.dll", "AVIBuildFilterA", longArrayOf(lpszfilter, cbfilter.toLong(), fsaving.toLong())).toInt()
}

public fun AVIBuildFilterW(lpszfilter: PWSTR, cbfilter: Int, fsaving: BOOL): HRESULT {
    return Win32DynamicFfi.invoke("avifil32.dll", "AVIBuildFilterW", longArrayOf(lpszfilter, cbfilter.toLong(), fsaving.toLong())).toInt()
}

public fun AVIClearClipboard(): HRESULT {
    return Win32DynamicFfi.invoke("avifil32.dll", "AVIClearClipboard", longArrayOf()).toInt()
}

public fun AVIFileAddRef(pfile: Long): UInt {
    return Win32DynamicFfi.invoke("avifil32.dll", "AVIFileAddRef", longArrayOf(pfile)).toUInt()
}

public fun AVIFileCreateStreamA(pfile: Long, ppavi: Long, psi: Long): HRESULT {
    return Win32DynamicFfi.invoke("avifil32.dll", "AVIFileCreateStreamA", longArrayOf(pfile, ppavi, psi)).toInt()
}

public fun AVIFileCreateStreamW(pfile: Long, ppavi: Long, psi: Long): HRESULT {
    return Win32DynamicFfi.invoke("avifil32.dll", "AVIFileCreateStreamW", longArrayOf(pfile, ppavi, psi)).toInt()
}

public fun AVIFileEndRecord(pfile: Long): HRESULT {
    return Win32DynamicFfi.invoke("avifil32.dll", "AVIFileEndRecord", longArrayOf(pfile)).toInt()
}

public fun AVIFileExit() {
    Win32DynamicFfi.invoke("avifil32.dll", "AVIFileExit", longArrayOf())
}

public fun AVIFileGetStream(pfile: Long, ppavi: Long, fcctype: UInt, lparam: Int): HRESULT {
    return Win32DynamicFfi.invoke("avifil32.dll", "AVIFileGetStream", longArrayOf(pfile, ppavi, fcctype.toLong(), lparam.toLong())).toInt()
}

public fun AVIFileInfoA(pfile: Long, pfi: Long, lsize: Int): HRESULT {
    return Win32DynamicFfi.invoke("avifil32.dll", "AVIFileInfoA", longArrayOf(pfile, pfi, lsize.toLong())).toInt()
}

public fun AVIFileInfoW(pfile: Long, pfi: Long, lsize: Int): HRESULT {
    return Win32DynamicFfi.invoke("avifil32.dll", "AVIFileInfoW", longArrayOf(pfile, pfi, lsize.toLong())).toInt()
}

public fun AVIFileInit() {
    Win32DynamicFfi.invoke("avifil32.dll", "AVIFileInit", longArrayOf())
}

public fun AVIFileOpenA(ppfile: Long, szfile: PCSTR, umode: UInt, lphandler: Long): HRESULT {
    return Win32DynamicFfi.invoke("avifil32.dll", "AVIFileOpenA", longArrayOf(ppfile, szfile, umode.toLong(), lphandler)).toInt()
}

public fun AVIFileOpenW(ppfile: Long, szfile: PCWSTR, umode: UInt, lphandler: Long): HRESULT {
    return Win32DynamicFfi.invoke("avifil32.dll", "AVIFileOpenW", longArrayOf(ppfile, szfile, umode.toLong(), lphandler)).toInt()
}

public fun AVIFileReadData(pfile: Long, ckid: UInt, lpdata: Long, lpcbdata: Long): HRESULT {
    return Win32DynamicFfi.invoke("avifil32.dll", "AVIFileReadData", longArrayOf(pfile, ckid.toLong(), lpdata, lpcbdata)).toInt()
}

public fun AVIFileRelease(pfile: Long): UInt {
    return Win32DynamicFfi.invoke("avifil32.dll", "AVIFileRelease", longArrayOf(pfile)).toUInt()
}

public fun AVIFileWriteData(pfile: Long, ckid: UInt, lpdata: Long, cbdata: Int): HRESULT {
    return Win32DynamicFfi.invoke("avifil32.dll", "AVIFileWriteData", longArrayOf(pfile, ckid.toLong(), lpdata, cbdata.toLong())).toInt()
}

public fun AVIGetFromClipboard(lppf: Long): HRESULT {
    return Win32DynamicFfi.invoke("avifil32.dll", "AVIGetFromClipboard", longArrayOf(lppf)).toInt()
}

public fun AVIMakeCompressedStream(ppscompressed: Long, ppssource: Long, lpoptions: Long, pclsidhandler: Long): HRESULT {
    return Win32DynamicFfi.invoke("avifil32.dll", "AVIMakeCompressedStream", longArrayOf(ppscompressed, ppssource, lpoptions, pclsidhandler)).toInt()
}

public fun AVIMakeFileFromStreams(ppfile: Long, nstreams: Int, papstreams: Long): HRESULT {
    return Win32DynamicFfi.invoke("avifil32.dll", "AVIMakeFileFromStreams", longArrayOf(ppfile, nstreams.toLong(), papstreams)).toInt()
}

public fun AVIMakeStreamFromClipboard(cfformat: UInt, hglobal: Foundation.HANDLE, ppstream: Long): HRESULT {
    return Win32DynamicFfi.invoke("avifil32.dll", "AVIMakeStreamFromClipboard", longArrayOf(cfformat.toLong(), Win32DynamicFfi.objectSlot(hglobal), ppstream)).toInt()
}

public fun AVIPutFileOnClipboard(pf: Long): HRESULT {
    return Win32DynamicFfi.invoke("avifil32.dll", "AVIPutFileOnClipboard", longArrayOf(pf)).toInt()
}

public fun AVISaveA(szfile: PCSTR, pclsidhandler: Long, lpfncallback: AVISAVECALLBACK, nstreams: Int, pfile: Long, lpoptions: Long, vararg variadicArgs: Long): HRESULT {
    return Win32DynamicFfi.invoke("avifil32.dll", "AVISaveA", longArrayOf(szfile, pclsidhandler, Win32DynamicFfi.objectSlot(lpfncallback), nstreams.toLong(), pfile, lpoptions) + variadicArgs).toInt()
}

public fun AVISaveOptions(hwnd: Foundation.HWND, uiflags: UInt, nstreams: Int, ppavi: Long, plpoptions: Long): Long {
    return Win32DynamicFfi.invoke("avifil32.dll", "AVISaveOptions", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), uiflags.toLong(), nstreams.toLong(), ppavi, plpoptions))
}

public fun AVISaveOptionsFree(nstreams: Int, plpoptions: Long): HRESULT {
    return Win32DynamicFfi.invoke("avifil32.dll", "AVISaveOptionsFree", longArrayOf(nstreams.toLong(), plpoptions)).toInt()
}

public fun AVISaveVA(szfile: PCSTR, pclsidhandler: Long, lpfncallback: AVISAVECALLBACK, nstreams: Int, ppavi: Long, plpoptions: Long): HRESULT {
    return Win32DynamicFfi.invoke("avifil32.dll", "AVISaveVA", longArrayOf(szfile, pclsidhandler, Win32DynamicFfi.objectSlot(lpfncallback), nstreams.toLong(), ppavi, plpoptions)).toInt()
}

public fun AVISaveVW(szfile: PCWSTR, pclsidhandler: Long, lpfncallback: AVISAVECALLBACK, nstreams: Int, ppavi: Long, plpoptions: Long): HRESULT {
    return Win32DynamicFfi.invoke("avifil32.dll", "AVISaveVW", longArrayOf(szfile, pclsidhandler, Win32DynamicFfi.objectSlot(lpfncallback), nstreams.toLong(), ppavi, plpoptions)).toInt()
}

public fun AVISaveW(szfile: PCWSTR, pclsidhandler: Long, lpfncallback: AVISAVECALLBACK, nstreams: Int, pfile: Long, lpoptions: Long, vararg variadicArgs: Long): HRESULT {
    return Win32DynamicFfi.invoke("avifil32.dll", "AVISaveW", longArrayOf(szfile, pclsidhandler, Win32DynamicFfi.objectSlot(lpfncallback), nstreams.toLong(), pfile, lpoptions) + variadicArgs).toInt()
}

public fun AVIStreamAddRef(pavi: Long): UInt {
    return Win32DynamicFfi.invoke("avifil32.dll", "AVIStreamAddRef", longArrayOf(pavi)).toUInt()
}

public fun AVIStreamBeginStreaming(pavi: Long, lstart: Int, lend: Int, lrate: Int): HRESULT {
    return Win32DynamicFfi.invoke("avifil32.dll", "AVIStreamBeginStreaming", longArrayOf(pavi, lstart.toLong(), lend.toLong(), lrate.toLong())).toInt()
}

public fun AVIStreamCreate(ppavi: Long, lparam1: Int, lparam2: Int, pclsidhandler: Long): HRESULT {
    return Win32DynamicFfi.invoke("avifil32.dll", "AVIStreamCreate", longArrayOf(ppavi, lparam1.toLong(), lparam2.toLong(), pclsidhandler)).toInt()
}

public fun AVIStreamEndStreaming(pavi: Long): HRESULT {
    return Win32DynamicFfi.invoke("avifil32.dll", "AVIStreamEndStreaming", longArrayOf(pavi)).toInt()
}

public fun AVIStreamFindSample(pavi: Long, lpos: Int, lflags: Int): Int {
    return Win32DynamicFfi.invoke("avifil32.dll", "AVIStreamFindSample", longArrayOf(pavi, lpos.toLong(), lflags.toLong())).toInt()
}

public fun AVIStreamGetFrame(pg: Long, lpos: Int): Long {
    return Win32DynamicFfi.invoke("avifil32.dll", "AVIStreamGetFrame", longArrayOf(pg, lpos.toLong()))
}

public fun AVIStreamGetFrameClose(pg: Long): HRESULT {
    return Win32DynamicFfi.invoke("avifil32.dll", "AVIStreamGetFrameClose", longArrayOf(pg)).toInt()
}

public fun AVIStreamGetFrameOpen(pavi: Long, lpbiwanted: Long): Long {
    return Win32DynamicFfi.invoke("avifil32.dll", "AVIStreamGetFrameOpen", longArrayOf(pavi, lpbiwanted))
}

public fun AVIStreamInfoA(pavi: Long, psi: Long, lsize: Int): HRESULT {
    return Win32DynamicFfi.invoke("avifil32.dll", "AVIStreamInfoA", longArrayOf(pavi, psi, lsize.toLong())).toInt()
}

public fun AVIStreamInfoW(pavi: Long, psi: Long, lsize: Int): HRESULT {
    return Win32DynamicFfi.invoke("avifil32.dll", "AVIStreamInfoW", longArrayOf(pavi, psi, lsize.toLong())).toInt()
}

public fun AVIStreamLength(pavi: Long): Int {
    return Win32DynamicFfi.invoke("avifil32.dll", "AVIStreamLength", longArrayOf(pavi)).toInt()
}

public fun AVIStreamOpenFromFileA(ppavi: Long, szfile: PCSTR, fcctype: UInt, lparam: Int, mode: UInt, pclsidhandler: Long): HRESULT {
    return Win32DynamicFfi.invoke("avifil32.dll", "AVIStreamOpenFromFileA", longArrayOf(ppavi, szfile, fcctype.toLong(), lparam.toLong(), mode.toLong(), pclsidhandler)).toInt()
}

public fun AVIStreamOpenFromFileW(ppavi: Long, szfile: PCWSTR, fcctype: UInt, lparam: Int, mode: UInt, pclsidhandler: Long): HRESULT {
    return Win32DynamicFfi.invoke("avifil32.dll", "AVIStreamOpenFromFileW", longArrayOf(ppavi, szfile, fcctype.toLong(), lparam.toLong(), mode.toLong(), pclsidhandler)).toInt()
}

public fun AVIStreamRead(pavi: Long, lstart: Int, lsamples: Int, lpbuffer: Long, cbbuffer: Int, plbytes: Long, plsamples: Long): HRESULT {
    return Win32DynamicFfi.invoke("avifil32.dll", "AVIStreamRead", longArrayOf(pavi, lstart.toLong(), lsamples.toLong(), lpbuffer, cbbuffer.toLong(), plbytes, plsamples)).toInt()
}

public fun AVIStreamReadData(pavi: Long, fcc: UInt, lp: Long, lpcb: Long): HRESULT {
    return Win32DynamicFfi.invoke("avifil32.dll", "AVIStreamReadData", longArrayOf(pavi, fcc.toLong(), lp, lpcb)).toInt()
}

public fun AVIStreamReadFormat(pavi: Long, lpos: Int, lpformat: Long, lpcbformat: Long): HRESULT {
    return Win32DynamicFfi.invoke("avifil32.dll", "AVIStreamReadFormat", longArrayOf(pavi, lpos.toLong(), lpformat, lpcbformat)).toInt()
}

public fun AVIStreamRelease(pavi: Long): UInt {
    return Win32DynamicFfi.invoke("avifil32.dll", "AVIStreamRelease", longArrayOf(pavi)).toUInt()
}

public fun AVIStreamSampleToTime(pavi: Long, lsample: Int): Int {
    return Win32DynamicFfi.invoke("avifil32.dll", "AVIStreamSampleToTime", longArrayOf(pavi, lsample.toLong())).toInt()
}

public fun AVIStreamSetFormat(pavi: Long, lpos: Int, lpformat: Long, cbformat: Int): HRESULT {
    return Win32DynamicFfi.invoke("avifil32.dll", "AVIStreamSetFormat", longArrayOf(pavi, lpos.toLong(), lpformat, cbformat.toLong())).toInt()
}

public fun AVIStreamStart(pavi: Long): Int {
    return Win32DynamicFfi.invoke("avifil32.dll", "AVIStreamStart", longArrayOf(pavi)).toInt()
}

public fun AVIStreamTimeToSample(pavi: Long, ltime: Int): Int {
    return Win32DynamicFfi.invoke("avifil32.dll", "AVIStreamTimeToSample", longArrayOf(pavi, ltime.toLong())).toInt()
}

public fun AVIStreamWrite(pavi: Long, lstart: Int, lsamples: Int, lpbuffer: Long, cbbuffer: Int, dwflags: UInt, plsampwritten: Long, plbyteswritten: Long): HRESULT {
    return Win32DynamicFfi.invoke("avifil32.dll", "AVIStreamWrite", longArrayOf(pavi, lstart.toLong(), lsamples.toLong(), lpbuffer, cbbuffer.toLong(), dwflags.toLong(), plsampwritten, plbyteswritten)).toInt()
}

public fun AVIStreamWriteData(pavi: Long, fcc: UInt, lp: Long, cb: Int): HRESULT {
    return Win32DynamicFfi.invoke("avifil32.dll", "AVIStreamWriteData", longArrayOf(pavi, fcc.toLong(), lp, cb.toLong())).toInt()
}

public fun CloseDriver(hdriver: HDRVR, lparam1: Foundation.LPARAM, lparam2: Foundation.LPARAM): Foundation.LRESULT {
    Win32DynamicFfi.invoke("winmm.dll", "CloseDriver", longArrayOf(hdriver, Win32DynamicFfi.objectSlot(lparam1), Win32DynamicFfi.objectSlot(lparam2)))
    return Foundation.LRESULT()
}

public fun CreateEditableStream(ppseditable: Long, pssource: Long): HRESULT {
    return Win32DynamicFfi.invoke("avifil32.dll", "CreateEditableStream", longArrayOf(ppseditable, pssource)).toInt()
}

public fun DefDriverProc(dwdriveridentifier: ULong, hdrvr: HDRVR, umsg: UInt, lparam1: Foundation.LPARAM, lparam2: Foundation.LPARAM): Foundation.LRESULT {
    Win32DynamicFfi.invoke("winmm.dll", "DefDriverProc", longArrayOf(dwdriveridentifier.toLong(), hdrvr, umsg.toLong(), Win32DynamicFfi.objectSlot(lparam1), Win32DynamicFfi.objectSlot(lparam2)))
    return Foundation.LRESULT()
}

public fun DrawDibBegin(hdd: Long, hdc: Graphics.Gdi.HDC, dxdst: Int, dydst: Int, lpbi: Long, dxsrc: Int, dysrc: Int, wflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("msvfw32.dll", "DrawDibBegin", longArrayOf(hdd, Win32DynamicFfi.objectSlot(hdc), dxdst.toLong(), dydst.toLong(), lpbi, dxsrc.toLong(), dysrc.toLong(), wflags.toLong())).toInt()
}

public fun DrawDibChangePalette(hdd: Long, istart: Int, ilen: Int, lppe: Long): BOOL {
    return Win32DynamicFfi.invoke("msvfw32.dll", "DrawDibChangePalette", longArrayOf(hdd, istart.toLong(), ilen.toLong(), lppe)).toInt()
}

public fun DrawDibClose(hdd: Long): BOOL {
    return Win32DynamicFfi.invoke("msvfw32.dll", "DrawDibClose", longArrayOf(hdd)).toInt()
}

public fun DrawDibDraw(hdd: Long, hdc: Graphics.Gdi.HDC, xdst: Int, ydst: Int, dxdst: Int, dydst: Int, lpbi: Long, lpbits: Long, xsrc: Int, ysrc: Int, dxsrc: Int, dysrc: Int, wflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("msvfw32.dll", "DrawDibDraw", longArrayOf(hdd, Win32DynamicFfi.objectSlot(hdc), xdst.toLong(), ydst.toLong(), dxdst.toLong(), dydst.toLong(), lpbi, lpbits, xsrc.toLong(), ysrc.toLong(), dxsrc.toLong(), dysrc.toLong(), wflags.toLong())).toInt()
}

public fun DrawDibEnd(hdd: Long): BOOL {
    return Win32DynamicFfi.invoke("msvfw32.dll", "DrawDibEnd", longArrayOf(hdd)).toInt()
}

public fun DrawDibGetBuffer(hdd: Long, lpbi: Long, dwsize: UInt, dwflags: UInt): Long {
    return Win32DynamicFfi.invoke("msvfw32.dll", "DrawDibGetBuffer", longArrayOf(hdd, lpbi, dwsize.toLong(), dwflags.toLong()))
}

public fun DrawDibGetPalette(hdd: Long): Graphics.Gdi.HPALETTE {
    Win32DynamicFfi.invoke("msvfw32.dll", "DrawDibGetPalette", longArrayOf(hdd))
    return Graphics.Gdi.HPALETTE()
}

public fun DrawDibOpen(): Long {
    return Win32DynamicFfi.invoke("msvfw32.dll", "DrawDibOpen", longArrayOf())
}

public fun DrawDibProfileDisplay(lpbi: Long): Foundation.LRESULT {
    Win32DynamicFfi.invoke("msvfw32.dll", "DrawDibProfileDisplay", longArrayOf(lpbi))
    return Foundation.LRESULT()
}

public fun DrawDibRealize(hdd: Long, hdc: Graphics.Gdi.HDC, fbackground: BOOL): UInt {
    return Win32DynamicFfi.invoke("msvfw32.dll", "DrawDibRealize", longArrayOf(hdd, Win32DynamicFfi.objectSlot(hdc), fbackground.toLong())).toUInt()
}

public fun DrawDibSetPalette(hdd: Long, hpal: Graphics.Gdi.HPALETTE): BOOL {
    return Win32DynamicFfi.invoke("msvfw32.dll", "DrawDibSetPalette", longArrayOf(hdd, Win32DynamicFfi.objectSlot(hpal))).toInt()
}

public fun DrawDibStart(hdd: Long, rate: UInt): BOOL {
    return Win32DynamicFfi.invoke("msvfw32.dll", "DrawDibStart", longArrayOf(hdd, rate.toLong())).toInt()
}

public fun DrawDibStop(hdd: Long): BOOL {
    return Win32DynamicFfi.invoke("msvfw32.dll", "DrawDibStop", longArrayOf(hdd)).toInt()
}

public fun DrawDibTime(hdd: Long, lpddtime: Long): BOOL {
    return Win32DynamicFfi.invoke("msvfw32.dll", "DrawDibTime", longArrayOf(hdd, lpddtime)).toInt()
}

public fun DriverCallback(dwcallback: ULong, dwflags: UInt, hdevice: HDRVR, dwmsg: UInt, dwuser: ULong, dwparam1: ULong, dwparam2: ULong): BOOL {
    return Win32DynamicFfi.invoke("winmm.dll", "DriverCallback", longArrayOf(dwcallback.toLong(), dwflags.toLong(), hdevice, dwmsg.toLong(), dwuser.toLong(), dwparam1.toLong(), dwparam2.toLong())).toInt()
}

public fun DrvGetModuleHandle(hdriver: HDRVR): Foundation.HMODULE {
    Win32DynamicFfi.invoke("winmm.dll", "DrvGetModuleHandle", longArrayOf(hdriver))
    return Foundation.HMODULE()
}

public fun EditStreamClone(pavi: Long, ppresult: Long): HRESULT {
    return Win32DynamicFfi.invoke("avifil32.dll", "EditStreamClone", longArrayOf(pavi, ppresult)).toInt()
}

public fun EditStreamCopy(pavi: Long, plstart: Long, pllength: Long, ppresult: Long): HRESULT {
    return Win32DynamicFfi.invoke("avifil32.dll", "EditStreamCopy", longArrayOf(pavi, plstart, pllength, ppresult)).toInt()
}

public fun EditStreamCut(pavi: Long, plstart: Long, pllength: Long, ppresult: Long): HRESULT {
    return Win32DynamicFfi.invoke("avifil32.dll", "EditStreamCut", longArrayOf(pavi, plstart, pllength, ppresult)).toInt()
}

public fun EditStreamPaste(pavi: Long, plpos: Long, pllength: Long, pstream: Long, lstart: Int, lend: Int): HRESULT {
    return Win32DynamicFfi.invoke("avifil32.dll", "EditStreamPaste", longArrayOf(pavi, plpos, pllength, pstream, lstart.toLong(), lend.toLong())).toInt()
}

public fun EditStreamSetInfoA(pavi: Long, lpinfo: Long, cbinfo: Int): HRESULT {
    return Win32DynamicFfi.invoke("avifil32.dll", "EditStreamSetInfoA", longArrayOf(pavi, lpinfo, cbinfo.toLong())).toInt()
}

public fun EditStreamSetInfoW(pavi: Long, lpinfo: Long, cbinfo: Int): HRESULT {
    return Win32DynamicFfi.invoke("avifil32.dll", "EditStreamSetInfoW", longArrayOf(pavi, lpinfo, cbinfo.toLong())).toInt()
}

public fun EditStreamSetNameA(pavi: Long, lpszname: PCSTR): HRESULT {
    return Win32DynamicFfi.invoke("avifil32.dll", "EditStreamSetNameA", longArrayOf(pavi, lpszname)).toInt()
}

public fun EditStreamSetNameW(pavi: Long, lpszname: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("avifil32.dll", "EditStreamSetNameW", longArrayOf(pavi, lpszname)).toInt()
}

public fun GetDriverModuleHandle(hdriver: HDRVR): Foundation.HMODULE {
    Win32DynamicFfi.invoke("winmm.dll", "GetDriverModuleHandle", longArrayOf(hdriver))
    return Foundation.HMODULE()
}

public fun GetOpenFileNamePreviewA(lpofn: Long): BOOL {
    return Win32DynamicFfi.invoke("msvfw32.dll", "GetOpenFileNamePreviewA", longArrayOf(lpofn)).toInt()
}

public fun GetOpenFileNamePreviewW(lpofn: Long): BOOL {
    return Win32DynamicFfi.invoke("msvfw32.dll", "GetOpenFileNamePreviewW", longArrayOf(lpofn)).toInt()
}

public fun GetSaveFileNamePreviewA(lpofn: Long): BOOL {
    return Win32DynamicFfi.invoke("msvfw32.dll", "GetSaveFileNamePreviewA", longArrayOf(lpofn)).toInt()
}

public fun GetSaveFileNamePreviewW(lpofn: Long): BOOL {
    return Win32DynamicFfi.invoke("msvfw32.dll", "GetSaveFileNamePreviewW", longArrayOf(lpofn)).toInt()
}

public fun ICClose(hic: HIC): Foundation.LRESULT {
    Win32DynamicFfi.invoke("msvfw32.dll", "ICClose", longArrayOf(hic))
    return Foundation.LRESULT()
}

public fun ICCompress(hic: HIC, dwflags: UInt, lpbioutput: Long, lpdata: Long, lpbiinput: Long, lpbits: Long, lpckid: Long, lpdwflags: Long, lframenum: Int, dwframesize: UInt, dwquality: UInt, lpbiprev: Long, lpprev: Long): UInt {
    return Win32DynamicFfi.invoke("msvfw32.dll", "ICCompress", longArrayOf(hic, dwflags.toLong(), lpbioutput, lpdata, lpbiinput, lpbits, lpckid, lpdwflags, lframenum.toLong(), dwframesize.toLong(), dwquality.toLong(), lpbiprev, lpprev)).toUInt()
}

public fun ICCompressorChoose(hwnd: Foundation.HWND, uiflags: UInt, pvin: Long, lpdata: Long, pc: Long, lpsztitle: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("msvfw32.dll", "ICCompressorChoose", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), uiflags.toLong(), pvin, lpdata, pc, lpsztitle)).toInt()
}

public fun ICCompressorFree(pc: Long) {
    Win32DynamicFfi.invoke("msvfw32.dll", "ICCompressorFree", longArrayOf(pc))
}

public fun ICDecompress(hic: HIC, dwflags: UInt, lpbiformat: Long, lpdata: Long, lpbi: Long, lpbits: Long): UInt {
    return Win32DynamicFfi.invoke("msvfw32.dll", "ICDecompress", longArrayOf(hic, dwflags.toLong(), lpbiformat, lpdata, lpbi, lpbits)).toUInt()
}

public fun ICDraw(hic: HIC, dwflags: UInt, lpformat: Long, lpdata: Long, cbdata: UInt, ltime: Int): UInt {
    return Win32DynamicFfi.invoke("msvfw32.dll", "ICDraw", longArrayOf(hic, dwflags.toLong(), lpformat, lpdata, cbdata.toLong(), ltime.toLong())).toUInt()
}

public fun ICDrawBegin(hic: HIC, dwflags: UInt, hpal: Graphics.Gdi.HPALETTE, hwnd: Foundation.HWND, hdc: Graphics.Gdi.HDC, xdst: Int, ydst: Int, dxdst: Int, dydst: Int, lpbi: Long, xsrc: Int, ysrc: Int, dxsrc: Int, dysrc: Int, dwrate: UInt, dwscale: UInt): UInt {
    return Win32DynamicFfi.invoke("msvfw32.dll", "ICDrawBegin", longArrayOf(hic, dwflags.toLong(), Win32DynamicFfi.objectSlot(hpal), Win32DynamicFfi.objectSlot(hwnd), Win32DynamicFfi.objectSlot(hdc), xdst.toLong(), ydst.toLong(), dxdst.toLong(), dydst.toLong(), lpbi, xsrc.toLong(), ysrc.toLong(), dxsrc.toLong(), dysrc.toLong(), dwrate.toLong(), dwscale.toLong())).toUInt()
}

public fun ICGetDisplayFormat(hic: HIC, lpbiin: Long, lpbiout: Long, bitdepth: Int, dx: Int, dy: Int): HIC {
    return Win32DynamicFfi.invoke("msvfw32.dll", "ICGetDisplayFormat", longArrayOf(hic, lpbiin, lpbiout, bitdepth.toLong(), dx.toLong(), dy.toLong()))
}

public fun ICGetInfo(hic: HIC, picinfo: Long, cb: UInt): Foundation.LRESULT {
    Win32DynamicFfi.invoke("msvfw32.dll", "ICGetInfo", longArrayOf(hic, picinfo, cb.toLong()))
    return Foundation.LRESULT()
}

public fun ICImageCompress(hic: HIC, uiflags: UInt, lpbiin: Long, lpbits: Long, lpbiout: Long, lquality: Int, plsize: Long): Foundation.HANDLE {
    Win32DynamicFfi.invoke("msvfw32.dll", "ICImageCompress", longArrayOf(hic, uiflags.toLong(), lpbiin, lpbits, lpbiout, lquality.toLong(), plsize))
    return Foundation.HANDLE()
}

public fun ICImageDecompress(hic: HIC, uiflags: UInt, lpbiin: Long, lpbits: Long, lpbiout: Long): Foundation.HANDLE {
    Win32DynamicFfi.invoke("msvfw32.dll", "ICImageDecompress", longArrayOf(hic, uiflags.toLong(), lpbiin, lpbits, lpbiout))
    return Foundation.HANDLE()
}

public fun ICInfo(fcctype: UInt, fcchandler: UInt, lpicinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("msvfw32.dll", "ICInfo", longArrayOf(fcctype.toLong(), fcchandler.toLong(), lpicinfo)).toInt()
}

public fun ICInstall(fcctype: UInt, fcchandler: UInt, lparam: Foundation.LPARAM, szdesc: PCSTR, wflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("msvfw32.dll", "ICInstall", longArrayOf(fcctype.toLong(), fcchandler.toLong(), Win32DynamicFfi.objectSlot(lparam), szdesc, wflags.toLong())).toInt()
}

public fun ICLocate(fcctype: UInt, fcchandler: UInt, lpbiin: Long, lpbiout: Long, wflags: UShort): HIC {
    return Win32DynamicFfi.invoke("msvfw32.dll", "ICLocate", longArrayOf(fcctype.toLong(), fcchandler.toLong(), lpbiin, lpbiout, wflags.toLong()))
}

public fun ICOpen(fcctype: UInt, fcchandler: UInt, wmode: UInt): HIC {
    return Win32DynamicFfi.invoke("msvfw32.dll", "ICOpen", longArrayOf(fcctype.toLong(), fcchandler.toLong(), wmode.toLong()))
}

public fun ICOpenFunction(fcctype: UInt, fcchandler: UInt, wmode: UInt, lpfnhandler: Foundation.FARPROC): HIC {
    return Win32DynamicFfi.invoke("msvfw32.dll", "ICOpenFunction", longArrayOf(fcctype.toLong(), fcchandler.toLong(), wmode.toLong(), Win32DynamicFfi.objectSlot(lpfnhandler)))
}

public fun ICRemove(fcctype: UInt, fcchandler: UInt, wflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("msvfw32.dll", "ICRemove", longArrayOf(fcctype.toLong(), fcchandler.toLong(), wflags.toLong())).toInt()
}

public fun ICSendMessage(hic: HIC, msg: UInt, dw1: ULong, dw2: ULong): Foundation.LRESULT {
    Win32DynamicFfi.invoke("msvfw32.dll", "ICSendMessage", longArrayOf(hic, msg.toLong(), dw1.toLong(), dw2.toLong()))
    return Foundation.LRESULT()
}

public fun ICSeqCompressFrame(pc: Long, uiflags: UInt, lpbits: Long, pfkey: Long, plsize: Long): Long {
    return Win32DynamicFfi.invoke("msvfw32.dll", "ICSeqCompressFrame", longArrayOf(pc, uiflags.toLong(), lpbits, pfkey, plsize))
}

public fun ICSeqCompressFrameEnd(pc: Long) {
    Win32DynamicFfi.invoke("msvfw32.dll", "ICSeqCompressFrameEnd", longArrayOf(pc))
}

public fun ICSeqCompressFrameStart(pc: Long, lpbiin: Long): BOOL {
    return Win32DynamicFfi.invoke("msvfw32.dll", "ICSeqCompressFrameStart", longArrayOf(pc, lpbiin)).toInt()
}

public fun MCIWndCreateA(hwndparent: Foundation.HWND, hinstance: Foundation.HINSTANCE, dwstyle: UInt, szfile: PCSTR): Foundation.HWND {
    Win32DynamicFfi.invoke("msvfw32.dll", "MCIWndCreateA", longArrayOf(Win32DynamicFfi.objectSlot(hwndparent), Win32DynamicFfi.objectSlot(hinstance), dwstyle.toLong(), szfile))
    return Foundation.HWND()
}

public fun MCIWndCreateW(hwndparent: Foundation.HWND, hinstance: Foundation.HINSTANCE, dwstyle: UInt, szfile: PCWSTR): Foundation.HWND {
    Win32DynamicFfi.invoke("msvfw32.dll", "MCIWndCreateW", longArrayOf(Win32DynamicFfi.objectSlot(hwndparent), Win32DynamicFfi.objectSlot(hinstance), dwstyle.toLong(), szfile))
    return Foundation.HWND()
}

public fun MCIWndRegisterClass(): BOOL {
    return Win32DynamicFfi.invoke("msvfw32.dll", "MCIWndRegisterClass", longArrayOf()).toInt()
}

public fun OpenDriver(szdrivername: PCWSTR, szsectionname: PCWSTR, lparam2: Foundation.LPARAM): HDRVR {
    return Win32DynamicFfi.invoke("winmm.dll", "OpenDriver", longArrayOf(szdrivername, szsectionname, Win32DynamicFfi.objectSlot(lparam2)))
}

public fun SendDriverMessage(hdriver: HDRVR, message: UInt, lparam1: Foundation.LPARAM, lparam2: Foundation.LPARAM): Foundation.LRESULT {
    Win32DynamicFfi.invoke("winmm.dll", "SendDriverMessage", longArrayOf(hdriver, message.toLong(), Win32DynamicFfi.objectSlot(lparam1), Win32DynamicFfi.objectSlot(lparam2)))
    return Foundation.LRESULT()
}

public fun VideoForWindowsVersion(): UInt {
    return Win32DynamicFfi.invoke("msvfw32.dll", "VideoForWindowsVersion", longArrayOf()).toUInt()
}

public fun capCreateCaptureWindowA(lpszwindowname: PCSTR, dwstyle: UInt, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: Foundation.HWND, nid: Int): Foundation.HWND {
    Win32DynamicFfi.invoke("avicap32.dll", "capCreateCaptureWindowA", longArrayOf(lpszwindowname, dwstyle.toLong(), x.toLong(), y.toLong(), nwidth.toLong(), nheight.toLong(), Win32DynamicFfi.objectSlot(hwndparent), nid.toLong()))
    return Foundation.HWND()
}

public fun capCreateCaptureWindowW(lpszwindowname: PCWSTR, dwstyle: UInt, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: Foundation.HWND, nid: Int): Foundation.HWND {
    Win32DynamicFfi.invoke("avicap32.dll", "capCreateCaptureWindowW", longArrayOf(lpszwindowname, dwstyle.toLong(), x.toLong(), y.toLong(), nwidth.toLong(), nheight.toLong(), Win32DynamicFfi.objectSlot(hwndparent), nid.toLong()))
    return Foundation.HWND()
}

public fun capGetDriverDescriptionA(wdriverindex: UInt, lpszname: PSTR, cbname: Int, lpszver: PSTR, cbver: Int): BOOL {
    return Win32DynamicFfi.invoke("avicap32.dll", "capGetDriverDescriptionA", longArrayOf(wdriverindex.toLong(), lpszname, cbname.toLong(), lpszver, cbver.toLong())).toInt()
}

public fun capGetDriverDescriptionW(wdriverindex: UInt, lpszname: PWSTR, cbname: Int, lpszver: PWSTR, cbver: Int): BOOL {
    return Win32DynamicFfi.invoke("avicap32.dll", "capGetDriverDescriptionW", longArrayOf(wdriverindex.toLong(), lpszname, cbname.toLong(), lpszver, cbver.toLong())).toInt()
}

public fun joyGetDevCapsA(ujoyid: ULong, pjc: Long, cbjc: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "joyGetDevCapsA", longArrayOf(ujoyid.toLong(), pjc, cbjc.toLong())).toUInt()
}

public fun joyGetDevCapsW(ujoyid: ULong, pjc: Long, cbjc: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "joyGetDevCapsW", longArrayOf(ujoyid.toLong(), pjc, cbjc.toLong())).toUInt()
}

public fun joyGetNumDevs(): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "joyGetNumDevs", longArrayOf()).toUInt()
}

public fun joyGetPos(ujoyid: UInt, pji: Long): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "joyGetPos", longArrayOf(ujoyid.toLong(), pji)).toUInt()
}

public fun joyGetPosEx(ujoyid: UInt, pji: Long): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "joyGetPosEx", longArrayOf(ujoyid.toLong(), pji)).toUInt()
}

public fun joyGetThreshold(ujoyid: UInt, puthreshold: Long): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "joyGetThreshold", longArrayOf(ujoyid.toLong(), puthreshold)).toUInt()
}

public fun joyReleaseCapture(ujoyid: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "joyReleaseCapture", longArrayOf(ujoyid.toLong())).toUInt()
}

public fun joySetCapture(hwnd: Foundation.HWND, ujoyid: UInt, uperiod: UInt, fchanged: BOOL): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "joySetCapture", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), ujoyid.toLong(), uperiod.toLong(), fchanged.toLong())).toUInt()
}

public fun joySetThreshold(ujoyid: UInt, uthreshold: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "joySetThreshold", longArrayOf(ujoyid.toLong(), uthreshold.toLong())).toUInt()
}

public fun mciDriverNotify(hwndcallback: Foundation.HANDLE, wdeviceid: UInt, ustatus: UInt): BOOL {
    return Win32DynamicFfi.invoke("winmm.dll", "mciDriverNotify", longArrayOf(Win32DynamicFfi.objectSlot(hwndcallback), wdeviceid.toLong(), ustatus.toLong())).toInt()
}

public fun mciDriverYield(wdeviceid: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "mciDriverYield", longArrayOf(wdeviceid.toLong())).toUInt()
}

public fun mciFreeCommandResource(wtable: UInt): BOOL {
    return Win32DynamicFfi.invoke("winmm.dll", "mciFreeCommandResource", longArrayOf(wtable.toLong())).toInt()
}

public fun mciGetCreatorTask(mciid: UInt): HTASK {
    return Win32DynamicFfi.invoke("winmm.dll", "mciGetCreatorTask", longArrayOf(mciid.toLong()))
}

public fun mciGetDeviceIDA(pszdevice: PCSTR): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "mciGetDeviceIDA", longArrayOf(pszdevice)).toUInt()
}

public fun mciGetDeviceIDFromElementIDA(dwelementid: UInt, lpstrtype: PCSTR): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "mciGetDeviceIDFromElementIDA", longArrayOf(dwelementid.toLong(), lpstrtype)).toUInt()
}

public fun mciGetDeviceIDFromElementIDW(dwelementid: UInt, lpstrtype: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "mciGetDeviceIDFromElementIDW", longArrayOf(dwelementid.toLong(), lpstrtype)).toUInt()
}

public fun mciGetDeviceIDW(pszdevice: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "mciGetDeviceIDW", longArrayOf(pszdevice)).toUInt()
}

public fun mciGetDriverData(wdeviceid: UInt): ULong {
    return Win32DynamicFfi.invoke("winmm.dll", "mciGetDriverData", longArrayOf(wdeviceid.toLong())).toULong()
}

public fun mciGetErrorStringA(mcierr: UInt, psztext: PSTR, cchtext: UInt): BOOL {
    return Win32DynamicFfi.invoke("winmm.dll", "mciGetErrorStringA", longArrayOf(mcierr.toLong(), psztext, cchtext.toLong())).toInt()
}

public fun mciGetErrorStringW(mcierr: UInt, psztext: PWSTR, cchtext: UInt): BOOL {
    return Win32DynamicFfi.invoke("winmm.dll", "mciGetErrorStringW", longArrayOf(mcierr.toLong(), psztext, cchtext.toLong())).toInt()
}

public fun mciGetYieldProc(mciid: UInt, pdwyielddata: Long): YIELDPROC {
    val rawRet = Win32DynamicFfi.invoke("winmm.dll", "mciGetYieldProc", longArrayOf(mciid.toLong(), pdwyielddata))
    return if (rawRet == 0L) null else YIELDPROCFn { _, _ -> 0u }
}

public fun mciLoadCommandResource(hinstance: Foundation.HANDLE, lpresname: PCWSTR, wtype: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "mciLoadCommandResource", longArrayOf(Win32DynamicFfi.objectSlot(hinstance), lpresname, wtype.toLong())).toUInt()
}

public fun mciSendCommandA(mciid: UInt, umsg: UInt, dwparam1: ULong, dwparam2: ULong): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "mciSendCommandA", longArrayOf(mciid.toLong(), umsg.toLong(), dwparam1.toLong(), dwparam2.toLong())).toUInt()
}

public fun mciSendCommandW(mciid: UInt, umsg: UInt, dwparam1: ULong, dwparam2: ULong): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "mciSendCommandW", longArrayOf(mciid.toLong(), umsg.toLong(), dwparam1.toLong(), dwparam2.toLong())).toUInt()
}

public fun mciSendStringA(lpstrcommand: PCSTR, lpstrreturnstring: PSTR, ureturnlength: UInt, hwndcallback: Foundation.HWND): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "mciSendStringA", longArrayOf(lpstrcommand, lpstrreturnstring, ureturnlength.toLong(), Win32DynamicFfi.objectSlot(hwndcallback))).toUInt()
}

public fun mciSendStringW(lpstrcommand: PCWSTR, lpstrreturnstring: PWSTR, ureturnlength: UInt, hwndcallback: Foundation.HWND): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "mciSendStringW", longArrayOf(lpstrcommand, lpstrreturnstring, ureturnlength.toLong(), Win32DynamicFfi.objectSlot(hwndcallback))).toUInt()
}

public fun mciSetDriverData(wdeviceid: UInt, dwdata: ULong): BOOL {
    return Win32DynamicFfi.invoke("winmm.dll", "mciSetDriverData", longArrayOf(wdeviceid.toLong(), dwdata.toLong())).toInt()
}

public fun mciSetYieldProc(mciid: UInt, fpyieldproc: YIELDPROC, dwyielddata: UInt): BOOL {
    return Win32DynamicFfi.invoke("winmm.dll", "mciSetYieldProc", longArrayOf(mciid.toLong(), Win32DynamicFfi.objectSlot(fpyieldproc), dwyielddata.toLong())).toInt()
}

public fun mmDrvInstall(hdriver: HDRVR, wszdrventry: PCWSTR, drvmessage: DRIVERMSGPROC, wflags: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "mmDrvInstall", longArrayOf(hdriver, wszdrventry, Win32DynamicFfi.objectSlot(drvmessage), wflags.toLong())).toUInt()
}

public fun mmGetCurrentTask(): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "mmGetCurrentTask", longArrayOf()).toUInt()
}

public fun mmTaskBlock(h: UInt) {
    Win32DynamicFfi.invoke("winmm.dll", "mmTaskBlock", longArrayOf(h.toLong()))
}

public fun mmTaskCreate(lpfn: LPTASKCALLBACK, lph: Long, dwinst: ULong): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "mmTaskCreate", longArrayOf(Win32DynamicFfi.objectSlot(lpfn), lph, dwinst.toLong())).toUInt()
}

public fun mmTaskSignal(h: UInt): BOOL {
    return Win32DynamicFfi.invoke("winmm.dll", "mmTaskSignal", longArrayOf(h.toLong())).toInt()
}

public fun mmTaskYield() {
    Win32DynamicFfi.invoke("winmm.dll", "mmTaskYield", longArrayOf())
}

public fun mmioAdvance(hmmio: HMMIO, pmmioinfo: Long, fuadvance: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "mmioAdvance", longArrayOf(hmmio, pmmioinfo, fuadvance.toLong())).toUInt()
}

public fun mmioAscend(hmmio: HMMIO, pmmcki: Long, fuascend: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "mmioAscend", longArrayOf(hmmio, pmmcki, fuascend.toLong())).toUInt()
}

public fun mmioClose(hmmio: HMMIO, fuclose: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "mmioClose", longArrayOf(hmmio, fuclose.toLong())).toUInt()
}

public fun mmioCreateChunk(hmmio: HMMIO, pmmcki: Long, fucreate: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "mmioCreateChunk", longArrayOf(hmmio, pmmcki, fucreate.toLong())).toUInt()
}

public fun mmioDescend(hmmio: HMMIO, pmmcki: Long, pmmckiparent: Long, fudescend: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "mmioDescend", longArrayOf(hmmio, pmmcki, pmmckiparent, fudescend.toLong())).toUInt()
}

public fun mmioFlush(hmmio: HMMIO, fuflush: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "mmioFlush", longArrayOf(hmmio, fuflush.toLong())).toUInt()
}

public fun mmioGetInfo(hmmio: HMMIO, pmmioinfo: Long, fuinfo: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "mmioGetInfo", longArrayOf(hmmio, pmmioinfo, fuinfo.toLong())).toUInt()
}

public fun mmioInstallIOProcA(fccioproc: UInt, pioproc: LPMMIOPROC, dwflags: UInt): LPMMIOPROC {
    val rawRet = Win32DynamicFfi.invoke("winmm.dll", "mmioInstallIOProcA", longArrayOf(fccioproc.toLong(), Win32DynamicFfi.objectSlot(pioproc), dwflags.toLong()))
    return if (rawRet == 0L) null else LPMMIOPROCFn { _, _, _, _ -> 0L }
}

public fun mmioInstallIOProcW(fccioproc: UInt, pioproc: LPMMIOPROC, dwflags: UInt): LPMMIOPROC {
    val rawRet = Win32DynamicFfi.invoke("winmm.dll", "mmioInstallIOProcW", longArrayOf(fccioproc.toLong(), Win32DynamicFfi.objectSlot(pioproc), dwflags.toLong()))
    return if (rawRet == 0L) null else LPMMIOPROCFn { _, _, _, _ -> 0L }
}

public fun mmioOpenA(pszfilename: PSTR, pmmioinfo: Long, fdwopen: UInt): HMMIO {
    return Win32DynamicFfi.invoke("winmm.dll", "mmioOpenA", longArrayOf(pszfilename, pmmioinfo, fdwopen.toLong()))
}

public fun mmioOpenW(pszfilename: PWSTR, pmmioinfo: Long, fdwopen: UInt): HMMIO {
    return Win32DynamicFfi.invoke("winmm.dll", "mmioOpenW", longArrayOf(pszfilename, pmmioinfo, fdwopen.toLong()))
}

public fun mmioRead(hmmio: HMMIO, pch: Long, cch: Int): Int {
    return Win32DynamicFfi.invoke("winmm.dll", "mmioRead", longArrayOf(hmmio, pch, cch.toLong())).toInt()
}

public fun mmioRenameA(pszfilename: PCSTR, psznewfilename: PCSTR, pmmioinfo: Long, fdwrename: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "mmioRenameA", longArrayOf(pszfilename, psznewfilename, pmmioinfo, fdwrename.toLong())).toUInt()
}

public fun mmioRenameW(pszfilename: PCWSTR, psznewfilename: PCWSTR, pmmioinfo: Long, fdwrename: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "mmioRenameW", longArrayOf(pszfilename, psznewfilename, pmmioinfo, fdwrename.toLong())).toUInt()
}

public fun mmioSeek(hmmio: HMMIO, loffset: Int, iorigin: Int): Int {
    return Win32DynamicFfi.invoke("winmm.dll", "mmioSeek", longArrayOf(hmmio, loffset.toLong(), iorigin.toLong())).toInt()
}

public fun mmioSendMessage(hmmio: HMMIO, umsg: UInt, lparam1: Foundation.LPARAM, lparam2: Foundation.LPARAM): Foundation.LRESULT {
    Win32DynamicFfi.invoke("winmm.dll", "mmioSendMessage", longArrayOf(hmmio, umsg.toLong(), Win32DynamicFfi.objectSlot(lparam1), Win32DynamicFfi.objectSlot(lparam2)))
    return Foundation.LRESULT()
}

public fun mmioSetBuffer(hmmio: HMMIO, pchbuffer: PSTR, cchbuffer: Int, fubuffer: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "mmioSetBuffer", longArrayOf(hmmio, pchbuffer, cchbuffer.toLong(), fubuffer.toLong())).toUInt()
}

public fun mmioSetInfo(hmmio: HMMIO, pmmioinfo: Long, fuinfo: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "mmioSetInfo", longArrayOf(hmmio, pmmioinfo, fuinfo.toLong())).toUInt()
}

public fun mmioStringToFOURCCA(sz: PCSTR, uflags: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "mmioStringToFOURCCA", longArrayOf(sz, uflags.toLong())).toUInt()
}

public fun mmioStringToFOURCCW(sz: PCWSTR, uflags: UInt): UInt {
    return Win32DynamicFfi.invoke("winmm.dll", "mmioStringToFOURCCW", longArrayOf(sz, uflags.toLong())).toUInt()
}

public fun mmioWrite(hmmio: HMMIO, pch: PCSTR, cch: Int): Int {
    return Win32DynamicFfi.invoke("winmm.dll", "mmioWrite", longArrayOf(hmmio, pch, cch.toLong())).toInt()
}

public fun sndOpenSound(eventname: PCWSTR, appname: PCWSTR, flags: Int, filehandle: Long): Int {
    return Win32DynamicFfi.invoke("api-ms-win-mm-misc-l1-1-1.dll", "sndOpenSound", longArrayOf(eventname, appname, flags.toLong(), filehandle)).toInt()
}
