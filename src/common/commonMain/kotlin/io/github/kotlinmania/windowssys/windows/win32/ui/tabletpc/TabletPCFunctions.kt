package io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr

public expect fun addStroke(hrc: Hrecocontext, ppacketdesc: ConstPtr, cbpacket: UInt, ppacket: ConstPtr, pxform: ConstPtr): Hresult

public expect fun addWordsToWordList(hwl: Hrecowordlist, pwcwords: Pcwstr): Hresult

public expect fun adviseInkChange(hrc: Hrecocontext, bnewstroke: Bool): Hresult

public expect fun createContext(hrec: Hrecognizer, phrc: MutPtr): Hresult

public expect fun createRecognizer(pclsid: MutPtr, phrec: MutPtr): Hresult

public expect fun destroyContext(hrc: Hrecocontext): Hresult

public expect fun destroyRecognizer(hrec: Hrecognizer): Hresult

public expect fun destroyWordList(hwl: Hrecowordlist): Hresult

public expect fun endInkInput(hrc: Hrecocontext): Hresult

public expect fun getAllRecognizers(recognizerclsids: MutPtr, count: MutPtr): Hresult

public expect fun getBestResultString(hrc: Hrecocontext, pcsize: MutPtr, pwcbestresult: Pwstr): Hresult

public expect fun getLatticePtr(hrc: Hrecocontext, pplattice: MutPtr): Hresult

public expect fun getLeftSeparator(hrc: Hrecocontext, pcsize: MutPtr, pwcleftseparator: Pwstr): Hresult

public expect fun getRecoAttributes(hrec: Hrecognizer, precoattrs: MutPtr): Hresult

public expect fun getResultPropertyList(hrec: Hrecognizer, ppropertycount: MutPtr, ppropertyguid: MutPtr): Hresult

public expect fun getRightSeparator(hrc: Hrecocontext, pcsize: MutPtr, pwcrightseparator: Pwstr): Hresult

public expect fun getUnicodeRanges(hrec: Hrecognizer, pcranges: MutPtr, pcr: MutPtr): Hresult

public expect fun isStringSupported(hrc: Hrecocontext, wcstring: UInt, pwcstring: Pcwstr): Hresult

public expect fun loadCachedAttributes(clsid: Guid, precoattributes: MutPtr): Hresult

public expect fun makeWordList(hrec: Hrecognizer, pbuffer: Pcwstr, phwl: MutPtr): Hresult

public expect fun process(hrc: Hrecocontext, pbpartialprocessing: MutPtr): Hresult

public expect fun setEnabledUnicodeRanges(hrc: Hrecocontext, cranges: UInt, pcr: MutPtr): Hresult

public expect fun setFactoid(hrc: Hrecocontext, cwcfactoid: UInt, pwcfactoid: Pcwstr): Hresult

public expect fun setFlags(hrc: Hrecocontext, dwflags: UInt): Hresult

public expect fun setGuide(hrc: Hrecocontext, pguide: ConstPtr, iindex: UInt): Hresult

public expect fun setTextContext(hrc: Hrecocontext, cwcbefore: UInt, pwcbefore: Pcwstr, cwcafter: UInt, pwcafter: Pcwstr): Hresult

public expect fun setWordList(hrc: Hrecocontext, hwl: Hrecowordlist): Hresult
