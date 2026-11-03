package io.github.kotlinmania.windowssys.windows.win32.system.ole

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.BSTR
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR

public fun interface FnCallback {
    public operator fun invoke(pclsid: Long, szclass: PCWSTR, sztopicname: PCWSTR, szitemname: PCWSTR, szuncname: PCWSTR, linkupdatingoption: UInt, pvcontext: Long): HRESULT
}

public fun BstrFromVector(psa: Long, pbstr: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "BstrFromVector", longArrayOf(psa, pbstr)).toInt()
}

public fun ClearCustData(pcustdata: Long) {
    Win32DynamicFfi.invoke("oleaut32.dll", "ClearCustData", longArrayOf(pcustdata))
}

public fun CreateDispTypeInfo(pidata: Long, lcid: UInt, pptinfo: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "CreateDispTypeInfo", longArrayOf(pidata, lcid.toLong(), pptinfo)).toInt()
}

public fun CreateErrorInfo(pperrinfo: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "CreateErrorInfo", longArrayOf(pperrinfo)).toInt()
}

public fun CreateOleAdviseHolder(ppoaholder: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CreateOleAdviseHolder", longArrayOf(ppoaholder)).toInt()
}

public fun CreateStdDispatch(punkouter: Long, pvthis: Long, ptinfo: Long, ppunkstddisp: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "CreateStdDispatch", longArrayOf(punkouter, pvthis, ptinfo, ppunkstddisp)).toInt()
}

public fun CreateTypeLib(syskind: Com.SYSKIND, szfile: PCWSTR, ppctlib: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "CreateTypeLib", longArrayOf(Win32DynamicFfi.objectSlot(syskind), szfile, ppctlib)).toInt()
}

public fun CreateTypeLib2(syskind: Com.SYSKIND, szfile: PCWSTR, ppctlib: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "CreateTypeLib2", longArrayOf(Win32DynamicFfi.objectSlot(syskind), szfile, ppctlib)).toInt()
}

public fun DispCallFunc(pvinstance: Long, ovft: ULong, cc: Com.CALLCONV, vtreturn: Variant.VARENUM, cactuals: UInt, prgvt: Long, prgpvarg: Long, pvargresult: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "DispCallFunc", longArrayOf(pvinstance, ovft.toLong(), Win32DynamicFfi.objectSlot(cc), Win32DynamicFfi.objectSlot(vtreturn), cactuals.toLong(), prgvt, prgpvarg, pvargresult)).toInt()
}

public fun DispGetIDsOfNames(ptinfo: Long, rgsznames: Long, cnames: UInt, rgdispid: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "DispGetIDsOfNames", longArrayOf(ptinfo, rgsznames, cnames.toLong(), rgdispid)).toInt()
}

public fun DispGetParam(pdispparams: Long, position: UInt, vttarg: Variant.VARENUM, pvarresult: Long, puargerr: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "DispGetParam", longArrayOf(pdispparams, position.toLong(), Win32DynamicFfi.objectSlot(vttarg), pvarresult, puargerr)).toInt()
}

public fun DispInvoke(_this: Long, ptinfo: Long, dispidmember: Int, wflags: UShort, pparams: Long, pvarresult: Long, pexcepinfo: Long, puargerr: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "DispInvoke", longArrayOf(_this, ptinfo, dispidmember.toLong(), wflags.toLong(), pparams, pvarresult, pexcepinfo, puargerr)).toInt()
}

public fun DoDragDrop(pdataobj: Long, pdropsource: Long, dwokeffects: DROPEFFECT, pdweffect: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "DoDragDrop", longArrayOf(pdataobj, pdropsource, dwokeffects.toLong(), pdweffect)).toInt()
}

public fun GetActiveObject(rclsid: Long, pvreserved: Long, ppunk: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "GetActiveObject", longArrayOf(rclsid, pvreserved, ppunk)).toInt()
}

public fun GetAltMonthNames(lcid: UInt, prgp: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "GetAltMonthNames", longArrayOf(lcid.toLong(), prgp)).toInt()
}

public fun GetRecordInfoFromGuids(rguidtypelib: Long, uvermajor: UInt, uverminor: UInt, lcid: UInt, rguidtypeinfo: Long, pprecinfo: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "GetRecordInfoFromGuids", longArrayOf(rguidtypelib, uvermajor.toLong(), uverminor.toLong(), lcid.toLong(), rguidtypeinfo, pprecinfo)).toInt()
}

public fun GetRecordInfoFromTypeInfo(ptypeinfo: Long, pprecinfo: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "GetRecordInfoFromTypeInfo", longArrayOf(ptypeinfo, pprecinfo)).toInt()
}

public fun HRGN_UserFree(param0: Long, param1: Long) {
    Win32DynamicFfi.invoke("ole32.dll", "HRGN_UserFree", longArrayOf(param0, param1))
}

public fun HRGN_UserFree64(param0: Long, param1: Long) {
    Win32DynamicFfi.invoke("api-ms-win-core-marshal-l1-1-0.dll", "HRGN_UserFree64", longArrayOf(param0, param1))
}

public fun HRGN_UserMarshal(param0: Long, param1: Long, param2: Long): Long {
    return Win32DynamicFfi.invoke("ole32.dll", "HRGN_UserMarshal", longArrayOf(param0, param1, param2))
}

public fun HRGN_UserMarshal64(param0: Long, param1: Long, param2: Long): Long {
    return Win32DynamicFfi.invoke("api-ms-win-core-marshal-l1-1-0.dll", "HRGN_UserMarshal64", longArrayOf(param0, param1, param2))
}

public fun HRGN_UserSize(param0: Long, param1: UInt, param2: Long): UInt {
    return Win32DynamicFfi.invoke("ole32.dll", "HRGN_UserSize", longArrayOf(param0, param1.toLong(), param2)).toUInt()
}

public fun HRGN_UserSize64(param0: Long, param1: UInt, param2: Long): UInt {
    return Win32DynamicFfi.invoke("api-ms-win-core-marshal-l1-1-0.dll", "HRGN_UserSize64", longArrayOf(param0, param1.toLong(), param2)).toUInt()
}

public fun HRGN_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long {
    return Win32DynamicFfi.invoke("ole32.dll", "HRGN_UserUnmarshal", longArrayOf(param0, param1, param2))
}

public fun HRGN_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long {
    return Win32DynamicFfi.invoke("api-ms-win-core-marshal-l1-1-0.dll", "HRGN_UserUnmarshal64", longArrayOf(param0, param1, param2))
}

public fun IsAccelerator(haccel: UI.WindowsAndMessaging.HACCEL, caccelentries: Int, lpmsg: Long, lpwcmd: Long): BOOL {
    return Win32DynamicFfi.invoke("ole32.dll", "IsAccelerator", longArrayOf(Win32DynamicFfi.objectSlot(haccel), caccelentries.toLong(), lpmsg, lpwcmd)).toInt()
}

public fun LHashValOfNameSys(syskind: Com.SYSKIND, lcid: UInt, szname: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("oleaut32.dll", "LHashValOfNameSys", longArrayOf(Win32DynamicFfi.objectSlot(syskind), lcid.toLong(), szname)).toUInt()
}

public fun LHashValOfNameSysA(syskind: Com.SYSKIND, lcid: UInt, szname: PCSTR): UInt {
    return Win32DynamicFfi.invoke("oleaut32.dll", "LHashValOfNameSysA", longArrayOf(Win32DynamicFfi.objectSlot(syskind), lcid.toLong(), szname)).toUInt()
}

public fun LoadRegTypeLib(rguid: Long, wvermajor: UShort, wverminor: UShort, lcid: UInt, pptlib: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "LoadRegTypeLib", longArrayOf(rguid, wvermajor.toLong(), wverminor.toLong(), lcid.toLong(), pptlib)).toInt()
}

public fun LoadTypeLib(szfile: PCWSTR, pptlib: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "LoadTypeLib", longArrayOf(szfile, pptlib)).toInt()
}

public fun LoadTypeLibEx(szfile: PCWSTR, regkind: REGKIND, pptlib: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "LoadTypeLibEx", longArrayOf(szfile, regkind.toLong(), pptlib)).toInt()
}

public fun OaBuildVersion(): UInt {
    return Win32DynamicFfi.invoke("oleaut32.dll", "OaBuildVersion", longArrayOf()).toUInt()
}

public fun OaEnablePerUserTLibRegistration() {
    Win32DynamicFfi.invoke("oleaut32.dll", "OaEnablePerUserTLibRegistration", longArrayOf())
}

public fun OleBuildVersion(): UInt {
    return Win32DynamicFfi.invoke("ole32.dll", "OleBuildVersion", longArrayOf()).toUInt()
}

public fun OleConvertOLESTREAMToIStorage2(lpolestream: Long, pstg: Long, ptd: Long, opt: UInt, pvcallbackcontext: Long, pqueryconvertolelinkcallback: OLESTREAMQUERYCONVERTOLELINKCALLBACK): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "OleConvertOLESTREAMToIStorage2", longArrayOf(lpolestream, pstg, ptd, opt.toLong(), pvcallbackcontext, Win32DynamicFfi.objectSlot(pqueryconvertolelinkcallback))).toInt()
}

public fun OleConvertOLESTREAMToIStorageEx2(polestm: Long, pstg: Long, pcfformat: Long, plwwidth: Long, plheight: Long, pdwsize: Long, pmedium: Long, opt: UInt, pvcallbackcontext: Long, pqueryconvertolelinkcallback: OLESTREAMQUERYCONVERTOLELINKCALLBACK): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "OleConvertOLESTREAMToIStorageEx2", longArrayOf(polestm, pstg, pcfformat, plwwidth, plheight, pdwsize, pmedium, opt.toLong(), pvcallbackcontext, Win32DynamicFfi.objectSlot(pqueryconvertolelinkcallback))).toInt()
}

public fun OleCreate(rclsid: Long, riid: Long, renderopt: UInt, pformatetc: Long, pclientsite: Long, pstg: Long, ppvobj: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "OleCreate", longArrayOf(rclsid, riid, renderopt.toLong(), pformatetc, pclientsite, pstg, ppvobj)).toInt()
}

public fun OleCreateDefaultHandler(clsid: Long, punkouter: Long, riid: Long, lplpobj: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "OleCreateDefaultHandler", longArrayOf(clsid, punkouter, riid, lplpobj)).toInt()
}

public fun OleCreateEmbeddingHelper(clsid: Long, punkouter: Long, flags: EMBDHLP_FLAGS, pcf: Long, riid: Long, lplpobj: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "OleCreateEmbeddingHelper", longArrayOf(clsid, punkouter, flags.toLong(), pcf, riid, lplpobj)).toInt()
}

public fun OleCreateEx(rclsid: Long, riid: Long, dwflags: OLECREATE, renderopt: UInt, cformats: UInt, rgadvf: Long, rgformatetc: Long, lpadvisesink: Long, rgdwconnection: Long, pclientsite: Long, pstg: Long, ppvobj: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "OleCreateEx", longArrayOf(rclsid, riid, dwflags.toLong(), renderopt.toLong(), cformats.toLong(), rgadvf, rgformatetc, lpadvisesink, rgdwconnection, pclientsite, pstg, ppvobj)).toInt()
}

public fun OleCreateFontIndirect(lpfontdesc: Long, riid: Long, lplpvobj: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "OleCreateFontIndirect", longArrayOf(lpfontdesc, riid, lplpvobj)).toInt()
}

public fun OleCreateFromData(psrcdataobj: Long, riid: Long, renderopt: UInt, pformatetc: Long, pclientsite: Long, pstg: Long, ppvobj: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "OleCreateFromData", longArrayOf(psrcdataobj, riid, renderopt.toLong(), pformatetc, pclientsite, pstg, ppvobj)).toInt()
}

public fun OleCreateFromDataEx(psrcdataobj: Long, riid: Long, dwflags: OLECREATE, renderopt: UInt, cformats: UInt, rgadvf: Long, rgformatetc: Long, lpadvisesink: Long, rgdwconnection: Long, pclientsite: Long, pstg: Long, ppvobj: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "OleCreateFromDataEx", longArrayOf(psrcdataobj, riid, dwflags.toLong(), renderopt.toLong(), cformats.toLong(), rgadvf, rgformatetc, lpadvisesink, rgdwconnection, pclientsite, pstg, ppvobj)).toInt()
}

