@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private object WindowsWin32SystemOleJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_bstrFromVector(psa: Long, pbstr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_clearCustData(pcustdata: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_createDispTypeInfo(pidata: Long, lcid: Int, pptinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_createErrorInfo(pperrinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_createOleAdviseHolder(ppoaholder: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_createStdDispatch(punkouter: Long, pvthis: Long, ptinfo: Long, ppunkstddisp: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_createTypeLib(syskind: Int, szfile: Long, ppctlib: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_createTypeLib2(syskind: Int, szfile: Long, ppctlib: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_dispCallFunc(pvinstance: Long, ovft: Long, cc: Int, vtreturn: Short, cactuals: Int, prgvt: Long, prgpvarg: Long, pvargresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_dispGetIDsOfNames(ptinfo: Long, rgsznames: Long, cnames: Int, rgdispid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_dispGetParam(pdispparams: Long, position: Int, vttarg: Short, pvarresult: Long, puargerr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_dispInvoke(thisRef: Long, ptinfo: Long, dispidmember: Int, wflags: Short, pparams: Long, pvarresult: Long, pexcepinfo: Long, puargerr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_doDragDrop(pdataobj: Long, pdropsource: Long, dwokeffects: Int, pdweffect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_getActiveObject(rclsid: Long, pvreserved: Long, ppunk: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_getAltMonthNames(lcid: Int, prgp: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_getRecordInfoFromGuids(rguidtypelib: Long, uvermajor: Int, uverminor: Int, lcid: Int, rguidtypeinfo: Long, pprecinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_getRecordInfoFromTypeInfo(ptypeinfo: Long, pprecinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_hrgnUserFree(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_hrgnUserFree64(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_hrgnUserMarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_hrgnUserMarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_hrgnUserSize(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_hrgnUserSize64(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_hrgnUserUnmarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_hrgnUserUnmarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_isAccelerator(haccel: Long, caccelentries: Int, lpmsg: Long, lpwcmd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_lHashValOfNameSys(syskind: Int, lcid: Int, szname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_lHashValOfNameSysA(syskind: Int, lcid: Int, szname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_loadRegTypeLib(rguid: Long, wvermajor: Short, wverminor: Short, lcid: Int, pptlib: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_loadTypeLib(szfile: Long, pptlib: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_loadTypeLibEx(szfile: Long, regkind: Int, pptlib: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oaBuildVersion(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oaEnablePerUserTLibRegistration()

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleBuildVersion(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleConvertOLESTREAMToIStorage2(lpolestream: Long, pstg: Long, ptd: Long, opt: Int, pvcallbackcontext: Long, pqueryconvertolelinkcallback: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleConvertOLESTREAMToIStorageEx2(polestm: Long, pstg: Long, pcfformat: Long, plwwidth: Long, plheight: Long, pdwsize: Long, pmedium: Long, opt: Int, pvcallbackcontext: Long, pqueryconvertolelinkcallback: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleCreate(rclsid: Long, riid: Long, renderopt: Int, pformatetc: Long, pclientsite: Long, pstg: Long, ppvobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleCreateDefaultHandler(clsid: Long, punkouter: Long, riid: Long, lplpobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleCreateEmbeddingHelper(clsid: Long, punkouter: Long, flags: Int, pcf: Long, riid: Long, lplpobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleCreateEx(rclsid: Long, riid: Long, dwflags: Int, renderopt: Int, cformats: Int, rgadvf: Long, rgformatetc: Long, lpadvisesink: Long, rgdwconnection: Long, pclientsite: Long, pstg: Long, ppvobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleCreateFontIndirect(lpfontdesc: Long, riid: Long, lplpvobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleCreateFromData(psrcdataobj: Long, riid: Long, renderopt: Int, pformatetc: Long, pclientsite: Long, pstg: Long, ppvobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleCreateFromDataEx(psrcdataobj: Long, riid: Long, dwflags: Int, renderopt: Int, cformats: Int, rgadvf: Long, rgformatetc: Long, lpadvisesink: Long, rgdwconnection: Long, pclientsite: Long, pstg: Long, ppvobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleCreateFromFile(rclsid: Long, lpszfilename: Long, riid: Long, renderopt: Int, lpformatetc: Long, pclientsite: Long, pstg: Long, ppvobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleCreateFromFileEx(rclsid: Long, lpszfilename: Long, riid: Long, dwflags: Int, renderopt: Int, cformats: Int, rgadvf: Long, rgformatetc: Long, lpadvisesink: Long, rgdwconnection: Long, pclientsite: Long, pstg: Long, ppvobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleCreateLink(pmklinksrc: Long, riid: Long, renderopt: Int, lpformatetc: Long, pclientsite: Long, pstg: Long, ppvobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleCreateLinkEx(pmklinksrc: Long, riid: Long, dwflags: Int, renderopt: Int, cformats: Int, rgadvf: Long, rgformatetc: Long, lpadvisesink: Long, rgdwconnection: Long, pclientsite: Long, pstg: Long, ppvobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleCreateLinkFromData(psrcdataobj: Long, riid: Long, renderopt: Int, pformatetc: Long, pclientsite: Long, pstg: Long, ppvobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleCreateLinkFromDataEx(psrcdataobj: Long, riid: Long, dwflags: Int, renderopt: Int, cformats: Int, rgadvf: Long, rgformatetc: Long, lpadvisesink: Long, rgdwconnection: Long, pclientsite: Long, pstg: Long, ppvobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleCreateLinkToFile(lpszfilename: Long, riid: Long, renderopt: Int, lpformatetc: Long, pclientsite: Long, pstg: Long, ppvobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleCreateLinkToFileEx(lpszfilename: Long, riid: Long, dwflags: Int, renderopt: Int, cformats: Int, rgadvf: Long, rgformatetc: Long, lpadvisesink: Long, rgdwconnection: Long, pclientsite: Long, pstg: Long, ppvobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleCreateMenuDescriptor(hmenucombined: Long, lpmenuwidths: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleCreatePictureIndirect(lppictdesc: Long, riid: Long, fown: Int, lplpvobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleCreatePropertyFrame(hwndowner: Long, x: Int, y: Int, lpszcaption: Long, cobjects: Int, ppunk: Long, cpages: Int, ppageclsid: Long, lcid: Int, dwreserved: Int, pvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleCreatePropertyFrameIndirect(lpparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleCreateStaticFromData(psrcdataobj: Long, iid: Long, renderopt: Int, pformatetc: Long, pclientsite: Long, pstg: Long, ppvobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleDestroyMenuDescriptor(holemenu: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleDoAutoConvert(pstg: Long, pclsidnew: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleDraw(punknown: Long, dwaspect: Int, hdcdraw: Long, lprcbounds: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleDuplicateData(hsrc: Long, cfformat: Short, uiflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleFlushClipboard(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleGetAutoConvert(clsidold: Long, pclsidnew: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleGetClipboard(ppdataobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleGetClipboardWithEnterpriseInfo(dataobject: Long, dataenterpriseid: Long, sourcedescription: Long, targetdescription: Long, datadescription: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleGetIconOfClass(rclsid: Long, lpszlabel: Long, fusetypeaslabel: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleGetIconOfFile(lpszpath: Long, fusefileaslabel: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleIconToCursor(hinstexe: Long, hicon: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleInitialize(pvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleIsCurrentClipboard(pdataobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleIsRunning(pobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleLoad(pstg: Long, riid: Long, pclientsite: Long, ppvobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleLoadFromStream(pstm: Long, iidinterface: Long, ppvobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleLoadPicture(lpstream: Long, lsize: Int, frunmode: Int, riid: Long, lplpvobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleLoadPictureEx(lpstream: Long, lsize: Int, frunmode: Int, riid: Long, xsizedesired: Int, ysizedesired: Int, dwflags: Int, lplpvobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleLoadPicturePath(szurlorpath: Long, punkcaller: Long, dwreserved: Int, clrreserved: Int, riid: Long, ppvret: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleLockRunning(punknown: Long, flock: Int, flastunlockcloses: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleMetafilePictFromIconAndLabel(hicon: Long, lpszlabel: Long, lpszsourcefile: Long, iiconindex: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleNoteObjectVisible(punknown: Long, fvisible: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleQueryCreateFromData(psrcdataobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleQueryLinkFromData(psrcdataobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleRegEnumFormatEtc(clsid: Long, dwdirection: Int, ppenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleRegEnumVerbs(clsid: Long, ppenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleRegGetMiscStatus(clsid: Long, dwaspect: Int, pdwstatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleRegGetUserType(clsid: Long, dwformoftype: Int, pszusertype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleRun(punknown: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleSave(pps: Long, pstg: Long, fsameasload: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleSavePictureFile(lpdisppicture: Long, bstrfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleSaveToStream(ppstm: Long, pstm: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleSetAutoConvert(clsidold: Long, clsidnew: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleSetClipboard(pdataobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleSetContainedObject(punknown: Long, fcontained: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleSetMenuDescriptor(holemenu: Long, hwndframe: Long, hwndactiveobject: Long, lpframe: Long, lpactiveobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleTranslateAccelerator(lpframe: Long, lpframeinfo: Long, lpmsg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleTranslateColor(clr: Int, hpal: Long, lpcolorref: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleUIAddVerbMenuA(lpoleobj: Long, lpszshorttype: Long, hmenu: Long, upos: Int, uidverbmin: Int, uidverbmax: Int, baddconvert: Int, idconvert: Int, lphmenu: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleUIAddVerbMenuW(lpoleobj: Long, lpszshorttype: Long, hmenu: Long, upos: Int, uidverbmin: Int, uidverbmax: Int, baddconvert: Int, idconvert: Int, lphmenu: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleUIBusyA(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleUIBusyW(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleUICanConvertOrActivateAs(rclsid: Long, fislinkedobject: Int, wformat: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleUIChangeIconA(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleUIChangeIconW(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleUIChangeSourceA(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleUIChangeSourceW(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleUIConvertA(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleUIConvertW(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleUIEditLinksA(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleUIEditLinksW(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleUIInsertObjectA(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleUIInsertObjectW(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleUIObjectPropertiesA(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleUIObjectPropertiesW(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleUIPasteSpecialA(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleUIPasteSpecialW(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleUIPromptUserA(ntemplate: Int, hwndparent: Long, km_vac: Int, km_va0: Long, km_va1: Long, km_va2: Long, km_va3: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleUIPromptUserW(ntemplate: Int, hwndparent: Long, km_vac: Int, km_va0: Long, km_va1: Long, km_va2: Long, km_va3: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleUIUpdateLinksA(lpoleuilinkcntr: Long, hwndparent: Long, lpsztitle: Long, clinks: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleUIUpdateLinksW(lpoleuilinkcntr: Long, hwndparent: Long, lpsztitle: Long, clinks: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_oleUninitialize()

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_queryPathOfRegTypeLib(guid: Long, wmaj: Short, wmin: Short, lcid: Int, lpbstrpathname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_registerActiveObject(punk: Long, rclsid: Long, dwflags: Int, pdwregister: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_registerDragDrop(hwnd: Long, pdroptarget: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_registerTypeLib(ptlib: Long, szfullpath: Long, szhelpdir: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_registerTypeLibForUser(ptlib: Long, szfullpath: Long, szhelpdir: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_releaseStgMedium(param0: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_revokeActiveObject(dwregister: Int, pvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_revokeDragDrop(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_safeArrayAccessData(psa: Long, ppvdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_safeArrayAddRef(psa: Long, ppdatatorelease: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_safeArrayAllocData(psa: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_safeArrayAllocDescriptor(cdims: Int, ppsaout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_safeArrayAllocDescriptorEx(vt: Short, cdims: Int, ppsaout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_safeArrayCopy(psa: Long, ppsaout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_safeArrayCopyData(psasource: Long, psatarget: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_safeArrayCreate(vt: Short, cdims: Int, rgsabound: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_safeArrayCreateEx(vt: Short, cdims: Int, rgsabound: Long, pvextra: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_safeArrayCreateVector(vt: Short, llbound: Int, celements: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_safeArrayCreateVectorEx(vt: Short, llbound: Int, celements: Int, pvextra: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_safeArrayDestroy(psa: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_safeArrayDestroyData(psa: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_safeArrayDestroyDescriptor(psa: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_safeArrayGetDim(psa: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_safeArrayGetElement(psa: Long, rgindices: Long, pv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_safeArrayGetElemsize(psa: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_safeArrayGetIID(psa: Long, pguid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_safeArrayGetLBound(psa: Long, ndim: Int, pllbound: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_safeArrayGetRecordInfo(psa: Long, prinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_safeArrayGetUBound(psa: Long, ndim: Int, plubound: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_safeArrayGetVartype(psa: Long, pvt: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_safeArrayLock(psa: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_safeArrayPtrOfIndex(psa: Long, rgindices: Long, ppvdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_safeArrayPutElement(psa: Long, rgindices: Long, pv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_safeArrayRedim(psa: Long, psaboundnew: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_safeArrayReleaseData(pdata: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_safeArrayReleaseDescriptor(psa: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_safeArraySetIID(psa: Long, guid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_safeArraySetRecordInfo(psa: Long, prinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_safeArrayUnaccessData(psa: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_safeArrayUnlock(psa: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_unRegisterTypeLib(libid: Long, wvermajor: Short, wverminor: Short, lcid: Int, syskind: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_unRegisterTypeLibForUser(libid: Long, wmajorvernum: Short, wminorvernum: Short, lcid: Int, syskind: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varAbs(pvarin: Long, pvarresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varAdd(pvarleft: Long, pvarright: Long, pvarresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varAnd(pvarleft: Long, pvarright: Long, pvarresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varBoolFromDate(datein: Double, pboolout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varBoolFromDec(pdecin: Long, pboolout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varBoolFromDisp(pdispin: Long, lcid: Int, pboolout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varBoolFromI1(cin: Byte, pboolout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varBoolFromI2(sin: Short, pboolout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varBoolFromI4(lin: Int, pboolout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varBoolFromI8(i64in: Long, pboolout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varBoolFromR4(fltin: Float, pboolout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varBoolFromR8(dblin: Double, pboolout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varBoolFromStr(strin: Long, lcid: Int, dwflags: Int, pboolout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varBoolFromUI1(bin: Byte, pboolout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varBoolFromUI2(uiin: Short, pboolout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varBoolFromUI4(ulin: Int, pboolout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varBoolFromUI8(i64in: Long, pboolout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varBstrCat(bstrleft: Long, bstrright: Long, pbstrresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varBstrCmp(bstrleft: Long, bstrright: Long, lcid: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varBstrFromBool(boolin: Short, lcid: Int, dwflags: Int, pbstrout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varBstrFromDate(datein: Double, lcid: Int, dwflags: Int, pbstrout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varBstrFromDec(pdecin: Long, lcid: Int, dwflags: Int, pbstrout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varBstrFromDisp(pdispin: Long, lcid: Int, dwflags: Int, pbstrout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varBstrFromI1(cin: Byte, lcid: Int, dwflags: Int, pbstrout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varBstrFromI2(ival: Short, lcid: Int, dwflags: Int, pbstrout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varBstrFromI4(lin: Int, lcid: Int, dwflags: Int, pbstrout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varBstrFromI8(i64in: Long, lcid: Int, dwflags: Int, pbstrout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varBstrFromR4(fltin: Float, lcid: Int, dwflags: Int, pbstrout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varBstrFromR8(dblin: Double, lcid: Int, dwflags: Int, pbstrout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varBstrFromUI1(bval: Byte, lcid: Int, dwflags: Int, pbstrout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varBstrFromUI2(uiin: Short, lcid: Int, dwflags: Int, pbstrout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varBstrFromUI4(ulin: Int, lcid: Int, dwflags: Int, pbstrout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varBstrFromUI8(ui64in: Long, lcid: Int, dwflags: Int, pbstrout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varCat(pvarleft: Long, pvarright: Long, pvarresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varCmp(pvarleft: Long, pvarright: Long, lcid: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varCyFromBool(boolin: Short, pcyout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varCyFromDate(datein: Double, pcyout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varCyFromDec(pdecin: Long, pcyout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varCyFromDisp(pdispin: Long, lcid: Int, pcyout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varCyFromI1(cin: Byte, pcyout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varCyFromI2(sin: Short, pcyout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varCyFromI4(lin: Int, pcyout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varCyFromI8(i64in: Long, pcyout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varCyFromR4(fltin: Float, pcyout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varCyFromR8(dblin: Double, pcyout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varCyFromStr(strin: Long, lcid: Int, dwflags: Int, pcyout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varCyFromUI1(bin: Byte, pcyout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varCyFromUI2(uiin: Short, pcyout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varCyFromUI4(ulin: Int, pcyout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varCyFromUI8(ui64in: Long, pcyout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varDateFromBool(boolin: Short, pdateout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varDateFromDec(pdecin: Long, pdateout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varDateFromDisp(pdispin: Long, lcid: Int, pdateout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varDateFromI1(cin: Byte, pdateout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varDateFromI2(sin: Short, pdateout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varDateFromI4(lin: Int, pdateout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varDateFromI8(i64in: Long, pdateout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varDateFromR4(fltin: Float, pdateout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varDateFromR8(dblin: Double, pdateout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varDateFromStr(strin: Long, lcid: Int, dwflags: Int, pdateout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varDateFromUI1(bin: Byte, pdateout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varDateFromUI2(uiin: Short, pdateout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varDateFromUI4(ulin: Int, pdateout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varDateFromUI8(ui64in: Long, pdateout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varDateFromUdate(pudatein: Long, dwflags: Int, pdateout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varDateFromUdateEx(pudatein: Long, lcid: Int, dwflags: Int, pdateout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varDecAbs(pdecin: Long, pdecresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varDecAdd(pdecleft: Long, pdecright: Long, pdecresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varDecCmp(pdecleft: Long, pdecright: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varDecCmpR8(pdecleft: Long, dblright: Double): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varDecDiv(pdecleft: Long, pdecright: Long, pdecresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varDecFix(pdecin: Long, pdecresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varDecFromBool(boolin: Short, pdecout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varDecFromDate(datein: Double, pdecout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varDecFromDisp(pdispin: Long, lcid: Int, pdecout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varDecFromI1(cin: Byte, pdecout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varDecFromI2(uiin: Short, pdecout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varDecFromI4(lin: Int, pdecout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varDecFromI8(i64in: Long, pdecout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varDecFromR4(fltin: Float, pdecout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varDecFromR8(dblin: Double, pdecout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varDecFromStr(strin: Long, lcid: Int, dwflags: Int, pdecout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varDecFromUI1(bin: Byte, pdecout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varDecFromUI2(uiin: Short, pdecout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varDecFromUI4(ulin: Int, pdecout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varDecFromUI8(ui64in: Long, pdecout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varDecInt(pdecin: Long, pdecresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varDecMul(pdecleft: Long, pdecright: Long, pdecresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varDecNeg(pdecin: Long, pdecresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varDecRound(pdecin: Long, cdecimals: Int, pdecresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varDecSub(pdecleft: Long, pdecright: Long, pdecresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varDiv(pvarleft: Long, pvarright: Long, pvarresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varEqv(pvarleft: Long, pvarright: Long, pvarresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varFix(pvarin: Long, pvarresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varFormat(pvarin: Long, pstrformat: Long, ifirstday: Int, ifirstweek: Int, dwflags: Int, pbstrout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varFormatCurrency(pvarin: Long, inumdig: Int, iinclead: Int, iuseparens: Int, igroup: Int, dwflags: Int, pbstrout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varFormatDateTime(pvarin: Long, inamedformat: Int, dwflags: Int, pbstrout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varFormatFromTokens(pvarin: Long, pstrformat: Long, pbtokcur: Long, dwflags: Int, pbstrout: Long, lcid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varFormatNumber(pvarin: Long, inumdig: Int, iinclead: Int, iuseparens: Int, igroup: Int, dwflags: Int, pbstrout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varFormatPercent(pvarin: Long, inumdig: Int, iinclead: Int, iuseparens: Int, igroup: Int, dwflags: Int, pbstrout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varI1FromBool(boolin: Short, pcout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varI1FromDate(datein: Double, pcout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varI1FromDec(pdecin: Long, pcout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varI1FromDisp(pdispin: Long, lcid: Int, pcout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varI1FromI2(uiin: Short, pcout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varI1FromI4(lin: Int, pcout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varI1FromI8(i64in: Long, pcout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varI1FromR4(fltin: Float, pcout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varI1FromR8(dblin: Double, pcout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varI1FromStr(strin: Long, lcid: Int, dwflags: Int, pcout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varI1FromUI1(bin: Byte, pcout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varI1FromUI2(uiin: Short, pcout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varI1FromUI4(ulin: Int, pcout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varI1FromUI8(i64in: Long, pcout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varI2FromBool(boolin: Short, psout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varI2FromDate(datein: Double, psout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varI2FromDec(pdecin: Long, psout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varI2FromDisp(pdispin: Long, lcid: Int, psout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varI2FromI1(cin: Byte, psout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varI2FromI4(lin: Int, psout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varI2FromI8(i64in: Long, psout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varI2FromR4(fltin: Float, psout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varI2FromR8(dblin: Double, psout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varI2FromStr(strin: Long, lcid: Int, dwflags: Int, psout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varI2FromUI1(bin: Byte, psout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varI2FromUI2(uiin: Short, psout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varI2FromUI4(ulin: Int, psout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varI2FromUI8(ui64in: Long, psout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varI4FromBool(boolin: Short, plout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varI4FromDate(datein: Double, plout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varI4FromDec(pdecin: Long, plout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varI4FromDisp(pdispin: Long, lcid: Int, plout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varI4FromI1(cin: Byte, plout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varI4FromI2(sin: Short, plout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varI4FromI8(i64in: Long, plout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varI4FromR4(fltin: Float, plout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varI4FromR8(dblin: Double, plout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varI4FromStr(strin: Long, lcid: Int, dwflags: Int, plout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varI4FromUI1(bin: Byte, plout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varI4FromUI2(uiin: Short, plout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varI4FromUI4(ulin: Int, plout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varI4FromUI8(ui64in: Long, plout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varI8FromBool(boolin: Short, pi64out: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varI8FromDate(datein: Double, pi64out: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varI8FromDec(pdecin: Long, pi64out: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varI8FromDisp(pdispin: Long, lcid: Int, pi64out: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varI8FromI1(cin: Byte, pi64out: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varI8FromI2(sin: Short, pi64out: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varI8FromR4(fltin: Float, pi64out: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varI8FromR8(dblin: Double, pi64out: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varI8FromStr(strin: Long, lcid: Int, dwflags: Int, pi64out: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varI8FromUI1(bin: Byte, pi64out: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varI8FromUI2(uiin: Short, pi64out: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varI8FromUI4(ulin: Int, pi64out: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varI8FromUI8(ui64in: Long, pi64out: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varIdiv(pvarleft: Long, pvarright: Long, pvarresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varImp(pvarleft: Long, pvarright: Long, pvarresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varInt(pvarin: Long, pvarresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varMod(pvarleft: Long, pvarright: Long, pvarresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varMonthName(imonth: Int, fabbrev: Int, dwflags: Int, pbstrout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varMul(pvarleft: Long, pvarright: Long, pvarresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varNeg(pvarin: Long, pvarresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varNot(pvarin: Long, pvarresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varNumFromParseNum(pnumprs: Long, rgbdig: Long, dwvtbits: Int, pvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varOr(pvarleft: Long, pvarright: Long, pvarresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varParseNumFromStr(strin: Long, lcid: Int, dwflags: Int, pnumprs: Long, rgbdig: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varPow(pvarleft: Long, pvarright: Long, pvarresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varR4CmpR8(fltleft: Float, dblright: Double): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varR4FromBool(boolin: Short, pfltout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varR4FromDate(datein: Double, pfltout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varR4FromDec(pdecin: Long, pfltout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varR4FromDisp(pdispin: Long, lcid: Int, pfltout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varR4FromI1(cin: Byte, pfltout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varR4FromI2(sin: Short, pfltout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varR4FromI4(lin: Int, pfltout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varR4FromI8(i64in: Long, pfltout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varR4FromR8(dblin: Double, pfltout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varR4FromStr(strin: Long, lcid: Int, dwflags: Int, pfltout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varR4FromUI1(bin: Byte, pfltout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varR4FromUI2(uiin: Short, pfltout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varR4FromUI4(ulin: Int, pfltout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varR4FromUI8(ui64in: Long, pfltout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varR8FromBool(boolin: Short, pdblout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varR8FromDate(datein: Double, pdblout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varR8FromDec(pdecin: Long, pdblout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varR8FromDisp(pdispin: Long, lcid: Int, pdblout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varR8FromI1(cin: Byte, pdblout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varR8FromI2(sin: Short, pdblout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varR8FromI4(lin: Int, pdblout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varR8FromI8(i64in: Long, pdblout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varR8FromR4(fltin: Float, pdblout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varR8FromStr(strin: Long, lcid: Int, dwflags: Int, pdblout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varR8FromUI1(bin: Byte, pdblout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varR8FromUI2(uiin: Short, pdblout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varR8FromUI4(ulin: Int, pdblout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varR8FromUI8(ui64in: Long, pdblout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varR8Pow(dblleft: Double, dblright: Double, pdblresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varR8Round(dblin: Double, cdecimals: Int, pdblresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varRound(pvarin: Long, cdecimals: Int, pvarresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varSub(pvarleft: Long, pvarright: Long, pvarresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varTokenizeFormatString(pstrformat: Long, rgbtok: Long, cbtok: Int, ifirstday: Int, ifirstweek: Int, lcid: Int, pcbactual: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varUI1FromBool(boolin: Short, pbout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varUI1FromDate(datein: Double, pbout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varUI1FromDec(pdecin: Long, pbout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varUI1FromDisp(pdispin: Long, lcid: Int, pbout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varUI1FromI1(cin: Byte, pbout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varUI1FromI2(sin: Short, pbout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varUI1FromI4(lin: Int, pbout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varUI1FromI8(i64in: Long, pbout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varUI1FromR4(fltin: Float, pbout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varUI1FromR8(dblin: Double, pbout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varUI1FromStr(strin: Long, lcid: Int, dwflags: Int, pbout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varUI1FromUI2(uiin: Short, pbout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varUI1FromUI4(ulin: Int, pbout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varUI1FromUI8(ui64in: Long, pbout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varUI2FromBool(boolin: Short, puiout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varUI2FromDate(datein: Double, puiout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varUI2FromDec(pdecin: Long, puiout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varUI2FromDisp(pdispin: Long, lcid: Int, puiout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varUI2FromI1(cin: Byte, puiout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varUI2FromI2(uiin: Short, puiout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varUI2FromI4(lin: Int, puiout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varUI2FromI8(i64in: Long, puiout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varUI2FromR4(fltin: Float, puiout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varUI2FromR8(dblin: Double, puiout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varUI2FromStr(strin: Long, lcid: Int, dwflags: Int, puiout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varUI2FromUI1(bin: Byte, puiout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varUI2FromUI4(ulin: Int, puiout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varUI2FromUI8(i64in: Long, puiout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varUI4FromBool(boolin: Short, pulout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varUI4FromDate(datein: Double, pulout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varUI4FromDec(pdecin: Long, pulout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varUI4FromDisp(pdispin: Long, lcid: Int, pulout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varUI4FromI1(cin: Byte, pulout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varUI4FromI2(uiin: Short, pulout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varUI4FromI4(lin: Int, pulout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varUI4FromI8(i64in: Long, plout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varUI4FromR4(fltin: Float, pulout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varUI4FromR8(dblin: Double, pulout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varUI4FromStr(strin: Long, lcid: Int, dwflags: Int, pulout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varUI4FromUI1(bin: Byte, pulout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varUI4FromUI2(uiin: Short, pulout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varUI4FromUI8(ui64in: Long, plout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varUI8FromBool(boolin: Short, pi64out: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varUI8FromDate(datein: Double, pi64out: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varUI8FromDec(pdecin: Long, pi64out: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varUI8FromDisp(pdispin: Long, lcid: Int, pi64out: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varUI8FromI1(cin: Byte, pi64out: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varUI8FromI2(sin: Short, pi64out: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varUI8FromI8(ui64in: Long, pi64out: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varUI8FromR4(fltin: Float, pi64out: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varUI8FromR8(dblin: Double, pi64out: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varUI8FromStr(strin: Long, lcid: Int, dwflags: Int, pi64out: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varUI8FromUI1(bin: Byte, pi64out: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varUI8FromUI2(uiin: Short, pi64out: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varUI8FromUI4(ulin: Int, pi64out: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varUdateFromDate(datein: Double, dwflags: Int, pudateout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varWeekdayName(iweekday: Int, fabbrev: Int, ifirstday: Int, dwflags: Int, pbstrout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_varXor(pvarleft: Long, pvarright: Long, pvarresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_vectorFromBstr(bstr: Long, ppsa: Long): Int
}

public actual fun bstrFromVector(psa: COpaquePointer?, pbstr: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_bstrFromVector((psa?.value ?: 0L), (pbstr?.value ?: 0L))

public actual fun clearCustData(pcustdata: COpaquePointer?) {
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_clearCustData((pcustdata?.value ?: 0L))
}

public actual fun createDispTypeInfo(pidata: COpaquePointer?, lcid: UInt, pptinfo: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_createDispTypeInfo((pidata?.value ?: 0L), lcid.toInt(), (pptinfo?.value ?: 0L))

public actual fun createErrorInfo(pperrinfo: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_createErrorInfo((pperrinfo?.value ?: 0L))

public actual fun createOleAdviseHolder(ppoaholder: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_createOleAdviseHolder((ppoaholder?.value ?: 0L))

public actual fun createStdDispatch(punkouter: COpaquePointer?, pvthis: COpaquePointer?, ptinfo: COpaquePointer?, ppunkstddisp: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_createStdDispatch((punkouter?.value ?: 0L), (pvthis?.value ?: 0L), (ptinfo?.value ?: 0L), (ppunkstddisp?.value ?: 0L))

public actual fun createTypeLib(syskind: Syskind, szfile: Pcwstr, ppctlib: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_createTypeLib(syskind, (szfile?.value ?: 0L), (ppctlib?.value ?: 0L))

public actual fun createTypeLib2(syskind: Syskind, szfile: Pcwstr, ppctlib: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_createTypeLib2(syskind, (szfile?.value ?: 0L), (ppctlib?.value ?: 0L))

public actual fun dispCallFunc(pvinstance: COpaquePointer?, ovft: ULong, cc: Callconv, vtreturn: Varenum, cactuals: UInt, prgvt: COpaquePointer?, prgpvarg: COpaquePointer?, pvargresult: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_dispCallFunc((pvinstance?.value ?: 0L), ovft.toLong(), cc, vtreturn.toShort(), cactuals.toInt(), (prgvt?.value ?: 0L), (prgpvarg?.value ?: 0L), (pvargresult?.value ?: 0L))

public actual fun dispGetIDsOfNames(ptinfo: COpaquePointer?, rgsznames: COpaquePointer?, cnames: UInt, rgdispid: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_dispGetIDsOfNames((ptinfo?.value ?: 0L), (rgsznames?.value ?: 0L), cnames.toInt(), (rgdispid?.value ?: 0L))

public actual fun dispGetParam(pdispparams: COpaquePointer?, position: UInt, vttarg: Varenum, pvarresult: COpaquePointer?, puargerr: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_dispGetParam((pdispparams?.value ?: 0L), position.toInt(), vttarg.toShort(), (pvarresult?.value ?: 0L), (puargerr?.value ?: 0L))

public actual fun dispInvoke(thisRef: COpaquePointer?, ptinfo: COpaquePointer?, dispidmember: Int, wflags: UShort, pparams: COpaquePointer?, pvarresult: COpaquePointer?, pexcepinfo: COpaquePointer?, puargerr: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_dispInvoke((thisRef?.value ?: 0L), (ptinfo?.value ?: 0L), dispidmember, wflags.toShort(), (pparams?.value ?: 0L), (pvarresult?.value ?: 0L), (pexcepinfo?.value ?: 0L), (puargerr?.value ?: 0L))

public actual fun doDragDrop(pdataobj: COpaquePointer?, pdropsource: COpaquePointer?, dwokeffects: Dropeffect, pdweffect: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_doDragDrop((pdataobj?.value ?: 0L), (pdropsource?.value ?: 0L), dwokeffects.toInt(), (pdweffect?.value ?: 0L))

public actual fun getActiveObject(rclsid: COpaquePointer?, pvreserved: COpaquePointer?, ppunk: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_getActiveObject((rclsid?.value ?: 0L), (pvreserved?.value ?: 0L), (ppunk?.value ?: 0L))

public actual fun getAltMonthNames(lcid: UInt, prgp: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_getAltMonthNames(lcid.toInt(), (prgp?.value ?: 0L))

public actual fun getRecordInfoFromGuids(rguidtypelib: COpaquePointer?, uvermajor: UInt, uverminor: UInt, lcid: UInt, rguidtypeinfo: COpaquePointer?, pprecinfo: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_getRecordInfoFromGuids((rguidtypelib?.value ?: 0L), uvermajor.toInt(), uverminor.toInt(), lcid.toInt(), (rguidtypeinfo?.value ?: 0L), (pprecinfo?.value ?: 0L))

public actual fun getRecordInfoFromTypeInfo(ptypeinfo: COpaquePointer?, pprecinfo: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_getRecordInfoFromTypeInfo((ptypeinfo?.value ?: 0L), (pprecinfo?.value ?: 0L))

public actual fun hrgnUserFree(param0: COpaquePointer?, param1: COpaquePointer?) {
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_hrgnUserFree((param0?.value ?: 0L), (param1?.value ?: 0L))
}

public actual fun hrgnUserFree64(param0: COpaquePointer?, param1: COpaquePointer?) {
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_hrgnUserFree64((param0?.value ?: 0L), (param1?.value ?: 0L))
}

public actual fun hrgnUserMarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_hrgnUserMarshal((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun hrgnUserMarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_hrgnUserMarshal64((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun hrgnUserSize(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_hrgnUserSize((param0?.value ?: 0L), param1.toInt(), (param2?.value ?: 0L)).toUInt()

public actual fun hrgnUserSize64(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_hrgnUserSize64((param0?.value ?: 0L), param1.toInt(), (param2?.value ?: 0L)).toUInt()

public actual fun hrgnUserUnmarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_hrgnUserUnmarshal((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun hrgnUserUnmarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_hrgnUserUnmarshal64((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun isAccelerator(haccel: Haccel, caccelentries: Int, lpmsg: COpaquePointer?, lpwcmd: COpaquePointer?): Bool =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_isAccelerator((haccel?.value ?: 0L), caccelentries, (lpmsg?.value ?: 0L), (lpwcmd?.value ?: 0L))

public actual fun lHashValOfNameSys(syskind: Syskind, lcid: UInt, szname: Pcwstr): UInt =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_lHashValOfNameSys(syskind, lcid.toInt(), (szname?.value ?: 0L)).toUInt()

public actual fun lHashValOfNameSysA(syskind: Syskind, lcid: UInt, szname: Pcstr): UInt =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_lHashValOfNameSysA(syskind, lcid.toInt(), (szname?.value ?: 0L)).toUInt()

public actual fun loadRegTypeLib(rguid: COpaquePointer?, wvermajor: UShort, wverminor: UShort, lcid: UInt, pptlib: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_loadRegTypeLib((rguid?.value ?: 0L), wvermajor.toShort(), wverminor.toShort(), lcid.toInt(), (pptlib?.value ?: 0L))

public actual fun loadTypeLib(szfile: Pcwstr, pptlib: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_loadTypeLib((szfile?.value ?: 0L), (pptlib?.value ?: 0L))

public actual fun loadTypeLibEx(szfile: Pcwstr, regkind: Regkind, pptlib: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_loadTypeLibEx((szfile?.value ?: 0L), regkind, (pptlib?.value ?: 0L))

public actual fun oaBuildVersion(): UInt =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oaBuildVersion().toUInt()

public actual fun oaEnablePerUserTLibRegistration() {
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oaEnablePerUserTLibRegistration()
}

public actual fun oleBuildVersion(): UInt =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleBuildVersion().toUInt()

public actual fun oleConvertOLESTREAMToIStorage2(lpolestream: COpaquePointer?, pstg: COpaquePointer?, ptd: COpaquePointer?, opt: UInt, pvcallbackcontext: COpaquePointer?, pqueryconvertolelinkcallback: Olestreamqueryconvertolelinkcallback): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleConvertOLESTREAMToIStorage2((lpolestream?.value ?: 0L), (pstg?.value ?: 0L), (ptd?.value ?: 0L), opt.toInt(), (pvcallbackcontext?.value ?: 0L), 0L)

public actual fun oleConvertOLESTREAMToIStorageEx2(polestm: COpaquePointer?, pstg: COpaquePointer?, pcfformat: COpaquePointer?, plwwidth: COpaquePointer?, plheight: COpaquePointer?, pdwsize: COpaquePointer?, pmedium: COpaquePointer?, opt: UInt, pvcallbackcontext: COpaquePointer?, pqueryconvertolelinkcallback: Olestreamqueryconvertolelinkcallback): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleConvertOLESTREAMToIStorageEx2((polestm?.value ?: 0L), (pstg?.value ?: 0L), (pcfformat?.value ?: 0L), (plwwidth?.value ?: 0L), (plheight?.value ?: 0L), (pdwsize?.value ?: 0L), (pmedium?.value ?: 0L), opt.toInt(), (pvcallbackcontext?.value ?: 0L), 0L)

public actual fun oleCreate(rclsid: COpaquePointer?, riid: COpaquePointer?, renderopt: UInt, pformatetc: COpaquePointer?, pclientsite: COpaquePointer?, pstg: COpaquePointer?, ppvobj: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleCreate((rclsid?.value ?: 0L), (riid?.value ?: 0L), renderopt.toInt(), (pformatetc?.value ?: 0L), (pclientsite?.value ?: 0L), (pstg?.value ?: 0L), (ppvobj?.value ?: 0L))

public actual fun oleCreateDefaultHandler(clsid: COpaquePointer?, punkouter: COpaquePointer?, riid: COpaquePointer?, lplpobj: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleCreateDefaultHandler((clsid?.value ?: 0L), (punkouter?.value ?: 0L), (riid?.value ?: 0L), (lplpobj?.value ?: 0L))

public actual fun oleCreateEmbeddingHelper(clsid: COpaquePointer?, punkouter: COpaquePointer?, flags: EmbdhlpFlags, pcf: COpaquePointer?, riid: COpaquePointer?, lplpobj: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleCreateEmbeddingHelper((clsid?.value ?: 0L), (punkouter?.value ?: 0L), flags.toInt(), (pcf?.value ?: 0L), (riid?.value ?: 0L), (lplpobj?.value ?: 0L))

public actual fun oleCreateEx(rclsid: COpaquePointer?, riid: COpaquePointer?, dwflags: Olecreate, renderopt: UInt, cformats: UInt, rgadvf: COpaquePointer?, rgformatetc: COpaquePointer?, lpadvisesink: COpaquePointer?, rgdwconnection: COpaquePointer?, pclientsite: COpaquePointer?, pstg: COpaquePointer?, ppvobj: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleCreateEx((rclsid?.value ?: 0L), (riid?.value ?: 0L), dwflags.toInt(), renderopt.toInt(), cformats.toInt(), (rgadvf?.value ?: 0L), (rgformatetc?.value ?: 0L), (lpadvisesink?.value ?: 0L), (rgdwconnection?.value ?: 0L), (pclientsite?.value ?: 0L), (pstg?.value ?: 0L), (ppvobj?.value ?: 0L))

public actual fun oleCreateFontIndirect(lpfontdesc: COpaquePointer?, riid: COpaquePointer?, lplpvobj: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleCreateFontIndirect((lpfontdesc?.value ?: 0L), (riid?.value ?: 0L), (lplpvobj?.value ?: 0L))

public actual fun oleCreateFromData(psrcdataobj: COpaquePointer?, riid: COpaquePointer?, renderopt: UInt, pformatetc: COpaquePointer?, pclientsite: COpaquePointer?, pstg: COpaquePointer?, ppvobj: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleCreateFromData((psrcdataobj?.value ?: 0L), (riid?.value ?: 0L), renderopt.toInt(), (pformatetc?.value ?: 0L), (pclientsite?.value ?: 0L), (pstg?.value ?: 0L), (ppvobj?.value ?: 0L))

public actual fun oleCreateFromDataEx(psrcdataobj: COpaquePointer?, riid: COpaquePointer?, dwflags: Olecreate, renderopt: UInt, cformats: UInt, rgadvf: COpaquePointer?, rgformatetc: COpaquePointer?, lpadvisesink: COpaquePointer?, rgdwconnection: COpaquePointer?, pclientsite: COpaquePointer?, pstg: COpaquePointer?, ppvobj: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleCreateFromDataEx((psrcdataobj?.value ?: 0L), (riid?.value ?: 0L), dwflags.toInt(), renderopt.toInt(), cformats.toInt(), (rgadvf?.value ?: 0L), (rgformatetc?.value ?: 0L), (lpadvisesink?.value ?: 0L), (rgdwconnection?.value ?: 0L), (pclientsite?.value ?: 0L), (pstg?.value ?: 0L), (ppvobj?.value ?: 0L))

public actual fun oleCreateFromFile(rclsid: COpaquePointer?, lpszfilename: Pcwstr, riid: COpaquePointer?, renderopt: UInt, lpformatetc: COpaquePointer?, pclientsite: COpaquePointer?, pstg: COpaquePointer?, ppvobj: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleCreateFromFile((rclsid?.value ?: 0L), (lpszfilename?.value ?: 0L), (riid?.value ?: 0L), renderopt.toInt(), (lpformatetc?.value ?: 0L), (pclientsite?.value ?: 0L), (pstg?.value ?: 0L), (ppvobj?.value ?: 0L))

public actual fun oleCreateFromFileEx(rclsid: COpaquePointer?, lpszfilename: Pcwstr, riid: COpaquePointer?, dwflags: Olecreate, renderopt: UInt, cformats: UInt, rgadvf: COpaquePointer?, rgformatetc: COpaquePointer?, lpadvisesink: COpaquePointer?, rgdwconnection: COpaquePointer?, pclientsite: COpaquePointer?, pstg: COpaquePointer?, ppvobj: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleCreateFromFileEx((rclsid?.value ?: 0L), (lpszfilename?.value ?: 0L), (riid?.value ?: 0L), dwflags.toInt(), renderopt.toInt(), cformats.toInt(), (rgadvf?.value ?: 0L), (rgformatetc?.value ?: 0L), (lpadvisesink?.value ?: 0L), (rgdwconnection?.value ?: 0L), (pclientsite?.value ?: 0L), (pstg?.value ?: 0L), (ppvobj?.value ?: 0L))

public actual fun oleCreateLink(pmklinksrc: COpaquePointer?, riid: COpaquePointer?, renderopt: UInt, lpformatetc: COpaquePointer?, pclientsite: COpaquePointer?, pstg: COpaquePointer?, ppvobj: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleCreateLink((pmklinksrc?.value ?: 0L), (riid?.value ?: 0L), renderopt.toInt(), (lpformatetc?.value ?: 0L), (pclientsite?.value ?: 0L), (pstg?.value ?: 0L), (ppvobj?.value ?: 0L))

public actual fun oleCreateLinkEx(pmklinksrc: COpaquePointer?, riid: COpaquePointer?, dwflags: Olecreate, renderopt: UInt, cformats: UInt, rgadvf: COpaquePointer?, rgformatetc: COpaquePointer?, lpadvisesink: COpaquePointer?, rgdwconnection: COpaquePointer?, pclientsite: COpaquePointer?, pstg: COpaquePointer?, ppvobj: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleCreateLinkEx((pmklinksrc?.value ?: 0L), (riid?.value ?: 0L), dwflags.toInt(), renderopt.toInt(), cformats.toInt(), (rgadvf?.value ?: 0L), (rgformatetc?.value ?: 0L), (lpadvisesink?.value ?: 0L), (rgdwconnection?.value ?: 0L), (pclientsite?.value ?: 0L), (pstg?.value ?: 0L), (ppvobj?.value ?: 0L))

public actual fun oleCreateLinkFromData(psrcdataobj: COpaquePointer?, riid: COpaquePointer?, renderopt: UInt, pformatetc: COpaquePointer?, pclientsite: COpaquePointer?, pstg: COpaquePointer?, ppvobj: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleCreateLinkFromData((psrcdataobj?.value ?: 0L), (riid?.value ?: 0L), renderopt.toInt(), (pformatetc?.value ?: 0L), (pclientsite?.value ?: 0L), (pstg?.value ?: 0L), (ppvobj?.value ?: 0L))

public actual fun oleCreateLinkFromDataEx(psrcdataobj: COpaquePointer?, riid: COpaquePointer?, dwflags: Olecreate, renderopt: UInt, cformats: UInt, rgadvf: COpaquePointer?, rgformatetc: COpaquePointer?, lpadvisesink: COpaquePointer?, rgdwconnection: COpaquePointer?, pclientsite: COpaquePointer?, pstg: COpaquePointer?, ppvobj: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleCreateLinkFromDataEx((psrcdataobj?.value ?: 0L), (riid?.value ?: 0L), dwflags.toInt(), renderopt.toInt(), cformats.toInt(), (rgadvf?.value ?: 0L), (rgformatetc?.value ?: 0L), (lpadvisesink?.value ?: 0L), (rgdwconnection?.value ?: 0L), (pclientsite?.value ?: 0L), (pstg?.value ?: 0L), (ppvobj?.value ?: 0L))

public actual fun oleCreateLinkToFile(lpszfilename: Pcwstr, riid: COpaquePointer?, renderopt: UInt, lpformatetc: COpaquePointer?, pclientsite: COpaquePointer?, pstg: COpaquePointer?, ppvobj: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleCreateLinkToFile((lpszfilename?.value ?: 0L), (riid?.value ?: 0L), renderopt.toInt(), (lpformatetc?.value ?: 0L), (pclientsite?.value ?: 0L), (pstg?.value ?: 0L), (ppvobj?.value ?: 0L))

public actual fun oleCreateLinkToFileEx(lpszfilename: Pcwstr, riid: COpaquePointer?, dwflags: Olecreate, renderopt: UInt, cformats: UInt, rgadvf: COpaquePointer?, rgformatetc: COpaquePointer?, lpadvisesink: COpaquePointer?, rgdwconnection: COpaquePointer?, pclientsite: COpaquePointer?, pstg: COpaquePointer?, ppvobj: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleCreateLinkToFileEx((lpszfilename?.value ?: 0L), (riid?.value ?: 0L), dwflags.toInt(), renderopt.toInt(), cformats.toInt(), (rgadvf?.value ?: 0L), (rgformatetc?.value ?: 0L), (lpadvisesink?.value ?: 0L), (rgdwconnection?.value ?: 0L), (pclientsite?.value ?: 0L), (pstg?.value ?: 0L), (ppvobj?.value ?: 0L))

public actual fun oleCreateMenuDescriptor(hmenucombined: Hmenu, lpmenuwidths: COpaquePointer?): Long =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleCreateMenuDescriptor((hmenucombined?.value ?: 0L), (lpmenuwidths?.value ?: 0L))

public actual fun oleCreatePictureIndirect(lppictdesc: COpaquePointer?, riid: COpaquePointer?, fown: Bool, lplpvobj: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleCreatePictureIndirect((lppictdesc?.value ?: 0L), (riid?.value ?: 0L), fown, (lplpvobj?.value ?: 0L))

public actual fun oleCreatePropertyFrame(hwndowner: Hwnd, x: UInt, y: UInt, lpszcaption: Pcwstr, cobjects: UInt, ppunk: COpaquePointer?, cpages: UInt, ppageclsid: COpaquePointer?, lcid: UInt, dwreserved: UInt, pvreserved: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleCreatePropertyFrame((hwndowner?.value ?: 0L), x.toInt(), y.toInt(), (lpszcaption?.value ?: 0L), cobjects.toInt(), (ppunk?.value ?: 0L), cpages.toInt(), (ppageclsid?.value ?: 0L), lcid.toInt(), dwreserved.toInt(), (pvreserved?.value ?: 0L))

public actual fun oleCreatePropertyFrameIndirect(lpparams: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleCreatePropertyFrameIndirect((lpparams?.value ?: 0L))

public actual fun oleCreateStaticFromData(psrcdataobj: COpaquePointer?, iid: COpaquePointer?, renderopt: UInt, pformatetc: COpaquePointer?, pclientsite: COpaquePointer?, pstg: COpaquePointer?, ppvobj: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleCreateStaticFromData((psrcdataobj?.value ?: 0L), (iid?.value ?: 0L), renderopt.toInt(), (pformatetc?.value ?: 0L), (pclientsite?.value ?: 0L), (pstg?.value ?: 0L), (ppvobj?.value ?: 0L))

public actual fun oleDestroyMenuDescriptor(holemenu: Long): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleDestroyMenuDescriptor(holemenu)

public actual fun oleDoAutoConvert(pstg: COpaquePointer?, pclsidnew: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleDoAutoConvert((pstg?.value ?: 0L), (pclsidnew?.value ?: 0L))

public actual fun oleDraw(punknown: COpaquePointer?, dwaspect: UInt, hdcdraw: Hdc, lprcbounds: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleDraw((punknown?.value ?: 0L), dwaspect.toInt(), (hdcdraw?.value ?: 0L), (lprcbounds?.value ?: 0L))

public actual fun oleDuplicateData(hsrc: Handle, cfformat: ClipboardFormat, uiflags: GlobalAllocFlags): Handle =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleDuplicateData((hsrc?.value ?: 0L), cfformat.toShort(), uiflags.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun oleFlushClipboard(): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleFlushClipboard()

public actual fun oleGetAutoConvert(clsidold: COpaquePointer?, pclsidnew: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleGetAutoConvert((clsidold?.value ?: 0L), (pclsidnew?.value ?: 0L))

public actual fun oleGetClipboard(ppdataobj: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleGetClipboard((ppdataobj?.value ?: 0L))

public actual fun oleGetClipboardWithEnterpriseInfo(dataobject: COpaquePointer?, dataenterpriseid: COpaquePointer?, sourcedescription: COpaquePointer?, targetdescription: COpaquePointer?, datadescription: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleGetClipboardWithEnterpriseInfo((dataobject?.value ?: 0L), (dataenterpriseid?.value ?: 0L), (sourcedescription?.value ?: 0L), (targetdescription?.value ?: 0L), (datadescription?.value ?: 0L))

public actual fun oleGetIconOfClass(rclsid: COpaquePointer?, lpszlabel: Pcwstr, fusetypeaslabel: Bool): Hglobal =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleGetIconOfClass((rclsid?.value ?: 0L), (lpszlabel?.value ?: 0L), fusetypeaslabel).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun oleGetIconOfFile(lpszpath: Pcwstr, fusefileaslabel: Bool): Hglobal =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleGetIconOfFile((lpszpath?.value ?: 0L), fusefileaslabel).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun oleIconToCursor(hinstexe: Hinstance, hicon: Hicon): Hcursor =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleIconToCursor((hinstexe?.value ?: 0L), (hicon?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun oleInitialize(pvreserved: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleInitialize((pvreserved?.value ?: 0L))

public actual fun oleIsCurrentClipboard(pdataobj: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleIsCurrentClipboard((pdataobj?.value ?: 0L))

public actual fun oleIsRunning(pobject: COpaquePointer?): Bool =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleIsRunning((pobject?.value ?: 0L))

public actual fun oleLoad(pstg: COpaquePointer?, riid: COpaquePointer?, pclientsite: COpaquePointer?, ppvobj: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleLoad((pstg?.value ?: 0L), (riid?.value ?: 0L), (pclientsite?.value ?: 0L), (ppvobj?.value ?: 0L))

public actual fun oleLoadFromStream(pstm: COpaquePointer?, iidinterface: COpaquePointer?, ppvobj: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleLoadFromStream((pstm?.value ?: 0L), (iidinterface?.value ?: 0L), (ppvobj?.value ?: 0L))

public actual fun oleLoadPicture(lpstream: COpaquePointer?, lsize: Int, frunmode: Bool, riid: COpaquePointer?, lplpvobj: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleLoadPicture((lpstream?.value ?: 0L), lsize, frunmode, (riid?.value ?: 0L), (lplpvobj?.value ?: 0L))

public actual fun oleLoadPictureEx(lpstream: COpaquePointer?, lsize: Int, frunmode: Bool, riid: COpaquePointer?, xsizedesired: UInt, ysizedesired: UInt, dwflags: LoadPictureFlags, lplpvobj: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleLoadPictureEx((lpstream?.value ?: 0L), lsize, frunmode, (riid?.value ?: 0L), xsizedesired.toInt(), ysizedesired.toInt(), dwflags.toInt(), (lplpvobj?.value ?: 0L))

public actual fun oleLoadPictureFile(varfilename: Variant, lplpdisppicture: COpaquePointer?): Hresult =
    0

public actual fun oleLoadPictureFileEx(varfilename: Variant, xsizedesired: UInt, ysizedesired: UInt, dwflags: LoadPictureFlags, lplpdisppicture: COpaquePointer?): Hresult =
    0

public actual fun oleLoadPicturePath(szurlorpath: Pcwstr, punkcaller: COpaquePointer?, dwreserved: UInt, clrreserved: UInt, riid: COpaquePointer?, ppvret: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleLoadPicturePath((szurlorpath?.value ?: 0L), (punkcaller?.value ?: 0L), dwreserved.toInt(), clrreserved.toInt(), (riid?.value ?: 0L), (ppvret?.value ?: 0L))

public actual fun oleLockRunning(punknown: COpaquePointer?, flock: Bool, flastunlockcloses: Bool): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleLockRunning((punknown?.value ?: 0L), flock, flastunlockcloses)

public actual fun oleMetafilePictFromIconAndLabel(hicon: Hicon, lpszlabel: Pcwstr, lpszsourcefile: Pcwstr, iiconindex: UInt): Hglobal =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleMetafilePictFromIconAndLabel((hicon?.value ?: 0L), (lpszlabel?.value ?: 0L), (lpszsourcefile?.value ?: 0L), iiconindex.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun oleNoteObjectVisible(punknown: COpaquePointer?, fvisible: Bool): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleNoteObjectVisible((punknown?.value ?: 0L), fvisible)

public actual fun oleQueryCreateFromData(psrcdataobject: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleQueryCreateFromData((psrcdataobject?.value ?: 0L))

public actual fun oleQueryLinkFromData(psrcdataobject: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleQueryLinkFromData((psrcdataobject?.value ?: 0L))

public actual fun oleRegEnumFormatEtc(clsid: COpaquePointer?, dwdirection: UInt, ppenum: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleRegEnumFormatEtc((clsid?.value ?: 0L), dwdirection.toInt(), (ppenum?.value ?: 0L))

public actual fun oleRegEnumVerbs(clsid: COpaquePointer?, ppenum: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleRegEnumVerbs((clsid?.value ?: 0L), (ppenum?.value ?: 0L))

public actual fun oleRegGetMiscStatus(clsid: COpaquePointer?, dwaspect: UInt, pdwstatus: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleRegGetMiscStatus((clsid?.value ?: 0L), dwaspect.toInt(), (pdwstatus?.value ?: 0L))

public actual fun oleRegGetUserType(clsid: COpaquePointer?, dwformoftype: UInt, pszusertype: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleRegGetUserType((clsid?.value ?: 0L), dwformoftype.toInt(), (pszusertype?.value ?: 0L))

public actual fun oleRun(punknown: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleRun((punknown?.value ?: 0L))

public actual fun oleSave(pps: COpaquePointer?, pstg: COpaquePointer?, fsameasload: Bool): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleSave((pps?.value ?: 0L), (pstg?.value ?: 0L), fsameasload)

public actual fun oleSavePictureFile(lpdisppicture: COpaquePointer?, bstrfilename: Bstr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleSavePictureFile((lpdisppicture?.value ?: 0L), (bstrfilename?.value ?: 0L))

public actual fun oleSaveToStream(ppstm: COpaquePointer?, pstm: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleSaveToStream((ppstm?.value ?: 0L), (pstm?.value ?: 0L))

public actual fun oleSetAutoConvert(clsidold: COpaquePointer?, clsidnew: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleSetAutoConvert((clsidold?.value ?: 0L), (clsidnew?.value ?: 0L))

public actual fun oleSetClipboard(pdataobj: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleSetClipboard((pdataobj?.value ?: 0L))

public actual fun oleSetContainedObject(punknown: COpaquePointer?, fcontained: Bool): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleSetContainedObject((punknown?.value ?: 0L), fcontained)

public actual fun oleSetMenuDescriptor(holemenu: Long, hwndframe: Hwnd, hwndactiveobject: Hwnd, lpframe: COpaquePointer?, lpactiveobj: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleSetMenuDescriptor(holemenu, (hwndframe?.value ?: 0L), (hwndactiveobject?.value ?: 0L), (lpframe?.value ?: 0L), (lpactiveobj?.value ?: 0L))

public actual fun oleTranslateAccelerator(lpframe: COpaquePointer?, lpframeinfo: COpaquePointer?, lpmsg: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleTranslateAccelerator((lpframe?.value ?: 0L), (lpframeinfo?.value ?: 0L), (lpmsg?.value ?: 0L))

public actual fun oleTranslateColor(clr: UInt, hpal: Hpalette, lpcolorref: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleTranslateColor(clr.toInt(), (hpal?.value ?: 0L), (lpcolorref?.value ?: 0L))

public actual fun oleUIAddVerbMenuA(lpoleobj: COpaquePointer?, lpszshorttype: Pcstr, hmenu: Hmenu, upos: UInt, uidverbmin: UInt, uidverbmax: UInt, baddconvert: Bool, idconvert: UInt, lphmenu: COpaquePointer?): Bool =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleUIAddVerbMenuA((lpoleobj?.value ?: 0L), (lpszshorttype?.value ?: 0L), (hmenu?.value ?: 0L), upos.toInt(), uidverbmin.toInt(), uidverbmax.toInt(), baddconvert, idconvert.toInt(), (lphmenu?.value ?: 0L))

public actual fun oleUIAddVerbMenuW(lpoleobj: COpaquePointer?, lpszshorttype: Pcwstr, hmenu: Hmenu, upos: UInt, uidverbmin: UInt, uidverbmax: UInt, baddconvert: Bool, idconvert: UInt, lphmenu: COpaquePointer?): Bool =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleUIAddVerbMenuW((lpoleobj?.value ?: 0L), (lpszshorttype?.value ?: 0L), (hmenu?.value ?: 0L), upos.toInt(), uidverbmin.toInt(), uidverbmax.toInt(), baddconvert, idconvert.toInt(), (lphmenu?.value ?: 0L))

public actual fun oleUIBusyA(param0: COpaquePointer?): UInt =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleUIBusyA((param0?.value ?: 0L)).toUInt()

public actual fun oleUIBusyW(param0: COpaquePointer?): UInt =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleUIBusyW((param0?.value ?: 0L)).toUInt()

public actual fun oleUICanConvertOrActivateAs(rclsid: COpaquePointer?, fislinkedobject: Bool, wformat: UShort): Bool =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleUICanConvertOrActivateAs((rclsid?.value ?: 0L), fislinkedobject, wformat.toShort())

public actual fun oleUIChangeIconA(param0: COpaquePointer?): UInt =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleUIChangeIconA((param0?.value ?: 0L)).toUInt()

public actual fun oleUIChangeIconW(param0: COpaquePointer?): UInt =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleUIChangeIconW((param0?.value ?: 0L)).toUInt()

public actual fun oleUIChangeSourceA(param0: COpaquePointer?): UInt =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleUIChangeSourceA((param0?.value ?: 0L)).toUInt()

public actual fun oleUIChangeSourceW(param0: COpaquePointer?): UInt =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleUIChangeSourceW((param0?.value ?: 0L)).toUInt()

public actual fun oleUIConvertA(param0: COpaquePointer?): UInt =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleUIConvertA((param0?.value ?: 0L)).toUInt()

public actual fun oleUIConvertW(param0: COpaquePointer?): UInt =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleUIConvertW((param0?.value ?: 0L)).toUInt()

public actual fun oleUIEditLinksA(param0: COpaquePointer?): UInt =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleUIEditLinksA((param0?.value ?: 0L)).toUInt()

public actual fun oleUIEditLinksW(param0: COpaquePointer?): UInt =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleUIEditLinksW((param0?.value ?: 0L)).toUInt()

public actual fun oleUIInsertObjectA(param0: COpaquePointer?): UInt =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleUIInsertObjectA((param0?.value ?: 0L)).toUInt()

public actual fun oleUIInsertObjectW(param0: COpaquePointer?): UInt =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleUIInsertObjectW((param0?.value ?: 0L)).toUInt()

public actual fun oleUIObjectPropertiesA(param0: COpaquePointer?): UInt =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleUIObjectPropertiesA((param0?.value ?: 0L)).toUInt()

public actual fun oleUIObjectPropertiesW(param0: COpaquePointer?): UInt =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleUIObjectPropertiesW((param0?.value ?: 0L)).toUInt()

public actual fun oleUIPasteSpecialA(param0: COpaquePointer?): UInt =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleUIPasteSpecialA((param0?.value ?: 0L)).toUInt()

public actual fun oleUIPasteSpecialW(param0: COpaquePointer?): UInt =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleUIPasteSpecialW((param0?.value ?: 0L)).toUInt()

public actual fun oleUIPromptUserA(ntemplate: Int, hwndparent: Hwnd, vararg variadicArgs: Long): Int =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleUIPromptUserA(ntemplate, (hwndparent?.value ?: 0L), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun oleUIPromptUserW(ntemplate: Int, hwndparent: Hwnd, vararg variadicArgs: Long): Int =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleUIPromptUserW(ntemplate, (hwndparent?.value ?: 0L), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun oleUIUpdateLinksA(lpoleuilinkcntr: COpaquePointer?, hwndparent: Hwnd, lpsztitle: Pcstr, clinks: Int): Bool =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleUIUpdateLinksA((lpoleuilinkcntr?.value ?: 0L), (hwndparent?.value ?: 0L), (lpsztitle?.value ?: 0L), clinks)

public actual fun oleUIUpdateLinksW(lpoleuilinkcntr: COpaquePointer?, hwndparent: Hwnd, lpsztitle: Pcwstr, clinks: Int): Bool =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleUIUpdateLinksW((lpoleuilinkcntr?.value ?: 0L), (hwndparent?.value ?: 0L), (lpsztitle?.value ?: 0L), clinks)

public actual fun oleUninitialize() {
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_oleUninitialize()
}

public actual fun queryPathOfRegTypeLib(guid: COpaquePointer?, wmaj: UShort, wmin: UShort, lcid: UInt, lpbstrpathname: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_queryPathOfRegTypeLib((guid?.value ?: 0L), wmaj.toShort(), wmin.toShort(), lcid.toInt(), (lpbstrpathname?.value ?: 0L))

public actual fun registerActiveObject(punk: COpaquePointer?, rclsid: COpaquePointer?, dwflags: ActiveobjectFlags, pdwregister: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_registerActiveObject((punk?.value ?: 0L), (rclsid?.value ?: 0L), dwflags.toInt(), (pdwregister?.value ?: 0L))

public actual fun registerDragDrop(hwnd: Hwnd, pdroptarget: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_registerDragDrop((hwnd?.value ?: 0L), (pdroptarget?.value ?: 0L))

public actual fun registerTypeLib(ptlib: COpaquePointer?, szfullpath: Pcwstr, szhelpdir: Pcwstr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_registerTypeLib((ptlib?.value ?: 0L), (szfullpath?.value ?: 0L), (szhelpdir?.value ?: 0L))

public actual fun registerTypeLibForUser(ptlib: COpaquePointer?, szfullpath: Pcwstr, szhelpdir: Pcwstr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_registerTypeLibForUser((ptlib?.value ?: 0L), (szfullpath?.value ?: 0L), (szhelpdir?.value ?: 0L))

public actual fun releaseStgMedium(param0: COpaquePointer?) {
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_releaseStgMedium((param0?.value ?: 0L))
}

public actual fun revokeActiveObject(dwregister: UInt, pvreserved: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_revokeActiveObject(dwregister.toInt(), (pvreserved?.value ?: 0L))

public actual fun revokeDragDrop(hwnd: Hwnd): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_revokeDragDrop((hwnd?.value ?: 0L))

public actual fun safeArrayAccessData(psa: COpaquePointer?, ppvdata: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_safeArrayAccessData((psa?.value ?: 0L), (ppvdata?.value ?: 0L))

public actual fun safeArrayAddRef(psa: COpaquePointer?, ppdatatorelease: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_safeArrayAddRef((psa?.value ?: 0L), (ppdatatorelease?.value ?: 0L))

public actual fun safeArrayAllocData(psa: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_safeArrayAllocData((psa?.value ?: 0L))

public actual fun safeArrayAllocDescriptor(cdims: UInt, ppsaout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_safeArrayAllocDescriptor(cdims.toInt(), (ppsaout?.value ?: 0L))

public actual fun safeArrayAllocDescriptorEx(vt: Varenum, cdims: UInt, ppsaout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_safeArrayAllocDescriptorEx(vt.toShort(), cdims.toInt(), (ppsaout?.value ?: 0L))

public actual fun safeArrayCopy(psa: COpaquePointer?, ppsaout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_safeArrayCopy((psa?.value ?: 0L), (ppsaout?.value ?: 0L))

public actual fun safeArrayCopyData(psasource: COpaquePointer?, psatarget: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_safeArrayCopyData((psasource?.value ?: 0L), (psatarget?.value ?: 0L))

public actual fun safeArrayCreate(vt: Varenum, cdims: UInt, rgsabound: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_safeArrayCreate(vt.toShort(), cdims.toInt(), (rgsabound?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun safeArrayCreateEx(vt: Varenum, cdims: UInt, rgsabound: COpaquePointer?, pvextra: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_safeArrayCreateEx(vt.toShort(), cdims.toInt(), (rgsabound?.value ?: 0L), (pvextra?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun safeArrayCreateVector(vt: Varenum, llbound: Int, celements: UInt): COpaquePointer? =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_safeArrayCreateVector(vt.toShort(), llbound, celements.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun safeArrayCreateVectorEx(vt: Varenum, llbound: Int, celements: UInt, pvextra: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_safeArrayCreateVectorEx(vt.toShort(), llbound, celements.toInt(), (pvextra?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun safeArrayDestroy(psa: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_safeArrayDestroy((psa?.value ?: 0L))

public actual fun safeArrayDestroyData(psa: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_safeArrayDestroyData((psa?.value ?: 0L))

public actual fun safeArrayDestroyDescriptor(psa: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_safeArrayDestroyDescriptor((psa?.value ?: 0L))

public actual fun safeArrayGetDim(psa: COpaquePointer?): UInt =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_safeArrayGetDim((psa?.value ?: 0L)).toUInt()

public actual fun safeArrayGetElement(psa: COpaquePointer?, rgindices: COpaquePointer?, pv: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_safeArrayGetElement((psa?.value ?: 0L), (rgindices?.value ?: 0L), (pv?.value ?: 0L))

public actual fun safeArrayGetElemsize(psa: COpaquePointer?): UInt =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_safeArrayGetElemsize((psa?.value ?: 0L)).toUInt()

public actual fun safeArrayGetIID(psa: COpaquePointer?, pguid: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_safeArrayGetIID((psa?.value ?: 0L), (pguid?.value ?: 0L))

public actual fun safeArrayGetLBound(psa: COpaquePointer?, ndim: UInt, pllbound: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_safeArrayGetLBound((psa?.value ?: 0L), ndim.toInt(), (pllbound?.value ?: 0L))

public actual fun safeArrayGetRecordInfo(psa: COpaquePointer?, prinfo: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_safeArrayGetRecordInfo((psa?.value ?: 0L), (prinfo?.value ?: 0L))

public actual fun safeArrayGetUBound(psa: COpaquePointer?, ndim: UInt, plubound: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_safeArrayGetUBound((psa?.value ?: 0L), ndim.toInt(), (plubound?.value ?: 0L))

public actual fun safeArrayGetVartype(psa: COpaquePointer?, pvt: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_safeArrayGetVartype((psa?.value ?: 0L), (pvt?.value ?: 0L))

public actual fun safeArrayLock(psa: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_safeArrayLock((psa?.value ?: 0L))

public actual fun safeArrayPtrOfIndex(psa: COpaquePointer?, rgindices: COpaquePointer?, ppvdata: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_safeArrayPtrOfIndex((psa?.value ?: 0L), (rgindices?.value ?: 0L), (ppvdata?.value ?: 0L))

public actual fun safeArrayPutElement(psa: COpaquePointer?, rgindices: COpaquePointer?, pv: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_safeArrayPutElement((psa?.value ?: 0L), (rgindices?.value ?: 0L), (pv?.value ?: 0L))

public actual fun safeArrayRedim(psa: COpaquePointer?, psaboundnew: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_safeArrayRedim((psa?.value ?: 0L), (psaboundnew?.value ?: 0L))

public actual fun safeArrayReleaseData(pdata: COpaquePointer?) {
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_safeArrayReleaseData((pdata?.value ?: 0L))
}

public actual fun safeArrayReleaseDescriptor(psa: COpaquePointer?) {
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_safeArrayReleaseDescriptor((psa?.value ?: 0L))
}

public actual fun safeArraySetIID(psa: COpaquePointer?, guid: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_safeArraySetIID((psa?.value ?: 0L), (guid?.value ?: 0L))

public actual fun safeArraySetRecordInfo(psa: COpaquePointer?, prinfo: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_safeArraySetRecordInfo((psa?.value ?: 0L), (prinfo?.value ?: 0L))

public actual fun safeArrayUnaccessData(psa: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_safeArrayUnaccessData((psa?.value ?: 0L))

public actual fun safeArrayUnlock(psa: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_safeArrayUnlock((psa?.value ?: 0L))

public actual fun unRegisterTypeLib(libid: COpaquePointer?, wvermajor: UShort, wverminor: UShort, lcid: UInt, syskind: Syskind): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_unRegisterTypeLib((libid?.value ?: 0L), wvermajor.toShort(), wverminor.toShort(), lcid.toInt(), syskind)

public actual fun unRegisterTypeLibForUser(libid: COpaquePointer?, wmajorvernum: UShort, wminorvernum: UShort, lcid: UInt, syskind: Syskind): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_unRegisterTypeLibForUser((libid?.value ?: 0L), wmajorvernum.toShort(), wminorvernum.toShort(), lcid.toInt(), syskind)

public actual fun varAbs(pvarin: COpaquePointer?, pvarresult: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varAbs((pvarin?.value ?: 0L), (pvarresult?.value ?: 0L))

public actual fun varAdd(pvarleft: COpaquePointer?, pvarright: COpaquePointer?, pvarresult: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varAdd((pvarleft?.value ?: 0L), (pvarright?.value ?: 0L), (pvarresult?.value ?: 0L))

public actual fun varAnd(pvarleft: COpaquePointer?, pvarright: COpaquePointer?, pvarresult: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varAnd((pvarleft?.value ?: 0L), (pvarright?.value ?: 0L), (pvarresult?.value ?: 0L))

public actual fun varBoolFromCy(cyin: CY, pboolout: COpaquePointer?): Hresult =
    0

public actual fun varBoolFromDate(datein: Double, pboolout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varBoolFromDate(datein, (pboolout?.value ?: 0L))

public actual fun varBoolFromDec(pdecin: COpaquePointer?, pboolout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varBoolFromDec((pdecin?.value ?: 0L), (pboolout?.value ?: 0L))

public actual fun varBoolFromDisp(pdispin: COpaquePointer?, lcid: UInt, pboolout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varBoolFromDisp((pdispin?.value ?: 0L), lcid.toInt(), (pboolout?.value ?: 0L))

public actual fun varBoolFromI1(cin: Byte, pboolout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varBoolFromI1(cin, (pboolout?.value ?: 0L))

public actual fun varBoolFromI2(sin: Short, pboolout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varBoolFromI2(sin, (pboolout?.value ?: 0L))

public actual fun varBoolFromI4(lin: Int, pboolout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varBoolFromI4(lin, (pboolout?.value ?: 0L))

public actual fun varBoolFromI8(i64in: Long, pboolout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varBoolFromI8(i64in, (pboolout?.value ?: 0L))

public actual fun varBoolFromR4(fltin: Float, pboolout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varBoolFromR4(fltin, (pboolout?.value ?: 0L))

public actual fun varBoolFromR8(dblin: Double, pboolout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varBoolFromR8(dblin, (pboolout?.value ?: 0L))

public actual fun varBoolFromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pboolout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varBoolFromStr((strin?.value ?: 0L), lcid.toInt(), dwflags.toInt(), (pboolout?.value ?: 0L))

public actual fun varBoolFromUI1(bin: UByte, pboolout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varBoolFromUI1(bin.toByte(), (pboolout?.value ?: 0L))

public actual fun varBoolFromUI2(uiin: UShort, pboolout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varBoolFromUI2(uiin.toShort(), (pboolout?.value ?: 0L))

public actual fun varBoolFromUI4(ulin: UInt, pboolout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varBoolFromUI4(ulin.toInt(), (pboolout?.value ?: 0L))

public actual fun varBoolFromUI8(i64in: ULong, pboolout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varBoolFromUI8(i64in.toLong(), (pboolout?.value ?: 0L))

public actual fun varBstrCat(bstrleft: Bstr, bstrright: Bstr, pbstrresult: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varBstrCat((bstrleft?.value ?: 0L), (bstrright?.value ?: 0L), (pbstrresult?.value ?: 0L))

public actual fun varBstrCmp(bstrleft: Bstr, bstrright: Bstr, lcid: UInt, dwflags: UInt): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varBstrCmp((bstrleft?.value ?: 0L), (bstrright?.value ?: 0L), lcid.toInt(), dwflags.toInt())

public actual fun varBstrFromBool(boolin: VariantBool, lcid: UInt, dwflags: UInt, pbstrout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varBstrFromBool(boolin, lcid.toInt(), dwflags.toInt(), (pbstrout?.value ?: 0L))

public actual fun varBstrFromCy(cyin: CY, lcid: UInt, dwflags: UInt, pbstrout: COpaquePointer?): Hresult =
    0

public actual fun varBstrFromDate(datein: Double, lcid: UInt, dwflags: UInt, pbstrout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varBstrFromDate(datein, lcid.toInt(), dwflags.toInt(), (pbstrout?.value ?: 0L))

public actual fun varBstrFromDec(pdecin: COpaquePointer?, lcid: UInt, dwflags: UInt, pbstrout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varBstrFromDec((pdecin?.value ?: 0L), lcid.toInt(), dwflags.toInt(), (pbstrout?.value ?: 0L))

public actual fun varBstrFromDisp(pdispin: COpaquePointer?, lcid: UInt, dwflags: UInt, pbstrout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varBstrFromDisp((pdispin?.value ?: 0L), lcid.toInt(), dwflags.toInt(), (pbstrout?.value ?: 0L))

public actual fun varBstrFromI1(cin: Byte, lcid: UInt, dwflags: UInt, pbstrout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varBstrFromI1(cin, lcid.toInt(), dwflags.toInt(), (pbstrout?.value ?: 0L))

public actual fun varBstrFromI2(ival: Short, lcid: UInt, dwflags: UInt, pbstrout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varBstrFromI2(ival, lcid.toInt(), dwflags.toInt(), (pbstrout?.value ?: 0L))

public actual fun varBstrFromI4(lin: Int, lcid: UInt, dwflags: UInt, pbstrout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varBstrFromI4(lin, lcid.toInt(), dwflags.toInt(), (pbstrout?.value ?: 0L))

public actual fun varBstrFromI8(i64in: Long, lcid: UInt, dwflags: UInt, pbstrout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varBstrFromI8(i64in, lcid.toInt(), dwflags.toInt(), (pbstrout?.value ?: 0L))

public actual fun varBstrFromR4(fltin: Float, lcid: UInt, dwflags: UInt, pbstrout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varBstrFromR4(fltin, lcid.toInt(), dwflags.toInt(), (pbstrout?.value ?: 0L))

public actual fun varBstrFromR8(dblin: Double, lcid: UInt, dwflags: UInt, pbstrout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varBstrFromR8(dblin, lcid.toInt(), dwflags.toInt(), (pbstrout?.value ?: 0L))

public actual fun varBstrFromUI1(bval: UByte, lcid: UInt, dwflags: UInt, pbstrout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varBstrFromUI1(bval.toByte(), lcid.toInt(), dwflags.toInt(), (pbstrout?.value ?: 0L))

public actual fun varBstrFromUI2(uiin: UShort, lcid: UInt, dwflags: UInt, pbstrout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varBstrFromUI2(uiin.toShort(), lcid.toInt(), dwflags.toInt(), (pbstrout?.value ?: 0L))

public actual fun varBstrFromUI4(ulin: UInt, lcid: UInt, dwflags: UInt, pbstrout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varBstrFromUI4(ulin.toInt(), lcid.toInt(), dwflags.toInt(), (pbstrout?.value ?: 0L))

public actual fun varBstrFromUI8(ui64in: ULong, lcid: UInt, dwflags: UInt, pbstrout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varBstrFromUI8(ui64in.toLong(), lcid.toInt(), dwflags.toInt(), (pbstrout?.value ?: 0L))

public actual fun varCat(pvarleft: COpaquePointer?, pvarright: COpaquePointer?, pvarresult: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varCat((pvarleft?.value ?: 0L), (pvarright?.value ?: 0L), (pvarresult?.value ?: 0L))

public actual fun varCmp(pvarleft: COpaquePointer?, pvarright: COpaquePointer?, lcid: UInt, dwflags: UInt): Varcmp =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varCmp((pvarleft?.value ?: 0L), (pvarright?.value ?: 0L), lcid.toInt(), dwflags.toInt()).toUInt()

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
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varCyFromBool(boolin, (pcyout?.value ?: 0L))

public actual fun varCyFromDate(datein: Double, pcyout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varCyFromDate(datein, (pcyout?.value ?: 0L))

public actual fun varCyFromDec(pdecin: COpaquePointer?, pcyout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varCyFromDec((pdecin?.value ?: 0L), (pcyout?.value ?: 0L))

public actual fun varCyFromDisp(pdispin: COpaquePointer?, lcid: UInt, pcyout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varCyFromDisp((pdispin?.value ?: 0L), lcid.toInt(), (pcyout?.value ?: 0L))

public actual fun varCyFromI1(cin: Byte, pcyout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varCyFromI1(cin, (pcyout?.value ?: 0L))

public actual fun varCyFromI2(sin: Short, pcyout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varCyFromI2(sin, (pcyout?.value ?: 0L))

public actual fun varCyFromI4(lin: Int, pcyout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varCyFromI4(lin, (pcyout?.value ?: 0L))

public actual fun varCyFromI8(i64in: Long, pcyout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varCyFromI8(i64in, (pcyout?.value ?: 0L))

public actual fun varCyFromR4(fltin: Float, pcyout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varCyFromR4(fltin, (pcyout?.value ?: 0L))

public actual fun varCyFromR8(dblin: Double, pcyout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varCyFromR8(dblin, (pcyout?.value ?: 0L))

public actual fun varCyFromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pcyout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varCyFromStr((strin?.value ?: 0L), lcid.toInt(), dwflags.toInt(), (pcyout?.value ?: 0L))

public actual fun varCyFromUI1(bin: UByte, pcyout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varCyFromUI1(bin.toByte(), (pcyout?.value ?: 0L))

public actual fun varCyFromUI2(uiin: UShort, pcyout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varCyFromUI2(uiin.toShort(), (pcyout?.value ?: 0L))

public actual fun varCyFromUI4(ulin: UInt, pcyout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varCyFromUI4(ulin.toInt(), (pcyout?.value ?: 0L))

public actual fun varCyFromUI8(ui64in: ULong, pcyout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varCyFromUI8(ui64in.toLong(), (pcyout?.value ?: 0L))

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
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varDateFromBool(boolin, (pdateout?.value ?: 0L))

public actual fun varDateFromCy(cyin: CY, pdateout: COpaquePointer?): Hresult =
    0

public actual fun varDateFromDec(pdecin: COpaquePointer?, pdateout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varDateFromDec((pdecin?.value ?: 0L), (pdateout?.value ?: 0L))

public actual fun varDateFromDisp(pdispin: COpaquePointer?, lcid: UInt, pdateout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varDateFromDisp((pdispin?.value ?: 0L), lcid.toInt(), (pdateout?.value ?: 0L))

public actual fun varDateFromI1(cin: Byte, pdateout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varDateFromI1(cin, (pdateout?.value ?: 0L))

public actual fun varDateFromI2(sin: Short, pdateout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varDateFromI2(sin, (pdateout?.value ?: 0L))

public actual fun varDateFromI4(lin: Int, pdateout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varDateFromI4(lin, (pdateout?.value ?: 0L))

public actual fun varDateFromI8(i64in: Long, pdateout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varDateFromI8(i64in, (pdateout?.value ?: 0L))

public actual fun varDateFromR4(fltin: Float, pdateout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varDateFromR4(fltin, (pdateout?.value ?: 0L))

public actual fun varDateFromR8(dblin: Double, pdateout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varDateFromR8(dblin, (pdateout?.value ?: 0L))

public actual fun varDateFromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pdateout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varDateFromStr((strin?.value ?: 0L), lcid.toInt(), dwflags.toInt(), (pdateout?.value ?: 0L))

public actual fun varDateFromUI1(bin: UByte, pdateout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varDateFromUI1(bin.toByte(), (pdateout?.value ?: 0L))

public actual fun varDateFromUI2(uiin: UShort, pdateout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varDateFromUI2(uiin.toShort(), (pdateout?.value ?: 0L))

public actual fun varDateFromUI4(ulin: UInt, pdateout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varDateFromUI4(ulin.toInt(), (pdateout?.value ?: 0L))

public actual fun varDateFromUI8(ui64in: ULong, pdateout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varDateFromUI8(ui64in.toLong(), (pdateout?.value ?: 0L))

public actual fun varDateFromUdate(pudatein: COpaquePointer?, dwflags: UInt, pdateout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varDateFromUdate((pudatein?.value ?: 0L), dwflags.toInt(), (pdateout?.value ?: 0L))

public actual fun varDateFromUdateEx(pudatein: COpaquePointer?, lcid: UInt, dwflags: UInt, pdateout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varDateFromUdateEx((pudatein?.value ?: 0L), lcid.toInt(), dwflags.toInt(), (pdateout?.value ?: 0L))

public actual fun varDecAbs(pdecin: COpaquePointer?, pdecresult: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varDecAbs((pdecin?.value ?: 0L), (pdecresult?.value ?: 0L))

public actual fun varDecAdd(pdecleft: COpaquePointer?, pdecright: COpaquePointer?, pdecresult: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varDecAdd((pdecleft?.value ?: 0L), (pdecright?.value ?: 0L), (pdecresult?.value ?: 0L))

public actual fun varDecCmp(pdecleft: COpaquePointer?, pdecright: COpaquePointer?): Varcmp =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varDecCmp((pdecleft?.value ?: 0L), (pdecright?.value ?: 0L)).toUInt()

public actual fun varDecCmpR8(pdecleft: COpaquePointer?, dblright: Double): Varcmp =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varDecCmpR8((pdecleft?.value ?: 0L), dblright).toUInt()

public actual fun varDecDiv(pdecleft: COpaquePointer?, pdecright: COpaquePointer?, pdecresult: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varDecDiv((pdecleft?.value ?: 0L), (pdecright?.value ?: 0L), (pdecresult?.value ?: 0L))

public actual fun varDecFix(pdecin: COpaquePointer?, pdecresult: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varDecFix((pdecin?.value ?: 0L), (pdecresult?.value ?: 0L))

public actual fun varDecFromBool(boolin: VariantBool, pdecout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varDecFromBool(boolin, (pdecout?.value ?: 0L))

public actual fun varDecFromCy(cyin: CY, pdecout: COpaquePointer?): Hresult =
    0

public actual fun varDecFromDate(datein: Double, pdecout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varDecFromDate(datein, (pdecout?.value ?: 0L))

public actual fun varDecFromDisp(pdispin: COpaquePointer?, lcid: UInt, pdecout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varDecFromDisp((pdispin?.value ?: 0L), lcid.toInt(), (pdecout?.value ?: 0L))

public actual fun varDecFromI1(cin: Byte, pdecout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varDecFromI1(cin, (pdecout?.value ?: 0L))

public actual fun varDecFromI2(uiin: Short, pdecout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varDecFromI2(uiin, (pdecout?.value ?: 0L))

public actual fun varDecFromI4(lin: Int, pdecout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varDecFromI4(lin, (pdecout?.value ?: 0L))

public actual fun varDecFromI8(i64in: Long, pdecout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varDecFromI8(i64in, (pdecout?.value ?: 0L))

public actual fun varDecFromR4(fltin: Float, pdecout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varDecFromR4(fltin, (pdecout?.value ?: 0L))

public actual fun varDecFromR8(dblin: Double, pdecout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varDecFromR8(dblin, (pdecout?.value ?: 0L))

public actual fun varDecFromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pdecout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varDecFromStr((strin?.value ?: 0L), lcid.toInt(), dwflags.toInt(), (pdecout?.value ?: 0L))

public actual fun varDecFromUI1(bin: UByte, pdecout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varDecFromUI1(bin.toByte(), (pdecout?.value ?: 0L))

public actual fun varDecFromUI2(uiin: UShort, pdecout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varDecFromUI2(uiin.toShort(), (pdecout?.value ?: 0L))

public actual fun varDecFromUI4(ulin: UInt, pdecout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varDecFromUI4(ulin.toInt(), (pdecout?.value ?: 0L))

public actual fun varDecFromUI8(ui64in: ULong, pdecout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varDecFromUI8(ui64in.toLong(), (pdecout?.value ?: 0L))

public actual fun varDecInt(pdecin: COpaquePointer?, pdecresult: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varDecInt((pdecin?.value ?: 0L), (pdecresult?.value ?: 0L))

public actual fun varDecMul(pdecleft: COpaquePointer?, pdecright: COpaquePointer?, pdecresult: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varDecMul((pdecleft?.value ?: 0L), (pdecright?.value ?: 0L), (pdecresult?.value ?: 0L))

public actual fun varDecNeg(pdecin: COpaquePointer?, pdecresult: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varDecNeg((pdecin?.value ?: 0L), (pdecresult?.value ?: 0L))

public actual fun varDecRound(pdecin: COpaquePointer?, cdecimals: Int, pdecresult: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varDecRound((pdecin?.value ?: 0L), cdecimals, (pdecresult?.value ?: 0L))

public actual fun varDecSub(pdecleft: COpaquePointer?, pdecright: COpaquePointer?, pdecresult: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varDecSub((pdecleft?.value ?: 0L), (pdecright?.value ?: 0L), (pdecresult?.value ?: 0L))

public actual fun varDiv(pvarleft: COpaquePointer?, pvarright: COpaquePointer?, pvarresult: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varDiv((pvarleft?.value ?: 0L), (pvarright?.value ?: 0L), (pvarresult?.value ?: 0L))

public actual fun varEqv(pvarleft: COpaquePointer?, pvarright: COpaquePointer?, pvarresult: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varEqv((pvarleft?.value ?: 0L), (pvarright?.value ?: 0L), (pvarresult?.value ?: 0L))

public actual fun varFix(pvarin: COpaquePointer?, pvarresult: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varFix((pvarin?.value ?: 0L), (pvarresult?.value ?: 0L))

public actual fun varFormat(pvarin: COpaquePointer?, pstrformat: Pcwstr, ifirstday: VarformatFirstDay, ifirstweek: VarformatFirstWeek, dwflags: UInt, pbstrout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varFormat((pvarin?.value ?: 0L), (pstrformat?.value ?: 0L), ifirstday, ifirstweek, dwflags.toInt(), (pbstrout?.value ?: 0L))

public actual fun varFormatCurrency(pvarin: COpaquePointer?, inumdig: Int, iinclead: Int, iuseparens: Int, igroup: Int, dwflags: UInt, pbstrout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varFormatCurrency((pvarin?.value ?: 0L), inumdig, iinclead, iuseparens, igroup, dwflags.toInt(), (pbstrout?.value ?: 0L))

public actual fun varFormatDateTime(pvarin: COpaquePointer?, inamedformat: VarformatNamedFormat, dwflags: UInt, pbstrout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varFormatDateTime((pvarin?.value ?: 0L), inamedformat, dwflags.toInt(), (pbstrout?.value ?: 0L))

public actual fun varFormatFromTokens(pvarin: COpaquePointer?, pstrformat: Pcwstr, pbtokcur: COpaquePointer?, dwflags: UInt, pbstrout: COpaquePointer?, lcid: UInt): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varFormatFromTokens((pvarin?.value ?: 0L), (pstrformat?.value ?: 0L), (pbtokcur?.value ?: 0L), dwflags.toInt(), (pbstrout?.value ?: 0L), lcid.toInt())

public actual fun varFormatNumber(pvarin: COpaquePointer?, inumdig: Int, iinclead: VarformatLeadingDigit, iuseparens: VarformatParentheses, igroup: VarformatGroup, dwflags: UInt, pbstrout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varFormatNumber((pvarin?.value ?: 0L), inumdig, iinclead, iuseparens, igroup, dwflags.toInt(), (pbstrout?.value ?: 0L))

public actual fun varFormatPercent(pvarin: COpaquePointer?, inumdig: Int, iinclead: VarformatLeadingDigit, iuseparens: VarformatParentheses, igroup: VarformatGroup, dwflags: UInt, pbstrout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varFormatPercent((pvarin?.value ?: 0L), inumdig, iinclead, iuseparens, igroup, dwflags.toInt(), (pbstrout?.value ?: 0L))

public actual fun varI1FromBool(boolin: VariantBool, pcout: Pstr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varI1FromBool(boolin, (pcout?.value ?: 0L))

public actual fun varI1FromCy(cyin: CY, pcout: Pstr): Hresult =
    0

public actual fun varI1FromDate(datein: Double, pcout: Pstr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varI1FromDate(datein, (pcout?.value ?: 0L))

public actual fun varI1FromDec(pdecin: COpaquePointer?, pcout: Pstr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varI1FromDec((pdecin?.value ?: 0L), (pcout?.value ?: 0L))

public actual fun varI1FromDisp(pdispin: COpaquePointer?, lcid: UInt, pcout: Pstr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varI1FromDisp((pdispin?.value ?: 0L), lcid.toInt(), (pcout?.value ?: 0L))

public actual fun varI1FromI2(uiin: Short, pcout: Pstr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varI1FromI2(uiin, (pcout?.value ?: 0L))

public actual fun varI1FromI4(lin: Int, pcout: Pstr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varI1FromI4(lin, (pcout?.value ?: 0L))

public actual fun varI1FromI8(i64in: Long, pcout: Pstr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varI1FromI8(i64in, (pcout?.value ?: 0L))

public actual fun varI1FromR4(fltin: Float, pcout: Pstr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varI1FromR4(fltin, (pcout?.value ?: 0L))

public actual fun varI1FromR8(dblin: Double, pcout: Pstr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varI1FromR8(dblin, (pcout?.value ?: 0L))

public actual fun varI1FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pcout: Pstr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varI1FromStr((strin?.value ?: 0L), lcid.toInt(), dwflags.toInt(), (pcout?.value ?: 0L))

public actual fun varI1FromUI1(bin: UByte, pcout: Pstr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varI1FromUI1(bin.toByte(), (pcout?.value ?: 0L))

public actual fun varI1FromUI2(uiin: UShort, pcout: Pstr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varI1FromUI2(uiin.toShort(), (pcout?.value ?: 0L))

public actual fun varI1FromUI4(ulin: UInt, pcout: Pstr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varI1FromUI4(ulin.toInt(), (pcout?.value ?: 0L))

public actual fun varI1FromUI8(i64in: ULong, pcout: Pstr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varI1FromUI8(i64in.toLong(), (pcout?.value ?: 0L))

public actual fun varI2FromBool(boolin: VariantBool, psout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varI2FromBool(boolin, (psout?.value ?: 0L))

public actual fun varI2FromCy(cyin: CY, psout: COpaquePointer?): Hresult =
    0

public actual fun varI2FromDate(datein: Double, psout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varI2FromDate(datein, (psout?.value ?: 0L))

public actual fun varI2FromDec(pdecin: COpaquePointer?, psout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varI2FromDec((pdecin?.value ?: 0L), (psout?.value ?: 0L))

public actual fun varI2FromDisp(pdispin: COpaquePointer?, lcid: UInt, psout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varI2FromDisp((pdispin?.value ?: 0L), lcid.toInt(), (psout?.value ?: 0L))

public actual fun varI2FromI1(cin: Byte, psout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varI2FromI1(cin, (psout?.value ?: 0L))

public actual fun varI2FromI4(lin: Int, psout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varI2FromI4(lin, (psout?.value ?: 0L))

public actual fun varI2FromI8(i64in: Long, psout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varI2FromI8(i64in, (psout?.value ?: 0L))

public actual fun varI2FromR4(fltin: Float, psout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varI2FromR4(fltin, (psout?.value ?: 0L))

public actual fun varI2FromR8(dblin: Double, psout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varI2FromR8(dblin, (psout?.value ?: 0L))

public actual fun varI2FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, psout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varI2FromStr((strin?.value ?: 0L), lcid.toInt(), dwflags.toInt(), (psout?.value ?: 0L))

public actual fun varI2FromUI1(bin: UByte, psout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varI2FromUI1(bin.toByte(), (psout?.value ?: 0L))

public actual fun varI2FromUI2(uiin: UShort, psout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varI2FromUI2(uiin.toShort(), (psout?.value ?: 0L))

public actual fun varI2FromUI4(ulin: UInt, psout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varI2FromUI4(ulin.toInt(), (psout?.value ?: 0L))

public actual fun varI2FromUI8(ui64in: ULong, psout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varI2FromUI8(ui64in.toLong(), (psout?.value ?: 0L))

public actual fun varI4FromBool(boolin: VariantBool, plout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varI4FromBool(boolin, (plout?.value ?: 0L))

public actual fun varI4FromCy(cyin: CY, plout: COpaquePointer?): Hresult =
    0

public actual fun varI4FromDate(datein: Double, plout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varI4FromDate(datein, (plout?.value ?: 0L))

public actual fun varI4FromDec(pdecin: COpaquePointer?, plout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varI4FromDec((pdecin?.value ?: 0L), (plout?.value ?: 0L))

public actual fun varI4FromDisp(pdispin: COpaquePointer?, lcid: UInt, plout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varI4FromDisp((pdispin?.value ?: 0L), lcid.toInt(), (plout?.value ?: 0L))

public actual fun varI4FromI1(cin: Byte, plout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varI4FromI1(cin, (plout?.value ?: 0L))

public actual fun varI4FromI2(sin: Short, plout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varI4FromI2(sin, (plout?.value ?: 0L))

public actual fun varI4FromI8(i64in: Long, plout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varI4FromI8(i64in, (plout?.value ?: 0L))

public actual fun varI4FromR4(fltin: Float, plout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varI4FromR4(fltin, (plout?.value ?: 0L))

public actual fun varI4FromR8(dblin: Double, plout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varI4FromR8(dblin, (plout?.value ?: 0L))

public actual fun varI4FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, plout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varI4FromStr((strin?.value ?: 0L), lcid.toInt(), dwflags.toInt(), (plout?.value ?: 0L))

public actual fun varI4FromUI1(bin: UByte, plout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varI4FromUI1(bin.toByte(), (plout?.value ?: 0L))

public actual fun varI4FromUI2(uiin: UShort, plout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varI4FromUI2(uiin.toShort(), (plout?.value ?: 0L))

public actual fun varI4FromUI4(ulin: UInt, plout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varI4FromUI4(ulin.toInt(), (plout?.value ?: 0L))

public actual fun varI4FromUI8(ui64in: ULong, plout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varI4FromUI8(ui64in.toLong(), (plout?.value ?: 0L))

public actual fun varI8FromBool(boolin: VariantBool, pi64out: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varI8FromBool(boolin, (pi64out?.value ?: 0L))

public actual fun varI8FromCy(cyin: CY, pi64out: COpaquePointer?): Hresult =
    0

public actual fun varI8FromDate(datein: Double, pi64out: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varI8FromDate(datein, (pi64out?.value ?: 0L))

public actual fun varI8FromDec(pdecin: COpaquePointer?, pi64out: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varI8FromDec((pdecin?.value ?: 0L), (pi64out?.value ?: 0L))

public actual fun varI8FromDisp(pdispin: COpaquePointer?, lcid: UInt, pi64out: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varI8FromDisp((pdispin?.value ?: 0L), lcid.toInt(), (pi64out?.value ?: 0L))

public actual fun varI8FromI1(cin: Byte, pi64out: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varI8FromI1(cin, (pi64out?.value ?: 0L))

public actual fun varI8FromI2(sin: Short, pi64out: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varI8FromI2(sin, (pi64out?.value ?: 0L))

public actual fun varI8FromR4(fltin: Float, pi64out: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varI8FromR4(fltin, (pi64out?.value ?: 0L))

public actual fun varI8FromR8(dblin: Double, pi64out: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varI8FromR8(dblin, (pi64out?.value ?: 0L))

public actual fun varI8FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pi64out: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varI8FromStr((strin?.value ?: 0L), lcid.toInt(), dwflags.toInt(), (pi64out?.value ?: 0L))

public actual fun varI8FromUI1(bin: UByte, pi64out: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varI8FromUI1(bin.toByte(), (pi64out?.value ?: 0L))

public actual fun varI8FromUI2(uiin: UShort, pi64out: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varI8FromUI2(uiin.toShort(), (pi64out?.value ?: 0L))

public actual fun varI8FromUI4(ulin: UInt, pi64out: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varI8FromUI4(ulin.toInt(), (pi64out?.value ?: 0L))

public actual fun varI8FromUI8(ui64in: ULong, pi64out: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varI8FromUI8(ui64in.toLong(), (pi64out?.value ?: 0L))

public actual fun varIdiv(pvarleft: COpaquePointer?, pvarright: COpaquePointer?, pvarresult: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varIdiv((pvarleft?.value ?: 0L), (pvarright?.value ?: 0L), (pvarresult?.value ?: 0L))

public actual fun varImp(pvarleft: COpaquePointer?, pvarright: COpaquePointer?, pvarresult: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varImp((pvarleft?.value ?: 0L), (pvarright?.value ?: 0L), (pvarresult?.value ?: 0L))

public actual fun varInt(pvarin: COpaquePointer?, pvarresult: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varInt((pvarin?.value ?: 0L), (pvarresult?.value ?: 0L))

public actual fun varMod(pvarleft: COpaquePointer?, pvarright: COpaquePointer?, pvarresult: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varMod((pvarleft?.value ?: 0L), (pvarright?.value ?: 0L), (pvarresult?.value ?: 0L))

public actual fun varMonthName(imonth: Int, fabbrev: Int, dwflags: UInt, pbstrout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varMonthName(imonth, fabbrev, dwflags.toInt(), (pbstrout?.value ?: 0L))

public actual fun varMul(pvarleft: COpaquePointer?, pvarright: COpaquePointer?, pvarresult: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varMul((pvarleft?.value ?: 0L), (pvarright?.value ?: 0L), (pvarresult?.value ?: 0L))

public actual fun varNeg(pvarin: COpaquePointer?, pvarresult: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varNeg((pvarin?.value ?: 0L), (pvarresult?.value ?: 0L))

public actual fun varNot(pvarin: COpaquePointer?, pvarresult: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varNot((pvarin?.value ?: 0L), (pvarresult?.value ?: 0L))

public actual fun varNumFromParseNum(pnumprs: COpaquePointer?, rgbdig: COpaquePointer?, dwvtbits: UInt, pvar: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varNumFromParseNum((pnumprs?.value ?: 0L), (rgbdig?.value ?: 0L), dwvtbits.toInt(), (pvar?.value ?: 0L))

public actual fun varOr(pvarleft: COpaquePointer?, pvarright: COpaquePointer?, pvarresult: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varOr((pvarleft?.value ?: 0L), (pvarright?.value ?: 0L), (pvarresult?.value ?: 0L))

public actual fun varParseNumFromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pnumprs: COpaquePointer?, rgbdig: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varParseNumFromStr((strin?.value ?: 0L), lcid.toInt(), dwflags.toInt(), (pnumprs?.value ?: 0L), (rgbdig?.value ?: 0L))

public actual fun varPow(pvarleft: COpaquePointer?, pvarright: COpaquePointer?, pvarresult: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varPow((pvarleft?.value ?: 0L), (pvarright?.value ?: 0L), (pvarresult?.value ?: 0L))

public actual fun varR4CmpR8(fltleft: Float, dblright: Double): Varcmp =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varR4CmpR8(fltleft, dblright).toUInt()

public actual fun varR4FromBool(boolin: VariantBool, pfltout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varR4FromBool(boolin, (pfltout?.value ?: 0L))

public actual fun varR4FromCy(cyin: CY, pfltout: COpaquePointer?): Hresult =
    0

public actual fun varR4FromDate(datein: Double, pfltout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varR4FromDate(datein, (pfltout?.value ?: 0L))

public actual fun varR4FromDec(pdecin: COpaquePointer?, pfltout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varR4FromDec((pdecin?.value ?: 0L), (pfltout?.value ?: 0L))

public actual fun varR4FromDisp(pdispin: COpaquePointer?, lcid: UInt, pfltout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varR4FromDisp((pdispin?.value ?: 0L), lcid.toInt(), (pfltout?.value ?: 0L))

public actual fun varR4FromI1(cin: Byte, pfltout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varR4FromI1(cin, (pfltout?.value ?: 0L))

public actual fun varR4FromI2(sin: Short, pfltout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varR4FromI2(sin, (pfltout?.value ?: 0L))

public actual fun varR4FromI4(lin: Int, pfltout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varR4FromI4(lin, (pfltout?.value ?: 0L))

public actual fun varR4FromI8(i64in: Long, pfltout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varR4FromI8(i64in, (pfltout?.value ?: 0L))

public actual fun varR4FromR8(dblin: Double, pfltout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varR4FromR8(dblin, (pfltout?.value ?: 0L))

public actual fun varR4FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pfltout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varR4FromStr((strin?.value ?: 0L), lcid.toInt(), dwflags.toInt(), (pfltout?.value ?: 0L))

public actual fun varR4FromUI1(bin: UByte, pfltout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varR4FromUI1(bin.toByte(), (pfltout?.value ?: 0L))

public actual fun varR4FromUI2(uiin: UShort, pfltout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varR4FromUI2(uiin.toShort(), (pfltout?.value ?: 0L))

public actual fun varR4FromUI4(ulin: UInt, pfltout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varR4FromUI4(ulin.toInt(), (pfltout?.value ?: 0L))

public actual fun varR4FromUI8(ui64in: ULong, pfltout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varR4FromUI8(ui64in.toLong(), (pfltout?.value ?: 0L))

public actual fun varR8FromBool(boolin: VariantBool, pdblout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varR8FromBool(boolin, (pdblout?.value ?: 0L))

public actual fun varR8FromCy(cyin: CY, pdblout: COpaquePointer?): Hresult =
    0

public actual fun varR8FromDate(datein: Double, pdblout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varR8FromDate(datein, (pdblout?.value ?: 0L))

public actual fun varR8FromDec(pdecin: COpaquePointer?, pdblout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varR8FromDec((pdecin?.value ?: 0L), (pdblout?.value ?: 0L))

public actual fun varR8FromDisp(pdispin: COpaquePointer?, lcid: UInt, pdblout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varR8FromDisp((pdispin?.value ?: 0L), lcid.toInt(), (pdblout?.value ?: 0L))

public actual fun varR8FromI1(cin: Byte, pdblout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varR8FromI1(cin, (pdblout?.value ?: 0L))

public actual fun varR8FromI2(sin: Short, pdblout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varR8FromI2(sin, (pdblout?.value ?: 0L))

public actual fun varR8FromI4(lin: Int, pdblout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varR8FromI4(lin, (pdblout?.value ?: 0L))

public actual fun varR8FromI8(i64in: Long, pdblout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varR8FromI8(i64in, (pdblout?.value ?: 0L))

public actual fun varR8FromR4(fltin: Float, pdblout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varR8FromR4(fltin, (pdblout?.value ?: 0L))

public actual fun varR8FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pdblout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varR8FromStr((strin?.value ?: 0L), lcid.toInt(), dwflags.toInt(), (pdblout?.value ?: 0L))

public actual fun varR8FromUI1(bin: UByte, pdblout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varR8FromUI1(bin.toByte(), (pdblout?.value ?: 0L))

public actual fun varR8FromUI2(uiin: UShort, pdblout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varR8FromUI2(uiin.toShort(), (pdblout?.value ?: 0L))

public actual fun varR8FromUI4(ulin: UInt, pdblout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varR8FromUI4(ulin.toInt(), (pdblout?.value ?: 0L))

public actual fun varR8FromUI8(ui64in: ULong, pdblout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varR8FromUI8(ui64in.toLong(), (pdblout?.value ?: 0L))

public actual fun varR8Pow(dblleft: Double, dblright: Double, pdblresult: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varR8Pow(dblleft, dblright, (pdblresult?.value ?: 0L))

public actual fun varR8Round(dblin: Double, cdecimals: Int, pdblresult: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varR8Round(dblin, cdecimals, (pdblresult?.value ?: 0L))

public actual fun varRound(pvarin: COpaquePointer?, cdecimals: Int, pvarresult: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varRound((pvarin?.value ?: 0L), cdecimals, (pvarresult?.value ?: 0L))

public actual fun varSub(pvarleft: COpaquePointer?, pvarright: COpaquePointer?, pvarresult: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varSub((pvarleft?.value ?: 0L), (pvarright?.value ?: 0L), (pvarresult?.value ?: 0L))

public actual fun varTokenizeFormatString(pstrformat: Pcwstr, rgbtok: COpaquePointer?, cbtok: Int, ifirstday: VarformatFirstDay, ifirstweek: VarformatFirstWeek, lcid: UInt, pcbactual: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varTokenizeFormatString((pstrformat?.value ?: 0L), (rgbtok?.value ?: 0L), cbtok, ifirstday, ifirstweek, lcid.toInt(), (pcbactual?.value ?: 0L))

public actual fun varUI1FromBool(boolin: VariantBool, pbout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varUI1FromBool(boolin, (pbout?.value ?: 0L))

public actual fun varUI1FromCy(cyin: CY, pbout: COpaquePointer?): Hresult =
    0

public actual fun varUI1FromDate(datein: Double, pbout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varUI1FromDate(datein, (pbout?.value ?: 0L))

public actual fun varUI1FromDec(pdecin: COpaquePointer?, pbout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varUI1FromDec((pdecin?.value ?: 0L), (pbout?.value ?: 0L))

public actual fun varUI1FromDisp(pdispin: COpaquePointer?, lcid: UInt, pbout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varUI1FromDisp((pdispin?.value ?: 0L), lcid.toInt(), (pbout?.value ?: 0L))

public actual fun varUI1FromI1(cin: Byte, pbout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varUI1FromI1(cin, (pbout?.value ?: 0L))

public actual fun varUI1FromI2(sin: Short, pbout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varUI1FromI2(sin, (pbout?.value ?: 0L))

public actual fun varUI1FromI4(lin: Int, pbout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varUI1FromI4(lin, (pbout?.value ?: 0L))

public actual fun varUI1FromI8(i64in: Long, pbout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varUI1FromI8(i64in, (pbout?.value ?: 0L))

public actual fun varUI1FromR4(fltin: Float, pbout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varUI1FromR4(fltin, (pbout?.value ?: 0L))

public actual fun varUI1FromR8(dblin: Double, pbout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varUI1FromR8(dblin, (pbout?.value ?: 0L))

public actual fun varUI1FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pbout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varUI1FromStr((strin?.value ?: 0L), lcid.toInt(), dwflags.toInt(), (pbout?.value ?: 0L))

public actual fun varUI1FromUI2(uiin: UShort, pbout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varUI1FromUI2(uiin.toShort(), (pbout?.value ?: 0L))

public actual fun varUI1FromUI4(ulin: UInt, pbout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varUI1FromUI4(ulin.toInt(), (pbout?.value ?: 0L))

public actual fun varUI1FromUI8(ui64in: ULong, pbout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varUI1FromUI8(ui64in.toLong(), (pbout?.value ?: 0L))

public actual fun varUI2FromBool(boolin: VariantBool, puiout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varUI2FromBool(boolin, (puiout?.value ?: 0L))

public actual fun varUI2FromCy(cyin: CY, puiout: COpaquePointer?): Hresult =
    0

public actual fun varUI2FromDate(datein: Double, puiout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varUI2FromDate(datein, (puiout?.value ?: 0L))

public actual fun varUI2FromDec(pdecin: COpaquePointer?, puiout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varUI2FromDec((pdecin?.value ?: 0L), (puiout?.value ?: 0L))

public actual fun varUI2FromDisp(pdispin: COpaquePointer?, lcid: UInt, puiout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varUI2FromDisp((pdispin?.value ?: 0L), lcid.toInt(), (puiout?.value ?: 0L))

public actual fun varUI2FromI1(cin: Byte, puiout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varUI2FromI1(cin, (puiout?.value ?: 0L))

public actual fun varUI2FromI2(uiin: Short, puiout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varUI2FromI2(uiin, (puiout?.value ?: 0L))

public actual fun varUI2FromI4(lin: Int, puiout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varUI2FromI4(lin, (puiout?.value ?: 0L))

public actual fun varUI2FromI8(i64in: Long, puiout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varUI2FromI8(i64in, (puiout?.value ?: 0L))

public actual fun varUI2FromR4(fltin: Float, puiout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varUI2FromR4(fltin, (puiout?.value ?: 0L))

public actual fun varUI2FromR8(dblin: Double, puiout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varUI2FromR8(dblin, (puiout?.value ?: 0L))

public actual fun varUI2FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, puiout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varUI2FromStr((strin?.value ?: 0L), lcid.toInt(), dwflags.toInt(), (puiout?.value ?: 0L))

public actual fun varUI2FromUI1(bin: UByte, puiout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varUI2FromUI1(bin.toByte(), (puiout?.value ?: 0L))

public actual fun varUI2FromUI4(ulin: UInt, puiout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varUI2FromUI4(ulin.toInt(), (puiout?.value ?: 0L))

public actual fun varUI2FromUI8(i64in: ULong, puiout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varUI2FromUI8(i64in.toLong(), (puiout?.value ?: 0L))

public actual fun varUI4FromBool(boolin: VariantBool, pulout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varUI4FromBool(boolin, (pulout?.value ?: 0L))

public actual fun varUI4FromCy(cyin: CY, pulout: COpaquePointer?): Hresult =
    0

public actual fun varUI4FromDate(datein: Double, pulout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varUI4FromDate(datein, (pulout?.value ?: 0L))

public actual fun varUI4FromDec(pdecin: COpaquePointer?, pulout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varUI4FromDec((pdecin?.value ?: 0L), (pulout?.value ?: 0L))

public actual fun varUI4FromDisp(pdispin: COpaquePointer?, lcid: UInt, pulout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varUI4FromDisp((pdispin?.value ?: 0L), lcid.toInt(), (pulout?.value ?: 0L))

public actual fun varUI4FromI1(cin: Byte, pulout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varUI4FromI1(cin, (pulout?.value ?: 0L))

public actual fun varUI4FromI2(uiin: Short, pulout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varUI4FromI2(uiin, (pulout?.value ?: 0L))

public actual fun varUI4FromI4(lin: Int, pulout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varUI4FromI4(lin, (pulout?.value ?: 0L))

public actual fun varUI4FromI8(i64in: Long, plout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varUI4FromI8(i64in, (plout?.value ?: 0L))

public actual fun varUI4FromR4(fltin: Float, pulout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varUI4FromR4(fltin, (pulout?.value ?: 0L))

public actual fun varUI4FromR8(dblin: Double, pulout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varUI4FromR8(dblin, (pulout?.value ?: 0L))

public actual fun varUI4FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pulout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varUI4FromStr((strin?.value ?: 0L), lcid.toInt(), dwflags.toInt(), (pulout?.value ?: 0L))

public actual fun varUI4FromUI1(bin: UByte, pulout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varUI4FromUI1(bin.toByte(), (pulout?.value ?: 0L))

public actual fun varUI4FromUI2(uiin: UShort, pulout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varUI4FromUI2(uiin.toShort(), (pulout?.value ?: 0L))

public actual fun varUI4FromUI8(ui64in: ULong, plout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varUI4FromUI8(ui64in.toLong(), (plout?.value ?: 0L))

public actual fun varUI8FromBool(boolin: VariantBool, pi64out: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varUI8FromBool(boolin, (pi64out?.value ?: 0L))

public actual fun varUI8FromCy(cyin: CY, pi64out: COpaquePointer?): Hresult =
    0

public actual fun varUI8FromDate(datein: Double, pi64out: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varUI8FromDate(datein, (pi64out?.value ?: 0L))

public actual fun varUI8FromDec(pdecin: COpaquePointer?, pi64out: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varUI8FromDec((pdecin?.value ?: 0L), (pi64out?.value ?: 0L))

public actual fun varUI8FromDisp(pdispin: COpaquePointer?, lcid: UInt, pi64out: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varUI8FromDisp((pdispin?.value ?: 0L), lcid.toInt(), (pi64out?.value ?: 0L))

public actual fun varUI8FromI1(cin: Byte, pi64out: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varUI8FromI1(cin, (pi64out?.value ?: 0L))

public actual fun varUI8FromI2(sin: Short, pi64out: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varUI8FromI2(sin, (pi64out?.value ?: 0L))

public actual fun varUI8FromI8(ui64in: Long, pi64out: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varUI8FromI8(ui64in, (pi64out?.value ?: 0L))

public actual fun varUI8FromR4(fltin: Float, pi64out: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varUI8FromR4(fltin, (pi64out?.value ?: 0L))

public actual fun varUI8FromR8(dblin: Double, pi64out: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varUI8FromR8(dblin, (pi64out?.value ?: 0L))

public actual fun varUI8FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pi64out: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varUI8FromStr((strin?.value ?: 0L), lcid.toInt(), dwflags.toInt(), (pi64out?.value ?: 0L))

public actual fun varUI8FromUI1(bin: UByte, pi64out: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varUI8FromUI1(bin.toByte(), (pi64out?.value ?: 0L))

public actual fun varUI8FromUI2(uiin: UShort, pi64out: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varUI8FromUI2(uiin.toShort(), (pi64out?.value ?: 0L))

public actual fun varUI8FromUI4(ulin: UInt, pi64out: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varUI8FromUI4(ulin.toInt(), (pi64out?.value ?: 0L))

public actual fun varUdateFromDate(datein: Double, dwflags: UInt, pudateout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varUdateFromDate(datein, dwflags.toInt(), (pudateout?.value ?: 0L))

public actual fun varWeekdayName(iweekday: Int, fabbrev: Int, ifirstday: Int, dwflags: UInt, pbstrout: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varWeekdayName(iweekday, fabbrev, ifirstday, dwflags.toInt(), (pbstrout?.value ?: 0L))

public actual fun varXor(pvarleft: COpaquePointer?, pvarright: COpaquePointer?, pvarresult: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_varXor((pvarleft?.value ?: 0L), (pvarright?.value ?: 0L), (pvarresult?.value ?: 0L))

public actual fun vectorFromBstr(bstr: Bstr, ppsa: COpaquePointer?): Hresult =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_vectorFromBstr((bstr?.value ?: 0L), (ppsa?.value ?: 0L))
