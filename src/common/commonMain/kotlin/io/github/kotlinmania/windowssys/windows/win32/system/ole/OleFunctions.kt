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
import io.github.kotlinmania.windowssys.windows.win32.system.variant.Variant
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Haccel
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Hcursor
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Hicon
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Hmenu

public expect fun bstrFromVector(psa: ConstPtr, pbstr: MutPtr): Hresult

public expect fun clearCustData(pcustdata: MutPtr)

public expect fun createDispTypeInfo(pidata: MutPtr, lcid: UInt, pptinfo: MutPtr): Hresult

public expect fun createErrorInfo(pperrinfo: MutPtr): Hresult

public expect fun createOleAdviseHolder(ppoaholder: MutPtr): Hresult

public expect fun createStdDispatch(punkouter: MutPtr, pvthis: MutPtr, ptinfo: MutPtr, ppunkstddisp: MutPtr): Hresult

public expect fun createTypeLib(syskind: Syskind, szfile: Pcwstr, ppctlib: MutPtr): Hresult

public expect fun createTypeLib2(syskind: Syskind, szfile: Pcwstr, ppctlib: MutPtr): Hresult

public expect fun dispCallFunc(pvinstance: ConstPtr, ovft: ULong, cc: Callconv, vtreturn: Variant.Varenum, cactuals: UInt, prgvt: ConstPtr, prgpvarg: ConstPtr, pvargresult: MutPtr): Hresult

public expect fun dispGetIDsOfNames(ptinfo: MutPtr, rgsznames: ConstPtr, cnames: UInt, rgdispid: MutPtr): Hresult

public expect fun dispGetParam(pdispparams: ConstPtr, position: UInt, vttarg: Variant.Varenum, pvarresult: MutPtr, puargerr: MutPtr): Hresult

public expect fun dispInvoke(thisRef: MutPtr, ptinfo: MutPtr, dispidmember: Int, wflags: UShort, pparams: MutPtr, pvarresult: MutPtr, pexcepinfo: MutPtr, puargerr: MutPtr): Hresult

public expect fun doDragDrop(pdataobj: MutPtr, pdropsource: MutPtr, dwokeffects: Dropeffect, pdweffect: MutPtr): Hresult

public expect fun getActiveObject(rclsid: ConstPtr, pvreserved: MutPtr, ppunk: MutPtr): Hresult

public expect fun getAltMonthNames(lcid: UInt, prgp: MutPtr): Hresult

public expect fun getRecordInfoFromGuids(rguidtypelib: ConstPtr, uvermajor: UInt, uverminor: UInt, lcid: UInt, rguidtypeinfo: ConstPtr, pprecinfo: MutPtr): Hresult

public expect fun getRecordInfoFromTypeInfo(ptypeinfo: MutPtr, pprecinfo: MutPtr): Hresult

public expect fun hrgnUserFree(param0: ConstPtr, param1: ConstPtr)

public expect fun hrgnUserFree64(param0: ConstPtr, param1: ConstPtr)

public expect fun hrgnUserMarshal(param0: ConstPtr, param1: MutPtr, param2: ConstPtr): MutPtr

public expect fun hrgnUserMarshal64(param0: ConstPtr, param1: MutPtr, param2: ConstPtr): MutPtr

public expect fun hrgnUserSize(param0: ConstPtr, param1: UInt, param2: ConstPtr): UInt

public expect fun hrgnUserSize64(param0: ConstPtr, param1: UInt, param2: ConstPtr): UInt

public expect fun hrgnUserUnmarshal(param0: ConstPtr, param1: ConstPtr, param2: MutPtr): MutPtr

public expect fun hrgnUserUnmarshal64(param0: ConstPtr, param1: ConstPtr, param2: MutPtr): MutPtr

public expect fun isAccelerator(haccel: Haccel, caccelentries: Int, lpmsg: ConstPtr, lpwcmd: MutPtr): Bool

public expect fun lHashValOfNameSys(syskind: Syskind, lcid: UInt, szname: Pcwstr): UInt

public expect fun lHashValOfNameSysA(syskind: Syskind, lcid: UInt, szname: Pcstr): UInt

public expect fun loadRegTypeLib(rguid: ConstPtr, wvermajor: UShort, wverminor: UShort, lcid: UInt, pptlib: MutPtr): Hresult

public expect fun loadTypeLib(szfile: Pcwstr, pptlib: MutPtr): Hresult

public expect fun loadTypeLibEx(szfile: Pcwstr, regkind: Regkind, pptlib: MutPtr): Hresult

public expect fun oaBuildVersion(): UInt

public expect fun oaEnablePerUserTLibRegistration()

public expect fun oleBuildVersion(): UInt

public expect fun oleConvertOLESTREAMToIStorage2(lpolestream: ConstPtr, pstg: MutPtr, ptd: ConstPtr, opt: UInt, pvcallbackcontext: ConstPtr, pqueryconvertolelinkcallback: Olestreamqueryconvertolelinkcallback): Hresult

public expect fun oleConvertOLESTREAMToIStorageEx2(polestm: ConstPtr, pstg: MutPtr, pcfformat: MutPtr, plwwidth: MutPtr, plheight: MutPtr, pdwsize: MutPtr, pmedium: MutPtr, opt: UInt, pvcallbackcontext: ConstPtr, pqueryconvertolelinkcallback: Olestreamqueryconvertolelinkcallback): Hresult

public expect fun oleCreate(rclsid: ConstPtr, riid: ConstPtr, renderopt: UInt, pformatetc: ConstPtr, pclientsite: MutPtr, pstg: MutPtr, ppvobj: MutPtr): Hresult

public expect fun oleCreateDefaultHandler(clsid: ConstPtr, punkouter: MutPtr, riid: ConstPtr, lplpobj: MutPtr): Hresult

public expect fun oleCreateEmbeddingHelper(clsid: ConstPtr, punkouter: MutPtr, flags: EmbdhlpFlags, pcf: MutPtr, riid: ConstPtr, lplpobj: MutPtr): Hresult

public expect fun oleCreateEx(rclsid: ConstPtr, riid: ConstPtr, dwflags: Olecreate, renderopt: UInt, cformats: UInt, rgadvf: ConstPtr, rgformatetc: ConstPtr, lpadvisesink: MutPtr, rgdwconnection: MutPtr, pclientsite: MutPtr, pstg: MutPtr, ppvobj: MutPtr): Hresult

public expect fun oleCreateFontIndirect(lpfontdesc: ConstPtr, riid: ConstPtr, lplpvobj: MutPtr): Hresult

