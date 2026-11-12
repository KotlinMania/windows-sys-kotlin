@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.addressbook

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance

private val windowsWin32SystemAddressbookNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun buildDisplayTable(lpallocatebuffer: Lpallocatebuffer, lpallocatemore: Lpallocatemore, lpfreebuffer: Lpfreebuffer, lpmalloc: MutPtr, hinstance: Hinstance, cpages: UInt, lppage: MutPtr, ulflags: UInt, lpptable: MutPtr, lpptbldata: MutPtr): Hresult =
    if (windowsWin32SystemAddressbookNapiAddon != null) (windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookBuildDisplayTable(0L.toString(), 0L.toString(), 0L.toString(), lpmalloc.rawAddress.toString(), hinstance.rawAddress.toString(), cpages.toInt(), lppage.rawAddress.toString(), ulflags.toInt(), lpptable.rawAddress.toString(), lpptbldata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun changeIdleRoutine(ftg: MutPtr, lpfnidle: Pfnidle, lpvidleparam: MutPtr, priidle: Short, csecidle: UInt, iroidle: UShort, ircidle: UShort) {
    if (windowsWin32SystemAddressbookNapiAddon != null) {
        windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookChangeIdleRoutine(ftg.rawAddress.toString(), 0L.toString(), lpvidleparam.rawAddress.toString(), priidle.toInt(), csecidle.toInt(), iroidle.toInt(), ircidle.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun createIProp(lpinterface: MutPtr, lpallocatebuffer: Lpallocatebuffer, lpallocatemore: Lpallocatemore, lpfreebuffer: Lpfreebuffer, lpvreserved: MutPtr, lpppropdata: MutPtr): Int =
    if (windowsWin32SystemAddressbookNapiAddon != null) (windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookCreateIProp(lpinterface.rawAddress.toString(), 0L.toString(), 0L.toString(), 0L.toString(), lpvreserved.rawAddress.toString(), lpppropdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createTable(lpinterface: MutPtr, lpallocatebuffer: Lpallocatebuffer, lpallocatemore: Lpallocatemore, lpfreebuffer: Lpfreebuffer, lpvreserved: MutPtr, ultabletype: UInt, ulproptagindexcolumn: UInt, lpsproptagarraycolumns: MutPtr, lpptabledata: MutPtr): Int =
    if (windowsWin32SystemAddressbookNapiAddon != null) (windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookCreateTable(lpinterface.rawAddress.toString(), 0L.toString(), 0L.toString(), 0L.toString(), lpvreserved.rawAddress.toString(), ultabletype.toInt(), ulproptagindexcolumn.toInt(), lpsproptagarraycolumns.rawAddress.toString(), lpptabledata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deinitMapiUtil() {
    if (windowsWin32SystemAddressbookNapiAddon != null) {
        windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookDeinitMapiUtil()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun deregisterIdleRoutine(ftg: MutPtr) {
    if (windowsWin32SystemAddressbookNapiAddon != null) {
        windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookDeregisterIdleRoutine(ftg.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun enableIdleRoutine(ftg: MutPtr, fenable: Bool) {
    if (windowsWin32SystemAddressbookNapiAddon != null) {
        windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookEnableIdleRoutine(ftg.rawAddress.toString(), fenable)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fEqualNames(lpname1: MutPtr, lpname2: MutPtr): Bool =
    if (windowsWin32SystemAddressbookNapiAddon != null) (windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookFEqualNames(lpname1.rawAddress.toString(), lpname2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fPropCompareProp(lpspropvalue1: MutPtr, ulrelop: UInt, lpspropvalue2: MutPtr): Bool =
    if (windowsWin32SystemAddressbookNapiAddon != null) (windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookFPropCompareProp(lpspropvalue1.rawAddress.toString(), ulrelop.toInt(), lpspropvalue2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fPropContainsProp(lpspropvaluedst: MutPtr, lpspropvaluesrc: MutPtr, ulfuzzylevel: UInt): Bool =
    if (windowsWin32SystemAddressbookNapiAddon != null) (windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookFPropContainsProp(lpspropvaluedst.rawAddress.toString(), lpspropvaluesrc.rawAddress.toString(), ulfuzzylevel.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fPropExists(lpmapiprop: MutPtr, ulproptag: UInt): Bool =
    if (windowsWin32SystemAddressbookNapiAddon != null) (windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookFPropExists(lpmapiprop.rawAddress.toString(), ulproptag.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freePadrlist(lpadrlist: MutPtr) {
    if (windowsWin32SystemAddressbookNapiAddon != null) {
        windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookFreePadrlist(lpadrlist.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun freeProws(lprows: MutPtr) {
    if (windowsWin32SystemAddressbookNapiAddon != null) {
        windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookFreeProws(lprows.rawAddress.toString())
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

public actual fun ftgRegisterIdleRoutine(lpfnidle: Pfnidle, lpvidleparam: MutPtr, priidle: Short, csecidle: UInt, iroidle: UShort): MutPtr =
    if (windowsWin32SystemAddressbookNapiAddon != null) MutPtr((windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookFtgRegisterIdleRoutine(0L.toString(), lpvidleparam.rawAddress.toString(), priidle.toInt(), csecidle.toInt(), iroidle.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hrAddColumns(lptbl: MutPtr, lpproptagcolumnsnew: MutPtr, lpallocatebuffer: Lpallocatebuffer, lpfreebuffer: Lpfreebuffer): Hresult =
    if (windowsWin32SystemAddressbookNapiAddon != null) (windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookHrAddColumns(lptbl.rawAddress.toString(), lpproptagcolumnsnew.rawAddress.toString(), 0L.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hrAddColumnsEx(lptbl: MutPtr, lpproptagcolumnsnew: MutPtr, lpallocatebuffer: Lpallocatebuffer, lpfreebuffer: Lpfreebuffer, lpfnfiltercolumns: Long): Hresult =
    if (windowsWin32SystemAddressbookNapiAddon != null) (windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookHrAddColumnsEx(lptbl.rawAddress.toString(), lpproptagcolumnsnew.rawAddress.toString(), 0L.toString(), 0L.toString(), lpfnfiltercolumns.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hrAllocAdviseSink(lpfncallback: Lpnotifcallback, lpvcontext: MutPtr, lppadvisesink: MutPtr): Hresult =
    if (windowsWin32SystemAddressbookNapiAddon != null) (windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookHrAllocAdviseSink(0L.toString(), lpvcontext.rawAddress.toString(), lppadvisesink.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hrDispatchNotifications(ulflags: UInt): Hresult =
    if (windowsWin32SystemAddressbookNapiAddon != null) (windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookHrDispatchNotifications(ulflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hrGetOneProp(lpmapiprop: MutPtr, ulproptag: UInt, lppprop: MutPtr): Hresult =
    if (windowsWin32SystemAddressbookNapiAddon != null) (windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookHrGetOneProp(lpmapiprop.rawAddress.toString(), ulproptag.toInt(), lppprop.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hrIStorageFromStream(lpunkin: MutPtr, lpinterface: MutPtr, ulflags: UInt, lppstorageout: MutPtr): Hresult =
    if (windowsWin32SystemAddressbookNapiAddon != null) (windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookHrIStorageFromStream(lpunkin.rawAddress.toString(), lpinterface.rawAddress.toString(), ulflags.toInt(), lppstorageout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hrQueryAllRows(lptable: MutPtr, lpproptags: MutPtr, lprestriction: MutPtr, lpsortorderset: MutPtr, crowsmax: Int, lpprows: MutPtr): Hresult =
    if (windowsWin32SystemAddressbookNapiAddon != null) (windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookHrQueryAllRows(lptable.rawAddress.toString(), lpproptags.rawAddress.toString(), lprestriction.rawAddress.toString(), lpsortorderset.rawAddress.toString(), crowsmax, lpprows.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hrSetOneProp(lpmapiprop: MutPtr, lpprop: MutPtr): Hresult =
    if (windowsWin32SystemAddressbookNapiAddon != null) (windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookHrSetOneProp(lpmapiprop.rawAddress.toString(), lpprop.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hrThisThreadAdviseSink(lpadvisesink: MutPtr, lppadvisesink: MutPtr): Hresult =
    if (windowsWin32SystemAddressbookNapiAddon != null) (windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookHrThisThreadAdviseSink(lpadvisesink.rawAddress.toString(), lppadvisesink.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lPropCompareProp(lpspropvaluea: MutPtr, lpspropvalueb: MutPtr): Int =
    if (windowsWin32SystemAddressbookNapiAddon != null) (windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookLPropCompareProp(lpspropvaluea.rawAddress.toString(), lpspropvalueb.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lpValFindProp(ulproptag: UInt, cvalues: UInt, lpproparray: MutPtr): MutPtr =
    if (windowsWin32SystemAddressbookNapiAddon != null) MutPtr((windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookLpValFindProp(ulproptag.toInt(), cvalues.toInt(), lpproparray.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mAPIDeinitIdle() {
    if (windowsWin32SystemAddressbookNapiAddon != null) {
        windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookMAPIDeinitIdle()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mAPIGetDefaultMalloc(): MutPtr =
    if (windowsWin32SystemAddressbookNapiAddon != null) MutPtr((windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookMAPIGetDefaultMalloc() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mAPIInitIdle(lpvreserved: MutPtr): Int =
    if (windowsWin32SystemAddressbookNapiAddon != null) (windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookMAPIInitIdle(lpvreserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openStreamOnFile(lpallocatebuffer: Lpallocatebuffer, lpfreebuffer: Lpfreebuffer, ulflags: UInt, lpszfilename: ConstPtr, lpszprefix: ConstPtr, lppstream: MutPtr): Hresult =
    if (windowsWin32SystemAddressbookNapiAddon != null) (windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookOpenStreamOnFile(0L.toString(), 0L.toString(), ulflags.toInt(), lpszfilename.rawAddress.toString(), lpszprefix.rawAddress.toString(), lppstream.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ppropFindProp(lpproparray: MutPtr, cvalues: UInt, ulproptag: UInt): MutPtr =
    if (windowsWin32SystemAddressbookNapiAddon != null) MutPtr((windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookPpropFindProp(lpproparray.rawAddress.toString(), cvalues.toInt(), ulproptag.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propCopyMore(lpspropvaluedest: MutPtr, lpspropvaluesrc: MutPtr, lpfallocmore: Lpallocatemore, lpvobject: MutPtr): Int =
    if (windowsWin32SystemAddressbookNapiAddon != null) (windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookPropCopyMore(lpspropvaluedest.rawAddress.toString(), lpspropvaluesrc.rawAddress.toString(), 0L.toString(), lpvobject.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rTFSync(lpmessage: MutPtr, ulflags: UInt, lpfmessageupdated: MutPtr): Hresult =
    if (windowsWin32SystemAddressbookNapiAddon != null) (windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookRTFSync(lpmessage.rawAddress.toString(), ulflags.toInt(), lpfmessageupdated.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scCopyNotifications(cnotification: Int, lpnotifications: MutPtr, lpvdst: MutPtr, lpcb: MutPtr): Int =
    if (windowsWin32SystemAddressbookNapiAddon != null) (windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookScCopyNotifications(cnotification, lpnotifications.rawAddress.toString(), lpvdst.rawAddress.toString(), lpcb.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scCopyProps(cvalues: Int, lpproparray: MutPtr, lpvdst: MutPtr, lpcb: MutPtr): Int =
    if (windowsWin32SystemAddressbookNapiAddon != null) (windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookScCopyProps(cvalues, lpproparray.rawAddress.toString(), lpvdst.rawAddress.toString(), lpcb.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scCountNotifications(cnotifications: Int, lpnotifications: MutPtr, lpcb: MutPtr): Int =
    if (windowsWin32SystemAddressbookNapiAddon != null) (windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookScCountNotifications(cnotifications, lpnotifications.rawAddress.toString(), lpcb.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scCountProps(cvalues: Int, lpproparray: MutPtr, lpcb: MutPtr): Int =
    if (windowsWin32SystemAddressbookNapiAddon != null) (windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookScCountProps(cvalues, lpproparray.rawAddress.toString(), lpcb.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scCreateConversationIndex(cbparent: UInt, lpbparent: MutPtr, lpcbconvindex: MutPtr, lppbconvindex: MutPtr): Int =
    if (windowsWin32SystemAddressbookNapiAddon != null) (windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookScCreateConversationIndex(cbparent.toInt(), lpbparent.rawAddress.toString(), lpcbconvindex.rawAddress.toString(), lppbconvindex.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scDupPropset(cvalues: Int, lpproparray: MutPtr, lpallocatebuffer: Lpallocatebuffer, lppproparray: MutPtr): Int =
    if (windowsWin32SystemAddressbookNapiAddon != null) (windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookScDupPropset(cvalues, lpproparray.rawAddress.toString(), 0L.toString(), lppproparray.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scInitMapiUtil(ulflags: UInt): Int =
    if (windowsWin32SystemAddressbookNapiAddon != null) (windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookScInitMapiUtil(ulflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scLocalPathFromUNC(lpszunc: Pcstr, lpszlocal: Pcstr, cchlocal: UInt): Int =
    if (windowsWin32SystemAddressbookNapiAddon != null) (windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookScLocalPathFromUNC(lpszunc.rawAddress.toString(), lpszlocal.rawAddress.toString(), cchlocal.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scRelocNotifications(cnotification: Int, lpnotifications: MutPtr, lpvbaseold: MutPtr, lpvbasenew: MutPtr, lpcb: MutPtr): Int =
    if (windowsWin32SystemAddressbookNapiAddon != null) (windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookScRelocNotifications(cnotification, lpnotifications.rawAddress.toString(), lpvbaseold.rawAddress.toString(), lpvbasenew.rawAddress.toString(), lpcb.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scRelocProps(cvalues: Int, lpproparray: MutPtr, lpvbaseold: MutPtr, lpvbasenew: MutPtr, lpcb: MutPtr): Int =
    if (windowsWin32SystemAddressbookNapiAddon != null) (windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookScRelocProps(cvalues, lpproparray.rawAddress.toString(), lpvbaseold.rawAddress.toString(), lpvbasenew.rawAddress.toString(), lpcb.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scUNCFromLocalPath(lpszlocal: Pcstr, lpszunc: Pcstr, cchunc: UInt): Int =
    if (windowsWin32SystemAddressbookNapiAddon != null) (windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookScUNCFromLocalPath(lpszlocal.rawAddress.toString(), lpszunc.rawAddress.toString(), cchunc.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun szFindCh(lpsz: MutPtr, ch: UShort): MutPtr =
    if (windowsWin32SystemAddressbookNapiAddon != null) MutPtr((windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookSzFindCh(lpsz.rawAddress.toString(), ch.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun szFindLastCh(lpsz: MutPtr, ch: UShort): MutPtr =
    if (windowsWin32SystemAddressbookNapiAddon != null) MutPtr((windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookSzFindLastCh(lpsz.rawAddress.toString(), ch.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun szFindSz(lpsz: MutPtr, lpszkey: MutPtr): MutPtr =
    if (windowsWin32SystemAddressbookNapiAddon != null) MutPtr((windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookSzFindSz(lpsz.rawAddress.toString(), lpszkey.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uFromSz(lpsz: MutPtr): UInt =
    if (windowsWin32SystemAddressbookNapiAddon != null) (windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookUFromSz(lpsz.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulAddRef(lpunk: MutPtr): UInt =
    if (windowsWin32SystemAddressbookNapiAddon != null) (windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookUlAddRef(lpunk.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulPropSize(lpspropvalue: MutPtr): UInt =
    if (windowsWin32SystemAddressbookNapiAddon != null) (windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookUlPropSize(lpspropvalue.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulRelease(lpunk: MutPtr): UInt =
    if (windowsWin32SystemAddressbookNapiAddon != null) (windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookUlRelease(lpunk.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wrapCompressedRTFStream(lpcompressedrtfstream: MutPtr, ulflags: UInt, lpuncompressedrtfstream: MutPtr): Hresult =
    if (windowsWin32SystemAddressbookNapiAddon != null) (windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookWrapCompressedRTFStream(lpcompressedrtfstream.rawAddress.toString(), ulflags.toInt(), lpuncompressedrtfstream.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wrapStoreEntryID(ulflags: UInt, lpszdllname: ConstPtr, cborigentry: UInt, lporigentry: ConstPtr, lpcbwrappedentry: MutPtr, lppwrappedentry: MutPtr): Hresult =
    if (windowsWin32SystemAddressbookNapiAddon != null) (windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookWrapStoreEntryID(ulflags.toInt(), lpszdllname.rawAddress.toString(), cborigentry.toInt(), lporigentry.rawAddress.toString(), lpcbwrappedentry.rawAddress.toString(), lppwrappedentry.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
