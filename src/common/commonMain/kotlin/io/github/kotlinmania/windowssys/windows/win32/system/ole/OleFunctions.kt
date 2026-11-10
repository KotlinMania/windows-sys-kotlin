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

public expect fun bstrFromVector(psa: COpaquePointer?, pbstr: COpaquePointer?): Hresult

public expect fun clearCustData(pcustdata: COpaquePointer?)

public expect fun createDispTypeInfo(pidata: COpaquePointer?, lcid: UInt, pptinfo: COpaquePointer?): Hresult

public expect fun createErrorInfo(pperrinfo: COpaquePointer?): Hresult

public expect fun createOleAdviseHolder(ppoaholder: COpaquePointer?): Hresult

public expect fun createStdDispatch(punkouter: COpaquePointer?, pvthis: COpaquePointer?, ptinfo: COpaquePointer?, ppunkstddisp: COpaquePointer?): Hresult

public expect fun createTypeLib(syskind: Syskind, szfile: Pcwstr, ppctlib: COpaquePointer?): Hresult

public expect fun createTypeLib2(syskind: Syskind, szfile: Pcwstr, ppctlib: COpaquePointer?): Hresult

public expect fun dispCallFunc(pvinstance: COpaquePointer?, ovft: ULong, cc: Callconv, vtreturn: Varenum, cactuals: UInt, prgvt: COpaquePointer?, prgpvarg: COpaquePointer?, pvargresult: COpaquePointer?): Hresult

public expect fun dispGetIDsOfNames(ptinfo: COpaquePointer?, rgsznames: COpaquePointer?, cnames: UInt, rgdispid: COpaquePointer?): Hresult

public expect fun dispGetParam(pdispparams: COpaquePointer?, position: UInt, vttarg: Varenum, pvarresult: COpaquePointer?, puargerr: COpaquePointer?): Hresult

public expect fun dispInvoke(thisRef: COpaquePointer?, ptinfo: COpaquePointer?, dispidmember: Int, wflags: UShort, pparams: COpaquePointer?, pvarresult: COpaquePointer?, pexcepinfo: COpaquePointer?, puargerr: COpaquePointer?): Hresult

public expect fun doDragDrop(pdataobj: COpaquePointer?, pdropsource: COpaquePointer?, dwokeffects: Dropeffect, pdweffect: COpaquePointer?): Hresult

public expect fun getActiveObject(rclsid: COpaquePointer?, pvreserved: COpaquePointer?, ppunk: COpaquePointer?): Hresult

public expect fun getAltMonthNames(lcid: UInt, prgp: COpaquePointer?): Hresult

public expect fun getRecordInfoFromGuids(rguidtypelib: COpaquePointer?, uvermajor: UInt, uverminor: UInt, lcid: UInt, rguidtypeinfo: COpaquePointer?, pprecinfo: COpaquePointer?): Hresult

public expect fun getRecordInfoFromTypeInfo(ptypeinfo: COpaquePointer?, pprecinfo: COpaquePointer?): Hresult

public expect fun hrgnUserFree(param0: COpaquePointer?, param1: COpaquePointer?)

public expect fun hrgnUserFree64(param0: COpaquePointer?, param1: COpaquePointer?)

public expect fun hrgnUserMarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer?

public expect fun hrgnUserMarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer?

