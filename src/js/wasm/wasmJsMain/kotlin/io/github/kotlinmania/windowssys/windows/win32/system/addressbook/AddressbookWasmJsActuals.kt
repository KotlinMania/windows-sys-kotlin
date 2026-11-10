@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.addressbook

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32SystemAddressbookNapiAddon(): Boolean

private val _windowsWin32SystemAddressbookNapiAvailable: Boolean = _initWindowsWin32SystemAddressbookNapiAddon()

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_addressbook_buildDisplayTable(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun _wasm_windowssys_windows_win32_system_addressbook_buildDisplayTable(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String, p7: Int, p8: String, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_addressbook_changeIdleRoutine(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_system_addressbook_changeIdleRoutine(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: Int, p6: Int)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_addressbook_createIProp(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_addressbook_createIProp(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_addressbook_createTable(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_win32_system_addressbook_createTable(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: Int, p7: String, p8: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_addressbook_deinitMapiUtil()")
private external fun _wasm_windowssys_windows_win32_system_addressbook_deinitMapiUtil()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_addressbook_deregisterIdleRoutine(p0)")
private external fun _wasm_windowssys_windows_win32_system_addressbook_deregisterIdleRoutine(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_addressbook_enableIdleRoutine(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_addressbook_enableIdleRoutine(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_addressbook_fEqualNames(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_addressbook_fEqualNames(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_addressbook_fPropCompareProp(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_addressbook_fPropCompareProp(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_addressbook_fPropContainsProp(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_addressbook_fPropContainsProp(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_addressbook_fPropExists(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_addressbook_fPropExists(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_addressbook_freePadrlist(p0)")
private external fun _wasm_windowssys_windows_win32_system_addressbook_freePadrlist(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_addressbook_freeProws(p0)")
private external fun _wasm_windowssys_windows_win32_system_addressbook_freeProws(p0: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_addressbook_ftgRegisterIdleRoutine(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_addressbook_ftgRegisterIdleRoutine(p0: String, p1: String, p2: Int, p3: Int, p4: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_addressbook_hrAddColumns(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_addressbook_hrAddColumns(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_addressbook_hrAddColumnsEx(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_addressbook_hrAddColumnsEx(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_addressbook_hrAllocAdviseSink(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_addressbook_hrAllocAdviseSink(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_addressbook_hrDispatchNotifications(p0)")
private external fun _wasm_windowssys_windows_win32_system_addressbook_hrDispatchNotifications(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_addressbook_hrGetOneProp(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_addressbook_hrGetOneProp(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_addressbook_hrIStorageFromStream(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_addressbook_hrIStorageFromStream(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_addressbook_hrQueryAllRows(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_addressbook_hrQueryAllRows(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_addressbook_hrSetOneProp(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_addressbook_hrSetOneProp(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_addressbook_hrThisThreadAdviseSink(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_addressbook_hrThisThreadAdviseSink(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_addressbook_lPropCompareProp(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_addressbook_lPropCompareProp(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_addressbook_lpValFindProp(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_addressbook_lpValFindProp(p0: Int, p1: Int, p2: String): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_addressbook_mAPIDeinitIdle()")
private external fun _wasm_windowssys_windows_win32_system_addressbook_mAPIDeinitIdle()

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_addressbook_mAPIGetDefaultMalloc()")
private external fun _wasm_windowssys_windows_win32_system_addressbook_mAPIGetDefaultMalloc(): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_addressbook_mAPIInitIdle(p0)")
private external fun _wasm_windowssys_windows_win32_system_addressbook_mAPIInitIdle(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_addressbook_openStreamOnFile(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_addressbook_openStreamOnFile(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_addressbook_ppropFindProp(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_addressbook_ppropFindProp(p0: String, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_addressbook_propCopyMore(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_addressbook_propCopyMore(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_addressbook_rTFSync(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_addressbook_rTFSync(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_addressbook_scCopyNotifications(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_addressbook_scCopyNotifications(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_addressbook_scCopyProps(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_addressbook_scCopyProps(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_addressbook_scCountNotifications(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_addressbook_scCountNotifications(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_addressbook_scCountProps(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_addressbook_scCountProps(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_addressbook_scCreateConversationIndex(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_addressbook_scCreateConversationIndex(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_addressbook_scDupPropset(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_addressbook_scDupPropset(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_addressbook_scInitMapiUtil(p0)")
private external fun _wasm_windowssys_windows_win32_system_addressbook_scInitMapiUtil(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_addressbook_scLocalPathFromUNC(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_addressbook_scLocalPathFromUNC(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_addressbook_scRelocNotifications(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_addressbook_scRelocNotifications(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_addressbook_scRelocProps(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_addressbook_scRelocProps(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_addressbook_scUNCFromLocalPath(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_addressbook_scUNCFromLocalPath(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_addressbook_szFindCh(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_addressbook_szFindCh(p0: String, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_addressbook_szFindLastCh(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_addressbook_szFindLastCh(p0: String, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_addressbook_szFindSz(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_addressbook_szFindSz(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_addressbook_uFromSz(p0)")
private external fun _wasm_windowssys_windows_win32_system_addressbook_uFromSz(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_addressbook_ulAddRef(p0)")
private external fun _wasm_windowssys_windows_win32_system_addressbook_ulAddRef(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_addressbook_ulPropSize(p0)")
private external fun _wasm_windowssys_windows_win32_system_addressbook_ulPropSize(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_addressbook_ulRelease(p0)")
private external fun _wasm_windowssys_windows_win32_system_addressbook_ulRelease(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_addressbook_wrapCompressedRTFStream(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_addressbook_wrapCompressedRTFStream(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_addressbook_wrapStoreEntryID(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_addressbook_wrapStoreEntryID(p0: Int, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

public actual fun buildDisplayTable(lpallocatebuffer: Lpallocatebuffer, lpallocatemore: Lpallocatemore, lpfreebuffer: Lpfreebuffer, lpmalloc: COpaquePointer?, hinstance: Hinstance, cpages: UInt, lppage: COpaquePointer?, ulflags: UInt, lpptable: COpaquePointer?, lpptbldata: COpaquePointer?): Hresult =
    if (_windowsWin32SystemAddressbookNapiAvailable) _wasm_windowssys_windows_win32_system_addressbook_buildDisplayTable(0L.toString(), 0L.toString(), 0L.toString(), (lpmalloc?.value ?: 0L).toString(), (hinstance?.value ?: 0L).toString(), cpages.toInt(), (lppage?.value ?: 0L).toString(), ulflags.toInt(), (lpptable?.value ?: 0L).toString(), (lpptbldata?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun changeIdleRoutine(ftg: COpaquePointer?, lpfnidle: Pfnidle, lpvidleparam: COpaquePointer?, priidle: Short, csecidle: UInt, iroidle: UShort, ircidle: UShort) {
    if (_windowsWin32SystemAddressbookNapiAvailable) {
        _wasm_windowssys_windows_win32_system_addressbook_changeIdleRoutine((ftg?.value ?: 0L).toString(), 0L.toString(), (lpvidleparam?.value ?: 0L).toString(), priidle.toInt(), csecidle.toInt(), iroidle.toInt(), ircidle.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun createIProp(lpinterface: COpaquePointer?, lpallocatebuffer: Lpallocatebuffer, lpallocatemore: Lpallocatemore, lpfreebuffer: Lpfreebuffer, lpvreserved: COpaquePointer?, lpppropdata: COpaquePointer?): Int =
    if (_windowsWin32SystemAddressbookNapiAvailable) _wasm_windowssys_windows_win32_system_addressbook_createIProp((lpinterface?.value ?: 0L).toString(), 0L.toString(), 0L.toString(), 0L.toString(), (lpvreserved?.value ?: 0L).toString(), (lpppropdata?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createTable(lpinterface: COpaquePointer?, lpallocatebuffer: Lpallocatebuffer, lpallocatemore: Lpallocatemore, lpfreebuffer: Lpfreebuffer, lpvreserved: COpaquePointer?, ultabletype: UInt, ulproptagindexcolumn: UInt, lpsproptagarraycolumns: COpaquePointer?, lpptabledata: COpaquePointer?): Int =
    if (_windowsWin32SystemAddressbookNapiAvailable) _wasm_windowssys_windows_win32_system_addressbook_createTable((lpinterface?.value ?: 0L).toString(), 0L.toString(), 0L.toString(), 0L.toString(), (lpvreserved?.value ?: 0L).toString(), ultabletype.toInt(), ulproptagindexcolumn.toInt(), (lpsproptagarraycolumns?.value ?: 0L).toString(), (lpptabledata?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deinitMapiUtil() {
    if (_windowsWin32SystemAddressbookNapiAvailable) {
        _wasm_windowssys_windows_win32_system_addressbook_deinitMapiUtil()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun deregisterIdleRoutine(ftg: COpaquePointer?) {
    if (_windowsWin32SystemAddressbookNapiAvailable) {
        _wasm_windowssys_windows_win32_system_addressbook_deregisterIdleRoutine((ftg?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun enableIdleRoutine(ftg: COpaquePointer?, fenable: Bool) {
    if (_windowsWin32SystemAddressbookNapiAvailable) {
        _wasm_windowssys_windows_win32_system_addressbook_enableIdleRoutine((ftg?.value ?: 0L).toString(), fenable)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fEqualNames(lpname1: COpaquePointer?, lpname2: COpaquePointer?): Bool =
    if (_windowsWin32SystemAddressbookNapiAvailable) _wasm_windowssys_windows_win32_system_addressbook_fEqualNames((lpname1?.value ?: 0L).toString(), (lpname2?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fPropCompareProp(lpspropvalue1: COpaquePointer?, ulrelop: UInt, lpspropvalue2: COpaquePointer?): Bool =
    if (_windowsWin32SystemAddressbookNapiAvailable) _wasm_windowssys_windows_win32_system_addressbook_fPropCompareProp((lpspropvalue1?.value ?: 0L).toString(), ulrelop.toInt(), (lpspropvalue2?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fPropContainsProp(lpspropvaluedst: COpaquePointer?, lpspropvaluesrc: COpaquePointer?, ulfuzzylevel: UInt): Bool =
    if (_windowsWin32SystemAddressbookNapiAvailable) _wasm_windowssys_windows_win32_system_addressbook_fPropContainsProp((lpspropvaluedst?.value ?: 0L).toString(), (lpspropvaluesrc?.value ?: 0L).toString(), ulfuzzylevel.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fPropExists(lpmapiprop: COpaquePointer?, ulproptag: UInt): Bool =
    if (_windowsWin32SystemAddressbookNapiAvailable) _wasm_windowssys_windows_win32_system_addressbook_fPropExists((lpmapiprop?.value ?: 0L).toString(), ulproptag.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freePadrlist(lpadrlist: COpaquePointer?) {
    if (_windowsWin32SystemAddressbookNapiAvailable) {
        _wasm_windowssys_windows_win32_system_addressbook_freePadrlist((lpadrlist?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun freeProws(lprows: COpaquePointer?) {
    if (_windowsWin32SystemAddressbookNapiAvailable) {
        _wasm_windowssys_windows_win32_system_addressbook_freeProws((lprows?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ftAddFt(ftaddend1: Filetime, ftaddend2: Filetime): Filetime =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftMulDw(ftmultiplier: UInt, ftmultiplicand: Filetime): Filetime =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftMulDwDw(ftmultiplicand: UInt, ftmultiplier: UInt): Filetime =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftNegFt(ft: Filetime): Filetime =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftSubFt(ftminuend: Filetime, ftsubtrahend: Filetime): Filetime =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftgRegisterIdleRoutine(lpfnidle: Pfnidle, lpvidleparam: COpaquePointer?, priidle: Short, csecidle: UInt, iroidle: UShort): COpaquePointer? =
    if (_windowsWin32SystemAddressbookNapiAvailable) _wasm_windowssys_windows_win32_system_addressbook_ftgRegisterIdleRoutine(0L.toString(), (lpvidleparam?.value ?: 0L).toString(), priidle.toInt(), csecidle.toInt(), iroidle.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hrAddColumns(lptbl: COpaquePointer?, lpproptagcolumnsnew: COpaquePointer?, lpallocatebuffer: Lpallocatebuffer, lpfreebuffer: Lpfreebuffer): Hresult =
    if (_windowsWin32SystemAddressbookNapiAvailable) _wasm_windowssys_windows_win32_system_addressbook_hrAddColumns((lptbl?.value ?: 0L).toString(), (lpproptagcolumnsnew?.value ?: 0L).toString(), 0L.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hrAddColumnsEx(lptbl: COpaquePointer?, lpproptagcolumnsnew: COpaquePointer?, lpallocatebuffer: Lpallocatebuffer, lpfreebuffer: Lpfreebuffer, lpfnfiltercolumns: Long): Hresult =
    if (_windowsWin32SystemAddressbookNapiAvailable) _wasm_windowssys_windows_win32_system_addressbook_hrAddColumnsEx((lptbl?.value ?: 0L).toString(), (lpproptagcolumnsnew?.value ?: 0L).toString(), 0L.toString(), 0L.toString(), lpfnfiltercolumns.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hrAllocAdviseSink(lpfncallback: Lpnotifcallback, lpvcontext: COpaquePointer?, lppadvisesink: COpaquePointer?): Hresult =
    if (_windowsWin32SystemAddressbookNapiAvailable) _wasm_windowssys_windows_win32_system_addressbook_hrAllocAdviseSink(0L.toString(), (lpvcontext?.value ?: 0L).toString(), (lppadvisesink?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hrDispatchNotifications(ulflags: UInt): Hresult =
    if (_windowsWin32SystemAddressbookNapiAvailable) _wasm_windowssys_windows_win32_system_addressbook_hrDispatchNotifications(ulflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hrGetOneProp(lpmapiprop: COpaquePointer?, ulproptag: UInt, lppprop: COpaquePointer?): Hresult =
    if (_windowsWin32SystemAddressbookNapiAvailable) _wasm_windowssys_windows_win32_system_addressbook_hrGetOneProp((lpmapiprop?.value ?: 0L).toString(), ulproptag.toInt(), (lppprop?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hrIStorageFromStream(lpunkin: COpaquePointer?, lpinterface: COpaquePointer?, ulflags: UInt, lppstorageout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemAddressbookNapiAvailable) _wasm_windowssys_windows_win32_system_addressbook_hrIStorageFromStream((lpunkin?.value ?: 0L).toString(), (lpinterface?.value ?: 0L).toString(), ulflags.toInt(), (lppstorageout?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hrQueryAllRows(lptable: COpaquePointer?, lpproptags: COpaquePointer?, lprestriction: COpaquePointer?, lpsortorderset: COpaquePointer?, crowsmax: Int, lpprows: COpaquePointer?): Hresult =
    if (_windowsWin32SystemAddressbookNapiAvailable) _wasm_windowssys_windows_win32_system_addressbook_hrQueryAllRows((lptable?.value ?: 0L).toString(), (lpproptags?.value ?: 0L).toString(), (lprestriction?.value ?: 0L).toString(), (lpsortorderset?.value ?: 0L).toString(), crowsmax, (lpprows?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hrSetOneProp(lpmapiprop: COpaquePointer?, lpprop: COpaquePointer?): Hresult =
    if (_windowsWin32SystemAddressbookNapiAvailable) _wasm_windowssys_windows_win32_system_addressbook_hrSetOneProp((lpmapiprop?.value ?: 0L).toString(), (lpprop?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hrThisThreadAdviseSink(lpadvisesink: COpaquePointer?, lppadvisesink: COpaquePointer?): Hresult =
    if (_windowsWin32SystemAddressbookNapiAvailable) _wasm_windowssys_windows_win32_system_addressbook_hrThisThreadAdviseSink((lpadvisesink?.value ?: 0L).toString(), (lppadvisesink?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lPropCompareProp(lpspropvaluea: COpaquePointer?, lpspropvalueb: COpaquePointer?): Int =
    if (_windowsWin32SystemAddressbookNapiAvailable) _wasm_windowssys_windows_win32_system_addressbook_lPropCompareProp((lpspropvaluea?.value ?: 0L).toString(), (lpspropvalueb?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lpValFindProp(ulproptag: UInt, cvalues: UInt, lpproparray: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemAddressbookNapiAvailable) _wasm_windowssys_windows_win32_system_addressbook_lpValFindProp(ulproptag.toInt(), cvalues.toInt(), (lpproparray?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mAPIDeinitIdle() {
    if (_windowsWin32SystemAddressbookNapiAvailable) {
        _wasm_windowssys_windows_win32_system_addressbook_mAPIDeinitIdle()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mAPIGetDefaultMalloc(): COpaquePointer? =
    if (_windowsWin32SystemAddressbookNapiAvailable) _wasm_windowssys_windows_win32_system_addressbook_mAPIGetDefaultMalloc().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mAPIInitIdle(lpvreserved: COpaquePointer?): Int =
    if (_windowsWin32SystemAddressbookNapiAvailable) _wasm_windowssys_windows_win32_system_addressbook_mAPIInitIdle((lpvreserved?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openStreamOnFile(lpallocatebuffer: Lpallocatebuffer, lpfreebuffer: Lpfreebuffer, ulflags: UInt, lpszfilename: COpaquePointer?, lpszprefix: COpaquePointer?, lppstream: COpaquePointer?): Hresult =
    if (_windowsWin32SystemAddressbookNapiAvailable) _wasm_windowssys_windows_win32_system_addressbook_openStreamOnFile(0L.toString(), 0L.toString(), ulflags.toInt(), (lpszfilename?.value ?: 0L).toString(), (lpszprefix?.value ?: 0L).toString(), (lppstream?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ppropFindProp(lpproparray: COpaquePointer?, cvalues: UInt, ulproptag: UInt): COpaquePointer? =
    if (_windowsWin32SystemAddressbookNapiAvailable) _wasm_windowssys_windows_win32_system_addressbook_ppropFindProp((lpproparray?.value ?: 0L).toString(), cvalues.toInt(), ulproptag.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propCopyMore(lpspropvaluedest: COpaquePointer?, lpspropvaluesrc: COpaquePointer?, lpfallocmore: Lpallocatemore, lpvobject: COpaquePointer?): Int =
    if (_windowsWin32SystemAddressbookNapiAvailable) _wasm_windowssys_windows_win32_system_addressbook_propCopyMore((lpspropvaluedest?.value ?: 0L).toString(), (lpspropvaluesrc?.value ?: 0L).toString(), 0L.toString(), (lpvobject?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rTFSync(lpmessage: COpaquePointer?, ulflags: UInt, lpfmessageupdated: COpaquePointer?): Hresult =
    if (_windowsWin32SystemAddressbookNapiAvailable) _wasm_windowssys_windows_win32_system_addressbook_rTFSync((lpmessage?.value ?: 0L).toString(), ulflags.toInt(), (lpfmessageupdated?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scCopyNotifications(cnotification: Int, lpnotifications: COpaquePointer?, lpvdst: COpaquePointer?, lpcb: COpaquePointer?): Int =
    if (_windowsWin32SystemAddressbookNapiAvailable) _wasm_windowssys_windows_win32_system_addressbook_scCopyNotifications(cnotification, (lpnotifications?.value ?: 0L).toString(), (lpvdst?.value ?: 0L).toString(), (lpcb?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scCopyProps(cvalues: Int, lpproparray: COpaquePointer?, lpvdst: COpaquePointer?, lpcb: COpaquePointer?): Int =
    if (_windowsWin32SystemAddressbookNapiAvailable) _wasm_windowssys_windows_win32_system_addressbook_scCopyProps(cvalues, (lpproparray?.value ?: 0L).toString(), (lpvdst?.value ?: 0L).toString(), (lpcb?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scCountNotifications(cnotifications: Int, lpnotifications: COpaquePointer?, lpcb: COpaquePointer?): Int =
    if (_windowsWin32SystemAddressbookNapiAvailable) _wasm_windowssys_windows_win32_system_addressbook_scCountNotifications(cnotifications, (lpnotifications?.value ?: 0L).toString(), (lpcb?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scCountProps(cvalues: Int, lpproparray: COpaquePointer?, lpcb: COpaquePointer?): Int =
    if (_windowsWin32SystemAddressbookNapiAvailable) _wasm_windowssys_windows_win32_system_addressbook_scCountProps(cvalues, (lpproparray?.value ?: 0L).toString(), (lpcb?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scCreateConversationIndex(cbparent: UInt, lpbparent: COpaquePointer?, lpcbconvindex: COpaquePointer?, lppbconvindex: COpaquePointer?): Int =
    if (_windowsWin32SystemAddressbookNapiAvailable) _wasm_windowssys_windows_win32_system_addressbook_scCreateConversationIndex(cbparent.toInt(), (lpbparent?.value ?: 0L).toString(), (lpcbconvindex?.value ?: 0L).toString(), (lppbconvindex?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scDupPropset(cvalues: Int, lpproparray: COpaquePointer?, lpallocatebuffer: Lpallocatebuffer, lppproparray: COpaquePointer?): Int =
    if (_windowsWin32SystemAddressbookNapiAvailable) _wasm_windowssys_windows_win32_system_addressbook_scDupPropset(cvalues, (lpproparray?.value ?: 0L).toString(), 0L.toString(), (lppproparray?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scInitMapiUtil(ulflags: UInt): Int =
    if (_windowsWin32SystemAddressbookNapiAvailable) _wasm_windowssys_windows_win32_system_addressbook_scInitMapiUtil(ulflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scLocalPathFromUNC(lpszunc: Pcstr, lpszlocal: Pcstr, cchlocal: UInt): Int =
    if (_windowsWin32SystemAddressbookNapiAvailable) _wasm_windowssys_windows_win32_system_addressbook_scLocalPathFromUNC((lpszunc?.value ?: 0L).toString(), (lpszlocal?.value ?: 0L).toString(), cchlocal.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scRelocNotifications(cnotification: Int, lpnotifications: COpaquePointer?, lpvbaseold: COpaquePointer?, lpvbasenew: COpaquePointer?, lpcb: COpaquePointer?): Int =
    if (_windowsWin32SystemAddressbookNapiAvailable) _wasm_windowssys_windows_win32_system_addressbook_scRelocNotifications(cnotification, (lpnotifications?.value ?: 0L).toString(), (lpvbaseold?.value ?: 0L).toString(), (lpvbasenew?.value ?: 0L).toString(), (lpcb?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scRelocProps(cvalues: Int, lpproparray: COpaquePointer?, lpvbaseold: COpaquePointer?, lpvbasenew: COpaquePointer?, lpcb: COpaquePointer?): Int =
    if (_windowsWin32SystemAddressbookNapiAvailable) _wasm_windowssys_windows_win32_system_addressbook_scRelocProps(cvalues, (lpproparray?.value ?: 0L).toString(), (lpvbaseold?.value ?: 0L).toString(), (lpvbasenew?.value ?: 0L).toString(), (lpcb?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scUNCFromLocalPath(lpszlocal: Pcstr, lpszunc: Pcstr, cchunc: UInt): Int =
    if (_windowsWin32SystemAddressbookNapiAvailable) _wasm_windowssys_windows_win32_system_addressbook_scUNCFromLocalPath((lpszlocal?.value ?: 0L).toString(), (lpszunc?.value ?: 0L).toString(), cchunc.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun szFindCh(lpsz: COpaquePointer?, ch: UShort): COpaquePointer? =
    if (_windowsWin32SystemAddressbookNapiAvailable) _wasm_windowssys_windows_win32_system_addressbook_szFindCh((lpsz?.value ?: 0L).toString(), ch.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun szFindLastCh(lpsz: COpaquePointer?, ch: UShort): COpaquePointer? =
    if (_windowsWin32SystemAddressbookNapiAvailable) _wasm_windowssys_windows_win32_system_addressbook_szFindLastCh((lpsz?.value ?: 0L).toString(), ch.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun szFindSz(lpsz: COpaquePointer?, lpszkey: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemAddressbookNapiAvailable) _wasm_windowssys_windows_win32_system_addressbook_szFindSz((lpsz?.value ?: 0L).toString(), (lpszkey?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uFromSz(lpsz: COpaquePointer?): UInt =
    if (_windowsWin32SystemAddressbookNapiAvailable) _wasm_windowssys_windows_win32_system_addressbook_uFromSz((lpsz?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulAddRef(lpunk: COpaquePointer?): UInt =
    if (_windowsWin32SystemAddressbookNapiAvailable) _wasm_windowssys_windows_win32_system_addressbook_ulAddRef((lpunk?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulPropSize(lpspropvalue: COpaquePointer?): UInt =
    if (_windowsWin32SystemAddressbookNapiAvailable) _wasm_windowssys_windows_win32_system_addressbook_ulPropSize((lpspropvalue?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulRelease(lpunk: COpaquePointer?): UInt =
    if (_windowsWin32SystemAddressbookNapiAvailable) _wasm_windowssys_windows_win32_system_addressbook_ulRelease((lpunk?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wrapCompressedRTFStream(lpcompressedrtfstream: COpaquePointer?, ulflags: UInt, lpuncompressedrtfstream: COpaquePointer?): Hresult =
    if (_windowsWin32SystemAddressbookNapiAvailable) _wasm_windowssys_windows_win32_system_addressbook_wrapCompressedRTFStream((lpcompressedrtfstream?.value ?: 0L).toString(), ulflags.toInt(), (lpuncompressedrtfstream?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wrapStoreEntryID(ulflags: UInt, lpszdllname: COpaquePointer?, cborigentry: UInt, lporigentry: COpaquePointer?, lpcbwrappedentry: COpaquePointer?, lppwrappedentry: COpaquePointer?): Hresult =
    if (_windowsWin32SystemAddressbookNapiAvailable) _wasm_windowssys_windows_win32_system_addressbook_wrapStoreEntryID(ulflags.toInt(), (lpszdllname?.value ?: 0L).toString(), cborigentry.toInt(), (lporigentry?.value ?: 0L).toString(), (lpcbwrappedentry?.value ?: 0L).toString(), (lppwrappedentry?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
