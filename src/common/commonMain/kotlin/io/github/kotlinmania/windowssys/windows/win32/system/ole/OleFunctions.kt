package io.github.kotlinmania.windowssys.windows.win32.system.ole

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Bstr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Colorref
import io.github.kotlinmania.windowssys.windows.win32.foundation.Decimal
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hglobal
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rect
import io.github.kotlinmania.windowssys.windows.win32.foundation.VariantBool
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hdc
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hpalette
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hrgn
import io.github.kotlinmania.windowssys.windows.win32.system.com.CY
import io.github.kotlinmania.windowssys.windows.win32.system.com.Callconv
import io.github.kotlinmania.windowssys.windows.win32.system.com.Custdata
import io.github.kotlinmania.windowssys.windows.win32.system.com.Dispparams
import io.github.kotlinmania.windowssys.windows.win32.system.com.Dvtargetdevice
import io.github.kotlinmania.windowssys.windows.win32.system.com.Excepinfo
import io.github.kotlinmania.windowssys.windows.win32.system.com.Formatetc
import io.github.kotlinmania.windowssys.windows.win32.system.com.Safearray
import io.github.kotlinmania.windowssys.windows.win32.system.com.Safearraybound
import io.github.kotlinmania.windowssys.windows.win32.system.com.Stgmedium
import io.github.kotlinmania.windowssys.windows.win32.system.com.Syskind
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.Olestream
import io.github.kotlinmania.windowssys.windows.win32.system.memory.GlobalAllocFlags
import io.github.kotlinmania.windowssys.windows.win32.system.variant.Variant
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Haccel
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Hcursor
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Hicon
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Hmenu
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Msg

public expect fun bstrFromVector(psa: ConstPtr<Safearray>, pbstr: MutPtr<Bstr>): Hresult

public expect fun clearCustData(pcustdata: MutPtr<Custdata>)