public fun OleCreateFromFile(rclsid: Long, lpszfilename: PCWSTR, riid: Long, renderopt: UInt, lpformatetc: Long, pclientsite: Long, pstg: Long, ppvobj: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "OleCreateFromFile", longArrayOf(rclsid, lpszfilename, riid, renderopt.toLong(), lpformatetc, pclientsite, pstg, ppvobj)).toInt()
}

public fun OleCreateFromFileEx(rclsid: Long, lpszfilename: PCWSTR, riid: Long, dwflags: OLECREATE, renderopt: UInt, cformats: UInt, rgadvf: Long, rgformatetc: Long, lpadvisesink: Long, rgdwconnection: Long, pclientsite: Long, pstg: Long, ppvobj: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "OleCreateFromFileEx", longArrayOf(rclsid, lpszfilename, riid, dwflags.toLong(), renderopt.toLong(), cformats.toLong(), rgadvf, rgformatetc, lpadvisesink, rgdwconnection, pclientsite, pstg, ppvobj)).toInt()
}

public fun OleCreateLink(pmklinksrc: Long, riid: Long, renderopt: UInt, lpformatetc: Long, pclientsite: Long, pstg: Long, ppvobj: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "OleCreateLink", longArrayOf(pmklinksrc, riid, renderopt.toLong(), lpformatetc, pclientsite, pstg, ppvobj)).toInt()
}

public fun OleCreateLinkEx(pmklinksrc: Long, riid: Long, dwflags: OLECREATE, renderopt: UInt, cformats: UInt, rgadvf: Long, rgformatetc: Long, lpadvisesink: Long, rgdwconnection: Long, pclientsite: Long, pstg: Long, ppvobj: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "OleCreateLinkEx", longArrayOf(pmklinksrc, riid, dwflags.toLong(), renderopt.toLong(), cformats.toLong(), rgadvf, rgformatetc, lpadvisesink, rgdwconnection, pclientsite, pstg, ppvobj)).toInt()
}

public fun OleCreateLinkFromData(psrcdataobj: Long, riid: Long, renderopt: UInt, pformatetc: Long, pclientsite: Long, pstg: Long, ppvobj: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "OleCreateLinkFromData", longArrayOf(psrcdataobj, riid, renderopt.toLong(), pformatetc, pclientsite, pstg, ppvobj)).toInt()
}

public fun OleCreateLinkFromDataEx(psrcdataobj: Long, riid: Long, dwflags: OLECREATE, renderopt: UInt, cformats: UInt, rgadvf: Long, rgformatetc: Long, lpadvisesink: Long, rgdwconnection: Long, pclientsite: Long, pstg: Long, ppvobj: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "OleCreateLinkFromDataEx", longArrayOf(psrcdataobj, riid, dwflags.toLong(), renderopt.toLong(), cformats.toLong(), rgadvf, rgformatetc, lpadvisesink, rgdwconnection, pclientsite, pstg, ppvobj)).toInt()
}

public fun OleCreateLinkToFile(lpszfilename: PCWSTR, riid: Long, renderopt: UInt, lpformatetc: Long, pclientsite: Long, pstg: Long, ppvobj: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "OleCreateLinkToFile", longArrayOf(lpszfilename, riid, renderopt.toLong(), lpformatetc, pclientsite, pstg, ppvobj)).toInt()
}

public fun OleCreateLinkToFileEx(lpszfilename: PCWSTR, riid: Long, dwflags: OLECREATE, renderopt: UInt, cformats: UInt, rgadvf: Long, rgformatetc: Long, lpadvisesink: Long, rgdwconnection: Long, pclientsite: Long, pstg: Long, ppvobj: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "OleCreateLinkToFileEx", longArrayOf(lpszfilename, riid, dwflags.toLong(), renderopt.toLong(), cformats.toLong(), rgadvf, rgformatetc, lpadvisesink, rgdwconnection, pclientsite, pstg, ppvobj)).toInt()
}

public fun OleCreateMenuDescriptor(hmenucombined: UI.WindowsAndMessaging.HMENU, lpmenuwidths: Long): Long {
    return Win32DynamicFfi.invoke("ole32.dll", "OleCreateMenuDescriptor", longArrayOf(Win32DynamicFfi.objectSlot(hmenucombined), lpmenuwidths))
}

public fun OleCreatePictureIndirect(lppictdesc: Long, riid: Long, fown: BOOL, lplpvobj: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "OleCreatePictureIndirect", longArrayOf(lppictdesc, riid, fown.toLong(), lplpvobj)).toInt()
}

public fun OleCreatePropertyFrame(hwndowner: Foundation.HWND, x: UInt, y: UInt, lpszcaption: PCWSTR, cobjects: UInt, ppunk: Long, cpages: UInt, ppageclsid: Long, lcid: UInt, dwreserved: UInt, pvreserved: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "OleCreatePropertyFrame", longArrayOf(Win32DynamicFfi.objectSlot(hwndowner), x.toLong(), y.toLong(), lpszcaption, cobjects.toLong(), ppunk, cpages.toLong(), ppageclsid, lcid.toLong(), dwreserved.toLong(), pvreserved)).toInt()
}

public fun OleCreatePropertyFrameIndirect(lpparams: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "OleCreatePropertyFrameIndirect", longArrayOf(lpparams)).toInt()
}

public fun OleCreateStaticFromData(psrcdataobj: Long, iid: Long, renderopt: UInt, pformatetc: Long, pclientsite: Long, pstg: Long, ppvobj: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "OleCreateStaticFromData", longArrayOf(psrcdataobj, iid, renderopt.toLong(), pformatetc, pclientsite, pstg, ppvobj)).toInt()
}

public fun OleDestroyMenuDescriptor(holemenu: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "OleDestroyMenuDescriptor", longArrayOf(holemenu)).toInt()
}

public fun OleDoAutoConvert(pstg: Long, pclsidnew: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "OleDoAutoConvert", longArrayOf(pstg, pclsidnew)).toInt()
}

public fun OleDraw(punknown: Long, dwaspect: UInt, hdcdraw: Graphics.Gdi.HDC, lprcbounds: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "OleDraw", longArrayOf(punknown, dwaspect.toLong(), Win32DynamicFfi.objectSlot(hdcdraw), lprcbounds)).toInt()
}

public fun OleDuplicateData(hsrc: Foundation.HANDLE, cfformat: CLIPBOARD_FORMAT, uiflags: Memory.GLOBAL_ALLOC_FLAGS): Foundation.HANDLE {
    Win32DynamicFfi.invoke("ole32.dll", "OleDuplicateData", longArrayOf(Win32DynamicFfi.objectSlot(hsrc), cfformat.toLong(), Win32DynamicFfi.objectSlot(uiflags)))
    return Foundation.HANDLE()
}

public fun OleFlushClipboard(): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "OleFlushClipboard", longArrayOf()).toInt()
}

public fun OleGetAutoConvert(clsidold: Long, pclsidnew: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "OleGetAutoConvert", longArrayOf(clsidold, pclsidnew)).toInt()
}

public fun OleGetClipboard(ppdataobj: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "OleGetClipboard", longArrayOf(ppdataobj)).toInt()
}

public fun OleGetClipboardWithEnterpriseInfo(dataobject: Long, dataenterpriseid: Long, sourcedescription: Long, targetdescription: Long, datadescription: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "OleGetClipboardWithEnterpriseInfo", longArrayOf(dataobject, dataenterpriseid, sourcedescription, targetdescription, datadescription)).toInt()
}

public fun OleGetIconOfClass(rclsid: Long, lpszlabel: PCWSTR, fusetypeaslabel: BOOL): Foundation.HGLOBAL {
    Win32DynamicFfi.invoke("ole32.dll", "OleGetIconOfClass", longArrayOf(rclsid, lpszlabel, fusetypeaslabel.toLong()))
    return Foundation.HGLOBAL()
}

public fun OleGetIconOfFile(lpszpath: PCWSTR, fusefileaslabel: BOOL): Foundation.HGLOBAL {
    Win32DynamicFfi.invoke("ole32.dll", "OleGetIconOfFile", longArrayOf(lpszpath, fusefileaslabel.toLong()))
    return Foundation.HGLOBAL()
}

public fun OleIconToCursor(hinstexe: Foundation.HINSTANCE, hicon: UI.WindowsAndMessaging.HICON): UI.WindowsAndMessaging.HCURSOR {
    Win32DynamicFfi.invoke("oleaut32.dll", "OleIconToCursor", longArrayOf(Win32DynamicFfi.objectSlot(hinstexe), Win32DynamicFfi.objectSlot(hicon)))
    return UI.WindowsAndMessaging.HCURSOR()
}

public fun OleInitialize(pvreserved: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "OleInitialize", longArrayOf(pvreserved)).toInt()
}

public fun OleIsCurrentClipboard(pdataobj: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "OleIsCurrentClipboard", longArrayOf(pdataobj)).toInt()
}

public fun OleIsRunning(pobject: Long): BOOL {
    return Win32DynamicFfi.invoke("ole32.dll", "OleIsRunning", longArrayOf(pobject)).toInt()
}

public fun OleLoad(pstg: Long, riid: Long, pclientsite: Long, ppvobj: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "OleLoad", longArrayOf(pstg, riid, pclientsite, ppvobj)).toInt()
}

public fun OleLoadFromStream(pstm: Long, iidinterface: Long, ppvobj: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "OleLoadFromStream", longArrayOf(pstm, iidinterface, ppvobj)).toInt()
}

public fun OleLoadPicture(lpstream: Long, lsize: Int, frunmode: BOOL, riid: Long, lplpvobj: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "OleLoadPicture", longArrayOf(lpstream, lsize.toLong(), frunmode.toLong(), riid, lplpvobj)).toInt()
}

public fun OleLoadPictureEx(lpstream: Long, lsize: Int, frunmode: BOOL, riid: Long, xsizedesired: UInt, ysizedesired: UInt, dwflags: LOAD_PICTURE_FLAGS, lplpvobj: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "OleLoadPictureEx", longArrayOf(lpstream, lsize.toLong(), frunmode.toLong(), riid, xsizedesired.toLong(), ysizedesired.toLong(), dwflags.toLong(), lplpvobj)).toInt()
}

public fun OleLoadPictureFile(varfilename: Variant.VARIANT, lplpdisppicture: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "OleLoadPictureFile", longArrayOf(Win32DynamicFfi.objectSlot(varfilename), lplpdisppicture)).toInt()
}

public fun OleLoadPictureFileEx(varfilename: Variant.VARIANT, xsizedesired: UInt, ysizedesired: UInt, dwflags: LOAD_PICTURE_FLAGS, lplpdisppicture: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "OleLoadPictureFileEx", longArrayOf(Win32DynamicFfi.objectSlot(varfilename), xsizedesired.toLong(), ysizedesired.toLong(), dwflags.toLong(), lplpdisppicture)).toInt()
}

public fun OleLoadPicturePath(szurlorpath: PCWSTR, punkcaller: Long, dwreserved: UInt, clrreserved: UInt, riid: Long, ppvret: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "OleLoadPicturePath", longArrayOf(szurlorpath, punkcaller, dwreserved.toLong(), clrreserved.toLong(), riid, ppvret)).toInt()
}

public fun OleLockRunning(punknown: Long, flock: BOOL, flastunlockcloses: BOOL): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "OleLockRunning", longArrayOf(punknown, flock.toLong(), flastunlockcloses.toLong())).toInt()
}

public fun OleMetafilePictFromIconAndLabel(hicon: UI.WindowsAndMessaging.HICON, lpszlabel: PCWSTR, lpszsourcefile: PCWSTR, iiconindex: UInt): Foundation.HGLOBAL {
    Win32DynamicFfi.invoke("ole32.dll", "OleMetafilePictFromIconAndLabel", longArrayOf(Win32DynamicFfi.objectSlot(hicon), lpszlabel, lpszsourcefile, iiconindex.toLong()))
    return Foundation.HGLOBAL()
}

public fun OleNoteObjectVisible(punknown: Long, fvisible: BOOL): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "OleNoteObjectVisible", longArrayOf(punknown, fvisible.toLong())).toInt()
}

public fun OleQueryCreateFromData(psrcdataobject: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "OleQueryCreateFromData", longArrayOf(psrcdataobject)).toInt()
}

public fun OleQueryLinkFromData(psrcdataobject: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "OleQueryLinkFromData", longArrayOf(psrcdataobject)).toInt()
}

