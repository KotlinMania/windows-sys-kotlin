@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.ole

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.BSTR
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HGLOBAL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HINSTANCE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.VARIANT_BOOL
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HDC
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HPALETTE
import io.github.kotlinmania.windowssys.windows.win32.system.com.CALLCONV
import io.github.kotlinmania.windowssys.windows.win32.system.com.CY
import io.github.kotlinmania.windowssys.windows.win32.system.com.SYSKIND
import io.github.kotlinmania.windowssys.windows.win32.system.memory.GLOBAL_ALLOC_FLAGS
import io.github.kotlinmania.windowssys.windows.win32.system.variant.VARENUM
import io.github.kotlinmania.windowssys.windows.win32.system.variant.VARIANT
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.HACCEL
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.HCURSOR
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.HICON
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.HMENU
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun BstrFromVector(psa: Long, pbstr: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_BstrFromVector(psa.toCPointer<ByteVar>(), pbstr.toCPointer<ByteVar>())

public actual fun ClearCustData(pcustdata: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_ClearCustData(pcustdata.toCPointer<ByteVar>())
}

public actual fun CreateDispTypeInfo(pidata: Long, lcid: UInt, pptinfo: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_CreateDispTypeInfo(pidata.toCPointer<ByteVar>(), lcid, pptinfo.toCPointer<ByteVar>())

public actual fun CreateErrorInfo(pperrinfo: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_CreateErrorInfo(pperrinfo.toCPointer<ByteVar>())

public actual fun CreateOleAdviseHolder(ppoaholder: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_CreateOleAdviseHolder(ppoaholder.toCPointer<ByteVar>())

public actual fun CreateStdDispatch(punkouter: Long, pvthis: Long, ptinfo: Long, ppunkstddisp: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_CreateStdDispatch(punkouter.toCPointer<ByteVar>(), pvthis.toCPointer<ByteVar>(), ptinfo.toCPointer<ByteVar>(), ppunkstddisp.toCPointer<ByteVar>())

public actual fun CreateTypeLib(syskind: SYSKIND, szfile: PCWSTR, ppctlib: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_CreateTypeLib(syskind, szfile.toCPointer<ByteVar>(), ppctlib.toCPointer<ByteVar>())

public actual fun CreateTypeLib2(syskind: SYSKIND, szfile: PCWSTR, ppctlib: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_CreateTypeLib2(syskind, szfile.toCPointer<ByteVar>(), ppctlib.toCPointer<ByteVar>())

public actual fun DispCallFunc(pvinstance: Long, ovft: ULong, cc: CALLCONV, vtreturn: VARENUM, cactuals: UInt, prgvt: Long, prgpvarg: Long, pvargresult: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_DispCallFunc(pvinstance.toCPointer<ByteVar>(), ovft, cc, vtreturn, cactuals, prgvt.toCPointer<ByteVar>(), prgpvarg.toCPointer<ByteVar>(), pvargresult.toCPointer<ByteVar>())

public actual fun DispGetIDsOfNames(ptinfo: Long, rgsznames: Long, cnames: UInt, rgdispid: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_DispGetIDsOfNames(ptinfo.toCPointer<ByteVar>(), rgsznames.toCPointer<ByteVar>(), cnames, rgdispid.toCPointer<ByteVar>())

public actual fun DispGetParam(pdispparams: Long, position: UInt, vttarg: VARENUM, pvarresult: Long, puargerr: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_DispGetParam(pdispparams.toCPointer<ByteVar>(), position, vttarg, pvarresult.toCPointer<ByteVar>(), puargerr.toCPointer<ByteVar>())

public actual fun DispInvoke(_this: Long, ptinfo: Long, dispidmember: Int, wflags: UShort, pparams: Long, pvarresult: Long, pexcepinfo: Long, puargerr: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_DispInvoke(_this.toCPointer<ByteVar>(), ptinfo.toCPointer<ByteVar>(), dispidmember, wflags, pparams.toCPointer<ByteVar>(), pvarresult.toCPointer<ByteVar>(), pexcepinfo.toCPointer<ByteVar>(), puargerr.toCPointer<ByteVar>())

public actual fun DoDragDrop(pdataobj: Long, pdropsource: Long, dwokeffects: DROPEFFECT, pdweffect: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_DoDragDrop(pdataobj.toCPointer<ByteVar>(), pdropsource.toCPointer<ByteVar>(), dwokeffects, pdweffect.toCPointer<ByteVar>())

public actual fun GetActiveObject(rclsid: Long, pvreserved: Long, ppunk: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_GetActiveObject(rclsid.toCPointer<ByteVar>(), pvreserved.toCPointer<ByteVar>(), ppunk.toCPointer<ByteVar>())

public actual fun GetAltMonthNames(lcid: UInt, prgp: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_GetAltMonthNames(lcid, prgp.toCPointer<ByteVar>())

public actual fun GetRecordInfoFromGuids(rguidtypelib: Long, uvermajor: UInt, uverminor: UInt, lcid: UInt, rguidtypeinfo: Long, pprecinfo: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_GetRecordInfoFromGuids(rguidtypelib.toCPointer<ByteVar>(), uvermajor, uverminor, lcid, rguidtypeinfo.toCPointer<ByteVar>(), pprecinfo.toCPointer<ByteVar>())

public actual fun GetRecordInfoFromTypeInfo(ptypeinfo: Long, pprecinfo: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_GetRecordInfoFromTypeInfo(ptypeinfo.toCPointer<ByteVar>(), pprecinfo.toCPointer<ByteVar>())

public actual fun HRGN_UserFree(param0: Long, param1: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_HRGN_UserFree(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>())
}

public actual fun HRGN_UserFree64(param0: Long, param1: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_HRGN_UserFree64(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>())
}

public actual fun HRGN_UserMarshal(param0: Long, param1: Long, param2: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_HRGN_UserMarshal(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun HRGN_UserMarshal64(param0: Long, param1: Long, param2: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_HRGN_UserMarshal64(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun HRGN_UserSize(param0: Long, param1: UInt, param2: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_HRGN_UserSize(param0.toCPointer<ByteVar>(), param1, param2.toCPointer<ByteVar>())

public actual fun HRGN_UserSize64(param0: Long, param1: UInt, param2: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_HRGN_UserSize64(param0.toCPointer<ByteVar>(), param1, param2.toCPointer<ByteVar>())

public actual fun HRGN_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_HRGN_UserUnmarshal(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun HRGN_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_HRGN_UserUnmarshal64(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun IsAccelerator(haccel: HACCEL, caccelentries: Int, lpmsg: Long, lpwcmd: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_IsAccelerator(haccel.toCPointer<ByteVar>(), caccelentries, lpmsg.toCPointer<ByteVar>(), lpwcmd.toCPointer<ByteVar>())

public actual fun LHashValOfNameSys(syskind: SYSKIND, lcid: UInt, szname: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_LHashValOfNameSys(syskind, lcid, szname.toCPointer<ByteVar>())

public actual fun LHashValOfNameSysA(syskind: SYSKIND, lcid: UInt, szname: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_LHashValOfNameSysA(syskind, lcid, szname.toCPointer<ByteVar>())

public actual fun LoadRegTypeLib(rguid: Long, wvermajor: UShort, wverminor: UShort, lcid: UInt, pptlib: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_LoadRegTypeLib(rguid.toCPointer<ByteVar>(), wvermajor, wverminor, lcid, pptlib.toCPointer<ByteVar>())

public actual fun LoadTypeLib(szfile: PCWSTR, pptlib: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_LoadTypeLib(szfile.toCPointer<ByteVar>(), pptlib.toCPointer<ByteVar>())

public actual fun LoadTypeLibEx(szfile: PCWSTR, regkind: REGKIND, pptlib: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_LoadTypeLibEx(szfile.toCPointer<ByteVar>(), regkind, pptlib.toCPointer<ByteVar>())

public actual fun OaBuildVersion(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OaBuildVersion()

public actual fun OaEnablePerUserTLibRegistration() {
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OaEnablePerUserTLibRegistration()
}

public actual fun OleBuildVersion(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleBuildVersion()

public actual fun OleConvertOLESTREAMToIStorage2(lpolestream: Long, pstg: Long, ptd: Long, opt: UInt, pvcallbackcontext: Long, pqueryconvertolelinkcallback: OLESTREAMQUERYCONVERTOLELINKCALLBACK): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleConvertOLESTREAMToIStorage2(lpolestream.toCPointer<ByteVar>(), pstg.toCPointer<ByteVar>(), ptd.toCPointer<ByteVar>(), opt, pvcallbackcontext.toCPointer<ByteVar>(), pqueryconvertolelinkcallback.toLong().toCPointer<ByteVar>())

public actual fun OleConvertOLESTREAMToIStorageEx2(polestm: Long, pstg: Long, pcfformat: Long, plwwidth: Long, plheight: Long, pdwsize: Long, pmedium: Long, opt: UInt, pvcallbackcontext: Long, pqueryconvertolelinkcallback: OLESTREAMQUERYCONVERTOLELINKCALLBACK): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleConvertOLESTREAMToIStorageEx2(polestm.toCPointer<ByteVar>(), pstg.toCPointer<ByteVar>(), pcfformat.toCPointer<ByteVar>(), plwwidth.toCPointer<ByteVar>(), plheight.toCPointer<ByteVar>(), pdwsize.toCPointer<ByteVar>(), pmedium.toCPointer<ByteVar>(), opt, pvcallbackcontext.toCPointer<ByteVar>(), pqueryconvertolelinkcallback.toLong().toCPointer<ByteVar>())

public actual fun OleCreate(rclsid: Long, riid: Long, renderopt: UInt, pformatetc: Long, pclientsite: Long, pstg: Long, ppvobj: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleCreate(rclsid.toCPointer<ByteVar>(), riid.toCPointer<ByteVar>(), renderopt, pformatetc.toCPointer<ByteVar>(), pclientsite.toCPointer<ByteVar>(), pstg.toCPointer<ByteVar>(), ppvobj.toCPointer<ByteVar>())

public actual fun OleCreateDefaultHandler(clsid: Long, punkouter: Long, riid: Long, lplpobj: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleCreateDefaultHandler(clsid.toCPointer<ByteVar>(), punkouter.toCPointer<ByteVar>(), riid.toCPointer<ByteVar>(), lplpobj.toCPointer<ByteVar>())

public actual fun OleCreateEmbeddingHelper(clsid: Long, punkouter: Long, flags: EMBDHLP_FLAGS, pcf: Long, riid: Long, lplpobj: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleCreateEmbeddingHelper(clsid.toCPointer<ByteVar>(), punkouter.toCPointer<ByteVar>(), flags, pcf.toCPointer<ByteVar>(), riid.toCPointer<ByteVar>(), lplpobj.toCPointer<ByteVar>())

public actual fun OleCreateEx(rclsid: Long, riid: Long, dwflags: OLECREATE, renderopt: UInt, cformats: UInt, rgadvf: Long, rgformatetc: Long, lpadvisesink: Long, rgdwconnection: Long, pclientsite: Long, pstg: Long, ppvobj: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleCreateEx(rclsid.toCPointer<ByteVar>(), riid.toCPointer<ByteVar>(), dwflags, renderopt, cformats, rgadvf.toCPointer<ByteVar>(), rgformatetc.toCPointer<ByteVar>(), lpadvisesink.toCPointer<ByteVar>(), rgdwconnection.toCPointer<ByteVar>(), pclientsite.toCPointer<ByteVar>(), pstg.toCPointer<ByteVar>(), ppvobj.toCPointer<ByteVar>())

public actual fun OleCreateFontIndirect(lpfontdesc: Long, riid: Long, lplpvobj: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleCreateFontIndirect(lpfontdesc.toCPointer<ByteVar>(), riid.toCPointer<ByteVar>(), lplpvobj.toCPointer<ByteVar>())

public actual fun OleCreateFromData(psrcdataobj: Long, riid: Long, renderopt: UInt, pformatetc: Long, pclientsite: Long, pstg: Long, ppvobj: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleCreateFromData(psrcdataobj.toCPointer<ByteVar>(), riid.toCPointer<ByteVar>(), renderopt, pformatetc.toCPointer<ByteVar>(), pclientsite.toCPointer<ByteVar>(), pstg.toCPointer<ByteVar>(), ppvobj.toCPointer<ByteVar>())

public actual fun OleCreateFromDataEx(psrcdataobj: Long, riid: Long, dwflags: OLECREATE, renderopt: UInt, cformats: UInt, rgadvf: Long, rgformatetc: Long, lpadvisesink: Long, rgdwconnection: Long, pclientsite: Long, pstg: Long, ppvobj: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleCreateFromDataEx(psrcdataobj.toCPointer<ByteVar>(), riid.toCPointer<ByteVar>(), dwflags, renderopt, cformats, rgadvf.toCPointer<ByteVar>(), rgformatetc.toCPointer<ByteVar>(), lpadvisesink.toCPointer<ByteVar>(), rgdwconnection.toCPointer<ByteVar>(), pclientsite.toCPointer<ByteVar>(), pstg.toCPointer<ByteVar>(), ppvobj.toCPointer<ByteVar>())

public actual fun OleCreateFromFile(rclsid: Long, lpszfilename: PCWSTR, riid: Long, renderopt: UInt, lpformatetc: Long, pclientsite: Long, pstg: Long, ppvobj: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleCreateFromFile(rclsid.toCPointer<ByteVar>(), lpszfilename.toCPointer<ByteVar>(), riid.toCPointer<ByteVar>(), renderopt, lpformatetc.toCPointer<ByteVar>(), pclientsite.toCPointer<ByteVar>(), pstg.toCPointer<ByteVar>(), ppvobj.toCPointer<ByteVar>())

public actual fun OleCreateFromFileEx(rclsid: Long, lpszfilename: PCWSTR, riid: Long, dwflags: OLECREATE, renderopt: UInt, cformats: UInt, rgadvf: Long, rgformatetc: Long, lpadvisesink: Long, rgdwconnection: Long, pclientsite: Long, pstg: Long, ppvobj: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleCreateFromFileEx(rclsid.toCPointer<ByteVar>(), lpszfilename.toCPointer<ByteVar>(), riid.toCPointer<ByteVar>(), dwflags, renderopt, cformats, rgadvf.toCPointer<ByteVar>(), rgformatetc.toCPointer<ByteVar>(), lpadvisesink.toCPointer<ByteVar>(), rgdwconnection.toCPointer<ByteVar>(), pclientsite.toCPointer<ByteVar>(), pstg.toCPointer<ByteVar>(), ppvobj.toCPointer<ByteVar>())

public actual fun OleCreateLink(pmklinksrc: Long, riid: Long, renderopt: UInt, lpformatetc: Long, pclientsite: Long, pstg: Long, ppvobj: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleCreateLink(pmklinksrc.toCPointer<ByteVar>(), riid.toCPointer<ByteVar>(), renderopt, lpformatetc.toCPointer<ByteVar>(), pclientsite.toCPointer<ByteVar>(), pstg.toCPointer<ByteVar>(), ppvobj.toCPointer<ByteVar>())

public actual fun OleCreateLinkEx(pmklinksrc: Long, riid: Long, dwflags: OLECREATE, renderopt: UInt, cformats: UInt, rgadvf: Long, rgformatetc: Long, lpadvisesink: Long, rgdwconnection: Long, pclientsite: Long, pstg: Long, ppvobj: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleCreateLinkEx(pmklinksrc.toCPointer<ByteVar>(), riid.toCPointer<ByteVar>(), dwflags, renderopt, cformats, rgadvf.toCPointer<ByteVar>(), rgformatetc.toCPointer<ByteVar>(), lpadvisesink.toCPointer<ByteVar>(), rgdwconnection.toCPointer<ByteVar>(), pclientsite.toCPointer<ByteVar>(), pstg.toCPointer<ByteVar>(), ppvobj.toCPointer<ByteVar>())

public actual fun OleCreateLinkFromData(psrcdataobj: Long, riid: Long, renderopt: UInt, pformatetc: Long, pclientsite: Long, pstg: Long, ppvobj: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleCreateLinkFromData(psrcdataobj.toCPointer<ByteVar>(), riid.toCPointer<ByteVar>(), renderopt, pformatetc.toCPointer<ByteVar>(), pclientsite.toCPointer<ByteVar>(), pstg.toCPointer<ByteVar>(), ppvobj.toCPointer<ByteVar>())

public actual fun OleCreateLinkFromDataEx(psrcdataobj: Long, riid: Long, dwflags: OLECREATE, renderopt: UInt, cformats: UInt, rgadvf: Long, rgformatetc: Long, lpadvisesink: Long, rgdwconnection: Long, pclientsite: Long, pstg: Long, ppvobj: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleCreateLinkFromDataEx(psrcdataobj.toCPointer<ByteVar>(), riid.toCPointer<ByteVar>(), dwflags, renderopt, cformats, rgadvf.toCPointer<ByteVar>(), rgformatetc.toCPointer<ByteVar>(), lpadvisesink.toCPointer<ByteVar>(), rgdwconnection.toCPointer<ByteVar>(), pclientsite.toCPointer<ByteVar>(), pstg.toCPointer<ByteVar>(), ppvobj.toCPointer<ByteVar>())

public actual fun OleCreateLinkToFile(lpszfilename: PCWSTR, riid: Long, renderopt: UInt, lpformatetc: Long, pclientsite: Long, pstg: Long, ppvobj: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleCreateLinkToFile(lpszfilename.toCPointer<ByteVar>(), riid.toCPointer<ByteVar>(), renderopt, lpformatetc.toCPointer<ByteVar>(), pclientsite.toCPointer<ByteVar>(), pstg.toCPointer<ByteVar>(), ppvobj.toCPointer<ByteVar>())

public actual fun OleCreateLinkToFileEx(lpszfilename: PCWSTR, riid: Long, dwflags: OLECREATE, renderopt: UInt, cformats: UInt, rgadvf: Long, rgformatetc: Long, lpadvisesink: Long, rgdwconnection: Long, pclientsite: Long, pstg: Long, ppvobj: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleCreateLinkToFileEx(lpszfilename.toCPointer<ByteVar>(), riid.toCPointer<ByteVar>(), dwflags, renderopt, cformats, rgadvf.toCPointer<ByteVar>(), rgformatetc.toCPointer<ByteVar>(), lpadvisesink.toCPointer<ByteVar>(), rgdwconnection.toCPointer<ByteVar>(), pclientsite.toCPointer<ByteVar>(), pstg.toCPointer<ByteVar>(), ppvobj.toCPointer<ByteVar>())

public actual fun OleCreateMenuDescriptor(hmenucombined: HMENU, lpmenuwidths: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleCreateMenuDescriptor(hmenucombined.toCPointer<ByteVar>(), lpmenuwidths.toCPointer<ByteVar>())

public actual fun OleCreatePictureIndirect(lppictdesc: Long, riid: Long, fown: BOOL, lplpvobj: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleCreatePictureIndirect(lppictdesc.toCPointer<ByteVar>(), riid.toCPointer<ByteVar>(), fown, lplpvobj.toCPointer<ByteVar>())

public actual fun OleCreatePropertyFrame(hwndowner: HWND, x: UInt, y: UInt, lpszcaption: PCWSTR, cobjects: UInt, ppunk: Long, cpages: UInt, ppageclsid: Long, lcid: UInt, dwreserved: UInt, pvreserved: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleCreatePropertyFrame(hwndowner.toCPointer<ByteVar>(), x, y, lpszcaption.toCPointer<ByteVar>(), cobjects, ppunk.toCPointer<ByteVar>(), cpages, ppageclsid.toCPointer<ByteVar>(), lcid, dwreserved, pvreserved.toCPointer<ByteVar>())

public actual fun OleCreatePropertyFrameIndirect(lpparams: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleCreatePropertyFrameIndirect(lpparams.toCPointer<ByteVar>())

public actual fun OleCreateStaticFromData(psrcdataobj: Long, iid: Long, renderopt: UInt, pformatetc: Long, pclientsite: Long, pstg: Long, ppvobj: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleCreateStaticFromData(psrcdataobj.toCPointer<ByteVar>(), iid.toCPointer<ByteVar>(), renderopt, pformatetc.toCPointer<ByteVar>(), pclientsite.toCPointer<ByteVar>(), pstg.toCPointer<ByteVar>(), ppvobj.toCPointer<ByteVar>())

public actual fun OleDestroyMenuDescriptor(holemenu: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleDestroyMenuDescriptor(holemenu)

public actual fun OleDoAutoConvert(pstg: Long, pclsidnew: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleDoAutoConvert(pstg.toCPointer<ByteVar>(), pclsidnew.toCPointer<ByteVar>())

public actual fun OleDraw(punknown: Long, dwaspect: UInt, hdcdraw: HDC, lprcbounds: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleDraw(punknown.toCPointer<ByteVar>(), dwaspect, hdcdraw.toCPointer<ByteVar>(), lprcbounds.toCPointer<ByteVar>())

public actual fun OleDuplicateData(hsrc: HANDLE, cfformat: CLIPBOARD_FORMAT, uiflags: GLOBAL_ALLOC_FLAGS): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleDuplicateData(hsrc.toCPointer<ByteVar>(), cfformat, uiflags)?.toLong() ?: 0L

public actual fun OleFlushClipboard(): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleFlushClipboard()

public actual fun OleGetAutoConvert(clsidold: Long, pclsidnew: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleGetAutoConvert(clsidold.toCPointer<ByteVar>(), pclsidnew.toCPointer<ByteVar>())

public actual fun OleGetClipboard(ppdataobj: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleGetClipboard(ppdataobj.toCPointer<ByteVar>())

public actual fun OleGetClipboardWithEnterpriseInfo(dataobject: Long, dataenterpriseid: Long, sourcedescription: Long, targetdescription: Long, datadescription: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleGetClipboardWithEnterpriseInfo(dataobject.toCPointer<ByteVar>(), dataenterpriseid.toCPointer<ByteVar>(), sourcedescription.toCPointer<ByteVar>(), targetdescription.toCPointer<ByteVar>(), datadescription.toCPointer<ByteVar>())

public actual fun OleGetIconOfClass(rclsid: Long, lpszlabel: PCWSTR, fusetypeaslabel: BOOL): HGLOBAL =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleGetIconOfClass(rclsid.toCPointer<ByteVar>(), lpszlabel.toCPointer<ByteVar>(), fusetypeaslabel)?.toLong() ?: 0L

public actual fun OleGetIconOfFile(lpszpath: PCWSTR, fusefileaslabel: BOOL): HGLOBAL =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleGetIconOfFile(lpszpath.toCPointer<ByteVar>(), fusefileaslabel)?.toLong() ?: 0L

public actual fun OleIconToCursor(hinstexe: HINSTANCE, hicon: HICON): HCURSOR =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleIconToCursor(hinstexe.toCPointer<ByteVar>(), hicon.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun OleInitialize(pvreserved: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleInitialize(pvreserved.toCPointer<ByteVar>())

public actual fun OleIsCurrentClipboard(pdataobj: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleIsCurrentClipboard(pdataobj.toCPointer<ByteVar>())

public actual fun OleIsRunning(pobject: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleIsRunning(pobject.toCPointer<ByteVar>())

public actual fun OleLoad(pstg: Long, riid: Long, pclientsite: Long, ppvobj: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleLoad(pstg.toCPointer<ByteVar>(), riid.toCPointer<ByteVar>(), pclientsite.toCPointer<ByteVar>(), ppvobj.toCPointer<ByteVar>())

public actual fun OleLoadFromStream(pstm: Long, iidinterface: Long, ppvobj: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleLoadFromStream(pstm.toCPointer<ByteVar>(), iidinterface.toCPointer<ByteVar>(), ppvobj.toCPointer<ByteVar>())

public actual fun OleLoadPicture(lpstream: Long, lsize: Int, frunmode: BOOL, riid: Long, lplpvobj: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleLoadPicture(lpstream.toCPointer<ByteVar>(), lsize, frunmode, riid.toCPointer<ByteVar>(), lplpvobj.toCPointer<ByteVar>())

public actual fun OleLoadPictureEx(lpstream: Long, lsize: Int, frunmode: BOOL, riid: Long, xsizedesired: UInt, ysizedesired: UInt, dwflags: LOAD_PICTURE_FLAGS, lplpvobj: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleLoadPictureEx(lpstream.toCPointer<ByteVar>(), lsize, frunmode, riid.toCPointer<ByteVar>(), xsizedesired, ysizedesired, dwflags, lplpvobj.toCPointer<ByteVar>())

public actual fun OleLoadPictureFile(varfilename: VARIANT, lplpdisppicture: Long): HRESULT =
    0

public actual fun OleLoadPictureFileEx(varfilename: VARIANT, xsizedesired: UInt, ysizedesired: UInt, dwflags: LOAD_PICTURE_FLAGS, lplpdisppicture: Long): HRESULT =
    0

public actual fun OleLoadPicturePath(szurlorpath: PCWSTR, punkcaller: Long, dwreserved: UInt, clrreserved: UInt, riid: Long, ppvret: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleLoadPicturePath(szurlorpath.toCPointer<ByteVar>(), punkcaller.toCPointer<ByteVar>(), dwreserved, clrreserved, riid.toCPointer<ByteVar>(), ppvret.toCPointer<ByteVar>())

public actual fun OleLockRunning(punknown: Long, flock: BOOL, flastunlockcloses: BOOL): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleLockRunning(punknown.toCPointer<ByteVar>(), flock, flastunlockcloses)

public actual fun OleMetafilePictFromIconAndLabel(hicon: HICON, lpszlabel: PCWSTR, lpszsourcefile: PCWSTR, iiconindex: UInt): HGLOBAL =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleMetafilePictFromIconAndLabel(hicon.toCPointer<ByteVar>(), lpszlabel.toCPointer<ByteVar>(), lpszsourcefile.toCPointer<ByteVar>(), iiconindex)?.toLong() ?: 0L

public actual fun OleNoteObjectVisible(punknown: Long, fvisible: BOOL): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleNoteObjectVisible(punknown.toCPointer<ByteVar>(), fvisible)

public actual fun OleQueryCreateFromData(psrcdataobject: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleQueryCreateFromData(psrcdataobject.toCPointer<ByteVar>())

public actual fun OleQueryLinkFromData(psrcdataobject: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleQueryLinkFromData(psrcdataobject.toCPointer<ByteVar>())

public actual fun OleRegEnumFormatEtc(clsid: Long, dwdirection: UInt, ppenum: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleRegEnumFormatEtc(clsid.toCPointer<ByteVar>(), dwdirection, ppenum.toCPointer<ByteVar>())

public actual fun OleRegEnumVerbs(clsid: Long, ppenum: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleRegEnumVerbs(clsid.toCPointer<ByteVar>(), ppenum.toCPointer<ByteVar>())

public actual fun OleRegGetMiscStatus(clsid: Long, dwaspect: UInt, pdwstatus: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleRegGetMiscStatus(clsid.toCPointer<ByteVar>(), dwaspect, pdwstatus.toCPointer<ByteVar>())

public actual fun OleRegGetUserType(clsid: Long, dwformoftype: UInt, pszusertype: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleRegGetUserType(clsid.toCPointer<ByteVar>(), dwformoftype, pszusertype.toCPointer<ByteVar>())

public actual fun OleRun(punknown: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleRun(punknown.toCPointer<ByteVar>())

public actual fun OleSave(pps: Long, pstg: Long, fsameasload: BOOL): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleSave(pps.toCPointer<ByteVar>(), pstg.toCPointer<ByteVar>(), fsameasload)

public actual fun OleSavePictureFile(lpdisppicture: Long, bstrfilename: BSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleSavePictureFile(lpdisppicture.toCPointer<ByteVar>(), bstrfilename.toCPointer<ByteVar>())

public actual fun OleSaveToStream(ppstm: Long, pstm: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleSaveToStream(ppstm.toCPointer<ByteVar>(), pstm.toCPointer<ByteVar>())

public actual fun OleSetAutoConvert(clsidold: Long, clsidnew: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleSetAutoConvert(clsidold.toCPointer<ByteVar>(), clsidnew.toCPointer<ByteVar>())

public actual fun OleSetClipboard(pdataobj: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleSetClipboard(pdataobj.toCPointer<ByteVar>())

public actual fun OleSetContainedObject(punknown: Long, fcontained: BOOL): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleSetContainedObject(punknown.toCPointer<ByteVar>(), fcontained)

public actual fun OleSetMenuDescriptor(holemenu: Long, hwndframe: HWND, hwndactiveobject: HWND, lpframe: Long, lpactiveobj: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleSetMenuDescriptor(holemenu, hwndframe.toCPointer<ByteVar>(), hwndactiveobject.toCPointer<ByteVar>(), lpframe.toCPointer<ByteVar>(), lpactiveobj.toCPointer<ByteVar>())

public actual fun OleTranslateAccelerator(lpframe: Long, lpframeinfo: Long, lpmsg: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleTranslateAccelerator(lpframe.toCPointer<ByteVar>(), lpframeinfo.toCPointer<ByteVar>(), lpmsg.toCPointer<ByteVar>())

public actual fun OleTranslateColor(clr: UInt, hpal: HPALETTE, lpcolorref: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleTranslateColor(clr, hpal.toCPointer<ByteVar>(), lpcolorref.toCPointer<ByteVar>())

public actual fun OleUIAddVerbMenuA(lpoleobj: Long, lpszshorttype: PCSTR, hmenu: HMENU, upos: UInt, uidverbmin: UInt, uidverbmax: UInt, baddconvert: BOOL, idconvert: UInt, lphmenu: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleUIAddVerbMenuA(lpoleobj.toCPointer<ByteVar>(), lpszshorttype.toCPointer<ByteVar>(), hmenu.toCPointer<ByteVar>(), upos, uidverbmin, uidverbmax, baddconvert, idconvert, lphmenu.toCPointer<ByteVar>())

public actual fun OleUIAddVerbMenuW(lpoleobj: Long, lpszshorttype: PCWSTR, hmenu: HMENU, upos: UInt, uidverbmin: UInt, uidverbmax: UInt, baddconvert: BOOL, idconvert: UInt, lphmenu: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleUIAddVerbMenuW(lpoleobj.toCPointer<ByteVar>(), lpszshorttype.toCPointer<ByteVar>(), hmenu.toCPointer<ByteVar>(), upos, uidverbmin, uidverbmax, baddconvert, idconvert, lphmenu.toCPointer<ByteVar>())

public actual fun OleUIBusyA(param0: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleUIBusyA(param0.toCPointer<ByteVar>())

public actual fun OleUIBusyW(param0: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleUIBusyW(param0.toCPointer<ByteVar>())

public actual fun OleUICanConvertOrActivateAs(rclsid: Long, fislinkedobject: BOOL, wformat: UShort): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleUICanConvertOrActivateAs(rclsid.toCPointer<ByteVar>(), fislinkedobject, wformat)

public actual fun OleUIChangeIconA(param0: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleUIChangeIconA(param0.toCPointer<ByteVar>())

public actual fun OleUIChangeIconW(param0: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleUIChangeIconW(param0.toCPointer<ByteVar>())

public actual fun OleUIChangeSourceA(param0: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleUIChangeSourceA(param0.toCPointer<ByteVar>())

public actual fun OleUIChangeSourceW(param0: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleUIChangeSourceW(param0.toCPointer<ByteVar>())

public actual fun OleUIConvertA(param0: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleUIConvertA(param0.toCPointer<ByteVar>())

public actual fun OleUIConvertW(param0: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleUIConvertW(param0.toCPointer<ByteVar>())

public actual fun OleUIEditLinksA(param0: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleUIEditLinksA(param0.toCPointer<ByteVar>())

public actual fun OleUIEditLinksW(param0: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleUIEditLinksW(param0.toCPointer<ByteVar>())

public actual fun OleUIInsertObjectA(param0: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleUIInsertObjectA(param0.toCPointer<ByteVar>())

public actual fun OleUIInsertObjectW(param0: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleUIInsertObjectW(param0.toCPointer<ByteVar>())

public actual fun OleUIObjectPropertiesA(param0: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleUIObjectPropertiesA(param0.toCPointer<ByteVar>())

public actual fun OleUIObjectPropertiesW(param0: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleUIObjectPropertiesW(param0.toCPointer<ByteVar>())

public actual fun OleUIPasteSpecialA(param0: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleUIPasteSpecialA(param0.toCPointer<ByteVar>())

public actual fun OleUIPasteSpecialW(param0: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleUIPasteSpecialW(param0.toCPointer<ByteVar>())

public actual fun OleUIPromptUserA(ntemplate: Int, hwndparent: HWND): Int =
    0

public actual fun OleUIPromptUserW(ntemplate: Int, hwndparent: HWND): Int =
    0

public actual fun OleUIUpdateLinksA(lpoleuilinkcntr: Long, hwndparent: HWND, lpsztitle: PCSTR, clinks: Int): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleUIUpdateLinksA(lpoleuilinkcntr.toCPointer<ByteVar>(), hwndparent.toCPointer<ByteVar>(), lpsztitle.toCPointer<ByteVar>(), clinks)

public actual fun OleUIUpdateLinksW(lpoleuilinkcntr: Long, hwndparent: HWND, lpsztitle: PCWSTR, clinks: Int): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleUIUpdateLinksW(lpoleuilinkcntr.toCPointer<ByteVar>(), hwndparent.toCPointer<ByteVar>(), lpsztitle.toCPointer<ByteVar>(), clinks)

public actual fun OleUninitialize() {
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_OleUninitialize()
}

public actual fun QueryPathOfRegTypeLib(guid: Long, wmaj: UShort, wmin: UShort, lcid: UInt, lpbstrpathname: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_QueryPathOfRegTypeLib(guid.toCPointer<ByteVar>(), wmaj, wmin, lcid, lpbstrpathname.toCPointer<ByteVar>())

public actual fun RegisterActiveObject(punk: Long, rclsid: Long, dwflags: ACTIVEOBJECT_FLAGS, pdwregister: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_RegisterActiveObject(punk.toCPointer<ByteVar>(), rclsid.toCPointer<ByteVar>(), dwflags, pdwregister.toCPointer<ByteVar>())

public actual fun RegisterDragDrop(hwnd: HWND, pdroptarget: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_RegisterDragDrop(hwnd.toCPointer<ByteVar>(), pdroptarget.toCPointer<ByteVar>())

public actual fun RegisterTypeLib(ptlib: Long, szfullpath: PCWSTR, szhelpdir: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_RegisterTypeLib(ptlib.toCPointer<ByteVar>(), szfullpath.toCPointer<ByteVar>(), szhelpdir.toCPointer<ByteVar>())

public actual fun RegisterTypeLibForUser(ptlib: Long, szfullpath: PCWSTR, szhelpdir: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_RegisterTypeLibForUser(ptlib.toCPointer<ByteVar>(), szfullpath.toCPointer<ByteVar>(), szhelpdir.toCPointer<ByteVar>())

public actual fun ReleaseStgMedium(param0: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_ReleaseStgMedium(param0.toCPointer<ByteVar>())
}

public actual fun RevokeActiveObject(dwregister: UInt, pvreserved: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_RevokeActiveObject(dwregister, pvreserved.toCPointer<ByteVar>())

public actual fun RevokeDragDrop(hwnd: HWND): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_RevokeDragDrop(hwnd.toCPointer<ByteVar>())

public actual fun SafeArrayAccessData(psa: Long, ppvdata: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_SafeArrayAccessData(psa.toCPointer<ByteVar>(), ppvdata.toCPointer<ByteVar>())

public actual fun SafeArrayAddRef(psa: Long, ppdatatorelease: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_SafeArrayAddRef(psa.toCPointer<ByteVar>(), ppdatatorelease.toCPointer<ByteVar>())

public actual fun SafeArrayAllocData(psa: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_SafeArrayAllocData(psa.toCPointer<ByteVar>())

public actual fun SafeArrayAllocDescriptor(cdims: UInt, ppsaout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_SafeArrayAllocDescriptor(cdims, ppsaout.toCPointer<ByteVar>())

public actual fun SafeArrayAllocDescriptorEx(vt: VARENUM, cdims: UInt, ppsaout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_SafeArrayAllocDescriptorEx(vt, cdims, ppsaout.toCPointer<ByteVar>())

public actual fun SafeArrayCopy(psa: Long, ppsaout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_SafeArrayCopy(psa.toCPointer<ByteVar>(), ppsaout.toCPointer<ByteVar>())

public actual fun SafeArrayCopyData(psasource: Long, psatarget: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_SafeArrayCopyData(psasource.toCPointer<ByteVar>(), psatarget.toCPointer<ByteVar>())

public actual fun SafeArrayCreate(vt: VARENUM, cdims: UInt, rgsabound: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_SafeArrayCreate(vt, cdims, rgsabound.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun SafeArrayCreateEx(vt: VARENUM, cdims: UInt, rgsabound: Long, pvextra: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_SafeArrayCreateEx(vt, cdims, rgsabound.toCPointer<ByteVar>(), pvextra.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun SafeArrayCreateVector(vt: VARENUM, llbound: Int, celements: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_SafeArrayCreateVector(vt, llbound, celements)?.toLong() ?: 0L

public actual fun SafeArrayCreateVectorEx(vt: VARENUM, llbound: Int, celements: UInt, pvextra: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_SafeArrayCreateVectorEx(vt, llbound, celements, pvextra.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun SafeArrayDestroy(psa: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_SafeArrayDestroy(psa.toCPointer<ByteVar>())

public actual fun SafeArrayDestroyData(psa: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_SafeArrayDestroyData(psa.toCPointer<ByteVar>())

public actual fun SafeArrayDestroyDescriptor(psa: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_SafeArrayDestroyDescriptor(psa.toCPointer<ByteVar>())

public actual fun SafeArrayGetDim(psa: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_SafeArrayGetDim(psa.toCPointer<ByteVar>())

public actual fun SafeArrayGetElement(psa: Long, rgindices: Long, pv: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_SafeArrayGetElement(psa.toCPointer<ByteVar>(), rgindices.toCPointer<ByteVar>(), pv.toCPointer<ByteVar>())

public actual fun SafeArrayGetElemsize(psa: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_SafeArrayGetElemsize(psa.toCPointer<ByteVar>())

public actual fun SafeArrayGetIID(psa: Long, pguid: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_SafeArrayGetIID(psa.toCPointer<ByteVar>(), pguid.toCPointer<ByteVar>())

public actual fun SafeArrayGetLBound(psa: Long, ndim: UInt, pllbound: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_SafeArrayGetLBound(psa.toCPointer<ByteVar>(), ndim, pllbound.toCPointer<ByteVar>())

public actual fun SafeArrayGetRecordInfo(psa: Long, prinfo: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_SafeArrayGetRecordInfo(psa.toCPointer<ByteVar>(), prinfo.toCPointer<ByteVar>())

public actual fun SafeArrayGetUBound(psa: Long, ndim: UInt, plubound: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_SafeArrayGetUBound(psa.toCPointer<ByteVar>(), ndim, plubound.toCPointer<ByteVar>())

public actual fun SafeArrayGetVartype(psa: Long, pvt: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_SafeArrayGetVartype(psa.toCPointer<ByteVar>(), pvt.toCPointer<ByteVar>())

public actual fun SafeArrayLock(psa: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_SafeArrayLock(psa.toCPointer<ByteVar>())

public actual fun SafeArrayPtrOfIndex(psa: Long, rgindices: Long, ppvdata: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_SafeArrayPtrOfIndex(psa.toCPointer<ByteVar>(), rgindices.toCPointer<ByteVar>(), ppvdata.toCPointer<ByteVar>())

public actual fun SafeArrayPutElement(psa: Long, rgindices: Long, pv: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_SafeArrayPutElement(psa.toCPointer<ByteVar>(), rgindices.toCPointer<ByteVar>(), pv.toCPointer<ByteVar>())

public actual fun SafeArrayRedim(psa: Long, psaboundnew: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_SafeArrayRedim(psa.toCPointer<ByteVar>(), psaboundnew.toCPointer<ByteVar>())

public actual fun SafeArrayReleaseData(pdata: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_SafeArrayReleaseData(pdata.toCPointer<ByteVar>())
}

public actual fun SafeArrayReleaseDescriptor(psa: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_SafeArrayReleaseDescriptor(psa.toCPointer<ByteVar>())
}

public actual fun SafeArraySetIID(psa: Long, guid: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_SafeArraySetIID(psa.toCPointer<ByteVar>(), guid.toCPointer<ByteVar>())

public actual fun SafeArraySetRecordInfo(psa: Long, prinfo: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_SafeArraySetRecordInfo(psa.toCPointer<ByteVar>(), prinfo.toCPointer<ByteVar>())

public actual fun SafeArrayUnaccessData(psa: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_SafeArrayUnaccessData(psa.toCPointer<ByteVar>())

public actual fun SafeArrayUnlock(psa: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_SafeArrayUnlock(psa.toCPointer<ByteVar>())

public actual fun UnRegisterTypeLib(libid: Long, wvermajor: UShort, wverminor: UShort, lcid: UInt, syskind: SYSKIND): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_UnRegisterTypeLib(libid.toCPointer<ByteVar>(), wvermajor, wverminor, lcid, syskind)

public actual fun UnRegisterTypeLibForUser(libid: Long, wmajorvernum: UShort, wminorvernum: UShort, lcid: UInt, syskind: SYSKIND): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_UnRegisterTypeLibForUser(libid.toCPointer<ByteVar>(), wmajorvernum, wminorvernum, lcid, syskind)

public actual fun VarAbs(pvarin: Long, pvarresult: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarAbs(pvarin.toCPointer<ByteVar>(), pvarresult.toCPointer<ByteVar>())

public actual fun VarAdd(pvarleft: Long, pvarright: Long, pvarresult: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarAdd(pvarleft.toCPointer<ByteVar>(), pvarright.toCPointer<ByteVar>(), pvarresult.toCPointer<ByteVar>())

public actual fun VarAnd(pvarleft: Long, pvarright: Long, pvarresult: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarAnd(pvarleft.toCPointer<ByteVar>(), pvarright.toCPointer<ByteVar>(), pvarresult.toCPointer<ByteVar>())

public actual fun VarBoolFromCy(cyin: CY, pboolout: Long): HRESULT =
    0

public actual fun VarBoolFromDate(datein: Double, pboolout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarBoolFromDate(datein, pboolout.toCPointer<ByteVar>())

public actual fun VarBoolFromDec(pdecin: Long, pboolout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarBoolFromDec(pdecin.toCPointer<ByteVar>(), pboolout.toCPointer<ByteVar>())

public actual fun VarBoolFromDisp(pdispin: Long, lcid: UInt, pboolout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarBoolFromDisp(pdispin.toCPointer<ByteVar>(), lcid, pboolout.toCPointer<ByteVar>())

public actual fun VarBoolFromI1(cin: Byte, pboolout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarBoolFromI1(cin, pboolout.toCPointer<ByteVar>())

public actual fun VarBoolFromI2(sin: Short, pboolout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarBoolFromI2(sin, pboolout.toCPointer<ByteVar>())

public actual fun VarBoolFromI4(lin: Int, pboolout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarBoolFromI4(lin, pboolout.toCPointer<ByteVar>())

public actual fun VarBoolFromI8(i64in: Long, pboolout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarBoolFromI8(i64in, pboolout.toCPointer<ByteVar>())

public actual fun VarBoolFromR4(fltin: Float, pboolout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarBoolFromR4(fltin, pboolout.toCPointer<ByteVar>())

public actual fun VarBoolFromR8(dblin: Double, pboolout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarBoolFromR8(dblin, pboolout.toCPointer<ByteVar>())

public actual fun VarBoolFromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, pboolout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarBoolFromStr(strin.toCPointer<ByteVar>(), lcid, dwflags, pboolout.toCPointer<ByteVar>())

public actual fun VarBoolFromUI1(bin: UByte, pboolout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarBoolFromUI1(bin, pboolout.toCPointer<ByteVar>())

public actual fun VarBoolFromUI2(uiin: UShort, pboolout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarBoolFromUI2(uiin, pboolout.toCPointer<ByteVar>())

public actual fun VarBoolFromUI4(ulin: UInt, pboolout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarBoolFromUI4(ulin, pboolout.toCPointer<ByteVar>())

public actual fun VarBoolFromUI8(i64in: ULong, pboolout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarBoolFromUI8(i64in, pboolout.toCPointer<ByteVar>())

public actual fun VarBstrCat(bstrleft: BSTR, bstrright: BSTR, pbstrresult: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarBstrCat(bstrleft.toCPointer<ByteVar>(), bstrright.toCPointer<ByteVar>(), pbstrresult.toCPointer<ByteVar>())

public actual fun VarBstrCmp(bstrleft: BSTR, bstrright: BSTR, lcid: UInt, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarBstrCmp(bstrleft.toCPointer<ByteVar>(), bstrright.toCPointer<ByteVar>(), lcid, dwflags)

public actual fun VarBstrFromBool(boolin: VARIANT_BOOL, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarBstrFromBool(boolin, lcid, dwflags, pbstrout.toCPointer<ByteVar>())

public actual fun VarBstrFromCy(cyin: CY, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT =
    0

public actual fun VarBstrFromDate(datein: Double, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarBstrFromDate(datein, lcid, dwflags, pbstrout.toCPointer<ByteVar>())

public actual fun VarBstrFromDec(pdecin: Long, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarBstrFromDec(pdecin.toCPointer<ByteVar>(), lcid, dwflags, pbstrout.toCPointer<ByteVar>())

public actual fun VarBstrFromDisp(pdispin: Long, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarBstrFromDisp(pdispin.toCPointer<ByteVar>(), lcid, dwflags, pbstrout.toCPointer<ByteVar>())

public actual fun VarBstrFromI1(cin: Byte, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarBstrFromI1(cin, lcid, dwflags, pbstrout.toCPointer<ByteVar>())

public actual fun VarBstrFromI2(ival: Short, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarBstrFromI2(ival, lcid, dwflags, pbstrout.toCPointer<ByteVar>())

public actual fun VarBstrFromI4(lin: Int, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarBstrFromI4(lin, lcid, dwflags, pbstrout.toCPointer<ByteVar>())

public actual fun VarBstrFromI8(i64in: Long, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarBstrFromI8(i64in, lcid, dwflags, pbstrout.toCPointer<ByteVar>())

public actual fun VarBstrFromR4(fltin: Float, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarBstrFromR4(fltin, lcid, dwflags, pbstrout.toCPointer<ByteVar>())

public actual fun VarBstrFromR8(dblin: Double, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarBstrFromR8(dblin, lcid, dwflags, pbstrout.toCPointer<ByteVar>())

public actual fun VarBstrFromUI1(bval: UByte, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarBstrFromUI1(bval, lcid, dwflags, pbstrout.toCPointer<ByteVar>())

public actual fun VarBstrFromUI2(uiin: UShort, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarBstrFromUI2(uiin, lcid, dwflags, pbstrout.toCPointer<ByteVar>())

public actual fun VarBstrFromUI4(ulin: UInt, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarBstrFromUI4(ulin, lcid, dwflags, pbstrout.toCPointer<ByteVar>())

public actual fun VarBstrFromUI8(ui64in: ULong, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarBstrFromUI8(ui64in, lcid, dwflags, pbstrout.toCPointer<ByteVar>())

public actual fun VarCat(pvarleft: Long, pvarright: Long, pvarresult: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarCat(pvarleft.toCPointer<ByteVar>(), pvarright.toCPointer<ByteVar>(), pvarresult.toCPointer<ByteVar>())

public actual fun VarCmp(pvarleft: Long, pvarright: Long, lcid: UInt, dwflags: UInt): VARCMP =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarCmp(pvarleft.toCPointer<ByteVar>(), pvarright.toCPointer<ByteVar>(), lcid, dwflags)

public actual fun VarCyAbs(cyin: CY, pcyresult: Long): HRESULT =
    0

public actual fun VarCyAdd(cyleft: CY, cyright: CY, pcyresult: Long): HRESULT =
    0

public actual fun VarCyCmp(cyleft: CY, cyright: CY): VARCMP =
    0u

public actual fun VarCyCmpR8(cyleft: CY, dblright: Double): VARCMP =
    0u

public actual fun VarCyFix(cyin: CY, pcyresult: Long): HRESULT =
    0

public actual fun VarCyFromBool(boolin: VARIANT_BOOL, pcyout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarCyFromBool(boolin, pcyout.toCPointer<ByteVar>())

public actual fun VarCyFromDate(datein: Double, pcyout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarCyFromDate(datein, pcyout.toCPointer<ByteVar>())

public actual fun VarCyFromDec(pdecin: Long, pcyout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarCyFromDec(pdecin.toCPointer<ByteVar>(), pcyout.toCPointer<ByteVar>())

public actual fun VarCyFromDisp(pdispin: Long, lcid: UInt, pcyout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarCyFromDisp(pdispin.toCPointer<ByteVar>(), lcid, pcyout.toCPointer<ByteVar>())

public actual fun VarCyFromI1(cin: Byte, pcyout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarCyFromI1(cin, pcyout.toCPointer<ByteVar>())

public actual fun VarCyFromI2(sin: Short, pcyout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarCyFromI2(sin, pcyout.toCPointer<ByteVar>())

public actual fun VarCyFromI4(lin: Int, pcyout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarCyFromI4(lin, pcyout.toCPointer<ByteVar>())

public actual fun VarCyFromI8(i64in: Long, pcyout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarCyFromI8(i64in, pcyout.toCPointer<ByteVar>())

public actual fun VarCyFromR4(fltin: Float, pcyout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarCyFromR4(fltin, pcyout.toCPointer<ByteVar>())

public actual fun VarCyFromR8(dblin: Double, pcyout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarCyFromR8(dblin, pcyout.toCPointer<ByteVar>())

public actual fun VarCyFromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, pcyout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarCyFromStr(strin.toCPointer<ByteVar>(), lcid, dwflags, pcyout.toCPointer<ByteVar>())

public actual fun VarCyFromUI1(bin: UByte, pcyout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarCyFromUI1(bin, pcyout.toCPointer<ByteVar>())

public actual fun VarCyFromUI2(uiin: UShort, pcyout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarCyFromUI2(uiin, pcyout.toCPointer<ByteVar>())

public actual fun VarCyFromUI4(ulin: UInt, pcyout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarCyFromUI4(ulin, pcyout.toCPointer<ByteVar>())

public actual fun VarCyFromUI8(ui64in: ULong, pcyout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarCyFromUI8(ui64in, pcyout.toCPointer<ByteVar>())

public actual fun VarCyInt(cyin: CY, pcyresult: Long): HRESULT =
    0

public actual fun VarCyMul(cyleft: CY, cyright: CY, pcyresult: Long): HRESULT =
    0

public actual fun VarCyMulI4(cyleft: CY, lright: Int, pcyresult: Long): HRESULT =
    0

public actual fun VarCyMulI8(cyleft: CY, lright: Long, pcyresult: Long): HRESULT =
    0

public actual fun VarCyNeg(cyin: CY, pcyresult: Long): HRESULT =
    0

public actual fun VarCyRound(cyin: CY, cdecimals: Int, pcyresult: Long): HRESULT =
    0

public actual fun VarCySub(cyleft: CY, cyright: CY, pcyresult: Long): HRESULT =
    0

public actual fun VarDateFromBool(boolin: VARIANT_BOOL, pdateout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarDateFromBool(boolin, pdateout.toCPointer<ByteVar>())

public actual fun VarDateFromCy(cyin: CY, pdateout: Long): HRESULT =
    0

public actual fun VarDateFromDec(pdecin: Long, pdateout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarDateFromDec(pdecin.toCPointer<ByteVar>(), pdateout.toCPointer<ByteVar>())

public actual fun VarDateFromDisp(pdispin: Long, lcid: UInt, pdateout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarDateFromDisp(pdispin.toCPointer<ByteVar>(), lcid, pdateout.toCPointer<ByteVar>())

public actual fun VarDateFromI1(cin: Byte, pdateout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarDateFromI1(cin, pdateout.toCPointer<ByteVar>())

public actual fun VarDateFromI2(sin: Short, pdateout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarDateFromI2(sin, pdateout.toCPointer<ByteVar>())

public actual fun VarDateFromI4(lin: Int, pdateout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarDateFromI4(lin, pdateout.toCPointer<ByteVar>())

public actual fun VarDateFromI8(i64in: Long, pdateout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarDateFromI8(i64in, pdateout.toCPointer<ByteVar>())

public actual fun VarDateFromR4(fltin: Float, pdateout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarDateFromR4(fltin, pdateout.toCPointer<ByteVar>())

public actual fun VarDateFromR8(dblin: Double, pdateout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarDateFromR8(dblin, pdateout.toCPointer<ByteVar>())

public actual fun VarDateFromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, pdateout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarDateFromStr(strin.toCPointer<ByteVar>(), lcid, dwflags, pdateout.toCPointer<ByteVar>())

public actual fun VarDateFromUI1(bin: UByte, pdateout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarDateFromUI1(bin, pdateout.toCPointer<ByteVar>())

public actual fun VarDateFromUI2(uiin: UShort, pdateout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarDateFromUI2(uiin, pdateout.toCPointer<ByteVar>())

public actual fun VarDateFromUI4(ulin: UInt, pdateout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarDateFromUI4(ulin, pdateout.toCPointer<ByteVar>())

public actual fun VarDateFromUI8(ui64in: ULong, pdateout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarDateFromUI8(ui64in, pdateout.toCPointer<ByteVar>())

public actual fun VarDateFromUdate(pudatein: Long, dwflags: UInt, pdateout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarDateFromUdate(pudatein.toCPointer<ByteVar>(), dwflags, pdateout.toCPointer<ByteVar>())

public actual fun VarDateFromUdateEx(pudatein: Long, lcid: UInt, dwflags: UInt, pdateout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarDateFromUdateEx(pudatein.toCPointer<ByteVar>(), lcid, dwflags, pdateout.toCPointer<ByteVar>())

public actual fun VarDecAbs(pdecin: Long, pdecresult: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarDecAbs(pdecin.toCPointer<ByteVar>(), pdecresult.toCPointer<ByteVar>())

public actual fun VarDecAdd(pdecleft: Long, pdecright: Long, pdecresult: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarDecAdd(pdecleft.toCPointer<ByteVar>(), pdecright.toCPointer<ByteVar>(), pdecresult.toCPointer<ByteVar>())

public actual fun VarDecCmp(pdecleft: Long, pdecright: Long): VARCMP =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarDecCmp(pdecleft.toCPointer<ByteVar>(), pdecright.toCPointer<ByteVar>())

public actual fun VarDecCmpR8(pdecleft: Long, dblright: Double): VARCMP =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarDecCmpR8(pdecleft.toCPointer<ByteVar>(), dblright)

public actual fun VarDecDiv(pdecleft: Long, pdecright: Long, pdecresult: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarDecDiv(pdecleft.toCPointer<ByteVar>(), pdecright.toCPointer<ByteVar>(), pdecresult.toCPointer<ByteVar>())

public actual fun VarDecFix(pdecin: Long, pdecresult: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarDecFix(pdecin.toCPointer<ByteVar>(), pdecresult.toCPointer<ByteVar>())

public actual fun VarDecFromBool(boolin: VARIANT_BOOL, pdecout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarDecFromBool(boolin, pdecout.toCPointer<ByteVar>())

public actual fun VarDecFromCy(cyin: CY, pdecout: Long): HRESULT =
    0

public actual fun VarDecFromDate(datein: Double, pdecout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarDecFromDate(datein, pdecout.toCPointer<ByteVar>())

public actual fun VarDecFromDisp(pdispin: Long, lcid: UInt, pdecout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarDecFromDisp(pdispin.toCPointer<ByteVar>(), lcid, pdecout.toCPointer<ByteVar>())

public actual fun VarDecFromI1(cin: Byte, pdecout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarDecFromI1(cin, pdecout.toCPointer<ByteVar>())

public actual fun VarDecFromI2(uiin: Short, pdecout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarDecFromI2(uiin, pdecout.toCPointer<ByteVar>())

public actual fun VarDecFromI4(lin: Int, pdecout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarDecFromI4(lin, pdecout.toCPointer<ByteVar>())

public actual fun VarDecFromI8(i64in: Long, pdecout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarDecFromI8(i64in, pdecout.toCPointer<ByteVar>())

public actual fun VarDecFromR4(fltin: Float, pdecout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarDecFromR4(fltin, pdecout.toCPointer<ByteVar>())

public actual fun VarDecFromR8(dblin: Double, pdecout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarDecFromR8(dblin, pdecout.toCPointer<ByteVar>())

public actual fun VarDecFromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, pdecout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarDecFromStr(strin.toCPointer<ByteVar>(), lcid, dwflags, pdecout.toCPointer<ByteVar>())

public actual fun VarDecFromUI1(bin: UByte, pdecout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarDecFromUI1(bin, pdecout.toCPointer<ByteVar>())

public actual fun VarDecFromUI2(uiin: UShort, pdecout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarDecFromUI2(uiin, pdecout.toCPointer<ByteVar>())

public actual fun VarDecFromUI4(ulin: UInt, pdecout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarDecFromUI4(ulin, pdecout.toCPointer<ByteVar>())

public actual fun VarDecFromUI8(ui64in: ULong, pdecout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarDecFromUI8(ui64in, pdecout.toCPointer<ByteVar>())

public actual fun VarDecInt(pdecin: Long, pdecresult: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarDecInt(pdecin.toCPointer<ByteVar>(), pdecresult.toCPointer<ByteVar>())

public actual fun VarDecMul(pdecleft: Long, pdecright: Long, pdecresult: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarDecMul(pdecleft.toCPointer<ByteVar>(), pdecright.toCPointer<ByteVar>(), pdecresult.toCPointer<ByteVar>())

public actual fun VarDecNeg(pdecin: Long, pdecresult: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarDecNeg(pdecin.toCPointer<ByteVar>(), pdecresult.toCPointer<ByteVar>())

public actual fun VarDecRound(pdecin: Long, cdecimals: Int, pdecresult: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarDecRound(pdecin.toCPointer<ByteVar>(), cdecimals, pdecresult.toCPointer<ByteVar>())

public actual fun VarDecSub(pdecleft: Long, pdecright: Long, pdecresult: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarDecSub(pdecleft.toCPointer<ByteVar>(), pdecright.toCPointer<ByteVar>(), pdecresult.toCPointer<ByteVar>())

public actual fun VarDiv(pvarleft: Long, pvarright: Long, pvarresult: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarDiv(pvarleft.toCPointer<ByteVar>(), pvarright.toCPointer<ByteVar>(), pvarresult.toCPointer<ByteVar>())

public actual fun VarEqv(pvarleft: Long, pvarright: Long, pvarresult: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarEqv(pvarleft.toCPointer<ByteVar>(), pvarright.toCPointer<ByteVar>(), pvarresult.toCPointer<ByteVar>())

public actual fun VarFix(pvarin: Long, pvarresult: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarFix(pvarin.toCPointer<ByteVar>(), pvarresult.toCPointer<ByteVar>())

public actual fun VarFormat(pvarin: Long, pstrformat: PCWSTR, ifirstday: VARFORMAT_FIRST_DAY, ifirstweek: VARFORMAT_FIRST_WEEK, dwflags: UInt, pbstrout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarFormat(pvarin.toCPointer<ByteVar>(), pstrformat.toCPointer<ByteVar>(), ifirstday, ifirstweek, dwflags, pbstrout.toCPointer<ByteVar>())

public actual fun VarFormatCurrency(pvarin: Long, inumdig: Int, iinclead: Int, iuseparens: Int, igroup: Int, dwflags: UInt, pbstrout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarFormatCurrency(pvarin.toCPointer<ByteVar>(), inumdig, iinclead, iuseparens, igroup, dwflags, pbstrout.toCPointer<ByteVar>())

public actual fun VarFormatDateTime(pvarin: Long, inamedformat: VARFORMAT_NAMED_FORMAT, dwflags: UInt, pbstrout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarFormatDateTime(pvarin.toCPointer<ByteVar>(), inamedformat, dwflags, pbstrout.toCPointer<ByteVar>())

public actual fun VarFormatFromTokens(pvarin: Long, pstrformat: PCWSTR, pbtokcur: Long, dwflags: UInt, pbstrout: Long, lcid: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarFormatFromTokens(pvarin.toCPointer<ByteVar>(), pstrformat.toCPointer<ByteVar>(), pbtokcur.toCPointer<ByteVar>(), dwflags, pbstrout.toCPointer<ByteVar>(), lcid)

public actual fun VarFormatNumber(pvarin: Long, inumdig: Int, iinclead: VARFORMAT_LEADING_DIGIT, iuseparens: VARFORMAT_PARENTHESES, igroup: VARFORMAT_GROUP, dwflags: UInt, pbstrout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarFormatNumber(pvarin.toCPointer<ByteVar>(), inumdig, iinclead, iuseparens, igroup, dwflags, pbstrout.toCPointer<ByteVar>())

public actual fun VarFormatPercent(pvarin: Long, inumdig: Int, iinclead: VARFORMAT_LEADING_DIGIT, iuseparens: VARFORMAT_PARENTHESES, igroup: VARFORMAT_GROUP, dwflags: UInt, pbstrout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarFormatPercent(pvarin.toCPointer<ByteVar>(), inumdig, iinclead, iuseparens, igroup, dwflags, pbstrout.toCPointer<ByteVar>())

public actual fun VarI1FromBool(boolin: VARIANT_BOOL, pcout: PSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarI1FromBool(boolin, pcout.toCPointer<ByteVar>())

public actual fun VarI1FromCy(cyin: CY, pcout: PSTR): HRESULT =
    0

public actual fun VarI1FromDate(datein: Double, pcout: PSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarI1FromDate(datein, pcout.toCPointer<ByteVar>())

public actual fun VarI1FromDec(pdecin: Long, pcout: PSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarI1FromDec(pdecin.toCPointer<ByteVar>(), pcout.toCPointer<ByteVar>())

public actual fun VarI1FromDisp(pdispin: Long, lcid: UInt, pcout: PSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarI1FromDisp(pdispin.toCPointer<ByteVar>(), lcid, pcout.toCPointer<ByteVar>())

public actual fun VarI1FromI2(uiin: Short, pcout: PSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarI1FromI2(uiin, pcout.toCPointer<ByteVar>())

public actual fun VarI1FromI4(lin: Int, pcout: PSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarI1FromI4(lin, pcout.toCPointer<ByteVar>())

public actual fun VarI1FromI8(i64in: Long, pcout: PSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarI1FromI8(i64in, pcout.toCPointer<ByteVar>())

public actual fun VarI1FromR4(fltin: Float, pcout: PSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarI1FromR4(fltin, pcout.toCPointer<ByteVar>())

public actual fun VarI1FromR8(dblin: Double, pcout: PSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarI1FromR8(dblin, pcout.toCPointer<ByteVar>())

public actual fun VarI1FromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, pcout: PSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarI1FromStr(strin.toCPointer<ByteVar>(), lcid, dwflags, pcout.toCPointer<ByteVar>())

public actual fun VarI1FromUI1(bin: UByte, pcout: PSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarI1FromUI1(bin, pcout.toCPointer<ByteVar>())

public actual fun VarI1FromUI2(uiin: UShort, pcout: PSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarI1FromUI2(uiin, pcout.toCPointer<ByteVar>())

public actual fun VarI1FromUI4(ulin: UInt, pcout: PSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarI1FromUI4(ulin, pcout.toCPointer<ByteVar>())

public actual fun VarI1FromUI8(i64in: ULong, pcout: PSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarI1FromUI8(i64in, pcout.toCPointer<ByteVar>())

public actual fun VarI2FromBool(boolin: VARIANT_BOOL, psout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarI2FromBool(boolin, psout.toCPointer<ByteVar>())

public actual fun VarI2FromCy(cyin: CY, psout: Long): HRESULT =
    0

public actual fun VarI2FromDate(datein: Double, psout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarI2FromDate(datein, psout.toCPointer<ByteVar>())

public actual fun VarI2FromDec(pdecin: Long, psout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarI2FromDec(pdecin.toCPointer<ByteVar>(), psout.toCPointer<ByteVar>())

public actual fun VarI2FromDisp(pdispin: Long, lcid: UInt, psout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarI2FromDisp(pdispin.toCPointer<ByteVar>(), lcid, psout.toCPointer<ByteVar>())

public actual fun VarI2FromI1(cin: Byte, psout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarI2FromI1(cin, psout.toCPointer<ByteVar>())

public actual fun VarI2FromI4(lin: Int, psout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarI2FromI4(lin, psout.toCPointer<ByteVar>())

public actual fun VarI2FromI8(i64in: Long, psout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarI2FromI8(i64in, psout.toCPointer<ByteVar>())

public actual fun VarI2FromR4(fltin: Float, psout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarI2FromR4(fltin, psout.toCPointer<ByteVar>())

public actual fun VarI2FromR8(dblin: Double, psout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarI2FromR8(dblin, psout.toCPointer<ByteVar>())

public actual fun VarI2FromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, psout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarI2FromStr(strin.toCPointer<ByteVar>(), lcid, dwflags, psout.toCPointer<ByteVar>())

public actual fun VarI2FromUI1(bin: UByte, psout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarI2FromUI1(bin, psout.toCPointer<ByteVar>())

public actual fun VarI2FromUI2(uiin: UShort, psout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarI2FromUI2(uiin, psout.toCPointer<ByteVar>())

public actual fun VarI2FromUI4(ulin: UInt, psout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarI2FromUI4(ulin, psout.toCPointer<ByteVar>())

public actual fun VarI2FromUI8(ui64in: ULong, psout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarI2FromUI8(ui64in, psout.toCPointer<ByteVar>())

public actual fun VarI4FromBool(boolin: VARIANT_BOOL, plout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarI4FromBool(boolin, plout.toCPointer<ByteVar>())

public actual fun VarI4FromCy(cyin: CY, plout: Long): HRESULT =
    0

public actual fun VarI4FromDate(datein: Double, plout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarI4FromDate(datein, plout.toCPointer<ByteVar>())

public actual fun VarI4FromDec(pdecin: Long, plout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarI4FromDec(pdecin.toCPointer<ByteVar>(), plout.toCPointer<ByteVar>())

public actual fun VarI4FromDisp(pdispin: Long, lcid: UInt, plout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarI4FromDisp(pdispin.toCPointer<ByteVar>(), lcid, plout.toCPointer<ByteVar>())

public actual fun VarI4FromI1(cin: Byte, plout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarI4FromI1(cin, plout.toCPointer<ByteVar>())

public actual fun VarI4FromI2(sin: Short, plout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarI4FromI2(sin, plout.toCPointer<ByteVar>())

public actual fun VarI4FromI8(i64in: Long, plout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarI4FromI8(i64in, plout.toCPointer<ByteVar>())

public actual fun VarI4FromR4(fltin: Float, plout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarI4FromR4(fltin, plout.toCPointer<ByteVar>())

public actual fun VarI4FromR8(dblin: Double, plout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarI4FromR8(dblin, plout.toCPointer<ByteVar>())

public actual fun VarI4FromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, plout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarI4FromStr(strin.toCPointer<ByteVar>(), lcid, dwflags, plout.toCPointer<ByteVar>())

public actual fun VarI4FromUI1(bin: UByte, plout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarI4FromUI1(bin, plout.toCPointer<ByteVar>())

public actual fun VarI4FromUI2(uiin: UShort, plout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarI4FromUI2(uiin, plout.toCPointer<ByteVar>())

public actual fun VarI4FromUI4(ulin: UInt, plout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarI4FromUI4(ulin, plout.toCPointer<ByteVar>())

public actual fun VarI4FromUI8(ui64in: ULong, plout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarI4FromUI8(ui64in, plout.toCPointer<ByteVar>())

public actual fun VarI8FromBool(boolin: VARIANT_BOOL, pi64out: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarI8FromBool(boolin, pi64out.toCPointer<ByteVar>())

public actual fun VarI8FromCy(cyin: CY, pi64out: Long): HRESULT =
    0

public actual fun VarI8FromDate(datein: Double, pi64out: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarI8FromDate(datein, pi64out.toCPointer<ByteVar>())

public actual fun VarI8FromDec(pdecin: Long, pi64out: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarI8FromDec(pdecin.toCPointer<ByteVar>(), pi64out.toCPointer<ByteVar>())

public actual fun VarI8FromDisp(pdispin: Long, lcid: UInt, pi64out: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarI8FromDisp(pdispin.toCPointer<ByteVar>(), lcid, pi64out.toCPointer<ByteVar>())

public actual fun VarI8FromI1(cin: Byte, pi64out: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarI8FromI1(cin, pi64out.toCPointer<ByteVar>())

public actual fun VarI8FromI2(sin: Short, pi64out: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarI8FromI2(sin, pi64out.toCPointer<ByteVar>())

public actual fun VarI8FromR4(fltin: Float, pi64out: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarI8FromR4(fltin, pi64out.toCPointer<ByteVar>())

public actual fun VarI8FromR8(dblin: Double, pi64out: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarI8FromR8(dblin, pi64out.toCPointer<ByteVar>())

public actual fun VarI8FromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, pi64out: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarI8FromStr(strin.toCPointer<ByteVar>(), lcid, dwflags, pi64out.toCPointer<ByteVar>())

public actual fun VarI8FromUI1(bin: UByte, pi64out: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarI8FromUI1(bin, pi64out.toCPointer<ByteVar>())

public actual fun VarI8FromUI2(uiin: UShort, pi64out: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarI8FromUI2(uiin, pi64out.toCPointer<ByteVar>())

public actual fun VarI8FromUI4(ulin: UInt, pi64out: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarI8FromUI4(ulin, pi64out.toCPointer<ByteVar>())

public actual fun VarI8FromUI8(ui64in: ULong, pi64out: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarI8FromUI8(ui64in, pi64out.toCPointer<ByteVar>())

public actual fun VarIdiv(pvarleft: Long, pvarright: Long, pvarresult: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarIdiv(pvarleft.toCPointer<ByteVar>(), pvarright.toCPointer<ByteVar>(), pvarresult.toCPointer<ByteVar>())

public actual fun VarImp(pvarleft: Long, pvarright: Long, pvarresult: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarImp(pvarleft.toCPointer<ByteVar>(), pvarright.toCPointer<ByteVar>(), pvarresult.toCPointer<ByteVar>())

public actual fun VarInt(pvarin: Long, pvarresult: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarInt(pvarin.toCPointer<ByteVar>(), pvarresult.toCPointer<ByteVar>())

public actual fun VarMod(pvarleft: Long, pvarright: Long, pvarresult: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarMod(pvarleft.toCPointer<ByteVar>(), pvarright.toCPointer<ByteVar>(), pvarresult.toCPointer<ByteVar>())

public actual fun VarMonthName(imonth: Int, fabbrev: Int, dwflags: UInt, pbstrout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarMonthName(imonth, fabbrev, dwflags, pbstrout.toCPointer<ByteVar>())

public actual fun VarMul(pvarleft: Long, pvarright: Long, pvarresult: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarMul(pvarleft.toCPointer<ByteVar>(), pvarright.toCPointer<ByteVar>(), pvarresult.toCPointer<ByteVar>())

public actual fun VarNeg(pvarin: Long, pvarresult: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarNeg(pvarin.toCPointer<ByteVar>(), pvarresult.toCPointer<ByteVar>())

public actual fun VarNot(pvarin: Long, pvarresult: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarNot(pvarin.toCPointer<ByteVar>(), pvarresult.toCPointer<ByteVar>())

public actual fun VarNumFromParseNum(pnumprs: Long, rgbdig: Long, dwvtbits: UInt, pvar: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarNumFromParseNum(pnumprs.toCPointer<ByteVar>(), rgbdig.toCPointer<ByteVar>(), dwvtbits, pvar.toCPointer<ByteVar>())

public actual fun VarOr(pvarleft: Long, pvarright: Long, pvarresult: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarOr(pvarleft.toCPointer<ByteVar>(), pvarright.toCPointer<ByteVar>(), pvarresult.toCPointer<ByteVar>())

public actual fun VarParseNumFromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, pnumprs: Long, rgbdig: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarParseNumFromStr(strin.toCPointer<ByteVar>(), lcid, dwflags, pnumprs.toCPointer<ByteVar>(), rgbdig.toCPointer<ByteVar>())

public actual fun VarPow(pvarleft: Long, pvarright: Long, pvarresult: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarPow(pvarleft.toCPointer<ByteVar>(), pvarright.toCPointer<ByteVar>(), pvarresult.toCPointer<ByteVar>())

public actual fun VarR4CmpR8(fltleft: Float, dblright: Double): VARCMP =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarR4CmpR8(fltleft, dblright)

public actual fun VarR4FromBool(boolin: VARIANT_BOOL, pfltout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarR4FromBool(boolin, pfltout.toCPointer<ByteVar>())

public actual fun VarR4FromCy(cyin: CY, pfltout: Long): HRESULT =
    0

public actual fun VarR4FromDate(datein: Double, pfltout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarR4FromDate(datein, pfltout.toCPointer<ByteVar>())

public actual fun VarR4FromDec(pdecin: Long, pfltout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarR4FromDec(pdecin.toCPointer<ByteVar>(), pfltout.toCPointer<ByteVar>())

public actual fun VarR4FromDisp(pdispin: Long, lcid: UInt, pfltout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarR4FromDisp(pdispin.toCPointer<ByteVar>(), lcid, pfltout.toCPointer<ByteVar>())

public actual fun VarR4FromI1(cin: Byte, pfltout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarR4FromI1(cin, pfltout.toCPointer<ByteVar>())

public actual fun VarR4FromI2(sin: Short, pfltout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarR4FromI2(sin, pfltout.toCPointer<ByteVar>())

public actual fun VarR4FromI4(lin: Int, pfltout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarR4FromI4(lin, pfltout.toCPointer<ByteVar>())

public actual fun VarR4FromI8(i64in: Long, pfltout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarR4FromI8(i64in, pfltout.toCPointer<ByteVar>())

public actual fun VarR4FromR8(dblin: Double, pfltout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarR4FromR8(dblin, pfltout.toCPointer<ByteVar>())

public actual fun VarR4FromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, pfltout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarR4FromStr(strin.toCPointer<ByteVar>(), lcid, dwflags, pfltout.toCPointer<ByteVar>())

public actual fun VarR4FromUI1(bin: UByte, pfltout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarR4FromUI1(bin, pfltout.toCPointer<ByteVar>())

public actual fun VarR4FromUI2(uiin: UShort, pfltout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarR4FromUI2(uiin, pfltout.toCPointer<ByteVar>())

public actual fun VarR4FromUI4(ulin: UInt, pfltout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarR4FromUI4(ulin, pfltout.toCPointer<ByteVar>())

public actual fun VarR4FromUI8(ui64in: ULong, pfltout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarR4FromUI8(ui64in, pfltout.toCPointer<ByteVar>())

public actual fun VarR8FromBool(boolin: VARIANT_BOOL, pdblout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarR8FromBool(boolin, pdblout.toCPointer<ByteVar>())

public actual fun VarR8FromCy(cyin: CY, pdblout: Long): HRESULT =
    0

public actual fun VarR8FromDate(datein: Double, pdblout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarR8FromDate(datein, pdblout.toCPointer<ByteVar>())

public actual fun VarR8FromDec(pdecin: Long, pdblout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarR8FromDec(pdecin.toCPointer<ByteVar>(), pdblout.toCPointer<ByteVar>())

public actual fun VarR8FromDisp(pdispin: Long, lcid: UInt, pdblout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarR8FromDisp(pdispin.toCPointer<ByteVar>(), lcid, pdblout.toCPointer<ByteVar>())

public actual fun VarR8FromI1(cin: Byte, pdblout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarR8FromI1(cin, pdblout.toCPointer<ByteVar>())

public actual fun VarR8FromI2(sin: Short, pdblout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarR8FromI2(sin, pdblout.toCPointer<ByteVar>())

public actual fun VarR8FromI4(lin: Int, pdblout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarR8FromI4(lin, pdblout.toCPointer<ByteVar>())

public actual fun VarR8FromI8(i64in: Long, pdblout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarR8FromI8(i64in, pdblout.toCPointer<ByteVar>())

public actual fun VarR8FromR4(fltin: Float, pdblout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarR8FromR4(fltin, pdblout.toCPointer<ByteVar>())

public actual fun VarR8FromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, pdblout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarR8FromStr(strin.toCPointer<ByteVar>(), lcid, dwflags, pdblout.toCPointer<ByteVar>())

public actual fun VarR8FromUI1(bin: UByte, pdblout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarR8FromUI1(bin, pdblout.toCPointer<ByteVar>())

public actual fun VarR8FromUI2(uiin: UShort, pdblout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarR8FromUI2(uiin, pdblout.toCPointer<ByteVar>())

public actual fun VarR8FromUI4(ulin: UInt, pdblout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarR8FromUI4(ulin, pdblout.toCPointer<ByteVar>())

public actual fun VarR8FromUI8(ui64in: ULong, pdblout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarR8FromUI8(ui64in, pdblout.toCPointer<ByteVar>())

public actual fun VarR8Pow(dblleft: Double, dblright: Double, pdblresult: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarR8Pow(dblleft, dblright, pdblresult.toCPointer<ByteVar>())

public actual fun VarR8Round(dblin: Double, cdecimals: Int, pdblresult: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarR8Round(dblin, cdecimals, pdblresult.toCPointer<ByteVar>())

public actual fun VarRound(pvarin: Long, cdecimals: Int, pvarresult: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarRound(pvarin.toCPointer<ByteVar>(), cdecimals, pvarresult.toCPointer<ByteVar>())

public actual fun VarSub(pvarleft: Long, pvarright: Long, pvarresult: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarSub(pvarleft.toCPointer<ByteVar>(), pvarright.toCPointer<ByteVar>(), pvarresult.toCPointer<ByteVar>())

public actual fun VarTokenizeFormatString(pstrformat: PCWSTR, rgbtok: Long, cbtok: Int, ifirstday: VARFORMAT_FIRST_DAY, ifirstweek: VARFORMAT_FIRST_WEEK, lcid: UInt, pcbactual: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarTokenizeFormatString(pstrformat.toCPointer<ByteVar>(), rgbtok.toCPointer<ByteVar>(), cbtok, ifirstday, ifirstweek, lcid, pcbactual.toCPointer<ByteVar>())

public actual fun VarUI1FromBool(boolin: VARIANT_BOOL, pbout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarUI1FromBool(boolin, pbout.toCPointer<ByteVar>())

public actual fun VarUI1FromCy(cyin: CY, pbout: Long): HRESULT =
    0

public actual fun VarUI1FromDate(datein: Double, pbout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarUI1FromDate(datein, pbout.toCPointer<ByteVar>())

public actual fun VarUI1FromDec(pdecin: Long, pbout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarUI1FromDec(pdecin.toCPointer<ByteVar>(), pbout.toCPointer<ByteVar>())

public actual fun VarUI1FromDisp(pdispin: Long, lcid: UInt, pbout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarUI1FromDisp(pdispin.toCPointer<ByteVar>(), lcid, pbout.toCPointer<ByteVar>())

public actual fun VarUI1FromI1(cin: Byte, pbout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarUI1FromI1(cin, pbout.toCPointer<ByteVar>())

public actual fun VarUI1FromI2(sin: Short, pbout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarUI1FromI2(sin, pbout.toCPointer<ByteVar>())

public actual fun VarUI1FromI4(lin: Int, pbout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarUI1FromI4(lin, pbout.toCPointer<ByteVar>())

public actual fun VarUI1FromI8(i64in: Long, pbout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarUI1FromI8(i64in, pbout.toCPointer<ByteVar>())

public actual fun VarUI1FromR4(fltin: Float, pbout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarUI1FromR4(fltin, pbout.toCPointer<ByteVar>())

public actual fun VarUI1FromR8(dblin: Double, pbout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarUI1FromR8(dblin, pbout.toCPointer<ByteVar>())

public actual fun VarUI1FromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, pbout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarUI1FromStr(strin.toCPointer<ByteVar>(), lcid, dwflags, pbout.toCPointer<ByteVar>())

public actual fun VarUI1FromUI2(uiin: UShort, pbout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarUI1FromUI2(uiin, pbout.toCPointer<ByteVar>())

public actual fun VarUI1FromUI4(ulin: UInt, pbout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarUI1FromUI4(ulin, pbout.toCPointer<ByteVar>())

public actual fun VarUI1FromUI8(ui64in: ULong, pbout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarUI1FromUI8(ui64in, pbout.toCPointer<ByteVar>())

public actual fun VarUI2FromBool(boolin: VARIANT_BOOL, puiout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarUI2FromBool(boolin, puiout.toCPointer<ByteVar>())

public actual fun VarUI2FromCy(cyin: CY, puiout: Long): HRESULT =
    0

public actual fun VarUI2FromDate(datein: Double, puiout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarUI2FromDate(datein, puiout.toCPointer<ByteVar>())

public actual fun VarUI2FromDec(pdecin: Long, puiout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarUI2FromDec(pdecin.toCPointer<ByteVar>(), puiout.toCPointer<ByteVar>())

public actual fun VarUI2FromDisp(pdispin: Long, lcid: UInt, puiout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarUI2FromDisp(pdispin.toCPointer<ByteVar>(), lcid, puiout.toCPointer<ByteVar>())

public actual fun VarUI2FromI1(cin: Byte, puiout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarUI2FromI1(cin, puiout.toCPointer<ByteVar>())

public actual fun VarUI2FromI2(uiin: Short, puiout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarUI2FromI2(uiin, puiout.toCPointer<ByteVar>())

public actual fun VarUI2FromI4(lin: Int, puiout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarUI2FromI4(lin, puiout.toCPointer<ByteVar>())

public actual fun VarUI2FromI8(i64in: Long, puiout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarUI2FromI8(i64in, puiout.toCPointer<ByteVar>())

public actual fun VarUI2FromR4(fltin: Float, puiout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarUI2FromR4(fltin, puiout.toCPointer<ByteVar>())

public actual fun VarUI2FromR8(dblin: Double, puiout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarUI2FromR8(dblin, puiout.toCPointer<ByteVar>())

public actual fun VarUI2FromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, puiout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarUI2FromStr(strin.toCPointer<ByteVar>(), lcid, dwflags, puiout.toCPointer<ByteVar>())

public actual fun VarUI2FromUI1(bin: UByte, puiout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarUI2FromUI1(bin, puiout.toCPointer<ByteVar>())

public actual fun VarUI2FromUI4(ulin: UInt, puiout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarUI2FromUI4(ulin, puiout.toCPointer<ByteVar>())

public actual fun VarUI2FromUI8(i64in: ULong, puiout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarUI2FromUI8(i64in, puiout.toCPointer<ByteVar>())

public actual fun VarUI4FromBool(boolin: VARIANT_BOOL, pulout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarUI4FromBool(boolin, pulout.toCPointer<ByteVar>())

public actual fun VarUI4FromCy(cyin: CY, pulout: Long): HRESULT =
    0

public actual fun VarUI4FromDate(datein: Double, pulout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarUI4FromDate(datein, pulout.toCPointer<ByteVar>())

public actual fun VarUI4FromDec(pdecin: Long, pulout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarUI4FromDec(pdecin.toCPointer<ByteVar>(), pulout.toCPointer<ByteVar>())

public actual fun VarUI4FromDisp(pdispin: Long, lcid: UInt, pulout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarUI4FromDisp(pdispin.toCPointer<ByteVar>(), lcid, pulout.toCPointer<ByteVar>())

public actual fun VarUI4FromI1(cin: Byte, pulout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarUI4FromI1(cin, pulout.toCPointer<ByteVar>())

public actual fun VarUI4FromI2(uiin: Short, pulout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarUI4FromI2(uiin, pulout.toCPointer<ByteVar>())

public actual fun VarUI4FromI4(lin: Int, pulout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarUI4FromI4(lin, pulout.toCPointer<ByteVar>())

public actual fun VarUI4FromI8(i64in: Long, plout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarUI4FromI8(i64in, plout.toCPointer<ByteVar>())

public actual fun VarUI4FromR4(fltin: Float, pulout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarUI4FromR4(fltin, pulout.toCPointer<ByteVar>())

public actual fun VarUI4FromR8(dblin: Double, pulout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarUI4FromR8(dblin, pulout.toCPointer<ByteVar>())

public actual fun VarUI4FromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, pulout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarUI4FromStr(strin.toCPointer<ByteVar>(), lcid, dwflags, pulout.toCPointer<ByteVar>())

public actual fun VarUI4FromUI1(bin: UByte, pulout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarUI4FromUI1(bin, pulout.toCPointer<ByteVar>())

public actual fun VarUI4FromUI2(uiin: UShort, pulout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarUI4FromUI2(uiin, pulout.toCPointer<ByteVar>())

public actual fun VarUI4FromUI8(ui64in: ULong, plout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarUI4FromUI8(ui64in, plout.toCPointer<ByteVar>())

public actual fun VarUI8FromBool(boolin: VARIANT_BOOL, pi64out: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarUI8FromBool(boolin, pi64out.toCPointer<ByteVar>())

public actual fun VarUI8FromCy(cyin: CY, pi64out: Long): HRESULT =
    0

public actual fun VarUI8FromDate(datein: Double, pi64out: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarUI8FromDate(datein, pi64out.toCPointer<ByteVar>())

public actual fun VarUI8FromDec(pdecin: Long, pi64out: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarUI8FromDec(pdecin.toCPointer<ByteVar>(), pi64out.toCPointer<ByteVar>())

public actual fun VarUI8FromDisp(pdispin: Long, lcid: UInt, pi64out: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarUI8FromDisp(pdispin.toCPointer<ByteVar>(), lcid, pi64out.toCPointer<ByteVar>())

public actual fun VarUI8FromI1(cin: Byte, pi64out: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarUI8FromI1(cin, pi64out.toCPointer<ByteVar>())

public actual fun VarUI8FromI2(sin: Short, pi64out: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarUI8FromI2(sin, pi64out.toCPointer<ByteVar>())

public actual fun VarUI8FromI8(ui64in: Long, pi64out: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarUI8FromI8(ui64in, pi64out.toCPointer<ByteVar>())

public actual fun VarUI8FromR4(fltin: Float, pi64out: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarUI8FromR4(fltin, pi64out.toCPointer<ByteVar>())

public actual fun VarUI8FromR8(dblin: Double, pi64out: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarUI8FromR8(dblin, pi64out.toCPointer<ByteVar>())

public actual fun VarUI8FromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, pi64out: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarUI8FromStr(strin.toCPointer<ByteVar>(), lcid, dwflags, pi64out.toCPointer<ByteVar>())

public actual fun VarUI8FromUI1(bin: UByte, pi64out: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarUI8FromUI1(bin, pi64out.toCPointer<ByteVar>())

public actual fun VarUI8FromUI2(uiin: UShort, pi64out: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarUI8FromUI2(uiin, pi64out.toCPointer<ByteVar>())

public actual fun VarUI8FromUI4(ulin: UInt, pi64out: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarUI8FromUI4(ulin, pi64out.toCPointer<ByteVar>())

public actual fun VarUdateFromDate(datein: Double, dwflags: UInt, pudateout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarUdateFromDate(datein, dwflags, pudateout.toCPointer<ByteVar>())

public actual fun VarWeekdayName(iweekday: Int, fabbrev: Int, ifirstday: Int, dwflags: UInt, pbstrout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarWeekdayName(iweekday, fabbrev, ifirstday, dwflags, pbstrout.toCPointer<ByteVar>())

public actual fun VarXor(pvarleft: Long, pvarright: Long, pvarresult: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VarXor(pvarleft.toCPointer<ByteVar>(), pvarright.toCPointer<ByteVar>(), pvarresult.toCPointer<ByteVar>())

public actual fun VectorFromBstr(bstr: BSTR, ppsa: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_VectorFromBstr(bstr.toCPointer<ByteVar>(), ppsa.toCPointer<ByteVar>())
