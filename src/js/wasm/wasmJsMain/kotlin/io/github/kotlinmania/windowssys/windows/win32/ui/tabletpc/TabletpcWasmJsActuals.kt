@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32UiTabletpcNapiAddon(): Boolean

private val windowsWin32UiTabletpcNapiAvailable: Boolean = initWindowsWin32UiTabletpcNapiAddon()

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiTabletpcAddStroke(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiTabletpcAddStroke(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiTabletpcAddWordsToWordList(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiTabletpcAddWordsToWordList(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiTabletpcAdviseInkChange(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiTabletpcAdviseInkChange(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiTabletpcCreateContext(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiTabletpcCreateContext(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiTabletpcCreateRecognizer(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiTabletpcCreateRecognizer(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiTabletpcDestroyContext(p0)")
private external fun wasmWindowssysWindowsWin32UiTabletpcDestroyContext(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiTabletpcDestroyRecognizer(p0)")
private external fun wasmWindowssysWindowsWin32UiTabletpcDestroyRecognizer(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiTabletpcDestroyWordList(p0)")
private external fun wasmWindowssysWindowsWin32UiTabletpcDestroyWordList(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiTabletpcEndInkInput(p0)")
private external fun wasmWindowssysWindowsWin32UiTabletpcEndInkInput(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiTabletpcGetAllRecognizers(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiTabletpcGetAllRecognizers(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiTabletpcGetBestResultString(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiTabletpcGetBestResultString(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiTabletpcGetLatticePtr(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiTabletpcGetLatticePtr(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiTabletpcGetLeftSeparator(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiTabletpcGetLeftSeparator(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiTabletpcGetRecoAttributes(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiTabletpcGetRecoAttributes(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiTabletpcGetResultPropertyList(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiTabletpcGetResultPropertyList(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiTabletpcGetRightSeparator(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiTabletpcGetRightSeparator(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiTabletpcGetUnicodeRanges(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiTabletpcGetUnicodeRanges(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiTabletpcIsStringSupported(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiTabletpcIsStringSupported(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiTabletpcMakeWordList(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiTabletpcMakeWordList(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiTabletpcProcess(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiTabletpcProcess(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiTabletpcSetEnabledUnicodeRanges(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiTabletpcSetEnabledUnicodeRanges(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiTabletpcSetFactoid(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiTabletpcSetFactoid(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiTabletpcSetFlags(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiTabletpcSetFlags(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiTabletpcSetGuide(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiTabletpcSetGuide(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiTabletpcSetTextContext(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiTabletpcSetTextContext(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiTabletpcSetWordList(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiTabletpcSetWordList(p0: String, p1: String): Int

public actual fun addStroke(hrc: Hrecocontext, ppacketdesc: ConstPtr, cbpacket: UInt, ppacket: ConstPtr, pxform: ConstPtr): Hresult =
    if (windowsWin32UiTabletpcNapiAvailable) wasmWindowssysWindowsWin32UiTabletpcAddStroke(hrc.rawAddress.toString(), ppacketdesc.rawAddress.toString(), cbpacket.toInt(), ppacket.rawAddress.toString(), pxform.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addWordsToWordList(hwl: Hrecowordlist, pwcwords: Pcwstr): Hresult =
    if (windowsWin32UiTabletpcNapiAvailable) wasmWindowssysWindowsWin32UiTabletpcAddWordsToWordList(hwl.rawAddress.toString(), pwcwords.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun adviseInkChange(hrc: Hrecocontext, bnewstroke: Bool): Hresult =
    if (windowsWin32UiTabletpcNapiAvailable) wasmWindowssysWindowsWin32UiTabletpcAdviseInkChange(hrc.rawAddress.toString(), bnewstroke) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createContext(hrec: Hrecognizer, phrc: MutPtr): Hresult =
    if (windowsWin32UiTabletpcNapiAvailable) wasmWindowssysWindowsWin32UiTabletpcCreateContext(hrec.rawAddress.toString(), phrc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createRecognizer(pclsid: MutPtr, phrec: MutPtr): Hresult =
    if (windowsWin32UiTabletpcNapiAvailable) wasmWindowssysWindowsWin32UiTabletpcCreateRecognizer(pclsid.rawAddress.toString(), phrec.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun destroyContext(hrc: Hrecocontext): Hresult =
    if (windowsWin32UiTabletpcNapiAvailable) wasmWindowssysWindowsWin32UiTabletpcDestroyContext(hrc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun destroyRecognizer(hrec: Hrecognizer): Hresult =
    if (windowsWin32UiTabletpcNapiAvailable) wasmWindowssysWindowsWin32UiTabletpcDestroyRecognizer(hrec.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun destroyWordList(hwl: Hrecowordlist): Hresult =
    if (windowsWin32UiTabletpcNapiAvailable) wasmWindowssysWindowsWin32UiTabletpcDestroyWordList(hwl.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun endInkInput(hrc: Hrecocontext): Hresult =
    if (windowsWin32UiTabletpcNapiAvailable) wasmWindowssysWindowsWin32UiTabletpcEndInkInput(hrc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAllRecognizers(recognizerclsids: MutPtr, count: MutPtr): Hresult =
    if (windowsWin32UiTabletpcNapiAvailable) wasmWindowssysWindowsWin32UiTabletpcGetAllRecognizers(recognizerclsids.rawAddress.toString(), count.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getBestResultString(hrc: Hrecocontext, pcsize: MutPtr, pwcbestresult: Pwstr): Hresult =
    if (windowsWin32UiTabletpcNapiAvailable) wasmWindowssysWindowsWin32UiTabletpcGetBestResultString(hrc.rawAddress.toString(), pcsize.rawAddress.toString(), pwcbestresult.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLatticePtr(hrc: Hrecocontext, pplattice: MutPtr): Hresult =
    if (windowsWin32UiTabletpcNapiAvailable) wasmWindowssysWindowsWin32UiTabletpcGetLatticePtr(hrc.rawAddress.toString(), pplattice.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLeftSeparator(hrc: Hrecocontext, pcsize: MutPtr, pwcleftseparator: Pwstr): Hresult =
    if (windowsWin32UiTabletpcNapiAvailable) wasmWindowssysWindowsWin32UiTabletpcGetLeftSeparator(hrc.rawAddress.toString(), pcsize.rawAddress.toString(), pwcleftseparator.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getRecoAttributes(hrec: Hrecognizer, precoattrs: MutPtr): Hresult =
    if (windowsWin32UiTabletpcNapiAvailable) wasmWindowssysWindowsWin32UiTabletpcGetRecoAttributes(hrec.rawAddress.toString(), precoattrs.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getResultPropertyList(hrec: Hrecognizer, ppropertycount: MutPtr, ppropertyguid: MutPtr): Hresult =
    if (windowsWin32UiTabletpcNapiAvailable) wasmWindowssysWindowsWin32UiTabletpcGetResultPropertyList(hrec.rawAddress.toString(), ppropertycount.rawAddress.toString(), ppropertyguid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getRightSeparator(hrc: Hrecocontext, pcsize: MutPtr, pwcrightseparator: Pwstr): Hresult =
    if (windowsWin32UiTabletpcNapiAvailable) wasmWindowssysWindowsWin32UiTabletpcGetRightSeparator(hrc.rawAddress.toString(), pcsize.rawAddress.toString(), pwcrightseparator.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUnicodeRanges(hrec: Hrecognizer, pcranges: MutPtr, pcr: MutPtr): Hresult =
    if (windowsWin32UiTabletpcNapiAvailable) wasmWindowssysWindowsWin32UiTabletpcGetUnicodeRanges(hrec.rawAddress.toString(), pcranges.rawAddress.toString(), pcr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isStringSupported(hrc: Hrecocontext, wcstring: UInt, pwcstring: Pcwstr): Hresult =
    if (windowsWin32UiTabletpcNapiAvailable) wasmWindowssysWindowsWin32UiTabletpcIsStringSupported(hrc.rawAddress.toString(), wcstring.toInt(), pwcstring.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadCachedAttributes(clsid: Guid, precoattributes: MutPtr): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun makeWordList(hrec: Hrecognizer, pbuffer: Pcwstr, phwl: MutPtr): Hresult =
    if (windowsWin32UiTabletpcNapiAvailable) wasmWindowssysWindowsWin32UiTabletpcMakeWordList(hrec.rawAddress.toString(), pbuffer.rawAddress.toString(), phwl.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun process(hrc: Hrecocontext, pbpartialprocessing: MutPtr): Hresult =
    if (windowsWin32UiTabletpcNapiAvailable) wasmWindowssysWindowsWin32UiTabletpcProcess(hrc.rawAddress.toString(), pbpartialprocessing.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setEnabledUnicodeRanges(hrc: Hrecocontext, cranges: UInt, pcr: MutPtr): Hresult =
    if (windowsWin32UiTabletpcNapiAvailable) wasmWindowssysWindowsWin32UiTabletpcSetEnabledUnicodeRanges(hrc.rawAddress.toString(), cranges.toInt(), pcr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setFactoid(hrc: Hrecocontext, cwcfactoid: UInt, pwcfactoid: Pcwstr): Hresult =
    if (windowsWin32UiTabletpcNapiAvailable) wasmWindowssysWindowsWin32UiTabletpcSetFactoid(hrc.rawAddress.toString(), cwcfactoid.toInt(), pwcfactoid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setFlags(hrc: Hrecocontext, dwflags: UInt): Hresult =
    if (windowsWin32UiTabletpcNapiAvailable) wasmWindowssysWindowsWin32UiTabletpcSetFlags(hrc.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setGuide(hrc: Hrecocontext, pguide: ConstPtr, iindex: UInt): Hresult =
    if (windowsWin32UiTabletpcNapiAvailable) wasmWindowssysWindowsWin32UiTabletpcSetGuide(hrc.rawAddress.toString(), pguide.rawAddress.toString(), iindex.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setTextContext(hrc: Hrecocontext, cwcbefore: UInt, pwcbefore: Pcwstr, cwcafter: UInt, pwcafter: Pcwstr): Hresult =
    if (windowsWin32UiTabletpcNapiAvailable) wasmWindowssysWindowsWin32UiTabletpcSetTextContext(hrc.rawAddress.toString(), cwcbefore.toInt(), pwcbefore.rawAddress.toString(), cwcafter.toInt(), pwcafter.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWordList(hrc: Hrecocontext, hwl: Hrecowordlist): Hresult =
    if (windowsWin32UiTabletpcNapiAvailable) wasmWindowssysWindowsWin32UiTabletpcSetWordList(hrc.rawAddress.toString(), hwl.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
