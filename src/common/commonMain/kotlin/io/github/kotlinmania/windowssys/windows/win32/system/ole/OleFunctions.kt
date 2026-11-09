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

public expect fun BstrFromVector(psa: Long, pbstr: Long): HRESULT

public expect fun ClearCustData(pcustdata: Long)

public expect fun CreateDispTypeInfo(pidata: Long, lcid: UInt, pptinfo: Long): HRESULT

public expect fun CreateErrorInfo(pperrinfo: Long): HRESULT

public expect fun CreateOleAdviseHolder(ppoaholder: Long): HRESULT

public expect fun CreateStdDispatch(punkouter: Long, pvthis: Long, ptinfo: Long, ppunkstddisp: Long): HRESULT

public expect fun CreateTypeLib(syskind: SYSKIND, szfile: PCWSTR, ppctlib: Long): HRESULT

public expect fun CreateTypeLib2(syskind: SYSKIND, szfile: PCWSTR, ppctlib: Long): HRESULT

public expect fun DispCallFunc(pvinstance: Long, ovft: ULong, cc: CALLCONV, vtreturn: VARENUM, cactuals: UInt, prgvt: Long, prgpvarg: Long, pvargresult: Long): HRESULT

public expect fun DispGetIDsOfNames(ptinfo: Long, rgsznames: Long, cnames: UInt, rgdispid: Long): HRESULT

public expect fun DispGetParam(pdispparams: Long, position: UInt, vttarg: VARENUM, pvarresult: Long, puargerr: Long): HRESULT

public expect fun DispInvoke(_this: Long, ptinfo: Long, dispidmember: Int, wflags: UShort, pparams: Long, pvarresult: Long, pexcepinfo: Long, puargerr: Long): HRESULT

public expect fun DoDragDrop(pdataobj: Long, pdropsource: Long, dwokeffects: DROPEFFECT, pdweffect: Long): HRESULT

public expect fun GetActiveObject(rclsid: Long, pvreserved: Long, ppunk: Long): HRESULT

public expect fun GetAltMonthNames(lcid: UInt, prgp: Long): HRESULT

public expect fun GetRecordInfoFromGuids(rguidtypelib: Long, uvermajor: UInt, uverminor: UInt, lcid: UInt, rguidtypeinfo: Long, pprecinfo: Long): HRESULT

public expect fun GetRecordInfoFromTypeInfo(ptypeinfo: Long, pprecinfo: Long): HRESULT

public expect fun HRGN_UserFree(param0: Long, param1: Long)

public expect fun HRGN_UserFree64(param0: Long, param1: Long)

public expect fun HRGN_UserMarshal(param0: Long, param1: Long, param2: Long): Long

public expect fun HRGN_UserMarshal64(param0: Long, param1: Long, param2: Long): Long

public expect fun HRGN_UserSize(param0: Long, param1: UInt, param2: Long): UInt

public expect fun HRGN_UserSize64(param0: Long, param1: UInt, param2: Long): UInt

public expect fun HRGN_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long

public expect fun HRGN_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long

public expect fun IsAccelerator(haccel: HACCEL, caccelentries: Int, lpmsg: Long, lpwcmd: Long): BOOL

public expect fun LHashValOfNameSys(syskind: SYSKIND, lcid: UInt, szname: PCWSTR): UInt

public expect fun LHashValOfNameSysA(syskind: SYSKIND, lcid: UInt, szname: PCSTR): UInt

public expect fun LoadRegTypeLib(rguid: Long, wvermajor: UShort, wverminor: UShort, lcid: UInt, pptlib: Long): HRESULT

public expect fun LoadTypeLib(szfile: PCWSTR, pptlib: Long): HRESULT

public expect fun LoadTypeLibEx(szfile: PCWSTR, regkind: REGKIND, pptlib: Long): HRESULT

public expect fun OaBuildVersion(): UInt

public expect fun OaEnablePerUserTLibRegistration()

public expect fun OleBuildVersion(): UInt

public expect fun OleConvertOLESTREAMToIStorage2(lpolestream: Long, pstg: Long, ptd: Long, opt: UInt, pvcallbackcontext: Long, pqueryconvertolelinkcallback: OLESTREAMQUERYCONVERTOLELINKCALLBACK): HRESULT

public expect fun OleConvertOLESTREAMToIStorageEx2(polestm: Long, pstg: Long, pcfformat: Long, plwwidth: Long, plheight: Long, pdwsize: Long, pmedium: Long, opt: UInt, pvcallbackcontext: Long, pqueryconvertolelinkcallback: OLESTREAMQUERYCONVERTOLELINKCALLBACK): HRESULT

public expect fun OleCreate(rclsid: Long, riid: Long, renderopt: UInt, pformatetc: Long, pclientsite: Long, pstg: Long, ppvobj: Long): HRESULT

public expect fun OleCreateDefaultHandler(clsid: Long, punkouter: Long, riid: Long, lplpobj: Long): HRESULT

public expect fun OleCreateEmbeddingHelper(clsid: Long, punkouter: Long, flags: EMBDHLP_FLAGS, pcf: Long, riid: Long, lplpobj: Long): HRESULT

public expect fun OleCreateEx(rclsid: Long, riid: Long, dwflags: OLECREATE, renderopt: UInt, cformats: UInt, rgadvf: Long, rgformatetc: Long, lpadvisesink: Long, rgdwconnection: Long, pclientsite: Long, pstg: Long, ppvobj: Long): HRESULT

public expect fun OleCreateFontIndirect(lpfontdesc: Long, riid: Long, lplpvobj: Long): HRESULT

public expect fun OleCreateFromData(psrcdataobj: Long, riid: Long, renderopt: UInt, pformatetc: Long, pclientsite: Long, pstg: Long, ppvobj: Long): HRESULT

public expect fun OleCreateFromDataEx(psrcdataobj: Long, riid: Long, dwflags: OLECREATE, renderopt: UInt, cformats: UInt, rgadvf: Long, rgformatetc: Long, lpadvisesink: Long, rgdwconnection: Long, pclientsite: Long, pstg: Long, ppvobj: Long): HRESULT

