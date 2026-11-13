@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.ole

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Bstr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hglobal
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.VariantBool
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hdc
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hpalette
import io.github.kotlinmania.windowssys.windows.win32.system.com.CY
import io.github.kotlinmania.windowssys.windows.win32.system.com.Callconv
import io.github.kotlinmania.windowssys.windows.win32.system.com.Syskind
import io.github.kotlinmania.windowssys.windows.win32.system.memory.GlobalAllocFlags
import io.github.kotlinmania.windowssys.windows.win32.system.variant.Varenum
import io.github.kotlinmania.windowssys.windows.win32.system.variant.Variant
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Haccel
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Hcursor
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Hicon
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Hmenu

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun bstrFromVector(psa: ConstPtr, pbstr: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleBstrFromVector")

public actual fun clearCustData(pcustdata: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleClearCustData")

public actual fun createDispTypeInfo(pidata: MutPtr, lcid: UInt, pptinfo: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleCreateDispTypeInfo")

public actual fun createErrorInfo(pperrinfo: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleCreateErrorInfo")

public actual fun createOleAdviseHolder(ppoaholder: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleCreateOleAdviseHolder")

public actual fun createStdDispatch(punkouter: MutPtr, pvthis: MutPtr, ptinfo: MutPtr, ppunkstddisp: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleCreateStdDispatch")

public actual fun createTypeLib(syskind: Syskind, szfile: Pcwstr, ppctlib: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleCreateTypeLib")

public actual fun createTypeLib2(syskind: Syskind, szfile: Pcwstr, ppctlib: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleCreateTypeLib2")

public actual fun dispCallFunc(pvinstance: ConstPtr, ovft: ULong, cc: Callconv, vtreturn: Varenum, cactuals: UInt, prgvt: ConstPtr, prgpvarg: ConstPtr, pvargresult: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleDispCallFunc")

public actual fun dispGetIDsOfNames(ptinfo: MutPtr, rgsznames: ConstPtr, cnames: UInt, rgdispid: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleDispGetIDsOfNames")

public actual fun dispGetParam(pdispparams: ConstPtr, position: UInt, vttarg: Varenum, pvarresult: MutPtr, puargerr: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleDispGetParam")

public actual fun dispInvoke(thisRef: MutPtr, ptinfo: MutPtr, dispidmember: Int, wflags: UShort, pparams: MutPtr, pvarresult: MutPtr, pexcepinfo: MutPtr, puargerr: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleDispInvoke")

public actual fun doDragDrop(pdataobj: MutPtr, pdropsource: MutPtr, dwokeffects: Dropeffect, pdweffect: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleDoDragDrop")

public actual fun getActiveObject(rclsid: ConstPtr, pvreserved: MutPtr, ppunk: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleGetActiveObject")

public actual fun getAltMonthNames(lcid: UInt, prgp: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleGetAltMonthNames")

public actual fun getRecordInfoFromGuids(rguidtypelib: ConstPtr, uvermajor: UInt, uverminor: UInt, lcid: UInt, rguidtypeinfo: ConstPtr, pprecinfo: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleGetRecordInfoFromGuids")

public actual fun getRecordInfoFromTypeInfo(ptypeinfo: MutPtr, pprecinfo: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleGetRecordInfoFromTypeInfo")

public actual fun hrgnUserFree(param0: ConstPtr, param1: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleHrgnUserFree")

public actual fun hrgnUserFree64(param0: ConstPtr, param1: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleHrgnUserFree64")

public actual fun hrgnUserMarshal(param0: ConstPtr, param1: MutPtr, param2: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleHrgnUserMarshal")

public actual fun hrgnUserMarshal64(param0: ConstPtr, param1: MutPtr, param2: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleHrgnUserMarshal64")

public actual fun hrgnUserSize(param0: ConstPtr, param1: UInt, param2: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleHrgnUserSize")

public actual fun hrgnUserSize64(param0: ConstPtr, param1: UInt, param2: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleHrgnUserSize64")

public actual fun hrgnUserUnmarshal(param0: ConstPtr, param1: ConstPtr, param2: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleHrgnUserUnmarshal")

public actual fun hrgnUserUnmarshal64(param0: ConstPtr, param1: ConstPtr, param2: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleHrgnUserUnmarshal64")

public actual fun isAccelerator(haccel: Haccel, caccelentries: Int, lpmsg: ConstPtr, lpwcmd: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleIsAccelerator")

public actual fun lHashValOfNameSys(syskind: Syskind, lcid: UInt, szname: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleLHashValOfNameSys")

public actual fun lHashValOfNameSysA(syskind: Syskind, lcid: UInt, szname: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleLHashValOfNameSysA")

public actual fun loadRegTypeLib(rguid: ConstPtr, wvermajor: UShort, wverminor: UShort, lcid: UInt, pptlib: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleLoadRegTypeLib")

public actual fun loadTypeLib(szfile: Pcwstr, pptlib: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleLoadTypeLib")

public actual fun loadTypeLibEx(szfile: Pcwstr, regkind: Regkind, pptlib: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleLoadTypeLibEx")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemOleOaBuildVersion")
private external fun wasiWindowssysWindowsWin32SystemOleOaBuildVersion(): Int

public actual fun oaBuildVersion(): UInt =
    wasiWindowssysWindowsWin32SystemOleOaBuildVersion().toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemOleOaEnablePerUserTLibRegistration")
private external fun wasiWindowssysWindowsWin32SystemOleOaEnablePerUserTLibRegistration(): Unit

public actual fun oaEnablePerUserTLibRegistration(): Unit =
    wasiWindowssysWindowsWin32SystemOleOaEnablePerUserTLibRegistration()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemOleOleBuildVersion")
private external fun wasiWindowssysWindowsWin32SystemOleOleBuildVersion(): Int

public actual fun oleBuildVersion(): UInt =
    wasiWindowssysWindowsWin32SystemOleOleBuildVersion().toUInt()

public actual fun oleConvertOLESTREAMToIStorage2(lpolestream: ConstPtr, pstg: MutPtr, ptd: ConstPtr, opt: UInt, pvcallbackcontext: ConstPtr, pqueryconvertolelinkcallback: Olestreamqueryconvertolelinkcallback): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleConvertOLESTREAMToIStorage2")

public actual fun oleConvertOLESTREAMToIStorageEx2(polestm: ConstPtr, pstg: MutPtr, pcfformat: MutPtr, plwwidth: MutPtr, plheight: MutPtr, pdwsize: MutPtr, pmedium: MutPtr, opt: UInt, pvcallbackcontext: ConstPtr, pqueryconvertolelinkcallback: Olestreamqueryconvertolelinkcallback): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleConvertOLESTREAMToIStorageEx2")

public actual fun oleCreate(rclsid: ConstPtr, riid: ConstPtr, renderopt: UInt, pformatetc: ConstPtr, pclientsite: MutPtr, pstg: MutPtr, ppvobj: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleCreate")

public actual fun oleCreateDefaultHandler(clsid: ConstPtr, punkouter: MutPtr, riid: ConstPtr, lplpobj: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleCreateDefaultHandler")

public actual fun oleCreateEmbeddingHelper(clsid: ConstPtr, punkouter: MutPtr, flags: EmbdhlpFlags, pcf: MutPtr, riid: ConstPtr, lplpobj: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleCreateEmbeddingHelper")

public actual fun oleCreateEx(rclsid: ConstPtr, riid: ConstPtr, dwflags: Olecreate, renderopt: UInt, cformats: UInt, rgadvf: ConstPtr, rgformatetc: ConstPtr, lpadvisesink: MutPtr, rgdwconnection: MutPtr, pclientsite: MutPtr, pstg: MutPtr, ppvobj: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleCreateEx")

public actual fun oleCreateFontIndirect(lpfontdesc: ConstPtr, riid: ConstPtr, lplpvobj: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleCreateFontIndirect")

public actual fun oleCreateFromData(psrcdataobj: MutPtr, riid: ConstPtr, renderopt: UInt, pformatetc: ConstPtr, pclientsite: MutPtr, pstg: MutPtr, ppvobj: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleCreateFromData")

public actual fun oleCreateFromDataEx(psrcdataobj: MutPtr, riid: ConstPtr, dwflags: Olecreate, renderopt: UInt, cformats: UInt, rgadvf: ConstPtr, rgformatetc: ConstPtr, lpadvisesink: MutPtr, rgdwconnection: MutPtr, pclientsite: MutPtr, pstg: MutPtr, ppvobj: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleCreateFromDataEx")

public actual fun oleCreateFromFile(rclsid: ConstPtr, lpszfilename: Pcwstr, riid: ConstPtr, renderopt: UInt, lpformatetc: ConstPtr, pclientsite: MutPtr, pstg: MutPtr, ppvobj: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleCreateFromFile")

public actual fun oleCreateFromFileEx(rclsid: ConstPtr, lpszfilename: Pcwstr, riid: ConstPtr, dwflags: Olecreate, renderopt: UInt, cformats: UInt, rgadvf: ConstPtr, rgformatetc: ConstPtr, lpadvisesink: MutPtr, rgdwconnection: MutPtr, pclientsite: MutPtr, pstg: MutPtr, ppvobj: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleCreateFromFileEx")

public actual fun oleCreateLink(pmklinksrc: MutPtr, riid: ConstPtr, renderopt: UInt, lpformatetc: ConstPtr, pclientsite: MutPtr, pstg: MutPtr, ppvobj: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleCreateLink")

public actual fun oleCreateLinkEx(pmklinksrc: MutPtr, riid: ConstPtr, dwflags: Olecreate, renderopt: UInt, cformats: UInt, rgadvf: ConstPtr, rgformatetc: ConstPtr, lpadvisesink: MutPtr, rgdwconnection: MutPtr, pclientsite: MutPtr, pstg: MutPtr, ppvobj: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleCreateLinkEx")

public actual fun oleCreateLinkFromData(psrcdataobj: MutPtr, riid: ConstPtr, renderopt: UInt, pformatetc: ConstPtr, pclientsite: MutPtr, pstg: MutPtr, ppvobj: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleCreateLinkFromData")

public actual fun oleCreateLinkFromDataEx(psrcdataobj: MutPtr, riid: ConstPtr, dwflags: Olecreate, renderopt: UInt, cformats: UInt, rgadvf: ConstPtr, rgformatetc: ConstPtr, lpadvisesink: MutPtr, rgdwconnection: MutPtr, pclientsite: MutPtr, pstg: MutPtr, ppvobj: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleCreateLinkFromDataEx")

public actual fun oleCreateLinkToFile(lpszfilename: Pcwstr, riid: ConstPtr, renderopt: UInt, lpformatetc: ConstPtr, pclientsite: MutPtr, pstg: MutPtr, ppvobj: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleCreateLinkToFile")

public actual fun oleCreateLinkToFileEx(lpszfilename: Pcwstr, riid: ConstPtr, dwflags: Olecreate, renderopt: UInt, cformats: UInt, rgadvf: ConstPtr, rgformatetc: ConstPtr, lpadvisesink: MutPtr, rgdwconnection: MutPtr, pclientsite: MutPtr, pstg: MutPtr, ppvobj: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleCreateLinkToFileEx")

public actual fun oleCreateMenuDescriptor(hmenucombined: Hmenu, lpmenuwidths: ConstPtr): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleCreateMenuDescriptor")

public actual fun oleCreatePictureIndirect(lppictdesc: ConstPtr, riid: ConstPtr, fown: Bool, lplpvobj: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleCreatePictureIndirect")

public actual fun oleCreatePropertyFrame(hwndowner: Hwnd, x: UInt, y: UInt, lpszcaption: Pcwstr, cobjects: UInt, ppunk: ConstPtr, cpages: UInt, ppageclsid: ConstPtr, lcid: UInt, dwreserved: UInt, pvreserved: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleCreatePropertyFrame")

public actual fun oleCreatePropertyFrameIndirect(lpparams: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleCreatePropertyFrameIndirect")

public actual fun oleCreateStaticFromData(psrcdataobj: MutPtr, iid: ConstPtr, renderopt: UInt, pformatetc: ConstPtr, pclientsite: MutPtr, pstg: MutPtr, ppvobj: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleCreateStaticFromData")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemOleOleDestroyMenuDescriptor")
private external fun wasiWindowssysWindowsWin32SystemOleOleDestroyMenuDescriptor(holemenu: Long): Int

public actual fun oleDestroyMenuDescriptor(holemenu: Long): Hresult =
    wasiWindowssysWindowsWin32SystemOleOleDestroyMenuDescriptor(holemenu)

public actual fun oleDoAutoConvert(pstg: MutPtr, pclsidnew: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleDoAutoConvert")

public actual fun oleDraw(punknown: MutPtr, dwaspect: UInt, hdcdraw: Hdc, lprcbounds: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleDraw")

public actual fun oleDuplicateData(hsrc: Handle, cfformat: ClipboardFormat, uiflags: GlobalAllocFlags): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleDuplicateData")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemOleOleFlushClipboard")
private external fun wasiWindowssysWindowsWin32SystemOleOleFlushClipboard(): Int

public actual fun oleFlushClipboard(): Hresult =
    wasiWindowssysWindowsWin32SystemOleOleFlushClipboard()

public actual fun oleGetAutoConvert(clsidold: ConstPtr, pclsidnew: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleGetAutoConvert")

public actual fun oleGetClipboard(ppdataobj: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleGetClipboard")

public actual fun oleGetClipboardWithEnterpriseInfo(dataobject: MutPtr, dataenterpriseid: MutPtr, sourcedescription: MutPtr, targetdescription: MutPtr, datadescription: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleGetClipboardWithEnterpriseInfo")

public actual fun oleGetIconOfClass(rclsid: ConstPtr, lpszlabel: Pcwstr, fusetypeaslabel: Bool): Hglobal =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleGetIconOfClass")

public actual fun oleGetIconOfFile(lpszpath: Pcwstr, fusefileaslabel: Bool): Hglobal =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleGetIconOfFile")

public actual fun oleIconToCursor(hinstexe: Hinstance, hicon: Hicon): Hcursor =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleIconToCursor")

public actual fun oleInitialize(pvreserved: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleInitialize")

public actual fun oleIsCurrentClipboard(pdataobj: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleIsCurrentClipboard")

public actual fun oleIsRunning(pobject: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleIsRunning")

public actual fun oleLoad(pstg: MutPtr, riid: ConstPtr, pclientsite: MutPtr, ppvobj: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleLoad")

public actual fun oleLoadFromStream(pstm: MutPtr, iidinterface: ConstPtr, ppvobj: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleLoadFromStream")

public actual fun oleLoadPicture(lpstream: MutPtr, lsize: Int, frunmode: Bool, riid: ConstPtr, lplpvobj: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleLoadPicture")

public actual fun oleLoadPictureEx(lpstream: MutPtr, lsize: Int, frunmode: Bool, riid: ConstPtr, xsizedesired: UInt, ysizedesired: UInt, dwflags: LoadPictureFlags, lplpvobj: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleLoadPictureEx")

public actual fun oleLoadPictureFile(varfilename: Variant, lplpdisppicture: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleLoadPictureFile")

public actual fun oleLoadPictureFileEx(varfilename: Variant, xsizedesired: UInt, ysizedesired: UInt, dwflags: LoadPictureFlags, lplpdisppicture: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleLoadPictureFileEx")

public actual fun oleLoadPicturePath(szurlorpath: Pcwstr, punkcaller: MutPtr, dwreserved: UInt, clrreserved: UInt, riid: ConstPtr, ppvret: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleLoadPicturePath")

public actual fun oleLockRunning(punknown: MutPtr, flock: Bool, flastunlockcloses: Bool): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleLockRunning")

public actual fun oleMetafilePictFromIconAndLabel(hicon: Hicon, lpszlabel: Pcwstr, lpszsourcefile: Pcwstr, iiconindex: UInt): Hglobal =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleMetafilePictFromIconAndLabel")

public actual fun oleNoteObjectVisible(punknown: MutPtr, fvisible: Bool): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleNoteObjectVisible")

public actual fun oleQueryCreateFromData(psrcdataobject: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleQueryCreateFromData")

public actual fun oleQueryLinkFromData(psrcdataobject: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleQueryLinkFromData")

public actual fun oleRegEnumFormatEtc(clsid: ConstPtr, dwdirection: UInt, ppenum: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleRegEnumFormatEtc")

public actual fun oleRegEnumVerbs(clsid: ConstPtr, ppenum: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleRegEnumVerbs")

public actual fun oleRegGetMiscStatus(clsid: ConstPtr, dwaspect: UInt, pdwstatus: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleRegGetMiscStatus")

public actual fun oleRegGetUserType(clsid: ConstPtr, dwformoftype: UInt, pszusertype: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleRegGetUserType")

public actual fun oleRun(punknown: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleRun")

public actual fun oleSave(pps: MutPtr, pstg: MutPtr, fsameasload: Bool): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleSave")

public actual fun oleSavePictureFile(lpdisppicture: MutPtr, bstrfilename: Bstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleSavePictureFile")

public actual fun oleSaveToStream(ppstm: MutPtr, pstm: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleSaveToStream")

public actual fun oleSetAutoConvert(clsidold: ConstPtr, clsidnew: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleSetAutoConvert")

public actual fun oleSetClipboard(pdataobj: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleSetClipboard")

public actual fun oleSetContainedObject(punknown: MutPtr, fcontained: Bool): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleSetContainedObject")

public actual fun oleSetMenuDescriptor(holemenu: Long, hwndframe: Hwnd, hwndactiveobject: Hwnd, lpframe: MutPtr, lpactiveobj: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleSetMenuDescriptor")

public actual fun oleTranslateAccelerator(lpframe: MutPtr, lpframeinfo: ConstPtr, lpmsg: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleTranslateAccelerator")

public actual fun oleTranslateColor(clr: UInt, hpal: Hpalette, lpcolorref: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleTranslateColor")

public actual fun oleUIAddVerbMenuA(lpoleobj: MutPtr, lpszshorttype: Pcstr, hmenu: Hmenu, upos: UInt, uidverbmin: UInt, uidverbmax: UInt, baddconvert: Bool, idconvert: UInt, lphmenu: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleUIAddVerbMenuA")

public actual fun oleUIAddVerbMenuW(lpoleobj: MutPtr, lpszshorttype: Pcwstr, hmenu: Hmenu, upos: UInt, uidverbmin: UInt, uidverbmax: UInt, baddconvert: Bool, idconvert: UInt, lphmenu: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleUIAddVerbMenuW")

public actual fun oleUIBusyA(param0: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleUIBusyA")

public actual fun oleUIBusyW(param0: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleUIBusyW")

public actual fun oleUICanConvertOrActivateAs(rclsid: ConstPtr, fislinkedobject: Bool, wformat: UShort): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleUICanConvertOrActivateAs")

public actual fun oleUIChangeIconA(param0: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleUIChangeIconA")

public actual fun oleUIChangeIconW(param0: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleUIChangeIconW")

public actual fun oleUIChangeSourceA(param0: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleUIChangeSourceA")

public actual fun oleUIChangeSourceW(param0: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleUIChangeSourceW")

public actual fun oleUIConvertA(param0: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleUIConvertA")

public actual fun oleUIConvertW(param0: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleUIConvertW")

public actual fun oleUIEditLinksA(param0: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleUIEditLinksA")

public actual fun oleUIEditLinksW(param0: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleUIEditLinksW")

public actual fun oleUIInsertObjectA(param0: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleUIInsertObjectA")

public actual fun oleUIInsertObjectW(param0: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleUIInsertObjectW")

public actual fun oleUIObjectPropertiesA(param0: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleUIObjectPropertiesA")

public actual fun oleUIObjectPropertiesW(param0: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleUIObjectPropertiesW")

public actual fun oleUIPasteSpecialA(param0: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleUIPasteSpecialA")

public actual fun oleUIPasteSpecialW(param0: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleUIPasteSpecialW")

public actual fun oleUIPromptUserA(ntemplate: Int, hwndparent: Hwnd, vararg variadicArgs: Long): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleUIPromptUserA")

public actual fun oleUIPromptUserW(ntemplate: Int, hwndparent: Hwnd, vararg variadicArgs: Long): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleUIPromptUserW")

public actual fun oleUIUpdateLinksA(lpoleuilinkcntr: MutPtr, hwndparent: Hwnd, lpsztitle: Pcstr, clinks: Int): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleUIUpdateLinksA")

public actual fun oleUIUpdateLinksW(lpoleuilinkcntr: MutPtr, hwndparent: Hwnd, lpsztitle: Pcwstr, clinks: Int): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleOleUIUpdateLinksW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemOleOleUninitialize")
private external fun wasiWindowssysWindowsWin32SystemOleOleUninitialize(): Unit

public actual fun oleUninitialize(): Unit =
    wasiWindowssysWindowsWin32SystemOleOleUninitialize()

public actual fun queryPathOfRegTypeLib(guid: ConstPtr, wmaj: UShort, wmin: UShort, lcid: UInt, lpbstrpathname: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleQueryPathOfRegTypeLib")

public actual fun registerActiveObject(punk: MutPtr, rclsid: ConstPtr, dwflags: ActiveobjectFlags, pdwregister: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleRegisterActiveObject")

public actual fun registerDragDrop(hwnd: Hwnd, pdroptarget: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleRegisterDragDrop")

public actual fun registerTypeLib(ptlib: MutPtr, szfullpath: Pcwstr, szhelpdir: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleRegisterTypeLib")

public actual fun registerTypeLibForUser(ptlib: MutPtr, szfullpath: Pcwstr, szhelpdir: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleRegisterTypeLibForUser")

public actual fun releaseStgMedium(param0: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleReleaseStgMedium")

public actual fun revokeActiveObject(dwregister: UInt, pvreserved: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleRevokeActiveObject")

public actual fun revokeDragDrop(hwnd: Hwnd): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleRevokeDragDrop")

public actual fun safeArrayAccessData(psa: ConstPtr, ppvdata: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleSafeArrayAccessData")

public actual fun safeArrayAddRef(psa: ConstPtr, ppdatatorelease: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleSafeArrayAddRef")

public actual fun safeArrayAllocData(psa: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleSafeArrayAllocData")

public actual fun safeArrayAllocDescriptor(cdims: UInt, ppsaout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleSafeArrayAllocDescriptor")

public actual fun safeArrayAllocDescriptorEx(vt: Varenum, cdims: UInt, ppsaout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleSafeArrayAllocDescriptorEx")

public actual fun safeArrayCopy(psa: ConstPtr, ppsaout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleSafeArrayCopy")

public actual fun safeArrayCopyData(psasource: ConstPtr, psatarget: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleSafeArrayCopyData")

public actual fun safeArrayCreate(vt: Varenum, cdims: UInt, rgsabound: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleSafeArrayCreate")

public actual fun safeArrayCreateEx(vt: Varenum, cdims: UInt, rgsabound: ConstPtr, pvextra: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleSafeArrayCreateEx")

public actual fun safeArrayCreateVector(vt: Varenum, llbound: Int, celements: UInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleSafeArrayCreateVector")

public actual fun safeArrayCreateVectorEx(vt: Varenum, llbound: Int, celements: UInt, pvextra: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleSafeArrayCreateVectorEx")

public actual fun safeArrayDestroy(psa: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleSafeArrayDestroy")

public actual fun safeArrayDestroyData(psa: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleSafeArrayDestroyData")

public actual fun safeArrayDestroyDescriptor(psa: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleSafeArrayDestroyDescriptor")

public actual fun safeArrayGetDim(psa: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleSafeArrayGetDim")

public actual fun safeArrayGetElement(psa: ConstPtr, rgindices: ConstPtr, pv: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleSafeArrayGetElement")

public actual fun safeArrayGetElemsize(psa: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleSafeArrayGetElemsize")

public actual fun safeArrayGetIID(psa: ConstPtr, pguid: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleSafeArrayGetIID")

public actual fun safeArrayGetLBound(psa: ConstPtr, ndim: UInt, pllbound: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleSafeArrayGetLBound")

public actual fun safeArrayGetRecordInfo(psa: ConstPtr, prinfo: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleSafeArrayGetRecordInfo")

public actual fun safeArrayGetUBound(psa: ConstPtr, ndim: UInt, plubound: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleSafeArrayGetUBound")

public actual fun safeArrayGetVartype(psa: ConstPtr, pvt: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleSafeArrayGetVartype")

public actual fun safeArrayLock(psa: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleSafeArrayLock")

public actual fun safeArrayPtrOfIndex(psa: ConstPtr, rgindices: ConstPtr, ppvdata: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleSafeArrayPtrOfIndex")

public actual fun safeArrayPutElement(psa: ConstPtr, rgindices: ConstPtr, pv: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleSafeArrayPutElement")

public actual fun safeArrayRedim(psa: MutPtr, psaboundnew: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleSafeArrayRedim")

public actual fun safeArrayReleaseData(pdata: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleSafeArrayReleaseData")

public actual fun safeArrayReleaseDescriptor(psa: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleSafeArrayReleaseDescriptor")

public actual fun safeArraySetIID(psa: ConstPtr, guid: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleSafeArraySetIID")

public actual fun safeArraySetRecordInfo(psa: ConstPtr, prinfo: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleSafeArraySetRecordInfo")

public actual fun safeArrayUnaccessData(psa: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleSafeArrayUnaccessData")

public actual fun safeArrayUnlock(psa: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleSafeArrayUnlock")

public actual fun unRegisterTypeLib(libid: ConstPtr, wvermajor: UShort, wverminor: UShort, lcid: UInt, syskind: Syskind): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleUnRegisterTypeLib")

public actual fun unRegisterTypeLibForUser(libid: ConstPtr, wmajorvernum: UShort, wminorvernum: UShort, lcid: UInt, syskind: Syskind): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleUnRegisterTypeLibForUser")

public actual fun varAbs(pvarin: ConstPtr, pvarresult: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarAbs")

public actual fun varAdd(pvarleft: ConstPtr, pvarright: ConstPtr, pvarresult: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarAdd")

public actual fun varAnd(pvarleft: ConstPtr, pvarright: ConstPtr, pvarresult: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarAnd")

public actual fun varBoolFromCy(cyin: CY, pboolout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarBoolFromCy")

public actual fun varBoolFromDate(datein: Double, pboolout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarBoolFromDate")

public actual fun varBoolFromDec(pdecin: ConstPtr, pboolout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarBoolFromDec")

public actual fun varBoolFromDisp(pdispin: MutPtr, lcid: UInt, pboolout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarBoolFromDisp")

public actual fun varBoolFromI1(cin: Byte, pboolout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarBoolFromI1")

public actual fun varBoolFromI2(sin: Short, pboolout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarBoolFromI2")

public actual fun varBoolFromI4(lin: Int, pboolout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarBoolFromI4")

public actual fun varBoolFromI8(i64in: Long, pboolout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarBoolFromI8")

public actual fun varBoolFromR4(fltin: Float, pboolout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarBoolFromR4")

public actual fun varBoolFromR8(dblin: Double, pboolout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarBoolFromR8")

public actual fun varBoolFromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pboolout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarBoolFromStr")

public actual fun varBoolFromUI1(bin: UByte, pboolout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarBoolFromUI1")

public actual fun varBoolFromUI2(uiin: UShort, pboolout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarBoolFromUI2")

public actual fun varBoolFromUI4(ulin: UInt, pboolout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarBoolFromUI4")

public actual fun varBoolFromUI8(i64in: ULong, pboolout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarBoolFromUI8")

public actual fun varBstrCat(bstrleft: Bstr, bstrright: Bstr, pbstrresult: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarBstrCat")

public actual fun varBstrCmp(bstrleft: Bstr, bstrright: Bstr, lcid: UInt, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarBstrCmp")

public actual fun varBstrFromBool(boolin: VariantBool, lcid: UInt, dwflags: UInt, pbstrout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarBstrFromBool")

public actual fun varBstrFromCy(cyin: CY, lcid: UInt, dwflags: UInt, pbstrout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarBstrFromCy")

public actual fun varBstrFromDate(datein: Double, lcid: UInt, dwflags: UInt, pbstrout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarBstrFromDate")

public actual fun varBstrFromDec(pdecin: ConstPtr, lcid: UInt, dwflags: UInt, pbstrout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarBstrFromDec")

public actual fun varBstrFromDisp(pdispin: MutPtr, lcid: UInt, dwflags: UInt, pbstrout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarBstrFromDisp")

public actual fun varBstrFromI1(cin: Byte, lcid: UInt, dwflags: UInt, pbstrout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarBstrFromI1")

public actual fun varBstrFromI2(ival: Short, lcid: UInt, dwflags: UInt, pbstrout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarBstrFromI2")

public actual fun varBstrFromI4(lin: Int, lcid: UInt, dwflags: UInt, pbstrout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarBstrFromI4")

public actual fun varBstrFromI8(i64in: Long, lcid: UInt, dwflags: UInt, pbstrout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarBstrFromI8")

public actual fun varBstrFromR4(fltin: Float, lcid: UInt, dwflags: UInt, pbstrout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarBstrFromR4")

public actual fun varBstrFromR8(dblin: Double, lcid: UInt, dwflags: UInt, pbstrout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarBstrFromR8")

public actual fun varBstrFromUI1(bval: UByte, lcid: UInt, dwflags: UInt, pbstrout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarBstrFromUI1")

public actual fun varBstrFromUI2(uiin: UShort, lcid: UInt, dwflags: UInt, pbstrout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarBstrFromUI2")

public actual fun varBstrFromUI4(ulin: UInt, lcid: UInt, dwflags: UInt, pbstrout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarBstrFromUI4")

public actual fun varBstrFromUI8(ui64in: ULong, lcid: UInt, dwflags: UInt, pbstrout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarBstrFromUI8")

public actual fun varCat(pvarleft: ConstPtr, pvarright: ConstPtr, pvarresult: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarCat")

public actual fun varCmp(pvarleft: ConstPtr, pvarright: ConstPtr, lcid: UInt, dwflags: UInt): Varcmp =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarCmp")

public actual fun varCyAbs(cyin: CY, pcyresult: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarCyAbs")

public actual fun varCyAdd(cyleft: CY, cyright: CY, pcyresult: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarCyAdd")

public actual fun varCyCmp(cyleft: CY, cyright: CY): Varcmp =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarCyCmp")

public actual fun varCyCmpR8(cyleft: CY, dblright: Double): Varcmp =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarCyCmpR8")

public actual fun varCyFix(cyin: CY, pcyresult: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarCyFix")

public actual fun varCyFromBool(boolin: VariantBool, pcyout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarCyFromBool")

public actual fun varCyFromDate(datein: Double, pcyout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarCyFromDate")

public actual fun varCyFromDec(pdecin: ConstPtr, pcyout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarCyFromDec")

public actual fun varCyFromDisp(pdispin: MutPtr, lcid: UInt, pcyout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarCyFromDisp")

public actual fun varCyFromI1(cin: Byte, pcyout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarCyFromI1")

public actual fun varCyFromI2(sin: Short, pcyout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarCyFromI2")

public actual fun varCyFromI4(lin: Int, pcyout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarCyFromI4")

public actual fun varCyFromI8(i64in: Long, pcyout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarCyFromI8")

public actual fun varCyFromR4(fltin: Float, pcyout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarCyFromR4")

public actual fun varCyFromR8(dblin: Double, pcyout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarCyFromR8")

public actual fun varCyFromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pcyout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarCyFromStr")

public actual fun varCyFromUI1(bin: UByte, pcyout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarCyFromUI1")

public actual fun varCyFromUI2(uiin: UShort, pcyout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarCyFromUI2")

public actual fun varCyFromUI4(ulin: UInt, pcyout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarCyFromUI4")

public actual fun varCyFromUI8(ui64in: ULong, pcyout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarCyFromUI8")

public actual fun varCyInt(cyin: CY, pcyresult: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarCyInt")

public actual fun varCyMul(cyleft: CY, cyright: CY, pcyresult: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarCyMul")

public actual fun varCyMulI4(cyleft: CY, lright: Int, pcyresult: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarCyMulI4")

public actual fun varCyMulI8(cyleft: CY, lright: Long, pcyresult: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarCyMulI8")

public actual fun varCyNeg(cyin: CY, pcyresult: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarCyNeg")

public actual fun varCyRound(cyin: CY, cdecimals: Int, pcyresult: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarCyRound")

public actual fun varCySub(cyleft: CY, cyright: CY, pcyresult: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarCySub")

public actual fun varDateFromBool(boolin: VariantBool, pdateout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarDateFromBool")

public actual fun varDateFromCy(cyin: CY, pdateout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarDateFromCy")

public actual fun varDateFromDec(pdecin: ConstPtr, pdateout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarDateFromDec")

public actual fun varDateFromDisp(pdispin: MutPtr, lcid: UInt, pdateout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarDateFromDisp")

public actual fun varDateFromI1(cin: Byte, pdateout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarDateFromI1")

public actual fun varDateFromI2(sin: Short, pdateout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarDateFromI2")

public actual fun varDateFromI4(lin: Int, pdateout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarDateFromI4")

public actual fun varDateFromI8(i64in: Long, pdateout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarDateFromI8")

public actual fun varDateFromR4(fltin: Float, pdateout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarDateFromR4")

public actual fun varDateFromR8(dblin: Double, pdateout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarDateFromR8")

public actual fun varDateFromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pdateout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarDateFromStr")

public actual fun varDateFromUI1(bin: UByte, pdateout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarDateFromUI1")

public actual fun varDateFromUI2(uiin: UShort, pdateout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarDateFromUI2")

public actual fun varDateFromUI4(ulin: UInt, pdateout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarDateFromUI4")

public actual fun varDateFromUI8(ui64in: ULong, pdateout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarDateFromUI8")

public actual fun varDateFromUdate(pudatein: ConstPtr, dwflags: UInt, pdateout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarDateFromUdate")

public actual fun varDateFromUdateEx(pudatein: ConstPtr, lcid: UInt, dwflags: UInt, pdateout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarDateFromUdateEx")

public actual fun varDecAbs(pdecin: ConstPtr, pdecresult: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarDecAbs")

public actual fun varDecAdd(pdecleft: ConstPtr, pdecright: ConstPtr, pdecresult: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarDecAdd")

public actual fun varDecCmp(pdecleft: ConstPtr, pdecright: ConstPtr): Varcmp =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarDecCmp")

public actual fun varDecCmpR8(pdecleft: ConstPtr, dblright: Double): Varcmp =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarDecCmpR8")

public actual fun varDecDiv(pdecleft: ConstPtr, pdecright: ConstPtr, pdecresult: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarDecDiv")

public actual fun varDecFix(pdecin: ConstPtr, pdecresult: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarDecFix")

public actual fun varDecFromBool(boolin: VariantBool, pdecout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarDecFromBool")

public actual fun varDecFromCy(cyin: CY, pdecout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarDecFromCy")

public actual fun varDecFromDate(datein: Double, pdecout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarDecFromDate")

public actual fun varDecFromDisp(pdispin: MutPtr, lcid: UInt, pdecout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarDecFromDisp")

public actual fun varDecFromI1(cin: Byte, pdecout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarDecFromI1")

public actual fun varDecFromI2(uiin: Short, pdecout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarDecFromI2")

public actual fun varDecFromI4(lin: Int, pdecout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarDecFromI4")

public actual fun varDecFromI8(i64in: Long, pdecout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarDecFromI8")

public actual fun varDecFromR4(fltin: Float, pdecout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarDecFromR4")

public actual fun varDecFromR8(dblin: Double, pdecout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarDecFromR8")

public actual fun varDecFromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pdecout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarDecFromStr")

public actual fun varDecFromUI1(bin: UByte, pdecout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarDecFromUI1")

public actual fun varDecFromUI2(uiin: UShort, pdecout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarDecFromUI2")

public actual fun varDecFromUI4(ulin: UInt, pdecout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarDecFromUI4")

public actual fun varDecFromUI8(ui64in: ULong, pdecout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarDecFromUI8")

public actual fun varDecInt(pdecin: ConstPtr, pdecresult: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarDecInt")

public actual fun varDecMul(pdecleft: ConstPtr, pdecright: ConstPtr, pdecresult: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarDecMul")

public actual fun varDecNeg(pdecin: ConstPtr, pdecresult: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarDecNeg")

public actual fun varDecRound(pdecin: ConstPtr, cdecimals: Int, pdecresult: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarDecRound")

public actual fun varDecSub(pdecleft: ConstPtr, pdecright: ConstPtr, pdecresult: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarDecSub")

public actual fun varDiv(pvarleft: ConstPtr, pvarright: ConstPtr, pvarresult: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarDiv")

public actual fun varEqv(pvarleft: ConstPtr, pvarright: ConstPtr, pvarresult: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarEqv")

public actual fun varFix(pvarin: ConstPtr, pvarresult: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarFix")

public actual fun varFormat(pvarin: ConstPtr, pstrformat: Pcwstr, ifirstday: VarformatFirstDay, ifirstweek: VarformatFirstWeek, dwflags: UInt, pbstrout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarFormat")

public actual fun varFormatCurrency(pvarin: ConstPtr, inumdig: Int, iinclead: Int, iuseparens: Int, igroup: Int, dwflags: UInt, pbstrout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarFormatCurrency")

public actual fun varFormatDateTime(pvarin: ConstPtr, inamedformat: VarformatNamedFormat, dwflags: UInt, pbstrout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarFormatDateTime")

public actual fun varFormatFromTokens(pvarin: ConstPtr, pstrformat: Pcwstr, pbtokcur: ConstPtr, dwflags: UInt, pbstrout: MutPtr, lcid: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarFormatFromTokens")

public actual fun varFormatNumber(pvarin: ConstPtr, inumdig: Int, iinclead: VarformatLeadingDigit, iuseparens: VarformatParentheses, igroup: VarformatGroup, dwflags: UInt, pbstrout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarFormatNumber")

public actual fun varFormatPercent(pvarin: ConstPtr, inumdig: Int, iinclead: VarformatLeadingDigit, iuseparens: VarformatParentheses, igroup: VarformatGroup, dwflags: UInt, pbstrout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarFormatPercent")

public actual fun varI1FromBool(boolin: VariantBool, pcout: Pstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarI1FromBool")

public actual fun varI1FromCy(cyin: CY, pcout: Pstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarI1FromCy")

public actual fun varI1FromDate(datein: Double, pcout: Pstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarI1FromDate")

public actual fun varI1FromDec(pdecin: ConstPtr, pcout: Pstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarI1FromDec")

public actual fun varI1FromDisp(pdispin: MutPtr, lcid: UInt, pcout: Pstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarI1FromDisp")

public actual fun varI1FromI2(uiin: Short, pcout: Pstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarI1FromI2")

public actual fun varI1FromI4(lin: Int, pcout: Pstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarI1FromI4")

public actual fun varI1FromI8(i64in: Long, pcout: Pstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarI1FromI8")

public actual fun varI1FromR4(fltin: Float, pcout: Pstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarI1FromR4")

public actual fun varI1FromR8(dblin: Double, pcout: Pstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarI1FromR8")

public actual fun varI1FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pcout: Pstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarI1FromStr")

public actual fun varI1FromUI1(bin: UByte, pcout: Pstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarI1FromUI1")

public actual fun varI1FromUI2(uiin: UShort, pcout: Pstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarI1FromUI2")

public actual fun varI1FromUI4(ulin: UInt, pcout: Pstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarI1FromUI4")

public actual fun varI1FromUI8(i64in: ULong, pcout: Pstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarI1FromUI8")

public actual fun varI2FromBool(boolin: VariantBool, psout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarI2FromBool")

public actual fun varI2FromCy(cyin: CY, psout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarI2FromCy")

public actual fun varI2FromDate(datein: Double, psout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarI2FromDate")

public actual fun varI2FromDec(pdecin: ConstPtr, psout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarI2FromDec")

public actual fun varI2FromDisp(pdispin: MutPtr, lcid: UInt, psout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarI2FromDisp")

public actual fun varI2FromI1(cin: Byte, psout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarI2FromI1")

public actual fun varI2FromI4(lin: Int, psout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarI2FromI4")

public actual fun varI2FromI8(i64in: Long, psout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarI2FromI8")

public actual fun varI2FromR4(fltin: Float, psout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarI2FromR4")

public actual fun varI2FromR8(dblin: Double, psout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarI2FromR8")

public actual fun varI2FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, psout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarI2FromStr")

public actual fun varI2FromUI1(bin: UByte, psout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarI2FromUI1")

public actual fun varI2FromUI2(uiin: UShort, psout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarI2FromUI2")

public actual fun varI2FromUI4(ulin: UInt, psout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarI2FromUI4")

public actual fun varI2FromUI8(ui64in: ULong, psout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarI2FromUI8")

public actual fun varI4FromBool(boolin: VariantBool, plout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarI4FromBool")

public actual fun varI4FromCy(cyin: CY, plout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarI4FromCy")

public actual fun varI4FromDate(datein: Double, plout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarI4FromDate")

public actual fun varI4FromDec(pdecin: ConstPtr, plout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarI4FromDec")

public actual fun varI4FromDisp(pdispin: MutPtr, lcid: UInt, plout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarI4FromDisp")

public actual fun varI4FromI1(cin: Byte, plout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarI4FromI1")

public actual fun varI4FromI2(sin: Short, plout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarI4FromI2")

public actual fun varI4FromI8(i64in: Long, plout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarI4FromI8")

public actual fun varI4FromR4(fltin: Float, plout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarI4FromR4")

public actual fun varI4FromR8(dblin: Double, plout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarI4FromR8")

public actual fun varI4FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, plout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarI4FromStr")

public actual fun varI4FromUI1(bin: UByte, plout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarI4FromUI1")

public actual fun varI4FromUI2(uiin: UShort, plout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarI4FromUI2")

public actual fun varI4FromUI4(ulin: UInt, plout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarI4FromUI4")

public actual fun varI4FromUI8(ui64in: ULong, plout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarI4FromUI8")

public actual fun varI8FromBool(boolin: VariantBool, pi64out: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarI8FromBool")

public actual fun varI8FromCy(cyin: CY, pi64out: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarI8FromCy")

public actual fun varI8FromDate(datein: Double, pi64out: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarI8FromDate")

public actual fun varI8FromDec(pdecin: ConstPtr, pi64out: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarI8FromDec")

public actual fun varI8FromDisp(pdispin: MutPtr, lcid: UInt, pi64out: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarI8FromDisp")

public actual fun varI8FromI1(cin: Byte, pi64out: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarI8FromI1")

public actual fun varI8FromI2(sin: Short, pi64out: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarI8FromI2")

public actual fun varI8FromR4(fltin: Float, pi64out: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarI8FromR4")

public actual fun varI8FromR8(dblin: Double, pi64out: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarI8FromR8")

public actual fun varI8FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pi64out: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarI8FromStr")

public actual fun varI8FromUI1(bin: UByte, pi64out: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarI8FromUI1")

public actual fun varI8FromUI2(uiin: UShort, pi64out: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarI8FromUI2")

public actual fun varI8FromUI4(ulin: UInt, pi64out: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarI8FromUI4")

public actual fun varI8FromUI8(ui64in: ULong, pi64out: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarI8FromUI8")

public actual fun varIdiv(pvarleft: ConstPtr, pvarright: ConstPtr, pvarresult: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarIdiv")

public actual fun varImp(pvarleft: ConstPtr, pvarright: ConstPtr, pvarresult: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarImp")

public actual fun varInt(pvarin: ConstPtr, pvarresult: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarInt")

public actual fun varMod(pvarleft: ConstPtr, pvarright: ConstPtr, pvarresult: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarMod")

public actual fun varMonthName(imonth: Int, fabbrev: Int, dwflags: UInt, pbstrout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarMonthName")

public actual fun varMul(pvarleft: ConstPtr, pvarright: ConstPtr, pvarresult: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarMul")

public actual fun varNeg(pvarin: ConstPtr, pvarresult: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarNeg")

public actual fun varNot(pvarin: ConstPtr, pvarresult: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarNot")

public actual fun varNumFromParseNum(pnumprs: ConstPtr, rgbdig: ConstPtr, dwvtbits: UInt, pvar: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarNumFromParseNum")

public actual fun varOr(pvarleft: ConstPtr, pvarright: ConstPtr, pvarresult: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarOr")

public actual fun varParseNumFromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pnumprs: MutPtr, rgbdig: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarParseNumFromStr")

public actual fun varPow(pvarleft: ConstPtr, pvarright: ConstPtr, pvarresult: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarPow")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemOleVarR4CmpR8")
private external fun wasiWindowssysWindowsWin32SystemOleVarR4CmpR8(fltleft: Float, dblright: Double): Int

public actual fun varR4CmpR8(fltleft: Float, dblright: Double): Varcmp =
    wasiWindowssysWindowsWin32SystemOleVarR4CmpR8(fltleft, dblright).toUInt()

public actual fun varR4FromBool(boolin: VariantBool, pfltout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarR4FromBool")

public actual fun varR4FromCy(cyin: CY, pfltout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarR4FromCy")

public actual fun varR4FromDate(datein: Double, pfltout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarR4FromDate")

public actual fun varR4FromDec(pdecin: ConstPtr, pfltout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarR4FromDec")

public actual fun varR4FromDisp(pdispin: MutPtr, lcid: UInt, pfltout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarR4FromDisp")

public actual fun varR4FromI1(cin: Byte, pfltout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarR4FromI1")

public actual fun varR4FromI2(sin: Short, pfltout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarR4FromI2")

public actual fun varR4FromI4(lin: Int, pfltout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarR4FromI4")

public actual fun varR4FromI8(i64in: Long, pfltout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarR4FromI8")

public actual fun varR4FromR8(dblin: Double, pfltout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarR4FromR8")

public actual fun varR4FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pfltout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarR4FromStr")

public actual fun varR4FromUI1(bin: UByte, pfltout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarR4FromUI1")

public actual fun varR4FromUI2(uiin: UShort, pfltout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarR4FromUI2")

public actual fun varR4FromUI4(ulin: UInt, pfltout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarR4FromUI4")

public actual fun varR4FromUI8(ui64in: ULong, pfltout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarR4FromUI8")

public actual fun varR8FromBool(boolin: VariantBool, pdblout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarR8FromBool")

public actual fun varR8FromCy(cyin: CY, pdblout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarR8FromCy")

public actual fun varR8FromDate(datein: Double, pdblout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarR8FromDate")

public actual fun varR8FromDec(pdecin: ConstPtr, pdblout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarR8FromDec")

public actual fun varR8FromDisp(pdispin: MutPtr, lcid: UInt, pdblout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarR8FromDisp")

public actual fun varR8FromI1(cin: Byte, pdblout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarR8FromI1")

public actual fun varR8FromI2(sin: Short, pdblout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarR8FromI2")

public actual fun varR8FromI4(lin: Int, pdblout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarR8FromI4")

public actual fun varR8FromI8(i64in: Long, pdblout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarR8FromI8")

public actual fun varR8FromR4(fltin: Float, pdblout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarR8FromR4")

public actual fun varR8FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pdblout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarR8FromStr")

public actual fun varR8FromUI1(bin: UByte, pdblout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarR8FromUI1")

public actual fun varR8FromUI2(uiin: UShort, pdblout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarR8FromUI2")

public actual fun varR8FromUI4(ulin: UInt, pdblout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarR8FromUI4")

public actual fun varR8FromUI8(ui64in: ULong, pdblout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarR8FromUI8")

public actual fun varR8Pow(dblleft: Double, dblright: Double, pdblresult: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarR8Pow")

public actual fun varR8Round(dblin: Double, cdecimals: Int, pdblresult: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarR8Round")

public actual fun varRound(pvarin: ConstPtr, cdecimals: Int, pvarresult: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarRound")

public actual fun varSub(pvarleft: ConstPtr, pvarright: ConstPtr, pvarresult: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarSub")

public actual fun varTokenizeFormatString(pstrformat: Pcwstr, rgbtok: MutPtr, cbtok: Int, ifirstday: VarformatFirstDay, ifirstweek: VarformatFirstWeek, lcid: UInt, pcbactual: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarTokenizeFormatString")

public actual fun varUI1FromBool(boolin: VariantBool, pbout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarUI1FromBool")

public actual fun varUI1FromCy(cyin: CY, pbout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarUI1FromCy")

public actual fun varUI1FromDate(datein: Double, pbout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarUI1FromDate")

public actual fun varUI1FromDec(pdecin: ConstPtr, pbout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarUI1FromDec")

public actual fun varUI1FromDisp(pdispin: MutPtr, lcid: UInt, pbout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarUI1FromDisp")

public actual fun varUI1FromI1(cin: Byte, pbout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarUI1FromI1")

public actual fun varUI1FromI2(sin: Short, pbout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarUI1FromI2")

public actual fun varUI1FromI4(lin: Int, pbout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarUI1FromI4")

public actual fun varUI1FromI8(i64in: Long, pbout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarUI1FromI8")

public actual fun varUI1FromR4(fltin: Float, pbout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarUI1FromR4")

public actual fun varUI1FromR8(dblin: Double, pbout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarUI1FromR8")

public actual fun varUI1FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pbout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarUI1FromStr")

public actual fun varUI1FromUI2(uiin: UShort, pbout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarUI1FromUI2")

public actual fun varUI1FromUI4(ulin: UInt, pbout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarUI1FromUI4")

public actual fun varUI1FromUI8(ui64in: ULong, pbout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarUI1FromUI8")

public actual fun varUI2FromBool(boolin: VariantBool, puiout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarUI2FromBool")

public actual fun varUI2FromCy(cyin: CY, puiout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarUI2FromCy")

public actual fun varUI2FromDate(datein: Double, puiout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarUI2FromDate")

public actual fun varUI2FromDec(pdecin: ConstPtr, puiout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarUI2FromDec")

public actual fun varUI2FromDisp(pdispin: MutPtr, lcid: UInt, puiout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarUI2FromDisp")

public actual fun varUI2FromI1(cin: Byte, puiout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarUI2FromI1")

public actual fun varUI2FromI2(uiin: Short, puiout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarUI2FromI2")

public actual fun varUI2FromI4(lin: Int, puiout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarUI2FromI4")

public actual fun varUI2FromI8(i64in: Long, puiout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarUI2FromI8")

public actual fun varUI2FromR4(fltin: Float, puiout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarUI2FromR4")

public actual fun varUI2FromR8(dblin: Double, puiout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarUI2FromR8")

public actual fun varUI2FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, puiout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarUI2FromStr")

public actual fun varUI2FromUI1(bin: UByte, puiout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarUI2FromUI1")

public actual fun varUI2FromUI4(ulin: UInt, puiout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarUI2FromUI4")

public actual fun varUI2FromUI8(i64in: ULong, puiout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarUI2FromUI8")

public actual fun varUI4FromBool(boolin: VariantBool, pulout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarUI4FromBool")

public actual fun varUI4FromCy(cyin: CY, pulout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarUI4FromCy")

public actual fun varUI4FromDate(datein: Double, pulout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarUI4FromDate")

public actual fun varUI4FromDec(pdecin: ConstPtr, pulout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarUI4FromDec")

public actual fun varUI4FromDisp(pdispin: MutPtr, lcid: UInt, pulout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarUI4FromDisp")

public actual fun varUI4FromI1(cin: Byte, pulout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarUI4FromI1")

public actual fun varUI4FromI2(uiin: Short, pulout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarUI4FromI2")

public actual fun varUI4FromI4(lin: Int, pulout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarUI4FromI4")

public actual fun varUI4FromI8(i64in: Long, plout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarUI4FromI8")

public actual fun varUI4FromR4(fltin: Float, pulout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarUI4FromR4")

public actual fun varUI4FromR8(dblin: Double, pulout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarUI4FromR8")

public actual fun varUI4FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pulout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarUI4FromStr")

public actual fun varUI4FromUI1(bin: UByte, pulout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarUI4FromUI1")

public actual fun varUI4FromUI2(uiin: UShort, pulout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarUI4FromUI2")

public actual fun varUI4FromUI8(ui64in: ULong, plout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarUI4FromUI8")

public actual fun varUI8FromBool(boolin: VariantBool, pi64out: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarUI8FromBool")

public actual fun varUI8FromCy(cyin: CY, pi64out: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarUI8FromCy")

public actual fun varUI8FromDate(datein: Double, pi64out: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarUI8FromDate")

public actual fun varUI8FromDec(pdecin: ConstPtr, pi64out: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarUI8FromDec")

public actual fun varUI8FromDisp(pdispin: MutPtr, lcid: UInt, pi64out: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarUI8FromDisp")

public actual fun varUI8FromI1(cin: Byte, pi64out: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarUI8FromI1")

public actual fun varUI8FromI2(sin: Short, pi64out: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarUI8FromI2")

public actual fun varUI8FromI8(ui64in: Long, pi64out: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarUI8FromI8")

public actual fun varUI8FromR4(fltin: Float, pi64out: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarUI8FromR4")

public actual fun varUI8FromR8(dblin: Double, pi64out: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarUI8FromR8")

public actual fun varUI8FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pi64out: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarUI8FromStr")

public actual fun varUI8FromUI1(bin: UByte, pi64out: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarUI8FromUI1")

public actual fun varUI8FromUI2(uiin: UShort, pi64out: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarUI8FromUI2")

public actual fun varUI8FromUI4(ulin: UInt, pi64out: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarUI8FromUI4")

public actual fun varUdateFromDate(datein: Double, dwflags: UInt, pudateout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarUdateFromDate")

public actual fun varWeekdayName(iweekday: Int, fabbrev: Int, ifirstday: Int, dwflags: UInt, pbstrout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarWeekdayName")

public actual fun varXor(pvarleft: ConstPtr, pvarright: ConstPtr, pvarresult: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVarXor")

public actual fun vectorFromBstr(bstr: Bstr, ppsa: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemOleVectorFromBstr")