public expect fun oleCreateFromData(psrcdataobj: MutPtr, riid: ConstPtr, renderopt: UInt, pformatetc: ConstPtr, pclientsite: MutPtr, pstg: MutPtr, ppvobj: MutPtr): Hresult

public expect fun oleCreateFromDataEx(psrcdataobj: MutPtr, riid: ConstPtr, dwflags: Olecreate, renderopt: UInt, cformats: UInt, rgadvf: ConstPtr, rgformatetc: ConstPtr, lpadvisesink: MutPtr, rgdwconnection: MutPtr, pclientsite: MutPtr, pstg: MutPtr, ppvobj: MutPtr): Hresult

public expect fun oleCreateFromFile(rclsid: ConstPtr, lpszfilename: Pcwstr, riid: ConstPtr, renderopt: UInt, lpformatetc: ConstPtr, pclientsite: MutPtr, pstg: MutPtr, ppvobj: MutPtr): Hresult

public expect fun oleCreateFromFileEx(rclsid: ConstPtr, lpszfilename: Pcwstr, riid: ConstPtr, dwflags: Olecreate, renderopt: UInt, cformats: UInt, rgadvf: ConstPtr, rgformatetc: ConstPtr, lpadvisesink: MutPtr, rgdwconnection: MutPtr, pclientsite: MutPtr, pstg: MutPtr, ppvobj: MutPtr): Hresult

public expect fun oleCreateLink(pmklinksrc: MutPtr, riid: ConstPtr, renderopt: UInt, lpformatetc: ConstPtr, pclientsite: MutPtr, pstg: MutPtr, ppvobj: MutPtr): Hresult

public expect fun oleCreateLinkEx(pmklinksrc: MutPtr, riid: ConstPtr, dwflags: Olecreate, renderopt: UInt, cformats: UInt, rgadvf: ConstPtr, rgformatetc: ConstPtr, lpadvisesink: MutPtr, rgdwconnection: MutPtr, pclientsite: MutPtr, pstg: MutPtr, ppvobj: MutPtr): Hresult

public expect fun oleCreateLinkFromData(psrcdataobj: MutPtr, riid: ConstPtr, renderopt: UInt, pformatetc: ConstPtr, pclientsite: MutPtr, pstg: MutPtr, ppvobj: MutPtr): Hresult

public expect fun oleCreateLinkFromDataEx(psrcdataobj: MutPtr, riid: ConstPtr, dwflags: Olecreate, renderopt: UInt, cformats: UInt, rgadvf: ConstPtr, rgformatetc: ConstPtr, lpadvisesink: MutPtr, rgdwconnection: MutPtr, pclientsite: MutPtr, pstg: MutPtr, ppvobj: MutPtr): Hresult

public expect fun oleCreateLinkToFile(lpszfilename: Pcwstr, riid: ConstPtr, renderopt: UInt, lpformatetc: ConstPtr, pclientsite: MutPtr, pstg: MutPtr, ppvobj: MutPtr): Hresult

public expect fun oleCreateLinkToFileEx(lpszfilename: Pcwstr, riid: ConstPtr, dwflags: Olecreate, renderopt: UInt, cformats: UInt, rgadvf: ConstPtr, rgformatetc: ConstPtr, lpadvisesink: MutPtr, rgdwconnection: MutPtr, pclientsite: MutPtr, pstg: MutPtr, ppvobj: MutPtr): Hresult

public expect fun oleCreateMenuDescriptor(hmenucombined: Hmenu, lpmenuwidths: ConstPtr): Long

public expect fun oleCreatePictureIndirect(lppictdesc: ConstPtr, riid: ConstPtr, fown: Bool, lplpvobj: MutPtr): Hresult

public expect fun oleCreatePropertyFrame(hwndowner: Hwnd, x: UInt, y: UInt, lpszcaption: Pcwstr, cobjects: UInt, ppunk: ConstPtr, cpages: UInt, ppageclsid: ConstPtr, lcid: UInt, dwreserved: UInt, pvreserved: ConstPtr): Hresult

public expect fun oleCreatePropertyFrameIndirect(lpparams: ConstPtr): Hresult

public expect fun oleCreateStaticFromData(psrcdataobj: MutPtr, iid: ConstPtr, renderopt: UInt, pformatetc: ConstPtr, pclientsite: MutPtr, pstg: MutPtr, ppvobj: MutPtr): Hresult

public expect fun oleDestroyMenuDescriptor(holemenu: Long): Hresult

public expect fun oleDoAutoConvert(pstg: MutPtr, pclsidnew: MutPtr): Hresult

public expect fun oleDraw(punknown: MutPtr, dwaspect: UInt, hdcdraw: Hdc, lprcbounds: ConstPtr): Hresult

public expect fun oleDuplicateData(hsrc: Handle, cfformat: ClipboardFormat, uiflags: GlobalAllocFlags): Handle

public expect fun oleFlushClipboard(): Hresult

public expect fun oleGetAutoConvert(clsidold: ConstPtr, pclsidnew: MutPtr): Hresult

public expect fun oleGetClipboard(ppdataobj: MutPtr): Hresult

public expect fun oleGetClipboardWithEnterpriseInfo(dataobject: MutPtr, dataenterpriseid: MutPtr, sourcedescription: MutPtr, targetdescription: MutPtr, datadescription: MutPtr): Hresult

public expect fun oleGetIconOfClass(rclsid: ConstPtr, lpszlabel: Pcwstr, fusetypeaslabel: Bool): Hglobal

public expect fun oleGetIconOfFile(lpszpath: Pcwstr, fusefileaslabel: Bool): Hglobal

public expect fun oleIconToCursor(hinstexe: Hinstance, hicon: Hicon): Hcursor

public expect fun oleInitialize(pvreserved: ConstPtr): Hresult

public expect fun oleIsCurrentClipboard(pdataobj: MutPtr): Hresult

public expect fun oleIsRunning(pobject: MutPtr): Bool

public expect fun oleLoad(pstg: MutPtr, riid: ConstPtr, pclientsite: MutPtr, ppvobj: MutPtr): Hresult

public expect fun oleLoadFromStream(pstm: MutPtr, iidinterface: ConstPtr, ppvobj: MutPtr): Hresult

public expect fun oleLoadPicture(lpstream: MutPtr, lsize: Int, frunmode: Bool, riid: ConstPtr, lplpvobj: MutPtr): Hresult

public expect fun oleLoadPictureEx(lpstream: MutPtr, lsize: Int, frunmode: Bool, riid: ConstPtr, xsizedesired: UInt, ysizedesired: UInt, dwflags: LoadPictureFlags, lplpvobj: MutPtr): Hresult

