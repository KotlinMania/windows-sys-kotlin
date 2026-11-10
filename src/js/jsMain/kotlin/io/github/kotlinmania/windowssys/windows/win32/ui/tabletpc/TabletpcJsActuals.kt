@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr

private val _windowsWin32UiTabletpcNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun addStroke(hrc: Hrecocontext, ppacketdesc: COpaquePointer?, cbpacket: UInt, ppacket: COpaquePointer?, pxform: COpaquePointer?): Hresult =
    if (_windowsWin32UiTabletpcNapiAddon != null) (_windowsWin32UiTabletpcNapiAddon.windowssys_windows_win32_ui_tabletpc_addStroke((hrc?.value ?: 0L).toString(), (ppacketdesc?.value ?: 0L).toString(), cbpacket.toInt(), (ppacket?.value ?: 0L).toString(), (pxform?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addWordsToWordList(hwl: Hrecowordlist, pwcwords: Pcwstr): Hresult =
    if (_windowsWin32UiTabletpcNapiAddon != null) (_windowsWin32UiTabletpcNapiAddon.windowssys_windows_win32_ui_tabletpc_addWordsToWordList((hwl?.value ?: 0L).toString(), (pwcwords?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun adviseInkChange(hrc: Hrecocontext, bnewstroke: Bool): Hresult =
    if (_windowsWin32UiTabletpcNapiAddon != null) (_windowsWin32UiTabletpcNapiAddon.windowssys_windows_win32_ui_tabletpc_adviseInkChange((hrc?.value ?: 0L).toString(), bnewstroke) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createContext(hrec: Hrecognizer, phrc: COpaquePointer?): Hresult =
    if (_windowsWin32UiTabletpcNapiAddon != null) (_windowsWin32UiTabletpcNapiAddon.windowssys_windows_win32_ui_tabletpc_createContext((hrec?.value ?: 0L).toString(), (phrc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createRecognizer(pclsid: COpaquePointer?, phrec: COpaquePointer?): Hresult =
    if (_windowsWin32UiTabletpcNapiAddon != null) (_windowsWin32UiTabletpcNapiAddon.windowssys_windows_win32_ui_tabletpc_createRecognizer((pclsid?.value ?: 0L).toString(), (phrec?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun destroyContext(hrc: Hrecocontext): Hresult =
    if (_windowsWin32UiTabletpcNapiAddon != null) (_windowsWin32UiTabletpcNapiAddon.windowssys_windows_win32_ui_tabletpc_destroyContext((hrc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun destroyRecognizer(hrec: Hrecognizer): Hresult =
    if (_windowsWin32UiTabletpcNapiAddon != null) (_windowsWin32UiTabletpcNapiAddon.windowssys_windows_win32_ui_tabletpc_destroyRecognizer((hrec?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun destroyWordList(hwl: Hrecowordlist): Hresult =
    if (_windowsWin32UiTabletpcNapiAddon != null) (_windowsWin32UiTabletpcNapiAddon.windowssys_windows_win32_ui_tabletpc_destroyWordList((hwl?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun endInkInput(hrc: Hrecocontext): Hresult =
    if (_windowsWin32UiTabletpcNapiAddon != null) (_windowsWin32UiTabletpcNapiAddon.windowssys_windows_win32_ui_tabletpc_endInkInput((hrc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAllRecognizers(recognizerclsids: COpaquePointer?, count: COpaquePointer?): Hresult =
    if (_windowsWin32UiTabletpcNapiAddon != null) (_windowsWin32UiTabletpcNapiAddon.windowssys_windows_win32_ui_tabletpc_getAllRecognizers((recognizerclsids?.value ?: 0L).toString(), (count?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getBestResultString(hrc: Hrecocontext, pcsize: COpaquePointer?, pwcbestresult: Pwstr): Hresult =
    if (_windowsWin32UiTabletpcNapiAddon != null) (_windowsWin32UiTabletpcNapiAddon.windowssys_windows_win32_ui_tabletpc_getBestResultString((hrc?.value ?: 0L).toString(), (pcsize?.value ?: 0L).toString(), (pwcbestresult?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLatticePtr(hrc: Hrecocontext, pplattice: COpaquePointer?): Hresult =
    if (_windowsWin32UiTabletpcNapiAddon != null) (_windowsWin32UiTabletpcNapiAddon.windowssys_windows_win32_ui_tabletpc_getLatticePtr((hrc?.value ?: 0L).toString(), (pplattice?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLeftSeparator(hrc: Hrecocontext, pcsize: COpaquePointer?, pwcleftseparator: Pwstr): Hresult =
    if (_windowsWin32UiTabletpcNapiAddon != null) (_windowsWin32UiTabletpcNapiAddon.windowssys_windows_win32_ui_tabletpc_getLeftSeparator((hrc?.value ?: 0L).toString(), (pcsize?.value ?: 0L).toString(), (pwcleftseparator?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getRecoAttributes(hrec: Hrecognizer, precoattrs: COpaquePointer?): Hresult =
    if (_windowsWin32UiTabletpcNapiAddon != null) (_windowsWin32UiTabletpcNapiAddon.windowssys_windows_win32_ui_tabletpc_getRecoAttributes((hrec?.value ?: 0L).toString(), (precoattrs?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getResultPropertyList(hrec: Hrecognizer, ppropertycount: COpaquePointer?, ppropertyguid: COpaquePointer?): Hresult =
    if (_windowsWin32UiTabletpcNapiAddon != null) (_windowsWin32UiTabletpcNapiAddon.windowssys_windows_win32_ui_tabletpc_getResultPropertyList((hrec?.value ?: 0L).toString(), (ppropertycount?.value ?: 0L).toString(), (ppropertyguid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getRightSeparator(hrc: Hrecocontext, pcsize: COpaquePointer?, pwcrightseparator: Pwstr): Hresult =
    if (_windowsWin32UiTabletpcNapiAddon != null) (_windowsWin32UiTabletpcNapiAddon.windowssys_windows_win32_ui_tabletpc_getRightSeparator((hrc?.value ?: 0L).toString(), (pcsize?.value ?: 0L).toString(), (pwcrightseparator?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUnicodeRanges(hrec: Hrecognizer, pcranges: COpaquePointer?, pcr: COpaquePointer?): Hresult =
    if (_windowsWin32UiTabletpcNapiAddon != null) (_windowsWin32UiTabletpcNapiAddon.windowssys_windows_win32_ui_tabletpc_getUnicodeRanges((hrec?.value ?: 0L).toString(), (pcranges?.value ?: 0L).toString(), (pcr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isStringSupported(hrc: Hrecocontext, wcstring: UInt, pwcstring: Pcwstr): Hresult =
    if (_windowsWin32UiTabletpcNapiAddon != null) (_windowsWin32UiTabletpcNapiAddon.windowssys_windows_win32_ui_tabletpc_isStringSupported((hrc?.value ?: 0L).toString(), wcstring.toInt(), (pwcstring?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadCachedAttributes(clsid: Guid, precoattributes: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun makeWordList(hrec: Hrecognizer, pbuffer: Pcwstr, phwl: COpaquePointer?): Hresult =
    if (_windowsWin32UiTabletpcNapiAddon != null) (_windowsWin32UiTabletpcNapiAddon.windowssys_windows_win32_ui_tabletpc_makeWordList((hrec?.value ?: 0L).toString(), (pbuffer?.value ?: 0L).toString(), (phwl?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun process(hrc: Hrecocontext, pbpartialprocessing: COpaquePointer?): Hresult =
    if (_windowsWin32UiTabletpcNapiAddon != null) (_windowsWin32UiTabletpcNapiAddon.windowssys_windows_win32_ui_tabletpc_process((hrc?.value ?: 0L).toString(), (pbpartialprocessing?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setEnabledUnicodeRanges(hrc: Hrecocontext, cranges: UInt, pcr: COpaquePointer?): Hresult =
    if (_windowsWin32UiTabletpcNapiAddon != null) (_windowsWin32UiTabletpcNapiAddon.windowssys_windows_win32_ui_tabletpc_setEnabledUnicodeRanges((hrc?.value ?: 0L).toString(), cranges.toInt(), (pcr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setFactoid(hrc: Hrecocontext, cwcfactoid: UInt, pwcfactoid: Pcwstr): Hresult =
    if (_windowsWin32UiTabletpcNapiAddon != null) (_windowsWin32UiTabletpcNapiAddon.windowssys_windows_win32_ui_tabletpc_setFactoid((hrc?.value ?: 0L).toString(), cwcfactoid.toInt(), (pwcfactoid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setFlags(hrc: Hrecocontext, dwflags: UInt): Hresult =
    if (_windowsWin32UiTabletpcNapiAddon != null) (_windowsWin32UiTabletpcNapiAddon.windowssys_windows_win32_ui_tabletpc_setFlags((hrc?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setGuide(hrc: Hrecocontext, pguide: COpaquePointer?, iindex: UInt): Hresult =
    if (_windowsWin32UiTabletpcNapiAddon != null) (_windowsWin32UiTabletpcNapiAddon.windowssys_windows_win32_ui_tabletpc_setGuide((hrc?.value ?: 0L).toString(), (pguide?.value ?: 0L).toString(), iindex.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setTextContext(hrc: Hrecocontext, cwcbefore: UInt, pwcbefore: Pcwstr, cwcafter: UInt, pwcafter: Pcwstr): Hresult =
    if (_windowsWin32UiTabletpcNapiAddon != null) (_windowsWin32UiTabletpcNapiAddon.windowssys_windows_win32_ui_tabletpc_setTextContext((hrc?.value ?: 0L).toString(), cwcbefore.toInt(), (pwcbefore?.value ?: 0L).toString(), cwcafter.toInt(), (pwcafter?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWordList(hrc: Hrecocontext, hwl: Hrecowordlist): Hresult =
    if (_windowsWin32UiTabletpcNapiAddon != null) (_windowsWin32UiTabletpcNapiAddon.windowssys_windows_win32_ui_tabletpc_setWordList((hrc?.value ?: 0L).toString(), (hwl?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