public expect fun hrgnUserSize(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt

public expect fun hrgnUserSize64(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt

public expect fun hrgnUserUnmarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer?

public expect fun hrgnUserUnmarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer?

public expect fun isAccelerator(haccel: Haccel, caccelentries: Int, lpmsg: COpaquePointer?, lpwcmd: COpaquePointer?): Bool

public expect fun lHashValOfNameSys(syskind: Syskind, lcid: UInt, szname: Pcwstr): UInt

public expect fun lHashValOfNameSysA(syskind: Syskind, lcid: UInt, szname: Pcstr): UInt

public expect fun loadRegTypeLib(rguid: COpaquePointer?, wvermajor: UShort, wverminor: UShort, lcid: UInt, pptlib: COpaquePointer?): Hresult

public expect fun loadTypeLib(szfile: Pcwstr, pptlib: COpaquePointer?): Hresult

public expect fun loadTypeLibEx(szfile: Pcwstr, regkind: Regkind, pptlib: COpaquePointer?): Hresult

public expect fun oaBuildVersion(): UInt

public expect fun oaEnablePerUserTLibRegistration()

public expect fun oleBuildVersion(): UInt

public expect fun oleConvertOLESTREAMToIStorage2(lpolestream: COpaquePointer?, pstg: COpaquePointer?, ptd: COpaquePointer?, opt: UInt, pvcallbackcontext: COpaquePointer?, pqueryconvertolelinkcallback: Olestreamqueryconvertolelinkcallback): Hresult

public expect fun oleConvertOLESTREAMToIStorageEx2(polestm: COpaquePointer?, pstg: COpaquePointer?, pcfformat: COpaquePointer?, plwwidth: COpaquePointer?, plheight: COpaquePointer?, pdwsize: COpaquePointer?, pmedium: COpaquePointer?, opt: UInt, pvcallbackcontext: COpaquePointer?, pqueryconvertolelinkcallback: Olestreamqueryconvertolelinkcallback): Hresult

public expect fun oleCreate(rclsid: COpaquePointer?, riid: COpaquePointer?, renderopt: UInt, pformatetc: COpaquePointer?, pclientsite: COpaquePointer?, pstg: COpaquePointer?, ppvobj: COpaquePointer?): Hresult

public expect fun oleCreateDefaultHandler(clsid: COpaquePointer?, punkouter: COpaquePointer?, riid: COpaquePointer?, lplpobj: COpaquePointer?): Hresult

public expect fun oleCreateEmbeddingHelper(clsid: COpaquePointer?, punkouter: COpaquePointer?, flags: EmbdhlpFlags, pcf: COpaquePointer?, riid: COpaquePointer?, lplpobj: COpaquePointer?): Hresult

public expect fun oleCreateEx(rclsid: COpaquePointer?, riid: COpaquePointer?, dwflags: Olecreate, renderopt: UInt, cformats: UInt, rgadvf: COpaquePointer?, rgformatetc: COpaquePointer?, lpadvisesink: COpaquePointer?, rgdwconnection: COpaquePointer?, pclientsite: COpaquePointer?, pstg: COpaquePointer?, ppvobj: COpaquePointer?): Hresult

public expect fun oleCreateFontIndirect(lpfontdesc: COpaquePointer?, riid: COpaquePointer?, lplpvobj: COpaquePointer?): Hresult

public expect fun oleCreateFromData(psrcdataobj: COpaquePointer?, riid: COpaquePointer?, renderopt: UInt, pformatetc: COpaquePointer?, pclientsite: COpaquePointer?, pstg: COpaquePointer?, ppvobj: COpaquePointer?): Hresult

public expect fun oleCreateFromDataEx(psrcdataobj: COpaquePointer?, riid: COpaquePointer?, dwflags: Olecreate, renderopt: UInt, cformats: UInt, rgadvf: COpaquePointer?, rgformatetc: COpaquePointer?, lpadvisesink: COpaquePointer?, rgdwconnection: COpaquePointer?, pclientsite: COpaquePointer?, pstg: COpaquePointer?, ppvobj: COpaquePointer?): Hresult

public expect fun oleCreateFromFile(rclsid: COpaquePointer?, lpszfilename: Pcwstr, riid: COpaquePointer?, renderopt: UInt, lpformatetc: COpaquePointer?, pclientsite: COpaquePointer?, pstg: COpaquePointer?, ppvobj: COpaquePointer?): Hresult

public expect fun oleCreateFromFileEx(rclsid: COpaquePointer?, lpszfilename: Pcwstr, riid: COpaquePointer?, dwflags: Olecreate, renderopt: UInt, cformats: UInt, rgadvf: COpaquePointer?, rgformatetc: COpaquePointer?, lpadvisesink: COpaquePointer?, rgdwconnection: COpaquePointer?, pclientsite: COpaquePointer?, pstg: COpaquePointer?, ppvobj: COpaquePointer?): Hresult

public expect fun oleCreateLink(pmklinksrc: COpaquePointer?, riid: COpaquePointer?, renderopt: UInt, lpformatetc: COpaquePointer?, pclientsite: COpaquePointer?, pstg: COpaquePointer?, ppvobj: COpaquePointer?): Hresult

public expect fun oleCreateLinkEx(pmklinksrc: COpaquePointer?, riid: COpaquePointer?, dwflags: Olecreate, renderopt: UInt, cformats: UInt, rgadvf: COpaquePointer?, rgformatetc: COpaquePointer?, lpadvisesink: COpaquePointer?, rgdwconnection: COpaquePointer?, pclientsite: COpaquePointer?, pstg: COpaquePointer?, ppvobj: COpaquePointer?): Hresult

public expect fun oleCreateLinkFromData(psrcdataobj: COpaquePointer?, riid: COpaquePointer?, renderopt: UInt, pformatetc: COpaquePointer?, pclientsite: COpaquePointer?, pstg: COpaquePointer?, ppvobj: COpaquePointer?): Hresult

public expect fun oleCreateLinkFromDataEx(psrcdataobj: COpaquePointer?, riid: COpaquePointer?, dwflags: Olecreate, renderopt: UInt, cformats: UInt, rgadvf: COpaquePointer?, rgformatetc: COpaquePointer?, lpadvisesink: COpaquePointer?, rgdwconnection: COpaquePointer?, pclientsite: COpaquePointer?, pstg: COpaquePointer?, ppvobj: COpaquePointer?): Hresult

public expect fun oleCreateLinkToFile(lpszfilename: Pcwstr, riid: COpaquePointer?, renderopt: UInt, lpformatetc: COpaquePointer?, pclientsite: COpaquePointer?, pstg: COpaquePointer?, ppvobj: COpaquePointer?): Hresult

public expect fun oleCreateLinkToFileEx(lpszfilename: Pcwstr, riid: COpaquePointer?, dwflags: Olecreate, renderopt: UInt, cformats: UInt, rgadvf: COpaquePointer?, rgformatetc: COpaquePointer?, lpadvisesink: COpaquePointer?, rgdwconnection: COpaquePointer?, pclientsite: COpaquePointer?, pstg: COpaquePointer?, ppvobj: COpaquePointer?): Hresult

public expect fun oleCreateMenuDescriptor(hmenucombined: Hmenu, lpmenuwidths: COpaquePointer?): Long

public expect fun oleCreatePictureIndirect(lppictdesc: COpaquePointer?, riid: COpaquePointer?, fown: Bool, lplpvobj: COpaquePointer?): Hresult

public expect fun oleCreatePropertyFrame(hwndowner: Hwnd, x: UInt, y: UInt, lpszcaption: Pcwstr, cobjects: UInt, ppunk: COpaquePointer?, cpages: UInt, ppageclsid: COpaquePointer?, lcid: UInt, dwreserved: UInt, pvreserved: COpaquePointer?): Hresult

public expect fun oleCreatePropertyFrameIndirect(lpparams: COpaquePointer?): Hresult

public expect fun oleCreateStaticFromData(psrcdataobj: COpaquePointer?, iid: COpaquePointer?, renderopt: UInt, pformatetc: COpaquePointer?, pclientsite: COpaquePointer?, pstg: COpaquePointer?, ppvobj: COpaquePointer?): Hresult

public expect fun oleDestroyMenuDescriptor(holemenu: Long): Hresult

public expect fun oleDoAutoConvert(pstg: COpaquePointer?, pclsidnew: COpaquePointer?): Hresult

public expect fun oleDraw(punknown: COpaquePointer?, dwaspect: UInt, hdcdraw: Hdc, lprcbounds: COpaquePointer?): Hresult

public expect fun oleDuplicateData(hsrc: Handle, cfformat: ClipboardFormat, uiflags: GlobalAllocFlags): Handle

public expect fun oleFlushClipboard(): Hresult

public expect fun oleGetAutoConvert(clsidold: COpaquePointer?, pclsidnew: COpaquePointer?): Hresult

public expect fun oleGetClipboard(ppdataobj: COpaquePointer?): Hresult

public expect fun oleGetClipboardWithEnterpriseInfo(dataobject: COpaquePointer?, dataenterpriseid: COpaquePointer?, sourcedescription: COpaquePointer?, targetdescription: COpaquePointer?, datadescription: COpaquePointer?): Hresult

public expect fun oleGetIconOfClass(rclsid: COpaquePointer?, lpszlabel: Pcwstr, fusetypeaslabel: Bool): Hglobal

public expect fun oleGetIconOfFile(lpszpath: Pcwstr, fusefileaslabel: Bool): Hglobal

public expect fun oleIconToCursor(hinstexe: Hinstance, hicon: Hicon): Hcursor

public expect fun oleInitialize(pvreserved: COpaquePointer?): Hresult

public expect fun oleIsCurrentClipboard(pdataobj: COpaquePointer?): Hresult

public expect fun oleIsRunning(pobject: COpaquePointer?): Bool

public expect fun oleLoad(pstg: COpaquePointer?, riid: COpaquePointer?, pclientsite: COpaquePointer?, ppvobj: COpaquePointer?): Hresult

public expect fun oleLoadFromStream(pstm: COpaquePointer?, iidinterface: COpaquePointer?, ppvobj: COpaquePointer?): Hresult

public expect fun oleLoadPicture(lpstream: COpaquePointer?, lsize: Int, frunmode: Bool, riid: COpaquePointer?, lplpvobj: COpaquePointer?): Hresult

public expect fun oleLoadPictureEx(lpstream: COpaquePointer?, lsize: Int, frunmode: Bool, riid: COpaquePointer?, xsizedesired: UInt, ysizedesired: UInt, dwflags: LoadPictureFlags, lplpvobj: COpaquePointer?): Hresult

public expect fun oleLoadPictureFile(varfilename: Variant, lplpdisppicture: COpaquePointer?): Hresult

public expect fun oleLoadPictureFileEx(varfilename: Variant, xsizedesired: UInt, ysizedesired: UInt, dwflags: LoadPictureFlags, lplpdisppicture: COpaquePointer?): Hresult

public expect fun oleLoadPicturePath(szurlorpath: Pcwstr, punkcaller: COpaquePointer?, dwreserved: UInt, clrreserved: UInt, riid: COpaquePointer?, ppvret: COpaquePointer?): Hresult

public expect fun oleLockRunning(punknown: COpaquePointer?, flock: Bool, flastunlockcloses: Bool): Hresult

public expect fun oleMetafilePictFromIconAndLabel(hicon: Hicon, lpszlabel: Pcwstr, lpszsourcefile: Pcwstr, iiconindex: UInt): Hglobal

public expect fun oleNoteObjectVisible(punknown: COpaquePointer?, fvisible: Bool): Hresult

public expect fun oleQueryCreateFromData(psrcdataobject: COpaquePointer?): Hresult

public expect fun oleQueryLinkFromData(psrcdataobject: COpaquePointer?): Hresult

public expect fun oleRegEnumFormatEtc(clsid: COpaquePointer?, dwdirection: UInt, ppenum: COpaquePointer?): Hresult

public expect fun oleRegEnumVerbs(clsid: COpaquePointer?, ppenum: COpaquePointer?): Hresult

public expect fun oleRegGetMiscStatus(clsid: COpaquePointer?, dwaspect: UInt, pdwstatus: COpaquePointer?): Hresult

public expect fun oleRegGetUserType(clsid: COpaquePointer?, dwformoftype: UInt, pszusertype: COpaquePointer?): Hresult

public expect fun oleRun(punknown: COpaquePointer?): Hresult

public expect fun oleSave(pps: COpaquePointer?, pstg: COpaquePointer?, fsameasload: Bool): Hresult

public expect fun oleSavePictureFile(lpdisppicture: COpaquePointer?, bstrfilename: Bstr): Hresult

public expect fun oleSaveToStream(ppstm: COpaquePointer?, pstm: COpaquePointer?): Hresult

public expect fun oleSetAutoConvert(clsidold: COpaquePointer?, clsidnew: COpaquePointer?): Hresult

public expect fun oleSetClipboard(pdataobj: COpaquePointer?): Hresult

public expect fun oleSetContainedObject(punknown: COpaquePointer?, fcontained: Bool): Hresult

public expect fun oleSetMenuDescriptor(holemenu: Long, hwndframe: Hwnd, hwndactiveobject: Hwnd, lpframe: COpaquePointer?, lpactiveobj: COpaquePointer?): Hresult

public expect fun oleTranslateAccelerator(lpframe: COpaquePointer?, lpframeinfo: COpaquePointer?, lpmsg: COpaquePointer?): Hresult

public expect fun oleTranslateColor(clr: UInt, hpal: Hpalette, lpcolorref: COpaquePointer?): Hresult

public expect fun oleUIAddVerbMenuA(lpoleobj: COpaquePointer?, lpszshorttype: Pcstr, hmenu: Hmenu, upos: UInt, uidverbmin: UInt, uidverbmax: UInt, baddconvert: Bool, idconvert: UInt, lphmenu: COpaquePointer?): Bool

public expect fun oleUIAddVerbMenuW(lpoleobj: COpaquePointer?, lpszshorttype: Pcwstr, hmenu: Hmenu, upos: UInt, uidverbmin: UInt, uidverbmax: UInt, baddconvert: Bool, idconvert: UInt, lphmenu: COpaquePointer?): Bool

public expect fun oleUIBusyA(param0: COpaquePointer?): UInt

public expect fun oleUIBusyW(param0: COpaquePointer?): UInt

public expect fun oleUICanConvertOrActivateAs(rclsid: COpaquePointer?, fislinkedobject: Bool, wformat: UShort): Bool

public expect fun oleUIChangeIconA(param0: COpaquePointer?): UInt

public expect fun oleUIChangeIconW(param0: COpaquePointer?): UInt

public expect fun oleUIChangeSourceA(param0: COpaquePointer?): UInt

public expect fun oleUIChangeSourceW(param0: COpaquePointer?): UInt

public expect fun oleUIConvertA(param0: COpaquePointer?): UInt

public expect fun oleUIConvertW(param0: COpaquePointer?): UInt

public expect fun oleUIEditLinksA(param0: COpaquePointer?): UInt

public expect fun oleUIEditLinksW(param0: COpaquePointer?): UInt

public expect fun oleUIInsertObjectA(param0: COpaquePointer?): UInt

public expect fun oleUIInsertObjectW(param0: COpaquePointer?): UInt

public expect fun oleUIObjectPropertiesA(param0: COpaquePointer?): UInt

public expect fun oleUIObjectPropertiesW(param0: COpaquePointer?): UInt

public expect fun oleUIPasteSpecialA(param0: COpaquePointer?): UInt

public expect fun oleUIPasteSpecialW(param0: COpaquePointer?): UInt

public expect fun oleUIPromptUserA(ntemplate: Int, hwndparent: Hwnd, vararg variadicArgs: Long): Int

public expect fun oleUIPromptUserW(ntemplate: Int, hwndparent: Hwnd, vararg variadicArgs: Long): Int

public expect fun oleUIUpdateLinksA(lpoleuilinkcntr: COpaquePointer?, hwndparent: Hwnd, lpsztitle: Pcstr, clinks: Int): Bool

public expect fun oleUIUpdateLinksW(lpoleuilinkcntr: COpaquePointer?, hwndparent: Hwnd, lpsztitle: Pcwstr, clinks: Int): Bool

public expect fun oleUninitialize()

public expect fun queryPathOfRegTypeLib(guid: COpaquePointer?, wmaj: UShort, wmin: UShort, lcid: UInt, lpbstrpathname: COpaquePointer?): Hresult

public expect fun registerActiveObject(punk: COpaquePointer?, rclsid: COpaquePointer?, dwflags: ActiveobjectFlags, pdwregister: COpaquePointer?): Hresult

public expect fun registerDragDrop(hwnd: Hwnd, pdroptarget: COpaquePointer?): Hresult

public expect fun registerTypeLib(ptlib: COpaquePointer?, szfullpath: Pcwstr, szhelpdir: Pcwstr): Hresult

public expect fun registerTypeLibForUser(ptlib: COpaquePointer?, szfullpath: Pcwstr, szhelpdir: Pcwstr): Hresult

public expect fun releaseStgMedium(param0: COpaquePointer?)

public expect fun revokeActiveObject(dwregister: UInt, pvreserved: COpaquePointer?): Hresult

public expect fun revokeDragDrop(hwnd: Hwnd): Hresult

public expect fun safeArrayAccessData(psa: COpaquePointer?, ppvdata: COpaquePointer?): Hresult

public expect fun safeArrayAddRef(psa: COpaquePointer?, ppdatatorelease: COpaquePointer?): Hresult

public expect fun safeArrayAllocData(psa: COpaquePointer?): Hresult

public expect fun safeArrayAllocDescriptor(cdims: UInt, ppsaout: COpaquePointer?): Hresult

public expect fun safeArrayAllocDescriptorEx(vt: Varenum, cdims: UInt, ppsaout: COpaquePointer?): Hresult

public expect fun safeArrayCopy(psa: COpaquePointer?, ppsaout: COpaquePointer?): Hresult

public expect fun safeArrayCopyData(psasource: COpaquePointer?, psatarget: COpaquePointer?): Hresult

public expect fun safeArrayCreate(vt: Varenum, cdims: UInt, rgsabound: COpaquePointer?): COpaquePointer?

public expect fun safeArrayCreateEx(vt: Varenum, cdims: UInt, rgsabound: COpaquePointer?, pvextra: COpaquePointer?): COpaquePointer?

public expect fun safeArrayCreateVector(vt: Varenum, llbound: Int, celements: UInt): COpaquePointer?

public expect fun safeArrayCreateVectorEx(vt: Varenum, llbound: Int, celements: UInt, pvextra: COpaquePointer?): COpaquePointer?

public expect fun safeArrayDestroy(psa: COpaquePointer?): Hresult

public expect fun safeArrayDestroyData(psa: COpaquePointer?): Hresult

public expect fun safeArrayDestroyDescriptor(psa: COpaquePointer?): Hresult

public expect fun safeArrayGetDim(psa: COpaquePointer?): UInt

public expect fun safeArrayGetElement(psa: COpaquePointer?, rgindices: COpaquePointer?, pv: COpaquePointer?): Hresult

public expect fun safeArrayGetElemsize(psa: COpaquePointer?): UInt

public expect fun safeArrayGetIID(psa: COpaquePointer?, pguid: COpaquePointer?): Hresult

public expect fun safeArrayGetLBound(psa: COpaquePointer?, ndim: UInt, pllbound: COpaquePointer?): Hresult

public expect fun safeArrayGetRecordInfo(psa: COpaquePointer?, prinfo: COpaquePointer?): Hresult

public expect fun safeArrayGetUBound(psa: COpaquePointer?, ndim: UInt, plubound: COpaquePointer?): Hresult

public expect fun safeArrayGetVartype(psa: COpaquePointer?, pvt: COpaquePointer?): Hresult

public expect fun safeArrayLock(psa: COpaquePointer?): Hresult

public expect fun safeArrayPtrOfIndex(psa: COpaquePointer?, rgindices: COpaquePointer?, ppvdata: COpaquePointer?): Hresult

public expect fun safeArrayPutElement(psa: COpaquePointer?, rgindices: COpaquePointer?, pv: COpaquePointer?): Hresult

public expect fun safeArrayRedim(psa: COpaquePointer?, psaboundnew: COpaquePointer?): Hresult

public expect fun safeArrayReleaseData(pdata: COpaquePointer?)

public expect fun safeArrayReleaseDescriptor(psa: COpaquePointer?)

public expect fun safeArraySetIID(psa: COpaquePointer?, guid: COpaquePointer?): Hresult

public expect fun safeArraySetRecordInfo(psa: COpaquePointer?, prinfo: COpaquePointer?): Hresult

public expect fun safeArrayUnaccessData(psa: COpaquePointer?): Hresult

public expect fun safeArrayUnlock(psa: COpaquePointer?): Hresult

public expect fun unRegisterTypeLib(libid: COpaquePointer?, wvermajor: UShort, wverminor: UShort, lcid: UInt, syskind: Syskind): Hresult

public expect fun unRegisterTypeLibForUser(libid: COpaquePointer?, wmajorvernum: UShort, wminorvernum: UShort, lcid: UInt, syskind: Syskind): Hresult

public expect fun varAbs(pvarin: COpaquePointer?, pvarresult: COpaquePointer?): Hresult

public expect fun varAdd(pvarleft: COpaquePointer?, pvarright: COpaquePointer?, pvarresult: COpaquePointer?): Hresult

public expect fun varAnd(pvarleft: COpaquePointer?, pvarright: COpaquePointer?, pvarresult: COpaquePointer?): Hresult

public expect fun varBoolFromCy(cyin: CY, pboolout: COpaquePointer?): Hresult

public expect fun varBoolFromDate(datein: Double, pboolout: COpaquePointer?): Hresult

public expect fun varBoolFromDec(pdecin: COpaquePointer?, pboolout: COpaquePointer?): Hresult

public expect fun varBoolFromDisp(pdispin: COpaquePointer?, lcid: UInt, pboolout: COpaquePointer?): Hresult

public expect fun varBoolFromI1(cin: Byte, pboolout: COpaquePointer?): Hresult

public expect fun varBoolFromI2(sin: Short, pboolout: COpaquePointer?): Hresult

public expect fun varBoolFromI4(lin: Int, pboolout: COpaquePointer?): Hresult

public expect fun varBoolFromI8(i64in: Long, pboolout: COpaquePointer?): Hresult

public expect fun varBoolFromR4(fltin: Float, pboolout: COpaquePointer?): Hresult

public expect fun varBoolFromR8(dblin: Double, pboolout: COpaquePointer?): Hresult

public expect fun varBoolFromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pboolout: COpaquePointer?): Hresult

public expect fun varBoolFromUI1(bin: UByte, pboolout: COpaquePointer?): Hresult

public expect fun varBoolFromUI2(uiin: UShort, pboolout: COpaquePointer?): Hresult

public expect fun varBoolFromUI4(ulin: UInt, pboolout: COpaquePointer?): Hresult

public expect fun varBoolFromUI8(i64in: ULong, pboolout: COpaquePointer?): Hresult

public expect fun varBstrCat(bstrleft: Bstr, bstrright: Bstr, pbstrresult: COpaquePointer?): Hresult

public expect fun varBstrCmp(bstrleft: Bstr, bstrright: Bstr, lcid: UInt, dwflags: UInt): Hresult

public expect fun varBstrFromBool(boolin: VariantBool, lcid: UInt, dwflags: UInt, pbstrout: COpaquePointer?): Hresult

public expect fun varBstrFromCy(cyin: CY, lcid: UInt, dwflags: UInt, pbstrout: COpaquePointer?): Hresult

public expect fun varBstrFromDate(datein: Double, lcid: UInt, dwflags: UInt, pbstrout: COpaquePointer?): Hresult

public expect fun varBstrFromDec(pdecin: COpaquePointer?, lcid: UInt, dwflags: UInt, pbstrout: COpaquePointer?): Hresult

public expect fun varBstrFromDisp(pdispin: COpaquePointer?, lcid: UInt, dwflags: UInt, pbstrout: COpaquePointer?): Hresult

public expect fun varBstrFromI1(cin: Byte, lcid: UInt, dwflags: UInt, pbstrout: COpaquePointer?): Hresult

public expect fun varBstrFromI2(ival: Short, lcid: UInt, dwflags: UInt, pbstrout: COpaquePointer?): Hresult

public expect fun varBstrFromI4(lin: Int, lcid: UInt, dwflags: UInt, pbstrout: COpaquePointer?): Hresult

public expect fun varBstrFromI8(i64in: Long, lcid: UInt, dwflags: UInt, pbstrout: COpaquePointer?): Hresult

public expect fun varBstrFromR4(fltin: Float, lcid: UInt, dwflags: UInt, pbstrout: COpaquePointer?): Hresult

public expect fun varBstrFromR8(dblin: Double, lcid: UInt, dwflags: UInt, pbstrout: COpaquePointer?): Hresult

public expect fun varBstrFromUI1(bval: UByte, lcid: UInt, dwflags: UInt, pbstrout: COpaquePointer?): Hresult

public expect fun varBstrFromUI2(uiin: UShort, lcid: UInt, dwflags: UInt, pbstrout: COpaquePointer?): Hresult

public expect fun varBstrFromUI4(ulin: UInt, lcid: UInt, dwflags: UInt, pbstrout: COpaquePointer?): Hresult

public expect fun varBstrFromUI8(ui64in: ULong, lcid: UInt, dwflags: UInt, pbstrout: COpaquePointer?): Hresult

public expect fun varCat(pvarleft: COpaquePointer?, pvarright: COpaquePointer?, pvarresult: COpaquePointer?): Hresult

public expect fun varCmp(pvarleft: COpaquePointer?, pvarright: COpaquePointer?, lcid: UInt, dwflags: UInt): Varcmp

public expect fun varCyAbs(cyin: CY, pcyresult: COpaquePointer?): Hresult

public expect fun varCyAdd(cyleft: CY, cyright: CY, pcyresult: COpaquePointer?): Hresult

public expect fun varCyCmp(cyleft: CY, cyright: CY): Varcmp

public expect fun varCyCmpR8(cyleft: CY, dblright: Double): Varcmp

public expect fun varCyFix(cyin: CY, pcyresult: COpaquePointer?): Hresult

public expect fun varCyFromBool(boolin: VariantBool, pcyout: COpaquePointer?): Hresult

public expect fun varCyFromDate(datein: Double, pcyout: COpaquePointer?): Hresult

public expect fun varCyFromDec(pdecin: COpaquePointer?, pcyout: COpaquePointer?): Hresult

public expect fun varCyFromDisp(pdispin: COpaquePointer?, lcid: UInt, pcyout: COpaquePointer?): Hresult

public expect fun varCyFromI1(cin: Byte, pcyout: COpaquePointer?): Hresult

public expect fun varCyFromI2(sin: Short, pcyout: COpaquePointer?): Hresult

public expect fun varCyFromI4(lin: Int, pcyout: COpaquePointer?): Hresult

public expect fun varCyFromI8(i64in: Long, pcyout: COpaquePointer?): Hresult

public expect fun varCyFromR4(fltin: Float, pcyout: COpaquePointer?): Hresult

public expect fun varCyFromR8(dblin: Double, pcyout: COpaquePointer?): Hresult

public expect fun varCyFromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pcyout: COpaquePointer?): Hresult

