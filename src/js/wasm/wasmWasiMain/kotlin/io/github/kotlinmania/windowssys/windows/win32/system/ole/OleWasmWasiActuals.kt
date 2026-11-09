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

public actual fun BstrFromVector(psa: Long, pbstr: Long): HRESULT =
    0

public actual fun ClearCustData(pcustdata: Long) {
}

public actual fun CreateDispTypeInfo(pidata: Long, lcid: UInt, pptinfo: Long): HRESULT =
    0

public actual fun CreateErrorInfo(pperrinfo: Long): HRESULT =
    0

public actual fun CreateOleAdviseHolder(ppoaholder: Long): HRESULT =
    0

public actual fun CreateStdDispatch(punkouter: Long, pvthis: Long, ptinfo: Long, ppunkstddisp: Long): HRESULT =
    0

public actual fun CreateTypeLib(syskind: SYSKIND, szfile: PCWSTR, ppctlib: Long): HRESULT =
    0

public actual fun CreateTypeLib2(syskind: SYSKIND, szfile: PCWSTR, ppctlib: Long): HRESULT =
    0

public actual fun DispCallFunc(pvinstance: Long, ovft: ULong, cc: CALLCONV, vtreturn: VARENUM, cactuals: UInt, prgvt: Long, prgpvarg: Long, pvargresult: Long): HRESULT =
    0

public actual fun DispGetIDsOfNames(ptinfo: Long, rgsznames: Long, cnames: UInt, rgdispid: Long): HRESULT =
    0

public actual fun DispGetParam(pdispparams: Long, position: UInt, vttarg: VARENUM, pvarresult: Long, puargerr: Long): HRESULT =
    0

public actual fun DispInvoke(_this: Long, ptinfo: Long, dispidmember: Int, wflags: UShort, pparams: Long, pvarresult: Long, pexcepinfo: Long, puargerr: Long): HRESULT =
    0

public actual fun DoDragDrop(pdataobj: Long, pdropsource: Long, dwokeffects: DROPEFFECT, pdweffect: Long): HRESULT =
    0

public actual fun GetActiveObject(rclsid: Long, pvreserved: Long, ppunk: Long): HRESULT =
    0

public actual fun GetAltMonthNames(lcid: UInt, prgp: Long): HRESULT =
    0

public actual fun GetRecordInfoFromGuids(rguidtypelib: Long, uvermajor: UInt, uverminor: UInt, lcid: UInt, rguidtypeinfo: Long, pprecinfo: Long): HRESULT =
    0

public actual fun GetRecordInfoFromTypeInfo(ptypeinfo: Long, pprecinfo: Long): HRESULT =
    0

public actual fun HRGN_UserFree(param0: Long, param1: Long) {
}

public actual fun HRGN_UserFree64(param0: Long, param1: Long) {
}

public actual fun HRGN_UserMarshal(param0: Long, param1: Long, param2: Long): Long =
    0L

public actual fun HRGN_UserMarshal64(param0: Long, param1: Long, param2: Long): Long =
    0L

public actual fun HRGN_UserSize(param0: Long, param1: UInt, param2: Long): UInt =
    0u

public actual fun HRGN_UserSize64(param0: Long, param1: UInt, param2: Long): UInt =
    0u

public actual fun HRGN_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long =
    0L

public actual fun HRGN_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long =
    0L

public actual fun IsAccelerator(haccel: HACCEL, caccelentries: Int, lpmsg: Long, lpwcmd: Long): BOOL =
    0

public actual fun LHashValOfNameSys(syskind: SYSKIND, lcid: UInt, szname: PCWSTR): UInt =
    0u

public actual fun LHashValOfNameSysA(syskind: SYSKIND, lcid: UInt, szname: PCSTR): UInt =
    0u

public actual fun LoadRegTypeLib(rguid: Long, wvermajor: UShort, wverminor: UShort, lcid: UInt, pptlib: Long): HRESULT =
    0

public actual fun LoadTypeLib(szfile: PCWSTR, pptlib: Long): HRESULT =
    0

public actual fun LoadTypeLibEx(szfile: PCWSTR, regkind: REGKIND, pptlib: Long): HRESULT =
    0

public actual fun OaBuildVersion(): UInt =
    0u

public actual fun OaEnablePerUserTLibRegistration() {
}

public actual fun OleBuildVersion(): UInt =
    0u

public actual fun OleConvertOLESTREAMToIStorage2(lpolestream: Long, pstg: Long, ptd: Long, opt: UInt, pvcallbackcontext: Long, pqueryconvertolelinkcallback: OLESTREAMQUERYCONVERTOLELINKCALLBACK): HRESULT =
    0

public actual fun OleConvertOLESTREAMToIStorageEx2(polestm: Long, pstg: Long, pcfformat: Long, plwwidth: Long, plheight: Long, pdwsize: Long, pmedium: Long, opt: UInt, pvcallbackcontext: Long, pqueryconvertolelinkcallback: OLESTREAMQUERYCONVERTOLELINKCALLBACK): HRESULT =
    0

public actual fun OleCreate(rclsid: Long, riid: Long, renderopt: UInt, pformatetc: Long, pclientsite: Long, pstg: Long, ppvobj: Long): HRESULT =
    0

public actual fun OleCreateDefaultHandler(clsid: Long, punkouter: Long, riid: Long, lplpobj: Long): HRESULT =
    0

public actual fun OleCreateEmbeddingHelper(clsid: Long, punkouter: Long, flags: EMBDHLP_FLAGS, pcf: Long, riid: Long, lplpobj: Long): HRESULT =
    0

public actual fun OleCreateEx(rclsid: Long, riid: Long, dwflags: OLECREATE, renderopt: UInt, cformats: UInt, rgadvf: Long, rgformatetc: Long, lpadvisesink: Long, rgdwconnection: Long, pclientsite: Long, pstg: Long, ppvobj: Long): HRESULT =
    0

public actual fun OleCreateFontIndirect(lpfontdesc: Long, riid: Long, lplpvobj: Long): HRESULT =
    0

public actual fun OleCreateFromData(psrcdataobj: Long, riid: Long, renderopt: UInt, pformatetc: Long, pclientsite: Long, pstg: Long, ppvobj: Long): HRESULT =
    0

