@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private val _windowsWin32SystemOleNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/windowssys_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-windowssys/build/Release/windowssys_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-windowssys/build/Debug/windowssys_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-windowssys/dist/build/Release/windowssys_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-windowssys/dist/build/Debug/windowssys_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun BstrFromVector(psa: Long, pbstr: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_BstrFromVector(psa.toString(), pbstr.toString()) as Int) else 0

public actual fun ClearCustData(pcustdata: Long) {
    if (_windowsWin32SystemOleNapiAddon != null) {
        _windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_ClearCustData(pcustdata.toString())
    }
}

public actual fun CreateDispTypeInfo(pidata: Long, lcid: UInt, pptinfo: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_CreateDispTypeInfo(pidata.toString(), lcid.toInt(), pptinfo.toString()) as Int) else 0

public actual fun CreateErrorInfo(pperrinfo: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_CreateErrorInfo(pperrinfo.toString()) as Int) else 0

public actual fun CreateOleAdviseHolder(ppoaholder: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_CreateOleAdviseHolder(ppoaholder.toString()) as Int) else 0

public actual fun CreateStdDispatch(punkouter: Long, pvthis: Long, ptinfo: Long, ppunkstddisp: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_CreateStdDispatch(punkouter.toString(), pvthis.toString(), ptinfo.toString(), ppunkstddisp.toString()) as Int) else 0

public actual fun CreateTypeLib(syskind: SYSKIND, szfile: PCWSTR, ppctlib: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_CreateTypeLib(syskind, szfile.toString(), ppctlib.toString()) as Int) else 0

public actual fun CreateTypeLib2(syskind: SYSKIND, szfile: PCWSTR, ppctlib: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_CreateTypeLib2(syskind, szfile.toString(), ppctlib.toString()) as Int) else 0

public actual fun DispCallFunc(pvinstance: Long, ovft: ULong, cc: CALLCONV, vtreturn: VARENUM, cactuals: UInt, prgvt: Long, prgpvarg: Long, pvargresult: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_DispCallFunc(pvinstance.toString(), ovft.toString(), cc, vtreturn.toInt(), cactuals.toInt(), prgvt.toString(), prgpvarg.toString(), pvargresult.toString()) as Int) else 0

public actual fun DispGetIDsOfNames(ptinfo: Long, rgsznames: Long, cnames: UInt, rgdispid: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_DispGetIDsOfNames(ptinfo.toString(), rgsznames.toString(), cnames.toInt(), rgdispid.toString()) as Int) else 0

public actual fun DispGetParam(pdispparams: Long, position: UInt, vttarg: VARENUM, pvarresult: Long, puargerr: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_DispGetParam(pdispparams.toString(), position.toInt(), vttarg.toInt(), pvarresult.toString(), puargerr.toString()) as Int) else 0

public actual fun DispInvoke(_this: Long, ptinfo: Long, dispidmember: Int, wflags: UShort, pparams: Long, pvarresult: Long, pexcepinfo: Long, puargerr: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_DispInvoke(_this.toString(), ptinfo.toString(), dispidmember, wflags.toInt(), pparams.toString(), pvarresult.toString(), pexcepinfo.toString(), puargerr.toString()) as Int) else 0

public actual fun DoDragDrop(pdataobj: Long, pdropsource: Long, dwokeffects: DROPEFFECT, pdweffect: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_DoDragDrop(pdataobj.toString(), pdropsource.toString(), dwokeffects.toInt(), pdweffect.toString()) as Int) else 0

public actual fun GetActiveObject(rclsid: Long, pvreserved: Long, ppunk: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_GetActiveObject(rclsid.toString(), pvreserved.toString(), ppunk.toString()) as Int) else 0

public actual fun GetAltMonthNames(lcid: UInt, prgp: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_GetAltMonthNames(lcid.toInt(), prgp.toString()) as Int) else 0

public actual fun GetRecordInfoFromGuids(rguidtypelib: Long, uvermajor: UInt, uverminor: UInt, lcid: UInt, rguidtypeinfo: Long, pprecinfo: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_GetRecordInfoFromGuids(rguidtypelib.toString(), uvermajor.toInt(), uverminor.toInt(), lcid.toInt(), rguidtypeinfo.toString(), pprecinfo.toString()) as Int) else 0

public actual fun GetRecordInfoFromTypeInfo(ptypeinfo: Long, pprecinfo: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_GetRecordInfoFromTypeInfo(ptypeinfo.toString(), pprecinfo.toString()) as Int) else 0

public actual fun HRGN_UserFree(param0: Long, param1: Long) {
    if (_windowsWin32SystemOleNapiAddon != null) {
        _windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_HRGN_UserFree(param0.toString(), param1.toString())
    }
}

public actual fun HRGN_UserFree64(param0: Long, param1: Long) {
    if (_windowsWin32SystemOleNapiAddon != null) {
        _windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_HRGN_UserFree64(param0.toString(), param1.toString())
    }
}

public actual fun HRGN_UserMarshal(param0: Long, param1: Long, param2: Long): Long =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_HRGN_UserMarshal(param0.toString(), param1.toString(), param2.toString()) as String).toLong() else 0L

public actual fun HRGN_UserMarshal64(param0: Long, param1: Long, param2: Long): Long =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_HRGN_UserMarshal64(param0.toString(), param1.toString(), param2.toString()) as String).toLong() else 0L

public actual fun HRGN_UserSize(param0: Long, param1: UInt, param2: Long): UInt =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_HRGN_UserSize(param0.toString(), param1.toInt(), param2.toString()) as Int).toUInt() else 0u

public actual fun HRGN_UserSize64(param0: Long, param1: UInt, param2: Long): UInt =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_HRGN_UserSize64(param0.toString(), param1.toInt(), param2.toString()) as Int).toUInt() else 0u

public actual fun HRGN_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_HRGN_UserUnmarshal(param0.toString(), param1.toString(), param2.toString()) as String).toLong() else 0L

public actual fun HRGN_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_HRGN_UserUnmarshal64(param0.toString(), param1.toString(), param2.toString()) as String).toLong() else 0L

public actual fun IsAccelerator(haccel: HACCEL, caccelentries: Int, lpmsg: Long, lpwcmd: Long): BOOL =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_IsAccelerator(haccel.toString(), caccelentries, lpmsg.toString(), lpwcmd.toString()) as Int) else 0

public actual fun LHashValOfNameSys(syskind: SYSKIND, lcid: UInt, szname: PCWSTR): UInt =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_LHashValOfNameSys(syskind, lcid.toInt(), szname.toString()) as Int).toUInt() else 0u

public actual fun LHashValOfNameSysA(syskind: SYSKIND, lcid: UInt, szname: PCSTR): UInt =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_LHashValOfNameSysA(syskind, lcid.toInt(), szname.toString()) as Int).toUInt() else 0u

public actual fun LoadRegTypeLib(rguid: Long, wvermajor: UShort, wverminor: UShort, lcid: UInt, pptlib: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_LoadRegTypeLib(rguid.toString(), wvermajor.toInt(), wverminor.toInt(), lcid.toInt(), pptlib.toString()) as Int) else 0

public actual fun LoadTypeLib(szfile: PCWSTR, pptlib: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_LoadTypeLib(szfile.toString(), pptlib.toString()) as Int) else 0

public actual fun LoadTypeLibEx(szfile: PCWSTR, regkind: REGKIND, pptlib: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_LoadTypeLibEx(szfile.toString(), regkind, pptlib.toString()) as Int) else 0

public actual fun OaBuildVersion(): UInt =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OaBuildVersion() as Int).toUInt() else 0u

public actual fun OaEnablePerUserTLibRegistration() {
    if (_windowsWin32SystemOleNapiAddon != null) {
        _windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OaEnablePerUserTLibRegistration()
    }
}

public actual fun OleBuildVersion(): UInt =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleBuildVersion() as Int).toUInt() else 0u

public actual fun OleConvertOLESTREAMToIStorage2(lpolestream: Long, pstg: Long, ptd: Long, opt: UInt, pvcallbackcontext: Long, pqueryconvertolelinkcallback: OLESTREAMQUERYCONVERTOLELINKCALLBACK): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleConvertOLESTREAMToIStorage2(lpolestream.toString(), pstg.toString(), ptd.toString(), opt.toInt(), pvcallbackcontext.toString(), pqueryconvertolelinkcallback.toLong().toString()) as Int) else 0

public actual fun OleConvertOLESTREAMToIStorageEx2(polestm: Long, pstg: Long, pcfformat: Long, plwwidth: Long, plheight: Long, pdwsize: Long, pmedium: Long, opt: UInt, pvcallbackcontext: Long, pqueryconvertolelinkcallback: OLESTREAMQUERYCONVERTOLELINKCALLBACK): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleConvertOLESTREAMToIStorageEx2(polestm.toString(), pstg.toString(), pcfformat.toString(), plwwidth.toString(), plheight.toString(), pdwsize.toString(), pmedium.toString(), opt.toInt(), pvcallbackcontext.toString(), pqueryconvertolelinkcallback.toLong().toString()) as Int) else 0

public actual fun OleCreate(rclsid: Long, riid: Long, renderopt: UInt, pformatetc: Long, pclientsite: Long, pstg: Long, ppvobj: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleCreate(rclsid.toString(), riid.toString(), renderopt.toInt(), pformatetc.toString(), pclientsite.toString(), pstg.toString(), ppvobj.toString()) as Int) else 0

public actual fun OleCreateDefaultHandler(clsid: Long, punkouter: Long, riid: Long, lplpobj: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleCreateDefaultHandler(clsid.toString(), punkouter.toString(), riid.toString(), lplpobj.toString()) as Int) else 0

public actual fun OleCreateEmbeddingHelper(clsid: Long, punkouter: Long, flags: EMBDHLP_FLAGS, pcf: Long, riid: Long, lplpobj: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleCreateEmbeddingHelper(clsid.toString(), punkouter.toString(), flags.toInt(), pcf.toString(), riid.toString(), lplpobj.toString()) as Int) else 0

public actual fun OleCreateEx(rclsid: Long, riid: Long, dwflags: OLECREATE, renderopt: UInt, cformats: UInt, rgadvf: Long, rgformatetc: Long, lpadvisesink: Long, rgdwconnection: Long, pclientsite: Long, pstg: Long, ppvobj: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleCreateEx(rclsid.toString(), riid.toString(), dwflags.toInt(), renderopt.toInt(), cformats.toInt(), rgadvf.toString(), rgformatetc.toString(), lpadvisesink.toString(), rgdwconnection.toString(), pclientsite.toString(), pstg.toString(), ppvobj.toString()) as Int) else 0

