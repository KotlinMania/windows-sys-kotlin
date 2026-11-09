@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR

private val _windowsWin32UiTabletpcNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun AddStroke(hrc: HRECOCONTEXT, ppacketdesc: Long, cbpacket: UInt, ppacket: Long, pxform: Long): HRESULT =
    if (_windowsWin32UiTabletpcNapiAddon != null) (_windowsWin32UiTabletpcNapiAddon.windowssys_windows_win32_ui_tabletpc_AddStroke(hrc.toString(), ppacketdesc.toString(), cbpacket.toInt(), ppacket.toString(), pxform.toString()) as Int) else 0

public actual fun AddWordsToWordList(hwl: HRECOWORDLIST, pwcwords: PCWSTR): HRESULT =
    if (_windowsWin32UiTabletpcNapiAddon != null) (_windowsWin32UiTabletpcNapiAddon.windowssys_windows_win32_ui_tabletpc_AddWordsToWordList(hwl.toString(), pwcwords.toString()) as Int) else 0

public actual fun AdviseInkChange(hrc: HRECOCONTEXT, bnewstroke: BOOL): HRESULT =
    if (_windowsWin32UiTabletpcNapiAddon != null) (_windowsWin32UiTabletpcNapiAddon.windowssys_windows_win32_ui_tabletpc_AdviseInkChange(hrc.toString(), bnewstroke) as Int) else 0

public actual fun CreateContext(hrec: HRECOGNIZER, phrc: Long): HRESULT =
    if (_windowsWin32UiTabletpcNapiAddon != null) (_windowsWin32UiTabletpcNapiAddon.windowssys_windows_win32_ui_tabletpc_CreateContext(hrec.toString(), phrc.toString()) as Int) else 0

public actual fun CreateRecognizer(pclsid: Long, phrec: Long): HRESULT =
    if (_windowsWin32UiTabletpcNapiAddon != null) (_windowsWin32UiTabletpcNapiAddon.windowssys_windows_win32_ui_tabletpc_CreateRecognizer(pclsid.toString(), phrec.toString()) as Int) else 0

public actual fun DestroyContext(hrc: HRECOCONTEXT): HRESULT =
    if (_windowsWin32UiTabletpcNapiAddon != null) (_windowsWin32UiTabletpcNapiAddon.windowssys_windows_win32_ui_tabletpc_DestroyContext(hrc.toString()) as Int) else 0

public actual fun DestroyRecognizer(hrec: HRECOGNIZER): HRESULT =
    if (_windowsWin32UiTabletpcNapiAddon != null) (_windowsWin32UiTabletpcNapiAddon.windowssys_windows_win32_ui_tabletpc_DestroyRecognizer(hrec.toString()) as Int) else 0

public actual fun DestroyWordList(hwl: HRECOWORDLIST): HRESULT =
    if (_windowsWin32UiTabletpcNapiAddon != null) (_windowsWin32UiTabletpcNapiAddon.windowssys_windows_win32_ui_tabletpc_DestroyWordList(hwl.toString()) as Int) else 0

public actual fun EndInkInput(hrc: HRECOCONTEXT): HRESULT =
    if (_windowsWin32UiTabletpcNapiAddon != null) (_windowsWin32UiTabletpcNapiAddon.windowssys_windows_win32_ui_tabletpc_EndInkInput(hrc.toString()) as Int) else 0

public actual fun GetAllRecognizers(recognizerclsids: Long, count: Long): HRESULT =
    if (_windowsWin32UiTabletpcNapiAddon != null) (_windowsWin32UiTabletpcNapiAddon.windowssys_windows_win32_ui_tabletpc_GetAllRecognizers(recognizerclsids.toString(), count.toString()) as Int) else 0

public actual fun GetBestResultString(hrc: HRECOCONTEXT, pcsize: Long, pwcbestresult: PWSTR): HRESULT =
    if (_windowsWin32UiTabletpcNapiAddon != null) (_windowsWin32UiTabletpcNapiAddon.windowssys_windows_win32_ui_tabletpc_GetBestResultString(hrc.toString(), pcsize.toString(), pwcbestresult.toString()) as Int) else 0

public actual fun GetLatticePtr(hrc: HRECOCONTEXT, pplattice: Long): HRESULT =
    if (_windowsWin32UiTabletpcNapiAddon != null) (_windowsWin32UiTabletpcNapiAddon.windowssys_windows_win32_ui_tabletpc_GetLatticePtr(hrc.toString(), pplattice.toString()) as Int) else 0

public actual fun GetLeftSeparator(hrc: HRECOCONTEXT, pcsize: Long, pwcleftseparator: PWSTR): HRESULT =
    if (_windowsWin32UiTabletpcNapiAddon != null) (_windowsWin32UiTabletpcNapiAddon.windowssys_windows_win32_ui_tabletpc_GetLeftSeparator(hrc.toString(), pcsize.toString(), pwcleftseparator.toString()) as Int) else 0

public actual fun GetRecoAttributes(hrec: HRECOGNIZER, precoattrs: Long): HRESULT =
    if (_windowsWin32UiTabletpcNapiAddon != null) (_windowsWin32UiTabletpcNapiAddon.windowssys_windows_win32_ui_tabletpc_GetRecoAttributes(hrec.toString(), precoattrs.toString()) as Int) else 0