public fun OleRegEnumFormatEtc(clsid: Long, dwdirection: UInt, ppenum: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "OleRegEnumFormatEtc", longArrayOf(clsid, dwdirection.toLong(), ppenum)).toInt()
}

public fun OleRegEnumVerbs(clsid: Long, ppenum: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "OleRegEnumVerbs", longArrayOf(clsid, ppenum)).toInt()
}

public fun OleRegGetMiscStatus(clsid: Long, dwaspect: UInt, pdwstatus: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "OleRegGetMiscStatus", longArrayOf(clsid, dwaspect.toLong(), pdwstatus)).toInt()
}

public fun OleRegGetUserType(clsid: Long, dwformoftype: UInt, pszusertype: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "OleRegGetUserType", longArrayOf(clsid, dwformoftype.toLong(), pszusertype)).toInt()
}

public fun OleRun(punknown: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "OleRun", longArrayOf(punknown)).toInt()
}

public fun OleSave(pps: Long, pstg: Long, fsameasload: BOOL): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "OleSave", longArrayOf(pps, pstg, fsameasload.toLong())).toInt()
}

public fun OleSavePictureFile(lpdisppicture: Long, bstrfilename: BSTR): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "OleSavePictureFile", longArrayOf(lpdisppicture, bstrfilename)).toInt()
}

public fun OleSaveToStream(ppstm: Long, pstm: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "OleSaveToStream", longArrayOf(ppstm, pstm)).toInt()
}

public fun OleSetAutoConvert(clsidold: Long, clsidnew: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "OleSetAutoConvert", longArrayOf(clsidold, clsidnew)).toInt()
}

public fun OleSetClipboard(pdataobj: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "OleSetClipboard", longArrayOf(pdataobj)).toInt()
}

public fun OleSetContainedObject(punknown: Long, fcontained: BOOL): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "OleSetContainedObject", longArrayOf(punknown, fcontained.toLong())).toInt()
}

public fun OleSetMenuDescriptor(holemenu: Long, hwndframe: Foundation.HWND, hwndactiveobject: Foundation.HWND, lpframe: Long, lpactiveobj: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "OleSetMenuDescriptor", longArrayOf(holemenu, Win32DynamicFfi.objectSlot(hwndframe), Win32DynamicFfi.objectSlot(hwndactiveobject), lpframe, lpactiveobj)).toInt()
}

public fun OleTranslateAccelerator(lpframe: Long, lpframeinfo: Long, lpmsg: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "OleTranslateAccelerator", longArrayOf(lpframe, lpframeinfo, lpmsg)).toInt()
}

public fun OleTranslateColor(clr: UInt, hpal: Graphics.Gdi.HPALETTE, lpcolorref: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "OleTranslateColor", longArrayOf(clr.toLong(), Win32DynamicFfi.objectSlot(hpal), lpcolorref)).toInt()
}

public fun OleUIAddVerbMenuA(lpoleobj: Long, lpszshorttype: PCSTR, hmenu: UI.WindowsAndMessaging.HMENU, upos: UInt, uidverbmin: UInt, uidverbmax: UInt, baddconvert: BOOL, idconvert: UInt, lphmenu: Long): BOOL {
    return Win32DynamicFfi.invoke("oledlg.dll", "OleUIAddVerbMenuA", longArrayOf(lpoleobj, lpszshorttype, Win32DynamicFfi.objectSlot(hmenu), upos.toLong(), uidverbmin.toLong(), uidverbmax.toLong(), baddconvert.toLong(), idconvert.toLong(), lphmenu)).toInt()
}

public fun OleUIAddVerbMenuW(lpoleobj: Long, lpszshorttype: PCWSTR, hmenu: UI.WindowsAndMessaging.HMENU, upos: UInt, uidverbmin: UInt, uidverbmax: UInt, baddconvert: BOOL, idconvert: UInt, lphmenu: Long): BOOL {
    return Win32DynamicFfi.invoke("oledlg.dll", "OleUIAddVerbMenuW", longArrayOf(lpoleobj, lpszshorttype, Win32DynamicFfi.objectSlot(hmenu), upos.toLong(), uidverbmin.toLong(), uidverbmax.toLong(), baddconvert.toLong(), idconvert.toLong(), lphmenu)).toInt()
}

public fun OleUIBusyA(param0: Long): UInt {
    return Win32DynamicFfi.invoke("oledlg.dll", "OleUIBusyA", longArrayOf(param0)).toUInt()
}

public fun OleUIBusyW(param0: Long): UInt {
    return Win32DynamicFfi.invoke("oledlg.dll", "OleUIBusyW", longArrayOf(param0)).toUInt()
}

public fun OleUICanConvertOrActivateAs(rclsid: Long, fislinkedobject: BOOL, wformat: UShort): BOOL {
    return Win32DynamicFfi.invoke("oledlg.dll", "OleUICanConvertOrActivateAs", longArrayOf(rclsid, fislinkedobject.toLong(), wformat.toLong())).toInt()
}

public fun OleUIChangeIconA(param0: Long): UInt {
    return Win32DynamicFfi.invoke("oledlg.dll", "OleUIChangeIconA", longArrayOf(param0)).toUInt()
}

public fun OleUIChangeIconW(param0: Long): UInt {
    return Win32DynamicFfi.invoke("oledlg.dll", "OleUIChangeIconW", longArrayOf(param0)).toUInt()
}

public fun OleUIChangeSourceA(param0: Long): UInt {
    return Win32DynamicFfi.invoke("oledlg.dll", "OleUIChangeSourceA", longArrayOf(param0)).toUInt()
}

public fun OleUIChangeSourceW(param0: Long): UInt {
    return Win32DynamicFfi.invoke("oledlg.dll", "OleUIChangeSourceW", longArrayOf(param0)).toUInt()
}

public fun OleUIConvertA(param0: Long): UInt {
    return Win32DynamicFfi.invoke("oledlg.dll", "OleUIConvertA", longArrayOf(param0)).toUInt()
}

public fun OleUIConvertW(param0: Long): UInt {
    return Win32DynamicFfi.invoke("oledlg.dll", "OleUIConvertW", longArrayOf(param0)).toUInt()
}

public fun OleUIEditLinksA(param0: Long): UInt {
    return Win32DynamicFfi.invoke("oledlg.dll", "OleUIEditLinksA", longArrayOf(param0)).toUInt()
}

public fun OleUIEditLinksW(param0: Long): UInt {
    return Win32DynamicFfi.invoke("oledlg.dll", "OleUIEditLinksW", longArrayOf(param0)).toUInt()
}

public fun OleUIInsertObjectA(param0: Long): UInt {
    return Win32DynamicFfi.invoke("oledlg.dll", "OleUIInsertObjectA", longArrayOf(param0)).toUInt()
}

public fun OleUIInsertObjectW(param0: Long): UInt {
    return Win32DynamicFfi.invoke("oledlg.dll", "OleUIInsertObjectW", longArrayOf(param0)).toUInt()
}

public fun OleUIObjectPropertiesA(param0: Long): UInt {
    return Win32DynamicFfi.invoke("oledlg.dll", "OleUIObjectPropertiesA", longArrayOf(param0)).toUInt()
}

public fun OleUIObjectPropertiesW(param0: Long): UInt {
    return Win32DynamicFfi.invoke("oledlg.dll", "OleUIObjectPropertiesW", longArrayOf(param0)).toUInt()
}

public fun OleUIPasteSpecialA(param0: Long): UInt {
    return Win32DynamicFfi.invoke("oledlg.dll", "OleUIPasteSpecialA", longArrayOf(param0)).toUInt()
}

public fun OleUIPasteSpecialW(param0: Long): UInt {
    return Win32DynamicFfi.invoke("oledlg.dll", "OleUIPasteSpecialW", longArrayOf(param0)).toUInt()
}

public fun OleUIPromptUserA(ntemplate: Int, hwndparent: Foundation.HWND, vararg variadicArgs: Long): Int {
    return Win32DynamicFfi.invoke("oledlg.dll", "OleUIPromptUserA", longArrayOf(ntemplate.toLong(), Win32DynamicFfi.objectSlot(hwndparent)) + variadicArgs).toInt()
}

public fun OleUIPromptUserW(ntemplate: Int, hwndparent: Foundation.HWND, vararg variadicArgs: Long): Int {
    return Win32DynamicFfi.invoke("oledlg.dll", "OleUIPromptUserW", longArrayOf(ntemplate.toLong(), Win32DynamicFfi.objectSlot(hwndparent)) + variadicArgs).toInt()
}

public fun OleUIUpdateLinksA(lpoleuilinkcntr: Long, hwndparent: Foundation.HWND, lpsztitle: PCSTR, clinks: Int): BOOL {
    return Win32DynamicFfi.invoke("oledlg.dll", "OleUIUpdateLinksA", longArrayOf(lpoleuilinkcntr, Win32DynamicFfi.objectSlot(hwndparent), lpsztitle, clinks.toLong())).toInt()
}

public fun OleUIUpdateLinksW(lpoleuilinkcntr: Long, hwndparent: Foundation.HWND, lpsztitle: PCWSTR, clinks: Int): BOOL {
    return Win32DynamicFfi.invoke("oledlg.dll", "OleUIUpdateLinksW", longArrayOf(lpoleuilinkcntr, Win32DynamicFfi.objectSlot(hwndparent), lpsztitle, clinks.toLong())).toInt()
}

public fun OleUninitialize() {
    Win32DynamicFfi.invoke("ole32.dll", "OleUninitialize", longArrayOf())
}

public fun QueryPathOfRegTypeLib(guid: Long, wmaj: UShort, wmin: UShort, lcid: UInt, lpbstrpathname: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "QueryPathOfRegTypeLib", longArrayOf(guid, wmaj.toLong(), wmin.toLong(), lcid.toLong(), lpbstrpathname)).toInt()
}

public fun RegisterActiveObject(punk: Long, rclsid: Long, dwflags: ACTIVEOBJECT_FLAGS, pdwregister: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "RegisterActiveObject", longArrayOf(punk, rclsid, dwflags.toLong(), pdwregister)).toInt()
}

public fun RegisterDragDrop(hwnd: Foundation.HWND, pdroptarget: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "RegisterDragDrop", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), pdroptarget)).toInt()
}

public fun RegisterTypeLib(ptlib: Long, szfullpath: PCWSTR, szhelpdir: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "RegisterTypeLib", longArrayOf(ptlib, szfullpath, szhelpdir)).toInt()
}

public fun RegisterTypeLibForUser(ptlib: Long, szfullpath: PCWSTR, szhelpdir: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "RegisterTypeLibForUser", longArrayOf(ptlib, szfullpath, szhelpdir)).toInt()
}

public fun ReleaseStgMedium(param0: Long) {
    Win32DynamicFfi.invoke("ole32.dll", "ReleaseStgMedium", longArrayOf(param0))
}

public fun RevokeActiveObject(dwregister: UInt, pvreserved: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "RevokeActiveObject", longArrayOf(dwregister.toLong(), pvreserved)).toInt()
}

public fun RevokeDragDrop(hwnd: Foundation.HWND): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "RevokeDragDrop", longArrayOf(Win32DynamicFfi.objectSlot(hwnd))).toInt()
}

public fun SafeArrayAccessData(psa: Long, ppvdata: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "SafeArrayAccessData", longArrayOf(psa, ppvdata)).toInt()
}

public fun SafeArrayAddRef(psa: Long, ppdatatorelease: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "SafeArrayAddRef", longArrayOf(psa, ppdatatorelease)).toInt()
}

public fun SafeArrayAllocData(psa: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "SafeArrayAllocData", longArrayOf(psa)).toInt()
}

public fun SafeArrayAllocDescriptor(cdims: UInt, ppsaout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "SafeArrayAllocDescriptor", longArrayOf(cdims.toLong(), ppsaout)).toInt()
}

public fun SafeArrayAllocDescriptorEx(vt: Variant.VARENUM, cdims: UInt, ppsaout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "SafeArrayAllocDescriptorEx", longArrayOf(Win32DynamicFfi.objectSlot(vt), cdims.toLong(), ppsaout)).toInt()
}

public fun SafeArrayCopy(psa: Long, ppsaout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "SafeArrayCopy", longArrayOf(psa, ppsaout)).toInt()
}

public fun SafeArrayCopyData(psasource: Long, psatarget: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "SafeArrayCopyData", longArrayOf(psasource, psatarget)).toInt()
}

