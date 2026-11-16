@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr

private val windowsWin32UiTabletpcNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun addStroke(hrc: Hrecocontext, ppacketdesc: ConstPtr, cbpacket: UInt, ppacket: ConstPtr, pxform: ConstPtr): Hresult =
    if (windowsWin32UiTabletpcNapiAddon != null) (windowsWin32UiTabletpcNapiAddon.windowssysWindowsWin32UiTabletpcAddStroke(hrc.rawAddress.toString(), ppacketdesc.rawAddress.toString(), cbpacket.toInt(), ppacket.rawAddress.toString(), pxform.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addWordsToWordList(hwl: Hrecowordlist, pwcwords: Pcwstr): Hresult =
    if (windowsWin32UiTabletpcNapiAddon != null) (windowsWin32UiTabletpcNapiAddon.windowssysWindowsWin32UiTabletpcAddWordsToWordList(hwl.rawAddress.toString(), pwcwords.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun adviseInkChange(hrc: Hrecocontext, bnewstroke: Bool): Hresult =
    if (windowsWin32UiTabletpcNapiAddon != null) (windowsWin32UiTabletpcNapiAddon.windowssysWindowsWin32UiTabletpcAdviseInkChange(hrc.rawAddress.toString(), bnewstroke) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createContext(hrec: Hrecognizer, phrc: MutPtr): Hresult =
    if (windowsWin32UiTabletpcNapiAddon != null) (windowsWin32UiTabletpcNapiAddon.windowssysWindowsWin32UiTabletpcCreateContext(hrec.rawAddress.toString(), phrc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createRecognizer(pclsid: MutPtr, phrec: MutPtr): Hresult =
    if (windowsWin32UiTabletpcNapiAddon != null) (windowsWin32UiTabletpcNapiAddon.windowssysWindowsWin32UiTabletpcCreateRecognizer(pclsid.rawAddress.toString(), phrec.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun destroyContext(hrc: Hrecocontext): Hresult =
    if (windowsWin32UiTabletpcNapiAddon != null) (windowsWin32UiTabletpcNapiAddon.windowssysWindowsWin32UiTabletpcDestroyContext(hrc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun destroyRecognizer(hrec: Hrecognizer): Hresult =
    if (windowsWin32UiTabletpcNapiAddon != null) (windowsWin32UiTabletpcNapiAddon.windowssysWindowsWin32UiTabletpcDestroyRecognizer(hrec.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun destroyWordList(hwl: Hrecowordlist): Hresult =
    if (windowsWin32UiTabletpcNapiAddon != null) (windowsWin32UiTabletpcNapiAddon.windowssysWindowsWin32UiTabletpcDestroyWordList(hwl.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun endInkInput(hrc: Hrecocontext): Hresult =
    if (windowsWin32UiTabletpcNapiAddon != null) (windowsWin32UiTabletpcNapiAddon.windowssysWindowsWin32UiTabletpcEndInkInput(hrc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAllRecognizers(recognizerclsids: MutPtr, count: MutPtr): Hresult =
    if (windowsWin32UiTabletpcNapiAddon != null) (windowsWin32UiTabletpcNapiAddon.windowssysWindowsWin32UiTabletpcGetAllRecognizers(recognizerclsids.rawAddress.toString(), count.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getBestResultString(hrc: Hrecocontext, pcsize: MutPtr, pwcbestresult: Pwstr): Hresult =
    if (windowsWin32UiTabletpcNapiAddon != null) (windowsWin32UiTabletpcNapiAddon.windowssysWindowsWin32UiTabletpcGetBestResultString(hrc.rawAddress.toString(), pcsize.rawAddress.toString(), pwcbestresult.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLatticePtr(hrc: Hrecocontext, pplattice: MutPtr): Hresult =
    if (windowsWin32UiTabletpcNapiAddon != null) (windowsWin32UiTabletpcNapiAddon.windowssysWindowsWin32UiTabletpcGetLatticePtr(hrc.rawAddress.toString(), pplattice.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLeftSeparator(hrc: Hrecocontext, pcsize: MutPtr, pwcleftseparator: Pwstr): Hresult =
    if (windowsWin32UiTabletpcNapiAddon != null) (windowsWin32UiTabletpcNapiAddon.windowssysWindowsWin32UiTabletpcGetLeftSeparator(hrc.rawAddress.toString(), pcsize.rawAddress.toString(), pwcleftseparator.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getRecoAttributes(hrec: Hrecognizer, precoattrs: MutPtr): Hresult =
    if (windowsWin32UiTabletpcNapiAddon != null) (windowsWin32UiTabletpcNapiAddon.windowssysWindowsWin32UiTabletpcGetRecoAttributes(hrec.rawAddress.toString(), precoattrs.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getResultPropertyList(hrec: Hrecognizer, ppropertycount: MutPtr, ppropertyguid: MutPtr): Hresult =
    if (windowsWin32UiTabletpcNapiAddon != null) (windowsWin32UiTabletpcNapiAddon.windowssysWindowsWin32UiTabletpcGetResultPropertyList(hrec.rawAddress.toString(), ppropertycount.rawAddress.toString(), ppropertyguid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getRightSeparator(hrc: Hrecocontext, pcsize: MutPtr, pwcrightseparator: Pwstr): Hresult =
    if (windowsWin32UiTabletpcNapiAddon != null) (windowsWin32UiTabletpcNapiAddon.windowssysWindowsWin32UiTabletpcGetRightSeparator(hrc.rawAddress.toString(), pcsize.rawAddress.toString(), pwcrightseparator.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUnicodeRanges(hrec: Hrecognizer, pcranges: MutPtr, pcr: MutPtr): Hresult =
    if (windowsWin32UiTabletpcNapiAddon != null) (windowsWin32UiTabletpcNapiAddon.windowssysWindowsWin32UiTabletpcGetUnicodeRanges(hrec.rawAddress.toString(), pcranges.rawAddress.toString(), pcr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isStringSupported(hrc: Hrecocontext, wcstring: UInt, pwcstring: Pcwstr): Hresult =
    if (windowsWin32UiTabletpcNapiAddon != null) (windowsWin32UiTabletpcNapiAddon.windowssysWindowsWin32UiTabletpcIsStringSupported(hrc.rawAddress.toString(), wcstring.toInt(), pwcstring.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadCachedAttributes(clsid: Guid, precoattributes: MutPtr): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun makeWordList(hrec: Hrecognizer, pbuffer: Pcwstr, phwl: MutPtr): Hresult =
    if (windowsWin32UiTabletpcNapiAddon != null) (windowsWin32UiTabletpcNapiAddon.windowssysWindowsWin32UiTabletpcMakeWordList(hrec.rawAddress.toString(), pbuffer.rawAddress.toString(), phwl.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun process(hrc: Hrecocontext, pbpartialprocessing: MutPtr): Hresult =
    if (windowsWin32UiTabletpcNapiAddon != null) (windowsWin32UiTabletpcNapiAddon.windowssysWindowsWin32UiTabletpcProcess(hrc.rawAddress.toString(), pbpartialprocessing.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setEnabledUnicodeRanges(hrc: Hrecocontext, cranges: UInt, pcr: MutPtr): Hresult =
    if (windowsWin32UiTabletpcNapiAddon != null) (windowsWin32UiTabletpcNapiAddon.windowssysWindowsWin32UiTabletpcSetEnabledUnicodeRanges(hrc.rawAddress.toString(), cranges.toInt(), pcr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setFactoid(hrc: Hrecocontext, cwcfactoid: UInt, pwcfactoid: Pcwstr): Hresult =
    if (windowsWin32UiTabletpcNapiAddon != null) (windowsWin32UiTabletpcNapiAddon.windowssysWindowsWin32UiTabletpcSetFactoid(hrc.rawAddress.toString(), cwcfactoid.toInt(), pwcfactoid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setFlags(hrc: Hrecocontext, dwflags: UInt): Hresult =
    if (windowsWin32UiTabletpcNapiAddon != null) (windowsWin32UiTabletpcNapiAddon.windowssysWindowsWin32UiTabletpcSetFlags(hrc.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setGuide(hrc: Hrecocontext, pguide: ConstPtr, iindex: UInt): Hresult =
    if (windowsWin32UiTabletpcNapiAddon != null) (windowsWin32UiTabletpcNapiAddon.windowssysWindowsWin32UiTabletpcSetGuide(hrc.rawAddress.toString(), pguide.rawAddress.toString(), iindex.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setTextContext(hrc: Hrecocontext, cwcbefore: UInt, pwcbefore: Pcwstr, cwcafter: UInt, pwcafter: Pcwstr): Hresult =
    if (windowsWin32UiTabletpcNapiAddon != null) (windowsWin32UiTabletpcNapiAddon.windowssysWindowsWin32UiTabletpcSetTextContext(hrc.rawAddress.toString(), cwcbefore.toInt(), pwcbefore.rawAddress.toString(), cwcafter.toInt(), pwcafter.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWordList(hrc: Hrecocontext, hwl: Hrecowordlist): Hresult =
    if (windowsWin32UiTabletpcNapiAddon != null) (windowsWin32UiTabletpcNapiAddon.windowssysWindowsWin32UiTabletpcSetWordList(hrc.rawAddress.toString(), hwl.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