public actual fun OleCreateFromDataEx(psrcdataobj: Long, riid: Long, dwflags: OLECREATE, renderopt: UInt, cformats: UInt, rgadvf: Long, rgformatetc: Long, lpadvisesink: Long, rgdwconnection: Long, pclientsite: Long, pstg: Long, ppvobj: Long): HRESULT =
    0

public actual fun OleCreateFromFile(rclsid: Long, lpszfilename: PCWSTR, riid: Long, renderopt: UInt, lpformatetc: Long, pclientsite: Long, pstg: Long, ppvobj: Long): HRESULT =
    0

public actual fun OleCreateFromFileEx(rclsid: Long, lpszfilename: PCWSTR, riid: Long, dwflags: OLECREATE, renderopt: UInt, cformats: UInt, rgadvf: Long, rgformatetc: Long, lpadvisesink: Long, rgdwconnection: Long, pclientsite: Long, pstg: Long, ppvobj: Long): HRESULT =
    0

public actual fun OleCreateLink(pmklinksrc: Long, riid: Long, renderopt: UInt, lpformatetc: Long, pclientsite: Long, pstg: Long, ppvobj: Long): HRESULT =
    0

public actual fun OleCreateLinkEx(pmklinksrc: Long, riid: Long, dwflags: OLECREATE, renderopt: UInt, cformats: UInt, rgadvf: Long, rgformatetc: Long, lpadvisesink: Long, rgdwconnection: Long, pclientsite: Long, pstg: Long, ppvobj: Long): HRESULT =
    0

public actual fun OleCreateLinkFromData(psrcdataobj: Long, riid: Long, renderopt: UInt, pformatetc: Long, pclientsite: Long, pstg: Long, ppvobj: Long): HRESULT =
    0

public actual fun OleCreateLinkFromDataEx(psrcdataobj: Long, riid: Long, dwflags: OLECREATE, renderopt: UInt, cformats: UInt, rgadvf: Long, rgformatetc: Long, lpadvisesink: Long, rgdwconnection: Long, pclientsite: Long, pstg: Long, ppvobj: Long): HRESULT =
    0

public actual fun OleCreateLinkToFile(lpszfilename: PCWSTR, riid: Long, renderopt: UInt, lpformatetc: Long, pclientsite: Long, pstg: Long, ppvobj: Long): HRESULT =
    0

public actual fun OleCreateLinkToFileEx(lpszfilename: PCWSTR, riid: Long, dwflags: OLECREATE, renderopt: UInt, cformats: UInt, rgadvf: Long, rgformatetc: Long, lpadvisesink: Long, rgdwconnection: Long, pclientsite: Long, pstg: Long, ppvobj: Long): HRESULT =
    0

public actual fun OleCreateMenuDescriptor(hmenucombined: HMENU, lpmenuwidths: Long): Long =
    0L

public actual fun OleCreatePictureIndirect(lppictdesc: Long, riid: Long, fown: BOOL, lplpvobj: Long): HRESULT =
    0

public actual fun OleCreatePropertyFrame(hwndowner: HWND, x: UInt, y: UInt, lpszcaption: PCWSTR, cobjects: UInt, ppunk: Long, cpages: UInt, ppageclsid: Long, lcid: UInt, dwreserved: UInt, pvreserved: Long): HRESULT =
    0

public actual fun OleCreatePropertyFrameIndirect(lpparams: Long): HRESULT =
    0

public actual fun OleCreateStaticFromData(psrcdataobj: Long, iid: Long, renderopt: UInt, pformatetc: Long, pclientsite: Long, pstg: Long, ppvobj: Long): HRESULT =
    0

public actual fun OleDestroyMenuDescriptor(holemenu: Long): HRESULT =
    0

public actual fun OleDoAutoConvert(pstg: Long, pclsidnew: Long): HRESULT =
    0

public actual fun OleDraw(punknown: Long, dwaspect: UInt, hdcdraw: HDC, lprcbounds: Long): HRESULT =
    0

public actual fun OleDuplicateData(hsrc: HANDLE, cfformat: CLIPBOARD_FORMAT, uiflags: GLOBAL_ALLOC_FLAGS): HANDLE =
    0L

public actual fun OleFlushClipboard(): HRESULT =
    0

public actual fun OleGetAutoConvert(clsidold: Long, pclsidnew: Long): HRESULT =
    0

public actual fun OleGetClipboard(ppdataobj: Long): HRESULT =
    0

public actual fun OleGetClipboardWithEnterpriseInfo(dataobject: Long, dataenterpriseid: Long, sourcedescription: Long, targetdescription: Long, datadescription: Long): HRESULT =
    0

public actual fun OleGetIconOfClass(rclsid: Long, lpszlabel: PCWSTR, fusetypeaslabel: BOOL): HGLOBAL =
    0L

public actual fun OleGetIconOfFile(lpszpath: PCWSTR, fusefileaslabel: BOOL): HGLOBAL =
    0L

public actual fun OleIconToCursor(hinstexe: HINSTANCE, hicon: HICON): HCURSOR =
    0L

public actual fun OleInitialize(pvreserved: Long): HRESULT =
    0

public actual fun OleIsCurrentClipboard(pdataobj: Long): HRESULT =
    0

public actual fun OleIsRunning(pobject: Long): BOOL =
    0

public actual fun OleLoad(pstg: Long, riid: Long, pclientsite: Long, ppvobj: Long): HRESULT =
    0

public actual fun OleLoadFromStream(pstm: Long, iidinterface: Long, ppvobj: Long): HRESULT =
    0

public actual fun OleLoadPicture(lpstream: Long, lsize: Int, frunmode: BOOL, riid: Long, lplpvobj: Long): HRESULT =
    0

public actual fun OleLoadPictureEx(lpstream: Long, lsize: Int, frunmode: BOOL, riid: Long, xsizedesired: UInt, ysizedesired: UInt, dwflags: LOAD_PICTURE_FLAGS, lplpvobj: Long): HRESULT =
    0

public actual fun OleLoadPictureFile(varfilename: VARIANT, lplpdisppicture: Long): HRESULT =
    0

public actual fun OleLoadPictureFileEx(varfilename: VARIANT, xsizedesired: UInt, ysizedesired: UInt, dwflags: LOAD_PICTURE_FLAGS, lplpdisppicture: Long): HRESULT =
    0

public actual fun OleLoadPicturePath(szurlorpath: PCWSTR, punkcaller: Long, dwreserved: UInt, clrreserved: UInt, riid: Long, ppvret: Long): HRESULT =
    0