public expect fun OleCreateFromFile(rclsid: Long, lpszfilename: PCWSTR, riid: Long, renderopt: UInt, lpformatetc: Long, pclientsite: Long, pstg: Long, ppvobj: Long): HRESULT

public expect fun OleCreateFromFileEx(rclsid: Long, lpszfilename: PCWSTR, riid: Long, dwflags: OLECREATE, renderopt: UInt, cformats: UInt, rgadvf: Long, rgformatetc: Long, lpadvisesink: Long, rgdwconnection: Long, pclientsite: Long, pstg: Long, ppvobj: Long): HRESULT

public expect fun OleCreateLink(pmklinksrc: Long, riid: Long, renderopt: UInt, lpformatetc: Long, pclientsite: Long, pstg: Long, ppvobj: Long): HRESULT

public expect fun OleCreateLinkEx(pmklinksrc: Long, riid: Long, dwflags: OLECREATE, renderopt: UInt, cformats: UInt, rgadvf: Long, rgformatetc: Long, lpadvisesink: Long, rgdwconnection: Long, pclientsite: Long, pstg: Long, ppvobj: Long): HRESULT

public expect fun OleCreateLinkFromData(psrcdataobj: Long, riid: Long, renderopt: UInt, pformatetc: Long, pclientsite: Long, pstg: Long, ppvobj: Long): HRESULT

public expect fun OleCreateLinkFromDataEx(psrcdataobj: Long, riid: Long, dwflags: OLECREATE, renderopt: UInt, cformats: UInt, rgadvf: Long, rgformatetc: Long, lpadvisesink: Long, rgdwconnection: Long, pclientsite: Long, pstg: Long, ppvobj: Long): HRESULT

public expect fun OleCreateLinkToFile(lpszfilename: PCWSTR, riid: Long, renderopt: UInt, lpformatetc: Long, pclientsite: Long, pstg: Long, ppvobj: Long): HRESULT

public expect fun OleCreateLinkToFileEx(lpszfilename: PCWSTR, riid: Long, dwflags: OLECREATE, renderopt: UInt, cformats: UInt, rgadvf: Long, rgformatetc: Long, lpadvisesink: Long, rgdwconnection: Long, pclientsite: Long, pstg: Long, ppvobj: Long): HRESULT

public expect fun OleCreateMenuDescriptor(hmenucombined: HMENU, lpmenuwidths: Long): Long

public expect fun OleCreatePictureIndirect(lppictdesc: Long, riid: Long, fown: BOOL, lplpvobj: Long): HRESULT

public expect fun OleCreatePropertyFrame(hwndowner: HWND, x: UInt, y: UInt, lpszcaption: PCWSTR, cobjects: UInt, ppunk: Long, cpages: UInt, ppageclsid: Long, lcid: UInt, dwreserved: UInt, pvreserved: Long): HRESULT

public expect fun OleCreatePropertyFrameIndirect(lpparams: Long): HRESULT

public expect fun OleCreateStaticFromData(psrcdataobj: Long, iid: Long, renderopt: UInt, pformatetc: Long, pclientsite: Long, pstg: Long, ppvobj: Long): HRESULT

public expect fun OleDestroyMenuDescriptor(holemenu: Long): HRESULT

public expect fun OleDoAutoConvert(pstg: Long, pclsidnew: Long): HRESULT

public expect fun OleDraw(punknown: Long, dwaspect: UInt, hdcdraw: HDC, lprcbounds: Long): HRESULT

public expect fun OleDuplicateData(hsrc: HANDLE, cfformat: CLIPBOARD_FORMAT, uiflags: GLOBAL_ALLOC_FLAGS): HANDLE

public expect fun OleFlushClipboard(): HRESULT

public expect fun OleGetAutoConvert(clsidold: Long, pclsidnew: Long): HRESULT

public expect fun OleGetClipboard(ppdataobj: Long): HRESULT

public expect fun OleGetClipboardWithEnterpriseInfo(dataobject: Long, dataenterpriseid: Long, sourcedescription: Long, targetdescription: Long, datadescription: Long): HRESULT

public expect fun OleGetIconOfClass(rclsid: Long, lpszlabel: PCWSTR, fusetypeaslabel: BOOL): HGLOBAL

public expect fun OleGetIconOfFile(lpszpath: PCWSTR, fusefileaslabel: BOOL): HGLOBAL

public expect fun OleIconToCursor(hinstexe: HINSTANCE, hicon: HICON): HCURSOR

public expect fun OleInitialize(pvreserved: Long): HRESULT

public expect fun OleIsCurrentClipboard(pdataobj: Long): HRESULT

public expect fun OleIsRunning(pobject: Long): BOOL

public expect fun OleLoad(pstg: Long, riid: Long, pclientsite: Long, ppvobj: Long): HRESULT

public expect fun OleLoadFromStream(pstm: Long, iidinterface: Long, ppvobj: Long): HRESULT

public expect fun OleLoadPicture(lpstream: Long, lsize: Int, frunmode: BOOL, riid: Long, lplpvobj: Long): HRESULT

public expect fun OleLoadPictureEx(lpstream: Long, lsize: Int, frunmode: BOOL, riid: Long, xsizedesired: UInt, ysizedesired: UInt, dwflags: LOAD_PICTURE_FLAGS, lplpvobj: Long): HRESULT

public expect fun OleLoadPictureFile(varfilename: VARIANT, lplpdisppicture: Long): HRESULT

public expect fun OleLoadPictureFileEx(varfilename: VARIANT, xsizedesired: UInt, ysizedesired: UInt, dwflags: LOAD_PICTURE_FLAGS, lplpdisppicture: Long): HRESULT

public expect fun OleLoadPicturePath(szurlorpath: PCWSTR, punkcaller: Long, dwreserved: UInt, clrreserved: UInt, riid: Long, ppvret: Long): HRESULT

