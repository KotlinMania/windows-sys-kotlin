@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr

public actual fun addStroke(hrc: Hrecocontext, ppacketdesc: COpaquePointer?, cbpacket: UInt, ppacket: COpaquePointer?, pxform: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun addWordsToWordList(hwl: Hrecowordlist, pwcwords: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun adviseInkChange(hrc: Hrecocontext, bnewstroke: Bool): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createContext(hrec: Hrecognizer, phrc: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createRecognizer(pclsid: COpaquePointer?, phrec: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun destroyContext(hrc: Hrecocontext): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun destroyRecognizer(hrec: Hrecognizer): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun destroyWordList(hwl: Hrecowordlist): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun endInkInput(hrc: Hrecocontext): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getAllRecognizers(recognizerclsids: COpaquePointer?, count: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getBestResultString(hrc: Hrecocontext, pcsize: COpaquePointer?, pwcbestresult: Pwstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getLatticePtr(hrc: Hrecocontext, pplattice: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getLeftSeparator(hrc: Hrecocontext, pcsize: COpaquePointer?, pwcleftseparator: Pwstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getRecoAttributes(hrec: Hrecognizer, precoattrs: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getResultPropertyList(hrec: Hrecognizer, ppropertycount: COpaquePointer?, ppropertyguid: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getRightSeparator(hrc: Hrecocontext, pcsize: COpaquePointer?, pwcrightseparator: Pwstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getUnicodeRanges(hrec: Hrecognizer, pcranges: COpaquePointer?, pcr: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isStringSupported(hrc: Hrecocontext, wcstring: UInt, pwcstring: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun loadCachedAttributes(clsid: Guid, precoattributes: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun makeWordList(hrec: Hrecognizer, pbuffer: Pcwstr, phwl: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun process(hrc: Hrecocontext, pbpartialprocessing: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setEnabledUnicodeRanges(hrc: Hrecocontext, cranges: UInt, pcr: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setFactoid(hrc: Hrecocontext, cwcfactoid: UInt, pwcfactoid: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setFlags(hrc: Hrecocontext, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setGuide(hrc: Hrecocontext, pguide: COpaquePointer?, iindex: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setTextContext(hrc: Hrecocontext, cwcbefore: UInt, pwcbefore: Pcwstr, cwcafter: UInt, pwcafter: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setWordList(hrc: Hrecocontext, hwl: Hrecowordlist): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
