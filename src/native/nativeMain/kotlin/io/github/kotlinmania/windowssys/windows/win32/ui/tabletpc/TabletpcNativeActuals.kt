@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun AddStroke(hrc: HRECOCONTEXT, ppacketdesc: Long, cbpacket: UInt, ppacket: Long, pxform: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc.cinterop.windowssys_windows_win32_ui_tabletpc_AddStroke(hrc.toCPointer<ByteVar>(), ppacketdesc.toCPointer<ByteVar>(), cbpacket, ppacket.toCPointer<ByteVar>(), pxform.toCPointer<ByteVar>())

public actual fun AddWordsToWordList(hwl: HRECOWORDLIST, pwcwords: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc.cinterop.windowssys_windows_win32_ui_tabletpc_AddWordsToWordList(hwl.toCPointer<ByteVar>(), pwcwords.toCPointer<ByteVar>())

public actual fun AdviseInkChange(hrc: HRECOCONTEXT, bnewstroke: BOOL): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc.cinterop.windowssys_windows_win32_ui_tabletpc_AdviseInkChange(hrc.toCPointer<ByteVar>(), bnewstroke)

public actual fun CreateContext(hrec: HRECOGNIZER, phrc: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc.cinterop.windowssys_windows_win32_ui_tabletpc_CreateContext(hrec.toCPointer<ByteVar>(), phrc.toCPointer<ByteVar>())

public actual fun CreateRecognizer(pclsid: Long, phrec: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc.cinterop.windowssys_windows_win32_ui_tabletpc_CreateRecognizer(pclsid.toCPointer<ByteVar>(), phrec.toCPointer<ByteVar>())

public actual fun DestroyContext(hrc: HRECOCONTEXT): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc.cinterop.windowssys_windows_win32_ui_tabletpc_DestroyContext(hrc.toCPointer<ByteVar>())

public actual fun DestroyRecognizer(hrec: HRECOGNIZER): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc.cinterop.windowssys_windows_win32_ui_tabletpc_DestroyRecognizer(hrec.toCPointer<ByteVar>())

public actual fun DestroyWordList(hwl: HRECOWORDLIST): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc.cinterop.windowssys_windows_win32_ui_tabletpc_DestroyWordList(hwl.toCPointer<ByteVar>())

public actual fun EndInkInput(hrc: HRECOCONTEXT): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc.cinterop.windowssys_windows_win32_ui_tabletpc_EndInkInput(hrc.toCPointer<ByteVar>())

public actual fun GetAllRecognizers(recognizerclsids: Long, count: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc.cinterop.windowssys_windows_win32_ui_tabletpc_GetAllRecognizers(recognizerclsids.toCPointer<ByteVar>(), count.toCPointer<ByteVar>())

public actual fun GetBestResultString(hrc: HRECOCONTEXT, pcsize: Long, pwcbestresult: PWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc.cinterop.windowssys_windows_win32_ui_tabletpc_GetBestResultString(hrc.toCPointer<ByteVar>(), pcsize.toCPointer<ByteVar>(), pwcbestresult.toCPointer<ByteVar>())

public actual fun GetLatticePtr(hrc: HRECOCONTEXT, pplattice: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc.cinterop.windowssys_windows_win32_ui_tabletpc_GetLatticePtr(hrc.toCPointer<ByteVar>(), pplattice.toCPointer<ByteVar>())

public actual fun GetLeftSeparator(hrc: HRECOCONTEXT, pcsize: Long, pwcleftseparator: PWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc.cinterop.windowssys_windows_win32_ui_tabletpc_GetLeftSeparator(hrc.toCPointer<ByteVar>(), pcsize.toCPointer<ByteVar>(), pwcleftseparator.toCPointer<ByteVar>())

public actual fun GetRecoAttributes(hrec: HRECOGNIZER, precoattrs: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc.cinterop.windowssys_windows_win32_ui_tabletpc_GetRecoAttributes(hrec.toCPointer<ByteVar>(), precoattrs.toCPointer<ByteVar>())

public actual fun GetResultPropertyList(hrec: HRECOGNIZER, ppropertycount: Long, ppropertyguid: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc.cinterop.windowssys_windows_win32_ui_tabletpc_GetResultPropertyList(hrec.toCPointer<ByteVar>(), ppropertycount.toCPointer<ByteVar>(), ppropertyguid.toCPointer<ByteVar>())

public actual fun GetRightSeparator(hrc: HRECOCONTEXT, pcsize: Long, pwcrightseparator: PWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc.cinterop.windowssys_windows_win32_ui_tabletpc_GetRightSeparator(hrc.toCPointer<ByteVar>(), pcsize.toCPointer<ByteVar>(), pwcrightseparator.toCPointer<ByteVar>())

public actual fun GetUnicodeRanges(hrec: HRECOGNIZER, pcranges: Long, pcr: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc.cinterop.windowssys_windows_win32_ui_tabletpc_GetUnicodeRanges(hrec.toCPointer<ByteVar>(), pcranges.toCPointer<ByteVar>(), pcr.toCPointer<ByteVar>())

public actual fun IsStringSupported(hrc: HRECOCONTEXT, wcstring: UInt, pwcstring: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc.cinterop.windowssys_windows_win32_ui_tabletpc_IsStringSupported(hrc.toCPointer<ByteVar>(), wcstring, pwcstring.toCPointer<ByteVar>())

public actual fun LoadCachedAttributes(clsid: GUID, precoattributes: Long): HRESULT =
    0

public actual fun MakeWordList(hrec: HRECOGNIZER, pbuffer: PCWSTR, phwl: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc.cinterop.windowssys_windows_win32_ui_tabletpc_MakeWordList(hrec.toCPointer<ByteVar>(), pbuffer.toCPointer<ByteVar>(), phwl.toCPointer<ByteVar>())

public actual fun Process(hrc: HRECOCONTEXT, pbpartialprocessing: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc.cinterop.windowssys_windows_win32_ui_tabletpc_Process(hrc.toCPointer<ByteVar>(), pbpartialprocessing.toCPointer<ByteVar>())

public actual fun SetEnabledUnicodeRanges(hrc: HRECOCONTEXT, cranges: UInt, pcr: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc.cinterop.windowssys_windows_win32_ui_tabletpc_SetEnabledUnicodeRanges(hrc.toCPointer<ByteVar>(), cranges, pcr.toCPointer<ByteVar>())

public actual fun SetFactoid(hrc: HRECOCONTEXT, cwcfactoid: UInt, pwcfactoid: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc.cinterop.windowssys_windows_win32_ui_tabletpc_SetFactoid(hrc.toCPointer<ByteVar>(), cwcfactoid, pwcfactoid.toCPointer<ByteVar>())

public actual fun SetFlags(hrc: HRECOCONTEXT, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc.cinterop.windowssys_windows_win32_ui_tabletpc_SetFlags(hrc.toCPointer<ByteVar>(), dwflags)

public actual fun SetGuide(hrc: HRECOCONTEXT, pguide: Long, iindex: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc.cinterop.windowssys_windows_win32_ui_tabletpc_SetGuide(hrc.toCPointer<ByteVar>(), pguide.toCPointer<ByteVar>(), iindex)

public actual fun SetTextContext(hrc: HRECOCONTEXT, cwcbefore: UInt, pwcbefore: PCWSTR, cwcafter: UInt, pwcafter: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc.cinterop.windowssys_windows_win32_ui_tabletpc_SetTextContext(hrc.toCPointer<ByteVar>(), cwcbefore, pwcbefore.toCPointer<ByteVar>(), cwcafter, pwcafter.toCPointer<ByteVar>())

public actual fun SetWordList(hrc: HRECOCONTEXT, hwl: HRECOWORDLIST): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc.cinterop.windowssys_windows_win32_ui_tabletpc_SetWordList(hrc.toCPointer<ByteVar>(), hwl.toCPointer<ByteVar>())