public expect fun oleLoadPictureFile(varfilename: Variant.Variant, lplpdisppicture: MutPtr): Hresult

public expect fun oleLoadPictureFileEx(varfilename: Variant.Variant, xsizedesired: UInt, ysizedesired: UInt, dwflags: LoadPictureFlags, lplpdisppicture: MutPtr): Hresult

public expect fun oleLoadPicturePath(szurlorpath: Pcwstr, punkcaller: MutPtr, dwreserved: UInt, clrreserved: UInt, riid: ConstPtr, ppvret: MutPtr): Hresult

public expect fun oleLockRunning(punknown: MutPtr, flock: Bool, flastunlockcloses: Bool): Hresult

public expect fun oleMetafilePictFromIconAndLabel(hicon: Hicon, lpszlabel: Pcwstr, lpszsourcefile: Pcwstr, iiconindex: UInt): Hglobal

public expect fun oleNoteObjectVisible(punknown: MutPtr, fvisible: Bool): Hresult

public expect fun oleQueryCreateFromData(psrcdataobject: MutPtr): Hresult

public expect fun oleQueryLinkFromData(psrcdataobject: MutPtr): Hresult

public expect fun oleRegEnumFormatEtc(clsid: ConstPtr, dwdirection: UInt, ppenum: MutPtr): Hresult

public expect fun oleRegEnumVerbs(clsid: ConstPtr, ppenum: MutPtr): Hresult

public expect fun oleRegGetMiscStatus(clsid: ConstPtr, dwaspect: UInt, pdwstatus: MutPtr): Hresult

public expect fun oleRegGetUserType(clsid: ConstPtr, dwformoftype: UInt, pszusertype: MutPtr): Hresult

public expect fun oleRun(punknown: MutPtr): Hresult

public expect fun oleSave(pps: MutPtr, pstg: MutPtr, fsameasload: Bool): Hresult

public expect fun oleSavePictureFile(lpdisppicture: MutPtr, bstrfilename: Bstr): Hresult

public expect fun oleSaveToStream(ppstm: MutPtr, pstm: MutPtr): Hresult

public expect fun oleSetAutoConvert(clsidold: ConstPtr, clsidnew: ConstPtr): Hresult

public expect fun oleSetClipboard(pdataobj: MutPtr): Hresult

public expect fun oleSetContainedObject(punknown: MutPtr, fcontained: Bool): Hresult

public expect fun oleSetMenuDescriptor(holemenu: Long, hwndframe: Hwnd, hwndactiveobject: Hwnd, lpframe: MutPtr, lpactiveobj: MutPtr): Hresult

public expect fun oleTranslateAccelerator(lpframe: MutPtr, lpframeinfo: ConstPtr, lpmsg: ConstPtr): Hresult

public expect fun oleTranslateColor(clr: UInt, hpal: Hpalette, lpcolorref: MutPtr): Hresult

public expect fun oleUIAddVerbMenuA(lpoleobj: MutPtr, lpszshorttype: Pcstr, hmenu: Hmenu, upos: UInt, uidverbmin: UInt, uidverbmax: UInt, baddconvert: Bool, idconvert: UInt, lphmenu: MutPtr): Bool

public expect fun oleUIAddVerbMenuW(lpoleobj: MutPtr, lpszshorttype: Pcwstr, hmenu: Hmenu, upos: UInt, uidverbmin: UInt, uidverbmax: UInt, baddconvert: Bool, idconvert: UInt, lphmenu: MutPtr): Bool

public expect fun oleUIBusyA(param0: ConstPtr): UInt

public expect fun oleUIBusyW(param0: ConstPtr): UInt

public expect fun oleUICanConvertOrActivateAs(rclsid: ConstPtr, fislinkedobject: Bool, wformat: UShort): Bool

public expect fun oleUIChangeIconA(param0: ConstPtr): UInt

public expect fun oleUIChangeIconW(param0: ConstPtr): UInt

public expect fun oleUIChangeSourceA(param0: ConstPtr): UInt

public expect fun oleUIChangeSourceW(param0: ConstPtr): UInt

public expect fun oleUIConvertA(param0: ConstPtr): UInt

public expect fun oleUIConvertW(param0: ConstPtr): UInt

public expect fun oleUIEditLinksA(param0: ConstPtr): UInt

public expect fun oleUIEditLinksW(param0: ConstPtr): UInt

public expect fun oleUIInsertObjectA(param0: ConstPtr): UInt

public expect fun oleUIInsertObjectW(param0: ConstPtr): UInt

public expect fun oleUIObjectPropertiesA(param0: ConstPtr): UInt

public expect fun oleUIObjectPropertiesW(param0: ConstPtr): UInt

public expect fun oleUIPasteSpecialA(param0: ConstPtr): UInt

public expect fun oleUIPasteSpecialW(param0: ConstPtr): UInt

public expect fun oleUIPromptUserA(ntemplate: Int, hwndparent: Hwnd, vararg variadicArgs: Long): Int

public expect fun oleUIPromptUserW(ntemplate: Int, hwndparent: Hwnd, vararg variadicArgs: Long): Int

public expect fun oleUIUpdateLinksA(lpoleuilinkcntr: MutPtr, hwndparent: Hwnd, lpsztitle: Pcstr, clinks: Int): Bool

public expect fun oleUIUpdateLinksW(lpoleuilinkcntr: MutPtr, hwndparent: Hwnd, lpsztitle: Pcwstr, clinks: Int): Bool

public expect fun oleUninitialize()

public expect fun queryPathOfRegTypeLib(guid: ConstPtr, wmaj: UShort, wmin: UShort, lcid: UInt, lpbstrpathname: MutPtr): Hresult

public expect fun registerActiveObject(punk: MutPtr, rclsid: ConstPtr, dwflags: ActiveobjectFlags, pdwregister: MutPtr): Hresult

public expect fun registerDragDrop(hwnd: Hwnd, pdroptarget: MutPtr): Hresult

public expect fun registerTypeLib(ptlib: MutPtr, szfullpath: Pcwstr, szhelpdir: Pcwstr): Hresult

public expect fun registerTypeLibForUser(ptlib: MutPtr, szfullpath: Pcwstr, szhelpdir: Pcwstr): Hresult

public expect fun releaseStgMedium(param0: MutPtr)

public expect fun revokeActiveObject(dwregister: UInt, pvreserved: MutPtr): Hresult

public expect fun revokeDragDrop(hwnd: Hwnd): Hresult

public expect fun safeArrayAccessData(psa: ConstPtr, ppvdata: MutPtr): Hresult

