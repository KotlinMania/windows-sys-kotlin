@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.addressbook

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.FILETIME
import io.github.kotlinmania.windowssys.windows.win32.foundation.HINSTANCE

private object WindowsWin32SystemAddressbookJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_BuildDisplayTable(lpallocatebuffer: Long, lpallocatemore: Long, lpfreebuffer: Long, lpmalloc: Long, hinstance: Long, cpages: Int, lppage: Long, ulflags: Int, lpptable: Long, lpptbldata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_ChangeIdleRoutine(ftg: Long, lpfnidle: Long, lpvidleparam: Long, priidle: Short, csecidle: Int, iroidle: Short, ircidle: Short)

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_CreateIProp(lpinterface: Long, lpallocatebuffer: Long, lpallocatemore: Long, lpfreebuffer: Long, lpvreserved: Long, lpppropdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_CreateTable(lpinterface: Long, lpallocatebuffer: Long, lpallocatemore: Long, lpfreebuffer: Long, lpvreserved: Long, ultabletype: Int, ulproptagindexcolumn: Int, lpsproptagarraycolumns: Long, lpptabledata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_DeinitMapiUtil()

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_DeregisterIdleRoutine(ftg: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_EnableIdleRoutine(ftg: Long, fenable: Int)

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_FEqualNames(lpname1: Long, lpname2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_FPropCompareProp(lpspropvalue1: Long, ulrelop: Int, lpspropvalue2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_FPropContainsProp(lpspropvaluedst: Long, lpspropvaluesrc: Long, ulfuzzylevel: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_FPropExists(lpmapiprop: Long, ulproptag: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_FreePadrlist(lpadrlist: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_FreeProws(lprows: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_FtgRegisterIdleRoutine(lpfnidle: Long, lpvidleparam: Long, priidle: Short, csecidle: Int, iroidle: Short): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_HrAddColumns(lptbl: Long, lpproptagcolumnsnew: Long, lpallocatebuffer: Long, lpfreebuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_HrAddColumnsEx(lptbl: Long, lpproptagcolumnsnew: Long, lpallocatebuffer: Long, lpfreebuffer: Long, lpfnfiltercolumns: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_HrAllocAdviseSink(lpfncallback: Long, lpvcontext: Long, lppadvisesink: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_HrDispatchNotifications(ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_HrGetOneProp(lpmapiprop: Long, ulproptag: Int, lppprop: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_HrIStorageFromStream(lpunkin: Long, lpinterface: Long, ulflags: Int, lppstorageout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_HrQueryAllRows(lptable: Long, lpproptags: Long, lprestriction: Long, lpsortorderset: Long, crowsmax: Int, lpprows: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_HrSetOneProp(lpmapiprop: Long, lpprop: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_HrThisThreadAdviseSink(lpadvisesink: Long, lppadvisesink: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_LPropCompareProp(lpspropvaluea: Long, lpspropvalueb: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_LpValFindProp(ulproptag: Int, cvalues: Int, lpproparray: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_MAPIDeinitIdle()

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_MAPIGetDefaultMalloc(): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_MAPIInitIdle(lpvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_OpenStreamOnFile(lpallocatebuffer: Long, lpfreebuffer: Long, ulflags: Int, lpszfilename: Long, lpszprefix: Long, lppstream: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_PpropFindProp(lpproparray: Long, cvalues: Int, ulproptag: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_PropCopyMore(lpspropvaluedest: Long, lpspropvaluesrc: Long, lpfallocmore: Long, lpvobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_RTFSync(lpmessage: Long, ulflags: Int, lpfmessageupdated: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_ScCopyNotifications(cnotification: Int, lpnotifications: Long, lpvdst: Long, lpcb: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_ScCopyProps(cvalues: Int, lpproparray: Long, lpvdst: Long, lpcb: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_ScCountNotifications(cnotifications: Int, lpnotifications: Long, lpcb: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_ScCountProps(cvalues: Int, lpproparray: Long, lpcb: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_ScCreateConversationIndex(cbparent: Int, lpbparent: Long, lpcbconvindex: Long, lppbconvindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_ScDupPropset(cvalues: Int, lpproparray: Long, lpallocatebuffer: Long, lppproparray: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_ScInitMapiUtil(ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_ScLocalPathFromUNC(lpszunc: Long, lpszlocal: Long, cchlocal: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_ScRelocNotifications(cnotification: Int, lpnotifications: Long, lpvbaseold: Long, lpvbasenew: Long, lpcb: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_ScRelocProps(cvalues: Int, lpproparray: Long, lpvbaseold: Long, lpvbasenew: Long, lpcb: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_ScUNCFromLocalPath(lpszlocal: Long, lpszunc: Long, cchunc: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_SzFindCh(lpsz: Long, ch: Short): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_SzFindLastCh(lpsz: Long, ch: Short): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_SzFindSz(lpsz: Long, lpszkey: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_UFromSz(lpsz: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_UlAddRef(lpunk: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_UlPropSize(lpspropvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_UlRelease(lpunk: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_WrapCompressedRTFStream(lpcompressedrtfstream: Long, ulflags: Int, lpuncompressedrtfstream: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_addressbook_WrapStoreEntryID(ulflags: Int, lpszdllname: Long, cborigentry: Int, lporigentry: Long, lpcbwrappedentry: Long, lppwrappedentry: Long): Int
}

public actual fun BuildDisplayTable(lpallocatebuffer: LPALLOCATEBUFFER, lpallocatemore: LPALLOCATEMORE, lpfreebuffer: LPFREEBUFFER, lpmalloc: Long, hinstance: HINSTANCE, cpages: UInt, lppage: Long, ulflags: UInt, lpptable: Long, lpptbldata: Long): HRESULT =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_BuildDisplayTable(lpallocatebuffer.toLong(), lpallocatemore.toLong(), lpfreebuffer.toLong(), lpmalloc, hinstance, cpages.toInt(), lppage, ulflags.toInt(), lpptable, lpptbldata)

public actual fun ChangeIdleRoutine(ftg: Long, lpfnidle: PFNIDLE, lpvidleparam: Long, priidle: Short, csecidle: UInt, iroidle: UShort, ircidle: UShort) {
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_ChangeIdleRoutine(ftg, lpfnidle.toLong(), lpvidleparam, priidle, csecidle.toInt(), iroidle.toShort(), ircidle.toShort())
}

public actual fun CreateIProp(lpinterface: Long, lpallocatebuffer: LPALLOCATEBUFFER, lpallocatemore: LPALLOCATEMORE, lpfreebuffer: LPFREEBUFFER, lpvreserved: Long, lpppropdata: Long): Int =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_CreateIProp(lpinterface, lpallocatebuffer.toLong(), lpallocatemore.toLong(), lpfreebuffer.toLong(), lpvreserved, lpppropdata)

public actual fun CreateTable(lpinterface: Long, lpallocatebuffer: LPALLOCATEBUFFER, lpallocatemore: LPALLOCATEMORE, lpfreebuffer: LPFREEBUFFER, lpvreserved: Long, ultabletype: UInt, ulproptagindexcolumn: UInt, lpsproptagarraycolumns: Long, lpptabledata: Long): Int =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_CreateTable(lpinterface, lpallocatebuffer.toLong(), lpallocatemore.toLong(), lpfreebuffer.toLong(), lpvreserved, ultabletype.toInt(), ulproptagindexcolumn.toInt(), lpsproptagarraycolumns, lpptabledata)

public actual fun DeinitMapiUtil() {
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_DeinitMapiUtil()
}

public actual fun DeregisterIdleRoutine(ftg: Long) {
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_DeregisterIdleRoutine(ftg)
}

public actual fun EnableIdleRoutine(ftg: Long, fenable: BOOL) {
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_EnableIdleRoutine(ftg, fenable)
}

public actual fun FEqualNames(lpname1: Long, lpname2: Long): BOOL =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_FEqualNames(lpname1, lpname2)

public actual fun FPropCompareProp(lpspropvalue1: Long, ulrelop: UInt, lpspropvalue2: Long): BOOL =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_FPropCompareProp(lpspropvalue1, ulrelop.toInt(), lpspropvalue2)

public actual fun FPropContainsProp(lpspropvaluedst: Long, lpspropvaluesrc: Long, ulfuzzylevel: UInt): BOOL =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_FPropContainsProp(lpspropvaluedst, lpspropvaluesrc, ulfuzzylevel.toInt())

public actual fun FPropExists(lpmapiprop: Long, ulproptag: UInt): BOOL =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_FPropExists(lpmapiprop, ulproptag.toInt())

public actual fun FreePadrlist(lpadrlist: Long) {
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_FreePadrlist(lpadrlist)
}

public actual fun FreeProws(lprows: Long) {
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_FreeProws(lprows)
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
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_FtgRegisterIdleRoutine(lpfnidle.toLong(), lpvidleparam, priidle, csecidle.toInt(), iroidle.toShort())

public actual fun HrAddColumns(lptbl: Long, lpproptagcolumnsnew: Long, lpallocatebuffer: LPALLOCATEBUFFER, lpfreebuffer: LPFREEBUFFER): HRESULT =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_HrAddColumns(lptbl, lpproptagcolumnsnew, lpallocatebuffer.toLong(), lpfreebuffer.toLong())

public actual fun HrAddColumnsEx(lptbl: Long, lpproptagcolumnsnew: Long, lpallocatebuffer: LPALLOCATEBUFFER, lpfreebuffer: LPFREEBUFFER, lpfnfiltercolumns: Long): HRESULT =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_HrAddColumnsEx(lptbl, lpproptagcolumnsnew, lpallocatebuffer.toLong(), lpfreebuffer.toLong(), lpfnfiltercolumns)

public actual fun HrAllocAdviseSink(lpfncallback: LPNOTIFCALLBACK, lpvcontext: Long, lppadvisesink: Long): HRESULT =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_HrAllocAdviseSink(lpfncallback.toLong(), lpvcontext, lppadvisesink)

public actual fun HrDispatchNotifications(ulflags: UInt): HRESULT =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_HrDispatchNotifications(ulflags.toInt())

public actual fun HrGetOneProp(lpmapiprop: Long, ulproptag: UInt, lppprop: Long): HRESULT =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_HrGetOneProp(lpmapiprop, ulproptag.toInt(), lppprop)

public actual fun HrIStorageFromStream(lpunkin: Long, lpinterface: Long, ulflags: UInt, lppstorageout: Long): HRESULT =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_HrIStorageFromStream(lpunkin, lpinterface, ulflags.toInt(), lppstorageout)

public actual fun HrQueryAllRows(lptable: Long, lpproptags: Long, lprestriction: Long, lpsortorderset: Long, crowsmax: Int, lpprows: Long): HRESULT =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_HrQueryAllRows(lptable, lpproptags, lprestriction, lpsortorderset, crowsmax, lpprows)

public actual fun HrSetOneProp(lpmapiprop: Long, lpprop: Long): HRESULT =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_HrSetOneProp(lpmapiprop, lpprop)

public actual fun HrThisThreadAdviseSink(lpadvisesink: Long, lppadvisesink: Long): HRESULT =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_HrThisThreadAdviseSink(lpadvisesink, lppadvisesink)

public actual fun LPropCompareProp(lpspropvaluea: Long, lpspropvalueb: Long): Int =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_LPropCompareProp(lpspropvaluea, lpspropvalueb)

public actual fun LpValFindProp(ulproptag: UInt, cvalues: UInt, lpproparray: Long): Long =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_LpValFindProp(ulproptag.toInt(), cvalues.toInt(), lpproparray)

public actual fun MAPIDeinitIdle() {
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_MAPIDeinitIdle()
}

public actual fun MAPIGetDefaultMalloc(): Long =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_MAPIGetDefaultMalloc()

public actual fun MAPIInitIdle(lpvreserved: Long): Int =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_MAPIInitIdle(lpvreserved)

public actual fun OpenStreamOnFile(lpallocatebuffer: LPALLOCATEBUFFER, lpfreebuffer: LPFREEBUFFER, ulflags: UInt, lpszfilename: Long, lpszprefix: Long, lppstream: Long): HRESULT =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_OpenStreamOnFile(lpallocatebuffer.toLong(), lpfreebuffer.toLong(), ulflags.toInt(), lpszfilename, lpszprefix, lppstream)

public actual fun PpropFindProp(lpproparray: Long, cvalues: UInt, ulproptag: UInt): Long =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_PpropFindProp(lpproparray, cvalues.toInt(), ulproptag.toInt())

public actual fun PropCopyMore(lpspropvaluedest: Long, lpspropvaluesrc: Long, lpfallocmore: LPALLOCATEMORE, lpvobject: Long): Int =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_PropCopyMore(lpspropvaluedest, lpspropvaluesrc, lpfallocmore.toLong(), lpvobject)

public actual fun RTFSync(lpmessage: Long, ulflags: UInt, lpfmessageupdated: Long): HRESULT =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_RTFSync(lpmessage, ulflags.toInt(), lpfmessageupdated)

public actual fun ScCopyNotifications(cnotification: Int, lpnotifications: Long, lpvdst: Long, lpcb: Long): Int =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_ScCopyNotifications(cnotification, lpnotifications, lpvdst, lpcb)

public actual fun ScCopyProps(cvalues: Int, lpproparray: Long, lpvdst: Long, lpcb: Long): Int =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_ScCopyProps(cvalues, lpproparray, lpvdst, lpcb)

public actual fun ScCountNotifications(cnotifications: Int, lpnotifications: Long, lpcb: Long): Int =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_ScCountNotifications(cnotifications, lpnotifications, lpcb)

public actual fun ScCountProps(cvalues: Int, lpproparray: Long, lpcb: Long): Int =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_ScCountProps(cvalues, lpproparray, lpcb)

public actual fun ScCreateConversationIndex(cbparent: UInt, lpbparent: Long, lpcbconvindex: Long, lppbconvindex: Long): Int =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_ScCreateConversationIndex(cbparent.toInt(), lpbparent, lpcbconvindex, lppbconvindex)

public actual fun ScDupPropset(cvalues: Int, lpproparray: Long, lpallocatebuffer: LPALLOCATEBUFFER, lppproparray: Long): Int =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_ScDupPropset(cvalues, lpproparray, lpallocatebuffer.toLong(), lppproparray)

public actual fun ScInitMapiUtil(ulflags: UInt): Int =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_ScInitMapiUtil(ulflags.toInt())

public actual fun ScLocalPathFromUNC(lpszunc: PCSTR, lpszlocal: PCSTR, cchlocal: UInt): Int =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_ScLocalPathFromUNC(lpszunc, lpszlocal, cchlocal.toInt())

public actual fun ScRelocNotifications(cnotification: Int, lpnotifications: Long, lpvbaseold: Long, lpvbasenew: Long, lpcb: Long): Int =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_ScRelocNotifications(cnotification, lpnotifications, lpvbaseold, lpvbasenew, lpcb)

public actual fun ScRelocProps(cvalues: Int, lpproparray: Long, lpvbaseold: Long, lpvbasenew: Long, lpcb: Long): Int =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_ScRelocProps(cvalues, lpproparray, lpvbaseold, lpvbasenew, lpcb)

public actual fun ScUNCFromLocalPath(lpszlocal: PCSTR, lpszunc: PCSTR, cchunc: UInt): Int =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_ScUNCFromLocalPath(lpszlocal, lpszunc, cchunc.toInt())

public actual fun SzFindCh(lpsz: Long, ch: UShort): Long =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_SzFindCh(lpsz, ch.toShort())

public actual fun SzFindLastCh(lpsz: Long, ch: UShort): Long =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_SzFindLastCh(lpsz, ch.toShort())

public actual fun SzFindSz(lpsz: Long, lpszkey: Long): Long =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_SzFindSz(lpsz, lpszkey)

public actual fun UFromSz(lpsz: Long): UInt =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_UFromSz(lpsz).toUInt()

public actual fun UlAddRef(lpunk: Long): UInt =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_UlAddRef(lpunk).toUInt()

public actual fun UlPropSize(lpspropvalue: Long): UInt =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_UlPropSize(lpspropvalue).toUInt()

public actual fun UlRelease(lpunk: Long): UInt =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_UlRelease(lpunk).toUInt()

public actual fun WrapCompressedRTFStream(lpcompressedrtfstream: Long, ulflags: UInt, lpuncompressedrtfstream: Long): HRESULT =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_WrapCompressedRTFStream(lpcompressedrtfstream, ulflags.toInt(), lpuncompressedrtfstream)

public actual fun WrapStoreEntryID(ulflags: UInt, lpszdllname: Long, cborigentry: UInt, lporigentry: Long, lpcbwrappedentry: Long, lppwrappedentry: Long): HRESULT =
    WindowsWin32SystemAddressbookJniBridge.windowssys_windows_win32_system_addressbook_WrapStoreEntryID(ulflags.toInt(), lpszdllname, cborigentry.toInt(), lporigentry, lpcbwrappedentry, lppwrappedentry)