public actual fun OleCreateFontIndirect(lpfontdesc: Long, riid: Long, lplpvobj: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleCreateFontIndirect(lpfontdesc.toString(), riid.toString(), lplpvobj.toString()) as Int) else 0

public actual fun OleCreateFromData(psrcdataobj: Long, riid: Long, renderopt: UInt, pformatetc: Long, pclientsite: Long, pstg: Long, ppvobj: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleCreateFromData(psrcdataobj.toString(), riid.toString(), renderopt.toInt(), pformatetc.toString(), pclientsite.toString(), pstg.toString(), ppvobj.toString()) as Int) else 0

public actual fun OleCreateFromDataEx(psrcdataobj: Long, riid: Long, dwflags: OLECREATE, renderopt: UInt, cformats: UInt, rgadvf: Long, rgformatetc: Long, lpadvisesink: Long, rgdwconnection: Long, pclientsite: Long, pstg: Long, ppvobj: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleCreateFromDataEx(psrcdataobj.toString(), riid.toString(), dwflags.toInt(), renderopt.toInt(), cformats.toInt(), rgadvf.toString(), rgformatetc.toString(), lpadvisesink.toString(), rgdwconnection.toString(), pclientsite.toString(), pstg.toString(), ppvobj.toString()) as Int) else 0

public actual fun OleCreateFromFile(rclsid: Long, lpszfilename: PCWSTR, riid: Long, renderopt: UInt, lpformatetc: Long, pclientsite: Long, pstg: Long, ppvobj: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleCreateFromFile(rclsid.toString(), lpszfilename.toString(), riid.toString(), renderopt.toInt(), lpformatetc.toString(), pclientsite.toString(), pstg.toString(), ppvobj.toString()) as Int) else 0

public actual fun OleCreateFromFileEx(rclsid: Long, lpszfilename: PCWSTR, riid: Long, dwflags: OLECREATE, renderopt: UInt, cformats: UInt, rgadvf: Long, rgformatetc: Long, lpadvisesink: Long, rgdwconnection: Long, pclientsite: Long, pstg: Long, ppvobj: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleCreateFromFileEx(rclsid.toString(), lpszfilename.toString(), riid.toString(), dwflags.toInt(), renderopt.toInt(), cformats.toInt(), rgadvf.toString(), rgformatetc.toString(), lpadvisesink.toString(), rgdwconnection.toString(), pclientsite.toString(), pstg.toString(), ppvobj.toString()) as Int) else 0

public actual fun OleCreateLink(pmklinksrc: Long, riid: Long, renderopt: UInt, lpformatetc: Long, pclientsite: Long, pstg: Long, ppvobj: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleCreateLink(pmklinksrc.toString(), riid.toString(), renderopt.toInt(), lpformatetc.toString(), pclientsite.toString(), pstg.toString(), ppvobj.toString()) as Int) else 0

public actual fun OleCreateLinkEx(pmklinksrc: Long, riid: Long, dwflags: OLECREATE, renderopt: UInt, cformats: UInt, rgadvf: Long, rgformatetc: Long, lpadvisesink: Long, rgdwconnection: Long, pclientsite: Long, pstg: Long, ppvobj: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleCreateLinkEx(pmklinksrc.toString(), riid.toString(), dwflags.toInt(), renderopt.toInt(), cformats.toInt(), rgadvf.toString(), rgformatetc.toString(), lpadvisesink.toString(), rgdwconnection.toString(), pclientsite.toString(), pstg.toString(), ppvobj.toString()) as Int) else 0

public actual fun OleCreateLinkFromData(psrcdataobj: Long, riid: Long, renderopt: UInt, pformatetc: Long, pclientsite: Long, pstg: Long, ppvobj: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleCreateLinkFromData(psrcdataobj.toString(), riid.toString(), renderopt.toInt(), pformatetc.toString(), pclientsite.toString(), pstg.toString(), ppvobj.toString()) as Int) else 0

public actual fun OleCreateLinkFromDataEx(psrcdataobj: Long, riid: Long, dwflags: OLECREATE, renderopt: UInt, cformats: UInt, rgadvf: Long, rgformatetc: Long, lpadvisesink: Long, rgdwconnection: Long, pclientsite: Long, pstg: Long, ppvobj: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleCreateLinkFromDataEx(psrcdataobj.toString(), riid.toString(), dwflags.toInt(), renderopt.toInt(), cformats.toInt(), rgadvf.toString(), rgformatetc.toString(), lpadvisesink.toString(), rgdwconnection.toString(), pclientsite.toString(), pstg.toString(), ppvobj.toString()) as Int) else 0

public actual fun OleCreateLinkToFile(lpszfilename: PCWSTR, riid: Long, renderopt: UInt, lpformatetc: Long, pclientsite: Long, pstg: Long, ppvobj: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleCreateLinkToFile(lpszfilename.toString(), riid.toString(), renderopt.toInt(), lpformatetc.toString(), pclientsite.toString(), pstg.toString(), ppvobj.toString()) as Int) else 0

public actual fun OleCreateLinkToFileEx(lpszfilename: PCWSTR, riid: Long, dwflags: OLECREATE, renderopt: UInt, cformats: UInt, rgadvf: Long, rgformatetc: Long, lpadvisesink: Long, rgdwconnection: Long, pclientsite: Long, pstg: Long, ppvobj: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleCreateLinkToFileEx(lpszfilename.toString(), riid.toString(), dwflags.toInt(), renderopt.toInt(), cformats.toInt(), rgadvf.toString(), rgformatetc.toString(), lpadvisesink.toString(), rgdwconnection.toString(), pclientsite.toString(), pstg.toString(), ppvobj.toString()) as Int) else 0

public actual fun OleCreateMenuDescriptor(hmenucombined: HMENU, lpmenuwidths: Long): Long =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleCreateMenuDescriptor(hmenucombined.toString(), lpmenuwidths.toString()) as String).toLong() else 0L

public actual fun OleCreatePictureIndirect(lppictdesc: Long, riid: Long, fown: BOOL, lplpvobj: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleCreatePictureIndirect(lppictdesc.toString(), riid.toString(), fown, lplpvobj.toString()) as Int) else 0

public actual fun OleCreatePropertyFrame(hwndowner: HWND, x: UInt, y: UInt, lpszcaption: PCWSTR, cobjects: UInt, ppunk: Long, cpages: UInt, ppageclsid: Long, lcid: UInt, dwreserved: UInt, pvreserved: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleCreatePropertyFrame(hwndowner.toString(), x.toInt(), y.toInt(), lpszcaption.toString(), cobjects.toInt(), ppunk.toString(), cpages.toInt(), ppageclsid.toString(), lcid.toInt(), dwreserved.toInt(), pvreserved.toString()) as Int) else 0

public actual fun OleCreatePropertyFrameIndirect(lpparams: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleCreatePropertyFrameIndirect(lpparams.toString()) as Int) else 0

public actual fun OleCreateStaticFromData(psrcdataobj: Long, iid: Long, renderopt: UInt, pformatetc: Long, pclientsite: Long, pstg: Long, ppvobj: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleCreateStaticFromData(psrcdataobj.toString(), iid.toString(), renderopt.toInt(), pformatetc.toString(), pclientsite.toString(), pstg.toString(), ppvobj.toString()) as Int) else 0

public actual fun OleDestroyMenuDescriptor(holemenu: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleDestroyMenuDescriptor(holemenu.toString()) as Int) else 0

public actual fun OleDoAutoConvert(pstg: Long, pclsidnew: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleDoAutoConvert(pstg.toString(), pclsidnew.toString()) as Int) else 0

public actual fun OleDraw(punknown: Long, dwaspect: UInt, hdcdraw: HDC, lprcbounds: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleDraw(punknown.toString(), dwaspect.toInt(), hdcdraw.toString(), lprcbounds.toString()) as Int) else 0

public actual fun OleDuplicateData(hsrc: HANDLE, cfformat: CLIPBOARD_FORMAT, uiflags: GLOBAL_ALLOC_FLAGS): HANDLE =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleDuplicateData(hsrc.toString(), cfformat.toInt(), uiflags.toInt()) as String).toLong() else 0L

public actual fun OleFlushClipboard(): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleFlushClipboard() as Int) else 0

public actual fun OleGetAutoConvert(clsidold: Long, pclsidnew: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleGetAutoConvert(clsidold.toString(), pclsidnew.toString()) as Int) else 0

public actual fun OleGetClipboard(ppdataobj: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleGetClipboard(ppdataobj.toString()) as Int) else 0

public actual fun OleGetClipboardWithEnterpriseInfo(dataobject: Long, dataenterpriseid: Long, sourcedescription: Long, targetdescription: Long, datadescription: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleGetClipboardWithEnterpriseInfo(dataobject.toString(), dataenterpriseid.toString(), sourcedescription.toString(), targetdescription.toString(), datadescription.toString()) as Int) else 0

public actual fun OleGetIconOfClass(rclsid: Long, lpszlabel: PCWSTR, fusetypeaslabel: BOOL): HGLOBAL =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleGetIconOfClass(rclsid.toString(), lpszlabel.toString(), fusetypeaslabel) as String).toLong() else 0L

public actual fun OleGetIconOfFile(lpszpath: PCWSTR, fusefileaslabel: BOOL): HGLOBAL =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleGetIconOfFile(lpszpath.toString(), fusefileaslabel) as String).toLong() else 0L

public actual fun OleIconToCursor(hinstexe: HINSTANCE, hicon: HICON): HCURSOR =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleIconToCursor(hinstexe.toString(), hicon.toString()) as String).toLong() else 0L

public actual fun OleInitialize(pvreserved: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleInitialize(pvreserved.toString()) as Int) else 0

public actual fun OleIsCurrentClipboard(pdataobj: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleIsCurrentClipboard(pdataobj.toString()) as Int) else 0

public actual fun OleIsRunning(pobject: Long): BOOL =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleIsRunning(pobject.toString()) as Int) else 0

public actual fun OleLoad(pstg: Long, riid: Long, pclientsite: Long, ppvobj: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleLoad(pstg.toString(), riid.toString(), pclientsite.toString(), ppvobj.toString()) as Int) else 0

public actual fun OleLoadFromStream(pstm: Long, iidinterface: Long, ppvobj: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleLoadFromStream(pstm.toString(), iidinterface.toString(), ppvobj.toString()) as Int) else 0

