@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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
import io.github.kotlinmania.windowssys.windows.win32.system.variant.Varenum
import io.github.kotlinmania.windowssys.windows.win32.system.variant.Variant
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Haccel
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Hcursor
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Hicon
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Hmenu

private object WindowsWin32SystemOleJniBridge {
    init {
        loadNativeLibrary()
    }

    private fun loadNativeLibrary() {
        val osRaw = System.getProperty("os.name", "").lowercase()
        val archRaw = System.getProperty("os.arch", "").lowercase()
        val hostPlatform =
            when {
                osRaw.contains("win") -> "windows"
                osRaw.contains("mac") || osRaw.contains("darwin") -> "macos"
                else -> "linux"
            }
        val hostArch =
            when {
                archRaw == "aarch64" || archRaw == "arm64" -> "aarch64"
                archRaw == "amd64" || archRaw == "x86_64" -> "x86_64"
                else -> archRaw
            }
        val libFileName =
            when (hostPlatform) {
                "windows" -> "windowssys_jni.dll"
                "macos" -> "libwindowssys_jni.dylib"
                else -> "libwindowssys_jni.so"
            }
        val pathSep = System.getProperty("path.separator", ":")
        val libPathProp = System.getProperty("java.library.path", "")
        for (dirEntry in libPathProp.split(pathSep)) {
            if (dirEntry.isEmpty()) continue
            val candidate = java.io.File(dirEntry, libFileName)
            if (candidate.isFile) {
                System.load(candidate.absolutePath)
                return
            }
        }
        val resourcePath = "io/github/kotlinmania/windowssys/native/$hostPlatform-$hostArch/$libFileName"
        val stream = WindowsWin32SystemOleJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
        if (stream != null) {
            val suffix = "." + libFileName.substringAfterLast('.')
            val extracted =
                java.nio.file.Files
                    .createTempFile("windowssys_jni-", suffix)
                    .toFile()
            extracted.deleteOnExit()
            stream.use { input ->
                extracted.outputStream().use { output ->
                    input.copyTo(output)
                }
            }
            System.load(extracted.absolutePath)
            return
        }
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleBstrFromVector(psa: Long, pbstr: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleClearCustData(pcustdata: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleCreateDispTypeInfo(pidata: Long, lcid: Int, pptinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleCreateErrorInfo(pperrinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleCreateOleAdviseHolder(ppoaholder: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleCreateStdDispatch(punkouter: Long, pvthis: Long, ptinfo: Long, ppunkstddisp: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleCreateTypeLib(syskind: Int, szfile: Long, ppctlib: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleCreateTypeLib2(syskind: Int, szfile: Long, ppctlib: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleDispCallFunc(pvinstance: Long, ovft: Long, cc: Int, vtreturn: Short, cactuals: Int, prgvt: Long, prgpvarg: Long, pvargresult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleDispGetIDsOfNames(ptinfo: Long, rgsznames: Long, cnames: Int, rgdispid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleDispGetParam(pdispparams: Long, position: Int, vttarg: Short, pvarresult: Long, puargerr: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleDispInvoke(thisRef: Long, ptinfo: Long, dispidmember: Int, wflags: Short, pparams: Long, pvarresult: Long, pexcepinfo: Long, puargerr: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleDoDragDrop(pdataobj: Long, pdropsource: Long, dwokeffects: Int, pdweffect: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleGetActiveObject(rclsid: Long, pvreserved: Long, ppunk: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleGetAltMonthNames(lcid: Int, prgp: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleGetRecordInfoFromGuids(rguidtypelib: Long, uvermajor: Int, uverminor: Int, lcid: Int, rguidtypeinfo: Long, pprecinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleGetRecordInfoFromTypeInfo(ptypeinfo: Long, pprecinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleHrgnUserFree(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleHrgnUserFree64(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleHrgnUserMarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleHrgnUserMarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleHrgnUserSize(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleHrgnUserSize64(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleHrgnUserUnmarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleHrgnUserUnmarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleIsAccelerator(haccel: Long, caccelentries: Int, lpmsg: Long, lpwcmd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleLHashValOfNameSys(syskind: Int, lcid: Int, szname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleLHashValOfNameSysA(syskind: Int, lcid: Int, szname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleLoadRegTypeLib(rguid: Long, wvermajor: Short, wverminor: Short, lcid: Int, pptlib: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleLoadTypeLib(szfile: Long, pptlib: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleLoadTypeLibEx(szfile: Long, regkind: Int, pptlib: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOaBuildVersion(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOaEnablePerUserTLibRegistration()

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleBuildVersion(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleConvertOLESTREAMToIStorage2(lpolestream: Long, pstg: Long, ptd: Long, opt: Int, pvcallbackcontext: Long, pqueryconvertolelinkcallback: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleConvertOLESTREAMToIStorageEx2(polestm: Long, pstg: Long, pcfformat: Long, plwwidth: Long, plheight: Long, pdwsize: Long, pmedium: Long, opt: Int, pvcallbackcontext: Long, pqueryconvertolelinkcallback: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleCreate(rclsid: Long, riid: Long, renderopt: Int, pformatetc: Long, pclientsite: Long, pstg: Long, ppvobj: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleCreateDefaultHandler(clsid: Long, punkouter: Long, riid: Long, lplpobj: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleCreateEmbeddingHelper(clsid: Long, punkouter: Long, flags: Int, pcf: Long, riid: Long, lplpobj: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleCreateEx(rclsid: Long, riid: Long, dwflags: Int, renderopt: Int, cformats: Int, rgadvf: Long, rgformatetc: Long, lpadvisesink: Long, rgdwconnection: Long, pclientsite: Long, pstg: Long, ppvobj: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleCreateFontIndirect(lpfontdesc: Long, riid: Long, lplpvobj: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleCreateFromData(psrcdataobj: Long, riid: Long, renderopt: Int, pformatetc: Long, pclientsite: Long, pstg: Long, ppvobj: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleCreateFromDataEx(psrcdataobj: Long, riid: Long, dwflags: Int, renderopt: Int, cformats: Int, rgadvf: Long, rgformatetc: Long, lpadvisesink: Long, rgdwconnection: Long, pclientsite: Long, pstg: Long, ppvobj: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleCreateFromFile(rclsid: Long, lpszfilename: Long, riid: Long, renderopt: Int, lpformatetc: Long, pclientsite: Long, pstg: Long, ppvobj: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleCreateFromFileEx(rclsid: Long, lpszfilename: Long, riid: Long, dwflags: Int, renderopt: Int, cformats: Int, rgadvf: Long, rgformatetc: Long, lpadvisesink: Long, rgdwconnection: Long, pclientsite: Long, pstg: Long, ppvobj: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleCreateLink(pmklinksrc: Long, riid: Long, renderopt: Int, lpformatetc: Long, pclientsite: Long, pstg: Long, ppvobj: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleCreateLinkEx(pmklinksrc: Long, riid: Long, dwflags: Int, renderopt: Int, cformats: Int, rgadvf: Long, rgformatetc: Long, lpadvisesink: Long, rgdwconnection: Long, pclientsite: Long, pstg: Long, ppvobj: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleCreateLinkFromData(psrcdataobj: Long, riid: Long, renderopt: Int, pformatetc: Long, pclientsite: Long, pstg: Long, ppvobj: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleCreateLinkFromDataEx(psrcdataobj: Long, riid: Long, dwflags: Int, renderopt: Int, cformats: Int, rgadvf: Long, rgformatetc: Long, lpadvisesink: Long, rgdwconnection: Long, pclientsite: Long, pstg: Long, ppvobj: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleCreateLinkToFile(lpszfilename: Long, riid: Long, renderopt: Int, lpformatetc: Long, pclientsite: Long, pstg: Long, ppvobj: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleCreateLinkToFileEx(lpszfilename: Long, riid: Long, dwflags: Int, renderopt: Int, cformats: Int, rgadvf: Long, rgformatetc: Long, lpadvisesink: Long, rgdwconnection: Long, pclientsite: Long, pstg: Long, ppvobj: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleCreateMenuDescriptor(hmenucombined: Long, lpmenuwidths: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleCreatePictureIndirect(lppictdesc: Long, riid: Long, fown: Int, lplpvobj: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleCreatePropertyFrame(hwndowner: Long, x: Int, y: Int, lpszcaption: Long, cobjects: Int, ppunk: Long, cpages: Int, ppageclsid: Long, lcid: Int, dwreserved: Int, pvreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleCreatePropertyFrameIndirect(lpparams: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleCreateStaticFromData(psrcdataobj: Long, iid: Long, renderopt: Int, pformatetc: Long, pclientsite: Long, pstg: Long, ppvobj: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleDestroyMenuDescriptor(holemenu: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleDoAutoConvert(pstg: Long, pclsidnew: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleDraw(punknown: Long, dwaspect: Int, hdcdraw: Long, lprcbounds: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleDuplicateData(hsrc: Long, cfformat: Short, uiflags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleFlushClipboard(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleGetAutoConvert(clsidold: Long, pclsidnew: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleGetClipboard(ppdataobj: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleGetClipboardWithEnterpriseInfo(dataobject: Long, dataenterpriseid: Long, sourcedescription: Long, targetdescription: Long, datadescription: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleGetIconOfClass(rclsid: Long, lpszlabel: Long, fusetypeaslabel: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleGetIconOfFile(lpszpath: Long, fusefileaslabel: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleIconToCursor(hinstexe: Long, hicon: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleInitialize(pvreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleIsCurrentClipboard(pdataobj: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleIsRunning(pobject: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleLoad(pstg: Long, riid: Long, pclientsite: Long, ppvobj: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleLoadFromStream(pstm: Long, iidinterface: Long, ppvobj: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleLoadPicture(lpstream: Long, lsize: Int, frunmode: Int, riid: Long, lplpvobj: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleLoadPictureEx(lpstream: Long, lsize: Int, frunmode: Int, riid: Long, xsizedesired: Int, ysizedesired: Int, dwflags: Int, lplpvobj: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleLoadPicturePath(szurlorpath: Long, punkcaller: Long, dwreserved: Int, clrreserved: Int, riid: Long, ppvret: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleLockRunning(punknown: Long, flock: Int, flastunlockcloses: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleMetafilePictFromIconAndLabel(hicon: Long, lpszlabel: Long, lpszsourcefile: Long, iiconindex: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleNoteObjectVisible(punknown: Long, fvisible: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleQueryCreateFromData(psrcdataobject: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleQueryLinkFromData(psrcdataobject: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleRegEnumFormatEtc(clsid: Long, dwdirection: Int, ppenum: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleRegEnumVerbs(clsid: Long, ppenum: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleRegGetMiscStatus(clsid: Long, dwaspect: Int, pdwstatus: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleRegGetUserType(clsid: Long, dwformoftype: Int, pszusertype: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleRun(punknown: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleSave(pps: Long, pstg: Long, fsameasload: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleSavePictureFile(lpdisppicture: Long, bstrfilename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleSaveToStream(ppstm: Long, pstm: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleSetAutoConvert(clsidold: Long, clsidnew: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleSetClipboard(pdataobj: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleSetContainedObject(punknown: Long, fcontained: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleSetMenuDescriptor(holemenu: Long, hwndframe: Long, hwndactiveobject: Long, lpframe: Long, lpactiveobj: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleTranslateAccelerator(lpframe: Long, lpframeinfo: Long, lpmsg: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleTranslateColor(clr: Int, hpal: Long, lpcolorref: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleUIAddVerbMenuA(lpoleobj: Long, lpszshorttype: Long, hmenu: Long, upos: Int, uidverbmin: Int, uidverbmax: Int, baddconvert: Int, idconvert: Int, lphmenu: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleUIAddVerbMenuW(lpoleobj: Long, lpszshorttype: Long, hmenu: Long, upos: Int, uidverbmin: Int, uidverbmax: Int, baddconvert: Int, idconvert: Int, lphmenu: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleUIBusyA(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleUIBusyW(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleUICanConvertOrActivateAs(rclsid: Long, fislinkedobject: Int, wformat: Short): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleUIChangeIconA(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleUIChangeIconW(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleUIChangeSourceA(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleUIChangeSourceW(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleUIConvertA(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleUIConvertW(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleUIEditLinksA(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleUIEditLinksW(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleUIInsertObjectA(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleUIInsertObjectW(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleUIObjectPropertiesA(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleUIObjectPropertiesW(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleUIPasteSpecialA(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleUIPasteSpecialW(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleUIPromptUserA(ntemplate: Int, hwndparent: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleUIPromptUserW(ntemplate: Int, hwndparent: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleUIUpdateLinksA(lpoleuilinkcntr: Long, hwndparent: Long, lpsztitle: Long, clinks: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleUIUpdateLinksW(lpoleuilinkcntr: Long, hwndparent: Long, lpsztitle: Long, clinks: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleOleUninitialize()

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleQueryPathOfRegTypeLib(guid: Long, wmaj: Short, wmin: Short, lcid: Int, lpbstrpathname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleRegisterActiveObject(punk: Long, rclsid: Long, dwflags: Int, pdwregister: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleRegisterDragDrop(hwnd: Long, pdroptarget: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleRegisterTypeLib(ptlib: Long, szfullpath: Long, szhelpdir: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleRegisterTypeLibForUser(ptlib: Long, szfullpath: Long, szhelpdir: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleReleaseStgMedium(param0: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleRevokeActiveObject(dwregister: Int, pvreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleRevokeDragDrop(hwnd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleSafeArrayAccessData(psa: Long, ppvdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleSafeArrayAddRef(psa: Long, ppdatatorelease: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleSafeArrayAllocData(psa: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleSafeArrayAllocDescriptor(cdims: Int, ppsaout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleSafeArrayAllocDescriptorEx(vt: Short, cdims: Int, ppsaout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleSafeArrayCopy(psa: Long, ppsaout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleSafeArrayCopyData(psasource: Long, psatarget: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleSafeArrayCreate(vt: Short, cdims: Int, rgsabound: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleSafeArrayCreateEx(vt: Short, cdims: Int, rgsabound: Long, pvextra: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleSafeArrayCreateVector(vt: Short, llbound: Int, celements: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleSafeArrayCreateVectorEx(vt: Short, llbound: Int, celements: Int, pvextra: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleSafeArrayDestroy(psa: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleSafeArrayDestroyData(psa: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleSafeArrayDestroyDescriptor(psa: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleSafeArrayGetDim(psa: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleSafeArrayGetElement(psa: Long, rgindices: Long, pv: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleSafeArrayGetElemsize(psa: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleSafeArrayGetIID(psa: Long, pguid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleSafeArrayGetLBound(psa: Long, ndim: Int, pllbound: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleSafeArrayGetRecordInfo(psa: Long, prinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleSafeArrayGetUBound(psa: Long, ndim: Int, plubound: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleSafeArrayGetVartype(psa: Long, pvt: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleSafeArrayLock(psa: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleSafeArrayPtrOfIndex(psa: Long, rgindices: Long, ppvdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleSafeArrayPutElement(psa: Long, rgindices: Long, pv: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleSafeArrayRedim(psa: Long, psaboundnew: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleSafeArrayReleaseData(pdata: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleSafeArrayReleaseDescriptor(psa: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleSafeArraySetIID(psa: Long, guid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleSafeArraySetRecordInfo(psa: Long, prinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleSafeArrayUnaccessData(psa: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleSafeArrayUnlock(psa: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleUnRegisterTypeLib(libid: Long, wvermajor: Short, wverminor: Short, lcid: Int, syskind: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleUnRegisterTypeLibForUser(libid: Long, wmajorvernum: Short, wminorvernum: Short, lcid: Int, syskind: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarAbs(pvarin: Long, pvarresult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarAdd(pvarleft: Long, pvarright: Long, pvarresult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarAnd(pvarleft: Long, pvarright: Long, pvarresult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarBoolFromDate(datein: Double, pboolout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarBoolFromDec(pdecin: Long, pboolout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarBoolFromDisp(pdispin: Long, lcid: Int, pboolout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarBoolFromI1(cin: Byte, pboolout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarBoolFromI2(sin: Short, pboolout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarBoolFromI4(lin: Int, pboolout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarBoolFromI8(i64in: Long, pboolout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarBoolFromR4(fltin: Float, pboolout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarBoolFromR8(dblin: Double, pboolout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarBoolFromStr(strin: Long, lcid: Int, dwflags: Int, pboolout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarBoolFromUI1(bin: Byte, pboolout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarBoolFromUI2(uiin: Short, pboolout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarBoolFromUI4(ulin: Int, pboolout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarBoolFromUI8(i64in: Long, pboolout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarBstrCat(bstrleft: Long, bstrright: Long, pbstrresult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarBstrCmp(bstrleft: Long, bstrright: Long, lcid: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarBstrFromBool(boolin: Short, lcid: Int, dwflags: Int, pbstrout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarBstrFromDate(datein: Double, lcid: Int, dwflags: Int, pbstrout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarBstrFromDec(pdecin: Long, lcid: Int, dwflags: Int, pbstrout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarBstrFromDisp(pdispin: Long, lcid: Int, dwflags: Int, pbstrout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarBstrFromI1(cin: Byte, lcid: Int, dwflags: Int, pbstrout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarBstrFromI2(ival: Short, lcid: Int, dwflags: Int, pbstrout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarBstrFromI4(lin: Int, lcid: Int, dwflags: Int, pbstrout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarBstrFromI8(i64in: Long, lcid: Int, dwflags: Int, pbstrout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarBstrFromR4(fltin: Float, lcid: Int, dwflags: Int, pbstrout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarBstrFromR8(dblin: Double, lcid: Int, dwflags: Int, pbstrout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarBstrFromUI1(bval: Byte, lcid: Int, dwflags: Int, pbstrout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarBstrFromUI2(uiin: Short, lcid: Int, dwflags: Int, pbstrout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarBstrFromUI4(ulin: Int, lcid: Int, dwflags: Int, pbstrout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarBstrFromUI8(ui64in: Long, lcid: Int, dwflags: Int, pbstrout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarCat(pvarleft: Long, pvarright: Long, pvarresult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarCmp(pvarleft: Long, pvarright: Long, lcid: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarCyFromBool(boolin: Short, pcyout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarCyFromDate(datein: Double, pcyout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarCyFromDec(pdecin: Long, pcyout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarCyFromDisp(pdispin: Long, lcid: Int, pcyout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarCyFromI1(cin: Byte, pcyout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarCyFromI2(sin: Short, pcyout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarCyFromI4(lin: Int, pcyout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarCyFromI8(i64in: Long, pcyout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarCyFromR4(fltin: Float, pcyout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarCyFromR8(dblin: Double, pcyout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarCyFromStr(strin: Long, lcid: Int, dwflags: Int, pcyout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarCyFromUI1(bin: Byte, pcyout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarCyFromUI2(uiin: Short, pcyout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarCyFromUI4(ulin: Int, pcyout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarCyFromUI8(ui64in: Long, pcyout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarDateFromBool(boolin: Short, pdateout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarDateFromDec(pdecin: Long, pdateout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarDateFromDisp(pdispin: Long, lcid: Int, pdateout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarDateFromI1(cin: Byte, pdateout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarDateFromI2(sin: Short, pdateout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarDateFromI4(lin: Int, pdateout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarDateFromI8(i64in: Long, pdateout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarDateFromR4(fltin: Float, pdateout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarDateFromR8(dblin: Double, pdateout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarDateFromStr(strin: Long, lcid: Int, dwflags: Int, pdateout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarDateFromUI1(bin: Byte, pdateout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarDateFromUI2(uiin: Short, pdateout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarDateFromUI4(ulin: Int, pdateout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarDateFromUI8(ui64in: Long, pdateout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarDateFromUdate(pudatein: Long, dwflags: Int, pdateout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarDateFromUdateEx(pudatein: Long, lcid: Int, dwflags: Int, pdateout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarDecAbs(pdecin: Long, pdecresult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarDecAdd(pdecleft: Long, pdecright: Long, pdecresult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarDecCmp(pdecleft: Long, pdecright: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarDecCmpR8(pdecleft: Long, dblright: Double): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarDecDiv(pdecleft: Long, pdecright: Long, pdecresult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarDecFix(pdecin: Long, pdecresult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarDecFromBool(boolin: Short, pdecout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarDecFromDate(datein: Double, pdecout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarDecFromDisp(pdispin: Long, lcid: Int, pdecout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarDecFromI1(cin: Byte, pdecout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarDecFromI2(uiin: Short, pdecout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarDecFromI4(lin: Int, pdecout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarDecFromI8(i64in: Long, pdecout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarDecFromR4(fltin: Float, pdecout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarDecFromR8(dblin: Double, pdecout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarDecFromStr(strin: Long, lcid: Int, dwflags: Int, pdecout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarDecFromUI1(bin: Byte, pdecout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarDecFromUI2(uiin: Short, pdecout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarDecFromUI4(ulin: Int, pdecout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarDecFromUI8(ui64in: Long, pdecout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarDecInt(pdecin: Long, pdecresult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarDecMul(pdecleft: Long, pdecright: Long, pdecresult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarDecNeg(pdecin: Long, pdecresult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarDecRound(pdecin: Long, cdecimals: Int, pdecresult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarDecSub(pdecleft: Long, pdecright: Long, pdecresult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarDiv(pvarleft: Long, pvarright: Long, pvarresult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarEqv(pvarleft: Long, pvarright: Long, pvarresult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarFix(pvarin: Long, pvarresult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarFormat(pvarin: Long, pstrformat: Long, ifirstday: Int, ifirstweek: Int, dwflags: Int, pbstrout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarFormatCurrency(pvarin: Long, inumdig: Int, iinclead: Int, iuseparens: Int, igroup: Int, dwflags: Int, pbstrout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarFormatDateTime(pvarin: Long, inamedformat: Int, dwflags: Int, pbstrout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarFormatFromTokens(pvarin: Long, pstrformat: Long, pbtokcur: Long, dwflags: Int, pbstrout: Long, lcid: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarFormatNumber(pvarin: Long, inumdig: Int, iinclead: Int, iuseparens: Int, igroup: Int, dwflags: Int, pbstrout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarFormatPercent(pvarin: Long, inumdig: Int, iinclead: Int, iuseparens: Int, igroup: Int, dwflags: Int, pbstrout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarI1FromBool(boolin: Short, pcout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarI1FromDate(datein: Double, pcout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarI1FromDec(pdecin: Long, pcout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarI1FromDisp(pdispin: Long, lcid: Int, pcout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarI1FromI2(uiin: Short, pcout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarI1FromI4(lin: Int, pcout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarI1FromI8(i64in: Long, pcout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarI1FromR4(fltin: Float, pcout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarI1FromR8(dblin: Double, pcout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarI1FromStr(strin: Long, lcid: Int, dwflags: Int, pcout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarI1FromUI1(bin: Byte, pcout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarI1FromUI2(uiin: Short, pcout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarI1FromUI4(ulin: Int, pcout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarI1FromUI8(i64in: Long, pcout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarI2FromBool(boolin: Short, psout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarI2FromDate(datein: Double, psout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarI2FromDec(pdecin: Long, psout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarI2FromDisp(pdispin: Long, lcid: Int, psout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarI2FromI1(cin: Byte, psout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarI2FromI4(lin: Int, psout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarI2FromI8(i64in: Long, psout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarI2FromR4(fltin: Float, psout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarI2FromR8(dblin: Double, psout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarI2FromStr(strin: Long, lcid: Int, dwflags: Int, psout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarI2FromUI1(bin: Byte, psout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarI2FromUI2(uiin: Short, psout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarI2FromUI4(ulin: Int, psout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarI2FromUI8(ui64in: Long, psout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarI4FromBool(boolin: Short, plout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarI4FromDate(datein: Double, plout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarI4FromDec(pdecin: Long, plout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarI4FromDisp(pdispin: Long, lcid: Int, plout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarI4FromI1(cin: Byte, plout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarI4FromI2(sin: Short, plout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarI4FromI8(i64in: Long, plout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarI4FromR4(fltin: Float, plout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarI4FromR8(dblin: Double, plout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarI4FromStr(strin: Long, lcid: Int, dwflags: Int, plout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarI4FromUI1(bin: Byte, plout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarI4FromUI2(uiin: Short, plout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarI4FromUI4(ulin: Int, plout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarI4FromUI8(ui64in: Long, plout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarI8FromBool(boolin: Short, pi64out: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarI8FromDate(datein: Double, pi64out: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarI8FromDec(pdecin: Long, pi64out: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarI8FromDisp(pdispin: Long, lcid: Int, pi64out: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarI8FromI1(cin: Byte, pi64out: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarI8FromI2(sin: Short, pi64out: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarI8FromR4(fltin: Float, pi64out: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarI8FromR8(dblin: Double, pi64out: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarI8FromStr(strin: Long, lcid: Int, dwflags: Int, pi64out: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarI8FromUI1(bin: Byte, pi64out: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarI8FromUI2(uiin: Short, pi64out: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarI8FromUI4(ulin: Int, pi64out: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarI8FromUI8(ui64in: Long, pi64out: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarIdiv(pvarleft: Long, pvarright: Long, pvarresult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarImp(pvarleft: Long, pvarright: Long, pvarresult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarInt(pvarin: Long, pvarresult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarMod(pvarleft: Long, pvarright: Long, pvarresult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarMonthName(imonth: Int, fabbrev: Int, dwflags: Int, pbstrout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarMul(pvarleft: Long, pvarright: Long, pvarresult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarNeg(pvarin: Long, pvarresult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarNot(pvarin: Long, pvarresult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarNumFromParseNum(pnumprs: Long, rgbdig: Long, dwvtbits: Int, pvar: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarOr(pvarleft: Long, pvarright: Long, pvarresult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarParseNumFromStr(strin: Long, lcid: Int, dwflags: Int, pnumprs: Long, rgbdig: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarPow(pvarleft: Long, pvarright: Long, pvarresult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarR4CmpR8(fltleft: Float, dblright: Double): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarR4FromBool(boolin: Short, pfltout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarR4FromDate(datein: Double, pfltout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarR4FromDec(pdecin: Long, pfltout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarR4FromDisp(pdispin: Long, lcid: Int, pfltout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarR4FromI1(cin: Byte, pfltout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarR4FromI2(sin: Short, pfltout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarR4FromI4(lin: Int, pfltout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarR4FromI8(i64in: Long, pfltout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarR4FromR8(dblin: Double, pfltout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarR4FromStr(strin: Long, lcid: Int, dwflags: Int, pfltout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarR4FromUI1(bin: Byte, pfltout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarR4FromUI2(uiin: Short, pfltout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarR4FromUI4(ulin: Int, pfltout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarR4FromUI8(ui64in: Long, pfltout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarR8FromBool(boolin: Short, pdblout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarR8FromDate(datein: Double, pdblout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarR8FromDec(pdecin: Long, pdblout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarR8FromDisp(pdispin: Long, lcid: Int, pdblout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarR8FromI1(cin: Byte, pdblout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarR8FromI2(sin: Short, pdblout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarR8FromI4(lin: Int, pdblout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarR8FromI8(i64in: Long, pdblout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarR8FromR4(fltin: Float, pdblout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarR8FromStr(strin: Long, lcid: Int, dwflags: Int, pdblout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarR8FromUI1(bin: Byte, pdblout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarR8FromUI2(uiin: Short, pdblout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarR8FromUI4(ulin: Int, pdblout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarR8FromUI8(ui64in: Long, pdblout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarR8Pow(dblleft: Double, dblright: Double, pdblresult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarR8Round(dblin: Double, cdecimals: Int, pdblresult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarRound(pvarin: Long, cdecimals: Int, pvarresult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarSub(pvarleft: Long, pvarright: Long, pvarresult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarTokenizeFormatString(pstrformat: Long, rgbtok: Long, cbtok: Int, ifirstday: Int, ifirstweek: Int, lcid: Int, pcbactual: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarUI1FromBool(boolin: Short, pbout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarUI1FromDate(datein: Double, pbout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarUI1FromDec(pdecin: Long, pbout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarUI1FromDisp(pdispin: Long, lcid: Int, pbout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarUI1FromI1(cin: Byte, pbout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarUI1FromI2(sin: Short, pbout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarUI1FromI4(lin: Int, pbout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarUI1FromI8(i64in: Long, pbout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarUI1FromR4(fltin: Float, pbout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarUI1FromR8(dblin: Double, pbout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarUI1FromStr(strin: Long, lcid: Int, dwflags: Int, pbout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarUI1FromUI2(uiin: Short, pbout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarUI1FromUI4(ulin: Int, pbout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarUI1FromUI8(ui64in: Long, pbout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarUI2FromBool(boolin: Short, puiout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarUI2FromDate(datein: Double, puiout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarUI2FromDec(pdecin: Long, puiout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarUI2FromDisp(pdispin: Long, lcid: Int, puiout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarUI2FromI1(cin: Byte, puiout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarUI2FromI2(uiin: Short, puiout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarUI2FromI4(lin: Int, puiout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarUI2FromI8(i64in: Long, puiout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarUI2FromR4(fltin: Float, puiout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarUI2FromR8(dblin: Double, puiout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarUI2FromStr(strin: Long, lcid: Int, dwflags: Int, puiout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarUI2FromUI1(bin: Byte, puiout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarUI2FromUI4(ulin: Int, puiout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarUI2FromUI8(i64in: Long, puiout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarUI4FromBool(boolin: Short, pulout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarUI4FromDate(datein: Double, pulout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarUI4FromDec(pdecin: Long, pulout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarUI4FromDisp(pdispin: Long, lcid: Int, pulout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarUI4FromI1(cin: Byte, pulout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarUI4FromI2(uiin: Short, pulout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarUI4FromI4(lin: Int, pulout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarUI4FromI8(i64in: Long, plout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarUI4FromR4(fltin: Float, pulout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarUI4FromR8(dblin: Double, pulout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarUI4FromStr(strin: Long, lcid: Int, dwflags: Int, pulout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarUI4FromUI1(bin: Byte, pulout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarUI4FromUI2(uiin: Short, pulout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarUI4FromUI8(ui64in: Long, plout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarUI8FromBool(boolin: Short, pi64out: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarUI8FromDate(datein: Double, pi64out: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarUI8FromDec(pdecin: Long, pi64out: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarUI8FromDisp(pdispin: Long, lcid: Int, pi64out: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarUI8FromI1(cin: Byte, pi64out: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarUI8FromI2(sin: Short, pi64out: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarUI8FromI8(ui64in: Long, pi64out: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarUI8FromR4(fltin: Float, pi64out: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarUI8FromR8(dblin: Double, pi64out: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarUI8FromStr(strin: Long, lcid: Int, dwflags: Int, pi64out: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarUI8FromUI1(bin: Byte, pi64out: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarUI8FromUI2(uiin: Short, pi64out: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarUI8FromUI4(ulin: Int, pi64out: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarUdateFromDate(datein: Double, dwflags: Int, pudateout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarWeekdayName(iweekday: Int, fabbrev: Int, ifirstday: Int, dwflags: Int, pbstrout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVarXor(pvarleft: Long, pvarright: Long, pvarresult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemOleVectorFromBstr(bstr: Long, ppsa: Long): Int
}

public actual fun bstrFromVector(psa: ConstPtr, pbstr: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleBstrFromVector(psa.rawAddress, pbstr.rawAddress)

public actual fun clearCustData(pcustdata: MutPtr) {
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleClearCustData(pcustdata.rawAddress)
}

public actual fun createDispTypeInfo(pidata: MutPtr, lcid: UInt, pptinfo: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleCreateDispTypeInfo(pidata.rawAddress, lcid.toInt(), pptinfo.rawAddress)

public actual fun createErrorInfo(pperrinfo: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleCreateErrorInfo(pperrinfo.rawAddress)

public actual fun createOleAdviseHolder(ppoaholder: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleCreateOleAdviseHolder(ppoaholder.rawAddress)

public actual fun createStdDispatch(punkouter: MutPtr, pvthis: MutPtr, ptinfo: MutPtr, ppunkstddisp: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleCreateStdDispatch(punkouter.rawAddress, pvthis.rawAddress, ptinfo.rawAddress, ppunkstddisp.rawAddress)

public actual fun createTypeLib(syskind: Syskind, szfile: Pcwstr, ppctlib: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleCreateTypeLib(syskind, szfile.rawAddress, ppctlib.rawAddress)

public actual fun createTypeLib2(syskind: Syskind, szfile: Pcwstr, ppctlib: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleCreateTypeLib2(syskind, szfile.rawAddress, ppctlib.rawAddress)

public actual fun dispCallFunc(pvinstance: ConstPtr, ovft: ULong, cc: Callconv, vtreturn: Varenum, cactuals: UInt, prgvt: ConstPtr, prgpvarg: ConstPtr, pvargresult: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleDispCallFunc(pvinstance.rawAddress, ovft.toLong(), cc, vtreturn.toShort(), cactuals.toInt(), prgvt.rawAddress, prgpvarg.rawAddress, pvargresult.rawAddress)

public actual fun dispGetIDsOfNames(ptinfo: MutPtr, rgsznames: ConstPtr, cnames: UInt, rgdispid: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleDispGetIDsOfNames(ptinfo.rawAddress, rgsznames.rawAddress, cnames.toInt(), rgdispid.rawAddress)

public actual fun dispGetParam(pdispparams: ConstPtr, position: UInt, vttarg: Varenum, pvarresult: MutPtr, puargerr: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleDispGetParam(pdispparams.rawAddress, position.toInt(), vttarg.toShort(), pvarresult.rawAddress, puargerr.rawAddress)

public actual fun dispInvoke(thisRef: MutPtr, ptinfo: MutPtr, dispidmember: Int, wflags: UShort, pparams: MutPtr, pvarresult: MutPtr, pexcepinfo: MutPtr, puargerr: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleDispInvoke(thisRef.rawAddress, ptinfo.rawAddress, dispidmember, wflags.toShort(), pparams.rawAddress, pvarresult.rawAddress, pexcepinfo.rawAddress, puargerr.rawAddress)

public actual fun doDragDrop(pdataobj: MutPtr, pdropsource: MutPtr, dwokeffects: Dropeffect, pdweffect: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleDoDragDrop(pdataobj.rawAddress, pdropsource.rawAddress, dwokeffects.toInt(), pdweffect.rawAddress)

public actual fun getActiveObject(rclsid: ConstPtr, pvreserved: MutPtr, ppunk: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleGetActiveObject(rclsid.rawAddress, pvreserved.rawAddress, ppunk.rawAddress)

public actual fun getAltMonthNames(lcid: UInt, prgp: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleGetAltMonthNames(lcid.toInt(), prgp.rawAddress)

public actual fun getRecordInfoFromGuids(rguidtypelib: ConstPtr, uvermajor: UInt, uverminor: UInt, lcid: UInt, rguidtypeinfo: ConstPtr, pprecinfo: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleGetRecordInfoFromGuids(rguidtypelib.rawAddress, uvermajor.toInt(), uverminor.toInt(), lcid.toInt(), rguidtypeinfo.rawAddress, pprecinfo.rawAddress)

public actual fun getRecordInfoFromTypeInfo(ptypeinfo: MutPtr, pprecinfo: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleGetRecordInfoFromTypeInfo(ptypeinfo.rawAddress, pprecinfo.rawAddress)

public actual fun hrgnUserFree(param0: ConstPtr, param1: ConstPtr) {
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleHrgnUserFree(param0.rawAddress, param1.rawAddress)
}

public actual fun hrgnUserFree64(param0: ConstPtr, param1: ConstPtr) {
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleHrgnUserFree64(param0.rawAddress, param1.rawAddress)
}

public actual fun hrgnUserMarshal(param0: ConstPtr, param1: MutPtr, param2: ConstPtr): MutPtr =
    MutPtr(WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleHrgnUserMarshal(param0.rawAddress, param1.rawAddress, param2.rawAddress))

public actual fun hrgnUserMarshal64(param0: ConstPtr, param1: MutPtr, param2: ConstPtr): MutPtr =
    MutPtr(WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleHrgnUserMarshal64(param0.rawAddress, param1.rawAddress, param2.rawAddress))

public actual fun hrgnUserSize(param0: ConstPtr, param1: UInt, param2: ConstPtr): UInt =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleHrgnUserSize(param0.rawAddress, param1.toInt(), param2.rawAddress).toUInt()

public actual fun hrgnUserSize64(param0: ConstPtr, param1: UInt, param2: ConstPtr): UInt =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleHrgnUserSize64(param0.rawAddress, param1.toInt(), param2.rawAddress).toUInt()

public actual fun hrgnUserUnmarshal(param0: ConstPtr, param1: ConstPtr, param2: MutPtr): MutPtr =
    MutPtr(WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleHrgnUserUnmarshal(param0.rawAddress, param1.rawAddress, param2.rawAddress))

public actual fun hrgnUserUnmarshal64(param0: ConstPtr, param1: ConstPtr, param2: MutPtr): MutPtr =
    MutPtr(WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleHrgnUserUnmarshal64(param0.rawAddress, param1.rawAddress, param2.rawAddress))

public actual fun isAccelerator(haccel: Haccel, caccelentries: Int, lpmsg: ConstPtr, lpwcmd: MutPtr): Bool =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleIsAccelerator(haccel.rawAddress, caccelentries, lpmsg.rawAddress, lpwcmd.rawAddress)

public actual fun lHashValOfNameSys(syskind: Syskind, lcid: UInt, szname: Pcwstr): UInt =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleLHashValOfNameSys(syskind, lcid.toInt(), szname.rawAddress).toUInt()

public actual fun lHashValOfNameSysA(syskind: Syskind, lcid: UInt, szname: Pcstr): UInt =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleLHashValOfNameSysA(syskind, lcid.toInt(), szname.rawAddress).toUInt()

public actual fun loadRegTypeLib(rguid: ConstPtr, wvermajor: UShort, wverminor: UShort, lcid: UInt, pptlib: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleLoadRegTypeLib(rguid.rawAddress, wvermajor.toShort(), wverminor.toShort(), lcid.toInt(), pptlib.rawAddress)

public actual fun loadTypeLib(szfile: Pcwstr, pptlib: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleLoadTypeLib(szfile.rawAddress, pptlib.rawAddress)

public actual fun loadTypeLibEx(szfile: Pcwstr, regkind: Regkind, pptlib: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleLoadTypeLibEx(szfile.rawAddress, regkind, pptlib.rawAddress)

public actual fun oaBuildVersion(): UInt =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOaBuildVersion().toUInt()

public actual fun oaEnablePerUserTLibRegistration() {
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOaEnablePerUserTLibRegistration()
}

public actual fun oleBuildVersion(): UInt =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleBuildVersion().toUInt()

public actual fun oleConvertOLESTREAMToIStorage2(lpolestream: ConstPtr, pstg: MutPtr, ptd: ConstPtr, opt: UInt, pvcallbackcontext: ConstPtr, pqueryconvertolelinkcallback: Olestreamqueryconvertolelinkcallback): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleConvertOLESTREAMToIStorage2(lpolestream.rawAddress, pstg.rawAddress, ptd.rawAddress, opt.toInt(), pvcallbackcontext.rawAddress, 0L)

public actual fun oleConvertOLESTREAMToIStorageEx2(polestm: ConstPtr, pstg: MutPtr, pcfformat: MutPtr, plwwidth: MutPtr, plheight: MutPtr, pdwsize: MutPtr, pmedium: MutPtr, opt: UInt, pvcallbackcontext: ConstPtr, pqueryconvertolelinkcallback: Olestreamqueryconvertolelinkcallback): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleConvertOLESTREAMToIStorageEx2(polestm.rawAddress, pstg.rawAddress, pcfformat.rawAddress, plwwidth.rawAddress, plheight.rawAddress, pdwsize.rawAddress, pmedium.rawAddress, opt.toInt(), pvcallbackcontext.rawAddress, 0L)

public actual fun oleCreate(rclsid: ConstPtr, riid: ConstPtr, renderopt: UInt, pformatetc: ConstPtr, pclientsite: MutPtr, pstg: MutPtr, ppvobj: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleCreate(rclsid.rawAddress, riid.rawAddress, renderopt.toInt(), pformatetc.rawAddress, pclientsite.rawAddress, pstg.rawAddress, ppvobj.rawAddress)

public actual fun oleCreateDefaultHandler(clsid: ConstPtr, punkouter: MutPtr, riid: ConstPtr, lplpobj: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleCreateDefaultHandler(clsid.rawAddress, punkouter.rawAddress, riid.rawAddress, lplpobj.rawAddress)

public actual fun oleCreateEmbeddingHelper(clsid: ConstPtr, punkouter: MutPtr, flags: EmbdhlpFlags, pcf: MutPtr, riid: ConstPtr, lplpobj: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleCreateEmbeddingHelper(clsid.rawAddress, punkouter.rawAddress, flags.toInt(), pcf.rawAddress, riid.rawAddress, lplpobj.rawAddress)

public actual fun oleCreateEx(rclsid: ConstPtr, riid: ConstPtr, dwflags: Olecreate, renderopt: UInt, cformats: UInt, rgadvf: ConstPtr, rgformatetc: ConstPtr, lpadvisesink: MutPtr, rgdwconnection: MutPtr, pclientsite: MutPtr, pstg: MutPtr, ppvobj: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleCreateEx(rclsid.rawAddress, riid.rawAddress, dwflags.toInt(), renderopt.toInt(), cformats.toInt(), rgadvf.rawAddress, rgformatetc.rawAddress, lpadvisesink.rawAddress, rgdwconnection.rawAddress, pclientsite.rawAddress, pstg.rawAddress, ppvobj.rawAddress)

public actual fun oleCreateFontIndirect(lpfontdesc: ConstPtr, riid: ConstPtr, lplpvobj: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleCreateFontIndirect(lpfontdesc.rawAddress, riid.rawAddress, lplpvobj.rawAddress)

public actual fun oleCreateFromData(psrcdataobj: MutPtr, riid: ConstPtr, renderopt: UInt, pformatetc: ConstPtr, pclientsite: MutPtr, pstg: MutPtr, ppvobj: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleCreateFromData(psrcdataobj.rawAddress, riid.rawAddress, renderopt.toInt(), pformatetc.rawAddress, pclientsite.rawAddress, pstg.rawAddress, ppvobj.rawAddress)

public actual fun oleCreateFromDataEx(psrcdataobj: MutPtr, riid: ConstPtr, dwflags: Olecreate, renderopt: UInt, cformats: UInt, rgadvf: ConstPtr, rgformatetc: ConstPtr, lpadvisesink: MutPtr, rgdwconnection: MutPtr, pclientsite: MutPtr, pstg: MutPtr, ppvobj: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleCreateFromDataEx(psrcdataobj.rawAddress, riid.rawAddress, dwflags.toInt(), renderopt.toInt(), cformats.toInt(), rgadvf.rawAddress, rgformatetc.rawAddress, lpadvisesink.rawAddress, rgdwconnection.rawAddress, pclientsite.rawAddress, pstg.rawAddress, ppvobj.rawAddress)

public actual fun oleCreateFromFile(rclsid: ConstPtr, lpszfilename: Pcwstr, riid: ConstPtr, renderopt: UInt, lpformatetc: ConstPtr, pclientsite: MutPtr, pstg: MutPtr, ppvobj: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleCreateFromFile(rclsid.rawAddress, lpszfilename.rawAddress, riid.rawAddress, renderopt.toInt(), lpformatetc.rawAddress, pclientsite.rawAddress, pstg.rawAddress, ppvobj.rawAddress)

public actual fun oleCreateFromFileEx(rclsid: ConstPtr, lpszfilename: Pcwstr, riid: ConstPtr, dwflags: Olecreate, renderopt: UInt, cformats: UInt, rgadvf: ConstPtr, rgformatetc: ConstPtr, lpadvisesink: MutPtr, rgdwconnection: MutPtr, pclientsite: MutPtr, pstg: MutPtr, ppvobj: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleCreateFromFileEx(rclsid.rawAddress, lpszfilename.rawAddress, riid.rawAddress, dwflags.toInt(), renderopt.toInt(), cformats.toInt(), rgadvf.rawAddress, rgformatetc.rawAddress, lpadvisesink.rawAddress, rgdwconnection.rawAddress, pclientsite.rawAddress, pstg.rawAddress, ppvobj.rawAddress)

public actual fun oleCreateLink(pmklinksrc: MutPtr, riid: ConstPtr, renderopt: UInt, lpformatetc: ConstPtr, pclientsite: MutPtr, pstg: MutPtr, ppvobj: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleCreateLink(pmklinksrc.rawAddress, riid.rawAddress, renderopt.toInt(), lpformatetc.rawAddress, pclientsite.rawAddress, pstg.rawAddress, ppvobj.rawAddress)

public actual fun oleCreateLinkEx(pmklinksrc: MutPtr, riid: ConstPtr, dwflags: Olecreate, renderopt: UInt, cformats: UInt, rgadvf: ConstPtr, rgformatetc: ConstPtr, lpadvisesink: MutPtr, rgdwconnection: MutPtr, pclientsite: MutPtr, pstg: MutPtr, ppvobj: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleCreateLinkEx(pmklinksrc.rawAddress, riid.rawAddress, dwflags.toInt(), renderopt.toInt(), cformats.toInt(), rgadvf.rawAddress, rgformatetc.rawAddress, lpadvisesink.rawAddress, rgdwconnection.rawAddress, pclientsite.rawAddress, pstg.rawAddress, ppvobj.rawAddress)

public actual fun oleCreateLinkFromData(psrcdataobj: MutPtr, riid: ConstPtr, renderopt: UInt, pformatetc: ConstPtr, pclientsite: MutPtr, pstg: MutPtr, ppvobj: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleCreateLinkFromData(psrcdataobj.rawAddress, riid.rawAddress, renderopt.toInt(), pformatetc.rawAddress, pclientsite.rawAddress, pstg.rawAddress, ppvobj.rawAddress)

public actual fun oleCreateLinkFromDataEx(psrcdataobj: MutPtr, riid: ConstPtr, dwflags: Olecreate, renderopt: UInt, cformats: UInt, rgadvf: ConstPtr, rgformatetc: ConstPtr, lpadvisesink: MutPtr, rgdwconnection: MutPtr, pclientsite: MutPtr, pstg: MutPtr, ppvobj: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleCreateLinkFromDataEx(psrcdataobj.rawAddress, riid.rawAddress, dwflags.toInt(), renderopt.toInt(), cformats.toInt(), rgadvf.rawAddress, rgformatetc.rawAddress, lpadvisesink.rawAddress, rgdwconnection.rawAddress, pclientsite.rawAddress, pstg.rawAddress, ppvobj.rawAddress)

public actual fun oleCreateLinkToFile(lpszfilename: Pcwstr, riid: ConstPtr, renderopt: UInt, lpformatetc: ConstPtr, pclientsite: MutPtr, pstg: MutPtr, ppvobj: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleCreateLinkToFile(lpszfilename.rawAddress, riid.rawAddress, renderopt.toInt(), lpformatetc.rawAddress, pclientsite.rawAddress, pstg.rawAddress, ppvobj.rawAddress)

public actual fun oleCreateLinkToFileEx(lpszfilename: Pcwstr, riid: ConstPtr, dwflags: Olecreate, renderopt: UInt, cformats: UInt, rgadvf: ConstPtr, rgformatetc: ConstPtr, lpadvisesink: MutPtr, rgdwconnection: MutPtr, pclientsite: MutPtr, pstg: MutPtr, ppvobj: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleCreateLinkToFileEx(lpszfilename.rawAddress, riid.rawAddress, dwflags.toInt(), renderopt.toInt(), cformats.toInt(), rgadvf.rawAddress, rgformatetc.rawAddress, lpadvisesink.rawAddress, rgdwconnection.rawAddress, pclientsite.rawAddress, pstg.rawAddress, ppvobj.rawAddress)

public actual fun oleCreateMenuDescriptor(hmenucombined: Hmenu, lpmenuwidths: ConstPtr): Long =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleCreateMenuDescriptor(hmenucombined.rawAddress, lpmenuwidths.rawAddress)

public actual fun oleCreatePictureIndirect(lppictdesc: ConstPtr, riid: ConstPtr, fown: Bool, lplpvobj: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleCreatePictureIndirect(lppictdesc.rawAddress, riid.rawAddress, fown, lplpvobj.rawAddress)

public actual fun oleCreatePropertyFrame(hwndowner: Hwnd, x: UInt, y: UInt, lpszcaption: Pcwstr, cobjects: UInt, ppunk: ConstPtr, cpages: UInt, ppageclsid: ConstPtr, lcid: UInt, dwreserved: UInt, pvreserved: ConstPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleCreatePropertyFrame(hwndowner.rawAddress, x.toInt(), y.toInt(), lpszcaption.rawAddress, cobjects.toInt(), ppunk.rawAddress, cpages.toInt(), ppageclsid.rawAddress, lcid.toInt(), dwreserved.toInt(), pvreserved.rawAddress)

public actual fun oleCreatePropertyFrameIndirect(lpparams: ConstPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleCreatePropertyFrameIndirect(lpparams.rawAddress)

public actual fun oleCreateStaticFromData(psrcdataobj: MutPtr, iid: ConstPtr, renderopt: UInt, pformatetc: ConstPtr, pclientsite: MutPtr, pstg: MutPtr, ppvobj: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleCreateStaticFromData(psrcdataobj.rawAddress, iid.rawAddress, renderopt.toInt(), pformatetc.rawAddress, pclientsite.rawAddress, pstg.rawAddress, ppvobj.rawAddress)

public actual fun oleDestroyMenuDescriptor(holemenu: Long): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleDestroyMenuDescriptor(holemenu)

public actual fun oleDoAutoConvert(pstg: MutPtr, pclsidnew: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleDoAutoConvert(pstg.rawAddress, pclsidnew.rawAddress)

public actual fun oleDraw(punknown: MutPtr, dwaspect: UInt, hdcdraw: Hdc, lprcbounds: ConstPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleDraw(punknown.rawAddress, dwaspect.toInt(), hdcdraw.rawAddress, lprcbounds.rawAddress)

public actual fun oleDuplicateData(hsrc: Handle, cfformat: ClipboardFormat, uiflags: GlobalAllocFlags): Handle =
    MutPtr(WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleDuplicateData(hsrc.rawAddress, cfformat.toShort(), uiflags.toInt()))

public actual fun oleFlushClipboard(): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleFlushClipboard()

public actual fun oleGetAutoConvert(clsidold: ConstPtr, pclsidnew: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleGetAutoConvert(clsidold.rawAddress, pclsidnew.rawAddress)

public actual fun oleGetClipboard(ppdataobj: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleGetClipboard(ppdataobj.rawAddress)

public actual fun oleGetClipboardWithEnterpriseInfo(dataobject: MutPtr, dataenterpriseid: MutPtr, sourcedescription: MutPtr, targetdescription: MutPtr, datadescription: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleGetClipboardWithEnterpriseInfo(dataobject.rawAddress, dataenterpriseid.rawAddress, sourcedescription.rawAddress, targetdescription.rawAddress, datadescription.rawAddress)

public actual fun oleGetIconOfClass(rclsid: ConstPtr, lpszlabel: Pcwstr, fusetypeaslabel: Bool): Hglobal =
    MutPtr(WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleGetIconOfClass(rclsid.rawAddress, lpszlabel.rawAddress, fusetypeaslabel))

public actual fun oleGetIconOfFile(lpszpath: Pcwstr, fusefileaslabel: Bool): Hglobal =
    MutPtr(WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleGetIconOfFile(lpszpath.rawAddress, fusefileaslabel))

public actual fun oleIconToCursor(hinstexe: Hinstance, hicon: Hicon): Hcursor =
    MutPtr(WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleIconToCursor(hinstexe.rawAddress, hicon.rawAddress))

public actual fun oleInitialize(pvreserved: ConstPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleInitialize(pvreserved.rawAddress)

public actual fun oleIsCurrentClipboard(pdataobj: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleIsCurrentClipboard(pdataobj.rawAddress)

public actual fun oleIsRunning(pobject: MutPtr): Bool =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleIsRunning(pobject.rawAddress)

public actual fun oleLoad(pstg: MutPtr, riid: ConstPtr, pclientsite: MutPtr, ppvobj: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleLoad(pstg.rawAddress, riid.rawAddress, pclientsite.rawAddress, ppvobj.rawAddress)

public actual fun oleLoadFromStream(pstm: MutPtr, iidinterface: ConstPtr, ppvobj: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleLoadFromStream(pstm.rawAddress, iidinterface.rawAddress, ppvobj.rawAddress)

public actual fun oleLoadPicture(lpstream: MutPtr, lsize: Int, frunmode: Bool, riid: ConstPtr, lplpvobj: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleLoadPicture(lpstream.rawAddress, lsize, frunmode, riid.rawAddress, lplpvobj.rawAddress)

public actual fun oleLoadPictureEx(lpstream: MutPtr, lsize: Int, frunmode: Bool, riid: ConstPtr, xsizedesired: UInt, ysizedesired: UInt, dwflags: LoadPictureFlags, lplpvobj: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleLoadPictureEx(lpstream.rawAddress, lsize, frunmode, riid.rawAddress, xsizedesired.toInt(), ysizedesired.toInt(), dwflags.toInt(), lplpvobj.rawAddress)

public actual fun oleLoadPictureFile(varfilename: Variant, lplpdisppicture: MutPtr): Hresult =
    0

public actual fun oleLoadPictureFileEx(varfilename: Variant, xsizedesired: UInt, ysizedesired: UInt, dwflags: LoadPictureFlags, lplpdisppicture: MutPtr): Hresult =
    0

public actual fun oleLoadPicturePath(szurlorpath: Pcwstr, punkcaller: MutPtr, dwreserved: UInt, clrreserved: UInt, riid: ConstPtr, ppvret: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleLoadPicturePath(szurlorpath.rawAddress, punkcaller.rawAddress, dwreserved.toInt(), clrreserved.toInt(), riid.rawAddress, ppvret.rawAddress)

public actual fun oleLockRunning(punknown: MutPtr, flock: Bool, flastunlockcloses: Bool): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleLockRunning(punknown.rawAddress, flock, flastunlockcloses)

public actual fun oleMetafilePictFromIconAndLabel(hicon: Hicon, lpszlabel: Pcwstr, lpszsourcefile: Pcwstr, iiconindex: UInt): Hglobal =
    MutPtr(WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleMetafilePictFromIconAndLabel(hicon.rawAddress, lpszlabel.rawAddress, lpszsourcefile.rawAddress, iiconindex.toInt()))

public actual fun oleNoteObjectVisible(punknown: MutPtr, fvisible: Bool): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleNoteObjectVisible(punknown.rawAddress, fvisible)

public actual fun oleQueryCreateFromData(psrcdataobject: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleQueryCreateFromData(psrcdataobject.rawAddress)

public actual fun oleQueryLinkFromData(psrcdataobject: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleQueryLinkFromData(psrcdataobject.rawAddress)

public actual fun oleRegEnumFormatEtc(clsid: ConstPtr, dwdirection: UInt, ppenum: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleRegEnumFormatEtc(clsid.rawAddress, dwdirection.toInt(), ppenum.rawAddress)

public actual fun oleRegEnumVerbs(clsid: ConstPtr, ppenum: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleRegEnumVerbs(clsid.rawAddress, ppenum.rawAddress)

public actual fun oleRegGetMiscStatus(clsid: ConstPtr, dwaspect: UInt, pdwstatus: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleRegGetMiscStatus(clsid.rawAddress, dwaspect.toInt(), pdwstatus.rawAddress)

public actual fun oleRegGetUserType(clsid: ConstPtr, dwformoftype: UInt, pszusertype: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleRegGetUserType(clsid.rawAddress, dwformoftype.toInt(), pszusertype.rawAddress)

public actual fun oleRun(punknown: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleRun(punknown.rawAddress)

public actual fun oleSave(pps: MutPtr, pstg: MutPtr, fsameasload: Bool): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleSave(pps.rawAddress, pstg.rawAddress, fsameasload)

public actual fun oleSavePictureFile(lpdisppicture: MutPtr, bstrfilename: Bstr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleSavePictureFile(lpdisppicture.rawAddress, bstrfilename.rawAddress)

public actual fun oleSaveToStream(ppstm: MutPtr, pstm: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleSaveToStream(ppstm.rawAddress, pstm.rawAddress)

public actual fun oleSetAutoConvert(clsidold: ConstPtr, clsidnew: ConstPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleSetAutoConvert(clsidold.rawAddress, clsidnew.rawAddress)

public actual fun oleSetClipboard(pdataobj: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleSetClipboard(pdataobj.rawAddress)

public actual fun oleSetContainedObject(punknown: MutPtr, fcontained: Bool): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleSetContainedObject(punknown.rawAddress, fcontained)

public actual fun oleSetMenuDescriptor(holemenu: Long, hwndframe: Hwnd, hwndactiveobject: Hwnd, lpframe: MutPtr, lpactiveobj: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleSetMenuDescriptor(holemenu, hwndframe.rawAddress, hwndactiveobject.rawAddress, lpframe.rawAddress, lpactiveobj.rawAddress)

public actual fun oleTranslateAccelerator(lpframe: MutPtr, lpframeinfo: ConstPtr, lpmsg: ConstPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleTranslateAccelerator(lpframe.rawAddress, lpframeinfo.rawAddress, lpmsg.rawAddress)

public actual fun oleTranslateColor(clr: UInt, hpal: Hpalette, lpcolorref: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleTranslateColor(clr.toInt(), hpal.rawAddress, lpcolorref.rawAddress)

public actual fun oleUIAddVerbMenuA(lpoleobj: MutPtr, lpszshorttype: Pcstr, hmenu: Hmenu, upos: UInt, uidverbmin: UInt, uidverbmax: UInt, baddconvert: Bool, idconvert: UInt, lphmenu: MutPtr): Bool =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleUIAddVerbMenuA(lpoleobj.rawAddress, lpszshorttype.rawAddress, hmenu.rawAddress, upos.toInt(), uidverbmin.toInt(), uidverbmax.toInt(), baddconvert, idconvert.toInt(), lphmenu.rawAddress)

public actual fun oleUIAddVerbMenuW(lpoleobj: MutPtr, lpszshorttype: Pcwstr, hmenu: Hmenu, upos: UInt, uidverbmin: UInt, uidverbmax: UInt, baddconvert: Bool, idconvert: UInt, lphmenu: MutPtr): Bool =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleUIAddVerbMenuW(lpoleobj.rawAddress, lpszshorttype.rawAddress, hmenu.rawAddress, upos.toInt(), uidverbmin.toInt(), uidverbmax.toInt(), baddconvert, idconvert.toInt(), lphmenu.rawAddress)

public actual fun oleUIBusyA(param0: ConstPtr): UInt =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleUIBusyA(param0.rawAddress).toUInt()

public actual fun oleUIBusyW(param0: ConstPtr): UInt =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleUIBusyW(param0.rawAddress).toUInt()

public actual fun oleUICanConvertOrActivateAs(rclsid: ConstPtr, fislinkedobject: Bool, wformat: UShort): Bool =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleUICanConvertOrActivateAs(rclsid.rawAddress, fislinkedobject, wformat.toShort())

public actual fun oleUIChangeIconA(param0: ConstPtr): UInt =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleUIChangeIconA(param0.rawAddress).toUInt()

public actual fun oleUIChangeIconW(param0: ConstPtr): UInt =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleUIChangeIconW(param0.rawAddress).toUInt()

public actual fun oleUIChangeSourceA(param0: ConstPtr): UInt =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleUIChangeSourceA(param0.rawAddress).toUInt()

public actual fun oleUIChangeSourceW(param0: ConstPtr): UInt =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleUIChangeSourceW(param0.rawAddress).toUInt()

public actual fun oleUIConvertA(param0: ConstPtr): UInt =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleUIConvertA(param0.rawAddress).toUInt()

public actual fun oleUIConvertW(param0: ConstPtr): UInt =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleUIConvertW(param0.rawAddress).toUInt()

public actual fun oleUIEditLinksA(param0: ConstPtr): UInt =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleUIEditLinksA(param0.rawAddress).toUInt()

public actual fun oleUIEditLinksW(param0: ConstPtr): UInt =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleUIEditLinksW(param0.rawAddress).toUInt()

public actual fun oleUIInsertObjectA(param0: ConstPtr): UInt =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleUIInsertObjectA(param0.rawAddress).toUInt()

public actual fun oleUIInsertObjectW(param0: ConstPtr): UInt =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleUIInsertObjectW(param0.rawAddress).toUInt()

public actual fun oleUIObjectPropertiesA(param0: ConstPtr): UInt =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleUIObjectPropertiesA(param0.rawAddress).toUInt()

public actual fun oleUIObjectPropertiesW(param0: ConstPtr): UInt =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleUIObjectPropertiesW(param0.rawAddress).toUInt()

public actual fun oleUIPasteSpecialA(param0: ConstPtr): UInt =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleUIPasteSpecialA(param0.rawAddress).toUInt()

public actual fun oleUIPasteSpecialW(param0: ConstPtr): UInt =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleUIPasteSpecialW(param0.rawAddress).toUInt()

public actual fun oleUIPromptUserA(ntemplate: Int, hwndparent: Hwnd, vararg variadicArgs: Long): Int =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleUIPromptUserA(ntemplate, hwndparent.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun oleUIPromptUserW(ntemplate: Int, hwndparent: Hwnd, vararg variadicArgs: Long): Int =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleUIPromptUserW(ntemplate, hwndparent.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun oleUIUpdateLinksA(lpoleuilinkcntr: MutPtr, hwndparent: Hwnd, lpsztitle: Pcstr, clinks: Int): Bool =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleUIUpdateLinksA(lpoleuilinkcntr.rawAddress, hwndparent.rawAddress, lpsztitle.rawAddress, clinks)

public actual fun oleUIUpdateLinksW(lpoleuilinkcntr: MutPtr, hwndparent: Hwnd, lpsztitle: Pcwstr, clinks: Int): Bool =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleUIUpdateLinksW(lpoleuilinkcntr.rawAddress, hwndparent.rawAddress, lpsztitle.rawAddress, clinks)

public actual fun oleUninitialize() {
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleOleUninitialize()
}

public actual fun queryPathOfRegTypeLib(guid: ConstPtr, wmaj: UShort, wmin: UShort, lcid: UInt, lpbstrpathname: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleQueryPathOfRegTypeLib(guid.rawAddress, wmaj.toShort(), wmin.toShort(), lcid.toInt(), lpbstrpathname.rawAddress)

public actual fun registerActiveObject(punk: MutPtr, rclsid: ConstPtr, dwflags: ActiveobjectFlags, pdwregister: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleRegisterActiveObject(punk.rawAddress, rclsid.rawAddress, dwflags.toInt(), pdwregister.rawAddress)

public actual fun registerDragDrop(hwnd: Hwnd, pdroptarget: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleRegisterDragDrop(hwnd.rawAddress, pdroptarget.rawAddress)

public actual fun registerTypeLib(ptlib: MutPtr, szfullpath: Pcwstr, szhelpdir: Pcwstr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleRegisterTypeLib(ptlib.rawAddress, szfullpath.rawAddress, szhelpdir.rawAddress)

public actual fun registerTypeLibForUser(ptlib: MutPtr, szfullpath: Pcwstr, szhelpdir: Pcwstr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleRegisterTypeLibForUser(ptlib.rawAddress, szfullpath.rawAddress, szhelpdir.rawAddress)

public actual fun releaseStgMedium(param0: MutPtr) {
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleReleaseStgMedium(param0.rawAddress)
}

public actual fun revokeActiveObject(dwregister: UInt, pvreserved: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleRevokeActiveObject(dwregister.toInt(), pvreserved.rawAddress)

public actual fun revokeDragDrop(hwnd: Hwnd): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleRevokeDragDrop(hwnd.rawAddress)

public actual fun safeArrayAccessData(psa: ConstPtr, ppvdata: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleSafeArrayAccessData(psa.rawAddress, ppvdata.rawAddress)

public actual fun safeArrayAddRef(psa: ConstPtr, ppdatatorelease: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleSafeArrayAddRef(psa.rawAddress, ppdatatorelease.rawAddress)

public actual fun safeArrayAllocData(psa: ConstPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleSafeArrayAllocData(psa.rawAddress)

public actual fun safeArrayAllocDescriptor(cdims: UInt, ppsaout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleSafeArrayAllocDescriptor(cdims.toInt(), ppsaout.rawAddress)

public actual fun safeArrayAllocDescriptorEx(vt: Varenum, cdims: UInt, ppsaout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleSafeArrayAllocDescriptorEx(vt.toShort(), cdims.toInt(), ppsaout.rawAddress)

public actual fun safeArrayCopy(psa: ConstPtr, ppsaout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleSafeArrayCopy(psa.rawAddress, ppsaout.rawAddress)

public actual fun safeArrayCopyData(psasource: ConstPtr, psatarget: ConstPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleSafeArrayCopyData(psasource.rawAddress, psatarget.rawAddress)

public actual fun safeArrayCreate(vt: Varenum, cdims: UInt, rgsabound: ConstPtr): MutPtr =
    MutPtr(WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleSafeArrayCreate(vt.toShort(), cdims.toInt(), rgsabound.rawAddress))

public actual fun safeArrayCreateEx(vt: Varenum, cdims: UInt, rgsabound: ConstPtr, pvextra: ConstPtr): MutPtr =
    MutPtr(WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleSafeArrayCreateEx(vt.toShort(), cdims.toInt(), rgsabound.rawAddress, pvextra.rawAddress))

public actual fun safeArrayCreateVector(vt: Varenum, llbound: Int, celements: UInt): MutPtr =
    MutPtr(WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleSafeArrayCreateVector(vt.toShort(), llbound, celements.toInt()))

public actual fun safeArrayCreateVectorEx(vt: Varenum, llbound: Int, celements: UInt, pvextra: ConstPtr): MutPtr =
    MutPtr(WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleSafeArrayCreateVectorEx(vt.toShort(), llbound, celements.toInt(), pvextra.rawAddress))

public actual fun safeArrayDestroy(psa: ConstPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleSafeArrayDestroy(psa.rawAddress)

public actual fun safeArrayDestroyData(psa: ConstPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleSafeArrayDestroyData(psa.rawAddress)

public actual fun safeArrayDestroyDescriptor(psa: ConstPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleSafeArrayDestroyDescriptor(psa.rawAddress)

public actual fun safeArrayGetDim(psa: ConstPtr): UInt =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleSafeArrayGetDim(psa.rawAddress).toUInt()

public actual fun safeArrayGetElement(psa: ConstPtr, rgindices: ConstPtr, pv: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleSafeArrayGetElement(psa.rawAddress, rgindices.rawAddress, pv.rawAddress)

public actual fun safeArrayGetElemsize(psa: ConstPtr): UInt =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleSafeArrayGetElemsize(psa.rawAddress).toUInt()

public actual fun safeArrayGetIID(psa: ConstPtr, pguid: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleSafeArrayGetIID(psa.rawAddress, pguid.rawAddress)

public actual fun safeArrayGetLBound(psa: ConstPtr, ndim: UInt, pllbound: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleSafeArrayGetLBound(psa.rawAddress, ndim.toInt(), pllbound.rawAddress)

public actual fun safeArrayGetRecordInfo(psa: ConstPtr, prinfo: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleSafeArrayGetRecordInfo(psa.rawAddress, prinfo.rawAddress)

public actual fun safeArrayGetUBound(psa: ConstPtr, ndim: UInt, plubound: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleSafeArrayGetUBound(psa.rawAddress, ndim.toInt(), plubound.rawAddress)

public actual fun safeArrayGetVartype(psa: ConstPtr, pvt: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleSafeArrayGetVartype(psa.rawAddress, pvt.rawAddress)

public actual fun safeArrayLock(psa: ConstPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleSafeArrayLock(psa.rawAddress)

public actual fun safeArrayPtrOfIndex(psa: ConstPtr, rgindices: ConstPtr, ppvdata: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleSafeArrayPtrOfIndex(psa.rawAddress, rgindices.rawAddress, ppvdata.rawAddress)

public actual fun safeArrayPutElement(psa: ConstPtr, rgindices: ConstPtr, pv: ConstPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleSafeArrayPutElement(psa.rawAddress, rgindices.rawAddress, pv.rawAddress)

public actual fun safeArrayRedim(psa: MutPtr, psaboundnew: ConstPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleSafeArrayRedim(psa.rawAddress, psaboundnew.rawAddress)

public actual fun safeArrayReleaseData(pdata: ConstPtr) {
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleSafeArrayReleaseData(pdata.rawAddress)
}

public actual fun safeArrayReleaseDescriptor(psa: ConstPtr) {
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleSafeArrayReleaseDescriptor(psa.rawAddress)
}

public actual fun safeArraySetIID(psa: ConstPtr, guid: ConstPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleSafeArraySetIID(psa.rawAddress, guid.rawAddress)

public actual fun safeArraySetRecordInfo(psa: ConstPtr, prinfo: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleSafeArraySetRecordInfo(psa.rawAddress, prinfo.rawAddress)

public actual fun safeArrayUnaccessData(psa: ConstPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleSafeArrayUnaccessData(psa.rawAddress)

public actual fun safeArrayUnlock(psa: ConstPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleSafeArrayUnlock(psa.rawAddress)

public actual fun unRegisterTypeLib(libid: ConstPtr, wvermajor: UShort, wverminor: UShort, lcid: UInt, syskind: Syskind): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleUnRegisterTypeLib(libid.rawAddress, wvermajor.toShort(), wverminor.toShort(), lcid.toInt(), syskind)

public actual fun unRegisterTypeLibForUser(libid: ConstPtr, wmajorvernum: UShort, wminorvernum: UShort, lcid: UInt, syskind: Syskind): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleUnRegisterTypeLibForUser(libid.rawAddress, wmajorvernum.toShort(), wminorvernum.toShort(), lcid.toInt(), syskind)

public actual fun varAbs(pvarin: ConstPtr, pvarresult: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarAbs(pvarin.rawAddress, pvarresult.rawAddress)

public actual fun varAdd(pvarleft: ConstPtr, pvarright: ConstPtr, pvarresult: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarAdd(pvarleft.rawAddress, pvarright.rawAddress, pvarresult.rawAddress)

public actual fun varAnd(pvarleft: ConstPtr, pvarright: ConstPtr, pvarresult: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarAnd(pvarleft.rawAddress, pvarright.rawAddress, pvarresult.rawAddress)

public actual fun varBoolFromCy(cyin: CY, pboolout: MutPtr): Hresult =
    0

public actual fun varBoolFromDate(datein: Double, pboolout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarBoolFromDate(datein, pboolout.rawAddress)

public actual fun varBoolFromDec(pdecin: ConstPtr, pboolout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarBoolFromDec(pdecin.rawAddress, pboolout.rawAddress)

public actual fun varBoolFromDisp(pdispin: MutPtr, lcid: UInt, pboolout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarBoolFromDisp(pdispin.rawAddress, lcid.toInt(), pboolout.rawAddress)

public actual fun varBoolFromI1(cin: Byte, pboolout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarBoolFromI1(cin, pboolout.rawAddress)

public actual fun varBoolFromI2(sin: Short, pboolout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarBoolFromI2(sin, pboolout.rawAddress)

public actual fun varBoolFromI4(lin: Int, pboolout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarBoolFromI4(lin, pboolout.rawAddress)

public actual fun varBoolFromI8(i64in: Long, pboolout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarBoolFromI8(i64in, pboolout.rawAddress)

public actual fun varBoolFromR4(fltin: Float, pboolout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarBoolFromR4(fltin, pboolout.rawAddress)

public actual fun varBoolFromR8(dblin: Double, pboolout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarBoolFromR8(dblin, pboolout.rawAddress)

public actual fun varBoolFromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pboolout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarBoolFromStr(strin.rawAddress, lcid.toInt(), dwflags.toInt(), pboolout.rawAddress)

public actual fun varBoolFromUI1(bin: UByte, pboolout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarBoolFromUI1(bin.toByte(), pboolout.rawAddress)

public actual fun varBoolFromUI2(uiin: UShort, pboolout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarBoolFromUI2(uiin.toShort(), pboolout.rawAddress)

public actual fun varBoolFromUI4(ulin: UInt, pboolout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarBoolFromUI4(ulin.toInt(), pboolout.rawAddress)

public actual fun varBoolFromUI8(i64in: ULong, pboolout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarBoolFromUI8(i64in.toLong(), pboolout.rawAddress)

public actual fun varBstrCat(bstrleft: Bstr, bstrright: Bstr, pbstrresult: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarBstrCat(bstrleft.rawAddress, bstrright.rawAddress, pbstrresult.rawAddress)

public actual fun varBstrCmp(bstrleft: Bstr, bstrright: Bstr, lcid: UInt, dwflags: UInt): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarBstrCmp(bstrleft.rawAddress, bstrright.rawAddress, lcid.toInt(), dwflags.toInt())

public actual fun varBstrFromBool(boolin: VariantBool, lcid: UInt, dwflags: UInt, pbstrout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarBstrFromBool(boolin, lcid.toInt(), dwflags.toInt(), pbstrout.rawAddress)

public actual fun varBstrFromCy(cyin: CY, lcid: UInt, dwflags: UInt, pbstrout: MutPtr): Hresult =
    0

public actual fun varBstrFromDate(datein: Double, lcid: UInt, dwflags: UInt, pbstrout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarBstrFromDate(datein, lcid.toInt(), dwflags.toInt(), pbstrout.rawAddress)

public actual fun varBstrFromDec(pdecin: ConstPtr, lcid: UInt, dwflags: UInt, pbstrout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarBstrFromDec(pdecin.rawAddress, lcid.toInt(), dwflags.toInt(), pbstrout.rawAddress)

public actual fun varBstrFromDisp(pdispin: MutPtr, lcid: UInt, dwflags: UInt, pbstrout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarBstrFromDisp(pdispin.rawAddress, lcid.toInt(), dwflags.toInt(), pbstrout.rawAddress)

public actual fun varBstrFromI1(cin: Byte, lcid: UInt, dwflags: UInt, pbstrout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarBstrFromI1(cin, lcid.toInt(), dwflags.toInt(), pbstrout.rawAddress)

public actual fun varBstrFromI2(ival: Short, lcid: UInt, dwflags: UInt, pbstrout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarBstrFromI2(ival, lcid.toInt(), dwflags.toInt(), pbstrout.rawAddress)

public actual fun varBstrFromI4(lin: Int, lcid: UInt, dwflags: UInt, pbstrout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarBstrFromI4(lin, lcid.toInt(), dwflags.toInt(), pbstrout.rawAddress)

public actual fun varBstrFromI8(i64in: Long, lcid: UInt, dwflags: UInt, pbstrout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarBstrFromI8(i64in, lcid.toInt(), dwflags.toInt(), pbstrout.rawAddress)

public actual fun varBstrFromR4(fltin: Float, lcid: UInt, dwflags: UInt, pbstrout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarBstrFromR4(fltin, lcid.toInt(), dwflags.toInt(), pbstrout.rawAddress)

public actual fun varBstrFromR8(dblin: Double, lcid: UInt, dwflags: UInt, pbstrout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarBstrFromR8(dblin, lcid.toInt(), dwflags.toInt(), pbstrout.rawAddress)

public actual fun varBstrFromUI1(bval: UByte, lcid: UInt, dwflags: UInt, pbstrout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarBstrFromUI1(bval.toByte(), lcid.toInt(), dwflags.toInt(), pbstrout.rawAddress)

public actual fun varBstrFromUI2(uiin: UShort, lcid: UInt, dwflags: UInt, pbstrout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarBstrFromUI2(uiin.toShort(), lcid.toInt(), dwflags.toInt(), pbstrout.rawAddress)

public actual fun varBstrFromUI4(ulin: UInt, lcid: UInt, dwflags: UInt, pbstrout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarBstrFromUI4(ulin.toInt(), lcid.toInt(), dwflags.toInt(), pbstrout.rawAddress)

public actual fun varBstrFromUI8(ui64in: ULong, lcid: UInt, dwflags: UInt, pbstrout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarBstrFromUI8(ui64in.toLong(), lcid.toInt(), dwflags.toInt(), pbstrout.rawAddress)

public actual fun varCat(pvarleft: ConstPtr, pvarright: ConstPtr, pvarresult: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarCat(pvarleft.rawAddress, pvarright.rawAddress, pvarresult.rawAddress)

public actual fun varCmp(pvarleft: ConstPtr, pvarright: ConstPtr, lcid: UInt, dwflags: UInt): Varcmp =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarCmp(pvarleft.rawAddress, pvarright.rawAddress, lcid.toInt(), dwflags.toInt()).toUInt()

public actual fun varCyAbs(cyin: CY, pcyresult: MutPtr): Hresult =
    0

public actual fun varCyAdd(cyleft: CY, cyright: CY, pcyresult: MutPtr): Hresult =
    0

public actual fun varCyCmp(cyleft: CY, cyright: CY): Varcmp =
    0u

public actual fun varCyCmpR8(cyleft: CY, dblright: Double): Varcmp =
    0u

public actual fun varCyFix(cyin: CY, pcyresult: MutPtr): Hresult =
    0

public actual fun varCyFromBool(boolin: VariantBool, pcyout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarCyFromBool(boolin, pcyout.rawAddress)

public actual fun varCyFromDate(datein: Double, pcyout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarCyFromDate(datein, pcyout.rawAddress)

public actual fun varCyFromDec(pdecin: ConstPtr, pcyout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarCyFromDec(pdecin.rawAddress, pcyout.rawAddress)

public actual fun varCyFromDisp(pdispin: MutPtr, lcid: UInt, pcyout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarCyFromDisp(pdispin.rawAddress, lcid.toInt(), pcyout.rawAddress)

public actual fun varCyFromI1(cin: Byte, pcyout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarCyFromI1(cin, pcyout.rawAddress)

public actual fun varCyFromI2(sin: Short, pcyout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarCyFromI2(sin, pcyout.rawAddress)

public actual fun varCyFromI4(lin: Int, pcyout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarCyFromI4(lin, pcyout.rawAddress)

public actual fun varCyFromI8(i64in: Long, pcyout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarCyFromI8(i64in, pcyout.rawAddress)

public actual fun varCyFromR4(fltin: Float, pcyout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarCyFromR4(fltin, pcyout.rawAddress)

public actual fun varCyFromR8(dblin: Double, pcyout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarCyFromR8(dblin, pcyout.rawAddress)

public actual fun varCyFromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pcyout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarCyFromStr(strin.rawAddress, lcid.toInt(), dwflags.toInt(), pcyout.rawAddress)

public actual fun varCyFromUI1(bin: UByte, pcyout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarCyFromUI1(bin.toByte(), pcyout.rawAddress)

public actual fun varCyFromUI2(uiin: UShort, pcyout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarCyFromUI2(uiin.toShort(), pcyout.rawAddress)

public actual fun varCyFromUI4(ulin: UInt, pcyout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarCyFromUI4(ulin.toInt(), pcyout.rawAddress)

public actual fun varCyFromUI8(ui64in: ULong, pcyout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarCyFromUI8(ui64in.toLong(), pcyout.rawAddress)

public actual fun varCyInt(cyin: CY, pcyresult: MutPtr): Hresult =
    0

public actual fun varCyMul(cyleft: CY, cyright: CY, pcyresult: MutPtr): Hresult =
    0

public actual fun varCyMulI4(cyleft: CY, lright: Int, pcyresult: MutPtr): Hresult =
    0

public actual fun varCyMulI8(cyleft: CY, lright: Long, pcyresult: MutPtr): Hresult =
    0

public actual fun varCyNeg(cyin: CY, pcyresult: MutPtr): Hresult =
    0

public actual fun varCyRound(cyin: CY, cdecimals: Int, pcyresult: MutPtr): Hresult =
    0

public actual fun varCySub(cyleft: CY, cyright: CY, pcyresult: MutPtr): Hresult =
    0

public actual fun varDateFromBool(boolin: VariantBool, pdateout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarDateFromBool(boolin, pdateout.rawAddress)

public actual fun varDateFromCy(cyin: CY, pdateout: MutPtr): Hresult =
    0

public actual fun varDateFromDec(pdecin: ConstPtr, pdateout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarDateFromDec(pdecin.rawAddress, pdateout.rawAddress)

public actual fun varDateFromDisp(pdispin: MutPtr, lcid: UInt, pdateout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarDateFromDisp(pdispin.rawAddress, lcid.toInt(), pdateout.rawAddress)

public actual fun varDateFromI1(cin: Byte, pdateout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarDateFromI1(cin, pdateout.rawAddress)

public actual fun varDateFromI2(sin: Short, pdateout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarDateFromI2(sin, pdateout.rawAddress)

public actual fun varDateFromI4(lin: Int, pdateout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarDateFromI4(lin, pdateout.rawAddress)

public actual fun varDateFromI8(i64in: Long, pdateout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarDateFromI8(i64in, pdateout.rawAddress)

public actual fun varDateFromR4(fltin: Float, pdateout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarDateFromR4(fltin, pdateout.rawAddress)

public actual fun varDateFromR8(dblin: Double, pdateout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarDateFromR8(dblin, pdateout.rawAddress)

public actual fun varDateFromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pdateout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarDateFromStr(strin.rawAddress, lcid.toInt(), dwflags.toInt(), pdateout.rawAddress)

public actual fun varDateFromUI1(bin: UByte, pdateout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarDateFromUI1(bin.toByte(), pdateout.rawAddress)

public actual fun varDateFromUI2(uiin: UShort, pdateout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarDateFromUI2(uiin.toShort(), pdateout.rawAddress)

public actual fun varDateFromUI4(ulin: UInt, pdateout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarDateFromUI4(ulin.toInt(), pdateout.rawAddress)

public actual fun varDateFromUI8(ui64in: ULong, pdateout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarDateFromUI8(ui64in.toLong(), pdateout.rawAddress)

public actual fun varDateFromUdate(pudatein: ConstPtr, dwflags: UInt, pdateout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarDateFromUdate(pudatein.rawAddress, dwflags.toInt(), pdateout.rawAddress)

public actual fun varDateFromUdateEx(pudatein: ConstPtr, lcid: UInt, dwflags: UInt, pdateout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarDateFromUdateEx(pudatein.rawAddress, lcid.toInt(), dwflags.toInt(), pdateout.rawAddress)

public actual fun varDecAbs(pdecin: ConstPtr, pdecresult: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarDecAbs(pdecin.rawAddress, pdecresult.rawAddress)

public actual fun varDecAdd(pdecleft: ConstPtr, pdecright: ConstPtr, pdecresult: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarDecAdd(pdecleft.rawAddress, pdecright.rawAddress, pdecresult.rawAddress)

public actual fun varDecCmp(pdecleft: ConstPtr, pdecright: ConstPtr): Varcmp =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarDecCmp(pdecleft.rawAddress, pdecright.rawAddress).toUInt()

public actual fun varDecCmpR8(pdecleft: ConstPtr, dblright: Double): Varcmp =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarDecCmpR8(pdecleft.rawAddress, dblright).toUInt()

public actual fun varDecDiv(pdecleft: ConstPtr, pdecright: ConstPtr, pdecresult: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarDecDiv(pdecleft.rawAddress, pdecright.rawAddress, pdecresult.rawAddress)

public actual fun varDecFix(pdecin: ConstPtr, pdecresult: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarDecFix(pdecin.rawAddress, pdecresult.rawAddress)

public actual fun varDecFromBool(boolin: VariantBool, pdecout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarDecFromBool(boolin, pdecout.rawAddress)

public actual fun varDecFromCy(cyin: CY, pdecout: MutPtr): Hresult =
    0

public actual fun varDecFromDate(datein: Double, pdecout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarDecFromDate(datein, pdecout.rawAddress)

public actual fun varDecFromDisp(pdispin: MutPtr, lcid: UInt, pdecout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarDecFromDisp(pdispin.rawAddress, lcid.toInt(), pdecout.rawAddress)

public actual fun varDecFromI1(cin: Byte, pdecout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarDecFromI1(cin, pdecout.rawAddress)

public actual fun varDecFromI2(uiin: Short, pdecout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarDecFromI2(uiin, pdecout.rawAddress)

public actual fun varDecFromI4(lin: Int, pdecout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarDecFromI4(lin, pdecout.rawAddress)

public actual fun varDecFromI8(i64in: Long, pdecout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarDecFromI8(i64in, pdecout.rawAddress)

public actual fun varDecFromR4(fltin: Float, pdecout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarDecFromR4(fltin, pdecout.rawAddress)

public actual fun varDecFromR8(dblin: Double, pdecout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarDecFromR8(dblin, pdecout.rawAddress)

public actual fun varDecFromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pdecout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarDecFromStr(strin.rawAddress, lcid.toInt(), dwflags.toInt(), pdecout.rawAddress)

public actual fun varDecFromUI1(bin: UByte, pdecout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarDecFromUI1(bin.toByte(), pdecout.rawAddress)

public actual fun varDecFromUI2(uiin: UShort, pdecout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarDecFromUI2(uiin.toShort(), pdecout.rawAddress)

public actual fun varDecFromUI4(ulin: UInt, pdecout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarDecFromUI4(ulin.toInt(), pdecout.rawAddress)

public actual fun varDecFromUI8(ui64in: ULong, pdecout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarDecFromUI8(ui64in.toLong(), pdecout.rawAddress)

public actual fun varDecInt(pdecin: ConstPtr, pdecresult: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarDecInt(pdecin.rawAddress, pdecresult.rawAddress)

public actual fun varDecMul(pdecleft: ConstPtr, pdecright: ConstPtr, pdecresult: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarDecMul(pdecleft.rawAddress, pdecright.rawAddress, pdecresult.rawAddress)

public actual fun varDecNeg(pdecin: ConstPtr, pdecresult: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarDecNeg(pdecin.rawAddress, pdecresult.rawAddress)

public actual fun varDecRound(pdecin: ConstPtr, cdecimals: Int, pdecresult: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarDecRound(pdecin.rawAddress, cdecimals, pdecresult.rawAddress)

public actual fun varDecSub(pdecleft: ConstPtr, pdecright: ConstPtr, pdecresult: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarDecSub(pdecleft.rawAddress, pdecright.rawAddress, pdecresult.rawAddress)

public actual fun varDiv(pvarleft: ConstPtr, pvarright: ConstPtr, pvarresult: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarDiv(pvarleft.rawAddress, pvarright.rawAddress, pvarresult.rawAddress)

public actual fun varEqv(pvarleft: ConstPtr, pvarright: ConstPtr, pvarresult: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarEqv(pvarleft.rawAddress, pvarright.rawAddress, pvarresult.rawAddress)

public actual fun varFix(pvarin: ConstPtr, pvarresult: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarFix(pvarin.rawAddress, pvarresult.rawAddress)

public actual fun varFormat(pvarin: ConstPtr, pstrformat: Pcwstr, ifirstday: VarformatFirstDay, ifirstweek: VarformatFirstWeek, dwflags: UInt, pbstrout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarFormat(pvarin.rawAddress, pstrformat.rawAddress, ifirstday, ifirstweek, dwflags.toInt(), pbstrout.rawAddress)

public actual fun varFormatCurrency(pvarin: ConstPtr, inumdig: Int, iinclead: Int, iuseparens: Int, igroup: Int, dwflags: UInt, pbstrout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarFormatCurrency(pvarin.rawAddress, inumdig, iinclead, iuseparens, igroup, dwflags.toInt(), pbstrout.rawAddress)

public actual fun varFormatDateTime(pvarin: ConstPtr, inamedformat: VarformatNamedFormat, dwflags: UInt, pbstrout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarFormatDateTime(pvarin.rawAddress, inamedformat, dwflags.toInt(), pbstrout.rawAddress)

public actual fun varFormatFromTokens(pvarin: ConstPtr, pstrformat: Pcwstr, pbtokcur: ConstPtr, dwflags: UInt, pbstrout: MutPtr, lcid: UInt): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarFormatFromTokens(pvarin.rawAddress, pstrformat.rawAddress, pbtokcur.rawAddress, dwflags.toInt(), pbstrout.rawAddress, lcid.toInt())

public actual fun varFormatNumber(pvarin: ConstPtr, inumdig: Int, iinclead: VarformatLeadingDigit, iuseparens: VarformatParentheses, igroup: VarformatGroup, dwflags: UInt, pbstrout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarFormatNumber(pvarin.rawAddress, inumdig, iinclead, iuseparens, igroup, dwflags.toInt(), pbstrout.rawAddress)

public actual fun varFormatPercent(pvarin: ConstPtr, inumdig: Int, iinclead: VarformatLeadingDigit, iuseparens: VarformatParentheses, igroup: VarformatGroup, dwflags: UInt, pbstrout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarFormatPercent(pvarin.rawAddress, inumdig, iinclead, iuseparens, igroup, dwflags.toInt(), pbstrout.rawAddress)

public actual fun varI1FromBool(boolin: VariantBool, pcout: Pstr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarI1FromBool(boolin, pcout.rawAddress)

public actual fun varI1FromCy(cyin: CY, pcout: Pstr): Hresult =
    0

public actual fun varI1FromDate(datein: Double, pcout: Pstr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarI1FromDate(datein, pcout.rawAddress)

public actual fun varI1FromDec(pdecin: ConstPtr, pcout: Pstr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarI1FromDec(pdecin.rawAddress, pcout.rawAddress)

public actual fun varI1FromDisp(pdispin: MutPtr, lcid: UInt, pcout: Pstr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarI1FromDisp(pdispin.rawAddress, lcid.toInt(), pcout.rawAddress)

public actual fun varI1FromI2(uiin: Short, pcout: Pstr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarI1FromI2(uiin, pcout.rawAddress)

public actual fun varI1FromI4(lin: Int, pcout: Pstr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarI1FromI4(lin, pcout.rawAddress)

public actual fun varI1FromI8(i64in: Long, pcout: Pstr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarI1FromI8(i64in, pcout.rawAddress)

public actual fun varI1FromR4(fltin: Float, pcout: Pstr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarI1FromR4(fltin, pcout.rawAddress)

public actual fun varI1FromR8(dblin: Double, pcout: Pstr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarI1FromR8(dblin, pcout.rawAddress)

public actual fun varI1FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pcout: Pstr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarI1FromStr(strin.rawAddress, lcid.toInt(), dwflags.toInt(), pcout.rawAddress)

public actual fun varI1FromUI1(bin: UByte, pcout: Pstr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarI1FromUI1(bin.toByte(), pcout.rawAddress)

public actual fun varI1FromUI2(uiin: UShort, pcout: Pstr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarI1FromUI2(uiin.toShort(), pcout.rawAddress)

public actual fun varI1FromUI4(ulin: UInt, pcout: Pstr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarI1FromUI4(ulin.toInt(), pcout.rawAddress)

public actual fun varI1FromUI8(i64in: ULong, pcout: Pstr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarI1FromUI8(i64in.toLong(), pcout.rawAddress)

public actual fun varI2FromBool(boolin: VariantBool, psout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarI2FromBool(boolin, psout.rawAddress)

public actual fun varI2FromCy(cyin: CY, psout: MutPtr): Hresult =
    0

public actual fun varI2FromDate(datein: Double, psout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarI2FromDate(datein, psout.rawAddress)

public actual fun varI2FromDec(pdecin: ConstPtr, psout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarI2FromDec(pdecin.rawAddress, psout.rawAddress)

public actual fun varI2FromDisp(pdispin: MutPtr, lcid: UInt, psout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarI2FromDisp(pdispin.rawAddress, lcid.toInt(), psout.rawAddress)

public actual fun varI2FromI1(cin: Byte, psout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarI2FromI1(cin, psout.rawAddress)

public actual fun varI2FromI4(lin: Int, psout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarI2FromI4(lin, psout.rawAddress)

public actual fun varI2FromI8(i64in: Long, psout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarI2FromI8(i64in, psout.rawAddress)

public actual fun varI2FromR4(fltin: Float, psout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarI2FromR4(fltin, psout.rawAddress)

public actual fun varI2FromR8(dblin: Double, psout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarI2FromR8(dblin, psout.rawAddress)

public actual fun varI2FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, psout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarI2FromStr(strin.rawAddress, lcid.toInt(), dwflags.toInt(), psout.rawAddress)

public actual fun varI2FromUI1(bin: UByte, psout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarI2FromUI1(bin.toByte(), psout.rawAddress)

public actual fun varI2FromUI2(uiin: UShort, psout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarI2FromUI2(uiin.toShort(), psout.rawAddress)

public actual fun varI2FromUI4(ulin: UInt, psout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarI2FromUI4(ulin.toInt(), psout.rawAddress)

public actual fun varI2FromUI8(ui64in: ULong, psout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarI2FromUI8(ui64in.toLong(), psout.rawAddress)

public actual fun varI4FromBool(boolin: VariantBool, plout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarI4FromBool(boolin, plout.rawAddress)

public actual fun varI4FromCy(cyin: CY, plout: MutPtr): Hresult =
    0

public actual fun varI4FromDate(datein: Double, plout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarI4FromDate(datein, plout.rawAddress)

public actual fun varI4FromDec(pdecin: ConstPtr, plout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarI4FromDec(pdecin.rawAddress, plout.rawAddress)

public actual fun varI4FromDisp(pdispin: MutPtr, lcid: UInt, plout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarI4FromDisp(pdispin.rawAddress, lcid.toInt(), plout.rawAddress)

public actual fun varI4FromI1(cin: Byte, plout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarI4FromI1(cin, plout.rawAddress)

public actual fun varI4FromI2(sin: Short, plout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarI4FromI2(sin, plout.rawAddress)

public actual fun varI4FromI8(i64in: Long, plout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarI4FromI8(i64in, plout.rawAddress)

public actual fun varI4FromR4(fltin: Float, plout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarI4FromR4(fltin, plout.rawAddress)

public actual fun varI4FromR8(dblin: Double, plout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarI4FromR8(dblin, plout.rawAddress)

public actual fun varI4FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, plout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarI4FromStr(strin.rawAddress, lcid.toInt(), dwflags.toInt(), plout.rawAddress)

public actual fun varI4FromUI1(bin: UByte, plout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarI4FromUI1(bin.toByte(), plout.rawAddress)

public actual fun varI4FromUI2(uiin: UShort, plout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarI4FromUI2(uiin.toShort(), plout.rawAddress)

public actual fun varI4FromUI4(ulin: UInt, plout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarI4FromUI4(ulin.toInt(), plout.rawAddress)

public actual fun varI4FromUI8(ui64in: ULong, plout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarI4FromUI8(ui64in.toLong(), plout.rawAddress)

public actual fun varI8FromBool(boolin: VariantBool, pi64out: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarI8FromBool(boolin, pi64out.rawAddress)

public actual fun varI8FromCy(cyin: CY, pi64out: MutPtr): Hresult =
    0

public actual fun varI8FromDate(datein: Double, pi64out: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarI8FromDate(datein, pi64out.rawAddress)

public actual fun varI8FromDec(pdecin: ConstPtr, pi64out: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarI8FromDec(pdecin.rawAddress, pi64out.rawAddress)

public actual fun varI8FromDisp(pdispin: MutPtr, lcid: UInt, pi64out: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarI8FromDisp(pdispin.rawAddress, lcid.toInt(), pi64out.rawAddress)

public actual fun varI8FromI1(cin: Byte, pi64out: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarI8FromI1(cin, pi64out.rawAddress)

public actual fun varI8FromI2(sin: Short, pi64out: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarI8FromI2(sin, pi64out.rawAddress)

public actual fun varI8FromR4(fltin: Float, pi64out: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarI8FromR4(fltin, pi64out.rawAddress)

public actual fun varI8FromR8(dblin: Double, pi64out: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarI8FromR8(dblin, pi64out.rawAddress)

public actual fun varI8FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pi64out: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarI8FromStr(strin.rawAddress, lcid.toInt(), dwflags.toInt(), pi64out.rawAddress)

public actual fun varI8FromUI1(bin: UByte, pi64out: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarI8FromUI1(bin.toByte(), pi64out.rawAddress)

public actual fun varI8FromUI2(uiin: UShort, pi64out: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarI8FromUI2(uiin.toShort(), pi64out.rawAddress)

public actual fun varI8FromUI4(ulin: UInt, pi64out: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarI8FromUI4(ulin.toInt(), pi64out.rawAddress)

public actual fun varI8FromUI8(ui64in: ULong, pi64out: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarI8FromUI8(ui64in.toLong(), pi64out.rawAddress)

public actual fun varIdiv(pvarleft: ConstPtr, pvarright: ConstPtr, pvarresult: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarIdiv(pvarleft.rawAddress, pvarright.rawAddress, pvarresult.rawAddress)

public actual fun varImp(pvarleft: ConstPtr, pvarright: ConstPtr, pvarresult: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarImp(pvarleft.rawAddress, pvarright.rawAddress, pvarresult.rawAddress)

public actual fun varInt(pvarin: ConstPtr, pvarresult: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarInt(pvarin.rawAddress, pvarresult.rawAddress)

public actual fun varMod(pvarleft: ConstPtr, pvarright: ConstPtr, pvarresult: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarMod(pvarleft.rawAddress, pvarright.rawAddress, pvarresult.rawAddress)

public actual fun varMonthName(imonth: Int, fabbrev: Int, dwflags: UInt, pbstrout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarMonthName(imonth, fabbrev, dwflags.toInt(), pbstrout.rawAddress)

public actual fun varMul(pvarleft: ConstPtr, pvarright: ConstPtr, pvarresult: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarMul(pvarleft.rawAddress, pvarright.rawAddress, pvarresult.rawAddress)

public actual fun varNeg(pvarin: ConstPtr, pvarresult: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarNeg(pvarin.rawAddress, pvarresult.rawAddress)

public actual fun varNot(pvarin: ConstPtr, pvarresult: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarNot(pvarin.rawAddress, pvarresult.rawAddress)

public actual fun varNumFromParseNum(pnumprs: ConstPtr, rgbdig: ConstPtr, dwvtbits: UInt, pvar: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarNumFromParseNum(pnumprs.rawAddress, rgbdig.rawAddress, dwvtbits.toInt(), pvar.rawAddress)

public actual fun varOr(pvarleft: ConstPtr, pvarright: ConstPtr, pvarresult: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarOr(pvarleft.rawAddress, pvarright.rawAddress, pvarresult.rawAddress)

public actual fun varParseNumFromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pnumprs: MutPtr, rgbdig: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarParseNumFromStr(strin.rawAddress, lcid.toInt(), dwflags.toInt(), pnumprs.rawAddress, rgbdig.rawAddress)

public actual fun varPow(pvarleft: ConstPtr, pvarright: ConstPtr, pvarresult: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarPow(pvarleft.rawAddress, pvarright.rawAddress, pvarresult.rawAddress)

public actual fun varR4CmpR8(fltleft: Float, dblright: Double): Varcmp =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarR4CmpR8(fltleft, dblright).toUInt()

public actual fun varR4FromBool(boolin: VariantBool, pfltout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarR4FromBool(boolin, pfltout.rawAddress)

public actual fun varR4FromCy(cyin: CY, pfltout: MutPtr): Hresult =
    0

public actual fun varR4FromDate(datein: Double, pfltout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarR4FromDate(datein, pfltout.rawAddress)

public actual fun varR4FromDec(pdecin: ConstPtr, pfltout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarR4FromDec(pdecin.rawAddress, pfltout.rawAddress)

public actual fun varR4FromDisp(pdispin: MutPtr, lcid: UInt, pfltout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarR4FromDisp(pdispin.rawAddress, lcid.toInt(), pfltout.rawAddress)

public actual fun varR4FromI1(cin: Byte, pfltout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarR4FromI1(cin, pfltout.rawAddress)

public actual fun varR4FromI2(sin: Short, pfltout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarR4FromI2(sin, pfltout.rawAddress)

public actual fun varR4FromI4(lin: Int, pfltout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarR4FromI4(lin, pfltout.rawAddress)

public actual fun varR4FromI8(i64in: Long, pfltout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarR4FromI8(i64in, pfltout.rawAddress)

public actual fun varR4FromR8(dblin: Double, pfltout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarR4FromR8(dblin, pfltout.rawAddress)

public actual fun varR4FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pfltout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarR4FromStr(strin.rawAddress, lcid.toInt(), dwflags.toInt(), pfltout.rawAddress)

public actual fun varR4FromUI1(bin: UByte, pfltout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarR4FromUI1(bin.toByte(), pfltout.rawAddress)

public actual fun varR4FromUI2(uiin: UShort, pfltout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarR4FromUI2(uiin.toShort(), pfltout.rawAddress)

public actual fun varR4FromUI4(ulin: UInt, pfltout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarR4FromUI4(ulin.toInt(), pfltout.rawAddress)

public actual fun varR4FromUI8(ui64in: ULong, pfltout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarR4FromUI8(ui64in.toLong(), pfltout.rawAddress)

public actual fun varR8FromBool(boolin: VariantBool, pdblout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarR8FromBool(boolin, pdblout.rawAddress)

public actual fun varR8FromCy(cyin: CY, pdblout: MutPtr): Hresult =
    0

public actual fun varR8FromDate(datein: Double, pdblout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarR8FromDate(datein, pdblout.rawAddress)

public actual fun varR8FromDec(pdecin: ConstPtr, pdblout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarR8FromDec(pdecin.rawAddress, pdblout.rawAddress)

public actual fun varR8FromDisp(pdispin: MutPtr, lcid: UInt, pdblout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarR8FromDisp(pdispin.rawAddress, lcid.toInt(), pdblout.rawAddress)

public actual fun varR8FromI1(cin: Byte, pdblout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarR8FromI1(cin, pdblout.rawAddress)

public actual fun varR8FromI2(sin: Short, pdblout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarR8FromI2(sin, pdblout.rawAddress)

public actual fun varR8FromI4(lin: Int, pdblout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarR8FromI4(lin, pdblout.rawAddress)

public actual fun varR8FromI8(i64in: Long, pdblout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarR8FromI8(i64in, pdblout.rawAddress)

public actual fun varR8FromR4(fltin: Float, pdblout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarR8FromR4(fltin, pdblout.rawAddress)

public actual fun varR8FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pdblout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarR8FromStr(strin.rawAddress, lcid.toInt(), dwflags.toInt(), pdblout.rawAddress)

public actual fun varR8FromUI1(bin: UByte, pdblout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarR8FromUI1(bin.toByte(), pdblout.rawAddress)

public actual fun varR8FromUI2(uiin: UShort, pdblout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarR8FromUI2(uiin.toShort(), pdblout.rawAddress)

public actual fun varR8FromUI4(ulin: UInt, pdblout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarR8FromUI4(ulin.toInt(), pdblout.rawAddress)

public actual fun varR8FromUI8(ui64in: ULong, pdblout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarR8FromUI8(ui64in.toLong(), pdblout.rawAddress)

public actual fun varR8Pow(dblleft: Double, dblright: Double, pdblresult: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarR8Pow(dblleft, dblright, pdblresult.rawAddress)

public actual fun varR8Round(dblin: Double, cdecimals: Int, pdblresult: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarR8Round(dblin, cdecimals, pdblresult.rawAddress)

public actual fun varRound(pvarin: ConstPtr, cdecimals: Int, pvarresult: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarRound(pvarin.rawAddress, cdecimals, pvarresult.rawAddress)

public actual fun varSub(pvarleft: ConstPtr, pvarright: ConstPtr, pvarresult: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarSub(pvarleft.rawAddress, pvarright.rawAddress, pvarresult.rawAddress)

public actual fun varTokenizeFormatString(pstrformat: Pcwstr, rgbtok: MutPtr, cbtok: Int, ifirstday: VarformatFirstDay, ifirstweek: VarformatFirstWeek, lcid: UInt, pcbactual: ConstPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarTokenizeFormatString(pstrformat.rawAddress, rgbtok.rawAddress, cbtok, ifirstday, ifirstweek, lcid.toInt(), pcbactual.rawAddress)

public actual fun varUI1FromBool(boolin: VariantBool, pbout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarUI1FromBool(boolin, pbout.rawAddress)

public actual fun varUI1FromCy(cyin: CY, pbout: MutPtr): Hresult =
    0

public actual fun varUI1FromDate(datein: Double, pbout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarUI1FromDate(datein, pbout.rawAddress)

public actual fun varUI1FromDec(pdecin: ConstPtr, pbout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarUI1FromDec(pdecin.rawAddress, pbout.rawAddress)

public actual fun varUI1FromDisp(pdispin: MutPtr, lcid: UInt, pbout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarUI1FromDisp(pdispin.rawAddress, lcid.toInt(), pbout.rawAddress)

public actual fun varUI1FromI1(cin: Byte, pbout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarUI1FromI1(cin, pbout.rawAddress)

public actual fun varUI1FromI2(sin: Short, pbout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarUI1FromI2(sin, pbout.rawAddress)

public actual fun varUI1FromI4(lin: Int, pbout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarUI1FromI4(lin, pbout.rawAddress)

public actual fun varUI1FromI8(i64in: Long, pbout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarUI1FromI8(i64in, pbout.rawAddress)

public actual fun varUI1FromR4(fltin: Float, pbout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarUI1FromR4(fltin, pbout.rawAddress)

public actual fun varUI1FromR8(dblin: Double, pbout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarUI1FromR8(dblin, pbout.rawAddress)

public actual fun varUI1FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pbout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarUI1FromStr(strin.rawAddress, lcid.toInt(), dwflags.toInt(), pbout.rawAddress)

public actual fun varUI1FromUI2(uiin: UShort, pbout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarUI1FromUI2(uiin.toShort(), pbout.rawAddress)

public actual fun varUI1FromUI4(ulin: UInt, pbout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarUI1FromUI4(ulin.toInt(), pbout.rawAddress)

public actual fun varUI1FromUI8(ui64in: ULong, pbout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarUI1FromUI8(ui64in.toLong(), pbout.rawAddress)

public actual fun varUI2FromBool(boolin: VariantBool, puiout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarUI2FromBool(boolin, puiout.rawAddress)

public actual fun varUI2FromCy(cyin: CY, puiout: MutPtr): Hresult =
    0

public actual fun varUI2FromDate(datein: Double, puiout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarUI2FromDate(datein, puiout.rawAddress)

public actual fun varUI2FromDec(pdecin: ConstPtr, puiout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarUI2FromDec(pdecin.rawAddress, puiout.rawAddress)

public actual fun varUI2FromDisp(pdispin: MutPtr, lcid: UInt, puiout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarUI2FromDisp(pdispin.rawAddress, lcid.toInt(), puiout.rawAddress)

public actual fun varUI2FromI1(cin: Byte, puiout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarUI2FromI1(cin, puiout.rawAddress)

public actual fun varUI2FromI2(uiin: Short, puiout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarUI2FromI2(uiin, puiout.rawAddress)

public actual fun varUI2FromI4(lin: Int, puiout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarUI2FromI4(lin, puiout.rawAddress)

public actual fun varUI2FromI8(i64in: Long, puiout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarUI2FromI8(i64in, puiout.rawAddress)

public actual fun varUI2FromR4(fltin: Float, puiout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarUI2FromR4(fltin, puiout.rawAddress)

public actual fun varUI2FromR8(dblin: Double, puiout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarUI2FromR8(dblin, puiout.rawAddress)

public actual fun varUI2FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, puiout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarUI2FromStr(strin.rawAddress, lcid.toInt(), dwflags.toInt(), puiout.rawAddress)

public actual fun varUI2FromUI1(bin: UByte, puiout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarUI2FromUI1(bin.toByte(), puiout.rawAddress)

public actual fun varUI2FromUI4(ulin: UInt, puiout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarUI2FromUI4(ulin.toInt(), puiout.rawAddress)

public actual fun varUI2FromUI8(i64in: ULong, puiout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarUI2FromUI8(i64in.toLong(), puiout.rawAddress)

public actual fun varUI4FromBool(boolin: VariantBool, pulout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarUI4FromBool(boolin, pulout.rawAddress)

public actual fun varUI4FromCy(cyin: CY, pulout: MutPtr): Hresult =
    0

public actual fun varUI4FromDate(datein: Double, pulout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarUI4FromDate(datein, pulout.rawAddress)

public actual fun varUI4FromDec(pdecin: ConstPtr, pulout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarUI4FromDec(pdecin.rawAddress, pulout.rawAddress)

public actual fun varUI4FromDisp(pdispin: MutPtr, lcid: UInt, pulout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarUI4FromDisp(pdispin.rawAddress, lcid.toInt(), pulout.rawAddress)

public actual fun varUI4FromI1(cin: Byte, pulout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarUI4FromI1(cin, pulout.rawAddress)

public actual fun varUI4FromI2(uiin: Short, pulout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarUI4FromI2(uiin, pulout.rawAddress)

public actual fun varUI4FromI4(lin: Int, pulout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarUI4FromI4(lin, pulout.rawAddress)

public actual fun varUI4FromI8(i64in: Long, plout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarUI4FromI8(i64in, plout.rawAddress)

public actual fun varUI4FromR4(fltin: Float, pulout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarUI4FromR4(fltin, pulout.rawAddress)

public actual fun varUI4FromR8(dblin: Double, pulout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarUI4FromR8(dblin, pulout.rawAddress)

public actual fun varUI4FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pulout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarUI4FromStr(strin.rawAddress, lcid.toInt(), dwflags.toInt(), pulout.rawAddress)

public actual fun varUI4FromUI1(bin: UByte, pulout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarUI4FromUI1(bin.toByte(), pulout.rawAddress)

public actual fun varUI4FromUI2(uiin: UShort, pulout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarUI4FromUI2(uiin.toShort(), pulout.rawAddress)

public actual fun varUI4FromUI8(ui64in: ULong, plout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarUI4FromUI8(ui64in.toLong(), plout.rawAddress)

public actual fun varUI8FromBool(boolin: VariantBool, pi64out: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarUI8FromBool(boolin, pi64out.rawAddress)

public actual fun varUI8FromCy(cyin: CY, pi64out: MutPtr): Hresult =
    0

public actual fun varUI8FromDate(datein: Double, pi64out: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarUI8FromDate(datein, pi64out.rawAddress)

public actual fun varUI8FromDec(pdecin: ConstPtr, pi64out: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarUI8FromDec(pdecin.rawAddress, pi64out.rawAddress)

public actual fun varUI8FromDisp(pdispin: MutPtr, lcid: UInt, pi64out: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarUI8FromDisp(pdispin.rawAddress, lcid.toInt(), pi64out.rawAddress)

public actual fun varUI8FromI1(cin: Byte, pi64out: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarUI8FromI1(cin, pi64out.rawAddress)

public actual fun varUI8FromI2(sin: Short, pi64out: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarUI8FromI2(sin, pi64out.rawAddress)

public actual fun varUI8FromI8(ui64in: Long, pi64out: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarUI8FromI8(ui64in, pi64out.rawAddress)

public actual fun varUI8FromR4(fltin: Float, pi64out: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarUI8FromR4(fltin, pi64out.rawAddress)

public actual fun varUI8FromR8(dblin: Double, pi64out: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarUI8FromR8(dblin, pi64out.rawAddress)

public actual fun varUI8FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pi64out: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarUI8FromStr(strin.rawAddress, lcid.toInt(), dwflags.toInt(), pi64out.rawAddress)

public actual fun varUI8FromUI1(bin: UByte, pi64out: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarUI8FromUI1(bin.toByte(), pi64out.rawAddress)

public actual fun varUI8FromUI2(uiin: UShort, pi64out: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarUI8FromUI2(uiin.toShort(), pi64out.rawAddress)

public actual fun varUI8FromUI4(ulin: UInt, pi64out: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarUI8FromUI4(ulin.toInt(), pi64out.rawAddress)

public actual fun varUdateFromDate(datein: Double, dwflags: UInt, pudateout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarUdateFromDate(datein, dwflags.toInt(), pudateout.rawAddress)

public actual fun varWeekdayName(iweekday: Int, fabbrev: Int, ifirstday: Int, dwflags: UInt, pbstrout: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarWeekdayName(iweekday, fabbrev, ifirstday, dwflags.toInt(), pbstrout.rawAddress)

public actual fun varXor(pvarleft: ConstPtr, pvarright: ConstPtr, pvarresult: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVarXor(pvarleft.rawAddress, pvarright.rawAddress, pvarresult.rawAddress)

public actual fun vectorFromBstr(bstr: Bstr, ppsa: MutPtr): Hresult =
    WindowsWin32SystemOleJniBridge.windowssysWindowsWin32SystemOleVectorFromBstr(bstr.rawAddress, ppsa.rawAddress)