public expect fun varCyFromUI1(bin: UByte, pcyout: COpaquePointer?): Hresult

public expect fun varCyFromUI2(uiin: UShort, pcyout: COpaquePointer?): Hresult

public expect fun varCyFromUI4(ulin: UInt, pcyout: COpaquePointer?): Hresult

public expect fun varCyFromUI8(ui64in: ULong, pcyout: COpaquePointer?): Hresult

public expect fun varCyInt(cyin: CY, pcyresult: COpaquePointer?): Hresult

public expect fun varCyMul(cyleft: CY, cyright: CY, pcyresult: COpaquePointer?): Hresult

public expect fun varCyMulI4(cyleft: CY, lright: Int, pcyresult: COpaquePointer?): Hresult

public expect fun varCyMulI8(cyleft: CY, lright: Long, pcyresult: COpaquePointer?): Hresult

public expect fun varCyNeg(cyin: CY, pcyresult: COpaquePointer?): Hresult

public expect fun varCyRound(cyin: CY, cdecimals: Int, pcyresult: COpaquePointer?): Hresult

public expect fun varCySub(cyleft: CY, cyright: CY, pcyresult: COpaquePointer?): Hresult

public expect fun varDateFromBool(boolin: VariantBool, pdateout: COpaquePointer?): Hresult