public expect fun OleLockRunning(punknown: Long, flock: BOOL, flastunlockcloses: BOOL): HRESULT

public expect fun OleMetafilePictFromIconAndLabel(hicon: HICON, lpszlabel: PCWSTR, lpszsourcefile: PCWSTR, iiconindex: UInt): HGLOBAL

public expect fun OleNoteObjectVisible(punknown: Long, fvisible: BOOL): HRESULT

public expect fun OleQueryCreateFromData(psrcdataobject: Long): HRESULT

public expect fun OleQueryLinkFromData(psrcdataobject: Long): HRESULT

public expect fun OleRegEnumFormatEtc(clsid: Long, dwdirection: UInt, ppenum: Long): HRESULT

public expect fun OleRegEnumVerbs(clsid: Long, ppenum: Long): HRESULT

public expect fun OleRegGetMiscStatus(clsid: Long, dwaspect: UInt, pdwstatus: Long): HRESULT

public expect fun OleRegGetUserType(clsid: Long, dwformoftype: UInt, pszusertype: Long): HRESULT

public expect fun OleRun(punknown: Long): HRESULT

public expect fun OleSave(pps: Long, pstg: Long, fsameasload: BOOL): HRESULT

public expect fun OleSavePictureFile(lpdisppicture: Long, bstrfilename: BSTR): HRESULT

public expect fun OleSaveToStream(ppstm: Long, pstm: Long): HRESULT

public expect fun OleSetAutoConvert(clsidold: Long, clsidnew: Long): HRESULT

public expect fun OleSetClipboard(pdataobj: Long): HRESULT

public expect fun OleSetContainedObject(punknown: Long, fcontained: BOOL): HRESULT

public expect fun OleSetMenuDescriptor(holemenu: Long, hwndframe: HWND, hwndactiveobject: HWND, lpframe: Long, lpactiveobj: Long): HRESULT

public expect fun OleTranslateAccelerator(lpframe: Long, lpframeinfo: Long, lpmsg: Long): HRESULT

public expect fun OleTranslateColor(clr: UInt, hpal: HPALETTE, lpcolorref: Long): HRESULT

public expect fun OleUIAddVerbMenuA(lpoleobj: Long, lpszshorttype: PCSTR, hmenu: HMENU, upos: UInt, uidverbmin: UInt, uidverbmax: UInt, baddconvert: BOOL, idconvert: UInt, lphmenu: Long): BOOL

public expect fun OleUIAddVerbMenuW(lpoleobj: Long, lpszshorttype: PCWSTR, hmenu: HMENU, upos: UInt, uidverbmin: UInt, uidverbmax: UInt, baddconvert: BOOL, idconvert: UInt, lphmenu: Long): BOOL

public expect fun OleUIBusyA(param0: Long): UInt

public expect fun OleUIBusyW(param0: Long): UInt

public expect fun OleUICanConvertOrActivateAs(rclsid: Long, fislinkedobject: BOOL, wformat: UShort): BOOL

public expect fun OleUIChangeIconA(param0: Long): UInt

public expect fun OleUIChangeIconW(param0: Long): UInt

public expect fun OleUIChangeSourceA(param0: Long): UInt

public expect fun OleUIChangeSourceW(param0: Long): UInt

public expect fun OleUIConvertA(param0: Long): UInt

public expect fun OleUIConvertW(param0: Long): UInt

public expect fun OleUIEditLinksA(param0: Long): UInt

public expect fun OleUIEditLinksW(param0: Long): UInt

public expect fun OleUIInsertObjectA(param0: Long): UInt

public expect fun OleUIInsertObjectW(param0: Long): UInt

public expect fun OleUIObjectPropertiesA(param0: Long): UInt

public expect fun OleUIObjectPropertiesW(param0: Long): UInt

public expect fun OleUIPasteSpecialA(param0: Long): UInt

public expect fun OleUIPasteSpecialW(param0: Long): UInt

public expect fun OleUIPromptUserA(ntemplate: Int, hwndparent: HWND, vararg variadicArgs: Long): Int

public expect fun OleUIPromptUserW(ntemplate: Int, hwndparent: HWND, vararg variadicArgs: Long): Int

public expect fun OleUIUpdateLinksA(lpoleuilinkcntr: Long, hwndparent: HWND, lpsztitle: PCSTR, clinks: Int): BOOL

public expect fun OleUIUpdateLinksW(lpoleuilinkcntr: Long, hwndparent: HWND, lpsztitle: PCWSTR, clinks: Int): BOOL

public expect fun OleUninitialize()

public expect fun QueryPathOfRegTypeLib(guid: Long, wmaj: UShort, wmin: UShort, lcid: UInt, lpbstrpathname: Long): HRESULT

public expect fun RegisterActiveObject(punk: Long, rclsid: Long, dwflags: ACTIVEOBJECT_FLAGS, pdwregister: Long): HRESULT

public expect fun RegisterDragDrop(hwnd: HWND, pdroptarget: Long): HRESULT

public expect fun RegisterTypeLib(ptlib: Long, szfullpath: PCWSTR, szhelpdir: PCWSTR): HRESULT

public expect fun RegisterTypeLibForUser(ptlib: Long, szfullpath: PCWSTR, szhelpdir: PCWSTR): HRESULT

public expect fun ReleaseStgMedium(param0: Long)

public expect fun RevokeActiveObject(dwregister: UInt, pvreserved: Long): HRESULT

public expect fun RevokeDragDrop(hwnd: HWND): HRESULT

public expect fun SafeArrayAccessData(psa: Long, ppvdata: Long): HRESULT

public expect fun SafeArrayAddRef(psa: Long, ppdatatorelease: Long): HRESULT

public expect fun SafeArrayAllocData(psa: Long): HRESULT

public expect fun SafeArrayAllocDescriptor(cdims: UInt, ppsaout: Long): HRESULT

public expect fun SafeArrayAllocDescriptorEx(vt: VARENUM, cdims: UInt, ppsaout: Long): HRESULT

public expect fun SafeArrayCopy(psa: Long, ppsaout: Long): HRESULT

