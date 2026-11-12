@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun addStroke(hrc: Hrecocontext, ppacketdesc: ConstPtr, cbpacket: UInt, ppacket: ConstPtr, pxform: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiTabletpcAddStroke")

public actual fun addWordsToWordList(hwl: Hrecowordlist, pwcwords: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiTabletpcAddWordsToWordList")

public actual fun adviseInkChange(hrc: Hrecocontext, bnewstroke: Bool): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiTabletpcAdviseInkChange")

public actual fun createContext(hrec: Hrecognizer, phrc: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiTabletpcCreateContext")

public actual fun createRecognizer(pclsid: MutPtr, phrec: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiTabletpcCreateRecognizer")

public actual fun destroyContext(hrc: Hrecocontext): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiTabletpcDestroyContext")

public actual fun destroyRecognizer(hrec: Hrecognizer): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiTabletpcDestroyRecognizer")

public actual fun destroyWordList(hwl: Hrecowordlist): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiTabletpcDestroyWordList")

public actual fun endInkInput(hrc: Hrecocontext): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiTabletpcEndInkInput")

public actual fun getAllRecognizers(recognizerclsids: MutPtr, count: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiTabletpcGetAllRecognizers")

public actual fun getBestResultString(hrc: Hrecocontext, pcsize: MutPtr, pwcbestresult: Pwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiTabletpcGetBestResultString")

public actual fun getLatticePtr(hrc: Hrecocontext, pplattice: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiTabletpcGetLatticePtr")

public actual fun getLeftSeparator(hrc: Hrecocontext, pcsize: MutPtr, pwcleftseparator: Pwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiTabletpcGetLeftSeparator")

public actual fun getRecoAttributes(hrec: Hrecognizer, precoattrs: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiTabletpcGetRecoAttributes")

public actual fun getResultPropertyList(hrec: Hrecognizer, ppropertycount: MutPtr, ppropertyguid: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiTabletpcGetResultPropertyList")

public actual fun getRightSeparator(hrc: Hrecocontext, pcsize: MutPtr, pwcrightseparator: Pwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiTabletpcGetRightSeparator")

public actual fun getUnicodeRanges(hrec: Hrecognizer, pcranges: MutPtr, pcr: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiTabletpcGetUnicodeRanges")

public actual fun isStringSupported(hrc: Hrecocontext, wcstring: UInt, pwcstring: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiTabletpcIsStringSupported")

public actual fun loadCachedAttributes(clsid: Guid, precoattributes: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiTabletpcLoadCachedAttributes")

public actual fun makeWordList(hrec: Hrecognizer, pbuffer: Pcwstr, phwl: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiTabletpcMakeWordList")

public actual fun process(hrc: Hrecocontext, pbpartialprocessing: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiTabletpcProcess")

public actual fun setEnabledUnicodeRanges(hrc: Hrecocontext, cranges: UInt, pcr: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiTabletpcSetEnabledUnicodeRanges")

public actual fun setFactoid(hrc: Hrecocontext, cwcfactoid: UInt, pwcfactoid: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiTabletpcSetFactoid")

public actual fun setFlags(hrc: Hrecocontext, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiTabletpcSetFlags")

public actual fun setGuide(hrc: Hrecocontext, pguide: ConstPtr, iindex: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiTabletpcSetGuide")

public actual fun setTextContext(hrc: Hrecocontext, cwcbefore: UInt, pwcbefore: Pcwstr, cwcafter: UInt, pwcafter: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiTabletpcSetTextContext")

public actual fun setWordList(hrc: Hrecocontext, hwl: Hrecowordlist): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiTabletpcSetWordList")