public expect fun varDateFromCy(cyin: CY, pdateout: COpaquePointer?): Hresult

public expect fun varDateFromDec(pdecin: COpaquePointer?, pdateout: COpaquePointer?): Hresult

public expect fun varDateFromDisp(pdispin: COpaquePointer?, lcid: UInt, pdateout: COpaquePointer?): Hresult

public expect fun varDateFromI1(cin: Byte, pdateout: COpaquePointer?): Hresult

public expect fun varDateFromI2(sin: Short, pdateout: COpaquePointer?): Hresult

public expect fun varDateFromI4(lin: Int, pdateout: COpaquePointer?): Hresult

public expect fun varDateFromI8(i64in: Long, pdateout: COpaquePointer?): Hresult

public expect fun varDateFromR4(fltin: Float, pdateout: COpaquePointer?): Hresult

public expect fun varDateFromR8(dblin: Double, pdateout: COpaquePointer?): Hresult

public expect fun varDateFromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pdateout: COpaquePointer?): Hresult

public expect fun varDateFromUI1(bin: UByte, pdateout: COpaquePointer?): Hresult

public expect fun varDateFromUI2(uiin: UShort, pdateout: COpaquePointer?): Hresult

public expect fun varDateFromUI4(ulin: UInt, pdateout: COpaquePointer?): Hresult

