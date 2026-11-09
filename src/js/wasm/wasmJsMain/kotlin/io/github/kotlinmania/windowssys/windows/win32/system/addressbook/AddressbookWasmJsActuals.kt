@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.addressbook

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.FILETIME
import io.github.kotlinmania.windowssys.windows.win32.foundation.HINSTANCE

public actual fun BuildDisplayTable(lpallocatebuffer: LPALLOCATEBUFFER, lpallocatemore: LPALLOCATEMORE, lpfreebuffer: LPFREEBUFFER, lpmalloc: Long, hinstance: HINSTANCE, cpages: UInt, lppage: Long, ulflags: UInt, lpptable: Long, lpptbldata: Long): HRESULT =
    0

public actual fun ChangeIdleRoutine(ftg: Long, lpfnidle: PFNIDLE, lpvidleparam: Long, priidle: Short, csecidle: UInt, iroidle: UShort, ircidle: UShort) {
}

public actual fun CreateIProp(lpinterface: Long, lpallocatebuffer: LPALLOCATEBUFFER, lpallocatemore: LPALLOCATEMORE, lpfreebuffer: LPFREEBUFFER, lpvreserved: Long, lpppropdata: Long): Int =
    0

public actual fun CreateTable(lpinterface: Long, lpallocatebuffer: LPALLOCATEBUFFER, lpallocatemore: LPALLOCATEMORE, lpfreebuffer: LPFREEBUFFER, lpvreserved: Long, ultabletype: UInt, ulproptagindexcolumn: UInt, lpsproptagarraycolumns: Long, lpptabledata: Long): Int =
    0

public actual fun DeinitMapiUtil() {
}

public actual fun DeregisterIdleRoutine(ftg: Long) {
}

public actual fun EnableIdleRoutine(ftg: Long, fenable: BOOL) {
}

public actual fun FEqualNames(lpname1: Long, lpname2: Long): BOOL =
    0

public actual fun FPropCompareProp(lpspropvalue1: Long, ulrelop: UInt, lpspropvalue2: Long): BOOL =
    0

public actual fun FPropContainsProp(lpspropvaluedst: Long, lpspropvaluesrc: Long, ulfuzzylevel: UInt): BOOL =
    0

public actual fun FPropExists(lpmapiprop: Long, ulproptag: UInt): BOOL =
    0

public actual fun FreePadrlist(lpadrlist: Long) {
}

public actual fun FreeProws(lprows: Long) {
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
    0L

public actual fun HrAddColumns(lptbl: Long, lpproptagcolumnsnew: Long, lpallocatebuffer: LPALLOCATEBUFFER, lpfreebuffer: LPFREEBUFFER): HRESULT =
    0

public actual fun HrAddColumnsEx(lptbl: Long, lpproptagcolumnsnew: Long, lpallocatebuffer: LPALLOCATEBUFFER, lpfreebuffer: LPFREEBUFFER, lpfnfiltercolumns: Long): HRESULT =
    0

public actual fun HrAllocAdviseSink(lpfncallback: LPNOTIFCALLBACK, lpvcontext: Long, lppadvisesink: Long): HRESULT =
    0

public actual fun HrDispatchNotifications(ulflags: UInt): HRESULT =
    0

public actual fun HrGetOneProp(lpmapiprop: Long, ulproptag: UInt, lppprop: Long): HRESULT =
    0

public actual fun HrIStorageFromStream(lpunkin: Long, lpinterface: Long, ulflags: UInt, lppstorageout: Long): HRESULT =
    0

public actual fun HrQueryAllRows(lptable: Long, lpproptags: Long, lprestriction: Long, lpsortorderset: Long, crowsmax: Int, lpprows: Long): HRESULT =
    0

public actual fun HrSetOneProp(lpmapiprop: Long, lpprop: Long): HRESULT =
    0

public actual fun HrThisThreadAdviseSink(lpadvisesink: Long, lppadvisesink: Long): HRESULT =
    0

public actual fun LPropCompareProp(lpspropvaluea: Long, lpspropvalueb: Long): Int =
    0

public actual fun LpValFindProp(ulproptag: UInt, cvalues: UInt, lpproparray: Long): Long =
    0L

public actual fun MAPIDeinitIdle() {
}

public actual fun MAPIGetDefaultMalloc(): Long =
    0L

public actual fun MAPIInitIdle(lpvreserved: Long): Int =
    0

public actual fun OpenStreamOnFile(lpallocatebuffer: LPALLOCATEBUFFER, lpfreebuffer: LPFREEBUFFER, ulflags: UInt, lpszfilename: Long, lpszprefix: Long, lppstream: Long): HRESULT =
    0

public actual fun PpropFindProp(lpproparray: Long, cvalues: UInt, ulproptag: UInt): Long =
    0L

public actual fun PropCopyMore(lpspropvaluedest: Long, lpspropvaluesrc: Long, lpfallocmore: LPALLOCATEMORE, lpvobject: Long): Int =
    0

public actual fun RTFSync(lpmessage: Long, ulflags: UInt, lpfmessageupdated: Long): HRESULT =
    0

public actual fun ScCopyNotifications(cnotification: Int, lpnotifications: Long, lpvdst: Long, lpcb: Long): Int =
    0

public actual fun ScCopyProps(cvalues: Int, lpproparray: Long, lpvdst: Long, lpcb: Long): Int =
    0

public actual fun ScCountNotifications(cnotifications: Int, lpnotifications: Long, lpcb: Long): Int =
    0

public actual fun ScCountProps(cvalues: Int, lpproparray: Long, lpcb: Long): Int =
    0

public actual fun ScCreateConversationIndex(cbparent: UInt, lpbparent: Long, lpcbconvindex: Long, lppbconvindex: Long): Int =
    0

public actual fun ScDupPropset(cvalues: Int, lpproparray: Long, lpallocatebuffer: LPALLOCATEBUFFER, lppproparray: Long): Int =
    0

public actual fun ScInitMapiUtil(ulflags: UInt): Int =
    0

public actual fun ScLocalPathFromUNC(lpszunc: PCSTR, lpszlocal: PCSTR, cchlocal: UInt): Int =
    0

public actual fun ScRelocNotifications(cnotification: Int, lpnotifications: Long, lpvbaseold: Long, lpvbasenew: Long, lpcb: Long): Int =
    0

public actual fun ScRelocProps(cvalues: Int, lpproparray: Long, lpvbaseold: Long, lpvbasenew: Long, lpcb: Long): Int =
    0

public actual fun ScUNCFromLocalPath(lpszlocal: PCSTR, lpszunc: PCSTR, cchunc: UInt): Int =
    0

public actual fun SzFindCh(lpsz: Long, ch: UShort): Long =
    0L

public actual fun SzFindLastCh(lpsz: Long, ch: UShort): Long =
    0L

public actual fun SzFindSz(lpsz: Long, lpszkey: Long): Long =
    0L

public actual fun UFromSz(lpsz: Long): UInt =
    0u

public actual fun UlAddRef(lpunk: Long): UInt =
    0u

public actual fun UlPropSize(lpspropvalue: Long): UInt =
    0u

public actual fun UlRelease(lpunk: Long): UInt =
    0u

public actual fun WrapCompressedRTFStream(lpcompressedrtfstream: Long, ulflags: UInt, lpuncompressedrtfstream: Long): HRESULT =
    0

public actual fun WrapStoreEntryID(ulflags: UInt, lpszdllname: Long, cborigentry: UInt, lporigentry: Long, lpcbwrappedentry: Long, lppwrappedentry: Long): HRESULT =
    0
