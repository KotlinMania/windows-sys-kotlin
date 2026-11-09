package io.github.kotlinmania.windowssys.windows.win32.system.addressbook

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.FILETIME
import io.github.kotlinmania.windowssys.windows.win32.foundation.HINSTANCE

public expect fun BuildDisplayTable(lpallocatebuffer: LPALLOCATEBUFFER, lpallocatemore: LPALLOCATEMORE, lpfreebuffer: LPFREEBUFFER, lpmalloc: Long, hinstance: HINSTANCE, cpages: UInt, lppage: Long, ulflags: UInt, lpptable: Long, lpptbldata: Long): HRESULT

public expect fun ChangeIdleRoutine(ftg: Long, lpfnidle: PFNIDLE, lpvidleparam: Long, priidle: Short, csecidle: UInt, iroidle: UShort, ircidle: UShort)

public expect fun CreateIProp(lpinterface: Long, lpallocatebuffer: LPALLOCATEBUFFER, lpallocatemore: LPALLOCATEMORE, lpfreebuffer: LPFREEBUFFER, lpvreserved: Long, lpppropdata: Long): Int

public expect fun CreateTable(lpinterface: Long, lpallocatebuffer: LPALLOCATEBUFFER, lpallocatemore: LPALLOCATEMORE, lpfreebuffer: LPFREEBUFFER, lpvreserved: Long, ultabletype: UInt, ulproptagindexcolumn: UInt, lpsproptagarraycolumns: Long, lpptabledata: Long): Int

public expect fun DeinitMapiUtil()

public expect fun DeregisterIdleRoutine(ftg: Long)

public expect fun EnableIdleRoutine(ftg: Long, fenable: BOOL)

public expect fun FEqualNames(lpname1: Long, lpname2: Long): BOOL

public expect fun FPropCompareProp(lpspropvalue1: Long, ulrelop: UInt, lpspropvalue2: Long): BOOL

public expect fun FPropContainsProp(lpspropvaluedst: Long, lpspropvaluesrc: Long, ulfuzzylevel: UInt): BOOL

public expect fun FPropExists(lpmapiprop: Long, ulproptag: UInt): BOOL

public expect fun FreePadrlist(lpadrlist: Long)

public expect fun FreeProws(lprows: Long)

public expect fun FtAddFt(ftaddend1: FILETIME, ftaddend2: FILETIME): FILETIME

public expect fun FtMulDw(ftmultiplier: UInt, ftmultiplicand: FILETIME): FILETIME

public expect fun FtMulDwDw(ftmultiplicand: UInt, ftmultiplier: UInt): FILETIME

public expect fun FtNegFt(ft: FILETIME): FILETIME

public expect fun FtSubFt(ftminuend: FILETIME, ftsubtrahend: FILETIME): FILETIME

public expect fun FtgRegisterIdleRoutine(lpfnidle: PFNIDLE, lpvidleparam: Long, priidle: Short, csecidle: UInt, iroidle: UShort): Long

public expect fun HrAddColumns(lptbl: Long, lpproptagcolumnsnew: Long, lpallocatebuffer: LPALLOCATEBUFFER, lpfreebuffer: LPFREEBUFFER): HRESULT

public expect fun HrAddColumnsEx(lptbl: Long, lpproptagcolumnsnew: Long, lpallocatebuffer: LPALLOCATEBUFFER, lpfreebuffer: LPFREEBUFFER, lpfnfiltercolumns: Long): HRESULT

public expect fun HrAllocAdviseSink(lpfncallback: LPNOTIFCALLBACK, lpvcontext: Long, lppadvisesink: Long): HRESULT

public expect fun HrDispatchNotifications(ulflags: UInt): HRESULT

public expect fun HrGetOneProp(lpmapiprop: Long, ulproptag: UInt, lppprop: Long): HRESULT