public expect fun varDateFromUI8(ui64in: ULong, pdateout: COpaquePointer?): Hresult

public expect fun varDateFromUdate(pudatein: COpaquePointer?, dwflags: UInt, pdateout: COpaquePointer?): Hresult

public expect fun varDateFromUdateEx(pudatein: COpaquePointer?, lcid: UInt, dwflags: UInt, pdateout: COpaquePointer?): Hresult

public expect fun varDecAbs(pdecin: COpaquePointer?, pdecresult: COpaquePointer?): Hresult

public expect fun varDecAdd(pdecleft: COpaquePointer?, pdecright: COpaquePointer?, pdecresult: COpaquePointer?): Hresult

public expect fun varDecCmp(pdecleft: COpaquePointer?, pdecright: COpaquePointer?): Varcmp

public expect fun varDecCmpR8(pdecleft: COpaquePointer?, dblright: Double): Varcmp

public expect fun varDecDiv(pdecleft: COpaquePointer?, pdecright: COpaquePointer?, pdecresult: COpaquePointer?): Hresult

public expect fun varDecFix(pdecin: COpaquePointer?, pdecresult: COpaquePointer?): Hresult

public expect fun varDecFromBool(boolin: VariantBool, pdecout: COpaquePointer?): Hresult

public expect fun varDecFromCy(cyin: CY, pdecout: COpaquePointer?): Hresult