public actual fun OleLockRunning(punknown: Long, flock: BOOL, flastunlockcloses: BOOL): HRESULT =
    0

public actual fun OleMetafilePictFromIconAndLabel(hicon: HICON, lpszlabel: PCWSTR, lpszsourcefile: PCWSTR, iiconindex: UInt): HGLOBAL =
    0L

public actual fun OleNoteObjectVisible(punknown: Long, fvisible: BOOL): HRESULT =
    0

public actual fun OleQueryCreateFromData(psrcdataobject: Long): HRESULT =
    0

public actual fun OleQueryLinkFromData(psrcdataobject: Long): HRESULT =
    0

public actual fun OleRegEnumFormatEtc(clsid: Long, dwdirection: UInt, ppenum: Long): HRESULT =
    0

public actual fun OleRegEnumVerbs(clsid: Long, ppenum: Long): HRESULT =
    0

public actual fun OleRegGetMiscStatus(clsid: Long, dwaspect: UInt, pdwstatus: Long): HRESULT =
    0

public actual fun OleRegGetUserType(clsid: Long, dwformoftype: UInt, pszusertype: Long): HRESULT =
    0

public actual fun OleRun(punknown: Long): HRESULT =
    0

public actual fun OleSave(pps: Long, pstg: Long, fsameasload: BOOL): HRESULT =
    0

public actual fun OleSavePictureFile(lpdisppicture: Long, bstrfilename: BSTR): HRESULT =
    0

public actual fun OleSaveToStream(ppstm: Long, pstm: Long): HRESULT =
    0

public actual fun OleSetAutoConvert(clsidold: Long, clsidnew: Long): HRESULT =
    0

public actual fun OleSetClipboard(pdataobj: Long): HRESULT =
    0

public actual fun OleSetContainedObject(punknown: Long, fcontained: BOOL): HRESULT =
    0

public actual fun OleSetMenuDescriptor(holemenu: Long, hwndframe: HWND, hwndactiveobject: HWND, lpframe: Long, lpactiveobj: Long): HRESULT =
    0

public actual fun OleTranslateAccelerator(lpframe: Long, lpframeinfo: Long, lpmsg: Long): HRESULT =
    0

public actual fun OleTranslateColor(clr: UInt, hpal: HPALETTE, lpcolorref: Long): HRESULT =
    0

public actual fun OleUIAddVerbMenuA(lpoleobj: Long, lpszshorttype: PCSTR, hmenu: HMENU, upos: UInt, uidverbmin: UInt, uidverbmax: UInt, baddconvert: BOOL, idconvert: UInt, lphmenu: Long): BOOL =
    0

public actual fun OleUIAddVerbMenuW(lpoleobj: Long, lpszshorttype: PCWSTR, hmenu: HMENU, upos: UInt, uidverbmin: UInt, uidverbmax: UInt, baddconvert: BOOL, idconvert: UInt, lphmenu: Long): BOOL =
    0

public actual fun OleUIBusyA(param0: Long): UInt =
    0u

public actual fun OleUIBusyW(param0: Long): UInt =
    0u

public actual fun OleUICanConvertOrActivateAs(rclsid: Long, fislinkedobject: BOOL, wformat: UShort): BOOL =
    0

public actual fun OleUIChangeIconA(param0: Long): UInt =
    0u

public actual fun OleUIChangeIconW(param0: Long): UInt =
    0u

public actual fun OleUIChangeSourceA(param0: Long): UInt =
    0u

public actual fun OleUIChangeSourceW(param0: Long): UInt =
    0u

public actual fun OleUIConvertA(param0: Long): UInt =
    0u

public actual fun OleUIConvertW(param0: Long): UInt =
    0u

public actual fun OleUIEditLinksA(param0: Long): UInt =
    0u

public actual fun OleUIEditLinksW(param0: Long): UInt =
    0u

public actual fun OleUIInsertObjectA(param0: Long): UInt =
    0u

public actual fun OleUIInsertObjectW(param0: Long): UInt =
    0u

public actual fun OleUIObjectPropertiesA(param0: Long): UInt =
    0u

public actual fun OleUIObjectPropertiesW(param0: Long): UInt =
    0u

public actual fun OleUIPasteSpecialA(param0: Long): UInt =
    0u

public actual fun OleUIPasteSpecialW(param0: Long): UInt =
    0u

public actual fun OleUIPromptUserA(ntemplate: Int, hwndparent: HWND): Int =
    0

public actual fun OleUIPromptUserW(ntemplate: Int, hwndparent: HWND): Int =
    0

public actual fun OleUIUpdateLinksA(lpoleuilinkcntr: Long, hwndparent: HWND, lpsztitle: PCSTR, clinks: Int): BOOL =
    0

public actual fun OleUIUpdateLinksW(lpoleuilinkcntr: Long, hwndparent: HWND, lpsztitle: PCWSTR, clinks: Int): BOOL =
    0

public actual fun OleUninitialize() {
}

public actual fun QueryPathOfRegTypeLib(guid: Long, wmaj: UShort, wmin: UShort, lcid: UInt, lpbstrpathname: Long): HRESULT =
    0

public actual fun RegisterActiveObject(punk: Long, rclsid: Long, dwflags: ACTIVEOBJECT_FLAGS, pdwregister: Long): HRESULT =
    0

public actual fun RegisterDragDrop(hwnd: HWND, pdroptarget: Long): HRESULT =
    0

public actual fun RegisterTypeLib(ptlib: Long, szfullpath: PCWSTR, szhelpdir: PCWSTR): HRESULT =
    0

public actual fun RegisterTypeLibForUser(ptlib: Long, szfullpath: PCWSTR, szhelpdir: PCWSTR): HRESULT =
    0

public actual fun ReleaseStgMedium(param0: Long) {
}

public actual fun RevokeActiveObject(dwregister: UInt, pvreserved: Long): HRESULT =
    0

public actual fun RevokeDragDrop(hwnd: HWND): HRESULT =
    0

public actual fun SafeArrayAccessData(psa: Long, ppvdata: Long): HRESULT =
    0

public actual fun SafeArrayAddRef(psa: Long, ppdatatorelease: Long): HRESULT =
    0

public actual fun SafeArrayAllocData(psa: Long): HRESULT =
    0

public actual fun SafeArrayAllocDescriptor(cdims: UInt, ppsaout: Long): HRESULT =
    0

