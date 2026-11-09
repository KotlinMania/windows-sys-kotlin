@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.addressbook

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.FILETIME
import io.github.kotlinmania.windowssys.windows.win32.foundation.HINSTANCE
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun BuildDisplayTable(lpallocatebuffer: LPALLOCATEBUFFER, lpallocatemore: LPALLOCATEMORE, lpfreebuffer: LPFREEBUFFER, lpmalloc: Long, hinstance: HINSTANCE, cpages: UInt, lppage: Long, ulflags: UInt, lpptable: Long, lpptbldata: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_BuildDisplayTable(lpallocatebuffer.toLong().toCPointer<ByteVar>(), lpallocatemore.toLong().toCPointer<ByteVar>(), lpfreebuffer.toLong().toCPointer<ByteVar>(), lpmalloc.toCPointer<ByteVar>(), hinstance.toCPointer<ByteVar>(), cpages, lppage.toCPointer<ByteVar>(), ulflags, lpptable.toCPointer<ByteVar>(), lpptbldata.toCPointer<ByteVar>())

public actual fun ChangeIdleRoutine(ftg: Long, lpfnidle: PFNIDLE, lpvidleparam: Long, priidle: Short, csecidle: UInt, iroidle: UShort, ircidle: UShort) {
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_ChangeIdleRoutine(ftg.toCPointer<ByteVar>(), lpfnidle.toLong().toCPointer<ByteVar>(), lpvidleparam.toCPointer<ByteVar>(), priidle, csecidle, iroidle, ircidle)
}

public actual fun CreateIProp(lpinterface: Long, lpallocatebuffer: LPALLOCATEBUFFER, lpallocatemore: LPALLOCATEMORE, lpfreebuffer: LPFREEBUFFER, lpvreserved: Long, lpppropdata: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_CreateIProp(lpinterface.toCPointer<ByteVar>(), lpallocatebuffer.toLong().toCPointer<ByteVar>(), lpallocatemore.toLong().toCPointer<ByteVar>(), lpfreebuffer.toLong().toCPointer<ByteVar>(), lpvreserved.toCPointer<ByteVar>(), lpppropdata.toCPointer<ByteVar>())

public actual fun CreateTable(lpinterface: Long, lpallocatebuffer: LPALLOCATEBUFFER, lpallocatemore: LPALLOCATEMORE, lpfreebuffer: LPFREEBUFFER, lpvreserved: Long, ultabletype: UInt, ulproptagindexcolumn: UInt, lpsproptagarraycolumns: Long, lpptabledata: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_CreateTable(lpinterface.toCPointer<ByteVar>(), lpallocatebuffer.toLong().toCPointer<ByteVar>(), lpallocatemore.toLong().toCPointer<ByteVar>(), lpfreebuffer.toLong().toCPointer<ByteVar>(), lpvreserved.toCPointer<ByteVar>(), ultabletype, ulproptagindexcolumn, lpsproptagarraycolumns.toCPointer<ByteVar>(), lpptabledata.toCPointer<ByteVar>())

public actual fun DeinitMapiUtil() {
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_DeinitMapiUtil()
}

public actual fun DeregisterIdleRoutine(ftg: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_DeregisterIdleRoutine(ftg.toCPointer<ByteVar>())
}

public actual fun EnableIdleRoutine(ftg: Long, fenable: BOOL) {
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_EnableIdleRoutine(ftg.toCPointer<ByteVar>(), fenable)
}

public actual fun FEqualNames(lpname1: Long, lpname2: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_FEqualNames(lpname1.toCPointer<ByteVar>(), lpname2.toCPointer<ByteVar>())

public actual fun FPropCompareProp(lpspropvalue1: Long, ulrelop: UInt, lpspropvalue2: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_FPropCompareProp(lpspropvalue1.toCPointer<ByteVar>(), ulrelop, lpspropvalue2.toCPointer<ByteVar>())

public actual fun FPropContainsProp(lpspropvaluedst: Long, lpspropvaluesrc: Long, ulfuzzylevel: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_FPropContainsProp(lpspropvaluedst.toCPointer<ByteVar>(), lpspropvaluesrc.toCPointer<ByteVar>(), ulfuzzylevel)

public actual fun FPropExists(lpmapiprop: Long, ulproptag: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_FPropExists(lpmapiprop.toCPointer<ByteVar>(), ulproptag)

public actual fun FreePadrlist(lpadrlist: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_FreePadrlist(lpadrlist.toCPointer<ByteVar>())
}

public actual fun FreeProws(lprows: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_FreeProws(lprows.toCPointer<ByteVar>())
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
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_FtgRegisterIdleRoutine(lpfnidle.toLong().toCPointer<ByteVar>(), lpvidleparam.toCPointer<ByteVar>(), priidle, csecidle, iroidle)?.toLong() ?: 0L

public actual fun HrAddColumns(lptbl: Long, lpproptagcolumnsnew: Long, lpallocatebuffer: LPALLOCATEBUFFER, lpfreebuffer: LPFREEBUFFER): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_HrAddColumns(lptbl.toCPointer<ByteVar>(), lpproptagcolumnsnew.toCPointer<ByteVar>(), lpallocatebuffer.toLong().toCPointer<ByteVar>(), lpfreebuffer.toLong().toCPointer<ByteVar>())

public actual fun HrAddColumnsEx(lptbl: Long, lpproptagcolumnsnew: Long, lpallocatebuffer: LPALLOCATEBUFFER, lpfreebuffer: LPFREEBUFFER, lpfnfiltercolumns: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_HrAddColumnsEx(lptbl.toCPointer<ByteVar>(), lpproptagcolumnsnew.toCPointer<ByteVar>(), lpallocatebuffer.toLong().toCPointer<ByteVar>(), lpfreebuffer.toLong().toCPointer<ByteVar>(), lpfnfiltercolumns)

public actual fun HrAllocAdviseSink(lpfncallback: LPNOTIFCALLBACK, lpvcontext: Long, lppadvisesink: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_HrAllocAdviseSink(lpfncallback.toLong().toCPointer<ByteVar>(), lpvcontext.toCPointer<ByteVar>(), lppadvisesink.toCPointer<ByteVar>())

public actual fun HrDispatchNotifications(ulflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_HrDispatchNotifications(ulflags)

public actual fun HrGetOneProp(lpmapiprop: Long, ulproptag: UInt, lppprop: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_HrGetOneProp(lpmapiprop.toCPointer<ByteVar>(), ulproptag, lppprop.toCPointer<ByteVar>())

public actual fun HrIStorageFromStream(lpunkin: Long, lpinterface: Long, ulflags: UInt, lppstorageout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_HrIStorageFromStream(lpunkin.toCPointer<ByteVar>(), lpinterface.toCPointer<ByteVar>(), ulflags, lppstorageout.toCPointer<ByteVar>())

public actual fun HrQueryAllRows(lptable: Long, lpproptags: Long, lprestriction: Long, lpsortorderset: Long, crowsmax: Int, lpprows: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_HrQueryAllRows(lptable.toCPointer<ByteVar>(), lpproptags.toCPointer<ByteVar>(), lprestriction.toCPointer<ByteVar>(), lpsortorderset.toCPointer<ByteVar>(), crowsmax, lpprows.toCPointer<ByteVar>())

public actual fun HrSetOneProp(lpmapiprop: Long, lpprop: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_HrSetOneProp(lpmapiprop.toCPointer<ByteVar>(), lpprop.toCPointer<ByteVar>())

public actual fun HrThisThreadAdviseSink(lpadvisesink: Long, lppadvisesink: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_HrThisThreadAdviseSink(lpadvisesink.toCPointer<ByteVar>(), lppadvisesink.toCPointer<ByteVar>())

public actual fun LPropCompareProp(lpspropvaluea: Long, lpspropvalueb: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_LPropCompareProp(lpspropvaluea.toCPointer<ByteVar>(), lpspropvalueb.toCPointer<ByteVar>())

public actual fun LpValFindProp(ulproptag: UInt, cvalues: UInt, lpproparray: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_LpValFindProp(ulproptag, cvalues, lpproparray.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun MAPIDeinitIdle() {
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_MAPIDeinitIdle()
}

public actual fun MAPIGetDefaultMalloc(): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_MAPIGetDefaultMalloc()?.toLong() ?: 0L

public actual fun MAPIInitIdle(lpvreserved: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_MAPIInitIdle(lpvreserved.toCPointer<ByteVar>())

public actual fun OpenStreamOnFile(lpallocatebuffer: LPALLOCATEBUFFER, lpfreebuffer: LPFREEBUFFER, ulflags: UInt, lpszfilename: Long, lpszprefix: Long, lppstream: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_OpenStreamOnFile(lpallocatebuffer.toLong().toCPointer<ByteVar>(), lpfreebuffer.toLong().toCPointer<ByteVar>(), ulflags, lpszfilename.toCPointer<ByteVar>(), lpszprefix.toCPointer<ByteVar>(), lppstream.toCPointer<ByteVar>())

public actual fun PpropFindProp(lpproparray: Long, cvalues: UInt, ulproptag: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_PpropFindProp(lpproparray.toCPointer<ByteVar>(), cvalues, ulproptag)?.toLong() ?: 0L

public actual fun PropCopyMore(lpspropvaluedest: Long, lpspropvaluesrc: Long, lpfallocmore: LPALLOCATEMORE, lpvobject: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_PropCopyMore(lpspropvaluedest.toCPointer<ByteVar>(), lpspropvaluesrc.toCPointer<ByteVar>(), lpfallocmore.toLong().toCPointer<ByteVar>(), lpvobject.toCPointer<ByteVar>())

public actual fun RTFSync(lpmessage: Long, ulflags: UInt, lpfmessageupdated: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_RTFSync(lpmessage.toCPointer<ByteVar>(), ulflags, lpfmessageupdated.toCPointer<ByteVar>())

public actual fun ScCopyNotifications(cnotification: Int, lpnotifications: Long, lpvdst: Long, lpcb: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_ScCopyNotifications(cnotification, lpnotifications.toCPointer<ByteVar>(), lpvdst.toCPointer<ByteVar>(), lpcb.toCPointer<ByteVar>())

public actual fun ScCopyProps(cvalues: Int, lpproparray: Long, lpvdst: Long, lpcb: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_ScCopyProps(cvalues, lpproparray.toCPointer<ByteVar>(), lpvdst.toCPointer<ByteVar>(), lpcb.toCPointer<ByteVar>())

public actual fun ScCountNotifications(cnotifications: Int, lpnotifications: Long, lpcb: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_ScCountNotifications(cnotifications, lpnotifications.toCPointer<ByteVar>(), lpcb.toCPointer<ByteVar>())

public actual fun ScCountProps(cvalues: Int, lpproparray: Long, lpcb: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_ScCountProps(cvalues, lpproparray.toCPointer<ByteVar>(), lpcb.toCPointer<ByteVar>())

public actual fun ScCreateConversationIndex(cbparent: UInt, lpbparent: Long, lpcbconvindex: Long, lppbconvindex: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_ScCreateConversationIndex(cbparent, lpbparent.toCPointer<ByteVar>(), lpcbconvindex.toCPointer<ByteVar>(), lppbconvindex.toCPointer<ByteVar>())

public actual fun ScDupPropset(cvalues: Int, lpproparray: Long, lpallocatebuffer: LPALLOCATEBUFFER, lppproparray: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_ScDupPropset(cvalues, lpproparray.toCPointer<ByteVar>(), lpallocatebuffer.toLong().toCPointer<ByteVar>(), lppproparray.toCPointer<ByteVar>())

public actual fun ScInitMapiUtil(ulflags: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_ScInitMapiUtil(ulflags)

public actual fun ScLocalPathFromUNC(lpszunc: PCSTR, lpszlocal: PCSTR, cchlocal: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_ScLocalPathFromUNC(lpszunc.toCPointer<ByteVar>(), lpszlocal.toCPointer<ByteVar>(), cchlocal)

public actual fun ScRelocNotifications(cnotification: Int, lpnotifications: Long, lpvbaseold: Long, lpvbasenew: Long, lpcb: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_ScRelocNotifications(cnotification, lpnotifications.toCPointer<ByteVar>(), lpvbaseold.toCPointer<ByteVar>(), lpvbasenew.toCPointer<ByteVar>(), lpcb.toCPointer<ByteVar>())

public actual fun ScRelocProps(cvalues: Int, lpproparray: Long, lpvbaseold: Long, lpvbasenew: Long, lpcb: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_ScRelocProps(cvalues, lpproparray.toCPointer<ByteVar>(), lpvbaseold.toCPointer<ByteVar>(), lpvbasenew.toCPointer<ByteVar>(), lpcb.toCPointer<ByteVar>())

public actual fun ScUNCFromLocalPath(lpszlocal: PCSTR, lpszunc: PCSTR, cchunc: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_ScUNCFromLocalPath(lpszlocal.toCPointer<ByteVar>(), lpszunc.toCPointer<ByteVar>(), cchunc)

public actual fun SzFindCh(lpsz: Long, ch: UShort): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_SzFindCh(lpsz.toCPointer<ByteVar>(), ch)?.toLong() ?: 0L

public actual fun SzFindLastCh(lpsz: Long, ch: UShort): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_SzFindLastCh(lpsz.toCPointer<ByteVar>(), ch)?.toLong() ?: 0L

public actual fun SzFindSz(lpsz: Long, lpszkey: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_SzFindSz(lpsz.toCPointer<ByteVar>(), lpszkey.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun UFromSz(lpsz: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_UFromSz(lpsz.toCPointer<ByteVar>())

public actual fun UlAddRef(lpunk: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_UlAddRef(lpunk.toCPointer<ByteVar>())

public actual fun UlPropSize(lpspropvalue: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_UlPropSize(lpspropvalue.toCPointer<ByteVar>())

public actual fun UlRelease(lpunk: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_UlRelease(lpunk.toCPointer<ByteVar>())

public actual fun WrapCompressedRTFStream(lpcompressedrtfstream: Long, ulflags: UInt, lpuncompressedrtfstream: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_WrapCompressedRTFStream(lpcompressedrtfstream.toCPointer<ByteVar>(), ulflags, lpuncompressedrtfstream.toCPointer<ByteVar>())

public actual fun WrapStoreEntryID(ulflags: UInt, lpszdllname: Long, cborigentry: UInt, lporigentry: Long, lpcbwrappedentry: Long, lppwrappedentry: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_WrapStoreEntryID(ulflags, lpszdllname.toCPointer<ByteVar>(), cborigentry, lporigentry.toCPointer<ByteVar>(), lpcbwrappedentry.toCPointer<ByteVar>(), lppwrappedentry.toCPointer<ByteVar>())
