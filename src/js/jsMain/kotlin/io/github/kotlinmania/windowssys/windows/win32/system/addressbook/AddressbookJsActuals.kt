@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.addressbook

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.FILETIME
import io.github.kotlinmania.windowssys.windows.win32.foundation.HINSTANCE

private val _windowsWin32SystemAddressbookNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun BuildDisplayTable(lpallocatebuffer: LPALLOCATEBUFFER, lpallocatemore: LPALLOCATEMORE, lpfreebuffer: LPFREEBUFFER, lpmalloc: Long, hinstance: HINSTANCE, cpages: UInt, lppage: Long, ulflags: UInt, lpptable: Long, lpptbldata: Long): HRESULT =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_BuildDisplayTable(lpallocatebuffer.toLong().toString(), lpallocatemore.toLong().toString(), lpfreebuffer.toLong().toString(), lpmalloc.toString(), hinstance.toString(), cpages.toInt(), lppage.toString(), ulflags.toInt(), lpptable.toString(), lpptbldata.toString()) as Int) else 0

public actual fun ChangeIdleRoutine(ftg: Long, lpfnidle: PFNIDLE, lpvidleparam: Long, priidle: Short, csecidle: UInt, iroidle: UShort, ircidle: UShort) {
    if (_windowsWin32SystemAddressbookNapiAddon != null) {
        _windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_ChangeIdleRoutine(ftg.toString(), lpfnidle.toLong().toString(), lpvidleparam.toString(), priidle.toInt(), csecidle.toInt(), iroidle.toInt(), ircidle.toInt())
    }
}

public actual fun CreateIProp(lpinterface: Long, lpallocatebuffer: LPALLOCATEBUFFER, lpallocatemore: LPALLOCATEMORE, lpfreebuffer: LPFREEBUFFER, lpvreserved: Long, lpppropdata: Long): Int =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_CreateIProp(lpinterface.toString(), lpallocatebuffer.toLong().toString(), lpallocatemore.toLong().toString(), lpfreebuffer.toLong().toString(), lpvreserved.toString(), lpppropdata.toString()) as Int) else 0

public actual fun CreateTable(lpinterface: Long, lpallocatebuffer: LPALLOCATEBUFFER, lpallocatemore: LPALLOCATEMORE, lpfreebuffer: LPFREEBUFFER, lpvreserved: Long, ultabletype: UInt, ulproptagindexcolumn: UInt, lpsproptagarraycolumns: Long, lpptabledata: Long): Int =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_CreateTable(lpinterface.toString(), lpallocatebuffer.toLong().toString(), lpallocatemore.toLong().toString(), lpfreebuffer.toLong().toString(), lpvreserved.toString(), ultabletype.toInt(), ulproptagindexcolumn.toInt(), lpsproptagarraycolumns.toString(), lpptabledata.toString()) as Int) else 0

public actual fun DeinitMapiUtil() {
    if (_windowsWin32SystemAddressbookNapiAddon != null) {
        _windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_DeinitMapiUtil()
    }
}

public actual fun DeregisterIdleRoutine(ftg: Long) {
    if (_windowsWin32SystemAddressbookNapiAddon != null) {
        _windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_DeregisterIdleRoutine(ftg.toString())
    }
}

public actual fun EnableIdleRoutine(ftg: Long, fenable: BOOL) {
    if (_windowsWin32SystemAddressbookNapiAddon != null) {
        _windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_EnableIdleRoutine(ftg.toString(), fenable)
    }
}

public actual fun FEqualNames(lpname1: Long, lpname2: Long): BOOL =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_FEqualNames(lpname1.toString(), lpname2.toString()) as Int) else 0

public actual fun FPropCompareProp(lpspropvalue1: Long, ulrelop: UInt, lpspropvalue2: Long): BOOL =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_FPropCompareProp(lpspropvalue1.toString(), ulrelop.toInt(), lpspropvalue2.toString()) as Int) else 0