public expect fun safeArrayAddRef(psa: ConstPtr, ppdatatorelease: MutPtr): Hresult

public expect fun safeArrayAllocData(psa: ConstPtr): Hresult

public expect fun safeArrayAllocDescriptor(cdims: UInt, ppsaout: MutPtr): Hresult

public expect fun safeArrayAllocDescriptorEx(vt: Variant.Varenum, cdims: UInt, ppsaout: MutPtr): Hresult

public expect fun safeArrayCopy(psa: ConstPtr, ppsaout: MutPtr): Hresult

public expect fun safeArrayCopyData(psasource: ConstPtr, psatarget: ConstPtr): Hresult

public expect fun safeArrayCreate(vt: Variant.Varenum, cdims: UInt, rgsabound: ConstPtr): MutPtr

public expect fun safeArrayCreateEx(vt: Variant.Varenum, cdims: UInt, rgsabound: ConstPtr, pvextra: ConstPtr): MutPtr

public expect fun safeArrayCreateVector(vt: Variant.Varenum, llbound: Int, celements: UInt): MutPtr

public expect fun safeArrayCreateVectorEx(vt: Variant.Varenum, llbound: Int, celements: UInt, pvextra: ConstPtr): MutPtr

public expect fun safeArrayDestroy(psa: ConstPtr): Hresult

public expect fun safeArrayDestroyData(psa: ConstPtr): Hresult

public expect fun safeArrayDestroyDescriptor(psa: ConstPtr): Hresult

public expect fun safeArrayGetDim(psa: ConstPtr): UInt

public expect fun safeArrayGetElement(psa: ConstPtr, rgindices: ConstPtr, pv: MutPtr): Hresult

public expect fun safeArrayGetElemsize(psa: ConstPtr): UInt

public expect fun safeArrayGetIID(psa: ConstPtr, pguid: MutPtr): Hresult

public expect fun safeArrayGetLBound(psa: ConstPtr, ndim: UInt, pllbound: MutPtr): Hresult

public expect fun safeArrayGetRecordInfo(psa: ConstPtr, prinfo: MutPtr): Hresult

public expect fun safeArrayGetUBound(psa: ConstPtr, ndim: UInt, plubound: MutPtr): Hresult

public expect fun safeArrayGetVartype(psa: ConstPtr, pvt: MutPtr): Hresult

public expect fun safeArrayLock(psa: ConstPtr): Hresult

public expect fun safeArrayPtrOfIndex(psa: ConstPtr, rgindices: ConstPtr, ppvdata: MutPtr): Hresult

public expect fun safeArrayPutElement(psa: ConstPtr, rgindices: ConstPtr, pv: ConstPtr): Hresult

public expect fun safeArrayRedim(psa: MutPtr, psaboundnew: ConstPtr): Hresult

public expect fun safeArrayReleaseData(pdata: ConstPtr)

public expect fun safeArrayReleaseDescriptor(psa: ConstPtr)

public expect fun safeArraySetIID(psa: ConstPtr, guid: ConstPtr): Hresult

public expect fun safeArraySetRecordInfo(psa: ConstPtr, prinfo: MutPtr): Hresult

public expect fun safeArrayUnaccessData(psa: ConstPtr): Hresult

public expect fun safeArrayUnlock(psa: ConstPtr): Hresult

public expect fun unRegisterTypeLib(libid: ConstPtr, wvermajor: UShort, wverminor: UShort, lcid: UInt, syskind: Syskind): Hresult

public expect fun unRegisterTypeLibForUser(libid: ConstPtr, wmajorvernum: UShort, wminorvernum: UShort, lcid: UInt, syskind: Syskind): Hresult

public expect fun varAbs(pvarin: ConstPtr, pvarresult: MutPtr): Hresult

public expect fun varAdd(pvarleft: ConstPtr, pvarright: ConstPtr, pvarresult: MutPtr): Hresult

public expect fun varAnd(pvarleft: ConstPtr, pvarright: ConstPtr, pvarresult: MutPtr): Hresult

public expect fun varBoolFromCy(cyin: CY, pboolout: MutPtr): Hresult

public expect fun varBoolFromDate(datein: Double, pboolout: MutPtr): Hresult

public expect fun varBoolFromDec(pdecin: ConstPtr, pboolout: MutPtr): Hresult

public expect fun varBoolFromDisp(pdispin: MutPtr, lcid: UInt, pboolout: MutPtr): Hresult

public expect fun varBoolFromI1(cin: Byte, pboolout: MutPtr): Hresult

public expect fun varBoolFromI2(sin: Short, pboolout: MutPtr): Hresult

public expect fun varBoolFromI4(lin: Int, pboolout: MutPtr): Hresult

public expect fun varBoolFromI8(i64in: Long, pboolout: MutPtr): Hresult

public expect fun varBoolFromR4(fltin: Float, pboolout: MutPtr): Hresult

public expect fun varBoolFromR8(dblin: Double, pboolout: MutPtr): Hresult

public expect fun varBoolFromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pboolout: MutPtr): Hresult

public expect fun varBoolFromUI1(bin: UByte, pboolout: MutPtr): Hresult

public expect fun varBoolFromUI2(uiin: UShort, pboolout: MutPtr): Hresult

public expect fun varBoolFromUI4(ulin: UInt, pboolout: MutPtr): Hresult

public expect fun varBoolFromUI8(i64in: ULong, pboolout: MutPtr): Hresult

public expect fun varBstrCat(bstrleft: Bstr, bstrright: Bstr, pbstrresult: MutPtr): Hresult

public expect fun varBstrCmp(bstrleft: Bstr, bstrright: Bstr, lcid: UInt, dwflags: UInt): Hresult

public expect fun varBstrFromBool(boolin: VariantBool, lcid: UInt, dwflags: UInt, pbstrout: MutPtr): Hresult

public expect fun varBstrFromCy(cyin: CY, lcid: UInt, dwflags: UInt, pbstrout: MutPtr): Hresult

public expect fun varBstrFromDate(datein: Double, lcid: UInt, dwflags: UInt, pbstrout: MutPtr): Hresult

public expect fun varBstrFromDec(pdecin: ConstPtr, lcid: UInt, dwflags: UInt, pbstrout: MutPtr): Hresult

public expect fun varBstrFromDisp(pdispin: MutPtr, lcid: UInt, dwflags: UInt, pbstrout: MutPtr): Hresult

public expect fun varBstrFromI1(cin: Byte, lcid: UInt, dwflags: UInt, pbstrout: MutPtr): Hresult

public expect fun varBstrFromI2(ival: Short, lcid: UInt, dwflags: UInt, pbstrout: MutPtr): Hresult

