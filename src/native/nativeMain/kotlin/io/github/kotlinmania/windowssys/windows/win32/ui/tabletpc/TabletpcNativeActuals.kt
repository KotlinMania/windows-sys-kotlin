@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc.cinterop.windowssysWindowsWin32UiTabletpcAddStroke
import io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc.cinterop.windowssysWindowsWin32UiTabletpcAddWordsToWordList
import io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc.cinterop.windowssysWindowsWin32UiTabletpcAdviseInkChange
import io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc.cinterop.windowssysWindowsWin32UiTabletpcCreateContext
import io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc.cinterop.windowssysWindowsWin32UiTabletpcCreateRecognizer
import io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc.cinterop.windowssysWindowsWin32UiTabletpcDestroyContext
import io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc.cinterop.windowssysWindowsWin32UiTabletpcDestroyRecognizer
import io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc.cinterop.windowssysWindowsWin32UiTabletpcDestroyWordList
import io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc.cinterop.windowssysWindowsWin32UiTabletpcEndInkInput
import io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc.cinterop.windowssysWindowsWin32UiTabletpcGetAllRecognizers
import io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc.cinterop.windowssysWindowsWin32UiTabletpcGetBestResultString
import io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc.cinterop.windowssysWindowsWin32UiTabletpcGetLatticePtr
import io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc.cinterop.windowssysWindowsWin32UiTabletpcGetLeftSeparator
import io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc.cinterop.windowssysWindowsWin32UiTabletpcGetRecoAttributes
import io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc.cinterop.windowssysWindowsWin32UiTabletpcGetResultPropertyList
import io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc.cinterop.windowssysWindowsWin32UiTabletpcGetRightSeparator
import io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc.cinterop.windowssysWindowsWin32UiTabletpcGetUnicodeRanges
import io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc.cinterop.windowssysWindowsWin32UiTabletpcIsStringSupported
import io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc.cinterop.windowssysWindowsWin32UiTabletpcMakeWordList
import io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc.cinterop.windowssysWindowsWin32UiTabletpcProcess
import io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc.cinterop.windowssysWindowsWin32UiTabletpcSetEnabledUnicodeRanges
import io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc.cinterop.windowssysWindowsWin32UiTabletpcSetFactoid
import io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc.cinterop.windowssysWindowsWin32UiTabletpcSetFlags
import io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc.cinterop.windowssysWindowsWin32UiTabletpcSetGuide
import io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc.cinterop.windowssysWindowsWin32UiTabletpcSetTextContext
import io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc.cinterop.windowssysWindowsWin32UiTabletpcSetWordList
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun addStroke(hrc: Hrecocontext, ppacketdesc: ConstPtr, cbpacket: UInt, ppacket: ConstPtr, pxform: ConstPtr): Hresult =
    windowssysWindowsWin32UiTabletpcAddStroke(hrc.rawAddress.toCPointer<ByteVar>(), ppacketdesc.rawAddress.toCPointer<ByteVar>(), cbpacket, ppacket.rawAddress.toCPointer<ByteVar>(), pxform.rawAddress.toCPointer<ByteVar>())

public actual fun addWordsToWordList(hwl: Hrecowordlist, pwcwords: Pcwstr): Hresult =
    windowssysWindowsWin32UiTabletpcAddWordsToWordList(hwl.rawAddress.toCPointer<ByteVar>(), pwcwords.rawAddress.toCPointer<ByteVar>())

public actual fun adviseInkChange(hrc: Hrecocontext, bnewstroke: Bool): Hresult =
    windowssysWindowsWin32UiTabletpcAdviseInkChange(hrc.rawAddress.toCPointer<ByteVar>(), bnewstroke)

public actual fun createContext(hrec: Hrecognizer, phrc: MutPtr): Hresult =
    windowssysWindowsWin32UiTabletpcCreateContext(hrec.rawAddress.toCPointer<ByteVar>(), phrc.rawAddress.toCPointer<ByteVar>())

public actual fun createRecognizer(pclsid: MutPtr, phrec: MutPtr): Hresult =
    windowssysWindowsWin32UiTabletpcCreateRecognizer(pclsid.rawAddress.toCPointer<ByteVar>(), phrec.rawAddress.toCPointer<ByteVar>())

public actual fun destroyContext(hrc: Hrecocontext): Hresult =
    windowssysWindowsWin32UiTabletpcDestroyContext(hrc.rawAddress.toCPointer<ByteVar>())

public actual fun destroyRecognizer(hrec: Hrecognizer): Hresult =
    windowssysWindowsWin32UiTabletpcDestroyRecognizer(hrec.rawAddress.toCPointer<ByteVar>())

public actual fun destroyWordList(hwl: Hrecowordlist): Hresult =
    windowssysWindowsWin32UiTabletpcDestroyWordList(hwl.rawAddress.toCPointer<ByteVar>())

public actual fun endInkInput(hrc: Hrecocontext): Hresult =
    windowssysWindowsWin32UiTabletpcEndInkInput(hrc.rawAddress.toCPointer<ByteVar>())

public actual fun getAllRecognizers(recognizerclsids: MutPtr, count: MutPtr): Hresult =
    windowssysWindowsWin32UiTabletpcGetAllRecognizers(recognizerclsids.rawAddress.toCPointer<ByteVar>(), count.rawAddress.toCPointer<ByteVar>())

public actual fun getBestResultString(hrc: Hrecocontext, pcsize: MutPtr, pwcbestresult: Pwstr): Hresult =
    windowssysWindowsWin32UiTabletpcGetBestResultString(hrc.rawAddress.toCPointer<ByteVar>(), pcsize.rawAddress.toCPointer<ByteVar>(), pwcbestresult.rawAddress.toCPointer<ByteVar>())