public expect fun createDispTypeInfo(pidata: MutPtr<Interfacedata>, lcid: UInt, pptinfo: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun createErrorInfo(pperrinfo: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun createOleAdviseHolder(ppoaholder: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun createStdDispatch(punkouter: MutPtr<CVoid>, pvthis: MutPtr<CVoid>, ptinfo: MutPtr<CVoid>, ppunkstddisp: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun createTypeLib(syskind: Syskind, szfile: Pcwstr, ppctlib: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun createTypeLib2(syskind: Syskind, szfile: Pcwstr, ppctlib: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun dispCallFunc(pvinstance: ConstPtr<CVoid>, ovft: ULong, cc: Callconv, vtreturn: Variant.Varenum, cactuals: UInt, prgvt: ConstPtr<UShort>, prgpvarg: ConstPtr<ConstPtr<Variant.Variant>>, pvargresult: MutPtr<Variant.Variant>): Hresult

public expect fun dispGetIDsOfNames(ptinfo: MutPtr<CVoid>, rgsznames: ConstPtr<Pcwstr>, cnames: UInt, rgdispid: MutPtr<Int>): Hresult

public expect fun dispGetParam(pdispparams: ConstPtr<Dispparams>, position: UInt, vttarg: Variant.Varenum, pvarresult: MutPtr<Variant.Variant>, puargerr: MutPtr<UInt>): Hresult

public expect fun dispInvoke(thisRef: MutPtr<CVoid>, ptinfo: MutPtr<CVoid>, dispidmember: Int, wflags: UShort, pparams: MutPtr<Dispparams>, pvarresult: MutPtr<Variant.Variant>, pexcepinfo: MutPtr<Excepinfo>, puargerr: MutPtr<UInt>): Hresult

public expect fun doDragDrop(pdataobj: MutPtr<CVoid>, pdropsource: MutPtr<CVoid>, dwokeffects: Dropeffect, pdweffect: MutPtr<Dropeffect>): Hresult

public expect fun getActiveObject(rclsid: ConstPtr<Guid>, pvreserved: MutPtr<CVoid>, ppunk: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun getAltMonthNames(lcid: UInt, prgp: MutPtr<MutPtr<Pwstr>>): Hresult

public expect fun getRecordInfoFromGuids(rguidtypelib: ConstPtr<Guid>, uvermajor: UInt, uverminor: UInt, lcid: UInt, rguidtypeinfo: ConstPtr<Guid>, pprecinfo: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun getRecordInfoFromTypeInfo(ptypeinfo: MutPtr<CVoid>, pprecinfo: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun hrgnUserFree(param0: ConstPtr<UInt>, param1: ConstPtr<Hrgn>)

public expect fun hrgnUserFree64(param0: ConstPtr<UInt>, param1: ConstPtr<Hrgn>)

public expect fun hrgnUserMarshal(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Hrgn>): MutPtr<UByte>

public expect fun hrgnUserMarshal64(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Hrgn>): MutPtr<UByte>

public expect fun hrgnUserSize(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Hrgn>): UInt

public expect fun hrgnUserSize64(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Hrgn>): UInt

public expect fun hrgnUserUnmarshal(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Hrgn>): MutPtr<UByte>

public expect fun hrgnUserUnmarshal64(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Hrgn>): MutPtr<UByte>

public expect fun isAccelerator(haccel: Haccel, caccelentries: Int, lpmsg: ConstPtr<Msg>, lpwcmd: MutPtr<UShort>): Bool

public expect fun lHashValOfNameSys(syskind: Syskind, lcid: UInt, szname: Pcwstr): UInt

public expect fun lHashValOfNameSysA(syskind: Syskind, lcid: UInt, szname: Pcstr): UInt

public expect fun loadRegTypeLib(rguid: ConstPtr<Guid>, wvermajor: UShort, wverminor: UShort, lcid: UInt, pptlib: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun loadTypeLib(szfile: Pcwstr, pptlib: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun loadTypeLibEx(szfile: Pcwstr, regkind: Regkind, pptlib: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun oaBuildVersion(): UInt

public expect fun oaEnablePerUserTLibRegistration()

public expect fun oleBuildVersion(): UInt

public expect fun oleConvertOLESTREAMToIStorage2(lpolestream: ConstPtr<Olestream>, pstg: MutPtr<CVoid>, ptd: ConstPtr<Dvtargetdevice>, opt: UInt, pvcallbackcontext: ConstPtr<CVoid>, pqueryconvertolelinkcallback: Olestreamqueryconvertolelinkcallback): Hresult

public expect fun oleConvertOLESTREAMToIStorageEx2(polestm: ConstPtr<Olestream>, pstg: MutPtr<CVoid>, pcfformat: MutPtr<UShort>, plwwidth: MutPtr<Int>, plheight: MutPtr<Int>, pdwsize: MutPtr<UInt>, pmedium: MutPtr<Stgmedium>, opt: UInt, pvcallbackcontext: ConstPtr<CVoid>, pqueryconvertolelinkcallback: Olestreamqueryconvertolelinkcallback): Hresult

public expect fun oleCreate(rclsid: ConstPtr<Guid>, riid: ConstPtr<Guid>, renderopt: UInt, pformatetc: ConstPtr<Formatetc>, pclientsite: MutPtr<CVoid>, pstg: MutPtr<CVoid>, ppvobj: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun oleCreateDefaultHandler(clsid: ConstPtr<Guid>, punkouter: MutPtr<CVoid>, riid: ConstPtr<Guid>, lplpobj: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun oleCreateEmbeddingHelper(clsid: ConstPtr<Guid>, punkouter: MutPtr<CVoid>, flags: EmbdhlpFlags, pcf: MutPtr<CVoid>, riid: ConstPtr<Guid>, lplpobj: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun oleCreateEx(rclsid: ConstPtr<Guid>, riid: ConstPtr<Guid>, dwflags: Olecreate, renderopt: UInt, cformats: UInt, rgadvf: ConstPtr<UInt>, rgformatetc: ConstPtr<Formatetc>, lpadvisesink: MutPtr<CVoid>, rgdwconnection: MutPtr<UInt>, pclientsite: MutPtr<CVoid>, pstg: MutPtr<CVoid>, ppvobj: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun oleCreateFontIndirect(lpfontdesc: ConstPtr<Fontdesc>, riid: ConstPtr<Guid>, lplpvobj: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun oleCreateFromData(psrcdataobj: MutPtr<CVoid>, riid: ConstPtr<Guid>, renderopt: UInt, pformatetc: ConstPtr<Formatetc>, pclientsite: MutPtr<CVoid>, pstg: MutPtr<CVoid>, ppvobj: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun oleCreateFromDataEx(psrcdataobj: MutPtr<CVoid>, riid: ConstPtr<Guid>, dwflags: Olecreate, renderopt: UInt, cformats: UInt, rgadvf: ConstPtr<UInt>, rgformatetc: ConstPtr<Formatetc>, lpadvisesink: MutPtr<CVoid>, rgdwconnection: MutPtr<UInt>, pclientsite: MutPtr<CVoid>, pstg: MutPtr<CVoid>, ppvobj: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun oleCreateFromFile(rclsid: ConstPtr<Guid>, lpszfilename: Pcwstr, riid: ConstPtr<Guid>, renderopt: UInt, lpformatetc: ConstPtr<Formatetc>, pclientsite: MutPtr<CVoid>, pstg: MutPtr<CVoid>, ppvobj: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun oleCreateFromFileEx(rclsid: ConstPtr<Guid>, lpszfilename: Pcwstr, riid: ConstPtr<Guid>, dwflags: Olecreate, renderopt: UInt, cformats: UInt, rgadvf: ConstPtr<UInt>, rgformatetc: ConstPtr<Formatetc>, lpadvisesink: MutPtr<CVoid>, rgdwconnection: MutPtr<UInt>, pclientsite: MutPtr<CVoid>, pstg: MutPtr<CVoid>, ppvobj: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun oleCreateLink(pmklinksrc: MutPtr<CVoid>, riid: ConstPtr<Guid>, renderopt: UInt, lpformatetc: ConstPtr<Formatetc>, pclientsite: MutPtr<CVoid>, pstg: MutPtr<CVoid>, ppvobj: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun oleCreateLinkEx(pmklinksrc: MutPtr<CVoid>, riid: ConstPtr<Guid>, dwflags: Olecreate, renderopt: UInt, cformats: UInt, rgadvf: ConstPtr<UInt>, rgformatetc: ConstPtr<Formatetc>, lpadvisesink: MutPtr<CVoid>, rgdwconnection: MutPtr<UInt>, pclientsite: MutPtr<CVoid>, pstg: MutPtr<CVoid>, ppvobj: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun oleCreateLinkFromData(psrcdataobj: MutPtr<CVoid>, riid: ConstPtr<Guid>, renderopt: UInt, pformatetc: ConstPtr<Formatetc>, pclientsite: MutPtr<CVoid>, pstg: MutPtr<CVoid>, ppvobj: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun oleCreateLinkFromDataEx(psrcdataobj: MutPtr<CVoid>, riid: ConstPtr<Guid>, dwflags: Olecreate, renderopt: UInt, cformats: UInt, rgadvf: ConstPtr<UInt>, rgformatetc: ConstPtr<Formatetc>, lpadvisesink: MutPtr<CVoid>, rgdwconnection: MutPtr<UInt>, pclientsite: MutPtr<CVoid>, pstg: MutPtr<CVoid>, ppvobj: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun oleCreateLinkToFile(lpszfilename: Pcwstr, riid: ConstPtr<Guid>, renderopt: UInt, lpformatetc: ConstPtr<Formatetc>, pclientsite: MutPtr<CVoid>, pstg: MutPtr<CVoid>, ppvobj: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun oleCreateLinkToFileEx(lpszfilename: Pcwstr, riid: ConstPtr<Guid>, dwflags: Olecreate, renderopt: UInt, cformats: UInt, rgadvf: ConstPtr<UInt>, rgformatetc: ConstPtr<Formatetc>, lpadvisesink: MutPtr<CVoid>, rgdwconnection: MutPtr<UInt>, pclientsite: MutPtr<CVoid>, pstg: MutPtr<CVoid>, ppvobj: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun oleCreateMenuDescriptor(hmenucombined: Hmenu, lpmenuwidths: ConstPtr<Olemenugroupwidths>): Long

public expect fun oleCreatePictureIndirect(lppictdesc: ConstPtr<Pictdesc>, riid: ConstPtr<Guid>, fown: Bool, lplpvobj: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun oleCreatePropertyFrame(hwndowner: Hwnd, x: UInt, y: UInt, lpszcaption: Pcwstr, cobjects: UInt, ppunk: ConstPtr<MutPtr<CVoid>>, cpages: UInt, ppageclsid: ConstPtr<Guid>, lcid: UInt, dwreserved: UInt, pvreserved: ConstPtr<CVoid>): Hresult

public expect fun oleCreatePropertyFrameIndirect(lpparams: ConstPtr<Ocpfiparams>): Hresult

public expect fun oleCreateStaticFromData(psrcdataobj: MutPtr<CVoid>, iid: ConstPtr<Guid>, renderopt: UInt, pformatetc: ConstPtr<Formatetc>, pclientsite: MutPtr<CVoid>, pstg: MutPtr<CVoid>, ppvobj: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun oleDestroyMenuDescriptor(holemenu: Long): Hresult

public expect fun oleDoAutoConvert(pstg: MutPtr<CVoid>, pclsidnew: MutPtr<Guid>): Hresult

public expect fun oleDraw(punknown: MutPtr<CVoid>, dwaspect: UInt, hdcdraw: Hdc, lprcbounds: ConstPtr<Rect>): Hresult

public expect fun oleDuplicateData(hsrc: Handle, cfformat: ClipboardFormat, uiflags: GlobalAllocFlags): Handle

public expect fun oleFlushClipboard(): Hresult

public expect fun oleGetAutoConvert(clsidold: ConstPtr<Guid>, pclsidnew: MutPtr<Guid>): Hresult

public expect fun oleGetClipboard(ppdataobj: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun oleGetClipboardWithEnterpriseInfo(dataobject: MutPtr<MutPtr<CVoid>>, dataenterpriseid: MutPtr<Pwstr>, sourcedescription: MutPtr<Pwstr>, targetdescription: MutPtr<Pwstr>, datadescription: MutPtr<Pwstr>): Hresult

public expect fun oleGetIconOfClass(rclsid: ConstPtr<Guid>, lpszlabel: Pcwstr, fusetypeaslabel: Bool): Hglobal

public expect fun oleGetIconOfFile(lpszpath: Pcwstr, fusefileaslabel: Bool): Hglobal

public expect fun oleIconToCursor(hinstexe: Hinstance, hicon: Hicon): Hcursor

public expect fun oleInitialize(pvreserved: ConstPtr<CVoid>): Hresult

public expect fun oleIsCurrentClipboard(pdataobj: MutPtr<CVoid>): Hresult

public expect fun oleIsRunning(pobject: MutPtr<CVoid>): Bool

public expect fun oleLoad(pstg: MutPtr<CVoid>, riid: ConstPtr<Guid>, pclientsite: MutPtr<CVoid>, ppvobj: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun oleLoadFromStream(pstm: MutPtr<CVoid>, iidinterface: ConstPtr<Guid>, ppvobj: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun oleLoadPicture(lpstream: MutPtr<CVoid>, lsize: Int, frunmode: Bool, riid: ConstPtr<Guid>, lplpvobj: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun oleLoadPictureEx(lpstream: MutPtr<CVoid>, lsize: Int, frunmode: Bool, riid: ConstPtr<Guid>, xsizedesired: UInt, ysizedesired: UInt, dwflags: LoadPictureFlags, lplpvobj: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun oleLoadPictureFile(varfilename: Variant.Variant, lplpdisppicture: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun oleLoadPictureFileEx(varfilename: Variant.Variant, xsizedesired: UInt, ysizedesired: UInt, dwflags: LoadPictureFlags, lplpdisppicture: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun oleLoadPicturePath(szurlorpath: Pcwstr, punkcaller: MutPtr<CVoid>, dwreserved: UInt, clrreserved: UInt, riid: ConstPtr<Guid>, ppvret: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun oleLockRunning(punknown: MutPtr<CVoid>, flock: Bool, flastunlockcloses: Bool): Hresult

public expect fun oleMetafilePictFromIconAndLabel(hicon: Hicon, lpszlabel: Pcwstr, lpszsourcefile: Pcwstr, iiconindex: UInt): Hglobal

public expect fun oleNoteObjectVisible(punknown: MutPtr<CVoid>, fvisible: Bool): Hresult

public expect fun oleQueryCreateFromData(psrcdataobject: MutPtr<CVoid>): Hresult

public expect fun oleQueryLinkFromData(psrcdataobject: MutPtr<CVoid>): Hresult

public expect fun oleRegEnumFormatEtc(clsid: ConstPtr<Guid>, dwdirection: UInt, ppenum: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun oleRegEnumVerbs(clsid: ConstPtr<Guid>, ppenum: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun oleRegGetMiscStatus(clsid: ConstPtr<Guid>, dwaspect: UInt, pdwstatus: MutPtr<UInt>): Hresult

public expect fun oleRegGetUserType(clsid: ConstPtr<Guid>, dwformoftype: UInt, pszusertype: MutPtr<Pwstr>): Hresult

public expect fun oleRun(punknown: MutPtr<CVoid>): Hresult

public expect fun oleSave(pps: MutPtr<CVoid>, pstg: MutPtr<CVoid>, fsameasload: Bool): Hresult

public expect fun oleSavePictureFile(lpdisppicture: MutPtr<CVoid>, bstrfilename: Bstr): Hresult

public expect fun oleSaveToStream(ppstm: MutPtr<CVoid>, pstm: MutPtr<CVoid>): Hresult

public expect fun oleSetAutoConvert(clsidold: ConstPtr<Guid>, clsidnew: ConstPtr<Guid>): Hresult

public expect fun oleSetClipboard(pdataobj: MutPtr<CVoid>): Hresult

public expect fun oleSetContainedObject(punknown: MutPtr<CVoid>, fcontained: Bool): Hresult

public expect fun oleSetMenuDescriptor(holemenu: Long, hwndframe: Hwnd, hwndactiveobject: Hwnd, lpframe: MutPtr<CVoid>, lpactiveobj: MutPtr<CVoid>): Hresult

public expect fun oleTranslateAccelerator(lpframe: MutPtr<CVoid>, lpframeinfo: ConstPtr<Oleinplaceframeinfo>, lpmsg: ConstPtr<Msg>): Hresult

public expect fun oleTranslateColor(clr: UInt, hpal: Hpalette, lpcolorref: MutPtr<Colorref>): Hresult

public expect fun oleUIAddVerbMenuA(lpoleobj: MutPtr<CVoid>, lpszshorttype: Pcstr, hmenu: Hmenu, upos: UInt, uidverbmin: UInt, uidverbmax: UInt, baddconvert: Bool, idconvert: UInt, lphmenu: MutPtr<Hmenu>): Bool

public expect fun oleUIAddVerbMenuW(lpoleobj: MutPtr<CVoid>, lpszshorttype: Pcwstr, hmenu: Hmenu, upos: UInt, uidverbmin: UInt, uidverbmax: UInt, baddconvert: Bool, idconvert: UInt, lphmenu: MutPtr<Hmenu>): Bool

public expect fun oleUIBusyA(param0: ConstPtr<Oleuibusya>): UInt

public expect fun oleUIBusyW(param0: ConstPtr<Oleuibusyw>): UInt

public expect fun oleUICanConvertOrActivateAs(rclsid: ConstPtr<Guid>, fislinkedobject: Bool, wformat: UShort): Bool

public expect fun oleUIChangeIconA(param0: ConstPtr<Oleuichangeicona>): UInt

public expect fun oleUIChangeIconW(param0: ConstPtr<Oleuichangeiconw>): UInt

public expect fun oleUIChangeSourceA(param0: ConstPtr<Oleuichangesourcea>): UInt

public expect fun oleUIChangeSourceW(param0: ConstPtr<Oleuichangesourcew>): UInt

public expect fun oleUIConvertA(param0: ConstPtr<Oleuiconverta>): UInt

public expect fun oleUIConvertW(param0: ConstPtr<Oleuiconvertw>): UInt

public expect fun oleUIEditLinksA(param0: ConstPtr<Oleuieditlinksa>): UInt

public expect fun oleUIEditLinksW(param0: ConstPtr<Oleuieditlinksw>): UInt

public expect fun oleUIInsertObjectA(param0: ConstPtr<Oleuiinsertobjecta>): UInt

public expect fun oleUIInsertObjectW(param0: ConstPtr<Oleuiinsertobjectw>): UInt

public expect fun oleUIObjectPropertiesA(param0: ConstPtr<Oleuiobjectpropsa>): UInt

public expect fun oleUIObjectPropertiesW(param0: ConstPtr<Oleuiobjectpropsw>): UInt

public expect fun oleUIPasteSpecialA(param0: ConstPtr<Oleuipastespeciala>): UInt

public expect fun oleUIPasteSpecialW(param0: ConstPtr<Oleuipastespecialw>): UInt

public expect fun oleUIPromptUserA(ntemplate: Int, hwndparent: Hwnd, vararg variadicArgs: Long): Int

public expect fun oleUIPromptUserW(ntemplate: Int, hwndparent: Hwnd, vararg variadicArgs: Long): Int

public expect fun oleUIUpdateLinksA(lpoleuilinkcntr: MutPtr<CVoid>, hwndparent: Hwnd, lpsztitle: Pcstr, clinks: Int): Bool

public expect fun oleUIUpdateLinksW(lpoleuilinkcntr: MutPtr<CVoid>, hwndparent: Hwnd, lpsztitle: Pcwstr, clinks: Int): Bool

public expect fun oleUninitialize()

public expect fun queryPathOfRegTypeLib(guid: ConstPtr<Guid>, wmaj: UShort, wmin: UShort, lcid: UInt, lpbstrpathname: MutPtr<Bstr>): Hresult

public expect fun registerActiveObject(punk: MutPtr<CVoid>, rclsid: ConstPtr<Guid>, dwflags: ActiveobjectFlags, pdwregister: MutPtr<UInt>): Hresult

public expect fun registerDragDrop(hwnd: Hwnd, pdroptarget: MutPtr<CVoid>): Hresult

public expect fun registerTypeLib(ptlib: MutPtr<CVoid>, szfullpath: Pcwstr, szhelpdir: Pcwstr): Hresult

public expect fun registerTypeLibForUser(ptlib: MutPtr<CVoid>, szfullpath: Pcwstr, szhelpdir: Pcwstr): Hresult

public expect fun releaseStgMedium(param0: MutPtr<Stgmedium>)

public expect fun revokeActiveObject(dwregister: UInt, pvreserved: MutPtr<CVoid>): Hresult

public expect fun revokeDragDrop(hwnd: Hwnd): Hresult

public expect fun safeArrayAccessData(psa: ConstPtr<Safearray>, ppvdata: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun safeArrayAddRef(psa: ConstPtr<Safearray>, ppdatatorelease: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun safeArrayAllocData(psa: ConstPtr<Safearray>): Hresult

public expect fun safeArrayAllocDescriptor(cdims: UInt, ppsaout: MutPtr<MutPtr<Safearray>>): Hresult

public expect fun safeArrayAllocDescriptorEx(vt: Variant.Varenum, cdims: UInt, ppsaout: MutPtr<MutPtr<Safearray>>): Hresult

public expect fun safeArrayCopy(psa: ConstPtr<Safearray>, ppsaout: MutPtr<MutPtr<Safearray>>): Hresult

public expect fun safeArrayCopyData(psasource: ConstPtr<Safearray>, psatarget: ConstPtr<Safearray>): Hresult

public expect fun safeArrayCreate(vt: Variant.Varenum, cdims: UInt, rgsabound: ConstPtr<Safearraybound>): MutPtr<Safearray>

public expect fun safeArrayCreateEx(vt: Variant.Varenum, cdims: UInt, rgsabound: ConstPtr<Safearraybound>, pvextra: ConstPtr<CVoid>): MutPtr<Safearray>

public expect fun safeArrayCreateVector(vt: Variant.Varenum, llbound: Int, celements: UInt): MutPtr<Safearray>

public expect fun safeArrayCreateVectorEx(vt: Variant.Varenum, llbound: Int, celements: UInt, pvextra: ConstPtr<CVoid>): MutPtr<Safearray>

public expect fun safeArrayDestroy(psa: ConstPtr<Safearray>): Hresult

public expect fun safeArrayDestroyData(psa: ConstPtr<Safearray>): Hresult

public expect fun safeArrayDestroyDescriptor(psa: ConstPtr<Safearray>): Hresult

public expect fun safeArrayGetDim(psa: ConstPtr<Safearray>): UInt

public expect fun safeArrayGetElement(psa: ConstPtr<Safearray>, rgindices: ConstPtr<Int>, pv: MutPtr<CVoid>): Hresult

public expect fun safeArrayGetElemsize(psa: ConstPtr<Safearray>): UInt

public expect fun safeArrayGetIID(psa: ConstPtr<Safearray>, pguid: MutPtr<Guid>): Hresult

public expect fun safeArrayGetLBound(psa: ConstPtr<Safearray>, ndim: UInt, pllbound: MutPtr<Int>): Hresult

public expect fun safeArrayGetRecordInfo(psa: ConstPtr<Safearray>, prinfo: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun safeArrayGetUBound(psa: ConstPtr<Safearray>, ndim: UInt, plubound: MutPtr<Int>): Hresult

public expect fun safeArrayGetVartype(psa: ConstPtr<Safearray>, pvt: MutPtr<Variant.Varenum>): Hresult

public expect fun safeArrayLock(psa: ConstPtr<Safearray>): Hresult

public expect fun safeArrayPtrOfIndex(psa: ConstPtr<Safearray>, rgindices: ConstPtr<Int>, ppvdata: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun safeArrayPutElement(psa: ConstPtr<Safearray>, rgindices: ConstPtr<Int>, pv: ConstPtr<CVoid>): Hresult

public expect fun safeArrayRedim(psa: MutPtr<Safearray>, psaboundnew: ConstPtr<Safearraybound>): Hresult

public expect fun safeArrayReleaseData(pdata: ConstPtr<CVoid>)

public expect fun safeArrayReleaseDescriptor(psa: ConstPtr<Safearray>)

public expect fun safeArraySetIID(psa: ConstPtr<Safearray>, guid: ConstPtr<Guid>): Hresult

public expect fun safeArraySetRecordInfo(psa: ConstPtr<Safearray>, prinfo: MutPtr<CVoid>): Hresult

public expect fun safeArrayUnaccessData(psa: ConstPtr<Safearray>): Hresult

public expect fun safeArrayUnlock(psa: ConstPtr<Safearray>): Hresult

public expect fun unRegisterTypeLib(libid: ConstPtr<Guid>, wvermajor: UShort, wverminor: UShort, lcid: UInt, syskind: Syskind): Hresult

public expect fun unRegisterTypeLibForUser(libid: ConstPtr<Guid>, wmajorvernum: UShort, wminorvernum: UShort, lcid: UInt, syskind: Syskind): Hresult

public expect fun varAbs(pvarin: ConstPtr<Variant.Variant>, pvarresult: MutPtr<Variant.Variant>): Hresult

public expect fun varAdd(pvarleft: ConstPtr<Variant.Variant>, pvarright: ConstPtr<Variant.Variant>, pvarresult: MutPtr<Variant.Variant>): Hresult

public expect fun varAnd(pvarleft: ConstPtr<Variant.Variant>, pvarright: ConstPtr<Variant.Variant>, pvarresult: MutPtr<Variant.Variant>): Hresult

public expect fun varBoolFromCy(cyin: CY, pboolout: MutPtr<VariantBool>): Hresult

public expect fun varBoolFromDate(datein: Double, pboolout: MutPtr<VariantBool>): Hresult

public expect fun varBoolFromDec(pdecin: ConstPtr<Decimal>, pboolout: MutPtr<VariantBool>): Hresult

public expect fun varBoolFromDisp(pdispin: MutPtr<CVoid>, lcid: UInt, pboolout: MutPtr<VariantBool>): Hresult

public expect fun varBoolFromI1(cin: Byte, pboolout: MutPtr<VariantBool>): Hresult

public expect fun varBoolFromI2(sin: Short, pboolout: MutPtr<VariantBool>): Hresult

public expect fun varBoolFromI4(lin: Int, pboolout: MutPtr<VariantBool>): Hresult

public expect fun varBoolFromI8(i64in: Long, pboolout: MutPtr<VariantBool>): Hresult

public expect fun varBoolFromR4(fltin: Float, pboolout: MutPtr<VariantBool>): Hresult

public expect fun varBoolFromR8(dblin: Double, pboolout: MutPtr<VariantBool>): Hresult

public expect fun varBoolFromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pboolout: MutPtr<VariantBool>): Hresult

public expect fun varBoolFromUI1(bin: UByte, pboolout: MutPtr<VariantBool>): Hresult

public expect fun varBoolFromUI2(uiin: UShort, pboolout: MutPtr<VariantBool>): Hresult

public expect fun varBoolFromUI4(ulin: UInt, pboolout: MutPtr<VariantBool>): Hresult

public expect fun varBoolFromUI8(i64in: ULong, pboolout: MutPtr<VariantBool>): Hresult

public expect fun varBstrCat(bstrleft: Bstr, bstrright: Bstr, pbstrresult: MutPtr<Bstr>): Hresult

public expect fun varBstrCmp(bstrleft: Bstr, bstrright: Bstr, lcid: UInt, dwflags: UInt): Hresult

public expect fun varBstrFromBool(boolin: VariantBool, lcid: UInt, dwflags: UInt, pbstrout: MutPtr<Bstr>): Hresult

public expect fun varBstrFromCy(cyin: CY, lcid: UInt, dwflags: UInt, pbstrout: MutPtr<Bstr>): Hresult

public expect fun varBstrFromDate(datein: Double, lcid: UInt, dwflags: UInt, pbstrout: MutPtr<Bstr>): Hresult

public expect fun varBstrFromDec(pdecin: ConstPtr<Decimal>, lcid: UInt, dwflags: UInt, pbstrout: MutPtr<Bstr>): Hresult

public expect fun varBstrFromDisp(pdispin: MutPtr<CVoid>, lcid: UInt, dwflags: UInt, pbstrout: MutPtr<Bstr>): Hresult

public expect fun varBstrFromI1(cin: Byte, lcid: UInt, dwflags: UInt, pbstrout: MutPtr<Bstr>): Hresult

public expect fun varBstrFromI2(ival: Short, lcid: UInt, dwflags: UInt, pbstrout: MutPtr<Bstr>): Hresult

public expect fun varBstrFromI4(lin: Int, lcid: UInt, dwflags: UInt, pbstrout: MutPtr<Bstr>): Hresult

public expect fun varBstrFromI8(i64in: Long, lcid: UInt, dwflags: UInt, pbstrout: MutPtr<Bstr>): Hresult

public expect fun varBstrFromR4(fltin: Float, lcid: UInt, dwflags: UInt, pbstrout: MutPtr<Bstr>): Hresult

public expect fun varBstrFromR8(dblin: Double, lcid: UInt, dwflags: UInt, pbstrout: MutPtr<Bstr>): Hresult

public expect fun varBstrFromUI1(bval: UByte, lcid: UInt, dwflags: UInt, pbstrout: MutPtr<Bstr>): Hresult

public expect fun varBstrFromUI2(uiin: UShort, lcid: UInt, dwflags: UInt, pbstrout: MutPtr<Bstr>): Hresult

public expect fun varBstrFromUI4(ulin: UInt, lcid: UInt, dwflags: UInt, pbstrout: MutPtr<Bstr>): Hresult

public expect fun varBstrFromUI8(ui64in: ULong, lcid: UInt, dwflags: UInt, pbstrout: MutPtr<Bstr>): Hresult

public expect fun varCat(pvarleft: ConstPtr<Variant.Variant>, pvarright: ConstPtr<Variant.Variant>, pvarresult: MutPtr<Variant.Variant>): Hresult

public expect fun varCmp(pvarleft: ConstPtr<Variant.Variant>, pvarright: ConstPtr<Variant.Variant>, lcid: UInt, dwflags: UInt): Varcmp

public expect fun varCyAbs(cyin: CY, pcyresult: MutPtr<CY>): Hresult

public expect fun varCyAdd(cyleft: CY, cyright: CY, pcyresult: MutPtr<CY>): Hresult

public expect fun varCyCmp(cyleft: CY, cyright: CY): Varcmp

public expect fun varCyCmpR8(cyleft: CY, dblright: Double): Varcmp

public expect fun varCyFix(cyin: CY, pcyresult: MutPtr<CY>): Hresult

public expect fun varCyFromBool(boolin: VariantBool, pcyout: MutPtr<CY>): Hresult

public expect fun varCyFromDate(datein: Double, pcyout: MutPtr<CY>): Hresult

public expect fun varCyFromDec(pdecin: ConstPtr<Decimal>, pcyout: MutPtr<CY>): Hresult

public expect fun varCyFromDisp(pdispin: MutPtr<CVoid>, lcid: UInt, pcyout: MutPtr<CY>): Hresult

public expect fun varCyFromI1(cin: Byte, pcyout: MutPtr<CY>): Hresult

public expect fun varCyFromI2(sin: Short, pcyout: MutPtr<CY>): Hresult

public expect fun varCyFromI4(lin: Int, pcyout: MutPtr<CY>): Hresult

public expect fun varCyFromI8(i64in: Long, pcyout: MutPtr<CY>): Hresult

public expect fun varCyFromR4(fltin: Float, pcyout: MutPtr<CY>): Hresult

public expect fun varCyFromR8(dblin: Double, pcyout: MutPtr<CY>): Hresult

public expect fun varCyFromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pcyout: MutPtr<CY>): Hresult

public expect fun varCyFromUI1(bin: UByte, pcyout: MutPtr<CY>): Hresult

public expect fun varCyFromUI2(uiin: UShort, pcyout: MutPtr<CY>): Hresult

public expect fun varCyFromUI4(ulin: UInt, pcyout: MutPtr<CY>): Hresult

public expect fun varCyFromUI8(ui64in: ULong, pcyout: MutPtr<CY>): Hresult

public expect fun varCyInt(cyin: CY, pcyresult: MutPtr<CY>): Hresult

public expect fun varCyMul(cyleft: CY, cyright: CY, pcyresult: MutPtr<CY>): Hresult

public expect fun varCyMulI4(cyleft: CY, lright: Int, pcyresult: MutPtr<CY>): Hresult

public expect fun varCyMulI8(cyleft: CY, lright: Long, pcyresult: MutPtr<CY>): Hresult

public expect fun varCyNeg(cyin: CY, pcyresult: MutPtr<CY>): Hresult

public expect fun varCyRound(cyin: CY, cdecimals: Int, pcyresult: MutPtr<CY>): Hresult

public expect fun varCySub(cyleft: CY, cyright: CY, pcyresult: MutPtr<CY>): Hresult

public expect fun varDateFromBool(boolin: VariantBool, pdateout: MutPtr<Double>): Hresult

public expect fun varDateFromCy(cyin: CY, pdateout: MutPtr<Double>): Hresult

public expect fun varDateFromDec(pdecin: ConstPtr<Decimal>, pdateout: MutPtr<Double>): Hresult

public expect fun varDateFromDisp(pdispin: MutPtr<CVoid>, lcid: UInt, pdateout: MutPtr<Double>): Hresult

public expect fun varDateFromI1(cin: Byte, pdateout: MutPtr<Double>): Hresult

public expect fun varDateFromI2(sin: Short, pdateout: MutPtr<Double>): Hresult

public expect fun varDateFromI4(lin: Int, pdateout: MutPtr<Double>): Hresult

public expect fun varDateFromI8(i64in: Long, pdateout: MutPtr<Double>): Hresult

public expect fun varDateFromR4(fltin: Float, pdateout: MutPtr<Double>): Hresult

public expect fun varDateFromR8(dblin: Double, pdateout: MutPtr<Double>): Hresult

public expect fun varDateFromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pdateout: MutPtr<Double>): Hresult

public expect fun varDateFromUI1(bin: UByte, pdateout: MutPtr<Double>): Hresult

public expect fun varDateFromUI2(uiin: UShort, pdateout: MutPtr<Double>): Hresult

public expect fun varDateFromUI4(ulin: UInt, pdateout: MutPtr<Double>): Hresult

public expect fun varDateFromUI8(ui64in: ULong, pdateout: MutPtr<Double>): Hresult

public expect fun varDateFromUdate(pudatein: ConstPtr<Udate>, dwflags: UInt, pdateout: MutPtr<Double>): Hresult

public expect fun varDateFromUdateEx(pudatein: ConstPtr<Udate>, lcid: UInt, dwflags: UInt, pdateout: MutPtr<Double>): Hresult

public expect fun varDecAbs(pdecin: ConstPtr<Decimal>, pdecresult: MutPtr<Decimal>): Hresult

public expect fun varDecAdd(pdecleft: ConstPtr<Decimal>, pdecright: ConstPtr<Decimal>, pdecresult: MutPtr<Decimal>): Hresult

public expect fun varDecCmp(pdecleft: ConstPtr<Decimal>, pdecright: ConstPtr<Decimal>): Varcmp

public expect fun varDecCmpR8(pdecleft: ConstPtr<Decimal>, dblright: Double): Varcmp

public expect fun varDecDiv(pdecleft: ConstPtr<Decimal>, pdecright: ConstPtr<Decimal>, pdecresult: MutPtr<Decimal>): Hresult

public expect fun varDecFix(pdecin: ConstPtr<Decimal>, pdecresult: MutPtr<Decimal>): Hresult

public expect fun varDecFromBool(boolin: VariantBool, pdecout: MutPtr<Decimal>): Hresult

public expect fun varDecFromCy(cyin: CY, pdecout: MutPtr<Decimal>): Hresult

public expect fun varDecFromDate(datein: Double, pdecout: MutPtr<Decimal>): Hresult

public expect fun varDecFromDisp(pdispin: MutPtr<CVoid>, lcid: UInt, pdecout: MutPtr<Decimal>): Hresult

public expect fun varDecFromI1(cin: Byte, pdecout: MutPtr<Decimal>): Hresult

public expect fun varDecFromI2(uiin: Short, pdecout: MutPtr<Decimal>): Hresult

public expect fun varDecFromI4(lin: Int, pdecout: MutPtr<Decimal>): Hresult

public expect fun varDecFromI8(i64in: Long, pdecout: MutPtr<Decimal>): Hresult

public expect fun varDecFromR4(fltin: Float, pdecout: MutPtr<Decimal>): Hresult

public expect fun varDecFromR8(dblin: Double, pdecout: MutPtr<Decimal>): Hresult

public expect fun varDecFromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pdecout: MutPtr<Decimal>): Hresult

public expect fun varDecFromUI1(bin: UByte, pdecout: MutPtr<Decimal>): Hresult

public expect fun varDecFromUI2(uiin: UShort, pdecout: MutPtr<Decimal>): Hresult

public expect fun varDecFromUI4(ulin: UInt, pdecout: MutPtr<Decimal>): Hresult

public expect fun varDecFromUI8(ui64in: ULong, pdecout: MutPtr<Decimal>): Hresult

public expect fun varDecInt(pdecin: ConstPtr<Decimal>, pdecresult: MutPtr<Decimal>): Hresult

public expect fun varDecMul(pdecleft: ConstPtr<Decimal>, pdecright: ConstPtr<Decimal>, pdecresult: MutPtr<Decimal>): Hresult

public expect fun varDecNeg(pdecin: ConstPtr<Decimal>, pdecresult: MutPtr<Decimal>): Hresult

public expect fun varDecRound(pdecin: ConstPtr<Decimal>, cdecimals: Int, pdecresult: MutPtr<Decimal>): Hresult

public expect fun varDecSub(pdecleft: ConstPtr<Decimal>, pdecright: ConstPtr<Decimal>, pdecresult: MutPtr<Decimal>): Hresult

public expect fun varDiv(pvarleft: ConstPtr<Variant.Variant>, pvarright: ConstPtr<Variant.Variant>, pvarresult: MutPtr<Variant.Variant>): Hresult

public expect fun varEqv(pvarleft: ConstPtr<Variant.Variant>, pvarright: ConstPtr<Variant.Variant>, pvarresult: MutPtr<Variant.Variant>): Hresult

public expect fun varFix(pvarin: ConstPtr<Variant.Variant>, pvarresult: MutPtr<Variant.Variant>): Hresult

public expect fun varFormat(pvarin: ConstPtr<Variant.Variant>, pstrformat: Pcwstr, ifirstday: VarformatFirstDay, ifirstweek: VarformatFirstWeek, dwflags: UInt, pbstrout: MutPtr<Bstr>): Hresult

public expect fun varFormatCurrency(pvarin: ConstPtr<Variant.Variant>, inumdig: Int, iinclead: Int, iuseparens: Int, igroup: Int, dwflags: UInt, pbstrout: MutPtr<Bstr>): Hresult

public expect fun varFormatDateTime(pvarin: ConstPtr<Variant.Variant>, inamedformat: VarformatNamedFormat, dwflags: UInt, pbstrout: MutPtr<Bstr>): Hresult

public expect fun varFormatFromTokens(pvarin: ConstPtr<Variant.Variant>, pstrformat: Pcwstr, pbtokcur: ConstPtr<UByte>, dwflags: UInt, pbstrout: MutPtr<Bstr>, lcid: UInt): Hresult

public expect fun varFormatNumber(pvarin: ConstPtr<Variant.Variant>, inumdig: Int, iinclead: VarformatLeadingDigit, iuseparens: VarformatParentheses, igroup: VarformatGroup, dwflags: UInt, pbstrout: MutPtr<Bstr>): Hresult

public expect fun varFormatPercent(pvarin: ConstPtr<Variant.Variant>, inumdig: Int, iinclead: VarformatLeadingDigit, iuseparens: VarformatParentheses, igroup: VarformatGroup, dwflags: UInt, pbstrout: MutPtr<Bstr>): Hresult

public expect fun varI1FromBool(boolin: VariantBool, pcout: Pstr): Hresult

public expect fun varI1FromCy(cyin: CY, pcout: Pstr): Hresult

public expect fun varI1FromDate(datein: Double, pcout: Pstr): Hresult

public expect fun varI1FromDec(pdecin: ConstPtr<Decimal>, pcout: Pstr): Hresult

public expect fun varI1FromDisp(pdispin: MutPtr<CVoid>, lcid: UInt, pcout: Pstr): Hresult

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

public expect fun varI2FromBool(boolin: VariantBool, psout: MutPtr<Short>): Hresult

public expect fun varI2FromCy(cyin: CY, psout: MutPtr<Short>): Hresult

public expect fun varI2FromDate(datein: Double, psout: MutPtr<Short>): Hresult

public expect fun varI2FromDec(pdecin: ConstPtr<Decimal>, psout: MutPtr<Short>): Hresult

public expect fun varI2FromDisp(pdispin: MutPtr<CVoid>, lcid: UInt, psout: MutPtr<Short>): Hresult

public expect fun varI2FromI1(cin: Byte, psout: MutPtr<Short>): Hresult

public expect fun varI2FromI4(lin: Int, psout: MutPtr<Short>): Hresult

public expect fun varI2FromI8(i64in: Long, psout: MutPtr<Short>): Hresult

public expect fun varI2FromR4(fltin: Float, psout: MutPtr<Short>): Hresult

public expect fun varI2FromR8(dblin: Double, psout: MutPtr<Short>): Hresult

public expect fun varI2FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, psout: MutPtr<Short>): Hresult

public expect fun varI2FromUI1(bin: UByte, psout: MutPtr<Short>): Hresult

public expect fun varI2FromUI2(uiin: UShort, psout: MutPtr<Short>): Hresult

public expect fun varI2FromUI4(ulin: UInt, psout: MutPtr<Short>): Hresult

public expect fun varI2FromUI8(ui64in: ULong, psout: MutPtr<Short>): Hresult

public expect fun varI4FromBool(boolin: VariantBool, plout: MutPtr<Int>): Hresult

public expect fun varI4FromCy(cyin: CY, plout: MutPtr<Int>): Hresult

public expect fun varI4FromDate(datein: Double, plout: MutPtr<Int>): Hresult

public expect fun varI4FromDec(pdecin: ConstPtr<Decimal>, plout: MutPtr<Int>): Hresult

public expect fun varI4FromDisp(pdispin: MutPtr<CVoid>, lcid: UInt, plout: MutPtr<Int>): Hresult

public expect fun varI4FromI1(cin: Byte, plout: MutPtr<Int>): Hresult

public expect fun varI4FromI2(sin: Short, plout: MutPtr<Int>): Hresult

public expect fun varI4FromI8(i64in: Long, plout: MutPtr<Int>): Hresult

public expect fun varI4FromR4(fltin: Float, plout: MutPtr<Int>): Hresult

public expect fun varI4FromR8(dblin: Double, plout: MutPtr<Int>): Hresult

public expect fun varI4FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, plout: MutPtr<Int>): Hresult

public expect fun varI4FromUI1(bin: UByte, plout: MutPtr<Int>): Hresult

public expect fun varI4FromUI2(uiin: UShort, plout: MutPtr<Int>): Hresult

public expect fun varI4FromUI4(ulin: UInt, plout: MutPtr<Int>): Hresult

public expect fun varI4FromUI8(ui64in: ULong, plout: MutPtr<Int>): Hresult

public expect fun varI8FromBool(boolin: VariantBool, pi64out: MutPtr<Long>): Hresult

public expect fun varI8FromCy(cyin: CY, pi64out: MutPtr<Long>): Hresult

public expect fun varI8FromDate(datein: Double, pi64out: MutPtr<Long>): Hresult

public expect fun varI8FromDec(pdecin: ConstPtr<Decimal>, pi64out: MutPtr<Long>): Hresult

public expect fun varI8FromDisp(pdispin: MutPtr<CVoid>, lcid: UInt, pi64out: MutPtr<Long>): Hresult

public expect fun varI8FromI1(cin: Byte, pi64out: MutPtr<Long>): Hresult

public expect fun varI8FromI2(sin: Short, pi64out: MutPtr<Long>): Hresult

public expect fun varI8FromR4(fltin: Float, pi64out: MutPtr<Long>): Hresult

public expect fun varI8FromR8(dblin: Double, pi64out: MutPtr<Long>): Hresult

public expect fun varI8FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pi64out: MutPtr<Long>): Hresult

public expect fun varI8FromUI1(bin: UByte, pi64out: MutPtr<Long>): Hresult

public expect fun varI8FromUI2(uiin: UShort, pi64out: MutPtr<Long>): Hresult

public expect fun varI8FromUI4(ulin: UInt, pi64out: MutPtr<Long>): Hresult

public expect fun varI8FromUI8(ui64in: ULong, pi64out: MutPtr<Long>): Hresult

public expect fun varIdiv(pvarleft: ConstPtr<Variant.Variant>, pvarright: ConstPtr<Variant.Variant>, pvarresult: MutPtr<Variant.Variant>): Hresult

public expect fun varImp(pvarleft: ConstPtr<Variant.Variant>, pvarright: ConstPtr<Variant.Variant>, pvarresult: MutPtr<Variant.Variant>): Hresult

public expect fun varInt(pvarin: ConstPtr<Variant.Variant>, pvarresult: MutPtr<Variant.Variant>): Hresult

public expect fun varMod(pvarleft: ConstPtr<Variant.Variant>, pvarright: ConstPtr<Variant.Variant>, pvarresult: MutPtr<Variant.Variant>): Hresult

public expect fun varMonthName(imonth: Int, fabbrev: Int, dwflags: UInt, pbstrout: MutPtr<Bstr>): Hresult

public expect fun varMul(pvarleft: ConstPtr<Variant.Variant>, pvarright: ConstPtr<Variant.Variant>, pvarresult: MutPtr<Variant.Variant>): Hresult

public expect fun varNeg(pvarin: ConstPtr<Variant.Variant>, pvarresult: MutPtr<Variant.Variant>): Hresult

public expect fun varNot(pvarin: ConstPtr<Variant.Variant>, pvarresult: MutPtr<Variant.Variant>): Hresult

public expect fun varNumFromParseNum(pnumprs: ConstPtr<Numparse>, rgbdig: ConstPtr<UByte>, dwvtbits: UInt, pvar: MutPtr<Variant.Variant>): Hresult

public expect fun varOr(pvarleft: ConstPtr<Variant.Variant>, pvarright: ConstPtr<Variant.Variant>, pvarresult: MutPtr<Variant.Variant>): Hresult

public expect fun varParseNumFromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pnumprs: MutPtr<Numparse>, rgbdig: MutPtr<UByte>): Hresult

public expect fun varPow(pvarleft: ConstPtr<Variant.Variant>, pvarright: ConstPtr<Variant.Variant>, pvarresult: MutPtr<Variant.Variant>): Hresult

public expect fun varR4CmpR8(fltleft: Float, dblright: Double): Varcmp

public expect fun varR4FromBool(boolin: VariantBool, pfltout: MutPtr<Float>): Hresult

public expect fun varR4FromCy(cyin: CY, pfltout: MutPtr<Float>): Hresult

public expect fun varR4FromDate(datein: Double, pfltout: MutPtr<Float>): Hresult

public expect fun varR4FromDec(pdecin: ConstPtr<Decimal>, pfltout: MutPtr<Float>): Hresult

public expect fun varR4FromDisp(pdispin: MutPtr<CVoid>, lcid: UInt, pfltout: MutPtr<Float>): Hresult

public expect fun varR4FromI1(cin: Byte, pfltout: MutPtr<Float>): Hresult

public expect fun varR4FromI2(sin: Short, pfltout: MutPtr<Float>): Hresult

public expect fun varR4FromI4(lin: Int, pfltout: MutPtr<Float>): Hresult

public expect fun varR4FromI8(i64in: Long, pfltout: MutPtr<Float>): Hresult

public expect fun varR4FromR8(dblin: Double, pfltout: MutPtr<Float>): Hresult

public expect fun varR4FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pfltout: MutPtr<Float>): Hresult

public expect fun varR4FromUI1(bin: UByte, pfltout: MutPtr<Float>): Hresult

public expect fun varR4FromUI2(uiin: UShort, pfltout: MutPtr<Float>): Hresult

public expect fun varR4FromUI4(ulin: UInt, pfltout: MutPtr<Float>): Hresult

public expect fun varR4FromUI8(ui64in: ULong, pfltout: MutPtr<Float>): Hresult

public expect fun varR8FromBool(boolin: VariantBool, pdblout: MutPtr<Double>): Hresult

public expect fun varR8FromCy(cyin: CY, pdblout: MutPtr<Double>): Hresult

public expect fun varR8FromDate(datein: Double, pdblout: MutPtr<Double>): Hresult

public expect fun varR8FromDec(pdecin: ConstPtr<Decimal>, pdblout: MutPtr<Double>): Hresult

public expect fun varR8FromDisp(pdispin: MutPtr<CVoid>, lcid: UInt, pdblout: MutPtr<Double>): Hresult

public expect fun varR8FromI1(cin: Byte, pdblout: MutPtr<Double>): Hresult

public expect fun varR8FromI2(sin: Short, pdblout: MutPtr<Double>): Hresult

public expect fun varR8FromI4(lin: Int, pdblout: MutPtr<Double>): Hresult

public expect fun varR8FromI8(i64in: Long, pdblout: MutPtr<Double>): Hresult

public expect fun varR8FromR4(fltin: Float, pdblout: MutPtr<Double>): Hresult

public expect fun varR8FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pdblout: MutPtr<Double>): Hresult

public expect fun varR8FromUI1(bin: UByte, pdblout: MutPtr<Double>): Hresult

public expect fun varR8FromUI2(uiin: UShort, pdblout: MutPtr<Double>): Hresult

public expect fun varR8FromUI4(ulin: UInt, pdblout: MutPtr<Double>): Hresult

public expect fun varR8FromUI8(ui64in: ULong, pdblout: MutPtr<Double>): Hresult

public expect fun varR8Pow(dblleft: Double, dblright: Double, pdblresult: MutPtr<Double>): Hresult

public expect fun varR8Round(dblin: Double, cdecimals: Int, pdblresult: MutPtr<Double>): Hresult

public expect fun varRound(pvarin: ConstPtr<Variant.Variant>, cdecimals: Int, pvarresult: MutPtr<Variant.Variant>): Hresult

public expect fun varSub(pvarleft: ConstPtr<Variant.Variant>, pvarright: ConstPtr<Variant.Variant>, pvarresult: MutPtr<Variant.Variant>): Hresult

public expect fun varTokenizeFormatString(pstrformat: Pcwstr, rgbtok: MutPtr<UByte>, cbtok: Int, ifirstday: VarformatFirstDay, ifirstweek: VarformatFirstWeek, lcid: UInt, pcbactual: ConstPtr<Int>): Hresult

public expect fun varUI1FromBool(boolin: VariantBool, pbout: MutPtr<UByte>): Hresult

public expect fun varUI1FromCy(cyin: CY, pbout: MutPtr<UByte>): Hresult

public expect fun varUI1FromDate(datein: Double, pbout: MutPtr<UByte>): Hresult

public expect fun varUI1FromDec(pdecin: ConstPtr<Decimal>, pbout: MutPtr<UByte>): Hresult

public expect fun varUI1FromDisp(pdispin: MutPtr<CVoid>, lcid: UInt, pbout: MutPtr<UByte>): Hresult

public expect fun varUI1FromI1(cin: Byte, pbout: MutPtr<UByte>): Hresult

public expect fun varUI1FromI2(sin: Short, pbout: MutPtr<UByte>): Hresult

public expect fun varUI1FromI4(lin: Int, pbout: MutPtr<UByte>): Hresult

public expect fun varUI1FromI8(i64in: Long, pbout: MutPtr<UByte>): Hresult

public expect fun varUI1FromR4(fltin: Float, pbout: MutPtr<UByte>): Hresult

public expect fun varUI1FromR8(dblin: Double, pbout: MutPtr<UByte>): Hresult

public expect fun varUI1FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pbout: MutPtr<UByte>): Hresult

public expect fun varUI1FromUI2(uiin: UShort, pbout: MutPtr<UByte>): Hresult

public expect fun varUI1FromUI4(ulin: UInt, pbout: MutPtr<UByte>): Hresult

public expect fun varUI1FromUI8(ui64in: ULong, pbout: MutPtr<UByte>): Hresult

public expect fun varUI2FromBool(boolin: VariantBool, puiout: MutPtr<UShort>): Hresult

public expect fun varUI2FromCy(cyin: CY, puiout: MutPtr<UShort>): Hresult

public expect fun varUI2FromDate(datein: Double, puiout: MutPtr<UShort>): Hresult

public expect fun varUI2FromDec(pdecin: ConstPtr<Decimal>, puiout: MutPtr<UShort>): Hresult

public expect fun varUI2FromDisp(pdispin: MutPtr<CVoid>, lcid: UInt, puiout: MutPtr<UShort>): Hresult

public expect fun varUI2FromI1(cin: Byte, puiout: MutPtr<UShort>): Hresult

public expect fun varUI2FromI2(uiin: Short, puiout: MutPtr<UShort>): Hresult

public expect fun varUI2FromI4(lin: Int, puiout: MutPtr<UShort>): Hresult

public expect fun varUI2FromI8(i64in: Long, puiout: MutPtr<UShort>): Hresult

public expect fun varUI2FromR4(fltin: Float, puiout: MutPtr<UShort>): Hresult

public expect fun varUI2FromR8(dblin: Double, puiout: MutPtr<UShort>): Hresult

public expect fun varUI2FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, puiout: MutPtr<UShort>): Hresult

public expect fun varUI2FromUI1(bin: UByte, puiout: MutPtr<UShort>): Hresult

public expect fun varUI2FromUI4(ulin: UInt, puiout: MutPtr<UShort>): Hresult

public expect fun varUI2FromUI8(i64in: ULong, puiout: MutPtr<UShort>): Hresult

public expect fun varUI4FromBool(boolin: VariantBool, pulout: MutPtr<UInt>): Hresult

public expect fun varUI4FromCy(cyin: CY, pulout: MutPtr<UInt>): Hresult

public expect fun varUI4FromDate(datein: Double, pulout: MutPtr<UInt>): Hresult

public expect fun varUI4FromDec(pdecin: ConstPtr<Decimal>, pulout: MutPtr<UInt>): Hresult

public expect fun varUI4FromDisp(pdispin: MutPtr<CVoid>, lcid: UInt, pulout: MutPtr<UInt>): Hresult

public expect fun varUI4FromI1(cin: Byte, pulout: MutPtr<UInt>): Hresult

public expect fun varUI4FromI2(uiin: Short, pulout: MutPtr<UInt>): Hresult

public expect fun varUI4FromI4(lin: Int, pulout: MutPtr<UInt>): Hresult

public expect fun varUI4FromI8(i64in: Long, plout: MutPtr<UInt>): Hresult

public expect fun varUI4FromR4(fltin: Float, pulout: MutPtr<UInt>): Hresult

public expect fun varUI4FromR8(dblin: Double, pulout: MutPtr<UInt>): Hresult

public expect fun varUI4FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pulout: MutPtr<UInt>): Hresult

public expect fun varUI4FromUI1(bin: UByte, pulout: MutPtr<UInt>): Hresult

public expect fun varUI4FromUI2(uiin: UShort, pulout: MutPtr<UInt>): Hresult

public expect fun varUI4FromUI8(ui64in: ULong, plout: MutPtr<UInt>): Hresult

public expect fun varUI8FromBool(boolin: VariantBool, pi64out: MutPtr<ULong>): Hresult

public expect fun varUI8FromCy(cyin: CY, pi64out: MutPtr<ULong>): Hresult

public expect fun varUI8FromDate(datein: Double, pi64out: MutPtr<ULong>): Hresult

public expect fun varUI8FromDec(pdecin: ConstPtr<Decimal>, pi64out: MutPtr<ULong>): Hresult

public expect fun varUI8FromDisp(pdispin: MutPtr<CVoid>, lcid: UInt, pi64out: MutPtr<ULong>): Hresult

public expect fun varUI8FromI1(cin: Byte, pi64out: MutPtr<ULong>): Hresult

public expect fun varUI8FromI2(sin: Short, pi64out: MutPtr<ULong>): Hresult

public expect fun varUI8FromI8(ui64in: Long, pi64out: MutPtr<ULong>): Hresult

public expect fun varUI8FromR4(fltin: Float, pi64out: MutPtr<ULong>): Hresult

public expect fun varUI8FromR8(dblin: Double, pi64out: MutPtr<ULong>): Hresult

public expect fun varUI8FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pi64out: MutPtr<ULong>): Hresult

public expect fun varUI8FromUI1(bin: UByte, pi64out: MutPtr<ULong>): Hresult

public expect fun varUI8FromUI2(uiin: UShort, pi64out: MutPtr<ULong>): Hresult

public expect fun varUI8FromUI4(ulin: UInt, pi64out: MutPtr<ULong>): Hresult

public expect fun varUdateFromDate(datein: Double, dwflags: UInt, pudateout: MutPtr<Udate>): Hresult

public expect fun varWeekdayName(iweekday: Int, fabbrev: Int, ifirstday: Int, dwflags: UInt, pbstrout: MutPtr<Bstr>): Hresult

public expect fun varXor(pvarleft: ConstPtr<Variant.Variant>, pvarright: ConstPtr<Variant.Variant>, pvarresult: MutPtr<Variant.Variant>): Hresult

public expect fun vectorFromBstr(bstr: Bstr, ppsa: MutPtr<MutPtr<Safearray>>): Hresult
