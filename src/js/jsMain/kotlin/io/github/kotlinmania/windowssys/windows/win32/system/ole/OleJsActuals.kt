@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.ole

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Bstr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hglobal
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.VariantBool
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hdc
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hpalette
import io.github.kotlinmania.windowssys.windows.win32.system.com.CY
import io.github.kotlinmania.windowssys.windows.win32.system.com.Callconv
import io.github.kotlinmania.windowssys.windows.win32.system.com.Syskind
import io.github.kotlinmania.windowssys.windows.win32.system.memory.GlobalAllocFlags
import io.github.kotlinmania.windowssys.windows.win32.system.variant.Varenum
import io.github.kotlinmania.windowssys.windows.win32.system.variant.Variant
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Haccel
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Hcursor
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Hicon
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Hmenu

private val _windowsWin32SystemOleNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun bstrFromVector(psa: COpaquePointer?, pbstr: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_bstrFromVector((psa?.value ?: 0L).toString(), (pbstr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clearCustData(pcustdata: COpaquePointer?) {
    if (_windowsWin32SystemOleNapiAddon != null) {
        _windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_clearCustData((pcustdata?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun createDispTypeInfo(pidata: COpaquePointer?, lcid: UInt, pptinfo: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_createDispTypeInfo((pidata?.value ?: 0L).toString(), lcid.toInt(), (pptinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createErrorInfo(pperrinfo: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_createErrorInfo((pperrinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createOleAdviseHolder(ppoaholder: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_createOleAdviseHolder((ppoaholder?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createStdDispatch(punkouter: COpaquePointer?, pvthis: COpaquePointer?, ptinfo: COpaquePointer?, ppunkstddisp: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_createStdDispatch((punkouter?.value ?: 0L).toString(), (pvthis?.value ?: 0L).toString(), (ptinfo?.value ?: 0L).toString(), (ppunkstddisp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createTypeLib(syskind: Syskind, szfile: Pcwstr, ppctlib: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_createTypeLib(syskind, (szfile?.value ?: 0L).toString(), (ppctlib?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createTypeLib2(syskind: Syskind, szfile: Pcwstr, ppctlib: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_createTypeLib2(syskind, (szfile?.value ?: 0L).toString(), (ppctlib?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dispCallFunc(pvinstance: COpaquePointer?, ovft: ULong, cc: Callconv, vtreturn: Varenum, cactuals: UInt, prgvt: COpaquePointer?, prgpvarg: COpaquePointer?, pvargresult: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_dispCallFunc((pvinstance?.value ?: 0L).toString(), ovft.toString(), cc, vtreturn.toInt(), cactuals.toInt(), (prgvt?.value ?: 0L).toString(), (prgpvarg?.value ?: 0L).toString(), (pvargresult?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dispGetIDsOfNames(ptinfo: COpaquePointer?, rgsznames: COpaquePointer?, cnames: UInt, rgdispid: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_dispGetIDsOfNames((ptinfo?.value ?: 0L).toString(), (rgsznames?.value ?: 0L).toString(), cnames.toInt(), (rgdispid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dispGetParam(pdispparams: COpaquePointer?, position: UInt, vttarg: Varenum, pvarresult: COpaquePointer?, puargerr: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_dispGetParam((pdispparams?.value ?: 0L).toString(), position.toInt(), vttarg.toInt(), (pvarresult?.value ?: 0L).toString(), (puargerr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dispInvoke(thisRef: COpaquePointer?, ptinfo: COpaquePointer?, dispidmember: Int, wflags: UShort, pparams: COpaquePointer?, pvarresult: COpaquePointer?, pexcepinfo: COpaquePointer?, puargerr: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_dispInvoke((thisRef?.value ?: 0L).toString(), (ptinfo?.value ?: 0L).toString(), dispidmember, wflags.toInt(), (pparams?.value ?: 0L).toString(), (pvarresult?.value ?: 0L).toString(), (pexcepinfo?.value ?: 0L).toString(), (puargerr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun doDragDrop(pdataobj: COpaquePointer?, pdropsource: COpaquePointer?, dwokeffects: Dropeffect, pdweffect: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_doDragDrop((pdataobj?.value ?: 0L).toString(), (pdropsource?.value ?: 0L).toString(), dwokeffects.toInt(), (pdweffect?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getActiveObject(rclsid: COpaquePointer?, pvreserved: COpaquePointer?, ppunk: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_getActiveObject((rclsid?.value ?: 0L).toString(), (pvreserved?.value ?: 0L).toString(), (ppunk?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAltMonthNames(lcid: UInt, prgp: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_getAltMonthNames(lcid.toInt(), (prgp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getRecordInfoFromGuids(rguidtypelib: COpaquePointer?, uvermajor: UInt, uverminor: UInt, lcid: UInt, rguidtypeinfo: COpaquePointer?, pprecinfo: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_getRecordInfoFromGuids((rguidtypelib?.value ?: 0L).toString(), uvermajor.toInt(), uverminor.toInt(), lcid.toInt(), (rguidtypeinfo?.value ?: 0L).toString(), (pprecinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getRecordInfoFromTypeInfo(ptypeinfo: COpaquePointer?, pprecinfo: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_getRecordInfoFromTypeInfo((ptypeinfo?.value ?: 0L).toString(), (pprecinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hrgnUserFree(param0: COpaquePointer?, param1: COpaquePointer?) {
    if (_windowsWin32SystemOleNapiAddon != null) {
        _windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_hrgnUserFree((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hrgnUserFree64(param0: COpaquePointer?, param1: COpaquePointer?) {
    if (_windowsWin32SystemOleNapiAddon != null) {
        _windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_hrgnUserFree64((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hrgnUserMarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_hrgnUserMarshal((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hrgnUserMarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_hrgnUserMarshal64((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hrgnUserSize(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_hrgnUserSize((param0?.value ?: 0L).toString(), param1.toInt(), (param2?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hrgnUserSize64(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_hrgnUserSize64((param0?.value ?: 0L).toString(), param1.toInt(), (param2?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hrgnUserUnmarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_hrgnUserUnmarshal((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hrgnUserUnmarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_hrgnUserUnmarshal64((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isAccelerator(haccel: Haccel, caccelentries: Int, lpmsg: COpaquePointer?, lpwcmd: COpaquePointer?): Bool =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_isAccelerator((haccel?.value ?: 0L).toString(), caccelentries, (lpmsg?.value ?: 0L).toString(), (lpwcmd?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lHashValOfNameSys(syskind: Syskind, lcid: UInt, szname: Pcwstr): UInt =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_lHashValOfNameSys(syskind, lcid.toInt(), (szname?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lHashValOfNameSysA(syskind: Syskind, lcid: UInt, szname: Pcstr): UInt =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_lHashValOfNameSysA(syskind, lcid.toInt(), (szname?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadRegTypeLib(rguid: COpaquePointer?, wvermajor: UShort, wverminor: UShort, lcid: UInt, pptlib: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_loadRegTypeLib((rguid?.value ?: 0L).toString(), wvermajor.toInt(), wverminor.toInt(), lcid.toInt(), (pptlib?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadTypeLib(szfile: Pcwstr, pptlib: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_loadTypeLib((szfile?.value ?: 0L).toString(), (pptlib?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadTypeLibEx(szfile: Pcwstr, regkind: Regkind, pptlib: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_loadTypeLibEx((szfile?.value ?: 0L).toString(), regkind, (pptlib?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oaBuildVersion(): UInt =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oaBuildVersion() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oaEnablePerUserTLibRegistration() {
    if (_windowsWin32SystemOleNapiAddon != null) {
        _windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oaEnablePerUserTLibRegistration()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun oleBuildVersion(): UInt =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleBuildVersion() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleConvertOLESTREAMToIStorage2(lpolestream: COpaquePointer?, pstg: COpaquePointer?, ptd: COpaquePointer?, opt: UInt, pvcallbackcontext: COpaquePointer?, pqueryconvertolelinkcallback: Olestreamqueryconvertolelinkcallback): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleConvertOLESTREAMToIStorage2((lpolestream?.value ?: 0L).toString(), (pstg?.value ?: 0L).toString(), (ptd?.value ?: 0L).toString(), opt.toInt(), (pvcallbackcontext?.value ?: 0L).toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleConvertOLESTREAMToIStorageEx2(polestm: COpaquePointer?, pstg: COpaquePointer?, pcfformat: COpaquePointer?, plwwidth: COpaquePointer?, plheight: COpaquePointer?, pdwsize: COpaquePointer?, pmedium: COpaquePointer?, opt: UInt, pvcallbackcontext: COpaquePointer?, pqueryconvertolelinkcallback: Olestreamqueryconvertolelinkcallback): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleConvertOLESTREAMToIStorageEx2((polestm?.value ?: 0L).toString(), (pstg?.value ?: 0L).toString(), (pcfformat?.value ?: 0L).toString(), (plwwidth?.value ?: 0L).toString(), (plheight?.value ?: 0L).toString(), (pdwsize?.value ?: 0L).toString(), (pmedium?.value ?: 0L).toString(), opt.toInt(), (pvcallbackcontext?.value ?: 0L).toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleCreate(rclsid: COpaquePointer?, riid: COpaquePointer?, renderopt: UInt, pformatetc: COpaquePointer?, pclientsite: COpaquePointer?, pstg: COpaquePointer?, ppvobj: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleCreate((rclsid?.value ?: 0L).toString(), (riid?.value ?: 0L).toString(), renderopt.toInt(), (pformatetc?.value ?: 0L).toString(), (pclientsite?.value ?: 0L).toString(), (pstg?.value ?: 0L).toString(), (ppvobj?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleCreateDefaultHandler(clsid: COpaquePointer?, punkouter: COpaquePointer?, riid: COpaquePointer?, lplpobj: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleCreateDefaultHandler((clsid?.value ?: 0L).toString(), (punkouter?.value ?: 0L).toString(), (riid?.value ?: 0L).toString(), (lplpobj?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleCreateEmbeddingHelper(clsid: COpaquePointer?, punkouter: COpaquePointer?, flags: EmbdhlpFlags, pcf: COpaquePointer?, riid: COpaquePointer?, lplpobj: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleCreateEmbeddingHelper((clsid?.value ?: 0L).toString(), (punkouter?.value ?: 0L).toString(), flags.toInt(), (pcf?.value ?: 0L).toString(), (riid?.value ?: 0L).toString(), (lplpobj?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleCreateEx(rclsid: COpaquePointer?, riid: COpaquePointer?, dwflags: Olecreate, renderopt: UInt, cformats: UInt, rgadvf: COpaquePointer?, rgformatetc: COpaquePointer?, lpadvisesink: COpaquePointer?, rgdwconnection: COpaquePointer?, pclientsite: COpaquePointer?, pstg: COpaquePointer?, ppvobj: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleCreateEx((rclsid?.value ?: 0L).toString(), (riid?.value ?: 0L).toString(), dwflags.toInt(), renderopt.toInt(), cformats.toInt(), (rgadvf?.value ?: 0L).toString(), (rgformatetc?.value ?: 0L).toString(), (lpadvisesink?.value ?: 0L).toString(), (rgdwconnection?.value ?: 0L).toString(), (pclientsite?.value ?: 0L).toString(), (pstg?.value ?: 0L).toString(), (ppvobj?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleCreateFontIndirect(lpfontdesc: COpaquePointer?, riid: COpaquePointer?, lplpvobj: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleCreateFontIndirect((lpfontdesc?.value ?: 0L).toString(), (riid?.value ?: 0L).toString(), (lplpvobj?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleCreateFromData(psrcdataobj: COpaquePointer?, riid: COpaquePointer?, renderopt: UInt, pformatetc: COpaquePointer?, pclientsite: COpaquePointer?, pstg: COpaquePointer?, ppvobj: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleCreateFromData((psrcdataobj?.value ?: 0L).toString(), (riid?.value ?: 0L).toString(), renderopt.toInt(), (pformatetc?.value ?: 0L).toString(), (pclientsite?.value ?: 0L).toString(), (pstg?.value ?: 0L).toString(), (ppvobj?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleCreateFromDataEx(psrcdataobj: COpaquePointer?, riid: COpaquePointer?, dwflags: Olecreate, renderopt: UInt, cformats: UInt, rgadvf: COpaquePointer?, rgformatetc: COpaquePointer?, lpadvisesink: COpaquePointer?, rgdwconnection: COpaquePointer?, pclientsite: COpaquePointer?, pstg: COpaquePointer?, ppvobj: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleCreateFromDataEx((psrcdataobj?.value ?: 0L).toString(), (riid?.value ?: 0L).toString(), dwflags.toInt(), renderopt.toInt(), cformats.toInt(), (rgadvf?.value ?: 0L).toString(), (rgformatetc?.value ?: 0L).toString(), (lpadvisesink?.value ?: 0L).toString(), (rgdwconnection?.value ?: 0L).toString(), (pclientsite?.value ?: 0L).toString(), (pstg?.value ?: 0L).toString(), (ppvobj?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleCreateFromFile(rclsid: COpaquePointer?, lpszfilename: Pcwstr, riid: COpaquePointer?, renderopt: UInt, lpformatetc: COpaquePointer?, pclientsite: COpaquePointer?, pstg: COpaquePointer?, ppvobj: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleCreateFromFile((rclsid?.value ?: 0L).toString(), (lpszfilename?.value ?: 0L).toString(), (riid?.value ?: 0L).toString(), renderopt.toInt(), (lpformatetc?.value ?: 0L).toString(), (pclientsite?.value ?: 0L).toString(), (pstg?.value ?: 0L).toString(), (ppvobj?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleCreateFromFileEx(rclsid: COpaquePointer?, lpszfilename: Pcwstr, riid: COpaquePointer?, dwflags: Olecreate, renderopt: UInt, cformats: UInt, rgadvf: COpaquePointer?, rgformatetc: COpaquePointer?, lpadvisesink: COpaquePointer?, rgdwconnection: COpaquePointer?, pclientsite: COpaquePointer?, pstg: COpaquePointer?, ppvobj: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleCreateFromFileEx((rclsid?.value ?: 0L).toString(), (lpszfilename?.value ?: 0L).toString(), (riid?.value ?: 0L).toString(), dwflags.toInt(), renderopt.toInt(), cformats.toInt(), (rgadvf?.value ?: 0L).toString(), (rgformatetc?.value ?: 0L).toString(), (lpadvisesink?.value ?: 0L).toString(), (rgdwconnection?.value ?: 0L).toString(), (pclientsite?.value ?: 0L).toString(), (pstg?.value ?: 0L).toString(), (ppvobj?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleCreateLink(pmklinksrc: COpaquePointer?, riid: COpaquePointer?, renderopt: UInt, lpformatetc: COpaquePointer?, pclientsite: COpaquePointer?, pstg: COpaquePointer?, ppvobj: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleCreateLink((pmklinksrc?.value ?: 0L).toString(), (riid?.value ?: 0L).toString(), renderopt.toInt(), (lpformatetc?.value ?: 0L).toString(), (pclientsite?.value ?: 0L).toString(), (pstg?.value ?: 0L).toString(), (ppvobj?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleCreateLinkEx(pmklinksrc: COpaquePointer?, riid: COpaquePointer?, dwflags: Olecreate, renderopt: UInt, cformats: UInt, rgadvf: COpaquePointer?, rgformatetc: COpaquePointer?, lpadvisesink: COpaquePointer?, rgdwconnection: COpaquePointer?, pclientsite: COpaquePointer?, pstg: COpaquePointer?, ppvobj: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleCreateLinkEx((pmklinksrc?.value ?: 0L).toString(), (riid?.value ?: 0L).toString(), dwflags.toInt(), renderopt.toInt(), cformats.toInt(), (rgadvf?.value ?: 0L).toString(), (rgformatetc?.value ?: 0L).toString(), (lpadvisesink?.value ?: 0L).toString(), (rgdwconnection?.value ?: 0L).toString(), (pclientsite?.value ?: 0L).toString(), (pstg?.value ?: 0L).toString(), (ppvobj?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleCreateLinkFromData(psrcdataobj: COpaquePointer?, riid: COpaquePointer?, renderopt: UInt, pformatetc: COpaquePointer?, pclientsite: COpaquePointer?, pstg: COpaquePointer?, ppvobj: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleCreateLinkFromData((psrcdataobj?.value ?: 0L).toString(), (riid?.value ?: 0L).toString(), renderopt.toInt(), (pformatetc?.value ?: 0L).toString(), (pclientsite?.value ?: 0L).toString(), (pstg?.value ?: 0L).toString(), (ppvobj?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleCreateLinkFromDataEx(psrcdataobj: COpaquePointer?, riid: COpaquePointer?, dwflags: Olecreate, renderopt: UInt, cformats: UInt, rgadvf: COpaquePointer?, rgformatetc: COpaquePointer?, lpadvisesink: COpaquePointer?, rgdwconnection: COpaquePointer?, pclientsite: COpaquePointer?, pstg: COpaquePointer?, ppvobj: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleCreateLinkFromDataEx((psrcdataobj?.value ?: 0L).toString(), (riid?.value ?: 0L).toString(), dwflags.toInt(), renderopt.toInt(), cformats.toInt(), (rgadvf?.value ?: 0L).toString(), (rgformatetc?.value ?: 0L).toString(), (lpadvisesink?.value ?: 0L).toString(), (rgdwconnection?.value ?: 0L).toString(), (pclientsite?.value ?: 0L).toString(), (pstg?.value ?: 0L).toString(), (ppvobj?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleCreateLinkToFile(lpszfilename: Pcwstr, riid: COpaquePointer?, renderopt: UInt, lpformatetc: COpaquePointer?, pclientsite: COpaquePointer?, pstg: COpaquePointer?, ppvobj: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleCreateLinkToFile((lpszfilename?.value ?: 0L).toString(), (riid?.value ?: 0L).toString(), renderopt.toInt(), (lpformatetc?.value ?: 0L).toString(), (pclientsite?.value ?: 0L).toString(), (pstg?.value ?: 0L).toString(), (ppvobj?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleCreateLinkToFileEx(lpszfilename: Pcwstr, riid: COpaquePointer?, dwflags: Olecreate, renderopt: UInt, cformats: UInt, rgadvf: COpaquePointer?, rgformatetc: COpaquePointer?, lpadvisesink: COpaquePointer?, rgdwconnection: COpaquePointer?, pclientsite: COpaquePointer?, pstg: COpaquePointer?, ppvobj: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleCreateLinkToFileEx((lpszfilename?.value ?: 0L).toString(), (riid?.value ?: 0L).toString(), dwflags.toInt(), renderopt.toInt(), cformats.toInt(), (rgadvf?.value ?: 0L).toString(), (rgformatetc?.value ?: 0L).toString(), (lpadvisesink?.value ?: 0L).toString(), (rgdwconnection?.value ?: 0L).toString(), (pclientsite?.value ?: 0L).toString(), (pstg?.value ?: 0L).toString(), (ppvobj?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleCreateMenuDescriptor(hmenucombined: Hmenu, lpmenuwidths: COpaquePointer?): Long =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleCreateMenuDescriptor((hmenucombined?.value ?: 0L).toString(), (lpmenuwidths?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleCreatePictureIndirect(lppictdesc: COpaquePointer?, riid: COpaquePointer?, fown: Bool, lplpvobj: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleCreatePictureIndirect((lppictdesc?.value ?: 0L).toString(), (riid?.value ?: 0L).toString(), fown, (lplpvobj?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleCreatePropertyFrame(hwndowner: Hwnd, x: UInt, y: UInt, lpszcaption: Pcwstr, cobjects: UInt, ppunk: COpaquePointer?, cpages: UInt, ppageclsid: COpaquePointer?, lcid: UInt, dwreserved: UInt, pvreserved: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleCreatePropertyFrame((hwndowner?.value ?: 0L).toString(), x.toInt(), y.toInt(), (lpszcaption?.value ?: 0L).toString(), cobjects.toInt(), (ppunk?.value ?: 0L).toString(), cpages.toInt(), (ppageclsid?.value ?: 0L).toString(), lcid.toInt(), dwreserved.toInt(), (pvreserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleCreatePropertyFrameIndirect(lpparams: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleCreatePropertyFrameIndirect((lpparams?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleCreateStaticFromData(psrcdataobj: COpaquePointer?, iid: COpaquePointer?, renderopt: UInt, pformatetc: COpaquePointer?, pclientsite: COpaquePointer?, pstg: COpaquePointer?, ppvobj: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleCreateStaticFromData((psrcdataobj?.value ?: 0L).toString(), (iid?.value ?: 0L).toString(), renderopt.toInt(), (pformatetc?.value ?: 0L).toString(), (pclientsite?.value ?: 0L).toString(), (pstg?.value ?: 0L).toString(), (ppvobj?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleDestroyMenuDescriptor(holemenu: Long): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleDestroyMenuDescriptor(holemenu.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleDoAutoConvert(pstg: COpaquePointer?, pclsidnew: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleDoAutoConvert((pstg?.value ?: 0L).toString(), (pclsidnew?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleDraw(punknown: COpaquePointer?, dwaspect: UInt, hdcdraw: Hdc, lprcbounds: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleDraw((punknown?.value ?: 0L).toString(), dwaspect.toInt(), (hdcdraw?.value ?: 0L).toString(), (lprcbounds?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleDuplicateData(hsrc: Handle, cfformat: ClipboardFormat, uiflags: GlobalAllocFlags): Handle =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleDuplicateData((hsrc?.value ?: 0L).toString(), cfformat.toInt(), uiflags.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleFlushClipboard(): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleFlushClipboard() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleGetAutoConvert(clsidold: COpaquePointer?, pclsidnew: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleGetAutoConvert((clsidold?.value ?: 0L).toString(), (pclsidnew?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleGetClipboard(ppdataobj: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleGetClipboard((ppdataobj?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleGetClipboardWithEnterpriseInfo(dataobject: COpaquePointer?, dataenterpriseid: COpaquePointer?, sourcedescription: COpaquePointer?, targetdescription: COpaquePointer?, datadescription: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleGetClipboardWithEnterpriseInfo((dataobject?.value ?: 0L).toString(), (dataenterpriseid?.value ?: 0L).toString(), (sourcedescription?.value ?: 0L).toString(), (targetdescription?.value ?: 0L).toString(), (datadescription?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleGetIconOfClass(rclsid: COpaquePointer?, lpszlabel: Pcwstr, fusetypeaslabel: Bool): Hglobal =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleGetIconOfClass((rclsid?.value ?: 0L).toString(), (lpszlabel?.value ?: 0L).toString(), fusetypeaslabel) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleGetIconOfFile(lpszpath: Pcwstr, fusefileaslabel: Bool): Hglobal =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleGetIconOfFile((lpszpath?.value ?: 0L).toString(), fusefileaslabel) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleIconToCursor(hinstexe: Hinstance, hicon: Hicon): Hcursor =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleIconToCursor((hinstexe?.value ?: 0L).toString(), (hicon?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleInitialize(pvreserved: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleInitialize((pvreserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleIsCurrentClipboard(pdataobj: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleIsCurrentClipboard((pdataobj?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleIsRunning(pobject: COpaquePointer?): Bool =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleIsRunning((pobject?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleLoad(pstg: COpaquePointer?, riid: COpaquePointer?, pclientsite: COpaquePointer?, ppvobj: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleLoad((pstg?.value ?: 0L).toString(), (riid?.value ?: 0L).toString(), (pclientsite?.value ?: 0L).toString(), (ppvobj?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleLoadFromStream(pstm: COpaquePointer?, iidinterface: COpaquePointer?, ppvobj: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleLoadFromStream((pstm?.value ?: 0L).toString(), (iidinterface?.value ?: 0L).toString(), (ppvobj?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleLoadPicture(lpstream: COpaquePointer?, lsize: Int, frunmode: Bool, riid: COpaquePointer?, lplpvobj: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleLoadPicture((lpstream?.value ?: 0L).toString(), lsize, frunmode, (riid?.value ?: 0L).toString(), (lplpvobj?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleLoadPictureEx(lpstream: COpaquePointer?, lsize: Int, frunmode: Bool, riid: COpaquePointer?, xsizedesired: UInt, ysizedesired: UInt, dwflags: LoadPictureFlags, lplpvobj: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleLoadPictureEx((lpstream?.value ?: 0L).toString(), lsize, frunmode, (riid?.value ?: 0L).toString(), xsizedesired.toInt(), ysizedesired.toInt(), dwflags.toInt(), (lplpvobj?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleLoadPictureFile(varfilename: Variant, lplpdisppicture: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleLoadPictureFileEx(varfilename: Variant, xsizedesired: UInt, ysizedesired: UInt, dwflags: LoadPictureFlags, lplpdisppicture: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleLoadPicturePath(szurlorpath: Pcwstr, punkcaller: COpaquePointer?, dwreserved: UInt, clrreserved: UInt, riid: COpaquePointer?, ppvret: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleLoadPicturePath((szurlorpath?.value ?: 0L).toString(), (punkcaller?.value ?: 0L).toString(), dwreserved.toInt(), clrreserved.toInt(), (riid?.value ?: 0L).toString(), (ppvret?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleLockRunning(punknown: COpaquePointer?, flock: Bool, flastunlockcloses: Bool): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleLockRunning((punknown?.value ?: 0L).toString(), flock, flastunlockcloses) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleMetafilePictFromIconAndLabel(hicon: Hicon, lpszlabel: Pcwstr, lpszsourcefile: Pcwstr, iiconindex: UInt): Hglobal =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleMetafilePictFromIconAndLabel((hicon?.value ?: 0L).toString(), (lpszlabel?.value ?: 0L).toString(), (lpszsourcefile?.value ?: 0L).toString(), iiconindex.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleNoteObjectVisible(punknown: COpaquePointer?, fvisible: Bool): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleNoteObjectVisible((punknown?.value ?: 0L).toString(), fvisible) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleQueryCreateFromData(psrcdataobject: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleQueryCreateFromData((psrcdataobject?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleQueryLinkFromData(psrcdataobject: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleQueryLinkFromData((psrcdataobject?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleRegEnumFormatEtc(clsid: COpaquePointer?, dwdirection: UInt, ppenum: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleRegEnumFormatEtc((clsid?.value ?: 0L).toString(), dwdirection.toInt(), (ppenum?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleRegEnumVerbs(clsid: COpaquePointer?, ppenum: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleRegEnumVerbs((clsid?.value ?: 0L).toString(), (ppenum?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleRegGetMiscStatus(clsid: COpaquePointer?, dwaspect: UInt, pdwstatus: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleRegGetMiscStatus((clsid?.value ?: 0L).toString(), dwaspect.toInt(), (pdwstatus?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleRegGetUserType(clsid: COpaquePointer?, dwformoftype: UInt, pszusertype: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleRegGetUserType((clsid?.value ?: 0L).toString(), dwformoftype.toInt(), (pszusertype?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleRun(punknown: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleRun((punknown?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleSave(pps: COpaquePointer?, pstg: COpaquePointer?, fsameasload: Bool): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleSave((pps?.value ?: 0L).toString(), (pstg?.value ?: 0L).toString(), fsameasload) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleSavePictureFile(lpdisppicture: COpaquePointer?, bstrfilename: Bstr): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleSavePictureFile((lpdisppicture?.value ?: 0L).toString(), (bstrfilename?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleSaveToStream(ppstm: COpaquePointer?, pstm: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleSaveToStream((ppstm?.value ?: 0L).toString(), (pstm?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleSetAutoConvert(clsidold: COpaquePointer?, clsidnew: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleSetAutoConvert((clsidold?.value ?: 0L).toString(), (clsidnew?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleSetClipboard(pdataobj: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleSetClipboard((pdataobj?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleSetContainedObject(punknown: COpaquePointer?, fcontained: Bool): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleSetContainedObject((punknown?.value ?: 0L).toString(), fcontained) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleSetMenuDescriptor(holemenu: Long, hwndframe: Hwnd, hwndactiveobject: Hwnd, lpframe: COpaquePointer?, lpactiveobj: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleSetMenuDescriptor(holemenu.toString(), (hwndframe?.value ?: 0L).toString(), (hwndactiveobject?.value ?: 0L).toString(), (lpframe?.value ?: 0L).toString(), (lpactiveobj?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleTranslateAccelerator(lpframe: COpaquePointer?, lpframeinfo: COpaquePointer?, lpmsg: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleTranslateAccelerator((lpframe?.value ?: 0L).toString(), (lpframeinfo?.value ?: 0L).toString(), (lpmsg?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleTranslateColor(clr: UInt, hpal: Hpalette, lpcolorref: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleTranslateColor(clr.toInt(), (hpal?.value ?: 0L).toString(), (lpcolorref?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleUIAddVerbMenuA(lpoleobj: COpaquePointer?, lpszshorttype: Pcstr, hmenu: Hmenu, upos: UInt, uidverbmin: UInt, uidverbmax: UInt, baddconvert: Bool, idconvert: UInt, lphmenu: COpaquePointer?): Bool =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleUIAddVerbMenuA((lpoleobj?.value ?: 0L).toString(), (lpszshorttype?.value ?: 0L).toString(), (hmenu?.value ?: 0L).toString(), upos.toInt(), uidverbmin.toInt(), uidverbmax.toInt(), baddconvert, idconvert.toInt(), (lphmenu?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleUIAddVerbMenuW(lpoleobj: COpaquePointer?, lpszshorttype: Pcwstr, hmenu: Hmenu, upos: UInt, uidverbmin: UInt, uidverbmax: UInt, baddconvert: Bool, idconvert: UInt, lphmenu: COpaquePointer?): Bool =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleUIAddVerbMenuW((lpoleobj?.value ?: 0L).toString(), (lpszshorttype?.value ?: 0L).toString(), (hmenu?.value ?: 0L).toString(), upos.toInt(), uidverbmin.toInt(), uidverbmax.toInt(), baddconvert, idconvert.toInt(), (lphmenu?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleUIBusyA(param0: COpaquePointer?): UInt =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleUIBusyA((param0?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleUIBusyW(param0: COpaquePointer?): UInt =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleUIBusyW((param0?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleUICanConvertOrActivateAs(rclsid: COpaquePointer?, fislinkedobject: Bool, wformat: UShort): Bool =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleUICanConvertOrActivateAs((rclsid?.value ?: 0L).toString(), fislinkedobject, wformat.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleUIChangeIconA(param0: COpaquePointer?): UInt =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleUIChangeIconA((param0?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleUIChangeIconW(param0: COpaquePointer?): UInt =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleUIChangeIconW((param0?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleUIChangeSourceA(param0: COpaquePointer?): UInt =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleUIChangeSourceA((param0?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleUIChangeSourceW(param0: COpaquePointer?): UInt =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleUIChangeSourceW((param0?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleUIConvertA(param0: COpaquePointer?): UInt =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleUIConvertA((param0?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleUIConvertW(param0: COpaquePointer?): UInt =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleUIConvertW((param0?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleUIEditLinksA(param0: COpaquePointer?): UInt =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleUIEditLinksA((param0?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleUIEditLinksW(param0: COpaquePointer?): UInt =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleUIEditLinksW((param0?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleUIInsertObjectA(param0: COpaquePointer?): UInt =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleUIInsertObjectA((param0?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleUIInsertObjectW(param0: COpaquePointer?): UInt =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleUIInsertObjectW((param0?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleUIObjectPropertiesA(param0: COpaquePointer?): UInt =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleUIObjectPropertiesA((param0?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleUIObjectPropertiesW(param0: COpaquePointer?): UInt =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleUIObjectPropertiesW((param0?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleUIPasteSpecialA(param0: COpaquePointer?): UInt =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleUIPasteSpecialA((param0?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleUIPasteSpecialW(param0: COpaquePointer?): UInt =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleUIPasteSpecialW((param0?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleUIPromptUserA(ntemplate: Int, hwndparent: Hwnd, vararg variadicArgs: Long): Int =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleUIPromptUserA(ntemplate, (hwndparent?.value ?: 0L).toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleUIPromptUserW(ntemplate: Int, hwndparent: Hwnd, vararg variadicArgs: Long): Int =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleUIPromptUserW(ntemplate, (hwndparent?.value ?: 0L).toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleUIUpdateLinksA(lpoleuilinkcntr: COpaquePointer?, hwndparent: Hwnd, lpsztitle: Pcstr, clinks: Int): Bool =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleUIUpdateLinksA((lpoleuilinkcntr?.value ?: 0L).toString(), (hwndparent?.value ?: 0L).toString(), (lpsztitle?.value ?: 0L).toString(), clinks) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleUIUpdateLinksW(lpoleuilinkcntr: COpaquePointer?, hwndparent: Hwnd, lpsztitle: Pcwstr, clinks: Int): Bool =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleUIUpdateLinksW((lpoleuilinkcntr?.value ?: 0L).toString(), (hwndparent?.value ?: 0L).toString(), (lpsztitle?.value ?: 0L).toString(), clinks) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleUninitialize() {
    if (_windowsWin32SystemOleNapiAddon != null) {
        _windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_oleUninitialize()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun queryPathOfRegTypeLib(guid: COpaquePointer?, wmaj: UShort, wmin: UShort, lcid: UInt, lpbstrpathname: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_queryPathOfRegTypeLib((guid?.value ?: 0L).toString(), wmaj.toInt(), wmin.toInt(), lcid.toInt(), (lpbstrpathname?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerActiveObject(punk: COpaquePointer?, rclsid: COpaquePointer?, dwflags: ActiveobjectFlags, pdwregister: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_registerActiveObject((punk?.value ?: 0L).toString(), (rclsid?.value ?: 0L).toString(), dwflags.toInt(), (pdwregister?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerDragDrop(hwnd: Hwnd, pdroptarget: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_registerDragDrop((hwnd?.value ?: 0L).toString(), (pdroptarget?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerTypeLib(ptlib: COpaquePointer?, szfullpath: Pcwstr, szhelpdir: Pcwstr): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_registerTypeLib((ptlib?.value ?: 0L).toString(), (szfullpath?.value ?: 0L).toString(), (szhelpdir?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerTypeLibForUser(ptlib: COpaquePointer?, szfullpath: Pcwstr, szhelpdir: Pcwstr): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_registerTypeLibForUser((ptlib?.value ?: 0L).toString(), (szfullpath?.value ?: 0L).toString(), (szhelpdir?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun releaseStgMedium(param0: COpaquePointer?) {
    if (_windowsWin32SystemOleNapiAddon != null) {
        _windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_releaseStgMedium((param0?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun revokeActiveObject(dwregister: UInt, pvreserved: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_revokeActiveObject(dwregister.toInt(), (pvreserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun revokeDragDrop(hwnd: Hwnd): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_revokeDragDrop((hwnd?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun safeArrayAccessData(psa: COpaquePointer?, ppvdata: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_safeArrayAccessData((psa?.value ?: 0L).toString(), (ppvdata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun safeArrayAddRef(psa: COpaquePointer?, ppdatatorelease: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_safeArrayAddRef((psa?.value ?: 0L).toString(), (ppdatatorelease?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun safeArrayAllocData(psa: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_safeArrayAllocData((psa?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun safeArrayAllocDescriptor(cdims: UInt, ppsaout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_safeArrayAllocDescriptor(cdims.toInt(), (ppsaout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun safeArrayAllocDescriptorEx(vt: Varenum, cdims: UInt, ppsaout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_safeArrayAllocDescriptorEx(vt.toInt(), cdims.toInt(), (ppsaout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun safeArrayCopy(psa: COpaquePointer?, ppsaout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_safeArrayCopy((psa?.value ?: 0L).toString(), (ppsaout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun safeArrayCopyData(psasource: COpaquePointer?, psatarget: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_safeArrayCopyData((psasource?.value ?: 0L).toString(), (psatarget?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun safeArrayCreate(vt: Varenum, cdims: UInt, rgsabound: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_safeArrayCreate(vt.toInt(), cdims.toInt(), (rgsabound?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun safeArrayCreateEx(vt: Varenum, cdims: UInt, rgsabound: COpaquePointer?, pvextra: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_safeArrayCreateEx(vt.toInt(), cdims.toInt(), (rgsabound?.value ?: 0L).toString(), (pvextra?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun safeArrayCreateVector(vt: Varenum, llbound: Int, celements: UInt): COpaquePointer? =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_safeArrayCreateVector(vt.toInt(), llbound, celements.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun safeArrayCreateVectorEx(vt: Varenum, llbound: Int, celements: UInt, pvextra: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_safeArrayCreateVectorEx(vt.toInt(), llbound, celements.toInt(), (pvextra?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun safeArrayDestroy(psa: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_safeArrayDestroy((psa?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun safeArrayDestroyData(psa: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_safeArrayDestroyData((psa?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun safeArrayDestroyDescriptor(psa: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_safeArrayDestroyDescriptor((psa?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun safeArrayGetDim(psa: COpaquePointer?): UInt =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_safeArrayGetDim((psa?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun safeArrayGetElement(psa: COpaquePointer?, rgindices: COpaquePointer?, pv: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_safeArrayGetElement((psa?.value ?: 0L).toString(), (rgindices?.value ?: 0L).toString(), (pv?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun safeArrayGetElemsize(psa: COpaquePointer?): UInt =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_safeArrayGetElemsize((psa?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun safeArrayGetIID(psa: COpaquePointer?, pguid: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_safeArrayGetIID((psa?.value ?: 0L).toString(), (pguid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun safeArrayGetLBound(psa: COpaquePointer?, ndim: UInt, pllbound: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_safeArrayGetLBound((psa?.value ?: 0L).toString(), ndim.toInt(), (pllbound?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun safeArrayGetRecordInfo(psa: COpaquePointer?, prinfo: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_safeArrayGetRecordInfo((psa?.value ?: 0L).toString(), (prinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun safeArrayGetUBound(psa: COpaquePointer?, ndim: UInt, plubound: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_safeArrayGetUBound((psa?.value ?: 0L).toString(), ndim.toInt(), (plubound?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun safeArrayGetVartype(psa: COpaquePointer?, pvt: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_safeArrayGetVartype((psa?.value ?: 0L).toString(), (pvt?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun safeArrayLock(psa: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_safeArrayLock((psa?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun safeArrayPtrOfIndex(psa: COpaquePointer?, rgindices: COpaquePointer?, ppvdata: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_safeArrayPtrOfIndex((psa?.value ?: 0L).toString(), (rgindices?.value ?: 0L).toString(), (ppvdata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun safeArrayPutElement(psa: COpaquePointer?, rgindices: COpaquePointer?, pv: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_safeArrayPutElement((psa?.value ?: 0L).toString(), (rgindices?.value ?: 0L).toString(), (pv?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun safeArrayRedim(psa: COpaquePointer?, psaboundnew: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_safeArrayRedim((psa?.value ?: 0L).toString(), (psaboundnew?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun safeArrayReleaseData(pdata: COpaquePointer?) {
    if (_windowsWin32SystemOleNapiAddon != null) {
        _windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_safeArrayReleaseData((pdata?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun safeArrayReleaseDescriptor(psa: COpaquePointer?) {
    if (_windowsWin32SystemOleNapiAddon != null) {
        _windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_safeArrayReleaseDescriptor((psa?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun safeArraySetIID(psa: COpaquePointer?, guid: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_safeArraySetIID((psa?.value ?: 0L).toString(), (guid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun safeArraySetRecordInfo(psa: COpaquePointer?, prinfo: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_safeArraySetRecordInfo((psa?.value ?: 0L).toString(), (prinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun safeArrayUnaccessData(psa: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_safeArrayUnaccessData((psa?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun safeArrayUnlock(psa: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_safeArrayUnlock((psa?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unRegisterTypeLib(libid: COpaquePointer?, wvermajor: UShort, wverminor: UShort, lcid: UInt, syskind: Syskind): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_unRegisterTypeLib((libid?.value ?: 0L).toString(), wvermajor.toInt(), wverminor.toInt(), lcid.toInt(), syskind) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unRegisterTypeLibForUser(libid: COpaquePointer?, wmajorvernum: UShort, wminorvernum: UShort, lcid: UInt, syskind: Syskind): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_unRegisterTypeLibForUser((libid?.value ?: 0L).toString(), wmajorvernum.toInt(), wminorvernum.toInt(), lcid.toInt(), syskind) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varAbs(pvarin: COpaquePointer?, pvarresult: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varAbs((pvarin?.value ?: 0L).toString(), (pvarresult?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varAdd(pvarleft: COpaquePointer?, pvarright: COpaquePointer?, pvarresult: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varAdd((pvarleft?.value ?: 0L).toString(), (pvarright?.value ?: 0L).toString(), (pvarresult?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varAnd(pvarleft: COpaquePointer?, pvarright: COpaquePointer?, pvarresult: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varAnd((pvarleft?.value ?: 0L).toString(), (pvarright?.value ?: 0L).toString(), (pvarresult?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varBoolFromCy(cyin: CY, pboolout: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varBoolFromDate(datein: Double, pboolout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varBoolFromDate(datein, (pboolout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varBoolFromDec(pdecin: COpaquePointer?, pboolout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varBoolFromDec((pdecin?.value ?: 0L).toString(), (pboolout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varBoolFromDisp(pdispin: COpaquePointer?, lcid: UInt, pboolout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varBoolFromDisp((pdispin?.value ?: 0L).toString(), lcid.toInt(), (pboolout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varBoolFromI1(cin: Byte, pboolout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varBoolFromI1(cin.toInt(), (pboolout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varBoolFromI2(sin: Short, pboolout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varBoolFromI2(sin.toInt(), (pboolout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varBoolFromI4(lin: Int, pboolout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varBoolFromI4(lin, (pboolout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varBoolFromI8(i64in: Long, pboolout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varBoolFromI8(i64in.toString(), (pboolout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varBoolFromR4(fltin: Float, pboolout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varBoolFromR4(fltin.toDouble(), (pboolout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varBoolFromR8(dblin: Double, pboolout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varBoolFromR8(dblin, (pboolout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varBoolFromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pboolout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varBoolFromStr((strin?.value ?: 0L).toString(), lcid.toInt(), dwflags.toInt(), (pboolout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varBoolFromUI1(bin: UByte, pboolout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varBoolFromUI1(bin.toInt(), (pboolout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varBoolFromUI2(uiin: UShort, pboolout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varBoolFromUI2(uiin.toInt(), (pboolout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varBoolFromUI4(ulin: UInt, pboolout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varBoolFromUI4(ulin.toInt(), (pboolout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varBoolFromUI8(i64in: ULong, pboolout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varBoolFromUI8(i64in.toString(), (pboolout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varBstrCat(bstrleft: Bstr, bstrright: Bstr, pbstrresult: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varBstrCat((bstrleft?.value ?: 0L).toString(), (bstrright?.value ?: 0L).toString(), (pbstrresult?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varBstrCmp(bstrleft: Bstr, bstrright: Bstr, lcid: UInt, dwflags: UInt): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varBstrCmp((bstrleft?.value ?: 0L).toString(), (bstrright?.value ?: 0L).toString(), lcid.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varBstrFromBool(boolin: VariantBool, lcid: UInt, dwflags: UInt, pbstrout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varBstrFromBool(boolin.toInt(), lcid.toInt(), dwflags.toInt(), (pbstrout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varBstrFromCy(cyin: CY, lcid: UInt, dwflags: UInt, pbstrout: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varBstrFromDate(datein: Double, lcid: UInt, dwflags: UInt, pbstrout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varBstrFromDate(datein, lcid.toInt(), dwflags.toInt(), (pbstrout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varBstrFromDec(pdecin: COpaquePointer?, lcid: UInt, dwflags: UInt, pbstrout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varBstrFromDec((pdecin?.value ?: 0L).toString(), lcid.toInt(), dwflags.toInt(), (pbstrout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varBstrFromDisp(pdispin: COpaquePointer?, lcid: UInt, dwflags: UInt, pbstrout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varBstrFromDisp((pdispin?.value ?: 0L).toString(), lcid.toInt(), dwflags.toInt(), (pbstrout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varBstrFromI1(cin: Byte, lcid: UInt, dwflags: UInt, pbstrout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varBstrFromI1(cin.toInt(), lcid.toInt(), dwflags.toInt(), (pbstrout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varBstrFromI2(ival: Short, lcid: UInt, dwflags: UInt, pbstrout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varBstrFromI2(ival.toInt(), lcid.toInt(), dwflags.toInt(), (pbstrout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varBstrFromI4(lin: Int, lcid: UInt, dwflags: UInt, pbstrout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varBstrFromI4(lin, lcid.toInt(), dwflags.toInt(), (pbstrout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varBstrFromI8(i64in: Long, lcid: UInt, dwflags: UInt, pbstrout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varBstrFromI8(i64in.toString(), lcid.toInt(), dwflags.toInt(), (pbstrout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varBstrFromR4(fltin: Float, lcid: UInt, dwflags: UInt, pbstrout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varBstrFromR4(fltin.toDouble(), lcid.toInt(), dwflags.toInt(), (pbstrout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varBstrFromR8(dblin: Double, lcid: UInt, dwflags: UInt, pbstrout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varBstrFromR8(dblin, lcid.toInt(), dwflags.toInt(), (pbstrout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varBstrFromUI1(bval: UByte, lcid: UInt, dwflags: UInt, pbstrout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varBstrFromUI1(bval.toInt(), lcid.toInt(), dwflags.toInt(), (pbstrout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varBstrFromUI2(uiin: UShort, lcid: UInt, dwflags: UInt, pbstrout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varBstrFromUI2(uiin.toInt(), lcid.toInt(), dwflags.toInt(), (pbstrout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varBstrFromUI4(ulin: UInt, lcid: UInt, dwflags: UInt, pbstrout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varBstrFromUI4(ulin.toInt(), lcid.toInt(), dwflags.toInt(), (pbstrout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varBstrFromUI8(ui64in: ULong, lcid: UInt, dwflags: UInt, pbstrout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varBstrFromUI8(ui64in.toString(), lcid.toInt(), dwflags.toInt(), (pbstrout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varCat(pvarleft: COpaquePointer?, pvarright: COpaquePointer?, pvarresult: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varCat((pvarleft?.value ?: 0L).toString(), (pvarright?.value ?: 0L).toString(), (pvarresult?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varCmp(pvarleft: COpaquePointer?, pvarright: COpaquePointer?, lcid: UInt, dwflags: UInt): Varcmp =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varCmp((pvarleft?.value ?: 0L).toString(), (pvarright?.value ?: 0L).toString(), lcid.toInt(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varCyAbs(cyin: CY, pcyresult: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varCyAdd(cyleft: CY, cyright: CY, pcyresult: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varCyCmp(cyleft: CY, cyright: CY): Varcmp =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varCyCmpR8(cyleft: CY, dblright: Double): Varcmp =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varCyFix(cyin: CY, pcyresult: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varCyFromBool(boolin: VariantBool, pcyout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varCyFromBool(boolin.toInt(), (pcyout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varCyFromDate(datein: Double, pcyout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varCyFromDate(datein, (pcyout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varCyFromDec(pdecin: COpaquePointer?, pcyout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varCyFromDec((pdecin?.value ?: 0L).toString(), (pcyout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varCyFromDisp(pdispin: COpaquePointer?, lcid: UInt, pcyout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varCyFromDisp((pdispin?.value ?: 0L).toString(), lcid.toInt(), (pcyout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varCyFromI1(cin: Byte, pcyout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varCyFromI1(cin.toInt(), (pcyout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varCyFromI2(sin: Short, pcyout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varCyFromI2(sin.toInt(), (pcyout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varCyFromI4(lin: Int, pcyout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varCyFromI4(lin, (pcyout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varCyFromI8(i64in: Long, pcyout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varCyFromI8(i64in.toString(), (pcyout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varCyFromR4(fltin: Float, pcyout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varCyFromR4(fltin.toDouble(), (pcyout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varCyFromR8(dblin: Double, pcyout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varCyFromR8(dblin, (pcyout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varCyFromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pcyout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varCyFromStr((strin?.value ?: 0L).toString(), lcid.toInt(), dwflags.toInt(), (pcyout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varCyFromUI1(bin: UByte, pcyout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varCyFromUI1(bin.toInt(), (pcyout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varCyFromUI2(uiin: UShort, pcyout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varCyFromUI2(uiin.toInt(), (pcyout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varCyFromUI4(ulin: UInt, pcyout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varCyFromUI4(ulin.toInt(), (pcyout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varCyFromUI8(ui64in: ULong, pcyout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varCyFromUI8(ui64in.toString(), (pcyout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varCyInt(cyin: CY, pcyresult: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varCyMul(cyleft: CY, cyright: CY, pcyresult: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varCyMulI4(cyleft: CY, lright: Int, pcyresult: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varCyMulI8(cyleft: CY, lright: Long, pcyresult: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varCyNeg(cyin: CY, pcyresult: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varCyRound(cyin: CY, cdecimals: Int, pcyresult: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varCySub(cyleft: CY, cyright: CY, pcyresult: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDateFromBool(boolin: VariantBool, pdateout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varDateFromBool(boolin.toInt(), (pdateout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDateFromCy(cyin: CY, pdateout: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDateFromDec(pdecin: COpaquePointer?, pdateout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varDateFromDec((pdecin?.value ?: 0L).toString(), (pdateout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDateFromDisp(pdispin: COpaquePointer?, lcid: UInt, pdateout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varDateFromDisp((pdispin?.value ?: 0L).toString(), lcid.toInt(), (pdateout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDateFromI1(cin: Byte, pdateout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varDateFromI1(cin.toInt(), (pdateout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDateFromI2(sin: Short, pdateout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varDateFromI2(sin.toInt(), (pdateout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDateFromI4(lin: Int, pdateout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varDateFromI4(lin, (pdateout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDateFromI8(i64in: Long, pdateout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varDateFromI8(i64in.toString(), (pdateout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDateFromR4(fltin: Float, pdateout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varDateFromR4(fltin.toDouble(), (pdateout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDateFromR8(dblin: Double, pdateout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varDateFromR8(dblin, (pdateout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDateFromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pdateout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varDateFromStr((strin?.value ?: 0L).toString(), lcid.toInt(), dwflags.toInt(), (pdateout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDateFromUI1(bin: UByte, pdateout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varDateFromUI1(bin.toInt(), (pdateout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDateFromUI2(uiin: UShort, pdateout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varDateFromUI2(uiin.toInt(), (pdateout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDateFromUI4(ulin: UInt, pdateout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varDateFromUI4(ulin.toInt(), (pdateout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDateFromUI8(ui64in: ULong, pdateout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varDateFromUI8(ui64in.toString(), (pdateout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDateFromUdate(pudatein: COpaquePointer?, dwflags: UInt, pdateout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varDateFromUdate((pudatein?.value ?: 0L).toString(), dwflags.toInt(), (pdateout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDateFromUdateEx(pudatein: COpaquePointer?, lcid: UInt, dwflags: UInt, pdateout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varDateFromUdateEx((pudatein?.value ?: 0L).toString(), lcid.toInt(), dwflags.toInt(), (pdateout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDecAbs(pdecin: COpaquePointer?, pdecresult: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varDecAbs((pdecin?.value ?: 0L).toString(), (pdecresult?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDecAdd(pdecleft: COpaquePointer?, pdecright: COpaquePointer?, pdecresult: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varDecAdd((pdecleft?.value ?: 0L).toString(), (pdecright?.value ?: 0L).toString(), (pdecresult?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDecCmp(pdecleft: COpaquePointer?, pdecright: COpaquePointer?): Varcmp =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varDecCmp((pdecleft?.value ?: 0L).toString(), (pdecright?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDecCmpR8(pdecleft: COpaquePointer?, dblright: Double): Varcmp =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varDecCmpR8((pdecleft?.value ?: 0L).toString(), dblright) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDecDiv(pdecleft: COpaquePointer?, pdecright: COpaquePointer?, pdecresult: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varDecDiv((pdecleft?.value ?: 0L).toString(), (pdecright?.value ?: 0L).toString(), (pdecresult?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDecFix(pdecin: COpaquePointer?, pdecresult: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varDecFix((pdecin?.value ?: 0L).toString(), (pdecresult?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDecFromBool(boolin: VariantBool, pdecout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varDecFromBool(boolin.toInt(), (pdecout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDecFromCy(cyin: CY, pdecout: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDecFromDate(datein: Double, pdecout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varDecFromDate(datein, (pdecout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDecFromDisp(pdispin: COpaquePointer?, lcid: UInt, pdecout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varDecFromDisp((pdispin?.value ?: 0L).toString(), lcid.toInt(), (pdecout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDecFromI1(cin: Byte, pdecout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varDecFromI1(cin.toInt(), (pdecout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDecFromI2(uiin: Short, pdecout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varDecFromI2(uiin.toInt(), (pdecout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDecFromI4(lin: Int, pdecout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varDecFromI4(lin, (pdecout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDecFromI8(i64in: Long, pdecout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varDecFromI8(i64in.toString(), (pdecout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDecFromR4(fltin: Float, pdecout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varDecFromR4(fltin.toDouble(), (pdecout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDecFromR8(dblin: Double, pdecout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varDecFromR8(dblin, (pdecout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDecFromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pdecout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varDecFromStr((strin?.value ?: 0L).toString(), lcid.toInt(), dwflags.toInt(), (pdecout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDecFromUI1(bin: UByte, pdecout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varDecFromUI1(bin.toInt(), (pdecout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDecFromUI2(uiin: UShort, pdecout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varDecFromUI2(uiin.toInt(), (pdecout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDecFromUI4(ulin: UInt, pdecout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varDecFromUI4(ulin.toInt(), (pdecout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDecFromUI8(ui64in: ULong, pdecout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varDecFromUI8(ui64in.toString(), (pdecout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDecInt(pdecin: COpaquePointer?, pdecresult: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varDecInt((pdecin?.value ?: 0L).toString(), (pdecresult?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDecMul(pdecleft: COpaquePointer?, pdecright: COpaquePointer?, pdecresult: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varDecMul((pdecleft?.value ?: 0L).toString(), (pdecright?.value ?: 0L).toString(), (pdecresult?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDecNeg(pdecin: COpaquePointer?, pdecresult: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varDecNeg((pdecin?.value ?: 0L).toString(), (pdecresult?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDecRound(pdecin: COpaquePointer?, cdecimals: Int, pdecresult: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varDecRound((pdecin?.value ?: 0L).toString(), cdecimals, (pdecresult?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDecSub(pdecleft: COpaquePointer?, pdecright: COpaquePointer?, pdecresult: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varDecSub((pdecleft?.value ?: 0L).toString(), (pdecright?.value ?: 0L).toString(), (pdecresult?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varDiv(pvarleft: COpaquePointer?, pvarright: COpaquePointer?, pvarresult: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varDiv((pvarleft?.value ?: 0L).toString(), (pvarright?.value ?: 0L).toString(), (pvarresult?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varEqv(pvarleft: COpaquePointer?, pvarright: COpaquePointer?, pvarresult: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varEqv((pvarleft?.value ?: 0L).toString(), (pvarright?.value ?: 0L).toString(), (pvarresult?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varFix(pvarin: COpaquePointer?, pvarresult: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varFix((pvarin?.value ?: 0L).toString(), (pvarresult?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varFormat(pvarin: COpaquePointer?, pstrformat: Pcwstr, ifirstday: VarformatFirstDay, ifirstweek: VarformatFirstWeek, dwflags: UInt, pbstrout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varFormat((pvarin?.value ?: 0L).toString(), (pstrformat?.value ?: 0L).toString(), ifirstday, ifirstweek, dwflags.toInt(), (pbstrout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varFormatCurrency(pvarin: COpaquePointer?, inumdig: Int, iinclead: Int, iuseparens: Int, igroup: Int, dwflags: UInt, pbstrout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varFormatCurrency((pvarin?.value ?: 0L).toString(), inumdig, iinclead, iuseparens, igroup, dwflags.toInt(), (pbstrout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varFormatDateTime(pvarin: COpaquePointer?, inamedformat: VarformatNamedFormat, dwflags: UInt, pbstrout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varFormatDateTime((pvarin?.value ?: 0L).toString(), inamedformat, dwflags.toInt(), (pbstrout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varFormatFromTokens(pvarin: COpaquePointer?, pstrformat: Pcwstr, pbtokcur: COpaquePointer?, dwflags: UInt, pbstrout: COpaquePointer?, lcid: UInt): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varFormatFromTokens((pvarin?.value ?: 0L).toString(), (pstrformat?.value ?: 0L).toString(), (pbtokcur?.value ?: 0L).toString(), dwflags.toInt(), (pbstrout?.value ?: 0L).toString(), lcid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varFormatNumber(pvarin: COpaquePointer?, inumdig: Int, iinclead: VarformatLeadingDigit, iuseparens: VarformatParentheses, igroup: VarformatGroup, dwflags: UInt, pbstrout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varFormatNumber((pvarin?.value ?: 0L).toString(), inumdig, iinclead, iuseparens, igroup, dwflags.toInt(), (pbstrout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varFormatPercent(pvarin: COpaquePointer?, inumdig: Int, iinclead: VarformatLeadingDigit, iuseparens: VarformatParentheses, igroup: VarformatGroup, dwflags: UInt, pbstrout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varFormatPercent((pvarin?.value ?: 0L).toString(), inumdig, iinclead, iuseparens, igroup, dwflags.toInt(), (pbstrout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI1FromBool(boolin: VariantBool, pcout: Pstr): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varI1FromBool(boolin.toInt(), (pcout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI1FromCy(cyin: CY, pcout: Pstr): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI1FromDate(datein: Double, pcout: Pstr): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varI1FromDate(datein, (pcout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI1FromDec(pdecin: COpaquePointer?, pcout: Pstr): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varI1FromDec((pdecin?.value ?: 0L).toString(), (pcout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI1FromDisp(pdispin: COpaquePointer?, lcid: UInt, pcout: Pstr): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varI1FromDisp((pdispin?.value ?: 0L).toString(), lcid.toInt(), (pcout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI1FromI2(uiin: Short, pcout: Pstr): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varI1FromI2(uiin.toInt(), (pcout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI1FromI4(lin: Int, pcout: Pstr): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varI1FromI4(lin, (pcout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI1FromI8(i64in: Long, pcout: Pstr): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varI1FromI8(i64in.toString(), (pcout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI1FromR4(fltin: Float, pcout: Pstr): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varI1FromR4(fltin.toDouble(), (pcout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI1FromR8(dblin: Double, pcout: Pstr): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varI1FromR8(dblin, (pcout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI1FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pcout: Pstr): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varI1FromStr((strin?.value ?: 0L).toString(), lcid.toInt(), dwflags.toInt(), (pcout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI1FromUI1(bin: UByte, pcout: Pstr): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varI1FromUI1(bin.toInt(), (pcout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI1FromUI2(uiin: UShort, pcout: Pstr): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varI1FromUI2(uiin.toInt(), (pcout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI1FromUI4(ulin: UInt, pcout: Pstr): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varI1FromUI4(ulin.toInt(), (pcout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI1FromUI8(i64in: ULong, pcout: Pstr): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varI1FromUI8(i64in.toString(), (pcout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI2FromBool(boolin: VariantBool, psout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varI2FromBool(boolin.toInt(), (psout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI2FromCy(cyin: CY, psout: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI2FromDate(datein: Double, psout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varI2FromDate(datein, (psout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI2FromDec(pdecin: COpaquePointer?, psout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varI2FromDec((pdecin?.value ?: 0L).toString(), (psout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI2FromDisp(pdispin: COpaquePointer?, lcid: UInt, psout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varI2FromDisp((pdispin?.value ?: 0L).toString(), lcid.toInt(), (psout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI2FromI1(cin: Byte, psout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varI2FromI1(cin.toInt(), (psout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI2FromI4(lin: Int, psout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varI2FromI4(lin, (psout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI2FromI8(i64in: Long, psout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varI2FromI8(i64in.toString(), (psout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI2FromR4(fltin: Float, psout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varI2FromR4(fltin.toDouble(), (psout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI2FromR8(dblin: Double, psout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varI2FromR8(dblin, (psout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI2FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, psout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varI2FromStr((strin?.value ?: 0L).toString(), lcid.toInt(), dwflags.toInt(), (psout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI2FromUI1(bin: UByte, psout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varI2FromUI1(bin.toInt(), (psout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI2FromUI2(uiin: UShort, psout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varI2FromUI2(uiin.toInt(), (psout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI2FromUI4(ulin: UInt, psout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varI2FromUI4(ulin.toInt(), (psout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI2FromUI8(ui64in: ULong, psout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varI2FromUI8(ui64in.toString(), (psout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI4FromBool(boolin: VariantBool, plout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varI4FromBool(boolin.toInt(), (plout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI4FromCy(cyin: CY, plout: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI4FromDate(datein: Double, plout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varI4FromDate(datein, (plout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI4FromDec(pdecin: COpaquePointer?, plout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varI4FromDec((pdecin?.value ?: 0L).toString(), (plout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI4FromDisp(pdispin: COpaquePointer?, lcid: UInt, plout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varI4FromDisp((pdispin?.value ?: 0L).toString(), lcid.toInt(), (plout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI4FromI1(cin: Byte, plout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varI4FromI1(cin.toInt(), (plout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI4FromI2(sin: Short, plout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varI4FromI2(sin.toInt(), (plout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI4FromI8(i64in: Long, plout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varI4FromI8(i64in.toString(), (plout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI4FromR4(fltin: Float, plout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varI4FromR4(fltin.toDouble(), (plout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI4FromR8(dblin: Double, plout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varI4FromR8(dblin, (plout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI4FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, plout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varI4FromStr((strin?.value ?: 0L).toString(), lcid.toInt(), dwflags.toInt(), (plout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI4FromUI1(bin: UByte, plout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varI4FromUI1(bin.toInt(), (plout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI4FromUI2(uiin: UShort, plout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varI4FromUI2(uiin.toInt(), (plout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI4FromUI4(ulin: UInt, plout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varI4FromUI4(ulin.toInt(), (plout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI4FromUI8(ui64in: ULong, plout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varI4FromUI8(ui64in.toString(), (plout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI8FromBool(boolin: VariantBool, pi64out: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varI8FromBool(boolin.toInt(), (pi64out?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI8FromCy(cyin: CY, pi64out: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI8FromDate(datein: Double, pi64out: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varI8FromDate(datein, (pi64out?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI8FromDec(pdecin: COpaquePointer?, pi64out: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varI8FromDec((pdecin?.value ?: 0L).toString(), (pi64out?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI8FromDisp(pdispin: COpaquePointer?, lcid: UInt, pi64out: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varI8FromDisp((pdispin?.value ?: 0L).toString(), lcid.toInt(), (pi64out?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI8FromI1(cin: Byte, pi64out: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varI8FromI1(cin.toInt(), (pi64out?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI8FromI2(sin: Short, pi64out: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varI8FromI2(sin.toInt(), (pi64out?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI8FromR4(fltin: Float, pi64out: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varI8FromR4(fltin.toDouble(), (pi64out?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI8FromR8(dblin: Double, pi64out: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varI8FromR8(dblin, (pi64out?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI8FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pi64out: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varI8FromStr((strin?.value ?: 0L).toString(), lcid.toInt(), dwflags.toInt(), (pi64out?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI8FromUI1(bin: UByte, pi64out: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varI8FromUI1(bin.toInt(), (pi64out?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI8FromUI2(uiin: UShort, pi64out: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varI8FromUI2(uiin.toInt(), (pi64out?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI8FromUI4(ulin: UInt, pi64out: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varI8FromUI4(ulin.toInt(), (pi64out?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varI8FromUI8(ui64in: ULong, pi64out: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varI8FromUI8(ui64in.toString(), (pi64out?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varIdiv(pvarleft: COpaquePointer?, pvarright: COpaquePointer?, pvarresult: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varIdiv((pvarleft?.value ?: 0L).toString(), (pvarright?.value ?: 0L).toString(), (pvarresult?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varImp(pvarleft: COpaquePointer?, pvarright: COpaquePointer?, pvarresult: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varImp((pvarleft?.value ?: 0L).toString(), (pvarright?.value ?: 0L).toString(), (pvarresult?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varInt(pvarin: COpaquePointer?, pvarresult: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varInt((pvarin?.value ?: 0L).toString(), (pvarresult?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varMod(pvarleft: COpaquePointer?, pvarright: COpaquePointer?, pvarresult: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varMod((pvarleft?.value ?: 0L).toString(), (pvarright?.value ?: 0L).toString(), (pvarresult?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varMonthName(imonth: Int, fabbrev: Int, dwflags: UInt, pbstrout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varMonthName(imonth, fabbrev, dwflags.toInt(), (pbstrout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varMul(pvarleft: COpaquePointer?, pvarright: COpaquePointer?, pvarresult: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varMul((pvarleft?.value ?: 0L).toString(), (pvarright?.value ?: 0L).toString(), (pvarresult?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varNeg(pvarin: COpaquePointer?, pvarresult: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varNeg((pvarin?.value ?: 0L).toString(), (pvarresult?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varNot(pvarin: COpaquePointer?, pvarresult: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varNot((pvarin?.value ?: 0L).toString(), (pvarresult?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varNumFromParseNum(pnumprs: COpaquePointer?, rgbdig: COpaquePointer?, dwvtbits: UInt, pvar: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varNumFromParseNum((pnumprs?.value ?: 0L).toString(), (rgbdig?.value ?: 0L).toString(), dwvtbits.toInt(), (pvar?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varOr(pvarleft: COpaquePointer?, pvarright: COpaquePointer?, pvarresult: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varOr((pvarleft?.value ?: 0L).toString(), (pvarright?.value ?: 0L).toString(), (pvarresult?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varParseNumFromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pnumprs: COpaquePointer?, rgbdig: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varParseNumFromStr((strin?.value ?: 0L).toString(), lcid.toInt(), dwflags.toInt(), (pnumprs?.value ?: 0L).toString(), (rgbdig?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varPow(pvarleft: COpaquePointer?, pvarright: COpaquePointer?, pvarresult: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varPow((pvarleft?.value ?: 0L).toString(), (pvarright?.value ?: 0L).toString(), (pvarresult?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varR4CmpR8(fltleft: Float, dblright: Double): Varcmp =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varR4CmpR8(fltleft.toDouble(), dblright) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varR4FromBool(boolin: VariantBool, pfltout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varR4FromBool(boolin.toInt(), (pfltout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varR4FromCy(cyin: CY, pfltout: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varR4FromDate(datein: Double, pfltout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varR4FromDate(datein, (pfltout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varR4FromDec(pdecin: COpaquePointer?, pfltout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varR4FromDec((pdecin?.value ?: 0L).toString(), (pfltout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varR4FromDisp(pdispin: COpaquePointer?, lcid: UInt, pfltout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varR4FromDisp((pdispin?.value ?: 0L).toString(), lcid.toInt(), (pfltout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varR4FromI1(cin: Byte, pfltout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varR4FromI1(cin.toInt(), (pfltout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varR4FromI2(sin: Short, pfltout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varR4FromI2(sin.toInt(), (pfltout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varR4FromI4(lin: Int, pfltout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varR4FromI4(lin, (pfltout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varR4FromI8(i64in: Long, pfltout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varR4FromI8(i64in.toString(), (pfltout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varR4FromR8(dblin: Double, pfltout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varR4FromR8(dblin, (pfltout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varR4FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pfltout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varR4FromStr((strin?.value ?: 0L).toString(), lcid.toInt(), dwflags.toInt(), (pfltout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varR4FromUI1(bin: UByte, pfltout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varR4FromUI1(bin.toInt(), (pfltout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varR4FromUI2(uiin: UShort, pfltout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varR4FromUI2(uiin.toInt(), (pfltout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varR4FromUI4(ulin: UInt, pfltout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varR4FromUI4(ulin.toInt(), (pfltout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varR4FromUI8(ui64in: ULong, pfltout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varR4FromUI8(ui64in.toString(), (pfltout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varR8FromBool(boolin: VariantBool, pdblout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varR8FromBool(boolin.toInt(), (pdblout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varR8FromCy(cyin: CY, pdblout: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varR8FromDate(datein: Double, pdblout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varR8FromDate(datein, (pdblout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varR8FromDec(pdecin: COpaquePointer?, pdblout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varR8FromDec((pdecin?.value ?: 0L).toString(), (pdblout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varR8FromDisp(pdispin: COpaquePointer?, lcid: UInt, pdblout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varR8FromDisp((pdispin?.value ?: 0L).toString(), lcid.toInt(), (pdblout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varR8FromI1(cin: Byte, pdblout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varR8FromI1(cin.toInt(), (pdblout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varR8FromI2(sin: Short, pdblout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varR8FromI2(sin.toInt(), (pdblout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varR8FromI4(lin: Int, pdblout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varR8FromI4(lin, (pdblout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varR8FromI8(i64in: Long, pdblout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varR8FromI8(i64in.toString(), (pdblout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varR8FromR4(fltin: Float, pdblout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varR8FromR4(fltin.toDouble(), (pdblout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varR8FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pdblout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varR8FromStr((strin?.value ?: 0L).toString(), lcid.toInt(), dwflags.toInt(), (pdblout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varR8FromUI1(bin: UByte, pdblout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varR8FromUI1(bin.toInt(), (pdblout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varR8FromUI2(uiin: UShort, pdblout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varR8FromUI2(uiin.toInt(), (pdblout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varR8FromUI4(ulin: UInt, pdblout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varR8FromUI4(ulin.toInt(), (pdblout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varR8FromUI8(ui64in: ULong, pdblout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varR8FromUI8(ui64in.toString(), (pdblout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varR8Pow(dblleft: Double, dblright: Double, pdblresult: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varR8Pow(dblleft, dblright, (pdblresult?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varR8Round(dblin: Double, cdecimals: Int, pdblresult: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varR8Round(dblin, cdecimals, (pdblresult?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varRound(pvarin: COpaquePointer?, cdecimals: Int, pvarresult: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varRound((pvarin?.value ?: 0L).toString(), cdecimals, (pvarresult?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varSub(pvarleft: COpaquePointer?, pvarright: COpaquePointer?, pvarresult: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varSub((pvarleft?.value ?: 0L).toString(), (pvarright?.value ?: 0L).toString(), (pvarresult?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varTokenizeFormatString(pstrformat: Pcwstr, rgbtok: COpaquePointer?, cbtok: Int, ifirstday: VarformatFirstDay, ifirstweek: VarformatFirstWeek, lcid: UInt, pcbactual: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varTokenizeFormatString((pstrformat?.value ?: 0L).toString(), (rgbtok?.value ?: 0L).toString(), cbtok, ifirstday, ifirstweek, lcid.toInt(), (pcbactual?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI1FromBool(boolin: VariantBool, pbout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varUI1FromBool(boolin.toInt(), (pbout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI1FromCy(cyin: CY, pbout: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI1FromDate(datein: Double, pbout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varUI1FromDate(datein, (pbout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI1FromDec(pdecin: COpaquePointer?, pbout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varUI1FromDec((pdecin?.value ?: 0L).toString(), (pbout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI1FromDisp(pdispin: COpaquePointer?, lcid: UInt, pbout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varUI1FromDisp((pdispin?.value ?: 0L).toString(), lcid.toInt(), (pbout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI1FromI1(cin: Byte, pbout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varUI1FromI1(cin.toInt(), (pbout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI1FromI2(sin: Short, pbout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varUI1FromI2(sin.toInt(), (pbout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI1FromI4(lin: Int, pbout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varUI1FromI4(lin, (pbout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI1FromI8(i64in: Long, pbout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varUI1FromI8(i64in.toString(), (pbout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI1FromR4(fltin: Float, pbout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varUI1FromR4(fltin.toDouble(), (pbout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI1FromR8(dblin: Double, pbout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varUI1FromR8(dblin, (pbout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI1FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pbout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varUI1FromStr((strin?.value ?: 0L).toString(), lcid.toInt(), dwflags.toInt(), (pbout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI1FromUI2(uiin: UShort, pbout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varUI1FromUI2(uiin.toInt(), (pbout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI1FromUI4(ulin: UInt, pbout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varUI1FromUI4(ulin.toInt(), (pbout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI1FromUI8(ui64in: ULong, pbout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varUI1FromUI8(ui64in.toString(), (pbout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI2FromBool(boolin: VariantBool, puiout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varUI2FromBool(boolin.toInt(), (puiout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI2FromCy(cyin: CY, puiout: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI2FromDate(datein: Double, puiout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varUI2FromDate(datein, (puiout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI2FromDec(pdecin: COpaquePointer?, puiout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varUI2FromDec((pdecin?.value ?: 0L).toString(), (puiout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI2FromDisp(pdispin: COpaquePointer?, lcid: UInt, puiout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varUI2FromDisp((pdispin?.value ?: 0L).toString(), lcid.toInt(), (puiout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI2FromI1(cin: Byte, puiout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varUI2FromI1(cin.toInt(), (puiout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI2FromI2(uiin: Short, puiout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varUI2FromI2(uiin.toInt(), (puiout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI2FromI4(lin: Int, puiout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varUI2FromI4(lin, (puiout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI2FromI8(i64in: Long, puiout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varUI2FromI8(i64in.toString(), (puiout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI2FromR4(fltin: Float, puiout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varUI2FromR4(fltin.toDouble(), (puiout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI2FromR8(dblin: Double, puiout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varUI2FromR8(dblin, (puiout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI2FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, puiout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varUI2FromStr((strin?.value ?: 0L).toString(), lcid.toInt(), dwflags.toInt(), (puiout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI2FromUI1(bin: UByte, puiout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varUI2FromUI1(bin.toInt(), (puiout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI2FromUI4(ulin: UInt, puiout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varUI2FromUI4(ulin.toInt(), (puiout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI2FromUI8(i64in: ULong, puiout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varUI2FromUI8(i64in.toString(), (puiout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI4FromBool(boolin: VariantBool, pulout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varUI4FromBool(boolin.toInt(), (pulout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI4FromCy(cyin: CY, pulout: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI4FromDate(datein: Double, pulout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varUI4FromDate(datein, (pulout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI4FromDec(pdecin: COpaquePointer?, pulout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varUI4FromDec((pdecin?.value ?: 0L).toString(), (pulout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI4FromDisp(pdispin: COpaquePointer?, lcid: UInt, pulout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varUI4FromDisp((pdispin?.value ?: 0L).toString(), lcid.toInt(), (pulout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI4FromI1(cin: Byte, pulout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varUI4FromI1(cin.toInt(), (pulout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI4FromI2(uiin: Short, pulout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varUI4FromI2(uiin.toInt(), (pulout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI4FromI4(lin: Int, pulout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varUI4FromI4(lin, (pulout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI4FromI8(i64in: Long, plout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varUI4FromI8(i64in.toString(), (plout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI4FromR4(fltin: Float, pulout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varUI4FromR4(fltin.toDouble(), (pulout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI4FromR8(dblin: Double, pulout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varUI4FromR8(dblin, (pulout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI4FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pulout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varUI4FromStr((strin?.value ?: 0L).toString(), lcid.toInt(), dwflags.toInt(), (pulout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI4FromUI1(bin: UByte, pulout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varUI4FromUI1(bin.toInt(), (pulout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI4FromUI2(uiin: UShort, pulout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varUI4FromUI2(uiin.toInt(), (pulout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI4FromUI8(ui64in: ULong, plout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varUI4FromUI8(ui64in.toString(), (plout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI8FromBool(boolin: VariantBool, pi64out: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varUI8FromBool(boolin.toInt(), (pi64out?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI8FromCy(cyin: CY, pi64out: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI8FromDate(datein: Double, pi64out: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varUI8FromDate(datein, (pi64out?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI8FromDec(pdecin: COpaquePointer?, pi64out: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varUI8FromDec((pdecin?.value ?: 0L).toString(), (pi64out?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI8FromDisp(pdispin: COpaquePointer?, lcid: UInt, pi64out: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varUI8FromDisp((pdispin?.value ?: 0L).toString(), lcid.toInt(), (pi64out?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI8FromI1(cin: Byte, pi64out: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varUI8FromI1(cin.toInt(), (pi64out?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI8FromI2(sin: Short, pi64out: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varUI8FromI2(sin.toInt(), (pi64out?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI8FromI8(ui64in: Long, pi64out: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varUI8FromI8(ui64in.toString(), (pi64out?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI8FromR4(fltin: Float, pi64out: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varUI8FromR4(fltin.toDouble(), (pi64out?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI8FromR8(dblin: Double, pi64out: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varUI8FromR8(dblin, (pi64out?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI8FromStr(strin: Pcwstr, lcid: UInt, dwflags: UInt, pi64out: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varUI8FromStr((strin?.value ?: 0L).toString(), lcid.toInt(), dwflags.toInt(), (pi64out?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI8FromUI1(bin: UByte, pi64out: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varUI8FromUI1(bin.toInt(), (pi64out?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI8FromUI2(uiin: UShort, pi64out: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varUI8FromUI2(uiin.toInt(), (pi64out?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUI8FromUI4(ulin: UInt, pi64out: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varUI8FromUI4(ulin.toInt(), (pi64out?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varUdateFromDate(datein: Double, dwflags: UInt, pudateout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varUdateFromDate(datein, dwflags.toInt(), (pudateout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varWeekdayName(iweekday: Int, fabbrev: Int, ifirstday: Int, dwflags: UInt, pbstrout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varWeekdayName(iweekday, fabbrev, ifirstday, dwflags.toInt(), (pbstrout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun varXor(pvarleft: COpaquePointer?, pvarright: COpaquePointer?, pvarresult: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_varXor((pvarleft?.value ?: 0L).toString(), (pvarright?.value ?: 0L).toString(), (pvarresult?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vectorFromBstr(bstr: Bstr, ppsa: COpaquePointer?): Hresult =
    if (_windowsWin32SystemOleNapiAddon != null) (_windowsWin32SystemOleNapiAddon.windowssys_windows_win32_system_ole_vectorFromBstr((bstr?.value ?: 0L).toString(), (ppsa?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