public actual fun OleLoadPicture(lpstream: Long, lsize: Int, frunmode: BOOL, riid: Long, lplpvobj: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleLoadPicture(lpstream.toString(), lsize, frunmode, riid.toString(), lplpvobj.toString()) as Int) else 0

public actual fun OleLoadPictureEx(lpstream: Long, lsize: Int, frunmode: BOOL, riid: Long, xsizedesired: UInt, ysizedesired: UInt, dwflags: LOAD_PICTURE_FLAGS, lplpvobj: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleLoadPictureEx(lpstream.toString(), lsize, frunmode, riid.toString(), xsizedesired.toInt(), ysizedesired.toInt(), dwflags.toInt(), lplpvobj.toString()) as Int) else 0

public actual fun OleLoadPictureFile(varfilename: VARIANT, lplpdisppicture: Long): HRESULT =
    0

public actual fun OleLoadPictureFileEx(varfilename: VARIANT, xsizedesired: UInt, ysizedesired: UInt, dwflags: LOAD_PICTURE_FLAGS, lplpdisppicture: Long): HRESULT =
    0

public actual fun OleLoadPicturePath(szurlorpath: PCWSTR, punkcaller: Long, dwreserved: UInt, clrreserved: UInt, riid: Long, ppvret: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleLoadPicturePath(szurlorpath.toString(), punkcaller.toString(), dwreserved.toInt(), clrreserved.toInt(), riid.toString(), ppvret.toString()) as Int) else 0

public actual fun OleLockRunning(punknown: Long, flock: BOOL, flastunlockcloses: BOOL): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleLockRunning(punknown.toString(), flock, flastunlockcloses) as Int) else 0

public actual fun OleMetafilePictFromIconAndLabel(hicon: HICON, lpszlabel: PCWSTR, lpszsourcefile: PCWSTR, iiconindex: UInt): HGLOBAL =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleMetafilePictFromIconAndLabel(hicon.toString(), lpszlabel.toString(), lpszsourcefile.toString(), iiconindex.toInt()) as String).toLong() else 0L

public actual fun OleNoteObjectVisible(punknown: Long, fvisible: BOOL): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleNoteObjectVisible(punknown.toString(), fvisible) as Int) else 0

public actual fun OleQueryCreateFromData(psrcdataobject: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleQueryCreateFromData(psrcdataobject.toString()) as Int) else 0

public actual fun OleQueryLinkFromData(psrcdataobject: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleQueryLinkFromData(psrcdataobject.toString()) as Int) else 0

public actual fun OleRegEnumFormatEtc(clsid: Long, dwdirection: UInt, ppenum: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleRegEnumFormatEtc(clsid.toString(), dwdirection.toInt(), ppenum.toString()) as Int) else 0

public actual fun OleRegEnumVerbs(clsid: Long, ppenum: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleRegEnumVerbs(clsid.toString(), ppenum.toString()) as Int) else 0

public actual fun OleRegGetMiscStatus(clsid: Long, dwaspect: UInt, pdwstatus: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleRegGetMiscStatus(clsid.toString(), dwaspect.toInt(), pdwstatus.toString()) as Int) else 0

public actual fun OleRegGetUserType(clsid: Long, dwformoftype: UInt, pszusertype: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleRegGetUserType(clsid.toString(), dwformoftype.toInt(), pszusertype.toString()) as Int) else 0

public actual fun OleRun(punknown: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleRun(punknown.toString()) as Int) else 0

public actual fun OleSave(pps: Long, pstg: Long, fsameasload: BOOL): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleSave(pps.toString(), pstg.toString(), fsameasload) as Int) else 0

public actual fun OleSavePictureFile(lpdisppicture: Long, bstrfilename: BSTR): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleSavePictureFile(lpdisppicture.toString(), bstrfilename.toString()) as Int) else 0

public actual fun OleSaveToStream(ppstm: Long, pstm: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleSaveToStream(ppstm.toString(), pstm.toString()) as Int) else 0

public actual fun OleSetAutoConvert(clsidold: Long, clsidnew: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleSetAutoConvert(clsidold.toString(), clsidnew.toString()) as Int) else 0

public actual fun OleSetClipboard(pdataobj: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleSetClipboard(pdataobj.toString()) as Int) else 0

public actual fun OleSetContainedObject(punknown: Long, fcontained: BOOL): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleSetContainedObject(punknown.toString(), fcontained) as Int) else 0

public actual fun OleSetMenuDescriptor(holemenu: Long, hwndframe: HWND, hwndactiveobject: HWND, lpframe: Long, lpactiveobj: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleSetMenuDescriptor(holemenu.toString(), hwndframe.toString(), hwndactiveobject.toString(), lpframe.toString(), lpactiveobj.toString()) as Int) else 0

public actual fun OleTranslateAccelerator(lpframe: Long, lpframeinfo: Long, lpmsg: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleTranslateAccelerator(lpframe.toString(), lpframeinfo.toString(), lpmsg.toString()) as Int) else 0

public actual fun OleTranslateColor(clr: UInt, hpal: HPALETTE, lpcolorref: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleTranslateColor(clr.toInt(), hpal.toString(), lpcolorref.toString()) as Int) else 0

public actual fun OleUIAddVerbMenuA(lpoleobj: Long, lpszshorttype: PCSTR, hmenu: HMENU, upos: UInt, uidverbmin: UInt, uidverbmax: UInt, baddconvert: BOOL, idconvert: UInt, lphmenu: Long): BOOL =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleUIAddVerbMenuA(lpoleobj.toString(), lpszshorttype.toString(), hmenu.toString(), upos.toInt(), uidverbmin.toInt(), uidverbmax.toInt(), baddconvert, idconvert.toInt(), lphmenu.toString()) as Int) else 0

public actual fun OleUIAddVerbMenuW(lpoleobj: Long, lpszshorttype: PCWSTR, hmenu: HMENU, upos: UInt, uidverbmin: UInt, uidverbmax: UInt, baddconvert: BOOL, idconvert: UInt, lphmenu: Long): BOOL =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleUIAddVerbMenuW(lpoleobj.toString(), lpszshorttype.toString(), hmenu.toString(), upos.toInt(), uidverbmin.toInt(), uidverbmax.toInt(), baddconvert, idconvert.toInt(), lphmenu.toString()) as Int) else 0

public actual fun OleUIBusyA(param0: Long): UInt =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleUIBusyA(param0.toString()) as Int).toUInt() else 0u

public actual fun OleUIBusyW(param0: Long): UInt =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleUIBusyW(param0.toString()) as Int).toUInt() else 0u

public actual fun OleUICanConvertOrActivateAs(rclsid: Long, fislinkedobject: BOOL, wformat: UShort): BOOL =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleUICanConvertOrActivateAs(rclsid.toString(), fislinkedobject, wformat.toInt()) as Int) else 0

public actual fun OleUIChangeIconA(param0: Long): UInt =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleUIChangeIconA(param0.toString()) as Int).toUInt() else 0u

public actual fun OleUIChangeIconW(param0: Long): UInt =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleUIChangeIconW(param0.toString()) as Int).toUInt() else 0u

public actual fun OleUIChangeSourceA(param0: Long): UInt =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleUIChangeSourceA(param0.toString()) as Int).toUInt() else 0u

public actual fun OleUIChangeSourceW(param0: Long): UInt =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleUIChangeSourceW(param0.toString()) as Int).toUInt() else 0u

public actual fun OleUIConvertA(param0: Long): UInt =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleUIConvertA(param0.toString()) as Int).toUInt() else 0u

public actual fun OleUIConvertW(param0: Long): UInt =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleUIConvertW(param0.toString()) as Int).toUInt() else 0u

public actual fun OleUIEditLinksA(param0: Long): UInt =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleUIEditLinksA(param0.toString()) as Int).toUInt() else 0u

public actual fun OleUIEditLinksW(param0: Long): UInt =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleUIEditLinksW(param0.toString()) as Int).toUInt() else 0u

public actual fun OleUIInsertObjectA(param0: Long): UInt =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleUIInsertObjectA(param0.toString()) as Int).toUInt() else 0u

public actual fun OleUIInsertObjectW(param0: Long): UInt =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleUIInsertObjectW(param0.toString()) as Int).toUInt() else 0u

public actual fun OleUIObjectPropertiesA(param0: Long): UInt =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleUIObjectPropertiesA(param0.toString()) as Int).toUInt() else 0u

public actual fun OleUIObjectPropertiesW(param0: Long): UInt =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleUIObjectPropertiesW(param0.toString()) as Int).toUInt() else 0u

public actual fun OleUIPasteSpecialA(param0: Long): UInt =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleUIPasteSpecialA(param0.toString()) as Int).toUInt() else 0u

public actual fun OleUIPasteSpecialW(param0: Long): UInt =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleUIPasteSpecialW(param0.toString()) as Int).toUInt() else 0u

public actual fun OleUIPromptUserA(ntemplate: Int, hwndparent: HWND): Int =
    0

public actual fun OleUIPromptUserW(ntemplate: Int, hwndparent: HWND): Int =
    0

public actual fun OleUIUpdateLinksA(lpoleuilinkcntr: Long, hwndparent: HWND, lpsztitle: PCSTR, clinks: Int): BOOL =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleUIUpdateLinksA(lpoleuilinkcntr.toString(), hwndparent.toString(), lpsztitle.toString(), clinks) as Int) else 0

public actual fun OleUIUpdateLinksW(lpoleuilinkcntr: Long, hwndparent: HWND, lpsztitle: PCWSTR, clinks: Int): BOOL =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleUIUpdateLinksW(lpoleuilinkcntr.toString(), hwndparent.toString(), lpsztitle.toString(), clinks) as Int) else 0

public actual fun OleUninitialize() {
    if (_windowsWin32SystemOleNapiAddon != null) {
        _windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_OleUninitialize()
    }
}

public actual fun QueryPathOfRegTypeLib(guid: Long, wmaj: UShort, wmin: UShort, lcid: UInt, lpbstrpathname: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_QueryPathOfRegTypeLib(guid.toString(), wmaj.toInt(), wmin.toInt(), lcid.toInt(), lpbstrpathname.toString()) as Int) else 0

public actual fun RegisterActiveObject(punk: Long, rclsid: Long, dwflags: ACTIVEOBJECT_FLAGS, pdwregister: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_RegisterActiveObject(punk.toString(), rclsid.toString(), dwflags.toInt(), pdwregister.toString()) as Int) else 0

