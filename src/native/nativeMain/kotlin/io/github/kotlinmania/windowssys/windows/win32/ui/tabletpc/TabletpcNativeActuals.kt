@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc.cinterop.windowssys_windows_win32_ui_tabletpc_addStroke
import io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc.cinterop.windowssys_windows_win32_ui_tabletpc_addWordsToWordList
import io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc.cinterop.windowssys_windows_win32_ui_tabletpc_adviseInkChange
import io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc.cinterop.windowssys_windows_win32_ui_tabletpc_createContext
import io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc.cinterop.windowssys_windows_win32_ui_tabletpc_createRecognizer
import io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc.cinterop.windowssys_windows_win32_ui_tabletpc_destroyContext
import io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc.cinterop.windowssys_windows_win32_ui_tabletpc_destroyRecognizer
import io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc.cinterop.windowssys_windows_win32_ui_tabletpc_destroyWordList
import io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc.cinterop.windowssys_windows_win32_ui_tabletpc_endInkInput
import io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc.cinterop.windowssys_windows_win32_ui_tabletpc_getAllRecognizers
import io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc.cinterop.windowssys_windows_win32_ui_tabletpc_getBestResultString
import io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc.cinterop.windowssys_windows_win32_ui_tabletpc_getLatticePtr
import io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc.cinterop.windowssys_windows_win32_ui_tabletpc_getLeftSeparator
import io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc.cinterop.windowssys_windows_win32_ui_tabletpc_getRecoAttributes
import io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc.cinterop.windowssys_windows_win32_ui_tabletpc_getResultPropertyList
import io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc.cinterop.windowssys_windows_win32_ui_tabletpc_getRightSeparator
import io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc.cinterop.windowssys_windows_win32_ui_tabletpc_getUnicodeRanges
import io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc.cinterop.windowssys_windows_win32_ui_tabletpc_isStringSupported
import io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc.cinterop.windowssys_windows_win32_ui_tabletpc_makeWordList
import io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc.cinterop.windowssys_windows_win32_ui_tabletpc_process
import io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc.cinterop.windowssys_windows_win32_ui_tabletpc_setEnabledUnicodeRanges
import io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc.cinterop.windowssys_windows_win32_ui_tabletpc_setFactoid
import io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc.cinterop.windowssys_windows_win32_ui_tabletpc_setFlags
import io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc.cinterop.windowssys_windows_win32_ui_tabletpc_setGuide
import io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc.cinterop.windowssys_windows_win32_ui_tabletpc_setTextContext
import io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc.cinterop.windowssys_windows_win32_ui_tabletpc_setWordList
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun addStroke(hrc: Hrecocontext, ppacketdesc: COpaquePointer?, cbpacket: UInt, ppacket: COpaquePointer?, pxform: COpaquePointer?): Hresult =
    windowssys_windows_win32_ui_tabletpc_addStroke(hrc?.value?.toCPointer<ByteVar>(), ppacketdesc?.value?.toCPointer<ByteVar>(), cbpacket, ppacket?.value?.toCPointer<ByteVar>(), pxform?.value?.toCPointer<ByteVar>())

public actual fun addWordsToWordList(hwl: Hrecowordlist, pwcwords: Pcwstr): Hresult =
    windowssys_windows_win32_ui_tabletpc_addWordsToWordList(hwl?.value?.toCPointer<ByteVar>(), pwcwords?.value?.toCPointer<ByteVar>())

public actual fun adviseInkChange(hrc: Hrecocontext, bnewstroke: Bool): Hresult =
    windowssys_windows_win32_ui_tabletpc_adviseInkChange(hrc?.value?.toCPointer<ByteVar>(), bnewstroke)

public actual fun createContext(hrec: Hrecognizer, phrc: COpaquePointer?): Hresult =
    windowssys_windows_win32_ui_tabletpc_createContext(hrec?.value?.toCPointer<ByteVar>(), phrc?.value?.toCPointer<ByteVar>())

public actual fun createRecognizer(pclsid: COpaquePointer?, phrec: COpaquePointer?): Hresult =
    windowssys_windows_win32_ui_tabletpc_createRecognizer(pclsid?.value?.toCPointer<ByteVar>(), phrec?.value?.toCPointer<ByteVar>())

public actual fun destroyContext(hrc: Hrecocontext): Hresult =
    windowssys_windows_win32_ui_tabletpc_destroyContext(hrc?.value?.toCPointer<ByteVar>())

public actual fun destroyRecognizer(hrec: Hrecognizer): Hresult =
    windowssys_windows_win32_ui_tabletpc_destroyRecognizer(hrec?.value?.toCPointer<ByteVar>())

public actual fun destroyWordList(hwl: Hrecowordlist): Hresult =
    windowssys_windows_win32_ui_tabletpc_destroyWordList(hwl?.value?.toCPointer<ByteVar>())

public actual fun endInkInput(hrc: Hrecocontext): Hresult =
    windowssys_windows_win32_ui_tabletpc_endInkInput(hrc?.value?.toCPointer<ByteVar>())

public actual fun getAllRecognizers(recognizerclsids: COpaquePointer?, count: COpaquePointer?): Hresult =
    windowssys_windows_win32_ui_tabletpc_getAllRecognizers(recognizerclsids?.value?.toCPointer<ByteVar>(), count?.value?.toCPointer<ByteVar>())