public expect fun varBstrFromI4(lin: Int, lcid: UInt, dwflags: UInt, pbstrout: MutPtr): Hresult

public expect fun varBstrFromI8(i64in: Long, lcid: UInt, dwflags: UInt, pbstrout: MutPtr): Hresult

public expect fun varBstrFromR4(fltin: Float, lcid: UInt, dwflags: UInt, pbstrout: MutPtr): Hresult

public expect fun varBstrFromR8(dblin: Double, lcid: UInt, dwflags: UInt, pbstrout: MutPtr): Hresult

public expect fun varBstrFromUI1(bval: UByte, lcid: UInt, dwflags: UInt, pbstrout: MutPtr): Hresult

public expect fun varBstrFromUI2(uiin: UShort, lcid: UInt, dwflags: UInt, pbstrout: MutPtr): Hresult

public expect fun varBstrFromUI4(ulin: UInt, lcid: UInt, dwflags: UInt, pbstrout: MutPtr): Hresult

public expect fun varBstrFromUI8(ui64in: ULong, lcid: UInt, dwflags: UInt, pbstrout: MutPtr): Hresult

public expect fun varCat(pvarleft: ConstPtr, pvarright: ConstPtr, pvarresult: MutPtr): Hresult

public expect fun varCmp(pvarleft: ConstPtr, pvarright: ConstPtr, lcid: UInt, dwflags: UInt): Varcmp

public expect fun varCyAbs(cyin: CY, pcyresult: MutPtr): Hresult

public expect fun varCyAdd(cyleft: CY, cyright: CY, pcyresult: MutPtr): Hresult

public expect fun varCyCmp(cyleft: CY, cyright: CY): Varcmp

public expect fun varCyCmpR8(cyleft: CY, dblright: Double): Varcmp

public expect fun varCyFix(cyin: CY, pcyresult: MutPtr): Hresult

public expect fun varCyFromBool(boolin: VariantBool, pcyout: MutPtr): Hresult

public expect fun varCyFromDate(datein: Double, pcyout: MutPtr): Hresult

public expect fun varCyFromDec(pdecin: ConstPtr, pcyout: MutPtr): Hresult

public expect fun varCyFromDisp(pdispin: MutPtr, lcid: UInt, pcyout: MutPtr): Hresult

public expect fun varCyFromI1(cin: Byte, pcyout: MutPtr): Hresult

public expect fun varCyFromI2(sin: Short, pcyout: MutPtr): Hresult

public expect fun varCyFromI4(lin: Int, pcyout: MutPtr): Hresult

public expect fun varCyFromI8(i64in: Long, pcyout: MutPtr): Hresult

public expect fun varCyFromR4(fltin: Float, pcyout: MutPtr): Hresult

public expect fun varCyFromR8(dblin: Double, pcyout: MutPtr): Hresult

public expect fun varCyFromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pcyout: MutPtr): Hresult

public expect fun varCyFromUI1(bin: UByte, pcyout: MutPtr): Hresult

public expect fun varCyFromUI2(uiin: UShort, pcyout: MutPtr): Hresult

public expect fun varCyFromUI4(ulin: UInt, pcyout: MutPtr): Hresult

public expect fun varCyFromUI8(ui64in: ULong, pcyout: MutPtr): Hresult

public expect fun varCyInt(cyin: CY, pcyresult: MutPtr): Hresult

public expect fun varCyMul(cyleft: CY, cyright: CY, pcyresult: MutPtr): Hresult

public expect fun varCyMulI4(cyleft: CY, lright: Int, pcyresult: MutPtr): Hresult

public expect fun varCyMulI8(cyleft: CY, lright: Long, pcyresult: MutPtr): Hresult

public expect fun varCyNeg(cyin: CY, pcyresult: MutPtr): Hresult

public expect fun varCyRound(cyin: CY, cdecimals: Int, pcyresult: MutPtr): Hresult

public expect fun varCySub(cyleft: CY, cyright: CY, pcyresult: MutPtr): Hresult

public expect fun varDateFromBool(boolin: VariantBool, pdateout: MutPtr): Hresult

public expect fun varDateFromCy(cyin: CY, pdateout: MutPtr): Hresult

public expect fun varDateFromDec(pdecin: ConstPtr, pdateout: MutPtr): Hresult

public expect fun varDateFromDisp(pdispin: MutPtr, lcid: UInt, pdateout: MutPtr): Hresult

public expect fun varDateFromI1(cin: Byte, pdateout: MutPtr): Hresult

public expect fun varDateFromI2(sin: Short, pdateout: MutPtr): Hresult

public expect fun varDateFromI4(lin: Int, pdateout: MutPtr): Hresult

public expect fun varDateFromI8(i64in: Long, pdateout: MutPtr): Hresult

public expect fun varDateFromR4(fltin: Float, pdateout: MutPtr): Hresult

public expect fun varDateFromR8(dblin: Double, pdateout: MutPtr): Hresult

public expect fun varDateFromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pdateout: MutPtr): Hresult

public expect fun varDateFromUI1(bin: UByte, pdateout: MutPtr): Hresult

public expect fun varDateFromUI2(uiin: UShort, pdateout: MutPtr): Hresult

public expect fun varDateFromUI4(ulin: UInt, pdateout: MutPtr): Hresult

public expect fun varDateFromUI8(ui64in: ULong, pdateout: MutPtr): Hresult

public expect fun varDateFromUdate(pudatein: ConstPtr, dwflags: UInt, pdateout: MutPtr): Hresult

public expect fun varDateFromUdateEx(pudatein: ConstPtr, lcid: UInt, dwflags: UInt, pdateout: MutPtr): Hresult

public expect fun varDecAbs(pdecin: ConstPtr, pdecresult: MutPtr): Hresult

public expect fun varDecAdd(pdecleft: ConstPtr, pdecright: ConstPtr, pdecresult: MutPtr): Hresult

public expect fun varDecCmp(pdecleft: ConstPtr, pdecright: ConstPtr): Varcmp

public expect fun varDecCmpR8(pdecleft: ConstPtr, dblright: Double): Varcmp

public expect fun varDecDiv(pdecleft: ConstPtr, pdecright: ConstPtr, pdecresult: MutPtr): Hresult

public expect fun varDecFix(pdecin: ConstPtr, pdecresult: MutPtr): Hresult

public expect fun varDecFromBool(boolin: VariantBool, pdecout: MutPtr): Hresult

public expect fun varDecFromCy(cyin: CY, pdecout: MutPtr): Hresult