public expect fun varDecFromDate(datein: Double, pdecout: COpaquePointer?): Hresult

public expect fun varDecFromDisp(pdispin: COpaquePointer?, lcid: UInt, pdecout: COpaquePointer?): Hresult

public expect fun varDecFromI1(cin: Byte, pdecout: COpaquePointer?): Hresult

public expect fun varDecFromI2(uiin: Short, pdecout: COpaquePointer?): Hresult

public expect fun varDecFromI4(lin: Int, pdecout: COpaquePointer?): Hresult

public expect fun varDecFromI8(i64in: Long, pdecout: COpaquePointer?): Hresult

public expect fun varDecFromR4(fltin: Float, pdecout: COpaquePointer?): Hresult

public expect fun varDecFromR8(dblin: Double, pdecout: COpaquePointer?): Hresult

public expect fun varDecFromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pdecout: COpaquePointer?): Hresult

public expect fun varDecFromUI1(bin: UByte, pdecout: COpaquePointer?): Hresult

public expect fun varDecFromUI2(uiin: UShort, pdecout: COpaquePointer?): Hresult

public expect fun varDecFromUI4(ulin: UInt, pdecout: COpaquePointer?): Hresult

public expect fun varDecFromUI8(ui64in: ULong, pdecout: COpaquePointer?): Hresult

public expect fun varDecInt(pdecin: COpaquePointer?, pdecresult: COpaquePointer?): Hresult

public expect fun varDecMul(pdecleft: COpaquePointer?, pdecright: COpaquePointer?, pdecresult: COpaquePointer?): Hresult

public expect fun varDecNeg(pdecin: COpaquePointer?, pdecresult: COpaquePointer?): Hresult

public expect fun varDecRound(pdecin: COpaquePointer?, cdecimals: Int, pdecresult: COpaquePointer?): Hresult

public expect fun varDecSub(pdecleft: COpaquePointer?, pdecright: COpaquePointer?, pdecresult: COpaquePointer?): Hresult

public expect fun varDiv(pvarleft: COpaquePointer?, pvarright: COpaquePointer?, pvarresult: COpaquePointer?): Hresult

public expect fun varEqv(pvarleft: COpaquePointer?, pvarright: COpaquePointer?, pvarresult: COpaquePointer?): Hresult

public expect fun varFix(pvarin: COpaquePointer?, pvarresult: COpaquePointer?): Hresult

public expect fun varFormat(pvarin: COpaquePointer?, pstrformat: Pcwstr, ifirstday: VarformatFirstDay, ifirstweek: VarformatFirstWeek, dwflags: UInt, pbstrout: COpaquePointer?): Hresult

public expect fun varFormatCurrency(pvarin: COpaquePointer?, inumdig: Int, iinclead: Int, iuseparens: Int, igroup: Int, dwflags: UInt, pbstrout: COpaquePointer?): Hresult

public expect fun varFormatDateTime(pvarin: COpaquePointer?, inamedformat: VarformatNamedFormat, dwflags: UInt, pbstrout: COpaquePointer?): Hresult

public expect fun varFormatFromTokens(pvarin: COpaquePointer?, pstrformat: Pcwstr, pbtokcur: COpaquePointer?, dwflags: UInt, pbstrout: COpaquePointer?, lcid: UInt): Hresult

public expect fun varFormatNumber(pvarin: COpaquePointer?, inumdig: Int, iinclead: VarformatLeadingDigit, iuseparens: VarformatParentheses, igroup: VarformatGroup, dwflags: UInt, pbstrout: COpaquePointer?): Hresult

public expect fun varFormatPercent(pvarin: COpaquePointer?, inumdig: Int, iinclead: VarformatLeadingDigit, iuseparens: VarformatParentheses, igroup: VarformatGroup, dwflags: UInt, pbstrout: COpaquePointer?): Hresult

public expect fun varI1FromBool(boolin: VariantBool, pcout: Pstr): Hresult

public expect fun varI1FromCy(cyin: CY, pcout: Pstr): Hresult

public expect fun varI1FromDate(datein: Double, pcout: Pstr): Hresult

public expect fun varI1FromDec(pdecin: COpaquePointer?, pcout: Pstr): Hresult

public expect fun varI1FromDisp(pdispin: COpaquePointer?, lcid: UInt, pcout: Pstr): Hresult

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

public expect fun varI2FromBool(boolin: VariantBool, psout: COpaquePointer?): Hresult

public expect fun varI2FromCy(cyin: CY, psout: COpaquePointer?): Hresult

public expect fun varI2FromDate(datein: Double, psout: COpaquePointer?): Hresult

public expect fun varI2FromDec(pdecin: COpaquePointer?, psout: COpaquePointer?): Hresult

public expect fun varI2FromDisp(pdispin: COpaquePointer?, lcid: UInt, psout: COpaquePointer?): Hresult

public expect fun varI2FromI1(cin: Byte, psout: COpaquePointer?): Hresult

public expect fun varI2FromI4(lin: Int, psout: COpaquePointer?): Hresult

public expect fun varI2FromI8(i64in: Long, psout: COpaquePointer?): Hresult

public expect fun varI2FromR4(fltin: Float, psout: COpaquePointer?): Hresult

public expect fun varI2FromR8(dblin: Double, psout: COpaquePointer?): Hresult

public expect fun varI2FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, psout: COpaquePointer?): Hresult

public expect fun varI2FromUI1(bin: UByte, psout: COpaquePointer?): Hresult

public expect fun varI2FromUI2(uiin: UShort, psout: COpaquePointer?): Hresult

public expect fun varI2FromUI4(ulin: UInt, psout: COpaquePointer?): Hresult

public expect fun varI2FromUI8(ui64in: ULong, psout: COpaquePointer?): Hresult

public expect fun varI4FromBool(boolin: VariantBool, plout: COpaquePointer?): Hresult

public expect fun varI4FromCy(cyin: CY, plout: COpaquePointer?): Hresult

public expect fun varI4FromDate(datein: Double, plout: COpaquePointer?): Hresult

public expect fun varI4FromDec(pdecin: COpaquePointer?, plout: COpaquePointer?): Hresult

public expect fun varI4FromDisp(pdispin: COpaquePointer?, lcid: UInt, plout: COpaquePointer?): Hresult

public expect fun varI4FromI1(cin: Byte, plout: COpaquePointer?): Hresult

public expect fun varI4FromI2(sin: Short, plout: COpaquePointer?): Hresult

public expect fun varI4FromI8(i64in: Long, plout: COpaquePointer?): Hresult

public expect fun varI4FromR4(fltin: Float, plout: COpaquePointer?): Hresult

public expect fun varI4FromR8(dblin: Double, plout: COpaquePointer?): Hresult

