package io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr

public expect fun addStroke(hrc: Hrecocontext, ppacketdesc: COpaquePointer?, cbpacket: UInt, ppacket: COpaquePointer?, pxform: COpaquePointer?): Hresult

public expect fun addWordsToWordList(hwl: Hrecowordlist, pwcwords: Pcwstr): Hresult

public expect fun adviseInkChange(hrc: Hrecocontext, bnewstroke: Bool): Hresult

public expect fun createContext(hrec: Hrecognizer, phrc: COpaquePointer?): Hresult

public expect fun createRecognizer(pclsid: COpaquePointer?, phrec: COpaquePointer?): Hresult

public expect fun destroyContext(hrc: Hrecocontext): Hresult

public expect fun destroyRecognizer(hrec: Hrecognizer): Hresult

public expect fun destroyWordList(hwl: Hrecowordlist): Hresult

public expect fun endInkInput(hrc: Hrecocontext): Hresult

public expect fun getAllRecognizers(recognizerclsids: COpaquePointer?, count: COpaquePointer?): Hresult

public expect fun getBestResultString(hrc: Hrecocontext, pcsize: COpaquePointer?, pwcbestresult: Pwstr): Hresult

public expect fun getLatticePtr(hrc: Hrecocontext, pplattice: COpaquePointer?): Hresult

public expect fun getLeftSeparator(hrc: Hrecocontext, pcsize: COpaquePointer?, pwcleftseparator: Pwstr): Hresult

public expect fun getRecoAttributes(hrec: Hrecognizer, precoattrs: COpaquePointer?): Hresult

public expect fun getResultPropertyList(hrec: Hrecognizer, ppropertycount: COpaquePointer?, ppropertyguid: COpaquePointer?): Hresult

public expect fun getRightSeparator(hrc: Hrecocontext, pcsize: COpaquePointer?, pwcrightseparator: Pwstr): Hresult

public expect fun getUnicodeRanges(hrec: Hrecognizer, pcranges: COpaquePointer?, pcr: COpaquePointer?): Hresult

public expect fun isStringSupported(hrc: Hrecocontext, wcstring: UInt, pwcstring: Pcwstr): Hresult

public expect fun loadCachedAttributes(clsid: Guid, precoattributes: COpaquePointer?): Hresult

public expect fun makeWordList(hrec: Hrecognizer, pbuffer: Pcwstr, phwl: COpaquePointer?): Hresult

public expect fun process(hrc: Hrecocontext, pbpartialprocessing: COpaquePointer?): Hresult

public expect fun setEnabledUnicodeRanges(hrc: Hrecocontext, cranges: UInt, pcr: COpaquePointer?): Hresult

public expect fun setFactoid(hrc: Hrecocontext, cwcfactoid: UInt, pwcfactoid: Pcwstr): Hresult

public expect fun setFlags(hrc: Hrecocontext, dwflags: UInt): Hresult

public expect fun setGuide(hrc: Hrecocontext, pguide: COpaquePointer?, iindex: UInt): Hresult

public expect fun setTextContext(hrc: Hrecocontext, cwcbefore: UInt, pwcbefore: Pcwstr, cwcafter: UInt, pwcafter: Pcwstr): Hresult

public expect fun setWordList(hrc: Hrecocontext, hwl: Hrecowordlist): Hresult