public actual fun FPropContainsProp(lpspropvaluedst: Long, lpspropvaluesrc: Long, ulfuzzylevel: UInt): BOOL =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_FPropContainsProp(lpspropvaluedst.toString(), lpspropvaluesrc.toString(), ulfuzzylevel.toInt()) as Int) else 0

public actual fun FPropExists(lpmapiprop: Long, ulproptag: UInt): BOOL =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_FPropExists(lpmapiprop.toString(), ulproptag.toInt()) as Int) else 0

public actual fun FreePadrlist(lpadrlist: Long) {
    if (_windowsWin32SystemAddressbookNapiAddon != null) {
        _windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_FreePadrlist(lpadrlist.toString())
    }
}

public actual fun FreeProws(lprows: Long) {
    if (_windowsWin32SystemAddressbookNapiAddon != null) {
        _windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_FreeProws(lprows.toString())
    }
}

public actual fun FtAddFt(ftaddend1: FILETIME, ftaddend2: FILETIME): FILETIME =
    FILETIME()

public actual fun FtMulDw(ftmultiplier: UInt, ftmultiplicand: FILETIME): FILETIME =
    FILETIME()

public actual fun FtMulDwDw(ftmultiplicand: UInt, ftmultiplier: UInt): FILETIME =
    FILETIME()

public actual fun FtNegFt(ft: FILETIME): FILETIME =
    FILETIME()

public actual fun FtSubFt(ftminuend: FILETIME, ftsubtrahend: FILETIME): FILETIME =
    FILETIME()

public actual fun FtgRegisterIdleRoutine(lpfnidle: PFNIDLE, lpvidleparam: Long, priidle: Short, csecidle: UInt, iroidle: UShort): Long =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_FtgRegisterIdleRoutine(lpfnidle.toLong().toString(), lpvidleparam.toString(), priidle.toInt(), csecidle.toInt(), iroidle.toInt()) as String).toLong() else 0L

public actual fun HrAddColumns(lptbl: Long, lpproptagcolumnsnew: Long, lpallocatebuffer: LPALLOCATEBUFFER, lpfreebuffer: LPFREEBUFFER): HRESULT =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_HrAddColumns(lptbl.toString(), lpproptagcolumnsnew.toString(), lpallocatebuffer.toLong().toString(), lpfreebuffer.toLong().toString()) as Int) else 0

public actual fun HrAddColumnsEx(lptbl: Long, lpproptagcolumnsnew: Long, lpallocatebuffer: LPALLOCATEBUFFER, lpfreebuffer: LPFREEBUFFER, lpfnfiltercolumns: Long): HRESULT =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_HrAddColumnsEx(lptbl.toString(), lpproptagcolumnsnew.toString(), lpallocatebuffer.toLong().toString(), lpfreebuffer.toLong().toString(), lpfnfiltercolumns.toString()) as Int) else 0

public actual fun HrAllocAdviseSink(lpfncallback: LPNOTIFCALLBACK, lpvcontext: Long, lppadvisesink: Long): HRESULT =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_HrAllocAdviseSink(lpfncallback.toLong().toString(), lpvcontext.toString(), lppadvisesink.toString()) as Int) else 0

public actual fun HrDispatchNotifications(ulflags: UInt): HRESULT =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_HrDispatchNotifications(ulflags.toInt()) as Int) else 0

public actual fun HrGetOneProp(lpmapiprop: Long, ulproptag: UInt, lppprop: Long): HRESULT =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_HrGetOneProp(lpmapiprop.toString(), ulproptag.toInt(), lppprop.toString()) as Int) else 0

public actual fun HrIStorageFromStream(lpunkin: Long, lpinterface: Long, ulflags: UInt, lppstorageout: Long): HRESULT =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_HrIStorageFromStream(lpunkin.toString(), lpinterface.toString(), ulflags.toInt(), lppstorageout.toString()) as Int) else 0