public actual fun getLatticePtr(hrc: Hrecocontext, pplattice: MutPtr): Hresult =
    windowssysWindowsWin32UiTabletpcGetLatticePtr(hrc.rawAddress.toCPointer<ByteVar>(), pplattice.rawAddress.toCPointer<ByteVar>())

public actual fun getLeftSeparator(hrc: Hrecocontext, pcsize: MutPtr, pwcleftseparator: Pwstr): Hresult =
    windowssysWindowsWin32UiTabletpcGetLeftSeparator(hrc.rawAddress.toCPointer<ByteVar>(), pcsize.rawAddress.toCPointer<ByteVar>(), pwcleftseparator.rawAddress.toCPointer<ByteVar>())

public actual fun getRecoAttributes(hrec: Hrecognizer, precoattrs: MutPtr): Hresult =
    windowssysWindowsWin32UiTabletpcGetRecoAttributes(hrec.rawAddress.toCPointer<ByteVar>(), precoattrs.rawAddress.toCPointer<ByteVar>())

public actual fun getResultPropertyList(hrec: Hrecognizer, ppropertycount: MutPtr, ppropertyguid: MutPtr): Hresult =
    windowssysWindowsWin32UiTabletpcGetResultPropertyList(hrec.rawAddress.toCPointer<ByteVar>(), ppropertycount.rawAddress.toCPointer<ByteVar>(), ppropertyguid.rawAddress.toCPointer<ByteVar>())

public actual fun getRightSeparator(hrc: Hrecocontext, pcsize: MutPtr, pwcrightseparator: Pwstr): Hresult =
    windowssysWindowsWin32UiTabletpcGetRightSeparator(hrc.rawAddress.toCPointer<ByteVar>(), pcsize.rawAddress.toCPointer<ByteVar>(), pwcrightseparator.rawAddress.toCPointer<ByteVar>())

public actual fun getUnicodeRanges(hrec: Hrecognizer, pcranges: MutPtr, pcr: MutPtr): Hresult =
    windowssysWindowsWin32UiTabletpcGetUnicodeRanges(hrec.rawAddress.toCPointer<ByteVar>(), pcranges.rawAddress.toCPointer<ByteVar>(), pcr.rawAddress.toCPointer<ByteVar>())

public actual fun isStringSupported(hrc: Hrecocontext, wcstring: UInt, pwcstring: Pcwstr): Hresult =
    windowssysWindowsWin32UiTabletpcIsStringSupported(hrc.rawAddress.toCPointer<ByteVar>(), wcstring, pwcstring.rawAddress.toCPointer<ByteVar>())

public actual fun loadCachedAttributes(clsid: Guid, precoattributes: MutPtr): Hresult =
    0

public actual fun makeWordList(hrec: Hrecognizer, pbuffer: Pcwstr, phwl: MutPtr): Hresult =
    windowssysWindowsWin32UiTabletpcMakeWordList(hrec.rawAddress.toCPointer<ByteVar>(), pbuffer.rawAddress.toCPointer<ByteVar>(), phwl.rawAddress.toCPointer<ByteVar>())

public actual fun process(hrc: Hrecocontext, pbpartialprocessing: MutPtr): Hresult =
    windowssysWindowsWin32UiTabletpcProcess(hrc.rawAddress.toCPointer<ByteVar>(), pbpartialprocessing.rawAddress.toCPointer<ByteVar>())

public actual fun setEnabledUnicodeRanges(hrc: Hrecocontext, cranges: UInt, pcr: MutPtr): Hresult =
    windowssysWindowsWin32UiTabletpcSetEnabledUnicodeRanges(hrc.rawAddress.toCPointer<ByteVar>(), cranges, pcr.rawAddress.toCPointer<ByteVar>())

public actual fun setFactoid(hrc: Hrecocontext, cwcfactoid: UInt, pwcfactoid: Pcwstr): Hresult =
    windowssysWindowsWin32UiTabletpcSetFactoid(hrc.rawAddress.toCPointer<ByteVar>(), cwcfactoid, pwcfactoid.rawAddress.toCPointer<ByteVar>())

public actual fun setFlags(hrc: Hrecocontext, dwflags: UInt): Hresult =
    windowssysWindowsWin32UiTabletpcSetFlags(hrc.rawAddress.toCPointer<ByteVar>(), dwflags)

public actual fun setGuide(hrc: Hrecocontext, pguide: ConstPtr, iindex: UInt): Hresult =
    windowssysWindowsWin32UiTabletpcSetGuide(hrc.rawAddress.toCPointer<ByteVar>(), pguide.rawAddress.toCPointer<ByteVar>(), iindex)

public actual fun setTextContext(hrc: Hrecocontext, cwcbefore: UInt, pwcbefore: Pcwstr, cwcafter: UInt, pwcafter: Pcwstr): Hresult =
    windowssysWindowsWin32UiTabletpcSetTextContext(hrc.rawAddress.toCPointer<ByteVar>(), cwcbefore, pwcbefore.rawAddress.toCPointer<ByteVar>(), cwcafter, pwcafter.rawAddress.toCPointer<ByteVar>())

public actual fun setWordList(hrc: Hrecocontext, hwl: Hrecowordlist): Hresult =
    windowssysWindowsWin32UiTabletpcSetWordList(hrc.rawAddress.toCPointer<ByteVar>(), hwl.rawAddress.toCPointer<ByteVar>())