public expect fun varI4FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, plout: COpaquePointer?): Hresult

public expect fun varI4FromUI1(bin: UByte, plout: COpaquePointer?): Hresult

public expect fun varI4FromUI2(uiin: UShort, plout: COpaquePointer?): Hresult

public expect fun varI4FromUI4(ulin: UInt, plout: COpaquePointer?): Hresult

public expect fun varI4FromUI8(ui64in: ULong, plout: COpaquePointer?): Hresult

public expect fun varI8FromBool(boolin: VariantBool, pi64out: COpaquePointer?): Hresult

public expect fun varI8FromCy(cyin: CY, pi64out: COpaquePointer?): Hresult

public expect fun varI8FromDate(datein: Double, pi64out: COpaquePointer?): Hresult

public expect fun varI8FromDec(pdecin: COpaquePointer?, pi64out: COpaquePointer?): Hresult

public expect fun varI8FromDisp(pdispin: COpaquePointer?, lcid: UInt, pi64out: COpaquePointer?): Hresult

public expect fun varI8FromI1(cin: Byte, pi64out: COpaquePointer?): Hresult

public expect fun varI8FromI2(sin: Short, pi64out: COpaquePointer?): Hresult

public expect fun varI8FromR4(fltin: Float, pi64out: COpaquePointer?): Hresult

public expect fun varI8FromR8(dblin: Double, pi64out: COpaquePointer?): Hresult

public expect fun varI8FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pi64out: COpaquePointer?): Hresult

public expect fun varI8FromUI1(bin: UByte, pi64out: COpaquePointer?): Hresult

public expect fun varI8FromUI2(uiin: UShort, pi64out: COpaquePointer?): Hresult

public expect fun varI8FromUI4(ulin: UInt, pi64out: COpaquePointer?): Hresult

public expect fun varI8FromUI8(ui64in: ULong, pi64out: COpaquePointer?): Hresult

public expect fun varIdiv(pvarleft: COpaquePointer?, pvarright: COpaquePointer?, pvarresult: COpaquePointer?): Hresult

public expect fun varImp(pvarleft: COpaquePointer?, pvarright: COpaquePointer?, pvarresult: COpaquePointer?): Hresult

public expect fun varInt(pvarin: COpaquePointer?, pvarresult: COpaquePointer?): Hresult

public expect fun varMod(pvarleft: COpaquePointer?, pvarright: COpaquePointer?, pvarresult: COpaquePointer?): Hresult

public expect fun varMonthName(imonth: Int, fabbrev: Int, dwflags: UInt, pbstrout: COpaquePointer?): Hresult

public expect fun varMul(pvarleft: COpaquePointer?, pvarright: COpaquePointer?, pvarresult: COpaquePointer?): Hresult

public expect fun varNeg(pvarin: COpaquePointer?, pvarresult: COpaquePointer?): Hresult

public expect fun varNot(pvarin: COpaquePointer?, pvarresult: COpaquePointer?): Hresult

public expect fun varNumFromParseNum(pnumprs: COpaquePointer?, rgbdig: COpaquePointer?, dwvtbits: UInt, pvar: COpaquePointer?): Hresult

public expect fun varOr(pvarleft: COpaquePointer?, pvarright: COpaquePointer?, pvarresult: COpaquePointer?): Hresult

public expect fun varParseNumFromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pnumprs: COpaquePointer?, rgbdig: COpaquePointer?): Hresult

public expect fun varPow(pvarleft: COpaquePointer?, pvarright: COpaquePointer?, pvarresult: COpaquePointer?): Hresult

public expect fun varR4CmpR8(fltleft: Float, dblright: Double): Varcmp

public expect fun varR4FromBool(boolin: VariantBool, pfltout: COpaquePointer?): Hresult

public expect fun varR4FromCy(cyin: CY, pfltout: COpaquePointer?): Hresult

public expect fun varR4FromDate(datein: Double, pfltout: COpaquePointer?): Hresult

public expect fun varR4FromDec(pdecin: COpaquePointer?, pfltout: COpaquePointer?): Hresult

public expect fun varR4FromDisp(pdispin: COpaquePointer?, lcid: UInt, pfltout: COpaquePointer?): Hresult

public expect fun varR4FromI1(cin: Byte, pfltout: COpaquePointer?): Hresult

public expect fun varR4FromI2(sin: Short, pfltout: COpaquePointer?): Hresult

public expect fun varR4FromI4(lin: Int, pfltout: COpaquePointer?): Hresult

public expect fun varR4FromI8(i64in: Long, pfltout: COpaquePointer?): Hresult

public expect fun varR4FromR8(dblin: Double, pfltout: COpaquePointer?): Hresult

public expect fun varR4FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pfltout: COpaquePointer?): Hresult

public expect fun varR4FromUI1(bin: UByte, pfltout: COpaquePointer?): Hresult

public expect fun varR4FromUI2(uiin: UShort, pfltout: COpaquePointer?): Hresult

public expect fun varR4FromUI4(ulin: UInt, pfltout: COpaquePointer?): Hresult

public expect fun varR4FromUI8(ui64in: ULong, pfltout: COpaquePointer?): Hresult

public expect fun varR8FromBool(boolin: VariantBool, pdblout: COpaquePointer?): Hresult

public expect fun varR8FromCy(cyin: CY, pdblout: COpaquePointer?): Hresult

public expect fun varR8FromDate(datein: Double, pdblout: COpaquePointer?): Hresult

public expect fun varR8FromDec(pdecin: COpaquePointer?, pdblout: COpaquePointer?): Hresult

public expect fun varR8FromDisp(pdispin: COpaquePointer?, lcid: UInt, pdblout: COpaquePointer?): Hresult

public expect fun varR8FromI1(cin: Byte, pdblout: COpaquePointer?): Hresult

public expect fun varR8FromI2(sin: Short, pdblout: COpaquePointer?): Hresult

public expect fun varR8FromI4(lin: Int, pdblout: COpaquePointer?): Hresult

public expect fun varR8FromI8(i64in: Long, pdblout: COpaquePointer?): Hresult

public expect fun varR8FromR4(fltin: Float, pdblout: COpaquePointer?): Hresult

public expect fun varR8FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pdblout: COpaquePointer?): Hresult

public expect fun varR8FromUI1(bin: UByte, pdblout: COpaquePointer?): Hresult

public expect fun varR8FromUI2(uiin: UShort, pdblout: COpaquePointer?): Hresult

public expect fun varR8FromUI4(ulin: UInt, pdblout: COpaquePointer?): Hresult

public expect fun varR8FromUI8(ui64in: ULong, pdblout: COpaquePointer?): Hresult

public expect fun varR8Pow(dblleft: Double, dblright: Double, pdblresult: COpaquePointer?): Hresult

public expect fun varR8Round(dblin: Double, cdecimals: Int, pdblresult: COpaquePointer?): Hresult

public expect fun varRound(pvarin: COpaquePointer?, cdecimals: Int, pvarresult: COpaquePointer?): Hresult

