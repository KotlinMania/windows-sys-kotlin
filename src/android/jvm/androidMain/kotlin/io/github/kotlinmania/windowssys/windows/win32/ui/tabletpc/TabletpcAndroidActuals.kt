@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr

private object WindowsWin32UiTabletpcJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_ui_tabletpc_addStroke(hrc: Long, ppacketdesc: Long, cbpacket: Int, ppacket: Long, pxform: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_tabletpc_addWordsToWordList(hwl: Long, pwcwords: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_tabletpc_adviseInkChange(hrc: Long, bnewstroke: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_tabletpc_createContext(hrec: Long, phrc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_tabletpc_createRecognizer(pclsid: Long, phrec: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_tabletpc_destroyContext(hrc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_tabletpc_destroyRecognizer(hrec: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_tabletpc_destroyWordList(hwl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_tabletpc_endInkInput(hrc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_tabletpc_getAllRecognizers(recognizerclsids: Long, count: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_tabletpc_getBestResultString(hrc: Long, pcsize: Long, pwcbestresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_tabletpc_getLatticePtr(hrc: Long, pplattice: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_tabletpc_getLeftSeparator(hrc: Long, pcsize: Long, pwcleftseparator: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_tabletpc_getRecoAttributes(hrec: Long, precoattrs: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_tabletpc_getResultPropertyList(hrec: Long, ppropertycount: Long, ppropertyguid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_tabletpc_getRightSeparator(hrc: Long, pcsize: Long, pwcrightseparator: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_tabletpc_getUnicodeRanges(hrec: Long, pcranges: Long, pcr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_tabletpc_isStringSupported(hrc: Long, wcstring: Int, pwcstring: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_tabletpc_makeWordList(hrec: Long, pbuffer: Long, phwl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_tabletpc_process(hrc: Long, pbpartialprocessing: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_tabletpc_setEnabledUnicodeRanges(hrc: Long, cranges: Int, pcr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_tabletpc_setFactoid(hrc: Long, cwcfactoid: Int, pwcfactoid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_tabletpc_setFlags(hrc: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_tabletpc_setGuide(hrc: Long, pguide: Long, iindex: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_tabletpc_setTextContext(hrc: Long, cwcbefore: Int, pwcbefore: Long, cwcafter: Int, pwcafter: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_tabletpc_setWordList(hrc: Long, hwl: Long): Int
}

public actual fun addStroke(hrc: Hrecocontext, ppacketdesc: COpaquePointer?, cbpacket: UInt, ppacket: COpaquePointer?, pxform: COpaquePointer?): Hresult =
    WindowsWin32UiTabletpcJniBridge.windowssys_windows_win32_ui_tabletpc_addStroke((hrc?.value ?: 0L), (ppacketdesc?.value ?: 0L), cbpacket.toInt(), (ppacket?.value ?: 0L), (pxform?.value ?: 0L))

public actual fun addWordsToWordList(hwl: Hrecowordlist, pwcwords: Pcwstr): Hresult =
    WindowsWin32UiTabletpcJniBridge.windowssys_windows_win32_ui_tabletpc_addWordsToWordList((hwl?.value ?: 0L), (pwcwords?.value ?: 0L))

public actual fun adviseInkChange(hrc: Hrecocontext, bnewstroke: Bool): Hresult =
    WindowsWin32UiTabletpcJniBridge.windowssys_windows_win32_ui_tabletpc_adviseInkChange((hrc?.value ?: 0L), bnewstroke)

public actual fun createContext(hrec: Hrecognizer, phrc: COpaquePointer?): Hresult =
    WindowsWin32UiTabletpcJniBridge.windowssys_windows_win32_ui_tabletpc_createContext((hrec?.value ?: 0L), (phrc?.value ?: 0L))

public actual fun createRecognizer(pclsid: COpaquePointer?, phrec: COpaquePointer?): Hresult =
    WindowsWin32UiTabletpcJniBridge.windowssys_windows_win32_ui_tabletpc_createRecognizer((pclsid?.value ?: 0L), (phrec?.value ?: 0L))

public actual fun destroyContext(hrc: Hrecocontext): Hresult =
    WindowsWin32UiTabletpcJniBridge.windowssys_windows_win32_ui_tabletpc_destroyContext((hrc?.value ?: 0L))

public actual fun destroyRecognizer(hrec: Hrecognizer): Hresult =
    WindowsWin32UiTabletpcJniBridge.windowssys_windows_win32_ui_tabletpc_destroyRecognizer((hrec?.value ?: 0L))

public actual fun destroyWordList(hwl: Hrecowordlist): Hresult =
    WindowsWin32UiTabletpcJniBridge.windowssys_windows_win32_ui_tabletpc_destroyWordList((hwl?.value ?: 0L))

public actual fun endInkInput(hrc: Hrecocontext): Hresult =
    WindowsWin32UiTabletpcJniBridge.windowssys_windows_win32_ui_tabletpc_endInkInput((hrc?.value ?: 0L))

public actual fun getAllRecognizers(recognizerclsids: COpaquePointer?, count: COpaquePointer?): Hresult =
    WindowsWin32UiTabletpcJniBridge.windowssys_windows_win32_ui_tabletpc_getAllRecognizers((recognizerclsids?.value ?: 0L), (count?.value ?: 0L))

public actual fun getBestResultString(hrc: Hrecocontext, pcsize: COpaquePointer?, pwcbestresult: Pwstr): Hresult =
    WindowsWin32UiTabletpcJniBridge.windowssys_windows_win32_ui_tabletpc_getBestResultString((hrc?.value ?: 0L), (pcsize?.value ?: 0L), (pwcbestresult?.value ?: 0L))

public actual fun getLatticePtr(hrc: Hrecocontext, pplattice: COpaquePointer?): Hresult =
    WindowsWin32UiTabletpcJniBridge.windowssys_windows_win32_ui_tabletpc_getLatticePtr((hrc?.value ?: 0L), (pplattice?.value ?: 0L))

public actual fun getLeftSeparator(hrc: Hrecocontext, pcsize: COpaquePointer?, pwcleftseparator: Pwstr): Hresult =
    WindowsWin32UiTabletpcJniBridge.windowssys_windows_win32_ui_tabletpc_getLeftSeparator((hrc?.value ?: 0L), (pcsize?.value ?: 0L), (pwcleftseparator?.value ?: 0L))

public actual fun getRecoAttributes(hrec: Hrecognizer, precoattrs: COpaquePointer?): Hresult =
    WindowsWin32UiTabletpcJniBridge.windowssys_windows_win32_ui_tabletpc_getRecoAttributes((hrec?.value ?: 0L), (precoattrs?.value ?: 0L))

public actual fun getResultPropertyList(hrec: Hrecognizer, ppropertycount: COpaquePointer?, ppropertyguid: COpaquePointer?): Hresult =
    WindowsWin32UiTabletpcJniBridge.windowssys_windows_win32_ui_tabletpc_getResultPropertyList((hrec?.value ?: 0L), (ppropertycount?.value ?: 0L), (ppropertyguid?.value ?: 0L))

public actual fun getRightSeparator(hrc: Hrecocontext, pcsize: COpaquePointer?, pwcrightseparator: Pwstr): Hresult =
    WindowsWin32UiTabletpcJniBridge.windowssys_windows_win32_ui_tabletpc_getRightSeparator((hrc?.value ?: 0L), (pcsize?.value ?: 0L), (pwcrightseparator?.value ?: 0L))

public actual fun getUnicodeRanges(hrec: Hrecognizer, pcranges: COpaquePointer?, pcr: COpaquePointer?): Hresult =
    WindowsWin32UiTabletpcJniBridge.windowssys_windows_win32_ui_tabletpc_getUnicodeRanges((hrec?.value ?: 0L), (pcranges?.value ?: 0L), (pcr?.value ?: 0L))

public actual fun isStringSupported(hrc: Hrecocontext, wcstring: UInt, pwcstring: Pcwstr): Hresult =
    WindowsWin32UiTabletpcJniBridge.windowssys_windows_win32_ui_tabletpc_isStringSupported((hrc?.value ?: 0L), wcstring.toInt(), (pwcstring?.value ?: 0L))

public actual fun loadCachedAttributes(clsid: Guid, precoattributes: COpaquePointer?): Hresult =
    0

public actual fun makeWordList(hrec: Hrecognizer, pbuffer: Pcwstr, phwl: COpaquePointer?): Hresult =
    WindowsWin32UiTabletpcJniBridge.windowssys_windows_win32_ui_tabletpc_makeWordList((hrec?.value ?: 0L), (pbuffer?.value ?: 0L), (phwl?.value ?: 0L))

public actual fun process(hrc: Hrecocontext, pbpartialprocessing: COpaquePointer?): Hresult =
    WindowsWin32UiTabletpcJniBridge.windowssys_windows_win32_ui_tabletpc_process((hrc?.value ?: 0L), (pbpartialprocessing?.value ?: 0L))

public actual fun setEnabledUnicodeRanges(hrc: Hrecocontext, cranges: UInt, pcr: COpaquePointer?): Hresult =
    WindowsWin32UiTabletpcJniBridge.windowssys_windows_win32_ui_tabletpc_setEnabledUnicodeRanges((hrc?.value ?: 0L), cranges.toInt(), (pcr?.value ?: 0L))

public actual fun setFactoid(hrc: Hrecocontext, cwcfactoid: UInt, pwcfactoid: Pcwstr): Hresult =
    WindowsWin32UiTabletpcJniBridge.windowssys_windows_win32_ui_tabletpc_setFactoid((hrc?.value ?: 0L), cwcfactoid.toInt(), (pwcfactoid?.value ?: 0L))

public actual fun setFlags(hrc: Hrecocontext, dwflags: UInt): Hresult =
    WindowsWin32UiTabletpcJniBridge.windowssys_windows_win32_ui_tabletpc_setFlags((hrc?.value ?: 0L), dwflags.toInt())

public actual fun setGuide(hrc: Hrecocontext, pguide: COpaquePointer?, iindex: UInt): Hresult =
    WindowsWin32UiTabletpcJniBridge.windowssys_windows_win32_ui_tabletpc_setGuide((hrc?.value ?: 0L), (pguide?.value ?: 0L), iindex.toInt())

public actual fun setTextContext(hrc: Hrecocontext, cwcbefore: UInt, pwcbefore: Pcwstr, cwcafter: UInt, pwcafter: Pcwstr): Hresult =
    WindowsWin32UiTabletpcJniBridge.windowssys_windows_win32_ui_tabletpc_setTextContext((hrc?.value ?: 0L), cwcbefore.toInt(), (pwcbefore?.value ?: 0L), cwcafter.toInt(), (pwcafter?.value ?: 0L))

public actual fun setWordList(hrc: Hrecocontext, hwl: Hrecowordlist): Hresult =
    WindowsWin32UiTabletpcJniBridge.windowssys_windows_win32_ui_tabletpc_setWordList((hrc?.value ?: 0L), (hwl?.value ?: 0L))