public actual fun HrQueryAllRows(lptable: Long, lpproptags: Long, lprestriction: Long, lpsortorderset: Long, crowsmax: Int, lpprows: Long): HRESULT =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_HrQueryAllRows(lptable.toString(), lpproptags.toString(), lprestriction.toString(), lpsortorderset.toString(), crowsmax, lpprows.toString()) as Int) else 0

public actual fun HrSetOneProp(lpmapiprop: Long, lpprop: Long): HRESULT =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_HrSetOneProp(lpmapiprop.toString(), lpprop.toString()) as Int) else 0

public actual fun HrThisThreadAdviseSink(lpadvisesink: Long, lppadvisesink: Long): HRESULT =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_HrThisThreadAdviseSink(lpadvisesink.toString(), lppadvisesink.toString()) as Int) else 0

public actual fun LPropCompareProp(lpspropvaluea: Long, lpspropvalueb: Long): Int =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_LPropCompareProp(lpspropvaluea.toString(), lpspropvalueb.toString()) as Int) else 0

public actual fun LpValFindProp(ulproptag: UInt, cvalues: UInt, lpproparray: Long): Long =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_LpValFindProp(ulproptag.toInt(), cvalues.toInt(), lpproparray.toString()) as String).toLong() else 0L

public actual fun MAPIDeinitIdle() {
    if (_windowsWin32SystemAddressbookNapiAddon != null) {
        _windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_MAPIDeinitIdle()
    }
}

public actual fun MAPIGetDefaultMalloc(): Long =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_MAPIGetDefaultMalloc() as String).toLong() else 0L

public actual fun MAPIInitIdle(lpvreserved: Long): Int =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_MAPIInitIdle(lpvreserved.toString()) as Int) else 0

public actual fun OpenStreamOnFile(lpallocatebuffer: LPALLOCATEBUFFER, lpfreebuffer: LPFREEBUFFER, ulflags: UInt, lpszfilename: Long, lpszprefix: Long, lppstream: Long): HRESULT =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_OpenStreamOnFile(lpallocatebuffer.toLong().toString(), lpfreebuffer.toLong().toString(), ulflags.toInt(), lpszfilename.toString(), lpszprefix.toString(), lppstream.toString()) as Int) else 0

public actual fun PpropFindProp(lpproparray: Long, cvalues: UInt, ulproptag: UInt): Long =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_PpropFindProp(lpproparray.toString(), cvalues.toInt(), ulproptag.toInt()) as String).toLong() else 0L

public actual fun PropCopyMore(lpspropvaluedest: Long, lpspropvaluesrc: Long, lpfallocmore: LPALLOCATEMORE, lpvobject: Long): Int =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_PropCopyMore(lpspropvaluedest.toString(), lpspropvaluesrc.toString(), lpfallocmore.toLong().toString(), lpvobject.toString()) as Int) else 0

public actual fun RTFSync(lpmessage: Long, ulflags: UInt, lpfmessageupdated: Long): HRESULT =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_RTFSync(lpmessage.toString(), ulflags.toInt(), lpfmessageupdated.toString()) as Int) else 0

public actual fun ScCopyNotifications(cnotification: Int, lpnotifications: Long, lpvdst: Long, lpcb: Long): Int =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_ScCopyNotifications(cnotification, lpnotifications.toString(), lpvdst.toString(), lpcb.toString()) as Int) else 0

public actual fun ScCopyProps(cvalues: Int, lpproparray: Long, lpvdst: Long, lpcb: Long): Int =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_ScCopyProps(cvalues, lpproparray.toString(), lpvdst.toString(), lpcb.toString()) as Int) else 0

public actual fun ScCountNotifications(cnotifications: Int, lpnotifications: Long, lpcb: Long): Int =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_ScCountNotifications(cnotifications, lpnotifications.toString(), lpcb.toString()) as Int) else 0

public actual fun ScCountProps(cvalues: Int, lpproparray: Long, lpcb: Long): Int =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_ScCountProps(cvalues, lpproparray.toString(), lpcb.toString()) as Int) else 0