public fun SafeArrayCreate(vt: Variant.VARENUM, cdims: UInt, rgsabound: Long): Long {
    return Win32DynamicFfi.invoke("oleaut32.dll", "SafeArrayCreate", longArrayOf(Win32DynamicFfi.objectSlot(vt), cdims.toLong(), rgsabound))
}

public fun SafeArrayCreateEx(vt: Variant.VARENUM, cdims: UInt, rgsabound: Long, pvextra: Long): Long {
    return Win32DynamicFfi.invoke("oleaut32.dll", "SafeArrayCreateEx", longArrayOf(Win32DynamicFfi.objectSlot(vt), cdims.toLong(), rgsabound, pvextra))
}

public fun SafeArrayCreateVector(vt: Variant.VARENUM, llbound: Int, celements: UInt): Long {
    return Win32DynamicFfi.invoke("oleaut32.dll", "SafeArrayCreateVector", longArrayOf(Win32DynamicFfi.objectSlot(vt), llbound.toLong(), celements.toLong()))
}

public fun SafeArrayCreateVectorEx(vt: Variant.VARENUM, llbound: Int, celements: UInt, pvextra: Long): Long {
    return Win32DynamicFfi.invoke("oleaut32.dll", "SafeArrayCreateVectorEx", longArrayOf(Win32DynamicFfi.objectSlot(vt), llbound.toLong(), celements.toLong(), pvextra))
}

public fun SafeArrayDestroy(psa: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "SafeArrayDestroy", longArrayOf(psa)).toInt()
}

public fun SafeArrayDestroyData(psa: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "SafeArrayDestroyData", longArrayOf(psa)).toInt()
}

public fun SafeArrayDestroyDescriptor(psa: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "SafeArrayDestroyDescriptor", longArrayOf(psa)).toInt()
}

public fun SafeArrayGetDim(psa: Long): UInt {
    return Win32DynamicFfi.invoke("oleaut32.dll", "SafeArrayGetDim", longArrayOf(psa)).toUInt()
}

public fun SafeArrayGetElement(psa: Long, rgindices: Long, pv: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "SafeArrayGetElement", longArrayOf(psa, rgindices, pv)).toInt()
}

public fun SafeArrayGetElemsize(psa: Long): UInt {
    return Win32DynamicFfi.invoke("oleaut32.dll", "SafeArrayGetElemsize", longArrayOf(psa)).toUInt()
}

public fun SafeArrayGetIID(psa: Long, pguid: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "SafeArrayGetIID", longArrayOf(psa, pguid)).toInt()
}

public fun SafeArrayGetLBound(psa: Long, ndim: UInt, pllbound: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "SafeArrayGetLBound", longArrayOf(psa, ndim.toLong(), pllbound)).toInt()
}

public fun SafeArrayGetRecordInfo(psa: Long, prinfo: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "SafeArrayGetRecordInfo", longArrayOf(psa, prinfo)).toInt()
}

public fun SafeArrayGetUBound(psa: Long, ndim: UInt, plubound: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "SafeArrayGetUBound", longArrayOf(psa, ndim.toLong(), plubound)).toInt()
}

public fun SafeArrayGetVartype(psa: Long, pvt: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "SafeArrayGetVartype", longArrayOf(psa, pvt)).toInt()
}

public fun SafeArrayLock(psa: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "SafeArrayLock", longArrayOf(psa)).toInt()
}

public fun SafeArrayPtrOfIndex(psa: Long, rgindices: Long, ppvdata: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "SafeArrayPtrOfIndex", longArrayOf(psa, rgindices, ppvdata)).toInt()
}

public fun SafeArrayPutElement(psa: Long, rgindices: Long, pv: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "SafeArrayPutElement", longArrayOf(psa, rgindices, pv)).toInt()
}

public fun SafeArrayRedim(psa: Long, psaboundnew: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "SafeArrayRedim", longArrayOf(psa, psaboundnew)).toInt()
}

public fun SafeArrayReleaseData(pdata: Long) {
    Win32DynamicFfi.invoke("oleaut32.dll", "SafeArrayReleaseData", longArrayOf(pdata))
}

public fun SafeArrayReleaseDescriptor(psa: Long) {
    Win32DynamicFfi.invoke("oleaut32.dll", "SafeArrayReleaseDescriptor", longArrayOf(psa))
}

public fun SafeArraySetIID(psa: Long, guid: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "SafeArraySetIID", longArrayOf(psa, guid)).toInt()
}

public fun SafeArraySetRecordInfo(psa: Long, prinfo: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "SafeArraySetRecordInfo", longArrayOf(psa, prinfo)).toInt()
}

public fun SafeArrayUnaccessData(psa: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "SafeArrayUnaccessData", longArrayOf(psa)).toInt()
}

public fun SafeArrayUnlock(psa: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "SafeArrayUnlock", longArrayOf(psa)).toInt()
}

public fun UnRegisterTypeLib(libid: Long, wvermajor: UShort, wverminor: UShort, lcid: UInt, syskind: Com.SYSKIND): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "UnRegisterTypeLib", longArrayOf(libid, wvermajor.toLong(), wverminor.toLong(), lcid.toLong(), Win32DynamicFfi.objectSlot(syskind))).toInt()
}

public fun UnRegisterTypeLibForUser(libid: Long, wmajorvernum: UShort, wminorvernum: UShort, lcid: UInt, syskind: Com.SYSKIND): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "UnRegisterTypeLibForUser", longArrayOf(libid, wmajorvernum.toLong(), wminorvernum.toLong(), lcid.toLong(), Win32DynamicFfi.objectSlot(syskind))).toInt()
}

public fun VarAbs(pvarin: Long, pvarresult: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarAbs", longArrayOf(pvarin, pvarresult)).toInt()
}

public fun VarAdd(pvarleft: Long, pvarright: Long, pvarresult: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarAdd", longArrayOf(pvarleft, pvarright, pvarresult)).toInt()
}

public fun VarAnd(pvarleft: Long, pvarright: Long, pvarresult: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarAnd", longArrayOf(pvarleft, pvarright, pvarresult)).toInt()
}

public fun VarBoolFromCy(cyin: Com.CY, pboolout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarBoolFromCy", longArrayOf(Win32DynamicFfi.objectSlot(cyin), pboolout)).toInt()
}

public fun VarBoolFromDate(datein: Double, pboolout: Long): HRESULT {
    return Win32DynamicFfi.invokeFp("oleaut32.dll", "VarBoolFromDate", 2, false, longArrayOf(datein.toRawBits(), pboolout)).toLong().toInt()
}

public fun VarBoolFromDec(pdecin: Long, pboolout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarBoolFromDec", longArrayOf(pdecin, pboolout)).toInt()
}

public fun VarBoolFromDisp(pdispin: Long, lcid: UInt, pboolout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarBoolFromDisp", longArrayOf(pdispin, lcid.toLong(), pboolout)).toInt()
}

public fun VarBoolFromI1(cin: Byte, pboolout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarBoolFromI1", longArrayOf(cin.toLong(), pboolout)).toInt()
}

public fun VarBoolFromI2(sin: Short, pboolout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarBoolFromI2", longArrayOf(sin.toLong(), pboolout)).toInt()
}

public fun VarBoolFromI4(lin: Int, pboolout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarBoolFromI4", longArrayOf(lin.toLong(), pboolout)).toInt()
}

public fun VarBoolFromI8(i64in: Long, pboolout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarBoolFromI8", longArrayOf(i64in, pboolout)).toInt()
}

public fun VarBoolFromR4(fltin: Float, pboolout: Long): HRESULT {
    return Win32DynamicFfi.invokeFp("oleaut32.dll", "VarBoolFromR4", 1, false, longArrayOf((fltin.toRawBits().toLong() and 0xFFFF_FFFFL), pboolout)).toLong().toInt()
}

public fun VarBoolFromR8(dblin: Double, pboolout: Long): HRESULT {
    return Win32DynamicFfi.invokeFp("oleaut32.dll", "VarBoolFromR8", 2, false, longArrayOf(dblin.toRawBits(), pboolout)).toLong().toInt()
}

public fun VarBoolFromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, pboolout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarBoolFromStr", longArrayOf(strin, lcid.toLong(), dwflags.toLong(), pboolout)).toInt()
}

public fun VarBoolFromUI1(bin: UByte, pboolout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarBoolFromUI1", longArrayOf(bin.toLong(), pboolout)).toInt()
}

public fun VarBoolFromUI2(uiin: UShort, pboolout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarBoolFromUI2", longArrayOf(uiin.toLong(), pboolout)).toInt()
}

public fun VarBoolFromUI4(ulin: UInt, pboolout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarBoolFromUI4", longArrayOf(ulin.toLong(), pboolout)).toInt()
}

public fun VarBoolFromUI8(i64in: ULong, pboolout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarBoolFromUI8", longArrayOf(i64in.toLong(), pboolout)).toInt()
}

public fun VarBstrCat(bstrleft: BSTR, bstrright: BSTR, pbstrresult: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarBstrCat", longArrayOf(bstrleft, bstrright, pbstrresult)).toInt()
}

public fun VarBstrCmp(bstrleft: BSTR, bstrright: BSTR, lcid: UInt, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarBstrCmp", longArrayOf(bstrleft, bstrright, lcid.toLong(), dwflags.toLong())).toInt()
}

public fun VarBstrFromBool(boolin: Foundation.VARIANT_BOOL, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarBstrFromBool", longArrayOf(Win32DynamicFfi.objectSlot(boolin), lcid.toLong(), dwflags.toLong(), pbstrout)).toInt()
}

public fun VarBstrFromCy(cyin: Com.CY, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarBstrFromCy", longArrayOf(Win32DynamicFfi.objectSlot(cyin), lcid.toLong(), dwflags.toLong(), pbstrout)).toInt()
}