public expect fun varSub(pvarleft: COpaquePointer?, pvarright: COpaquePointer?, pvarresult: COpaquePointer?): Hresult

public expect fun varTokenizeFormatString(pstrformat: Pcwstr, rgbtok: COpaquePointer?, cbtok: Int, ifirstday: VarformatFirstDay, ifirstweek: VarformatFirstWeek, lcid: UInt, pcbactual: COpaquePointer?): Hresult

public expect fun varUI1FromBool(boolin: VariantBool, pbout: COpaquePointer?): Hresult

public expect fun varUI1FromCy(cyin: CY, pbout: COpaquePointer?): Hresult

public expect fun varUI1FromDate(datein: Double, pbout: COpaquePointer?): Hresult

public expect fun varUI1FromDec(pdecin: COpaquePointer?, pbout: COpaquePointer?): Hresult

public expect fun varUI1FromDisp(pdispin: COpaquePointer?, lcid: UInt, pbout: COpaquePointer?): Hresult

public expect fun varUI1FromI1(cin: Byte, pbout: COpaquePointer?): Hresult

public expect fun varUI1FromI2(sin: Short, pbout: COpaquePointer?): Hresult

public expect fun varUI1FromI4(lin: Int, pbout: COpaquePointer?): Hresult

public expect fun varUI1FromI8(i64in: Long, pbout: COpaquePointer?): Hresult

public expect fun varUI1FromR4(fltin: Float, pbout: COpaquePointer?): Hresult

public expect fun varUI1FromR8(dblin: Double, pbout: COpaquePointer?): Hresult

public expect fun varUI1FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pbout: COpaquePointer?): Hresult

public expect fun varUI1FromUI2(uiin: UShort, pbout: COpaquePointer?): Hresult

public expect fun varUI1FromUI4(ulin: UInt, pbout: COpaquePointer?): Hresult

public expect fun varUI1FromUI8(ui64in: ULong, pbout: COpaquePointer?): Hresult

public expect fun varUI2FromBool(boolin: VariantBool, puiout: COpaquePointer?): Hresult

public expect fun varUI2FromCy(cyin: CY, puiout: COpaquePointer?): Hresult

public expect fun varUI2FromDate(datein: Double, puiout: COpaquePointer?): Hresult

public expect fun varUI2FromDec(pdecin: COpaquePointer?, puiout: COpaquePointer?): Hresult

public expect fun varUI2FromDisp(pdispin: COpaquePointer?, lcid: UInt, puiout: COpaquePointer?): Hresult

public expect fun varUI2FromI1(cin: Byte, puiout: COpaquePointer?): Hresult

public expect fun varUI2FromI2(uiin: Short, puiout: COpaquePointer?): Hresult

public expect fun varUI2FromI4(lin: Int, puiout: COpaquePointer?): Hresult

public expect fun varUI2FromI8(i64in: Long, puiout: COpaquePointer?): Hresult

public expect fun varUI2FromR4(fltin: Float, puiout: COpaquePointer?): Hresult

public expect fun varUI2FromR8(dblin: Double, puiout: COpaquePointer?): Hresult

public expect fun varUI2FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, puiout: COpaquePointer?): Hresult

public expect fun varUI2FromUI1(bin: UByte, puiout: COpaquePointer?): Hresult

public expect fun varUI2FromUI4(ulin: UInt, puiout: COpaquePointer?): Hresult

public expect fun varUI2FromUI8(i64in: ULong, puiout: COpaquePointer?): Hresult

public expect fun varUI4FromBool(boolin: VariantBool, pulout: COpaquePointer?): Hresult

public expect fun varUI4FromCy(cyin: CY, pulout: COpaquePointer?): Hresult

public expect fun varUI4FromDate(datein: Double, pulout: COpaquePointer?): Hresult

public expect fun varUI4FromDec(pdecin: COpaquePointer?, pulout: COpaquePointer?): Hresult

public expect fun varUI4FromDisp(pdispin: COpaquePointer?, lcid: UInt, pulout: COpaquePointer?): Hresult

public expect fun varUI4FromI1(cin: Byte, pulout: COpaquePointer?): Hresult

public expect fun varUI4FromI2(uiin: Short, pulout: COpaquePointer?): Hresult

public expect fun varUI4FromI4(lin: Int, pulout: COpaquePointer?): Hresult

public expect fun varUI4FromI8(i64in: Long, plout: COpaquePointer?): Hresult

public expect fun varUI4FromR4(fltin: Float, pulout: COpaquePointer?): Hresult

public expect fun varUI4FromR8(dblin: Double, pulout: COpaquePointer?): Hresult

public expect fun varUI4FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pulout: COpaquePointer?): Hresult

public expect fun varUI4FromUI1(bin: UByte, pulout: COpaquePointer?): Hresult

public expect fun varUI4FromUI2(uiin: UShort, pulout: COpaquePointer?): Hresult

public expect fun varUI4FromUI8(ui64in: ULong, plout: COpaquePointer?): Hresult

public expect fun varUI8FromBool(boolin: VariantBool, pi64out: COpaquePointer?): Hresult

public expect fun varUI8FromCy(cyin: CY, pi64out: COpaquePointer?): Hresult

public expect fun varUI8FromDate(datein: Double, pi64out: COpaquePointer?): Hresult

public expect fun varUI8FromDec(pdecin: COpaquePointer?, pi64out: COpaquePointer?): Hresult

public expect fun varUI8FromDisp(pdispin: COpaquePointer?, lcid: UInt, pi64out: COpaquePointer?): Hresult

public expect fun varUI8FromI1(cin: Byte, pi64out: COpaquePointer?): Hresult

public expect fun varUI8FromI2(sin: Short, pi64out: COpaquePointer?): Hresult

public expect fun varUI8FromI8(ui64in: Long, pi64out: COpaquePointer?): Hresult

public expect fun varUI8FromR4(fltin: Float, pi64out: COpaquePointer?): Hresult

public expect fun varUI8FromR8(dblin: Double, pi64out: COpaquePointer?): Hresult

public expect fun varUI8FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pi64out: COpaquePointer?): Hresult

public expect fun varUI8FromUI1(bin: UByte, pi64out: COpaquePointer?): Hresult

public expect fun varUI8FromUI2(uiin: UShort, pi64out: COpaquePointer?): Hresult

public expect fun varUI8FromUI4(ulin: UInt, pi64out: COpaquePointer?): Hresult

public expect fun varUdateFromDate(datein: Double, dwflags: UInt, pudateout: COpaquePointer?): Hresult

public expect fun varWeekdayName(iweekday: Int, fabbrev: Int, ifirstday: Int, dwflags: UInt, pbstrout: COpaquePointer?): Hresult

public expect fun varXor(pvarleft: COpaquePointer?, pvarright: COpaquePointer?, pvarresult: COpaquePointer?): Hresult

public expect fun vectorFromBstr(bstr: Bstr, ppsa: COpaquePointer?): Hresult