public actual fun getBestResultString(hrc: Hrecocontext, pcsize: COpaquePointer?, pwcbestresult: Pwstr): Hresult =
    windowssys_windows_win32_ui_tabletpc_getBestResultString(hrc?.value?.toCPointer<ByteVar>(), pcsize?.value?.toCPointer<ByteVar>(), pwcbestresult?.value?.toCPointer<ByteVar>())

public actual fun getLatticePtr(hrc: Hrecocontext, pplattice: COpaquePointer?): Hresult =
    windowssys_windows_win32_ui_tabletpc_getLatticePtr(hrc?.value?.toCPointer<ByteVar>(), pplattice?.value?.toCPointer<ByteVar>())

public actual fun getLeftSeparator(hrc: Hrecocontext, pcsize: COpaquePointer?, pwcleftseparator: Pwstr): Hresult =
    windowssys_windows_win32_ui_tabletpc_getLeftSeparator(hrc?.value?.toCPointer<ByteVar>(), pcsize?.value?.toCPointer<ByteVar>(), pwcleftseparator?.value?.toCPointer<ByteVar>())

public actual fun getRecoAttributes(hrec: Hrecognizer, precoattrs: COpaquePointer?): Hresult =
    windowssys_windows_win32_ui_tabletpc_getRecoAttributes(hrec?.value?.toCPointer<ByteVar>(), precoattrs?.value?.toCPointer<ByteVar>())

public actual fun getResultPropertyList(hrec: Hrecognizer, ppropertycount: COpaquePointer?, ppropertyguid: COpaquePointer?): Hresult =
    windowssys_windows_win32_ui_tabletpc_getResultPropertyList(hrec?.value?.toCPointer<ByteVar>(), ppropertycount?.value?.toCPointer<ByteVar>(), ppropertyguid?.value?.toCPointer<ByteVar>())

public actual fun getRightSeparator(hrc: Hrecocontext, pcsize: COpaquePointer?, pwcrightseparator: Pwstr): Hresult =
    windowssys_windows_win32_ui_tabletpc_getRightSeparator(hrc?.value?.toCPointer<ByteVar>(), pcsize?.value?.toCPointer<ByteVar>(), pwcrightseparator?.value?.toCPointer<ByteVar>())

public actual fun getUnicodeRanges(hrec: Hrecognizer, pcranges: COpaquePointer?, pcr: COpaquePointer?): Hresult =
    windowssys_windows_win32_ui_tabletpc_getUnicodeRanges(hrec?.value?.toCPointer<ByteVar>(), pcranges?.value?.toCPointer<ByteVar>(), pcr?.value?.toCPointer<ByteVar>())

public actual fun isStringSupported(hrc: Hrecocontext, wcstring: UInt, pwcstring: Pcwstr): Hresult =
    windowssys_windows_win32_ui_tabletpc_isStringSupported(hrc?.value?.toCPointer<ByteVar>(), wcstring, pwcstring?.value?.toCPointer<ByteVar>())

public actual fun loadCachedAttributes(clsid: Guid, precoattributes: COpaquePointer?): Hresult =
    0

public actual fun makeWordList(hrec: Hrecognizer, pbuffer: Pcwstr, phwl: COpaquePointer?): Hresult =
    windowssys_windows_win32_ui_tabletpc_makeWordList(hrec?.value?.toCPointer<ByteVar>(), pbuffer?.value?.toCPointer<ByteVar>(), phwl?.value?.toCPointer<ByteVar>())

public actual fun process(hrc: Hrecocontext, pbpartialprocessing: COpaquePointer?): Hresult =
    windowssys_windows_win32_ui_tabletpc_process(hrc?.value?.toCPointer<ByteVar>(), pbpartialprocessing?.value?.toCPointer<ByteVar>())

public actual fun setEnabledUnicodeRanges(hrc: Hrecocontext, cranges: UInt, pcr: COpaquePointer?): Hresult =
    windowssys_windows_win32_ui_tabletpc_setEnabledUnicodeRanges(hrc?.value?.toCPointer<ByteVar>(), cranges, pcr?.value?.toCPointer<ByteVar>())

public actual fun setFactoid(hrc: Hrecocontext, cwcfactoid: UInt, pwcfactoid: Pcwstr): Hresult =
    windowssys_windows_win32_ui_tabletpc_setFactoid(hrc?.value?.toCPointer<ByteVar>(), cwcfactoid, pwcfactoid?.value?.toCPointer<ByteVar>())

public actual fun setFlags(hrc: Hrecocontext, dwflags: UInt): Hresult =
    windowssys_windows_win32_ui_tabletpc_setFlags(hrc?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun setGuide(hrc: Hrecocontext, pguide: COpaquePointer?, iindex: UInt): Hresult =
    windowssys_windows_win32_ui_tabletpc_setGuide(hrc?.value?.toCPointer<ByteVar>(), pguide?.value?.toCPointer<ByteVar>(), iindex)

public actual fun setTextContext(hrc: Hrecocontext, cwcbefore: UInt, pwcbefore: Pcwstr, cwcafter: UInt, pwcafter: Pcwstr): Hresult =
    windowssys_windows_win32_ui_tabletpc_setTextContext(hrc?.value?.toCPointer<ByteVar>(), cwcbefore, pwcbefore?.value?.toCPointer<ByteVar>(), cwcafter, pwcafter?.value?.toCPointer<ByteVar>())

public actual fun setWordList(hrc: Hrecocontext, hwl: Hrecowordlist): Hresult =
    windowssys_windows_win32_ui_tabletpc_setWordList(hrc?.value?.toCPointer<ByteVar>(), hwl?.value?.toCPointer<ByteVar>())