public actual fun SafeArrayAllocDescriptorEx(vt: VARENUM, cdims: UInt, ppsaout: Long): HRESULT =
    0

public actual fun SafeArrayCopy(psa: Long, ppsaout: Long): HRESULT =
    0

public actual fun SafeArrayCopyData(psasource: Long, psatarget: Long): HRESULT =
    0

public actual fun SafeArrayCreate(vt: VARENUM, cdims: UInt, rgsabound: Long): Long =
    0L

public actual fun SafeArrayCreateEx(vt: VARENUM, cdims: UInt, rgsabound: Long, pvextra: Long): Long =
    0L

public actual fun SafeArrayCreateVector(vt: VARENUM, llbound: Int, celements: UInt): Long =
    0L

public actual fun SafeArrayCreateVectorEx(vt: VARENUM, llbound: Int, celements: UInt, pvextra: Long): Long =
    0L

public actual fun SafeArrayDestroy(psa: Long): HRESULT =
    0

public actual fun SafeArrayDestroyData(psa: Long): HRESULT =
    0

public actual fun SafeArrayDestroyDescriptor(psa: Long): HRESULT =
    0

public actual fun SafeArrayGetDim(psa: Long): UInt =
    0u

public actual fun SafeArrayGetElement(psa: Long, rgindices: Long, pv: Long): HRESULT =
    0

public actual fun SafeArrayGetElemsize(psa: Long): UInt =
    0u

public actual fun SafeArrayGetIID(psa: Long, pguid: Long): HRESULT =
    0

public actual fun SafeArrayGetLBound(psa: Long, ndim: UInt, pllbound: Long): HRESULT =
    0

public actual fun SafeArrayGetRecordInfo(psa: Long, prinfo: Long): HRESULT =
    0

public actual fun SafeArrayGetUBound(psa: Long, ndim: UInt, plubound: Long): HRESULT =
    0

public actual fun SafeArrayGetVartype(psa: Long, pvt: Long): HRESULT =
    0

public actual fun SafeArrayLock(psa: Long): HRESULT =
    0

public actual fun SafeArrayPtrOfIndex(psa: Long, rgindices: Long, ppvdata: Long): HRESULT =
    0

public actual fun SafeArrayPutElement(psa: Long, rgindices: Long, pv: Long): HRESULT =
    0

public actual fun SafeArrayRedim(psa: Long, psaboundnew: Long): HRESULT =
    0

public actual fun SafeArrayReleaseData(pdata: Long) {
}

public actual fun SafeArrayReleaseDescriptor(psa: Long) {
}

public actual fun SafeArraySetIID(psa: Long, guid: Long): HRESULT =
    0

public actual fun SafeArraySetRecordInfo(psa: Long, prinfo: Long): HRESULT =
    0

public actual fun SafeArrayUnaccessData(psa: Long): HRESULT =
    0

public actual fun SafeArrayUnlock(psa: Long): HRESULT =
    0

public actual fun UnRegisterTypeLib(libid: Long, wvermajor: UShort, wverminor: UShort, lcid: UInt, syskind: SYSKIND): HRESULT =
    0

public actual fun UnRegisterTypeLibForUser(libid: Long, wmajorvernum: UShort, wminorvernum: UShort, lcid: UInt, syskind: SYSKIND): HRESULT =
    0

public actual fun VarAbs(pvarin: Long, pvarresult: Long): HRESULT =
    0

public actual fun VarAdd(pvarleft: Long, pvarright: Long, pvarresult: Long): HRESULT =
    0

public actual fun VarAnd(pvarleft: Long, pvarright: Long, pvarresult: Long): HRESULT =
    0

public actual fun VarBoolFromCy(cyin: CY, pboolout: Long): HRESULT =
    0

public actual fun VarBoolFromDate(datein: Double, pboolout: Long): HRESULT =
    0

public actual fun VarBoolFromDec(pdecin: Long, pboolout: Long): HRESULT =
    0

public actual fun VarBoolFromDisp(pdispin: Long, lcid: UInt, pboolout: Long): HRESULT =
    0

public actual fun VarBoolFromI1(cin: Byte, pboolout: Long): HRESULT =
    0

public actual fun VarBoolFromI2(sin: Short, pboolout: Long): HRESULT =
    0

public actual fun VarBoolFromI4(lin: Int, pboolout: Long): HRESULT =
    0

public actual fun VarBoolFromI8(i64in: Long, pboolout: Long): HRESULT =
    0

public actual fun VarBoolFromR4(fltin: Float, pboolout: Long): HRESULT =
    0

public actual fun VarBoolFromR8(dblin: Double, pboolout: Long): HRESULT =
    0

public actual fun VarBoolFromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, pboolout: Long): HRESULT =
    0

public actual fun VarBoolFromUI1(bin: UByte, pboolout: Long): HRESULT =
    0

public actual fun VarBoolFromUI2(uiin: UShort, pboolout: Long): HRESULT =
    0

public actual fun VarBoolFromUI4(ulin: UInt, pboolout: Long): HRESULT =
    0

public actual fun VarBoolFromUI8(i64in: ULong, pboolout: Long): HRESULT =
    0

public actual fun VarBstrCat(bstrleft: BSTR, bstrright: BSTR, pbstrresult: Long): HRESULT =
    0

public actual fun VarBstrCmp(bstrleft: BSTR, bstrright: BSTR, lcid: UInt, dwflags: UInt): HRESULT =
    0