public expect fun HrIStorageFromStream(lpunkin: Long, lpinterface: Long, ulflags: UInt, lppstorageout: Long): HRESULT

public expect fun HrQueryAllRows(lptable: Long, lpproptags: Long, lprestriction: Long, lpsortorderset: Long, crowsmax: Int, lpprows: Long): HRESULT

public expect fun HrSetOneProp(lpmapiprop: Long, lpprop: Long): HRESULT

public expect fun HrThisThreadAdviseSink(lpadvisesink: Long, lppadvisesink: Long): HRESULT

public expect fun LPropCompareProp(lpspropvaluea: Long, lpspropvalueb: Long): Int

public expect fun LpValFindProp(ulproptag: UInt, cvalues: UInt, lpproparray: Long): Long

public expect fun MAPIDeinitIdle()

public expect fun MAPIGetDefaultMalloc(): Long

public expect fun MAPIInitIdle(lpvreserved: Long): Int

public expect fun OpenStreamOnFile(lpallocatebuffer: LPALLOCATEBUFFER, lpfreebuffer: LPFREEBUFFER, ulflags: UInt, lpszfilename: Long, lpszprefix: Long, lppstream: Long): HRESULT

public expect fun PpropFindProp(lpproparray: Long, cvalues: UInt, ulproptag: UInt): Long

public expect fun PropCopyMore(lpspropvaluedest: Long, lpspropvaluesrc: Long, lpfallocmore: LPALLOCATEMORE, lpvobject: Long): Int

public expect fun RTFSync(lpmessage: Long, ulflags: UInt, lpfmessageupdated: Long): HRESULT

public expect fun ScCopyNotifications(cnotification: Int, lpnotifications: Long, lpvdst: Long, lpcb: Long): Int

public expect fun ScCopyProps(cvalues: Int, lpproparray: Long, lpvdst: Long, lpcb: Long): Int

public expect fun ScCountNotifications(cnotifications: Int, lpnotifications: Long, lpcb: Long): Int

public expect fun ScCountProps(cvalues: Int, lpproparray: Long, lpcb: Long): Int

public expect fun ScCreateConversationIndex(cbparent: UInt, lpbparent: Long, lpcbconvindex: Long, lppbconvindex: Long): Int

public expect fun ScDupPropset(cvalues: Int, lpproparray: Long, lpallocatebuffer: LPALLOCATEBUFFER, lppproparray: Long): Int

public expect fun ScInitMapiUtil(ulflags: UInt): Int

public expect fun ScLocalPathFromUNC(lpszunc: PCSTR, lpszlocal: PCSTR, cchlocal: UInt): Int

public expect fun ScRelocNotifications(cnotification: Int, lpnotifications: Long, lpvbaseold: Long, lpvbasenew: Long, lpcb: Long): Int

public expect fun ScRelocProps(cvalues: Int, lpproparray: Long, lpvbaseold: Long, lpvbasenew: Long, lpcb: Long): Int

public expect fun ScUNCFromLocalPath(lpszlocal: PCSTR, lpszunc: PCSTR, cchunc: UInt): Int

public expect fun SzFindCh(lpsz: Long, ch: UShort): Long

public expect fun SzFindLastCh(lpsz: Long, ch: UShort): Long

public expect fun SzFindSz(lpsz: Long, lpszkey: Long): Long

public expect fun UFromSz(lpsz: Long): UInt

public expect fun UlAddRef(lpunk: Long): UInt

public expect fun UlPropSize(lpspropvalue: Long): UInt

public expect fun UlRelease(lpunk: Long): UInt

public expect fun WrapCompressedRTFStream(lpcompressedrtfstream: Long, ulflags: UInt, lpuncompressedrtfstream: Long): HRESULT

public expect fun WrapStoreEntryID(ulflags: UInt, lpszdllname: Long, cborigentry: UInt, lporigentry: Long, lpcbwrappedentry: Long, lppwrappedentry: Long): HRESULT
