@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.addressbook

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance

private object WindowsWin32SystemAddressbookJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_buildDisplayTable(lpallocatebuffer: Long, lpallocatemore: Long, lpfreebuffer: Long, lpmalloc: Long, hinstance: Long, cpages: Int, lppage: Long, ulflags: Int, lpptable: Long, lpptbldata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_changeIdleRoutine(ftg: Long, lpfnidle: Long, lpvidleparam: Long, priidle: Short, csecidle: Int, iroidle: Short, ircidle: Short)

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_createIProp(lpinterface: Long, lpallocatebuffer: Long, lpallocatemore: Long, lpfreebuffer: Long, lpvreserved: Long, lpppropdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_createTable(lpinterface: Long, lpallocatebuffer: Long, lpallocatemore: Long, lpfreebuffer: Long, lpvreserved: Long, ultabletype: Int, ulproptagindexcolumn: Int, lpsproptagarraycolumns: Long, lpptabledata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_deinitMapiUtil()

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_deregisterIdleRoutine(ftg: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_enableIdleRoutine(ftg: Long, fenable: Int)

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_fEqualNames(lpname1: Long, lpname2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_fPropCompareProp(lpspropvalue1: Long, ulrelop: Int, lpspropvalue2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_fPropContainsProp(lpspropvaluedst: Long, lpspropvaluesrc: Long, ulfuzzylevel: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_fPropExists(lpmapiprop: Long, ulproptag: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_freePadrlist(lpadrlist: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_freeProws(lprows: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_ftgRegisterIdleRoutine(lpfnidle: Long, lpvidleparam: Long, priidle: Short, csecidle: Int, iroidle: Short): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_hrAddColumns(lptbl: Long, lpproptagcolumnsnew: Long, lpallocatebuffer: Long, lpfreebuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_hrAddColumnsEx(lptbl: Long, lpproptagcolumnsnew: Long, lpallocatebuffer: Long, lpfreebuffer: Long, lpfnfiltercolumns: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_hrAllocAdviseSink(lpfncallback: Long, lpvcontext: Long, lppadvisesink: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_hrDispatchNotifications(ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_hrGetOneProp(lpmapiprop: Long, ulproptag: Int, lppprop: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_hrIStorageFromStream(lpunkin: Long, lpinterface: Long, ulflags: Int, lppstorageout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_hrQueryAllRows(lptable: Long, lpproptags: Long, lprestriction: Long, lpsortorderset: Long, crowsmax: Int, lpprows: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_hrSetOneProp(lpmapiprop: Long, lpprop: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_hrThisThreadAdviseSink(lpadvisesink: Long, lppadvisesink: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_lPropCompareProp(lpspropvaluea: Long, lpspropvalueb: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_lpValFindProp(ulproptag: Int, cvalues: Int, lpproparray: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_mAPIDeinitIdle()

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_mAPIGetDefaultMalloc(): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_mAPIInitIdle(lpvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_openStreamOnFile(lpallocatebuffer: Long, lpfreebuffer: Long, ulflags: Int, lpszfilename: Long, lpszprefix: Long, lppstream: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_ppropFindProp(lpproparray: Long, cvalues: Int, ulproptag: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_propCopyMore(lpspropvaluedest: Long, lpspropvaluesrc: Long, lpfallocmore: Long, lpvobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_rTFSync(lpmessage: Long, ulflags: Int, lpfmessageupdated: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_scCopyNotifications(cnotification: Int, lpnotifications: Long, lpvdst: Long, lpcb: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_scCopyProps(cvalues: Int, lpproparray: Long, lpvdst: Long, lpcb: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_scCountNotifications(cnotifications: Int, lpnotifications: Long, lpcb: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_scCountProps(cvalues: Int, lpproparray: Long, lpcb: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_scCreateConversationIndex(cbparent: Int, lpbparent: Long, lpcbconvindex: Long, lppbconvindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_scDupPropset(cvalues: Int, lpproparray: Long, lpallocatebuffer: Long, lppproparray: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_scInitMapiUtil(ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_scLocalPathFromUNC(lpszunc: Long, lpszlocal: Long, cchlocal: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_scRelocNotifications(cnotification: Int, lpnotifications: Long, lpvbaseold: Long, lpvbasenew: Long, lpcb: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_scRelocProps(cvalues: Int, lpproparray: Long, lpvbaseold: Long, lpvbasenew: Long, lpcb: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_scUNCFromLocalPath(lpszlocal: Long, lpszunc: Long, cchunc: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_szFindCh(lpsz: Long, ch: Short): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_szFindLastCh(lpsz: Long, ch: Short): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_szFindSz(lpsz: Long, lpszkey: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_uFromSz(lpsz: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_ulAddRef(lpunk: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_ulPropSize(lpspropvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_ulRelease(lpunk: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_wrapCompressedRTFStream(lpcompressedrtfstream: Long, ulflags: Int, lpuncompressedrtfstream: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_wrapStoreEntryID(ulflags: Int, lpszdllname: Long, cborigentry: Int, lporigentry: Long, lpcbwrappedentry: Long, lppwrappedentry: Long): Int
}

public actual fun buildDisplayTable(lpallocatebuffer: Lpallocatebuffer, lpallocatemore: Lpallocatemore, lpfreebuffer: Lpfreebuffer, lpmalloc: COpaquePointer?, hinstance: Hinstance, cpages: UInt, lppage: COpaquePointer?, ulflags: UInt, lpptable: COpaquePointer?, lpptbldata: COpaquePointer?): Hresult =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_buildDisplayTable(0L, 0L, 0L, (lpmalloc?.value ?: 0L), (hinstance?.value ?: 0L), cpages.toInt(), (lppage?.value ?: 0L), ulflags.toInt(), (lpptable?.value ?: 0L), (lpptbldata?.value ?: 0L))

public actual fun changeIdleRoutine(ftg: COpaquePointer?, lpfnidle: Pfnidle, lpvidleparam: COpaquePointer?, priidle: Short, csecidle: UInt, iroidle: UShort, ircidle: UShort) {
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_changeIdleRoutine((ftg?.value ?: 0L), 0L, (lpvidleparam?.value ?: 0L), priidle, csecidle.toInt(), iroidle.toShort(), ircidle.toShort())
}

public actual fun createIProp(lpinterface: COpaquePointer?, lpallocatebuffer: Lpallocatebuffer, lpallocatemore: Lpallocatemore, lpfreebuffer: Lpfreebuffer, lpvreserved: COpaquePointer?, lpppropdata: COpaquePointer?): Int =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_createIProp((lpinterface?.value ?: 0L), 0L, 0L, 0L, (lpvreserved?.value ?: 0L), (lpppropdata?.value ?: 0L))

public actual fun createTable(lpinterface: COpaquePointer?, lpallocatebuffer: Lpallocatebuffer, lpallocatemore: Lpallocatemore, lpfreebuffer: Lpfreebuffer, lpvreserved: COpaquePointer?, ultabletype: UInt, ulproptagindexcolumn: UInt, lpsproptagarraycolumns: COpaquePointer?, lpptabledata: COpaquePointer?): Int =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_createTable((lpinterface?.value ?: 0L), 0L, 0L, 0L, (lpvreserved?.value ?: 0L), ultabletype.toInt(), ulproptagindexcolumn.toInt(), (lpsproptagarraycolumns?.value ?: 0L), (lpptabledata?.value ?: 0L))

public actual fun deinitMapiUtil() {
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_deinitMapiUtil()
}

public actual fun deregisterIdleRoutine(ftg: COpaquePointer?) {
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_deregisterIdleRoutine((ftg?.value ?: 0L))
}

public actual fun enableIdleRoutine(ftg: COpaquePointer?, fenable: Bool) {
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_enableIdleRoutine((ftg?.value ?: 0L), fenable)
}

public actual fun fEqualNames(lpname1: COpaquePointer?, lpname2: COpaquePointer?): Bool =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_fEqualNames((lpname1?.value ?: 0L), (lpname2?.value ?: 0L))

public actual fun fPropCompareProp(lpspropvalue1: COpaquePointer?, ulrelop: UInt, lpspropvalue2: COpaquePointer?): Bool =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_fPropCompareProp((lpspropvalue1?.value ?: 0L), ulrelop.toInt(), (lpspropvalue2?.value ?: 0L))

public actual fun fPropContainsProp(lpspropvaluedst: COpaquePointer?, lpspropvaluesrc: COpaquePointer?, ulfuzzylevel: UInt): Bool =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_fPropContainsProp((lpspropvaluedst?.value ?: 0L), (lpspropvaluesrc?.value ?: 0L), ulfuzzylevel.toInt())

public actual fun fPropExists(lpmapiprop: COpaquePointer?, ulproptag: UInt): Bool =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_fPropExists((lpmapiprop?.value ?: 0L), ulproptag.toInt())

public actual fun freePadrlist(lpadrlist: COpaquePointer?) {
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_freePadrlist((lpadrlist?.value ?: 0L))
}

public actual fun freeProws(lprows: COpaquePointer?) {
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_freeProws((lprows?.value ?: 0L))
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
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_ftgRegisterIdleRoutine(0L, (lpvidleparam?.value ?: 0L), priidle, csecidle.toInt(), iroidle.toShort()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun hrAddColumns(lptbl: COpaquePointer?, lpproptagcolumnsnew: COpaquePointer?, lpallocatebuffer: Lpallocatebuffer, lpfreebuffer: Lpfreebuffer): Hresult =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_hrAddColumns((lptbl?.value ?: 0L), (lpproptagcolumnsnew?.value ?: 0L), 0L, 0L)

public actual fun hrAddColumnsEx(lptbl: COpaquePointer?, lpproptagcolumnsnew: COpaquePointer?, lpallocatebuffer: Lpallocatebuffer, lpfreebuffer: Lpfreebuffer, lpfnfiltercolumns: Long): Hresult =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_hrAddColumnsEx((lptbl?.value ?: 0L), (lpproptagcolumnsnew?.value ?: 0L), 0L, 0L, lpfnfiltercolumns)

public actual fun hrAllocAdviseSink(lpfncallback: Lpnotifcallback, lpvcontext: COpaquePointer?, lppadvisesink: COpaquePointer?): Hresult =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_hrAllocAdviseSink(0L, (lpvcontext?.value ?: 0L), (lppadvisesink?.value ?: 0L))

public actual fun hrDispatchNotifications(ulflags: UInt): Hresult =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_hrDispatchNotifications(ulflags.toInt())

public actual fun hrGetOneProp(lpmapiprop: COpaquePointer?, ulproptag: UInt, lppprop: COpaquePointer?): Hresult =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_hrGetOneProp((lpmapiprop?.value ?: 0L), ulproptag.toInt(), (lppprop?.value ?: 0L))

public actual fun hrIStorageFromStream(lpunkin: COpaquePointer?, lpinterface: COpaquePointer?, ulflags: UInt, lppstorageout: COpaquePointer?): Hresult =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_hrIStorageFromStream((lpunkin?.value ?: 0L), (lpinterface?.value ?: 0L), ulflags.toInt(), (lppstorageout?.value ?: 0L))

public actual fun hrQueryAllRows(lptable: COpaquePointer?, lpproptags: COpaquePointer?, lprestriction: COpaquePointer?, lpsortorderset: COpaquePointer?, crowsmax: Int, lpprows: COpaquePointer?): Hresult =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_hrQueryAllRows((lptable?.value ?: 0L), (lpproptags?.value ?: 0L), (lprestriction?.value ?: 0L), (lpsortorderset?.value ?: 0L), crowsmax, (lpprows?.value ?: 0L))

public actual fun hrSetOneProp(lpmapiprop: COpaquePointer?, lpprop: COpaquePointer?): Hresult =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_hrSetOneProp((lpmapiprop?.value ?: 0L), (lpprop?.value ?: 0L))

public actual fun hrThisThreadAdviseSink(lpadvisesink: COpaquePointer?, lppadvisesink: COpaquePointer?): Hresult =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_hrThisThreadAdviseSink((lpadvisesink?.value ?: 0L), (lppadvisesink?.value ?: 0L))

public actual fun lPropCompareProp(lpspropvaluea: COpaquePointer?, lpspropvalueb: COpaquePointer?): Int =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_lPropCompareProp((lpspropvaluea?.value ?: 0L), (lpspropvalueb?.value ?: 0L))

public actual fun lpValFindProp(ulproptag: UInt, cvalues: UInt, lpproparray: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_lpValFindProp(ulproptag.toInt(), cvalues.toInt(), (lpproparray?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mAPIDeinitIdle() {
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_mAPIDeinitIdle()
}

public actual fun mAPIGetDefaultMalloc(): COpaquePointer? =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_mAPIGetDefaultMalloc().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mAPIInitIdle(lpvreserved: COpaquePointer?): Int =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_mAPIInitIdle((lpvreserved?.value ?: 0L))

public actual fun openStreamOnFile(lpallocatebuffer: Lpallocatebuffer, lpfreebuffer: Lpfreebuffer, ulflags: UInt, lpszfilename: COpaquePointer?, lpszprefix: COpaquePointer?, lppstream: COpaquePointer?): Hresult =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_openStreamOnFile(0L, 0L, ulflags.toInt(), (lpszfilename?.value ?: 0L), (lpszprefix?.value ?: 0L), (lppstream?.value ?: 0L))

public actual fun ppropFindProp(lpproparray: COpaquePointer?, cvalues: UInt, ulproptag: UInt): COpaquePointer? =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_ppropFindProp((lpproparray?.value ?: 0L), cvalues.toInt(), ulproptag.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun propCopyMore(lpspropvaluedest: COpaquePointer?, lpspropvaluesrc: COpaquePointer?, lpfallocmore: Lpallocatemore, lpvobject: COpaquePointer?): Int =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_propCopyMore((lpspropvaluedest?.value ?: 0L), (lpspropvaluesrc?.value ?: 0L), 0L, (lpvobject?.value ?: 0L))

public actual fun rTFSync(lpmessage: COpaquePointer?, ulflags: UInt, lpfmessageupdated: COpaquePointer?): Hresult =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_rTFSync((lpmessage?.value ?: 0L), ulflags.toInt(), (lpfmessageupdated?.value ?: 0L))

public actual fun scCopyNotifications(cnotification: Int, lpnotifications: COpaquePointer?, lpvdst: COpaquePointer?, lpcb: COpaquePointer?): Int =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_scCopyNotifications(cnotification, (lpnotifications?.value ?: 0L), (lpvdst?.value ?: 0L), (lpcb?.value ?: 0L))

public actual fun scCopyProps(cvalues: Int, lpproparray: COpaquePointer?, lpvdst: COpaquePointer?, lpcb: COpaquePointer?): Int =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_scCopyProps(cvalues, (lpproparray?.value ?: 0L), (lpvdst?.value ?: 0L), (lpcb?.value ?: 0L))

public actual fun scCountNotifications(cnotifications: Int, lpnotifications: COpaquePointer?, lpcb: COpaquePointer?): Int =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_scCountNotifications(cnotifications, (lpnotifications?.value ?: 0L), (lpcb?.value ?: 0L))

public actual fun scCountProps(cvalues: Int, lpproparray: COpaquePointer?, lpcb: COpaquePointer?): Int =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_scCountProps(cvalues, (lpproparray?.value ?: 0L), (lpcb?.value ?: 0L))

public actual fun scCreateConversationIndex(cbparent: UInt, lpbparent: COpaquePointer?, lpcbconvindex: COpaquePointer?, lppbconvindex: COpaquePointer?): Int =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_scCreateConversationIndex(cbparent.toInt(), (lpbparent?.value ?: 0L), (lpcbconvindex?.value ?: 0L), (lppbconvindex?.value ?: 0L))

public actual fun scDupPropset(cvalues: Int, lpproparray: COpaquePointer?, lpallocatebuffer: Lpallocatebuffer, lppproparray: COpaquePointer?): Int =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_scDupPropset(cvalues, (lpproparray?.value ?: 0L), 0L, (lppproparray?.value ?: 0L))

public actual fun scInitMapiUtil(ulflags: UInt): Int =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_scInitMapiUtil(ulflags.toInt())

public actual fun scLocalPathFromUNC(lpszunc: Pcstr, lpszlocal: Pcstr, cchlocal: UInt): Int =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_scLocalPathFromUNC((lpszunc?.value ?: 0L), (lpszlocal?.value ?: 0L), cchlocal.toInt())

public actual fun scRelocNotifications(cnotification: Int, lpnotifications: COpaquePointer?, lpvbaseold: COpaquePointer?, lpvbasenew: COpaquePointer?, lpcb: COpaquePointer?): Int =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_scRelocNotifications(cnotification, (lpnotifications?.value ?: 0L), (lpvbaseold?.value ?: 0L), (lpvbasenew?.value ?: 0L), (lpcb?.value ?: 0L))

public actual fun scRelocProps(cvalues: Int, lpproparray: COpaquePointer?, lpvbaseold: COpaquePointer?, lpvbasenew: COpaquePointer?, lpcb: COpaquePointer?): Int =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_scRelocProps(cvalues, (lpproparray?.value ?: 0L), (lpvbaseold?.value ?: 0L), (lpvbasenew?.value ?: 0L), (lpcb?.value ?: 0L))

public actual fun scUNCFromLocalPath(lpszlocal: Pcstr, lpszunc: Pcstr, cchunc: UInt): Int =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_scUNCFromLocalPath((lpszlocal?.value ?: 0L), (lpszunc?.value ?: 0L), cchunc.toInt())

public actual fun szFindCh(lpsz: COpaquePointer?, ch: UShort): COpaquePointer? =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_szFindCh((lpsz?.value ?: 0L), ch.toShort()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun szFindLastCh(lpsz: COpaquePointer?, ch: UShort): COpaquePointer? =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_szFindLastCh((lpsz?.value ?: 0L), ch.toShort()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun szFindSz(lpsz: COpaquePointer?, lpszkey: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_szFindSz((lpsz?.value ?: 0L), (lpszkey?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uFromSz(lpsz: COpaquePointer?): UInt =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_uFromSz((lpsz?.value ?: 0L)).toUInt()

public actual fun ulAddRef(lpunk: COpaquePointer?): UInt =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_ulAddRef((lpunk?.value ?: 0L)).toUInt()

public actual fun ulPropSize(lpspropvalue: COpaquePointer?): UInt =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_ulPropSize((lpspropvalue?.value ?: 0L)).toUInt()

public actual fun ulRelease(lpunk: COpaquePointer?): UInt =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_ulRelease((lpunk?.value ?: 0L)).toUInt()

public actual fun wrapCompressedRTFStream(lpcompressedrtfstream: COpaquePointer?, ulflags: UInt, lpuncompressedrtfstream: COpaquePointer?): Hresult =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_wrapCompressedRTFStream((lpcompressedrtfstream?.value ?: 0L), ulflags.toInt(), (lpuncompressedrtfstream?.value ?: 0L))

public actual fun wrapStoreEntryID(ulflags: UInt, lpszdllname: COpaquePointer?, cborigentry: UInt, lporigentry: COpaquePointer?, lpcbwrappedentry: COpaquePointer?, lppwrappedentry: COpaquePointer?): Hresult =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_wrapStoreEntryID(ulflags.toInt(), (lpszdllname?.value ?: 0L), cborigentry.toInt(), (lporigentry?.value ?: 0L), (lpcbwrappedentry?.value ?: 0L), (lppwrappedentry?.value ?: 0L))
