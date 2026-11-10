@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.addressbook

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance

private val _windowsWin32SystemAddressbookNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun buildDisplayTable(lpallocatebuffer: Lpallocatebuffer, lpallocatemore: Lpallocatemore, lpfreebuffer: Lpfreebuffer, lpmalloc: COpaquePointer?, hinstance: Hinstance, cpages: UInt, lppage: COpaquePointer?, ulflags: UInt, lpptable: COpaquePointer?, lpptbldata: COpaquePointer?): Hresult =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_buildDisplayTable(0L.toString(), 0L.toString(), 0L.toString(), (lpmalloc?.value ?: 0L).toString(), (hinstance?.value ?: 0L).toString(), cpages.toInt(), (lppage?.value ?: 0L).toString(), ulflags.toInt(), (lpptable?.value ?: 0L).toString(), (lpptbldata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun changeIdleRoutine(ftg: COpaquePointer?, lpfnidle: Pfnidle, lpvidleparam: COpaquePointer?, priidle: Short, csecidle: UInt, iroidle: UShort, ircidle: UShort) {
    if (_windowsWin32SystemAddressbookNapiAddon != null) {
        _windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_changeIdleRoutine((ftg?.value ?: 0L).toString(), 0L.toString(), (lpvidleparam?.value ?: 0L).toString(), priidle.toInt(), csecidle.toInt(), iroidle.toInt(), ircidle.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun createIProp(lpinterface: COpaquePointer?, lpallocatebuffer: Lpallocatebuffer, lpallocatemore: Lpallocatemore, lpfreebuffer: Lpfreebuffer, lpvreserved: COpaquePointer?, lpppropdata: COpaquePointer?): Int =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_createIProp((lpinterface?.value ?: 0L).toString(), 0L.toString(), 0L.toString(), 0L.toString(), (lpvreserved?.value ?: 0L).toString(), (lpppropdata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createTable(lpinterface: COpaquePointer?, lpallocatebuffer: Lpallocatebuffer, lpallocatemore: Lpallocatemore, lpfreebuffer: Lpfreebuffer, lpvreserved: COpaquePointer?, ultabletype: UInt, ulproptagindexcolumn: UInt, lpsproptagarraycolumns: COpaquePointer?, lpptabledata: COpaquePointer?): Int =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_createTable((lpinterface?.value ?: 0L).toString(), 0L.toString(), 0L.toString(), 0L.toString(), (lpvreserved?.value ?: 0L).toString(), ultabletype.toInt(), ulproptagindexcolumn.toInt(), (lpsproptagarraycolumns?.value ?: 0L).toString(), (lpptabledata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deinitMapiUtil() {
    if (_windowsWin32SystemAddressbookNapiAddon != null) {
        _windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_deinitMapiUtil()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun deregisterIdleRoutine(ftg: COpaquePointer?) {
    if (_windowsWin32SystemAddressbookNapiAddon != null) {
        _windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_deregisterIdleRoutine((ftg?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun enableIdleRoutine(ftg: COpaquePointer?, fenable: Bool) {
    if (_windowsWin32SystemAddressbookNapiAddon != null) {
        _windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_enableIdleRoutine((ftg?.value ?: 0L).toString(), fenable)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fEqualNames(lpname1: COpaquePointer?, lpname2: COpaquePointer?): Bool =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_fEqualNames((lpname1?.value ?: 0L).toString(), (lpname2?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fPropCompareProp(lpspropvalue1: COpaquePointer?, ulrelop: UInt, lpspropvalue2: COpaquePointer?): Bool =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_fPropCompareProp((lpspropvalue1?.value ?: 0L).toString(), ulrelop.toInt(), (lpspropvalue2?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fPropContainsProp(lpspropvaluedst: COpaquePointer?, lpspropvaluesrc: COpaquePointer?, ulfuzzylevel: UInt): Bool =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_fPropContainsProp((lpspropvaluedst?.value ?: 0L).toString(), (lpspropvaluesrc?.value ?: 0L).toString(), ulfuzzylevel.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fPropExists(lpmapiprop: COpaquePointer?, ulproptag: UInt): Bool =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_fPropExists((lpmapiprop?.value ?: 0L).toString(), ulproptag.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freePadrlist(lpadrlist: COpaquePointer?) {
    if (_windowsWin32SystemAddressbookNapiAddon != null) {
        _windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_freePadrlist((lpadrlist?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun freeProws(lprows: COpaquePointer?) {
    if (_windowsWin32SystemAddressbookNapiAddon != null) {
        _windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_freeProws((lprows?.value ?: 0L).toString())
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
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_ftgRegisterIdleRoutine(0L.toString(), (lpvidleparam?.value ?: 0L).toString(), priidle.toInt(), csecidle.toInt(), iroidle.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hrAddColumns(lptbl: COpaquePointer?, lpproptagcolumnsnew: COpaquePointer?, lpallocatebuffer: Lpallocatebuffer, lpfreebuffer: Lpfreebuffer): Hresult =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_hrAddColumns((lptbl?.value ?: 0L).toString(), (lpproptagcolumnsnew?.value ?: 0L).toString(), 0L.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hrAddColumnsEx(lptbl: COpaquePointer?, lpproptagcolumnsnew: COpaquePointer?, lpallocatebuffer: Lpallocatebuffer, lpfreebuffer: Lpfreebuffer, lpfnfiltercolumns: Long): Hresult =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_hrAddColumnsEx((lptbl?.value ?: 0L).toString(), (lpproptagcolumnsnew?.value ?: 0L).toString(), 0L.toString(), 0L.toString(), lpfnfiltercolumns.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hrAllocAdviseSink(lpfncallback: Lpnotifcallback, lpvcontext: COpaquePointer?, lppadvisesink: COpaquePointer?): Hresult =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_hrAllocAdviseSink(0L.toString(), (lpvcontext?.value ?: 0L).toString(), (lppadvisesink?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hrDispatchNotifications(ulflags: UInt): Hresult =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_hrDispatchNotifications(ulflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hrGetOneProp(lpmapiprop: COpaquePointer?, ulproptag: UInt, lppprop: COpaquePointer?): Hresult =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_hrGetOneProp((lpmapiprop?.value ?: 0L).toString(), ulproptag.toInt(), (lppprop?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hrIStorageFromStream(lpunkin: COpaquePointer?, lpinterface: COpaquePointer?, ulflags: UInt, lppstorageout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_hrIStorageFromStream((lpunkin?.value ?: 0L).toString(), (lpinterface?.value ?: 0L).toString(), ulflags.toInt(), (lppstorageout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hrQueryAllRows(lptable: COpaquePointer?, lpproptags: COpaquePointer?, lprestriction: COpaquePointer?, lpsortorderset: COpaquePointer?, crowsmax: Int, lpprows: COpaquePointer?): Hresult =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_hrQueryAllRows((lptable?.value ?: 0L).toString(), (lpproptags?.value ?: 0L).toString(), (lprestriction?.value ?: 0L).toString(), (lpsortorderset?.value ?: 0L).toString(), crowsmax, (lpprows?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hrSetOneProp(lpmapiprop: COpaquePointer?, lpprop: COpaquePointer?): Hresult =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_hrSetOneProp((lpmapiprop?.value ?: 0L).toString(), (lpprop?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hrThisThreadAdviseSink(lpadvisesink: COpaquePointer?, lppadvisesink: COpaquePointer?): Hresult =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_hrThisThreadAdviseSink((lpadvisesink?.value ?: 0L).toString(), (lppadvisesink?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lPropCompareProp(lpspropvaluea: COpaquePointer?, lpspropvalueb: COpaquePointer?): Int =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_lPropCompareProp((lpspropvaluea?.value ?: 0L).toString(), (lpspropvalueb?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lpValFindProp(ulproptag: UInt, cvalues: UInt, lpproparray: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_lpValFindProp(ulproptag.toInt(), cvalues.toInt(), (lpproparray?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mAPIDeinitIdle() {
    if (_windowsWin32SystemAddressbookNapiAddon != null) {
        _windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_mAPIDeinitIdle()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mAPIGetDefaultMalloc(): COpaquePointer? =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_mAPIGetDefaultMalloc() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mAPIInitIdle(lpvreserved: COpaquePointer?): Int =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_mAPIInitIdle((lpvreserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openStreamOnFile(lpallocatebuffer: Lpallocatebuffer, lpfreebuffer: Lpfreebuffer, ulflags: UInt, lpszfilename: COpaquePointer?, lpszprefix: COpaquePointer?, lppstream: COpaquePointer?): Hresult =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_openStreamOnFile(0L.toString(), 0L.toString(), ulflags.toInt(), (lpszfilename?.value ?: 0L).toString(), (lpszprefix?.value ?: 0L).toString(), (lppstream?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ppropFindProp(lpproparray: COpaquePointer?, cvalues: UInt, ulproptag: UInt): COpaquePointer? =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_ppropFindProp((lpproparray?.value ?: 0L).toString(), cvalues.toInt(), ulproptag.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propCopyMore(lpspropvaluedest: COpaquePointer?, lpspropvaluesrc: COpaquePointer?, lpfallocmore: Lpallocatemore, lpvobject: COpaquePointer?): Int =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_propCopyMore((lpspropvaluedest?.value ?: 0L).toString(), (lpspropvaluesrc?.value ?: 0L).toString(), 0L.toString(), (lpvobject?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rTFSync(lpmessage: COpaquePointer?, ulflags: UInt, lpfmessageupdated: COpaquePointer?): Hresult =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_rTFSync((lpmessage?.value ?: 0L).toString(), ulflags.toInt(), (lpfmessageupdated?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scCopyNotifications(cnotification: Int, lpnotifications: COpaquePointer?, lpvdst: COpaquePointer?, lpcb: COpaquePointer?): Int =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_scCopyNotifications(cnotification, (lpnotifications?.value ?: 0L).toString(), (lpvdst?.value ?: 0L).toString(), (lpcb?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scCopyProps(cvalues: Int, lpproparray: COpaquePointer?, lpvdst: COpaquePointer?, lpcb: COpaquePointer?): Int =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_scCopyProps(cvalues, (lpproparray?.value ?: 0L).toString(), (lpvdst?.value ?: 0L).toString(), (lpcb?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scCountNotifications(cnotifications: Int, lpnotifications: COpaquePointer?, lpcb: COpaquePointer?): Int =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_scCountNotifications(cnotifications, (lpnotifications?.value ?: 0L).toString(), (lpcb?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scCountProps(cvalues: Int, lpproparray: COpaquePointer?, lpcb: COpaquePointer?): Int =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_scCountProps(cvalues, (lpproparray?.value ?: 0L).toString(), (lpcb?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scCreateConversationIndex(cbparent: UInt, lpbparent: COpaquePointer?, lpcbconvindex: COpaquePointer?, lppbconvindex: COpaquePointer?): Int =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_scCreateConversationIndex(cbparent.toInt(), (lpbparent?.value ?: 0L).toString(), (lpcbconvindex?.value ?: 0L).toString(), (lppbconvindex?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scDupPropset(cvalues: Int, lpproparray: COpaquePointer?, lpallocatebuffer: Lpallocatebuffer, lppproparray: COpaquePointer?): Int =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_scDupPropset(cvalues, (lpproparray?.value ?: 0L).toString(), 0L.toString(), (lppproparray?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scInitMapiUtil(ulflags: UInt): Int =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_scInitMapiUtil(ulflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scLocalPathFromUNC(lpszunc: Pcstr, lpszlocal: Pcstr, cchlocal: UInt): Int =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_scLocalPathFromUNC((lpszunc?.value ?: 0L).toString(), (lpszlocal?.value ?: 0L).toString(), cchlocal.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scRelocNotifications(cnotification: Int, lpnotifications: COpaquePointer?, lpvbaseold: COpaquePointer?, lpvbasenew: COpaquePointer?, lpcb: COpaquePointer?): Int =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_scRelocNotifications(cnotification, (lpnotifications?.value ?: 0L).toString(), (lpvbaseold?.value ?: 0L).toString(), (lpvbasenew?.value ?: 0L).toString(), (lpcb?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scRelocProps(cvalues: Int, lpproparray: COpaquePointer?, lpvbaseold: COpaquePointer?, lpvbasenew: COpaquePointer?, lpcb: COpaquePointer?): Int =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_scRelocProps(cvalues, (lpproparray?.value ?: 0L).toString(), (lpvbaseold?.value ?: 0L).toString(), (lpvbasenew?.value ?: 0L).toString(), (lpcb?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scUNCFromLocalPath(lpszlocal: Pcstr, lpszunc: Pcstr, cchunc: UInt): Int =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_scUNCFromLocalPath((lpszlocal?.value ?: 0L).toString(), (lpszunc?.value ?: 0L).toString(), cchunc.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun szFindCh(lpsz: COpaquePointer?, ch: UShort): COpaquePointer? =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_szFindCh((lpsz?.value ?: 0L).toString(), ch.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun szFindLastCh(lpsz: COpaquePointer?, ch: UShort): COpaquePointer? =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_szFindLastCh((lpsz?.value ?: 0L).toString(), ch.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun szFindSz(lpsz: COpaquePointer?, lpszkey: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_szFindSz((lpsz?.value ?: 0L).toString(), (lpszkey?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uFromSz(lpsz: COpaquePointer?): UInt =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_uFromSz((lpsz?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulAddRef(lpunk: COpaquePointer?): UInt =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_ulAddRef((lpunk?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulPropSize(lpspropvalue: COpaquePointer?): UInt =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_ulPropSize((lpspropvalue?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulRelease(lpunk: COpaquePointer?): UInt =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_ulRelease((lpunk?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wrapCompressedRTFStream(lpcompressedrtfstream: COpaquePointer?, ulflags: UInt, lpuncompressedrtfstream: COpaquePointer?): Hresult =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_wrapCompressedRTFStream((lpcompressedrtfstream?.value ?: 0L).toString(), ulflags.toInt(), (lpuncompressedrtfstream?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wrapStoreEntryID(ulflags: UInt, lpszdllname: COpaquePointer?, cborigentry: UInt, lporigentry: COpaquePointer?, lpcbwrappedentry: COpaquePointer?, lppwrappedentry: COpaquePointer?): Hresult =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_wrapStoreEntryID(ulflags.toInt(), (lpszdllname?.value ?: 0L).toString(), cborigentry.toInt(), (lporigentry?.value ?: 0L).toString(), (lpcbwrappedentry?.value ?: 0L).toString(), (lppwrappedentry?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