public actual fun GetResultPropertyList(hrec: HRECOGNIZER, ppropertycount: Long, ppropertyguid: Long): HRESULT =
    if (_windowsWin32UiTabletpcNapiAddon != null) (_windowsWin32UiTabletpcNapiAddon.windowssys_windows_win32_ui_tabletpc_GetResultPropertyList(hrec.toString(), ppropertycount.toString(), ppropertyguid.toString()) as Int) else 0

public actual fun GetRightSeparator(hrc: HRECOCONTEXT, pcsize: Long, pwcrightseparator: PWSTR): HRESULT =
    if (_windowsWin32UiTabletpcNapiAddon != null) (_windowsWin32UiTabletpcNapiAddon.windowssys_windows_win32_ui_tabletpc_GetRightSeparator(hrc.toString(), pcsize.toString(), pwcrightseparator.toString()) as Int) else 0

public actual fun GetUnicodeRanges(hrec: HRECOGNIZER, pcranges: Long, pcr: Long): HRESULT =
    if (_windowsWin32UiTabletpcNapiAddon != null) (_windowsWin32UiTabletpcNapiAddon.windowssys_windows_win32_ui_tabletpc_GetUnicodeRanges(hrec.toString(), pcranges.toString(), pcr.toString()) as Int) else 0

public actual fun IsStringSupported(hrc: HRECOCONTEXT, wcstring: UInt, pwcstring: PCWSTR): HRESULT =
    if (_windowsWin32UiTabletpcNapiAddon != null) (_windowsWin32UiTabletpcNapiAddon.windowssys_windows_win32_ui_tabletpc_IsStringSupported(hrc.toString(), wcstring.toInt(), pwcstring.toString()) as Int) else 0

public actual fun LoadCachedAttributes(clsid: GUID, precoattributes: Long): HRESULT =
    0

public actual fun MakeWordList(hrec: HRECOGNIZER, pbuffer: PCWSTR, phwl: Long): HRESULT =
    if (_windowsWin32UiTabletpcNapiAddon != null) (_windowsWin32UiTabletpcNapiAddon.windowssys_windows_win32_ui_tabletpc_MakeWordList(hrec.toString(), pbuffer.toString(), phwl.toString()) as Int) else 0

public actual fun Process(hrc: HRECOCONTEXT, pbpartialprocessing: Long): HRESULT =
    if (_windowsWin32UiTabletpcNapiAddon != null) (_windowsWin32UiTabletpcNapiAddon.windowssys_windows_win32_ui_tabletpc_Process(hrc.toString(), pbpartialprocessing.toString()) as Int) else 0

public actual fun SetEnabledUnicodeRanges(hrc: HRECOCONTEXT, cranges: UInt, pcr: Long): HRESULT =
    if (_windowsWin32UiTabletpcNapiAddon != null) (_windowsWin32UiTabletpcNapiAddon.windowssys_windows_win32_ui_tabletpc_SetEnabledUnicodeRanges(hrc.toString(), cranges.toInt(), pcr.toString()) as Int) else 0

public actual fun SetFactoid(hrc: HRECOCONTEXT, cwcfactoid: UInt, pwcfactoid: PCWSTR): HRESULT =
    if (_windowsWin32UiTabletpcNapiAddon != null) (_windowsWin32UiTabletpcNapiAddon.windowssys_windows_win32_ui_tabletpc_SetFactoid(hrc.toString(), cwcfactoid.toInt(), pwcfactoid.toString()) as Int) else 0

public actual fun SetFlags(hrc: HRECOCONTEXT, dwflags: UInt): HRESULT =
    if (_windowsWin32UiTabletpcNapiAddon != null) (_windowsWin32UiTabletpcNapiAddon.windowssys_windows_win32_ui_tabletpc_SetFlags(hrc.toString(), dwflags.toInt()) as Int) else 0

public actual fun SetGuide(hrc: HRECOCONTEXT, pguide: Long, iindex: UInt): HRESULT =
    if (_windowsWin32UiTabletpcNapiAddon != null) (_windowsWin32UiTabletpcNapiAddon.windowssys_windows_win32_ui_tabletpc_SetGuide(hrc.toString(), pguide.toString(), iindex.toInt()) as Int) else 0

public actual fun SetTextContext(hrc: HRECOCONTEXT, cwcbefore: UInt, pwcbefore: PCWSTR, cwcafter: UInt, pwcafter: PCWSTR): HRESULT =
    if (_windowsWin32UiTabletpcNapiAddon != null) (_windowsWin32UiTabletpcNapiAddon.windowssys_windows_win32_ui_tabletpc_SetTextContext(hrc.toString(), cwcbefore.toInt(), pwcbefore.toString(), cwcafter.toInt(), pwcafter.toString()) as Int) else 0

public actual fun SetWordList(hrc: HRECOCONTEXT, hwl: HRECOWORDLIST): HRESULT =
    if (_windowsWin32UiTabletpcNapiAddon != null) (_windowsWin32UiTabletpcNapiAddon.windowssys_windows_win32_ui_tabletpc_SetWordList(hrc.toString(), hwl.toString()) as Int) else 0