public fun VarBstrFromDate(datein: Double, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT {
    return Win32DynamicFfi.invokeFp("oleaut32.dll", "VarBstrFromDate", 2, false, longArrayOf(datein.toRawBits(), lcid.toLong(), dwflags.toLong(), pbstrout)).toLong().toInt()
}

public fun VarBstrFromDec(pdecin: Long, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarBstrFromDec", longArrayOf(pdecin, lcid.toLong(), dwflags.toLong(), pbstrout)).toInt()
}

public fun VarBstrFromDisp(pdispin: Long, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarBstrFromDisp", longArrayOf(pdispin, lcid.toLong(), dwflags.toLong(), pbstrout)).toInt()
}

public fun VarBstrFromI1(cin: Byte, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarBstrFromI1", longArrayOf(cin.toLong(), lcid.toLong(), dwflags.toLong(), pbstrout)).toInt()
}

public fun VarBstrFromI2(ival: Short, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarBstrFromI2", longArrayOf(ival.toLong(), lcid.toLong(), dwflags.toLong(), pbstrout)).toInt()
}

public fun VarBstrFromI4(lin: Int, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarBstrFromI4", longArrayOf(lin.toLong(), lcid.toLong(), dwflags.toLong(), pbstrout)).toInt()
}

public fun VarBstrFromI8(i64in: Long, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarBstrFromI8", longArrayOf(i64in, lcid.toLong(), dwflags.toLong(), pbstrout)).toInt()
}

public fun VarBstrFromR4(fltin: Float, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT {
    return Win32DynamicFfi.invokeFp("oleaut32.dll", "VarBstrFromR4", 1, false, longArrayOf((fltin.toRawBits().toLong() and 0xFFFF_FFFFL), lcid.toLong(), dwflags.toLong(), pbstrout)).toLong().toInt()
}

public fun VarBstrFromR8(dblin: Double, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT {
    return Win32DynamicFfi.invokeFp("oleaut32.dll", "VarBstrFromR8", 2, false, longArrayOf(dblin.toRawBits(), lcid.toLong(), dwflags.toLong(), pbstrout)).toLong().toInt()
}

public fun VarBstrFromUI1(bval: UByte, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarBstrFromUI1", longArrayOf(bval.toLong(), lcid.toLong(), dwflags.toLong(), pbstrout)).toInt()
}

public fun VarBstrFromUI2(uiin: UShort, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarBstrFromUI2", longArrayOf(uiin.toLong(), lcid.toLong(), dwflags.toLong(), pbstrout)).toInt()
}

public fun VarBstrFromUI4(ulin: UInt, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarBstrFromUI4", longArrayOf(ulin.toLong(), lcid.toLong(), dwflags.toLong(), pbstrout)).toInt()
}

public fun VarBstrFromUI8(ui64in: ULong, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarBstrFromUI8", longArrayOf(ui64in.toLong(), lcid.toLong(), dwflags.toLong(), pbstrout)).toInt()
}

public fun VarCat(pvarleft: Long, pvarright: Long, pvarresult: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarCat", longArrayOf(pvarleft, pvarright, pvarresult)).toInt()
}

public fun VarCmp(pvarleft: Long, pvarright: Long, lcid: UInt, dwflags: UInt): VARCMP {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarCmp", longArrayOf(pvarleft, pvarright, lcid.toLong(), dwflags.toLong())).toUInt()
}

public fun VarCyAbs(cyin: Com.CY, pcyresult: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarCyAbs", longArrayOf(Win32DynamicFfi.objectSlot(cyin), pcyresult)).toInt()
}

public fun VarCyAdd(cyleft: Com.CY, cyright: Com.CY, pcyresult: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarCyAdd", longArrayOf(Win32DynamicFfi.objectSlot(cyleft), Win32DynamicFfi.objectSlot(cyright), pcyresult)).toInt()
}

public fun VarCyCmp(cyleft: Com.CY, cyright: Com.CY): VARCMP {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarCyCmp", longArrayOf(Win32DynamicFfi.objectSlot(cyleft), Win32DynamicFfi.objectSlot(cyright))).toUInt()
}

public fun VarCyCmpR8(cyleft: Com.CY, dblright: Double): VARCMP {
    return Win32DynamicFfi.invokeFp("oleaut32.dll", "VarCyCmpR8", 8, false, longArrayOf(Win32DynamicFfi.objectSlot(cyleft), dblright.toRawBits())).toLong().toUInt()
}

public fun VarCyFix(cyin: Com.CY, pcyresult: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarCyFix", longArrayOf(Win32DynamicFfi.objectSlot(cyin), pcyresult)).toInt()
}

public fun VarCyFromBool(boolin: Foundation.VARIANT_BOOL, pcyout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarCyFromBool", longArrayOf(Win32DynamicFfi.objectSlot(boolin), pcyout)).toInt()
}

public fun VarCyFromDate(datein: Double, pcyout: Long): HRESULT {
    return Win32DynamicFfi.invokeFp("oleaut32.dll", "VarCyFromDate", 2, false, longArrayOf(datein.toRawBits(), pcyout)).toLong().toInt()
}

public fun VarCyFromDec(pdecin: Long, pcyout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarCyFromDec", longArrayOf(pdecin, pcyout)).toInt()
}

public fun VarCyFromDisp(pdispin: Long, lcid: UInt, pcyout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarCyFromDisp", longArrayOf(pdispin, lcid.toLong(), pcyout)).toInt()
}

public fun VarCyFromI1(cin: Byte, pcyout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarCyFromI1", longArrayOf(cin.toLong(), pcyout)).toInt()
}

public fun VarCyFromI2(sin: Short, pcyout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarCyFromI2", longArrayOf(sin.toLong(), pcyout)).toInt()
}

public fun VarCyFromI4(lin: Int, pcyout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarCyFromI4", longArrayOf(lin.toLong(), pcyout)).toInt()
}

public fun VarCyFromI8(i64in: Long, pcyout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarCyFromI8", longArrayOf(i64in, pcyout)).toInt()
}

public fun VarCyFromR4(fltin: Float, pcyout: Long): HRESULT {
    return Win32DynamicFfi.invokeFp("oleaut32.dll", "VarCyFromR4", 1, false, longArrayOf((fltin.toRawBits().toLong() and 0xFFFF_FFFFL), pcyout)).toLong().toInt()
}

public fun VarCyFromR8(dblin: Double, pcyout: Long): HRESULT {
    return Win32DynamicFfi.invokeFp("oleaut32.dll", "VarCyFromR8", 2, false, longArrayOf(dblin.toRawBits(), pcyout)).toLong().toInt()
}

public fun VarCyFromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, pcyout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarCyFromStr", longArrayOf(strin, lcid.toLong(), dwflags.toLong(), pcyout)).toInt()
}

public fun VarCyFromUI1(bin: UByte, pcyout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarCyFromUI1", longArrayOf(bin.toLong(), pcyout)).toInt()
}

public fun VarCyFromUI2(uiin: UShort, pcyout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarCyFromUI2", longArrayOf(uiin.toLong(), pcyout)).toInt()
}

public fun VarCyFromUI4(ulin: UInt, pcyout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarCyFromUI4", longArrayOf(ulin.toLong(), pcyout)).toInt()
}

public fun VarCyFromUI8(ui64in: ULong, pcyout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarCyFromUI8", longArrayOf(ui64in.toLong(), pcyout)).toInt()
}

public fun VarCyInt(cyin: Com.CY, pcyresult: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarCyInt", longArrayOf(Win32DynamicFfi.objectSlot(cyin), pcyresult)).toInt()
}

public fun VarCyMul(cyleft: Com.CY, cyright: Com.CY, pcyresult: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarCyMul", longArrayOf(Win32DynamicFfi.objectSlot(cyleft), Win32DynamicFfi.objectSlot(cyright), pcyresult)).toInt()
}

public fun VarCyMulI4(cyleft: Com.CY, lright: Int, pcyresult: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarCyMulI4", longArrayOf(Win32DynamicFfi.objectSlot(cyleft), lright.toLong(), pcyresult)).toInt()
}

public fun VarCyMulI8(cyleft: Com.CY, lright: Long, pcyresult: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarCyMulI8", longArrayOf(Win32DynamicFfi.objectSlot(cyleft), lright, pcyresult)).toInt()
}

public fun VarCyNeg(cyin: Com.CY, pcyresult: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarCyNeg", longArrayOf(Win32DynamicFfi.objectSlot(cyin), pcyresult)).toInt()
}

public fun VarCyRound(cyin: Com.CY, cdecimals: Int, pcyresult: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarCyRound", longArrayOf(Win32DynamicFfi.objectSlot(cyin), cdecimals.toLong(), pcyresult)).toInt()
}

public fun VarCySub(cyleft: Com.CY, cyright: Com.CY, pcyresult: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarCySub", longArrayOf(Win32DynamicFfi.objectSlot(cyleft), Win32DynamicFfi.objectSlot(cyright), pcyresult)).toInt()
}

public fun VarDateFromBool(boolin: Foundation.VARIANT_BOOL, pdateout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarDateFromBool", longArrayOf(Win32DynamicFfi.objectSlot(boolin), pdateout)).toInt()
}

public fun VarDateFromCy(cyin: Com.CY, pdateout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarDateFromCy", longArrayOf(Win32DynamicFfi.objectSlot(cyin), pdateout)).toInt()
}

public fun VarDateFromDec(pdecin: Long, pdateout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarDateFromDec", longArrayOf(pdecin, pdateout)).toInt()
}

public fun VarDateFromDisp(pdispin: Long, lcid: UInt, pdateout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarDateFromDisp", longArrayOf(pdispin, lcid.toLong(), pdateout)).toInt()
}

public fun VarDateFromI1(cin: Byte, pdateout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarDateFromI1", longArrayOf(cin.toLong(), pdateout)).toInt()
}

public fun VarDateFromI2(sin: Short, pdateout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarDateFromI2", longArrayOf(sin.toLong(), pdateout)).toInt()
}

public fun VarDateFromI4(lin: Int, pdateout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarDateFromI4", longArrayOf(lin.toLong(), pdateout)).toInt()
}

public fun VarDateFromI8(i64in: Long, pdateout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarDateFromI8", longArrayOf(i64in, pdateout)).toInt()
}

public fun VarDateFromR4(fltin: Float, pdateout: Long): HRESULT {
    return Win32DynamicFfi.invokeFp("oleaut32.dll", "VarDateFromR4", 1, false, longArrayOf((fltin.toRawBits().toLong() and 0xFFFF_FFFFL), pdateout)).toLong().toInt()
}

public fun VarDateFromR8(dblin: Double, pdateout: Long): HRESULT {
    return Win32DynamicFfi.invokeFp("oleaut32.dll", "VarDateFromR8", 2, false, longArrayOf(dblin.toRawBits(), pdateout)).toLong().toInt()
}

public fun VarDateFromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, pdateout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarDateFromStr", longArrayOf(strin, lcid.toLong(), dwflags.toLong(), pdateout)).toInt()
}

public fun VarDateFromUI1(bin: UByte, pdateout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarDateFromUI1", longArrayOf(bin.toLong(), pdateout)).toInt()
}

public fun VarDateFromUI2(uiin: UShort, pdateout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarDateFromUI2", longArrayOf(uiin.toLong(), pdateout)).toInt()
}

public fun VarDateFromUI4(ulin: UInt, pdateout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarDateFromUI4", longArrayOf(ulin.toLong(), pdateout)).toInt()
}

public fun VarDateFromUI8(ui64in: ULong, pdateout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarDateFromUI8", longArrayOf(ui64in.toLong(), pdateout)).toInt()
}

public fun VarDateFromUdate(pudatein: Long, dwflags: UInt, pdateout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarDateFromUdate", longArrayOf(pudatein, dwflags.toLong(), pdateout)).toInt()
}

public fun VarDateFromUdateEx(pudatein: Long, lcid: UInt, dwflags: UInt, pdateout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarDateFromUdateEx", longArrayOf(pudatein, lcid.toLong(), dwflags.toLong(), pdateout)).toInt()
}

public fun VarDecAbs(pdecin: Long, pdecresult: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarDecAbs", longArrayOf(pdecin, pdecresult)).toInt()
}

public fun VarDecAdd(pdecleft: Long, pdecright: Long, pdecresult: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarDecAdd", longArrayOf(pdecleft, pdecright, pdecresult)).toInt()
}

public fun VarDecCmp(pdecleft: Long, pdecright: Long): VARCMP {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarDecCmp", longArrayOf(pdecleft, pdecright)).toUInt()
}

public fun VarDecCmpR8(pdecleft: Long, dblright: Double): VARCMP {
    return Win32DynamicFfi.invokeFp("oleaut32.dll", "VarDecCmpR8", 8, false, longArrayOf(pdecleft, dblright.toRawBits())).toLong().toUInt()
}

public fun VarDecDiv(pdecleft: Long, pdecright: Long, pdecresult: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarDecDiv", longArrayOf(pdecleft, pdecright, pdecresult)).toInt()
}

public fun VarDecFix(pdecin: Long, pdecresult: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarDecFix", longArrayOf(pdecin, pdecresult)).toInt()
}

public fun VarDecFromBool(boolin: Foundation.VARIANT_BOOL, pdecout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarDecFromBool", longArrayOf(Win32DynamicFfi.objectSlot(boolin), pdecout)).toInt()
}

public fun VarDecFromCy(cyin: Com.CY, pdecout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarDecFromCy", longArrayOf(Win32DynamicFfi.objectSlot(cyin), pdecout)).toInt()
}

public fun VarDecFromDate(datein: Double, pdecout: Long): HRESULT {
    return Win32DynamicFfi.invokeFp("oleaut32.dll", "VarDecFromDate", 2, false, longArrayOf(datein.toRawBits(), pdecout)).toLong().toInt()
}

public fun VarDecFromDisp(pdispin: Long, lcid: UInt, pdecout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarDecFromDisp", longArrayOf(pdispin, lcid.toLong(), pdecout)).toInt()
}

public fun VarDecFromI1(cin: Byte, pdecout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarDecFromI1", longArrayOf(cin.toLong(), pdecout)).toInt()
}

public fun VarDecFromI2(uiin: Short, pdecout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarDecFromI2", longArrayOf(uiin.toLong(), pdecout)).toInt()
}

public fun VarDecFromI4(lin: Int, pdecout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarDecFromI4", longArrayOf(lin.toLong(), pdecout)).toInt()
}

public fun VarDecFromI8(i64in: Long, pdecout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarDecFromI8", longArrayOf(i64in, pdecout)).toInt()
}

public fun VarDecFromR4(fltin: Float, pdecout: Long): HRESULT {
    return Win32DynamicFfi.invokeFp("oleaut32.dll", "VarDecFromR4", 1, false, longArrayOf((fltin.toRawBits().toLong() and 0xFFFF_FFFFL), pdecout)).toLong().toInt()
}

public fun VarDecFromR8(dblin: Double, pdecout: Long): HRESULT {
    return Win32DynamicFfi.invokeFp("oleaut32.dll", "VarDecFromR8", 2, false, longArrayOf(dblin.toRawBits(), pdecout)).toLong().toInt()
}

public fun VarDecFromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, pdecout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarDecFromStr", longArrayOf(strin, lcid.toLong(), dwflags.toLong(), pdecout)).toInt()
}