public expect fun SafeArrayCopyData(psasource: Long, psatarget: Long): HRESULT

public expect fun SafeArrayCreate(vt: VARENUM, cdims: UInt, rgsabound: Long): Long

public expect fun SafeArrayCreateEx(vt: VARENUM, cdims: UInt, rgsabound: Long, pvextra: Long): Long

public expect fun SafeArrayCreateVector(vt: VARENUM, llbound: Int, celements: UInt): Long

public expect fun SafeArrayCreateVectorEx(vt: VARENUM, llbound: Int, celements: UInt, pvextra: Long): Long

public expect fun SafeArrayDestroy(psa: Long): HRESULT

public expect fun SafeArrayDestroyData(psa: Long): HRESULT

public expect fun SafeArrayDestroyDescriptor(psa: Long): HRESULT

public expect fun SafeArrayGetDim(psa: Long): UInt

public expect fun SafeArrayGetElement(psa: Long, rgindices: Long, pv: Long): HRESULT

public expect fun SafeArrayGetElemsize(psa: Long): UInt

public expect fun SafeArrayGetIID(psa: Long, pguid: Long): HRESULT

public expect fun SafeArrayGetLBound(psa: Long, ndim: UInt, pllbound: Long): HRESULT

public expect fun SafeArrayGetRecordInfo(psa: Long, prinfo: Long): HRESULT

public expect fun SafeArrayGetUBound(psa: Long, ndim: UInt, plubound: Long): HRESULT

public expect fun SafeArrayGetVartype(psa: Long, pvt: Long): HRESULT

public expect fun SafeArrayLock(psa: Long): HRESULT

public expect fun SafeArrayPtrOfIndex(psa: Long, rgindices: Long, ppvdata: Long): HRESULT

public expect fun SafeArrayPutElement(psa: Long, rgindices: Long, pv: Long): HRESULT

public expect fun SafeArrayRedim(psa: Long, psaboundnew: Long): HRESULT

public expect fun SafeArrayReleaseData(pdata: Long)

public expect fun SafeArrayReleaseDescriptor(psa: Long)

public expect fun SafeArraySetIID(psa: Long, guid: Long): HRESULT

public expect fun SafeArraySetRecordInfo(psa: Long, prinfo: Long): HRESULT

public expect fun SafeArrayUnaccessData(psa: Long): HRESULT

public expect fun SafeArrayUnlock(psa: Long): HRESULT

public expect fun UnRegisterTypeLib(libid: Long, wvermajor: UShort, wverminor: UShort, lcid: UInt, syskind: SYSKIND): HRESULT

public expect fun UnRegisterTypeLibForUser(libid: Long, wmajorvernum: UShort, wminorvernum: UShort, lcid: UInt, syskind: SYSKIND): HRESULT

public expect fun VarAbs(pvarin: Long, pvarresult: Long): HRESULT

public expect fun VarAdd(pvarleft: Long, pvarright: Long, pvarresult: Long): HRESULT

public expect fun VarAnd(pvarleft: Long, pvarright: Long, pvarresult: Long): HRESULT

public expect fun VarBoolFromCy(cyin: CY, pboolout: Long): HRESULT

public expect fun VarBoolFromDate(datein: Double, pboolout: Long): HRESULT

public expect fun VarBoolFromDec(pdecin: Long, pboolout: Long): HRESULT

public expect fun VarBoolFromDisp(pdispin: Long, lcid: UInt, pboolout: Long): HRESULT

public expect fun VarBoolFromI1(cin: Byte, pboolout: Long): HRESULT

public expect fun VarBoolFromI2(sin: Short, pboolout: Long): HRESULT

public expect fun VarBoolFromI4(lin: Int, pboolout: Long): HRESULT

public expect fun VarBoolFromI8(i64in: Long, pboolout: Long): HRESULT

public expect fun VarBoolFromR4(fltin: Float, pboolout: Long): HRESULT

public expect fun VarBoolFromR8(dblin: Double, pboolout: Long): HRESULT

public expect fun VarBoolFromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, pboolout: Long): HRESULT

public expect fun VarBoolFromUI1(bin: UByte, pboolout: Long): HRESULT

public expect fun VarBoolFromUI2(uiin: UShort, pboolout: Long): HRESULT

public expect fun VarBoolFromUI4(ulin: UInt, pboolout: Long): HRESULT

public expect fun VarBoolFromUI8(i64in: ULong, pboolout: Long): HRESULT

public expect fun VarBstrCat(bstrleft: BSTR, bstrright: BSTR, pbstrresult: Long): HRESULT

public expect fun VarBstrCmp(bstrleft: BSTR, bstrright: BSTR, lcid: UInt, dwflags: UInt): HRESULT

