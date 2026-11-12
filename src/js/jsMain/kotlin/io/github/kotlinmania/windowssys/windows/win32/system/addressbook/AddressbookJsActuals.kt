@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.addressbook

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance

private val windowsWin32SystemAddressbookNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun buildDisplayTable(lpallocatebuffer: Lpallocatebuffer, lpallocatemore: Lpallocatemore, lpfreebuffer: Lpfreebuffer, lpmalloc: MutPtr<CVoid>, hinstance: Hinstance, cpages: UInt, lppage: MutPtr<Dtpage>, ulflags: UInt, lpptable: MutPtr<MutPtr<CVoid>>, lpptbldata: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemAddressbookNapiAddon != null) (windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookBuildDisplayTable(0L.toString(), 0L.toString(), 0L.toString(), lpmalloc.rawAddress.toString(), hinstance.rawAddress.toString(), cpages.toInt(), lppage.rawAddress.toString(), ulflags.toInt(), lpptable.rawAddress.toString(), lpptbldata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun changeIdleRoutine(ftg: MutPtr<CVoid>, lpfnidle: Pfnidle, lpvidleparam: MutPtr<CVoid>, priidle: Short, csecidle: UInt, iroidle: UShort, ircidle: UShort) {
    if (windowsWin32SystemAddressbookNapiAddon != null) {
        windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookChangeIdleRoutine(ftg.rawAddress.toString(), 0L.toString(), lpvidleparam.rawAddress.toString(), priidle.toInt(), csecidle.toInt(), iroidle.toInt(), ircidle.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun createIProp(lpinterface: MutPtr<Guid>, lpallocatebuffer: Lpallocatebuffer, lpallocatemore: Lpallocatemore, lpfreebuffer: Lpfreebuffer, lpvreserved: MutPtr<CVoid>, lpppropdata: MutPtr<MutPtr<CVoid>>): Int =
    if (windowsWin32SystemAddressbookNapiAddon != null) (windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookCreateIProp(lpinterface.rawAddress.toString(), 0L.toString(), 0L.toString(), 0L.toString(), lpvreserved.rawAddress.toString(), lpppropdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createTable(lpinterface: MutPtr<Guid>, lpallocatebuffer: Lpallocatebuffer, lpallocatemore: Lpallocatemore, lpfreebuffer: Lpfreebuffer, lpvreserved: MutPtr<CVoid>, ultabletype: UInt, ulproptagindexcolumn: UInt, lpsproptagarraycolumns: MutPtr<SPropTagArray>, lpptabledata: MutPtr<MutPtr<CVoid>>): Int =
    if (windowsWin32SystemAddressbookNapiAddon != null) (windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookCreateTable(lpinterface.rawAddress.toString(), 0L.toString(), 0L.toString(), 0L.toString(), lpvreserved.rawAddress.toString(), ultabletype.toInt(), ulproptagindexcolumn.toInt(), lpsproptagarraycolumns.rawAddress.toString(), lpptabledata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deinitMapiUtil() {
    if (windowsWin32SystemAddressbookNapiAddon != null) {
        windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookDeinitMapiUtil()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun deregisterIdleRoutine(ftg: MutPtr<CVoid>) {
    if (windowsWin32SystemAddressbookNapiAddon != null) {
        windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookDeregisterIdleRoutine(ftg.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun enableIdleRoutine(ftg: MutPtr<CVoid>, fenable: Bool) {
    if (windowsWin32SystemAddressbookNapiAddon != null) {
        windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookEnableIdleRoutine(ftg.rawAddress.toString(), fenable)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fEqualNames(lpname1: MutPtr<Mapinameid>, lpname2: MutPtr<Mapinameid>): Bool =
    if (windowsWin32SystemAddressbookNapiAddon != null) (windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookFEqualNames(lpname1.rawAddress.toString(), lpname2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fPropCompareProp(lpspropvalue1: MutPtr<SPropValue>, ulrelop: UInt, lpspropvalue2: MutPtr<SPropValue>): Bool =
    if (windowsWin32SystemAddressbookNapiAddon != null) (windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookFPropCompareProp(lpspropvalue1.rawAddress.toString(), ulrelop.toInt(), lpspropvalue2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fPropContainsProp(lpspropvaluedst: MutPtr<SPropValue>, lpspropvaluesrc: MutPtr<SPropValue>, ulfuzzylevel: UInt): Bool =
    if (windowsWin32SystemAddressbookNapiAddon != null) (windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookFPropContainsProp(lpspropvaluedst.rawAddress.toString(), lpspropvaluesrc.rawAddress.toString(), ulfuzzylevel.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fPropExists(lpmapiprop: MutPtr<CVoid>, ulproptag: UInt): Bool =
    if (windowsWin32SystemAddressbookNapiAddon != null) (windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookFPropExists(lpmapiprop.rawAddress.toString(), ulproptag.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freePadrlist(lpadrlist: MutPtr<Adrlist>) {
    if (windowsWin32SystemAddressbookNapiAddon != null) {
        windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookFreePadrlist(lpadrlist.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun freeProws(lprows: MutPtr<SRowSet>) {
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

public actual fun ftgRegisterIdleRoutine(lpfnidle: Pfnidle, lpvidleparam: MutPtr<CVoid>, priidle: Short, csecidle: UInt, iroidle: UShort): MutPtr<CVoid> =
    if (windowsWin32SystemAddressbookNapiAddon != null) MutPtr((windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookFtgRegisterIdleRoutine(0L.toString(), lpvidleparam.rawAddress.toString(), priidle.toInt(), csecidle.toInt(), iroidle.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hrAddColumns(lptbl: MutPtr<CVoid>, lpproptagcolumnsnew: MutPtr<SPropTagArray>, lpallocatebuffer: Lpallocatebuffer, lpfreebuffer: Lpfreebuffer): Hresult =
    if (windowsWin32SystemAddressbookNapiAddon != null) (windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookHrAddColumns(lptbl.rawAddress.toString(), lpproptagcolumnsnew.rawAddress.toString(), 0L.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hrAddColumnsEx(lptbl: MutPtr<CVoid>, lpproptagcolumnsnew: MutPtr<SPropTagArray>, lpallocatebuffer: Lpallocatebuffer, lpfreebuffer: Lpfreebuffer, lpfnfiltercolumns: Long): Hresult =
    if (windowsWin32SystemAddressbookNapiAddon != null) (windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookHrAddColumnsEx(lptbl.rawAddress.toString(), lpproptagcolumnsnew.rawAddress.toString(), 0L.toString(), 0L.toString(), lpfnfiltercolumns.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hrAllocAdviseSink(lpfncallback: Lpnotifcallback, lpvcontext: MutPtr<CVoid>, lppadvisesink: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemAddressbookNapiAddon != null) (windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookHrAllocAdviseSink(0L.toString(), lpvcontext.rawAddress.toString(), lppadvisesink.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hrDispatchNotifications(ulflags: UInt): Hresult =
    if (windowsWin32SystemAddressbookNapiAddon != null) (windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookHrDispatchNotifications(ulflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hrGetOneProp(lpmapiprop: MutPtr<CVoid>, ulproptag: UInt, lppprop: MutPtr<MutPtr<SPropValue>>): Hresult =
    if (windowsWin32SystemAddressbookNapiAddon != null) (windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookHrGetOneProp(lpmapiprop.rawAddress.toString(), ulproptag.toInt(), lppprop.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hrIStorageFromStream(lpunkin: MutPtr<CVoid>, lpinterface: MutPtr<Guid>, ulflags: UInt, lppstorageout: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemAddressbookNapiAddon != null) (windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookHrIStorageFromStream(lpunkin.rawAddress.toString(), lpinterface.rawAddress.toString(), ulflags.toInt(), lppstorageout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hrQueryAllRows(lptable: MutPtr<CVoid>, lpproptags: MutPtr<SPropTagArray>, lprestriction: MutPtr<SRestriction>, lpsortorderset: MutPtr<SSortOrderSet>, crowsmax: Int, lpprows: MutPtr<MutPtr<SRowSet>>): Hresult =
    if (windowsWin32SystemAddressbookNapiAddon != null) (windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookHrQueryAllRows(lptable.rawAddress.toString(), lpproptags.rawAddress.toString(), lprestriction.rawAddress.toString(), lpsortorderset.rawAddress.toString(), crowsmax, lpprows.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hrSetOneProp(lpmapiprop: MutPtr<CVoid>, lpprop: MutPtr<SPropValue>): Hresult =
    if (windowsWin32SystemAddressbookNapiAddon != null) (windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookHrSetOneProp(lpmapiprop.rawAddress.toString(), lpprop.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hrThisThreadAdviseSink(lpadvisesink: MutPtr<CVoid>, lppadvisesink: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemAddressbookNapiAddon != null) (windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookHrThisThreadAdviseSink(lpadvisesink.rawAddress.toString(), lppadvisesink.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lPropCompareProp(lpspropvaluea: MutPtr<SPropValue>, lpspropvalueb: MutPtr<SPropValue>): Int =
    if (windowsWin32SystemAddressbookNapiAddon != null) (windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookLPropCompareProp(lpspropvaluea.rawAddress.toString(), lpspropvalueb.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lpValFindProp(ulproptag: UInt, cvalues: UInt, lpproparray: MutPtr<SPropValue>): MutPtr<SPropValue> =
    if (windowsWin32SystemAddressbookNapiAddon != null) MutPtr((windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookLpValFindProp(ulproptag.toInt(), cvalues.toInt(), lpproparray.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mAPIDeinitIdle() {
    if (windowsWin32SystemAddressbookNapiAddon != null) {
        windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookMAPIDeinitIdle()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mAPIGetDefaultMalloc(): MutPtr<CVoid> =
    if (windowsWin32SystemAddressbookNapiAddon != null) MutPtr((windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookMAPIGetDefaultMalloc() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mAPIInitIdle(lpvreserved: MutPtr<CVoid>): Int =
    if (windowsWin32SystemAddressbookNapiAddon != null) (windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookMAPIInitIdle(lpvreserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openStreamOnFile(lpallocatebuffer: Lpallocatebuffer, lpfreebuffer: Lpfreebuffer, ulflags: UInt, lpszfilename: ConstPtr<Byte>, lpszprefix: ConstPtr<Byte>, lppstream: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemAddressbookNapiAddon != null) (windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookOpenStreamOnFile(0L.toString(), 0L.toString(), ulflags.toInt(), lpszfilename.rawAddress.toString(), lpszprefix.rawAddress.toString(), lppstream.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ppropFindProp(lpproparray: MutPtr<SPropValue>, cvalues: UInt, ulproptag: UInt): MutPtr<SPropValue> =
    if (windowsWin32SystemAddressbookNapiAddon != null) MutPtr((windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookPpropFindProp(lpproparray.rawAddress.toString(), cvalues.toInt(), ulproptag.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propCopyMore(lpspropvaluedest: MutPtr<SPropValue>, lpspropvaluesrc: MutPtr<SPropValue>, lpfallocmore: Lpallocatemore, lpvobject: MutPtr<CVoid>): Int =
    if (windowsWin32SystemAddressbookNapiAddon != null) (windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookPropCopyMore(lpspropvaluedest.rawAddress.toString(), lpspropvaluesrc.rawAddress.toString(), 0L.toString(), lpvobject.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rTFSync(lpmessage: MutPtr<CVoid>, ulflags: UInt, lpfmessageupdated: MutPtr<Bool>): Hresult =
    if (windowsWin32SystemAddressbookNapiAddon != null) (windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookRTFSync(lpmessage.rawAddress.toString(), ulflags.toInt(), lpfmessageupdated.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scCopyNotifications(cnotification: Int, lpnotifications: MutPtr<Notification>, lpvdst: MutPtr<CVoid>, lpcb: MutPtr<UInt>): Int =
    if (windowsWin32SystemAddressbookNapiAddon != null) (windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookScCopyNotifications(cnotification, lpnotifications.rawAddress.toString(), lpvdst.rawAddress.toString(), lpcb.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scCopyProps(cvalues: Int, lpproparray: MutPtr<SPropValue>, lpvdst: MutPtr<CVoid>, lpcb: MutPtr<UInt>): Int =
    if (windowsWin32SystemAddressbookNapiAddon != null) (windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookScCopyProps(cvalues, lpproparray.rawAddress.toString(), lpvdst.rawAddress.toString(), lpcb.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scCountNotifications(cnotifications: Int, lpnotifications: MutPtr<Notification>, lpcb: MutPtr<UInt>): Int =
    if (windowsWin32SystemAddressbookNapiAddon != null) (windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookScCountNotifications(cnotifications, lpnotifications.rawAddress.toString(), lpcb.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scCountProps(cvalues: Int, lpproparray: MutPtr<SPropValue>, lpcb: MutPtr<UInt>): Int =
    if (windowsWin32SystemAddressbookNapiAddon != null) (windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookScCountProps(cvalues, lpproparray.rawAddress.toString(), lpcb.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scCreateConversationIndex(cbparent: UInt, lpbparent: MutPtr<UByte>, lpcbconvindex: MutPtr<UInt>, lppbconvindex: MutPtr<MutPtr<UByte>>): Int =
    if (windowsWin32SystemAddressbookNapiAddon != null) (windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookScCreateConversationIndex(cbparent.toInt(), lpbparent.rawAddress.toString(), lpcbconvindex.rawAddress.toString(), lppbconvindex.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scDupPropset(cvalues: Int, lpproparray: MutPtr<SPropValue>, lpallocatebuffer: Lpallocatebuffer, lppproparray: MutPtr<MutPtr<SPropValue>>): Int =
    if (windowsWin32SystemAddressbookNapiAddon != null) (windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookScDupPropset(cvalues, lpproparray.rawAddress.toString(), 0L.toString(), lppproparray.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scInitMapiUtil(ulflags: UInt): Int =
    if (windowsWin32SystemAddressbookNapiAddon != null) (windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookScInitMapiUtil(ulflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scLocalPathFromUNC(lpszunc: Pcstr, lpszlocal: Pcstr, cchlocal: UInt): Int =
    if (windowsWin32SystemAddressbookNapiAddon != null) (windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookScLocalPathFromUNC(lpszunc.rawAddress.toString(), lpszlocal.rawAddress.toString(), cchlocal.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scRelocNotifications(cnotification: Int, lpnotifications: MutPtr<Notification>, lpvbaseold: MutPtr<CVoid>, lpvbasenew: MutPtr<CVoid>, lpcb: MutPtr<UInt>): Int =
    if (windowsWin32SystemAddressbookNapiAddon != null) (windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookScRelocNotifications(cnotification, lpnotifications.rawAddress.toString(), lpvbaseold.rawAddress.toString(), lpvbasenew.rawAddress.toString(), lpcb.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scRelocProps(cvalues: Int, lpproparray: MutPtr<SPropValue>, lpvbaseold: MutPtr<CVoid>, lpvbasenew: MutPtr<CVoid>, lpcb: MutPtr<UInt>): Int =
    if (windowsWin32SystemAddressbookNapiAddon != null) (windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookScRelocProps(cvalues, lpproparray.rawAddress.toString(), lpvbaseold.rawAddress.toString(), lpvbasenew.rawAddress.toString(), lpcb.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scUNCFromLocalPath(lpszlocal: Pcstr, lpszunc: Pcstr, cchunc: UInt): Int =
    if (windowsWin32SystemAddressbookNapiAddon != null) (windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookScUNCFromLocalPath(lpszlocal.rawAddress.toString(), lpszunc.rawAddress.toString(), cchunc.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun szFindCh(lpsz: MutPtr<Byte>, ch: UShort): MutPtr<Byte> =
    if (windowsWin32SystemAddressbookNapiAddon != null) MutPtr((windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookSzFindCh(lpsz.rawAddress.toString(), ch.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun szFindLastCh(lpsz: MutPtr<Byte>, ch: UShort): MutPtr<Byte> =
    if (windowsWin32SystemAddressbookNapiAddon != null) MutPtr((windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookSzFindLastCh(lpsz.rawAddress.toString(), ch.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun szFindSz(lpsz: MutPtr<Byte>, lpszkey: MutPtr<Byte>): MutPtr<Byte> =
    if (windowsWin32SystemAddressbookNapiAddon != null) MutPtr((windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookSzFindSz(lpsz.rawAddress.toString(), lpszkey.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uFromSz(lpsz: MutPtr<Byte>): UInt =
    if (windowsWin32SystemAddressbookNapiAddon != null) (windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookUFromSz(lpsz.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulAddRef(lpunk: MutPtr<CVoid>): UInt =
    if (windowsWin32SystemAddressbookNapiAddon != null) (windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookUlAddRef(lpunk.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulPropSize(lpspropvalue: MutPtr<SPropValue>): UInt =
    if (windowsWin32SystemAddressbookNapiAddon != null) (windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookUlPropSize(lpspropvalue.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulRelease(lpunk: MutPtr<CVoid>): UInt =
    if (windowsWin32SystemAddressbookNapiAddon != null) (windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookUlRelease(lpunk.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wrapCompressedRTFStream(lpcompressedrtfstream: MutPtr<CVoid>, ulflags: UInt, lpuncompressedrtfstream: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemAddressbookNapiAddon != null) (windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookWrapCompressedRTFStream(lpcompressedrtfstream.rawAddress.toString(), ulflags.toInt(), lpuncompressedrtfstream.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wrapStoreEntryID(ulflags: UInt, lpszdllname: ConstPtr<Byte>, cborigentry: UInt, lporigentry: ConstPtr<Entryid>, lpcbwrappedentry: MutPtr<UInt>, lppwrappedentry: MutPtr<MutPtr<Entryid>>): Hresult =
    if (windowsWin32SystemAddressbookNapiAddon != null) (windowsWin32SystemAddressbookNapiAddon.windowssysWindowsWin32SystemAddressbookWrapStoreEntryID(ulflags.toInt(), lpszdllname.rawAddress.toString(), cborigentry.toInt(), lporigentry.rawAddress.toString(), lpcbwrappedentry.rawAddress.toString(), lppwrappedentry.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