public fun VarDecFromUI1(bin: UByte, pdecout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarDecFromUI1", longArrayOf(bin.toLong(), pdecout)).toInt()
}

public fun VarDecFromUI2(uiin: UShort, pdecout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarDecFromUI2", longArrayOf(uiin.toLong(), pdecout)).toInt()
}

public fun VarDecFromUI4(ulin: UInt, pdecout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarDecFromUI4", longArrayOf(ulin.toLong(), pdecout)).toInt()
}

public fun VarDecFromUI8(ui64in: ULong, pdecout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarDecFromUI8", longArrayOf(ui64in.toLong(), pdecout)).toInt()
}

public fun VarDecInt(pdecin: Long, pdecresult: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarDecInt", longArrayOf(pdecin, pdecresult)).toInt()
}

public fun VarDecMul(pdecleft: Long, pdecright: Long, pdecresult: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarDecMul", longArrayOf(pdecleft, pdecright, pdecresult)).toInt()
}

public fun VarDecNeg(pdecin: Long, pdecresult: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarDecNeg", longArrayOf(pdecin, pdecresult)).toInt()
}

public fun VarDecRound(pdecin: Long, cdecimals: Int, pdecresult: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarDecRound", longArrayOf(pdecin, cdecimals.toLong(), pdecresult)).toInt()
}

public fun VarDecSub(pdecleft: Long, pdecright: Long, pdecresult: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarDecSub", longArrayOf(pdecleft, pdecright, pdecresult)).toInt()
}

public fun VarDiv(pvarleft: Long, pvarright: Long, pvarresult: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarDiv", longArrayOf(pvarleft, pvarright, pvarresult)).toInt()
}

public fun VarEqv(pvarleft: Long, pvarright: Long, pvarresult: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarEqv", longArrayOf(pvarleft, pvarright, pvarresult)).toInt()
}

public fun VarFix(pvarin: Long, pvarresult: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarFix", longArrayOf(pvarin, pvarresult)).toInt()
}

public fun VarFormat(pvarin: Long, pstrformat: PCWSTR, ifirstday: VARFORMAT_FIRST_DAY, ifirstweek: VARFORMAT_FIRST_WEEK, dwflags: UInt, pbstrout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarFormat", longArrayOf(pvarin, pstrformat, ifirstday.toLong(), ifirstweek.toLong(), dwflags.toLong(), pbstrout)).toInt()
}

public fun VarFormatCurrency(pvarin: Long, inumdig: Int, iinclead: Int, iuseparens: Int, igroup: Int, dwflags: UInt, pbstrout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarFormatCurrency", longArrayOf(pvarin, inumdig.toLong(), iinclead.toLong(), iuseparens.toLong(), igroup.toLong(), dwflags.toLong(), pbstrout)).toInt()
}

public fun VarFormatDateTime(pvarin: Long, inamedformat: VARFORMAT_NAMED_FORMAT, dwflags: UInt, pbstrout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarFormatDateTime", longArrayOf(pvarin, inamedformat.toLong(), dwflags.toLong(), pbstrout)).toInt()
}

public fun VarFormatFromTokens(pvarin: Long, pstrformat: PCWSTR, pbtokcur: Long, dwflags: UInt, pbstrout: Long, lcid: UInt): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarFormatFromTokens", longArrayOf(pvarin, pstrformat, pbtokcur, dwflags.toLong(), pbstrout, lcid.toLong())).toInt()
}

public fun VarFormatNumber(pvarin: Long, inumdig: Int, iinclead: VARFORMAT_LEADING_DIGIT, iuseparens: VARFORMAT_PARENTHESES, igroup: VARFORMAT_GROUP, dwflags: UInt, pbstrout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarFormatNumber", longArrayOf(pvarin, inumdig.toLong(), iinclead.toLong(), iuseparens.toLong(), igroup.toLong(), dwflags.toLong(), pbstrout)).toInt()
}

public fun VarFormatPercent(pvarin: Long, inumdig: Int, iinclead: VARFORMAT_LEADING_DIGIT, iuseparens: VARFORMAT_PARENTHESES, igroup: VARFORMAT_GROUP, dwflags: UInt, pbstrout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarFormatPercent", longArrayOf(pvarin, inumdig.toLong(), iinclead.toLong(), iuseparens.toLong(), igroup.toLong(), dwflags.toLong(), pbstrout)).toInt()
}

public fun VarI1FromBool(boolin: Foundation.VARIANT_BOOL, pcout: PSTR): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarI1FromBool", longArrayOf(Win32DynamicFfi.objectSlot(boolin), pcout)).toInt()
}

public fun VarI1FromCy(cyin: Com.CY, pcout: PSTR): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarI1FromCy", longArrayOf(Win32DynamicFfi.objectSlot(cyin), pcout)).toInt()
}

public fun VarI1FromDate(datein: Double, pcout: PSTR): HRESULT {
    return Win32DynamicFfi.invokeFp("oleaut32.dll", "VarI1FromDate", 2, false, longArrayOf(datein.toRawBits(), pcout)).toLong().toInt()
}

public fun VarI1FromDec(pdecin: Long, pcout: PSTR): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarI1FromDec", longArrayOf(pdecin, pcout)).toInt()
}

public fun VarI1FromDisp(pdispin: Long, lcid: UInt, pcout: PSTR): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarI1FromDisp", longArrayOf(pdispin, lcid.toLong(), pcout)).toInt()
}

public fun VarI1FromI2(uiin: Short, pcout: PSTR): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarI1FromI2", longArrayOf(uiin.toLong(), pcout)).toInt()
}

public fun VarI1FromI4(lin: Int, pcout: PSTR): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarI1FromI4", longArrayOf(lin.toLong(), pcout)).toInt()
}

public fun VarI1FromI8(i64in: Long, pcout: PSTR): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarI1FromI8", longArrayOf(i64in, pcout)).toInt()
}

public fun VarI1FromR4(fltin: Float, pcout: PSTR): HRESULT {
    return Win32DynamicFfi.invokeFp("oleaut32.dll", "VarI1FromR4", 1, false, longArrayOf((fltin.toRawBits().toLong() and 0xFFFF_FFFFL), pcout)).toLong().toInt()
}

public fun VarI1FromR8(dblin: Double, pcout: PSTR): HRESULT {
    return Win32DynamicFfi.invokeFp("oleaut32.dll", "VarI1FromR8", 2, false, longArrayOf(dblin.toRawBits(), pcout)).toLong().toInt()
}

public fun VarI1FromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, pcout: PSTR): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarI1FromStr", longArrayOf(strin, lcid.toLong(), dwflags.toLong(), pcout)).toInt()
}

public fun VarI1FromUI1(bin: UByte, pcout: PSTR): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarI1FromUI1", longArrayOf(bin.toLong(), pcout)).toInt()
}

public fun VarI1FromUI2(uiin: UShort, pcout: PSTR): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarI1FromUI2", longArrayOf(uiin.toLong(), pcout)).toInt()
}

public fun VarI1FromUI4(ulin: UInt, pcout: PSTR): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarI1FromUI4", longArrayOf(ulin.toLong(), pcout)).toInt()
}

public fun VarI1FromUI8(i64in: ULong, pcout: PSTR): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarI1FromUI8", longArrayOf(i64in.toLong(), pcout)).toInt()
}

public fun VarI2FromBool(boolin: Foundation.VARIANT_BOOL, psout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarI2FromBool", longArrayOf(Win32DynamicFfi.objectSlot(boolin), psout)).toInt()
}

public fun VarI2FromCy(cyin: Com.CY, psout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarI2FromCy", longArrayOf(Win32DynamicFfi.objectSlot(cyin), psout)).toInt()
}

public fun VarI2FromDate(datein: Double, psout: Long): HRESULT {
    return Win32DynamicFfi.invokeFp("oleaut32.dll", "VarI2FromDate", 2, false, longArrayOf(datein.toRawBits(), psout)).toLong().toInt()
}

public fun VarI2FromDec(pdecin: Long, psout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarI2FromDec", longArrayOf(pdecin, psout)).toInt()
}

public fun VarI2FromDisp(pdispin: Long, lcid: UInt, psout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarI2FromDisp", longArrayOf(pdispin, lcid.toLong(), psout)).toInt()
}

public fun VarI2FromI1(cin: Byte, psout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarI2FromI1", longArrayOf(cin.toLong(), psout)).toInt()
}

public fun VarI2FromI4(lin: Int, psout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarI2FromI4", longArrayOf(lin.toLong(), psout)).toInt()
}

public fun VarI2FromI8(i64in: Long, psout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarI2FromI8", longArrayOf(i64in, psout)).toInt()
}

public fun VarI2FromR4(fltin: Float, psout: Long): HRESULT {
    return Win32DynamicFfi.invokeFp("oleaut32.dll", "VarI2FromR4", 1, false, longArrayOf((fltin.toRawBits().toLong() and 0xFFFF_FFFFL), psout)).toLong().toInt()
}

public fun VarI2FromR8(dblin: Double, psout: Long): HRESULT {
    return Win32DynamicFfi.invokeFp("oleaut32.dll", "VarI2FromR8", 2, false, longArrayOf(dblin.toRawBits(), psout)).toLong().toInt()
}

public fun VarI2FromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, psout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarI2FromStr", longArrayOf(strin, lcid.toLong(), dwflags.toLong(), psout)).toInt()
}

public fun VarI2FromUI1(bin: UByte, psout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarI2FromUI1", longArrayOf(bin.toLong(), psout)).toInt()
}

public fun VarI2FromUI2(uiin: UShort, psout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarI2FromUI2", longArrayOf(uiin.toLong(), psout)).toInt()
}

public fun VarI2FromUI4(ulin: UInt, psout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarI2FromUI4", longArrayOf(ulin.toLong(), psout)).toInt()
}

public fun VarI2FromUI8(ui64in: ULong, psout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarI2FromUI8", longArrayOf(ui64in.toLong(), psout)).toInt()
}

public fun VarI4FromBool(boolin: Foundation.VARIANT_BOOL, plout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarI4FromBool", longArrayOf(Win32DynamicFfi.objectSlot(boolin), plout)).toInt()
}

public fun VarI4FromCy(cyin: Com.CY, plout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarI4FromCy", longArrayOf(Win32DynamicFfi.objectSlot(cyin), plout)).toInt()
}

public fun VarI4FromDate(datein: Double, plout: Long): HRESULT {
    return Win32DynamicFfi.invokeFp("oleaut32.dll", "VarI4FromDate", 2, false, longArrayOf(datein.toRawBits(), plout)).toLong().toInt()
}

public fun VarI4FromDec(pdecin: Long, plout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarI4FromDec", longArrayOf(pdecin, plout)).toInt()
}

public fun VarI4FromDisp(pdispin: Long, lcid: UInt, plout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarI4FromDisp", longArrayOf(pdispin, lcid.toLong(), plout)).toInt()
}

public fun VarI4FromI1(cin: Byte, plout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarI4FromI1", longArrayOf(cin.toLong(), plout)).toInt()
}

public fun VarI4FromI2(sin: Short, plout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarI4FromI2", longArrayOf(sin.toLong(), plout)).toInt()
}

public fun VarI4FromI8(i64in: Long, plout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarI4FromI8", longArrayOf(i64in, plout)).toInt()
}

public fun VarI4FromR4(fltin: Float, plout: Long): HRESULT {
    return Win32DynamicFfi.invokeFp("oleaut32.dll", "VarI4FromR4", 1, false, longArrayOf((fltin.toRawBits().toLong() and 0xFFFF_FFFFL), plout)).toLong().toInt()
}

public fun VarI4FromR8(dblin: Double, plout: Long): HRESULT {
    return Win32DynamicFfi.invokeFp("oleaut32.dll", "VarI4FromR8", 2, false, longArrayOf(dblin.toRawBits(), plout)).toLong().toInt()
}

public fun VarI4FromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, plout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarI4FromStr", longArrayOf(strin, lcid.toLong(), dwflags.toLong(), plout)).toInt()
}