public expect fun varDecFromDate(datein: Double, pdecout: MutPtr): Hresult

public expect fun varDecFromDisp(pdispin: MutPtr, lcid: UInt, pdecout: MutPtr): Hresult

public expect fun varDecFromI1(cin: Byte, pdecout: MutPtr): Hresult

public expect fun varDecFromI2(uiin: Short, pdecout: MutPtr): Hresult

public expect fun varDecFromI4(lin: Int, pdecout: MutPtr): Hresult

public expect fun varDecFromI8(i64in: Long, pdecout: MutPtr): Hresult

public expect fun varDecFromR4(fltin: Float, pdecout: MutPtr): Hresult

public expect fun varDecFromR8(dblin: Double, pdecout: MutPtr): Hresult

public expect fun varDecFromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pdecout: MutPtr): Hresult

public expect fun varDecFromUI1(bin: UByte, pdecout: MutPtr): Hresult

public expect fun varDecFromUI2(uiin: UShort, pdecout: MutPtr): Hresult

public expect fun varDecFromUI4(ulin: UInt, pdecout: MutPtr): Hresult

public expect fun varDecFromUI8(ui64in: ULong, pdecout: MutPtr): Hresult

public expect fun varDecInt(pdecin: ConstPtr, pdecresult: MutPtr): Hresult

public expect fun varDecMul(pdecleft: ConstPtr, pdecright: ConstPtr, pdecresult: MutPtr): Hresult

public expect fun varDecNeg(pdecin: ConstPtr, pdecresult: MutPtr): Hresult

public expect fun varDecRound(pdecin: ConstPtr, cdecimals: Int, pdecresult: MutPtr): Hresult

public expect fun varDecSub(pdecleft: ConstPtr, pdecright: ConstPtr, pdecresult: MutPtr): Hresult

public expect fun varDiv(pvarleft: ConstPtr, pvarright: ConstPtr, pvarresult: MutPtr): Hresult

public expect fun varEqv(pvarleft: ConstPtr, pvarright: ConstPtr, pvarresult: MutPtr): Hresult

public expect fun varFix(pvarin: ConstPtr, pvarresult: MutPtr): Hresult

public expect fun varFormat(pvarin: ConstPtr, pstrformat: Pcwstr, ifirstday: VarformatFirstDay, ifirstweek: VarformatFirstWeek, dwflags: UInt, pbstrout: MutPtr): Hresult

public expect fun varFormatCurrency(pvarin: ConstPtr, inumdig: Int, iinclead: Int, iuseparens: Int, igroup: Int, dwflags: UInt, pbstrout: MutPtr): Hresult

public expect fun varFormatDateTime(pvarin: ConstPtr, inamedformat: VarformatNamedFormat, dwflags: UInt, pbstrout: MutPtr): Hresult

public expect fun varFormatFromTokens(pvarin: ConstPtr, pstrformat: Pcwstr, pbtokcur: ConstPtr, dwflags: UInt, pbstrout: MutPtr, lcid: UInt): Hresult

public expect fun varFormatNumber(pvarin: ConstPtr, inumdig: Int, iinclead: VarformatLeadingDigit, iuseparens: VarformatParentheses, igroup: VarformatGroup, dwflags: UInt, pbstrout: MutPtr): Hresult

public expect fun varFormatPercent(pvarin: ConstPtr, inumdig: Int, iinclead: VarformatLeadingDigit, iuseparens: VarformatParentheses, igroup: VarformatGroup, dwflags: UInt, pbstrout: MutPtr): Hresult

public expect fun varI1FromBool(boolin: VariantBool, pcout: Pstr): Hresult

public expect fun varI1FromCy(cyin: CY, pcout: Pstr): Hresult

public expect fun varI1FromDate(datein: Double, pcout: Pstr): Hresult

public expect fun varI1FromDec(pdecin: ConstPtr, pcout: Pstr): Hresult

public expect fun varI1FromDisp(pdispin: MutPtr, lcid: UInt, pcout: Pstr): Hresult

public expect fun varI1FromI2(uiin: Short, pcout: Pstr): Hresult

public expect fun varI1FromI4(lin: Int, pcout: Pstr): Hresult

public expect fun varI1FromI8(i64in: Long, pcout: Pstr): Hresult

public expect fun varI1FromR4(fltin: Float, pcout: Pstr): Hresult

public expect fun varI1FromR8(dblin: Double, pcout: Pstr): Hresult

public expect fun varI1FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pcout: Pstr): Hresult

public expect fun varI1FromUI1(bin: UByte, pcout: Pstr): Hresult

public expect fun varI1FromUI2(uiin: UShort, pcout: Pstr): Hresult

public expect fun varI1FromUI4(ulin: UInt, pcout: Pstr): Hresult

public expect fun varI1FromUI8(i64in: ULong, pcout: Pstr): Hresult

public expect fun varI2FromBool(boolin: VariantBool, psout: MutPtr): Hresult

public expect fun varI2FromCy(cyin: CY, psout: MutPtr): Hresult

public expect fun varI2FromDate(datein: Double, psout: MutPtr): Hresult

public expect fun varI2FromDec(pdecin: ConstPtr, psout: MutPtr): Hresult

public expect fun varI2FromDisp(pdispin: MutPtr, lcid: UInt, psout: MutPtr): Hresult

public expect fun varI2FromI1(cin: Byte, psout: MutPtr): Hresult

public expect fun varI2FromI4(lin: Int, psout: MutPtr): Hresult

public expect fun varI2FromI8(i64in: Long, psout: MutPtr): Hresult

public expect fun varI2FromR4(fltin: Float, psout: MutPtr): Hresult

public expect fun varI2FromR8(dblin: Double, psout: MutPtr): Hresult

public expect fun varI2FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, psout: MutPtr): Hresult

public expect fun varI2FromUI1(bin: UByte, psout: MutPtr): Hresult

public expect fun varI2FromUI2(uiin: UShort, psout: MutPtr): Hresult

public expect fun varI2FromUI4(ulin: UInt, psout: MutPtr): Hresult

public expect fun varI2FromUI8(ui64in: ULong, psout: MutPtr): Hresult

public expect fun varI4FromBool(boolin: VariantBool, plout: MutPtr): Hresult

public expect fun varI4FromCy(cyin: CY, plout: MutPtr): Hresult

public expect fun varI4FromDate(datein: Double, plout: MutPtr): Hresult

public expect fun varI4FromDec(pdecin: ConstPtr, plout: MutPtr): Hresult

public expect fun varI4FromDisp(pdispin: MutPtr, lcid: UInt, plout: MutPtr): Hresult