public actual fun ScCreateConversationIndex(cbparent: UInt, lpbparent: Long, lpcbconvindex: Long, lppbconvindex: Long): Int =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_ScCreateConversationIndex(cbparent.toInt(), lpbparent.toString(), lpcbconvindex.toString(), lppbconvindex.toString()) as Int) else 0

public actual fun ScDupPropset(cvalues: Int, lpproparray: Long, lpallocatebuffer: LPALLOCATEBUFFER, lppproparray: Long): Int =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_ScDupPropset(cvalues, lpproparray.toString(), lpallocatebuffer.toLong().toString(), lppproparray.toString()) as Int) else 0

public actual fun ScInitMapiUtil(ulflags: UInt): Int =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_ScInitMapiUtil(ulflags.toInt()) as Int) else 0

public actual fun ScLocalPathFromUNC(lpszunc: PCSTR, lpszlocal: PCSTR, cchlocal: UInt): Int =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_ScLocalPathFromUNC(lpszunc.toString(), lpszlocal.toString(), cchlocal.toInt()) as Int) else 0

public actual fun ScRelocNotifications(cnotification: Int, lpnotifications: Long, lpvbaseold: Long, lpvbasenew: Long, lpcb: Long): Int =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_ScRelocNotifications(cnotification, lpnotifications.toString(), lpvbaseold.toString(), lpvbasenew.toString(), lpcb.toString()) as Int) else 0

public actual fun ScRelocProps(cvalues: Int, lpproparray: Long, lpvbaseold: Long, lpvbasenew: Long, lpcb: Long): Int =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_ScRelocProps(cvalues, lpproparray.toString(), lpvbaseold.toString(), lpvbasenew.toString(), lpcb.toString()) as Int) else 0

public actual fun ScUNCFromLocalPath(lpszlocal: PCSTR, lpszunc: PCSTR, cchunc: UInt): Int =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_ScUNCFromLocalPath(lpszlocal.toString(), lpszunc.toString(), cchunc.toInt()) as Int) else 0

public actual fun SzFindCh(lpsz: Long, ch: UShort): Long =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_SzFindCh(lpsz.toString(), ch.toInt()) as String).toLong() else 0L

public actual fun SzFindLastCh(lpsz: Long, ch: UShort): Long =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_SzFindLastCh(lpsz.toString(), ch.toInt()) as String).toLong() else 0L

public actual fun SzFindSz(lpsz: Long, lpszkey: Long): Long =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_SzFindSz(lpsz.toString(), lpszkey.toString()) as String).toLong() else 0L

public actual fun UFromSz(lpsz: Long): UInt =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_UFromSz(lpsz.toString()) as Int).toUInt() else 0u

public actual fun UlAddRef(lpunk: Long): UInt =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_UlAddRef(lpunk.toString()) as Int).toUInt() else 0u

public actual fun UlPropSize(lpspropvalue: Long): UInt =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_UlPropSize(lpspropvalue.toString()) as Int).toUInt() else 0u

public actual fun UlRelease(lpunk: Long): UInt =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_UlRelease(lpunk.toString()) as Int).toUInt() else 0u

public actual fun WrapCompressedRTFStream(lpcompressedrtfstream: Long, ulflags: UInt, lpuncompressedrtfstream: Long): HRESULT =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_WrapCompressedRTFStream(lpcompressedrtfstream.toString(), ulflags.toInt(), lpuncompressedrtfstream.toString()) as Int) else 0

public actual fun WrapStoreEntryID(ulflags: UInt, lpszdllname: Long, cborigentry: UInt, lporigentry: Long, lpcbwrappedentry: Long, lppwrappedentry: Long): HRESULT =
    if (_windowsWin32SystemAddressbookNapiAddon != null) (_windowsWin32SystemAddressbookNapiAddon.windowssys_windows_win32_system_addressbook_WrapStoreEntryID(ulflags.toInt(), lpszdllname.toString(), cborigentry.toInt(), lporigentry.toString(), lpcbwrappedentry.toString(), lppwrappedentry.toString()) as Int) else 0