public actual fun RegisterDragDrop(hwnd: HWND, pdroptarget: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_RegisterDragDrop(hwnd.toString(), pdroptarget.toString()) as Int) else 0

public actual fun RegisterTypeLib(ptlib: Long, szfullpath: PCWSTR, szhelpdir: PCWSTR): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_RegisterTypeLib(ptlib.toString(), szfullpath.toString(), szhelpdir.toString()) as Int) else 0

public actual fun RegisterTypeLibForUser(ptlib: Long, szfullpath: PCWSTR, szhelpdir: PCWSTR): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_RegisterTypeLibForUser(ptlib.toString(), szfullpath.toString(), szhelpdir.toString()) as Int) else 0

public actual fun ReleaseStgMedium(param0: Long) {
    if (_windowsWin32SystemOleNapiAddon != null) {
        _windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_ReleaseStgMedium(param0.toString())
    }
}

public actual fun RevokeActiveObject(dwregister: UInt, pvreserved: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_RevokeActiveObject(dwregister.toInt(), pvreserved.toString()) as Int) else 0

public actual fun RevokeDragDrop(hwnd: HWND): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_RevokeDragDrop(hwnd.toString()) as Int) else 0

public actual fun SafeArrayAccessData(psa: Long, ppvdata: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_SafeArrayAccessData(psa.toString(), ppvdata.toString()) as Int) else 0

public actual fun SafeArrayAddRef(psa: Long, ppdatatorelease: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_SafeArrayAddRef(psa.toString(), ppdatatorelease.toString()) as Int) else 0

public actual fun SafeArrayAllocData(psa: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_SafeArrayAllocData(psa.toString()) as Int) else 0

public actual fun SafeArrayAllocDescriptor(cdims: UInt, ppsaout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_SafeArrayAllocDescriptor(cdims.toInt(), ppsaout.toString()) as Int) else 0

public actual fun SafeArrayAllocDescriptorEx(vt: VARENUM, cdims: UInt, ppsaout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_SafeArrayAllocDescriptorEx(vt.toInt(), cdims.toInt(), ppsaout.toString()) as Int) else 0

public actual fun SafeArrayCopy(psa: Long, ppsaout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_SafeArrayCopy(psa.toString(), ppsaout.toString()) as Int) else 0

public actual fun SafeArrayCopyData(psasource: Long, psatarget: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_SafeArrayCopyData(psasource.toString(), psatarget.toString()) as Int) else 0

public actual fun SafeArrayCreate(vt: VARENUM, cdims: UInt, rgsabound: Long): Long =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_SafeArrayCreate(vt.toInt(), cdims.toInt(), rgsabound.toString()) as String).toLong() else 0L

public actual fun SafeArrayCreateEx(vt: VARENUM, cdims: UInt, rgsabound: Long, pvextra: Long): Long =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_SafeArrayCreateEx(vt.toInt(), cdims.toInt(), rgsabound.toString(), pvextra.toString()) as String).toLong() else 0L

public actual fun SafeArrayCreateVector(vt: VARENUM, llbound: Int, celements: UInt): Long =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_SafeArrayCreateVector(vt.toInt(), llbound, celements.toInt()) as String).toLong() else 0L

public actual fun SafeArrayCreateVectorEx(vt: VARENUM, llbound: Int, celements: UInt, pvextra: Long): Long =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_SafeArrayCreateVectorEx(vt.toInt(), llbound, celements.toInt(), pvextra.toString()) as String).toLong() else 0L

public actual fun SafeArrayDestroy(psa: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_SafeArrayDestroy(psa.toString()) as Int) else 0

public actual fun SafeArrayDestroyData(psa: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_SafeArrayDestroyData(psa.toString()) as Int) else 0

public actual fun SafeArrayDestroyDescriptor(psa: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_SafeArrayDestroyDescriptor(psa.toString()) as Int) else 0

public actual fun SafeArrayGetDim(psa: Long): UInt =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_SafeArrayGetDim(psa.toString()) as Int).toUInt() else 0u

public actual fun SafeArrayGetElement(psa: Long, rgindices: Long, pv: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_SafeArrayGetElement(psa.toString(), rgindices.toString(), pv.toString()) as Int) else 0

public actual fun SafeArrayGetElemsize(psa: Long): UInt =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_SafeArrayGetElemsize(psa.toString()) as Int).toUInt() else 0u

public actual fun SafeArrayGetIID(psa: Long, pguid: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_SafeArrayGetIID(psa.toString(), pguid.toString()) as Int) else 0

public actual fun SafeArrayGetLBound(psa: Long, ndim: UInt, pllbound: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_SafeArrayGetLBound(psa.toString(), ndim.toInt(), pllbound.toString()) as Int) else 0

public actual fun SafeArrayGetRecordInfo(psa: Long, prinfo: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_SafeArrayGetRecordInfo(psa.toString(), prinfo.toString()) as Int) else 0

public actual fun SafeArrayGetUBound(psa: Long, ndim: UInt, plubound: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_SafeArrayGetUBound(psa.toString(), ndim.toInt(), plubound.toString()) as Int) else 0

public actual fun SafeArrayGetVartype(psa: Long, pvt: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_SafeArrayGetVartype(psa.toString(), pvt.toString()) as Int) else 0

public actual fun SafeArrayLock(psa: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_SafeArrayLock(psa.toString()) as Int) else 0

public actual fun SafeArrayPtrOfIndex(psa: Long, rgindices: Long, ppvdata: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_SafeArrayPtrOfIndex(psa.toString(), rgindices.toString(), ppvdata.toString()) as Int) else 0

public actual fun SafeArrayPutElement(psa: Long, rgindices: Long, pv: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_SafeArrayPutElement(psa.toString(), rgindices.toString(), pv.toString()) as Int) else 0

public actual fun SafeArrayRedim(psa: Long, psaboundnew: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_SafeArrayRedim(psa.toString(), psaboundnew.toString()) as Int) else 0

public actual fun SafeArrayReleaseData(pdata: Long) {
    if (_windowsWin32SystemOleNapiAddon != null) {
        _windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_SafeArrayReleaseData(pdata.toString())
    }
}

public actual fun SafeArrayReleaseDescriptor(psa: Long) {
    if (_windowsWin32SystemOleNapiAddon != null) {
        _windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_SafeArrayReleaseDescriptor(psa.toString())
    }
}

public actual fun SafeArraySetIID(psa: Long, guid: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_SafeArraySetIID(psa.toString(), guid.toString()) as Int) else 0

public actual fun SafeArraySetRecordInfo(psa: Long, prinfo: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_SafeArraySetRecordInfo(psa.toString(), prinfo.toString()) as Int) else 0

public actual fun SafeArrayUnaccessData(psa: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_SafeArrayUnaccessData(psa.toString()) as Int) else 0

public actual fun SafeArrayUnlock(psa: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_SafeArrayUnlock(psa.toString()) as Int) else 0

public actual fun UnRegisterTypeLib(libid: Long, wvermajor: UShort, wverminor: UShort, lcid: UInt, syskind: SYSKIND): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_UnRegisterTypeLib(libid.toString(), wvermajor.toInt(), wverminor.toInt(), lcid.toInt(), syskind) as Int) else 0

public actual fun UnRegisterTypeLibForUser(libid: Long, wmajorvernum: UShort, wminorvernum: UShort, lcid: UInt, syskind: SYSKIND): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_UnRegisterTypeLibForUser(libid.toString(), wmajorvernum.toInt(), wminorvernum.toInt(), lcid.toInt(), syskind) as Int) else 0

public actual fun VarAbs(pvarin: Long, pvarresult: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarAbs(pvarin.toString(), pvarresult.toString()) as Int) else 0

public actual fun VarAdd(pvarleft: Long, pvarright: Long, pvarresult: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarAdd(pvarleft.toString(), pvarright.toString(), pvarresult.toString()) as Int) else 0

public actual fun VarAnd(pvarleft: Long, pvarright: Long, pvarresult: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarAnd(pvarleft.toString(), pvarright.toString(), pvarresult.toString()) as Int) else 0

public actual fun VarBoolFromCy(cyin: CY, pboolout: Long): HRESULT =
    0

public actual fun VarBoolFromDate(datein: Double, pboolout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarBoolFromDate(datein, pboolout.toString()) as Int) else 0

public actual fun VarBoolFromDec(pdecin: Long, pboolout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarBoolFromDec(pdecin.toString(), pboolout.toString()) as Int) else 0

public actual fun VarBoolFromDisp(pdispin: Long, lcid: UInt, pboolout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarBoolFromDisp(pdispin.toString(), lcid.toInt(), pboolout.toString()) as Int) else 0

public actual fun VarBoolFromI1(cin: Byte, pboolout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarBoolFromI1(cin.toInt(), pboolout.toString()) as Int) else 0

public actual fun VarBoolFromI2(sin: Short, pboolout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarBoolFromI2(sin.toInt(), pboolout.toString()) as Int) else 0

public actual fun VarBoolFromI4(lin: Int, pboolout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarBoolFromI4(lin, pboolout.toString()) as Int) else 0

public actual fun VarBoolFromI8(i64in: Long, pboolout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarBoolFromI8(i64in.toString(), pboolout.toString()) as Int) else 0

public actual fun VarBoolFromR4(fltin: Float, pboolout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarBoolFromR4(fltin.toDouble(), pboolout.toString()) as Int) else 0

public actual fun VarBoolFromR8(dblin: Double, pboolout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarBoolFromR8(dblin, pboolout.toString()) as Int) else 0

public actual fun VarBoolFromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, pboolout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarBoolFromStr(strin.toString(), lcid.toInt(), dwflags.toInt(), pboolout.toString()) as Int) else 0

public actual fun VarBoolFromUI1(bin: UByte, pboolout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarBoolFromUI1(bin.toInt(), pboolout.toString()) as Int) else 0

public actual fun VarBoolFromUI2(uiin: UShort, pboolout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarBoolFromUI2(uiin.toInt(), pboolout.toString()) as Int) else 0

public actual fun VarBoolFromUI4(ulin: UInt, pboolout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarBoolFromUI4(ulin.toInt(), pboolout.toString()) as Int) else 0

public actual fun VarBoolFromUI8(i64in: ULong, pboolout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarBoolFromUI8(i64in.toString(), pboolout.toString()) as Int) else 0

public actual fun VarBstrCat(bstrleft: BSTR, bstrright: BSTR, pbstrresult: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarBstrCat(bstrleft.toString(), bstrright.toString(), pbstrresult.toString()) as Int) else 0

