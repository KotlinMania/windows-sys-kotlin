@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
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
    external fun windowssysWindowsWin32UiTabletpcAddStroke(hrc: Long, ppacketdesc: Long, cbpacket: Int, ppacket: Long, pxform: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiTabletpcAddWordsToWordList(hwl: Long, pwcwords: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiTabletpcAdviseInkChange(hrc: Long, bnewstroke: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiTabletpcCreateContext(hrec: Long, phrc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiTabletpcCreateRecognizer(pclsid: Long, phrec: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiTabletpcDestroyContext(hrc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiTabletpcDestroyRecognizer(hrec: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiTabletpcDestroyWordList(hwl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiTabletpcEndInkInput(hrc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiTabletpcGetAllRecognizers(recognizerclsids: Long, count: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiTabletpcGetBestResultString(hrc: Long, pcsize: Long, pwcbestresult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiTabletpcGetLatticePtr(hrc: Long, pplattice: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiTabletpcGetLeftSeparator(hrc: Long, pcsize: Long, pwcleftseparator: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiTabletpcGetRecoAttributes(hrec: Long, precoattrs: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiTabletpcGetResultPropertyList(hrec: Long, ppropertycount: Long, ppropertyguid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiTabletpcGetRightSeparator(hrc: Long, pcsize: Long, pwcrightseparator: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiTabletpcGetUnicodeRanges(hrec: Long, pcranges: Long, pcr: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiTabletpcIsStringSupported(hrc: Long, wcstring: Int, pwcstring: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiTabletpcMakeWordList(hrec: Long, pbuffer: Long, phwl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiTabletpcProcess(hrc: Long, pbpartialprocessing: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiTabletpcSetEnabledUnicodeRanges(hrc: Long, cranges: Int, pcr: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiTabletpcSetFactoid(hrc: Long, cwcfactoid: Int, pwcfactoid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiTabletpcSetFlags(hrc: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiTabletpcSetGuide(hrc: Long, pguide: Long, iindex: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiTabletpcSetTextContext(hrc: Long, cwcbefore: Int, pwcbefore: Long, cwcafter: Int, pwcafter: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiTabletpcSetWordList(hrc: Long, hwl: Long): Int
}

public actual fun addStroke(hrc: Hrecocontext, ppacketdesc: ConstPtr, cbpacket: UInt, ppacket: ConstPtr, pxform: ConstPtr): Hresult =
    WindowsWin32UiTabletpcJniBridge.windowssysWindowsWin32UiTabletpcAddStroke(hrc.rawAddress, ppacketdesc.rawAddress, cbpacket.toInt(), ppacket.rawAddress, pxform.rawAddress)

public actual fun addWordsToWordList(hwl: Hrecowordlist, pwcwords: Pcwstr): Hresult =
    WindowsWin32UiTabletpcJniBridge.windowssysWindowsWin32UiTabletpcAddWordsToWordList(hwl.rawAddress, pwcwords.rawAddress)

public actual fun adviseInkChange(hrc: Hrecocontext, bnewstroke: Bool): Hresult =
    WindowsWin32UiTabletpcJniBridge.windowssysWindowsWin32UiTabletpcAdviseInkChange(hrc.rawAddress, bnewstroke)

public actual fun createContext(hrec: Hrecognizer, phrc: MutPtr): Hresult =
    WindowsWin32UiTabletpcJniBridge.windowssysWindowsWin32UiTabletpcCreateContext(hrec.rawAddress, phrc.rawAddress)

public actual fun createRecognizer(pclsid: MutPtr, phrec: MutPtr): Hresult =
    WindowsWin32UiTabletpcJniBridge.windowssysWindowsWin32UiTabletpcCreateRecognizer(pclsid.rawAddress, phrec.rawAddress)

public actual fun destroyContext(hrc: Hrecocontext): Hresult =
    WindowsWin32UiTabletpcJniBridge.windowssysWindowsWin32UiTabletpcDestroyContext(hrc.rawAddress)

public actual fun destroyRecognizer(hrec: Hrecognizer): Hresult =
    WindowsWin32UiTabletpcJniBridge.windowssysWindowsWin32UiTabletpcDestroyRecognizer(hrec.rawAddress)

public actual fun destroyWordList(hwl: Hrecowordlist): Hresult =
    WindowsWin32UiTabletpcJniBridge.windowssysWindowsWin32UiTabletpcDestroyWordList(hwl.rawAddress)

public actual fun endInkInput(hrc: Hrecocontext): Hresult =
    WindowsWin32UiTabletpcJniBridge.windowssysWindowsWin32UiTabletpcEndInkInput(hrc.rawAddress)

public actual fun getAllRecognizers(recognizerclsids: MutPtr, count: MutPtr): Hresult =
    WindowsWin32UiTabletpcJniBridge.windowssysWindowsWin32UiTabletpcGetAllRecognizers(recognizerclsids.rawAddress, count.rawAddress)

public actual fun getBestResultString(hrc: Hrecocontext, pcsize: MutPtr, pwcbestresult: Pwstr): Hresult =
    WindowsWin32UiTabletpcJniBridge.windowssysWindowsWin32UiTabletpcGetBestResultString(hrc.rawAddress, pcsize.rawAddress, pwcbestresult.rawAddress)

public actual fun getLatticePtr(hrc: Hrecocontext, pplattice: MutPtr): Hresult =
    WindowsWin32UiTabletpcJniBridge.windowssysWindowsWin32UiTabletpcGetLatticePtr(hrc.rawAddress, pplattice.rawAddress)

public actual fun getLeftSeparator(hrc: Hrecocontext, pcsize: MutPtr, pwcleftseparator: Pwstr): Hresult =
    WindowsWin32UiTabletpcJniBridge.windowssysWindowsWin32UiTabletpcGetLeftSeparator(hrc.rawAddress, pcsize.rawAddress, pwcleftseparator.rawAddress)

public actual fun getRecoAttributes(hrec: Hrecognizer, precoattrs: MutPtr): Hresult =
    WindowsWin32UiTabletpcJniBridge.windowssysWindowsWin32UiTabletpcGetRecoAttributes(hrec.rawAddress, precoattrs.rawAddress)

public actual fun getResultPropertyList(hrec: Hrecognizer, ppropertycount: MutPtr, ppropertyguid: MutPtr): Hresult =
    WindowsWin32UiTabletpcJniBridge.windowssysWindowsWin32UiTabletpcGetResultPropertyList(hrec.rawAddress, ppropertycount.rawAddress, ppropertyguid.rawAddress)

public actual fun getRightSeparator(hrc: Hrecocontext, pcsize: MutPtr, pwcrightseparator: Pwstr): Hresult =
    WindowsWin32UiTabletpcJniBridge.windowssysWindowsWin32UiTabletpcGetRightSeparator(hrc.rawAddress, pcsize.rawAddress, pwcrightseparator.rawAddress)

public actual fun getUnicodeRanges(hrec: Hrecognizer, pcranges: MutPtr, pcr: MutPtr): Hresult =
    WindowsWin32UiTabletpcJniBridge.windowssysWindowsWin32UiTabletpcGetUnicodeRanges(hrec.rawAddress, pcranges.rawAddress, pcr.rawAddress)

public actual fun isStringSupported(hrc: Hrecocontext, wcstring: UInt, pwcstring: Pcwstr): Hresult =
    WindowsWin32UiTabletpcJniBridge.windowssysWindowsWin32UiTabletpcIsStringSupported(hrc.rawAddress, wcstring.toInt(), pwcstring.rawAddress)

public actual fun loadCachedAttributes(clsid: Guid, precoattributes: MutPtr): Hresult =
    0

public actual fun makeWordList(hrec: Hrecognizer, pbuffer: Pcwstr, phwl: MutPtr): Hresult =
    WindowsWin32UiTabletpcJniBridge.windowssysWindowsWin32UiTabletpcMakeWordList(hrec.rawAddress, pbuffer.rawAddress, phwl.rawAddress)

public actual fun process(hrc: Hrecocontext, pbpartialprocessing: MutPtr): Hresult =
    WindowsWin32UiTabletpcJniBridge.windowssysWindowsWin32UiTabletpcProcess(hrc.rawAddress, pbpartialprocessing.rawAddress)

public actual fun setEnabledUnicodeRanges(hrc: Hrecocontext, cranges: UInt, pcr: MutPtr): Hresult =
    WindowsWin32UiTabletpcJniBridge.windowssysWindowsWin32UiTabletpcSetEnabledUnicodeRanges(hrc.rawAddress, cranges.toInt(), pcr.rawAddress)

public actual fun setFactoid(hrc: Hrecocontext, cwcfactoid: UInt, pwcfactoid: Pcwstr): Hresult =
    WindowsWin32UiTabletpcJniBridge.windowssysWindowsWin32UiTabletpcSetFactoid(hrc.rawAddress, cwcfactoid.toInt(), pwcfactoid.rawAddress)

public actual fun setFlags(hrc: Hrecocontext, dwflags: UInt): Hresult =
    WindowsWin32UiTabletpcJniBridge.windowssysWindowsWin32UiTabletpcSetFlags(hrc.rawAddress, dwflags.toInt())

public actual fun setGuide(hrc: Hrecocontext, pguide: ConstPtr, iindex: UInt): Hresult =
    WindowsWin32UiTabletpcJniBridge.windowssysWindowsWin32UiTabletpcSetGuide(hrc.rawAddress, pguide.rawAddress, iindex.toInt())

public actual fun setTextContext(hrc: Hrecocontext, cwcbefore: UInt, pwcbefore: Pcwstr, cwcafter: UInt, pwcafter: Pcwstr): Hresult =
    WindowsWin32UiTabletpcJniBridge.windowssysWindowsWin32UiTabletpcSetTextContext(hrc.rawAddress, cwcbefore.toInt(), pwcbefore.rawAddress, cwcafter.toInt(), pwcafter.rawAddress)

public actual fun setWordList(hrc: Hrecocontext, hwl: Hrecowordlist): Hresult =
    WindowsWin32UiTabletpcJniBridge.windowssysWindowsWin32UiTabletpcSetWordList(hrc.rawAddress, hwl.rawAddress)
