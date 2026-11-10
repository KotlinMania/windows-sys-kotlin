@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.addressbook

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun buildDisplayTable(lpallocatebuffer: Lpallocatebuffer, lpallocatemore: Lpallocatemore, lpfreebuffer: Lpfreebuffer, lpmalloc: COpaquePointer?, hinstance: Hinstance, cpages: UInt, lppage: COpaquePointer?, ulflags: UInt, lpptable: COpaquePointer?, lpptbldata: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_buildDisplayTable(0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lpmalloc?.value?.toCPointer<ByteVar>(), hinstance?.value?.toCPointer<ByteVar>(), cpages, lppage?.value?.toCPointer<ByteVar>(), ulflags, lpptable?.value?.toCPointer<ByteVar>(), lpptbldata?.value?.toCPointer<ByteVar>())

public actual fun changeIdleRoutine(ftg: COpaquePointer?, lpfnidle: Pfnidle, lpvidleparam: COpaquePointer?, priidle: Short, csecidle: UInt, iroidle: UShort, ircidle: UShort) {
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_changeIdleRoutine(ftg?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lpvidleparam?.value?.toCPointer<ByteVar>(), priidle, csecidle, iroidle, ircidle)
}

public actual fun createIProp(lpinterface: COpaquePointer?, lpallocatebuffer: Lpallocatebuffer, lpallocatemore: Lpallocatemore, lpfreebuffer: Lpfreebuffer, lpvreserved: COpaquePointer?, lpppropdata: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_createIProp(lpinterface?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lpvreserved?.value?.toCPointer<ByteVar>(), lpppropdata?.value?.toCPointer<ByteVar>())

public actual fun createTable(lpinterface: COpaquePointer?, lpallocatebuffer: Lpallocatebuffer, lpallocatemore: Lpallocatemore, lpfreebuffer: Lpfreebuffer, lpvreserved: COpaquePointer?, ultabletype: UInt, ulproptagindexcolumn: UInt, lpsproptagarraycolumns: COpaquePointer?, lpptabledata: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_createTable(lpinterface?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lpvreserved?.value?.toCPointer<ByteVar>(), ultabletype, ulproptagindexcolumn, lpsproptagarraycolumns?.value?.toCPointer<ByteVar>(), lpptabledata?.value?.toCPointer<ByteVar>())

public actual fun deinitMapiUtil() {
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_deinitMapiUtil()
}

public actual fun deregisterIdleRoutine(ftg: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_deregisterIdleRoutine(ftg?.value?.toCPointer<ByteVar>())
}

public actual fun enableIdleRoutine(ftg: COpaquePointer?, fenable: Bool) {
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_enableIdleRoutine(ftg?.value?.toCPointer<ByteVar>(), fenable)
}

public actual fun fEqualNames(lpname1: COpaquePointer?, lpname2: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_fEqualNames(lpname1?.value?.toCPointer<ByteVar>(), lpname2?.value?.toCPointer<ByteVar>())

public actual fun fPropCompareProp(lpspropvalue1: COpaquePointer?, ulrelop: UInt, lpspropvalue2: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_fPropCompareProp(lpspropvalue1?.value?.toCPointer<ByteVar>(), ulrelop, lpspropvalue2?.value?.toCPointer<ByteVar>())

public actual fun fPropContainsProp(lpspropvaluedst: COpaquePointer?, lpspropvaluesrc: COpaquePointer?, ulfuzzylevel: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_fPropContainsProp(lpspropvaluedst?.value?.toCPointer<ByteVar>(), lpspropvaluesrc?.value?.toCPointer<ByteVar>(), ulfuzzylevel)

public actual fun fPropExists(lpmapiprop: COpaquePointer?, ulproptag: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_fPropExists(lpmapiprop?.value?.toCPointer<ByteVar>(), ulproptag)

public actual fun freePadrlist(lpadrlist: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_freePadrlist(lpadrlist?.value?.toCPointer<ByteVar>())
}

public actual fun freeProws(lprows: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_freeProws(lprows?.value?.toCPointer<ByteVar>())
}

public actual fun ftAddFt(ftaddend1: Filetime, ftaddend2: Filetime): Filetime =
    Filetime()

public actual fun ftMulDw(ftmultiplier: UInt, ftmultiplicand: Filetime): Filetime =
    Filetime()

public actual fun ftMulDwDw(ftmultiplicand: UInt, ftmultiplier: UInt): Filetime =
    Filetime()

public actual fun ftNegFt(ft: Filetime): Filetime =
    Filetime()

public actual fun ftSubFt(ftminuend: Filetime, ftsubtrahend: Filetime): Filetime =
    Filetime()

public actual fun ftgRegisterIdleRoutine(lpfnidle: Pfnidle, lpvidleparam: COpaquePointer?, priidle: Short, csecidle: UInt, iroidle: UShort): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_ftgRegisterIdleRoutine(0L.toCPointer<ByteVar>(), lpvidleparam?.value?.toCPointer<ByteVar>(), priidle, csecidle, iroidle)?.let { COpaquePointer(it.toLong()) }

public actual fun hrAddColumns(lptbl: COpaquePointer?, lpproptagcolumnsnew: COpaquePointer?, lpallocatebuffer: Lpallocatebuffer, lpfreebuffer: Lpfreebuffer): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_hrAddColumns(lptbl?.value?.toCPointer<ByteVar>(), lpproptagcolumnsnew?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun hrAddColumnsEx(lptbl: COpaquePointer?, lpproptagcolumnsnew: COpaquePointer?, lpallocatebuffer: Lpallocatebuffer, lpfreebuffer: Lpfreebuffer, lpfnfiltercolumns: Long): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_hrAddColumnsEx(lptbl?.value?.toCPointer<ByteVar>(), lpproptagcolumnsnew?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lpfnfiltercolumns)

public actual fun hrAllocAdviseSink(lpfncallback: Lpnotifcallback, lpvcontext: COpaquePointer?, lppadvisesink: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_hrAllocAdviseSink(0L.toCPointer<ByteVar>(), lpvcontext?.value?.toCPointer<ByteVar>(), lppadvisesink?.value?.toCPointer<ByteVar>())

public actual fun hrDispatchNotifications(ulflags: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_hrDispatchNotifications(ulflags)

public actual fun hrGetOneProp(lpmapiprop: COpaquePointer?, ulproptag: UInt, lppprop: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_hrGetOneProp(lpmapiprop?.value?.toCPointer<ByteVar>(), ulproptag, lppprop?.value?.toCPointer<ByteVar>())

public actual fun hrIStorageFromStream(lpunkin: COpaquePointer?, lpinterface: COpaquePointer?, ulflags: UInt, lppstorageout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_hrIStorageFromStream(lpunkin?.value?.toCPointer<ByteVar>(), lpinterface?.value?.toCPointer<ByteVar>(), ulflags, lppstorageout?.value?.toCPointer<ByteVar>())

public actual fun hrQueryAllRows(lptable: COpaquePointer?, lpproptags: COpaquePointer?, lprestriction: COpaquePointer?, lpsortorderset: COpaquePointer?, crowsmax: Int, lpprows: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_hrQueryAllRows(lptable?.value?.toCPointer<ByteVar>(), lpproptags?.value?.toCPointer<ByteVar>(), lprestriction?.value?.toCPointer<ByteVar>(), lpsortorderset?.value?.toCPointer<ByteVar>(), crowsmax, lpprows?.value?.toCPointer<ByteVar>())

public actual fun hrSetOneProp(lpmapiprop: COpaquePointer?, lpprop: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_hrSetOneProp(lpmapiprop?.value?.toCPointer<ByteVar>(), lpprop?.value?.toCPointer<ByteVar>())

public actual fun hrThisThreadAdviseSink(lpadvisesink: COpaquePointer?, lppadvisesink: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_hrThisThreadAdviseSink(lpadvisesink?.value?.toCPointer<ByteVar>(), lppadvisesink?.value?.toCPointer<ByteVar>())

public actual fun lPropCompareProp(lpspropvaluea: COpaquePointer?, lpspropvalueb: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_lPropCompareProp(lpspropvaluea?.value?.toCPointer<ByteVar>(), lpspropvalueb?.value?.toCPointer<ByteVar>())

public actual fun lpValFindProp(ulproptag: UInt, cvalues: UInt, lpproparray: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_lpValFindProp(ulproptag, cvalues, lpproparray?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun mAPIDeinitIdle() {
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_mAPIDeinitIdle()
}

public actual fun mAPIGetDefaultMalloc(): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_mAPIGetDefaultMalloc()?.let { COpaquePointer(it.toLong()) }

public actual fun mAPIInitIdle(lpvreserved: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_mAPIInitIdle(lpvreserved?.value?.toCPointer<ByteVar>())

public actual fun openStreamOnFile(lpallocatebuffer: Lpallocatebuffer, lpfreebuffer: Lpfreebuffer, ulflags: UInt, lpszfilename: COpaquePointer?, lpszprefix: COpaquePointer?, lppstream: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_openStreamOnFile(0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), ulflags, lpszfilename?.value?.toCPointer<ByteVar>(), lpszprefix?.value?.toCPointer<ByteVar>(), lppstream?.value?.toCPointer<ByteVar>())

public actual fun ppropFindProp(lpproparray: COpaquePointer?, cvalues: UInt, ulproptag: UInt): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_ppropFindProp(lpproparray?.value?.toCPointer<ByteVar>(), cvalues, ulproptag)?.let { COpaquePointer(it.toLong()) }

public actual fun propCopyMore(lpspropvaluedest: COpaquePointer?, lpspropvaluesrc: COpaquePointer?, lpfallocmore: Lpallocatemore, lpvobject: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_propCopyMore(lpspropvaluedest?.value?.toCPointer<ByteVar>(), lpspropvaluesrc?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lpvobject?.value?.toCPointer<ByteVar>())

public actual fun rTFSync(lpmessage: COpaquePointer?, ulflags: UInt, lpfmessageupdated: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_rTFSync(lpmessage?.value?.toCPointer<ByteVar>(), ulflags, lpfmessageupdated?.value?.toCPointer<ByteVar>())

public actual fun scCopyNotifications(cnotification: Int, lpnotifications: COpaquePointer?, lpvdst: COpaquePointer?, lpcb: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_scCopyNotifications(cnotification, lpnotifications?.value?.toCPointer<ByteVar>(), lpvdst?.value?.toCPointer<ByteVar>(), lpcb?.value?.toCPointer<ByteVar>())

public actual fun scCopyProps(cvalues: Int, lpproparray: COpaquePointer?, lpvdst: COpaquePointer?, lpcb: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_scCopyProps(cvalues, lpproparray?.value?.toCPointer<ByteVar>(), lpvdst?.value?.toCPointer<ByteVar>(), lpcb?.value?.toCPointer<ByteVar>())

public actual fun scCountNotifications(cnotifications: Int, lpnotifications: COpaquePointer?, lpcb: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_scCountNotifications(cnotifications, lpnotifications?.value?.toCPointer<ByteVar>(), lpcb?.value?.toCPointer<ByteVar>())

public actual fun scCountProps(cvalues: Int, lpproparray: COpaquePointer?, lpcb: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_scCountProps(cvalues, lpproparray?.value?.toCPointer<ByteVar>(), lpcb?.value?.toCPointer<ByteVar>())

public actual fun scCreateConversationIndex(cbparent: UInt, lpbparent: COpaquePointer?, lpcbconvindex: COpaquePointer?, lppbconvindex: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_scCreateConversationIndex(cbparent, lpbparent?.value?.toCPointer<ByteVar>(), lpcbconvindex?.value?.toCPointer<ByteVar>(), lppbconvindex?.value?.toCPointer<ByteVar>())

public actual fun scDupPropset(cvalues: Int, lpproparray: COpaquePointer?, lpallocatebuffer: Lpallocatebuffer, lppproparray: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_scDupPropset(cvalues, lpproparray?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lppproparray?.value?.toCPointer<ByteVar>())

public actual fun scInitMapiUtil(ulflags: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_scInitMapiUtil(ulflags)

public actual fun scLocalPathFromUNC(lpszunc: Pcstr, lpszlocal: Pcstr, cchlocal: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_scLocalPathFromUNC(lpszunc?.value?.toCPointer<ByteVar>(), lpszlocal?.value?.toCPointer<ByteVar>(), cchlocal)

public actual fun scRelocNotifications(cnotification: Int, lpnotifications: COpaquePointer?, lpvbaseold: COpaquePointer?, lpvbasenew: COpaquePointer?, lpcb: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_scRelocNotifications(cnotification, lpnotifications?.value?.toCPointer<ByteVar>(), lpvbaseold?.value?.toCPointer<ByteVar>(), lpvbasenew?.value?.toCPointer<ByteVar>(), lpcb?.value?.toCPointer<ByteVar>())

public actual fun scRelocProps(cvalues: Int, lpproparray: COpaquePointer?, lpvbaseold: COpaquePointer?, lpvbasenew: COpaquePointer?, lpcb: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_scRelocProps(cvalues, lpproparray?.value?.toCPointer<ByteVar>(), lpvbaseold?.value?.toCPointer<ByteVar>(), lpvbasenew?.value?.toCPointer<ByteVar>(), lpcb?.value?.toCPointer<ByteVar>())

public actual fun scUNCFromLocalPath(lpszlocal: Pcstr, lpszunc: Pcstr, cchunc: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_scUNCFromLocalPath(lpszlocal?.value?.toCPointer<ByteVar>(), lpszunc?.value?.toCPointer<ByteVar>(), cchunc)

public actual fun szFindCh(lpsz: COpaquePointer?, ch: UShort): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_szFindCh(lpsz?.value?.toCPointer<ByteVar>(), ch)?.let { COpaquePointer(it.toLong()) }

public actual fun szFindLastCh(lpsz: COpaquePointer?, ch: UShort): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_szFindLastCh(lpsz?.value?.toCPointer<ByteVar>(), ch)?.let { COpaquePointer(it.toLong()) }

public actual fun szFindSz(lpsz: COpaquePointer?, lpszkey: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_szFindSz(lpsz?.value?.toCPointer<ByteVar>(), lpszkey?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uFromSz(lpsz: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_uFromSz(lpsz?.value?.toCPointer<ByteVar>())

public actual fun ulAddRef(lpunk: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_ulAddRef(lpunk?.value?.toCPointer<ByteVar>())

public actual fun ulPropSize(lpspropvalue: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_ulPropSize(lpspropvalue?.value?.toCPointer<ByteVar>())

public actual fun ulRelease(lpunk: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_ulRelease(lpunk?.value?.toCPointer<ByteVar>())

public actual fun wrapCompressedRTFStream(lpcompressedrtfstream: COpaquePointer?, ulflags: UInt, lpuncompressedrtfstream: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_wrapCompressedRTFStream(lpcompressedrtfstream?.value?.toCPointer<ByteVar>(), ulflags, lpuncompressedrtfstream?.value?.toCPointer<ByteVar>())

public actual fun wrapStoreEntryID(ulflags: UInt, lpszdllname: COpaquePointer?, cborigentry: UInt, lporigentry: COpaquePointer?, lpcbwrappedentry: COpaquePointer?, lppwrappedentry: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssys_windows_win32_system_addressbook_wrapStoreEntryID(ulflags, lpszdllname?.value?.toCPointer<ByteVar>(), cborigentry, lporigentry?.value?.toCPointer<ByteVar>(), lpcbwrappedentry?.value?.toCPointer<ByteVar>(), lppwrappedentry?.value?.toCPointer<ByteVar>())