public fun VarI4FromUI1(bin: UByte, plout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarI4FromUI1", longArrayOf(bin.toLong(), plout)).toInt()
}

public fun VarI4FromUI2(uiin: UShort, plout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarI4FromUI2", longArrayOf(uiin.toLong(), plout)).toInt()
}

public fun VarI4FromUI4(ulin: UInt, plout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarI4FromUI4", longArrayOf(ulin.toLong(), plout)).toInt()
}

public fun VarI4FromUI8(ui64in: ULong, plout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarI4FromUI8", longArrayOf(ui64in.toLong(), plout)).toInt()
}

public fun VarI8FromBool(boolin: Foundation.VARIANT_BOOL, pi64out: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarI8FromBool", longArrayOf(Win32DynamicFfi.objectSlot(boolin), pi64out)).toInt()
}

public fun VarI8FromCy(cyin: Com.CY, pi64out: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarI8FromCy", longArrayOf(Win32DynamicFfi.objectSlot(cyin), pi64out)).toInt()
}

public fun VarI8FromDate(datein: Double, pi64out: Long): HRESULT {
    return Win32DynamicFfi.invokeFp("oleaut32.dll", "VarI8FromDate", 2, false, longArrayOf(datein.toRawBits(), pi64out)).toLong().toInt()
}

public fun VarI8FromDec(pdecin: Long, pi64out: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarI8FromDec", longArrayOf(pdecin, pi64out)).toInt()
}

public fun VarI8FromDisp(pdispin: Long, lcid: UInt, pi64out: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarI8FromDisp", longArrayOf(pdispin, lcid.toLong(), pi64out)).toInt()
}

public fun VarI8FromI1(cin: Byte, pi64out: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarI8FromI1", longArrayOf(cin.toLong(), pi64out)).toInt()
}

public fun VarI8FromI2(sin: Short, pi64out: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarI8FromI2", longArrayOf(sin.toLong(), pi64out)).toInt()
}

public fun VarI8FromR4(fltin: Float, pi64out: Long): HRESULT {
    return Win32DynamicFfi.invokeFp("oleaut32.dll", "VarI8FromR4", 1, false, longArrayOf((fltin.toRawBits().toLong() and 0xFFFF_FFFFL), pi64out)).toLong().toInt()
}

public fun VarI8FromR8(dblin: Double, pi64out: Long): HRESULT {
    return Win32DynamicFfi.invokeFp("oleaut32.dll", "VarI8FromR8", 2, false, longArrayOf(dblin.toRawBits(), pi64out)).toLong().toInt()
}

public fun VarI8FromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, pi64out: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarI8FromStr", longArrayOf(strin, lcid.toLong(), dwflags.toLong(), pi64out)).toInt()
}

public fun VarI8FromUI1(bin: UByte, pi64out: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarI8FromUI1", longArrayOf(bin.toLong(), pi64out)).toInt()
}

public fun VarI8FromUI2(uiin: UShort, pi64out: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarI8FromUI2", longArrayOf(uiin.toLong(), pi64out)).toInt()
}

public fun VarI8FromUI4(ulin: UInt, pi64out: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarI8FromUI4", longArrayOf(ulin.toLong(), pi64out)).toInt()
}

public fun VarI8FromUI8(ui64in: ULong, pi64out: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarI8FromUI8", longArrayOf(ui64in.toLong(), pi64out)).toInt()
}

public fun VarIdiv(pvarleft: Long, pvarright: Long, pvarresult: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarIdiv", longArrayOf(pvarleft, pvarright, pvarresult)).toInt()
}

public fun VarImp(pvarleft: Long, pvarright: Long, pvarresult: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarImp", longArrayOf(pvarleft, pvarright, pvarresult)).toInt()
}

public fun VarInt(pvarin: Long, pvarresult: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarInt", longArrayOf(pvarin, pvarresult)).toInt()
}

public fun VarMod(pvarleft: Long, pvarright: Long, pvarresult: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarMod", longArrayOf(pvarleft, pvarright, pvarresult)).toInt()
}

public fun VarMonthName(imonth: Int, fabbrev: Int, dwflags: UInt, pbstrout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarMonthName", longArrayOf(imonth.toLong(), fabbrev.toLong(), dwflags.toLong(), pbstrout)).toInt()
}

public fun VarMul(pvarleft: Long, pvarright: Long, pvarresult: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarMul", longArrayOf(pvarleft, pvarright, pvarresult)).toInt()
}

public fun VarNeg(pvarin: Long, pvarresult: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarNeg", longArrayOf(pvarin, pvarresult)).toInt()
}

public fun VarNot(pvarin: Long, pvarresult: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarNot", longArrayOf(pvarin, pvarresult)).toInt()
}

public fun VarNumFromParseNum(pnumprs: Long, rgbdig: Long, dwvtbits: UInt, pvar: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarNumFromParseNum", longArrayOf(pnumprs, rgbdig, dwvtbits.toLong(), pvar)).toInt()
}

public fun VarOr(pvarleft: Long, pvarright: Long, pvarresult: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarOr", longArrayOf(pvarleft, pvarright, pvarresult)).toInt()
}

public fun VarParseNumFromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, pnumprs: Long, rgbdig: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarParseNumFromStr", longArrayOf(strin, lcid.toLong(), dwflags.toLong(), pnumprs, rgbdig)).toInt()
}

public fun VarPow(pvarleft: Long, pvarright: Long, pvarresult: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarPow", longArrayOf(pvarleft, pvarright, pvarresult)).toInt()
}

public fun VarR4CmpR8(fltleft: Float, dblright: Double): VARCMP {
    return Win32DynamicFfi.invokeFp("oleaut32.dll", "VarR4CmpR8", 9, false, longArrayOf((fltleft.toRawBits().toLong() and 0xFFFF_FFFFL), dblright.toRawBits())).toLong().toUInt()
}

public fun VarR4FromBool(boolin: Foundation.VARIANT_BOOL, pfltout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarR4FromBool", longArrayOf(Win32DynamicFfi.objectSlot(boolin), pfltout)).toInt()
}

public fun VarR4FromCy(cyin: Com.CY, pfltout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarR4FromCy", longArrayOf(Win32DynamicFfi.objectSlot(cyin), pfltout)).toInt()
}

public fun VarR4FromDate(datein: Double, pfltout: Long): HRESULT {
    return Win32DynamicFfi.invokeFp("oleaut32.dll", "VarR4FromDate", 2, false, longArrayOf(datein.toRawBits(), pfltout)).toLong().toInt()
}

public fun VarR4FromDec(pdecin: Long, pfltout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarR4FromDec", longArrayOf(pdecin, pfltout)).toInt()
}

public fun VarR4FromDisp(pdispin: Long, lcid: UInt, pfltout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarR4FromDisp", longArrayOf(pdispin, lcid.toLong(), pfltout)).toInt()
}

public fun VarR4FromI1(cin: Byte, pfltout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarR4FromI1", longArrayOf(cin.toLong(), pfltout)).toInt()
}

public fun VarR4FromI2(sin: Short, pfltout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarR4FromI2", longArrayOf(sin.toLong(), pfltout)).toInt()
}

public fun VarR4FromI4(lin: Int, pfltout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarR4FromI4", longArrayOf(lin.toLong(), pfltout)).toInt()
}

public fun VarR4FromI8(i64in: Long, pfltout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarR4FromI8", longArrayOf(i64in, pfltout)).toInt()
}

public fun VarR4FromR8(dblin: Double, pfltout: Long): HRESULT {
    return Win32DynamicFfi.invokeFp("oleaut32.dll", "VarR4FromR8", 2, false, longArrayOf(dblin.toRawBits(), pfltout)).toLong().toInt()
}

public fun VarR4FromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, pfltout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarR4FromStr", longArrayOf(strin, lcid.toLong(), dwflags.toLong(), pfltout)).toInt()
}

public fun VarR4FromUI1(bin: UByte, pfltout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarR4FromUI1", longArrayOf(bin.toLong(), pfltout)).toInt()
}

public fun VarR4FromUI2(uiin: UShort, pfltout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarR4FromUI2", longArrayOf(uiin.toLong(), pfltout)).toInt()
}

public fun VarR4FromUI4(ulin: UInt, pfltout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarR4FromUI4", longArrayOf(ulin.toLong(), pfltout)).toInt()
}

public fun VarR4FromUI8(ui64in: ULong, pfltout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarR4FromUI8", longArrayOf(ui64in.toLong(), pfltout)).toInt()
}

public fun VarR8FromBool(boolin: Foundation.VARIANT_BOOL, pdblout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarR8FromBool", longArrayOf(Win32DynamicFfi.objectSlot(boolin), pdblout)).toInt()
}

public fun VarR8FromCy(cyin: Com.CY, pdblout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarR8FromCy", longArrayOf(Win32DynamicFfi.objectSlot(cyin), pdblout)).toInt()
}

public fun VarR8FromDate(datein: Double, pdblout: Long): HRESULT {
    return Win32DynamicFfi.invokeFp("oleaut32.dll", "VarR8FromDate", 2, false, longArrayOf(datein.toRawBits(), pdblout)).toLong().toInt()
}

public fun VarR8FromDec(pdecin: Long, pdblout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarR8FromDec", longArrayOf(pdecin, pdblout)).toInt()
}

public fun VarR8FromDisp(pdispin: Long, lcid: UInt, pdblout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarR8FromDisp", longArrayOf(pdispin, lcid.toLong(), pdblout)).toInt()
}

public fun VarR8FromI1(cin: Byte, pdblout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarR8FromI1", longArrayOf(cin.toLong(), pdblout)).toInt()
}

public fun VarR8FromI2(sin: Short, pdblout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarR8FromI2", longArrayOf(sin.toLong(), pdblout)).toInt()
}

public fun VarR8FromI4(lin: Int, pdblout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarR8FromI4", longArrayOf(lin.toLong(), pdblout)).toInt()
}

public fun VarR8FromI8(i64in: Long, pdblout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarR8FromI8", longArrayOf(i64in, pdblout)).toInt()
}

public fun VarR8FromR4(fltin: Float, pdblout: Long): HRESULT {
    return Win32DynamicFfi.invokeFp("oleaut32.dll", "VarR8FromR4", 1, false, longArrayOf((fltin.toRawBits().toLong() and 0xFFFF_FFFFL), pdblout)).toLong().toInt()
}

public fun VarR8FromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, pdblout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarR8FromStr", longArrayOf(strin, lcid.toLong(), dwflags.toLong(), pdblout)).toInt()
}

public fun VarR8FromUI1(bin: UByte, pdblout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarR8FromUI1", longArrayOf(bin.toLong(), pdblout)).toInt()
}

public fun VarR8FromUI2(uiin: UShort, pdblout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarR8FromUI2", longArrayOf(uiin.toLong(), pdblout)).toInt()
}

public fun VarR8FromUI4(ulin: UInt, pdblout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarR8FromUI4", longArrayOf(ulin.toLong(), pdblout)).toInt()
}

public fun VarR8FromUI8(ui64in: ULong, pdblout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarR8FromUI8", longArrayOf(ui64in.toLong(), pdblout)).toInt()
}

public fun VarR8Pow(dblleft: Double, dblright: Double, pdblresult: Long): HRESULT {
    return Win32DynamicFfi.invokeFp("oleaut32.dll", "VarR8Pow", 10, false, longArrayOf(dblleft.toRawBits(), dblright.toRawBits(), pdblresult)).toLong().toInt()
}

public fun VarR8Round(dblin: Double, cdecimals: Int, pdblresult: Long): HRESULT {
    return Win32DynamicFfi.invokeFp("oleaut32.dll", "VarR8Round", 2, false, longArrayOf(dblin.toRawBits(), cdecimals.toLong(), pdblresult)).toLong().toInt()
}

public fun VarRound(pvarin: Long, cdecimals: Int, pvarresult: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarRound", longArrayOf(pvarin, cdecimals.toLong(), pvarresult)).toInt()
}

public fun VarSub(pvarleft: Long, pvarright: Long, pvarresult: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarSub", longArrayOf(pvarleft, pvarright, pvarresult)).toInt()
}

public fun VarTokenizeFormatString(pstrformat: PCWSTR, rgbtok: Long, cbtok: Int, ifirstday: VARFORMAT_FIRST_DAY, ifirstweek: VARFORMAT_FIRST_WEEK, lcid: UInt, pcbactual: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarTokenizeFormatString", longArrayOf(pstrformat, rgbtok, cbtok.toLong(), ifirstday.toLong(), ifirstweek.toLong(), lcid.toLong(), pcbactual)).toInt()
}

