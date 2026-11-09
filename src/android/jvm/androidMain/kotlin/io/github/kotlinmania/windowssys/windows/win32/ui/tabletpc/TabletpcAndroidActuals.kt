@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR

private object WindowsWin32UiTabletpcJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_ui_tabletpc_AddStroke(hrc: Long, ppacketdesc: Long, cbpacket: Int, ppacket: Long, pxform: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_tabletpc_AddWordsToWordList(hwl: Long, pwcwords: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_tabletpc_AdviseInkChange(hrc: Long, bnewstroke: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_tabletpc_CreateContext(hrec: Long, phrc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_tabletpc_CreateRecognizer(pclsid: Long, phrec: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_tabletpc_DestroyContext(hrc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_tabletpc_DestroyRecognizer(hrec: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_tabletpc_DestroyWordList(hwl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_tabletpc_EndInkInput(hrc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_tabletpc_GetAllRecognizers(recognizerclsids: Long, count: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_tabletpc_GetBestResultString(hrc: Long, pcsize: Long, pwcbestresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_tabletpc_GetLatticePtr(hrc: Long, pplattice: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_tabletpc_GetLeftSeparator(hrc: Long, pcsize: Long, pwcleftseparator: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_tabletpc_GetRecoAttributes(hrec: Long, precoattrs: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_tabletpc_GetResultPropertyList(hrec: Long, ppropertycount: Long, ppropertyguid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_tabletpc_GetRightSeparator(hrc: Long, pcsize: Long, pwcrightseparator: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_tabletpc_GetUnicodeRanges(hrec: Long, pcranges: Long, pcr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_tabletpc_IsStringSupported(hrc: Long, wcstring: Int, pwcstring: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_tabletpc_MakeWordList(hrec: Long, pbuffer: Long, phwl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_tabletpc_Process(hrc: Long, pbpartialprocessing: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_tabletpc_SetEnabledUnicodeRanges(hrc: Long, cranges: Int, pcr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_tabletpc_SetFactoid(hrc: Long, cwcfactoid: Int, pwcfactoid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_tabletpc_SetFlags(hrc: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_tabletpc_SetGuide(hrc: Long, pguide: Long, iindex: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_tabletpc_SetTextContext(hrc: Long, cwcbefore: Int, pwcbefore: Long, cwcafter: Int, pwcafter: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_tabletpc_SetWordList(hrc: Long, hwl: Long): Int
}

public actual fun AddStroke(hrc: HRECOCONTEXT, ppacketdesc: Long, cbpacket: UInt, ppacket: Long, pxform: Long): HRESULT =
    WindowsWin32UiTabletpcJniBridge.windowssys_windows_win32_ui_tabletpc_AddStroke(hrc, ppacketdesc, cbpacket.toInt(), ppacket, pxform)

public actual fun AddWordsToWordList(hwl: HRECOWORDLIST, pwcwords: PCWSTR): HRESULT =
    WindowsWin32UiTabletpcJniBridge.windowssys_windows_win32_ui_tabletpc_AddWordsToWordList(hwl, pwcwords)

public actual fun AdviseInkChange(hrc: HRECOCONTEXT, bnewstroke: BOOL): HRESULT =
    WindowsWin32UiTabletpcJniBridge.windowssys_windows_win32_ui_tabletpc_AdviseInkChange(hrc, bnewstroke)

public actual fun CreateContext(hrec: HRECOGNIZER, phrc: Long): HRESULT =
    WindowsWin32UiTabletpcJniBridge.windowssys_windows_win32_ui_tabletpc_CreateContext(hrec, phrc)

public actual fun CreateRecognizer(pclsid: Long, phrec: Long): HRESULT =
    WindowsWin32UiTabletpcJniBridge.windowssys_windows_win32_ui_tabletpc_CreateRecognizer(pclsid, phrec)

public actual fun DestroyContext(hrc: HRECOCONTEXT): HRESULT =
    WindowsWin32UiTabletpcJniBridge.windowssys_windows_win32_ui_tabletpc_DestroyContext(hrc)

public actual fun DestroyRecognizer(hrec: HRECOGNIZER): HRESULT =
    WindowsWin32UiTabletpcJniBridge.windowssys_windows_win32_ui_tabletpc_DestroyRecognizer(hrec)

public actual fun DestroyWordList(hwl: HRECOWORDLIST): HRESULT =
    WindowsWin32UiTabletpcJniBridge.windowssys_windows_win32_ui_tabletpc_DestroyWordList(hwl)

public actual fun EndInkInput(hrc: HRECOCONTEXT): HRESULT =
    WindowsWin32UiTabletpcJniBridge.windowssys_windows_win32_ui_tabletpc_EndInkInput(hrc)

public actual fun GetAllRecognizers(recognizerclsids: Long, count: Long): HRESULT =
    WindowsWin32UiTabletpcJniBridge.windowssys_windows_win32_ui_tabletpc_GetAllRecognizers(recognizerclsids, count)

public actual fun GetBestResultString(hrc: HRECOCONTEXT, pcsize: Long, pwcbestresult: PWSTR): HRESULT =
    WindowsWin32UiTabletpcJniBridge.windowssys_windows_win32_ui_tabletpc_GetBestResultString(hrc, pcsize, pwcbestresult)

public actual fun GetLatticePtr(hrc: HRECOCONTEXT, pplattice: Long): HRESULT =
    WindowsWin32UiTabletpcJniBridge.windowssys_windows_win32_ui_tabletpc_GetLatticePtr(hrc, pplattice)

public actual fun GetLeftSeparator(hrc: HRECOCONTEXT, pcsize: Long, pwcleftseparator: PWSTR): HRESULT =
    WindowsWin32UiTabletpcJniBridge.windowssys_windows_win32_ui_tabletpc_GetLeftSeparator(hrc, pcsize, pwcleftseparator)

public actual fun GetRecoAttributes(hrec: HRECOGNIZER, precoattrs: Long): HRESULT =
    WindowsWin32UiTabletpcJniBridge.windowssys_windows_win32_ui_tabletpc_GetRecoAttributes(hrec, precoattrs)

public actual fun GetResultPropertyList(hrec: HRECOGNIZER, ppropertycount: Long, ppropertyguid: Long): HRESULT =
    WindowsWin32UiTabletpcJniBridge.windowssys_windows_win32_ui_tabletpc_GetResultPropertyList(hrec, ppropertycount, ppropertyguid)

public actual fun GetRightSeparator(hrc: HRECOCONTEXT, pcsize: Long, pwcrightseparator: PWSTR): HRESULT =
    WindowsWin32UiTabletpcJniBridge.windowssys_windows_win32_ui_tabletpc_GetRightSeparator(hrc, pcsize, pwcrightseparator)

public actual fun GetUnicodeRanges(hrec: HRECOGNIZER, pcranges: Long, pcr: Long): HRESULT =
    WindowsWin32UiTabletpcJniBridge.windowssys_windows_win32_ui_tabletpc_GetUnicodeRanges(hrec, pcranges, pcr)

public actual fun IsStringSupported(hrc: HRECOCONTEXT, wcstring: UInt, pwcstring: PCWSTR): HRESULT =
    WindowsWin32UiTabletpcJniBridge.windowssys_windows_win32_ui_tabletpc_IsStringSupported(hrc, wcstring.toInt(), pwcstring)

public actual fun LoadCachedAttributes(clsid: GUID, precoattributes: Long): HRESULT =
    0

public actual fun MakeWordList(hrec: HRECOGNIZER, pbuffer: PCWSTR, phwl: Long): HRESULT =
    WindowsWin32UiTabletpcJniBridge.windowssys_windows_win32_ui_tabletpc_MakeWordList(hrec, pbuffer, phwl)

public actual fun Process(hrc: HRECOCONTEXT, pbpartialprocessing: Long): HRESULT =
    WindowsWin32UiTabletpcJniBridge.windowssys_windows_win32_ui_tabletpc_Process(hrc, pbpartialprocessing)

public actual fun SetEnabledUnicodeRanges(hrc: HRECOCONTEXT, cranges: UInt, pcr: Long): HRESULT =
    WindowsWin32UiTabletpcJniBridge.windowssys_windows_win32_ui_tabletpc_SetEnabledUnicodeRanges(hrc, cranges.toInt(), pcr)

public actual fun SetFactoid(hrc: HRECOCONTEXT, cwcfactoid: UInt, pwcfactoid: PCWSTR): HRESULT =
    WindowsWin32UiTabletpcJniBridge.windowssys_windows_win32_ui_tabletpc_SetFactoid(hrc, cwcfactoid.toInt(), pwcfactoid)

public actual fun SetFlags(hrc: HRECOCONTEXT, dwflags: UInt): HRESULT =
    WindowsWin32UiTabletpcJniBridge.windowssys_windows_win32_ui_tabletpc_SetFlags(hrc, dwflags.toInt())

public actual fun SetGuide(hrc: HRECOCONTEXT, pguide: Long, iindex: UInt): HRESULT =
    WindowsWin32UiTabletpcJniBridge.windowssys_windows_win32_ui_tabletpc_SetGuide(hrc, pguide, iindex.toInt())

public actual fun SetTextContext(hrc: HRECOCONTEXT, cwcbefore: UInt, pwcbefore: PCWSTR, cwcafter: UInt, pwcafter: PCWSTR): HRESULT =
    WindowsWin32UiTabletpcJniBridge.windowssys_windows_win32_ui_tabletpc_SetTextContext(hrc, cwcbefore.toInt(), pwcbefore, cwcafter.toInt(), pwcafter)

public actual fun SetWordList(hrc: HRECOCONTEXT, hwl: HRECOWORDLIST): HRESULT =
    WindowsWin32UiTabletpcJniBridge.windowssys_windows_win32_ui_tabletpc_SetWordList(hrc, hwl)