public expect fun VarBstrFromBool(boolin: VARIANT_BOOL, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT

public expect fun VarBstrFromCy(cyin: CY, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT

public expect fun VarBstrFromDate(datein: Double, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT

public expect fun VarBstrFromDec(pdecin: Long, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT

public expect fun VarBstrFromDisp(pdispin: Long, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT

public expect fun VarBstrFromI1(cin: Byte, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT

public expect fun VarBstrFromI2(ival: Short, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT

public expect fun VarBstrFromI4(lin: Int, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT

public expect fun VarBstrFromI8(i64in: Long, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT

public expect fun VarBstrFromR4(fltin: Float, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT

public expect fun VarBstrFromR8(dblin: Double, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT

public expect fun VarBstrFromUI1(bval: UByte, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT

public expect fun VarBstrFromUI2(uiin: UShort, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT

public expect fun VarBstrFromUI4(ulin: UInt, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT

public expect fun VarBstrFromUI8(ui64in: ULong, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT

public expect fun VarCat(pvarleft: Long, pvarright: Long, pvarresult: Long): HRESULT

public expect fun VarCmp(pvarleft: Long, pvarright: Long, lcid: UInt, dwflags: UInt): VARCMP

public expect fun VarCyAbs(cyin: CY, pcyresult: Long): HRESULT

public expect fun VarCyAdd(cyleft: CY, cyright: CY, pcyresult: Long): HRESULT

public expect fun VarCyCmp(cyleft: CY, cyright: CY): VARCMP

public expect fun VarCyCmpR8(cyleft: CY, dblright: Double): VARCMP

public expect fun VarCyFix(cyin: CY, pcyresult: Long): HRESULT

public expect fun VarCyFromBool(boolin: VARIANT_BOOL, pcyout: Long): HRESULT

public expect fun VarCyFromDate(datein: Double, pcyout: Long): HRESULT

public expect fun VarCyFromDec(pdecin: Long, pcyout: Long): HRESULT

public expect fun VarCyFromDisp(pdispin: Long, lcid: UInt, pcyout: Long): HRESULT

public expect fun VarCyFromI1(cin: Byte, pcyout: Long): HRESULT

public expect fun VarCyFromI2(sin: Short, pcyout: Long): HRESULT

public expect fun VarCyFromI4(lin: Int, pcyout: Long): HRESULT

public expect fun VarCyFromI8(i64in: Long, pcyout: Long): HRESULT

public expect fun VarCyFromR4(fltin: Float, pcyout: Long): HRESULT

public expect fun VarCyFromR8(dblin: Double, pcyout: Long): HRESULT

public expect fun VarCyFromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, pcyout: Long): HRESULT

public expect fun VarCyFromUI1(bin: UByte, pcyout: Long): HRESULT

public expect fun VarCyFromUI2(uiin: UShort, pcyout: Long): HRESULT

public expect fun VarCyFromUI4(ulin: UInt, pcyout: Long): HRESULT

public expect fun VarCyFromUI8(ui64in: ULong, pcyout: Long): HRESULT

public expect fun VarCyInt(cyin: CY, pcyresult: Long): HRESULT

public expect fun VarCyMul(cyleft: CY, cyright: CY, pcyresult: Long): HRESULT

public expect fun VarCyMulI4(cyleft: CY, lright: Int, pcyresult: Long): HRESULT

public expect fun VarCyMulI8(cyleft: CY, lright: Long, pcyresult: Long): HRESULT

public expect fun VarCyNeg(cyin: CY, pcyresult: Long): HRESULT

public expect fun VarCyRound(cyin: CY, cdecimals: Int, pcyresult: Long): HRESULT

public expect fun VarCySub(cyleft: CY, cyright: CY, pcyresult: Long): HRESULT

public expect fun VarDateFromBool(boolin: VARIANT_BOOL, pdateout: Long): HRESULT

public expect fun VarDateFromCy(cyin: CY, pdateout: Long): HRESULT

public expect fun VarDateFromDec(pdecin: Long, pdateout: Long): HRESULT

public expect fun VarDateFromDisp(pdispin: Long, lcid: UInt, pdateout: Long): HRESULT

public expect fun VarDateFromI1(cin: Byte, pdateout: Long): HRESULT

public expect fun VarDateFromI2(sin: Short, pdateout: Long): HRESULT

public expect fun VarDateFromI4(lin: Int, pdateout: Long): HRESULT

public expect fun VarDateFromI8(i64in: Long, pdateout: Long): HRESULT

public expect fun VarDateFromR4(fltin: Float, pdateout: Long): HRESULT

public expect fun VarDateFromR8(dblin: Double, pdateout: Long): HRESULT

public expect fun VarDateFromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, pdateout: Long): HRESULT

public expect fun VarDateFromUI1(bin: UByte, pdateout: Long): HRESULT

public expect fun VarDateFromUI2(uiin: UShort, pdateout: Long): HRESULT

public expect fun VarDateFromUI4(ulin: UInt, pdateout: Long): HRESULT

public expect fun VarDateFromUI8(ui64in: ULong, pdateout: Long): HRESULT

public expect fun VarDateFromUdate(pudatein: Long, dwflags: UInt, pdateout: Long): HRESULT

public expect fun VarDateFromUdateEx(pudatein: Long, lcid: UInt, dwflags: UInt, pdateout: Long): HRESULT

public expect fun VarDecAbs(pdecin: Long, pdecresult: Long): HRESULT

public expect fun VarDecAdd(pdecleft: Long, pdecright: Long, pdecresult: Long): HRESULT

public expect fun VarDecCmp(pdecleft: Long, pdecright: Long): VARCMP

public expect fun VarDecCmpR8(pdecleft: Long, dblright: Double): VARCMP

public expect fun VarDecDiv(pdecleft: Long, pdecright: Long, pdecresult: Long): HRESULT

public expect fun VarDecFix(pdecin: Long, pdecresult: Long): HRESULT

public expect fun VarDecFromBool(boolin: VARIANT_BOOL, pdecout: Long): HRESULT

public expect fun VarDecFromCy(cyin: CY, pdecout: Long): HRESULT

public expect fun VarDecFromDate(datein: Double, pdecout: Long): HRESULT

public expect fun VarDecFromDisp(pdispin: Long, lcid: UInt, pdecout: Long): HRESULT

public expect fun VarDecFromI1(cin: Byte, pdecout: Long): HRESULT

public expect fun VarDecFromI2(uiin: Short, pdecout: Long): HRESULT

public expect fun VarDecFromI4(lin: Int, pdecout: Long): HRESULT

public expect fun VarDecFromI8(i64in: Long, pdecout: Long): HRESULT

public expect fun VarDecFromR4(fltin: Float, pdecout: Long): HRESULT

public expect fun VarDecFromR8(dblin: Double, pdecout: Long): HRESULT

public expect fun VarDecFromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, pdecout: Long): HRESULT

public expect fun VarDecFromUI1(bin: UByte, pdecout: Long): HRESULT

public expect fun VarDecFromUI2(uiin: UShort, pdecout: Long): HRESULT

public expect fun VarDecFromUI4(ulin: UInt, pdecout: Long): HRESULT

public expect fun VarDecFromUI8(ui64in: ULong, pdecout: Long): HRESULT

public expect fun VarDecInt(pdecin: Long, pdecresult: Long): HRESULT

public expect fun VarDecMul(pdecleft: Long, pdecright: Long, pdecresult: Long): HRESULT

public expect fun VarDecNeg(pdecin: Long, pdecresult: Long): HRESULT

public expect fun VarDecRound(pdecin: Long, cdecimals: Int, pdecresult: Long): HRESULT

public expect fun VarDecSub(pdecleft: Long, pdecright: Long, pdecresult: Long): HRESULT

public expect fun VarDiv(pvarleft: Long, pvarright: Long, pvarresult: Long): HRESULT

public expect fun VarEqv(pvarleft: Long, pvarright: Long, pvarresult: Long): HRESULT

public expect fun VarFix(pvarin: Long, pvarresult: Long): HRESULT

public expect fun VarFormat(pvarin: Long, pstrformat: PCWSTR, ifirstday: VARFORMAT_FIRST_DAY, ifirstweek: VARFORMAT_FIRST_WEEK, dwflags: UInt, pbstrout: Long): HRESULT

public expect fun VarFormatCurrency(pvarin: Long, inumdig: Int, iinclead: Int, iuseparens: Int, igroup: Int, dwflags: UInt, pbstrout: Long): HRESULT

public expect fun VarFormatDateTime(pvarin: Long, inamedformat: VARFORMAT_NAMED_FORMAT, dwflags: UInt, pbstrout: Long): HRESULT

public expect fun VarFormatFromTokens(pvarin: Long, pstrformat: PCWSTR, pbtokcur: Long, dwflags: UInt, pbstrout: Long, lcid: UInt): HRESULT

public expect fun VarFormatNumber(pvarin: Long, inumdig: Int, iinclead: VARFORMAT_LEADING_DIGIT, iuseparens: VARFORMAT_PARENTHESES, igroup: VARFORMAT_GROUP, dwflags: UInt, pbstrout: Long): HRESULT

public expect fun VarFormatPercent(pvarin: Long, inumdig: Int, iinclead: VARFORMAT_LEADING_DIGIT, iuseparens: VARFORMAT_PARENTHESES, igroup: VARFORMAT_GROUP, dwflags: UInt, pbstrout: Long): HRESULT

public expect fun VarI1FromBool(boolin: VARIANT_BOOL, pcout: PSTR): HRESULT

public expect fun VarI1FromCy(cyin: CY, pcout: PSTR): HRESULT

public expect fun VarI1FromDate(datein: Double, pcout: PSTR): HRESULT

public expect fun VarI1FromDec(pdecin: Long, pcout: PSTR): HRESULT

public expect fun VarI1FromDisp(pdispin: Long, lcid: UInt, pcout: PSTR): HRESULT

public expect fun VarI1FromI2(uiin: Short, pcout: PSTR): HRESULT

public expect fun VarI1FromI4(lin: Int, pcout: PSTR): HRESULT

public expect fun VarI1FromI8(i64in: Long, pcout: PSTR): HRESULT

public expect fun VarI1FromR4(fltin: Float, pcout: PSTR): HRESULT

public expect fun VarI1FromR8(dblin: Double, pcout: PSTR): HRESULT

public expect fun VarI1FromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, pcout: PSTR): HRESULT

public expect fun VarI1FromUI1(bin: UByte, pcout: PSTR): HRESULT

public expect fun VarI1FromUI2(uiin: UShort, pcout: PSTR): HRESULT

public expect fun VarI1FromUI4(ulin: UInt, pcout: PSTR): HRESULT

public expect fun VarI1FromUI8(i64in: ULong, pcout: PSTR): HRESULT

public expect fun VarI2FromBool(boolin: VARIANT_BOOL, psout: Long): HRESULT

public expect fun VarI2FromCy(cyin: CY, psout: Long): HRESULT

public expect fun VarI2FromDate(datein: Double, psout: Long): HRESULT

public expect fun VarI2FromDec(pdecin: Long, psout: Long): HRESULT

public expect fun VarI2FromDisp(pdispin: Long, lcid: UInt, psout: Long): HRESULT

public expect fun VarI2FromI1(cin: Byte, psout: Long): HRESULT

public expect fun VarI2FromI4(lin: Int, psout: Long): HRESULT

public expect fun VarI2FromI8(i64in: Long, psout: Long): HRESULT

public expect fun VarI2FromR4(fltin: Float, psout: Long): HRESULT

public expect fun VarI2FromR8(dblin: Double, psout: Long): HRESULT

public expect fun VarI2FromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, psout: Long): HRESULT

public expect fun VarI2FromUI1(bin: UByte, psout: Long): HRESULT

public expect fun VarI2FromUI2(uiin: UShort, psout: Long): HRESULT

public expect fun VarI2FromUI4(ulin: UInt, psout: Long): HRESULT

public expect fun VarI2FromUI8(ui64in: ULong, psout: Long): HRESULT

public expect fun VarI4FromBool(boolin: VARIANT_BOOL, plout: Long): HRESULT

public expect fun VarI4FromCy(cyin: CY, plout: Long): HRESULT

public expect fun VarI4FromDate(datein: Double, plout: Long): HRESULT

public expect fun VarI4FromDec(pdecin: Long, plout: Long): HRESULT

public expect fun VarI4FromDisp(pdispin: Long, lcid: UInt, plout: Long): HRESULT

public expect fun VarI4FromI1(cin: Byte, plout: Long): HRESULT

public expect fun VarI4FromI2(sin: Short, plout: Long): HRESULT

public expect fun VarI4FromI8(i64in: Long, plout: Long): HRESULT

public expect fun VarI4FromR4(fltin: Float, plout: Long): HRESULT

public expect fun VarI4FromR8(dblin: Double, plout: Long): HRESULT

public expect fun VarI4FromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, plout: Long): HRESULT

public expect fun VarI4FromUI1(bin: UByte, plout: Long): HRESULT

public expect fun VarI4FromUI2(uiin: UShort, plout: Long): HRESULT

public expect fun VarI4FromUI4(ulin: UInt, plout: Long): HRESULT

public expect fun VarI4FromUI8(ui64in: ULong, plout: Long): HRESULT

public expect fun VarI8FromBool(boolin: VARIANT_BOOL, pi64out: Long): HRESULT

public expect fun VarI8FromCy(cyin: CY, pi64out: Long): HRESULT

public expect fun VarI8FromDate(datein: Double, pi64out: Long): HRESULT

public expect fun VarI8FromDec(pdecin: Long, pi64out: Long): HRESULT

public expect fun VarI8FromDisp(pdispin: Long, lcid: UInt, pi64out: Long): HRESULT

public expect fun VarI8FromI1(cin: Byte, pi64out: Long): HRESULT

public expect fun VarI8FromI2(sin: Short, pi64out: Long): HRESULT

public expect fun VarI8FromR4(fltin: Float, pi64out: Long): HRESULT

public expect fun VarI8FromR8(dblin: Double, pi64out: Long): HRESULT

public expect fun VarI8FromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, pi64out: Long): HRESULT

public expect fun VarI8FromUI1(bin: UByte, pi64out: Long): HRESULT

public expect fun VarI8FromUI2(uiin: UShort, pi64out: Long): HRESULT

public expect fun VarI8FromUI4(ulin: UInt, pi64out: Long): HRESULT

public expect fun VarI8FromUI8(ui64in: ULong, pi64out: Long): HRESULT

public expect fun VarIdiv(pvarleft: Long, pvarright: Long, pvarresult: Long): HRESULT

public expect fun VarImp(pvarleft: Long, pvarright: Long, pvarresult: Long): HRESULT

public expect fun VarInt(pvarin: Long, pvarresult: Long): HRESULT

public expect fun VarMod(pvarleft: Long, pvarright: Long, pvarresult: Long): HRESULT

public expect fun VarMonthName(imonth: Int, fabbrev: Int, dwflags: UInt, pbstrout: Long): HRESULT

public expect fun VarMul(pvarleft: Long, pvarright: Long, pvarresult: Long): HRESULT

public expect fun VarNeg(pvarin: Long, pvarresult: Long): HRESULT

public expect fun VarNot(pvarin: Long, pvarresult: Long): HRESULT

public expect fun VarNumFromParseNum(pnumprs: Long, rgbdig: Long, dwvtbits: UInt, pvar: Long): HRESULT

public expect fun VarOr(pvarleft: Long, pvarright: Long, pvarresult: Long): HRESULT

public expect fun VarParseNumFromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, pnumprs: Long, rgbdig: Long): HRESULT

public expect fun VarPow(pvarleft: Long, pvarright: Long, pvarresult: Long): HRESULT

public expect fun VarR4CmpR8(fltleft: Float, dblright: Double): VARCMP

public expect fun VarR4FromBool(boolin: VARIANT_BOOL, pfltout: Long): HRESULT

public expect fun VarR4FromCy(cyin: CY, pfltout: Long): HRESULT

public expect fun VarR4FromDate(datein: Double, pfltout: Long): HRESULT

public expect fun VarR4FromDec(pdecin: Long, pfltout: Long): HRESULT

public expect fun VarR4FromDisp(pdispin: Long, lcid: UInt, pfltout: Long): HRESULT

public expect fun VarR4FromI1(cin: Byte, pfltout: Long): HRESULT

public expect fun VarR4FromI2(sin: Short, pfltout: Long): HRESULT

public expect fun VarR4FromI4(lin: Int, pfltout: Long): HRESULT

public expect fun VarR4FromI8(i64in: Long, pfltout: Long): HRESULT

public expect fun VarR4FromR8(dblin: Double, pfltout: Long): HRESULT

public expect fun VarR4FromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, pfltout: Long): HRESULT

public expect fun VarR4FromUI1(bin: UByte, pfltout: Long): HRESULT

public expect fun VarR4FromUI2(uiin: UShort, pfltout: Long): HRESULT

public expect fun VarR4FromUI4(ulin: UInt, pfltout: Long): HRESULT

public expect fun VarR4FromUI8(ui64in: ULong, pfltout: Long): HRESULT

public expect fun VarR8FromBool(boolin: VARIANT_BOOL, pdblout: Long): HRESULT

public expect fun VarR8FromCy(cyin: CY, pdblout: Long): HRESULT

public expect fun VarR8FromDate(datein: Double, pdblout: Long): HRESULT

public expect fun VarR8FromDec(pdecin: Long, pdblout: Long): HRESULT

public expect fun VarR8FromDisp(pdispin: Long, lcid: UInt, pdblout: Long): HRESULT

public expect fun VarR8FromI1(cin: Byte, pdblout: Long): HRESULT

public expect fun VarR8FromI2(sin: Short, pdblout: Long): HRESULT

public expect fun VarR8FromI4(lin: Int, pdblout: Long): HRESULT

public expect fun VarR8FromI8(i64in: Long, pdblout: Long): HRESULT

public expect fun VarR8FromR4(fltin: Float, pdblout: Long): HRESULT

public expect fun VarR8FromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, pdblout: Long): HRESULT

public expect fun VarR8FromUI1(bin: UByte, pdblout: Long): HRESULT

public expect fun VarR8FromUI2(uiin: UShort, pdblout: Long): HRESULT

public expect fun VarR8FromUI4(ulin: UInt, pdblout: Long): HRESULT

public expect fun VarR8FromUI8(ui64in: ULong, pdblout: Long): HRESULT

public expect fun VarR8Pow(dblleft: Double, dblright: Double, pdblresult: Long): HRESULT

public expect fun VarR8Round(dblin: Double, cdecimals: Int, pdblresult: Long): HRESULT

public expect fun VarRound(pvarin: Long, cdecimals: Int, pvarresult: Long): HRESULT

public expect fun VarSub(pvarleft: Long, pvarright: Long, pvarresult: Long): HRESULT

public expect fun VarTokenizeFormatString(pstrformat: PCWSTR, rgbtok: Long, cbtok: Int, ifirstday: VARFORMAT_FIRST_DAY, ifirstweek: VARFORMAT_FIRST_WEEK, lcid: UInt, pcbactual: Long): HRESULT

public expect fun VarUI1FromBool(boolin: VARIANT_BOOL, pbout: Long): HRESULT

public expect fun VarUI1FromCy(cyin: CY, pbout: Long): HRESULT

public expect fun VarUI1FromDate(datein: Double, pbout: Long): HRESULT

public expect fun VarUI1FromDec(pdecin: Long, pbout: Long): HRESULT

public expect fun VarUI1FromDisp(pdispin: Long, lcid: UInt, pbout: Long): HRESULT

public expect fun VarUI1FromI1(cin: Byte, pbout: Long): HRESULT

public expect fun VarUI1FromI2(sin: Short, pbout: Long): HRESULT

public expect fun VarUI1FromI4(lin: Int, pbout: Long): HRESULT

public expect fun VarUI1FromI8(i64in: Long, pbout: Long): HRESULT

public expect fun VarUI1FromR4(fltin: Float, pbout: Long): HRESULT

public expect fun VarUI1FromR8(dblin: Double, pbout: Long): HRESULT

public expect fun VarUI1FromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, pbout: Long): HRESULT

public expect fun VarUI1FromUI2(uiin: UShort, pbout: Long): HRESULT

public expect fun VarUI1FromUI4(ulin: UInt, pbout: Long): HRESULT

public expect fun VarUI1FromUI8(ui64in: ULong, pbout: Long): HRESULT

public expect fun VarUI2FromBool(boolin: VARIANT_BOOL, puiout: Long): HRESULT

public expect fun VarUI2FromCy(cyin: CY, puiout: Long): HRESULT

public expect fun VarUI2FromDate(datein: Double, puiout: Long): HRESULT

public expect fun VarUI2FromDec(pdecin: Long, puiout: Long): HRESULT

public expect fun VarUI2FromDisp(pdispin: Long, lcid: UInt, puiout: Long): HRESULT

public expect fun VarUI2FromI1(cin: Byte, puiout: Long): HRESULT

public expect fun VarUI2FromI2(uiin: Short, puiout: Long): HRESULT

public expect fun VarUI2FromI4(lin: Int, puiout: Long): HRESULT

public expect fun VarUI2FromI8(i64in: Long, puiout: Long): HRESULT

public expect fun VarUI2FromR4(fltin: Float, puiout: Long): HRESULT

public expect fun VarUI2FromR8(dblin: Double, puiout: Long): HRESULT

public expect fun VarUI2FromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, puiout: Long): HRESULT

public expect fun VarUI2FromUI1(bin: UByte, puiout: Long): HRESULT

public expect fun VarUI2FromUI4(ulin: UInt, puiout: Long): HRESULT

public expect fun VarUI2FromUI8(i64in: ULong, puiout: Long): HRESULT

public expect fun VarUI4FromBool(boolin: VARIANT_BOOL, pulout: Long): HRESULT

public expect fun VarUI4FromCy(cyin: CY, pulout: Long): HRESULT

public expect fun VarUI4FromDate(datein: Double, pulout: Long): HRESULT

public expect fun VarUI4FromDec(pdecin: Long, pulout: Long): HRESULT

public expect fun VarUI4FromDisp(pdispin: Long, lcid: UInt, pulout: Long): HRESULT

public expect fun VarUI4FromI1(cin: Byte, pulout: Long): HRESULT

public expect fun VarUI4FromI2(uiin: Short, pulout: Long): HRESULT

public expect fun VarUI4FromI4(lin: Int, pulout: Long): HRESULT

public expect fun VarUI4FromI8(i64in: Long, plout: Long): HRESULT

public expect fun VarUI4FromR4(fltin: Float, pulout: Long): HRESULT

public expect fun VarUI4FromR8(dblin: Double, pulout: Long): HRESULT

public expect fun VarUI4FromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, pulout: Long): HRESULT

public expect fun VarUI4FromUI1(bin: UByte, pulout: Long): HRESULT

public expect fun VarUI4FromUI2(uiin: UShort, pulout: Long): HRESULT

public expect fun VarUI4FromUI8(ui64in: ULong, plout: Long): HRESULT

public expect fun VarUI8FromBool(boolin: VARIANT_BOOL, pi64out: Long): HRESULT

public expect fun VarUI8FromCy(cyin: CY, pi64out: Long): HRESULT

public expect fun VarUI8FromDate(datein: Double, pi64out: Long): HRESULT

public expect fun VarUI8FromDec(pdecin: Long, pi64out: Long): HRESULT

public expect fun VarUI8FromDisp(pdispin: Long, lcid: UInt, pi64out: Long): HRESULT

public expect fun VarUI8FromI1(cin: Byte, pi64out: Long): HRESULT

public expect fun VarUI8FromI2(sin: Short, pi64out: Long): HRESULT

public expect fun VarUI8FromI8(ui64in: Long, pi64out: Long): HRESULT

public expect fun VarUI8FromR4(fltin: Float, pi64out: Long): HRESULT

public expect fun VarUI8FromR8(dblin: Double, pi64out: Long): HRESULT

public expect fun VarUI8FromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, pi64out: Long): HRESULT

public expect fun VarUI8FromUI1(bin: UByte, pi64out: Long): HRESULT

public expect fun VarUI8FromUI2(uiin: UShort, pi64out: Long): HRESULT

public expect fun VarUI8FromUI4(ulin: UInt, pi64out: Long): HRESULT

public expect fun VarUdateFromDate(datein: Double, dwflags: UInt, pudateout: Long): HRESULT

public expect fun VarWeekdayName(iweekday: Int, fabbrev: Int, ifirstday: Int, dwflags: UInt, pbstrout: Long): HRESULT

public expect fun VarXor(pvarleft: Long, pvarright: Long, pvarresult: Long): HRESULT

public expect fun VectorFromBstr(bstr: BSTR, ppsa: Long): HRESULT