public actual fun VarBstrCmp(bstrleft: BSTR, bstrright: BSTR, lcid: UInt, dwflags: UInt): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarBstrCmp(bstrleft.toString(), bstrright.toString(), lcid.toInt(), dwflags.toInt()) as Int) else 0

public actual fun VarBstrFromBool(boolin: VARIANT_BOOL, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarBstrFromBool(boolin.toInt(), lcid.toInt(), dwflags.toInt(), pbstrout.toString()) as Int) else 0

public actual fun VarBstrFromCy(cyin: CY, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT =
    0

public actual fun VarBstrFromDate(datein: Double, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarBstrFromDate(datein, lcid.toInt(), dwflags.toInt(), pbstrout.toString()) as Int) else 0

public actual fun VarBstrFromDec(pdecin: Long, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarBstrFromDec(pdecin.toString(), lcid.toInt(), dwflags.toInt(), pbstrout.toString()) as Int) else 0

public actual fun VarBstrFromDisp(pdispin: Long, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarBstrFromDisp(pdispin.toString(), lcid.toInt(), dwflags.toInt(), pbstrout.toString()) as Int) else 0

public actual fun VarBstrFromI1(cin: Byte, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarBstrFromI1(cin.toInt(), lcid.toInt(), dwflags.toInt(), pbstrout.toString()) as Int) else 0

public actual fun VarBstrFromI2(ival: Short, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarBstrFromI2(ival.toInt(), lcid.toInt(), dwflags.toInt(), pbstrout.toString()) as Int) else 0

public actual fun VarBstrFromI4(lin: Int, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarBstrFromI4(lin, lcid.toInt(), dwflags.toInt(), pbstrout.toString()) as Int) else 0

public actual fun VarBstrFromI8(i64in: Long, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarBstrFromI8(i64in.toString(), lcid.toInt(), dwflags.toInt(), pbstrout.toString()) as Int) else 0

public actual fun VarBstrFromR4(fltin: Float, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarBstrFromR4(fltin.toDouble(), lcid.toInt(), dwflags.toInt(), pbstrout.toString()) as Int) else 0

public actual fun VarBstrFromR8(dblin: Double, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarBstrFromR8(dblin, lcid.toInt(), dwflags.toInt(), pbstrout.toString()) as Int) else 0

public actual fun VarBstrFromUI1(bval: UByte, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarBstrFromUI1(bval.toInt(), lcid.toInt(), dwflags.toInt(), pbstrout.toString()) as Int) else 0

public actual fun VarBstrFromUI2(uiin: UShort, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarBstrFromUI2(uiin.toInt(), lcid.toInt(), dwflags.toInt(), pbstrout.toString()) as Int) else 0

public actual fun VarBstrFromUI4(ulin: UInt, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarBstrFromUI4(ulin.toInt(), lcid.toInt(), dwflags.toInt(), pbstrout.toString()) as Int) else 0

public actual fun VarBstrFromUI8(ui64in: ULong, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarBstrFromUI8(ui64in.toString(), lcid.toInt(), dwflags.toInt(), pbstrout.toString()) as Int) else 0

public actual fun VarCat(pvarleft: Long, pvarright: Long, pvarresult: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarCat(pvarleft.toString(), pvarright.toString(), pvarresult.toString()) as Int) else 0

public actual fun VarCmp(pvarleft: Long, pvarright: Long, lcid: UInt, dwflags: UInt): VARCMP =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarCmp(pvarleft.toString(), pvarright.toString(), lcid.toInt(), dwflags.toInt()) as Int).toUInt() else 0u

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
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarCyFromBool(boolin.toInt(), pcyout.toString()) as Int) else 0

public actual fun VarCyFromDate(datein: Double, pcyout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarCyFromDate(datein, pcyout.toString()) as Int) else 0

public actual fun VarCyFromDec(pdecin: Long, pcyout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarCyFromDec(pdecin.toString(), pcyout.toString()) as Int) else 0

public actual fun VarCyFromDisp(pdispin: Long, lcid: UInt, pcyout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarCyFromDisp(pdispin.toString(), lcid.toInt(), pcyout.toString()) as Int) else 0

public actual fun VarCyFromI1(cin: Byte, pcyout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarCyFromI1(cin.toInt(), pcyout.toString()) as Int) else 0

public actual fun VarCyFromI2(sin: Short, pcyout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarCyFromI2(sin.toInt(), pcyout.toString()) as Int) else 0

public actual fun VarCyFromI4(lin: Int, pcyout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarCyFromI4(lin, pcyout.toString()) as Int) else 0

public actual fun VarCyFromI8(i64in: Long, pcyout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarCyFromI8(i64in.toString(), pcyout.toString()) as Int) else 0

public actual fun VarCyFromR4(fltin: Float, pcyout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarCyFromR4(fltin.toDouble(), pcyout.toString()) as Int) else 0

public actual fun VarCyFromR8(dblin: Double, pcyout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarCyFromR8(dblin, pcyout.toString()) as Int) else 0

public actual fun VarCyFromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, pcyout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarCyFromStr(strin.toString(), lcid.toInt(), dwflags.toInt(), pcyout.toString()) as Int) else 0

public actual fun VarCyFromUI1(bin: UByte, pcyout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarCyFromUI1(bin.toInt(), pcyout.toString()) as Int) else 0

public actual fun VarCyFromUI2(uiin: UShort, pcyout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarCyFromUI2(uiin.toInt(), pcyout.toString()) as Int) else 0

public actual fun VarCyFromUI4(ulin: UInt, pcyout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarCyFromUI4(ulin.toInt(), pcyout.toString()) as Int) else 0

public actual fun VarCyFromUI8(ui64in: ULong, pcyout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarCyFromUI8(ui64in.toString(), pcyout.toString()) as Int) else 0

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
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarDateFromBool(boolin.toInt(), pdateout.toString()) as Int) else 0

public actual fun VarDateFromCy(cyin: CY, pdateout: Long): HRESULT =
    0

public actual fun VarDateFromDec(pdecin: Long, pdateout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarDateFromDec(pdecin.toString(), pdateout.toString()) as Int) else 0

public actual fun VarDateFromDisp(pdispin: Long, lcid: UInt, pdateout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarDateFromDisp(pdispin.toString(), lcid.toInt(), pdateout.toString()) as Int) else 0

public actual fun VarDateFromI1(cin: Byte, pdateout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarDateFromI1(cin.toInt(), pdateout.toString()) as Int) else 0

public actual fun VarDateFromI2(sin: Short, pdateout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarDateFromI2(sin.toInt(), pdateout.toString()) as Int) else 0

public actual fun VarDateFromI4(lin: Int, pdateout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarDateFromI4(lin, pdateout.toString()) as Int) else 0

public actual fun VarDateFromI8(i64in: Long, pdateout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarDateFromI8(i64in.toString(), pdateout.toString()) as Int) else 0

public actual fun VarDateFromR4(fltin: Float, pdateout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarDateFromR4(fltin.toDouble(), pdateout.toString()) as Int) else 0

public actual fun VarDateFromR8(dblin: Double, pdateout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarDateFromR8(dblin, pdateout.toString()) as Int) else 0

public actual fun VarDateFromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, pdateout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarDateFromStr(strin.toString(), lcid.toInt(), dwflags.toInt(), pdateout.toString()) as Int) else 0

public actual fun VarDateFromUI1(bin: UByte, pdateout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarDateFromUI1(bin.toInt(), pdateout.toString()) as Int) else 0

public actual fun VarDateFromUI2(uiin: UShort, pdateout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarDateFromUI2(uiin.toInt(), pdateout.toString()) as Int) else 0

public actual fun VarDateFromUI4(ulin: UInt, pdateout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarDateFromUI4(ulin.toInt(), pdateout.toString()) as Int) else 0

public actual fun VarDateFromUI8(ui64in: ULong, pdateout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarDateFromUI8(ui64in.toString(), pdateout.toString()) as Int) else 0

public actual fun VarDateFromUdate(pudatein: Long, dwflags: UInt, pdateout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarDateFromUdate(pudatein.toString(), dwflags.toInt(), pdateout.toString()) as Int) else 0

public actual fun VarDateFromUdateEx(pudatein: Long, lcid: UInt, dwflags: UInt, pdateout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarDateFromUdateEx(pudatein.toString(), lcid.toInt(), dwflags.toInt(), pdateout.toString()) as Int) else 0

public actual fun VarDecAbs(pdecin: Long, pdecresult: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarDecAbs(pdecin.toString(), pdecresult.toString()) as Int) else 0

public actual fun VarDecAdd(pdecleft: Long, pdecright: Long, pdecresult: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarDecAdd(pdecleft.toString(), pdecright.toString(), pdecresult.toString()) as Int) else 0

public actual fun VarDecCmp(pdecleft: Long, pdecright: Long): VARCMP =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarDecCmp(pdecleft.toString(), pdecright.toString()) as Int).toUInt() else 0u

public actual fun VarDecCmpR8(pdecleft: Long, dblright: Double): VARCMP =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarDecCmpR8(pdecleft.toString(), dblright) as Int).toUInt() else 0u

public actual fun VarDecDiv(pdecleft: Long, pdecright: Long, pdecresult: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarDecDiv(pdecleft.toString(), pdecright.toString(), pdecresult.toString()) as Int) else 0

public actual fun VarDecFix(pdecin: Long, pdecresult: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarDecFix(pdecin.toString(), pdecresult.toString()) as Int) else 0

public actual fun VarDecFromBool(boolin: VARIANT_BOOL, pdecout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarDecFromBool(boolin.toInt(), pdecout.toString()) as Int) else 0

public actual fun VarDecFromCy(cyin: CY, pdecout: Long): HRESULT =
    0

public actual fun VarDecFromDate(datein: Double, pdecout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarDecFromDate(datein, pdecout.toString()) as Int) else 0

public actual fun VarDecFromDisp(pdispin: Long, lcid: UInt, pdecout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarDecFromDisp(pdispin.toString(), lcid.toInt(), pdecout.toString()) as Int) else 0

public actual fun VarDecFromI1(cin: Byte, pdecout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarDecFromI1(cin.toInt(), pdecout.toString()) as Int) else 0

public actual fun VarDecFromI2(uiin: Short, pdecout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarDecFromI2(uiin.toInt(), pdecout.toString()) as Int) else 0

public actual fun VarDecFromI4(lin: Int, pdecout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarDecFromI4(lin, pdecout.toString()) as Int) else 0

public actual fun VarDecFromI8(i64in: Long, pdecout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarDecFromI8(i64in.toString(), pdecout.toString()) as Int) else 0

public actual fun VarDecFromR4(fltin: Float, pdecout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarDecFromR4(fltin.toDouble(), pdecout.toString()) as Int) else 0

public actual fun VarDecFromR8(dblin: Double, pdecout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarDecFromR8(dblin, pdecout.toString()) as Int) else 0

public actual fun VarDecFromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, pdecout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarDecFromStr(strin.toString(), lcid.toInt(), dwflags.toInt(), pdecout.toString()) as Int) else 0

public actual fun VarDecFromUI1(bin: UByte, pdecout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarDecFromUI1(bin.toInt(), pdecout.toString()) as Int) else 0

public actual fun VarDecFromUI2(uiin: UShort, pdecout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarDecFromUI2(uiin.toInt(), pdecout.toString()) as Int) else 0

public actual fun VarDecFromUI4(ulin: UInt, pdecout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarDecFromUI4(ulin.toInt(), pdecout.toString()) as Int) else 0

public actual fun VarDecFromUI8(ui64in: ULong, pdecout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarDecFromUI8(ui64in.toString(), pdecout.toString()) as Int) else 0

public actual fun VarDecInt(pdecin: Long, pdecresult: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarDecInt(pdecin.toString(), pdecresult.toString()) as Int) else 0

public actual fun VarDecMul(pdecleft: Long, pdecright: Long, pdecresult: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarDecMul(pdecleft.toString(), pdecright.toString(), pdecresult.toString()) as Int) else 0

public actual fun VarDecNeg(pdecin: Long, pdecresult: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarDecNeg(pdecin.toString(), pdecresult.toString()) as Int) else 0

public actual fun VarDecRound(pdecin: Long, cdecimals: Int, pdecresult: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarDecRound(pdecin.toString(), cdecimals, pdecresult.toString()) as Int) else 0

public actual fun VarDecSub(pdecleft: Long, pdecright: Long, pdecresult: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarDecSub(pdecleft.toString(), pdecright.toString(), pdecresult.toString()) as Int) else 0

public actual fun VarDiv(pvarleft: Long, pvarright: Long, pvarresult: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarDiv(pvarleft.toString(), pvarright.toString(), pvarresult.toString()) as Int) else 0

public actual fun VarEqv(pvarleft: Long, pvarright: Long, pvarresult: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarEqv(pvarleft.toString(), pvarright.toString(), pvarresult.toString()) as Int) else 0

public actual fun VarFix(pvarin: Long, pvarresult: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarFix(pvarin.toString(), pvarresult.toString()) as Int) else 0

public actual fun VarFormat(pvarin: Long, pstrformat: PCWSTR, ifirstday: VARFORMAT_FIRST_DAY, ifirstweek: VARFORMAT_FIRST_WEEK, dwflags: UInt, pbstrout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarFormat(pvarin.toString(), pstrformat.toString(), ifirstday, ifirstweek, dwflags.toInt(), pbstrout.toString()) as Int) else 0

public actual fun VarFormatCurrency(pvarin: Long, inumdig: Int, iinclead: Int, iuseparens: Int, igroup: Int, dwflags: UInt, pbstrout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarFormatCurrency(pvarin.toString(), inumdig, iinclead, iuseparens, igroup, dwflags.toInt(), pbstrout.toString()) as Int) else 0

public actual fun VarFormatDateTime(pvarin: Long, inamedformat: VARFORMAT_NAMED_FORMAT, dwflags: UInt, pbstrout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarFormatDateTime(pvarin.toString(), inamedformat, dwflags.toInt(), pbstrout.toString()) as Int) else 0

public actual fun VarFormatFromTokens(pvarin: Long, pstrformat: PCWSTR, pbtokcur: Long, dwflags: UInt, pbstrout: Long, lcid: UInt): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarFormatFromTokens(pvarin.toString(), pstrformat.toString(), pbtokcur.toString(), dwflags.toInt(), pbstrout.toString(), lcid.toInt()) as Int) else 0

public actual fun VarFormatNumber(pvarin: Long, inumdig: Int, iinclead: VARFORMAT_LEADING_DIGIT, iuseparens: VARFORMAT_PARENTHESES, igroup: VARFORMAT_GROUP, dwflags: UInt, pbstrout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarFormatNumber(pvarin.toString(), inumdig, iinclead, iuseparens, igroup, dwflags.toInt(), pbstrout.toString()) as Int) else 0

public actual fun VarFormatPercent(pvarin: Long, inumdig: Int, iinclead: VARFORMAT_LEADING_DIGIT, iuseparens: VARFORMAT_PARENTHESES, igroup: VARFORMAT_GROUP, dwflags: UInt, pbstrout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarFormatPercent(pvarin.toString(), inumdig, iinclead, iuseparens, igroup, dwflags.toInt(), pbstrout.toString()) as Int) else 0

public actual fun VarI1FromBool(boolin: VARIANT_BOOL, pcout: PSTR): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarI1FromBool(boolin.toInt(), pcout.toString()) as Int) else 0

public actual fun VarI1FromCy(cyin: CY, pcout: PSTR): HRESULT =
    0

public actual fun VarI1FromDate(datein: Double, pcout: PSTR): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarI1FromDate(datein, pcout.toString()) as Int) else 0

public actual fun VarI1FromDec(pdecin: Long, pcout: PSTR): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarI1FromDec(pdecin.toString(), pcout.toString()) as Int) else 0

public actual fun VarI1FromDisp(pdispin: Long, lcid: UInt, pcout: PSTR): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarI1FromDisp(pdispin.toString(), lcid.toInt(), pcout.toString()) as Int) else 0

public actual fun VarI1FromI2(uiin: Short, pcout: PSTR): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarI1FromI2(uiin.toInt(), pcout.toString()) as Int) else 0

public actual fun VarI1FromI4(lin: Int, pcout: PSTR): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarI1FromI4(lin, pcout.toString()) as Int) else 0

public actual fun VarI1FromI8(i64in: Long, pcout: PSTR): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarI1FromI8(i64in.toString(), pcout.toString()) as Int) else 0

public actual fun VarI1FromR4(fltin: Float, pcout: PSTR): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarI1FromR4(fltin.toDouble(), pcout.toString()) as Int) else 0

public actual fun VarI1FromR8(dblin: Double, pcout: PSTR): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarI1FromR8(dblin, pcout.toString()) as Int) else 0

public actual fun VarI1FromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, pcout: PSTR): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarI1FromStr(strin.toString(), lcid.toInt(), dwflags.toInt(), pcout.toString()) as Int) else 0

public actual fun VarI1FromUI1(bin: UByte, pcout: PSTR): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarI1FromUI1(bin.toInt(), pcout.toString()) as Int) else 0

public actual fun VarI1FromUI2(uiin: UShort, pcout: PSTR): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarI1FromUI2(uiin.toInt(), pcout.toString()) as Int) else 0

public actual fun VarI1FromUI4(ulin: UInt, pcout: PSTR): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarI1FromUI4(ulin.toInt(), pcout.toString()) as Int) else 0

public actual fun VarI1FromUI8(i64in: ULong, pcout: PSTR): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarI1FromUI8(i64in.toString(), pcout.toString()) as Int) else 0

public actual fun VarI2FromBool(boolin: VARIANT_BOOL, psout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarI2FromBool(boolin.toInt(), psout.toString()) as Int) else 0

public actual fun VarI2FromCy(cyin: CY, psout: Long): HRESULT =
    0

public actual fun VarI2FromDate(datein: Double, psout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarI2FromDate(datein, psout.toString()) as Int) else 0

public actual fun VarI2FromDec(pdecin: Long, psout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarI2FromDec(pdecin.toString(), psout.toString()) as Int) else 0

public actual fun VarI2FromDisp(pdispin: Long, lcid: UInt, psout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarI2FromDisp(pdispin.toString(), lcid.toInt(), psout.toString()) as Int) else 0

public actual fun VarI2FromI1(cin: Byte, psout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarI2FromI1(cin.toInt(), psout.toString()) as Int) else 0

public actual fun VarI2FromI4(lin: Int, psout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarI2FromI4(lin, psout.toString()) as Int) else 0

public actual fun VarI2FromI8(i64in: Long, psout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarI2FromI8(i64in.toString(), psout.toString()) as Int) else 0

public actual fun VarI2FromR4(fltin: Float, psout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarI2FromR4(fltin.toDouble(), psout.toString()) as Int) else 0

public actual fun VarI2FromR8(dblin: Double, psout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarI2FromR8(dblin, psout.toString()) as Int) else 0

public actual fun VarI2FromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, psout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarI2FromStr(strin.toString(), lcid.toInt(), dwflags.toInt(), psout.toString()) as Int) else 0

public actual fun VarI2FromUI1(bin: UByte, psout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarI2FromUI1(bin.toInt(), psout.toString()) as Int) else 0

public actual fun VarI2FromUI2(uiin: UShort, psout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarI2FromUI2(uiin.toInt(), psout.toString()) as Int) else 0

public actual fun VarI2FromUI4(ulin: UInt, psout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarI2FromUI4(ulin.toInt(), psout.toString()) as Int) else 0

public actual fun VarI2FromUI8(ui64in: ULong, psout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarI2FromUI8(ui64in.toString(), psout.toString()) as Int) else 0

public actual fun VarI4FromBool(boolin: VARIANT_BOOL, plout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarI4FromBool(boolin.toInt(), plout.toString()) as Int) else 0

public actual fun VarI4FromCy(cyin: CY, plout: Long): HRESULT =
    0

public actual fun VarI4FromDate(datein: Double, plout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarI4FromDate(datein, plout.toString()) as Int) else 0

public actual fun VarI4FromDec(pdecin: Long, plout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarI4FromDec(pdecin.toString(), plout.toString()) as Int) else 0

public actual fun VarI4FromDisp(pdispin: Long, lcid: UInt, plout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarI4FromDisp(pdispin.toString(), lcid.toInt(), plout.toString()) as Int) else 0

public actual fun VarI4FromI1(cin: Byte, plout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarI4FromI1(cin.toInt(), plout.toString()) as Int) else 0

public actual fun VarI4FromI2(sin: Short, plout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarI4FromI2(sin.toInt(), plout.toString()) as Int) else 0

public actual fun VarI4FromI8(i64in: Long, plout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarI4FromI8(i64in.toString(), plout.toString()) as Int) else 0

public actual fun VarI4FromR4(fltin: Float, plout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarI4FromR4(fltin.toDouble(), plout.toString()) as Int) else 0

public actual fun VarI4FromR8(dblin: Double, plout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarI4FromR8(dblin, plout.toString()) as Int) else 0

public actual fun VarI4FromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, plout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarI4FromStr(strin.toString(), lcid.toInt(), dwflags.toInt(), plout.toString()) as Int) else 0

public actual fun VarI4FromUI1(bin: UByte, plout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarI4FromUI1(bin.toInt(), plout.toString()) as Int) else 0

public actual fun VarI4FromUI2(uiin: UShort, plout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarI4FromUI2(uiin.toInt(), plout.toString()) as Int) else 0

public actual fun VarI4FromUI4(ulin: UInt, plout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarI4FromUI4(ulin.toInt(), plout.toString()) as Int) else 0

public actual fun VarI4FromUI8(ui64in: ULong, plout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarI4FromUI8(ui64in.toString(), plout.toString()) as Int) else 0

public actual fun VarI8FromBool(boolin: VARIANT_BOOL, pi64out: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarI8FromBool(boolin.toInt(), pi64out.toString()) as Int) else 0

public actual fun VarI8FromCy(cyin: CY, pi64out: Long): HRESULT =
    0

public actual fun VarI8FromDate(datein: Double, pi64out: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarI8FromDate(datein, pi64out.toString()) as Int) else 0

public actual fun VarI8FromDec(pdecin: Long, pi64out: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarI8FromDec(pdecin.toString(), pi64out.toString()) as Int) else 0

public actual fun VarI8FromDisp(pdispin: Long, lcid: UInt, pi64out: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarI8FromDisp(pdispin.toString(), lcid.toInt(), pi64out.toString()) as Int) else 0

public actual fun VarI8FromI1(cin: Byte, pi64out: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarI8FromI1(cin.toInt(), pi64out.toString()) as Int) else 0

public actual fun VarI8FromI2(sin: Short, pi64out: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarI8FromI2(sin.toInt(), pi64out.toString()) as Int) else 0

public actual fun VarI8FromR4(fltin: Float, pi64out: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarI8FromR4(fltin.toDouble(), pi64out.toString()) as Int) else 0

public actual fun VarI8FromR8(dblin: Double, pi64out: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarI8FromR8(dblin, pi64out.toString()) as Int) else 0

public actual fun VarI8FromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, pi64out: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarI8FromStr(strin.toString(), lcid.toInt(), dwflags.toInt(), pi64out.toString()) as Int) else 0

public actual fun VarI8FromUI1(bin: UByte, pi64out: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarI8FromUI1(bin.toInt(), pi64out.toString()) as Int) else 0

public actual fun VarI8FromUI2(uiin: UShort, pi64out: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarI8FromUI2(uiin.toInt(), pi64out.toString()) as Int) else 0

public actual fun VarI8FromUI4(ulin: UInt, pi64out: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarI8FromUI4(ulin.toInt(), pi64out.toString()) as Int) else 0

public actual fun VarI8FromUI8(ui64in: ULong, pi64out: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarI8FromUI8(ui64in.toString(), pi64out.toString()) as Int) else 0

public actual fun VarIdiv(pvarleft: Long, pvarright: Long, pvarresult: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarIdiv(pvarleft.toString(), pvarright.toString(), pvarresult.toString()) as Int) else 0

public actual fun VarImp(pvarleft: Long, pvarright: Long, pvarresult: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarImp(pvarleft.toString(), pvarright.toString(), pvarresult.toString()) as Int) else 0

public actual fun VarInt(pvarin: Long, pvarresult: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarInt(pvarin.toString(), pvarresult.toString()) as Int) else 0

public actual fun VarMod(pvarleft: Long, pvarright: Long, pvarresult: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarMod(pvarleft.toString(), pvarright.toString(), pvarresult.toString()) as Int) else 0

public actual fun VarMonthName(imonth: Int, fabbrev: Int, dwflags: UInt, pbstrout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarMonthName(imonth, fabbrev, dwflags.toInt(), pbstrout.toString()) as Int) else 0

public actual fun VarMul(pvarleft: Long, pvarright: Long, pvarresult: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarMul(pvarleft.toString(), pvarright.toString(), pvarresult.toString()) as Int) else 0

public actual fun VarNeg(pvarin: Long, pvarresult: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarNeg(pvarin.toString(), pvarresult.toString()) as Int) else 0

public actual fun VarNot(pvarin: Long, pvarresult: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarNot(pvarin.toString(), pvarresult.toString()) as Int) else 0

public actual fun VarNumFromParseNum(pnumprs: Long, rgbdig: Long, dwvtbits: UInt, pvar: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarNumFromParseNum(pnumprs.toString(), rgbdig.toString(), dwvtbits.toInt(), pvar.toString()) as Int) else 0

public actual fun VarOr(pvarleft: Long, pvarright: Long, pvarresult: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarOr(pvarleft.toString(), pvarright.toString(), pvarresult.toString()) as Int) else 0

public actual fun VarParseNumFromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, pnumprs: Long, rgbdig: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarParseNumFromStr(strin.toString(), lcid.toInt(), dwflags.toInt(), pnumprs.toString(), rgbdig.toString()) as Int) else 0

public actual fun VarPow(pvarleft: Long, pvarright: Long, pvarresult: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarPow(pvarleft.toString(), pvarright.toString(), pvarresult.toString()) as Int) else 0

public actual fun VarR4CmpR8(fltleft: Float, dblright: Double): VARCMP =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarR4CmpR8(fltleft.toDouble(), dblright) as Int).toUInt() else 0u

public actual fun VarR4FromBool(boolin: VARIANT_BOOL, pfltout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarR4FromBool(boolin.toInt(), pfltout.toString()) as Int) else 0

public actual fun VarR4FromCy(cyin: CY, pfltout: Long): HRESULT =
    0

public actual fun VarR4FromDate(datein: Double, pfltout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarR4FromDate(datein, pfltout.toString()) as Int) else 0

public actual fun VarR4FromDec(pdecin: Long, pfltout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarR4FromDec(pdecin.toString(), pfltout.toString()) as Int) else 0

public actual fun VarR4FromDisp(pdispin: Long, lcid: UInt, pfltout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarR4FromDisp(pdispin.toString(), lcid.toInt(), pfltout.toString()) as Int) else 0

public actual fun VarR4FromI1(cin: Byte, pfltout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarR4FromI1(cin.toInt(), pfltout.toString()) as Int) else 0

public actual fun VarR4FromI2(sin: Short, pfltout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarR4FromI2(sin.toInt(), pfltout.toString()) as Int) else 0

public actual fun VarR4FromI4(lin: Int, pfltout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarR4FromI4(lin, pfltout.toString()) as Int) else 0

public actual fun VarR4FromI8(i64in: Long, pfltout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarR4FromI8(i64in.toString(), pfltout.toString()) as Int) else 0

public actual fun VarR4FromR8(dblin: Double, pfltout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarR4FromR8(dblin, pfltout.toString()) as Int) else 0

public actual fun VarR4FromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, pfltout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarR4FromStr(strin.toString(), lcid.toInt(), dwflags.toInt(), pfltout.toString()) as Int) else 0

public actual fun VarR4FromUI1(bin: UByte, pfltout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarR4FromUI1(bin.toInt(), pfltout.toString()) as Int) else 0

public actual fun VarR4FromUI2(uiin: UShort, pfltout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarR4FromUI2(uiin.toInt(), pfltout.toString()) as Int) else 0

public actual fun VarR4FromUI4(ulin: UInt, pfltout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarR4FromUI4(ulin.toInt(), pfltout.toString()) as Int) else 0

public actual fun VarR4FromUI8(ui64in: ULong, pfltout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarR4FromUI8(ui64in.toString(), pfltout.toString()) as Int) else 0

public actual fun VarR8FromBool(boolin: VARIANT_BOOL, pdblout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarR8FromBool(boolin.toInt(), pdblout.toString()) as Int) else 0

public actual fun VarR8FromCy(cyin: CY, pdblout: Long): HRESULT =
    0

public actual fun VarR8FromDate(datein: Double, pdblout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarR8FromDate(datein, pdblout.toString()) as Int) else 0

public actual fun VarR8FromDec(pdecin: Long, pdblout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarR8FromDec(pdecin.toString(), pdblout.toString()) as Int) else 0

public actual fun VarR8FromDisp(pdispin: Long, lcid: UInt, pdblout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarR8FromDisp(pdispin.toString(), lcid.toInt(), pdblout.toString()) as Int) else 0

public actual fun VarR8FromI1(cin: Byte, pdblout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarR8FromI1(cin.toInt(), pdblout.toString()) as Int) else 0

public actual fun VarR8FromI2(sin: Short, pdblout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarR8FromI2(sin.toInt(), pdblout.toString()) as Int) else 0

public actual fun VarR8FromI4(lin: Int, pdblout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarR8FromI4(lin, pdblout.toString()) as Int) else 0

public actual fun VarR8FromI8(i64in: Long, pdblout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarR8FromI8(i64in.toString(), pdblout.toString()) as Int) else 0

public actual fun VarR8FromR4(fltin: Float, pdblout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarR8FromR4(fltin.toDouble(), pdblout.toString()) as Int) else 0

public actual fun VarR8FromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, pdblout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarR8FromStr(strin.toString(), lcid.toInt(), dwflags.toInt(), pdblout.toString()) as Int) else 0

public actual fun VarR8FromUI1(bin: UByte, pdblout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarR8FromUI1(bin.toInt(), pdblout.toString()) as Int) else 0

public actual fun VarR8FromUI2(uiin: UShort, pdblout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarR8FromUI2(uiin.toInt(), pdblout.toString()) as Int) else 0

public actual fun VarR8FromUI4(ulin: UInt, pdblout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarR8FromUI4(ulin.toInt(), pdblout.toString()) as Int) else 0

public actual fun VarR8FromUI8(ui64in: ULong, pdblout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarR8FromUI8(ui64in.toString(), pdblout.toString()) as Int) else 0

public actual fun VarR8Pow(dblleft: Double, dblright: Double, pdblresult: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarR8Pow(dblleft, dblright, pdblresult.toString()) as Int) else 0

public actual fun VarR8Round(dblin: Double, cdecimals: Int, pdblresult: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarR8Round(dblin, cdecimals, pdblresult.toString()) as Int) else 0

public actual fun VarRound(pvarin: Long, cdecimals: Int, pvarresult: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarRound(pvarin.toString(), cdecimals, pvarresult.toString()) as Int) else 0

public actual fun VarSub(pvarleft: Long, pvarright: Long, pvarresult: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarSub(pvarleft.toString(), pvarright.toString(), pvarresult.toString()) as Int) else 0

public actual fun VarTokenizeFormatString(pstrformat: PCWSTR, rgbtok: Long, cbtok: Int, ifirstday: VARFORMAT_FIRST_DAY, ifirstweek: VARFORMAT_FIRST_WEEK, lcid: UInt, pcbactual: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarTokenizeFormatString(pstrformat.toString(), rgbtok.toString(), cbtok, ifirstday, ifirstweek, lcid.toInt(), pcbactual.toString()) as Int) else 0

public actual fun VarUI1FromBool(boolin: VARIANT_BOOL, pbout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarUI1FromBool(boolin.toInt(), pbout.toString()) as Int) else 0

public actual fun VarUI1FromCy(cyin: CY, pbout: Long): HRESULT =
    0

public actual fun VarUI1FromDate(datein: Double, pbout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarUI1FromDate(datein, pbout.toString()) as Int) else 0

public actual fun VarUI1FromDec(pdecin: Long, pbout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarUI1FromDec(pdecin.toString(), pbout.toString()) as Int) else 0

public actual fun VarUI1FromDisp(pdispin: Long, lcid: UInt, pbout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarUI1FromDisp(pdispin.toString(), lcid.toInt(), pbout.toString()) as Int) else 0

public actual fun VarUI1FromI1(cin: Byte, pbout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarUI1FromI1(cin.toInt(), pbout.toString()) as Int) else 0

public actual fun VarUI1FromI2(sin: Short, pbout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarUI1FromI2(sin.toInt(), pbout.toString()) as Int) else 0

public actual fun VarUI1FromI4(lin: Int, pbout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarUI1FromI4(lin, pbout.toString()) as Int) else 0

public actual fun VarUI1FromI8(i64in: Long, pbout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarUI1FromI8(i64in.toString(), pbout.toString()) as Int) else 0

public actual fun VarUI1FromR4(fltin: Float, pbout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarUI1FromR4(fltin.toDouble(), pbout.toString()) as Int) else 0

public actual fun VarUI1FromR8(dblin: Double, pbout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarUI1FromR8(dblin, pbout.toString()) as Int) else 0

public actual fun VarUI1FromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, pbout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarUI1FromStr(strin.toString(), lcid.toInt(), dwflags.toInt(), pbout.toString()) as Int) else 0

public actual fun VarUI1FromUI2(uiin: UShort, pbout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarUI1FromUI2(uiin.toInt(), pbout.toString()) as Int) else 0

public actual fun VarUI1FromUI4(ulin: UInt, pbout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarUI1FromUI4(ulin.toInt(), pbout.toString()) as Int) else 0

public actual fun VarUI1FromUI8(ui64in: ULong, pbout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarUI1FromUI8(ui64in.toString(), pbout.toString()) as Int) else 0

public actual fun VarUI2FromBool(boolin: VARIANT_BOOL, puiout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarUI2FromBool(boolin.toInt(), puiout.toString()) as Int) else 0

public actual fun VarUI2FromCy(cyin: CY, puiout: Long): HRESULT =
    0

public actual fun VarUI2FromDate(datein: Double, puiout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarUI2FromDate(datein, puiout.toString()) as Int) else 0

public actual fun VarUI2FromDec(pdecin: Long, puiout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarUI2FromDec(pdecin.toString(), puiout.toString()) as Int) else 0

public actual fun VarUI2FromDisp(pdispin: Long, lcid: UInt, puiout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarUI2FromDisp(pdispin.toString(), lcid.toInt(), puiout.toString()) as Int) else 0

public actual fun VarUI2FromI1(cin: Byte, puiout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarUI2FromI1(cin.toInt(), puiout.toString()) as Int) else 0

public actual fun VarUI2FromI2(uiin: Short, puiout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarUI2FromI2(uiin.toInt(), puiout.toString()) as Int) else 0

public actual fun VarUI2FromI4(lin: Int, puiout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarUI2FromI4(lin, puiout.toString()) as Int) else 0

public actual fun VarUI2FromI8(i64in: Long, puiout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarUI2FromI8(i64in.toString(), puiout.toString()) as Int) else 0

public actual fun VarUI2FromR4(fltin: Float, puiout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarUI2FromR4(fltin.toDouble(), puiout.toString()) as Int) else 0

public actual fun VarUI2FromR8(dblin: Double, puiout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarUI2FromR8(dblin, puiout.toString()) as Int) else 0

public actual fun VarUI2FromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, puiout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarUI2FromStr(strin.toString(), lcid.toInt(), dwflags.toInt(), puiout.toString()) as Int) else 0

public actual fun VarUI2FromUI1(bin: UByte, puiout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarUI2FromUI1(bin.toInt(), puiout.toString()) as Int) else 0

public actual fun VarUI2FromUI4(ulin: UInt, puiout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarUI2FromUI4(ulin.toInt(), puiout.toString()) as Int) else 0

public actual fun VarUI2FromUI8(i64in: ULong, puiout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarUI2FromUI8(i64in.toString(), puiout.toString()) as Int) else 0

public actual fun VarUI4FromBool(boolin: VARIANT_BOOL, pulout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarUI4FromBool(boolin.toInt(), pulout.toString()) as Int) else 0

public actual fun VarUI4FromCy(cyin: CY, pulout: Long): HRESULT =
    0

public actual fun VarUI4FromDate(datein: Double, pulout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarUI4FromDate(datein, pulout.toString()) as Int) else 0

public actual fun VarUI4FromDec(pdecin: Long, pulout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarUI4FromDec(pdecin.toString(), pulout.toString()) as Int) else 0

public actual fun VarUI4FromDisp(pdispin: Long, lcid: UInt, pulout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarUI4FromDisp(pdispin.toString(), lcid.toInt(), pulout.toString()) as Int) else 0

public actual fun VarUI4FromI1(cin: Byte, pulout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarUI4FromI1(cin.toInt(), pulout.toString()) as Int) else 0

public actual fun VarUI4FromI2(uiin: Short, pulout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarUI4FromI2(uiin.toInt(), pulout.toString()) as Int) else 0

public actual fun VarUI4FromI4(lin: Int, pulout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarUI4FromI4(lin, pulout.toString()) as Int) else 0

public actual fun VarUI4FromI8(i64in: Long, plout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarUI4FromI8(i64in.toString(), plout.toString()) as Int) else 0

public actual fun VarUI4FromR4(fltin: Float, pulout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarUI4FromR4(fltin.toDouble(), pulout.toString()) as Int) else 0

public actual fun VarUI4FromR8(dblin: Double, pulout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarUI4FromR8(dblin, pulout.toString()) as Int) else 0

public actual fun VarUI4FromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, pulout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarUI4FromStr(strin.toString(), lcid.toInt(), dwflags.toInt(), pulout.toString()) as Int) else 0

public actual fun VarUI4FromUI1(bin: UByte, pulout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarUI4FromUI1(bin.toInt(), pulout.toString()) as Int) else 0

public actual fun VarUI4FromUI2(uiin: UShort, pulout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarUI4FromUI2(uiin.toInt(), pulout.toString()) as Int) else 0

public actual fun VarUI4FromUI8(ui64in: ULong, plout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarUI4FromUI8(ui64in.toString(), plout.toString()) as Int) else 0

public actual fun VarUI8FromBool(boolin: VARIANT_BOOL, pi64out: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarUI8FromBool(boolin.toInt(), pi64out.toString()) as Int) else 0

public actual fun VarUI8FromCy(cyin: CY, pi64out: Long): HRESULT =
    0

public actual fun VarUI8FromDate(datein: Double, pi64out: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarUI8FromDate(datein, pi64out.toString()) as Int) else 0

public actual fun VarUI8FromDec(pdecin: Long, pi64out: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarUI8FromDec(pdecin.toString(), pi64out.toString()) as Int) else 0

public actual fun VarUI8FromDisp(pdispin: Long, lcid: UInt, pi64out: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarUI8FromDisp(pdispin.toString(), lcid.toInt(), pi64out.toString()) as Int) else 0

public actual fun VarUI8FromI1(cin: Byte, pi64out: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarUI8FromI1(cin.toInt(), pi64out.toString()) as Int) else 0

public actual fun VarUI8FromI2(sin: Short, pi64out: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarUI8FromI2(sin.toInt(), pi64out.toString()) as Int) else 0

public actual fun VarUI8FromI8(ui64in: Long, pi64out: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarUI8FromI8(ui64in.toString(), pi64out.toString()) as Int) else 0

public actual fun VarUI8FromR4(fltin: Float, pi64out: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarUI8FromR4(fltin.toDouble(), pi64out.toString()) as Int) else 0

public actual fun VarUI8FromR8(dblin: Double, pi64out: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarUI8FromR8(dblin, pi64out.toString()) as Int) else 0

public actual fun VarUI8FromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, pi64out: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarUI8FromStr(strin.toString(), lcid.toInt(), dwflags.toInt(), pi64out.toString()) as Int) else 0

public actual fun VarUI8FromUI1(bin: UByte, pi64out: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarUI8FromUI1(bin.toInt(), pi64out.toString()) as Int) else 0

public actual fun VarUI8FromUI2(uiin: UShort, pi64out: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarUI8FromUI2(uiin.toInt(), pi64out.toString()) as Int) else 0

public actual fun VarUI8FromUI4(ulin: UInt, pi64out: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarUI8FromUI4(ulin.toInt(), pi64out.toString()) as Int) else 0

public actual fun VarUdateFromDate(datein: Double, dwflags: UInt, pudateout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarUdateFromDate(datein, dwflags.toInt(), pudateout.toString()) as Int) else 0

public actual fun VarWeekdayName(iweekday: Int, fabbrev: Int, ifirstday: Int, dwflags: UInt, pbstrout: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarWeekdayName(iweekday, fabbrev, ifirstday, dwflags.toInt(), pbstrout.toString()) as Int) else 0

public actual fun VarXor(pvarleft: Long, pvarright: Long, pvarresult: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VarXor(pvarleft.toString(), pvarright.toString(), pvarresult.toString()) as Int) else 0

public actual fun VectorFromBstr(bstr: BSTR, ppsa: Long): HRESULT =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_VectorFromBstr(bstr.toString(), ppsa.toString()) as Int) else 0
