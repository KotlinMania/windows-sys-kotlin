package io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public expect fun AddStroke(hrc: HRECOCONTEXT, ppacketdesc: Long, cbpacket: UInt, ppacket: Long, pxform: Long): HRESULT

public expect fun AddWordsToWordList(hwl: HRECOWORDLIST, pwcwords: PCWSTR): HRESULT

public expect fun AdviseInkChange(hrc: HRECOCONTEXT, bnewstroke: BOOL): HRESULT

public expect fun CreateContext(hrec: HRECOGNIZER, phrc: Long): HRESULT

public expect fun CreateRecognizer(pclsid: Long, phrec: Long): HRESULT

public expect fun DestroyContext(hrc: HRECOCONTEXT): HRESULT

public expect fun DestroyRecognizer(hrec: HRECOGNIZER): HRESULT

public expect fun DestroyWordList(hwl: HRECOWORDLIST): HRESULT

public expect fun EndInkInput(hrc: HRECOCONTEXT): HRESULT

public expect fun GetAllRecognizers(recognizerclsids: Long, count: Long): HRESULT

public expect fun GetBestResultString(hrc: HRECOCONTEXT, pcsize: Long, pwcbestresult: PWSTR): HRESULT

public expect fun GetLatticePtr(hrc: HRECOCONTEXT, pplattice: Long): HRESULT

public expect fun GetLeftSeparator(hrc: HRECOCONTEXT, pcsize: Long, pwcleftseparator: PWSTR): HRESULT

public expect fun GetRecoAttributes(hrec: HRECOGNIZER, precoattrs: Long): HRESULT

public expect fun GetResultPropertyList(hrec: HRECOGNIZER, ppropertycount: Long, ppropertyguid: Long): HRESULT

public expect fun GetRightSeparator(hrc: HRECOCONTEXT, pcsize: Long, pwcrightseparator: PWSTR): HRESULT

public expect fun GetUnicodeRanges(hrec: HRECOGNIZER, pcranges: Long, pcr: Long): HRESULT

public expect fun IsStringSupported(hrc: HRECOCONTEXT, wcstring: UInt, pwcstring: PCWSTR): HRESULT

public expect fun LoadCachedAttributes(clsid: GUID, precoattributes: Long): HRESULT

public expect fun MakeWordList(hrec: HRECOGNIZER, pbuffer: PCWSTR, phwl: Long): HRESULT

public expect fun Process(hrc: HRECOCONTEXT, pbpartialprocessing: Long): HRESULT

public expect fun SetEnabledUnicodeRanges(hrc: HRECOCONTEXT, cranges: UInt, pcr: Long): HRESULT

public expect fun SetFactoid(hrc: HRECOCONTEXT, cwcfactoid: UInt, pwcfactoid: PCWSTR): HRESULT

public expect fun SetFlags(hrc: HRECOCONTEXT, dwflags: UInt): HRESULT

public expect fun SetGuide(hrc: HRECOCONTEXT, pguide: Long, iindex: UInt): HRESULT

public expect fun SetTextContext(hrc: HRECOCONTEXT, cwcbefore: UInt, pwcbefore: PCWSTR, cwcafter: UInt, pwcafter: PCWSTR): HRESULT

public expect fun SetWordList(hrc: HRECOCONTEXT, hwl: HRECOWORDLIST): HRESULT