public actual fun VarBstrFromBool(boolin: VARIANT_BOOL, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT =
    0

public actual fun VarBstrFromCy(cyin: CY, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT =
    0

public actual fun VarBstrFromDate(datein: Double, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT =
    0

public actual fun VarBstrFromDec(pdecin: Long, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT =
    0

public actual fun VarBstrFromDisp(pdispin: Long, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT =
    0

public actual fun VarBstrFromI1(cin: Byte, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT =
    0

public actual fun VarBstrFromI2(ival: Short, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT =
    0

public actual fun VarBstrFromI4(lin: Int, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT =
    0

public actual fun VarBstrFromI8(i64in: Long, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT =
    0

public actual fun VarBstrFromR4(fltin: Float, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT =
    0

public actual fun VarBstrFromR8(dblin: Double, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT =
    0

public actual fun VarBstrFromUI1(bval: UByte, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT =
    0

public actual fun VarBstrFromUI2(uiin: UShort, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT =
    0

public actual fun VarBstrFromUI4(ulin: UInt, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT =
    0

public actual fun VarBstrFromUI8(ui64in: ULong, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT =
    0

public actual fun VarCat(pvarleft: Long, pvarright: Long, pvarresult: Long): HRESULT =
    0

public actual fun VarCmp(pvarleft: Long, pvarright: Long, lcid: UInt, dwflags: UInt): VARCMP =
    0u

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
    0

public actual fun VarCyFromDate(datein: Double, pcyout: Long): HRESULT =
    0

public actual fun VarCyFromDec(pdecin: Long, pcyout: Long): HRESULT =
    0

public actual fun VarCyFromDisp(pdispin: Long, lcid: UInt, pcyout: Long): HRESULT =
    0

public actual fun VarCyFromI1(cin: Byte, pcyout: Long): HRESULT =
    0

public actual fun VarCyFromI2(sin: Short, pcyout: Long): HRESULT =
    0

public actual fun VarCyFromI4(lin: Int, pcyout: Long): HRESULT =
    0

public actual fun VarCyFromI8(i64in: Long, pcyout: Long): HRESULT =
    0

public actual fun VarCyFromR4(fltin: Float, pcyout: Long): HRESULT =
    0

public actual fun VarCyFromR8(dblin: Double, pcyout: Long): HRESULT =
    0

public actual fun VarCyFromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, pcyout: Long): HRESULT =
    0

public actual fun VarCyFromUI1(bin: UByte, pcyout: Long): HRESULT =
    0

public actual fun VarCyFromUI2(uiin: UShort, pcyout: Long): HRESULT =
    0

public actual fun VarCyFromUI4(ulin: UInt, pcyout: Long): HRESULT =
    0

public actual fun VarCyFromUI8(ui64in: ULong, pcyout: Long): HRESULT =
    0

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
    0

public actual fun VarDateFromCy(cyin: CY, pdateout: Long): HRESULT =
    0

public actual fun VarDateFromDec(pdecin: Long, pdateout: Long): HRESULT =
    0

public actual fun VarDateFromDisp(pdispin: Long, lcid: UInt, pdateout: Long): HRESULT =
    0

public actual fun VarDateFromI1(cin: Byte, pdateout: Long): HRESULT =
    0

public actual fun VarDateFromI2(sin: Short, pdateout: Long): HRESULT =
    0

public actual fun VarDateFromI4(lin: Int, pdateout: Long): HRESULT =
    0

public actual fun VarDateFromI8(i64in: Long, pdateout: Long): HRESULT =
    0

public actual fun VarDateFromR4(fltin: Float, pdateout: Long): HRESULT =
    0

public actual fun VarDateFromR8(dblin: Double, pdateout: Long): HRESULT =
    0

public actual fun VarDateFromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, pdateout: Long): HRESULT =
    0

public actual fun VarDateFromUI1(bin: UByte, pdateout: Long): HRESULT =
    0

public actual fun VarDateFromUI2(uiin: UShort, pdateout: Long): HRESULT =
    0

public actual fun VarDateFromUI4(ulin: UInt, pdateout: Long): HRESULT =
    0

public actual fun VarDateFromUI8(ui64in: ULong, pdateout: Long): HRESULT =
    0

public actual fun VarDateFromUdate(pudatein: Long, dwflags: UInt, pdateout: Long): HRESULT =
    0

public actual fun VarDateFromUdateEx(pudatein: Long, lcid: UInt, dwflags: UInt, pdateout: Long): HRESULT =
    0

public actual fun VarDecAbs(pdecin: Long, pdecresult: Long): HRESULT =
    0

public actual fun VarDecAdd(pdecleft: Long, pdecright: Long, pdecresult: Long): HRESULT =
    0

public actual fun VarDecCmp(pdecleft: Long, pdecright: Long): VARCMP =
    0u

public actual fun VarDecCmpR8(pdecleft: Long, dblright: Double): VARCMP =
    0u

public actual fun VarDecDiv(pdecleft: Long, pdecright: Long, pdecresult: Long): HRESULT =
    0

public actual fun VarDecFix(pdecin: Long, pdecresult: Long): HRESULT =
    0

public actual fun VarDecFromBool(boolin: VARIANT_BOOL, pdecout: Long): HRESULT =
    0

public actual fun VarDecFromCy(cyin: CY, pdecout: Long): HRESULT =
    0

public actual fun VarDecFromDate(datein: Double, pdecout: Long): HRESULT =
    0

public actual fun VarDecFromDisp(pdispin: Long, lcid: UInt, pdecout: Long): HRESULT =
    0

public actual fun VarDecFromI1(cin: Byte, pdecout: Long): HRESULT =
    0

public actual fun VarDecFromI2(uiin: Short, pdecout: Long): HRESULT =
    0

public actual fun VarDecFromI4(lin: Int, pdecout: Long): HRESULT =
    0

public actual fun VarDecFromI8(i64in: Long, pdecout: Long): HRESULT =
    0

public actual fun VarDecFromR4(fltin: Float, pdecout: Long): HRESULT =
    0

public actual fun VarDecFromR8(dblin: Double, pdecout: Long): HRESULT =
    0

public actual fun VarDecFromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, pdecout: Long): HRESULT =
    0

public actual fun VarDecFromUI1(bin: UByte, pdecout: Long): HRESULT =
    0

public actual fun VarDecFromUI2(uiin: UShort, pdecout: Long): HRESULT =
    0

public actual fun VarDecFromUI4(ulin: UInt, pdecout: Long): HRESULT =
    0

public actual fun VarDecFromUI8(ui64in: ULong, pdecout: Long): HRESULT =
    0

public actual fun VarDecInt(pdecin: Long, pdecresult: Long): HRESULT =
    0

public actual fun VarDecMul(pdecleft: Long, pdecright: Long, pdecresult: Long): HRESULT =
    0

public actual fun VarDecNeg(pdecin: Long, pdecresult: Long): HRESULT =
    0

public actual fun VarDecRound(pdecin: Long, cdecimals: Int, pdecresult: Long): HRESULT =
    0

public actual fun VarDecSub(pdecleft: Long, pdecright: Long, pdecresult: Long): HRESULT =
    0

public actual fun VarDiv(pvarleft: Long, pvarright: Long, pvarresult: Long): HRESULT =
    0

public actual fun VarEqv(pvarleft: Long, pvarright: Long, pvarresult: Long): HRESULT =
    0

public actual fun VarFix(pvarin: Long, pvarresult: Long): HRESULT =
    0

public actual fun VarFormat(pvarin: Long, pstrformat: PCWSTR, ifirstday: VARFORMAT_FIRST_DAY, ifirstweek: VARFORMAT_FIRST_WEEK, dwflags: UInt, pbstrout: Long): HRESULT =
    0

public actual fun VarFormatCurrency(pvarin: Long, inumdig: Int, iinclead: Int, iuseparens: Int, igroup: Int, dwflags: UInt, pbstrout: Long): HRESULT =
    0

public actual fun VarFormatDateTime(pvarin: Long, inamedformat: VARFORMAT_NAMED_FORMAT, dwflags: UInt, pbstrout: Long): HRESULT =
    0

public actual fun VarFormatFromTokens(pvarin: Long, pstrformat: PCWSTR, pbtokcur: Long, dwflags: UInt, pbstrout: Long, lcid: UInt): HRESULT =
    0

public actual fun VarFormatNumber(pvarin: Long, inumdig: Int, iinclead: VARFORMAT_LEADING_DIGIT, iuseparens: VARFORMAT_PARENTHESES, igroup: VARFORMAT_GROUP, dwflags: UInt, pbstrout: Long): HRESULT =
    0

public actual fun VarFormatPercent(pvarin: Long, inumdig: Int, iinclead: VARFORMAT_LEADING_DIGIT, iuseparens: VARFORMAT_PARENTHESES, igroup: VARFORMAT_GROUP, dwflags: UInt, pbstrout: Long): HRESULT =
    0

public actual fun VarI1FromBool(boolin: VARIANT_BOOL, pcout: PSTR): HRESULT =
    0

public actual fun VarI1FromCy(cyin: CY, pcout: PSTR): HRESULT =
    0

public actual fun VarI1FromDate(datein: Double, pcout: PSTR): HRESULT =
    0

public actual fun VarI1FromDec(pdecin: Long, pcout: PSTR): HRESULT =
    0

public actual fun VarI1FromDisp(pdispin: Long, lcid: UInt, pcout: PSTR): HRESULT =
    0

public actual fun VarI1FromI2(uiin: Short, pcout: PSTR): HRESULT =
    0

public actual fun VarI1FromI4(lin: Int, pcout: PSTR): HRESULT =
    0

public actual fun VarI1FromI8(i64in: Long, pcout: PSTR): HRESULT =
    0

public actual fun VarI1FromR4(fltin: Float, pcout: PSTR): HRESULT =
    0

public actual fun VarI1FromR8(dblin: Double, pcout: PSTR): HRESULT =
    0

public actual fun VarI1FromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, pcout: PSTR): HRESULT =
    0

public actual fun VarI1FromUI1(bin: UByte, pcout: PSTR): HRESULT =
    0

public actual fun VarI1FromUI2(uiin: UShort, pcout: PSTR): HRESULT =
    0

public actual fun VarI1FromUI4(ulin: UInt, pcout: PSTR): HRESULT =
    0

public actual fun VarI1FromUI8(i64in: ULong, pcout: PSTR): HRESULT =
    0

public actual fun VarI2FromBool(boolin: VARIANT_BOOL, psout: Long): HRESULT =
    0

public actual fun VarI2FromCy(cyin: CY, psout: Long): HRESULT =
    0

public actual fun VarI2FromDate(datein: Double, psout: Long): HRESULT =
    0

public actual fun VarI2FromDec(pdecin: Long, psout: Long): HRESULT =
    0

public actual fun VarI2FromDisp(pdispin: Long, lcid: UInt, psout: Long): HRESULT =
    0

public actual fun VarI2FromI1(cin: Byte, psout: Long): HRESULT =
    0

public actual fun VarI2FromI4(lin: Int, psout: Long): HRESULT =
    0

public actual fun VarI2FromI8(i64in: Long, psout: Long): HRESULT =
    0

public actual fun VarI2FromR4(fltin: Float, psout: Long): HRESULT =
    0

public actual fun VarI2FromR8(dblin: Double, psout: Long): HRESULT =
    0

public actual fun VarI2FromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, psout: Long): HRESULT =
    0

public actual fun VarI2FromUI1(bin: UByte, psout: Long): HRESULT =
    0

public actual fun VarI2FromUI2(uiin: UShort, psout: Long): HRESULT =
    0

public actual fun VarI2FromUI4(ulin: UInt, psout: Long): HRESULT =
    0

public actual fun VarI2FromUI8(ui64in: ULong, psout: Long): HRESULT =
    0

public actual fun VarI4FromBool(boolin: VARIANT_BOOL, plout: Long): HRESULT =
    0

public actual fun VarI4FromCy(cyin: CY, plout: Long): HRESULT =
    0

public actual fun VarI4FromDate(datein: Double, plout: Long): HRESULT =
    0

public actual fun VarI4FromDec(pdecin: Long, plout: Long): HRESULT =
    0

public actual fun VarI4FromDisp(pdispin: Long, lcid: UInt, plout: Long): HRESULT =
    0

public actual fun VarI4FromI1(cin: Byte, plout: Long): HRESULT =
    0

public actual fun VarI4FromI2(sin: Short, plout: Long): HRESULT =
    0

public actual fun VarI4FromI8(i64in: Long, plout: Long): HRESULT =
    0

public actual fun VarI4FromR4(fltin: Float, plout: Long): HRESULT =
    0

public actual fun VarI4FromR8(dblin: Double, plout: Long): HRESULT =
    0

public actual fun VarI4FromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, plout: Long): HRESULT =
    0

public actual fun VarI4FromUI1(bin: UByte, plout: Long): HRESULT =
    0

public actual fun VarI4FromUI2(uiin: UShort, plout: Long): HRESULT =
    0

public actual fun VarI4FromUI4(ulin: UInt, plout: Long): HRESULT =
    0

public actual fun VarI4FromUI8(ui64in: ULong, plout: Long): HRESULT =
    0

public actual fun VarI8FromBool(boolin: VARIANT_BOOL, pi64out: Long): HRESULT =
    0

public actual fun VarI8FromCy(cyin: CY, pi64out: Long): HRESULT =
    0

public actual fun VarI8FromDate(datein: Double, pi64out: Long): HRESULT =
    0

public actual fun VarI8FromDec(pdecin: Long, pi64out: Long): HRESULT =
    0

public actual fun VarI8FromDisp(pdispin: Long, lcid: UInt, pi64out: Long): HRESULT =
    0

public actual fun VarI8FromI1(cin: Byte, pi64out: Long): HRESULT =
    0

public actual fun VarI8FromI2(sin: Short, pi64out: Long): HRESULT =
    0

public actual fun VarI8FromR4(fltin: Float, pi64out: Long): HRESULT =
    0

public actual fun VarI8FromR8(dblin: Double, pi64out: Long): HRESULT =
    0

public actual fun VarI8FromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, pi64out: Long): HRESULT =
    0

public actual fun VarI8FromUI1(bin: UByte, pi64out: Long): HRESULT =
    0

public actual fun VarI8FromUI2(uiin: UShort, pi64out: Long): HRESULT =
    0

public actual fun VarI8FromUI4(ulin: UInt, pi64out: Long): HRESULT =
    0

public actual fun VarI8FromUI8(ui64in: ULong, pi64out: Long): HRESULT =
    0

public actual fun VarIdiv(pvarleft: Long, pvarright: Long, pvarresult: Long): HRESULT =
    0

public actual fun VarImp(pvarleft: Long, pvarright: Long, pvarresult: Long): HRESULT =
    0

public actual fun VarInt(pvarin: Long, pvarresult: Long): HRESULT =
    0

public actual fun VarMod(pvarleft: Long, pvarright: Long, pvarresult: Long): HRESULT =
    0

public actual fun VarMonthName(imonth: Int, fabbrev: Int, dwflags: UInt, pbstrout: Long): HRESULT =
    0

public actual fun VarMul(pvarleft: Long, pvarright: Long, pvarresult: Long): HRESULT =
    0

public actual fun VarNeg(pvarin: Long, pvarresult: Long): HRESULT =
    0

public actual fun VarNot(pvarin: Long, pvarresult: Long): HRESULT =
    0

public actual fun VarNumFromParseNum(pnumprs: Long, rgbdig: Long, dwvtbits: UInt, pvar: Long): HRESULT =
    0

public actual fun VarOr(pvarleft: Long, pvarright: Long, pvarresult: Long): HRESULT =
    0

public actual fun VarParseNumFromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, pnumprs: Long, rgbdig: Long): HRESULT =
    0

public actual fun VarPow(pvarleft: Long, pvarright: Long, pvarresult: Long): HRESULT =
    0

public actual fun VarR4CmpR8(fltleft: Float, dblright: Double): VARCMP =
    0u

public actual fun VarR4FromBool(boolin: VARIANT_BOOL, pfltout: Long): HRESULT =
    0

public actual fun VarR4FromCy(cyin: CY, pfltout: Long): HRESULT =
    0

public actual fun VarR4FromDate(datein: Double, pfltout: Long): HRESULT =
    0

public actual fun VarR4FromDec(pdecin: Long, pfltout: Long): HRESULT =
    0

public actual fun VarR4FromDisp(pdispin: Long, lcid: UInt, pfltout: Long): HRESULT =
    0

public actual fun VarR4FromI1(cin: Byte, pfltout: Long): HRESULT =
    0

public actual fun VarR4FromI2(sin: Short, pfltout: Long): HRESULT =
    0

public actual fun VarR4FromI4(lin: Int, pfltout: Long): HRESULT =
    0

public actual fun VarR4FromI8(i64in: Long, pfltout: Long): HRESULT =
    0

public actual fun VarR4FromR8(dblin: Double, pfltout: Long): HRESULT =
    0

public actual fun VarR4FromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, pfltout: Long): HRESULT =
    0

public actual fun VarR4FromUI1(bin: UByte, pfltout: Long): HRESULT =
    0

public actual fun VarR4FromUI2(uiin: UShort, pfltout: Long): HRESULT =
    0

public actual fun VarR4FromUI4(ulin: UInt, pfltout: Long): HRESULT =
    0

public actual fun VarR4FromUI8(ui64in: ULong, pfltout: Long): HRESULT =
    0

public actual fun VarR8FromBool(boolin: VARIANT_BOOL, pdblout: Long): HRESULT =
    0

public actual fun VarR8FromCy(cyin: CY, pdblout: Long): HRESULT =
    0

public actual fun VarR8FromDate(datein: Double, pdblout: Long): HRESULT =
    0

public actual fun VarR8FromDec(pdecin: Long, pdblout: Long): HRESULT =
    0

public actual fun VarR8FromDisp(pdispin: Long, lcid: UInt, pdblout: Long): HRESULT =
    0

public actual fun VarR8FromI1(cin: Byte, pdblout: Long): HRESULT =
    0

public actual fun VarR8FromI2(sin: Short, pdblout: Long): HRESULT =
    0

public actual fun VarR8FromI4(lin: Int, pdblout: Long): HRESULT =
    0

public actual fun VarR8FromI8(i64in: Long, pdblout: Long): HRESULT =
    0

public actual fun VarR8FromR4(fltin: Float, pdblout: Long): HRESULT =
    0

public actual fun VarR8FromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, pdblout: Long): HRESULT =
    0

public actual fun VarR8FromUI1(bin: UByte, pdblout: Long): HRESULT =
    0

public actual fun VarR8FromUI2(uiin: UShort, pdblout: Long): HRESULT =
    0

public actual fun VarR8FromUI4(ulin: UInt, pdblout: Long): HRESULT =
    0

public actual fun VarR8FromUI8(ui64in: ULong, pdblout: Long): HRESULT =
    0

public actual fun VarR8Pow(dblleft: Double, dblright: Double, pdblresult: Long): HRESULT =
    0

public actual fun VarR8Round(dblin: Double, cdecimals: Int, pdblresult: Long): HRESULT =
    0

public actual fun VarRound(pvarin: Long, cdecimals: Int, pvarresult: Long): HRESULT =
    0

public actual fun VarSub(pvarleft: Long, pvarright: Long, pvarresult: Long): HRESULT =
    0

public actual fun VarTokenizeFormatString(pstrformat: PCWSTR, rgbtok: Long, cbtok: Int, ifirstday: VARFORMAT_FIRST_DAY, ifirstweek: VARFORMAT_FIRST_WEEK, lcid: UInt, pcbactual: Long): HRESULT =
    0

public actual fun VarUI1FromBool(boolin: VARIANT_BOOL, pbout: Long): HRESULT =
    0

public actual fun VarUI1FromCy(cyin: CY, pbout: Long): HRESULT =
    0

public actual fun VarUI1FromDate(datein: Double, pbout: Long): HRESULT =
    0

public actual fun VarUI1FromDec(pdecin: Long, pbout: Long): HRESULT =
    0

public actual fun VarUI1FromDisp(pdispin: Long, lcid: UInt, pbout: Long): HRESULT =
    0

public actual fun VarUI1FromI1(cin: Byte, pbout: Long): HRESULT =
    0

public actual fun VarUI1FromI2(sin: Short, pbout: Long): HRESULT =
    0

public actual fun VarUI1FromI4(lin: Int, pbout: Long): HRESULT =
    0

public actual fun VarUI1FromI8(i64in: Long, pbout: Long): HRESULT =
    0

public actual fun VarUI1FromR4(fltin: Float, pbout: Long): HRESULT =
    0

public actual fun VarUI1FromR8(dblin: Double, pbout: Long): HRESULT =
    0

public actual fun VarUI1FromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, pbout: Long): HRESULT =
    0

public actual fun VarUI1FromUI2(uiin: UShort, pbout: Long): HRESULT =
    0

public actual fun VarUI1FromUI4(ulin: UInt, pbout: Long): HRESULT =
    0

public actual fun VarUI1FromUI8(ui64in: ULong, pbout: Long): HRESULT =
    0

public actual fun VarUI2FromBool(boolin: VARIANT_BOOL, puiout: Long): HRESULT =
    0

public actual fun VarUI2FromCy(cyin: CY, puiout: Long): HRESULT =
    0

public actual fun VarUI2FromDate(datein: Double, puiout: Long): HRESULT =
    0

public actual fun VarUI2FromDec(pdecin: Long, puiout: Long): HRESULT =
    0

public actual fun VarUI2FromDisp(pdispin: Long, lcid: UInt, puiout: Long): HRESULT =
    0

public actual fun VarUI2FromI1(cin: Byte, puiout: Long): HRESULT =
    0

public actual fun VarUI2FromI2(uiin: Short, puiout: Long): HRESULT =
    0

public actual fun VarUI2FromI4(lin: Int, puiout: Long): HRESULT =
    0

public actual fun VarUI2FromI8(i64in: Long, puiout: Long): HRESULT =
    0

public actual fun VarUI2FromR4(fltin: Float, puiout: Long): HRESULT =
    0

public actual fun VarUI2FromR8(dblin: Double, puiout: Long): HRESULT =
    0

public actual fun VarUI2FromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, puiout: Long): HRESULT =
    0

public actual fun VarUI2FromUI1(bin: UByte, puiout: Long): HRESULT =
    0

public actual fun VarUI2FromUI4(ulin: UInt, puiout: Long): HRESULT =
    0

public actual fun VarUI2FromUI8(i64in: ULong, puiout: Long): HRESULT =
    0

public actual fun VarUI4FromBool(boolin: VARIANT_BOOL, pulout: Long): HRESULT =
    0

public actual fun VarUI4FromCy(cyin: CY, pulout: Long): HRESULT =
    0

public actual fun VarUI4FromDate(datein: Double, pulout: Long): HRESULT =
    0

public actual fun VarUI4FromDec(pdecin: Long, pulout: Long): HRESULT =
    0

public actual fun VarUI4FromDisp(pdispin: Long, lcid: UInt, pulout: Long): HRESULT =
    0

public actual fun VarUI4FromI1(cin: Byte, pulout: Long): HRESULT =
    0

public actual fun VarUI4FromI2(uiin: Short, pulout: Long): HRESULT =
    0

public actual fun VarUI4FromI4(lin: Int, pulout: Long): HRESULT =
    0

public actual fun VarUI4FromI8(i64in: Long, plout: Long): HRESULT =
    0

public actual fun VarUI4FromR4(fltin: Float, pulout: Long): HRESULT =
    0

public actual fun VarUI4FromR8(dblin: Double, pulout: Long): HRESULT =
    0

public actual fun VarUI4FromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, pulout: Long): HRESULT =
    0

public actual fun VarUI4FromUI1(bin: UByte, pulout: Long): HRESULT =
    0

public actual fun VarUI4FromUI2(uiin: UShort, pulout: Long): HRESULT =
    0

public actual fun VarUI4FromUI8(ui64in: ULong, plout: Long): HRESULT =
    0

public actual fun VarUI8FromBool(boolin: VARIANT_BOOL, pi64out: Long): HRESULT =
    0

public actual fun VarUI8FromCy(cyin: CY, pi64out: Long): HRESULT =
    0

public actual fun VarUI8FromDate(datein: Double, pi64out: Long): HRESULT =
    0

public actual fun VarUI8FromDec(pdecin: Long, pi64out: Long): HRESULT =
    0

public actual fun VarUI8FromDisp(pdispin: Long, lcid: UInt, pi64out: Long): HRESULT =
    0

public actual fun VarUI8FromI1(cin: Byte, pi64out: Long): HRESULT =
    0

public actual fun VarUI8FromI2(sin: Short, pi64out: Long): HRESULT =
    0

public actual fun VarUI8FromI8(ui64in: Long, pi64out: Long): HRESULT =
    0

public actual fun VarUI8FromR4(fltin: Float, pi64out: Long): HRESULT =
    0

public actual fun VarUI8FromR8(dblin: Double, pi64out: Long): HRESULT =
    0

public actual fun VarUI8FromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, pi64out: Long): HRESULT =
    0

public actual fun VarUI8FromUI1(bin: UByte, pi64out: Long): HRESULT =
    0

public actual fun VarUI8FromUI2(uiin: UShort, pi64out: Long): HRESULT =
    0

public actual fun VarUI8FromUI4(ulin: UInt, pi64out: Long): HRESULT =
    0

public actual fun VarUdateFromDate(datein: Double, dwflags: UInt, pudateout: Long): HRESULT =
    0

public actual fun VarWeekdayName(iweekday: Int, fabbrev: Int, ifirstday: Int, dwflags: UInt, pbstrout: Long): HRESULT =
    0

public actual fun VarXor(pvarleft: Long, pvarright: Long, pvarresult: Long): HRESULT =
    0

public actual fun VectorFromBstr(bstr: BSTR, ppsa: Long): HRESULT =
    0