public fun VarUI1FromBool(boolin: Foundation.VARIANT_BOOL, pbout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarUI1FromBool", longArrayOf(Win32DynamicFfi.objectSlot(boolin), pbout)).toInt()
}

public fun VarUI1FromCy(cyin: Com.CY, pbout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarUI1FromCy", longArrayOf(Win32DynamicFfi.objectSlot(cyin), pbout)).toInt()
}

public fun VarUI1FromDate(datein: Double, pbout: Long): HRESULT {
    return Win32DynamicFfi.invokeFp("oleaut32.dll", "VarUI1FromDate", 2, false, longArrayOf(datein.toRawBits(), pbout)).toLong().toInt()
}

public fun VarUI1FromDec(pdecin: Long, pbout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarUI1FromDec", longArrayOf(pdecin, pbout)).toInt()
}

public fun VarUI1FromDisp(pdispin: Long, lcid: UInt, pbout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarUI1FromDisp", longArrayOf(pdispin, lcid.toLong(), pbout)).toInt()
}

public fun VarUI1FromI1(cin: Byte, pbout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarUI1FromI1", longArrayOf(cin.toLong(), pbout)).toInt()
}

public fun VarUI1FromI2(sin: Short, pbout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarUI1FromI2", longArrayOf(sin.toLong(), pbout)).toInt()
}

public fun VarUI1FromI4(lin: Int, pbout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarUI1FromI4", longArrayOf(lin.toLong(), pbout)).toInt()
}

public fun VarUI1FromI8(i64in: Long, pbout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarUI1FromI8", longArrayOf(i64in, pbout)).toInt()
}

public fun VarUI1FromR4(fltin: Float, pbout: Long): HRESULT {
    return Win32DynamicFfi.invokeFp("oleaut32.dll", "VarUI1FromR4", 1, false, longArrayOf((fltin.toRawBits().toLong() and 0xFFFF_FFFFL), pbout)).toLong().toInt()
}

public fun VarUI1FromR8(dblin: Double, pbout: Long): HRESULT {
    return Win32DynamicFfi.invokeFp("oleaut32.dll", "VarUI1FromR8", 2, false, longArrayOf(dblin.toRawBits(), pbout)).toLong().toInt()
}

public fun VarUI1FromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, pbout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarUI1FromStr", longArrayOf(strin, lcid.toLong(), dwflags.toLong(), pbout)).toInt()
}

public fun VarUI1FromUI2(uiin: UShort, pbout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarUI1FromUI2", longArrayOf(uiin.toLong(), pbout)).toInt()
}

public fun VarUI1FromUI4(ulin: UInt, pbout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarUI1FromUI4", longArrayOf(ulin.toLong(), pbout)).toInt()
}

public fun VarUI1FromUI8(ui64in: ULong, pbout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarUI1FromUI8", longArrayOf(ui64in.toLong(), pbout)).toInt()
}

public fun VarUI2FromBool(boolin: Foundation.VARIANT_BOOL, puiout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarUI2FromBool", longArrayOf(Win32DynamicFfi.objectSlot(boolin), puiout)).toInt()
}

public fun VarUI2FromCy(cyin: Com.CY, puiout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarUI2FromCy", longArrayOf(Win32DynamicFfi.objectSlot(cyin), puiout)).toInt()
}

public fun VarUI2FromDate(datein: Double, puiout: Long): HRESULT {
    return Win32DynamicFfi.invokeFp("oleaut32.dll", "VarUI2FromDate", 2, false, longArrayOf(datein.toRawBits(), puiout)).toLong().toInt()
}

public fun VarUI2FromDec(pdecin: Long, puiout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarUI2FromDec", longArrayOf(pdecin, puiout)).toInt()
}

public fun VarUI2FromDisp(pdispin: Long, lcid: UInt, puiout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarUI2FromDisp", longArrayOf(pdispin, lcid.toLong(), puiout)).toInt()
}

public fun VarUI2FromI1(cin: Byte, puiout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarUI2FromI1", longArrayOf(cin.toLong(), puiout)).toInt()
}

public fun VarUI2FromI2(uiin: Short, puiout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarUI2FromI2", longArrayOf(uiin.toLong(), puiout)).toInt()
}

public fun VarUI2FromI4(lin: Int, puiout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarUI2FromI4", longArrayOf(lin.toLong(), puiout)).toInt()
}

public fun VarUI2FromI8(i64in: Long, puiout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarUI2FromI8", longArrayOf(i64in, puiout)).toInt()
}

public fun VarUI2FromR4(fltin: Float, puiout: Long): HRESULT {
    return Win32DynamicFfi.invokeFp("oleaut32.dll", "VarUI2FromR4", 1, false, longArrayOf((fltin.toRawBits().toLong() and 0xFFFF_FFFFL), puiout)).toLong().toInt()
}

public fun VarUI2FromR8(dblin: Double, puiout: Long): HRESULT {
    return Win32DynamicFfi.invokeFp("oleaut32.dll", "VarUI2FromR8", 2, false, longArrayOf(dblin.toRawBits(), puiout)).toLong().toInt()
}

public fun VarUI2FromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, puiout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarUI2FromStr", longArrayOf(strin, lcid.toLong(), dwflags.toLong(), puiout)).toInt()
}

public fun VarUI2FromUI1(bin: UByte, puiout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarUI2FromUI1", longArrayOf(bin.toLong(), puiout)).toInt()
}

public fun VarUI2FromUI4(ulin: UInt, puiout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarUI2FromUI4", longArrayOf(ulin.toLong(), puiout)).toInt()
}

public fun VarUI2FromUI8(i64in: ULong, puiout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarUI2FromUI8", longArrayOf(i64in.toLong(), puiout)).toInt()
}

public fun VarUI4FromBool(boolin: Foundation.VARIANT_BOOL, pulout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarUI4FromBool", longArrayOf(Win32DynamicFfi.objectSlot(boolin), pulout)).toInt()
}

public fun VarUI4FromCy(cyin: Com.CY, pulout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarUI4FromCy", longArrayOf(Win32DynamicFfi.objectSlot(cyin), pulout)).toInt()
}

public fun VarUI4FromDate(datein: Double, pulout: Long): HRESULT {
    return Win32DynamicFfi.invokeFp("oleaut32.dll", "VarUI4FromDate", 2, false, longArrayOf(datein.toRawBits(), pulout)).toLong().toInt()
}

public fun VarUI4FromDec(pdecin: Long, pulout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarUI4FromDec", longArrayOf(pdecin, pulout)).toInt()
}

public fun VarUI4FromDisp(pdispin: Long, lcid: UInt, pulout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarUI4FromDisp", longArrayOf(pdispin, lcid.toLong(), pulout)).toInt()
}

public fun VarUI4FromI1(cin: Byte, pulout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarUI4FromI1", longArrayOf(cin.toLong(), pulout)).toInt()
}

public fun VarUI4FromI2(uiin: Short, pulout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarUI4FromI2", longArrayOf(uiin.toLong(), pulout)).toInt()
}

public fun VarUI4FromI4(lin: Int, pulout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarUI4FromI4", longArrayOf(lin.toLong(), pulout)).toInt()
}

public fun VarUI4FromI8(i64in: Long, plout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarUI4FromI8", longArrayOf(i64in, plout)).toInt()
}

public fun VarUI4FromR4(fltin: Float, pulout: Long): HRESULT {
    return Win32DynamicFfi.invokeFp("oleaut32.dll", "VarUI4FromR4", 1, false, longArrayOf((fltin.toRawBits().toLong() and 0xFFFF_FFFFL), pulout)).toLong().toInt()
}

public fun VarUI4FromR8(dblin: Double, pulout: Long): HRESULT {
    return Win32DynamicFfi.invokeFp("oleaut32.dll", "VarUI4FromR8", 2, false, longArrayOf(dblin.toRawBits(), pulout)).toLong().toInt()
}

public fun VarUI4FromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, pulout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarUI4FromStr", longArrayOf(strin, lcid.toLong(), dwflags.toLong(), pulout)).toInt()
}

public fun VarUI4FromUI1(bin: UByte, pulout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarUI4FromUI1", longArrayOf(bin.toLong(), pulout)).toInt()
}

public fun VarUI4FromUI2(uiin: UShort, pulout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarUI4FromUI2", longArrayOf(uiin.toLong(), pulout)).toInt()
}

public fun VarUI4FromUI8(ui64in: ULong, plout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarUI4FromUI8", longArrayOf(ui64in.toLong(), plout)).toInt()
}

public fun VarUI8FromBool(boolin: Foundation.VARIANT_BOOL, pi64out: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarUI8FromBool", longArrayOf(Win32DynamicFfi.objectSlot(boolin), pi64out)).toInt()
}

public fun VarUI8FromCy(cyin: Com.CY, pi64out: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarUI8FromCy", longArrayOf(Win32DynamicFfi.objectSlot(cyin), pi64out)).toInt()
}

public fun VarUI8FromDate(datein: Double, pi64out: Long): HRESULT {
    return Win32DynamicFfi.invokeFp("oleaut32.dll", "VarUI8FromDate", 2, false, longArrayOf(datein.toRawBits(), pi64out)).toLong().toInt()
}

public fun VarUI8FromDec(pdecin: Long, pi64out: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarUI8FromDec", longArrayOf(pdecin, pi64out)).toInt()
}

public fun VarUI8FromDisp(pdispin: Long, lcid: UInt, pi64out: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarUI8FromDisp", longArrayOf(pdispin, lcid.toLong(), pi64out)).toInt()
}

public fun VarUI8FromI1(cin: Byte, pi64out: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarUI8FromI1", longArrayOf(cin.toLong(), pi64out)).toInt()
}

public fun VarUI8FromI2(sin: Short, pi64out: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarUI8FromI2", longArrayOf(sin.toLong(), pi64out)).toInt()
}

public fun VarUI8FromI8(ui64in: Long, pi64out: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarUI8FromI8", longArrayOf(ui64in, pi64out)).toInt()
}

public fun VarUI8FromR4(fltin: Float, pi64out: Long): HRESULT {
    return Win32DynamicFfi.invokeFp("oleaut32.dll", "VarUI8FromR4", 1, false, longArrayOf((fltin.toRawBits().toLong() and 0xFFFF_FFFFL), pi64out)).toLong().toInt()
}

public fun VarUI8FromR8(dblin: Double, pi64out: Long): HRESULT {
    return Win32DynamicFfi.invokeFp("oleaut32.dll", "VarUI8FromR8", 2, false, longArrayOf(dblin.toRawBits(), pi64out)).toLong().toInt()
}

public fun VarUI8FromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, pi64out: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarUI8FromStr", longArrayOf(strin, lcid.toLong(), dwflags.toLong(), pi64out)).toInt()
}

public fun VarUI8FromUI1(bin: UByte, pi64out: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarUI8FromUI1", longArrayOf(bin.toLong(), pi64out)).toInt()
}

public fun VarUI8FromUI2(uiin: UShort, pi64out: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarUI8FromUI2", longArrayOf(uiin.toLong(), pi64out)).toInt()
}

public fun VarUI8FromUI4(ulin: UInt, pi64out: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarUI8FromUI4", longArrayOf(ulin.toLong(), pi64out)).toInt()
}

public fun VarUdateFromDate(datein: Double, dwflags: UInt, pudateout: Long): HRESULT {
    return Win32DynamicFfi.invokeFp("oleaut32.dll", "VarUdateFromDate", 2, false, longArrayOf(datein.toRawBits(), dwflags.toLong(), pudateout)).toLong().toInt()
}

public fun VarWeekdayName(iweekday: Int, fabbrev: Int, ifirstday: Int, dwflags: UInt, pbstrout: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarWeekdayName", longArrayOf(iweekday.toLong(), fabbrev.toLong(), ifirstday.toLong(), dwflags.toLong(), pbstrout)).toInt()
}

public fun VarXor(pvarleft: Long, pvarright: Long, pvarresult: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VarXor", longArrayOf(pvarleft, pvarright, pvarresult)).toInt()
}

public fun VectorFromBstr(bstr: BSTR, ppsa: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VectorFromBstr", longArrayOf(bstr, ppsa)).toInt()
}