public expect fun varI4FromI1(cin: Byte, plout: MutPtr): Hresult

public expect fun varI4FromI2(sin: Short, plout: MutPtr): Hresult

public expect fun varI4FromI8(i64in: Long, plout: MutPtr): Hresult

public expect fun varI4FromR4(fltin: Float, plout: MutPtr): Hresult

public expect fun varI4FromR8(dblin: Double, plout: MutPtr): Hresult

public expect fun varI4FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, plout: MutPtr): Hresult

public expect fun varI4FromUI1(bin: UByte, plout: MutPtr): Hresult

public expect fun varI4FromUI2(uiin: UShort, plout: MutPtr): Hresult

public expect fun varI4FromUI4(ulin: UInt, plout: MutPtr): Hresult

public expect fun varI4FromUI8(ui64in: ULong, plout: MutPtr): Hresult

public expect fun varI8FromBool(boolin: VariantBool, pi64out: MutPtr): Hresult

public expect fun varI8FromCy(cyin: CY, pi64out: MutPtr): Hresult

public expect fun varI8FromDate(datein: Double, pi64out: MutPtr): Hresult

public expect fun varI8FromDec(pdecin: ConstPtr, pi64out: MutPtr): Hresult

public expect fun varI8FromDisp(pdispin: MutPtr, lcid: UInt, pi64out: MutPtr): Hresult

public expect fun varI8FromI1(cin: Byte, pi64out: MutPtr): Hresult

public expect fun varI8FromI2(sin: Short, pi64out: MutPtr): Hresult

public expect fun varI8FromR4(fltin: Float, pi64out: MutPtr): Hresult

public expect fun varI8FromR8(dblin: Double, pi64out: MutPtr): Hresult

public expect fun varI8FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pi64out: MutPtr): Hresult

public expect fun varI8FromUI1(bin: UByte, pi64out: MutPtr): Hresult

public expect fun varI8FromUI2(uiin: UShort, pi64out: MutPtr): Hresult

public expect fun varI8FromUI4(ulin: UInt, pi64out: MutPtr): Hresult

public expect fun varI8FromUI8(ui64in: ULong, pi64out: MutPtr): Hresult

public expect fun varIdiv(pvarleft: ConstPtr, pvarright: ConstPtr, pvarresult: MutPtr): Hresult

public expect fun varImp(pvarleft: ConstPtr, pvarright: ConstPtr, pvarresult: MutPtr): Hresult

public expect fun varInt(pvarin: ConstPtr, pvarresult: MutPtr): Hresult

public expect fun varMod(pvarleft: ConstPtr, pvarright: ConstPtr, pvarresult: MutPtr): Hresult

public expect fun varMonthName(imonth: Int, fabbrev: Int, dwflags: UInt, pbstrout: MutPtr): Hresult

public expect fun varMul(pvarleft: ConstPtr, pvarright: ConstPtr, pvarresult: MutPtr): Hresult

public expect fun varNeg(pvarin: ConstPtr, pvarresult: MutPtr): Hresult

public expect fun varNot(pvarin: ConstPtr, pvarresult: MutPtr): Hresult

public expect fun varNumFromParseNum(pnumprs: ConstPtr, rgbdig: ConstPtr, dwvtbits: UInt, pvar: MutPtr): Hresult

public expect fun varOr(pvarleft: ConstPtr, pvarright: ConstPtr, pvarresult: MutPtr): Hresult

public expect fun varParseNumFromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pnumprs: MutPtr, rgbdig: MutPtr): Hresult

public expect fun varPow(pvarleft: ConstPtr, pvarright: ConstPtr, pvarresult: MutPtr): Hresult

public expect fun varR4CmpR8(fltleft: Float, dblright: Double): Varcmp

public expect fun varR4FromBool(boolin: VariantBool, pfltout: MutPtr): Hresult

public expect fun varR4FromCy(cyin: CY, pfltout: MutPtr): Hresult

public expect fun varR4FromDate(datein: Double, pfltout: MutPtr): Hresult

public expect fun varR4FromDec(pdecin: ConstPtr, pfltout: MutPtr): Hresult

public expect fun varR4FromDisp(pdispin: MutPtr, lcid: UInt, pfltout: MutPtr): Hresult

public expect fun varR4FromI1(cin: Byte, pfltout: MutPtr): Hresult

public expect fun varR4FromI2(sin: Short, pfltout: MutPtr): Hresult

public expect fun varR4FromI4(lin: Int, pfltout: MutPtr): Hresult

public expect fun varR4FromI8(i64in: Long, pfltout: MutPtr): Hresult

public expect fun varR4FromR8(dblin: Double, pfltout: MutPtr): Hresult

public expect fun varR4FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pfltout: MutPtr): Hresult

public expect fun varR4FromUI1(bin: UByte, pfltout: MutPtr): Hresult

public expect fun varR4FromUI2(uiin: UShort, pfltout: MutPtr): Hresult

public expect fun varR4FromUI4(ulin: UInt, pfltout: MutPtr): Hresult

public expect fun varR4FromUI8(ui64in: ULong, pfltout: MutPtr): Hresult

public expect fun varR8FromBool(boolin: VariantBool, pdblout: MutPtr): Hresult

public expect fun varR8FromCy(cyin: CY, pdblout: MutPtr): Hresult

public expect fun varR8FromDate(datein: Double, pdblout: MutPtr): Hresult

public expect fun varR8FromDec(pdecin: ConstPtr, pdblout: MutPtr): Hresult

public expect fun varR8FromDisp(pdispin: MutPtr, lcid: UInt, pdblout: MutPtr): Hresult

public expect fun varR8FromI1(cin: Byte, pdblout: MutPtr): Hresult

public expect fun varR8FromI2(sin: Short, pdblout: MutPtr): Hresult

public expect fun varR8FromI4(lin: Int, pdblout: MutPtr): Hresult

public expect fun varR8FromI8(i64in: Long, pdblout: MutPtr): Hresult

public expect fun varR8FromR4(fltin: Float, pdblout: MutPtr): Hresult

public expect fun varR8FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pdblout: MutPtr): Hresult

public expect fun varR8FromUI1(bin: UByte, pdblout: MutPtr): Hresult

public expect fun varR8FromUI2(uiin: UShort, pdblout: MutPtr): Hresult

public expect fun varR8FromUI4(ulin: UInt, pdblout: MutPtr): Hresult

public expect fun varR8FromUI8(ui64in: ULong, pdblout: MutPtr): Hresult

public expect fun varR8Pow(dblleft: Double, dblright: Double, pdblresult: MutPtr): Hresult

