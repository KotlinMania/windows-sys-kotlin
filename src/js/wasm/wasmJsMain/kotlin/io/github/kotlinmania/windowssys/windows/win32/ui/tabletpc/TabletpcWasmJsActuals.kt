@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public actual fun AddStroke(hrc: HRECOCONTEXT, ppacketdesc: Long, cbpacket: UInt, ppacket: Long, pxform: Long): HRESULT =
    0

public actual fun AddWordsToWordList(hwl: HRECOWORDLIST, pwcwords: PCWSTR): HRESULT =
    0

public actual fun AdviseInkChange(hrc: HRECOCONTEXT, bnewstroke: BOOL): HRESULT =
    0

public actual fun CreateContext(hrec: HRECOGNIZER, phrc: Long): HRESULT =
    0

public actual fun CreateRecognizer(pclsid: Long, phrec: Long): HRESULT =
    0

public actual fun DestroyContext(hrc: HRECOCONTEXT): HRESULT =
    0

public actual fun DestroyRecognizer(hrec: HRECOGNIZER): HRESULT =
    0

public actual fun DestroyWordList(hwl: HRECOWORDLIST): HRESULT =
    0

public actual fun EndInkInput(hrc: HRECOCONTEXT): HRESULT =
    0

public actual fun GetAllRecognizers(recognizerclsids: Long, count: Long): HRESULT =
    0

public actual fun GetBestResultString(hrc: HRECOCONTEXT, pcsize: Long, pwcbestresult: PWSTR): HRESULT =
    0

public actual fun GetLatticePtr(hrc: HRECOCONTEXT, pplattice: Long): HRESULT =
    0

public actual fun GetLeftSeparator(hrc: HRECOCONTEXT, pcsize: Long, pwcleftseparator: PWSTR): HRESULT =
    0

public actual fun GetRecoAttributes(hrec: HRECOGNIZER, precoattrs: Long): HRESULT =
    0

public actual fun GetResultPropertyList(hrec: HRECOGNIZER, ppropertycount: Long, ppropertyguid: Long): HRESULT =
    0

public actual fun GetRightSeparator(hrc: HRECOCONTEXT, pcsize: Long, pwcrightseparator: PWSTR): HRESULT =
    0

public actual fun GetUnicodeRanges(hrec: HRECOGNIZER, pcranges: Long, pcr: Long): HRESULT =
    0

public actual fun IsStringSupported(hrc: HRECOCONTEXT, wcstring: UInt, pwcstring: PCWSTR): HRESULT =
    0

public actual fun LoadCachedAttributes(clsid: GUID, precoattributes: Long): HRESULT =
    0

public actual fun MakeWordList(hrec: HRECOGNIZER, pbuffer: PCWSTR, phwl: Long): HRESULT =
    0

public actual fun Process(hrc: HRECOCONTEXT, pbpartialprocessing: Long): HRESULT =
    0

public actual fun SetEnabledUnicodeRanges(hrc: HRECOCONTEXT, cranges: UInt, pcr: Long): HRESULT =
    0

public actual fun SetFactoid(hrc: HRECOCONTEXT, cwcfactoid: UInt, pwcfactoid: PCWSTR): HRESULT =
    0

public actual fun SetFlags(hrc: HRECOCONTEXT, dwflags: UInt): HRESULT =
    0

public actual fun SetGuide(hrc: HRECOCONTEXT, pguide: Long, iindex: UInt): HRESULT =
    0

public actual fun SetTextContext(hrc: HRECOCONTEXT, cwcbefore: UInt, pwcbefore: PCWSTR, cwcafter: UInt, pwcafter: PCWSTR): HRESULT =
    0

public actual fun SetWordList(hrc: HRECOCONTEXT, hwl: HRECOWORDLIST): HRESULT =
    0
