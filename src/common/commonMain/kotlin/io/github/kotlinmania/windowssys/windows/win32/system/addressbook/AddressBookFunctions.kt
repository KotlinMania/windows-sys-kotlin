package io.github.kotlinmania.windowssys.windows.win32.system.addressbook

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance

public expect fun buildDisplayTable(lpallocatebuffer: Lpallocatebuffer, lpallocatemore: Lpallocatemore, lpfreebuffer: Lpfreebuffer, lpmalloc: COpaquePointer?, hinstance: Hinstance, cpages: UInt, lppage: COpaquePointer?, ulflags: UInt, lpptable: COpaquePointer?, lpptbldata: COpaquePointer?): Hresult

public expect fun changeIdleRoutine(ftg: COpaquePointer?, lpfnidle: Pfnidle, lpvidleparam: COpaquePointer?, priidle: Short, csecidle: UInt, iroidle: UShort, ircidle: UShort)

public expect fun createIProp(lpinterface: COpaquePointer?, lpallocatebuffer: Lpallocatebuffer, lpallocatemore: Lpallocatemore, lpfreebuffer: Lpfreebuffer, lpvreserved: COpaquePointer?, lpppropdata: COpaquePointer?): Int

public expect fun createTable(lpinterface: COpaquePointer?, lpallocatebuffer: Lpallocatebuffer, lpallocatemore: Lpallocatemore, lpfreebuffer: Lpfreebuffer, lpvreserved: COpaquePointer?, ultabletype: UInt, ulproptagindexcolumn: UInt, lpsproptagarraycolumns: COpaquePointer?, lpptabledata: COpaquePointer?): Int

public expect fun deinitMapiUtil()

public expect fun deregisterIdleRoutine(ftg: COpaquePointer?)

public expect fun enableIdleRoutine(ftg: COpaquePointer?, fenable: Bool)

public expect fun fEqualNames(lpname1: COpaquePointer?, lpname2: COpaquePointer?): Bool

public expect fun fPropCompareProp(lpspropvalue1: COpaquePointer?, ulrelop: UInt, lpspropvalue2: COpaquePointer?): Bool

public expect fun fPropContainsProp(lpspropvaluedst: COpaquePointer?, lpspropvaluesrc: COpaquePointer?, ulfuzzylevel: UInt): Bool

public expect fun fPropExists(lpmapiprop: COpaquePointer?, ulproptag: UInt): Bool

public expect fun freePadrlist(lpadrlist: COpaquePointer?)

public expect fun freeProws(lprows: COpaquePointer?)

public expect fun ftAddFt(ftaddend1: Filetime, ftaddend2: Filetime): Filetime

public expect fun ftMulDw(ftmultiplier: UInt, ftmultiplicand: Filetime): Filetime

public expect fun ftMulDwDw(ftmultiplicand: UInt, ftmultiplier: UInt): Filetime

public expect fun ftNegFt(ft: Filetime): Filetime

public expect fun ftSubFt(ftminuend: Filetime, ftsubtrahend: Filetime): Filetime

public expect fun ftgRegisterIdleRoutine(lpfnidle: Pfnidle, lpvidleparam: COpaquePointer?, priidle: Short, csecidle: UInt, iroidle: UShort): COpaquePointer?

public expect fun hrAddColumns(lptbl: COpaquePointer?, lpproptagcolumnsnew: COpaquePointer?, lpallocatebuffer: Lpallocatebuffer, lpfreebuffer: Lpfreebuffer): Hresult

public expect fun hrAddColumnsEx(lptbl: COpaquePointer?, lpproptagcolumnsnew: COpaquePointer?, lpallocatebuffer: Lpallocatebuffer, lpfreebuffer: Lpfreebuffer, lpfnfiltercolumns: Long): Hresult

public expect fun hrAllocAdviseSink(lpfncallback: Lpnotifcallback, lpvcontext: COpaquePointer?, lppadvisesink: COpaquePointer?): Hresult

public expect fun hrDispatchNotifications(ulflags: UInt): Hresult

public expect fun hrGetOneProp(lpmapiprop: COpaquePointer?, ulproptag: UInt, lppprop: COpaquePointer?): Hresult

public expect fun hrIStorageFromStream(lpunkin: COpaquePointer?, lpinterface: COpaquePointer?, ulflags: UInt, lppstorageout: COpaquePointer?): Hresult

public expect fun hrQueryAllRows(lptable: COpaquePointer?, lpproptags: COpaquePointer?, lprestriction: COpaquePointer?, lpsortorderset: COpaquePointer?, crowsmax: Int, lpprows: COpaquePointer?): Hresult

public expect fun hrSetOneProp(lpmapiprop: COpaquePointer?, lpprop: COpaquePointer?): Hresult

public expect fun hrThisThreadAdviseSink(lpadvisesink: COpaquePointer?, lppadvisesink: COpaquePointer?): Hresult

public expect fun lPropCompareProp(lpspropvaluea: COpaquePointer?, lpspropvalueb: COpaquePointer?): Int

public expect fun lpValFindProp(ulproptag: UInt, cvalues: UInt, lpproparray: COpaquePointer?): COpaquePointer?

public expect fun mAPIDeinitIdle()

public expect fun mAPIGetDefaultMalloc(): COpaquePointer?

public expect fun mAPIInitIdle(lpvreserved: COpaquePointer?): Int

public expect fun openStreamOnFile(lpallocatebuffer: Lpallocatebuffer, lpfreebuffer: Lpfreebuffer, ulflags: UInt, lpszfilename: COpaquePointer?, lpszprefix: COpaquePointer?, lppstream: COpaquePointer?): Hresult

public expect fun ppropFindProp(lpproparray: COpaquePointer?, cvalues: UInt, ulproptag: UInt): COpaquePointer?

public expect fun propCopyMore(lpspropvaluedest: COpaquePointer?, lpspropvaluesrc: COpaquePointer?, lpfallocmore: Lpallocatemore, lpvobject: COpaquePointer?): Int

public expect fun rTFSync(lpmessage: COpaquePointer?, ulflags: UInt, lpfmessageupdated: COpaquePointer?): Hresult

public expect fun scCopyNotifications(cnotification: Int, lpnotifications: COpaquePointer?, lpvdst: COpaquePointer?, lpcb: COpaquePointer?): Int

public expect fun scCopyProps(cvalues: Int, lpproparray: COpaquePointer?, lpvdst: COpaquePointer?, lpcb: COpaquePointer?): Int

public expect fun scCountNotifications(cnotifications: Int, lpnotifications: COpaquePointer?, lpcb: COpaquePointer?): Int

public expect fun scCountProps(cvalues: Int, lpproparray: COpaquePointer?, lpcb: COpaquePointer?): Int

public expect fun scCreateConversationIndex(cbparent: UInt, lpbparent: COpaquePointer?, lpcbconvindex: COpaquePointer?, lppbconvindex: COpaquePointer?): Int

public expect fun scDupPropset(cvalues: Int, lpproparray: COpaquePointer?, lpallocatebuffer: Lpallocatebuffer, lppproparray: COpaquePointer?): Int

public expect fun scInitMapiUtil(ulflags: UInt): Int

public expect fun scLocalPathFromUNC(lpszunc: Pcstr, lpszlocal: Pcstr, cchlocal: UInt): Int

public expect fun scRelocNotifications(cnotification: Int, lpnotifications: COpaquePointer?, lpvbaseold: COpaquePointer?, lpvbasenew: COpaquePointer?, lpcb: COpaquePointer?): Int

public expect fun scRelocProps(cvalues: Int, lpproparray: COpaquePointer?, lpvbaseold: COpaquePointer?, lpvbasenew: COpaquePointer?, lpcb: COpaquePointer?): Int

public expect fun scUNCFromLocalPath(lpszlocal: Pcstr, lpszunc: Pcstr, cchunc: UInt): Int

public expect fun szFindCh(lpsz: COpaquePointer?, ch: UShort): COpaquePointer?

public expect fun szFindLastCh(lpsz: COpaquePointer?, ch: UShort): COpaquePointer?

public expect fun szFindSz(lpsz: COpaquePointer?, lpszkey: COpaquePointer?): COpaquePointer?

public expect fun uFromSz(lpsz: COpaquePointer?): UInt

public expect fun ulAddRef(lpunk: COpaquePointer?): UInt

public expect fun ulPropSize(lpspropvalue: COpaquePointer?): UInt

public expect fun ulRelease(lpunk: COpaquePointer?): UInt

public expect fun wrapCompressedRTFStream(lpcompressedrtfstream: COpaquePointer?, ulflags: UInt, lpuncompressedrtfstream: COpaquePointer?): Hresult

public expect fun wrapStoreEntryID(ulflags: UInt, lpszdllname: COpaquePointer?, cborigentry: UInt, lporigentry: COpaquePointer?, lpcbwrappedentry: COpaquePointer?, lppwrappedentry: COpaquePointer?): Hresult