public expect fun varR8Round(dblin: Double, cdecimals: Int, pdblresult: MutPtr): Hresult

public expect fun varRound(pvarin: ConstPtr, cdecimals: Int, pvarresult: MutPtr): Hresult

public expect fun varSub(pvarleft: ConstPtr, pvarright: ConstPtr, pvarresult: MutPtr): Hresult

public expect fun varTokenizeFormatString(pstrformat: Pcwstr, rgbtok: MutPtr, cbtok: Int, ifirstday: VarformatFirstDay, ifirstweek: VarformatFirstWeek, lcid: UInt, pcbactual: ConstPtr): Hresult

public expect fun varUI1FromBool(boolin: VariantBool, pbout: MutPtr): Hresult

public expect fun varUI1FromCy(cyin: CY, pbout: MutPtr): Hresult

public expect fun varUI1FromDate(datein: Double, pbout: MutPtr): Hresult

public expect fun varUI1FromDec(pdecin: ConstPtr, pbout: MutPtr): Hresult

public expect fun varUI1FromDisp(pdispin: MutPtr, lcid: UInt, pbout: MutPtr): Hresult

public expect fun varUI1FromI1(cin: Byte, pbout: MutPtr): Hresult

public expect fun varUI1FromI2(sin: Short, pbout: MutPtr): Hresult

public expect fun varUI1FromI4(lin: Int, pbout: MutPtr): Hresult

public expect fun varUI1FromI8(i64in: Long, pbout: MutPtr): Hresult

public expect fun varUI1FromR4(fltin: Float, pbout: MutPtr): Hresult

public expect fun varUI1FromR8(dblin: Double, pbout: MutPtr): Hresult

public expect fun varUI1FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pbout: MutPtr): Hresult

public expect fun varUI1FromUI2(uiin: UShort, pbout: MutPtr): Hresult

public expect fun varUI1FromUI4(ulin: UInt, pbout: MutPtr): Hresult

public expect fun varUI1FromUI8(ui64in: ULong, pbout: MutPtr): Hresult

public expect fun varUI2FromBool(boolin: VariantBool, puiout: MutPtr): Hresult

public expect fun varUI2FromCy(cyin: CY, puiout: MutPtr): Hresult

public expect fun varUI2FromDate(datein: Double, puiout: MutPtr): Hresult

public expect fun varUI2FromDec(pdecin: ConstPtr, puiout: MutPtr): Hresult

public expect fun varUI2FromDisp(pdispin: MutPtr, lcid: UInt, puiout: MutPtr): Hresult

public expect fun varUI2FromI1(cin: Byte, puiout: MutPtr): Hresult

public expect fun varUI2FromI2(uiin: Short, puiout: MutPtr): Hresult

public expect fun varUI2FromI4(lin: Int, puiout: MutPtr): Hresult

public expect fun varUI2FromI8(i64in: Long, puiout: MutPtr): Hresult

public expect fun varUI2FromR4(fltin: Float, puiout: MutPtr): Hresult

public expect fun varUI2FromR8(dblin: Double, puiout: MutPtr): Hresult

public expect fun varUI2FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, puiout: MutPtr): Hresult

public expect fun varUI2FromUI1(bin: UByte, puiout: MutPtr): Hresult

public expect fun varUI2FromUI4(ulin: UInt, puiout: MutPtr): Hresult

public expect fun varUI2FromUI8(i64in: ULong, puiout: MutPtr): Hresult

public expect fun varUI4FromBool(boolin: VariantBool, pulout: MutPtr): Hresult

public expect fun varUI4FromCy(cyin: CY, pulout: MutPtr): Hresult

public expect fun varUI4FromDate(datein: Double, pulout: MutPtr): Hresult

public expect fun varUI4FromDec(pdecin: ConstPtr, pulout: MutPtr): Hresult

public expect fun varUI4FromDisp(pdispin: MutPtr, lcid: UInt, pulout: MutPtr): Hresult

public expect fun varUI4FromI1(cin: Byte, pulout: MutPtr): Hresult

public expect fun varUI4FromI2(uiin: Short, pulout: MutPtr): Hresult

public expect fun varUI4FromI4(lin: Int, pulout: MutPtr): Hresult

public expect fun varUI4FromI8(i64in: Long, plout: MutPtr): Hresult

public expect fun varUI4FromR4(fltin: Float, pulout: MutPtr): Hresult

public expect fun varUI4FromR8(dblin: Double, pulout: MutPtr): Hresult

public expect fun varUI4FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pulout: MutPtr): Hresult

public expect fun varUI4FromUI1(bin: UByte, pulout: MutPtr): Hresult

public expect fun varUI4FromUI2(uiin: UShort, pulout: MutPtr): Hresult

public expect fun varUI4FromUI8(ui64in: ULong, plout: MutPtr): Hresult

public expect fun varUI8FromBool(boolin: VariantBool, pi64out: MutPtr): Hresult

public expect fun varUI8FromCy(cyin: CY, pi64out: MutPtr): Hresult

public expect fun varUI8FromDate(datein: Double, pi64out: MutPtr): Hresult

public expect fun varUI8FromDec(pdecin: ConstPtr, pi64out: MutPtr): Hresult

public expect fun varUI8FromDisp(pdispin: MutPtr, lcid: UInt, pi64out: MutPtr): Hresult

public expect fun varUI8FromI1(cin: Byte, pi64out: MutPtr): Hresult

public expect fun varUI8FromI2(sin: Short, pi64out: MutPtr): Hresult

public expect fun varUI8FromI8(ui64in: Long, pi64out: MutPtr): Hresult

public expect fun varUI8FromR4(fltin: Float, pi64out: MutPtr): Hresult

public expect fun varUI8FromR8(dblin: Double, pi64out: MutPtr): Hresult

public expect fun varUI8FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pi64out: MutPtr): Hresult

public expect fun varUI8FromUI1(bin: UByte, pi64out: MutPtr): Hresult

public expect fun varUI8FromUI2(uiin: UShort, pi64out: MutPtr): Hresult

public expect fun varUI8FromUI4(ulin: UInt, pi64out: MutPtr): Hresult

public expect fun varUdateFromDate(datein: Double, dwflags: UInt, pudateout: MutPtr): Hresult

public expect fun varWeekdayName(iweekday: Int, fabbrev: Int, ifirstday: Int, dwflags: UInt, pbstrout: MutPtr): Hresult

public expect fun varXor(pvarleft: ConstPtr, pvarright: ConstPtr, pvarresult: MutPtr): Hresult

public expect fun vectorFromBstr(bstr: Bstr, ppsa: MutPtr): Hresult
