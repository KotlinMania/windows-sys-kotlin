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

private object WindowsWin32SystemOleJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_BstrFromVector(psa: Long, pbstr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_ClearCustData(pcustdata: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_CreateDispTypeInfo(pidata: Long, lcid: Int, pptinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_CreateErrorInfo(pperrinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_CreateOleAdviseHolder(ppoaholder: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_CreateStdDispatch(punkouter: Long, pvthis: Long, ptinfo: Long, ppunkstddisp: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_CreateTypeLib(syskind: Int, szfile: Long, ppctlib: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_CreateTypeLib2(syskind: Int, szfile: Long, ppctlib: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_DispCallFunc(pvinstance: Long, ovft: Long, cc: Int, vtreturn: Short, cactuals: Int, prgvt: Long, prgpvarg: Long, pvargresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_DispGetIDsOfNames(ptinfo: Long, rgsznames: Long, cnames: Int, rgdispid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_DispGetParam(pdispparams: Long, position: Int, vttarg: Short, pvarresult: Long, puargerr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_DispInvoke(_this: Long, ptinfo: Long, dispidmember: Int, wflags: Short, pparams: Long, pvarresult: Long, pexcepinfo: Long, puargerr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_DoDragDrop(pdataobj: Long, pdropsource: Long, dwokeffects: Int, pdweffect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_GetActiveObject(rclsid: Long, pvreserved: Long, ppunk: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_GetAltMonthNames(lcid: Int, prgp: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_GetRecordInfoFromGuids(rguidtypelib: Long, uvermajor: Int, uverminor: Int, lcid: Int, rguidtypeinfo: Long, pprecinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_GetRecordInfoFromTypeInfo(ptypeinfo: Long, pprecinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_HRGN_UserFree(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_HRGN_UserFree64(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_HRGN_UserMarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_HRGN_UserMarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_HRGN_UserSize(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_HRGN_UserSize64(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_HRGN_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_HRGN_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_IsAccelerator(haccel: Long, caccelentries: Int, lpmsg: Long, lpwcmd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_LHashValOfNameSys(syskind: Int, lcid: Int, szname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_LHashValOfNameSysA(syskind: Int, lcid: Int, szname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_LoadRegTypeLib(rguid: Long, wvermajor: Short, wverminor: Short, lcid: Int, pptlib: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_LoadTypeLib(szfile: Long, pptlib: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_LoadTypeLibEx(szfile: Long, regkind: Int, pptlib: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OaBuildVersion(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OaEnablePerUserTLibRegistration()

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleBuildVersion(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleConvertOLESTREAMToIStorage2(lpolestream: Long, pstg: Long, ptd: Long, opt: Int, pvcallbackcontext: Long, pqueryconvertolelinkcallback: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleConvertOLESTREAMToIStorageEx2(polestm: Long, pstg: Long, pcfformat: Long, plwwidth: Long, plheight: Long, pdwsize: Long, pmedium: Long, opt: Int, pvcallbackcontext: Long, pqueryconvertolelinkcallback: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleCreate(rclsid: Long, riid: Long, renderopt: Int, pformatetc: Long, pclientsite: Long, pstg: Long, ppvobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleCreateDefaultHandler(clsid: Long, punkouter: Long, riid: Long, lplpobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleCreateEmbeddingHelper(clsid: Long, punkouter: Long, flags: Int, pcf: Long, riid: Long, lplpobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleCreateEx(rclsid: Long, riid: Long, dwflags: Int, renderopt: Int, cformats: Int, rgadvf: Long, rgformatetc: Long, lpadvisesink: Long, rgdwconnection: Long, pclientsite: Long, pstg: Long, ppvobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleCreateFontIndirect(lpfontdesc: Long, riid: Long, lplpvobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleCreateFromData(psrcdataobj: Long, riid: Long, renderopt: Int, pformatetc: Long, pclientsite: Long, pstg: Long, ppvobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleCreateFromDataEx(psrcdataobj: Long, riid: Long, dwflags: Int, renderopt: Int, cformats: Int, rgadvf: Long, rgformatetc: Long, lpadvisesink: Long, rgdwconnection: Long, pclientsite: Long, pstg: Long, ppvobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleCreateFromFile(rclsid: Long, lpszfilename: Long, riid: Long, renderopt: Int, lpformatetc: Long, pclientsite: Long, pstg: Long, ppvobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleCreateFromFileEx(rclsid: Long, lpszfilename: Long, riid: Long, dwflags: Int, renderopt: Int, cformats: Int, rgadvf: Long, rgformatetc: Long, lpadvisesink: Long, rgdwconnection: Long, pclientsite: Long, pstg: Long, ppvobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleCreateLink(pmklinksrc: Long, riid: Long, renderopt: Int, lpformatetc: Long, pclientsite: Long, pstg: Long, ppvobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleCreateLinkEx(pmklinksrc: Long, riid: Long, dwflags: Int, renderopt: Int, cformats: Int, rgadvf: Long, rgformatetc: Long, lpadvisesink: Long, rgdwconnection: Long, pclientsite: Long, pstg: Long, ppvobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleCreateLinkFromData(psrcdataobj: Long, riid: Long, renderopt: Int, pformatetc: Long, pclientsite: Long, pstg: Long, ppvobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleCreateLinkFromDataEx(psrcdataobj: Long, riid: Long, dwflags: Int, renderopt: Int, cformats: Int, rgadvf: Long, rgformatetc: Long, lpadvisesink: Long, rgdwconnection: Long, pclientsite: Long, pstg: Long, ppvobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleCreateLinkToFile(lpszfilename: Long, riid: Long, renderopt: Int, lpformatetc: Long, pclientsite: Long, pstg: Long, ppvobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleCreateLinkToFileEx(lpszfilename: Long, riid: Long, dwflags: Int, renderopt: Int, cformats: Int, rgadvf: Long, rgformatetc: Long, lpadvisesink: Long, rgdwconnection: Long, pclientsite: Long, pstg: Long, ppvobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleCreateMenuDescriptor(hmenucombined: Long, lpmenuwidths: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleCreatePictureIndirect(lppictdesc: Long, riid: Long, fown: Int, lplpvobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleCreatePropertyFrame(hwndowner: Long, x: Int, y: Int, lpszcaption: Long, cobjects: Int, ppunk: Long, cpages: Int, ppageclsid: Long, lcid: Int, dwreserved: Int, pvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleCreatePropertyFrameIndirect(lpparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleCreateStaticFromData(psrcdataobj: Long, iid: Long, renderopt: Int, pformatetc: Long, pclientsite: Long, pstg: Long, ppvobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleDestroyMenuDescriptor(holemenu: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleDoAutoConvert(pstg: Long, pclsidnew: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleDraw(punknown: Long, dwaspect: Int, hdcdraw: Long, lprcbounds: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleDuplicateData(hsrc: Long, cfformat: Short, uiflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleFlushClipboard(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleGetAutoConvert(clsidold: Long, pclsidnew: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleGetClipboard(ppdataobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleGetClipboardWithEnterpriseInfo(dataobject: Long, dataenterpriseid: Long, sourcedescription: Long, targetdescription: Long, datadescription: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleGetIconOfClass(rclsid: Long, lpszlabel: Long, fusetypeaslabel: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleGetIconOfFile(lpszpath: Long, fusefileaslabel: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleIconToCursor(hinstexe: Long, hicon: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleInitialize(pvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleIsCurrentClipboard(pdataobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleIsRunning(pobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleLoad(pstg: Long, riid: Long, pclientsite: Long, ppvobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleLoadFromStream(pstm: Long, iidinterface: Long, ppvobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleLoadPicture(lpstream: Long, lsize: Int, frunmode: Int, riid: Long, lplpvobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleLoadPictureEx(lpstream: Long, lsize: Int, frunmode: Int, riid: Long, xsizedesired: Int, ysizedesired: Int, dwflags: Int, lplpvobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleLoadPicturePath(szurlorpath: Long, punkcaller: Long, dwreserved: Int, clrreserved: Int, riid: Long, ppvret: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleLockRunning(punknown: Long, flock: Int, flastunlockcloses: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleMetafilePictFromIconAndLabel(hicon: Long, lpszlabel: Long, lpszsourcefile: Long, iiconindex: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleNoteObjectVisible(punknown: Long, fvisible: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleQueryCreateFromData(psrcdataobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleQueryLinkFromData(psrcdataobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleRegEnumFormatEtc(clsid: Long, dwdirection: Int, ppenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleRegEnumVerbs(clsid: Long, ppenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleRegGetMiscStatus(clsid: Long, dwaspect: Int, pdwstatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleRegGetUserType(clsid: Long, dwformoftype: Int, pszusertype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleRun(punknown: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleSave(pps: Long, pstg: Long, fsameasload: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleSavePictureFile(lpdisppicture: Long, bstrfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleSaveToStream(ppstm: Long, pstm: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleSetAutoConvert(clsidold: Long, clsidnew: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleSetClipboard(pdataobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleSetContainedObject(punknown: Long, fcontained: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleSetMenuDescriptor(holemenu: Long, hwndframe: Long, hwndactiveobject: Long, lpframe: Long, lpactiveobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleTranslateAccelerator(lpframe: Long, lpframeinfo: Long, lpmsg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleTranslateColor(clr: Int, hpal: Long, lpcolorref: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleUIAddVerbMenuA(lpoleobj: Long, lpszshorttype: Long, hmenu: Long, upos: Int, uidverbmin: Int, uidverbmax: Int, baddconvert: Int, idconvert: Int, lphmenu: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleUIAddVerbMenuW(lpoleobj: Long, lpszshorttype: Long, hmenu: Long, upos: Int, uidverbmin: Int, uidverbmax: Int, baddconvert: Int, idconvert: Int, lphmenu: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleUIBusyA(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleUIBusyW(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleUICanConvertOrActivateAs(rclsid: Long, fislinkedobject: Int, wformat: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleUIChangeIconA(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleUIChangeIconW(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleUIChangeSourceA(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleUIChangeSourceW(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleUIConvertA(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleUIConvertW(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleUIEditLinksA(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleUIEditLinksW(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleUIInsertObjectA(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleUIInsertObjectW(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleUIObjectPropertiesA(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleUIObjectPropertiesW(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleUIPasteSpecialA(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleUIPasteSpecialW(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleUIUpdateLinksA(lpoleuilinkcntr: Long, hwndparent: Long, lpsztitle: Long, clinks: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleUIUpdateLinksW(lpoleuilinkcntr: Long, hwndparent: Long, lpsztitle: Long, clinks: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_OleUninitialize()

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_QueryPathOfRegTypeLib(guid: Long, wmaj: Short, wmin: Short, lcid: Int, lpbstrpathname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_RegisterActiveObject(punk: Long, rclsid: Long, dwflags: Int, pdwregister: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_RegisterDragDrop(hwnd: Long, pdroptarget: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_RegisterTypeLib(ptlib: Long, szfullpath: Long, szhelpdir: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_RegisterTypeLibForUser(ptlib: Long, szfullpath: Long, szhelpdir: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_ReleaseStgMedium(param0: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_RevokeActiveObject(dwregister: Int, pvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_RevokeDragDrop(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_SafeArrayAccessData(psa: Long, ppvdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_SafeArrayAddRef(psa: Long, ppdatatorelease: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_SafeArrayAllocData(psa: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_SafeArrayAllocDescriptor(cdims: Int, ppsaout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_SafeArrayAllocDescriptorEx(vt: Short, cdims: Int, ppsaout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_SafeArrayCopy(psa: Long, ppsaout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_SafeArrayCopyData(psasource: Long, psatarget: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_SafeArrayCreate(vt: Short, cdims: Int, rgsabound: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_SafeArrayCreateEx(vt: Short, cdims: Int, rgsabound: Long, pvextra: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_SafeArrayCreateVector(vt: Short, llbound: Int, celements: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_SafeArrayCreateVectorEx(vt: Short, llbound: Int, celements: Int, pvextra: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_SafeArrayDestroy(psa: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_SafeArrayDestroyData(psa: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_SafeArrayDestroyDescriptor(psa: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_SafeArrayGetDim(psa: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_SafeArrayGetElement(psa: Long, rgindices: Long, pv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_SafeArrayGetElemsize(psa: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_SafeArrayGetIID(psa: Long, pguid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_SafeArrayGetLBound(psa: Long, ndim: Int, pllbound: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_SafeArrayGetRecordInfo(psa: Long, prinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_SafeArrayGetUBound(psa: Long, ndim: Int, plubound: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_SafeArrayGetVartype(psa: Long, pvt: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_SafeArrayLock(psa: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_SafeArrayPtrOfIndex(psa: Long, rgindices: Long, ppvdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_SafeArrayPutElement(psa: Long, rgindices: Long, pv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_SafeArrayRedim(psa: Long, psaboundnew: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_SafeArrayReleaseData(pdata: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_SafeArrayReleaseDescriptor(psa: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_SafeArraySetIID(psa: Long, guid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_SafeArraySetRecordInfo(psa: Long, prinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_SafeArrayUnaccessData(psa: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_SafeArrayUnlock(psa: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_UnRegisterTypeLib(libid: Long, wvermajor: Short, wverminor: Short, lcid: Int, syskind: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_UnRegisterTypeLibForUser(libid: Long, wmajorvernum: Short, wminorvernum: Short, lcid: Int, syskind: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarAbs(pvarin: Long, pvarresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarAdd(pvarleft: Long, pvarright: Long, pvarresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarAnd(pvarleft: Long, pvarright: Long, pvarresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarBoolFromDate(datein: Double, pboolout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarBoolFromDec(pdecin: Long, pboolout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarBoolFromDisp(pdispin: Long, lcid: Int, pboolout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarBoolFromI1(cin: Byte, pboolout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarBoolFromI2(sin: Short, pboolout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarBoolFromI4(lin: Int, pboolout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarBoolFromI8(i64in: Long, pboolout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarBoolFromR4(fltin: Float, pboolout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarBoolFromR8(dblin: Double, pboolout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarBoolFromStr(strin: Long, lcid: Int, dwflags: Int, pboolout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarBoolFromUI1(bin: Byte, pboolout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarBoolFromUI2(uiin: Short, pboolout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarBoolFromUI4(ulin: Int, pboolout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarBoolFromUI8(i64in: Long, pboolout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarBstrCat(bstrleft: Long, bstrright: Long, pbstrresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarBstrCmp(bstrleft: Long, bstrright: Long, lcid: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarBstrFromBool(boolin: Short, lcid: Int, dwflags: Int, pbstrout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarBstrFromDate(datein: Double, lcid: Int, dwflags: Int, pbstrout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarBstrFromDec(pdecin: Long, lcid: Int, dwflags: Int, pbstrout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarBstrFromDisp(pdispin: Long, lcid: Int, dwflags: Int, pbstrout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarBstrFromI1(cin: Byte, lcid: Int, dwflags: Int, pbstrout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarBstrFromI2(ival: Short, lcid: Int, dwflags: Int, pbstrout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarBstrFromI4(lin: Int, lcid: Int, dwflags: Int, pbstrout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarBstrFromI8(i64in: Long, lcid: Int, dwflags: Int, pbstrout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarBstrFromR4(fltin: Float, lcid: Int, dwflags: Int, pbstrout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarBstrFromR8(dblin: Double, lcid: Int, dwflags: Int, pbstrout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarBstrFromUI1(bval: Byte, lcid: Int, dwflags: Int, pbstrout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarBstrFromUI2(uiin: Short, lcid: Int, dwflags: Int, pbstrout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarBstrFromUI4(ulin: Int, lcid: Int, dwflags: Int, pbstrout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarBstrFromUI8(ui64in: Long, lcid: Int, dwflags: Int, pbstrout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarCat(pvarleft: Long, pvarright: Long, pvarresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarCmp(pvarleft: Long, pvarright: Long, lcid: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarCyFromBool(boolin: Short, pcyout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarCyFromDate(datein: Double, pcyout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarCyFromDec(pdecin: Long, pcyout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarCyFromDisp(pdispin: Long, lcid: Int, pcyout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarCyFromI1(cin: Byte, pcyout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarCyFromI2(sin: Short, pcyout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarCyFromI4(lin: Int, pcyout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarCyFromI8(i64in: Long, pcyout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarCyFromR4(fltin: Float, pcyout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarCyFromR8(dblin: Double, pcyout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarCyFromStr(strin: Long, lcid: Int, dwflags: Int, pcyout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarCyFromUI1(bin: Byte, pcyout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarCyFromUI2(uiin: Short, pcyout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarCyFromUI4(ulin: Int, pcyout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarCyFromUI8(ui64in: Long, pcyout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarDateFromBool(boolin: Short, pdateout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarDateFromDec(pdecin: Long, pdateout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarDateFromDisp(pdispin: Long, lcid: Int, pdateout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarDateFromI1(cin: Byte, pdateout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarDateFromI2(sin: Short, pdateout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarDateFromI4(lin: Int, pdateout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarDateFromI8(i64in: Long, pdateout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarDateFromR4(fltin: Float, pdateout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarDateFromR8(dblin: Double, pdateout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarDateFromStr(strin: Long, lcid: Int, dwflags: Int, pdateout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarDateFromUI1(bin: Byte, pdateout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarDateFromUI2(uiin: Short, pdateout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarDateFromUI4(ulin: Int, pdateout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarDateFromUI8(ui64in: Long, pdateout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarDateFromUdate(pudatein: Long, dwflags: Int, pdateout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarDateFromUdateEx(pudatein: Long, lcid: Int, dwflags: Int, pdateout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarDecAbs(pdecin: Long, pdecresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarDecAdd(pdecleft: Long, pdecright: Long, pdecresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarDecCmp(pdecleft: Long, pdecright: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarDecCmpR8(pdecleft: Long, dblright: Double): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarDecDiv(pdecleft: Long, pdecright: Long, pdecresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarDecFix(pdecin: Long, pdecresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarDecFromBool(boolin: Short, pdecout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarDecFromDate(datein: Double, pdecout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarDecFromDisp(pdispin: Long, lcid: Int, pdecout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarDecFromI1(cin: Byte, pdecout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarDecFromI2(uiin: Short, pdecout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarDecFromI4(lin: Int, pdecout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarDecFromI8(i64in: Long, pdecout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarDecFromR4(fltin: Float, pdecout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarDecFromR8(dblin: Double, pdecout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarDecFromStr(strin: Long, lcid: Int, dwflags: Int, pdecout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarDecFromUI1(bin: Byte, pdecout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarDecFromUI2(uiin: Short, pdecout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarDecFromUI4(ulin: Int, pdecout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarDecFromUI8(ui64in: Long, pdecout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarDecInt(pdecin: Long, pdecresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarDecMul(pdecleft: Long, pdecright: Long, pdecresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarDecNeg(pdecin: Long, pdecresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarDecRound(pdecin: Long, cdecimals: Int, pdecresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarDecSub(pdecleft: Long, pdecright: Long, pdecresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarDiv(pvarleft: Long, pvarright: Long, pvarresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarEqv(pvarleft: Long, pvarright: Long, pvarresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarFix(pvarin: Long, pvarresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarFormat(pvarin: Long, pstrformat: Long, ifirstday: Int, ifirstweek: Int, dwflags: Int, pbstrout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarFormatCurrency(pvarin: Long, inumdig: Int, iinclead: Int, iuseparens: Int, igroup: Int, dwflags: Int, pbstrout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarFormatDateTime(pvarin: Long, inamedformat: Int, dwflags: Int, pbstrout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarFormatFromTokens(pvarin: Long, pstrformat: Long, pbtokcur: Long, dwflags: Int, pbstrout: Long, lcid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarFormatNumber(pvarin: Long, inumdig: Int, iinclead: Int, iuseparens: Int, igroup: Int, dwflags: Int, pbstrout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarFormatPercent(pvarin: Long, inumdig: Int, iinclead: Int, iuseparens: Int, igroup: Int, dwflags: Int, pbstrout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarI1FromBool(boolin: Short, pcout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarI1FromDate(datein: Double, pcout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarI1FromDec(pdecin: Long, pcout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarI1FromDisp(pdispin: Long, lcid: Int, pcout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarI1FromI2(uiin: Short, pcout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarI1FromI4(lin: Int, pcout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarI1FromI8(i64in: Long, pcout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarI1FromR4(fltin: Float, pcout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarI1FromR8(dblin: Double, pcout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarI1FromStr(strin: Long, lcid: Int, dwflags: Int, pcout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarI1FromUI1(bin: Byte, pcout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarI1FromUI2(uiin: Short, pcout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarI1FromUI4(ulin: Int, pcout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarI1FromUI8(i64in: Long, pcout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarI2FromBool(boolin: Short, psout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarI2FromDate(datein: Double, psout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarI2FromDec(pdecin: Long, psout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarI2FromDisp(pdispin: Long, lcid: Int, psout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarI2FromI1(cin: Byte, psout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarI2FromI4(lin: Int, psout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarI2FromI8(i64in: Long, psout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarI2FromR4(fltin: Float, psout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarI2FromR8(dblin: Double, psout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarI2FromStr(strin: Long, lcid: Int, dwflags: Int, psout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarI2FromUI1(bin: Byte, psout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarI2FromUI2(uiin: Short, psout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarI2FromUI4(ulin: Int, psout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarI2FromUI8(ui64in: Long, psout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarI4FromBool(boolin: Short, plout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarI4FromDate(datein: Double, plout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarI4FromDec(pdecin: Long, plout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarI4FromDisp(pdispin: Long, lcid: Int, plout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarI4FromI1(cin: Byte, plout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarI4FromI2(sin: Short, plout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarI4FromI8(i64in: Long, plout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarI4FromR4(fltin: Float, plout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarI4FromR8(dblin: Double, plout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarI4FromStr(strin: Long, lcid: Int, dwflags: Int, plout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarI4FromUI1(bin: Byte, plout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarI4FromUI2(uiin: Short, plout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarI4FromUI4(ulin: Int, plout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarI4FromUI8(ui64in: Long, plout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarI8FromBool(boolin: Short, pi64out: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarI8FromDate(datein: Double, pi64out: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarI8FromDec(pdecin: Long, pi64out: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarI8FromDisp(pdispin: Long, lcid: Int, pi64out: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarI8FromI1(cin: Byte, pi64out: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarI8FromI2(sin: Short, pi64out: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarI8FromR4(fltin: Float, pi64out: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarI8FromR8(dblin: Double, pi64out: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarI8FromStr(strin: Long, lcid: Int, dwflags: Int, pi64out: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarI8FromUI1(bin: Byte, pi64out: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarI8FromUI2(uiin: Short, pi64out: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarI8FromUI4(ulin: Int, pi64out: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarI8FromUI8(ui64in: Long, pi64out: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarIdiv(pvarleft: Long, pvarright: Long, pvarresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarImp(pvarleft: Long, pvarright: Long, pvarresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarInt(pvarin: Long, pvarresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarMod(pvarleft: Long, pvarright: Long, pvarresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarMonthName(imonth: Int, fabbrev: Int, dwflags: Int, pbstrout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarMul(pvarleft: Long, pvarright: Long, pvarresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarNeg(pvarin: Long, pvarresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarNot(pvarin: Long, pvarresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarNumFromParseNum(pnumprs: Long, rgbdig: Long, dwvtbits: Int, pvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarOr(pvarleft: Long, pvarright: Long, pvarresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarParseNumFromStr(strin: Long, lcid: Int, dwflags: Int, pnumprs: Long, rgbdig: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarPow(pvarleft: Long, pvarright: Long, pvarresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarR4CmpR8(fltleft: Float, dblright: Double): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarR4FromBool(boolin: Short, pfltout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarR4FromDate(datein: Double, pfltout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarR4FromDec(pdecin: Long, pfltout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarR4FromDisp(pdispin: Long, lcid: Int, pfltout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarR4FromI1(cin: Byte, pfltout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarR4FromI2(sin: Short, pfltout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarR4FromI4(lin: Int, pfltout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarR4FromI8(i64in: Long, pfltout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarR4FromR8(dblin: Double, pfltout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarR4FromStr(strin: Long, lcid: Int, dwflags: Int, pfltout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarR4FromUI1(bin: Byte, pfltout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarR4FromUI2(uiin: Short, pfltout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarR4FromUI4(ulin: Int, pfltout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarR4FromUI8(ui64in: Long, pfltout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarR8FromBool(boolin: Short, pdblout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarR8FromDate(datein: Double, pdblout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarR8FromDec(pdecin: Long, pdblout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarR8FromDisp(pdispin: Long, lcid: Int, pdblout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarR8FromI1(cin: Byte, pdblout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarR8FromI2(sin: Short, pdblout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarR8FromI4(lin: Int, pdblout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarR8FromI8(i64in: Long, pdblout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarR8FromR4(fltin: Float, pdblout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarR8FromStr(strin: Long, lcid: Int, dwflags: Int, pdblout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarR8FromUI1(bin: Byte, pdblout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarR8FromUI2(uiin: Short, pdblout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarR8FromUI4(ulin: Int, pdblout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarR8FromUI8(ui64in: Long, pdblout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarR8Pow(dblleft: Double, dblright: Double, pdblresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarR8Round(dblin: Double, cdecimals: Int, pdblresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarRound(pvarin: Long, cdecimals: Int, pvarresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarSub(pvarleft: Long, pvarright: Long, pvarresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarTokenizeFormatString(pstrformat: Long, rgbtok: Long, cbtok: Int, ifirstday: Int, ifirstweek: Int, lcid: Int, pcbactual: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarUI1FromBool(boolin: Short, pbout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarUI1FromDate(datein: Double, pbout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarUI1FromDec(pdecin: Long, pbout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarUI1FromDisp(pdispin: Long, lcid: Int, pbout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarUI1FromI1(cin: Byte, pbout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarUI1FromI2(sin: Short, pbout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarUI1FromI4(lin: Int, pbout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarUI1FromI8(i64in: Long, pbout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarUI1FromR4(fltin: Float, pbout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarUI1FromR8(dblin: Double, pbout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarUI1FromStr(strin: Long, lcid: Int, dwflags: Int, pbout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarUI1FromUI2(uiin: Short, pbout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarUI1FromUI4(ulin: Int, pbout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarUI1FromUI8(ui64in: Long, pbout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarUI2FromBool(boolin: Short, puiout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarUI2FromDate(datein: Double, puiout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarUI2FromDec(pdecin: Long, puiout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarUI2FromDisp(pdispin: Long, lcid: Int, puiout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarUI2FromI1(cin: Byte, puiout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarUI2FromI2(uiin: Short, puiout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarUI2FromI4(lin: Int, puiout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarUI2FromI8(i64in: Long, puiout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarUI2FromR4(fltin: Float, puiout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarUI2FromR8(dblin: Double, puiout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarUI2FromStr(strin: Long, lcid: Int, dwflags: Int, puiout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarUI2FromUI1(bin: Byte, puiout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarUI2FromUI4(ulin: Int, puiout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarUI2FromUI8(i64in: Long, puiout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarUI4FromBool(boolin: Short, pulout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarUI4FromDate(datein: Double, pulout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarUI4FromDec(pdecin: Long, pulout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarUI4FromDisp(pdispin: Long, lcid: Int, pulout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarUI4FromI1(cin: Byte, pulout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarUI4FromI2(uiin: Short, pulout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarUI4FromI4(lin: Int, pulout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarUI4FromI8(i64in: Long, plout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarUI4FromR4(fltin: Float, pulout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarUI4FromR8(dblin: Double, pulout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarUI4FromStr(strin: Long, lcid: Int, dwflags: Int, pulout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarUI4FromUI1(bin: Byte, pulout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarUI4FromUI2(uiin: Short, pulout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarUI4FromUI8(ui64in: Long, plout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarUI8FromBool(boolin: Short, pi64out: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarUI8FromDate(datein: Double, pi64out: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarUI8FromDec(pdecin: Long, pi64out: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarUI8FromDisp(pdispin: Long, lcid: Int, pi64out: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarUI8FromI1(cin: Byte, pi64out: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarUI8FromI2(sin: Short, pi64out: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarUI8FromI8(ui64in: Long, pi64out: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarUI8FromR4(fltin: Float, pi64out: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarUI8FromR8(dblin: Double, pi64out: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarUI8FromStr(strin: Long, lcid: Int, dwflags: Int, pi64out: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarUI8FromUI1(bin: Byte, pi64out: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarUI8FromUI2(uiin: Short, pi64out: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarUI8FromUI4(ulin: Int, pi64out: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarUdateFromDate(datein: Double, dwflags: Int, pudateout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarWeekdayName(iweekday: Int, fabbrev: Int, ifirstday: Int, dwflags: Int, pbstrout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VarXor(pvarleft: Long, pvarright: Long, pvarresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_ole_VectorFromBstr(bstr: Long, ppsa: Long): Int
}

public actual fun BstrFromVector(psa: Long, pbstr: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_BstrFromVector(psa, pbstr)

public actual fun ClearCustData(pcustdata: Long) {
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_ClearCustData(pcustdata)
}

public actual fun CreateDispTypeInfo(pidata: Long, lcid: UInt, pptinfo: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_CreateDispTypeInfo(pidata, lcid.toInt(), pptinfo)

public actual fun CreateErrorInfo(pperrinfo: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_CreateErrorInfo(pperrinfo)

public actual fun CreateOleAdviseHolder(ppoaholder: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_CreateOleAdviseHolder(ppoaholder)

public actual fun CreateStdDispatch(punkouter: Long, pvthis: Long, ptinfo: Long, ppunkstddisp: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_CreateStdDispatch(punkouter, pvthis, ptinfo, ppunkstddisp)

public actual fun CreateTypeLib(syskind: SYSKIND, szfile: PCWSTR, ppctlib: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_CreateTypeLib(syskind, szfile, ppctlib)

public actual fun CreateTypeLib2(syskind: SYSKIND, szfile: PCWSTR, ppctlib: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_CreateTypeLib2(syskind, szfile, ppctlib)

public actual fun DispCallFunc(pvinstance: Long, ovft: ULong, cc: CALLCONV, vtreturn: VARENUM, cactuals: UInt, prgvt: Long, prgpvarg: Long, pvargresult: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_DispCallFunc(pvinstance, ovft.toLong(), cc, vtreturn.toShort(), cactuals.toInt(), prgvt, prgpvarg, pvargresult)

public actual fun DispGetIDsOfNames(ptinfo: Long, rgsznames: Long, cnames: UInt, rgdispid: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_DispGetIDsOfNames(ptinfo, rgsznames, cnames.toInt(), rgdispid)

public actual fun DispGetParam(pdispparams: Long, position: UInt, vttarg: VARENUM, pvarresult: Long, puargerr: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_DispGetParam(pdispparams, position.toInt(), vttarg.toShort(), pvarresult, puargerr)

public actual fun DispInvoke(_this: Long, ptinfo: Long, dispidmember: Int, wflags: UShort, pparams: Long, pvarresult: Long, pexcepinfo: Long, puargerr: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_DispInvoke(_this, ptinfo, dispidmember, wflags.toShort(), pparams, pvarresult, pexcepinfo, puargerr)

public actual fun DoDragDrop(pdataobj: Long, pdropsource: Long, dwokeffects: DROPEFFECT, pdweffect: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_DoDragDrop(pdataobj, pdropsource, dwokeffects.toInt(), pdweffect)

public actual fun GetActiveObject(rclsid: Long, pvreserved: Long, ppunk: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_GetActiveObject(rclsid, pvreserved, ppunk)

public actual fun GetAltMonthNames(lcid: UInt, prgp: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_GetAltMonthNames(lcid.toInt(), prgp)

public actual fun GetRecordInfoFromGuids(rguidtypelib: Long, uvermajor: UInt, uverminor: UInt, lcid: UInt, rguidtypeinfo: Long, pprecinfo: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_GetRecordInfoFromGuids(rguidtypelib, uvermajor.toInt(), uverminor.toInt(), lcid.toInt(), rguidtypeinfo, pprecinfo)

public actual fun GetRecordInfoFromTypeInfo(ptypeinfo: Long, pprecinfo: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_GetRecordInfoFromTypeInfo(ptypeinfo, pprecinfo)

public actual fun HRGN_UserFree(param0: Long, param1: Long) {
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_HRGN_UserFree(param0, param1)
}

public actual fun HRGN_UserFree64(param0: Long, param1: Long) {
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_HRGN_UserFree64(param0, param1)
}

public actual fun HRGN_UserMarshal(param0: Long, param1: Long, param2: Long): Long =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_HRGN_UserMarshal(param0, param1, param2)

public actual fun HRGN_UserMarshal64(param0: Long, param1: Long, param2: Long): Long =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_HRGN_UserMarshal64(param0, param1, param2)

public actual fun HRGN_UserSize(param0: Long, param1: UInt, param2: Long): UInt =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_HRGN_UserSize(param0, param1.toInt(), param2).toUInt()

public actual fun HRGN_UserSize64(param0: Long, param1: UInt, param2: Long): UInt =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_HRGN_UserSize64(param0, param1.toInt(), param2).toUInt()

public actual fun HRGN_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_HRGN_UserUnmarshal(param0, param1, param2)

public actual fun HRGN_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_HRGN_UserUnmarshal64(param0, param1, param2)

public actual fun IsAccelerator(haccel: HACCEL, caccelentries: Int, lpmsg: Long, lpwcmd: Long): BOOL =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_IsAccelerator(haccel, caccelentries, lpmsg, lpwcmd)

public actual fun LHashValOfNameSys(syskind: SYSKIND, lcid: UInt, szname: PCWSTR): UInt =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_LHashValOfNameSys(syskind, lcid.toInt(), szname).toUInt()

public actual fun LHashValOfNameSysA(syskind: SYSKIND, lcid: UInt, szname: PCSTR): UInt =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_LHashValOfNameSysA(syskind, lcid.toInt(), szname).toUInt()

public actual fun LoadRegTypeLib(rguid: Long, wvermajor: UShort, wverminor: UShort, lcid: UInt, pptlib: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_LoadRegTypeLib(rguid, wvermajor.toShort(), wverminor.toShort(), lcid.toInt(), pptlib)

public actual fun LoadTypeLib(szfile: PCWSTR, pptlib: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_LoadTypeLib(szfile, pptlib)

public actual fun LoadTypeLibEx(szfile: PCWSTR, regkind: REGKIND, pptlib: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_LoadTypeLibEx(szfile, regkind, pptlib)

public actual fun OaBuildVersion(): UInt =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OaBuildVersion().toUInt()

public actual fun OaEnablePerUserTLibRegistration() {
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OaEnablePerUserTLibRegistration()
}

public actual fun OleBuildVersion(): UInt =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleBuildVersion().toUInt()

public actual fun OleConvertOLESTREAMToIStorage2(lpolestream: Long, pstg: Long, ptd: Long, opt: UInt, pvcallbackcontext: Long, pqueryconvertolelinkcallback: OLESTREAMQUERYCONVERTOLELINKCALLBACK): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleConvertOLESTREAMToIStorage2(lpolestream, pstg, ptd, opt.toInt(), pvcallbackcontext, pqueryconvertolelinkcallback.toLong())

public actual fun OleConvertOLESTREAMToIStorageEx2(polestm: Long, pstg: Long, pcfformat: Long, plwwidth: Long, plheight: Long, pdwsize: Long, pmedium: Long, opt: UInt, pvcallbackcontext: Long, pqueryconvertolelinkcallback: OLESTREAMQUERYCONVERTOLELINKCALLBACK): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleConvertOLESTREAMToIStorageEx2(polestm, pstg, pcfformat, plwwidth, plheight, pdwsize, pmedium, opt.toInt(), pvcallbackcontext, pqueryconvertolelinkcallback.toLong())

public actual fun OleCreate(rclsid: Long, riid: Long, renderopt: UInt, pformatetc: Long, pclientsite: Long, pstg: Long, ppvobj: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleCreate(rclsid, riid, renderopt.toInt(), pformatetc, pclientsite, pstg, ppvobj)

public actual fun OleCreateDefaultHandler(clsid: Long, punkouter: Long, riid: Long, lplpobj: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleCreateDefaultHandler(clsid, punkouter, riid, lplpobj)

public actual fun OleCreateEmbeddingHelper(clsid: Long, punkouter: Long, flags: EMBDHLP_FLAGS, pcf: Long, riid: Long, lplpobj: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleCreateEmbeddingHelper(clsid, punkouter, flags.toInt(), pcf, riid, lplpobj)

public actual fun OleCreateEx(rclsid: Long, riid: Long, dwflags: OLECREATE, renderopt: UInt, cformats: UInt, rgadvf: Long, rgformatetc: Long, lpadvisesink: Long, rgdwconnection: Long, pclientsite: Long, pstg: Long, ppvobj: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleCreateEx(rclsid, riid, dwflags.toInt(), renderopt.toInt(), cformats.toInt(), rgadvf, rgformatetc, lpadvisesink, rgdwconnection, pclientsite, pstg, ppvobj)

public actual fun OleCreateFontIndirect(lpfontdesc: Long, riid: Long, lplpvobj: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleCreateFontIndirect(lpfontdesc, riid, lplpvobj)

public actual fun OleCreateFromData(psrcdataobj: Long, riid: Long, renderopt: UInt, pformatetc: Long, pclientsite: Long, pstg: Long, ppvobj: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleCreateFromData(psrcdataobj, riid, renderopt.toInt(), pformatetc, pclientsite, pstg, ppvobj)

public actual fun OleCreateFromDataEx(psrcdataobj: Long, riid: Long, dwflags: OLECREATE, renderopt: UInt, cformats: UInt, rgadvf: Long, rgformatetc: Long, lpadvisesink: Long, rgdwconnection: Long, pclientsite: Long, pstg: Long, ppvobj: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleCreateFromDataEx(psrcdataobj, riid, dwflags.toInt(), renderopt.toInt(), cformats.toInt(), rgadvf, rgformatetc, lpadvisesink, rgdwconnection, pclientsite, pstg, ppvobj)

public actual fun OleCreateFromFile(rclsid: Long, lpszfilename: PCWSTR, riid: Long, renderopt: UInt, lpformatetc: Long, pclientsite: Long, pstg: Long, ppvobj: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleCreateFromFile(rclsid, lpszfilename, riid, renderopt.toInt(), lpformatetc, pclientsite, pstg, ppvobj)

public actual fun OleCreateFromFileEx(rclsid: Long, lpszfilename: PCWSTR, riid: Long, dwflags: OLECREATE, renderopt: UInt, cformats: UInt, rgadvf: Long, rgformatetc: Long, lpadvisesink: Long, rgdwconnection: Long, pclientsite: Long, pstg: Long, ppvobj: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleCreateFromFileEx(rclsid, lpszfilename, riid, dwflags.toInt(), renderopt.toInt(), cformats.toInt(), rgadvf, rgformatetc, lpadvisesink, rgdwconnection, pclientsite, pstg, ppvobj)

public actual fun OleCreateLink(pmklinksrc: Long, riid: Long, renderopt: UInt, lpformatetc: Long, pclientsite: Long, pstg: Long, ppvobj: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleCreateLink(pmklinksrc, riid, renderopt.toInt(), lpformatetc, pclientsite, pstg, ppvobj)

public actual fun OleCreateLinkEx(pmklinksrc: Long, riid: Long, dwflags: OLECREATE, renderopt: UInt, cformats: UInt, rgadvf: Long, rgformatetc: Long, lpadvisesink: Long, rgdwconnection: Long, pclientsite: Long, pstg: Long, ppvobj: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleCreateLinkEx(pmklinksrc, riid, dwflags.toInt(), renderopt.toInt(), cformats.toInt(), rgadvf, rgformatetc, lpadvisesink, rgdwconnection, pclientsite, pstg, ppvobj)

public actual fun OleCreateLinkFromData(psrcdataobj: Long, riid: Long, renderopt: UInt, pformatetc: Long, pclientsite: Long, pstg: Long, ppvobj: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleCreateLinkFromData(psrcdataobj, riid, renderopt.toInt(), pformatetc, pclientsite, pstg, ppvobj)

public actual fun OleCreateLinkFromDataEx(psrcdataobj: Long, riid: Long, dwflags: OLECREATE, renderopt: UInt, cformats: UInt, rgadvf: Long, rgformatetc: Long, lpadvisesink: Long, rgdwconnection: Long, pclientsite: Long, pstg: Long, ppvobj: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleCreateLinkFromDataEx(psrcdataobj, riid, dwflags.toInt(), renderopt.toInt(), cformats.toInt(), rgadvf, rgformatetc, lpadvisesink, rgdwconnection, pclientsite, pstg, ppvobj)

public actual fun OleCreateLinkToFile(lpszfilename: PCWSTR, riid: Long, renderopt: UInt, lpformatetc: Long, pclientsite: Long, pstg: Long, ppvobj: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleCreateLinkToFile(lpszfilename, riid, renderopt.toInt(), lpformatetc, pclientsite, pstg, ppvobj)

public actual fun OleCreateLinkToFileEx(lpszfilename: PCWSTR, riid: Long, dwflags: OLECREATE, renderopt: UInt, cformats: UInt, rgadvf: Long, rgformatetc: Long, lpadvisesink: Long, rgdwconnection: Long, pclientsite: Long, pstg: Long, ppvobj: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleCreateLinkToFileEx(lpszfilename, riid, dwflags.toInt(), renderopt.toInt(), cformats.toInt(), rgadvf, rgformatetc, lpadvisesink, rgdwconnection, pclientsite, pstg, ppvobj)

public actual fun OleCreateMenuDescriptor(hmenucombined: HMENU, lpmenuwidths: Long): Long =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleCreateMenuDescriptor(hmenucombined, lpmenuwidths)

public actual fun OleCreatePictureIndirect(lppictdesc: Long, riid: Long, fown: BOOL, lplpvobj: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleCreatePictureIndirect(lppictdesc, riid, fown, lplpvobj)

public actual fun OleCreatePropertyFrame(hwndowner: HWND, x: UInt, y: UInt, lpszcaption: PCWSTR, cobjects: UInt, ppunk: Long, cpages: UInt, ppageclsid: Long, lcid: UInt, dwreserved: UInt, pvreserved: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleCreatePropertyFrame(hwndowner, x.toInt(), y.toInt(), lpszcaption, cobjects.toInt(), ppunk, cpages.toInt(), ppageclsid, lcid.toInt(), dwreserved.toInt(), pvreserved)

public actual fun OleCreatePropertyFrameIndirect(lpparams: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleCreatePropertyFrameIndirect(lpparams)

public actual fun OleCreateStaticFromData(psrcdataobj: Long, iid: Long, renderopt: UInt, pformatetc: Long, pclientsite: Long, pstg: Long, ppvobj: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleCreateStaticFromData(psrcdataobj, iid, renderopt.toInt(), pformatetc, pclientsite, pstg, ppvobj)

public actual fun OleDestroyMenuDescriptor(holemenu: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleDestroyMenuDescriptor(holemenu)

public actual fun OleDoAutoConvert(pstg: Long, pclsidnew: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleDoAutoConvert(pstg, pclsidnew)

public actual fun OleDraw(punknown: Long, dwaspect: UInt, hdcdraw: HDC, lprcbounds: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleDraw(punknown, dwaspect.toInt(), hdcdraw, lprcbounds)

public actual fun OleDuplicateData(hsrc: HANDLE, cfformat: CLIPBOARD_FORMAT, uiflags: GLOBAL_ALLOC_FLAGS): HANDLE =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleDuplicateData(hsrc, cfformat.toShort(), uiflags.toInt())

public actual fun OleFlushClipboard(): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleFlushClipboard()

public actual fun OleGetAutoConvert(clsidold: Long, pclsidnew: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleGetAutoConvert(clsidold, pclsidnew)

public actual fun OleGetClipboard(ppdataobj: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleGetClipboard(ppdataobj)

public actual fun OleGetClipboardWithEnterpriseInfo(dataobject: Long, dataenterpriseid: Long, sourcedescription: Long, targetdescription: Long, datadescription: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleGetClipboardWithEnterpriseInfo(dataobject, dataenterpriseid, sourcedescription, targetdescription, datadescription)

public actual fun OleGetIconOfClass(rclsid: Long, lpszlabel: PCWSTR, fusetypeaslabel: BOOL): HGLOBAL =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleGetIconOfClass(rclsid, lpszlabel, fusetypeaslabel)

public actual fun OleGetIconOfFile(lpszpath: PCWSTR, fusefileaslabel: BOOL): HGLOBAL =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleGetIconOfFile(lpszpath, fusefileaslabel)

public actual fun OleIconToCursor(hinstexe: HINSTANCE, hicon: HICON): HCURSOR =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleIconToCursor(hinstexe, hicon)

public actual fun OleInitialize(pvreserved: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleInitialize(pvreserved)

public actual fun OleIsCurrentClipboard(pdataobj: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleIsCurrentClipboard(pdataobj)

public actual fun OleIsRunning(pobject: Long): BOOL =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleIsRunning(pobject)

public actual fun OleLoad(pstg: Long, riid: Long, pclientsite: Long, ppvobj: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleLoad(pstg, riid, pclientsite, ppvobj)

public actual fun OleLoadFromStream(pstm: Long, iidinterface: Long, ppvobj: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleLoadFromStream(pstm, iidinterface, ppvobj)

public actual fun OleLoadPicture(lpstream: Long, lsize: Int, frunmode: BOOL, riid: Long, lplpvobj: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleLoadPicture(lpstream, lsize, frunmode, riid, lplpvobj)

public actual fun OleLoadPictureEx(lpstream: Long, lsize: Int, frunmode: BOOL, riid: Long, xsizedesired: UInt, ysizedesired: UInt, dwflags: LOAD_PICTURE_FLAGS, lplpvobj: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleLoadPictureEx(lpstream, lsize, frunmode, riid, xsizedesired.toInt(), ysizedesired.toInt(), dwflags.toInt(), lplpvobj)

public actual fun OleLoadPictureFile(varfilename: VARIANT, lplpdisppicture: Long): HRESULT =
    0

public actual fun OleLoadPictureFileEx(varfilename: VARIANT, xsizedesired: UInt, ysizedesired: UInt, dwflags: LOAD_PICTURE_FLAGS, lplpdisppicture: Long): HRESULT =
    0

public actual fun OleLoadPicturePath(szurlorpath: PCWSTR, punkcaller: Long, dwreserved: UInt, clrreserved: UInt, riid: Long, ppvret: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleLoadPicturePath(szurlorpath, punkcaller, dwreserved.toInt(), clrreserved.toInt(), riid, ppvret)

public actual fun OleLockRunning(punknown: Long, flock: BOOL, flastunlockcloses: BOOL): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleLockRunning(punknown, flock, flastunlockcloses)

public actual fun OleMetafilePictFromIconAndLabel(hicon: HICON, lpszlabel: PCWSTR, lpszsourcefile: PCWSTR, iiconindex: UInt): HGLOBAL =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleMetafilePictFromIconAndLabel(hicon, lpszlabel, lpszsourcefile, iiconindex.toInt())

public actual fun OleNoteObjectVisible(punknown: Long, fvisible: BOOL): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleNoteObjectVisible(punknown, fvisible)

public actual fun OleQueryCreateFromData(psrcdataobject: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleQueryCreateFromData(psrcdataobject)

public actual fun OleQueryLinkFromData(psrcdataobject: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleQueryLinkFromData(psrcdataobject)

public actual fun OleRegEnumFormatEtc(clsid: Long, dwdirection: UInt, ppenum: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleRegEnumFormatEtc(clsid, dwdirection.toInt(), ppenum)

public actual fun OleRegEnumVerbs(clsid: Long, ppenum: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleRegEnumVerbs(clsid, ppenum)

public actual fun OleRegGetMiscStatus(clsid: Long, dwaspect: UInt, pdwstatus: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleRegGetMiscStatus(clsid, dwaspect.toInt(), pdwstatus)

public actual fun OleRegGetUserType(clsid: Long, dwformoftype: UInt, pszusertype: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleRegGetUserType(clsid, dwformoftype.toInt(), pszusertype)

public actual fun OleRun(punknown: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleRun(punknown)

public actual fun OleSave(pps: Long, pstg: Long, fsameasload: BOOL): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleSave(pps, pstg, fsameasload)

public actual fun OleSavePictureFile(lpdisppicture: Long, bstrfilename: BSTR): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleSavePictureFile(lpdisppicture, bstrfilename)

public actual fun OleSaveToStream(ppstm: Long, pstm: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleSaveToStream(ppstm, pstm)

public actual fun OleSetAutoConvert(clsidold: Long, clsidnew: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleSetAutoConvert(clsidold, clsidnew)

public actual fun OleSetClipboard(pdataobj: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleSetClipboard(pdataobj)

public actual fun OleSetContainedObject(punknown: Long, fcontained: BOOL): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleSetContainedObject(punknown, fcontained)

public actual fun OleSetMenuDescriptor(holemenu: Long, hwndframe: HWND, hwndactiveobject: HWND, lpframe: Long, lpactiveobj: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleSetMenuDescriptor(holemenu, hwndframe, hwndactiveobject, lpframe, lpactiveobj)

public actual fun OleTranslateAccelerator(lpframe: Long, lpframeinfo: Long, lpmsg: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleTranslateAccelerator(lpframe, lpframeinfo, lpmsg)

public actual fun OleTranslateColor(clr: UInt, hpal: HPALETTE, lpcolorref: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleTranslateColor(clr.toInt(), hpal, lpcolorref)

public actual fun OleUIAddVerbMenuA(lpoleobj: Long, lpszshorttype: PCSTR, hmenu: HMENU, upos: UInt, uidverbmin: UInt, uidverbmax: UInt, baddconvert: BOOL, idconvert: UInt, lphmenu: Long): BOOL =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleUIAddVerbMenuA(lpoleobj, lpszshorttype, hmenu, upos.toInt(), uidverbmin.toInt(), uidverbmax.toInt(), baddconvert, idconvert.toInt(), lphmenu)

public actual fun OleUIAddVerbMenuW(lpoleobj: Long, lpszshorttype: PCWSTR, hmenu: HMENU, upos: UInt, uidverbmin: UInt, uidverbmax: UInt, baddconvert: BOOL, idconvert: UInt, lphmenu: Long): BOOL =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleUIAddVerbMenuW(lpoleobj, lpszshorttype, hmenu, upos.toInt(), uidverbmin.toInt(), uidverbmax.toInt(), baddconvert, idconvert.toInt(), lphmenu)

public actual fun OleUIBusyA(param0: Long): UInt =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleUIBusyA(param0).toUInt()

public actual fun OleUIBusyW(param0: Long): UInt =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleUIBusyW(param0).toUInt()

public actual fun OleUICanConvertOrActivateAs(rclsid: Long, fislinkedobject: BOOL, wformat: UShort): BOOL =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleUICanConvertOrActivateAs(rclsid, fislinkedobject, wformat.toShort())

public actual fun OleUIChangeIconA(param0: Long): UInt =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleUIChangeIconA(param0).toUInt()

public actual fun OleUIChangeIconW(param0: Long): UInt =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleUIChangeIconW(param0).toUInt()

public actual fun OleUIChangeSourceA(param0: Long): UInt =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleUIChangeSourceA(param0).toUInt()

public actual fun OleUIChangeSourceW(param0: Long): UInt =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleUIChangeSourceW(param0).toUInt()

public actual fun OleUIConvertA(param0: Long): UInt =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleUIConvertA(param0).toUInt()

public actual fun OleUIConvertW(param0: Long): UInt =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleUIConvertW(param0).toUInt()

public actual fun OleUIEditLinksA(param0: Long): UInt =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleUIEditLinksA(param0).toUInt()

public actual fun OleUIEditLinksW(param0: Long): UInt =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleUIEditLinksW(param0).toUInt()

public actual fun OleUIInsertObjectA(param0: Long): UInt =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleUIInsertObjectA(param0).toUInt()

public actual fun OleUIInsertObjectW(param0: Long): UInt =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleUIInsertObjectW(param0).toUInt()

public actual fun OleUIObjectPropertiesA(param0: Long): UInt =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleUIObjectPropertiesA(param0).toUInt()

public actual fun OleUIObjectPropertiesW(param0: Long): UInt =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleUIObjectPropertiesW(param0).toUInt()

public actual fun OleUIPasteSpecialA(param0: Long): UInt =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleUIPasteSpecialA(param0).toUInt()

public actual fun OleUIPasteSpecialW(param0: Long): UInt =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleUIPasteSpecialW(param0).toUInt()

public actual fun OleUIPromptUserA(ntemplate: Int, hwndparent: HWND): Int =
    0

public actual fun OleUIPromptUserW(ntemplate: Int, hwndparent: HWND): Int =
    0

public actual fun OleUIUpdateLinksA(lpoleuilinkcntr: Long, hwndparent: HWND, lpsztitle: PCSTR, clinks: Int): BOOL =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleUIUpdateLinksA(lpoleuilinkcntr, hwndparent, lpsztitle, clinks)

public actual fun OleUIUpdateLinksW(lpoleuilinkcntr: Long, hwndparent: HWND, lpsztitle: PCWSTR, clinks: Int): BOOL =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleUIUpdateLinksW(lpoleuilinkcntr, hwndparent, lpsztitle, clinks)

public actual fun OleUninitialize() {
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_OleUninitialize()
}

public actual fun QueryPathOfRegTypeLib(guid: Long, wmaj: UShort, wmin: UShort, lcid: UInt, lpbstrpathname: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_QueryPathOfRegTypeLib(guid, wmaj.toShort(), wmin.toShort(), lcid.toInt(), lpbstrpathname)

public actual fun RegisterActiveObject(punk: Long, rclsid: Long, dwflags: ACTIVEOBJECT_FLAGS, pdwregister: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_RegisterActiveObject(punk, rclsid, dwflags.toInt(), pdwregister)

public actual fun RegisterDragDrop(hwnd: HWND, pdroptarget: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_RegisterDragDrop(hwnd, pdroptarget)

public actual fun RegisterTypeLib(ptlib: Long, szfullpath: PCWSTR, szhelpdir: PCWSTR): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_RegisterTypeLib(ptlib, szfullpath, szhelpdir)

public actual fun RegisterTypeLibForUser(ptlib: Long, szfullpath: PCWSTR, szhelpdir: PCWSTR): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_RegisterTypeLibForUser(ptlib, szfullpath, szhelpdir)

public actual fun ReleaseStgMedium(param0: Long) {
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_ReleaseStgMedium(param0)
}

public actual fun RevokeActiveObject(dwregister: UInt, pvreserved: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_RevokeActiveObject(dwregister.toInt(), pvreserved)

public actual fun RevokeDragDrop(hwnd: HWND): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_RevokeDragDrop(hwnd)

public actual fun SafeArrayAccessData(psa: Long, ppvdata: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_SafeArrayAccessData(psa, ppvdata)

public actual fun SafeArrayAddRef(psa: Long, ppdatatorelease: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_SafeArrayAddRef(psa, ppdatatorelease)

public actual fun SafeArrayAllocData(psa: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_SafeArrayAllocData(psa)

public actual fun SafeArrayAllocDescriptor(cdims: UInt, ppsaout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_SafeArrayAllocDescriptor(cdims.toInt(), ppsaout)

public actual fun SafeArrayAllocDescriptorEx(vt: VARENUM, cdims: UInt, ppsaout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_SafeArrayAllocDescriptorEx(vt.toShort(), cdims.toInt(), ppsaout)

public actual fun SafeArrayCopy(psa: Long, ppsaout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_SafeArrayCopy(psa, ppsaout)

public actual fun SafeArrayCopyData(psasource: Long, psatarget: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_SafeArrayCopyData(psasource, psatarget)

public actual fun SafeArrayCreate(vt: VARENUM, cdims: UInt, rgsabound: Long): Long =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_SafeArrayCreate(vt.toShort(), cdims.toInt(), rgsabound)

public actual fun SafeArrayCreateEx(vt: VARENUM, cdims: UInt, rgsabound: Long, pvextra: Long): Long =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_SafeArrayCreateEx(vt.toShort(), cdims.toInt(), rgsabound, pvextra)

public actual fun SafeArrayCreateVector(vt: VARENUM, llbound: Int, celements: UInt): Long =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_SafeArrayCreateVector(vt.toShort(), llbound, celements.toInt())

public actual fun SafeArrayCreateVectorEx(vt: VARENUM, llbound: Int, celements: UInt, pvextra: Long): Long =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_SafeArrayCreateVectorEx(vt.toShort(), llbound, celements.toInt(), pvextra)

public actual fun SafeArrayDestroy(psa: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_SafeArrayDestroy(psa)

public actual fun SafeArrayDestroyData(psa: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_SafeArrayDestroyData(psa)

public actual fun SafeArrayDestroyDescriptor(psa: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_SafeArrayDestroyDescriptor(psa)

public actual fun SafeArrayGetDim(psa: Long): UInt =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_SafeArrayGetDim(psa).toUInt()

public actual fun SafeArrayGetElement(psa: Long, rgindices: Long, pv: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_SafeArrayGetElement(psa, rgindices, pv)

public actual fun SafeArrayGetElemsize(psa: Long): UInt =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_SafeArrayGetElemsize(psa).toUInt()

public actual fun SafeArrayGetIID(psa: Long, pguid: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_SafeArrayGetIID(psa, pguid)

public actual fun SafeArrayGetLBound(psa: Long, ndim: UInt, pllbound: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_SafeArrayGetLBound(psa, ndim.toInt(), pllbound)

public actual fun SafeArrayGetRecordInfo(psa: Long, prinfo: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_SafeArrayGetRecordInfo(psa, prinfo)

public actual fun SafeArrayGetUBound(psa: Long, ndim: UInt, plubound: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_SafeArrayGetUBound(psa, ndim.toInt(), plubound)

public actual fun SafeArrayGetVartype(psa: Long, pvt: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_SafeArrayGetVartype(psa, pvt)

public actual fun SafeArrayLock(psa: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_SafeArrayLock(psa)

public actual fun SafeArrayPtrOfIndex(psa: Long, rgindices: Long, ppvdata: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_SafeArrayPtrOfIndex(psa, rgindices, ppvdata)

public actual fun SafeArrayPutElement(psa: Long, rgindices: Long, pv: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_SafeArrayPutElement(psa, rgindices, pv)

public actual fun SafeArrayRedim(psa: Long, psaboundnew: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_SafeArrayRedim(psa, psaboundnew)

public actual fun SafeArrayReleaseData(pdata: Long) {
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_SafeArrayReleaseData(pdata)
}

public actual fun SafeArrayReleaseDescriptor(psa: Long) {
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_SafeArrayReleaseDescriptor(psa)
}

public actual fun SafeArraySetIID(psa: Long, guid: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_SafeArraySetIID(psa, guid)

public actual fun SafeArraySetRecordInfo(psa: Long, prinfo: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_SafeArraySetRecordInfo(psa, prinfo)

public actual fun SafeArrayUnaccessData(psa: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_SafeArrayUnaccessData(psa)

public actual fun SafeArrayUnlock(psa: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_SafeArrayUnlock(psa)

public actual fun UnRegisterTypeLib(libid: Long, wvermajor: UShort, wverminor: UShort, lcid: UInt, syskind: SYSKIND): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_UnRegisterTypeLib(libid, wvermajor.toShort(), wverminor.toShort(), lcid.toInt(), syskind)

public actual fun UnRegisterTypeLibForUser(libid: Long, wmajorvernum: UShort, wminorvernum: UShort, lcid: UInt, syskind: SYSKIND): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_UnRegisterTypeLibForUser(libid, wmajorvernum.toShort(), wminorvernum.toShort(), lcid.toInt(), syskind)

public actual fun VarAbs(pvarin: Long, pvarresult: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarAbs(pvarin, pvarresult)

public actual fun VarAdd(pvarleft: Long, pvarright: Long, pvarresult: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarAdd(pvarleft, pvarright, pvarresult)

public actual fun VarAnd(pvarleft: Long, pvarright: Long, pvarresult: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarAnd(pvarleft, pvarright, pvarresult)

public actual fun VarBoolFromCy(cyin: CY, pboolout: Long): HRESULT =
    0

public actual fun VarBoolFromDate(datein: Double, pboolout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarBoolFromDate(datein, pboolout)

public actual fun VarBoolFromDec(pdecin: Long, pboolout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarBoolFromDec(pdecin, pboolout)

public actual fun VarBoolFromDisp(pdispin: Long, lcid: UInt, pboolout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarBoolFromDisp(pdispin, lcid.toInt(), pboolout)

public actual fun VarBoolFromI1(cin: Byte, pboolout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarBoolFromI1(cin, pboolout)

public actual fun VarBoolFromI2(sin: Short, pboolout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarBoolFromI2(sin, pboolout)

public actual fun VarBoolFromI4(lin: Int, pboolout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarBoolFromI4(lin, pboolout)

public actual fun VarBoolFromI8(i64in: Long, pboolout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarBoolFromI8(i64in, pboolout)

public actual fun VarBoolFromR4(fltin: Float, pboolout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarBoolFromR4(fltin, pboolout)

public actual fun VarBoolFromR8(dblin: Double, pboolout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarBoolFromR8(dblin, pboolout)

public actual fun VarBoolFromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, pboolout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarBoolFromStr(strin, lcid.toInt(), dwflags.toInt(), pboolout)

public actual fun VarBoolFromUI1(bin: UByte, pboolout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarBoolFromUI1(bin.toByte(), pboolout)

public actual fun VarBoolFromUI2(uiin: UShort, pboolout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarBoolFromUI2(uiin.toShort(), pboolout)

public actual fun VarBoolFromUI4(ulin: UInt, pboolout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarBoolFromUI4(ulin.toInt(), pboolout)

public actual fun VarBoolFromUI8(i64in: ULong, pboolout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarBoolFromUI8(i64in.toLong(), pboolout)

public actual fun VarBstrCat(bstrleft: BSTR, bstrright: BSTR, pbstrresult: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarBstrCat(bstrleft, bstrright, pbstrresult)

public actual fun VarBstrCmp(bstrleft: BSTR, bstrright: BSTR, lcid: UInt, dwflags: UInt): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarBstrCmp(bstrleft, bstrright, lcid.toInt(), dwflags.toInt())

public actual fun VarBstrFromBool(boolin: VARIANT_BOOL, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarBstrFromBool(boolin, lcid.toInt(), dwflags.toInt(), pbstrout)

public actual fun VarBstrFromCy(cyin: CY, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT =
    0

public actual fun VarBstrFromDate(datein: Double, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarBstrFromDate(datein, lcid.toInt(), dwflags.toInt(), pbstrout)

public actual fun VarBstrFromDec(pdecin: Long, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarBstrFromDec(pdecin, lcid.toInt(), dwflags.toInt(), pbstrout)

public actual fun VarBstrFromDisp(pdispin: Long, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarBstrFromDisp(pdispin, lcid.toInt(), dwflags.toInt(), pbstrout)

public actual fun VarBstrFromI1(cin: Byte, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarBstrFromI1(cin, lcid.toInt(), dwflags.toInt(), pbstrout)

public actual fun VarBstrFromI2(ival: Short, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarBstrFromI2(ival, lcid.toInt(), dwflags.toInt(), pbstrout)

public actual fun VarBstrFromI4(lin: Int, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarBstrFromI4(lin, lcid.toInt(), dwflags.toInt(), pbstrout)

public actual fun VarBstrFromI8(i64in: Long, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarBstrFromI8(i64in, lcid.toInt(), dwflags.toInt(), pbstrout)

public actual fun VarBstrFromR4(fltin: Float, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarBstrFromR4(fltin, lcid.toInt(), dwflags.toInt(), pbstrout)

public actual fun VarBstrFromR8(dblin: Double, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarBstrFromR8(dblin, lcid.toInt(), dwflags.toInt(), pbstrout)

public actual fun VarBstrFromUI1(bval: UByte, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarBstrFromUI1(bval.toByte(), lcid.toInt(), dwflags.toInt(), pbstrout)

public actual fun VarBstrFromUI2(uiin: UShort, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarBstrFromUI2(uiin.toShort(), lcid.toInt(), dwflags.toInt(), pbstrout)

public actual fun VarBstrFromUI4(ulin: UInt, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarBstrFromUI4(ulin.toInt(), lcid.toInt(), dwflags.toInt(), pbstrout)

public actual fun VarBstrFromUI8(ui64in: ULong, lcid: UInt, dwflags: UInt, pbstrout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarBstrFromUI8(ui64in.toLong(), lcid.toInt(), dwflags.toInt(), pbstrout)

public actual fun VarCat(pvarleft: Long, pvarright: Long, pvarresult: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarCat(pvarleft, pvarright, pvarresult)

public actual fun VarCmp(pvarleft: Long, pvarright: Long, lcid: UInt, dwflags: UInt): VARCMP =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarCmp(pvarleft, pvarright, lcid.toInt(), dwflags.toInt()).toUInt()

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
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarCyFromBool(boolin, pcyout)

public actual fun VarCyFromDate(datein: Double, pcyout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarCyFromDate(datein, pcyout)

public actual fun VarCyFromDec(pdecin: Long, pcyout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarCyFromDec(pdecin, pcyout)

public actual fun VarCyFromDisp(pdispin: Long, lcid: UInt, pcyout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarCyFromDisp(pdispin, lcid.toInt(), pcyout)

public actual fun VarCyFromI1(cin: Byte, pcyout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarCyFromI1(cin, pcyout)

public actual fun VarCyFromI2(sin: Short, pcyout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarCyFromI2(sin, pcyout)

public actual fun VarCyFromI4(lin: Int, pcyout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarCyFromI4(lin, pcyout)

public actual fun VarCyFromI8(i64in: Long, pcyout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarCyFromI8(i64in, pcyout)

public actual fun VarCyFromR4(fltin: Float, pcyout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarCyFromR4(fltin, pcyout)

public actual fun VarCyFromR8(dblin: Double, pcyout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarCyFromR8(dblin, pcyout)

public actual fun VarCyFromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, pcyout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarCyFromStr(strin, lcid.toInt(), dwflags.toInt(), pcyout)

public actual fun VarCyFromUI1(bin: UByte, pcyout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarCyFromUI1(bin.toByte(), pcyout)

public actual fun VarCyFromUI2(uiin: UShort, pcyout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarCyFromUI2(uiin.toShort(), pcyout)

public actual fun VarCyFromUI4(ulin: UInt, pcyout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarCyFromUI4(ulin.toInt(), pcyout)

public actual fun VarCyFromUI8(ui64in: ULong, pcyout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarCyFromUI8(ui64in.toLong(), pcyout)

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
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarDateFromBool(boolin, pdateout)

public actual fun VarDateFromCy(cyin: CY, pdateout: Long): HRESULT =
    0

public actual fun VarDateFromDec(pdecin: Long, pdateout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarDateFromDec(pdecin, pdateout)

public actual fun VarDateFromDisp(pdispin: Long, lcid: UInt, pdateout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarDateFromDisp(pdispin, lcid.toInt(), pdateout)

public actual fun VarDateFromI1(cin: Byte, pdateout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarDateFromI1(cin, pdateout)

public actual fun VarDateFromI2(sin: Short, pdateout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarDateFromI2(sin, pdateout)

public actual fun VarDateFromI4(lin: Int, pdateout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarDateFromI4(lin, pdateout)

public actual fun VarDateFromI8(i64in: Long, pdateout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarDateFromI8(i64in, pdateout)

public actual fun VarDateFromR4(fltin: Float, pdateout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarDateFromR4(fltin, pdateout)

public actual fun VarDateFromR8(dblin: Double, pdateout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarDateFromR8(dblin, pdateout)

public actual fun VarDateFromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, pdateout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarDateFromStr(strin, lcid.toInt(), dwflags.toInt(), pdateout)

public actual fun VarDateFromUI1(bin: UByte, pdateout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarDateFromUI1(bin.toByte(), pdateout)

public actual fun VarDateFromUI2(uiin: UShort, pdateout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarDateFromUI2(uiin.toShort(), pdateout)

public actual fun VarDateFromUI4(ulin: UInt, pdateout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarDateFromUI4(ulin.toInt(), pdateout)

public actual fun VarDateFromUI8(ui64in: ULong, pdateout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarDateFromUI8(ui64in.toLong(), pdateout)

public actual fun VarDateFromUdate(pudatein: Long, dwflags: UInt, pdateout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarDateFromUdate(pudatein, dwflags.toInt(), pdateout)

public actual fun VarDateFromUdateEx(pudatein: Long, lcid: UInt, dwflags: UInt, pdateout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarDateFromUdateEx(pudatein, lcid.toInt(), dwflags.toInt(), pdateout)

public actual fun VarDecAbs(pdecin: Long, pdecresult: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarDecAbs(pdecin, pdecresult)

public actual fun VarDecAdd(pdecleft: Long, pdecright: Long, pdecresult: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarDecAdd(pdecleft, pdecright, pdecresult)

public actual fun VarDecCmp(pdecleft: Long, pdecright: Long): VARCMP =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarDecCmp(pdecleft, pdecright).toUInt()

public actual fun VarDecCmpR8(pdecleft: Long, dblright: Double): VARCMP =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarDecCmpR8(pdecleft, dblright).toUInt()

public actual fun VarDecDiv(pdecleft: Long, pdecright: Long, pdecresult: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarDecDiv(pdecleft, pdecright, pdecresult)

public actual fun VarDecFix(pdecin: Long, pdecresult: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarDecFix(pdecin, pdecresult)

public actual fun VarDecFromBool(boolin: VARIANT_BOOL, pdecout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarDecFromBool(boolin, pdecout)

public actual fun VarDecFromCy(cyin: CY, pdecout: Long): HRESULT =
    0

public actual fun VarDecFromDate(datein: Double, pdecout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarDecFromDate(datein, pdecout)

public actual fun VarDecFromDisp(pdispin: Long, lcid: UInt, pdecout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarDecFromDisp(pdispin, lcid.toInt(), pdecout)

public actual fun VarDecFromI1(cin: Byte, pdecout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarDecFromI1(cin, pdecout)

public actual fun VarDecFromI2(uiin: Short, pdecout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarDecFromI2(uiin, pdecout)

public actual fun VarDecFromI4(lin: Int, pdecout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarDecFromI4(lin, pdecout)

public actual fun VarDecFromI8(i64in: Long, pdecout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarDecFromI8(i64in, pdecout)

public actual fun VarDecFromR4(fltin: Float, pdecout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarDecFromR4(fltin, pdecout)

public actual fun VarDecFromR8(dblin: Double, pdecout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarDecFromR8(dblin, pdecout)

public actual fun VarDecFromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, pdecout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarDecFromStr(strin, lcid.toInt(), dwflags.toInt(), pdecout)

public actual fun VarDecFromUI1(bin: UByte, pdecout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarDecFromUI1(bin.toByte(), pdecout)

public actual fun VarDecFromUI2(uiin: UShort, pdecout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarDecFromUI2(uiin.toShort(), pdecout)

public actual fun VarDecFromUI4(ulin: UInt, pdecout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarDecFromUI4(ulin.toInt(), pdecout)

public actual fun VarDecFromUI8(ui64in: ULong, pdecout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarDecFromUI8(ui64in.toLong(), pdecout)

public actual fun VarDecInt(pdecin: Long, pdecresult: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarDecInt(pdecin, pdecresult)

public actual fun VarDecMul(pdecleft: Long, pdecright: Long, pdecresult: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarDecMul(pdecleft, pdecright, pdecresult)

public actual fun VarDecNeg(pdecin: Long, pdecresult: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarDecNeg(pdecin, pdecresult)

public actual fun VarDecRound(pdecin: Long, cdecimals: Int, pdecresult: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarDecRound(pdecin, cdecimals, pdecresult)

public actual fun VarDecSub(pdecleft: Long, pdecright: Long, pdecresult: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarDecSub(pdecleft, pdecright, pdecresult)

public actual fun VarDiv(pvarleft: Long, pvarright: Long, pvarresult: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarDiv(pvarleft, pvarright, pvarresult)

public actual fun VarEqv(pvarleft: Long, pvarright: Long, pvarresult: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarEqv(pvarleft, pvarright, pvarresult)

public actual fun VarFix(pvarin: Long, pvarresult: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarFix(pvarin, pvarresult)

public actual fun VarFormat(pvarin: Long, pstrformat: PCWSTR, ifirstday: VARFORMAT_FIRST_DAY, ifirstweek: VARFORMAT_FIRST_WEEK, dwflags: UInt, pbstrout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarFormat(pvarin, pstrformat, ifirstday, ifirstweek, dwflags.toInt(), pbstrout)

public actual fun VarFormatCurrency(pvarin: Long, inumdig: Int, iinclead: Int, iuseparens: Int, igroup: Int, dwflags: UInt, pbstrout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarFormatCurrency(pvarin, inumdig, iinclead, iuseparens, igroup, dwflags.toInt(), pbstrout)

public actual fun VarFormatDateTime(pvarin: Long, inamedformat: VARFORMAT_NAMED_FORMAT, dwflags: UInt, pbstrout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarFormatDateTime(pvarin, inamedformat, dwflags.toInt(), pbstrout)

public actual fun VarFormatFromTokens(pvarin: Long, pstrformat: PCWSTR, pbtokcur: Long, dwflags: UInt, pbstrout: Long, lcid: UInt): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarFormatFromTokens(pvarin, pstrformat, pbtokcur, dwflags.toInt(), pbstrout, lcid.toInt())

public actual fun VarFormatNumber(pvarin: Long, inumdig: Int, iinclead: VARFORMAT_LEADING_DIGIT, iuseparens: VARFORMAT_PARENTHESES, igroup: VARFORMAT_GROUP, dwflags: UInt, pbstrout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarFormatNumber(pvarin, inumdig, iinclead, iuseparens, igroup, dwflags.toInt(), pbstrout)

public actual fun VarFormatPercent(pvarin: Long, inumdig: Int, iinclead: VARFORMAT_LEADING_DIGIT, iuseparens: VARFORMAT_PARENTHESES, igroup: VARFORMAT_GROUP, dwflags: UInt, pbstrout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarFormatPercent(pvarin, inumdig, iinclead, iuseparens, igroup, dwflags.toInt(), pbstrout)

public actual fun VarI1FromBool(boolin: VARIANT_BOOL, pcout: PSTR): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarI1FromBool(boolin, pcout)

public actual fun VarI1FromCy(cyin: CY, pcout: PSTR): HRESULT =
    0

public actual fun VarI1FromDate(datein: Double, pcout: PSTR): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarI1FromDate(datein, pcout)

public actual fun VarI1FromDec(pdecin: Long, pcout: PSTR): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarI1FromDec(pdecin, pcout)

public actual fun VarI1FromDisp(pdispin: Long, lcid: UInt, pcout: PSTR): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarI1FromDisp(pdispin, lcid.toInt(), pcout)

public actual fun VarI1FromI2(uiin: Short, pcout: PSTR): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarI1FromI2(uiin, pcout)

public actual fun VarI1FromI4(lin: Int, pcout: PSTR): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarI1FromI4(lin, pcout)

public actual fun VarI1FromI8(i64in: Long, pcout: PSTR): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarI1FromI8(i64in, pcout)

public actual fun VarI1FromR4(fltin: Float, pcout: PSTR): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarI1FromR4(fltin, pcout)

public actual fun VarI1FromR8(dblin: Double, pcout: PSTR): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarI1FromR8(dblin, pcout)

public actual fun VarI1FromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, pcout: PSTR): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarI1FromStr(strin, lcid.toInt(), dwflags.toInt(), pcout)

public actual fun VarI1FromUI1(bin: UByte, pcout: PSTR): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarI1FromUI1(bin.toByte(), pcout)

public actual fun VarI1FromUI2(uiin: UShort, pcout: PSTR): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarI1FromUI2(uiin.toShort(), pcout)

public actual fun VarI1FromUI4(ulin: UInt, pcout: PSTR): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarI1FromUI4(ulin.toInt(), pcout)

public actual fun VarI1FromUI8(i64in: ULong, pcout: PSTR): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarI1FromUI8(i64in.toLong(), pcout)

public actual fun VarI2FromBool(boolin: VARIANT_BOOL, psout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarI2FromBool(boolin, psout)

public actual fun VarI2FromCy(cyin: CY, psout: Long): HRESULT =
    0

public actual fun VarI2FromDate(datein: Double, psout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarI2FromDate(datein, psout)

public actual fun VarI2FromDec(pdecin: Long, psout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarI2FromDec(pdecin, psout)

public actual fun VarI2FromDisp(pdispin: Long, lcid: UInt, psout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarI2FromDisp(pdispin, lcid.toInt(), psout)

public actual fun VarI2FromI1(cin: Byte, psout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarI2FromI1(cin, psout)

public actual fun VarI2FromI4(lin: Int, psout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarI2FromI4(lin, psout)

public actual fun VarI2FromI8(i64in: Long, psout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarI2FromI8(i64in, psout)

public actual fun VarI2FromR4(fltin: Float, psout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarI2FromR4(fltin, psout)

public actual fun VarI2FromR8(dblin: Double, psout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarI2FromR8(dblin, psout)

public actual fun VarI2FromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, psout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarI2FromStr(strin, lcid.toInt(), dwflags.toInt(), psout)

public actual fun VarI2FromUI1(bin: UByte, psout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarI2FromUI1(bin.toByte(), psout)

public actual fun VarI2FromUI2(uiin: UShort, psout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarI2FromUI2(uiin.toShort(), psout)

public actual fun VarI2FromUI4(ulin: UInt, psout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarI2FromUI4(ulin.toInt(), psout)

public actual fun VarI2FromUI8(ui64in: ULong, psout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarI2FromUI8(ui64in.toLong(), psout)

public actual fun VarI4FromBool(boolin: VARIANT_BOOL, plout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarI4FromBool(boolin, plout)

public actual fun VarI4FromCy(cyin: CY, plout: Long): HRESULT =
    0

public actual fun VarI4FromDate(datein: Double, plout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarI4FromDate(datein, plout)

public actual fun VarI4FromDec(pdecin: Long, plout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarI4FromDec(pdecin, plout)

public actual fun VarI4FromDisp(pdispin: Long, lcid: UInt, plout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarI4FromDisp(pdispin, lcid.toInt(), plout)

public actual fun VarI4FromI1(cin: Byte, plout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarI4FromI1(cin, plout)

public actual fun VarI4FromI2(sin: Short, plout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarI4FromI2(sin, plout)

public actual fun VarI4FromI8(i64in: Long, plout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarI4FromI8(i64in, plout)

public actual fun VarI4FromR4(fltin: Float, plout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarI4FromR4(fltin, plout)

public actual fun VarI4FromR8(dblin: Double, plout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarI4FromR8(dblin, plout)

public actual fun VarI4FromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, plout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarI4FromStr(strin, lcid.toInt(), dwflags.toInt(), plout)

public actual fun VarI4FromUI1(bin: UByte, plout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarI4FromUI1(bin.toByte(), plout)

public actual fun VarI4FromUI2(uiin: UShort, plout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarI4FromUI2(uiin.toShort(), plout)

public actual fun VarI4FromUI4(ulin: UInt, plout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarI4FromUI4(ulin.toInt(), plout)

public actual fun VarI4FromUI8(ui64in: ULong, plout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarI4FromUI8(ui64in.toLong(), plout)

public actual fun VarI8FromBool(boolin: VARIANT_BOOL, pi64out: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarI8FromBool(boolin, pi64out)

public actual fun VarI8FromCy(cyin: CY, pi64out: Long): HRESULT =
    0

public actual fun VarI8FromDate(datein: Double, pi64out: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarI8FromDate(datein, pi64out)

public actual fun VarI8FromDec(pdecin: Long, pi64out: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarI8FromDec(pdecin, pi64out)

public actual fun VarI8FromDisp(pdispin: Long, lcid: UInt, pi64out: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarI8FromDisp(pdispin, lcid.toInt(), pi64out)

public actual fun VarI8FromI1(cin: Byte, pi64out: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarI8FromI1(cin, pi64out)

public actual fun VarI8FromI2(sin: Short, pi64out: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarI8FromI2(sin, pi64out)

public actual fun VarI8FromR4(fltin: Float, pi64out: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarI8FromR4(fltin, pi64out)

public actual fun VarI8FromR8(dblin: Double, pi64out: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarI8FromR8(dblin, pi64out)

public actual fun VarI8FromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, pi64out: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarI8FromStr(strin, lcid.toInt(), dwflags.toInt(), pi64out)

public actual fun VarI8FromUI1(bin: UByte, pi64out: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarI8FromUI1(bin.toByte(), pi64out)

public actual fun VarI8FromUI2(uiin: UShort, pi64out: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarI8FromUI2(uiin.toShort(), pi64out)

public actual fun VarI8FromUI4(ulin: UInt, pi64out: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarI8FromUI4(ulin.toInt(), pi64out)

public actual fun VarI8FromUI8(ui64in: ULong, pi64out: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarI8FromUI8(ui64in.toLong(), pi64out)

public actual fun VarIdiv(pvarleft: Long, pvarright: Long, pvarresult: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarIdiv(pvarleft, pvarright, pvarresult)

public actual fun VarImp(pvarleft: Long, pvarright: Long, pvarresult: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarImp(pvarleft, pvarright, pvarresult)

public actual fun VarInt(pvarin: Long, pvarresult: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarInt(pvarin, pvarresult)

public actual fun VarMod(pvarleft: Long, pvarright: Long, pvarresult: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarMod(pvarleft, pvarright, pvarresult)

public actual fun VarMonthName(imonth: Int, fabbrev: Int, dwflags: UInt, pbstrout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarMonthName(imonth, fabbrev, dwflags.toInt(), pbstrout)

public actual fun VarMul(pvarleft: Long, pvarright: Long, pvarresult: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarMul(pvarleft, pvarright, pvarresult)

public actual fun VarNeg(pvarin: Long, pvarresult: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarNeg(pvarin, pvarresult)

public actual fun VarNot(pvarin: Long, pvarresult: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarNot(pvarin, pvarresult)

public actual fun VarNumFromParseNum(pnumprs: Long, rgbdig: Long, dwvtbits: UInt, pvar: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarNumFromParseNum(pnumprs, rgbdig, dwvtbits.toInt(), pvar)

public actual fun VarOr(pvarleft: Long, pvarright: Long, pvarresult: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarOr(pvarleft, pvarright, pvarresult)

public actual fun VarParseNumFromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, pnumprs: Long, rgbdig: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarParseNumFromStr(strin, lcid.toInt(), dwflags.toInt(), pnumprs, rgbdig)

public actual fun VarPow(pvarleft: Long, pvarright: Long, pvarresult: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarPow(pvarleft, pvarright, pvarresult)

public actual fun VarR4CmpR8(fltleft: Float, dblright: Double): VARCMP =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarR4CmpR8(fltleft, dblright).toUInt()

public actual fun VarR4FromBool(boolin: VARIANT_BOOL, pfltout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarR4FromBool(boolin, pfltout)

public actual fun VarR4FromCy(cyin: CY, pfltout: Long): HRESULT =
    0

public actual fun VarR4FromDate(datein: Double, pfltout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarR4FromDate(datein, pfltout)

public actual fun VarR4FromDec(pdecin: Long, pfltout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarR4FromDec(pdecin, pfltout)

public actual fun VarR4FromDisp(pdispin: Long, lcid: UInt, pfltout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarR4FromDisp(pdispin, lcid.toInt(), pfltout)

public actual fun VarR4FromI1(cin: Byte, pfltout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarR4FromI1(cin, pfltout)

public actual fun VarR4FromI2(sin: Short, pfltout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarR4FromI2(sin, pfltout)

public actual fun VarR4FromI4(lin: Int, pfltout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarR4FromI4(lin, pfltout)

public actual fun VarR4FromI8(i64in: Long, pfltout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarR4FromI8(i64in, pfltout)

public actual fun VarR4FromR8(dblin: Double, pfltout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarR4FromR8(dblin, pfltout)

public actual fun VarR4FromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, pfltout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarR4FromStr(strin, lcid.toInt(), dwflags.toInt(), pfltout)

public actual fun VarR4FromUI1(bin: UByte, pfltout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarR4FromUI1(bin.toByte(), pfltout)

public actual fun VarR4FromUI2(uiin: UShort, pfltout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarR4FromUI2(uiin.toShort(), pfltout)

public actual fun VarR4FromUI4(ulin: UInt, pfltout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarR4FromUI4(ulin.toInt(), pfltout)

public actual fun VarR4FromUI8(ui64in: ULong, pfltout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarR4FromUI8(ui64in.toLong(), pfltout)

public actual fun VarR8FromBool(boolin: VARIANT_BOOL, pdblout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarR8FromBool(boolin, pdblout)

public actual fun VarR8FromCy(cyin: CY, pdblout: Long): HRESULT =
    0

public actual fun VarR8FromDate(datein: Double, pdblout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarR8FromDate(datein, pdblout)

public actual fun VarR8FromDec(pdecin: Long, pdblout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarR8FromDec(pdecin, pdblout)

public actual fun VarR8FromDisp(pdispin: Long, lcid: UInt, pdblout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarR8FromDisp(pdispin, lcid.toInt(), pdblout)

public actual fun VarR8FromI1(cin: Byte, pdblout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarR8FromI1(cin, pdblout)

public actual fun VarR8FromI2(sin: Short, pdblout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarR8FromI2(sin, pdblout)

public actual fun VarR8FromI4(lin: Int, pdblout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarR8FromI4(lin, pdblout)

public actual fun VarR8FromI8(i64in: Long, pdblout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarR8FromI8(i64in, pdblout)

public actual fun VarR8FromR4(fltin: Float, pdblout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarR8FromR4(fltin, pdblout)

public actual fun VarR8FromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, pdblout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarR8FromStr(strin, lcid.toInt(), dwflags.toInt(), pdblout)

public actual fun VarR8FromUI1(bin: UByte, pdblout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarR8FromUI1(bin.toByte(), pdblout)

public actual fun VarR8FromUI2(uiin: UShort, pdblout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarR8FromUI2(uiin.toShort(), pdblout)

public actual fun VarR8FromUI4(ulin: UInt, pdblout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarR8FromUI4(ulin.toInt(), pdblout)

public actual fun VarR8FromUI8(ui64in: ULong, pdblout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarR8FromUI8(ui64in.toLong(), pdblout)

public actual fun VarR8Pow(dblleft: Double, dblright: Double, pdblresult: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarR8Pow(dblleft, dblright, pdblresult)

public actual fun VarR8Round(dblin: Double, cdecimals: Int, pdblresult: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarR8Round(dblin, cdecimals, pdblresult)

public actual fun VarRound(pvarin: Long, cdecimals: Int, pvarresult: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarRound(pvarin, cdecimals, pvarresult)

public actual fun VarSub(pvarleft: Long, pvarright: Long, pvarresult: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarSub(pvarleft, pvarright, pvarresult)

public actual fun VarTokenizeFormatString(pstrformat: PCWSTR, rgbtok: Long, cbtok: Int, ifirstday: VARFORMAT_FIRST_DAY, ifirstweek: VARFORMAT_FIRST_WEEK, lcid: UInt, pcbactual: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarTokenizeFormatString(pstrformat, rgbtok, cbtok, ifirstday, ifirstweek, lcid.toInt(), pcbactual)

public actual fun VarUI1FromBool(boolin: VARIANT_BOOL, pbout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarUI1FromBool(boolin, pbout)

public actual fun VarUI1FromCy(cyin: CY, pbout: Long): HRESULT =
    0

public actual fun VarUI1FromDate(datein: Double, pbout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarUI1FromDate(datein, pbout)

public actual fun VarUI1FromDec(pdecin: Long, pbout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarUI1FromDec(pdecin, pbout)

public actual fun VarUI1FromDisp(pdispin: Long, lcid: UInt, pbout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarUI1FromDisp(pdispin, lcid.toInt(), pbout)

public actual fun VarUI1FromI1(cin: Byte, pbout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarUI1FromI1(cin, pbout)

public actual fun VarUI1FromI2(sin: Short, pbout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarUI1FromI2(sin, pbout)

public actual fun VarUI1FromI4(lin: Int, pbout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarUI1FromI4(lin, pbout)

public actual fun VarUI1FromI8(i64in: Long, pbout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarUI1FromI8(i64in, pbout)

public actual fun VarUI1FromR4(fltin: Float, pbout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarUI1FromR4(fltin, pbout)

public actual fun VarUI1FromR8(dblin: Double, pbout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarUI1FromR8(dblin, pbout)

public actual fun VarUI1FromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, pbout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarUI1FromStr(strin, lcid.toInt(), dwflags.toInt(), pbout)

public actual fun VarUI1FromUI2(uiin: UShort, pbout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarUI1FromUI2(uiin.toShort(), pbout)

public actual fun VarUI1FromUI4(ulin: UInt, pbout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarUI1FromUI4(ulin.toInt(), pbout)

public actual fun VarUI1FromUI8(ui64in: ULong, pbout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarUI1FromUI8(ui64in.toLong(), pbout)

public actual fun VarUI2FromBool(boolin: VARIANT_BOOL, puiout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarUI2FromBool(boolin, puiout)

public actual fun VarUI2FromCy(cyin: CY, puiout: Long): HRESULT =
    0

public actual fun VarUI2FromDate(datein: Double, puiout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarUI2FromDate(datein, puiout)

public actual fun VarUI2FromDec(pdecin: Long, puiout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarUI2FromDec(pdecin, puiout)

public actual fun VarUI2FromDisp(pdispin: Long, lcid: UInt, puiout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarUI2FromDisp(pdispin, lcid.toInt(), puiout)

public actual fun VarUI2FromI1(cin: Byte, puiout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarUI2FromI1(cin, puiout)

public actual fun VarUI2FromI2(uiin: Short, puiout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarUI2FromI2(uiin, puiout)

public actual fun VarUI2FromI4(lin: Int, puiout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarUI2FromI4(lin, puiout)

public actual fun VarUI2FromI8(i64in: Long, puiout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarUI2FromI8(i64in, puiout)

public actual fun VarUI2FromR4(fltin: Float, puiout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarUI2FromR4(fltin, puiout)

public actual fun VarUI2FromR8(dblin: Double, puiout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarUI2FromR8(dblin, puiout)

public actual fun VarUI2FromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, puiout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarUI2FromStr(strin, lcid.toInt(), dwflags.toInt(), puiout)

public actual fun VarUI2FromUI1(bin: UByte, puiout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarUI2FromUI1(bin.toByte(), puiout)

public actual fun VarUI2FromUI4(ulin: UInt, puiout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarUI2FromUI4(ulin.toInt(), puiout)

public actual fun VarUI2FromUI8(i64in: ULong, puiout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarUI2FromUI8(i64in.toLong(), puiout)

public actual fun VarUI4FromBool(boolin: VARIANT_BOOL, pulout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarUI4FromBool(boolin, pulout)

public actual fun VarUI4FromCy(cyin: CY, pulout: Long): HRESULT =
    0

public actual fun VarUI4FromDate(datein: Double, pulout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarUI4FromDate(datein, pulout)

public actual fun VarUI4FromDec(pdecin: Long, pulout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarUI4FromDec(pdecin, pulout)

public actual fun VarUI4FromDisp(pdispin: Long, lcid: UInt, pulout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarUI4FromDisp(pdispin, lcid.toInt(), pulout)

public actual fun VarUI4FromI1(cin: Byte, pulout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarUI4FromI1(cin, pulout)

public actual fun VarUI4FromI2(uiin: Short, pulout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarUI4FromI2(uiin, pulout)

public actual fun VarUI4FromI4(lin: Int, pulout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarUI4FromI4(lin, pulout)

public actual fun VarUI4FromI8(i64in: Long, plout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarUI4FromI8(i64in, plout)

public actual fun VarUI4FromR4(fltin: Float, pulout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarUI4FromR4(fltin, pulout)

public actual fun VarUI4FromR8(dblin: Double, pulout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarUI4FromR8(dblin, pulout)

public actual fun VarUI4FromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, pulout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarUI4FromStr(strin, lcid.toInt(), dwflags.toInt(), pulout)

public actual fun VarUI4FromUI1(bin: UByte, pulout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarUI4FromUI1(bin.toByte(), pulout)

public actual fun VarUI4FromUI2(uiin: UShort, pulout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarUI4FromUI2(uiin.toShort(), pulout)

public actual fun VarUI4FromUI8(ui64in: ULong, plout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarUI4FromUI8(ui64in.toLong(), plout)

public actual fun VarUI8FromBool(boolin: VARIANT_BOOL, pi64out: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarUI8FromBool(boolin, pi64out)

public actual fun VarUI8FromCy(cyin: CY, pi64out: Long): HRESULT =
    0

public actual fun VarUI8FromDate(datein: Double, pi64out: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarUI8FromDate(datein, pi64out)

public actual fun VarUI8FromDec(pdecin: Long, pi64out: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarUI8FromDec(pdecin, pi64out)

public actual fun VarUI8FromDisp(pdispin: Long, lcid: UInt, pi64out: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarUI8FromDisp(pdispin, lcid.toInt(), pi64out)

public actual fun VarUI8FromI1(cin: Byte, pi64out: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarUI8FromI1(cin, pi64out)

public actual fun VarUI8FromI2(sin: Short, pi64out: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarUI8FromI2(sin, pi64out)

public actual fun VarUI8FromI8(ui64in: Long, pi64out: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarUI8FromI8(ui64in, pi64out)

public actual fun VarUI8FromR4(fltin: Float, pi64out: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarUI8FromR4(fltin, pi64out)

public actual fun VarUI8FromR8(dblin: Double, pi64out: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarUI8FromR8(dblin, pi64out)

public actual fun VarUI8FromStr(strin: PCWSTR, lcid: UInt, dwflags: UInt, pi64out: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarUI8FromStr(strin, lcid.toInt(), dwflags.toInt(), pi64out)

public actual fun VarUI8FromUI1(bin: UByte, pi64out: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarUI8FromUI1(bin.toByte(), pi64out)

public actual fun VarUI8FromUI2(uiin: UShort, pi64out: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarUI8FromUI2(uiin.toShort(), pi64out)

public actual fun VarUI8FromUI4(ulin: UInt, pi64out: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarUI8FromUI4(ulin.toInt(), pi64out)

public actual fun VarUdateFromDate(datein: Double, dwflags: UInt, pudateout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarUdateFromDate(datein, dwflags.toInt(), pudateout)

public actual fun VarWeekdayName(iweekday: Int, fabbrev: Int, ifirstday: Int, dwflags: UInt, pbstrout: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarWeekdayName(iweekday, fabbrev, ifirstday, dwflags.toInt(), pbstrout)

public actual fun VarXor(pvarleft: Long, pvarright: Long, pvarresult: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VarXor(pvarleft, pvarright, pvarresult)

public actual fun VectorFromBstr(bstr: BSTR, ppsa: Long): HRESULT =
    WindowsWin32SystemOleJniBridge.windowssys_windows_win32_system_ole_VectorFromBstr(bstr, ppsa)
