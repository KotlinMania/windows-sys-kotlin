@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

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

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun aVIBuildFilterA(lpszfilter: Pstr, cbfilter: Int, fsaving: Bool): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaAVIBuildFilterA")

public actual fun aVIBuildFilterW(lpszfilter: Pwstr, cbfilter: Int, fsaving: Bool): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaAVIBuildFilterW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32MediaMultimediaAVIClearClipboard")
private external fun wasiWindowssysWindowsWin32MediaMultimediaAVIClearClipboard(): Int

public actual fun aVIClearClipboard(): Hresult =
    wasiWindowssysWindowsWin32MediaMultimediaAVIClearClipboard()

public actual fun aVIFileAddRef(pfile: MutPtr<CVoid>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaAVIFileAddRef")

public actual fun aVIFileCreateStreamA(pfile: MutPtr<CVoid>, ppavi: MutPtr<MutPtr<CVoid>>, psi: ConstPtr<Avistreaminfoa>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaAVIFileCreateStreamA")

public actual fun aVIFileCreateStreamW(pfile: MutPtr<CVoid>, ppavi: MutPtr<MutPtr<CVoid>>, psi: ConstPtr<Avistreaminfow>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaAVIFileCreateStreamW")

public actual fun aVIFileEndRecord(pfile: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaAVIFileEndRecord")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32MediaMultimediaAVIFileExit")
private external fun wasiWindowssysWindowsWin32MediaMultimediaAVIFileExit(): Unit

public actual fun aVIFileExit(): Unit =
    wasiWindowssysWindowsWin32MediaMultimediaAVIFileExit()

public actual fun aVIFileGetStream(pfile: MutPtr<CVoid>, ppavi: MutPtr<MutPtr<CVoid>>, fcctype: UInt, lparam: Int): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaAVIFileGetStream")

public actual fun aVIFileInfoA(pfile: MutPtr<CVoid>, pfi: MutPtr<Avifileinfoa>, lsize: Int): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaAVIFileInfoA")

public actual fun aVIFileInfoW(pfile: MutPtr<CVoid>, pfi: MutPtr<Avifileinfow>, lsize: Int): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaAVIFileInfoW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32MediaMultimediaAVIFileInit")
private external fun wasiWindowssysWindowsWin32MediaMultimediaAVIFileInit(): Unit

public actual fun aVIFileInit(): Unit =
    wasiWindowssysWindowsWin32MediaMultimediaAVIFileInit()

public actual fun aVIFileOpenA(ppfile: MutPtr<MutPtr<CVoid>>, szfile: Pcstr, umode: UInt, lphandler: ConstPtr<Guid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaAVIFileOpenA")

public actual fun aVIFileOpenW(ppfile: MutPtr<MutPtr<CVoid>>, szfile: Pcwstr, umode: UInt, lphandler: ConstPtr<Guid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaAVIFileOpenW")

public actual fun aVIFileReadData(pfile: MutPtr<CVoid>, ckid: UInt, lpdata: MutPtr<CVoid>, lpcbdata: MutPtr<Int>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaAVIFileReadData")

public actual fun aVIFileRelease(pfile: MutPtr<CVoid>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaAVIFileRelease")

public actual fun aVIFileWriteData(pfile: MutPtr<CVoid>, ckid: UInt, lpdata: ConstPtr<CVoid>, cbdata: Int): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaAVIFileWriteData")

public actual fun aVIGetFromClipboard(lppf: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaAVIGetFromClipboard")

public actual fun aVIMakeCompressedStream(ppscompressed: MutPtr<MutPtr<CVoid>>, ppssource: MutPtr<CVoid>, lpoptions: ConstPtr<Avicompressoptions>, pclsidhandler: ConstPtr<Guid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaAVIMakeCompressedStream")

public actual fun aVIMakeFileFromStreams(ppfile: MutPtr<MutPtr<CVoid>>, nstreams: Int, papstreams: ConstPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaAVIMakeFileFromStreams")

public actual fun aVIMakeStreamFromClipboard(cfformat: UInt, hglobal: Handle, ppstream: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaAVIMakeStreamFromClipboard")

public actual fun aVIPutFileOnClipboard(pf: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaAVIPutFileOnClipboard")

public actual fun aVISaveA(szfile: Pcstr, pclsidhandler: ConstPtr<Guid>, lpfncallback: Avisavecallback, nstreams: Int, pfile: MutPtr<CVoid>, lpoptions: ConstPtr<Avicompressoptions>, vararg variadicArgs: Long): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaAVISaveA")

public actual fun aVISaveOptions(hwnd: Hwnd, uiflags: UInt, nstreams: Int, ppavi: ConstPtr<MutPtr<CVoid>>, plpoptions: MutPtr<MutPtr<Avicompressoptions>>): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaAVISaveOptions")

public actual fun aVISaveOptionsFree(nstreams: Int, plpoptions: ConstPtr<ConstPtr<Avicompressoptions>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaAVISaveOptionsFree")

public actual fun aVISaveVA(szfile: Pcstr, pclsidhandler: ConstPtr<Guid>, lpfncallback: Avisavecallback, nstreams: Int, ppavi: ConstPtr<MutPtr<CVoid>>, plpoptions: ConstPtr<ConstPtr<Avicompressoptions>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaAVISaveVA")

public actual fun aVISaveVW(szfile: Pcwstr, pclsidhandler: ConstPtr<Guid>, lpfncallback: Avisavecallback, nstreams: Int, ppavi: ConstPtr<MutPtr<CVoid>>, plpoptions: ConstPtr<ConstPtr<Avicompressoptions>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaAVISaveVW")

public actual fun aVISaveW(szfile: Pcwstr, pclsidhandler: ConstPtr<Guid>, lpfncallback: Avisavecallback, nstreams: Int, pfile: MutPtr<CVoid>, lpoptions: ConstPtr<Avicompressoptions>, vararg variadicArgs: Long): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaAVISaveW")

public actual fun aVIStreamAddRef(pavi: MutPtr<CVoid>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaAVIStreamAddRef")

public actual fun aVIStreamBeginStreaming(pavi: MutPtr<CVoid>, lstart: Int, lend: Int, lrate: Int): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaAVIStreamBeginStreaming")

public actual fun aVIStreamCreate(ppavi: MutPtr<MutPtr<CVoid>>, lparam1: Int, lparam2: Int, pclsidhandler: ConstPtr<Guid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaAVIStreamCreate")

public actual fun aVIStreamEndStreaming(pavi: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaAVIStreamEndStreaming")

public actual fun aVIStreamFindSample(pavi: MutPtr<CVoid>, lpos: Int, lflags: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaAVIStreamFindSample")

public actual fun aVIStreamGetFrame(pg: MutPtr<CVoid>, lpos: Int): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaAVIStreamGetFrame")

public actual fun aVIStreamGetFrameClose(pg: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaAVIStreamGetFrameClose")

public actual fun aVIStreamGetFrameOpen(pavi: MutPtr<CVoid>, lpbiwanted: ConstPtr<Bitmapinfoheader>): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaAVIStreamGetFrameOpen")

public actual fun aVIStreamInfoA(pavi: MutPtr<CVoid>, psi: MutPtr<Avistreaminfoa>, lsize: Int): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaAVIStreamInfoA")

public actual fun aVIStreamInfoW(pavi: MutPtr<CVoid>, psi: MutPtr<Avistreaminfow>, lsize: Int): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaAVIStreamInfoW")

public actual fun aVIStreamLength(pavi: MutPtr<CVoid>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaAVIStreamLength")

public actual fun aVIStreamOpenFromFileA(ppavi: MutPtr<MutPtr<CVoid>>, szfile: Pcstr, fcctype: UInt, lparam: Int, mode: UInt, pclsidhandler: ConstPtr<Guid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaAVIStreamOpenFromFileA")

public actual fun aVIStreamOpenFromFileW(ppavi: MutPtr<MutPtr<CVoid>>, szfile: Pcwstr, fcctype: UInt, lparam: Int, mode: UInt, pclsidhandler: ConstPtr<Guid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaAVIStreamOpenFromFileW")

public actual fun aVIStreamRead(pavi: MutPtr<CVoid>, lstart: Int, lsamples: Int, lpbuffer: MutPtr<CVoid>, cbbuffer: Int, plbytes: MutPtr<Int>, plsamples: MutPtr<Int>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaAVIStreamRead")

public actual fun aVIStreamReadData(pavi: MutPtr<CVoid>, fcc: UInt, lp: MutPtr<CVoid>, lpcb: MutPtr<Int>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaAVIStreamReadData")

public actual fun aVIStreamReadFormat(pavi: MutPtr<CVoid>, lpos: Int, lpformat: MutPtr<CVoid>, lpcbformat: MutPtr<Int>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaAVIStreamReadFormat")

public actual fun aVIStreamRelease(pavi: MutPtr<CVoid>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaAVIStreamRelease")

public actual fun aVIStreamSampleToTime(pavi: MutPtr<CVoid>, lsample: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaAVIStreamSampleToTime")

public actual fun aVIStreamSetFormat(pavi: MutPtr<CVoid>, lpos: Int, lpformat: ConstPtr<CVoid>, cbformat: Int): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaAVIStreamSetFormat")

public actual fun aVIStreamStart(pavi: MutPtr<CVoid>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaAVIStreamStart")

public actual fun aVIStreamTimeToSample(pavi: MutPtr<CVoid>, ltime: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaAVIStreamTimeToSample")

public actual fun aVIStreamWrite(pavi: MutPtr<CVoid>, lstart: Int, lsamples: Int, lpbuffer: ConstPtr<CVoid>, cbbuffer: Int, dwflags: UInt, plsampwritten: MutPtr<Int>, plbyteswritten: MutPtr<Int>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaAVIStreamWrite")

public actual fun aVIStreamWriteData(pavi: MutPtr<CVoid>, fcc: UInt, lp: ConstPtr<CVoid>, cb: Int): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaAVIStreamWriteData")

public actual fun closeDriver(hdriver: Hdrvr, lparam1: Lparam, lparam2: Lparam): Lresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaCloseDriver")

public actual fun createEditableStream(ppseditable: MutPtr<MutPtr<CVoid>>, pssource: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaCreateEditableStream")

public actual fun defDriverProc(dwdriveridentifier: ULong, hdrvr: Hdrvr, umsg: UInt, lparam1: Lparam, lparam2: Lparam): Lresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaDefDriverProc")

public actual fun drawDibBegin(hdd: Long, hdc: Hdc, dxdst: Int, dydst: Int, lpbi: ConstPtr<Bitmapinfoheader>, dxsrc: Int, dysrc: Int, wflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaDrawDibBegin")

public actual fun drawDibChangePalette(hdd: Long, istart: Int, ilen: Int, lppe: ConstPtr<Paletteentry>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaDrawDibChangePalette")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32MediaMultimediaDrawDibClose")
private external fun wasiWindowssysWindowsWin32MediaMultimediaDrawDibClose(hdd: Long): Int

public actual fun drawDibClose(hdd: Long): Bool =
    wasiWindowssysWindowsWin32MediaMultimediaDrawDibClose(hdd)

public actual fun drawDibDraw(hdd: Long, hdc: Hdc, xdst: Int, ydst: Int, dxdst: Int, dydst: Int, lpbi: ConstPtr<Bitmapinfoheader>, lpbits: ConstPtr<CVoid>, xsrc: Int, ysrc: Int, dxsrc: Int, dysrc: Int, wflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaDrawDibDraw")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32MediaMultimediaDrawDibEnd")
private external fun wasiWindowssysWindowsWin32MediaMultimediaDrawDibEnd(hdd: Long): Int

public actual fun drawDibEnd(hdd: Long): Bool =
    wasiWindowssysWindowsWin32MediaMultimediaDrawDibEnd(hdd)

public actual fun drawDibGetBuffer(hdd: Long, lpbi: MutPtr<Bitmapinfoheader>, dwsize: UInt, dwflags: UInt): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaDrawDibGetBuffer")

public actual fun drawDibGetPalette(hdd: Long): Hpalette =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaDrawDibGetPalette")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32MediaMultimediaDrawDibOpen")
private external fun wasiWindowssysWindowsWin32MediaMultimediaDrawDibOpen(): Long

public actual fun drawDibOpen(): Long =
    wasiWindowssysWindowsWin32MediaMultimediaDrawDibOpen()

public actual fun drawDibProfileDisplay(lpbi: ConstPtr<Bitmapinfoheader>): Lresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaDrawDibProfileDisplay")

public actual fun drawDibRealize(hdd: Long, hdc: Hdc, fbackground: Bool): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaDrawDibRealize")

public actual fun drawDibSetPalette(hdd: Long, hpal: Hpalette): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaDrawDibSetPalette")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32MediaMultimediaDrawDibStart")
private external fun wasiWindowssysWindowsWin32MediaMultimediaDrawDibStart(hdd: Long, rate: Int): Int

public actual fun drawDibStart(hdd: Long, rate: UInt): Bool =
    wasiWindowssysWindowsWin32MediaMultimediaDrawDibStart(hdd, rate.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32MediaMultimediaDrawDibStop")
private external fun wasiWindowssysWindowsWin32MediaMultimediaDrawDibStop(hdd: Long): Int

public actual fun drawDibStop(hdd: Long): Bool =
    wasiWindowssysWindowsWin32MediaMultimediaDrawDibStop(hdd)

public actual fun drawDibTime(hdd: Long, lpddtime: MutPtr<Drawdibtime>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaDrawDibTime")

public actual fun driverCallback(dwcallback: ULong, dwflags: UInt, hdevice: Hdrvr, dwmsg: UInt, dwuser: ULong, dwparam1: ULong, dwparam2: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaDriverCallback")

public actual fun drvGetModuleHandle(hdriver: Hdrvr): Hmodule =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaDrvGetModuleHandle")

public actual fun editStreamClone(pavi: MutPtr<CVoid>, ppresult: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaEditStreamClone")

public actual fun editStreamCopy(pavi: MutPtr<CVoid>, plstart: MutPtr<Int>, pllength: MutPtr<Int>, ppresult: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaEditStreamCopy")

public actual fun editStreamCut(pavi: MutPtr<CVoid>, plstart: MutPtr<Int>, pllength: MutPtr<Int>, ppresult: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaEditStreamCut")

public actual fun editStreamPaste(pavi: MutPtr<CVoid>, plpos: MutPtr<Int>, pllength: MutPtr<Int>, pstream: MutPtr<CVoid>, lstart: Int, lend: Int): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaEditStreamPaste")

public actual fun editStreamSetInfoA(pavi: MutPtr<CVoid>, lpinfo: ConstPtr<Avistreaminfoa>, cbinfo: Int): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaEditStreamSetInfoA")

public actual fun editStreamSetInfoW(pavi: MutPtr<CVoid>, lpinfo: ConstPtr<Avistreaminfow>, cbinfo: Int): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaEditStreamSetInfoW")

public actual fun editStreamSetNameA(pavi: MutPtr<CVoid>, lpszname: Pcstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaEditStreamSetNameA")

public actual fun editStreamSetNameW(pavi: MutPtr<CVoid>, lpszname: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaEditStreamSetNameW")

public actual fun getDriverModuleHandle(hdriver: Hdrvr): Hmodule =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaGetDriverModuleHandle")

public actual fun getOpenFileNamePreviewA(lpofn: MutPtr<Openfilenamea>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaGetOpenFileNamePreviewA")

public actual fun getOpenFileNamePreviewW(lpofn: MutPtr<Openfilenamew>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaGetOpenFileNamePreviewW")

public actual fun getSaveFileNamePreviewA(lpofn: MutPtr<Openfilenamea>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaGetSaveFileNamePreviewA")

public actual fun getSaveFileNamePreviewW(lpofn: MutPtr<Openfilenamew>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaGetSaveFileNamePreviewW")

public actual fun iCClose(hic: Hic): Lresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaICClose")

public actual fun iCCompress(hic: Hic, dwflags: UInt, lpbioutput: ConstPtr<Bitmapinfoheader>, lpdata: MutPtr<CVoid>, lpbiinput: ConstPtr<Bitmapinfoheader>, lpbits: ConstPtr<CVoid>, lpckid: MutPtr<UInt>, lpdwflags: MutPtr<UInt>, lframenum: Int, dwframesize: UInt, dwquality: UInt, lpbiprev: ConstPtr<Bitmapinfoheader>, lpprev: ConstPtr<CVoid>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaICCompress")

public actual fun iCCompressorChoose(hwnd: Hwnd, uiflags: UInt, pvin: ConstPtr<CVoid>, lpdata: ConstPtr<CVoid>, pc: MutPtr<Compvars>, lpsztitle: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaICCompressorChoose")

public actual fun iCCompressorFree(pc: ConstPtr<Compvars>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaICCompressorFree")

public actual fun iCDecompress(hic: Hic, dwflags: UInt, lpbiformat: ConstPtr<Bitmapinfoheader>, lpdata: ConstPtr<CVoid>, lpbi: ConstPtr<Bitmapinfoheader>, lpbits: MutPtr<CVoid>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaICDecompress")

public actual fun iCDraw(hic: Hic, dwflags: UInt, lpformat: ConstPtr<CVoid>, lpdata: ConstPtr<CVoid>, cbdata: UInt, ltime: Int): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaICDraw")

public actual fun iCDrawBegin(hic: Hic, dwflags: UInt, hpal: Hpalette, hwnd: Hwnd, hdc: Hdc, xdst: Int, ydst: Int, dxdst: Int, dydst: Int, lpbi: ConstPtr<Bitmapinfoheader>, xsrc: Int, ysrc: Int, dxsrc: Int, dysrc: Int, dwrate: UInt, dwscale: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaICDrawBegin")

public actual fun iCGetDisplayFormat(hic: Hic, lpbiin: ConstPtr<Bitmapinfoheader>, lpbiout: MutPtr<Bitmapinfoheader>, bitdepth: Int, dx: Int, dy: Int): Hic =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaICGetDisplayFormat")

public actual fun iCGetInfo(hic: Hic, picinfo: MutPtr<Icinfo>, cb: UInt): Lresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaICGetInfo")

public actual fun iCImageCompress(hic: Hic, uiflags: UInt, lpbiin: ConstPtr<Bitmapinfo>, lpbits: ConstPtr<CVoid>, lpbiout: ConstPtr<Bitmapinfo>, lquality: Int, plsize: MutPtr<Int>): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaICImageCompress")

public actual fun iCImageDecompress(hic: Hic, uiflags: UInt, lpbiin: ConstPtr<Bitmapinfo>, lpbits: ConstPtr<CVoid>, lpbiout: ConstPtr<Bitmapinfo>): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaICImageDecompress")

public actual fun iCInfo(fcctype: UInt, fcchandler: UInt, lpicinfo: MutPtr<Icinfo>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaICInfo")

public actual fun iCInstall(fcctype: UInt, fcchandler: UInt, lparam: Lparam, szdesc: Pcstr, wflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaICInstall")

public actual fun iCLocate(fcctype: UInt, fcchandler: UInt, lpbiin: ConstPtr<Bitmapinfoheader>, lpbiout: ConstPtr<Bitmapinfoheader>, wflags: UShort): Hic =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaICLocate")

public actual fun iCOpen(fcctype: UInt, fcchandler: UInt, wmode: UInt): Hic =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaICOpen")

public actual fun iCOpenFunction(fcctype: UInt, fcchandler: UInt, wmode: UInt, lpfnhandler: Farproc): Hic =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaICOpenFunction")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32MediaMultimediaICRemove")
private external fun wasiWindowssysWindowsWin32MediaMultimediaICRemove(fcctype: Int, fcchandler: Int, wflags: Int): Int

public actual fun iCRemove(fcctype: UInt, fcchandler: UInt, wflags: UInt): Bool =
    wasiWindowssysWindowsWin32MediaMultimediaICRemove(fcctype.toInt(), fcchandler.toInt(), wflags.toInt())

public actual fun iCSendMessage(hic: Hic, msg: UInt, dw1: ULong, dw2: ULong): Lresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaICSendMessage")

public actual fun iCSeqCompressFrame(pc: ConstPtr<Compvars>, uiflags: UInt, lpbits: ConstPtr<CVoid>, pfkey: MutPtr<Bool>, plsize: MutPtr<Int>): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaICSeqCompressFrame")

public actual fun iCSeqCompressFrameEnd(pc: ConstPtr<Compvars>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaICSeqCompressFrameEnd")

public actual fun iCSeqCompressFrameStart(pc: ConstPtr<Compvars>, lpbiin: ConstPtr<Bitmapinfo>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaICSeqCompressFrameStart")

public actual fun mCIWndCreateA(hwndparent: Hwnd, hinstance: Hinstance, dwstyle: UInt, szfile: Pcstr): Hwnd =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaMCIWndCreateA")

public actual fun mCIWndCreateW(hwndparent: Hwnd, hinstance: Hinstance, dwstyle: UInt, szfile: Pcwstr): Hwnd =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaMCIWndCreateW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32MediaMultimediaMCIWndRegisterClass")
private external fun wasiWindowssysWindowsWin32MediaMultimediaMCIWndRegisterClass(): Int

public actual fun mCIWndRegisterClass(): Bool =
    wasiWindowssysWindowsWin32MediaMultimediaMCIWndRegisterClass()

public actual fun openDriver(szdrivername: Pcwstr, szsectionname: Pcwstr, lparam2: Lparam): Hdrvr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaOpenDriver")

public actual fun sendDriverMessage(hdriver: Hdrvr, message: UInt, lparam1: Lparam, lparam2: Lparam): Lresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaSendDriverMessage")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32MediaMultimediaVideoForWindowsVersion")
private external fun wasiWindowssysWindowsWin32MediaMultimediaVideoForWindowsVersion(): Int

public actual fun videoForWindowsVersion(): UInt =
    wasiWindowssysWindowsWin32MediaMultimediaVideoForWindowsVersion().toUInt()

public actual fun capCreateCaptureWindowA(lpszwindowname: Pcstr, dwstyle: UInt, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: Hwnd, nid: Int): Hwnd =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaCapCreateCaptureWindowA")

public actual fun capCreateCaptureWindowW(lpszwindowname: Pcwstr, dwstyle: UInt, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: Hwnd, nid: Int): Hwnd =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaCapCreateCaptureWindowW")

public actual fun capGetDriverDescriptionA(wdriverindex: UInt, lpszname: Pstr, cbname: Int, lpszver: Pstr, cbver: Int): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaCapGetDriverDescriptionA")

public actual fun capGetDriverDescriptionW(wdriverindex: UInt, lpszname: Pwstr, cbname: Int, lpszver: Pwstr, cbver: Int): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaCapGetDriverDescriptionW")

public actual fun joyGetDevCapsA(ujoyid: ULong, pjc: MutPtr<Joycapsa>, cbjc: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaJoyGetDevCapsA")

public actual fun joyGetDevCapsW(ujoyid: ULong, pjc: MutPtr<Joycapsw>, cbjc: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaJoyGetDevCapsW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32MediaMultimediaJoyGetNumDevs")
private external fun wasiWindowssysWindowsWin32MediaMultimediaJoyGetNumDevs(): Int

public actual fun joyGetNumDevs(): UInt =
    wasiWindowssysWindowsWin32MediaMultimediaJoyGetNumDevs().toUInt()

public actual fun joyGetPos(ujoyid: UInt, pji: MutPtr<Joyinfo>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaJoyGetPos")

public actual fun joyGetPosEx(ujoyid: UInt, pji: MutPtr<Joyinfoex>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaJoyGetPosEx")

public actual fun joyGetThreshold(ujoyid: UInt, puthreshold: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaJoyGetThreshold")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32MediaMultimediaJoyReleaseCapture")
private external fun wasiWindowssysWindowsWin32MediaMultimediaJoyReleaseCapture(ujoyid: Int): Int

public actual fun joyReleaseCapture(ujoyid: UInt): UInt =
    wasiWindowssysWindowsWin32MediaMultimediaJoyReleaseCapture(ujoyid.toInt()).toUInt()

public actual fun joySetCapture(hwnd: Hwnd, ujoyid: UInt, uperiod: UInt, fchanged: Bool): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaJoySetCapture")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32MediaMultimediaJoySetThreshold")
private external fun wasiWindowssysWindowsWin32MediaMultimediaJoySetThreshold(ujoyid: Int, uthreshold: Int): Int

public actual fun joySetThreshold(ujoyid: UInt, uthreshold: UInt): UInt =
    wasiWindowssysWindowsWin32MediaMultimediaJoySetThreshold(ujoyid.toInt(), uthreshold.toInt()).toUInt()

public actual fun mciDriverNotify(hwndcallback: Handle, wdeviceid: UInt, ustatus: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaMciDriverNotify")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32MediaMultimediaMciDriverYield")
private external fun wasiWindowssysWindowsWin32MediaMultimediaMciDriverYield(wdeviceid: Int): Int

public actual fun mciDriverYield(wdeviceid: UInt): UInt =
    wasiWindowssysWindowsWin32MediaMultimediaMciDriverYield(wdeviceid.toInt()).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32MediaMultimediaMciFreeCommandResource")
private external fun wasiWindowssysWindowsWin32MediaMultimediaMciFreeCommandResource(wtable: Int): Int

public actual fun mciFreeCommandResource(wtable: UInt): Bool =
    wasiWindowssysWindowsWin32MediaMultimediaMciFreeCommandResource(wtable.toInt())

public actual fun mciGetCreatorTask(mciid: UInt): Htask =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaMciGetCreatorTask")

public actual fun mciGetDeviceIDA(pszdevice: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaMciGetDeviceIDA")

public actual fun mciGetDeviceIDFromElementIDA(dwelementid: UInt, lpstrtype: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaMciGetDeviceIDFromElementIDA")

public actual fun mciGetDeviceIDFromElementIDW(dwelementid: UInt, lpstrtype: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaMciGetDeviceIDFromElementIDW")

public actual fun mciGetDeviceIDW(pszdevice: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaMciGetDeviceIDW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32MediaMultimediaMciGetDriverData")
private external fun wasiWindowssysWindowsWin32MediaMultimediaMciGetDriverData(wdeviceid: Int): Long

public actual fun mciGetDriverData(wdeviceid: UInt): ULong =
    wasiWindowssysWindowsWin32MediaMultimediaMciGetDriverData(wdeviceid.toInt()).toULong()

public actual fun mciGetErrorStringA(mcierr: UInt, psztext: Pstr, cchtext: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaMciGetErrorStringA")

public actual fun mciGetErrorStringW(mcierr: UInt, psztext: Pwstr, cchtext: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaMciGetErrorStringW")

public actual fun mciGetYieldProc(mciid: UInt, pdwyielddata: ConstPtr<UInt>): Yieldproc =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaMciGetYieldProc")

public actual fun mciLoadCommandResource(hinstance: Handle, lpresname: Pcwstr, wtype: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaMciLoadCommandResource")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32MediaMultimediaMciSendCommandA")
private external fun wasiWindowssysWindowsWin32MediaMultimediaMciSendCommandA(mciid: Int, umsg: Int, dwparam1: Long, dwparam2: Long): Int

public actual fun mciSendCommandA(mciid: UInt, umsg: UInt, dwparam1: ULong, dwparam2: ULong): UInt =
    wasiWindowssysWindowsWin32MediaMultimediaMciSendCommandA(mciid.toInt(), umsg.toInt(), dwparam1.toLong(), dwparam2.toLong()).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32MediaMultimediaMciSendCommandW")
private external fun wasiWindowssysWindowsWin32MediaMultimediaMciSendCommandW(mciid: Int, umsg: Int, dwparam1: Long, dwparam2: Long): Int

public actual fun mciSendCommandW(mciid: UInt, umsg: UInt, dwparam1: ULong, dwparam2: ULong): UInt =
    wasiWindowssysWindowsWin32MediaMultimediaMciSendCommandW(mciid.toInt(), umsg.toInt(), dwparam1.toLong(), dwparam2.toLong()).toUInt()

public actual fun mciSendStringA(lpstrcommand: Pcstr, lpstrreturnstring: Pstr, ureturnlength: UInt, hwndcallback: Hwnd): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaMciSendStringA")

public actual fun mciSendStringW(lpstrcommand: Pcwstr, lpstrreturnstring: Pwstr, ureturnlength: UInt, hwndcallback: Hwnd): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaMciSendStringW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32MediaMultimediaMciSetDriverData")
private external fun wasiWindowssysWindowsWin32MediaMultimediaMciSetDriverData(wdeviceid: Int, dwdata: Long): Int

public actual fun mciSetDriverData(wdeviceid: UInt, dwdata: ULong): Bool =
    wasiWindowssysWindowsWin32MediaMultimediaMciSetDriverData(wdeviceid.toInt(), dwdata.toLong())

public actual fun mciSetYieldProc(mciid: UInt, fpyieldproc: Yieldproc, dwyielddata: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaMciSetYieldProc")

public actual fun mmDrvInstall(hdriver: Hdrvr, wszdrventry: Pcwstr, drvmessage: Drivermsgproc, wflags: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaMmDrvInstall")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32MediaMultimediaMmGetCurrentTask")
private external fun wasiWindowssysWindowsWin32MediaMultimediaMmGetCurrentTask(): Int

public actual fun mmGetCurrentTask(): UInt =
    wasiWindowssysWindowsWin32MediaMultimediaMmGetCurrentTask().toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32MediaMultimediaMmTaskBlock")
private external fun wasiWindowssysWindowsWin32MediaMultimediaMmTaskBlock(h: Int): Unit

public actual fun mmTaskBlock(h: UInt): Unit =
    wasiWindowssysWindowsWin32MediaMultimediaMmTaskBlock(h.toInt())

public actual fun mmTaskCreate(lpfn: Lptaskcallback, lph: MutPtr<Handle>, dwinst: ULong): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaMmTaskCreate")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32MediaMultimediaMmTaskSignal")
private external fun wasiWindowssysWindowsWin32MediaMultimediaMmTaskSignal(h: Int): Int

public actual fun mmTaskSignal(h: UInt): Bool =
    wasiWindowssysWindowsWin32MediaMultimediaMmTaskSignal(h.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32MediaMultimediaMmTaskYield")
private external fun wasiWindowssysWindowsWin32MediaMultimediaMmTaskYield(): Unit

public actual fun mmTaskYield(): Unit =
    wasiWindowssysWindowsWin32MediaMultimediaMmTaskYield()

public actual fun mmioAdvance(hmmio: Hmmio, pmmioinfo: ConstPtr<Mmioinfo>, fuadvance: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaMmioAdvance")

public actual fun mmioAscend(hmmio: Hmmio, pmmcki: ConstPtr<Mmckinfo>, fuascend: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaMmioAscend")

public actual fun mmioClose(hmmio: Hmmio, fuclose: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaMmioClose")

public actual fun mmioCreateChunk(hmmio: Hmmio, pmmcki: ConstPtr<Mmckinfo>, fucreate: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaMmioCreateChunk")

public actual fun mmioDescend(hmmio: Hmmio, pmmcki: MutPtr<Mmckinfo>, pmmckiparent: ConstPtr<Mmckinfo>, fudescend: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaMmioDescend")

public actual fun mmioFlush(hmmio: Hmmio, fuflush: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaMmioFlush")

public actual fun mmioGetInfo(hmmio: Hmmio, pmmioinfo: MutPtr<Mmioinfo>, fuinfo: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaMmioGetInfo")

public actual fun mmioInstallIOProcA(fccioproc: UInt, pioproc: Lpmmioproc, dwflags: UInt): Lpmmioproc =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaMmioInstallIOProcA")

public actual fun mmioInstallIOProcW(fccioproc: UInt, pioproc: Lpmmioproc, dwflags: UInt): Lpmmioproc =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaMmioInstallIOProcW")

public actual fun mmioOpenA(pszfilename: Pstr, pmmioinfo: MutPtr<Mmioinfo>, fdwopen: UInt): Hmmio =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaMmioOpenA")

public actual fun mmioOpenW(pszfilename: Pwstr, pmmioinfo: MutPtr<Mmioinfo>, fdwopen: UInt): Hmmio =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaMmioOpenW")

public actual fun mmioRead(hmmio: Hmmio, pch: MutPtr<Byte>, cch: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaMmioRead")

public actual fun mmioRenameA(pszfilename: Pcstr, psznewfilename: Pcstr, pmmioinfo: ConstPtr<Mmioinfo>, fdwrename: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaMmioRenameA")

public actual fun mmioRenameW(pszfilename: Pcwstr, psznewfilename: Pcwstr, pmmioinfo: ConstPtr<Mmioinfo>, fdwrename: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaMmioRenameW")

public actual fun mmioSeek(hmmio: Hmmio, loffset: Int, iorigin: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaMmioSeek")

public actual fun mmioSendMessage(hmmio: Hmmio, umsg: UInt, lparam1: Lparam, lparam2: Lparam): Lresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaMmioSendMessage")

public actual fun mmioSetBuffer(hmmio: Hmmio, pchbuffer: Pstr, cchbuffer: Int, fubuffer: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaMmioSetBuffer")

public actual fun mmioSetInfo(hmmio: Hmmio, pmmioinfo: ConstPtr<Mmioinfo>, fuinfo: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaMmioSetInfo")

public actual fun mmioStringToFOURCCA(sz: Pcstr, uflags: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaMmioStringToFOURCCA")

public actual fun mmioStringToFOURCCW(sz: Pcwstr, uflags: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaMmioStringToFOURCCW")

public actual fun mmioWrite(hmmio: Hmmio, pch: Pcstr, cch: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaMmioWrite")

public actual fun sndOpenSound(eventname: Pcwstr, appname: Pcwstr, flags: Int, filehandle: MutPtr<Handle>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaMultimediaSndOpenSound")
