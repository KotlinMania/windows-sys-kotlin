@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.ole

import io.github.kotlinmania.windowssys.COpaquePointer
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
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun bstrFromVector(psa: COpaquePointer?, pbstr: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_bstrFromVector(psa?.value?.toCPointer<ByteVar>(), pbstr?.value?.toCPointer<ByteVar>())

public actual fun clearCustData(pcustdata: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_clearCustData(pcustdata?.value?.toCPointer<ByteVar>())
}

public actual fun createDispTypeInfo(pidata: COpaquePointer?, lcid: UInt, pptinfo: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_createDispTypeInfo(pidata?.value?.toCPointer<ByteVar>(), lcid, pptinfo?.value?.toCPointer<ByteVar>())

public actual fun createErrorInfo(pperrinfo: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_createErrorInfo(pperrinfo?.value?.toCPointer<ByteVar>())

public actual fun createOleAdviseHolder(ppoaholder: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_createOleAdviseHolder(ppoaholder?.value?.toCPointer<ByteVar>())

public actual fun createStdDispatch(punkouter: COpaquePointer?, pvthis: COpaquePointer?, ptinfo: COpaquePointer?, ppunkstddisp: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_createStdDispatch(punkouter?.value?.toCPointer<ByteVar>(), pvthis?.value?.toCPointer<ByteVar>(), ptinfo?.value?.toCPointer<ByteVar>(), ppunkstddisp?.value?.toCPointer<ByteVar>())

public actual fun createTypeLib(syskind: Syskind, szfile: Pcwstr, ppctlib: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_createTypeLib(syskind, szfile?.value?.toCPointer<ByteVar>(), ppctlib?.value?.toCPointer<ByteVar>())

public actual fun createTypeLib2(syskind: Syskind, szfile: Pcwstr, ppctlib: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_createTypeLib2(syskind, szfile?.value?.toCPointer<ByteVar>(), ppctlib?.value?.toCPointer<ByteVar>())

public actual fun dispCallFunc(pvinstance: COpaquePointer?, ovft: ULong, cc: Callconv, vtreturn: Varenum, cactuals: UInt, prgvt: COpaquePointer?, prgpvarg: COpaquePointer?, pvargresult: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_dispCallFunc(pvinstance?.value?.toCPointer<ByteVar>(), ovft, cc, vtreturn, cactuals, prgvt?.value?.toCPointer<ByteVar>(), prgpvarg?.value?.toCPointer<ByteVar>(), pvargresult?.value?.toCPointer<ByteVar>())

public actual fun dispGetIDsOfNames(ptinfo: COpaquePointer?, rgsznames: COpaquePointer?, cnames: UInt, rgdispid: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_dispGetIDsOfNames(ptinfo?.value?.toCPointer<ByteVar>(), rgsznames?.value?.toCPointer<ByteVar>(), cnames, rgdispid?.value?.toCPointer<ByteVar>())

public actual fun dispGetParam(pdispparams: COpaquePointer?, position: UInt, vttarg: Varenum, pvarresult: COpaquePointer?, puargerr: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_dispGetParam(pdispparams?.value?.toCPointer<ByteVar>(), position, vttarg, pvarresult?.value?.toCPointer<ByteVar>(), puargerr?.value?.toCPointer<ByteVar>())

public actual fun dispInvoke(thisRef: COpaquePointer?, ptinfo: COpaquePointer?, dispidmember: Int, wflags: UShort, pparams: COpaquePointer?, pvarresult: COpaquePointer?, pexcepinfo: COpaquePointer?, puargerr: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_dispInvoke(thisRef?.value?.toCPointer<ByteVar>(), ptinfo?.value?.toCPointer<ByteVar>(), dispidmember, wflags, pparams?.value?.toCPointer<ByteVar>(), pvarresult?.value?.toCPointer<ByteVar>(), pexcepinfo?.value?.toCPointer<ByteVar>(), puargerr?.value?.toCPointer<ByteVar>())

public actual fun doDragDrop(pdataobj: COpaquePointer?, pdropsource: COpaquePointer?, dwokeffects: Dropeffect, pdweffect: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_doDragDrop(pdataobj?.value?.toCPointer<ByteVar>(), pdropsource?.value?.toCPointer<ByteVar>(), dwokeffects, pdweffect?.value?.toCPointer<ByteVar>())

public actual fun getActiveObject(rclsid: COpaquePointer?, pvreserved: COpaquePointer?, ppunk: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_getActiveObject(rclsid?.value?.toCPointer<ByteVar>(), pvreserved?.value?.toCPointer<ByteVar>(), ppunk?.value?.toCPointer<ByteVar>())

public actual fun getAltMonthNames(lcid: UInt, prgp: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_getAltMonthNames(lcid, prgp?.value?.toCPointer<ByteVar>())

public actual fun getRecordInfoFromGuids(rguidtypelib: COpaquePointer?, uvermajor: UInt, uverminor: UInt, lcid: UInt, rguidtypeinfo: COpaquePointer?, pprecinfo: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_getRecordInfoFromGuids(rguidtypelib?.value?.toCPointer<ByteVar>(), uvermajor, uverminor, lcid, rguidtypeinfo?.value?.toCPointer<ByteVar>(), pprecinfo?.value?.toCPointer<ByteVar>())

public actual fun getRecordInfoFromTypeInfo(ptypeinfo: COpaquePointer?, pprecinfo: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_getRecordInfoFromTypeInfo(ptypeinfo?.value?.toCPointer<ByteVar>(), pprecinfo?.value?.toCPointer<ByteVar>())

public actual fun hrgnUserFree(param0: COpaquePointer?, param1: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_hrgnUserFree(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>())
}

public actual fun hrgnUserFree64(param0: COpaquePointer?, param1: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_hrgnUserFree64(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>())
}

public actual fun hrgnUserMarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_hrgnUserMarshal(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun hrgnUserMarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_hrgnUserMarshal64(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun hrgnUserSize(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_hrgnUserSize(param0?.value?.toCPointer<ByteVar>(), param1, param2?.value?.toCPointer<ByteVar>())

public actual fun hrgnUserSize64(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_hrgnUserSize64(param0?.value?.toCPointer<ByteVar>(), param1, param2?.value?.toCPointer<ByteVar>())

public actual fun hrgnUserUnmarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_hrgnUserUnmarshal(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun hrgnUserUnmarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_hrgnUserUnmarshal64(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun isAccelerator(haccel: Haccel, caccelentries: Int, lpmsg: COpaquePointer?, lpwcmd: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_isAccelerator(haccel?.value?.toCPointer<ByteVar>(), caccelentries, lpmsg?.value?.toCPointer<ByteVar>(), lpwcmd?.value?.toCPointer<ByteVar>())

public actual fun lHashValOfNameSys(syskind: Syskind, lcid: UInt, szname: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_lHashValOfNameSys(syskind, lcid, szname?.value?.toCPointer<ByteVar>())

public actual fun lHashValOfNameSysA(syskind: Syskind, lcid: UInt, szname: Pcstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_lHashValOfNameSysA(syskind, lcid, szname?.value?.toCPointer<ByteVar>())

public actual fun loadRegTypeLib(rguid: COpaquePointer?, wvermajor: UShort, wverminor: UShort, lcid: UInt, pptlib: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_loadRegTypeLib(rguid?.value?.toCPointer<ByteVar>(), wvermajor, wverminor, lcid, pptlib?.value?.toCPointer<ByteVar>())

public actual fun loadTypeLib(szfile: Pcwstr, pptlib: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_loadTypeLib(szfile?.value?.toCPointer<ByteVar>(), pptlib?.value?.toCPointer<ByteVar>())

public actual fun loadTypeLibEx(szfile: Pcwstr, regkind: Regkind, pptlib: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_loadTypeLibEx(szfile?.value?.toCPointer<ByteVar>(), regkind, pptlib?.value?.toCPointer<ByteVar>())

public actual fun oaBuildVersion(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oaBuildVersion()

public actual fun oaEnablePerUserTLibRegistration() {
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oaEnablePerUserTLibRegistration()
}

public actual fun oleBuildVersion(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleBuildVersion()

public actual fun oleConvertOLESTREAMToIStorage2(lpolestream: COpaquePointer?, pstg: COpaquePointer?, ptd: COpaquePointer?, opt: UInt, pvcallbackcontext: COpaquePointer?, pqueryconvertolelinkcallback: Olestreamqueryconvertolelinkcallback): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleConvertOLESTREAMToIStorage2(lpolestream?.value?.toCPointer<ByteVar>(), pstg?.value?.toCPointer<ByteVar>(), ptd?.value?.toCPointer<ByteVar>(), opt, pvcallbackcontext?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun oleConvertOLESTREAMToIStorageEx2(polestm: COpaquePointer?, pstg: COpaquePointer?, pcfformat: COpaquePointer?, plwwidth: COpaquePointer?, plheight: COpaquePointer?, pdwsize: COpaquePointer?, pmedium: COpaquePointer?, opt: UInt, pvcallbackcontext: COpaquePointer?, pqueryconvertolelinkcallback: Olestreamqueryconvertolelinkcallback): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleConvertOLESTREAMToIStorageEx2(polestm?.value?.toCPointer<ByteVar>(), pstg?.value?.toCPointer<ByteVar>(), pcfformat?.value?.toCPointer<ByteVar>(), plwwidth?.value?.toCPointer<ByteVar>(), plheight?.value?.toCPointer<ByteVar>(), pdwsize?.value?.toCPointer<ByteVar>(), pmedium?.value?.toCPointer<ByteVar>(), opt, pvcallbackcontext?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun oleCreate(rclsid: COpaquePointer?, riid: COpaquePointer?, renderopt: UInt, pformatetc: COpaquePointer?, pclientsite: COpaquePointer?, pstg: COpaquePointer?, ppvobj: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleCreate(rclsid?.value?.toCPointer<ByteVar>(), riid?.value?.toCPointer<ByteVar>(), renderopt, pformatetc?.value?.toCPointer<ByteVar>(), pclientsite?.value?.toCPointer<ByteVar>(), pstg?.value?.toCPointer<ByteVar>(), ppvobj?.value?.toCPointer<ByteVar>())

public actual fun oleCreateDefaultHandler(clsid: COpaquePointer?, punkouter: COpaquePointer?, riid: COpaquePointer?, lplpobj: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleCreateDefaultHandler(clsid?.value?.toCPointer<ByteVar>(), punkouter?.value?.toCPointer<ByteVar>(), riid?.value?.toCPointer<ByteVar>(), lplpobj?.value?.toCPointer<ByteVar>())

public actual fun oleCreateEmbeddingHelper(clsid: COpaquePointer?, punkouter: COpaquePointer?, flags: EmbdhlpFlags, pcf: COpaquePointer?, riid: COpaquePointer?, lplpobj: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleCreateEmbeddingHelper(clsid?.value?.toCPointer<ByteVar>(), punkouter?.value?.toCPointer<ByteVar>(), flags, pcf?.value?.toCPointer<ByteVar>(), riid?.value?.toCPointer<ByteVar>(), lplpobj?.value?.toCPointer<ByteVar>())

public actual fun oleCreateEx(rclsid: COpaquePointer?, riid: COpaquePointer?, dwflags: Olecreate, renderopt: UInt, cformats: UInt, rgadvf: COpaquePointer?, rgformatetc: COpaquePointer?, lpadvisesink: COpaquePointer?, rgdwconnection: COpaquePointer?, pclientsite: COpaquePointer?, pstg: COpaquePointer?, ppvobj: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleCreateEx(rclsid?.value?.toCPointer<ByteVar>(), riid?.value?.toCPointer<ByteVar>(), dwflags, renderopt, cformats, rgadvf?.value?.toCPointer<ByteVar>(), rgformatetc?.value?.toCPointer<ByteVar>(), lpadvisesink?.value?.toCPointer<ByteVar>(), rgdwconnection?.value?.toCPointer<ByteVar>(), pclientsite?.value?.toCPointer<ByteVar>(), pstg?.value?.toCPointer<ByteVar>(), ppvobj?.value?.toCPointer<ByteVar>())

public actual fun oleCreateFontIndirect(lpfontdesc: COpaquePointer?, riid: COpaquePointer?, lplpvobj: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleCreateFontIndirect(lpfontdesc?.value?.toCPointer<ByteVar>(), riid?.value?.toCPointer<ByteVar>(), lplpvobj?.value?.toCPointer<ByteVar>())

public actual fun oleCreateFromData(psrcdataobj: COpaquePointer?, riid: COpaquePointer?, renderopt: UInt, pformatetc: COpaquePointer?, pclientsite: COpaquePointer?, pstg: COpaquePointer?, ppvobj: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleCreateFromData(psrcdataobj?.value?.toCPointer<ByteVar>(), riid?.value?.toCPointer<ByteVar>(), renderopt, pformatetc?.value?.toCPointer<ByteVar>(), pclientsite?.value?.toCPointer<ByteVar>(), pstg?.value?.toCPointer<ByteVar>(), ppvobj?.value?.toCPointer<ByteVar>())

public actual fun oleCreateFromDataEx(psrcdataobj: COpaquePointer?, riid: COpaquePointer?, dwflags: Olecreate, renderopt: UInt, cformats: UInt, rgadvf: COpaquePointer?, rgformatetc: COpaquePointer?, lpadvisesink: COpaquePointer?, rgdwconnection: COpaquePointer?, pclientsite: COpaquePointer?, pstg: COpaquePointer?, ppvobj: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleCreateFromDataEx(psrcdataobj?.value?.toCPointer<ByteVar>(), riid?.value?.toCPointer<ByteVar>(), dwflags, renderopt, cformats, rgadvf?.value?.toCPointer<ByteVar>(), rgformatetc?.value?.toCPointer<ByteVar>(), lpadvisesink?.value?.toCPointer<ByteVar>(), rgdwconnection?.value?.toCPointer<ByteVar>(), pclientsite?.value?.toCPointer<ByteVar>(), pstg?.value?.toCPointer<ByteVar>(), ppvobj?.value?.toCPointer<ByteVar>())

public actual fun oleCreateFromFile(rclsid: COpaquePointer?, lpszfilename: Pcwstr, riid: COpaquePointer?, renderopt: UInt, lpformatetc: COpaquePointer?, pclientsite: COpaquePointer?, pstg: COpaquePointer?, ppvobj: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleCreateFromFile(rclsid?.value?.toCPointer<ByteVar>(), lpszfilename?.value?.toCPointer<ByteVar>(), riid?.value?.toCPointer<ByteVar>(), renderopt, lpformatetc?.value?.toCPointer<ByteVar>(), pclientsite?.value?.toCPointer<ByteVar>(), pstg?.value?.toCPointer<ByteVar>(), ppvobj?.value?.toCPointer<ByteVar>())

public actual fun oleCreateFromFileEx(rclsid: COpaquePointer?, lpszfilename: Pcwstr, riid: COpaquePointer?, dwflags: Olecreate, renderopt: UInt, cformats: UInt, rgadvf: COpaquePointer?, rgformatetc: COpaquePointer?, lpadvisesink: COpaquePointer?, rgdwconnection: COpaquePointer?, pclientsite: COpaquePointer?, pstg: COpaquePointer?, ppvobj: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleCreateFromFileEx(rclsid?.value?.toCPointer<ByteVar>(), lpszfilename?.value?.toCPointer<ByteVar>(), riid?.value?.toCPointer<ByteVar>(), dwflags, renderopt, cformats, rgadvf?.value?.toCPointer<ByteVar>(), rgformatetc?.value?.toCPointer<ByteVar>(), lpadvisesink?.value?.toCPointer<ByteVar>(), rgdwconnection?.value?.toCPointer<ByteVar>(), pclientsite?.value?.toCPointer<ByteVar>(), pstg?.value?.toCPointer<ByteVar>(), ppvobj?.value?.toCPointer<ByteVar>())

public actual fun oleCreateLink(pmklinksrc: COpaquePointer?, riid: COpaquePointer?, renderopt: UInt, lpformatetc: COpaquePointer?, pclientsite: COpaquePointer?, pstg: COpaquePointer?, ppvobj: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleCreateLink(pmklinksrc?.value?.toCPointer<ByteVar>(), riid?.value?.toCPointer<ByteVar>(), renderopt, lpformatetc?.value?.toCPointer<ByteVar>(), pclientsite?.value?.toCPointer<ByteVar>(), pstg?.value?.toCPointer<ByteVar>(), ppvobj?.value?.toCPointer<ByteVar>())

public actual fun oleCreateLinkEx(pmklinksrc: COpaquePointer?, riid: COpaquePointer?, dwflags: Olecreate, renderopt: UInt, cformats: UInt, rgadvf: COpaquePointer?, rgformatetc: COpaquePointer?, lpadvisesink: COpaquePointer?, rgdwconnection: COpaquePointer?, pclientsite: COpaquePointer?, pstg: COpaquePointer?, ppvobj: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleCreateLinkEx(pmklinksrc?.value?.toCPointer<ByteVar>(), riid?.value?.toCPointer<ByteVar>(), dwflags, renderopt, cformats, rgadvf?.value?.toCPointer<ByteVar>(), rgformatetc?.value?.toCPointer<ByteVar>(), lpadvisesink?.value?.toCPointer<ByteVar>(), rgdwconnection?.value?.toCPointer<ByteVar>(), pclientsite?.value?.toCPointer<ByteVar>(), pstg?.value?.toCPointer<ByteVar>(), ppvobj?.value?.toCPointer<ByteVar>())

public actual fun oleCreateLinkFromData(psrcdataobj: COpaquePointer?, riid: COpaquePointer?, renderopt: UInt, pformatetc: COpaquePointer?, pclientsite: COpaquePointer?, pstg: COpaquePointer?, ppvobj: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleCreateLinkFromData(psrcdataobj?.value?.toCPointer<ByteVar>(), riid?.value?.toCPointer<ByteVar>(), renderopt, pformatetc?.value?.toCPointer<ByteVar>(), pclientsite?.value?.toCPointer<ByteVar>(), pstg?.value?.toCPointer<ByteVar>(), ppvobj?.value?.toCPointer<ByteVar>())

public actual fun oleCreateLinkFromDataEx(psrcdataobj: COpaquePointer?, riid: COpaquePointer?, dwflags: Olecreate, renderopt: UInt, cformats: UInt, rgadvf: COpaquePointer?, rgformatetc: COpaquePointer?, lpadvisesink: COpaquePointer?, rgdwconnection: COpaquePointer?, pclientsite: COpaquePointer?, pstg: COpaquePointer?, ppvobj: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleCreateLinkFromDataEx(psrcdataobj?.value?.toCPointer<ByteVar>(), riid?.value?.toCPointer<ByteVar>(), dwflags, renderopt, cformats, rgadvf?.value?.toCPointer<ByteVar>(), rgformatetc?.value?.toCPointer<ByteVar>(), lpadvisesink?.value?.toCPointer<ByteVar>(), rgdwconnection?.value?.toCPointer<ByteVar>(), pclientsite?.value?.toCPointer<ByteVar>(), pstg?.value?.toCPointer<ByteVar>(), ppvobj?.value?.toCPointer<ByteVar>())

public actual fun oleCreateLinkToFile(lpszfilename: Pcwstr, riid: COpaquePointer?, renderopt: UInt, lpformatetc: COpaquePointer?, pclientsite: COpaquePointer?, pstg: COpaquePointer?, ppvobj: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleCreateLinkToFile(lpszfilename?.value?.toCPointer<ByteVar>(), riid?.value?.toCPointer<ByteVar>(), renderopt, lpformatetc?.value?.toCPointer<ByteVar>(), pclientsite?.value?.toCPointer<ByteVar>(), pstg?.value?.toCPointer<ByteVar>(), ppvobj?.value?.toCPointer<ByteVar>())

public actual fun oleCreateLinkToFileEx(lpszfilename: Pcwstr, riid: COpaquePointer?, dwflags: Olecreate, renderopt: UInt, cformats: UInt, rgadvf: COpaquePointer?, rgformatetc: COpaquePointer?, lpadvisesink: COpaquePointer?, rgdwconnection: COpaquePointer?, pclientsite: COpaquePointer?, pstg: COpaquePointer?, ppvobj: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleCreateLinkToFileEx(lpszfilename?.value?.toCPointer<ByteVar>(), riid?.value?.toCPointer<ByteVar>(), dwflags, renderopt, cformats, rgadvf?.value?.toCPointer<ByteVar>(), rgformatetc?.value?.toCPointer<ByteVar>(), lpadvisesink?.value?.toCPointer<ByteVar>(), rgdwconnection?.value?.toCPointer<ByteVar>(), pclientsite?.value?.toCPointer<ByteVar>(), pstg?.value?.toCPointer<ByteVar>(), ppvobj?.value?.toCPointer<ByteVar>())

public actual fun oleCreateMenuDescriptor(hmenucombined: Hmenu, lpmenuwidths: COpaquePointer?): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleCreateMenuDescriptor(hmenucombined?.value?.toCPointer<ByteVar>(), lpmenuwidths?.value?.toCPointer<ByteVar>())

public actual fun oleCreatePictureIndirect(lppictdesc: COpaquePointer?, riid: COpaquePointer?, fown: Bool, lplpvobj: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleCreatePictureIndirect(lppictdesc?.value?.toCPointer<ByteVar>(), riid?.value?.toCPointer<ByteVar>(), fown, lplpvobj?.value?.toCPointer<ByteVar>())

public actual fun oleCreatePropertyFrame(hwndowner: Hwnd, x: UInt, y: UInt, lpszcaption: Pcwstr, cobjects: UInt, ppunk: COpaquePointer?, cpages: UInt, ppageclsid: COpaquePointer?, lcid: UInt, dwreserved: UInt, pvreserved: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleCreatePropertyFrame(hwndowner?.value?.toCPointer<ByteVar>(), x, y, lpszcaption?.value?.toCPointer<ByteVar>(), cobjects, ppunk?.value?.toCPointer<ByteVar>(), cpages, ppageclsid?.value?.toCPointer<ByteVar>(), lcid, dwreserved, pvreserved?.value?.toCPointer<ByteVar>())

public actual fun oleCreatePropertyFrameIndirect(lpparams: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleCreatePropertyFrameIndirect(lpparams?.value?.toCPointer<ByteVar>())

public actual fun oleCreateStaticFromData(psrcdataobj: COpaquePointer?, iid: COpaquePointer?, renderopt: UInt, pformatetc: COpaquePointer?, pclientsite: COpaquePointer?, pstg: COpaquePointer?, ppvobj: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleCreateStaticFromData(psrcdataobj?.value?.toCPointer<ByteVar>(), iid?.value?.toCPointer<ByteVar>(), renderopt, pformatetc?.value?.toCPointer<ByteVar>(), pclientsite?.value?.toCPointer<ByteVar>(), pstg?.value?.toCPointer<ByteVar>(), ppvobj?.value?.toCPointer<ByteVar>())

public actual fun oleDestroyMenuDescriptor(holemenu: Long): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleDestroyMenuDescriptor(holemenu)

public actual fun oleDoAutoConvert(pstg: COpaquePointer?, pclsidnew: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleDoAutoConvert(pstg?.value?.toCPointer<ByteVar>(), pclsidnew?.value?.toCPointer<ByteVar>())

public actual fun oleDraw(punknown: COpaquePointer?, dwaspect: UInt, hdcdraw: Hdc, lprcbounds: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleDraw(punknown?.value?.toCPointer<ByteVar>(), dwaspect, hdcdraw?.value?.toCPointer<ByteVar>(), lprcbounds?.value?.toCPointer<ByteVar>())

public actual fun oleDuplicateData(hsrc: Handle, cfformat: ClipboardFormat, uiflags: GlobalAllocFlags): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleDuplicateData(hsrc?.value?.toCPointer<ByteVar>(), cfformat, uiflags)?.let { COpaquePointer(it.toLong()) }

public actual fun oleFlushClipboard(): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleFlushClipboard()

public actual fun oleGetAutoConvert(clsidold: COpaquePointer?, pclsidnew: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleGetAutoConvert(clsidold?.value?.toCPointer<ByteVar>(), pclsidnew?.value?.toCPointer<ByteVar>())

public actual fun oleGetClipboard(ppdataobj: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleGetClipboard(ppdataobj?.value?.toCPointer<ByteVar>())

public actual fun oleGetClipboardWithEnterpriseInfo(dataobject: COpaquePointer?, dataenterpriseid: COpaquePointer?, sourcedescription: COpaquePointer?, targetdescription: COpaquePointer?, datadescription: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleGetClipboardWithEnterpriseInfo(dataobject?.value?.toCPointer<ByteVar>(), dataenterpriseid?.value?.toCPointer<ByteVar>(), sourcedescription?.value?.toCPointer<ByteVar>(), targetdescription?.value?.toCPointer<ByteVar>(), datadescription?.value?.toCPointer<ByteVar>())

public actual fun oleGetIconOfClass(rclsid: COpaquePointer?, lpszlabel: Pcwstr, fusetypeaslabel: Bool): Hglobal =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleGetIconOfClass(rclsid?.value?.toCPointer<ByteVar>(), lpszlabel?.value?.toCPointer<ByteVar>(), fusetypeaslabel)?.let { COpaquePointer(it.toLong()) }

public actual fun oleGetIconOfFile(lpszpath: Pcwstr, fusefileaslabel: Bool): Hglobal =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleGetIconOfFile(lpszpath?.value?.toCPointer<ByteVar>(), fusefileaslabel)?.let { COpaquePointer(it.toLong()) }

public actual fun oleIconToCursor(hinstexe: Hinstance, hicon: Hicon): Hcursor =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleIconToCursor(hinstexe?.value?.toCPointer<ByteVar>(), hicon?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun oleInitialize(pvreserved: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleInitialize(pvreserved?.value?.toCPointer<ByteVar>())

public actual fun oleIsCurrentClipboard(pdataobj: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleIsCurrentClipboard(pdataobj?.value?.toCPointer<ByteVar>())

public actual fun oleIsRunning(pobject: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleIsRunning(pobject?.value?.toCPointer<ByteVar>())

public actual fun oleLoad(pstg: COpaquePointer?, riid: COpaquePointer?, pclientsite: COpaquePointer?, ppvobj: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleLoad(pstg?.value?.toCPointer<ByteVar>(), riid?.value?.toCPointer<ByteVar>(), pclientsite?.value?.toCPointer<ByteVar>(), ppvobj?.value?.toCPointer<ByteVar>())

public actual fun oleLoadFromStream(pstm: COpaquePointer?, iidinterface: COpaquePointer?, ppvobj: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleLoadFromStream(pstm?.value?.toCPointer<ByteVar>(), iidinterface?.value?.toCPointer<ByteVar>(), ppvobj?.value?.toCPointer<ByteVar>())

public actual fun oleLoadPicture(lpstream: COpaquePointer?, lsize: Int, frunmode: Bool, riid: COpaquePointer?, lplpvobj: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleLoadPicture(lpstream?.value?.toCPointer<ByteVar>(), lsize, frunmode, riid?.value?.toCPointer<ByteVar>(), lplpvobj?.value?.toCPointer<ByteVar>())

public actual fun oleLoadPictureEx(lpstream: COpaquePointer?, lsize: Int, frunmode: Bool, riid: COpaquePointer?, xsizedesired: UInt, ysizedesired: UInt, dwflags: LoadPictureFlags, lplpvobj: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleLoadPictureEx(lpstream?.value?.toCPointer<ByteVar>(), lsize, frunmode, riid?.value?.toCPointer<ByteVar>(), xsizedesired, ysizedesired, dwflags, lplpvobj?.value?.toCPointer<ByteVar>())

public actual fun oleLoadPictureFile(varfilename: Variant, lplpdisppicture: COpaquePointer?): Hresult =
    0

public actual fun oleLoadPictureFileEx(varfilename: Variant, xsizedesired: UInt, ysizedesired: UInt, dwflags: LoadPictureFlags, lplpdisppicture: COpaquePointer?): Hresult =
    0

public actual fun oleLoadPicturePath(szurlorpath: Pcwstr, punkcaller: COpaquePointer?, dwreserved: UInt, clrreserved: UInt, riid: COpaquePointer?, ppvret: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleLoadPicturePath(szurlorpath?.value?.toCPointer<ByteVar>(), punkcaller?.value?.toCPointer<ByteVar>(), dwreserved, clrreserved, riid?.value?.toCPointer<ByteVar>(), ppvret?.value?.toCPointer<ByteVar>())

public actual fun oleLockRunning(punknown: COpaquePointer?, flock: Bool, flastunlockcloses: Bool): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleLockRunning(punknown?.value?.toCPointer<ByteVar>(), flock, flastunlockcloses)

public actual fun oleMetafilePictFromIconAndLabel(hicon: Hicon, lpszlabel: Pcwstr, lpszsourcefile: Pcwstr, iiconindex: UInt): Hglobal =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleMetafilePictFromIconAndLabel(hicon?.value?.toCPointer<ByteVar>(), lpszlabel?.value?.toCPointer<ByteVar>(), lpszsourcefile?.value?.toCPointer<ByteVar>(), iiconindex)?.let { COpaquePointer(it.toLong()) }

public actual fun oleNoteObjectVisible(punknown: COpaquePointer?, fvisible: Bool): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleNoteObjectVisible(punknown?.value?.toCPointer<ByteVar>(), fvisible)

public actual fun oleQueryCreateFromData(psrcdataobject: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleQueryCreateFromData(psrcdataobject?.value?.toCPointer<ByteVar>())

public actual fun oleQueryLinkFromData(psrcdataobject: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleQueryLinkFromData(psrcdataobject?.value?.toCPointer<ByteVar>())

public actual fun oleRegEnumFormatEtc(clsid: COpaquePointer?, dwdirection: UInt, ppenum: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleRegEnumFormatEtc(clsid?.value?.toCPointer<ByteVar>(), dwdirection, ppenum?.value?.toCPointer<ByteVar>())

public actual fun oleRegEnumVerbs(clsid: COpaquePointer?, ppenum: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleRegEnumVerbs(clsid?.value?.toCPointer<ByteVar>(), ppenum?.value?.toCPointer<ByteVar>())

public actual fun oleRegGetMiscStatus(clsid: COpaquePointer?, dwaspect: UInt, pdwstatus: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleRegGetMiscStatus(clsid?.value?.toCPointer<ByteVar>(), dwaspect, pdwstatus?.value?.toCPointer<ByteVar>())

public actual fun oleRegGetUserType(clsid: COpaquePointer?, dwformoftype: UInt, pszusertype: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleRegGetUserType(clsid?.value?.toCPointer<ByteVar>(), dwformoftype, pszusertype?.value?.toCPointer<ByteVar>())

public actual fun oleRun(punknown: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleRun(punknown?.value?.toCPointer<ByteVar>())

public actual fun oleSave(pps: COpaquePointer?, pstg: COpaquePointer?, fsameasload: Bool): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleSave(pps?.value?.toCPointer<ByteVar>(), pstg?.value?.toCPointer<ByteVar>(), fsameasload)

public actual fun oleSavePictureFile(lpdisppicture: COpaquePointer?, bstrfilename: Bstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleSavePictureFile(lpdisppicture?.value?.toCPointer<ByteVar>(), bstrfilename?.value?.toCPointer<ByteVar>())

public actual fun oleSaveToStream(ppstm: COpaquePointer?, pstm: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleSaveToStream(ppstm?.value?.toCPointer<ByteVar>(), pstm?.value?.toCPointer<ByteVar>())

public actual fun oleSetAutoConvert(clsidold: COpaquePointer?, clsidnew: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleSetAutoConvert(clsidold?.value?.toCPointer<ByteVar>(), clsidnew?.value?.toCPointer<ByteVar>())

public actual fun oleSetClipboard(pdataobj: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleSetClipboard(pdataobj?.value?.toCPointer<ByteVar>())

public actual fun oleSetContainedObject(punknown: COpaquePointer?, fcontained: Bool): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleSetContainedObject(punknown?.value?.toCPointer<ByteVar>(), fcontained)

public actual fun oleSetMenuDescriptor(holemenu: Long, hwndframe: Hwnd, hwndactiveobject: Hwnd, lpframe: COpaquePointer?, lpactiveobj: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleSetMenuDescriptor(holemenu, hwndframe?.value?.toCPointer<ByteVar>(), hwndactiveobject?.value?.toCPointer<ByteVar>(), lpframe?.value?.toCPointer<ByteVar>(), lpactiveobj?.value?.toCPointer<ByteVar>())

public actual fun oleTranslateAccelerator(lpframe: COpaquePointer?, lpframeinfo: COpaquePointer?, lpmsg: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleTranslateAccelerator(lpframe?.value?.toCPointer<ByteVar>(), lpframeinfo?.value?.toCPointer<ByteVar>(), lpmsg?.value?.toCPointer<ByteVar>())

public actual fun oleTranslateColor(clr: UInt, hpal: Hpalette, lpcolorref: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleTranslateColor(clr, hpal?.value?.toCPointer<ByteVar>(), lpcolorref?.value?.toCPointer<ByteVar>())

public actual fun oleUIAddVerbMenuA(lpoleobj: COpaquePointer?, lpszshorttype: Pcstr, hmenu: Hmenu, upos: UInt, uidverbmin: UInt, uidverbmax: UInt, baddconvert: Bool, idconvert: UInt, lphmenu: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleUIAddVerbMenuA(lpoleobj?.value?.toCPointer<ByteVar>(), lpszshorttype?.value?.toCPointer<ByteVar>(), hmenu?.value?.toCPointer<ByteVar>(), upos, uidverbmin, uidverbmax, baddconvert, idconvert, lphmenu?.value?.toCPointer<ByteVar>())

public actual fun oleUIAddVerbMenuW(lpoleobj: COpaquePointer?, lpszshorttype: Pcwstr, hmenu: Hmenu, upos: UInt, uidverbmin: UInt, uidverbmax: UInt, baddconvert: Bool, idconvert: UInt, lphmenu: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleUIAddVerbMenuW(lpoleobj?.value?.toCPointer<ByteVar>(), lpszshorttype?.value?.toCPointer<ByteVar>(), hmenu?.value?.toCPointer<ByteVar>(), upos, uidverbmin, uidverbmax, baddconvert, idconvert, lphmenu?.value?.toCPointer<ByteVar>())

public actual fun oleUIBusyA(param0: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleUIBusyA(param0?.value?.toCPointer<ByteVar>())

public actual fun oleUIBusyW(param0: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleUIBusyW(param0?.value?.toCPointer<ByteVar>())

public actual fun oleUICanConvertOrActivateAs(rclsid: COpaquePointer?, fislinkedobject: Bool, wformat: UShort): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleUICanConvertOrActivateAs(rclsid?.value?.toCPointer<ByteVar>(), fislinkedobject, wformat)

public actual fun oleUIChangeIconA(param0: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleUIChangeIconA(param0?.value?.toCPointer<ByteVar>())

public actual fun oleUIChangeIconW(param0: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleUIChangeIconW(param0?.value?.toCPointer<ByteVar>())

public actual fun oleUIChangeSourceA(param0: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleUIChangeSourceA(param0?.value?.toCPointer<ByteVar>())

public actual fun oleUIChangeSourceW(param0: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleUIChangeSourceW(param0?.value?.toCPointer<ByteVar>())

public actual fun oleUIConvertA(param0: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleUIConvertA(param0?.value?.toCPointer<ByteVar>())

public actual fun oleUIConvertW(param0: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleUIConvertW(param0?.value?.toCPointer<ByteVar>())

public actual fun oleUIEditLinksA(param0: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleUIEditLinksA(param0?.value?.toCPointer<ByteVar>())

public actual fun oleUIEditLinksW(param0: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleUIEditLinksW(param0?.value?.toCPointer<ByteVar>())

public actual fun oleUIInsertObjectA(param0: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleUIInsertObjectA(param0?.value?.toCPointer<ByteVar>())

public actual fun oleUIInsertObjectW(param0: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleUIInsertObjectW(param0?.value?.toCPointer<ByteVar>())

public actual fun oleUIObjectPropertiesA(param0: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleUIObjectPropertiesA(param0?.value?.toCPointer<ByteVar>())

public actual fun oleUIObjectPropertiesW(param0: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleUIObjectPropertiesW(param0?.value?.toCPointer<ByteVar>())

public actual fun oleUIPasteSpecialA(param0: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleUIPasteSpecialA(param0?.value?.toCPointer<ByteVar>())

public actual fun oleUIPasteSpecialW(param0: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleUIPasteSpecialW(param0?.value?.toCPointer<ByteVar>())

public actual fun oleUIPromptUserA(ntemplate: Int, hwndparent: Hwnd, vararg variadicArgs: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleUIPromptUserA(ntemplate, hwndparent?.value?.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun oleUIPromptUserW(ntemplate: Int, hwndparent: Hwnd, vararg variadicArgs: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleUIPromptUserW(ntemplate, hwndparent?.value?.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun oleUIUpdateLinksA(lpoleuilinkcntr: COpaquePointer?, hwndparent: Hwnd, lpsztitle: Pcstr, clinks: Int): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleUIUpdateLinksA(lpoleuilinkcntr?.value?.toCPointer<ByteVar>(), hwndparent?.value?.toCPointer<ByteVar>(), lpsztitle?.value?.toCPointer<ByteVar>(), clinks)

public actual fun oleUIUpdateLinksW(lpoleuilinkcntr: COpaquePointer?, hwndparent: Hwnd, lpsztitle: Pcwstr, clinks: Int): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleUIUpdateLinksW(lpoleuilinkcntr?.value?.toCPointer<ByteVar>(), hwndparent?.value?.toCPointer<ByteVar>(), lpsztitle?.value?.toCPointer<ByteVar>(), clinks)

public actual fun oleUninitialize() {
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_oleUninitialize()
}

public actual fun queryPathOfRegTypeLib(guid: COpaquePointer?, wmaj: UShort, wmin: UShort, lcid: UInt, lpbstrpathname: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_queryPathOfRegTypeLib(guid?.value?.toCPointer<ByteVar>(), wmaj, wmin, lcid, lpbstrpathname?.value?.toCPointer<ByteVar>())

public actual fun registerActiveObject(punk: COpaquePointer?, rclsid: COpaquePointer?, dwflags: ActiveobjectFlags, pdwregister: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_registerActiveObject(punk?.value?.toCPointer<ByteVar>(), rclsid?.value?.toCPointer<ByteVar>(), dwflags, pdwregister?.value?.toCPointer<ByteVar>())

public actual fun registerDragDrop(hwnd: Hwnd, pdroptarget: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_registerDragDrop(hwnd?.value?.toCPointer<ByteVar>(), pdroptarget?.value?.toCPointer<ByteVar>())

public actual fun registerTypeLib(ptlib: COpaquePointer?, szfullpath: Pcwstr, szhelpdir: Pcwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_registerTypeLib(ptlib?.value?.toCPointer<ByteVar>(), szfullpath?.value?.toCPointer<ByteVar>(), szhelpdir?.value?.toCPointer<ByteVar>())

public actual fun registerTypeLibForUser(ptlib: COpaquePointer?, szfullpath: Pcwstr, szhelpdir: Pcwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_registerTypeLibForUser(ptlib?.value?.toCPointer<ByteVar>(), szfullpath?.value?.toCPointer<ByteVar>(), szhelpdir?.value?.toCPointer<ByteVar>())

public actual fun releaseStgMedium(param0: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_releaseStgMedium(param0?.value?.toCPointer<ByteVar>())
}

public actual fun revokeActiveObject(dwregister: UInt, pvreserved: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_revokeActiveObject(dwregister, pvreserved?.value?.toCPointer<ByteVar>())

public actual fun revokeDragDrop(hwnd: Hwnd): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_revokeDragDrop(hwnd?.value?.toCPointer<ByteVar>())

public actual fun safeArrayAccessData(psa: COpaquePointer?, ppvdata: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_safeArrayAccessData(psa?.value?.toCPointer<ByteVar>(), ppvdata?.value?.toCPointer<ByteVar>())

public actual fun safeArrayAddRef(psa: COpaquePointer?, ppdatatorelease: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_safeArrayAddRef(psa?.value?.toCPointer<ByteVar>(), ppdatatorelease?.value?.toCPointer<ByteVar>())

public actual fun safeArrayAllocData(psa: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_safeArrayAllocData(psa?.value?.toCPointer<ByteVar>())

public actual fun safeArrayAllocDescriptor(cdims: UInt, ppsaout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_safeArrayAllocDescriptor(cdims, ppsaout?.value?.toCPointer<ByteVar>())

public actual fun safeArrayAllocDescriptorEx(vt: Varenum, cdims: UInt, ppsaout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_safeArrayAllocDescriptorEx(vt, cdims, ppsaout?.value?.toCPointer<ByteVar>())

public actual fun safeArrayCopy(psa: COpaquePointer?, ppsaout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_safeArrayCopy(psa?.value?.toCPointer<ByteVar>(), ppsaout?.value?.toCPointer<ByteVar>())

public actual fun safeArrayCopyData(psasource: COpaquePointer?, psatarget: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_safeArrayCopyData(psasource?.value?.toCPointer<ByteVar>(), psatarget?.value?.toCPointer<ByteVar>())

public actual fun safeArrayCreate(vt: Varenum, cdims: UInt, rgsabound: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_safeArrayCreate(vt, cdims, rgsabound?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun safeArrayCreateEx(vt: Varenum, cdims: UInt, rgsabound: COpaquePointer?, pvextra: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_safeArrayCreateEx(vt, cdims, rgsabound?.value?.toCPointer<ByteVar>(), pvextra?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun safeArrayCreateVector(vt: Varenum, llbound: Int, celements: UInt): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_safeArrayCreateVector(vt, llbound, celements)?.let { COpaquePointer(it.toLong()) }

public actual fun safeArrayCreateVectorEx(vt: Varenum, llbound: Int, celements: UInt, pvextra: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_safeArrayCreateVectorEx(vt, llbound, celements, pvextra?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun safeArrayDestroy(psa: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_safeArrayDestroy(psa?.value?.toCPointer<ByteVar>())

public actual fun safeArrayDestroyData(psa: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_safeArrayDestroyData(psa?.value?.toCPointer<ByteVar>())

public actual fun safeArrayDestroyDescriptor(psa: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_safeArrayDestroyDescriptor(psa?.value?.toCPointer<ByteVar>())

public actual fun safeArrayGetDim(psa: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_safeArrayGetDim(psa?.value?.toCPointer<ByteVar>())

public actual fun safeArrayGetElement(psa: COpaquePointer?, rgindices: COpaquePointer?, pv: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_safeArrayGetElement(psa?.value?.toCPointer<ByteVar>(), rgindices?.value?.toCPointer<ByteVar>(), pv?.value?.toCPointer<ByteVar>())

public actual fun safeArrayGetElemsize(psa: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_safeArrayGetElemsize(psa?.value?.toCPointer<ByteVar>())

public actual fun safeArrayGetIID(psa: COpaquePointer?, pguid: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_safeArrayGetIID(psa?.value?.toCPointer<ByteVar>(), pguid?.value?.toCPointer<ByteVar>())

public actual fun safeArrayGetLBound(psa: COpaquePointer?, ndim: UInt, pllbound: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_safeArrayGetLBound(psa?.value?.toCPointer<ByteVar>(), ndim, pllbound?.value?.toCPointer<ByteVar>())

public actual fun safeArrayGetRecordInfo(psa: COpaquePointer?, prinfo: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_safeArrayGetRecordInfo(psa?.value?.toCPointer<ByteVar>(), prinfo?.value?.toCPointer<ByteVar>())

public actual fun safeArrayGetUBound(psa: COpaquePointer?, ndim: UInt, plubound: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_safeArrayGetUBound(psa?.value?.toCPointer<ByteVar>(), ndim, plubound?.value?.toCPointer<ByteVar>())

public actual fun safeArrayGetVartype(psa: COpaquePointer?, pvt: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_safeArrayGetVartype(psa?.value?.toCPointer<ByteVar>(), pvt?.value?.toCPointer<ByteVar>())

public actual fun safeArrayLock(psa: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_safeArrayLock(psa?.value?.toCPointer<ByteVar>())

public actual fun safeArrayPtrOfIndex(psa: COpaquePointer?, rgindices: COpaquePointer?, ppvdata: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_safeArrayPtrOfIndex(psa?.value?.toCPointer<ByteVar>(), rgindices?.value?.toCPointer<ByteVar>(), ppvdata?.value?.toCPointer<ByteVar>())

public actual fun safeArrayPutElement(psa: COpaquePointer?, rgindices: COpaquePointer?, pv: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_safeArrayPutElement(psa?.value?.toCPointer<ByteVar>(), rgindices?.value?.toCPointer<ByteVar>(), pv?.value?.toCPointer<ByteVar>())

public actual fun safeArrayRedim(psa: COpaquePointer?, psaboundnew: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_safeArrayRedim(psa?.value?.toCPointer<ByteVar>(), psaboundnew?.value?.toCPointer<ByteVar>())

public actual fun safeArrayReleaseData(pdata: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_safeArrayReleaseData(pdata?.value?.toCPointer<ByteVar>())
}

public actual fun safeArrayReleaseDescriptor(psa: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_safeArrayReleaseDescriptor(psa?.value?.toCPointer<ByteVar>())
}

public actual fun safeArraySetIID(psa: COpaquePointer?, guid: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_safeArraySetIID(psa?.value?.toCPointer<ByteVar>(), guid?.value?.toCPointer<ByteVar>())

public actual fun safeArraySetRecordInfo(psa: COpaquePointer?, prinfo: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_safeArraySetRecordInfo(psa?.value?.toCPointer<ByteVar>(), prinfo?.value?.toCPointer<ByteVar>())

public actual fun safeArrayUnaccessData(psa: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_safeArrayUnaccessData(psa?.value?.toCPointer<ByteVar>())

public actual fun safeArrayUnlock(psa: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_safeArrayUnlock(psa?.value?.toCPointer<ByteVar>())

public actual fun unRegisterTypeLib(libid: COpaquePointer?, wvermajor: UShort, wverminor: UShort, lcid: UInt, syskind: Syskind): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_unRegisterTypeLib(libid?.value?.toCPointer<ByteVar>(), wvermajor, wverminor, lcid, syskind)

public actual fun unRegisterTypeLibForUser(libid: COpaquePointer?, wmajorvernum: UShort, wminorvernum: UShort, lcid: UInt, syskind: Syskind): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_unRegisterTypeLibForUser(libid?.value?.toCPointer<ByteVar>(), wmajorvernum, wminorvernum, lcid, syskind)

public actual fun varAbs(pvarin: COpaquePointer?, pvarresult: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varAbs(pvarin?.value?.toCPointer<ByteVar>(), pvarresult?.value?.toCPointer<ByteVar>())

public actual fun varAdd(pvarleft: COpaquePointer?, pvarright: COpaquePointer?, pvarresult: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varAdd(pvarleft?.value?.toCPointer<ByteVar>(), pvarright?.value?.toCPointer<ByteVar>(), pvarresult?.value?.toCPointer<ByteVar>())

public actual fun varAnd(pvarleft: COpaquePointer?, pvarright: COpaquePointer?, pvarresult: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varAnd(pvarleft?.value?.toCPointer<ByteVar>(), pvarright?.value?.toCPointer<ByteVar>(), pvarresult?.value?.toCPointer<ByteVar>())

public actual fun varBoolFromCy(cyin: CY, pboolout: COpaquePointer?): Hresult =
    0

public actual fun varBoolFromDate(datein: Double, pboolout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varBoolFromDate(datein, pboolout?.value?.toCPointer<ByteVar>())

public actual fun varBoolFromDec(pdecin: COpaquePointer?, pboolout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varBoolFromDec(pdecin?.value?.toCPointer<ByteVar>(), pboolout?.value?.toCPointer<ByteVar>())

public actual fun varBoolFromDisp(pdispin: COpaquePointer?, lcid: UInt, pboolout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varBoolFromDisp(pdispin?.value?.toCPointer<ByteVar>(), lcid, pboolout?.value?.toCPointer<ByteVar>())

public actual fun varBoolFromI1(cin: Byte, pboolout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varBoolFromI1(cin, pboolout?.value?.toCPointer<ByteVar>())

public actual fun varBoolFromI2(sin: Short, pboolout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varBoolFromI2(sin, pboolout?.value?.toCPointer<ByteVar>())

public actual fun varBoolFromI4(lin: Int, pboolout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varBoolFromI4(lin, pboolout?.value?.toCPointer<ByteVar>())

public actual fun varBoolFromI8(i64in: Long, pboolout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varBoolFromI8(i64in, pboolout?.value?.toCPointer<ByteVar>())

public actual fun varBoolFromR4(fltin: Float, pboolout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varBoolFromR4(fltin, pboolout?.value?.toCPointer<ByteVar>())

public actual fun varBoolFromR8(dblin: Double, pboolout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varBoolFromR8(dblin, pboolout?.value?.toCPointer<ByteVar>())

public actual fun varBoolFromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pboolout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varBoolFromStr(strin?.value?.toCPointer<ByteVar>(), lcid, dwflags, pboolout?.value?.toCPointer<ByteVar>())

public actual fun varBoolFromUI1(bin: UByte, pboolout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varBoolFromUI1(bin, pboolout?.value?.toCPointer<ByteVar>())

public actual fun varBoolFromUI2(uiin: UShort, pboolout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varBoolFromUI2(uiin, pboolout?.value?.toCPointer<ByteVar>())

public actual fun varBoolFromUI4(ulin: UInt, pboolout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varBoolFromUI4(ulin, pboolout?.value?.toCPointer<ByteVar>())

public actual fun varBoolFromUI8(i64in: ULong, pboolout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varBoolFromUI8(i64in, pboolout?.value?.toCPointer<ByteVar>())

public actual fun varBstrCat(bstrleft: Bstr, bstrright: Bstr, pbstrresult: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varBstrCat(bstrleft?.value?.toCPointer<ByteVar>(), bstrright?.value?.toCPointer<ByteVar>(), pbstrresult?.value?.toCPointer<ByteVar>())

public actual fun varBstrCmp(bstrleft: Bstr, bstrright: Bstr, lcid: UInt, dwflags: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varBstrCmp(bstrleft?.value?.toCPointer<ByteVar>(), bstrright?.value?.toCPointer<ByteVar>(), lcid, dwflags)

public actual fun varBstrFromBool(boolin: VariantBool, lcid: UInt, dwflags: UInt, pbstrout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varBstrFromBool(boolin, lcid, dwflags, pbstrout?.value?.toCPointer<ByteVar>())

public actual fun varBstrFromCy(cyin: CY, lcid: UInt, dwflags: UInt, pbstrout: COpaquePointer?): Hresult =
    0

public actual fun varBstrFromDate(datein: Double, lcid: UInt, dwflags: UInt, pbstrout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varBstrFromDate(datein, lcid, dwflags, pbstrout?.value?.toCPointer<ByteVar>())

public actual fun varBstrFromDec(pdecin: COpaquePointer?, lcid: UInt, dwflags: UInt, pbstrout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varBstrFromDec(pdecin?.value?.toCPointer<ByteVar>(), lcid, dwflags, pbstrout?.value?.toCPointer<ByteVar>())

public actual fun varBstrFromDisp(pdispin: COpaquePointer?, lcid: UInt, dwflags: UInt, pbstrout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varBstrFromDisp(pdispin?.value?.toCPointer<ByteVar>(), lcid, dwflags, pbstrout?.value?.toCPointer<ByteVar>())

public actual fun varBstrFromI1(cin: Byte, lcid: UInt, dwflags: UInt, pbstrout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varBstrFromI1(cin, lcid, dwflags, pbstrout?.value?.toCPointer<ByteVar>())

public actual fun varBstrFromI2(ival: Short, lcid: UInt, dwflags: UInt, pbstrout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varBstrFromI2(ival, lcid, dwflags, pbstrout?.value?.toCPointer<ByteVar>())

public actual fun varBstrFromI4(lin: Int, lcid: UInt, dwflags: UInt, pbstrout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varBstrFromI4(lin, lcid, dwflags, pbstrout?.value?.toCPointer<ByteVar>())

public actual fun varBstrFromI8(i64in: Long, lcid: UInt, dwflags: UInt, pbstrout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varBstrFromI8(i64in, lcid, dwflags, pbstrout?.value?.toCPointer<ByteVar>())

public actual fun varBstrFromR4(fltin: Float, lcid: UInt, dwflags: UInt, pbstrout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varBstrFromR4(fltin, lcid, dwflags, pbstrout?.value?.toCPointer<ByteVar>())

public actual fun varBstrFromR8(dblin: Double, lcid: UInt, dwflags: UInt, pbstrout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varBstrFromR8(dblin, lcid, dwflags, pbstrout?.value?.toCPointer<ByteVar>())

public actual fun varBstrFromUI1(bval: UByte, lcid: UInt, dwflags: UInt, pbstrout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varBstrFromUI1(bval, lcid, dwflags, pbstrout?.value?.toCPointer<ByteVar>())

public actual fun varBstrFromUI2(uiin: UShort, lcid: UInt, dwflags: UInt, pbstrout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varBstrFromUI2(uiin, lcid, dwflags, pbstrout?.value?.toCPointer<ByteVar>())

public actual fun varBstrFromUI4(ulin: UInt, lcid: UInt, dwflags: UInt, pbstrout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varBstrFromUI4(ulin, lcid, dwflags, pbstrout?.value?.toCPointer<ByteVar>())

public actual fun varBstrFromUI8(ui64in: ULong, lcid: UInt, dwflags: UInt, pbstrout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varBstrFromUI8(ui64in, lcid, dwflags, pbstrout?.value?.toCPointer<ByteVar>())

public actual fun varCat(pvarleft: COpaquePointer?, pvarright: COpaquePointer?, pvarresult: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varCat(pvarleft?.value?.toCPointer<ByteVar>(), pvarright?.value?.toCPointer<ByteVar>(), pvarresult?.value?.toCPointer<ByteVar>())

public actual fun varCmp(pvarleft: COpaquePointer?, pvarright: COpaquePointer?, lcid: UInt, dwflags: UInt): Varcmp =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varCmp(pvarleft?.value?.toCPointer<ByteVar>(), pvarright?.value?.toCPointer<ByteVar>(), lcid, dwflags)

public actual fun varCyAbs(cyin: CY, pcyresult: COpaquePointer?): Hresult =
    0

public actual fun varCyAdd(cyleft: CY, cyright: CY, pcyresult: COpaquePointer?): Hresult =
    0

public actual fun varCyCmp(cyleft: CY, cyright: CY): Varcmp =
    0u

public actual fun varCyCmpR8(cyleft: CY, dblright: Double): Varcmp =
    0u

public actual fun varCyFix(cyin: CY, pcyresult: COpaquePointer?): Hresult =
    0

public actual fun varCyFromBool(boolin: VariantBool, pcyout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varCyFromBool(boolin, pcyout?.value?.toCPointer<ByteVar>())

public actual fun varCyFromDate(datein: Double, pcyout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varCyFromDate(datein, pcyout?.value?.toCPointer<ByteVar>())

public actual fun varCyFromDec(pdecin: COpaquePointer?, pcyout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varCyFromDec(pdecin?.value?.toCPointer<ByteVar>(), pcyout?.value?.toCPointer<ByteVar>())

public actual fun varCyFromDisp(pdispin: COpaquePointer?, lcid: UInt, pcyout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varCyFromDisp(pdispin?.value?.toCPointer<ByteVar>(), lcid, pcyout?.value?.toCPointer<ByteVar>())

public actual fun varCyFromI1(cin: Byte, pcyout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varCyFromI1(cin, pcyout?.value?.toCPointer<ByteVar>())

public actual fun varCyFromI2(sin: Short, pcyout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varCyFromI2(sin, pcyout?.value?.toCPointer<ByteVar>())

public actual fun varCyFromI4(lin: Int, pcyout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varCyFromI4(lin, pcyout?.value?.toCPointer<ByteVar>())

public actual fun varCyFromI8(i64in: Long, pcyout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varCyFromI8(i64in, pcyout?.value?.toCPointer<ByteVar>())

public actual fun varCyFromR4(fltin: Float, pcyout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varCyFromR4(fltin, pcyout?.value?.toCPointer<ByteVar>())

public actual fun varCyFromR8(dblin: Double, pcyout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varCyFromR8(dblin, pcyout?.value?.toCPointer<ByteVar>())

public actual fun varCyFromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pcyout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varCyFromStr(strin?.value?.toCPointer<ByteVar>(), lcid, dwflags, pcyout?.value?.toCPointer<ByteVar>())

public actual fun varCyFromUI1(bin: UByte, pcyout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varCyFromUI1(bin, pcyout?.value?.toCPointer<ByteVar>())

public actual fun varCyFromUI2(uiin: UShort, pcyout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varCyFromUI2(uiin, pcyout?.value?.toCPointer<ByteVar>())

public actual fun varCyFromUI4(ulin: UInt, pcyout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varCyFromUI4(ulin, pcyout?.value?.toCPointer<ByteVar>())

public actual fun varCyFromUI8(ui64in: ULong, pcyout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varCyFromUI8(ui64in, pcyout?.value?.toCPointer<ByteVar>())

public actual fun varCyInt(cyin: CY, pcyresult: COpaquePointer?): Hresult =
    0

public actual fun varCyMul(cyleft: CY, cyright: CY, pcyresult: COpaquePointer?): Hresult =
    0

public actual fun varCyMulI4(cyleft: CY, lright: Int, pcyresult: COpaquePointer?): Hresult =
    0

public actual fun varCyMulI8(cyleft: CY, lright: Long, pcyresult: COpaquePointer?): Hresult =
    0

public actual fun varCyNeg(cyin: CY, pcyresult: COpaquePointer?): Hresult =
    0

public actual fun varCyRound(cyin: CY, cdecimals: Int, pcyresult: COpaquePointer?): Hresult =
    0

public actual fun varCySub(cyleft: CY, cyright: CY, pcyresult: COpaquePointer?): Hresult =
    0

public actual fun varDateFromBool(boolin: VariantBool, pdateout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varDateFromBool(boolin, pdateout?.value?.toCPointer<ByteVar>())

public actual fun varDateFromCy(cyin: CY, pdateout: COpaquePointer?): Hresult =
    0

public actual fun varDateFromDec(pdecin: COpaquePointer?, pdateout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varDateFromDec(pdecin?.value?.toCPointer<ByteVar>(), pdateout?.value?.toCPointer<ByteVar>())

public actual fun varDateFromDisp(pdispin: COpaquePointer?, lcid: UInt, pdateout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varDateFromDisp(pdispin?.value?.toCPointer<ByteVar>(), lcid, pdateout?.value?.toCPointer<ByteVar>())

public actual fun varDateFromI1(cin: Byte, pdateout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varDateFromI1(cin, pdateout?.value?.toCPointer<ByteVar>())

public actual fun varDateFromI2(sin: Short, pdateout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varDateFromI2(sin, pdateout?.value?.toCPointer<ByteVar>())

public actual fun varDateFromI4(lin: Int, pdateout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varDateFromI4(lin, pdateout?.value?.toCPointer<ByteVar>())

public actual fun varDateFromI8(i64in: Long, pdateout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varDateFromI8(i64in, pdateout?.value?.toCPointer<ByteVar>())

public actual fun varDateFromR4(fltin: Float, pdateout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varDateFromR4(fltin, pdateout?.value?.toCPointer<ByteVar>())

public actual fun varDateFromR8(dblin: Double, pdateout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varDateFromR8(dblin, pdateout?.value?.toCPointer<ByteVar>())

public actual fun varDateFromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pdateout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varDateFromStr(strin?.value?.toCPointer<ByteVar>(), lcid, dwflags, pdateout?.value?.toCPointer<ByteVar>())

public actual fun varDateFromUI1(bin: UByte, pdateout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varDateFromUI1(bin, pdateout?.value?.toCPointer<ByteVar>())

public actual fun varDateFromUI2(uiin: UShort, pdateout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varDateFromUI2(uiin, pdateout?.value?.toCPointer<ByteVar>())

public actual fun varDateFromUI4(ulin: UInt, pdateout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varDateFromUI4(ulin, pdateout?.value?.toCPointer<ByteVar>())

public actual fun varDateFromUI8(ui64in: ULong, pdateout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varDateFromUI8(ui64in, pdateout?.value?.toCPointer<ByteVar>())

public actual fun varDateFromUdate(pudatein: COpaquePointer?, dwflags: UInt, pdateout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varDateFromUdate(pudatein?.value?.toCPointer<ByteVar>(), dwflags, pdateout?.value?.toCPointer<ByteVar>())

public actual fun varDateFromUdateEx(pudatein: COpaquePointer?, lcid: UInt, dwflags: UInt, pdateout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varDateFromUdateEx(pudatein?.value?.toCPointer<ByteVar>(), lcid, dwflags, pdateout?.value?.toCPointer<ByteVar>())

public actual fun varDecAbs(pdecin: COpaquePointer?, pdecresult: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varDecAbs(pdecin?.value?.toCPointer<ByteVar>(), pdecresult?.value?.toCPointer<ByteVar>())

public actual fun varDecAdd(pdecleft: COpaquePointer?, pdecright: COpaquePointer?, pdecresult: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varDecAdd(pdecleft?.value?.toCPointer<ByteVar>(), pdecright?.value?.toCPointer<ByteVar>(), pdecresult?.value?.toCPointer<ByteVar>())

public actual fun varDecCmp(pdecleft: COpaquePointer?, pdecright: COpaquePointer?): Varcmp =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varDecCmp(pdecleft?.value?.toCPointer<ByteVar>(), pdecright?.value?.toCPointer<ByteVar>())

public actual fun varDecCmpR8(pdecleft: COpaquePointer?, dblright: Double): Varcmp =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varDecCmpR8(pdecleft?.value?.toCPointer<ByteVar>(), dblright)

public actual fun varDecDiv(pdecleft: COpaquePointer?, pdecright: COpaquePointer?, pdecresult: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varDecDiv(pdecleft?.value?.toCPointer<ByteVar>(), pdecright?.value?.toCPointer<ByteVar>(), pdecresult?.value?.toCPointer<ByteVar>())

public actual fun varDecFix(pdecin: COpaquePointer?, pdecresult: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varDecFix(pdecin?.value?.toCPointer<ByteVar>(), pdecresult?.value?.toCPointer<ByteVar>())

public actual fun varDecFromBool(boolin: VariantBool, pdecout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varDecFromBool(boolin, pdecout?.value?.toCPointer<ByteVar>())

public actual fun varDecFromCy(cyin: CY, pdecout: COpaquePointer?): Hresult =
    0

public actual fun varDecFromDate(datein: Double, pdecout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varDecFromDate(datein, pdecout?.value?.toCPointer<ByteVar>())

public actual fun varDecFromDisp(pdispin: COpaquePointer?, lcid: UInt, pdecout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varDecFromDisp(pdispin?.value?.toCPointer<ByteVar>(), lcid, pdecout?.value?.toCPointer<ByteVar>())

public actual fun varDecFromI1(cin: Byte, pdecout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varDecFromI1(cin, pdecout?.value?.toCPointer<ByteVar>())

public actual fun varDecFromI2(uiin: Short, pdecout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varDecFromI2(uiin, pdecout?.value?.toCPointer<ByteVar>())

public actual fun varDecFromI4(lin: Int, pdecout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varDecFromI4(lin, pdecout?.value?.toCPointer<ByteVar>())

public actual fun varDecFromI8(i64in: Long, pdecout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varDecFromI8(i64in, pdecout?.value?.toCPointer<ByteVar>())

public actual fun varDecFromR4(fltin: Float, pdecout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varDecFromR4(fltin, pdecout?.value?.toCPointer<ByteVar>())

public actual fun varDecFromR8(dblin: Double, pdecout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varDecFromR8(dblin, pdecout?.value?.toCPointer<ByteVar>())

public actual fun varDecFromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pdecout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varDecFromStr(strin?.value?.toCPointer<ByteVar>(), lcid, dwflags, pdecout?.value?.toCPointer<ByteVar>())

public actual fun varDecFromUI1(bin: UByte, pdecout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varDecFromUI1(bin, pdecout?.value?.toCPointer<ByteVar>())

public actual fun varDecFromUI2(uiin: UShort, pdecout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varDecFromUI2(uiin, pdecout?.value?.toCPointer<ByteVar>())

public actual fun varDecFromUI4(ulin: UInt, pdecout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varDecFromUI4(ulin, pdecout?.value?.toCPointer<ByteVar>())

public actual fun varDecFromUI8(ui64in: ULong, pdecout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varDecFromUI8(ui64in, pdecout?.value?.toCPointer<ByteVar>())

public actual fun varDecInt(pdecin: COpaquePointer?, pdecresult: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varDecInt(pdecin?.value?.toCPointer<ByteVar>(), pdecresult?.value?.toCPointer<ByteVar>())

public actual fun varDecMul(pdecleft: COpaquePointer?, pdecright: COpaquePointer?, pdecresult: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varDecMul(pdecleft?.value?.toCPointer<ByteVar>(), pdecright?.value?.toCPointer<ByteVar>(), pdecresult?.value?.toCPointer<ByteVar>())

public actual fun varDecNeg(pdecin: COpaquePointer?, pdecresult: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varDecNeg(pdecin?.value?.toCPointer<ByteVar>(), pdecresult?.value?.toCPointer<ByteVar>())

public actual fun varDecRound(pdecin: COpaquePointer?, cdecimals: Int, pdecresult: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varDecRound(pdecin?.value?.toCPointer<ByteVar>(), cdecimals, pdecresult?.value?.toCPointer<ByteVar>())

public actual fun varDecSub(pdecleft: COpaquePointer?, pdecright: COpaquePointer?, pdecresult: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varDecSub(pdecleft?.value?.toCPointer<ByteVar>(), pdecright?.value?.toCPointer<ByteVar>(), pdecresult?.value?.toCPointer<ByteVar>())

public actual fun varDiv(pvarleft: COpaquePointer?, pvarright: COpaquePointer?, pvarresult: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varDiv(pvarleft?.value?.toCPointer<ByteVar>(), pvarright?.value?.toCPointer<ByteVar>(), pvarresult?.value?.toCPointer<ByteVar>())

public actual fun varEqv(pvarleft: COpaquePointer?, pvarright: COpaquePointer?, pvarresult: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varEqv(pvarleft?.value?.toCPointer<ByteVar>(), pvarright?.value?.toCPointer<ByteVar>(), pvarresult?.value?.toCPointer<ByteVar>())

public actual fun varFix(pvarin: COpaquePointer?, pvarresult: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varFix(pvarin?.value?.toCPointer<ByteVar>(), pvarresult?.value?.toCPointer<ByteVar>())

public actual fun varFormat(pvarin: COpaquePointer?, pstrformat: Pcwstr, ifirstday: VarformatFirstDay, ifirstweek: VarformatFirstWeek, dwflags: UInt, pbstrout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varFormat(pvarin?.value?.toCPointer<ByteVar>(), pstrformat?.value?.toCPointer<ByteVar>(), ifirstday, ifirstweek, dwflags, pbstrout?.value?.toCPointer<ByteVar>())

public actual fun varFormatCurrency(pvarin: COpaquePointer?, inumdig: Int, iinclead: Int, iuseparens: Int, igroup: Int, dwflags: UInt, pbstrout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varFormatCurrency(pvarin?.value?.toCPointer<ByteVar>(), inumdig, iinclead, iuseparens, igroup, dwflags, pbstrout?.value?.toCPointer<ByteVar>())

public actual fun varFormatDateTime(pvarin: COpaquePointer?, inamedformat: VarformatNamedFormat, dwflags: UInt, pbstrout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varFormatDateTime(pvarin?.value?.toCPointer<ByteVar>(), inamedformat, dwflags, pbstrout?.value?.toCPointer<ByteVar>())

public actual fun varFormatFromTokens(pvarin: COpaquePointer?, pstrformat: Pcwstr, pbtokcur: COpaquePointer?, dwflags: UInt, pbstrout: COpaquePointer?, lcid: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varFormatFromTokens(pvarin?.value?.toCPointer<ByteVar>(), pstrformat?.value?.toCPointer<ByteVar>(), pbtokcur?.value?.toCPointer<ByteVar>(), dwflags, pbstrout?.value?.toCPointer<ByteVar>(), lcid)

public actual fun varFormatNumber(pvarin: COpaquePointer?, inumdig: Int, iinclead: VarformatLeadingDigit, iuseparens: VarformatParentheses, igroup: VarformatGroup, dwflags: UInt, pbstrout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varFormatNumber(pvarin?.value?.toCPointer<ByteVar>(), inumdig, iinclead, iuseparens, igroup, dwflags, pbstrout?.value?.toCPointer<ByteVar>())

public actual fun varFormatPercent(pvarin: COpaquePointer?, inumdig: Int, iinclead: VarformatLeadingDigit, iuseparens: VarformatParentheses, igroup: VarformatGroup, dwflags: UInt, pbstrout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varFormatPercent(pvarin?.value?.toCPointer<ByteVar>(), inumdig, iinclead, iuseparens, igroup, dwflags, pbstrout?.value?.toCPointer<ByteVar>())

public actual fun varI1FromBool(boolin: VariantBool, pcout: Pstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varI1FromBool(boolin, pcout?.value?.toCPointer<ByteVar>())

public actual fun varI1FromCy(cyin: CY, pcout: Pstr): Hresult =
    0

public actual fun varI1FromDate(datein: Double, pcout: Pstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varI1FromDate(datein, pcout?.value?.toCPointer<ByteVar>())

public actual fun varI1FromDec(pdecin: COpaquePointer?, pcout: Pstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varI1FromDec(pdecin?.value?.toCPointer<ByteVar>(), pcout?.value?.toCPointer<ByteVar>())

public actual fun varI1FromDisp(pdispin: COpaquePointer?, lcid: UInt, pcout: Pstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varI1FromDisp(pdispin?.value?.toCPointer<ByteVar>(), lcid, pcout?.value?.toCPointer<ByteVar>())

public actual fun varI1FromI2(uiin: Short, pcout: Pstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varI1FromI2(uiin, pcout?.value?.toCPointer<ByteVar>())

public actual fun varI1FromI4(lin: Int, pcout: Pstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varI1FromI4(lin, pcout?.value?.toCPointer<ByteVar>())

public actual fun varI1FromI8(i64in: Long, pcout: Pstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varI1FromI8(i64in, pcout?.value?.toCPointer<ByteVar>())

public actual fun varI1FromR4(fltin: Float, pcout: Pstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varI1FromR4(fltin, pcout?.value?.toCPointer<ByteVar>())

public actual fun varI1FromR8(dblin: Double, pcout: Pstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varI1FromR8(dblin, pcout?.value?.toCPointer<ByteVar>())

public actual fun varI1FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pcout: Pstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varI1FromStr(strin?.value?.toCPointer<ByteVar>(), lcid, dwflags, pcout?.value?.toCPointer<ByteVar>())

public actual fun varI1FromUI1(bin: UByte, pcout: Pstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varI1FromUI1(bin, pcout?.value?.toCPointer<ByteVar>())

public actual fun varI1FromUI2(uiin: UShort, pcout: Pstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varI1FromUI2(uiin, pcout?.value?.toCPointer<ByteVar>())

public actual fun varI1FromUI4(ulin: UInt, pcout: Pstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varI1FromUI4(ulin, pcout?.value?.toCPointer<ByteVar>())

public actual fun varI1FromUI8(i64in: ULong, pcout: Pstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varI1FromUI8(i64in, pcout?.value?.toCPointer<ByteVar>())

public actual fun varI2FromBool(boolin: VariantBool, psout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varI2FromBool(boolin, psout?.value?.toCPointer<ByteVar>())

public actual fun varI2FromCy(cyin: CY, psout: COpaquePointer?): Hresult =
    0

public actual fun varI2FromDate(datein: Double, psout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varI2FromDate(datein, psout?.value?.toCPointer<ByteVar>())

public actual fun varI2FromDec(pdecin: COpaquePointer?, psout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varI2FromDec(pdecin?.value?.toCPointer<ByteVar>(), psout?.value?.toCPointer<ByteVar>())

public actual fun varI2FromDisp(pdispin: COpaquePointer?, lcid: UInt, psout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varI2FromDisp(pdispin?.value?.toCPointer<ByteVar>(), lcid, psout?.value?.toCPointer<ByteVar>())

public actual fun varI2FromI1(cin: Byte, psout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varI2FromI1(cin, psout?.value?.toCPointer<ByteVar>())

public actual fun varI2FromI4(lin: Int, psout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varI2FromI4(lin, psout?.value?.toCPointer<ByteVar>())

public actual fun varI2FromI8(i64in: Long, psout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varI2FromI8(i64in, psout?.value?.toCPointer<ByteVar>())

public actual fun varI2FromR4(fltin: Float, psout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varI2FromR4(fltin, psout?.value?.toCPointer<ByteVar>())

public actual fun varI2FromR8(dblin: Double, psout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varI2FromR8(dblin, psout?.value?.toCPointer<ByteVar>())

public actual fun varI2FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, psout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varI2FromStr(strin?.value?.toCPointer<ByteVar>(), lcid, dwflags, psout?.value?.toCPointer<ByteVar>())

public actual fun varI2FromUI1(bin: UByte, psout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varI2FromUI1(bin, psout?.value?.toCPointer<ByteVar>())

public actual fun varI2FromUI2(uiin: UShort, psout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varI2FromUI2(uiin, psout?.value?.toCPointer<ByteVar>())

public actual fun varI2FromUI4(ulin: UInt, psout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varI2FromUI4(ulin, psout?.value?.toCPointer<ByteVar>())

public actual fun varI2FromUI8(ui64in: ULong, psout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varI2FromUI8(ui64in, psout?.value?.toCPointer<ByteVar>())

public actual fun varI4FromBool(boolin: VariantBool, plout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varI4FromBool(boolin, plout?.value?.toCPointer<ByteVar>())

public actual fun varI4FromCy(cyin: CY, plout: COpaquePointer?): Hresult =
    0

public actual fun varI4FromDate(datein: Double, plout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varI4FromDate(datein, plout?.value?.toCPointer<ByteVar>())

public actual fun varI4FromDec(pdecin: COpaquePointer?, plout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varI4FromDec(pdecin?.value?.toCPointer<ByteVar>(), plout?.value?.toCPointer<ByteVar>())

public actual fun varI4FromDisp(pdispin: COpaquePointer?, lcid: UInt, plout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varI4FromDisp(pdispin?.value?.toCPointer<ByteVar>(), lcid, plout?.value?.toCPointer<ByteVar>())

public actual fun varI4FromI1(cin: Byte, plout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varI4FromI1(cin, plout?.value?.toCPointer<ByteVar>())

public actual fun varI4FromI2(sin: Short, plout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varI4FromI2(sin, plout?.value?.toCPointer<ByteVar>())

public actual fun varI4FromI8(i64in: Long, plout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varI4FromI8(i64in, plout?.value?.toCPointer<ByteVar>())

public actual fun varI4FromR4(fltin: Float, plout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varI4FromR4(fltin, plout?.value?.toCPointer<ByteVar>())

public actual fun varI4FromR8(dblin: Double, plout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varI4FromR8(dblin, plout?.value?.toCPointer<ByteVar>())

public actual fun varI4FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, plout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varI4FromStr(strin?.value?.toCPointer<ByteVar>(), lcid, dwflags, plout?.value?.toCPointer<ByteVar>())

public actual fun varI4FromUI1(bin: UByte, plout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varI4FromUI1(bin, plout?.value?.toCPointer<ByteVar>())

public actual fun varI4FromUI2(uiin: UShort, plout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varI4FromUI2(uiin, plout?.value?.toCPointer<ByteVar>())

public actual fun varI4FromUI4(ulin: UInt, plout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varI4FromUI4(ulin, plout?.value?.toCPointer<ByteVar>())

public actual fun varI4FromUI8(ui64in: ULong, plout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varI4FromUI8(ui64in, plout?.value?.toCPointer<ByteVar>())

public actual fun varI8FromBool(boolin: VariantBool, pi64out: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varI8FromBool(boolin, pi64out?.value?.toCPointer<ByteVar>())

public actual fun varI8FromCy(cyin: CY, pi64out: COpaquePointer?): Hresult =
    0

public actual fun varI8FromDate(datein: Double, pi64out: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varI8FromDate(datein, pi64out?.value?.toCPointer<ByteVar>())

public actual fun varI8FromDec(pdecin: COpaquePointer?, pi64out: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varI8FromDec(pdecin?.value?.toCPointer<ByteVar>(), pi64out?.value?.toCPointer<ByteVar>())

public actual fun varI8FromDisp(pdispin: COpaquePointer?, lcid: UInt, pi64out: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varI8FromDisp(pdispin?.value?.toCPointer<ByteVar>(), lcid, pi64out?.value?.toCPointer<ByteVar>())

public actual fun varI8FromI1(cin: Byte, pi64out: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varI8FromI1(cin, pi64out?.value?.toCPointer<ByteVar>())

public actual fun varI8FromI2(sin: Short, pi64out: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varI8FromI2(sin, pi64out?.value?.toCPointer<ByteVar>())

public actual fun varI8FromR4(fltin: Float, pi64out: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varI8FromR4(fltin, pi64out?.value?.toCPointer<ByteVar>())

public actual fun varI8FromR8(dblin: Double, pi64out: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varI8FromR8(dblin, pi64out?.value?.toCPointer<ByteVar>())

public actual fun varI8FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pi64out: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varI8FromStr(strin?.value?.toCPointer<ByteVar>(), lcid, dwflags, pi64out?.value?.toCPointer<ByteVar>())

public actual fun varI8FromUI1(bin: UByte, pi64out: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varI8FromUI1(bin, pi64out?.value?.toCPointer<ByteVar>())

public actual fun varI8FromUI2(uiin: UShort, pi64out: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varI8FromUI2(uiin, pi64out?.value?.toCPointer<ByteVar>())

public actual fun varI8FromUI4(ulin: UInt, pi64out: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varI8FromUI4(ulin, pi64out?.value?.toCPointer<ByteVar>())

public actual fun varI8FromUI8(ui64in: ULong, pi64out: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varI8FromUI8(ui64in, pi64out?.value?.toCPointer<ByteVar>())

public actual fun varIdiv(pvarleft: COpaquePointer?, pvarright: COpaquePointer?, pvarresult: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varIdiv(pvarleft?.value?.toCPointer<ByteVar>(), pvarright?.value?.toCPointer<ByteVar>(), pvarresult?.value?.toCPointer<ByteVar>())

public actual fun varImp(pvarleft: COpaquePointer?, pvarright: COpaquePointer?, pvarresult: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varImp(pvarleft?.value?.toCPointer<ByteVar>(), pvarright?.value?.toCPointer<ByteVar>(), pvarresult?.value?.toCPointer<ByteVar>())

public actual fun varInt(pvarin: COpaquePointer?, pvarresult: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varInt(pvarin?.value?.toCPointer<ByteVar>(), pvarresult?.value?.toCPointer<ByteVar>())

public actual fun varMod(pvarleft: COpaquePointer?, pvarright: COpaquePointer?, pvarresult: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varMod(pvarleft?.value?.toCPointer<ByteVar>(), pvarright?.value?.toCPointer<ByteVar>(), pvarresult?.value?.toCPointer<ByteVar>())

public actual fun varMonthName(imonth: Int, fabbrev: Int, dwflags: UInt, pbstrout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varMonthName(imonth, fabbrev, dwflags, pbstrout?.value?.toCPointer<ByteVar>())

public actual fun varMul(pvarleft: COpaquePointer?, pvarright: COpaquePointer?, pvarresult: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varMul(pvarleft?.value?.toCPointer<ByteVar>(), pvarright?.value?.toCPointer<ByteVar>(), pvarresult?.value?.toCPointer<ByteVar>())

public actual fun varNeg(pvarin: COpaquePointer?, pvarresult: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varNeg(pvarin?.value?.toCPointer<ByteVar>(), pvarresult?.value?.toCPointer<ByteVar>())

public actual fun varNot(pvarin: COpaquePointer?, pvarresult: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varNot(pvarin?.value?.toCPointer<ByteVar>(), pvarresult?.value?.toCPointer<ByteVar>())

public actual fun varNumFromParseNum(pnumprs: COpaquePointer?, rgbdig: COpaquePointer?, dwvtbits: UInt, pvar: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varNumFromParseNum(pnumprs?.value?.toCPointer<ByteVar>(), rgbdig?.value?.toCPointer<ByteVar>(), dwvtbits, pvar?.value?.toCPointer<ByteVar>())

public actual fun varOr(pvarleft: COpaquePointer?, pvarright: COpaquePointer?, pvarresult: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varOr(pvarleft?.value?.toCPointer<ByteVar>(), pvarright?.value?.toCPointer<ByteVar>(), pvarresult?.value?.toCPointer<ByteVar>())

public actual fun varParseNumFromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pnumprs: COpaquePointer?, rgbdig: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varParseNumFromStr(strin?.value?.toCPointer<ByteVar>(), lcid, dwflags, pnumprs?.value?.toCPointer<ByteVar>(), rgbdig?.value?.toCPointer<ByteVar>())

public actual fun varPow(pvarleft: COpaquePointer?, pvarright: COpaquePointer?, pvarresult: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varPow(pvarleft?.value?.toCPointer<ByteVar>(), pvarright?.value?.toCPointer<ByteVar>(), pvarresult?.value?.toCPointer<ByteVar>())

public actual fun varR4CmpR8(fltleft: Float, dblright: Double): Varcmp =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varR4CmpR8(fltleft, dblright)

public actual fun varR4FromBool(boolin: VariantBool, pfltout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varR4FromBool(boolin, pfltout?.value?.toCPointer<ByteVar>())

public actual fun varR4FromCy(cyin: CY, pfltout: COpaquePointer?): Hresult =
    0

public actual fun varR4FromDate(datein: Double, pfltout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varR4FromDate(datein, pfltout?.value?.toCPointer<ByteVar>())

public actual fun varR4FromDec(pdecin: COpaquePointer?, pfltout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varR4FromDec(pdecin?.value?.toCPointer<ByteVar>(), pfltout?.value?.toCPointer<ByteVar>())

public actual fun varR4FromDisp(pdispin: COpaquePointer?, lcid: UInt, pfltout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varR4FromDisp(pdispin?.value?.toCPointer<ByteVar>(), lcid, pfltout?.value?.toCPointer<ByteVar>())

public actual fun varR4FromI1(cin: Byte, pfltout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varR4FromI1(cin, pfltout?.value?.toCPointer<ByteVar>())

public actual fun varR4FromI2(sin: Short, pfltout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varR4FromI2(sin, pfltout?.value?.toCPointer<ByteVar>())

public actual fun varR4FromI4(lin: Int, pfltout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varR4FromI4(lin, pfltout?.value?.toCPointer<ByteVar>())

public actual fun varR4FromI8(i64in: Long, pfltout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varR4FromI8(i64in, pfltout?.value?.toCPointer<ByteVar>())

public actual fun varR4FromR8(dblin: Double, pfltout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varR4FromR8(dblin, pfltout?.value?.toCPointer<ByteVar>())

public actual fun varR4FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pfltout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varR4FromStr(strin?.value?.toCPointer<ByteVar>(), lcid, dwflags, pfltout?.value?.toCPointer<ByteVar>())

public actual fun varR4FromUI1(bin: UByte, pfltout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varR4FromUI1(bin, pfltout?.value?.toCPointer<ByteVar>())

public actual fun varR4FromUI2(uiin: UShort, pfltout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varR4FromUI2(uiin, pfltout?.value?.toCPointer<ByteVar>())

public actual fun varR4FromUI4(ulin: UInt, pfltout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varR4FromUI4(ulin, pfltout?.value?.toCPointer<ByteVar>())

public actual fun varR4FromUI8(ui64in: ULong, pfltout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varR4FromUI8(ui64in, pfltout?.value?.toCPointer<ByteVar>())

public actual fun varR8FromBool(boolin: VariantBool, pdblout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varR8FromBool(boolin, pdblout?.value?.toCPointer<ByteVar>())

public actual fun varR8FromCy(cyin: CY, pdblout: COpaquePointer?): Hresult =
    0

public actual fun varR8FromDate(datein: Double, pdblout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varR8FromDate(datein, pdblout?.value?.toCPointer<ByteVar>())

public actual fun varR8FromDec(pdecin: COpaquePointer?, pdblout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varR8FromDec(pdecin?.value?.toCPointer<ByteVar>(), pdblout?.value?.toCPointer<ByteVar>())

public actual fun varR8FromDisp(pdispin: COpaquePointer?, lcid: UInt, pdblout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varR8FromDisp(pdispin?.value?.toCPointer<ByteVar>(), lcid, pdblout?.value?.toCPointer<ByteVar>())

public actual fun varR8FromI1(cin: Byte, pdblout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varR8FromI1(cin, pdblout?.value?.toCPointer<ByteVar>())

public actual fun varR8FromI2(sin: Short, pdblout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varR8FromI2(sin, pdblout?.value?.toCPointer<ByteVar>())

public actual fun varR8FromI4(lin: Int, pdblout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varR8FromI4(lin, pdblout?.value?.toCPointer<ByteVar>())

public actual fun varR8FromI8(i64in: Long, pdblout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varR8FromI8(i64in, pdblout?.value?.toCPointer<ByteVar>())

public actual fun varR8FromR4(fltin: Float, pdblout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varR8FromR4(fltin, pdblout?.value?.toCPointer<ByteVar>())

public actual fun varR8FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pdblout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varR8FromStr(strin?.value?.toCPointer<ByteVar>(), lcid, dwflags, pdblout?.value?.toCPointer<ByteVar>())

public actual fun varR8FromUI1(bin: UByte, pdblout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varR8FromUI1(bin, pdblout?.value?.toCPointer<ByteVar>())

public actual fun varR8FromUI2(uiin: UShort, pdblout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varR8FromUI2(uiin, pdblout?.value?.toCPointer<ByteVar>())

public actual fun varR8FromUI4(ulin: UInt, pdblout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varR8FromUI4(ulin, pdblout?.value?.toCPointer<ByteVar>())

public actual fun varR8FromUI8(ui64in: ULong, pdblout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varR8FromUI8(ui64in, pdblout?.value?.toCPointer<ByteVar>())

public actual fun varR8Pow(dblleft: Double, dblright: Double, pdblresult: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varR8Pow(dblleft, dblright, pdblresult?.value?.toCPointer<ByteVar>())

public actual fun varR8Round(dblin: Double, cdecimals: Int, pdblresult: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varR8Round(dblin, cdecimals, pdblresult?.value?.toCPointer<ByteVar>())

public actual fun varRound(pvarin: COpaquePointer?, cdecimals: Int, pvarresult: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varRound(pvarin?.value?.toCPointer<ByteVar>(), cdecimals, pvarresult?.value?.toCPointer<ByteVar>())

public actual fun varSub(pvarleft: COpaquePointer?, pvarright: COpaquePointer?, pvarresult: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varSub(pvarleft?.value?.toCPointer<ByteVar>(), pvarright?.value?.toCPointer<ByteVar>(), pvarresult?.value?.toCPointer<ByteVar>())

public actual fun varTokenizeFormatString(pstrformat: Pcwstr, rgbtok: COpaquePointer?, cbtok: Int, ifirstday: VarformatFirstDay, ifirstweek: VarformatFirstWeek, lcid: UInt, pcbactual: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varTokenizeFormatString(pstrformat?.value?.toCPointer<ByteVar>(), rgbtok?.value?.toCPointer<ByteVar>(), cbtok, ifirstday, ifirstweek, lcid, pcbactual?.value?.toCPointer<ByteVar>())

public actual fun varUI1FromBool(boolin: VariantBool, pbout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varUI1FromBool(boolin, pbout?.value?.toCPointer<ByteVar>())

public actual fun varUI1FromCy(cyin: CY, pbout: COpaquePointer?): Hresult =
    0

public actual fun varUI1FromDate(datein: Double, pbout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varUI1FromDate(datein, pbout?.value?.toCPointer<ByteVar>())

public actual fun varUI1FromDec(pdecin: COpaquePointer?, pbout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varUI1FromDec(pdecin?.value?.toCPointer<ByteVar>(), pbout?.value?.toCPointer<ByteVar>())

public actual fun varUI1FromDisp(pdispin: COpaquePointer?, lcid: UInt, pbout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varUI1FromDisp(pdispin?.value?.toCPointer<ByteVar>(), lcid, pbout?.value?.toCPointer<ByteVar>())

public actual fun varUI1FromI1(cin: Byte, pbout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varUI1FromI1(cin, pbout?.value?.toCPointer<ByteVar>())

public actual fun varUI1FromI2(sin: Short, pbout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varUI1FromI2(sin, pbout?.value?.toCPointer<ByteVar>())

public actual fun varUI1FromI4(lin: Int, pbout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varUI1FromI4(lin, pbout?.value?.toCPointer<ByteVar>())

public actual fun varUI1FromI8(i64in: Long, pbout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varUI1FromI8(i64in, pbout?.value?.toCPointer<ByteVar>())

public actual fun varUI1FromR4(fltin: Float, pbout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varUI1FromR4(fltin, pbout?.value?.toCPointer<ByteVar>())

public actual fun varUI1FromR8(dblin: Double, pbout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varUI1FromR8(dblin, pbout?.value?.toCPointer<ByteVar>())

public actual fun varUI1FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pbout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varUI1FromStr(strin?.value?.toCPointer<ByteVar>(), lcid, dwflags, pbout?.value?.toCPointer<ByteVar>())

public actual fun varUI1FromUI2(uiin: UShort, pbout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varUI1FromUI2(uiin, pbout?.value?.toCPointer<ByteVar>())

public actual fun varUI1FromUI4(ulin: UInt, pbout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varUI1FromUI4(ulin, pbout?.value?.toCPointer<ByteVar>())

public actual fun varUI1FromUI8(ui64in: ULong, pbout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varUI1FromUI8(ui64in, pbout?.value?.toCPointer<ByteVar>())

public actual fun varUI2FromBool(boolin: VariantBool, puiout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varUI2FromBool(boolin, puiout?.value?.toCPointer<ByteVar>())

public actual fun varUI2FromCy(cyin: CY, puiout: COpaquePointer?): Hresult =
    0

public actual fun varUI2FromDate(datein: Double, puiout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varUI2FromDate(datein, puiout?.value?.toCPointer<ByteVar>())

public actual fun varUI2FromDec(pdecin: COpaquePointer?, puiout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varUI2FromDec(pdecin?.value?.toCPointer<ByteVar>(), puiout?.value?.toCPointer<ByteVar>())

public actual fun varUI2FromDisp(pdispin: COpaquePointer?, lcid: UInt, puiout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varUI2FromDisp(pdispin?.value?.toCPointer<ByteVar>(), lcid, puiout?.value?.toCPointer<ByteVar>())

public actual fun varUI2FromI1(cin: Byte, puiout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varUI2FromI1(cin, puiout?.value?.toCPointer<ByteVar>())

public actual fun varUI2FromI2(uiin: Short, puiout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varUI2FromI2(uiin, puiout?.value?.toCPointer<ByteVar>())

public actual fun varUI2FromI4(lin: Int, puiout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varUI2FromI4(lin, puiout?.value?.toCPointer<ByteVar>())

public actual fun varUI2FromI8(i64in: Long, puiout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varUI2FromI8(i64in, puiout?.value?.toCPointer<ByteVar>())

public actual fun varUI2FromR4(fltin: Float, puiout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varUI2FromR4(fltin, puiout?.value?.toCPointer<ByteVar>())

public actual fun varUI2FromR8(dblin: Double, puiout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varUI2FromR8(dblin, puiout?.value?.toCPointer<ByteVar>())

public actual fun varUI2FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, puiout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varUI2FromStr(strin?.value?.toCPointer<ByteVar>(), lcid, dwflags, puiout?.value?.toCPointer<ByteVar>())

public actual fun varUI2FromUI1(bin: UByte, puiout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varUI2FromUI1(bin, puiout?.value?.toCPointer<ByteVar>())

public actual fun varUI2FromUI4(ulin: UInt, puiout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varUI2FromUI4(ulin, puiout?.value?.toCPointer<ByteVar>())

public actual fun varUI2FromUI8(i64in: ULong, puiout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varUI2FromUI8(i64in, puiout?.value?.toCPointer<ByteVar>())

public actual fun varUI4FromBool(boolin: VariantBool, pulout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varUI4FromBool(boolin, pulout?.value?.toCPointer<ByteVar>())

public actual fun varUI4FromCy(cyin: CY, pulout: COpaquePointer?): Hresult =
    0

public actual fun varUI4FromDate(datein: Double, pulout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varUI4FromDate(datein, pulout?.value?.toCPointer<ByteVar>())

public actual fun varUI4FromDec(pdecin: COpaquePointer?, pulout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varUI4FromDec(pdecin?.value?.toCPointer<ByteVar>(), pulout?.value?.toCPointer<ByteVar>())

public actual fun varUI4FromDisp(pdispin: COpaquePointer?, lcid: UInt, pulout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varUI4FromDisp(pdispin?.value?.toCPointer<ByteVar>(), lcid, pulout?.value?.toCPointer<ByteVar>())

public actual fun varUI4FromI1(cin: Byte, pulout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varUI4FromI1(cin, pulout?.value?.toCPointer<ByteVar>())

public actual fun varUI4FromI2(uiin: Short, pulout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varUI4FromI2(uiin, pulout?.value?.toCPointer<ByteVar>())

public actual fun varUI4FromI4(lin: Int, pulout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varUI4FromI4(lin, pulout?.value?.toCPointer<ByteVar>())

public actual fun varUI4FromI8(i64in: Long, plout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varUI4FromI8(i64in, plout?.value?.toCPointer<ByteVar>())

public actual fun varUI4FromR4(fltin: Float, pulout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varUI4FromR4(fltin, pulout?.value?.toCPointer<ByteVar>())

public actual fun varUI4FromR8(dblin: Double, pulout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varUI4FromR8(dblin, pulout?.value?.toCPointer<ByteVar>())

public actual fun varUI4FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pulout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varUI4FromStr(strin?.value?.toCPointer<ByteVar>(), lcid, dwflags, pulout?.value?.toCPointer<ByteVar>())

public actual fun varUI4FromUI1(bin: UByte, pulout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varUI4FromUI1(bin, pulout?.value?.toCPointer<ByteVar>())

public actual fun varUI4FromUI2(uiin: UShort, pulout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varUI4FromUI2(uiin, pulout?.value?.toCPointer<ByteVar>())

public actual fun varUI4FromUI8(ui64in: ULong, plout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varUI4FromUI8(ui64in, plout?.value?.toCPointer<ByteVar>())

public actual fun varUI8FromBool(boolin: VariantBool, pi64out: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varUI8FromBool(boolin, pi64out?.value?.toCPointer<ByteVar>())

public actual fun varUI8FromCy(cyin: CY, pi64out: COpaquePointer?): Hresult =
    0

public actual fun varUI8FromDate(datein: Double, pi64out: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varUI8FromDate(datein, pi64out?.value?.toCPointer<ByteVar>())

public actual fun varUI8FromDec(pdecin: COpaquePointer?, pi64out: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varUI8FromDec(pdecin?.value?.toCPointer<ByteVar>(), pi64out?.value?.toCPointer<ByteVar>())

public actual fun varUI8FromDisp(pdispin: COpaquePointer?, lcid: UInt, pi64out: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varUI8FromDisp(pdispin?.value?.toCPointer<ByteVar>(), lcid, pi64out?.value?.toCPointer<ByteVar>())

public actual fun varUI8FromI1(cin: Byte, pi64out: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varUI8FromI1(cin, pi64out?.value?.toCPointer<ByteVar>())

public actual fun varUI8FromI2(sin: Short, pi64out: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varUI8FromI2(sin, pi64out?.value?.toCPointer<ByteVar>())

public actual fun varUI8FromI8(ui64in: Long, pi64out: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varUI8FromI8(ui64in, pi64out?.value?.toCPointer<ByteVar>())

public actual fun varUI8FromR4(fltin: Float, pi64out: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varUI8FromR4(fltin, pi64out?.value?.toCPointer<ByteVar>())

public actual fun varUI8FromR8(dblin: Double, pi64out: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varUI8FromR8(dblin, pi64out?.value?.toCPointer<ByteVar>())

public actual fun varUI8FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pi64out: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varUI8FromStr(strin?.value?.toCPointer<ByteVar>(), lcid, dwflags, pi64out?.value?.toCPointer<ByteVar>())

public actual fun varUI8FromUI1(bin: UByte, pi64out: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varUI8FromUI1(bin, pi64out?.value?.toCPointer<ByteVar>())

public actual fun varUI8FromUI2(uiin: UShort, pi64out: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varUI8FromUI2(uiin, pi64out?.value?.toCPointer<ByteVar>())

public actual fun varUI8FromUI4(ulin: UInt, pi64out: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varUI8FromUI4(ulin, pi64out?.value?.toCPointer<ByteVar>())

public actual fun varUdateFromDate(datein: Double, dwflags: UInt, pudateout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varUdateFromDate(datein, dwflags, pudateout?.value?.toCPointer<ByteVar>())

public actual fun varWeekdayName(iweekday: Int, fabbrev: Int, ifirstday: Int, dwflags: UInt, pbstrout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varWeekdayName(iweekday, fabbrev, ifirstday, dwflags, pbstrout?.value?.toCPointer<ByteVar>())

public actual fun varXor(pvarleft: COpaquePointer?, pvarright: COpaquePointer?, pvarresult: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_varXor(pvarleft?.value?.toCPointer<ByteVar>(), pvarright?.value?.toCPointer<ByteVar>(), pvarresult?.value?.toCPointer<ByteVar>())

public actual fun vectorFromBstr(bstr: Bstr, ppsa: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.ole.cinterop.windowssys_windows_win32_system_ole_vectorFromBstr(bstr?.value?.toCPointer<ByteVar>(), ppsa?.value?.toCPointer<ByteVar>())
